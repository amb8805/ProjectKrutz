package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinLogger;
import java.util.HashMap;
import java.util.Map;

class be
{
  private final CharSequence a;
  private final AppLovinLogger b;
  private final Map c = new HashMap(1);
  private bf d;

  public be(CharSequence paramCharSequence, AppLovinLogger paramAppLovinLogger)
  {
    if (paramCharSequence == null)
      throw new IllegalArgumentException("No template specified");
    if (paramAppLovinLogger == null)
      throw new IllegalArgumentException("No logger specified");
    this.a = paramCharSequence;
    this.b = paramAppLovinLogger;
  }

  private String a(String paramString)
  {
    int i = paramString.indexOf(':');
    String str7;
    String str1;
    String str2;
    label51: String str5;
    label93: String str3;
    if (i > 0)
    {
      String str6 = paramString.substring(0, i).trim();
      if (i + 1 < paramString.length())
      {
        str7 = paramString.substring(i + 1).trim();
        str1 = str6;
        str2 = str7;
        if (this.d == null)
          break label173;
        String str4 = this.d.a(str1);
        if (str4 == null)
          break label166;
        str5 = str4.substring(0, Math.min(str4.length(), 30));
        this.b.d("TemplateProcessor", str1 + " was resolved to \"" + str5 + "\"");
        if (str4 == null)
          break label173;
        str3 = str4;
      }
    }
    label166: label173: 
    do
    {
      do
      {
        return str3;
        str7 = "";
        break;
        str1 = paramString.trim().toLowerCase();
        str2 = null;
        break label51;
        str5 = "";
        break label93;
        str3 = (String)this.c.get(str1);
      }
      while (str3 != null);
      str3 = (String)this.c.get(str1.toLowerCase());
    }
    while (str3 != null);
    return str2;
  }

  public String a()
  {
    StringBuffer localStringBuffer1 = new StringBuffer();
    StringBuffer localStringBuffer2 = new StringBuffer();
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (i < this.a.length())
    {
      char c1 = this.a.charAt(i);
      if (m == 0)
        if (c1 == '<')
          if (k == 0)
            k = 1;
      while (true)
      {
        i++;
        break;
        localStringBuffer1.append("<");
        k = 0;
        continue;
        if (c1 == '%')
        {
          if (k != 0)
          {
            m = 1;
            k = 0;
          }
          else
          {
            localStringBuffer1.append(c1);
          }
        }
        else
        {
          if (k != 0)
          {
            localStringBuffer1.append("<");
            k = 0;
          }
          localStringBuffer1.append(c1);
          continue;
          if (c1 == '%')
          {
            if (j == 0)
            {
              j = 1;
            }
            else
            {
              localStringBuffer2.append("%");
              j = 0;
            }
          }
          else if (c1 == '>')
          {
            if (j != 0)
            {
              String str1 = localStringBuffer2.toString();
              localStringBuffer2.setLength(0);
              String str2 = a(str1);
              if (str2 != null)
                localStringBuffer1.append(str2);
              while (true)
              {
                j = 0;
                m = 0;
                break;
                localStringBuffer1.append("");
                this.b.w("TemplateProcessor", "Unable to resolve \"" + str1 + "\", using empty string");
              }
            }
            localStringBuffer2.append(">");
          }
          else
          {
            localStringBuffer2.append(c1);
          }
        }
      }
    }
    if (k != 0)
      localStringBuffer1.append("<");
    if (m != 0)
    {
      localStringBuffer1.append("<%").append(localStringBuffer2);
      if (j != 0)
        localStringBuffer1.append("%");
    }
    return localStringBuffer1.toString();
  }

  public void a(String paramString1, String paramString2)
  {
    if (paramString1 == null)
      throw new IllegalArgumentException("No name specified");
    this.c.put(paramString1, paramString2);
  }

  void a(Map paramMap)
  {
    if (paramMap == null)
      throw new IllegalArgumentException("No variables specified");
    this.c.putAll(paramMap);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.be
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
