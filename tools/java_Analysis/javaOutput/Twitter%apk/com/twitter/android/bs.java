package com.twitter.android;

import android.widget.Toast;
import com.twitter.android.client.g;
import com.twitter.android.client.i;
import com.twitter.android.client.j;

final class bs extends i
{
  private bs(ListsFragment paramListsFragment)
  {
  }

  public final void b(j paramj, String paramString1, int paramInt1, String paramString2, long paramLong, int paramInt2)
  {
    dp localdp = this.a.c(paramString1);
    int i;
    if (localdp != null)
    {
      i = localdp.b;
      if ((this.a.a != -1) || (paramInt2 != 0))
        break label75;
      this.a.a(this.a.j.b(this.a.o, 2, this.a.b(i)), i);
    }
    label75: 
    do
    {
      return;
      this.a.c(i);
    }
    while (paramInt1 == 200);
    Toast.makeText(this.a.getActivity(), 2131427433, 1).show();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.bs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
