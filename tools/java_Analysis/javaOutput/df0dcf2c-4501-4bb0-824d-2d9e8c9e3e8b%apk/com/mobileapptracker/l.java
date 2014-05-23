package com.mobileapptracker;

import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

final class l
{
  private HttpClient a;

  public l()
  {
    SchemeRegistry localSchemeRegistry = new SchemeRegistry();
    localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
    localSchemeRegistry.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    HttpProtocolParams.setVersion(localBasicHttpParams, HttpVersion.HTTP_1_1);
    HttpProtocolParams.setContentCharset(localBasicHttpParams, "UTF-8");
    HttpConnectionParams.setSocketBufferSize(localBasicHttpParams, 8192);
    HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 60000);
    HttpConnectionParams.setSoTimeout(localBasicHttpParams, 60000);
    this.a = new DefaultHttpClient(new ThreadSafeClientConnManager(localBasicHttpParams, localSchemeRegistry), localBasicHttpParams);
  }

  // ERROR //
  public final org.json.JSONObject a(java.lang.String paramString, org.json.JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual 92	org/json/JSONObject:length	()I
    //   4: ifne +195 -> 199
    //   7: aload_0
    //   8: getfield 83	com/mobileapptracker/l:a	Lorg/apache/http/client/HttpClient;
    //   11: new 94	org/apache/http/client/methods/HttpGet
    //   14: dup
    //   15: aload_1
    //   16: invokespecial 97	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   19: invokeinterface 103 2 0
    //   24: astore 18
    //   26: aload 18
    //   28: astore 5
    //   30: aload 5
    //   32: ifnull +257 -> 289
    //   35: aload 5
    //   37: invokeinterface 109 1 0
    //   42: astore 7
    //   44: ldc 111
    //   46: new 113	java/lang/StringBuilder
    //   49: dup
    //   50: ldc 115
    //   52: invokespecial 116	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   55: aload 7
    //   57: invokeinterface 121 1 0
    //   62: invokevirtual 125	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   65: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   68: invokestatic 135	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   71: pop
    //   72: aload 7
    //   74: invokeinterface 121 1 0
    //   79: sipush 200
    //   82: if_icmplt +217 -> 299
    //   85: aload 7
    //   87: invokeinterface 121 1 0
    //   92: sipush 299
    //   95: if_icmpgt +204 -> 299
    //   98: new 137	java/io/BufferedReader
    //   101: dup
    //   102: new 139	java/io/InputStreamReader
    //   105: dup
    //   106: aload 5
    //   108: invokeinterface 143 1 0
    //   113: invokeinterface 149 1 0
    //   118: ldc 54
    //   120: invokespecial 152	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   123: invokespecial 155	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   126: astore 10
    //   128: new 113	java/lang/StringBuilder
    //   131: dup
    //   132: invokespecial 156	java/lang/StringBuilder:<init>	()V
    //   135: astore 11
    //   137: aload 10
    //   139: invokevirtual 159	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   142: astore 12
    //   144: aload 12
    //   146: ifnonnull +120 -> 266
    //   149: aload 10
    //   151: invokevirtual 162	java/io/BufferedReader:close	()V
    //   154: aload 11
    //   156: invokevirtual 163	java/lang/StringBuilder:length	()I
    //   159: ifle +132 -> 291
    //   162: new 88	org/json/JSONObject
    //   165: dup
    //   166: new 165	org/json/JSONTokener
    //   169: dup
    //   170: aload 11
    //   172: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   175: invokespecial 166	org/json/JSONTokener:<init>	(Ljava/lang/String;)V
    //   178: invokespecial 169	org/json/JSONObject:<init>	(Lorg/json/JSONTokener;)V
    //   181: astore 13
    //   183: aload 13
    //   185: areturn
    //   186: astore 17
    //   188: aload 17
    //   190: invokevirtual 172	java/lang/Exception:printStackTrace	()V
    //   193: aconst_null
    //   194: astore 5
    //   196: goto -166 -> 30
    //   199: new 174	org/apache/http/entity/StringEntity
    //   202: dup
    //   203: aload_2
    //   204: invokevirtual 175	org/json/JSONObject:toString	()Ljava/lang/String;
    //   207: invokespecial 176	org/apache/http/entity/StringEntity:<init>	(Ljava/lang/String;)V
    //   210: astore_3
    //   211: aload_3
    //   212: ldc 178
    //   214: invokevirtual 181	org/apache/http/entity/StringEntity:setContentType	(Ljava/lang/String;)V
    //   217: new 183	org/apache/http/client/methods/HttpPost
    //   220: dup
    //   221: aload_1
    //   222: invokespecial 184	org/apache/http/client/methods/HttpPost:<init>	(Ljava/lang/String;)V
    //   225: astore 15
    //   227: aload 15
    //   229: aload_3
    //   230: invokevirtual 188	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   233: aload_0
    //   234: getfield 83	com/mobileapptracker/l:a	Lorg/apache/http/client/HttpClient;
    //   237: aload 15
    //   239: invokeinterface 103 2 0
    //   244: astore 16
    //   246: aload 16
    //   248: astore 5
    //   250: goto -220 -> 30
    //   253: astore 4
    //   255: aload 4
    //   257: invokevirtual 172	java/lang/Exception:printStackTrace	()V
    //   260: aconst_null
    //   261: astore 5
    //   263: goto -233 -> 30
    //   266: aload 11
    //   268: aload 12
    //   270: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   273: ldc 193
    //   275: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: pop
    //   279: goto -142 -> 137
    //   282: astore 6
    //   284: aload 6
    //   286: invokevirtual 172	java/lang/Exception:printStackTrace	()V
    //   289: aconst_null
    //   290: areturn
    //   291: new 88	org/json/JSONObject
    //   294: dup
    //   295: invokespecial 194	org/json/JSONObject:<init>	()V
    //   298: areturn
    //   299: aload 7
    //   301: invokeinterface 121 1 0
    //   306: sipush 500
    //   309: if_icmplt -20 -> 289
    //   312: new 88	org/json/JSONObject
    //   315: dup
    //   316: invokespecial 194	org/json/JSONObject:<init>	()V
    //   319: astore 9
    //   321: aload 9
    //   323: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   7	26	186	java/lang/Exception
    //   199	246	253	java/lang/Exception
    //   35	137	282	java/lang/Exception
    //   137	144	282	java/lang/Exception
    //   149	183	282	java/lang/Exception
    //   266	279	282	java/lang/Exception
    //   291	299	282	java/lang/Exception
    //   299	321	282	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     com.mobileapptracker.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
