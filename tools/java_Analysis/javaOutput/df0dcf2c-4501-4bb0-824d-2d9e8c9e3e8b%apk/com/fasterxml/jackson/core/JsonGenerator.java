package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import java.io.Closeable;
import java.io.Flushable;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class JsonGenerator
  implements Closeable, Flushable
{
  protected PrettyPrinter _cfgPrettyPrinter;

  protected JsonGenerator()
  {
  }

  public abstract void close();

  public abstract void flush();

  public PrettyPrinter getPrettyPrinter()
  {
    return this._cfgPrettyPrinter;
  }

  public JsonGenerator setCharacterEscapes(CharacterEscapes paramCharacterEscapes)
  {
    return this;
  }

  public JsonGenerator setHighestNonEscapedChar(int paramInt)
  {
    return this;
  }

  public JsonGenerator setPrettyPrinter(PrettyPrinter paramPrettyPrinter)
  {
    this._cfgPrettyPrinter = paramPrettyPrinter;
    return this;
  }

  public JsonGenerator setRootValueSeparator(SerializableString paramSerializableString)
  {
    throw new UnsupportedOperationException();
  }

  public void setSchema(FormatSchema paramFormatSchema)
  {
    throw new UnsupportedOperationException("Generator of type " + getClass().getName() + " does not support schema of type '" + paramFormatSchema.getSchemaType() + "'");
  }

  public abstract JsonGenerator useDefaultPrettyPrinter();

  public final void writeArrayFieldStart(String paramString)
  {
    writeFieldName(paramString);
    writeStartArray();
  }

  public abstract void writeBinary(Base64Variant paramBase64Variant, byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public void writeBinary(byte[] paramArrayOfByte)
  {
    writeBinary(Base64Variants.getDefaultVariant(), paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public abstract void writeBoolean(boolean paramBoolean);

  public abstract void writeEndArray();

  public abstract void writeEndObject();

  public abstract void writeFieldName(SerializableString paramSerializableString);

  public abstract void writeFieldName(String paramString);

  public abstract void writeNull();

  public abstract void writeNumber(double paramDouble);

  public abstract void writeNumber(float paramFloat);

  public abstract void writeNumber(int paramInt);

  public abstract void writeNumber(long paramLong);

  public abstract void writeNumber(String paramString);

  public abstract void writeNumber(BigDecimal paramBigDecimal);

  public abstract void writeNumber(BigInteger paramBigInteger);

  public abstract void writeObject(Object paramObject);

  public final void writeObjectFieldStart(String paramString)
  {
    writeFieldName(paramString);
    writeStartObject();
  }

  public abstract void writeRaw(char paramChar);

  public void writeRaw(SerializableString paramSerializableString)
  {
    writeRaw(paramSerializableString.getValue());
  }

  public abstract void writeRaw(String paramString);

  public abstract void writeRaw(char[] paramArrayOfChar, int paramInt1, int paramInt2);

  public abstract void writeRawValue(String paramString);

  public abstract void writeStartArray();

  public abstract void writeStartObject();

  public abstract void writeString(SerializableString paramSerializableString);

  public abstract void writeString(String paramString);

  public abstract void writeString(char[] paramArrayOfChar, int paramInt1, int paramInt2);

  public void writeStringField(String paramString1, String paramString2)
  {
    writeFieldName(paramString1);
    writeString(paramString2);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.core.JsonGenerator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
