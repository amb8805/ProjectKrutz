package com.spotify.mobile.android.orbit;

import android.app.Service;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.spotify.cosmos.router.NativeRouter;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.util.ap;
import com.spotify.mobile.android.util.bm;
import com.spotify.mobile.android.util.cc;
import java.io.File;
import java.lang.reflect.Method;

public final class OrbitService
  implements OrbitServiceInterface
{
  private static final String ORBIT_JNI_LIBRARY_NAME = "orbit-jni-spotify";
  private static boolean sNativeLoaded;
  private int nOrbitServicePtr;

  private OrbitService()
  {
  }

  private static native OrbitService create(int paramInt, String paramString1, String paramString2, String paramString3);

  public static OrbitService create(Service paramService, int paramInt, String paramString)
  {
    initOrbit(paramService);
    ap localap = (ap)c.a(ap.class);
    return create(paramInt, paramString, localap.e(), localap.i());
  }

  private static void fallbackNativeLoading(Context paramContext)
  {
    int i = 0;
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      PackageInfo localPackageInfo = localPackageManager.getPackageInfo(paramContext.getPackageName(), 0);
      cc.a(localPackageInfo);
      File[] arrayOfFile = new File(new File(localPackageInfo.applicationInfo.dataDir), "lib").listFiles();
      if (arrayOfFile != null)
      {
        j = arrayOfFile.length;
        if (i < j)
        {
          localFile = arrayOfFile[i];
          if (!localFile.getName().contains("orbit-jni-spotify"))
            break label130;
          System.load(localFile.getAbsolutePath());
          return;
        }
        throw new UnsatisfiedLinkError("Fallback failed! Orbit library not found under application dataDir!");
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new UnsatisfiedLinkError(localNameNotFoundException.getMessage());
    }
    while (true)
    {
      int j;
      File localFile;
      throw new UnsatisfiedLinkError("Fallback failed! Library directory in application dataDir is empty or non-existent!");
      label130: i++;
    }
  }

  // ERROR //
  private static void initOrbit(Context paramContext)
  {
    // Byte code:
    //   0: getstatic 119	com/spotify/mobile/android/orbit/OrbitService:sNativeLoaded	Z
    //   3: ifeq +4 -> 7
    //   6: return
    //   7: aload_0
    //   8: invokevirtual 123	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   11: invokestatic 128	com/spotify/mobile/android/core/internal/ConnectivityListener:setContext	(Landroid/content/Context;)V
    //   14: invokestatic 133	com/spotify/cosmos/android/CosmosAndroid:loadNativeLibrary	()V
    //   17: ldc 10
    //   19: invokestatic 136	java/lang/System:loadLibrary	(Ljava/lang/String;)V
    //   22: iconst_1
    //   23: putstatic 119	com/spotify/mobile/android/orbit/OrbitService:sNativeLoaded	Z
    //   26: ldc 27
    //   28: invokestatic 33	com/spotify/mobile/android/c/c:a	(Ljava/lang/Class;)Lcom/spotify/mobile/android/c/a;
    //   31: checkcast 27	com/spotify/mobile/android/util/ap
    //   34: astore 4
    //   36: invokestatic 140	com/spotify/mobile/android/util/ap:j	()Lcom/spotify/mobile/android/util/aq;
    //   39: astore 5
    //   41: getstatic 145	android/os/Build$VERSION:RELEASE	Ljava/lang/String;
    //   44: invokestatic 148	com/spotify/mobile/android/util/ap:a	()I
    //   47: aload 5
    //   49: getfield 153	com/spotify/mobile/android/util/aq:b	Ljava/lang/String;
    //   52: aload 5
    //   54: getfield 156	com/spotify/mobile/android/util/aq:c	Ljava/lang/String;
    //   57: aload 5
    //   59: getfield 159	com/spotify/mobile/android/util/aq:d	Ljava/lang/String;
    //   62: aload_0
    //   63: invokestatic 164	com/spotify/mobile/android/util/ds:c	(Landroid/content/Context;)Z
    //   66: aload 4
    //   68: invokevirtual 167	com/spotify/mobile/android/util/ap:d	()D
    //   71: invokestatic 171	com/spotify/mobile/android/orbit/OrbitService:setMobileDeviceInfo	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZD)V
    //   74: ldc 2
    //   76: invokevirtual 177	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   79: invokestatic 181	com/spotify/mobile/android/orbit/OrbitService:setClassLoader	(Ljava/lang/ClassLoader;)V
    //   82: return
    //   83: astore_1
    //   84: aload_1
    //   85: ldc 183
    //   87: invokestatic 188	com/spotify/mobile/android/util/bp:b	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   90: aload_1
    //   91: athrow
    //   92: astore_2
    //   93: invokestatic 191	com/spotify/mobile/android/orbit/OrbitService:logClassLoaderInfo	()V
    //   96: aload_0
    //   97: invokestatic 193	com/spotify/mobile/android/orbit/OrbitService:fallbackNativeLoading	(Landroid/content/Context;)V
    //   100: goto -78 -> 22
    //   103: astore_3
    //   104: aload_3
    //   105: ldc 195
    //   107: invokestatic 188	com/spotify/mobile/android/util/bp:b	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   110: aload_3
    //   111: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   14	17	83	java/lang/UnsatisfiedLinkError
    //   17	22	92	java/lang/UnsatisfiedLinkError
    //   96	100	103	java/lang/UnsatisfiedLinkError
  }

  private static void logClassLoaderInfo()
  {
    bm.e("OrbitService", "Failed trying to load orbit with mapped library name " + System.mapLibraryName("orbit-jni-spotify"));
    try
    {
      ClassLoader localClassLoader = (ClassLoader)Class.forName("dalvik.system.VMStack").getMethod("getCallingClassLoader", new Class[0]).invoke(null, new Object[0]);
      bm.e("OrbitService", "ClassLoader used for finding library: " + localClassLoader);
      return;
    }
    catch (Exception localException)
    {
      bm.e("OrbitService", "Failed to call VMStack.getCallingClassLoader()", localException);
    }
  }

  private static native void setClassLoader(ClassLoader paramClassLoader);

  private static native void setMobileDeviceInfo(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, boolean paramBoolean, double paramDouble);

  public final native void crash();

  public final native OrbitPlayer getOrbitPlayer();

  public final native OrbitProvider getOrbitProvider();

  public final native OrbitPushNotifications getOrbitPushNotifications();

  public final native OrbitSession getOrbitSession();

  public final native void setObserver(OrbitServiceObserver paramOrbitServiceObserver);

  public final native void start(String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2, NativeRouter paramNativeRouter);

  public final native void stop();
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.orbit.OrbitService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
