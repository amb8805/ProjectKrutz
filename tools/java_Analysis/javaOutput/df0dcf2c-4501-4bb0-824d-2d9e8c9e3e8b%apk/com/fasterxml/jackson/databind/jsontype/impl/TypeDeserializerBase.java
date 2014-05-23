package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import java.io.Serializable;
import java.util.HashMap;

public abstract class TypeDeserializerBase extends TypeDeserializer
  implements Serializable
{
  private static final long serialVersionUID = 278445030337366675L;
  protected final JavaType _baseType;
  protected final JavaType _defaultImpl;
  protected JsonDeserializer<Object> _defaultImplDeserializer;
  protected final HashMap<String, JsonDeserializer<Object>> _deserializers;
  protected final TypeIdResolver _idResolver;
  protected final BeanProperty _property;
  protected final boolean _typeIdVisible;
  protected final String _typePropertyName;

  protected TypeDeserializerBase(JavaType paramJavaType, TypeIdResolver paramTypeIdResolver, String paramString, boolean paramBoolean, Class<?> paramClass)
  {
    this._baseType = paramJavaType;
    this._idResolver = paramTypeIdResolver;
    this._typePropertyName = paramString;
    this._typeIdVisible = paramBoolean;
    this._deserializers = new HashMap();
    if (paramClass == null);
    for (this._defaultImpl = null; ; this._defaultImpl = paramJavaType.forcedNarrowBy(paramClass))
    {
      this._property = null;
      return;
    }
  }

  protected TypeDeserializerBase(TypeDeserializerBase paramTypeDeserializerBase, BeanProperty paramBeanProperty)
  {
    this._baseType = paramTypeDeserializerBase._baseType;
    this._idResolver = paramTypeDeserializerBase._idResolver;
    this._typePropertyName = paramTypeDeserializerBase._typePropertyName;
    this._typeIdVisible = paramTypeDeserializerBase._typeIdVisible;
    this._deserializers = paramTypeDeserializerBase._deserializers;
    this._defaultImpl = paramTypeDeserializerBase._defaultImpl;
    this._defaultImplDeserializer = paramTypeDeserializerBase._defaultImplDeserializer;
    this._property = paramBeanProperty;
  }

  protected final JsonDeserializer<Object> _findDefaultImplDeserializer(DeserializationContext paramDeserializationContext)
  {
    if (this._defaultImpl == null)
      return null;
    synchronized (this._defaultImpl)
    {
      if (this._defaultImplDeserializer == null)
        this._defaultImplDeserializer = paramDeserializationContext.findContextualValueDeserializer(this._defaultImpl, this._property);
      JsonDeserializer localJsonDeserializer = this._defaultImplDeserializer;
      return localJsonDeserializer;
    }
  }

  protected final JsonDeserializer<Object> _findDeserializer(DeserializationContext paramDeserializationContext, String paramString)
  {
    JavaType localJavaType;
    synchronized (this._deserializers)
    {
      localObject2 = (JsonDeserializer)this._deserializers.get(paramString);
      if (localObject2 == null)
      {
        localJavaType = this._idResolver.typeFromId(paramString);
        if (localJavaType != null)
          break label89;
        if (this._defaultImpl == null)
          throw paramDeserializationContext.unknownTypeException(this._baseType, paramString);
      }
    }
    label89: JsonDeserializer localJsonDeserializer;
    for (Object localObject2 = _findDefaultImplDeserializer(paramDeserializationContext); ; localObject2 = localJsonDeserializer)
    {
      this._deserializers.put(paramString, localObject2);
      return localObject2;
      if ((this._baseType != null) && (this._baseType.getClass() == localJavaType.getClass()))
        localJavaType = this._baseType.narrowBy(localJavaType.getRawClass());
      localJsonDeserializer = paramDeserializationContext.findContextualValueDeserializer(localJavaType, this._property);
    }
  }

  public String baseTypeName()
  {
    return this._baseType.getRawClass().getName();
  }

  public Class<?> getDefaultImpl()
  {
    if (this._defaultImpl == null)
      return null;
    return this._defaultImpl.getRawClass();
  }

  public final String getPropertyName()
  {
    return this._typePropertyName;
  }

  public TypeIdResolver getTypeIdResolver()
  {
    return this._idResolver;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append((char)'[').append(getClass().getName());
    localStringBuilder.append("; base-type:").append(this._baseType);
    localStringBuilder.append("; id-resolver: ").append(this._idResolver);
    localStringBuilder.append((char)']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
