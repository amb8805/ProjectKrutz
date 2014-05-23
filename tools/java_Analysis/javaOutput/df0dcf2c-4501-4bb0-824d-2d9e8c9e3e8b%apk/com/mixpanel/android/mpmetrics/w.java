package com.mixpanel.android.mpmetrics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.List;;
import org.json.JSONArray;
import org.json.JSONObject;

public final class w
{
  private final int b;
  private final String c;
  private final String d;
  private final List<String> e;

  private w(Survey paramSurvey, JSONObject paramJSONObject)
  {
    this.b = paramJSONObject.getInt("id");
    this.c = paramJSONObject.getString("type").intern();
    this.d = paramJSONObject.getString("prompt");
    Object localObject = Collections.emptyList();
    if (paramJSONObject.has("extra_data"))
    {
      JSONObject localJSONObject = paramJSONObject.getJSONObject("extra_data");
      if (localJSONObject.has("$choices"))
      {
        JSONArray localJSONArray = localJSONObject.getJSONArray("$choices");
        ArrayList localArrayList = new ArrayList(localJSONArray.length());
        for (int i = 0; i < localJSONArray.length(); i++)
          localArrayList.add(localJSONArray.getString(i));
        localObject = localArrayList;
      }
    }
    this.e = Collections.unmodifiableList((List)localObject);
    if ((d() == Survey.QuestionType.b) && (this.e.size() == 0))
      throw new Survey.BadSurveyException("Question is multiple choice but has no answers:" + paramJSONObject.toString());
  }

  public final int a()
  {
    return this.b;
  }

  public final String b()
  {
    return this.d;
  }

  public final List<String> c()
  {
    return this.e;
  }

  public final Survey.QuestionType d()
  {
    if (Survey.QuestionType.b.toString().equals(this.c))
      return Survey.QuestionType.b;
    if (Survey.QuestionType.c.toString().equals(this.c))
      return Survey.QuestionType.c;
    return Survey.QuestionType.a;
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
