package com.fasterxml.jackson.core;

public final class Base64Variants
{
  public static final Base64Variant MIME = new Base64Variant("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, (char)'=', 76);
  public static final Base64Variant MIME_NO_LINEFEEDS = new Base64Variant(MIME, "MIME-NO-LINEFEEDS", 2147483647);
  public static final Base64Variant MODIFIED_FOR_URL = new Base64Variant("MODIFIED-FOR-URL", localStringBuffer.toString(), false, (char)'\000', 2147483647);
  public static final Base64Variant PEM = new Base64Variant(MIME, "PEM", true, (char)'=', 64);

  static
  {
    StringBuffer localStringBuffer = new StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    localStringBuffer.setCharAt(localStringBuffer.indexOf("+"), (char)'-');
    localStringBuffer.setCharAt(localStringBuffer.indexOf("/"), (char)'_');
  }

  public static Base64Variant getDefaultVariant()
  {
    return MIME_NO_LINEFEEDS;
  }

  public static Base64Variant valueOf(String paramString)
  {
    if (MIME._name.equals(paramString))
      return MIME;
    if (MIME_NO_LINEFEEDS._name.equals(paramString))
      return MIME_NO_LINEFEEDS;
    if (PEM._name.equals(paramString))
      return PEM;
    if (MODIFIED_FOR_URL._name.equals(paramString))
      return MODIFIED_FOR_URL;
    if (paramString == null);
    for (String str = "<null>"; ; str = "'" + paramString + "'")
      throw new IllegalArgumentException("No Base64Variant with name " + str);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.core.Base64Variants
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
