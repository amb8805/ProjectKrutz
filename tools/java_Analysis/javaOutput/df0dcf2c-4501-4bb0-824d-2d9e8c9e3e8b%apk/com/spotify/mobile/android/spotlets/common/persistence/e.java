package com.spotify.mobile.android.spotlets.common.persistence;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.base.i;
import com.spotify.mobile.android.ui.fragments.l;

public final class e extends l
{
  private boolean a;
  private f b;
  private String c;

  public e()
  {
  }

  static e a(String paramString1, String paramString2)
  {
    e locale = new e();
    Bundle localBundle = new Bundle();
    if (!TextUtils.isEmpty(paramString2))
      localBundle.putString("feature_name", paramString2);
    localBundle.putString("user", paramString1);
    locale.b_(localBundle);
    return locale;
  }

  final a C()
  {
    i.b(this.a, "Cannot call getFeaturePersistence with no feature name");
    return this.b;
  }

  public final void a(Bundle paramBundle)
  {
    this.c = ((String)i.a(((Bundle)i.a(g())).getString("user")));
    if (g().containsKey("feature_name"))
    {
      this.b = new f(this, (String)i.a(g().getString("feature_name")));
      this.a = true;
    }
    super.a(paramBundle);
  }

  final String b()
  {
    return this.c;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.common.persistence.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
