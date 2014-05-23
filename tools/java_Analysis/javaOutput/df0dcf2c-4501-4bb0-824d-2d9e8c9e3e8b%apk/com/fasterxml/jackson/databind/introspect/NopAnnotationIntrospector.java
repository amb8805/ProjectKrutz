package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import java.io.Serializable;

public abstract class NopAnnotationIntrospector extends AnnotationIntrospector
  implements Serializable
{
  public static final NopAnnotationIntrospector instance = new NopAnnotationIntrospector.1();
  private static final long serialVersionUID = 1L;

  public NopAnnotationIntrospector()
  {
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
