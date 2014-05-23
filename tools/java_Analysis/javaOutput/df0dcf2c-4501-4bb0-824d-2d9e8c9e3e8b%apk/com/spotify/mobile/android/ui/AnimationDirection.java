package com.spotify.mobile.android.ui;

public enum AnimationDirection
{
  public int enter;
  public int exit;
  public int popEnter;
  public int popExit;

  static
  {
    AnimationDirection[] arrayOfAnimationDirection = new AnimationDirection[5];
    arrayOfAnimationDirection[0] = a;
    arrayOfAnimationDirection[1] = b;
    arrayOfAnimationDirection[2] = c;
    arrayOfAnimationDirection[3] = d;
    arrayOfAnimationDirection[4] = e;
  }

  private AnimationDirection(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.enter = paramInt1;
    this.exit = paramInt2;
    this.popEnter = paramInt3;
    this.popExit = paramInt4;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.AnimationDirection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
