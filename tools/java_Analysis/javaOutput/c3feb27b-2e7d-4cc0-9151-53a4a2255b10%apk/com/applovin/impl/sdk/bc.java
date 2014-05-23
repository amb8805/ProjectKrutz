package com.applovin.impl.sdk;

import android.content.Context;
import android.util.Base64;
import com.applovin.sdk.AppLovinLogger;
import org.json.JSONException;
import org.json.JSONObject;

class bc extends ar
{
  bc(AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    super("UploadAppIcon", paramAppLovinSdkImpl);
  }

  private String a(byte[] paramArrayOfByte)
  {
    return new String(Base64.encode(paramArrayOfByte, 0));
  }

  protected void b()
  {
  }

  protected void c()
  {
  }

  public void run()
  {
    byte[] arrayOfByte = f().e();
    if (arrayOfByte != null);
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("icon", a(arrayOfByte));
      localJSONObject.put("icon_type", "image/jpeg");
      localJSONObject.put("package_name", this.e.getApplicationContext().getPackageName());
      StringBuffer localStringBuffer = new StringBuffer("app");
      localStringBuffer.append((char)'/');
      localStringBuffer.append((String)this.e.a(z.e));
      String str = m.a(localStringBuffer.toString(), this.e);
      this.e.getConnectionManager().a(str, localJSONObject, new bd(this));
      return;
    }
    catch (JSONException localJSONException)
    {
      this.f.e(this.d, "Unable to create icon JSON request", localJSONException);
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.bc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
