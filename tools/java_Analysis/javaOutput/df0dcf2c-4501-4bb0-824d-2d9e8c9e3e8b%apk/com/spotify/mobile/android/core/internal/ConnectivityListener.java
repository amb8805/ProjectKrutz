package com.spotify.mobile.android.core.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

public class ConnectivityListener
{
  public static final int CONNECTION_TYPE_3G = 3;
  public static final int CONNECTION_TYPE_EDGE = 2;
  public static final int CONNECTION_TYPE_ETHERNET = 5;
  public static final int CONNECTION_TYPE_GPRS = 1;
  public static final int CONNECTION_TYPE_NONE = 0;
  public static final int CONNECTION_TYPE_UNKNOWN = -1;
  public static final int CONNECTION_TYPE_WLAN = 4;
  private static Context sApplicationContext;
  private static ConnectivityListener sConnectivityListenerInstance;
  private ConnectivityManager mConnectivityManager = null;
  private BroadcastReceiver mConnectivityReceiver = new ConnectivityListener.1(this);
  private IntentFilter mIntentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
  private TelephonyManager mTelephonyManager = null;

  private ConnectivityListener()
  {
    if (sApplicationContext == null)
      throw new IllegalStateException("application context has not been set!");
    this.mTelephonyManager = ((TelephonyManager)sApplicationContext.getSystemService("phone"));
    this.mConnectivityManager = ((ConnectivityManager)sApplicationContext.getSystemService("connectivity"));
    sApplicationContext.registerReceiver(this.mConnectivityReceiver, this.mIntentFilter);
  }

  private native void connectivityHasChanged();

  public static ConnectivityListener getInstance()
  {
    try
    {
      if (sConnectivityListenerInstance == null)
        sConnectivityListenerInstance = new ConnectivityListener();
      ConnectivityListener localConnectivityListener = sConnectivityListenerInstance;
      return localConnectivityListener;
    }
    finally
    {
    }
  }

  public static void setContext(Context paramContext)
  {
    if (sApplicationContext != null)
      throw new IllegalStateException("application context has already been set!");
    sApplicationContext = paramContext;
  }

  public int getConnectionType()
  {
    int i = 3;
    if (sApplicationContext == null)
      throw new IllegalStateException("application context has not been set!");
    NetworkInfo localNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
    if ((localNetworkInfo == null) || (!localNetworkInfo.isConnected()))
      i = 0;
    int j;
    do
    {
      int k;
      do
      {
        return i;
        j = localNetworkInfo.getType();
        if (j != 0)
          break;
        k = this.mTelephonyManager.getNetworkType();
      }
      while (k >= i);
      if (k == 2)
        return 2;
      if (k != 1)
        break;
      return 1;
    }
    while (j == 6);
    if (j == 1)
      return 4;
    return -1;
  }

  public boolean isRoaming()
  {
    if (sApplicationContext == null)
      throw new IllegalStateException("application context has not been set!");
    return this.mTelephonyManager.isNetworkRoaming();
  }

  public void unregister()
  {
    sApplicationContext.unregisterReceiver(this.mConnectivityReceiver);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.core.internal.ConnectivityListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
