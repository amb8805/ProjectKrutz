package com.spotify.mobile.android.ui.fragments.logic;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.n;
import com.spotify.mobile.android.ui.activity.dialog.TrialReminderActivity;
import com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask;
import com.spotify.mobile.android.util.DialogPresenter;

public final class k extends o
{
  private static final String[] a = { "trial_length", "trial_time_remaining", "trial_dialog_shown", "trial_ending_dialog_shown", "trial_active", "post_trial_active", "has_wifi_streaming", "will_have_wifi_streaming", "hide_trial" };
  private boolean Y;
  private boolean Z;
  private boolean aa;
  private boolean ab;
  private int ac;
  private Intent ad;
  private Intent ae;
  private CheckOptInTrialEligibilityTask af;
  private android.support.v4.app.o<Cursor> ag = new k.1(this);
  private android.support.v4.app.o<Cursor> ah = new k.2(this);
  private boolean b = false;
  private boolean d = false;
  private boolean e = false;
  private boolean f = false;
  private int g = 0;
  private int h = 0;
  private boolean i = false;

  public k()
  {
  }

  private Intent a(String paramString, int paramInt)
  {
    return new Intent(i(), TrialReminderActivity.class).putExtra(paramString, paramInt).putExtra("wifi_streaming", this.i).putExtra("shuffle_streaming", this.Y).addFlags(536870912);
  }

  protected final void C()
  {
    this.g = this.c.c(this);
    this.h = this.c.c(this);
  }

  public final void D()
  {
    if (this.ad != null)
    {
      a(this.ad, this.g);
      this.ad = null;
    }
    while (this.ae == null)
      return;
    a(this.ae, this.h);
    this.ae = null;
  }

  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == this.g)
    {
      this.d = true;
      this.b = false;
    }
    while (true)
    {
      super.a(paramInt1, paramInt2, paramIntent);
      return;
      if (paramInt1 == this.h)
      {
        this.e = true;
        this.b = false;
      }
    }
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.b = paramBundle.getBoolean("display_trial", false);
      this.d = paramBundle.getBoolean("dialog_shown", false);
      this.e = paramBundle.getBoolean("dialog_ended_shown", false);
      this.f = paramBundle.getBoolean("reminder_added", false);
      this.g = paramBundle.getInt("start_request_code", 0);
      this.h = paramBundle.getInt("end_request_code", 0);
      this.i = paramBundle.getBoolean("has_wifi_streaming", false);
      this.g = paramBundle.getInt("trial_start_request_code");
      this.h = paramBundle.getInt("trial_end_request_code");
    }
    t().a(2131362175, null, this.ag);
    t().a(2131362176, null, this.ah);
  }

  public final void a(DialogPresenter paramDialogPresenter)
  {
    super.a(paramDialogPresenter);
    if (this.ad != null)
      this.c.b(this);
    if (this.ae != null)
      this.c.b(this);
  }

  public final void d(Bundle paramBundle)
  {
    paramBundle.putBoolean("display_trial", this.b);
    paramBundle.putBoolean("dialog_shown", this.d);
    paramBundle.putBoolean("dialog_ended_shown", this.e);
    paramBundle.putBoolean("reminder_added", this.f);
    paramBundle.putInt("start_request_code", this.g);
    paramBundle.putInt("end_request_code", this.h);
    paramBundle.putBoolean("has_wifi_streaming", this.i);
    paramBundle.putInt("trial_start_request_code", this.g);
    paramBundle.putInt("trial_end_request_code", this.h);
    super.d(paramBundle);
  }

  public final void y()
  {
    super.y();
    if (this.af != null)
    {
      this.af.c();
      this.af = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.logic.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
