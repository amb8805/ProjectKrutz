package com.spotify.mobile.android.spotlets.follow;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.spotify.cosmos.android.router.Cosmos;
import com.spotify.cosmos.smash.Connection;
import com.spotify.cosmos.smash.Request;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.SpotifyLink.LinkType;
import com.spotify.mobile.android.util.cc;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class FollowManager
  implements com.spotify.mobile.android.c.a
{
  private Connection a;
  private final Context b;
  private Map<String, a> c = new FollowManager.CaseInsensitiveMap((byte)0);
  private Map<String, Set<b>> d = new FollowManager.CaseInsensitiveMap((byte)0);

  public FollowManager(Context paramContext)
  {
    this.b = paramContext;
  }

  private void b(String paramString)
  {
    try
    {
      if (this.d.containsKey(paramString))
      {
        a locala = (a)this.c.get(paramString);
        Iterator localIterator = ((Set)this.d.get(paramString)).iterator();
        while (localIterator.hasNext())
          ((b)localIterator.next()).a(locala);
      }
    }
    finally
    {
    }
  }

  private void b(String paramString, boolean paramBoolean)
  {
    try
    {
      if (new SpotifyLink(paramString).a() == SpotifyLink.LinkType.g);
      for (boolean bool = true; ; bool = false)
      {
        cc.a(bool, "Uri is not an artist uri");
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("is_followed", Boolean.valueOf(paramBoolean));
        this.b.getContentResolver().update(com.spotify.mobile.android.provider.b.a(paramString), localContentValues, null, null);
        return;
      }
    }
    finally
    {
    }
  }

  private void c(String paramString, boolean paramBoolean)
  {
    try
    {
      a.a((a)this.c.get(paramString), paramBoolean);
      b(paramString);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final a a(String paramString)
  {
    try
    {
      a locala = (a)this.c.get(paramString);
      return locala;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(a parama)
  {
    try
    {
      this.c.put(parama.a(), parama);
      b(parama.a());
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(String paramString, b paramb)
  {
    try
    {
      if (!this.d.containsKey(paramString))
        this.d.put(paramString, Collections.newSetFromMap(new WeakHashMap()));
      ((Set)this.d.get(paramString)).add(paramb);
      return;
    }
    finally
    {
    }
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    try
    {
      cc.a(this.c.containsKey(paramString), "no model exists for " + paramString);
      c(paramString, paramBoolean);
      if (paramBoolean)
      {
        str1 = "POST";
        while (true)
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Uri.decode(paramString);
          str2 = String.format("{\"target_uris\": [\"%s\"]}", arrayOfObject);
          localRequest = new Request(str1, "hm://socialgraph/v2/following?format=json", null, str2.getBytes());
          try
          {
            if (this.a == null)
              this.a = Cosmos.getConnection(this.b, SpotifyService.class);
            this.a.resolve(localRequest, new c((byte)0), new FollowManager.1(this, str1, str2, paramString, paramBoolean));
            if (new SpotifyLink(paramString).a() == SpotifyLink.LinkType.g)
              b(paramString, paramBoolean);
            return;
            str1 = "DELETE";
          }
          finally
          {
          }
        }
      }
    }
    finally
    {
    }
  }

  public final void b(String paramString, b paramb)
  {
    try
    {
      cc.a(this.d.containsKey(paramString), "no listeners exist for " + paramString);
      ((Set)this.d.get(paramString)).remove(paramb);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.follow.FollowManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
