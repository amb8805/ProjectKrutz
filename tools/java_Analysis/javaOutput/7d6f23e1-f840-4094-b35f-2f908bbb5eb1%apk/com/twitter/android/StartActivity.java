package com.twitter.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.twitter.android.client.g;
import com.twitter.android.service.j;

public class StartActivity extends Activity
{
  private static final int[] i = { 2130837812, 2130837813, 2130837814 };
  final Handler a = new Handler();
  final Runnable b = new y(this);
  long c;
  Animation d;
  Animation e;
  Animation f;
  ImageView g;
  ImageView h;
  private Animation.AnimationListener j = new x(this);
  private long k;
  private g l;
  private int m = -1;

  public StartActivity()
  {
  }

  public static void a(Activity paramActivity)
  {
    Intent localIntent = new Intent(paramActivity, StartActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.setFlags(67108864);
    paramActivity.startActivity(localIntent);
    paramActivity.finish();
  }

  public static void a(Activity paramActivity, Intent paramIntent)
  {
    Intent localIntent = new Intent(paramActivity, StartActivity.class);
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.setFlags(67108864);
    localIntent.putExtra("android.intent.extra.INTENT", paramIntent);
    paramActivity.startActivity(localIntent);
    paramActivity.finish();
  }

  final int a()
  {
    if (this.m < i.length - 1);
    for (this.m = (1 + this.m); ; this.m = 0)
      return i[this.m];
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    getWindow().setFormat(1);
  }

  public void onClickHandler(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 2131165320:
      startActivity(new Intent(this, LoginActivity.class).putExtra("android.intent.extra.INTENT", getIntent().getParcelableExtra("android.intent.extra.INTENT")));
      return;
    case 2131165321:
    }
    Intent localIntent1 = getIntent();
    Intent localIntent2 = new Intent(this, SignUpActivity.class);
    if (localIntent1.hasExtra("android.intent.extra.INTENT"))
      localIntent2.putExtra("android.intent.extra.INTENT", localIntent1.getParcelableExtra("android.intent.extra.INTENT"));
    while (true)
    {
      startActivity(localIntent2);
      return;
      localIntent2.putExtra("android.intent.extra.INTENT", new Intent(this, WelcomeActivity.class));
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903097);
    this.l = g.a(this);
    ((TextView)findViewById(2131165318)).setText(2131427681);
    ((TextView)findViewById(2131165319)).setText(2131427682);
    this.h = ((ImageView)findViewById(2131165315));
    this.g = ((ImageView)findViewById(2131165316));
    this.g.setVisibility(4);
    this.h.setImageResource(a());
    this.d = AnimationUtils.loadAnimation(this, 2130968576);
    this.d.setFillAfter(true);
    this.d.setAnimationListener(this.j);
    this.e = AnimationUtils.loadAnimation(this, 2130968577);
    this.e.setFillAfter(true);
    this.f = AnimationUtils.loadAnimation(this, 2130968588);
    this.k = 9000L;
  }

  public boolean onSearchRequested()
  {
    return false;
  }

  protected void onStart()
  {
    super.onStart();
    g localg = this.l;
    if (localg.h())
    {
      Object localObject = getParent();
      if (localObject == null)
        localObject = this;
      Intent localIntent = new Intent(this, HomeTabActivity.class);
      localIntent.setFlags(67108864);
      startActivity(localIntent);
      ((Activity)localObject).finish();
      return;
    }
    this.h.startAnimation(this.f);
    this.a.postDelayed(this.b, this.k);
    localg.a(localg.e(), j.S);
  }

  protected void onStop()
  {
    super.onStop();
    this.k = Math.max(9000L + this.c - System.currentTimeMillis(), 200L);
    this.h.clearAnimation();
    this.a.removeCallbacks(this.b);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.StartActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
