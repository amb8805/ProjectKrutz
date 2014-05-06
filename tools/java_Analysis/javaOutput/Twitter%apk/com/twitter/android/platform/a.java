package com.twitter.android.platform;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.twitter.android.AuthenticatorActivity;
import com.twitter.android.LoginActivity;

public final class a extends AbstractAccountAuthenticator
{
  private static final boolean a = Log.isLoggable("TwitterAuthenticator", 3);
  private final Context b;

  public a(Context paramContext)
  {
    super(paramContext);
    this.b = paramContext;
  }

  public final Bundle addAccount(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, String paramString1, String paramString2, String[] paramArrayOfString, Bundle paramBundle)
  {
    if (a)
      Log.d("TwitterAuthenticator", "---> addAccount");
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("intent", new Intent(this.b, LoginActivity.class).putExtra("add_account", true).putExtra("accountAuthenticatorResponse", paramAccountAuthenticatorResponse));
    return localBundle;
  }

  public final Bundle confirmCredentials(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, Bundle paramBundle)
  {
    if (a)
      Log.d("TwitterAuthenticator", "---> confirmCredentials");
    Intent localIntent = new Intent(this.b, AuthenticatorActivity.class);
    localIntent.putExtra("username", paramAccount.name);
    localIntent.putExtra("confirm_credentials", true);
    localIntent.putExtra("accountAuthenticatorResponse", paramAccountAuthenticatorResponse);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("intent", localIntent);
    return localBundle;
  }

  public final Bundle editProperties(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, String paramString)
  {
    throw new UnsupportedOperationException();
  }

  public final Bundle getAuthToken(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String paramString, Bundle paramBundle)
  {
    if (a)
      Log.d("TwitterAuthenticator", "---> getAuthToken");
    if ((!paramString.equals("com.twitter.android.oauth.token")) && (!paramString.equals("com.twitter.android.oauth.token.secret")))
    {
      Bundle localBundle3 = new Bundle();
      localBundle3.putString("errorMessage", "invalid authTokenType");
      return localBundle3;
    }
    String str = AccountManager.get(this.b).peekAuthToken(paramAccount, paramString);
    if (str != null)
    {
      Bundle localBundle1 = new Bundle();
      localBundle1.putString("authAccount", paramAccount.name);
      localBundle1.putString("accountType", "com.twitter.android.auth.login");
      localBundle1.putString("authtoken", str);
      return localBundle1;
    }
    Intent localIntent = new Intent(this.b, AuthenticatorActivity.class);
    localIntent.putExtra("accountAuthenticatorResponse", paramAccountAuthenticatorResponse);
    localIntent.putExtra("username", paramAccount.name);
    localIntent.putExtra("auth_token_type", paramString);
    Bundle localBundle2 = new Bundle();
    localBundle2.putParcelable("intent", localIntent);
    return localBundle2;
  }

  public final String getAuthTokenLabel(String paramString)
  {
    return this.b.getString(2131427343);
  }

  public final Bundle hasFeatures(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String[] paramArrayOfString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("booleanResult", false);
    return localBundle;
  }

  public final Bundle updateCredentials(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String paramString, Bundle paramBundle)
  {
    if (a)
      Log.d("TwitterAuthenticator", "---> updateCredentials");
    Intent localIntent = new Intent(this.b, AuthenticatorActivity.class);
    localIntent.putExtra("username", paramAccount.name);
    localIntent.putExtra("auth_token_type", paramString);
    localIntent.putExtra("confirm_credentials", false);
    localIntent.putExtra("accountAuthenticatorResponse", paramAccountAuthenticatorResponse);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("intent", localIntent);
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.platform.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
