package com.squareup.picasso;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

final class i
  implements ViewTreeObserver.OnPreDrawListener
{
  final ae a;
  final WeakReference<ImageView> b;
  f c;

  i(ae paramae, ImageView paramImageView, f paramf)
  {
    this.a = paramae;
    this.b = new WeakReference(paramImageView);
    this.c = paramf;
    paramImageView.getViewTreeObserver().addOnPreDrawListener(this);
  }

  public final boolean onPreDraw()
  {
    ImageView localImageView = (ImageView)this.b.get();
    if (localImageView == null);
    ViewTreeObserver localViewTreeObserver;
    int i;
    int j;
    do
    {
      do
      {
        return true;
        localViewTreeObserver = localImageView.getViewTreeObserver();
      }
      while (!localViewTreeObserver.isAlive());
      i = localImageView.getMeasuredWidth();
      j = localImageView.getMeasuredHeight();
    }
    while ((i <= 0) || (j <= 0));
    localViewTreeObserver.removeOnPreDrawListener(this);
    this.a.a().b(i, j).a(localImageView, this.c);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
