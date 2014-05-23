package com.applovin.impl.sdk;

import android.util.Log;
import org.json.JSONObject;

class ax
  implements l
{
  ax(aw paramaw, AppLovinSdkImpl paramAppLovinSdkImpl, String paramString)
  {
  }

  public void a(int paramInt)
  {
    if ((paramInt < 200) || (paramInt >= 500));
    for (int i = 1; ; i = 0)
    {
      int j = 0;
      if (paramInt != -103)
        j = 1;
      if ((i == 0) || (j == 0) || (aw.a(this.c) <= 0))
        break;
      long l = ((Long)this.a.a(z.p)).longValue();
      Log.w(this.b, "Unable to send requset due to server failure (code " + paramInt + "). " + aw.a(this.c) + " attempts left, retrying in " + l / 1000.0D + " seconds...");
      aw.b(this.c, 1);
      if (aw.a(this.c) == 0)
        aw.b(this.c);
      this.a.a().a(this.c, aq.b, l);
      return;
    }
    this.c.a(paramInt);
  }

  public void a(JSONObject paramJSONObject, int paramInt)
  {
    aw.a(this.c, 0);
    this.c.a(paramJSONObject, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.ax
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
