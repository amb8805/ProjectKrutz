package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.support.v4.widget.a;
import android.view.View;
import android.view.View;;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.paste.widget.SectionHeaderView;
import com.spotify.android.paste.widget.g;
import com.spotify.mobile.android.util.am;
import java.util.Locale;

public final class l extends BaseAdapter
{
  private a a;
  private Context b;
  private int c;
  private boolean d;
  private DataSetObserver e = new l.1(this);

  public l(Context paramContext, a parama, int paramInt)
  {
    this.b = paramContext;
    this.a = parama;
    this.c = paramInt;
    this.a.registerDataSetObserver(this.e);
    this.d = false;
  }

  private String a(int paramInt)
  {
    String str = am.a((Cursor)getItem(paramInt), this.c, "#").substring(0, 1).toUpperCase(Locale.getDefault());
    if (!Character.isLetter(str.charAt(0)))
      str = "#";
    return str;
  }

  public final void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public final int getCount()
  {
    return this.a.getCount();
  }

  public final Object getItem(int paramInt)
  {
    return this.a.getItem(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return this.a.getItemId(paramInt);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    LinearLayout localLinearLayout;
    boolean bool;
    Object localObject;
    if ((paramView == null) || (!(paramView instanceof LinearLayout)))
    {
      localLinearLayout = new LinearLayout(this.b);
      localLinearLayout.setOrientation(1);
      String str1 = "";
      if (paramInt > 0)
        str1 = a(paramInt - 1);
      String str2 = a(paramInt);
      bool = str1.equals(str2);
      localObject = localLinearLayout.findViewById(2131362081);
      if ((bool) || (this.d))
        break label213;
      if (localObject == null)
      {
        localObject = new SectionHeaderView(this.b);
        ((View)localObject).setBackgroundColor(g.a(this.b, 16842836));
        ((View)localObject).setId(2131362081);
        localLinearLayout.addView((View)localObject);
      }
      ((View)localObject).setVisibility(0);
      ((TextView)((View)localObject).findViewById(2131362227)).setText(str2);
    }
    View localView1;
    while (true)
    {
      localView1 = localLinearLayout.findViewById(2131362080);
      if (localView1 != null)
        break label240;
      View localView3 = this.a.getView(paramInt, null, paramViewGroup);
      localView3.setId(2131362080);
      localLinearLayout.addView(localView3);
      localLinearLayout.setTag(localView3.getTag());
      return localLinearLayout;
      localLinearLayout = (LinearLayout)paramView;
      break;
      label213: if (((bool) || (this.d)) && (localObject != null))
        ((View)localObject).setVisibility(8);
    }
    label240: localLinearLayout.removeView(localView1);
    View localView2 = this.a.getView(paramInt, localView1, paramViewGroup);
    localLinearLayout.addView(localView2);
    localLinearLayout.setTag(localView2.getTag());
    return localLinearLayout;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
