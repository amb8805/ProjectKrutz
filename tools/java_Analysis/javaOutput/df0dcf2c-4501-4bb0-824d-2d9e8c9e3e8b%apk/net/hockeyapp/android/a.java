package net.hockeyapp.android;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

public final class a
{
  public static String a = null;
  public static String b = null;
  public static String c = null;
  public static String d = null;
  public static String e = null;
  public static String f = null;
  public static String g = null;

  private static int a(Context paramContext, PackageManager paramPackageManager)
  {
    try
    {
      Bundle localBundle = paramPackageManager.getApplicationInfo(paramContext.getPackageName(), 128).metaData;
      int i = 0;
      if (localBundle != null)
      {
        int j = localBundle.getInt("buildNumber", 0);
        i = j;
      }
      return i;
    }
    catch (Exception localException)
    {
      Log.e("HockeyApp", "Exception thrown when accessing the application info:");
      localException.printStackTrace();
    }
    return 0;
  }

  // ERROR //
  public static void a(Context paramContext)
  {
    // Byte code:
    //   0: getstatic 75	android/os/Build$VERSION:RELEASE	Ljava/lang/String;
    //   3: putstatic 24	net/hockeyapp/android/a:e	Ljava/lang/String;
    //   6: getstatic 80	android/os/Build:MODEL	Ljava/lang/String;
    //   9: putstatic 26	net/hockeyapp/android/a:f	Ljava/lang/String;
    //   12: getstatic 83	android/os/Build:MANUFACTURER	Ljava/lang/String;
    //   15: putstatic 28	net/hockeyapp/android/a:g	Ljava/lang/String;
    //   18: aload_0
    //   19: ifnull +22 -> 41
    //   22: aload_0
    //   23: invokevirtual 87	android/content/Context:getFilesDir	()Ljava/io/File;
    //   26: astore 8
    //   28: aload 8
    //   30: ifnull +11 -> 41
    //   33: aload 8
    //   35: invokevirtual 92	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   38: putstatic 16	net/hockeyapp/android/a:a	Ljava/lang/String;
    //   41: aload_0
    //   42: ifnull +86 -> 128
    //   45: aload_0
    //   46: invokevirtual 96	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   49: astore_3
    //   50: aload_3
    //   51: aload_0
    //   52: invokevirtual 37	android/content/Context:getPackageName	()Ljava/lang/String;
    //   55: iconst_0
    //   56: invokevirtual 100	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   59: astore 4
    //   61: aload 4
    //   63: getfield 105	android/content/pm/PackageInfo:packageName	Ljava/lang/String;
    //   66: putstatic 22	net/hockeyapp/android/a:d	Ljava/lang/String;
    //   69: new 107	java/lang/StringBuilder
    //   72: dup
    //   73: invokespecial 110	java/lang/StringBuilder:<init>	()V
    //   76: aload 4
    //   78: getfield 114	android/content/pm/PackageInfo:versionCode	I
    //   81: invokevirtual 118	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   84: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   87: putstatic 18	net/hockeyapp/android/a:b	Ljava/lang/String;
    //   90: aload 4
    //   92: getfield 124	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   95: putstatic 20	net/hockeyapp/android/a:c	Ljava/lang/String;
    //   98: aload_0
    //   99: aload_3
    //   100: invokestatic 126	net/hockeyapp/android/a:a	(Landroid/content/Context;Landroid/content/pm/PackageManager;)I
    //   103: istore 5
    //   105: iload 5
    //   107: ifeq +21 -> 128
    //   110: iload 5
    //   112: aload 4
    //   114: getfield 114	android/content/pm/PackageInfo:versionCode	I
    //   117: if_icmple +11 -> 128
    //   120: iload 5
    //   122: invokestatic 132	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   125: putstatic 18	net/hockeyapp/android/a:b	Ljava/lang/String;
    //   128: return
    //   129: astore 6
    //   131: ldc 59
    //   133: ldc 134
    //   135: invokestatic 66	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   138: pop
    //   139: aload 6
    //   141: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   144: goto -103 -> 41
    //   147: astore_1
    //   148: ldc 59
    //   150: ldc 136
    //   152: invokestatic 66	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   155: pop
    //   156: aload_1
    //   157: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   160: return
    //
    // Exception table:
    //   from	to	target	type
    //   22	28	129	java/lang/Exception
    //   33	41	129	java/lang/Exception
    //   45	105	147	java/lang/Exception
    //   110	128	147	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     net.hockeyapp.android.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
