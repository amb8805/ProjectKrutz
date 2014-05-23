package com.applovin.impl.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.Location;
import com.applovin.sdk.AppLovinTargetingData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class i
  implements AppLovinTargetingData
{
  private final AppLovinSdkImpl a;
  private final Context b;

  i(AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    if (paramAppLovinSdkImpl == null)
      throw new IllegalArgumentException("No sdk specified");
    this.a = paramAppLovinSdkImpl;
    this.b = paramAppLovinSdkImpl.getApplicationContext();
  }

  private static String a(String[] paramArrayOfString)
  {
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
    {
      StringBuffer localStringBuffer = new StringBuffer();
      int i = paramArrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        String str = paramArrayOfString[j];
        if (bg.d(str))
        {
          localStringBuffer.append(bg.c(str));
          localStringBuffer.append(",");
        }
      }
      if (localStringBuffer.length() > 0)
        localStringBuffer.setLength(-1 + localStringBuffer.length());
      return localStringBuffer.toString();
    }
    return "";
  }

  private void a(String paramString1, String paramString2)
  {
    if (bg.d(paramString1))
    {
      SharedPreferences.Editor localEditor = this.b.getSharedPreferences("applovin.sdk.targeting", 0).edit();
      localEditor.putString(paramString1, bg.c(paramString2));
      localEditor.commit();
    }
  }

  Map a()
  {
    HashMap localHashMap = new HashMap();
    Map localMap = this.b.getSharedPreferences("applovin.sdk.targeting", 0).getAll();
    if ((localMap != null) && (localMap.size() > 0))
    {
      Iterator localIterator = localMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localHashMap.put(localEntry.getKey(), String.valueOf(localEntry.getValue()));
      }
    }
    return localHashMap;
  }

  public void clearData()
  {
    SharedPreferences.Editor localEditor = this.b.getSharedPreferences("applovin.sdk.targeting", 0).edit();
    localEditor.clear();
    localEditor.commit();
  }

  public void putExtra(String paramString1, String paramString2)
  {
    if ((bg.d(paramString1)) && (bg.d(paramString2)))
      a("ex_" + paramString1, paramString2);
  }

  public void setBirthYear(int paramInt)
  {
    if ((paramInt < 9999) && (paramInt > 1900))
      a("yob", Integer.toString(paramInt));
  }

  public void setCarrier(String paramString)
  {
    if (bg.d(paramString))
      a("carrier", paramString);
  }

  public void setCountry(String paramString)
  {
    if ((bg.d(paramString)) && (paramString.length() == 2))
      a("country", paramString.toUpperCase());
  }

  public void setEducation(String paramString)
  {
    if (bg.d(paramString))
      a("education", paramString);
  }

  public void setEthnicity(String paramString)
  {
    if (bg.d(paramString))
      a("ethnicity", paramString);
  }

  public void setGender(char paramChar)
  {
    String str;
    if (paramChar == 'm')
      str = "m";
    while (true)
    {
      a("gender", str);
      return;
      if (paramChar == 'f')
        str = "f";
      else
        str = "u";
    }
  }

  public void setIncome(String paramString)
  {
    if (bg.d(paramString))
      a("income", paramString);
  }

  public void setInterests(String[] paramArrayOfString)
  {
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
      a("interests", a(paramArrayOfString));
  }

  public void setKeywords(String[] paramArrayOfString)
  {
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
      a("keywords", a(paramArrayOfString));
  }

  public void setLanguage(String paramString)
  {
    if (bg.d(paramString))
      a("language", paramString.toLowerCase());
  }

  public void setLocation(Location paramLocation)
  {
    if (paramLocation != null)
    {
      a("lat", Double.toString(paramLocation.getLatitude()));
      a("lon", Double.toString(paramLocation.getLongitude()));
    }
  }

  public void setMaritalStatus(String paramString)
  {
    if (bg.d(paramString))
      a("marital_status", paramString);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
