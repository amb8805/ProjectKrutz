package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.atomic.AtomicLong;

final class c
{
  private static final FilenameFilter a = new c.1();
  private static final FilenameFilter b = new c.2();

  static FilenameFilter a()
  {
    return a;
  }

  static void a(File paramFile)
  {
    File[] arrayOfFile = paramFile.listFiles(b);
    if (arrayOfFile != null)
    {
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++)
        arrayOfFile[j].delete();
    }
  }

  static File b(File paramFile)
  {
    return new File(paramFile, "buffer" + Long.valueOf(b.b().incrementAndGet()).toString());
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
