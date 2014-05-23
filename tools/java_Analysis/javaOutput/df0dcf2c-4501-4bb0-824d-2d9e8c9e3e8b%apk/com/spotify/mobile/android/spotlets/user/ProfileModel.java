package com.spotify.mobile.android.spotlets.user;

import android.net.Uri;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.smash.util.JacksonModel;
import com.spotify.mobile.android.spotlets.follow.a;
import com.spotify.mobile.android.util.Assertion;
import java.util.Locale;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ProfileModel
  implements JacksonModel
{
  private final a mFollowData;
  private final String mFullName;
  private final String mImageUrl;
  private final int mPlaylistCount;
  private final PlaylistListModel mPlaylistList;
  private final TopArtistsListModel mTopArtistsList;
  private final String mUri;
  private final String mUsername;

  public ProfileModel(@JsonProperty("uri") String paramString1, @JsonProperty("full_name") String paramString2, @JsonProperty("total_playlist_count") int paramInt1, @JsonProperty("followers_count") int paramInt2, @JsonProperty("following_count") int paramInt3, @JsonProperty("image_url") String paramString3, @JsonProperty("is_following") boolean paramBoolean, @JsonProperty("user_uri") String paramString4, @JsonProperty("artist_uri") String paramString5, @JsonProperty("playlists") PlaylistModel[] paramArrayOfPlaylistModel, @JsonProperty("most_played_artists") TopArtistModel[] paramArrayOfTopArtistModel)
  {
    if (paramString1 != null)
      this.mUri = paramString1;
    while (true)
    {
      this.mUsername = Uri.decode(d.c(this.mUri));
      this.mFullName = paramString2;
      this.mPlaylistCount = paramInt1;
      this.mImageUrl = paramString3;
      this.mFollowData = new a(this.mUri, paramInt2, paramInt3, paramBoolean);
      this.mPlaylistList = new PlaylistListModel(paramArrayOfPlaylistModel);
      this.mTopArtistsList = new TopArtistsListModel(paramArrayOfTopArtistModel);
      return;
      if (paramString4 != null)
      {
        this.mUri = paramString4;
      }
      else if (paramString5 != null)
      {
        this.mUri = paramString5;
      }
      else
      {
        Assertion.a("A ProfileModel must have a uri");
        this.mUri = null;
      }
    }
  }

  public String getDisplayName()
  {
    return this.mFullName;
  }

  public a getFollowData()
  {
    return this.mFollowData;
  }

  public String getImageHttpUrl()
  {
    return this.mImageUrl;
  }

  public int getPlaylistCount()
  {
    return this.mPlaylistCount;
  }

  public PlaylistListModel getPlaylistList()
  {
    return this.mPlaylistList;
  }

  public TopArtistsListModel getTopArtistsList()
  {
    return this.mTopArtistsList;
  }

  public String getUri()
  {
    return this.mUri;
  }

  public String getUsername()
  {
    return this.mUsername;
  }

  public String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this.mUri;
    arrayOfObject[1] = this.mUsername;
    arrayOfObject[2] = this.mFullName;
    arrayOfObject[3] = Integer.valueOf(this.mPlaylistCount);
    arrayOfObject[4] = this.mImageUrl;
    arrayOfObject[5] = this.mFollowData;
    return String.format(localLocale, "uri: %s  username: %s  fullname: %s  playlistCount: %s, imageUrl: %s  followData: %s", arrayOfObject);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.user.ProfileModel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
