package net.hockeyapp.android.objects;

import java.io.Serializable;
import java.util.ArrayList;

public class Feedback
  implements Serializable
{
  private static final long serialVersionUID = 2590172806951065320L;
  private String createdAt;
  private String email;
  private int id;
  private ArrayList<FeedbackMessage> messages;
  private String name;

  public Feedback()
  {
  }

  public final ArrayList<FeedbackMessage> a()
  {
    return this.messages;
  }

  public final void a(int paramInt)
  {
    this.id = paramInt;
  }

  public final void a(String paramString)
  {
    this.name = paramString;
  }

  public final void a(ArrayList<FeedbackMessage> paramArrayList)
  {
    this.messages = paramArrayList;
  }

  public final void b(String paramString)
  {
    this.email = paramString;
  }

  public final void c(String paramString)
  {
    this.createdAt = paramString;
  }
}

/* Location:
 * Qualified Name:     net.hockeyapp.android.objects.Feedback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
