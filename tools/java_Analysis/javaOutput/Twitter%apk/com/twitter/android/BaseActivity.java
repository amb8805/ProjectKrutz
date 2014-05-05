package com.twitter.android;

import ag;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;
import com.twitter.android.client.g;
import com.twitter.android.client.i;
import com.twitter.android.provider.az;
import com.twitter.android.widget.Navbar;
import com.twitter.android.widget.m;
import dl;
import dy;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaseActivity extends Activity
  implements m
{
  protected g a;
  protected i b;
  protected Navbar c;
  private ArrayList d;
  private TextView e;
  private final boolean f;

  public BaseActivity(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  public static void a(Context paramContext, Uri paramUri)
  {
    try
    {
      paramContext.startActivity(new Intent("android.intent.action.VIEW", paramUri).setFlags(268435456));
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
    }
  }

  public static void a(Context paramContext, dl paramdl, long paramLong)
  {
    if ((paramdl instanceof dy))
    {
      dy localdy = (dy)paramdl;
      paramContext.startActivity(new Intent(paramContext, ImageActivity.class).putExtra("android.intent.extra.STREAM", Uri.parse(localdy.c)).putExtra("image_url", localdy.d).setData(Uri.parse(localdy.g)));
      return;
    }
    String str1 = paramdl.c;
    int i = str1.indexOf("://");
    String str2;
    if (i == -1)
    {
      str2 = "http://" + str1;
      if (paramdl.d == null)
        break label225;
    }
    label225: for (Matcher localMatcher = ag.e.matcher(paramdl.d); ; localMatcher = ag.e.matcher(str2))
    {
      if (!localMatcher.matches())
        break label238;
      String str3 = localMatcher.group();
      paramContext.startActivity(new Intent(paramContext, TweetActivity.class).setData(az.b.buildUpon().appendEncodedPath(str3.substring(1 + str3.lastIndexOf('/'))).appendQueryParameter("ownerId", String.valueOf(paramLong)).build()));
      return;
      str2 = str1.substring(0, i).toLowerCase() + str1.substring(i);
      break;
    }
    label238: a(paramContext, Uri.parse(str2));
  }

  protected void a()
  {
    c(null);
  }

  protected final void a(int paramInt)
  {
    if (getParent() != null)
      return;
    this.e.setText(paramInt);
  }

  protected final void a(Bundle paramBundle, int paramInt)
  {
    super.onCreate(paramBundle);
    g localg = g.a(this);
    this.a = localg;
    if ((this.f) && (!localg.h()))
    {
      StartActivity.a(this, getIntent());
      return;
    }
    if (paramInt != -1)
    {
      setContentView(paramInt);
      if (getParent() == null)
      {
        Navbar localNavbar = (Navbar)findViewById(2131165246);
        if (localNavbar != null)
        {
          localNavbar.a(this);
          this.c = localNavbar;
          this.e = ((TextView)localNavbar.findViewById(2131165215));
          if (!localg.h())
            localNavbar.a(8, new int[] { 2131165255, 2131165284 });
        }
      }
    }
    if (paramBundle != null)
    {
      this.d = paramBundle.getStringArrayList("pending_reqs");
      return;
    }
    this.d = new ArrayList(5);
  }

  protected final void a(String paramString)
  {
    this.d.add(paramString);
  }

  public void b(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return;
    case 2131165215:
      a();
      return;
    case 2131165284:
      onSearchRequested();
      return;
    case 2131165255:
    }
    Intent localIntent = new Intent(this, PostActivity.class);
    localIntent.setAction("com.twitter.android.post.status");
    startActivity(localIntent);
  }

  protected final boolean b(String paramString)
  {
    return this.d.remove(paramString);
  }

  protected final void c(String paramString)
  {
    Object localObject = getParent();
    if (localObject == null)
      localObject = this;
    Intent localIntent = new Intent(this, HomeTabActivity.class);
    if (paramString != null)
      localIntent.putExtra("tab", paramString);
    localIntent.setFlags(67108864);
    startActivity(localIntent);
    ((Activity)localObject).finish();
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    getWindow().setFormat(1);
  }

  public void onCreate(Bundle paramBundle)
  {
    throw new IllegalStateException("This class must be subclassed. Use super.onCreate(Bundle, int)");
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    boolean bool = super.onCreateOptionsMenu(paramMenu);
    if (this.a.h())
      getMenuInflater().inflate(2131755008, paramMenu);
    return bool;
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return super.onOptionsItemSelected(paramMenuItem);
    case 2131165395:
    }
    a();
    return true;
  }

  protected void onPause()
  {
    super.onPause();
    if ((this.a != null) && (this.b != null))
      this.a.b(this.b);
  }

  protected void onResume()
  {
    super.onResume();
    this.a = g.a(this);
    if ((this.f) && (!this.a.h()))
      StartActivity.a(this);
    while (this.b == null)
      return;
    this.a.a(this.b);
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putStringArrayList("pending_reqs", this.d);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.BaseActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
