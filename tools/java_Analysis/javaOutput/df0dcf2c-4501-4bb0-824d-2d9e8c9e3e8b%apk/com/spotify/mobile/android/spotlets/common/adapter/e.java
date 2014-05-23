package com.spotify.mobile.android.spotlets.common.adapter;

import java.util.ArrayList;
import java.util.List;

public class e<D> extends b<D>
{
  private List<? extends D> a;

  public e()
  {
    this((byte)0);
  }

  private e(byte paramByte)
  {
    b(null);
  }

  private <T extends D> void b(List<T> paramList)
  {
    if (paramList != null);
    while (true)
    {
      this.a = paramList;
      return;
      paramList = new ArrayList();
    }
  }

  public final void a(List<? extends D> paramList)
  {
    b(paramList);
    a();
  }

  public int getCount()
  {
    return this.a.size();
  }

  public D getItem(int paramInt)
  {
    return this.a.get(paramInt);
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public boolean hasStableIds()
  {
    return false;
  }

  public boolean isEnabled(int paramInt)
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.common.adapter.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
