package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.TreeNode;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public abstract class JsonNode
  implements TreeNode, Iterable<JsonNode>
{
  protected static final List<JsonNode> NO_NODES = Collections.emptyList();
  protected static final List<String> NO_STRINGS = Collections.emptyList();

  protected JsonNode()
  {
  }

  public abstract String asText();

  public abstract JsonToken asToken();

  public BigInteger bigIntegerValue()
  {
    return BigInteger.ZERO;
  }

  public byte[] binaryValue()
  {
    return null;
  }

  public BigDecimal decimalValue()
  {
    return BigDecimal.ZERO;
  }

  public double doubleValue()
  {
    return 0.0D;
  }

  public Iterator<JsonNode> elements()
  {
    return NO_NODES.iterator();
  }

  public abstract boolean equals(Object paramObject);

  public Iterator<Map.Entry<String, JsonNode>> fields()
  {
    return Collections.emptyList().iterator();
  }

  public JsonNode get(String paramString)
  {
    return null;
  }

  public boolean has(String paramString)
  {
    return get(paramString) != null;
  }

  public int intValue()
  {
    return 0;
  }

  public boolean isArray()
  {
    return false;
  }

  public boolean isBinary()
  {
    return false;
  }

  public boolean isNumber()
  {
    return false;
  }

  public boolean isObject()
  {
    return false;
  }

  public boolean isPojo()
  {
    return false;
  }

  public final Iterator<JsonNode> iterator()
  {
    return elements();
  }

  public long longValue()
  {
    return 0L;
  }

  public abstract JsonParser.NumberType numberType();

  public Number numberValue()
  {
    return null;
  }

  public int size()
  {
    return 0;
  }

  public String textValue()
  {
    return null;
  }

  public abstract String toString();
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.JsonNode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
