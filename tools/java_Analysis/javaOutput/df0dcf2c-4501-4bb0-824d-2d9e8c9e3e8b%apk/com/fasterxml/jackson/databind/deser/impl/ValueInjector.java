package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.BeanProperty.Std;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.Annotations;

public class ValueInjector extends BeanProperty.Std
{
  protected final Object _valueId;

  public ValueInjector(String paramString, JavaType paramJavaType, Annotations paramAnnotations, AnnotatedMember paramAnnotatedMember, Object paramObject)
  {
    super(paramString, paramJavaType, paramAnnotations, paramAnnotatedMember);
    this._valueId = paramObject;
  }

  public Object findValue(DeserializationContext paramDeserializationContext, Object paramObject)
  {
    return paramDeserializationContext.findInjectableValue(this._valueId, this, paramObject);
  }

  public void inject(DeserializationContext paramDeserializationContext, Object paramObject)
  {
    this._member.setValue(paramObject, findValue(paramDeserializationContext, paramObject));
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.impl.ValueInjector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
