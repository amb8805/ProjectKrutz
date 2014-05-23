package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class LongNode extends NumericNode
{
  final long _value;

  public LongNode(long paramLong)
  {
    this._value = paramLong;
  }

  public static LongNode valueOf(long paramLong)
  {
    return new LongNode(paramLong);
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
    while (((LongNode)paramObject)._value == this._value);
    return false;
  }

  public final int hashCode()
  {
    return (int)this._value ^ (int)(this._value >> 32);
  }

  public final int intValue()
  {
    return (int)this._value;
  }

  public final long longValue()
  {
    return this._value;
  }

  public final JsonParser.NumberType numberType()
  {
    return JsonParser.NumberType.LONG;
  }

  public final Number numberValue()
  {
    return Long.valueOf(this._value);
  }

  public final void serialize(JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    paramJsonGenerator.writeNumber(this._value);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.node.LongNode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
