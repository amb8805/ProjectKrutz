package com.spotify.mobile.android.ui.activity;

import android.os.Bundle;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dv;

public class DiskAlmostFullActivity extends BaseFragmentActivity
{
  public DiskAlmostFullActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (((dk)c.a(dk.class)).b())
      setTheme(2131755249);
    while (true)
    {
      DialogLayout localDialogLayout = new DialogLayout(this);
      setContentView(localDialogLayout);
      localDialogLayout.a(2131689922);
      localDialogLayout.c(2131689920);
      localDialogLayout.a(2131689921, new DiskAlmostFullActivity.1(this));
      a(dv.a(this, ViewUri.ac));
      return;
      setTheme(2131755258);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.DiskAlmostFullActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
