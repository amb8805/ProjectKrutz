package com.twitter.android;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageButton;
import android.widget.ListView;
import be;
import com.twitter.android.client.g;
import com.twitter.android.provider.ax;
import com.twitter.android.widget.c;
import com.twitter.android.widget.d;

public abstract class TweetListFragment extends BaseListFragment
  implements View.OnTouchListener, AdapterView.OnItemLongClickListener, c
{
  private View.OnClickListener a;
  private int b;
  private int c;
  private GestureDetector d;
  private Animation e;
  private Animation f;
  protected ax g;
  du h;
  private boolean r;

  public TweetListFragment()
  {
  }

  private void b(MotionEvent paramMotionEvent)
  {
    ListView localListView = this.p;
    localListView.setPressed(false);
    if (paramMotionEvent != null)
    {
      MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
      localMotionEvent.setAction(3);
      localListView.onTouchEvent(localMotionEvent);
    }
  }

  protected Dialog a(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 1:
    }
    bk localbk = new bk(this);
    return new AlertDialog.Builder(getActivity()).setTitle(getString(2131427392)).setIcon(getResources().getDrawable(17301543)).setMessage(getString(2131427393)).setPositiveButton(getString(2131427505), localbk).setNegativeButton(getString(2131427506), null).create();
  }

  public final Bitmap a(ax paramax)
  {
    this.n = true;
    if (this.m != 2)
      return this.j.a(paramax.t, paramax.n, paramax.k);
    return this.j.a(paramax.t, paramax.n);
  }

  final void a(MotionEvent paramMotionEvent)
  {
    du localdu = this.h;
    localdu.b.setAnimationListener(localdu);
    localdu.d.startAnimation(localdu.b);
    this.h = null;
    b(paramMotionEvent);
  }

  final boolean a(ct paramct, Animation paramAnimation1, Animation paramAnimation2, int paramInt, MotionEvent paramMotionEvent)
  {
    if ((this.h != null) && (paramct.c.equals(this.h.d)))
    {
      if (!paramAnimation1.equals(this.h.c))
        a(paramMotionEvent);
      return false;
    }
    if (this.h != null)
      a(null);
    if (paramct.b == null)
      paramct.b = paramct.a.inflate();
    du localdu = new du(this, paramct.c, paramct.b, paramAnimation1, paramAnimation2, paramInt);
    ax localax = b(localdu.a);
    View localView = localdu.e;
    ImageButton localImageButton1 = (ImageButton)localView.findViewById(2131165349);
    ImageButton localImageButton2 = (ImageButton)localView.findViewById(2131165348);
    ImageButton localImageButton3 = (ImageButton)localView.findViewById(2131165347);
    ImageButton localImageButton4 = (ImageButton)localView.findViewById(2131165351);
    ImageButton localImageButton5 = (ImageButton)localView.findViewById(2131165350);
    ImageButton localImageButton6 = (ImageButton)localView.findViewById(2131165346);
    View.OnClickListener localOnClickListener = this.a;
    localImageButton1.setOnClickListener(localOnClickListener);
    localImageButton2.setOnClickListener(localOnClickListener);
    localImageButton3.setOnClickListener(localOnClickListener);
    localImageButton4.setOnClickListener(localOnClickListener);
    localImageButton5.setOnClickListener(localOnClickListener);
    localImageButton6.setOnClickListener(localOnClickListener);
    d.a(this.j.f(), localax, localImageButton1, localImageButton2, localImageButton3, localImageButton4);
    localdu.a();
    this.h = localdu;
    b(paramMotionEvent);
    return true;
  }

  public final be b(ax paramax)
  {
    return this.j.b(paramax);
  }

  protected abstract ax b(int paramInt);

  public final long e()
  {
    return this.j.j();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
      this.g = ((ax)paramBundle.getParcelable("state_delete_key"));
    Bundle localBundle = getArguments();
    if ((localBundle != null) && (localBundle.getBoolean("en_gest", false)));
    for (boolean bool = true; ; bool = false)
    {
      this.r = bool;
      return;
    }
  }

  public boolean onItemLongClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    return ((paramView.getTag() instanceof ct)) && (a((ct)paramView.getTag(), this.e, this.f, paramInt, null));
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (this.g != null)
      paramBundle.putParcelable("state_delete_key", this.g);
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    int j = (int)paramMotionEvent.getY();
    switch (i)
    {
    case 1:
    default:
    case 0:
    case 2:
    }
    while (true)
    {
      return this.d.onTouchEvent(paramMotionEvent);
      this.b = j;
      continue;
      if ((this.h != null) && (Math.abs(this.b - j) > this.c))
        a(null);
    }
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    if (!this.r);
    ListView localListView;
    do
    {
      return;
      localListView = this.p;
    }
    while (!this.j.h());
    this.a = new bo(this);
    localListView.setOnTouchListener(this);
    localListView.setOnItemLongClickListener(this);
    FragmentActivity localFragmentActivity = getActivity();
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localFragmentActivity);
    int i = localViewConfiguration.getScaledTouchSlop();
    int j = localViewConfiguration.getScaledMinimumFlingVelocity();
    int k = i * 2;
    this.c = i;
    Animation localAnimation1 = AnimationUtils.loadAnimation(localFragmentActivity, 2130968582);
    Animation localAnimation2 = AnimationUtils.loadAnimation(localFragmentActivity, 2130968578);
    Animation localAnimation3 = AnimationUtils.loadAnimation(localFragmentActivity, 2130968579);
    Animation localAnimation4 = AnimationUtils.loadAnimation(localFragmentActivity, 2130968583);
    this.e = localAnimation4;
    this.f = localAnimation3;
    this.d = new GestureDetector(new bm(this, k, j, localListView, i, localAnimation1, localAnimation2, localAnimation4, localAnimation3));
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.TweetListFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
