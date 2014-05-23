package com.twitter.android;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.twitter.android.client.g;
import com.twitter.android.client.i;
import com.twitter.android.platform.d;
import com.twitter.android.widget.Navbar;
import com.twitter.android.widget.m;

public class LoginActivity extends Activity
  implements TextWatcher, m
{
  boolean a;
  private g b;
  private i c;
  private EditText d;
  private EditText e;
  private Button f;

  public LoginActivity()
  {
  }

  private boolean a()
  {
    return (this.d.length() > 0) && (this.e.length() > 0);
  }

  final void a(int paramInt)
  {
    int i;
    switch (paramInt)
    {
    default:
      i = 2131427351;
    case 1:
    case 400:
    case 401:
    }
    while (true)
    {
      Toast.makeText(this, i, 1).show();
      return;
      i = 2131427632;
      continue;
      i = 2131427355;
      continue;
      i = 2131427350;
    }
  }

  public void afterTextChanged(Editable paramEditable)
  {
    this.f.setEnabled(a());
  }

  public final void b(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return;
    case 2131165255:
    }
    startActivityForResult(new Intent(this, SignUpActivity.class), 1);
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    default:
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
    case 1:
    }
    do
      return;
    while (paramInt2 != -1);
    if (!this.a)
    {
      Intent localIntent = (Intent)getIntent().getParcelableExtra("android.intent.extra.INTENT");
      if (localIntent == null)
        localIntent = new Intent(this, WelcomeActivity.class);
      startActivity(localIntent);
    }
    finish();
  }

  public void onClickHandler(View paramView)
  {
    switch (paramView.getId())
    {
    default:
    case 2131165273:
    }
    do
      return;
    while (!a());
    if (d.a(this, this.d.getText().toString()) == null)
    {
      String str1 = this.d.getText().toString();
      String str2 = this.e.getText().toString();
      showDialog(1);
      this.b.a(str1.toLowerCase(), str2);
      return;
    }
    a(1);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    this.a = localIntent.getBooleanExtra("add_account", false);
    setContentView(2130903077);
    ((Navbar)findViewById(2131165246)).a(this);
    this.d = ((EditText)findViewById(2131165271));
    this.e = ((EditText)findViewById(2131165272));
    this.f = ((Button)findViewById(2131165273));
    this.d.addTextChangedListener(this);
    this.e.addTextChangedListener(this);
    this.c = new aj(this, null);
    Uri localUri = localIntent.getData();
    String str2;
    String str1;
    if (localUri != null)
    {
      String str3 = localUri.getQueryParameter("screen_name");
      str2 = localUri.getQueryParameter("password");
      str1 = str3;
    }
    while (true)
    {
      if (!TextUtils.isEmpty(str1))
        this.d.setText(str1);
      if (!TextUtils.isEmpty(str2))
        this.e.setText(str2);
      return;
      str1 = localIntent.getStringExtra("screen_name");
      str2 = localIntent.getStringExtra("password");
    }
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return super.onCreateDialog(paramInt);
    case 1:
    }
    ProgressDialog localProgressDialog = new ProgressDialog(this);
    localProgressDialog.setProgressStyle(0);
    localProgressDialog.setMessage(getText(2131427347));
    localProgressDialog.setIndeterminate(true);
    localProgressDialog.setCancelable(false);
    return localProgressDialog;
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    boolean bool = super.onCreateOptionsMenu(paramMenu);
    paramMenu.add(0, 101, 0, 2131427348).setIcon(17301569).setIntent(new Intent(this, AboutActivity.class));
    return bool;
  }

  public void onPause()
  {
    super.onPause();
    if (this.b != null)
      this.b.b(this.c);
  }

  public void onResume()
  {
    super.onResume();
    this.b = g.a(this);
    this.b.a(this.c);
    switch (ea.a[this.b.i().ordinal()])
    {
    default:
    case 1:
      do
        return;
      while (!"android.intent.action.MAIN".equals(getIntent().getAction()));
      startActivity(new Intent(this, HomeTabActivity.class).putExtra("tab", "home").setFlags(67108864));
      finish();
      return;
    case 2:
      showDialog(1);
      return;
    case 3:
    case 4:
    }
    removeDialog(1);
  }

  public boolean onSearchRequested()
  {
    return false;
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.LoginActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
