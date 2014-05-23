package codeadore.textgram;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class PrepareBitmapActivity extends el7rActivity
  implements View.OnTouchListener
{
  String bitmapURI;
  int canvasHeight = 500;
  int canvasWidth = 500;
  Handler handler = new Handler();
  SurfaceHolder holder;
  int id;
  boolean isItOK = false;
  float lastTouchX = 0.0F;
  float lastTouchY = 0.0F;
  boolean pickerLoaded = false;
  boolean pinSelected = false;
  Bitmap preResizePinActiveBitmap;
  Bitmap preResizePinBitmap;
  int rectEX = 300;
  int rectEY = 300;
  int rectSX = 0;
  int rectSY = 0;
  boolean rectSelected = false;
  Bitmap resizePinActiveBitmap;
  Bitmap resizePinBitmap;
  int rotation = 0;
  int screenHeight = 480;
  int screenWidth = 320;
  Thread t = null;
  Bitmap tempBitmap = null;
  Bitmap theBitmap = null;
  boolean update = false;
  PrepareBitmapActivity.OurView v;

  public PrepareBitmapActivity()
  {
  }

  public void applyBitmap(String paramString)
  {
    this.bitmapURI = paramString.toString();
    this.theBitmap = Utilities.getBitmapFromURI(Uri.parse(paramString), this);
    if (this.theBitmap == null)
    {
      Toast.makeText(this.thisActivity, "Picture not found", 0).show();
      return;
    }
    int j;
    int i;
    if (this.theBitmap.getWidth() > this.theBitmap.getHeight())
      if (this.canvasWidth > this.canvasHeight)
      {
        j = this.canvasHeight;
        i = j * this.theBitmap.getWidth() / this.theBitmap.getHeight();
      }
    while (true)
    {
      this.tempBitmap = Bitmap.createScaledBitmap(this.theBitmap, i, j, true);
      this.rectSX = (this.canvasWidth / 2 - i / 2);
      this.rectEX = (i + this.rectSX);
      this.rectSY = (this.canvasHeight / 2 - j / 2);
      this.rectEY = (j + this.rectSY);
      requestUpdate();
      return;
      i = this.canvasWidth;
      j = i * this.theBitmap.getHeight() / this.theBitmap.getWidth();
      continue;
      if (this.theBitmap.getHeight() > this.theBitmap.getWidth())
      {
        j = this.canvasHeight;
        i = j * this.theBitmap.getWidth() / this.theBitmap.getHeight();
      }
      else if (this.canvasWidth > this.canvasHeight)
      {
        i = this.canvasHeight;
        j = this.canvasHeight;
      }
      else
      {
        i = this.canvasWidth;
        j = this.canvasWidth;
      }
    }
  }

  public void applyRotation(int paramInt)
  {
    Matrix localMatrix = new Matrix();
    localMatrix.postRotate(90.0F);
    this.theBitmap = Bitmap.createBitmap(this.theBitmap, 0, 0, this.theBitmap.getWidth(), this.theBitmap.getHeight(), localMatrix, true);
    int j;
    int i;
    if (this.theBitmap.getWidth() > this.theBitmap.getHeight())
      if (this.canvasWidth > this.canvasHeight)
      {
        j = this.canvasHeight;
        i = j * this.theBitmap.getWidth() / this.theBitmap.getHeight();
      }
    while (true)
    {
      this.tempBitmap = Bitmap.createScaledBitmap(this.theBitmap, i, j, true);
      this.rectSX = (this.canvasWidth / 2 - i / 2);
      this.rectEX = (i + this.rectSX);
      this.rectSY = (this.canvasHeight / 2 - j / 2);
      this.rectEY = (j + this.rectSY);
      requestUpdate();
      return;
      i = this.canvasWidth;
      j = i * this.theBitmap.getHeight() / this.theBitmap.getWidth();
      continue;
      if (this.theBitmap.getHeight() > this.theBitmap.getWidth())
      {
        j = this.canvasHeight;
        i = j * this.theBitmap.getWidth() / this.theBitmap.getHeight();
      }
      else if (this.canvasWidth > this.canvasHeight)
      {
        i = this.canvasHeight;
        j = this.canvasHeight;
      }
      else
      {
        i = this.canvasWidth;
        j = this.canvasWidth;
      }
    }
  }

  // ERROR //
  public void done()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 66	codeadore/textgram/PrepareBitmapActivity:canvasWidth	I
    //   4: aload_0
    //   5: getfield 68	codeadore/textgram/PrepareBitmapActivity:canvasHeight	I
    //   8: getstatic 166	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   11: invokestatic 169	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   14: astore_1
    //   15: new 171	android/graphics/Canvas
    //   18: dup
    //   19: aload_1
    //   20: invokespecial 174	android/graphics/Canvas:<init>	(Landroid/graphics/Bitmap;)V
    //   23: astore_2
    //   24: aload_2
    //   25: new 176	android/graphics/PaintFlagsDrawFilter
    //   28: dup
    //   29: iconst_0
    //   30: iconst_2
    //   31: invokespecial 179	android/graphics/PaintFlagsDrawFilter:<init>	(II)V
    //   34: invokevirtual 183	android/graphics/Canvas:setDrawFilter	(Landroid/graphics/DrawFilter;)V
    //   37: aload_2
    //   38: sipush 255
    //   41: sipush 255
    //   44: sipush 255
    //   47: invokevirtual 187	android/graphics/Canvas:drawRGB	(III)V
    //   50: new 189	android/graphics/Paint
    //   53: dup
    //   54: invokespecial 190	android/graphics/Paint:<init>	()V
    //   57: astore_3
    //   58: aload_3
    //   59: iconst_1
    //   60: invokevirtual 194	android/graphics/Paint:setFilterBitmap	(Z)V
    //   63: aload_3
    //   64: iconst_1
    //   65: invokevirtual 197	android/graphics/Paint:setDither	(Z)V
    //   68: aload_0
    //   69: getfield 55	codeadore/textgram/PrepareBitmapActivity:tempBitmap	Landroid/graphics/Bitmap;
    //   72: ifnull +97 -> 169
    //   75: new 147	android/graphics/Matrix
    //   78: dup
    //   79: invokespecial 148	android/graphics/Matrix:<init>	()V
    //   82: astore 4
    //   84: aload_0
    //   85: getfield 66	codeadore/textgram/PrepareBitmapActivity:canvasWidth	I
    //   88: iconst_2
    //   89: idiv
    //   90: i2f
    //   91: fstore 5
    //   93: aload_0
    //   94: getfield 68	codeadore/textgram/PrepareBitmapActivity:canvasHeight	I
    //   97: iconst_2
    //   98: idiv
    //   99: i2f
    //   100: fstore 6
    //   102: aload 4
    //   104: aload_0
    //   105: getfield 55	codeadore/textgram/PrepareBitmapActivity:tempBitmap	Landroid/graphics/Bitmap;
    //   108: invokevirtual 133	android/graphics/Bitmap:getWidth	()I
    //   111: ineg
    //   112: iconst_2
    //   113: idiv
    //   114: i2f
    //   115: aload_0
    //   116: getfield 55	codeadore/textgram/PrepareBitmapActivity:tempBitmap	Landroid/graphics/Bitmap;
    //   119: invokevirtual 136	android/graphics/Bitmap:getHeight	()I
    //   122: ineg
    //   123: iconst_2
    //   124: idiv
    //   125: i2f
    //   126: invokevirtual 201	android/graphics/Matrix:postTranslate	(FF)Z
    //   129: pop
    //   130: aload_0
    //   131: getfield 70	codeadore/textgram/PrepareBitmapActivity:rotation	I
    //   134: ifeq +155 -> 289
    //   137: aload 4
    //   139: aload_0
    //   140: getfield 70	codeadore/textgram/PrepareBitmapActivity:rotation	I
    //   143: i2f
    //   144: invokevirtual 153	android/graphics/Matrix:postRotate	(F)Z
    //   147: pop
    //   148: aload 4
    //   150: fload 5
    //   152: fload 6
    //   154: invokevirtual 201	android/graphics/Matrix:postTranslate	(FF)Z
    //   157: pop
    //   158: aload_2
    //   159: aload_0
    //   160: getfield 55	codeadore/textgram/PrepareBitmapActivity:tempBitmap	Landroid/graphics/Bitmap;
    //   163: aload 4
    //   165: aconst_null
    //   166: invokevirtual 205	android/graphics/Canvas:drawBitmap	(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
    //   169: aload_0
    //   170: getfield 72	codeadore/textgram/PrepareBitmapActivity:rectSX	I
    //   173: istore 10
    //   175: aload_0
    //   176: getfield 74	codeadore/textgram/PrepareBitmapActivity:rectSY	I
    //   179: istore 11
    //   181: iload 10
    //   183: ifge +6 -> 189
    //   186: iconst_0
    //   187: istore 10
    //   189: iload 11
    //   191: ifge +6 -> 197
    //   194: iconst_0
    //   195: istore 11
    //   197: aload_0
    //   198: getfield 76	codeadore/textgram/PrepareBitmapActivity:rectEX	I
    //   201: aload_0
    //   202: getfield 72	codeadore/textgram/PrepareBitmapActivity:rectSX	I
    //   205: isub
    //   206: istore 12
    //   208: aload_0
    //   209: getfield 78	codeadore/textgram/PrepareBitmapActivity:rectEY	I
    //   212: aload_0
    //   213: getfield 74	codeadore/textgram/PrepareBitmapActivity:rectSY	I
    //   216: isub
    //   217: istore 13
    //   219: iload 12
    //   221: aload_1
    //   222: invokevirtual 133	android/graphics/Bitmap:getWidth	()I
    //   225: if_icmple +9 -> 234
    //   228: aload_1
    //   229: invokevirtual 133	android/graphics/Bitmap:getWidth	()I
    //   232: istore 12
    //   234: iload 13
    //   236: aload_1
    //   237: invokevirtual 136	android/graphics/Bitmap:getHeight	()I
    //   240: if_icmple +9 -> 249
    //   243: aload_1
    //   244: invokevirtual 136	android/graphics/Bitmap:getHeight	()I
    //   247: istore 13
    //   249: aload_1
    //   250: iload 10
    //   252: iload 11
    //   254: iload 12
    //   256: iload 13
    //   258: invokestatic 208	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   261: astore 17
    //   263: aload 17
    //   265: astore 15
    //   267: ldc 210
    //   269: ifnull +19 -> 288
    //   272: aload 15
    //   274: putstatic 215	codeadore/textgram/Settings:prepareReturnBitmap	Landroid/graphics/Bitmap;
    //   277: aload_0
    //   278: getfield 217	codeadore/textgram/PrepareBitmapActivity:id	I
    //   281: putstatic 220	codeadore/textgram/Settings:prepareReturnID	I
    //   284: aload_0
    //   285: invokevirtual 223	codeadore/textgram/PrepareBitmapActivity:finish	()V
    //   288: return
    //   289: aload 4
    //   291: fconst_0
    //   292: invokevirtual 153	android/graphics/Matrix:postRotate	(F)Z
    //   295: pop
    //   296: goto -148 -> 148
    //   299: astore 14
    //   301: aload 14
    //   303: invokevirtual 226	java/lang/Exception:printStackTrace	()V
    //   306: aload_1
    //   307: iload 10
    //   309: iload 11
    //   311: iload 10
    //   313: bipush 100
    //   315: iadd
    //   316: iload 11
    //   318: bipush 100
    //   320: iadd
    //   321: invokestatic 208	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   324: astore 15
    //   326: goto -59 -> 267
    //   329: astore 16
    //   331: aload 16
    //   333: invokevirtual 226	java/lang/Exception:printStackTrace	()V
    //   336: return
    //
    // Exception table:
    //   from	to	target	type
    //   249	263	299	java/lang/Exception
    //   272	288	329	java/lang/Exception
  }

  public float fixToSize(float paramFloat)
  {
    return paramFloat;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 == -1)
    {
      applyBitmap(paramIntent.getData().toString());
      return;
    }
    finish();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.handler.postDelayed(new PrepareBitmapActivity.5(this), 500L);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903070);
    LinearLayout localLinearLayout = (LinearLayout)findViewById(2131099743);
    this.preResizePinBitmap = Utilities.getBitmapFromPath(this, "[assets]/data/resize_pin.png");
    this.resizePinBitmap = Bitmap.createScaledBitmap(this.preResizePinBitmap, (int)fixToSize(100.0F), (int)fixToSize(100.0F), true);
    this.preResizePinActiveBitmap = Utilities.getBitmapFromPath(this, "[assets]/data/resize_pin_active.png");
    this.resizePinActiveBitmap = Bitmap.createScaledBitmap(this.preResizePinActiveBitmap, (int)fixToSize(100.0F), (int)fixToSize(100.0F), true);
    this.v = new PrepareBitmapActivity.OurView(this, this);
    this.v.setOnTouchListener(this);
    this.v.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    localLinearLayout.addView(this.v);
    this.id = getIntent().getExtras().getInt("id");
    ImageButton localImageButton1 = (ImageButton)findViewById(2131099745);
    ImageButton localImageButton2 = (ImageButton)findViewById(2131099744);
    localImageButton1.setOnClickListener(new PrepareBitmapActivity.1(this));
    localImageButton2.setOnClickListener(new PrepareBitmapActivity.2(this));
    ((Button)findViewById(2131099746)).setOnClickListener(new PrepareBitmapActivity.3(this));
    if (paramBundle != null)
    {
      this.id = paramBundle.getInt("id");
      this.handler.postDelayed(new PrepareBitmapActivity.4(this, paramBundle), 500L);
    }
  }

  protected void onPause()
  {
    super.onPause();
    this.v.pause();
  }

  protected void onResume()
  {
    super.onResume();
    this.v.resume();
    requestUpdate();
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putString("bitmapURI", this.bitmapURI);
    paramBundle.putInt("id", this.id);
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = this.canvasWidth / 2 - this.tempBitmap.getWidth() / 2;
    int j = this.canvasWidth / 2 + this.tempBitmap.getWidth() / 2;
    int k = this.canvasHeight / 2 - this.tempBitmap.getHeight() / 2;
    int m = this.canvasHeight / 2 + this.tempBitmap.getHeight() / 2;
    int n = this.rectEX - this.resizePinActiveBitmap.getWidth() / 2;
    int i1 = this.rectEY - this.resizePinActiveBitmap.getHeight() / 2;
    if (n > this.canvasWidth - this.resizePinActiveBitmap.getWidth())
      n = this.canvasWidth - this.resizePinActiveBitmap.getWidth();
    if (i1 > this.canvasHeight - this.resizePinActiveBitmap.getHeight())
      i1 = this.canvasHeight - this.resizePinActiveBitmap.getHeight();
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      return true;
      if ((paramMotionEvent.getX() > this.rectSX) && (paramMotionEvent.getX() < this.rectEX) && (paramMotionEvent.getY() > this.rectSY) && (paramMotionEvent.getY() < this.rectEY))
        this.rectSelected = true;
      if ((paramMotionEvent.getX() > n + this.resizePinActiveBitmap.getWidth() - fixToSize(100.0F) / 2.0F) && (paramMotionEvent.getX() < n + this.resizePinActiveBitmap.getWidth() + fixToSize(100.0F) / 2.0F) && (paramMotionEvent.getY() > i1 + this.resizePinActiveBitmap.getHeight() - fixToSize(100.0F) / 2.0F) && (paramMotionEvent.getY() < i1 + this.resizePinActiveBitmap.getHeight() + fixToSize(100.0F) / 2.0F))
      {
        this.pinSelected = true;
        requestUpdate();
      }
      this.lastTouchY = paramMotionEvent.getY();
      this.lastTouchX = paramMotionEvent.getX();
      continue;
      if (this.rectSelected)
      {
        if ((this.rectSX - (this.lastTouchX - paramMotionEvent.getX()) > i) && (this.rectEX - (this.lastTouchX - paramMotionEvent.getX()) <= j))
        {
          this.rectSX = (int)(this.rectSX - (this.lastTouchX - paramMotionEvent.getX()));
          this.rectEX = (int)(this.rectEX - (this.lastTouchX - paramMotionEvent.getX()));
        }
        if ((this.rectSY - (this.lastTouchY - paramMotionEvent.getY()) > k) && (this.rectEY - (this.lastTouchY - paramMotionEvent.getY()) <= m))
        {
          this.rectSY = (int)(this.rectSY - (this.lastTouchY - paramMotionEvent.getY()));
          this.rectEY = (int)(this.rectEY - (this.lastTouchY - paramMotionEvent.getY()));
        }
        this.lastTouchY = paramMotionEvent.getY();
        this.lastTouchX = paramMotionEvent.getX();
        requestUpdate();
      }
      if (this.pinSelected)
      {
        if ((paramMotionEvent.getX() > this.rectSX + fixToSize(200.0F)) && (paramMotionEvent.getX() < j))
        {
          if (this.lastTouchX == paramMotionEvent.getX())
            this.lastTouchX = (1.0F + this.lastTouchX);
          this.rectEX = (int)(this.rectEX - (this.lastTouchX - paramMotionEvent.getX()));
        }
        if ((paramMotionEvent.getY() > this.rectSY + fixToSize(200.0F)) && (paramMotionEvent.getY() < m))
        {
          if (this.lastTouchY == paramMotionEvent.getY())
            this.lastTouchY = (1.0F + this.lastTouchY);
          this.rectEY = (int)(this.rectEY - (this.lastTouchY - paramMotionEvent.getY()));
        }
        this.lastTouchY = paramMotionEvent.getY();
        this.lastTouchX = paramMotionEvent.getX();
        requestUpdate();
        continue;
        this.rectSelected = false;
        this.pinSelected = false;
        requestUpdate();
      }
    }
  }

  public void requestUpdate()
  {
    this.update = true;
  }

  public float resetFixedSize(float paramFloat)
  {
    int i = this.canvasWidth;
    if (this.screenWidth < this.screenHeight);
    for (int j = this.screenWidth; ; j = this.screenHeight)
    {
      String str = String.valueOf(100.0F * (paramFloat / j) / 100.0F * i);
      return Float.valueOf(str.substring(0, str.lastIndexOf("."))).floatValue();
    }
  }

  public int resetFixedSize(int paramInt)
  {
    int i = this.canvasWidth;
    if (this.screenWidth < this.screenHeight);
    for (int j = this.screenWidth; ; j = this.screenHeight)
    {
      String str = String.valueOf(100.0F * (paramInt / j) / 100.0F * i);
      return Integer.valueOf(str.substring(0, str.lastIndexOf("."))).intValue();
    }
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.PrepareBitmapActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
