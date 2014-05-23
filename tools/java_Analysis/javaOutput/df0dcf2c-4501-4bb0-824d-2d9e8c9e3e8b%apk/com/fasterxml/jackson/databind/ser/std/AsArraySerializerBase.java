package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult;

public abstract class AsArraySerializerBase<T> extends ContainerSerializer<T>
  implements ContextualSerializer
{
  protected PropertySerializerMap _dynamicSerializers;
  protected final JsonSerializer<Object> _elementSerializer;
  protected final JavaType _elementType;
  protected final BeanProperty _property;
  protected final boolean _staticTyping;
  protected final TypeSerializer _valueTypeSerializer;

  protected AsArraySerializerBase(AsArraySerializerBase<?> paramAsArraySerializerBase, BeanProperty paramBeanProperty, TypeSerializer paramTypeSerializer, JsonSerializer<?> paramJsonSerializer)
  {
    super(paramAsArraySerializerBase);
    this._elementType = paramAsArraySerializerBase._elementType;
    this._staticTyping = paramAsArraySerializerBase._staticTyping;
    this._valueTypeSerializer = paramTypeSerializer;
    this._property = paramBeanProperty;
    this._elementSerializer = paramJsonSerializer;
    this._dynamicSerializers = paramAsArraySerializerBase._dynamicSerializers;
  }

  protected AsArraySerializerBase(Class<?> paramClass, JavaType paramJavaType, boolean paramBoolean, TypeSerializer paramTypeSerializer, BeanProperty paramBeanProperty, JsonSerializer<Object> paramJsonSerializer)
  {
    super(paramClass, false);
    this._elementType = paramJavaType;
    boolean bool1;
    if (!paramBoolean)
    {
      bool1 = false;
      if (paramJavaType != null)
      {
        boolean bool2 = paramJavaType.isFinal();
        bool1 = false;
        if (!bool2);
      }
    }
    else
    {
      bool1 = true;
    }
    this._staticTyping = bool1;
    this._valueTypeSerializer = paramTypeSerializer;
    this._property = paramBeanProperty;
    this._elementSerializer = paramJsonSerializer;
    this._dynamicSerializers = PropertySerializerMap.emptyMap();
  }

  protected final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap paramPropertySerializerMap, JavaType paramJavaType, SerializerProvider paramSerializerProvider)
  {
    PropertySerializerMap.SerializerAndMapResult localSerializerAndMapResult = paramPropertySerializerMap.findAndAddSerializer(paramJavaType, paramSerializerProvider, this._property);
    if (paramPropertySerializerMap != localSerializerAndMapResult.map)
      this._dynamicSerializers = localSerializerAndMapResult.map;
    return localSerializerAndMapResult.serializer;
  }

  protected final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap paramPropertySerializerMap, Class<?> paramClass, SerializerProvider paramSerializerProvider)
  {
    PropertySerializerMap.SerializerAndMapResult localSerializerAndMapResult = paramPropertySerializerMap.findAndAddSerializer(paramClass, paramSerializerProvider, this._property);
    if (paramPropertySerializerMap != localSerializerAndMapResult.map)
      this._dynamicSerializers = localSerializerAndMapResult.map;
    return localSerializerAndMapResult.serializer;
  }

  public JsonSerializer<?> createContextual(SerializerProvider paramSerializerProvider, BeanProperty paramBeanProperty)
  {
    TypeSerializer localTypeSerializer1 = this._valueTypeSerializer;
    if (localTypeSerializer1 != null);
    for (TypeSerializer localTypeSerializer2 = localTypeSerializer1.forProperty(paramBeanProperty); ; localTypeSerializer2 = localTypeSerializer1)
    {
      JsonSerializer localJsonSerializer = null;
      if (paramBeanProperty != null)
      {
        AnnotatedMember localAnnotatedMember = paramBeanProperty.getMember();
        localJsonSerializer = null;
        if (localAnnotatedMember != null)
        {
          Object localObject = paramSerializerProvider.getAnnotationIntrospector().findContentSerializer(localAnnotatedMember);
          localJsonSerializer = null;
          if (localObject != null)
            localJsonSerializer = paramSerializerProvider.serializerInstance(localAnnotatedMember, localObject);
        }
      }
      if (localJsonSerializer == null)
        localJsonSerializer = this._elementSerializer;
      if (localJsonSerializer == null)
        if ((this._elementType != null) && ((this._staticTyping) || (hasContentTypeAnnotation(paramSerializerProvider, paramBeanProperty))))
          localJsonSerializer = paramSerializerProvider.findValueSerializer(this._elementType, paramBeanProperty);
      while (true)
      {
        if ((localJsonSerializer != this._elementSerializer) || (paramBeanProperty != this._property) || (this._valueTypeSerializer != localTypeSerializer2))
          this = withResolved(paramBeanProperty, localTypeSerializer2, localJsonSerializer);
        return this;
        if ((localJsonSerializer instanceof ContextualSerializer))
          localJsonSerializer = ((ContextualSerializer)localJsonSerializer).createContextual(paramSerializerProvider, paramBeanProperty);
      }
    }
  }

  public final void serialize(T paramT, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    if ((paramSerializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && (hasSingleElement(paramT)))
    {
      serializeContents(paramT, paramJsonGenerator, paramSerializerProvider);
      return;
    }
    paramJsonGenerator.writeStartArray();
    serializeContents(paramT, paramJsonGenerator, paramSerializerProvider);
    paramJsonGenerator.writeEndArray();
  }

  protected abstract void serializeContents(T paramT, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider);

  public final void serializeWithType(T paramT, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, TypeSerializer paramTypeSerializer)
  {
    paramTypeSerializer.writeTypePrefixForArray(paramT, paramJsonGenerator);
    serializeContents(paramT, paramJsonGenerator, paramSerializerProvider);
    paramTypeSerializer.writeTypeSuffixForArray(paramT, paramJsonGenerator);
  }

  public abstract AsArraySerializerBase<T> withResolved(BeanProperty paramBeanProperty, TypeSerializer paramTypeSerializer, JsonSerializer<?> paramJsonSerializer);
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
