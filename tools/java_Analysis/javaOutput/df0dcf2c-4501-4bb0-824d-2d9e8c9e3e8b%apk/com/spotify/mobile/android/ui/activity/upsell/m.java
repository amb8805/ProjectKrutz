package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.RemoteException;
import android.webkit.WebView;
import com.a.a.a.a;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cc;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.util.EncodingUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class m
{
  private final Context a;
  private final String b;
  private a c;
  private boolean d;
  private boolean e;
  private boolean f;
  private Uri g;
  private n h;
  private final ServiceConnection i = new m.1(this);

  public m(Context paramContext)
  {
    this.a = paramContext;
    this.b = paramContext.getPackageName();
  }

  private static int a(Bundle paramBundle)
  {
    Object localObject = paramBundle.get("RESPONSE_CODE");
    if (localObject != null)
    {
      if ((localObject instanceof Integer))
        return ((Integer)localObject).intValue();
      if ((localObject instanceof Long))
        return ((Long)localObject).intValue();
    }
    return 6;
  }

  private static String a(String paramString1, String paramString2)
  {
    try
    {
      String str = new JSONObject(paramString1).optString(paramString2);
      return str;
    }
    catch (JSONException localJSONException)
    {
      bp.b(localJSONException, "");
    }
    return null;
  }

  private void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    localUri = this.g.buildUpon().appendQueryParameter("post", "true").build();
    localStringBuilder = new StringBuilder();
    Locale localLocale1 = Locale.US;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = "responseCode";
    arrayOfObject1[1] = Integer.valueOf(paramInt);
    localStringBuilder.append(String.format(localLocale1, "%s=%d", arrayOfObject1));
    if (paramString1 != null);
    try
    {
      Locale localLocale3 = Locale.US;
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = "purchaseData";
      arrayOfObject3[1] = URLEncoder.encode(paramString1, "UTF-8");
      localStringBuilder.append(String.format(localLocale3, "&%s=%s", arrayOfObject3));
      if (paramString2 != null)
      {
        Locale localLocale2 = Locale.US;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = "dataSignature";
        arrayOfObject2[1] = URLEncoder.encode(paramString2, "UTF-8");
        localStringBuilder.append(String.format(localLocale2, "&%s=%s", arrayOfObject2));
      }
      byte[] arrayOfByte = EncodingUtils.getBytes(localStringBuilder.toString(), "BASE64");
      paramWebView.postUrl(localUri.toString(), arrayOfByte);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        Assertion.a(localUnsupportedEncodingException);
    }
  }

  private boolean a(String paramString, ArrayList<String> paramArrayList, ArrayList<p> paramArrayList1)
  {
    Bundle localBundle1 = new Bundle();
    localBundle1.putStringArrayList("ITEM_ID_LIST", paramArrayList);
    try
    {
      Bundle localBundle2 = this.c.a(3, this.b, paramString, localBundle1);
      localArrayList = localBundle2.getStringArrayList("DETAILS_LIST");
      if (localArrayList == null)
        return false;
    }
    catch (RemoteException localRemoteException)
    {
      bp.b(localRemoteException, "");
      return false;
    }
    ArrayList localArrayList;
    Iterator localIterator = localArrayList.iterator();
    while (true)
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        try
        {
          JSONObject localJSONObject = new JSONObject(str);
          paramArrayList1.add(new p(localJSONObject.optString("productId"), localJSONObject.optString("type"), localJSONObject.optString("price"), localJSONObject.optString("title"), localJSONObject.optString("description")));
        }
        catch (JSONException localJSONException)
        {
          bp.b(localJSONException, "");
          return false;
        }
      }
    return true;
  }

  private boolean a(String paramString, List<o> paramList)
  {
    if (this.c == null)
    {
      bp.d("Disconnected from service", new Object[0]);
      return false;
    }
    String str1;
    for (Object localObject = null; ; localObject = str1)
    {
      Bundle localBundle;
      try
      {
        localBundle = this.c.a(3, this.b, paramString, (String)localObject);
        if (localBundle == null)
        {
          bp.d("getPurchases() returned null", new Object[0]);
          return false;
        }
      }
      catch (RemoteException localRemoteException)
      {
        bp.b(localRemoteException, "");
        return false;
      }
      int j = a(localBundle);
      if (j != 0)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(j);
        bp.d("Response code %d when getting purchases", arrayOfObject);
        return false;
      }
      ArrayList localArrayList1 = localBundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
      ArrayList localArrayList2 = localBundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
      str1 = localBundle.getString("INAPP_CONTINUATION_TOKEN");
      if ((localArrayList1 == null) || (localArrayList2 == null))
        return false;
      int k = Math.min(localArrayList1.size(), localArrayList2.size());
      for (int m = 0; m < k; m++)
      {
        String str2 = (String)localArrayList1.get(m);
        String str3 = (String)localArrayList2.get(m);
        String str4 = a(str2, "orderId");
        if (str4 != null)
          paramList.add(new o(paramString, str4, str2, str3));
      }
      if ((str1 == null) || (str1.length() <= 0))
        return true;
    }
  }

  public final Uri a(Uri paramUri, String paramString)
  {
    cc.a(paramUri);
    cc.a(paramString);
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.f)
      localStringBuilder.append("inapp");
    if (this.e)
    {
      if (localStringBuilder.length() > 0)
        localStringBuilder.append((char)',');
      localStringBuilder.append("subs");
    }
    String str = localStringBuilder.toString();
    if (str.length() == 0)
      return paramUri;
    return paramUri.buildUpon().appendQueryParameter("gpiab", str).appendQueryParameter("gpiab_country", paramString).build();
  }

  public final void a(WebView paramWebView, Intent paramIntent)
  {
    a(paramWebView, a(paramIntent.getExtras()), paramIntent.getStringExtra("INAPP_PURCHASE_DATA"), paramIntent.getStringExtra("INAPP_DATA_SIGNATURE"));
    this.a.startService(SpotifyService.a(this.a, "com.spotify.mobile.android.service.action.googleiab.REGISTER_PURCHASES"));
  }

  public final void a(n paramn)
  {
    this.h = paramn;
  }

  public final boolean a()
  {
    Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
    localIntent.setPackage("com.android.vending");
    List localList = this.a.getPackageManager().queryIntentServices(localIntent, 0);
    if ((localList != null) && (!localList.isEmpty()))
    {
      this.d = this.a.getApplicationContext().bindService(localIntent, this.i, 1);
      if (!this.d)
        bp.e("Failed to bind to (%s)", new Object[] { "com.android.vending.billing.InAppBillingService.BIND" });
    }
    while (true)
    {
      return this.d;
      bp.d("Google Play doesn't exist (%s)", new Object[] { "com.android.vending.billing.InAppBillingService.BIND" });
    }
  }

  // ERROR //
  public final boolean a(PremiumSignupActivity paramPremiumSignupActivity, WebView paramWebView, Uri paramUri)
  {
    // Byte code:
    //   0: bipush 6
    //   2: istore 4
    //   4: aload_3
    //   5: ifnull +10 -> 15
    //   8: aload_3
    //   9: invokevirtual 378	android/net/Uri:getPath	()Ljava/lang/String;
    //   12: ifnonnull +5 -> 17
    //   15: iconst_0
    //   16: ireturn
    //   17: aload_3
    //   18: invokevirtual 378	android/net/Uri:getPath	()Ljava/lang/String;
    //   21: ldc_w 380
    //   24: invokevirtual 384	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   27: ifeq -12 -> 15
    //   30: ldc 98
    //   32: aload_3
    //   33: ldc 96
    //   35: invokevirtual 387	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   38: invokevirtual 390	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   41: ifne -26 -> 15
    //   44: aload_0
    //   45: aload_3
    //   46: putfield 88	com/spotify/mobile/android/ui/activity/upsell/m:g	Landroid/net/Uri;
    //   49: aload_3
    //   50: ldc 215
    //   52: invokevirtual 387	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   55: astore 5
    //   57: aload_3
    //   58: ldc 217
    //   60: invokevirtual 387	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   63: astore 6
    //   65: aload_3
    //   66: ldc_w 268
    //   69: invokevirtual 387	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   72: astore 7
    //   74: aload_0
    //   75: getfield 63	com/spotify/mobile/android/ui/activity/upsell/m:c	Lcom/a/a/a/a;
    //   78: ifnonnull +63 -> 141
    //   81: ldc 233
    //   83: iconst_0
    //   84: anewarray 4	java/lang/Object
    //   87: invokestatic 236	com/spotify/mobile/android/util/bp:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   90: aconst_null
    //   91: astore 11
    //   93: iload 4
    //   95: istore 10
    //   97: iload 10
    //   99: ifne +151 -> 250
    //   102: aload 11
    //   104: ifnonnull +146 -> 250
    //   107: iload 4
    //   109: ifne +124 -> 233
    //   112: aload_2
    //   113: ldc_w 392
    //   116: invokevirtual 395	android/webkit/WebView:loadUrl	(Ljava/lang/String;)V
    //   119: aload_1
    //   120: aload 11
    //   122: invokevirtual 401	android/app/PendingIntent:getIntentSender	()Landroid/content/IntentSender;
    //   125: iconst_1
    //   126: new 309	android/content/Intent
    //   129: dup
    //   130: invokespecial 402	android/content/Intent:<init>	()V
    //   133: iconst_0
    //   134: iconst_0
    //   135: iconst_0
    //   136: invokevirtual 408	com/spotify/mobile/android/ui/activity/upsell/PremiumSignupActivity:startIntentSenderForResult	(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    //   139: iconst_1
    //   140: ireturn
    //   141: aload_0
    //   142: getfield 63	com/spotify/mobile/android/ui/activity/upsell/m:c	Lcom/a/a/a/a;
    //   145: iconst_3
    //   146: aload_0
    //   147: getfield 42	com/spotify/mobile/android/ui/activity/upsell/m:b	Ljava/lang/String;
    //   150: aload 5
    //   152: aload 6
    //   154: aload 7
    //   156: invokeinterface 411 6 0
    //   161: astore 13
    //   163: aload 13
    //   165: invokestatic 243	com/spotify/mobile/android/ui/activity/upsell/m:a	(Landroid/os/Bundle;)I
    //   168: istore 14
    //   170: iload 14
    //   172: istore 9
    //   174: aload 13
    //   176: ldc_w 413
    //   179: invokevirtual 417	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   182: checkcast 397	android/app/PendingIntent
    //   185: astore 15
    //   187: iload 9
    //   189: istore 10
    //   191: aload 15
    //   193: astore 11
    //   195: goto -98 -> 97
    //   198: astore 8
    //   200: iload 4
    //   202: istore 9
    //   204: aload 8
    //   206: ldc 78
    //   208: invokestatic 83	com/spotify/mobile/android/util/bp:b	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   211: iload 9
    //   213: istore 10
    //   215: aconst_null
    //   216: astore 11
    //   218: goto -121 -> 97
    //   221: astore 12
    //   223: aload 12
    //   225: ldc 78
    //   227: invokestatic 83	com/spotify/mobile/android/util/bp:b	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   230: goto -91 -> 139
    //   233: aload_0
    //   234: aload_2
    //   235: iload 4
    //   237: aconst_null
    //   238: aconst_null
    //   239: invokespecial 322	com/spotify/mobile/android/ui/activity/upsell/m:a	(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    //   242: goto -103 -> 139
    //   245: astore 8
    //   247: goto -43 -> 204
    //   250: iload 10
    //   252: istore 4
    //   254: goto -147 -> 107
    //
    // Exception table:
    //   from	to	target	type
    //   141	170	198	android/os/RemoteException
    //   119	139	221	android/content/IntentSender$SendIntentException
    //   174	187	245	android/os/RemoteException
  }

  public final boolean a(o paramo)
  {
    Assertion.a("inapp".equals(paramo.a), "Only managed products can be consumed");
    String str = a(paramo.c, "purchaseToken");
    if (str == null)
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = paramo.c;
      bp.e("Could not get token from data (%s)", arrayOfObject3);
      return false;
    }
    try
    {
      int j = this.c.b(3, this.b, str);
      if (j != 0)
      {
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Integer.valueOf(j);
        arrayOfObject1[1] = str;
        bp.e("Failed to consume purchase %d (%s)", arrayOfObject1);
        return false;
      }
    }
    catch (RemoteException localRemoteException)
    {
      bp.b(localRemoteException, "");
      return false;
    }
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = paramo.b;
    bp.b("Successfully consumed purchase (%s)", arrayOfObject2);
    return true;
  }

  final boolean a(List<o> paramList)
  {
    boolean bool = true;
    if ((this.f) && (!a("inapp", paramList)))
      bool = false;
    if ((this.e) && (!a("subs", paramList)))
      bool = false;
    return bool;
  }

  public final void b()
  {
    if (this.d)
    {
      this.a.getApplicationContext().unbindService(this.i);
      this.d = false;
    }
    this.f = false;
    this.e = false;
    this.h = null;
  }

  public final String c()
  {
    ArrayList localArrayList1 = new ArrayList();
    localArrayList1.add("spotify.country.detection");
    ArrayList localArrayList2 = new ArrayList();
    if (a("inapp", localArrayList1, localArrayList2))
    {
      Iterator localIterator = localArrayList2.iterator();
      while (localIterator.hasNext())
      {
        p localp = (p)localIterator.next();
        if ("spotify.country.detection".equals(localp.a))
        {
          String str1 = localp.c;
          Matcher localMatcher = Pattern.compile("^\\D*(\\d{2})\\D+(\\d{1,2})\\D*$").matcher(str1);
          if (localMatcher.matches())
          {
            char c1 = (char)Integer.parseInt(localMatcher.group(1));
            String str2 = localMatcher.group(2);
            if (str2.length() == 1)
              str2 = str2 + '0';
            char c2 = (char)Integer.parseInt(str2);
            if ((c1 >= 'A') && (c1 <= 'Z') && (c2 >= 'A') && (c2 <= 'Z'))
            {
              Locale localLocale = Locale.US;
              Object[] arrayOfObject = new Object[2];
              arrayOfObject[0] = Character.valueOf(c1);
              arrayOfObject[1] = Character.valueOf(c2);
              return String.format(localLocale, "%s%s", arrayOfObject);
            }
          }
          bp.d("Could not detect country from price: %s", new Object[] { str1 });
          return "XX";
        }
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.upsell.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
