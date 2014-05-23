package codeadore.textgram;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import codeadore.textgram.custom_widgets.EmojisTabPageIndicator;

public class MainActivity extends el7rFragmentActivity
{
  public static Activity c;
  public static EditText editText;
  String TAG = "MainActivity";
  Handler UIHandler;
  Handler handler = new Handler();
  String layout = "phone";
  SharedPreferences settings;
  ImageButton smileysBtn;
  LinearLayout smileysLL;
  boolean smileysLoaded = false;

  public MainActivity()
  {
  }

  public static void goNext()
  {
    Intent localIntent = new Intent(c, StylingActivity.class);
    StylingActivity.theText = editText.getText();
    c.startActivity(localIntent);
  }

  // ERROR //
  public void onCreate(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 77	codeadore/textgram/el7rFragmentActivity:onCreate	(Landroid/os/Bundle;)V
    //   5: aload_0
    //   6: ldc 78
    //   8: invokevirtual 82	codeadore/textgram/MainActivity:setContentView	(I)V
    //   11: aload_0
    //   12: new 38	android/os/Handler
    //   15: dup
    //   16: invokespecial 39	android/os/Handler:<init>	()V
    //   19: putfield 84	codeadore/textgram/MainActivity:UIHandler	Landroid/os/Handler;
    //   22: aload_0
    //   23: putstatic 46	codeadore/textgram/MainActivity:c	Landroid/app/Activity;
    //   26: aload_0
    //   27: aload_0
    //   28: ldc 85
    //   30: invokevirtual 89	codeadore/textgram/MainActivity:findViewById	(I)Landroid/view/View;
    //   33: checkcast 91	android/widget/LinearLayout
    //   36: putfield 93	codeadore/textgram/MainActivity:smileysLL	Landroid/widget/LinearLayout;
    //   39: aload_0
    //   40: ldc 94
    //   42: invokevirtual 89	codeadore/textgram/MainActivity:findViewById	(I)Landroid/view/View;
    //   45: checkcast 55	android/widget/EditText
    //   48: putstatic 53	codeadore/textgram/MainActivity:editText	Landroid/widget/EditText;
    //   51: aload_0
    //   52: ldc 95
    //   54: invokevirtual 89	codeadore/textgram/MainActivity:findViewById	(I)Landroid/view/View;
    //   57: checkcast 97	android/widget/TextView
    //   60: astore_2
    //   61: aload_0
    //   62: aload_0
    //   63: ldc 99
    //   65: iconst_0
    //   66: invokevirtual 103	codeadore/textgram/MainActivity:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   69: putfield 105	codeadore/textgram/MainActivity:settings	Landroid/content/SharedPreferences;
    //   72: new 107	org/json/JSONObject
    //   75: dup
    //   76: aload_0
    //   77: getfield 105	codeadore/textgram/MainActivity:settings	Landroid/content/SharedPreferences;
    //   80: ldc 109
    //   82: ldc 111
    //   84: invokeinterface 117 3 0
    //   89: invokespecial 120	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   92: putstatic 126	codeadore/textgram/Settings:json	Lorg/json/JSONObject;
    //   95: aload_0
    //   96: invokevirtual 130	codeadore/textgram/MainActivity:getIntent	()Landroid/content/Intent;
    //   99: astore 4
    //   101: aload 4
    //   103: invokevirtual 134	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   106: astore 5
    //   108: ldc 136
    //   110: aload 4
    //   112: invokevirtual 140	android/content/Intent:getAction	()Ljava/lang/String;
    //   115: invokevirtual 146	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   118: ifeq +30 -> 148
    //   121: aload 5
    //   123: ldc 148
    //   125: invokevirtual 154	android/os/Bundle:containsKey	(Ljava/lang/String;)Z
    //   128: ifeq +20 -> 148
    //   131: aload 5
    //   133: ldc 148
    //   135: invokevirtual 157	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   138: astore 31
    //   140: getstatic 53	codeadore/textgram/MainActivity:editText	Landroid/widget/EditText;
    //   143: aload 31
    //   145: invokevirtual 161	android/widget/EditText:setText	(Ljava/lang/CharSequence;)V
    //   148: aload_0
    //   149: getfield 41	codeadore/textgram/MainActivity:handler	Landroid/os/Handler;
    //   152: astore 6
    //   154: new 163	codeadore/textgram/MainActivity$1
    //   157: dup
    //   158: aload_0
    //   159: invokespecial 166	codeadore/textgram/MainActivity$1:<init>	(Lcodeadore/textgram/MainActivity;)V
    //   162: astore 7
    //   164: aload 6
    //   166: aload 7
    //   168: ldc2_w 167
    //   171: invokevirtual 172	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
    //   174: pop
    //   175: aload_0
    //   176: getfield 176	codeadore/textgram/MainActivity:tracker	Lcom/google/android/apps/analytics/GoogleAnalyticsTracker;
    //   179: ldc 178
    //   181: invokevirtual 183	com/google/android/apps/analytics/GoogleAnalyticsTracker:trackPageView	(Ljava/lang/String;)V
    //   184: aload_0
    //   185: ldc 185
    //   187: iconst_0
    //   188: invokevirtual 103	codeadore/textgram/MainActivity:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   191: astore 9
    //   193: aload 9
    //   195: ldc 187
    //   197: iconst_1
    //   198: invokeinterface 191 3 0
    //   203: ifeq +45 -> 248
    //   206: aload_0
    //   207: new 44	android/content/Intent
    //   210: dup
    //   211: aload_0
    //   212: ldc 193
    //   214: invokespecial 51	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   217: invokevirtual 194	codeadore/textgram/MainActivity:startActivity	(Landroid/content/Intent;)V
    //   220: aload 9
    //   222: invokeinterface 198 1 0
    //   227: astore 27
    //   229: aload 27
    //   231: ldc 187
    //   233: iconst_0
    //   234: invokeinterface 204 3 0
    //   239: pop
    //   240: aload 27
    //   242: invokeinterface 208 1 0
    //   247: pop
    //   248: aload_0
    //   249: aload_0
    //   250: ldc 209
    //   252: invokevirtual 89	codeadore/textgram/MainActivity:findViewById	(I)Landroid/view/View;
    //   255: checkcast 211	android/widget/ImageButton
    //   258: putfield 213	codeadore/textgram/MainActivity:smileysBtn	Landroid/widget/ImageButton;
    //   261: aload_0
    //   262: aload_0
    //   263: ldc 85
    //   265: invokevirtual 89	codeadore/textgram/MainActivity:findViewById	(I)Landroid/view/View;
    //   268: checkcast 91	android/widget/LinearLayout
    //   271: putfield 93	codeadore/textgram/MainActivity:smileysLL	Landroid/widget/LinearLayout;
    //   274: aload_0
    //   275: getfield 93	codeadore/textgram/MainActivity:smileysLL	Landroid/widget/LinearLayout;
    //   278: invokevirtual 217	android/widget/LinearLayout:getVisibility	()I
    //   281: ifne +9 -> 290
    //   284: aload_0
    //   285: ldc 219
    //   287: putfield 36	codeadore/textgram/MainActivity:layout	Ljava/lang/String;
    //   290: aload_0
    //   291: ldc 220
    //   293: invokevirtual 89	codeadore/textgram/MainActivity:findViewById	(I)Landroid/view/View;
    //   296: checkcast 211	android/widget/ImageButton
    //   299: astore 11
    //   301: new 222	codeadore/textgram/MainActivity$2
    //   304: dup
    //   305: aload_0
    //   306: invokespecial 223	codeadore/textgram/MainActivity$2:<init>	(Lcodeadore/textgram/MainActivity;)V
    //   309: astore 12
    //   311: aload 11
    //   313: aload 12
    //   315: invokevirtual 227	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   318: aload_0
    //   319: ldc 228
    //   321: invokevirtual 89	codeadore/textgram/MainActivity:findViewById	(I)Landroid/view/View;
    //   324: checkcast 230	android/widget/Button
    //   327: astore 13
    //   329: new 232	codeadore/textgram/MainActivity$3
    //   332: dup
    //   333: aload_0
    //   334: invokespecial 233	codeadore/textgram/MainActivity$3:<init>	(Lcodeadore/textgram/MainActivity;)V
    //   337: astore 14
    //   339: aload 13
    //   341: aload 14
    //   343: invokevirtual 234	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   346: aload_0
    //   347: ldc 185
    //   349: iconst_0
    //   350: invokevirtual 103	codeadore/textgram/MainActivity:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   353: astore 15
    //   355: aload 9
    //   357: ldc 236
    //   359: iconst_1
    //   360: invokeinterface 191 3 0
    //   365: ifeq +31 -> 396
    //   368: aload 15
    //   370: invokeinterface 198 1 0
    //   375: astore 23
    //   377: aload 23
    //   379: ldc 236
    //   381: iconst_0
    //   382: invokeinterface 204 3 0
    //   387: pop
    //   388: aload 23
    //   390: invokeinterface 208 1 0
    //   395: pop
    //   396: aload_0
    //   397: getfield 213	codeadore/textgram/MainActivity:smileysBtn	Landroid/widget/ImageButton;
    //   400: ifnull +109 -> 509
    //   403: aload_0
    //   404: getfield 213	codeadore/textgram/MainActivity:smileysBtn	Landroid/widget/ImageButton;
    //   407: astore 21
    //   409: new 238	codeadore/textgram/MainActivity$4
    //   412: dup
    //   413: aload_0
    //   414: invokespecial 239	codeadore/textgram/MainActivity$4:<init>	(Lcodeadore/textgram/MainActivity;)V
    //   417: astore 22
    //   419: aload 21
    //   421: aload 22
    //   423: invokevirtual 227	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   426: aload_0
    //   427: invokevirtual 242	codeadore/textgram/MainActivity:setupSmileys	()V
    //   430: getstatic 53	codeadore/textgram/MainActivity:editText	Landroid/widget/EditText;
    //   433: astore 16
    //   435: new 244	codeadore/textgram/MainActivity$5
    //   438: dup
    //   439: aload_0
    //   440: aload_2
    //   441: invokespecial 247	codeadore/textgram/MainActivity$5:<init>	(Lcodeadore/textgram/MainActivity;Landroid/widget/TextView;)V
    //   444: astore 17
    //   446: aload 16
    //   448: aload 17
    //   450: invokevirtual 251	android/widget/EditText:addTextChangedListener	(Landroid/text/TextWatcher;)V
    //   453: aload_0
    //   454: getfield 84	codeadore/textgram/MainActivity:UIHandler	Landroid/os/Handler;
    //   457: astore 18
    //   459: new 253	codeadore/textgram/MainActivity$6
    //   462: dup
    //   463: aload_0
    //   464: invokespecial 254	codeadore/textgram/MainActivity$6:<init>	(Lcodeadore/textgram/MainActivity;)V
    //   467: astore 19
    //   469: aload 18
    //   471: aload 19
    //   473: ldc2_w 167
    //   476: invokevirtual 172	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
    //   479: pop
    //   480: return
    //   481: astore_3
    //   482: aload_3
    //   483: invokevirtual 257	org/json/JSONException:printStackTrace	()V
    //   486: goto -391 -> 95
    //   489: astore 26
    //   491: aload 26
    //   493: invokevirtual 258	java/lang/Exception:printStackTrace	()V
    //   496: goto -276 -> 220
    //   499: astore 10
    //   501: aload 10
    //   503: invokevirtual 258	java/lang/Exception:printStackTrace	()V
    //   506: goto -216 -> 290
    //   509: aload_0
    //   510: invokevirtual 242	codeadore/textgram/MainActivity:setupSmileys	()V
    //   513: goto -87 -> 426
    //   516: astore 30
    //   518: goto -370 -> 148
    //
    // Exception table:
    //   from	to	target	type
    //   72	95	481	org/json/JSONException
    //   206	220	489	java/lang/Exception
    //   274	290	499	java/lang/Exception
    //   131	148	516	java/lang/Exception
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    super.onCreateOptionsMenu(paramMenu);
    paramMenu.findItem(2131099872).setVisible(true);
    return true;
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((this.layout == "phone") && (paramInt == 4) && (this.smileysLL.getVisibility() == 0))
    {
      toggleEmojis(false);
      return false;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onResume()
  {
    super.onResume();
    Settings.currentEmojisActivity = "MainActivity";
  }

  public void setupSmileys()
  {
    Settings.currentEmojisActivity = "MainActivity";
    ViewPager localViewPager = (ViewPager)findViewById(2131099742);
    localViewPager.setAdapter(new EmojisPagerAdapter(getSupportFragmentManager()));
    ((EmojisTabPageIndicator)findViewById(2131099740)).setViewPager(localViewPager);
    ((ImageButton)findViewById(2131099741)).setOnClickListener(new MainActivity.7(this));
  }

  protected void toggleEmojis(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.smileysBtn.setBackgroundResource(2130837614);
      this.smileysLL.setVisibility(0);
      Animation localAnimation2 = AnimationUtils.loadAnimation(this, 2130968588);
      this.smileysLL.startAnimation(localAnimation2);
      ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 0);
      return;
    }
    this.smileysBtn.setBackgroundResource(2130837613);
    Animation localAnimation1 = AnimationUtils.loadAnimation(this, 2130968583);
    this.smileysLL.startAnimation(localAnimation1);
    this.smileysLL.setVisibility(8);
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.MainActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
