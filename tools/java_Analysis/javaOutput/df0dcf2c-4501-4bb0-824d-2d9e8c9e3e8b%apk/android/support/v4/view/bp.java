package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.q;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

final class bp extends a
{
  bp(ViewPager paramViewPager)
  {
  }

  private boolean a()
  {
    return (ViewPager.b(this.b) != null) && (ViewPager.b(this.b).b() > 1);
  }

  public final void a(View paramView, android.support.v4.view.a.a parama)
  {
    super.a(paramView, parama);
    parama.b(ViewPager.class.getName());
    parama.i(a());
    if (this.b.canScrollHorizontally(1))
      parama.a(4096);
    if (this.b.canScrollHorizontally(-1))
      parama.a(8192);
  }

  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.a(paramView, paramInt, paramBundle))
      return true;
    switch (paramInt)
    {
    default:
      return false;
    case 4096:
      if (this.b.canScrollHorizontally(1))
      {
        this.b.a(1 + ViewPager.c(this.b));
        return true;
      }
      return false;
    case 8192:
    }
    if (this.b.canScrollHorizontally(-1))
    {
      this.b.a(-1 + ViewPager.c(this.b));
      return true;
    }
    return false;
  }

  public final void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(ViewPager.class.getName());
    q localq = q.a();
    localq.a(a());
    if ((paramAccessibilityEvent.getEventType() == 4096) && (ViewPager.b(this.b) != null))
    {
      localq.a(ViewPager.b(this.b).b());
      localq.b(ViewPager.c(this.b));
      localq.c(ViewPager.c(this.b));
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.bp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
