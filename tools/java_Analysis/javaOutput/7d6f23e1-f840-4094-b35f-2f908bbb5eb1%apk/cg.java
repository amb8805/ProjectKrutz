import java.io.IOException;

public class cg extends IOException
{
  private bd a;

  protected cg(String paramString, bd parambd)
  {
    this(paramString, parambd, null);
  }

  protected cg(String paramString, bd parambd, Throwable paramThrowable)
  {
    super(paramString);
    if (paramThrowable != null)
      initCause(paramThrowable);
    this.a = parambd;
  }

  public String getMessage()
  {
    String str = super.getMessage();
    if (str == null)
      str = "N/A";
    bd localbd = this.a;
    if (localbd != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(str);
      localStringBuilder.append((char)'\n');
      localStringBuilder.append(" at ");
      localStringBuilder.append(localbd.toString());
      str = localStringBuilder.toString();
    }
    return str;
  }

  public String toString()
  {
    return getClass().getName() + ": " + getMessage();
  }
}

/* Location:
 * Qualified Name:     cg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
