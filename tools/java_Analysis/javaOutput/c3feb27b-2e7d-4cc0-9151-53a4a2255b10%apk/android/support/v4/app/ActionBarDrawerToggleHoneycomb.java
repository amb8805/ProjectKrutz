package android.support.v4.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import java.lang.reflect.Method;

class ActionBarDrawerToggleHoneycomb
{
  private static final String TAG = "ActionBarDrawerToggleHoneycomb";
  private static final int[] THEME_ATTRS = { 16843531 };

  ActionBarDrawerToggleHoneycomb()
  {
  }

  public static Drawable getThemeUpIndicator(Activity paramActivity)
  {
    TypedArray localTypedArray = paramActivity.obtainStyledAttributes(THEME_ATTRS);
    Drawable localDrawable = localTypedArray.getDrawable(0);
    localTypedArray.recycle();
    return localDrawable;
  }

  public static Object setActionBarDescription(Object paramObject, Activity paramActivity, int paramInt)
  {
    if (paramObject == null)
      paramObject = new ActionBarDrawerToggleHoneycomb.SetIndicatorInfo(paramActivity);
    ActionBarDrawerToggleHoneycomb.SetIndicatorInfo localSetIndicatorInfo = (ActionBarDrawerToggleHoneycomb.SetIndicatorInfo)paramObject;
    if (localSetIndicatorInfo.setHomeAsUpIndicator != null);
    try
    {
      ActionBar localActionBar = paramActivity.getActionBar();
      Method localMethod = localSetIndicatorInfo.setHomeActionContentDescription;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      localMethod.invoke(localActionBar, arrayOfObject);
      return paramObject;
    }
    catch (Exception localException)
    {
      Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set content description via JB-MR2 API", localException);
    }
    return paramObject;
  }

  public static Object setActionBarUpIndicator(Object paramObject, Activity paramActivity, Drawable paramDrawable, int paramInt)
  {
    if (paramObject == null)
      paramObject = new ActionBarDrawerToggleHoneycomb.SetIndicatorInfo(paramActivity);
    ActionBarDrawerToggleHoneycomb.SetIndicatorInfo localSetIndicatorInfo = (ActionBarDrawerToggleHoneycomb.SetIndicatorInfo)paramObject;
    if (localSetIndicatorInfo.setHomeAsUpIndicator != null)
      try
      {
        ActionBar localActionBar = paramActivity.getActionBar();
        localSetIndicatorInfo.setHomeAsUpIndicator.invoke(localActionBar, new Object[] { paramDrawable });
        Method localMethod = localSetIndicatorInfo.setHomeActionContentDescription;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(paramInt);
        localMethod.invoke(localActionBar, arrayOfObject);
        return paramObject;
      }
      catch (Exception localException)
      {
        Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator via JB-MR2 API", localException);
        return paramObject;
      }
    if (localSetIndicatorInfo.upIndicatorView != null)
    {
      localSetIndicatorInfo.upIndicatorView.setImageDrawable(paramDrawable);
      return paramObject;
    }
    Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator");
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.ActionBarDrawerToggleHoneycomb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
