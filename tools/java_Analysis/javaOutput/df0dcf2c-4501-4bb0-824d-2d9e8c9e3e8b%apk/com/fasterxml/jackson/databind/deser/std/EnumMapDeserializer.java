package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.EnumMap;

public class EnumMapDeserializer extends StdDeserializer<EnumMap<?, ?>>
  implements ContextualDeserializer
{
  protected final Class<?> _enumClass;
  protected JsonDeserializer<Enum<?>> _keyDeserializer;
  protected final JavaType _mapType;
  protected JsonDeserializer<Object> _valueDeserializer;
  protected final TypeDeserializer _valueTypeDeserializer;

  public EnumMapDeserializer(JavaType paramJavaType, JsonDeserializer<?> paramJsonDeserializer1, JsonDeserializer<?> paramJsonDeserializer2, TypeDeserializer paramTypeDeserializer)
  {
    super(EnumMap.class);
    this._mapType = paramJavaType;
    this._enumClass = paramJavaType.getKeyType().getRawClass();
    this._keyDeserializer = paramJsonDeserializer1;
    this._valueDeserializer = paramJsonDeserializer2;
    this._valueTypeDeserializer = paramTypeDeserializer;
  }

  private EnumMap<?, ?> constructMap()
  {
    return new EnumMap(this._enumClass);
  }

  public JsonDeserializer<?> createContextual(DeserializationContext paramDeserializationContext, BeanProperty paramBeanProperty)
  {
    JsonDeserializer localJsonDeserializer1 = this._keyDeserializer;
    if (localJsonDeserializer1 == null);
    for (JsonDeserializer localJsonDeserializer2 = paramDeserializationContext.findContextualValueDeserializer(this._mapType.getKeyType(), paramBeanProperty); ; localJsonDeserializer2 = localJsonDeserializer1)
    {
      JsonDeserializer localJsonDeserializer3 = this._valueDeserializer;
      if (localJsonDeserializer3 == null)
        localJsonDeserializer3 = paramDeserializationContext.findContextualValueDeserializer(this._mapType.getContentType(), paramBeanProperty);
      while (true)
      {
        TypeDeserializer localTypeDeserializer = this._valueTypeDeserializer;
        if (localTypeDeserializer != null)
          localTypeDeserializer = localTypeDeserializer.forProperty(paramBeanProperty);
        return withResolved(localJsonDeserializer2, localJsonDeserializer3, localTypeDeserializer);
        if ((localJsonDeserializer3 instanceof ContextualDeserializer))
          localJsonDeserializer3 = ((ContextualDeserializer)localJsonDeserializer3).createContextual(paramDeserializationContext, paramBeanProperty);
      }
    }
  }

  public EnumMap<?, ?> deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    if (paramJsonParser.getCurrentToken() != JsonToken.START_OBJECT)
      throw paramDeserializationContext.mappingException(EnumMap.class);
    EnumMap localEnumMap = constructMap();
    JsonDeserializer localJsonDeserializer = this._valueDeserializer;
    TypeDeserializer localTypeDeserializer = this._valueTypeDeserializer;
    while (paramJsonParser.nextToken() != JsonToken.END_OBJECT)
    {
      Enum localEnum = (Enum)this._keyDeserializer.deserialize(paramJsonParser, paramDeserializationContext);
      if (localEnum == null)
      {
        if (!paramDeserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
          try
          {
            if (paramJsonParser.hasCurrentToken())
            {
              String str2 = paramJsonParser.getText();
              str1 = str2;
              throw paramDeserializationContext.weirdStringException(str1, this._enumClass, "value not one of declared Enum instance names");
            }
          }
          catch (Exception localException)
          {
            while (true)
              String str1 = null;
          }
        paramJsonParser.nextToken();
        paramJsonParser.skipChildren();
      }
      else
      {
        Object localObject;
        if (paramJsonParser.nextToken() == JsonToken.VALUE_NULL)
          localObject = null;
        while (true)
        {
          localEnumMap.put(localEnum, localObject);
          break;
          if (localTypeDeserializer == null)
            localObject = localJsonDeserializer.deserialize(paramJsonParser, paramDeserializationContext);
          else
            localObject = localJsonDeserializer.deserializeWithType(paramJsonParser, paramDeserializationContext, localTypeDeserializer);
        }
      }
    }
    return localEnumMap;
  }

  public Object deserializeWithType(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, TypeDeserializer paramTypeDeserializer)
  {
    return paramTypeDeserializer.deserializeTypedFromObject(paramJsonParser, paramDeserializationContext);
  }

  public boolean isCachable()
  {
    return true;
  }

  public EnumMapDeserializer withResolved(JsonDeserializer<?> paramJsonDeserializer1, JsonDeserializer<?> paramJsonDeserializer2, TypeDeserializer paramTypeDeserializer)
  {
    if ((paramJsonDeserializer1 == this._keyDeserializer) && (paramJsonDeserializer2 == this._valueDeserializer) && (paramTypeDeserializer == this._valueTypeDeserializer))
      return this;
    return new EnumMapDeserializer(this._mapType, paramJsonDeserializer1, paramJsonDeserializer2, this._valueTypeDeserializer);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
