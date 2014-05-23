package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;

public abstract class TypeDeserializer
{
  public TypeDeserializer()
  {
  }

  public abstract Object deserializeTypedFromAny(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext);

  public abstract Object deserializeTypedFromArray(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext);

  public abstract Object deserializeTypedFromObject(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext);

  public abstract Object deserializeTypedFromScalar(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext);

  public abstract TypeDeserializer forProperty(BeanProperty paramBeanProperty);

  public abstract Class<?> getDefaultImpl();

  public abstract String getPropertyName();

  public abstract TypeIdResolver getTypeIdResolver();

  public abstract JsonTypeInfo.As getTypeInclusion();
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.jsontype.TypeDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
