package com.spotify.cosmos.router;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class NativeHelpers
{
  private static final Charset sCharsetUtf8 = Charset.forName("UTF-8");

  protected NativeHelpers()
  {
    throw new UnsupportedOperationException("This class should not be directly instantiated");
  }

  public static Map<String, String> byteArrayToMap(byte[] paramArrayOfByte)
  {
    HashMap localHashMap = new HashMap();
    if (paramArrayOfByte == null)
      return localHashMap;
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      int j = nextNull(paramArrayOfByte, i);
      String str1 = new String(paramArrayOfByte, i, j - i, sCharsetUtf8);
      int k = j + 1;
      int m = nextNull(paramArrayOfByte, k);
      String str2 = new String(paramArrayOfByte, k, m - k, sCharsetUtf8);
      i = m + 1;
      localHashMap.put(str1, str2);
    }
    return localHashMap;
  }

  public static byte[] mapToByteArray(Map<String, String> paramMap)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    if (paramMap != null)
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        writeStringToStream(localByteArrayOutputStream, (String)localEntry.getKey());
        writeStringToStream(localByteArrayOutputStream, (String)localEntry.getValue());
      }
    }
    return localByteArrayOutputStream.toByteArray();
  }

  private static int nextNull(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      while (true)
      {
        int i = paramArrayOfByte[paramInt];
        if (i == 0)
          break;
        paramInt++;
      }
    }
    catch (Exception localException)
    {
      throw new IndexOutOfBoundsException("Invalid character found at offset " + paramInt);
    }
    return paramInt;
  }

  private static void writeStringToStream(ByteArrayOutputStream paramByteArrayOutputStream, String paramString)
  {
    paramByteArrayOutputStream.write(paramString.getBytes(sCharsetUtf8));
    paramByteArrayOutputStream.write(0);
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.router.NativeHelpers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
