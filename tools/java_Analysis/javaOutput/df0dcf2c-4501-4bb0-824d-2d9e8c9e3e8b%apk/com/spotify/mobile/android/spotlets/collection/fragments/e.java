package com.spotify.mobile.android.spotlets.collection.fragments;

import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v4.view.br;
import java.lang.ref.WeakReference;

final class e extends Handler
{
  WeakReference<CollectionFragment> a;

  public e(CollectionFragment paramCollectionFragment)
  {
    this.a = new WeakReference(paramCollectionFragment);
  }

  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    CollectionFragment localCollectionFragment = (CollectionFragment)this.a.get();
    if (localCollectionFragment == null)
      return;
    CollectionFragment.a(localCollectionFragment).a(paramMessage.what, false);
    localCollectionFragment.c.a(paramMessage.what);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.collection.fragments.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
