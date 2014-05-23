package com.google.ads.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.ads.AdActivity;
import com.google.ads.AdSize;
import com.google.ads.ak;
import com.google.ads.n;
import com.google.ads.util.AdUtil;
import com.google.ads.util.IcsUtil.a;
import com.google.ads.util.b;
import com.google.ads.util.g;
import com.google.ads.util.g.a;
import com.google.ads.util.h;
import com.google.ads.util.i.b;
import com.google.ads.util.i.c;
import java.lang.ref.WeakReference;

public class AdWebView extends WebView
{
  protected final n a;
  private WeakReference<AdActivity> b;
  private AdSize c;
  private boolean d;
  private boolean e;
  private boolean f;

  public AdWebView(n paramn, AdSize paramAdSize)
  {
    super((Context)paramn.f.a());
    this.a = paramn;
    this.c = paramAdSize;
    this.b = null;
    this.d = false;
    this.e = false;
    this.f = false;
    setBackgroundColor(0);
    AdUtil.a(this);
    WebSettings localWebSettings = getSettings();
    localWebSettings.setSupportMultipleWindows(false);
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setSavePassword(false);
    setDownloadListener(new AdWebView.1(this));
    if (AdUtil.a >= 17)
      h.a(localWebSettings, paramn);
    do
      while (true)
      {
        setScrollBarStyle(33554432);
        if (AdUtil.a < 14)
          break;
        setWebChromeClient(new IcsUtil.a(paramn));
        return;
        if (AdUtil.a >= 11)
          g.a(localWebSettings, paramn);
      }
    while (AdUtil.a < 11);
    setWebChromeClient(new g.a(paramn));
  }

  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      setOnTouchListener(new AdWebView.2(this));
      return;
    }
    setOnTouchListener(null);
  }

  // ERROR //
  public void destroy()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 118	android/webkit/WebView:destroy	()V
    //   4: aload_0
    //   5: new 120	android/webkit/WebViewClient
    //   8: dup
    //   9: invokespecial 122	android/webkit/WebViewClient:<init>	()V
    //   12: invokevirtual 126	com/google/ads/internal/AdWebView:setWebViewClient	(Landroid/webkit/WebViewClient;)V
    //   15: return
    //   16: astore_1
    //   17: ldc 128
    //   19: aload_1
    //   20: invokestatic 133	com/google/ads/util/b:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   23: goto -19 -> 4
    //   26: astore_2
    //   27: return
    //
    // Exception table:
    //   from	to	target	type
    //   0	4	16	java/lang/Throwable
    //   4	15	26	java/lang/Throwable
  }

  public void f()
  {
    AdActivity localAdActivity = i();
    if (localAdActivity != null)
      localAdActivity.finish();
  }

  public void g()
  {
    if (AdUtil.a >= 11)
      g.a(this);
    this.e = true;
  }

  public void h()
  {
    if ((this.e) && (AdUtil.a >= 11))
      g.b(this);
    this.e = false;
  }

  public AdActivity i()
  {
    if (this.b != null)
      return (AdActivity)this.b.get();
    return null;
  }

  public boolean j()
  {
    return this.f;
  }

  public boolean k()
  {
    return this.e;
  }

  public void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    try
    {
      super.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
      return;
    }
    catch (Throwable localThrowable)
    {
      b.d("An error occurred while loading data in AdWebView:", localThrowable);
    }
  }

  public void loadUrl(String paramString)
  {
    try
    {
      super.loadUrl(paramString);
      return;
    }
    catch (Throwable localThrowable)
    {
      b.d("An error occurred while loading a URL in AdWebView:", localThrowable);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 2147483647;
    try
    {
      if (isInEditMode())
        super.onMeasure(paramInt1, paramInt2);
      while (true)
      {
        return;
        if ((this.c != null) && (!this.d))
          break;
        super.onMeasure(paramInt1, paramInt2);
      }
    }
    finally
    {
    }
    int j = View.MeasureSpec.getMode(paramInt1);
    int k = View.MeasureSpec.getSize(paramInt1);
    int m = View.MeasureSpec.getMode(paramInt2);
    int n = View.MeasureSpec.getSize(paramInt2);
    float f1 = getContext().getResources().getDisplayMetrics().density;
    int i1 = (int)(f1 * this.c.getWidth());
    int i2 = (int)(f1 * this.c.getHeight());
    if (j != -2147483648)
      if (j == 1073741824)
        break label227;
    while (true)
    {
      label135: b.b("Not enough space to show ad! Wants: <" + i1 + ", " + i2 + ">, Has: <" + k + ", " + n + ">");
      setVisibility(8);
      setMeasuredDimension(k, n);
      break;
      label227: label231: 
      do
      {
        setMeasuredDimension(i1, i2);
        break;
        int i3 = i;
        break label231;
        i3 = k;
        if ((m == -2147483648) || (m == 1073741824))
          i = n;
        if (i1 - f1 * 6.0F > i3)
          break label135;
      }
      while (i2 <= i);
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    ak localak = (ak)this.a.r.a();
    if (localak != null)
      localak.a(paramMotionEvent);
    return super.onTouchEvent(paramMotionEvent);
  }

  public void setAdActivity(AdActivity paramAdActivity)
  {
    this.b = new WeakReference(paramAdActivity);
  }

  public void setAdSize(AdSize paramAdSize)
  {
    try
    {
      this.c = paramAdSize;
      requestLayout();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void setCustomClose(boolean paramBoolean)
  {
    this.f = paramBoolean;
    if (this.b != null)
    {
      AdActivity localAdActivity = (AdActivity)this.b.get();
      if (localAdActivity != null)
        localAdActivity.setCustomClose(paramBoolean);
    }
  }

  public void setIsExpandedMraid(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public void stopLoading()
  {
    try
    {
      super.stopLoading();
      return;
    }
    catch (Throwable localThrowable)
    {
      b.d("An error occurred while stopping loading in AdWebView:", localThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.internal.AdWebView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
