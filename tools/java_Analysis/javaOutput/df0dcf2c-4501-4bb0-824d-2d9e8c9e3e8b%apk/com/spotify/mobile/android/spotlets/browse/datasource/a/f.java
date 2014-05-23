package com.spotify.mobile.android.spotlets.browse.datasource.a;

import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import com.spotify.mobile.android.spotlets.browse.datasource.a;
import com.spotify.mobile.android.spotlets.browse.model.Artist;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f extends e<Artist>
{
  public f(a<Artist> parama, String paramString)
  {
    super(parama, paramString, RequestType.f);
  }

  public final String a()
  {
    return "/v3/space/trending-artists";
  }

  public final List<Artist> a(JSONObject paramJSONObject)
  {
    JSONArray localJSONArray = paramJSONObject.getJSONArray("items");
    ArrayList localArrayList = new ArrayList(localJSONArray.length());
    for (int i = 0; i < localJSONArray.length(); i++)
    {
      JSONObject localJSONObject = localJSONArray.getJSONObject(i).getJSONObject("artist");
      localArrayList.add(new Artist(localJSONObject.optString("name", ""), localJSONObject.optString("imageUrl", ""), localJSONObject.optString("uri", "")));
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.datasource.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
