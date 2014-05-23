package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public final class bd
{
  static final bg a = new be();

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new bf();
      return;
    }
  }

  public static int a(ViewConfiguration paramViewConfiguration)
  {
    return a.a(paramViewConfiguration);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.bd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
