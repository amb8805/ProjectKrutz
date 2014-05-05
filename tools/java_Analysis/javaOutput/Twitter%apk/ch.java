import java.io.Serializable;
import java.util.ArrayList;

public final class ch
  implements Serializable
{
  public final String a;
  public final ah b;
  public final String c;
  public final String d;
  public final String e;
  public final ArrayList f;
  private int g;
  private String h;
  private double i;

  public ch(String paramString1, ah paramah, String paramString2, int paramInt, String paramString3, double paramDouble, String paramString4, String paramString5, ArrayList paramArrayList)
  {
    this.a = paramString1;
    this.b = paramah;
    this.c = paramString2;
    this.g = paramInt;
    this.h = paramString3;
    this.i = paramDouble;
    this.d = paramString4;
    if ((paramString5 == null) && (paramString4 != null))
    {
      int j = paramString4.length();
      if ((paramString4.charAt(0) == '"') && (paramString4.charAt(j - 1) == '"'))
        this.e = paramString4.substring(1, j - 1);
    }
    while (true)
    {
      this.f = paramArrayList;
      return;
      this.e = paramString4;
      continue;
      this.e = paramString5;
    }
  }
}

/* Location:
 * Qualified Name:     ch
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
