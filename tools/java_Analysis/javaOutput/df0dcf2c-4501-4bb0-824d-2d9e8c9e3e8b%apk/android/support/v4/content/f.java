package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;

public final class f
{
  private static final g a = new h();

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 15)
    {
      a = new j();
      return;
    }
    if (i >= 11)
    {
      a = new i();
      return;
    }
  }

  public static Intent a(ComponentName paramComponentName)
  {
    return a.a(paramComponentName);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.content.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
