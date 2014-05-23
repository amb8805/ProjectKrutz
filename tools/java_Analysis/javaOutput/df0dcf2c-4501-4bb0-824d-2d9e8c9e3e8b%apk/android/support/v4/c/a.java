package android.support.v4.c;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a<K, V> extends m<K, V>
  implements Map<K, V>
{
  g<K, V> a;

  public a()
  {
  }

  private g<K, V> b()
  {
    if (this.a == null)
      this.a = new a.1(this);
    return this.a;
  }

  public Set<Map.Entry<K, V>> entrySet()
  {
    g localg = b();
    if (localg.b == null)
      localg.b = new i(localg);
    return localg.b;
  }

  public Set<K> keySet()
  {
    g localg = b();
    if (localg.c == null)
      localg.c = new j(localg);
    return localg.c;
  }

  public void putAll(Map<? extends K, ? extends V> paramMap)
  {
    a(this.h + paramMap.size());
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      put(localEntry.getKey(), localEntry.getValue());
    }
  }

  public Collection<V> values()
  {
    g localg = b();
    if (localg.d == null)
      localg.d = new l(localg);
    return localg.d;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
