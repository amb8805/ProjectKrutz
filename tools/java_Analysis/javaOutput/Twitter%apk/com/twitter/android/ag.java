package com.twitter.android;

import android.text.Editable;
import android.text.TextWatcher;

final class ag
  implements TextWatcher
{
  ag(MessagesThreadActivity paramMessagesThreadActivity)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a.g = paramCharSequence.toString();
    this.a.d();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
