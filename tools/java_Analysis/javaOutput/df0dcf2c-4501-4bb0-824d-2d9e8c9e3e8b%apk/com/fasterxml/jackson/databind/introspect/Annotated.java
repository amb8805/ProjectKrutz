package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;

public abstract class Annotated
{
  protected Annotated()
  {
  }

  protected abstract AnnotationMap getAllAnnotations();

  public abstract AnnotatedElement getAnnotated();

  public abstract <A extends Annotation> A getAnnotation(Class<A> paramClass);

  public abstract Type getGenericType();

  public abstract String getName();

  public abstract Class<?> getRawType();

  public JavaType getType(TypeBindings paramTypeBindings)
  {
    return paramTypeBindings.resolveType(getGenericType());
  }

  public final <A extends Annotation> boolean hasAnnotation(Class<A> paramClass)
  {
    return getAnnotation(paramClass) != null;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.introspect.Annotated
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
