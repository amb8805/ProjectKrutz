package com.spotify.mobile.android.spotlets.artist.view.headers;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.spotlets.artist.adapters.c;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ArtistInfo;
import com.spotify.mobile.android.spotlets.artist.view.GalleryViewPager;
import com.spotify.mobile.android.spotlets.artist.view.ImageViewWithFaceDetection;
import com.spotify.mobile.android.spotlets.artist.view.PageIndicator;
import com.spotify.mobile.android.spotlets.artist.view.SnappingListView;
import com.spotify.mobile.android.spotlets.artist.view.e;
import com.spotify.mobile.android.spotlets.artist.view.f;
import com.spotify.mobile.android.spotlets.artist.view.g;
import com.spotify.mobile.android.util.ac;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.ds;
import com.spotify.mobile.android.util.dy;
import java.util.List;

public class HeaderViewGallery extends FrameLayout
  implements f, g, a
{
  private GalleryViewPager a;
  private TextView b;
  private ViewGroup c;
  private b d;
  private int e = 0;
  private int f = 0;
  private PageIndicator g;
  private boolean h;
  private ImageView i;
  private boolean j = true;
  private boolean k = true;

  public HeaderViewGallery(Context paramContext)
  {
    super(paramContext);
    e();
  }

  public HeaderViewGallery(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    e();
  }

  public static HeaderViewGallery a(Context paramContext, ArtistModel.ArtistInfo paramArtistInfo)
  {
    HeaderViewGallery localHeaderViewGallery = new HeaderViewGallery(paramContext);
    localHeaderViewGallery.a(paramArtistInfo);
    return localHeaderViewGallery;
  }

  private void a(ImageViewWithFaceDetection paramImageViewWithFaceDetection)
  {
    if (!this.k)
      return;
    float f1 = paramImageViewWithFaceDetection.getMeasuredHeight();
    float f2 = paramImageViewWithFaceDetection.getMeasuredHeight() - this.f;
    float f3 = this.f - (f1 - f2) / 2.0F;
    float f6;
    float f4;
    if ((paramImageViewWithFaceDetection.getDrawable() instanceof BitmapDrawable))
    {
      float f5 = paramImageViewWithFaceDetection.getDrawable().getIntrinsicWidth();
      f6 = paramImageViewWithFaceDetection.getDrawable().getIntrinsicHeight() * (paramImageViewWithFaceDetection.getMeasuredWidth() / f5);
      if (f6 < f2)
      {
        boolean bool = f3 < 0.0F;
        f4 = 0.0F;
        if (!bool)
          break label149;
      }
    }
    while (true)
    {
      paramImageViewWithFaceDetection.offsetTopAndBottom((int)(f4 - paramImageViewWithFaceDetection.getTop()));
      return;
      f4 = f3 + Math.max(Math.min(f6 / 2.0F - paramImageViewWithFaceDetection.b(), (f6 - f2) / 2.0F), -(f6 - f2) / 2.0F);
      continue;
      label149: f4 = f3;
    }
  }

  private void e()
  {
    LayoutInflater.from(getContext()).inflate(2130903199, this);
    this.c = ((ViewGroup)findViewById(2131362535));
    this.a = ((GalleryViewPager)findViewById(2131362363));
    this.g = ((PageIndicator)findViewById(2131362537));
    this.b = ((TextView)findViewById(2131362314));
    this.i = ((ImageView)findViewById(2131362536));
    this.g.a(this.a);
    this.a.a(new HeaderViewGallery.1(this));
    this.a.a(new HeaderViewGallery.2(this));
    if (ds.b(getContext()))
      this.g.setVisibility(0);
  }

  private void f()
  {
    for (int m = 0; m < this.a.getChildCount(); m++)
    {
      View localView = this.a.getChildAt(m);
      if ((localView instanceof ImageViewWithFaceDetection))
        a((ImageViewWithFaceDetection)localView);
    }
  }

  public final void a()
  {
    this.k = false;
  }

  public final void a(int paramInt)
  {
    this.a.a(paramInt);
  }

  public final <T extends View,  extends e> void a(T paramT)
  {
    a((ImageViewWithFaceDetection)paramT);
  }

  public final void a(ArtistModel.ArtistInfo paramArtistInfo)
  {
    if (paramArtistInfo.portraits.isEmpty())
    {
      this.a.setVisibility(8);
      this.i.setVisibility(0);
    }
    while (true)
    {
      this.b.setText(paramArtistInfo.name);
      return;
      this.a.setVisibility(0);
      this.i.setVisibility(8);
      this.a.a(new c(getContext(), paramArtistInfo.portraits, this));
    }
  }

  public final void a(SnappingListView paramSnappingListView)
  {
    boolean bool = true;
    if ((paramSnappingListView == null) || (paramSnappingListView.getChildAt(0) == null))
      return;
    int i1;
    if ((paramSnappingListView.getFirstVisiblePosition() == 0) && (paramSnappingListView.getChildAt(0).getTop() == 0))
      if ((!this.j) && (this.a.getVisibility() == 0))
      {
        i1 = bool;
        if (i1 != 0)
        {
          PageIndicator localPageIndicator = this.g;
          localPageIndicator.clearAnimation();
          localPageIndicator.setVisibility(0);
          localPageIndicator.startAnimation(AnimationUtils.loadAnimation(localPageIndicator.getContext(), 2130968592));
        }
        this.h = bool;
      }
    label216: 
    while (true)
    {
      this.f = (-paramSnappingListView.getChildAt(0).getTop());
      int m = -paramSnappingListView.getChildAt(0).getTop() / 2;
      int n = m - this.e;
      this.c.offsetTopAndBottom(m - this.c.getTop());
      if (ac.a)
        this.c.invalidate();
      this.e = (n + this.e);
      f();
      return;
      i1 = 0;
      break;
      this.j = false;
      this.h = false;
      if (this.g.getVisibility() == 0);
      while (true)
      {
        if (!bool)
          break label216;
        dy.a(this.g);
        break;
        bool = false;
      }
    }
  }

  public final void a(b paramb)
  {
    cc.b();
    this.d = paramb;
  }

  public final int b()
  {
    return this.a.b();
  }

  public final void c()
  {
    this.b.setVisibility(4);
  }

  public final boolean d()
  {
    return this.h;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.c.offsetTopAndBottom(this.e);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (ds.b(getContext()))
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int m = getDefaultSize(getSuggestedMinimumWidth(), paramInt1);
    int n = ((View)getParent().getParent()).getMeasuredHeight();
    if (n == 0)
      n = View.MeasureSpec.getSize(paramInt2);
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(m, 1073741824), View.MeasureSpec.makeMeasureSpec(n, 1073741824));
    setMeasuredDimension(m, n);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.headers.HeaderViewGallery
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
