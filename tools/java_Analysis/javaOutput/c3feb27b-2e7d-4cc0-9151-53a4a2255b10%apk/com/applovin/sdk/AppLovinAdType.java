package com.applovin.sdk;

import java.util.HashSet;
import java.util.Set;

public class AppLovinAdType
{
  public static final AppLovinAdType INCENTIVIZED = new AppLovinAdType("VIDEOA");
  public static final AppLovinAdType REGULAR = new AppLovinAdType("REGULAR");
  private final String a;

  public AppLovinAdType(String paramString)
  {
    this.a = paramString;
  }

  public static Set allTypes()
  {
    HashSet localHashSet = new HashSet(2);
    localHashSet.add(REGULAR);
    localHashSet.add(INCENTIVIZED);
    return localHashSet;
  }

  public static AppLovinAdType fromString(String paramString)
  {
    if (paramString.toUpperCase().equals(INCENTIVIZED.getLabel()))
      return INCENTIVIZED;
    return REGULAR;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    AppLovinAdType localAppLovinAdType;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
        return false;
      localAppLovinAdType = (AppLovinAdType)paramObject;
      if (this.a == null)
        break;
    }
    while (this.a.equals(localAppLovinAdType.a));
    while (true)
    {
      return false;
      if (localAppLovinAdType.a == null)
        break;
    }
  }

  public String getLabel()
  {
    return this.a.toUpperCase();
  }

  public int hashCode()
  {
    if (this.a != null)
      return this.a.hashCode();
    return 0;
  }

  public String toString()
  {
    return getLabel();
  }
}

/* Location:
 * Qualified Name:     com.applovin.sdk.AppLovinAdType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
