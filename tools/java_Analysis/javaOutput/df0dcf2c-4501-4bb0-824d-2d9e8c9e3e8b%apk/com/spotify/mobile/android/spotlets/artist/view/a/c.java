package com.spotify.mobile.android.spotlets.artist.view.a;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.ContextMenu;
import com.google.common.collect.ak;
import java.util.Map;

public abstract class c<T>
{
  private final Context a;
  private final String b;
  private final b c;
  private final Map<String, T> d = ak.a();
  private final c<T>.d e;

  public c(Context paramContext, String paramString, b paramb)
  {
    this.a = paramContext;
    this.b = paramString;
    this.e = new d(this, paramContext.getContentResolver());
    this.c = paramb;
  }

  protected final Context a()
  {
    return this.a;
  }

  protected abstract T a(Cursor paramCursor);

  protected abstract void a(ContextMenu paramContextMenu, T paramT);

  protected abstract void a(String paramString);

  protected final void a(String paramString1, Uri paramUri, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2)
  {
    this.e.startQuery(0, paramString1, paramUri, paramArrayOfString1, paramString2, paramArrayOfString2, null);
  }

  public final void a(String paramString, ContextMenu paramContextMenu)
  {
    if (this.d.containsKey(paramString))
    {
      a(paramContextMenu, this.d.get(paramString));
      return;
    }
    a(paramString);
  }

  protected final String b()
  {
    return this.b;
  }

  public final void c()
  {
    this.d.clear();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
