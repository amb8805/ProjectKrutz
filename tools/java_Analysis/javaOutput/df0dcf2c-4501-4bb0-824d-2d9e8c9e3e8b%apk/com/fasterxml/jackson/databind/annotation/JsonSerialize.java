package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.PARAMETER})
public @interface JsonSerialize
{
  public abstract Class<?> as();

  public abstract Class<?> contentAs();

  public abstract Class<? extends JsonSerializer<?>> contentUsing();

  @Deprecated
  public abstract JsonSerialize.Inclusion include();

  public abstract Class<?> keyAs();

  public abstract Class<? extends JsonSerializer<?>> keyUsing();

  public abstract JsonSerialize.Typing typing();

  public abstract Class<? extends JsonSerializer<?>> using();
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.annotation.JsonSerialize
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
