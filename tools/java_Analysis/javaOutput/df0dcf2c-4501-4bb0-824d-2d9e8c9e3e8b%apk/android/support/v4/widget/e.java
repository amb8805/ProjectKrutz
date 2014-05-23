package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.at;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

final class e extends android.support.v4.view.a
{
  private final Rect c = new Rect();

  e(DrawerLayout paramDrawerLayout)
  {
  }

  private void a(android.support.v4.view.a.a parama, ViewGroup paramViewGroup)
  {
    int i = paramViewGroup.getChildCount();
    int j = 0;
    if (j < i)
    {
      View localView = paramViewGroup.getChildAt(j);
      if (!b(localView))
        switch (at.c(localView))
        {
        case 3:
        case 4:
        default:
        case 2:
        case 0:
        case 1:
        }
      while (true)
      {
        j++;
        break;
        if ((localView instanceof ViewGroup))
        {
          a(parama, (ViewGroup)localView);
          continue;
          at.d(localView);
          parama.b(localView);
        }
      }
    }
  }

  private boolean b(View paramView)
  {
    View localView = this.b.a();
    return (localView != null) && (localView != paramView);
  }

  public final void a(View paramView, android.support.v4.view.a.a parama)
  {
    android.support.v4.view.a.a locala = android.support.v4.view.a.a.a(parama);
    super.a(paramView, locala);
    parama.a(paramView);
    ViewParent localViewParent = at.g(paramView);
    if ((localViewParent instanceof View))
      parama.c((View)localViewParent);
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
    locala.o();
    a(parama, (ViewGroup)paramView);
  }

  public final boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    if (!b(paramView))
      return super.a(paramViewGroup, paramView, paramAccessibilityEvent);
    return false;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
