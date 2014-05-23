package com.twitter.android.platform;

import android.util.Log;
import java.util.StringTokenizer;

public final class j
{
  private String a;
  private String b;
  private String c;

  public j(String paramString)
  {
    d(paramString);
  }

  public j(String paramString1, String paramString2, String paramString3)
  {
    this.a = null;
    this.b = null;
    this.c = paramString3;
  }

  private void d(String paramString)
  {
    if (paramString == null);
    do
    {
      return;
      if (k.a)
        Log.d("ContactsStorage", "decode: Encoded: " + paramString);
      StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ",");
      int i = 0;
      if (localStringTokenizer.hasMoreTokens())
      {
        switch (i)
        {
        default:
        case 0:
        case 1:
        case 2:
        }
        while (true)
        {
          i++;
          break;
          this.a = localStringTokenizer.nextToken();
          if ("null".equals(this.a))
          {
            this.a = null;
            continue;
            this.b = localStringTokenizer.nextToken();
            if ("null".equals(this.b))
            {
              this.b = null;
              continue;
              this.c = localStringTokenizer.nextToken();
              if ("null".equals(this.c))
                this.c = null;
            }
          }
        }
      }
    }
    while (!k.a);
    Log.d("ContactsStorage", "decode: Decoded: " + this.a + "," + this.b + "," + this.c);
  }

  public final String a()
  {
    return this.a;
  }

  public final void a(String paramString)
  {
    if (k.a)
      Log.d("ContactsStorage", "setSyncId: " + paramString);
    this.a = paramString;
  }

  public final String b()
  {
    return this.b;
  }

  public final void b(String paramString)
  {
    if (k.a)
      Log.d("ContactsStorage", "setSyncState: " + paramString);
    this.b = paramString;
  }

  public final String c()
  {
    return this.c;
  }

  public final void c(String paramString)
  {
    if (k.a)
      Log.d("ContactsStorage", "setSyncCursor: " + paramString);
    this.c = paramString;
  }

  public final byte[] d()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a);
    localStringBuilder.append((char)',');
    localStringBuilder.append(this.b);
    localStringBuilder.append((char)',');
    localStringBuilder.append(this.c);
    if (k.a)
      Log.d("ContactsStorage", "encode: " + localStringBuilder.toString());
    return localStringBuilder.toString().getBytes();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.platform.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
