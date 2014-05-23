package com.spotify.mobile.android.orbit;

public abstract interface OrbitPlayerInterface
{
  public abstract void clearQueue();

  public abstract void playNext();

  public abstract void playPath(String paramString1, int paramInt, boolean paramBoolean, String paramString2, String paramString3, String paramString4);

  public abstract void playPreview(String[] paramArrayOfString);

  public abstract void playPrevious(boolean paramBoolean);

  public abstract void queueTrack(String paramString);

  public abstract void seekToPosition(int paramInt);

  public abstract void setPaused(boolean paramBoolean);

  public abstract void setShuffle(boolean paramBoolean);

  public abstract void skipNTracksBackwards(int paramInt);

  public abstract void skipNTracksForwards(int paramInt);

  public abstract void stopPreview();

  public abstract void togglePaused();
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.orbit.OrbitPlayerInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
