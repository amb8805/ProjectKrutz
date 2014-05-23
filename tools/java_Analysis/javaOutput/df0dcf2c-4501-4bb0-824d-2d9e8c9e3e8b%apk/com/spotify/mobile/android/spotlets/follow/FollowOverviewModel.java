package com.spotify.mobile.android.spotlets.follow;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.smash.util.JacksonModel;
import com.spotify.mobile.android.spotlets.user.ProfileModel;

@JsonIgnoreProperties(ignoreUnknown=true)
public class FollowOverviewModel
  implements JacksonModel
{
  private ProfileModel[] mFacebookFriends;
  private ProfileModel[] mMostPlayedArtists;
  private ProfileModel[] mWhoToFollow;

  public FollowOverviewModel()
  {
  }

  public FollowOverviewModel(ProfileModel[] paramArrayOfProfileModel1, ProfileModel[] paramArrayOfProfileModel2, ProfileModel[] paramArrayOfProfileModel3)
  {
    this.mFacebookFriends = paramArrayOfProfileModel1;
    this.mMostPlayedArtists = paramArrayOfProfileModel2;
    this.mWhoToFollow = paramArrayOfProfileModel3;
  }

  @JsonProperty("facebook_friends")
  public ProfileModel[] getFacebookFriends()
  {
    return this.mFacebookFriends;
  }

  @JsonProperty("most_played_artists")
  public ProfileModel[] getMostPlayedArtists()
  {
    return this.mMostPlayedArtists;
  }

  @JsonProperty("who_to_follow")
  public ProfileModel[] getWhoToFollow()
  {
    return this.mWhoToFollow;
  }

  public void setFacebookFriends(ProfileModel[] paramArrayOfProfileModel)
  {
    this.mFacebookFriends = paramArrayOfProfileModel;
  }

  public void setMostPlayedArtists(ProfileModel[] paramArrayOfProfileModel)
  {
    this.mMostPlayedArtists = paramArrayOfProfileModel;
  }

  public void setWhoToFollow(ProfileModel[] paramArrayOfProfileModel)
  {
    this.mWhoToFollow = paramArrayOfProfileModel;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.follow.FollowOverviewModel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
