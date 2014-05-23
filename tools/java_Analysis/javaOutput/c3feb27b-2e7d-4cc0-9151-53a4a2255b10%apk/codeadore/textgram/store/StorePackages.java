package codeadore.textgram.store;

import android.app.ProgressDialog;
import android.content.Context;
import codeadore.textgram.Settings;
import codeadore.textgram.el7rUtilities;
import java.io.File;

public class StorePackages
{
  static Context currentContext;
  static String currentDownloadDestination = null;
  static String currentTitle;
  static String currentUniqueID;
  static ProgressDialog mProgressDialog;

  public StorePackages()
  {
  }

  public static boolean deleteDirectory(File paramFile)
  {
    File[] arrayOfFile;
    int i;
    if (paramFile.exists())
    {
      arrayOfFile = paramFile.listFiles();
      if (arrayOfFile == null)
        return true;
      i = 0;
      if (i < arrayOfFile.length);
    }
    else
    {
      return paramFile.delete();
    }
    if (arrayOfFile[i].isDirectory())
      deleteDirectory(arrayOfFile[i]);
    while (true)
    {
      i++;
      break;
      arrayOfFile[i].delete();
    }
  }

  public static void install(String paramString1, String paramString2, String paramString3, Context paramContext)
  {
    currentUniqueID = paramString2;
    currentTitle = paramString3;
    currentContext = paramContext;
    currentDownloadDestination = String.valueOf(Settings.sdCardPath) + File.separator + File.separator + "cache" + File.separator + currentUniqueID + ".package";
    File localFile = new File(String.valueOf(Settings.sdCardPath) + File.separator + File.separator + "cache");
    localFile.mkdirs();
    mProgressDialog = new ProgressDialog(paramContext);
    mProgressDialog.setMessage("Downloading " + paramString3);
    mProgressDialog.setIndeterminate(false);
    mProgressDialog.setMax(100);
    mProgressDialog.setProgressStyle(1);
    mProgressDialog.setCancelable(false);
    if (localFile.exists())
    {
      new StorePackages.DownloadFile().execute(new String[] { paramString1 });
      return;
    }
    el7rUtilities.messageBox("Error, couldn't write data to your storage media, please report to codeadore@gmail.com", "fail", paramContext);
  }

  public static boolean isInstalled(String paramString)
  {
    return new File(String.valueOf(Settings.sdCardPath) + File.separator + paramString).isDirectory();
  }

  public static void uninstall(String paramString, Context paramContext)
  {
    mProgressDialog = new ProgressDialog(paramContext);
    mProgressDialog.setMessage("Uninstalling...");
    mProgressDialog.setIndeterminate(true);
    mProgressDialog.setProgressStyle(1);
    mProgressDialog.setCancelable(false);
    mProgressDialog.show();
    new Thread(new StorePackages.1(paramString, paramContext)).start();
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.store.StorePackages
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
