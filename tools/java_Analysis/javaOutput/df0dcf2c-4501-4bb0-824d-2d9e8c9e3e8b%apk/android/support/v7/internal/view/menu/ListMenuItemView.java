package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.a.f;
import android.support.v7.a.h;
import android.support.v7.a.k;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout
  implements ad
{
  private r a;
  private ImageView b;
  private RadioButton c;
  private TextView d;
  private CheckBox e;
  private TextView f;
  private Drawable g;
  private int h;
  private Context i;
  private boolean j;
  private int k;
  private Context l;
  private LayoutInflater m;
  private boolean n;

  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    this.l = paramContext;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, k.l, paramInt, 0);
    this.g = localTypedArray.getDrawable(5);
    this.h = localTypedArray.getResourceId(1, -1);
    this.j = localTypedArray.getBoolean(7, false);
    this.i = paramContext;
    localTypedArray.recycle();
  }

  private LayoutInflater d()
  {
    if (this.m == null)
      this.m = LayoutInflater.from(this.l);
    return this.m;
  }

  public final r a()
  {
    return this.a;
  }

  public final void a(r paramr)
  {
    this.a = paramr;
    this.k = 0;
    int i1;
    label60: Object localObject1;
    Object localObject2;
    label149: int i4;
    label174: label213: int i2;
    label242: int i3;
    label308: Drawable localDrawable2;
    if (paramr.isVisible())
    {
      i1 = 0;
      setVisibility(i1);
      CharSequence localCharSequence = paramr.a(this);
      if (localCharSequence == null)
        break label441;
      this.d.setText(localCharSequence);
      if (this.d.getVisibility() != 0)
        this.d.setVisibility(0);
      boolean bool1 = paramr.isCheckable();
      if ((bool1) || (this.c != null) || (this.e != null))
      {
        if (!this.a.f())
          break label465;
        if (this.c == null)
        {
          this.c = ((RadioButton)d().inflate(h.n, this, false));
          addView(this.c);
        }
        RadioButton localRadioButton2 = this.c;
        CheckBox localCheckBox2 = this.e;
        localObject1 = localRadioButton2;
        localObject2 = localCheckBox2;
        if (!bool1)
          break label529;
        ((CompoundButton)localObject1).setChecked(this.a.isChecked());
        if (!bool1)
          break label522;
        i4 = 0;
        if (((CompoundButton)localObject1).getVisibility() != i4)
          ((CompoundButton)localObject1).setVisibility(i4);
        if ((localObject2 != null) && (((CompoundButton)localObject2).getVisibility() != 8))
          ((CompoundButton)localObject2).setVisibility(8);
      }
      boolean bool2 = paramr.e();
      paramr.c();
      if ((!bool2) || (!this.a.e()))
        break label564;
      i2 = 0;
      if (i2 == 0)
        this.f.setText(this.a.d());
      if (this.f.getVisibility() != i2)
        this.f.setVisibility(i2);
      Drawable localDrawable1 = paramr.getIcon();
      if ((!this.a.g()) && (!this.n))
        break label571;
      i3 = 1;
      if (((i3 != 0) || (this.j)) && ((this.b != null) || (localDrawable1 != null) || (this.j)))
      {
        if (this.b == null)
        {
          this.b = ((ImageView)d().inflate(h.l, this, false));
          addView(this.b, 0);
        }
        if ((localDrawable1 == null) && (!this.j))
          break label583;
        ImageView localImageView = this.b;
        if (i3 == 0)
          break label577;
        localDrawable2 = localDrawable1;
        label401: localImageView.setImageDrawable(localDrawable2);
        if (this.b.getVisibility() != 0)
          this.b.setVisibility(0);
      }
    }
    while (true)
    {
      setEnabled(paramr.isEnabled());
      return;
      i1 = 8;
      break;
      label441: if (this.d.getVisibility() == 8)
        break label60;
      this.d.setVisibility(8);
      break label60;
      label465: if (this.e == null)
      {
        this.e = ((CheckBox)d().inflate(h.k, this, false));
        addView(this.e);
      }
      CheckBox localCheckBox1 = this.e;
      RadioButton localRadioButton1 = this.c;
      localObject1 = localCheckBox1;
      localObject2 = localRadioButton1;
      break label149;
      label522: i4 = 8;
      break label174;
      label529: if (this.e != null)
        this.e.setVisibility(8);
      if (this.c == null)
        break label213;
      this.c.setVisibility(8);
      break label213;
      label564: i2 = 8;
      break label242;
      label571: i3 = 0;
      break label308;
      label577: localDrawable2 = null;
      break label401;
      label583: this.b.setVisibility(8);
    }
  }

  public final boolean b()
  {
    return false;
  }

  public final void c()
  {
    this.n = true;
    this.j = true;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    setBackgroundDrawable(this.g);
    this.d = ((TextView)findViewById(f.E));
    if (this.h != -1)
      this.d.setTextAppearance(this.i, this.h);
    this.f = ((TextView)findViewById(f.B));
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.b != null) && (this.j))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)this.b.getLayoutParams();
      if ((localLayoutParams.height > 0) && (localLayoutParams1.width <= 0))
        localLayoutParams1.width = localLayoutParams.height;
    }
    super.onMeasure(paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.view.menu.ListMenuItemView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
