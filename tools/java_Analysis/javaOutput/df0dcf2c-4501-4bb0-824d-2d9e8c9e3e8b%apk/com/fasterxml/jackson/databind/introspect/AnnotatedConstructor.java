package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class AnnotatedConstructor extends AnnotatedWithParams
{
  private static final long serialVersionUID = 1L;
  protected final Constructor<?> _constructor;
  protected AnnotatedConstructor.Serialization _serialization;

  protected AnnotatedConstructor(AnnotatedConstructor.Serialization paramSerialization)
  {
    super(null, null);
    this._constructor = null;
    this._serialization = paramSerialization;
  }

  public AnnotatedConstructor(Constructor<?> paramConstructor, AnnotationMap paramAnnotationMap, AnnotationMap[] paramArrayOfAnnotationMap)
  {
    super(paramAnnotationMap, paramArrayOfAnnotationMap);
    if (paramConstructor == null)
      throw new IllegalArgumentException("Null constructor not allowed");
    this._constructor = paramConstructor;
  }

  public final Object call()
  {
    return this._constructor.newInstance(new Object[0]);
  }

  public final Object call(Object[] paramArrayOfObject)
  {
    return this._constructor.newInstance(paramArrayOfObject);
  }

  public final Object call1(Object paramObject)
  {
    return this._constructor.newInstance(new Object[] { paramObject });
  }

  public final Constructor<?> getAnnotated()
  {
    return this._constructor;
  }

  public final Class<?> getDeclaringClass()
  {
    return this._constructor.getDeclaringClass();
  }

  public final Type getGenericParameterType(int paramInt)
  {
    Type[] arrayOfType = this._constructor.getGenericParameterTypes();
    if (paramInt >= arrayOfType.length)
      return null;
    return arrayOfType[paramInt];
  }

  public final Type getGenericType()
  {
    return getRawType();
  }

  public final Member getMember()
  {
    return this._constructor;
  }

  public final String getName()
  {
    return this._constructor.getName();
  }

  public final int getParameterCount()
  {
    return this._constructor.getParameterTypes().length;
  }

  public final Class<?> getRawParameterType(int paramInt)
  {
    Class[] arrayOfClass = this._constructor.getParameterTypes();
    if (paramInt >= arrayOfClass.length)
      return null;
    return arrayOfClass[paramInt];
  }

  public final Class<?> getRawType()
  {
    return this._constructor.getDeclaringClass();
  }

  public final JavaType getType(TypeBindings paramTypeBindings)
  {
    return getType(paramTypeBindings, this._constructor.getTypeParameters());
  }

  public final Object getValue(Object paramObject)
  {
    throw new UnsupportedOperationException("Cannot call getValue() on constructor of " + getDeclaringClass().getName());
  }

  final Object readResolve()
  {
    Class localClass = this._serialization.clazz;
    try
    {
      Constructor localConstructor = localClass.getDeclaredConstructor(this._serialization.args);
      if (!localConstructor.isAccessible())
        ClassUtil.checkAndFixAccess(localConstructor);
      AnnotatedConstructor localAnnotatedConstructor = new AnnotatedConstructor(localConstructor, null, null);
      return localAnnotatedConstructor;
    }
    catch (Exception localException)
    {
    }
    throw new IllegalArgumentException("Could not find constructor with " + this._serialization.args.length + " args from Class '" + localClass.getName());
  }

  public final void setValue(Object paramObject1, Object paramObject2)
  {
    throw new UnsupportedOperationException("Cannot call setValue() on constructor of " + getDeclaringClass().getName());
  }

  public final String toString()
  {
    return "[constructor for " + getName() + ", annotations: " + this._annotations + "]";
  }

  final Object writeReplace()
  {
    return new AnnotatedConstructor(new AnnotatedConstructor.Serialization(this._constructor));
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.introspect.AnnotatedConstructor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
