package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.widget.TextView;

public class CompatTextView extends TextView
{
  public CompatTextView(Context paramContext)
  {
    this(paramContext, null);
  }

  public CompatTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public CompatTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.CompatTextView, paramInt, 0);
    boolean bool = localTypedArray.getBoolean(0, false);
    localTypedArray.recycle();
    if (bool)
      setTransformationMethod(new CompatTextView.AllCapsTransformationMethod(paramContext));
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.CompatTextView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
