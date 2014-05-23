package com.twitter.android;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.Toast;
import com.twitter.android.client.g;
import com.twitter.android.provider.aq;
import com.twitter.android.service.j;
import com.twitter.android.widget.IconTabHost;
import com.twitter.android.widget.TabIndicator;

public class ListTabActivity extends TabFragmentActivity
{
  private static String[] h = { "i_follow" };
  long a;
  long b;
  int c = 0;
  private long i;
  private fi j;

  public ListTabActivity()
  {
  }

  protected final Fragment a(String paramString)
  {
    if ("timeline".equals(paramString))
    {
      Bundle localBundle1 = new Bundle();
      localBundle1.putInt("type", 9);
      localBundle1.putLong("owner_id", this.b);
      localBundle1.putLong("tag", this.a);
      TimelineFragment localTimelineFragment = new TimelineFragment();
      localTimelineFragment.setArguments(localBundle1);
      return localTimelineFragment;
    }
    Bundle localBundle2 = new Bundle();
    Intent localIntent = getIntent();
    localBundle2.putInt("type", localIntent.getIntExtra("type", 4));
    localBundle2.putLong("owner_id", this.b);
    localBundle2.putLong("tag", this.a);
    localBundle2.putBoolean("follow", localIntent.getBooleanExtra("follow", false));
    localBundle2.putBoolean("onboarding", localIntent.getBooleanExtra("onboarding", false));
    UsersFragment localUsersFragment = new UsersFragment();
    localUsersFragment.setArguments(localBundle2);
    return localUsersFragment;
  }

  final void c()
  {
    Uri localUri = aq.b.buildUpon().appendEncodedPath(String.valueOf(this.a)).appendQueryParameter("ownerId", String.valueOf(this.e.j())).build();
    fi localfi = this.j;
    String[] arrayOfString1 = h;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = Long.toString(this.i);
    localfi.startQuery(2, null, localUri, arrayOfString1, "owner_id=?", arrayOfString2, null);
  }

  final void d()
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(this);
    IconTabHost localIconTabHost = this.d;
    Intent localIntent = getIntent();
    a(localIconTabHost.newTabSpec("timeline").setIndicator(TabIndicator.a(localLayoutInflater, localIconTabHost, 2130837783)));
    a(localIconTabHost.newTabSpec("members").setIndicator(TabIndicator.a(localLayoutInflater, localIconTabHost, 2130837786)));
    if (localIntent.hasExtra("tab"))
      localIconTabHost.setCurrentTabByTag(localIntent.getStringExtra("tab"));
    if ((this.a > 0L) && (this.i > 0L))
    {
      localfi = this.j;
      localUri = aq.b.buildUpon().appendEncodedPath(String.valueOf(this.a)).appendQueryParameter("ownerId", String.valueOf(this.e.j())).build();
      arrayOfString1 = h;
      arrayOfString2 = new String[1];
      arrayOfString2[0] = Long.toString(this.i);
      localfi.startQuery(1, null, localUri, arrayOfString1, "owner_id=?", arrayOfString2, null);
    }
    while ((this.a > 0L) && (this.b > 0L))
    {
      fi localfi;
      Uri localUri;
      String[] arrayOfString1;
      String[] arrayOfString2;
      return;
    }
    Toast.makeText(this, 2131427443, 1).show();
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 == 0)
      return;
    switch (paramInt1)
    {
    default:
      return;
    case 1:
    }
    Intent localIntent = getIntent();
    String str = paramIntent.getStringExtra("name");
    localIntent.putExtra("list_name", str);
    localIntent.putExtra("list_description", paramIntent.getStringExtra("description"));
    localIntent.putExtra("list_fullname", paramIntent.getStringExtra("full_name"));
    localIntent.putExtra("list_mode", paramIntent.getIntExtra("mode", 0));
    c(str);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.a(paramBundle, 2130903110, false);
    Intent localIntent = getIntent();
    this.g = new fw(this, null);
    this.j = new fi(this, this);
    Uri localUri = localIntent.getData();
    String str2;
    String str1;
    if ((localUri != null) && ("twitter".equals(localUri.getScheme())))
    {
      String str4 = localUri.getQueryParameter("slug");
      str2 = localUri.getQueryParameter("screen_name");
      str1 = str4;
      this.i = localIntent.getLongExtra("owner_id", 0L);
      if ((str1 == null) || (str2 == null))
        break label164;
      a(true);
      d(this.e.c(str2, str1));
    }
    while (true)
    {
      String str3 = localIntent.getStringExtra("list_name");
      if (str3 == null)
        break label197;
      c(str3);
      return;
      str1 = localIntent.getStringExtra("slug");
      str2 = localIntent.getStringExtra("screen_name");
      break;
      label164: this.b = localIntent.getLongExtra("creator_id", 0L);
      this.a = localIntent.getLongExtra("list_id", -1L);
      d();
    }
    label197: c(str1);
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    boolean bool = super.onCreateOptionsMenu(paramMenu);
    getMenuInflater().inflate(2131755011, paramMenu);
    return bool;
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
    case 2131165399:
    case 2131165400:
    case 2131165402:
    case 2131165401:
    }
    while (true)
    {
      return super.onOptionsItemSelected(paramMenuItem);
      Intent localIntent1 = getIntent();
      Intent localIntent2 = new Intent(this, ListCreateEditActivity.class);
      localIntent2.putExtra("list_id", this.a);
      localIntent2.putExtra("name", localIntent1.getStringExtra("list_name"));
      localIntent2.putExtra("description", localIntent1.getStringExtra("list_description"));
      localIntent2.putExtra("full_name", localIntent1.getStringExtra("list_fullname"));
      localIntent2.putExtra("mode", localIntent1.getIntExtra("list_mode", 0));
      startActivityForResult(localIntent2, 1);
      return true;
      fh localfh = new fh(this);
      new AlertDialog.Builder(this).setTitle(2131427434).setMessage(2131427435).setPositiveButton(2131427505, localfh).setNegativeButton(2131427506, null).create().show();
      return true;
      d(this.e.b(5, this.a, this.b));
      continue;
      d(this.e.a(5, this.a, this.b));
    }
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    super.onPrepareOptionsMenu(paramMenu);
    boolean bool1;
    boolean bool2;
    label81: MenuItem localMenuItem2;
    if (this.b == this.e.j())
    {
      bool1 = true;
      paramMenu.findItem(2131165399).setVisible(bool1);
      paramMenu.findItem(2131165400).setVisible(bool1);
      MenuItem localMenuItem1 = paramMenu.findItem(2131165401);
      if ((bool1) || (this.c != 2))
        break label134;
      bool2 = true;
      localMenuItem1.setVisible(bool2);
      localMenuItem2 = paramMenu.findItem(2131165402);
      if ((bool1) || (this.c != 1))
        break label140;
    }
    label134: label140: for (boolean bool3 = true; ; bool3 = false)
    {
      localMenuItem2.setVisible(bool3);
      return true;
      bool1 = false;
      break;
      bool2 = false;
      break label81;
    }
  }

  protected void onResume()
  {
    if ((this.e.h()) && (this.i > 0L) && (this.a > 0L))
    {
      boolean bool = e();
      super.onResume();
      if ((bool) && (!e()))
      {
        this.c = 0;
        c();
      }
      return;
    }
    super.onResume();
  }

  protected void onStart()
  {
    super.onStart();
    this.e.a(this.e.e(), j.h);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ListTabActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
