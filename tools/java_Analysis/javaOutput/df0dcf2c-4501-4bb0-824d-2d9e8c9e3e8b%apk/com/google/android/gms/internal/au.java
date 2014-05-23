package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class au
  implements SafeParcelable
{
  public static final s a = new s();
  private final int b;
  private final HashMap<String, HashMap<String, ar.a<?, ?>>> c;
  private final ArrayList<au.a> d;
  private final String e;

  au(int paramInt, ArrayList<au.a> paramArrayList, String paramString)
  {
    this.b = paramInt;
    this.d = null;
    this.c = a(paramArrayList);
    this.e = ((String)f.a(paramString));
    d();
  }

  private static HashMap<String, HashMap<String, ar.a<?, ?>>> a(ArrayList<au.a> paramArrayList)
  {
    HashMap localHashMap = new HashMap();
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
    {
      au.a locala = (au.a)paramArrayList.get(j);
      localHashMap.put(locala.c, locala.a());
    }
    return localHashMap;
  }

  private void d()
  {
    Iterator localIterator1 = this.c.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str = (String)localIterator1.next();
      HashMap localHashMap = (HashMap)this.c.get(str);
      Iterator localIterator2 = localHashMap.keySet().iterator();
      while (localIterator2.hasNext())
        ((ar.a)localHashMap.get((String)localIterator2.next())).a(this);
    }
  }

  final int a()
  {
    return this.b;
  }

  public final HashMap<String, ar.a<?, ?>> a(String paramString)
  {
    return (HashMap)this.c.get(paramString);
  }

  final ArrayList<au.a> b()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.c.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new au.a(str, (HashMap)this.c.get(str)));
    }
    return localArrayList;
  }

  public final String c()
  {
    return this.e;
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator1 = this.c.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str1 = (String)localIterator1.next();
      localStringBuilder.append(str1).append(":\n");
      HashMap localHashMap = (HashMap)this.c.get(str1);
      Iterator localIterator2 = localHashMap.keySet().iterator();
      while (localIterator2.hasNext())
      {
        String str2 = (String)localIterator2.next();
        localStringBuilder.append("  ").append(str2).append(": ");
        localStringBuilder.append(localHashMap.get(str2));
      }
    }
    return localStringBuilder.toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    s.a(this, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.au
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
