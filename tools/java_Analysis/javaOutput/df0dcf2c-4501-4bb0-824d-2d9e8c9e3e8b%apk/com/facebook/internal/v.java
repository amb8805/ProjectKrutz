package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.Session;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public final class v
{
  public static final Uri a = Uri.parse("content://com.facebook.katana.provider.PlatformProvider/versions");
  private static final List<Integer> b = Arrays.asList(arrayOfInteger);

  static
  {
    Integer[] arrayOfInteger = new Integer[3];
    arrayOfInteger[0] = Integer.valueOf(20130618);
    arrayOfInteger[1] = Integer.valueOf(20130502);
    arrayOfInteger[2] = Integer.valueOf(20121101);
  }

  public static int a(Context paramContext, int paramInt)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    String[] arrayOfString = { "version" };
    Cursor localCursor = localContentResolver.query(a, arrayOfString, null, null, null);
    if (localCursor == null)
      return -1;
    HashSet localHashSet = new HashSet();
    while (localCursor.moveToNext())
      localHashSet.add(Integer.valueOf(localCursor.getInt(localCursor.getColumnIndex("version"))));
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      if (localInteger.intValue() < paramInt)
        return -1;
      if (localHashSet.contains(localInteger))
        return localInteger.intValue();
    }
    return -1;
  }

  public static Intent a(Context paramContext)
  {
    return b(paramContext, new Intent().setClassName("com.facebook.katana", "com.facebook.katana.platform.TokenRefreshService"));
  }

  private static Intent a(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null)
      paramIntent = null;
    ResolveInfo localResolveInfo;
    do
    {
      return paramIntent;
      localResolveInfo = paramContext.getPackageManager().resolveActivity(paramIntent, 0);
      if (localResolveInfo == null)
        return null;
    }
    while (a(paramContext, localResolveInfo.activityInfo.packageName));
    return null;
  }

  public static Intent a(Context paramContext, String paramString1, ArrayList<String> paramArrayList, String paramString2)
  {
    Intent localIntent = new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage("com.facebook.katana").addCategory("android.intent.category.DEFAULT").putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 20121101).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", "com.facebook.platform.action.request.LOGIN_DIALOG").putExtra("com.facebook.platform.extra.APPLICATION_ID", paramString1).putStringArrayListExtra("com.facebook.platform.extra.PERMISSIONS", a(paramArrayList)).putExtra("com.facebook.platform.protocol.CALL_ID", UUID.randomUUID().toString());
    if (ad.a(paramString2))
      paramString2 = "SELF";
    return a(paramContext, localIntent.putExtra("com.facebook.platform.extra.WRITE_PRIVACY", paramString2));
  }

  public static Intent a(Context paramContext, String paramString1, List<String> paramList, String paramString2)
  {
    Intent localIntent = new Intent().setClassName("com.facebook.katana", "com.facebook.katana.ProxyAuth").putExtra("client_id", paramString1);
    if (!ad.a(paramList))
      localIntent.putExtra("scope", TextUtils.join(",", paramList));
    if (!ad.a(paramString2))
      localIntent.putExtra("e2e", paramString2);
    return a(paramContext, localIntent);
  }

  private static ArrayList<String> a(ArrayList<String> paramArrayList)
  {
    if (ad.a(paramArrayList));
    for (ArrayList localArrayList = new ArrayList(); ; localArrayList = new ArrayList(paramArrayList))
    {
      localArrayList.add("basic_info");
      paramArrayList = localArrayList;
      return paramArrayList;
      Iterator localIterator = paramArrayList.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if (Session.a(str))
            break;
          if ("basic_info".equals(str))
            return paramArrayList;
        }
    }
  }

  private static boolean a(Context paramContext, String paramString)
  {
    String str = Build.BRAND;
    int i = paramContext.getApplicationInfo().flags;
    if ((str.startsWith("generic")) && ((i & 0x2) != 0));
    while (true)
    {
      return true;
      try
      {
        PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramString, 64);
        Signature[] arrayOfSignature = localPackageInfo.signatures;
        int j = arrayOfSignature.length;
        for (int k = 0; ; k++)
        {
          if (k >= j)
            break label91;
          if (arrayOfSignature[k].toCharsString().equals("30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2"))
            break;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        return false;
      }
    }
    label91: return false;
  }

  public static boolean a(Intent paramIntent)
  {
    int i = paramIntent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
    String str = paramIntent.getStringExtra("com.facebook.platform.status.ERROR_TYPE");
    boolean bool1 = false;
    if (20121101 == i)
    {
      boolean bool2 = "ServiceDisabled".equals(str);
      bool1 = false;
      if (bool2)
        bool1 = true;
    }
    return bool1;
  }

  public static Intent b(Context paramContext)
  {
    return b(paramContext, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage("com.facebook.katana").addCategory("android.intent.category.DEFAULT"));
  }

  private static Intent b(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null)
      paramIntent = null;
    ResolveInfo localResolveInfo;
    do
    {
      return paramIntent;
      localResolveInfo = paramContext.getPackageManager().resolveService(paramIntent, 0);
      if (localResolveInfo == null)
        return null;
    }
    while (a(paramContext, localResolveInfo.serviceInfo.packageName));
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
