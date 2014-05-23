package com.spotify.mobile.android.util;

import android.content.UriMatcher;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class SpotifyLink
{
  private static UriMatcher a;
  private static final Pattern b = Pattern.compile("user:([^:]+)");
  private static final Pattern c = Pattern.compile("^user:([^#:?]*[#?])+:?");
  private Uri d = Uri.EMPTY;
  private String e;

  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    a = localUriMatcher;
    localUriMatcher.addURI("*", "ad/*", SpotifyLink.LinkType.b.ordinal());
    a.addURI("*", "album/*", SpotifyLink.LinkType.c.ordinal());
    a.addURI("*", "album/*/play", SpotifyLink.LinkType.e.ordinal());
    a.addURI("*", "album/*/play/*", SpotifyLink.LinkType.e.ordinal());
    a.addURI("*", "app/browse", SpotifyLink.LinkType.l.ordinal());
    a.addURI("*", "app/browse/new_releases", SpotifyLink.LinkType.m.ordinal());
    a.addURI("*", "app/browse/trending_artists", SpotifyLink.LinkType.o.ordinal());
    a.addURI("*", "app/browse/*", SpotifyLink.LinkType.n.ordinal());
    a.addURI("*", "app/genesis", SpotifyLink.LinkType.J.ordinal());
    a.addURI("*", "artist/*", SpotifyLink.LinkType.g.ordinal());
    a.addURI("*", "artist/*/albums", SpotifyLink.LinkType.d.ordinal());
    a.addURI("*", "artist/*/appears_on", SpotifyLink.LinkType.f.ordinal());
    a.addURI("*", "artist/*/biography", SpotifyLink.LinkType.i.ordinal());
    a.addURI("*", "artist/*/compilations", SpotifyLink.LinkType.w.ordinal());
    a.addURI("*", "artist/*/concert", SpotifyLink.LinkType.j.ordinal());
    a.addURI("*", "artist/*/gallery", SpotifyLink.LinkType.k.ordinal());
    a.addURI("*", "artist/*/play", SpotifyLink.LinkType.h.ordinal());
    a.addURI("*", "artist/*/play/*", SpotifyLink.LinkType.h.ordinal());
    a.addURI("*", "artist/*/related", SpotifyLink.LinkType.aa.ordinal());
    a.addURI("*", "artist/*/singles", SpotifyLink.LinkType.ac.ordinal());
    a.addURI("*", "collection", SpotifyLink.LinkType.p.ordinal());
    a.addURI("*", "follow", SpotifyLink.LinkType.G.ordinal());
    a.addURI("*", "follow/artists", SpotifyLink.LinkType.H.ordinal());
    a.addURI("*", "follow/facebook", SpotifyLink.LinkType.I.ordinal());
    a.addURI("*", "genre/*", SpotifyLink.LinkType.K.ordinal());
    a.addURI("*", "internal/activity_feed", SpotifyLink.LinkType.a.ordinal());
    a.addURI("*", "internal/collection/albums", SpotifyLink.LinkType.r.ordinal());
    a.addURI("*", "internal/collection/artists", SpotifyLink.LinkType.t.ordinal());
    a.addURI("*", "internal/collection/playlists", SpotifyLink.LinkType.u.ordinal());
    a.addURI("*", "internal/collection/tracks", SpotifyLink.LinkType.v.ordinal());
    a.addURI("*", "internal/cosmos_test", SpotifyLink.LinkType.z.ordinal());
    a.addURI("*", "internal/debug", SpotifyLink.LinkType.A.ordinal());
    a.addURI("*", "internal/devices", SpotifyLink.LinkType.B.ordinal());
    a.addURI("*", "internal/discover", SpotifyLink.LinkType.C.ordinal());
    a.addURI("*", "internal/inbox", SpotifyLink.LinkType.M.ordinal());
    a.addURI("*", "internal/licenses", SpotifyLink.LinkType.N.ordinal());
    a.addURI("*", "internal/notification_webview/*", SpotifyLink.LinkType.X.ordinal());
    a.addURI("*", "internal/playlists", SpotifyLink.LinkType.P.ordinal());
    a.addURI("*", "internal/preferences", SpotifyLink.LinkType.x.ordinal());
    a.addURI("*", "internal/preferences/push_notification", SpotifyLink.LinkType.y.ordinal());
    a.addURI("*", "internal/premium_signup", SpotifyLink.LinkType.R.ordinal());
    a.addURI("*", "internal/radio", SpotifyLink.LinkType.Y.ordinal());
    a.addURI("*", "internal/social_chart", SpotifyLink.LinkType.ad.ordinal());
    a.addURI("*", "internal/startpage", SpotifyLink.LinkType.L.ordinal());
    a.addURI("*", "local/*", SpotifyLink.LinkType.ag.ordinal());
    a.addURI("*", "local/*/*", SpotifyLink.LinkType.ag.ordinal());
    a.addURI("*", "local/*/*/*", SpotifyLink.LinkType.ag.ordinal());
    a.addURI("*", "local/*/*/*/*", SpotifyLink.LinkType.ag.ordinal());
    a.addURI("*", "local/*/*/*/*/*", SpotifyLink.LinkType.ag.ordinal());
    a.addURI("*", "radio/album/*", SpotifyLink.LinkType.Z.ordinal());
    a.addURI("*", "radio/artist/*", SpotifyLink.LinkType.Z.ordinal());
    a.addURI("*", "radio/genre/*", SpotifyLink.LinkType.Z.ordinal());
    a.addURI("*", "radio/playlist/*", SpotifyLink.LinkType.Z.ordinal());
    a.addURI("*", "radio/track/*", SpotifyLink.LinkType.Z.ordinal());
    a.addURI("*", "search", SpotifyLink.LinkType.ab.ordinal());
    a.addURI("*", "search/*", SpotifyLink.LinkType.ab.ordinal());
    a.addURI("*", "track/*", SpotifyLink.LinkType.ag.ordinal());
    a.addURI("*", "user/*", SpotifyLink.LinkType.S.ordinal());
    a.addURI("*", "user/*/artists", SpotifyLink.LinkType.T.ordinal());
    a.addURI("*", "user/*/collection", SpotifyLink.LinkType.p.ordinal());
    a.addURI("*", "user/*/collection/album/*", SpotifyLink.LinkType.q.ordinal());
    a.addURI("*", "user/*/collection/artist/*", SpotifyLink.LinkType.s.ordinal());
    a.addURI("*", "user/*/folder/*", SpotifyLink.LinkType.E.ordinal());
    a.addURI("*", "user/*/folder/*/tracks", SpotifyLink.LinkType.F.ordinal());
    a.addURI("*", "user/*/followers", SpotifyLink.LinkType.U.ordinal());
    a.addURI("*", "user/*/following", SpotifyLink.LinkType.V.ordinal());
    a.addURI("*", "user/*/inbox", SpotifyLink.LinkType.M.ordinal());
    a.addURI("*", "user/*/playlist/*", SpotifyLink.LinkType.O.ordinal());
    a.addURI("*", "user/*/playlist/*/play", SpotifyLink.LinkType.Q.ordinal());
    a.addURI("*", "user/*/playlist/*/play/*", SpotifyLink.LinkType.Q.ordinal());
    a.addURI("*", "user/*/playlists", SpotifyLink.LinkType.W.ordinal());
    a.addURI("*", "user/*/publishedstarred", SpotifyLink.LinkType.ae.ordinal());
    a.addURI("*", "user/*/rootlist", SpotifyLink.LinkType.P.ordinal());
    a.addURI("*", "user/*/starred", SpotifyLink.LinkType.ae.ordinal());
    a.addURI("*", "user/*/top/tracks", SpotifyLink.LinkType.af.ordinal());
    a.addURI("*", "user/*/toplist", SpotifyLink.LinkType.af.ordinal());
    a.addURI("*", "start_trial_upsell", SpotifyLink.LinkType.ah.ordinal());
  }

  public SpotifyLink(String paramString)
  {
    if (paramString == null);
    while (true)
    {
      return;
      String str1;
      if (paramString.startsWith("spotify://"))
        str1 = "spotify://";
      while (str1 != null)
      {
        String str2 = paramString.substring(str1.length());
        Matcher localMatcher = c.matcher(str2);
        if (localMatcher.find())
          str2 = localMatcher.group().replace("#", "%23").replace("?", "%3f") + str2.substring(localMatcher.end());
        this.d = Uri.parse(str2.replace((char)':', (char)'/'));
        return;
        if (paramString.startsWith("spotify:"))
        {
          str1 = "spotify:";
        }
        else if (paramString.startsWith("http://open.spotify.com/"))
        {
          str1 = "http://open.spotify.com/";
        }
        else
        {
          boolean bool = paramString.startsWith("https://r.spotify.com/");
          str1 = null;
          if (bool)
          {
            int i = paramString.indexOf("/app_android/");
            if (i > 0)
            {
              this.e = paramString.substring(i + 13);
              this.e = this.e.replaceFirst("([^/?]+).*", "$1");
              paramString = paramString.substring(0, i);
            }
            str1 = "https://r.spotify.com/";
          }
        }
      }
    }
  }

  public static SpotifyLink a(String paramString)
  {
    return new SpotifyLink("spotify:user:" + paramString);
  }

  private String a(int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("spotify:");
    List localList = this.d.getPathSegments();
    for (int i = 0; i < localList.size(); i++)
      if ((i < paramInt1) || (i > paramInt2))
      {
        if (localStringBuilder.charAt(-1 + localStringBuilder.length()) != ':')
          localStringBuilder.append((char)':');
        localStringBuilder.append(Uri.encode((String)localList.get(i)));
      }
    return localStringBuilder.toString();
  }

  private String b(int paramInt)
  {
    String str = a(paramInt);
    if (TextUtils.isEmpty(str))
      return null;
    return "spotify:track:" + Uri.encode(str);
  }

  public static boolean b(String paramString)
  {
    SpotifyLink localSpotifyLink = new SpotifyLink(paramString);
    return (localSpotifyLink.d != null) && (localSpotifyLink.a() != SpotifyLink.LinkType.D);
  }

  public final SpotifyLink.LinkType a()
  {
    int i = a.match(this.d);
    if (i == -1)
      return SpotifyLink.LinkType.D;
    return SpotifyLink.LinkType.a(i);
  }

  public final String a(int paramInt)
  {
    if ((a.match(this.d) == -1) || (paramInt < 0) || (paramInt >= this.d.getPathSegments().size()))
      return null;
    try
    {
      String str = URLDecoder.decode(this.d.getEncodedPath().split("/")[paramInt], "utf-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException("Unsupported encoding", localUnsupportedEncodingException);
    }
  }

  public final String a(Resources paramResources)
  {
    switch (SpotifyLink.1.a[a().ordinal()])
    {
    case 2:
    case 4:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    default:
      Assertion.a("unkown context type: " + this);
      return paramResources.getString(2131690050);
    case 15:
      return paramResources.getString(2131690049);
    case 1:
      return paramResources.getString(2131690041);
    case 3:
      return paramResources.getString(2131690042);
    case 5:
      return paramResources.getString(2131690046);
    case 16:
      return paramResources.getString(2131690043);
    case 17:
      return paramResources.getString(2131690048);
    case 18:
      return paramResources.getString(2131690045);
    case 19:
      return paramResources.getString(2131690047);
    case 20:
      return paramResources.getString(2131690044);
    case 21:
    }
    return paramResources.getString(2131690051);
  }

  public final String b()
  {
    Matcher localMatcher = b.matcher(d());
    if (localMatcher.find())
      return Uri.decode(localMatcher.group(1));
    return null;
  }

  public final String c()
  {
    switch (SpotifyLink.1.a[a().ordinal()])
    {
    default:
      throw new UnsupportedOperationException("URI is does not contain an ID");
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    return this.d.getLastPathSegment();
  }

  public final String d()
  {
    if (Uri.EMPTY.equals(this.d))
      return null;
    return "spotify:" + this.d.getEncodedPath().replace((char)'/', (char)':');
  }

  public final String e()
  {
    if (Uri.EMPTY.equals(this.d))
      return null;
    return "http://open.spotify.com/" + this.d.getEncodedPath();
  }

  public final String f()
  {
    return this.e;
  }

  public final boolean g()
  {
    return !TextUtils.isEmpty(this.e);
  }

  public final boolean h()
  {
    switch (SpotifyLink.1.a[a().ordinal()])
    {
    default:
      return false;
    case 14:
    case 22:
    case 23:
    }
    return true;
  }

  public final String i()
  {
    switch (SpotifyLink.1.a[a().ordinal()])
    {
    default:
      return null;
    case 22:
      return b(3);
    case 14:
      return b(3);
    case 23:
    }
    return b(5);
  }

  public final String j()
  {
    switch (SpotifyLink.1.a[a().ordinal()])
    {
    default:
      return d();
    case 22:
      return a(2, 3);
    case 14:
      return a(2, 3);
    case 23:
    }
    return a(4, 5);
  }

  public final Uri k()
  {
    switch (SpotifyLink.1.a[a().ordinal()])
    {
    default:
      return null;
    case 24:
    }
    return Uri.parse(a(2));
  }

  public final String toString()
  {
    return this.d.toString();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.SpotifyLink
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
