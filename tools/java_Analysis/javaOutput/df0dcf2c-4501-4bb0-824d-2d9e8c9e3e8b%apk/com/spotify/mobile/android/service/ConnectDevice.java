package com.spotify.mobile.android.service;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.view.ConnectIconView;
import com.spotify.mobile.android.ui.view.ConnectIconView.Aspect;
import com.spotify.mobile.android.util.am;
import com.spotify.mobile.android.util.dk;

public class ConnectDevice
  implements Parcelable
{
  public static final Parcelable.Creator<ConnectDevice> CREATOR = new ConnectDevice.1();
  public static final String[] a = { "_id", "name", "is_active", "is_self", "is_connecting", "is_enabled", "is_volume_capable", "is_zeroconf", "is_dial", "device_hash", "is_being_activated", "type", "became_active_at", "was_selected_locally" };
  private String b;
  private String c;
  private boolean d;
  private boolean e;
  private boolean f;
  private boolean g;
  private boolean h;
  private boolean i;
  private boolean j;
  private boolean k;
  private ConnectDevice.DeviceType l;
  private long m;
  private boolean n;

  protected ConnectDevice()
  {
  }

  private ConnectDevice(Parcel paramParcel)
  {
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    boolean bool2;
    boolean bool3;
    label46: boolean bool4;
    label62: boolean bool5;
    label78: boolean bool6;
    label94: boolean bool7;
    label110: boolean bool8;
    label126: boolean bool9;
    label142: int i1;
    ConnectDevice.DeviceType localDeviceType;
    if (paramParcel.readByte() != 0)
    {
      bool2 = bool1;
      this.d = bool2;
      if (paramParcel.readByte() == 0)
        break label195;
      bool3 = bool1;
      this.e = bool3;
      if (paramParcel.readByte() == 0)
        break label201;
      bool4 = bool1;
      this.f = bool4;
      if (paramParcel.readByte() == 0)
        break label207;
      bool5 = bool1;
      this.g = bool5;
      if (paramParcel.readByte() == 0)
        break label213;
      bool6 = bool1;
      this.h = bool6;
      if (paramParcel.readByte() == 0)
        break label219;
      bool7 = bool1;
      this.i = bool7;
      if (paramParcel.readByte() == 0)
        break label225;
      bool8 = bool1;
      this.j = bool8;
      if (paramParcel.readByte() == 0)
        break label231;
      bool9 = bool1;
      this.k = bool9;
      i1 = paramParcel.readInt();
      if (i1 != -1)
        break label237;
      localDeviceType = null;
      label163: this.l = localDeviceType;
      this.m = paramParcel.readLong();
      if (paramParcel.readByte() == 0)
        break label248;
    }
    while (true)
    {
      this.n = bool1;
      return;
      bool2 = false;
      break;
      label195: bool3 = false;
      break label46;
      label201: bool4 = false;
      break label62;
      label207: bool5 = false;
      break label78;
      label213: bool6 = false;
      break label94;
      label219: bool7 = false;
      break label110;
      label225: bool8 = false;
      break label126;
      label231: bool9 = false;
      break label142;
      label237: localDeviceType = ConnectDevice.DeviceType.values()[i1];
      break label163;
      label248: bool1 = false;
    }
  }

  public static ConnectDevice a(Cursor paramCursor, Context paramContext)
  {
    ConnectDevice localConnectDevice = new ConnectDevice();
    localConnectDevice.b = am.a(paramCursor, 9, "");
    localConnectDevice.c = am.a(paramCursor, 1, paramContext.getString(2131689742));
    localConnectDevice.d = am.a(paramCursor, 2);
    localConnectDevice.e = am.a(paramCursor, 3);
    localConnectDevice.f = am.a(paramCursor, 5);
    localConnectDevice.g = am.a(paramCursor, 4);
    localConnectDevice.h = am.a(paramCursor, 6);
    localConnectDevice.i = am.a(paramCursor, 7);
    localConnectDevice.j = am.a(paramCursor, 8);
    localConnectDevice.k = am.a(paramCursor, 10);
    int i1 = paramCursor.getInt(11);
    ConnectDevice.DeviceType[] arrayOfDeviceType = ConnectDevice.DeviceType.values();
    if ((i1 >= 0) && (i1 < arrayOfDeviceType.length));
    for (localConnectDevice.l = arrayOfDeviceType[i1]; ; localConnectDevice.l = ConnectDevice.DeviceType.a)
    {
      localConnectDevice.m = paramCursor.getLong(12);
      localConnectDevice.n = am.a(paramCursor, 13);
      return localConnectDevice;
    }
  }

  public final String a()
  {
    return this.b;
  }

  public final void a(Context paramContext, ListItemView paramListItemView)
  {
    int i1 = 8;
    paramListItemView.setTag(this);
    paramListItemView.a(this.c);
    paramListItemView.setEnabled(this.f);
    paramListItemView.c(this.d);
    TextView localTextView = paramListItemView.c();
    int i2;
    View localView;
    ConnectIconView localConnectIconView;
    if ((this.e) || (this.g) || (this.i) || (!this.f))
    {
      i2 = 0;
      localTextView.setVisibility(i2);
      if (!((dk)c.a(dk.class)).b())
      {
        localView = paramListItemView.f();
        if (localView != null)
          break label198;
        localConnectIconView = new ConnectIconView(paramContext);
        int i3 = paramContext.getResources().getDimensionPixelSize(2131427454);
        localConnectIconView.setLayoutParams(new ViewGroup.LayoutParams(i3, i3));
        localConnectIconView.a(ConnectIconView.Aspect.c);
        label146: if ((this.d) || (this.k))
          i1 = 0;
        localConnectIconView.setVisibility(i1);
        paramListItemView.b(localConnectIconView);
      }
      if (!this.e)
        break label208;
      paramListItemView.b(paramContext.getString(2131689740));
    }
    label198: label208: 
    do
    {
      return;
      i2 = i1;
      break;
      localConnectIconView = (ConnectIconView)localView;
      break label146;
      if (this.i)
      {
        paramListItemView.b(paramContext.getString(2131689743));
        return;
      }
      if (this.g)
      {
        paramListItemView.b(paramContext.getString(2131689739));
        return;
      }
    }
    while (this.f);
    paramListItemView.b(paramContext.getString(2131689741));
  }

  public final String b()
  {
    return this.c;
  }

  public final boolean c()
  {
    return this.d;
  }

  public final boolean d()
  {
    return this.e;
  }

  public int describeContents()
  {
    return 0;
  }

  public final boolean e()
  {
    return this.f;
  }

  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof ConnectDevice)) && (this.b.equals(((ConnectDevice)paramObject).b));
  }

  public final boolean f()
  {
    return this.h;
  }

  public final boolean g()
  {
    return this.j;
  }

  public final boolean h()
  {
    return this.i;
  }

  public int hashCode()
  {
    return this.b.hashCode();
  }

  public final boolean i()
  {
    return this.k;
  }

  public final ConnectDevice.DeviceType j()
  {
    return this.l;
  }

  public final long k()
  {
    return this.m;
  }

  public final boolean l()
  {
    return this.n;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    byte b1 = 1;
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    byte b2;
    byte b3;
    label44: byte b4;
    label60: byte b5;
    label76: byte b6;
    label92: byte b7;
    label108: byte b8;
    label124: byte b9;
    label140: int i1;
    if (this.d)
    {
      b2 = b1;
      paramParcel.writeByte(b2);
      if (!this.e)
        break label189;
      b3 = b1;
      paramParcel.writeByte(b3);
      if (!this.f)
        break label195;
      b4 = b1;
      paramParcel.writeByte(b4);
      if (!this.g)
        break label201;
      b5 = b1;
      paramParcel.writeByte(b5);
      if (!this.h)
        break label207;
      b6 = b1;
      paramParcel.writeByte(b6);
      if (!this.i)
        break label213;
      b7 = b1;
      paramParcel.writeByte(b7);
      if (!this.j)
        break label219;
      b8 = b1;
      paramParcel.writeByte(b8);
      if (!this.k)
        break label225;
      b9 = b1;
      paramParcel.writeByte(b9);
      if (this.l != null)
        break label231;
      i1 = -1;
      label156: paramParcel.writeInt(i1);
      paramParcel.writeLong(this.m);
      if (!this.n)
        break label243;
    }
    while (true)
    {
      paramParcel.writeByte(b1);
      return;
      b2 = 0;
      break;
      label189: b3 = 0;
      break label44;
      label195: b4 = 0;
      break label60;
      label201: b5 = 0;
      break label76;
      label207: b6 = 0;
      break label92;
      label213: b7 = 0;
      break label108;
      label219: b8 = 0;
      break label124;
      label225: b9 = 0;
      break label140;
      label231: i1 = this.l.ordinal();
      break label156;
      label243: b1 = 0;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.ConnectDevice
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
