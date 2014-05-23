package com.spotify.mobile.android.spotlets.browse.datasource.a;

import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import com.spotify.mobile.android.spotlets.browse.datasource.a;
import com.spotify.mobile.android.spotlets.browse.model.NewRelease;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c extends e<NewRelease>
{
  public c(a<NewRelease> parama, String paramString)
  {
    super(parama, paramString, RequestType.e);
  }

  public final String a()
  {
    return "/v3/space/new-releases";
  }

  public final List<NewRelease> a(JSONObject paramJSONObject)
  {
    ArrayList localArrayList = new ArrayList();
    JSONArray localJSONArray = paramJSONObject.getJSONArray("items");
    for (int i = 0; i < localJSONArray.length(); i++)
    {
      JSONObject localJSONObject = localJSONArray.getJSONObject(i).getJSONObject("release");
      localArrayList.add(new NewRelease(localJSONObject.optString("albumName", ""), localJSONObject.optString("uri", ""), localJSONObject.optString("image", ""), localJSONObject.optString("artistName", "")));
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.datasource.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
