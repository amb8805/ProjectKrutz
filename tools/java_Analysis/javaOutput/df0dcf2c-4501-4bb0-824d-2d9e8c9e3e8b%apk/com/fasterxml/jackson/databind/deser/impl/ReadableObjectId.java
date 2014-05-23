package com.fasterxml.jackson.databind.deser.impl;

public class ReadableObjectId
{
  public final Object id;
  public Object item;

  public ReadableObjectId(Object paramObject)
  {
    this.id = paramObject;
  }

  public void bindItem(Object paramObject)
  {
    if (this.item != null)
      throw new IllegalStateException("Already had POJO for id (" + this.id.getClass().getName() + ") [" + this.id + "]");
    this.item = paramObject;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.impl.ReadableObjectId
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
