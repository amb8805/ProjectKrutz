package com.twitter.android;

import android.location.Location;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new cr();
  private static final boolean b = Log.isLoggable("PostStorage", 3);
  ArrayList a;
  private final List c = new ArrayList();

  public d()
  {
  }

  public d(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    if (b)
      Log.d("PostStorage", "--> Storage items: " + i);
    int j = 0;
    if (j < i)
    {
      int n = paramParcel.readInt();
      if (b)
        Log.d("PostStorage", "Type: " + n);
      String str1 = paramParcel.readString();
      if (b)
        Log.d("PostStorage", "Req id: " + str1);
      int i1 = paramParcel.readInt();
      if (b)
        Log.d("PostStorage", "Tag: " + i1);
      switch (n)
      {
      default:
      case 0:
      case 1:
      case 2:
      }
      while (true)
      {
        j++;
        break;
        cc localcc = new cc(str1);
        Location localLocation = (Location)paramParcel.readParcelable(null);
        localcc.a(localLocation);
        if (b)
          Log.d("PostStorage", "Location: " + localLocation);
        a(localcc);
        continue;
        String str3 = paramParcel.readString();
        if (b)
          Log.d("PostStorage", "Full URL: " + str3);
        an localan = new an(str1, str3, i1);
        String str4 = paramParcel.readString();
        localan.a(str4);
        if (b)
          Log.d("PostStorage", "Short URL: " + str4);
        a(localan);
        continue;
        Uri localUri = (Uri)paramParcel.readParcelable(null);
        if (b)
          Log.d("PostStorage", "Media URI: " + localUri);
        cq localcq = new cq(str1, localUri);
        String str2 = paramParcel.readString();
        localcq.a(str2);
        if (b)
          Log.d("PostStorage", "Media URL: " + str2);
        a(localcq);
      }
    }
    int k = paramParcel.readInt();
    if (k > 0)
    {
      ArrayList localArrayList = new ArrayList(k);
      for (int m = 0; m < k; m++)
        localArrayList.add(Integer.valueOf(paramParcel.readInt()));
      this.a = localArrayList;
    }
  }

  public final Location a()
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      if (locall.a == 0)
        return ((cc)locall).d;
    }
    return null;
  }

  public final l a(int paramInt)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      if (locall.b == paramInt)
      {
        this.c.remove(locall);
        return locall;
      }
    }
    return null;
  }

  public final l a(Uri paramUri)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      if ((2 == locall.a) && (paramUri.equals(((cq)locall).e)))
        return locall;
    }
    return null;
  }

  public final void a(l paraml)
  {
    this.c.add(paraml);
  }

  public final cc b()
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      if (locall.a == 0)
        return (cc)locall;
    }
    return null;
  }

  public final void b(l paraml)
  {
    this.c.remove(paraml);
  }

  public final List c()
  {
    return this.c;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (b)
      Log.d("PostStorage", "--> Saving items: " + this.c.size());
    paramParcel.writeInt(this.c.size());
    Iterator localIterator1 = this.c.iterator();
    while (localIterator1.hasNext())
    {
      l locall = (l)localIterator1.next();
      paramParcel.writeInt(locall.a);
      paramParcel.writeString(locall.c);
      paramParcel.writeInt(locall.b);
      switch (locall.a())
      {
      default:
        break;
      case 0:
        paramParcel.writeParcelable(((cc)locall).d, 0);
        break;
      case 1:
        an localan = (an)locall;
        paramParcel.writeString(localan.d);
        paramParcel.writeString(localan.e);
        break;
      case 2:
        cq localcq = (cq)locall;
        paramParcel.writeParcelable(localcq.e, 0);
        paramParcel.writeString(localcq.d);
      }
    }
    ArrayList localArrayList = this.a;
    if ((localArrayList == null) || (localArrayList.isEmpty()))
      paramParcel.writeInt(0);
    while (true)
    {
      return;
      paramParcel.writeInt(localArrayList.size());
      Iterator localIterator2 = localArrayList.iterator();
      while (localIterator2.hasNext())
        paramParcel.writeInt(((Integer)localIterator2.next()).intValue());
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
