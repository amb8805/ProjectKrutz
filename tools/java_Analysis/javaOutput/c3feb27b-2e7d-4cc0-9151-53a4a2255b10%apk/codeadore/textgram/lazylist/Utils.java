package codeadore.textgram.lazylist;

import java.io.InputStream;
import java.io.OutputStream;

public class Utils
{
  public Utils()
  {
  }

  public static void CopyStream(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    try
    {
      byte[] arrayOfByte = new byte[1024];
      while (true)
      {
        int i = paramInputStream.read(arrayOfByte, 0, 1024);
        if (i == -1)
          return;
        paramOutputStream.write(arrayOfByte, 0, i);
      }
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.lazylist.Utils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
