package com.twitter.android;

import ad;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.twitter.android.client.g;

public abstract class UserQueryActivity extends BaseFragmentActivity
  implements bf
{
  protected long a;
  protected String b;
  boolean c;
  private aw d;
  private z h;

  public UserQueryActivity()
  {
  }

  protected final void a()
  {
    if (this.d == null)
    {
      this.d = new aw(this, getSupportLoaderManager(), this, 1);
      this.d.a(this.a, this.b, this.e.e());
      return;
    }
    this.d.b(this.a, this.b, this.e.e());
  }

  public abstract void a(ad paramad);

  public final void a(Bundle paramBundle, int paramInt, boolean paramBoolean)
  {
    super.a(paramBundle, paramInt, paramBoolean);
    this.h = new z(this, null);
    this.e.a(this.h);
    if (paramBundle != null)
    {
      this.a = paramBundle.getLong("user_id");
      this.b = paramBundle.getString("username");
    }
    Uri localUri;
    do
    {
      return;
      Intent localIntent = getIntent();
      this.a = localIntent.getLongExtra("user_id", 0L);
      this.b = localIntent.getStringExtra("screen_name");
      localUri = localIntent.getData();
    }
    while (localUri == null);
    String str1 = localUri.getQueryParameter("user_id");
    long l1;
    String str2;
    if (str1 != null)
      try
      {
        long l2 = Long.parseLong(str1);
        l1 = l2;
        str2 = localUri.getQueryParameter("screen_name");
        if ((str2 != null) || (l1 != 0L))
          break label166;
        Toast.makeText(this, 2131427387, 1).show();
        finish();
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
      }
    else
      while (true)
        l1 = 0L;
    label166: this.a = l1;
    this.b = str2;
  }

  public final void b(ad paramad)
  {
    if ((this.c) || (isFinishing()));
    do
    {
      return;
      if (paramad != null)
      {
        a(paramad);
        return;
      }
    }
    while ((this.a == 0L) && (this.b == null));
    this.c = true;
    d(this.e.a(this.b, this.a));
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.e.b(this.h);
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putLong("user_id", this.a);
    paramBundle.putString("username", this.b);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.UserQueryActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
