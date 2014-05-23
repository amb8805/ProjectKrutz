package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.SerializableString;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializedString
  implements SerializableString, Serializable
{
  protected transient String _jdkSerializeValue;
  protected char[] _quotedChars;
  protected byte[] _quotedUTF8Ref;
  protected byte[] _unquotedUTF8Ref;
  protected final String _value;

  public SerializedString(String paramString)
  {
    if (paramString == null)
      throw new IllegalStateException("Null String illegal for SerializedString");
    this._value = paramString;
  }

  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    this._jdkSerializeValue = paramObjectInputStream.readUTF();
  }

  private void writeObject(ObjectOutputStream paramObjectOutputStream)
  {
    paramObjectOutputStream.writeUTF(this._value);
  }

  public int appendQuotedUTF8(byte[] paramArrayOfByte, int paramInt)
  {
    byte[] arrayOfByte = this._quotedUTF8Ref;
    if (arrayOfByte == null)
    {
      arrayOfByte = JsonStringEncoder.getInstance().quoteAsUTF8(this._value);
      this._quotedUTF8Ref = arrayOfByte;
    }
    int i = arrayOfByte.length;
    if (paramInt + i > paramArrayOfByte.length)
      return -1;
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte, paramInt, i);
    return i;
  }

  public final char[] asQuotedChars()
  {
    char[] arrayOfChar = this._quotedChars;
    if (arrayOfChar == null)
    {
      arrayOfChar = JsonStringEncoder.getInstance().quoteAsString(this._value);
      this._quotedChars = arrayOfChar;
    }
    return arrayOfChar;
  }

  public final byte[] asQuotedUTF8()
  {
    byte[] arrayOfByte = this._quotedUTF8Ref;
    if (arrayOfByte == null)
    {
      arrayOfByte = JsonStringEncoder.getInstance().quoteAsUTF8(this._value);
      this._quotedUTF8Ref = arrayOfByte;
    }
    return arrayOfByte;
  }

  public final byte[] asUnquotedUTF8()
  {
    byte[] arrayOfByte = this._unquotedUTF8Ref;
    if (arrayOfByte == null)
    {
      arrayOfByte = JsonStringEncoder.getInstance().encodeAsUTF8(this._value);
      this._unquotedUTF8Ref = arrayOfByte;
    }
    return arrayOfByte;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if ((paramObject == null) || (paramObject.getClass() != getClass()))
      return false;
    SerializedString localSerializedString = (SerializedString)paramObject;
    return this._value.equals(localSerializedString._value);
  }

  public final String getValue()
  {
    return this._value;
  }

  public final int hashCode()
  {
    return this._value.hashCode();
  }

  protected Object readResolve()
  {
    return new SerializedString(this._jdkSerializeValue);
  }

  public final String toString()
  {
    return this._value;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.core.io.SerializedString
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
