package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.View;
import android.widget.LinearLayout;

public class NativeActionModeAwareLayout extends LinearLayout
{
  private NativeActionModeAwareLayout.OnActionModeForChildListener mActionModeForChildListener;

  public NativeActionModeAwareLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void setActionModeForChildListener(NativeActionModeAwareLayout.OnActionModeForChildListener paramOnActionModeForChildListener)
  {
    this.mActionModeForChildListener = paramOnActionModeForChildListener;
  }

  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback)
  {
    if (this.mActionModeForChildListener != null)
      paramCallback = this.mActionModeForChildListener.onActionModeForChild(paramCallback);
    return super.startActionModeForChild(paramView, paramCallback);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.NativeActionModeAwareLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
