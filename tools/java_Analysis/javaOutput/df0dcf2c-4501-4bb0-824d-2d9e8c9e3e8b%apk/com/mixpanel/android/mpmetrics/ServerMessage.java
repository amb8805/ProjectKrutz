package com.mixpanel.android.mpmetrics;

import android.util.Log;
import com.mixpanel.android.a.a;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

final class ServerMessage
{
  ServerMessage()
  {
  }

  // ERROR //
  private static s a(String paramString, List<org.apache.http.NameValuePair> paramList)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: getstatic 24	com/mixpanel/android/mpmetrics/ServerMessage$Status:c	Lcom/mixpanel/android/mpmetrics/ServerMessage$Status;
    //   5: astore_3
    //   6: iconst_0
    //   7: istore 4
    //   9: aconst_null
    //   10: astore 5
    //   12: iload 4
    //   14: iconst_3
    //   15: if_icmpge +413 -> 428
    //   18: iload_2
    //   19: ifne +409 -> 428
    //   22: new 26	java/net/URL
    //   25: dup
    //   26: aload_0
    //   27: invokespecial 29	java/net/URL:<init>	(Ljava/lang/String;)V
    //   30: invokevirtual 33	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   33: checkcast 35	java/net/HttpURLConnection
    //   36: astore 38
    //   38: aload_1
    //   39: ifnull +78 -> 117
    //   42: aload 38
    //   44: iconst_1
    //   45: invokevirtual 39	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   48: new 41	org/apache/http/client/entity/UrlEncodedFormEntity
    //   51: dup
    //   52: aload_1
    //   53: ldc 43
    //   55: invokespecial 46	org/apache/http/client/entity/UrlEncodedFormEntity:<init>	(Ljava/util/List;Ljava/lang/String;)V
    //   58: astore 52
    //   60: aload 38
    //   62: ldc 48
    //   64: invokevirtual 51	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   67: aload 38
    //   69: aload 52
    //   71: invokevirtual 55	org/apache/http/client/entity/UrlEncodedFormEntity:getContentLength	()J
    //   74: l2i
    //   75: invokevirtual 59	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   78: aload 38
    //   80: invokevirtual 63	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   83: astore 53
    //   85: aload 53
    //   87: astore 30
    //   89: new 65	java/io/BufferedOutputStream
    //   92: dup
    //   93: aload 30
    //   95: invokespecial 68	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   98: astore 29
    //   100: aload 52
    //   102: aload 29
    //   104: invokevirtual 71	org/apache/http/client/entity/UrlEncodedFormEntity:writeTo	(Ljava/io/OutputStream;)V
    //   107: aload 29
    //   109: invokevirtual 74	java/io/BufferedOutputStream:close	()V
    //   112: aload 30
    //   114: invokevirtual 77	java/io/OutputStream:close	()V
    //   117: aload 38
    //   119: invokevirtual 81	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   122: astore 41
    //   124: aload 41
    //   126: astore 32
    //   128: new 83	java/io/BufferedInputStream
    //   131: dup
    //   132: aload 32
    //   134: invokespecial 86	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   137: astore 42
    //   139: aload 32
    //   141: invokestatic 91	com/mixpanel/android/a/b:a	(Ljava/io/InputStream;)Ljava/lang/String;
    //   144: astore 45
    //   146: aload 45
    //   148: astore 6
    //   150: aload 42
    //   152: invokevirtual 92	java/io/BufferedInputStream:close	()V
    //   155: aload 32
    //   157: invokevirtual 95	java/io/InputStream:close	()V
    //   160: aload 38
    //   162: ifnull +705 -> 867
    //   165: aload 38
    //   167: invokevirtual 98	java/net/HttpURLConnection:disconnect	()V
    //   170: iconst_1
    //   171: istore_2
    //   172: aload 6
    //   174: astore 5
    //   176: goto -164 -> 12
    //   179: astore 49
    //   181: aload 38
    //   183: astore 9
    //   185: aconst_null
    //   186: astore 11
    //   188: aconst_null
    //   189: astore 12
    //   191: aload 32
    //   193: astore 13
    //   195: aconst_null
    //   196: astore 10
    //   198: iload 4
    //   200: iconst_1
    //   201: iadd
    //   202: istore 14
    //   204: aload 10
    //   206: ifnull +8 -> 214
    //   209: aload 10
    //   211: invokevirtual 74	java/io/BufferedOutputStream:close	()V
    //   214: aload 11
    //   216: ifnull +8 -> 224
    //   219: aload 11
    //   221: invokevirtual 77	java/io/OutputStream:close	()V
    //   224: aload 12
    //   226: ifnull +8 -> 234
    //   229: aload 12
    //   231: invokevirtual 92	java/io/BufferedInputStream:close	()V
    //   234: aload 13
    //   236: ifnull +8 -> 244
    //   239: aload 13
    //   241: invokevirtual 95	java/io/InputStream:close	()V
    //   244: aload 9
    //   246: ifnull +157 -> 403
    //   249: aload 9
    //   251: invokevirtual 98	java/net/HttpURLConnection:disconnect	()V
    //   254: iload 14
    //   256: istore 4
    //   258: aload 6
    //   260: astore 5
    //   262: goto -250 -> 12
    //   265: astore 48
    //   267: aconst_null
    //   268: astore 30
    //   270: aload 6
    //   272: astore 5
    //   274: aconst_null
    //   275: astore 29
    //   277: aconst_null
    //   278: astore 28
    //   280: aload 38
    //   282: astore 31
    //   284: aload 48
    //   286: astore 27
    //   288: aload 29
    //   290: ifnull +8 -> 298
    //   293: aload 29
    //   295: invokevirtual 74	java/io/BufferedOutputStream:close	()V
    //   298: aload 30
    //   300: ifnull +8 -> 308
    //   303: aload 30
    //   305: invokevirtual 77	java/io/OutputStream:close	()V
    //   308: aload 28
    //   310: ifnull +8 -> 318
    //   313: aload 28
    //   315: invokevirtual 92	java/io/BufferedInputStream:close	()V
    //   318: aload 32
    //   320: ifnull +8 -> 328
    //   323: aload 32
    //   325: invokevirtual 95	java/io/InputStream:close	()V
    //   328: aload 31
    //   330: ifnull +8 -> 338
    //   333: aload 31
    //   335: invokevirtual 98	java/net/HttpURLConnection:disconnect	()V
    //   338: aload 27
    //   340: athrow
    //   341: astore 18
    //   343: aload 5
    //   345: astore 6
    //   347: ldc 100
    //   349: new 102	java/lang/StringBuilder
    //   352: dup
    //   353: ldc 104
    //   355: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   358: aload_0
    //   359: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: ldc 111
    //   364: invokevirtual 109	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: invokevirtual 115	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   370: aload 18
    //   372: invokestatic 121	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   375: pop
    //   376: getstatic 24	com/mixpanel/android/mpmetrics/ServerMessage$Status:c	Lcom/mixpanel/android/mpmetrics/ServerMessage$Status;
    //   379: astore 7
    //   381: aload 6
    //   383: ifnull +8 -> 391
    //   386: getstatic 123	com/mixpanel/android/mpmetrics/ServerMessage$Status:a	Lcom/mixpanel/android/mpmetrics/ServerMessage$Status;
    //   389: astore 7
    //   391: new 125	com/mixpanel/android/mpmetrics/s
    //   394: dup
    //   395: aload 7
    //   397: aload 6
    //   399: invokespecial 128	com/mixpanel/android/mpmetrics/s:<init>	(Lcom/mixpanel/android/mpmetrics/ServerMessage$Status;Ljava/lang/String;)V
    //   402: areturn
    //   403: aload 6
    //   405: astore 15
    //   407: iload_2
    //   408: istore 16
    //   410: iload 14
    //   412: istore 17
    //   414: aload 15
    //   416: astore 5
    //   418: iload 17
    //   420: istore 4
    //   422: iload 16
    //   424: istore_2
    //   425: goto -413 -> 12
    //   428: aload 5
    //   430: astore 6
    //   432: aload_3
    //   433: astore 7
    //   435: goto -54 -> 381
    //   438: astore 22
    //   440: getstatic 131	com/mixpanel/android/mpmetrics/ServerMessage$Status:b	Lcom/mixpanel/android/mpmetrics/ServerMessage$Status;
    //   443: astore 7
    //   445: goto -64 -> 381
    //   448: astore 20
    //   450: ldc 100
    //   452: ldc 133
    //   454: aload 20
    //   456: invokestatic 121	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   459: pop
    //   460: getstatic 24	com/mixpanel/android/mpmetrics/ServerMessage$Status:c	Lcom/mixpanel/android/mpmetrics/ServerMessage$Status;
    //   463: astore 7
    //   465: goto -84 -> 381
    //   468: astore 26
    //   470: goto -256 -> 214
    //   473: astore 25
    //   475: goto -251 -> 224
    //   478: astore 24
    //   480: goto -246 -> 234
    //   483: astore 23
    //   485: goto -241 -> 244
    //   488: astore 37
    //   490: goto -192 -> 298
    //   493: astore 36
    //   495: goto -187 -> 308
    //   498: astore 35
    //   500: goto -182 -> 318
    //   503: astore 34
    //   505: goto -177 -> 328
    //   508: astore 20
    //   510: aload 5
    //   512: astore 6
    //   514: goto -64 -> 450
    //   517: astore 33
    //   519: aload 5
    //   521: astore 6
    //   523: goto -83 -> 440
    //   526: astore 18
    //   528: goto -181 -> 347
    //   531: astore 27
    //   533: aconst_null
    //   534: astore 28
    //   536: aconst_null
    //   537: astore 29
    //   539: aconst_null
    //   540: astore 30
    //   542: aconst_null
    //   543: astore 31
    //   545: aconst_null
    //   546: astore 32
    //   548: goto -260 -> 288
    //   551: astore 40
    //   553: aload 40
    //   555: astore 27
    //   557: aload 38
    //   559: astore 31
    //   561: aconst_null
    //   562: astore 28
    //   564: aconst_null
    //   565: astore 29
    //   567: aconst_null
    //   568: astore 30
    //   570: aconst_null
    //   571: astore 32
    //   573: goto -285 -> 288
    //   576: astore 57
    //   578: aload 38
    //   580: astore 31
    //   582: aload 57
    //   584: astore 27
    //   586: aconst_null
    //   587: astore 28
    //   589: aconst_null
    //   590: astore 29
    //   592: aconst_null
    //   593: astore 32
    //   595: goto -307 -> 288
    //   598: astore 55
    //   600: aload 55
    //   602: astore 27
    //   604: aload 38
    //   606: astore 31
    //   608: aconst_null
    //   609: astore 28
    //   611: aconst_null
    //   612: astore 32
    //   614: goto -326 -> 288
    //   617: astore 51
    //   619: aload 38
    //   621: astore 31
    //   623: aload 51
    //   625: astore 27
    //   627: aconst_null
    //   628: astore 28
    //   630: aconst_null
    //   631: astore 29
    //   633: aconst_null
    //   634: astore 30
    //   636: goto -348 -> 288
    //   639: astore 44
    //   641: aload 44
    //   643: astore 27
    //   645: aload 42
    //   647: astore 28
    //   649: aload 38
    //   651: astore 31
    //   653: aconst_null
    //   654: astore 29
    //   656: aconst_null
    //   657: astore 30
    //   659: goto -371 -> 288
    //   662: astore 47
    //   664: aload 6
    //   666: astore 5
    //   668: aload 47
    //   670: astore 27
    //   672: aload 42
    //   674: astore 28
    //   676: aload 38
    //   678: astore 31
    //   680: aconst_null
    //   681: astore 29
    //   683: aconst_null
    //   684: astore 30
    //   686: goto -398 -> 288
    //   689: astore 8
    //   691: aload 5
    //   693: astore 6
    //   695: aconst_null
    //   696: astore 9
    //   698: aconst_null
    //   699: astore 10
    //   701: aconst_null
    //   702: astore 11
    //   704: aconst_null
    //   705: astore 12
    //   707: aconst_null
    //   708: astore 13
    //   710: goto -512 -> 198
    //   713: astore 39
    //   715: aload 38
    //   717: astore 9
    //   719: aload 5
    //   721: astore 6
    //   723: aconst_null
    //   724: astore 10
    //   726: aconst_null
    //   727: astore 11
    //   729: aconst_null
    //   730: astore 12
    //   732: aconst_null
    //   733: astore 13
    //   735: goto -537 -> 198
    //   738: astore 56
    //   740: aload 5
    //   742: astore 6
    //   744: aload 30
    //   746: astore 11
    //   748: aload 38
    //   750: astore 9
    //   752: aconst_null
    //   753: astore 10
    //   755: aconst_null
    //   756: astore 12
    //   758: aconst_null
    //   759: astore 13
    //   761: goto -563 -> 198
    //   764: astore 54
    //   766: aload 29
    //   768: astore 10
    //   770: aload 5
    //   772: astore 6
    //   774: aload 30
    //   776: astore 11
    //   778: aload 38
    //   780: astore 9
    //   782: aconst_null
    //   783: astore 12
    //   785: aconst_null
    //   786: astore 13
    //   788: goto -590 -> 198
    //   791: astore 50
    //   793: aload 38
    //   795: astore 9
    //   797: aload 32
    //   799: astore 13
    //   801: aload 5
    //   803: astore 6
    //   805: aconst_null
    //   806: astore 10
    //   808: aconst_null
    //   809: astore 11
    //   811: aconst_null
    //   812: astore 12
    //   814: goto -616 -> 198
    //   817: astore 43
    //   819: aload 42
    //   821: astore 12
    //   823: aload 32
    //   825: astore 13
    //   827: aload 5
    //   829: astore 6
    //   831: aload 38
    //   833: astore 9
    //   835: aconst_null
    //   836: astore 10
    //   838: aconst_null
    //   839: astore 11
    //   841: goto -643 -> 198
    //   844: astore 46
    //   846: aload 42
    //   848: astore 12
    //   850: aload 32
    //   852: astore 13
    //   854: aload 38
    //   856: astore 9
    //   858: aconst_null
    //   859: astore 10
    //   861: aconst_null
    //   862: astore 11
    //   864: goto -666 -> 198
    //   867: iconst_1
    //   868: istore 16
    //   870: iload 4
    //   872: istore 17
    //   874: aload 6
    //   876: astore 15
    //   878: goto -464 -> 414
    //
    // Exception table:
    //   from	to	target	type
    //   155	160	179	java/io/EOFException
    //   155	160	265	finally
    //   293	298	341	java/net/MalformedURLException
    //   303	308	341	java/net/MalformedURLException
    //   313	318	341	java/net/MalformedURLException
    //   323	328	341	java/net/MalformedURLException
    //   333	338	341	java/net/MalformedURLException
    //   338	341	341	java/net/MalformedURLException
    //   165	170	438	java/io/IOException
    //   249	254	438	java/io/IOException
    //   165	170	448	java/lang/OutOfMemoryError
    //   209	214	448	java/lang/OutOfMemoryError
    //   219	224	448	java/lang/OutOfMemoryError
    //   229	234	448	java/lang/OutOfMemoryError
    //   239	244	448	java/lang/OutOfMemoryError
    //   249	254	448	java/lang/OutOfMemoryError
    //   209	214	468	java/io/IOException
    //   219	224	473	java/io/IOException
    //   229	234	478	java/io/IOException
    //   239	244	483	java/io/IOException
    //   293	298	488	java/io/IOException
    //   303	308	493	java/io/IOException
    //   313	318	498	java/io/IOException
    //   323	328	503	java/io/IOException
    //   293	298	508	java/lang/OutOfMemoryError
    //   303	308	508	java/lang/OutOfMemoryError
    //   313	318	508	java/lang/OutOfMemoryError
    //   323	328	508	java/lang/OutOfMemoryError
    //   333	338	508	java/lang/OutOfMemoryError
    //   338	341	508	java/lang/OutOfMemoryError
    //   333	338	517	java/io/IOException
    //   338	341	517	java/io/IOException
    //   165	170	526	java/net/MalformedURLException
    //   209	214	526	java/net/MalformedURLException
    //   219	224	526	java/net/MalformedURLException
    //   229	234	526	java/net/MalformedURLException
    //   239	244	526	java/net/MalformedURLException
    //   249	254	526	java/net/MalformedURLException
    //   22	38	531	finally
    //   42	85	551	finally
    //   117	124	551	finally
    //   89	100	576	finally
    //   112	117	576	finally
    //   100	112	598	finally
    //   128	139	617	finally
    //   139	146	639	finally
    //   150	155	662	finally
    //   22	38	689	java/io/EOFException
    //   42	85	713	java/io/EOFException
    //   117	124	713	java/io/EOFException
    //   89	100	738	java/io/EOFException
    //   112	117	738	java/io/EOFException
    //   100	112	764	java/io/EOFException
    //   128	139	791	java/io/EOFException
    //   139	146	817	java/io/EOFException
    //   150	155	844	java/io/EOFException
  }

  public final s a(String paramString1, String paramString2)
  {
    s locals = a(paramString1, null);
    if ((locals.a() == ServerMessage.Status.b) && (paramString2 != null))
      locals = a(paramString2, null);
    return locals;
  }

  public final s a(String paramString1, String paramString2, String paramString3)
  {
    ServerMessage.Status localStatus1 = ServerMessage.Status.c;
    String str1 = a.a(paramString1);
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(new BasicNameValuePair("data", str1));
    s locals1 = a(paramString2, localArrayList);
    ServerMessage.Status localStatus2 = locals1.a();
    String str2 = locals1.b();
    if ((localStatus2 == ServerMessage.Status.a) && (str2.equals("1\n")))
      localStatus1 = ServerMessage.Status.a;
    String str4;
    ServerMessage.Status localStatus3;
    String str3;
    if ((localStatus2 == ServerMessage.Status.b) && (paramString3 != null))
    {
      s locals2 = a(paramString1, paramString3, null);
      ServerMessage.Status localStatus4 = locals2.a();
      str4 = locals2.b();
      if (localStatus4 != ServerMessage.Status.a)
      {
        Log.e("MixpanelAPI", "Could not post data to Mixpanel");
        localStatus3 = localStatus1;
        str3 = str4;
      }
    }
    while (true)
    {
      return new s(localStatus3, str3);
      localStatus3 = ServerMessage.Status.a;
      str3 = str4;
      continue;
      localStatus3 = localStatus1;
      str3 = str2;
    }
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.ServerMessage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
