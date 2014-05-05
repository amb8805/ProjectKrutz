package com.twitter.android;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public final class eu
{
  private static eu a;
  private final AudioManager b;
  private SoundPool c;
  private int[] d;
  private int e;

  private eu(Context paramContext)
  {
    this.b = ((AudioManager)paramContext.getSystemService("audio"));
    this.e = 0;
  }

  public static eu a(Context paramContext)
  {
    try
    {
      Context localContext = paramContext.getApplicationContext();
      if (a == null)
        a = new eu(localContext);
      eu localeu = a;
      if (localeu.e == 0)
      {
        SoundPool localSoundPool = new SoundPool(2, 5, 0);
        int[] arrayOfInt = new int[4];
        arrayOfInt[0] = localSoundPool.load(localContext, 2131099649, 1);
        arrayOfInt[1] = localSoundPool.load(localContext, 2131099650, 1);
        arrayOfInt[2] = localSoundPool.load(localContext, 2131099648, 1);
        arrayOfInt[3] = localSoundPool.load(localContext, 2131099651, 1);
        localeu.d = arrayOfInt;
        localeu.c = localSoundPool;
      }
      localeu.e = (1 + localeu.e);
      return localeu;
    }
    finally
    {
    }
  }

  public final int a(int paramInt)
  {
    if ((this.c != null) && ((this.b == null) || (!this.b.isMusicActive())))
      return this.c.play(this.d[paramInt], 1.0F, 1.0F, 0, 0, 1.0F);
    return 0;
  }

  public final void a()
  {
    if (this.e > 0)
      this.e -= 1;
    if ((this.e == 0) && (this.c != null))
    {
      for (int k : this.d)
        this.c.unload(k);
      this.c = null;
      this.d = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.eu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
