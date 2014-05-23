package android.support.v4.content;

import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

final class b extends ModernAsyncTask<Void, Void, D>
  implements Runnable
{
  D a;
  boolean b;
  private CountDownLatch e = new CountDownLatch(1);

  b(a parama)
  {
  }

  protected final void a()
  {
    try
    {
      this.c.a(this, this.a);
      return;
    }
    finally
    {
      this.e.countDown();
    }
  }

  protected final void a(D paramD)
  {
    while (true)
    {
      a locala;
      try
      {
        locala = this.c;
        if (locala.a != this)
        {
          locala.a(this, paramD);
          return;
        }
        if (locala.q)
        {
          locala.a(paramD);
          continue;
        }
      }
      finally
      {
        this.e.countDown();
      }
      locala.t = false;
      locala.d = SystemClock.uptimeMillis();
      locala.a = null;
      locala.b(paramD);
    }
  }

  public final void run()
  {
    this.b = false;
    this.c.c();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.content.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
