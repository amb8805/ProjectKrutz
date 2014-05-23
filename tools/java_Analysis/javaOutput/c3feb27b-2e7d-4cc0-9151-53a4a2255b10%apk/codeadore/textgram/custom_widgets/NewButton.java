package codeadore.textgram.custom_widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

public class NewButton extends Button
{
  public NewButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (isInEditMode())
      return;
    try
    {
      setTypeface(Typeface.createFromAsset(paramContext.getAssets(), "fonts/roboto/roboto_l.ttf"));
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.custom_widgets.NewButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
