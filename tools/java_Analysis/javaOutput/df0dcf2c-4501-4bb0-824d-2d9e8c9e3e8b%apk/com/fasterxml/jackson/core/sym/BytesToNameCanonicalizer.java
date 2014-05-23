package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class BytesToNameCanonicalizer
{
  protected int _collCount;
  protected int _collEnd;
  protected BytesToNameCanonicalizer.Bucket[] _collList;
  private boolean _collListShared;
  protected int _count;
  private final int _hashSeed;
  protected final boolean _intern;
  protected int _longestCollisionList;
  protected int[] _mainHash;
  protected int _mainHashMask;
  private boolean _mainHashShared;
  protected Name[] _mainNames;
  private boolean _mainNamesShared;
  private transient boolean _needRehash;
  protected final BytesToNameCanonicalizer _parent;
  protected final AtomicReference<BytesToNameCanonicalizer.TableInfo> _tableInfo;

  private BytesToNameCanonicalizer(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    this._parent = null;
    this._hashSeed = paramInt2;
    this._intern = paramBoolean;
    if (paramInt1 < i)
      paramInt1 = i;
    while (true)
    {
      this._tableInfo = new AtomicReference(initTableInfo(paramInt1));
      return;
      if ((paramInt1 & paramInt1 - 1) != 0)
      {
        while (i < paramInt1)
          i += i;
        paramInt1 = i;
      }
    }
  }

  private BytesToNameCanonicalizer(BytesToNameCanonicalizer paramBytesToNameCanonicalizer, boolean paramBoolean, int paramInt, BytesToNameCanonicalizer.TableInfo paramTableInfo)
  {
    this._parent = paramBytesToNameCanonicalizer;
    this._hashSeed = paramInt;
    this._intern = paramBoolean;
    this._tableInfo = null;
    this._count = paramTableInfo.count;
    this._mainHashMask = paramTableInfo.mainHashMask;
    this._mainHash = paramTableInfo.mainHash;
    this._mainNames = paramTableInfo.mainNames;
    this._collList = paramTableInfo.collList;
    this._collCount = paramTableInfo.collCount;
    this._collEnd = paramTableInfo.collEnd;
    this._longestCollisionList = paramTableInfo.longestCollisionList;
    this._needRehash = false;
    this._mainHashShared = true;
    this._mainNamesShared = true;
    this._collListShared = true;
  }

  private void _addSymbol(int paramInt, Name paramName)
  {
    if (this._mainHashShared)
      unshareMain();
    if (this._needRehash)
      rehash();
    this._count = (1 + this._count);
    int i = paramInt & this._mainHashMask;
    int i1;
    if (this._mainNames[i] == null)
    {
      this._mainHash[i] = (paramInt << 8);
      if (this._mainNamesShared)
        unshareNames();
      this._mainNames[i] = paramName;
      int n = this._mainHash.length;
      if (this._count > n >> 1)
      {
        i1 = n >> 2;
        if (this._count <= n - i1)
          break label297;
        this._needRehash = true;
      }
    }
    label200: 
    while (this._collCount < i1)
    {
      return;
      if (this._collListShared)
        unshareCollision();
      this._collCount = (1 + this._collCount);
      int j = this._mainHash[i];
      int k = j & 0xFF;
      int m;
      if (k == 0)
        if (this._collEnd <= 254)
        {
          m = this._collEnd;
          this._collEnd = (1 + this._collEnd);
          if (m >= this._collList.length)
            expandCollision();
          this._mainHash[i] = (j & 0xFFFFFF00 | m + 1);
        }
      while (true)
      {
        BytesToNameCanonicalizer.Bucket localBucket = new BytesToNameCanonicalizer.Bucket(paramName, this._collList[m]);
        this._collList[m] = localBucket;
        this._longestCollisionList = Math.max(localBucket.length(), this._longestCollisionList);
        if (this._longestCollisionList <= 255)
          break;
        reportTooManyCollisions(255);
        break;
        m = findBestBucket();
        break label200;
        m = k - 1;
      }
    }
    label297: this._needRehash = true;
  }

  private static Name constructName(int paramInt1, String paramString, int[] paramArrayOfInt, int paramInt2)
  {
    if (paramInt2 < 4);
    int[] arrayOfInt;
    int i;
    switch (paramInt2)
    {
    default:
      arrayOfInt = new int[paramInt2];
      i = 0;
    case 1:
    case 2:
    case 3:
    }
    while (i < paramInt2)
    {
      arrayOfInt[i] = paramArrayOfInt[i];
      i++;
      continue;
      return new Name1(paramString, paramInt1, paramArrayOfInt[0]);
      return new Name2(paramString, paramInt1, paramArrayOfInt[0], paramArrayOfInt[1]);
      return new Name3(paramString, paramInt1, paramArrayOfInt[0], paramArrayOfInt[1], paramArrayOfInt[2]);
    }
    return new NameN(paramString, paramInt1, arrayOfInt, paramInt2);
  }

  public static BytesToNameCanonicalizer createRoot()
  {
    long l = System.currentTimeMillis();
    return createRoot(0x1 | (int)l + (int)(l >>> 32));
  }

  protected static BytesToNameCanonicalizer createRoot(int paramInt)
  {
    return new BytesToNameCanonicalizer(64, true, paramInt);
  }

  private void expandCollision()
  {
    BytesToNameCanonicalizer.Bucket[] arrayOfBucket = this._collList;
    int i = arrayOfBucket.length;
    this._collList = new BytesToNameCanonicalizer.Bucket[i + i];
    System.arraycopy(arrayOfBucket, 0, this._collList, 0, i);
  }

  private int findBestBucket()
  {
    BytesToNameCanonicalizer.Bucket[] arrayOfBucket = this._collList;
    int i = 2147483647;
    int j = -1;
    int k = 0;
    int m = this._collEnd;
    int n;
    if (k < m)
    {
      n = arrayOfBucket[k].length();
      if (n >= i)
        break label64;
      if (n == 1)
        return k;
      j = k;
    }
    while (true)
    {
      k++;
      i = n;
      break;
      return j;
      label64: n = i;
    }
  }

  public static Name getEmptyName()
  {
    return Name1.getEmptyName();
  }

  private BytesToNameCanonicalizer.TableInfo initTableInfo(int paramInt)
  {
    return new BytesToNameCanonicalizer.TableInfo(0, paramInt - 1, new int[paramInt], new Name[paramInt], null, 0, 0, 0);
  }

  private void mergeChild(BytesToNameCanonicalizer.TableInfo paramTableInfo)
  {
    int i = paramTableInfo.count;
    BytesToNameCanonicalizer.TableInfo localTableInfo = (BytesToNameCanonicalizer.TableInfo)this._tableInfo.get();
    if (i <= localTableInfo.count)
      return;
    if ((i > 6000) || (paramTableInfo.longestCollisionList > 63))
      paramTableInfo = initTableInfo(64);
    this._tableInfo.compareAndSet(localTableInfo, paramTableInfo);
  }

  private void nukeSymbols()
  {
    this._count = 0;
    this._longestCollisionList = 0;
    Arrays.fill(this._mainHash, 0);
    Arrays.fill(this._mainNames, null);
    Arrays.fill(this._collList, null);
    this._collCount = 0;
    this._collEnd = 0;
  }

  private void rehash()
  {
    int i = 0;
    this._needRehash = false;
    this._mainNamesShared = false;
    int j = this._mainHash.length;
    int k = j + j;
    if (k > 65536)
      nukeSymbols();
    int i3;
    label365: 
    do
    {
      return;
      this._mainHash = new int[k];
      this._mainHashMask = (k - 1);
      Name[] arrayOfName = this._mainNames;
      this._mainNames = new Name[k];
      int m = 0;
      int n = 0;
      while (m < j)
      {
        Name localName2 = arrayOfName[m];
        if (localName2 != null)
        {
          n++;
          int i12 = localName2.hashCode();
          int i13 = i12 & this._mainHashMask;
          this._mainNames[i13] = localName2;
          this._mainHash[i13] = (i12 << 8);
        }
        m++;
      }
      int i1 = this._collEnd;
      if (i1 == 0)
      {
        this._longestCollisionList = 0;
        return;
      }
      this._collCount = 0;
      this._collEnd = 0;
      this._collListShared = false;
      BytesToNameCanonicalizer.Bucket[] arrayOfBucket = this._collList;
      this._collList = new BytesToNameCanonicalizer.Bucket[arrayOfBucket.length];
      int i2 = 0;
      int i4;
      for (i3 = n; i2 < i1; i3 = i4)
      {
        BytesToNameCanonicalizer.Bucket localBucket1 = arrayOfBucket[i2];
        i4 = i3;
        BytesToNameCanonicalizer.Bucket localBucket2 = localBucket1;
        while (localBucket2 != null)
        {
          int i5 = i4 + 1;
          Name localName1 = localBucket2._name;
          int i6 = localName1.hashCode();
          int i7 = i6 & this._mainHashMask;
          int i8 = this._mainHash[i7];
          int i11;
          if (this._mainNames[i7] == null)
          {
            this._mainHash[i7] = (i6 << 8);
            this._mainNames[i7] = localName1;
            i11 = i;
            localBucket2 = localBucket2._next;
            i = i11;
            i4 = i5;
          }
          else
          {
            this._collCount = (1 + this._collCount);
            int i9 = i8 & 0xFF;
            int i10;
            if (i9 == 0)
              if (this._collEnd <= 254)
              {
                i10 = this._collEnd;
                this._collEnd = (1 + this._collEnd);
                if (i10 >= this._collList.length)
                  expandCollision();
                this._mainHash[i7] = (i8 & 0xFFFFFF00 | i10 + 1);
              }
            while (true)
            {
              BytesToNameCanonicalizer.Bucket localBucket3 = new BytesToNameCanonicalizer.Bucket(localName1, this._collList[i10]);
              this._collList[i10] = localBucket3;
              i11 = Math.max(i, localBucket3.length());
              break;
              i10 = findBestBucket();
              break label365;
              i10 = i9 - 1;
            }
          }
        }
        i2++;
      }
      this._longestCollisionList = i;
    }
    while (i3 == this._count);
    throw new RuntimeException("Internal error: count after rehash " + i3 + "; should be " + this._count);
  }

  private void unshareCollision()
  {
    BytesToNameCanonicalizer.Bucket[] arrayOfBucket = this._collList;
    if (arrayOfBucket == null)
      this._collList = new BytesToNameCanonicalizer.Bucket[32];
    while (true)
    {
      this._collListShared = false;
      return;
      int i = arrayOfBucket.length;
      this._collList = new BytesToNameCanonicalizer.Bucket[i];
      System.arraycopy(arrayOfBucket, 0, this._collList, 0, i);
    }
  }

  private void unshareMain()
  {
    int[] arrayOfInt = this._mainHash;
    int i = this._mainHash.length;
    this._mainHash = new int[i];
    System.arraycopy(arrayOfInt, 0, this._mainHash, 0, i);
    this._mainHashShared = false;
  }

  private void unshareNames()
  {
    Name[] arrayOfName = this._mainNames;
    int i = arrayOfName.length;
    this._mainNames = new Name[i];
    System.arraycopy(arrayOfName, 0, this._mainNames, 0, i);
    this._mainNamesShared = false;
  }

  public final Name addName(String paramString, int[] paramArrayOfInt, int paramInt)
  {
    if (this._intern)
      paramString = InternCache.instance.intern(paramString);
    int i;
    if (paramInt < 3)
      if (paramInt == 1)
        i = calcHash(paramArrayOfInt[0]);
    while (true)
    {
      Name localName = constructName(i, paramString, paramArrayOfInt, paramInt);
      _addSymbol(i, localName);
      return localName;
      i = calcHash(paramArrayOfInt[0], paramArrayOfInt[1]);
      continue;
      i = calcHash(paramArrayOfInt, paramInt);
    }
  }

  public final int calcHash(int paramInt)
  {
    int i = paramInt ^ this._hashSeed;
    int j = i + (i >>> 15);
    return j ^ j >>> 9;
  }

  public final int calcHash(int paramInt1, int paramInt2)
  {
    int i = (paramInt1 ^ paramInt1 >>> 15) + paramInt2 * 33 ^ this._hashSeed;
    return i + (i >>> 7);
  }

  public final int calcHash(int[] paramArrayOfInt, int paramInt)
  {
    int i = 3;
    if (paramInt < i)
      throw new IllegalArgumentException();
    int j = paramArrayOfInt[0] ^ this._hashSeed;
    int k = 65599 * (33 * (j + (j >>> 9)) + paramArrayOfInt[1]);
    int m = k + (k >>> 15) ^ paramArrayOfInt[2];
    int n = m + (m >>> 17);
    while (i < paramInt)
    {
      int i2 = n * 31 ^ paramArrayOfInt[i];
      int i3 = i2 + (i2 >>> 3);
      n = i3 ^ i3 << 7;
      i++;
    }
    int i1 = n + (n >>> 15);
    return i1 ^ i1 << 9;
  }

  public final Name findName(int paramInt)
  {
    int i = calcHash(paramInt);
    int j = i & this._mainHashMask;
    int k = this._mainHash[j];
    Name localName;
    if ((i ^ k >> 8) << 8 == 0)
    {
      localName = this._mainNames[j];
      if (localName != null);
    }
    BytesToNameCanonicalizer.Bucket localBucket;
    do
    {
      int m;
      do
      {
        do
        {
          return null;
          if (!localName.equals(paramInt))
            break;
          return localName;
        }
        while (k == 0);
        m = k & 0xFF;
      }
      while (m <= 0);
      int n = m - 1;
      localBucket = this._collList[n];
    }
    while (localBucket == null);
    return localBucket.find(i, paramInt, 0);
  }

  public final Name findName(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0);
    int k;
    Name localName;
    for (int i = calcHash(paramInt1); ; i = calcHash(paramInt1, paramInt2))
    {
      int j = i & this._mainHashMask;
      k = this._mainHash[j];
      if ((i ^ k >> 8) << 8 != 0)
        break label79;
      localName = this._mainNames[j];
      if (localName != null)
        break;
      return null;
    }
    if (localName.equals(paramInt1, paramInt2))
    {
      return localName;
      label79: if (k == 0)
        return null;
    }
    int m = k & 0xFF;
    if (m > 0)
    {
      int n = m - 1;
      BytesToNameCanonicalizer.Bucket localBucket = this._collList[n];
      if (localBucket != null)
        return localBucket.find(i, paramInt1, paramInt2);
    }
    return null;
  }

  public final Name findName(int[] paramArrayOfInt, int paramInt)
  {
    int i2;
    Name localName;
    if (paramInt < 3)
    {
      int i1 = paramArrayOfInt[0];
      i2 = 0;
      if (paramInt < 2)
        localName = findName(i1, i2);
    }
    int i;
    int k;
    do
    {
      return localName;
      i2 = paramArrayOfInt[1];
      break;
      i = calcHash(paramArrayOfInt, paramInt);
      int j = i & this._mainHashMask;
      k = this._mainHash[j];
      if ((i ^ k >> 8) << 8 != 0)
        break label142;
      localName = this._mainNames[j];
    }
    while ((localName == null) || (localName.equals(paramArrayOfInt, paramInt)));
    label142: 
    while (k != 0)
    {
      int m = k & 0xFF;
      if (m <= 0)
        break;
      int n = m - 1;
      BytesToNameCanonicalizer.Bucket localBucket = this._collList[n];
      if (localBucket == null)
        break;
      return localBucket.find(i, paramArrayOfInt, paramInt);
    }
    return null;
    return null;
  }

  public final BytesToNameCanonicalizer makeChild(boolean paramBoolean1, boolean paramBoolean2)
  {
    return new BytesToNameCanonicalizer(this, paramBoolean2, this._hashSeed, (BytesToNameCanonicalizer.TableInfo)this._tableInfo.get());
  }

  public final boolean maybeDirty()
  {
    return !this._mainHashShared;
  }

  public final void release()
  {
    if ((this._parent != null) && (maybeDirty()))
    {
      this._parent.mergeChild(new BytesToNameCanonicalizer.TableInfo(this));
      this._mainHashShared = true;
      this._mainNamesShared = true;
      this._collListShared = true;
    }
  }

  protected final void reportTooManyCollisions(int paramInt)
  {
    throw new IllegalStateException("Longest collision chain in symbol table (of size " + this._count + ") now exceeds maximum, " + paramInt + " -- suspect a DoS attack based on hash collisions");
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
