package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public final class bh
{
  static final bk a = new bm();

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 18)
    {
      a = new bl();
      return;
    }
    if (i >= 14)
    {
      a = new bj();
      return;
    }
    if (i >= 11)
    {
      a = new bi();
      return;
    }
  }

  public static void a(ViewGroup paramViewGroup)
  {
    a.a(paramViewGroup);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.bh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
