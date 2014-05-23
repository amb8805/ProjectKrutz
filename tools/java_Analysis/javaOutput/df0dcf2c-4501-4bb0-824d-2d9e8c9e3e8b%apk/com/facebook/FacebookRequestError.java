package com.facebook;

import com.facebook.a.g;
import com.facebook.internal.ad;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class FacebookRequestError
{
  private static final i a = new i(200, 299, (byte)0);
  private static final i b = new i(200, 299, (byte)0);
  private static final i c = new i(400, 499, (byte)0);
  private static final i d = new i(500, 599, (byte)0);
  private final int e;
  private final boolean f;
  private final FacebookRequestError.Category g;
  private final int h;
  private final int i;
  private final int j;
  private final String k;
  private final String l;
  private final JSONObject m;
  private final JSONObject n;
  private final Object o;
  private final HttpURLConnection p;
  private final FacebookException q;

  private FacebookRequestError(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, JSONObject paramJSONObject1, JSONObject paramJSONObject2, Object paramObject, HttpURLConnection paramHttpURLConnection)
  {
    this(paramInt1, paramInt2, paramInt3, paramString1, paramString2, paramJSONObject1, paramJSONObject2, paramObject, paramHttpURLConnection, null);
  }

  private FacebookRequestError(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, JSONObject paramJSONObject1, JSONObject paramJSONObject2, Object paramObject, HttpURLConnection paramHttpURLConnection, FacebookException paramFacebookException)
  {
    this.h = paramInt1;
    this.i = paramInt2;
    this.j = paramInt3;
    this.k = paramString1;
    this.l = paramString2;
    this.n = paramJSONObject1;
    this.m = paramJSONObject2;
    this.o = paramObject;
    this.p = paramHttpURLConnection;
    int i1;
    FacebookRequestError.Category localCategory;
    int i2;
    if (paramFacebookException != null)
    {
      this.q = paramFacebookException;
      i1 = 1;
      if (i1 == 0)
        break label124;
      localCategory = FacebookRequestError.Category.h;
      i2 = 0;
    }
    label350: label360: 
    while (true)
    {
      this.g = localCategory;
      this.e = i2;
      this.f = bool;
      return;
      this.q = new FacebookServiceException(this, paramString2);
      i1 = 0;
      break;
      label124: if ((paramInt2 == 1) || (paramInt2 == 2))
      {
        localCategory = FacebookRequestError.Category.d;
        i2 = 0;
      }
      while (true)
      {
        if (localCategory != null)
          break label360;
        if (c.a(paramInt1))
        {
          localCategory = FacebookRequestError.Category.g;
          break;
          if ((paramInt2 == 4) || (paramInt2 == 17))
          {
            localCategory = FacebookRequestError.Category.e;
            bool = false;
            i2 = 0;
            continue;
          }
          if ((paramInt2 == 10) || (a.a(paramInt2)))
          {
            localCategory = FacebookRequestError.Category.c;
            i2 = g.k;
            bool = false;
            continue;
          }
          if ((paramInt2 != 102) && (paramInt2 != 190))
            break label350;
          if ((paramInt3 == 459) || (paramInt3 == 464))
          {
            localCategory = FacebookRequestError.Category.a;
            i2 = g.n;
            bool = true;
            continue;
          }
          localCategory = FacebookRequestError.Category.b;
          if ((paramInt3 == 458) || (paramInt3 == 463))
          {
            i2 = g.m;
            bool = false;
            continue;
          }
          if (paramInt3 == 460)
          {
            i2 = g.j;
            bool = false;
            continue;
          }
          i2 = g.l;
          bool = true;
          continue;
        }
        if (d.a(paramInt1))
        {
          localCategory = FacebookRequestError.Category.d;
          break;
        }
        localCategory = FacebookRequestError.Category.f;
        break;
        bool = false;
        i2 = 0;
        localCategory = null;
      }
    }
  }

  public FacebookRequestError(int paramInt, String paramString1, String paramString2)
  {
    this(-1, paramInt, -1, paramString1, paramString2, null, null, null, null, null);
  }

  FacebookRequestError(HttpURLConnection paramHttpURLConnection, Exception paramException)
  {
  }

  static FacebookRequestError a(JSONObject paramJSONObject, Object paramObject, HttpURLConnection paramHttpURLConnection)
  {
    try
    {
      if (paramJSONObject.has("code"))
      {
        int i1 = paramJSONObject.getInt("code");
        Object localObject = ad.a(paramJSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
        if ((localObject != null) && ((localObject instanceof JSONObject)))
        {
          localJSONObject2 = (JSONObject)localObject;
          if (localJSONObject2.has("error"))
          {
            localJSONObject3 = (JSONObject)ad.a(localJSONObject2, "error", null);
            str3 = localJSONObject3.optString("type", null);
            str2 = localJSONObject3.optString("message", null);
            i6 = localJSONObject3.optInt("code", -1);
            i3 = localJSONObject3.optInt("error_subcode", -1);
            i5 = 1;
            i4 = i6;
            str1 = str3;
          }
          while (i5 != 0)
          {
            return new FacebookRequestError(i1, i4, i3, str1, str2, localJSONObject2, paramJSONObject, paramObject, paramHttpURLConnection);
            if ((!localJSONObject2.has("error_code")) && (!localJSONObject2.has("error_msg")) && (!localJSONObject2.has("error_reason")))
              break label294;
            str1 = localJSONObject2.optString("error_reason", null);
            str2 = localJSONObject2.optString("error_msg", null);
            i2 = localJSONObject2.optInt("error_code", -1);
            i3 = localJSONObject2.optInt("error_subcode", -1);
            i4 = i2;
            i5 = 1;
          }
        }
        if (!b.a(i1))
        {
          if (!paramJSONObject.has("body"))
            break label288;
          localJSONObject1 = (JSONObject)ad.a(paramJSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
          localFacebookRequestError = new FacebookRequestError(i1, -1, -1, null, null, localJSONObject1, paramJSONObject, paramObject, paramHttpURLConnection);
          return localFacebookRequestError;
        }
      }
    }
    catch (JSONException localJSONException)
    {
    }
    while (true)
    {
      JSONObject localJSONObject2;
      JSONObject localJSONObject3;
      String str3;
      int i6;
      int i2;
      FacebookRequestError localFacebookRequestError;
      return null;
      label288: JSONObject localJSONObject1 = null;
      continue;
      label294: int i5 = 0;
      int i4 = 0;
      int i3 = 0;
      String str1 = null;
      String str2 = null;
    }
  }

  public final int a()
  {
    return this.h;
  }

  public final int b()
  {
    return this.i;
  }

  public final String c()
  {
    return this.k;
  }

  public final String d()
  {
    if (this.l != null)
      return this.l;
    return this.q.getLocalizedMessage();
  }

  public final FacebookException e()
  {
    return this.q;
  }

  public final String toString()
  {
    return "{HttpStatus: " + this.h + ", errorCode: " + this.i + ", errorType: " + this.k + ", errorMessage: " + d() + "}";
  }
}

/* Location:
 * Qualified Name:     com.facebook.FacebookRequestError
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
