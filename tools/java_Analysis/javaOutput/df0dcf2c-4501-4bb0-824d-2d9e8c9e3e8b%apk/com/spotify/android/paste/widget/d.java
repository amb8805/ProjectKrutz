package com.spotify.android.paste.widget;

import android.content.Context;
import android.widget.Checkable;
import android.widget.ImageButton;

public final class d extends ImageButton
  implements Checkable
{
  private static final int[] b = { 16842912 };
  private boolean a;

  public d(Context paramContext)
  {
    super(paramContext);
  }

  public final boolean isChecked()
  {
    return this.a;
  }

  public final int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (isChecked())
      mergeDrawableStates(arrayOfInt, b);
    return arrayOfInt;
  }

  public final boolean performClick()
  {
    toggle();
    return super.performClick();
  }

  public final void setChecked(boolean paramBoolean)
  {
    if (this.a != paramBoolean)
    {
      this.a = paramBoolean;
      refreshDrawableState();
    }
  }

  public final void toggle()
  {
    if (!isChecked());
    for (boolean bool = true; ; bool = false)
    {
      setChecked(bool);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
