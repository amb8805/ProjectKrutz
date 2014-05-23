import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.preference.PreferenceManager;
import java.util.UUID;
import org.apache.http.client.methods.HttpRequestBase;

public final class ai
{
  private static ai d;
  public final String a;
  public final String b;
  public final String c;
  private String e;
  private String f;
  private String g;

  private ai(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      PackageInfo localPackageInfo2 = localPackageManager.getPackageInfo(paramContext.getPackageName(), 0);
      localPackageInfo1 = localPackageInfo2;
      if (localPackageInfo1 != null)
      {
        this.g = localPackageInfo1.versionName;
        localStringBuilder1 = new StringBuilder("TwitterAndroid");
        if (localPackageInfo1 == null)
          break label348;
        localStringBuilder1.append((char)'/').append(localPackageInfo1.versionName).append(" (").append(localPackageInfo1.versionCode).append((char)')');
        ApplicationInfo localApplicationInfo = localPackageInfo1.applicationInfo;
        if ((localApplicationInfo == null) || (((0x1 & localApplicationInfo.flags) == 0) && ((0x80 & localApplicationInfo.flags) == 0)))
          break label342;
        i = 1;
        StringBuilder localStringBuilder2 = localStringBuilder1.append((char)' ').append(Build.MODEL).append((char)'/').append(Build.VERSION.SDK_INT).append(" (").append(Build.MANUFACTURER).append((char)';').append(Build.DEVICE).append((char)';').append(Build.BRAND).append((char)';').append(Build.PRODUCT).append((char)';');
        if (i == 0)
          break label362;
        j = 1;
        localStringBuilder2.append(j).append((char)')');
        this.e = localStringBuilder1.toString();
        SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
        String str = localSharedPreferences.getString("client_uuid", null);
        if (str == null)
        {
          str = UUID.randomUUID().toString();
          SharedPreferences.Editor localEditor = localSharedPreferences.edit();
          localEditor.putString("client_uuid", str);
          localEditor.commit();
        }
        this.f = str;
        this.a = paramContext.getString(2131427330);
        this.b = paramContext.getString(2131427331);
        this.c = paramContext.getString(2131427334);
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
      {
        StringBuilder localStringBuilder1;
        PackageInfo localPackageInfo1 = null;
        continue;
        this.g = null;
        continue;
        int i = 0;
        continue;
        localStringBuilder1.append("/3.0.0 (^_^)");
        i = 0;
        continue;
        int j = 0;
      }
    }
  }

  public static int a(int paramInt1, int paramInt2)
  {
    if (paramInt1 % 100 > 0)
      return 1 + paramInt1 / 100;
    return paramInt1 / 100;
  }

  public static int a(StringBuilder paramStringBuilder, String paramString, long[] paramArrayOfLong, int paramInt1, int paramInt2)
  {
    if ((paramArrayOfLong != null) && (paramInt1 < paramArrayOfLong.length))
    {
      a(paramStringBuilder, paramString);
      int i = Math.min(paramInt1 + 100, paramArrayOfLong.length);
      for (int j = paramInt1; j < i; j++)
      {
        paramStringBuilder.append(paramArrayOfLong[j]);
        if (j < i - 1)
          paramStringBuilder.append((char)',');
      }
      return i - paramInt1;
    }
    return 0;
  }

  public static int a(StringBuilder paramStringBuilder, String paramString, String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    if ((paramArrayOfString != null) && (paramInt1 < paramArrayOfString.length) && (paramInt2 > 0))
    {
      a(paramStringBuilder, paramString);
      int i = Math.min(paramInt1 + paramInt2, paramArrayOfString.length);
      for (int j = paramInt1; j < i; j++)
      {
        paramStringBuilder.append(cl.a(paramArrayOfString[j]));
        if (j < i - 1)
          paramStringBuilder.append((char)',');
      }
      return i - paramInt1;
    }
    return 0;
  }

  public static ai a(Context paramContext)
  {
    try
    {
      if (d == null)
        d = new ai(paramContext.getApplicationContext());
      ai localai = d;
      return localai;
    }
    finally
    {
    }
  }

  public static StringBuilder a(String paramString, Object[] paramArrayOfObject)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString);
    if (paramArrayOfObject != null)
    {
      int i = paramArrayOfObject.length;
      for (int j = 0; j < i; j++)
      {
        Object localObject = paramArrayOfObject[j];
        localStringBuilder.append((char)'/');
        localStringBuilder.append(localObject);
      }
    }
    return localStringBuilder;
  }

  private static StringBuilder a(StringBuilder paramStringBuilder, String paramString)
  {
    if (paramStringBuilder.indexOf("?") == -1)
      paramStringBuilder.append((char)'?');
    while (true)
    {
      return paramStringBuilder.append(paramString).append((char)'=');
      paramStringBuilder.append((char)'&');
    }
  }

  public static void a(StringBuilder paramStringBuilder, String paramString, double paramDouble)
  {
    a(paramStringBuilder, paramString).append(paramDouble);
  }

  public static void a(StringBuilder paramStringBuilder, String paramString, int paramInt)
  {
    a(paramStringBuilder, paramString).append(paramInt);
  }

  public static void a(StringBuilder paramStringBuilder, String paramString, long paramLong)
  {
    a(paramStringBuilder, paramString).append(paramLong);
  }

  public static void a(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    a(paramStringBuilder, paramString1).append(cl.a(paramString2));
  }

  public static void a(StringBuilder paramStringBuilder, String paramString, boolean paramBoolean)
  {
    a(paramStringBuilder, paramString).append(paramBoolean);
  }

  public final StringBuilder a(Object[] paramArrayOfObject)
  {
    return a(this.b, paramArrayOfObject);
  }

  public final void a(n paramn)
  {
    HttpRequestBase localHttpRequestBase = paramn.d();
    localHttpRequestBase.addHeader("User-Agent", this.e);
    localHttpRequestBase.addHeader("X-Client-UUID", this.f);
    localHttpRequestBase.addHeader("X-Twitter-Client", "TwitterAndroid");
    localHttpRequestBase.addHeader("X-Twitter-Client-Version", this.g);
  }
}

/* Location:
 * Qualified Name:     ai
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
