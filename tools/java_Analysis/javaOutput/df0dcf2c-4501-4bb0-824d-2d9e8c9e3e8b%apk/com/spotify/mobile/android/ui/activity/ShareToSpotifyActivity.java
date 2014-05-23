package com.spotify.mobile.android.ui.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.o;
import android.text.Editable;
import android.view.ViewGroup.LayoutParams;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.ui.adapter.af;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.an;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dv;

public class ShareToSpotifyActivity extends BaseFragmentActivity
{
  private a n = (a)c.a(a.class);
  private AutoCompleteTextView o;
  private EditText p;
  private Button q;
  private Button r;
  private Intent s;
  private an t;
  private String u;
  private boolean v;
  private af w;
  private o<Cursor> x = new ShareToSpotifyActivity.6(this);

  public ShareToSpotifyActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.s = ((Intent)getIntent().getParcelableExtra("android.intent.extra.INTENT"));
    String str2;
    String str1;
    if (paramBundle != null)
    {
      this.u = paramBundle.getString("selected_username");
      this.v = paramBundle.getBoolean("restore_input_user");
      String str3 = paramBundle.getString("message_text");
      String str4 = paramBundle.getString("user_text");
      str2 = str3;
      str1 = str4;
    }
    while (true)
    {
      this.t = new ShareToSpotifyActivity.1(this, d(), this.x);
      this.t.a();
      this.w = new af(this);
      this.w.a(this.t);
      if (((dk)c.a(dk.class)).b())
        setTheme(2131755249);
      while (true)
      {
        DialogLayout localDialogLayout = new DialogLayout(this);
        setContentView(localDialogLayout);
        localDialogLayout.a(getIntent().getStringExtra("title"));
        LinearLayout localLinearLayout = new LinearLayout(this);
        localLinearLayout.setOrientation(1);
        localLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        localDialogLayout.a(localLinearLayout);
        localDialogLayout.a(2131690254, new ShareToSpotifyActivity.2(this));
        localDialogLayout.b(2131690253, new ShareToSpotifyActivity.3(this));
        this.q = localDialogLayout.b();
        this.r = localDialogLayout.a();
        this.q.setEnabled(false);
        this.o = h.b(this);
        this.o.setId(2131362575);
        this.o.setAdapter(this.w);
        this.o.setHint(2131690257);
        this.o.setSingleLine(true);
        this.o.setImeOptions(6);
        this.o.setInputType(16384);
        this.o.setText(str1);
        this.o.setOnItemClickListener(new ShareToSpotifyActivity.4(this));
        this.o.addTextChangedListener(new ShareToSpotifyActivity.5(this));
        this.p = h.a(this);
        this.p.setId(2131362296);
        this.p.setText(str2);
        this.p.setInputType(16384);
        this.p.setImeOptions(6);
        this.p.setSingleLine(true);
        this.p.setHint(2131690256);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = getResources().getDimensionPixelOffset(2131427475);
        localLayoutParams.setMargins(0, i, 0, i);
        localLinearLayout.addView(this.o, localLayoutParams);
        localLinearLayout.addView(this.p, localLayoutParams);
        a(dv.a(this, ViewUri.aq));
        return;
        setTheme(2131755258);
      }
      str1 = null;
      str2 = null;
    }
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putString("selected_username", this.u);
    if (this.o.getText().length() > 0);
    for (boolean bool = true; ; bool = false)
    {
      paramBundle.putBoolean("restore_input_user", bool);
      paramBundle.putString("message_text", this.p.getText().toString());
      paramBundle.putString("user_text", this.o.getText().toString());
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.ShareToSpotifyActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
