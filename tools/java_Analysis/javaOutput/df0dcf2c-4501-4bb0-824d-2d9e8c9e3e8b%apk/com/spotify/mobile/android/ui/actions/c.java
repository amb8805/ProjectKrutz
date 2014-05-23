package com.spotify.mobile.android.ui.actions;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.spotify.mobile.android.provider.aa;
import com.spotify.mobile.android.provider.j;
import com.spotify.mobile.android.provider.m;
import com.spotify.mobile.android.provider.n;
import com.spotify.mobile.android.provider.o;
import com.spotify.mobile.android.provider.p;
import com.spotify.mobile.android.provider.t;
import com.spotify.mobile.android.provider.w;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.ViewUri.Verified;

public class c
  implements com.spotify.mobile.android.c.a
{
  public c()
  {
  }

  public static void a(Context paramContext)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("unaccepted_licenses", Integer.valueOf(0));
    paramContext.getContentResolver().update(w.a, localContentValues, null, null);
  }

  public static void a(Context paramContext, long paramLong)
  {
    paramContext.getContentResolver().delete(ContentUris.withAppendedId(m.a, paramLong), null, null);
  }

  public static void a(Context paramContext, long paramLong, boolean paramBoolean)
  {
    ContentValues localContentValues = new ContentValues();
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      localContentValues.put("is_seen", Integer.valueOf(i));
      paramContext.getContentResolver().update(ContentUris.withAppendedId(j.b, paramLong), localContentValues, null, null);
      return;
    }
  }

  public static void a(Context paramContext, Uri paramUri, long paramLong)
  {
    paramContext.getContentResolver().delete(ContentUris.withAppendedId(paramUri, paramLong), null, null);
  }

  public static void a(Context paramContext, Uri paramUri, boolean paramBoolean)
  {
    ContentValues localContentValues = new ContentValues();
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      localContentValues.put("offline_state", Integer.valueOf(i));
      paramContext.getContentResolver().update(paramUri, localContentValues, null, null);
      return;
    }
  }

  public static void a(Context paramContext, ViewUri.Verified paramVerified, String paramString)
  {
    SpotifyLink localSpotifyLink = new SpotifyLink(paramString);
    ContentValues localContentValues = new ContentValues();
    switch (c.1.a[localSpotifyLink.a().ordinal()])
    {
    default:
      Assertion.a("Unsupported link type to add to collection.");
      return;
    case 1:
      localContentValues.put("is_in_collection", Integer.valueOf(1));
      paramContext.getContentResolver().update(aa.a(paramString, paramVerified.toString()), localContentValues, null, null);
      return;
    case 2:
    }
    localContentValues.put("is_in_collection", Integer.valueOf(1));
    paramContext.getContentResolver().update(com.spotify.mobile.android.provider.a.a(paramString, paramVerified.toString()), localContentValues, null, null);
  }

  public static void a(Context paramContext, ViewUri.Verified paramVerified, boolean paramBoolean)
  {
    ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.a, ClientEvent.SubEvent.bi);
    localClientEvent.a("value", String.valueOf(paramBoolean));
    com.spotify.mobile.android.c.c.a(a.class);
    a.a(paramContext, paramVerified, localClientEvent);
    ContentValues localContentValues = new ContentValues();
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      localContentValues.put("offline_mode", Integer.valueOf(i));
      paramContext.getContentResolver().update(w.a, localContentValues, null, null);
      return;
    }
  }

  public static void a(Context paramContext, String paramString)
  {
    paramContext.getContentResolver().delete(t.a(paramString), null, null);
  }

  public static void a(Context paramContext, String paramString, long paramLong)
  {
    paramContext.getContentResolver().delete(ContentUris.withAppendedId(o.b(paramString), paramLong), null, null);
  }

  public static void a(Context paramContext, String paramString, boolean paramBoolean)
  {
    ContentValues localContentValues = new ContentValues();
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      localContentValues.put("is_subscribed", Integer.valueOf(i));
      paramContext.getContentResolver().update(o.a(paramString), localContentValues, null, null);
      return;
    }
  }

  public static void a(Context paramContext, boolean paramBoolean)
  {
    ContentValues localContentValues = new ContentValues();
    if (paramBoolean);
    for (String str = "up"; ; str = "down")
    {
      localContentValues.put("radio_thumb_state", str);
      paramContext.getContentResolver().update(n.a, localContentValues, null, null);
      return;
    }
  }

  public static void b(Context paramContext, ViewUri.Verified paramVerified, String paramString)
  {
    SpotifyLink localSpotifyLink = new SpotifyLink(paramString);
    ContentValues localContentValues = new ContentValues();
    switch (c.1.a[localSpotifyLink.a().ordinal()])
    {
    default:
      Assertion.a("Unsupported link type to add to collection.");
      return;
    case 1:
      localContentValues.put("is_in_collection", Integer.valueOf(0));
      paramContext.getContentResolver().update(aa.a(paramString, paramVerified.toString()), localContentValues, null, null);
      return;
    case 2:
    }
    localContentValues.put("is_in_collection", Integer.valueOf(0));
    paramContext.getContentResolver().update(com.spotify.mobile.android.provider.a.a(paramString, paramVerified.toString()), localContentValues, null, null);
  }

  public static void b(Context paramContext, String paramString)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("uri", paramString);
    paramContext.getContentResolver().insert(p.a(), localContentValues);
  }

  public static void b(Context paramContext, String paramString, boolean paramBoolean)
  {
    ContentValues localContentValues = new ContentValues();
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      localContentValues.put("is_collaborative", Integer.valueOf(i));
      paramContext.getContentResolver().update(o.a(paramString), localContentValues, null, null);
      return;
    }
  }

  public static void c(Context paramContext, String paramString, boolean paramBoolean)
  {
    ContentValues localContentValues = new ContentValues();
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      localContentValues.put("is_published", Integer.valueOf(i));
      paramContext.getContentResolver().update(o.a(paramString), localContentValues, null, null);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.actions.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
