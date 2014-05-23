package net.hockeyapp.android;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import net.hockeyapp.android.c.a;

public final class h
{
  private static a a = null;
  private static i b = null;

  @SuppressLint({"NewApi"})
  public static Boolean a()
  {
    try
    {
      if (Build.VERSION.SDK_INT >= 11);
      for (boolean bool = true; ; bool = false)
      {
        Boolean localBoolean = Boolean.valueOf(bool);
        return localBoolean;
      }
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
    }
    return Boolean.valueOf(false);
  }

  public static Boolean a(WeakReference<Activity> paramWeakReference)
  {
    Activity localActivity = (Activity)paramWeakReference.get();
    if (localActivity != null)
    {
      Configuration localConfiguration = localActivity.getResources().getConfiguration();
      if (((0xF & localConfiguration.screenLayout) == 3) || ((0xF & localConfiguration.screenLayout) == 4));
      for (boolean bool = true; ; bool = false)
        return Boolean.valueOf(bool);
    }
    return Boolean.valueOf(false);
  }

  public static i b()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     net.hockeyapp.android.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
