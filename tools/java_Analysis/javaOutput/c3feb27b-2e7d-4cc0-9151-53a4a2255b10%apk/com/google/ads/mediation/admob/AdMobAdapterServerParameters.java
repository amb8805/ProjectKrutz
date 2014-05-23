package com.google.ads.mediation.admob;

import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.MediationServerParameters.Parameter;

public final class AdMobAdapterServerParameters extends MediationServerParameters
{

  @MediationServerParameters.Parameter(name="pubid")
  public String adUnitId;

  @MediationServerParameters.Parameter(name="mad_hac", required=false)
  public String allowHouseAds = null;

  public AdMobAdapterServerParameters()
  {
  }
}

/* Location:
 * Qualified Name:     com.google.ads.mediation.admob.AdMobAdapterServerParameters
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
