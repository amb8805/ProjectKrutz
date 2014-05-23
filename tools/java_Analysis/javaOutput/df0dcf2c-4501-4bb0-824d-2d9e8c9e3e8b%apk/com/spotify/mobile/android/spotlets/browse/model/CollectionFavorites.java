package com.spotify.mobile.android.spotlets.browse.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.smash.util.JacksonModel;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CollectionFavorites
  implements JacksonModel
{
  private List<CollectionFavorite> mFavorites = new ArrayList();

  @JsonCreator
  public CollectionFavorites(@JsonProperty("favorites") CollectionFavorite[] paramArrayOfCollectionFavorite)
  {
    int i = paramArrayOfCollectionFavorite.length;
    for (int j = 0; j < i; j++)
    {
      CollectionFavorite localCollectionFavorite = paramArrayOfCollectionFavorite[j];
      this.mFavorites.add(localCollectionFavorite);
    }
  }

  public List<CollectionFavorite> getFavorites()
  {
    return this.mFavorites;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.model.CollectionFavorites
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
