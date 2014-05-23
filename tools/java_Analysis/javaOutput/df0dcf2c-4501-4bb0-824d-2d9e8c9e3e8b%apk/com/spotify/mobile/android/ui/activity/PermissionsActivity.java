package com.spotify.mobile.android.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.ad;
import com.facebook.x;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.av;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.ct;
import com.spotify.mobile.android.util.dv;

public class PermissionsActivity extends BaseFragmentActivity
{
  private ct n;
  private ad o;
  private x p = new PermissionsActivity.1(this);

  public PermissionsActivity()
  {
  }

  protected final void a(Session paramSession, SessionState paramSessionState, Exception paramException)
  {
    bp.b("%s %s", new Object[] { paramSessionState, paramException });
    if ((paramSession != null) && (paramSession.a()))
    {
      if (av.a(av.b))
      {
        this.n.a(1);
        setResult(-1);
        finish();
      }
    }
    else
      return;
    av.b(this);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.o.a(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 101) && (paramInt2 == 0))
    {
      this.n.a(0);
      setResult(2);
      finish();
      return;
    }
    this.n.a(1);
    setResult(-1);
    finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.o = new ad(this, this.p);
    this.o.a(paramBundle);
    a(dv.a(this, ViewUri.J));
    this.n = new ct(this);
  }

  protected void onDestroy()
  {
    super.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
    this.o.b();
  }

  public void onResume()
  {
    super.onResume();
    Session localSession = Session.h();
    if ((localSession != null) && ((localSession.a()) || (localSession.b())))
      a(localSession, localSession.c(), null);
    this.o.a();
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    this.o.b(paramBundle);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.PermissionsActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
