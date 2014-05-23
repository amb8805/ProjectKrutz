package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class UnwrappingBeanSerializer extends BeanSerializerBase
{
  protected final NameTransformer _nameTransformer;

  public UnwrappingBeanSerializer(UnwrappingBeanSerializer paramUnwrappingBeanSerializer, ObjectIdWriter paramObjectIdWriter)
  {
    super(paramUnwrappingBeanSerializer, paramObjectIdWriter);
    this._nameTransformer = paramUnwrappingBeanSerializer._nameTransformer;
  }

  protected UnwrappingBeanSerializer(UnwrappingBeanSerializer paramUnwrappingBeanSerializer, String[] paramArrayOfString)
  {
    super(paramUnwrappingBeanSerializer, paramArrayOfString);
    this._nameTransformer = paramUnwrappingBeanSerializer._nameTransformer;
  }

  public UnwrappingBeanSerializer(BeanSerializerBase paramBeanSerializerBase, NameTransformer paramNameTransformer)
  {
    super(paramBeanSerializerBase, paramNameTransformer);
    this._nameTransformer = paramNameTransformer;
  }

  private final void serializeWithObjectId(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    ObjectIdWriter localObjectIdWriter = this._objectIdWriter;
    WritableObjectId localWritableObjectId = paramSerializerProvider.findObjectId(paramObject, localObjectIdWriter.generator);
    Object localObject1 = localWritableObjectId.id;
    if (localObject1 != null)
    {
      localWritableObjectId.serializer.serialize(localObject1, paramJsonGenerator, paramSerializerProvider);
      return;
    }
    localWritableObjectId.serializer = localObjectIdWriter.serializer;
    Object localObject2 = localWritableObjectId.generator.generateId(paramObject);
    localWritableObjectId.id = localObject2;
    if (localObjectIdWriter.alwaysAsId)
    {
      localWritableObjectId.serializer.serialize(localObject2, paramJsonGenerator, paramSerializerProvider);
      return;
    }
    paramJsonGenerator.writeStartObject();
    SerializedString localSerializedString = localObjectIdWriter.propertyName;
    if (localSerializedString != null)
    {
      paramJsonGenerator.writeFieldName(localSerializedString);
      localObjectIdWriter.serializer.serialize(localObject2, paramJsonGenerator, paramSerializerProvider);
    }
    if (this._propertyFilterId != null)
      serializeFieldsFiltered(paramObject, paramJsonGenerator, paramSerializerProvider);
    while (true)
    {
      paramJsonGenerator.writeEndObject();
      return;
      serializeFields(paramObject, paramJsonGenerator, paramSerializerProvider);
    }
  }

  protected BeanSerializerBase asArraySerializer()
  {
    return this;
  }

  public boolean isUnwrappingSerializer()
  {
    return true;
  }

  public final void serialize(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    if (this._objectIdWriter != null)
    {
      serializeWithObjectId(paramObject, paramJsonGenerator, paramSerializerProvider);
      return;
    }
    if (this._propertyFilterId != null)
    {
      serializeFieldsFiltered(paramObject, paramJsonGenerator, paramSerializerProvider);
      return;
    }
    serializeFields(paramObject, paramJsonGenerator, paramSerializerProvider);
  }

  public String toString()
  {
    return "UnwrappingBeanSerializer for " + handledType().getName();
  }

  public JsonSerializer<Object> unwrappingSerializer(NameTransformer paramNameTransformer)
  {
    return new UnwrappingBeanSerializer(this, paramNameTransformer);
  }

  protected UnwrappingBeanSerializer withIgnorals(String[] paramArrayOfString)
  {
    return new UnwrappingBeanSerializer(this, paramArrayOfString);
  }

  public UnwrappingBeanSerializer withObjectIdWriter(ObjectIdWriter paramObjectIdWriter)
  {
    return new UnwrappingBeanSerializer(this, paramObjectIdWriter);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
