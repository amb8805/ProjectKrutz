package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;

public abstract class DelegatingDeserializer extends StdDeserializer<Object>
  implements ContextualDeserializer, ResolvableDeserializer
{
  protected final JsonDeserializer<?> _delegatee;
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.DelegatingDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
