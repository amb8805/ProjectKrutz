package com.spotify.mobile.android.ui.fragments.logic;

import com.spotify.mobile.android.c.a;
import java.io.Serializable;
import java.util.IdentityHashMap;
import java.util.Map;

public class h
  implements a
{
  private final Map<Flag<? extends Serializable, ?>, Object> a = new IdentityHashMap(4);

  public h()
  {
  }

  final <T extends Serializable> T a(Flag<T, ?> paramFlag)
  {
    return (Serializable)this.a.get(paramFlag);
  }

  final boolean b(Flag<? extends Serializable, ?> paramFlag)
  {
    return this.a.containsKey(paramFlag);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.logic.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
