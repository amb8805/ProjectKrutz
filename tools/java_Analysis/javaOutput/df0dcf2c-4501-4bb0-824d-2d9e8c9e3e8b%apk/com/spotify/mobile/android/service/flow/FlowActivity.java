package com.spotify.mobile.android.service.flow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.g;
import android.support.v4.app.h;
import android.support.v4.app.l;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.AnimationDirection;
import com.spotify.mobile.android.ui.activity.BaseFragmentActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.bp;

public abstract class FlowActivity extends BaseFragmentActivity
{
  private static final String n = FlowActivity.class.getSimpleName();
  private com.spotify.mobile.android.ui.actions.a o = (com.spotify.mobile.android.ui.actions.a)c.a(com.spotify.mobile.android.ui.actions.a.class);
  private com.spotify.mobile.android.service.flow.a.a p;
  private a q;
  private boolean r;
  private a s;
  private AnimationDirection t;
  private boolean u;
  private h v = new FlowActivity.1(this);

  public FlowActivity()
  {
  }

  protected final void a(com.spotify.mobile.android.service.flow.a.a parama)
  {
    l locall = c().a();
    if (this.p != null)
      locall.a(this.p);
    locall.a(parama, null);
    locall.b();
    this.p = parama;
  }

  public final void a(a parama, AnimationDirection paramAnimationDirection)
  {
    a(parama, paramAnimationDirection, true);
  }

  public final void a(a parama, AnimationDirection paramAnimationDirection, boolean paramBoolean)
  {
    Assertion.a(true, "Fragment container for the flow activity has not been set");
    if (!this.r)
    {
      this.s = parama;
      this.t = paramAnimationDirection;
      this.u = paramBoolean;
      return;
    }
    this.q = parama;
    l locall = c().a();
    if (paramBoolean)
      locall.a();
    locall.a(paramAnimationDirection.enter, paramAnimationDirection.exit, paramAnimationDirection.popEnter, paramAnimationDirection.popExit);
    locall.b(2131362255, parama, "flow_fragment");
    locall.b();
  }

  public final void a(ViewUri.Verified paramVerified, ClientEvent.SubEvent paramSubEvent)
  {
    if (isFinishing())
    {
      bp.d(n, new Object[] { "Already finishing." });
      return;
    }
    this.o.a(this, paramVerified, paramSubEvent);
    Intent localIntent = e();
    if (localIntent != null)
      startActivity(localIntent);
    setResult(2);
    finish();
  }

  public final Intent e()
  {
    return (Intent)getIntent().getParcelableExtra("intent");
  }

  public final a f()
  {
    return this.q;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (this.q != null)
      this.q.a(paramInt1, paramInt2, paramIntent);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }

  public void onBackPressed()
  {
    a locala = this.q;
    boolean bool = false;
    if (locala != null)
      bool = this.q.b();
    if (!bool)
      super.onBackPressed();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    c().a(this.v);
    setResult(0);
  }

  protected void onPause()
  {
    super.onPause();
    this.r = false;
  }

  protected void onResume()
  {
    super.onResume();
    this.r = true;
    if (this.s != null)
    {
      a(this.s, this.t, this.u);
      this.s = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.flow.FlowActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
