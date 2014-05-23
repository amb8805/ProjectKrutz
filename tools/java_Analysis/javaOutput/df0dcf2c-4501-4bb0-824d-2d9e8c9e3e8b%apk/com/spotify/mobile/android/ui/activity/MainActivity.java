package com.spotify.mobile.android.ui.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarQuirksFixedActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.spotify.android.paste.app.FontSupport;
import com.spotify.mobile.android.devtools.MethodTraceScope;
import com.spotify.mobile.android.provider.aa;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.service.flow.login.NewSignUpFragment;
import com.spotify.mobile.android.spotlets.collection.fragments.CollectionFragment;
import com.spotify.mobile.android.ui.ActionBarManager;
import com.spotify.mobile.android.ui.ActionBarTitle;
import com.spotify.mobile.android.ui.activity.upsell.UpsellDialogActivity;
import com.spotify.mobile.android.ui.fragments.e;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.p;
import com.spotify.mobile.android.ui.fragments.t;
import com.spotify.mobile.android.ui.fragments.y;
import com.spotify.mobile.android.ui.k;
import com.spotify.mobile.android.ui.view.MainLayout;
import com.spotify.mobile.android.ui.view.RevealLayout;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.af;
import com.spotify.mobile.android.util.ai;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cx;
import com.spotify.mobile.android.util.db;
import com.spotify.mobile.android.util.dc;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dr;
import com.spotify.mobile.android.util.ds;
import com.spotify.mobile.android.util.tracking.TrackingService;
import com.spotify.mobile.android.util.v;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainActivity extends ActionBarQuirksFixedActivity
  implements l
{
  private int A = -1;
  private boolean B;
  private boolean C;
  private List<Intent> D = new CopyOnWriteArrayList();
  private boolean E = false;
  private v F;
  private String G;
  private String H;
  private m I;
  private h J;
  private af K;
  private dr L = null;
  private g M = new g(this);
  private com.spotify.mobile.android.ui.actions.a N = (com.spotify.mobile.android.ui.actions.a)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.a.class);
  private com.spotify.mobile.android.ui.actions.d O = (com.spotify.mobile.android.ui.actions.d)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.d.class);
  private com.spotify.mobile.android.ui.fragments.logic.f P = new MainActivity.1(this);
  private com.spotify.mobile.android.ui.fragments.logic.s Q = new MainActivity.4(this);
  private BroadcastReceiver R = new MainActivity.5(this);
  private BroadcastReceiver S = new MainActivity.6(this);
  private android.support.v4.widget.f T = new MainActivity.7(this);
  private k U = new MainActivity.9(this);
  private o<Cursor> V = new MainActivity.11(this);
  private ActionBarManager o;
  private com.spotify.mobile.android.ui.fragments.i p;
  private FeatureFragment q;
  private com.spotify.mobile.android.ui.fragments.logic.r r;
  private com.spotify.mobile.android.ui.f s;
  private com.spotify.mobile.android.ui.d t;
  private RevealLayout u;
  private DrawerLayout v;
  private boolean w;
  private boolean x;
  private boolean y;
  private boolean z;

  public MainActivity()
  {
  }

  public static Intent a(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, null, null);
  }

  public static Intent a(Context paramContext, String paramString1, String paramString2)
  {
    return a(paramContext, paramString1, paramString2, null);
  }

  public static Intent a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    Assertion.a(paramString1, "Don't call with empty URI");
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString1));
    localIntent.setClass(paramContext, MainActivity.class);
    localIntent.setFlags(67108864);
    localIntent.putExtra("title", paramString2);
    if (paramBundle != null)
      localIntent.putExtras(paramBundle);
    return localIntent;
  }

  public static Fragment a(SpotifyLink paramSpotifyLink, String paramString)
  {
    switch (MainActivity.3.a[paramSpotifyLink.a().ordinal()])
    {
    default:
      return null;
    case 9:
      return new t().a(paramSpotifyLink.d()).b("time_added").c(paramString).a().b();
    case 10:
      return e.a(paramSpotifyLink.d(), paramString, true);
    case 11:
      return com.spotify.mobile.android.ui.fragments.f.a(paramSpotifyLink.d(), paramString);
    case 12:
    case 13:
    }
    return new t().a(paramSpotifyLink.d()).c(paramString).a().b();
  }

  private void a(Intent paramIntent)
  {
    SpotifyLink localSpotifyLink = new SpotifyLink(paramIntent.getDataString());
    if (localSpotifyLink.g())
      com.spotify.mobile.android.util.b.c.a(this, localSpotifyLink);
    b(false);
    String str1 = paramIntent.getStringExtra("title");
    com.spotify.mobile.android.ui.fragments.g localg = com.spotify.mobile.android.ui.d.a(localSpotifyLink, paramIntent, str1, this.G);
    if ((localg != null) && (!ds.a(localg, com.spotify.mobile.android.ui.d.a)))
    {
      a(localg);
      return;
    }
    switch (MainActivity.3.a[localSpotifyLink.a().ordinal()])
    {
    default:
      Assertion.a("If you end up here, SpotifyLink is b0rken.");
      return;
    case 1:
      if (!FeatureFragment.h.a())
      {
        com.spotify.mobile.android.ui.actions.d.a(this, ViewUri.b, aa.a(localSpotifyLink.d()), true);
        return;
      }
      if (this.K != null)
        this.K.b();
      this.K = new af(this, localSpotifyLink, new MainActivity.10(this));
      this.K.a();
      return;
    case 2:
      String str3 = dc.a(localSpotifyLink.d());
      com.spotify.mobile.android.ui.actions.d.a(this, ViewUri.e, ViewUri.SubView.a, com.spotify.mobile.android.provider.r.a(str3), true);
      return;
    case 3:
      String str2 = localSpotifyLink.a(1);
      if ("spotify.internal_crash".equals(str2))
      {
        startService(SpotifyService.a(this, "com.spotify.mobile.android.service.action.CRASH_SERVICE"));
        return;
      }
      b(str2, false, paramIntent.getBooleanExtra("start_radio", false));
      return;
    case 4:
      com.spotify.mobile.android.ui.actions.a.a(this, ViewUri.b, ViewUri.SubView.a);
      return;
    case 5:
      ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.ab);
      com.spotify.mobile.android.ui.actions.a.a(this, ViewUri.b, ViewUri.SubView.a, localClientEvent);
      startActivity(NotificationWebViewActivity.a(this, localSpotifyLink));
      return;
    case 6:
      com.spotify.mobile.android.ui.actions.d.a(this, localSpotifyLink.d());
      return;
    case 7:
      startActivity(UpsellDialogActivity.a(this, 9));
      return;
    case 8:
    }
    Uri localUri = paramIntent.getData();
    if ((localUri != null) && (localUri.toString().startsWith("https://www.spotify.com/redirect/get-premium/")))
    {
      com.spotify.mobile.android.ui.actions.a.a(this, localUri, ViewUri.b, ViewUri.SubView.a, null);
      return;
    }
    Assertion.a("Called with an invalid link: " + localUri);
  }

  private void a(Intent paramIntent, boolean paramBoolean)
  {
    b(paramIntent.getStringExtra("query"), paramBoolean, paramIntent.getBooleanExtra("start_radio", false));
  }

  private void a(Fragment paramFragment, ActionBarTitle paramActionBarTitle)
  {
    com.spotify.mobile.android.ui.f localf = this.s;
    localf.a(paramFragment, paramActionBarTitle);
    this.o.a(localf.a());
  }

  private void a(com.spotify.mobile.android.ui.fragments.g paramg)
  {
    this.s.a(paramg.C(), paramg.a(this));
  }

  private static IntentFilter b(String paramString)
  {
    IntentFilter localIntentFilter = new IntentFilter(paramString);
    localIntentFilter.addCategory("android.intent.category.DEFAULT");
    return localIntentFilter;
  }

  private void b(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(com.spotify.mobile.android.spotlets.search.b.a(paramString, paramBoolean1, paramBoolean2, this.H));
  }

  private boolean i()
  {
    return (this.x) && (this.y);
  }

  private void j()
  {
    bp.b("loadUiFragments", new Object[0]);
    Assertion.a(i(), "tried to load UI fragments before ready");
    this.p = new com.spotify.mobile.android.ui.fragments.i();
    int i;
    if (this.u != null)
    {
      this.u.a(this.p);
      c().a().a(2131362515, this.p, "tag_navigation_fragment").a(2131362512, new p()).a(2131362513, new com.spotify.mobile.android.ui.fragments.s()).b();
      if ((!FeatureFragment.b.a()) && (!FeatureFragment.c.a()))
        break label222;
      i = 1;
      label119: if ((i == 0) || (!FeatureFragment.d.a()))
        break label227;
      this.s.a(com.spotify.mobile.android.spotlets.browse.b.a(this.G, getString(2131689964)), getString(2131689964));
    }
    while (true)
    {
      onNewIntent(getIntent());
      if (l())
      {
        bp.b("Loading UI fragments, dispatching queued Intents", new Object[0]);
        k();
      }
      m();
      setVisible(true);
      v_();
      this.z = true;
      return;
      this.v.a(this.T);
      break;
      label222: i = 0;
      break label119;
      label227: if ((FeatureFragment.e.a()) && ((FeatureFragment.h.a()) || (FeatureFragment.g.a())) && (getIntent().getBooleanExtra("extra_manual_login", false)))
      {
        if (i != 0)
          this.s.a(com.spotify.mobile.android.spotlets.browse.b.a(this.G, getString(2131689964)), getString(2131689964));
        else
          this.s.a(com.spotify.mobile.android.spotlets.browse.a.a(getString(2131689646), this.G), getString(2131689646));
      }
      else
        this.s.a(CollectionFragment.b(), getString(2131689687));
    }
  }

  private void k()
  {
    Assertion.a(l(), "must have queued intent");
    if (((!i()) || (this.B)) && (!this.z))
    {
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Boolean.valueOf(this.B);
      arrayOfObject[1] = Boolean.valueOf(i());
      arrayOfObject[2] = Boolean.valueOf(this.z);
      bp.b("Cannot dispatch queued Intents, paused: %b, uiFragmentsReadyToLoad: %b, uiFragmentsLoaded: %b", arrayOfObject);
      return;
    }
    Iterator localIterator = this.D.iterator();
    while (localIterator.hasNext())
      onNewIntent((Intent)localIterator.next());
    this.D.clear();
  }

  private boolean l()
  {
    return !this.D.isEmpty();
  }

  private void m()
  {
    if (this.L != null)
    {
      double d = this.L.a() / 1000.0D;
      ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.ad);
      localClientEvent.a("time-taken", String.valueOf(d));
      com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.a.class);
      com.spotify.mobile.android.ui.actions.a.a(this, ViewUri.a, localClientEvent);
      this.L = null;
    }
  }

  public final void a(Fragment paramFragment, String paramString)
  {
    a(paramFragment, new ActionBarTitle(this, paramString));
  }

  public final void a(ActionBarTitle paramActionBarTitle)
  {
    a(this.s.b(), paramActionBarTitle);
  }

  public final void a(m paramm)
  {
    this.I = paramm;
  }

  public final void b(boolean paramBoolean)
  {
    if (this.u != null)
    {
      this.u.a(paramBoolean);
      return;
    }
    this.v.c();
  }

  public final com.spotify.mobile.android.ui.f f()
  {
    return this.s;
  }

  public final boolean g()
  {
    if (this.u != null)
      return this.u.a();
    return this.v.d();
  }

  public final void h()
  {
    v_();
  }

  public void onBackPressed()
  {
    if (g())
      b(true);
    while (((this.I != null) && (this.I.F())) || (this.s.c()))
      return;
    finish();
  }

  protected void onCreate(Bundle paramBundle)
  {
    com.spotify.mobile.android.devtools.a.a(MethodTraceScope.b);
    if (!((dk)com.spotify.mobile.android.c.c.a(dk.class)).b())
      setTheme(2131755257);
    FontSupport.a(this);
    super.onCreate(paramBundle);
    if (!com.spotify.android.paste.widget.f.a(this))
      ActionBarManager.a(this);
    bp.b("onCreate", new Object[0]);
    if ((paramBundle == null) && ("android.intent.action.MAIN".equals(getIntent().getAction())))
    {
      this.L = new dr();
      int i = getIntent().getIntExtra("signup-v1-status", -2147483648);
      String str1 = getIntent().getStringExtra("signup-v1-email-error");
      String str2 = getIntent().getStringExtra("signup-v1-username-error");
      String str3 = getIntent().getStringExtra("signup-v1-birthdate-error");
      String str4 = getIntent().getStringExtra("signup-v1-other-error");
      if (i != -2147483648)
      {
        cx localcx = cw.a(this).a();
        localcx.a(NewSignUpFragment.a, i);
        localcx.a(NewSignUpFragment.b, str1);
        localcx.a(NewSignUpFragment.c, str2);
        localcx.a(NewSignUpFragment.d, str3);
        localcx.a(NewSignUpFragment.e, str4);
        localcx.a();
      }
      long l = System.currentTimeMillis();
      Bundle localBundle = new Bundle();
      localBundle.putLong("ARG_TIMESTAMP", l);
      TrackingService.a(this, "TYPE_COLD_START", null, localBundle);
    }
    setVisible(false);
    if (com.spotify.android.paste.widget.f.a(this))
    {
      setContentView(2130903190);
      this.o = new ActionBarManager(this);
      this.u = ((RevealLayout)cc.a(findViewById(2131362517), "Couldn't find R.id.reveal"));
      this.u.a(new MainActivity.8(this));
      MainLayout localMainLayout = (MainLayout)cc.a(findViewById(2131362447), "Couldn't find R.id.content");
      this.s = new com.spotify.mobile.android.ui.f(this, c(), localMainLayout);
      this.t = new com.spotify.mobile.android.ui.d();
      this.J = new h(this, this.s);
      ((ai)com.spotify.mobile.android.c.c.a(ai.class)).a(this.J);
      if (paramBundle != null)
      {
        bp.b("onCreate, restoring state", new Object[0]);
        this.w = paramBundle.getBoolean("login_handled", false);
        this.z = paramBundle.getBoolean("ui_fragments_loaded", false);
        this.E = paramBundle.getBoolean("dialog_handler_added", false);
        this.p = ((com.spotify.mobile.android.ui.fragments.i)c().a("tag_navigation_fragment"));
        this.q = ((FeatureFragment)c().a("tag_feature_fragment"));
        if (this.q != null)
          this.q.a(this.P);
        this.r = ((com.spotify.mobile.android.ui.fragments.logic.r)c().a("tag_session_fragment"));
        if (this.r != null)
          this.r.a(this.Q);
        this.s.a(paramBundle.getBundle("navigation_state"));
        if (this.u == null)
          break label726;
        this.u.a(this.p);
      }
    }
    while (true)
    {
      registerReceiver(this.S, b("com.spotify.mobile.android.service.broadcast.session.SOCIAL_ERROR"));
      IntentFilter localIntentFilter = b("com.spotify.mobile.android.service.broadcast.session.UPDATE_AVAILABLE");
      localIntentFilter.addDataScheme("http");
      registerReceiver(this.R, localIntentFilter);
      db.a(this, ClientInfo.a());
      com.spotify.mobile.android.util.a.a.a(getApplicationContext()).a(new MainActivity.2(this), this);
      this.s.a(this.U);
      setVolumeControlStream(3);
      d().a(2131362128, null, this.V);
      com.spotify.mobile.android.devtools.a.b(MethodTraceScope.b);
      return;
      setContentView(2130903189);
      this.o = new ActionBarManager(this);
      this.v = ((DrawerLayout)cc.a(findViewById(2131362510), "Couldn't find R.id.drawer_layout"));
      break;
      label726: this.v.a(this.T);
    }
  }

  protected void onDestroy()
  {
    ((ai)com.spotify.mobile.android.c.c.a(ai.class)).b(this.J);
    d().a(2131362128);
    unregisterReceiver(this.R);
    unregisterReceiver(this.S);
    super.onDestroy();
  }

  protected void onNewIntent(Intent paramIntent)
  {
    if (paramIntent == null);
    String str;
    do
    {
      return;
      str = paramIntent.getAction();
      if ("com.spotify.mobile.android.ui.action.sdcard_alert.SHOW".equals(str))
        new y().a(c(), "SdCardAlert");
      setIntent(paramIntent);
      if (this.B)
      {
        bp.b("Enqueueing Intent because the app is paused", new Object[0]);
        this.D.add(paramIntent);
        return;
      }
      if ("com.facebook.application.174829003346".equals(paramIntent.getAction()))
        paramIntent.setAction("android.intent.action.VIEW");
      if ("android.intent.action.SEARCH".equals(str))
      {
        a(paramIntent, false);
        return;
      }
      if ("android.media.action.MEDIA_PLAY_FROM_SEARCH".equals(str))
      {
        a(paramIntent, true);
        return;
      }
      if ("android.intent.action.VIEW".equals(str))
      {
        a(paramIntent);
        return;
      }
      if ("android.nfc.action.NDEF_DISCOVERED".equals(str))
      {
        a(paramIntent);
        return;
      }
    }
    while (!"com.spotify.mobile.android.ui.action.player.SHOW".equals(str));
    com.spotify.mobile.android.ui.actions.d.a(this);
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 16908332)
    {
      if (g())
      {
        b(true);
        return true;
      }
      if (this.u != null)
      {
        this.u.b();
        return true;
      }
      this.v.b();
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }

  protected void onPause()
  {
    super.onPause();
    startService(SpotifyService.a(this, "com.spotify.mobile.android.service.action.client.BACKGROUND"));
    this.B = true;
    if (this.F != null)
      this.F.cancel(false);
    if (this.K != null)
    {
      this.K.b();
      this.K = null;
    }
  }

  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    ActionBarTitle localActionBarTitle = this.s.a();
    if (!TextUtils.isEmpty(localActionBarTitle))
      this.o.a(localActionBarTitle);
    this.o.b(new ActionBarTitle(this, getString(2131689504), true));
  }

  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if (this.o.a())
      return false;
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }

  protected void onResume()
  {
    super.onResume();
    startService(SpotifyService.a(this, "com.spotify.mobile.android.service.action.client.FOREGROUND"));
    if ((this.v != null) && (this.v.d()))
      this.o.b(1.0F);
    this.B = false;
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putBoolean("login_handled", this.w);
    paramBundle.putBoolean("ui_fragments_loaded", this.z);
    paramBundle.putBoolean("dialog_handler_added", this.E);
    paramBundle.putBundle("navigation_state", this.s.d());
    this.C = false;
    super.onSaveInstanceState(paramBundle);
  }

  public boolean onSearchRequested()
  {
    if (!(this.s.b() instanceof com.spotify.mobile.android.spotlets.search.b))
      startActivity(a(this, ViewUri.y.toString(), null, null));
    return false;
  }

  protected void onStart()
  {
    super.onStart();
    i.a(this).a();
    this.C = true;
  }

  protected void onStop()
  {
    super.onStop();
    i.a(this).b();
    this.C = false;
  }

  protected void onUserLeaveHint()
  {
    super.onUserLeaveHint();
    com.spotify.mobile.android.ui.fragments.s locals = (com.spotify.mobile.android.ui.fragments.s)c().a(2131362513);
    if (locals != null)
      locals.C();
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    Assertion.a("Don't call setTitle() directly, use setTitleForFragment() instead.");
  }

  protected final void u_()
  {
    super.u_();
    if (l())
    {
      bp.b("Resuming fragments, dispatching queued Intents", new Object[0]);
      k();
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.MainActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
