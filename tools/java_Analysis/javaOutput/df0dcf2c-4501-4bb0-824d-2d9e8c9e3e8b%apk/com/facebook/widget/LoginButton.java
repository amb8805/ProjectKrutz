package com.facebook.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.widget.Button;
import com.facebook.FacebookException;
import com.facebook.Request;
import com.facebook.Session;
import com.facebook.a.g;
import com.facebook.a.h;
import com.facebook.internal.ad;
import com.facebook.internal.z;
import com.facebook.model.GraphUser;

public class LoginButton extends Button
{
  private static final String a = LoginButton.class.getName();
  private String b = null;
  private z c;
  private GraphUser d = null;
  private Session e = null;
  private boolean f;
  private boolean g;
  private String h;
  private String i;
  private f j;
  private Fragment k;
  private c l = new c();
  private String m = "fb_login_view_usage";

  public LoginButton(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
    a();
  }

  public LoginButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (paramAttributeSet.getStyleAttribute() == 0)
    {
      setGravity(17);
      setTextColor(getResources().getColor(com.facebook.a.b.b));
      setTextSize(0, getResources().getDimension(com.facebook.a.c.f));
      setTypeface(Typeface.DEFAULT_BOLD);
      if (!isInEditMode())
        break label134;
      setBackgroundColor(getResources().getColor(com.facebook.a.b.a));
      this.h = "Log in with Facebook";
    }
    while (true)
    {
      a(paramAttributeSet);
      if (!isInEditMode())
        a(paramContext);
      return;
      label134: setBackgroundResource(com.facebook.a.d.a);
      setCompoundDrawablesWithIntrinsicBounds(com.facebook.a.d.c, 0, 0, 0);
      setCompoundDrawablePadding(getResources().getDimensionPixelSize(com.facebook.a.c.a));
      setPadding(getResources().getDimensionPixelSize(com.facebook.a.c.c), getResources().getDimensionPixelSize(com.facebook.a.c.e), getResources().getDimensionPixelSize(com.facebook.a.c.d), getResources().getDimensionPixelSize(com.facebook.a.c.b));
    }
  }

  public LoginButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramAttributeSet);
    a(paramContext);
  }

  private void a()
  {
    setOnClickListener(new d(this, (byte)0));
    b();
    if (!isInEditMode())
    {
      this.c = new z(getContext(), new b(this, (byte)0));
      c();
    }
  }

  private void a(AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = getContext().obtainStyledAttributes(paramAttributeSet, h.b);
    this.f = localTypedArray.getBoolean(0, true);
    this.g = localTypedArray.getBoolean(1, true);
    this.h = localTypedArray.getString(2);
    this.i = localTypedArray.getString(3);
    localTypedArray.recycle();
  }

  private static boolean a(Context paramContext)
  {
    if (paramContext == null);
    do
    {
      return false;
      Session localSession = Session.h();
      if (localSession != null)
        return localSession.a();
    }
    while ((ad.a(paramContext) == null) || (Session.a(paramContext) == null));
    return true;
  }

  private void b()
  {
    if ((this.c != null) && (this.c.b() != null))
    {
      if (this.i != null);
      for (String str2 = this.i; ; str2 = getResources().getString(g.g))
      {
        setText(str2);
        return;
      }
    }
    if (this.h != null);
    for (String str1 = this.h; ; str1 = getResources().getString(g.e))
    {
      setText(str1);
      return;
    }
  }

  private void c()
  {
    if (this.g)
    {
      Session localSession = this.c.b();
      if (localSession == null)
        break label57;
      if (localSession != this.e)
      {
        Request.a(new Request[] { Request.a(localSession, new LoginButton.1(this, localSession)) });
        this.e = localSession;
      }
    }
    label57: 
    do
    {
      return;
      this.d = null;
    }
    while (this.j == null);
  }

  final void a(Exception paramException)
  {
    if (c.f(this.l) != null)
    {
      if ((paramException instanceof FacebookException))
        c.f(this.l);
    }
    else
      return;
    c.f(this.l);
    new FacebookException(paramException);
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if ((this.c != null) && (!this.c.f()))
    {
      this.c.d();
      c();
      b();
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.c != null)
      this.c.e();
  }

  public void onFinishInflate()
  {
    super.onFinishInflate();
    a();
  }
}

/* Location:
 * Qualified Name:     com.facebook.widget.LoginButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
