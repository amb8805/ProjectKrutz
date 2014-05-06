import java.io.Serializable;
import java.util.ArrayList;

public final class dp
  implements Serializable
{
  public final ArrayList a;
  public final String b;
  public final ArrayList c;
  public final String d;
  public final z e;
  public final transient p f;
  public final ArrayList g;
  public final long h;
  private String i;
  private int j;

  public dp(String paramString, ArrayList paramArrayList)
  {
    this(paramString, paramArrayList, null, null, 0, null, null, null, null);
  }

  private dp(String paramString1, ArrayList paramArrayList1, String paramString2, ArrayList paramArrayList2, int paramInt, String paramString3, p paramp, z paramz, ArrayList paramArrayList3)
  {
    this.i = paramString1;
    this.a = paramArrayList1;
    this.b = paramString2;
    this.c = paramArrayList2;
    this.j = paramInt;
    this.d = paramString3;
    this.e = paramz;
    this.f = paramp;
    this.g = paramArrayList3;
    if (paramp != null)
    {
      this.h = paramp.a().a;
      return;
    }
    this.h = 0L;
  }

  public dp(String paramString1, ArrayList paramArrayList, p paramp, int paramInt, String paramString2)
  {
    this(null, null, paramString1, paramArrayList, paramInt, paramString2, paramp, null, null);
  }

  public dp(ArrayList paramArrayList)
  {
    this(null, null, null, null, 0, null, null, null, paramArrayList);
  }

  public dp(z paramz, ArrayList paramArrayList)
  {
    this(null, null, null, paramArrayList, 0, null, null, paramz, null);
  }
}

/* Location:
 * Qualified Name:     dp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
