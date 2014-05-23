package com.spotify.mobile.android.spotlets.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.smash.util.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ProfileListModel
  implements JacksonModel
{
  private final ProfileModel[] mProfiles;

  public ProfileListModel(@JsonProperty("small_profiles") ProfileModel[] paramArrayOfProfileModel1, @JsonProperty("most_played_artists") ProfileModel[] paramArrayOfProfileModel2, @JsonProperty("facebook_friends") ProfileModel[] paramArrayOfProfileModel3)
  {
    if (paramArrayOfProfileModel1 != null);
    while (true)
    {
      this.mProfiles = paramArrayOfProfileModel1;
      return;
      if (paramArrayOfProfileModel2 != null)
        paramArrayOfProfileModel1 = paramArrayOfProfileModel2;
      else
        paramArrayOfProfileModel1 = paramArrayOfProfileModel3;
    }
  }

  public ProfileModel[] getProfiles()
  {
    return this.mProfiles;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.user.ProfileListModel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
