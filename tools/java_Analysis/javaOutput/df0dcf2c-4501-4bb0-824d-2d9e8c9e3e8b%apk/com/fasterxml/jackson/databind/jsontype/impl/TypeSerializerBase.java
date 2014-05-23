package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public abstract class TypeSerializerBase extends TypeSerializer
{
  protected final TypeIdResolver _idResolver;
  protected final BeanProperty _property;

  protected TypeSerializerBase(TypeIdResolver paramTypeIdResolver, BeanProperty paramBeanProperty)
  {
    this._idResolver = paramTypeIdResolver;
    this._property = paramBeanProperty;
  }

  protected String idFromValue(Object paramObject)
  {
    return this._idResolver.idFromValue(paramObject);
  }

  protected String idFromValueAndType(Object paramObject, Class<?> paramClass)
  {
    return this._idResolver.idFromValueAndType(paramObject, paramClass);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
