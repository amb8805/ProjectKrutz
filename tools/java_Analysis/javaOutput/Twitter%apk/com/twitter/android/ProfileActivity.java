package com.twitter.android;

import ad;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.TextView;
import com.twitter.android.widget.Navbar;

public class ProfileActivity extends UserQueryActivity
{
  public ProfileActivity()
  {
  }

  public final void a(ad paramad)
  {
    ((TextView)this.f.findViewById(2131165215)).setText('@' + paramad.g);
    ((ProfileFragment)getSupportFragmentManager().findFragmentById(2131165243)).a(paramad);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.a(paramBundle, 2130903064, false);
    Intent localIntent = getIntent();
    Uri localUri;
    if ((this.b == null) && (this.a == 0L))
    {
      localUri = localIntent.getData();
      if (localUri != null)
      {
        if (!"com.twitter.android.action.USER_SHOW".equals(localIntent.getAction()))
          break label122;
        this.b = localUri.getLastPathSegment();
      }
    }
    label122: 
    while (this.a != 0L)
    {
      if (paramBundle == null)
      {
        ProfileFragment localProfileFragment = new ProfileFragment();
        Bundle localBundle = ProfileFragment.a(localIntent, false);
        localBundle.putInt("type", localIntent.getIntExtra("type", 0));
        localProfileFragment.setArguments(localBundle);
        getSupportFragmentManager().beginTransaction().add(2131165243, localProfileFragment).commit();
      }
      a();
      return;
    }
    new bc(this, null).execute(new Uri[] { localUri });
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ProfileActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
