package com.twitter.android;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.MultiAutoCompleteTextView.Tokenizer;

final class bi
  implements MultiAutoCompleteTextView.Tokenizer
{
  private bi(PostActivity paramPostActivity)
  {
  }

  public final int findTokenEnd(CharSequence paramCharSequence, int paramInt)
  {
    int i = paramCharSequence.length();
    for (int j = paramInt; ; j++)
      if (j < i)
      {
        if (paramCharSequence.charAt(j) == ' ')
          i = j;
      }
      else
        return i;
  }

  public final int findTokenStart(CharSequence paramCharSequence, int paramInt)
  {
    for (int i = paramInt; (i > 0) && (paramCharSequence.charAt(i - 1) != ' '); i--);
    while ((i < paramInt) && (paramCharSequence.charAt(i) == ' '))
      i++;
    if ((i < paramInt) && (paramCharSequence.charAt(i) == '@'))
      return i + 1;
    return paramInt;
  }

  public final CharSequence terminateToken(CharSequence paramCharSequence)
  {
    if ((paramCharSequence instanceof Spanned))
    {
      SpannableString localSpannableString = new SpannableString(paramCharSequence);
      TextUtils.copySpansFrom((Spanned)paramCharSequence, 0, paramCharSequence.length(), Object.class, localSpannableString, 0);
      this.a.b(false);
      return localSpannableString;
    }
    this.a.b(false);
    return paramCharSequence;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.bi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
