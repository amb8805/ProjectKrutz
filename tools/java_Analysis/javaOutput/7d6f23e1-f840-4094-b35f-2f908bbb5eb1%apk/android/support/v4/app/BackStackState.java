package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class BackStackState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new BackStackState.1();
  final int mBreadCrumbShortTitleRes;
  final CharSequence mBreadCrumbShortTitleText;
  final int mBreadCrumbTitleRes;
  final CharSequence mBreadCrumbTitleText;
  final int mIndex;
  final String mName;
  final int[] mOps;
  final int mTransition;
  final int mTransitionStyle;

  public BackStackState(Parcel paramParcel)
  {
    this.mOps = paramParcel.createIntArray();
    this.mTransition = paramParcel.readInt();
    this.mTransitionStyle = paramParcel.readInt();
    this.mName = paramParcel.readString();
    this.mIndex = paramParcel.readInt();
    this.mBreadCrumbTitleRes = paramParcel.readInt();
    this.mBreadCrumbTitleText = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.mBreadCrumbShortTitleRes = paramParcel.readInt();
    this.mBreadCrumbShortTitleText = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
  }

  public BackStackState(FragmentManagerImpl paramFragmentManagerImpl, BackStackRecord paramBackStackRecord)
  {
    BackStackRecord.Op localOp1 = paramBackStackRecord.mHead;
    int i = 0;
    while (localOp1 != null)
    {
      if (localOp1.removed != null)
        i += localOp1.removed.size();
      localOp1 = localOp1.next;
    }
    this.mOps = new int[i + 5 * paramBackStackRecord.mNumOp];
    if (!paramBackStackRecord.mAddToBackStack)
      throw new IllegalStateException("Not on back stack");
    BackStackRecord.Op localOp2 = paramBackStackRecord.mHead;
    int j = 0;
    if (localOp2 != null)
    {
      int[] arrayOfInt1 = this.mOps;
      int k = j + 1;
      arrayOfInt1[j] = localOp2.cmd;
      int[] arrayOfInt2 = this.mOps;
      int m = k + 1;
      arrayOfInt2[k] = localOp2.fragment.mIndex;
      int[] arrayOfInt3 = this.mOps;
      int n = m + 1;
      arrayOfInt3[m] = localOp2.enterAnim;
      int[] arrayOfInt4 = this.mOps;
      int i1 = n + 1;
      arrayOfInt4[n] = localOp2.exitAnim;
      int i4;
      if (localOp2.removed != null)
      {
        int i3 = localOp2.removed.size();
        int[] arrayOfInt6 = this.mOps;
        i4 = i1 + 1;
        arrayOfInt6[i1] = i3;
        int i5 = 0;
        while (i5 < i3)
        {
          int[] arrayOfInt7 = this.mOps;
          int i6 = i4 + 1;
          arrayOfInt7[i4] = ((Fragment)localOp2.removed.get(i5)).mIndex;
          i5++;
          i4 = i6;
        }
      }
      int i2;
      for (j = i4; ; j = i2)
      {
        localOp2 = localOp2.next;
        break;
        int[] arrayOfInt5 = this.mOps;
        i2 = i1 + 1;
        arrayOfInt5[i1] = 0;
      }
    }
    this.mTransition = paramBackStackRecord.mTransition;
    this.mTransitionStyle = paramBackStackRecord.mTransitionStyle;
    this.mName = paramBackStackRecord.mName;
    this.mIndex = paramBackStackRecord.mIndex;
    this.mBreadCrumbTitleRes = paramBackStackRecord.mBreadCrumbTitleRes;
    this.mBreadCrumbTitleText = paramBackStackRecord.mBreadCrumbTitleText;
    this.mBreadCrumbShortTitleRes = paramBackStackRecord.mBreadCrumbShortTitleRes;
    this.mBreadCrumbShortTitleText = paramBackStackRecord.mBreadCrumbShortTitleText;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final BackStackRecord instantiate(FragmentManagerImpl paramFragmentManagerImpl)
  {
    BackStackRecord localBackStackRecord = new BackStackRecord(paramFragmentManagerImpl);
    int i = 0;
    while (i < this.mOps.length)
    {
      BackStackRecord.Op localOp = new BackStackRecord.Op();
      int[] arrayOfInt1 = this.mOps;
      int j = i + 1;
      localOp.cmd = arrayOfInt1[i];
      if (FragmentManagerImpl.DEBUG)
        Log.v("FragmentManager", "BSE " + localBackStackRecord + " set base fragment #" + this.mOps[j]);
      ArrayList localArrayList1 = paramFragmentManagerImpl.mActive;
      int[] arrayOfInt2 = this.mOps;
      int k = j + 1;
      localOp.fragment = ((Fragment)localArrayList1.get(arrayOfInt2[j]));
      int[] arrayOfInt3 = this.mOps;
      int m = k + 1;
      localOp.enterAnim = arrayOfInt3[k];
      int[] arrayOfInt4 = this.mOps;
      int n = m + 1;
      localOp.exitAnim = arrayOfInt4[m];
      int[] arrayOfInt5 = this.mOps;
      int i1 = n + 1;
      int i2 = arrayOfInt5[n];
      if (i2 > 0)
      {
        localOp.removed = new ArrayList(i2);
        i = i1;
        int i3 = 0;
        while (i3 < i2)
        {
          if (FragmentManagerImpl.DEBUG)
            Log.v("FragmentManager", "BSE " + localBackStackRecord + " set remove fragment #" + this.mOps[i]);
          ArrayList localArrayList2 = paramFragmentManagerImpl.mActive;
          int[] arrayOfInt6 = this.mOps;
          int i4 = i + 1;
          Fragment localFragment = (Fragment)localArrayList2.get(arrayOfInt6[i]);
          localOp.removed.add(localFragment);
          i3++;
          i = i4;
        }
      }
      i = i1;
      localBackStackRecord.addOp(localOp);
    }
    localBackStackRecord.mTransition = this.mTransition;
    localBackStackRecord.mTransitionStyle = this.mTransitionStyle;
    localBackStackRecord.mName = this.mName;
    localBackStackRecord.mIndex = this.mIndex;
    localBackStackRecord.mAddToBackStack = true;
    localBackStackRecord.mBreadCrumbTitleRes = this.mBreadCrumbTitleRes;
    localBackStackRecord.mBreadCrumbTitleText = this.mBreadCrumbTitleText;
    localBackStackRecord.mBreadCrumbShortTitleRes = this.mBreadCrumbShortTitleRes;
    localBackStackRecord.mBreadCrumbShortTitleText = this.mBreadCrumbShortTitleText;
    localBackStackRecord.bumpBackStackNesting(1);
    return localBackStackRecord;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeIntArray(this.mOps);
    paramParcel.writeInt(this.mTransition);
    paramParcel.writeInt(this.mTransitionStyle);
    paramParcel.writeString(this.mName);
    paramParcel.writeInt(this.mIndex);
    paramParcel.writeInt(this.mBreadCrumbTitleRes);
    TextUtils.writeToParcel(this.mBreadCrumbTitleText, paramParcel, 0);
    paramParcel.writeInt(this.mBreadCrumbShortTitleRes);
    TextUtils.writeToParcel(this.mBreadCrumbShortTitleText, paramParcel, 0);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.BackStackState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
