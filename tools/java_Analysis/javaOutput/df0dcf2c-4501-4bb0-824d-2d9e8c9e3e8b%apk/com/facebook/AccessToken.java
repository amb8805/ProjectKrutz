package com.facebook;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.internal.ad;
import com.facebook.internal.af;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class AccessToken
  implements Serializable
{
  private static final Date b;
  private static final Date c;
  private static final Date d;
  private static final Date e;
  private static final AccessTokenSource f;
  private static final Date g;
  private static final long serialVersionUID = 1L;
  private final Date expires;
  private final Date lastRefresh;
  private final List<String> permissions;
  private final AccessTokenSource source;
  private final String token;

  static
  {
    if (!AccessToken.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      a = bool;
      b = new Date(-9223372036854775808L);
      Date localDate = new Date(9223372036854775807L);
      c = localDate;
      d = localDate;
      e = new Date();
      f = AccessTokenSource.b;
      g = b;
      return;
    }
  }

  AccessToken(String paramString, Date paramDate1, List<String> paramList, AccessTokenSource paramAccessTokenSource, Date paramDate2)
  {
    if (paramList == null)
      paramList = Collections.emptyList();
    this.expires = paramDate1;
    this.permissions = Collections.unmodifiableList(paramList);
    this.token = paramString;
    this.source = paramAccessTokenSource;
    this.lastRefresh = paramDate2;
  }

  static AccessToken a(Bundle paramBundle)
  {
    ArrayList localArrayList = paramBundle.getStringArrayList("com.facebook.TokenCachingStrategy.Permissions");
    List localList;
    String str;
    Date localDate;
    AccessTokenSource localAccessTokenSource;
    if (localArrayList == null)
    {
      localList = Collections.emptyList();
      str = paramBundle.getString("com.facebook.TokenCachingStrategy.Token");
      localDate = ac.a(paramBundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
      af.a(paramBundle, "bundle");
      if (!paramBundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource"))
        break label91;
      localAccessTokenSource = (AccessTokenSource)paramBundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
    }
    while (true)
    {
      return new AccessToken(str, localDate, localList, localAccessTokenSource, ac.a(paramBundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"));
      localList = Collections.unmodifiableList(new ArrayList(localArrayList));
      break;
      label91: if (paramBundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO"))
        localAccessTokenSource = AccessTokenSource.b;
      else
        localAccessTokenSource = AccessTokenSource.e;
    }
  }

  static AccessToken a(Bundle paramBundle, AccessTokenSource paramAccessTokenSource)
  {
    Date localDate = a(paramBundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
    return a(paramBundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS"), paramBundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), localDate, paramAccessTokenSource);
  }

  @SuppressLint({"FieldGetter"})
  static AccessToken a(AccessToken paramAccessToken, Bundle paramBundle)
  {
    if ((!a) && (paramAccessToken.source != AccessTokenSource.b) && (paramAccessToken.source != AccessTokenSource.c) && (paramAccessToken.source != AccessTokenSource.d))
      throw new AssertionError();
    Date localDate = a(paramBundle, "expires_in", new Date(0L));
    String str = paramBundle.getString("access_token");
    return a(paramAccessToken.permissions, str, localDate, paramAccessToken.source);
  }

  static AccessToken a(AccessToken paramAccessToken, List<String> paramList)
  {
    return new AccessToken(paramAccessToken.token, paramAccessToken.expires, paramList, paramAccessToken.source, paramAccessToken.lastRefresh);
  }

  static AccessToken a(List<String> paramList)
  {
    return new AccessToken("", g, paramList, AccessTokenSource.a, e);
  }

  static AccessToken a(List<String> paramList, Bundle paramBundle, AccessTokenSource paramAccessTokenSource)
  {
    Date localDate = a(paramBundle, "expires_in", new Date());
    return a(paramList, paramBundle.getString("access_token"), localDate, paramAccessTokenSource);
  }

  private static AccessToken a(List<String> paramList, String paramString, Date paramDate, AccessTokenSource paramAccessTokenSource)
  {
    if ((ad.a(paramString)) || (paramDate == null))
      return a(paramList);
    return new AccessToken(paramString, paramDate, paramList, paramAccessTokenSource, new Date());
  }

  private static Date a(Bundle paramBundle, String paramString, Date paramDate)
  {
    if (paramBundle == null)
      return null;
    Object localObject = paramBundle.get(paramString);
    long l2;
    if ((localObject instanceof Long))
      l2 = ((Long)localObject).longValue();
    while (true)
    {
      if (l2 != 0L)
        break label75;
      return new Date(9223372036854775807L);
      if ((localObject instanceof String))
        try
        {
          long l1 = Long.parseLong((String)localObject);
          l2 = l1;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          return null;
        }
    }
    return null;
    label75: return new Date(paramDate.getTime() + l2 * 1000L);
  }

  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    throw new InvalidObjectException("Cannot readObject, serialization proxy required");
  }

  private Object writeReplace()
  {
    return new AccessToken.SerializationProxyV1(this.token, this.expires, this.permissions, this.source, this.lastRefresh, (byte)0);
  }

  public final String a()
  {
    return this.token;
  }

  public final Date b()
  {
    return this.expires;
  }

  public final List<String> c()
  {
    return this.permissions;
  }

  public final AccessTokenSource d()
  {
    return this.source;
  }

  public final Date e()
  {
    return this.lastRefresh;
  }

  final Bundle f()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("com.facebook.TokenCachingStrategy.Token", this.token);
    ac.a(localBundle, "com.facebook.TokenCachingStrategy.ExpirationDate", this.expires);
    localBundle.putStringArrayList("com.facebook.TokenCachingStrategy.Permissions", new ArrayList(this.permissions));
    localBundle.putSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource", this.source);
    ac.a(localBundle, "com.facebook.TokenCachingStrategy.LastRefreshDate", this.lastRefresh);
    return localBundle;
  }

  final boolean g()
  {
    return (ad.a(this.token)) || (new Date().after(this.expires));
  }

  public final String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append("{AccessToken");
    StringBuilder localStringBuilder2 = localStringBuilder1.append(" token:");
    String str;
    if (this.token == null)
    {
      str = "null";
      localStringBuilder2.append(str);
      localStringBuilder1.append(" permissions:");
      if (this.permissions != null)
        break label94;
      localStringBuilder1.append("null");
    }
    while (true)
    {
      localStringBuilder1.append("}");
      return localStringBuilder1.toString();
      aa.a();
      str = "ACCESS_TOKEN_REMOVED";
      break;
      label94: localStringBuilder1.append("[");
      localStringBuilder1.append(TextUtils.join(", ", this.permissions));
      localStringBuilder1.append("]");
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.AccessToken
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
