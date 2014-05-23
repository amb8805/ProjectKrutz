package com.fasterxml.jackson.core;

public abstract interface SerializableString
{
  public abstract int appendQuotedUTF8(byte[] paramArrayOfByte, int paramInt);

  public abstract char[] asQuotedChars();

  public abstract byte[] asQuotedUTF8();

  public abstract byte[] asUnquotedUTF8();

  public abstract String getValue();
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.core.SerializableString
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
