package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import java.util.Map;

public class AnyGetterWriter
{
  protected final AnnotatedMember _accessor;
  protected final BeanProperty _property;
  protected MapSerializer _serializer;

  public AnyGetterWriter(BeanProperty paramBeanProperty, AnnotatedMember paramAnnotatedMember, MapSerializer paramMapSerializer)
  {
    this._accessor = paramAnnotatedMember;
    this._property = paramBeanProperty;
    this._serializer = paramMapSerializer;
  }

  public void getAndSerialize(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    Object localObject = this._accessor.getValue(paramObject);
    if (localObject == null)
      return;
    if (!(localObject instanceof Map))
      throw new JsonMappingException("Value returned by 'any-getter' (" + this._accessor.getName() + "()) not java.util.Map but " + localObject.getClass().getName());
    this._serializer.serializeFields((Map)localObject, paramJsonGenerator, paramSerializerProvider);
  }

  public void resolve(SerializerProvider paramSerializerProvider)
  {
    this._serializer = ((MapSerializer)this._serializer.createContextual(paramSerializerProvider, this._property));
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.AnyGetterWriter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
