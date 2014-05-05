import android.os.AsyncTask;
import java.util.HashMap;

final class bn extends AsyncTask
{
  private HashMap a;
  private final long b;

  bn(bb parambb, long paramLong)
  {
    this.b = paramLong;
  }

  protected final void onPreExecute()
  {
    synchronized (this.c.c)
    {
      this.a = new HashMap(this.c.b.size());
      this.a.putAll(this.c.b);
      this.c.b.clear();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     bn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
