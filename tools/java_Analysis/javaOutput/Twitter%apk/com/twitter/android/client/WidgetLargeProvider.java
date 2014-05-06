package com.twitter.android.client;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;

public class WidgetLargeProvider extends AppWidgetProvider
{
  public WidgetLargeProvider()
  {
  }

  public void onDeleted(Context paramContext, int[] paramArrayOfInt)
  {
    super.onDeleted(paramContext, paramArrayOfInt);
    paramContext.startService(new Intent(paramContext, WidgetService.class).setAction("on_delete").putExtra("widget_ids", paramArrayOfInt));
  }

  public void onUpdate(Context paramContext, AppWidgetManager paramAppWidgetManager, int[] paramArrayOfInt)
  {
    Intent localIntent = new Intent(paramContext, WidgetService.class).putExtra("widget_provider", 2131034114);
    g localg = g.a(paramContext);
    if (localg.h())
    {
      localg.b(paramContext);
      localIntent.setAction("on_update");
    }
    while (true)
    {
      paramContext.startService(localIntent);
      return;
      localIntent.setAction("clear_logged_out");
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.client.WidgetLargeProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
