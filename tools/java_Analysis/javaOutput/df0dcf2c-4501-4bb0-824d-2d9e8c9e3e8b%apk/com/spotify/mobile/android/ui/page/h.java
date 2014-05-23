package com.spotify.mobile.android.ui.page;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import com.spotify.mobile.android.ui.fragments.logic.FeatureFragment;
import com.spotify.mobile.android.ui.fragments.logic.b;

public final class h extends j
  implements RadioGroup.OnCheckedChangeListener
{
  private b b;
  private final TextView c;

  public h(Context paramContext, ViewGroup paramViewGroup, b paramb, int paramInt)
  {
    super(paramContext, paramViewGroup);
    this.b = paramb;
    b(2130903220);
    RadioGroup localRadioGroup = (RadioGroup)c(2131362570);
    RadioButton localRadioButton1 = (RadioButton)c(2131362589);
    RadioButton localRadioButton2 = (RadioButton)c(2131362571);
    RadioButton localRadioButton3 = (RadioButton)c(2131362572);
    ((TextView)c(2131362227)).setText(paramInt);
    this.c = ((TextView)c(2131362590));
    localRadioGroup.setOnCheckedChangeListener(this);
    if (this.b.g())
    {
      if (this.b.a())
      {
        localRadioButton2.toggle();
        return;
      }
      localRadioButton3.toggle();
      return;
    }
    localRadioButton1.toggle();
  }

  public final void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 2131362589:
    case 2131362571:
    case 2131362572:
    }
    while (true)
    {
      TextView localTextView = this.c;
      Context localContext = d();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.b.h();
      localTextView.setText(localContext.getString(2131689874, arrayOfObject));
      return;
      FeatureFragment.a(this.b);
      continue;
      FeatureFragment.a(this.b, true);
      continue;
      FeatureFragment.a(this.b, false);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.page.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
