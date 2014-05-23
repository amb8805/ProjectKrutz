import org.apache.http.HeaderElement;
import org.apache.http.HeaderElementIterator;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.protocol.HttpContext;

final class cw
  implements ConnectionKeepAliveStrategy
{
  cw()
  {
  }

  public final long getKeepAliveDuration(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    BasicHeaderElementIterator localBasicHeaderElementIterator = new BasicHeaderElementIterator(paramHttpResponse.headerIterator("Keep-Alive"));
    while (true)
      if (localBasicHeaderElementIterator.hasNext())
      {
        HeaderElement localHeaderElement = localBasicHeaderElementIterator.nextElement();
        String str1 = localHeaderElement.getName();
        String str2 = localHeaderElement.getValue();
        if ((str2 == null) || (!"timeout".equalsIgnoreCase(str1)))
          continue;
        try
        {
          long l1 = Long.parseLong(str2);
          long l2 = l1 * 1000L;
          if (l2 > 0L)
          {
            return l2;
            return 60000L;
          }
        }
        catch (NumberFormatException localNumberFormatException)
        {
        }
      }
  }
}

/* Location:
 * Qualified Name:     cw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
