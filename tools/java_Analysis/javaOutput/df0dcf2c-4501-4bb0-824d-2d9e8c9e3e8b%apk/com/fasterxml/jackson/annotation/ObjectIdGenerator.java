package com.fasterxml.jackson.annotation;

import java.io.Serializable;

public abstract class ObjectIdGenerator<T>
  implements Serializable
{
  public ObjectIdGenerator()
  {
  }

  public abstract boolean canUseFor(ObjectIdGenerator<?> paramObjectIdGenerator);

  public abstract ObjectIdGenerator<T> forScope(Class<?> paramClass);

  public abstract T generateId(Object paramObject);

  public abstract Class<?> getScope();

  public abstract ObjectIdGenerator.IdKey key(Object paramObject);

  public abstract ObjectIdGenerator<T> newForSerialization(Object paramObject);
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.annotation.ObjectIdGenerator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
