package com.twitter.android;

import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.widget.Toast;
import com.twitter.android.client.i;
import com.twitter.android.client.j;

final class bw extends i
{
  private bw(UsersFragment paramUsersFragment)
  {
  }

  private void a(int paramInt)
  {
    if ((this.a.d == null) || (this.a.l == null) || (this.a.l.getCursor() == null))
      return;
    if (paramInt > 0)
    {
      this.a.d.a(this.a.l.getCount());
      return;
    }
    this.a.d.a(0);
  }

  public final void a(j paramj, String paramString1, int paramInt1, String paramString2, int paramInt2)
  {
    dp localdp = this.a.c(paramString1);
    if (localdp != null)
    {
      a(paramInt2);
      this.a.c(localdp.b);
      if (paramInt1 != 200)
        Toast.makeText(this.a.getActivity(), 2131427412, 1).show();
    }
  }

  public final void a(j paramj, String paramString1, int paramInt1, String paramString2, int paramInt2, long paramLong1, long paramLong2)
  {
    if ((this.a.c(paramString1) != null) && (paramInt1 != 200))
      Toast.makeText(this.a.getActivity(), 2131427427, 1).show();
  }

  public final void a(j paramj, String paramString1, int paramInt1, String paramString2, long paramLong, int paramInt2, int paramInt3)
  {
    dp localdp = this.a.c(paramString1);
    if (localdp != null)
    {
      a(paramInt3);
      this.a.c(localdp.b);
      if (paramInt1 != 200)
        Toast.makeText(this.a.getActivity(), 2131427412, 1).show();
    }
  }

  public final void b(j paramj, String paramString1, int paramInt1, String paramString2, int paramInt2)
  {
    dp localdp = this.a.c(paramString1);
    if (localdp != null)
    {
      if ((this.a.l != null) && (this.a.l.getCount() > 0))
        this.a.l.notifyDataSetChanged();
      a(paramInt2);
      this.a.c(localdp.b);
    }
  }

  public final void b(j paramj, String paramString1, int paramInt1, String paramString2, int paramInt2, long paramLong1, long paramLong2)
  {
    if ((this.a.c(paramString1) != null) && (paramInt1 != 200))
      Toast.makeText(this.a.getActivity(), 2131427426, 1).show();
  }

  public final void b(j paramj, String paramString1, int paramInt1, String paramString2, long paramLong, int paramInt2, int paramInt3)
  {
    dp localdp = this.a.c(paramString1);
    if (localdp != null)
    {
      a(paramInt3);
      this.a.c(localdp.b);
      if (paramInt1 != 200)
        Toast.makeText(this.a.getActivity(), 2131427412, 1).show();
    }
  }

  public final void c(j paramj, String paramString1, int paramInt1, String paramString2, long paramLong, int paramInt2)
  {
    dp localdp = this.a.c(paramString1);
    if (localdp != null)
    {
      this.a.c(localdp.b);
      if (paramInt1 != 200)
        break label63;
      if (localdp.b == 3)
      {
        this.a.e = String.valueOf(paramLong);
        this.a.f();
      }
    }
    return;
    label63: a(0);
    Toast.makeText(this.a.getActivity(), 2131427412, 1).show();
  }

  public final void c(j paramj, String paramString1, int paramInt1, String paramString2, long paramLong, int paramInt2, int paramInt3)
  {
    dp localdp = this.a.c(paramString1);
    if (localdp != null)
    {
      a(paramInt3);
      this.a.c(localdp.b);
      if (paramInt1 != 200)
        Toast.makeText(this.a.getActivity(), 2131427412, 1).show();
    }
  }

  public final void d(j paramj, String paramString1, int paramInt, String paramString2)
  {
    this.a.c(paramString1);
    if (((paramInt == 200) || (paramInt == 418)) && (this.a.l != null))
    {
      Cursor localCursor = this.a.l.getCursor();
      if (localCursor != null)
        localCursor.requery();
    }
  }

  public final void e(j paramj, String paramString1, int paramInt, String paramString2)
  {
    this.a.c(paramString1);
    if ((paramInt == 200) && (this.a.l != null))
    {
      Cursor localCursor = this.a.l.getCursor();
      if (localCursor != null)
        localCursor.requery();
    }
  }

  public final void f(j paramj, String paramString1, int paramInt, String paramString2, long paramLong)
  {
    if ((this.a.c(paramString1) != null) && (paramInt != 200))
      Toast.makeText(this.a.getActivity(), 2131427418, 1).show();
  }

  public final void g(j paramj, String paramString1, int paramInt, String paramString2, long paramLong)
  {
    if ((this.a.c(paramString1) != null) && (paramInt != 200))
      Toast.makeText(this.a.getActivity(), 2131427416, 1).show();
  }

  public final void h(j paramj, String paramString1, int paramInt, String paramString2, long paramLong)
  {
    if ((this.a.c(paramString1) != null) && (paramInt != 200))
      Toast.makeText(this.a.getActivity(), 2131427419, 1).show();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.bw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
