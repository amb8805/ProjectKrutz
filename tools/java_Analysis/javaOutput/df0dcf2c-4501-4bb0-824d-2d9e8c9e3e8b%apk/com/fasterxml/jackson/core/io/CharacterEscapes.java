package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.SerializableString;
import java.io.Serializable;

public abstract class CharacterEscapes
  implements Serializable
{
  private static final long serialVersionUID = 1L;

  public abstract int[] getEscapeCodesForAscii();

  public abstract SerializableString getEscapeSequence(int paramInt);
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.core.io.CharacterEscapes
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
