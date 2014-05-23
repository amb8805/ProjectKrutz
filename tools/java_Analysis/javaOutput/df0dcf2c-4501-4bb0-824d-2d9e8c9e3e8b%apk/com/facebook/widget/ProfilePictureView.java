package com.facebook.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.facebook.a.c;
import com.facebook.a.d;
import com.facebook.a.h;
import com.facebook.internal.af;
import com.facebook.internal.j;
import com.facebook.internal.o;
import com.facebook.internal.p;
import com.facebook.internal.u;
import java.net.URI;
import java.net.URISyntaxException;

public class ProfilePictureView extends FrameLayout
{
  public static final String a = ProfilePictureView.class.getSimpleName();
  private String b;
  private int c = 0;
  private int d = 0;
  private boolean e = true;
  private Bitmap f;
  private ImageView g;
  private int h = -1;
  private o i;
  private g j;
  private Bitmap k = null;

  public ProfilePictureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
    a(paramAttributeSet);
  }

  public ProfilePictureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
    a(paramAttributeSet);
  }

  private void a(Context paramContext)
  {
    removeAllViews();
    this.g = new ImageView(paramContext);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
    this.g.setLayoutParams(localLayoutParams);
    this.g.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    addView(this.g);
  }

  private void a(Bitmap paramBitmap)
  {
    if ((this.g != null) && (paramBitmap != null))
    {
      this.f = paramBitmap;
      this.g.setImageBitmap(paramBitmap);
    }
  }

  private void a(AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = getContext().obtainStyledAttributes(paramAttributeSet, h.e);
    int m = localTypedArray.getInt(0, -1);
    switch (m)
    {
    default:
      throw new IllegalArgumentException("Must use a predefined preset size");
    case -4:
    case -3:
    case -2:
    case -1:
    }
    this.h = m;
    requestLayout();
    this.e = localTypedArray.getBoolean(1, true);
    localTypedArray.recycle();
  }

  private void a(boolean paramBoolean)
  {
    boolean bool = a();
    if ((this.b == null) || (this.b.length() == 0) || ((this.d == 0) && (this.c == 0)))
      if (this.k == null)
        if (this.e)
        {
          m = d.e;
          a(BitmapFactory.decodeResource(getResources(), m));
        }
    while ((!bool) && (!paramBoolean))
    {
      while (true)
      {
        return;
        int m = d.d;
      }
      a();
      a(Bitmap.createScaledBitmap(this.k, this.d, this.c, false));
      return;
    }
    b(true);
  }

  private boolean a()
  {
    int m = getHeight();
    int n = getWidth();
    if ((n <= 0) || (m <= 0))
      return false;
    int i1 = c(false);
    if (i1 != 0)
      m = i1;
    while (true)
    {
      int i3;
      if (i1 <= m)
      {
        if (this.e);
        for (i3 = i1; ; i3 = 0)
        {
          boolean bool;
          if (i1 == this.d)
          {
            int i4 = this.c;
            bool = false;
            if (i3 == i4);
          }
          else
          {
            bool = true;
          }
          this.d = i1;
          this.c = i3;
          return bool;
        }
      }
      if (this.e);
      for (int i2 = m; ; i2 = 0)
      {
        i1 = i2;
        i3 = m;
        break;
      }
      i1 = n;
    }
  }

  private void b(boolean paramBoolean)
  {
    Context localContext;
    String str;
    int i1;
    int i2;
    try
    {
      localContext = getContext();
      str = this.b;
      int m = this.d;
      int n = this.c;
      af.a(str, "userId");
      i1 = Math.max(m, 0);
      i2 = Math.max(n, 0);
      if ((i1 == 0) && (i2 == 0))
        throw new IllegalArgumentException("Either width or height must be greater than 0");
    }
    catch (URISyntaxException localURISyntaxException)
    {
      localURISyntaxException.toString();
      u.c();
      return;
    }
    Uri.Builder localBuilder = new Uri.Builder().encodedPath(String.format("https://graph.facebook.com/%s/picture", new Object[] { str }));
    if (i2 != 0)
      localBuilder.appendQueryParameter("height", String.valueOf(i2));
    if (i1 != 0)
      localBuilder.appendQueryParameter("width", String.valueOf(i1));
    localBuilder.appendQueryParameter("migration_overrides", "{october_2012:true}");
    o localo = new p(localContext, new URI(localBuilder.toString())).a(paramBoolean).a(this).a(new ProfilePictureView.1(this)).a();
    if (this.i != null)
      j.b(this.i);
    this.i = localo;
    j.a(localo);
  }

  private int c(boolean paramBoolean)
  {
    int m;
    switch (this.h)
    {
    default:
      return 0;
    case -2:
      m = c.i;
    case -3:
    case -4:
    case -1:
    }
    while (true)
    {
      return getResources().getDimensionPixelSize(m);
      m = c.h;
      continue;
      m = c.g;
      continue;
      if (!paramBoolean)
        break;
      m = c.h;
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.i = null;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    a(false);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    int m = View.MeasureSpec.getSize(paramInt2);
    int n = View.MeasureSpec.getSize(paramInt1);
    int i1 = View.MeasureSpec.getMode(paramInt2);
    boolean bool2 = false;
    if (i1 != 1073741824)
    {
      int i3 = localLayoutParams.height;
      bool2 = false;
      if (i3 == -2)
      {
        m = c(bool1);
        paramInt2 = View.MeasureSpec.makeMeasureSpec(m, 1073741824);
        bool2 = bool1;
      }
    }
    int i2;
    if ((View.MeasureSpec.getMode(paramInt1) != 1073741824) && (localLayoutParams.width == -2))
    {
      i2 = c(bool1);
      paramInt1 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
    }
    while (true)
    {
      if (bool1)
      {
        setMeasuredDimension(i2, m);
        measureChildren(paramInt1, paramInt2);
        return;
      }
      super.onMeasure(paramInt1, paramInt2);
      return;
      bool1 = bool2;
      i2 = n;
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (paramParcelable.getClass() != Bundle.class)
      super.onRestoreInstanceState(paramParcelable);
    Bundle localBundle;
    do
    {
      return;
      localBundle = (Bundle)paramParcelable;
      super.onRestoreInstanceState(localBundle.getParcelable("ProfilePictureView_superState"));
      this.b = localBundle.getString("ProfilePictureView_profileId");
      this.h = localBundle.getInt("ProfilePictureView_presetSize");
      this.e = localBundle.getBoolean("ProfilePictureView_isCropped");
      this.d = localBundle.getInt("ProfilePictureView_width");
      this.c = localBundle.getInt("ProfilePictureView_height");
      a((Bitmap)localBundle.getParcelable("ProfilePictureView_bitmap"));
    }
    while (!localBundle.getBoolean("ProfilePictureView_refresh"));
    a(true);
  }

  protected Parcelable onSaveInstanceState()
  {
    Parcelable localParcelable = super.onSaveInstanceState();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("ProfilePictureView_superState", localParcelable);
    localBundle.putString("ProfilePictureView_profileId", this.b);
    localBundle.putInt("ProfilePictureView_presetSize", this.h);
    localBundle.putBoolean("ProfilePictureView_isCropped", this.e);
    localBundle.putParcelable("ProfilePictureView_bitmap", this.f);
    localBundle.putInt("ProfilePictureView_width", this.d);
    localBundle.putInt("ProfilePictureView_height", this.c);
    if (this.i != null);
    for (boolean bool = true; ; bool = false)
    {
      localBundle.putBoolean("ProfilePictureView_refresh", bool);
      return localBundle;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.widget.ProfilePictureView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
