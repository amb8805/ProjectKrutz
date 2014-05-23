package com.spotify.mobile.android.ui.fragments;

import android.app.AlertDialog;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.mobile.android.util.bp;

public abstract class aa extends Fragment
{
  private Runnable Y;
  private int Z = 0;
  private WebView a;
  private boolean aa = false;
  private boolean ab = false;
  private boolean ac = false;
  private View b;
  private ProgressBar c;
  private TextView d;
  private TextView e;
  private AlertDialog f;
  private WebView g;
  private final Handler h = new Handler();
  private Runnable i;

  public aa()
  {
  }

  private void b(int paramInt)
  {
    int j = 1;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.Z);
    arrayOfObject[j] = Integer.valueOf(paramInt);
    bp.c("Changing state %d -> %d", arrayOfObject);
    this.Z = paramInt;
    int i1;
    label88: int n;
    label116: int m;
    label144: View localView;
    int k;
    switch (paramInt)
    {
    case 0:
    case 2:
    default:
      if (this.a != null)
      {
        WebView localWebView = this.a;
        if (j != 0)
        {
          i1 = 0;
          localWebView.setVisibility(i1);
        }
      }
      else
      {
        if (this.d != null)
        {
          TextView localTextView2 = this.d;
          if (j == 0)
            break label197;
          n = 8;
          localTextView2.setVisibility(n);
        }
        if (this.e != null)
        {
          TextView localTextView1 = this.e;
          if (j == 0)
            break label203;
          m = 8;
          localTextView1.setVisibility(m);
        }
        if (this.b != null)
        {
          localView = this.b;
          k = 0;
          if (paramInt != 3)
            break label209;
        }
      }
    case 1:
    case 3:
    }
    while (true)
    {
      localView.setVisibility(k);
      return;
      j = 0;
      break;
      j = 0;
      break;
      i1 = 8;
      break label88;
      label197: n = 0;
      break label116;
      label203: m = 0;
      break label144;
      label209: k = 8;
    }
  }

  private void d(boolean paramBoolean)
  {
    this.ac = paramBoolean;
    if (paramBoolean)
    {
      this.c.setVisibility(0);
      this.h.removeCallbacks(this.i);
      this.i = null;
    }
    while (this.i != null)
      return;
    this.i = new aa.5(this);
    this.h.postDelayed(this.i, 100L);
  }

  public boolean C()
  {
    if (this.a == null);
    while (!this.a.canGoBack())
      return false;
    this.a.goBack();
    return true;
  }

  protected final WebView D()
  {
    return this.a;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    Object[] arrayOfObject = new Object[1];
    String str;
    FragmentActivity localFragmentActivity;
    View localView;
    if (this.g == null)
    {
      str = "";
      arrayOfObject[0] = str;
      bp.c("onCreateView()%s", arrayOfObject);
      localFragmentActivity = i();
      localView = paramLayoutInflater.inflate(2130903152, paramViewGroup, false);
      this.b = localView.findViewById(2131362443);
      this.b.setOnClickListener(new aa.1(this));
      if (this.g == null)
        break label225;
      this.a = this.g;
      this.g = null;
    }
    while (true)
    {
      ((ViewGroup)localView.findViewById(2131362440)).addView(this.a, -1, -1);
      this.d = ((TextView)localView.findViewById(2131362441));
      this.e = ((TextView)localView.findViewById(2131362442));
      this.c = ((ProgressBar)localView.findViewById(2131362406));
      d(this.ac);
      b(this.Z);
      if ((this.Z == 0) || (this.Z == 1))
      {
        this.Y = new aa.2(this);
        this.h.postDelayed(this.Y, 1000L);
        b();
      }
      return localView;
      str = " (using retained webview)";
      break;
      label225: this.a = new WebView(localFragmentActivity);
      this.a.getSettings().setJavaScriptEnabled(true);
      this.a.setWebChromeClient(new aa.3(this));
      this.a.setWebViewClient(new aa.4(this));
    }
  }

  protected void a(String paramString)
  {
  }

  protected boolean a(Uri paramUri)
  {
    return false;
  }

  protected abstract void b();

  protected final void b(String paramString)
  {
    this.h.removeCallbacks(this.Y);
    if ((this.Z == 0) || (this.Z == 1))
    {
      b(2);
      if (this.a != null)
        this.a.loadUrl(paramString);
    }
  }

  public final void e()
  {
    bp.c("onDestroyView()", new Object[0]);
    super.e();
    this.b = null;
    this.d = null;
    this.e = null;
    if (this.a != null)
    {
      if (s())
      {
        ViewParent localViewParent = this.a.getParent();
        if (localViewParent != null)
        {
          ((ViewGroup)localViewParent).removeView(this.a);
          this.g = this.a;
        }
      }
      this.a = null;
    }
    if (this.f != null)
    {
      this.f.cancel();
      this.f = null;
    }
  }

  public void y()
  {
    super.y();
    if (this.a != null)
    {
      this.a.setWebChromeClient(null);
      this.a.setWebViewClient(null);
      this.a = null;
    }
    if (this.Y != null)
    {
      this.h.removeCallbacks(this.Y);
      this.Y = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.aa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
