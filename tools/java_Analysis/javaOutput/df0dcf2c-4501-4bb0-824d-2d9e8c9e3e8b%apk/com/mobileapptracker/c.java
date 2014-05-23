package com.mobileapptracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.concurrent.Semaphore;

public final class c
{
  private SharedPreferences a;
  private Semaphore b;
  private h c;

  public c(Context paramContext, h paramh)
  {
    this.a = paramContext.getSharedPreferences("mat_queue", 0);
    this.b = new Semaphore(1, true);
    this.c = paramh;
  }

  protected final int a()
  {
    try
    {
      int i = this.a.getInt("queuesize", 0);
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected final void a(int paramInt)
  {
    try
    {
      SharedPreferences.Editor localEditor = this.a.edit();
      if (paramInt < 0)
        paramInt = 0;
      localEditor.putInt("queuesize", paramInt);
      localEditor.commit();
      return;
    }
    finally
    {
    }
  }

  protected final void a(String paramString)
  {
    try
    {
      a(-1 + a());
      SharedPreferences.Editor localEditor = this.a.edit();
      localEditor.remove(paramString);
      localEditor.commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:
 * Qualified Name:     com.mobileapptracker.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
