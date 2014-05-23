package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;

public class SimpleBeanPropertyDefinition extends BeanPropertyDefinition
{
  protected final AnnotatedMember _member;
  protected final String _name;

  public SimpleBeanPropertyDefinition(AnnotatedMember paramAnnotatedMember)
  {
    this(paramAnnotatedMember, paramAnnotatedMember.getName());
  }

  public SimpleBeanPropertyDefinition(AnnotatedMember paramAnnotatedMember, String paramString)
  {
    this._member = paramAnnotatedMember;
    this._name = paramString;
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
    if ((this._member instanceof AnnotatedParameter))
      return (AnnotatedParameter)this._member;
    return null;
  }

  public AnnotatedField getField()
  {
    if ((this._member instanceof AnnotatedField))
      return (AnnotatedField)this._member;
    return null;
  }

  public AnnotatedMethod getGetter()
  {
    if (((this._member instanceof AnnotatedMethod)) && (((AnnotatedMethod)this._member).getParameterCount() == 0))
      return (AnnotatedMethod)this._member;
    return null;
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
    return this._member;
  }

  public AnnotatedMethod getSetter()
  {
    if (((this._member instanceof AnnotatedMethod)) && (((AnnotatedMethod)this._member).getParameterCount() == 1))
      return (AnnotatedMethod)this._member;
    return null;
  }

  public boolean hasConstructorParameter()
  {
    return this._member instanceof AnnotatedParameter;
  }

  public boolean hasField()
  {
    return this._member instanceof AnnotatedField;
  }

  public boolean hasGetter()
  {
    return getGetter() != null;
  }

  public boolean hasSetter()
  {
    return getSetter() != null;
  }

  public boolean isExplicitlyIncluded()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
