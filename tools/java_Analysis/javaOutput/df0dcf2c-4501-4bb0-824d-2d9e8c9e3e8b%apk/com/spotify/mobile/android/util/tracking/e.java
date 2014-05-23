package com.spotify.mobile.android.util.tracking;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

final class e extends Handler
{
  private WeakReference<TrackingService> a;

  e(TrackingService paramTrackingService)
  {
    this.a = new WeakReference(paramTrackingService);
  }

  public final void handleMessage(Message paramMessage)
  {
    TrackingService localTrackingService = (TrackingService)this.a.get();
    if (localTrackingService != null)
      localTrackingService.stopSelf();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.tracking.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
