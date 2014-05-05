package com.twitter.android;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.twitter.android.client.g;

public class DialogActivity extends Activity
{
  g a;

  public DialogActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    this.a = g.a(this);
    if (!this.a.h())
    {
      StartActivity.a(this, localIntent);
      return;
    }
    Uri localUri = localIntent.getData();
    String str1 = localIntent.getAction();
    if ("twitter".equals(localIntent.getScheme()))
    {
      String str3 = localUri.getHost();
      if ("follow".equals(str3))
        try
        {
          v localv = new v(this, Long.parseLong(localUri.getQueryParameter("user_id")));
          new AlertDialog.Builder(this).setTitle(2131427534).setMessage(2131427554).setPositiveButton(2131427505, localv).setNegativeButton(2131427506, localv).show();
          return;
        }
        catch (NumberFormatException localNumberFormatException2)
        {
          finish();
          return;
        }
      if ("unfollow".equals(str3))
        try
        {
          w localw = new w(this, Long.parseLong(localUri.getQueryParameter("user_id")));
          new AlertDialog.Builder(this).setTitle(2131427421).setMessage(2131427422).setPositiveButton(2131427505, localw).setNegativeButton(2131427506, localw).show();
          return;
        }
        catch (NumberFormatException localNumberFormatException1)
        {
        }
      finish();
      return;
    }
    if ("start".equals(str1))
    {
      long l = localIntent.getLongExtra("user_id", 0L);
      String str2 = localIntent.getStringExtra("username");
      if ((l == 0L) || (TextUtils.isEmpty(str2)))
        throw new IllegalArgumentException("You must specify both EXTRA_USER_ID and EXTRA_USERNAME");
      t localt = new t(this, l);
      new AlertDialog.Builder(this).setTitle(2131427534).setMessage(getString(2131427563, new Object[] { str2 })).setPositiveButton(2131427564, localt).setNegativeButton(2131427565, localt).show();
      return;
    }
    finish();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.DialogActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
