package com.twitter.android;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.twitter.android.client.g;
import com.twitter.android.service.j;
import java.util.List;

public class ImageActivity extends Activity
{
  ImageView a;
  ProgressBar b;
  Bitmap c;
  Uri d;
  Uri e;
  String f;
  private Uri g;
  private String h;

  public ImageActivity()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903070);
    Intent localIntent = getIntent();
    if (localIntent.getData() == null)
      throw new IllegalArgumentException("Must be started with a valid Uri");
    this.a = ((ImageView)findViewById(2131165221));
    this.b = ((ProgressBar)findViewById(2131165269));
    this.e = localIntent.getData();
    if (localIntent.hasExtra("android.intent.extra.STREAM"));
    for (this.g = ((Uri)localIntent.getParcelableExtra("android.intent.extra.STREAM")); ; this.g = this.e)
    {
      this.f = localIntent.getStringExtra("android.intent.extra.TEXT");
      this.h = localIntent.getStringExtra("image_url");
      au localau = new au(this, null);
      Uri[] arrayOfUri = new Uri[1];
      arrayOfUri[0] = this.e;
      localau.execute(arrayOfUri);
      g localg = g.a(this);
      localg.a(localg.e(), j.U);
      return;
    }
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return super.onCreateDialog(paramInt);
    case 1:
    }
    ProgressDialog localProgressDialog = new ProgressDialog(this);
    localProgressDialog.setMessage(getString(2131427645));
    localProgressDialog.setCancelable(false);
    return localProgressDialog;
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131755010, paramMenu);
    return true;
  }

  protected void onDestroy()
  {
    super.onDestroy();
    if (this.c != null)
    {
      this.c.recycle();
      this.c = null;
    }
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return super.onOptionsItemSelected(paramMenuItem);
    case 2131165398:
      if (this.c != null)
      {
        bp localbp = new bp(this, null);
        Bitmap[] arrayOfBitmap = new Bitmap[1];
        arrayOfBitmap[0] = this.c;
        localbp.execute(arrayOfBitmap);
      }
    case 2131165397:
    }
    while (true)
    {
      return true;
      BaseActivity.a(this, this.g);
    }
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    PackageManager localPackageManager = getPackageManager();
    Intent localIntent = new Intent("android.intent.action.SEND").setFlags(268435456).setType("text/plain").putExtra("android.intent.extra.TEXT", this.h);
    List localList = localPackageManager.queryIntentActivities(localIntent, 65536);
    int i;
    boolean bool1;
    label90: MenuItem localMenuItem2;
    if (this.c != null)
    {
      i = 1;
      MenuItem localMenuItem1 = paramMenu.findItem(2131165351);
      localMenuItem1.setIntent(localIntent);
      if ((i == 0) || (localList.size() <= 0))
        break label147;
      bool1 = true;
      localMenuItem1.setEnabled(bool1);
      localMenuItem2 = paramMenu.findItem(2131165398);
      if ((i == 0) || (this.d != null))
        break label153;
    }
    label147: label153: for (boolean bool2 = true; ; bool2 = false)
    {
      localMenuItem2.setEnabled(bool2);
      return super.onPrepareOptionsMenu(paramMenu);
      i = 0;
      break;
      bool1 = false;
      break label90;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ImageActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
