package codeadore.textgram.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import codeadore.textgram.StylingActivity;
import codeadore.textgram.SuperSurface;
import codeadore.textgram.SuperSurfaceItem;
import codeadore.textgram.Utilities;
import codeadore.textgram.custom_widgets.el7rTextView;
import codeadore.textgram.el7rUtilities;
import java.util.ArrayList;

public class StylingImagesAdapter extends BaseAdapter
{
  String TAG = "StylingImagesAdapter";
  Context context;
  int mGalleryItemBackground;
  ArrayList<String> theList = null;
  String type = "gallery";

  public StylingImagesAdapter(Context paramContext, ArrayList<String> paramArrayList, String paramString)
  {
    this.theList = paramArrayList;
    this.type = paramString;
    System.gc();
    this.context = paramContext;
  }

  public int getCount()
  {
    if (this.theList == null)
      return 0;
    return this.theList.size();
  }

  public Object getItem(int paramInt)
  {
    return Integer.valueOf(paramInt);
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  @SuppressLint({"NewApi"})
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    String str1 = (String)this.theList.get(paramInt);
    View localView;
    ImageView localImageView;
    Object localObject;
    if (paramView == null)
      if (this.type == "gallery")
      {
        localView = StylingActivity.layoutInflater.inflate(2130903083, paramViewGroup, false);
        localImageView = (ImageView)localView.findViewById(2131099796);
        if (!str1.equals("[custom]"))
          break label104;
        localObject = BitmapFactory.decodeResource(StylingActivity.c.getResources(), 2130837649);
      }
    label290: 
    while (true)
    {
      localImageView.setImageBitmap((Bitmap)localObject);
      return localView;
      localView = StylingActivity.layoutInflater.inflate(2130903084, paramViewGroup, false);
      break;
      localView = paramView;
      break;
      label104: if (str1.equals("[none]"))
      {
        localObject = BitmapFactory.decodeResource(StylingActivity.c.getResources(), 2130837650);
      }
      else if (str1.equals("[get_more]"))
      {
        localObject = BitmapFactory.decodeResource(StylingActivity.c.getResources(), 2130837648);
      }
      else
      {
        if (str1.equals("[custom_color]"))
        {
          Bitmap localBitmap3 = el7rUtilities.getBitmapFromAsset(StylingActivity.c, "data/gv_icon_custom_color.png");
          localObject = Bitmap.createBitmap(100, 100, Bitmap.Config.RGB_565);
          Canvas localCanvas2 = new Canvas((Bitmap)localObject);
          if (this.theList == StylingActivity.colorsList)
            localCanvas2.drawColor(StylingActivity.superSurface.getCurrentTextItem().textViewDraw.getCurrentTextColor());
          while (true)
          {
            localCanvas2.drawBitmap(localBitmap3, 0.0F, 0.0F, null);
            break;
            if (this.theList == StylingActivity.shadowColorsList)
              localCanvas2.drawColor(StylingActivity.superSurface.getCurrentTextItem().textViewDraw.getShadowColor());
          }
        }
        String str2;
        if (str1.endsWith(".ttf"))
        {
          str2 = str1.replace(".ttf", ".jpg");
          if ((this.theList == StylingActivity.colorsList) || (this.theList == StylingActivity.shadowColorsList))
            if (str1.contains(":"))
              try
              {
                String[] arrayOfString = str1.split(":");
                RadialGradient localRadialGradient = new RadialGradient(50.0F, 100.0F, 100.0F, Color.parseColor(arrayOfString[0]), Color.parseColor(arrayOfString[1]), Shader.TileMode.CLAMP);
                Paint localPaint = new Paint();
                localPaint.setDither(true);
                localPaint.setShader(localRadialGradient);
                Bitmap localBitmap2 = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
                new Canvas(localBitmap2).drawRect(0.0F, 0.0F, 100.0F, 100.0F, localPaint);
                localObject = localBitmap2;
                continue;
                if (str1.contains("templates/"))
                {
                  str2 = String.valueOf(str1) + "/icon.jpg";
                  break label290;
                }
                str2 = str1.replace(".jpg", ".thumb.jpg").replace(".png", ".thumb.jpg");
              }
              catch (Exception localException2)
              {
                Log.e(this.TAG, "in getView - itemVal.contains(:): " + localException2.toString());
                localObject = null;
              }
        }
        else
        {
          continue;
          Bitmap localBitmap1 = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
          Canvas localCanvas1 = new Canvas(localBitmap1);
          try
          {
            localCanvas1.drawColor(Color.parseColor(str1));
            localObject = localBitmap1;
          }
          catch (Exception localException1)
          {
            while (true)
              Log.e(this.TAG, "in finalCanvas.drawColor: " + localException1.toString() + " :: " + str1);
          }
          localObject = Utilities.getBitmapFromPath(this.context, str2);
          if (localObject == null)
            localObject = Utilities.getBitmapFromPath(this.context, str1);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.adapters.StylingImagesAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
