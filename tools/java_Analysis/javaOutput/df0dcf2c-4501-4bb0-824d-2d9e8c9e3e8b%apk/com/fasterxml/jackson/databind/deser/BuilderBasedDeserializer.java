package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Map;

public class BuilderBasedDeserializer extends BeanDeserializerBase
{
  private static final long serialVersionUID = 1L;
  protected final AnnotatedMethod _buildMethod;

  public BuilderBasedDeserializer(BeanDeserializerBuilder paramBeanDeserializerBuilder, BeanDescription paramBeanDescription, BeanPropertyMap paramBeanPropertyMap, Map<String, SettableBeanProperty> paramMap, HashSet<String> paramHashSet, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramBeanDeserializerBuilder, paramBeanDescription, paramBeanPropertyMap, paramMap, paramHashSet, paramBoolean1, paramBoolean2);
    this._buildMethod = paramBeanDeserializerBuilder.getBuildMethod();
    if (this._objectIdReader != null)
      throw new IllegalArgumentException("Can not use Object Id with Builder-based deserialization (type " + paramBeanDescription.getType() + ")");
  }

  public BuilderBasedDeserializer(BuilderBasedDeserializer paramBuilderBasedDeserializer, ObjectIdReader paramObjectIdReader)
  {
    super(paramBuilderBasedDeserializer, paramObjectIdReader);
    this._buildMethod = paramBuilderBasedDeserializer._buildMethod;
  }

  protected BuilderBasedDeserializer(BuilderBasedDeserializer paramBuilderBasedDeserializer, NameTransformer paramNameTransformer)
  {
    super(paramBuilderBasedDeserializer, paramNameTransformer);
    this._buildMethod = paramBuilderBasedDeserializer._buildMethod;
  }

  public BuilderBasedDeserializer(BuilderBasedDeserializer paramBuilderBasedDeserializer, HashSet<String> paramHashSet)
  {
    super(paramBuilderBasedDeserializer, paramHashSet);
    this._buildMethod = paramBuilderBasedDeserializer._buildMethod;
  }

  private final void _vanillaDeserializeHandleUnknown(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject, String paramString)
  {
    if ((this._ignorableProps != null) && (this._ignorableProps.contains(paramString)))
    {
      paramJsonParser.skipChildren();
      return;
    }
    if (this._anySetter != null)
      try
      {
        this._anySetter.deserializeAndSet(paramJsonParser, paramDeserializationContext, paramObject, paramString);
        return;
      }
      catch (Exception localException)
      {
        wrapAndThrow(localException, paramObject, paramString, paramDeserializationContext);
        return;
      }
    handleUnknownProperty(paramJsonParser, paramDeserializationContext, paramObject, paramString);
  }

  private final Object vanillaDeserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, JsonToken paramJsonToken)
  {
    Object localObject1 = this._valueInstantiator.createUsingDefault(paramDeserializationContext);
    String str;
    while (true)
    {
      if (paramJsonParser.getCurrentToken() == JsonToken.END_OBJECT)
        break label99;
      str = paramJsonParser.getCurrentName();
      paramJsonParser.nextToken();
      SettableBeanProperty localSettableBeanProperty = this._beanProperties.find(str);
      if (localSettableBeanProperty != null)
        try
        {
          Object localObject2 = localSettableBeanProperty.deserializeSetAndReturn(paramJsonParser, paramDeserializationContext, localObject1);
          localObject1 = localObject2;
          paramJsonParser.nextToken();
        }
        catch (Exception localException)
        {
          while (true)
            wrapAndThrow(localException, localObject1, str, paramDeserializationContext);
        }
    }
    while (true)
      _vanillaDeserializeHandleUnknown(paramJsonParser, paramDeserializationContext, localObject1, str);
    label99: return localObject1;
  }

  protected final Object _deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject)
  {
    if (this._injectables != null)
      injectValues(paramDeserializationContext, paramObject);
    if (this._unwrappedPropertyHandler != null)
    {
      paramObject = deserializeWithUnwrapped(paramJsonParser, paramDeserializationContext, paramObject);
      return paramObject;
    }
    if (this._externalTypeIdHandler != null)
      return deserializeWithExternalTypeId(paramJsonParser, paramDeserializationContext, paramObject);
    if (this._needViewProcesing)
    {
      Class localClass = paramDeserializationContext.getActiveView();
      if (localClass != null)
        return deserializeWithView(paramJsonParser, paramDeserializationContext, paramObject, localClass);
    }
    JsonToken localJsonToken = paramJsonParser.getCurrentToken();
    if (localJsonToken == JsonToken.START_OBJECT)
      localJsonToken = paramJsonParser.nextToken();
    String str;
    while (localJsonToken == JsonToken.FIELD_NAME)
    {
      str = paramJsonParser.getCurrentName();
      paramJsonParser.nextToken();
      SettableBeanProperty localSettableBeanProperty = this._beanProperties.find(str);
      if (localSettableBeanProperty != null)
        try
        {
          Object localObject = localSettableBeanProperty.deserializeSetAndReturn(paramJsonParser, paramDeserializationContext, paramObject);
          paramObject = localObject;
          localJsonToken = paramJsonParser.nextToken();
        }
        catch (Exception localException)
        {
          while (true)
            wrapAndThrow(localException, paramObject, str, paramDeserializationContext);
        }
    }
    while (true)
      if ((this._ignorableProps != null) && (this._ignorableProps.contains(str)))
        paramJsonParser.skipChildren();
      else if (this._anySetter != null)
        this._anySetter.deserializeAndSet(paramJsonParser, paramDeserializationContext, paramObject, str);
      else
        handleUnknownProperty(paramJsonParser, paramDeserializationContext, paramObject, str);
  }

  protected final Object _deserializeUsingPropertyBased(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    PropertyBasedCreator localPropertyBasedCreator = this._propertyBasedCreator;
    PropertyValueBuffer localPropertyValueBuffer = localPropertyBasedCreator.startBuilding(paramJsonParser, paramDeserializationContext, this._objectIdReader);
    JsonToken localJsonToken = paramJsonParser.getCurrentToken();
    TokenBuffer localTokenBuffer = null;
    String str;
    Object localObject3;
    while (true)
      if (localJsonToken == JsonToken.FIELD_NAME)
      {
        str = paramJsonParser.getCurrentName();
        paramJsonParser.nextToken();
        SettableBeanProperty localSettableBeanProperty1 = localPropertyBasedCreator.findCreatorProperty(str);
        if (localSettableBeanProperty1 != null)
        {
          Object localObject2 = localSettableBeanProperty1.deserialize(paramJsonParser, paramDeserializationContext);
          if (localPropertyValueBuffer.assignParameter(localSettableBeanProperty1.getCreatorIndex(), localObject2))
          {
            paramJsonParser.nextToken();
            try
            {
              localObject3 = localPropertyBasedCreator.build(paramDeserializationContext, localPropertyValueBuffer);
              if (localObject3.getClass() == this._beanType.getRawClass())
                break label149;
              return handlePolymorphic(paramJsonParser, paramDeserializationContext, localObject3, localTokenBuffer);
            }
            catch (Exception localException2)
            {
              wrapAndThrow(localException2, this._beanType.getRawClass(), str, paramDeserializationContext);
            }
          }
          else
          {
            localJsonToken = paramJsonParser.nextToken();
            continue;
          }
          label149: if (localTokenBuffer == null)
            break label372;
        }
      }
    label369: label372: for (Object localObject4 = handleUnknownProperties(paramDeserializationContext, localObject3, localTokenBuffer); ; localObject4 = localObject3)
    {
      return _deserialize(paramJsonParser, paramDeserializationContext, localObject4);
      if (localPropertyValueBuffer.readIdProperty(str))
        break;
      SettableBeanProperty localSettableBeanProperty2 = this._beanProperties.find(str);
      if (localSettableBeanProperty2 != null)
      {
        localPropertyValueBuffer.bufferProperty(localSettableBeanProperty2, localSettableBeanProperty2.deserialize(paramJsonParser, paramDeserializationContext));
        break;
      }
      if ((this._ignorableProps != null) && (this._ignorableProps.contains(str)))
      {
        paramJsonParser.skipChildren();
        break;
      }
      if (this._anySetter != null)
      {
        localPropertyValueBuffer.bufferAnyProperty(this._anySetter, str, this._anySetter.deserialize(paramJsonParser, paramDeserializationContext));
        break;
      }
      if (localTokenBuffer == null)
        localTokenBuffer = new TokenBuffer(paramJsonParser.getCodec());
      localTokenBuffer.writeFieldName(str);
      localTokenBuffer.copyCurrentStructure(paramJsonParser);
      break;
      Object localObject1;
      try
      {
        localObject1 = localPropertyBasedCreator.build(paramDeserializationContext, localPropertyValueBuffer);
        if (localTokenBuffer == null)
          break label369;
        if (localObject1.getClass() != this._beanType.getRawClass())
          return handlePolymorphic(null, paramDeserializationContext, localObject1, localTokenBuffer);
      }
      catch (Exception localException1)
      {
        wrapInstantiationProblem(localException1, paramDeserializationContext);
        return null;
      }
      return handleUnknownProperties(paramDeserializationContext, localObject1, localTokenBuffer);
      return localObject1;
    }
  }

  protected BeanAsArrayBuilderDeserializer asArrayDeserializer()
  {
    return new BeanAsArrayBuilderDeserializer(this, this._beanProperties.getPropertiesInInsertionOrder(), this._buildMethod);
  }

  public final Object deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    JsonToken localJsonToken1 = paramJsonParser.getCurrentToken();
    if (localJsonToken1 == JsonToken.START_OBJECT)
    {
      JsonToken localJsonToken2 = paramJsonParser.nextToken();
      if (this._vanillaProcessing)
        return finishBuild(paramDeserializationContext, vanillaDeserialize(paramJsonParser, paramDeserializationContext, localJsonToken2));
      return finishBuild(paramDeserializationContext, deserializeFromObject(paramJsonParser, paramDeserializationContext));
    }
    switch (BuilderBasedDeserializer.1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[localJsonToken1.ordinal()])
    {
    default:
      throw paramDeserializationContext.mappingException(getBeanClass());
    case 1:
      return finishBuild(paramDeserializationContext, deserializeFromString(paramJsonParser, paramDeserializationContext));
    case 2:
      return finishBuild(paramDeserializationContext, deserializeFromNumber(paramJsonParser, paramDeserializationContext));
    case 3:
      return finishBuild(paramDeserializationContext, deserializeFromDouble(paramJsonParser, paramDeserializationContext));
    case 4:
      return paramJsonParser.getEmbeddedObject();
    case 5:
    case 6:
      return finishBuild(paramDeserializationContext, deserializeFromBoolean(paramJsonParser, paramDeserializationContext));
    case 7:
      return finishBuild(paramDeserializationContext, deserializeFromArray(paramJsonParser, paramDeserializationContext));
    case 8:
    case 9:
    }
    return finishBuild(paramDeserializationContext, deserializeFromObject(paramJsonParser, paramDeserializationContext));
  }

  public Object deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject)
  {
    return finishBuild(paramDeserializationContext, _deserialize(paramJsonParser, paramDeserializationContext, paramObject));
  }

  public Object deserializeFromArray(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    if (this._delegateDeserializer != null)
      try
      {
        Object localObject = this._valueInstantiator.createUsingDelegate(paramDeserializationContext, this._delegateDeserializer.deserialize(paramJsonParser, paramDeserializationContext));
        if (this._injectables != null)
          injectValues(paramDeserializationContext, localObject);
        return localObject;
      }
      catch (Exception localException)
      {
        wrapInstantiationProblem(localException, paramDeserializationContext);
      }
    throw paramDeserializationContext.mappingException(getBeanClass());
  }

  public Object deserializeFromBoolean(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    if ((this._delegateDeserializer != null) && (!this._valueInstantiator.canCreateFromBoolean()))
    {
      Object localObject = this._valueInstantiator.createUsingDelegate(paramDeserializationContext, this._delegateDeserializer.deserialize(paramJsonParser, paramDeserializationContext));
      if (this._injectables != null)
        injectValues(paramDeserializationContext, localObject);
      return localObject;
    }
    if (paramJsonParser.getCurrentToken() == JsonToken.VALUE_TRUE);
    for (boolean bool = true; ; bool = false)
      return this._valueInstantiator.createFromBoolean(paramDeserializationContext, bool);
  }

  public Object deserializeFromDouble(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    Object localObject;
    switch (BuilderBasedDeserializer.1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[paramJsonParser.getNumberType().ordinal()])
    {
    default:
      if (this._delegateDeserializer != null)
        localObject = this._valueInstantiator.createUsingDelegate(paramDeserializationContext, this._delegateDeserializer.deserialize(paramJsonParser, paramDeserializationContext));
    case 3:
    case 4:
      do
      {
        return localObject;
        if ((this._delegateDeserializer == null) || (this._valueInstantiator.canCreateFromDouble()))
          break;
        localObject = this._valueInstantiator.createUsingDelegate(paramDeserializationContext, this._delegateDeserializer.deserialize(paramJsonParser, paramDeserializationContext));
      }
      while (this._injectables == null);
      injectValues(paramDeserializationContext, localObject);
      return localObject;
      return this._valueInstantiator.createFromDouble(paramDeserializationContext, paramJsonParser.getDoubleValue());
    }
    throw paramDeserializationContext.instantiationException(getBeanClass(), "no suitable creator method found to deserialize from JSON floating-point number");
  }

  public Object deserializeFromNumber(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    Object localObject;
    if (this._objectIdReader != null)
      localObject = deserializeFromObjectId(paramJsonParser, paramDeserializationContext);
    do
    {
      do
      {
        do
        {
          return localObject;
          switch (BuilderBasedDeserializer.1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[paramJsonParser.getNumberType().ordinal()])
          {
          default:
            if (this._delegateDeserializer == null)
              break label214;
            localObject = this._valueInstantiator.createUsingDelegate(paramDeserializationContext, this._delegateDeserializer.deserialize(paramJsonParser, paramDeserializationContext));
          case 1:
          case 2:
          }
        }
        while (this._injectables == null);
        injectValues(paramDeserializationContext, localObject);
        return localObject;
        if ((this._delegateDeserializer == null) || (this._valueInstantiator.canCreateFromInt()))
          break;
        localObject = this._valueInstantiator.createUsingDelegate(paramDeserializationContext, this._delegateDeserializer.deserialize(paramJsonParser, paramDeserializationContext));
      }
      while (this._injectables == null);
      injectValues(paramDeserializationContext, localObject);
      return localObject;
      return this._valueInstantiator.createFromInt(paramDeserializationContext, paramJsonParser.getIntValue());
      if ((this._delegateDeserializer == null) || (this._valueInstantiator.canCreateFromInt()))
        break;
      localObject = this._valueInstantiator.createUsingDelegate(paramDeserializationContext, this._delegateDeserializer.deserialize(paramJsonParser, paramDeserializationContext));
    }
    while (this._injectables == null);
    injectValues(paramDeserializationContext, localObject);
    return localObject;
    return this._valueInstantiator.createFromLong(paramDeserializationContext, paramJsonParser.getLongValue());
    label214: throw paramDeserializationContext.instantiationException(getBeanClass(), "no suitable creator method found to deserialize from JSON integer number");
  }

  // ERROR //
  public Object deserializeFromObject(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 416	com/fasterxml/jackson/databind/deser/BuilderBasedDeserializer:_nonStandardCreation	Z
    //   4: ifeq +40 -> 44
    //   7: aload_0
    //   8: getfield 162	com/fasterxml/jackson/databind/deser/BuilderBasedDeserializer:_unwrappedPropertyHandler	Lcom/fasterxml/jackson/databind/deser/impl/UnwrappedPropertyHandler;
    //   11: ifnull +12 -> 23
    //   14: aload_0
    //   15: aload_1
    //   16: aload_2
    //   17: invokevirtual 418	com/fasterxml/jackson/databind/deser/BuilderBasedDeserializer:deserializeWithUnwrapped	(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    //   20: astore_3
    //   21: aload_3
    //   22: areturn
    //   23: aload_0
    //   24: getfield 169	com/fasterxml/jackson/databind/deser/BuilderBasedDeserializer:_externalTypeIdHandler	Lcom/fasterxml/jackson/databind/deser/impl/ExternalTypeHandler;
    //   27: ifnull +10 -> 37
    //   30: aload_0
    //   31: aload_1
    //   32: aload_2
    //   33: invokevirtual 420	com/fasterxml/jackson/databind/deser/BuilderBasedDeserializer:deserializeWithExternalTypeId	(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    //   36: areturn
    //   37: aload_0
    //   38: aload_1
    //   39: aload_2
    //   40: invokevirtual 423	com/fasterxml/jackson/databind/deser/BuilderBasedDeserializer:deserializeFromObjectUsingNonDefault	(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    //   43: areturn
    //   44: aload_0
    //   45: getfield 109	com/fasterxml/jackson/databind/deser/BuilderBasedDeserializer:_valueInstantiator	Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;
    //   48: aload_2
    //   49: invokevirtual 115	com/fasterxml/jackson/databind/deser/ValueInstantiator:createUsingDefault	(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    //   52: astore_3
    //   53: aload_0
    //   54: getfield 154	com/fasterxml/jackson/databind/deser/BuilderBasedDeserializer:_injectables	[Lcom/fasterxml/jackson/databind/deser/impl/ValueInjector;
    //   57: ifnull +9 -> 66
    //   60: aload_0
    //   61: aload_2
    //   62: aload_3
    //   63: invokevirtual 158	com/fasterxml/jackson/databind/deser/BuilderBasedDeserializer:injectValues	(Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V
    //   66: aload_0
    //   67: getfield 176	com/fasterxml/jackson/databind/deser/BuilderBasedDeserializer:_needViewProcesing	Z
    //   70: ifeq +41 -> 111
    //   73: aload_2
    //   74: invokevirtual 182	com/fasterxml/jackson/databind/DeserializationContext:getActiveView	()Ljava/lang/Class;
    //   77: astore 12
    //   79: aload 12
    //   81: ifnull +30 -> 111
    //   84: aload_0
    //   85: aload_1
    //   86: aload_2
    //   87: aload_3
    //   88: aload 12
    //   90: invokevirtual 186	com/fasterxml/jackson/databind/deser/BuilderBasedDeserializer:deserializeWithView	(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   93: areturn
    //   94: astore 11
    //   96: aload_0
    //   97: aload 11
    //   99: aload_3
    //   100: aload 4
    //   102: aload_2
    //   103: invokevirtual 100	com/fasterxml/jackson/databind/deser/BuilderBasedDeserializer:wrapAndThrow	(Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)V
    //   106: aload_1
    //   107: invokevirtual 131	com/fasterxml/jackson/core/JsonParser:nextToken	()Lcom/fasterxml/jackson/core/JsonToken;
    //   110: pop
    //   111: aload_1
    //   112: invokevirtual 119	com/fasterxml/jackson/core/JsonParser:getCurrentToken	()Lcom/fasterxml/jackson/core/JsonToken;
    //   115: getstatic 125	com/fasterxml/jackson/core/JsonToken:END_OBJECT	Lcom/fasterxml/jackson/core/JsonToken;
    //   118: if_acmpeq -97 -> 21
    //   121: aload_1
    //   122: invokevirtual 128	com/fasterxml/jackson/core/JsonParser:getCurrentName	()Ljava/lang/String;
    //   125: astore 4
    //   127: aload_1
    //   128: invokevirtual 131	com/fasterxml/jackson/core/JsonParser:nextToken	()Lcom/fasterxml/jackson/core/JsonToken;
    //   131: pop
    //   132: aload_0
    //   133: getfield 135	com/fasterxml/jackson/databind/deser/BuilderBasedDeserializer:_beanProperties	Lcom/fasterxml/jackson/databind/deser/impl/BeanPropertyMap;
    //   136: aload 4
    //   138: invokevirtual 141	com/fasterxml/jackson/databind/deser/impl/BeanPropertyMap:find	(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
    //   141: astore 6
    //   143: aload 6
    //   145: ifnull +19 -> 164
    //   148: aload 6
    //   150: aload_1
    //   151: aload_2
    //   152: aload_3
    //   153: invokevirtual 147	com/fasterxml/jackson/databind/deser/SettableBeanProperty:deserializeSetAndReturn	(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;
    //   156: astore 10
    //   158: aload 10
    //   160: astore_3
    //   161: goto -55 -> 106
    //   164: aload_0
    //   165: getfield 75	com/fasterxml/jackson/databind/deser/BuilderBasedDeserializer:_ignorableProps	Ljava/util/HashSet;
    //   168: ifnull +23 -> 191
    //   171: aload_0
    //   172: getfield 75	com/fasterxml/jackson/databind/deser/BuilderBasedDeserializer:_ignorableProps	Ljava/util/HashSet;
    //   175: aload 4
    //   177: invokevirtual 81	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   180: ifeq +11 -> 191
    //   183: aload_1
    //   184: invokevirtual 87	com/fasterxml/jackson/core/JsonParser:skipChildren	()Lcom/fasterxml/jackson/core/JsonParser;
    //   187: pop
    //   188: goto -82 -> 106
    //   191: aload_0
    //   192: getfield 91	com/fasterxml/jackson/databind/deser/BuilderBasedDeserializer:_anySetter	Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;
    //   195: ifnull +33 -> 228
    //   198: aload_0
    //   199: getfield 91	com/fasterxml/jackson/databind/deser/BuilderBasedDeserializer:_anySetter	Lcom/fasterxml/jackson/databind/deser/SettableAnyProperty;
    //   202: aload_1
    //   203: aload_2
    //   204: aload_3
    //   205: aload 4
    //   207: invokevirtual 96	com/fasterxml/jackson/databind/deser/SettableAnyProperty:deserializeAndSet	(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/String;)V
    //   210: goto -104 -> 106
    //   213: astore 8
    //   215: aload_0
    //   216: aload 8
    //   218: aload_3
    //   219: aload 4
    //   221: aload_2
    //   222: invokevirtual 100	com/fasterxml/jackson/databind/deser/BuilderBasedDeserializer:wrapAndThrow	(Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)V
    //   225: goto -119 -> 106
    //   228: aload_0
    //   229: aload_1
    //   230: aload_2
    //   231: aload_3
    //   232: aload 4
    //   234: invokevirtual 103	com/fasterxml/jackson/databind/deser/BuilderBasedDeserializer:handleUnknownProperty	(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;Ljava/lang/String;)V
    //   237: goto -131 -> 106
    //
    // Exception table:
    //   from	to	target	type
    //   148	158	94	java/lang/Exception
    //   198	210	213	java/lang/Exception
  }

  protected Object deserializeFromObjectUsingNonDefault(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    if (this._delegateDeserializer != null)
      return this._valueInstantiator.createUsingDelegate(paramDeserializationContext, this._delegateDeserializer.deserialize(paramJsonParser, paramDeserializationContext));
    if (this._propertyBasedCreator != null)
      return _deserializeUsingPropertyBased(paramJsonParser, paramDeserializationContext);
    if (this._beanType.isAbstract())
      throw JsonMappingException.from(paramJsonParser, "Can not instantiate abstract type " + this._beanType + " (need to add/enable type information?)");
    throw JsonMappingException.from(paramJsonParser, "No suitable constructor found for type " + this._beanType + ": can not instantiate from JSON object (need to add/enable type information?)");
  }

  public Object deserializeFromString(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    Object localObject;
    if (this._objectIdReader != null)
      localObject = deserializeFromObjectId(paramJsonParser, paramDeserializationContext);
    do
    {
      return localObject;
      if ((this._delegateDeserializer == null) || (this._valueInstantiator.canCreateFromString()))
        break;
      localObject = this._valueInstantiator.createUsingDelegate(paramDeserializationContext, this._delegateDeserializer.deserialize(paramJsonParser, paramDeserializationContext));
    }
    while (this._injectables == null);
    injectValues(paramDeserializationContext, localObject);
    return localObject;
    return this._valueInstantiator.createFromString(paramDeserializationContext, paramJsonParser.getText());
  }

  protected Object deserializeUsingPropertyBasedWithExternalTypeId(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    throw new IllegalStateException("Deserialization with Builder, External type id, @JsonCreator not yet implemented");
  }

  protected Object deserializeUsingPropertyBasedWithUnwrapped(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    PropertyBasedCreator localPropertyBasedCreator = this._propertyBasedCreator;
    PropertyValueBuffer localPropertyValueBuffer = localPropertyBasedCreator.startBuilding(paramJsonParser, paramDeserializationContext, this._objectIdReader);
    TokenBuffer localTokenBuffer = new TokenBuffer(paramJsonParser.getCodec());
    localTokenBuffer.writeStartObject();
    JsonToken localJsonToken1 = paramJsonParser.getCurrentToken();
    if (localJsonToken1 == JsonToken.FIELD_NAME)
    {
      String str = paramJsonParser.getCurrentName();
      paramJsonParser.nextToken();
      SettableBeanProperty localSettableBeanProperty1 = localPropertyBasedCreator.findCreatorProperty(str);
      JsonToken localJsonToken2;
      Object localObject3;
      if (localSettableBeanProperty1 != null)
      {
        Object localObject2 = localSettableBeanProperty1.deserialize(paramJsonParser, paramDeserializationContext);
        if (localPropertyValueBuffer.assignParameter(localSettableBeanProperty1.getCreatorIndex(), localObject2))
        {
          localJsonToken2 = paramJsonParser.nextToken();
          try
          {
            localObject3 = localPropertyBasedCreator.build(paramDeserializationContext, localPropertyValueBuffer);
            while (localJsonToken2 == JsonToken.FIELD_NAME)
            {
              paramJsonParser.nextToken();
              localTokenBuffer.copyCurrentStructure(paramJsonParser);
              localJsonToken2 = paramJsonParser.nextToken();
            }
          }
          catch (Exception localException2)
          {
            wrapAndThrow(localException2, this._beanType.getRawClass(), str, paramDeserializationContext);
          }
        }
      }
      while (true)
      {
        localJsonToken1 = paramJsonParser.nextToken();
        break;
        localTokenBuffer.writeEndObject();
        if (localObject3.getClass() != this._beanType.getRawClass())
          throw paramDeserializationContext.mappingException("Can not create polymorphic instances with unwrapped values");
        return this._unwrappedPropertyHandler.processUnwrapped(paramJsonParser, paramDeserializationContext, localObject3, localTokenBuffer);
        if (!localPropertyValueBuffer.readIdProperty(str))
        {
          SettableBeanProperty localSettableBeanProperty2 = this._beanProperties.find(str);
          if (localSettableBeanProperty2 != null)
          {
            localPropertyValueBuffer.bufferProperty(localSettableBeanProperty2, localSettableBeanProperty2.deserialize(paramJsonParser, paramDeserializationContext));
          }
          else if ((this._ignorableProps != null) && (this._ignorableProps.contains(str)))
          {
            paramJsonParser.skipChildren();
          }
          else
          {
            localTokenBuffer.writeFieldName(str);
            localTokenBuffer.copyCurrentStructure(paramJsonParser);
            if (this._anySetter != null)
              localPropertyValueBuffer.bufferAnyProperty(this._anySetter, str, this._anySetter.deserialize(paramJsonParser, paramDeserializationContext));
          }
        }
      }
    }
    try
    {
      Object localObject1 = localPropertyBasedCreator.build(paramDeserializationContext, localPropertyValueBuffer);
      return this._unwrappedPropertyHandler.processUnwrapped(paramJsonParser, paramDeserializationContext, localObject1, localTokenBuffer);
    }
    catch (Exception localException1)
    {
      wrapInstantiationProblem(localException1, paramDeserializationContext);
    }
    return null;
  }

  protected Object deserializeWithExternalTypeId(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    if (this._propertyBasedCreator != null)
      return deserializeUsingPropertyBasedWithExternalTypeId(paramJsonParser, paramDeserializationContext);
    return deserializeWithExternalTypeId(paramJsonParser, paramDeserializationContext, this._valueInstantiator.createUsingDefault(paramDeserializationContext));
  }

  protected Object deserializeWithExternalTypeId(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject)
  {
    Class localClass;
    ExternalTypeHandler localExternalTypeHandler;
    label22: String str;
    SettableBeanProperty localSettableBeanProperty;
    if (this._needViewProcesing)
    {
      localClass = paramDeserializationContext.getActiveView();
      localExternalTypeHandler = this._externalTypeIdHandler.start();
      if (paramJsonParser.getCurrentToken() == JsonToken.END_OBJECT)
        break label213;
      str = paramJsonParser.getCurrentName();
      paramJsonParser.nextToken();
      localSettableBeanProperty = this._beanProperties.find(str);
      if (localSettableBeanProperty == null)
        break label124;
      if ((localClass == null) || (localSettableBeanProperty.visibleInView(localClass)))
        break label93;
      paramJsonParser.skipChildren();
    }
    while (true)
    {
      paramJsonParser.nextToken();
      break label22;
      localClass = null;
      break;
      try
      {
        label93: Object localObject = localSettableBeanProperty.deserializeSetAndReturn(paramJsonParser, paramDeserializationContext, paramObject);
        paramObject = localObject;
      }
      catch (Exception localException2)
      {
        wrapAndThrow(localException2, paramObject, str, paramDeserializationContext);
      }
      continue;
      label124: if ((this._ignorableProps != null) && (this._ignorableProps.contains(str)))
        paramJsonParser.skipChildren();
      else if (!localExternalTypeHandler.handlePropertyValue(paramJsonParser, paramDeserializationContext, str, paramObject))
        if (this._anySetter != null)
          try
          {
            this._anySetter.deserializeAndSet(paramJsonParser, paramDeserializationContext, paramObject, str);
          }
          catch (Exception localException1)
          {
            wrapAndThrow(localException1, paramObject, str, paramDeserializationContext);
          }
        else
          handleUnknownProperty(paramJsonParser, paramDeserializationContext, paramObject, str);
    }
    label213: return localExternalTypeHandler.complete(paramJsonParser, paramDeserializationContext, paramObject);
  }

  protected Object deserializeWithUnwrapped(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    if (this._delegateDeserializer != null)
      return this._valueInstantiator.createUsingDelegate(paramDeserializationContext, this._delegateDeserializer.deserialize(paramJsonParser, paramDeserializationContext));
    if (this._propertyBasedCreator != null)
      return deserializeUsingPropertyBasedWithUnwrapped(paramJsonParser, paramDeserializationContext);
    TokenBuffer localTokenBuffer = new TokenBuffer(paramJsonParser.getCodec());
    localTokenBuffer.writeStartObject();
    Object localObject1 = this._valueInstantiator.createUsingDefault(paramDeserializationContext);
    if (this._injectables != null)
      injectValues(paramDeserializationContext, localObject1);
    Class localClass;
    String str;
    SettableBeanProperty localSettableBeanProperty;
    if (this._needViewProcesing)
    {
      localClass = paramDeserializationContext.getActiveView();
      if (paramJsonParser.getCurrentToken() == JsonToken.END_OBJECT)
        break label274;
      str = paramJsonParser.getCurrentName();
      paramJsonParser.nextToken();
      localSettableBeanProperty = this._beanProperties.find(str);
      if (localSettableBeanProperty == null)
        break label197;
      if ((localClass == null) || (localSettableBeanProperty.visibleInView(localClass)))
        break label163;
      paramJsonParser.skipChildren();
    }
    while (true)
    {
      paramJsonParser.nextToken();
      break;
      localClass = null;
      break;
      try
      {
        label163: Object localObject2 = localSettableBeanProperty.deserializeSetAndReturn(paramJsonParser, paramDeserializationContext, localObject1);
        localObject1 = localObject2;
      }
      catch (Exception localException2)
      {
        wrapAndThrow(localException2, localObject1, str, paramDeserializationContext);
      }
      continue;
      label197: if ((this._ignorableProps != null) && (this._ignorableProps.contains(str)))
      {
        paramJsonParser.skipChildren();
      }
      else
      {
        localTokenBuffer.writeFieldName(str);
        localTokenBuffer.copyCurrentStructure(paramJsonParser);
        if (this._anySetter != null)
          try
          {
            this._anySetter.deserializeAndSet(paramJsonParser, paramDeserializationContext, localObject1, str);
          }
          catch (Exception localException1)
          {
            wrapAndThrow(localException1, localObject1, str, paramDeserializationContext);
          }
      }
    }
    label274: localTokenBuffer.writeEndObject();
    this._unwrappedPropertyHandler.processUnwrapped(paramJsonParser, paramDeserializationContext, localObject1, localTokenBuffer);
    return localObject1;
  }

  protected Object deserializeWithUnwrapped(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject)
  {
    JsonToken localJsonToken = paramJsonParser.getCurrentToken();
    if (localJsonToken == JsonToken.START_OBJECT)
      localJsonToken = paramJsonParser.nextToken();
    TokenBuffer localTokenBuffer = new TokenBuffer(paramJsonParser.getCodec());
    localTokenBuffer.writeStartObject();
    Class localClass;
    String str;
    SettableBeanProperty localSettableBeanProperty;
    if (this._needViewProcesing)
    {
      localClass = paramDeserializationContext.getActiveView();
      if (localJsonToken != JsonToken.FIELD_NAME)
        break label214;
      str = paramJsonParser.getCurrentName();
      localSettableBeanProperty = this._beanProperties.find(str);
      paramJsonParser.nextToken();
      if (localSettableBeanProperty == null)
        break label152;
      if ((localClass == null) || (localSettableBeanProperty.visibleInView(localClass)))
        break label121;
      paramJsonParser.skipChildren();
    }
    while (true)
    {
      localJsonToken = paramJsonParser.nextToken();
      break;
      localClass = null;
      break;
      try
      {
        label121: Object localObject = localSettableBeanProperty.deserializeSetAndReturn(paramJsonParser, paramDeserializationContext, paramObject);
        paramObject = localObject;
      }
      catch (Exception localException)
      {
        wrapAndThrow(localException, paramObject, str, paramDeserializationContext);
      }
      continue;
      label152: if ((this._ignorableProps != null) && (this._ignorableProps.contains(str)))
      {
        paramJsonParser.skipChildren();
      }
      else
      {
        localTokenBuffer.writeFieldName(str);
        localTokenBuffer.copyCurrentStructure(paramJsonParser);
        if (this._anySetter != null)
          this._anySetter.deserializeAndSet(paramJsonParser, paramDeserializationContext, paramObject, str);
      }
    }
    label214: localTokenBuffer.writeEndObject();
    this._unwrappedPropertyHandler.processUnwrapped(paramJsonParser, paramDeserializationContext, paramObject, localTokenBuffer);
    return paramObject;
  }

  protected final Object deserializeWithView(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject, Class<?> paramClass)
  {
    JsonToken localJsonToken = paramJsonParser.getCurrentToken();
    if (localJsonToken == JsonToken.FIELD_NAME)
    {
      String str = paramJsonParser.getCurrentName();
      paramJsonParser.nextToken();
      SettableBeanProperty localSettableBeanProperty = this._beanProperties.find(str);
      if (localSettableBeanProperty != null)
        if (!localSettableBeanProperty.visibleInView(paramClass))
          paramJsonParser.skipChildren();
      while (true)
      {
        localJsonToken = paramJsonParser.nextToken();
        break;
        try
        {
          Object localObject = localSettableBeanProperty.deserializeSetAndReturn(paramJsonParser, paramDeserializationContext, paramObject);
          paramObject = localObject;
        }
        catch (Exception localException)
        {
          wrapAndThrow(localException, paramObject, str, paramDeserializationContext);
        }
        continue;
        if ((this._ignorableProps != null) && (this._ignorableProps.contains(str)))
          paramJsonParser.skipChildren();
        else if (this._anySetter != null)
          this._anySetter.deserializeAndSet(paramJsonParser, paramDeserializationContext, paramObject, str);
        else
          handleUnknownProperty(paramJsonParser, paramDeserializationContext, paramObject, str);
      }
    }
    return paramObject;
  }

  protected final Object finishBuild(DeserializationContext paramDeserializationContext, Object paramObject)
  {
    try
    {
      Object localObject = this._buildMethod.getMember().invoke(paramObject, new Object[0]);
      return localObject;
    }
    catch (Exception localException)
    {
      wrapInstantiationProblem(localException, paramDeserializationContext);
    }
    return null;
  }

  protected Object handlePolymorphic(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject, TokenBuffer paramTokenBuffer)
  {
    JsonDeserializer localJsonDeserializer = _findSubclassDeserializer(paramDeserializationContext, paramObject, paramTokenBuffer);
    JsonParser localJsonParser;
    if (localJsonDeserializer != null)
    {
      if (paramTokenBuffer == null)
        break label101;
      paramTokenBuffer.writeEndObject();
      localJsonParser = paramTokenBuffer.asParser();
      localJsonParser.nextToken();
    }
    label101: for (Object localObject = localJsonDeserializer.deserialize(localJsonParser, paramDeserializationContext, paramObject); ; localObject = paramObject)
    {
      if (paramJsonParser != null)
        localObject = localJsonDeserializer.deserialize(paramJsonParser, paramDeserializationContext, localObject);
      while (true)
      {
        return localObject;
        if (paramTokenBuffer != null);
        for (localObject = handleUnknownProperties(paramDeserializationContext, paramObject, paramTokenBuffer); paramJsonParser != null; localObject = paramObject)
          return deserialize(paramJsonParser, paramDeserializationContext, localObject);
      }
    }
  }

  public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer paramNameTransformer)
  {
    return new BuilderBasedDeserializer(this, paramNameTransformer);
  }

  public BuilderBasedDeserializer withIgnorableProperties(HashSet<String> paramHashSet)
  {
    return new BuilderBasedDeserializer(this, paramHashSet);
  }

  public BuilderBasedDeserializer withObjectIdReader(ObjectIdReader paramObjectIdReader)
  {
    return new BuilderBasedDeserializer(this, paramObjectIdReader);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
