package android.support.v4.content;

import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class ModernAsyncTask<Params, Progress, Result>
{
  private static final ThreadFactory a = new ModernAsyncTask.1();
  private static final BlockingQueue<Runnable> b = new LinkedBlockingQueue(10);
  private static final r c = new r((byte)0);
  public static final Executor d = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, b, a);
  private static volatile Executor e = d;
  private final s<Params, Result> f = new ModernAsyncTask.2(this);
  private final FutureTask<Result> g = new ModernAsyncTask.3(this, this.f);
  private volatile ModernAsyncTask.Status h = ModernAsyncTask.Status.a;
  private final AtomicBoolean i = new AtomicBoolean();

  public ModernAsyncTask()
  {
  }

  private Result b(Result paramResult)
  {
    c.obtainMessage(1, new q(this, new Object[] { paramResult })).sendToTarget();
    return paramResult;
  }

  protected static void c()
  {
  }

  public final ModernAsyncTask<Params, Progress, Result> a(Executor paramExecutor)
  {
    if (this.h != ModernAsyncTask.Status.a);
    switch (ModernAsyncTask.4.a[this.h.ordinal()])
    {
    default:
      this.h = ModernAsyncTask.Status.b;
      this.f.b = null;
      paramExecutor.execute(this.g);
      return this;
    case 1:
      throw new IllegalStateException("Cannot execute task: the task is already running.");
    case 2:
    }
    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
  }

  protected void a()
  {
  }

  protected void a(Result paramResult)
  {
  }

  protected abstract Result b();

  public final boolean d()
  {
    return this.g.cancel(false);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.content.ModernAsyncTask
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
