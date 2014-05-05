import java.io.OutputStream;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

public final class dc extends n
{
  private HttpGet g;
  private final cl h;

  public dc(HttpClient paramHttpClient, HttpGet paramHttpGet, cl paramcl, OutputStream paramOutputStream)
  {
    super(paramHttpClient, paramHttpGet, paramOutputStream);
    this.g = paramHttpGet;
    this.h = paramcl;
  }

  protected final void a(long paramLong)
  {
    this.h.a(this.g, paramLong, null);
  }
}

/* Location:
 * Qualified Name:     dc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
