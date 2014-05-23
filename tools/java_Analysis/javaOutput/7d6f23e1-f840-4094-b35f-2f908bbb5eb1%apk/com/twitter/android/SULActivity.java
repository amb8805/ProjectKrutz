package com.twitter.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.twitter.android.client.g;
import com.twitter.android.widget.Navbar;

public class SULActivity extends BaseFragmentActivity
  implements View.OnClickListener
{
  public SULActivity()
  {
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 2131165237:
    }
    finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = getIntent().getBooleanExtra("onboarding", false);
    if (bool)
    {
      super.a(paramBundle, 2130903084, true);
      if (this.e.h())
        break label45;
    }
    label45: 
    do
    {
      return;
      super.a(paramBundle, 2130903064, true);
      break;
      c(getString(2131427595));
      if (bool)
      {
        Navbar localNavbar = this.f;
        localNavbar.a(8, new int[] { 2131165255, 2131165284 });
        Button localButton = (Button)LayoutInflater.from(this).inflate(2130903049, localNavbar, false);
        localButton.setOnClickListener(this);
        localNavbar.addView(localButton);
      }
    }
    while (paramBundle != null);
    SULFragment localSULFragment = new SULFragment();
    localSULFragment.setArguments(SULFragment.a(getIntent(), true));
    getSupportFragmentManager().beginTransaction().add(2131165243, localSULFragment).commit();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.SULActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
