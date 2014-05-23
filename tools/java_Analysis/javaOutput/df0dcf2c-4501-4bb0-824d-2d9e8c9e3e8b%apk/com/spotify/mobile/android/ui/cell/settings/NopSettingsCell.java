package com.spotify.mobile.android.ui.cell.settings;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class NopSettingsCell extends AbstractSettingsCell
{
  public NopSettingsCell(Context paramContext)
  {
    super(paramContext);
  }

  public NopSettingsCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public NopSettingsCell(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static NopSettingsCell a(Context paramContext, ViewGroup paramViewGroup)
  {
    return (NopSettingsCell)LayoutInflater.from(paramContext).inflate(2130903252, paramViewGroup, false);
  }

  protected final void a(ContentValues paramContentValues)
  {
  }

  public final void a(Cursor paramCursor)
  {
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.cell.settings.NopSettingsCell
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
