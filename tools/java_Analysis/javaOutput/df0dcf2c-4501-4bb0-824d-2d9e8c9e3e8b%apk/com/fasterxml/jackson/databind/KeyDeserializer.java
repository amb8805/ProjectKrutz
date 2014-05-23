package com.fasterxml.jackson.databind;

public abstract class KeyDeserializer
{
  public KeyDeserializer()
  {
  }

  public abstract Object deserializeKey(String paramString, DeserializationContext paramDeserializationContext);
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.KeyDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
