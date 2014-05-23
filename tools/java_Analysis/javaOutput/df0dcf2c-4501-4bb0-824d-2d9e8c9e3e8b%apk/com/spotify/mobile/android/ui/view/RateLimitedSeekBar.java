package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class RateLimitedSeekBar extends SeekBar
{
  private int a = 0;
  private int b = 0;
  private r c;
  private long d;
  private int e;

  public RateLimitedSeekBar(Context paramContext)
  {
    super(paramContext);
  }

  public RateLimitedSeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public RateLimitedSeekBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a()
  {
    this.a = 100;
  }

  public final void a(float paramFloat)
  {
    setProgress((int)(paramFloat * getMax()));
  }

  public final void a(r paramr)
  {
    this.d = 0L;
    this.e = 0;
    if (paramr == null)
    {
      setOnSeekBarChangeListener(null);
      this.c = null;
      return;
    }
    this.c = paramr;
    setOnSeekBarChangeListener(new RateLimitedSeekBar.1(this));
  }

  public final void b()
  {
    this.b = 2;
  }

  public final float c()
  {
    return getProgress() / getMax();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.RateLimitedSeekBar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
