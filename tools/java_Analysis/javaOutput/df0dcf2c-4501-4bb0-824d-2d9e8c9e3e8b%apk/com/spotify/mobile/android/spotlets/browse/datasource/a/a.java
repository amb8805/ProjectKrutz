package com.spotify.mobile.android.spotlets.browse.datasource.a;

import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a extends e<Playlist>
{
  public a(com.spotify.mobile.android.spotlets.browse.datasource.a<Playlist> parama, String paramString)
  {
    super(parama, paramString, RequestType.a);
  }

  public final String a()
  {
    return "/v3/space/featured-playlists";
  }

  public final List<Playlist> a(JSONObject paramJSONObject)
  {
    ArrayList localArrayList = new ArrayList();
    JSONArray localJSONArray = paramJSONObject.getJSONArray("items");
    for (int i = 0; i < localJSONArray.length(); i++)
    {
      JSONObject localJSONObject = localJSONArray.getJSONObject(i).getJSONObject("playlist");
      localArrayList.add(new Playlist(localJSONObject.optString("subGenreTemplate", ""), localJSONObject.optString("title", ""), localJSONObject.optString("uri", ""), localJSONObject.optString("image", ""), localJSONObject.optInt("numSubscribers", 0)));
    }
    return localArrayList;
  }

  public final Map b(JSONObject paramJSONObject)
  {
    HashMap localHashMap = new HashMap();
    if (paramJSONObject.has("label"))
      localHashMap.put("label", paramJSONObject.getString("label"));
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.datasource.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
