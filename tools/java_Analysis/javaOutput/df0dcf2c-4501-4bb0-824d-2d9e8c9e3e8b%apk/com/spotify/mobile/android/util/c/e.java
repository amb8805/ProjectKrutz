package com.spotify.mobile.android.util.c;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.ui.activity.ShowcaseActivity;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cx;
import com.spotify.mobile.android.util.cy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

public final class e
{
  private static final cy b = cy.a("displayed_showcases");
  private cw a;
  private final Context c;
  private a d;

  public e(Context paramContext)
  {
    this.c = paramContext;
    this.a = cw.a(paramContext);
    this.d = new a();
  }

  private Set<String> d()
  {
    Object localObject = new HashSet();
    try
    {
      JSONArray localJSONArray = this.a.a(b, new JSONArray());
      for (int i = 0; i < localJSONArray.length(); i++)
        ((Set)localObject).add(localJSONArray.getString(i));
    }
    catch (JSONException localJSONException)
    {
      bp.a(localJSONException, "Displayed ids of showcases couldn't be deserialized");
      localObject = Collections.emptySet();
    }
    return localObject;
  }

  public final List<b> a()
  {
    Set localSet = d();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.d.a().iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if ((!localSet.contains(localb.a())) && (localb.b()))
        localArrayList.add(localb);
    }
    return localArrayList;
  }

  public final void a(Collection<b> paramCollection)
  {
    HashSet localHashSet = new HashSet(d());
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator1 = paramCollection.iterator();
    while (localIterator1.hasNext())
      localHashSet.add(((b)localIterator1.next()).a());
    Iterator localIterator2 = localHashSet.iterator();
    while (localIterator2.hasNext())
      localJSONArray.put((String)localIterator2.next());
    this.a.a().a(b, localJSONArray).b();
  }

  public final void b()
  {
    if (a().isEmpty())
      return;
    Intent localIntent = new Intent(this.c, ShowcaseActivity.class);
    this.c.startActivity(localIntent);
  }

  public final void c()
  {
    this.a.b(b, "[]");
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.c.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
