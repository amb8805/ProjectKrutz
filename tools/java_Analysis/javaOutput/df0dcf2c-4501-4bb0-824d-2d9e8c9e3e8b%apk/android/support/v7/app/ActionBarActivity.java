package android.support.v7.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.aj;
import android.support.v4.app.ak;
import android.support.v4.app.r;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class ActionBarActivity extends FragmentActivity
  implements ak, a
{
  d n;

  public ActionBarActivity()
  {
  }

  private boolean f()
  {
    Intent localIntent = r.a(this);
    if (localIntent != null)
    {
      if (r.a(this, localIntent))
      {
        aj localaj = aj.a(this);
        localaj.a(this);
        localaj.a();
        try
        {
          if (Build.VERSION.SDK_INT >= 16)
            finishAffinity();
          else
            finish();
        }
        catch (IllegalStateException localIllegalStateException)
        {
          finish();
        }
      }
      else
      {
        r.b(this, localIntent);
      }
    }
    else
      return false;
    return true;
  }

  final void a(int paramInt)
  {
    super.setContentView(paramInt);
  }

  final void a(View paramView)
  {
    super.setContentView(paramView);
  }

  final void a(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.setContentView(paramView, paramLayoutParams);
  }

  boolean a(int paramInt, Menu paramMenu)
  {
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }

  final boolean a(int paramInt, MenuItem paramMenuItem)
  {
    return super.onMenuItemSelected(paramInt, paramMenuItem);
  }

  final boolean a(int paramInt, View paramView, Menu paramMenu)
  {
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }

  public final Intent a_()
  {
    return r.a(this);
  }

  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    this.n.b(paramView, paramLayoutParams);
  }

  final void b(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addContentView(paramView, paramLayoutParams);
  }

  public final ActionBar e()
  {
    return this.n.b();
  }

  public MenuInflater getMenuInflater()
  {
    return this.n.c();
  }

  public void onBackPressed()
  {
    if (!this.n.h())
      super.onBackPressed();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.n.d();
  }

  protected void onCreate(Bundle paramBundle)
  {
    int i = Build.VERSION.SDK_INT;
    Object localObject;
    if (i >= 14)
      localObject = new g(this);
    while (true)
    {
      this.n = ((d)localObject);
      super.onCreate(paramBundle);
      this.n.a(paramBundle);
      return;
      if (i >= 11)
        localObject = new f(this);
      else
        localObject = new e(this);
    }
  }

  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    return this.n.a(paramInt, paramMenu);
  }

  public View onCreatePanelView(int paramInt)
  {
    if (paramInt == 0)
      return this.n.b(paramInt);
    return super.onCreatePanelView(paramInt);
  }

  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (this.n.a(paramInt, paramMenuItem))
      return true;
    ActionBar localActionBar = this.n.b();
    if ((paramMenuItem.getItemId() == 16908332) && (localActionBar != null) && ((0x4 & localActionBar.d()) != 0))
      return f();
    return false;
  }

  protected void onPostResume()
  {
    super.onPostResume();
    this.n.f();
  }

  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    return this.n.a(paramInt, paramView, paramMenu);
  }

  protected void onStop()
  {
    super.onStop();
    this.n.e();
  }

  protected void onTitleChanged(CharSequence paramCharSequence, int paramInt)
  {
    super.onTitleChanged(paramCharSequence, paramInt);
    this.n.a(paramCharSequence);
  }

  public void setContentView(int paramInt)
  {
    this.n.a(paramInt);
  }

  public void setContentView(View paramView)
  {
    this.n.a(paramView);
  }

  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    this.n.a(paramView, paramLayoutParams);
  }

  public final void v_()
  {
    if (Build.VERSION.SDK_INT >= 14)
      super.v_();
    this.n.g();
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.ActionBarActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
