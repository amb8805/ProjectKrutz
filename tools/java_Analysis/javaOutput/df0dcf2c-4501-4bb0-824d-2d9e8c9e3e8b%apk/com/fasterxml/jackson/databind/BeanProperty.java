package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.introspect.AnnotatedMember;

public abstract interface BeanProperty
{
  public abstract AnnotatedMember getMember();

  public abstract JavaType getType();
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.BeanProperty
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
