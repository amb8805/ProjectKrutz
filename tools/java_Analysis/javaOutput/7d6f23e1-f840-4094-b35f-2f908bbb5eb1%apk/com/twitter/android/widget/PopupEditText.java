package com.twitter.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.twitter.android.fq;

public class PopupEditText extends EditText
  implements View.OnClickListener, AdapterView.OnItemClickListener
{
  private final PopupWindow a;
  private final PopupEditText.DropDownListView b;
  private final int c;
  private final int d;
  private final int e;
  private View.OnClickListener f;
  private ListAdapter g;

  public PopupEditText(Context paramContext)
  {
    this(paramContext, null);
  }

  public PopupEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130771980);
  }

  public PopupEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, fq.PopupEditText, paramInt, 0);
    this.c = localTypedArray.getDimensionPixelOffset(1, 0);
    this.d = localTypedArray.getDimensionPixelOffset(2, 0);
    this.e = localTypedArray.getDimensionPixelSize(3, 100);
    PopupEditText.DropDownListView localDropDownListView = new PopupEditText.DropDownListView(paramContext, paramAttributeSet, 16842861);
    localDropDownListView.setSelector(localTypedArray.getDrawable(0));
    localDropDownListView.setOnItemClickListener(this);
    this.b = localDropDownListView;
    PopupWindow localPopupWindow = new PopupWindow(paramContext, paramAttributeSet, 2130771980);
    localPopupWindow.setSoftInputMode(16);
    localPopupWindow.setOutsideTouchable(true);
    localPopupWindow.setContentView(localDropDownListView);
    this.a = localPopupWindow;
    super.setOnClickListener(this);
    localTypedArray.recycle();
  }

  public final void a()
  {
    PopupEditText.DropDownListView localDropDownListView = this.b;
    if (localDropDownListView.getCount() == 0)
      return;
    PopupWindow localPopupWindow = this.a;
    int i = Math.min(Math.min(localDropDownListView.getCount(), 2) * this.e, localPopupWindow.getMaxAvailableHeight(this));
    int j = getWidth();
    if (localPopupWindow.isShowing())
    {
      localPopupWindow.update(this, this.d, this.c, j, i);
      return;
    }
    localPopupWindow.setWidth(j);
    localPopupWindow.setHeight(i);
    localPopupWindow.setWindowLayoutMode(0, 0);
    localPopupWindow.setInputMethodMode(1);
    localPopupWindow.showAsDropDown(this, this.d, this.c);
  }

  public final void a(ListAdapter paramListAdapter)
  {
    this.b.setAdapter(paramListAdapter);
    this.g = paramListAdapter;
  }

  public final void b()
  {
    this.a.dismiss();
  }

  public void onClick(View paramView)
  {
    if (this.a.isShowing())
    {
      this.a.setInputMethodMode(1);
      a();
    }
    if (this.f != null)
      this.f.onClick(paramView);
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.a.dismiss();
  }

  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    if (!paramBoolean)
      this.a.dismiss();
  }

  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    setText((String)paramAdapterView.getItemAtPosition(paramInt));
    setSelection(0, length());
    this.a.dismiss();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    PopupEditText.DropDownListView localDropDownListView;
    int i;
    PopupWindow localPopupWindow;
    int j;
    int k;
    int m;
    if (this.a.isShowing())
    {
      localDropDownListView = this.b;
      if ((paramInt != 62) && ((localDropDownListView.getSelectedItemPosition() >= 0) || ((paramInt != 66) && (paramInt != 23))))
      {
        i = localDropDownListView.getSelectedItemPosition();
        localPopupWindow = this.a;
        if (localPopupWindow.isAboveAnchor())
          break label163;
        j = 1;
        ListAdapter localListAdapter = this.g;
        k = 2147483647;
        if (localListAdapter == null)
          break label211;
        m = localListAdapter.getCount();
        k = 0;
      }
    }
    while (true)
    {
      if (localDropDownListView.onKeyDown(paramInt, paramKeyEvent))
      {
        localPopupWindow.setInputMethodMode(2);
        localDropDownListView.requestFocusFromTouch();
        a();
        switch (paramInt)
        {
        default:
        case 19:
        case 20:
        case 23:
        case 66:
        }
      }
      label163: label191: 
      do
      {
        do
        {
          return super.onKeyDown(paramInt, paramKeyEvent);
          j = 0;
          break;
          return true;
          if ((j == 0) || (paramInt != 20))
            break label191;
        }
        while (i != m);
        return true;
      }
      while ((j != 0) || (paramInt != 19) || (i != k));
      return true;
      label211: m = -2147483648;
    }
  }

  public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (this.a.isShowing()))
    {
      if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
      {
        getKeyDispatcherState().startTracking(paramKeyEvent, this);
        return true;
      }
      if (paramKeyEvent.getAction() == 1)
      {
        getKeyDispatcherState().handleUpEvent(paramKeyEvent);
        if ((paramKeyEvent.isTracking()) && (!paramKeyEvent.isCanceled()))
        {
          this.a.dismiss();
          return true;
        }
      }
    }
    return super.onKeyPreIme(paramInt, paramKeyEvent);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    PopupEditText.DropDownListView localDropDownListView = this.b;
    int i = localDropDownListView.getSelectedItemPosition();
    if ((this.a.isShowing()) && (i >= 0) && (localDropDownListView.onKeyUp(paramInt, paramKeyEvent)));
    switch (paramInt)
    {
    default:
      return super.onKeyUp(paramInt, paramKeyEvent);
    case 23:
    case 66:
    }
    onItemClick(localDropDownListView, localDropDownListView.getSelectedView(), i, localDropDownListView.getSelectedItemId());
    return true;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if (!paramBoolean)
      this.a.dismiss();
  }

  protected boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.a.isShowing())
      a();
    return bool;
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.f = paramOnClickListener;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.PopupEditText
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
