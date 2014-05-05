import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class bv extends SimpleDateFormat
{
  public bv(String paramString)
  {
    super(paramString);
  }

  public bv(String paramString, Locale paramLocale)
  {
    super(paramString, paramLocale);
  }

  public final Date parse(String paramString)
  {
    try
    {
      Date localDate = super.parse(paramString);
      return localDate;
    }
    finally
    {
    }
  }
}

/* Location:
 * Qualified Name:     bv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
