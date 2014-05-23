package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;

public final class ObjectIdWriter
{
  public final boolean alwaysAsId;
  public final ObjectIdGenerator<?> generator;
  public final JavaType idType;
  public final SerializedString propertyName;
  public final JsonSerializer<Object> serializer;

  protected ObjectIdWriter(JavaType paramJavaType, SerializedString paramSerializedString, ObjectIdGenerator<?> paramObjectIdGenerator, JsonSerializer<?> paramJsonSerializer, boolean paramBoolean)
  {
    this.idType = paramJavaType;
    this.propertyName = paramSerializedString;
    this.generator = paramObjectIdGenerator;
    this.serializer = paramJsonSerializer;
    this.alwaysAsId = paramBoolean;
  }

  public static ObjectIdWriter construct(JavaType paramJavaType, String paramString, ObjectIdGenerator<?> paramObjectIdGenerator, boolean paramBoolean)
  {
    if (paramString == null);
    for (SerializedString localSerializedString = null; ; localSerializedString = new SerializedString(paramString))
      return new ObjectIdWriter(paramJavaType, localSerializedString, paramObjectIdGenerator, null, paramBoolean);
  }

  public final ObjectIdWriter withAlwaysAsId(boolean paramBoolean)
  {
    if (paramBoolean == this.alwaysAsId)
      return this;
    return new ObjectIdWriter(this.idType, this.propertyName, this.generator, this.serializer, paramBoolean);
  }

  public final ObjectIdWriter withSerializer(JsonSerializer<?> paramJsonSerializer)
  {
    return new ObjectIdWriter(this.idType, this.propertyName, this.generator, paramJsonSerializer, this.alwaysAsId);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
