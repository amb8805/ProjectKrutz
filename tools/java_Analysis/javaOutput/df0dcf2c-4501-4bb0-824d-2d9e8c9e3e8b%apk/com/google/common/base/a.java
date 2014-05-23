package com.google.common.base;

public final class a
{
  public static String a(String paramString)
  {
    int i = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder(i);
    int j = 0;
    if (j < i)
    {
      char c = paramString.charAt(j);
      if ((c >= 'A') && (c <= 'Z'));
      for (int k = 1; ; k = 0)
      {
        if (k != 0)
          c = (char)(c ^ 0x20);
        localStringBuilder.append(c);
        j++;
        break;
      }
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.common.base.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
