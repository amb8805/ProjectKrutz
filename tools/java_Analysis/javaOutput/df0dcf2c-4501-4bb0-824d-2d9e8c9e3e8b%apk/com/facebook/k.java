package com.facebook;

import com.facebook.internal.ad;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;

public final class k
  implements l
{
  private static final String a = k.class.getName();
  private static File b;

  public k()
  {
  }

  public static void a(UUID paramUUID)
  {
    ad.a(b(paramUUID));
  }

  private static File b(UUID paramUUID)
  {
    if (b == null)
      return null;
    return new File(b, paramUUID.toString());
  }

  private static File b(UUID paramUUID, String paramString)
  {
    File localFile1 = b(paramUUID);
    if (localFile1 == null)
      return null;
    try
    {
      File localFile2 = new File(localFile1, URLEncoder.encode(paramString, "UTF-8"));
      return localFile2;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return null;
  }

  public final File a(UUID paramUUID, String paramString)
  {
    if ((ad.a(paramString)) || (paramUUID == null))
      throw new FileNotFoundException();
    try
    {
      File localFile = b(paramUUID, paramString);
      return localFile;
    }
    catch (IOException localIOException)
    {
    }
    throw new FileNotFoundException();
  }
}

/* Location:
 * Qualified Name:     com.facebook.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
