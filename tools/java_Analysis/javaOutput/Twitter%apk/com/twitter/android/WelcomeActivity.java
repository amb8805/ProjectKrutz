package com.twitter.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.twitter.android.client.g;
import com.twitter.android.service.j;

public class WelcomeActivity extends BaseActivity
{
  public WelcomeActivity()
  {
    super(true);
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
    finish();
  }

  public void onClickHandler(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 2131165381:
    }
    startActivity(new Intent(this, FollowActivity.class).putExtra("follow_flow", new int[] { 0, 1 }));
  }

  public void onCreate(Bundle paramBundle)
  {
    super.a(paramBundle, 2130903125);
    if (paramBundle == null)
      this.a.a(this.a.e(), j.N);
  }

  public boolean onSearchRequested()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.WelcomeActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
