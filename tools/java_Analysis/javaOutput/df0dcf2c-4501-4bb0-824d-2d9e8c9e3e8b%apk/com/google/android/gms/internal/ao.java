package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class ao
  implements SafeParcelable, p<String, Integer>
{
  public static final n a = new n();
  private final int b;
  private final HashMap<String, Integer> c;
  private final HashMap<Integer, String> d;
  private final ArrayList<ao.a> e;

  public ao()
  {
    this.b = 1;
    this.c = new HashMap();
    this.d = new HashMap();
    this.e = null;
  }

  ao(int paramInt, ArrayList<ao.a> paramArrayList)
  {
    this.b = paramInt;
    this.c = new HashMap();
    this.d = new HashMap();
    this.e = null;
    a(paramArrayList);
  }

  private void a(ArrayList<ao.a> paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      ao.a locala = (ao.a)localIterator.next();
      a(locala.c, locala.d);
    }
  }

  final int a()
  {
    return this.b;
  }

  public final ao a(String paramString, int paramInt)
  {
    this.c.put(paramString, Integer.valueOf(paramInt));
    this.d.put(Integer.valueOf(paramInt), paramString);
    return this;
  }

  final ArrayList<ao.a> b()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.c.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(new ao.a(str, ((Integer)this.c.get(str)).intValue()));
    }
    return localArrayList;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    n.a(this, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.ao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
