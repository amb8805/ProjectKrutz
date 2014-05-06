package com.twitter.android.provider;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.DataSetObserver;
import java.util.List;

public abstract class am extends CursorWrapper
{
  protected final int a;
  protected List b;
  protected int c = -1;
  protected Cursor d;
  private at e;

  public am(Cursor paramCursor)
  {
    this(paramCursor, 400);
  }

  public am(Cursor paramCursor, int paramInt)
  {
    super(paramCursor);
    this.e = new at(this, paramCursor);
    this.d = paramCursor;
    this.a = paramInt;
  }

  public abstract void a();

  public final Object b()
  {
    if (this.b == null)
      return null;
    return this.b.get(this.c);
  }

  public int getCount()
  {
    if (this.b != null)
      return this.b.size();
    return 0;
  }

  public int getPosition()
  {
    return this.c;
  }

  public boolean moveToFirst()
  {
    return moveToPosition(0);
  }

  public boolean moveToLast()
  {
    return moveToPosition(this.b.size() - 1);
  }

  public boolean moveToNext()
  {
    return moveToPosition(1 + this.c);
  }

  public boolean moveToPosition(int paramInt)
  {
    int i = getCount();
    if (paramInt < 0)
    {
      this.c = -1;
      return false;
    }
    if (paramInt >= i)
    {
      this.c = i;
      return false;
    }
    this.c = paramInt;
    return true;
  }

  public boolean moveToPrevious()
  {
    return moveToPosition(this.c - 1);
  }

  public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    this.e.a(paramDataSetObserver);
  }

  public boolean requery()
  {
    at localat = this.e;
    localat.a(false);
    boolean bool = this.d.requery();
    a();
    localat.a(true);
    localat.notifyChanged();
    return bool;
  }

  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    this.e.b(paramDataSetObserver);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.provider.am
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
