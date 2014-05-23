package com.spotify.mobile.android.util;

import android.content.Context;
import com.spotify.mobile.android.service.flow.login.NewSignUpFragment.Gender;
import java.util.Calendar;
import java.util.HashMap;

public final class eb
{
  private be a;
  private HashMap<String, String> b;
  private ec c;

  public eb(Context paramContext, ec paramec)
  {
    this.a = m.a(paramContext.getString(2131690408));
    this.b = new HashMap();
    this.b.put("key", "142b583129b2df829de3656f9eb484e6");
    this.c = paramec;
  }

  public final void a()
  {
    this.b.put("iagree", "1");
  }

  public final void a(NewSignUpFragment.Gender paramGender)
  {
    this.b.put("gender", paramGender.a());
  }

  public final void a(String paramString)
  {
    this.b.put("username", paramString);
  }

  public final void a(Calendar paramCalendar)
  {
    String str1 = String.valueOf(paramCalendar.get(5));
    String str2 = String.valueOf(1 + paramCalendar.get(2));
    String str3 = String.valueOf(paramCalendar.get(1));
    this.b.put("birth_day", str1);
    this.b.put("birth_month", str2);
    this.b.put("birth_year", str3);
  }

  public final void b()
  {
    this.a.b("", this.b, new eb.1(this));
  }

  public final void b(String paramString)
  {
    this.b.put("email", paramString);
  }

  public final void c(String paramString)
  {
    this.b.put("password", paramString);
    this.b.put("password_repeat", paramString);
  }

  public final void d(String paramString)
  {
    this.b.put("postal_code", paramString);
  }

  public final void e(String paramString)
  {
    this.b.put("creation_point", paramString);
  }

  public final void f(String paramString)
  {
    this.b.put("creation_flow", paramString);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.eb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
