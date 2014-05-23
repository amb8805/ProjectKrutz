package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public abstract class ContainerSerializer<T> extends StdSerializer<T>
{
  protected ContainerSerializer(ContainerSerializer<?> paramContainerSerializer)
  {
    super(paramContainerSerializer._handledType, false);
  }

  protected ContainerSerializer(Class<T> paramClass)
  {
    super(paramClass);
  }

  protected ContainerSerializer(Class<?> paramClass, boolean paramBoolean)
  {
    super(paramClass, paramBoolean);
  }

  protected abstract ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer paramTypeSerializer);

  protected boolean hasContentTypeAnnotation(SerializerProvider paramSerializerProvider, BeanProperty paramBeanProperty)
  {
    if (paramBeanProperty != null)
    {
      AnnotationIntrospector localAnnotationIntrospector = paramSerializerProvider.getAnnotationIntrospector();
      if ((localAnnotationIntrospector != null) && (localAnnotationIntrospector.findSerializationContentType(paramBeanProperty.getMember(), paramBeanProperty.getType()) != null))
        return true;
    }
    return false;
  }

  public abstract boolean hasSingleElement(T paramT);

  public ContainerSerializer<?> withValueTypeSerializer(TypeSerializer paramTypeSerializer)
  {
    if (paramTypeSerializer == null)
      return this;
    return _withValueTypeSerializer(paramTypeSerializer);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.ContainerSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
