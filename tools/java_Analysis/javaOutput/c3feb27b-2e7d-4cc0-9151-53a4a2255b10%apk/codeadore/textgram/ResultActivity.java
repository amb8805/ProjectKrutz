package codeadore.textgram;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.MenuItemCompat;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.io.FileInputStream;

public class ResultActivity extends el7rActivity
{
  public static Handler UIHandler;
  public static el7rActivity c;
  static ProgressDialog loadingDialog;
  public static Bitmap resultBitmap;
  boolean doneCaching = false;
  ImageView resultIv;
  SharedPreferences settings;

  public ResultActivity()
  {
  }

  // ERROR //
  protected void onCreate(Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 32
    //   3: putfield 36	codeadore/textgram/ResultActivity:thisActityName	Ljava/lang/String;
    //   6: aload_0
    //   7: aload_1
    //   8: invokespecial 38	codeadore/textgram/el7rActivity:onCreate	(Landroid/os/Bundle;)V
    //   11: aload_0
    //   12: ldc 39
    //   14: invokevirtual 43	codeadore/textgram/ResultActivity:setContentView	(I)V
    //   17: invokestatic 48	java/lang/System:gc	()V
    //   20: aload_0
    //   21: putstatic 50	codeadore/textgram/ResultActivity:c	Lcodeadore/textgram/el7rActivity;
    //   24: aload_0
    //   25: iconst_0
    //   26: putfield 24	codeadore/textgram/ResultActivity:doneCaching	Z
    //   29: new 52	android/app/ProgressDialog
    //   32: dup
    //   33: aload_0
    //   34: getfield 55	codeadore/textgram/ResultActivity:thisActivity	Lcodeadore/textgram/el7rActivity;
    //   37: invokespecial 58	android/app/ProgressDialog:<init>	(Landroid/content/Context;)V
    //   40: putstatic 60	codeadore/textgram/ResultActivity:loadingDialog	Landroid/app/ProgressDialog;
    //   43: getstatic 60	codeadore/textgram/ResultActivity:loadingDialog	Landroid/app/ProgressDialog;
    //   46: aload_0
    //   47: ldc 61
    //   49: invokevirtual 65	codeadore/textgram/ResultActivity:getString	(I)Ljava/lang/String;
    //   52: invokevirtual 69	android/app/ProgressDialog:setTitle	(Ljava/lang/CharSequence;)V
    //   55: getstatic 60	codeadore/textgram/ResultActivity:loadingDialog	Landroid/app/ProgressDialog;
    //   58: iconst_1
    //   59: invokevirtual 73	android/app/ProgressDialog:setIndeterminate	(Z)V
    //   62: new 75	android/os/Handler
    //   65: dup
    //   66: invokespecial 76	android/os/Handler:<init>	()V
    //   69: putstatic 78	codeadore/textgram/ResultActivity:UIHandler	Landroid/os/Handler;
    //   72: aload_0
    //   73: invokevirtual 82	codeadore/textgram/ResultActivity:getSupportActionBar	()Landroid/support/v7/app/ActionBar;
    //   76: astore_2
    //   77: aload_0
    //   78: aload_0
    //   79: ldc 84
    //   81: iconst_0
    //   82: invokevirtual 88	codeadore/textgram/ResultActivity:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   85: putfield 90	codeadore/textgram/ResultActivity:settings	Landroid/content/SharedPreferences;
    //   88: aload_0
    //   89: getfield 90	codeadore/textgram/ResultActivity:settings	Landroid/content/SharedPreferences;
    //   92: invokeinterface 96 1 0
    //   97: pop
    //   98: aload_0
    //   99: aload_0
    //   100: ldc 97
    //   102: invokevirtual 101	codeadore/textgram/ResultActivity:findViewById	(I)Landroid/view/View;
    //   105: invokestatic 107	codeadore/textgram/AdUtilities:installAd	(Landroid/app/Activity;Landroid/view/View;)V
    //   108: getstatic 113	codeadore/textgram/Settings:json	Lorg/json/JSONObject;
    //   111: ifnull +35 -> 146
    //   114: getstatic 113	codeadore/textgram/Settings:json	Lorg/json/JSONObject;
    //   117: ldc 115
    //   119: invokevirtual 121	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   122: ifeq +24 -> 146
    //   125: getstatic 113	codeadore/textgram/Settings:json	Lorg/json/JSONObject;
    //   128: ldc 115
    //   130: invokevirtual 124	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   133: ifeq +13 -> 146
    //   136: aload_0
    //   137: aload_0
    //   138: ldc 125
    //   140: invokevirtual 101	codeadore/textgram/ResultActivity:findViewById	(I)Landroid/view/View;
    //   143: invokestatic 128	codeadore/textgram/AdUtilities:installFullScreenAd	(Landroid/app/Activity;Landroid/view/View;)V
    //   146: aload_0
    //   147: getfield 132	codeadore/textgram/ResultActivity:tracker	Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;
    //   150: ldc 134
    //   152: invokevirtual 140	com/google/android/apps/analytics/GoogleAnalyticsTracker:trackPageView	(Ljava/lang/String;)V
    //   155: aload_2
    //   156: iconst_1
    //   157: invokevirtual 145	android/support/v7/app/ActionBar:setDisplayHomeAsUpEnabled	(Z)V
    //   160: aload_0
    //   161: aload_0
    //   162: ldc 146
    //   164: invokevirtual 101	codeadore/textgram/ResultActivity:findViewById	(I)Landroid/view/View;
    //   167: checkcast 148	android/widget/ImageView
    //   170: putfield 150	codeadore/textgram/ResultActivity:resultIv	Landroid/widget/ImageView;
    //   173: getstatic 152	codeadore/textgram/ResultActivity:resultBitmap	Landroid/graphics/Bitmap;
    //   176: ifnonnull +12 -> 188
    //   179: getstatic 158	codeadore/textgram/StylingActivity:superSurface	Lcodeadore/textgram/SuperSurface;
    //   182: invokevirtual 164	codeadore/textgram/SuperSurface:export	()Landroid/graphics/Bitmap;
    //   185: putstatic 152	codeadore/textgram/ResultActivity:resultBitmap	Landroid/graphics/Bitmap;
    //   188: getstatic 152	codeadore/textgram/ResultActivity:resultBitmap	Landroid/graphics/Bitmap;
    //   191: ifnull +13 -> 204
    //   194: aload_0
    //   195: getfield 150	codeadore/textgram/ResultActivity:resultIv	Landroid/widget/ImageView;
    //   198: getstatic 152	codeadore/textgram/ResultActivity:resultBitmap	Landroid/graphics/Bitmap;
    //   201: invokevirtual 168	android/widget/ImageView:setImageBitmap	(Landroid/graphics/Bitmap;)V
    //   204: aload_0
    //   205: ldc 169
    //   207: invokevirtual 101	codeadore/textgram/ResultActivity:findViewById	(I)Landroid/view/View;
    //   210: checkcast 171	android/widget/Button
    //   213: new 173	codeadore/textgram/ResultActivity$1
    //   216: dup
    //   217: aload_0
    //   218: invokespecial 176	codeadore/textgram/ResultActivity$1:<init>	(Lcodeadore/textgram/ResultActivity;)V
    //   221: invokevirtual 180	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   224: aload_0
    //   225: ldc 181
    //   227: invokevirtual 101	codeadore/textgram/ResultActivity:findViewById	(I)Landroid/view/View;
    //   230: checkcast 171	android/widget/Button
    //   233: new 183	codeadore/textgram/ResultActivity$2
    //   236: dup
    //   237: aload_0
    //   238: invokespecial 184	codeadore/textgram/ResultActivity$2:<init>	(Lcodeadore/textgram/ResultActivity;)V
    //   241: invokevirtual 180	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   244: aload_0
    //   245: ldc 185
    //   247: invokevirtual 101	codeadore/textgram/ResultActivity:findViewById	(I)Landroid/view/View;
    //   250: checkcast 171	android/widget/Button
    //   253: astore 4
    //   255: getstatic 50	codeadore/textgram/ResultActivity:c	Lcodeadore/textgram/el7rActivity;
    //   258: ldc 187
    //   260: invokestatic 193	codeadore/textgram/el7rUtilities:isAppInstalled	(Landroid/content/Context;Ljava/lang/String;)Z
    //   263: ifeq +22 -> 285
    //   266: aload 4
    //   268: iconst_0
    //   269: invokevirtual 196	android/widget/Button:setVisibility	(I)V
    //   272: aload 4
    //   274: new 198	codeadore/textgram/ResultActivity$3
    //   277: dup
    //   278: aload_0
    //   279: invokespecial 199	codeadore/textgram/ResultActivity$3:<init>	(Lcodeadore/textgram/ResultActivity;)V
    //   282: invokevirtual 180	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   285: aload_0
    //   286: ldc 200
    //   288: invokevirtual 101	codeadore/textgram/ResultActivity:findViewById	(I)Landroid/view/View;
    //   291: checkcast 171	android/widget/Button
    //   294: astore 5
    //   296: getstatic 50	codeadore/textgram/ResultActivity:c	Lcodeadore/textgram/el7rActivity;
    //   299: ldc 202
    //   301: invokestatic 193	codeadore/textgram/el7rUtilities:isAppInstalled	(Landroid/content/Context;Ljava/lang/String;)Z
    //   304: ifeq +22 -> 326
    //   307: aload 5
    //   309: iconst_0
    //   310: invokevirtual 196	android/widget/Button:setVisibility	(I)V
    //   313: aload 5
    //   315: new 204	codeadore/textgram/ResultActivity$4
    //   318: dup
    //   319: aload_0
    //   320: invokespecial 205	codeadore/textgram/ResultActivity$4:<init>	(Lcodeadore/textgram/ResultActivity;)V
    //   323: invokevirtual 180	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   326: return
    //   327: astore 7
    //   329: aload 7
    //   331: invokevirtual 208	org/json/JSONException:printStackTrace	()V
    //   334: goto -188 -> 146
    //   337: astore 6
    //   339: goto -151 -> 188
    //
    // Exception table:
    //   from	to	target	type
    //   125	146	327	org/json/JSONException
    //   179	188	337	java/lang/Exception
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131558400, paramMenu);
    this.theMenu = paramMenu;
    paramMenu.findItem(2131099872).setVisible(false);
    View localView = ((LayoutInflater)getBaseContext().getSystemService("layout_inflater")).inflate(2130903040, null);
    Button localButton = (Button)localView.findViewById(2131099676);
    localButton.setText(getString(2131427350));
    localButton.setBackgroundResource(2130837628);
    localButton.setOnClickListener(new ResultActivity.6(this));
    MenuItem localMenuItem = paramMenu.findItem(2131099877);
    MenuItemCompat.setShowAsAction(localMenuItem, 2);
    MenuItemCompat.setActionView(localMenuItem, localView);
    return true;
  }

  protected void onDestroy()
  {
    loadingDialog.cancel();
    loadingDialog.dismiss();
    super.onDestroy();
  }

  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
    if (resultBitmap == null);
    try
    {
      FileInputStream localFileInputStream = openFileInput("CACHE_BITMAP");
      resultBitmap = BitmapFactory.decodeStream(localFileInputStream);
      this.resultIv.setImageBitmap(resultBitmap);
      localFileInputStream.close();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    new Thread(new ResultActivity.5(this)).start();
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.ResultActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
