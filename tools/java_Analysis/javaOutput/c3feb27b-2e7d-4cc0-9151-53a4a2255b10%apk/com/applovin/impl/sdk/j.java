package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.view.Display;
import android.view.WindowManager;

public class j
{
  public static Point a(Activity paramActivity)
  {
    Point localPoint = new Point();
    localPoint.x = 320;
    localPoint.y = 240;
    try
    {
      Display localDisplay = paramActivity.getWindowManager().getDefaultDisplay();
      if (Build.VERSION.SDK_INT >= 13)
      {
        localDisplay.getSize(localPoint);
        return localPoint;
      }
      localPoint.x = localDisplay.getWidth();
      localPoint.y = localDisplay.getHeight();
      return localPoint;
    }
    catch (Throwable localThrowable)
    {
    }
    return localPoint;
  }

  static void a()
  {
    try
    {
      if (Build.VERSION.SDK_INT >= 9)
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
      return;
    }
    catch (Throwable localThrowable)
    {
    }
  }

  public static boolean a(Class paramClass, Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, paramClass);
    ResolveInfo localResolveInfo = paramContext.getPackageManager().resolveActivity(localIntent, 0);
    boolean bool = false;
    if (localResolveInfo != null)
      bool = true;
    return bool;
  }

  public static boolean b()
  {
    return Build.VERSION.SDK_INT >= 15;
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
