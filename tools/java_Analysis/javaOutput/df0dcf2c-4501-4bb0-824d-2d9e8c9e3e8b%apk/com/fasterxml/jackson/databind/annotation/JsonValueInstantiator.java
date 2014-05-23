package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.TYPE})
public @interface JsonValueInstantiator
{
  public abstract Class<? extends ValueInstantiator> value();
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.annotation.JsonValueInstantiator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
