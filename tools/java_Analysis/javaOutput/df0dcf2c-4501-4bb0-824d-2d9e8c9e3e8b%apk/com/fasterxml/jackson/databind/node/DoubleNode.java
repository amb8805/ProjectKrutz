package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class DoubleNode extends NumericNode
{
  protected final double _value;

  public DoubleNode(double paramDouble)
  {
    this._value = paramDouble;
  }

  public static DoubleNode valueOf(double paramDouble)
  {
    return new DoubleNode(paramDouble);
  }

  public final String asText()
  {
    return NumberOutput.toString(this._value);
  }

  public final JsonToken asToken()
  {
    return JsonToken.VALUE_NUMBER_FLOAT;
  }

  public final BigInteger bigIntegerValue()
  {
    return decimalValue().toBigInteger();
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
    double d;
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (paramObject.getClass() != getClass())
        return false;
      d = ((DoubleNode)paramObject)._value;
    }
    while (Double.compare(this._value, d) == 0);
    return false;
  }

  public final int hashCode()
  {
    long l = Double.doubleToLongBits(this._value);
    return (int)l ^ (int)(l >> 32);
  }

  public final int intValue()
  {
    return (int)this._value;
  }

  public final long longValue()
  {
    return ()this._value;
  }

  public final JsonParser.NumberType numberType()
  {
    return JsonParser.NumberType.DOUBLE;
  }

  public final Number numberValue()
  {
    return Double.valueOf(this._value);
  }

  public final void serialize(JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    paramJsonGenerator.writeNumber(this._value);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.node.DoubleNode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
