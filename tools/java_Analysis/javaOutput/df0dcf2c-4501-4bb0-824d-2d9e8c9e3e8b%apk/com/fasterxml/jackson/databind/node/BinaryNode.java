package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.util.Arrays;

public final class BinaryNode extends ValueNode
{
  static final BinaryNode EMPTY_BINARY_NODE = new BinaryNode(new byte[0]);
  final byte[] _data;

  public BinaryNode(byte[] paramArrayOfByte)
  {
    this._data = paramArrayOfByte;
  }

  public static BinaryNode valueOf(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return null;
    if (paramArrayOfByte.length == 0)
      return EMPTY_BINARY_NODE;
    return new BinaryNode(paramArrayOfByte);
  }

  public final String asText()
  {
    return Base64Variants.getDefaultVariant().encode(this._data, false);
  }

  public final JsonToken asToken()
  {
    return JsonToken.VALUE_EMBEDDED_OBJECT;
  }

  public final byte[] binaryValue()
  {
    return this._data;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (paramObject == this)
      bool = true;
    Class localClass1;
    Class localClass2;
    do
    {
      do
      {
        return bool;
        bool = false;
      }
      while (paramObject == null);
      localClass1 = paramObject.getClass();
      localClass2 = getClass();
      bool = false;
    }
    while (localClass1 != localClass2);
    return Arrays.equals(((BinaryNode)paramObject)._data, this._data);
  }

  public final int hashCode()
  {
    if (this._data == null)
      return -1;
    return this._data.length;
  }

  public final boolean isBinary()
  {
    return true;
  }

  public final void serialize(JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    paramJsonGenerator.writeBinary(paramSerializerProvider.getConfig().getBase64Variant(), this._data, 0, this._data.length);
  }

  public final String toString()
  {
    return Base64Variants.getDefaultVariant().encode(this._data, true);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.node.BinaryNode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
