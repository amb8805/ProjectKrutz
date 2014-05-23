package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.g;
import android.support.v4.app.l;
import android.view.View;
import com.spotify.mobile.android.ui.activity.BaseFragmentActivity;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dv;

public class PremiumSignupActivity extends BaseFragmentActivity
{
  public PremiumSignupActivity()
  {
  }

  public static Intent a(Context paramContext, Uri paramUri)
  {
    Intent localIntent = new Intent(paramContext, PremiumSignupActivity.class);
    localIntent.setData(paramUri);
    return localIntent;
  }

  private q e()
  {
    return (q)c().a("premium_signup");
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1)
    {
      q localq = e();
      if (localq != null)
      {
        localq.a(paramInt1, paramInt2, paramIntent);
        return;
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }

  public void onBackPressed()
  {
    q localq = e();
    if ((localq != null) && (localq.C()))
      return;
    super.onBackPressed();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903073);
    if (paramBundle == null)
      c().a().a(2131362266, new q(), "premium_signup").b();
    findViewById(2131362265).setOnClickListener(new PremiumSignupActivity.1(this));
    a(dv.a(this, ViewUri.ao));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.upsell.PremiumSignupActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
