package com.spotify.mobile.android.util;

import java.util.Properties;

public final class cd
{
  private final Properties a;
  private boolean b;

  // ERROR //
  public cd()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 16	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: new 18	java/util/Properties
    //   8: dup
    //   9: invokespecial 19	java/util/Properties:<init>	()V
    //   12: putfield 21	com/spotify/mobile/android/util/cd:a	Ljava/util/Properties;
    //   15: aconst_null
    //   16: astore_1
    //   17: new 23	java/io/FileReader
    //   20: dup
    //   21: ldc 25
    //   23: invokespecial 28	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   26: astore_2
    //   27: aload_0
    //   28: getfield 21	com/spotify/mobile/android/util/cd:a	Ljava/util/Properties;
    //   31: aload_2
    //   32: invokevirtual 32	java/util/Properties:load	(Ljava/io/Reader;)V
    //   35: aload_0
    //   36: iconst_1
    //   37: putfield 34	com/spotify/mobile/android/util/cd:b	Z
    //   40: aload_2
    //   41: invokevirtual 37	java/io/FileReader:close	()V
    //   44: return
    //   45: astore 12
    //   47: aconst_null
    //   48: astore_2
    //   49: aload_2
    //   50: ifnull -6 -> 44
    //   53: aload_2
    //   54: invokevirtual 37	java/io/FileReader:close	()V
    //   57: return
    //   58: astore 4
    //   60: return
    //   61: astore 6
    //   63: aload 6
    //   65: ldc 39
    //   67: invokestatic 44	com/spotify/mobile/android/util/bp:b	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   70: aload_1
    //   71: ifnull -27 -> 44
    //   74: aload_1
    //   75: invokevirtual 37	java/io/FileReader:close	()V
    //   78: return
    //   79: astore 9
    //   81: return
    //   82: astore 7
    //   84: aload_1
    //   85: ifnull +7 -> 92
    //   88: aload_1
    //   89: invokevirtual 37	java/io/FileReader:close	()V
    //   92: aload 7
    //   94: athrow
    //   95: astore 11
    //   97: return
    //   98: astore 8
    //   100: goto -8 -> 92
    //   103: astore 10
    //   105: aload_2
    //   106: astore_1
    //   107: aload 10
    //   109: astore 7
    //   111: goto -27 -> 84
    //   114: astore 5
    //   116: aload_2
    //   117: astore_1
    //   118: aload 5
    //   120: astore 6
    //   122: goto -59 -> 63
    //   125: astore_3
    //   126: goto -77 -> 49
    //
    // Exception table:
    //   from	to	target	type
    //   17	27	45	java/io/FileNotFoundException
    //   53	57	58	java/io/IOException
    //   17	27	61	java/io/IOException
    //   74	78	79	java/io/IOException
    //   17	27	82	finally
    //   63	70	82	finally
    //   40	44	95	java/io/IOException
    //   88	92	98	java/io/IOException
    //   27	40	103	finally
    //   27	40	114	java/io/IOException
    //   27	40	125	java/io/FileNotFoundException
  }

  public final String a()
  {
    return this.a.getProperty("partner");
  }

  public final String b()
  {
    return this.a.getProperty("referrer");
  }

  public final boolean c()
  {
    return this.b;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.cd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
