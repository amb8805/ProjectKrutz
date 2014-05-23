package com.fasterxml.jackson.databind.deser.impl;

public abstract class PropertyValue
{
  public final PropertyValue next;
  public final Object value;

  protected PropertyValue(PropertyValue paramPropertyValue, Object paramObject)
  {
    this.next = paramPropertyValue;
    this.value = paramObject;
  }

  public abstract void assign(Object paramObject);
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.impl.PropertyValue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
