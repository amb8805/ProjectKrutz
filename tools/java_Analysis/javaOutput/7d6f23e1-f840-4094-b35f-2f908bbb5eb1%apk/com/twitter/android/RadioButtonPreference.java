package com.twitter.android;

import android.content.Context;
import android.preference.CheckBoxPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.RadioButton;

public class RadioButtonPreference extends CheckBoxPreference
{
  private boolean a;
  private AccessibilityManager b = (AccessibilityManager)getContext().getSystemService("accessibility");

  public RadioButtonPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public RadioButtonPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setWidgetLayoutResource(2130903086);
  }

  protected void onBindView(View paramView)
  {
    super.onBindView(paramView);
    RadioButton localRadioButton = (RadioButton)paramView.findViewById(2131165299);
    localRadioButton.setChecked(isChecked());
    if ((this.a) && (this.b.isEnabled()) && (localRadioButton.isEnabled()))
    {
      this.a = false;
      localRadioButton.sendAccessibilityEventUnchecked(AccessibilityEvent.obtain(1));
    }
  }

  protected void onClick()
  {
    this.a = true;
    super.onClick();
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.RadioButtonPreference
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
