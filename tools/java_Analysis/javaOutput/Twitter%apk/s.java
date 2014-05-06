import android.util.Log;

public final class s
{
  private static final boolean a = Log.isLoggable("MediaUtil", 3);

  public s()
  {
  }

  public static String a(int paramInt1, int paramInt2)
  {
    return "http://maps.google.com/maps/api/staticmap?sensor=false&size=" + paramInt1 + 'x' + paramInt2 + "&markers=";
  }

  private static String a(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    int i;
    do
    {
      return null;
      i = paramString.lastIndexOf('/');
    }
    while ((i == -1) || (i >= paramString.length() - 1));
    return paramString.substring(i + 1);
  }

  // ERROR //
  public static String a(android.content.Context paramContext, org.apache.http.client.HttpClient paramHttpClient, int paramInt, ac paramac, android.net.Uri paramUri, String paramString, bf parambf)
  {
    // Byte code:
    //   0: getstatic 18	s:a	Z
    //   3: ifeq +29 -> 32
    //   6: ldc 10
    //   8: new 24	java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial 68	java/lang/StringBuilder:<init>	()V
    //   15: ldc 70
    //   17: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: aload 4
    //   22: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   25: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   28: invokestatic 77	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   31: pop
    //   32: iload_2
    //   33: tableswitch	default:+23 -> 56, 0:+25->58, 1:+282->315
    //   57: areturn
    //   58: new 79	cl
    //   61: dup
    //   62: aload_3
    //   63: aload_0
    //   64: ldc 80
    //   66: invokevirtual 85	android/content/Context:getString	(I)Ljava/lang/String;
    //   69: invokespecial 88	cl:<init>	(Lac;Ljava/lang/String;)V
    //   72: astore 7
    //   74: ldc 90
    //   76: astore 8
    //   78: ldc 92
    //   80: astore 9
    //   82: new 94	as
    //   85: dup
    //   86: aconst_null
    //   87: invokespecial 97	as:<init>	(Lbf;)V
    //   90: astore 10
    //   92: aload_0
    //   93: invokevirtual 101	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   96: aload 4
    //   98: invokevirtual 107	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   101: astore 19
    //   103: aload 10
    //   105: ldc 109
    //   107: bipush 8
    //   109: invokestatic 113	cr:a	(I)Ljava/lang/String;
    //   112: aload 19
    //   114: invokevirtual 116	as:a	(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)I
    //   117: istore 20
    //   119: getstatic 18	s:a	Z
    //   122: ifeq +29 -> 151
    //   125: ldc 10
    //   127: new 24	java/lang/StringBuilder
    //   130: dup
    //   131: invokespecial 68	java/lang/StringBuilder:<init>	()V
    //   134: ldc 118
    //   136: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: iload 20
    //   141: invokevirtual 33	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   144: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   147: invokestatic 77	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   150: pop
    //   151: aload 10
    //   153: ldc 120
    //   155: aload 9
    //   157: invokevirtual 123	as:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   160: aload 5
    //   162: invokestatic 129	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   165: ifne +12 -> 177
    //   168: aload 10
    //   170: ldc 131
    //   172: aload 5
    //   174: invokevirtual 123	as:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   177: aload 10
    //   179: invokevirtual 133	as:a	()V
    //   182: new 135	org/apache/http/client/methods/HttpPost
    //   185: dup
    //   186: aload 8
    //   188: invokespecial 136	org/apache/http/client/methods/HttpPost:<init>	(Ljava/lang/String;)V
    //   191: astore 21
    //   193: aload 21
    //   195: aload 10
    //   197: invokevirtual 140	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   200: new 142	java/io/ByteArrayOutputStream
    //   203: dup
    //   204: sipush 256
    //   207: invokespecial 145	java/io/ByteArrayOutputStream:<init>	(I)V
    //   210: astore 22
    //   212: new 147	bu
    //   215: dup
    //   216: aload_1
    //   217: aload 21
    //   219: aload 7
    //   221: aload 22
    //   223: aconst_null
    //   224: invokespecial 150	bu:<init>	(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpPost;Lcl;Ljava/io/OutputStream;Lbf;)V
    //   227: iconst_0
    //   228: invokevirtual 153	bu:a	(I)Ln;
    //   231: invokevirtual 159	n:b	()Z
    //   234: ifeq +369 -> 603
    //   237: invokestatic 165	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
    //   240: invokevirtual 169	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   243: new 171	org/xml/sax/InputSource
    //   246: dup
    //   247: new 173	java/io/StringReader
    //   250: dup
    //   251: new 48	java/lang/String
    //   254: dup
    //   255: aload 22
    //   257: invokevirtual 177	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   260: invokespecial 180	java/lang/String:<init>	([B)V
    //   263: ldc 182
    //   265: ldc 184
    //   267: invokevirtual 188	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   270: invokespecial 189	java/io/StringReader:<init>	(Ljava/lang/String;)V
    //   273: invokespecial 192	org/xml/sax/InputSource:<init>	(Ljava/io/Reader;)V
    //   276: invokevirtual 198	javax/xml/parsers/DocumentBuilder:parse	(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
    //   279: invokeinterface 204 1 0
    //   284: astore 23
    //   286: iload_2
    //   287: tableswitch	default:+21 -> 308, 0:+55->342, 1:+149->436
    //   309: ldc_w -18432
    //   312: <illegal opcode>
    //   313: aconst_null
    //   314: areturn
    //   315: new 79	cl
    //   318: dup
    //   319: aload_3
    //   320: aload_0
    //   321: ldc 208
    //   323: invokevirtual 85	android/content/Context:getString	(I)Ljava/lang/String;
    //   326: invokespecial 88	cl:<init>	(Lac;Ljava/lang/String;)V
    //   329: astore 7
    //   331: ldc 210
    //   333: astore 8
    //   335: ldc 212
    //   337: astore 9
    //   339: goto -257 -> 82
    //   342: aload 23
    //   344: ldc 214
    //   346: invokeinterface 220 2 0
    //   351: iconst_0
    //   352: invokeinterface 226 2 0
    //   357: astore 31
    //   359: aload 31
    //   361: ifnull +361 -> 722
    //   364: aload 31
    //   366: invokeinterface 232 1 0
    //   371: astore 32
    //   373: aload 32
    //   375: ifnull +347 -> 722
    //   378: aload 32
    //   380: invokeinterface 235 1 0
    //   385: astore 26
    //   387: aload 26
    //   389: ldc 237
    //   391: invokevirtual 241	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   394: ifeq +149 -> 543
    //   397: new 63	java/io/IOException
    //   400: dup
    //   401: ldc 243
    //   403: invokespecial 244	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   406: athrow
    //   407: astore 11
    //   409: aload 19
    //   411: astore 12
    //   413: getstatic 18	s:a	Z
    //   416: ifeq +13 -> 429
    //   419: ldc 10
    //   421: ldc 246
    //   423: aload 11
    //   425: invokestatic 249	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   428: pop
    //   429: aload 12
    //   431: invokestatic 207	cr:a	(Ljava/io/Closeable;)V
    //   434: aconst_null
    //   435: areturn
    //   436: aload 23
    //   438: ldc 251
    //   440: invokeinterface 255 2 0
    //   445: ldc_w 257
    //   448: invokevirtual 241	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   451: ifeq +145 -> 596
    //   454: aload 23
    //   456: invokeinterface 261 1 0
    //   461: astore 24
    //   463: iconst_0
    //   464: istore 25
    //   466: iload 25
    //   468: aload 24
    //   470: invokeinterface 264 1 0
    //   475: if_icmpge +115 -> 590
    //   478: aload 24
    //   480: iload 25
    //   482: invokeinterface 226 2 0
    //   487: astore 28
    //   489: aload 28
    //   491: instanceof 216
    //   494: ifeq +90 -> 584
    //   497: aload 28
    //   499: checkcast 216	org/w3c/dom/Element
    //   502: astore 29
    //   504: aload 29
    //   506: invokeinterface 267 1 0
    //   511: ldc_w 269
    //   514: invokevirtual 241	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   517: ifeq +67 -> 584
    //   520: aload 29
    //   522: invokeinterface 270 1 0
    //   527: astore 30
    //   529: aload 30
    //   531: ifnull +53 -> 584
    //   534: aload 30
    //   536: invokeinterface 235 1 0
    //   541: astore 26
    //   543: getstatic 18	s:a	Z
    //   546: ifeq +30 -> 576
    //   549: ldc 10
    //   551: new 24	java/lang/StringBuilder
    //   554: dup
    //   555: invokespecial 68	java/lang/StringBuilder:<init>	()V
    //   558: ldc_w 272
    //   561: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   564: aload 26
    //   566: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   569: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   572: invokestatic 77	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   575: pop
    //   576: aload 19
    //   578: invokestatic 207	cr:a	(Ljava/io/Closeable;)V
    //   581: aload 26
    //   583: areturn
    //   584: iinc 25 1
    //   587: goto -121 -> 466
    //   590: aconst_null
    //   591: astore 26
    //   593: goto -50 -> 543
    //   596: aload 19
    //   598: invokestatic 207	cr:a	(Ljava/io/Closeable;)V
    //   601: aconst_null
    //   602: areturn
    //   603: aload 19
    //   605: invokestatic 207	cr:a	(Ljava/io/Closeable;)V
    //   608: goto -174 -> 434
    //   611: astore 17
    //   613: aconst_null
    //   614: astore 12
    //   616: getstatic 18	s:a	Z
    //   619: ifeq +13 -> 632
    //   622: ldc 10
    //   624: ldc 246
    //   626: aload 17
    //   628: invokestatic 249	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   631: pop
    //   632: aload 12
    //   634: invokestatic 207	cr:a	(Ljava/io/Closeable;)V
    //   637: goto -203 -> 434
    //   640: astore 15
    //   642: aconst_null
    //   643: astore 12
    //   645: getstatic 18	s:a	Z
    //   648: ifeq +13 -> 661
    //   651: ldc 10
    //   653: ldc 246
    //   655: aload 15
    //   657: invokestatic 249	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   660: pop
    //   661: aload 12
    //   663: invokestatic 207	cr:a	(Ljava/io/Closeable;)V
    //   666: goto -232 -> 434
    //   669: astore 13
    //   671: aconst_null
    //   672: astore 12
    //   674: aload 12
    //   676: invokestatic 207	cr:a	(Ljava/io/Closeable;)V
    //   679: aload 13
    //   681: athrow
    //   682: astore 13
    //   684: aload 19
    //   686: astore 12
    //   688: goto -14 -> 674
    //   691: astore 13
    //   693: goto -19 -> 674
    //   696: astore 15
    //   698: aload 19
    //   700: astore 12
    //   702: goto -57 -> 645
    //   705: astore 17
    //   707: aload 19
    //   709: astore 12
    //   711: goto -95 -> 616
    //   714: astore 11
    //   716: aconst_null
    //   717: astore 12
    //   719: goto -306 -> 413
    //   722: aconst_null
    //   723: astore 26
    //   725: goto -182 -> 543
    //
    // Exception table:
    //   from	to	target	type
    //   103	151	407	java/io/IOException
    //   151	177	407	java/io/IOException
    //   177	286	407	java/io/IOException
    //   342	359	407	java/io/IOException
    //   364	373	407	java/io/IOException
    //   378	407	407	java/io/IOException
    //   436	463	407	java/io/IOException
    //   466	529	407	java/io/IOException
    //   534	543	407	java/io/IOException
    //   543	576	407	java/io/IOException
    //   82	103	611	javax/xml/parsers/ParserConfigurationException
    //   82	103	640	org/xml/sax/SAXException
    //   82	103	669	finally
    //   103	151	682	finally
    //   151	177	682	finally
    //   177	286	682	finally
    //   342	359	682	finally
    //   364	373	682	finally
    //   378	407	682	finally
    //   436	463	682	finally
    //   466	529	682	finally
    //   534	543	682	finally
    //   543	576	682	finally
    //   413	429	691	finally
    //   616	632	691	finally
    //   645	661	691	finally
    //   103	151	696	org/xml/sax/SAXException
    //   151	177	696	org/xml/sax/SAXException
    //   177	286	696	org/xml/sax/SAXException
    //   342	359	696	org/xml/sax/SAXException
    //   364	373	696	org/xml/sax/SAXException
    //   378	407	696	org/xml/sax/SAXException
    //   436	463	696	org/xml/sax/SAXException
    //   466	529	696	org/xml/sax/SAXException
    //   534	543	696	org/xml/sax/SAXException
    //   543	576	696	org/xml/sax/SAXException
    //   103	151	705	javax/xml/parsers/ParserConfigurationException
    //   151	177	705	javax/xml/parsers/ParserConfigurationException
    //   177	286	705	javax/xml/parsers/ParserConfigurationException
    //   342	359	705	javax/xml/parsers/ParserConfigurationException
    //   364	373	705	javax/xml/parsers/ParserConfigurationException
    //   378	407	705	javax/xml/parsers/ParserConfigurationException
    //   436	463	705	javax/xml/parsers/ParserConfigurationException
    //   466	529	705	javax/xml/parsers/ParserConfigurationException
    //   534	543	705	javax/xml/parsers/ParserConfigurationException
    //   543	576	705	javax/xml/parsers/ParserConfigurationException
    //   82	103	714	java/io/IOException
  }

  // ERROR //
  public static String a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 278	s:c	(Ljava/lang/String;)I
    //   4: istore_1
    //   5: iload_1
    //   6: tableswitch	default:+38 -> 44, 1:+40->46, 2:+61->67, 3:+90->96, 4:+119->125, 5:+148->154, 6:+183->189
    //   45: areturn
    //   46: new 24	java/lang/StringBuilder
    //   49: dup
    //   50: invokespecial 68	java/lang/StringBuilder:<init>	()V
    //   53: aload_0
    //   54: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: ldc_w 280
    //   60: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   66: areturn
    //   67: iload_1
    //   68: aload_0
    //   69: invokestatic 282	s:a	(ILjava/lang/String;)Ljava/lang/String;
    //   72: astore 28
    //   74: new 24	java/lang/StringBuilder
    //   77: dup
    //   78: invokespecial 68	java/lang/StringBuilder:<init>	()V
    //   81: ldc_w 284
    //   84: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: aload 28
    //   89: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   95: areturn
    //   96: iload_1
    //   97: aload_0
    //   98: invokestatic 282	s:a	(ILjava/lang/String;)Ljava/lang/String;
    //   101: astore 27
    //   103: new 24	java/lang/StringBuilder
    //   106: dup
    //   107: invokespecial 68	java/lang/StringBuilder:<init>	()V
    //   110: ldc_w 286
    //   113: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: aload 27
    //   118: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   124: areturn
    //   125: iload_1
    //   126: aload_0
    //   127: invokestatic 282	s:a	(ILjava/lang/String;)Ljava/lang/String;
    //   130: astore 26
    //   132: new 24	java/lang/StringBuilder
    //   135: dup
    //   136: invokespecial 68	java/lang/StringBuilder:<init>	()V
    //   139: ldc_w 288
    //   142: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: aload 26
    //   147: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   153: areturn
    //   154: iload_1
    //   155: aload_0
    //   156: invokestatic 282	s:a	(ILjava/lang/String;)Ljava/lang/String;
    //   159: astore 25
    //   161: new 24	java/lang/StringBuilder
    //   164: dup
    //   165: invokespecial 68	java/lang/StringBuilder:<init>	()V
    //   168: ldc_w 290
    //   171: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: aload 25
    //   176: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: ldc_w 292
    //   182: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   188: areturn
    //   189: iload_1
    //   190: aload_0
    //   191: invokestatic 282	s:a	(ILjava/lang/String;)Ljava/lang/String;
    //   194: astore_2
    //   195: aconst_null
    //   196: astore_3
    //   197: aload_2
    //   198: bipush 36
    //   200: invokestatic 298	java/lang/Integer:parseInt	(Ljava/lang/String;I)I
    //   203: invokestatic 302	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   206: astore 15
    //   208: new 304	java/net/URL
    //   211: dup
    //   212: new 24	java/lang/StringBuilder
    //   215: dup
    //   216: invokespecial 68	java/lang/StringBuilder:<init>	()V
    //   219: ldc_w 306
    //   222: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: aload 15
    //   227: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   230: ldc_w 308
    //   233: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   239: invokespecial 309	java/net/URL:<init>	(Ljava/lang/String;)V
    //   242: invokevirtual 313	java/net/URL:openStream	()Ljava/io/InputStream;
    //   245: astore 16
    //   247: new 142	java/io/ByteArrayOutputStream
    //   250: dup
    //   251: sipush 512
    //   254: invokespecial 145	java/io/ByteArrayOutputStream:<init>	(I)V
    //   257: astore 17
    //   259: sipush 512
    //   262: newarray byte
    //   264: astore 21
    //   266: aload 16
    //   268: aload 21
    //   270: iconst_0
    //   271: sipush 512
    //   274: invokevirtual 319	java/io/InputStream:read	([BII)I
    //   277: iconst_m1
    //   278: if_icmpeq +72 -> 350
    //   281: aload 17
    //   283: aload 21
    //   285: invokevirtual 322	java/io/ByteArrayOutputStream:write	([B)V
    //   288: goto -22 -> 266
    //   291: astore 20
    //   293: aload 16
    //   295: astore_3
    //   296: aload 20
    //   298: astore 4
    //   300: getstatic 18	s:a	Z
    //   303: ifeq +14 -> 317
    //   306: ldc 10
    //   308: ldc_w 324
    //   311: aload 4
    //   313: invokestatic 249	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   316: pop
    //   317: aload_3
    //   318: ifnull -274 -> 44
    //   321: aload_3
    //   322: invokevirtual 327	java/io/InputStream:close	()V
    //   325: goto -281 -> 44
    //   328: astore 8
    //   330: getstatic 18	s:a	Z
    //   333: ifeq -289 -> 44
    //   336: ldc 10
    //   338: ldc_w 329
    //   341: aload 8
    //   343: invokestatic 249	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   346: pop
    //   347: goto -303 -> 44
    //   350: new 331	org/json/JSONObject
    //   353: dup
    //   354: aload 17
    //   356: invokevirtual 332	java/io/ByteArrayOutputStream:toString	()Ljava/lang/String;
    //   359: invokespecial 333	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   362: ldc_w 335
    //   365: invokevirtual 339	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   368: ldc_w 341
    //   371: invokevirtual 343	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   374: astore 22
    //   376: aload 16
    //   378: ifnull +8 -> 386
    //   381: aload 16
    //   383: invokevirtual 327	java/io/InputStream:close	()V
    //   386: aload 22
    //   388: areturn
    //   389: astore 23
    //   391: getstatic 18	s:a	Z
    //   394: ifeq -8 -> 386
    //   397: ldc 10
    //   399: ldc_w 329
    //   402: aload 23
    //   404: invokestatic 249	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   407: pop
    //   408: goto -22 -> 386
    //   411: astore 11
    //   413: getstatic 18	s:a	Z
    //   416: ifeq +14 -> 430
    //   419: ldc 10
    //   421: ldc_w 345
    //   424: aload 11
    //   426: invokestatic 249	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   429: pop
    //   430: aload_3
    //   431: ifnull -387 -> 44
    //   434: aload_3
    //   435: invokevirtual 327	java/io/InputStream:close	()V
    //   438: goto -394 -> 44
    //   441: astore 12
    //   443: getstatic 18	s:a	Z
    //   446: ifeq -402 -> 44
    //   449: ldc 10
    //   451: ldc_w 329
    //   454: aload 12
    //   456: invokestatic 249	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   459: pop
    //   460: goto -416 -> 44
    //   463: astore 5
    //   465: aload_3
    //   466: ifnull +7 -> 473
    //   469: aload_3
    //   470: invokevirtual 327	java/io/InputStream:close	()V
    //   473: aload 5
    //   475: athrow
    //   476: astore 6
    //   478: getstatic 18	s:a	Z
    //   481: ifeq -8 -> 473
    //   484: ldc 10
    //   486: ldc_w 329
    //   489: aload 6
    //   491: invokestatic 249	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   494: pop
    //   495: goto -22 -> 473
    //   498: astore 19
    //   500: aload 16
    //   502: astore_3
    //   503: aload 19
    //   505: astore 5
    //   507: goto -42 -> 465
    //   510: astore 18
    //   512: aload 16
    //   514: astore_3
    //   515: aload 18
    //   517: astore 11
    //   519: goto -106 -> 413
    //   522: astore 4
    //   524: aconst_null
    //   525: astore_3
    //   526: goto -226 -> 300
    //
    // Exception table:
    //   from	to	target	type
    //   247	266	291	java/io/IOException
    //   266	288	291	java/io/IOException
    //   350	376	291	java/io/IOException
    //   321	325	328	java/io/IOException
    //   381	386	389	java/io/IOException
    //   197	247	411	org/json/JSONException
    //   434	438	441	java/io/IOException
    //   197	247	463	finally
    //   300	317	463	finally
    //   413	430	463	finally
    //   469	473	476	java/io/IOException
    //   247	266	498	finally
    //   266	288	498	finally
    //   350	376	498	finally
    //   247	266	510	org/json/JSONException
    //   266	288	510	org/json/JSONException
    //   350	376	510	org/json/JSONException
    //   197	247	522	java/io/IOException
  }

  public static boolean b(String paramString)
  {
    int i = c(paramString);
    switch (i)
    {
    default:
      return false;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    String str = a(i, paramString);
    if (str != null)
    {
      int j = str.length();
      for (int k = 0; k < j; k++)
      {
        int m = str.charAt(k);
        if ((m == 46) || (m == 47) || (m == 61) || (m == 63) || (m == 45))
          return false;
      }
      return true;
    }
    return false;
  }

  private static int c(String paramString)
  {
    if (paramString.startsWith("http://yfrog.com/"))
      return 1;
    if (paramString.startsWith("http://twitpic.com/"))
      return 2;
    if (paramString.startsWith("http://plixi.com/"))
      return 3;
    if (paramString.startsWith("http://photozou.jp/photo/show/"))
      return 4;
    if (paramString.startsWith("http://twitgoo.com/"))
      return 5;
    if (paramString.startsWith("http://dailybooth.com/u/"))
      return 6;
    return 0;
  }
}

/* Location:
 * Qualified Name:     s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
