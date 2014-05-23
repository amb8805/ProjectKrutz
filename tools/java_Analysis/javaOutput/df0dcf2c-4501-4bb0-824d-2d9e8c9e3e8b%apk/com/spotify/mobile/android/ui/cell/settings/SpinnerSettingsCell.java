package com.spotify.mobile.android.ui.cell.settings;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ClientEventFactory;
import java.util.Arrays;

public class SpinnerSettingsCell extends AbstractSettingsCell
{
  private ClientEvent.SubEvent c;
  private Spinner d;
  private int e = -1;
  private a f;
  private int[] g;
  private AdapterView.OnItemSelectedListener h = new SpinnerSettingsCell.1(this);

  public SpinnerSettingsCell(Context paramContext)
  {
    super(paramContext);
  }

  public SpinnerSettingsCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public SpinnerSettingsCell(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static SpinnerSettingsCell a(Context paramContext, ViewGroup paramViewGroup)
  {
    return (SpinnerSettingsCell)LayoutInflater.from(paramContext).inflate(2130903255, paramViewGroup, false);
  }

  protected final void a(ContentValues paramContentValues)
  {
    if (this.e >= 0)
    {
      int i = this.f.a(this.e);
      paramContentValues.put(this.b, Integer.valueOf(i));
      a(this.c, Integer.valueOf(i));
    }
  }

  public final void a(Cursor paramCursor)
  {
    this.d.setOnItemSelectedListener(null);
    this.e = this.f.b(paramCursor.getInt(paramCursor.getColumnIndexOrThrow(this.b)));
    if (this.e >= this.d.getCount())
      this.e = (-1 + this.d.getCount());
    this.d.setSelection(this.e);
    this.d.setOnItemSelectedListener(this.h);
  }

  public final void a(SpinnerAdapter paramSpinnerAdapter)
  {
    this.d.setAdapter(paramSpinnerAdapter);
  }

  public final void a(a parama)
  {
    this.f = parama;
  }

  public final void a(String paramString)
  {
    super.a(paramString);
    new ClientEventFactory();
    this.c = ClientEventFactory.a(paramString);
  }

  public final void a(int[] paramArrayOfInt)
  {
    this.g = Arrays.copyOf(paramArrayOfInt, paramArrayOfInt.length);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a.d();
    this.a.a(false);
    this.d = new Spinner(getContext());
    this.a.b(this.d);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.cell.settings.SpinnerSettingsCell
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
