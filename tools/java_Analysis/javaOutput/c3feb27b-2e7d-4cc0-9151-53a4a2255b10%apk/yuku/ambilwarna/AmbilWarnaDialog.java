package yuku.ambilwarna;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;

public class AmbilWarnaDialog
{
  final float[] currentColorHsv = new float[3];
  final AlertDialog dialog;
  final AmbilWarnaDialog.OnAmbilWarnaListener listener;
  final ViewGroup viewContainer;
  final ImageView viewCursor;
  final View viewHue;
  final View viewNewColor;
  final View viewOldColor;
  final AmbilWarnaKotak viewSatVal;
  final ImageView viewTarget;

  public AmbilWarnaDialog(Context paramContext, int paramInt, AmbilWarnaDialog.OnAmbilWarnaListener paramOnAmbilWarnaListener)
  {
    this.listener = paramOnAmbilWarnaListener;
    Color.colorToHSV(paramInt, this.currentColorHsv);
    View localView = LayoutInflater.from(paramContext).inflate(R.layout.ambilwarna_dialog, null);
    this.viewHue = localView.findViewById(R.id.ambilwarna_viewHue);
    this.viewSatVal = ((AmbilWarnaKotak)localView.findViewById(R.id.ambilwarna_viewSatBri));
    this.viewCursor = ((ImageView)localView.findViewById(R.id.ambilwarna_cursor));
    this.viewOldColor = localView.findViewById(R.id.ambilwarna_warnaLama);
    this.viewNewColor = localView.findViewById(R.id.ambilwarna_warnaBaru);
    this.viewTarget = ((ImageView)localView.findViewById(R.id.ambilwarna_target));
    this.viewContainer = ((ViewGroup)localView.findViewById(R.id.ambilwarna_viewContainer));
    this.viewSatVal.setHue(getHue());
    this.viewOldColor.setBackgroundColor(paramInt);
    this.viewNewColor.setBackgroundColor(paramInt);
    this.viewHue.setOnTouchListener(new AmbilWarnaDialog.1(this));
    this.viewSatVal.setOnTouchListener(new AmbilWarnaDialog.2(this));
    this.dialog = new AlertDialog.Builder(paramContext).setPositiveButton(17039370, new AmbilWarnaDialog.3(this)).setNegativeButton(17039360, new AmbilWarnaDialog.4(this)).setOnCancelListener(new AmbilWarnaDialog.5(this)).create();
    this.dialog.setView(localView, 0, 0, 0, 0);
    localView.getViewTreeObserver().addOnGlobalLayoutListener(new AmbilWarnaDialog.6(this, localView));
  }

  private int getColor()
  {
    return Color.HSVToColor(this.currentColorHsv);
  }

  private float getHue()
  {
    return this.currentColorHsv[0];
  }

  private float getSat()
  {
    return this.currentColorHsv[1];
  }

  private float getVal()
  {
    return this.currentColorHsv[2];
  }

  private void setHue(float paramFloat)
  {
    this.currentColorHsv[0] = paramFloat;
  }

  private void setSat(float paramFloat)
  {
    this.currentColorHsv[1] = paramFloat;
  }

  private void setVal(float paramFloat)
  {
    this.currentColorHsv[2] = paramFloat;
  }

  public AlertDialog getDialog()
  {
    return this.dialog;
  }

  protected void moveCursor()
  {
    float f = this.viewHue.getMeasuredHeight() - getHue() * this.viewHue.getMeasuredHeight() / 360.0F;
    if (f == this.viewHue.getMeasuredHeight())
      f = 0.0F;
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.viewCursor.getLayoutParams();
    localLayoutParams.leftMargin = (int)(this.viewHue.getLeft() - Math.floor(this.viewCursor.getMeasuredWidth() / 2) - this.viewContainer.getPaddingLeft());
    localLayoutParams.topMargin = (int)(f + this.viewHue.getTop() - Math.floor(this.viewCursor.getMeasuredHeight() / 2) - this.viewContainer.getPaddingTop());
    this.viewCursor.setLayoutParams(localLayoutParams);
  }

  protected void moveTarget()
  {
    float f1 = getSat() * this.viewSatVal.getMeasuredWidth();
    float f2 = (1.0F - getVal()) * this.viewSatVal.getMeasuredHeight();
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.viewTarget.getLayoutParams();
    localLayoutParams.leftMargin = (int)(f1 + this.viewSatVal.getLeft() - Math.floor(this.viewTarget.getMeasuredWidth() / 2) - this.viewContainer.getPaddingLeft());
    localLayoutParams.topMargin = (int)(f2 + this.viewSatVal.getTop() - Math.floor(this.viewTarget.getMeasuredHeight() / 2) - this.viewContainer.getPaddingTop());
    this.viewTarget.setLayoutParams(localLayoutParams);
  }

  public void show()
  {
    this.dialog.show();
  }
}

/* Location:
 * Qualified Name:     yuku.ambilwarna.AmbilWarnaDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
