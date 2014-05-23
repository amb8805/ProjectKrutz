import java.io.OutputStream;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;

public final class bu extends n
{
  private final HttpPost g;
  private final cl h;

  public bu(HttpClient paramHttpClient, HttpPost paramHttpPost, cl paramcl, OutputStream paramOutputStream)
  {
    this(paramHttpClient, paramHttpPost, paramcl, paramOutputStream, null);
  }

  public bu(HttpClient paramHttpClient, HttpPost paramHttpPost, cl paramcl, OutputStream paramOutputStream, bf parambf)
  {
    super(paramHttpClient, paramHttpPost, paramOutputStream, null);
    this.g = paramHttpPost;
    this.h = paramcl;
  }

  protected final void a(long paramLong)
  {
    this.h.a(this.g, paramLong, this.g.getEntity());
  }
}

/* Location:
 * Qualified Name:     bu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
