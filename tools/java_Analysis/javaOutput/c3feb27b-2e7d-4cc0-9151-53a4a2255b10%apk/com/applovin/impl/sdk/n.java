package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import com.applovin.sdk.AppLovinLogger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

class n
{
  protected static List a = new ArrayList();
  protected final AppLovinSdkImpl b;
  protected final Context c;
  protected final AppLovinLogger d;

  n(AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    if (paramAppLovinSdkImpl == null)
      throw new IllegalArgumentException("No sdk specified");
    this.b = paramAppLovinSdkImpl;
    this.d = paramAppLovinSdkImpl.getLogger();
    this.c = paramAppLovinSdkImpl.getApplicationContext();
  }

  static String a()
  {
    return "vx";
  }

  static boolean a(String paramString, Context paramContext)
  {
    if (paramString == null)
      throw new IllegalArgumentException("No permission name specified");
    if (paramContext == null)
      throw new IllegalArgumentException("No context specified");
    return paramContext.getPackageManager().checkPermission(paramString, paramContext.getPackageName()) == 0;
  }

  private String h()
  {
    AtomicReference localAtomicReference = new AtomicReference();
    CountDownLatch localCountDownLatch = new CountDownLatch(1);
    new p(this, "AppLovinCollectCpuSpeed", localAtomicReference, localCountDownLatch).start();
    try
    {
      localCountDownLatch.await(2L, TimeUnit.SECONDS);
      label43: String str1 = (String)localAtomicReference.get();
      if ((str1 != null) && (str1.length() > 0))
      {
        String str2 = str1.trim().toLowerCase();
        int i = str2.indexOf("bogomips");
        if (i >= 0)
        {
          int j = i + 11;
          int k = str2.indexOf('\n', j);
          if (k > 0)
            return str2.substring(j, k);
        }
      }
      return "";
    }
    catch (InterruptedException localInterruptedException)
    {
      break label43;
    }
  }

  boolean a(String paramString)
  {
    return a(paramString, this.c);
  }

  List b()
  {
    Intent localIntent = new Intent("android.intent.action.MAIN", null);
    localIntent.addCategory("android.intent.category.LAUNCHER");
    List localList = this.c.getPackageManager().queryIntentActivities(localIntent, 0);
    ArrayList localArrayList;
    if ((localList != null) && (!localList.isEmpty()))
    {
      if ((a.size() == localList.size()) && (a.size() > 0) && (((q)a.get(0)).a.equals(((ResolveInfo)localList.get(0)).activityInfo.name)))
        return new ArrayList(a);
      localArrayList = new ArrayList(localList.size());
      HashSet localHashSet = new HashSet();
      Iterator localIterator = localList.iterator();
      ResolveInfo localResolveInfo;
      while (localIterator.hasNext())
      {
        localResolveInfo = (ResolveInfo)localIterator.next();
        try
        {
          long l = new File(localResolveInfo.activityInfo.applicationInfo.sourceDir).lastModified();
          q localq = new q();
          localq.c = bg.b(localResolveInfo.activityInfo.packageName, this.b);
          localq.d = l;
          localq.a = localResolveInfo.activityInfo.name;
          if (!localHashSet.contains(localq.c))
          {
            localArrayList.add(localq);
            localHashSet.add(localq.c);
          }
        }
        catch (Throwable localThrowable2)
        {
          this.d.w("DataCollector", "Unable to read information for app \"" + localResolveInfo + "\"", localThrowable2);
        }
      }
      try
      {
        Collections.sort(localArrayList, new o(this));
        a = localArrayList;
        return localArrayList;
      }
      catch (Throwable localThrowable1)
      {
        while (true)
          this.d.w("DataCollector", "Unable to sort applications", localThrowable1);
      }
    }
    return Collections.emptyList();
  }

  r c()
  {
    r localr = new r();
    localr.a = f();
    localr.b = Settings.Secure.getString(this.c.getContentResolver(), "android_id");
    localr.i = h();
    localr.j = Locale.getDefault();
    localr.c = Build.MODEL;
    localr.d = Build.VERSION.RELEASE;
    localr.e = Build.MANUFACTURER;
    localr.f = Build.VERSION.SDK_INT;
    String str;
    if (a("android.permission.READ_PHONE_STATE"))
    {
      TelephonyManager localTelephonyManager = (TelephonyManager)this.c.getSystemService("phone");
      if (localTelephonyManager != null)
      {
        localr.g = localTelephonyManager.getSimCountryIso().toUpperCase();
        str = localTelephonyManager.getNetworkOperatorName();
      }
    }
    try
    {
      localr.h = URLEncoder.encode(str, "UTF-8");
      return localr;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localr.h = str;
    }
    return localr;
  }

  q d()
  {
    localApplicationInfo = this.c.getApplicationInfo();
    l = new File(localApplicationInfo.sourceDir).lastModified();
    localPackageManager = this.c.getPackageManager();
    try
    {
      PackageInfo localPackageInfo2 = localPackageManager.getPackageInfo(this.c.getPackageName(), 0);
      localPackageInfo1 = localPackageInfo2;
      q localq = new q();
      localq.c = localApplicationInfo.packageName;
      localq.d = l;
      localq.a = String.valueOf(localPackageManager.getApplicationLabel(localApplicationInfo));
      if (localPackageInfo1 != null);
      for (String str = localPackageInfo1.versionName; ; str = "")
      {
        localq.b = str;
        return localq;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        PackageInfo localPackageInfo1 = null;
    }
  }

  byte[] e()
  {
    ApplicationInfo localApplicationInfo = this.c.getApplicationInfo();
    Drawable localDrawable = this.c.getPackageManager().getApplicationIcon(localApplicationInfo);
    if ((localDrawable instanceof BitmapDrawable))
      try
      {
        Bitmap localBitmap = ((BitmapDrawable)localDrawable).getBitmap();
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        localBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localByteArrayOutputStream);
        byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
        return arrayOfByte;
      }
      catch (Exception localException)
      {
        this.d.e("DataCollector", "Unable to create an app icon", localException);
      }
    return null;
  }

  String f()
  {
    if (a("android.permission.READ_PHONE_STATE"))
    {
      TelephonyManager localTelephonyManager = (TelephonyManager)this.c.getSystemService("phone");
      if (localTelephonyManager != null)
        return localTelephonyManager.getDeviceId();
    }
    return "";
  }

  boolean g()
  {
    int i = Settings.Secure.getInt(this.c.getContentResolver(), "install_non_market_apps", 0);
    boolean bool = false;
    if (i != 0)
      bool = true;
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
