package com.twitter.android;

import ad;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.twitter.android.client.g;

public class TimelineActivity extends UserQueryActivity
{
  public TimelineActivity()
  {
  }

  public final void a(ad paramad)
  {
    ((TimelineFragment)getSupportFragmentManager().findFragmentById(2131165243)).a(paramad);
  }

  public void onCreate(Bundle paramBundle)
  {
    Intent localIntent = getIntent();
    Uri localUri = localIntent.getData();
    if ((localUri != null) && ("twitter".equals(localUri.getScheme())) && ("user_timeline".equals(localUri.getHost())))
    {
      localIntent.putExtra("owner_id", this.a);
      localIntent.putExtra("type", 1);
    }
    for (int i = 1; ; i = localIntent.getIntExtra("type", 0))
      switch (i)
      {
      default:
        super.a(paramBundle, 2130903064, true);
        if (this.e.h())
          break label135;
        return;
      case 1:
      case 2:
      case 9:
      }
    super.a(paramBundle, 2130903064, false);
    label135: if (paramBundle == null)
    {
      TimelineFragment localTimelineFragment = new TimelineFragment();
      localTimelineFragment.a(this);
      localTimelineFragment.setArguments(TimelineFragment.a(localIntent, true));
      getSupportFragmentManager().beginTransaction().add(2131165243, localTimelineFragment).commit();
    }
    switch (i)
    {
    case 3:
    case 4:
    default:
      throw new IllegalArgumentException("Invalid status type: " + i);
    case 0:
      c(2131427357);
    case 9:
    case 1:
    case 2:
    case 5:
    case 6:
    case 7:
    case 8:
    }
    while (true)
    {
      a();
      return;
      c(2131427357);
      continue;
      c(2131427404);
      continue;
      c(2131427358);
      continue;
      c(2131427382);
      continue;
      c(2131427383);
      continue;
      c(2131427384);
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.TimelineActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
