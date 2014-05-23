package com.spotify.mobile.android.ui.cell.settings;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.provider.w;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri;

public abstract class AbstractSettingsCell extends RelativeLayout
{
  protected ListItemView a;
  protected String b;
  private View.OnClickListener c;
  private a d;

  public AbstractSettingsCell(Context paramContext)
  {
    super(paramContext);
  }

  AbstractSettingsCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public AbstractSettingsCell(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a()
  {
    if (this.c != null)
      this.c.onClick(this);
  }

  protected abstract void a(ContentValues paramContentValues);

  public abstract void a(Cursor paramCursor);

  protected final void a(ClientEvent.SubEvent paramSubEvent, Object paramObject)
  {
    ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.a, paramSubEvent);
    localClientEvent.a("value", String.valueOf(paramObject));
    a.a(getContext(), ViewUri.q, localClientEvent);
  }

  public void a(String paramString)
  {
    this.b = paramString;
  }

  protected final void b()
  {
    ContentValues localContentValues = new ContentValues();
    a(localContentValues);
    if (localContentValues.size() > 0)
      getContext().getContentResolver().update(w.a, localContentValues, null, null);
  }

  public void b(String paramString)
  {
    this.a.a(Html.fromHtml(paramString));
  }

  public void c(String paramString)
  {
    this.a.b(Html.fromHtml(paramString));
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    if (isInEditMode())
      return;
    this.a = ((ListItemView)findViewById(2131362644));
    this.a.a(false);
    this.a.c().setEllipsize(null);
    this.a.c().setSingleLine(false);
    this.d = ((a)c.a(a.class));
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.c = paramOnClickListener;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.cell.settings.AbstractSettingsCell
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
