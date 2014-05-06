package com.twitter.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.twitter.android.fq;

public class OverlayImageView extends ImageView
{
  private Drawable a;

  public OverlayImageView(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null);
  }

  public OverlayImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }

  public OverlayImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet == null)
      return;
    this.a = paramContext.obtainStyledAttributes(paramAttributeSet, fq.OverlayImageView).getDrawable(0);
    setImageDrawable(getDrawable());
  }

  public final void a(Drawable paramDrawable)
  {
    if (this.a != paramDrawable)
      this.a = paramDrawable;
  }

  public void setImageDrawable(Drawable paramDrawable)
  {
    Drawable localDrawable = this.a;
    if ((localDrawable != null) && (paramDrawable != null))
    {
      super.setImageDrawable(new LayerDrawable(new Drawable[] { paramDrawable, localDrawable }));
      return;
    }
    super.setImageDrawable(paramDrawable);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.OverlayImageView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
