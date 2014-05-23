package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;

public abstract class BaseJsonNode extends JsonNode
  implements JsonSerializable
{
  protected BaseJsonNode()
  {
  }

  public JsonParser.NumberType numberType()
  {
    return null;
  }

  public abstract void serialize(JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider);
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.node.BaseJsonNode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
