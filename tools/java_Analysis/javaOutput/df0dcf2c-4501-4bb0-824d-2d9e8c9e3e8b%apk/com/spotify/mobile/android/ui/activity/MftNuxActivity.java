package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dv;

public class MftNuxActivity extends BaseFragmentActivity
{
  private Button n;
  private ViewUri.Verified o;
  private a p = (a)c.a(a.class);
  private View.OnClickListener q = new MftNuxActivity.1(this);

  public MftNuxActivity()
  {
  }

  public static Intent a(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, MftNuxActivity.class);
    localIntent.putExtra("type", paramInt);
    return localIntent;
  }

  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    super.onCreate(paramBundle);
    DialogLayout localDialogLayout;
    LinearLayout localLinearLayout;
    int m;
    if (((dk)c.a(dk.class)).b())
    {
      setTheme(2131755252);
      localDialogLayout = new DialogLayout(this);
      setContentView(localDialogLayout);
      setResult(-1);
      int j = getIntent().getIntExtra("type", -1);
      Assertion.b(Integer.valueOf(-1), Integer.valueOf(j));
      localLinearLayout = new LinearLayout(this);
      localLinearLayout.setGravity(1);
      localLinearLayout.setOrientation(1);
      int k = getResources().getDimensionPixelOffset(2131427490);
      localLinearLayout.setPadding(k, k, k, k);
      this.n = h.d(this, localLinearLayout);
      this.n.setOnClickListener(this.q);
      switch (j)
      {
      default:
        Assertion.a("Bad MFT NUX dialog type: " + j);
        m = 0;
      case 0:
      case 1:
      case 2:
      }
    }
    while (true)
    {
      localDialogLayout.a(i);
      localDialogLayout.c(m);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
      localLinearLayout.addView(this.n, localLayoutParams);
      localDialogLayout.a(localLinearLayout);
      if (paramBundle == null)
      {
        ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.Y);
        a.a(this, this.o, ViewUri.SubView.a, localClientEvent);
      }
      a(dv.a(this, this.o));
      return;
      setTheme(2131755260);
      break;
      i = 2131690060;
      m = 2131690058;
      this.n.setText(2131690059);
      this.o = ViewUri.aQ;
      continue;
      i = 2131690057;
      m = 2131690055;
      this.n.setText(2131690056);
      this.o = ViewUri.aR;
      continue;
      i = 2131690054;
      m = 2131690052;
      this.n.setText(2131690053);
      if (getResources().getBoolean(2131230728))
        localDialogLayout.b(2130838172);
      this.o = ViewUri.aP;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.MftNuxActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
