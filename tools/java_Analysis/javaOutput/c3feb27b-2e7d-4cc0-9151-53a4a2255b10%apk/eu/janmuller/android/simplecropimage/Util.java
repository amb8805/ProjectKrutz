package eu.janmuller.android.simplecropimage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Handler;
import android.view.Display;
import android.view.WindowManager;
import java.io.Closeable;

public class Util
{
  private static final String TAG = "db.Util";

  private Util()
  {
  }

  public static void closeSilently(Closeable paramCloseable)
  {
    if (paramCloseable == null)
      return;
    try
    {
      paramCloseable.close();
      return;
    }
    catch (Throwable localThrowable)
    {
    }
  }

  public static BitmapFactory.Options createNativeAllocOptions()
  {
    return new BitmapFactory.Options();
  }

  @SuppressLint({"NewApi"})
  public static int getOrientationInDegree(Activity paramActivity)
  {
    switch (paramActivity.getWindowManager().getDefaultDisplay().getRotation())
    {
    default:
      return 0;
    case 0:
      return 0;
    case 1:
      return 90;
    case 2:
      return 180;
    case 3:
    }
    return 270;
  }

  public static Bitmap rotateImage(Bitmap paramBitmap, float paramFloat)
  {
    Matrix localMatrix = new Matrix();
    localMatrix.postRotate(paramFloat);
    return Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), localMatrix, true);
  }

  public static void startBackgroundJob(MonitoredActivity paramMonitoredActivity, String paramString1, String paramString2, Runnable paramRunnable, Handler paramHandler)
  {
    new Thread(new Util.BackgroundJob(paramMonitoredActivity, paramRunnable, ProgressDialog.show(paramMonitoredActivity, paramString1, paramString2, true, false), paramHandler)).start();
  }

  public static Bitmap transform(Matrix paramMatrix, Bitmap paramBitmap, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = paramBitmap.getWidth() - paramInt1;
    int j = paramBitmap.getHeight() - paramInt2;
    Bitmap localBitmap2;
    if ((!paramBoolean) && ((i < 0) || (j < 0)))
    {
      localBitmap2 = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap2);
      int n = Math.max(0, i / 2);
      int i1 = Math.max(0, j / 2);
      Rect localRect1 = new Rect(n, i1, n + Math.min(paramInt1, paramBitmap.getWidth()), i1 + Math.min(paramInt2, paramBitmap.getHeight()));
      int i2 = (paramInt1 - localRect1.width()) / 2;
      int i3 = (paramInt2 - localRect1.height()) / 2;
      Rect localRect2 = new Rect(i2, i3, paramInt1 - i2, paramInt2 - i3);
      localCanvas.drawBitmap(paramBitmap, localRect1, localRect2, null);
      return localBitmap2;
    }
    float f1 = paramBitmap.getWidth();
    float f2 = paramBitmap.getHeight();
    if (f1 / f2 > paramInt1 / paramInt2)
    {
      float f4 = paramInt2 / f2;
      if ((f4 < 0.9F) || (f4 > 1.0F))
      {
        paramMatrix.setScale(f4, f4);
        label222: if (paramMatrix == null)
          break label344;
      }
    }
    label344: for (Bitmap localBitmap1 = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), paramMatrix, true); ; localBitmap1 = paramBitmap)
    {
      int k = Math.max(0, localBitmap1.getWidth() - paramInt1);
      int m = Math.max(0, localBitmap1.getHeight() - paramInt2);
      localBitmap2 = Bitmap.createBitmap(localBitmap1, k / 2, m / 2, paramInt1, paramInt2);
      if (localBitmap1 == paramBitmap)
        break;
      localBitmap1.recycle();
      return localBitmap2;
      paramMatrix = null;
      break label222;
      float f3 = paramInt1 / f1;
      if ((f3 < 0.9F) || (f3 > 1.0F))
      {
        paramMatrix.setScale(f3, f3);
        break label222;
      }
      paramMatrix = null;
      break label222;
    }
  }
}

/* Location:
 * Qualified Name:     eu.janmuller.android.simplecropimage.Util
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
