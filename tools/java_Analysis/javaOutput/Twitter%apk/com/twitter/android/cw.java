package com.twitter.android;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.widget.CursorAdapter;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bl;
import com.twitter.android.provider.aa;
import com.twitter.android.provider.ae;
import com.twitter.android.provider.ar;
import cr;
import dz;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class cw extends CursorAdapter
{
  protected static final StyleSpan a = new StyleSpan(1);
  protected final Context b;
  protected final com.twitter.android.client.g c;
  protected final ArrayList d;

  public cw(Context paramContext, int paramInt, com.twitter.android.client.g paramg)
  {
    super(paramContext, null, 2);
    this.b = paramContext;
    this.c = paramg;
    this.d = new ArrayList();
  }

  protected static int a(ArrayList paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty()))
      return 0;
    return paramArrayList.size();
  }

  protected static Intent a(Context paramContext, fg paramfg, long paramLong, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, UsersActivity.class).setAction("com.twitter.android.intent.action.FOLLOW").putExtra("owner_id", paramLong).putExtra("type", 8);
    long[] arrayOfLong = b((ArrayList)paramfg.i.getTag());
    if (arrayOfLong != null)
      localIntent.putExtra("user_ids", arrayOfLong);
    return localIntent;
  }

  protected static ArrayList a(Cursor paramCursor, int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    }
    do
    {
      do
        return null;
      while (1 != paramCursor.getInt(4));
      return (ArrayList)cr.a(paramCursor.getBlob(5));
    }
    while (1 != paramCursor.getInt(7));
    return (ArrayList)cr.a(paramCursor.getBlob(8));
  }

  protected static void a(Resources paramResources, ViewGroup paramViewGroup, HashMap paramHashMap)
  {
    int i = paramViewGroup.getChildCount();
    for (int j = 0; j < i; j++)
      a(paramResources, (ImageView)paramViewGroup.getChildAt(j), paramHashMap);
  }

  protected static void a(Resources paramResources, ImageView paramImageView, Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      paramImageView.setBackgroundDrawable(new BitmapDrawable(paramResources, paramBitmap));
      return;
    }
    paramImageView.setBackgroundResource(2130837734);
  }

  protected static void a(Resources paramResources, ImageView paramImageView, HashMap paramHashMap)
  {
    Object localObject = paramImageView.getTag();
    if (localObject != null)
    {
      bl localbl = (bl)paramHashMap.get(localObject);
      if (localbl != null)
        a(paramResources, paramImageView, localbl.a());
    }
  }

  protected static Intent b(Context paramContext, fg paramfg)
  {
    ae localae = (ae)paramfg.g.getTag();
    if (localae == null)
      return null;
    return new Intent(paramContext, ListTabActivity.class).putExtra("list_id", localae.a).putExtra("list_name", localae.b).putExtra("list_fullname", localae.c).putExtra("creator_id", localae.d);
  }

  protected static ArrayList b(Cursor paramCursor, int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 2:
    case 3:
    }
    do
    {
      do
        return null;
      while (2 != paramCursor.getInt(7));
      return (ArrayList)cr.a(paramCursor.getBlob(8));
    }
    while (2 != paramCursor.getInt(10));
    return (ArrayList)cr.a(paramCursor.getBlob(11));
  }

  private static long[] b(ArrayList paramArrayList)
  {
    int i = a(paramArrayList);
    if (i > 0)
    {
      long[] arrayOfLong = new long[i];
      for (int j = 0; j < i; j++)
        arrayOfLong[j] = ((ar)paramArrayList.get(j)).a;
      return arrayOfLong;
    }
    return null;
  }

  protected static ArrayList c(Cursor paramCursor, int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 2:
    case 3:
    }
    do
    {
      do
        return null;
      while (3 != paramCursor.getInt(7));
      return (ArrayList)cr.a(paramCursor.getBlob(8));
    }
    while (3 != paramCursor.getInt(10));
    return (ArrayList)cr.a(paramCursor.getBlob(11));
  }

  public abstract Intent a(Context paramContext, View paramView, Cursor paramCursor);

  protected final Intent a(Context paramContext, fg paramfg)
  {
    com.twitter.android.provider.g localg = (com.twitter.android.provider.g)paramfg.g.getTag();
    if (localg == null)
      return null;
    return new Intent(paramContext, TweetActivity.class).setData(aa.a(localg.a, this.c.e()));
  }

  protected final void a(Resources paramResources, ViewGroup paramViewGroup, ArrayList paramArrayList)
  {
    int i = a(paramArrayList);
    if (i > 0)
    {
      paramViewGroup.setVisibility(0);
      paramViewGroup.setTag(paramArrayList);
      com.twitter.android.client.g localg = this.c;
      int j = paramViewGroup.getChildCount();
      int k = Math.min(i, j);
      for (int m = 0; m < k; m++)
      {
        ImageView localImageView2 = (ImageView)paramViewGroup.getChildAt(m);
        localImageView2.setVisibility(0);
        ar localar = (ar)paramArrayList.get(m);
        a(paramResources, localImageView2, localg.a(2, localar.a, localar.d));
        localImageView2.setTag(Long.valueOf(localar.a));
      }
      for (int n = k; n < j; n++)
      {
        ImageView localImageView1 = (ImageView)paramViewGroup.getChildAt(n);
        localImageView1.setVisibility(8);
        localImageView1.setTag(null);
      }
    }
    paramViewGroup.setVisibility(8);
    paramViewGroup.setTag(null);
  }

  public abstract void a(dz paramdz, HashMap paramHashMap);
}

/* Location:
 * Qualified Name:     com.twitter.android.cw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
