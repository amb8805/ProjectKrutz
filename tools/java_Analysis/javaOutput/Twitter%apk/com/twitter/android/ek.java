package com.twitter.android;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.MultiAutoCompleteTextView;
import java.util.ArrayList;
import java.util.Iterator;

final class ek
  implements DialogInterface.OnClickListener
{
  ek(PostActivity paramPostActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    as localas = (as)this.a.l.getEditableText();
    ArrayList localArrayList = this.a.m.a;
    if (localArrayList != null)
    {
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        int i = ((Integer)localIterator.next()).intValue();
        localas.a(i, "");
        this.a.c(i);
      }
      localArrayList.clear();
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ek
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
