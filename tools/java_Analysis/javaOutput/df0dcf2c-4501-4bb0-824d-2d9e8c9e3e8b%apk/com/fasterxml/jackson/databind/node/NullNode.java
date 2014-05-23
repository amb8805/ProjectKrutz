package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;

public final class NullNode extends ValueNode
{
  public static final NullNode instance = new NullNode();

  private NullNode()
  {
  }

  public static NullNode getInstance()
  {
    return instance;
  }

  public final String asText()
  {
    return "null";
  }

  public final JsonToken asToken()
  {
    return JsonToken.VALUE_NULL;
  }

  public final boolean equals(Object paramObject)
  {
    return paramObject == this;
  }

  public final void serialize(JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    paramJsonGenerator.writeNull();
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.node.NullNode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
