package com.spotify.mobile.android.spotlets.search.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.smash.util.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public final class SearchResults
  implements JacksonModel
{
  public static final SearchResults NO_RESULTS = new SearchResults(null, null, null, null, null, null, null);
  public final SearchResults.ResultList<SearchResults.Album> albums;
  public final SearchResults.ResultList<SearchResults.Artist> artists;

  @JsonIgnoreProperties
  private final boolean mHasResults;
  public final SearchResults.ResultList<SearchResults.Playlist> playlists;
  public final SearchResults.ResultList<SearchResults.Profile> profiles;
  public final SearchResults.ResultType[] sortedCategory;
  public final SearchResults.ResultType topHit;
  public final SearchResults.ResultList<SearchResults.Track> tracks;

  private SearchResults(SearchResults.ResultList<SearchResults.Artist> paramResultList, SearchResults.ResultList<SearchResults.Album> paramResultList1, SearchResults.ResultList<SearchResults.Track> paramResultList2, SearchResults.ResultList<SearchResults.Playlist> paramResultList3, SearchResults.ResultList<SearchResults.Profile> paramResultList4, SearchResults.ResultType[] paramArrayOfResultType, SearchResults.ResultType paramResultType)
  {
    this.artists = paramResultList;
    this.albums = paramResultList1;
    this.tracks = paramResultList2;
    this.playlists = paramResultList3;
    this.profiles = paramResultList4;
    this.topHit = paramResultType;
    this.sortedCategory = paramArrayOfResultType;
    if ((!this.artists.results.isEmpty()) || (!this.tracks.results.isEmpty()) || (!this.albums.results.isEmpty()) || (!this.playlists.results.isEmpty()) || (!this.profiles.results.isEmpty()));
    for (boolean bool = true; ; bool = false)
    {
      this.mHasResults = bool;
      return;
    }
  }

  @JsonCreator
  SearchResults(@JsonProperty("artists") SearchResults.ResultList<SearchResults.Artist> paramResultList, @JsonProperty("albums") SearchResults.ResultList<SearchResults.Album> paramResultList1, @JsonProperty("tracks") SearchResults.ResultList<SearchResults.Track> paramResultList2, @JsonProperty("playlists") SearchResults.ResultList<SearchResults.Playlist> paramResultList3, @JsonProperty("profiles") SearchResults.ResultList<SearchResults.Profile> paramResultList4, @JsonProperty("sortedCategory") String[] paramArrayOfString, @JsonProperty("topHit") String paramString)
  {
  }

  public final SearchResults append(SearchResults paramSearchResults)
  {
    if (paramSearchResults == null)
      return this;
    return new SearchResults(this.artists.append(paramSearchResults.artists), this.albums.append(paramSearchResults.albums), this.tracks.append(paramSearchResults.tracks), this.playlists.append(paramSearchResults.playlists), this.profiles.append(paramSearchResults.profiles), paramSearchResults.sortedCategory, paramSearchResults.topHit);
  }

  public final boolean hasResults()
  {
    return this.mHasResults;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.model.SearchResults
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
