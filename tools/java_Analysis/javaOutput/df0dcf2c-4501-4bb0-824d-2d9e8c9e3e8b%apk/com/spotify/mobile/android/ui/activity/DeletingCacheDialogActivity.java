package com.spotify.mobile.android.ui.activity;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dv;

public class DeletingCacheDialogActivity extends BaseFragmentActivity
{
  private BroadcastReceiver n = new DeletingCacheDialogActivity.1(this);

  public DeletingCacheDialogActivity()
  {
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (((dk)c.a(dk.class)).b())
      setTheme(2131755249);
    while (true)
    {
      DialogLayout localDialogLayout = new DialogLayout(this);
      localDialogLayout.a(2131689906);
      localDialogLayout.c(2131689905);
      setContentView(localDialogLayout);
      registerReceiver(this.n, new IntentFilter("com.spotify.mobile.android.service.BROADCAST_DELETE_CACHE_FINISHED"));
      a(dv.b(this, ViewUri.ax));
      return;
      setTheme(2131755258);
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    unregisterReceiver(this.n);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.DeletingCacheDialogActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
