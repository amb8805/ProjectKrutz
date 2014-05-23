package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.SwitchView;
import com.spotify.android.paste.widget.h;
import java.util.Collection;

final class u extends BaseAdapter
  implements CompoundButton.OnCheckedChangeListener
{
  private Context b;
  private PushNotificationSettingsFragment.Notification[] c = null;
  private boolean d;

  public u(PushNotificationSettingsFragment paramPushNotificationSettingsFragment, Context paramContext)
  {
    this.b = paramContext;
  }

  public final void a(Collection<PushNotificationSettingsFragment.Notification> paramCollection)
  {
    this.c = ((PushNotificationSettingsFragment.Notification[])paramCollection.toArray(new PushNotificationSettingsFragment.Notification[paramCollection.size()]));
    notifyDataSetChanged();
  }

  public final PushNotificationSettingsFragment.Notification[] a()
  {
    return this.c;
  }

  public final int getCount()
  {
    if (this.c == null)
      return 0;
    return this.c.length;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = true;
    ListItemView localListItemView;
    PushNotificationSettingsFragment.Notification localNotification;
    SwitchView localSwitchView;
    if (paramView == null)
    {
      localListItemView = h.j(this.b, paramViewGroup);
      localListItemView.b(new SwitchView(this.b));
      ((SwitchView)localListItemView.f()).setOnCheckedChangeListener(this);
      localListItemView.b(bool);
      localNotification = this.c[paramInt];
      this.d = bool;
      localListItemView.a(localNotification.b);
      localSwitchView = (SwitchView)localListItemView.f();
      if (localNotification.c == 0)
        break label128;
    }
    while (true)
    {
      localSwitchView.setChecked(bool);
      localListItemView.f().setTag(localNotification);
      this.d = false;
      return localListItemView;
      localListItemView = (ListItemView)paramView;
      break;
      label128: bool = false;
    }
  }

  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (this.d)
      return;
    PushNotificationSettingsFragment.Notification localNotification = (PushNotificationSettingsFragment.Notification)paramCompoundButton.getTag();
    this.a.a(localNotification, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
