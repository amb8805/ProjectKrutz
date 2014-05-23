package com.spotify.mobile.android.util;

import android.os.Looper;

public final class cc
{
  public static CharSequence a(CharSequence paramCharSequence, String paramString)
  {
    if (((CharSequence)a(paramCharSequence, "Object failed null precondition")).length() <= 0)
      c(paramString);
    return paramCharSequence;
  }

  public static <E> E a(E paramE)
  {
    return a(paramE, "Object failed null precondition");
  }

  public static <E> E a(E paramE, String paramString)
  {
    if (paramE == null)
      c(paramString);
    return paramE;
  }

  public static void a()
  {
    a("Called from main loop");
  }

  public static void a(String paramString)
  {
    if (Looper.getMainLooper() != Looper.myLooper())
      return;
    c(paramString);
  }

  public static void a(boolean paramBoolean, String paramString)
  {
    if (!paramBoolean)
      throw new IllegalArgumentException(paramString);
  }

  public static void b()
  {
    b("Not called from main loop");
  }

  public static void b(String paramString)
  {
    if (Looper.getMainLooper() == Looper.myLooper())
      return;
    c(paramString);
  }

  private static void c(String paramString)
  {
    throw new PreconditionException("Precondition failed: " + paramString);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.cc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
