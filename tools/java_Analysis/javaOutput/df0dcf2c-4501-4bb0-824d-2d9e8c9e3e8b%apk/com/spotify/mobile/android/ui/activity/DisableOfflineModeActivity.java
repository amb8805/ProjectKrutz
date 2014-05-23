package com.spotify.mobile.android.ui.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dv;

public class DisableOfflineModeActivity extends BaseFragmentActivity
{
  public DisableOfflineModeActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903068);
    Button localButton1 = (Button)findViewById(2131362445);
    localButton1.setText(2131689911);
    Button localButton2 = (Button)findViewById(2131362446);
    localButton2.setText(2131689912);
    ((TextView)findViewById(2131362227)).setText(2131689913);
    setResult(0);
    localButton1.setOnClickListener(new DisableOfflineModeActivity.1(this));
    localButton2.setOnClickListener(new DisableOfflineModeActivity.2(this));
    a(dv.b(this, ViewUri.R));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.DisableOfflineModeActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
