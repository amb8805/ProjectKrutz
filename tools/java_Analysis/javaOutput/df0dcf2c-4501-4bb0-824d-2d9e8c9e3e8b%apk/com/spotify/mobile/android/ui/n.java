package com.spotify.mobile.android.ui;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.g;
import android.support.v4.app.l;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.android.paste.graphics.d;
import com.spotify.mobile.android.util.ds;

public final class n
{
  private Fragment a;
  private p b;
  private View c;
  private String d;
  private String e;

  public n(Fragment paramFragment, p paramp)
  {
    this.a = paramFragment;
    this.b = paramp;
  }

  public final String a()
  {
    return this.e;
  }

  public final void a(Bundle paramBundle)
  {
    if (b())
    {
      ViewGroup localViewGroup = (ViewGroup)this.a.v().findViewById(2131362506);
      View localView = new View(this.a.i());
      localView.setLayoutParams(new LinearLayout.LayoutParams(d.a(1.0F, this.a.i().getResources()), -1));
      TypedArray localTypedArray = this.a.i().obtainStyledAttributes(new int[] { 2130772381 });
      int j = localTypedArray.getResourceId(0, 0);
      localTypedArray.recycle();
      localView.setBackgroundResource(j);
      localViewGroup.addView(localView);
      this.c = new FrameLayout(this.a.i());
      this.c.setId(2131362077);
      int k = this.a.j().getInteger(2131558410);
      this.c.setLayoutParams(new LinearLayout.LayoutParams(0, -1, k));
      localViewGroup.addView(this.c);
    }
    Bundle localBundle = this.a.g();
    String str2;
    String str1;
    if (localBundle != null)
    {
      str2 = localBundle.getString("sub_fragment_uri");
      str1 = localBundle.getString("sub_fragment_name");
    }
    while (true)
    {
      String str6;
      String str3;
      if (paramBundle != null)
      {
        String str5 = paramBundle.getString("sub_fragment_uri");
        str6 = paramBundle.getString("sub_fragment_name");
        str3 = str5;
      }
      for (String str4 = str6; ; str4 = str1)
      {
        if (str3 != null)
          if (this.a.l().a("sub_fragment") == null)
            break label280;
        label280: for (int i = 1; i != 0; i = 0)
        {
          this.d = str3;
          this.e = str4;
          return;
        }
        a(str3, str4);
        return;
        str3 = str2;
      }
      str1 = null;
      str2 = null;
    }
  }

  public final void a(Menu paramMenu)
  {
    if (!b());
    Fragment localFragment;
    do
    {
      return;
      localFragment = this.a.l().a("sub_fragment");
    }
    while ((localFragment == null) || (!(localFragment instanceof o)));
    ((o)localFragment).c(paramMenu);
  }

  public final void a(String paramString1, String paramString2)
  {
    if (!TextUtils.equals(this.d, paramString1))
    {
      this.d = paramString1;
      this.e = paramString2;
      if (b())
      {
        this.b.a(paramString1);
        if (this.d != null)
        {
          Fragment localFragment1 = this.b.a(this.d, this.e);
          if (localFragment1 == null)
            break label97;
          l locall2 = this.a.l().a();
          locall2.b(2131362077, localFragment1, "sub_fragment");
          locall2.b();
        }
      }
    }
    return;
    label97: Fragment localFragment2 = this.a.l().a("sub_fragment");
    l locall1 = this.a.l().a();
    locall1.a(localFragment2);
    locall1.b();
  }

  public final void a(boolean paramBoolean)
  {
    View localView;
    if (this.c != null)
    {
      localView = this.c;
      if (!paramBoolean)
        break label24;
    }
    label24: for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      return;
    }
  }

  public final void b(Bundle paramBundle)
  {
    paramBundle.putString("sub_fragment_uri", this.d);
    paramBundle.putString("sub_fragment_name", this.e);
  }

  public final boolean b()
  {
    return ds.d(this.a.i());
  }

  public final boolean c()
  {
    return (b()) && (this.d == null);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
