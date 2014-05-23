package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;
import com.spotify.mobile.android.util.g;

public class ShufflePlayHeaderView extends StickyHeaderView
{
  private View a;
  private View b;
  private View c;
  private View d;
  private TextView e;
  private LinearLayout f;
  private g g;
  private boolean h;

  public ShufflePlayHeaderView(Context paramContext)
  {
    super(paramContext);
  }

  public ShufflePlayHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static ShufflePlayHeaderView a(Context paramContext, ListView paramListView, View.OnClickListener paramOnClickListener)
  {
    Object localObject1 = null;
    Object localObject2 = paramListView;
    while (true)
    {
      ViewParent localViewParent = ((View)localObject2).getParent();
      View localView1;
      Object localObject3;
      if ((localViewParent != null) && ((localViewParent instanceof View)))
      {
        View localView3 = (View)localViewParent;
        View localView4 = localView3.findViewById(2131362508);
        localView1 = localView3;
        localObject3 = localView4;
      }
      while ((localObject3 != null) || (localView1 == null))
      {
        ViewGroup localViewGroup = (ViewGroup)localObject3;
        ShufflePlayHeaderView localShufflePlayHeaderView = (ShufflePlayHeaderView)LayoutInflater.from(paramContext).inflate(2130903258, paramListView, false);
        localShufflePlayHeaderView.a(paramListView, localViewGroup);
        localShufflePlayHeaderView.c().setVisibility(8);
        if (com.spotify.android.paste.widget.f.a(paramContext))
        {
          View localView2 = LayoutInflater.from(paramContext).inflate(2130903257, null);
          localView2.setOnClickListener(paramOnClickListener);
          localShufflePlayHeaderView.e = ((TextView)localView2.findViewById(2131362651));
          localShufflePlayHeaderView.a(localView2, new LinearLayout.LayoutParams(-1, -1));
          return localShufflePlayHeaderView;
          localObject3 = localObject1;
          localView1 = null;
        }
        else
        {
          Button localButton = com.spotify.mobile.android.ui.stuff.f.a(paramContext, paramListView);
          localButton.setOnClickListener(paramOnClickListener);
          localShufflePlayHeaderView.a(localButton, new LinearLayout.LayoutParams(-2, -1));
          localShufflePlayHeaderView.e = localButton;
          return localShufflePlayHeaderView;
        }
      }
      Object localObject4 = localObject3;
      localObject2 = localView1;
      localObject1 = localObject4;
    }
  }

  private void a(View paramView, LinearLayout.LayoutParams paramLayoutParams)
  {
    this.d = paramView;
    this.f.addView(this.d, paramLayoutParams);
  }

  public static void a(g paramg, View paramView)
  {
    ScaleAnimation localScaleAnimation1 = new ScaleAnimation(1.0F, 0.95F, 1.0F, 0.95F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation1.setDuration(100L);
    ScaleAnimation localScaleAnimation2 = new ScaleAnimation(0.95F, 1.05F, 0.95F, 1.05F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation2.setDuration(150L);
    ScaleAnimation localScaleAnimation3 = new ScaleAnimation(1.05F, 1.0F, 1.05F, 1.0F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation3.setDuration(100L);
    paramg.a(paramView, localScaleAnimation1, false);
    paramg.a(paramView, localScaleAnimation2, false);
    paramg.a(paramView, localScaleAnimation3, false);
  }

  public final void a()
  {
    this.h = true;
  }

  public final void a(int paramInt)
  {
    if (paramInt > 0);
    for (boolean bool = true; ; bool = false)
    {
      b(bool);
      return;
    }
  }

  protected final void a(boolean paramBoolean)
  {
    View localView;
    if (this.b != null)
    {
      localView = this.b;
      if (!paramBoolean)
        break label25;
    }
    label25: for (int i = 8; ; i = 0)
    {
      localView.setVisibility(i);
      return;
    }
  }

  public final void b()
  {
    a(this.g, this.c);
  }

  public final void b(boolean paramBoolean)
  {
    boolean bool1 = FeatureFragment.h.a();
    ViewGroup localViewGroup = c();
    if (paramBoolean)
    {
      if ((this.h) || (bool1));
      for (boolean bool2 = true; ; bool2 = false)
      {
        c(bool2);
        localViewGroup.setVisibility(0);
        return;
      }
    }
    c(false);
    localViewGroup.setVisibility(8);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = findViewById(2131362227);
    this.b = findViewById(2131362312);
    this.c = findViewById(2131362447);
    this.g = new g();
    this.f = ((LinearLayout)findViewById(2131362653));
  }

  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.a.setEnabled(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.ShufflePlayHeaderView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
