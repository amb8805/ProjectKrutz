package com.applovin.impl.sdk;

import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class bg extends AppLovinSdkUtils
{
  private static final char[] a = "0123456789abcdef".toCharArray();
  private static final char[] b = "-'".toCharArray();

  public static File a(String paramString, Context paramContext)
  {
    if (paramString.contains("icon"))
      paramString = paramString.replace("/", "_").replace(".", "_");
    File localFile1 = new File(paramContext.getCacheDir(), "al");
    File localFile2 = new File(localFile1, paramString);
    localFile1.mkdirs();
    return localFile2;
  }

  public static String a(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 4))
      return paramString.substring(-4 + paramString.length());
    return "NOKEY";
  }

  public static String a(String paramString, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    return a(paramString, Integer.valueOf(-1), (String)paramAppLovinSdkImpl.a(z.t));
  }

  private static String a(String paramString1, Integer paramInteger, String paramString2)
  {
    if (paramString2 == null)
      throw new IllegalArgumentException("No algorithm specified");
    if ((paramString1 == null) || (paramString1.length() < 1))
      paramString1 = "";
    while (true)
    {
      return paramString1;
      if ((paramString2.length() < 1) || ("none".equals(paramString2)))
        continue;
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance(paramString2);
        localMessageDigest.update(paramString1.getBytes("UTF-8"));
        paramString1 = a(localMessageDigest.digest());
        if ((paramString1 == null) || (paramInteger.intValue() <= 0))
          continue;
        String str = paramString1.substring(0, Math.min(paramInteger.intValue(), paramString1.length()));
        return str;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        throw new RuntimeException("Unknown algorithm \"" + paramString2 + "\"", localNoSuchAlgorithmException);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        throw new RuntimeException("Programming error: UTF-8 is not know encoding", localUnsupportedEncodingException);
      }
    }
  }

  static String a(Collection paramCollection, String paramString, int paramInt)
  {
    if (paramString == null)
      throw new IllegalArgumentException("No glue specified");
    if ((paramCollection == null) || (paramCollection.size() < 1))
      return "";
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = paramCollection.iterator();
    int i = 0;
    while (true)
    {
      String str;
      if (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        if (i < paramInt);
      }
      else
      {
        if (localStringBuffer.length() > paramString.length())
          localStringBuffer.setLength(localStringBuffer.length() - paramString.length());
        return localStringBuffer.toString();
      }
      i++;
      localStringBuffer.append(str).append(paramString);
    }
  }

  static String a(Map paramMap)
  {
    if ((paramMap == null) || (paramMap.isEmpty()))
      return "";
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (localStringBuilder.length() > 0)
        localStringBuilder.append("&");
      localStringBuilder.append(localEntry.getKey()).append((char)'=').append(localEntry.getValue());
    }
    return localStringBuilder.toString();
  }

  public static String a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      throw new IllegalArgumentException("No data specified");
    char[] arrayOfChar = new char[2 * paramArrayOfByte.length];
    for (int i = 0; i < paramArrayOfByte.length; i++)
    {
      arrayOfChar[(i * 2)] = a[((0xF0 & paramArrayOfByte[i]) >>> 4)];
      arrayOfChar[(1 + i * 2)] = a[(0xF & paramArrayOfByte[i])];
    }
    return new String(arrayOfChar);
  }

  public static boolean a(ab paramab, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    return a(paramab, paramAppLovinSdkImpl.getSettingsManager());
  }

  public static boolean a(ab paramab, ac paramac)
  {
    return System.currentTimeMillis() > 1000L * ((Long)paramac.a(paramab)).longValue();
  }

  public static String b(String paramString)
  {
    if ((paramString == null) || (paramString.length() < 1))
      return "";
    return paramString.trim().toLowerCase();
  }

  public static String b(String paramString, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    return a(paramString, (Integer)paramAppLovinSdkImpl.a(z.u), (String)paramAppLovinSdkImpl.a(z.t));
  }

  static String c(String paramString)
  {
    if (d(paramString))
      try
      {
        String str = URLEncoder.encode(paramString, "UTF-8");
        return str;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        throw new UnsupportedOperationException(localUnsupportedEncodingException);
      }
    return "";
  }

  static boolean d(String paramString)
  {
    return (paramString != null) && (paramString.length() > 1);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.bg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
