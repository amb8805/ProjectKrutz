package eu.janmuller.android.simplecropimage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Parcelable;;
import android.os.StatFs;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@SuppressLint({"NewApi"})
public class CropImage extends MonitoredActivity
{
  public static final String ACTION_INLINE_DATA = "inline-data";
  public static final String ASPECT_X = "aspectX";
  public static final String ASPECT_Y = "aspectY";
  public static final int CANNOT_STAT_ERROR = -2;
  public static final String CIRCLE_CROP = "circleCrop";
  public static final String IMAGE_PATH = "image-path";
  public static final int NO_STORAGE_ERROR = -1;
  public static final String ORIENTATION_IN_DEGREES = "orientation_in_degrees";
  public static final String OUTPUT_X = "outputX";
  public static final String OUTPUT_Y = "outputY";
  public static final String RETURN_DATA = "return-data";
  public static final String RETURN_DATA_AS_BITMAP = "data";
  public static final String SCALE = "scale";
  public static final String SCALE_UP_IF_NEEDED = "scaleUpIfNeeded";
  private static final String TAG = "CropImage";
  final int IMAGE_MAX_SIZE = 1024;
  private int mAspectX;
  private int mAspectY;
  private Bitmap mBitmap;
  private boolean mCircleCrop = false;
  private ContentResolver mContentResolver;
  HighlightView mCrop;
  private final BitmapManager.ThreadSet mDecodingThreads = new BitmapManager.ThreadSet();
  private boolean mDoFaceDetection = true;
  private final Handler mHandler = new Handler();
  private String mImagePath;
  private CropImageView mImageView;
  private Bitmap.CompressFormat mOutputFormat = Bitmap.CompressFormat.JPEG;
  private int mOutputX;
  private int mOutputY;
  Runnable mRunFaceDetection = new CropImage.1(this);
  private Uri mSaveUri = null;
  boolean mSaving;
  private boolean mScale;
  private boolean mScaleUp = true;
  boolean mWaitingToPick;

  public CropImage()
  {
  }

  public static int calculatePicturesRemaining(Activity paramActivity)
  {
    try
    {
      if ("mounted".equals(Environment.getExternalStorageState()));
      String str;
      for (Object localObject = Environment.getExternalStorageDirectory().toString(); ; localObject = str)
      {
        StatFs localStatFs = new StatFs((String)localObject);
        return (int)(localStatFs.getAvailableBlocks() * localStatFs.getBlockSize() / 400000.0F);
        str = paramActivity.getFilesDir().toString();
      }
    }
    catch (Exception localException)
    {
    }
    return -2;
  }

  private Bitmap getBitmap(String paramString)
  {
    localUri = getImageUri(paramString);
    try
    {
      InputStream localInputStream1 = this.mContentResolver.openInputStream(localUri);
      BitmapFactory.Options localOptions1 = new BitmapFactory.Options();
      localOptions1.inJustDecodeBounds = true;
      BitmapFactory.decodeStream(localInputStream1, null, localOptions1);
      localInputStream1.close();
      int i = 1;
      if ((localOptions1.outHeight > 1024) || (localOptions1.outWidth > 1024))
        i = (int)Math.pow(2.0D, (int)Math.round(Math.log(1024.0D / Math.max(localOptions1.outHeight, localOptions1.outWidth)) / Math.log(0.5D)));
      BitmapFactory.Options localOptions2 = new BitmapFactory.Options();
      localOptions2.inSampleSize = i;
      InputStream localInputStream2 = this.mContentResolver.openInputStream(localUri);
      Bitmap localBitmap = BitmapFactory.decodeStream(localInputStream2, null, localOptions2);
      localInputStream2.close();
      return localBitmap;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      Log.e("CropImage", "file " + paramString + " not found");
      return null;
    }
    catch (IOException localIOException)
    {
      while (true)
        Log.e("CropImage", "file " + paramString + " not found");
    }
  }

  private Uri getImageUri(String paramString)
  {
    return Uri.fromFile(new File(paramString));
  }

  private void onSaveClicked()
    throws Exception
  {
    if (this.mSaving);
    Rect localRect1;
    int i;
    int j;
    while (true)
    {
      return;
      if (this.mCrop != null)
      {
        this.mSaving = true;
        localRect1 = this.mCrop.getCropRect();
        i = localRect1.width();
        j = localRect1.height();
        try
        {
          if (this.mCircleCrop);
          for (Bitmap.Config localConfig = Bitmap.Config.ARGB_8888; ; localConfig = Bitmap.Config.RGB_565)
          {
            localBitmap1 = Bitmap.createBitmap(i, j, localConfig);
            localObject1 = localBitmap1;
            if (localObject1 == null)
              break;
            localCanvas1 = new Canvas((Bitmap)localObject1);
            localRect2 = new Rect(0, 0, i, j);
            localCanvas1.drawBitmap(this.mBitmap, localRect1, localRect2, null);
            if (this.mCircleCrop)
            {
              localCanvas2 = new Canvas((Bitmap)localObject1);
              localPath = new Path();
              localPath.addCircle(i / 2.0F, j / 2.0F, i / 2.0F, Path.Direction.CW);
              localCanvas2.clipPath(localPath, Region.Op.DIFFERENCE);
              localCanvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            }
            if ((this.mOutputX != 0) && (this.mOutputY != 0))
            {
              if (!this.mScale)
                break label327;
              localObject3 = localObject1;
              localObject1 = Util.transform(new Matrix(), (Bitmap)localObject1, this.mOutputX, this.mOutputY, this.mScaleUp);
              if (localObject3 != localObject1)
                localObject3.recycle();
            }
            localBundle1 = getIntent().getExtras();
            if ((localBundle1 == null) || ((localBundle1.getParcelable("data") == null) && (!localBundle1.getBoolean("return-data"))))
              break label474;
            localBundle2 = new Bundle();
            localBundle2.putParcelable("data", (android.os.Parcelable)localObject1);
            setResult(-1, new Intent().setAction("inline-data").putExtras(localBundle2));
            finish();
            return;
          }
        }
        catch (Exception localException)
        {
          throw localException;
        }
      }
    }
    Object localObject1;
    while (true)
    {
      Bitmap localBitmap1;
      Canvas localCanvas1;
      Rect localRect2;
      Canvas localCanvas2;
      Path localPath;
      Object localObject3;
      Bundle localBundle1;
      Bundle localBundle2;
      label327: Bitmap localBitmap2 = Bitmap.createBitmap(this.mOutputX, this.mOutputY, Bitmap.Config.RGB_565);
      Canvas localCanvas3 = new Canvas(localBitmap2);
      Rect localRect3 = this.mCrop.getCropRect();
      Rect localRect4 = new Rect(0, 0, this.mOutputX, this.mOutputY);
      int k = (localRect3.width() - localRect4.width()) / 2;
      int m = (localRect3.height() - localRect4.height()) / 2;
      localRect3.inset(Math.max(0, k), Math.max(0, m));
      localRect4.inset(Math.max(0, -k), Math.max(0, -m));
      localCanvas3.drawBitmap(this.mBitmap, localRect3, localRect4, null);
      ((Bitmap)localObject1).recycle();
      localObject1 = localBitmap2;
    }
    label474: Object localObject2 = localObject1;
    String str = getString(2131427438);
    CropImage.7 local7 = new CropImage.7(this, localObject2);
    Util.startBackgroundJob(this, null, str, local7, this.mHandler);
  }

  private void saveOutput(Bitmap paramBitmap)
  {
    OutputStream localOutputStream;
    if (this.mSaveUri != null)
    {
      localOutputStream = null;
      try
      {
        localOutputStream = this.mContentResolver.openOutputStream(this.mSaveUri);
        if (localOutputStream != null)
          paramBitmap.compress(this.mOutputFormat, 90, localOutputStream);
        Util.closeSilently(localOutputStream);
        localBundle = new Bundle();
        localIntent = new Intent(this.mSaveUri.toString());
        localIntent.putExtras(localBundle);
        localIntent.putExtra("image-path", this.mImagePath);
        localIntent.putExtra("orientation_in_degrees", Util.getOrientationInDegree(this));
        setResult(-1, localIntent);
        paramBitmap.recycle();
        finish();
        return;
      }
      catch (IOException localIOException)
      {
        Log.e("CropImage", "Cannot open file: " + this.mSaveUri, localIOException);
        setResult(0);
        finish();
        return;
      }
      finally
      {
        Util.closeSilently(localOutputStream);
      }
    }
    while (true)
    {
      Bundle localBundle;
      Intent localIntent;
      Log.e("CropImage", "not defined image url");
    }
  }

  public static void showStorageToast(Activity paramActivity)
  {
    showStorageToast(paramActivity, calculatePicturesRemaining(paramActivity));
  }

  public static void showStorageToast(Activity paramActivity, int paramInt)
  {
    String str;
    if (paramInt == -1)
      if (Environment.getExternalStorageState().equals("checking"))
        str = paramActivity.getString(2131427439);
    while (true)
    {
      if (str != null)
        Toast.makeText(paramActivity, str, 5000).show();
      return;
      str = paramActivity.getString(2131427440);
      continue;
      str = null;
      if (paramInt < 1)
        str = paramActivity.getString(2131427441);
    }
  }

  private void startFaceDetection()
  {
    if (isFinishing())
      return;
    this.mImageView.setImageBitmapResetBase(this.mBitmap, true);
    Util.startBackgroundJob(this, null, "Please wait…", new CropImage.6(this), this.mHandler);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mContentResolver = getContentResolver();
    requestWindowFeature(1);
    setContentView(2130903077);
    this.mImageView = ((CropImageView)findViewById(2131099691));
    showStorageToast(this);
    Bundle localBundle = getIntent().getExtras();
    if (localBundle != null)
    {
      if (localBundle.getString("circleCrop") != null)
      {
        if (Build.VERSION.SDK_INT > 11)
          this.mImageView.setLayerType(1, null);
        this.mCircleCrop = true;
        this.mAspectX = 1;
        this.mAspectY = 1;
      }
      this.mImagePath = localBundle.getString("image-path");
      this.mSaveUri = getImageUri(this.mImagePath);
      this.mBitmap = getBitmap(this.mImagePath);
      if ((localBundle.containsKey("aspectX")) && ((localBundle.get("aspectX") instanceof Integer)))
      {
        this.mAspectX = localBundle.getInt("aspectX");
        if ((!localBundle.containsKey("aspectY")) || (!(localBundle.get("aspectY") instanceof Integer)))
          break label267;
        this.mAspectY = localBundle.getInt("aspectY");
        this.mOutputX = localBundle.getInt("outputX");
        this.mOutputY = localBundle.getInt("outputY");
        this.mScale = localBundle.getBoolean("scale", true);
        this.mScaleUp = localBundle.getBoolean("scaleUpIfNeeded", true);
      }
    }
    else
    {
      if (this.mBitmap != null)
        break label278;
      Log.d("CropImage", "finish!!!");
      finish();
      return;
    }
    throw new IllegalArgumentException("aspect_x must be integer");
    label267: throw new IllegalArgumentException("aspect_y must be integer");
    label278: getWindow().addFlags(1024);
    findViewById(2131099772).setOnClickListener(new CropImage.2(this));
    findViewById(2131099775).setOnClickListener(new CropImage.3(this));
    findViewById(2131099773).setOnClickListener(new CropImage.4(this));
    findViewById(2131099774).setOnClickListener(new CropImage.5(this));
    startFaceDetection();
  }

  protected void onDestroy()
  {
    super.onDestroy();
    if (this.mBitmap != null)
      this.mBitmap.recycle();
  }

  protected void onPause()
  {
    super.onPause();
    BitmapManager.instance().cancelThreadDecoding(this.mDecodingThreads);
  }
}

/* Location:
 * Qualified Name:     eu.janmuller.android.simplecropimage.CropImage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
