package com.fasterxml.jackson.databind.util;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LRUMap<K, V> extends LinkedHashMap<K, V>
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  protected transient int _jdkSerializeMaxEntries;
  protected final int _maxEntries;

  public LRUMap(int paramInt1, int paramInt2)
  {
    super(paramInt1, 0.8F, true);
    this._maxEntries = paramInt2;
  }

  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    this._jdkSerializeMaxEntries = paramObjectInputStream.readInt();
  }

  private void writeObject(ObjectOutputStream paramObjectOutputStream)
  {
    paramObjectOutputStream.writeInt(this._jdkSerializeMaxEntries);
  }

  protected Object readResolve()
  {
    return new LRUMap(this._jdkSerializeMaxEntries, this._jdkSerializeMaxEntries);
  }

  protected boolean removeEldestEntry(Map.Entry<K, V> paramEntry)
  {
    return size() > this._maxEntries;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.util.LRUMap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
