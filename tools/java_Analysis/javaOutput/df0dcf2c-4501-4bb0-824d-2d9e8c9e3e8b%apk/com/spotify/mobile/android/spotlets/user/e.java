package com.spotify.mobile.android.spotlets.user;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.View;;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Checkable;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ToggleButton;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.spotlets.follow.b;
import com.spotify.mobile.android.ui.stuff.i;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;

public final class e extends BaseAdapter
  implements b
{
  private final Context a;
  private final ProfileModel[] b;
  private final String c;

  public e(Context paramContext, ProfileModel[] paramArrayOfProfileModel, String paramString)
  {
    this.a = paramContext;
    this.b = paramArrayOfProfileModel;
    this.c = paramString;
    FollowManager localFollowManager = (FollowManager)com.spotify.mobile.android.c.c.a(FollowManager.class);
    for (ProfileModel localProfileModel : this.b)
    {
      localFollowManager.a(localProfileModel.getFollowData());
      localFollowManager.a(localProfileModel.getUri(), this);
    }
  }

  public final void a()
  {
    FollowManager localFollowManager = (FollowManager)com.spotify.mobile.android.c.c.a(FollowManager.class);
    ProfileModel[] arrayOfProfileModel = this.b;
    int i = arrayOfProfileModel.length;
    for (int j = 0; j < i; j++)
      localFollowManager.b(arrayOfProfileModel[j].getUri(), this);
  }

  public final void a(com.spotify.mobile.android.spotlets.follow.a parama)
  {
    notifyDataSetChanged();
  }

  public final int getCount()
  {
    return this.b.length;
  }

  public final Object getItem(int paramInt)
  {
    return this.b[paramInt];
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ProfileModel localProfileModel = (ProfileModel)getItem(paramInt);
    com.spotify.mobile.android.spotlets.follow.a locala = localProfileModel.getFollowData();
    Resources localResources1 = this.a.getResources();
    ListItemView localListItemView;
    Context localContext;
    Object localObject1;
    Object localObject2;
    label186: String str1;
    if (paramView == null)
    {
      localListItemView = new ListItemView(this.a);
      localContext = this.a;
      if (f.a(localContext))
      {
        localObject1 = new ToggleButton(localContext);
        Resources localResources2 = localContext.getResources();
        ((ToggleButton)localObject1).setBackgroundDrawable(localResources2.getDrawable(2130837788));
        ((ToggleButton)localObject1).setLayoutParams(new LinearLayout.LayoutParams(com.spotify.android.paste.graphics.d.b(100.0F, localResources2), com.spotify.android.paste.graphics.d.b(40.0F, localResources2)));
        ((ToggleButton)localObject1).setTextColor(localResources2.getColorStateList(2131296607));
        ((ToggleButton)localObject1).setTextOn(localResources2.getText(2131689985));
        ((ToggleButton)localObject1).setTextOff(localResources2.getText(2131689984));
        ((ToggleButton)localObject1).setTextSize(1, 16.0F);
        ((ToggleButton)localObject1).setFocusable(false);
        ((View)localObject1).setId(2131362494);
        localListItemView.b((View)localObject1);
        localListItemView.g();
        localObject2 = localObject1;
        str1 = localProfileModel.getImageHttpUrl();
        if (str1 == null)
          break label661;
      }
    }
    label262: label652: label661: for (String str2 = str1.trim(); ; str2 = str1)
    {
      Picasso localPicasso = ((dd)com.spotify.mobile.android.c.c.a(dd.class)).a();
      if (TextUtils.isEmpty(str2))
        str2 = null;
      ae localae1 = localPicasso.a(str2);
      Drawable localDrawable;
      if (f.a(this.a))
      {
        localDrawable = this.a.getResources().getDrawable(2130837640);
        ae localae2 = localae1.a(localDrawable);
        if (!f.a(this.a))
          localae2.a(com.spotify.mobile.android.ui.b.a.a());
        localae2.a(localListItemView.a());
        localListItemView.a(localProfileModel.getDisplayName());
        int i = locala.b();
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(i);
        localListItemView.c(localResources1.getQuantityString(2131623957, i, arrayOfObject));
        ((Checkable)localObject2).setChecked(locala.d());
        ((View)localObject2).setOnClickListener(new e.1(this, localProfileModel, (View)localObject2));
        String str3 = localProfileModel.getUsername();
        if ((str3 == null) || (!str3.equals(this.c)))
          break label646;
      }
      for (int j = 1; ; j = 0)
      {
        if (j == 0)
          break label652;
        ((View)localObject2).setVisibility(8);
        return localListItemView;
        int k = com.spotify.android.paste.graphics.d.b(26.0F, localContext.getResources());
        com.spotify.android.paste.graphics.e locale1 = new com.spotify.android.paste.graphics.e(localContext, SpotifyIcon.ca);
        locale1.a(com.spotify.android.paste.widget.g.a(localContext, 2130772374));
        com.spotify.android.paste.graphics.e locale2 = new com.spotify.android.paste.graphics.e(localContext, SpotifyIcon.l);
        locale2.a(localContext.getResources().getColor(2131296567));
        com.spotify.android.paste.graphics.c localc1 = com.spotify.mobile.android.ui.stuff.g.a(localContext, locale1);
        com.spotify.android.paste.graphics.c localc2 = com.spotify.mobile.android.ui.stuff.g.a(localContext, locale2);
        StateListDrawable localStateListDrawable = new StateListDrawable();
        localStateListDrawable.addState(new int[] { -16842912 }, localc1);
        localStateListDrawable.addState(new int[] { 16842912 }, localc2);
        localObject1 = new com.spotify.android.paste.widget.d(localContext);
        ((com.spotify.android.paste.widget.d)localObject1).setLayoutParams(new LinearLayout.LayoutParams(k, k));
        ((com.spotify.android.paste.widget.d)localObject1).setImageDrawable(localStateListDrawable);
        ((com.spotify.android.paste.widget.d)localObject1).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ((com.spotify.android.paste.widget.d)localObject1).setBackgroundResource(0);
        ((com.spotify.android.paste.widget.d)localObject1).setPadding(0, 0, 0, 0);
        ((com.spotify.android.paste.widget.d)localObject1).setFocusable(false);
        break;
        localListItemView = (ListItemView)paramView;
        localObject2 = localListItemView.findViewById(2131362494);
        break label186;
        localDrawable = i.g(this.a);
        break label262;
      }
      ((View)localObject2).setVisibility(0);
      return localListItemView;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.user.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
