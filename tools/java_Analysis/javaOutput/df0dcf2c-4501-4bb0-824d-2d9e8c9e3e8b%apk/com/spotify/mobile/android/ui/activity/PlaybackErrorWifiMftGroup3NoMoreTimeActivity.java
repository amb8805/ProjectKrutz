package com.spotify.mobile.android.ui.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.bs;
import com.spotify.mobile.android.util.dv;

public class PlaybackErrorWifiMftGroup3NoMoreTimeActivity extends BaseFragmentActivity
{
  private static final ViewUri.Verified n = ViewUri.au;

  public PlaybackErrorWifiMftGroup3NoMoreTimeActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903069);
    ((TextView)findViewById(2131362227)).setText(bs.i);
    ((TextView)findViewById(2131362256)).setText(bs.j);
    ((TextView)findViewById(2131362257)).setText(bs.k);
    Button localButton1 = (Button)findViewById(2131362258);
    Button localButton2 = (Button)findViewById(2131362259);
    Button localButton3 = (Button)findViewById(2131362260);
    setResult(0);
    localButton1.setVisibility(8);
    localButton2.setOnClickListener(new PlaybackErrorWifiMftGroup3NoMoreTimeActivity.1(this));
    if (!((ClientInfo)c.a(ClientInfo.class)).d())
      localButton2.setVisibility(8);
    if (localButton2.getVisibility() == 8)
    {
      localButton3.setText(bs.a);
      localButton3.setVisibility(0);
      localButton3.setOnClickListener(new PlaybackErrorWifiMftGroup3NoMoreTimeActivity.2(this));
    }
    a(dv.a(this, n));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.PlaybackErrorWifiMftGroup3NoMoreTimeActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
