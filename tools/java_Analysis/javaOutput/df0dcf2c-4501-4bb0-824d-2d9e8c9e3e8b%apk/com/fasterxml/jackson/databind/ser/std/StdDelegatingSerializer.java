package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;

public class StdDelegatingSerializer extends StdSerializer
  implements ContextualSerializer
{
  protected final Converter<Object, ?> _converter;
  protected final JsonSerializer<Object> _delegateSerializer;
  protected final JavaType _delegateType;

  protected StdDelegatingSerializer(Converter<Object, ?> paramConverter, JavaType paramJavaType, JsonSerializer<?> paramJsonSerializer)
  {
    super(paramJavaType);
    this._converter = paramConverter;
    this._delegateType = paramJavaType;
    this._delegateSerializer = paramJsonSerializer;
  }

  protected Object convertValue(Object paramObject)
  {
    return this._converter.convert(paramObject);
  }

  public JsonSerializer<?> createContextual(SerializerProvider paramSerializerProvider, BeanProperty paramBeanProperty)
  {
    TypeFactory localTypeFactory = paramSerializerProvider.getTypeFactory();
    JavaType localJavaType1 = localTypeFactory.constructType(this._converter.getClass());
    JavaType[] arrayOfJavaType = localTypeFactory.findTypeParameters(localJavaType1, Converter.class);
    if ((arrayOfJavaType == null) || (arrayOfJavaType.length != 2))
      throw new JsonMappingException("Could not determine Converter parameterization for " + localJavaType1);
    JavaType localJavaType2 = arrayOfJavaType[1];
    return withDelegate(this._converter, localJavaType2, paramSerializerProvider.findValueSerializer(localJavaType2, paramBeanProperty));
  }

  public boolean isEmpty(Object paramObject)
  {
    Object localObject = convertValue(paramObject);
    return this._delegateSerializer.isEmpty(localObject);
  }

  public void serialize(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    Object localObject = convertValue(paramObject);
    if (localObject == null)
    {
      paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
      return;
    }
    this._delegateSerializer.serialize(localObject, paramJsonGenerator, paramSerializerProvider);
  }

  public void serializeWithType(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, TypeSerializer paramTypeSerializer)
  {
    Object localObject = convertValue(paramObject);
    this._delegateSerializer.serializeWithType(localObject, paramJsonGenerator, paramSerializerProvider, paramTypeSerializer);
  }

  protected StdDelegatingSerializer withDelegate(Converter<Object, ?> paramConverter, JavaType paramJavaType, JsonSerializer<?> paramJsonSerializer)
  {
    if (getClass() != StdDelegatingSerializer.class)
      throw new IllegalStateException("Sub-class " + getClass().getName() + " must override 'withDelegate'");
    return new StdDelegatingSerializer(paramConverter, paramJavaType, paramJsonSerializer);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
