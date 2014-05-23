package com.spotify.mobile.android.service.flow.login;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.facebook.AppEventsLogger;
import com.facebook.Request;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.ad;
import com.facebook.x;
import com.spotify.mobile.android.provider.w;
import com.spotify.mobile.android.ui.activity.DisableOfflineModeActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyError;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.av;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.ca;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.ct;
import com.spotify.mobile.android.util.dm;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;

public class a extends d
{
  private boolean a = false;
  private boolean b;
  private View c;
  private dt d;
  private boolean e;
  private x f = new a.1(this);
  private ad g;

  public a()
  {
  }

  private void E()
  {
    if (p())
    {
      i().c().c();
      return;
    }
    this.b = true;
  }

  public static a a(com.spotify.mobile.android.service.flow.a.a parama)
  {
    a locala = new a();
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("isSignUpFlow", false);
    locala.b_(localBundle);
    locala.a(parama);
    return locala;
  }

  public static a b(com.spotify.mobile.android.service.flow.a.a parama)
  {
    a locala = new a();
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("isSignUpFlow", true);
    locala.b_(localBundle);
    locala.a(parama);
    return locala;
  }

  public final b D()
  {
    return (b)((com.spotify.mobile.android.service.flow.a.a)l_()).a(this);
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = (View)cc.a(paramLayoutInflater.inflate(2130903137, paramViewGroup, false));
    this.c = localView.findViewById(2131362382);
    this.e = true;
    return localView;
  }

  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
    FragmentActivity localFragmentActivity = i();
    if (localFragmentActivity == null);
    do
    {
      return;
      if (Session.h() != null)
        Session.h().a(localFragmentActivity, paramInt1, paramInt2, paramIntent);
      this.g.a(paramInt1, paramInt2, paramIntent);
    }
    while (paramInt2 != 0);
    this.e = false;
    E();
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.g = new ad(i(), this.f);
    this.g.a(paramBundle);
    r();
    this.b = false;
    this.d = dv.b(i(), ViewUri.O);
  }

  protected final void a(SessionState paramSessionState, Exception paramException)
  {
    FragmentActivity localFragmentActivity = i();
    bp.b("%s %s", new Object[] { paramSessionState, paramException });
    if (paramException != null)
    {
      if (localFragmentActivity != null)
        dm.a(localFragmentActivity, paramException);
      E();
    }
    while ((paramSessionState == null) || (!paramSessionState.a()))
      return;
    if (this.c != null)
      this.c.setVisibility(0);
    Request.a(new Request[] { Request.a(Session.h(), new c(this, 0)) });
  }

  public final void a(e parame)
  {
    super.a(parame);
    cc.a(g(), "Arguments not set for FacebookSSOFragment, you must use the create methods to instantiate");
    boolean bool = g().getBoolean("isSignUpFlow", false);
    if ((!this.a) && (parame.b()))
    {
      this.a = true;
      if (bool)
      {
        new ct(i()).a(0);
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("should_show_trial_start_notice", Boolean.valueOf(false));
        i().getContentResolver().update(w.a, localContentValues, null, null);
      }
    }
    if (this.a)
    {
      if (bool)
        D().a();
    }
    else
      return;
    D().b();
  }

  protected final void a(SpotifyError paramSpotifyError)
  {
    super.a(paramSpotifyError);
    if (this.c != null)
      this.c.setVisibility(8);
    if (SpotifyError.G.equals(paramSpotifyError))
    {
      a(new Intent(i(), DisableOfflineModeActivity.class), 1);
      return;
    }
    String str1 = paramSpotifyError.a(i());
    ca localca = ((com.spotify.mobile.android.service.flow.a.c)l_()).F();
    if ((localca != null) && (localca.b()));
    for (String str2 = str1 + " " + a(2131689965); ; str2 = str1)
    {
      Toast.makeText(i(), str2, 1).show();
      E();
      return;
    }
  }

  public final boolean b_()
  {
    return false;
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    this.g.b(paramBundle);
  }

  public final void q_()
  {
    super.q_();
    AppEventsLogger.b();
  }

  public final void w()
  {
    super.w();
    this.d.a();
    Session localSession1 = Session.h();
    if ((localSession1 != null) && ((localSession1.a()) || (localSession1.b())))
      a(localSession1.c(), null);
    if (this.b)
    {
      i().c().c();
      this.b = false;
    }
    FragmentActivity localFragmentActivity;
    x localx;
    if (this.e)
    {
      localFragmentActivity = (FragmentActivity)cc.a(i());
      Session localSession2 = Session.h();
      if (localSession2 == null)
      {
        Assertion.b("Facebook session was null, ohlson was wrong. Remove me.");
        localSession2 = new Session(localFragmentActivity);
        Session.a(localSession2);
      }
      if ((localSession2.a()) || (localSession2.b()))
        break label169;
      localx = this.f;
    }
    while (true)
    {
      try
      {
        av.a(this, localx);
        this.e = false;
        this.g.a();
        return;
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        bp.b(localUnsupportedOperationException, "error requesting read permissions");
        dm.i(localFragmentActivity);
        E();
        continue;
      }
      label169: Session.a(localFragmentActivity, this, this.f);
    }
  }

  public final void x()
  {
    super.x();
    this.g.b();
    this.d.b();
  }

  public final void y()
  {
    super.y();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.flow.login.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
