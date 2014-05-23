package com.google.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.ads.internal.AdVideoView;
import com.google.ads.internal.AdWebView;
import com.google.ads.internal.a;
import com.google.ads.internal.d;
import com.google.ads.internal.e;
import com.google.ads.internal.i;
import com.google.ads.util.AdUtil;
import com.google.ads.util.b;
import com.google.ads.util.f;
import com.google.ads.util.g;
import com.google.ads.util.i.b;
import com.google.ads.util.i.c;
import java.util.HashMap;
import java.util.Map;

public class AdActivity extends Activity
  implements View.OnClickListener
{
  public static final String BASE_URL_PARAM = "baseurl";
  public static final String COMPONENT_NAME_PARAM = "c";
  public static final String CUSTOM_CLOSE_PARAM = "custom_close";
  public static final String HTML_PARAM = "html";
  public static final String INTENT_ACTION_PARAM = "i";
  public static final String INTENT_EXTRAS_PARAM = "e";
  public static final String INTENT_FLAGS_PARAM = "f";
  public static final String ORIENTATION_PARAM = "o";
  public static final String PACKAGE_NAME_PARAM = "p";
  public static final String TYPE_PARAM = "m";
  public static final String URL_PARAM = "u";
  private static final a a = (a)a.a.b();
  private static final Object b = new Object();
  private static AdActivity c = null;
  private static d d = null;
  private static AdActivity e = null;
  private static AdActivity f = null;
  private static final AdActivity.StaticMethodWrapper g = new AdActivity.StaticMethodWrapper();
  private AdWebView h;
  private FrameLayout i;
  private int j;
  private ViewGroup k = null;
  private boolean l;
  private long m;
  private RelativeLayout n;
  private AdActivity o = null;
  private boolean p;
  private boolean q;
  private boolean r;
  private boolean s;
  private AdVideoView t;

  public AdActivity()
  {
  }

  private RelativeLayout.LayoutParams a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(paramInt3, paramInt4);
    localLayoutParams.setMargins(paramInt1, paramInt2, 0, 0);
    localLayoutParams.addRule(10);
    localLayoutParams.addRule(9);
    return localLayoutParams;
  }

  private void a(String paramString)
  {
    b.b(paramString);
    finish();
  }

  private void a(String paramString, Throwable paramThrowable)
  {
    b.b(paramString, paramThrowable);
    finish();
  }

  private void e()
  {
    if (!this.l)
      if (this.h != null)
      {
        a.b(this.h);
        this.h.setAdActivity(null);
        this.h.setIsExpandedMraid(false);
        if ((!this.q) && (this.n != null) && (this.k != null))
        {
          if ((!this.r) || (this.s))
            break label238;
          b.a("Disabling hardware acceleration on collapsing MRAID WebView.");
          this.h.g();
        }
      }
    while (true)
    {
      this.n.removeView(this.h);
      this.k.addView(this.h);
      if (this.t != null)
      {
        this.t.e();
        this.t = null;
      }
      if (this == c)
        c = null;
      f = this.o;
      synchronized (b)
      {
        if ((d != null) && (this.q) && (this.h != null))
        {
          if (this.h == d.l())
            d.a();
          this.h.stopLoading();
        }
        if (this == e)
        {
          e = null;
          if (d != null)
          {
            d.u();
            d = null;
          }
        }
        else
        {
          this.l = true;
          b.a("AdActivity is closing.");
          return;
          label238: if ((this.r) || (!this.s))
            continue;
          b.a("Re-enabling hardware acceleration on collapsing MRAID WebView.");
          this.h.h();
          continue;
        }
        b.e("currentAdManager is null while trying to destroy AdActivity.");
      }
    }
  }

  public static boolean isShowing()
  {
    return g.isShowing();
  }

  public static void launchAdActivity(d paramd, e parame)
  {
    g.launchAdActivity(paramd, parame);
  }

  public static boolean leftApplication()
  {
    return g.leftApplication();
  }

  protected View a(int paramInt, boolean paramBoolean)
  {
    this.j = (int)TypedValue.applyDimension(1, paramInt, getResources().getDisplayMetrics());
    this.i = new FrameLayout(getApplicationContext());
    this.i.setMinimumWidth(this.j);
    this.i.setMinimumHeight(this.j);
    this.i.setOnClickListener(this);
    setCustomClose(paramBoolean);
    return this.i;
  }

  protected AdVideoView a(Activity paramActivity)
  {
    return new AdVideoView(paramActivity, this.h);
  }

  protected void a(AdWebView paramAdWebView, boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3)
  {
    requestWindowFeature(1);
    Window localWindow = getWindow();
    localWindow.setFlags(1024, 1024);
    if (AdUtil.a >= 11)
    {
      if (!this.r)
        break label105;
      b.a("Enabling hardware acceleration on the AdActivity window.");
      g.a(localWindow);
    }
    while (true)
    {
      ViewParent localViewParent = paramAdWebView.getParent();
      if (localViewParent != null)
      {
        if (!paramBoolean2)
          break label126;
        if (!(localViewParent instanceof ViewGroup))
          break;
        this.k = ((ViewGroup)localViewParent);
        this.k.removeView(paramAdWebView);
      }
      if (paramAdWebView.i() == null)
        break label134;
      a("Interstitial created with an AdWebView that is already in use by another AdActivity.");
      return;
      label105: b.a("Disabling hardware acceleration on the AdActivity WebView.");
      paramAdWebView.g();
    }
    a("MRAID banner was not a child of a ViewGroup.");
    return;
    label126: a("Interstitial created with an AdWebView that has a parent.");
    return;
    label134: setRequestedOrientation(paramInt);
    paramAdWebView.setAdActivity(this);
    int i1;
    label153: View localView;
    RelativeLayout.LayoutParams localLayoutParams;
    if (paramBoolean2)
    {
      i1 = 50;
      localView = a(i1, paramBoolean3);
      this.n.addView(paramAdWebView, -1, -1);
      localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      if (!paramBoolean2)
        break label264;
      localLayoutParams.addRule(10);
      localLayoutParams.addRule(11);
    }
    while (true)
    {
      this.n.addView(localView, localLayoutParams);
      this.n.setKeepScreenOn(true);
      setContentView(this.n);
      this.n.getRootView().setBackgroundColor(-16777216);
      if (!paramBoolean1)
        break;
      a.a(paramAdWebView);
      return;
      i1 = 32;
      break label153;
      label264: localLayoutParams.addRule(10);
      localLayoutParams.addRule(9);
    }
  }

  protected void a(d paramd)
  {
    this.h = null;
    this.m = SystemClock.elapsedRealtime();
    this.p = true;
    synchronized (b)
    {
      if (c == null)
      {
        c = this;
        paramd.w();
      }
      return;
    }
  }

  // ERROR //
  protected void a(HashMap<String, String> paramHashMap, d paramd)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_1
    //   3: ifnonnull +11 -> 14
    //   6: aload_0
    //   7: ldc_w 354
    //   10: invokespecial 296	com/google/ads/AdActivity:a	(Ljava/lang/String;)V
    //   13: return
    //   14: new 356	android/content/Intent
    //   17: dup
    //   18: invokespecial 357	android/content/Intent:<init>	()V
    //   21: astore 4
    //   23: aload_1
    //   24: ldc 40
    //   26: invokevirtual 363	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   29: checkcast 365	java/lang/String
    //   32: astore 5
    //   34: aload_1
    //   35: ldc 37
    //   37: invokevirtual 363	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   40: checkcast 365	java/lang/String
    //   43: astore 6
    //   45: aload_1
    //   46: ldc 22
    //   48: invokevirtual 363	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   51: checkcast 365	java/lang/String
    //   54: astore 7
    //   56: aload_1
    //   57: ldc 34
    //   59: invokevirtual 363	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   62: checkcast 365	java/lang/String
    //   65: astore 8
    //   67: aload_1
    //   68: ldc 13
    //   70: invokevirtual 363	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   73: checkcast 365	java/lang/String
    //   76: astore 9
    //   78: aload_1
    //   79: ldc 28
    //   81: invokevirtual 363	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   84: checkcast 365	java/lang/String
    //   87: astore 10
    //   89: aload_1
    //   90: ldc 25
    //   92: invokevirtual 363	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   95: checkcast 365	java/lang/String
    //   98: astore 11
    //   100: aload 5
    //   102: invokestatic 371	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   105: ifne +314 -> 419
    //   108: iconst_1
    //   109: istore 12
    //   111: aload 6
    //   113: invokestatic 371	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   116: ifne +309 -> 425
    //   119: iconst_1
    //   120: istore 13
    //   122: iload 12
    //   124: ifeq +307 -> 431
    //   127: iload 13
    //   129: ifeq +302 -> 431
    //   132: aload 4
    //   134: aload 5
    //   136: invokestatic 377	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   139: aload 6
    //   141: invokevirtual 381	android/content/Intent:setDataAndType	(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
    //   144: pop
    //   145: aload 7
    //   147: invokestatic 371	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   150: ifne +316 -> 466
    //   153: aload 4
    //   155: aload 7
    //   157: invokevirtual 385	android/content/Intent:setAction	(Ljava/lang/String;)Landroid/content/Intent;
    //   160: pop
    //   161: aload 8
    //   163: invokestatic 371	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   166: ifne +17 -> 183
    //   169: getstatic 279	com/google/ads/util/AdUtil:a	I
    //   172: iconst_4
    //   173: if_icmplt +10 -> 183
    //   176: aload 4
    //   178: aload 8
    //   180: invokestatic 390	com/google/ads/util/e:a	(Landroid/content/Intent;Ljava/lang/String;)V
    //   183: aload 9
    //   185: invokestatic 371	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   188: ifne +58 -> 246
    //   191: aload 9
    //   193: ldc_w 392
    //   196: invokevirtual 396	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   199: astore 32
    //   201: aload 32
    //   203: arraylength
    //   204: iconst_2
    //   205: if_icmpge +27 -> 232
    //   208: new 398	java/lang/StringBuilder
    //   211: dup
    //   212: invokespecial 399	java/lang/StringBuilder:<init>	()V
    //   215: ldc_w 401
    //   218: invokevirtual 405	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: aload 9
    //   223: invokevirtual 405	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: invokevirtual 409	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   229: invokestatic 203	com/google/ads/util/b:e	(Ljava/lang/String;)V
    //   232: aload 4
    //   234: aload 32
    //   236: iconst_0
    //   237: aaload
    //   238: aload 32
    //   240: iconst_1
    //   241: aaload
    //   242: invokevirtual 413	android/content/Intent:setClassName	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   245: pop
    //   246: aload 10
    //   248: invokestatic 371	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   251: ifne +22 -> 273
    //   254: aload 10
    //   256: invokestatic 419	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   259: istore 31
    //   261: iload 31
    //   263: istore 29
    //   265: aload 4
    //   267: iload 29
    //   269: invokevirtual 423	android/content/Intent:addFlags	(I)Landroid/content/Intent;
    //   272: pop
    //   273: aload 11
    //   275: invokestatic 371	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   278: ifne +282 -> 560
    //   281: new 425	org/json/JSONObject
    //   284: dup
    //   285: aload 11
    //   287: invokespecial 427	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   290: astore 17
    //   292: aload 17
    //   294: invokevirtual 431	org/json/JSONObject:names	()Lorg/json/JSONArray;
    //   297: astore 19
    //   299: iload_3
    //   300: aload 19
    //   302: invokevirtual 437	org/json/JSONArray:length	()I
    //   305: if_icmpge +255 -> 560
    //   308: aload 19
    //   310: iload_3
    //   311: invokevirtual 441	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   314: astore 20
    //   316: aload 17
    //   318: aload 20
    //   320: invokevirtual 445	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   323: astore 21
    //   325: aload 21
    //   327: ldc_w 446
    //   330: invokevirtual 449	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   333: istore 22
    //   335: iload 22
    //   337: tableswitch	default:+35 -> 372, 1:+178->515, 2:+246->583, 3:+265->602, 4:+284->621, 5:+303->640
    //   373: aconst_null
    //   374: d2i
    //   375: dup
    //   376: invokespecial 399	java/lang/StringBuilder:<init>	()V
    //   379: ldc_w 451
    //   382: invokevirtual 405	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   385: aload 20
    //   387: invokevirtual 405	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   390: ldc_w 453
    //   393: invokevirtual 405	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: iload 22
    //   398: invokevirtual 456	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   401: ldc_w 458
    //   404: invokevirtual 405	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   407: invokevirtual 409	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   410: invokestatic 203	com/google/ads/util/b:e	(Ljava/lang/String;)V
    //   413: iinc 3 1
    //   416: goto -117 -> 299
    //   419: iconst_0
    //   420: istore 12
    //   422: goto -311 -> 111
    //   425: iconst_0
    //   426: istore 13
    //   428: goto -306 -> 122
    //   431: iload 12
    //   433: ifeq +17 -> 450
    //   436: aload 4
    //   438: aload 5
    //   440: invokestatic 377	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   443: invokevirtual 462	android/content/Intent:setData	(Landroid/net/Uri;)Landroid/content/Intent;
    //   446: pop
    //   447: goto -302 -> 145
    //   450: iload 13
    //   452: ifeq -307 -> 145
    //   455: aload 4
    //   457: aload 6
    //   459: invokevirtual 465	android/content/Intent:setType	(Ljava/lang/String;)Landroid/content/Intent;
    //   462: pop
    //   463: goto -318 -> 145
    //   466: iload 12
    //   468: ifeq -307 -> 161
    //   471: aload 4
    //   473: ldc_w 467
    //   476: invokevirtual 385	android/content/Intent:setAction	(Ljava/lang/String;)Landroid/content/Intent;
    //   479: pop
    //   480: goto -319 -> 161
    //   483: astore 28
    //   485: new 398	java/lang/StringBuilder
    //   488: dup
    //   489: invokespecial 399	java/lang/StringBuilder:<init>	()V
    //   492: ldc_w 469
    //   495: invokevirtual 405	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   498: aload 10
    //   500: invokevirtual 405	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   503: invokevirtual 409	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   506: invokestatic 203	com/google/ads/util/b:e	(Ljava/lang/String;)V
    //   509: iconst_0
    //   510: istore 29
    //   512: goto -247 -> 265
    //   515: aload 4
    //   517: aload 20
    //   519: aload 21
    //   521: ldc_w 471
    //   524: invokevirtual 475	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   527: invokevirtual 479	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   530: pop
    //   531: goto -118 -> 413
    //   534: astore 18
    //   536: new 398	java/lang/StringBuilder
    //   539: dup
    //   540: invokespecial 399	java/lang/StringBuilder:<init>	()V
    //   543: ldc_w 481
    //   546: invokevirtual 405	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   549: aload 11
    //   551: invokevirtual 405	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   554: invokevirtual 409	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   557: invokestatic 203	com/google/ads/util/b:e	(Ljava/lang/String;)V
    //   560: aload 4
    //   562: new 356	android/content/Intent
    //   565: dup
    //   566: invokespecial 357	android/content/Intent:<init>	()V
    //   569: invokevirtual 485	android/content/Intent:filterEquals	(Landroid/content/Intent;)Z
    //   572: ifeq +87 -> 659
    //   575: aload_0
    //   576: ldc_w 487
    //   579: invokespecial 296	com/google/ads/AdActivity:a	(Ljava/lang/String;)V
    //   582: return
    //   583: aload 4
    //   585: aload 20
    //   587: aload 21
    //   589: ldc_w 471
    //   592: invokevirtual 491	org/json/JSONObject:getDouble	(Ljava/lang/String;)D
    //   595: invokevirtual 494	android/content/Intent:putExtra	(Ljava/lang/String;D)Landroid/content/Intent;
    //   598: pop
    //   599: goto -186 -> 413
    //   602: aload 4
    //   604: aload 20
    //   606: aload 21
    //   608: ldc_w 471
    //   611: invokevirtual 449	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   614: invokevirtual 497	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   617: pop
    //   618: goto -205 -> 413
    //   621: aload 4
    //   623: aload 20
    //   625: aload 21
    //   627: ldc_w 471
    //   630: invokevirtual 501	org/json/JSONObject:getLong	(Ljava/lang/String;)J
    //   633: invokevirtual 504	android/content/Intent:putExtra	(Ljava/lang/String;J)Landroid/content/Intent;
    //   636: pop
    //   637: goto -224 -> 413
    //   640: aload 4
    //   642: aload 20
    //   644: aload 21
    //   646: ldc_w 471
    //   649: invokevirtual 507	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   652: invokevirtual 509	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   655: pop
    //   656: goto -243 -> 413
    //   659: new 398	java/lang/StringBuilder
    //   662: dup
    //   663: invokespecial 399	java/lang/StringBuilder:<init>	()V
    //   666: ldc_w 511
    //   669: invokevirtual 405	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   672: aload 4
    //   674: invokevirtual 514	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   677: invokevirtual 409	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   680: invokestatic 162	com/google/ads/util/b:a	(Ljava/lang/String;)V
    //   683: aload_0
    //   684: aload 4
    //   686: invokevirtual 518	com/google/ads/AdActivity:startActivity	(Landroid/content/Intent;)V
    //   689: aload_0
    //   690: aload_2
    //   691: invokevirtual 520	com/google/ads/AdActivity:a	(Lcom/google/ads/internal/d;)V
    //   694: return
    //   695: astore 16
    //   697: aload_0
    //   698: aload 16
    //   700: invokevirtual 523	android/content/ActivityNotFoundException:getMessage	()Ljava/lang/String;
    //   703: aload 16
    //   705: invokespecial 525	com/google/ads/AdActivity:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   708: return
    //
    // Exception table:
    //   from	to	target	type
    //   254	261	483	java/lang/NumberFormatException
    //   281	299	534	org/json/JSONException
    //   299	335	534	org/json/JSONException
    //   372	413	534	org/json/JSONException
    //   515	531	534	org/json/JSONException
    //   583	599	534	org/json/JSONException
    //   602	618	534	org/json/JSONException
    //   621	637	534	org/json/JSONException
    //   640	656	534	org/json/JSONException
    //   659	694	695	android/content/ActivityNotFoundException
  }

  public AdVideoView getAdVideoView()
  {
    return this.t;
  }

  public AdWebView getOpeningAdWebView()
  {
    if (this.o != null)
      return this.o.h;
    synchronized (b)
    {
      if (d == null)
      {
        b.e("currentAdManager was null while trying to get the opening AdWebView.");
        return null;
      }
    }
    AdWebView localAdWebView = d.l();
    if (localAdWebView != this.h)
      return localAdWebView;
    return null;
  }

  public void moveAdVideoView(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.t != null)
    {
      this.t.setLayoutParams(a(paramInt1, paramInt2, paramInt3, paramInt4));
      this.t.requestLayout();
    }
  }

  public void newAdVideoView(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.t == null)
    {
      this.t = a(this);
      this.n.addView(this.t, 0, a(paramInt1, paramInt2, paramInt3, paramInt4));
      synchronized (b)
      {
        if (d == null)
        {
          b.e("currentAdManager was null while trying to get the opening AdWebView.");
          return;
        }
        d.m().b(false);
        return;
      }
    }
  }

  public void onClick(View paramView)
  {
    finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.l = false;
    d locald;
    boolean bool1;
    Bundle localBundle;
    while (true)
    {
      synchronized (b)
      {
        if (d != null)
        {
          locald = d;
          if (e == null)
          {
            e = this;
            locald.v();
          }
          if ((this.o == null) && (f != null))
            this.o = f;
          f = this;
          if (((locald.i().a()) && (e == this)) || ((locald.i().b()) && (this.o == e)))
            locald.x();
          bool1 = locald.r();
          m.a locala = (m.a)((m)locald.i().d.a()).b.a();
          if (AdUtil.a >= ((Integer)locala.b.a()).intValue())
          {
            bool2 = true;
            this.s = bool2;
            if (AdUtil.a < ((Integer)locala.d.a()).intValue())
              break label268;
            bool3 = true;
            this.r = bool3;
            this.n = null;
            this.p = false;
            this.q = true;
            this.t = null;
            localBundle = getIntent().getBundleExtra("com.google.ads.AdOpener");
            if (localBundle != null)
              break;
            a("Could not get the Bundle used to create AdActivity.");
          }
        }
        else
        {
          a("Could not get currentAdManager.");
          return;
        }
      }
      boolean bool2 = false;
      continue;
      label268: boolean bool3 = false;
    }
    e locale = new e(localBundle);
    String str1 = locale.b();
    HashMap localHashMap = locale.c();
    if (str1.equals("intent"))
    {
      a(localHashMap, locald);
      return;
    }
    this.n = new RelativeLayout(getApplicationContext());
    if (str1.equals("webapp"))
    {
      this.h = new AdWebView(locald.i(), null);
      Map localMap = a.d;
      boolean bool7;
      String str3;
      String str4;
      label463: String str5;
      int i2;
      label490: AdWebView localAdWebView;
      if (!bool1)
      {
        bool7 = true;
        i locali = i.a(locald, localMap, true, bool7);
        locali.d(true);
        if (bool1)
          locali.a(true);
        this.h.setWebViewClient(locali);
        String str2 = (String)localHashMap.get("u");
        str3 = (String)localHashMap.get("baseurl");
        str4 = (String)localHashMap.get("html");
        if (str2 == null)
          break label540;
        this.h.loadUrl(str2);
        str5 = (String)localHashMap.get("o");
        if (!"p".equals(str5))
          break label574;
        i2 = AdUtil.b();
        localAdWebView = this.h;
        if ((localHashMap == null) || (!"1".equals(localHashMap.get("custom_close"))))
          break label616;
      }
      label540: label574: label616: for (boolean bool8 = true; ; bool8 = false)
      {
        a(localAdWebView, false, i2, bool1, bool8);
        return;
        bool7 = false;
        break;
        if (str4 != null)
        {
          this.h.loadDataWithBaseURL(str3, str4, "text/html", "utf-8", null);
          break label463;
        }
        a("Could not get the URL or HTML parameter to show a web app.");
        return;
        if ("l".equals(str5))
        {
          i2 = AdUtil.a();
          break label490;
        }
        if (this == e)
        {
          i2 = locald.o();
          break label490;
        }
        i2 = -1;
        break label490;
      }
    }
    int i1;
    boolean bool5;
    boolean bool4;
    if ((str1.equals("interstitial")) || (str1.equals("expand")))
    {
      this.h = locald.l();
      i1 = locald.o();
      if (str1.equals("expand"))
      {
        this.h.setIsExpandedMraid(true);
        this.q = false;
        bool5 = false;
        if (localHashMap != null)
        {
          boolean bool6 = "1".equals(localHashMap.get("custom_close"));
          bool5 = false;
          if (bool6)
            bool5 = true;
        }
        if ((!this.r) || (this.s))
          break label809;
        b.a("Re-enabling hardware acceleration on expanding MRAID WebView.");
        this.h.h();
        bool4 = bool5;
      }
    }
    while (true)
    {
      a(this.h, true, i1, bool1, bool4);
      return;
      bool4 = this.h.j();
      continue;
      a("Unknown AdOpener, <action: " + str1 + ">");
      return;
      label809: bool4 = bool5;
    }
  }

  public void onDestroy()
  {
    if (this.n != null)
      this.n.removeAllViews();
    if (isFinishing())
    {
      e();
      if ((this.q) && (this.h != null))
      {
        this.h.stopLoading();
        this.h.destroy();
        this.h = null;
      }
    }
    super.onDestroy();
  }

  public void onPause()
  {
    if (isFinishing())
      e();
    super.onPause();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    if ((this.p) && (paramBoolean) && (SystemClock.elapsedRealtime() - this.m > 250L))
    {
      b.d("Launcher AdActivity got focus and is closing.");
      finish();
    }
    super.onWindowFocusChanged(paramBoolean);
  }

  public void setCustomClose(boolean paramBoolean)
  {
    if (this.i != null)
    {
      this.i.removeAllViews();
      if (!paramBoolean)
      {
        ImageButton localImageButton = new ImageButton(this);
        localImageButton.setImageResource(17301527);
        localImageButton.setBackgroundColor(0);
        localImageButton.setOnClickListener(this);
        localImageButton.setPadding(0, 0, 0, 0);
        FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(this.j, this.j, 17);
        this.i.addView(localImageButton, localLayoutParams);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.AdActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
