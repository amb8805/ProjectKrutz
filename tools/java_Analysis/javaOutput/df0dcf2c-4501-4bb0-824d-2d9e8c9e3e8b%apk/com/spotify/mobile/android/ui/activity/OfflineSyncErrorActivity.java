package com.spotify.mobile.android.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.util.SpotifyError;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dv;

public class OfflineSyncErrorActivity extends BaseFragmentActivity
{
  public OfflineSyncErrorActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    if (((dk)c.a(dk.class)).b())
      setTheme(2131755249);
    SpotifyError localSpotifyError;
    while (true)
    {
      super.onCreate(paramBundle);
      localSpotifyError = SpotifyError.a(getIntent().getIntExtra("error_code", 0));
      if (localSpotifyError != SpotifyError.a)
        break;
      finish();
      setResult(-1);
      return;
      setTheme(2131755258);
    }
    DialogLayout localDialogLayout = new DialogLayout(this);
    localDialogLayout.a(2131690086);
    localDialogLayout.b(localSpotifyError.a(this));
    localDialogLayout.a(2131690085, new OfflineSyncErrorActivity.1(this));
    setContentView(localDialogLayout);
    setResult(0);
    a(dv.a(this, ViewUri.ab));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.OfflineSyncErrorActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
