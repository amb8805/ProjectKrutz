package com.spotify.mobile.android.ui.cell;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.mobile.android.model.Story;
import com.spotify.mobile.android.ui.view.PlayButton;
import com.spotify.mobile.android.util.de;

public class StoryCell extends LinearLayout
{
  private Story a;
  private TextView b;
  private TextView c;
  private TextView d;
  private ImageView e;
  private TextView f;
  private TextView g;
  private TextView h;
  private PlayButton i;
  private ImageView j;
  private de k;

  public StoryCell(Context paramContext)
  {
    super(paramContext);
  }

  public StoryCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.e = ((ImageView)findViewById(2131362308));
    this.f = ((TextView)findViewById(2131362306));
    this.c = ((TextView)findViewById(2131362227));
    this.d = ((TextView)findViewById(2131362309));
    this.b = ((TextView)findViewById(2131362305));
    this.g = ((TextView)findViewById(2131362310));
    this.h = ((TextView)findViewById(2131362307));
    this.i = ((PlayButton)findViewById(2131362283));
    this.j = ((ImageView)findViewById(2131362292));
    this.g.setOnClickListener(new StoryCell.1(this));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.cell.StoryCell
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
