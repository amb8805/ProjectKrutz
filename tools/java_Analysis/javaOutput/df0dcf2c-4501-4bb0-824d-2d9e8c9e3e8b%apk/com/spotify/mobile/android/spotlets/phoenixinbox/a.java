package com.spotify.mobile.android.spotlets.phoenixinbox;

import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import com.spotify.mobile.android.util.am;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  implements d
{
  public static final String[] a = { "_id", "is_seen", "message", "time_added", "added_by_name", "added_by_uri", "added_by_icon_uri", "type", "data", "is_user_browsable" };
  private static Map<String, Integer> b;
  private boolean A;
  private boolean B;
  private int c;
  private int d;
  private String e;
  private boolean f;
  private String g;
  private String h;
  private String i;
  private boolean j;
  private int k;
  private String l;
  private String m;
  private String n;
  private String o;
  private String p;
  private String q;
  private String r;
  private String s;
  private String t;
  private String u;
  private boolean v;
  private boolean w;
  private boolean x;
  private boolean y;
  private boolean z;

  static
  {
    HashMap localHashMap = new HashMap();
    b = localHashMap;
    localHashMap.put("unknown", Integer.valueOf(-1));
    b.put("track", Integer.valueOf(0));
    b.put("album", Integer.valueOf(1));
    b.put("artist", Integer.valueOf(2));
    b.put("playlist", Integer.valueOf(3));
  }

  public a()
  {
  }

  private void w()
  {
    this.p = null;
    this.q = null;
    this.r = null;
    this.s = null;
    this.t = null;
    this.u = null;
    this.l = null;
    this.m = null;
    this.n = null;
    this.o = null;
    this.z = false;
    this.v = false;
    this.y = false;
    this.w = false;
    this.x = false;
  }

  public final int a()
  {
    return this.c;
  }

  public final String a(Resources paramResources)
  {
    if (this.k == 3)
    {
      if (this.A)
        return paramResources.getString(2131690156);
      if (this.B)
        return paramResources.getString(2131690157);
    }
    return this.l;
  }

  public final void a(Cursor paramCursor)
  {
    this.c = paramCursor.getInt(0);
    this.k = ((Integer)b.get(am.a(paramCursor, 7, "unknown"))).intValue();
    this.g = am.a(paramCursor, 4, "");
    this.h = paramCursor.getString(5);
    this.i = paramCursor.getString(6);
    this.j = am.a(paramCursor, 9);
    this.f = am.a(paramCursor, 1);
    this.e = am.a(paramCursor, 2, "");
    this.d = paramCursor.getInt(3);
    this.A = false;
    this.B = false;
    JSONObject localJSONObject;
    try
    {
      this.v = false;
      localJSONObject = new JSONObject(paramCursor.getString(8));
      switch (this.k)
      {
      case 1:
        this.p = null;
        this.q = localJSONObject.getString("album_name");
        this.r = localJSONObject.getString("artist_name");
        this.s = null;
        this.t = localJSONObject.getString("album_uri");
        this.u = localJSONObject.getString("artist_uri");
        this.l = this.q;
        this.m = this.r;
        this.n = this.t;
        String str3 = localJSONObject.getString("album_image_small_uri");
        if (TextUtils.isEmpty(str3))
          str3 = localJSONObject.getString("album_image_uri");
        this.o = str3;
        this.z = localJSONObject.getBoolean("is_queueable");
        this.v = localJSONObject.getBoolean("is_available");
        this.y = localJSONObject.getBoolean("is_radio_available");
        this.w = false;
        this.x = this.v;
        return;
      case 2:
      case 3:
      case 0:
      case -1:
      }
    }
    catch (JSONException localJSONException)
    {
      w();
      return;
    }
    this.p = null;
    this.q = null;
    this.r = localJSONObject.getString("artist_name");
    this.s = null;
    this.t = null;
    this.u = localJSONObject.getString("artist_uri");
    this.l = this.r;
    this.m = "";
    this.n = this.u;
    String str2 = localJSONObject.getString("artist_image_small_uri");
    if (TextUtils.isEmpty(str2))
      str2 = localJSONObject.getString("artist_image_uri");
    this.o = str2;
    this.z = false;
    this.v = localJSONObject.getBoolean("is_available");
    this.y = localJSONObject.getBoolean("is_radio_available");
    this.w = false;
    this.x = false;
    return;
    this.p = null;
    this.q = null;
    this.r = null;
    this.s = null;
    this.t = null;
    this.u = null;
    this.A = localJSONObject.getBoolean("is_starred");
    this.B = localJSONObject.getBoolean("is_toptracks");
    this.l = localJSONObject.getString("playlist_name");
    this.m = localJSONObject.getString("playlist_owner_name");
    this.n = localJSONObject.getString("playlist_uri");
    this.o = localJSONObject.getString("playlist_image_uri");
    this.z = false;
    this.v = localJSONObject.getBoolean("is_available");
    this.y = localJSONObject.getBoolean("is_radio_available");
    this.w = false;
    this.x = false;
    return;
    this.p = localJSONObject.getString("track_name");
    this.q = localJSONObject.getString("album_name");
    this.r = localJSONObject.getString("artist_name");
    this.s = localJSONObject.getString("track_uri");
    this.t = localJSONObject.getString("album_uri");
    this.u = localJSONObject.getString("artist_uri");
    this.l = this.p;
    this.m = this.r;
    this.n = this.s;
    String str1 = localJSONObject.getString("album_image_small_uri");
    if (str1.length() == 0)
      str1 = localJSONObject.getString("album_image_uri");
    this.o = str1;
    this.z = localJSONObject.getBoolean("is_queueable");
    this.v = localJSONObject.getBoolean("is_available");
    this.y = localJSONObject.getBoolean("is_radio_available");
    this.w = localJSONObject.getBoolean("is_album_browsable");
    this.x = localJSONObject.getBoolean("is_artist_browsable");
    return;
    w();
  }

  public final int b()
  {
    return this.d;
  }

  public final String b(Resources paramResources)
  {
    if (this.k == 3)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.m;
      return paramResources.getString(2131690008, arrayOfObject2);
    }
    if (this.k == 2)
      return "";
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = this.m;
    return paramResources.getString(2131690004, arrayOfObject1);
  }

  public final String c()
  {
    return this.e;
  }

  public final boolean d()
  {
    return this.f;
  }

  public final String e()
  {
    return this.g;
  }

  public final String f()
  {
    return this.h;
  }

  public final String g()
  {
    return this.i;
  }

  public final boolean h()
  {
    return this.j;
  }

  public final int i()
  {
    return this.k;
  }

  public final String j()
  {
    return this.n;
  }

  public final String k()
  {
    return this.o;
  }

  public final String l()
  {
    return this.p;
  }

  public final String m()
  {
    return this.q;
  }

  public final String n()
  {
    return this.r;
  }

  public final String o()
  {
    return this.s;
  }

  public final String p()
  {
    return this.t;
  }

  public final String q()
  {
    return this.u;
  }

  public final boolean r()
  {
    return this.v;
  }

  public final boolean s()
  {
    return this.w;
  }

  public final boolean t()
  {
    return this.x;
  }

  public final boolean u()
  {
    return this.y;
  }

  public final boolean v()
  {
    return this.z;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.phoenixinbox.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
