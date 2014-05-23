package com.facebook;

import android.os.Bundle;
import java.util.Date;

public abstract class ac
{
  public ac()
  {
  }

  static Date a(Bundle paramBundle, String paramString)
  {
    if (paramBundle == null);
    long l;
    do
    {
      return null;
      l = paramBundle.getLong(paramString, -9223372036854775808L);
    }
    while (l == -9223372036854775808L);
    return new Date(l);
  }

  static void a(Bundle paramBundle, String paramString, Date paramDate)
  {
    paramBundle.putLong(paramString, paramDate.getTime());
  }

  public abstract Bundle a();

  public abstract void a(Bundle paramBundle);

  public abstract void b();
}

/* Location:
 * Qualified Name:     com.facebook.ac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
