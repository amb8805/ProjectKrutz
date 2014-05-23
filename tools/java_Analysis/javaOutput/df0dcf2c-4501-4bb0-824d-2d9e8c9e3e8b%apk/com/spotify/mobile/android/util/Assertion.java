package com.spotify.mobile.android.util;

import com.spotify.mobile.android.c.c;

public class Assertion
{
  public static final j a = new Assertion.1();
  public static final j b = new Assertion.2();

  static
  {
    c.a(Assertion.class, cu.class, new cu());
    c.a(Assertion.class, j.class, a);
  }

  public Assertion()
  {
  }

  private static void a(Assertion.SoftAssertionError paramSoftAssertionError)
  {
    ((j)c.a(Assertion.class, j.class)).a(paramSoftAssertionError);
  }

  private static void a(AssertionError paramAssertionError)
  {
    ((j)c.a(Assertion.class, j.class)).a(paramAssertionError);
  }

  public static void a(CharSequence paramCharSequence, String paramString)
  {
    if (paramCharSequence == null)
      a("chars is null");
    while (paramCharSequence.length() > 0)
      return;
    a(paramString);
  }

  public static void a(Exception paramException)
  {
    bp.b(paramException, "[no message]");
    a(new AssertionError(paramException));
  }

  public static void a(Object paramObject)
  {
    a(paramObject, "Object failed null check");
  }

  public static void a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null)
      if (paramObject2 != null)
        a("The two objects(null, " + paramObject2 + ") are not equal.");
    while (paramObject1.equals(paramObject2))
      return;
    a("The two objects(" + paramObject1 + ", " + paramObject2 + ") are not equal.");
  }

  public static void a(Object paramObject, String paramString)
  {
    if (paramObject == null)
      a(paramString);
  }

  public static void a(String paramString)
  {
    bp.e("%s", new Object[] { paramString });
    a(new AssertionError(paramString));
  }

  public static void a(String paramString, Exception paramException)
  {
    bp.b(paramException, "%s", new Object[] { paramString });
    a(new AssertionError(new RuntimeException(paramString, paramException)));
  }

  public static void a(String paramString, Throwable paramThrowable)
  {
    a(new Assertion.SoftAssertionError(paramString, paramThrowable));
  }

  public static void a(boolean paramBoolean, String paramString)
  {
    if (!paramBoolean)
      a(paramString);
  }

  public static void b(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if (paramObject1 != null)
      bool = paramObject1.equals(paramObject2);
    while (true)
    {
      if (bool)
        a("The two objects(" + paramObject1 + ", " + paramObject2 + ") are equal.");
      return;
      if (paramObject2 == null)
        bool = true;
      else
        bool = false;
    }
  }

  public static void b(String paramString)
  {
    a(new Assertion.SoftAssertionError(paramString));
  }

  public static void b(boolean paramBoolean, String paramString)
  {
    if (paramBoolean)
      a(paramString);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.Assertion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
