package net.hockeyapp.android.objects;

import java.io.Serializable;

public class FeedbackResponse
  implements Serializable
{
  private static final long serialVersionUID = -1093570359639034766L;
  private Feedback feedback;
  private String status;
  private String token;

  public FeedbackResponse()
  {
  }

  public final String a()
  {
    return this.status;
  }

  public final void a(String paramString)
  {
    this.status = paramString;
  }

  public final void a(Feedback paramFeedback)
  {
    this.feedback = paramFeedback;
  }

  public final Feedback b()
  {
    return this.feedback;
  }

  public final void b(String paramString)
  {
    this.token = paramString;
  }

  public final String c()
  {
    return this.token;
  }
}

/* Location:
 * Qualified Name:     net.hockeyapp.android.objects.FeedbackResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
