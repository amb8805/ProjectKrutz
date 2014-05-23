package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public abstract class StdSerializer extends JsonSerializer
{
  protected final Class<T> _handledType;

  protected StdSerializer(JavaType paramJavaType)
  {
    this._handledType = paramJavaType.getRawClass();
  }

  protected StdSerializer(Class<T> paramClass)
  {
    this._handledType = paramClass;
  }

  protected StdSerializer(Class<?> paramClass, boolean paramBoolean)
  {
    this._handledType = paramClass;
  }

  public Class<T> handledType()
  {
    return this._handledType;
  }

  protected boolean isDefaultSerializer(JsonSerializer<?> paramJsonSerializer)
  {
    return (paramJsonSerializer != null) && (paramJsonSerializer.getClass().getAnnotation(JacksonStdImpl.class) != null);
  }

  public abstract void serialize(T paramT, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider);

  public void wrapAndThrow(SerializerProvider paramSerializerProvider, Throwable paramThrowable, Object paramObject, int paramInt)
  {
    for (Throwable localThrowable = paramThrowable; ((localThrowable instanceof InvocationTargetException)) && (localThrowable.getCause() != null); localThrowable = localThrowable.getCause());
    if ((localThrowable instanceof Error))
      throw ((Error)localThrowable);
    if ((paramSerializerProvider == null) || (paramSerializerProvider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS)));
    for (int i = 1; (localThrowable instanceof IOException); i = 0)
    {
      if ((i != 0) && ((localThrowable instanceof JsonMappingException)))
        break label112;
      throw ((IOException)localThrowable);
    }
    if ((i == 0) && ((localThrowable instanceof RuntimeException)))
      throw ((RuntimeException)localThrowable);
    label112: throw JsonMappingException.wrapWithPath(localThrowable, paramObject, paramInt);
  }

  public void wrapAndThrow(SerializerProvider paramSerializerProvider, Throwable paramThrowable, Object paramObject, String paramString)
  {
    for (Throwable localThrowable = paramThrowable; ((localThrowable instanceof InvocationTargetException)) && (localThrowable.getCause() != null); localThrowable = localThrowable.getCause());
    if ((localThrowable instanceof Error))
      throw ((Error)localThrowable);
    if ((paramSerializerProvider == null) || (paramSerializerProvider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS)));
    for (int i = 1; (localThrowable instanceof IOException); i = 0)
    {
      if ((i != 0) && ((localThrowable instanceof JsonMappingException)))
        break label112;
      throw ((IOException)localThrowable);
    }
    if ((i == 0) && ((localThrowable instanceof RuntimeException)))
      throw ((RuntimeException)localThrowable);
    label112: throw JsonMappingException.wrapWithPath(localThrowable, paramObject, paramString);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.std.StdSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
