package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class BeanPropertyMap
  implements Serializable, Iterable<SettableBeanProperty>
{
  private static final long serialVersionUID = 1L;
  private final BeanPropertyMap.Bucket[] _buckets;
  private final int _hashMask;
  private int _nextBucketIndex = 0;
  private final int _size;

  public BeanPropertyMap(Collection<SettableBeanProperty> paramCollection)
  {
    this._size = paramCollection.size();
    int i = findSize(this._size);
    this._hashMask = (i - 1);
    BeanPropertyMap.Bucket[] arrayOfBucket = new BeanPropertyMap.Bucket[i];
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      SettableBeanProperty localSettableBeanProperty = (SettableBeanProperty)localIterator.next();
      String str = localSettableBeanProperty.getName();
      int j = str.hashCode() & this._hashMask;
      BeanPropertyMap.Bucket localBucket = arrayOfBucket[j];
      int k = this._nextBucketIndex;
      this._nextBucketIndex = (k + 1);
      arrayOfBucket[j] = new BeanPropertyMap.Bucket(localBucket, str, localSettableBeanProperty, k);
    }
    this._buckets = arrayOfBucket;
  }

  private BeanPropertyMap(BeanPropertyMap.Bucket[] paramArrayOfBucket, int paramInt1, int paramInt2)
  {
    this._buckets = paramArrayOfBucket;
    this._size = paramInt1;
    this._hashMask = (-1 + paramArrayOfBucket.length);
    this._nextBucketIndex = paramInt2;
  }

  private SettableBeanProperty _findWithEquals(String paramString, int paramInt)
  {
    for (BeanPropertyMap.Bucket localBucket = this._buckets[paramInt]; localBucket != null; localBucket = localBucket.next)
      if (paramString.equals(localBucket.key))
        return localBucket.value;
    return null;
  }

  private static final int findSize(int paramInt)
  {
    if (paramInt <= 32);
    int j;
    for (int i = paramInt + paramInt; ; i = paramInt + (paramInt >> 2))
    {
      j = 2;
      while (j < i)
        j += j;
    }
    return j;
  }

  public final BeanPropertyMap assignIndexes()
  {
    BeanPropertyMap.Bucket[] arrayOfBucket = this._buckets;
    int i = arrayOfBucket.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      BeanPropertyMap.Bucket localBucket = arrayOfBucket[j];
      while (localBucket != null)
      {
        SettableBeanProperty localSettableBeanProperty = localBucket.value;
        int m = k + 1;
        localSettableBeanProperty.assignIndex(k);
        localBucket = localBucket.next;
        k = m;
      }
      j++;
    }
    return this;
  }

  public final SettableBeanProperty find(String paramString)
  {
    int i = paramString.hashCode() & this._hashMask;
    BeanPropertyMap.Bucket localBucket = this._buckets[i];
    if (localBucket == null)
      return null;
    if (localBucket.key == paramString)
      return localBucket.value;
    do
    {
      localBucket = localBucket.next;
      if (localBucket == null)
        break;
    }
    while (localBucket.key != paramString);
    return localBucket.value;
    return _findWithEquals(paramString, i);
  }

  public final SettableBeanProperty[] getPropertiesInInsertionOrder()
  {
    SettableBeanProperty[] arrayOfSettableBeanProperty = new SettableBeanProperty[this._nextBucketIndex];
    BeanPropertyMap.Bucket[] arrayOfBucket = this._buckets;
    int i = arrayOfBucket.length;
    for (int j = 0; j < i; j++)
      for (BeanPropertyMap.Bucket localBucket = arrayOfBucket[j]; localBucket != null; localBucket = localBucket.next)
        arrayOfSettableBeanProperty[localBucket.index] = localBucket.value;
    return arrayOfSettableBeanProperty;
  }

  public final Iterator<SettableBeanProperty> iterator()
  {
    return new BeanPropertyMap.IteratorImpl(this._buckets);
  }

  public final void remove(SettableBeanProperty paramSettableBeanProperty)
  {
    String str = paramSettableBeanProperty.getName();
    int i = str.hashCode() & -1 + this._buckets.length;
    BeanPropertyMap.Bucket localBucket1 = this._buckets[i];
    int j = 0;
    BeanPropertyMap.Bucket localBucket2 = null;
    if (localBucket1 != null)
    {
      if ((j == 0) && (localBucket1.key.equals(str)))
        j = 1;
      while (true)
      {
        localBucket1 = localBucket1.next;
        break;
        localBucket2 = new BeanPropertyMap.Bucket(localBucket2, localBucket1.key, localBucket1.value, localBucket1.index);
      }
    }
    if (j == 0)
      throw new NoSuchElementException("No entry '" + paramSettableBeanProperty + "' found, can't remove");
    this._buckets[i] = localBucket2;
  }

  public final BeanPropertyMap renameAll(NameTransformer paramNameTransformer)
  {
    if ((paramNameTransformer == null) || (paramNameTransformer == NameTransformer.NOP))
      return this;
    Iterator localIterator = iterator();
    ArrayList localArrayList = new ArrayList();
    while (localIterator.hasNext())
    {
      SettableBeanProperty localSettableBeanProperty1 = (SettableBeanProperty)localIterator.next();
      SettableBeanProperty localSettableBeanProperty2 = localSettableBeanProperty1.withName(paramNameTransformer.transform(localSettableBeanProperty1.getName()));
      JsonDeserializer localJsonDeserializer1 = localSettableBeanProperty2.getValueDeserializer();
      if (localJsonDeserializer1 != null)
      {
        JsonDeserializer localJsonDeserializer2 = localJsonDeserializer1.unwrappingDeserializer(paramNameTransformer);
        if (localJsonDeserializer2 != localJsonDeserializer1)
          localSettableBeanProperty2 = localSettableBeanProperty2.withValueDeserializer(localJsonDeserializer2);
      }
      localArrayList.add(localSettableBeanProperty2);
    }
    return new BeanPropertyMap(localArrayList);
  }

  public final void replace(SettableBeanProperty paramSettableBeanProperty)
  {
    String str = paramSettableBeanProperty.getName();
    int i = str.hashCode() & -1 + this._buckets.length;
    BeanPropertyMap.Bucket localBucket1 = this._buckets[i];
    int j = -1;
    BeanPropertyMap.Bucket localBucket2 = null;
    if (localBucket1 != null)
    {
      if ((j < 0) && (localBucket1.key.equals(str)))
        j = localBucket1.index;
      while (true)
      {
        localBucket1 = localBucket1.next;
        break;
        localBucket2 = new BeanPropertyMap.Bucket(localBucket2, localBucket1.key, localBucket1.value, localBucket1.index);
      }
    }
    if (j < 0)
      throw new NoSuchElementException("No entry '" + paramSettableBeanProperty + "' found, can't replace");
    this._buckets[i] = new BeanPropertyMap.Bucket(localBucket2, str, paramSettableBeanProperty, j);
  }

  public final int size()
  {
    return this._size;
  }

  public final BeanPropertyMap withProperty(SettableBeanProperty paramSettableBeanProperty)
  {
    int i = this._buckets.length;
    BeanPropertyMap.Bucket[] arrayOfBucket = new BeanPropertyMap.Bucket[i];
    System.arraycopy(this._buckets, 0, arrayOfBucket, 0, i);
    String str = paramSettableBeanProperty.getName();
    if (find(paramSettableBeanProperty.getName()) == null)
    {
      int j = str.hashCode() & this._hashMask;
      BeanPropertyMap.Bucket localBucket = arrayOfBucket[j];
      int k = this._nextBucketIndex;
      this._nextBucketIndex = (k + 1);
      arrayOfBucket[j] = new BeanPropertyMap.Bucket(localBucket, str, paramSettableBeanProperty, k);
      return new BeanPropertyMap(arrayOfBucket, 1 + this._size, this._nextBucketIndex);
    }
    BeanPropertyMap localBeanPropertyMap = new BeanPropertyMap(arrayOfBucket, i, this._nextBucketIndex);
    localBeanPropertyMap.replace(paramSettableBeanProperty);
    return localBeanPropertyMap;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
