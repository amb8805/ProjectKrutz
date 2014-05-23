package com.applovin.impl.sdk;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.applovin.sdk.AppLovinLogger;

class az extends ar
{
  az(AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    super("TrackConversion", paramAppLovinSdkImpl);
  }

  private String a(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(m.b("conv", this.e));
    localStringBuffer.append("?");
    localStringBuffer.append("did=").append((String)this.e.a(z.c)).append("&");
    localStringBuffer.append("aid=").append(paramString);
    return localStringBuffer.toString();
  }

  protected String b()
  {
    return (String)this.e.a(z.d);
  }

  protected void c()
  {
    SharedPreferences.Editor localEditor = this.e.getSettingsManager().a().edit();
    localEditor.putBoolean("conversion_tracked", true);
    localEditor.commit();
  }

  public void run()
  {
    String str = b();
    this.f.d(this.d, "Tracking conversion for advertiser \"" + str + "\" and device \"" + (String)this.e.a(z.c) + "\"...");
    ba localba = new ba(this, "RepeatTrackConversion", z.j, this.e, str);
    localba.a(z.n);
    localba.run();
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.az
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
