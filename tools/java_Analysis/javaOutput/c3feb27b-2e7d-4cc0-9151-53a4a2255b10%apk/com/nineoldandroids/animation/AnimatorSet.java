package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class AnimatorSet extends Animator
{
  private ValueAnimator mDelayAnim = null;
  private long mDuration = -1L;
  private boolean mNeedsSort = true;
  private HashMap<Animator, AnimatorSet.Node> mNodeMap = new HashMap();
  private ArrayList<AnimatorSet.Node> mNodes = new ArrayList();
  private ArrayList<Animator> mPlayingSet = new ArrayList();
  private AnimatorSet.AnimatorSetListener mSetListener = null;
  private ArrayList<AnimatorSet.Node> mSortedNodes = new ArrayList();
  private long mStartDelay = 0L;
  private boolean mStarted = false;
  boolean mTerminated = false;

  public AnimatorSet()
  {
  }

  private void sortNodes()
  {
    if (this.mNeedsSort)
    {
      this.mSortedNodes.clear();
      ArrayList localArrayList1 = new ArrayList();
      int n = this.mNodes.size();
      int i1 = 0;
      ArrayList localArrayList2;
      if (i1 >= n)
        localArrayList2 = new ArrayList();
      int i3;
      while (true)
      {
        if (localArrayList1.size() <= 0)
        {
          this.mNeedsSort = false;
          if (this.mSortedNodes.size() == this.mNodes.size())
            break label298;
          throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
          AnimatorSet.Node localNode4 = (AnimatorSet.Node)this.mNodes.get(i1);
          if ((localNode4.dependencies == null) || (localNode4.dependencies.size() == 0))
            localArrayList1.add(localNode4);
          i1++;
          break;
        }
        int i2 = localArrayList1.size();
        i3 = 0;
        if (i3 < i2)
          break label176;
        localArrayList1.clear();
        localArrayList1.addAll(localArrayList2);
        localArrayList2.clear();
      }
      label176: AnimatorSet.Node localNode2 = (AnimatorSet.Node)localArrayList1.get(i3);
      this.mSortedNodes.add(localNode2);
      int i4;
      if (localNode2.nodeDependents != null)
        i4 = localNode2.nodeDependents.size();
      for (int i5 = 0; ; i5++)
      {
        if (i5 >= i4)
        {
          i3++;
          break;
        }
        AnimatorSet.Node localNode3 = (AnimatorSet.Node)localNode2.nodeDependents.get(i5);
        localNode3.nodeDependencies.remove(localNode2);
        if (localNode3.nodeDependencies.size() == 0)
          localArrayList2.add(localNode3);
      }
    }
    int i = this.mNodes.size();
    int j = 0;
    if (j >= i)
      label298: return;
    AnimatorSet.Node localNode1 = (AnimatorSet.Node)this.mNodes.get(j);
    int k;
    if ((localNode1.dependencies != null) && (localNode1.dependencies.size() > 0))
      k = localNode1.dependencies.size();
    for (int m = 0; ; m++)
    {
      if (m >= k)
      {
        localNode1.done = false;
        j++;
        break;
      }
      AnimatorSet.Dependency localDependency = (AnimatorSet.Dependency)localNode1.dependencies.get(m);
      if (localNode1.nodeDependencies == null)
        localNode1.nodeDependencies = new ArrayList();
      if (!localNode1.nodeDependencies.contains(localDependency.node))
        localNode1.nodeDependencies.add(localDependency.node);
    }
  }

  public void cancel()
  {
    this.mTerminated = true;
    Iterator localIterator3;
    label74: Iterator localIterator2;
    if (isStarted())
    {
      ArrayList localArrayList1 = this.mListeners;
      ArrayList localArrayList2 = null;
      if (localArrayList1 != null)
      {
        localArrayList2 = (ArrayList)this.mListeners.clone();
        localIterator3 = localArrayList2.iterator();
        if (localIterator3.hasNext())
          break label100;
      }
      if ((this.mDelayAnim == null) || (!this.mDelayAnim.isRunning()))
        break label119;
      this.mDelayAnim.cancel();
      if (localArrayList2 != null)
        localIterator2 = localArrayList2.iterator();
    }
    while (true)
    {
      if (!localIterator2.hasNext())
      {
        this.mStarted = false;
        return;
        label100: ((Animator.AnimatorListener)localIterator3.next()).onAnimationCancel(this);
        break;
        label119: if (this.mSortedNodes.size() <= 0)
          break label74;
        Iterator localIterator1 = this.mSortedNodes.iterator();
        while (localIterator1.hasNext())
          ((AnimatorSet.Node)localIterator1.next()).animation.cancel();
        break label74;
      }
      ((Animator.AnimatorListener)localIterator2.next()).onAnimationEnd(this);
    }
  }

  public AnimatorSet clone()
  {
    AnimatorSet localAnimatorSet = (AnimatorSet)super.clone();
    localAnimatorSet.mNeedsSort = true;
    localAnimatorSet.mTerminated = false;
    localAnimatorSet.mStarted = false;
    localAnimatorSet.mPlayingSet = new ArrayList();
    localAnimatorSet.mNodeMap = new HashMap();
    localAnimatorSet.mNodes = new ArrayList();
    localAnimatorSet.mSortedNodes = new ArrayList();
    HashMap localHashMap = new HashMap();
    Iterator localIterator1 = this.mNodes.iterator();
    Iterator localIterator4;
    if (!localIterator1.hasNext())
      localIterator4 = this.mNodes.iterator();
    while (true)
    {
      if (!localIterator4.hasNext())
      {
        return localAnimatorSet;
        AnimatorSet.Node localNode1 = (AnimatorSet.Node)localIterator1.next();
        AnimatorSet.Node localNode2 = localNode1.clone();
        localHashMap.put(localNode1, localNode2);
        localAnimatorSet.mNodes.add(localNode2);
        localAnimatorSet.mNodeMap.put(localNode2.animation, localNode2);
        localNode2.dependencies = null;
        localNode2.tmpDependencies = null;
        localNode2.nodeDependents = null;
        localNode2.nodeDependencies = null;
        ArrayList localArrayList1 = localNode2.animation.getListeners();
        if (localArrayList1 == null)
          break;
        ArrayList localArrayList2 = null;
        Iterator localIterator2 = localArrayList1.iterator();
        while (true)
        {
          if (!localIterator2.hasNext())
          {
            if (localArrayList2 == null)
              break;
            Iterator localIterator3 = localArrayList2.iterator();
            while (localIterator3.hasNext())
              localArrayList1.remove((Animator.AnimatorListener)localIterator3.next());
            break;
          }
          Animator.AnimatorListener localAnimatorListener = (Animator.AnimatorListener)localIterator2.next();
          if ((localAnimatorListener instanceof AnimatorSet.AnimatorSetListener))
          {
            if (localArrayList2 == null)
              localArrayList2 = new ArrayList();
            localArrayList2.add(localAnimatorListener);
          }
        }
      }
      AnimatorSet.Node localNode3 = (AnimatorSet.Node)localIterator4.next();
      AnimatorSet.Node localNode4 = (AnimatorSet.Node)localHashMap.get(localNode3);
      if (localNode3.dependencies != null)
      {
        Iterator localIterator5 = localNode3.dependencies.iterator();
        while (localIterator5.hasNext())
        {
          AnimatorSet.Dependency localDependency = (AnimatorSet.Dependency)localIterator5.next();
          localNode4.addDependency(new AnimatorSet.Dependency((AnimatorSet.Node)localHashMap.get(localDependency.node), localDependency.rule));
        }
      }
    }
  }

  public void end()
  {
    this.mTerminated = true;
    Iterator localIterator3;
    Iterator localIterator2;
    label82: Iterator localIterator1;
    if (isStarted())
    {
      if (this.mSortedNodes.size() != this.mNodes.size())
      {
        sortNodes();
        localIterator3 = this.mSortedNodes.iterator();
        if (localIterator3.hasNext())
          break label127;
      }
      if (this.mDelayAnim != null)
        this.mDelayAnim.cancel();
      if (this.mSortedNodes.size() > 0)
      {
        localIterator2 = this.mSortedNodes.iterator();
        if (localIterator2.hasNext())
          break label173;
      }
      if (this.mListeners != null)
        localIterator1 = ((ArrayList)this.mListeners.clone()).iterator();
    }
    while (true)
    {
      if (!localIterator1.hasNext())
      {
        this.mStarted = false;
        return;
        label127: AnimatorSet.Node localNode = (AnimatorSet.Node)localIterator3.next();
        if (this.mSetListener == null)
          this.mSetListener = new AnimatorSet.AnimatorSetListener(this, this);
        localNode.animation.addListener(this.mSetListener);
        break;
        label173: ((AnimatorSet.Node)localIterator2.next()).animation.end();
        break label82;
      }
      ((Animator.AnimatorListener)localIterator1.next()).onAnimationEnd(this);
    }
  }

  public ArrayList<Animator> getChildAnimations()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.mNodes.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return localArrayList;
      localArrayList.add(((AnimatorSet.Node)localIterator.next()).animation);
    }
  }

  public long getDuration()
  {
    return this.mDuration;
  }

  public long getStartDelay()
  {
    return this.mStartDelay;
  }

  public boolean isRunning()
  {
    Iterator localIterator = this.mNodes.iterator();
    do
      if (!localIterator.hasNext())
        return false;
    while (!((AnimatorSet.Node)localIterator.next()).animation.isRunning());
    return true;
  }

  public boolean isStarted()
  {
    return this.mStarted;
  }

  public AnimatorSet.Builder play(Animator paramAnimator)
  {
    if (paramAnimator != null)
    {
      this.mNeedsSort = true;
      return new AnimatorSet.Builder(this, paramAnimator);
    }
    return null;
  }

  public void playSequentially(List<Animator> paramList)
  {
    if ((paramList != null) && (paramList.size() > 0))
    {
      this.mNeedsSort = true;
      if (paramList.size() != 1)
        break label44;
      play((Animator)paramList.get(0));
    }
    while (true)
    {
      return;
      label44: for (int i = 0; i < -1 + paramList.size(); i++)
        play((Animator)paramList.get(i)).before((Animator)paramList.get(i + 1));
    }
  }

  public void playSequentially(Animator[] paramArrayOfAnimator)
  {
    if (paramArrayOfAnimator != null)
    {
      this.mNeedsSort = true;
      if (paramArrayOfAnimator.length != 1)
        break label24;
      play(paramArrayOfAnimator[0]);
    }
    while (true)
    {
      return;
      label24: for (int i = 0; i < -1 + paramArrayOfAnimator.length; i++)
        play(paramArrayOfAnimator[i]).before(paramArrayOfAnimator[(i + 1)]);
    }
  }

  public void playTogether(Collection<Animator> paramCollection)
  {
    AnimatorSet.Builder localBuilder;
    Iterator localIterator;
    if ((paramCollection != null) && (paramCollection.size() > 0))
    {
      this.mNeedsSort = true;
      localBuilder = null;
      localIterator = paramCollection.iterator();
    }
    while (true)
    {
      if (!localIterator.hasNext())
        return;
      Animator localAnimator = (Animator)localIterator.next();
      if (localBuilder == null)
        localBuilder = play(localAnimator);
      else
        localBuilder.with(localAnimator);
    }
  }

  public void playTogether(Animator[] paramArrayOfAnimator)
  {
    AnimatorSet.Builder localBuilder;
    if (paramArrayOfAnimator != null)
    {
      this.mNeedsSort = true;
      localBuilder = play(paramArrayOfAnimator[0]);
    }
    for (int i = 1; ; i++)
    {
      if (i >= paramArrayOfAnimator.length)
        return;
      localBuilder.with(paramArrayOfAnimator[i]);
    }
  }

  public AnimatorSet setDuration(long paramLong)
  {
    if (paramLong < 0L)
      throw new IllegalArgumentException("duration must be a value of zero or greater");
    Iterator localIterator = this.mNodes.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
      {
        this.mDuration = paramLong;
        return this;
      }
      ((AnimatorSet.Node)localIterator.next()).animation.setDuration(paramLong);
    }
  }

  public void setInterpolator(Interpolator paramInterpolator)
  {
    Iterator localIterator = this.mNodes.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return;
      ((AnimatorSet.Node)localIterator.next()).animation.setInterpolator(paramInterpolator);
    }
  }

  public void setStartDelay(long paramLong)
  {
    this.mStartDelay = paramLong;
  }

  public void setTarget(Object paramObject)
  {
    Iterator localIterator = this.mNodes.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return;
      Animator localAnimator = ((AnimatorSet.Node)localIterator.next()).animation;
      if ((localAnimator instanceof AnimatorSet))
        ((AnimatorSet)localAnimator).setTarget(paramObject);
      else if ((localAnimator instanceof ObjectAnimator))
        ((ObjectAnimator)localAnimator).setTarget(paramObject);
    }
  }

  public void setupEndValues()
  {
    Iterator localIterator = this.mNodes.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return;
      ((AnimatorSet.Node)localIterator.next()).animation.setupEndValues();
    }
  }

  public void setupStartValues()
  {
    Iterator localIterator = this.mNodes.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return;
      ((AnimatorSet.Node)localIterator.next()).animation.setupStartValues();
    }
  }

  public void start()
  {
    this.mTerminated = false;
    this.mStarted = true;
    sortNodes();
    int i = this.mSortedNodes.size();
    int j = 0;
    ArrayList localArrayList1;
    int k;
    label40: Iterator localIterator1;
    label61: label71: ArrayList localArrayList3;
    int i4;
    label100: ArrayList localArrayList2;
    int i1;
    if (j >= i)
    {
      localArrayList1 = new ArrayList();
      k = 0;
      if (k < i)
        break label275;
      if (this.mStartDelay > 0L)
        break label475;
      localIterator1 = localArrayList1.iterator();
      if (localIterator1.hasNext())
        break label439;
      if (this.mListeners != null)
      {
        localArrayList3 = (ArrayList)this.mListeners.clone();
        int i3 = localArrayList3.size();
        i4 = 0;
        if (i4 < i3)
          break label531;
      }
      if ((this.mNodes.size() == 0) && (this.mStartDelay == 0L))
      {
        this.mStarted = false;
        if (this.mListeners != null)
        {
          localArrayList2 = (ArrayList)this.mListeners.clone();
          i1 = localArrayList2.size();
        }
      }
    }
    for (int i2 = 0; ; i2++)
    {
      if (i2 >= i1)
      {
        return;
        AnimatorSet.Node localNode3 = (AnimatorSet.Node)this.mSortedNodes.get(j);
        ArrayList localArrayList4 = localNode3.animation.getListeners();
        Iterator localIterator2;
        if ((localArrayList4 != null) && (localArrayList4.size() > 0))
          localIterator2 = new ArrayList(localArrayList4).iterator();
        while (true)
        {
          if (!localIterator2.hasNext())
          {
            j++;
            break;
          }
          Animator.AnimatorListener localAnimatorListener = (Animator.AnimatorListener)localIterator2.next();
          if (((localAnimatorListener instanceof AnimatorSet.DependencyListener)) || ((localAnimatorListener instanceof AnimatorSet.AnimatorSetListener)))
            localNode3.animation.removeListener(localAnimatorListener);
        }
        label275: AnimatorSet.Node localNode1 = (AnimatorSet.Node)this.mSortedNodes.get(k);
        if (this.mSetListener == null)
          this.mSetListener = new AnimatorSet.AnimatorSetListener(this, this);
        if ((localNode1.dependencies == null) || (localNode1.dependencies.size() == 0))
        {
          localArrayList1.add(localNode1);
          localNode1.animation.addListener(this.mSetListener);
          k++;
          break label40;
        }
        int m = localNode1.dependencies.size();
        for (int n = 0; ; n++)
        {
          if (n >= m)
          {
            localNode1.tmpDependencies = ((ArrayList)localNode1.dependencies.clone());
            break;
          }
          AnimatorSet.Dependency localDependency = (AnimatorSet.Dependency)localNode1.dependencies.get(n);
          localDependency.node.animation.addListener(new AnimatorSet.DependencyListener(this, localNode1, localDependency.rule));
        }
        label439: AnimatorSet.Node localNode2 = (AnimatorSet.Node)localIterator1.next();
        localNode2.animation.start();
        this.mPlayingSet.add(localNode2.animation);
        break label61;
        label475: this.mDelayAnim = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
        this.mDelayAnim.setDuration(this.mStartDelay);
        this.mDelayAnim.addListener(new AnimatorSet.1(this, localArrayList1));
        this.mDelayAnim.start();
        break label71;
        label531: ((Animator.AnimatorListener)localArrayList3.get(i4)).onAnimationStart(this);
        i4++;
        break label100;
      }
      ((Animator.AnimatorListener)localArrayList2.get(i2)).onAnimationEnd(this);
    }
  }
}

/* Location:
 * Qualified Name:     com.nineoldandroids.animation.AnimatorSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
