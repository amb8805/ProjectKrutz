package com.twitter.android;

import android.accounts.AccountAuthenticatorResponse;
import android.content.Intent;
import android.os.Bundle;
import com.twitter.android.client.i;
import com.twitter.android.client.j;

final class aj extends i
{
  private aj(LoginActivity paramLoginActivity)
  {
  }

  public final void a(j paramj, String paramString1, int paramInt, String paramString2, String paramString3)
  {
    if (this.a.isFinishing())
      return;
    this.a.removeDialog(1);
    boolean bool = this.a.a;
    switch (paramInt)
    {
    default:
      this.a.a(paramInt);
      return;
    case 200:
      if (bool)
      {
        AccountAuthenticatorResponse localAccountAuthenticatorResponse = (AccountAuthenticatorResponse)this.a.getIntent().getParcelableExtra("accountAuthenticatorResponse");
        String str = paramj.e();
        if (localAccountAuthenticatorResponse != null)
        {
          Bundle localBundle = new Bundle();
          localBundle.putString("authAccount", str);
          localBundle.putString("accountType", "com.twitter.android.auth.login");
          localBundle.putString("account_user_info", paramString3);
          localAccountAuthenticatorResponse.onResult(localBundle);
        }
        Intent localIntent2 = (Intent)this.a.getIntent().getParcelableExtra("android.intent.extra.INTENT");
        if (localIntent2 != null)
          this.a.startActivity(localIntent2);
        this.a.setResult(-1, new Intent().putExtra("account", str));
      }
      while (true)
      {
        this.a.finish();
        return;
        Intent localIntent1 = (Intent)this.a.getIntent().getParcelableExtra("android.intent.extra.INTENT");
        if (localIntent1 != null)
          this.a.startActivity(localIntent1);
      }
    case 400:
    }
    if (bool)
      ((AccountAuthenticatorResponse)this.a.getIntent().getParcelableExtra("accountAuthenticatorResponse")).onError(paramInt, paramString2);
    this.a.a(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.aj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
