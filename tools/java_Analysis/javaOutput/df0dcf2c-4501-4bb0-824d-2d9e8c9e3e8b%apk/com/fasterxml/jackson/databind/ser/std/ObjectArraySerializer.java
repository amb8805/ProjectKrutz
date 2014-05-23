package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@JacksonStdImpl
public class ObjectArraySerializer extends ArraySerializerBase<Object[]>
  implements ContextualSerializer
{
  protected PropertySerializerMap _dynamicSerializers;
  protected JsonSerializer<Object> _elementSerializer;
  protected final JavaType _elementType;
  protected final boolean _staticTyping;
  protected final TypeSerializer _valueTypeSerializer;

  public ObjectArraySerializer(JavaType paramJavaType, boolean paramBoolean, TypeSerializer paramTypeSerializer, JsonSerializer<Object> paramJsonSerializer)
  {
    super([Ljava.lang.Object.class, null);
    this._elementType = paramJavaType;
    this._staticTyping = paramBoolean;
    this._valueTypeSerializer = paramTypeSerializer;
    this._dynamicSerializers = PropertySerializerMap.emptyMap();
    this._elementSerializer = paramJsonSerializer;
  }

  public ObjectArraySerializer(ObjectArraySerializer paramObjectArraySerializer, BeanProperty paramBeanProperty, TypeSerializer paramTypeSerializer, JsonSerializer<?> paramJsonSerializer)
  {
    super(paramObjectArraySerializer, paramBeanProperty);
    this._elementType = paramObjectArraySerializer._elementType;
    this._valueTypeSerializer = paramTypeSerializer;
    this._staticTyping = paramObjectArraySerializer._staticTyping;
    this._dynamicSerializers = paramObjectArraySerializer._dynamicSerializers;
    this._elementSerializer = paramJsonSerializer;
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

  public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer paramTypeSerializer)
  {
    return new ObjectArraySerializer(this._elementType, this._staticTyping, paramTypeSerializer, this._elementSerializer);
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
        return withResolved(paramBeanProperty, localTypeSerializer2, localJsonSerializer);
        if ((localJsonSerializer instanceof ContextualSerializer))
          localJsonSerializer = ((ContextualSerializer)localJsonSerializer).createContextual(paramSerializerProvider, paramBeanProperty);
      }
    }
  }

  public boolean hasSingleElement(Object[] paramArrayOfObject)
  {
    return paramArrayOfObject.length == 1;
  }

  public boolean isEmpty(Object[] paramArrayOfObject)
  {
    return (paramArrayOfObject == null) || (paramArrayOfObject.length == 0);
  }

  public void serializeContents(Object[] paramArrayOfObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    int i = paramArrayOfObject.length;
    if (i == 0)
      return;
    if (this._elementSerializer != null)
    {
      serializeContentsUsing(paramArrayOfObject, paramJsonGenerator, paramSerializerProvider, this._elementSerializer);
      return;
    }
    if (this._valueTypeSerializer != null)
    {
      serializeTypedContents(paramArrayOfObject, paramJsonGenerator, paramSerializerProvider);
      return;
    }
    int j = 0;
    Object localObject1 = null;
    while (true)
    {
      try
      {
        localPropertySerializerMap = this._dynamicSerializers;
        if (j >= i)
          break;
        localObject1 = paramArrayOfObject[j];
        if (localObject1 == null)
        {
          paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
        }
        else
        {
          localClass = localObject1.getClass();
          localObject2 = localPropertySerializerMap.serializerFor(localClass);
          if (localObject2 == null)
          {
            if (this._elementType.hasGenericTypes())
              localObject2 = _findAndAddDynamic(localPropertySerializerMap, paramSerializerProvider.constructSpecializedType(this._elementType, localClass), paramSerializerProvider);
          }
          else
            ((JsonSerializer)localObject2).serialize(localObject1, paramJsonGenerator, paramSerializerProvider);
        }
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          PropertySerializerMap localPropertySerializerMap;
          Class localClass;
          throw localIOException;
          JsonSerializer localJsonSerializer = _findAndAddDynamic(localPropertySerializerMap, localClass, paramSerializerProvider);
          Object localObject2 = localJsonSerializer;
        }
        Throwable localThrowable;
        while (((localThrowable instanceof InvocationTargetException)) && (localThrowable.getCause() != null))
          localThrowable = localThrowable.getCause();
        if ((localThrowable instanceof Error))
          throw ((Error)localThrowable);
        throw JsonMappingException.wrapWithPath(localThrowable, localObject1, j);
      }
      catch (Exception localException)
      {
        break label167;
      }
      label167: j++;
    }
  }

  public void serializeContentsUsing(Object[] paramArrayOfObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, JsonSerializer<Object> paramJsonSerializer)
  {
    int i = paramArrayOfObject.length;
    TypeSerializer localTypeSerializer = this._valueTypeSerializer;
    Object localObject = null;
    for (int j = 0; ; j++)
      if (j < i)
        try
        {
          localObject = paramArrayOfObject[j];
          if (localObject == null)
            paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
          else if (localTypeSerializer == null)
            paramJsonSerializer.serialize(localObject, paramJsonGenerator, paramSerializerProvider);
        }
        catch (IOException localIOException)
        {
          throw localIOException;
          paramJsonSerializer.serializeWithType(localObject, paramJsonGenerator, paramSerializerProvider, localTypeSerializer);
        }
        catch (Exception localException)
        {
          Throwable localThrowable;
          while (((localException instanceof InvocationTargetException)) && (localException.getCause() != null))
            localThrowable = localException.getCause();
          if ((localThrowable instanceof Error))
            throw ((Error)localThrowable);
          throw JsonMappingException.wrapWithPath(localThrowable, localObject, j);
        }
      else
        return;
  }

  public void serializeTypedContents(Object[] paramArrayOfObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    int i = paramArrayOfObject.length;
    TypeSerializer localTypeSerializer = this._valueTypeSerializer;
    int j = 0;
    Object localObject = null;
    while (true)
    {
      try
      {
        PropertySerializerMap localPropertySerializerMap = this._dynamicSerializers;
        if (j < i)
        {
          localObject = paramArrayOfObject[j];
          if (localObject == null)
          {
            paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
          }
          else
          {
            Class localClass = localObject.getClass();
            JsonSerializer localJsonSerializer = localPropertySerializerMap.serializerFor(localClass);
            if (localJsonSerializer == null)
              localJsonSerializer = _findAndAddDynamic(localPropertySerializerMap, localClass, paramSerializerProvider);
            localJsonSerializer.serializeWithType(localObject, paramJsonGenerator, paramSerializerProvider, localTypeSerializer);
          }
        }
      }
      catch (IOException localIOException)
      {
        throw localIOException;
        Throwable localThrowable;
        while (((localThrowable instanceof InvocationTargetException)) && (localThrowable.getCause() != null))
          localThrowable = localThrowable.getCause();
        if ((localThrowable instanceof Error))
          throw ((Error)localThrowable);
        throw JsonMappingException.wrapWithPath(localThrowable, localObject, j);
        return;
      }
      catch (Exception localException)
      {
        break label99;
      }
      label99: j++;
    }
  }

  public ObjectArraySerializer withResolved(BeanProperty paramBeanProperty, TypeSerializer paramTypeSerializer, JsonSerializer<?> paramJsonSerializer)
  {
    if ((this._property == paramBeanProperty) && (paramJsonSerializer == this._elementSerializer) && (this._valueTypeSerializer == paramTypeSerializer))
      return this;
    return new ObjectArraySerializer(this, paramBeanProperty, paramTypeSerializer, paramJsonSerializer);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
