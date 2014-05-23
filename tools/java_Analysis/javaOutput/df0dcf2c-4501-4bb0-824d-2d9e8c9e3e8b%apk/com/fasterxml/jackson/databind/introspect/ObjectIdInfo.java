package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;

public class ObjectIdInfo
{
  protected final boolean _alwaysAsId;
  protected final Class<? extends ObjectIdGenerator<?>> _generator;
  protected final String _propertyName;
  protected final Class<?> _scope;

  public ObjectIdInfo(String paramString, Class<?> paramClass, Class<? extends ObjectIdGenerator<?>> paramClass1)
  {
    this(paramString, paramClass, paramClass1, false);
  }

  protected ObjectIdInfo(String paramString, Class<?> paramClass, Class<? extends ObjectIdGenerator<?>> paramClass1, boolean paramBoolean)
  {
    this._propertyName = paramString;
    this._scope = paramClass;
    this._generator = paramClass1;
    this._alwaysAsId = paramBoolean;
  }

  public boolean getAlwaysAsId()
  {
    return this._alwaysAsId;
  }

  public Class<? extends ObjectIdGenerator<?>> getGeneratorType()
  {
    return this._generator;
  }

  public String getPropertyName()
  {
    return this._propertyName;
  }

  public Class<?> getScope()
  {
    return this._scope;
  }

  public String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder("ObjectIdInfo: propName=").append(this._propertyName).append(", scope=");
    String str1;
    StringBuilder localStringBuilder2;
    if (this._scope == null)
    {
      str1 = "null";
      localStringBuilder2 = localStringBuilder1.append(str1).append(", generatorType=");
      if (this._generator != null)
        break label87;
    }
    label87: for (String str2 = "null"; ; str2 = this._generator.getName())
    {
      return str2 + ", alwaysAsId=" + this._alwaysAsId;
      str1 = this._scope.getName();
      break;
    }
  }

  public ObjectIdInfo withAlwaysAsId(boolean paramBoolean)
  {
    if (this._alwaysAsId == paramBoolean)
      return this;
    return new ObjectIdInfo(this._propertyName, this._scope, this._generator, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.introspect.ObjectIdInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
