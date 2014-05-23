package com.spotify.android.paste.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.View;
import android.widget.TextView;
import com.spotify.android.paste.graphics.a;
import com.spotify.android.paste.graphics.g;
import java.util.HashMap;
import java.util.Map;

public final class FontSupport
  implements LayoutInflater.Factory
{
  private static Map<String, FontSupport.ViewFactory> a = new HashMap();

  static
  {
    for (FontSupport.ViewFactory localViewFactory : FontSupport.ViewFactory.values())
      a.put(localViewFactory.a(), localViewFactory);
  }

  private FontSupport()
  {
  }

  public static void a(Activity paramActivity)
  {
    if (paramActivity.getLayoutInflater().getFactory() == null)
      paramActivity.getLayoutInflater().setFactory(new FontSupport());
  }

  public final View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    FontSupport.ViewFactory localViewFactory = (FontSupport.ViewFactory)a.get(paramString);
    if (localViewFactory == null)
    {
      if ("fragment".equals(paramString))
        throw new IllegalArgumentException("<fragment> tags are not supported when FontSupport is in use.");
      return null;
    }
    TextView localTextView = localViewFactory.a(paramContext, paramAttributeSet);
    int i = localViewFactory.b();
    if (!localTextView.isInEditMode())
    {
      Typeface localTypeface = g.a(paramContext, paramAttributeSet, i);
      if (localTypeface != null)
        localTextView.setTypeface(localTypeface);
    }
    if (!localTextView.isInEditMode())
      a.a(paramContext, localTextView, paramAttributeSet, i);
    return localTextView;
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.app.FontSupport
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
