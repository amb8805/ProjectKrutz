package com.twitter.android;

import ac;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.accounts.AccountManager;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.twitter.android.client.g;
import com.twitter.android.service.TwitterService;
import com.twitter.android.service.e;

public class AuthenticatorActivity extends AccountAuthenticatorActivity
{
  Boolean a;
  private AccountManager b;
  private String c;
  private String d;
  private EditText e;

  public AuthenticatorActivity()
  {
  }

  private void b(ac paramac)
  {
    Account localAccount = new Account(this.d, "com.twitter.android.auth.login");
    AccountManager localAccountManager = this.b;
    localAccountManager.setAuthToken(localAccount, "com.twitter.android.oauth.token", paramac.b);
    localAccountManager.setAuthToken(localAccount, "com.twitter.android.oauth.token.secret", paramac.a);
  }

  final void a(ac paramac)
  {
    b(paramac);
    Intent localIntent = new Intent();
    localIntent.putExtra("authAccount", this.d);
    localIntent.putExtra("accountType", "com.twitter.android.auth.login");
    if (this.c != null)
    {
      if (!this.c.equals("com.twitter.android.oauth.token"))
        break label102;
      localIntent.putExtra("authtoken", paramac.b);
    }
    while (true)
    {
      setAccountAuthenticatorResult(localIntent.getExtras());
      setResult(-1, localIntent);
      g localg = g.a(this);
      if (localg.h())
        localg.a(paramac);
      finish();
      return;
      label102: if (this.c.equals("com.twitter.android.oauth.token.secret"))
        localIntent.putExtra("authtoken", paramac.a);
    }
  }

  final void a(ac paramac, boolean paramBoolean)
  {
    b(paramac);
    Intent localIntent = new Intent();
    localIntent.putExtra("booleanResult", true);
    setAccountAuthenticatorResult(localIntent.getExtras());
    setResult(-1, localIntent);
    finish();
  }

  public void onClickHandler(View paramView)
  {
    String str = this.e.getText().toString();
    if (TextUtils.isEmpty(str))
      return;
    showDialog(1);
    gf localgf = new gf(this);
    Intent localIntent = new Intent(this, TwitterService.class);
    localIntent.setAction("LOGIN");
    localIntent.putExtra("screen_name", this.d);
    localIntent.putExtra("pass", str);
    localIntent.putExtra("ibinder", new e(localgf));
    startService(localIntent);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(3);
    setContentView(2130903078);
    getWindow().setFeatureDrawableResource(3, 17301543);
    this.b = AccountManager.get(this);
    Intent localIntent = getIntent();
    this.d = localIntent.getStringExtra("username");
    this.c = localIntent.getStringExtra("auth_token_type");
    this.a = Boolean.valueOf(localIntent.getBooleanExtra("confirm_credentials", false));
    ((TextView)findViewById(2131165275)).setText(this.d);
    this.e = ((EditText)findViewById(2131165276));
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 1:
    }
    ProgressDialog localProgressDialog = new ProgressDialog(this);
    localProgressDialog.setMessage(getText(2131427501));
    localProgressDialog.setIndeterminate(true);
    localProgressDialog.setCancelable(true);
    return localProgressDialog;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.AuthenticatorActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
