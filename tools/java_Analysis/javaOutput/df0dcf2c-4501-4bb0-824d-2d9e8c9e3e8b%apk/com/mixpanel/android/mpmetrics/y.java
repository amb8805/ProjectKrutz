package com.mixpanel.android.mpmetrics;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;

final class y
{
  private final Context a;
  private final Boolean b;
  private final Boolean c;
  private final DisplayMetrics d;
  private final String e;
  private final Integer f;

  // ERROR //
  public y(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 28	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield 30	com/mixpanel/android/mpmetrics/y:a	Landroid/content/Context;
    //   9: aload_0
    //   10: getfield 30	com/mixpanel/android/mpmetrics/y:a	Landroid/content/Context;
    //   13: invokevirtual 36	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   16: astore_2
    //   17: aload_2
    //   18: aload_0
    //   19: getfield 30	com/mixpanel/android/mpmetrics/y:a	Landroid/content/Context;
    //   22: invokevirtual 40	android/content/Context:getPackageName	()Ljava/lang/String;
    //   25: iconst_0
    //   26: invokevirtual 46	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   29: astore 21
    //   31: aload 21
    //   33: getfield 51	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   36: astore 6
    //   38: aload 21
    //   40: getfield 55	android/content/pm/PackageInfo:versionCode	I
    //   43: invokestatic 61	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   46: astore 23
    //   48: aload 23
    //   50: astore 7
    //   52: aload_0
    //   53: aload 6
    //   55: putfield 63	com/mixpanel/android/mpmetrics/y:e	Ljava/lang/String;
    //   58: aload_0
    //   59: aload 7
    //   61: putfield 65	com/mixpanel/android/mpmetrics/y:f	Ljava/lang/Integer;
    //   64: aload_2
    //   65: invokevirtual 69	java/lang/Object:getClass	()Ljava/lang/Class;
    //   68: astore 8
    //   70: aload 8
    //   72: ldc 71
    //   74: iconst_1
    //   75: anewarray 73	java/lang/Class
    //   78: dup
    //   79: iconst_0
    //   80: ldc 75
    //   82: aastore
    //   83: invokevirtual 79	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   86: astore 20
    //   88: aload 20
    //   90: astore 10
    //   92: aload 10
    //   94: ifnull +182 -> 276
    //   97: aload 10
    //   99: aload_2
    //   100: iconst_1
    //   101: anewarray 4	java/lang/Object
    //   104: dup
    //   105: iconst_0
    //   106: ldc 81
    //   108: aastore
    //   109: invokevirtual 87	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   112: checkcast 89	java/lang/Boolean
    //   115: astore 11
    //   117: aload 10
    //   119: aload_2
    //   120: iconst_1
    //   121: anewarray 4	java/lang/Object
    //   124: dup
    //   125: iconst_0
    //   126: ldc 91
    //   128: aastore
    //   129: invokevirtual 87	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   132: checkcast 89	java/lang/Boolean
    //   135: astore 19
    //   137: aload 19
    //   139: astore 12
    //   141: aload_0
    //   142: aload 11
    //   144: putfield 93	com/mixpanel/android/mpmetrics/y:b	Ljava/lang/Boolean;
    //   147: aload_0
    //   148: aload 12
    //   150: putfield 95	com/mixpanel/android/mpmetrics/y:c	Ljava/lang/Boolean;
    //   153: aload_0
    //   154: new 97	android/util/DisplayMetrics
    //   157: dup
    //   158: invokespecial 98	android/util/DisplayMetrics:<init>	()V
    //   161: putfield 100	com/mixpanel/android/mpmetrics/y:d	Landroid/util/DisplayMetrics;
    //   164: aload_0
    //   165: getfield 30	com/mixpanel/android/mpmetrics/y:a	Landroid/content/Context;
    //   168: ldc 102
    //   170: invokevirtual 106	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   173: checkcast 108	android/view/WindowManager
    //   176: invokeinterface 112 1 0
    //   181: aload_0
    //   182: getfield 100	com/mixpanel/android/mpmetrics/y:d	Landroid/util/DisplayMetrics;
    //   185: invokevirtual 118	android/view/Display:getMetrics	(Landroid/util/DisplayMetrics;)V
    //   188: return
    //   189: astore_3
    //   190: aconst_null
    //   191: astore 4
    //   193: ldc 120
    //   195: ldc 122
    //   197: invokestatic 128	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   200: pop
    //   201: aload 4
    //   203: astore 6
    //   205: aconst_null
    //   206: astore 7
    //   208: goto -156 -> 52
    //   211: astore 9
    //   213: aconst_null
    //   214: astore 10
    //   216: goto -124 -> 92
    //   219: astore 15
    //   221: aconst_null
    //   222: astore 11
    //   224: ldc 120
    //   226: ldc 130
    //   228: invokestatic 128	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   231: pop
    //   232: aconst_null
    //   233: astore 12
    //   235: goto -94 -> 141
    //   238: astore 13
    //   240: aconst_null
    //   241: astore 11
    //   243: ldc 120
    //   245: ldc 130
    //   247: invokestatic 128	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   250: pop
    //   251: aconst_null
    //   252: astore 12
    //   254: goto -113 -> 141
    //   257: astore 18
    //   259: goto -16 -> 243
    //   262: astore 17
    //   264: goto -40 -> 224
    //   267: astore 22
    //   269: aload 6
    //   271: astore 4
    //   273: goto -80 -> 193
    //   276: aconst_null
    //   277: astore 11
    //   279: aconst_null
    //   280: astore 12
    //   282: goto -141 -> 141
    //
    // Exception table:
    //   from	to	target	type
    //   17	38	189	android/content/pm/PackageManager$NameNotFoundException
    //   70	88	211	java/lang/NoSuchMethodException
    //   97	117	219	java/lang/reflect/InvocationTargetException
    //   97	117	238	java/lang/IllegalAccessException
    //   117	137	257	java/lang/IllegalAccessException
    //   117	137	262	java/lang/reflect/InvocationTargetException
    //   38	48	267	android/content/pm/PackageManager$NameNotFoundException
  }

  public static Boolean g()
  {
    try
    {
      BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
      Object localObject = null;
      if (localBluetoothAdapter != null)
      {
        Boolean localBoolean = Boolean.valueOf(localBluetoothAdapter.isEnabled());
        localObject = localBoolean;
      }
      return localObject;
    }
    catch (SecurityException localSecurityException)
    {
    }
    return null;
  }

  public final String a()
  {
    return this.e;
  }

  public final boolean b()
  {
    return this.b.booleanValue();
  }

  public final boolean c()
  {
    return this.c.booleanValue();
  }

  public final DisplayMetrics d()
  {
    return this.d;
  }

  public final String e()
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)this.a.getSystemService("phone");
    if (localTelephonyManager != null)
      return localTelephonyManager.getNetworkOperatorName();
    return null;
  }

  public final Boolean f()
  {
    int i = this.a.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE");
    Boolean localBoolean = null;
    if (i == 0)
      localBoolean = Boolean.valueOf(((ConnectivityManager)this.a.getSystemService("connectivity")).getNetworkInfo(1).isConnected());
    return localBoolean;
  }

  public final String h()
  {
    int i = Build.VERSION.SDK_INT;
    String str = null;
    if (i >= 8)
    {
      str = "none";
      if ((Build.VERSION.SDK_INT < 18) || (!this.a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")))
        break label43;
      str = "ble";
    }
    label43: 
    while (!this.a.getPackageManager().hasSystemFeature("android.hardware.bluetooth"))
      return str;
    return "classic";
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
