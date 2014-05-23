package com.facebook;

import android.content.Context;
import android.os.Bundle;
import com.facebook.widget.h;
import com.facebook.widget.i;

final class e extends i
{
  private String a;

  public e(Context paramContext, String paramString, Bundle paramBundle)
  {
    super(paramContext, paramString, "oauth", paramBundle);
  }

  public final e a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  public final h a()
  {
    Bundle localBundle = e();
    localBundle.putString("redirect_uri", "fbconnect://success");
    localBundle.putString("client_id", b());
    localBundle.putString("e2e", this.a);
    return new h(c(), "oauth", localBundle, d(), f());
  }
}

/* Location:
 * Qualified Name:     com.facebook.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
