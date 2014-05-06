package com.twitter.android;

import ad;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.twitter.android.client.g;
import com.twitter.android.widget.CardRowView;
import com.twitter.android.widget.UserView;

final class bz extends BaseAdapter
{
  private final Context a;
  private final g b;
  private ce[] c;
  private String d;

  public bz(Context paramContext, g paramg, ce[] paramArrayOfce, String paramString)
  {
    this.a = paramContext;
    this.b = paramg;
    this.c = paramArrayOfce;
    this.d = paramString;
  }

  private boolean a(int paramInt)
  {
    return paramInt == getCount() - 1;
  }

  public final void a(String paramString)
  {
    this.d = paramString;
    notifyDataSetChanged();
  }

  public final void a(ce[] paramArrayOfce)
  {
    this.c = paramArrayOfce;
    notifyDataSetChanged();
  }

  public final int getCount()
  {
    if (this.c == null)
      return 1;
    return 1 + this.c.length;
  }

  public final Object getItem(int paramInt)
  {
    if (a(paramInt))
    {
      if ((this.c == null) || (this.c.length <= 1))
        return new Intent(this.a, LoginActivity.class).putExtra("add_account", true);
      return new Intent(this.a, SettingsActivity.class);
    }
    if (this.c[paramInt].b == null)
      return null;
    return this.c[paramInt];
  }

  public final long getItemId(int paramInt)
  {
    if (a(paramInt))
      return 0L;
    if (this.c[paramInt].b == null)
      return 0L;
    return this.c[paramInt].b.a;
  }

  public final int getItemViewType(int paramInt)
  {
    if (a(paramInt))
      return 1;
    return 0;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView1;
    if (a(paramInt))
    {
      ft localft1;
      if (paramView == null)
      {
        View localView2 = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130903096, paramViewGroup, false);
        ft localft2 = new ft(localView2);
        localView2.setTag(localft2);
        localView1 = localView2;
        localft1 = localft2;
        if ((this.c != null) && (this.c.length > 1))
          break label111;
        localft1.a.setText(2131427636);
      }
      while (true)
      {
        ((CardRowView)localView1).a(paramInt, getCount());
        return localView1;
        localft1 = (ft)paramView.getTag();
        localView1 = paramView;
        break;
        label111: localft1.a.setText(2131427641);
      }
    }
    ImageView localImageView1;
    if (paramView == null)
    {
      localView1 = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130903040, paramViewGroup, false);
      ImageView localImageView2 = (ImageView)localView1.findViewById(2131165196);
      localView1.setTag(localImageView2);
      localImageView1 = localImageView2;
    }
    UserView localUserView;
    ce localce;
    ad localad;
    while (true)
    {
      localUserView = (UserView)localView1;
      localce = this.c[paramInt];
      localad = localce.b;
      if (localad != null)
        break label250;
      localUserView.a(null);
      localUserView.a(localce.a.name, null);
      localUserView.b(false);
      localUserView.c(false);
      label226: localImageView1.setVisibility(4);
      break;
      localImageView1 = (ImageView)paramView.getTag();
      localView1 = paramView;
    }
    label250: String str = localad.c;
    long l = localad.a;
    if (str != null)
      localUserView.a(this.b.b(l, str));
    while (true)
    {
      localUserView.a(localad.g, localad.b);
      localUserView.b(localad.h);
      localUserView.c(localad.i);
      if (!localce.a.name.equals(this.d))
        break label226;
      localImageView1.setVisibility(0);
      break;
      localUserView.a(null);
    }
  }

  public final int getViewTypeCount()
  {
    return 2;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.bz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
