package com.spotify.mobile.android.service.flow.login;

import android.text.TextUtils;
import com.spotify.mobile.android.util.SignupUtil.AgeVerification;
import com.spotify.mobile.android.util.cc;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class n
{
  private o a;

  public n(o paramo)
  {
    this.a = paramo;
  }

  public static boolean d(String paramString)
  {
    return paramString.length() < 4;
  }

  public static boolean e(String paramString)
  {
    return !TextUtils.isEmpty(paramString);
  }

  public final void a(String paramString)
  {
    if (!e(paramString))
    {
      this.a.a();
      return;
    }
    this.a.b();
  }

  public final void a(Calendar paramCalendar)
  {
    cc.a(paramCalendar);
    long l = paramCalendar.getTimeInMillis();
    SignupUtil.AgeVerification localAgeVerification;
    if (l < new GregorianCalendar(-112 + Calendar.getInstance().get(1), 0, 1).getTimeInMillis())
      localAgeVerification = SignupUtil.AgeVerification.b;
    while (true)
      switch (n.1.a[localAgeVerification.ordinal()])
      {
      default:
        this.a.f();
        return;
        if (l > new GregorianCalendar(-13 + Calendar.getInstance().get(1), 11, 31).getTimeInMillis())
          localAgeVerification = SignupUtil.AgeVerification.c;
        else
          localAgeVerification = SignupUtil.AgeVerification.a;
      case 1:
      case 2:
      }
    this.a.h();
    return;
    this.a.g();
  }

  public final void b(String paramString)
  {
    if (d(paramString))
    {
      this.a.c();
      return;
    }
    this.a.d();
  }

  public final void c(String paramString)
  {
    if (!TextUtils.isEmpty(paramString));
    for (int i = 1; i == 0; i = 0)
    {
      this.a.e();
      return;
    }
    if (d(paramString))
    {
      this.a.c();
      return;
    }
    this.a.d();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.flow.login.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
