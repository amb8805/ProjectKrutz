package com.spotify.cosmos.router;

import com.spotify.cosmos.annotations.UsedFromNativeCode;

@UsedFromNativeCode
public final class RouterParams
{
  public static final String ENCODING_FORMAT = "UTF-8";
  public String cacheIdentifier;
  public boolean disableEcho;
  public boolean disableGzip;
  public boolean disableLog;
  public boolean disableMessages;
  public boolean disableProtobuf;
  public boolean disableThreads;
  public String identifier;
  public String session;
  public String version;

  public RouterParams()
  {
  }

  // ERROR //
  public static RouterParams createFromEncodedJson(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +13 -> 14
    //   4: new 32	com/spotify/cosmos/router/RouterParams$SerializationException
    //   7: dup
    //   8: ldc 34
    //   10: invokespecial 37	com/spotify/cosmos/router/RouterParams$SerializationException:<init>	(Ljava/lang/String;)V
    //   13: athrow
    //   14: aload_0
    //   15: ldc 9
    //   17: invokestatic 43	java/net/URLDecoder:decode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   20: astore_2
    //   21: new 45	com/fasterxml/jackson/databind/ObjectMapper
    //   24: dup
    //   25: invokespecial 46	com/fasterxml/jackson/databind/ObjectMapper:<init>	()V
    //   28: astore_3
    //   29: aload_3
    //   30: aload_2
    //   31: ldc 2
    //   33: invokevirtual 50	com/fasterxml/jackson/databind/ObjectMapper:readValue	(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   36: checkcast 2	com/spotify/cosmos/router/RouterParams
    //   39: astore 5
    //   41: aload 5
    //   43: areturn
    //   44: astore_1
    //   45: new 32	com/spotify/cosmos/router/RouterParams$SerializationException
    //   48: dup
    //   49: new 52	java/lang/StringBuilder
    //   52: dup
    //   53: ldc 54
    //   55: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   58: aload_0
    //   59: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   65: aload_1
    //   66: invokespecial 66	com/spotify/cosmos/router/RouterParams$SerializationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   69: athrow
    //   70: astore 4
    //   72: new 32	com/spotify/cosmos/router/RouterParams$SerializationException
    //   75: dup
    //   76: new 52	java/lang/StringBuilder
    //   79: dup
    //   80: ldc 68
    //   82: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   85: aload_0
    //   86: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   92: aload 4
    //   94: invokespecial 66	com/spotify/cosmos/router/RouterParams$SerializationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   97: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   14	21	44	java/io/UnsupportedEncodingException
    //   29	41	70	java/io/IOException
  }

  // ERROR //
  public final String serializeToEncodedJson()
  {
    // Byte code:
    //   0: new 45	com/fasterxml/jackson/databind/ObjectMapper
    //   3: dup
    //   4: invokespecial 46	com/fasterxml/jackson/databind/ObjectMapper:<init>	()V
    //   7: astore_1
    //   8: new 71	java/io/StringWriter
    //   11: dup
    //   12: invokespecial 72	java/io/StringWriter:<init>	()V
    //   15: astore_2
    //   16: aload_1
    //   17: aload_2
    //   18: aload_0
    //   19: invokevirtual 76	com/fasterxml/jackson/databind/ObjectMapper:writeValue	(Ljava/io/Writer;Ljava/lang/Object;)V
    //   22: aload_2
    //   23: invokevirtual 77	java/lang/Object:toString	()Ljava/lang/String;
    //   26: astore 4
    //   28: aload 4
    //   30: ldc 9
    //   32: invokestatic 82	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   35: astore 6
    //   37: aload 6
    //   39: areturn
    //   40: astore_3
    //   41: new 32	com/spotify/cosmos/router/RouterParams$SerializationException
    //   44: dup
    //   45: ldc 84
    //   47: aload_3
    //   48: invokespecial 66	com/spotify/cosmos/router/RouterParams$SerializationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   51: athrow
    //   52: astore 5
    //   54: new 32	com/spotify/cosmos/router/RouterParams$SerializationException
    //   57: dup
    //   58: new 52	java/lang/StringBuilder
    //   61: dup
    //   62: ldc 86
    //   64: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   67: aload 4
    //   69: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   75: aload 5
    //   77: invokespecial 66	com/spotify/cosmos/router/RouterParams$SerializationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   80: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   16	22	40	java/io/IOException
    //   28	37	52	java/io/UnsupportedEncodingException
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.router.RouterParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
