package com.spotify.android.paste.widget;

final class m
  implements k
{
  private int[] a;
  private int[] b;

  private m()
  {
  }

  public final int a(int paramInt)
  {
    return this.a[(paramInt % this.a.length)];
  }

  final void a(int[] paramArrayOfInt)
  {
    this.a = paramArrayOfInt;
  }

  public final int b(int paramInt)
  {
    return this.b[(paramInt % this.b.length)];
  }

  final void b(int[] paramArrayOfInt)
  {
    this.b = paramArrayOfInt;
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
