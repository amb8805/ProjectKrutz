14:20:56.181 INFO  jd.cli.Main - Decompiling javaOutput/Gmail%apk/com/android/common/Rfc822InputFilter.class
package com.android.common;

import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;

public class Rfc822InputFilter
  implements InputFilter
{
  public Rfc822InputFilter()
  {
  }

  public CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    if ((paramInt2 - paramInt1 != 1) || (paramCharSequence.charAt(paramInt1) != ' '))
      return null;
    int i = paramInt3;
    int j = 0;
    while (i > 0)
    {
      i--;
      switch (paramSpanned.charAt(i))
      {
      default:
        break;
      case ',':
        return null;
      case '.':
        j = 1;
        break;
      case '@':
        if (j == 0)
          return null;
        if ((paramCharSequence instanceof Spanned))
        {
          SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(",");
          localSpannableStringBuilder.append(paramCharSequence);
          return localSpannableStringBuilder;
        }
        return ", ";
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.android.common.Rfc822InputFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
