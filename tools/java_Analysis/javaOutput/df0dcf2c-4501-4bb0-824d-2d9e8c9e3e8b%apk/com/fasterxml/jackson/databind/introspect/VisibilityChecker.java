package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

public abstract interface VisibilityChecker<T extends VisibilityChecker<T>>
{
  public abstract boolean isCreatorVisible(AnnotatedMember paramAnnotatedMember);

  public abstract boolean isFieldVisible(AnnotatedField paramAnnotatedField);

  public abstract boolean isGetterVisible(AnnotatedMethod paramAnnotatedMethod);

  public abstract boolean isIsGetterVisible(AnnotatedMethod paramAnnotatedMethod);

  public abstract boolean isSetterVisible(AnnotatedMethod paramAnnotatedMethod);

  public abstract T with(JsonAutoDetect paramJsonAutoDetect);

  public abstract T withCreatorVisibility(JsonAutoDetect.Visibility paramVisibility);

  public abstract T withFieldVisibility(JsonAutoDetect.Visibility paramVisibility);

  public abstract T withGetterVisibility(JsonAutoDetect.Visibility paramVisibility);

  public abstract T withIsGetterVisibility(JsonAutoDetect.Visibility paramVisibility);

  public abstract T withSetterVisibility(JsonAutoDetect.Visibility paramVisibility);
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.introspect.VisibilityChecker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
