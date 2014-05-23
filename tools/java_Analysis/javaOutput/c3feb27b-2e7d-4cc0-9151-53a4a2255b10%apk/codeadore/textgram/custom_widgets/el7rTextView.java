package codeadore.textgram.custom_widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;
import android.widget.TextView.BufferType;

public class el7rTextView extends TextView
{
  String TAG = "el7rTextView";
  CharSequence originalText = null;
  String shadowColor = null;
  String textColor = null;

  public el7rTextView(Context paramContext)
  {
    super(paramContext);
  }

  public el7rTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void clearShadow()
  {
    this.shadowColor = null;
    getPaint().clearShadowLayer();
  }

  @SuppressLint({"Override"})
  public int getShadowColor()
  {
    if (this.shadowColor != null)
      try
      {
        int i = Color.parseColor(this.shadowColor);
        return i;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    return 0;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.shadowColor == null)
    {
      getPaint().setShadowLayer(0.0F, 0.0F, 0.0F, 0);
      getPaint().setShader(null);
      super.onDraw(paramCanvas);
      getPaint().clearShadowLayer();
      if ((this.textColor != null) && (!this.textColor.contains(":")))
        break label218;
    }
    while (true)
    {
      try
      {
        while (true)
        {
          String[] arrayOfString = this.textColor.split(":");
          int i = getLineCount() * (int)getTextSize();
          RadialGradient localRadialGradient = new RadialGradient(i / 2, i, 612.0F, Color.parseColor(arrayOfString[0]), Color.parseColor(arrayOfString[1]), Shader.TileMode.CLAMP);
          getPaint().setShader(localRadialGradient);
          super.onDraw(paramCanvas);
          return;
          try
          {
            getPaint().setShadowLayer(5.0F, 0.0F, 2.0F, Color.parseColor(this.shadowColor));
          }
          catch (Exception localException1)
          {
            Log.e(this.TAG, "in updateView() -> set sahdow color no empty: " + localException1.toString());
          }
        }
      }
      catch (Exception localException3)
      {
        Log.e(this.TAG, "in updateView() -> set color contains(:): " + localException3.toString());
        continue;
      }
      try
      {
        label218: getPaint().setShader(null);
        setTextColor(Color.parseColor(this.textColor));
      }
      catch (Exception localException2)
      {
        Log.e(this.TAG, "in updateView() -> setting canvas normal color: " + localException2.toString());
      }
    }
  }

  public void setShadowColor(int paramInt)
  {
    this.shadowColor = ("#" + Integer.toHexString(paramInt));
  }

  public void setShadowColor(String paramString)
  {
    this.shadowColor = paramString;
  }

  public void setSuperHighlightColor(String paramString, int paramInt)
  {
    if (!paramString.contains("no"))
    {
      i = 0;
      j = 0;
      try
      {
        i = Integer.valueOf(paramString.substring(1, 3), 16).intValue();
        j = Integer.valueOf(paramString.substring(3, 5), 16).intValue();
        int m = Integer.valueOf(paramString.substring(5, 7), 16).intValue();
        k = m;
        SpannableString localSpannableString = new SpannableString(this.originalText);
        localSpannableString.setSpan(new BackgroundColorSpan(Color.argb(paramInt, i, j, k)), 0, localSpannableString.length(), 33);
        setText(localSpannableString);
        return;
      }
      catch (Exception localException)
      {
        while (true)
        {
          localException.printStackTrace();
          int k = 0;
        }
      }
    }
  }

  public void setSuperTextColor(String paramString)
  {
    this.textColor = paramString;
  }

  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    this.originalText = paramCharSequence;
    super.setText(paramCharSequence, paramBufferType);
  }

  public void setTextColor(int paramInt)
  {
    super.setTextColor(paramInt);
    this.textColor = ("#" + Integer.toHexString(paramInt));
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.custom_widgets.el7rTextView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
