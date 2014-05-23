package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Map;

public class MapLikeType extends TypeBase
{
  private static final long serialVersionUID = -4720638149668688793L;
  protected final JavaType _keyType;
  protected final JavaType _valueType;

  protected MapLikeType(Class<?> paramClass, JavaType paramJavaType1, JavaType paramJavaType2, Object paramObject1, Object paramObject2)
  {
    super(paramClass, paramJavaType1.hashCode() ^ paramJavaType2.hashCode(), paramObject1, paramObject2);
    this._keyType = paramJavaType1;
    this._valueType = paramJavaType2;
  }

  protected JavaType _narrow(Class<?> paramClass)
  {
    return new MapLikeType(paramClass, this._keyType, this._valueType, this._valueHandler, this._typeHandler);
  }

  protected String buildCanonicalName()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this._class.getName());
    if (this._keyType != null)
    {
      localStringBuilder.append((char)'<');
      localStringBuilder.append(this._keyType.toCanonical());
      localStringBuilder.append((char)',');
      localStringBuilder.append(this._valueType.toCanonical());
      localStringBuilder.append((char)'>');
    }
    return localStringBuilder.toString();
  }

  public JavaType containedType(int paramInt)
  {
    if (paramInt == 0)
      return this._keyType;
    if (paramInt == 1)
      return this._valueType;
    return null;
  }

  public int containedTypeCount()
  {
    return 2;
  }

  public String containedTypeName(int paramInt)
  {
    if (paramInt == 0)
      return "K";
    if (paramInt == 1)
      return "V";
    return null;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    MapLikeType localMapLikeType;
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (paramObject.getClass() != getClass())
        return false;
      localMapLikeType = (MapLikeType)paramObject;
    }
    while ((this._class == localMapLikeType._class) && (this._keyType.equals(localMapLikeType._keyType)) && (this._valueType.equals(localMapLikeType._valueType)));
    return false;
  }

  public JavaType getContentType()
  {
    return this._valueType;
  }

  public JavaType getKeyType()
  {
    return this._keyType;
  }

  public boolean isContainerType()
  {
    return true;
  }

  public boolean isMapLikeType()
  {
    return true;
  }

  public boolean isTrueMapType()
  {
    return Map.class.isAssignableFrom(this._class);
  }

  public JavaType narrowContentsBy(Class<?> paramClass)
  {
    if (paramClass == this._valueType.getRawClass())
      return this;
    return new MapLikeType(this._class, this._keyType, this._valueType.narrowBy(paramClass), this._valueHandler, this._typeHandler);
  }

  public JavaType narrowKey(Class<?> paramClass)
  {
    if (paramClass == this._keyType.getRawClass())
      return this;
    return new MapLikeType(this._class, this._keyType.narrowBy(paramClass), this._valueType, this._valueHandler, this._typeHandler);
  }

  public String toString()
  {
    return "[map-like type; class " + this._class.getName() + ", " + this._keyType + " -> " + this._valueType + "]";
  }

  public JavaType widenContentsBy(Class<?> paramClass)
  {
    if (paramClass == this._valueType.getRawClass())
      return this;
    return new MapLikeType(this._class, this._keyType, this._valueType.widenBy(paramClass), this._valueHandler, this._typeHandler);
  }

  public JavaType widenKey(Class<?> paramClass)
  {
    if (paramClass == this._keyType.getRawClass())
      return this;
    return new MapLikeType(this._class, this._keyType.widenBy(paramClass), this._valueType, this._valueHandler, this._typeHandler);
  }

  public MapLikeType withContentTypeHandler(Object paramObject)
  {
    return new MapLikeType(this._class, this._keyType, this._valueType.withTypeHandler(paramObject), this._valueHandler, this._typeHandler);
  }

  public MapLikeType withContentValueHandler(Object paramObject)
  {
    return new MapLikeType(this._class, this._keyType, this._valueType.withValueHandler(paramObject), this._valueHandler, this._typeHandler);
  }

  public MapLikeType withKeyValueHandler(Object paramObject)
  {
    return new MapLikeType(this._class, this._keyType.withValueHandler(paramObject), this._valueType, this._valueHandler, this._typeHandler);
  }

  public MapLikeType withTypeHandler(Object paramObject)
  {
    return new MapLikeType(this._class, this._keyType, this._valueType, this._valueHandler, paramObject);
  }

  public MapLikeType withValueHandler(Object paramObject)
  {
    return new MapLikeType(this._class, this._keyType, this._valueType, paramObject, this._typeHandler);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.type.MapLikeType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
