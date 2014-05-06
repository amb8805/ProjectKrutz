import java.util.HashMap;
import java.util.Map;

class db
  implements cz
{
  private Map a = new HashMap();
  private ds b = new ds();

  db()
  {
  }

  public final int a(String paramString)
  {
    Object localObject = this.a.get(paramString);
    if (localObject == null)
      return -1;
    return ((Integer)localObject).intValue();
  }

  public final void a(String paramString, int paramInt)
  {
    this.a.put(paramString, new Integer(paramInt));
    this.b.a(paramInt, paramString);
  }
}

/* Location:
 * Qualified Name:     db
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
