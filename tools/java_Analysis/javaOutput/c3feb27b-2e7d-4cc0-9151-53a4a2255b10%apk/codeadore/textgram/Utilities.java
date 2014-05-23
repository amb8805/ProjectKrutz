package codeadore.textgram;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

public class Utilities
{
  public static String TAG = "Utilitites";

  public Utilities()
  {
  }

  public static int IntegerValueOf(String paramString, int paramInt)
  {
    try
    {
      int i = Integer.valueOf(paramString).intValue();
      return i;
    }
    catch (Exception localException)
    {
    }
    return paramInt;
  }

  public static void checkPrefsCounters(Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("TextgramSettings", 0);
    Date localDate = new Date();
    String str = String.valueOf(localDate.getDay()) + "/" + localDate.getMonth() + "/" + localDate.getYear();
    if (!localSharedPreferences.getString("lastRecordedDate", "").contains(str))
    {
      SharedPreferences.Editor localEditor = localSharedPreferences.edit();
      localEditor.putInt("even_store_item", 0);
      localEditor.putInt("event_save_textgram", 0);
      localEditor.putInt("event_share_textgram", 0);
      localEditor.putString("lastRecordedDate", str);
      localEditor.commit();
    }
  }

  public static Bitmap createReflectedBitmap(Bitmap paramBitmap, int paramInt)
  {
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap.getWidth(), paramBitmap.getHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Matrix localMatrix = new Matrix();
    localMatrix.setRotate(180.0F, paramBitmap.getWidth() / 2, paramBitmap.getHeight() / 2);
    localMatrix.setScale(1.0F, -1.0F);
    localMatrix.postTranslate(0.0F, localBitmap.getHeight());
    Paint localPaint = new Paint();
    localPaint.setAlpha(paramInt * 255 / 100);
    localCanvas.drawBitmap(paramBitmap, localMatrix, localPaint);
    return localBitmap;
  }

  public static String createURIFromBitmap(Context paramContext, Bitmap paramBitmap)
  {
    try
    {
      File localFile = File.createTempFile("tg" + System.currentTimeMillis(), ".jpg");
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, 90, localFileOutputStream);
      String str = "file://" + localFile.getPath();
      return str;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      localFileNotFoundException.printStackTrace();
      return null;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
    return null;
  }

  public static Bitmap decorateBitmap(Context paramContext, Bitmap paramBitmap)
  {
    return paramBitmap;
  }

  public static Bitmap getBitmapFromPath(Context paramContext, String paramString)
  {
    try
    {
      boolean bool1 = paramString.contains("[assets]");
      if (bool1)
        try
        {
          localBitmap4 = el7rUtilities.getBitmapFromAsset(paramContext, paramString.replace("[assets]/", ""));
          localBitmap1 = localBitmap4;
          return localBitmap1;
        }
        catch (Exception localException3)
        {
          Log.e(TAG, "in getBitmapFromPath() -> from assets: " + localException3.toString());
          return null;
        }
    }
    catch (Exception localException1)
    {
      Log.e(TAG, " in getBitmapFromPath(): " + localException1.toString());
      return null;
    }
    boolean bool3;
    do
    {
      Bitmap localBitmap4;
      boolean bool2 = paramString.contains("[sdcard]");
      if (bool2)
        try
        {
          String str = paramString.replace("[sdcard]/", "");
          Bitmap localBitmap3 = BitmapFactory.decodeFile(String.valueOf(Settings.sdCardPath) + File.separator + str);
          return localBitmap3;
        }
        catch (Exception localException2)
        {
          Log.e(TAG, "in getBitmapFromPath() -> from sdCard: " + localException2.toString());
          return null;
        }
      if (paramString.contains("[URI]"))
        return getBitmapFromURI(Uri.parse(paramString.replace("[URI]/", "")), paramContext);
      bool3 = paramString.contains("[color]");
      Bitmap localBitmap1 = null;
    }
    while (!bool3);
    int i = Integer.valueOf(paramString.replace("[color]/", "")).intValue();
    Bitmap localBitmap2 = Bitmap.createBitmap(100, 100, Bitmap.Config.RGB_565);
    new Canvas(localBitmap2).drawColor(i);
    return localBitmap2;
  }

  public static Bitmap getBitmapFromURI(Uri paramUri, Context paramContext)
  {
    try
    {
      InputStream localInputStream1 = paramContext.getContentResolver().openInputStream(paramUri);
      InputStream localInputStream2 = paramContext.getContentResolver().openInputStream(paramUri);
      BitmapFactory.Options localOptions1 = new BitmapFactory.Options();
      localOptions1.inJustDecodeBounds = true;
      BitmapFactory.decodeStream(localInputStream1, null, localOptions1);
      localInputStream1.close();
      int i = 1;
      if ((localOptions1.outHeight > 612) || (localOptions1.outWidth > 612))
        i = (int)Math.pow(2.0D, (int)Math.round(Math.log(612.0D / Math.max(localOptions1.outHeight, localOptions1.outWidth)) / Math.log(0.5D)));
      BitmapFactory.Options localOptions2 = new BitmapFactory.Options();
      localOptions2.inSampleSize = i;
      Bitmap localBitmap = BitmapFactory.decodeStream(localInputStream2, null, localOptions2);
      localInputStream2.close();
      return localBitmap;
    }
    catch (Exception localException)
    {
      Log.e(TAG, "in getBitmapFromURI(): " + localException.toString());
      Toast.makeText(paramContext, paramContext.getString(2131427363), 1).show();
    }
    return null;
  }

  public static String getRealPathFromURI(Context paramContext, Uri paramUri)
  {
    String[] arrayOfString = { "_data" };
    Cursor localCursor = paramContext.getContentResolver().query(paramUri, arrayOfString, null, null, null);
    int i = localCursor.getColumnIndexOrThrow("_data");
    localCursor.moveToFirst();
    return localCursor.getString(i);
  }

  public static String getTemplateField(Context paramContext, String paramString1, String paramString2)
    throws IOException
  {
    AssetManager localAssetManager = paramContext.getAssets();
    if (paramString1 == "[custom]")
      return "";
    if (paramString1 == "[custom_color]")
      return "";
    BufferedReader localBufferedReader;
    String str1;
    if (paramString1.contains("[assets]"))
    {
      localBufferedReader = new BufferedReader(new InputStreamReader(localAssetManager.open(String.valueOf(paramString1.replace("[assets]/", "")) + File.separator + "config.xml")));
      str1 = null;
      if (localBufferedReader == null);
    }
    while (true)
    {
      String str2 = localBufferedReader.readLine();
      if (str2 == null)
      {
        localBufferedReader.close();
        return str1;
        boolean bool = paramString1.contains("[sdcard]");
        localBufferedReader = null;
        if (!bool)
          break;
        String str3 = paramString1.replace("[sdcard]/", "");
        localBufferedReader = new BufferedReader(new FileReader(new File(String.valueOf(Settings.sdCardPath) + File.separator + str3 + File.separator + "config.xml")));
        break;
      }
      if (str2.matches("<" + paramString2 + ">.*</" + paramString2 + ">"))
        str1 = str2.replace("<" + paramString2 + ">", "").replace("</" + paramString2 + ">", "");
    }
  }

  public static Typeface getTypefaceFromPath(Context paramContext, String paramString)
  {
    if (paramString.contains("[assets]"))
      try
      {
        String str = paramString.replace("[assets]/", "");
        Typeface localTypeface3 = Typeface.createFromAsset(paramContext.getAssets(), str);
        localTypeface1 = localTypeface3;
        return localTypeface1;
      }
      catch (Exception localException2)
      {
        Log.e(TAG, "in getTypeFaceFromPath() -> fetch form assets: " + localException2.toString());
        return null;
      }
    boolean bool;
    do
    {
      bool = paramString.contains("[sdcard]");
      Typeface localTypeface1 = null;
    }
    while (!bool);
    try
    {
      Typeface localTypeface2 = Typeface.createFromFile(String.valueOf(Settings.sdCardPath) + File.separator + paramString.replace("[sdcard]/", ""));
      return localTypeface2;
    }
    catch (Exception localException1)
    {
      Log.e(TAG, "in getTypeFaceFromPath() -> fetch form sdCard: " + localException1.toString());
    }
    return null;
  }

  public static boolean isOnline(Context paramContext)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    return (localNetworkInfo != null) && (localNetworkInfo.isConnected());
  }

  public static boolean isTablet(Context paramContext)
  {
    try
    {
      DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
      float f1 = localDisplayMetrics.widthPixels / localDisplayMetrics.xdpi;
      float f2 = localDisplayMetrics.heightPixels / localDisplayMetrics.ydpi;
      double d = Math.sqrt(Math.pow(f1, 2.0D) + Math.pow(f2, 2.0D));
      boolean bool1 = d < 6.0D;
      boolean bool2 = false;
      if (!bool1)
        bool2 = true;
      return bool2;
    }
    catch (Throwable localThrowable)
    {
      Log.e(TAG, "Failed to compute screen size", localThrowable);
    }
    return false;
  }

  public static void openGalleryForSelect(Activity paramActivity, int paramInt)
  {
    Intent localIntent = new Intent("android.intent.action.PICK");
    localIntent.setType("image/*");
    paramActivity.startActivityForResult(localIntent, paramInt);
  }

  public static void optionsMenuAction(MenuItem paramMenuItem, Activity paramActivity, String paramString)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
    case 16908332:
    case 2131099872:
      do
      {
        return;
        paramActivity.onBackPressed();
        return;
        if (paramString == "MainActivity")
        {
          MainActivity.goNext();
          return;
        }
      }
      while (paramString != "StylingActivity");
      paramActivity.startActivity(new Intent(paramActivity, ResultActivity.class));
      return;
    case 2131099877:
      paramActivity.startActivity(new Intent(paramActivity, AboutActivity.class));
      return;
    case 2131099875:
      paramActivity.startActivity(new Intent(paramActivity, RAppsActivity.class));
      return;
    case 2131099874:
      paramActivity.startActivity(new Intent(paramActivity, StoreActivity.class));
      return;
    case 2131099876:
      paramActivity.startActivity(new Intent(paramActivity, GoProActivity.class));
      return;
    case 2131099878:
    }
    paramActivity.startActivity(new Intent(paramActivity, SettingsActivity.class));
  }

  public static void saveBitmap(Context paramContext, Bitmap paramBitmap, ProgressDialog paramProgressDialog)
    throws IOException
  {
    paramProgressDialog.show();
    new Thread(new Utilities.1(paramBitmap, paramContext, paramProgressDialog)).start();
  }

  public static void shareBitmap(Context paramContext, Bitmap paramBitmap, ProgressDialog paramProgressDialog)
    throws IOException
  {
    try
    {
      ResultActivity.UIHandler.post(new Utilities.2(paramProgressDialog));
      new Thread(new Utilities.3(paramContext, paramBitmap, paramProgressDialog)).start();
      return;
    }
    catch (Exception localException)
    {
      while (true)
        localException.printStackTrace();
    }
  }

  // ERROR //
  public static void updateLists(Context paramContext)
    throws IOException
  {
    // Byte code:
    //   0: iconst_0
    //   1: putstatic 602	codeadore/textgram/Settings:dataUpToDate	Z
    //   4: new 604	java/util/ArrayList
    //   7: dup
    //   8: invokespecial 605	java/util/ArrayList:<init>	()V
    //   11: putstatic 611	codeadore/textgram/StylingActivity:templatesList	Ljava/util/ArrayList;
    //   14: new 604	java/util/ArrayList
    //   17: dup
    //   18: invokespecial 605	java/util/ArrayList:<init>	()V
    //   21: putstatic 614	codeadore/textgram/StylingActivity:backgroundsList	Ljava/util/ArrayList;
    //   24: new 604	java/util/ArrayList
    //   27: dup
    //   28: invokespecial 605	java/util/ArrayList:<init>	()V
    //   31: putstatic 617	codeadore/textgram/StylingActivity:stickersList	Ljava/util/ArrayList;
    //   34: new 604	java/util/ArrayList
    //   37: dup
    //   38: invokespecial 605	java/util/ArrayList:<init>	()V
    //   41: putstatic 620	codeadore/textgram/StylingActivity:framesList	Ljava/util/ArrayList;
    //   44: new 604	java/util/ArrayList
    //   47: dup
    //   48: invokespecial 605	java/util/ArrayList:<init>	()V
    //   51: putstatic 623	codeadore/textgram/StylingActivity:filtersList	Ljava/util/ArrayList;
    //   54: new 604	java/util/ArrayList
    //   57: dup
    //   58: invokespecial 605	java/util/ArrayList:<init>	()V
    //   61: putstatic 626	codeadore/textgram/StylingActivity:fontsList	Ljava/util/ArrayList;
    //   64: new 604	java/util/ArrayList
    //   67: dup
    //   68: invokespecial 605	java/util/ArrayList:<init>	()V
    //   71: putstatic 629	codeadore/textgram/StylingActivity:colorsList	Ljava/util/ArrayList;
    //   74: new 604	java/util/ArrayList
    //   77: dup
    //   78: invokespecial 605	java/util/ArrayList:<init>	()V
    //   81: putstatic 632	codeadore/textgram/StylingActivity:shadowColorsList	Ljava/util/ArrayList;
    //   84: aload_0
    //   85: invokevirtual 387	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   88: ldc_w 634
    //   91: invokevirtual 638	android/content/res/AssetManager:list	(Ljava/lang/String;)[Ljava/lang/String;
    //   94: astore 92
    //   96: getstatic 611	codeadore/textgram/StylingActivity:templatesList	Ljava/util/ArrayList;
    //   99: ldc_w 389
    //   102: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   105: pop
    //   106: getstatic 611	codeadore/textgram/StylingActivity:templatesList	Ljava/util/ArrayList;
    //   109: ldc_w 391
    //   112: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   115: pop
    //   116: aload 92
    //   118: arraylength
    //   119: ifle +14 -> 133
    //   122: aload 92
    //   124: arraylength
    //   125: istore 125
    //   127: iconst_0
    //   128: istore 126
    //   130: goto +2285 -> 2415
    //   133: aload_0
    //   134: invokevirtual 387	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   137: ldc_w 644
    //   140: invokevirtual 638	android/content/res/AssetManager:list	(Ljava/lang/String;)[Ljava/lang/String;
    //   143: astore 95
    //   145: getstatic 614	codeadore/textgram/StylingActivity:backgroundsList	Ljava/util/ArrayList;
    //   148: ldc_w 389
    //   151: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   154: pop
    //   155: aload 95
    //   157: arraylength
    //   158: istore 97
    //   160: iconst_0
    //   161: istore 98
    //   163: iload 98
    //   165: iload 97
    //   167: if_icmplt +659 -> 826
    //   170: aload_0
    //   171: invokevirtual 387	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   174: ldc_w 646
    //   177: invokevirtual 638	android/content/res/AssetManager:list	(Ljava/lang/String;)[Ljava/lang/String;
    //   180: astore 99
    //   182: getstatic 617	codeadore/textgram/StylingActivity:stickersList	Ljava/util/ArrayList;
    //   185: ldc_w 389
    //   188: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   191: pop
    //   192: aload 99
    //   194: arraylength
    //   195: istore 101
    //   197: iconst_0
    //   198: istore 102
    //   200: iload 102
    //   202: iload 101
    //   204: if_icmplt +674 -> 878
    //   207: aload_0
    //   208: invokevirtual 387	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   211: ldc_w 648
    //   214: invokevirtual 638	android/content/res/AssetManager:list	(Ljava/lang/String;)[Ljava/lang/String;
    //   217: astore 103
    //   219: getstatic 620	codeadore/textgram/StylingActivity:framesList	Ljava/util/ArrayList;
    //   222: ldc_w 650
    //   225: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   228: pop
    //   229: aload 103
    //   231: arraylength
    //   232: istore 105
    //   234: iconst_0
    //   235: istore 106
    //   237: iload 106
    //   239: iload 105
    //   241: if_icmplt +689 -> 930
    //   244: aload_0
    //   245: invokevirtual 387	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   248: ldc_w 652
    //   251: invokevirtual 638	android/content/res/AssetManager:list	(Ljava/lang/String;)[Ljava/lang/String;
    //   254: astore 107
    //   256: getstatic 623	codeadore/textgram/StylingActivity:filtersList	Ljava/util/ArrayList;
    //   259: ldc_w 650
    //   262: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   265: pop
    //   266: getstatic 623	codeadore/textgram/StylingActivity:filtersList	Ljava/util/ArrayList;
    //   269: ldc_w 389
    //   272: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   275: pop
    //   276: aload 107
    //   278: arraylength
    //   279: istore 110
    //   281: iconst_0
    //   282: istore 111
    //   284: iload 111
    //   286: iload 110
    //   288: if_icmplt +694 -> 982
    //   291: aload_0
    //   292: invokevirtual 387	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   295: ldc_w 654
    //   298: invokevirtual 638	android/content/res/AssetManager:list	(Ljava/lang/String;)[Ljava/lang/String;
    //   301: astore 112
    //   303: aload 112
    //   305: arraylength
    //   306: istore 113
    //   308: iconst_0
    //   309: istore 114
    //   311: iload 114
    //   313: iload 113
    //   315: if_icmplt +719 -> 1034
    //   318: getstatic 658	codeadore/textgram/Settings:sdCardFolder	Ljava/io/File;
    //   321: astore 40
    //   323: aload 40
    //   325: invokevirtual 661	java/io/File:isDirectory	()Z
    //   328: ifeq +31 -> 359
    //   331: aload 40
    //   333: invokevirtual 664	java/io/File:list	()[Ljava/lang/String;
    //   336: astore 41
    //   338: aload 41
    //   340: arraylength
    //   341: ifle +18 -> 359
    //   344: aload 41
    //   346: arraylength
    //   347: istore 42
    //   349: iconst_0
    //   350: istore 43
    //   352: iload 43
    //   354: iload 42
    //   356: if_icmplt +787 -> 1143
    //   359: getstatic 611	codeadore/textgram/StylingActivity:templatesList	Ljava/util/ArrayList;
    //   362: ldc_w 666
    //   365: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   368: pop
    //   369: getstatic 617	codeadore/textgram/StylingActivity:stickersList	Ljava/util/ArrayList;
    //   372: ldc_w 666
    //   375: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   378: pop
    //   379: getstatic 626	codeadore/textgram/StylingActivity:fontsList	Ljava/util/ArrayList;
    //   382: ldc_w 666
    //   385: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   388: pop
    //   389: getstatic 614	codeadore/textgram/StylingActivity:backgroundsList	Ljava/util/ArrayList;
    //   392: ldc_w 666
    //   395: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   398: pop
    //   399: getstatic 623	codeadore/textgram/StylingActivity:filtersList	Ljava/util/ArrayList;
    //   402: ldc_w 666
    //   405: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   408: pop
    //   409: getstatic 620	codeadore/textgram/StylingActivity:framesList	Ljava/util/ArrayList;
    //   412: ldc_w 666
    //   415: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   418: pop
    //   419: getstatic 629	codeadore/textgram/StylingActivity:colorsList	Ljava/util/ArrayList;
    //   422: invokevirtual 669	java/util/ArrayList:clear	()V
    //   425: bipush 16
    //   427: anewarray 49	java/lang/String
    //   430: dup
    //   431: iconst_0
    //   432: ldc_w 671
    //   435: aastore
    //   436: dup
    //   437: iconst_1
    //   438: ldc_w 673
    //   441: aastore
    //   442: dup
    //   443: iconst_2
    //   444: ldc_w 675
    //   447: aastore
    //   448: dup
    //   449: iconst_3
    //   450: ldc_w 677
    //   453: aastore
    //   454: dup
    //   455: iconst_4
    //   456: ldc_w 679
    //   459: aastore
    //   460: dup
    //   461: iconst_5
    //   462: ldc_w 681
    //   465: aastore
    //   466: dup
    //   467: bipush 6
    //   469: ldc_w 683
    //   472: aastore
    //   473: dup
    //   474: bipush 7
    //   476: ldc_w 685
    //   479: aastore
    //   480: dup
    //   481: bipush 8
    //   483: ldc_w 687
    //   486: aastore
    //   487: dup
    //   488: bipush 9
    //   490: ldc_w 689
    //   493: aastore
    //   494: dup
    //   495: bipush 10
    //   497: ldc_w 691
    //   500: aastore
    //   501: dup
    //   502: bipush 11
    //   504: ldc_w 693
    //   507: aastore
    //   508: dup
    //   509: bipush 12
    //   511: ldc_w 695
    //   514: aastore
    //   515: dup
    //   516: bipush 13
    //   518: ldc_w 697
    //   521: aastore
    //   522: dup
    //   523: bipush 14
    //   525: ldc_w 699
    //   528: aastore
    //   529: dup
    //   530: bipush 15
    //   532: ldc_w 701
    //   535: aastore
    //   536: astore 11
    //   538: getstatic 629	codeadore/textgram/StylingActivity:colorsList	Ljava/util/ArrayList;
    //   541: ldc_w 391
    //   544: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   547: pop
    //   548: aload 11
    //   550: arraylength
    //   551: istore 13
    //   553: iconst_0
    //   554: istore 14
    //   556: iload 14
    //   558: iload 13
    //   560: if_icmplt +1653 -> 2213
    //   563: aload 11
    //   565: arraylength
    //   566: istore 17
    //   568: iconst_0
    //   569: istore 18
    //   571: iload 18
    //   573: iload 17
    //   575: if_icmplt +1660 -> 2235
    //   578: aload 11
    //   580: arraylength
    //   581: istore 21
    //   583: iconst_0
    //   584: istore 22
    //   586: iload 22
    //   588: iload 21
    //   590: if_icmplt +1686 -> 2276
    //   593: aload 11
    //   595: arraylength
    //   596: istore 25
    //   598: iconst_0
    //   599: istore 26
    //   601: iload 26
    //   603: iload 25
    //   605: if_icmplt +1712 -> 2317
    //   608: aload 11
    //   610: arraylength
    //   611: istore 29
    //   613: iconst_0
    //   614: istore 30
    //   616: iload 30
    //   618: iload 29
    //   620: if_icmplt +1735 -> 2355
    //   623: getstatic 632	codeadore/textgram/StylingActivity:shadowColorsList	Ljava/util/ArrayList;
    //   626: invokevirtual 669	java/util/ArrayList:clear	()V
    //   629: getstatic 632	codeadore/textgram/StylingActivity:shadowColorsList	Ljava/util/ArrayList;
    //   632: ldc_w 650
    //   635: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   638: pop
    //   639: getstatic 632	codeadore/textgram/StylingActivity:shadowColorsList	Ljava/util/ArrayList;
    //   642: ldc_w 391
    //   645: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   648: pop
    //   649: bipush 16
    //   651: anewarray 49	java/lang/String
    //   654: dup
    //   655: iconst_0
    //   656: ldc_w 671
    //   659: aastore
    //   660: dup
    //   661: iconst_1
    //   662: ldc_w 673
    //   665: aastore
    //   666: dup
    //   667: iconst_2
    //   668: ldc_w 675
    //   671: aastore
    //   672: dup
    //   673: iconst_3
    //   674: ldc_w 677
    //   677: aastore
    //   678: dup
    //   679: iconst_4
    //   680: ldc_w 679
    //   683: aastore
    //   684: dup
    //   685: iconst_5
    //   686: ldc_w 681
    //   689: aastore
    //   690: dup
    //   691: bipush 6
    //   693: ldc_w 683
    //   696: aastore
    //   697: dup
    //   698: bipush 7
    //   700: ldc_w 685
    //   703: aastore
    //   704: dup
    //   705: bipush 8
    //   707: ldc_w 687
    //   710: aastore
    //   711: dup
    //   712: bipush 9
    //   714: ldc_w 689
    //   717: aastore
    //   718: dup
    //   719: bipush 10
    //   721: ldc_w 691
    //   724: aastore
    //   725: dup
    //   726: bipush 11
    //   728: ldc_w 693
    //   731: aastore
    //   732: dup
    //   733: bipush 12
    //   735: ldc_w 695
    //   738: aastore
    //   739: dup
    //   740: bipush 13
    //   742: ldc_w 697
    //   745: aastore
    //   746: dup
    //   747: bipush 14
    //   749: ldc_w 699
    //   752: aastore
    //   753: dup
    //   754: bipush 15
    //   756: ldc_w 701
    //   759: aastore
    //   760: astore 35
    //   762: aload 35
    //   764: arraylength
    //   765: istore 36
    //   767: iconst_0
    //   768: istore 37
    //   770: iload 37
    //   772: iload 36
    //   774: if_icmplt +1619 -> 2393
    //   777: iconst_1
    //   778: putstatic 602	codeadore/textgram/Settings:dataUpToDate	Z
    //   781: return
    //   782: aload 92
    //   784: iload 126
    //   786: aaload
    //   787: astore 127
    //   789: getstatic 611	codeadore/textgram/StylingActivity:templatesList	Ljava/util/ArrayList;
    //   792: new 44	java/lang/StringBuilder
    //   795: dup
    //   796: ldc_w 703
    //   799: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   802: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   805: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   808: aload 127
    //   810: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   813: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   816: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   819: pop
    //   820: iinc 126 1
    //   823: goto +1592 -> 2415
    //   826: aload 95
    //   828: iload 98
    //   830: aaload
    //   831: astore 123
    //   833: aload 123
    //   835: ldc_w 705
    //   838: invokevirtual 88	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   841: ifne +1584 -> 2425
    //   844: getstatic 614	codeadore/textgram/StylingActivity:backgroundsList	Ljava/util/ArrayList;
    //   847: new 44	java/lang/StringBuilder
    //   850: dup
    //   851: ldc_w 707
    //   854: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   857: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   860: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   863: aload 123
    //   865: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   868: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   871: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   874: pop
    //   875: goto +1550 -> 2425
    //   878: aload 99
    //   880: iload 102
    //   882: aaload
    //   883: astore 121
    //   885: aload 121
    //   887: ldc_w 705
    //   890: invokevirtual 88	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   893: ifne +1538 -> 2431
    //   896: getstatic 617	codeadore/textgram/StylingActivity:stickersList	Ljava/util/ArrayList;
    //   899: new 44	java/lang/StringBuilder
    //   902: dup
    //   903: ldc_w 709
    //   906: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   909: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   912: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   915: aload 121
    //   917: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   920: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   923: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   926: pop
    //   927: goto +1504 -> 2431
    //   930: aload 103
    //   932: iload 106
    //   934: aaload
    //   935: astore 119
    //   937: aload 119
    //   939: ldc_w 705
    //   942: invokevirtual 88	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   945: ifne +1492 -> 2437
    //   948: getstatic 620	codeadore/textgram/StylingActivity:framesList	Ljava/util/ArrayList;
    //   951: new 44	java/lang/StringBuilder
    //   954: dup
    //   955: ldc_w 711
    //   958: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   961: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   964: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   967: aload 119
    //   969: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   972: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   975: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   978: pop
    //   979: goto +1458 -> 2437
    //   982: aload 107
    //   984: iload 111
    //   986: aaload
    //   987: astore 117
    //   989: aload 117
    //   991: ldc_w 705
    //   994: invokevirtual 88	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   997: ifne +1446 -> 2443
    //   1000: getstatic 623	codeadore/textgram/StylingActivity:filtersList	Ljava/util/ArrayList;
    //   1003: new 44	java/lang/StringBuilder
    //   1006: dup
    //   1007: ldc_w 713
    //   1010: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1013: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1016: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1019: aload 117
    //   1021: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1024: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1027: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1030: pop
    //   1031: goto +1412 -> 2443
    //   1034: aload 112
    //   1036: iload 114
    //   1038: aaload
    //   1039: astore 115
    //   1041: aload 115
    //   1043: ldc_w 715
    //   1046: invokevirtual 88	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1049: ifeq +57 -> 1106
    //   1052: aload 112
    //   1054: invokestatic 721	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   1057: aload 115
    //   1059: ldc_w 715
    //   1062: ldc 184
    //   1064: invokevirtual 226	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1067: invokeinterface 725 2 0
    //   1072: ifeq +34 -> 1106
    //   1075: getstatic 626	codeadore/textgram/StylingActivity:fontsList	Ljava/util/ArrayList;
    //   1078: new 44	java/lang/StringBuilder
    //   1081: dup
    //   1082: ldc_w 727
    //   1085: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1088: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1091: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1094: aload 115
    //   1096: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1099: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1102: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1105: pop
    //   1106: iinc 114 1
    //   1109: goto -798 -> 311
    //   1112: astore_1
    //   1113: getstatic 12	codeadore/textgram/Utilities:TAG	Ljava/lang/String;
    //   1116: new 44	java/lang/StringBuilder
    //   1119: dup
    //   1120: ldc_w 729
    //   1123: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1126: aload_1
    //   1127: invokevirtual 234	java/lang/Exception:toString	()Ljava/lang/String;
    //   1130: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1133: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1136: invokestatic 240	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   1139: pop
    //   1140: goto -822 -> 318
    //   1143: aload 41
    //   1145: iload 43
    //   1147: aaload
    //   1148: astore 44
    //   1150: new 186	java/io/File
    //   1153: dup
    //   1154: new 44	java/lang/StringBuilder
    //   1157: dup
    //   1158: getstatic 251	codeadore/textgram/Settings:sdCardPath	Ljava/lang/String;
    //   1161: invokestatic 254	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1164: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1167: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1170: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1173: aload 44
    //   1175: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1178: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1181: invokespecial 416	java/io/File:<init>	(Ljava/lang/String;)V
    //   1184: astore 45
    //   1186: aload 40
    //   1188: invokevirtual 661	java/io/File:isDirectory	()Z
    //   1191: ifeq +1265 -> 2456
    //   1194: aload 45
    //   1196: invokevirtual 664	java/io/File:list	()[Ljava/lang/String;
    //   1199: ifnull +1257 -> 2456
    //   1202: aload 45
    //   1204: invokevirtual 664	java/io/File:list	()[Ljava/lang/String;
    //   1207: astore 46
    //   1209: aload 46
    //   1211: arraylength
    //   1212: istore 47
    //   1214: iconst_0
    //   1215: istore 48
    //   1217: goto +1232 -> 2449
    //   1220: aload 46
    //   1222: iload 48
    //   1224: aaload
    //   1225: astore 49
    //   1227: aload 49
    //   1229: ldc_w 634
    //   1232: invokevirtual 88	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1235: ifeq +139 -> 1374
    //   1238: new 44	java/lang/StringBuilder
    //   1241: dup
    //   1242: getstatic 251	codeadore/textgram/Settings:sdCardPath	Ljava/lang/String;
    //   1245: invokestatic 254	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1248: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1251: astore 50
    //   1253: new 186	java/io/File
    //   1256: dup
    //   1257: aload 50
    //   1259: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1262: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1265: aload 44
    //   1267: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1270: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1273: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1276: aload 49
    //   1278: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1281: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1284: invokespecial 416	java/io/File:<init>	(Ljava/lang/String;)V
    //   1287: astore 51
    //   1289: aload 51
    //   1291: invokevirtual 661	java/io/File:isDirectory	()Z
    //   1294: ifeq +1175 -> 2469
    //   1297: aload 51
    //   1299: invokevirtual 664	java/io/File:list	()[Ljava/lang/String;
    //   1302: astore 52
    //   1304: aload 52
    //   1306: arraylength
    //   1307: istore 53
    //   1309: iconst_0
    //   1310: istore 54
    //   1312: goto +1150 -> 2462
    //   1315: aload 52
    //   1317: iload 54
    //   1319: aaload
    //   1320: astore 55
    //   1322: getstatic 611	codeadore/textgram/StylingActivity:templatesList	Ljava/util/ArrayList;
    //   1325: new 44	java/lang/StringBuilder
    //   1328: dup
    //   1329: ldc 246
    //   1331: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1334: aload 44
    //   1336: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1339: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1342: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1345: aload 49
    //   1347: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1350: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1353: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1356: aload 55
    //   1358: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1361: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1364: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1367: pop
    //   1368: iinc 54 1
    //   1371: goto +1091 -> 2462
    //   1374: aload 49
    //   1376: ldc_w 644
    //   1379: invokevirtual 88	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1382: ifeq +153 -> 1535
    //   1385: new 44	java/lang/StringBuilder
    //   1388: dup
    //   1389: getstatic 251	codeadore/textgram/Settings:sdCardPath	Ljava/lang/String;
    //   1392: invokestatic 254	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1395: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1398: astore 57
    //   1400: new 186	java/io/File
    //   1403: dup
    //   1404: aload 57
    //   1406: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1409: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1412: aload 44
    //   1414: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1417: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1420: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1423: ldc_w 644
    //   1426: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1429: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1432: invokespecial 416	java/io/File:<init>	(Ljava/lang/String;)V
    //   1435: astore 58
    //   1437: aload 58
    //   1439: invokevirtual 661	java/io/File:isDirectory	()Z
    //   1442: ifeq +1027 -> 2469
    //   1445: aload 58
    //   1447: invokevirtual 664	java/io/File:list	()[Ljava/lang/String;
    //   1450: astore 59
    //   1452: aload 59
    //   1454: arraylength
    //   1455: istore 60
    //   1457: iconst_0
    //   1458: istore 61
    //   1460: iload 61
    //   1462: iload 60
    //   1464: if_icmpge +1005 -> 2469
    //   1467: aload 59
    //   1469: iload 61
    //   1471: aaload
    //   1472: astore 62
    //   1474: aload 62
    //   1476: ldc_w 705
    //   1479: invokevirtual 88	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1482: ifne +993 -> 2475
    //   1485: getstatic 614	codeadore/textgram/StylingActivity:backgroundsList	Ljava/util/ArrayList;
    //   1488: new 44	java/lang/StringBuilder
    //   1491: dup
    //   1492: ldc 246
    //   1494: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1497: aload 44
    //   1499: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1502: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1505: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1508: ldc_w 644
    //   1511: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1514: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1517: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1520: aload 62
    //   1522: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1525: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1528: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1531: pop
    //   1532: goto +943 -> 2475
    //   1535: aload 49
    //   1537: ldc_w 646
    //   1540: invokevirtual 88	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1543: ifeq +153 -> 1696
    //   1546: new 44	java/lang/StringBuilder
    //   1549: dup
    //   1550: getstatic 251	codeadore/textgram/Settings:sdCardPath	Ljava/lang/String;
    //   1553: invokestatic 254	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1556: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1559: astore 64
    //   1561: new 186	java/io/File
    //   1564: dup
    //   1565: aload 64
    //   1567: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1570: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1573: aload 44
    //   1575: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1578: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1581: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1584: ldc_w 646
    //   1587: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1590: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1593: invokespecial 416	java/io/File:<init>	(Ljava/lang/String;)V
    //   1596: astore 65
    //   1598: aload 65
    //   1600: invokevirtual 661	java/io/File:isDirectory	()Z
    //   1603: ifeq +866 -> 2469
    //   1606: aload 65
    //   1608: invokevirtual 664	java/io/File:list	()[Ljava/lang/String;
    //   1611: astore 66
    //   1613: aload 66
    //   1615: arraylength
    //   1616: istore 67
    //   1618: iconst_0
    //   1619: istore 68
    //   1621: iload 68
    //   1623: iload 67
    //   1625: if_icmpge +844 -> 2469
    //   1628: aload 66
    //   1630: iload 68
    //   1632: aaload
    //   1633: astore 69
    //   1635: aload 69
    //   1637: ldc_w 705
    //   1640: invokevirtual 88	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1643: ifne +838 -> 2481
    //   1646: getstatic 617	codeadore/textgram/StylingActivity:stickersList	Ljava/util/ArrayList;
    //   1649: new 44	java/lang/StringBuilder
    //   1652: dup
    //   1653: ldc 246
    //   1655: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1658: aload 44
    //   1660: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1663: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1666: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1669: ldc_w 646
    //   1672: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1675: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1678: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1681: aload 69
    //   1683: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1686: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1689: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1692: pop
    //   1693: goto +788 -> 2481
    //   1696: aload 49
    //   1698: ldc_w 648
    //   1701: invokevirtual 88	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1704: ifeq +153 -> 1857
    //   1707: new 44	java/lang/StringBuilder
    //   1710: dup
    //   1711: getstatic 251	codeadore/textgram/Settings:sdCardPath	Ljava/lang/String;
    //   1714: invokestatic 254	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1717: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1720: astore 71
    //   1722: new 186	java/io/File
    //   1725: dup
    //   1726: aload 71
    //   1728: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1731: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1734: aload 44
    //   1736: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1739: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1742: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1745: ldc_w 648
    //   1748: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1751: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1754: invokespecial 416	java/io/File:<init>	(Ljava/lang/String;)V
    //   1757: astore 72
    //   1759: aload 72
    //   1761: invokevirtual 661	java/io/File:isDirectory	()Z
    //   1764: ifeq +705 -> 2469
    //   1767: aload 72
    //   1769: invokevirtual 664	java/io/File:list	()[Ljava/lang/String;
    //   1772: astore 73
    //   1774: aload 73
    //   1776: arraylength
    //   1777: istore 74
    //   1779: iconst_0
    //   1780: istore 75
    //   1782: iload 75
    //   1784: iload 74
    //   1786: if_icmpge +683 -> 2469
    //   1789: aload 73
    //   1791: iload 75
    //   1793: aaload
    //   1794: astore 76
    //   1796: aload 76
    //   1798: ldc_w 705
    //   1801: invokevirtual 88	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1804: ifne +683 -> 2487
    //   1807: getstatic 620	codeadore/textgram/StylingActivity:framesList	Ljava/util/ArrayList;
    //   1810: new 44	java/lang/StringBuilder
    //   1813: dup
    //   1814: ldc 246
    //   1816: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1819: aload 44
    //   1821: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1824: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1827: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1830: ldc_w 648
    //   1833: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1836: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1839: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1842: aload 76
    //   1844: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1847: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1850: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1853: pop
    //   1854: goto +633 -> 2487
    //   1857: aload 49
    //   1859: ldc_w 652
    //   1862: invokevirtual 88	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1865: ifeq +153 -> 2018
    //   1868: new 44	java/lang/StringBuilder
    //   1871: dup
    //   1872: getstatic 251	codeadore/textgram/Settings:sdCardPath	Ljava/lang/String;
    //   1875: invokestatic 254	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1878: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1881: astore 78
    //   1883: new 186	java/io/File
    //   1886: dup
    //   1887: aload 78
    //   1889: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1892: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1895: aload 44
    //   1897: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1900: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1903: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1906: ldc_w 652
    //   1909: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1912: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1915: invokespecial 416	java/io/File:<init>	(Ljava/lang/String;)V
    //   1918: astore 79
    //   1920: aload 79
    //   1922: invokevirtual 661	java/io/File:isDirectory	()Z
    //   1925: ifeq +544 -> 2469
    //   1928: aload 79
    //   1930: invokevirtual 664	java/io/File:list	()[Ljava/lang/String;
    //   1933: astore 80
    //   1935: aload 80
    //   1937: arraylength
    //   1938: istore 81
    //   1940: iconst_0
    //   1941: istore 82
    //   1943: iload 82
    //   1945: iload 81
    //   1947: if_icmpge +522 -> 2469
    //   1950: aload 80
    //   1952: iload 82
    //   1954: aaload
    //   1955: astore 83
    //   1957: aload 83
    //   1959: ldc_w 705
    //   1962: invokevirtual 88	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1965: ifne +528 -> 2493
    //   1968: getstatic 623	codeadore/textgram/StylingActivity:filtersList	Ljava/util/ArrayList;
    //   1971: new 44	java/lang/StringBuilder
    //   1974: dup
    //   1975: ldc 246
    //   1977: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1980: aload 44
    //   1982: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1985: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   1988: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1991: ldc_w 652
    //   1994: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1997: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   2000: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2003: aload 83
    //   2005: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2008: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2011: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2014: pop
    //   2015: goto +478 -> 2493
    //   2018: aload 49
    //   2020: ldc_w 654
    //   2023: invokevirtual 88	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   2026: ifeq +443 -> 2469
    //   2029: new 44	java/lang/StringBuilder
    //   2032: dup
    //   2033: getstatic 251	codeadore/textgram/Settings:sdCardPath	Ljava/lang/String;
    //   2036: invokestatic 254	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   2039: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2042: astore 85
    //   2044: new 186	java/io/File
    //   2047: dup
    //   2048: aload 85
    //   2050: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   2053: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2056: aload 44
    //   2058: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2061: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   2064: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2067: ldc_w 654
    //   2070: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2073: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2076: invokespecial 416	java/io/File:<init>	(Ljava/lang/String;)V
    //   2079: astore 86
    //   2081: aload 86
    //   2083: invokevirtual 661	java/io/File:isDirectory	()Z
    //   2086: ifeq +383 -> 2469
    //   2089: aload 86
    //   2091: invokevirtual 664	java/io/File:list	()[Ljava/lang/String;
    //   2094: astore 87
    //   2096: aload 87
    //   2098: arraylength
    //   2099: istore 88
    //   2101: iconst_0
    //   2102: istore 89
    //   2104: iload 89
    //   2106: iload 88
    //   2108: if_icmpge +361 -> 2469
    //   2111: aload 87
    //   2113: iload 89
    //   2115: aaload
    //   2116: astore 90
    //   2118: aload 90
    //   2120: ldc_w 715
    //   2123: invokevirtual 88	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   2126: ifeq +50 -> 2176
    //   2129: getstatic 626	codeadore/textgram/StylingActivity:fontsList	Ljava/util/ArrayList;
    //   2132: new 44	java/lang/StringBuilder
    //   2135: dup
    //   2136: ldc 246
    //   2138: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2141: aload 44
    //   2143: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2146: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   2149: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2152: ldc_w 654
    //   2155: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2158: getstatic 257	java/io/File:separator	Ljava/lang/String;
    //   2161: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2164: aload 90
    //   2166: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2169: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2172: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2175: pop
    //   2176: iinc 89 1
    //   2179: goto -75 -> 2104
    //   2182: astore_3
    //   2183: getstatic 12	codeadore/textgram/Utilities:TAG	Ljava/lang/String;
    //   2186: new 44	java/lang/StringBuilder
    //   2189: dup
    //   2190: ldc_w 731
    //   2193: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2196: aload_3
    //   2197: invokevirtual 234	java/lang/Exception:toString	()Ljava/lang/String;
    //   2200: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2203: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2206: invokestatic 240	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   2209: pop
    //   2210: goto -1851 -> 359
    //   2213: aload 11
    //   2215: iload 14
    //   2217: aaload
    //   2218: astore 15
    //   2220: getstatic 629	codeadore/textgram/StylingActivity:colorsList	Ljava/util/ArrayList;
    //   2223: aload 15
    //   2225: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2228: pop
    //   2229: iinc 14 1
    //   2232: goto -1676 -> 556
    //   2235: aload 11
    //   2237: iload 18
    //   2239: aaload
    //   2240: astore 19
    //   2242: getstatic 629	codeadore/textgram/StylingActivity:colorsList	Ljava/util/ArrayList;
    //   2245: new 44	java/lang/StringBuilder
    //   2248: dup
    //   2249: aload 19
    //   2251: invokestatic 254	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   2254: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2257: ldc_w 733
    //   2260: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2263: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2266: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2269: pop
    //   2270: iinc 18 1
    //   2273: goto -1702 -> 571
    //   2276: aload 11
    //   2278: iload 22
    //   2280: aaload
    //   2281: astore 23
    //   2283: getstatic 629	codeadore/textgram/StylingActivity:colorsList	Ljava/util/ArrayList;
    //   2286: new 44	java/lang/StringBuilder
    //   2289: dup
    //   2290: aload 23
    //   2292: invokestatic 254	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   2295: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2298: ldc_w 735
    //   2301: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2304: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2307: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2310: pop
    //   2311: iinc 22 1
    //   2314: goto -1728 -> 586
    //   2317: aload 11
    //   2319: iload 26
    //   2321: aaload
    //   2322: astore 27
    //   2324: getstatic 629	codeadore/textgram/StylingActivity:colorsList	Ljava/util/ArrayList;
    //   2327: new 44	java/lang/StringBuilder
    //   2330: dup
    //   2331: ldc_w 737
    //   2334: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2337: aload 27
    //   2339: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2342: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2345: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2348: pop
    //   2349: iinc 26 1
    //   2352: goto -1751 -> 601
    //   2355: aload 11
    //   2357: iload 30
    //   2359: aaload
    //   2360: astore 31
    //   2362: getstatic 629	codeadore/textgram/StylingActivity:colorsList	Ljava/util/ArrayList;
    //   2365: new 44	java/lang/StringBuilder
    //   2368: dup
    //   2369: ldc_w 739
    //   2372: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2375: aload 31
    //   2377: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2380: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2383: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2386: pop
    //   2387: iinc 30 1
    //   2390: goto -1774 -> 616
    //   2393: aload 35
    //   2395: iload 37
    //   2397: aaload
    //   2398: astore 38
    //   2400: getstatic 632	codeadore/textgram/StylingActivity:shadowColorsList	Ljava/util/ArrayList;
    //   2403: aload 38
    //   2405: invokevirtual 642	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2408: pop
    //   2409: iinc 37 1
    //   2412: goto -1642 -> 770
    //   2415: iload 126
    //   2417: iload 125
    //   2419: if_icmplt -1637 -> 782
    //   2422: goto -2289 -> 133
    //   2425: iinc 98 1
    //   2428: goto -2265 -> 163
    //   2431: iinc 102 1
    //   2434: goto -2234 -> 200
    //   2437: iinc 106 1
    //   2440: goto -2203 -> 237
    //   2443: iinc 111 1
    //   2446: goto -2162 -> 284
    //   2449: iload 48
    //   2451: iload 47
    //   2453: if_icmplt -1233 -> 1220
    //   2456: iinc 43 1
    //   2459: goto -2107 -> 352
    //   2462: iload 54
    //   2464: iload 53
    //   2466: if_icmplt -1151 -> 1315
    //   2469: iinc 48 1
    //   2472: goto -23 -> 2449
    //   2475: iinc 61 1
    //   2478: goto -1018 -> 1460
    //   2481: iinc 68 1
    //   2484: goto -863 -> 1621
    //   2487: iinc 75 1
    //   2490: goto -708 -> 1782
    //   2493: iinc 82 1
    //   2496: goto -553 -> 1943
    //
    // Exception table:
    //   from	to	target	type
    //   84	127	1112	java/lang/Exception
    //   133	160	1112	java/lang/Exception
    //   170	197	1112	java/lang/Exception
    //   207	234	1112	java/lang/Exception
    //   244	281	1112	java/lang/Exception
    //   291	308	1112	java/lang/Exception
    //   782	820	1112	java/lang/Exception
    //   826	875	1112	java/lang/Exception
    //   878	927	1112	java/lang/Exception
    //   930	979	1112	java/lang/Exception
    //   982	1031	1112	java/lang/Exception
    //   1034	1106	1112	java/lang/Exception
    //   318	349	2182	java/lang/Exception
    //   1143	1214	2182	java/lang/Exception
    //   1220	1309	2182	java/lang/Exception
    //   1315	1368	2182	java/lang/Exception
    //   1374	1457	2182	java/lang/Exception
    //   1467	1532	2182	java/lang/Exception
    //   1535	1618	2182	java/lang/Exception
    //   1628	1693	2182	java/lang/Exception
    //   1696	1779	2182	java/lang/Exception
    //   1789	1854	2182	java/lang/Exception
    //   1857	1940	2182	java/lang/Exception
    //   1950	2015	2182	java/lang/Exception
    //   2018	2101	2182	java/lang/Exception
    //   2111	2176	2182	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.Utilities
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
