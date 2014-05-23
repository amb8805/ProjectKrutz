package com.applovin.sdk;

import java.util.HashSet;
import java.util.Set;

public class AppLovinAdSize
{
  public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, "BANNER");
  public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, "INTER");
  public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 75, "LEADER");
  public static final AppLovinAdSize MREC = new AppLovinAdSize(-1, -1, "MREC");
  public static final int SPAN = -1;
  private final int a;
  private final int b;
  private final String c;

  AppLovinAdSize(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 < 0) && (paramInt1 != -1))
      throw new IllegalArgumentException("Ad width must be a positive number. Number provided: " + paramInt1);
    if (paramInt1 > 9999)
      throw new IllegalArgumentException("Ad width must be less then 9999. Number provided: " + paramInt1);
    if ((paramInt2 < 0) && (paramInt2 != -1))
      throw new IllegalArgumentException("Ad height must be a positive number. Number provided: " + paramInt2);
    if (paramInt2 > 9999)
      throw new IllegalArgumentException("Ad height must be less then 9999. Number provided: " + paramInt2);
    if (paramString == null)
      throw new IllegalArgumentException("No label specified");
    if (paramString.length() > 9)
      throw new IllegalArgumentException("Provided label is too long. Label provided: " + paramString);
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramString;
  }

  private static int a(String paramString)
  {
    if ("span".equalsIgnoreCase(paramString))
      return -1;
    try
    {
      int i = Integer.parseInt(paramString);
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return 0;
  }

  public static Set allSizes()
  {
    HashSet localHashSet = new HashSet(4);
    localHashSet.add(BANNER);
    localHashSet.add(MREC);
    localHashSet.add(INTERSTITIAL);
    localHashSet.add(LEADER);
    return localHashSet;
  }

  public static AppLovinAdSize fromString(String paramString)
  {
    if ((paramString == null) || (paramString.length() < 1))
      return null;
    String str = paramString.toLowerCase();
    if (str.equals("banner"))
      return BANNER;
    if ((str.equals("interstitial")) || (str.equals("inter")))
      return INTERSTITIAL;
    if (str.equals("mrec"))
      return MREC;
    if (str.equals("leader"))
      return LEADER;
    String[] arrayOfString = paramString.split("x");
    if (arrayOfString.length == 2)
      return new AppLovinAdSize(a(arrayOfString[0]), a(arrayOfString[1]), paramString);
    return new AppLovinAdSize(0, 0, paramString);
  }

  public int getHeight()
  {
    return this.b;
  }

  public String getLabel()
  {
    return this.c.toUpperCase();
  }

  public int getWidth()
  {
    return this.a;
  }

  public String toString()
  {
    return getLabel();
  }
}

/* Location:
 * Qualified Name:     com.applovin.sdk.AppLovinAdSize
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
