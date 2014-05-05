package com.twitter.android;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.AsyncTask;
import bf;

final class bh extends AsyncTask
  implements DialogInterface.OnClickListener, bf
{
  private final ProgressDialog b;

  public bh(EditProfileActivity paramEditProfileActivity)
  {
    ProgressDialog localProgressDialog = new ProgressDialog(paramEditProfileActivity);
    localProgressDialog.setProgressStyle(1);
    localProgressDialog.setMessage(paramEditProfileActivity.getText(2131427377));
    localProgressDialog.setMax(100);
    localProgressDialog.setButton(-2, paramEditProfileActivity.getString(2131427504), this);
    this.b = localProgressDialog;
  }

  // ERROR //
  private ad a(android.net.Uri[] paramArrayOfUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 16	com/twitter/android/bh:a	Lcom/twitter/android/EditProfileActivity;
    //   4: astore_2
    //   5: aload_0
    //   6: getfield 16	com/twitter/android/bh:a	Lcom/twitter/android/EditProfileActivity;
    //   9: getfield 59	com/twitter/android/EditProfileActivity:a	Lcom/twitter/android/client/g;
    //   12: invokevirtual 65	com/twitter/android/client/g:d	()Ljava/lang/String;
    //   15: astore_3
    //   16: aload_1
    //   17: iconst_0
    //   18: aaload
    //   19: astore 4
    //   21: new 67	org/apache/http/impl/conn/SingleClientConnManager
    //   24: dup
    //   25: getstatic 72	n:b	Lorg/apache/http/params/HttpParams;
    //   28: getstatic 75	n:a	Lorg/apache/http/conn/scheme/SchemeRegistry;
    //   31: invokespecial 78	org/apache/http/impl/conn/SingleClientConnManager:<init>	(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V
    //   34: astore 5
    //   36: aload 5
    //   38: invokestatic 81	n:a	(Lorg/apache/http/conn/ClientConnectionManager;)Lorg/apache/http/client/HttpClient;
    //   41: astore 6
    //   43: new 83	as
    //   46: dup
    //   47: aload_0
    //   48: invokespecial 86	as:<init>	(Lbf;)V
    //   51: astore 7
    //   53: aload_2
    //   54: invokevirtual 92	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   57: aload 4
    //   59: invokevirtual 98	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   62: astore 12
    //   64: aload 12
    //   66: invokevirtual 104	java/io/InputStream:available	()I
    //   69: newarray byte
    //   71: astore 13
    //   73: aload 12
    //   75: aload 13
    //   77: iconst_0
    //   78: aload 13
    //   80: arraylength
    //   81: invokevirtual 108	java/io/InputStream:read	([BII)I
    //   84: istore 14
    //   86: aload 7
    //   88: ldc 110
    //   90: bipush 8
    //   92: invokestatic 114	cr:a	(I)Ljava/lang/String;
    //   95: aload 13
    //   97: invokevirtual 117	as:a	(Ljava/lang/String;Ljava/lang/String;[B)I
    //   100: pop
    //   101: aload 7
    //   103: invokevirtual 119	as:a	()V
    //   106: getstatic 122	com/twitter/android/EditProfileActivity:d	Z
    //   109: ifeq +29 -> 138
    //   112: ldc 124
    //   114: new 126	java/lang/StringBuilder
    //   117: dup
    //   118: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   121: ldc 129
    //   123: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: iload 14
    //   128: invokevirtual 136	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   131: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   134: invokestatic 144	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   137: pop
    //   138: aload_2
    //   139: invokestatic 149	ai:a	(Landroid/content/Context;)Lai;
    //   142: astore 16
    //   144: aload 16
    //   146: iconst_2
    //   147: anewarray 151	java/lang/Object
    //   150: dup
    //   151: iconst_0
    //   152: ldc 153
    //   154: aastore
    //   155: dup
    //   156: iconst_1
    //   157: ldc 155
    //   159: aastore
    //   160: invokevirtual 158	ai:a	([Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   163: ldc 160
    //   165: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: astore 17
    //   170: new 162	java/io/ByteArrayOutputStream
    //   173: dup
    //   174: invokespecial 163	java/io/ByteArrayOutputStream:<init>	()V
    //   177: astore 18
    //   179: aload 16
    //   181: aload 6
    //   183: aload 17
    //   185: new 165	cl
    //   188: dup
    //   189: aload_0
    //   190: getfield 16	com/twitter/android/bh:a	Lcom/twitter/android/EditProfileActivity;
    //   193: getfield 59	com/twitter/android/EditProfileActivity:a	Lcom/twitter/android/client/g;
    //   196: invokevirtual 169	com/twitter/android/client/g:c	()Lac;
    //   199: invokespecial 172	cl:<init>	(Lac;)V
    //   202: aload 7
    //   204: aload 18
    //   206: invokestatic 175	n:a	(Lai;Lorg/apache/http/client/HttpClient;Ljava/lang/CharSequence;Lcl;Lorg/apache/http/HttpEntity;Ljava/io/OutputStream;)Ln;
    //   209: astore 19
    //   211: aload 16
    //   213: aload 19
    //   215: invokevirtual 178	ai:a	(Ln;)V
    //   218: aload 19
    //   220: iconst_0
    //   221: invokevirtual 181	n:a	(I)Ln;
    //   224: pop
    //   225: aload 19
    //   227: invokevirtual 184	n:b	()Z
    //   230: ifeq +123 -> 353
    //   233: getstatic 189	do:a	Lef;
    //   236: aload 18
    //   238: invokevirtual 193	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   241: invokevirtual 198	ef:a	([B)Lbq;
    //   244: astore 21
    //   246: aload 21
    //   248: invokevirtual 204	bq:g	()Lcp;
    //   251: pop
    //   252: aload 21
    //   254: invokestatic 210	java/lang/System:currentTimeMillis	()J
    //   257: invokestatic 213	do:a	(Lbq;J)Lad;
    //   260: astore 23
    //   262: aload_2
    //   263: aload_3
    //   264: aload 23
    //   266: aconst_null
    //   267: invokestatic 218	com/twitter/android/platform/d:a	(Landroid/content/Context;Ljava/lang/String;Lad;Lcb;)V
    //   270: aload_2
    //   271: aload 23
    //   273: getfield 223	ad:a	J
    //   276: invokestatic 228	com/twitter/android/provider/ak:a	(Landroid/content/Context;J)Lcom/twitter/android/provider/ak;
    //   279: astore 24
    //   281: new 230	java/util/ArrayList
    //   284: dup
    //   285: invokespecial 231	java/util/ArrayList:<init>	()V
    //   288: astore 25
    //   290: aload 25
    //   292: aload 23
    //   294: invokevirtual 235	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   297: pop
    //   298: aload 24
    //   300: aload 25
    //   302: ldc2_w 236
    //   305: iconst_m1
    //   306: ldc2_w 236
    //   309: aconst_null
    //   310: aconst_null
    //   311: invokevirtual 240	com/twitter/android/provider/ak:a	(Ljava/util/Collection;JIJLjava/lang/String;Ljava/lang/String;)I
    //   314: pop
    //   315: aload 24
    //   317: aload 23
    //   319: getfield 223	ad:a	J
    //   322: aload 23
    //   324: getfield 243	ad:c	Ljava/lang/String;
    //   327: new 245	java/io/ByteArrayInputStream
    //   330: dup
    //   331: aload 13
    //   333: invokespecial 248	java/io/ByteArrayInputStream:<init>	([B)V
    //   336: invokevirtual 251	com/twitter/android/provider/ak:a	(JLjava/lang/String;Ljava/io/ByteArrayInputStream;)[B
    //   339: pop
    //   340: aload 12
    //   342: invokestatic 254	cr:a	(Ljava/io/Closeable;)V
    //   345: aload 5
    //   347: invokevirtual 257	org/apache/http/impl/conn/SingleClientConnManager:shutdown	()V
    //   350: aload 23
    //   352: areturn
    //   353: aload 12
    //   355: invokestatic 254	cr:a	(Ljava/io/Closeable;)V
    //   358: aload 5
    //   360: invokevirtual 257	org/apache/http/impl/conn/SingleClientConnManager:shutdown	()V
    //   363: aconst_null
    //   364: areturn
    //   365: astore 10
    //   367: aconst_null
    //   368: astore 9
    //   370: getstatic 122	com/twitter/android/EditProfileActivity:d	Z
    //   373: ifeq +14 -> 387
    //   376: ldc 124
    //   378: ldc_w 259
    //   381: aload 10
    //   383: invokestatic 262	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   386: pop
    //   387: aload 9
    //   389: invokestatic 254	cr:a	(Ljava/io/Closeable;)V
    //   392: aload 5
    //   394: invokevirtual 257	org/apache/http/impl/conn/SingleClientConnManager:shutdown	()V
    //   397: goto -34 -> 363
    //   400: astore 8
    //   402: aconst_null
    //   403: astore 9
    //   405: aload 9
    //   407: invokestatic 254	cr:a	(Ljava/io/Closeable;)V
    //   410: aload 5
    //   412: invokevirtual 257	org/apache/http/impl/conn/SingleClientConnManager:shutdown	()V
    //   415: aload 8
    //   417: athrow
    //   418: astore 8
    //   420: aload 12
    //   422: astore 9
    //   424: goto -19 -> 405
    //   427: astore 8
    //   429: goto -24 -> 405
    //   432: astore 10
    //   434: aload 12
    //   436: astore 9
    //   438: goto -68 -> 370
    //
    // Exception table:
    //   from	to	target	type
    //   43	64	365	java/io/IOException
    //   43	64	400	finally
    //   64	138	418	finally
    //   138	340	418	finally
    //   370	387	427	finally
    //   64	138	432	java/io/IOException
    //   138	340	432	java/io/IOException
  }

  public final void a(long paramLong1, long paramLong2)
  {
    Integer[] arrayOfInteger = new Integer[1];
    arrayOfInteger[0] = Integer.valueOf((int)(100L * paramLong1 / paramLong2));
    publishProgress(arrayOfInteger);
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    cancel(true);
  }

  protected final void onPreExecute()
  {
    this.b.show();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.bh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
