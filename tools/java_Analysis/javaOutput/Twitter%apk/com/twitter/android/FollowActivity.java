package com.twitter.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.Button;
import com.twitter.android.client.g;
import com.twitter.android.widget.Navbar;

public class FollowActivity extends BaseFragmentActivity
  implements fc
{
  private int[] a;
  private boolean b;
  private Button c;

  public FollowActivity()
  {
  }

  private Fragment a()
  {
    Bundle localBundle = UsersFragment.a(getIntent(), false);
    localBundle.putBoolean("follow", true);
    switch (this.a[0])
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      UsersFragment localUsersFragment = new UsersFragment();
      localUsersFragment.setArguments(localBundle);
      localUsersFragment.d = this;
      return localUsersFragment;
      localBundle.putInt("follow_all_title", 2131427692);
      localBundle.putInt("follow_all_subtitle", 2131427693);
      localBundle.putInt("type", 7);
      localBundle.putBoolean("onboarding", true);
      continue;
      localBundle.putInt("follow_all_title", 2131427556);
      localBundle.putInt("follow_all_subtitle", 2131427557);
      localBundle.putInt("type", 9);
      localBundle.putBoolean("onboarding", true);
      localBundle.putBoolean("browse_categories", true);
    }
  }

  private void c()
  {
    if (this.b)
    {
      c(2131427698);
      return;
    }
    switch (this.a[0])
    {
    default:
      return;
    case 0:
      c(2131427579);
      return;
    case 1:
    }
    c(2131427555);
  }

  private void d()
  {
    if (this.b)
    {
      this.c.setVisibility(8);
      return;
    }
    this.c.setVisibility(0);
    if (this.a.length > 1)
    {
      this.c.setText(2131427509);
      return;
    }
    this.c.setText(2131427507);
  }

  public final void a(int paramInt)
  {
    if (!this.b)
      return;
    int[] arrayOfInt1 = this.a;
    int i = arrayOfInt1.length;
    if ((arrayOfInt1[0] == 0) && (paramInt == 0) && (i > 1))
    {
      int[] arrayOfInt2 = new int[i - 1];
      System.arraycopy(arrayOfInt1, 1, arrayOfInt2, 0, arrayOfInt2.length);
      this.a = arrayOfInt2;
      getSupportFragmentManager().beginTransaction().replace(2131165243, a()).commitAllowingStateLoss();
      return;
    }
    this.b = false;
    c();
    d();
  }

  public final void b(int paramInt)
  {
    switch (paramInt)
    {
    default:
      super.b(paramInt);
      return;
    case 2131165255:
    }
    int[] arrayOfInt1 = this.a;
    int i = arrayOfInt1.length;
    if (arrayOfInt1.length == 1)
    {
      b("home");
      return;
    }
    int[] arrayOfInt2 = new int[i - 1];
    System.arraycopy(arrayOfInt1, 1, arrayOfInt2, 0, arrayOfInt2.length);
    startActivity(new Intent(this, FollowActivity.class).putExtra("follow_flow", arrayOfInt2));
  }

  public void onCreate(Bundle paramBundle)
  {
    super.a(paramBundle, 2130903084, true);
    if (!this.e.h())
      return;
    this.b = true;
    if (paramBundle == null)
    {
      this.a = getIntent().getIntArrayExtra("follow_flow");
      getSupportFragmentManager().beginTransaction().add(2131165243, a()).commit();
    }
    while (true)
    {
      this.c = ((Button)this.f.findViewById(2131165255));
      c();
      d();
      return;
      this.a = paramBundle.getIntArray("follow_flow");
      ((UsersFragment)getSupportFragmentManager().findFragmentById(2131165243)).d = this;
    }
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putIntArray("follow_flow", this.a);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.FollowActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
