package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.c.c;
import android.support.v4.content.k;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class p extends n
{
  static boolean a = false;
  final android.support.v4.c.n<q> b = new android.support.v4.c.n();
  final android.support.v4.c.n<q> c = new android.support.v4.c.n();
  final String d;
  FragmentActivity e;
  boolean f;
  boolean g;
  boolean h;

  p(String paramString, FragmentActivity paramFragmentActivity, boolean paramBoolean)
  {
    this.d = paramString;
    this.e = paramFragmentActivity;
    this.f = paramBoolean;
  }

  private q c(int paramInt, Bundle paramBundle, o<Object> paramo)
  {
    q localq = new q(this, paramInt, paramBundle, paramo);
    localq.d = paramo.a(paramInt, paramBundle);
    return localq;
  }

  private q d(int paramInt, Bundle paramBundle, o<Object> paramo)
  {
    try
    {
      this.h = true;
      q localq = c(paramInt, paramBundle, paramo);
      a(localq);
      return localq;
    }
    finally
    {
      this.h = false;
    }
  }

  public final <D> k<D> a(int paramInt, Bundle paramBundle, o<D> paramo)
  {
    if (this.h)
      throw new IllegalStateException("Called while creating a loader");
    q localq = (q)this.b.a(paramInt);
    if (a)
      Log.v("LoaderManager", "initLoader in " + this + ": args=" + paramBundle);
    if (localq == null)
    {
      localq = d(paramInt, paramBundle, paramo);
      if (a)
        Log.v("LoaderManager", "  Created new loader " + localq);
    }
    while (true)
    {
      if ((localq.e) && (this.f))
        localq.b(localq.d, localq.g);
      return localq.d;
      if (a)
        Log.v("LoaderManager", "  Re-using existing loader " + localq);
      localq.c = paramo;
    }
  }

  public final void a(int paramInt)
  {
    if (this.h)
      throw new IllegalStateException("Called while creating a loader");
    if (a)
      Log.v("LoaderManager", "destroyLoader in " + this + " of " + paramInt);
    int i = this.b.f(paramInt);
    if (i >= 0)
    {
      q localq2 = (q)this.b.e(i);
      this.b.c(i);
      localq2.c();
    }
    int j = this.c.f(paramInt);
    if (j >= 0)
    {
      q localq1 = (q)this.c.e(j);
      this.c.c(j);
      localq1.c();
    }
    if ((this.e != null) && (!a()))
      this.e.b.e();
  }

  final void a(q paramq)
  {
    this.b.a(paramq.a, paramq);
    if (this.f)
      paramq.a();
  }

  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i = 0;
    if (this.b.a() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Loaders:");
      String str2 = paramString + "    ";
      for (int j = 0; j < this.b.a(); j++)
      {
        q localq2 = (q)this.b.e(j);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.b.d(j));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localq2.toString());
        localq2.a(str2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      }
    }
    if (this.c.a() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Inactive Loaders:");
      String str1 = paramString + "    ";
      while (i < this.c.a())
      {
        q localq1 = (q)this.c.e(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.c.d(i));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localq1.toString());
        localq1.a(str1, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        i++;
      }
    }
  }

  public final boolean a()
  {
    int i = this.b.a();
    int j = 0;
    boolean bool1 = false;
    if (j < i)
    {
      q localq = (q)this.b.e(j);
      if ((localq.h) && (!localq.f));
      for (boolean bool2 = true; ; bool2 = false)
      {
        bool1 |= bool2;
        j++;
        break;
      }
    }
    return bool1;
  }

  public final <D> k<D> b(int paramInt, Bundle paramBundle, o<D> paramo)
  {
    if (this.h)
      throw new IllegalStateException("Called while creating a loader");
    q localq1 = (q)this.b.a(paramInt);
    if (a)
      Log.v("LoaderManager", "restartLoader in " + this + ": args=" + paramBundle);
    if (localq1 != null)
    {
      q localq2 = (q)this.c.a(paramInt);
      if (localq2 == null)
        break label295;
      if (!localq1.e)
        break label167;
      if (a)
        Log.v("LoaderManager", "  Removing last inactive loader: " + localq1);
      localq2.f = false;
      localq2.c();
    }
    while (true)
    {
      localq1.d.l();
      this.c.a(paramInt, localq1);
      while (true)
      {
        return d(paramInt, paramBundle, paramo).d;
        label167: if (localq1.h)
          break;
        if (a)
          Log.v("LoaderManager", "  Current loader is stopped; replacing");
        this.b.a(paramInt, null);
        localq1.c();
      }
      if (localq1.n != null)
      {
        if (a)
          Log.v("LoaderManager", "  Removing pending loader: " + localq1.n);
        localq1.n.c();
        localq1.n = null;
      }
      if (a)
        Log.v("LoaderManager", "  Enqueuing as new pending loader");
      localq1.n = c(paramInt, paramBundle, paramo);
      return localq1.n.d;
      label295: if (a)
        Log.v("LoaderManager", "  Making last loader inactive: " + localq1);
    }
  }

  final void b()
  {
    if (a)
      Log.v("LoaderManager", "Starting in " + this);
    if (this.f)
    {
      RuntimeException localRuntimeException = new RuntimeException("here");
      localRuntimeException.fillInStackTrace();
      Log.w("LoaderManager", "Called doStart when already started: " + this, localRuntimeException);
    }
    while (true)
    {
      return;
      this.f = true;
      for (int i = -1 + this.b.a(); i >= 0; i--)
        ((q)this.b.e(i)).a();
    }
  }

  final void c()
  {
    if (a)
      Log.v("LoaderManager", "Stopping in " + this);
    if (!this.f)
    {
      RuntimeException localRuntimeException = new RuntimeException("here");
      localRuntimeException.fillInStackTrace();
      Log.w("LoaderManager", "Called doStop when not started: " + this, localRuntimeException);
      return;
    }
    for (int i = -1 + this.b.a(); i >= 0; i--)
      ((q)this.b.e(i)).b();
    this.f = false;
  }

  final void d()
  {
    if (a)
      Log.v("LoaderManager", "Retaining in " + this);
    if (!this.f)
    {
      RuntimeException localRuntimeException = new RuntimeException("here");
      localRuntimeException.fillInStackTrace();
      Log.w("LoaderManager", "Called doRetain when not started: " + this, localRuntimeException);
    }
    while (true)
    {
      return;
      this.g = true;
      this.f = false;
      for (int i = -1 + this.b.a(); i >= 0; i--)
      {
        q localq = (q)this.b.e(i);
        if (a)
          Log.v("LoaderManager", "  Retaining: " + localq);
        localq.i = true;
        localq.j = localq.h;
        localq.h = false;
        localq.c = null;
      }
    }
  }

  final void e()
  {
    for (int i = -1 + this.b.a(); i >= 0; i--)
      ((q)this.b.e(i)).k = true;
  }

  final void f()
  {
    for (int i = -1 + this.b.a(); i >= 0; i--)
    {
      q localq = (q)this.b.e(i);
      if ((localq.h) && (localq.k))
      {
        localq.k = false;
        if (localq.e)
          localq.b(localq.d, localq.g);
      }
    }
  }

  final void g()
  {
    if (!this.g)
    {
      if (a)
        Log.v("LoaderManager", "Destroying Active in " + this);
      for (int j = -1 + this.b.a(); j >= 0; j--)
        ((q)this.b.e(j)).c();
      this.b.b();
    }
    if (a)
      Log.v("LoaderManager", "Destroying Inactive in " + this);
    for (int i = -1 + this.c.a(); i >= 0; i--)
      ((q)this.c.e(i)).c();
    this.c.b();
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    c.a(this.e, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
