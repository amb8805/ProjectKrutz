package com.facebook;

import com.facebook.internal.ad;
import com.facebook.internal.b;
import com.facebook.internal.u;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObject.Factory;
import com.facebook.model.GraphObjectList;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class t
{
  private static b h;
  private final HttpURLConnection b;
  private final GraphObject c;
  private final GraphObjectList<GraphObject> d;
  private final boolean e;
  private final FacebookRequestError f;
  private final Request g;

  static
  {
    if (!t.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      a = bool;
      return;
    }
  }

  t(Request paramRequest, HttpURLConnection paramHttpURLConnection, FacebookRequestError paramFacebookRequestError)
  {
    this.g = paramRequest;
    this.b = paramHttpURLConnection;
    this.c = null;
    this.d = null;
    this.e = false;
    this.f = paramFacebookRequestError;
  }

  t(Request paramRequest, HttpURLConnection paramHttpURLConnection, GraphObject paramGraphObject, boolean paramBoolean)
  {
    this.g = paramRequest;
    this.b = paramHttpURLConnection;
    this.c = paramGraphObject;
    this.d = null;
    this.e = paramBoolean;
    this.f = null;
  }

  private t(Request paramRequest, HttpURLConnection paramHttpURLConnection, GraphObjectList<GraphObject> paramGraphObjectList, boolean paramBoolean)
  {
    this.g = paramRequest;
    this.b = paramHttpURLConnection;
    this.c = null;
    this.d = paramGraphObjectList;
    this.e = paramBoolean;
    this.f = null;
  }

  private static List<t> a(InputStream paramInputStream, HttpURLConnection paramHttpURLConnection, r paramr, boolean paramBoolean)
  {
    String str = ad.a(paramInputStream);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(str.length());
    arrayOfObject[1] = str;
    u.b();
    return a(str, paramHttpURLConnection, paramr, paramBoolean);
  }

  static List<t> a(String paramString, HttpURLConnection paramHttpURLConnection, r paramr, boolean paramBoolean)
  {
    List localList = a(paramHttpURLConnection, paramr, new JSONTokener(paramString).nextValue(), paramBoolean);
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramr.b();
    arrayOfObject[1] = Integer.valueOf(paramString.length());
    arrayOfObject[2] = localList;
    u.b();
    return localList;
  }

  // ERROR //
  static List<t> a(HttpURLConnection paramHttpURLConnection, r paramr)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: instanceof 108
    //   6: ifeq +512 -> 518
    //   9: aload_1
    //   10: checkcast 108	com/facebook/internal/a
    //   13: astore 25
    //   15: getstatic 110	com/facebook/t:h	Lcom/facebook/internal/b;
    //   18: ifnonnull +34 -> 52
    //   21: invokestatic 116	com/facebook/Session:i	()Landroid/content/Context;
    //   24: astore 40
    //   26: aload 40
    //   28: ifnull +24 -> 52
    //   31: new 118	com/facebook/internal/b
    //   34: dup
    //   35: aload 40
    //   37: ldc 120
    //   39: new 122	com/facebook/internal/f
    //   42: dup
    //   43: invokespecial 123	com/facebook/internal/f:<init>	()V
    //   46: invokespecial 126	com/facebook/internal/b:<init>	(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/f;)V
    //   49: putstatic 110	com/facebook/t:h	Lcom/facebook/internal/b;
    //   52: getstatic 110	com/facebook/t:h	Lcom/facebook/internal/b;
    //   55: astore 26
    //   57: aload 25
    //   59: invokevirtual 128	com/facebook/internal/a:g	()Ljava/lang/String;
    //   62: astore 27
    //   64: aload 27
    //   66: invokestatic 131	com/facebook/internal/ad:a	(Ljava/lang/String;)Z
    //   69: ifeq +21 -> 90
    //   72: aload_1
    //   73: invokevirtual 134	com/facebook/r:size	()I
    //   76: iconst_1
    //   77: if_icmpne +67 -> 144
    //   80: aload_1
    //   81: iconst_0
    //   82: invokevirtual 137	com/facebook/r:a	(I)Lcom/facebook/Request;
    //   85: invokevirtual 141	com/facebook/Request:d	()Ljava/lang/String;
    //   88: astore 27
    //   90: aload 25
    //   92: invokevirtual 143	com/facebook/internal/a:h	()Z
    //   95: ifne +410 -> 505
    //   98: aload 26
    //   100: ifnull +405 -> 505
    //   103: aload 27
    //   105: invokestatic 131	com/facebook/internal/ad:a	(Ljava/lang/String;)Z
    //   108: ifne +397 -> 505
    //   111: aload 26
    //   113: aload 27
    //   115: aconst_null
    //   116: invokevirtual 146	com/facebook/internal/b:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    //   119: astore 35
    //   121: aload 35
    //   123: astore_2
    //   124: aload_2
    //   125: ifnull +29 -> 154
    //   128: aload_2
    //   129: aconst_null
    //   130: aload_1
    //   131: iconst_1
    //   132: invokestatic 148	com/facebook/t:a	(Ljava/io/InputStream;Ljava/net/HttpURLConnection;Lcom/facebook/r;Z)Ljava/util/List;
    //   135: astore 38
    //   137: aload_2
    //   138: invokestatic 151	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   141: aload 38
    //   143: areturn
    //   144: getstatic 92	com/facebook/LoggingBehavior:a	Lcom/facebook/LoggingBehavior;
    //   147: pop
    //   148: invokestatic 153	com/facebook/internal/u:a	()V
    //   151: goto -61 -> 90
    //   154: aload_2
    //   155: invokestatic 151	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   158: aload 26
    //   160: astore_3
    //   161: aload 27
    //   163: astore 36
    //   165: aload_2
    //   166: astore 4
    //   168: aload 36
    //   170: astore 5
    //   172: aload_0
    //   173: invokevirtual 158	java/net/HttpURLConnection:getResponseCode	()I
    //   176: sipush 400
    //   179: if_icmplt +106 -> 285
    //   182: aload_0
    //   183: invokevirtual 162	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   186: astore 4
    //   188: aload 4
    //   190: aload_0
    //   191: aload_1
    //   192: iconst_0
    //   193: invokestatic 148	com/facebook/t:a	(Ljava/io/InputStream;Ljava/net/HttpURLConnection;Lcom/facebook/r;Z)Ljava/util/List;
    //   196: astore 24
    //   198: aload 4
    //   200: invokestatic 151	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   203: aload 24
    //   205: areturn
    //   206: astore 33
    //   208: aconst_null
    //   209: astore 34
    //   211: aload 34
    //   213: invokestatic 151	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   216: aload 27
    //   218: astore 5
    //   220: aload 34
    //   222: astore 4
    //   224: aload 26
    //   226: astore_3
    //   227: goto -55 -> 172
    //   230: astore 31
    //   232: aload_2
    //   233: invokestatic 151	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   236: aload 26
    //   238: astore_3
    //   239: aload 27
    //   241: astore 32
    //   243: aload_2
    //   244: astore 4
    //   246: aload 32
    //   248: astore 5
    //   250: goto -78 -> 172
    //   253: astore 29
    //   255: aload_2
    //   256: invokestatic 151	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   259: aload 26
    //   261: astore_3
    //   262: aload 27
    //   264: astore 30
    //   266: aload_2
    //   267: astore 4
    //   269: aload 30
    //   271: astore 5
    //   273: goto -101 -> 172
    //   276: astore 28
    //   278: aload_2
    //   279: invokestatic 151	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   282: aload 28
    //   284: athrow
    //   285: aload_0
    //   286: invokevirtual 165	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   289: astore 4
    //   291: aload_3
    //   292: ifnull -104 -> 188
    //   295: aload 5
    //   297: ifnull -109 -> 188
    //   300: aload 4
    //   302: ifnull -114 -> 188
    //   305: aload_3
    //   306: aload 5
    //   308: aload 4
    //   310: invokevirtual 168	com/facebook/internal/b:a	(Ljava/lang/String;Ljava/io/InputStream;)Ljava/io/InputStream;
    //   313: astore 23
    //   315: aload 23
    //   317: astore 4
    //   319: goto -131 -> 188
    //   322: astore 19
    //   324: getstatic 92	com/facebook/LoggingBehavior:a	Lcom/facebook/LoggingBehavior;
    //   327: pop
    //   328: iconst_1
    //   329: anewarray 4	java/lang/Object
    //   332: dup
    //   333: iconst_0
    //   334: aload 19
    //   336: aastore
    //   337: pop
    //   338: invokestatic 75	com/facebook/internal/u:b	()V
    //   341: aload_1
    //   342: aload_0
    //   343: aload 19
    //   345: invokestatic 171	com/facebook/t:a	(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)Ljava/util/List;
    //   348: astore 22
    //   350: aload 4
    //   352: invokestatic 151	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   355: aload 22
    //   357: areturn
    //   358: astore 15
    //   360: getstatic 92	com/facebook/LoggingBehavior:a	Lcom/facebook/LoggingBehavior;
    //   363: pop
    //   364: iconst_1
    //   365: anewarray 4	java/lang/Object
    //   368: dup
    //   369: iconst_0
    //   370: aload 15
    //   372: aastore
    //   373: pop
    //   374: invokestatic 75	com/facebook/internal/u:b	()V
    //   377: aload_1
    //   378: aload_0
    //   379: new 100	com/facebook/FacebookException
    //   382: dup
    //   383: aload 15
    //   385: invokespecial 174	com/facebook/FacebookException:<init>	(Ljava/lang/Throwable;)V
    //   388: invokestatic 171	com/facebook/t:a	(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)Ljava/util/List;
    //   391: astore 18
    //   393: aload 4
    //   395: invokestatic 151	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   398: aload 18
    //   400: areturn
    //   401: astore 11
    //   403: getstatic 92	com/facebook/LoggingBehavior:a	Lcom/facebook/LoggingBehavior;
    //   406: pop
    //   407: iconst_1
    //   408: anewarray 4	java/lang/Object
    //   411: dup
    //   412: iconst_0
    //   413: aload 11
    //   415: aastore
    //   416: pop
    //   417: invokestatic 75	com/facebook/internal/u:b	()V
    //   420: aload_1
    //   421: aload_0
    //   422: new 100	com/facebook/FacebookException
    //   425: dup
    //   426: aload 11
    //   428: invokespecial 174	com/facebook/FacebookException:<init>	(Ljava/lang/Throwable;)V
    //   431: invokestatic 171	com/facebook/t:a	(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)Ljava/util/List;
    //   434: astore 14
    //   436: aload 4
    //   438: invokestatic 151	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   441: aload 14
    //   443: areturn
    //   444: astore 7
    //   446: getstatic 92	com/facebook/LoggingBehavior:a	Lcom/facebook/LoggingBehavior;
    //   449: pop
    //   450: iconst_1
    //   451: anewarray 4	java/lang/Object
    //   454: dup
    //   455: iconst_0
    //   456: aload 7
    //   458: aastore
    //   459: pop
    //   460: invokestatic 75	com/facebook/internal/u:b	()V
    //   463: aload_1
    //   464: aload_0
    //   465: new 100	com/facebook/FacebookException
    //   468: dup
    //   469: aload 7
    //   471: invokespecial 174	com/facebook/FacebookException:<init>	(Ljava/lang/Throwable;)V
    //   474: invokestatic 171	com/facebook/t:a	(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)Ljava/util/List;
    //   477: astore 10
    //   479: aload 4
    //   481: invokestatic 151	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   484: aload 10
    //   486: areturn
    //   487: astore 6
    //   489: aload 4
    //   491: invokestatic 151	com/facebook/internal/ad:a	(Ljava/io/Closeable;)V
    //   494: aload 6
    //   496: athrow
    //   497: astore 37
    //   499: aload_2
    //   500: astore 34
    //   502: goto -291 -> 211
    //   505: aload 26
    //   507: astore_3
    //   508: aload 27
    //   510: astore 5
    //   512: aconst_null
    //   513: astore 4
    //   515: goto -343 -> 172
    //   518: aconst_null
    //   519: astore_3
    //   520: aconst_null
    //   521: astore 4
    //   523: aconst_null
    //   524: astore 5
    //   526: goto -354 -> 172
    //
    // Exception table:
    //   from	to	target	type
    //   111	121	206	com/facebook/FacebookException
    //   111	121	230	org/json/JSONException
    //   128	137	230	org/json/JSONException
    //   111	121	253	java/io/IOException
    //   128	137	253	java/io/IOException
    //   111	121	276	finally
    //   128	137	276	finally
    //   172	188	322	com/facebook/FacebookException
    //   188	198	322	com/facebook/FacebookException
    //   285	291	322	com/facebook/FacebookException
    //   305	315	322	com/facebook/FacebookException
    //   172	188	358	org/json/JSONException
    //   188	198	358	org/json/JSONException
    //   285	291	358	org/json/JSONException
    //   305	315	358	org/json/JSONException
    //   172	188	401	java/io/IOException
    //   188	198	401	java/io/IOException
    //   285	291	401	java/io/IOException
    //   305	315	401	java/io/IOException
    //   172	188	444	java/lang/SecurityException
    //   188	198	444	java/lang/SecurityException
    //   285	291	444	java/lang/SecurityException
    //   305	315	444	java/lang/SecurityException
    //   172	188	487	finally
    //   188	198	487	finally
    //   285	291	487	finally
    //   305	315	487	finally
    //   324	350	487	finally
    //   360	393	487	finally
    //   403	436	487	finally
    //   446	479	487	finally
    //   128	137	497	com/facebook/FacebookException
  }

  private static List<t> a(HttpURLConnection paramHttpURLConnection, List<Request> paramList, Object paramObject, boolean paramBoolean)
  {
    if ((!a) && (paramHttpURLConnection == null) && (!paramBoolean))
      throw new AssertionError();
    int i = paramList.size();
    ArrayList localArrayList = new ArrayList(i);
    Request localRequest2;
    Object localObject1;
    if (i == 1)
    {
      localRequest2 = (Request)paramList.get(0);
      try
      {
        JSONObject localJSONObject2 = new JSONObject();
        localJSONObject2.put("body", paramObject);
        if (paramHttpURLConnection != null);
        for (k = paramHttpURLConnection.getResponseCode(); ; k = 200)
        {
          localJSONObject2.put("code", k);
          localObject1 = new JSONArray();
          ((JSONArray)localObject1).put(localJSONObject2);
          if (((localObject1 instanceof JSONArray)) && (((JSONArray)localObject1).length() == i))
            break;
          throw new FacebookException("Unexpected number of results");
        }
      }
      catch (JSONException localJSONException2)
      {
        while (true)
        {
          localArrayList.add(new t(localRequest2, paramHttpURLConnection, new FacebookRequestError(paramHttpURLConnection, localJSONException2)));
          localObject1 = paramObject;
        }
      }
      catch (IOException localIOException)
      {
        localArrayList.add(new t(localRequest2, paramHttpURLConnection, new FacebookRequestError(paramHttpURLConnection, localIOException)));
      }
    }
    else
    {
      while (true)
      {
        int k;
        localObject1 = paramObject;
      }
    }
    JSONArray localJSONArray = (JSONArray)localObject1;
    label559: for (int j = 0; ; j++)
    {
      if (j < localJSONArray.length())
      {
        Request localRequest1 = (Request)paramList.get(j);
        Object localObject2;
        try
        {
          localObject2 = localJSONArray.get(j);
          if ((localObject2 instanceof JSONObject))
          {
            JSONObject localJSONObject1 = (JSONObject)localObject2;
            FacebookRequestError localFacebookRequestError = FacebookRequestError.a(localJSONObject1, paramObject, paramHttpURLConnection);
            if (localFacebookRequestError != null)
              if (localFacebookRequestError.b() == 190)
              {
                localSession = localRequest1.b();
                if (localSession != null)
                  localSession.g();
              }
            for (localt = new t(localRequest1, paramHttpURLConnection, localFacebookRequestError); ; localt = new t(localRequest1, paramHttpURLConnection, GraphObject.Factory.create((JSONObject)localObject3), paramBoolean))
            {
              localArrayList.add(localt);
              break label559;
              localObject3 = ad.a(localJSONObject1, "body", "FACEBOOK_NON_JSON_RESULT");
              if (!(localObject3 instanceof JSONObject))
                break;
            }
          }
        }
        catch (JSONException localJSONException1)
        {
          while (true)
          {
            localArrayList.add(new t(localRequest1, paramHttpURLConnection, new FacebookRequestError(paramHttpURLConnection, localJSONException1)));
            break label559;
            if (!(localObject3 instanceof JSONArray))
              break;
            localt = new t(localRequest1, paramHttpURLConnection, GraphObject.Factory.createList((JSONArray)localObject3, GraphObject.class), paramBoolean);
          }
        }
        catch (FacebookException localFacebookException)
        {
          localArrayList.add(new t(localRequest1, paramHttpURLConnection, new FacebookRequestError(paramHttpURLConnection, localFacebookException)));
        }
        while (true)
        {
          Session localSession;
          Object localObject3;
          localObject2 = JSONObject.NULL;
          if (localObject2 != JSONObject.NULL)
            break;
          t localt = new t(localRequest1, paramHttpURLConnection, null, paramBoolean);
        }
        throw new FacebookException("Got unexpected object type in response, class: " + localObject2.getClass().getSimpleName());
      }
      return localArrayList;
    }
  }

  static List<t> a(List<Request> paramList, HttpURLConnection paramHttpURLConnection, FacebookException paramFacebookException)
  {
    int i = paramList.size();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++)
      localArrayList.add(new t((Request)paramList.get(j), paramHttpURLConnection, new FacebookRequestError(paramHttpURLConnection, paramFacebookException)));
    return localArrayList;
  }

  public final FacebookRequestError a()
  {
    return this.f;
  }

  public final <T extends GraphObject> T a(Class<T> paramClass)
  {
    if (this.c == null)
      return null;
    return this.c.cast(paramClass);
  }

  public final GraphObject b()
  {
    return this.c;
  }

  public String toString()
  {
    try
    {
      Object[] arrayOfObject = new Object[1];
      if (this.b != null);
      for (int i = this.b.getResponseCode(); ; i = 200)
      {
        arrayOfObject[0] = Integer.valueOf(i);
        String str2 = String.format("%d", arrayOfObject);
        str1 = str2;
        return "{Response:  responseCode: " + str1 + ", graphObject: " + this.c + ", error: " + this.f + ", isFromCache:" + this.e + "}";
      }
    }
    catch (IOException localIOException)
    {
      while (true)
        String str1 = "unknown";
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
