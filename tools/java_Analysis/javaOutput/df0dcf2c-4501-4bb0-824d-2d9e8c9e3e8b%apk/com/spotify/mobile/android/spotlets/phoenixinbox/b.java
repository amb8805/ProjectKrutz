package com.spotify.mobile.android.spotlets.phoenixinbox;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.paste.widget.f;

public final class b extends android.support.v4.widget.a
{
  public b(Context paramContext)
  {
    super(paramContext);
  }

  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    if (f.a(paramContext));
    for (Object localObject = InboxItemCell.a(paramContext, paramViewGroup); ; localObject = new InboxItemView(paramContext))
    {
      ((View)localObject).setTag(new a());
      return localObject;
    }
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    a locala = (a)paramView.getTag();
    locala.a(paramCursor);
    if (f.a(paramContext))
    {
      ((InboxItemCell)paramView).a(locala);
      return;
    }
    ((InboxItemView)paramView).a(locala);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.phoenixinbox.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
