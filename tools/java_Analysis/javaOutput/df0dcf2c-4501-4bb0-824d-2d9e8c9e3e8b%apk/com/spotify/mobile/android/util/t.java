package com.spotify.mobile.android.util;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class t
  implements ai
{
  private final Collection<ai> a = new LinkedList();

  public t()
  {
  }

  public String a()
  {
    return null;
  }

  public final void a(ai paramai)
  {
    this.a.add(paramai);
  }

  public final void b(ai paramai)
  {
    this.a.remove(paramai);
  }

  protected final String c()
  {
    StringBuilder localStringBuilder = new StringBuilder(2048);
    Iterator localIterator = this.a.iterator();
    ai localai;
    while (true)
      if (localIterator.hasNext())
      {
        localai = (ai)localIterator.next();
        try
        {
          String str = localai.a();
          if (!TextUtils.isEmpty(str))
          {
            localStringBuilder.append(str).append((char)'\n');
            for (int i = 0; i < str.length(); i++)
              localStringBuilder.append((char)'-');
            localStringBuilder.append((char)'\n');
          }
          localStringBuilder.append(localai.b());
          localStringBuilder.append((char)'\n');
        }
        catch (Exception localException)
        {
          while (true)
            localStringBuilder.append("Exception ").append(localException.getMessage()).append(" while getting crash environment from ").append(localai.getClass().getSimpleName());
        }
      }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
