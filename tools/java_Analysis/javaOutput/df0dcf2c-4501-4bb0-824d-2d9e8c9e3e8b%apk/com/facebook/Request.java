package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.internal.ad;
import com.facebook.internal.af;
import com.facebook.internal.u;
import com.facebook.internal.y;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class Request
{
  private static String a;
  private static volatile String n;
  private Session b;
  private HttpMethod c;
  private String d;
  private GraphObject e;
  private String f;
  private String g;
  private String h;
  private boolean i = true;
  private Bundle j;
  private m k;
  private String l;
  private Object m;

  public Request()
  {
    this(null, null, null, null, null);
  }

  public Request(Session paramSession, String paramString, Bundle paramBundle, HttpMethod paramHttpMethod, m paramm)
  {
    this.b = paramSession;
    this.d = paramString;
    this.k = paramm;
    if ((this.l != null) && (paramHttpMethod != HttpMethod.a))
      throw new FacebookException("Can't change HTTP method on request with overridden URL.");
    if (paramHttpMethod != null)
    {
      this.c = paramHttpMethod;
      if (paramBundle == null)
        break label109;
    }
    label109: for (this.j = new Bundle(paramBundle); ; this.j = new Bundle())
    {
      if (!this.j.containsKey("migration_bundle"))
        this.j.putString("migration_bundle", "fbsdk:20131203");
      return;
      paramHttpMethod = HttpMethod.a;
      break;
    }
  }

  public static Request a(Session paramSession, n paramn)
  {
    return new Request(paramSession, "me", null, null, new Request.1(paramn));
  }

  public static Request a(String paramString, GraphObject paramGraphObject)
  {
    Request localRequest = new Request(null, paramString, null, HttpMethod.b, null);
    localRequest.e = paramGraphObject;
    return localRequest;
  }

  public static q a(Request[] paramArrayOfRequest)
  {
    af.a(paramArrayOfRequest, "requests");
    return b(new r(Arrays.asList(paramArrayOfRequest)));
  }

  private String a(String paramString)
  {
    Uri.Builder localBuilder = new Uri.Builder().encodedPath(paramString);
    Iterator localIterator = this.j.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = this.j.get(str);
      if (localObject == null)
        localObject = "";
      if (e(localObject))
      {
        localBuilder.appendQueryParameter(str, f(localObject).toString());
      }
      else if (this.c == HttpMethod.a)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localObject.getClass().getSimpleName();
        throw new IllegalArgumentException(String.format("Unsupported parameter type for GET request: %s", arrayOfObject));
      }
    }
    return localBuilder.toString();
  }

  public static List<t> a(r paramr)
  {
    af.a(paramr, "requests");
    try
    {
      HttpURLConnection localHttpURLConnection = c(paramr);
      return a(localHttpURLConnection, paramr);
    }
    catch (Exception localException)
    {
      List localList = t.a(paramr.d(), null, new FacebookException(localException));
      a(paramr, localList);
      return localList;
    }
  }

  public static List<t> a(HttpURLConnection paramHttpURLConnection, r paramr)
  {
    List localList = t.a(paramHttpURLConnection, paramr);
    ad.a(paramHttpURLConnection);
    int i1 = paramr.size();
    if (i1 != localList.size())
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(localList.size());
      arrayOfObject[1] = Integer.valueOf(i1);
      throw new FacebookException(String.format("Received %d responses while expecting %d", arrayOfObject));
    }
    a(paramr, localList);
    HashSet localHashSet = new HashSet();
    Iterator localIterator1 = paramr.iterator();
    while (localIterator1.hasNext())
    {
      Request localRequest = (Request)localIterator1.next();
      if (localRequest.b != null)
        localHashSet.add(localRequest.b);
    }
    Iterator localIterator2 = localHashSet.iterator();
    while (localIterator2.hasNext())
    {
      Session localSession = (Session)localIterator2.next();
      if (localSession.k())
        localSession.j();
    }
    return localList;
  }

  private static void a(Bundle paramBundle, p paramp)
  {
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramBundle.get(str);
      if (e(localObject))
        paramp.a(str, localObject);
    }
  }

  private static void a(GraphObject paramGraphObject, String paramString, o paramo)
  {
    int i3;
    if ((paramString.startsWith("me/")) || (paramString.startsWith("/me/")))
    {
      int i1 = paramString.indexOf(":");
      int i2 = paramString.indexOf("?");
      if ((i1 > 3) && ((i2 == -1) || (i1 < i2)))
        i3 = 1;
    }
    for (int i4 = i3; ; i4 = 0)
    {
      Iterator localIterator = paramGraphObject.asMap().entrySet().iterator();
      label77: if (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if ((i4 != 0) && (((String)localEntry.getKey()).equalsIgnoreCase("image")));
        for (boolean bool = true; ; bool = false)
        {
          a((String)localEntry.getKey(), localEntry.getValue(), paramo, bool);
          break label77;
          i3 = 0;
          break;
        }
      }
      return;
    }
  }

  private static void a(p paramp, Collection<Request> paramCollection, Bundle paramBundle)
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
      ((Request)localIterator.next()).a(localJSONArray, paramBundle);
    paramp.a("batch", localJSONArray.toString());
  }

  private static void a(r paramr, List<t> paramList)
  {
    int i1 = paramr.size();
    ArrayList localArrayList = new ArrayList();
    for (int i2 = 0; i2 < i1; i2++)
    {
      Request localRequest = paramr.a(i2);
      if (localRequest.k != null)
        localArrayList.add(new Pair(localRequest.k, paramList.get(i2)));
    }
    Request.2 local2;
    Handler localHandler;
    if (localArrayList.size() > 0)
    {
      local2 = new Request.2(localArrayList, paramr);
      localHandler = paramr.c();
      if (localHandler == null)
        local2.run();
    }
    else
    {
      return;
    }
    localHandler.post(local2);
  }

  private static void a(String paramString, Object paramObject, o paramo, boolean paramBoolean)
  {
    Object localObject1 = paramObject;
    Object localObject2;
    while (true)
    {
      localObject2 = localObject1.getClass();
      if (GraphObject.class.isAssignableFrom((Class)localObject2))
      {
        JSONObject localJSONObject2 = ((GraphObject)localObject1).getInnerJSONObject();
        Class localClass2 = localJSONObject2.getClass();
        localObject1 = localJSONObject2;
        localObject2 = localClass2;
      }
      JSONObject localJSONObject1;
      while (true)
      {
        if (!JSONObject.class.isAssignableFrom((Class)localObject2))
          break label222;
        localJSONObject1 = (JSONObject)localObject1;
        if (!paramBoolean)
          break;
        Iterator localIterator = localJSONObject1.keys();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          a(String.format("%s[%s]", new Object[] { paramString, str }), localJSONObject1.opt(str), paramo, paramBoolean);
        }
        if (GraphObjectList.class.isAssignableFrom((Class)localObject2))
        {
          JSONArray localJSONArray1 = ((GraphObjectList)localObject1).getInnerJSONArray();
          Class localClass1 = localJSONArray1.getClass();
          localObject1 = localJSONArray1;
          localObject2 = localClass1;
        }
      }
      if (localJSONObject1.has("id"))
      {
        localObject1 = localJSONObject1.optString("id");
      }
      else
      {
        if (!localJSONObject1.has("url"))
          break label347;
        localObject1 = localJSONObject1.optString("url");
      }
    }
    label222: if (JSONArray.class.isAssignableFrom((Class)localObject2))
    {
      JSONArray localJSONArray2 = (JSONArray)localObject1;
      int i1 = localJSONArray2.length();
      for (int i2 = 0; i2 < i1; i2++)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = paramString;
        arrayOfObject[1] = Integer.valueOf(i2);
        a(String.format("%s[%d]", arrayOfObject), localJSONArray2.opt(i2), paramo, paramBoolean);
      }
    }
    if ((String.class.isAssignableFrom((Class)localObject2)) || (Number.class.isAssignableFrom((Class)localObject2)) || (Boolean.class.isAssignableFrom((Class)localObject2)))
      paramo.a(paramString, localObject1.toString());
    label347: 
    while (!Date.class.isAssignableFrom((Class)localObject2))
      return;
    Date localDate = (Date)localObject1;
    paramo.a(paramString, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(localDate));
  }

  private void a(JSONArray paramJSONArray, Bundle paramBundle)
  {
    JSONObject localJSONObject = new JSONObject();
    if (this.g != null)
    {
      localJSONObject.put("name", this.g);
      localJSONObject.put("omit_response_on_success", this.i);
    }
    if (this.h != null)
      localJSONObject.put("depends_on", this.h);
    if (this.l != null)
      throw new FacebookException("Can't override URL for a batch request");
    if (this.f != null);
    String str2;
    ArrayList localArrayList1;
    for (String str1 = "method/" + this.f; ; str1 = this.d)
    {
      e();
      str2 = a(str1);
      localJSONObject.put("relative_url", str2);
      localJSONObject.put("method", this.c);
      if (this.b != null)
        u.a(this.b.e());
      localArrayList1 = new ArrayList();
      Iterator localIterator = this.j.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str3 = (String)localIterator.next();
        Object localObject = this.j.get(str3);
        if (d(localObject))
        {
          Object[] arrayOfObject = new Object[2];
          arrayOfObject[0] = "file";
          arrayOfObject[1] = Integer.valueOf(paramBundle.size());
          String str4 = String.format("%s%d", arrayOfObject);
          localArrayList1.add(str4);
          ad.a(paramBundle, str4, localObject);
        }
      }
    }
    if (!localArrayList1.isEmpty())
      localJSONObject.put("attached_files", TextUtils.join(",", localArrayList1));
    if (this.e != null)
    {
      ArrayList localArrayList2 = new ArrayList();
      a(this.e, str2, new Request.3(this, localArrayList2));
      localJSONObject.put("body", TextUtils.join("&", localArrayList2));
    }
    paramJSONArray.put(localJSONObject);
  }

  public static q b(r paramr)
  {
    af.a(paramr, "requests");
    q localq = new q(paramr);
    localq.a();
    return localq;
  }

  private static void b(Bundle paramBundle, p paramp)
  {
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramBundle.get(str);
      if (d(localObject))
        paramp.a(str, localObject);
    }
  }

  // ERROR //
  private static HttpURLConnection c(r paramr)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 231	com/facebook/r:iterator	()Ljava/util/Iterator;
    //   4: astore_1
    //   5: aload_1
    //   6: invokeinterface 135 1 0
    //   11: ifeq +41 -> 52
    //   14: aload_1
    //   15: invokeinterface 139 1 0
    //   20: checkcast 2	com/facebook/Request
    //   23: astore 19
    //   25: aload 19
    //   27: getfield 39	com/facebook/Request:d	Ljava/lang/String;
    //   30: ifnull -25 -> 5
    //   33: aload 19
    //   35: getfield 428	com/facebook/Request:f	Ljava/lang/String;
    //   38: ifnull -33 -> 5
    //   41: new 172	java/lang/IllegalArgumentException
    //   44: dup
    //   45: ldc_w 505
    //   48: invokespecial 179	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   51: athrow
    //   52: aload_0
    //   53: invokevirtual 216	com/facebook/r:size	()I
    //   56: iconst_1
    //   57: if_icmpne +278 -> 335
    //   60: new 507	java/net/URL
    //   63: dup
    //   64: aload_0
    //   65: iconst_0
    //   66: invokevirtual 311	com/facebook/r:a	(I)Lcom/facebook/Request;
    //   69: invokevirtual 509	com/facebook/Request:d	()Ljava/lang/String;
    //   72: invokespecial 510	java/net/URL:<init>	(Ljava/lang/String;)V
    //   75: astore_3
    //   76: aload_3
    //   77: invokevirtual 514	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   80: checkcast 516	java/net/HttpURLConnection
    //   83: astore 6
    //   85: getstatic 518	com/facebook/Request:n	Ljava/lang/String;
    //   88: ifnonnull +28 -> 116
    //   91: ldc_w 520
    //   94: iconst_2
    //   95: anewarray 4	java/lang/Object
    //   98: dup
    //   99: iconst_0
    //   100: ldc_w 522
    //   103: aastore
    //   104: dup
    //   105: iconst_1
    //   106: ldc_w 524
    //   109: aastore
    //   110: invokestatic 178	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   113: putstatic 518	com/facebook/Request:n	Ljava/lang/String;
    //   116: aload 6
    //   118: ldc_w 526
    //   121: getstatic 518	com/facebook/Request:n	Ljava/lang/String;
    //   124: invokevirtual 529	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   127: aload 6
    //   129: ldc_w 531
    //   132: ldc_w 533
    //   135: iconst_1
    //   136: anewarray 4	java/lang/Object
    //   139: dup
    //   140: iconst_0
    //   141: ldc_w 535
    //   144: aastore
    //   145: invokestatic 178	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   148: invokevirtual 529	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   151: aload 6
    //   153: iconst_0
    //   154: invokevirtual 539	java/net/HttpURLConnection:setChunkedStreamingMode	(I)V
    //   157: new 450	com/facebook/internal/u
    //   160: dup
    //   161: getstatic 544	com/facebook/LoggingBehavior:a	Lcom/facebook/LoggingBehavior;
    //   164: ldc_w 546
    //   167: invokespecial 549	com/facebook/internal/u:<init>	(Lcom/facebook/LoggingBehavior;Ljava/lang/String;)V
    //   170: astore 7
    //   172: aload_0
    //   173: invokevirtual 216	com/facebook/r:size	()I
    //   176: istore 8
    //   178: iload 8
    //   180: iconst_1
    //   181: if_icmpne +181 -> 362
    //   184: aload_0
    //   185: iconst_0
    //   186: invokevirtual 311	com/facebook/r:a	(I)Lcom/facebook/Request;
    //   189: getfield 56	com/facebook/Request:c	Lcom/facebook/HttpMethod;
    //   192: astore 9
    //   194: aload 6
    //   196: aload 9
    //   198: invokevirtual 551	com/facebook/HttpMethod:name	()Ljava/lang/String;
    //   201: invokevirtual 554	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   204: aload 6
    //   206: invokevirtual 558	java/net/HttpURLConnection:getURL	()Ljava/net/URL;
    //   209: astore 10
    //   211: aload 7
    //   213: ldc_w 560
    //   216: invokevirtual 562	com/facebook/internal/u:b	(Ljava/lang/String;)V
    //   219: aload 7
    //   221: ldc_w 564
    //   224: aload_0
    //   225: invokevirtual 566	com/facebook/r:b	()Ljava/lang/String;
    //   228: invokevirtual 567	com/facebook/internal/u:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   231: aload 7
    //   233: ldc_w 569
    //   236: aload 10
    //   238: invokevirtual 567	com/facebook/internal/u:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   241: aload 7
    //   243: ldc_w 571
    //   246: aload 6
    //   248: invokevirtual 574	java/net/HttpURLConnection:getRequestMethod	()Ljava/lang/String;
    //   251: invokevirtual 567	com/facebook/internal/u:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   254: aload 7
    //   256: ldc_w 526
    //   259: aload 6
    //   261: ldc_w 526
    //   264: invokevirtual 577	java/net/HttpURLConnection:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   267: invokevirtual 567	com/facebook/internal/u:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   270: aload 7
    //   272: ldc_w 531
    //   275: aload 6
    //   277: ldc_w 531
    //   280: invokevirtual 577	java/net/HttpURLConnection:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   283: invokevirtual 567	com/facebook/internal/u:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   286: aload 6
    //   288: aload_0
    //   289: invokevirtual 579	com/facebook/r:a	()I
    //   292: invokevirtual 582	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   295: aload 6
    //   297: aload_0
    //   298: invokevirtual 579	com/facebook/r:a	()I
    //   301: invokevirtual 585	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   304: getstatic 87	com/facebook/HttpMethod:b	Lcom/facebook/HttpMethod;
    //   307: astore 11
    //   309: iconst_0
    //   310: istore 12
    //   312: aload 9
    //   314: aload 11
    //   316: if_acmpne +6 -> 322
    //   319: iconst_1
    //   320: istore 12
    //   322: iload 12
    //   324: ifne +46 -> 370
    //   327: aload 7
    //   329: invokevirtual 587	com/facebook/internal/u:d	()V
    //   332: aload 6
    //   334: areturn
    //   335: new 507	java/net/URL
    //   338: dup
    //   339: invokestatic 590	com/facebook/internal/y:b	()Ljava/lang/String;
    //   342: invokespecial 510	java/net/URL:<init>	(Ljava/lang/String;)V
    //   345: astore_3
    //   346: goto -270 -> 76
    //   349: astore_2
    //   350: new 49	com/facebook/FacebookException
    //   353: dup
    //   354: ldc_w 592
    //   357: aload_2
    //   358: invokespecial 595	com/facebook/FacebookException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   361: athrow
    //   362: getstatic 87	com/facebook/HttpMethod:b	Lcom/facebook/HttpMethod;
    //   365: astore 9
    //   367: goto -173 -> 194
    //   370: aload 6
    //   372: iconst_1
    //   373: invokevirtual 599	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   376: new 601	java/io/BufferedOutputStream
    //   379: dup
    //   380: aload 6
    //   382: invokevirtual 605	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   385: invokespecial 608	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   388: astore 13
    //   390: new 244	com/facebook/p
    //   393: dup
    //   394: aload 13
    //   396: aload 7
    //   398: invokespecial 611	com/facebook/p:<init>	(Ljava/io/BufferedOutputStream;Lcom/facebook/internal/u;)V
    //   401: astore 14
    //   403: iload 8
    //   405: iconst_1
    //   406: if_icmpne +97 -> 503
    //   409: aload_0
    //   410: iconst_0
    //   411: invokevirtual 311	com/facebook/r:a	(I)Lcom/facebook/Request;
    //   414: astore 16
    //   416: aload 7
    //   418: ldc_w 613
    //   421: invokevirtual 562	com/facebook/internal/u:b	(Ljava/lang/String;)V
    //   424: aload 16
    //   426: getfield 63	com/facebook/Request:j	Landroid/os/Bundle;
    //   429: aload 14
    //   431: invokestatic 615	com/facebook/Request:a	(Landroid/os/Bundle;Lcom/facebook/p;)V
    //   434: aload 7
    //   436: ldc_w 617
    //   439: invokevirtual 562	com/facebook/internal/u:b	(Ljava/lang/String;)V
    //   442: aload 16
    //   444: getfield 63	com/facebook/Request:j	Landroid/os/Bundle;
    //   447: aload 14
    //   449: invokestatic 619	com/facebook/Request:b	(Landroid/os/Bundle;Lcom/facebook/p;)V
    //   452: aload 16
    //   454: getfield 89	com/facebook/Request:e	Lcom/facebook/model/GraphObject;
    //   457: ifnull +18 -> 475
    //   460: aload 16
    //   462: getfield 89	com/facebook/Request:e	Lcom/facebook/model/GraphObject;
    //   465: aload 10
    //   467: invokevirtual 622	java/net/URL:getPath	()Ljava/lang/String;
    //   470: aload 14
    //   472: invokestatic 482	com/facebook/Request:a	(Lcom/facebook/model/GraphObject;Ljava/lang/String;Lcom/facebook/o;)V
    //   475: aload 13
    //   477: invokevirtual 625	java/io/BufferedOutputStream:close	()V
    //   480: aload 7
    //   482: invokevirtual 587	com/facebook/internal/u:d	()V
    //   485: aload 6
    //   487: areturn
    //   488: astore 5
    //   490: new 49	com/facebook/FacebookException
    //   493: dup
    //   494: ldc_w 627
    //   497: aload 5
    //   499: invokespecial 595	com/facebook/FacebookException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   502: athrow
    //   503: aload_0
    //   504: invokestatic 630	com/facebook/Request:d	(Lcom/facebook/r;)Ljava/lang/String;
    //   507: astore 17
    //   509: aload 17
    //   511: invokestatic 632	com/facebook/internal/ad:a	(Ljava/lang/String;)Z
    //   514: ifeq +39 -> 553
    //   517: new 49	com/facebook/FacebookException
    //   520: dup
    //   521: ldc_w 634
    //   524: invokespecial 54	com/facebook/FacebookException:<init>	(Ljava/lang/String;)V
    //   527: athrow
    //   528: astore 15
    //   530: aload 13
    //   532: invokevirtual 625	java/io/BufferedOutputStream:close	()V
    //   535: aload 15
    //   537: athrow
    //   538: astore 4
    //   540: new 49	com/facebook/FacebookException
    //   543: dup
    //   544: ldc_w 627
    //   547: aload 4
    //   549: invokespecial 595	com/facebook/FacebookException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   552: athrow
    //   553: aload 14
    //   555: ldc_w 636
    //   558: aload 17
    //   560: invokevirtual 305	com/facebook/p:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   563: new 58	android/os/Bundle
    //   566: dup
    //   567: invokespecial 76	android/os/Bundle:<init>	()V
    //   570: astore 18
    //   572: aload 14
    //   574: aload_0
    //   575: aload 18
    //   577: invokestatic 638	com/facebook/Request:a	(Lcom/facebook/p;Ljava/util/Collection;Landroid/os/Bundle;)V
    //   580: aload 7
    //   582: ldc_w 617
    //   585: invokevirtual 562	com/facebook/internal/u:b	(Ljava/lang/String;)V
    //   588: aload 18
    //   590: aload 14
    //   592: invokestatic 619	com/facebook/Request:b	(Landroid/os/Bundle;Lcom/facebook/p;)V
    //   595: goto -120 -> 475
    //
    // Exception table:
    //   from	to	target	type
    //   52	76	349	java/net/MalformedURLException
    //   335	346	349	java/net/MalformedURLException
    //   76	116	488	java/io/IOException
    //   116	178	488	java/io/IOException
    //   184	194	488	java/io/IOException
    //   194	309	488	java/io/IOException
    //   327	332	488	java/io/IOException
    //   362	367	488	java/io/IOException
    //   370	390	488	java/io/IOException
    //   475	485	488	java/io/IOException
    //   530	538	488	java/io/IOException
    //   390	403	528	finally
    //   409	475	528	finally
    //   503	528	528	finally
    //   553	595	528	finally
    //   76	116	538	org/json/JSONException
    //   116	178	538	org/json/JSONException
    //   184	194	538	org/json/JSONException
    //   194	309	538	org/json/JSONException
    //   327	332	538	org/json/JSONException
    //   362	367	538	org/json/JSONException
    //   370	390	538	org/json/JSONException
    //   475	485	538	org/json/JSONException
    //   530	538	538	org/json/JSONException
  }

  private static String d(r paramr)
  {
    if (!ad.a(paramr.f()))
      return paramr.f();
    Iterator localIterator = paramr.iterator();
    while (localIterator.hasNext())
    {
      Session localSession = ((Request)localIterator.next()).b;
      if (localSession != null)
        return localSession.d();
    }
    return a;
  }

  private static boolean d(Object paramObject)
  {
    return ((paramObject instanceof Bitmap)) || ((paramObject instanceof byte[])) || ((paramObject instanceof ParcelFileDescriptor)) || ((paramObject instanceof Request.ParcelFileDescriptorWithMimeType));
  }

  private void e()
  {
    if (this.b != null)
    {
      if (!this.b.a())
        throw new FacebookException("Session provided to a Request in un-opened state.");
      if (!this.j.containsKey("access_token"))
      {
        String str = this.b.e();
        u.a(str);
        this.j.putString("access_token", str);
      }
    }
    this.j.putString("sdk", "android");
    this.j.putString("format", "json");
  }

  private static boolean e(Object paramObject)
  {
    return ((paramObject instanceof String)) || ((paramObject instanceof Boolean)) || ((paramObject instanceof Number)) || ((paramObject instanceof Date));
  }

  private static String f(Object paramObject)
  {
    if ((paramObject instanceof String))
      return (String)paramObject;
    if (((paramObject instanceof Boolean)) || ((paramObject instanceof Number)))
      return paramObject.toString();
    if ((paramObject instanceof Date))
      return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(paramObject);
    throw new IllegalArgumentException("Unsupported parameter type.");
  }

  public final Bundle a()
  {
    return this.j;
  }

  public final void a(Bundle paramBundle)
  {
    this.j = paramBundle;
  }

  public final void a(m paramm)
  {
    this.k = paramm;
  }

  public final void a(GraphObject paramGraphObject)
  {
    this.e = paramGraphObject;
  }

  public final void a(Object paramObject)
  {
    this.m = paramObject;
  }

  public final Session b()
  {
    return this.b;
  }

  public final t c()
  {
    Request[] arrayOfRequest = { this };
    af.a(arrayOfRequest, "requests");
    List localList = a(new r(Arrays.asList(arrayOfRequest)));
    if ((localList == null) || (localList.size() != 1))
      throw new FacebookException("invalid state: expected a single response");
    return (t)localList.get(0);
  }

  final String d()
  {
    if (this.l != null)
      return this.l.toString();
    Object[] arrayOfObject2;
    if (this.f != null)
    {
      arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = y.c();
      arrayOfObject2[1] = this.f;
    }
    Object[] arrayOfObject1;
    for (String str = String.format("%s/%s", arrayOfObject2); ; str = String.format("%s/%s", arrayOfObject1))
    {
      e();
      return a(str);
      arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = y.b();
      arrayOfObject1[1] = this.d;
    }
  }

  public final String toString()
  {
    return "{Request:  session: " + this.b + ", graphPath: " + this.d + ", graphObject: " + this.e + ", restMethod: " + this.f + ", httpMethod: " + this.c + ", parameters: " + this.j + "}";
  }
}

/* Location:
 * Qualified Name:     com.facebook.Request
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
