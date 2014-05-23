package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.activity.BaseFragmentActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.dv;

public class UpsellPremiumOnlyActivity extends BaseFragmentActivity
{
  private static final ViewUri.Verified p = ViewUri.ae;
  private String n;
  private String o;

  public UpsellPremiumOnlyActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903262);
    ((TextView)findViewById(2131362227)).setText(2131690405);
    Button localButton1 = (Button)findViewById(2131362445);
    Button localButton2 = (Button)findViewById(2131362258);
    Button localButton3 = (Button)findViewById(2131362446);
    this.n = getIntent().getStringExtra("radio_uri");
    if (paramBundle != null)
      this.n = paramBundle.getString("radio_uri");
    this.o = getIntent().getStringExtra("body");
    if (paramBundle != null)
      this.o = paramBundle.getString("body");
    Assertion.a(this.o, "A body text must be specified.");
    ((TextView)findViewById(2131362256)).setText(this.o);
    setResult(0);
    localButton1.setText(2131690402);
    localButton1.setOnClickListener(new UpsellPremiumOnlyActivity.1(this));
    if (this.n != null);
    for (int i = 0; ; i = 8)
    {
      localButton2.setVisibility(i);
      localButton2.setOnClickListener(new UpsellPremiumOnlyActivity.2(this));
      localButton3.setText(2131690403);
      localButton3.setOnClickListener(new UpsellPremiumOnlyActivity.3(this));
      if (!((ClientInfo)c.a(ClientInfo.class)).d())
      {
        localButton3.setVisibility(8);
        localButton1.setBackgroundResource(2130837602);
      }
      a(dv.a(this, ViewUri.ae));
      return;
    }
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putString("radio_uri", this.n);
    paramBundle.putString("body", this.o);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.upsell.UpsellPremiumOnlyActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
