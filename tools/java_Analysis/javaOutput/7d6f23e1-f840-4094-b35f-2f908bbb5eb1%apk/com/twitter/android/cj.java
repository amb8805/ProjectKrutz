package com.twitter.android;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import com.twitter.android.client.g;
import com.twitter.android.widget.UserView;
import com.twitter.android.widget.l;
import java.util.ArrayList;
import java.util.Collection;

final class cj extends dd
{
  public cj(Context paramContext, int paramInt1, g paramg, boolean paramBoolean, int paramInt2, l paraml, Collection paramCollection, int paramInt3, int paramInt4)
  {
    super(paramContext, paramInt1, paramg, paramBoolean, paramInt2, paraml, paramCollection, paramInt3, paramInt4);
  }

  public final void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    super.bindView(paramView, paramContext, paramCursor);
    UserView localUserView = (UserView)paramView;
    ArrayList localArrayList = paramCursor.getExtras().getStringArrayList("conn_names");
    if ((localArrayList != null) && (!localArrayList.isEmpty()))
    {
      int i = localArrayList.size();
      switch (i)
      {
      default:
        Object[] arrayOfObject3 = new Object[3];
        arrayOfObject3[0] = localArrayList.get(0);
        arrayOfObject3[1] = localArrayList.get(1);
        arrayOfObject3[2] = Integer.valueOf(i - 2);
        localUserView.a(paramContext.getString(2131427562, arrayOfObject3));
        return;
      case 1:
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localArrayList.get(0);
        localUserView.a(paramContext.getString(2131427560, arrayOfObject2));
        return;
      case 2:
      }
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = localArrayList.get(0);
      arrayOfObject1[1] = localArrayList.get(1);
      localUserView.a(paramContext.getString(2131427561, arrayOfObject1));
      return;
    }
    localUserView.a(null);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.cj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
