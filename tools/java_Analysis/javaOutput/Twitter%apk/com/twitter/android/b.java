package com.twitter.android;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.twitter.android.provider.aa;
import com.twitter.android.provider.ae;
import com.twitter.android.provider.ar;
import com.twitter.android.provider.ax;
import com.twitter.android.widget.CardRowView;
import com.twitter.android.widget.TweetView;
import com.twitter.android.widget.c;
import cr;
import dz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class b extends cw
{
  private final c e;
  private final ArrayList f;

  public b(Context paramContext, int paramInt, com.twitter.android.client.g paramg, c paramc)
  {
    super(paramContext, 2, paramg);
    this.e = paramc;
    this.f = new ArrayList();
  }

  private static ax a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    ax localax = new ax();
    if (a(paramArrayList1) > 0)
    {
      ar localar = (ar)paramArrayList1.get(0);
      localax.n = localar.a;
      localax.p = localar.b;
      localax.k = localar.d;
      localax.g = localar.c;
    }
    if (a(paramArrayList2) > 0)
    {
      com.twitter.android.provider.g localg = (com.twitter.android.provider.g)paramArrayList2.get(0);
      localax.s = localg.a;
      localax.h = localg.b;
      localax.d = localg.c;
      localax.x = localg.d;
      localax.j = localg.f;
      localax.u = localg.g;
    }
    return localax;
  }

  private static void a(ImageView paramImageView, int paramInt)
  {
    switch (paramInt)
    {
    case 2:
    case 3:
    default:
      paramImageView.setImageBitmap(null);
      return;
    case 1:
      paramImageView.setImageResource(2130837651);
      return;
    case 5:
      paramImageView.setImageResource(2130837654);
      return;
    case 4:
      paramImageView.setImageResource(2130837660);
      return;
    case 6:
    case 7:
    }
    paramImageView.setImageResource(2130837657);
  }

  public final Intent a(Context paramContext, View paramView, Cursor paramCursor)
  {
    switch (paramCursor.getInt(1))
    {
    default:
      return null;
    case 5:
      return a(paramContext, (fg)paramView.getTag(), this.c.e(), 8);
    case 1:
    case 4:
      return a(paramContext, (fg)paramView.getTag(), this.c.e(), 8);
    case 6:
      return b(paramContext, (fg)paramView.getTag());
    case 2:
    case 3:
    }
    ax localax = ((ct)paramView.getTag()).c.a();
    if (localax == null)
      return null;
    return new Intent(paramContext, TweetActivity.class).setData(aa.a(localax.s, this.c.e()));
  }

  public final void a(dz paramdz, HashMap paramHashMap)
  {
    if (1 == paramdz.d)
    {
      Iterator localIterator2 = this.f.iterator();
      while (localIterator2.hasNext())
        ((ct)localIterator2.next()).c.b();
    }
    if (2 == paramdz.d)
    {
      Resources localResources = this.b.getResources();
      Iterator localIterator1 = this.d.iterator();
      while (localIterator1.hasNext())
      {
        ViewGroup localViewGroup = ((fg)localIterator1.next()).i;
        if (localViewGroup.getVisibility() == 0)
        {
          int i = localViewGroup.getChildCount();
          for (int j = 0; j < i; j++)
            a(localResources, (ImageView)localViewGroup.getChildAt(j), paramHashMap);
        }
      }
    }
  }

  public final void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    int i = paramCursor.getInt(1);
    switch (i)
    {
    case 3:
    default:
      ct localct2 = (ct)paramView.getTag();
      localct2.c.a(this.c.b);
      localct2.c.a(a(a(paramCursor, 1), b(paramCursor, 2)));
    case 1:
    case 4:
    case 5:
    case 6:
    case 2:
    }
    while (true)
    {
      ((CardRowView)paramView).a(paramCursor.getPosition(), getCount());
      return;
      Resources localResources2 = paramContext.getResources();
      fg localfg2 = (fg)paramView.getTag();
      a(localfg2.f, i);
      ArrayList localArrayList3 = a(paramCursor, 1);
      TextView localTextView2 = localfg2.g;
      int j = paramCursor.getInt(3);
      int k = a(localArrayList3);
      label208: String str2;
      label211: label222: ArrayList localArrayList4;
      if (k == 1)
        switch (i)
        {
        case 2:
        case 3:
        default:
          str2 = null;
          if (str2 == null)
          {
            localTextView2.setText(null);
            localArrayList4 = b(paramCursor, 2);
            if (a(localArrayList4) != 0)
              break label858;
          }
        case 1:
        case 5:
        case 4:
        }
      label858: for (Object localObject2 = null; ; localObject2 = (com.twitter.android.provider.g)localArrayList4.get(0))
      {
        localfg2.g.setTag(localObject2);
        StringBuilder localStringBuilder = new StringBuilder().append(cr.a(localResources2, paramCursor.getLong(2), true));
        if (localObject2 != null)
          localStringBuilder.append(localResources2.getString(2131427650)).append(((com.twitter.android.provider.g)localObject2).c);
        localfg2.h.setText(localStringBuilder.toString());
        a(localResources2, localfg2.i, localArrayList3);
        break;
        Object[] arrayOfObject10 = new Object[1];
        arrayOfObject10[0] = ((ar)localArrayList3.get(0)).c;
        str2 = localResources2.getString(2131427651, arrayOfObject10);
        break label211;
        Object[] arrayOfObject9 = new Object[1];
        arrayOfObject9[0] = ((ar)localArrayList3.get(0)).c;
        str2 = localResources2.getString(2131427654, arrayOfObject9);
        break label211;
        Object[] arrayOfObject8 = new Object[1];
        arrayOfObject8[0] = ((ar)localArrayList3.get(0)).c;
        str2 = localResources2.getString(2131427657, arrayOfObject8);
        break label211;
        if (k == 2)
          switch (i)
          {
          case 2:
          case 3:
          default:
            break;
          case 1:
            Object[] arrayOfObject7 = new Object[2];
            arrayOfObject7[0] = ((ar)localArrayList3.get(0)).c;
            arrayOfObject7[1] = ((ar)localArrayList3.get(1)).c;
            str2 = localResources2.getString(2131427652, arrayOfObject7);
            break;
          case 5:
            Object[] arrayOfObject6 = new Object[2];
            arrayOfObject6[0] = ((ar)localArrayList3.get(0)).c;
            arrayOfObject6[1] = ((ar)localArrayList3.get(1)).c;
            str2 = localResources2.getString(2131427655, arrayOfObject6);
            break;
          case 4:
            Object[] arrayOfObject5 = new Object[2];
            arrayOfObject5[0] = ((ar)localArrayList3.get(0)).c;
            arrayOfObject5[1] = ((ar)localArrayList3.get(1)).c;
            str2 = localResources2.getString(2131427658, arrayOfObject5);
            break;
          }
        if (k <= 2)
          break label208;
        Integer localInteger = Integer.valueOf(j - 1);
        switch (i)
        {
        case 2:
        case 3:
        default:
          break;
        case 1:
          Object[] arrayOfObject4 = new Object[2];
          arrayOfObject4[0] = ((ar)localArrayList3.get(0)).c;
          arrayOfObject4[1] = localInteger;
          str2 = localResources2.getString(2131427653, arrayOfObject4);
          break;
        case 5:
          Object[] arrayOfObject3 = new Object[2];
          arrayOfObject3[0] = ((ar)localArrayList3.get(0)).c;
          arrayOfObject3[1] = localInteger;
          str2 = localResources2.getString(2131427656, arrayOfObject3);
          break;
        case 4:
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = ((ar)localArrayList3.get(0)).c;
          arrayOfObject2[1] = localInteger;
          str2 = localResources2.getString(2131427659, arrayOfObject2);
          break label211;
          localTextView2.setTextSize(this.c.b);
          localTextView2.setText(cr.a(a, str2, (char)'"'));
          break label222;
        }
      }
      fg localfg1 = (fg)paramView.getTag();
      a(localfg1.f, i);
      ArrayList localArrayList1 = a(paramCursor, 1);
      String str1;
      label909: ArrayList localArrayList2;
      Object localObject1;
      if (a(localArrayList1) == 0)
      {
        str1 = null;
        localArrayList2 = c(paramCursor, 3);
        if (a(localArrayList2) != 0)
          break label1017;
        localObject1 = null;
        label927: localfg1.g.setTag(localObject1);
        if ((str1 != null) && (localObject1 != null) && (((ae)localObject1).c != null))
          break label1031;
        localfg1.g.setText(null);
      }
      while (true)
      {
        localfg1.h.setText(cr.a(paramContext.getResources(), paramCursor.getLong(2), true));
        localfg1.i.setVisibility(8);
        break;
        str1 = ((ar)localArrayList1.get(0)).c;
        break label909;
        label1017: localObject1 = (ae)localArrayList2.get(0);
        break label927;
        label1031: localfg1.g.setTextSize(this.c.b);
        TextView localTextView1 = localfg1.g;
        StyleSpan localStyleSpan = a;
        Resources localResources1 = paramContext.getResources();
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = str1;
        arrayOfObject1[1] = ((ae)localObject1).c;
        localTextView1.setText(cr.a(localStyleSpan, localResources1.getString(2131427660, arrayOfObject1), (char)'"'));
      }
      ct localct1 = (ct)paramView.getTag();
      localct1.c.a(this.c.b);
      localct1.c.a(a(a(paramCursor, 1), b(paramCursor, 3)));
    }
  }

  public final int getItemViewType(int paramInt)
  {
    switch (((Cursor)getItem(paramInt)).getInt(1))
    {
    case 2:
    case 3:
    default:
      return 0;
    case 1:
    case 4:
    case 5:
    case 6:
    }
    return 1;
  }

  public final int getViewTypeCount()
  {
    return 2;
  }

  public final View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    switch (paramCursor.getInt(1))
    {
    case 2:
    case 3:
    default:
      View localView2 = localLayoutInflater.inflate(2130903116, paramViewGroup, false);
      ct localct = new ct(localView2);
      localct.c.a(this.e);
      localView2.setTag(localct);
      this.f.add(localct);
      return localView2;
    case 1:
    case 4:
    case 5:
    case 6:
    }
    View localView1 = localLayoutInflater.inflate(2130903045, paramViewGroup, false);
    fg localfg = new fg(localView1);
    localView1.setTag(localfg);
    this.d.add(localfg);
    return localView1;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
