import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.message.BasicHeader;

public final class as extends AbstractHttpEntity
{
  private final bf a;
  private final StringBuilder b = new StringBuilder();
  private final ByteArrayOutputStream c;

  public as(bf parambf)
  {
    this.a = parambf;
    this.contentType = new BasicHeader("Content-Type", "multipart/form-data; boundary=twitter");
    this.c = new ByteArrayOutputStream(4096);
  }

  private void b()
  {
    StringBuilder localStringBuilder = this.b;
    this.c.write(localStringBuilder.toString().getBytes("UTF-8"));
    localStringBuilder.delete(0, localStringBuilder.length());
  }

  private void b(String paramString1, String paramString2)
  {
    this.b.append("--twitter").append("\r\n").append("Content-Disposition: form-data; name=\"").append(paramString1).append("\"; filename=\"").append(paramString2).append("\"").append("\r\n").append("Content-Type: image/jpeg").append("\r\n").append("Content-Transfer-Encoding: binary").append("\r\n").append("\r\n");
    b();
  }

  public final int a(String paramString1, String paramString2, InputStream paramInputStream)
  {
    b(paramString1, paramString2);
    byte[] arrayOfByte = new byte[4096];
    int i = 0;
    while (true)
    {
      int j = paramInputStream.read(arrayOfByte);
      if (j <= 0)
        break;
      this.c.write(arrayOfByte, 0, j);
      i += j;
    }
    this.c.write("\r\n".getBytes("UTF-8"));
    return i;
  }

  public final int a(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    b(paramString1, paramString2);
    this.c.write(paramArrayOfByte, 0, paramArrayOfByte.length);
    this.c.write("\r\n".getBytes("UTF-8"));
    return paramArrayOfByte.length;
  }

  public final void a()
  {
    this.b.append("--twitter").append("--").append("\r\n");
    b();
  }

  public final void a(String paramString1, String paramString2)
  {
    this.b.append("--twitter").append("\r\n").append("Content-Disposition: form-data; name=\"").append(paramString1).append("\"").append("\r\n").append("\r\n").append(paramString2).append("\r\n");
    b();
  }

  public final InputStream getContent()
  {
    return new ByteArrayInputStream(this.c.toByteArray());
  }

  public final long getContentLength()
  {
    return this.c.size();
  }

  public final boolean isRepeatable()
  {
    return true;
  }

  public final boolean isStreaming()
  {
    return false;
  }

  public final void writeTo(OutputStream paramOutputStream)
  {
    this.c.writeTo(new de(paramOutputStream, getContentLength(), this.a));
  }
}

/* Location:
 * Qualified Name:     as
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
