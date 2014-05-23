package com.applovin.impl.sdk;

import android.content.Context;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinLogger;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class av extends ar
{
  private static final Collection a = Arrays.asList(arrayOfCharacter);
  private static volatile int b = 0;
  private final JSONObject c;
  private final AppLovinAdLoadListener h;

  static
  {
    Character[] arrayOfCharacter = new Character[5];
    arrayOfCharacter[0] = Character.valueOf(')');
    arrayOfCharacter[1] = Character.valueOf(']');
    arrayOfCharacter[2] = Character.valueOf('"');
    arrayOfCharacter[3] = Character.valueOf('\'');
    arrayOfCharacter[4] = Character.valueOf(' ');
  }

  av(JSONObject paramJSONObject, AppLovinAdLoadListener paramAppLovinAdLoadListener, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    super("RenderAd", paramAppLovinSdkImpl);
    this.c = paramJSONObject;
    this.h = paramAppLovinAdLoadListener;
  }

  private String a(int paramInt)
  {
    if (paramInt == 0)
      return "click";
    return "click" + paramInt;
  }

  private String a(String paramString, Context paramContext)
  {
    be localbe = new be(paramString, this.f);
    localbe.a("click", "applovin://com.applovin.sdk/adservice/track_click");
    localbe.a("click.javascript", "javascript:window.applovin_sdk.execute('track_click')");
    String str = localbe.a();
    if (((Boolean)this.e.a(z.L)).booleanValue())
      return d(str);
    return str;
  }

  private String a(String paramString1, String paramString2)
  {
    File localFile = bg.a(paramString2, this.e.getApplicationContext());
    if (localFile.exists())
    {
      this.f.d(this.d, "Loaded " + paramString2 + " from cache: file://" + localFile.getAbsolutePath());
      return "file://" + localFile.getAbsolutePath();
    }
    if (a(localFile, paramString1 + paramString2))
      return "file://" + localFile.getAbsolutePath();
    return null;
  }

  private String a(String paramString, Map paramMap)
  {
    be localbe = new be(paramString, this.f);
    localbe.a(paramMap);
    String str = localbe.a();
    if (((Boolean)this.e.a(z.L)).booleanValue())
      return d(str);
    return str;
  }

  @Deprecated
  private List a(String paramString)
  {
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(paramString);
    return localArrayList;
  }

  private List a(JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new ArrayList(paramJSONArray.length());
    for (int i = 0; i < paramJSONArray.length(); i++)
      localArrayList.add(paramJSONArray.getString(i));
    return localArrayList;
  }

  private Map a(List paramList)
  {
    HashMap localHashMap = new HashMap(paramList.size());
    for (int i = 0; i < paramList.size(); i++)
      localHashMap.put(a(i), paramList.get(i));
    return localHashMap;
  }

  private void a(JSONObject paramJSONObject)
  {
    String str1 = paramJSONObject.getString("html");
    AppLovinAdSize localAppLovinAdSize;
    List localList;
    String str2;
    String str3;
    AppLovinAdInternal.AdTarget localAdTarget;
    if (paramJSONObject.has("size"))
    {
      localAppLovinAdSize = AppLovinAdSize.fromString(paramJSONObject.getString("size"));
      if ((str1 == null) || (str1.length() <= 0))
        break label277;
      if (!paramJSONObject.has("redirect_urls"))
        break label240;
      localList = a((JSONArray)paramJSONObject.get("redirect_urls"));
      boolean bool1 = paramJSONObject.has("video");
      str2 = null;
      if (bool1)
      {
        String str5 = paramJSONObject.getString("video");
        str2 = null;
        if (str5 != null)
        {
          boolean bool2 = str5.isEmpty();
          str2 = null;
          if (!bool2)
            str2 = e(str5);
        }
      }
      str3 = a(str1, a(localList));
      if (!paramJSONObject.has("ad_target"))
        break label261;
      localAdTarget = AppLovinAdInternal.AdTarget.valueOf(paramJSONObject.getString("ad_target").toUpperCase());
      label152: if (!paramJSONObject.has("ad_type"))
        break label269;
    }
    label261: label269: for (AppLovinAdType localAppLovinAdType = AppLovinAdType.fromString(paramJSONObject.getString("ad_type").toUpperCase()); ; localAppLovinAdType = AppLovinAdType.REGULAR)
    {
      String str4 = "-1";
      if (paramJSONObject.has("ad_id"))
        str4 = paramJSONObject.getString("ad_id");
      AppLovinAdInternal localAppLovinAdInternal = new AppLovinAdInternal(str3, localAppLovinAdSize, localAppLovinAdType, localList, str2, localAdTarget, str4);
      localAppLovinAdInternal.setCompatibilityLevel(AppLovinAdInternal.ApiCompatibilityLevel.AdServerApi20);
      a(localAppLovinAdInternal);
      return;
      localAppLovinAdSize = AppLovinAdSize.BANNER;
      break;
      label240: this.f.e(this.d, "Ad server has not returned a redirect URL");
      b();
      return;
      localAdTarget = AppLovinAdInternal.AdTarget.DEFAULT;
      break label152;
    }
    label277: this.f.e(this.d, "No HTML received for requested ad");
    b();
  }

  // ERROR //
  private boolean a(File paramFile, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: getfield 66	com/applovin/impl/sdk/av:f	Lcom/applovin/sdk/AppLovinLogger;
    //   6: aload_0
    //   7: getfield 123	com/applovin/impl/sdk/av:d	Ljava/lang/String;
    //   10: new 46	java/lang/StringBuilder
    //   13: dup
    //   14: invokespecial 48	java/lang/StringBuilder:<init>	()V
    //   17: ldc_w 289
    //   20: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: aload_2
    //   24: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: ldc_w 291
    //   30: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: aload_1
    //   34: invokevirtual 295	java/io/File:getAbsoluteFile	()Ljava/io/File;
    //   37: invokevirtual 298	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   40: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   43: invokeinterface 134 3 0
    //   48: new 300	java/io/FileOutputStream
    //   51: dup
    //   52: aload_1
    //   53: invokespecial 303	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   56: astore 4
    //   58: new 305	java/net/URL
    //   61: dup
    //   62: aload_2
    //   63: invokespecial 308	java/net/URL:<init>	(Ljava/lang/String;)V
    //   66: invokevirtual 312	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   69: checkcast 314	java/net/HttpURLConnection
    //   72: astore 15
    //   74: aload 15
    //   76: aload_0
    //   77: getfield 84	com/applovin/impl/sdk/av:e	Lcom/applovin/impl/sdk/AppLovinSdkImpl;
    //   80: getstatic 317	com/applovin/impl/sdk/z:v	Lcom/applovin/impl/sdk/ab;
    //   83: invokevirtual 95	com/applovin/impl/sdk/AppLovinSdkImpl:a	(Lcom/applovin/impl/sdk/ab;)Ljava/lang/Object;
    //   86: checkcast 319	java/lang/Integer
    //   89: invokevirtual 322	java/lang/Integer:intValue	()I
    //   92: invokevirtual 325	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   95: aload 15
    //   97: aload_0
    //   98: getfield 84	com/applovin/impl/sdk/av:e	Lcom/applovin/impl/sdk/AppLovinSdkImpl;
    //   101: getstatic 328	com/applovin/impl/sdk/z:w	Lcom/applovin/impl/sdk/ab;
    //   104: invokevirtual 95	com/applovin/impl/sdk/AppLovinSdkImpl:a	(Lcom/applovin/impl/sdk/ab;)Ljava/lang/Object;
    //   107: checkcast 319	java/lang/Integer
    //   110: invokevirtual 322	java/lang/Integer:intValue	()I
    //   113: invokevirtual 331	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   116: aload 15
    //   118: iconst_1
    //   119: invokevirtual 335	java/net/HttpURLConnection:setDefaultUseCaches	(Z)V
    //   122: aload 15
    //   124: iconst_1
    //   125: invokevirtual 338	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   128: aload 15
    //   130: iconst_0
    //   131: invokevirtual 341	java/net/HttpURLConnection:setAllowUserInteraction	(Z)V
    //   134: aload 15
    //   136: iconst_1
    //   137: invokevirtual 344	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   140: aload 15
    //   142: invokevirtual 348	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   145: astore_3
    //   146: sipush 1024
    //   149: newarray byte
    //   151: astore 18
    //   153: aload_3
    //   154: aload 18
    //   156: iconst_0
    //   157: aload 18
    //   159: arraylength
    //   160: invokevirtual 354	java/io/InputStream:read	([BII)I
    //   163: istore 19
    //   165: iload 19
    //   167: iflt +114 -> 281
    //   170: aload 4
    //   172: aload 18
    //   174: iconst_0
    //   175: iload 19
    //   177: invokevirtual 360	java/io/OutputStream:write	([BII)V
    //   180: goto -27 -> 153
    //   183: astore 17
    //   185: aload 4
    //   187: astore 6
    //   189: aload 17
    //   191: astore 5
    //   193: aload 15
    //   195: astore 7
    //   197: aload_0
    //   198: getfield 66	com/applovin/impl/sdk/av:f	Lcom/applovin/sdk/AppLovinLogger;
    //   201: aload_0
    //   202: getfield 123	com/applovin/impl/sdk/av:d	Ljava/lang/String;
    //   205: new 46	java/lang/StringBuilder
    //   208: dup
    //   209: invokespecial 48	java/lang/StringBuilder:<init>	()V
    //   212: ldc_w 362
    //   215: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: aload_2
    //   219: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: ldc_w 364
    //   225: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: aload_1
    //   229: invokevirtual 130	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   232: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: ldc_w 366
    //   238: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   244: aload 5
    //   246: invokeinterface 369 4 0
    //   251: aload_3
    //   252: ifnull +7 -> 259
    //   255: aload_3
    //   256: invokevirtual 372	java/io/InputStream:close	()V
    //   259: aload 6
    //   261: ifnull +8 -> 269
    //   264: aload 6
    //   266: invokevirtual 373	java/io/OutputStream:close	()V
    //   269: aload 7
    //   271: ifnull +8 -> 279
    //   274: aload 7
    //   276: invokevirtual 376	java/net/HttpURLConnection:disconnect	()V
    //   279: iconst_0
    //   280: ireturn
    //   281: aload 4
    //   283: invokevirtual 379	java/io/OutputStream:flush	()V
    //   286: aload_0
    //   287: getfield 66	com/applovin/impl/sdk/av:f	Lcom/applovin/sdk/AppLovinLogger;
    //   290: aload_0
    //   291: getfield 123	com/applovin/impl/sdk/av:d	Ljava/lang/String;
    //   294: new 46	java/lang/StringBuilder
    //   297: dup
    //   298: invokespecial 48	java/lang/StringBuilder:<init>	()V
    //   301: ldc_w 381
    //   304: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: aload_1
    //   308: invokevirtual 298	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   311: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   314: invokeinterface 134 3 0
    //   319: aload_3
    //   320: ifnull +7 -> 327
    //   323: aload_3
    //   324: invokevirtual 372	java/io/InputStream:close	()V
    //   327: aload 4
    //   329: ifnull +8 -> 337
    //   332: aload 4
    //   334: invokevirtual 373	java/io/OutputStream:close	()V
    //   337: aload 15
    //   339: ifnull +8 -> 347
    //   342: aload 15
    //   344: invokevirtual 376	java/net/HttpURLConnection:disconnect	()V
    //   347: iconst_1
    //   348: ireturn
    //   349: astore 8
    //   351: aconst_null
    //   352: astore 7
    //   354: aconst_null
    //   355: astore 4
    //   357: aload_3
    //   358: ifnull +7 -> 365
    //   361: aload_3
    //   362: invokevirtual 372	java/io/InputStream:close	()V
    //   365: aload 4
    //   367: ifnull +8 -> 375
    //   370: aload 4
    //   372: invokevirtual 373	java/io/OutputStream:close	()V
    //   375: aload 7
    //   377: ifnull +8 -> 385
    //   380: aload 7
    //   382: invokevirtual 376	java/net/HttpURLConnection:disconnect	()V
    //   385: aload 8
    //   387: athrow
    //   388: astore 22
    //   390: goto -63 -> 327
    //   393: astore 21
    //   395: goto -58 -> 337
    //   398: astore 20
    //   400: goto -53 -> 347
    //   403: astore 14
    //   405: goto -146 -> 259
    //   408: astore 13
    //   410: goto -141 -> 269
    //   413: astore 12
    //   415: goto -136 -> 279
    //   418: astore 11
    //   420: goto -55 -> 365
    //   423: astore 10
    //   425: goto -50 -> 375
    //   428: astore 9
    //   430: goto -45 -> 385
    //   433: astore 8
    //   435: aconst_null
    //   436: astore 7
    //   438: aconst_null
    //   439: astore_3
    //   440: goto -83 -> 357
    //   443: astore 16
    //   445: aload 15
    //   447: astore 7
    //   449: aload 16
    //   451: astore 8
    //   453: goto -96 -> 357
    //   456: astore 8
    //   458: aload 6
    //   460: astore 4
    //   462: goto -105 -> 357
    //   465: astore 5
    //   467: aconst_null
    //   468: astore 7
    //   470: aconst_null
    //   471: astore 6
    //   473: aconst_null
    //   474: astore_3
    //   475: goto -278 -> 197
    //   478: astore 5
    //   480: aload 4
    //   482: astore 6
    //   484: aconst_null
    //   485: astore 7
    //   487: aconst_null
    //   488: astore_3
    //   489: goto -292 -> 197
    //
    // Exception table:
    //   from	to	target	type
    //   74	153	183	java/io/IOException
    //   153	165	183	java/io/IOException
    //   170	180	183	java/io/IOException
    //   281	319	183	java/io/IOException
    //   48	58	349	finally
    //   323	327	388	java/lang/Exception
    //   332	337	393	java/lang/Exception
    //   342	347	398	java/lang/Exception
    //   255	259	403	java/lang/Exception
    //   264	269	408	java/lang/Exception
    //   274	279	413	java/lang/Exception
    //   361	365	418	java/lang/Exception
    //   370	375	423	java/lang/Exception
    //   380	385	428	java/lang/Exception
    //   58	74	433	finally
    //   74	153	443	finally
    //   153	165	443	finally
    //   170	180	443	finally
    //   281	319	443	finally
    //   197	251	456	finally
    //   48	58	465	java/io/IOException
    //   58	74	478	java/io/IOException
  }

  private String b(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      if (paramString.contains("#"))
        return paramString;
      return paramString + "#sdk_version_" + "5.2.2-5.2.2";
    }
    return "";
  }

  private void b(JSONObject paramJSONObject)
  {
    String str1 = paramJSONObject.getString("html");
    AppLovinAdSize localAppLovinAdSize;
    String str2;
    label60: String str3;
    String str4;
    String str5;
    AppLovinAdInternal.AdTarget localAdTarget;
    if (paramJSONObject.has("size"))
    {
      localAppLovinAdSize = AppLovinAdSize.fromString(paramJSONObject.getString("size"));
      if ((str1 == null) || (str1.length() <= 0))
        break label351;
      if (!paramJSONObject.has("clcode"))
        break label271;
      str2 = c(paramJSONObject.getString("clcode"));
      if (!paramJSONObject.has("redirect_url"))
        break label314;
      str3 = b(paramJSONObject.getString("redirect_url"));
      boolean bool1 = paramJSONObject.has("video");
      str4 = null;
      if (bool1)
      {
        String str7 = paramJSONObject.getString("video");
        str4 = null;
        if (str7 != null)
        {
          boolean bool2 = str7.isEmpty();
          str4 = null;
          if (!bool2)
            str4 = e(str7);
        }
      }
      str5 = a(str1, this.g);
      if (!paramJSONObject.has("ad_target"))
        break label335;
      localAdTarget = AppLovinAdInternal.AdTarget.valueOf(paramJSONObject.getString("ad_target").toUpperCase());
      label172: if (!paramJSONObject.has("ad_type"))
        break label343;
    }
    label271: label314: label335: label343: for (AppLovinAdType localAppLovinAdType = AppLovinAdType.fromString(paramJSONObject.getString("ad_type").toUpperCase()); ; localAppLovinAdType = AppLovinAdType.REGULAR)
    {
      String str6 = "-1";
      if (paramJSONObject.has("ad_id"))
        str6 = paramJSONObject.getString("ad_id");
      AppLovinAdInternal localAppLovinAdInternal = new AppLovinAdInternal(str5, localAppLovinAdSize, localAppLovinAdType, a(str3), str4, localAdTarget, str6);
      localAppLovinAdInternal.setClickTrackerUrl(str2);
      localAppLovinAdInternal.setCompatibilityLevel(AppLovinAdInternal.ApiCompatibilityLevel.AdServerApi10);
      a(localAppLovinAdInternal);
      return;
      localAppLovinAdSize = AppLovinAdSize.BANNER;
      break;
      if (paramJSONObject.has("click_url"))
      {
        str2 = paramJSONObject.getString("click_url");
        break label60;
      }
      this.f.e(this.d, "Ad server has not returned a clcode or click URL");
      b();
      return;
      this.f.e(this.d, "Ad server has not returned a redirect URL");
      b();
      return;
      localAdTarget = AppLovinAdInternal.AdTarget.DEFAULT;
      break label172;
    }
    label351: this.f.e(this.d, "No HTML received for requested ad");
    b();
  }

  private String c(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer(m.b("click", this.e));
    localStringBuffer.append("?");
    localStringBuffer.append("clcode=").append(paramString);
    localStringBuffer.append("&sdk_version=").append("5.2.2-5.2.2");
    return localStringBuffer.toString();
  }

  private String d(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer(paramString);
    String[] arrayOfString = ((String)this.e.a(z.M)).split(",");
    int i = arrayOfString.length;
    int j = 0;
    if (j < i)
    {
      String str1 = arrayOfString[j];
      int k = 0;
      int m = 0;
      while (true)
      {
        if (m < localStringBuffer.length())
        {
          m = localStringBuffer.indexOf(str1, k);
          if (m != -1);
        }
        else
        {
          j++;
          break;
        }
        int n = localStringBuffer.length();
        for (k = m; (!a.contains(Character.valueOf(localStringBuffer.charAt(k)))) && (k < n); k++);
        if ((k > m) && (k != n))
        {
          String str2 = a(str1, localStringBuffer.substring(m + str1.length(), k));
          if (str2 != null)
            localStringBuffer.replace(m, k, str2);
        }
        else
        {
          System.out.println("HTML is bad");
        }
      }
    }
    return localStringBuffer.toString();
  }

  private String e(String paramString)
  {
    String str1 = paramString.substring(1 + paramString.lastIndexOf("."), paramString.length());
    String str2 = "al_video_" + b + str1;
    File localFile = bg.a(str2, this.e.getApplicationContext());
    localFile.delete();
    if (a(localFile, paramString))
    {
      b = (1 + b) % 2;
      return str2;
    }
    return null;
  }

  protected void a(AppLovinAd paramAppLovinAd)
  {
    if (this.h != null)
      this.h.adReceived(paramAppLovinAd);
    ae localae = this.e.b();
    localae.a("ad_dsp");
    localae.a("ad_dsp_session");
  }

  protected void b()
  {
    try
    {
      if (this.h != null)
        this.h.failedToReceiveAd(-6);
      return;
    }
    catch (Throwable localThrowable)
    {
      this.f.e(this.d, "Unable process a failure to recieve an ad", localThrowable);
    }
  }

  public void run()
  {
    this.f.d(this.d, "Rendering ad...");
    try
    {
      if (this.c.has("redirect_urls"))
      {
        a(this.c);
        return;
      }
      b(this.c);
      return;
    }
    catch (JSONException localJSONException)
    {
      this.f.e(this.d, "Unable to parse ad service response", localJSONException);
      b();
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      this.f.e(this.d, "Ad response is not valid", localIllegalArgumentException);
      b();
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.av
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
