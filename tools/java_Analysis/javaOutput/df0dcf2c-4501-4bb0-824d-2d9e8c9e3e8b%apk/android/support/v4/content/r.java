package android.support.v4.content;

import android.os.Handler;
import android.os.Message;

final class r extends Handler
{
  private r()
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    q localq = (q)paramMessage.obj;
    switch (paramMessage.what)
    {
    default:
      return;
    case 1:
      ModernAsyncTask.c(localq.a, localq.b[0]);
      return;
    case 2:
    }
    ModernAsyncTask.c();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.content.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
