package com.spotify.mobile.android.service.a;

import android.net.Uri;
import com.google.common.base.i;
import com.spotify.mobile.android.e.a;

public final class b
{
  public final f a;
  public final Uri b;
  public final boolean c;
  public final boolean d;
  public final boolean e;
  public final boolean f;
  public final a<String> g;
  public final boolean h;

  public b(String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, String paramString5, boolean paramBoolean5, boolean paramBoolean6)
  {
    this.a = new f(paramString1, paramString2, paramString3, paramString4, paramBoolean6);
    this.b = ((Uri)i.a(paramUri));
    this.c = paramBoolean1;
    this.d = paramBoolean2;
    this.e = paramBoolean3;
    this.f = paramBoolean4;
    this.g = a.b(paramString5);
    this.h = paramBoolean5;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    b localb;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
        return false;
      localb = (b)paramObject;
      if (this.h != localb.h)
        return false;
      if (this.f != localb.f)
        return false;
      if (this.c != localb.c)
        return false;
      if (this.e != localb.e)
        return false;
      if (this.d != localb.d)
        return false;
      if (!this.g.equals(localb.g))
        return false;
      if (!this.b.equals(localb.b))
        return false;
    }
    while (this.a.equals(localb.a));
    return false;
  }

  public final int hashCode()
  {
    int i = 1;
    int j = 31 * (31 * this.a.hashCode() + this.b.hashCode());
    int k;
    int n;
    label51: int i2;
    label71: int i4;
    label91: int i5;
    if (this.c)
    {
      k = i;
      int m = 31 * (k + j);
      if (!this.d)
        break label129;
      n = i;
      int i1 = 31 * (n + m);
      if (!this.e)
        break label135;
      i2 = i;
      int i3 = 31 * (i2 + i1);
      if (!this.f)
        break label141;
      i4 = i;
      i5 = 31 * (31 * (i4 + i3) + this.g.hashCode());
      if (!this.h)
        break label147;
    }
    while (true)
    {
      return i5 + i;
      k = 0;
      break;
      label129: n = 0;
      break label51;
      label135: i2 = 0;
      break label71;
      label141: i4 = 0;
      break label91;
      label147: i = 0;
    }
  }

  public final String toString()
  {
    return "NotificationState{trackInfo=" + this.a + ", imageUri=" + this.b + ", isPaused=" + this.c + ", isRadio=" + this.d + ", isPrevEnabled=" + this.e + ", isNextEnabled=" + this.f + ", radioThumbState=" + this.g + ", isAdPlaying=" + this.h + '}';
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
