package com.squareup.wire;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.FIELD})
public @interface m
{
  public abstract int a();

  public abstract Message.Datatype b();

  public abstract Message.Label c();
}

/* Location:
 * Qualified Name:     com.squareup.wire.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
