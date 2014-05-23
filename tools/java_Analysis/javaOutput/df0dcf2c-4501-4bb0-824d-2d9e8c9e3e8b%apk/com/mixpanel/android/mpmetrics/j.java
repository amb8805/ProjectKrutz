package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

final class j
{
  private final int a;
  private final int b;
  private final int c;
  private final boolean d;
  private final String e;
  private final String f;
  private final String g;
  private final String h;
  private final String i;
  private final String j;
  private final boolean k;

  private j(Bundle paramBundle)
  {
    this.a = paramBundle.getInt("com.mixpanel.android.MPConfig.BulkUploadLimit", 40);
    this.b = paramBundle.getInt("com.mixpanel.android.MPConfig.FlushInterval", 60000);
    this.c = paramBundle.getInt("com.mixpanel.android.MPConfig.DataExpiration", 172800000);
    this.d = paramBundle.getBoolean("com.mixpanel.android.MPConfig.DisableFallback", true);
    this.k = paramBundle.getBoolean("com.mixpanel.android.MPConfig.AutoCheckForSurveys", true);
    String str1 = paramBundle.getString("com.mixpanel.android.MPConfig.EventsEndpoint");
    if (str1 == null)
      str1 = "https://api.mixpanel.com/track?ip=1";
    this.e = str1;
    String str2 = paramBundle.getString("com.mixpanel.android.MPConfig.EventsFallbackEndpoint");
    if (str2 == null)
      str2 = "http://api.mixpanel.com/track?ip=1";
    this.f = str2;
    String str3 = paramBundle.getString("com.mixpanel.android.MPConfig.PeopleEndpoint");
    if (str3 == null)
      str3 = "https://api.mixpanel.com/engage";
    this.g = str3;
    String str4 = paramBundle.getString("com.mixpanel.android.MPConfig.PeopleFallbackEndpoint");
    if (str4 == null)
      str4 = "http://api.mixpanel.com/engage";
    this.h = str4;
    String str5 = paramBundle.getString("com.mixpanel.android.MPConfig.DecideEndpoint");
    if (str5 == null)
      str5 = "https://decide.mixpanel.com/decide";
    this.i = str5;
    String str6 = paramBundle.getString("com.mixpanel.android.MPConfig.DecideFallbackEndpoint");
    if (str6 == null)
      str6 = "http://decide.mixpanel.com/decide";
    this.j = str6;
  }

  public static j a(Context paramContext)
  {
    str = paramContext.getPackageName();
    try
    {
      Bundle localBundle = paramContext.getPackageManager().getApplicationInfo(str, 128).metaData;
      if (localBundle == null)
        localBundle = new Bundle();
      j localj = new j(localBundle);
      return localj;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new RuntimeException("Can't configure Mixpanel with package name " + str, localNameNotFoundException);
    }
  }

  public final int a()
  {
    return this.a;
  }

  public final int b()
  {
    return this.b;
  }

  public final int c()
  {
    return this.c;
  }

  public final boolean d()
  {
    return this.d;
  }

  public final String e()
  {
    return this.e;
  }

  public final String f()
  {
    return this.g;
  }

  public final String g()
  {
    return this.i;
  }

  public final String h()
  {
    return this.f;
  }

  public final String i()
  {
    return this.h;
  }

  public final String j()
  {
    return this.j;
  }

  public final boolean k()
  {
    return this.k;
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
