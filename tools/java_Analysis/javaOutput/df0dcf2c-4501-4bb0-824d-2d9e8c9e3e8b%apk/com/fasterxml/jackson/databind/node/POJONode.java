package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;

public final class POJONode extends ValueNode
{
  protected final Object _value;

  public POJONode(Object paramObject)
  {
    this._value = paramObject;
  }

  public final String asText()
  {
    if (this._value == null)
      return "null";
    return this._value.toString();
  }

  public final JsonToken asToken()
  {
    return JsonToken.VALUE_EMBEDDED_OBJECT;
  }

  public final byte[] binaryValue()
  {
    if ((this._value instanceof byte[]))
      return (byte[])this._value;
    return super.binaryValue();
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    POJONode localPOJONode;
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (paramObject.getClass() != getClass())
        return false;
      localPOJONode = (POJONode)paramObject;
      if (this._value != null)
        break;
    }
    while (localPOJONode._value == null);
    return false;
    return this._value.equals(localPOJONode._value);
  }

  public final Object getPojo()
  {
    return this._value;
  }

  public final int hashCode()
  {
    return this._value.hashCode();
  }

  public final boolean isPojo()
  {
    return true;
  }

  public final void serialize(JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    if (this._value == null)
    {
      paramJsonGenerator.writeNull();
      return;
    }
    paramJsonGenerator.writeObject(this._value);
  }

  public final String toString()
  {
    return String.valueOf(this._value);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.node.POJONode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
