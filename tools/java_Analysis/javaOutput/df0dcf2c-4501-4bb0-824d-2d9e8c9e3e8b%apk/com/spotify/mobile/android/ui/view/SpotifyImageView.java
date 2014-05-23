package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.google.common.base.i;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.m;
import com.spotify.mobile.android.util.StatefulImageView;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;
import com.squareup.picasso.aj;

public class SpotifyImageView extends StatefulImageView
{
  private int a;
  private Uri b;
  private Uri c;
  private boolean d;
  private aj e = new SpotifyImageView.1(this);

  public SpotifyImageView(Context paramContext)
  {
    super(paramContext);
  }

  public SpotifyImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramAttributeSet);
  }

  public SpotifyImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramAttributeSet);
  }

  private void a(AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = getContext().obtainStyledAttributes(paramAttributeSet, m.I);
    this.d = localTypedArray.getBoolean(0, false);
    localTypedArray.recycle();
  }

  public final void a(int paramInt)
  {
    this.a = paramInt;
  }

  public final void a(Uri paramUri)
  {
    a(paramUri, null);
  }

  public final void a(Uri paramUri1, Uri paramUri2)
  {
    boolean bool1 = true;
    boolean bool2;
    if (this.a != 0)
    {
      bool2 = bool1;
      i.b(bool2, "A default drawable has not been set yet!");
      if ((this.b == null) || (!this.b.equals(paramUri1)))
        break label48;
    }
    while (true)
    {
      if (!bool1)
        break label53;
      return;
      bool2 = false;
      break;
      label48: bool1 = false;
    }
    label53: this.b = paramUri1;
    this.c = paramUri2;
    if (Uri.EMPTY.equals(paramUri1))
    {
      setImageResource(this.a);
      return;
    }
    ((dd)c.a(dd.class)).a().a(paramUri1).a(this.a).b(this.a).a(this.e);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.d)
    {
      int i = View.MeasureSpec.getSize(paramInt2);
      Drawable localDrawable = getDrawable();
      if (localDrawable != null)
      {
        int j = localDrawable.getIntrinsicWidth();
        int k = localDrawable.getIntrinsicHeight();
        if (k > 0)
          i = (int)(Math.max(Math.min(j / k, 2.0F), 0.5F) * i);
      }
      paramInt1 = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }
    super.onMeasure(paramInt1, paramInt2);
  }

  public void setImageResource(int paramInt)
  {
    this.b = null;
    super.setImageResource(paramInt);
  }

  public void setImageURI(Uri paramUri)
  {
    throw new UnsupportedOperationException("Do not use the setImageUri for spotify images!");
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.SpotifyImageView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
