package android.support.v4.app;

import android.os.Bundle;
import android.os.Bundle;;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class FragmentStatePagerAdapter extends PagerAdapter
{
  private static final boolean DEBUG = false;
  private static final String TAG = "FragmentStatePagerAdapter";
  private FragmentTransaction mCurTransaction = null;
  private final FragmentManager mFragmentManager;
  private ArrayList mFragments = new ArrayList();
  private ArrayList mSavedState = new ArrayList();

  public FragmentStatePagerAdapter(FragmentManager paramFragmentManager)
  {
    this.mFragmentManager = paramFragmentManager;
  }

  public void destroyItem(View paramView, int paramInt, Object paramObject)
  {
    Fragment localFragment = (Fragment)paramObject;
    if (this.mCurTransaction == null)
      this.mCurTransaction = this.mFragmentManager.beginTransaction();
    while (this.mSavedState.size() <= paramInt)
      this.mSavedState.add(null);
    this.mSavedState.set(paramInt, this.mFragmentManager.saveFragmentInstanceState(localFragment));
    this.mFragments.set(paramInt, null);
    this.mCurTransaction.remove(localFragment);
  }

  public void finishUpdate(View paramView)
  {
    if (this.mCurTransaction != null)
    {
      this.mCurTransaction.commit();
      this.mCurTransaction = null;
      this.mFragmentManager.executePendingTransactions();
    }
  }

  public abstract Fragment getItem(int paramInt);

  public Object instantiateItem(View paramView, int paramInt)
  {
    if (this.mFragments.size() > paramInt)
    {
      Fragment localFragment2 = (Fragment)this.mFragments.get(paramInt);
      if (localFragment2 != null)
        return localFragment2;
    }
    if (this.mCurTransaction == null)
      this.mCurTransaction = this.mFragmentManager.beginTransaction();
    Fragment localFragment1 = getItem(paramInt);
    if (this.mSavedState.size() > paramInt)
    {
      Fragment.SavedState localSavedState = (Fragment.SavedState)this.mSavedState.get(paramInt);
      if (localSavedState != null)
        localFragment1.setInitialSavedState(localSavedState);
    }
    while (this.mFragments.size() <= paramInt)
      this.mFragments.add(null);
    this.mFragments.set(paramInt, localFragment1);
    this.mCurTransaction.add(paramView.getId(), localFragment1);
    return localFragment1;
  }

  public boolean isViewFromObject(View paramView, Object paramObject)
  {
    return ((Fragment)paramObject).getView() == paramView;
  }

  public void restoreState(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
    if (paramParcelable != null)
    {
      Bundle localBundle = (Bundle)paramParcelable;
      localBundle.setClassLoader(paramClassLoader);
      Parcelable[] arrayOfParcelable = localBundle.getParcelableArray("states");
      this.mSavedState.clear();
      this.mFragments.clear();
      if (arrayOfParcelable != null)
        for (int j = 0; j < arrayOfParcelable.length; j++)
          this.mSavedState.add((Fragment.SavedState)arrayOfParcelable[j]);
      Iterator localIterator = localBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (str.startsWith("f"))
        {
          int i = Integer.parseInt(str.substring(1));
          Fragment localFragment = this.mFragmentManager.getFragment(localBundle, str);
          if (localFragment != null)
          {
            while (this.mFragments.size() <= i)
              this.mFragments.add(null);
            this.mFragments.set(i, localFragment);
          }
          else
          {
            Log.w("FragmentStatePagerAdapter", "Bad fragment at key " + str);
          }
        }
      }
    }
  }

  public Parcelable saveState()
  {
    int i = this.mSavedState.size();
    Bundle localBundle = null;
    if (i > 0)
    {
      localBundle = new Bundle();
      Fragment.SavedState[] arrayOfSavedState = new Fragment.SavedState[this.mSavedState.size()];
      this.mSavedState.toArray(arrayOfSavedState);
      localBundle.putParcelableArray("states", arrayOfSavedState);
    }
    int j = 0;
    Object localObject2;
    for (Object localObject1 = localBundle; j < this.mFragments.size(); localObject1 = localObject2)
    {
      Fragment localFragment = (Fragment)this.mFragments.get(j);
      if (localFragment != null)
      {
        if (localObject1 == null)
          localObject1 = new Bundle();
        String str = "f" + j;
        this.mFragmentManager.putFragment((Bundle)localObject1, str, localFragment);
      }
      localObject2 = localObject1;
      j++;
    }
    return localObject1;
  }

  public void startUpdate(View paramView)
  {
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.FragmentStatePagerAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
