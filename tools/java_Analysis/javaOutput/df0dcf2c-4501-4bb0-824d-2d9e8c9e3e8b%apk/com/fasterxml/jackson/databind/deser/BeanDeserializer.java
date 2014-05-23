package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.databind.util.TokenBuffer;;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;

public class BeanDeserializer extends BeanDeserializerBase
  implements Serializable
{
  private static final long serialVersionUID = 1L;

  protected BeanDeserializer(BeanDeserializerBase paramBeanDeserializerBase)
  {
    super(paramBeanDeserializerBase, paramBeanDeserializerBase._ignoreAllUnknown);
  }

  public BeanDeserializer(BeanDeserializerBase paramBeanDeserializerBase, ObjectIdReader paramObjectIdReader)
  {
    super(paramBeanDeserializerBase, paramObjectIdReader);
  }

  protected BeanDeserializer(BeanDeserializerBase paramBeanDeserializerBase, NameTransformer paramNameTransformer)
  {
    super(paramBeanDeserializerBase, paramNameTransformer);
  }

  public BeanDeserializer(BeanDeserializerBase paramBeanDeserializerBase, HashSet<String> paramHashSet)
  {
    super(paramBeanDeserializerBase, paramHashSet);
  }

  public BeanDeserializer(BeanDeserializerBuilder paramBeanDeserializerBuilder, BeanDescription paramBeanDescription, BeanPropertyMap paramBeanPropertyMap, Map<String, SettableBeanProperty> paramMap, HashSet<String> paramHashSet, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramBeanDeserializerBuilder, paramBeanDescription, paramBeanPropertyMap, paramMap, paramHashSet, paramBoolean1, paramBoolean2);
  }

  private Object _missingToken(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    throw paramDeserializationContext.endOfInputException(getBeanClass());
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
    Object localObject = this._valueInstantiator.createUsingDefault(paramDeserializationContext);
    if (paramJsonParser.getCurrentToken() != JsonToken.END_OBJECT)
    {
      String str = paramJsonParser.getCurrentName();
      paramJsonParser.nextToken();
      SettableBeanProperty localSettableBeanProperty = this._beanProperties.find(str);
      if (localSettableBeanProperty != null);
      while (true)
      {
        try
        {
          localSettableBeanProperty.deserializeAndSet(paramJsonParser, paramDeserializationContext, localObject);
          paramJsonParser.nextToken();
        }
        catch (Exception localException)
        {
          wrapAndThrow(localException, localObject, str, paramDeserializationContext);
          continue;
        }
        _vanillaDeserializeHandleUnknown(paramJsonParser, paramDeserializationContext, localObject, str);
      }
    }
    return localObject;
  }

  protected final Object _deserializeUsingPropertyBased(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    PropertyBasedCreator localPropertyBasedCreator = this._propertyBasedCreator;
    PropertyValueBuffer localPropertyValueBuffer = localPropertyBasedCreator.startBuilding(paramJsonParser, paramDeserializationContext, this._objectIdReader);
    JsonToken localJsonToken = paramJsonParser.getCurrentToken();
    TokenBuffer localTokenBuffer = null;
    if (localJsonToken == JsonToken.FIELD_NAME)
    {
      String str = paramJsonParser.getCurrentName();
      paramJsonParser.nextToken();
      SettableBeanProperty localSettableBeanProperty1 = localPropertyBasedCreator.findCreatorProperty(str);
      if (localSettableBeanProperty1 != null)
      {
        Object localObject3 = localSettableBeanProperty1.deserialize(paramJsonParser, paramDeserializationContext);
        if (!localPropertyValueBuffer.assignParameter(localSettableBeanProperty1.getCreatorIndex(), localObject3))
          break label215;
        paramJsonParser.nextToken();
        try
        {
          Object localObject5 = localPropertyBasedCreator.build(paramDeserializationContext, localPropertyValueBuffer);
          localObject4 = localObject5;
          if (localObject4.getClass() != this._beanType.getRawClass())
            return handlePolymorphic(paramJsonParser, paramDeserializationContext, localObject4, localTokenBuffer);
        }
        catch (Exception localException2)
        {
          Object localObject4;
          while (true)
          {
            wrapAndThrow(localException2, this._beanType.getRawClass(), str, paramDeserializationContext);
            localObject4 = null;
          }
          if (localTokenBuffer != null)
            localObject4 = handleUnknownProperties(paramDeserializationContext, localObject4, localTokenBuffer);
          return deserialize(paramJsonParser, paramDeserializationContext, localObject4);
        }
      }
      if (!localPropertyValueBuffer.readIdProperty(str))
      {
        SettableBeanProperty localSettableBeanProperty2 = this._beanProperties.find(str);
        if (localSettableBeanProperty2 == null)
          break label224;
        localPropertyValueBuffer.bufferProperty(localSettableBeanProperty2, localSettableBeanProperty2.deserialize(paramJsonParser, paramDeserializationContext));
      }
      while (true)
      {
        label215: localJsonToken = paramJsonParser.nextToken();
        break;
        label224: if ((this._ignorableProps != null) && (this._ignorableProps.contains(str)))
        {
          paramJsonParser.skipChildren();
        }
        else if (this._anySetter != null)
        {
          localPropertyValueBuffer.bufferAnyProperty(this._anySetter, str, this._anySetter.deserialize(paramJsonParser, paramDeserializationContext));
        }
        else
        {
          if (localTokenBuffer == null)
            localTokenBuffer = new TokenBuffer(paramJsonParser.getCodec());
          localTokenBuffer.writeFieldName(str);
          localTokenBuffer.copyCurrentStructure(paramJsonParser);
        }
      }
    }
    try
    {
      Object localObject2 = localPropertyBasedCreator.build(paramDeserializationContext, localPropertyValueBuffer);
      localObject1 = localObject2;
      if (localTokenBuffer == null)
        break label384;
      if (localObject1.getClass() != this._beanType.getRawClass())
        return handlePolymorphic(null, paramDeserializationContext, localObject1, localTokenBuffer);
    }
    catch (Exception localException1)
    {
      while (true)
      {
        wrapInstantiationProblem(localException1, paramDeserializationContext);
        localObject1 = null;
      }
    }
    Object localObject1;
    return handleUnknownProperties(paramDeserializationContext, localObject1, localTokenBuffer);
    label384: return localObject1;
  }

  protected BeanDeserializerBase asArrayDeserializer()
  {
    return new BeanAsArrayDeserializer(this, this._beanProperties.getPropertiesInInsertionOrder());
  }

  public final Object deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    JsonToken localJsonToken1 = paramJsonParser.getCurrentToken();
    if (localJsonToken1 == JsonToken.START_OBJECT)
    {
      JsonToken localJsonToken2 = paramJsonParser.nextToken();
      if (this._vanillaProcessing)
        return vanillaDeserialize(paramJsonParser, paramDeserializationContext, localJsonToken2);
      if (this._objectIdReader != null)
        return deserializeWithObjectId(paramJsonParser, paramDeserializationContext);
      return deserializeFromObject(paramJsonParser, paramDeserializationContext);
    }
    if (localJsonToken1 == null)
      return _missingToken(paramJsonParser, paramDeserializationContext);
    switch (BeanDeserializer.1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[localJsonToken1.ordinal()])
    {
    default:
      throw paramDeserializationContext.mappingException(getBeanClass());
    case 1:
      return deserializeFromString(paramJsonParser, paramDeserializationContext);
    case 2:
      return deserializeFromNumber(paramJsonParser, paramDeserializationContext);
    case 3:
      return deserializeFromDouble(paramJsonParser, paramDeserializationContext);
    case 4:
      return paramJsonParser.getEmbeddedObject();
    case 5:
    case 6:
      return deserializeFromBoolean(paramJsonParser, paramDeserializationContext);
    case 7:
      return deserializeFromArray(paramJsonParser, paramDeserializationContext);
    case 8:
    case 9:
    }
    if (this._vanillaProcessing)
      return vanillaDeserialize(paramJsonParser, paramDeserializationContext, localJsonToken1);
    if (this._objectIdReader != null)
      return deserializeWithObjectId(paramJsonParser, paramDeserializationContext);
    return deserializeFromObject(paramJsonParser, paramDeserializationContext);
  }

  public Object deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject)
  {
    if (this._injectables != null)
      injectValues(paramDeserializationContext, paramObject);
    if (this._unwrappedPropertyHandler != null)
      paramObject = deserializeWithUnwrapped(paramJsonParser, paramDeserializationContext, paramObject);
    JsonToken localJsonToken;
    do
    {
      return paramObject;
      if (this._externalTypeIdHandler != null)
        return deserializeWithExternalTypeId(paramJsonParser, paramDeserializationContext, paramObject);
      localJsonToken = paramJsonParser.getCurrentToken();
      if (localJsonToken == JsonToken.START_OBJECT)
        localJsonToken = paramJsonParser.nextToken();
      if (this._needViewProcesing)
      {
        Class localClass = paramDeserializationContext.getActiveView();
        if (localClass != null)
          return deserializeWithView(paramJsonParser, paramDeserializationContext, paramObject, localClass);
      }
    }
    while (localJsonToken != JsonToken.FIELD_NAME);
    String str = paramJsonParser.getCurrentName();
    paramJsonParser.nextToken();
    SettableBeanProperty localSettableBeanProperty = this._beanProperties.find(str);
    if (localSettableBeanProperty != null);
    while (true)
    {
      try
      {
        localSettableBeanProperty.deserializeAndSet(paramJsonParser, paramDeserializationContext, paramObject);
        localJsonToken = paramJsonParser.nextToken();
      }
      catch (Exception localException)
      {
        wrapAndThrow(localException, paramObject, str, paramDeserializationContext);
        continue;
      }
      if ((this._ignorableProps != null) && (this._ignorableProps.contains(str)))
        paramJsonParser.skipChildren();
      else if (this._anySetter != null)
        this._anySetter.deserializeAndSet(paramJsonParser, paramDeserializationContext, paramObject, str);
      else
        handleUnknownProperty(paramJsonParser, paramDeserializationContext, paramObject, str);
    }
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
    switch (BeanDeserializer.1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[paramJsonParser.getNumberType().ordinal()])
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
          switch (BeanDeserializer.1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[paramJsonParser.getNumberType().ordinal()])
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

  public Object deserializeFromObject(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    Object localObject;
    if (this._nonStandardCreation)
      if (this._unwrappedPropertyHandler != null)
        localObject = deserializeWithUnwrapped(paramJsonParser, paramDeserializationContext);
    do
    {
      return localObject;
      if (this._externalTypeIdHandler != null)
        return deserializeWithExternalTypeId(paramJsonParser, paramDeserializationContext);
      return deserializeFromObjectUsingNonDefault(paramJsonParser, paramDeserializationContext);
      localObject = this._valueInstantiator.createUsingDefault(paramDeserializationContext);
      if (this._injectables != null)
        injectValues(paramDeserializationContext, localObject);
      if (this._needViewProcesing)
      {
        Class localClass = paramDeserializationContext.getActiveView();
        if (localClass != null)
          return deserializeWithView(paramJsonParser, paramDeserializationContext, localObject, localClass);
      }
    }
    while (paramJsonParser.getCurrentToken() == JsonToken.END_OBJECT);
    String str = paramJsonParser.getCurrentName();
    paramJsonParser.nextToken();
    SettableBeanProperty localSettableBeanProperty = this._beanProperties.find(str);
    if (localSettableBeanProperty != null);
    while (true)
    {
      try
      {
        localSettableBeanProperty.deserializeAndSet(paramJsonParser, paramDeserializationContext, localObject);
        paramJsonParser.nextToken();
      }
      catch (Exception localException2)
      {
        wrapAndThrow(localException2, localObject, str, paramDeserializationContext);
        continue;
      }
      if ((this._ignorableProps != null) && (this._ignorableProps.contains(str)))
        paramJsonParser.skipChildren();
      else if (this._anySetter != null)
        try
        {
          this._anySetter.deserializeAndSet(paramJsonParser, paramDeserializationContext, localObject, str);
        }
        catch (Exception localException1)
        {
          wrapAndThrow(localException1, localObject, str, paramDeserializationContext);
        }
      else
        handleUnknownProperty(paramJsonParser, paramDeserializationContext, localObject, str);
    }
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
    ExternalTypeHandler localExternalTypeHandler = this._externalTypeIdHandler.start();
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
        if (!localExternalTypeHandler.handlePropertyValue(paramJsonParser, paramDeserializationContext, str, localPropertyValueBuffer))
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
        if (localObject3.getClass() != this._beanType.getRawClass())
          throw paramDeserializationContext.mappingException("Can not create polymorphic instances with unwrapped values");
        return localExternalTypeHandler.complete(paramJsonParser, paramDeserializationContext, localObject3);
        if (!localPropertyValueBuffer.readIdProperty(str))
        {
          SettableBeanProperty localSettableBeanProperty2 = this._beanProperties.find(str);
          if (localSettableBeanProperty2 != null)
            localPropertyValueBuffer.bufferProperty(localSettableBeanProperty2, localSettableBeanProperty2.deserialize(paramJsonParser, paramDeserializationContext));
          else if (!localExternalTypeHandler.handlePropertyValue(paramJsonParser, paramDeserializationContext, str, null))
            if ((this._ignorableProps != null) && (this._ignorableProps.contains(str)))
              paramJsonParser.skipChildren();
            else if (this._anySetter != null)
              localPropertyValueBuffer.bufferAnyProperty(this._anySetter, str, this._anySetter.deserialize(paramJsonParser, paramDeserializationContext));
        }
      }
    }
    try
    {
      Object localObject1 = localExternalTypeHandler.complete(paramJsonParser, paramDeserializationContext, localPropertyValueBuffer, localPropertyBasedCreator);
      return localObject1;
    }
    catch (Exception localException1)
    {
      wrapInstantiationProblem(localException1, paramDeserializationContext);
    }
    return null;
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
        {
          localTokenBuffer.close();
          throw paramDeserializationContext.mappingException("Can not create polymorphic instances with unwrapped values");
        }
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
        break label229;
      str = paramJsonParser.getCurrentName();
      paramJsonParser.nextToken();
      localSettableBeanProperty = this._beanProperties.find(str);
      if (localSettableBeanProperty == null)
        break label140;
      if (paramJsonParser.getCurrentToken().isScalarValue())
        localExternalTypeHandler.handleTypePropertyValue(paramJsonParser, paramDeserializationContext, str, paramObject);
      if ((localClass == null) || (localSettableBeanProperty.visibleInView(localClass)))
        break label114;
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
        label114: localSettableBeanProperty.deserializeAndSet(paramJsonParser, paramDeserializationContext, paramObject);
      }
      catch (Exception localException2)
      {
        wrapAndThrow(localException2, paramObject, str, paramDeserializationContext);
      }
      continue;
      label140: if ((this._ignorableProps != null) && (this._ignorableProps.contains(str)))
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
    label229: return localExternalTypeHandler.complete(paramJsonParser, paramDeserializationContext, paramObject);
  }

  protected Object deserializeWithObjectId(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    String str1 = this._objectIdReader.propertyName;
    if (str1.equals(paramJsonParser.getCurrentName()))
      return deserializeFromObject(paramJsonParser, paramDeserializationContext);
    Object localObject = new TokenBuffer(paramJsonParser.getCodec());
    TokenBuffer localTokenBuffer = null;
    if (paramJsonParser.getCurrentToken() != JsonToken.END_OBJECT)
    {
      String str2 = paramJsonParser.getCurrentName();
      if (localTokenBuffer == null)
        if (str1.equals(str2))
        {
          localTokenBuffer = new TokenBuffer(paramJsonParser.getCodec());
          localTokenBuffer.writeFieldName(str2);
          paramJsonParser.nextToken();
          localTokenBuffer.copyCurrentStructure(paramJsonParser);
          localTokenBuffer.append((TokenBuffer)localObject);
          localObject = null;
        }
      while (true)
      {
        paramJsonParser.nextToken();
        break;
        ((TokenBuffer)localObject).writeFieldName(str2);
        paramJsonParser.nextToken();
        ((TokenBuffer)localObject).copyCurrentStructure(paramJsonParser);
        continue;
        localTokenBuffer.writeFieldName(str2);
        paramJsonParser.nextToken();
        localTokenBuffer.copyCurrentStructure(paramJsonParser);
      }
    }
    if (localTokenBuffer == null);
    while (true)
    {
      ((TokenBuffer)localObject).writeEndObject();
      JsonParser localJsonParser = ((TokenBuffer)localObject).asParser();
      localJsonParser.nextToken();
      return deserializeFromObject(localJsonParser, paramDeserializationContext);
      localObject = localTokenBuffer;
    }
  }

  protected Object deserializeWithUnwrapped(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    if (this._delegateDeserializer != null)
      return this._valueInstantiator.createUsingDelegate(paramDeserializationContext, this._delegateDeserializer.deserialize(paramJsonParser, paramDeserializationContext));
    if (this._propertyBasedCreator != null)
      return deserializeUsingPropertyBasedWithUnwrapped(paramJsonParser, paramDeserializationContext);
    TokenBuffer localTokenBuffer = new TokenBuffer(paramJsonParser.getCodec());
    localTokenBuffer.writeStartObject();
    Object localObject = this._valueInstantiator.createUsingDefault(paramDeserializationContext);
    if (this._injectables != null)
      injectValues(paramDeserializationContext, localObject);
    Class localClass;
    String str;
    SettableBeanProperty localSettableBeanProperty;
    if (this._needViewProcesing)
    {
      localClass = paramDeserializationContext.getActiveView();
      if (paramJsonParser.getCurrentToken() == JsonToken.END_OBJECT)
        break label268;
      str = paramJsonParser.getCurrentName();
      paramJsonParser.nextToken();
      localSettableBeanProperty = this._beanProperties.find(str);
      if (localSettableBeanProperty == null)
        break label191;
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
        label163: localSettableBeanProperty.deserializeAndSet(paramJsonParser, paramDeserializationContext, localObject);
      }
      catch (Exception localException2)
      {
        wrapAndThrow(localException2, localObject, str, paramDeserializationContext);
      }
      continue;
      label191: if ((this._ignorableProps != null) && (this._ignorableProps.contains(str)))
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
            this._anySetter.deserializeAndSet(paramJsonParser, paramDeserializationContext, localObject, str);
          }
          catch (Exception localException1)
          {
            wrapAndThrow(localException1, localObject, str, paramDeserializationContext);
          }
      }
    }
    label268: localTokenBuffer.writeEndObject();
    this._unwrappedPropertyHandler.processUnwrapped(paramJsonParser, paramDeserializationContext, localObject, localTokenBuffer);
    return localObject;
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
        break label209;
      str = paramJsonParser.getCurrentName();
      localSettableBeanProperty = this._beanProperties.find(str);
      paramJsonParser.nextToken();
      if (localSettableBeanProperty == null)
        break label147;
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
        label121: localSettableBeanProperty.deserializeAndSet(paramJsonParser, paramDeserializationContext, paramObject);
      }
      catch (Exception localException)
      {
        wrapAndThrow(localException, paramObject, str, paramDeserializationContext);
      }
      continue;
      label147: if ((this._ignorableProps != null) && (this._ignorableProps.contains(str)))
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
    label209: localTokenBuffer.writeEndObject();
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
          localSettableBeanProperty.deserializeAndSet(paramJsonParser, paramDeserializationContext, paramObject);
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
    if (getClass() != BeanDeserializer.class)
      return this;
    return new BeanDeserializer(this, paramNameTransformer);
  }

  public BeanDeserializer withIgnorableProperties(HashSet<String> paramHashSet)
  {
    return new BeanDeserializer(this, paramHashSet);
  }

  public BeanDeserializer withObjectIdReader(ObjectIdReader paramObjectIdReader)
  {
    return new BeanDeserializer(this, paramObjectIdReader);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.BeanDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
