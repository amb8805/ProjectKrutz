package com.spotify.mobile.android.util.a;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.media.RemoteControlClient.MetadataEditor;
import android.os.Looper;
import android.util.SparseArray;

@TargetApi(14)
public final class j extends g
{
  private RemoteControlClient a;

  public j(PendingIntent paramPendingIntent, Looper paramLooper)
  {
    this.a = new RemoteControlClient(paramPendingIntent, paramLooper);
  }

  public final void a(int paramInt)
  {
    this.a.setPlaybackState(paramInt);
  }

  public final void a(AudioManager paramAudioManager)
  {
    paramAudioManager.registerRemoteControlClient(this.a);
  }

  protected final void a(h paramh, boolean paramBoolean)
  {
    int i = 0;
    RemoteControlClient.MetadataEditor localMetadataEditor = this.a.editMetadata(paramBoolean);
    SparseArray localSparseArray1 = paramh.b();
    for (int j = 0; j < localSparseArray1.size(); j++)
      localMetadataEditor.putBitmap(localSparseArray1.keyAt(j), (Bitmap)localSparseArray1.valueAt(j));
    SparseArray localSparseArray2 = paramh.c();
    for (int k = 0; k < localSparseArray2.size(); k++)
      localMetadataEditor.putLong(localSparseArray2.keyAt(k), ((Long)localSparseArray2.valueAt(k)).longValue());
    SparseArray localSparseArray3 = paramh.d();
    while (i < localSparseArray3.size())
    {
      localMetadataEditor.putString(localSparseArray3.keyAt(i), (String)localSparseArray3.valueAt(i));
      i++;
    }
    localMetadataEditor.apply();
  }

  public final void b(int paramInt)
  {
    this.a.setTransportControlFlags(paramInt);
  }

  public final void b(AudioManager paramAudioManager)
  {
    paramAudioManager.unregisterRemoteControlClient(this.a);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.a.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
