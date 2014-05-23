package com.fasterxml.jackson.databind.node;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonNodeFactory
  implements Serializable
{
  private static final JsonNodeFactory decimalsAsIs = new JsonNodeFactory(true);
  private static final JsonNodeFactory decimalsNormalized = new JsonNodeFactory(false);
  public static final JsonNodeFactory instance = decimalsNormalized;
  private static final long serialVersionUID = 2323165117839546871L;
  private final boolean _cfgBigDecimalExact;

  protected JsonNodeFactory()
  {
    this(false);
  }

  public JsonNodeFactory(boolean paramBoolean)
  {
    this._cfgBigDecimalExact = paramBoolean;
  }

  public POJONode POJONode(Object paramObject)
  {
    return new POJONode(paramObject);
  }

  public ArrayNode arrayNode()
  {
    return new ArrayNode(this);
  }

  public BinaryNode binaryNode(byte[] paramArrayOfByte)
  {
    return BinaryNode.valueOf(paramArrayOfByte);
  }

  public BooleanNode booleanNode(boolean paramBoolean)
  {
    if (paramBoolean)
      return BooleanNode.getTrue();
    return BooleanNode.getFalse();
  }

  public NullNode nullNode()
  {
    return NullNode.getInstance();
  }

  public NumericNode numberNode(double paramDouble)
  {
    return DoubleNode.valueOf(paramDouble);
  }

  public NumericNode numberNode(int paramInt)
  {
    return IntNode.valueOf(paramInt);
  }

  public NumericNode numberNode(long paramLong)
  {
    return LongNode.valueOf(paramLong);
  }

  public NumericNode numberNode(BigDecimal paramBigDecimal)
  {
    if (this._cfgBigDecimalExact)
      return DecimalNode.valueOf(paramBigDecimal);
    if (paramBigDecimal.compareTo(BigDecimal.ZERO) == 0)
      return DecimalNode.ZERO;
    return DecimalNode.valueOf(paramBigDecimal.stripTrailingZeros());
  }

  public NumericNode numberNode(BigInteger paramBigInteger)
  {
    return BigIntegerNode.valueOf(paramBigInteger);
  }

  public ObjectNode objectNode()
  {
    return new ObjectNode(this);
  }

  public TextNode textNode(String paramString)
  {
    return TextNode.valueOf(paramString);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.node.JsonNodeFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
