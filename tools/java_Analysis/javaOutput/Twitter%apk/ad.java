import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class ad
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new ce();
  public final long a;
  public final String b;
  public final String c;
  public final String d;
  public final String e;
  public final int f;
  public final String g;
  public final boolean h;
  public final boolean i;
  public final String j;
  public final int k;
  public final int l;
  public final long m;
  public final int n;
  public final p o;
  public final boolean p;
  public final int q;
  public final long r;
  public final int s;
  public long t;
  public boolean u;

  public ad(long paramLong1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, String paramString5, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, String paramString6, int paramInt3, long paramLong2, int paramInt4, boolean paramBoolean3, int paramInt5, long paramLong3, p paramp, long paramLong4, int paramInt6)
  {
    this.a = paramLong1;
    this.b = paramString1;
    this.g = paramString2;
    this.c = paramString3;
    if ((paramString4 != null) && (paramString4.equals("null")))
    {
      this.d = null;
      this.k = paramInt1;
      if ((paramString5 == null) || (!paramString5.equals("null")))
        break label179;
      this.e = null;
      label72: this.f = paramInt2;
      this.h = paramBoolean1;
      this.i = paramBoolean2;
      if ((paramString6 == null) || (!paramString6.equals("null")))
        break label188;
    }
    label179: label188: for (this.j = null; ; this.j = paramString6)
    {
      this.l = paramInt3;
      this.m = paramLong2;
      this.n = paramInt4;
      this.p = paramBoolean3;
      this.q = paramInt5;
      this.r = paramLong3;
      this.o = paramp;
      this.u = false;
      this.t = paramLong4;
      this.s = paramInt6;
      return;
      this.d = paramString4;
      break;
      this.e = paramString5;
      break label72;
    }
  }

  public ad(Parcel paramParcel)
  {
    this.a = paramParcel.readLong();
    this.b = paramParcel.readString();
    this.g = paramParcel.readString();
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.k = paramParcel.readInt();
    this.e = paramParcel.readString();
    this.f = paramParcel.readInt();
    boolean bool1;
    boolean bool2;
    if (paramParcel.readInt() == 1)
    {
      bool1 = true;
      this.h = bool1;
      if (paramParcel.readInt() != 1)
        break label195;
      bool2 = true;
      label93: this.i = bool2;
      this.j = paramParcel.readString();
      this.l = paramParcel.readInt();
      this.m = paramParcel.readLong();
      this.n = paramParcel.readInt();
      if (paramParcel.readInt() != 1)
        break label200;
    }
    label195: label200: for (boolean bool3 = true; ; bool3 = false)
    {
      this.p = bool3;
      this.q = paramParcel.readInt();
      this.r = paramParcel.readLong();
      this.t = paramParcel.readLong();
      this.s = paramParcel.readInt();
      this.o = null;
      this.u = false;
      return;
      bool1 = false;
      break;
      bool2 = false;
      break label93;
    }
  }

  public final String a()
  {
    if (this.b != null)
      return this.b;
    return this.g;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass()))
      return false;
    ad localad = (ad)paramObject;
    if (this.m != localad.m)
      return false;
    if (this.s != localad.s)
      return false;
    if (this.k != localad.k)
      return false;
    if (this.l != localad.l)
      return false;
    if (this.q != localad.q)
      return false;
    if (this.r != localad.r)
      return false;
    if (this.p != localad.p)
      return false;
    if (this.h != localad.h)
      return false;
    if (this.t != localad.t)
      return false;
    if (this.u != localad.u)
      return false;
    if (this.n != localad.n)
      return false;
    if (this.a != localad.a)
      return false;
    if (this.i != localad.i)
      return false;
    if (this.j != null)
    {
      if (this.j.equals(localad.j));
    }
    else
      while (localad.j != null)
        return false;
    if (this.b != null)
    {
      if (this.b.equals(localad.b));
    }
    else
      while (localad.b != null)
        return false;
    if (this.d != null)
    {
      if (this.d.equals(localad.d));
    }
    else
      while (localad.d != null)
        return false;
    if (this.c != null)
    {
      if (this.c.equals(localad.c));
    }
    else
      while (localad.c != null)
        return false;
    if (this.e != null)
    {
      if (this.e.equals(localad.e));
    }
    else
      while (localad.e != null)
        return false;
    if (this.f != localad.f)
      return false;
    if (this.o != null)
    {
      if (this.o.equals(localad.o));
    }
    else
      while (localad.o != null)
        return false;
    if (this.g != null)
    {
      if (this.g.equals(localad.g));
    }
    else
      while (localad.g != null)
        return false;
    return true;
  }

  public final int hashCode()
  {
    int i1 = 31 * (int)(this.a ^ this.a >>> 32);
    int i2;
    int i4;
    label55: int i6;
    label80: int i8;
    label106: int i10;
    label140: int i12;
    label160: int i14;
    label180: int i16;
    label206: int i18;
    label273: int i20;
    label293: int i21;
    if (this.b != null)
    {
      i2 = this.b.hashCode();
      int i3 = 31 * (i1 + i2);
      if (this.c == null)
        break label357;
      i4 = this.c.hashCode();
      int i5 = 31 * (i3 + i4);
      if (this.d == null)
        break label363;
      i6 = this.d.hashCode();
      int i7 = 31 * (i5 + i6);
      if (this.e == null)
        break label369;
      i8 = this.e.hashCode();
      int i9 = 31 * (31 * (i7 + i8) + this.f);
      if (this.g == null)
        break label375;
      i10 = this.g.hashCode();
      int i11 = 31 * (i9 + i10);
      if (!this.h)
        break label381;
      i12 = 1;
      int i13 = 31 * (i11 + i12);
      if (!this.i)
        break label387;
      i14 = 1;
      int i15 = 31 * (i13 + i14);
      if (this.j == null)
        break label393;
      i16 = this.j.hashCode();
      int i17 = 31 * (31 * (31 * (31 * (31 * (i15 + i16) + this.k) + this.l) + (int)(this.m ^ this.m >>> 32)) + this.n);
      if (this.o == null)
        break label399;
      i18 = this.o.hashCode();
      int i19 = 31 * (i17 + i18);
      if (!this.p)
        break label405;
      i20 = 1;
      i21 = 31 * (31 * (31 * (31 * (i19 + i20) + this.q) + this.s) + (int)(this.t ^ this.t >>> 32));
      if (!this.u)
        break label411;
    }
    label387: label393: label399: label405: label411: for (int i22 = 1; ; i22 = 0)
    {
      return i21 + i22;
      i2 = 0;
      break;
      label357: i4 = 0;
      break label55;
      label363: i6 = 0;
      break label80;
      label369: i8 = 0;
      break label106;
      label375: i10 = 0;
      break label140;
      label381: i12 = 0;
      break label160;
      i14 = 0;
      break label180;
      i16 = 0;
      break label206;
      i18 = 0;
      break label273;
      i20 = 0;
      break label293;
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.g);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeInt(this.k);
    paramParcel.writeString(this.e);
    paramParcel.writeInt(this.f);
    int i1;
    int i2;
    if (this.h)
    {
      i1 = 1;
      paramParcel.writeInt(i1);
      if (!this.i)
        break label180;
      i2 = 1;
      label88: paramParcel.writeInt(i2);
      paramParcel.writeString(this.j);
      paramParcel.writeInt(this.l);
      paramParcel.writeLong(this.m);
      paramParcel.writeInt(this.n);
      if (!this.p)
        break label186;
    }
    label180: label186: for (int i3 = 1; ; i3 = 0)
    {
      paramParcel.writeInt(i3);
      paramParcel.writeInt(this.q);
      paramParcel.writeLong(this.r);
      paramParcel.writeLong(this.t);
      paramParcel.writeInt(this.s);
      return;
      i1 = 0;
      break;
      i2 = 0;
      break label88;
    }
  }
}

/* Location:
 * Qualified Name:     ad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
