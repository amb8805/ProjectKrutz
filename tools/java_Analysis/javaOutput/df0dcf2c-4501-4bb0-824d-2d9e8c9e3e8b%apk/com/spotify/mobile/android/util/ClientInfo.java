package com.spotify.mobile.android.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.mobile.android.c.a;

public class ClientInfo
  implements a
{
  Context a;
  private PackageInfo b;
  private ApplicationInfo c;
  private String d;

  public ClientInfo(Context paramContext)
  {
    this.a = paramContext;
    str = this.a.getPackageName();
    try
    {
      this.b = this.a.getPackageManager().getPackageInfo(str, 0);
      this.c = ((ApplicationInfo)cc.a(this.a.getPackageManager().getApplicationInfo(str, 128)));
      this.d = this.a.getPackageManager().getInstallerPackageName(str);
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new ClientInfo.UnableToGetVersionException("Could not load package or application info for package " + str, localNameNotFoundException);
    }
  }

  public static final String a()
  {
    return "0792a89c667e66474ab80186eaffd584";
  }

  public final String b()
  {
    return this.b.versionName;
  }

  public final String c()
  {
    return ((Bundle)cc.a(this.c.metaData)).getString("com.spotify.mobile.android.core.version");
  }

  public final boolean d()
  {
    return ("com.android.vending".equals(this.d)) || ("com.google.android.feedback".equals(this.d));
  }

  public final Uri e()
  {
    Uri localUri;
    if ("com.android.vending".equals(this.d))
      localUri = Uri.parse("market://details?id=" + this.b.packageName);
    boolean bool;
    do
    {
      return localUri;
      bool = "com.amazon.venezia".equals(this.d);
      localUri = null;
    }
    while (!bool);
    return Uri.parse("http://www.amazon.com/gp/mas/dl/android?p=" + this.b.packageName);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ClientInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
