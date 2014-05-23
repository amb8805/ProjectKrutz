package com.google.android.gms.a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class a
{
  static a a;
  final BlockingQueue<Intent> b = new LinkedBlockingQueue();
  private Context c;
  private PendingIntent d;
  private Handler e = new a.1(this, Looper.getMainLooper());
  private Messenger f = new Messenger(this.e);

  public a()
  {
  }

  public static a a(Context paramContext)
  {
    try
    {
      if (a == null)
      {
        a locala1 = new a();
        a = locala1;
        locala1.c = paramContext;
      }
      a locala2 = a;
      return locala2;
    }
    finally
    {
    }
  }

  private void a(Intent paramIntent)
  {
    try
    {
      if (this.d == null)
        this.d = PendingIntent.getBroadcast(this.c, 0, new Intent(), 0);
      paramIntent.putExtra("app", this.d);
      return;
    }
    finally
    {
    }
  }

  private void b()
  {
    try
    {
      if (this.d != null)
      {
        this.d.cancel();
        this.d = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void b(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      throw new IllegalArgumentException("No senderIds");
    StringBuilder localStringBuilder = new StringBuilder(paramArrayOfString[0]);
    for (int i = 1; i < paramArrayOfString.length; i++)
      localStringBuilder.append((char)',').append(paramArrayOfString[i]);
    String str = localStringBuilder.toString();
    Intent localIntent = new Intent("com.google.android.c2dm.intent.REGISTER");
    localIntent.setPackage("com.google.android.gms");
    localIntent.putExtra("google.messenger", this.f);
    a(localIntent);
    localIntent.putExtra("sender", str);
    this.c.startService(localIntent);
  }

  public final String a(String[] paramArrayOfString)
  {
    if (Looper.getMainLooper() == Looper.myLooper())
      throw new IOException("MAIN_THREAD");
    this.b.clear();
    b(paramArrayOfString);
    Intent localIntent;
    try
    {
      localIntent = (Intent)this.b.poll(5000L, TimeUnit.MILLISECONDS);
      if (localIntent == null)
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new IOException(localInterruptedException.getMessage());
    }
    String str1 = localIntent.getStringExtra("registration_id");
    if (str1 != null)
      return str1;
    localIntent.getStringExtra("error");
    String str2 = localIntent.getStringExtra("error");
    if (str2 != null)
      throw new IOException(str2);
    throw new IOException("SERVICE_NOT_AVAILABLE");
  }

  public final void a()
  {
    b();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
