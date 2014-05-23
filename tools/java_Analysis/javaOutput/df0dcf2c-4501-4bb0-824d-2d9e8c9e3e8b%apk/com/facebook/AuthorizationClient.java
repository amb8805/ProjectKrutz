package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class AuthorizationClient
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  transient Context a;
  transient h b;
  transient g c;
  AuthorizationClient.AuthHandler currentHandler;
  transient f d;
  transient boolean e;
  private transient AppEventsLogger f;
  List<AuthorizationClient.AuthHandler> handlersToTry;
  Map<String, String> loggingExtras;
  AuthorizationClient.AuthorizationRequest pendingRequest;

  AuthorizationClient()
  {
  }

  static Bundle a(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putLong("1_timestamp_ms", System.currentTimeMillis());
    localBundle.putString("0_auth_logger_id", paramString);
    localBundle.putString("3_method", "");
    localBundle.putString("2_result", "");
    localBundle.putString("5_error_message", "");
    localBundle.putString("4_error_code", "");
    localBundle.putString("6_extras", "");
    return localBundle;
  }

  private void a(String paramString1, String paramString2, String paramString3, String paramString4, Map<String, String> paramMap)
  {
    Bundle localBundle;
    if (this.pendingRequest == null)
    {
      localBundle = a("");
      localBundle.putString("2_result", AuthorizationClient.Result.Code.c.a());
      localBundle.putString("5_error_message", "Unexpected call to logAuthorizationMethodComplete with null pendingRequest.");
    }
    while (true)
    {
      localBundle.putString("3_method", paramString1);
      localBundle.putLong("1_timestamp_ms", System.currentTimeMillis());
      f().a("fb_mobile_login_method_complete", localBundle);
      return;
      localBundle = a(this.pendingRequest.j());
      if (paramString2 != null)
        localBundle.putString("2_result", paramString2);
      if (paramString3 != null)
        localBundle.putString("5_error_message", paramString3);
      if (paramString4 != null)
        localBundle.putString("4_error_code", paramString4);
      if ((paramMap != null) && (!paramMap.isEmpty()))
        localBundle.putString("6_extras", new JSONObject(paramMap).toString());
    }
  }

  private void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (this.loggingExtras == null)
      this.loggingExtras = new HashMap();
    if ((this.loggingExtras.containsKey(paramString1)) && (paramBoolean))
      paramString2 = (String)this.loggingExtras.get(paramString1) + "," + paramString2;
    this.loggingExtras.put(paramString1, paramString2);
  }

  private static Request b(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("fields", "id");
    localBundle.putString("access_token", paramString);
    return new Request(null, "me", localBundle, HttpMethod.a, null);
  }

  private boolean d()
  {
    if (this.e)
      return true;
    if (this.a.checkCallingOrSelfPermission("android.permission.INTERNET") != 0)
    {
      String str1 = this.a.getString(com.facebook.a.g.b);
      String str2 = this.a.getString(com.facebook.a.g.a);
      b(AuthorizationClient.Result.a(this.pendingRequest, str1, str2));
      return false;
    }
    this.e = true;
    return true;
  }

  private boolean e()
  {
    if ((this.currentHandler.c()) && (!d()))
    {
      a("no_internet_permission", "1", false);
      return false;
    }
    boolean bool = this.currentHandler.a(this.pendingRequest);
    if (bool)
    {
      String str = this.currentHandler.a();
      Bundle localBundle = a(this.pendingRequest.j());
      localBundle.putLong("1_timestamp_ms", System.currentTimeMillis());
      localBundle.putString("3_method", str);
      f().a("fb_mobile_login_method_start", localBundle);
      return bool;
    }
    a("not_tried", this.currentHandler.a(), true);
    return bool;
  }

  private AppEventsLogger f()
  {
    if ((this.f == null) || (this.f.c() != this.pendingRequest.f()))
      this.f = AppEventsLogger.a(this.a, this.pendingRequest.f());
    return this.f;
  }

  private void g()
  {
    if (this.d != null)
      this.d.a();
  }

  private static String h()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("init", System.currentTimeMillis());
      label18: return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
      break label18;
    }
  }

  final void a()
  {
    if (this.currentHandler != null)
      a(this.currentHandler.a(), "skipped", null, null, this.currentHandler.methodLoggingExtras);
    do
    {
      if ((this.handlersToTry == null) || (this.handlersToTry.isEmpty()))
        break;
      this.currentHandler = ((AuthorizationClient.AuthHandler)this.handlersToTry.remove(0));
    }
    while (!e());
    while (this.pendingRequest == null)
      return;
    b(AuthorizationClient.Result.a(this.pendingRequest, "Login attempt failed.", null));
  }

  final void a(AuthorizationClient.AuthorizationRequest paramAuthorizationRequest)
  {
    int i;
    if ((this.pendingRequest != null) && (this.currentHandler != null))
      i = 1;
    while (true)
      if (i != 0)
        if ((this.pendingRequest == null) || (this.currentHandler == null))
        {
          throw new FacebookException("Attempted to continue authorization without a pending request.");
          i = 0;
        }
        else if (this.currentHandler.b())
        {
          this.currentHandler.d();
        }
    do
    {
      e();
      do
        return;
      while (paramAuthorizationRequest == null);
      if (this.pendingRequest != null)
        throw new FacebookException("Attempted to authorize while a request is pending.");
    }
    while ((paramAuthorizationRequest.i()) && (!d()));
    this.pendingRequest = paramAuthorizationRequest;
    ArrayList localArrayList = new ArrayList();
    SessionLoginBehavior localSessionLoginBehavior = paramAuthorizationRequest.c();
    if (localSessionLoginBehavior.a())
    {
      if (!paramAuthorizationRequest.g())
      {
        localArrayList.add(new AuthorizationClient.GetTokenAuthHandler(this));
        localArrayList.add(new AuthorizationClient.KatanaLoginDialogAuthHandler(this));
      }
      localArrayList.add(new AuthorizationClient.KatanaProxyAuthHandler(this));
    }
    if (localSessionLoginBehavior.b())
      localArrayList.add(new AuthorizationClient.WebViewAuthHandler(this));
    this.handlersToTry = localArrayList;
    a();
  }

  final void a(AuthorizationClient.Result paramResult)
  {
    if ((paramResult.token != null) && (this.pendingRequest.i()))
    {
      if (paramResult.token == null)
        throw new FacebookException("Can't validate without a token");
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      String str1 = paramResult.token.a();
      AuthorizationClient.3 local3 = new AuthorizationClient.3(this, localArrayList1);
      String str2 = this.pendingRequest.h();
      Request localRequest1 = b(str2);
      localRequest1.a(local3);
      Request localRequest2 = b(str1);
      localRequest2.a(local3);
      Bundle localBundle = new Bundle();
      localBundle.putString("fields", "id");
      localBundle.putString("access_token", str2);
      Request localRequest3 = new Request(null, "me/permissions", localBundle, HttpMethod.a, null);
      localRequest3.a(new AuthorizationClient.4(this, localArrayList2));
      r localr = new r(new Request[] { localRequest1, localRequest2, localRequest3 });
      localr.a(this.pendingRequest.f());
      localr.a(new AuthorizationClient.5(this, localArrayList1, paramResult, localArrayList2));
      g();
      Request.b(localr);
      return;
    }
    b(paramResult);
  }

  final boolean a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == this.pendingRequest.d())
      return this.currentHandler.a(paramInt2, paramIntent);
    return false;
  }

  final h b()
  {
    if (this.b != null)
      return this.b;
    if (this.pendingRequest != null)
      return new AuthorizationClient.2(this);
    return null;
  }

  final void b(AuthorizationClient.Result paramResult)
  {
    if (this.currentHandler != null)
    {
      String str = this.currentHandler.a();
      Map localMap = this.currentHandler.methodLoggingExtras;
      a(str, paramResult.code.a(), paramResult.errorMessage, paramResult.errorCode, localMap);
    }
    if (this.loggingExtras != null)
      paramResult.loggingExtras = this.loggingExtras;
    this.handlersToTry = null;
    this.currentHandler = null;
    this.pendingRequest = null;
    this.loggingExtras = null;
    if (this.c != null)
      this.c.a(paramResult);
  }
}

/* Location:
 * Qualified Name:     com.facebook.AuthorizationClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
