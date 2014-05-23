package android.support.v4.content;

import android.content.Context;
import android.support.v4.c.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class k<D>
{
  int m;
  m<D> n;
  Context o;
  boolean p = false;
  boolean q = false;
  boolean r = true;
  boolean s = false;
  boolean t = false;

  public k(Context paramContext)
  {
    this.o = paramContext.getApplicationContext();
  }

  protected void a()
  {
  }

  public final void a(int paramInt, m<D> paramm)
  {
    if (this.n != null)
      throw new IllegalStateException("There is already a listener registered");
    this.n = paramm;
    this.m = paramInt;
  }

  public final void a(m<D> paramm)
  {
    if (this.n == null)
      throw new IllegalStateException("No listener register");
    if (this.n != paramm)
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    this.n = null;
  }

  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    paramPrintWriter.print(this.m);
    paramPrintWriter.print(" mListener=");
    paramPrintWriter.println(this.n);
    if ((this.p) || (this.s) || (this.t))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(this.p);
      paramPrintWriter.print(" mContentChanged=");
      paramPrintWriter.print(this.s);
      paramPrintWriter.print(" mProcessingChange=");
      paramPrintWriter.println(this.t);
    }
    if ((this.q) || (this.r))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAbandoned=");
      paramPrintWriter.print(this.q);
      paramPrintWriter.print(" mReset=");
      paramPrintWriter.println(this.r);
    }
  }

  public void b(D paramD)
  {
    if (this.n != null)
      this.n.a(this, paramD);
  }

  protected void e()
  {
  }

  protected void f()
  {
  }

  protected void g()
  {
  }

  public final int h()
  {
    return this.m;
  }

  public final void i()
  {
    this.p = true;
    this.r = false;
    this.q = false;
    e();
  }

  public final void j()
  {
    a();
  }

  public final void k()
  {
    this.p = false;
    f();
  }

  public final void l()
  {
    this.q = true;
  }

  public final void m()
  {
    g();
    this.r = true;
    this.p = false;
    this.q = false;
    this.s = false;
    this.t = false;
  }

  public final void n()
  {
    if (this.p)
    {
      a();
      return;
    }
    this.s = true;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    c.a(this, localStringBuilder);
    localStringBuilder.append(" id=");
    localStringBuilder.append(this.m);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.content.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
