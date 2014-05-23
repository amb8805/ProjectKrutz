package com.c.a.a;

import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public final class g
{
  private static String c = "UTF-8";
  protected ConcurrentHashMap<String, String> a;
  protected ConcurrentHashMap<String, h> b;

  public g()
  {
    c();
  }

  public g(Map<String, String> paramMap)
  {
    c();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str1 = (String)localEntry.getKey();
      String str2 = (String)localEntry.getValue();
      if ((str1 != null) && (str2 != null))
        this.a.put(str1, str2);
    }
  }

  private void c()
  {
    this.a = new ConcurrentHashMap();
    this.b = new ConcurrentHashMap();
  }

  private List<BasicNameValuePair> d()
  {
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localLinkedList.add(new BasicNameValuePair((String)localEntry.getKey(), (String)localEntry.getValue()));
    }
    return localLinkedList;
  }

  public final HttpEntity a()
  {
    Object localObject;
    if (!this.b.isEmpty())
    {
      localObject = new j();
      Iterator localIterator1 = this.a.entrySet().iterator();
      while (localIterator1.hasNext())
      {
        Map.Entry localEntry2 = (Map.Entry)localIterator1.next();
        ((j)localObject).a((String)localEntry2.getKey(), (String)localEntry2.getValue());
      }
      int i = -1 + this.b.entrySet().size();
      Iterator localIterator2 = this.b.entrySet().iterator();
      int j = 0;
      if (!localIterator2.hasNext())
        break label258;
      Map.Entry localEntry1 = (Map.Entry)localIterator2.next();
      h localh = (h)localEntry1.getValue();
      boolean bool;
      if (localh.a != null)
      {
        if (j != i)
          break label206;
        bool = true;
        label161: if (localh.c == null)
          break label212;
        ((j)localObject).a((String)localEntry1.getKey(), localh.a(), localh.a, localh.c, bool);
      }
      while (true)
      {
        j++;
        break;
        label206: bool = false;
        break label161;
        label212: ((j)localObject).a((String)localEntry1.getKey(), localh.a(), localh.a, "application/octet-stream", bool);
      }
    }
    try
    {
      localObject = new UrlEncodedFormEntity(d(), c);
      label258: return localObject;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localUnsupportedEncodingException.printStackTrace();
    }
    return null;
  }

  protected final String b()
  {
    return URLEncodedUtils.format(d(), c);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator1 = this.a.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry2 = (Map.Entry)localIterator1.next();
      if (localStringBuilder.length() > 0)
        localStringBuilder.append("&");
      localStringBuilder.append((String)localEntry2.getKey());
      localStringBuilder.append("=");
      localStringBuilder.append((String)localEntry2.getValue());
    }
    Iterator localIterator2 = this.b.entrySet().iterator();
    while (localIterator2.hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)localIterator2.next();
      if (localStringBuilder.length() > 0)
        localStringBuilder.append("&");
      localStringBuilder.append((String)localEntry1.getKey());
      localStringBuilder.append("=");
      localStringBuilder.append("FILE");
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.c.a.a.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
