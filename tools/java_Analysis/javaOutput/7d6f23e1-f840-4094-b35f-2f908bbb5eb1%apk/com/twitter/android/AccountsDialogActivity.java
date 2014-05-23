package com.twitter.android;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import ar;
import com.twitter.android.client.g;
import do;
import dz;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;

public class AccountsDialogActivity extends ListActivity
  implements ar
{
  g a;
  String b;
  private String c;
  private cg d;

  public AccountsDialogActivity()
  {
  }

  private void a(String paramString1, String paramString2)
  {
    startActivity(new Intent(this, HomeTabActivity.class).putExtra("account_name", paramString2).putExtra("tab", paramString1).setFlags(67108864));
  }

  public final void a(dz paramdz, HashMap paramHashMap)
  {
    this.d.notifyDataSetChanged();
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    default:
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
    case 1:
    }
    if (-1 == paramInt2)
      a("home", paramIntent.getStringExtra("account"));
    finish();
  }

  public void onClickHandler(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 2131165204:
      startActivityForResult(new Intent(this, LoginActivity.class).putExtra("add_account", true), 1);
      return;
    case 2131165205:
    }
    startActivity(new Intent(this, SettingsActivity.class));
    finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903041);
    this.a = g.a(this);
    AccountManager localAccountManager = AccountManager.get(this);
    Account[] arrayOfAccount = localAccountManager.getAccountsByType("com.twitter.android.auth.login");
    i = arrayOfAccount.length;
    arrayOfce = new ce[i];
    int j = 0;
    while (true)
      if (j < i)
        try
        {
          arrayOfce[j] = new ce(arrayOfAccount[j], do.c(localAccountManager.getUserData(arrayOfAccount[j], "account_user_info")));
          label81: j++;
          continue;
          this.d = new cg(this, this, arrayOfce);
          getListView().setAdapter(this.d);
          Button localButton1 = (Button)findViewById(2131165204);
          Button localButton2 = (Button)findViewById(2131165205);
          if (i > 1)
          {
            localButton2.setVisibility(0);
            localButton1.setVisibility(8);
          }
          while (true)
          {
            Intent localIntent = getIntent();
            this.c = localIntent.getStringExtra("tab");
            this.b = localIntent.getStringExtra("account");
            this.a.a(1, this);
            return;
            localButton2.setVisibility(8);
            localButton1.setVisibility(0);
          }
        }
        catch (IOException localIOException)
        {
          break label81;
        }
        catch (JSONException localJSONException)
        {
          break label81;
        }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    this.a.b(1, this);
  }

  protected void onListItemClick(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    ce localce = (ce)this.d.getItem(paramInt);
    if (this.c != null)
      a(this.c, localce.a.name);
    while (true)
    {
      finish();
      return;
      setResult(1, new Intent().putExtra("account", localce.a));
    }
  }

  protected void onResume()
  {
    super.onResume();
    if (!this.a.h())
      StartActivity.a(this);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.AccountsDialogActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
