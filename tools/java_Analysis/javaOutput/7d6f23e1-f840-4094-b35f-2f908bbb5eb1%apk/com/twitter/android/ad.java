package com.twitter.android;

import android.database.Cursor;
import com.twitter.android.provider.am;
import dn;
import java.util.ArrayList;
import java.util.List;

public final class ad extends am
{
  public ad(Cursor paramCursor)
  {
    super(paramCursor);
  }

  public final void a()
  {
    Cursor localCursor = this.d;
    long l1;
    Object localObject1;
    if ((localCursor != null) && (localCursor.moveToFirst()))
    {
      this.b = new ArrayList();
      l1 = 0L;
      localObject1 = null;
    }
    while (true)
    {
      long l2 = localCursor.getLong(3);
      Object localObject2;
      if (l2 != l1)
      {
        if (localObject1 != null)
          this.b.add(localObject1);
        localObject2 = new dn(localCursor.getString(1), localCursor.getString(2), localCursor.getLong(3), new ArrayList());
      }
      for (long l3 = l2; ; l3 = l1)
      {
        ad localad = new ad(localCursor.getLong(4), null, localCursor.getString(5), localCursor.getString(6), null, 0, null, 0, false, false, null, 0, 0L, 0, false, 0, 0L, null, 0L, 0);
        if (localObject2 != null)
          ((dn)localObject2).i.add(localad);
        if (localCursor.moveToNext())
          break;
        return;
        this.b = null;
        return;
        localObject2 = localObject1;
      }
      localObject1 = localObject2;
      l1 = l3;
    }
  }

  public final long getLong(int paramInt)
  {
    if (paramInt == 0)
      return ((dn)this.b.get(this.c)).g;
    return super.getLong(paramInt);
  }

  public final String getString(int paramInt)
  {
    if (paramInt == 1)
      return ((dn)this.b.get(this.c)).a;
    if (paramInt == 2)
      return ((dn)this.b.get(this.c)).b;
    return super.getString(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.ad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
