package com.spotify.mobile.android.spotlets.artist.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.spotify.mobile.android.util.TouchLifecycle;
import com.spotify.mobile.android.util.dn;

public class GalleryViewPager extends ViewPager
{
  private c a;
  private b b;
  private TouchLifecycle c;
  private float d;
  private final dn e = new GalleryViewPager.1(this);

  public GalleryViewPager(Context paramContext)
  {
    super(paramContext);
    f();
  }

  public GalleryViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    f();
  }

  private void f()
  {
    this.d = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    this.c = new TouchLifecycle(this.e);
  }

  public final void a(b paramb)
  {
    this.b = paramb;
  }

  public final void a(c paramc)
  {
    this.a = paramc;
  }

  @SuppressLint({"WrongCall"})
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.b != null)
      this.b.a();
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.c.a(paramMotionEvent);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.GalleryViewPager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
