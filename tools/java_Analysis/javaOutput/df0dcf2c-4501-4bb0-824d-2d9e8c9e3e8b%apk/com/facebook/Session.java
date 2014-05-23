package com.facebook;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Bundle;;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.content.n;
import android.util.Log;
import com.facebook.internal.SessionAuthorizationType;
import com.facebook.internal.ad;
import com.facebook.internal.af;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public class Session
  implements Serializable
{
  public static final String a = Session.class.getCanonicalName();
  private static final Object b = new Object();
  private static Session c;
  private static volatile Context d;
  private static final Set<String> e = new Session.1();
  private static final long serialVersionUID = 1L;
  private AppEventsLogger appEventsLogger;
  private String applicationId;
  private volatile Bundle authorizationBundle;
  private AuthorizationClient authorizationClient;
  private u autoPublishAsyncTask;
  private final List<x> callbacks;
  private volatile y currentTokenRefreshRequest;
  private Handler handler;
  private Date lastAttemptedTokenExtendDate = new Date(0L);
  private final Object lock = new Object();
  private Session.AuthorizationRequest pendingAuthorizationRequest;
  private SessionState state;
  private ac tokenCachingStrategy;
  private AccessToken tokenInfo;

  public Session(Context paramContext)
  {
    this(paramContext, null, null, (byte)0);
  }

  Session(Context paramContext, String paramString, ac paramac)
  {
    this(paramContext, paramString, paramac, (byte)0);
  }

  private Session(Context paramContext, String paramString, ac paramac, byte paramByte)
  {
    if ((paramContext != null) && (paramString == null))
      paramString = ad.a(paramContext);
    af.a(paramString, "applicationId");
    b(paramContext);
    if (paramac == null)
      paramac = new ab(d);
    this.applicationId = paramString;
    this.tokenCachingStrategy = paramac;
    this.state = SessionState.a;
    this.pendingAuthorizationRequest = null;
    this.callbacks = new ArrayList();
    this.handler = new Handler(Looper.getMainLooper());
    Bundle localBundle = paramac.a();
    int i = 0;
    if (localBundle == null);
    while (true)
    {
      if (i != 0)
      {
        Date localDate1 = ac.a(localBundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
        Date localDate2 = new Date();
        if ((localDate1 != null) && (!localDate1.before(localDate2)))
          break;
        paramac.b();
      }
      this.tokenInfo = AccessToken.a(Collections.emptyList());
      return;
      String str = localBundle.getString("com.facebook.TokenCachingStrategy.Token");
      i = 0;
      if (str != null)
      {
        int j = str.length();
        i = 0;
        if (j != 0)
        {
          boolean bool = localBundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) < 0L;
          i = 0;
          if (bool)
            i = 1;
        }
      }
    }
    this.tokenInfo = AccessToken.a(localBundle);
    this.state = SessionState.b;
  }

  private Session(String paramString, SessionState paramSessionState, AccessToken paramAccessToken, Date paramDate, Session.AuthorizationRequest paramAuthorizationRequest)
  {
    this.applicationId = paramString;
    this.state = paramSessionState;
    this.tokenInfo = paramAccessToken;
    this.lastAttemptedTokenExtendDate = paramDate;
    this.pendingAuthorizationRequest = paramAuthorizationRequest;
    this.handler = new Handler(Looper.getMainLooper());
    this.currentTokenRefreshRequest = null;
    this.tokenCachingStrategy = null;
    this.callbacks = new ArrayList();
  }

  public static Session a(Context paramContext)
  {
    return a(paramContext, false, null);
  }

  public static Session a(Context paramContext, Fragment paramFragment, x paramx)
  {
    return a(paramContext, true, new Session.OpenRequest(paramFragment).b(paramx));
  }

  public static final Session a(Context paramContext, x paramx, Bundle paramBundle)
  {
    if (paramBundle == null)
      return null;
    byte[] arrayOfByte = paramBundle.getByteArray("com.facebook.sdk.Session.saveSessionKey");
    if (arrayOfByte != null)
    {
      ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      try
      {
        Session localSession = (Session)new ObjectInputStream(localByteArrayInputStream).readObject();
        b(paramContext);
        localSession.tokenCachingStrategy = new ab(paramContext);
        if (paramx != null)
          localSession.a(paramx);
        localSession.authorizationBundle = paramBundle.getBundle("com.facebook.sdk.Session.authBundleKey");
        return localSession;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        Log.w(a, "Unable to restore session", localClassNotFoundException);
        return null;
      }
      catch (IOException localIOException)
      {
        while (true)
          Log.w(a, "Unable to restore session.", localIOException);
      }
    }
  }

  private static Session a(Context paramContext, boolean paramBoolean, Session.OpenRequest paramOpenRequest)
  {
    Session localSession = new v(paramContext).a();
    if ((SessionState.b.equals(localSession.c())) || (paramBoolean))
    {
      a(localSession);
      localSession.a(paramOpenRequest);
      return localSession;
    }
    return null;
  }

  private void a(int paramInt, AuthorizationClient.Result paramResult)
  {
    AccessToken localAccessToken;
    Object localObject;
    if (paramInt == -1)
      if (paramResult.code == AuthorizationClient.Result.Code.a)
      {
        localAccessToken = paramResult.token;
        localObject = null;
      }
    while (true)
    {
      a(paramResult.code, paramResult.loggingExtras, (Exception)localObject);
      this.authorizationClient = null;
      a(localAccessToken, (Exception)localObject);
      return;
      localObject = new FacebookAuthorizationException(paramResult.errorMessage);
      localAccessToken = null;
      continue;
      if (paramInt == 0)
      {
        localObject = new FacebookOperationCanceledException(paramResult.errorMessage);
        localAccessToken = null;
      }
      else
      {
        localObject = null;
        localAccessToken = null;
      }
    }
  }

  private void a(AccessToken paramAccessToken)
  {
    if ((paramAccessToken != null) && (this.tokenCachingStrategy != null))
      this.tokenCachingStrategy.a(paramAccessToken.f());
  }

  private void a(AccessToken paramAccessToken, Exception paramException)
  {
    if ((paramAccessToken != null) && (paramAccessToken.g()))
    {
      paramException = new FacebookException("Invalid access token.");
      paramAccessToken = null;
    }
    while (true)
    {
      synchronized (this.lock)
      {
        switch (Session.4.a[this.state.ordinal()])
        {
        default:
          return;
        case 2:
          SessionState localSessionState2 = this.state;
          if (paramAccessToken != null)
          {
            this.tokenInfo = paramAccessToken;
            a(paramAccessToken);
            this.state = SessionState.d;
            this.pendingAuthorizationRequest = null;
            a(localSessionState2, this.state, paramException);
          }
        case 4:
        case 5:
        case 1:
        case 3:
        case 6:
        case 7:
        }
      }
      if (paramException != null)
      {
        this.state = SessionState.f;
        continue;
        SessionState localSessionState1 = this.state;
        if (paramAccessToken != null)
        {
          this.tokenInfo = paramAccessToken;
          a(paramAccessToken);
          this.state = SessionState.e;
        }
        this.pendingAuthorizationRequest = null;
        a(localSessionState1, this.state, paramException);
        continue;
        Log.d(a, "Unexpected call to finishAuthOrReauth in state " + this.state);
      }
    }
  }

  private void a(AuthorizationClient.Result.Code paramCode, Map<String, String> paramMap, Exception paramException)
  {
    Object localObject2;
    if (this.pendingAuthorizationRequest == null)
    {
      localObject2 = AuthorizationClient.a("");
      ((Bundle)localObject2).putString("2_result", AuthorizationClient.Result.Code.c.a());
      ((Bundle)localObject2).putString("5_error_message", "Unexpected call to logAuthorizationComplete with null pendingAuthorizationRequest.");
      ((Bundle)localObject2).putLong("1_timestamp_ms", System.currentTimeMillis());
      p().a("fb_mobile_login_complete", (Bundle)localObject2);
      return;
    }
    Bundle localBundle = AuthorizationClient.a(this.pendingAuthorizationRequest.f());
    if (paramCode != null)
      localBundle.putString("2_result", paramCode.a());
    if ((paramException != null) && (paramException.getMessage() != null))
      localBundle.putString("5_error_message", paramException.getMessage());
    boolean bool = Session.AuthorizationRequest.a(this.pendingAuthorizationRequest).isEmpty();
    Object localObject1 = null;
    if (!bool)
      localObject1 = new JSONObject(Session.AuthorizationRequest.a(this.pendingAuthorizationRequest));
    if (paramMap != null)
      if (localObject1 != null)
        break label270;
    label270: for (Object localObject3 = new JSONObject(); ; localObject3 = localObject1)
    {
      try
      {
        Iterator localIterator = paramMap.entrySet().iterator();
        while (localIterator.hasNext())
        {
          localEntry = (Map.Entry)localIterator.next();
          ((JSONObject)localObject3).put((String)localEntry.getKey(), localEntry.getValue());
        }
      }
      catch (JSONException localJSONException)
      {
        localObject1 = localObject3;
      }
      while (true)
      {
        Map.Entry localEntry;
        if (localObject1 != null)
          localBundle.putString("6_extras", ((JSONObject)localObject1).toString());
        localObject2 = localBundle;
        break;
        localObject1 = localObject3;
      }
    }
  }

  // ERROR //
  private void a(Session.AuthorizationRequest paramAuthorizationRequest)
  {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield 103	com/facebook/Session:applicationId	Ljava/lang/String;
    //   5: invokevirtual 462	com/facebook/Session$AuthorizationRequest:a	(Ljava/lang/String;)V
    //   8: aload_0
    //   9: monitorenter
    //   10: aload_0
    //   11: getfield 464	com/facebook/Session:autoPublishAsyncTask	Lcom/facebook/u;
    //   14: ifnonnull +468 -> 482
    //   17: invokestatic 468	com/facebook/aa:d	()Z
    //   20: ifeq +462 -> 482
    //   23: aload_0
    //   24: getfield 103	com/facebook/Session:applicationId	Ljava/lang/String;
    //   27: astore 24
    //   29: aload 24
    //   31: ifnull +451 -> 482
    //   34: new 470	com/facebook/u
    //   37: dup
    //   38: aload_0
    //   39: aload 24
    //   41: getstatic 99	com/facebook/Session:d	Landroid/content/Context;
    //   44: invokespecial 473	com/facebook/u:<init>	(Lcom/facebook/Session;Ljava/lang/String;Landroid/content/Context;)V
    //   47: astore_3
    //   48: aload_0
    //   49: aload_3
    //   50: putfield 464	com/facebook/Session:autoPublishAsyncTask	Lcom/facebook/u;
    //   53: aload_0
    //   54: monitorexit
    //   55: aload_3
    //   56: ifnull +12 -> 68
    //   59: aload_3
    //   60: iconst_0
    //   61: anewarray 475	java/lang/Void
    //   64: invokevirtual 479	com/facebook/u:execute	([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //   67: pop
    //   68: aload_0
    //   69: getfield 113	com/facebook/Session:pendingAuthorizationRequest	Lcom/facebook/Session$AuthorizationRequest;
    //   72: invokevirtual 407	com/facebook/Session$AuthorizationRequest:f	()Ljava/lang/String;
    //   75: invokestatic 366	com/facebook/AuthorizationClient:a	(Ljava/lang/String;)Landroid/os/Bundle;
    //   78: astore 4
    //   80: aload 4
    //   82: ldc_w 382
    //   85: invokestatic 388	java/lang/System:currentTimeMillis	()J
    //   88: invokevirtual 392	android/os/Bundle:putLong	(Ljava/lang/String;J)V
    //   91: new 422	org/json/JSONObject
    //   94: dup
    //   95: invokespecial 426	org/json/JSONObject:<init>	()V
    //   98: astore 5
    //   100: aload 5
    //   102: ldc_w 481
    //   105: aload_0
    //   106: getfield 113	com/facebook/Session:pendingAuthorizationRequest	Lcom/facebook/Session$AuthorizationRequest;
    //   109: invokestatic 484	com/facebook/Session$AuthorizationRequest:c	(Lcom/facebook/Session$AuthorizationRequest;)Lcom/facebook/SessionLoginBehavior;
    //   112: invokevirtual 487	com/facebook/SessionLoginBehavior:toString	()Ljava/lang/String;
    //   115: invokevirtual 456	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   118: pop
    //   119: aload 5
    //   121: ldc_w 489
    //   124: aload_0
    //   125: getfield 113	com/facebook/Session:pendingAuthorizationRequest	Lcom/facebook/Session$AuthorizationRequest;
    //   128: invokestatic 492	com/facebook/Session$AuthorizationRequest:d	(Lcom/facebook/Session$AuthorizationRequest;)I
    //   131: invokevirtual 495	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   134: pop
    //   135: aload 5
    //   137: ldc_w 497
    //   140: aload_0
    //   141: getfield 113	com/facebook/Session:pendingAuthorizationRequest	Lcom/facebook/Session$AuthorizationRequest;
    //   144: invokestatic 500	com/facebook/Session$AuthorizationRequest:b	(Lcom/facebook/Session$AuthorizationRequest;)Z
    //   147: invokevirtual 503	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   150: pop
    //   151: aload 5
    //   153: ldc_w 505
    //   156: ldc_w 507
    //   159: aload_0
    //   160: getfield 113	com/facebook/Session:pendingAuthorizationRequest	Lcom/facebook/Session$AuthorizationRequest;
    //   163: invokestatic 510	com/facebook/Session$AuthorizationRequest:e	(Lcom/facebook/Session$AuthorizationRequest;)Ljava/util/List;
    //   166: invokestatic 516	android/text/TextUtils:join	(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //   169: invokevirtual 456	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   172: pop
    //   173: aload 5
    //   175: ldc_w 518
    //   178: aload_0
    //   179: getfield 113	com/facebook/Session:pendingAuthorizationRequest	Lcom/facebook/Session$AuthorizationRequest;
    //   182: invokestatic 521	com/facebook/Session$AuthorizationRequest:f	(Lcom/facebook/Session$AuthorizationRequest;)Lcom/facebook/SessionDefaultAudience;
    //   185: invokevirtual 524	com/facebook/SessionDefaultAudience:toString	()Ljava/lang/String;
    //   188: invokevirtual 456	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   191: pop
    //   192: aload 4
    //   194: ldc_w 458
    //   197: aload 5
    //   199: invokevirtual 459	org/json/JSONObject:toString	()Ljava/lang/String;
    //   202: invokevirtual 376	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   205: aload_0
    //   206: invokespecial 396	com/facebook/Session:p	()Lcom/facebook/AppEventsLogger;
    //   209: ldc_w 526
    //   212: aload 4
    //   214: invokevirtual 403	com/facebook/AppEventsLogger:a	(Ljava/lang/String;Landroid/os/Bundle;)V
    //   217: aload_1
    //   218: invokestatic 528	com/facebook/Session:c	(Lcom/facebook/Session$AuthorizationRequest;)Z
    //   221: istore 7
    //   223: aload_0
    //   224: getfield 113	com/facebook/Session:pendingAuthorizationRequest	Lcom/facebook/Session$AuthorizationRequest;
    //   227: invokestatic 415	com/facebook/Session$AuthorizationRequest:a	(Lcom/facebook/Session$AuthorizationRequest;)Ljava/util/Map;
    //   230: astore 8
    //   232: iload 7
    //   234: ifeq +216 -> 450
    //   237: ldc_w 530
    //   240: astore 9
    //   242: aload 8
    //   244: ldc_w 532
    //   247: aload 9
    //   249: invokeinterface 535 3 0
    //   254: pop
    //   255: iload 7
    //   257: ifne +218 -> 475
    //   260: aload_1
    //   261: invokestatic 500	com/facebook/Session$AuthorizationRequest:b	(Lcom/facebook/Session$AuthorizationRequest;)Z
    //   264: ifeq +211 -> 475
    //   267: aload_0
    //   268: getfield 113	com/facebook/Session:pendingAuthorizationRequest	Lcom/facebook/Session$AuthorizationRequest;
    //   271: invokestatic 415	com/facebook/Session$AuthorizationRequest:a	(Lcom/facebook/Session$AuthorizationRequest;)Ljava/util/Map;
    //   274: ldc_w 537
    //   277: ldc_w 530
    //   280: invokeinterface 535 3 0
    //   285: pop
    //   286: aload_0
    //   287: new 364	com/facebook/AuthorizationClient
    //   290: dup
    //   291: invokespecial 538	com/facebook/AuthorizationClient:<init>	()V
    //   294: putfield 291	com/facebook/Session:authorizationClient	Lcom/facebook/AuthorizationClient;
    //   297: aload_0
    //   298: getfield 291	com/facebook/Session:authorizationClient	Lcom/facebook/AuthorizationClient;
    //   301: new 540	com/facebook/Session$2
    //   304: dup
    //   305: aload_0
    //   306: invokespecial 542	com/facebook/Session$2:<init>	(Lcom/facebook/Session;)V
    //   309: putfield 545	com/facebook/AuthorizationClient:c	Lcom/facebook/g;
    //   312: aload_0
    //   313: getfield 291	com/facebook/Session:authorizationClient	Lcom/facebook/AuthorizationClient;
    //   316: astore 17
    //   318: aload 17
    //   320: getstatic 99	com/facebook/Session:d	Landroid/content/Context;
    //   323: putfield 547	com/facebook/AuthorizationClient:a	Landroid/content/Context;
    //   326: aload 17
    //   328: aconst_null
    //   329: putfield 550	com/facebook/AuthorizationClient:b	Lcom/facebook/h;
    //   332: aload_0
    //   333: getfield 291	com/facebook/Session:authorizationClient	Lcom/facebook/AuthorizationClient;
    //   336: aload_1
    //   337: invokevirtual 553	com/facebook/Session$AuthorizationRequest:g	()Lcom/facebook/AuthorizationClient$AuthorizationRequest;
    //   340: invokevirtual 556	com/facebook/AuthorizationClient:a	(Lcom/facebook/AuthorizationClient$AuthorizationRequest;)V
    //   343: iconst_1
    //   344: istore 11
    //   346: iload 11
    //   348: ifne +96 -> 444
    //   351: aload_0
    //   352: getfield 82	com/facebook/Session:lock	Ljava/lang/Object;
    //   355: astore 12
    //   357: aload 12
    //   359: monitorenter
    //   360: aload_0
    //   361: getfield 111	com/facebook/Session:state	Lcom/facebook/SessionState;
    //   364: astore 14
    //   366: getstatic 329	com/facebook/Session$4:a	[I
    //   369: aload_0
    //   370: getfield 111	com/facebook/Session:state	Lcom/facebook/SessionState;
    //   373: invokevirtual 332	com/facebook/SessionState:ordinal	()I
    //   376: iaload
    //   377: tableswitch	default:+23 -> 400, 6:+81->458, 7:+81->458
    //   401: getstatic 341	com/facebook/SessionState:f	Lcom/facebook/SessionState;
    //   404: putfield 111	com/facebook/Session:state	Lcom/facebook/SessionState;
    //   407: new 321	com/facebook/FacebookException
    //   410: dup
    //   411: ldc_w 558
    //   414: invokespecial 324	com/facebook/FacebookException:<init>	(Ljava/lang/String;)V
    //   417: astore 15
    //   419: aload_0
    //   420: getstatic 370	com/facebook/AuthorizationClient$Result$Code:c	Lcom/facebook/AuthorizationClient$Result$Code;
    //   423: aconst_null
    //   424: aload 15
    //   426: invokespecial 289	com/facebook/Session:a	(Lcom/facebook/AuthorizationClient$Result$Code;Ljava/util/Map;Ljava/lang/Exception;)V
    //   429: aload_0
    //   430: aload 14
    //   432: aload_0
    //   433: getfield 111	com/facebook/Session:state	Lcom/facebook/SessionState;
    //   436: aload 15
    //   438: invokespecial 339	com/facebook/Session:a	(Lcom/facebook/SessionState;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    //   441: aload 12
    //   443: monitorexit
    //   444: return
    //   445: astore_2
    //   446: aload_0
    //   447: monitorexit
    //   448: aload_2
    //   449: athrow
    //   450: ldc_w 560
    //   453: astore 9
    //   455: goto -213 -> 242
    //   458: aload 12
    //   460: monitorexit
    //   461: return
    //   462: astore 13
    //   464: aload 12
    //   466: monitorexit
    //   467: aload 13
    //   469: athrow
    //   470: astore 6
    //   472: goto -267 -> 205
    //   475: iload 7
    //   477: istore 11
    //   479: goto -133 -> 346
    //   482: aconst_null
    //   483: astore_3
    //   484: goto -431 -> 53
    //
    // Exception table:
    //   from	to	target	type
    //   10	29	445	finally
    //   34	53	445	finally
    //   53	55	445	finally
    //   360	400	462	finally
    //   400	444	462	finally
    //   458	461	462	finally
    //   91	205	470	org/json/JSONException
  }

  private static void a(Session.AuthorizationRequest paramAuthorizationRequest, SessionAuthorizationType paramSessionAuthorizationType)
  {
    if ((paramAuthorizationRequest == null) || (ad.a(paramAuthorizationRequest.d())))
    {
      if (SessionAuthorizationType.b.equals(paramSessionAuthorizationType))
        throw new FacebookException("Cannot request publish or manage authorization with no permissions.");
    }
    else
    {
      Iterator localIterator = paramAuthorizationRequest.d().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (a(str))
        {
          if (SessionAuthorizationType.a.equals(paramSessionAuthorizationType))
            throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[] { str }));
        }
        else if (SessionAuthorizationType.b.equals(paramSessionAuthorizationType))
          Log.w(a, String.format("Should not pass a read permission (%s) to a request for publish or manage authorization", new Object[] { str }));
      }
    }
  }

  private void a(Session.OpenRequest paramOpenRequest, SessionAuthorizationType paramSessionAuthorizationType)
  {
    a(paramOpenRequest, paramSessionAuthorizationType);
    b(paramOpenRequest);
    SessionState localSessionState1;
    synchronized (this.lock)
    {
      if (this.pendingAuthorizationRequest != null)
      {
        a(this.state, this.state, new UnsupportedOperationException("Session: an attempt was made to open a session that has a pending request."));
        return;
      }
      localSessionState1 = this.state;
      switch (Session.4.a[this.state.ordinal()])
      {
      case 2:
      default:
        throw new UnsupportedOperationException("Session: an attempt was made to open an already opened session.");
      case 1:
      case 3:
      }
    }
    SessionState localSessionState2 = SessionState.c;
    this.state = localSessionState2;
    if (paramOpenRequest == null)
      throw new IllegalArgumentException("openRequest cannot be null when opening a new Session");
    this.pendingAuthorizationRequest = paramOpenRequest;
    while (true)
    {
      if (paramOpenRequest != null)
        a(paramOpenRequest.a());
      a(localSessionState1, localSessionState2, null);
      if (localSessionState2 != SessionState.c)
        break;
      a(paramOpenRequest);
      return;
      if ((paramOpenRequest != null) && (!ad.a(paramOpenRequest.d())) && (!ad.a(paramOpenRequest.d(), f())))
        this.pendingAuthorizationRequest = paramOpenRequest;
      if (this.pendingAuthorizationRequest == null)
      {
        localSessionState2 = SessionState.d;
        this.state = localSessionState2;
      }
      else
      {
        localSessionState2 = SessionState.c;
        this.state = localSessionState2;
      }
    }
  }

  public static final void a(Session paramSession)
  {
    synchronized (b)
    {
      if (paramSession != c)
      {
        Session localSession = c;
        if (localSession != null)
          localSession.o();
        c = paramSession;
        if (localSession != null)
          b("com.facebook.sdk.ACTIVE_SESSION_UNSET");
        if (paramSession != null)
        {
          b("com.facebook.sdk.ACTIVE_SESSION_SET");
          if (paramSession.a())
            b("com.facebook.sdk.ACTIVE_SESSION_OPENED");
        }
      }
      return;
    }
  }

  public static final void a(Session paramSession, Bundle paramBundle)
  {
    if ((paramBundle != null) && (paramSession != null) && (!paramBundle.containsKey("com.facebook.sdk.Session.saveSessionKey")))
    {
      localByteArrayOutputStream = new ByteArrayOutputStream();
      try
      {
        new ObjectOutputStream(localByteArrayOutputStream).writeObject(paramSession);
        paramBundle.putByteArray("com.facebook.sdk.Session.saveSessionKey", localByteArrayOutputStream.toByteArray());
        paramBundle.putBundle("com.facebook.sdk.Session.authBundleKey", paramSession.authorizationBundle);
        return;
      }
      catch (IOException localIOException)
      {
        throw new FacebookException("Unable to save session.", localIOException);
      }
    }
  }

  private void a(SessionState paramSessionState1, SessionState paramSessionState2, Exception paramException)
  {
    if ((paramSessionState1 == paramSessionState2) && (paramSessionState1 != SessionState.e) && (paramException == null));
    while (true)
    {
      return;
      if (paramSessionState2.b())
        this.tokenInfo = AccessToken.a(Collections.emptyList());
      synchronized (this.callbacks)
      {
        Session.3 local3 = new Session.3(this, paramSessionState2, paramException);
        b(this.handler, local3);
        if ((this == c) && (paramSessionState1.a() != paramSessionState2.a()))
          if (paramSessionState2.a())
          {
            b("com.facebook.sdk.ACTIVE_SESSION_OPENED");
            return;
          }
      }
    }
    b("com.facebook.sdk.ACTIVE_SESSION_CLOSED");
  }

  private static boolean a(Intent paramIntent)
  {
    return d.getPackageManager().resolveActivity(paramIntent, 0) != null;
  }

  private static boolean a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null)
      return paramObject2 == null;
    return paramObject1.equals(paramObject2);
  }

  public static boolean a(String paramString)
  {
    return (paramString != null) && ((paramString.startsWith("publish")) || (paramString.startsWith("manage")) || (e.contains(paramString)));
  }

  private static void b(Context paramContext)
  {
    if ((paramContext != null) && (d == null))
    {
      Context localContext = paramContext.getApplicationContext();
      if (localContext != null)
        paramContext = localContext;
      d = paramContext;
    }
  }

  private static void b(Handler paramHandler, Runnable paramRunnable)
  {
    if (paramHandler != null)
    {
      paramHandler.post(paramRunnable);
      return;
    }
    aa.b().execute(paramRunnable);
  }

  private static void b(Session.AuthorizationRequest paramAuthorizationRequest)
  {
    if ((paramAuthorizationRequest != null) && (!Session.AuthorizationRequest.b(paramAuthorizationRequest)))
    {
      Intent localIntent = new Intent();
      localIntent.setClass(d, LoginActivity.class);
      if (!a(localIntent))
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = paramAuthorizationRequest.b();
        arrayOfObject[1] = LoginActivity.class.getName();
        throw new FacebookException(String.format("Cannot use SessionLoginBehavior %s when %s is not declared as an activity in AndroidManifest.xml", arrayOfObject));
      }
    }
  }

  private static void b(String paramString)
  {
    Intent localIntent = new Intent(paramString);
    n.a(d).a(localIntent);
  }

  private static boolean c(Session.AuthorizationRequest paramAuthorizationRequest)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(d, LoginActivity.class);
    localIntent.setAction(paramAuthorizationRequest.b().toString());
    localIntent.putExtras(LoginActivity.a(paramAuthorizationRequest.g()));
    if (!a(localIntent))
      return false;
    try
    {
      paramAuthorizationRequest.e().a(localIntent, paramAuthorizationRequest.c());
      return true;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
    }
    return false;
  }

  public static final Session h()
  {
    synchronized (b)
    {
      Session localSession = c;
      return localSession;
    }
  }

  static Context i()
  {
    return d;
  }

  private Date n()
  {
    synchronized (this.lock)
    {
      if (this.tokenInfo == null)
      {
        localObject3 = null;
        return localObject3;
      }
      Date localDate = this.tokenInfo.b();
      Object localObject3 = localDate;
    }
  }

  private void o()
  {
    while (true)
    {
      SessionState localSessionState;
      synchronized (this.lock)
      {
        localSessionState = this.state;
        switch (Session.4.a[this.state.ordinal()])
        {
        default:
          return;
        case 1:
        case 2:
          this.state = SessionState.f;
          a(localSessionState, this.state, new FacebookException("Log in attempt aborted."));
        case 3:
        case 4:
        case 5:
        }
      }
      this.state = SessionState.g;
      a(localSessionState, this.state, null);
    }
  }

  private AppEventsLogger p()
  {
    synchronized (this.lock)
    {
      if (this.appEventsLogger == null)
        this.appEventsLogger = AppEventsLogger.a(d, this.applicationId);
      AppEventsLogger localAppEventsLogger = this.appEventsLogger;
      return localAppEventsLogger;
    }
  }

  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    throw new InvalidObjectException("Cannot readObject, serialization proxy required");
  }

  private Object writeReplace()
  {
    return new Session.SerializationProxyV1(this.applicationId, this.state, this.tokenInfo, this.lastAttemptedTokenExtendDate, this.pendingAuthorizationRequest);
  }

  final void a(Bundle paramBundle)
  {
    synchronized (this.lock)
    {
      SessionState localSessionState = this.state;
      switch (Session.4.a[this.state.ordinal()])
      {
      default:
        Log.d(a, "refreshToken ignored in state " + this.state);
        return;
      case 4:
        this.state = SessionState.e;
        a(localSessionState, this.state, null);
      case 5:
      }
      this.tokenInfo = AccessToken.a(this.tokenInfo, paramBundle);
      if (this.tokenCachingStrategy != null)
        this.tokenCachingStrategy.a(this.tokenInfo.f());
      return;
    }
  }

  public final void a(Session.NewPermissionsRequest paramNewPermissionsRequest)
  {
    a(paramNewPermissionsRequest, SessionAuthorizationType.b);
    b(paramNewPermissionsRequest);
    synchronized (this.lock)
    {
      if (this.pendingAuthorizationRequest != null)
        throw new UnsupportedOperationException("Session: an attempt was made to request new permissions for a session that has a pending request.");
    }
    if (this.state.a())
    {
      this.pendingAuthorizationRequest = paramNewPermissionsRequest;
      paramNewPermissionsRequest.b(e());
      a(paramNewPermissionsRequest.a());
      a(paramNewPermissionsRequest);
      return;
    }
    if (this.state.b())
      throw new UnsupportedOperationException("Session: an attempt was made to request new permissions for a session that has been closed.");
    throw new UnsupportedOperationException("Session: an attempt was made to request new permissions for a session that is not currently open.");
  }

  public final void a(Session.OpenRequest paramOpenRequest)
  {
    a(paramOpenRequest, SessionAuthorizationType.a);
  }

  public final void a(x paramx)
  {
    localList = this.callbacks;
    if (paramx != null);
    try
    {
      if (!this.callbacks.contains(paramx))
        this.callbacks.add(paramx);
      return;
    }
    finally
    {
    }
  }

  final void a(Date paramDate)
  {
    this.lastAttemptedTokenExtendDate = paramDate;
  }

  public final boolean a()
  {
    synchronized (this.lock)
    {
      boolean bool = this.state.a();
      return bool;
    }
  }

  public final boolean a(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    af.a(paramActivity, "currentActivity");
    b(paramActivity);
    Object localObject3;
    synchronized (this.lock)
    {
      if ((this.pendingAuthorizationRequest == null) || (paramInt1 != this.pendingAuthorizationRequest.c()))
        return false;
      localObject3 = AuthorizationClient.Result.Code.c;
      if (paramIntent == null)
        break label150;
      AuthorizationClient.Result localResult = (AuthorizationClient.Result)paramIntent.getSerializableExtra("com.facebook.LoginActivity:Result");
      if (localResult != null)
      {
        a(paramInt2, localResult);
        return true;
      }
    }
    if (this.authorizationClient != null)
    {
      this.authorizationClient.a(paramInt1, paramInt2, paramIntent);
      return true;
    }
    Object localObject4 = null;
    while (true)
    {
      if (localObject4 == null)
        localObject4 = new FacebookException("Unexpected call to Session.onActivityResult");
      a((AuthorizationClient.Result.Code)localObject3, null, (Exception)localObject4);
      a(null, (Exception)localObject4);
      return true;
      label150: if (paramInt2 == 0)
      {
        FacebookOperationCanceledException localFacebookOperationCanceledException = new FacebookOperationCanceledException("User canceled operation.");
        AuthorizationClient.Result.Code localCode = AuthorizationClient.Result.Code.b;
        localObject4 = localFacebookOperationCanceledException;
        localObject3 = localCode;
      }
      else
      {
        localObject4 = null;
      }
    }
  }

  public final void b(Session.OpenRequest paramOpenRequest)
  {
    a(paramOpenRequest, SessionAuthorizationType.b);
  }

  public final void b(x paramx)
  {
    synchronized (this.callbacks)
    {
      this.callbacks.remove(paramx);
      return;
    }
  }

  public final boolean b()
  {
    synchronized (this.lock)
    {
      boolean bool = this.state.b();
      return bool;
    }
  }

  public final SessionState c()
  {
    synchronized (this.lock)
    {
      SessionState localSessionState = this.state;
      return localSessionState;
    }
  }

  public final String d()
  {
    return this.applicationId;
  }

  public final String e()
  {
    synchronized (this.lock)
    {
      if (this.tokenInfo == null)
      {
        localObject3 = null;
        return localObject3;
      }
      String str = this.tokenInfo.a();
      Object localObject3 = str;
    }
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Session));
    Session localSession;
    do
    {
      return false;
      localSession = (Session)paramObject;
    }
    while ((!a(localSession.applicationId, this.applicationId)) || (!a(localSession.authorizationBundle, this.authorizationBundle)) || (!a(localSession.state, this.state)) || (!a(localSession.n(), n())));
    return true;
  }

  public final List<String> f()
  {
    synchronized (this.lock)
    {
      if (this.tokenInfo == null)
      {
        localObject3 = null;
        return localObject3;
      }
      List localList = this.tokenInfo.c();
      Object localObject3 = localList;
    }
  }

  public final void g()
  {
    if (this.tokenCachingStrategy != null)
      this.tokenCachingStrategy.b();
    ad.b(d);
    ad.c(d);
    o();
  }

  public int hashCode()
  {
    return 0;
  }

  final void j()
  {
    synchronized (this.lock)
    {
      y localy1 = this.currentTokenRefreshRequest;
      y localy2 = null;
      if (localy1 == null)
      {
        localy2 = new y(this);
        this.currentTokenRefreshRequest = localy2;
      }
      if (localy2 != null)
        localy2.a();
      return;
    }
  }

  final boolean k()
  {
    if (this.currentTokenRefreshRequest != null);
    Date localDate;
    do
    {
      return false;
      localDate = new Date();
    }
    while ((!this.state.a()) || (!this.tokenInfo.d().a()) || (localDate.getTime() - this.lastAttemptedTokenExtendDate.getTime() <= 3600000L) || (localDate.getTime() - this.tokenInfo.e().getTime() <= 86400000L));
    return true;
  }

  final AccessToken l()
  {
    return this.tokenInfo;
  }

  public String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder("{Session state:").append(this.state).append(", token:");
    Object localObject;
    StringBuilder localStringBuilder2;
    if (this.tokenInfo == null)
    {
      localObject = "null";
      localStringBuilder2 = localStringBuilder1.append(localObject).append(", appId:");
      if (this.applicationId != null)
        break label83;
    }
    label83: for (String str = "null"; ; str = this.applicationId)
    {
      return str + "}";
      localObject = this.tokenInfo;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.Session
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
