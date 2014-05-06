package com.twitter.android;

import ad;
import android.accounts.Account;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.twitter.android.client.g;
import com.twitter.android.widget.UserView;

final class cg extends ArrayAdapter
{
  public cg(AccountsDialogActivity paramAccountsDialogActivity, Context paramContext, ce[] paramArrayOfce)
  {
    super(paramContext, 0, paramArrayOfce);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    ImageView localImageView1;
    UserView localUserView;
    ce localce;
    ad localad;
    if (paramView == null)
    {
      localView = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130903040, paramViewGroup, false);
      ImageView localImageView2 = (ImageView)localView.findViewById(2131165196);
      localView.setTag(localImageView2);
      localImageView1 = localImageView2;
      localUserView = (UserView)localView;
      localce = (ce)getItem(paramInt);
      localad = localce.b;
      String str = localad.c;
      long l = localad.a;
      if (str == null)
        break label185;
      localUserView.a(this.a.a.b(l, str));
    }
    while (true)
    {
      localUserView.a(localad.g, localad.b);
      localUserView.b(localad.h);
      localUserView.c(localad.i);
      if (!localce.a.name.equals(this.a.b))
        break label194;
      localImageView1.setVisibility(0);
      return localView;
      localImageView1 = (ImageView)paramView.getTag();
      localView = paramView;
      break;
      label185: localUserView.a(null);
    }
    label194: localImageView1.setVisibility(4);
    return localView;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.cg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
