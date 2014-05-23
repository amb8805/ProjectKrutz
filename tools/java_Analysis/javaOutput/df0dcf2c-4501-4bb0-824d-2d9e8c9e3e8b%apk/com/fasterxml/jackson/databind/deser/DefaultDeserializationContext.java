package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonDeserializer.None;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer.None;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.LinkedHashMap;

public abstract class DefaultDeserializationContext extends DeserializationContext
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  protected transient LinkedHashMap<ObjectIdGenerator.IdKey, ReadableObjectId> _objectIds;

  protected DefaultDeserializationContext(DefaultDeserializationContext paramDefaultDeserializationContext, DeserializationConfig paramDeserializationConfig, JsonParser paramJsonParser, InjectableValues paramInjectableValues)
  {
    super(paramDefaultDeserializationContext, paramDeserializationConfig, paramJsonParser, paramInjectableValues);
  }

  protected DefaultDeserializationContext(DeserializerFactory paramDeserializerFactory, DeserializerCache paramDeserializerCache)
  {
    super(paramDeserializerFactory, paramDeserializerCache);
  }

  public abstract DefaultDeserializationContext createInstance(DeserializationConfig paramDeserializationConfig, JsonParser paramJsonParser, InjectableValues paramInjectableValues);

  public JsonDeserializer<Object> deserializerInstance(Annotated paramAnnotated, Object paramObject)
  {
    Object localObject = null;
    if (paramObject == null)
      return localObject;
    if ((paramObject instanceof JsonDeserializer))
      localObject = (JsonDeserializer)paramObject;
    label20: label187: label201: 
    while (true)
    {
      Class localClass;
      HandlerInstantiator localHandlerInstantiator;
      if ((localObject instanceof ResolvableDeserializer))
      {
        ((ResolvableDeserializer)localObject).resolve(this);
        return localObject;
        if (!(paramObject instanceof Class))
          throw new IllegalStateException("AnnotationIntrospector returned deserializer definition of type " + paramObject.getClass().getName() + "; expected type JsonDeserializer or Class<JsonDeserializer> instead");
        localClass = (Class)paramObject;
        localObject = null;
        if (localClass == JsonDeserializer.None.class)
          break;
        localObject = null;
        if (localClass == NoClass.class)
          break;
        if (!JsonDeserializer.class.isAssignableFrom(localClass))
          throw new IllegalStateException("AnnotationIntrospector returned Class " + localClass.getName() + "; expected Class<JsonDeserializer>");
        localHandlerInstantiator = this._config.getHandlerInstantiator();
        localObject = null;
        if (localHandlerInstantiator != null)
          break label187;
      }
      while (true)
      {
        if (localObject != null)
          break label201;
        localObject = (JsonDeserializer)ClassUtil.createInstance(localClass, this._config.canOverrideAccessModifiers());
        break label20;
        break;
        localObject = localHandlerInstantiator.deserializerInstance(this._config, paramAnnotated, localClass);
      }
    }
  }

  public ReadableObjectId findObjectId(Object paramObject, ObjectIdGenerator<?> paramObjectIdGenerator)
  {
    ObjectIdGenerator.IdKey localIdKey = paramObjectIdGenerator.key(paramObject);
    if (this._objectIds == null)
      this._objectIds = new LinkedHashMap();
    ReadableObjectId localReadableObjectId1;
    do
    {
      ReadableObjectId localReadableObjectId2 = new ReadableObjectId(paramObject);
      this._objectIds.put(localIdKey, localReadableObjectId2);
      return localReadableObjectId2;
      localReadableObjectId1 = (ReadableObjectId)this._objectIds.get(localIdKey);
    }
    while (localReadableObjectId1 == null);
    return localReadableObjectId1;
  }

  public final KeyDeserializer keyDeserializerInstance(Annotated paramAnnotated, Object paramObject)
  {
    KeyDeserializer localKeyDeserializer = null;
    if (paramObject == null)
      return localKeyDeserializer;
    if ((paramObject instanceof KeyDeserializer))
      localKeyDeserializer = (KeyDeserializer)paramObject;
    label20: label187: label201: 
    while (true)
    {
      Class localClass;
      HandlerInstantiator localHandlerInstantiator;
      if ((localKeyDeserializer instanceof ResolvableDeserializer))
      {
        ((ResolvableDeserializer)localKeyDeserializer).resolve(this);
        return localKeyDeserializer;
        if (!(paramObject instanceof Class))
          throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + paramObject.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
        localClass = (Class)paramObject;
        localKeyDeserializer = null;
        if (localClass == KeyDeserializer.None.class)
          break;
        localKeyDeserializer = null;
        if (localClass == NoClass.class)
          break;
        if (!KeyDeserializer.class.isAssignableFrom(localClass))
          throw new IllegalStateException("AnnotationIntrospector returned Class " + localClass.getName() + "; expected Class<KeyDeserializer>");
        localHandlerInstantiator = this._config.getHandlerInstantiator();
        localKeyDeserializer = null;
        if (localHandlerInstantiator != null)
          break label187;
      }
      while (true)
      {
        if (localKeyDeserializer != null)
          break label201;
        localKeyDeserializer = (KeyDeserializer)ClassUtil.createInstance(localClass, this._config.canOverrideAccessModifiers());
        break label20;
        break;
        localKeyDeserializer = localHandlerInstantiator.keyDeserializerInstance(this._config, paramAnnotated, localClass);
      }
    }
  }

  public ObjectIdGenerator<?> objectIdGeneratorInstance(Annotated paramAnnotated, ObjectIdInfo paramObjectIdInfo)
  {
    Class localClass = paramObjectIdInfo.getGeneratorType();
    HandlerInstantiator localHandlerInstantiator = this._config.getHandlerInstantiator();
    if (localHandlerInstantiator == null);
    for (ObjectIdGenerator localObjectIdGenerator = null; ; localObjectIdGenerator = localHandlerInstantiator.objectIdGeneratorInstance(this._config, paramAnnotated, localClass))
    {
      if (localObjectIdGenerator == null)
        localObjectIdGenerator = (ObjectIdGenerator)ClassUtil.createInstance(localClass, this._config.canOverrideAccessModifiers());
      return localObjectIdGenerator.forScope(paramObjectIdInfo.getScope());
    }
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
