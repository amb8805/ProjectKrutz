package com.spotify.mobile.android.util;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.g;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.activity.m;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class FragmentTesterActivity extends FragmentActivity
  implements com.spotify.mobile.android.ui.activity.l
{
  private bb n = (bb)c.b(bb.class);
  private Bundle o;
  private Fragment p;

  public FragmentTesterActivity()
  {
  }

  public final void a(Fragment paramFragment, String paramString)
  {
    setTitle(paramString);
  }

  public final void a(m paramm)
  {
  }

  public final void b(boolean paramBoolean)
  {
  }

  public final boolean g()
  {
    return false;
  }

  public final void h()
  {
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    LinearLayout localLinearLayout = new LinearLayout(this);
    localLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    localLinearLayout.setId(2131362447);
    setContentView(localLinearLayout);
    Bundle localBundle;
    if (this.n != null)
    {
      Fragment localFragment = this.n.a();
      this.p = localFragment;
      if (localFragment != null)
        c().a().a(2131362447, localFragment, "fragment_under_test").b();
      localBundle = this.n.b();
      if (localBundle == null);
    }
    try
    {
      Constructor localConstructor = Fragment.SavedState.class.getDeclaredConstructor(new Class[] { Bundle.class });
      localConstructor.setAccessible(true);
      Fragment.SavedState localSavedState = (Fragment.SavedState)localConstructor.newInstance(new Object[] { localBundle });
      this.p.a(localSavedState);
      return;
    }
    catch (Exception localException)
    {
      throw new RuntimeException("This shouldn't have happened ;)", localException);
    }
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    if (paramBundle == null)
      paramBundle = new Bundle();
    super.onSaveInstanceState(paramBundle);
    Object localObject1 = paramBundle.get("android:support:fragments");
    if (localObject1 != null)
      try
      {
        Field localField1 = localObject1.getClass().getDeclaredField("mActive");
        localField1.setAccessible(true);
        Object localObject2 = ((Object[])localField1.get(localObject1))[0];
        Field localField2 = localObject2.getClass().getDeclaredField("mSavedFragmentState");
        localField2.setAccessible(true);
        Bundle localBundle1 = (Bundle)localField2.get(localObject2);
        if (localBundle1 != null);
        for (Bundle localBundle2 = new Bundle(localBundle1); ; localBundle2 = null)
        {
          this.o = localBundle2;
          return;
        }
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        throw new RuntimeException(localNoSuchFieldException);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw new RuntimeException(localIllegalArgumentException);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        throw new RuntimeException(localIllegalAccessException);
      }
    this.o = null;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.FragmentTesterActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
