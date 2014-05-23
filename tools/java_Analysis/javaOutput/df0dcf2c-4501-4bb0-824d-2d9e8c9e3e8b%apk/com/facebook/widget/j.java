package com.facebook.widget;

import android.content.Context;
import android.os.Bundle;
import com.facebook.Session;
import com.facebook.internal.af;

class j<CONCRETE extends j<?>>
{
  private Context a;
  private Session b;
  private String c;
  private String d;
  private int e = 16973840;
  private l f;
  private Bundle g;

  protected j(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    af.a(paramString1, "applicationId");
    this.c = paramString1;
    this.a = paramContext;
    this.d = paramString2;
    if (paramBundle != null)
    {
      this.g = paramBundle;
      return;
    }
    this.g = new Bundle();
  }

  public h a()
  {
    if ((this.b != null) && (this.b.a()))
    {
      this.g.putString("app_id", this.b.d());
      this.g.putString("access_token", this.b.e());
    }
    while (true)
    {
      if (!this.g.containsKey("redirect_uri"))
        this.g.putString("redirect_uri", "fbconnect://success");
      return new h(this.a, this.d, this.g, this.e, this.f);
      this.g.putString("app_id", this.c);
    }
  }

  public final CONCRETE a(l paraml)
  {
    this.f = paraml;
    return this;
  }

  protected final String b()
  {
    return this.c;
  }

  protected final Context c()
  {
    return this.a;
  }

  protected final int d()
  {
    return this.e;
  }

  protected final Bundle e()
  {
    return this.g;
  }

  protected final l f()
  {
    return this.f;
  }
}

/* Location:
 * Qualified Name:     com.facebook.widget.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
