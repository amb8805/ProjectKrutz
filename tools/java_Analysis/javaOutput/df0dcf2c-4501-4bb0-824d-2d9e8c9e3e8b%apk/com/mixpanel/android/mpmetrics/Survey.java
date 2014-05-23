package com.mixpanel.android.mpmetrics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class Survey
{
  private final JSONObject a;
  private final int b;
  private final int c;
  private final List<w> d;

  Survey(JSONObject paramJSONObject)
  {
    JSONArray localJSONArray;
    try
    {
      this.a = paramJSONObject;
      this.b = paramJSONObject.getInt("id");
      this.c = paramJSONObject.getJSONArray("collections").getJSONObject(0).getInt("id");
      localJSONArray = paramJSONObject.getJSONArray("questions");
      if (localJSONArray.length() == 0)
        throw new Survey.BadSurveyException("Survey has no questions.");
    }
    catch (JSONException localJSONException)
    {
      throw new Survey.BadSurveyException("Survey JSON was unexpected or bad", localJSONException);
    }
    ArrayList localArrayList = new ArrayList(localJSONArray.length());
    while (i < localJSONArray.length())
    {
      localArrayList.add(new w(this, localJSONArray.getJSONObject(i), (byte)0));
      i++;
    }
    this.d = Collections.unmodifiableList(localArrayList);
  }

  final String a()
  {
    return this.a.toString();
  }

  public final int b()
  {
    return this.b;
  }

  public final int c()
  {
    return this.c;
  }

  public final List<w> d()
  {
    return this.d;
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.Survey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
