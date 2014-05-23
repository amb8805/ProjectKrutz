package com.twitter.android;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;
import com.twitter.android.client.i;
import com.twitter.android.client.j;

final class ar extends i
{
  private ar(ProfileFragment paramProfileFragment)
  {
  }

  public final void a(j paramj, String paramString1, int paramInt1, String paramString2, long paramLong, int paramInt2)
  {
    if (this.a.c(paramString1) != null)
    {
      if (paramInt1 == 200)
        break label54;
      if (paramInt1 == 401)
        ((eh)this.a.g.c()).a(1);
      this.a.g.a(false);
    }
    label54: 
    while (paramInt2 != 0)
      return;
    ((eh)this.a.g.c()).a(2);
    this.a.g.a(false);
  }

  public final void a(j paramj, String paramString1, int paramInt1, String paramString2, long paramLong, int paramInt2, int paramInt3)
  {
    if (this.a.c(paramString1) != null)
    {
      SharedPreferences.Editor localEditor = this.a.a.edit();
      localEditor.putLong("last_refresh", System.currentTimeMillis());
      localEditor.commit();
    }
  }

  public final void d(j paramj, String paramString1, int paramInt, String paramString2)
  {
    if ((this.a.c(paramString1) != null) && (paramInt != 200))
    {
      ProfileFragment localProfileFragment = this.a;
      localProfileFragment.c = (0xFFFFFFFE & localProfileFragment.c);
      this.a.a(true, 2131427534);
      Toast.makeText(this.a.getActivity(), 2131427420, 1).show();
    }
  }

  public final void e(j paramj, String paramString1, int paramInt, String paramString2)
  {
    if ((this.a.c(paramString1) != null) && (paramInt != 200))
    {
      ProfileFragment localProfileFragment = this.a;
      localProfileFragment.c = (0x1 | localProfileFragment.c);
      this.a.a(true, 2131427535);
      Toast.makeText(this.a.getActivity(), 2131427423, 1).show();
    }
  }

  public final void e(j paramj, String paramString1, int paramInt, String paramString2, long paramLong)
  {
    if ((this.a.f != null) && (paramLong == this.a.b))
      this.a.h();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
