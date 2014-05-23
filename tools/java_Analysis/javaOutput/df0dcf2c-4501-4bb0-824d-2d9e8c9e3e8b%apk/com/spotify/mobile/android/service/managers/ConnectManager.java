package com.spotify.mobile.android.service.managers;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.RemoteException;
import android.util.SparseArray;
import com.spotify.mobile.android.provider.d;
import com.spotify.mobile.android.provider.n;
import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.service.f;
import com.spotify.mobile.android.service.j;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cr;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.z;
import java.util.ArrayList;
import java.util.List;

public final class ConnectManager extends j
{
  private Context a;
  private cr b;
  private List<ConnectDevice> c = new ArrayList();
  private ConnectDevice d;
  private ConnectDevice e;
  private ConnectManager.DeviceState f = ConnectManager.DeviceState.a;
  private SparseArray<f> g = new SparseArray();
  private int h = 0;

  public ConnectManager(Context paramContext)
  {
    this.a = paramContext;
    this.b = new cr(this.a, new a(this, (byte)0));
  }

  private void a(Cursor paramCursor)
  {
    Object localObject1 = null;
    try
    {
      ArrayList localArrayList = new ArrayList();
      paramCursor.moveToPosition(-1);
      localObject3 = null;
      if (paramCursor.moveToNext())
      {
        localObject4 = ConnectDevice.a(paramCursor, this.a);
        localArrayList.add(localObject4);
        if (((ConnectDevice)localObject4).c())
          localObject3 = localObject4;
        if (((ConnectDevice)localObject4).i())
          break label303;
      }
      else
      {
        this.c = localArrayList;
        this.d = localObject3;
        this.e = localObject1;
        if (this.c.size() > 1)
          if (this.e != null)
          {
            i = 1;
            if (i == 0)
              break label237;
            localDeviceState = ConnectManager.DeviceState.e;
            this.f = localDeviceState;
            if (this.d != null)
              z.a(cw.b(this.a), this.d);
            i();
            if (this.d == null)
              break label286;
          }
        for (str = this.d.a(); ; str = "No active device")
        {
          arrayOfString = new String[2];
          arrayOfString[0] = ("DeviceCount:" + this.c.size());
          arrayOfString[1] = ("ActiveDevice:" + str);
          z.a();
          return;
          i = 0;
          break;
          if ((this.d == null) || (!this.d.d()))
            break label309;
          j = 1;
          if (j != 0)
          {
            localDeviceState = ConnectManager.DeviceState.c;
            break label123;
          }
          localDeviceState = ConnectManager.DeviceState.d;
          break label123;
          localDeviceState = ConnectManager.DeviceState.b;
          break label123;
        }
      }
    }
    finally
    {
    }
    while (true)
    {
      Object localObject3;
      int i;
      ConnectManager.DeviceState localDeviceState;
      label123: String str;
      String[] arrayOfString;
      label237: Object localObject4 = localObject1;
      label286: label303: localObject1 = localObject4;
      continue;
      label309: int j = 0;
    }
  }

  private void i()
  {
    int i = 0;
    while (true)
      if (i < this.g.size())
        try
        {
          ((f)this.g.valueAt(i)).a(this.c, this.f.ordinal());
          i++;
        }
        catch (RemoteException localRemoteException)
        {
          while (true)
          {
            this.g.remove(this.g.keyAt(i));
            bp.e("ConnectManager observer died", new Object[0]);
          }
        }
  }

  public final int a(f paramf)
  {
    SparseArray localSparseArray = this.g;
    int i = 1 + this.h;
    this.h = i;
    localSparseArray.append(i, paramf);
    paramf.a(this.c, this.f.ordinal());
    return this.h;
  }

  public final List<ConnectDevice> a()
  {
    return this.c;
  }

  public final void a(float paramFloat)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("volume", Float.valueOf(paramFloat));
    this.a.getContentResolver().update(n.a, localContentValues, null, null);
  }

  public final void a(int paramInt)
  {
    this.g.delete(paramInt);
  }

  public final void a(String paramString)
  {
    new String[] { paramString };
    z.a();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("is_active", Boolean.valueOf(true));
    this.a.getContentResolver().update(d.a(paramString), localContentValues, null, null);
  }

  public final void a(boolean paramBoolean)
  {
    new String[1][0] = String.valueOf(paramBoolean);
    z.a();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("is_playback_capable", Boolean.valueOf(paramBoolean));
    this.a.getContentResolver().update(d.a, localContentValues, null, null);
  }

  public final int b()
  {
    return this.f.ordinal();
  }

  public final ConnectDevice c()
  {
    return this.d;
  }

  public final ConnectDevice d()
  {
    return this.e;
  }

  public final void e()
  {
    z.a();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("device_discovery", Integer.valueOf(1));
    this.a.getContentResolver().update(d.a, localContentValues, null, null);
  }

  public final void f()
  {
    a("local_device");
  }

  public final void g()
  {
    z.a();
    this.b.a(d.a, ConnectDevice.a, null);
    bp.b("ConnectManager started", new Object[0]);
  }

  public final void h()
  {
    z.a();
    this.b.b();
    bp.b("ConnectManager started", new Object[0]);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.managers.ConnectManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
