package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.NameTransformer;

public abstract class JsonSerializer
{
  public JsonSerializer()
  {
  }

  public Class<T> handledType()
  {
    return null;
  }

  public boolean isEmpty(T paramT)
  {
    return paramT == null;
  }

  public boolean isUnwrappingSerializer()
  {
    return false;
  }

  public abstract void serialize(T paramT, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider);

  public void serializeWithType(T paramT, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, TypeSerializer paramTypeSerializer)
  {
    Class localClass = handledType();
    if (localClass == null)
      localClass = paramT.getClass();
    throw new UnsupportedOperationException("Type id handling not implemented for type " + localClass.getName());
  }

  public JsonSerializer<T> unwrappingSerializer(NameTransformer paramNameTransformer)
  {
    return this;
  }

  public boolean usesObjectId()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.JsonSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
