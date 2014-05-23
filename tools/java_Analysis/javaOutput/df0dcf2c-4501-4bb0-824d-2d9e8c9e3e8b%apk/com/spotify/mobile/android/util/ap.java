package com.spotify.mobile.android.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.common.base.i;
import com.spotify.mobile.android.c.a;
import com.spotify.mobile.android.service.ak;
import java.math.BigInteger;
import java.security.SecureRandom;

public class ap
  implements a
{
  private Context a;

  public ap(Context paramContext)
  {
    this.a = paramContext;
  }

  public static int a()
  {
    return Build.VERSION.SDK_INT;
  }

  public static aq j()
  {
    return new aq(Build.MODEL, Build.MODEL, Build.BRAND, Build.MANUFACTURER);
  }

  public final int b()
  {
    return this.a.getResources().getDisplayMetrics().widthPixels;
  }

  public final int c()
  {
    return this.a.getResources().getDisplayMetrics().heightPixels;
  }

  public final double d()
  {
    DisplayMetrics localDisplayMetrics = this.a.getResources().getDisplayMetrics();
    return Math.sqrt(Math.pow(localDisplayMetrics.widthPixels / localDisplayMetrics.xdpi, 2.0D) + Math.pow(localDisplayMetrics.heightPixels / localDisplayMetrics.ydpi, 2.0D));
  }

  public final String e()
  {
    String str = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
    if (str == null)
      str = "0";
    return str;
  }

  public final boolean f()
  {
    try
    {
      boolean bool1 = TextUtils.isEmpty(new ak(this.a).a(ak.a, ""));
      if (!bool1)
      {
        bool2 = true;
        return bool2;
      }
      boolean bool2 = false;
    }
    finally
    {
    }
  }

  public final String g()
  {
    try
    {
      i.b(f(), "Installation ID not generated, please do so first");
      String str = new ak(this.a).a(ak.a, "");
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  @SuppressLint({"TrulyRandom"})
  public final void h()
  {
    try
    {
      if (!f());
      for (boolean bool = true; ; bool = false)
      {
        i.b(bool, "Installation ID already generated");
        String str = new BigInteger(130, new SecureRandom()).toString(32);
        new ak(this.a).b(ak.a, str);
        return;
      }
    }
    finally
    {
    }
  }

  public final String i()
  {
    return ((TelephonyManager)this.a.getSystemService("phone")).getDeviceId();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
