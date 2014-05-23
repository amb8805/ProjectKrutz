package com.fasterxml.jackson.databind.util;

public abstract class PrimitiveArrayBuilder<T>
{
  PrimitiveArrayBuilder.Node<T> _bufferHead;
  PrimitiveArrayBuilder.Node<T> _bufferTail;
  int _bufferedEntryCount;
  T _freeBuffer;

  protected PrimitiveArrayBuilder()
  {
  }

  protected abstract T _constructArray(int paramInt);

  protected void _reset()
  {
    if (this._bufferTail != null)
      this._freeBuffer = this._bufferTail.getData();
    this._bufferTail = null;
    this._bufferHead = null;
    this._bufferedEntryCount = 0;
  }

  public final T appendCompletedChunk(T paramT, int paramInt)
  {
    PrimitiveArrayBuilder.Node localNode = new PrimitiveArrayBuilder.Node(paramT, paramInt);
    if (this._bufferHead == null)
    {
      this._bufferTail = localNode;
      this._bufferHead = localNode;
      this._bufferedEntryCount = (paramInt + this._bufferedEntryCount);
      if (paramInt >= 16384)
        break label72;
    }
    label72: for (int i = paramInt + paramInt; ; i = paramInt + (paramInt >> 2))
    {
      return _constructArray(i);
      this._bufferTail.linkNext(localNode);
      this._bufferTail = localNode;
      break;
    }
  }

  public T completeAndClearBuffer(T paramT, int paramInt)
  {
    int i = paramInt + this._bufferedEntryCount;
    Object localObject = _constructArray(i);
    PrimitiveArrayBuilder.Node localNode = this._bufferHead;
    int j = 0;
    while (localNode != null)
    {
      j = localNode.copyData(localObject, j);
      localNode = localNode.next();
    }
    System.arraycopy(paramT, 0, localObject, j, paramInt);
    int k = j + paramInt;
    if (k != i)
      throw new IllegalStateException("Should have gotten " + i + " entries, got " + k);
    return localObject;
  }

  public T resetAndStart()
  {
    _reset();
    if (this._freeBuffer == null)
      return _constructArray(12);
    return this._freeBuffer;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
