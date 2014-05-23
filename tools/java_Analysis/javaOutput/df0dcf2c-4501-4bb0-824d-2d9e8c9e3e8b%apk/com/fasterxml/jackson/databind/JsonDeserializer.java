package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.Collection;

public abstract class JsonDeserializer<T>
{
  public JsonDeserializer()
  {
  }

  public abstract T deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext);

  public T deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, T paramT)
  {
    throw new UnsupportedOperationException("Can not update object of type " + paramT.getClass().getName());
  }

  public Object deserializeWithType(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, TypeDeserializer paramTypeDeserializer)
  {
    return paramTypeDeserializer.deserializeTypedFromAny(paramJsonParser, paramDeserializationContext);
  }

  public T getEmptyValue()
  {
    return getNullValue();
  }

  public Collection<Object> getKnownPropertyNames()
  {
    return null;
  }

  public T getNullValue()
  {
    return null;
  }

  public boolean isCachable()
  {
    return false;
  }

  public JsonDeserializer<T> unwrappingDeserializer(NameTransformer paramNameTransformer)
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.JsonDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
