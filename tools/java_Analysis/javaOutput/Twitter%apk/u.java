public abstract class u extends bq
{
  protected u()
  {
  }

  protected static final String b(int paramInt)
  {
    char c = (char)paramInt;
    if (Character.isISOControl(c))
      return "(CTRL-CHAR, code " + paramInt + ")";
    if (paramInt > 255)
      return "'" + c + "' (code " + paramInt + " / 0x" + Integer.toHexString(paramInt) + ")";
    return "'" + c + "' (code " + paramInt + ")";
  }

  protected static void l()
  {
    throw new RuntimeException("Internal error: this code path should never get executed");
  }

  protected final char a(char paramChar)
  {
    if (!a(au.f))
      throw d("Unrecognized character escape " + b(paramChar));
    return paramChar;
  }

  protected final void a(int paramInt)
  {
    int i = (char)paramInt;
    throw d("Illegal character (" + b(i) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
  }

  protected final void a(String paramString, Throwable paramThrowable)
  {
    throw new aa(paramString, n(), paramThrowable);
  }

  protected final void b(int paramInt, String paramString)
  {
    String str = "Unexpected character (" + b(paramInt) + ")";
    if (paramString != null)
      str = str + ": " + paramString;
    throw d(str);
  }

  protected final void b(String paramString)
  {
    throw d("Unexpected end-of-input" + paramString);
  }

  protected final void c(int paramInt, String paramString)
  {
    if ((!a(au.e)) || (paramInt >= 32))
    {
      int i = (char)paramInt;
      throw d("Illegal unquoted character (" + b(i) + "): has to be escaped using backslash to be included in " + paramString);
    }
  }

  protected final void c(String paramString)
  {
    throw d(paramString);
  }

  public abstract cp g();

  public final bq h()
  {
    if ((this.q != cp.a) && (this.q != cp.c))
      return this;
    int i = 1;
    do
    {
      while (true)
      {
        cp localcp = g();
        if (localcp == null)
        {
          i();
          return this;
        }
        switch (az.a[localcp.ordinal()])
        {
        default:
          break;
        case 1:
        case 2:
          i++;
        case 3:
        case 4:
        }
      }
      i--;
    }
    while (i != 0);
    return this;
  }

  protected abstract void i();

  public abstract String j();

  protected final void k()
  {
    b(" in " + this.q);
  }
}

/* Location:
 * Qualified Name:     u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
