package com.twitter.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import com.twitter.android.client.g;
import com.twitter.android.widget.Navbar;
import java.util.ArrayList;

public class UsersActivity extends BaseFragmentActivity
  implements View.OnClickListener, gi
{
  private LinearLayout a;

  public UsersActivity()
  {
  }

  public final void a(int paramInt)
  {
    int i;
    LinearLayout localLinearLayout;
    if (paramInt > 0)
    {
      i = 1;
      if (this.a != null)
        break label116;
      localLinearLayout = (LinearLayout)((ViewStub)findViewById(2131165365)).inflate();
      Button localButton1 = (Button)localLinearLayout.findViewById(2131165234);
      localButton1.setText(2131427503);
      localButton1.setOnClickListener(this);
      Button localButton2 = (Button)localLinearLayout.findViewById(2131165235);
      localButton2.setText(2131427504);
      localButton2.setOnClickListener(this);
      this.a = localLinearLayout;
      label82: if ((i == 0) || (localLinearLayout.getVisibility() != 8))
        break label124;
      localLinearLayout.setAnimation(AnimationUtils.loadAnimation(this, 2130968581));
      localLinearLayout.setVisibility(0);
    }
    label116: label124: 
    while ((i != 0) || (localLinearLayout.getVisibility() != 0))
    {
      return;
      i = 0;
      break;
      localLinearLayout = this.a;
      break label82;
    }
    localLinearLayout.setAnimation(AnimationUtils.loadAnimation(this, 2130968580));
    localLinearLayout.setVisibility(8);
  }

  public final void a(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("username", paramString);
    setResult(-1, localIntent);
    finish();
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 2131165234:
      ArrayList localArrayList = ((UsersFragment)getSupportFragmentManager().findFragmentById(2131165243)).c;
      if (localArrayList.size() > 0)
        setResult(-1, new Intent().putExtra("username", localArrayList));
      finish();
      return;
    case 2131165235:
      finish();
      return;
    case 2131165392:
    }
    finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    Intent localIntent = getIntent();
    int i = localIntent.getIntExtra("type", -1);
    boolean bool;
    String str;
    int j;
    switch (i)
    {
    case 8:
    default:
      super.a(paramBundle, 2130903121, false);
      if (!localIntent.hasExtra("user_ids"))
      {
        bool = true;
        str = localIntent.getAction();
        if (!"android.intent.action.PICK".equals(str))
          break label300;
        j = 1;
        label83: if (paramBundle == null)
        {
          Bundle localBundle = UsersFragment.a(localIntent, bool);
          localBundle.putInt("chmode", j);
          localBundle.putBoolean("follow", "com.twitter.android.intent.action.FOLLOW".equals(str));
          UsersFragment localUsersFragment = new UsersFragment();
          localUsersFragment.setArguments(localBundle);
          localUsersFragment.a(this);
          getSupportFragmentManager().beginTransaction().add(2131165243, localUsersFragment).commit();
        }
        switch (i)
        {
        case 3:
        case 4:
        case 5:
        case 8:
        case 10:
        default:
          c(getString(2131427550));
        case 0:
        case 1:
        case 2:
        case 6:
        case 7:
        case 9:
        case 11:
        case 12:
        }
      }
    case 6:
    case 7:
    case 9:
    }
    while (true)
    {
      if (j != 0)
        this.f.a(8, new int[] { 2131165255, 2131165284 });
      do
      {
        return;
        super.a(paramBundle, 2130903121, false);
        bool = false;
        break;
        super.a(paramBundle, 2130903121, true);
      }
      while (!this.e.h());
      bool = false;
      break;
      label300: if ("com.twitter.android.pick_multiple".equals(str))
      {
        j = 2;
        break label83;
      }
      j = 0;
      break label83;
      c(getString(2131427370));
      continue;
      c(getString(2131427371));
      continue;
      c(getString(2131427367));
      continue;
      c(localIntent.getStringExtra("slug_name"));
      continue;
      c(2131427586);
      continue;
      c(2131427558);
      continue;
      c(2131427700);
      continue;
      c(2131427701);
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.UsersActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
