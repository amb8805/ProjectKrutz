package com.fasterxml.jackson.databind.jsontype;

import java.io.Serializable;

public final class NamedType
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  protected final Class<?> _class;
  protected final int _hashCode;
  protected String _name;

  public NamedType(Class<?> paramClass, String paramString)
  {
    this._class = paramClass;
    this._hashCode = paramClass.getName().hashCode();
    setName(paramString);
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
    while (this._class == ((NamedType)paramObject)._class);
    return false;
  }

  public final String getName()
  {
    return this._name;
  }

  public final Class<?> getType()
  {
    return this._class;
  }

  public final boolean hasName()
  {
    return this._name != null;
  }

  public final int hashCode()
  {
    return this._hashCode;
  }

  public final void setName(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      paramString = null;
    this._name = paramString;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("[NamedType, class ").append(this._class.getName()).append(", name: ");
    if (this._name == null);
    for (String str = "null"; ; str = "'" + this._name + "'")
      return str + "]";
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.jsontype.NamedType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
