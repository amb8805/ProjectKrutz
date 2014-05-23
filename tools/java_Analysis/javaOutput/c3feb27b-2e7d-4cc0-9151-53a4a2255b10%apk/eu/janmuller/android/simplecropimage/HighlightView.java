package eu.janmuller.android.simplecropimage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.view.View;

class HighlightView
{
  public static final int GROW_BOTTOM_EDGE = 16;
  public static final int GROW_LEFT_EDGE = 2;
  public static final int GROW_NONE = 1;
  public static final int GROW_RIGHT_EDGE = 4;
  public static final int GROW_TOP_EDGE = 8;
  public static final int MOVE = 32;
  private static final String TAG = "HighlightView";
  private boolean mCircle = false;
  View mContext;
  private Drawable mCornerResize;
  private Bitmap mCornerResizeBitmap;
  RectF mCropRect;
  Rect mDrawRect;
  private final Paint mFocusPaint = new Paint();
  boolean mHidden;
  private RectF mImageRect;
  private float mInitialAspectRatio;
  boolean mIsFocused;
  private boolean mMaintainAspectRatio = false;
  Matrix mMatrix;
  private HighlightView.ModifyMode mMode = HighlightView.ModifyMode.None;
  private final Paint mNoFocusPaint = new Paint();
  private Drawable mResizeDrawableDiagonal;
  private Drawable mResizeDrawableHeight;
  private Drawable mResizeDrawableWidth;

  public HighlightView(View paramView)
  {
    this.mContext = paramView;
  }

  private Rect computeLayout()
  {
    RectF localRectF = new RectF(this.mCropRect.left, this.mCropRect.top, this.mCropRect.right, this.mCropRect.bottom);
    this.mMatrix.mapRect(localRectF);
    return new Rect(Math.round(localRectF.left), Math.round(localRectF.top), Math.round(localRectF.right), Math.round(localRectF.bottom));
  }

  private void init()
  {
    Resources localResources = this.mContext.getResources();
    this.mResizeDrawableWidth = localResources.getDrawable(2130837630);
    this.mResizeDrawableHeight = localResources.getDrawable(2130837629);
    this.mResizeDrawableDiagonal = localResources.getDrawable(2130837652);
    this.mCornerResize = localResources.getDrawable(2130837667);
    this.mCornerResizeBitmap = BitmapFactory.decodeResource(this.mContext.getResources(), 2130837667);
  }

  protected void draw(Canvas paramCanvas)
  {
    if (this.mHidden);
    Path localPath;
    do
    {
      return;
      localPath = new Path();
    }
    while (!hasFocus());
    Rect localRect1 = new Rect();
    this.mContext.getDrawingRect(localRect1);
    if (this.mCircle)
    {
      paramCanvas.save();
      float f1 = this.mDrawRect.width();
      float f2 = this.mDrawRect.height();
      localPath.addCircle(this.mDrawRect.left + f1 / 2.0F, this.mDrawRect.top + f2 / 2.0F, f1 / 2.0F, Path.Direction.CW);
      paramCanvas.clipPath(localPath, Region.Op.DIFFERENCE);
      if (hasFocus());
      for (Paint localPaint5 = this.mFocusPaint; ; localPaint5 = this.mNoFocusPaint)
      {
        paramCanvas.drawRect(localRect1, localPaint5);
        paramCanvas.restore();
        if (!this.mCircle)
          break;
        int i6 = this.mResizeDrawableDiagonal.getIntrinsicWidth();
        int i7 = this.mResizeDrawableDiagonal.getIntrinsicHeight();
        int i8 = (int)Math.round(Math.cos(0.7853981633974483D) * (this.mDrawRect.width() / 2.0D));
        int i9 = i8 + (this.mDrawRect.left + this.mDrawRect.width() / 2) - i6 / 2;
        int i10 = this.mDrawRect.top + this.mDrawRect.height() / 2 - i8 - i7 / 2;
        this.mResizeDrawableDiagonal.setBounds(i9, i10, i9 + this.mResizeDrawableDiagonal.getIntrinsicWidth(), i10 + this.mResizeDrawableDiagonal.getIntrinsicHeight());
        this.mResizeDrawableDiagonal.draw(paramCanvas);
        return;
      }
    }
    Rect localRect2 = new Rect(localRect1.left, localRect1.top, localRect1.right, this.mDrawRect.top);
    Paint localPaint4;
    label351: Paint localPaint3;
    label416: Paint localPaint2;
    label483: Rect localRect5;
    if ((localRect2.width() > 0) && (localRect2.height() > 0))
    {
      if (hasFocus())
      {
        localPaint4 = this.mFocusPaint;
        paramCanvas.drawRect(localRect2, localPaint4);
      }
    }
    else
    {
      Rect localRect3 = new Rect(localRect1.left, this.mDrawRect.bottom, localRect1.right, localRect1.bottom);
      if ((localRect3.width() > 0) && (localRect3.height() > 0))
      {
        if (!hasFocus())
          break label588;
        localPaint3 = this.mFocusPaint;
        paramCanvas.drawRect(localRect3, localPaint3);
      }
      Rect localRect4 = new Rect(localRect1.left, localRect2.bottom, this.mDrawRect.left, localRect3.top);
      if ((localRect4.width() > 0) && (localRect4.height() > 0))
      {
        if (!hasFocus())
          break label597;
        localPaint2 = this.mFocusPaint;
        paramCanvas.drawRect(localRect4, localPaint2);
      }
      localRect5 = new Rect(this.mDrawRect.right, localRect2.bottom, localRect1.right, localRect3.top);
      if ((localRect5.width() > 0) && (localRect5.height() > 0))
        if (!hasFocus())
          break label606;
    }
    label588: label597: label606: for (Paint localPaint1 = this.mFocusPaint; ; localPaint1 = this.mNoFocusPaint)
    {
      paramCanvas.drawRect(localRect5, localPaint1);
      localPath.addRect(new RectF(this.mDrawRect), Path.Direction.CW);
      break;
      localPaint4 = this.mNoFocusPaint;
      break label351;
      localPaint3 = this.mNoFocusPaint;
      break label416;
      localPaint2 = this.mNoFocusPaint;
      break label483;
    }
    int i = 1 + this.mDrawRect.left;
    int j = 1 + this.mDrawRect.right;
    int k = 4 + this.mDrawRect.top;
    int m = 3 + this.mDrawRect.bottom;
    int n = this.mResizeDrawableWidth.getIntrinsicWidth() / 2;
    int i1 = this.mResizeDrawableWidth.getIntrinsicHeight() / 2;
    int i2 = this.mResizeDrawableHeight.getIntrinsicHeight() / 2;
    int i3 = this.mResizeDrawableHeight.getIntrinsicWidth() / 2;
    int i4 = this.mDrawRect.left + (this.mDrawRect.right - this.mDrawRect.left) / 2;
    int i5 = this.mDrawRect.top + (this.mDrawRect.bottom - this.mDrawRect.top) / 2;
    this.mResizeDrawableWidth.setBounds(i - n, i5 - i1, i + n, i5 + i1);
    this.mResizeDrawableWidth.draw(paramCanvas);
    this.mResizeDrawableWidth.setBounds(j - n, i5 - i1, j + n, i5 + i1);
    this.mResizeDrawableWidth.draw(paramCanvas);
    this.mResizeDrawableHeight.setBounds(i4 - i3, k - i2, i4 + i3, k + i2);
    this.mResizeDrawableHeight.draw(paramCanvas);
    this.mResizeDrawableHeight.setBounds(i4 - i3, m - i2, i4 + i3, m + i2);
    this.mResizeDrawableHeight.draw(paramCanvas);
    paramCanvas.drawBitmap(this.mCornerResizeBitmap, j - i3, m - i3, null);
  }

  public Rect getCropRect()
  {
    return new Rect((int)this.mCropRect.left, (int)this.mCropRect.top, (int)this.mCropRect.right, (int)this.mCropRect.bottom);
  }

  public int getHit(float paramFloat1, float paramFloat2)
  {
    Rect localRect = computeLayout();
    int i = 1;
    if (this.mCircle)
    {
      float f1 = paramFloat1 - localRect.centerX();
      float f2 = paramFloat2 - localRect.centerY();
      int m = (int)Math.sqrt(f1 * f1 + f2 * f2);
      int n = this.mDrawRect.width() / 2;
      if (Math.abs(m - n) <= 20.0F)
      {
        if (Math.abs(f2) > Math.abs(f1))
        {
          if (f2 < 0.0F)
          {
            i = 8;
            return i;
          }
          return 16;
        }
        if (f1 < 0.0F)
          return 2;
        return 4;
      }
      if (m < n)
        return 32;
      return 1;
    }
    int j;
    if ((paramFloat2 >= localRect.top - 20.0F) && (paramFloat2 < 20.0F + localRect.bottom))
    {
      j = 1;
      label163: if ((paramFloat1 < localRect.left - 20.0F) || (paramFloat1 >= 20.0F + localRect.right))
        break label334;
    }
    label334: for (int k = 1; ; k = 0)
    {
      if ((Math.abs(localRect.left - paramFloat1) < 20.0F) && (j != 0))
        i |= 2;
      if ((Math.abs(localRect.right - paramFloat1) < 20.0F) && (j != 0))
        i |= 4;
      if ((Math.abs(localRect.top - paramFloat2) < 20.0F) && (k != 0))
        i |= 8;
      if ((Math.abs(localRect.bottom - paramFloat2) < 20.0F) && (k != 0))
        i |= 16;
      if ((i != 1) || (!localRect.contains((int)paramFloat1, (int)paramFloat2)))
        break;
      return 32;
      j = 0;
      break label163;
    }
  }

  public HighlightView.ModifyMode getMode()
  {
    return this.mMode;
  }

  void growBy(float paramFloat1, float paramFloat2)
  {
    float f = 25.0F;
    RectF localRectF;
    if (this.mMaintainAspectRatio)
    {
      if (paramFloat1 != 0.0F)
        paramFloat2 = paramFloat1 / this.mInitialAspectRatio;
    }
    else
    {
      localRectF = new RectF(this.mCropRect);
      if ((paramFloat1 > 0.0F) && (localRectF.width() + 2.0F * paramFloat1 > this.mImageRect.width()))
      {
        paramFloat1 = (this.mImageRect.width() - localRectF.width()) / 2.0F;
        if (this.mMaintainAspectRatio)
          paramFloat2 = paramFloat1 / this.mInitialAspectRatio;
      }
      if ((paramFloat2 > 0.0F) && (localRectF.height() + 2.0F * paramFloat2 > this.mImageRect.height()))
      {
        paramFloat2 = (this.mImageRect.height() - localRectF.height()) / 2.0F;
        if (this.mMaintainAspectRatio)
          paramFloat1 = paramFloat2 * this.mInitialAspectRatio;
      }
      localRectF.inset(-paramFloat1, -paramFloat2);
      if (localRectF.width() < f)
        localRectF.inset(-(f - localRectF.width()) / 2.0F, 0.0F);
      if (this.mMaintainAspectRatio)
        f /= this.mInitialAspectRatio;
      if (localRectF.height() < f)
        localRectF.inset(0.0F, -(f - localRectF.height()) / 2.0F);
      if (localRectF.left >= this.mImageRect.left)
        break label335;
      localRectF.offset(this.mImageRect.left - localRectF.left, 0.0F);
      label259: if (localRectF.top >= this.mImageRect.top)
        break label374;
      localRectF.offset(0.0F, this.mImageRect.top - localRectF.top);
    }
    while (true)
    {
      this.mCropRect.set(localRectF);
      this.mDrawRect = computeLayout();
      this.mContext.invalidate();
      return;
      if (paramFloat2 == 0.0F)
        break;
      paramFloat1 = paramFloat2 * this.mInitialAspectRatio;
      break;
      label335: if (localRectF.right <= this.mImageRect.right)
        break label259;
      localRectF.offset(-(localRectF.right - this.mImageRect.right), 0.0F);
      break label259;
      label374: if (localRectF.bottom > this.mImageRect.bottom)
        localRectF.offset(0.0F, -(localRectF.bottom - this.mImageRect.bottom));
    }
  }

  void handleMotion(int paramInt, float paramFloat1, float paramFloat2)
  {
    int i = -1;
    Rect localRect = computeLayout();
    if (paramInt == 1)
      return;
    if (paramInt == 32)
    {
      moveBy(paramFloat1 * (this.mCropRect.width() / localRect.width()), paramFloat2 * (this.mCropRect.height() / localRect.height()));
      return;
    }
    if ((paramInt & 0x6) == 0)
      paramFloat1 = 0.0F;
    if ((paramInt & 0x18) == 0)
      paramFloat2 = 0.0F;
    float f1 = paramFloat1 * (this.mCropRect.width() / localRect.width());
    float f2 = paramFloat2 * (this.mCropRect.height() / localRect.height());
    int j;
    float f3;
    if ((paramInt & 0x2) != 0)
    {
      j = i;
      f3 = f1 * j;
      if ((paramInt & 0x8) == 0)
        break label156;
    }
    while (true)
    {
      growBy(f3, f2 * i);
      return;
      j = 1;
      break;
      label156: i = 1;
    }
  }

  public boolean hasFocus()
  {
    return this.mIsFocused;
  }

  public void invalidate()
  {
    this.mDrawRect = computeLayout();
  }

  void moveBy(float paramFloat1, float paramFloat2)
  {
    Rect localRect = new Rect(this.mDrawRect);
    this.mCropRect.offset(paramFloat1, paramFloat2);
    this.mCropRect.offset(Math.max(0.0F, this.mImageRect.left - this.mCropRect.left), Math.max(0.0F, this.mImageRect.top - this.mCropRect.top));
    this.mCropRect.offset(Math.min(0.0F, this.mImageRect.right - this.mCropRect.right), Math.min(0.0F, this.mImageRect.bottom - this.mCropRect.bottom));
    this.mDrawRect = computeLayout();
    localRect.union(this.mDrawRect);
    localRect.inset(-10, -10);
    this.mContext.invalidate(localRect);
  }

  public void setFocus(boolean paramBoolean)
  {
    this.mIsFocused = paramBoolean;
  }

  public void setHidden(boolean paramBoolean)
  {
    this.mHidden = paramBoolean;
  }

  public void setMode(HighlightView.ModifyMode paramModifyMode)
  {
    if (paramModifyMode != this.mMode)
    {
      this.mMode = paramModifyMode;
      this.mContext.invalidate();
    }
  }

  public void setup(Matrix paramMatrix, Rect paramRect, RectF paramRectF, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
      paramBoolean2 = true;
    this.mMatrix = new Matrix(paramMatrix);
    this.mCropRect = paramRectF;
    this.mImageRect = new RectF(paramRect);
    this.mMaintainAspectRatio = paramBoolean2;
    this.mCircle = paramBoolean1;
    this.mInitialAspectRatio = (this.mCropRect.width() / this.mCropRect.height());
    this.mDrawRect = computeLayout();
    this.mFocusPaint.setARGB(150, 50, 50, 50);
    this.mNoFocusPaint.setARGB(150, 50, 50, 50);
    this.mMode = HighlightView.ModifyMode.None;
    init();
  }
}

/* Location:
 * Qualified Name:     eu.janmuller.android.simplecropimage.HighlightView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
