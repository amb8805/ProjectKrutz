package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.h;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeProvider;

final class d extends b
{
  d()
  {
  }

  public final h a(Object paramObject, View paramView)
  {
    AccessibilityNodeProvider localAccessibilityNodeProvider = ((View.AccessibilityDelegate)paramObject).getAccessibilityNodeProvider(paramView);
    if (localAccessibilityNodeProvider != null)
      return new h(localAccessibilityNodeProvider);
    return null;
  }

  public final Object a(a parama)
  {
    return new h.1(new d.1(this, parama));
  }

  public final boolean a(Object paramObject, View paramView, int paramInt, Bundle paramBundle)
  {
    return ((View.AccessibilityDelegate)paramObject).performAccessibilityAction(paramView, paramInt, paramBundle);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
