package com.twitter.android;

import ad;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.android.client.g;
import com.twitter.android.widget.l;
import java.util.HashSet;

final class dm extends eq
{
  private final Context b;
  private ad c;

  public dm(Context paramContext, int paramInt1, g paramg, int paramInt2, l paraml, HashSet paramHashSet)
  {
    super(new cj(paramContext, 0, paramg, false, 2130837573, paraml, paramHashSet, 0, 0), 9);
    this.b = paramContext;
  }

  protected final View a(View paramView, ViewGroup paramViewGroup)
  {
    Context localContext = this.b;
    Object[] arrayOfObject = new Object[1];
    if (this.c == null);
    for (String str = ""; ; str = this.c.a())
    {
      arrayOfObject[0] = str;
      return a(paramView, paramViewGroup, localContext.getString(2131427375, arrayOfObject));
    }
  }

  protected final Object a()
  {
    return null;
  }

  protected final Object a(int paramInt)
  {
    return new Intent(this.b, ProfileActivity.class).putExtra("user_id", ((cj)this.a).getItemId(paramInt)).putExtra("type", 10);
  }

  public final void a(ad paramad)
  {
    if ((this.c != null) && (this.c.equals(paramad)))
      return;
    this.c = paramad;
    notifyDataSetChanged();
  }

  protected final View b(View paramView, ViewGroup paramViewGroup)
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.dm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
