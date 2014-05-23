package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.c.c;
import android.support.v4.c.n;
import android.support.v4.content.k;
import android.support.v4.content.m;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class q
  implements m<Object>
{
  final int a;
  final Bundle b;
  o<Object> c;
  k<Object> d;
  boolean e;
  boolean f;
  Object g;
  boolean h;
  boolean i;
  boolean j;
  boolean k;
  boolean l;
  boolean m;
  q n;

  public q(int paramInt, Bundle paramBundle, o<Object> paramo)
  {
    this.a = paramBundle;
    this.b = paramo;
    Object localObject;
    this.c = localObject;
  }

  final void a()
  {
    if ((this.i) && (this.j))
      this.h = true;
    do
    {
      do
        return;
      while (this.h);
      this.h = true;
      if (p.a)
        Log.v("LoaderManager", "  Starting: " + this);
      if ((this.d == null) && (this.c != null))
        this.d = this.c.a(this.a, this.b);
    }
    while (this.d == null);
    if ((this.d.getClass().isMemberClass()) && (!Modifier.isStatic(this.d.getClass().getModifiers())))
      throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.d);
    if (!this.m)
    {
      this.d.a(this.a, this);
      this.m = true;
    }
    this.d.i();
  }

  public final void a(k<Object> paramk, Object paramObject)
  {
    if (p.a)
      Log.v("LoaderManager", "onLoadComplete: " + this);
    if (this.l)
      if (p.a)
        Log.v("LoaderManager", "  Ignoring load complete -- destroyed");
    do
    {
      do
      {
        return;
        if (this.o.b.a(this.a) == this)
          break;
      }
      while (!p.a);
      Log.v("LoaderManager", "  Ignoring load complete -- not active");
      return;
      q localq1 = this.n;
      if (localq1 != null)
      {
        if (p.a)
          Log.v("LoaderManager", "  Switching to pending loader: " + localq1);
        this.n = null;
        this.o.b.a(this.a, null);
        c();
        this.o.a(localq1);
        return;
      }
      if ((this.g != paramObject) || (!this.e))
      {
        this.g = paramObject;
        this.e = true;
        if (this.h)
          b(paramk, paramObject);
      }
      q localq2 = (q)this.o.c.a(this.a);
      if ((localq2 != null) && (localq2 != this))
      {
        localq2.f = false;
        localq2.c();
        this.o.c.b(this.a);
      }
    }
    while ((this.o.e == null) || (this.o.a()));
    this.o.e.b.e();
  }

  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    while (true)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mId=");
      paramPrintWriter.print(this.a);
      paramPrintWriter.print(" mArgs=");
      paramPrintWriter.println(this.b);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCallbacks=");
      paramPrintWriter.println(this.c);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mLoader=");
      paramPrintWriter.println(this.d);
      if (this.d != null)
        this.d.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      if ((this.e) || (this.f))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mHaveData=");
        paramPrintWriter.print(this.e);
        paramPrintWriter.print("  mDeliveredData=");
        paramPrintWriter.println(this.f);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mData=");
        paramPrintWriter.println(this.g);
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(this.h);
      paramPrintWriter.print(" mReportNextStart=");
      paramPrintWriter.print(this.k);
      paramPrintWriter.print(" mDestroyed=");
      paramPrintWriter.println(this.l);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mRetaining=");
      paramPrintWriter.print(this.i);
      paramPrintWriter.print(" mRetainingStarted=");
      paramPrintWriter.print(this.j);
      paramPrintWriter.print(" mListenerRegistered=");
      paramPrintWriter.println(this.m);
      if (this.n == null)
        break;
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Pending Loader ");
      paramPrintWriter.print(this.n);
      paramPrintWriter.println(":");
      this = this.n;
      paramString = paramString + "  ";
    }
  }

  final void b()
  {
    if (p.a)
      Log.v("LoaderManager", "  Stopping: " + this);
    this.h = false;
    if ((!this.i) && (this.d != null) && (this.m))
    {
      this.m = false;
      this.d.a(this);
      this.d.k();
    }
  }

  final void b(k<Object> paramk, Object paramObject)
  {
    String str2;
    if (this.c != null)
    {
      if (this.o.e == null)
        break label191;
      str2 = this.o.e.b.u;
      this.o.e.b.u = "onLoadFinished";
    }
    label191: for (String str1 = str2; ; str1 = null)
      try
      {
        if (p.a)
        {
          StringBuilder localStringBuilder1 = new StringBuilder("  onLoadFinished in ").append(paramk).append(": ");
          StringBuilder localStringBuilder2 = new StringBuilder(64);
          c.a(paramObject, localStringBuilder2);
          localStringBuilder2.append("}");
          Log.v("LoaderManager", localStringBuilder2.toString());
        }
        this.c.a(paramk, paramObject);
        if (this.o.e != null)
          this.o.e.b.u = str1;
        this.f = true;
        return;
      }
      finally
      {
        if (this.o.e != null)
          this.o.e.b.u = str1;
      }
  }

  final void c()
  {
    if (p.a)
      Log.v("LoaderManager", "  Destroying: " + this);
    this.l = true;
    boolean bool = this.f;
    this.f = false;
    String str1;
    if ((this.c != null) && (this.d != null) && (this.e) && (bool))
    {
      if (p.a)
        Log.v("LoaderManager", "  Reseting: " + this);
      if (this.o.e == null)
        break label271;
      String str2 = this.o.e.b.u;
      this.o.e.b.u = "onLoaderReset";
      str1 = str2;
    }
    label271: 
    while (true)
      try
      {
        this.c.a(this.d);
        if (this.o.e != null)
          this.o.e.b.u = str1;
        this.c = null;
        this.g = null;
        this.e = false;
        if (this.d != null)
        {
          if (this.m)
          {
            this.m = false;
            this.d.a(this);
          }
          this.d.m();
        }
        if (this.n != null)
          this = this.n;
      }
      finally
      {
        if (this.o.e != null)
          this.o.e.b.u = str1;
      }
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append("LoaderInfo{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" #");
    localStringBuilder.append(this.a);
    localStringBuilder.append(" : ");
    c.a(this.d, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
