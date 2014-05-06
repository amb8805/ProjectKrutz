import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class ck
{
  private static final l a = new l();

  public ck()
  {
  }

  public static byte[] a(byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(4 * ((2 + paramArrayOfByte.length) / 3));
    try
    {
      a.a(paramArrayOfByte, 0, paramArrayOfByte.length, localByteArrayOutputStream);
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException("exception encoding base64 string: " + localIOException);
    }
  }
}

/* Location:
 * Qualified Name:     ck
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
