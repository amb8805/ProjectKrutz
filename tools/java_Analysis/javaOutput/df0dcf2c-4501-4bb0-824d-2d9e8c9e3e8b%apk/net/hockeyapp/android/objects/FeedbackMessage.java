package net.hockeyapp.android.objects;

import java.io.Serializable;

public class FeedbackMessage
  implements Serializable
{
  private static final long serialVersionUID = -8773015828853994624L;
  private String appId;
  private String cleanText;
  private String createdAt;
  private int id;
  private String model;
  private String name;
  private String oem;
  private String osVersion;
  private String subject;
  private String text;
  private String token;
  private String userString;
  private int via;

  public FeedbackMessage()
  {
  }

  public final String a()
  {
    return this.text;
  }

  public final void a(int paramInt)
  {
    this.id = paramInt;
  }

  public final void a(String paramString)
  {
    this.subject = paramString;
  }

  public final String b()
  {
    return this.createdAt;
  }

  public final void b(int paramInt)
  {
    this.via = paramInt;
  }

  public final void b(String paramString)
  {
    this.text = paramString;
  }

  public final String c()
  {
    return this.name;
  }

  public final void c(String paramString)
  {
    this.oem = paramString;
  }

  public final void d(String paramString)
  {
    this.model = paramString;
  }

  public final void e(String paramString)
  {
    this.osVersion = paramString;
  }

  public final void f(String paramString)
  {
    this.createdAt = paramString;
  }

  public final void g(String paramString)
  {
    this.token = paramString;
  }

  public final void h(String paramString)
  {
    this.userString = paramString;
  }

  public final void i(String paramString)
  {
    this.cleanText = paramString;
  }

  public final void j(String paramString)
  {
    this.name = paramString;
  }

  public final void k(String paramString)
  {
    this.appId = paramString;
  }
}

/* Location:
 * Qualified Name:     net.hockeyapp.android.objects.FeedbackMessage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
