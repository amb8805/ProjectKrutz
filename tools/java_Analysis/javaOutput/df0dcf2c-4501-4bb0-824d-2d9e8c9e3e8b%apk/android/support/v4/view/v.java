package android.support.v4.view;

import android.view.KeyEvent;

final class v extends u
{
  v()
  {
  }

  public final int a(int paramInt)
  {
    return KeyEvent.normalizeMetaState(paramInt);
  }

  public final boolean b(int paramInt)
  {
    return KeyEvent.metaStateHasModifiers(paramInt, 1);
  }

  public final boolean c(int paramInt)
  {
    return KeyEvent.metaStateHasNoModifiers(paramInt);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
