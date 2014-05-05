package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new FragmentState.1();
  final Bundle mArguments;
  final String mClassName;
  final int mContainerId;
  final boolean mDetached;
  final int mFragmentId;
  final boolean mFromLayout;
  final int mIndex;
  Fragment mInstance;
  final boolean mRetainInstance;
  Bundle mSavedFragmentState;
  final String mTag;

  public FragmentState(Parcel paramParcel)
  {
    this.mClassName = paramParcel.readString();
    this.mIndex = paramParcel.readInt();
    boolean bool1;
    boolean bool2;
    if (paramParcel.readInt() != 0)
    {
      bool1 = true;
      this.mFromLayout = bool1;
      this.mFragmentId = paramParcel.readInt();
      this.mContainerId = paramParcel.readInt();
      this.mTag = paramParcel.readString();
      if (paramParcel.readInt() == 0)
        break label110;
      bool2 = true;
      label67: this.mRetainInstance = bool2;
      if (paramParcel.readInt() == 0)
        break label115;
    }
    label110: label115: for (boolean bool3 = true; ; bool3 = false)
    {
      this.mDetached = bool3;
      this.mArguments = paramParcel.readBundle();
      this.mSavedFragmentState = paramParcel.readBundle();
      return;
      bool1 = false;
      break;
      bool2 = false;
      break label67;
    }
  }

  public FragmentState(Fragment paramFragment)
  {
    this.mClassName = paramFragment.getClass().getName();
    this.mIndex = paramFragment.mIndex;
    this.mFromLayout = paramFragment.mFromLayout;
    this.mFragmentId = paramFragment.mFragmentId;
    this.mContainerId = paramFragment.mContainerId;
    this.mTag = paramFragment.mTag;
    this.mRetainInstance = paramFragment.mRetainInstance;
    this.mDetached = paramFragment.mDetached;
    this.mArguments = paramFragment.mArguments;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final Fragment instantiate(FragmentActivity paramFragmentActivity)
  {
    if (this.mInstance != null)
      return this.mInstance;
    if (this.mArguments != null)
      this.mArguments.setClassLoader(paramFragmentActivity.getClassLoader());
    this.mInstance = Fragment.instantiate(paramFragmentActivity, this.mClassName, this.mArguments);
    if (this.mSavedFragmentState != null)
    {
      this.mSavedFragmentState.setClassLoader(paramFragmentActivity.getClassLoader());
      this.mInstance.mSavedFragmentState = this.mSavedFragmentState;
    }
    this.mInstance.setIndex(this.mIndex);
    this.mInstance.mFromLayout = this.mFromLayout;
    this.mInstance.mRestored = true;
    this.mInstance.mFragmentId = this.mFragmentId;
    this.mInstance.mContainerId = this.mContainerId;
    this.mInstance.mTag = this.mTag;
    this.mInstance.mRetainInstance = this.mRetainInstance;
    this.mInstance.mDetached = this.mDetached;
    this.mInstance.mFragmentManager = paramFragmentActivity.mFragments;
    return this.mInstance;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.mClassName);
    paramParcel.writeInt(this.mIndex);
    int i;
    int j;
    if (this.mFromLayout)
    {
      i = 1;
      paramParcel.writeInt(i);
      paramParcel.writeInt(this.mFragmentId);
      paramParcel.writeInt(this.mContainerId);
      paramParcel.writeString(this.mTag);
      if (!this.mRetainInstance)
        break label108;
      j = 1;
      label64: paramParcel.writeInt(j);
      if (!this.mDetached)
        break label114;
    }
    label108: label114: for (int k = 1; ; k = 0)
    {
      paramParcel.writeInt(k);
      paramParcel.writeBundle(this.mArguments);
      paramParcel.writeBundle(this.mSavedFragmentState);
      return;
      i = 0;
      break;
      j = 0;
      break label64;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.FragmentState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
