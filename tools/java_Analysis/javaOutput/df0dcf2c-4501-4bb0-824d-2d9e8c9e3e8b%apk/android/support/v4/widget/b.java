package android.support.v4.widget;

import android.database.ContentObserver;

final class b extends ContentObserver
{
  public final boolean deliverSelfNotifications()
  {
    return true;
  }

  public final void onChange(boolean paramBoolean)
  {
    this.a.b();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
