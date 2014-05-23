package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;

public final class h
{
  public static String a(String paramString1, String paramString2, Context paramContext, AttributeSet paramAttributeSet, String paramString3)
  {
    String str1;
    TypedValue localTypedValue;
    if (paramAttributeSet == null)
    {
      str1 = null;
      while (true)
        if ((str1 != null) && (str1.startsWith("@string/")))
        {
          String str2 = str1.substring(8);
          String str3 = paramContext.getPackageName();
          localTypedValue = new TypedValue();
          try
          {
            paramContext.getResources().getValue(str3 + ":string/" + str2, localTypedValue, true);
            if (localTypedValue.string != null)
            {
              str1 = localTypedValue.string.toString();
              return str1;
              str1 = paramAttributeSet.getAttributeValue(paramString1, paramString2);
            }
          }
          catch (Resources.NotFoundException localNotFoundException)
          {
            while (true)
              Log.w(paramString3, "Could not find resource for " + paramString2 + ": " + str1);
            Log.w(paramString3, "Resource " + paramString2 + " was not a string: " + localTypedValue);
          }
        }
    }
    return str1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
