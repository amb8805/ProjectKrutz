package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.ui.actions.d;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cy;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dv;

public class SoundEffectsWarningActivity extends BaseFragmentActivity
{
  public static final cy n = cy.a("sound_effect_dialog_disabled");
  final View.OnClickListener o = new SoundEffectsWarningActivity.1(this);
  private a p = (a)c.a(a.class);
  private d q = (d)c.a(d.class);
  private CheckBox r;

  public SoundEffectsWarningActivity()
  {
  }

  public static boolean a(Context paramContext)
  {
    return cw.a(paramContext).a(n, false);
  }

  public static void b(Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, SoundEffectsWarningActivity.class);
    localIntent.addFlags(1073741824);
    localIntent.addFlags(65536);
    paramContext.startActivity(localIntent);
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
      localDialogLayout.a(2131689909);
      localDialogLayout.c(2131689908);
      this.r = h.c(this);
      this.r.setText(2131689907);
      FrameLayout localFrameLayout = new FrameLayout(this);
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -2);
      localLayoutParams.setMargins(0, 0, 0, getResources().getDimensionPixelOffset(2131427403));
      localFrameLayout.addView(this.r, localLayoutParams);
      localDialogLayout.a(localFrameLayout);
      localDialogLayout.a(2131690362, this.o);
      a(dv.a(this, ViewUri.aw));
      return;
      setTheme(2131755258);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.SoundEffectsWarningActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
