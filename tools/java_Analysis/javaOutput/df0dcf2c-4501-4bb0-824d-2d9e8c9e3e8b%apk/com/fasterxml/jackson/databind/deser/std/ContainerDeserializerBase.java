package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;

public abstract class ContainerDeserializerBase<T> extends StdDeserializer<T>
{
  protected ContainerDeserializerBase(Class<?> paramClass)
  {
    super(paramClass);
  }

  public abstract JsonDeserializer<Object> getContentDeserializer();
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
