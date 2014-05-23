package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public final class UTF8Writer extends Writer
{
  protected final IOContext _context;
  OutputStream _out;
  byte[] _outBuffer;
  final int _outBufferEnd;
  int _outPtr;
  int _surrogate = 0;

  public UTF8Writer(IOContext paramIOContext, OutputStream paramOutputStream)
  {
    this._context = paramIOContext;
    this._out = paramOutputStream;
    this._outBuffer = paramIOContext.allocWriteEncodingBuffer();
    this._outBufferEnd = (-4 + this._outBuffer.length);
    this._outPtr = 0;
  }

  private int convertSurrogate(int paramInt)
  {
    int i = this._surrogate;
    this._surrogate = 0;
    if ((paramInt < 56320) || (paramInt > 57343))
      throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(paramInt) + "; illegal combination");
    return 65536 + (i - 55296 << 10) + (paramInt - 56320);
  }

  private void throwIllegal(int paramInt)
  {
    if (paramInt > 1114111)
      throw new IOException("Illegal character point (0x" + Integer.toHexString(paramInt) + ") to output; max is 0x10FFFF as per RFC 4627");
    if (paramInt >= 55296)
    {
      if (paramInt <= 56319)
        throw new IOException("Unmatched first part of surrogate pair (0x" + Integer.toHexString(paramInt) + ")");
      throw new IOException("Unmatched second part of surrogate pair (0x" + Integer.toHexString(paramInt) + ")");
    }
    throw new IOException("Illegal character point (0x" + Integer.toHexString(paramInt) + ") to output");
  }

  public final Writer append(char paramChar)
  {
    write(paramChar);
    return this;
  }

  public final void close()
  {
    if (this._out != null)
    {
      if (this._outPtr > 0)
      {
        this._out.write(this._outBuffer, 0, this._outPtr);
        this._outPtr = 0;
      }
      OutputStream localOutputStream = this._out;
      this._out = null;
      byte[] arrayOfByte = this._outBuffer;
      if (arrayOfByte != null)
      {
        this._outBuffer = null;
        this._context.releaseWriteEncodingBuffer(arrayOfByte);
      }
      localOutputStream.close();
      int i = this._surrogate;
      this._surrogate = 0;
      if (i > 0)
        throwIllegal(i);
    }
  }

  public final void flush()
  {
    if (this._out != null)
    {
      if (this._outPtr > 0)
      {
        this._out.write(this._outBuffer, 0, this._outPtr);
        this._outPtr = 0;
      }
      this._out.flush();
    }
  }

  public final void write(int paramInt)
  {
    if (this._surrogate > 0)
      paramInt = convertSurrogate(paramInt);
    while ((paramInt < 55296) || (paramInt > 57343))
    {
      if (this._outPtr >= this._outBufferEnd)
      {
        this._out.write(this._outBuffer, 0, this._outPtr);
        this._outPtr = 0;
      }
      if (paramInt >= 128)
        break;
      byte[] arrayOfByte10 = this._outBuffer;
      int i4 = this._outPtr;
      this._outPtr = (i4 + 1);
      arrayOfByte10[i4] = (byte)paramInt;
      return;
    }
    if (paramInt > 56319)
      throwIllegal(paramInt);
    this._surrogate = paramInt;
    return;
    int i = this._outPtr;
    int n;
    if (paramInt < 2048)
    {
      byte[] arrayOfByte8 = this._outBuffer;
      int i3 = i + 1;
      arrayOfByte8[i] = (byte)(0xC0 | paramInt >> 6);
      byte[] arrayOfByte9 = this._outBuffer;
      n = i3 + 1;
      arrayOfByte9[i3] = (byte)(0x80 | paramInt & 0x3F);
    }
    while (true)
    {
      this._outPtr = n;
      return;
      if (paramInt <= 65535)
      {
        byte[] arrayOfByte5 = this._outBuffer;
        int i1 = i + 1;
        arrayOfByte5[i] = (byte)(0xE0 | paramInt >> 12);
        byte[] arrayOfByte6 = this._outBuffer;
        int i2 = i1 + 1;
        arrayOfByte6[i1] = (byte)(0x80 | 0x3F & paramInt >> 6);
        byte[] arrayOfByte7 = this._outBuffer;
        n = i2 + 1;
        arrayOfByte7[i2] = (byte)(0x80 | paramInt & 0x3F);
      }
      else
      {
        if (paramInt > 1114111)
          throwIllegal(paramInt);
        byte[] arrayOfByte1 = this._outBuffer;
        int j = i + 1;
        arrayOfByte1[i] = (byte)(0xF0 | paramInt >> 18);
        byte[] arrayOfByte2 = this._outBuffer;
        int k = j + 1;
        arrayOfByte2[j] = (byte)(0x80 | 0x3F & paramInt >> 12);
        byte[] arrayOfByte3 = this._outBuffer;
        int m = k + 1;
        arrayOfByte3[k] = (byte)(0x80 | 0x3F & paramInt >> 6);
        byte[] arrayOfByte4 = this._outBuffer;
        n = m + 1;
        arrayOfByte4[m] = (byte)(0x80 | paramInt & 0x3F);
      }
    }
  }

  public final void write(String paramString)
  {
    write(paramString, 0, paramString.length());
  }

  public final void write(String paramString, int paramInt1, int paramInt2)
  {
    if (paramInt2 < 2)
    {
      if (paramInt2 == 1)
        write(paramString.charAt(paramInt1));
      return;
    }
    if (this._surrogate > 0)
    {
      int i16 = paramInt1 + 1;
      int i17 = paramString.charAt(paramInt1);
      paramInt2--;
      write(convertSurrogate(i17));
      paramInt1 = i16;
    }
    int i = this._outPtr;
    byte[] arrayOfByte = this._outBuffer;
    int j = this._outBufferEnd;
    int k = paramInt2 + paramInt1;
    int m;
    int n;
    int i8;
    int i9;
    int i10;
    if (paramInt1 < k)
    {
      if (i >= j)
      {
        this._out.write(arrayOfByte, 0, i);
        i = 0;
      }
      m = paramInt1 + 1;
      n = paramString.charAt(paramInt1);
      if (n < 128)
      {
        i8 = i + 1;
        arrayOfByte[i] = (byte)n;
        i9 = k - m;
        i10 = j - i8;
        if (i9 <= i10)
          break label558;
      }
    }
    while (true)
    {
      int i11 = i10 + m;
      int i12 = i8;
      int i13 = m;
      while (true)
        if (i13 < i11)
        {
          m = i13 + 1;
          int i14 = paramString.charAt(i13);
          if (i14 < 128)
          {
            int i15 = i12 + 1;
            arrayOfByte[i12] = (byte)i14;
            i12 = i15;
            i13 = m;
          }
          else
          {
            i = i12;
            n = i14;
            if (n < 2048)
            {
              int i7 = i + 1;
              arrayOfByte[i] = (byte)(0xC0 | n >> 6);
              i = i7 + 1;
              arrayOfByte[i7] = (byte)(0x80 | n & 0x3F);
              paramInt1 = m;
              break;
            }
            if ((n < 55296) || (n > 57343))
            {
              int i1 = i + 1;
              arrayOfByte[i] = (byte)(0xE0 | n >> 12);
              int i2 = i1 + 1;
              arrayOfByte[i1] = (byte)(0x80 | 0x3F & n >> 6);
              i = i2 + 1;
              arrayOfByte[i2] = (byte)(0x80 | n & 0x3F);
              paramInt1 = m;
              break;
            }
            if (n > 56319)
            {
              this._outPtr = i;
              throwIllegal(n);
            }
            this._surrogate = n;
            if (m < k)
            {
              paramInt1 = m + 1;
              int i3 = convertSurrogate(paramString.charAt(m));
              if (i3 > 1114111)
              {
                this._outPtr = i;
                throwIllegal(i3);
              }
              int i4 = i + 1;
              arrayOfByte[i] = (byte)(0xF0 | i3 >> 18);
              int i5 = i4 + 1;
              arrayOfByte[i4] = (byte)(0x80 | 0x3F & i3 >> 12);
              int i6 = i5 + 1;
              arrayOfByte[i5] = (byte)(0x80 | 0x3F & i3 >> 6);
              i = i6 + 1;
              arrayOfByte[i6] = (byte)(0x80 | i3 & 0x3F);
              break;
            }
            this._outPtr = i;
            return;
          }
        }
      paramInt1 = i13;
      i = i12;
      break;
      label558: i10 = i9;
    }
  }

  public final void write(char[] paramArrayOfChar)
  {
    write(paramArrayOfChar, 0, paramArrayOfChar.length);
  }

  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (paramInt2 < 2)
    {
      if (paramInt2 == 1)
        write(paramArrayOfChar[paramInt1]);
      return;
    }
    if (this._surrogate > 0)
    {
      int i16 = paramInt1 + 1;
      int i17 = paramArrayOfChar[paramInt1];
      paramInt2--;
      write(convertSurrogate(i17));
      paramInt1 = i16;
    }
    int i = this._outPtr;
    byte[] arrayOfByte = this._outBuffer;
    int j = this._outBufferEnd;
    int k = paramInt2 + paramInt1;
    int m;
    int n;
    int i8;
    int i9;
    int i10;
    if (paramInt1 < k)
    {
      if (i >= j)
      {
        this._out.write(arrayOfByte, 0, i);
        i = 0;
      }
      m = paramInt1 + 1;
      n = paramArrayOfChar[paramInt1];
      if (n < 128)
      {
        i8 = i + 1;
        arrayOfByte[i] = (byte)n;
        i9 = k - m;
        i10 = j - i8;
        if (i9 <= i10)
          break label548;
      }
    }
    while (true)
    {
      int i11 = i10 + m;
      int i12 = i8;
      int i13 = m;
      while (true)
        if (i13 < i11)
        {
          m = i13 + 1;
          int i14 = paramArrayOfChar[i13];
          if (i14 < 128)
          {
            int i15 = i12 + 1;
            arrayOfByte[i12] = (byte)i14;
            i12 = i15;
            i13 = m;
          }
          else
          {
            i = i12;
            n = i14;
            if (n < 2048)
            {
              int i7 = i + 1;
              arrayOfByte[i] = (byte)(0xC0 | n >> 6);
              i = i7 + 1;
              arrayOfByte[i7] = (byte)(0x80 | n & 0x3F);
              paramInt1 = m;
              break;
            }
            if ((n < 55296) || (n > 57343))
            {
              int i1 = i + 1;
              arrayOfByte[i] = (byte)(0xE0 | n >> 12);
              int i2 = i1 + 1;
              arrayOfByte[i1] = (byte)(0x80 | 0x3F & n >> 6);
              i = i2 + 1;
              arrayOfByte[i2] = (byte)(0x80 | n & 0x3F);
              paramInt1 = m;
              break;
            }
            if (n > 56319)
            {
              this._outPtr = i;
              throwIllegal(n);
            }
            this._surrogate = n;
            if (m < k)
            {
              paramInt1 = m + 1;
              int i3 = convertSurrogate(paramArrayOfChar[m]);
              if (i3 > 1114111)
              {
                this._outPtr = i;
                throwIllegal(i3);
              }
              int i4 = i + 1;
              arrayOfByte[i] = (byte)(0xF0 | i3 >> 18);
              int i5 = i4 + 1;
              arrayOfByte[i4] = (byte)(0x80 | 0x3F & i3 >> 12);
              int i6 = i5 + 1;
              arrayOfByte[i5] = (byte)(0x80 | 0x3F & i3 >> 6);
              i = i6 + 1;
              arrayOfByte[i6] = (byte)(0x80 | i3 & 0x3F);
              break;
            }
            this._outPtr = i;
            return;
          }
        }
      paramInt1 = i13;
      i = i12;
      break;
      label548: i10 = i9;
    }
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.core.io.UTF8Writer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
