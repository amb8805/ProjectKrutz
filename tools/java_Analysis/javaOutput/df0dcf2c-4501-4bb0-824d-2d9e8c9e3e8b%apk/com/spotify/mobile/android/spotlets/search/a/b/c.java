package com.spotify.mobile.android.spotlets.search.a.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.ui.b.a;
import com.spotify.mobile.android.util.dd;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.ae;

public final class c
{
  public static String a(int paramInt, Number paramNumber, Context paramContext)
  {
    if (paramNumber != null)
    {
      Resources localResources = paramContext.getResources();
      int i = paramNumber.intValue();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramNumber.intValue());
      return localResources.getQuantityString(paramInt, i, arrayOfObject);
    }
    return null;
  }

  public static void a(ImageView paramImageView, String paramString, Drawable paramDrawable, boolean paramBoolean)
  {
    paramImageView.setVisibility(0);
    ae localae = ((dd)com.spotify.mobile.android.c.c.a(dd.class)).a().a(paramString).b(paramDrawable).a(paramDrawable);
    if (paramBoolean)
      localae.a(a.a());
    localae.a(paramImageView);
  }

  public static void a(ListItemView paramListItemView, String paramString, Drawable paramDrawable, boolean paramBoolean)
  {
    a(paramListItemView.a(), paramString, paramDrawable, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.a.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
