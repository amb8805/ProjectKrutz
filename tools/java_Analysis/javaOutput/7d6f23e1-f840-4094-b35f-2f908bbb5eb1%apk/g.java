import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class g extends LinkedHashMap
{
  public static final g a = new g();

  private g()
  {
    super(192, 0.8F, true);
  }

  public final String a(String paramString)
  {
    try
    {
      String str = (String)get(paramString);
      if (str == null)
      {
        str = paramString.intern();
        put(str, str);
      }
      return str;
    }
    finally
    {
    }
  }

  protected final boolean removeEldestEntry(Map.Entry paramEntry)
  {
    return size() > 192;
  }
}

/* Location:
 * Qualified Name:     g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
