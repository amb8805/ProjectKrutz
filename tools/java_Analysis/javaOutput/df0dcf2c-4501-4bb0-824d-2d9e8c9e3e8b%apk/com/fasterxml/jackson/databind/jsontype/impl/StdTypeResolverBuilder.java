package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.Collection;

public class StdTypeResolverBuilder
  implements TypeResolverBuilder<StdTypeResolverBuilder>
{
  protected TypeIdResolver _customIdResolver;
  protected Class<?> _defaultImpl;
  protected JsonTypeInfo.Id _idType;
  protected JsonTypeInfo.As _includeAs;
  protected boolean _typeIdVisible = false;
  protected String _typeProperty;

  public StdTypeResolverBuilder()
  {
  }

  public static StdTypeResolverBuilder noTypeInfoBuilder()
  {
    return new StdTypeResolverBuilder().init(JsonTypeInfo.Id.NONE, null);
  }

  public TypeDeserializer buildTypeDeserializer(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType, Collection<NamedType> paramCollection)
  {
    if (this._idType == JsonTypeInfo.Id.NONE)
      return null;
    TypeIdResolver localTypeIdResolver = idResolver(paramDeserializationConfig, paramJavaType, paramCollection, false, true);
    switch (StdTypeResolverBuilder.1.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[this._includeAs.ordinal()])
    {
    default:
      throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this._includeAs);
    case 1:
      return new AsArrayTypeDeserializer(paramJavaType, localTypeIdResolver, this._typeProperty, this._typeIdVisible, this._defaultImpl);
    case 2:
      return new AsPropertyTypeDeserializer(paramJavaType, localTypeIdResolver, this._typeProperty, this._typeIdVisible, this._defaultImpl);
    case 3:
      return new AsWrapperTypeDeserializer(paramJavaType, localTypeIdResolver, this._typeProperty, this._typeIdVisible, this._defaultImpl);
    case 4:
    }
    return new AsExternalTypeDeserializer(paramJavaType, localTypeIdResolver, this._typeProperty, this._typeIdVisible, this._defaultImpl);
  }

  public TypeSerializer buildTypeSerializer(SerializationConfig paramSerializationConfig, JavaType paramJavaType, Collection<NamedType> paramCollection)
  {
    if (this._idType == JsonTypeInfo.Id.NONE)
      return null;
    TypeIdResolver localTypeIdResolver = idResolver(paramSerializationConfig, paramJavaType, paramCollection, true, false);
    switch (StdTypeResolverBuilder.1.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[this._includeAs.ordinal()])
    {
    default:
      throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this._includeAs);
    case 1:
      return new AsArrayTypeSerializer(localTypeIdResolver, null);
    case 2:
      return new AsPropertyTypeSerializer(localTypeIdResolver, null, this._typeProperty);
    case 3:
      return new AsWrapperTypeSerializer(localTypeIdResolver, null);
    case 4:
    }
    return new AsExternalTypeSerializer(localTypeIdResolver, null, this._typeProperty);
  }

  public StdTypeResolverBuilder defaultImpl(Class<?> paramClass)
  {
    this._defaultImpl = paramClass;
    return this;
  }

  public Class<?> getDefaultImpl()
  {
    return this._defaultImpl;
  }

  protected TypeIdResolver idResolver(MapperConfig<?> paramMapperConfig, JavaType paramJavaType, Collection<NamedType> paramCollection, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this._customIdResolver != null)
      return this._customIdResolver;
    if (this._idType == null)
      throw new IllegalStateException("Can not build, 'init()' not yet called");
    switch (StdTypeResolverBuilder.1.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[this._idType.ordinal()])
    {
    default:
      throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this._idType);
    case 1:
      return new ClassNameIdResolver(paramJavaType, paramMapperConfig.getTypeFactory());
    case 2:
      return new MinimalClassNameIdResolver(paramJavaType, paramMapperConfig.getTypeFactory());
    case 3:
      return TypeNameIdResolver.construct(paramMapperConfig, paramJavaType, paramCollection, paramBoolean1, paramBoolean2);
    case 4:
    }
    return null;
  }

  public StdTypeResolverBuilder inclusion(JsonTypeInfo.As paramAs)
  {
    if (paramAs == null)
      throw new IllegalArgumentException("includeAs can not be null");
    this._includeAs = paramAs;
    return this;
  }

  public StdTypeResolverBuilder init(JsonTypeInfo.Id paramId, TypeIdResolver paramTypeIdResolver)
  {
    if (paramId == null)
      throw new IllegalArgumentException("idType can not be null");
    this._idType = paramId;
    this._customIdResolver = paramTypeIdResolver;
    this._typeProperty = paramId.getDefaultPropertyName();
    return this;
  }

  public StdTypeResolverBuilder typeIdVisibility(boolean paramBoolean)
  {
    this._typeIdVisible = paramBoolean;
    return this;
  }

  public StdTypeResolverBuilder typeProperty(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      paramString = this._idType.getDefaultPropertyName();
    this._typeProperty = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
