package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class UnwrappingBeanPropertyWriter extends BeanPropertyWriter
{
  protected final NameTransformer _nameTransformer;

  public UnwrappingBeanPropertyWriter(BeanPropertyWriter paramBeanPropertyWriter, NameTransformer paramNameTransformer)
  {
    super(paramBeanPropertyWriter);
    this._nameTransformer = paramNameTransformer;
  }

  private UnwrappingBeanPropertyWriter(UnwrappingBeanPropertyWriter paramUnwrappingBeanPropertyWriter, NameTransformer paramNameTransformer, SerializedString paramSerializedString)
  {
    super(paramUnwrappingBeanPropertyWriter, paramSerializedString);
    this._nameTransformer = paramNameTransformer;
  }

  protected JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap paramPropertySerializerMap, Class<?> paramClass, SerializerProvider paramSerializerProvider)
  {
    JsonSerializer localJsonSerializer1;
    NameTransformer localNameTransformer1;
    if (this._nonTrivialBaseType != null)
    {
      localJsonSerializer1 = paramSerializerProvider.findValueSerializer(paramSerializerProvider.constructSpecializedType(this._nonTrivialBaseType, paramClass), this);
      localNameTransformer1 = this._nameTransformer;
      if (!localJsonSerializer1.isUnwrappingSerializer())
        break label89;
    }
    label89: for (NameTransformer localNameTransformer2 = NameTransformer.chainedTransformer(localNameTransformer1, ((UnwrappingBeanSerializer)localJsonSerializer1)._nameTransformer); ; localNameTransformer2 = localNameTransformer1)
    {
      JsonSerializer localJsonSerializer2 = localJsonSerializer1.unwrappingSerializer(localNameTransformer2);
      this._dynamicSerializers = this._dynamicSerializers.newWith(paramClass, localJsonSerializer2);
      return localJsonSerializer2;
      localJsonSerializer1 = paramSerializerProvider.findValueSerializer(paramClass, this);
      break;
    }
  }

  public void assignSerializer(JsonSerializer<Object> paramJsonSerializer)
  {
    super.assignSerializer(paramJsonSerializer);
    NameTransformer localNameTransformer1;
    if (this._serializer != null)
    {
      localNameTransformer1 = this._nameTransformer;
      if (!this._serializer.isUnwrappingSerializer())
        break label55;
    }
    label55: for (NameTransformer localNameTransformer2 = NameTransformer.chainedTransformer(localNameTransformer1, ((UnwrappingBeanSerializer)this._serializer)._nameTransformer); ; localNameTransformer2 = localNameTransformer1)
    {
      this._serializer = this._serializer.unwrappingSerializer(localNameTransformer2);
      return;
    }
  }

  public UnwrappingBeanPropertyWriter rename(NameTransformer paramNameTransformer)
  {
    String str = paramNameTransformer.transform(this._name.getValue());
    return new UnwrappingBeanPropertyWriter(this, NameTransformer.chainedTransformer(paramNameTransformer, this._nameTransformer), new SerializedString(str));
  }

  public void serializeAsField(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    Object localObject = get(paramObject);
    if (localObject == null);
    JsonSerializer localJsonSerializer;
    do
    {
      return;
      localJsonSerializer = this._serializer;
      if (localJsonSerializer == null)
      {
        Class localClass = localObject.getClass();
        PropertySerializerMap localPropertySerializerMap = this._dynamicSerializers;
        localJsonSerializer = localPropertySerializerMap.serializerFor(localClass);
        if (localJsonSerializer == null)
          localJsonSerializer = _findAndAddDynamic(localPropertySerializerMap, localClass, paramSerializerProvider);
      }
      if (this._suppressableValue == null)
        break;
      if (MARKER_FOR_EMPTY != this._suppressableValue)
        break label135;
    }
    while (localJsonSerializer.isEmpty(localObject));
    label135: 
    while (!this._suppressableValue.equals(localObject))
    {
      if (localObject == paramObject)
        _handleSelfReference(paramObject, localJsonSerializer);
      if (!localJsonSerializer.isUnwrappingSerializer())
        paramJsonGenerator.writeFieldName(this._name);
      if (this._typeSerializer != null)
        break;
      localJsonSerializer.serialize(localObject, paramJsonGenerator, paramSerializerProvider);
      return;
    }
    return;
    localJsonSerializer.serializeWithType(localObject, paramJsonGenerator, paramSerializerProvider, this._typeSerializer);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
