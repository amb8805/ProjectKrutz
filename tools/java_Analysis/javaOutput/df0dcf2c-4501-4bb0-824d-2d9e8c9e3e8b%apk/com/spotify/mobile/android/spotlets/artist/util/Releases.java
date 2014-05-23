package com.spotify.mobile.android.spotlets.artist.util;

import com.google.common.collect.h;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release;
import com.spotify.mobile.android.util.cv;
import java.util.ArrayList;
import java.util.List;

public final class Releases
{
  public static final List<cv> a;
  public static final cv b;
  private static b c = new b((byte)0);
  private static final com.google.common.base.b<ArtistModel.Release, String> d = new Releases.1();
  private static final com.google.common.base.b<ArtistModel.Release, Integer> e = new Releases.2();

  static
  {
    b = new cv(Releases.SortOrder.c.toString(), 2131690299, false);
    ArrayList localArrayList = new ArrayList();
    a = localArrayList;
    localArrayList.add(new cv(Releases.SortOrder.a.toString(), 2131690296));
    a.add(new cv(Releases.SortOrder.b.toString(), 2131690294));
    a.add(b);
  }

  public static List<ArtistModel.Release> a(List<ArtistModel.Release> paramList, cv paramcv, String paramString)
  {
    c.a(paramString);
    return Releases.SortOrder.valueOf(paramcv.a()).a(h.b(paramList, c), paramcv.e());
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.util.Releases
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
