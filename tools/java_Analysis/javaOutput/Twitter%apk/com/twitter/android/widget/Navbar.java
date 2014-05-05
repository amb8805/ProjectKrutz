package com.twitter.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import java.util.HashMap;

public class Navbar extends RelativeLayout
  implements View.OnClickListener
{
  private final HashMap a = new HashMap(3);
  private m b;

  public Navbar(Context paramContext)
  {
    this(paramContext, null);
  }

  public Navbar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130772031);
  }

  public Navbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void a(int paramInt)
  {
    View localView = findViewById(paramInt);
    if (localView != null)
    {
      this.a.put(Integer.valueOf(paramInt), localView);
      localView.setOnClickListener(this);
    }
  }

  public final void a(int paramInt1, int paramInt2)
  {
    View localView = (View)this.a.get(Integer.valueOf(paramInt2));
    if (localView != null)
      localView.setVisibility(8);
  }

  public final void a(int paramInt, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++)
      a(8, paramArrayOfInt[j]);
  }

  public final void a(m paramm)
  {
    this.b = paramm;
  }

  public final void b(int paramInt1, int paramInt2)
  {
    View localView = (View)this.a.get(Integer.valueOf(2131165255));
    if (localView != null)
      ((ImageButton)localView).setImageResource(2130837789);
  }

  public void onClick(View paramView)
  {
    if (this.b != null)
      this.b.b(paramView.getId());
  }

  protected void onFinishInflate()
  {
    View localView = findViewById(2131165215);
    if (localView != null)
      localView.setOnClickListener(this);
    a(2131165284);
    a(2131165255);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.Navbar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
