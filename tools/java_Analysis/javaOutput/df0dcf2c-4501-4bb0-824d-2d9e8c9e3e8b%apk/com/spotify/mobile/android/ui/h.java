package com.spotify.mobile.android.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.app.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.mobile.android.util.a.k;

final class h extends i
{
  protected ImageView a;
  protected Bitmap b;

  public h(f paramf, Bundle paramBundle)
  {
    super(paramf, paramBundle);
  }

  public h(f paramf, Fragment paramFragment, ActionBarTitle paramActionBarTitle)
  {
    super(paramf, paramFragment, paramActionBarTitle);
    this.a = new ImageView(f.b(paramf));
    this.a.setBackgroundColor(f.b(paramf).getResources().getColor(2131296282));
    localView = paramFragment.v();
    if (localView == null)
      return;
    i = k.b(localView);
    k.a(localView);
    try
    {
      localView.setDrawingCacheEnabled(true);
      Bitmap localBitmap = localView.getDrawingCache();
      if (localBitmap != null)
      {
        this.b = Bitmap.createBitmap(localBitmap);
        this.a.setImageBitmap(this.b);
      }
      localView.setDrawingCacheEnabled(false);
      k.a(localView, i);
      f.d(paramf).addView(this.a);
      return;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      break label114;
    }
  }

  public h(l paraml, Fragment.SavedState paramSavedState, Bundle paramBundle, ActionBarTitle paramActionBarTitle)
  {
    super(paraml, paramSavedState, paramBundle, paramActionBarTitle, localActionBarTitle);
    this.a = new ImageView(f.b(paraml));
    this.a.setBackgroundColor(f.b(paraml).getResources().getColor(2131296282));
    f.d(paraml).addView(this.a);
  }

  public final int a()
  {
    return 1;
  }

  public final i a(l paraml)
  {
    d(paraml);
    return new i(this.c, this.d, this.e, this.f, f());
  }

  public final View b()
  {
    return this.a;
  }

  public final h b(l paraml)
  {
    return this;
  }

  public final g c(l paraml)
  {
    d(paraml);
    return new g(this.c, paraml, this.d, this.e, this.f, f());
  }

  public final void d(l paraml)
  {
    if (this.a != null)
      this.a.setImageDrawable(null);
    if (this.b != null)
      this.b.recycle();
    f.d(this.c).removeView(this.a);
  }

  public final String toString()
  {
    return "Frozen: " + this.d.getName();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
