package com.facebook.widget;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.FacebookException;
import com.facebook.a.d;
import com.facebook.a.g;
import com.facebook.internal.ad;
import com.facebook.internal.y;

public final class h extends Dialog
{
  private String a;
  private l b;
  private WebView c;
  private ProgressDialog d;
  private ImageView e;
  private FrameLayout f;
  private boolean g = false;
  private boolean h = false;

  public h(Context paramContext, String paramString, Bundle paramBundle, int paramInt, l paraml)
  {
    super(paramContext, paramInt);
    if (paramBundle == null)
      paramBundle = new Bundle();
    paramBundle.putString("display", "touch");
    paramBundle.putString("type", "user_agent");
    this.a = ad.a(y.a(), "dialog/" + paramString, paramBundle).toString();
    this.b = paraml;
  }

  private static int a(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    double d1 = 0.5D;
    int i = (int)(paramInt1 / paramFloat);
    if (i <= paramInt2)
      d1 = 1.0D;
    while (true)
    {
      return (int)(d1 * paramInt1);
      if (i < paramInt3)
        d1 += d1 * (paramInt3 - i / paramInt3 - paramInt2);
    }
  }

  private void a(Throwable paramThrowable)
  {
    if ((this.b != null) && (!this.g))
    {
      this.g = true;
      if (!(paramThrowable instanceof FacebookException))
        break label43;
    }
    label43: for (FacebookException localFacebookException = (FacebookException)paramThrowable; ; localFacebookException = new FacebookException(paramThrowable))
    {
      this.b.a(null, localFacebookException);
      return;
    }
  }

  public final void dismiss()
  {
    if (this.c != null)
      this.c.stopLoading();
    if (!this.h)
    {
      if (this.d.isShowing())
        this.d.dismiss();
      super.dismiss();
    }
  }

  public final void onAttachedToWindow()
  {
    this.h = false;
    super.onAttachedToWindow();
  }

  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setOnCancelListener(new h.1(this));
    this.d = new ProgressDialog(getContext());
    this.d.requestWindowFeature(1);
    this.d.setMessage(getContext().getString(g.c));
    this.d.setOnCancelListener(new h.2(this));
    requestWindowFeature(1);
    this.f = new FrameLayout(getContext());
    Display localDisplay = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localDisplay.getMetrics(localDisplayMetrics);
    int i;
    if (localDisplayMetrics.widthPixels < localDisplayMetrics.heightPixels)
    {
      i = localDisplayMetrics.widthPixels;
      if (localDisplayMetrics.widthPixels >= localDisplayMetrics.heightPixels)
        break label525;
    }
    label525: for (int j = localDisplayMetrics.heightPixels; ; j = localDisplayMetrics.widthPixels)
    {
      int k = Math.min(a(i, localDisplayMetrics.density, 480, 800), localDisplayMetrics.widthPixels);
      int m = Math.min(a(j, localDisplayMetrics.density, 800, 1280), localDisplayMetrics.heightPixels);
      getWindow().setLayout(k, m);
      getWindow().setGravity(17);
      getWindow().setSoftInputMode(16);
      this.e = new ImageView(getContext());
      this.e.setOnClickListener(new h.3(this));
      Drawable localDrawable = getContext().getResources().getDrawable(d.b);
      this.e.setImageDrawable(localDrawable);
      this.e.setVisibility(4);
      int n = 1 + this.e.getDrawable().getIntrinsicWidth() / 2;
      LinearLayout localLinearLayout = new LinearLayout(getContext());
      this.c = new WebView(getContext());
      this.c.setVerticalScrollBarEnabled(false);
      this.c.setHorizontalScrollBarEnabled(false);
      this.c.setWebViewClient(new k(this, (byte)0));
      this.c.getSettings().setJavaScriptEnabled(true);
      this.c.loadUrl(this.a);
      this.c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
      this.c.setVisibility(4);
      this.c.getSettings().setSavePassword(false);
      localLinearLayout.setPadding(n, n, n, n);
      localLinearLayout.addView(this.c);
      localLinearLayout.setBackgroundColor(-872415232);
      this.f.addView(localLinearLayout);
      this.f.addView(this.e, new ViewGroup.LayoutParams(-2, -2));
      setContentView(this.f);
      return;
      i = localDisplayMetrics.heightPixels;
      break;
    }
  }

  public final void onDetachedFromWindow()
  {
    this.h = true;
    super.onDetachedFromWindow();
  }
}

/* Location:
 * Qualified Name:     com.facebook.widget.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
