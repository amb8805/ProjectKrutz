package android.support.v4.print;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import java.io.FileNotFoundException;

public final class PrintHelper
{
  public static final int COLOR_MODE_COLOR = 2;
  public static final int COLOR_MODE_MONOCHROME = 1;
  public static final int SCALE_MODE_FILL = 2;
  public static final int SCALE_MODE_FIT = 1;
  PrintHelper.PrintHelperVersionImpl mImpl;

  public PrintHelper(Context paramContext)
  {
    if (systemSupportsPrint())
    {
      this.mImpl = new PrintHelper.PrintHelperKitkatImpl(paramContext);
      return;
    }
    this.mImpl = new PrintHelper.PrintHelperStubImpl(null);
  }

  public static boolean systemSupportsPrint()
  {
    return Build.VERSION.SDK_INT >= 19;
  }

  public int getColorMode()
  {
    return this.mImpl.getColorMode();
  }

  public int getScaleMode()
  {
    return this.mImpl.getScaleMode();
  }

  public void printBitmap(String paramString, Bitmap paramBitmap)
  {
    this.mImpl.printBitmap(paramString, paramBitmap);
  }

  public void printBitmap(String paramString, Uri paramUri)
    throws FileNotFoundException
  {
    this.mImpl.printBitmap(paramString, paramUri);
  }

  public void setColorMode(int paramInt)
  {
    this.mImpl.setColorMode(paramInt);
  }

  public void setScaleMode(int paramInt)
  {
    this.mImpl.setScaleMode(paramInt);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.print.PrintHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
