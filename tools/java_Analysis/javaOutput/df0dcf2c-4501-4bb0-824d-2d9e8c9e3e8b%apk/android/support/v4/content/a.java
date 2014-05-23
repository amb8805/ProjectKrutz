package android.support.v4.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.c.o;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a<D> extends k<D>
{
  volatile a<D>.b a;
  volatile a<D>.b b;
  long c;
  long d = -10000L;
  Handler e;

  public a(Context paramContext)
  {
    super(paramContext);
  }

  protected final void a()
  {
    super.a();
    b();
    this.a = new b(this);
    c();
  }

  final void a(a<D>.b parama, D paramD)
  {
    a(paramD);
    if (this.b == parama)
    {
      if (this.t)
        this.s = true;
      this.d = SystemClock.uptimeMillis();
      this.b = null;
      c();
    }
  }

  public void a(D paramD)
  {
  }

  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    if (this.a != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTask=");
      paramPrintWriter.print(this.a);
      paramPrintWriter.print(" waiting=");
      paramPrintWriter.println(this.a.b);
    }
    if (this.b != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCancellingTask=");
      paramPrintWriter.print(this.b);
      paramPrintWriter.print(" waiting=");
      paramPrintWriter.println(this.b.b);
    }
    if (this.c != 0L)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mUpdateThrottle=");
      o.a(this.c, paramPrintWriter);
      paramPrintWriter.print(" mLastLoadCompleteTime=");
      o.a(this.d, SystemClock.uptimeMillis(), paramPrintWriter);
      paramPrintWriter.println();
    }
  }

  public final boolean b()
  {
    if (this.a != null)
    {
      if (this.b != null)
      {
        if (this.a.b)
        {
          this.a.b = false;
          this.e.removeCallbacks(this.a);
        }
        this.a = null;
      }
    }
    else
      return false;
    if (this.a.b)
    {
      this.a.b = false;
      this.e.removeCallbacks(this.a);
      this.a = null;
      return false;
    }
    boolean bool = this.a.d();
    if (bool)
      this.b = this.a;
    this.a = null;
    return bool;
  }

  final void c()
  {
    if ((this.b == null) && (this.a != null))
    {
      if (this.a.b)
      {
        this.a.b = false;
        this.e.removeCallbacks(this.a);
      }
      if ((this.c > 0L) && (SystemClock.uptimeMillis() < this.d + this.c))
      {
        this.a.b = true;
        this.e.postAtTime(this.a, this.d + this.c);
      }
    }
    else
    {
      return;
    }
    this.a.a(ModernAsyncTask.d);
  }

  public abstract D d();
}

/* Location:
 * Qualified Name:     android.support.v4.content.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
