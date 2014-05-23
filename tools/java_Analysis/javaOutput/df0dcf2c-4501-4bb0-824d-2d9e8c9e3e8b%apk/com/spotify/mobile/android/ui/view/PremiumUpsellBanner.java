package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.spotify.android.paste.widget.f;
import com.spotify.android.paste.widget.g;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.ViewUri.Verified;

public class PremiumUpsellBanner extends Button
  implements View.OnClickListener
{
  private int a;
  private ViewUri.Verified b;
  private ViewUri.SubView c;
  private boolean d;

  public PremiumUpsellBanner(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null);
  }

  public PremiumUpsellBanner(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }

  public PremiumUpsellBanner(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet != null)
    {
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, com.spotify.mobile.android.ui.m.C);
      this.d = localTypedArray.getBoolean(0, false);
      localTypedArray.recycle();
    }
    if (!f.a(paramContext))
    {
      float f = getTextSize();
      g.b(paramContext, this, 2130772386);
      setTextSize(0, f);
    }
    setOnClickListener(this);
    if ((!this.d) && (!isInEditMode()) && (!((ClientInfo)c.a(ClientInfo.class)).d()))
      this.d = true;
    if ((this.d) && (getVisibility() == 0))
      setVisibility(8);
  }

  public final void a(int paramInt)
  {
    this.a = paramInt;
  }

  public final void a(ViewUri.Verified paramVerified, ViewUri.SubView paramSubView)
  {
    this.b = paramVerified;
    this.c = paramSubView;
  }

  public final boolean a()
  {
    boolean bool;
    int i;
    if ((!this.d) && (com.spotify.mobile.android.ui.fragments.logic.m.b(this.a)))
    {
      bool = true;
      i = 0;
      if (!bool)
        break label52;
    }
    while (true)
    {
      setVisibility(i);
      if (bool)
        setText(com.spotify.mobile.android.ui.fragments.logic.m.c(this.a));
      return bool;
      bool = false;
      break;
      label52: i = 8;
    }
  }

  public void onClick(View paramView)
  {
    ViewUri.Verified localVerified = this.b;
    ViewUri.SubView localSubView = this.c;
    if (localVerified == null)
    {
      localVerified = ViewUri.b;
      localSubView = ViewUri.SubView.h;
    }
    String str = com.spotify.mobile.android.ui.fragments.logic.m.d(this.a);
    c.a(a.class);
    a.a(getContext(), null, localVerified, localSubView, str);
  }

  public void setVisibility(int paramInt)
  {
    if ((this.d) && (paramInt == 0))
      return;
    super.setVisibility(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.PremiumUpsellBanner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
