package com.spotify.mobile.android.ui.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.g;
import android.support.v4.app.l;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.a.a;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.q;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dv;

public class PlayerActivity extends BaseFragmentActivity
{
  private boolean n;
  private Handler o = new Handler();

  public PlayerActivity()
  {
  }

  protected void onCreate(Bundle paramBundle)
  {
    if (!((dk)c.a(dk.class)).b())
      setTheme(2131755261);
    super.onCreate(paramBundle);
    setVisible(false);
    setContentView(2130903072);
    if (paramBundle == null)
    {
      q localq = new q();
      FeatureFragment localFeatureFragment = new FeatureFragment();
      localFeatureFragment.a(new PlayerActivity.1(this));
      c().a().a(2131362263, localq).a(localFeatureFragment, "tag_feature_fragment").b();
      a.a(c());
    }
    a(dv.a(this, ViewUri.r));
  }

  protected void onStart()
  {
    super.onStart();
    i.a(this).a();
  }

  protected void onStop()
  {
    super.onStop();
    i.a(this).b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.PlayerActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
