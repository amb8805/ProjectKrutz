package com.spotify.mobile.android.spotlets.artist.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.spotify.mobile.android.spotlets.artist.view.c.b;

public final class a
{
  private TextView a;
  private ToggleButton b;
  private View c;
  private final Context d;
  private final b e;

  public a(Context paramContext, b paramb)
  {
    this.d = paramContext;
    this.e = paramb;
    this.c = LayoutInflater.from(this.d).inflate(2130903161, null);
    this.a = ((TextView)this.c.findViewById(2131362282));
    this.b = ((ToggleButton)this.c.findViewById(2131362452));
    this.b.setOnClickListener(new a.1(this));
    b(false);
    this.c = this.c;
  }

  private void b(boolean paramBoolean)
  {
    int j;
    ToggleButton localToggleButton;
    int i;
    if (this.a != null)
    {
      TextView localTextView = this.a;
      if (paramBoolean)
      {
        j = 0;
        localTextView.setVisibility(j);
      }
    }
    else if (this.b != null)
    {
      localToggleButton = this.b;
      i = 0;
      if (!paramBoolean)
        break label58;
    }
    while (true)
    {
      localToggleButton.setVisibility(i);
      return;
      j = 8;
      break;
      label58: i = 8;
    }
  }

  public final View a()
  {
    return this.c;
  }

  public final void a(boolean paramBoolean)
  {
    this.b.setEnabled(paramBoolean);
  }

  public final void a(boolean paramBoolean, int paramInt)
  {
    ToggleButton localToggleButton = this.b;
    if (paramBoolean);
    for (int i = 2131689507; ; i = 2131689506)
    {
      localToggleButton.setText(i);
      this.b.setChecked(paramBoolean);
      TextView localTextView = this.a;
      Resources localResources = this.d.getResources();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      localTextView.setText(localResources.getQuantityString(2131623936, paramInt, arrayOfObject));
      b(true);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
