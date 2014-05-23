package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public final class AnnotatedMethod extends AnnotatedWithParams
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  protected final transient Method _method;
  protected Class<?>[] _paramClasses;
  protected AnnotatedMethod.Serialization _serialization;

  protected AnnotatedMethod(AnnotatedMethod.Serialization paramSerialization)
  {
    super(null, null);
    this._method = null;
    this._serialization = paramSerialization;
  }

  public AnnotatedMethod(Method paramMethod, AnnotationMap paramAnnotationMap, AnnotationMap[] paramArrayOfAnnotationMap)
  {
    super(paramAnnotationMap, paramArrayOfAnnotationMap);
    if (paramMethod == null)
      throw new IllegalArgumentException("Can not construct AnnotatedMethod with null Method");
    this._method = paramMethod;
  }

  public final Object call()
  {
    return this._method.invoke(null, new Object[0]);
  }

  public final Object call(Object[] paramArrayOfObject)
  {
    return this._method.invoke(null, paramArrayOfObject);
  }

  public final Object call1(Object paramObject)
  {
    return this._method.invoke(null, new Object[] { paramObject });
  }

  public final Method getAnnotated()
  {
    return this._method;
  }

  public final Class<?> getDeclaringClass()
  {
    return this._method.getDeclaringClass();
  }

  public final String getFullName()
  {
    return getDeclaringClass().getName() + "#" + getName() + "(" + getParameterCount() + " params)";
  }

  public final Type getGenericParameterType(int paramInt)
  {
    Type[] arrayOfType = this._method.getGenericParameterTypes();
    if (paramInt >= arrayOfType.length)
      return null;
    return arrayOfType[paramInt];
  }

  public final Type getGenericType()
  {
    return this._method.getGenericReturnType();
  }

  public final Method getMember()
  {
    return this._method;
  }

  public final String getName()
  {
    return this._method.getName();
  }

  public final int getParameterCount()
  {
    return getRawParameterTypes().length;
  }

  public final Class<?> getRawParameterType(int paramInt)
  {
    Class[] arrayOfClass = getRawParameterTypes();
    if (paramInt >= arrayOfClass.length)
      return null;
    return arrayOfClass[paramInt];
  }

  public final Class<?>[] getRawParameterTypes()
  {
    if (this._paramClasses == null)
      this._paramClasses = this._method.getParameterTypes();
    return this._paramClasses;
  }

  public final Class<?> getRawReturnType()
  {
    return this._method.getReturnType();
  }

  public final Class<?> getRawType()
  {
    return this._method.getReturnType();
  }

  public final JavaType getType(TypeBindings paramTypeBindings)
  {
    return getType(paramTypeBindings, this._method.getTypeParameters());
  }

  public final Object getValue(Object paramObject)
  {
    try
    {
      Object localObject = this._method.invoke(paramObject, new Object[0]);
      return localObject;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new IllegalArgumentException("Failed to getValue() with method " + getFullName() + ": " + localIllegalAccessException.getMessage(), localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new IllegalArgumentException("Failed to getValue() with method " + getFullName() + ": " + localInvocationTargetException.getMessage(), localInvocationTargetException);
    }
  }

  final Object readResolve()
  {
    Class localClass = this._serialization.clazz;
    try
    {
      Method localMethod = localClass.getDeclaredMethod(this._serialization.name, this._serialization.args);
      if (!localMethod.isAccessible())
        ClassUtil.checkAndFixAccess(localMethod);
      AnnotatedMethod localAnnotatedMethod = new AnnotatedMethod(localMethod, null, null);
      return localAnnotatedMethod;
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
      this._method.invoke(paramObject1, new Object[] { paramObject2 });
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new IllegalArgumentException("Failed to setValue() with method " + getFullName() + ": " + localIllegalAccessException.getMessage(), localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new IllegalArgumentException("Failed to setValue() with method " + getFullName() + ": " + localInvocationTargetException.getMessage(), localInvocationTargetException);
    }
  }

  public final String toString()
  {
    return "[method " + getFullName() + "]";
  }

  public final AnnotatedMethod withAnnotations(AnnotationMap paramAnnotationMap)
  {
    return new AnnotatedMethod(this._method, paramAnnotationMap, this._paramAnnotations);
  }

  public final AnnotatedMethod withMethod(Method paramMethod)
  {
    return new AnnotatedMethod(paramMethod, this._annotations, this._paramAnnotations);
  }

  final Object writeReplace()
  {
    return new AnnotatedMethod(new AnnotatedMethod.Serialization(this._method));
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.introspect.AnnotatedMethod
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
