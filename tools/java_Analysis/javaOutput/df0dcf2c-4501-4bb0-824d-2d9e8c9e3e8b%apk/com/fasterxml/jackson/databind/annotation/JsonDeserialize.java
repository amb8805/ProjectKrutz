package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.PARAMETER})
public @interface JsonDeserialize
{
  public abstract Class<?> as();

  public abstract Class<?> builder();

  public abstract Class<?> contentAs();

  public abstract Class<? extends JsonDeserializer<?>> contentUsing();

  public abstract Class<?> keyAs();

  public abstract Class<? extends KeyDeserializer> keyUsing();

  public abstract Class<? extends JsonDeserializer<?>> using();
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.annotation.JsonDeserialize
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
