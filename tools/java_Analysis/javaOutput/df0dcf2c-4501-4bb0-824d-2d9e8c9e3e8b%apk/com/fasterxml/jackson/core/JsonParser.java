package com.fasterxml.jackson.core;

import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class JsonParser
  implements Closeable
{
  protected int _features;

  protected JsonParser()
  {
  }

  protected JsonParser(int paramInt)
  {
    this._features = paramInt;
  }

  protected JsonParseException _constructError(String paramString)
  {
    return new JsonParseException(paramString, getCurrentLocation());
  }

  public abstract void clearCurrentToken();

  public abstract void close();

  public abstract BigInteger getBigIntegerValue();

  public abstract byte[] getBinaryValue(Base64Variant paramBase64Variant);

  public byte getByteValue()
  {
    int i = getIntValue();
    if ((i < -128) || (i > 255))
      throw _constructError("Numeric value (" + getText() + ") out of range of Java byte");
    return (byte)i;
  }

  public abstract ObjectCodec getCodec();

  public abstract JsonLocation getCurrentLocation();

  public abstract String getCurrentName();

  public abstract JsonToken getCurrentToken();

  public abstract BigDecimal getDecimalValue();

  public abstract double getDoubleValue();

  public abstract Object getEmbeddedObject();

  public abstract float getFloatValue();

  public abstract int getIntValue();

  public abstract long getLongValue();

  public abstract JsonParser.NumberType getNumberType();

  public abstract Number getNumberValue();

  public short getShortValue()
  {
    int i = getIntValue();
    if ((i < -32768) || (i > 32767))
      throw _constructError("Numeric value (" + getText() + ") out of range of Java short");
    return (short)i;
  }

  public abstract String getText();

  public abstract char[] getTextCharacters();

  public abstract int getTextLength();

  public abstract int getTextOffset();

  public abstract JsonLocation getTokenLocation();

  public int getValueAsInt()
  {
    return getValueAsInt(0);
  }

  public int getValueAsInt(int paramInt)
  {
    return paramInt;
  }

  public long getValueAsLong()
  {
    return getValueAsLong(0L);
  }

  public long getValueAsLong(long paramLong)
  {
    return paramLong;
  }

  public String getValueAsString()
  {
    return getValueAsString(null);
  }

  public abstract String getValueAsString(String paramString);

  public abstract boolean hasCurrentToken();

  public abstract boolean hasTextCharacters();

  public boolean isEnabled(JsonParser.Feature paramFeature)
  {
    return (this._features & paramFeature.getMask()) != 0;
  }

  public boolean isExpectedStartArrayToken()
  {
    return getCurrentToken() == JsonToken.START_ARRAY;
  }

  public abstract JsonToken nextToken();

  public abstract JsonToken nextValue();

  public <T extends TreeNode> T readValueAsTree()
  {
    ObjectCodec localObjectCodec = getCodec();
    if (localObjectCodec == null)
      throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into JsonNode tree");
    return localObjectCodec.readTree(this);
  }

  public abstract JsonParser skipChildren();
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.core.JsonParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
