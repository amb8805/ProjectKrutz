package com.twitter.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;
import com.twitter.android.client.g;
import com.twitter.android.client.i;
import com.twitter.android.widget.Navbar;
import com.twitter.android.widget.m;
import java.util.ArrayList;

public class BaseFragmentActivity extends FragmentActivity
  implements fn, m
{
  private TextView a;
  private ArrayList b;
  private Activity c;
  private boolean d;
  protected g e;
  protected Navbar f;
  protected i g;

  public BaseFragmentActivity()
  {
  }

  protected void a(Bundle paramBundle, int paramInt, boolean paramBoolean)
  {
    super.onCreate(paramBundle);
    setContentView(paramInt);
    g localg = g.a(this);
    Activity localActivity = getParent();
    this.e = localg;
    this.d = paramBoolean;
    this.c = localActivity;
    if ((paramBoolean) && (!localg.h()))
    {
      if (localActivity == null)
        StartActivity.a(this, getIntent());
      return;
    }
    Navbar localNavbar = (Navbar)findViewById(2131165246);
    if (localNavbar != null)
    {
      if (localActivity != null)
        break label161;
      localNavbar.a(this);
      localNavbar.setVisibility(0);
      this.a = ((TextView)localNavbar.findViewById(2131165215));
      if (!localg.h())
        localNavbar.a(8, new int[] { 2131165255, 2131165284 });
    }
    while (true)
    {
      this.f = localNavbar;
      if (paramBundle == null)
        break;
      this.b = paramBundle.getStringArrayList("pending_reqs");
      return;
      label161: localNavbar.setVisibility(8);
    }
    this.b = new ArrayList(5);
  }

  public final void b()
  {
  }

  public void b(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return;
    case 2131165215:
      b(null);
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

  protected final void b(String paramString)
  {
    Object localObject = this.c;
    if (localObject == null)
      localObject = this;
    Intent localIntent = new Intent(this, HomeTabActivity.class);
    if (paramString != null)
      localIntent.putExtra("tab", paramString);
    localIntent.setFlags(67108864);
    startActivity(localIntent);
    ((Activity)localObject).finish();
  }

  protected final void c(int paramInt)
  {
    if ((this.a == null) || (this.c != null))
      return;
    this.a.setText(getString(paramInt));
  }

  protected final void c(String paramString)
  {
    if ((this.a == null) || (this.c != null))
      return;
    this.a.setText(paramString);
  }

  protected final void d(String paramString)
  {
    this.b.add(paramString);
  }

  protected final boolean e()
  {
    return !this.b.isEmpty();
  }

  protected final boolean e(String paramString)
  {
    return this.b.remove(paramString);
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    getWindow().setFormat(1);
  }

  public void onCreate(Bundle paramBundle)
  {
    throw new IllegalArgumentException("You must call the multiple parameter versions of this method");
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    boolean bool = super.onCreateOptionsMenu(paramMenu);
    if ((this.e.h()) && (this.c == null))
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
    b(null);
    return true;
  }

  protected void onPause()
  {
    super.onPause();
    if (this.g != null)
      this.e.b(this.g);
  }

  protected void onResume()
  {
    super.onResume();
    if ((this.d) && (!this.e.h()))
      StartActivity.a(this);
    if (this.g != null)
      this.e.a(this.g);
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putStringArrayList("pending_reqs", this.b);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.BaseFragmentActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
