package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.SerializerProvider;

public final class TextNode extends ValueNode
{
  static final TextNode EMPTY_STRING_NODE = new TextNode("");
  final String _value;

  public TextNode(String paramString)
  {
    this._value = paramString;
  }

  protected static void appendQuoted(StringBuilder paramStringBuilder, String paramString)
  {
    paramStringBuilder.append((char)'"');
    CharTypes.appendQuoted(paramStringBuilder, paramString);
    paramStringBuilder.append((char)'"');
  }

  public static TextNode valueOf(String paramString)
  {
    if (paramString == null)
      return null;
    if (paramString.length() == 0)
      return EMPTY_STRING_NODE;
    return new TextNode(paramString);
  }

  protected final void _reportBase64EOF()
  {
    throw new JsonParseException("Unexpected end-of-String when base64 content", JsonLocation.NA);
  }

  protected final void _reportInvalidBase64(Base64Variant paramBase64Variant, char paramChar, int paramInt)
  {
    _reportInvalidBase64(paramBase64Variant, paramChar, paramInt, null);
  }

  protected final void _reportInvalidBase64(Base64Variant paramBase64Variant, char paramChar, int paramInt, String paramString)
  {
    String str;
    if (paramChar <= ' ')
      str = "Illegal white space character (code 0x" + Integer.toHexString(paramChar) + ") as character #" + (paramInt + 1) + " of 4-char base64 unit: can only used between units";
    while (true)
    {
      if (paramString != null)
        str = str + ": " + paramString;
      throw new JsonParseException(str, JsonLocation.NA);
      if (paramBase64Variant.usesPaddingChar(paramChar))
        str = "Unexpected padding character ('" + paramBase64Variant.getPaddingChar() + "') as character #" + (paramInt + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
      else if ((!Character.isDefined(paramChar)) || (Character.isISOControl(paramChar)))
        str = "Illegal character (code 0x" + Integer.toHexString(paramChar) + ") in base64 content";
      else
        str = "Illegal character '" + paramChar + "' (code 0x" + Integer.toHexString(paramChar) + ") in base64 content";
    }
  }

  public final String asText()
  {
    return this._value;
  }

  public final JsonToken asToken()
  {
    return JsonToken.VALUE_STRING;
  }

  public final byte[] binaryValue()
  {
    return getBinaryValue(Base64Variants.getDefaultVariant());
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
    return ((TextNode)paramObject)._value.equals(this._value);
  }

  public final byte[] getBinaryValue(Base64Variant paramBase64Variant)
  {
    ByteArrayBuilder localByteArrayBuilder = new ByteArrayBuilder(100);
    String str = this._value;
    int i = str.length();
    int j = 0;
    if (j < i);
    while (true)
    {
      int k = j + 1;
      char c1 = str.charAt(j);
      int n;
      int i2;
      if (k < i)
      {
        if (c1 <= ' ')
          break label393;
        int m = paramBase64Variant.decodeBase64Char(c1);
        if (m < 0)
          _reportInvalidBase64(paramBase64Variant, c1, 0);
        if (k >= i)
          _reportBase64EOF();
        n = k + 1;
        char c2 = str.charAt(k);
        int i1 = paramBase64Variant.decodeBase64Char(c2);
        if (i1 < 0)
          _reportInvalidBase64(paramBase64Variant, c2, 1);
        i2 = i1 | m << 6;
        if (n < i)
          break label167;
        if (paramBase64Variant.usesPadding())
          break label163;
        localByteArrayBuilder.append(i2 >> 4);
      }
      label163: label167: int i3;
      int i5;
      while (true)
      {
        return localByteArrayBuilder.toByteArray();
        _reportBase64EOF();
        i3 = n + 1;
        char c3 = str.charAt(n);
        int i4 = paramBase64Variant.decodeBase64Char(c3);
        if (i4 < 0)
        {
          if (i4 != -2)
            _reportInvalidBase64(paramBase64Variant, c3, 2);
          if (i3 >= i)
            _reportBase64EOF();
          j = i3 + 1;
          char c5 = str.charAt(i3);
          if (!paramBase64Variant.usesPaddingChar(c5))
            _reportInvalidBase64(paramBase64Variant, c5, 3, "expected padding character '" + paramBase64Variant.getPaddingChar() + "'");
          localByteArrayBuilder.append(i2 >> 4);
          break;
        }
        i5 = i4 | i2 << 6;
        if (i3 < i)
          break label325;
        if (paramBase64Variant.usesPadding())
          break label321;
        localByteArrayBuilder.appendTwoBytes(i5 >> 2);
      }
      label321: _reportBase64EOF();
      label325: j = i3 + 1;
      char c4 = str.charAt(i3);
      int i6 = paramBase64Variant.decodeBase64Char(c4);
      if (i6 < 0)
      {
        if (i6 != -2)
          _reportInvalidBase64(paramBase64Variant, c4, 3);
        localByteArrayBuilder.appendTwoBytes(i5 >> 2);
        break;
      }
      localByteArrayBuilder.appendThreeBytes(i6 | i5 << 6);
      break;
      label393: j = k;
    }
  }

  public final int hashCode()
  {
    return this._value.hashCode();
  }

  public final void serialize(JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    if (this._value == null)
    {
      paramJsonGenerator.writeNull();
      return;
    }
    paramJsonGenerator.writeString(this._value);
  }

  public final String textValue()
  {
    return this._value;
  }

  public final String toString()
  {
    int i = this._value.length();
    StringBuilder localStringBuilder = new StringBuilder(i + 2 + (i >> 4));
    appendQuoted(localStringBuilder, this._value);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.node.TextNode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
