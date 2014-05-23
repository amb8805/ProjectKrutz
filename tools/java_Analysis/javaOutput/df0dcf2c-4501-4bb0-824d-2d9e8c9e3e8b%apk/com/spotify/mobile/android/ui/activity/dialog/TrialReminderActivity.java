package com.spotify.mobile.android.ui.activity.dialog;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.activity.BaseFragmentActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.bs;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dv;

public class TrialReminderActivity extends BaseFragmentActivity
{
  private int n;
  private int o;
  private int p;
  private boolean q;
  private boolean r;
  private DialogLayout s;
  private ViewUri.Verified t = ViewUri.Y;

  public TrialReminderActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    int i;
    int j;
    int k;
    String str;
    if (((dk)c.a(dk.class)).b())
    {
      setTheme(2131755252);
      super.onCreate(paramBundle);
      setResult(0);
      Intent localIntent = getIntent();
      this.o = localIntent.getIntExtra("trial_remaining", -1);
      this.p = localIntent.getIntExtra("trial_length", 0);
      this.q = localIntent.getBooleanExtra("wifi_streaming", false);
      this.r = localIntent.getBooleanExtra("shuffle_streaming", false);
      if (paramBundle != null)
      {
        this.o = paramBundle.getInt("trial_remaining", -1);
        this.p = paramBundle.getInt("trial_length", 0);
        this.q = paramBundle.getBoolean("wifi_streaming");
        this.r = paramBundle.getBoolean("shuffle_streaming");
      }
      this.s = new DialogLayout(this);
      setContentView(this.s);
      i = 2131690360;
      this.s.a(2131689504);
      if (this.p <= 0)
        break label370;
      this.n = 0;
      j = this.p / 3600;
      k = j / 24;
      if (k <= 30L)
        break label289;
      int m = k / 30;
      Resources localResources3 = getResources();
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(m);
      str = localResources3.getQuantityString(2131623962, m, arrayOfObject3);
    }
    while (true)
    {
      if (str != null)
        this.s.b(str);
      this.s.b(i, new TrialReminderActivity.1(this));
      a(dv.a(this, this.t));
      return;
      setTheme(2131755260);
      break;
      label289: if (j > 48)
      {
        Resources localResources2 = getResources();
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(k);
        str = localResources2.getQuantityString(2131623960, k, arrayOfObject2);
      }
      else
      {
        Resources localResources1 = getResources();
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(j);
        str = localResources1.getQuantityString(2131623961, j, arrayOfObject1);
        continue;
        label370: if (this.o != 0)
          break label534;
        this.n = 1;
        DialogLayout localDialogLayout = this.s;
        if (((ClientInfo)c.a(ClientInfo.class)).d())
          localDialogLayout.a(2131690403, new TrialReminderActivity.2(this));
        if (this.q)
        {
          this.t = ViewUri.Z;
          str = bs.e + "\n\n" + bs.f;
          this.s.a(bs.d);
        }
        else if (this.r)
        {
          this.t = ViewUri.aa;
          str = getString(2131690355);
          this.s.a(getString(2131690357));
          i = 2131690356;
          this.s.b(2130838110);
        }
        else
        {
          str = getString(2131690354);
        }
      }
    }
    label534: Assertion.a("Should not end up here, timeToTrialEnd==" + this.o + " , totalTimeOfTrial==" + this.p);
    finish();
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putInt("trial_remaining", this.o);
    paramBundle.putInt("trial_length", this.p);
    paramBundle.putBoolean("wifi_streaming", this.q);
    paramBundle.putBoolean("shuffle_streaming", this.r);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.dialog.TrialReminderActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
