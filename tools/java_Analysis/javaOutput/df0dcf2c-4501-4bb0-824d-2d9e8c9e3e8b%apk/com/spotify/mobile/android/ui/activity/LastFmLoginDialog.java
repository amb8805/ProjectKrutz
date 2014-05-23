package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.android.paste.graphics.d;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.android.paste.widget.f;
import com.spotify.android.paste.widget.g;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dv;

public class LastFmLoginDialog extends BaseFragmentActivity
{
  final View.OnClickListener n = new LastFmLoginDialog.2(this);
  final View.OnClickListener o = new LastFmLoginDialog.3(this);
  private a p = (a)c.a(a.class);
  private EditText q;
  private EditText r;

  public LastFmLoginDialog()
  {
  }

  public static Intent a(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent(paramContext, LastFmLoginDialog.class);
    localIntent.addFlags(1073741824);
    localIntent.addFlags(65536);
    localIntent.putExtra("intent_username", paramString);
    return localIntent;
  }

  private void e()
  {
    if (f.a(this.r.getContext()))
    {
      this.r.setTypeface(Typeface.DEFAULT);
      return;
    }
    g.a(this.r.getContext(), this.r, 2131755194);
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
      localDialogLayout.a(2131690215);
      LinearLayout localLinearLayout = new LinearLayout(this);
      localLinearLayout.setOrientation(1);
      String str = getIntent().getStringExtra("intent_username");
      this.q = h.a(this);
      this.q.setId(2131362575);
      this.q.setImeOptions(5);
      this.q.setText(str);
      this.q.setFreezesText(true);
      this.q.setSingleLine(true);
      this.q.setHint(2131690216);
      this.r = h.a(this);
      this.r.setId(2131362391);
      this.r.setImeOptions(6);
      this.r.setHint(2131690214);
      this.r.setFreezesText(true);
      this.r.setSingleLine(true);
      this.r.setInputType(129);
      e();
      CheckBox localCheckBox = h.c(this);
      localCheckBox.setId(2131362229);
      localCheckBox.setText(2131690026);
      localCheckBox.setOnCheckedChangeListener(new LastFmLoginDialog.1(this));
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
      int i = d.a(8.0F, getResources());
      localLayoutParams.setMargins(0, i, 0, i);
      localLinearLayout.addView(this.q, localLayoutParams);
      localLinearLayout.addView(this.r, localLayoutParams);
      localLinearLayout.addView(localCheckBox, localLayoutParams);
      localDialogLayout.a(localLinearLayout);
      localDialogLayout.a(2131690362, this.n);
      localDialogLayout.b(2131690361, this.o);
      a(dv.a(this, ViewUri.M));
      return;
      setTheme(2131755258);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.LastFmLoginDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
