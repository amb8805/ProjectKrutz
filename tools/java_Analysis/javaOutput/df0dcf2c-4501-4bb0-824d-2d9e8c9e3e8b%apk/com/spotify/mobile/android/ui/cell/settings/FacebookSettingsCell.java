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
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.am;

public class FacebookSettingsCell extends AbstractSettingsCell
{
  private SwitchView c;
  private boolean d;
  private boolean e;
  private View.OnClickListener f = new FacebookSettingsCell.1(this);
  private View.OnClickListener g = new FacebookSettingsCell.2(this);
  private CompoundButton.OnCheckedChangeListener h = new FacebookSettingsCell.3(this);
  private boolean i;

  public FacebookSettingsCell(Context paramContext)
  {
    super(paramContext);
  }

  public FacebookSettingsCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public FacebookSettingsCell(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static FacebookSettingsCell a(Context paramContext, ViewGroup paramViewGroup)
  {
    return (FacebookSettingsCell)LayoutInflater.from(paramContext).inflate(2130903254, paramViewGroup, false);
  }

  private void c()
  {
    this.a.d();
    this.a.a(false);
    this.a.a(getContext().getString(2131690200));
    setOnClickListener(this.f);
    boolean bool1 = this.i;
    boolean bool2 = false;
    if (!bool1)
      bool2 = true;
    setEnabled(bool2);
  }

  private void d()
  {
    setOnClickListener(null);
    if (this.c != null)
      this.c.setOnCheckedChangeListener(null);
  }

  protected final void a(ContentValues paramContentValues)
  {
    Assertion.a(this.d, "Should never have registered a click handler that leads to saveSetting if we are not connected to facebook");
    if (this.c != null);
    for (boolean bool = this.c.isChecked(); ; bool = false)
    {
      paramContentValues.put("post_to_facebook", Boolean.valueOf(bool));
      a(ClientEvent.SubEvent.bk, Boolean.valueOf(bool));
      return;
    }
  }

  public final void a(Cursor paramCursor)
  {
    Assertion.a(paramCursor, "Don't pass null cursors to us");
    Assertion.a(paramCursor.moveToFirst(), "Don't pass empty cursors to us");
    this.i = am.a(paramCursor, "offline_mode");
    this.d = am.a(paramCursor, "facebook_connected");
    this.e = am.a(paramCursor, "post_to_facebook");
    if (this.d)
    {
      this.a.d();
      this.a.a(false);
      this.a.a(getContext().getString(2131690249));
      this.a.b(getContext().getString(2131690247));
      this.c = new SwitchView(getContext());
      this.a.b(this.c);
      d();
      this.c.setChecked(this.e);
      setOnClickListener(this.g);
      if (this.c != null)
        this.c.setOnCheckedChangeListener(this.h);
      return;
    }
    d();
    c();
  }

  public final void a(String paramString)
  {
  }

  public final void b(String paramString)
  {
  }

  public final void c(String paramString)
  {
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    if (isInEditMode())
      return;
    c();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.cell.settings.FacebookSettingsCell
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
