package com.fasterxml.jackson.databind;

public class PropertyName
{
  public static final PropertyName NO_NAME = new PropertyName(new String("#disabled"), null);
  public static final PropertyName USE_DEFAULT = new PropertyName("", null);
  protected final String _namespace;
  protected final String _simpleName;

  public PropertyName(String paramString)
  {
    this(paramString, null);
  }

  public PropertyName(String paramString1, String paramString2)
  {
    if (paramString1 == null)
      paramString1 = "";
    this._simpleName = paramString1;
    this._namespace = paramString2;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    PropertyName localPropertyName;
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (paramObject.getClass() != getClass())
        return false;
      localPropertyName = (PropertyName)paramObject;
      if (this._simpleName == null)
      {
        if (localPropertyName._simpleName != null)
          return false;
      }
      else if (!this._simpleName.equals(localPropertyName._simpleName))
        return false;
      if (this._namespace != null)
        break;
    }
    while (localPropertyName._namespace == null);
    return false;
    return this._namespace.equals(localPropertyName._namespace);
  }

  public String getSimpleName()
  {
    return this._simpleName;
  }

  public boolean hasSimpleName()
  {
    return this._simpleName.length() > 0;
  }

  public int hashCode()
  {
    if (this._namespace == null)
      return this._simpleName.hashCode();
    return this._namespace.hashCode() ^ this._simpleName.hashCode();
  }

  public String toString()
  {
    if (this._namespace == null)
      return this._simpleName;
    return "{" + this._namespace + "}" + this._simpleName;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.PropertyName
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
