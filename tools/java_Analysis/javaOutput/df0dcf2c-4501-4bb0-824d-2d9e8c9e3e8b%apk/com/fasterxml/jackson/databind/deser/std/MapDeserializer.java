package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Map;

@JacksonStdImpl
public class MapDeserializer extends ContainerDeserializerBase<Map<Object, Object>>
  implements ContextualDeserializer, ResolvableDeserializer
{
  protected JsonDeserializer<Object> _delegateDeserializer;
  protected final boolean _hasDefaultCreator;
  protected HashSet<String> _ignorableProperties;
  protected final KeyDeserializer _keyDeserializer;
  protected final JavaType _mapType;
  protected PropertyBasedCreator _propertyBasedCreator;
  protected boolean _standardStringKey;
  protected final JsonDeserializer<Object> _valueDeserializer;
  protected final ValueInstantiator _valueInstantiator;
  protected final TypeDeserializer _valueTypeDeserializer;

  public MapDeserializer(JavaType paramJavaType, ValueInstantiator paramValueInstantiator, KeyDeserializer paramKeyDeserializer, JsonDeserializer<Object> paramJsonDeserializer, TypeDeserializer paramTypeDeserializer)
  {
    super(Map.class);
    this._mapType = paramJavaType;
    this._keyDeserializer = paramKeyDeserializer;
    this._valueDeserializer = paramJsonDeserializer;
    this._valueTypeDeserializer = paramTypeDeserializer;
    this._valueInstantiator = paramValueInstantiator;
    this._hasDefaultCreator = paramValueInstantiator.canCreateUsingDefault();
    this._delegateDeserializer = null;
    this._propertyBasedCreator = null;
    this._standardStringKey = _isStdKeyDeser(paramJavaType, paramKeyDeserializer);
  }

  protected MapDeserializer(MapDeserializer paramMapDeserializer, KeyDeserializer paramKeyDeserializer, JsonDeserializer<Object> paramJsonDeserializer, TypeDeserializer paramTypeDeserializer, HashSet<String> paramHashSet)
  {
    super(paramMapDeserializer._valueClass);
    this._mapType = paramMapDeserializer._mapType;
    this._keyDeserializer = paramKeyDeserializer;
    this._valueDeserializer = paramJsonDeserializer;
    this._valueTypeDeserializer = paramTypeDeserializer;
    this._valueInstantiator = paramMapDeserializer._valueInstantiator;
    this._propertyBasedCreator = paramMapDeserializer._propertyBasedCreator;
    this._delegateDeserializer = paramMapDeserializer._delegateDeserializer;
    this._hasDefaultCreator = paramMapDeserializer._hasDefaultCreator;
    this._ignorableProperties = paramHashSet;
    this._standardStringKey = _isStdKeyDeser(this._mapType, paramKeyDeserializer);
  }

  public Map<Object, Object> _deserializeUsingCreator(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    PropertyBasedCreator localPropertyBasedCreator = this._propertyBasedCreator;
    PropertyValueBuffer localPropertyValueBuffer = localPropertyBasedCreator.startBuilding(paramJsonParser, paramDeserializationContext, null);
    JsonToken localJsonToken1 = paramJsonParser.getCurrentToken();
    if (localJsonToken1 == JsonToken.START_OBJECT)
      localJsonToken1 = paramJsonParser.nextToken();
    JsonDeserializer localJsonDeserializer = this._valueDeserializer;
    TypeDeserializer localTypeDeserializer = this._valueTypeDeserializer;
    if (localJsonToken1 == JsonToken.FIELD_NAME)
    {
      String str1 = paramJsonParser.getCurrentName();
      JsonToken localJsonToken2 = paramJsonParser.nextToken();
      if ((this._ignorableProperties != null) && (this._ignorableProperties.contains(str1)))
        paramJsonParser.skipChildren();
      SettableBeanProperty localSettableBeanProperty;
      Object localObject3;
      do
      {
        localJsonToken1 = paramJsonParser.nextToken();
        break;
        localSettableBeanProperty = localPropertyBasedCreator.findCreatorProperty(str1);
        if (localSettableBeanProperty == null)
          break label181;
        localObject3 = localSettableBeanProperty.deserialize(paramJsonParser, paramDeserializationContext);
      }
      while (!localPropertyValueBuffer.assignParameter(localSettableBeanProperty.getCreatorIndex(), localObject3));
      paramJsonParser.nextToken();
      try
      {
        Map localMap2 = (Map)localPropertyBasedCreator.build(paramDeserializationContext, localPropertyValueBuffer);
        _readAndBind(paramJsonParser, paramDeserializationContext, localMap2);
        return localMap2;
      }
      catch (Exception localException2)
      {
        wrapAndThrow(localException2, this._mapType.getRawClass());
        return null;
      }
      label181: String str2 = paramJsonParser.getCurrentName();
      Object localObject1 = this._keyDeserializer.deserializeKey(str2, paramDeserializationContext);
      Object localObject2;
      if (localJsonToken2 == JsonToken.VALUE_NULL)
        localObject2 = null;
      while (true)
      {
        localPropertyValueBuffer.bufferMapProperty(localObject1, localObject2);
        break;
        if (localTypeDeserializer == null)
          localObject2 = localJsonDeserializer.deserialize(paramJsonParser, paramDeserializationContext);
        else
          localObject2 = localJsonDeserializer.deserializeWithType(paramJsonParser, paramDeserializationContext, localTypeDeserializer);
      }
    }
    try
    {
      Map localMap1 = (Map)localPropertyBasedCreator.build(paramDeserializationContext, localPropertyValueBuffer);
      return localMap1;
    }
    catch (Exception localException1)
    {
      wrapAndThrow(localException1, this._mapType.getRawClass());
    }
    return null;
  }

  protected final boolean _isStdKeyDeser(JavaType paramJavaType, KeyDeserializer paramKeyDeserializer)
  {
    if (paramKeyDeserializer == null);
    Class localClass;
    do
    {
      JavaType localJavaType;
      do
      {
        return true;
        localJavaType = paramJavaType.getKeyType();
      }
      while (localJavaType == null);
      localClass = localJavaType.getRawClass();
    }
    while (((localClass == String.class) || (localClass == Object.class)) && (isDefaultKeyDeserializer(paramKeyDeserializer)));
    return false;
  }

  protected final void _readAndBind(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Map<Object, Object> paramMap)
  {
    JsonToken localJsonToken1 = paramJsonParser.getCurrentToken();
    if (localJsonToken1 == JsonToken.START_OBJECT)
      localJsonToken1 = paramJsonParser.nextToken();
    KeyDeserializer localKeyDeserializer = this._keyDeserializer;
    JsonDeserializer localJsonDeserializer = this._valueDeserializer;
    TypeDeserializer localTypeDeserializer = this._valueTypeDeserializer;
    while (localJsonToken1 == JsonToken.FIELD_NAME)
    {
      String str = paramJsonParser.getCurrentName();
      Object localObject1 = localKeyDeserializer.deserializeKey(str, paramDeserializationContext);
      JsonToken localJsonToken2 = paramJsonParser.nextToken();
      if ((this._ignorableProperties != null) && (this._ignorableProperties.contains(str)))
      {
        paramJsonParser.skipChildren();
        localJsonToken1 = paramJsonParser.nextToken();
      }
      else
      {
        Object localObject2;
        if (localJsonToken2 == JsonToken.VALUE_NULL)
          localObject2 = null;
        while (true)
        {
          paramMap.put(localObject1, localObject2);
          break;
          if (localTypeDeserializer == null)
            localObject2 = localJsonDeserializer.deserialize(paramJsonParser, paramDeserializationContext);
          else
            localObject2 = localJsonDeserializer.deserializeWithType(paramJsonParser, paramDeserializationContext, localTypeDeserializer);
        }
      }
    }
  }

  protected final void _readAndBindStringMap(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Map<Object, Object> paramMap)
  {
    JsonToken localJsonToken1 = paramJsonParser.getCurrentToken();
    if (localJsonToken1 == JsonToken.START_OBJECT)
      localJsonToken1 = paramJsonParser.nextToken();
    JsonDeserializer localJsonDeserializer = this._valueDeserializer;
    TypeDeserializer localTypeDeserializer = this._valueTypeDeserializer;
    while (localJsonToken1 == JsonToken.FIELD_NAME)
    {
      String str = paramJsonParser.getCurrentName();
      JsonToken localJsonToken2 = paramJsonParser.nextToken();
      if ((this._ignorableProperties != null) && (this._ignorableProperties.contains(str)))
      {
        paramJsonParser.skipChildren();
        localJsonToken1 = paramJsonParser.nextToken();
      }
      else
      {
        Object localObject;
        if (localJsonToken2 == JsonToken.VALUE_NULL)
          localObject = null;
        while (true)
        {
          paramMap.put(str, localObject);
          break;
          if (localTypeDeserializer == null)
            localObject = localJsonDeserializer.deserialize(paramJsonParser, paramDeserializationContext);
          else
            localObject = localJsonDeserializer.deserializeWithType(paramJsonParser, paramDeserializationContext, localTypeDeserializer);
        }
      }
    }
  }

  public JsonDeserializer<?> createContextual(DeserializationContext paramDeserializationContext, BeanProperty paramBeanProperty)
  {
    KeyDeserializer localKeyDeserializer1 = this._keyDeserializer;
    KeyDeserializer localKeyDeserializer2;
    if (localKeyDeserializer1 == null)
      localKeyDeserializer2 = paramDeserializationContext.findKeyDeserializer(this._mapType.getKeyType(), paramBeanProperty);
    while (true)
    {
      JsonDeserializer localJsonDeserializer = this._valueDeserializer;
      label48: TypeDeserializer localTypeDeserializer;
      HashSet localHashSet1;
      String[] arrayOfString;
      if (localJsonDeserializer == null)
      {
        localJsonDeserializer = paramDeserializationContext.findContextualValueDeserializer(this._mapType.getContentType(), paramBeanProperty);
        localTypeDeserializer = this._valueTypeDeserializer;
        if (localTypeDeserializer != null)
          localTypeDeserializer = localTypeDeserializer.forProperty(paramBeanProperty);
        localHashSet1 = this._ignorableProperties;
        AnnotationIntrospector localAnnotationIntrospector = paramDeserializationContext.getAnnotationIntrospector();
        if ((localAnnotationIntrospector == null) || (paramBeanProperty == null))
          break label214;
        arrayOfString = localAnnotationIntrospector.findPropertiesToIgnore(paramBeanProperty.getMember());
        if (arrayOfString == null)
          break label214;
        if (localHashSet1 != null)
          break label200;
      }
      label200: for (HashSet localHashSet2 = new HashSet(); ; localHashSet2 = new HashSet(localHashSet1))
      {
        int i = arrayOfString.length;
        for (int j = 0; j < i; j++)
          localHashSet2.add(arrayOfString[j]);
        if (!(localKeyDeserializer1 instanceof ContextualKeyDeserializer))
          break label231;
        localKeyDeserializer2 = ((ContextualKeyDeserializer)localKeyDeserializer1).createContextual(paramDeserializationContext, paramBeanProperty);
        break;
        if (!(localJsonDeserializer instanceof ContextualDeserializer))
          break label48;
        localJsonDeserializer = ((ContextualDeserializer)localJsonDeserializer).createContextual(paramDeserializationContext, paramBeanProperty);
        break label48;
      }
      label214: localHashSet2 = localHashSet1;
      return withResolved(localKeyDeserializer2, localTypeDeserializer, localJsonDeserializer, localHashSet2);
      label231: localKeyDeserializer2 = localKeyDeserializer1;
    }
  }

  public Map<Object, Object> deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    if (this._propertyBasedCreator != null)
      return _deserializeUsingCreator(paramJsonParser, paramDeserializationContext);
    if (this._delegateDeserializer != null)
      return (Map)this._valueInstantiator.createUsingDelegate(paramDeserializationContext, this._delegateDeserializer.deserialize(paramJsonParser, paramDeserializationContext));
    if (!this._hasDefaultCreator)
      throw paramDeserializationContext.instantiationException(getMapClass(), "No default constructor found");
    JsonToken localJsonToken = paramJsonParser.getCurrentToken();
    if ((localJsonToken != JsonToken.START_OBJECT) && (localJsonToken != JsonToken.FIELD_NAME) && (localJsonToken != JsonToken.END_OBJECT))
    {
      if (localJsonToken == JsonToken.VALUE_STRING)
        return (Map)this._valueInstantiator.createFromString(paramDeserializationContext, paramJsonParser.getText());
      throw paramDeserializationContext.mappingException(getMapClass());
    }
    Map localMap = (Map)this._valueInstantiator.createUsingDefault(paramDeserializationContext);
    if (this._standardStringKey)
    {
      _readAndBindStringMap(paramJsonParser, paramDeserializationContext, localMap);
      return localMap;
    }
    _readAndBind(paramJsonParser, paramDeserializationContext, localMap);
    return localMap;
  }

  public Map<Object, Object> deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Map<Object, Object> paramMap)
  {
    JsonToken localJsonToken = paramJsonParser.getCurrentToken();
    if ((localJsonToken != JsonToken.START_OBJECT) && (localJsonToken != JsonToken.FIELD_NAME))
      throw paramDeserializationContext.mappingException(getMapClass());
    if (this._standardStringKey)
    {
      _readAndBindStringMap(paramJsonParser, paramDeserializationContext, paramMap);
      return paramMap;
    }
    _readAndBind(paramJsonParser, paramDeserializationContext, paramMap);
    return paramMap;
  }

  public Object deserializeWithType(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, TypeDeserializer paramTypeDeserializer)
  {
    return paramTypeDeserializer.deserializeTypedFromObject(paramJsonParser, paramDeserializationContext);
  }

  public JsonDeserializer<Object> getContentDeserializer()
  {
    return this._valueDeserializer;
  }

  public final Class<?> getMapClass()
  {
    return this._mapType.getRawClass();
  }

  public void resolve(DeserializationContext paramDeserializationContext)
  {
    if (this._valueInstantiator.canCreateUsingDelegate())
    {
      JavaType localJavaType = this._valueInstantiator.getDelegateType(paramDeserializationContext.getConfig());
      if (localJavaType == null)
        throw new IllegalArgumentException("Invalid delegate-creator definition for " + this._mapType + ": value instantiator (" + this._valueInstantiator.getClass().getName() + ") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'");
      this._delegateDeserializer = findDeserializer(paramDeserializationContext, localJavaType, null);
    }
    if (this._valueInstantiator.canCreateFromObjectWith())
    {
      SettableBeanProperty[] arrayOfSettableBeanProperty = this._valueInstantiator.getFromObjectArguments(paramDeserializationContext.getConfig());
      this._propertyBasedCreator = PropertyBasedCreator.construct(paramDeserializationContext, this._valueInstantiator, arrayOfSettableBeanProperty);
    }
    this._standardStringKey = _isStdKeyDeser(this._mapType, this._keyDeserializer);
  }

  public void setIgnorableProperties(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0));
    for (HashSet localHashSet = null; ; localHashSet = ArrayBuilders.arrayToSet(paramArrayOfString))
    {
      this._ignorableProperties = localHashSet;
      return;
    }
  }

  protected MapDeserializer withResolved(KeyDeserializer paramKeyDeserializer, TypeDeserializer paramTypeDeserializer, JsonDeserializer<?> paramJsonDeserializer, HashSet<String> paramHashSet)
  {
    if ((this._keyDeserializer == paramKeyDeserializer) && (this._valueDeserializer == paramJsonDeserializer) && (this._valueTypeDeserializer == paramTypeDeserializer) && (this._ignorableProperties == paramHashSet))
      return this;
    return new MapDeserializer(this, paramKeyDeserializer, paramJsonDeserializer, paramTypeDeserializer, paramHashSet);
  }

  protected void wrapAndThrow(Throwable paramThrowable, Object paramObject)
  {
    for (Throwable localThrowable = paramThrowable; ((localThrowable instanceof InvocationTargetException)) && (localThrowable.getCause() != null); localThrowable = localThrowable.getCause());
    if ((localThrowable instanceof Error))
      throw ((Error)localThrowable);
    if (((localThrowable instanceof IOException)) && (!(localThrowable instanceof JsonMappingException)))
      throw ((IOException)localThrowable);
    throw JsonMappingException.wrapWithPath(localThrowable, paramObject, null);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.MapDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
