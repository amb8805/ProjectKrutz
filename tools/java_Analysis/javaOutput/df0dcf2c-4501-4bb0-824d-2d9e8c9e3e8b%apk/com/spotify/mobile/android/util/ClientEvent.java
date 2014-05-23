package com.spotify.mobile.android.util;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;

public final class ClientEvent
{
  private final ClientEvent.Event a;
  private final ClientEvent.SubEvent b;
  private final HashMap<String, String> c;
  private String d;

  public ClientEvent(ClientEvent.Event paramEvent)
  {
    this(paramEvent, ClientEvent.SubEvent.a);
  }

  public ClientEvent(ClientEvent.Event paramEvent, ClientEvent.SubEvent paramSubEvent)
  {
    this.a = ((ClientEvent.Event)cc.a(paramEvent));
    this.b = ((ClientEvent.SubEvent)cc.a(paramSubEvent));
    this.c = new HashMap();
    this.d = "";
  }

  public static ClientEvent a(Uri paramUri, long paramLong)
  {
    ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.U, ClientEvent.SubEvent.at);
    localClientEvent.a("context_uri", paramUri.toString());
    localClientEvent.a("row_id", String.valueOf(paramLong));
    return localClientEvent;
  }

  public static ClientEvent a(String paramString1, ClientEvent.SubEvent paramSubEvent, String paramString2, Long paramLong)
  {
    ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.U, paramSubEvent);
    if (paramString2 != null)
      localClientEvent.a("target_uri", paramString2);
    if (paramLong != null)
      localClientEvent.a("index", String.valueOf(paramLong));
    localClientEvent.a("section", paramString1);
    return localClientEvent;
  }

  public static ClientEvent b(Uri paramUri, long paramLong)
  {
    ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.U, ClientEvent.SubEvent.au);
    localClientEvent.a("context_uri", paramUri.toString());
    localClientEvent.a("row_id", String.valueOf(paramLong));
    return localClientEvent;
  }

  public final ClientEvent a(String paramString)
  {
    this.d = ((String)paramString);
    return this;
  }

  public final ClientEvent a(String paramString1, String paramString2)
  {
    this.c.put(cc.a(paramString1), cc.a(paramString2));
    return this;
  }

  public final String a()
  {
    return this.a.toString();
  }

  public final String b()
  {
    return this.b.toString();
  }

  public final HashMap<String, String> c()
  {
    return this.c;
  }

  public final String d()
  {
    return this.d;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ClientEvent));
    ClientEvent localClientEvent;
    do
    {
      return false;
      localClientEvent = (ClientEvent)paramObject;
    }
    while ((localClientEvent.a != this.a) || (localClientEvent.b != this.b) || (!TextUtils.equals(localClientEvent.b.toString(), this.b.toString())));
    return this.c.equals(localClientEvent.c);
  }

  public final int hashCode()
  {
    int i = this.a.hashCode() ^ this.b.hashCode();
    if (this.b.toString() != null);
    for (int j = this.b.toString().hashCode(); ; j = 0)
      return j ^ i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a);
    if (this.b != ClientEvent.SubEvent.a)
    {
      localStringBuilder.append((char)'/');
      localStringBuilder.append(this.b);
    }
    if (this.b.toString() != null)
    {
      localStringBuilder.append((char)'/');
      localStringBuilder.append(this.b.toString());
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ClientEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
