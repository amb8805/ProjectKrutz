package com.twitter.android;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.twitter.android.client.g;
import com.twitter.android.provider.ax;
import com.twitter.android.widget.CardRowView;
import com.twitter.android.widget.TweetView;
import com.twitter.android.widget.c;
import java.util.ArrayList;
import java.util.Iterator;

public final class eh extends CursorAdapter
{
  private final ArrayList a = new ArrayList();
  private final g b;
  private final ArrayList c = new ArrayList();
  private final c d;
  private final boolean e;
  private String f;
  private int g;

  public eh(Context paramContext, int paramInt, boolean paramBoolean, c paramc, g paramg)
  {
    super(paramContext, null, paramInt);
    this.e = paramBoolean;
    this.d = paramc;
    this.b = paramg;
  }

  public final void a()
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
      ((ct)localIterator.next()).c.b();
  }

  public final void a(int paramInt)
  {
    if ((paramInt & this.g) != paramInt)
    {
      this.g = (paramInt | this.g);
      notifyDataSetChanged();
    }
  }

  public final void a(long paramLong)
  {
    this.a.add(Long.valueOf(paramLong));
  }

  public final void a(String paramString)
  {
    if ((this.f != null) && (this.f.equals(paramString)))
      return;
    this.f = paramString;
    notifyDataSetChanged();
  }

  public final ArrayList b()
  {
    return this.a;
  }

  public final void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    cf localcf;
    if (paramCursor.getInt(22) == 2)
    {
      long l = paramCursor.getLong(1);
      localcf = (cf)paramView.getTag();
      if (this.a.contains(Long.valueOf(l)))
      {
        localcf.a.setVisibility(0);
        localcf.b.setVisibility(8);
      }
    }
    while (true)
    {
      ((CardRowView)paramView).a(paramCursor.getPosition(), paramCursor.getCount());
      return;
      localcf.a.setVisibility(8);
      localcf.b.setVisibility(0);
      continue;
      ct localct = (ct)paramView.getTag();
      localct.c.a(this.b.b);
      localct.c.a(new ax(paramCursor));
    }
  }

  public final void c()
  {
    this.a.clear();
  }

  public final boolean d()
  {
    return (0x1 & this.g) != 0;
  }

  public final boolean e()
  {
    return (0x2 & this.g) != 0;
  }

  public final int getCount()
  {
    if ((d()) || (e()))
      return 1;
    return super.getCount();
  }

  public final long getItemId(int paramInt)
  {
    if ((d()) || (e()))
      return 0L;
    Cursor localCursor = (Cursor)getItem(paramInt);
    if (localCursor != null)
      return localCursor.getLong(1);
    return 0L;
  }

  public final int getItemViewType(int paramInt)
  {
    if ((d()) || (e()))
      return 2;
    if (((Cursor)getItem(paramInt)).getInt(22) == 2)
      return 1;
    return 0;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Context localContext2;
    if (d())
    {
      localContext2 = this.mContext;
      if (paramView != null)
        break label194;
    }
    label188: label194: for (View localView2 = LayoutInflater.from(localContext2).inflate(2130903115, null); ; localView2 = paramView)
    {
      TextView localTextView2 = (TextView)localView2.findViewById(2131165253);
      Resources localResources2 = localContext2.getResources();
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.f;
      localTextView2.setText(localResources2.getString(2131427407, arrayOfObject2));
      ((CardRowView)localView2).a(0, 1);
      return localView2;
      Context localContext1;
      if (e())
      {
        localContext1 = this.mContext;
        if (paramView != null)
          break label188;
      }
      for (View localView1 = LayoutInflater.from(localContext1).inflate(2130903115, null); ; localView1 = paramView)
      {
        TextView localTextView1 = (TextView)localView1.findViewById(2131165253);
        Resources localResources1 = localContext1.getResources();
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = this.f;
        localTextView1.setText(localResources1.getString(2131427406, arrayOfObject1));
        ((CardRowView)localView1).a(0, 1);
        return localView1;
        return super.getView(paramInt, paramView, paramViewGroup);
      }
    }
  }

  public final int getViewTypeCount()
  {
    return 3;
  }

  public final boolean isEnabled(int paramInt)
  {
    if ((d()) || (e()))
      return false;
    return super.isEnabled(paramInt);
  }

  public final View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    if (paramCursor.getInt(22) == 2)
    {
      View localView2 = localLayoutInflater.inflate(2130903112, null);
      cf localcf = new cf(this);
      localcf.a = ((ProgressBar)localView2.findViewById(2131165353));
      localcf.b = ((TextView)localView2.findViewById(2131165352));
      localView2.setTag(localcf);
      return localView2;
    }
    View localView1 = localLayoutInflater.inflate(2130903116, null);
    ct localct = new ct(localView1);
    localct.c.a(this.d);
    localct.c.a(this.e);
    localView1.setTag(localct);
    this.c.add(localct);
    return localView1;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.eh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
