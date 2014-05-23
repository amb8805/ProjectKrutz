package com.spotify.mobile.android.ui.activity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.util.dk;

public class DeleteCacheAndSettingsConfirmationActivity extends BaseFragmentActivity
{
  final View.OnClickListener n = new DeleteCacheAndSettingsConfirmationActivity.2(this);
  final View.OnClickListener o = new DeleteCacheAndSettingsConfirmationActivity.3(this);
  private a p = (a)c.a(a.class);
  private Handler q = new Handler();
  private Button r;

  public DeleteCacheAndSettingsConfirmationActivity()
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
      setContentView(localDialogLayout);
      localDialogLayout.a(2131689902);
      localDialogLayout.c(2131689901);
      localDialogLayout.a(2131690362, this.o);
      localDialogLayout.b(2131690361, this.n);
      this.r = localDialogLayout.b();
      this.r.setEnabled(false);
      return;
      setTheme(2131755258);
    }
  }

  protected void onResume()
  {
    super.onResume();
    this.q.postDelayed(new DeleteCacheAndSettingsConfirmationActivity.1(this), 1000L);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.DeleteCacheAndSettingsConfirmationActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
