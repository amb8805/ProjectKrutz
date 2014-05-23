package codeadore.textgram;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class el7rUtilities
{
  public el7rUtilities()
  {
  }

  public static String geHTTPtContents(String paramString)
    throws IOException
  {
    String str1 = "";
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(new URL(paramString).openConnection().getInputStream()));
    while (true)
    {
      String str2 = localBufferedReader.readLine();
      if (str2 == null)
        return str1;
      str1 = String.valueOf(str1) + str2;
    }
  }

  public static Bitmap getBitmapFromAsset(Context paramContext, String paramString)
  {
    AssetManager localAssetManager = paramContext.getAssets();
    try
    {
      Bitmap localBitmap = BitmapFactory.decodeStream(localAssetManager.open(paramString));
      return localBitmap;
    }
    catch (IOException localIOException)
    {
    }
    return null;
  }

  public static boolean isAppInstalled(Context paramContext, String paramString)
  {
    return paramContext.getPackageManager().getLaunchIntentForPackage(paramString) != null;
  }

  public static void messageBox(String paramString1, String paramString2, Context paramContext)
  {
    AlertDialog localAlertDialog = new AlertDialog.Builder(paramContext).create();
    localAlertDialog.setButton("OK", new el7rUtilities.1());
    View localView = LayoutInflater.from(paramContext).inflate(2130903074, null);
    ((TextView)localView.findViewById(2131099761)).setText(paramString1);
    ImageView localImageView;
    if (paramString2 != null)
    {
      localImageView = (ImageView)localView.findViewById(2131099760);
      localImageView.setVisibility(0);
      if (paramString2 != "done")
        break label97;
      localImageView.setImageResource(2130837634);
    }
    while (true)
    {
      localAlertDialog.setView(localView);
      localAlertDialog.show();
      return;
      label97: if (paramString2 == "fail")
        localImageView.setImageResource(2130837709);
    }
  }

  public static void viewHTMLMessage(Context paramContext, String paramString)
  {
    if (paramContext != null);
    try
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramContext);
      localBuilder.setTitle(paramContext.getString(2131427399));
      localBuilder.setIcon(2130837659);
      WebView localWebView = new WebView(paramContext);
      localBuilder.setView(localWebView);
      localWebView.loadData(paramString, "text/html", "utf-8");
      localBuilder.setNegativeButton(paramContext.getString(2131427370), new el7rUtilities.2());
      localWebView.setWebViewClient(new el7rUtilities.3(paramContext));
      localBuilder.setCancelable(false);
      localBuilder.show();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.el7rUtilities
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
