package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class IntNode extends NumericNode
{
  private static final IntNode[] CANONICALS = new IntNode[12];
  final int _value;

  static
  {
    for (int i = 0; i < 12; i++)
      CANONICALS[i] = new IntNode(i - 1);
  }

  public IntNode(int paramInt)
  {
    this._value = paramInt;
  }

  public static IntNode valueOf(int paramInt)
  {
    if ((paramInt > 10) || (paramInt < -1))
      return new IntNode(paramInt);
    return CANONICALS[(paramInt + 1)];
  }

  public final String asText()
  {
    return NumberOutput.toString(this._value);
  }

  public final JsonToken asToken()
  {
    return JsonToken.VALUE_NUMBER_INT;
  }

  public final BigInteger bigIntegerValue()
  {
    return BigInteger.valueOf(this._value);
  }

  public final BigDecimal decimalValue()
  {
    return BigDecimal.valueOf(this._value);
  }

  public final double doubleValue()
  {
    return this._value;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (paramObject.getClass() != getClass())
        return false;
    }
    while (((IntNode)paramObject)._value == this._value);
    return false;
  }

  public final int hashCode()
  {
    return this._value;
  }

  public final int intValue()
  {
    return this._value;
  }

  public final long longValue()
  {
    return this._value;
  }

  public final JsonParser.NumberType numberType()
  {
    return JsonParser.NumberType.INT;
  }

  public final Number numberValue()
  {
    return Integer.valueOf(this._value);
  }

  public final void serialize(JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    paramJsonGenerator.writeNumber(this._value);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.node.IntNode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
