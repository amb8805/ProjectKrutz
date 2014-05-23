package eu.janmuller.android.simplecropimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

abstract class ImageViewTouchBase extends ImageView
{
  static final float SCALE_RATE = 1.25F;
  private static final String TAG = "ImageViewTouchBase";
  protected Matrix mBaseMatrix = new Matrix();
  protected final RotateBitmap mBitmapDisplayed = new RotateBitmap(null);
  int mBottom;
  private final Matrix mDisplayMatrix = new Matrix();
  protected Handler mHandler = new Handler();
  int mLeft;
  private final float[] mMatrixValues = new float[9];
  float mMaxZoom;
  private Runnable mOnLayoutRunnable = null;
  private ImageViewTouchBase.Recycler mRecycler;
  int mRight;
  protected Matrix mSuppMatrix = new Matrix();
  int mThisHeight = -1;
  int mThisWidth = -1;
  int mTop;

  public ImageViewTouchBase(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public ImageViewTouchBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  private void getProperBaseMatrix(RotateBitmap paramRotateBitmap, Matrix paramMatrix)
  {
    float f1 = getWidth();
    float f2 = getHeight();
    float f3 = paramRotateBitmap.getWidth();
    float f4 = paramRotateBitmap.getHeight();
    paramRotateBitmap.getRotation();
    paramMatrix.reset();
    float f5 = Math.min(Math.min(f1 / f3, 2.0F), Math.min(f2 / f4, 2.0F));
    paramMatrix.postConcat(paramRotateBitmap.getRotateMatrix());
    paramMatrix.postScale(f5, f5);
    paramMatrix.postTranslate((f1 - f3 * f5) / 2.0F, (f2 - f4 * f5) / 2.0F);
  }

  private void init()
  {
    setScaleType(ImageView.ScaleType.MATRIX);
  }

  private void setImageBitmap(Bitmap paramBitmap, int paramInt)
  {
    super.setImageBitmap(paramBitmap);
    Drawable localDrawable = getDrawable();
    if (localDrawable != null)
      localDrawable.setDither(true);
    Bitmap localBitmap = this.mBitmapDisplayed.getBitmap();
    this.mBitmapDisplayed.setBitmap(paramBitmap);
    this.mBitmapDisplayed.setRotation(paramInt);
    if ((localBitmap != null) && (localBitmap != paramBitmap) && (this.mRecycler != null))
      this.mRecycler.recycle(localBitmap);
  }

  protected void center(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.mBitmapDisplayed.getBitmap() == null)
      return;
    Matrix localMatrix = getImageViewMatrix();
    RectF localRectF = new RectF(0.0F, 0.0F, this.mBitmapDisplayed.getBitmap().getWidth(), this.mBitmapDisplayed.getBitmap().getHeight());
    localMatrix.mapRect(localRectF);
    float f1 = localRectF.height();
    float f2 = localRectF.width();
    float f3 = 0.0F;
    int j;
    float f4;
    int i;
    if (paramBoolean2)
    {
      j = getHeight();
      if (f1 < j)
        f3 = (j - f1) / 2.0F - localRectF.top;
    }
    else
    {
      f4 = 0.0F;
      if (paramBoolean1)
      {
        i = getWidth();
        if (f2 >= i)
          break label219;
        f4 = (i - f2) / 2.0F - localRectF.left;
      }
    }
    while (true)
    {
      postTranslate(f4, f3);
      setImageMatrix(getImageViewMatrix());
      return;
      if (localRectF.top > 0.0F)
      {
        f3 = -localRectF.top;
        break;
      }
      boolean bool2 = localRectF.bottom < j;
      f3 = 0.0F;
      if (!bool2)
        break;
      f3 = getHeight() - localRectF.bottom;
      break;
      label219: if (localRectF.left > 0.0F)
      {
        f4 = -localRectF.left;
      }
      else
      {
        boolean bool1 = localRectF.right < i;
        f4 = 0.0F;
        if (bool1)
          f4 = i - localRectF.right;
      }
    }
  }

  public void clear()
  {
    setImageBitmapResetBase(null, true);
  }

  protected Matrix getImageViewMatrix()
  {
    this.mDisplayMatrix.set(this.mBaseMatrix);
    this.mDisplayMatrix.postConcat(this.mSuppMatrix);
    return this.mDisplayMatrix;
  }

  protected float getScale()
  {
    return getScale(this.mSuppMatrix);
  }

  protected float getScale(Matrix paramMatrix)
  {
    return getValue(paramMatrix, 0);
  }

  protected float getValue(Matrix paramMatrix, int paramInt)
  {
    paramMatrix.getValues(this.mMatrixValues);
    return this.mMatrixValues[paramInt];
  }

  protected float maxZoom()
  {
    if (this.mBitmapDisplayed.getBitmap() == null)
      return 1.0F;
    return 4.0F * Math.max(this.mBitmapDisplayed.getWidth() / this.mThisWidth, this.mBitmapDisplayed.getHeight() / this.mThisHeight);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (getScale() > 1.0F))
    {
      zoomTo(1.0F);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.mLeft = paramInt1;
    this.mRight = paramInt3;
    this.mTop = paramInt2;
    this.mBottom = paramInt4;
    this.mThisWidth = (paramInt3 - paramInt1);
    this.mThisHeight = (paramInt4 - paramInt2);
    Runnable localRunnable = this.mOnLayoutRunnable;
    if (localRunnable != null)
    {
      this.mOnLayoutRunnable = null;
      localRunnable.run();
    }
    if (this.mBitmapDisplayed.getBitmap() != null)
    {
      getProperBaseMatrix(this.mBitmapDisplayed, this.mBaseMatrix);
      setImageMatrix(getImageViewMatrix());
    }
  }

  protected void panBy(float paramFloat1, float paramFloat2)
  {
    postTranslate(paramFloat1, paramFloat2);
    setImageMatrix(getImageViewMatrix());
  }

  protected void postTranslate(float paramFloat1, float paramFloat2)
  {
    this.mSuppMatrix.postTranslate(paramFloat1, paramFloat2);
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    setImageBitmap(paramBitmap, 0);
  }

  public void setImageBitmapResetBase(Bitmap paramBitmap, boolean paramBoolean)
  {
    setImageRotateBitmapResetBase(new RotateBitmap(paramBitmap), paramBoolean);
  }

  public void setImageRotateBitmapResetBase(RotateBitmap paramRotateBitmap, boolean paramBoolean)
  {
    if (getWidth() <= 0)
    {
      this.mOnLayoutRunnable = new ImageViewTouchBase.1(this, paramRotateBitmap, paramBoolean);
      return;
    }
    if (paramRotateBitmap.getBitmap() != null)
    {
      getProperBaseMatrix(paramRotateBitmap, this.mBaseMatrix);
      setImageBitmap(paramRotateBitmap.getBitmap(), paramRotateBitmap.getRotation());
    }
    while (true)
    {
      if (paramBoolean)
        this.mSuppMatrix.reset();
      setImageMatrix(getImageViewMatrix());
      this.mMaxZoom = maxZoom();
      return;
      this.mBaseMatrix.reset();
      setImageBitmap(null);
    }
  }

  public void setRecycler(ImageViewTouchBase.Recycler paramRecycler)
  {
    this.mRecycler = paramRecycler;
  }

  protected void zoomIn()
  {
    zoomIn(1.25F);
  }

  protected void zoomIn(float paramFloat)
  {
    if (getScale() >= this.mMaxZoom);
    while (this.mBitmapDisplayed.getBitmap() == null)
      return;
    float f1 = getWidth() / 2.0F;
    float f2 = getHeight() / 2.0F;
    this.mSuppMatrix.postScale(paramFloat, paramFloat, f1, f2);
    setImageMatrix(getImageViewMatrix());
  }

  protected void zoomOut()
  {
    zoomOut(1.25F);
  }

  protected void zoomOut(float paramFloat)
  {
    if (this.mBitmapDisplayed.getBitmap() == null)
      return;
    float f1 = getWidth() / 2.0F;
    float f2 = getHeight() / 2.0F;
    Matrix localMatrix = new Matrix(this.mSuppMatrix);
    localMatrix.postScale(1.0F / paramFloat, 1.0F / paramFloat, f1, f2);
    if (getScale(localMatrix) < 1.0F)
      this.mSuppMatrix.setScale(1.0F, 1.0F, f1, f2);
    while (true)
    {
      setImageMatrix(getImageViewMatrix());
      center(true, true);
      return;
      this.mSuppMatrix.postScale(1.0F / paramFloat, 1.0F / paramFloat, f1, f2);
    }
  }

  protected void zoomTo(float paramFloat)
  {
    zoomTo(paramFloat, getWidth() / 2.0F, getHeight() / 2.0F);
  }

  protected void zoomTo(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 > this.mMaxZoom)
      paramFloat1 = this.mMaxZoom;
    float f = paramFloat1 / getScale();
    this.mSuppMatrix.postScale(f, f, paramFloat2, paramFloat3);
    setImageMatrix(getImageViewMatrix());
    center(true, true);
  }

  protected void zoomTo(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f1 = (paramFloat1 - getScale()) / paramFloat4;
    float f2 = getScale();
    long l = System.currentTimeMillis();
    this.mHandler.post(new ImageViewTouchBase.2(this, paramFloat4, l, f2, f1, paramFloat2, paramFloat3));
  }
}

/* Location:
 * Qualified Name:     eu.janmuller.android.simplecropimage.ImageViewTouchBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
