package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;

public abstract class Animator
  implements Cloneable
{
  ArrayList<Animator.AnimatorListener> mListeners = null;

  public Animator()
  {
  }

  public void addListener(Animator.AnimatorListener paramAnimatorListener)
  {
    if (this.mListeners == null)
      this.mListeners = new ArrayList();
    this.mListeners.add(paramAnimatorListener);
  }

  public void cancel()
  {
  }

  public Animator clone()
  {
    Animator localAnimator;
    int i;
    try
    {
      localAnimator = (Animator)super.clone();
      if (this.mListeners == null)
        break label82;
      ArrayList localArrayList = this.mListeners;
      localAnimator.mListeners = new ArrayList();
      i = localArrayList.size();
      j = 0;
      break label75;
      localAnimator.mListeners.add((Animator.AnimatorListener)localArrayList.get(j));
      j++;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError();
    }
    int j;
    label75: 
    while (j < i);
    label82: return localAnimator;
  }

  public void end()
  {
  }

  public abstract long getDuration();

  public ArrayList<Animator.AnimatorListener> getListeners()
  {
    return this.mListeners;
  }

  public abstract long getStartDelay();

  public abstract boolean isRunning();

  public boolean isStarted()
  {
    return isRunning();
  }

  public void removeAllListeners()
  {
    if (this.mListeners != null)
    {
      this.mListeners.clear();
      this.mListeners = null;
    }
  }

  public void removeListener(Animator.AnimatorListener paramAnimatorListener)
  {
    if (this.mListeners == null);
    do
    {
      return;
      this.mListeners.remove(paramAnimatorListener);
    }
    while (this.mListeners.size() != 0);
    this.mListeners = null;
  }

  public abstract Animator setDuration(long paramLong);

  public abstract void setInterpolator(Interpolator paramInterpolator);

  public abstract void setStartDelay(long paramLong);

  public void setTarget(Object paramObject)
  {
  }

  public void setupEndValues()
  {
  }

  public void setupStartValues()
  {
  }

  public void start()
  {
  }
}

/* Location:
 * Qualified Name:     com.nineoldandroids.animation.Animator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
