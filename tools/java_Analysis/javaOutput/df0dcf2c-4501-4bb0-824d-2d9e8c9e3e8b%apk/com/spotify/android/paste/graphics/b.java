package com.spotify.android.paste.graphics;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

final class b
  implements TransformationMethod
{
  private Locale a;

  public b(Context paramContext)
  {
    this.a = paramContext.getResources().getConfiguration().locale;
  }

  public final CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    if (paramCharSequence == null)
      return null;
    return paramCharSequence.toString().toUpperCase(this.a);
  }

  public final void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect)
  {
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.graphics.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
