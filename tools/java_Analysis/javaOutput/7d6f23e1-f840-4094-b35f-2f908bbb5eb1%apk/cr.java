import android.content.res.Resources;
import android.preference.ListPreference;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;

public final class cr
{
  public static final SimpleDateFormat a = new bv("EEE MMM dd HH:mm:ss Z yyyy", Locale.ENGLISH);
  public static final SimpleDateFormat b = new bv("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
  private static SimpleDateFormat c = new bv("EEE, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
  private static DecimalFormat d = new DecimalFormat();
  private static final SimpleDateFormat e = new SimpleDateFormat("dd MMM yy");
  private static Random f = new Random();
  private static char[] g = "0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

  private cr()
  {
  }

  public static long a(SimpleDateFormat paramSimpleDateFormat, String paramString)
  {
    if (paramString != null)
      try
      {
        long l = paramSimpleDateFormat.parse(paramString).getTime();
        return l;
      }
      catch (ParseException localParseException)
      {
        Log.e("Util", "parseTime " + localParseException.getMessage() + ", offset = " + localParseException.getErrorOffset() + ", string = " + paramString, localParseException);
        return 0L;
      }
    return 0L;
  }

  public static Spanned a(Object paramObject, String paramString, char paramChar)
  {
    int i = paramString.indexOf('"');
    if (i == -1);
    for (int j = -1; (i != -1) && (j != -1); j = paramString.indexOf('"', i + 1))
    {
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(paramString.substring(0, i)).append(paramString.substring(i + 1, j)).append(paramString.substring(j + 1));
      localSpannableStringBuilder.setSpan(paramObject, i, j - 1, 33);
      return localSpannableStringBuilder;
    }
    return new SpannableString(paramString);
  }

  // ERROR //
  public static Object a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: new 156	java/io/ByteArrayInputStream
    //   9: dup
    //   10: aload_0
    //   11: invokespecial 159	java/io/ByteArrayInputStream:<init>	([B)V
    //   14: astore_1
    //   15: new 161	java/io/ObjectInputStream
    //   18: dup
    //   19: aload_1
    //   20: invokespecial 164	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   23: astore_2
    //   24: aload_2
    //   25: invokevirtual 168	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   28: astore 8
    //   30: aload_2
    //   31: invokestatic 171	cr:a	(Ljava/io/Closeable;)V
    //   34: aload_1
    //   35: invokestatic 171	cr:a	(Ljava/io/Closeable;)V
    //   38: aload 8
    //   40: areturn
    //   41: astore 10
    //   43: aconst_null
    //   44: astore_2
    //   45: aload_2
    //   46: invokestatic 171	cr:a	(Ljava/io/Closeable;)V
    //   49: aload_1
    //   50: invokestatic 171	cr:a	(Ljava/io/Closeable;)V
    //   53: aconst_null
    //   54: areturn
    //   55: astore 9
    //   57: aconst_null
    //   58: astore_2
    //   59: aload_2
    //   60: invokestatic 171	cr:a	(Ljava/io/Closeable;)V
    //   63: aload_1
    //   64: invokestatic 171	cr:a	(Ljava/io/Closeable;)V
    //   67: goto -14 -> 53
    //   70: astore 7
    //   72: aconst_null
    //   73: astore 6
    //   75: aload 6
    //   77: invokestatic 171	cr:a	(Ljava/io/Closeable;)V
    //   80: aload_1
    //   81: invokestatic 171	cr:a	(Ljava/io/Closeable;)V
    //   84: aload 7
    //   86: athrow
    //   87: astore 5
    //   89: aload_2
    //   90: astore 6
    //   92: aload 5
    //   94: astore 7
    //   96: goto -21 -> 75
    //   99: astore 4
    //   101: goto -42 -> 59
    //   104: astore_3
    //   105: goto -60 -> 45
    //
    // Exception table:
    //   from	to	target	type
    //   15	24	41	java/io/IOException
    //   15	24	55	java/lang/ClassNotFoundException
    //   15	24	70	finally
    //   24	30	87	finally
    //   24	30	99	java/lang/ClassNotFoundException
    //   24	30	104	java/io/IOException
  }

  public static String a(int paramInt)
  {
    if (paramInt <= 0)
      return null;
    char[] arrayOfChar = new char[paramInt];
    for (int i = 0; i < arrayOfChar.length; i++)
      arrayOfChar[i] = g[f.nextInt(71)];
    return new String(arrayOfChar);
  }

  public static String a(Resources paramResources, int paramInt)
  {
    if (paramResources.getBoolean(2131296256))
    {
      double d1 = paramInt / 1000000.0D;
      if (d1 >= 1.0D)
      {
        d.applyPattern(paramResources.getString(2131427340));
        return d.format(Math.floor(d1 * 10.0D) / 10.0D);
      }
      double d2 = paramInt / 10000.0D;
      if (d2 >= 1.0D)
      {
        d.applyPattern(paramResources.getString(2131427339));
        return d.format(Math.floor(d2 * 100.0D) / 10.0D);
      }
      return NumberFormat.getInstance().format(paramInt);
    }
    return NumberFormat.getInstance().format(paramInt);
  }

  public static String a(Resources paramResources, long paramLong, boolean paramBoolean)
  {
    long l = System.currentTimeMillis() - paramLong;
    if (l >= 0L)
    {
      if (l < 60000L)
      {
        int k = (int)(l / 1000L);
        if (paramBoolean)
        {
          Object[] arrayOfObject6 = new Object[1];
          arrayOfObject6[0] = Integer.valueOf(k);
          return paramResources.getQuantityString(2131623936, k, arrayOfObject6);
        }
        Object[] arrayOfObject5 = new Object[1];
        arrayOfObject5[0] = Integer.valueOf(k);
        return paramResources.getQuantityString(2131623937, k, arrayOfObject5);
      }
      if (l < 3600000L)
      {
        int j = (int)(l / 60000L);
        if (paramBoolean)
        {
          Object[] arrayOfObject4 = new Object[1];
          arrayOfObject4[0] = Integer.valueOf(j);
          return paramResources.getQuantityString(2131623938, j, arrayOfObject4);
        }
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(j);
        return paramResources.getQuantityString(2131623939, j, arrayOfObject3);
      }
      if (l < 86400000L)
      {
        int i = (int)(l / 3600000L);
        if (paramBoolean)
        {
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Integer.valueOf(i);
          return paramResources.getQuantityString(2131623940, i, arrayOfObject2);
        }
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(i);
        return paramResources.getQuantityString(2131623941, i, arrayOfObject1);
      }
      Calendar localCalendar1 = Calendar.getInstance();
      Calendar localCalendar2 = Calendar.getInstance();
      Date localDate = new Date(paramLong);
      localCalendar2.setTime(localDate);
      if (localCalendar1.get(1) == localCalendar2.get(1))
        e.applyPattern(paramResources.getString(2131427702));
      while (true)
      {
        return e.format(localDate);
        e.applyPattern(paramResources.getString(2131427703));
      }
    }
    e.applyPattern(paramResources.getString(2131427703));
    return e.format(new Date(paramLong));
  }

  public static String a(String paramString)
  {
    if (paramString == null)
      return "";
    try
    {
      String str = URLEncoder.encode(paramString, "UTF8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException(localUnsupportedEncodingException.getMessage(), localUnsupportedEncodingException);
    }
  }

  public static void a(ListPreference paramListPreference, String paramString)
  {
    CharSequence[] arrayOfCharSequence = paramListPreference.getEntries();
    int i = paramListPreference.findIndexOfValue(paramString);
    if (i != -1)
      paramListPreference.setSummary(arrayOfCharSequence[i]);
  }

  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null);
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  public static boolean a(String paramString1, String paramString2)
  {
    if (paramString1 == null)
      return paramString2 == null;
    return paramString1.equals(paramString2);
  }

  // ERROR //
  public static byte[] a(Object paramObject)
  {
    // Byte code:
    //   0: new 317	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: sipush 512
    //   7: invokespecial 320	java/io/ByteArrayOutputStream:<init>	(I)V
    //   10: astore_1
    //   11: new 322	java/io/ObjectOutputStream
    //   14: dup
    //   15: aload_1
    //   16: invokespecial 325	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   19: astore_2
    //   20: aload_2
    //   21: aload_0
    //   22: invokevirtual 329	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   25: aload_1
    //   26: invokevirtual 333	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   29: astore 7
    //   31: aload_2
    //   32: invokestatic 171	cr:a	(Ljava/io/Closeable;)V
    //   35: aload_1
    //   36: invokestatic 171	cr:a	(Ljava/io/Closeable;)V
    //   39: aload 7
    //   41: areturn
    //   42: astore 8
    //   44: aconst_null
    //   45: astore_2
    //   46: aload_2
    //   47: invokestatic 171	cr:a	(Ljava/io/Closeable;)V
    //   50: aload_1
    //   51: invokestatic 171	cr:a	(Ljava/io/Closeable;)V
    //   54: aconst_null
    //   55: areturn
    //   56: astore 6
    //   58: aconst_null
    //   59: astore 5
    //   61: aload 5
    //   63: invokestatic 171	cr:a	(Ljava/io/Closeable;)V
    //   66: aload_1
    //   67: invokestatic 171	cr:a	(Ljava/io/Closeable;)V
    //   70: aload 6
    //   72: athrow
    //   73: astore 4
    //   75: aload_2
    //   76: astore 5
    //   78: aload 4
    //   80: astore 6
    //   82: goto -21 -> 61
    //   85: astore_3
    //   86: goto -40 -> 46
    //
    // Exception table:
    //   from	to	target	type
    //   11	20	42	java/io/IOException
    //   11	20	56	finally
    //   20	31	73	finally
    //   20	31	85	java/io/IOException
  }

  public static int[] a(Collection paramCollection)
  {
    int[] arrayOfInt;
    if ((paramCollection == null) || (paramCollection.isEmpty()))
      arrayOfInt = null;
    while (true)
    {
      return arrayOfInt;
      arrayOfInt = new int[paramCollection.size()];
      int i = 0;
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
      {
        arrayOfInt[i] = ((Integer)localIterator.next()).intValue();
        i++;
      }
    }
  }

  public static String b(String paramString)
  {
    if (paramString == null)
      return "";
    try
    {
      String str = URLDecoder.decode(paramString, "UTF8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException(localUnsupportedEncodingException.getMessage(), localUnsupportedEncodingException);
    }
  }

  public static long[] b(Collection paramCollection)
  {
    long[] arrayOfLong;
    if ((paramCollection == null) || (paramCollection.isEmpty()))
      arrayOfLong = null;
    while (true)
    {
      return arrayOfLong;
      arrayOfLong = new long[paramCollection.size()];
      int i = 0;
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
      {
        arrayOfLong[i] = ((Long)localIterator.next()).longValue();
        i++;
      }
    }
  }
}

/* Location:
 * Qualified Name:     cr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
