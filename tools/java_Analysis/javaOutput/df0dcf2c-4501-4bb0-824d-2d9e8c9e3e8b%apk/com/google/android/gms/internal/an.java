package com.google.android.gms.internal;

public final class an
{
  public static byte a(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      if (paramBoolean.booleanValue())
        return 1;
      return 0;
    }
    return -1;
  }

  public static Boolean a(byte paramByte)
  {
    switch (paramByte)
    {
    default:
      return null;
    case 1:
      return Boolean.TRUE;
    case 0:
    }
    return Boolean.FALSE;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.an
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
