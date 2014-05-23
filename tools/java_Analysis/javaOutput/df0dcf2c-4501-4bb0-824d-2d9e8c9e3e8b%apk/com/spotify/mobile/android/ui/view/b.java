package com.spotify.mobile.android.ui.view;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

final class b
  implements a
{
  private SeekBar.OnSeekBarChangeListener a;
  private boolean b;

  public b(SeekBar.OnSeekBarChangeListener paramOnSeekBarChangeListener)
  {
    this.a = paramOnSeekBarChangeListener;
  }

  public final void a()
  {
    this.b = true;
  }

  public final void a(SeekBar paramSeekBar)
  {
    if ((this.a instanceof a))
      ((a)this.a).a(paramSeekBar);
  }

  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    this.a.onProgressChanged(paramSeekBar, paramInt, paramBoolean);
  }

  public final void onStartTrackingTouch(SeekBar paramSeekBar)
  {
    this.a.onStartTrackingTouch(paramSeekBar);
  }

  public final void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    if (this.b)
    {
      this.b = false;
      return;
    }
    this.a.onStopTrackingTouch(paramSeekBar);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
