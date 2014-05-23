package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Context;
import android.text.TextUtils;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.ci;
import com.spotify.mobile.android.util.cj;
import com.spotify.mobile.android.util.cl;
import com.spotify.mobile.android.util.cn;
import com.spotify.mobile.android.util.co;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cx;
import com.spotify.mobile.android.util.cy;
import java.util.concurrent.TimeUnit;

public final class CheckOptInTrialEligibilityTask
{
  private static final cy a = cy.a("check_optin_trial_eligibility");
  private static final cy b = cy.a("check_optin_trial_eligibility_username");
  private static CheckOptInTrialEligibilityTask.State c = CheckOptInTrialEligibilityTask.State.a;
  private static String d;
  private static boolean e;
  private static boolean f;
  private final String g;
  private final cw h;
  private final ci i;
  private com.spotify.mobile.android.e.a<Boolean> j = com.spotify.mobile.android.e.a.a();
  private final Resolver k;
  private final Runnable l = new CheckOptInTrialEligibilityTask.1(this);

  public CheckOptInTrialEligibilityTask(Context paramContext, String paramString)
  {
    this.g = ((String)cc.a(paramString));
    this.h = cw.a(paramContext);
    this.k = new Resolver("check-opt-in-trial", paramContext);
    this.i = new cj("check-optin-trial-eligibility", this.l).a(new cn(100L, TimeUnit.MILLISECONDS)).c(new cl(400L, TimeUnit.MILLISECONDS)).a(10).d(new co(5L, 7L, TimeUnit.HOURS)).a();
  }

  public static CheckOptInTrialEligibilityTask.State a()
  {
    return c;
  }

  private static void g()
  {
    c = CheckOptInTrialEligibilityTask.State.a;
    d = null;
    e = false;
    f = true;
  }

  public final void a(com.spotify.mobile.android.e.a<Boolean> parama)
  {
    if (!this.j.equals(parama))
    {
      this.j = parama;
      if ((!parama.c()) || (((Boolean)parama.b()).booleanValue()))
        break label78;
      if ((!e) && (!this.i.c()))
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.g;
        bp.c("Starting checking for: %s", arrayOfObject);
        this.i.a();
      }
    }
    label78: 
    do
    {
      return;
      if (c != CheckOptInTrialEligibilityTask.State.a)
      {
        bp.c("Reset state due to change in product (premium: %s)", new Object[] { parama });
        this.h.a().a(a).a(b).b();
      }
      g();
    }
    while (!this.i.c());
    this.i.d();
  }

  public final boolean a(String paramString)
  {
    return this.g.equals(paramString);
  }

  public final void b()
  {
    if (!TextUtils.equals(d, this.g))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = d;
      arrayOfObject[1] = this.g;
      bp.c("Reset state since username changed %s -> %s", arrayOfObject);
      g();
    }
    if (!f)
      new a(this, (byte)0).execute(new Void[0]);
  }

  public final void c()
  {
    if (this.i.c())
      this.i.d();
    this.k.destroy();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
