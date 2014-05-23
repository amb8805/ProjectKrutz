package android.support.v7.app;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.a.k;
import android.support.v7.internal.view.c;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

abstract class d
{
  final ActionBarActivity a;
  boolean b;
  boolean c;
  private ActionBar d;
  private MenuInflater e;

  d(ActionBarActivity paramActionBarActivity)
  {
    this.a = paramActionBarActivity;
  }

  abstract ActionBar a();

  abstract void a(int paramInt);

  void a(Bundle paramBundle)
  {
    TypedArray localTypedArray = this.a.obtainStyledAttributes(k.c);
    if (!localTypedArray.hasValue(0))
    {
      localTypedArray.recycle();
      throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }
    this.b = localTypedArray.getBoolean(0, false);
    this.c = localTypedArray.getBoolean(1, false);
    localTypedArray.recycle();
  }

  abstract void a(View paramView);

  abstract void a(View paramView, ViewGroup.LayoutParams paramLayoutParams);

  abstract void a(CharSequence paramCharSequence);

  abstract boolean a(int paramInt, Menu paramMenu);

  abstract boolean a(int paramInt, MenuItem paramMenuItem);

  abstract boolean a(int paramInt, View paramView, Menu paramMenu);

  final ActionBar b()
  {
    if ((this.b) || (this.c))
      if (this.d != null);
    for (this.d = a(); ; this.d = null)
      return this.d;
  }

  abstract View b(int paramInt);

  abstract void b(View paramView, ViewGroup.LayoutParams paramLayoutParams);

  final MenuInflater c()
  {
    ActionBar localActionBar;
    if (this.e == null)
    {
      localActionBar = b();
      if (localActionBar == null)
        break label36;
    }
    label36: for (this.e = new c(localActionBar.e()); ; this.e = new c(this.a))
      return this.e;
  }

  abstract void d();

  abstract void e();

  abstract void f();

  abstract void g();

  abstract boolean h();

  protected final String i()
  {
    try
    {
      ActivityInfo localActivityInfo = this.a.getPackageManager().getActivityInfo(this.a.getComponentName(), 128);
      Bundle localBundle = localActivityInfo.metaData;
      Object localObject = null;
      if (localBundle != null)
      {
        String str = localActivityInfo.metaData.getString("android.support.UI_OPTIONS");
        localObject = str;
      }
      return localObject;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.e("ActionBarActivityDelegate", "getUiOptionsFromMetadata: Activity '" + this.a.getClass().getSimpleName() + "' not in manifest");
    }
    return null;
  }

  protected final Context j()
  {
    Object localObject = this.a;
    ActionBar localActionBar = b();
    if (localActionBar != null)
      localObject = localActionBar.e();
    return localObject;
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
