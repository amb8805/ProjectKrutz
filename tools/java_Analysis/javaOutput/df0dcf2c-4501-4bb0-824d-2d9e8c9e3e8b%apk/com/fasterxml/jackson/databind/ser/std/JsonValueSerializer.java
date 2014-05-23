package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

@JacksonStdImpl
public class JsonValueSerializer extends StdSerializer
  implements ContextualSerializer
{
  protected final Method _accessorMethod;
  protected final boolean _forceTypeInformation;
  protected final BeanProperty _property;
  protected final JsonSerializer<Object> _valueSerializer;

  public JsonValueSerializer(JsonValueSerializer paramJsonValueSerializer, BeanProperty paramBeanProperty, JsonSerializer<?> paramJsonSerializer, boolean paramBoolean)
  {
    super(_notNullClass(paramJsonValueSerializer.handledType()));
    this._accessorMethod = paramJsonValueSerializer._accessorMethod;
    this._valueSerializer = paramJsonSerializer;
    this._property = paramBeanProperty;
    this._forceTypeInformation = paramBoolean;
  }

  public JsonValueSerializer(Method paramMethod, JsonSerializer<Object> paramJsonSerializer)
  {
    super(Object.class);
    this._accessorMethod = paramMethod;
    this._valueSerializer = paramJsonSerializer;
    this._property = null;
    this._forceTypeInformation = true;
  }

  private static final Class<Object> _notNullClass(Class<?> paramClass)
  {
    if (paramClass == null)
      paramClass = Object.class;
    return paramClass;
  }

  public JsonSerializer<?> createContextual(SerializerProvider paramSerializerProvider, BeanProperty paramBeanProperty)
  {
    JsonSerializer localJsonSerializer1 = this._valueSerializer;
    if (localJsonSerializer1 == null)
      if ((paramSerializerProvider.isEnabled(MapperFeature.USE_STATIC_TYPING)) || (Modifier.isFinal(this._accessorMethod.getReturnType().getModifiers())))
      {
        localJavaType = paramSerializerProvider.constructType(this._accessorMethod.getGenericReturnType());
        localJsonSerializer2 = paramSerializerProvider.findTypedValueSerializer(localJavaType, false, this._property);
        this = withResolved(paramBeanProperty, localJsonSerializer2, isNaturalTypeWithStdHandling(localJavaType.getRawClass(), localJsonSerializer2));
      }
    while (!(localJsonSerializer1 instanceof ContextualSerializer))
    {
      JavaType localJavaType;
      JsonSerializer localJsonSerializer2;
      return this;
    }
    return withResolved(paramBeanProperty, ((ContextualSerializer)localJsonSerializer1).createContextual(paramSerializerProvider, paramBeanProperty), this._forceTypeInformation);
  }

  protected boolean isNaturalTypeWithStdHandling(Class<?> paramClass, JsonSerializer<?> paramJsonSerializer)
  {
    if (paramClass.isPrimitive())
    {
      if ((paramClass == Integer.TYPE) || (paramClass == Boolean.TYPE) || (paramClass == Double.TYPE));
    }
    else
      while ((paramClass != String.class) && (paramClass != Integer.class) && (paramClass != Boolean.class) && (paramClass != Double.class))
        return false;
    return isDefaultSerializer(paramJsonSerializer);
  }

  public void serialize(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    try
    {
      Object localObject = this._accessorMethod.invoke(paramObject, new Object[0]);
      if (localObject == null)
      {
        paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
        return;
      }
      JsonSerializer localJsonSerializer = this._valueSerializer;
      if (localJsonSerializer == null)
        localJsonSerializer = paramSerializerProvider.findTypedValueSerializer(localObject.getClass(), true, this._property);
      localJsonSerializer.serialize(localObject, paramJsonGenerator, paramSerializerProvider);
      return;
    }
    catch (IOException localIOException)
    {
      throw localIOException;
      Throwable localThrowable;
      while (((localThrowable instanceof InvocationTargetException)) && (localThrowable.getCause() != null))
        localThrowable = localThrowable.getCause();
      if ((localThrowable instanceof Error))
        throw ((Error)localThrowable);
      throw JsonMappingException.wrapWithPath(localThrowable, paramObject, this._accessorMethod.getName() + "()");
    }
    catch (Exception localException)
    {
      break label67;
    }
  }

  public void serializeWithType(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, TypeSerializer paramTypeSerializer)
  {
    try
    {
      localObject = this._accessorMethod.invoke(paramObject, new Object[0]);
      if (localObject == null)
      {
        paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
        return;
      }
      localJsonSerializer = this._valueSerializer;
      if (localJsonSerializer == null)
      {
        localJsonSerializer = paramSerializerProvider.findValueSerializer(localObject.getClass(), this._property);
        localJsonSerializer.serializeWithType(localObject, paramJsonGenerator, paramSerializerProvider, paramTypeSerializer);
        return;
      }
    }
    catch (IOException localIOException)
    {
      Object localObject;
      JsonSerializer localJsonSerializer;
      do
        throw localIOException;
      while (!this._forceTypeInformation);
      paramTypeSerializer.writeTypePrefixForScalar(paramObject, paramJsonGenerator);
      localJsonSerializer.serialize(localObject, paramJsonGenerator, paramSerializerProvider);
      paramTypeSerializer.writeTypeSuffixForScalar(paramObject, paramJsonGenerator);
      return;
    }
    catch (Exception localException)
    {
      Throwable localThrowable;
      while (((localException instanceof InvocationTargetException)) && (localException.getCause() != null))
        localThrowable = localException.getCause();
      if ((localThrowable instanceof Error))
        throw ((Error)localThrowable);
      throw JsonMappingException.wrapWithPath(localThrowable, paramObject, this._accessorMethod.getName() + "()");
    }
  }

  public String toString()
  {
    return "(@JsonValue serializer for method " + this._accessorMethod.getDeclaringClass() + "#" + this._accessorMethod.getName() + ")";
  }

  public JsonValueSerializer withResolved(BeanProperty paramBeanProperty, JsonSerializer<?> paramJsonSerializer, boolean paramBoolean)
  {
    if ((this._property == paramBeanProperty) && (this._valueSerializer == paramJsonSerializer) && (paramBoolean == this._forceTypeInformation))
      return this;
    return new JsonValueSerializer(this, paramBeanProperty, paramJsonSerializer, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.std.JsonValueSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
