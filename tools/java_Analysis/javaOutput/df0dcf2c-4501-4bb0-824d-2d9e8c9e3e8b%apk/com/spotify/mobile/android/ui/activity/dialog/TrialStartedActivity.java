package com.spotify.mobile.android.ui.activity.dialog;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.activity.BaseFragmentActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dv;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class TrialStartedActivity extends BaseFragmentActivity
{
  public TrialStartedActivity()
  {
  }

  protected void onCreate(Bundle paramBundle)
  {
    boolean bool = ((dk)c.a(dk.class)).b();
    if (bool)
      setTheme(2131755252);
    int i;
    while (true)
    {
      super.onCreate(paramBundle);
      setResult(0);
      i = getIntent().getIntExtra("trial_length", 0);
      if (i > 0)
        break;
      Assertion.a("Trial length is <= 0. Can't display trial started dialog.");
      finish();
      return;
      setTheme(2131755260);
    }
    DialogLayout localDialogLayout = new DialogLayout(this);
    setContentView(localDialogLayout);
    localDialogLayout.a(2131690359);
    int j = (int)TimeUnit.SECONDS.toHours(i);
    int k = (int)TimeUnit.HOURS.toDays(j);
    int m = k / 30;
    String str1;
    if (m > 0)
    {
      Resources localResources3 = getResources();
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(m);
      str1 = localResources3.getQuantityString(2131623965, m, arrayOfObject3);
    }
    while (true)
    {
      localDialogLayout.b(str1);
      if (getResources().getBoolean(2131230728))
        localDialogLayout.b(2130838115);
      LinearLayout localLinearLayout = new LinearLayout(this);
      int n = getResources().getDimensionPixelOffset(2131427490);
      localLinearLayout.setPadding(n, n, n, n);
      Button localButton = h.d(this, localLinearLayout);
      String str2 = getString(2131690358);
      if (bool)
        str2 = str2.toUpperCase(Locale.getDefault());
      localButton.setText(str2);
      localButton.setOnClickListener(new TrialStartedActivity.1(this));
      localLinearLayout.addView(localButton, new LinearLayout.LayoutParams(-1, -2));
      localDialogLayout.a(localLinearLayout);
      a(dv.a(this, ViewUri.ak));
      return;
      if (k >= 2)
      {
        Resources localResources2 = getResources();
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(k);
        str1 = localResources2.getQuantityString(2131623963, k, arrayOfObject2);
      }
      else
      {
        Resources localResources1 = getResources();
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(j);
        str1 = localResources1.getQuantityString(2131623964, j, arrayOfObject1);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.dialog.TrialStartedActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
