package com.twitter.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import com.twitter.android.client.g;
import com.twitter.android.client.i;
import com.twitter.android.widget.Navbar;

public class MessagesActivity extends BaseFragmentActivity
{
  private i a;

  public MessagesActivity()
  {
  }

  private void a(Intent paramIntent)
  {
    g localg = this.e;
    String str = paramIntent.getStringExtra("account_name");
    if ((!TextUtils.isEmpty(str)) && (!str.equals(localg.d())))
      localg.a(str);
    localg.o();
  }

  public final void b(int paramInt)
  {
    if (2131165255 == paramInt)
    {
      startActivity(new Intent(this, MessagesThreadActivity.class).putExtra("owner_id", this.e.j()));
      return;
    }
    super.b(paramInt);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.a(paramBundle, 2130903064, true);
    if (!this.e.h())
      return;
    c(getString(2131427359));
    this.f.b(2131165255, 2130837789);
    if (paramBundle == null)
    {
      Intent localIntent = getIntent();
      a(localIntent);
      MessagesFragment localMessagesFragment = new MessagesFragment();
      localMessagesFragment.a(this);
      localMessagesFragment.setArguments(MessagesFragment.a(localIntent, true));
      getSupportFragmentManager().beginTransaction().add(2131165243, localMessagesFragment).commit();
    }
    this.a = new bq(this, null);
    this.e.a(this.a);
  }

  public void onDestroy()
  {
    super.onDestroy();
    if (this.a != null)
      this.e.b(this.a);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    a(paramIntent);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.MessagesActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
