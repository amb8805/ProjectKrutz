package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.g;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.util.a;
import com.google.ads.util.b;

public class CustomEventAdapter
  implements MediationBannerAdapter<CustomEventExtras, CustomEventServerParameters>, MediationInterstitialAdapter<CustomEventExtras, CustomEventServerParameters>
{
  private String a;
  private CustomEventBanner b = null;
  private CustomEventAdapter.a c = null;
  private CustomEventInterstitial d = null;

  public CustomEventAdapter()
  {
  }

  private <T> T a(String paramString1, Class<T> paramClass, String paramString2)
  {
    try
    {
      Object localObject = g.a(paramString1, paramClass);
      return localObject;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      a("Make sure you created a visible class named: " + paramString1 + ". ", localClassNotFoundException);
      return null;
    }
    catch (ClassCastException localClassCastException)
    {
      while (true)
        a("Make sure your custom event implements the " + paramClass.getName() + " interface.", localClassCastException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      while (true)
        a("Make sure the default constructor for class " + paramString1 + " is visible. ", localIllegalAccessException);
    }
    catch (InstantiationException localInstantiationException)
    {
      while (true)
        a("Make sure the name " + paramString1 + " does not denote an abstract class or an interface.", localInstantiationException);
    }
    catch (Throwable localThrowable)
    {
      while (true)
        a("", localThrowable);
    }
  }

  private void a(String paramString, Throwable paramThrowable)
  {
    b.b("Error during processing of custom event with label: '" + this.a + "'. Skipping custom event. " + paramString, paramThrowable);
  }

  public void destroy()
  {
    if (this.b != null)
      this.b.destroy();
    if (this.d != null)
      this.d.destroy();
  }

  public Class<CustomEventExtras> getAdditionalParametersType()
  {
    return CustomEventExtras.class;
  }

  public View getBannerView()
  {
    a.b(this.c);
    return this.c.a();
  }

  public Class<CustomEventServerParameters> getServerParametersType()
  {
    return CustomEventServerParameters.class;
  }

  public void requestBannerAd(MediationBannerListener paramMediationBannerListener, Activity paramActivity, CustomEventServerParameters paramCustomEventServerParameters, AdSize paramAdSize, MediationAdRequest paramMediationAdRequest, CustomEventExtras paramCustomEventExtras)
  {
    a.a(this.a);
    this.a = paramCustomEventServerParameters.label;
    String str1 = paramCustomEventServerParameters.className;
    String str2 = paramCustomEventServerParameters.parameter;
    this.b = ((CustomEventBanner)a(str1, CustomEventBanner.class, this.a));
    if (this.b == null)
    {
      paramMediationBannerListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
      return;
    }
    a.a(this.c);
    this.c = new CustomEventAdapter.a(this, paramMediationBannerListener);
    try
    {
      CustomEventBanner localCustomEventBanner = this.b;
      CustomEventAdapter.a locala = this.c;
      String str3 = this.a;
      if (paramCustomEventExtras == null)
      {
        localObject2 = null;
        localCustomEventBanner.requestBannerAd(locala, paramActivity, str3, str2, paramAdSize, paramMediationAdRequest, localObject2);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      a("", localThrowable);
      paramMediationBannerListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
      return;
    }
    while (true)
    {
      Object localObject1 = paramCustomEventExtras.getExtra(this.a);
      Object localObject2 = localObject1;
    }
  }

  public void requestInterstitialAd(MediationInterstitialListener paramMediationInterstitialListener, Activity paramActivity, CustomEventServerParameters paramCustomEventServerParameters, MediationAdRequest paramMediationAdRequest, CustomEventExtras paramCustomEventExtras)
  {
    a.a(this.a);
    this.a = paramCustomEventServerParameters.label;
    String str1 = paramCustomEventServerParameters.className;
    String str2 = paramCustomEventServerParameters.parameter;
    this.d = ((CustomEventInterstitial)a(str1, CustomEventInterstitial.class, this.a));
    if (this.d == null)
    {
      paramMediationInterstitialListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
      return;
    }
    try
    {
      CustomEventInterstitial localCustomEventInterstitial = this.d;
      CustomEventAdapter.b localb = new CustomEventAdapter.b(this, paramMediationInterstitialListener);
      String str3 = this.a;
      if (paramCustomEventExtras == null)
      {
        localObject2 = null;
        localCustomEventInterstitial.requestInterstitialAd(localb, paramActivity, str3, str2, paramMediationAdRequest, localObject2);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      a("", localThrowable);
      paramMediationInterstitialListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
      return;
    }
    while (true)
    {
      Object localObject1 = paramCustomEventExtras.getExtra(this.a);
      Object localObject2 = localObject1;
    }
  }

  public void showInterstitial()
  {
    a.b(this.d);
    try
    {
      this.d.showInterstitial();
      return;
    }
    catch (Throwable localThrowable)
    {
      b.b("Exception when showing custom event labeled '" + this.a + "'.", localThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.mediation.customevent.CustomEventAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
