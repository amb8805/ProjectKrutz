package com.twitter.android;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.TabActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import com.twitter.android.client.g;
import com.twitter.android.provider.k;
import com.twitter.android.widget.IconTabHost;
import com.twitter.android.widget.Navbar;
import com.twitter.android.widget.TabIndicator;
import com.twitter.android.widget.m;
import com.twitter.android.widget.n;
import java.util.HashMap;

public class HomeTabActivity extends TabActivity
  implements OnAccountsUpdateListener, TabHost.OnTabChangeListener, do, m, n
{
  static final HashMap a = new HashMap(4);
  private static int[] g = { 0, 1, 2, 3 };
  private static int h = 0;
  g b;
  String c;
  boolean d;
  boolean e;
  boolean f;
  private boolean i;
  private long j;
  private com.twitter.android.client.i k;
  private cb l;
  private bu m;
  private SharedPreferences n;

  static
  {
    a.put("home", Integer.valueOf(0));
    a.put("connect", Integer.valueOf(1));
    a.put("discover", Integer.valueOf(2));
  }

  public HomeTabActivity()
  {
  }

  private void a(Intent paramIntent)
  {
    if (paramIntent.hasExtra("account_name"))
    {
      this.b.a(paramIntent.getStringExtra("account_name"));
      paramIntent.removeExtra("account_name");
    }
    getTabHost().getCurrentTabTag();
    if ("twitter".equals(paramIntent.getScheme()))
    {
      String str2 = paramIntent.getData().getHost();
      if ((!"timeline".equals(str2)) && ("mentions".equals(str2)))
      {
        a("connect", 1);
        return;
      }
      a("home", 0);
      return;
    }
    String str1 = paramIntent.getStringExtra("tab");
    if (str1 == null)
    {
      a(this.n.getString("tag", "home"), this.n.getInt("home_item", 0));
      return;
    }
    if (paramIntent.hasExtra("ref_event"))
    {
      getCurrentActivity().getIntent().putExtra("ref_event", paramIntent.getSerializableExtra("ref_event"));
      paramIntent.removeExtra("ref_event");
    }
    a(str1, paramIntent.getIntExtra("home_item", 0));
  }

  private void b(String paramString, int paramInt)
  {
    g localg = this.b;
    String str = this.c;
    localg.a(str, 7);
    if (("home".equals(paramString)) && (paramInt == 0))
    {
      localg.b(str, 1);
      localg.i(str);
    }
    do
    {
      do
      {
        return;
        if (("connect".equals(paramString)) && (1 == paramInt))
        {
          localg.b(str, 2);
          localg.i(str);
          return;
        }
      }
      while (!"discover".equals(paramString));
      a(2, false);
    }
    while (!this.d);
    ((HomeActivity)getCurrentActivity()).d();
    this.d = false;
  }

  public final void a()
  {
    HomeActivity localHomeActivity = (HomeActivity)getCurrentActivity();
    if (localHomeActivity != null)
      localHomeActivity.c();
  }

  public final void a(int paramInt)
  {
    b(getTabHost().getCurrentTabTag(), paramInt);
  }

  final void a(int paramInt, boolean paramBoolean)
  {
    switch (paramInt)
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      ((TabIndicator)getTabWidget().getChildTabViewAt(paramInt)).a(paramBoolean);
      return;
      if (this.e != paramBoolean)
      {
        if (!paramBoolean)
          this.b.l();
        this.e = paramBoolean;
        continue;
        if (this.i != paramBoolean)
        {
          if (!paramBoolean)
            this.b.n();
          this.i = paramBoolean;
          continue;
          if (this.f != paramBoolean)
          {
            if (!paramBoolean)
              this.b.m();
            this.f = paramBoolean;
          }
        }
      }
    }
  }

  final void a(String paramString, int paramInt)
  {
    TabHost localTabHost = getTabHost();
    if (!paramString.equals(localTabHost.getCurrentTabTag()))
      localTabHost.setCurrentTabByTag(paramString);
    ((HomeActivity)getCurrentActivity()).b(paramInt);
  }

  public final void a(boolean paramBoolean)
  {
    a(getTabHost().getCurrentTab(), false);
  }

  public final void a_(String paramString)
  {
    this.b.a(paramString);
  }

  final void b()
  {
    int[] arrayOfInt = g;
    int i1 = arrayOfInt.length;
    for (int i2 = 0; i2 < i1; i2++)
      a(arrayOfInt[i2], false);
    this.m.startQuery(0, null, Uri.withAppendedPath(k.a, this.b.d()), com.twitter.android.provider.i.a, null, null, null);
  }

  public final void b(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return;
    case 2131165255:
    }
    startActivity(new Intent(this, PostActivity.class).setAction("com.twitter.android.post.status"));
  }

  public void onAccountsUpdated(Account[] paramArrayOfAccount)
  {
    int i1 = 0;
    int i2 = paramArrayOfAccount.length;
    int i3 = 0;
    int i4 = 0;
    while (i1 < i2)
    {
      Account localAccount = paramArrayOfAccount[i1];
      if ("com.twitter.android.auth.login".equals(localAccount.type))
      {
        i4++;
        if ((i3 == 0) && (localAccount.name.equals(this.c)))
          i3 = 1;
      }
      i1++;
    }
    if ((i3 == 0) && (i4 > 0))
      this.c = null;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    default:
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
    case 1:
    }
    Account localAccount;
    do
    {
      do
        return;
      while (paramInt2 != 1);
      localAccount = (Account)paramIntent.getParcelableExtra("account");
    }
    while ((this.c == null) || (this.c.equals(localAccount.name)));
    this.l.a(localAccount);
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    getWindow().setFormat(1);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    g localg = g.a(this);
    if (!localg.h())
    {
      StartActivity.a(this, getIntent());
      return;
    }
    setContentView(2130903067);
    ((Navbar)findViewById(2131165246)).a(this);
    this.b = localg;
    this.l = new cb(this, findViewById(2131165245), this);
    this.n = getPreferences(0);
    String str = this.n.getString("tag", "home");
    int i1 = this.n.getInt("home_item", 0);
    AccountManager.get(this).addOnAccountsUpdatedListener(this, null, true);
    this.c = this.b.d();
    this.k = new cu(this, null);
    this.b.a(this.k);
    this.m = new bu(this, getContentResolver());
    LayoutInflater localLayoutInflater = LayoutInflater.from(this);
    IconTabHost localIconTabHost = (IconTabHost)getTabHost();
    localIconTabHost.setOnTabChangedListener(this);
    localIconTabHost.a(this);
    Intent localIntent1 = new Intent(this, HomeActivity.class).putExtra("type", 1);
    if ("home".equals(str))
      localIntent1.putExtra("home_item", i1);
    localIconTabHost.addTab(localIconTabHost.newTabSpec("home").setIndicator(TabIndicator.a(localLayoutInflater, 2130903068, localIconTabHost, 2130837769, 2131427337)).setContent(localIntent1));
    Intent localIntent2 = new Intent(this, ConnectActivity.class).putExtra("type", 2);
    if ("connect".equals(str))
      localIntent2.putExtra("home_item", i1);
    localIconTabHost.addTab(localIconTabHost.newTabSpec("connect").setIndicator(TabIndicator.a(localLayoutInflater, 2130903068, localIconTabHost, 2130837755, 2131427678)).setContent(localIntent2));
    Intent localIntent3 = new Intent(this, HomeActivity.class).putExtra("type", 3);
    if ("discover".equals(str))
      localIntent3.putExtra("home_item", i1);
    localIconTabHost.addTab(localIconTabHost.newTabSpec("discover").setIndicator(TabIndicator.a(localLayoutInflater, 2130903068, localIconTabHost, 2130837762, 2131427338)).setContent(localIntent3));
    localIconTabHost.addTab(localIconTabHost.newTabSpec("account").setIndicator(TabIndicator.a(localLayoutInflater, 2130903068, localIconTabHost, 2130837776, 2131427689)).setContent(new Intent(this, HomeActivity.class).putExtra("type", 4)));
    a(getIntent());
    b();
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131755009, paramMenu);
    return true;
  }

  protected void onDestroy()
  {
    super.onDestroy();
    if (this.k != null)
      this.b.b(this.k);
    AccountManager.get(this).removeOnAccountsUpdatedListener(this);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    a(paramIntent);
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return super.onOptionsItemSelected(paramMenuItem);
    case 2131165205:
      startActivity(new Intent(this, SettingsActivity.class));
      return true;
    case 2131165396:
      startActivityForResult(new Intent(this, AccountsDialogActivity.class).putExtra("account", this.b.d()), 1);
      return true;
    case 2131165350:
    }
    Intent localIntent = new Intent(this, ProfileActivity.class);
    localIntent.putExtra("user_id", this.b.j());
    localIntent.putExtra("screen_name", this.b.d());
    startActivity(localIntent);
    return true;
  }

  protected void onPause()
  {
    super.onPause();
    this.b.a(this.b.d(), 7);
    SharedPreferences.Editor localEditor = this.n.edit();
    localEditor.putInt("ver", 2);
    localEditor.putString("tag", getTabHost().getCurrentTabTag());
    localEditor.putInt("home_item", ((HomeActivity)getCurrentActivity()).a());
    localEditor.putLong("st", this.j);
    localEditor.commit();
  }

  protected void onResume()
  {
    super.onResume();
    g localg = this.b;
    if (this.c == null)
      localg.a(localg.d());
    if (!localg.h())
      StartActivity.a(this);
    long l1;
    do
    {
      return;
      if (h == 0)
      {
        int i1 = this.n.getInt("ver", 0);
        if (i1 == 0)
          localg.p();
        if (i1 == 1)
        {
          fk localfk = new fk(this);
          SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(this).edit();
          localEditor.putString("photo_service", String.valueOf(2));
          localEditor.commit();
          new AlertDialog.Builder(this).setTitle(2131427343).setIcon(2130837710).setMessage(2131427642).setPositiveButton(2131427503, null).setNegativeButton(2131427464, localfk).create().show();
        }
        h = 2;
      }
      l1 = System.currentTimeMillis();
      this.j = this.n.getLong("st", 0L);
    }
    while (3600000L + this.j >= l1);
    localg.d(localg.f());
    this.j = l1;
  }

  public void onTabChanged(String paramString)
  {
    b(paramString, ((HomeActivity)getCurrentActivity()).a());
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.HomeTabActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
