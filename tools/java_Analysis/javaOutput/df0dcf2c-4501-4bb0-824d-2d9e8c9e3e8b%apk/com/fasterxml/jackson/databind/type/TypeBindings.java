package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class TypeBindings
{
  private static final JavaType[] NO_TYPES = new JavaType[0];
  public static final JavaType UNBOUND = new SimpleType(Object.class);
  protected Map<String, JavaType> _bindings;
  protected final Class<?> _contextClass;
  protected final JavaType _contextType;
  private final TypeBindings _parentBindings;
  protected HashSet<String> _placeholders;
  protected final TypeFactory _typeFactory;

  public TypeBindings(TypeFactory paramTypeFactory, JavaType paramJavaType)
  {
    this(paramTypeFactory, null, paramJavaType.getRawClass(), paramJavaType);
  }

  private TypeBindings(TypeFactory paramTypeFactory, TypeBindings paramTypeBindings, Class<?> paramClass, JavaType paramJavaType)
  {
    this._typeFactory = paramTypeFactory;
    this._parentBindings = paramTypeBindings;
    this._contextClass = paramClass;
    this._contextType = paramJavaType;
  }

  public TypeBindings(TypeFactory paramTypeFactory, Class<?> paramClass)
  {
    this(paramTypeFactory, null, paramClass, null);
  }

  public void _addPlaceholder(String paramString)
  {
    if (this._placeholders == null)
      this._placeholders = new HashSet();
    this._placeholders.add(paramString);
  }

  protected void _resolve()
  {
    _resolveBindings(this._contextClass);
    if (this._contextType != null)
    {
      int i = this._contextType.containedTypeCount();
      if (i > 0)
        for (int j = 0; j < i; j++)
          addBinding(this._contextType.containedTypeName(j), this._contextType.containedType(j));
    }
    if (this._bindings == null)
      this._bindings = Collections.emptyMap();
  }

  protected void _resolveBindings(Type paramType)
  {
    int i = 0;
    if (paramType == null)
      return;
    ParameterizedType localParameterizedType;
    if ((paramType instanceof ParameterizedType))
    {
      localParameterizedType = (ParameterizedType)paramType;
      Type[] arrayOfType2 = localParameterizedType.getActualTypeArguments();
      if ((arrayOfType2 != null) && (arrayOfType2.length > 0))
      {
        Class localClass3 = (Class)localParameterizedType.getRawType();
        TypeVariable[] arrayOfTypeVariable2 = localClass3.getTypeParameters();
        if (arrayOfTypeVariable2.length != arrayOfType2.length)
          throw new IllegalArgumentException("Strange parametrized type (in class " + localClass3.getName() + "): number of type arguments != number of type parameters (" + arrayOfType2.length + " vs " + arrayOfTypeVariable2.length + ")");
        int m = arrayOfType2.length;
        int n = 0;
        if (n < m)
        {
          String str2 = arrayOfTypeVariable2[n].getName();
          if (this._bindings == null)
            this._bindings = new LinkedHashMap();
          while (true)
          {
            _addPlaceholder(str2);
            this._bindings.put(str2, this._typeFactory._constructType(arrayOfType2[n], this));
            do
            {
              n++;
              break;
            }
            while (this._bindings.containsKey(str2));
          }
        }
      }
    }
    Class localClass1;
    for (Object localObject = (Class)localParameterizedType.getRawType(); ; localObject = localClass1)
    {
      _resolveBindings(((Class)localObject).getGenericSuperclass());
      Type[] arrayOfType1 = ((Class)localObject).getGenericInterfaces();
      int j = arrayOfType1.length;
      while (i < j)
      {
        _resolveBindings(arrayOfType1[i]);
        i++;
      }
      break;
      if (!(paramType instanceof Class))
        break;
      localClass1 = (Class)paramType;
      Class localClass2 = localClass1.getDeclaringClass();
      if ((localClass2 != null) && (!localClass2.isAssignableFrom(localClass1)))
        _resolveBindings(localClass1.getDeclaringClass());
      TypeVariable[] arrayOfTypeVariable1 = localClass1.getTypeParameters();
      if ((arrayOfTypeVariable1 != null) && (arrayOfTypeVariable1.length > 0))
      {
        JavaType localJavaType = this._contextType;
        JavaType[] arrayOfJavaType = null;
        if (localJavaType != null)
        {
          boolean bool = localClass1.isAssignableFrom(this._contextType.getRawClass());
          arrayOfJavaType = null;
          if (bool)
            arrayOfJavaType = this._typeFactory.findTypeParameters(this._contextType, localClass1);
        }
        int k = 0;
        if (k < arrayOfTypeVariable1.length)
        {
          TypeVariable localTypeVariable = arrayOfTypeVariable1[k];
          String str1 = localTypeVariable.getName();
          Type localType = localTypeVariable.getBounds()[0];
          if (localType != null)
          {
            if (this._bindings != null)
              break label476;
            this._bindings = new LinkedHashMap();
            label442: _addPlaceholder(str1);
            if (arrayOfJavaType == null)
              break label493;
            this._bindings.put(str1, arrayOfJavaType[k]);
          }
          while (true)
          {
            k++;
            break;
            label476: if (!this._bindings.containsKey(str1))
            {
              break label442;
              label493: this._bindings.put(str1, this._typeFactory._constructType(localType, this));
            }
          }
        }
      }
    }
  }

  public void addBinding(String paramString, JavaType paramJavaType)
  {
    if ((this._bindings == null) || (this._bindings.size() == 0))
      this._bindings = new LinkedHashMap();
    this._bindings.put(paramString, paramJavaType);
  }

  public TypeBindings childInstance()
  {
    return new TypeBindings(this._typeFactory, this, this._contextClass, this._contextType);
  }

  public JavaType findType(String paramString)
  {
    if (this._bindings == null)
      _resolve();
    JavaType localJavaType = (JavaType)this._bindings.get(paramString);
    if (localJavaType != null)
      return localJavaType;
    if ((this._placeholders != null) && (this._placeholders.contains(paramString)))
      return UNBOUND;
    if (this._parentBindings != null)
      return this._parentBindings.findType(paramString);
    if ((this._contextClass != null) && (this._contextClass.getEnclosingClass() != null) && (!Modifier.isStatic(this._contextClass.getModifiers())))
      return UNBOUND;
    String str;
    if (this._contextClass != null)
      str = this._contextClass.getName();
    while (true)
    {
      throw new IllegalArgumentException("Type variable '" + paramString + "' can not be resolved (with context of class " + str + ")");
      if (this._contextType != null)
        str = this._contextType.toString();
      else
        str = "UNKNOWN";
    }
  }

  public JavaType resolveType(Type paramType)
  {
    return this._typeFactory._constructType(paramType, this);
  }

  public String toString()
  {
    if (this._bindings == null)
      _resolve();
    StringBuilder localStringBuilder = new StringBuilder("[TypeBindings for ");
    if (this._contextType != null)
      localStringBuilder.append(this._contextType.toString());
    while (true)
    {
      localStringBuilder.append(": ").append(this._bindings).append("]");
      return localStringBuilder.toString();
      localStringBuilder.append(this._contextClass.getName());
    }
  }

  public JavaType[] typesAsArray()
  {
    if (this._bindings == null)
      _resolve();
    if (this._bindings.size() == 0)
      return NO_TYPES;
    return (JavaType[])this._bindings.values().toArray(new JavaType[this._bindings.size()]);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.type.TypeBindings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
