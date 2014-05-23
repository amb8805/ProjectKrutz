package com.spotify.mobile.android.spotlets.openaccess.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.smash.util.JacksonModel;

public class TopTracks
  implements Parcelable, JacksonModel
{
  public static final Parcelable.Creator<Track> CREATOR = new TopTracks.1();
  private final Track[] mTracks;

  protected TopTracks(Parcel paramParcel)
  {
    this.mTracks = new Track[0];
    paramParcel.readTypedArray(this.mTracks, Track.CREATOR);
  }

  @JsonCreator
  public TopTracks(@JsonProperty("tracks") Track[] paramArrayOfTrack)
  {
    this.mTracks = paramArrayOfTrack;
  }

  public int describeContents()
  {
    return 0;
  }

  public Track[] getTracks()
  {
    return this.mTracks;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeArray(this.mTracks);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.openaccess.model.TopTracks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
