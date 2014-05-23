package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.e;
import com.spotify.android.paste.widget.SwitchView;
import com.spotify.mobile.android.provider.Metadata.OfflineSync;
import com.spotify.mobile.android.provider.Metadata.OfflineSync.WaitReason;
import com.spotify.mobile.android.util.Assertion;

public class DownloadHeaderView extends LinearLayout
{
  private com.spotify.mobile.android.util.g a;
  private Animation b;
  private Animation c;
  private DownloadHeaderView.State d = DownloadHeaderView.State.a;
  private ProgressBar e;
  private View f;
  private SwitchView g;
  private TextView h;
  private f i;
  private int j;
  private int k;

  public DownloadHeaderView(Context paramContext)
  {
    super(paramContext);
    b();
  }

  public DownloadHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b();
  }

  private void a(View paramView, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      g localg = new g(paramView, paramInt, false);
      this.a.a(paramView, localg, false);
      return;
    }
    paramView.setVisibility(0);
  }

  private void a(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.a.a(paramView, this.b, false);
      return;
    }
    paramView.setVisibility(0);
  }

  private void a(DownloadHeaderView.State paramState, int paramInt)
  {
    boolean bool1 = true;
    if (paramState == DownloadHeaderView.State.d)
      this.e.setProgress(paramInt);
    SwitchView localSwitchView = this.g;
    if ((paramState != DownloadHeaderView.State.c) && (paramState != DownloadHeaderView.State.b) && (paramState != DownloadHeaderView.State.a));
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      localSwitchView.setChecked(bool2);
      if (this.d != paramState)
        break;
      return;
    }
    boolean bool3;
    boolean bool4;
    boolean bool5;
    boolean bool6;
    if (this.d != DownloadHeaderView.State.a)
    {
      if (this.d == DownloadHeaderView.State.d)
        b(this.e, this.k, bool1);
      bool3 = a(paramState);
      bool4 = a(this.d);
      bool5 = b(paramState);
      bool6 = b(this.d);
      if (this.d != DownloadHeaderView.State.b)
        break label233;
      if (!bool3)
        break label209;
      a(this.f, this.j, bool1);
      label160: if (!bool5)
        break label221;
      a(this.h, this.j, bool1);
    }
    while (true)
    {
      if (paramState == DownloadHeaderView.State.d)
        a(this.e, this.k, bool1);
      this.d = paramState;
      return;
      bool1 = false;
      break;
      label209: this.f.setVisibility(8);
      break label160;
      label221: this.h.setVisibility(8);
      continue;
      label233: if (paramState == DownloadHeaderView.State.b)
      {
        if (bool4)
          b(this.f, this.j, bool1);
        if (bool6)
          b(this.h, this.j, bool1);
      }
      else
      {
        if ((bool4) && (!bool3))
          b(this.f, bool1);
        if ((bool6) && (!bool5))
          b(this.h, bool1);
        if ((bool3) && (!bool4))
          a(this.f, bool1);
        if ((bool5) && (!bool6))
          a(this.h, bool1);
      }
    }
  }

  private static boolean a(DownloadHeaderView.State paramState)
  {
    return (paramState == DownloadHeaderView.State.c) || (paramState == DownloadHeaderView.State.d) || (paramState == DownloadHeaderView.State.e);
  }

  private void b()
  {
    Resources localResources = getResources();
    this.j = (-1 + localResources.getDimensionPixelSize(2131427407));
    this.k = (-1 + localResources.getDimensionPixelSize(2131427408));
  }

  private void b(View paramView, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      g localg = new g(paramView, paramInt, true);
      this.a.a(paramView, localg, true);
      return;
    }
    paramView.setVisibility(8);
  }

  private void b(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.a.a(paramView, this.c, true);
      return;
    }
    paramView.setVisibility(8);
  }

  private static boolean b(DownloadHeaderView.State paramState)
  {
    return (paramState == DownloadHeaderView.State.f) || (paramState == DownloadHeaderView.State.g) || (paramState == DownloadHeaderView.State.h) || (paramState == DownloadHeaderView.State.i);
  }

  public final void a()
  {
    a(DownloadHeaderView.State.b, 0);
  }

  public final void a(int paramInt1, int paramInt2)
  {
    DownloadHeaderView.State localState;
    if (Metadata.OfflineSync.a(paramInt1))
      localState = DownloadHeaderView.State.c;
    while (true)
    {
      a(localState, paramInt2);
      return;
      if (Metadata.OfflineSync.c(paramInt1))
      {
        localState = DownloadHeaderView.State.d;
      }
      else if (Metadata.OfflineSync.d(paramInt1))
      {
        localState = DownloadHeaderView.State.e;
      }
      else if (Metadata.OfflineSync.a(paramInt1, paramInt2))
      {
        Metadata.OfflineSync.WaitReason localWaitReason = Metadata.OfflineSync.b(paramInt1);
        switch (DownloadHeaderView.2.a[localWaitReason.ordinal()])
        {
        default:
          Assertion.a("Unknown reason " + localWaitReason);
          localState = DownloadHeaderView.State.f;
          break;
        case 1:
          localState = DownloadHeaderView.State.f;
          break;
        case 2:
          localState = DownloadHeaderView.State.g;
          break;
        case 3:
          localState = DownloadHeaderView.State.h;
          break;
        case 4:
          localState = DownloadHeaderView.State.i;
          break;
        }
      }
      else
      {
        localState = DownloadHeaderView.State.b;
      }
    }
  }

  public final void a(f paramf)
  {
    this.i = paramf;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    if (isInEditMode())
      return;
    this.a = new com.spotify.mobile.android.util.g();
    this.b = AnimationUtils.loadAnimation(getContext(), 2130968592);
    this.c = AnimationUtils.loadAnimation(getContext(), 2130968593);
    this.f = findViewById(2131362458);
    this.g = ((SwitchView)findViewById(2131362459));
    this.e = ((ProgressBar)findViewById(2131362352));
    this.h = ((TextView)findViewById(2131362460));
    if (!com.spotify.android.paste.widget.f.a(getContext()))
    {
      e locale = new e(getContext(), SpotifyIcon.y);
      locale.a(getContext().getResources().getColor(2131296378));
      this.h.setCompoundDrawablesWithIntrinsicBounds(locale, null, null, null);
    }
    this.g.setOnClickListener(new DownloadHeaderView.1(this));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.DownloadHeaderView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
