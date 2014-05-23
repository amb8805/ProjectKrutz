package android.support.v4.print;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.print.PrintAttributes;
import android.print.PrintAttributes.Builder;
import android.print.PrintAttributes.MediaSize;
import android.print.PrintManager;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class PrintHelperKitkat
{
  public static final int COLOR_MODE_COLOR = 2;
  public static final int COLOR_MODE_MONOCHROME = 1;
  private static final String LOG_TAG = "PrintHelperKitkat";
  private static final int MAX_PRINT_SIZE = 3500;
  public static final int SCALE_MODE_FILL = 2;
  public static final int SCALE_MODE_FIT = 1;
  int mColorMode = 2;
  final Context mContext;
  int mScaleMode = 2;

  PrintHelperKitkat(Context paramContext)
  {
    this.mContext = paramContext;
  }

  private Bitmap loadBitmap(Uri paramUri, BitmapFactory.Options paramOptions)
    throws FileNotFoundException
  {
    if ((paramUri == null) || (this.mContext == null))
      throw new IllegalArgumentException("bad argument to loadBitmap");
    InputStream localInputStream = null;
    try
    {
      localInputStream = this.mContext.getContentResolver().openInputStream(paramUri);
      localBitmap = BitmapFactory.decodeStream(localInputStream, null, paramOptions);
      if (localInputStream != null);
      try
      {
        localInputStream.close();
        return localBitmap;
      }
      catch (IOException localIOException2)
      {
        Log.w("PrintHelperKitkat", "close fail ", localIOException2);
        return localBitmap;
      }
    }
    finally
    {
      Bitmap localBitmap;
      if (localInputStream == null);
    }
    try
    {
      localInputStream.close();
      throw localObject;
    }
    catch (IOException localIOException1)
    {
      while (true)
        Log.w("PrintHelperKitkat", "close fail ", localIOException1);
    }
  }

  private Bitmap loadConstrainedBitmap(Uri paramUri, int paramInt)
    throws FileNotFoundException
  {
    if ((paramInt <= 0) || (paramUri == null) || (this.mContext == null))
      throw new IllegalArgumentException("bad argument to getScaledBitmap");
    BitmapFactory.Options localOptions1 = new BitmapFactory.Options();
    localOptions1.inJustDecodeBounds = true;
    loadBitmap(paramUri, localOptions1);
    int i = localOptions1.outWidth;
    int j = localOptions1.outHeight;
    if ((i <= 0) || (j <= 0));
    int m;
    do
    {
      return null;
      int k = Math.max(i, j);
      m = 1;
      while (k > paramInt)
      {
        k >>>= 1;
        m <<= 1;
      }
    }
    while ((m <= 0) || (Math.min(i, j) / m <= 0));
    BitmapFactory.Options localOptions2 = new BitmapFactory.Options();
    localOptions2.inMutable = true;
    localOptions2.inSampleSize = m;
    return loadBitmap(paramUri, localOptions2);
  }

  public int getColorMode()
  {
    return this.mColorMode;
  }

  public int getScaleMode()
  {
    return this.mScaleMode;
  }

  public void printBitmap(String paramString, Bitmap paramBitmap)
  {
    if (paramBitmap == null)
      return;
    int i = this.mScaleMode;
    PrintManager localPrintManager = (PrintManager)this.mContext.getSystemService("print");
    PrintAttributes.MediaSize localMediaSize = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
    if (paramBitmap.getWidth() > paramBitmap.getHeight())
      localMediaSize = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
    PrintAttributes localPrintAttributes = new PrintAttributes.Builder().setMediaSize(localMediaSize).setColorMode(this.mColorMode).build();
    localPrintManager.print(paramString, new PrintHelperKitkat.1(this, paramString, paramBitmap, i), localPrintAttributes);
  }

  public void printBitmap(String paramString, Uri paramUri)
    throws FileNotFoundException
  {
    printBitmap(paramString, loadConstrainedBitmap(paramUri, 3500));
  }

  public void setColorMode(int paramInt)
  {
    this.mColorMode = paramInt;
  }

  public void setScaleMode(int paramInt)
  {
    this.mScaleMode = paramInt;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.print.PrintHelperKitkat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
