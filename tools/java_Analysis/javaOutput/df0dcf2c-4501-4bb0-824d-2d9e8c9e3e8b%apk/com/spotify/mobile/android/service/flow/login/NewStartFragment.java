package com.spotify.mobile.android.service.flow.login;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.service.flow.a.c;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.dt;
import com.spotify.mobile.android.util.dv;
import java.util.Locale;

public class NewStartFragment extends d
{
  private dt Y;
  private Handler Z;
  private ImageView a;
  private VideoView aa;
  private float ab;
  private boolean ac = true;
  private View.OnTouchListener ad = new NewStartFragment.9(this);
  private ImageView b;
  private View c;
  private View d;
  private Button e;
  private Button f;
  private int g = 2147483647;
  private boolean h;
  private int i;

  public NewStartFragment()
  {
  }

  private l E()
  {
    return (l)((com.spotify.mobile.android.service.flow.a.a)l_()).a(this);
  }

  private void F()
  {
    this.Z.removeMessages(1);
    this.Z.sendEmptyMessageDelayed(1, 5000L);
  }

  public static NewStartFragment a(com.spotify.mobile.android.service.flow.a.a parama)
  {
    NewStartFragment localNewStartFragment = new NewStartFragment();
    localNewStartFragment.a(parama);
    return localNewStartFragment;
  }

  private void a(int paramInt, NewStartFragment.Direction paramDirection)
  {
    int j;
    Animation localAnimation1;
    if (paramDirection == NewStartFragment.Direction.a)
    {
      j = 2130968583;
      localAnimation1 = e(j);
      localAnimation1.setAnimationListener(new NewStartFragment.7(this, paramInt));
      a(localAnimation1);
      if (paramDirection != NewStartFragment.Direction.a)
        break label85;
    }
    label85: for (int k = 2130968588; ; k = 2130968587)
    {
      Animation localAnimation2 = e(k);
      a(localAnimation2);
      this.d.startAnimation(localAnimation1);
      this.c.startAnimation(localAnimation2);
      return;
      j = 2130968584;
      break;
    }
  }

  private static void a(Animation paramAnimation)
  {
    paramAnimation.setDuration(250L);
    paramAnimation.setFillAfter(true);
  }

  private static void b(int paramInt, View paramView)
  {
    int j;
    int k;
    switch (paramInt)
    {
    default:
      Assertion.a("View at postion " + paramInt + " not defined");
      j = 2131690269;
      k = 2131690268;
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      TextView localTextView1 = (TextView)paramView.findViewById(2131362315);
      TextView localTextView2 = (TextView)paramView.findViewById(2131362227);
      localTextView1.setText(k);
      localTextView2.setText(j);
      localTextView2.setVisibility(0);
      return;
      j = 2131690269;
      k = 2131690268;
      continue;
      j = 2131690267;
      k = 2131690266;
      continue;
      j = 2131690275;
      k = 2131690274;
      continue;
      j = 2131690271;
      k = 2131690270;
      continue;
      j = 2131690273;
      k = 2131690272;
    }
  }

  private void d(int paramInt)
  {
    int j = 1;
    this.i = paramInt;
    View localView1 = v();
    View localView2 = localView1.findViewById(2131362433);
    label50: label73: label96: View localView6;
    if (paramInt == 0)
    {
      int k = j;
      localView2.setEnabled(k);
      View localView3 = localView1.findViewById(2131362434);
      if (paramInt != j)
        break label129;
      int n = j;
      localView3.setEnabled(n);
      View localView4 = localView1.findViewById(2131362435);
      if (paramInt != 2)
        break label135;
      int i2 = j;
      localView4.setEnabled(i2);
      View localView5 = localView1.findViewById(2131362436);
      if (paramInt != 3)
        break label141;
      int i4 = j;
      localView5.setEnabled(i4);
      localView6 = localView1.findViewById(2131362437);
      if (paramInt != 4)
        break label147;
    }
    while (true)
    {
      localView6.setEnabled(j);
      return;
      int m = 0;
      break;
      label129: int i1 = 0;
      break label50;
      label135: int i3 = 0;
      break label73;
      label141: int i5 = 0;
      break label96;
      label147: j = 0;
    }
  }

  private Animation e(int paramInt)
  {
    return AnimationUtils.loadAnimation((Context)cc.a(i()), paramInt);
  }

  private void f(int paramInt)
  {
    if (this.ac)
      return;
    this.b.setImageResource(g(paramInt));
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
    localAlphaAnimation.setDuration(250L);
    localAlphaAnimation.setFillAfter(false);
    localAlphaAnimation.setAnimationListener(new NewStartFragment.8(this, paramInt));
    this.a.startAnimation(localAlphaAnimation);
  }

  private static int g(int paramInt)
  {
    switch (paramInt)
    {
    default:
      Assertion.a("View at postion " + paramInt + " not defined");
    case 0:
      return 2130837626;
    case 1:
      return 2130837625;
    case 2:
      return 2130837631;
    case 3:
      return 2130837629;
    case 4:
    }
    return 2130837630;
  }

  public final void D()
  {
    this.h = false;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903151, paramViewGroup, false);
    this.e = ((Button)localView.findViewById(2131362438));
    this.f = ((Button)localView.findViewById(2131362439));
    if (!f.a(i()))
    {
      this.e.setText(this.e.getText().toString().toUpperCase(Locale.getDefault()));
      this.f.setText(this.f.getText().toString().toUpperCase(Locale.getDefault()));
    }
    this.a = ((ImageView)localView.findViewById(2131362429));
    this.b = ((ImageView)localView.findViewById(2131362428));
    this.c = localView.findViewById(2131362430);
    this.d = localView.findViewById(2131362432);
    this.d.setVisibility(4);
    this.aa = ((VideoView)localView.findViewById(2131362426));
    this.aa.getHolder().addCallback(new NewStartFragment.1(this));
    Uri localUri = Uri.parse("android.resource://" + i().getPackageName() + "/2131099648");
    this.aa.setVideoURI(localUri);
    this.aa.setOnPreparedListener(new NewStartFragment.2(this));
    this.aa.setOnErrorListener(new NewStartFragment.3(this));
    localView.setOnTouchListener(this.ad);
    this.Z = new m(this, (byte)0);
    return localView;
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.Y = dv.b(i(), ViewUri.S);
  }

  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    this.e.setOnClickListener(new NewStartFragment.4(this));
    c localc = (c)l_();
    this.f.setOnClickListener(new NewStartFragment.5(this, localc));
    b(0, this.c);
    d(0);
    this.c.post(new NewStartFragment.6(this));
  }

  public final void e()
  {
    this.aa.stopPlayback();
    super.e();
  }

  public final void w()
  {
    super.w();
    this.Y.a();
    F();
    this.aa.start();
  }

  public final void x()
  {
    super.x();
    this.aa.pause();
    this.Y.b();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.flow.login.NewStartFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
