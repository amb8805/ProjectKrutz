package com.spotify.mobile.android.ui.activity;

import android.os.Bundle;
import android.view.View.OnClickListener;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dv;

public class DeleteCacheAndSettingsActivity extends BaseFragmentActivity
{
  final View.OnClickListener n = new DeleteCacheAndSettingsActivity.1(this);
  final View.OnClickListener o = new DeleteCacheAndSettingsActivity.2(this);
  private a p = (a)c.a(a.class);

  public DeleteCacheAndSettingsActivity()
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
      localDialogLayout.a(2131689904);
      localDialogLayout.c(2131689903);
      localDialogLayout.a(2131690362, this.o);
      localDialogLayout.b(2131690361, this.n);
      a(dv.a(this, ViewUri.av));
      return;
      setTheme(2131755258);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.DeleteCacheAndSettingsActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
