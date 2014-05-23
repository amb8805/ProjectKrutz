package android.support.v4.content;

import android.database.ContentObserver;
import android.os.Handler;

public final class l extends ContentObserver
{
  public l(k paramk)
  {
    super(new Handler());
  }

  public final boolean deliverSelfNotifications()
  {
    return true;
  }

  public final void onChange(boolean paramBoolean)
  {
    this.a.n();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.content.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
