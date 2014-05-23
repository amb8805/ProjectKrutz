package com.fasterxml.jackson.core.util;

public class BufferRecycler
{
  protected final byte[][] _byteBuffers = new byte[BufferRecycler.ByteBufferType.values().length][];
  protected final char[][] _charBuffers = new char[BufferRecycler.CharBufferType.values().length][];

  public BufferRecycler()
  {
  }

  private byte[] balloc(int paramInt)
  {
    return new byte[paramInt];
  }

  private char[] calloc(int paramInt)
  {
    return new char[paramInt];
  }

  public final byte[] allocByteBuffer(BufferRecycler.ByteBufferType paramByteBufferType)
  {
    int i = paramByteBufferType.ordinal();
    byte[] arrayOfByte = this._byteBuffers[i];
    if (arrayOfByte == null)
      return balloc(paramByteBufferType.size);
    this._byteBuffers[i] = null;
    return arrayOfByte;
  }

  public final char[] allocCharBuffer(BufferRecycler.CharBufferType paramCharBufferType)
  {
    return allocCharBuffer(paramCharBufferType, 0);
  }

  public final char[] allocCharBuffer(BufferRecycler.CharBufferType paramCharBufferType, int paramInt)
  {
    if (paramCharBufferType.size > paramInt)
      paramInt = paramCharBufferType.size;
    int i = paramCharBufferType.ordinal();
    char[] arrayOfChar = this._charBuffers[i];
    if ((arrayOfChar == null) || (arrayOfChar.length < paramInt))
      return calloc(paramInt);
    this._charBuffers[i] = null;
    return arrayOfChar;
  }

  public final void releaseByteBuffer(BufferRecycler.ByteBufferType paramByteBufferType, byte[] paramArrayOfByte)
  {
    this._byteBuffers[paramByteBufferType.ordinal()] = paramArrayOfByte;
  }

  public final void releaseCharBuffer(BufferRecycler.CharBufferType paramCharBufferType, char[] paramArrayOfChar)
  {
    this._charBuffers[paramCharBufferType.ordinal()] = paramArrayOfChar;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.core.util.BufferRecycler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
