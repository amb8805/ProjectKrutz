package com.facebook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.facebook.a.e;
import com.facebook.a.f;

public class LoginActivity extends Activity
{
  private static final String a = LoginActivity.class.getName();
  private String b;
  private AuthorizationClient c;
  private AuthorizationClient.AuthorizationRequest d;

  public LoginActivity()
  {
  }

  static Bundle a(AuthorizationClient.AuthorizationRequest paramAuthorizationRequest)
  {
    Bundle localBundle = new Bundle();
    localBundle.putSerializable("request", paramAuthorizationRequest);
    return localBundle;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.c.a(paramInt1, paramInt2, paramIntent);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(f.a);
    if (paramBundle != null)
    {
      this.b = paramBundle.getString("callingPackage");
      this.c = ((AuthorizationClient)paramBundle.getSerializable("authorizationClient"));
    }
    while (true)
    {
      AuthorizationClient localAuthorizationClient = this.c;
      localAuthorizationClient.a = this;
      localAuthorizationClient.b = new AuthorizationClient.1(localAuthorizationClient, this);
      this.c.c = new LoginActivity.1(this);
      this.c.d = new LoginActivity.2(this);
      return;
      this.b = getCallingPackage();
      this.c = new AuthorizationClient();
      this.d = ((AuthorizationClient.AuthorizationRequest)getIntent().getSerializableExtra("request"));
    }
  }

  public void onPause()
  {
    super.onPause();
    AuthorizationClient localAuthorizationClient = this.c;
    if (localAuthorizationClient.currentHandler != null)
      localAuthorizationClient.currentHandler.d();
    findViewById(e.a).setVisibility(8);
  }

  public void onResume()
  {
    super.onResume();
    if (this.b == null)
    {
      Log.e(a, "Cannot call LoginActivity with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
      finish();
      return;
    }
    this.c.a(this.d);
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putString("callingPackage", this.b);
    paramBundle.putSerializable("authorizationClient", this.c);
  }
}

/* Location:
 * Qualified Name:     com.facebook.LoginActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
