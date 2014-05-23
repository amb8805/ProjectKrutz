package com.squareup.picasso;

import java.util.concurrent.ThreadFactory;

final class ap
  implements ThreadFactory
{
  ap()
  {
  }

  public final Thread newThread(Runnable paramRunnable)
  {
    return new ao(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.ap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
