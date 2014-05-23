package codeadore.textgram.custom_widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class ActionBarTextView extends TextView
{
  public ActionBarTextView(Context paramContext, AttributeSet paramAttributeSet)
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
 * Qualified Name:     codeadore.textgram.custom_widgets.ActionBarTextView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
