package com.spotify.mobile.android.model;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.am;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cc;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Story
  implements Parcelable
{
  public static final Parcelable.Creator<Story> CREATOR = new Story.1();
  public static final String[] a = { "_id", "story_id", "story_type", "recommended_item", "hero_images", "metadata_type", "title", "external_url", "reason", "summary", "auxiliary_image", "date_published", "hermes_status_code" };
  private long b = -1L;
  private String c;
  private int d;
  private SpotifyLink e;
  private String f;
  private String g;
  private String h;
  private String i;
  private SpotifyLink j;
  private String k;
  private SpotifyLink l;
  private int m;
  private String n;
  private String o;
  private List<String> p = new LinkedList();
  private String q;
  private boolean r;
  private int s;
  private String t;
  private long u = -1L;
  private TreeMap<Integer, String> v;

  public Story()
  {
  }

  public static Story a(Cursor paramCursor)
  {
    Story localStory = new Story();
    localStory.u = paramCursor.getLong(12);
    if (localStory.u > 0L)
      return localStory;
    localStory.b = paramCursor.getLong(0);
    localStory.c = paramCursor.getString(1);
    localStory.d = paramCursor.getInt(2);
    localStory.m = paramCursor.getInt(5);
    TreeMap localTreeMap = a(am.a(paramCursor, 4, ""));
    localStory.v = localTreeMap;
    if (!localTreeMap.isEmpty())
      localStory.e(b(localTreeMap));
    localStory.n = am.b(paramCursor, 9, "");
    JSONArray localJSONArray1 = new JSONArray(am.a(paramCursor, 3, ""));
    JSONObject localJSONObject1 = localJSONArray1.getJSONObject(0);
    localStory.f = localJSONObject1.optString("display_name");
    localStory.e = new SpotifyLink(localJSONObject1.optString("uri"));
    JSONObject localJSONObject2 = localJSONArray1.optJSONObject(1);
    if (localJSONObject2 != null)
    {
      localStory.i = localJSONObject2.optString("display_name");
      localStory.j = new SpotifyLink(localJSONObject2.optString("uri"));
    }
    JSONObject localJSONObject3 = localJSONArray1.optJSONObject(2);
    if (localJSONObject3 != null)
    {
      localStory.k = localJSONObject3.optString("display_name");
      localStory.l = new SpotifyLink(localJSONObject3.optString("uri"));
    }
    JSONArray localJSONArray2 = localJSONObject1.optJSONArray("previews");
    if (localJSONArray2 != null)
      for (int i2 = 0; i2 < localJSONArray2.length(); i2++)
      {
        String str4 = localJSONArray2.optString(i2);
        if (!"".equals(str4))
          localStory.p.add(str4);
      }
    localStory.q = m(am.a(paramCursor, 10, ""));
    JSONObject localJSONObject4 = new JSONObject(am.a(paramCursor, 8, ""));
    String str1 = localJSONObject4.optString("format_string");
    JSONArray localJSONArray3 = localJSONObject4.optJSONArray("fields");
    if (localJSONArray3 != null)
    {
      str2 = str1;
      for (int i1 = 0; i1 < localJSONArray3.length(); i1++)
      {
        String str3 = "\\{" + i1 + "\\}";
        JSONObject localJSONObject5 = localJSONArray3.optJSONObject(i1);
        cc.a(localJSONObject5);
        StringBuilder localStringBuilder = new StringBuilder(localJSONObject5.optString("text"));
        if (localJSONObject5.optBoolean("bold"))
        {
          localStringBuilder.insert(0, "<b>");
          localStringBuilder.append("</b>");
        }
        if (localJSONObject5.optBoolean("italic"))
        {
          localStringBuilder.insert(0, "<i>");
          localStringBuilder.append("</i>");
        }
        if (localJSONObject5.optBoolean("underline"))
        {
          localStringBuilder.insert(0, "<u>");
          localStringBuilder.append("</u>");
        }
        localStringBuilder.insert(0, "<a href='" + localJSONObject5.optString("uri") + "'>");
        localStringBuilder.append("</a>");
        str2 = str2.replaceAll(str3, Matcher.quoteReplacement(localStringBuilder.toString()));
      }
    }
    String str2 = str1;
    localStory.o = str2;
    localStory.t = paramCursor.getString(7);
    localStory.s = paramCursor.getInt(11);
    return localStory;
  }

  static TreeMap<Integer, String> a(String paramString)
  {
    TreeMap localTreeMap = new TreeMap();
    if (!TextUtils.isEmpty(paramString))
      try
      {
        JSONArray localJSONArray = new JSONArray(paramString);
        for (int i1 = 0; i1 < localJSONArray.length(); i1++)
        {
          JSONObject localJSONObject = localJSONArray.getJSONObject(i1);
          localTreeMap.put(Integer.valueOf(localJSONObject.getInt("width")), localJSONObject.getString("uri"));
        }
      }
      catch (JSONException localJSONException)
      {
        Assertion.a("Failed parsing Json for Discover story hero image", localJSONException);
      }
    return localTreeMap;
  }

  private static String b(TreeMap<Integer, String> paramTreeMap)
  {
    try
    {
      String str = (String)paramTreeMap.get(paramTreeMap.lastKey());
      return str;
    }
    catch (NoSuchElementException localNoSuchElementException)
    {
      Assertion.a("Discover story: hero images map should not be empty", localNoSuchElementException);
    }
    return null;
  }

  private static String c(TreeMap<Integer, String> paramTreeMap)
  {
    try
    {
      String str = (String)paramTreeMap.get(paramTreeMap.firstKey());
      return str;
    }
    catch (NoSuchElementException localNoSuchElementException)
    {
      Assertion.a("Discover story: hero images map should not be empty", localNoSuchElementException);
    }
    return null;
  }

  private static String d(SpotifyLink paramSpotifyLink)
  {
    if (paramSpotifyLink != null)
      return paramSpotifyLink.d();
    return "";
  }

  static SpotifyLink l(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString)))
      return null;
    return new SpotifyLink(paramString);
  }

  private static String m(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return "";
      try
      {
        JSONArray localJSONArray = new JSONArray(paramString);
        if (localJSONArray.length() != 0)
        {
          String str = localJSONArray.getJSONObject(0).getString("uri");
          return str;
        }
      }
      catch (JSONException localJSONException)
      {
        bp.b(localJSONException, "A problem parsing image uris from json. Malformed document?");
      }
    }
    return "";
  }

  public final long a()
  {
    return this.u;
  }

  public final void a(int paramInt)
  {
    this.m = paramInt;
  }

  public final void a(long paramLong)
  {
    this.b = paramLong;
  }

  public final void a(SpotifyLink paramSpotifyLink)
  {
    this.e = paramSpotifyLink;
  }

  public final void a(List<String> paramList)
  {
    this.p = paramList;
  }

  public final void a(TreeMap<Integer, String> paramTreeMap)
  {
    this.v = paramTreeMap;
  }

  public final boolean a(boolean paramBoolean)
  {
    if (paramBoolean != this.r);
    for (boolean bool = true; ; bool = false)
    {
      this.r = paramBoolean;
      return bool;
    }
  }

  public final int b()
  {
    return this.m;
  }

  public final void b(int paramInt)
  {
    this.d = paramInt;
  }

  public final void b(SpotifyLink paramSpotifyLink)
  {
    this.j = paramSpotifyLink;
  }

  public final void b(String paramString)
  {
    this.c = paramString;
  }

  public final String c()
  {
    return this.g;
  }

  public final void c(SpotifyLink paramSpotifyLink)
  {
    this.l = paramSpotifyLink;
  }

  public final void c(String paramString)
  {
    this.f = paramString;
  }

  public final boolean c(int paramInt)
  {
    if (paramInt < 0)
      Assertion.a("Discover story: suggestedWidth cannot be negative");
    while ((this.v == null) || (this.v.isEmpty()))
      return false;
    TreeMap localTreeMap = this.v;
    String str;
    if (localTreeMap.isEmpty())
      str = null;
    while (true)
    {
      return e(str);
      if (paramInt == 0)
      {
        str = c(localTreeMap);
      }
      else
      {
        int i1 = ((Integer)localTreeMap.lastKey()).intValue();
        ((Integer)localTreeMap.firstKey()).intValue();
        SortedMap localSortedMap1 = localTreeMap.tailMap(Integer.valueOf(paramInt));
        if (!localSortedMap1.isEmpty())
          i1 = ((Integer)localSortedMap1.firstKey()).intValue();
        SortedMap localSortedMap2 = localTreeMap.headMap(Integer.valueOf(paramInt));
        if (!localSortedMap2.isEmpty())
          ((Integer)localSortedMap2.lastKey()).intValue();
        str = (String)localTreeMap.get(Integer.valueOf(i1));
      }
    }
  }

  public final long d()
  {
    return this.b;
  }

  public final void d(int paramInt)
  {
    this.s = paramInt;
  }

  public final void d(String paramString)
  {
    this.i = paramString;
  }

  public int describeContents()
  {
    return 0;
  }

  public final String e()
  {
    return this.c;
  }

  public final boolean e(String paramString)
  {
    if ((this.g == null) || (!this.g.equals(paramString)));
    for (boolean bool = true; ; bool = false)
    {
      this.g = paramString;
      return bool;
    }
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    Story localStory;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
        return false;
      localStory = (Story)paramObject;
      if (this.b != localStory.b)
        return false;
    }
    while (this.c.equals(localStory.c));
    return false;
  }

  public final int f()
  {
    return this.d;
  }

  public final void f(String paramString)
  {
    this.h = paramString;
  }

  public final SpotifyLink g()
  {
    return this.e;
  }

  public final void g(String paramString)
  {
    this.q = paramString;
  }

  public final String h()
  {
    return this.f;
  }

  public final void h(String paramString)
  {
    this.n = paramString;
  }

  public int hashCode()
  {
    return 31 * (int)(this.b ^ this.b >>> 32) + this.c.hashCode();
  }

  public final String i()
  {
    return this.i;
  }

  public final void i(String paramString)
  {
    this.k = paramString;
  }

  public final SpotifyLink j()
  {
    return this.j;
  }

  public final void j(String paramString)
  {
    this.o = paramString;
  }

  public final String k()
  {
    return this.h;
  }

  public final void k(String paramString)
  {
    this.t = paramString;
  }

  public final String l()
  {
    return this.q;
  }

  public final String m()
  {
    return this.n;
  }

  public final String n()
  {
    return this.k;
  }

  public final String o()
  {
    return this.o;
  }

  public final List<String> p()
  {
    return this.p;
  }

  public final boolean q()
  {
    return this.r;
  }

  public final boolean r()
  {
    if ((this.v != null) && (!this.v.isEmpty()))
      return e(b(this.v));
    return false;
  }

  public final long s()
  {
    return 1000L * this.s;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeString(d(this.e));
    paramParcel.writeString(this.f);
    paramParcel.writeString(this.g);
    paramParcel.writeString(this.h);
    paramParcel.writeString(this.i);
    paramParcel.writeString(d(this.j));
    paramParcel.writeString(this.k);
    paramParcel.writeString(d(this.l));
    paramParcel.writeInt(this.m);
    paramParcel.writeString(this.n);
    paramParcel.writeString(this.o);
    paramParcel.writeStringList(this.p);
    paramParcel.writeString(this.q);
    paramParcel.writeString(this.t);
    paramParcel.writeInt(this.s);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.model.Story
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
