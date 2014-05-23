package com.spotify.mobile.android.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.bs;
import com.spotify.mobile.android.util.dv;

public class PlaybackErrorWifiOnlyActivity extends BaseFragmentActivity
{
  private static final ViewUri.Verified o = ViewUri.at;
  private String n;

  public PlaybackErrorWifiOnlyActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903069);
    ((TextView)findViewById(2131362227)).setText(bs.h);
    ((TextView)findViewById(2131362256)).setText(bs.g);
    Button localButton1 = (Button)findViewById(2131362258);
    Button localButton2 = (Button)findViewById(2131362259);
    Button localButton3 = (Button)findViewById(2131362260);
    this.n = getIntent().getStringExtra("radio_uri");
    if (paramBundle != null)
      this.n = paramBundle.getString("radio_uri");
    setResult(0);
    if (this.n != null);
    for (int i = 0; ; i = 8)
    {
      localButton1.setVisibility(i);
      localButton1.setOnClickListener(new PlaybackErrorWifiOnlyActivity.1(this));
      localButton2.setOnClickListener(new PlaybackErrorWifiOnlyActivity.2(this));
      if (!((ClientInfo)c.a(ClientInfo.class)).d())
      {
        localButton2.setVisibility(8);
        localButton1.setBackgroundResource(2130837602);
      }
      if ((localButton2.getVisibility() == 8) && (localButton1.getVisibility() == 8))
      {
        localButton3.setText(bs.a);
        localButton3.setVisibility(0);
        localButton3.setOnClickListener(new PlaybackErrorWifiOnlyActivity.3(this));
      }
      a(dv.a(this, o));
      return;
    }
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putString("radio_uri", this.n);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.PlaybackErrorWifiOnlyActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
