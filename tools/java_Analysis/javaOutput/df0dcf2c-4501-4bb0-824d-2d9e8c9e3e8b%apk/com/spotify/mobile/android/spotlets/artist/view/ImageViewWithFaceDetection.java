package com.spotify.mobile.android.spotlets.artist.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.FaceDetector.Face;
import android.os.AsyncTask.Status;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.google.common.base.Optional;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.spotlets.artist.util.a;
import com.squareup.picasso.aj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ImageViewWithFaceDetection extends ImageView
  implements e, aj
{
  private d a;
  private List<FaceDetector.Face> b = new ArrayList();
  private f c;
  private a d = (a)c.a(ImageViewWithFaceDetection.class, a.class);
  private String e;
  private ImageViewWithFaceDetection.Contents f;

  static
  {
    c.a(ImageViewWithFaceDetection.class, a.class, new a());
  }

  public ImageViewWithFaceDetection(Context paramContext)
  {
    super(paramContext);
  }

  public ImageViewWithFaceDetection(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private void b(Bitmap paramBitmap)
  {
    setScaleType(ImageView.ScaleType.FIT_CENTER);
    setImageBitmap(paramBitmap);
    this.f = ImageViewWithFaceDetection.Contents.b;
    if (this.c != null)
      this.c.a(this);
  }

  public final void a()
  {
    this.c = null;
  }

  public final void a(Bitmap paramBitmap)
  {
    if (this.d.a(this.e).a())
    {
      this.b = ((List)this.d.a(this.e).b());
      b(paramBitmap);
      return;
    }
    if ((this.a != null) && (this.a.getStatus() != AsyncTask.Status.FINISHED))
    {
      this.a.cancel(true);
      this.a = null;
    }
    this.a = new d(this, this.e, paramBitmap, (byte)0);
    this.a.execute(new Void[0]);
  }

  public final void a(Drawable paramDrawable)
  {
    setImageDrawable(paramDrawable);
  }

  public final void a(f paramf)
  {
    this.c = paramf;
  }

  public final void a(String paramString)
  {
    this.e = paramString;
    this.b.clear();
  }

  public final int b()
  {
    if (this.f == ImageViewWithFaceDetection.Contents.a)
      return getMeasuredHeight() / 2;
    Optional localOptional = Optional.d();
    Iterator localIterator = this.b.iterator();
    Object localObject1 = localOptional;
    FaceDetector.Face localFace2;
    if (localIterator.hasNext())
    {
      localFace2 = (FaceDetector.Face)localIterator.next();
      if ((((Optional)localObject1).a()) && (localFace2.eyesDistance() <= ((FaceDetector.Face)((Optional)localObject1).b()).eyesDistance()))
        break label163;
    }
    label163: for (Object localObject2 = Optional.b(localFace2); ; localObject2 = localObject1)
    {
      localObject1 = localObject2;
      break;
      if (!((Optional)localObject1).a())
        return getMeasuredHeight() / 3;
      FaceDetector.Face localFace1 = (FaceDetector.Face)((Optional)localObject1).b();
      PointF localPointF = new PointF();
      localFace1.getMidPoint(localPointF);
      Bitmap localBitmap = ((BitmapDrawable)getDrawable()).getBitmap();
      return (int)(getMeasuredWidth() / localBitmap.getWidth() * localPointF.y);
    }
  }

  public final void b(Drawable paramDrawable)
  {
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass()))
      return false;
    ImageViewWithFaceDetection localImageViewWithFaceDetection = (ImageViewWithFaceDetection)paramObject;
    return com.google.common.base.e.a(this.e, localImageViewWithFaceDetection.e);
  }

  public int hashCode()
  {
    if (this.e != null)
      return this.e.hashCode();
    return 0;
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    setScaleType(ImageView.ScaleType.FIT_CENTER);
    super.setImageBitmap(paramBitmap);
  }

  public void setImageDrawable(Drawable paramDrawable)
  {
    if ((paramDrawable instanceof BitmapDrawable))
      setScaleType(ImageView.ScaleType.FIT_CENTER);
    while (true)
    {
      super.setImageDrawable(paramDrawable);
      return;
      setScaleType(ImageView.ScaleType.CENTER);
    }
  }

  public void setImageResource(int paramInt)
  {
    setScaleType(ImageView.ScaleType.CENTER);
    this.f = ImageViewWithFaceDetection.Contents.a;
    super.setImageResource(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.ImageViewWithFaceDetection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
