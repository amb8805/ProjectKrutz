package com.spotify.mobile.android.util.tracking;

import android.content.Context;
import android.os.Bundle;
import com.spotify.mobile.android.util.Assertion;
import java.util.UUID;

public final class h
{
  private Context a;
  private long b;
  private String c;
  private int d = 0;

  public h(Context paramContext, String paramString)
  {
    this.a = paramContext;
    this.c = paramString;
    this.b = UUID.randomUUID().getLeastSignificantBits();
  }

  public final void a()
  {
    switch (this.d)
    {
    default:
      Context localContext = this.a;
      long l1 = this.b;
      String str = this.c;
      long l2 = System.currentTimeMillis();
      Bundle localBundle = new Bundle();
      localBundle.putLong("ARG_ID", l1);
      localBundle.putString("ARG_URI", str);
      localBundle.putLong("ARG_TIMESTAMP", l2);
      TrackingService.a(localContext, "TYPE_VIEW_LOADING", "EVENT_START", localBundle);
      this.d = 1;
    case 1:
    }
  }

  public final void a(Bundle paramBundle)
  {
    paramBundle.putLong("ViewLoadingTracker.ID", this.b);
    paramBundle.putString("ViewLoadingTracker.VIEW_URI", this.c);
    paramBundle.putInt("ViewLoadingTracker.STATE", this.d);
  }

  public final void b()
  {
    switch (this.d)
    {
    case 1:
    default:
      Context localContext = this.a;
      long l1 = this.b;
      String str = this.c;
      long l2 = System.currentTimeMillis();
      Bundle localBundle = new Bundle();
      localBundle.putLong("ARG_ID", l1);
      localBundle.putString("ARG_URI", str);
      localBundle.putLong("ARG_TIMESTAMP", l2);
      TrackingService.a(localContext, "TYPE_VIEW_LOADING", "EVENT_COMPLETE", localBundle);
      this.d = 2;
    case 2:
      return;
    case 0:
      Assertion.b("Complete called in wrong state. Have you called start()?");
      return;
    case 3:
    }
    Assertion.b("Complete cannot be called after tracking was cancelled.");
  }

  public final void b(Bundle paramBundle)
  {
    if (paramBundle == null)
      return;
    if ((!paramBundle.containsKey("ViewLoadingTracker.ID")) || (!paramBundle.containsKey("ViewLoadingTracker.VIEW_URI")) || (!paramBundle.containsKey("ViewLoadingTracker.STATE")))
    {
      Assertion.b("Invalid saved state bundle. Have you called saveToBundle?");
      return;
    }
    this.b = paramBundle.getLong("ViewLoadingTracker.ID");
    this.c = paramBundle.getString("ViewLoadingTracker.VIEW_URI");
    this.d = paramBundle.getInt("ViewLoadingTracker.STATE");
  }

  public final void c()
  {
    switch (this.d)
    {
    case 1:
    default:
      Context localContext = this.a;
      long l = this.b;
      String str = this.c;
      Bundle localBundle = new Bundle();
      localBundle.putLong("ARG_ID", l);
      localBundle.putString("ARG_URI", str);
      TrackingService.a(localContext, "TYPE_VIEW_LOADING", "EVENT_CANCEL", localBundle);
      this.d = 3;
    case 2:
    case 3:
      return;
    case 0:
    }
    Assertion.b("Cancel called in wrong state. Have you called start()?");
  }

  public final boolean d()
  {
    return this.d == 3;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.tracking.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
