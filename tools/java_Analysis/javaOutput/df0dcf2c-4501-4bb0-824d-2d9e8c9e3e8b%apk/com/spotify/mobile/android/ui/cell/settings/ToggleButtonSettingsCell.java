package com.spotify.mobile.android.ui.cell.settings;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.SwitchView;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ClientEventFactory;

public class ToggleButtonSettingsCell extends AbstractSettingsCell
{
  protected boolean c;
  protected SwitchView d;
  private ClientEvent.SubEvent e;
  private int f = -1;
  private View.OnClickListener g = new ToggleButtonSettingsCell.1(this);
  private CompoundButton.OnCheckedChangeListener h = new ToggleButtonSettingsCell.2(this);

  public ToggleButtonSettingsCell(Context paramContext)
  {
    super(paramContext);
  }

  public ToggleButtonSettingsCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static ToggleButtonSettingsCell a(Context paramContext, ViewGroup paramViewGroup)
  {
    return (ToggleButtonSettingsCell)LayoutInflater.from(paramContext).inflate(2130903256, paramViewGroup, false);
  }

  public final void a(int paramInt)
  {
    this.f = paramInt;
  }

  protected final void a(ContentValues paramContentValues)
  {
    boolean bool = this.d.isChecked();
    paramContentValues.put(this.b, Boolean.valueOf(bool));
    a(this.e, Boolean.valueOf(bool));
  }

  public final void a(Cursor paramCursor)
  {
    setOnClickListener(null);
    this.d.setOnCheckedChangeListener(null);
    if (paramCursor.getInt(paramCursor.getColumnIndexOrThrow(this.b)) != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.c = bool;
      this.d.setChecked(this.c);
      setOnClickListener(this.g);
      this.d.setOnCheckedChangeListener(this.h);
      return;
    }
  }

  public final void a(String paramString)
  {
    super.a(paramString);
    new ClientEventFactory();
    this.e = ClientEventFactory.a(paramString);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a.d();
    this.a.a(false);
    this.d = new SwitchView(getContext());
    this.a.b(this.d);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.cell.settings.ToggleButtonSettingsCell
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
