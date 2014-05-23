package android.support.v4.app;

import android.os.Build.VERSION;

public final class w
{
  private static final ac a = new ad();

  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new ag();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new af();
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new ae();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
