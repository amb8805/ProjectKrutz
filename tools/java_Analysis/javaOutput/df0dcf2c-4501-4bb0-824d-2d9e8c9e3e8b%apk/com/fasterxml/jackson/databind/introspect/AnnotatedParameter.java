package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class AnnotatedParameter extends AnnotatedMember
{
  private static final long serialVersionUID = 1L;
  protected final int _index;
  protected final AnnotatedWithParams _owner;
  protected final Type _type;

  public AnnotatedParameter(AnnotatedWithParams paramAnnotatedWithParams, Type paramType, AnnotationMap paramAnnotationMap, int paramInt)
  {
    super(paramAnnotationMap);
    this._owner = paramAnnotatedWithParams;
    this._type = paramType;
    this._index = paramInt;
  }

  public final AnnotatedElement getAnnotated()
  {
    return null;
  }

  public final <A extends Annotation> A getAnnotation(Class<A> paramClass)
  {
    if (this._annotations == null)
      return null;
    return this._annotations.get(paramClass);
  }

  public final Class<?> getDeclaringClass()
  {
    return this._owner.getDeclaringClass();
  }

  public final Type getGenericType()
  {
    return this._type;
  }

  public final int getIndex()
  {
    return this._index;
  }

  public final Member getMember()
  {
    return this._owner.getMember();
  }

  public final String getName()
  {
    return "";
  }

  public final AnnotatedWithParams getOwner()
  {
    return this._owner;
  }

  public final Type getParameterType()
  {
    return this._type;
  }

  public final Class<?> getRawType()
  {
    if ((this._type instanceof Class))
      return (Class)this._type;
    return TypeFactory.defaultInstance().constructType(this._type).getRawClass();
  }

  public final Object getValue(Object paramObject)
  {
    throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of " + getDeclaringClass().getName());
  }

  public final void setValue(Object paramObject1, Object paramObject2)
  {
    throw new UnsupportedOperationException("Cannot call setValue() on constructor parameter of " + getDeclaringClass().getName());
  }

  public final String toString()
  {
    return "[parameter #" + getIndex() + ", annotations: " + this._annotations + "]";
  }

  public final AnnotatedParameter withAnnotations(AnnotationMap paramAnnotationMap)
  {
    if (paramAnnotationMap == this._annotations)
      return this;
    return this._owner.replaceParameterAnnotations(this._index, paramAnnotationMap);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.introspect.AnnotatedParameter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
