package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;

public final class WritableObjectId
{
  public final ObjectIdGenerator<?> generator;
  public Object id;
  public JsonSerializer<Object> serializer;

  public WritableObjectId(ObjectIdGenerator<?> paramObjectIdGenerator)
  {
    this.generator = paramObjectIdGenerator;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.impl.WritableObjectId
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
