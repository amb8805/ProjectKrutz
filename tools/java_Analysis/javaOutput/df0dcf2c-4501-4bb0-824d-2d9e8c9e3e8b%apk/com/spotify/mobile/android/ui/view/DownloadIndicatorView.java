package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.e;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.provider.Metadata.OfflineSync;

public class DownloadIndicatorView extends RelativeLayout
{
  private ProgressBar a;
  private ImageView b;
  private boolean c = true;

  public DownloadIndicatorView(Context paramContext)
  {
    super(paramContext);
  }

  public DownloadIndicatorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(int paramInt)
  {
    a(paramInt, 0);
  }

  public final void a(int paramInt1, int paramInt2)
  {
    boolean bool1 = Metadata.OfflineSync.c(paramInt1);
    boolean bool2 = Metadata.OfflineSync.a(paramInt1, paramInt2);
    boolean bool3 = Metadata.OfflineSync.b(paramInt1, paramInt2);
    ProgressBar localProgressBar = this.a;
    int i;
    int n;
    label58: int k;
    label96: int m;
    if (bool1)
    {
      i = 0;
      localProgressBar.setVisibility(i);
      if (!f.a(getContext()))
        break label166;
      if (!bool2)
        break label159;
      n = 2130838028;
      Integer localInteger = Integer.valueOf(n);
      this.b.setImageResource(localInteger.intValue());
      ImageView localImageView = this.b;
      if ((!bool3) && (!bool2))
        break label249;
      k = 0;
      localImageView.setVisibility(k);
      if (!this.c)
        break label256;
      m = 0;
      if (!bool1)
      {
        m = 0;
        if (!bool2)
        {
          m = 0;
          if (!bool3)
            break label256;
        }
      }
    }
    while (true)
    {
      setVisibility(m);
      this.b.setTag(Boolean.valueOf(bool2));
      return;
      i = 8;
      break;
      label159: n = 2130838026;
      break label58;
      label166: e locale = new e(getContext(), SpotifyIcon.y);
      Resources localResources = getContext().getResources();
      if (bool2);
      for (int j = 2131296378; ; j = 2131296389)
      {
        locale.a(localResources.getColor(j));
        locale.a(getContext().getResources().getDimensionPixelSize(2131427442));
        this.b.setImageDrawable(locale);
        break;
      }
      label249: k = 8;
      break label96;
      label256: m = 8;
    }
  }

  public final void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }

  public final boolean a()
  {
    return this.a.getVisibility() == 0;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    if (isInEditMode())
      return;
    this.a = ((ProgressBar)findViewById(2131362352));
    this.b = ((ImageView)findViewById(2131362353));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.DownloadIndicatorView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
