package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class AnnotatedField extends AnnotatedMember
  implements Serializable
{
  private static final long serialVersionUID = 7364428299211355871L;
  protected final transient Field _field;
  protected AnnotatedField.Serialization _serialization;

  protected AnnotatedField(AnnotatedField.Serialization paramSerialization)
  {
    super(null);
    this._field = null;
    this._serialization = paramSerialization;
  }

  public AnnotatedField(Field paramField, AnnotationMap paramAnnotationMap)
  {
    super(paramAnnotationMap);
    this._field = paramField;
  }

  public final Field getAnnotated()
  {
    return this._field;
  }

  public final <A extends Annotation> A getAnnotation(Class<A> paramClass)
  {
    return this._annotations.get(paramClass);
  }

  public final Class<?> getDeclaringClass()
  {
    return this._field.getDeclaringClass();
  }

  public final String getFullName()
  {
    return getDeclaringClass().getName() + "#" + getName();
  }

  public final Type getGenericType()
  {
    return this._field.getGenericType();
  }

  public final Member getMember()
  {
    return this._field;
  }

  public final String getName()
  {
    return this._field.getName();
  }

  public final Class<?> getRawType()
  {
    return this._field.getType();
  }

  public final Object getValue(Object paramObject)
  {
    try
    {
      Object localObject = this._field.get(paramObject);
      return localObject;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new IllegalArgumentException("Failed to getValue() for field " + getFullName() + ": " + localIllegalAccessException.getMessage(), localIllegalAccessException);
    }
  }

  final Object readResolve()
  {
    Class localClass = this._serialization.clazz;
    try
    {
      Field localField = localClass.getDeclaredField(this._serialization.name);
      if (!localField.isAccessible())
        ClassUtil.checkAndFixAccess(localField);
      AnnotatedField localAnnotatedField = new AnnotatedField(localField, null);
      return localAnnotatedField;
    }
    catch (Exception localException)
    {
    }
    throw new IllegalArgumentException("Could not find method '" + this._serialization.name + "' from Class '" + localClass.getName());
  }

  public final void setValue(Object paramObject1, Object paramObject2)
  {
    try
    {
      this._field.set(paramObject1, paramObject2);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new IllegalArgumentException("Failed to setValue() for field " + getFullName() + ": " + localIllegalAccessException.getMessage(), localIllegalAccessException);
    }
  }

  public final String toString()
  {
    return "[field " + getFullName() + "]";
  }

  public final AnnotatedField withAnnotations(AnnotationMap paramAnnotationMap)
  {
    return new AnnotatedField(this._field, paramAnnotationMap);
  }

  final Object writeReplace()
  {
    return new AnnotatedField(new AnnotatedField.Serialization(this._field));
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.introspect.AnnotatedField
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
