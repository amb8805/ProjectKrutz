package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;

public final class BooleanNode extends ValueNode
{
  public static final BooleanNode FALSE = new BooleanNode();
  public static final BooleanNode TRUE = new BooleanNode();

  private BooleanNode()
  {
  }

  public static BooleanNode getFalse()
  {
    return FALSE;
  }

  public static BooleanNode getTrue()
  {
    return TRUE;
  }

  public final String asText()
  {
    if (this == TRUE)
      return "true";
    return "false";
  }

  public final JsonToken asToken()
  {
    if (this == TRUE)
      return JsonToken.VALUE_TRUE;
    return JsonToken.VALUE_FALSE;
  }

  public final boolean equals(Object paramObject)
  {
    return paramObject == this;
  }

  public final void serialize(JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    if (this == TRUE);
    for (boolean bool = true; ; bool = false)
    {
      paramJsonGenerator.writeBoolean(bool);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.node.BooleanNode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
