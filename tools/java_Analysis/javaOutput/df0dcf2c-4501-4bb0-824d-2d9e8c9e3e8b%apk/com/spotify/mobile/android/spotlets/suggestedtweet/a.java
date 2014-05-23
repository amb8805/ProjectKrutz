package com.spotify.mobile.android.spotlets.suggestedtweet;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.n;
import android.text.TextUtils;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.Flag;
import com.spotify.mobile.android.util.DialogPresenter;
import com.spotify.mobile.android.util.be;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cy;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dq;
import com.spotify.mobile.android.util.m;
import java.util.HashMap;
import java.util.Locale;

public final class a extends com.spotify.mobile.android.ui.fragments.logic.o
{
  static final cy a = cy.a("cat_feedback_has_shown_dialog");
  static final cy b = cy.a("cat_feedback_epoch_track_id");
  private String Y;
  private int Z;
  private boolean aa;
  private String ab;
  private android.support.v4.app.o<Cursor> ac = new a.4(this);
  private final Handler d = new Handler();
  private cw e;
  private be f;
  private boolean g;
  private int h;
  private Boolean i;

  public a()
  {
  }

  private void F()
  {
    this.d.post(new a.3(this));
  }

  public static Intent c(Context paramContext, String paramString)
  {
    if (!TextUtils.isEmpty(paramString));
    while (true)
    {
      return SuggestedTweetActivity.a(paramContext, paramContext.getString(2131690303), paramContext.getString(2131690302), paramString);
      paramString = paramContext.getString(2131690304);
    }
  }

  private void d(boolean paramBoolean)
  {
    boolean bool;
    if (this.i == null)
    {
      bool = true;
      cc.a(bool, "Method should only be called once");
      this.i = Boolean.valueOf(paramBoolean);
      if (paramBoolean)
        break label37;
      F();
    }
    label37: 
    do
    {
      return;
      bool = false;
      break;
      t().a(2131362093, null, this.ac);
    }
    while (this.aa);
    this.f = m.a("https://embed.spotify.com/twitter-feedback/");
    HashMap localHashMap = new HashMap();
    localHashMap.put("lang", Locale.getDefault().getLanguage());
    this.f.a("", localHashMap, new a.1(this));
  }

  protected final void C()
  {
    this.h = this.c.c(this);
  }

  public final void D()
  {
    new a.2(this).execute(new Void[0]);
  }

  protected final void E()
  {
    int j = ((Integer)FeatureFragment.az.e()).intValue();
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.Z);
    arrayOfObject[1] = Integer.valueOf(j);
    arrayOfObject[2] = Boolean.valueOf(this.aa);
    bp.b("Played tracks since epoch track: %d (threshold %d). Tweet text override fetched: %b", arrayOfObject);
    if ((j > 0) && (this.Z >= j) && (this.aa) && (this.c != null) && (!this.g))
    {
      bp.b("Queuing dialog", new Object[0]);
      this.c.b(this);
      this.g = true;
    }
  }

  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
    F();
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Boolean localBoolean = null;
    if (paramBundle != null)
    {
      boolean bool = paramBundle.containsKey("eligibility");
      localBoolean = null;
      if (bool)
        localBoolean = Boolean.valueOf(paramBundle.getBoolean("eligibility"));
      this.g = paramBundle.getBoolean("queued", false);
      this.h = paramBundle.getInt("request_code");
      this.Y = paramBundle.getString("epoch_track_uri");
      this.aa = paramBundle.getBoolean("tweet_text_override_fetched");
      this.ab = paramBundle.getString("tweet_text_override");
    }
    if (this.e == null)
      this.e = cw.a(i());
    if (localBoolean != null)
    {
      d(localBoolean.booleanValue());
      return;
    }
    new b(this, (byte)0).execute(new Void[0]);
  }

  final boolean b()
  {
    if (this.e.a(a, false))
    {
      bp.b("Has already shown dialog, don't show again", new Object[0]);
      return false;
    }
    if (((Integer)FeatureFragment.az.e()).intValue() <= 0)
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = FeatureFragment.az.d();
      arrayOfObject2[1] = FeatureFragment.az.e();
      bp.b("Feature flag %s disables feature (%d)", arrayOfObject2);
      return false;
    }
    if (!((dk)c.a(dk.class)).b())
    {
      bp.b("CAT isn't enabled, don't show", new Object[0]);
      return false;
    }
    if (new dq(i()).a("") != null);
    for (int j = 1; j == 0; j = 0)
    {
      bp.b("Official Twitter client isn't available, don't show", new Object[0]);
      return false;
    }
    this.Y = this.e.a(b, null);
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = this.Y;
    bp.b("Should show dialog after a while, epoch track: %s", arrayOfObject1);
    return true;
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    if (this.i != null)
      paramBundle.putBoolean("eligibility", this.i.booleanValue());
    paramBundle.putBoolean("queued", this.g);
    paramBundle.putInt("request_code", this.h);
    paramBundle.putString("epoch_track_uri", this.Y);
    paramBundle.putBoolean("tweet_text_override_fetched", this.aa);
    paramBundle.putString("tweet_text_override", this.ab);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.suggestedtweet.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
