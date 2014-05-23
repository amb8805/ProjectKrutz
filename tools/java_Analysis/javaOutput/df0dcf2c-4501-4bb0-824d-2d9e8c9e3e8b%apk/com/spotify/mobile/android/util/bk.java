package com.spotify.mobile.android.util;

public final class bk
{
  private int a = 1;
  private final Object b = new Object();

  public bk()
  {
  }

  public final int a()
  {
    synchronized (this.b)
    {
      int i = this.a;
      return i;
    }
  }

  public final void a(int paramInt)
  {
    synchronized (this.b)
    {
      this.a = paramInt;
      this.b.notifyAll();
      return;
    }
  }

  public final String toString()
  {
    switch (this.a)
    {
    default:
      return "INVALID";
    case 0:
      return "STOPPING";
    case 1:
      return "STOPPED";
    case 2:
      return "STARTING";
    case 3:
    }
    return "STARTED";
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.bk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
