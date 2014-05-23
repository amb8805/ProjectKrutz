package com.twitter.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class ConversationList extends ListView
{
  public ConversationList(Context paramContext)
  {
    super(paramContext);
  }

  public ConversationList(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ConversationList(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    setSelection(getCount() - 1);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.ConversationList
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
