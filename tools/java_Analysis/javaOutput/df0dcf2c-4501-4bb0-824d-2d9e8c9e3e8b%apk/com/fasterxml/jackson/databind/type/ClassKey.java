package com.fasterxml.jackson.databind.type;

import java.io.Serializable;

public final class ClassKey
  implements Serializable, Comparable<ClassKey>
{
  private static final long serialVersionUID = 1L;
  private Class<?> _class;
  private String _className;
  private int _hashCode;

  public ClassKey()
  {
    this._class = null;
    this._className = null;
    this._hashCode = 0;
  }

  public ClassKey(Class<?> paramClass)
  {
    this._class = paramClass;
    this._className = paramClass.getName();
    this._hashCode = this._className.hashCode();
  }

  public final int compareTo(ClassKey paramClassKey)
  {
    return this._className.compareTo(paramClassKey._className);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (paramObject.getClass() != getClass())
        return false;
    }
    while (((ClassKey)paramObject)._class == this._class);
    return false;
  }

  public final int hashCode()
  {
    return this._hashCode;
  }

  public final String toString()
  {
    return this._className;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.type.ClassKey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
