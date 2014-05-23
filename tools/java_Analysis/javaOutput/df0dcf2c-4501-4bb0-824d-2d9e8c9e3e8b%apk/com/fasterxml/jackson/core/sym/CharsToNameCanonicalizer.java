package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;

public final class CharsToNameCanonicalizer
{
  static final CharsToNameCanonicalizer sBootstrapSymbolTable = new CharsToNameCanonicalizer();
  protected CharsToNameCanonicalizer.Bucket[] _buckets;
  protected final boolean _canonicalize;
  protected boolean _dirty;
  private final int _hashSeed;
  protected int _indexMask;
  protected final boolean _intern;
  protected int _longestCollisionList;
  protected CharsToNameCanonicalizer _parent;
  protected int _size;
  protected int _sizeThreshold;
  protected String[] _symbols;

  private CharsToNameCanonicalizer()
  {
    this._canonicalize = true;
    this._intern = true;
    this._dirty = true;
    this._hashSeed = 0;
    this._longestCollisionList = 0;
    initTables(64);
  }

  private CharsToNameCanonicalizer(CharsToNameCanonicalizer paramCharsToNameCanonicalizer, boolean paramBoolean1, boolean paramBoolean2, String[] paramArrayOfString, CharsToNameCanonicalizer.Bucket[] paramArrayOfBucket, int paramInt1, int paramInt2, int paramInt3)
  {
    this._parent = paramCharsToNameCanonicalizer;
    this._canonicalize = paramBoolean1;
    this._intern = paramBoolean2;
    this._symbols = paramArrayOfString;
    this._buckets = paramArrayOfBucket;
    this._size = paramInt1;
    this._hashSeed = paramInt2;
    int i = paramArrayOfString.length;
    this._sizeThreshold = _thresholdSize(i);
    this._indexMask = (i - 1);
    this._longestCollisionList = paramInt3;
    this._dirty = false;
  }

  private static int _thresholdSize(int paramInt)
  {
    return paramInt - (paramInt >> 2);
  }

  private void copyArrays()
  {
    String[] arrayOfString = this._symbols;
    int i = arrayOfString.length;
    this._symbols = new String[i];
    System.arraycopy(arrayOfString, 0, this._symbols, 0, i);
    CharsToNameCanonicalizer.Bucket[] arrayOfBucket = this._buckets;
    int j = arrayOfBucket.length;
    this._buckets = new CharsToNameCanonicalizer.Bucket[j];
    System.arraycopy(arrayOfBucket, 0, this._buckets, 0, j);
  }

  public static CharsToNameCanonicalizer createRoot()
  {
    long l = System.currentTimeMillis();
    return createRoot(0x1 | (int)l + (int)(l >>> 32));
  }

  protected static CharsToNameCanonicalizer createRoot(int paramInt)
  {
    return sBootstrapSymbolTable.makeOrphan(paramInt);
  }

  private void initTables(int paramInt)
  {
    this._symbols = new String[paramInt];
    this._buckets = new CharsToNameCanonicalizer.Bucket[paramInt >> 1];
    this._indexMask = (paramInt - 1);
    this._size = 0;
    this._longestCollisionList = 0;
    this._sizeThreshold = _thresholdSize(paramInt);
  }

  private CharsToNameCanonicalizer makeOrphan(int paramInt)
  {
    return new CharsToNameCanonicalizer(null, true, true, this._symbols, this._buckets, this._size, paramInt, this._longestCollisionList);
  }

  private void mergeChild(CharsToNameCanonicalizer paramCharsToNameCanonicalizer)
  {
    if ((paramCharsToNameCanonicalizer.size() > 12000) || (paramCharsToNameCanonicalizer._longestCollisionList > 63));
    while (paramCharsToNameCanonicalizer.size() <= size())
      try
      {
        initTables(64);
        this._dirty = false;
        return;
      }
      finally
      {
        localObject1 = finally;
        throw localObject1;
      }
    try
    {
      this._symbols = paramCharsToNameCanonicalizer._symbols;
      this._buckets = paramCharsToNameCanonicalizer._buckets;
      this._size = paramCharsToNameCanonicalizer._size;
      this._sizeThreshold = paramCharsToNameCanonicalizer._sizeThreshold;
      this._indexMask = paramCharsToNameCanonicalizer._indexMask;
      this._longestCollisionList = paramCharsToNameCanonicalizer._longestCollisionList;
      this._dirty = false;
      return;
    }
    finally
    {
      localObject2 = finally;
      throw localObject2;
    }
  }

  private void rehash()
  {
    int i = this._symbols.length;
    int j = i + i;
    if (j > 65536)
    {
      this._size = 0;
      Arrays.fill(this._symbols, null);
      Arrays.fill(this._buckets, null);
      this._dirty = true;
    }
    label153: int i3;
    do
    {
      return;
      String[] arrayOfString = this._symbols;
      CharsToNameCanonicalizer.Bucket[] arrayOfBucket = this._buckets;
      this._symbols = new String[j];
      this._buckets = new CharsToNameCanonicalizer.Bucket[j >> 1];
      this._indexMask = (j - 1);
      this._sizeThreshold = _thresholdSize(j);
      int k = 0;
      int m = 0;
      int n = 0;
      if (k < i)
      {
        String str2 = arrayOfString[k];
        int i8;
        if (str2 != null)
        {
          n++;
          i8 = _hashToIndex(calcHash(str2));
          if (this._symbols[i8] != null)
            break label153;
          this._symbols[i8] = str2;
        }
        while (true)
        {
          k++;
          break;
          int i9 = i8 >> 1;
          CharsToNameCanonicalizer.Bucket localBucket4 = new CharsToNameCanonicalizer.Bucket(str2, this._buckets[i9]);
          this._buckets[i9] = localBucket4;
          m = Math.max(m, localBucket4.length());
        }
      }
      int i1 = i >> 1;
      int i2 = 0;
      i3 = n;
      int i5;
      for (int i4 = m; i2 < i1; i4 = i5)
      {
        CharsToNameCanonicalizer.Bucket localBucket1 = arrayOfBucket[i2];
        i5 = i4;
        CharsToNameCanonicalizer.Bucket localBucket2 = localBucket1;
        if (localBucket2 != null)
        {
          i3++;
          String str1 = localBucket2.getSymbol();
          int i6 = _hashToIndex(calcHash(str1));
          if (this._symbols[i6] == null)
            this._symbols[i6] = str1;
          while (true)
          {
            localBucket2 = localBucket2.getNext();
            break;
            int i7 = i6 >> 1;
            CharsToNameCanonicalizer.Bucket localBucket3 = new CharsToNameCanonicalizer.Bucket(str1, this._buckets[i7]);
            this._buckets[i7] = localBucket3;
            i5 = Math.max(i5, localBucket3.length());
          }
        }
        i2++;
      }
      this._longestCollisionList = i4;
    }
    while (i3 == this._size);
    throw new Error("Internal error on SymbolTable.rehash(): had " + this._size + " entries; now have " + i3 + ".");
  }

  public final int _hashToIndex(int paramInt)
  {
    return paramInt + (paramInt >>> 15) & this._indexMask;
  }

  public final int calcHash(String paramString)
  {
    int i = paramString.length();
    int j = this._hashSeed;
    int k = 0;
    while (k < i)
    {
      int m = j * 33 + paramString.charAt(k);
      k++;
      j = m;
    }
    if (j == 0)
      j = 1;
    return j;
  }

  public final int calcHash(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = this._hashSeed;
    int j = 0;
    while (j < paramInt2)
    {
      int k = i * 33 + paramArrayOfChar[j];
      j++;
      i = k;
    }
    if (i == 0)
      i = 1;
    return i;
  }

  public final String findSymbol(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3)
  {
    String str2;
    if (paramInt2 <= 0)
    {
      str2 = "";
      return str2;
    }
    if (!this._canonicalize)
      return new String(paramArrayOfChar, paramInt1, paramInt2);
    int i = _hashToIndex(paramInt3);
    String str1 = this._symbols[i];
    if (str1 != null)
    {
      if (str1.length() == paramInt2)
      {
        int m = 0;
        do
        {
          if (str1.charAt(m) != paramArrayOfChar[(paramInt1 + m)])
            break;
          m++;
        }
        while (m < paramInt2);
        if (m == paramInt2)
          return str1;
      }
      CharsToNameCanonicalizer.Bucket localBucket2 = this._buckets[(i >> 1)];
      if (localBucket2 != null)
      {
        String str3 = localBucket2.find(paramArrayOfChar, paramInt1, paramInt2);
        if (str3 != null)
          return str3;
      }
    }
    int j;
    if (!this._dirty)
    {
      copyArrays();
      this._dirty = true;
      j = i;
    }
    while (true)
    {
      str2 = new String(paramArrayOfChar, paramInt1, paramInt2);
      if (this._intern)
        str2 = InternCache.instance.intern(str2);
      this._size = (1 + this._size);
      if (this._symbols[j] == null)
      {
        this._symbols[j] = str2;
        return str2;
        if (this._size >= this._sizeThreshold)
        {
          rehash();
          j = _hashToIndex(calcHash(paramArrayOfChar, paramInt1, paramInt2));
        }
      }
      else
      {
        int k = j >> 1;
        CharsToNameCanonicalizer.Bucket localBucket1 = new CharsToNameCanonicalizer.Bucket(str2, this._buckets[k]);
        this._buckets[k] = localBucket1;
        this._longestCollisionList = Math.max(localBucket1.length(), this._longestCollisionList);
        if (this._longestCollisionList <= 255)
          break;
        reportTooManyCollisions(255);
        return str2;
        j = i;
      }
    }
  }

  public final int hashSeed()
  {
    return this._hashSeed;
  }

  public final CharsToNameCanonicalizer makeChild(boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      String[] arrayOfString = this._symbols;
      CharsToNameCanonicalizer.Bucket[] arrayOfBucket = this._buckets;
      int i = this._size;
      int j = this._hashSeed;
      int k = this._longestCollisionList;
      return new CharsToNameCanonicalizer(this, paramBoolean1, paramBoolean2, arrayOfString, arrayOfBucket, i, j, k);
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean maybeDirty()
  {
    return this._dirty;
  }

  public final void release()
  {
    if (!maybeDirty());
    while (this._parent == null)
      return;
    this._parent.mergeChild(this);
    this._dirty = false;
  }

  protected final void reportTooManyCollisions(int paramInt)
  {
    throw new IllegalStateException("Longest collision chain in symbol table (of size " + this._size + ") now exceeds maximum, " + paramInt + " -- suspect a DoS attack based on hash collisions");
  }

  public final int size()
  {
    return this._size;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
