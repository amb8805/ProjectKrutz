package net.hockeyapp.android.c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import net.hockeyapp.android.UpdateActivity;
import net.hockeyapp.android.d.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends AsyncTask<String, String, JSONArray>
{
  protected String a;
  protected String b;
  private Activity c;
  private Boolean d;
  private net.hockeyapp.android.i e;
  private long f;

  // ERROR //
  private static String a(InputStream paramInputStream)
  {
    // Byte code:
    //   0: new 21	java/io/BufferedReader
    //   3: dup
    //   4: new 23	java/io/InputStreamReader
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 27	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   12: sipush 1024
    //   15: invokespecial 30	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   18: astore_1
    //   19: new 32	java/lang/StringBuilder
    //   22: dup
    //   23: invokespecial 35	java/lang/StringBuilder:<init>	()V
    //   26: astore_2
    //   27: aload_1
    //   28: invokevirtual 39	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   31: astore 7
    //   33: aload 7
    //   35: ifnull +47 -> 82
    //   38: aload_2
    //   39: new 32	java/lang/StringBuilder
    //   42: dup
    //   43: invokespecial 35	java/lang/StringBuilder:<init>	()V
    //   46: aload 7
    //   48: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: ldc 45
    //   53: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   59: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: goto -36 -> 27
    //   66: astore 5
    //   68: aload 5
    //   70: invokevirtual 51	java/io/IOException:printStackTrace	()V
    //   73: aload_0
    //   74: invokevirtual 56	java/io/InputStream:close	()V
    //   77: aload_2
    //   78: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   81: areturn
    //   82: aload_0
    //   83: invokevirtual 56	java/io/InputStream:close	()V
    //   86: goto -9 -> 77
    //   89: astore 9
    //   91: aload 9
    //   93: invokevirtual 51	java/io/IOException:printStackTrace	()V
    //   96: goto -19 -> 77
    //   99: astore 6
    //   101: aload 6
    //   103: invokevirtual 51	java/io/IOException:printStackTrace	()V
    //   106: goto -29 -> 77
    //   109: astore_3
    //   110: aload_0
    //   111: invokevirtual 56	java/io/InputStream:close	()V
    //   114: aload_3
    //   115: athrow
    //   116: astore 4
    //   118: aload 4
    //   120: invokevirtual 51	java/io/IOException:printStackTrace	()V
    //   123: goto -9 -> 114
    //
    // Exception table:
    //   from	to	target	type
    //   27	33	66	java/io/IOException
    //   38	63	66	java/io/IOException
    //   82	86	89	java/io/IOException
    //   73	77	99	java/io/IOException
    //   27	33	109	finally
    //   38	63	109	finally
    //   68	73	109	finally
    //   110	114	116	java/io/IOException
  }

  private String a(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a);
    localStringBuilder.append("api/2/apps/");
    if (this.b != null);
    for (String str = this.b; ; str = this.c.getPackageName())
    {
      localStringBuilder.append(str);
      localStringBuilder.append("?format=" + paramString);
      if (Settings.Secure.getString(this.c.getContentResolver(), "android_id") != null)
        localStringBuilder.append("&udid=" + b(Settings.Secure.getString(this.c.getContentResolver(), "android_id")));
      localStringBuilder.append("&os=Android");
      localStringBuilder.append("&os_version=" + b(net.hockeyapp.android.a.e));
      localStringBuilder.append("&device=" + b(net.hockeyapp.android.a.f));
      localStringBuilder.append("&oem=" + b(net.hockeyapp.android.a.g));
      localStringBuilder.append("&app_version=" + b(net.hockeyapp.android.a.b));
      localStringBuilder.append("&sdk=" + b("HockeySDK"));
      localStringBuilder.append("&sdk_version=" + b("3.0.1"));
      localStringBuilder.append("&lang=" + b(Locale.getDefault().getLanguage()));
      localStringBuilder.append("&usage_time=" + this.f);
      return localStringBuilder.toString();
    }
  }

  private JSONArray a()
  {
    try
    {
      int i = Integer.parseInt(net.hockeyapp.android.a.b);
      JSONArray localJSONArray1 = new JSONArray(h.a(this.c));
      if (a(localJSONArray1, i))
        return localJSONArray1;
      URLConnection localURLConnection = new URL(a("json")).openConnection();
      localURLConnection.addRequestProperty("User-Agent", "HockeySDK/Android");
      if (Build.VERSION.SDK_INT <= 9)
        localURLConnection.setRequestProperty("connection", "close");
      localURLConnection.connect();
      BufferedInputStream localBufferedInputStream = new BufferedInputStream(localURLConnection.getInputStream());
      String str = a(localBufferedInputStream);
      localBufferedInputStream.close();
      JSONArray localJSONArray2 = new JSONArray(str);
      if (a(localJSONArray2, i))
      {
        JSONArray localJSONArray3 = a(localJSONArray2);
        return localJSONArray3;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }

  private static JSONArray a(JSONArray paramJSONArray)
  {
    localJSONArray = new JSONArray();
    int i = 0;
    while (true)
      if (i < Math.min(paramJSONArray.length(), 25))
        try
        {
          localJSONArray.put(paramJSONArray.get(i));
          label33: i++;
          continue;
          return localJSONArray;
        }
        catch (JSONException localJSONException)
        {
          break label33;
        }
  }

  @TargetApi(11)
  private void a(JSONArray paramJSONArray, Boolean paramBoolean)
  {
    net.hockeyapp.android.i locali = this.e;
    UpdateActivity localUpdateActivity = null;
    if (locali != null)
      localUpdateActivity = UpdateActivity.class;
    if (localUpdateActivity == null)
      localUpdateActivity = UpdateActivity.class;
    if (this.c != null)
    {
      Intent localIntent = new Intent();
      localIntent.setClass(this.c, localUpdateActivity);
      localIntent.putExtra("json", paramJSONArray.toString());
      localIntent.putExtra("url", a("apk"));
      this.c.startActivity(localIntent);
      if (paramBoolean.booleanValue())
        this.c.finish();
    }
    b();
  }

  private boolean a(JSONArray paramJSONArray, int paramInt)
  {
    int i = 0;
    try
    {
      while (true)
      {
        int j = paramJSONArray.length();
        boolean bool = false;
        if (i < j)
        {
          JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
          if ((localJSONObject.getInt("version") > paramInt) && (net.hockeyapp.android.d.i.a(localJSONObject.getString("minimum_os_version"), Build.VERSION.RELEASE) <= 0))
          {
            if (localJSONObject.has("mandatory"))
              this.d = Boolean.valueOf(localJSONObject.getBoolean("mandatory"));
            bool = true;
          }
        }
        else
        {
          return bool;
        }
        i++;
      }
    }
    catch (JSONException localJSONException)
    {
    }
    return false;
  }

  private static String b(String paramString)
  {
    try
    {
      String str = URLEncoder.encode(paramString, "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return "";
  }

  private void b()
  {
    this.c = null;
    this.a = null;
    this.b = null;
  }
}

/* Location:
 * Qualified Name:     net.hockeyapp.android.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
