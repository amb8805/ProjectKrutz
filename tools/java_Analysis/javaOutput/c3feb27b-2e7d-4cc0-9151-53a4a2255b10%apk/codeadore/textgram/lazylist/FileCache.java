package codeadore.textgram.lazylist;

import android.content.Context;
import android.os.Environment;
import java.io.File;

public class FileCache
{
  private File cacheDir;

  public FileCache(Context paramContext)
  {
    if (Environment.getExternalStorageState().equals("mounted"));
    for (this.cacheDir = new File(Environment.getExternalStorageDirectory(), "LazyList"); ; this.cacheDir = paramContext.getCacheDir())
    {
      if (!this.cacheDir.exists())
        this.cacheDir.mkdirs();
      return;
    }
  }

  public void clear()
  {
    File[] arrayOfFile = this.cacheDir.listFiles();
    if (arrayOfFile == null);
    while (true)
    {
      return;
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++)
        arrayOfFile[j].delete();
    }
  }

  public File getFile(String paramString)
  {
    String str = String.valueOf(paramString.hashCode());
    return new File(this.cacheDir, str);
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.lazylist.FileCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
