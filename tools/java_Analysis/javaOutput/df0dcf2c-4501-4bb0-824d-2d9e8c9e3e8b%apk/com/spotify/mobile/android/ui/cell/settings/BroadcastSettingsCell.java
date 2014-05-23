package com.spotify.mobile.android.ui.cell.settings;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.SwitchView;
import com.spotify.mobile.android.service.ag;
import com.spotify.mobile.android.util.am;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cx;

public class BroadcastSettingsCell extends AbstractSettingsCell
{
  private SwitchView c;
  private boolean d;

  public BroadcastSettingsCell(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }

  public BroadcastSettingsCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }

  public BroadcastSettingsCell(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }

  private void a(Context paramContext)
  {
    ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(2130903256, this);
    super.onFinishInflate();
    this.a.d();
    this.a.a(false);
    this.c = new SwitchView(getContext());
    this.a.b(this.c);
    setOnClickListener(new BroadcastSettingsCell.1(this));
    this.c.setOnCheckedChangeListener(new BroadcastSettingsCell.2(this));
  }

  protected final void a(ContentValues paramContentValues)
  {
    cx localcx = cw.a(getContext()).a();
    localcx.a(ag.a, this.d);
    localcx.b();
  }

  public final void a(Cursor paramCursor)
  {
    cw localcw = cw.a(getContext());
    boolean bool = true;
    if (!localcw.a(ag.a))
      bool = am.a(paramCursor, "post_to_facebook");
    this.d = localcw.a(ag.a, bool);
    this.c.setChecked(this.d);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.cell.settings.BroadcastSettingsCell
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
