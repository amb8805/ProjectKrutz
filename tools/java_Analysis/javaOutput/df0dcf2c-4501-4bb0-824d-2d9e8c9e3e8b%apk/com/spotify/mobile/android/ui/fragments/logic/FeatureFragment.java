package com.spotify.mobile.android.ui.fragments.logic;

import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.n;
import android.support.v4.app.o;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ds;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FeatureFragment extends Fragment
{
  public static final b<?> Y;
  public static final b<?> Z;
  public static final b<?> a = a("discover_enabled", "ab_test_discovery");
  private static final List<Flag<?, g>> aA;
  private static final List<Flag<?, p>> aB;
  private static final List<Flag<?, ?>> aC;
  private static final Collection<FeatureFragment.LoaderSource> aD;
  private static final Set<FeatureFragment.LoaderSource> aE;
  private static Handler aG;
  private static Runnable aH;
  public static final b<?> aa;
  public static final Flag<Integer, p> ab;
  public static final b<?> ac;
  public static final b<?> ad;
  public static final b<?> ae;
  public static final b<?> af;
  public static final b<?> ag;
  public static final b<?> ah;
  public static final b<?> ai;
  public static final b<?> aj;
  public static final b<?> ak;
  public static final b<?> al;
  public static final b<?> am;
  public static final b<?> an;
  public static final b<?> ao;
  public static final b<?> ap;
  public static final b<?> aq;
  public static final b<?> ar;
  public static final b<?> as;
  public static final b<?> at;
  public static final b<?> au;
  public static final b<?> av;
  public static final b<?> aw;
  public static final b<?> ax;
  public static final b<?> ay;
  public static final Flag<Integer, ?> az;
  public static final b<?> b = new FeatureFragment.1("browse-genesis-enabled", new p("browse-genesis-enabled"));
  public static final b<?> c = new FeatureFragment.8("browse-genesis-menu-layout-enabled", new p("browse-genesis-menu-layout-enabled"));
  public static final b<?> d = new FeatureFragment.9("browse-genesis-as-landing-page-enabled", new p("browse-genesis-as-landing-page-enabled"));
  public static final b<?> e = a("browse_enabled", "ab_test_browse");
  public static final b<?> f = a("browse-use-test-api", true);
  public static final b<?> g = new FeatureFragment.10("browse_homepage_enabled", new g("ab_test_browse"));
  public static final b<?> h = a("shuffle_restricted", "shuffle_restricted");
  public static final b<?> i = new FeatureFragment.11("connect_icon_enabled", new g("connect"));
  private final Collection<f> aF = new HashSet();
  private final o<Cursor> aI = new FeatureFragment.6(this);
  private final o<Cursor> aJ = new FeatureFragment.7(this);

  static
  {
    Y = new FeatureFragment.12("connect_devices_enabled", new g("connect"));
    Z = a("ab-connect-transfer-popup", true);
    aa = a("push_notifications_enabled", "ab_test_push_notifications");
    ab = new Flag(Integer.class, "ab-connect-onboarding", new p("ab-connect-onboarding"), true);
    ac = a("ab-iphone-cell-play-buttons", true);
    ad = a("ab-listen-later", true);
    ae = a("ab-collection-cosmos", true);
    af = a("shuffle_layout_enabled", true);
    ag = a("ab-playlist-preview-header", true);
    ah = a("ab-mft-unlimited-context", false);
    ai = a("ab-mft-show-play-and-preview-in-menu", true);
    aj = a("ab-mft-skip-in-now-playing-bar", true);
    ak = a("ab-mft-always-show-now-playing-view", true);
    al = a("ab-mft-play-ad-on-skip-limit-reached", true);
    am = a("ab-mft-show-history-instead-of-queue", true);
    an = new FeatureFragment.13("ab-suggested-songs", new p("ab-mobile-playlist-has-suggested-songs"));
    ao = new FeatureFragment.14("ab-refresh-suggested-songs", new p("ab-mobile-playlist-has-suggested-songs"));
    ap = new FeatureFragment.15("ab-hide-suggested-songs-toggle", new p("ab-mobile-playlist-has-suggested-songs"));
    aq = a("ab-social-chart", true);
    ar = a("ab-mobile-social-feed", true);
    as = a("ab-shuffle-play-to-radio", true);
    at = new FeatureFragment.2("ab-hide-mft-nux", new p("ab-mft-in-app-education"));
    au = new FeatureFragment.3("ab-in-app-education-pos", new p("ab-mft-in-app-education"));
    av = new FeatureFragment.4("ab-in-app-education-neg", new p("ab-mft-in-app-education"));
    aw = a("android-cat", true);
    ax = a("showcase-android", true);
    ay = a("ab-mobile-browse-new-overview-design", true);
    az = new Flag(Integer.class, "twitter-feedback-cat-android-tracks", new p("twitter-feedback-cat-android-tracks"), true);
    aE = Collections.unmodifiableSet(EnumSet.allOf(FeatureFragment.LoaderSource.class));
    LinkedList localLinkedList1;
    LinkedList localLinkedList2;
    LinkedList localLinkedList3;
    try
    {
      Field[] arrayOfField = FeatureFragment.class.getDeclaredFields();
      localLinkedList1 = new LinkedList();
      localLinkedList2 = new LinkedList();
      localLinkedList3 = new LinkedList();
      int j = arrayOfField.length;
      k = 0;
      if (k < j)
      {
        localField = arrayOfField[k];
        if (!Flag.class.isAssignableFrom(localField.getType()))
          break label708;
        localFlag = (Flag)localField.get(null);
        localv = localFlag.c();
        if ((localv instanceof g))
          localLinkedList1.add(localFlag);
        while (true)
        {
          localLinkedList3.add(localFlag);
          break;
          if ((localv instanceof p))
            localLinkedList2.add(localFlag);
        }
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    while (true)
    {
      int k;
      Field localField;
      Flag localFlag;
      v localv;
      aA = Collections.unmodifiableList(localLinkedList1);
      aB = Collections.unmodifiableList(localLinkedList2);
      aC = Collections.unmodifiableList(localLinkedList3);
      aD = EnumSet.noneOf(FeatureFragment.LoaderSource.class);
      return;
      label708: k++;
    }
  }

  public FeatureFragment()
  {
  }

  private static void G()
  {
    if (aG == null)
      return;
    aG.post(aH);
  }

  private static b<g> a(String paramString1, String paramString2)
  {
    return new b(paramString1, new g(paramString2), false);
  }

  private static b<p> a(String paramString, boolean paramBoolean)
  {
    return new b(paramString, new p(paramString), paramBoolean);
  }

  static void a(Flag<?, ?> paramFlag, String paramString)
  {
    Class localClass = paramFlag.b();
    if ((paramFlag instanceof b))
      try
      {
        boolean bool1 = "true".equals(paramString);
        int k;
        if (bool1)
          k = 1;
        while (true)
        {
          ((b)paramFlag).a(k);
          return;
          boolean bool2 = "false".equals(paramString);
          k = 0;
          if (!bool2)
          {
            int m = Integer.parseInt(paramString);
            k = m;
          }
        }
      }
      finally
      {
        ((b)paramFlag).a(0);
      }
    if (ds.a(localClass, Integer.class))
      try
      {
        int j = Integer.parseInt(paramString);
        paramFlag.a(Integer.valueOf(j));
        return;
      }
      finally
      {
        paramFlag.a(Integer.valueOf(0));
      }
    if (ds.a(localClass, String.class))
    {
      paramFlag.a(paramString);
      return;
    }
    Assertion.a("Unsupported type " + paramFlag.b() + " for " + paramFlag.d());
  }

  public static void a(b paramb)
  {
    paramb.f();
    G();
  }

  public static void a(b paramb, boolean paramBoolean)
  {
    paramb.b(Boolean.valueOf(paramBoolean));
    G();
  }

  public static Collection<Flag<?, ?>> b()
  {
    return aC;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      Iterator localIterator = aC.iterator();
      while (localIterator.hasNext())
        ((Flag)localIterator.next()).b(paramBundle);
    }
    FeatureFragment.5 local5 = new FeatureFragment.5(this);
    aG = new Handler();
    aH = local5;
    aD.clear();
    t().a(2131362082, null, this.aJ);
    t().a(2131362149, null, this.aI);
  }

  public final void a(f paramf)
  {
    this.aF.add(paramf);
  }

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    Iterator localIterator = aC.iterator();
    while (localIterator.hasNext())
      ((Flag)localIterator.next()).a(paramBundle);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.logic.FeatureFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
