package com.fasterxml.jackson.core;

import java.io.Serializable;

public class JsonLocation
  implements Serializable
{
  public static final JsonLocation NA = new JsonLocation("N/A", -1L, -1L, -1, -1);
  private static final long serialVersionUID = 1L;
  final int _columnNr;
  final int _lineNr;
  final Object _sourceRef;
  final long _totalBytes;
  final long _totalChars;

  public JsonLocation(Object paramObject, long paramLong, int paramInt1, int paramInt2)
  {
    this(paramObject, -1L, paramLong, paramInt1, paramInt2);
  }

  public JsonLocation(Object paramObject, long paramLong1, long paramLong2, int paramInt1, int paramInt2)
  {
    this._sourceRef = paramObject;
    this._totalBytes = paramLong1;
    this._totalChars = paramLong2;
    this._lineNr = paramInt1;
    this._columnNr = paramInt2;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    JsonLocation localJsonLocation;
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (!(paramObject instanceof JsonLocation))
        return false;
      localJsonLocation = (JsonLocation)paramObject;
      if (this._sourceRef == null)
      {
        if (localJsonLocation._sourceRef != null)
          return false;
      }
      else if (!this._sourceRef.equals(localJsonLocation._sourceRef))
        return false;
    }
    while ((this._lineNr == localJsonLocation._lineNr) && (this._columnNr == localJsonLocation._columnNr) && (this._totalChars == localJsonLocation._totalChars) && (getByteOffset() == localJsonLocation.getByteOffset()));
    return false;
  }

  public long getByteOffset()
  {
    return this._totalBytes;
  }

  public int hashCode()
  {
    if (this._sourceRef == null);
    for (int i = 1; ; i = this._sourceRef.hashCode())
      return ((i ^ this._lineNr) + this._columnNr ^ (int)this._totalChars) + (int)this._totalBytes;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(80);
    localStringBuilder.append("[Source: ");
    if (this._sourceRef == null)
      localStringBuilder.append("UNKNOWN");
    while (true)
    {
      localStringBuilder.append("; line: ");
      localStringBuilder.append(this._lineNr);
      localStringBuilder.append(", column: ");
      localStringBuilder.append(this._columnNr);
      localStringBuilder.append((char)']');
      return localStringBuilder.toString();
      localStringBuilder.append(this._sourceRef.toString());
    }
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.core.JsonLocation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
