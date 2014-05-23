package com.twitter.android.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Checkable;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class UserView extends CardRowView
  implements View.OnClickListener, Checkable
{
  private static final int[] a = { 16842912 };
  private boolean b;
  private l c;
  private long d;
  private ImageButton e;
  private TextView f;
  private ImageView g;
  private ImageView h;
  private TextView i;
  private ImageView j;
  private TextView k;

  public UserView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (this.e == null)
      return;
    this.e.setBackgroundResource(2130837574);
    this.e.setPadding(paramInt2, 0, paramInt4, 0);
  }

  public final void a(int paramInt, l paraml)
  {
    if (this.e == null)
      return;
    if (paramInt == 0)
    {
      this.e.setVisibility(8);
      return;
    }
    this.e.setOnClickListener(this);
    this.e.setImageResource(paramInt);
    this.e.setVisibility(0);
    this.c = paraml;
  }

  public final void a(long paramLong)
  {
    this.d = paramLong;
  }

  public final void a(Bitmap paramBitmap)
  {
    ImageView localImageView = this.j;
    if (paramBitmap != null)
    {
      localImageView.setBackgroundDrawable(new BitmapDrawable(getResources(), paramBitmap));
      return;
    }
    localImageView.setBackgroundResource(2130837734);
  }

  public final void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      this.k.setVisibility(8);
      return;
    }
    this.k.setText(paramString);
    this.k.setVisibility(0);
  }

  public final void a(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString2))
      this.i.setText(paramString1);
    while (true)
    {
      this.f.setText('@' + paramString1);
      return;
      this.i.setText(paramString2);
    }
  }

  public final void a(boolean paramBoolean)
  {
    if (this.e == null)
      return;
    this.e.setVisibility(0);
    this.e.setImageResource(2130837566);
    this.e.setBackgroundDrawable(null);
    this.e.setPadding(0, 0, 0, 0);
    this.e.setClickable(false);
  }

  public final void b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.g.setVisibility(0);
      return;
    }
    this.g.setVisibility(8);
  }

  public final void c(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.h.setVisibility(0);
      return;
    }
    this.h.setVisibility(8);
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.e != null)
      this.e.setImageState(getDrawableState(), true);
  }

  public boolean isChecked()
  {
    return this.b;
  }

  public void onClick(View paramView)
  {
    if (this.c != null)
    {
      this.c.a(this, this.d);
      toggle();
    }
  }

  public int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (isChecked())
      mergeDrawableStates(arrayOfInt, a);
    return arrayOfInt;
  }

  protected void onFinishInflate()
  {
    this.e = ((ImageButton)findViewById(2131165377));
    this.f = ((TextView)findViewById(2131165203));
    this.g = ((ImageView)findViewById(2131165201));
    this.h = ((ImageView)findViewById(2131165202));
    this.i = ((TextView)findViewById(2131165200));
    this.j = ((ImageView)findViewById(2131165197));
    this.k = ((TextView)findViewById(2131165378));
  }

  public void setChecked(boolean paramBoolean)
  {
    if (this.b != paramBoolean)
    {
      this.b = paramBoolean;
      refreshDrawableState();
    }
  }

  public void toggle()
  {
    if (!this.b);
    for (boolean bool = true; ; bool = false)
    {
      setChecked(bool);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.UserView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
