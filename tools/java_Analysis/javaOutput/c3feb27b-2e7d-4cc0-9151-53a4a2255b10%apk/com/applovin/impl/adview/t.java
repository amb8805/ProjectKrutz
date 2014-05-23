package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.applovin.sdk.AppLovinAdSize;

class t
{
  static AppLovinAdSize a(AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet == null);
    String str;
    do
    {
      return null;
      str = paramAttributeSet.getAttributeValue("http://schemas.applovin.com/android/1.0", "size");
    }
    while (str == null);
    return AppLovinAdSize.fromString(str);
  }

  static String a(AttributeSet paramAttributeSet, Context paramContext)
  {
    String str = null;
    if (paramAttributeSet != null)
      str = paramAttributeSet.getAttributeValue("http://schemas.applovin.com/android/1.0", "placement");
    if ((str == null) && ((paramContext instanceof Activity)))
      str = paramContext.getClass().getName();
    return str;
  }

  static boolean b(AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet == null)
      return false;
    return paramAttributeSet.getAttributeBooleanValue("http://schemas.applovin.com/android/1.0", "loadAdOnCreate", false);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
