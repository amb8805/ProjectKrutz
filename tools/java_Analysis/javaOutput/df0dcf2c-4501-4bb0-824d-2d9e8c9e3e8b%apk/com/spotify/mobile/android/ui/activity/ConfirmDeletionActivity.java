package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.dk;
import com.spotify.mobile.android.util.dv;

public class ConfirmDeletionActivity extends BaseFragmentActivity
{
  private Button n;
  private Button o;
  private String p;
  private long q;
  private String r;
  private Uri s;
  private com.spotify.mobile.android.ui.actions.c t = (com.spotify.mobile.android.ui.actions.c)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.c.class);

  public ConfirmDeletionActivity()
  {
  }

  public static Intent a(Context paramContext, String paramString1, Uri paramUri, long paramLong, String paramString2)
  {
    Assertion.a(paramContext);
    Assertion.a(paramString1, "We need a non-null playlist or folder title");
    Assertion.a(paramString1, "We need a non-empty playlist or folder title");
    Assertion.a(paramUri, "We need a non-null content uri");
    if (paramLong > -1L);
    for (boolean bool = true; ; bool = false)
    {
      Assertion.a(bool, "We need a valid row id.");
      Assertion.a(paramString2, "We need a non-null uri");
      Assertion.a(paramString2, "We need a non-empty uri");
      Intent localIntent = new Intent();
      localIntent.setClass(paramContext, ConfirmDeletionActivity.class);
      localIntent.putExtra("name", paramString1);
      localIntent.putExtra("uri", paramString2);
      localIntent.putExtra("row_id", paramLong);
      localIntent.setData(paramUri);
      return localIntent;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    DialogLayout localDialogLayout;
    label89: boolean bool1;
    label120: int i;
    if (((dk)com.spotify.mobile.android.c.c.a(dk.class)).b())
    {
      setTheme(2131755249);
      super.onCreate(paramBundle);
      localDialogLayout = new DialogLayout(this);
      setContentView(localDialogLayout);
      if (paramBundle == null)
        break label326;
      this.p = paramBundle.getString("name");
      this.q = paramBundle.getLong("row_id", -1L);
      this.r = paramBundle.getString("uri");
      this.s = ((Uri)paramBundle.getParcelable(""));
      Assertion.a(this.p, "We need a non-null playlist or folder title");
      Assertion.a(this.p, "We need a non-empty playlist or folder title");
      if (this.q <= -1L)
        break label382;
      bool1 = true;
      Assertion.a(bool1, "We need a valid row id.");
      Assertion.a(this.r, "We need the uri to the item to be deleted.");
      SpotifyLink localSpotifyLink = new SpotifyLink(this.r);
      switch (ConfirmDeletionActivity.3.a[localSpotifyLink.a().ordinal()])
      {
      default:
        Assertion.a("Trying to incorrectly delete link type :" + localSpotifyLink.a());
        i = -1;
        label214: if (i < 0);
      case 1:
      case 2:
      case 3:
      }
    }
    for (boolean bool2 = true; ; bool2 = false)
    {
      Assertion.a(bool2, "Unsupported uri type.");
      localDialogLayout.a(i);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.p;
      localDialogLayout.b(getString(2131689733, arrayOfObject));
      localDialogLayout.a(2131689735, new ConfirmDeletionActivity.1(this));
      localDialogLayout.b(2131689734, new ConfirmDeletionActivity.2(this));
      this.o = localDialogLayout.a();
      this.n = localDialogLayout.b();
      a(dv.a(this, ViewUri.X));
      return;
      setTheme(2131755258);
      break;
      label326: this.p = getIntent().getStringExtra("name");
      this.q = getIntent().getLongExtra("row_id", -1L);
      this.r = getIntent().getStringExtra("uri");
      this.s = getIntent().getData();
      break label89;
      label382: bool1 = false;
      break label120;
      i = 2131689736;
      break label214;
      i = 2131689737;
      break label214;
    }
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putString("name", this.p);
    paramBundle.putString("uri", this.r);
    paramBundle.putLong("row_id", this.q);
    paramBundle.putParcelable("", this.s);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.ConfirmDeletionActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
