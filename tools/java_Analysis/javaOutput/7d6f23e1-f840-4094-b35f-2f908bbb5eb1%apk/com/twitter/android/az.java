package com.twitter.android;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.support.v4.widget.CursorAdapter;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import be;
import com.twitter.android.client.g;
import com.twitter.android.widget.d;
import cr;

final class az extends CursorAdapter
{
  public az(MessagesThreadActivity paramMessagesThreadActivity, Cursor paramCursor)
  {
    super(paramMessagesThreadActivity, paramCursor);
  }

  public final void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    bg localbg = (bg)paramView.getTag();
    long l = paramCursor.getLong(2);
    String str = paramCursor.getString(5);
    if (str != null);
    for (Bitmap localBitmap = this.a.a.b(l, str); ; localBitmap = null)
    {
      if (localBitmap != null)
        localbg.a.setImageBitmap(localBitmap);
      while (true)
      {
        Resources localResources = paramContext.getResources();
        be localbe = this.a.a.a(2, paramCursor.getLong(1), paramCursor.getBlob(6));
        localbg.b.setTextSize(this.a.a.b);
        d.a(localResources, localbg.b, paramCursor.getString(3), localbe, this.a);
        localbg.c.setText(cr.a(paramContext.getResources(), paramCursor.getLong(4), false));
        return;
        localbg.a.setImageResource(2130837734);
      }
    }
  }

  public final View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    RelativeLayout localRelativeLayout = (RelativeLayout)LayoutInflater.from(paramContext).inflate(2130903081, paramViewGroup, false);
    bg localbg = new bg(this.a);
    localbg.a = ((ImageView)localRelativeLayout.findViewById(2131165258));
    localbg.b = ((TextView)localRelativeLayout.findViewById(2131165253));
    localbg.b.setMovementMethod(LinkMovementMethod.getInstance());
    localbg.c = ((TextView)localRelativeLayout.findViewById(2131165278));
    localRelativeLayout.setTag(localbg);
    return localRelativeLayout;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.az
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
