package com.spotify.mobile.android.spotlets.browse.datasource.a;

import android.content.res.Resources;
import android.text.TextUtils;
import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import com.spotify.mobile.android.spotlets.browse.datasource.a;
import com.spotify.mobile.android.spotlets.browse.model.Genre;
import com.spotify.mobile.android.spotlets.browse.util.d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b extends e<Genre>
{
  private Resources a;

  public b(a<Genre> parama, String paramString, Resources paramResources)
  {
    super(parama, paramString, RequestType.b);
    this.a = paramResources;
  }

  public final String a()
  {
    return "/v3/space/genres";
  }

  public final List<Genre> a(JSONObject paramJSONObject)
  {
    ArrayList localArrayList = new ArrayList();
    JSONArray localJSONArray1 = paramJSONObject.getJSONArray("items");
    int i = 0;
    JSONObject localJSONObject1;
    String str1;
    String str2;
    String str3;
    int j;
    int k;
    String str4;
    String str5;
    String str6;
    String str7;
    String str8;
    int m;
    int n;
    if (i < localJSONArray1.length())
    {
      localJSONObject1 = localJSONArray1.getJSONObject(i).getJSONObject("genre");
      str1 = localJSONObject1.getString("id");
      str2 = localJSONObject1.getString("templateName");
      str3 = localJSONObject1.getString("name");
      j = -1;
      k = -1;
      str4 = localJSONObject1.optString("iconUrl");
      str5 = localJSONObject1.optString("iconImageUrl");
      str6 = localJSONObject1.optString("moodImageUrl");
      Genre localGenre = d.a(str2, this.a, false);
      if (localGenre == null)
        break label358;
      if ((TextUtils.isEmpty(str3)) && (!TextUtils.isEmpty(localGenre.d())))
        str3 = localGenre.d();
      j = localGenre.f();
      k = localGenre.g();
      if ((TextUtils.isEmpty(str5)) && (!TextUtils.isEmpty(localGenre.i())))
        str5 = localGenre.i();
      if ((!TextUtils.isEmpty(str6)) || (TextUtils.isEmpty(localGenre.j())))
        break label358;
      str7 = localGenre.j();
      str8 = str5;
      m = k;
      n = j;
    }
    for (String str9 = str3; ; str9 = str3)
    {
      String str10 = localJSONObject1.optString("playlistUri");
      JSONArray localJSONArray2 = localJSONObject1.optJSONArray("subGenres");
      if (localJSONArray2 != null)
        for (int i1 = 0; ; i1++)
        {
          int i2 = localJSONArray2.length();
          if (i1 >= i2)
            break;
          JSONObject localJSONObject2 = localJSONArray2.getJSONObject(i1);
          localArrayList.add(new Genre(null, localJSONObject2.getString("key"), str2, localJSONObject2.getString("name"), -1, -1, null, null, null, null));
        }
      localArrayList.add(new Genre(str1, str2, null, str9, n, m, str4, str8, str7, str10));
      i++;
      break;
      return localArrayList;
      label358: str7 = str6;
      str8 = str5;
      m = k;
      n = j;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.datasource.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
