package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public abstract class AnnotatedWithParams extends AnnotatedMember
{
  private static final long serialVersionUID = 1L;
  protected final AnnotationMap[] _paramAnnotations;

  protected AnnotatedWithParams(AnnotationMap paramAnnotationMap, AnnotationMap[] paramArrayOfAnnotationMap)
  {
    super(paramAnnotationMap);
    this._paramAnnotations = paramArrayOfAnnotationMap;
  }

  public final void addOrOverrideParam(int paramInt, Annotation paramAnnotation)
  {
    AnnotationMap localAnnotationMap = this._paramAnnotations[paramInt];
    if (localAnnotationMap == null)
    {
      localAnnotationMap = new AnnotationMap();
      this._paramAnnotations[paramInt] = localAnnotationMap;
    }
    localAnnotationMap.add(paramAnnotation);
  }

  public abstract Object call();

  public abstract Object call(Object[] paramArrayOfObject);

  public abstract Object call1(Object paramObject);

  public final <A extends Annotation> A getAnnotation(Class<A> paramClass)
  {
    return this._annotations.get(paramClass);
  }

  public abstract Type getGenericParameterType(int paramInt);

  public final AnnotatedParameter getParameter(int paramInt)
  {
    return new AnnotatedParameter(this, getGenericParameterType(paramInt), getParameterAnnotations(paramInt), paramInt);
  }

  public final AnnotationMap getParameterAnnotations(int paramInt)
  {
    if ((this._paramAnnotations != null) && (paramInt >= 0) && (paramInt <= this._paramAnnotations.length))
      return this._paramAnnotations[paramInt];
    return null;
  }

  protected JavaType getType(TypeBindings paramTypeBindings, TypeVariable<?>[] paramArrayOfTypeVariable)
  {
    if ((paramArrayOfTypeVariable != null) && (paramArrayOfTypeVariable.length > 0))
    {
      paramTypeBindings = paramTypeBindings.childInstance();
      int i = paramArrayOfTypeVariable.length;
      int j = 0;
      if (j < i)
      {
        TypeVariable<?> localTypeVariable = paramArrayOfTypeVariable[j];
        paramTypeBindings._addPlaceholder(localTypeVariable.getName());
        Type localType = localTypeVariable.getBounds()[0];
        if (localType == null);
        for (JavaType localJavaType = TypeFactory.unknownType(); ; localJavaType = paramTypeBindings.resolveType(localType))
        {
          paramTypeBindings.addBinding(localTypeVariable.getName(), localJavaType);
          j++;
          break;
        }
      }
    }
    return paramTypeBindings.resolveType(getGenericType());
  }

  protected AnnotatedParameter replaceParameterAnnotations(int paramInt, AnnotationMap paramAnnotationMap)
  {
    this._paramAnnotations[paramInt] = paramAnnotationMap;
    return getParameter(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
