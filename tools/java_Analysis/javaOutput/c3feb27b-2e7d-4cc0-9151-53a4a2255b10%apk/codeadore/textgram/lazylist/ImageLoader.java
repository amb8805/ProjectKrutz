package codeadore.textgram.lazylist;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Handler;
import android.widget.ImageView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ImageLoader
{
  ExecutorService executorService;
  FileCache fileCache;
  Handler handler = new Handler();
  private Map<ImageView, String> imageViews = Collections.synchronizedMap(new WeakHashMap());
  MemoryCache memoryCache = new MemoryCache();
  final int stub_id = 2130837657;

  public ImageLoader(Context paramContext)
  {
    this.fileCache = new FileCache(paramContext);
    this.executorService = Executors.newFixedThreadPool(5);
  }

  private Bitmap decodeFile(File paramFile)
  {
    try
    {
      BitmapFactory.Options localOptions1 = new BitmapFactory.Options();
      localOptions1.inJustDecodeBounds = true;
      FileInputStream localFileInputStream1 = new FileInputStream(paramFile);
      BitmapFactory.decodeStream(localFileInputStream1, null, localOptions1);
      localFileInputStream1.close();
      int i = localOptions1.outWidth;
      int j = localOptions1.outHeight;
      int k = 1;
      while (true)
      {
        if ((i / 2 < 100) || (j / 2 < 100))
        {
          BitmapFactory.Options localOptions2 = new BitmapFactory.Options();
          localOptions2.inSampleSize = k;
          FileInputStream localFileInputStream2 = new FileInputStream(paramFile);
          Bitmap localBitmap = BitmapFactory.decodeStream(localFileInputStream2, null, localOptions2);
          localFileInputStream2.close();
          return localBitmap;
        }
        i /= 2;
        j /= 2;
        k *= 2;
      }
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
      return null;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      break label141;
    }
  }

  private Bitmap getBitmap(String paramString)
  {
    File localFile = this.fileCache.getFile(paramString);
    Bitmap localBitmap1 = decodeFile(localFile);
    if (localBitmap1 != null)
      return localBitmap1;
    try
    {
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramString).openConnection();
      localHttpURLConnection.setConnectTimeout(30000);
      localHttpURLConnection.setReadTimeout(30000);
      localHttpURLConnection.setInstanceFollowRedirects(true);
      InputStream localInputStream = localHttpURLConnection.getInputStream();
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
      Utils.CopyStream(localInputStream, localFileOutputStream);
      localFileOutputStream.close();
      localHttpURLConnection.disconnect();
      Bitmap localBitmap2 = decodeFile(localFile);
      return localBitmap2;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
      if ((localThrowable instanceof OutOfMemoryError))
        this.memoryCache.clear();
    }
    return null;
  }

  private void queuePhoto(String paramString, ImageView paramImageView)
  {
    ImageLoader.PhotoToLoad localPhotoToLoad = new ImageLoader.PhotoToLoad(this, paramString, paramImageView);
    this.executorService.submit(new ImageLoader.PhotosLoader(this, localPhotoToLoad));
  }

  public void DisplayImage(String paramString, ImageView paramImageView)
  {
    this.imageViews.put(paramImageView, paramString);
    Bitmap localBitmap = this.memoryCache.get(paramString);
    if (localBitmap != null)
    {
      paramImageView.setImageBitmap(localBitmap);
      return;
    }
    queuePhoto(paramString, paramImageView);
    paramImageView.setImageResource(2130837657);
  }

  public void clearCache()
  {
    this.memoryCache.clear();
    this.fileCache.clear();
  }

  boolean imageViewReused(ImageLoader.PhotoToLoad paramPhotoToLoad)
  {
    String str = (String)this.imageViews.get(paramPhotoToLoad.imageView);
    return (str == null) || (!str.equals(paramPhotoToLoad.url));
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.lazylist.ImageLoader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
