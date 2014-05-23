package com.twitter.android;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.twitter.android.client.g;
import com.twitter.android.widget.CardRowView;
import com.twitter.android.widget.UserView;
import com.twitter.android.widget.l;
import java.util.Collection;

public class dd extends CursorAdapter
  implements View.OnClickListener, l
{
  private final boolean a;
  private final g b;
  private final int c;
  private final l d;
  private final Collection e;
  private final int f;
  private final int g;
  private final boolean h;
  private Button i;
  private TextView j;
  private int k;

  public dd(Context paramContext, int paramInt1, g paramg, boolean paramBoolean, int paramInt2, l paraml, Collection paramCollection, int paramInt3, int paramInt4)
  {
    super(paramContext, null, paramInt1);
    this.b = paramg;
    this.a = paramBoolean;
    this.c = paramInt2;
    this.d = paraml;
    this.e = paramCollection;
    this.f = paramInt3;
    this.g = paramInt4;
    if (paramInt3 > 0);
    for (boolean bool = true; ; bool = false)
    {
      this.h = bool;
      this.k = paramContext.getResources().getDimensionPixelSize(2131492868);
      return;
    }
  }

  public final void a(UserView paramUserView, long paramLong)
  {
    Button localButton;
    if (this.h)
    {
      localButton = this.i;
      if (this.e.size() >= super.getCount())
        break label51;
    }
    label51: for (boolean bool = true; ; bool = false)
    {
      localButton.setEnabled(bool);
      this.d.a(paramUserView, paramLong);
      return;
    }
  }

  public boolean areAllItemsEnabled()
  {
    return (!this.h) && (super.areAllItemsEnabled());
  }

  public void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    UserView localUserView = (UserView)paramView;
    String str = paramCursor.getString(5);
    long l = paramCursor.getLong(2);
    localUserView.a(l);
    boolean bool1;
    label86: boolean bool2;
    if (str != null)
    {
      localUserView.a(this.b.b(l, str));
      localUserView.a(paramCursor.getString(4), paramCursor.getString(3));
      if (paramCursor.getInt(6) != 1)
        break label172;
      bool1 = true;
      localUserView.b(bool1);
      if (paramCursor.getInt(7) != 1)
        break label178;
      bool2 = true;
      label108: localUserView.c(bool2);
      if (this.e != null)
        if ((!this.e.contains(Long.valueOf(l))) && ((0x1 & paramCursor.getInt(8)) == 0))
          break label184;
    }
    label172: label178: label184: for (boolean bool3 = true; ; bool3 = false)
    {
      localUserView.setChecked(bool3);
      return;
      localUserView.a(null);
      break;
      bool1 = false;
      break label86;
      bool2 = false;
      break label108;
    }
  }

  public int getCount()
  {
    int m = super.getCount();
    if (this.h)
    {
      if (m > 0)
        m++;
    }
    else
      return m;
    return 0;
  }

  public Object getItem(int paramInt)
  {
    if (this.h)
    {
      if (paramInt == 0)
        return null;
      return super.getItem(paramInt - 1);
    }
    return super.getItem(paramInt);
  }

  public long getItemId(int paramInt)
  {
    if (this.h)
      if (paramInt == 0)
        return 0L;
    for (int m = paramInt - 1; ; m = paramInt)
    {
      Cursor localCursor = (Cursor)super.getItem(m);
      if (localCursor != null)
        return localCursor.getLong(2);
      return 0L;
    }
  }

  public int getItemViewType(int paramInt)
  {
    if ((this.h) && (paramInt == 0))
      return 1;
    return 0;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Context localContext;
    View localView3;
    TextView localTextView2;
    if (this.h)
      if (paramInt == 0)
      {
        localContext = paramViewGroup.getContext();
        if (paramView != null)
          break label212;
        localView3 = LayoutInflater.from(localContext).inflate(2130903063, paramViewGroup, false);
        localTextView2 = (TextView)localView3.findViewById(2131165236);
        if (this.g > 0)
        {
          localTextView2.setText(this.g);
          this.i = ((Button)localView3.findViewById(2131165266));
          this.i.setOnClickListener(this);
          this.j = ((TextView)localView3.findViewById(2131165265));
        }
      }
    label212: for (View localView2 = localView3; ; localView2 = paramView)
    {
      int m = super.getCount();
      TextView localTextView1 = this.j;
      Resources localResources = localContext.getResources();
      int n = this.f;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(m);
      localTextView1.setText(localResources.getString(n, arrayOfObject));
      View localView1 = localView2;
      while (true)
      {
        ((CardRowView)localView1).a(paramInt, getCount());
        return localView1;
        localTextView2.setText(null);
        break;
        localView1 = super.getView(paramInt - 1, paramView, paramViewGroup);
        continue;
        localView1 = super.getView(paramInt, paramView, paramViewGroup);
      }
    }
  }

  public int getViewTypeCount()
  {
    return 2;
  }

  public boolean isEnabled(int paramInt)
  {
    if (this.h)
      return (paramInt != 0) && (super.isEnabled(paramInt - 1));
    return super.isEnabled(paramInt);
  }

  public View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    UserView localUserView = (UserView)LayoutInflater.from(paramContext).inflate(2130903124, paramViewGroup, false);
    if (this.a)
      localUserView.a(true);
    do
    {
      do
        return localUserView;
      while (this.c <= 0);
      localUserView.a(this.c, this);
    }
    while (2130837573 != this.c);
    localUserView.a(2130837574, this.k, 0, this.k, 0);
    return localUserView;
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 2131165266:
    }
    Cursor localCursor = getCursor();
    if ((localCursor != null) && (localCursor.moveToFirst()))
    {
      do
        this.e.add(Long.valueOf(localCursor.getLong(2)));
      while (localCursor.moveToNext());
      notifyDataSetChanged();
    }
    paramView.setEnabled(false);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.dd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
