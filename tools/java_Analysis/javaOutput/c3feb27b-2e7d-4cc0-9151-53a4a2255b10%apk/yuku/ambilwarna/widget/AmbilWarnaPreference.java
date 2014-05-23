package yuku.ambilwarna.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import yuku.ambilwarna.AmbilWarnaDialog;
import yuku.ambilwarna.R.id;
import yuku.ambilwarna.R.layout;

public class AmbilWarnaPreference extends Preference
{
  int value;

  public AmbilWarnaPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setWidgetLayoutResource(R.layout.ambilwarna_pref_widget);
  }

  public void forceSetValue(int paramInt)
  {
    this.value = paramInt;
    persistInt(paramInt);
    notifyChanged();
  }

  protected void onBindView(View paramView)
  {
    super.onBindView(paramView);
    View localView = paramView.findViewById(R.id.ambilwarna_pref_widget_kotak);
    if (localView != null)
      localView.setBackgroundColor(this.value);
  }

  protected void onClick()
  {
    new AmbilWarnaDialog(getContext(), this.value, new AmbilWarnaPreference.1(this)).show();
  }

  protected Object onGetDefaultValue(TypedArray paramTypedArray, int paramInt)
  {
    return Integer.valueOf(paramTypedArray.getInteger(paramInt, 0));
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!paramParcelable.getClass().equals(AmbilWarnaPreference.SavedState.class))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    AmbilWarnaPreference.SavedState localSavedState = (AmbilWarnaPreference.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    this.value = localSavedState.value;
    notifyChanged();
  }

  protected Parcelable onSaveInstanceState()
  {
    Parcelable localParcelable = super.onSaveInstanceState();
    if (isPersistent())
      return localParcelable;
    AmbilWarnaPreference.SavedState localSavedState = new AmbilWarnaPreference.SavedState(localParcelable);
    localSavedState.value = this.value;
    return localSavedState;
  }

  protected void onSetInitialValue(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean)
    {
      this.value = getPersistedInt(this.value);
      return;
    }
    int i = ((Integer)paramObject).intValue();
    this.value = i;
    persistInt(i);
  }
}

/* Location:
 * Qualified Name:     yuku.ambilwarna.widget.AmbilWarnaPreference
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
