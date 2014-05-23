package com.squareup.picasso;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class b<T> extends WeakReference<T>
{
  final a a;

  public b(a parama, T paramT, ReferenceQueue<? super T> paramReferenceQueue)
  {
    super(paramT, paramReferenceQueue);
    this.a = parama;
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
