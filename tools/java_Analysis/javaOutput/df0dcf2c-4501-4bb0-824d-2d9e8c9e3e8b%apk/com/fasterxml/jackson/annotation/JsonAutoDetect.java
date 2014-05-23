package com.fasterxml.jackson.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.TYPE})
public @interface JsonAutoDetect
{
  public abstract JsonAutoDetect.Visibility creatorVisibility();

  public abstract JsonAutoDetect.Visibility fieldVisibility();

  public abstract JsonAutoDetect.Visibility getterVisibility();

  public abstract JsonAutoDetect.Visibility isGetterVisibility();

  public abstract JsonAutoDetect.Visibility setterVisibility();
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.annotation.JsonAutoDetect
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
