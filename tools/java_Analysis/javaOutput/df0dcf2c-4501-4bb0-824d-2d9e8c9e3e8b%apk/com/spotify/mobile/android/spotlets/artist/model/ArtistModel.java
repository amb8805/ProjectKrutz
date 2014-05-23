package com.spotify.mobile.android.spotlets.artist.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.cosmos.smash.util.JacksonModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ArtistModel
  implements Parcelable, JacksonModel
{
  public static final Parcelable.Creator<ArtistModel> CREATOR = new ArtistModel.1();
  public static final int TOP_TRACKS_LIMIT = 5;
  public final Optional<String> biography;
  public final ArtistModel.HeaderImage headerImage;
  public final ArtistModel.ArtistInfo info;
  public final Optional<ArtistModel.Release> latestRelease;
  public final List<ArtistModel.ArtistInfo> relatedArtists;
  public final ArtistModel.Releases releases;
  public final List<ArtistModel.Track> topTracks;
  public final List<ArtistModel.Concert> upcomingConcerts;
  public final String uri;

  private ArtistModel(Parcel paramParcel)
  {
    this.uri = paramParcel.readString();
    this.info = ((ArtistModel.ArtistInfo)paramParcel.readParcelable(ArtistModel.ArtistInfo.class.getClassLoader()));
    this.headerImage = ((ArtistModel.HeaderImage)paramParcel.readParcelable(ArtistModel.HeaderImage.class.getClassLoader()));
    this.topTracks = readImmutableList(paramParcel, ArtistModel.Track.CREATOR);
    this.upcomingConcerts = readImmutableList(paramParcel, ArtistModel.Concert.CREATOR);
    this.relatedArtists = readImmutableList(paramParcel, ArtistModel.ArtistInfo.CREATOR);
    this.biography = Optional.c(paramParcel.readString());
    this.releases = ((ArtistModel.Releases)paramParcel.readParcelable(ArtistModel.Releases.class.getClassLoader()));
    this.latestRelease = Optional.c((ArtistModel.Release)paramParcel.readParcelable(ArtistModel.Release.class.getClassLoader()));
  }

  @JsonCreator
  public ArtistModel(@JsonProperty("uri") String paramString, @JsonProperty("info") ArtistModel.ArtistInfo paramArtistInfo, @JsonProperty("header_image") ArtistModel.HeaderImage paramHeaderImage, @JsonProperty("top_tracks") LinkedHashMap<String, List<ArtistModel.Track>> paramLinkedHashMap, @JsonProperty("upcoming_concerts") LinkedHashMap<String, List<ArtistModel.Concert>> paramLinkedHashMap1, @JsonProperty("related_artists") LinkedHashMap<String, List<ArtistModel.ArtistInfo>> paramLinkedHashMap2, @JsonProperty("biography") LinkedHashMap<String, String> paramLinkedHashMap3, @JsonProperty("releases") ArtistModel.Releases paramReleases, @JsonProperty("latest_release") ArtistModel.Release paramRelease)
  {
    this.uri = paramString;
    this.info = paramArtistInfo;
    this.headerImage = paramHeaderImage;
    this.topTracks = readNullableList("tracks", paramLinkedHashMap);
    this.upcomingConcerts = readNullableList("concerts", paramLinkedHashMap1);
    this.relatedArtists = readNullableList("artists", paramLinkedHashMap2);
    if (paramLinkedHashMap3 == null);
    for (Object localObject = null; ; localObject = (String)paramLinkedHashMap3.get("text"))
    {
      this.biography = Optional.c(localObject);
      this.releases = paramReleases;
      this.latestRelease = Optional.c(paramRelease);
      return;
    }
  }

  private ArtistModel(String paramString, ArtistModel.ArtistInfo paramArtistInfo, ArtistModel.HeaderImage paramHeaderImage, List<ArtistModel.Track> paramList, List<ArtistModel.Concert> paramList1, List<ArtistModel.ArtistInfo> paramList2, Optional<String> paramOptional, ArtistModel.Releases paramReleases, Optional<ArtistModel.Release> paramOptional1)
  {
    this.uri = paramString;
    this.info = paramArtistInfo;
    this.headerImage = paramHeaderImage;
    this.topTracks = paramList;
    this.upcomingConcerts = paramList1;
    this.relatedArtists = paramList2;
    this.biography = paramOptional;
    this.releases = paramReleases;
    this.latestRelease = paramOptional1;
  }

  private Optional<ArtistModel.Track> findTopTrack(String paramString)
  {
    Optional localOptional = Optional.d();
    Iterator localIterator = this.topTracks.iterator();
    Object localObject1 = localOptional;
    ArtistModel.Track localTrack;
    if (localIterator.hasNext())
    {
      localTrack = (ArtistModel.Track)localIterator.next();
      if (!localTrack.uri.equals(paramString))
        break label66;
    }
    label66: for (Object localObject2 = Optional.b(localTrack); ; localObject2 = localObject1)
    {
      localObject1 = localObject2;
      break;
      return localObject1;
    }
  }

  private static <T> List<T> readImmutableList(Parcel paramParcel, Parcelable.Creator<T> paramCreator)
  {
    ArrayList localArrayList = new ArrayList();
    paramParcel.readTypedList(localArrayList, paramCreator);
    return ImmutableList.a(localArrayList);
  }

  private static <T> List<T> readNullableList(String paramString, LinkedHashMap<String, List<T>> paramLinkedHashMap)
  {
    if (paramLinkedHashMap == null)
      return ImmutableList.g();
    List localList = (List)paramLinkedHashMap.get(paramString);
    if (localList == null)
      return ImmutableList.g();
    return ImmutableList.a(localList);
  }

  private static <T> List<T> readNullableList(List<T> paramList)
  {
    if (paramList == null)
      return ImmutableList.g();
    return ImmutableList.a(paramList);
  }

  public int describeContents()
  {
    return 0;
  }

  public int findTopTrackIndex(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      int i = this.topTracks.size();
      for (int j = 0; j < i; j++)
        if (paramString.equals(((ArtistModel.Track)this.topTracks.get(j)).uri))
          return j;
    }
    return -1;
  }

  public ArtistModel.ReleaseList getReleases(ArtistModel.ReleaseType paramReleaseType)
  {
    switch (ArtistModel.2.a[paramReleaseType.ordinal()])
    {
    default:
      throw new IllegalArgumentException("Unknown release type: " + paramReleaseType);
    case 1:
      return this.releases.albums;
    case 2:
      return this.releases.singles;
    case 3:
      return this.releases.appearsOn;
    case 4:
    }
    return this.releases.compilations;
  }

  public boolean hasReleasesOfType(ArtistModel.ReleaseType paramReleaseType)
  {
    return !getReleases(paramReleaseType).releases.isEmpty();
  }

  public ArtistModel reorderTopTracks(List<i> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      Optional localOptional = findTopTrack(locali.a);
      if (localOptional.a())
        localArrayList.add(localOptional.b());
      else
        localArrayList.add(new ArtistModel.Track(locali.a, -1, locali.b));
    }
    return new ArtistModel(this.uri, this.info, this.headerImage, localArrayList, this.upcomingConcerts, this.relatedArtists, this.biography, this.releases, this.latestRelease);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.uri);
    paramParcel.writeParcelable(this.info, 0);
    paramParcel.writeParcelable(this.headerImage, 0);
    paramParcel.writeTypedList(this.topTracks);
    paramParcel.writeTypedList(this.upcomingConcerts);
    paramParcel.writeTypedList(this.relatedArtists);
    paramParcel.writeString((String)this.biography.c());
    paramParcel.writeParcelable(this.releases, 0);
    paramParcel.writeParcelable((JacksonModel)this.latestRelease.c(), 0);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.model.ArtistModel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
