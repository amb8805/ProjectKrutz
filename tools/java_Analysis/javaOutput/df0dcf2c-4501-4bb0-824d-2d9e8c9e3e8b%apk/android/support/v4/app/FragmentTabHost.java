package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost
  implements TabHost.OnTabChangeListener
{
  private final ArrayList<k> a = new ArrayList();
  private Context b;
  private g c;
  private int d;
  private TabHost.OnTabChangeListener e;
  private k f;
  private boolean g;

  public FragmentTabHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, new int[] { 16842995 }, 0, 0);
    this.d = localTypedArray.getResourceId(0, 0);
    localTypedArray.recycle();
    super.setOnTabChangedListener(this);
  }

  private l a(String paramString, l paraml)
  {
    Object localObject1 = null;
    int i = 0;
    Object localObject2;
    if (i < this.a.size())
    {
      localObject2 = (k)this.a.get(i);
      if (!k.b((k)localObject2).equals(paramString))
        break label199;
    }
    while (true)
    {
      i++;
      localObject1 = localObject2;
      break;
      if (localObject1 == null)
        throw new IllegalStateException("No tab known for tag " + paramString);
      if (this.f != localObject1)
      {
        if (paraml == null)
          paraml = this.c.a();
        if ((this.f != null) && (k.a(this.f) != null))
          paraml.b(k.a(this.f));
        if (localObject1 != null)
        {
          if (k.a(localObject1) != null)
            break label187;
          k.a(localObject1, Fragment.a(this.b, k.c(localObject1).getName(), k.d(localObject1)));
          paraml.a(this.d, k.a(localObject1), k.b(localObject1));
        }
      }
      while (true)
      {
        this.f = localObject1;
        return paraml;
        label187: paraml.c(k.a(localObject1));
      }
      label199: localObject2 = localObject1;
    }
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    String str = getCurrentTabTag();
    l locall1 = null;
    int i = 0;
    if (i < this.a.size())
    {
      k localk = (k)this.a.get(i);
      k.a(localk, this.c.a(k.b(localk)));
      if ((k.a(localk) != null) && (!k.a(localk).J))
      {
        if (!k.b(localk).equals(str))
          break label98;
        this.f = localk;
      }
      while (true)
      {
        i++;
        break;
        label98: if (locall1 == null)
          locall1 = this.c.a();
        locall1.b(k.a(localk));
      }
    }
    this.g = true;
    l locall2 = a(str, locall1);
    if (locall2 != null)
    {
      locall2.b();
      this.c.b();
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.g = false;
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    FragmentTabHost.SavedState localSavedState = (FragmentTabHost.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    setCurrentTabByTag(localSavedState.a);
  }

  protected Parcelable onSaveInstanceState()
  {
    FragmentTabHost.SavedState localSavedState = new FragmentTabHost.SavedState(super.onSaveInstanceState());
    localSavedState.a = getCurrentTabTag();
    return localSavedState;
  }

  public void onTabChanged(String paramString)
  {
    if (this.g)
    {
      l locall = a(paramString, null);
      if (locall != null)
        locall.b();
    }
    if (this.e != null)
      this.e.onTabChanged(paramString);
  }

  public void setOnTabChangedListener(TabHost.OnTabChangeListener paramOnTabChangeListener)
  {
    this.e = paramOnTabChangeListener;
  }

  @Deprecated
  public void setup()
  {
    throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.FragmentTabHost
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
