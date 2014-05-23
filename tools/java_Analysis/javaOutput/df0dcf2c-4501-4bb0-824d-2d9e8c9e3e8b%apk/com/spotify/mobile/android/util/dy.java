package com.spotify.mobile.android.util;

import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

public final class dy
{
  public static View a(View paramView, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3)
  {
    cc.a(paramView);
    View localView = paramView.findViewById(2131362360);
    cc.a(localView, "the parent view must have a view with ID \"not_available\"");
    ImageView localImageView = (ImageView)localView.findViewById(2131362226);
    Assertion.a(localImageView);
    TextView localTextView1;
    if (paramInteger1 == null)
    {
      localImageView.setVisibility(8);
      cc.a(localView);
      localTextView1 = (TextView)localView.findViewById(2131362402);
      Assertion.a(localTextView1);
      if (paramInteger2 != null)
        break label126;
      localTextView1.setVisibility(8);
    }
    TextView localTextView2;
    while (true)
    {
      localTextView2 = (TextView)localView.findViewById(2131362315);
      Assertion.a(localTextView2);
      if (paramInteger3 != null)
        break label138;
      localTextView2.setVisibility(8);
      return localView;
      localImageView.setImageResource(paramInteger1.intValue());
      break;
      label126: localTextView1.setText(paramInteger2.intValue());
    }
    label138: localTextView2.setText(paramInteger3.intValue());
    return localView;
  }

  public static void a(View paramView)
  {
    paramView.clearAnimation();
    Animation localAnimation = AnimationUtils.loadAnimation(paramView.getContext(), 2130968593);
    localAnimation.setAnimationListener(new dy.3(paramView));
    paramView.startAnimation(localAnimation);
  }

  public static void a(AdapterView<ListAdapter> paramAdapterView, int paramInt)
  {
    paramAdapterView.setSelection(paramInt);
    ListAdapter localListAdapter = (ListAdapter)paramAdapterView.getAdapter();
    paramAdapterView.performItemClick(localListAdapter.getView(paramInt, null, paramAdapterView), paramInt, localListAdapter.getItemId(paramInt));
  }

  public static void a(TextView paramTextView)
  {
    if (ac.a)
    {
      paramTextView.getViewTreeObserver().addOnGlobalLayoutListener(new dy.4(paramTextView));
      return;
    }
    paramTextView.setMaxLines(4);
    paramTextView.setEllipsize(TextUtils.TruncateAt.END);
  }

  public static void a(Runnable paramRunnable, View paramView, View[] paramArrayOfView)
  {
    paramView.setVisibility(0);
    int i = 0;
    View localView;
    if (i < 2)
    {
      localView = paramArrayOfView[i];
      if (localView.getVisibility() != 0);
    }
    while (true)
    {
      Animation localAnimation1 = AnimationUtils.loadAnimation(paramView.getContext(), 2130968592);
      localAnimation1.setAnimationListener(new dy.1(paramRunnable));
      paramView.startAnimation(localAnimation1);
      if (localView != null)
      {
        Animation localAnimation2 = AnimationUtils.loadAnimation(paramView.getContext(), 2130968593);
        localAnimation2.setAnimationListener(new dy.2(localView));
        localView.startAnimation(localAnimation2);
      }
      return;
      i++;
      break;
      localView = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.dy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
