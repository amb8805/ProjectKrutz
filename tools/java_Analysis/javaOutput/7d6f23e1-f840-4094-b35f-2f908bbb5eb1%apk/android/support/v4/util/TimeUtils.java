package android.support.v4.util;

import java.io.PrintWriter;

public class TimeUtils
{
  public static final int HUNDRED_DAY_FIELD_LEN = 19;
  private static final int SECONDS_PER_DAY = 86400;
  private static final int SECONDS_PER_HOUR = 3600;
  private static final int SECONDS_PER_MINUTE = 60;
  private static char[] sFormatStr = new char[24];
  private static final Object sFormatSync = new Object();

  public TimeUtils()
  {
  }

  private static int accumField(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    if ((paramInt1 > 99) || ((paramBoolean) && (paramInt3 >= 3)))
      return paramInt2 + 3;
    if ((paramInt1 > 9) || ((paramBoolean) && (paramInt3 >= 2)))
      return paramInt2 + 2;
    if ((paramBoolean) || (paramInt1 > 0))
      return paramInt2 + 1;
    return 0;
  }

  public static void formatDuration(long paramLong1, long paramLong2, PrintWriter paramPrintWriter)
  {
    if (paramLong1 == 0L)
    {
      paramPrintWriter.print("--");
      return;
    }
    formatDuration(paramLong1 - paramLong2, paramPrintWriter, 0);
  }

  public static void formatDuration(long paramLong, PrintWriter paramPrintWriter)
  {
    formatDuration(paramLong, paramPrintWriter, 0);
  }

  public static void formatDuration(long paramLong, PrintWriter paramPrintWriter, int paramInt)
  {
    synchronized (sFormatSync)
    {
      int i = formatDurationLocked(paramLong, paramInt);
      paramPrintWriter.print(new String(sFormatStr, 0, i));
      return;
    }
  }

  public static void formatDuration(long paramLong, StringBuilder paramStringBuilder)
  {
    synchronized (sFormatSync)
    {
      int i = formatDurationLocked(paramLong, 0);
      paramStringBuilder.append(sFormatStr, 0, i);
      return;
    }
  }

  private static int formatDurationLocked(long paramLong, int paramInt)
  {
    if (sFormatStr.length < paramInt)
      sFormatStr = new char[paramInt];
    char[] arrayOfChar = sFormatStr;
    if (paramLong == 0L)
    {
      int i28 = paramInt - 1;
      while (i28 > 0)
        arrayOfChar[0] = ' ';
      arrayOfChar[0] = '0';
      return 1;
    }
    long l;
    int i;
    int j;
    int k;
    int i27;
    int m;
    if (paramLong > 0L)
    {
      l = paramLong;
      i = 43;
      j = (int)(l % 1000L);
      k = (int)Math.floor(l / 1000L);
      if (k <= 86400)
        break label589;
      i27 = k / 86400;
      m = k - 86400 * i27;
    }
    for (int n = i27; ; n = 0)
    {
      int i26;
      if (m > 3600)
      {
        i26 = m / 3600;
        m -= i26 * 3600;
      }
      for (int i1 = i26; ; i1 = 0)
      {
        int i3;
        int i2;
        if (m > 60)
        {
          int i24 = m / 60;
          int i25 = m - i24 * 60;
          i3 = i24;
          i2 = i25;
        }
        while (true)
        {
          int i4 = 0;
          if (paramInt != 0)
          {
            int i16 = accumField(n, 1, false, 0);
            boolean bool4;
            label200: boolean bool5;
            label222: boolean bool6;
            label244: int i19;
            if (i16 > 0)
            {
              bool4 = true;
              int i17 = i16 + accumField(i1, 1, bool4, 2);
              if (i17 <= 0)
                break label327;
              bool5 = true;
              int i18 = i17 + accumField(i3, 1, bool5, 2);
              if (i18 <= 0)
                break label333;
              bool6 = true;
              i19 = i18 + accumField(i2, 1, bool6, 2);
              if (i19 <= 0)
                break label339;
            }
            int i22;
            label327: label333: label339: for (int i20 = 3; ; i20 = 0)
            {
              int i21 = i19 + (1 + accumField(j, 2, true, i20));
              i22 = 0;
              for (int i23 = i21; i23 < paramInt; i23++)
              {
                arrayOfChar[i22] = ' ';
                i22++;
              }
              l = -paramLong;
              i = 45;
              break;
              bool4 = false;
              break label200;
              bool5 = false;
              break label222;
              bool6 = false;
              break label244;
            }
            i4 = i22;
          }
          arrayOfChar[i4] = i;
          int i5 = i4 + 1;
          int i6;
          boolean bool1;
          label392: int i8;
          label400: boolean bool2;
          label426: int i10;
          label434: boolean bool3;
          label460: int i12;
          label468: int i13;
          if (paramInt != 0)
          {
            i6 = 1;
            int i7 = printField(arrayOfChar, n, (char)'d', i5, false, 0);
            if (i7 == i5)
              break label531;
            bool1 = true;
            if (i6 == 0)
              break label537;
            i8 = 2;
            int i9 = printField(arrayOfChar, i1, (char)'h', i7, bool1, i8);
            if (i9 == i5)
              break label543;
            bool2 = true;
            if (i6 == 0)
              break label549;
            i10 = 2;
            int i11 = printField(arrayOfChar, i3, (char)'m', i9, bool2, i10);
            if (i11 == i5)
              break label555;
            bool3 = true;
            if (i6 == 0)
              break label561;
            i12 = 2;
            i13 = printField(arrayOfChar, i2, (char)'s', i11, bool3, i12);
            if ((i6 == 0) || (i13 == i5))
              break label567;
          }
          label531: label537: label543: label549: label555: label561: label567: for (int i14 = 3; ; i14 = 0)
          {
            int i15 = printField(arrayOfChar, j, (char)'m', i13, true, i14);
            arrayOfChar[i15] = 's';
            return i15 + 1;
            i6 = 0;
            break;
            bool1 = false;
            break label392;
            i8 = 0;
            break label400;
            bool2 = false;
            break label426;
            i10 = 0;
            break label434;
            bool3 = false;
            break label460;
            i12 = 0;
            break label468;
          }
          i2 = m;
          i3 = 0;
        }
      }
      label589: m = k;
    }
  }

  private static int printField(char[] paramArrayOfChar, int paramInt1, char paramChar, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    if ((paramBoolean) || (paramInt1 > 0))
    {
      int j;
      int i;
      if (((paramBoolean) && (paramInt3 >= 3)) || (paramInt1 > 99))
      {
        int n = paramInt1 / 100;
        paramArrayOfChar[paramInt2] = (char)(n + 48);
        int i1 = paramInt2 + 1;
        j = paramInt1 - n * 100;
        i = i1;
      }
      while (true)
      {
        if (((paramBoolean) && (paramInt3 >= 2)) || (j > 9) || (paramInt2 != i))
        {
          int k = j / 10;
          paramArrayOfChar[i] = (char)(k + 48);
          i++;
          j -= k * 10;
        }
        paramArrayOfChar[i] = (char)(j + 48);
        int m = i + 1;
        paramArrayOfChar[m] = paramChar;
        return m + 1;
        i = paramInt2;
        j = paramInt1;
      }
    }
    return paramInt2;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.util.TimeUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
