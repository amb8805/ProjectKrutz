package com.twitter.android;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import com.twitter.android.client.g;
import com.twitter.android.service.j;
import com.twitter.android.widget.Navbar;

public class SearchTweetsActivity extends BaseFragmentActivity
{
  int a;
  private String b;

  public SearchTweetsActivity()
  {
  }

  private void a(Bundle paramBundle, Intent paramIntent)
  {
    Object localObject2;
    int i;
    Object localObject1;
    if ("twitter".equals(paramIntent.getScheme()))
    {
      localObject2 = paramIntent.getData().getQueryParameter("query");
      paramIntent.putExtra("query", (String)localObject2);
      i = 0;
      localObject1 = localObject2;
      paramIntent.putExtra("type", i);
      if (paramBundle == null)
      {
        SearchTweetsFragment localSearchTweetsFragment = new SearchTweetsFragment();
        localSearchTweetsFragment.setArguments(SearchTweetsFragment.a(paramIntent, true));
        getSupportFragmentManager().beginTransaction().add(2131165243, localSearchTweetsFragment).commit();
      }
      this.a = i;
      this.b = ((String)localObject1);
      if (!TextUtils.isEmpty((java.lang.CharSequence)localObject2))
        break label262;
      if (!TextUtils.isEmpty((java.lang.CharSequence)localObject1))
        break label253;
      c(2131427458);
    }
    while (true)
    {
      this.f.a(8, 2131165284);
      this.g = new a(this, null);
      return;
      String str1 = paramIntent.getAction();
      String str2 = paramIntent.getStringExtra("name");
      localObject1 = paramIntent.getStringExtra("query");
      if ("com.twitter.android.action.USER_SHOW".equals(str1))
      {
        startActivity(new Intent(this, ProfileActivity.class).putExtra("screen_name", (String)localObject1));
        finish();
        return;
      }
      Uri localUri = paramIntent.getData();
      if (localUri == null)
      {
        i = paramIntent.getIntExtra("type", 0);
        localObject2 = str2;
        break;
      }
      i = Integer.valueOf(localUri.getQueryParameter("type")).intValue();
      localObject2 = str2;
      break;
      label253: c((String)localObject1);
      continue;
      label262: c((String)localObject2);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.a(paramBundle, 2130903064, false);
    a(paramBundle, getIntent());
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    boolean bool1 = super.onCreateOptionsMenu(paramMenu);
    boolean bool2 = this.e.h();
    if (bool2)
      getMenuInflater().inflate(2131755014, paramMenu);
    return (bool1) && (bool2);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    a(null, paramIntent);
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return super.onOptionsItemSelected(paramMenuItem);
    case 2131165404:
      d(this.e.d(this.b));
      Toast.makeText(this, 2131427617, 0).show();
      this.a = 6;
      return true;
    case 2131165405:
    }
    d(this.e.e(this.b));
    Toast.makeText(this, 2131427618, 0).show();
    this.a = 0;
    return true;
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    if (!this.e.h())
      return false;
    boolean bool1;
    MenuItem localMenuItem;
    if (this.a == 6)
    {
      bool1 = true;
      paramMenu.findItem(2131165405).setVisible(bool1);
      localMenuItem = paramMenu.findItem(2131165404);
      if (bool1)
        break label76;
    }
    label76: for (boolean bool2 = true; ; bool2 = false)
    {
      localMenuItem.setVisible(bool2);
      return super.onPrepareOptionsMenu(paramMenu);
      bool1 = false;
      break;
    }
  }

  protected void onStart()
  {
    super.onStart();
    this.e.a(this.e.e(), j.c);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.SearchTweetsActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
