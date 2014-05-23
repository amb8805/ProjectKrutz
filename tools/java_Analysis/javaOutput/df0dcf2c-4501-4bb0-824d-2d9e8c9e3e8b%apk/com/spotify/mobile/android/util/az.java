package com.spotify.mobile.android.util;

import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.Flag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class az extends t
{
  public az()
  {
  }

  public final String a()
  {
    return "Feature flags";
  }

  public final String b()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = FeatureFragment.b().iterator();
    while (localIterator1.hasNext())
    {
      Flag localFlag = (Flag)localIterator1.next();
      StringBuilder localStringBuilder2 = new StringBuilder();
      String str = cq.a(localFlag.d());
      localArrayList.add(new StringBuilder().append(str).append(": ").append(localFlag.h()).toString() + '\n');
    }
    Collections.sort(localArrayList);
    StringBuilder localStringBuilder1 = new StringBuilder();
    Iterator localIterator2 = localArrayList.iterator();
    while (localIterator2.hasNext())
      localStringBuilder1.append((String)localIterator2.next());
    return localStringBuilder1.toString();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.az
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
