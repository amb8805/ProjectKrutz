package com.spotify.mobile.android.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import com.google.common.base.i;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.actions.d;
import com.spotify.mobile.android.ui.activity.DeviceActivity;
import com.spotify.mobile.android.ui.activity.MainActivity;
import com.spotify.mobile.android.ui.cell.settings.AbstractSettingsCell;
import com.spotify.mobile.android.ui.cell.settings.AbstractSettingsCell;;
import com.spotify.mobile.android.ui.cell.settings.BroadcastSettingsCell;
import com.spotify.mobile.android.ui.cell.settings.CrossfadeSettingsCell;
import com.spotify.mobile.android.ui.cell.settings.FacebookSettingsCell;
import com.spotify.mobile.android.ui.cell.settings.LastFmSettingsCell;
import com.spotify.mobile.android.ui.cell.settings.NopSettingsCell;
import com.spotify.mobile.android.ui.cell.settings.SpinnerSettingsCell;
import com.spotify.mobile.android.ui.cell.settings.ToggleButtonSettingsCell;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.cc;
import java.util.ArrayList;
import java.util.List;

public final class SettingsAdapter extends BaseAdapter
{
  private static final int c = SettingsAdapter.ViewType.values().length;
  String[] a;
  int[] b;
  private Context d;
  private Resources e;
  private Cursor f;
  private ArrayList<SettingsAdapter.Item> g = new ArrayList();
  private com.spotify.mobile.android.ui.cell.settings.a h = new SettingsAdapter.1(this);
  private int i;
  private boolean j;
  private boolean k;
  private boolean l;
  private String m;
  private String n;
  private String o;
  private boolean p;
  private com.spotify.mobile.android.ui.actions.a q = (com.spotify.mobile.android.ui.actions.a)c.a(com.spotify.mobile.android.ui.actions.a.class);
  private d r = (d)c.a(d.class);

  public SettingsAdapter(Context paramContext)
  {
    this.d = ((Context)cc.a(paramContext, "Must have a valid context"));
    this.e = ((Resources)cc.a(paramContext.getResources(), "expected non-null resources returned by system"));
    ClientInfo localClientInfo = (ClientInfo)c.a(ClientInfo.class);
    this.n = localClientInfo.b();
    this.m = localClientInfo.c();
    this.o = "";
    this.p = com.spotify.mobile.android.service.gcm.a.a(paramContext, false);
    String[] arrayOfString = new String[3];
    arrayOfString[0] = paramContext.getString(2131690237);
    arrayOfString[1] = paramContext.getString(2131690236);
    arrayOfString[2] = paramContext.getString(2131690235);
    this.a = arrayOfString;
    this.b = new int[] { -1, -1, 8 };
    b();
  }

  private AbstractSettingsCell a(ViewGroup paramViewGroup, AbstractSettingsCell paramAbstractSettingsCell)
  {
    if (paramAbstractSettingsCell == null)
    {
      SpinnerSettingsCell localSpinnerSettingsCell = SpinnerSettingsCell.a(this.d, paramViewGroup);
      ArrayAdapter localArrayAdapter = new ArrayAdapter(this.d, 17367043, this.a);
      localArrayAdapter.setDropDownViewResource(17367049);
      localSpinnerSettingsCell.setId(2131362208);
      ((SpinnerSettingsCell)localSpinnerSettingsCell).a(localArrayAdapter);
      ((SpinnerSettingsCell)localSpinnerSettingsCell).a(this.h);
      if (FeatureFragment.h.a())
        ((SpinnerSettingsCell)localSpinnerSettingsCell).a(this.b);
      return localSpinnerSettingsCell;
    }
    return paramAbstractSettingsCell;
  }

  private AbstractSettingsCell a(ViewGroup paramViewGroup, AbstractSettingsCell paramAbstractSettingsCell, int paramInt)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse(paramViewGroup.getContext().getString(paramInt)));
    return a(paramViewGroup, paramAbstractSettingsCell, localIntent);
  }

  private AbstractSettingsCell a(ViewGroup paramViewGroup, AbstractSettingsCell paramAbstractSettingsCell, Intent paramIntent)
  {
    if (paramAbstractSettingsCell == null)
      paramAbstractSettingsCell = NopSettingsCell.a(this.d, paramViewGroup);
    paramAbstractSettingsCell.setOnClickListener(new SettingsAdapter.2(this, paramIntent));
    return paramAbstractSettingsCell;
  }

  private AbstractSettingsCell b(ViewGroup paramViewGroup, AbstractSettingsCell paramAbstractSettingsCell, int paramInt)
  {
    if (paramAbstractSettingsCell == null)
    {
      paramAbstractSettingsCell = ToggleButtonSettingsCell.a(this.d, paramViewGroup);
      if (FeatureFragment.h.a())
        paramAbstractSettingsCell.a(paramInt);
    }
    return paramAbstractSettingsCell;
  }

  private void b()
  {
    this.g.clear();
    if (this.j)
      this.g.add(SettingsAdapter.Item.a);
    this.g.add(SettingsAdapter.Item.b);
    this.g.add(SettingsAdapter.Item.c);
    this.g.add(SettingsAdapter.Item.d);
    this.g.add(SettingsAdapter.Item.e);
    this.g.add(SettingsAdapter.Item.f);
    this.g.add(SettingsAdapter.Item.g);
    this.g.add(SettingsAdapter.Item.h);
    if (this.j)
    {
      this.g.add(SettingsAdapter.Item.i);
      this.g.add(SettingsAdapter.Item.j);
    }
    Context localContext = this.d;
    Intent localIntent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
    if (localContext.getPackageManager().queryIntentActivities(localIntent, 65536).size() > 0);
    for (int i1 = 1; ; i1 = 0)
    {
      if (i1 != 0)
        this.g.add(SettingsAdapter.Item.k);
      if ((this.p) && (FeatureFragment.aa.a()))
        this.g.add(SettingsAdapter.Item.l);
      this.g.add(SettingsAdapter.Item.m);
      this.g.add(SettingsAdapter.Item.n);
      this.g.add(SettingsAdapter.Item.o);
      this.g.add(SettingsAdapter.Item.p);
      this.g.add(SettingsAdapter.Item.q);
      if (FeatureFragment.i.a())
        this.g.add(SettingsAdapter.Item.r);
      this.g.add(SettingsAdapter.Item.s);
      this.g.add(SettingsAdapter.Item.t);
      notifyDataSetChanged();
      return;
    }
  }

  public final int a(int paramInt)
  {
    if (paramInt >= this.g.size())
      return SettingsAdapter.Group.g.ordinal();
    switch (SettingsAdapter.7.a[((SettingsAdapter.Item)this.g.get(paramInt)).ordinal()])
    {
    case 13:
    case 19:
    case 20:
    default:
      return SettingsAdapter.Group.g.ordinal();
    case 1:
    case 4:
    case 5:
    case 11:
      return SettingsAdapter.Group.a.ordinal();
    case 2:
    case 9:
    case 10:
      return SettingsAdapter.Group.c.ordinal();
    case 3:
    case 7:
    case 8:
    case 12:
      return SettingsAdapter.Group.d.ordinal();
    case 6:
      if ((this.p) && (FeatureFragment.aa.a()))
        return SettingsAdapter.Group.e.ordinal();
      return SettingsAdapter.Group.g.ordinal();
    case 21:
      if (FeatureFragment.i.a())
        return SettingsAdapter.Group.b.ordinal();
      return SettingsAdapter.Group.g.ordinal();
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:
    }
    return SettingsAdapter.Group.f.ordinal();
  }

  public final void a(Cursor paramCursor)
  {
    this.f = paramCursor;
    b();
  }

  public final void a(String paramString)
  {
    if (paramString == null);
    for (this.o = ""; ; this.o = paramString)
    {
      b();
      return;
    }
  }

  public final void a(boolean paramBoolean)
  {
    if (this.j != paramBoolean);
    for (boolean bool = true; ; bool = false)
    {
      this.k = bool;
      this.l = this.k;
      this.j = paramBoolean;
      b();
      return;
    }
  }

  public final String[] a()
  {
    String[] arrayOfString = new String[7];
    arrayOfString[0] = this.d.getString(2131690242);
    arrayOfString[1] = this.d.getString(2131690244);
    arrayOfString[2] = this.d.getString(2131690243);
    arrayOfString[3] = this.d.getString(2131690240);
    arrayOfString[4] = this.d.getString(2131690234);
    arrayOfString[5] = this.d.getString(2131690239);
    arrayOfString[6] = this.d.getString(2131690241);
    return arrayOfString;
  }

  public final boolean areAllItemsEnabled()
  {
    return false;
  }

  public final void b(int paramInt)
  {
    this.i = (paramInt / 3600);
    b();
  }

  public final int getCount()
  {
    return this.g.size();
  }

  public final Object getItem(int paramInt)
  {
    return null;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    if (paramInt >= this.g.size())
    {
      Assertion.a("Unknown position when fetching item view type");
      return -1;
    }
    switch (SettingsAdapter.7.a[((SettingsAdapter.Item)this.g.get(paramInt)).ordinal()])
    {
    default:
      Assertion.a("Unknown position when fetching item view type");
      return -1;
    case 1:
    case 2:
    case 3:
    case 4:
      return SettingsAdapter.ViewType.a.ordinal();
    case 5:
      return SettingsAdapter.ViewType.h.ordinal();
    case 6:
      return SettingsAdapter.ViewType.i.ordinal();
    case 7:
    case 8:
      return SettingsAdapter.ViewType.b.ordinal();
    case 9:
      return SettingsAdapter.ViewType.c.ordinal();
    case 10:
      return SettingsAdapter.ViewType.e.ordinal();
    case 11:
      return SettingsAdapter.ViewType.f.ordinal();
    case 12:
      return SettingsAdapter.ViewType.g.ordinal();
    case 13:
      return SettingsAdapter.ViewType.j.ordinal();
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:
    case 19:
    case 20:
    case 21:
    }
    return SettingsAdapter.ViewType.d.ordinal();
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject1 = null;
    i.a(paramInt, this.g.size());
    if ((paramView != null) && ((paramView instanceof AbstractSettingsCell)));
    for (Object localObject2 = (AbstractSettingsCell)paramView; ; localObject2 = null)
    {
      Object localObject3;
      Object localObject4;
      String str1;
      label373: String str21;
      String str22;
      switch (SettingsAdapter.7.a[((SettingsAdapter.Item)this.g.get(paramInt)).ordinal()])
      {
      default:
        Assertion.a("Got unexpected position");
        return null;
      case 1:
        localObject3 = this.e.getString(2131690231);
        localObject4 = this.e.getString(2131690230);
        if ((this.f == null) || (!this.f.moveToFirst()))
        {
          str1 = "offline_mode";
          localObject2 = b(paramViewGroup, (AbstractSettingsCell)localObject2, -1);
          ((AbstractSettingsCell)localObject2).setId(2131362207);
        }
      case 2:
      case 5:
      case 6:
      case 21:
      case 3:
        while (true)
        {
          ((AbstractSettingsCell)localObject2).a(str1);
          ((AbstractSettingsCell)localObject2).b((String)localObject3);
          ((AbstractSettingsCell)localObject2).c((String)localObject4);
          if (this.f != null)
            ((AbstractSettingsCell)localObject2).a(this.f);
          return localObject2;
          if (this.f.getInt(this.f.getColumnIndexOrThrow("offline_mode")) != 0);
          int i3;
          for (int i2 = 1; i2 != 0; i2 = 0)
          {
            i3 = this.f.getInt(this.f.getColumnIndexOrThrow("seconds_to_offline_expiry")) / 3600;
            if (i3 < 24)
              break label373;
            Resources localResources3 = this.e;
            Object[] arrayOfObject4 = new Object[1];
            arrayOfObject4[0] = Integer.valueOf(i3 / 24);
            localObject4 = localResources3.getString(2131690228, arrayOfObject4);
            break;
          }
          if (i3 > 1)
          {
            Resources localResources2 = this.e;
            Object[] arrayOfObject3 = new Object[1];
            arrayOfObject3[0] = Integer.valueOf(i3);
            localObject4 = localResources2.getString(2131690229, arrayOfObject3);
            break;
          }
          localObject4 = this.e.getString(2131690227);
          break;
          localObject3 = this.e.getString(2131690232);
          Resources localResources1 = this.e;
          int i1 = this.i;
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Integer.valueOf(this.i);
          localObject4 = localResources1.getQuantityString(2131623959, i1, arrayOfObject2);
          str1 = "private_session";
          localObject2 = b(paramViewGroup, (AbstractSettingsCell)localObject2, -1);
          continue;
          localObject3 = this.e.getString(2131690199);
          localObject4 = this.e.getString(2131690198);
          str1 = null;
          if (localObject2 == null)
          {
            localObject2 = new BroadcastSettingsCell(this.d);
            str1 = null;
            continue;
            str1 = "";
            localObject3 = this.e.getString(2131690234);
            localObject4 = this.e.getString(2131690233);
            localObject2 = a(paramViewGroup, (AbstractSettingsCell)localObject2, MainActivity.a(this.d, ViewUri.aM.toString()));
            continue;
            localObject3 = this.e.getString(2131690201);
            localObject4 = this.e.getString(2131689749).replaceAll("\n", " ");
            localObject2 = a(paramViewGroup, (AbstractSettingsCell)localObject2, new Intent(this.d, DeviceActivity.class));
            ((AbstractSettingsCell)localObject2).setId(2131362203);
            str1 = null;
            continue;
            localObject3 = this.e.getString(2131690208);
            localObject4 = this.e.getString(2131690207);
            str1 = "download_over_3g";
            localObject2 = b(paramViewGroup, (AbstractSettingsCell)localObject2, -1);
          }
        }
      case 7:
        str21 = this.e.getString(2131690246);
        str22 = this.e.getString(2131690245);
        if (this.k)
          this.k = false;
      case 8:
      case 9:
      case 10:
      case 14:
      case 15:
      case 17:
      case 16:
      case 18:
      case 19:
      case 20:
      case 12:
      case 13:
      case 4:
      case 11:
      }
      while (true)
      {
        localObject2 = a(paramViewGroup, (AbstractSettingsCell)localObject1);
        str1 = "stream_quality";
        localObject4 = str22;
        localObject3 = str21;
        break;
        String str19 = this.e.getString(2131690210);
        String str20 = this.e.getString(2131690209);
        if (this.l)
          this.l = false;
        while (true)
        {
          localObject2 = a(paramViewGroup, (AbstractSettingsCell)localObject1);
          str1 = "download_quality";
          localObject4 = str20;
          localObject3 = str19;
          break;
          if (localObject2 == null)
          {
            localObject2 = FacebookSettingsCell.a(this.d, paramViewGroup);
            localObject4 = null;
            str1 = null;
            localObject3 = null;
            break;
            localObject3 = this.e.getString(2131690215);
            localObject4 = this.e.getString(2131690213);
            str1 = null;
            if (localObject2 != null)
              break;
            localObject2 = new LastFmSettingsCell(this.d);
            str1 = null;
            break;
            String str17 = this.e.getString(2131690224);
            String str18 = this.e.getString(2131690223);
            localObject2 = a(paramViewGroup, (AbstractSettingsCell)localObject2, MainActivity.a(this.d, "spotify:internal:licenses"));
            localObject3 = str17;
            localObject4 = str18;
            str1 = "";
            break;
            String str15 = this.e.getString(2131690222);
            String str16 = this.e.getString(2131690221);
            localObject2 = a(paramViewGroup, (AbstractSettingsCell)localObject2, 2131689674);
            localObject3 = str15;
            localObject4 = str16;
            str1 = "";
            break;
            String str13 = this.e.getString(2131690218);
            String str14 = this.e.getString(2131690217);
            localObject2 = a(paramViewGroup, (AbstractSettingsCell)localObject2, 2131689671);
            localObject3 = str13;
            localObject4 = str14;
            str1 = "";
            break;
            String str11 = this.e.getString(2131690220);
            String str12 = this.e.getString(2131690219);
            localObject2 = a(paramViewGroup, (AbstractSettingsCell)localObject2, 2131689672);
            localObject3 = str11;
            localObject4 = str12;
            str1 = "";
            break;
            String str10 = this.d.getString(2131690250);
            localObject4 = this.n;
            if (localObject2 == null)
              localObject2 = NopSettingsCell.a(this.d, paramViewGroup);
            ((AbstractSettingsCell)localObject2).setOnClickListener(null);
            str1 = "";
            localObject3 = str10;
            break;
            String str8 = this.d.getString(2131690206);
            String str9 = this.d.getString(2131690205);
            if (localObject2 == null)
              localObject2 = NopSettingsCell.a(this.d, paramViewGroup);
            ((AbstractSettingsCell)localObject2).setOnClickListener(new SettingsAdapter.3(this));
            localObject3 = str8;
            localObject4 = str9;
            str1 = "";
            break;
            String str6 = this.d.getString(2131690226);
            Context localContext;
            Object[] arrayOfObject1;
            if (this.o.length() > 0)
            {
              localContext = this.d;
              arrayOfObject1 = new Object[1];
              arrayOfObject1[0] = this.o;
            }
            for (String str7 = localContext.getString(2131690225, arrayOfObject1); ; str7 = "")
            {
              if (localObject2 == null)
                localObject2 = NopSettingsCell.a(this.d, paramViewGroup);
              ((AbstractSettingsCell)localObject2).setOnClickListener(new SettingsAdapter.4(this));
              ((AbstractSettingsCell)localObject2).setId(2131362206);
              localObject3 = str6;
              localObject4 = str7;
              str1 = "";
              break;
            }
            String str4 = this.d.getString(2131690196);
            String str5 = this.d.getString(2131690197);
            if (localObject2 == null)
              localObject2 = NopSettingsCell.a(this.d, paramViewGroup);
            ((AbstractSettingsCell)localObject2).setOnClickListener(new SettingsAdapter.5(this));
            localObject3 = str4;
            localObject4 = str5;
            str1 = "";
            break;
            String str2 = this.d.getString(2131689892);
            String str3 = this.d.getString(2131689891);
            if (localObject2 == null)
              localObject2 = NopSettingsCell.a(this.d, paramViewGroup);
            ((AbstractSettingsCell)localObject2).setOnClickListener(new SettingsAdapter.6(this));
            localObject3 = str2;
            localObject4 = str3;
            str1 = "";
            break;
            str1 = "gapless";
            localObject3 = this.e.getString(2131690212);
            localObject4 = this.e.getString(2131690211);
            localObject2 = b(paramViewGroup, (AbstractSettingsCell)localObject2, 7);
            ((AbstractSettingsCell)localObject2).setId(2131362205);
            break;
            str1 = "crossfade";
            localObject3 = this.e.getString(2131690204);
            localObject4 = this.e.getString(2131690202);
            if (localObject2 == null)
              localObject2 = CrossfadeSettingsCell.a(this.d, paramViewGroup);
            ((AbstractSettingsCell)localObject2).setId(2131362204);
            break;
          }
          localObject4 = null;
          str1 = null;
          localObject3 = null;
          break;
          localObject1 = localObject2;
        }
        localObject1 = localObject2;
      }
    }
  }

  public final int getViewTypeCount()
  {
    return c;
  }

  public final boolean isEnabled(int paramInt)
  {
    return this.g.get(paramInt) != SettingsAdapter.Item.m;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.adapter.SettingsAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
