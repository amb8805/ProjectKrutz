package android.support.v7.internal.widget;

import android.os.AsyncTask;

final class i extends AsyncTask<Object, Void, Void>
{
  private i(d paramd)
  {
  }

  // ERROR //
  private Void a(Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_1
    //   3: iconst_0
    //   4: aaload
    //   5: checkcast 28	java/util/List
    //   8: astore_3
    //   9: aload_1
    //   10: iconst_1
    //   11: aaload
    //   12: checkcast 30	java/lang/String
    //   15: astore 4
    //   17: aload_0
    //   18: getfield 11	android/support/v7/internal/widget/i:a	Landroid/support/v7/internal/widget/d;
    //   21: invokestatic 35	android/support/v7/internal/widget/d:a	(Landroid/support/v7/internal/widget/d;)Landroid/content/Context;
    //   24: aload 4
    //   26: iconst_0
    //   27: invokevirtual 41	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   30: astore 7
    //   32: invokestatic 47	android/util/Xml:newSerializer	()Lorg/xmlpull/v1/XmlSerializer;
    //   35: astore 8
    //   37: aload 8
    //   39: aload 7
    //   41: aconst_null
    //   42: invokeinterface 53 3 0
    //   47: aload 8
    //   49: ldc 55
    //   51: iconst_1
    //   52: invokestatic 61	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   55: invokeinterface 65 3 0
    //   60: aload 8
    //   62: aconst_null
    //   63: ldc 67
    //   65: invokeinterface 71 3 0
    //   70: pop
    //   71: aload_3
    //   72: invokeinterface 75 1 0
    //   77: istore 25
    //   79: iload_2
    //   80: iload 25
    //   82: if_icmpge +130 -> 212
    //   85: aload_3
    //   86: iconst_0
    //   87: invokeinterface 79 2 0
    //   92: checkcast 81	android/support/v7/internal/widget/g
    //   95: astore 26
    //   97: aload 8
    //   99: aconst_null
    //   100: ldc 83
    //   102: invokeinterface 71 3 0
    //   107: pop
    //   108: aload 8
    //   110: aconst_null
    //   111: ldc 85
    //   113: aload 26
    //   115: getfield 88	android/support/v7/internal/widget/g:a	Landroid/content/ComponentName;
    //   118: invokevirtual 94	android/content/ComponentName:flattenToString	()Ljava/lang/String;
    //   121: invokeinterface 98 4 0
    //   126: pop
    //   127: aload 8
    //   129: aconst_null
    //   130: ldc 100
    //   132: aload 26
    //   134: getfield 104	android/support/v7/internal/widget/g:b	J
    //   137: invokestatic 107	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   140: invokeinterface 98 4 0
    //   145: pop
    //   146: aload 8
    //   148: aconst_null
    //   149: ldc 109
    //   151: aload 26
    //   153: getfield 113	android/support/v7/internal/widget/g:c	F
    //   156: invokestatic 116	java/lang/String:valueOf	(F)Ljava/lang/String;
    //   159: invokeinterface 98 4 0
    //   164: pop
    //   165: aload 8
    //   167: aconst_null
    //   168: ldc 83
    //   170: invokeinterface 119 3 0
    //   175: pop
    //   176: iinc 2 1
    //   179: goto -100 -> 79
    //   182: astore 5
    //   184: invokestatic 122	android/support/v7/internal/widget/d:d	()Ljava/lang/String;
    //   187: new 124	java/lang/StringBuilder
    //   190: dup
    //   191: ldc 126
    //   193: invokespecial 129	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   196: aload 4
    //   198: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: invokevirtual 136	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   204: aload 5
    //   206: invokestatic 142	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   209: pop
    //   210: aconst_null
    //   211: areturn
    //   212: aload 8
    //   214: aconst_null
    //   215: ldc 67
    //   217: invokeinterface 119 3 0
    //   222: pop
    //   223: aload 8
    //   225: invokeinterface 145 1 0
    //   230: aload_0
    //   231: getfield 11	android/support/v7/internal/widget/i:a	Landroid/support/v7/internal/widget/d;
    //   234: invokestatic 148	android/support/v7/internal/widget/d:c	(Landroid/support/v7/internal/widget/d;)Z
    //   237: pop
    //   238: aload 7
    //   240: ifnull -30 -> 210
    //   243: aload 7
    //   245: invokevirtual 153	java/io/FileOutputStream:close	()V
    //   248: aconst_null
    //   249: areturn
    //   250: astore 34
    //   252: aconst_null
    //   253: areturn
    //   254: astore 20
    //   256: invokestatic 122	android/support/v7/internal/widget/d:d	()Ljava/lang/String;
    //   259: new 124	java/lang/StringBuilder
    //   262: dup
    //   263: ldc 126
    //   265: invokespecial 129	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   268: aload_0
    //   269: getfield 11	android/support/v7/internal/widget/i:a	Landroid/support/v7/internal/widget/d;
    //   272: invokestatic 156	android/support/v7/internal/widget/d:b	(Landroid/support/v7/internal/widget/d;)Ljava/lang/String;
    //   275: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: invokevirtual 136	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   281: aload 20
    //   283: invokestatic 142	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   286: pop
    //   287: aload_0
    //   288: getfield 11	android/support/v7/internal/widget/i:a	Landroid/support/v7/internal/widget/d;
    //   291: invokestatic 148	android/support/v7/internal/widget/d:c	(Landroid/support/v7/internal/widget/d;)Z
    //   294: pop
    //   295: aload 7
    //   297: ifnull -87 -> 210
    //   300: aload 7
    //   302: invokevirtual 153	java/io/FileOutputStream:close	()V
    //   305: aconst_null
    //   306: areturn
    //   307: astore 23
    //   309: aconst_null
    //   310: areturn
    //   311: astore 16
    //   313: invokestatic 122	android/support/v7/internal/widget/d:d	()Ljava/lang/String;
    //   316: new 124	java/lang/StringBuilder
    //   319: dup
    //   320: ldc 126
    //   322: invokespecial 129	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   325: aload_0
    //   326: getfield 11	android/support/v7/internal/widget/i:a	Landroid/support/v7/internal/widget/d;
    //   329: invokestatic 156	android/support/v7/internal/widget/d:b	(Landroid/support/v7/internal/widget/d;)Ljava/lang/String;
    //   332: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   335: invokevirtual 136	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   338: aload 16
    //   340: invokestatic 142	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   343: pop
    //   344: aload_0
    //   345: getfield 11	android/support/v7/internal/widget/i:a	Landroid/support/v7/internal/widget/d;
    //   348: invokestatic 148	android/support/v7/internal/widget/d:c	(Landroid/support/v7/internal/widget/d;)Z
    //   351: pop
    //   352: aload 7
    //   354: ifnull -144 -> 210
    //   357: aload 7
    //   359: invokevirtual 153	java/io/FileOutputStream:close	()V
    //   362: aconst_null
    //   363: areturn
    //   364: astore 19
    //   366: aconst_null
    //   367: areturn
    //   368: astore 12
    //   370: invokestatic 122	android/support/v7/internal/widget/d:d	()Ljava/lang/String;
    //   373: new 124	java/lang/StringBuilder
    //   376: dup
    //   377: ldc 126
    //   379: invokespecial 129	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   382: aload_0
    //   383: getfield 11	android/support/v7/internal/widget/i:a	Landroid/support/v7/internal/widget/d;
    //   386: invokestatic 156	android/support/v7/internal/widget/d:b	(Landroid/support/v7/internal/widget/d;)Ljava/lang/String;
    //   389: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   392: invokevirtual 136	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   395: aload 12
    //   397: invokestatic 142	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   400: pop
    //   401: aload_0
    //   402: getfield 11	android/support/v7/internal/widget/i:a	Landroid/support/v7/internal/widget/d;
    //   405: invokestatic 148	android/support/v7/internal/widget/d:c	(Landroid/support/v7/internal/widget/d;)Z
    //   408: pop
    //   409: aload 7
    //   411: ifnull -201 -> 210
    //   414: aload 7
    //   416: invokevirtual 153	java/io/FileOutputStream:close	()V
    //   419: aconst_null
    //   420: areturn
    //   421: astore 15
    //   423: aconst_null
    //   424: areturn
    //   425: astore 9
    //   427: aload_0
    //   428: getfield 11	android/support/v7/internal/widget/i:a	Landroid/support/v7/internal/widget/d;
    //   431: invokestatic 148	android/support/v7/internal/widget/d:c	(Landroid/support/v7/internal/widget/d;)Z
    //   434: pop
    //   435: aload 7
    //   437: ifnull +8 -> 445
    //   440: aload 7
    //   442: invokevirtual 153	java/io/FileOutputStream:close	()V
    //   445: aload 9
    //   447: athrow
    //   448: astore 11
    //   450: goto -5 -> 445
    //
    // Exception table:
    //   from	to	target	type
    //   17	32	182	java/io/FileNotFoundException
    //   243	248	250	java/io/IOException
    //   37	79	254	java/lang/IllegalArgumentException
    //   85	176	254	java/lang/IllegalArgumentException
    //   212	230	254	java/lang/IllegalArgumentException
    //   300	305	307	java/io/IOException
    //   37	79	311	java/lang/IllegalStateException
    //   85	176	311	java/lang/IllegalStateException
    //   212	230	311	java/lang/IllegalStateException
    //   357	362	364	java/io/IOException
    //   37	79	368	java/io/IOException
    //   85	176	368	java/io/IOException
    //   212	230	368	java/io/IOException
    //   414	419	421	java/io/IOException
    //   37	79	425	finally
    //   85	176	425	finally
    //   212	230	425	finally
    //   256	287	425	finally
    //   313	344	425	finally
    //   370	401	425	finally
    //   440	445	448	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
