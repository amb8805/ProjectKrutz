package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.TYPE})
public @interface JsonNaming
{
  public abstract Class<? extends PropertyNamingStrategy> value();
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.annotation.JsonNaming
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
