package com.spotify.mobile.android.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.g;
import android.support.v4.app.l;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.fragments.a;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.SpotifyLink.LinkType;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dv;
import java.util.Locale;

public class AddToPlaylistActivity extends BaseFragmentActivity
{
  public AddToPlaylistActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    if (((dk)c.a(dk.class)).b())
      setTheme(2131755251);
    String str2;
    while (true)
    {
      super.onCreate(paramBundle);
      DialogLayout localDialogLayout = new DialogLayout(this);
      String str1 = getString(2131689496);
      if (!f.a(this))
        str1 = str1.toUpperCase(Locale.getDefault());
      localDialogLayout.a(str1);
      FrameLayout localFrameLayout = new FrameLayout(this);
      localFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      localFrameLayout.setId(2131362202);
      localDialogLayout.a(localFrameLayout);
      setContentView(localDialogLayout);
      str2 = getIntent().getDataString();
      if ((str2 != null) && (new SpotifyLink(str2).a() == SpotifyLink.LinkType.ag))
        break;
      Assertion.a("You should never call this class with an empty uri or any other link type than SpotifyLink.LinkType.TRACK until we implement add album to playlist");
      finish();
      return;
      setTheme(2131755258);
    }
    if (paramBundle == null)
    {
      l locall = c().a();
      locall.b(2131362202, a.a(str2));
      locall.b();
    }
    a(dv.a(this, ViewUri.V));
  }

  protected void onResume()
  {
    super.onResume();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.AddToPlaylistActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
