package com.spotify.mobile.android.ui.page;

import android.content.Context;
import android.view.ViewGroup;

public enum DebugFlag
{
  private final int mInfoResId;
  private final String mPrefsKey;
  private final int mTitleResId;

  static
  {
    DebugFlag[] arrayOfDebugFlag = new DebugFlag[2];
    arrayOfDebugFlag[0] = a;
    arrayOfDebugFlag[1] = b;
  }

  private DebugFlag(String paramString, int paramInt1, int paramInt2)
  {
    this.mPrefsKey = paramString;
    this.mTitleResId = paramInt1;
    this.mInfoResId = paramInt2;
  }

  public static boolean a()
  {
    return false;
  }

  public final e a(Context paramContext, ViewGroup paramViewGroup)
  {
    return new e(paramContext, paramViewGroup, this.mPrefsKey, this.mTitleResId, this.mInfoResId);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.page.DebugFlag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
