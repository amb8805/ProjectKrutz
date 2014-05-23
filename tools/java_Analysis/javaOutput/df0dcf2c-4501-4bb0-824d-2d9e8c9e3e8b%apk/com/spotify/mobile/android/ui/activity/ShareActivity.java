package com.spotify.mobile.android.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.g;
import android.support.v4.app.l;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.fragments.a.a;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.dk;

public class ShareActivity extends BaseFragmentActivity
{
  public ShareActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (((dk)c.a(dk.class)).b())
      setTheme(2131755251);
    while (true)
    {
      DialogLayout localDialogLayout = new DialogLayout(this);
      setContentView(localDialogLayout);
      String str = getIntent().getStringExtra("title");
      localDialogLayout.a(str);
      FrameLayout localFrameLayout = new FrameLayout(this);
      localFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      localFrameLayout.setId(2131362202);
      localDialogLayout.a(localFrameLayout);
      Intent localIntent = (Intent)getIntent().getParcelableExtra("android.intent.extra.INTENT");
      if (paramBundle == null)
      {
        a locala = a.a(localIntent, str);
        c().a().a(2131362202, locala).b();
        bp.b(localIntent.toString(), new Object[0]);
      }
      return;
      setTheme(2131755258);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.ShareActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
