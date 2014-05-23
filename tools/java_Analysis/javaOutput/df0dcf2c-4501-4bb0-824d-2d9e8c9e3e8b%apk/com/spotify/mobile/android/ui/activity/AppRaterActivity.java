package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dv;

public class AppRaterActivity extends BaseFragmentActivity
{
  private a n = (a)c.a(a.class);
  private ClientInfo o = (ClientInfo)c.a(ClientInfo.class);
  private ViewUri.Verified p = ViewUri.aT;

  public AppRaterActivity()
  {
  }

  public static Intent a(Context paramContext)
  {
    return new Intent(paramContext, AppRaterActivity.class);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.Y);
    a.a(this, ViewUri.aT, localClientEvent);
    if (((dk)c.a(dk.class)).b());
    for (int i = 2131755249; ; i = 2131755258)
    {
      setTheme(i);
      DialogLayout localDialogLayout = new DialogLayout(this);
      setContentView(localDialogLayout);
      setResult(-1);
      localDialogLayout.a(2131690186);
      localDialogLayout.c(2131690183);
      localDialogLayout.b(2131690184, new AppRaterActivity.1(this));
      localDialogLayout.a(2131690185, new AppRaterActivity.2(this));
      a(dv.a(this, this.p));
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.AppRaterActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
