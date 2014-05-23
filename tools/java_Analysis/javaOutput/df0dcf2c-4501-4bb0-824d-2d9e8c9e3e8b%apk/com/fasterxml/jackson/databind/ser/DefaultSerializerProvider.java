package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.JsonSerializer.None;
import com.fasterxml.jackson.databind.JsonSerializer;;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.IdentityHashMap;

public abstract class DefaultSerializerProvider extends SerializerProvider
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  protected transient ArrayList<ObjectIdGenerator<?>> _objectIdGenerators;
  protected transient IdentityHashMap<Object, WritableObjectId> _seenObjectIds;

  protected DefaultSerializerProvider()
  {
  }

  protected DefaultSerializerProvider(SerializerProvider paramSerializerProvider, SerializationConfig paramSerializationConfig, SerializerFactory paramSerializerFactory)
  {
    super(paramSerializerProvider, paramSerializationConfig, paramSerializerFactory);
  }

  public abstract DefaultSerializerProvider createInstance(SerializationConfig paramSerializationConfig, SerializerFactory paramSerializerFactory);

  public WritableObjectId findObjectId(Object paramObject, ObjectIdGenerator<?> paramObjectIdGenerator)
  {
    ObjectIdGenerator localObjectIdGenerator;
    if (this._seenObjectIds == null)
    {
      this._seenObjectIds = new IdentityHashMap();
      if (this._objectIdGenerators != null)
        break label106;
      this._objectIdGenerators = new ArrayList(8);
      localObjectIdGenerator = null;
    }
    while (true)
    {
      if (localObjectIdGenerator == null)
      {
        localObjectIdGenerator = paramObjectIdGenerator.newForSerialization(this);
        this._objectIdGenerators.add(localObjectIdGenerator);
      }
      WritableObjectId localWritableObjectId2 = new WritableObjectId(localObjectIdGenerator);
      this._seenObjectIds.put(paramObject, localWritableObjectId2);
      return localWritableObjectId2;
      WritableObjectId localWritableObjectId1 = (WritableObjectId)this._seenObjectIds.get(paramObject);
      if (localWritableObjectId1 == null)
        break;
      return localWritableObjectId1;
      label106: int i = this._objectIdGenerators.size();
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label154;
        localObjectIdGenerator = (ObjectIdGenerator)this._objectIdGenerators.get(j);
        if (localObjectIdGenerator.canUseFor(paramObjectIdGenerator))
          break;
      }
      label154: localObjectIdGenerator = null;
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

  public void serializeValue(JsonGenerator paramJsonGenerator, Object paramObject)
  {
    boolean bool = false;
    if (paramObject == null);
    JsonSerializer localJsonSerializer;
    for (Object localObject = getDefaultNullValueSerializer(); ; localObject = localJsonSerializer)
      try
      {
        while (true)
        {
          ((JsonSerializer)localObject).serialize(paramObject, paramJsonGenerator, this);
          if (bool)
            paramJsonGenerator.writeEndObject();
          return;
          localJsonSerializer = findTypedValueSerializer(paramObject.getClass(), true, null);
          String str1 = this._config.getRootName();
          if (str1 == null)
          {
            bool = this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
            if (!bool)
              break;
            paramJsonGenerator.writeStartObject();
            paramJsonGenerator.writeFieldName(this._rootNames.findRootName(paramObject.getClass(), this._config));
            localObject = localJsonSerializer;
          }
          else if (str1.length() == 0)
          {
            localObject = localJsonSerializer;
            bool = false;
          }
          else
          {
            paramJsonGenerator.writeStartObject();
            paramJsonGenerator.writeFieldName(str1);
            bool = true;
            localObject = localJsonSerializer;
          }
        }
      }
      catch (IOException localIOException)
      {
        throw localIOException;
      }
      catch (Exception localException)
      {
        String str2 = localException.getMessage();
        if (str2 == null)
          str2 = "[no message for " + localException.getClass().getName() + "]";
        throw new JsonMappingException(str2, localException);
      }
  }

  public void serializeValue(JsonGenerator paramJsonGenerator, Object paramObject, JavaType paramJavaType, JsonSerializer<Object> paramJsonSerializer)
  {
    if (paramObject == null)
    {
      paramJsonSerializer = getDefaultNullValueSerializer();
      bool = false;
      try
      {
        while (true)
        {
          paramJsonSerializer.serialize(paramObject, paramJsonGenerator, this);
          if (bool)
            paramJsonGenerator.writeEndObject();
          return;
          if ((paramJavaType != null) && (!paramJavaType.getRawClass().isAssignableFrom(paramObject.getClass())))
            _reportIncompatibleRootType(paramObject, paramJavaType);
          if (paramJsonSerializer == null)
            paramJsonSerializer = findTypedValueSerializer(paramJavaType, true, null);
          bool = this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
          if (bool)
          {
            paramJsonGenerator.writeStartObject();
            paramJsonGenerator.writeFieldName(this._rootNames.findRootName(paramJavaType, this._config));
          }
        }
      }
      catch (IOException localIOException)
      {
        throw localIOException;
      }
      catch (Exception localException)
      {
        String str = localException.getMessage();
        if (str == null)
          str = "[no message for " + localException.getClass().getName() + "]";
        throw new JsonMappingException(str, localException);
      }
    }
  }

  public JsonSerializer<Object> serializerInstance(Annotated paramAnnotated, Object paramObject)
  {
    if (paramObject == null)
      return null;
    Object localObject;
    if ((paramObject instanceof JsonSerializer))
      localObject = (JsonSerializer)paramObject;
    while (true)
    {
      return _handleResolvable((JsonSerializer)localObject);
      if (!(paramObject instanceof Class))
        throw new IllegalStateException("AnnotationIntrospector returned serializer definition of type " + paramObject.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
      Class localClass = (Class)paramObject;
      if ((localClass == JsonSerializer.None.class) || (localClass == NoClass.class))
        break;
      if (!JsonSerializer.class.isAssignableFrom(localClass))
        throw new IllegalStateException("AnnotationIntrospector returned Class " + localClass.getName() + "; expected Class<JsonSerializer>");
      HandlerInstantiator localHandlerInstantiator = this._config.getHandlerInstantiator();
      JsonSerializer localJsonSerializer = null;
      if (localHandlerInstantiator == null);
      while (true)
      {
        if (localJsonSerializer != null)
          break label183;
        localObject = (JsonSerializer)ClassUtil.createInstance(localClass, this._config.canOverrideAccessModifiers());
        break;
        localJsonSerializer = localHandlerInstantiator.serializerInstance(this._config, paramAnnotated, localClass);
      }
      label183: localObject = localJsonSerializer;
    }
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.DefaultSerializerProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
