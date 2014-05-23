package com.spotify.mobile.android.spotlets.browse.datasource.a;

import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import com.spotify.mobile.android.spotlets.browse.datasource.a;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d extends e<Playlist>
{
  private final String a;
  private final String b;

  public d(a<Playlist> parama, String paramString1, String paramString2, String paramString3, RequestType paramRequestType)
  {
    super(parama, paramString1, paramRequestType);
    this.a = paramString2;
    this.b = paramString3;
  }

  public final String a()
  {
    return "/v3/space/" + this.b;
  }

  public final List<Playlist> a(JSONObject paramJSONObject)
  {
    ArrayList localArrayList = new ArrayList();
    JSONArray localJSONArray = paramJSONObject.getJSONArray("items");
    for (int i = 0; i < localJSONArray.length(); i++)
    {
      JSONObject localJSONObject = localJSONArray.getJSONObject(i).getJSONObject("playlist");
      String str1 = localJSONObject.optString("title", "");
      String str2 = localJSONObject.optString("uri", "");
      String str3 = localJSONObject.optString("image", "");
      int j = localJSONObject.optInt("numSubscribers", 0);
      localArrayList.add(new Playlist(this.a, str1, str2, str3, j));
    }
    return localArrayList;
  }

  final Map<String, String> a(int paramInt1, int paramInt2)
  {
    Map localMap = super.a(paramInt1, paramInt2);
    if (!this.a.equals(this.b))
      localMap.put("filter", this.a);
    return localMap;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.datasource.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
