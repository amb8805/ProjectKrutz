package com.spotify.mobile.android.util;

import android.content.SharedPreferences.Editor;
import org.json.JSONArray;

public final class cx
{
  protected SharedPreferences.Editor a;
  private boolean b;

  private cx(SharedPreferences.Editor paramEditor)
  {
    this.a = paramEditor;
    this.b = false;
  }

  public final cx a(cy paramcy)
  {
    cc.a(paramcy);
    this.a.remove(cy.a(paramcy));
    return this;
  }

  public final cx a(cy paramcy, int paramInt)
  {
    cc.a(paramcy);
    this.a.putInt(cy.a(paramcy), paramInt);
    return this;
  }

  public final cx a(cy paramcy, long paramLong)
  {
    cc.a(paramcy);
    this.a.putLong(cy.a(paramcy), paramLong);
    return this;
  }

  public final cx a(cy paramcy, String paramString)
  {
    cc.a(paramcy);
    this.a.putString(cy.a(paramcy), paramString);
    return this;
  }

  public final cx a(cy paramcy, JSONArray paramJSONArray)
  {
    cc.a(paramcy);
    this.a.putString(cy.a(paramcy), paramJSONArray.toString());
    return this;
  }

  public final cx a(cy paramcy, boolean paramBoolean)
  {
    cc.a(paramcy);
    this.a.putBoolean(cy.a(paramcy), paramBoolean);
    return this;
  }

  public final void a()
  {
    if (this.b)
      throw new IllegalStateException("Must not use the same Editor instance twice");
    this.a.commit();
    this.b = true;
  }

  public final void b()
  {
    if (this.b)
      throw new IllegalStateException("Must not use the same Editor instance twice");
    this.a.apply();
    this.b = true;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.cx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
