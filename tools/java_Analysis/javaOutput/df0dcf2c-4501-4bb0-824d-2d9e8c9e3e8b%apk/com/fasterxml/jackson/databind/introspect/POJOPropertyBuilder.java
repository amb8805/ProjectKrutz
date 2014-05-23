package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty;

public class POJOPropertyBuilder extends BeanPropertyDefinition
  implements Comparable<POJOPropertyBuilder>
{
  protected final AnnotationIntrospector _annotationIntrospector;
  protected POJOPropertyBuilder.Linked<AnnotatedParameter> _ctorParameters;
  protected POJOPropertyBuilder.Linked<AnnotatedField> _fields;
  protected final boolean _forSerialization;
  protected POJOPropertyBuilder.Linked<AnnotatedMethod> _getters;
  protected final String _internalName;
  protected final String _name;
  protected POJOPropertyBuilder.Linked<AnnotatedMethod> _setters;

  public POJOPropertyBuilder(POJOPropertyBuilder paramPOJOPropertyBuilder, String paramString)
  {
    this._internalName = paramPOJOPropertyBuilder._internalName;
    this._name = paramString;
    this._annotationIntrospector = paramPOJOPropertyBuilder._annotationIntrospector;
    this._fields = paramPOJOPropertyBuilder._fields;
    this._ctorParameters = paramPOJOPropertyBuilder._ctorParameters;
    this._getters = paramPOJOPropertyBuilder._getters;
    this._setters = paramPOJOPropertyBuilder._setters;
    this._forSerialization = paramPOJOPropertyBuilder._forSerialization;
  }

  public POJOPropertyBuilder(String paramString, AnnotationIntrospector paramAnnotationIntrospector, boolean paramBoolean)
  {
    this._internalName = paramString;
    this._name = paramString;
    this._annotationIntrospector = paramAnnotationIntrospector;
    this._forSerialization = paramBoolean;
  }

  private <T> boolean _anyExplicitNames(POJOPropertyBuilder.Linked<T> paramLinked)
  {
    while (paramLinked != null)
    {
      if ((paramLinked.explicitName != null) && (paramLinked.explicitName.length() > 0))
        return true;
      paramLinked = paramLinked.next;
    }
    return false;
  }

  private <T> boolean _anyIgnorals(POJOPropertyBuilder.Linked<T> paramLinked)
  {
    while (paramLinked != null)
    {
      if (paramLinked.isMarkedIgnored)
        return true;
      paramLinked = paramLinked.next;
    }
    return false;
  }

  private <T> boolean _anyVisible(POJOPropertyBuilder.Linked<T> paramLinked)
  {
    while (paramLinked != null)
    {
      if (paramLinked.isVisible)
        return true;
      paramLinked = paramLinked.next;
    }
    return false;
  }

  private AnnotationMap _mergeAnnotations(int paramInt, POJOPropertyBuilder.Linked<? extends AnnotatedMember>[] paramArrayOfLinked)
  {
    AnnotationMap localAnnotationMap = ((AnnotatedMember)paramArrayOfLinked[paramInt].value).getAllAnnotations();
    for (int i = paramInt + 1; i < paramArrayOfLinked.length; i++)
      if (paramArrayOfLinked[i] != null)
        return AnnotationMap.merge(localAnnotationMap, _mergeAnnotations(i, paramArrayOfLinked));
    return localAnnotationMap;
  }

  private <T> POJOPropertyBuilder.Linked<T> _removeIgnored(POJOPropertyBuilder.Linked<T> paramLinked)
  {
    if (paramLinked == null)
      return paramLinked;
    return paramLinked.withoutIgnored();
  }

  private <T> POJOPropertyBuilder.Linked<T> _removeNonVisible(POJOPropertyBuilder.Linked<T> paramLinked)
  {
    if (paramLinked == null)
      return paramLinked;
    return paramLinked.withoutNonVisible();
  }

  private <T> POJOPropertyBuilder.Linked<T> _trimByVisibility(POJOPropertyBuilder.Linked<T> paramLinked)
  {
    if (paramLinked == null)
      return paramLinked;
    return paramLinked.trimByVisibility();
  }

  private POJOPropertyBuilder.Linked<? extends AnnotatedMember> findRenamed(POJOPropertyBuilder.Linked<? extends AnnotatedMember> paramLinked1, POJOPropertyBuilder.Linked<? extends AnnotatedMember> paramLinked2)
  {
    Object localObject1 = paramLinked2;
    Object localObject2 = paramLinked1;
    if (localObject2 != null)
    {
      String str = ((POJOPropertyBuilder.Linked)localObject2).explicitName;
      if ((str != null) && (!str.equals(this._name)))
      {
        if (localObject1 != null)
          break label51;
        localObject1 = localObject2;
      }
      label51: 
      while (str.equals(((POJOPropertyBuilder.Linked)localObject1).explicitName))
      {
        localObject2 = ((POJOPropertyBuilder.Linked)localObject2).next;
        break;
      }
      throw new IllegalStateException("Conflicting property name definitions: '" + ((POJOPropertyBuilder.Linked)localObject1).explicitName + "' (for " + ((POJOPropertyBuilder.Linked)localObject1).value + ") vs '" + ((POJOPropertyBuilder.Linked)localObject2).explicitName + "' (for " + ((POJOPropertyBuilder.Linked)localObject2).value + ")");
    }
    return localObject1;
  }

  private static <T> POJOPropertyBuilder.Linked<T> merge(POJOPropertyBuilder.Linked<T> paramLinked1, POJOPropertyBuilder.Linked<T> paramLinked2)
  {
    if (paramLinked1 == null)
      return paramLinked2;
    if (paramLinked2 == null)
      return paramLinked1;
    return POJOPropertyBuilder.Linked.access$000(paramLinked1, paramLinked2);
  }

  public void addAll(POJOPropertyBuilder paramPOJOPropertyBuilder)
  {
    this._fields = merge(this._fields, paramPOJOPropertyBuilder._fields);
    this._ctorParameters = merge(this._ctorParameters, paramPOJOPropertyBuilder._ctorParameters);
    this._getters = merge(this._getters, paramPOJOPropertyBuilder._getters);
    this._setters = merge(this._setters, paramPOJOPropertyBuilder._setters);
  }

  public void addCtor(AnnotatedParameter paramAnnotatedParameter, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this._ctorParameters = new POJOPropertyBuilder.Linked(paramAnnotatedParameter, this._ctorParameters, paramString, paramBoolean1, paramBoolean2);
  }

  public void addField(AnnotatedField paramAnnotatedField, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this._fields = new POJOPropertyBuilder.Linked(paramAnnotatedField, this._fields, paramString, paramBoolean1, paramBoolean2);
  }

  public void addGetter(AnnotatedMethod paramAnnotatedMethod, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this._getters = new POJOPropertyBuilder.Linked(paramAnnotatedMethod, this._getters, paramString, paramBoolean1, paramBoolean2);
  }

  public void addSetter(AnnotatedMethod paramAnnotatedMethod, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this._setters = new POJOPropertyBuilder.Linked(paramAnnotatedMethod, this._setters, paramString, paramBoolean1, paramBoolean2);
  }

  public boolean anyIgnorals()
  {
    return (_anyIgnorals(this._fields)) || (_anyIgnorals(this._getters)) || (_anyIgnorals(this._setters)) || (_anyIgnorals(this._ctorParameters));
  }

  public boolean anyVisible()
  {
    return (_anyVisible(this._fields)) || (_anyVisible(this._getters)) || (_anyVisible(this._setters)) || (_anyVisible(this._ctorParameters));
  }

  public int compareTo(POJOPropertyBuilder paramPOJOPropertyBuilder)
  {
    if (this._ctorParameters != null)
    {
      if (paramPOJOPropertyBuilder._ctorParameters == null)
        return -1;
    }
    else if (paramPOJOPropertyBuilder._ctorParameters != null)
      return 1;
    return getName().compareTo(paramPOJOPropertyBuilder.getName());
  }

  public String findNewName()
  {
    POJOPropertyBuilder.Linked localLinked1 = findRenamed(this._fields, null);
    POJOPropertyBuilder.Linked localLinked2 = findRenamed(this._getters, localLinked1);
    POJOPropertyBuilder.Linked localLinked3 = findRenamed(this._setters, localLinked2);
    POJOPropertyBuilder.Linked localLinked4 = findRenamed(this._ctorParameters, localLinked3);
    if (localLinked4 == null)
      return null;
    return localLinked4.explicitName;
  }

  public AnnotationIntrospector.ReferenceProperty findReferenceType()
  {
    return (AnnotationIntrospector.ReferenceProperty)fromMemberAnnotations(new POJOPropertyBuilder.2(this));
  }

  public Class<?>[] findViews()
  {
    return (Class[])fromMemberAnnotations(new POJOPropertyBuilder.1(this));
  }

  protected <T> T fromMemberAnnotations(POJOPropertyBuilder.WithMember<T> paramWithMember)
  {
    AnnotationIntrospector localAnnotationIntrospector = this._annotationIntrospector;
    Object localObject = null;
    if (localAnnotationIntrospector != null)
    {
      if (!this._forSerialization)
        break label78;
      POJOPropertyBuilder.Linked localLinked2 = this._getters;
      localObject = null;
      if (localLinked2 == null);
    }
    for (localObject = paramWithMember.withMember((AnnotatedMember)this._getters.value); ; localObject = paramWithMember.withMember((AnnotatedMember)this._setters.value))
      label78: 
      do
      {
        if ((localObject == null) && (this._fields != null))
          localObject = paramWithMember.withMember((AnnotatedMember)this._fields.value);
        return localObject;
        POJOPropertyBuilder.Linked localLinked1 = this._ctorParameters;
        localObject = null;
        if (localLinked1 != null)
          localObject = paramWithMember.withMember((AnnotatedMember)this._ctorParameters.value);
      }
      while ((localObject != null) || (this._setters == null));
  }

  public AnnotatedMember getAccessor()
  {
    Object localObject = getGetter();
    if (localObject == null)
      localObject = getField();
    return localObject;
  }

  public AnnotatedParameter getConstructorParameter()
  {
    if (this._ctorParameters == null)
      return null;
    POJOPropertyBuilder.Linked localLinked;
    for (Object localObject = this._ctorParameters; ; localObject = localLinked)
    {
      if ((((AnnotatedParameter)((POJOPropertyBuilder.Linked)localObject).value).getOwner() instanceof AnnotatedConstructor))
        return (AnnotatedParameter)((POJOPropertyBuilder.Linked)localObject).value;
      localLinked = ((POJOPropertyBuilder.Linked)localObject).next;
      if (localLinked == null)
        return (AnnotatedParameter)this._ctorParameters.value;
    }
  }

  public AnnotatedField getField()
  {
    if (this._fields == null)
    {
      localObject1 = null;
      return localObject1;
    }
    AnnotatedField localAnnotatedField = (AnnotatedField)this._fields.value;
    POJOPropertyBuilder.Linked localLinked = this._fields.next;
    Object localObject1 = localAnnotatedField;
    label32: Object localObject2;
    Class localClass1;
    Class localClass2;
    if (localLinked != null)
    {
      localObject2 = (AnnotatedField)localLinked.value;
      localClass1 = ((AnnotatedField)localObject1).getDeclaringClass();
      localClass2 = ((AnnotatedField)localObject2).getDeclaringClass();
      if (localClass1 == localClass2)
        break label96;
      if (!localClass1.isAssignableFrom(localClass2))
        break label86;
    }
    while (true)
    {
      localLinked = localLinked.next;
      localObject1 = localObject2;
      break label32;
      break;
      label86: if (!localClass2.isAssignableFrom(localClass1))
        label96: throw new IllegalArgumentException("Multiple fields representing property \"" + getName() + "\": " + ((AnnotatedField)localObject1).getFullName() + " vs " + ((AnnotatedField)localObject2).getFullName());
      localObject2 = localObject1;
    }
  }

  public AnnotatedMethod getGetter()
  {
    if (this._getters == null)
    {
      localObject1 = null;
      return localObject1;
    }
    AnnotatedMethod localAnnotatedMethod = (AnnotatedMethod)this._getters.value;
    POJOPropertyBuilder.Linked localLinked = this._getters.next;
    Object localObject1 = localAnnotatedMethod;
    label32: Object localObject2;
    Class localClass1;
    Class localClass2;
    if (localLinked != null)
    {
      localObject2 = (AnnotatedMethod)localLinked.value;
      localClass1 = ((AnnotatedMethod)localObject1).getDeclaringClass();
      localClass2 = ((AnnotatedMethod)localObject2).getDeclaringClass();
      if (localClass1 == localClass2)
        break label96;
      if (!localClass1.isAssignableFrom(localClass2))
        break label86;
    }
    while (true)
    {
      localLinked = localLinked.next;
      localObject1 = localObject2;
      break label32;
      break;
      label86: if (!localClass2.isAssignableFrom(localClass1))
        label96: throw new IllegalArgumentException("Conflicting getter definitions for property \"" + getName() + "\": " + ((AnnotatedMethod)localObject1).getFullName() + " vs " + ((AnnotatedMethod)localObject2).getFullName());
      localObject2 = localObject1;
    }
  }

  public String getInternalName()
  {
    return this._internalName;
  }

  public AnnotatedMember getMutator()
  {
    Object localObject = getConstructorParameter();
    if (localObject == null)
    {
      localObject = getSetter();
      if (localObject == null)
        localObject = getField();
    }
    return localObject;
  }

  public String getName()
  {
    return this._name;
  }

  public AnnotatedMember getPrimaryMember()
  {
    if (this._forSerialization)
      return getAccessor();
    return getMutator();
  }

  public AnnotatedMethod getSetter()
  {
    if (this._setters == null)
    {
      localObject1 = null;
      return localObject1;
    }
    AnnotatedMethod localAnnotatedMethod = (AnnotatedMethod)this._setters.value;
    POJOPropertyBuilder.Linked localLinked = this._setters.next;
    Object localObject1 = localAnnotatedMethod;
    label32: Object localObject2;
    Class localClass1;
    Class localClass2;
    if (localLinked != null)
    {
      localObject2 = (AnnotatedMethod)localLinked.value;
      localClass1 = ((AnnotatedMethod)localObject1).getDeclaringClass();
      localClass2 = ((AnnotatedMethod)localObject2).getDeclaringClass();
      if (localClass1 == localClass2)
        break label96;
      if (!localClass1.isAssignableFrom(localClass2))
        break label86;
    }
    while (true)
    {
      localLinked = localLinked.next;
      localObject1 = localObject2;
      break label32;
      break;
      label86: if (!localClass2.isAssignableFrom(localClass1))
        label96: throw new IllegalArgumentException("Conflicting setter definitions for property \"" + getName() + "\": " + ((AnnotatedMethod)localObject1).getFullName() + " vs " + ((AnnotatedMethod)localObject2).getFullName());
      localObject2 = localObject1;
    }
  }

  public boolean hasConstructorParameter()
  {
    return this._ctorParameters != null;
  }

  public boolean hasField()
  {
    return this._fields != null;
  }

  public boolean hasGetter()
  {
    return this._getters != null;
  }

  public boolean hasSetter()
  {
    return this._setters != null;
  }

  public boolean isExplicitlyIncluded()
  {
    return (_anyExplicitNames(this._fields)) || (_anyExplicitNames(this._getters)) || (_anyExplicitNames(this._setters)) || (_anyExplicitNames(this._ctorParameters));
  }

  public boolean isTypeId()
  {
    Boolean localBoolean = (Boolean)fromMemberAnnotations(new POJOPropertyBuilder.3(this));
    return (localBoolean != null) && (localBoolean.booleanValue());
  }

  public void mergeAnnotations(boolean paramBoolean)
  {
    if (paramBoolean)
      if (this._getters != null)
      {
        POJOPropertyBuilder.Linked[] arrayOfLinked5 = new POJOPropertyBuilder.Linked[4];
        arrayOfLinked5[0] = this._getters;
        arrayOfLinked5[1] = this._fields;
        arrayOfLinked5[2] = this._ctorParameters;
        arrayOfLinked5[3] = this._setters;
        AnnotationMap localAnnotationMap5 = _mergeAnnotations(0, arrayOfLinked5);
        this._getters = this._getters.withValue(((AnnotatedMethod)this._getters.value).withAnnotations(localAnnotationMap5));
      }
    do
    {
      do
        return;
      while (this._fields == null);
      POJOPropertyBuilder.Linked[] arrayOfLinked4 = new POJOPropertyBuilder.Linked[3];
      arrayOfLinked4[0] = this._fields;
      arrayOfLinked4[1] = this._ctorParameters;
      arrayOfLinked4[2] = this._setters;
      AnnotationMap localAnnotationMap4 = _mergeAnnotations(0, arrayOfLinked4);
      this._fields = this._fields.withValue(((AnnotatedField)this._fields.value).withAnnotations(localAnnotationMap4));
      return;
      if (this._ctorParameters != null)
      {
        POJOPropertyBuilder.Linked[] arrayOfLinked3 = new POJOPropertyBuilder.Linked[4];
        arrayOfLinked3[0] = this._ctorParameters;
        arrayOfLinked3[1] = this._setters;
        arrayOfLinked3[2] = this._fields;
        arrayOfLinked3[3] = this._getters;
        AnnotationMap localAnnotationMap3 = _mergeAnnotations(0, arrayOfLinked3);
        this._ctorParameters = this._ctorParameters.withValue(((AnnotatedParameter)this._ctorParameters.value).withAnnotations(localAnnotationMap3));
        return;
      }
      if (this._setters != null)
      {
        POJOPropertyBuilder.Linked[] arrayOfLinked2 = new POJOPropertyBuilder.Linked[3];
        arrayOfLinked2[0] = this._setters;
        arrayOfLinked2[1] = this._fields;
        arrayOfLinked2[2] = this._getters;
        AnnotationMap localAnnotationMap2 = _mergeAnnotations(0, arrayOfLinked2);
        this._setters = this._setters.withValue(((AnnotatedMethod)this._setters.value).withAnnotations(localAnnotationMap2));
        return;
      }
    }
    while (this._fields == null);
    POJOPropertyBuilder.Linked[] arrayOfLinked1 = new POJOPropertyBuilder.Linked[2];
    arrayOfLinked1[0] = this._fields;
    arrayOfLinked1[1] = this._getters;
    AnnotationMap localAnnotationMap1 = _mergeAnnotations(0, arrayOfLinked1);
    this._fields = this._fields.withValue(((AnnotatedField)this._fields.value).withAnnotations(localAnnotationMap1));
  }

  public void removeIgnored()
  {
    this._fields = _removeIgnored(this._fields);
    this._getters = _removeIgnored(this._getters);
    this._setters = _removeIgnored(this._setters);
    this._ctorParameters = _removeIgnored(this._ctorParameters);
  }

  public void removeNonVisible()
  {
    this._getters = _removeNonVisible(this._getters);
    this._ctorParameters = _removeNonVisible(this._ctorParameters);
    if (this._getters == null)
    {
      this._fields = _removeNonVisible(this._fields);
      this._setters = _removeNonVisible(this._setters);
    }
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[Property '").append(this._name).append("'; ctors: ").append(this._ctorParameters).append(", field(s): ").append(this._fields).append(", getter(s): ").append(this._getters).append(", setter(s): ").append(this._setters);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }

  public void trimByVisibility()
  {
    this._fields = _trimByVisibility(this._fields);
    this._getters = _trimByVisibility(this._getters);
    this._setters = _trimByVisibility(this._setters);
    this._ctorParameters = _trimByVisibility(this._ctorParameters);
  }

  public POJOPropertyBuilder withName(String paramString)
  {
    return new POJOPropertyBuilder(this, paramString);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
