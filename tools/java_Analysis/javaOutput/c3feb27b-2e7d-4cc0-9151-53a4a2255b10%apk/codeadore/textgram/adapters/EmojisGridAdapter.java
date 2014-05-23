package codeadore.textgram.adapters;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap;;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import codeadore.textgram.el7rUtilities;
import java.io.File;
import java.io.IOException;

public class EmojisGridAdapter extends BaseAdapter
{
  String category;
  Context context;
  String[] faces_list;
  int gcCount = 0;
  LayoutInflater mInflater;
  WindowManager windowManager;

  public EmojisGridAdapter(Context paramContext, String paramString, WindowManager paramWindowManager)
  {
    this.context = paramContext;
    this.windowManager = paramWindowManager;
    this.mInflater = ((LayoutInflater)this.context.getSystemService("layout_inflater"));
    this.category = paramString;
    try
    {
      if (this.category == null)
      {
        this.faces_list = paramContext.getAssets().list("emojis");
        return;
      }
      this.faces_list = paramContext.getAssets().list("emojis" + File.separator + this.category);
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }

  public int getCount()
  {
    return this.faces_list.length;
  }

  public String getFaceItem(int paramInt)
  {
    return this.faces_list[paramInt];
  }

  public Object getItem(int paramInt)
  {
    return Integer.valueOf(paramInt);
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      localView = this.mInflater.inflate(2130903079, paramViewGroup, false);
      while (true)
      {
        localImageView = (ImageView)localView.findViewById(2131099785);
        DisplayMetrics localDisplayMetrics = new DisplayMetrics();
        this.windowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
        int i = localDisplayMetrics.widthPixels;
        String str = String.valueOf(8.169935F / 100.0F * i);
        int j = Integer.valueOf(str.substring(0, str.lastIndexOf("."))).intValue();
        localObject = el7rUtilities.getBitmapFromAsset(this.context, "emojis" + File.separator + this.category + File.separator + this.faces_list[paramInt]);
        try
        {
          Bitmap localBitmap = Bitmap.createScaledBitmap((Bitmap)localObject, j, j, false);
          localObject = localBitmap;
          localImageView.setImageBitmap((Bitmap)localObject);
          return localView;
          localView = paramView;
        }
        catch (Exception localException)
        {
          while (true)
            localException.printStackTrace();
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.adapters.EmojisGridAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
