package com.squareup.wire;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class Message
{
  private static final v WIRE = new v(new Class[0]);
  private transient int cachedSerializedSize = -1;
  protected transient int hashCode = 0;
  private transient p unknownFields;

  protected Message(h paramh)
  {
    if (paramh.unknownFieldMap != null)
      this.unknownFields = new p(paramh.unknownFieldMap);
  }

  protected static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }

  public final void a(x paramx)
  {
    if (this.unknownFields != null)
    {
      p localp = this.unknownFields;
      if (localp.a != null)
      {
        Iterator localIterator1 = localp.a.entrySet().iterator();
        while (localIterator1.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator1.next();
          int i = ((Integer)localEntry.getKey()).intValue();
          Iterator localIterator2 = ((List)localEntry.getValue()).iterator();
          while (localIterator2.hasNext())
            ((q)localIterator2.next()).a(i, paramx);
        }
      }
    }
  }

  public final byte[] a()
  {
    return WIRE.a(getClass()).b(this);
  }

  public final int b()
  {
    if (this.cachedSerializedSize < 0)
      this.cachedSerializedSize = WIRE.a(getClass()).a(this);
    return this.cachedSerializedSize;
  }

  public final int c()
  {
    if (this.unknownFields == null)
      return 0;
    p localp = this.unknownFields;
    if (localp.a != null)
    {
      Iterator localIterator1 = localp.a.entrySet().iterator();
      int j;
      for (i = 0; localIterator1.hasNext(); i = j)
      {
        Map.Entry localEntry = (Map.Entry)localIterator1.next();
        j = i + x.a(((Integer)localEntry.getKey()).intValue());
        Iterator localIterator2 = ((List)localEntry.getValue()).iterator();
        while (localIterator2.hasNext())
          j += ((q)localIterator2.next()).a();
      }
    }
    int i = 0;
    return i;
  }

  public String toString()
  {
    return WIRE.a(getClass()).c(this);
  }
}

/* Location:
 * Qualified Name:     com.squareup.wire.Message
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
