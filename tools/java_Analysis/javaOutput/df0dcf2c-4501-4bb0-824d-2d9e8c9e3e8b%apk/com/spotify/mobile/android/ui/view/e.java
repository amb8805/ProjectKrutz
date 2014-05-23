package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.g;

public final class e extends LinearLayout
{
  private final ListItemView a;
  private final ListItemView b;
  private final ImageView c;
  private final TextView d;
  private final PlayButton e;

  public e(Context paramContext)
  {
    super(paramContext);
    setOrientation(1);
    inflate(paramContext, 2130903122, this);
    this.a = ((ListItemView)findViewById(2131362346));
    this.a.b().setSingleLine(false);
    this.a.a(false);
    g.b(paramContext, this.a.b(), 2130772388);
    this.d = ((TextView)findViewById(2131362347));
    g.b(paramContext, this.a.c(), 2130772391);
    this.b = ((ListItemView)findViewById(2131362350));
    this.b.a(false);
    TextView localTextView = this.b.b();
    g.b(paramContext, localTextView, 2130772388);
    localTextView.setTextColor(g.b(paramContext, 2130772382));
    localTextView.setTypeface(localTextView.getTypeface(), 1);
    this.e = ((PlayButton)findViewById(2131362283));
    this.c = ((ImageView)findViewById(2131362349));
  }

  public final TextView a()
  {
    return this.a.b();
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.b.a(paramCharSequence);
  }

  public final void a(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    TextView localTextView = this.a.c();
    if (TextUtils.isEmpty(paramCharSequence1))
      localTextView.setVisibility(8);
    while (TextUtils.isEmpty(paramCharSequence2))
    {
      this.d.setVisibility(8);
      return;
      localTextView.setVisibility(0);
      localTextView.setText(paramCharSequence1);
    }
    this.d.setVisibility(0);
    this.d.setText(paramCharSequence2);
  }

  public final ImageView b()
  {
    return this.a.a();
  }

  public final void b(CharSequence paramCharSequence)
  {
    this.b.b(paramCharSequence);
  }

  public final PlayButton c()
  {
    return this.e;
  }

  public final void d()
  {
    this.a.d();
    this.a.a(false);
    this.d.setText("");
    this.b.d();
    this.b.a(false);
    this.e.a(false);
    this.c.setImageResource(0);
  }

  public final ImageView e()
  {
    return this.c;
  }

  protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4))
    {
      ViewGroup.LayoutParams localLayoutParams = this.c.getLayoutParams();
      localLayoutParams.height = paramInt1;
      localLayoutParams.width = paramInt1;
      this.c.setLayoutParams(localLayoutParams);
    }
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
