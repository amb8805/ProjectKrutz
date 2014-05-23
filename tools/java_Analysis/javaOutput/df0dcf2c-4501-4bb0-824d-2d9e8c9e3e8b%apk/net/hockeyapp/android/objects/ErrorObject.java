package net.hockeyapp.android.objects;

import java.io.Serializable;

public class ErrorObject
  implements Serializable
{
  private static final long serialVersionUID = 1508110658372169868L;
  private int code;
  private String message;

  public ErrorObject()
  {
  }

  public final String a()
  {
    return this.message;
  }

  public final void a(String paramString)
  {
    this.message = paramString;
  }
}

/* Location:
 * Qualified Name:     net.hockeyapp.android.objects.ErrorObject
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
