package android.support.v7.app;

import android.support.v7.appcompat.R.id;
import android.support.v7.internal.widget.NativeActionModeAwareLayout;
import android.support.v7.internal.widget.NativeActionModeAwareLayout.OnActionModeForChildListener;
import android.view.ActionMode;
import android.view.ActionMode.Callback;

class ActionBarImplHC extends ActionBarImplBase
  implements NativeActionModeAwareLayout.OnActionModeForChildListener
{
  private ActionMode mCurActionMode;
  final NativeActionModeAwareLayout mNativeActionModeAwareLayout;

  public ActionBarImplHC(ActionBarActivity paramActionBarActivity, ActionBar.Callback paramCallback)
  {
    super(paramActionBarActivity, paramCallback);
    this.mNativeActionModeAwareLayout = ((NativeActionModeAwareLayout)paramActionBarActivity.findViewById(R.id.action_bar_root));
    if (this.mNativeActionModeAwareLayout != null)
      this.mNativeActionModeAwareLayout.setActionModeForChildListener(this);
  }

  public void hide()
  {
    super.hide();
    if (this.mCurActionMode != null)
      this.mCurActionMode.finish();
  }

  boolean isShowHideAnimationEnabled()
  {
    return (this.mCurActionMode == null) && (super.isShowHideAnimationEnabled());
  }

  public ActionMode.Callback onActionModeForChild(ActionMode.Callback paramCallback)
  {
    return new ActionBarImplHC.CallbackWrapper(this, paramCallback);
  }

  public void show()
  {
    super.show();
    if (this.mCurActionMode != null)
      this.mCurActionMode.finish();
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.ActionBarImplHC
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
