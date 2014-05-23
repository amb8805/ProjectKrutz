package com.spotify.mobile.android.util;

public final class bp
{
  private static final ThreadLocal<Exception> a = new bp.1();

  private static String a()
  {
    StackTraceElement[] arrayOfStackTraceElement = ((Exception)a.get()).fillInStackTrace().getStackTrace();
    String str = arrayOfStackTraceElement[3].getClassName();
    if (!str.startsWith("com.spotify.mobile.android."))
      throw new AssertionError("This log call didn't come from our namespace: " + str);
    int i = arrayOfStackTraceElement[3].getLineNumber();
    return Thread.currentThread().getName() + '@' + str.substring(27) + ':' + i;
  }

  private static void a(LogLevel paramLogLevel, String paramString, Throwable paramThrowable)
  {
    if (paramLogLevel.a())
      paramLogLevel.a(a(), paramString, paramThrowable);
  }

  private static void a(LogLevel paramLogLevel, String paramString, Object[] paramArrayOfObject)
  {
    if (paramLogLevel.a())
      paramLogLevel.a(a(), f(paramString, paramArrayOfObject));
  }

  private static void a(LogLevel paramLogLevel, Throwable paramThrowable, String paramString, Object[] paramArrayOfObject)
  {
    if (paramLogLevel.a())
      paramLogLevel.a(a(), f(paramString, paramArrayOfObject), paramThrowable);
  }

  public static void a(String paramString, Object[] paramArrayOfObject)
  {
    a(LogLevel.b, paramString, paramArrayOfObject);
  }

  public static void a(Throwable paramThrowable, String paramString)
  {
    a(LogLevel.d, paramString, paramThrowable);
  }

  public static void a(Throwable paramThrowable, String paramString, Object[] paramArrayOfObject)
  {
    a(LogLevel.d, paramThrowable, paramString, paramArrayOfObject);
  }

  public static void b(String paramString, Object[] paramArrayOfObject)
  {
    a(LogLevel.a, paramString, paramArrayOfObject);
  }

  public static void b(Throwable paramThrowable, String paramString)
  {
    a(LogLevel.e, paramString, paramThrowable);
  }

  public static void b(Throwable paramThrowable, String paramString, Object[] paramArrayOfObject)
  {
    a(LogLevel.e, paramThrowable, paramString, paramArrayOfObject);
  }

  public static void c(String paramString, Object[] paramArrayOfObject)
  {
    a(LogLevel.c, paramString, paramArrayOfObject);
  }

  public static void d(String paramString, Object[] paramArrayOfObject)
  {
    a(LogLevel.d, paramString, paramArrayOfObject);
  }

  public static void e(String paramString, Object[] paramArrayOfObject)
  {
    a(LogLevel.e, paramString, paramArrayOfObject);
  }

  private static String f(String paramString, Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null)
      return paramString;
    return String.format(paramString, paramArrayOfObject);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.bp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
