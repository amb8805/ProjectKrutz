package com.twitter.android;

import android.text.Editable;
import android.text.Editable.Factory;

public final class n extends Editable.Factory
{
  public n()
  {
  }

  public static Editable.Factory getInstance()
  {
    return as.a;
  }

  public final Editable newEditable(CharSequence paramCharSequence)
  {
    return new as(paramCharSequence);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
