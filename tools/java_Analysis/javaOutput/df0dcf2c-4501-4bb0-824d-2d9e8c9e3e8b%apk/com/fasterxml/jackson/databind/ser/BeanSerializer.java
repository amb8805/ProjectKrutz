package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BeanSerializer extends BeanSerializerBase
{
  public BeanSerializer(JavaType paramJavaType, BeanSerializerBuilder paramBeanSerializerBuilder, BeanPropertyWriter[] paramArrayOfBeanPropertyWriter1, BeanPropertyWriter[] paramArrayOfBeanPropertyWriter2)
  {
    super(paramJavaType, paramBeanSerializerBuilder, paramArrayOfBeanPropertyWriter1, paramArrayOfBeanPropertyWriter2);
  }

  protected BeanSerializer(BeanSerializerBase paramBeanSerializerBase, ObjectIdWriter paramObjectIdWriter)
  {
    super(paramBeanSerializerBase, paramObjectIdWriter);
  }

  protected BeanSerializer(BeanSerializerBase paramBeanSerializerBase, String[] paramArrayOfString)
  {
    super(paramBeanSerializerBase, paramArrayOfString);
  }

  public static BeanSerializer createDummy(JavaType paramJavaType)
  {
    return new BeanSerializer(paramJavaType, null, NO_PROPS, null);
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
    if ((this._objectIdWriter == null) && (this._anyGetterWriter == null) && (this._propertyFilterId == null))
      this = new BeanAsArraySerializer(this);
    return this;
  }

  public final void serialize(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    if (this._objectIdWriter != null)
    {
      serializeWithObjectId(paramObject, paramJsonGenerator, paramSerializerProvider);
      return;
    }
    paramJsonGenerator.writeStartObject();
    if (this._propertyFilterId != null)
      serializeFieldsFiltered(paramObject, paramJsonGenerator, paramSerializerProvider);
    while (true)
    {
      paramJsonGenerator.writeEndObject();
      return;
      serializeFields(paramObject, paramJsonGenerator, paramSerializerProvider);
    }
  }

  public String toString()
  {
    return "BeanSerializer for " + handledType().getName();
  }

  public JsonSerializer<Object> unwrappingSerializer(NameTransformer paramNameTransformer)
  {
    return new UnwrappingBeanSerializer(this, paramNameTransformer);
  }

  protected BeanSerializer withIgnorals(String[] paramArrayOfString)
  {
    return new BeanSerializer(this, paramArrayOfString);
  }

  public BeanSerializer withObjectIdWriter(ObjectIdWriter paramObjectIdWriter)
  {
    return new BeanSerializer(this, paramObjectIdWriter);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.BeanSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
