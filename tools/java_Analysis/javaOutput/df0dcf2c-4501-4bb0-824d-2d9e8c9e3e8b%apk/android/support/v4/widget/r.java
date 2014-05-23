package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.at;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

final class r extends android.support.v4.view.a
{
  private final Rect c = new Rect();

  r(SlidingPaneLayout paramSlidingPaneLayout)
  {
  }

  private boolean b(View paramView)
  {
    return this.b.b(paramView);
  }

  public final void a(View paramView, android.support.v4.view.a.a parama)
  {
    android.support.v4.view.a.a locala = android.support.v4.view.a.a.a(parama);
    super.a(paramView, locala);
    Rect localRect = this.c;
    locala.a(localRect);
    parama.b(localRect);
    locala.c(localRect);
    parama.d(localRect);
    parama.c(locala.f());
    parama.a(locala.l());
    parama.b(locala.m());
    parama.c(locala.n());
    parama.h(locala.k());
    parama.f(locala.i());
    parama.a(locala.d());
    parama.b(locala.e());
    parama.d(locala.g());
    parama.e(locala.h());
    parama.g(locala.j());
    parama.a(locala.b());
    parama.b(locala.c());
    locala.o();
    parama.b(SlidingPaneLayout.class.getName());
    parama.a(paramView);
    ViewParent localViewParent = at.g(paramView);
    if ((localViewParent instanceof View))
      parama.c((View)localViewParent);
    int i = this.b.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = this.b.getChildAt(j);
      if ((!b(localView)) && (localView.getVisibility() == 0))
      {
        at.d(localView);
        parama.b(localView);
      }
    }
  }

  public final boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    if (!b(paramView))
      return super.a(paramViewGroup, paramView, paramAccessibilityEvent);
    return false;
  }

  public final void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
