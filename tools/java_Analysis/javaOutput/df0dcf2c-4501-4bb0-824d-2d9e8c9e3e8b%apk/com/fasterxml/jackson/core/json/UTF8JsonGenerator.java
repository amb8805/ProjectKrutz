package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberOutput;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class UTF8JsonGenerator extends JsonGeneratorImpl
{
  private static final byte[] FALSE_BYTES = { 102, 97, 108, 115, 101 };
  static final byte[] HEX_CHARS = CharTypes.copyHexBytes();
  private static final byte[] NULL_BYTES = { 110, 117, 108, 108 };
  private static final byte[] TRUE_BYTES = { 116, 114, 117, 101 };
  protected boolean _bufferRecyclable;
  protected char[] _charBuffer;
  protected final int _charBufferLength;
  protected byte[] _outputBuffer;
  protected final int _outputEnd;
  protected final int _outputMaxContiguous;
  protected final OutputStream _outputStream;
  protected int _outputTail = 0;

  public UTF8JsonGenerator(IOContext paramIOContext, int paramInt, ObjectCodec paramObjectCodec, OutputStream paramOutputStream)
  {
    super(paramIOContext, paramInt, paramObjectCodec);
    this._outputStream = paramOutputStream;
    this._bufferRecyclable = true;
    this._outputBuffer = paramIOContext.allocWriteEncodingBuffer();
    this._outputEnd = this._outputBuffer.length;
    this._outputMaxContiguous = (this._outputEnd >> 3);
    this._charBuffer = paramIOContext.allocConcatBuffer();
    this._charBufferLength = this._charBuffer.length;
    if (isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII))
      setHighestNonEscapedChar(127);
  }

  private int _handleLongCustomEscape(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3)
  {
    int i = paramArrayOfByte2.length;
    int j;
    if (paramInt1 + i > paramInt2)
    {
      this._outputTail = paramInt1;
      _flushBuffer();
      j = this._outputTail;
      if (i > paramArrayOfByte1.length)
        this._outputStream.write(paramArrayOfByte2, 0, i);
    }
    while (true)
    {
      return j;
      System.arraycopy(paramArrayOfByte2, 0, paramArrayOfByte1, j, i);
      j += i;
      while (j + paramInt3 * 6 > paramInt2)
      {
        _flushBuffer();
        return this._outputTail;
        j = paramInt1;
      }
    }
  }

  private int _outputMultiByteChar(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = this._outputBuffer;
    if ((paramInt1 >= 55296) && (paramInt1 <= 57343))
    {
      int m = paramInt2 + 1;
      arrayOfByte[paramInt2] = 92;
      int n = m + 1;
      arrayOfByte[m] = 117;
      int i1 = n + 1;
      arrayOfByte[n] = HEX_CHARS[(0xF & paramInt1 >> 12)];
      int i2 = i1 + 1;
      arrayOfByte[i1] = HEX_CHARS[(0xF & paramInt1 >> 8)];
      int i3 = i2 + 1;
      arrayOfByte[i2] = HEX_CHARS[(0xF & paramInt1 >> 4)];
      int i4 = i3 + 1;
      arrayOfByte[i3] = HEX_CHARS[(paramInt1 & 0xF)];
      return i4;
    }
    int i = paramInt2 + 1;
    arrayOfByte[paramInt2] = (byte)(0xE0 | paramInt1 >> 12);
    int j = i + 1;
    arrayOfByte[i] = (byte)(0x80 | 0x3F & paramInt1 >> 6);
    int k = j + 1;
    arrayOfByte[j] = (byte)(0x80 | paramInt1 & 0x3F);
    return k;
  }

  private int _outputRawMultiByteChar(int paramInt1, char[] paramArrayOfChar, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 55296) && (paramInt1 <= 57343))
    {
      if (paramInt2 >= paramInt3)
        _reportError("Split surrogate on writeRaw() input (last character)");
      _outputSurrogates(paramInt1, paramArrayOfChar[paramInt2]);
      return paramInt2 + 1;
    }
    byte[] arrayOfByte = this._outputBuffer;
    int i = this._outputTail;
    this._outputTail = (i + 1);
    arrayOfByte[i] = (byte)(0xE0 | paramInt1 >> 12);
    int j = this._outputTail;
    this._outputTail = (j + 1);
    arrayOfByte[j] = (byte)(0x80 | 0x3F & paramInt1 >> 6);
    int k = this._outputTail;
    this._outputTail = (k + 1);
    arrayOfByte[k] = (byte)(0x80 | paramInt1 & 0x3F);
    return paramInt2;
  }

  private final void _writeBytes(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    if (i + this._outputTail > this._outputEnd)
    {
      _flushBuffer();
      if (i > 512)
      {
        this._outputStream.write(paramArrayOfByte, 0, i);
        return;
      }
    }
    System.arraycopy(paramArrayOfByte, 0, this._outputBuffer, this._outputTail, i);
    this._outputTail = (i + this._outputTail);
  }

  private int _writeCustomEscape(byte[] paramArrayOfByte, int paramInt1, SerializableString paramSerializableString, int paramInt2)
  {
    byte[] arrayOfByte = paramSerializableString.asUnquotedUTF8();
    int i = arrayOfByte.length;
    if (i > 6)
      return _handleLongCustomEscape(paramArrayOfByte, paramInt1, this._outputEnd, arrayOfByte, paramInt2);
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte, paramInt1, i);
    return i + paramInt1;
  }

  private void _writeCustomStringSegment2(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this._outputTail + 6 * (paramInt2 - paramInt1) > this._outputEnd)
      _flushBuffer();
    int i = this._outputTail;
    byte[] arrayOfByte = this._outputBuffer;
    int[] arrayOfInt = this._outputEscapes;
    int j;
    CharacterEscapes localCharacterEscapes;
    if (this._maximumNonEscapedChar <= 0)
    {
      j = 65535;
      localCharacterEscapes = this._characterEscapes;
    }
    while (true)
    {
      if (paramInt1 >= paramInt2)
        break label384;
      int k = paramInt1 + 1;
      int m = paramArrayOfChar[paramInt1];
      if (m <= 127)
      {
        if (arrayOfInt[m] == 0)
        {
          int i3 = i + 1;
          arrayOfByte[i] = (byte)m;
          i = i3;
          paramInt1 = k;
          continue;
          j = this._maximumNonEscapedChar;
          break;
        }
        int i1 = arrayOfInt[m];
        if (i1 > 0)
        {
          int i2 = i + 1;
          arrayOfByte[i] = 92;
          i = i2 + 1;
          arrayOfByte[i2] = (byte)i1;
          paramInt1 = k;
          continue;
        }
        if (i1 == -2)
        {
          SerializableString localSerializableString2 = localCharacterEscapes.getEscapeSequence(m);
          if (localSerializableString2 == null)
            _reportError("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(m) + ", although was supposed to have one");
          i = _writeCustomEscape(arrayOfByte, i, localSerializableString2, paramInt2 - k);
          paramInt1 = k;
          continue;
        }
        i = _writeGenericEscape(m, i);
        paramInt1 = k;
        continue;
      }
      if (m > j)
      {
        i = _writeGenericEscape(m, i);
        paramInt1 = k;
      }
      else
      {
        SerializableString localSerializableString1 = localCharacterEscapes.getEscapeSequence(m);
        if (localSerializableString1 != null)
        {
          i = _writeCustomEscape(arrayOfByte, i, localSerializableString1, paramInt2 - k);
          paramInt1 = k;
        }
        else if (m <= 2047)
        {
          int n = i + 1;
          arrayOfByte[i] = (byte)(0xC0 | m >> 6);
          i = n + 1;
          arrayOfByte[n] = (byte)(0x80 | m & 0x3F);
          paramInt1 = k;
        }
        else
        {
          i = _outputMultiByteChar(m, i);
          paramInt1 = k;
        }
      }
    }
    label384: this._outputTail = i;
  }

  private int _writeGenericEscape(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = this._outputBuffer;
    int i = paramInt2 + 1;
    arrayOfByte[paramInt2] = 92;
    int j = i + 1;
    arrayOfByte[i] = 117;
    int m;
    if (paramInt1 > 255)
    {
      int i2 = 0xFF & paramInt1 >> 8;
      int i3 = j + 1;
      arrayOfByte[j] = HEX_CHARS[(i2 >> 4)];
      m = i3 + 1;
      arrayOfByte[i3] = HEX_CHARS[(i2 & 0xF)];
      paramInt1 &= 255;
    }
    while (true)
    {
      int n = m + 1;
      arrayOfByte[m] = HEX_CHARS[(paramInt1 >> 4)];
      int i1 = n + 1;
      arrayOfByte[n] = HEX_CHARS[(paramInt1 & 0xF)];
      return i1;
      int k = j + 1;
      arrayOfByte[j] = 48;
      m = k + 1;
      arrayOfByte[k] = 48;
    }
  }

  private void _writeLongString(String paramString)
  {
    if (this._outputTail >= this._outputEnd)
      _flushBuffer();
    byte[] arrayOfByte1 = this._outputBuffer;
    int i = this._outputTail;
    this._outputTail = (i + 1);
    arrayOfByte1[i] = 34;
    _writeStringSegments(paramString);
    if (this._outputTail >= this._outputEnd)
      _flushBuffer();
    byte[] arrayOfByte2 = this._outputBuffer;
    int j = this._outputTail;
    this._outputTail = (j + 1);
    arrayOfByte2[j] = 34;
  }

  private void _writeLongString(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this._outputTail >= this._outputEnd)
      _flushBuffer();
    byte[] arrayOfByte1 = this._outputBuffer;
    int i = this._outputTail;
    this._outputTail = (i + 1);
    arrayOfByte1[i] = 34;
    _writeStringSegments(this._charBuffer, 0, paramInt2);
    if (this._outputTail >= this._outputEnd)
      _flushBuffer();
    byte[] arrayOfByte2 = this._outputBuffer;
    int j = this._outputTail;
    this._outputTail = (j + 1);
    arrayOfByte2[j] = 34;
  }

  private void _writeNull()
  {
    if (4 + this._outputTail >= this._outputEnd)
      _flushBuffer();
    System.arraycopy(NULL_BYTES, 0, this._outputBuffer, this._outputTail, 4);
    this._outputTail = (4 + this._outputTail);
  }

  private void _writeQuotedInt(int paramInt)
  {
    if (13 + this._outputTail >= this._outputEnd)
      _flushBuffer();
    byte[] arrayOfByte1 = this._outputBuffer;
    int i = this._outputTail;
    this._outputTail = (i + 1);
    arrayOfByte1[i] = 34;
    this._outputTail = NumberOutput.outputInt(paramInt, this._outputBuffer, this._outputTail);
    byte[] arrayOfByte2 = this._outputBuffer;
    int j = this._outputTail;
    this._outputTail = (j + 1);
    arrayOfByte2[j] = 34;
  }

  private void _writeQuotedLong(long paramLong)
  {
    if (23 + this._outputTail >= this._outputEnd)
      _flushBuffer();
    byte[] arrayOfByte1 = this._outputBuffer;
    int i = this._outputTail;
    this._outputTail = (i + 1);
    arrayOfByte1[i] = 34;
    this._outputTail = NumberOutput.outputLong(paramLong, this._outputBuffer, this._outputTail);
    byte[] arrayOfByte2 = this._outputBuffer;
    int j = this._outputTail;
    this._outputTail = (j + 1);
    arrayOfByte2[j] = 34;
  }

  private void _writeQuotedRaw(Object paramObject)
  {
    if (this._outputTail >= this._outputEnd)
      _flushBuffer();
    byte[] arrayOfByte1 = this._outputBuffer;
    int i = this._outputTail;
    this._outputTail = (i + 1);
    arrayOfByte1[i] = 34;
    writeRaw(paramObject.toString());
    if (this._outputTail >= this._outputEnd)
      _flushBuffer();
    byte[] arrayOfByte2 = this._outputBuffer;
    int j = this._outputTail;
    this._outputTail = (j + 1);
    arrayOfByte2[j] = 34;
  }

  private final void _writeSegmentedRaw(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = this._outputEnd;
    byte[] arrayOfByte = this._outputBuffer;
    int j = paramInt1;
    while (true)
    {
      if (j < paramInt2)
        do
        {
          int k = paramArrayOfChar[j];
          if (k >= 128)
            break;
          if (this._outputTail >= i)
            _flushBuffer();
          int i3 = this._outputTail;
          this._outputTail = (i3 + 1);
          arrayOfByte[i3] = (byte)k;
          j++;
        }
        while (j < paramInt2);
      return;
      if (3 + this._outputTail >= this._outputEnd)
        _flushBuffer();
      int m = j + 1;
      int n = paramArrayOfChar[j];
      if (n < 2048)
      {
        int i1 = this._outputTail;
        this._outputTail = (i1 + 1);
        arrayOfByte[i1] = (byte)(0xC0 | n >> 6);
        int i2 = this._outputTail;
        this._outputTail = (i2 + 1);
        arrayOfByte[i2] = (byte)(0x80 | n & 0x3F);
        j = m;
      }
      else
      {
        _outputRawMultiByteChar(n, paramArrayOfChar, m, paramInt2);
        j = m;
      }
    }
  }

  private final void _writeStringSegment(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = paramInt2 + paramInt1;
    int j = this._outputTail;
    byte[] arrayOfByte = this._outputBuffer;
    int[] arrayOfInt = this._outputEscapes;
    while (paramInt1 < i)
    {
      int k = paramArrayOfChar[paramInt1];
      if ((k > 127) || (arrayOfInt[k] != 0))
        break;
      int m = j + 1;
      arrayOfByte[j] = (byte)k;
      paramInt1++;
      j = m;
    }
    this._outputTail = j;
    if (paramInt1 < i)
    {
      if (this._characterEscapes != null)
        _writeCustomStringSegment2(paramArrayOfChar, paramInt1, i);
    }
    else
      return;
    if (this._maximumNonEscapedChar == 0)
    {
      _writeStringSegment2(paramArrayOfChar, paramInt1, i);
      return;
    }
    _writeStringSegmentASCII2(paramArrayOfChar, paramInt1, i);
  }

  private final void _writeStringSegment2(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this._outputTail + 6 * (paramInt2 - paramInt1) > this._outputEnd)
      _flushBuffer();
    int i = this._outputTail;
    byte[] arrayOfByte = this._outputBuffer;
    int[] arrayOfInt = this._outputEscapes;
    while (paramInt1 < paramInt2)
    {
      int j = paramInt1 + 1;
      int k = paramArrayOfChar[paramInt1];
      if (k <= 127)
      {
        if (arrayOfInt[k] == 0)
        {
          int i2 = i + 1;
          arrayOfByte[i] = (byte)k;
          i = i2;
          paramInt1 = j;
        }
        else
        {
          int n = arrayOfInt[k];
          if (n > 0)
          {
            int i1 = i + 1;
            arrayOfByte[i] = 92;
            i = i1 + 1;
            arrayOfByte[i1] = (byte)n;
            paramInt1 = j;
          }
          else
          {
            i = _writeGenericEscape(k, i);
            paramInt1 = j;
          }
        }
      }
      else if (k <= 2047)
      {
        int m = i + 1;
        arrayOfByte[i] = (byte)(0xC0 | k >> 6);
        i = m + 1;
        arrayOfByte[m] = (byte)(0x80 | k & 0x3F);
        paramInt1 = j;
      }
      else
      {
        i = _outputMultiByteChar(k, i);
        paramInt1 = j;
      }
    }
    this._outputTail = i;
  }

  private final void _writeStringSegmentASCII2(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this._outputTail + 6 * (paramInt2 - paramInt1) > this._outputEnd)
      _flushBuffer();
    int i = this._outputTail;
    byte[] arrayOfByte = this._outputBuffer;
    int[] arrayOfInt = this._outputEscapes;
    int j = this._maximumNonEscapedChar;
    while (paramInt1 < paramInt2)
    {
      int k = paramInt1 + 1;
      int m = paramArrayOfChar[paramInt1];
      if (m <= 127)
      {
        if (arrayOfInt[m] == 0)
        {
          int i3 = i + 1;
          arrayOfByte[i] = (byte)m;
          i = i3;
          paramInt1 = k;
        }
        else
        {
          int i1 = arrayOfInt[m];
          if (i1 > 0)
          {
            int i2 = i + 1;
            arrayOfByte[i] = 92;
            i = i2 + 1;
            arrayOfByte[i2] = (byte)i1;
            paramInt1 = k;
          }
          else
          {
            i = _writeGenericEscape(m, i);
            paramInt1 = k;
          }
        }
      }
      else if (m > j)
      {
        i = _writeGenericEscape(m, i);
        paramInt1 = k;
      }
      else if (m <= 2047)
      {
        int n = i + 1;
        arrayOfByte[i] = (byte)(0xC0 | m >> 6);
        i = n + 1;
        arrayOfByte[n] = (byte)(0x80 | m & 0x3F);
        paramInt1 = k;
      }
      else
      {
        i = _outputMultiByteChar(m, i);
        paramInt1 = k;
      }
    }
    this._outputTail = i;
  }

  private final void _writeStringSegments(String paramString)
  {
    int i = paramString.length();
    char[] arrayOfChar = this._charBuffer;
    int j = i;
    int k = 0;
    while (j > 0)
    {
      int m = Math.min(this._outputMaxContiguous, j);
      paramString.getChars(k, k + m, arrayOfChar, 0);
      if (m + this._outputTail > this._outputEnd)
        _flushBuffer();
      _writeStringSegment(arrayOfChar, 0, m);
      k += m;
      j -= m;
    }
  }

  private final void _writeStringSegments(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    do
    {
      int i = Math.min(this._outputMaxContiguous, paramInt2);
      if (i + this._outputTail > this._outputEnd)
        _flushBuffer();
      _writeStringSegment(paramArrayOfChar, paramInt1, i);
      paramInt1 += i;
      paramInt2 -= i;
    }
    while (paramInt2 > 0);
  }

  protected final int _decodeSurrogate(int paramInt1, int paramInt2)
  {
    if ((paramInt2 < 56320) || (paramInt2 > 57343))
      _reportError("Incomplete surrogate pair: first char 0x" + Integer.toHexString(paramInt1) + ", second 0x" + Integer.toHexString(paramInt2));
    return 65536 + (paramInt1 - 55296 << 10) + (paramInt2 - 56320);
  }

  protected final void _flushBuffer()
  {
    int i = this._outputTail;
    if (i > 0)
    {
      this._outputTail = 0;
      this._outputStream.write(this._outputBuffer, 0, i);
    }
  }

  protected final void _outputSurrogates(int paramInt1, int paramInt2)
  {
    int i = _decodeSurrogate(paramInt1, paramInt2);
    if (4 + this._outputTail > this._outputEnd)
      _flushBuffer();
    byte[] arrayOfByte = this._outputBuffer;
    int j = this._outputTail;
    this._outputTail = (j + 1);
    arrayOfByte[j] = (byte)(0xF0 | i >> 18);
    int k = this._outputTail;
    this._outputTail = (k + 1);
    arrayOfByte[k] = (byte)(0x80 | 0x3F & i >> 12);
    int m = this._outputTail;
    this._outputTail = (m + 1);
    arrayOfByte[m] = (byte)(0x80 | 0x3F & i >> 6);
    int n = this._outputTail;
    this._outputTail = (n + 1);
    arrayOfByte[n] = (byte)(0x80 | i & 0x3F);
  }

  protected void _releaseBuffers()
  {
    byte[] arrayOfByte = this._outputBuffer;
    if ((arrayOfByte != null) && (this._bufferRecyclable))
    {
      this._outputBuffer = null;
      this._ioContext.releaseWriteEncodingBuffer(arrayOfByte);
    }
    char[] arrayOfChar = this._charBuffer;
    if (arrayOfChar != null)
    {
      this._charBuffer = null;
      this._ioContext.releaseConcatBuffer(arrayOfChar);
    }
  }

  protected final void _verifyPrettyValueWrite(String paramString, int paramInt)
  {
    switch (paramInt)
    {
    default:
      _cantHappen();
    case 1:
    case 2:
    case 3:
    case 0:
    }
    do
    {
      return;
      this._cfgPrettyPrinter.writeArrayValueSeparator(this);
      return;
      this._cfgPrettyPrinter.writeObjectFieldValueSeparator(this);
      return;
      this._cfgPrettyPrinter.writeRootValueSeparator(this);
      return;
      if (this._writeContext.inArray())
      {
        this._cfgPrettyPrinter.beforeArrayValues(this);
        return;
      }
    }
    while (!this._writeContext.inObject());
    this._cfgPrettyPrinter.beforeObjectEntries(this);
  }

  protected final void _verifyValueWrite(String paramString)
  {
    int i = this._writeContext.writeValue();
    if (i == 5)
      _reportError("Can not " + paramString + ", expecting field name");
    if (this._cfgPrettyPrinter == null)
    {
      switch (i)
      {
      default:
      case 1:
      case 2:
      case 3:
      }
      byte[] arrayOfByte;
      do
      {
        do
        {
          return;
          for (int j = 44; ; j = 58)
          {
            if (this._outputTail >= this._outputEnd)
              _flushBuffer();
            this._outputBuffer[this._outputTail] = j;
            this._outputTail = (1 + this._outputTail);
            return;
          }
        }
        while (this._rootValueSeparator == null);
        arrayOfByte = this._rootValueSeparator.asUnquotedUTF8();
      }
      while (arrayOfByte.length <= 0);
      _writeBytes(arrayOfByte);
      return;
    }
    _verifyPrettyValueWrite(paramString, i);
  }

  protected void _writeBinary(Base64Variant paramBase64Variant, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramInt2 - 3;
    int j = -6 + this._outputEnd;
    int k = paramBase64Variant.getMaxLineLength() >> 2;
    while (paramInt1 <= i)
    {
      if (this._outputTail > j)
        _flushBuffer();
      int i2 = paramInt1 + 1;
      int i3 = paramArrayOfByte[paramInt1] << 8;
      int i4 = i2 + 1;
      int i5 = (i3 | 0xFF & paramArrayOfByte[i2]) << 8;
      paramInt1 = i4 + 1;
      this._outputTail = paramBase64Variant.encodeBase64Chunk(i5 | 0xFF & paramArrayOfByte[i4], this._outputBuffer, this._outputTail);
      k--;
      if (k <= 0)
      {
        byte[] arrayOfByte1 = this._outputBuffer;
        int i6 = this._outputTail;
        this._outputTail = (i6 + 1);
        arrayOfByte1[i6] = 92;
        byte[] arrayOfByte2 = this._outputBuffer;
        int i7 = this._outputTail;
        this._outputTail = (i7 + 1);
        arrayOfByte2[i7] = 110;
        k = paramBase64Variant.getMaxLineLength() >> 2;
      }
    }
    int m = paramInt2 - paramInt1;
    if (m > 0)
    {
      if (this._outputTail > j)
        _flushBuffer();
      int n = paramInt1 + 1;
      int i1 = paramArrayOfByte[paramInt1] << 16;
      if (m == 2)
        i1 |= (0xFF & paramArrayOfByte[n]) << 8;
      this._outputTail = paramBase64Variant.encodeBase64Partial(i1, m, this._outputBuffer, this._outputTail);
    }
  }

  protected final void _writeFieldName(SerializableString paramSerializableString)
  {
    if (!isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES))
    {
      int m = paramSerializableString.appendQuotedUTF8(this._outputBuffer, this._outputTail);
      if (m < 0)
      {
        _writeBytes(paramSerializableString.asQuotedUTF8());
        return;
      }
      this._outputTail = (m + this._outputTail);
      return;
    }
    if (this._outputTail >= this._outputEnd)
      _flushBuffer();
    byte[] arrayOfByte1 = this._outputBuffer;
    int i = this._outputTail;
    this._outputTail = (i + 1);
    arrayOfByte1[i] = 34;
    int j = paramSerializableString.appendQuotedUTF8(this._outputBuffer, this._outputTail);
    if (j < 0)
      _writeBytes(paramSerializableString.asQuotedUTF8());
    while (true)
    {
      if (this._outputTail >= this._outputEnd)
        _flushBuffer();
      byte[] arrayOfByte2 = this._outputBuffer;
      int k = this._outputTail;
      this._outputTail = (k + 1);
      arrayOfByte2[k] = 34;
      return;
      this._outputTail = (j + this._outputTail);
    }
  }

  protected final void _writeFieldName(String paramString)
  {
    if (!isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES))
    {
      _writeStringSegments(paramString);
      return;
    }
    if (this._outputTail >= this._outputEnd)
      _flushBuffer();
    byte[] arrayOfByte1 = this._outputBuffer;
    int i = this._outputTail;
    this._outputTail = (i + 1);
    arrayOfByte1[i] = 34;
    int j = paramString.length();
    if (j <= this._charBufferLength)
    {
      paramString.getChars(0, j, this._charBuffer, 0);
      if (j <= this._outputMaxContiguous)
      {
        if (j + this._outputTail > this._outputEnd)
          _flushBuffer();
        _writeStringSegment(this._charBuffer, 0, j);
      }
    }
    while (true)
    {
      if (this._outputTail >= this._outputEnd)
        _flushBuffer();
      byte[] arrayOfByte2 = this._outputBuffer;
      int k = this._outputTail;
      this._outputTail = (k + 1);
      arrayOfByte2[k] = 34;
      return;
      _writeStringSegments(this._charBuffer, 0, j);
      continue;
      _writeStringSegments(paramString);
    }
  }

  protected final void _writePPFieldName(SerializableString paramSerializableString, boolean paramBoolean)
  {
    if (paramBoolean)
      this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
    while (true)
    {
      boolean bool = isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
      if (bool)
      {
        if (this._outputTail >= this._outputEnd)
          _flushBuffer();
        byte[] arrayOfByte2 = this._outputBuffer;
        int j = this._outputTail;
        this._outputTail = (j + 1);
        arrayOfByte2[j] = 34;
      }
      _writeBytes(paramSerializableString.asQuotedUTF8());
      if (bool)
      {
        if (this._outputTail >= this._outputEnd)
          _flushBuffer();
        byte[] arrayOfByte1 = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = (i + 1);
        arrayOfByte1[i] = 34;
      }
      return;
      this._cfgPrettyPrinter.beforeObjectEntries(this);
    }
  }

  protected final void _writePPFieldName(String paramString, boolean paramBoolean)
  {
    int j;
    if (paramBoolean)
    {
      this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
      if (!isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES))
        break label207;
      if (this._outputTail >= this._outputEnd)
        _flushBuffer();
      byte[] arrayOfByte1 = this._outputBuffer;
      int i = this._outputTail;
      this._outputTail = (i + 1);
      arrayOfByte1[i] = 34;
      j = paramString.length();
      if (j > this._charBufferLength)
        break label199;
      paramString.getChars(0, j, this._charBuffer, 0);
      if (j > this._outputMaxContiguous)
        break label185;
      if (j + this._outputTail > this._outputEnd)
        _flushBuffer();
      _writeStringSegment(this._charBuffer, 0, j);
    }
    while (true)
    {
      if (this._outputTail >= this._outputEnd)
        _flushBuffer();
      byte[] arrayOfByte2 = this._outputBuffer;
      int k = this._outputTail;
      this._outputTail = (k + 1);
      arrayOfByte2[k] = 34;
      return;
      this._cfgPrettyPrinter.beforeObjectEntries(this);
      break;
      label185: _writeStringSegments(this._charBuffer, 0, j);
      continue;
      label199: _writeStringSegments(paramString);
    }
    label207: _writeStringSegments(paramString);
  }

  public void close()
  {
    super.close();
    if ((this._outputBuffer != null) && (isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)))
      while (true)
      {
        JsonWriteContext localJsonWriteContext = getOutputContext();
        if (localJsonWriteContext.inArray())
        {
          writeEndArray();
        }
        else
        {
          if (!localJsonWriteContext.inObject())
            break;
          writeEndObject();
        }
      }
    _flushBuffer();
    if (this._outputStream != null)
    {
      if ((!this._ioContext.isResourceManaged()) && (!isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)))
        break label97;
      this._outputStream.close();
    }
    while (true)
    {
      _releaseBuffers();
      return;
      label97: if (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM))
        this._outputStream.flush();
    }
  }

  public final void flush()
  {
    _flushBuffer();
    if ((this._outputStream != null) && (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)))
      this._outputStream.flush();
  }

  public void writeBinary(Base64Variant paramBase64Variant, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    _verifyValueWrite("write binary value");
    if (this._outputTail >= this._outputEnd)
      _flushBuffer();
    byte[] arrayOfByte1 = this._outputBuffer;
    int i = this._outputTail;
    this._outputTail = (i + 1);
    arrayOfByte1[i] = 34;
    _writeBinary(paramBase64Variant, paramArrayOfByte, paramInt1, paramInt1 + paramInt2);
    if (this._outputTail >= this._outputEnd)
      _flushBuffer();
    byte[] arrayOfByte2 = this._outputBuffer;
    int j = this._outputTail;
    this._outputTail = (j + 1);
    arrayOfByte2[j] = 34;
  }

  public void writeBoolean(boolean paramBoolean)
  {
    _verifyValueWrite("write boolean value");
    if (5 + this._outputTail >= this._outputEnd)
      _flushBuffer();
    if (paramBoolean);
    for (byte[] arrayOfByte = TRUE_BYTES; ; arrayOfByte = FALSE_BYTES)
    {
      int i = arrayOfByte.length;
      System.arraycopy(arrayOfByte, 0, this._outputBuffer, this._outputTail, i);
      this._outputTail = (i + this._outputTail);
      return;
    }
  }

  public final void writeEndArray()
  {
    if (!this._writeContext.inArray())
      _reportError("Current context not an ARRAY but " + this._writeContext.getTypeDesc());
    if (this._cfgPrettyPrinter != null)
      this._cfgPrettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
    while (true)
    {
      this._writeContext = this._writeContext.getParent();
      return;
      if (this._outputTail >= this._outputEnd)
        _flushBuffer();
      byte[] arrayOfByte = this._outputBuffer;
      int i = this._outputTail;
      this._outputTail = (i + 1);
      arrayOfByte[i] = 93;
    }
  }

  public final void writeEndObject()
  {
    if (!this._writeContext.inObject())
      _reportError("Current context not an object but " + this._writeContext.getTypeDesc());
    if (this._cfgPrettyPrinter != null)
      this._cfgPrettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
    while (true)
    {
      this._writeContext = this._writeContext.getParent();
      return;
      if (this._outputTail >= this._outputEnd)
        _flushBuffer();
      byte[] arrayOfByte = this._outputBuffer;
      int i = this._outputTail;
      this._outputTail = (i + 1);
      arrayOfByte[i] = 125;
    }
  }

  public final void writeFieldName(SerializableString paramSerializableString)
  {
    int i = 1;
    int j = this._writeContext.writeFieldName(paramSerializableString.getValue());
    if (j == 4)
      _reportError("Can not write a field name, expecting a value");
    if (this._cfgPrettyPrinter != null)
    {
      if (j == i);
      while (true)
      {
        _writePPFieldName(paramSerializableString, i);
        return;
        i = 0;
      }
    }
    if (j == i)
    {
      if (this._outputTail >= this._outputEnd)
        _flushBuffer();
      byte[] arrayOfByte = this._outputBuffer;
      int k = this._outputTail;
      this._outputTail = (k + 1);
      arrayOfByte[k] = 44;
    }
    _writeFieldName(paramSerializableString);
  }

  public final void writeFieldName(String paramString)
  {
    int i = 1;
    int j = this._writeContext.writeFieldName(paramString);
    if (j == 4)
      _reportError("Can not write a field name, expecting a value");
    if (this._cfgPrettyPrinter != null)
    {
      if (j == i);
      while (true)
      {
        _writePPFieldName(paramString, i);
        return;
        i = 0;
      }
    }
    if (j == i)
    {
      if (this._outputTail >= this._outputEnd)
        _flushBuffer();
      byte[] arrayOfByte = this._outputBuffer;
      int k = this._outputTail;
      this._outputTail = (k + 1);
      arrayOfByte[k] = 44;
    }
    _writeFieldName(paramString);
  }

  public void writeNull()
  {
    _verifyValueWrite("write null value");
    _writeNull();
  }

  public void writeNumber(double paramDouble)
  {
    if ((this._cfgNumbersAsStrings) || (((Double.isNaN(paramDouble)) || (Double.isInfinite(paramDouble))) && (isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))))
    {
      writeString(String.valueOf(paramDouble));
      return;
    }
    _verifyValueWrite("write number");
    writeRaw(String.valueOf(paramDouble));
  }

  public void writeNumber(float paramFloat)
  {
    if ((this._cfgNumbersAsStrings) || (((Float.isNaN(paramFloat)) || (Float.isInfinite(paramFloat))) && (isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))))
    {
      writeString(String.valueOf(paramFloat));
      return;
    }
    _verifyValueWrite("write number");
    writeRaw(String.valueOf(paramFloat));
  }

  public void writeNumber(int paramInt)
  {
    _verifyValueWrite("write number");
    if (11 + this._outputTail >= this._outputEnd)
      _flushBuffer();
    if (this._cfgNumbersAsStrings)
    {
      _writeQuotedInt(paramInt);
      return;
    }
    this._outputTail = NumberOutput.outputInt(paramInt, this._outputBuffer, this._outputTail);
  }

  public void writeNumber(long paramLong)
  {
    _verifyValueWrite("write number");
    if (this._cfgNumbersAsStrings)
    {
      _writeQuotedLong(paramLong);
      return;
    }
    if (21 + this._outputTail >= this._outputEnd)
      _flushBuffer();
    this._outputTail = NumberOutput.outputLong(paramLong, this._outputBuffer, this._outputTail);
  }

  public void writeNumber(String paramString)
  {
    _verifyValueWrite("write number");
    if (this._cfgNumbersAsStrings)
    {
      _writeQuotedRaw(paramString);
      return;
    }
    writeRaw(paramString);
  }

  public void writeNumber(BigDecimal paramBigDecimal)
  {
    _verifyValueWrite("write number");
    if (paramBigDecimal == null)
    {
      _writeNull();
      return;
    }
    if (this._cfgNumbersAsStrings)
    {
      _writeQuotedRaw(paramBigDecimal);
      return;
    }
    writeRaw(paramBigDecimal.toString());
  }

  public void writeNumber(BigInteger paramBigInteger)
  {
    _verifyValueWrite("write number");
    if (paramBigInteger == null)
    {
      _writeNull();
      return;
    }
    if (this._cfgNumbersAsStrings)
    {
      _writeQuotedRaw(paramBigInteger);
      return;
    }
    writeRaw(paramBigInteger.toString());
  }

  public void writeRaw(char paramChar)
  {
    if (3 + this._outputTail >= this._outputEnd)
      _flushBuffer();
    byte[] arrayOfByte = this._outputBuffer;
    if (paramChar <= '')
    {
      int k = this._outputTail;
      this._outputTail = (k + 1);
      arrayOfByte[k] = (byte)paramChar;
      return;
    }
    if (paramChar < 'ࠀ')
    {
      int i = this._outputTail;
      this._outputTail = (i + 1);
      arrayOfByte[i] = (byte)(0xC0 | paramChar >> '\006');
      int j = this._outputTail;
      this._outputTail = (j + 1);
      arrayOfByte[j] = (byte)(0x80 | paramChar & 0x3F);
      return;
    }
    _outputRawMultiByteChar(paramChar, null, 0, 0);
  }

  public void writeRaw(SerializableString paramSerializableString)
  {
    byte[] arrayOfByte = paramSerializableString.asUnquotedUTF8();
    if (arrayOfByte.length > 0)
      _writeBytes(arrayOfByte);
  }

  public void writeRaw(String paramString)
  {
    int i = paramString.length();
    int j = 0;
    while (i > 0)
    {
      char[] arrayOfChar = this._charBuffer;
      int k = arrayOfChar.length;
      if (i < k)
        k = i;
      paramString.getChars(j, j + k, arrayOfChar, 0);
      writeRaw(arrayOfChar, 0, k);
      j += k;
      i -= k;
    }
  }

  public final void writeRaw(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = paramInt2 + (paramInt2 + paramInt2);
    if (i + this._outputTail > this._outputEnd)
      if (this._outputEnd < i)
        _writeSegmentedRaw(paramArrayOfChar, paramInt1, paramInt2);
    label225: 
    while (true)
    {
      return;
      _flushBuffer();
      int j = paramInt2 + paramInt1;
      int k = paramInt1;
      while (true)
      {
        if (k >= j)
          break label225;
        while (true)
        {
          int m = paramArrayOfChar[k];
          if (m > 127)
            break label111;
          byte[] arrayOfByte3 = this._outputBuffer;
          int i4 = this._outputTail;
          this._outputTail = (i4 + 1);
          arrayOfByte3[i4] = (byte)m;
          k++;
          if (k >= j)
            break;
        }
        label111: int n = k + 1;
        int i1 = paramArrayOfChar[k];
        if (i1 < 2048)
        {
          byte[] arrayOfByte1 = this._outputBuffer;
          int i2 = this._outputTail;
          this._outputTail = (i2 + 1);
          arrayOfByte1[i2] = (byte)(0xC0 | i1 >> 6);
          byte[] arrayOfByte2 = this._outputBuffer;
          int i3 = this._outputTail;
          this._outputTail = (i3 + 1);
          arrayOfByte2[i3] = (byte)(0x80 | i1 & 0x3F);
          k = n;
        }
        else
        {
          _outputRawMultiByteChar(i1, paramArrayOfChar, n, j);
          k = n;
        }
      }
    }
  }

  public final void writeStartArray()
  {
    _verifyValueWrite("start an array");
    this._writeContext = this._writeContext.createChildArrayContext();
    if (this._cfgPrettyPrinter != null)
    {
      this._cfgPrettyPrinter.writeStartArray(this);
      return;
    }
    if (this._outputTail >= this._outputEnd)
      _flushBuffer();
    byte[] arrayOfByte = this._outputBuffer;
    int i = this._outputTail;
    this._outputTail = (i + 1);
    arrayOfByte[i] = 91;
  }

  public final void writeStartObject()
  {
    _verifyValueWrite("start an object");
    this._writeContext = this._writeContext.createChildObjectContext();
    if (this._cfgPrettyPrinter != null)
    {
      this._cfgPrettyPrinter.writeStartObject(this);
      return;
    }
    if (this._outputTail >= this._outputEnd)
      _flushBuffer();
    byte[] arrayOfByte = this._outputBuffer;
    int i = this._outputTail;
    this._outputTail = (i + 1);
    arrayOfByte[i] = 123;
  }

  public final void writeString(SerializableString paramSerializableString)
  {
    _verifyValueWrite("write text value");
    if (this._outputTail >= this._outputEnd)
      _flushBuffer();
    byte[] arrayOfByte1 = this._outputBuffer;
    int i = this._outputTail;
    this._outputTail = (i + 1);
    arrayOfByte1[i] = 34;
    int j = paramSerializableString.appendQuotedUTF8(this._outputBuffer, this._outputTail);
    if (j < 0)
      _writeBytes(paramSerializableString.asQuotedUTF8());
    while (true)
    {
      if (this._outputTail >= this._outputEnd)
        _flushBuffer();
      byte[] arrayOfByte2 = this._outputBuffer;
      int k = this._outputTail;
      this._outputTail = (k + 1);
      arrayOfByte2[k] = 34;
      return;
      this._outputTail = (j + this._outputTail);
    }
  }

  public void writeString(String paramString)
  {
    _verifyValueWrite("write text value");
    if (paramString == null)
    {
      _writeNull();
      return;
    }
    int i = paramString.length();
    if (i > this._charBufferLength)
    {
      _writeLongString(paramString);
      return;
    }
    paramString.getChars(0, i, this._charBuffer, 0);
    if (i > this._outputMaxContiguous)
    {
      _writeLongString(this._charBuffer, 0, i);
      return;
    }
    if (i + this._outputTail >= this._outputEnd)
      _flushBuffer();
    byte[] arrayOfByte1 = this._outputBuffer;
    int j = this._outputTail;
    this._outputTail = (j + 1);
    arrayOfByte1[j] = 34;
    _writeStringSegment(this._charBuffer, 0, i);
    if (this._outputTail >= this._outputEnd)
      _flushBuffer();
    byte[] arrayOfByte2 = this._outputBuffer;
    int k = this._outputTail;
    this._outputTail = (k + 1);
    arrayOfByte2[k] = 34;
  }

  public void writeString(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    _verifyValueWrite("write text value");
    if (this._outputTail >= this._outputEnd)
      _flushBuffer();
    byte[] arrayOfByte1 = this._outputBuffer;
    int i = this._outputTail;
    this._outputTail = (i + 1);
    arrayOfByte1[i] = 34;
    if (paramInt2 <= this._outputMaxContiguous)
    {
      if (paramInt2 + this._outputTail > this._outputEnd)
        _flushBuffer();
      _writeStringSegment(paramArrayOfChar, paramInt1, paramInt2);
    }
    while (true)
    {
      if (this._outputTail >= this._outputEnd)
        _flushBuffer();
      byte[] arrayOfByte2 = this._outputBuffer;
      int j = this._outputTail;
      this._outputTail = (j + 1);
      arrayOfByte2[j] = 34;
      return;
      _writeStringSegments(paramArrayOfChar, paramInt1, paramInt2);
    }
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.core.json.UTF8JsonGenerator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
