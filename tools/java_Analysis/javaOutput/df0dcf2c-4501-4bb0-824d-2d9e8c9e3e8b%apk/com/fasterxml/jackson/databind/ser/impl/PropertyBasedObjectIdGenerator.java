package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

public class PropertyBasedObjectIdGenerator extends ObjectIdGenerators.PropertyGenerator
{
  protected final BeanPropertyWriter _property;

  public PropertyBasedObjectIdGenerator(ObjectIdInfo paramObjectIdInfo, BeanPropertyWriter paramBeanPropertyWriter)
  {
    this(paramObjectIdInfo.getScope(), paramBeanPropertyWriter);
  }

  protected PropertyBasedObjectIdGenerator(Class<?> paramClass, BeanPropertyWriter paramBeanPropertyWriter)
  {
    super(paramClass);
    this._property = paramBeanPropertyWriter;
  }

  public boolean canUseFor(ObjectIdGenerator<?> paramObjectIdGenerator)
  {
    Class localClass1 = paramObjectIdGenerator.getClass();
    Class localClass2 = getClass();
    boolean bool = false;
    if (localClass1 == localClass2)
    {
      PropertyBasedObjectIdGenerator localPropertyBasedObjectIdGenerator = (PropertyBasedObjectIdGenerator)paramObjectIdGenerator;
      Class localClass3 = localPropertyBasedObjectIdGenerator.getScope();
      Class localClass4 = this._scope;
      bool = false;
      if (localClass3 == localClass4)
      {
        BeanPropertyWriter localBeanPropertyWriter1 = localPropertyBasedObjectIdGenerator._property;
        BeanPropertyWriter localBeanPropertyWriter2 = this._property;
        bool = false;
        if (localBeanPropertyWriter1 == localBeanPropertyWriter2)
          bool = true;
      }
    }
    return bool;
  }

  public ObjectIdGenerator<Object> forScope(Class<?> paramClass)
  {
    if (paramClass == this._scope)
      return this;
    return new PropertyBasedObjectIdGenerator(paramClass, this._property);
  }

  public Object generateId(Object paramObject)
  {
    try
    {
      Object localObject = this._property.get(paramObject);
      return localObject;
    }
    catch (RuntimeException localRuntimeException)
    {
      throw localRuntimeException;
    }
    catch (Exception localException)
    {
      throw new IllegalStateException("Problem accessing property '" + this._property.getName() + "': " + localException.getMessage(), localException);
    }
  }

  public ObjectIdGenerator.IdKey key(Object paramObject)
  {
    return new ObjectIdGenerator.IdKey(getClass(), this._scope, paramObject);
  }

  public ObjectIdGenerator<Object> newForSerialization(Object paramObject)
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
