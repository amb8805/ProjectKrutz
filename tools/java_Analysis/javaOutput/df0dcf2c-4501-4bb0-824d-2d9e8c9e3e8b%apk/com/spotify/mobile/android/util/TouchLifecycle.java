package com.spotify.mobile.android.util;

import android.view.MotionEvent;

public final class TouchLifecycle
{
  private final dn a;
  private TouchLifecycle.State b;
  private float c;
  private float d;
  private MotionEvent e;

  public TouchLifecycle(dn paramdn)
  {
    this.a = paramdn;
    this.b = TouchLifecycle.State.a;
  }

  public final boolean a(MotionEvent paramMotionEvent)
  {
    this.e = paramMotionEvent;
    if (paramMotionEvent.getActionMasked() == 0)
    {
      this.c = paramMotionEvent.getX();
      this.d = paramMotionEvent.getY();
      this.b = TouchLifecycle.State.a;
      this.b.a(this);
      return this.b.d(this);
    }
    if (paramMotionEvent.getActionMasked() == 2)
    {
      float f1 = Math.abs(this.c - paramMotionEvent.getX());
      float f2 = Math.abs(this.d - paramMotionEvent.getY());
      if (this.a.a(f1, f2))
        this.b.b(this);
      while (true)
      {
        return this.b.d(this);
        if (this.a.b(f1, f2))
          this.b.c(this);
      }
    }
    if ((paramMotionEvent.getActionMasked() == 6) || (paramMotionEvent.getActionMasked() == 5))
      return this.b.d(this);
    if ((paramMotionEvent.getActionMasked() == 1) || (paramMotionEvent.getActionMasked() == 3))
      return this.b.d(this);
    return false;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.TouchLifecycle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
