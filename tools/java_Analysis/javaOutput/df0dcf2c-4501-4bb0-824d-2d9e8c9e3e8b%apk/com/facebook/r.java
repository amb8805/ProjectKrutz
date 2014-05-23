package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class r extends AbstractList<Request>
{
  private static AtomicInteger a = new AtomicInteger();
  private Handler b;
  private List<Request> c = new ArrayList();
  private int d = 0;
  private final String e = Integer.valueOf(a.incrementAndGet()).toString();
  private List<s> f = new ArrayList();
  private String g;

  public r()
  {
    this.c = new ArrayList();
  }

  public r(Collection<Request> paramCollection)
  {
    this.c = new ArrayList(paramCollection);
  }

  public r(Request[] paramArrayOfRequest)
  {
    this.c = Arrays.asList(paramArrayOfRequest);
  }

  public final int a()
  {
    return this.d;
  }

  public final Request a(int paramInt)
  {
    return (Request)this.c.get(paramInt);
  }

  final void a(Handler paramHandler)
  {
    this.b = paramHandler;
  }

  public final void a(s params)
  {
    if (!this.f.contains(params))
      this.f.add(params);
  }

  final void a(String paramString)
  {
    this.g = paramString;
  }

  final String b()
  {
    return this.e;
  }

  final Handler c()
  {
    return this.b;
  }

  public final void clear()
  {
    this.c.clear();
  }

  final List<Request> d()
  {
    return this.c;
  }

  final List<s> e()
  {
    return this.f;
  }

  final String f()
  {
    return this.g;
  }

  public final int size()
  {
    return this.c.size();
  }
}

/* Location:
 * Qualified Name:     com.facebook.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
