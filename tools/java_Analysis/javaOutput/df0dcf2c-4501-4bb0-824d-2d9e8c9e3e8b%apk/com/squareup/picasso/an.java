package com.squareup.picasso;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.StatFs;
import android.provider.Settings.System;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

final class an
{
  static final StringBuilder a = new StringBuilder();

  static int a(Resources paramResources, ac paramac)
  {
    if ((paramac.b != 0) || (paramac.a == null))
      return paramac.b;
    String str1 = paramac.a.getAuthority();
    if (str1 == null)
      throw new FileNotFoundException("No package provided: " + paramac.a);
    List localList = paramac.a.getPathSegments();
    if ((localList == null) || (localList.isEmpty()))
      throw new FileNotFoundException("No path segments: " + paramac.a);
    if (localList.size() == 1)
      try
      {
        int i = Integer.parseInt((String)localList.get(0));
        return i;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new FileNotFoundException("Last path segment is not a resource ID: " + paramac.a);
      }
    if (localList.size() == 2)
    {
      String str2 = (String)localList.get(0);
      return paramResources.getIdentifier((String)localList.get(1), str2, str1);
    }
    throw new FileNotFoundException("More than two path segments: " + paramac.a);
  }

  static int a(Bitmap paramBitmap)
  {
    if (Build.VERSION.SDK_INT >= 12);
    for (int i = paramBitmap.getByteCount(); i < 0; i = paramBitmap.getRowBytes() * paramBitmap.getHeight())
      throw new IllegalStateException("Negative size: " + paramBitmap);
    return i;
  }

  static long a(File paramFile)
  {
    try
    {
      StatFs localStatFs = new StatFs(paramFile.getAbsolutePath());
      l = localStatFs.getBlockCount() * localStatFs.getBlockSize() / 50L;
      return Math.max(Math.min(l, 52428800L), 5242880L);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (true)
        long l = 5242880L;
    }
  }

  static Resources a(Context paramContext, ac paramac)
  {
    if ((paramac.b != 0) || (paramac.a == null))
      return paramContext.getResources();
    String str = paramac.a.getAuthority();
    if (str == null)
      throw new FileNotFoundException("No package provided: " + paramac.a);
    try
    {
      Resources localResources = paramContext.getPackageManager().getResourcesForApplication(str);
      return localResources;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    throw new FileNotFoundException("Unable to obtain resources for package: " + paramac.a);
  }

  static Downloader a(Context paramContext)
  {
    try
    {
      Class.forName("com.squareup.okhttp.OkHttpClient");
      v localv = new v(paramContext);
      return localv;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
    }
    return new am(paramContext);
  }

  static String a(ac paramac)
  {
    StringBuilder localStringBuilder = a;
    if (paramac.a != null)
    {
      String str2 = paramac.a.toString();
      localStringBuilder.ensureCapacity(50 + str2.length());
      localStringBuilder.append(str2);
      localStringBuilder.append((char)'\n');
      if (paramac.i != 0.0F)
      {
        localStringBuilder.append("rotation:").append(paramac.i);
        if (paramac.l)
          localStringBuilder.append((char)'@').append(paramac.j).append((char)'x').append(paramac.k);
        localStringBuilder.append((char)'\n');
      }
      if (paramac.e != 0)
      {
        localStringBuilder.append("resize:").append(paramac.e).append((char)'x').append(paramac.f);
        localStringBuilder.append((char)'\n');
      }
      if (!paramac.g)
        break label246;
      localStringBuilder.append("centerCrop\n");
    }
    while (true)
    {
      if (paramac.c == null)
        break label263;
      int i = paramac.c.size();
      for (int j = 0; j < i; j++)
      {
        localStringBuilder.append(((al)paramac.c.get(j)).a());
        localStringBuilder.append((char)'\n');
      }
      localStringBuilder.ensureCapacity(50);
      localStringBuilder.append(paramac.b);
      break;
      label246: if (paramac.h)
        localStringBuilder.append("centerInside\n");
    }
    label263: String str1 = localStringBuilder.toString();
    a.setLength(0);
    return str1;
  }

  static void a(InputStream paramInputStream)
  {
    if (paramInputStream == null)
      return;
    try
    {
      paramInputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  static boolean a(Context paramContext, String paramString)
  {
    return paramContext.checkCallingOrSelfPermission(paramString) == 0;
  }

  static boolean a(String paramString)
  {
    if (paramString == null);
    while (true)
    {
      return false;
      String[] arrayOfString = paramString.split(" ", 2);
      if ("CACHE".equals(arrayOfString[0]))
        return true;
      if (arrayOfString.length != 1)
        try
        {
          if ("CONDITIONAL_CACHE".equals(arrayOfString[0]))
          {
            int i = Integer.parseInt(arrayOfString[1]);
            if (i == 304)
              return true;
          }
        }
        catch (NumberFormatException localNumberFormatException)
        {
        }
    }
    return false;
  }

  static File b(Context paramContext)
  {
    File localFile = new File(paramContext.getApplicationContext().getCacheDir(), "picasso-cache");
    if (!localFile.exists())
      localFile.mkdirs();
    return localFile;
  }

  static byte[] b(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[4096];
    while (true)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (-1 == i)
        break;
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    return localByteArrayOutputStream.toByteArray();
  }

  static int c(Context paramContext)
  {
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    int i;
    int j;
    if ((0x100000 & paramContext.getApplicationInfo().flags) != 0)
    {
      i = 1;
      j = localActivityManager.getMemoryClass();
      if ((i == 0) || (Build.VERSION.SDK_INT < 11))
        break label65;
    }
    label65: for (int k = localActivityManager.getLargeMemoryClass(); ; k = j)
    {
      return k * 1048576 / 7;
      i = 0;
      break;
    }
  }

  static boolean c(InputStream paramInputStream)
  {
    byte[] arrayOfByte = new byte[12];
    int i = paramInputStream.read(arrayOfByte, 0, 12);
    boolean bool1 = false;
    if (i == 12)
    {
      boolean bool2 = "RIFF".equals(new String(arrayOfByte, 0, 4, "US-ASCII"));
      bool1 = false;
      if (bool2)
      {
        boolean bool3 = "WEBP".equals(new String(arrayOfByte, 8, 4, "US-ASCII"));
        bool1 = false;
        if (bool3)
          bool1 = true;
      }
    }
    return bool1;
  }

  static boolean d(Context paramContext)
  {
    int i = Settings.System.getInt(paramContext.getContentResolver(), "airplane_mode_on", 0);
    boolean bool = false;
    if (i != 0)
      bool = true;
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.an
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
