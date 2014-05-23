package com.spotify.mobile.android.ui.cell.settings;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.SwitchView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.provider.w;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri;

public class LastFmSettingsCell extends AbstractSettingsCell
{
  private SwitchView c;
  private String d = "";
  private String e = "";
  private CompoundButton.OnCheckedChangeListener f;

  public LastFmSettingsCell(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }

  public LastFmSettingsCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
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
  }

  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("lastfm_username", paramString1);
    localContentValues.put("lastfm_password", paramString2);
    paramContext.getContentResolver().update(w.a, localContentValues, null, null);
    ClientEvent localClientEvent1 = new ClientEvent(ClientEvent.Event.a, ClientEvent.SubEvent.bg);
    ClientEvent localClientEvent2 = new ClientEvent(ClientEvent.Event.a, ClientEvent.SubEvent.bh);
    localClientEvent1.a("value", String.valueOf(paramString1));
    localClientEvent2.a("value", "");
    c.a(a.class);
    a.a(paramContext, ViewUri.q, localClientEvent1);
    a.a(paramContext, ViewUri.q, localClientEvent2);
  }

  protected final void a(ContentValues paramContentValues)
  {
  }

  public final void a(Cursor paramCursor)
  {
    this.d = paramCursor.getString(paramCursor.getColumnIndexOrThrow("lastfm_username"));
    this.e = paramCursor.getString(paramCursor.getColumnIndexOrThrow("lastfm_password"));
    this.c.setOnCheckedChangeListener(null);
    SwitchView localSwitchView = this.c;
    if ((!TextUtils.isEmpty(this.d)) && ("xXxXxXxXx".equals(this.e)));
    for (boolean bool = true; ; bool = false)
    {
      localSwitchView.setChecked(bool);
      this.c.setOnCheckedChangeListener(this.f);
      setOnClickListener(new LastFmSettingsCell.1(this));
      this.f = new LastFmSettingsCell.2(this);
      this.c.setOnCheckedChangeListener(this.f);
      return;
    }
  }

  public final void a(String paramString)
  {
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.cell.settings.LastFmSettingsCell
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
