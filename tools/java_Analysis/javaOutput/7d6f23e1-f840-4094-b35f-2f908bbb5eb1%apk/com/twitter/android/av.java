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
import com.twitter.android.provider.ae;
import com.twitter.android.provider.ar;
import com.twitter.android.provider.ar;;
import com.twitter.android.widget.CardRowView;
import cr;
import dz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class av extends cw
{
  public av(Context paramContext, int paramInt, com.twitter.android.client.g paramg)
  {
    super(paramContext, 2, paramg);
  }

  private void a(Resources paramResources, ImageView paramImageView, ar paramar)
  {
    if (paramar != null)
    {
      paramImageView.setVisibility(0);
      a(paramResources, paramImageView, this.c.a(1, paramar.a, paramar.d));
      paramImageView.setTag(Long.valueOf(paramar.a));
      return;
    }
    paramImageView.setVisibility(8);
    paramImageView.setTag(null);
  }

  private void a(Resources paramResources, TextView paramTextView, int paramInt1, ArrayList paramArrayList, int paramInt2)
  {
    int i = a(paramArrayList);
    String str;
    if (i == 1)
      switch (paramInt1)
      {
      case 2:
      case 3:
      default:
        str = null;
      case 1:
      case 5:
      case 4:
      }
    while (true)
    {
      if (str != null)
        break label542;
      paramTextView.setText(null);
      return;
      Object[] arrayOfObject9 = new Object[1];
      arrayOfObject9[0] = ((ar)paramArrayList.get(0)).c;
      str = paramResources.getString(2131427662, arrayOfObject9);
      continue;
      Object[] arrayOfObject8 = new Object[1];
      arrayOfObject8[0] = ((ar)paramArrayList.get(0)).c;
      str = paramResources.getString(2131427665, arrayOfObject8);
      continue;
      Object[] arrayOfObject7 = new Object[1];
      arrayOfObject7[0] = ((ar)paramArrayList.get(0)).c;
      str = paramResources.getString(2131427668, arrayOfObject7);
      continue;
      if (i == 2)
        switch (paramInt1)
        {
        case 2:
        case 3:
        default:
          break;
        case 1:
          Object[] arrayOfObject6 = new Object[2];
          arrayOfObject6[0] = ((ar)paramArrayList.get(0)).c;
          arrayOfObject6[1] = ((ar)paramArrayList.get(1)).c;
          str = paramResources.getString(2131427663, arrayOfObject6);
          break;
        case 5:
          Object[] arrayOfObject5 = new Object[2];
          arrayOfObject5[0] = ((ar)paramArrayList.get(0)).c;
          arrayOfObject5[1] = ((ar)paramArrayList.get(1)).c;
          str = paramResources.getString(2131427666, arrayOfObject5);
          break;
        case 4:
          Object[] arrayOfObject4 = new Object[2];
          arrayOfObject4[0] = ((ar)paramArrayList.get(0)).c;
          arrayOfObject4[1] = ((ar)paramArrayList.get(1)).c;
          str = paramResources.getString(2131427669, arrayOfObject4);
          break;
        }
      if (i <= 2)
        break;
      Integer localInteger = Integer.valueOf(paramInt2 - 1);
      switch (paramInt1)
      {
      case 2:
      case 3:
      default:
        break;
      case 1:
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = ((ar)paramArrayList.get(0)).c;
        arrayOfObject3[1] = localInteger;
        str = paramResources.getString(2131427664, arrayOfObject3);
        break;
      case 5:
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = ((ar)paramArrayList.get(0)).c;
        arrayOfObject2[1] = localInteger;
        str = paramResources.getString(2131427667, arrayOfObject2);
        break;
      case 4:
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = ((ar)paramArrayList.get(0)).c;
        arrayOfObject1[1] = localInteger;
        str = paramResources.getString(2131427670, arrayOfObject1);
      }
    }
    label542: paramTextView.setTextSize(this.c.b);
    paramTextView.setText(cr.a(a, str, (char)'"'));
  }

  public final Intent a(Context paramContext, View paramView, Cursor paramCursor)
  {
    switch (paramCursor.getInt(1))
    {
    case 2:
    case 3:
    default:
      return null;
    case 5:
      fg localfg = (fg)paramView.getTag();
      if ((ar)localfg.g.getTag() == null)
        return null;
      return a(paramContext, localfg, this.c.e(), 8);
    case 1:
    case 4:
      return a(paramContext, (fg)paramView.getTag());
    case 6:
    case 7:
    }
    return b(paramContext, (fg)paramView.getTag());
  }

  public final void a(dz paramdz, HashMap paramHashMap)
  {
    if (1 == paramdz.d)
    {
      Resources localResources2 = this.b.getResources();
      Iterator localIterator2 = this.d.iterator();
      while (localIterator2.hasNext())
        a(localResources2, ((fg)localIterator2.next()).f, paramHashMap);
    }
    if (2 == paramdz.d)
    {
      Resources localResources1 = this.b.getResources();
      Iterator localIterator1 = this.d.iterator();
      while (localIterator1.hasNext())
      {
        m localm = (m)localIterator1.next();
        ViewGroup localViewGroup = localm.i;
        if ((localViewGroup != null) && (localViewGroup.getVisibility() == 0))
          a(localResources1, localViewGroup, paramHashMap);
        if ((localm.b != null) && (localm.b.getVisibility() == 0))
          a(localResources1, localm.c, paramHashMap);
      }
    }
  }

  public final void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    int i = paramCursor.getInt(1);
    label246: label377: m localm2;
    label257: label363: Resources localResources2;
    ArrayList localArrayList5;
    ar localar3;
    label499: Object localObject2;
    label568: label616: label630: int j;
    String str;
    switch (i)
    {
    case 2:
    case 3:
    default:
      ((CardRowView)paramView).a(paramCursor.getPosition(), getCount());
      return;
    case 5:
      m localm4 = (m)paramView.getTag();
      Resources localResources4 = paramContext.getResources();
      ArrayList localArrayList8 = a(paramCursor, 1);
      if (a(localArrayList8) == 0);
      for (Object localObject4 = null; ; localObject4 = (ar)localArrayList8.get(0))
      {
        localm4.g.setTag(localObject4);
        a(localResources4, localm4.f, (ar)localObject4);
        a(localResources4, localm4.g, i, localArrayList8, paramCursor.getInt(3));
        localm4.a.setText(cr.a(localResources4, paramCursor.getLong(2), true));
        ArrayList localArrayList9 = a(paramCursor, 2);
        a(localResources4, localm4.i, localArrayList9);
        break;
      }
    case 7:
      m localm3 = (m)paramView.getTag();
      Resources localResources3 = paramContext.getResources();
      ArrayList localArrayList6 = a(paramCursor, 1);
      ArrayList localArrayList7 = c(paramCursor, 2);
      ar localar4;
      Object localObject3;
      if (a(localArrayList6) == 0)
      {
        localar4 = null;
        if (a(localArrayList7) != 0)
          break label363;
        localObject3 = null;
        localm3.g.setTag(localObject3);
        a(localResources3, localm3.f, localar4);
        if ((localar4 != null) && (localar4.c != null) && (localObject3 != null) && (((ae)localObject3).c != null))
          break label377;
        localm3.g.setText(null);
      }
      while (true)
      {
        localm3.a.setText(cr.a(localResources3, paramCursor.getLong(2), true));
        localm3.i.setVisibility(8);
        break;
        localar4 = (ar)localArrayList6.get(0);
        break label246;
        localObject3 = (ae)localArrayList7.get(0);
        break label257;
        localm3.g.setTextSize(this.c.b);
        TextView localTextView = localm3.g;
        StyleSpan localStyleSpan = a;
        Object[] arrayOfObject4 = new Object[2];
        arrayOfObject4[0] = localar4.c;
        arrayOfObject4[1] = ((ae)localObject3).c;
        localTextView.setText(cr.a(localStyleSpan, localResources3.getString(2131427671, arrayOfObject4), (char)'"'));
      }
    case 6:
      localm2 = (m)paramView.getTag();
      localResources2 = paramContext.getResources();
      ArrayList localArrayList3 = a(paramCursor, 1);
      ArrayList localArrayList4 = c(paramCursor, 3);
      localArrayList5 = a(paramCursor, 2);
      if (a(localArrayList3) == 0)
      {
        localar3 = null;
        if (a(localArrayList4) != 0)
          break label616;
      }
      for (localObject2 = null; ; localObject2 = (ae)localArrayList4.get(0))
      {
        localm2.g.setTag(localObject2);
        a(localResources2, localm2.f, localar3);
        if ((localar3 != null) && (localar3.c != null) && (localObject2 != null) && (((ae)localObject2).c != null))
          break label630;
        localm2.g.setText(null);
        localm2.a.setText(cr.a(localResources2, paramCursor.getLong(2), true));
        localm2.i.setVisibility(8);
        break;
        localar3 = (ar)localArrayList3.get(0);
        break label499;
      }
      j = a(localArrayList5);
      if (j == 1)
      {
        Object[] arrayOfObject3 = new Object[3];
        arrayOfObject3[0] = localar3.c;
        arrayOfObject3[1] = ((ar)localArrayList5.get(0)).c;
        arrayOfObject3[2] = ((ae)localObject2).c;
        str = localResources2.getString(2131427672, arrayOfObject3);
      }
    case 1:
    case 4:
    }
    while (true)
    {
      if (str == null)
      {
        localm2.g.setText(null);
        break label568;
        if (j == 2)
        {
          Object[] arrayOfObject2 = new Object[4];
          arrayOfObject2[0] = localar3.c;
          arrayOfObject2[1] = ((ar)localArrayList5.get(0)).c;
          arrayOfObject2[2] = ((ar)localArrayList5.get(1)).c;
          arrayOfObject2[3] = ((ae)localObject2).c;
          str = localResources2.getString(2131427673, arrayOfObject2);
          continue;
        }
        if (j <= 2)
          break label1176;
        Integer localInteger = Integer.valueOf(paramCursor.getInt(6));
        Object[] arrayOfObject1 = new Object[4];
        arrayOfObject1[0] = localar3.c;
        arrayOfObject1[1] = ((ar)localArrayList5.get(0)).c;
        arrayOfObject1[2] = localInteger;
        arrayOfObject1[3] = ((ae)localObject2).c;
        str = localResources2.getString(2131427674, arrayOfObject1);
        continue;
      }
      localm2.g.setTextSize(this.c.b);
      localm2.g.setText(cr.a(a, str, (char)'"'));
      break label568;
      m localm1 = (m)paramView.getTag();
      Resources localResources1 = paramContext.getResources();
      ArrayList localArrayList1 = a(paramCursor, 1);
      ar localar1;
      label935: ArrayList localArrayList2;
      if (a(localArrayList1) == 0)
      {
        localar1 = null;
        a(localResources1, localm1.f, localar1);
        a(localResources1, localm1.g, i, localArrayList1, paramCursor.getInt(3));
        localm1.a.setText(cr.a(localResources1, paramCursor.getLong(2), true));
        localArrayList2 = b(paramCursor, 2);
        if (a(localArrayList2) != 0)
          break label1061;
      }
      label1061: for (Object localObject1 = null; ; localObject1 = (com.twitter.android.provider.g)localArrayList2.get(0))
      {
        localm1.g.setTag(localObject1);
        if (localObject1 != null)
          break label1075;
        localm1.h.setVisibility(8);
        localm1.b.setVisibility(8);
        break;
        localar1 = (ar)localArrayList1.get(0);
        break label935;
      }
      label1075: localm1.h.setVisibility(0);
      localm1.h.setText(((com.twitter.android.provider.g)localObject1).c);
      localm1.b.setVisibility(0);
      ar localar2 = ((com.twitter.android.provider.g)localObject1).e;
      a(localResources1, localm1.c, this.c.a(2, localar2.a, localar2.d));
      localm1.d.setText(localar2.c);
      localm1.e.setText(cr.a(localResources1, ((com.twitter.android.provider.g)localObject1).b, true));
      break;
      label1176: str = null;
    }
  }

  public final int getItemViewType(int paramInt)
  {
    switch (((Cursor)getItem(paramInt)).getInt(1))
    {
    default:
      return 1;
    case 5:
    case 6:
    case 7:
    }
    return 0;
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
    default:
      View localView2 = localLayoutInflater.inflate(2130903044, paramViewGroup, false);
      m localm2 = new m(localView2);
      localView2.setTag(localm2);
      this.d.add(localm2);
      return localView2;
    case 5:
    case 6:
    case 7:
    }
    View localView1 = localLayoutInflater.inflate(2130903042, paramViewGroup, false);
    m localm1 = new m(localView1);
    localView1.setTag(localm1);
    this.d.add(localm1);
    return localView1;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.av
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
