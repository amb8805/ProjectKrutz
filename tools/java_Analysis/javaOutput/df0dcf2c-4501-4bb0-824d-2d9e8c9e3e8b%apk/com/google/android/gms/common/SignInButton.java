package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ae;
import com.google.android.gms.internal.ae.a;
import com.google.android.gms.internal.af;
import com.google.android.gms.internal.f;

public final class SignInButton extends FrameLayout
  implements View.OnClickListener
{
  private int a;
  private int b;
  private View c;
  private View.OnClickListener d = null;

  public SignInButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SignInButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    f.a(true, "Unknown button size 0");
    f.a(true, "Unknown color scheme 0");
    this.a = 0;
    this.b = 0;
    localContext = getContext();
    if (this.c != null)
      removeView(this.c);
    try
    {
      this.c = ae.a(localContext, this.a, this.b);
      addView(this.c);
      this.c.setEnabled(isEnabled());
      this.c.setOnClickListener(this);
      return;
    }
    catch (ae.a locala)
    {
      while (true)
      {
        Log.w("SignInButton", "Sign in button not found, using placeholder instead");
        int i = this.a;
        int j = this.b;
        af localaf = new af(localContext);
        localaf.a(localContext.getResources(), i, j);
        this.c = localaf;
      }
    }
  }

  public final void onClick(View paramView)
  {
    if ((this.d != null) && (paramView == this.c))
      this.d.onClick(this);
  }

  public final void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.c.setEnabled(paramBoolean);
  }

  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.d = paramOnClickListener;
    if (this.c != null)
      this.c.setOnClickListener(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.SignInButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
