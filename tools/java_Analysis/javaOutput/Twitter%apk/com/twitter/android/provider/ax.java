package com.twitter.android.provider;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import ap;
import be;

public class ax
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new bc();
  public static final String[] b;
  public static final String[] c;
  public boolean A;
  public int B = 1;
  public ap C;
  public long D = -1L;
  private int E;
  private String a;
  public String d;
  public String e;
  public String f;
  public String g;
  public long h;
  public String i;
  public long j = -1L;
  public String k;
  public boolean l;
  public boolean m;
  public long n;
  public long o;
  public String p;
  public long q;
  public boolean r;
  public long s;
  public int t = 1;
  public boolean u;
  public double v;
  public double w;
  public byte[] x;
  public boolean y;
  public long z;

  static
  {
    String[] arrayOfString = { "_id", "g_status_id", "content", "username", "name", "author_id", "updated_at", "source", "source_url", "in_r_status_id", "image_url", "place_name", "protected", "favorited", "retweet_count", "latitude", "longitude", "place_bounding", "is_last", "timeline", "entities", "type", "tweet_type", "sender_id", "s_username", "ref_id", "place_type", "verified", "place_id", "s_name", "created" };
    b = arrayOfString;
    c = new String[1 + arrayOfString.length];
    System.arraycopy(b, 0, c, 0, b.length);
    c[b.length] = "rt_orig_ref_id";
  }

  public ax()
  {
  }

  public ax(Cursor paramCursor)
  {
    a(paramCursor);
  }

  public ax(Parcel paramParcel)
  {
    this.d = paramParcel.readString();
    this.e = paramParcel.readString();
    this.g = paramParcel.readString();
    this.h = paramParcel.readLong();
    this.i = paramParcel.readString();
    this.a = paramParcel.readString();
    this.j = paramParcel.readLong();
    this.k = paramParcel.readString();
    boolean bool1;
    boolean bool2;
    label117: boolean bool3;
    label165: boolean bool4;
    label198: boolean bool5;
    if (paramParcel.readInt() == 1)
    {
      bool1 = true;
      this.l = bool1;
      if (paramParcel.readInt() != 1)
        break label326;
      bool2 = true;
      this.m = bool2;
      this.n = paramParcel.readLong();
      this.o = paramParcel.readLong();
      this.p = paramParcel.readString();
      this.q = paramParcel.readLong();
      if (paramParcel.readInt() != 1)
        break label331;
      bool3 = true;
      this.r = bool3;
      this.s = paramParcel.readLong();
      this.t = paramParcel.readInt();
      if (paramParcel.readInt() != 1)
        break label337;
      bool4 = true;
      this.u = bool4;
      this.v = paramParcel.readDouble();
      this.w = paramParcel.readDouble();
      this.x = paramParcel.createByteArray();
      if (paramParcel.readInt() != 1)
        break label343;
      bool5 = true;
      label239: this.y = bool5;
      this.E = paramParcel.readInt();
      this.z = paramParcel.readLong();
      if (paramParcel.readInt() != 1)
        break label349;
    }
    label326: label331: label337: label343: label349: for (boolean bool6 = true; ; bool6 = false)
    {
      this.A = bool6;
      this.B = paramParcel.readInt();
      this.C = ((ap)paramParcel.readParcelable(getClass().getClassLoader()));
      this.D = paramParcel.readLong();
      this.f = paramParcel.readString();
      return;
      bool1 = false;
      break;
      bool2 = false;
      break label117;
      bool3 = false;
      break label165;
      bool4 = false;
      break label198;
      bool5 = false;
      break label239;
    }
  }

  public static boolean a(be parambe)
  {
    return (parambe != null) && (parambe.c != null);
  }

  public final String a()
  {
    if (TextUtils.isEmpty(this.g))
      return this.p;
    return this.g;
  }

  public void a(Cursor paramCursor)
  {
    this.q = paramCursor.getLong(23);
    this.e = paramCursor.getString(24);
    this.s = paramCursor.getLong(1);
    boolean bool1;
    boolean bool2;
    label150: boolean bool3;
    label170: boolean bool4;
    label231: boolean bool5;
    if (paramCursor.getInt(22) == 1)
    {
      bool1 = true;
      this.r = bool1;
      this.d = paramCursor.getString(2);
      this.g = paramCursor.getString(4);
      this.h = paramCursor.getLong(30);
      this.i = paramCursor.getString(7);
      this.a = paramCursor.getString(8);
      this.j = paramCursor.getLong(9);
      this.k = paramCursor.getString(10);
      if (paramCursor.getInt(13) != 1)
        break label455;
      bool2 = true;
      this.l = bool2;
      if (paramCursor.getInt(12) != 1)
        break label460;
      bool3 = true;
      this.m = bool3;
      this.n = paramCursor.getLong(5);
      this.p = paramCursor.getString(3);
      this.o = this.s;
      if ((paramCursor.isNull(15)) || (paramCursor.isNull(16)))
        break label466;
      bool4 = true;
      this.u = bool4;
      if (bool4)
      {
        this.v = paramCursor.getDouble(15);
        this.w = paramCursor.getDouble(16);
      }
      this.x = paramCursor.getBlob(20);
      if (paramCursor.getInt(22) != 4)
        break label472;
      bool5 = true;
      label293: this.y = bool5;
      this.E = paramCursor.getInt(14);
      this.z = paramCursor.getLong(25);
      if (paramCursor.getInt(27) != 1)
        break label478;
    }
    label455: label460: label466: label472: label478: for (boolean bool6 = true; ; bool6 = false)
    {
      this.A = bool6;
      if (!paramCursor.isNull(26))
        this.C = new ap(paramCursor.getString(28), paramCursor.getInt(26), paramCursor.getString(11), paramCursor.getString(17));
      int i1 = paramCursor.getColumnIndex("rt_orig_ref_id");
      if ((i1 != -1) && (!paramCursor.isNull(i1)))
        this.D = paramCursor.getLong(i1);
      this.f = paramCursor.getString(29);
      return;
      bool1 = false;
      break;
      bool2 = false;
      break label150;
      bool3 = false;
      break label170;
      bool4 = false;
      break label231;
      bool5 = false;
      break label293;
    }
  }

  public final boolean a(long paramLong)
  {
    return (this.D > 0L) || ((this.q == paramLong) && (this.r));
  }

  public final String b()
  {
    if (TextUtils.isEmpty(this.f))
      return this.e;
    return this.f;
  }

  public final boolean c()
  {
    return (this.u) || ((this.C != null) && (this.C.a == 1));
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass()))
      return false;
    ax localax = (ax)paramObject;
    return this.s == localax.s;
  }

  public int hashCode()
  {
    return (int)(this.s ^ this.s >>> 32);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
    paramParcel.writeString(this.g);
    paramParcel.writeLong(this.h);
    paramParcel.writeString(this.i);
    paramParcel.writeString(this.a);
    paramParcel.writeLong(this.j);
    paramParcel.writeString(this.k);
    int i1;
    int i2;
    label88: int i3;
    label136: int i4;
    label168: int i5;
    if (this.l)
    {
      i1 = 1;
      paramParcel.writeInt(i1);
      if (!this.m)
        break label285;
      i2 = 1;
      paramParcel.writeInt(i2);
      paramParcel.writeLong(this.n);
      paramParcel.writeLong(this.o);
      paramParcel.writeString(this.p);
      paramParcel.writeLong(this.q);
      if (!this.r)
        break label291;
      i3 = 1;
      paramParcel.writeInt(i3);
      paramParcel.writeLong(this.s);
      paramParcel.writeInt(this.t);
      if (!this.u)
        break label297;
      i4 = 1;
      paramParcel.writeInt(i4);
      paramParcel.writeDouble(this.v);
      paramParcel.writeDouble(this.w);
      paramParcel.writeByteArray(this.x);
      if (!this.y)
        break label303;
      i5 = 1;
      label208: paramParcel.writeInt(i5);
      paramParcel.writeInt(this.E);
      paramParcel.writeLong(this.z);
      if (!this.A)
        break label309;
    }
    label285: label291: label297: label303: label309: for (int i6 = 1; ; i6 = 0)
    {
      paramParcel.writeInt(i6);
      paramParcel.writeInt(this.B);
      paramParcel.writeParcelable(this.C, paramInt);
      paramParcel.writeLong(this.D);
      paramParcel.writeString(this.f);
      return;
      i1 = 0;
      break;
      i2 = 0;
      break label88;
      i3 = 0;
      break label136;
      i4 = 0;
      break label168;
      i5 = 0;
      break label208;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.provider.ax
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
