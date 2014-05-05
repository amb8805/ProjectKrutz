package com.twitter.android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import java.lang.ref.WeakReference;

final class dy
{
  final String a;
  private Class b;
  private Bundle c;
  private WeakReference d;

  public dy(Bundle paramBundle, Class paramClass, String paramString)
  {
    this.c = paramBundle;
    this.b = paramClass;
    this.a = paramString;
  }

  public final Fragment a(FragmentActivity paramFragmentActivity)
  {
    if ((this.d == null) || (this.d.get() == null))
    {
      Fragment localFragment = paramFragmentActivity.getSupportFragmentManager().findFragmentByTag(this.a);
      if (localFragment == null)
        localFragment = Fragment.instantiate(paramFragmentActivity, this.b.getName(), this.c);
      this.d = new WeakReference(localFragment);
      return localFragment;
    }
    return (Fragment)this.d.get();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.dy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
