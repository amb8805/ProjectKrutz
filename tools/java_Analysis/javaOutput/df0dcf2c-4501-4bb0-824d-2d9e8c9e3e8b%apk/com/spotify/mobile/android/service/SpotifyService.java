package com.spotify.mobile.android.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.view.KeyEvent;
import com.spotify.cosmos.android.router.RemotableNativeRouter;
import com.spotify.cosmos.router.NativeRouter;
import com.spotify.cosmos.smash.Connection;
import com.spotify.mobile.android.core.internal.ConnectivityListener;
import com.spotify.mobile.android.d.e;
import com.spotify.mobile.android.d.h;
import com.spotify.mobile.android.orbit.NativeOrbitFactory;
import com.spotify.mobile.android.orbit.OrbitFactory;
import com.spotify.mobile.android.orbit.OrbitServiceInterface;
import com.spotify.mobile.android.orbit.OrbitServiceObserver;
import com.spotify.mobile.android.service.managers.ConnectManager;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.activity.upsell.i;
import com.spotify.mobile.android.ui.activity.upsell.r;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.PlaybackListener;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.bk;
import com.spotify.mobile.android.util.bm;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.bt;
import com.spotify.mobile.android.util.bx;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cx;
import com.spotify.mobile.android.util.cy;
import com.spotify.mobile.android.util.db;
import com.spotify.mobile.android.util.dm;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;

public class SpotifyService extends Service
{
  public static final cy a = cy.a("delete_cache_flag");
  public static final cy b = cy.a("service_crash_count");
  public static final cy c = cy.a("missing_sdcard_intent_sent");
  private long A = 0L;
  private bx B = new SpotifyService.1(this);
  private BroadcastReceiver C = new SpotifyService.2(this);
  private final aj D = new aj(this);
  private Locale E;
  private Connection F;
  private i G;
  private r H;
  private OrbitFactory I;
  private aq J;
  private ae K;
  private OrbitServiceObserver L = new SpotifyService.6(this);
  private ai d = (ai)com.spotify.mobile.android.c.c.a(SpotifyService.class, ai.class);
  private boolean e;
  private OrbitServiceInterface f;
  private com.spotify.mobile.android.service.managers.d g;
  private com.spotify.mobile.android.service.managers.b h;
  private com.spotify.mobile.android.service.managers.c i;
  private ConnectManager j;
  private HandlerThread k;
  private RemotableNativeRouter l;
  private com.spotify.mobile.android.util.c m = new com.spotify.mobile.android.util.c();
  private af n;
  private ao o;
  private ag p;
  private PlaybackListener q;
  private bt r;
  private Handler s = new Handler();
  private h t;
  private e u;
  private b v;
  private com.spotify.mobile.android.service.gcm.a w;
  private Handler x;
  private Handler y;
  private SpotifyBatteryReceiver z;

  static
  {
    com.spotify.mobile.android.c.c.a(SpotifyService.class, OrbitFactory.class, new NativeOrbitFactory());
    com.spotify.mobile.android.c.c.a(SpotifyService.class, ai.class, new ai());
    com.spotify.mobile.android.c.c.a(SpotifyService.class, aq.class, new aq());
    com.spotify.mobile.android.c.c.a(SpotifyService.class, ae.class, new ae());
  }

  public SpotifyService()
  {
  }

  public static Intent a(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent(paramString);
    localIntent.setClass(paramContext, SpotifyService.class);
    return localIntent;
  }

  private void a(Intent paramIntent)
  {
    boolean bool1 = paramIntent.getBooleanExtra("force_previous", false);
    com.spotify.mobile.android.service.managers.c localc = this.i;
    boolean bool2 = false;
    if (!bool1)
      bool2 = true;
    localc.b(bool2);
  }

  private static void a(String paramString)
  {
    File localFile1 = new File(paramString, "Users");
    if (!localFile1.exists());
    File[] arrayOfFile1;
    while (true)
    {
      return;
      arrayOfFile1 = localFile1.listFiles();
      if (arrayOfFile1 != null)
        try
        {
          int i1 = arrayOfFile1.length;
          for (i2 = 0; i2 < i1; i2++)
          {
            localFile2 = arrayOfFile1[i2];
            if ((localFile2 != null) && (localFile2.exists()) && (localFile2.isDirectory()))
            {
              bm.e("SpotifyService", "Deleting state files in " + localFile2.getName());
              bp.b("Deleting state files in " + localFile2.getName(), new Object[0]);
              localStringBuilder = new StringBuilder();
              arrayOfFile2 = localFile2.listFiles();
              i3 = arrayOfFile2.length;
              i4 = 0;
              if (i4 < i3)
              {
                localFile3 = arrayOfFile2[i4];
                if ((!localFile3.isFile()) || (!localFile3.delete()))
                  break label242;
                localStringBuilder.append("Deleted ").append(localFile3.getName()).append(". ");
                break label242;
              }
              bp.b(localStringBuilder.toString(), new Object[0]);
              bm.e("SpotifyService", localStringBuilder.toString());
            }
          }
        }
        catch (Throwable localThrowable)
        {
          bp.e("Failed when cleaning state files!", new Object[] { localThrowable });
          return;
        }
    }
    while (true)
    {
      int i2;
      File localFile2;
      StringBuilder localStringBuilder;
      File[] arrayOfFile2;
      int i3;
      int i4;
      File localFile3;
      label242: i4++;
    }
  }

  private void a(boolean paramBoolean)
  {
    com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.c.class);
    com.spotify.mobile.android.ui.actions.c.a(this, paramBoolean);
  }

  public static boolean a(Context paramContext, ServiceConnection paramServiceConnection)
  {
    Intent localIntent = new Intent(paramContext, SpotifyService.class);
    localIntent.setAction("com.spotify.mobile.android.service.action.START_SERVICE");
    paramContext.startService(localIntent);
    boolean bool = paramContext.bindService(localIntent, paramServiceConnection, 1);
    bp.c("Bind to SpotifyService: " + bool, new Object[0]);
    return bool;
  }

  private boolean e()
  {
    return this.d.a().a() == 3;
  }

  private String f()
  {
    Locale localLocale = getResources().getConfiguration().locale;
    if (localLocale == null)
      localLocale = Locale.ENGLISH;
    String str = localLocale.getLanguage();
    if ((str.length() > 0) && (localLocale.getCountry().length() > 0))
      return str + "_" + localLocale.getCountry();
    return str;
  }

  public final void a()
  {
    while (true)
    {
      synchronized (this.d.a())
      {
        if (this.d.a().a() != 1)
          break label1069;
        i1 = 1;
        if (i1 == 0)
        {
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = this.d.a();
          bp.e("Service already started: %s", arrayOfObject1);
          return;
        }
        if (this.d.c())
        {
          SpotifyService.4 local4 = new SpotifyService.4(this);
          this.x.postDelayed(local4, 2000L);
          return;
        }
      }
      if (!this.e)
        return;
      this.d.a().a(2);
      bp.b("Starting service...", new Object[0]);
      an localan = new an(this);
      cw localcw = cw.a(this);
      if (!localan.a())
      {
        if (!this.d.e())
        {
          if (!localcw.a(c, false))
          {
            localcw.a().a(c, true).a();
            Intent localIntent = new Intent(this, MainActivity.class);
            localIntent.addFlags(268435456);
            localIntent.setAction("com.spotify.mobile.android.ui.action.sdcard_alert.SHOW");
            startActivity(localIntent);
          }
          this.d.b();
          this.d.d();
        }
        bp.e("There is no cache location, giving up starting Core", new Object[0]);
        synchronized (this.d.a())
        {
          this.d.a().a(1);
          return;
        }
      }
      localcw.a().a(c, false).b();
      bp.c("The cache location seems ok", new Object[0]);
      int i2 = cw.a(this).a(b, 0);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(i2);
      bp.c("Current crash count is %d", arrayOfObject2);
      if (i2 >= 5)
        a(localan.c());
      String str = f();
      ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.ai, ClientEvent.SubEvent.am);
      localClientEvent.a("deviceNameInfo", ("[" + Build.MANUFACTURER + "/" + Build.MODEL + "/" + Build.DEVICE + "/" + Build.PRODUCT + "/" + Build.BRAND + "]").replaceAll("[,:]", ";"));
      localClientEvent.a("deviceCpuInfo", "[" + Build.CPU_ABI + "/" + Build.CPU_ABI2 + "]");
      localClientEvent.a("androidVersion", "[" + String.valueOf(Build.VERSION.SDK_INT) + "]");
      com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.a.class);
      com.spotify.mobile.android.ui.actions.a.a(ViewUri.a, ViewUri.SubView.a, localClientEvent);
      this.l = new RemotableNativeRouter();
      this.f.setObserver(this.L);
      bp.c("Starting Orbit", new Object[0]);
      NativeRouter localNativeRouter = (NativeRouter)this.l.getNativeRouter();
      this.f.start(localan.b(), localan.c(), str, false, true, localNativeRouter);
      bp.c("Orbit started", new Object[0]);
      this.g = new com.spotify.mobile.android.service.managers.d(this.f.getOrbitSession());
      this.i = new com.spotify.mobile.android.service.managers.c(this.f.getOrbitPlayer());
      this.h = new com.spotify.mobile.android.service.managers.b(this.f.getOrbitProvider(), getContentResolver());
      this.v = new b(this);
      this.v.a();
      this.q = new PlaybackListener(this);
      this.q.a(this.B);
      this.q.a();
      this.r = new bt(this);
      this.k = new HandlerThread("backgroundUpdater");
      this.k.start();
      this.y = new Handler(this.k.getLooper());
      this.n = new af(this, this.r);
      this.n.a();
      this.o = new ao(this, this.q, this.k, new com.spotify.mobile.android.ui.widget.b());
      this.o.a();
      this.p = new ag(this, cw.a(this), this.q, this.k);
      this.p.a();
      this.j = new ConnectManager(this);
      this.j.g();
      this.t = new h(this);
      this.u = new e(this, this.i, this.t, this.p, this.n, this.j);
      this.w = new com.spotify.mobile.android.service.gcm.a(this, this.f.getOrbitPushNotifications());
      this.w.a();
      this.G = new i(this);
      this.G.a();
      this.d.a().a(3);
      this.z = new SpotifyBatteryReceiver(this.g);
      registerReceiver(this.z, SpotifyBatteryReceiver.a());
      bp.c("Service fully started", new Object[0]);
      return;
      label1069: int i1 = 0;
    }
  }

  public final void b()
  {
    synchronized (this.d.a())
    {
      if (!e())
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.d.a();
        bp.e("Service can't shut down unless started first: %s", arrayOfObject);
        return;
      }
      this.d.a().a(0);
      this.d.b();
      this.v.b();
      this.n.b();
      this.o.b();
      this.p.b();
      this.u.a();
      this.h.a();
      this.I.getConnectivityListener().unregister();
      unregisterReceiver(this.z);
      this.q.b();
      this.j.h();
      this.w.b();
      this.G.b();
      if (this.H != null)
      {
        this.H.b();
        this.H = null;
      }
      if (this.F != null)
      {
        this.F.disconnect();
        this.F = null;
      }
      this.f.stop();
      this.K.a(this.x, this.J);
      if (Build.VERSION.SDK_INT >= 18)
      {
        this.k.quitSafely();
        return;
      }
    }
    this.k.quit();
  }

  public final void c()
  {
    this.v.d();
  }

  public final void d()
  {
    this.v.e();
  }

  public IBinder onBind(Intent paramIntent)
  {
    a();
    return this.D;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    Locale localLocale = paramConfiguration.locale;
    if (localLocale == null)
      localLocale = Locale.ENGLISH;
    if ((!localLocale.equals(this.E)) && (e()))
    {
      String str = f();
      bp.b("Setting core language to %s", new Object[] { str });
      this.g.a(str);
    }
    this.E = localLocale;
  }

  public void onCreate()
  {
    bp.e("Creating service", new Object[0]);
    this.x = new Handler();
    this.J = ((aq)com.spotify.mobile.android.c.c.a(SpotifyService.class, aq.class));
    this.K = ((ae)com.spotify.mobile.android.c.c.a(SpotifyService.class, ae.class));
    if (this.d.c());
    while (true)
    {
      return;
      db.a(this, ClientInfo.a());
      ClientInfo localClientInfo = (ClientInfo)com.spotify.mobile.android.c.c.a(ClientInfo.class);
      this.I = ((OrbitFactory)com.spotify.mobile.android.c.c.a(SpotifyService.class, OrbitFactory.class));
      try
      {
        this.f = this.I.createService(this, 0, localClientInfo.b());
        this.e = true;
        cw localcw = cw.a(this);
        if (localcw.a(a, false))
        {
          localcw.a().a(a, false).a();
          this.e = false;
          registerReceiver(this.C, new IntentFilter("com.spotify.mobile.android.service.BROADCAST_DELETE_CACHE_FINISHED"));
          startService(new Intent(this, DeleteCacheService.class));
        }
        this.E = getResources().getConfiguration().locale;
        if (Looper.getMainLooper() == Looper.myLooper())
        {
          new SpotifyService.3(this).execute(new Void[0]);
          return;
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        Assertion.a("Failed to start orbit due to RuntimeException", localRuntimeException);
        this.d.b();
        return;
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
      {
        Assertion.a("Failed to start orbit due to UnsatisfiedLinkError", localUnsatisfiedLinkError);
        this.d.b();
        dm.z(getApplicationContext());
      }
    }
  }

  public void onDestroy()
  {
    bp.e("Destroying service", new Object[0]);
    b();
    super.onDestroy();
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    a();
    if (paramIntent == null);
    String str1;
    do
    {
      do
      {
        do
        {
          ResultReceiver localResultReceiver;
          do
          {
            KeyEvent localKeyEvent;
            do
            {
              String[] arrayOfString;
              do
              {
                Uri localUri;
                String str5;
                do
                {
                  do
                  {
                    return 2;
                    if (!e())
                    {
                      Object[] arrayOfObject3 = new Object[1];
                      arrayOfObject3[0] = this.d.a();
                      bp.e("Service not started - ignoring command: %s", arrayOfObject3);
                      return 2;
                    }
                    str1 = paramIntent.getAction();
                    if ("com.spotify.mobile.android.service.action.session.LOGIN".equals(str1))
                    {
                      Intent localIntent = new Intent(this, LoginActivity.class);
                      localIntent.addFlags(268435456);
                      localIntent.addFlags(65536);
                      startActivity(localIntent);
                      return 2;
                    }
                    if ("com.spotify.mobile.android.service.action.session.LOGOUT".equals(str1))
                    {
                      this.g.b();
                      return 2;
                    }
                    if (!"com.spotify.mobile.android.service.action.request.update.WIDGET".equals(str1))
                      break;
                  }
                  while (this.o == null);
                  this.o.c();
                  return 2;
                  if ("com.spotify.mobile.android.service.action.session.ERASE_OFFLINE_USER".equals(str1))
                  {
                    this.g.c();
                    return 2;
                  }
                  if ("com.spotify.mobile.android.service.action.session.SEND_TO_INBOX".equals(str1))
                  {
                    String str17 = paramIntent.getStringExtra("username");
                    String str18 = paramIntent.getStringExtra("message");
                    String str19 = paramIntent.getDataString();
                    this.g.a(str17, str18, str19);
                    return 2;
                  }
                  String str12;
                  String str13;
                  String str14;
                  String str15;
                  String str16;
                  if ("com.spotify.mobile.android.service.action.session.LOG_EVENT".equals(str1))
                  {
                    str12 = paramIntent.getStringExtra("uri");
                    Assertion.a(str12, "Log event requires an uri. intent.getStringExtra(EXTRA_LOG_EVENT_SOURCE_URI) cannot be null.");
                    str13 = paramIntent.getStringExtra("context");
                    str14 = paramIntent.getStringExtra("event");
                    str15 = paramIntent.getStringExtra("event_version");
                    str16 = paramIntent.getStringExtra("test_version");
                    try
                    {
                      HashMap localHashMap2 = (HashMap)paramIntent.getSerializableExtra("data");
                      if (localHashMap2 == null)
                        localHashMap2 = new HashMap();
                      localHashMap1 = localHashMap2;
                      Object[] arrayOfObject2 = new Object[6];
                      arrayOfObject2[0] = str12;
                      arrayOfObject2[1] = str13;
                      arrayOfObject2[2] = str14;
                      arrayOfObject2[3] = str15;
                      arrayOfObject2[4] = str16;
                      arrayOfObject2[5] = Integer.valueOf(localHashMap1.size());
                      bp.b("Logging event for view %s with context %s: Event %s version %s. Test version: %s, data: %s mappings", arrayOfObject2);
                      this.g.a(str12, str13, str14, str15, str16, localHashMap1);
                      return 2;
                    }
                    catch (ClassCastException localClassCastException)
                    {
                      while (true)
                      {
                        Assertion.a("The EXTRA_LOG_EVENT_DATA is not of expected type HashMap<String, String>.");
                        HashMap localHashMap1 = new HashMap();
                      }
                    }
                  }
                  if ("com.spotify.mobile.android.service.action.session.LOG_VIEW".equals(str1))
                  {
                    String str11 = paramIntent.getStringExtra("uri");
                    Assertion.a(str11, "Log view requires an uri. intent.getStringExtra(EXTRA_LOG_VIEW_URI) cannot be null.");
                    long l2 = paramIntent.getLongExtra("duration", 0L);
                    Object[] arrayOfObject1 = new Object[2];
                    arrayOfObject1[0] = str11;
                    arrayOfObject1[1] = Long.valueOf(l2);
                    bp.b("Logging view %s at duration %d", arrayOfObject1);
                    this.g.a(str11, l2);
                    return 2;
                  }
                  if (!"com.spotify.mobile.android.service.action.player.PLAY_CONTENT".equals(str1))
                    break;
                  localUri = paramIntent.getData();
                  Assertion.a(localUri, "Content URI missing from intent: " + paramIntent);
                  str5 = localUri.getAuthority();
                  Assertion.a(str5, "No authority part set for the content uri " + localUri);
                }
                while ((str5 == null) || (!str5.equals("com.spotify.mobile.android")));
                String str6 = localUri.getEncodedPath();
                Assertion.a(str6, "Content URI path missing: " + localUri);
                String str7 = str6.substring(1);
                long l1 = paramIntent.getLongExtra("row_id", 0L);
                boolean bool = paramIntent.getBooleanExtra("shuffle", false);
                String str8 = paramIntent.getStringExtra("uri");
                String str9 = paramIntent.getStringExtra("context");
                String str10 = paramIntent.getStringExtra("referer");
                this.i.a(str7, (int)l1, bool, str8, str9, str10);
                return 2;
                if ("com.spotify.mobile.android.service.action.player.CLEAR_QUEUE".equals(str1))
                {
                  this.i.a();
                  return 2;
                }
                if ("com.spotify.mobile.android.service.action.player.TOGGLE_PAUSED".equals(str1))
                {
                  this.i.b();
                  return 2;
                }
                if ("com.spotify.mobile.android.service.action.player.PREVIOUS".equals(str1))
                {
                  a(paramIntent);
                  return 2;
                }
                if ("com.spotify.mobile.android.service.action.player.NEXT".equals(str1))
                {
                  this.i.c();
                  return 2;
                }
                if ("com.spotify.mobile.android.service.action.player.SEEK".equals(str1))
                {
                  int i3 = paramIntent.getIntExtra("position", 0);
                  this.i.a(i3);
                  return 2;
                }
                if ("com.spotify.mobile.android.service.action.player.THUMB_UP".equals(str1))
                {
                  a(true);
                  return 2;
                }
                if ("com.spotify.mobile.android.service.action.player.THUMB_DOWN".equals(str1))
                {
                  a(false);
                  return 2;
                }
                if ("com.spotify.mobile.android.service.action.player.NOTIFICATION_SHUTDOWN".equals(str1))
                {
                  if (this.t.h().d())
                    this.i.a(true);
                  this.t.j().b();
                  return 2;
                }
                if ("com.spotify.mobile.android.service.action.player.NOTIFICATION_ADD_TO_COLLECTION".equals(str1))
                {
                  String str4 = paramIntent.getStringExtra("uri");
                  com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.a.class);
                  com.spotify.mobile.android.ui.actions.a.a(this, ViewUri.aN, ClientEvent.a("notification", ClientEvent.SubEvent.V, null, null));
                  com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.c.class);
                  com.spotify.mobile.android.ui.actions.c.a(this, ViewUri.aN, str4);
                  dm.k(this);
                  return 2;
                }
                if ("com.spotify.mobile.android.service.action.player.SKIP_N_TRACKS_BACKWARDS".equals(str1))
                {
                  int i2 = paramIntent.getIntExtra("n_tracks_to_skip", 0);
                  this.i.b(i2);
                  return 2;
                }
                if ("com.spotify.mobile.android.service.action.player.SKIP_N_TRACKS_FORWARDS".equals(str1))
                {
                  int i1 = paramIntent.getIntExtra("n_tracks_to_skip", 0);
                  this.i.c(i1);
                  return 2;
                }
                if (!"com.spotify.mobile.android.service.action.player.PLAY_PREVIEW".equals(str1))
                  break;
                arrayOfString = paramIntent.getStringArrayExtra("preview_track_uris");
              }
              while (arrayOfString == null);
              this.i.a(arrayOfString);
              return 2;
              if ("com.spotify.mobile.android.service.action.player.STOP_PREVIEW".equals(str1))
              {
                this.i.d();
                return 2;
              }
              if (!"com.spotify.mobile.android.service.action.media_button".equals(str1))
                break;
              localKeyEvent = (KeyEvent)paramIntent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            }
            while ((localKeyEvent == null) || (localKeyEvent.getAction() != 1));
            switch (localKeyEvent.getKeyCode())
            {
            default:
              return 2;
            case 79:
              if (SystemClock.elapsedRealtime() - this.A < getResources().getInteger(2131558409))
                this.i.c();
            case 126:
            case 86:
            case 127:
            case 85:
            case 87:
            case 88:
            }
            while (true)
            {
              this.A = SystemClock.elapsedRealtime();
              return 2;
              this.i.a(false);
              return 2;
              this.i.a(true);
              return 2;
              this.i.b();
              return 2;
              if (this.q.o())
                this.m.a(this, ViewUri.aS, this.q.d());
              this.i.c();
              return 2;
              if (this.q.o())
                this.m.a(this, ViewUri.aS, this.q.d());
              a(paramIntent);
              return 2;
              this.i.b();
            }
            if (!"com.spotify.mobile.android.service.action.player.REQUEST_AUDIO_SESSION".equals(str1))
              break;
            localResultReceiver = (ResultReceiver)paramIntent.getParcelableExtra("callback");
          }
          while (localResultReceiver == null);
          Bundle localBundle = new Bundle();
          localBundle.putInt("audio_session_id", this.v.c());
          localResultReceiver.send(0, localBundle);
          return 2;
          if ("com.spotify.mobile.android.service.action.session.REPORT_AD_URL_CLICKED".equals(str1))
          {
            this.g.d();
            return 2;
          }
          if ("com.spotify.mobile.android.service.action.client.FOREGROUND".equals(str1))
          {
            this.t.c().a();
            return 2;
          }
          if ("com.spotify.mobile.android.service.action.client.BACKGROUND".equals(str1))
          {
            this.t.c().b();
            return 2;
          }
          if ("com.spotify.mobile.android.service.action.client.KILL_TO_DELETE_CACHE".equals(str1))
          {
            aq.a();
            return 2;
          }
          if ("com.spotify.mobile.android.service.action.log.REFERRAL".equals(str1))
          {
            String str2 = paramIntent.getStringExtra("referrer");
            Assertion.a(str2, "Log referral requires an referrer. intent.getStringExtra(EXTRA_LOG_REFERRER) cannot be null.");
            String str3 = paramIntent.getStringExtra("deviceid");
            bp.b("Logging install referral: %s for device: %s", new Object[] { str2, str3 });
            this.g.c(str2, str3);
            return 2;
          }
          if ("com.spotify.mobile.android.service.action.push_notification.OPEN".equals(str1))
          {
            com.spotify.mobile.android.service.gcm.d.a(this, paramIntent.getData(), paramIntent.getStringExtra("tag"));
            return 2;
          }
          if (!"com.spotify.mobile.android.service.action.googleiab.REGISTER_PURCHASES".equals(str1))
            break;
        }
        while (this.G == null);
        this.G.e();
        return 2;
        if (!"com.spotify.mobile.android.service.action.optintrial.START".equals(str1))
          break;
      }
      while (this.H != null);
      SpotifyService.5 local5 = new SpotifyService.5(this);
      this.y.post(local5);
      return 2;
      if ("com.spotify.mobile.android.service.action.START_SERVICE".equals(str1))
      {
        bp.c("Start service action received.", new Object[0]);
        return 2;
      }
    }
    while (!"com.spotify.mobile.android.service.action.CRASH_SERVICE".equals(str1));
    this.f.crash();
    return 2;
  }

  public boolean onUnbind(Intent paramIntent)
  {
    bp.b("Last client disconnected!", new Object[0]);
    return false;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.SpotifyService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
