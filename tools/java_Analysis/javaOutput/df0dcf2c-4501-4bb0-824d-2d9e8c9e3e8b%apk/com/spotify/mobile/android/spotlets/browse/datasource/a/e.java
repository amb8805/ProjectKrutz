package com.spotify.mobile.android.spotlets.browse.datasource.a;

import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import com.spotify.mobile.android.spotlets.browse.datasource.a;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.ao;
import com.spotify.mobile.android.util.be;
import com.spotify.mobile.android.util.bh;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.m;
import java.lang.ref.WeakReference;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public abstract class e<T>
  implements bh
{
  private final WeakReference<a<T>> a;
  private final String b;
  private final RequestType c;
  private final be d;
  private int e;

  public e(a<T> parama, String paramString, RequestType paramRequestType)
  {
    if (FeatureFragment.f.a());
    for (this.d = m.a("http://app01.tunigo.cloud.spotify.net"); ; this.d = m.a("https://api.tunigo.com"))
    {
      this.a = new WeakReference(parama);
      this.b = paramString;
      this.c = paramRequestType;
      return;
    }
  }

  public abstract String a();

  public abstract List<T> a(JSONObject paramJSONObject);

  Map<String, String> a(int paramInt1, int paramInt2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("page", String.valueOf(paramInt1));
    localHashMap.put("per_page", String.valueOf(paramInt2));
    if (this.b != null)
      localHashMap.put("region", this.b);
    Locale localLocale = Locale.getDefault();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = localLocale.getLanguage();
    arrayOfObject[1] = localLocale.getCountry();
    localHashMap.put("locale", MessageFormat.format("{0}_{1}", arrayOfObject));
    localHashMap.put("platform", "android");
    localHashMap.put("version", ((ClientInfo)c.a(ClientInfo.class)).b());
    localHashMap.put("dt", ao.a());
    localHashMap.put("suppress404", "1");
    localHashMap.put("suppress_response_codes", "1");
    if (FeatureFragment.h.a());
    for (String str = "shuffle"; ; str = "")
    {
      localHashMap.put("product", str);
      return localHashMap;
    }
  }

  public final void a(Throwable paramThrowable, String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramThrowable.getMessage();
    bp.b(paramThrowable, "Exception when fetching JSON: %s", arrayOfObject);
    bp.b(paramThrowable, "Log message: %s", new Object[] { paramString });
    a locala = (a)this.a.get();
    if (locala != null)
      locala.a(null, null, -1, true, this.c);
  }

  public Map b(JSONObject paramJSONObject)
  {
    return null;
  }

  public final void b(int paramInt1, int paramInt2)
  {
    this.d.a(a(), a(paramInt1, paramInt2), this);
    this.e = paramInt2;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.datasource.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
