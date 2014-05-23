package com.b.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStream;;

public final class b
{
  private final d b;
  private final boolean[] c;
  private boolean d;
  private boolean e;

  private b(a parama, d paramd)
  {
    this.b = paramd;
    if (d.e(paramd));
    for (boolean[] arrayOfBoolean = null; ; arrayOfBoolean = new boolean[a.f(parama)])
    {
      this.c = arrayOfBoolean;
      return;
    }
  }

  public final OutputStream a()
  {
    synchronized (this.a)
    {
      if (d.b(this.b) != this)
        throw new IllegalStateException();
    }
    if (!d.e(this.b))
      this.c[0] = true;
    localFile = this.b.b(0);
    try
    {
      FileOutputStream localFileOutputStream1 = new FileOutputStream(localFile);
      localObject2 = localFileOutputStream1;
      c localc = new c(this, (OutputStream)localObject2, (byte)0);
      return localc;
    }
    catch (FileNotFoundException localFileNotFoundException1)
    {
      while (true)
      {
        a.g(this.a).mkdirs();
        try
        {
          FileOutputStream localFileOutputStream2 = new FileOutputStream(localFile);
          localObject2 = localFileOutputStream2;
        }
        catch (FileNotFoundException localFileNotFoundException2)
        {
          OutputStream localOutputStream = a.b();
          return localOutputStream;
        }
      }
    }
  }

  public final void b()
  {
    if (this.d)
    {
      a.a(this.a, this, false);
      this.a.c(d.d(this.b));
    }
    while (true)
    {
      this.e = true;
      return;
      a.a(this.a, this, true);
    }
  }

  public final void c()
  {
    a.a(this.a, this, false);
  }
}

/* Location:
 * Qualified Name:     com.b.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
