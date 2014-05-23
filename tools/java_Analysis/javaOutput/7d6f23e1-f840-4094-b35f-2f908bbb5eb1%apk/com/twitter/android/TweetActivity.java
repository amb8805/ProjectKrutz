package com.twitter.android;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.widget.Toast;
import com.twitter.android.client.g;
import com.twitter.android.provider.ax;
import com.twitter.android.provider.az;

public class TweetActivity extends BaseFragmentActivity
  implements LoaderManager.LoaderCallbacks
{
  private com.twitter.android.client.j a;
  private ax b;
  private TweetFragment c;
  private Uri d;
  private boolean h;

  public TweetActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.a(paramBundle, 2130903113, false);
    this.g = new r(this, null);
    this.c = ((TweetFragment)getSupportFragmentManager().findFragmentById(2131165354));
    c(2131427485);
    Intent localIntent = getIntent();
    Uri localUri = localIntent.getData();
    String str1 = getContentResolver().getType(localUri);
    String str2 = localUri.getScheme();
    if (localIntent.hasExtra("account_name"))
    {
      this.a = this.e.b(localIntent.getStringExtra("account_name"));
      if (paramBundle == null)
        break label149;
      this.b = ((ax)paramBundle.getParcelable("t"));
    }
    while (true)
    {
      if (this.b == null)
        break label207;
      this.c.a(this.b, this.a);
      return;
      this.a = this.e.f();
      break;
      label149: if (localIntent.hasExtra("ref_event"))
        this.e.a(this.a.g(), com.twitter.android.service.j.q, (com.twitter.android.service.j)localIntent.getSerializableExtra("ref_event"));
      else
        this.e.a(this.a.g(), com.twitter.android.service.j.q);
    }
    label207: if ("twitter".equals(str2))
      try
      {
        l = Long.parseLong(localUri.getQueryParameter("status_id"));
        this.d = az.b.buildUpon().appendEncodedPath(String.valueOf(l)).appendQueryParameter("ownerId", String.valueOf(this.a.g())).build();
        getSupportLoaderManager().initLoader(0, null, this);
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
      }
    while (!"vnd.android.cursor.item/vnd.twitter.android.statuses".equals(str1))
    {
      long l;
      Toast.makeText(this, 2131427389, 1).show();
      finish();
      return;
    }
    this.d = localUri;
    getSupportLoaderManager().initLoader(0, null, this);
  }

  public Loader onCreateLoader(int paramInt, Bundle paramBundle)
  {
    return new CursorLoader(this, this.d, ax.b, null, null, null);
  }

  public void onLoaderReset(Loader paramLoader)
  {
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putParcelable("t", this.b);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.TweetActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
