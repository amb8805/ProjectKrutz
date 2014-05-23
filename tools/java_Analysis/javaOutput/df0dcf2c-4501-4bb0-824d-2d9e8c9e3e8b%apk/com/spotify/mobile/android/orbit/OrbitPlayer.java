package com.spotify.mobile.android.orbit;

public final class OrbitPlayer
  implements OrbitPlayerInterface
{
  private int nOrbitPlayerPtr;

  private OrbitPlayer()
  {
  }

  public final native void clearQueue();

  public final native void playNext();

  public final native void playPath(String paramString1, int paramInt, boolean paramBoolean, String paramString2, String paramString3, String paramString4);

  public final native void playPreview(String[] paramArrayOfString);

  public final native void playPrevious(boolean paramBoolean);

  public final native void queueTrack(String paramString);

  public final native void seekToPosition(int paramInt);

  public final native void setPaused(boolean paramBoolean);

  public final native void setShuffle(boolean paramBoolean);

  public final native void skipNTracksBackwards(int paramInt);

  public final native void skipNTracksForwards(int paramInt);

  public final native void stopPreview();

  public final native void togglePaused();
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.orbit.OrbitPlayer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
