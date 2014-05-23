import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.IOException;

public final class cb
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new bx();
  public final boolean a;
  public final long b;

  public cb(Parcel paramParcel)
  {
    if (paramParcel.readInt() == 1);
    for (boolean bool = true; ; bool = false)
    {
      this.a = bool;
      this.b = paramParcel.readLong();
      return;
    }
  }

  private cb(boolean paramBoolean, long paramLong)
  {
    this.a = paramBoolean;
    this.b = paramLong;
  }

  public static cb a(bq parambq)
  {
    if (parambq == null)
      return null;
    try
    {
      Object localObject1 = parambq.g();
      l1 = 1L;
      bool1 = false;
      if (localObject1 != cp.b)
      {
        str1 = parambq.m();
        switch (bw.a[localObject1.ordinal()])
        {
        case 1:
        case 2:
        case 3:
        case 4:
        }
      }
      while (true)
      {
        localcp2 = parambq.g();
        bool1 = bool3;
        l1 = localObject2;
        localObject1 = localcp2;
        break;
        parambq.h();
        l3 = l1;
        bool3 = bool1;
        continue;
        if ("trend_location".equals(str1))
          for (localcp3 = parambq.p(); ; localcp3 = parambq.g())
          {
            if (localcp3 == cp.d)
              break label331;
            if (localcp3 == cp.a)
            {
              localcp4 = parambq.g();
              if (localcp4 == cp.b)
                break label331;
              str2 = parambq.m();
              switch (bw.a[localcp4.ordinal()])
              {
              case 3:
              case 4:
              default:
              case 5:
              case 1:
              case 2:
              }
              while (true)
              {
                localcp4 = parambq.g();
                break;
                if ("woeid".equals(str2))
                {
                  l3 = parambq.e();
                  break label321;
                  parambq.h();
                }
              }
            }
          }
        parambq.h();
        l3 = l1;
        bool3 = bool1;
        continue;
        if ("geo_enabled".equals(str1))
        {
          localcp1 = cp.j;
          if (localObject1 == localcp1);
          for (bool2 = true; ; bool2 = false)
          {
            l2 = l1;
            bool3 = bool2;
            l3 = l2;
            break;
          }
          return new cb(bool1, l1);
        }
        l3 = l1;
        bool3 = bool1;
        continue;
        bool3 = bool1;
      }
    }
    catch (IOException localIOException)
    {
      return null;
    }
    while (true)
    {
      long l1;
      boolean bool1;
      String str1;
      cp localcp2;
      boolean bool3;
      Object localObject2;
      cp localcp3;
      cp localcp4;
      String str2;
      cp localcp1;
      boolean bool2;
      long l2;
      label321: label331: long l3 = 1L;
    }
  }

  // ERROR //
  public static cb a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: getstatic 102	do:a	Lef;
    //   9: aload_0
    //   10: invokevirtual 107	ef:a	(Ljava/lang/String;)Lbq;
    //   13: astore 5
    //   15: aload 5
    //   17: astore 4
    //   19: aload 4
    //   21: invokevirtual 47	bq:g	()Lcp;
    //   24: pop
    //   25: aload 4
    //   27: invokestatic 109	cb:a	(Lbq;)Lcb;
    //   30: astore 9
    //   32: aload 4
    //   34: invokestatic 114	cr:a	(Ljava/io/Closeable;)V
    //   37: aload 9
    //   39: areturn
    //   40: astore_3
    //   41: aconst_null
    //   42: astore 4
    //   44: aload 4
    //   46: invokestatic 114	cr:a	(Ljava/io/Closeable;)V
    //   49: aconst_null
    //   50: areturn
    //   51: astore_1
    //   52: aconst_null
    //   53: astore_2
    //   54: aload_2
    //   55: invokestatic 114	cr:a	(Ljava/io/Closeable;)V
    //   58: aload_1
    //   59: athrow
    //   60: astore 7
    //   62: aload 4
    //   64: astore_2
    //   65: aload 7
    //   67: astore_1
    //   68: goto -14 -> 54
    //   71: astore 6
    //   73: goto -29 -> 44
    //
    // Exception table:
    //   from	to	target	type
    //   6	15	40	java/io/IOException
    //   6	15	51	finally
    //   19	32	60	finally
    //   19	32	71	java/io/IOException
  }

  public final int describeContents()
  {
    return 0;
  }

  // ERROR //
  public final String toString()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 118	java/io/StringWriter
    //   5: dup
    //   6: sipush 512
    //   9: invokespecial 121	java/io/StringWriter:<init>	(I)V
    //   12: astore_2
    //   13: getstatic 102	do:a	Lef;
    //   16: aload_2
    //   17: invokevirtual 124	ef:a	(Ljava/io/Writer;)Law;
    //   20: astore 7
    //   22: aload 7
    //   24: astore_1
    //   25: aload_1
    //   26: invokevirtual 129	aw:c	()V
    //   29: aload_1
    //   30: ldc 91
    //   32: aload_0
    //   33: getfield 31	cb:a	Z
    //   36: invokevirtual 132	aw:a	(Ljava/lang/String;Z)V
    //   39: aload_1
    //   40: ldc 70
    //   42: invokevirtual 135	aw:a	(Ljava/lang/String;)V
    //   45: aload_1
    //   46: invokevirtual 137	aw:a	()V
    //   49: aload_1
    //   50: invokevirtual 129	aw:c	()V
    //   53: aload_1
    //   54: ldc 86
    //   56: aload_0
    //   57: getfield 37	cb:b	J
    //   60: invokevirtual 140	aw:a	(Ljava/lang/String;J)V
    //   63: aload_1
    //   64: invokevirtual 142	aw:d	()V
    //   67: aload_1
    //   68: invokevirtual 144	aw:b	()V
    //   71: aload_1
    //   72: invokevirtual 142	aw:d	()V
    //   75: aload_1
    //   76: invokevirtual 146	aw:e	()V
    //   79: aload_2
    //   80: invokevirtual 148	java/io/StringWriter:toString	()Ljava/lang/String;
    //   83: astore 9
    //   85: aload_1
    //   86: invokestatic 114	cr:a	(Ljava/io/Closeable;)V
    //   89: aload 9
    //   91: areturn
    //   92: astore 6
    //   94: aload_1
    //   95: invokestatic 114	cr:a	(Ljava/io/Closeable;)V
    //   98: ldc 150
    //   100: areturn
    //   101: astore_3
    //   102: aconst_null
    //   103: astore 4
    //   105: aload_3
    //   106: astore 5
    //   108: aload 4
    //   110: invokestatic 114	cr:a	(Ljava/io/Closeable;)V
    //   113: aload 5
    //   115: athrow
    //   116: astore 8
    //   118: aload_1
    //   119: astore 4
    //   121: aload 8
    //   123: astore 5
    //   125: goto -17 -> 108
    //
    // Exception table:
    //   from	to	target	type
    //   2	22	92	java/io/IOException
    //   25	85	92	java/io/IOException
    //   2	22	101	finally
    //   25	85	116	finally
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.a);
    for (int i = 1; ; i = 0)
    {
      paramParcel.writeInt(i);
      paramParcel.writeLong(this.b);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     cb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
