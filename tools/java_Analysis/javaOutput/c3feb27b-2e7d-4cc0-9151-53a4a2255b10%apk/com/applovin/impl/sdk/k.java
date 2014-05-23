package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinLogger;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

class k
{
  private final AppLovinSdkImpl a;
  private final AppLovinLogger b;

  k(AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    this.a = paramAppLovinSdkImpl;
    this.b = paramAppLovinSdkImpl.getLogger();
  }

  private int a(Throwable paramThrowable)
  {
    if ((paramThrowable instanceof SocketTimeoutException))
      return -102;
    if ((paramThrowable instanceof IOException))
    {
      String str = paramThrowable.getMessage();
      if ((str != null) && (str.toLowerCase().contains("authentication challenge")))
        return 401;
      return -100;
    }
    if ((paramThrowable instanceof JSONException))
      return -104;
    return 0;
  }

  private HttpURLConnection a(String paramString1, String paramString2, int paramInt)
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramString1).openConnection();
    localHttpURLConnection.setRequestMethod(paramString2);
    if (paramInt < 0);
    for (int i = ((Integer)this.a.a(z.v)).intValue(); ; i = paramInt)
    {
      localHttpURLConnection.setConnectTimeout(i);
      if (paramInt < 0)
        paramInt = ((Integer)this.a.a(z.w)).intValue();
      localHttpURLConnection.setReadTimeout(paramInt);
      localHttpURLConnection.setDefaultUseCaches(false);
      localHttpURLConnection.setAllowUserInteraction(false);
      localHttpURLConnection.setUseCaches(false);
      localHttpURLConnection.setInstanceFollowRedirects(true);
      localHttpURLConnection.setDoInput(true);
      return localHttpURLConnection;
    }
  }

  private static void a(InputStream paramInputStream)
  {
    if (paramInputStream != null);
    try
    {
      paramInputStream.close();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private void a(String paramString1, int paramInt, String paramString2, l paraml)
  {
    this.b.d("ConnectionManager", paramInt + " received from from \"" + paramString2 + "\": " + paramString1);
    if ((paramInt >= 200) && (paramInt < 300))
    {
      JSONObject localJSONObject = new JSONObject();
      if ((paramInt != 204) && (paramString1 != null) && (paramString1.length() > 2))
        localJSONObject = new JSONObject(paramString1);
      paraml.a(localJSONObject, paramInt);
      return;
    }
    this.b.e("ConnectionManager", paramInt + " error received from \"" + paramString2 + "\"");
    paraml.a(paramInt);
  }

  private void a(String paramString1, String paramString2, int paramInt, long paramLong)
  {
    this.b.i("ConnectionManager", "Succesfull " + paramString1 + " returned " + paramInt + " in " + (float)(System.currentTimeMillis() - paramLong) / 1000.0F + " s" + " over " + m.a(this.a) + " to \"" + paramString2 + "\"");
  }

  private void a(String paramString1, String paramString2, int paramInt, long paramLong, Throwable paramThrowable)
  {
    this.b.e("ConnectionManager", "Failed " + paramString1 + " returned " + paramInt + " in " + (float)(System.currentTimeMillis() - paramLong) / 1000.0F + " s" + " over " + m.a(this.a) + " to \"" + paramString2 + "\"", paramThrowable);
  }

  private static void a(HttpURLConnection paramHttpURLConnection)
  {
    if (paramHttpURLConnection != null);
    try
    {
      paramHttpURLConnection.disconnect();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  void a(String paramString, int paramInt, l paraml)
  {
    a(paramString, "GET", paramInt, null, paraml);
  }

  void a(String paramString, l paraml)
  {
    a(paramString, -1, paraml);
  }

  // ERROR //
  void a(String paramString1, String paramString2, int paramInt, JSONObject paramJSONObject, l paraml)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aload_1
    //   4: ifnonnull +13 -> 17
    //   7: new 210	java/lang/IllegalArgumentException
    //   10: dup
    //   11: ldc 212
    //   13: invokespecial 213	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   16: athrow
    //   17: aload_2
    //   18: ifnonnull +13 -> 31
    //   21: new 210	java/lang/IllegalArgumentException
    //   24: dup
    //   25: ldc 215
    //   27: invokespecial 213	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   30: athrow
    //   31: aload 5
    //   33: ifnonnull +13 -> 46
    //   36: new 210	java/lang/IllegalArgumentException
    //   39: dup
    //   40: ldc 217
    //   42: invokespecial 213	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   45: athrow
    //   46: invokestatic 171	java/lang/System:currentTimeMillis	()J
    //   49: lstore 7
    //   51: iconst_0
    //   52: istore 9
    //   54: aload_0
    //   55: getfield 23	com/applovin/impl/sdk/k:b	Lcom/applovin/sdk/AppLovinLogger;
    //   58: ldc 114
    //   60: new 116	java/lang/StringBuilder
    //   63: dup
    //   64: invokespecial 117	java/lang/StringBuilder:<init>	()V
    //   67: ldc 219
    //   69: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: aload_2
    //   73: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: ldc 221
    //   78: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: aload_1
    //   82: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: ldc 223
    //   87: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: invokeinterface 189 3 0
    //   98: aload_0
    //   99: aload_1
    //   100: aload_2
    //   101: iload_3
    //   102: invokespecial 225	com/applovin/impl/sdk/k:a	(Ljava/lang/String;Ljava/lang/String;I)Ljava/net/HttpURLConnection;
    //   105: astore 13
    //   107: aload 13
    //   109: astore 11
    //   111: aload 4
    //   113: ifnull +112 -> 225
    //   116: aload 4
    //   118: invokevirtual 226	org/json/JSONObject:toString	()Ljava/lang/String;
    //   121: astore 18
    //   123: aload_0
    //   124: getfield 23	com/applovin/impl/sdk/k:b	Lcom/applovin/sdk/AppLovinLogger;
    //   127: ldc 114
    //   129: new 116	java/lang/StringBuilder
    //   132: dup
    //   133: invokespecial 117	java/lang/StringBuilder:<init>	()V
    //   136: ldc 228
    //   138: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: aload_1
    //   142: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: ldc 230
    //   147: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: aload 18
    //   152: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   158: invokeinterface 137 3 0
    //   163: aload 11
    //   165: ldc 232
    //   167: ldc 234
    //   169: invokevirtual 237	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   172: aload 11
    //   174: iconst_1
    //   175: invokevirtual 240	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   178: aload 11
    //   180: aload 18
    //   182: invokevirtual 244	java/lang/String:getBytes	()[B
    //   185: arraylength
    //   186: invokevirtual 247	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   189: new 249	java/io/PrintWriter
    //   192: dup
    //   193: new 251	java/io/OutputStreamWriter
    //   196: dup
    //   197: aload 11
    //   199: invokevirtual 255	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   202: ldc_w 257
    //   205: invokespecial 260	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   208: invokespecial 263	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
    //   211: astore 19
    //   213: aload 19
    //   215: aload 18
    //   217: invokevirtual 266	java/io/PrintWriter:print	(Ljava/lang/String;)V
    //   220: aload 19
    //   222: invokevirtual 267	java/io/PrintWriter:close	()V
    //   225: aload 11
    //   227: invokevirtual 270	java/net/HttpURLConnection:getResponseCode	()I
    //   230: istore 9
    //   232: aconst_null
    //   233: astore 6
    //   235: iload 9
    //   237: ifle +56 -> 293
    //   240: aload 11
    //   242: invokevirtual 274	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   245: astore 14
    //   247: aload 14
    //   249: invokestatic 277	com/applovin/impl/sdk/m:a	(Ljava/io/InputStream;)Ljava/lang/String;
    //   252: astore 16
    //   254: aload_0
    //   255: aload_2
    //   256: aload_1
    //   257: iload 9
    //   259: lload 7
    //   261: invokespecial 279	com/applovin/impl/sdk/k:a	(Ljava/lang/String;Ljava/lang/String;IJ)V
    //   264: aload_0
    //   265: aload 16
    //   267: aload 11
    //   269: invokevirtual 270	java/net/HttpURLConnection:getResponseCode	()I
    //   272: aload_1
    //   273: aload 5
    //   275: invokespecial 281	com/applovin/impl/sdk/k:a	(Ljava/lang/String;ILjava/lang/String;Lcom/applovin/impl/sdk/l;)V
    //   278: aload 14
    //   280: astore 17
    //   282: aload 17
    //   284: invokestatic 283	com/applovin/impl/sdk/k:a	(Ljava/io/InputStream;)V
    //   287: aload 11
    //   289: invokestatic 285	com/applovin/impl/sdk/k:a	(Ljava/net/HttpURLConnection;)V
    //   292: return
    //   293: aload_0
    //   294: aload_2
    //   295: aload_1
    //   296: iload 9
    //   298: lload 7
    //   300: aconst_null
    //   301: invokespecial 287	com/applovin/impl/sdk/k:a	(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/Throwable;)V
    //   304: aload 5
    //   306: iload 9
    //   308: invokeinterface 158 2 0
    //   313: aconst_null
    //   314: astore 17
    //   316: goto -34 -> 282
    //   319: astore 12
    //   321: aconst_null
    //   322: astore 11
    //   324: iload 9
    //   326: ifne +11 -> 337
    //   329: aload_0
    //   330: aload 12
    //   332: invokespecial 289	com/applovin/impl/sdk/k:a	(Ljava/lang/Throwable;)I
    //   335: istore 9
    //   337: aload_0
    //   338: aload_2
    //   339: aload_1
    //   340: iload 9
    //   342: lload 7
    //   344: aload 12
    //   346: invokespecial 287	com/applovin/impl/sdk/k:a	(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/Throwable;)V
    //   349: aload 5
    //   351: iload 9
    //   353: invokeinterface 158 2 0
    //   358: aload 6
    //   360: invokestatic 283	com/applovin/impl/sdk/k:a	(Ljava/io/InputStream;)V
    //   363: aload 11
    //   365: invokestatic 285	com/applovin/impl/sdk/k:a	(Ljava/net/HttpURLConnection;)V
    //   368: return
    //   369: astore 10
    //   371: aconst_null
    //   372: astore 11
    //   374: aload 6
    //   376: invokestatic 283	com/applovin/impl/sdk/k:a	(Ljava/io/InputStream;)V
    //   379: aload 11
    //   381: invokestatic 285	com/applovin/impl/sdk/k:a	(Ljava/net/HttpURLConnection;)V
    //   384: aload 10
    //   386: athrow
    //   387: astore 10
    //   389: goto -15 -> 374
    //   392: astore 10
    //   394: aload 14
    //   396: astore 6
    //   398: goto -24 -> 374
    //   401: astore 12
    //   403: aconst_null
    //   404: astore 6
    //   406: goto -82 -> 324
    //   409: astore 15
    //   411: aload 14
    //   413: astore 6
    //   415: aload 15
    //   417: astore 12
    //   419: goto -95 -> 324
    //
    // Exception table:
    //   from	to	target	type
    //   54	107	319	java/lang/Throwable
    //   54	107	369	finally
    //   116	225	387	finally
    //   225	232	387	finally
    //   240	247	387	finally
    //   293	313	387	finally
    //   329	337	387	finally
    //   337	358	387	finally
    //   247	278	392	finally
    //   116	225	401	java/lang/Throwable
    //   225	232	401	java/lang/Throwable
    //   240	247	401	java/lang/Throwable
    //   293	313	401	java/lang/Throwable
    //   247	278	409	java/lang/Throwable
  }

  void a(String paramString, JSONObject paramJSONObject, l paraml)
  {
    a(paramString, "PUT", -1, paramJSONObject, paraml);
  }

  void b(String paramString, JSONObject paramJSONObject, l paraml)
  {
    a(paramString, "POST", -1, paramJSONObject, paraml);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
