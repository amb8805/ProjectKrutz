package com.spotify.android.paste.widget;

import android.os.Parcelable;
import android.support.v4.view.ah;
import android.view.View;
import android.view.ViewGroup;

final class e extends ah
{
  private e(HeaderView paramHeaderView)
  {
  }

  public final int a(Object paramObject)
  {
    if (paramObject.equals(HeaderView.e(this.a)))
      return -1;
    return 1 + super.a(paramObject);
  }

  public final Parcelable a()
  {
    if (HeaderView.d(this.a) != null)
      return HeaderView.d(this.a).a();
    return null;
  }

  public final Object a(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramInt == 0)
    {
      paramViewGroup.addView(HeaderView.e(this.a));
      return HeaderView.e(this.a);
    }
    return HeaderView.d(this.a).a(paramViewGroup, paramInt - 1);
  }

  public final void a(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
    if (HeaderView.d(this.a) != null)
      HeaderView.d(this.a).a(paramParcelable, paramClassLoader);
  }

  public final void a(ViewGroup paramViewGroup)
  {
    if (HeaderView.d(this.a) != null)
      HeaderView.d(this.a).a(paramViewGroup);
  }

  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    if (paramInt == 0)
    {
      paramViewGroup.removeView(HeaderView.e(this.a));
      return;
    }
    HeaderView.d(this.a).a(paramViewGroup, paramInt - 1, paramObject);
  }

  public final boolean a(View paramView, Object paramObject)
  {
    if (paramObject == HeaderView.e(this.a))
      return paramView == HeaderView.e(this.a);
    return HeaderView.d(this.a).a(paramView, paramObject);
  }

  public final int b()
  {
    if (HeaderView.d(this.a) != null)
      return 1 + HeaderView.d(this.a).b();
    return 1;
  }

  public final CharSequence b(int paramInt)
  {
    if (paramInt == 0)
      return super.b(0);
    return HeaderView.d(this.a).b(paramInt - 1);
  }

  public final void b(ViewGroup paramViewGroup)
  {
    if (HeaderView.d(this.a) != null)
      HeaderView.d(this.a).b(paramViewGroup);
  }

  public final void b(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    if (HeaderView.d(this.a) != null)
      HeaderView.d(this.a).b(paramViewGroup, paramInt, paramObject);
  }

  public final float c(int paramInt)
  {
    if (paramInt == 0)
      return super.c(0);
    return HeaderView.d(this.a).c(paramInt - 1);
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
