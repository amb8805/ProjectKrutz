package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.SerializerCache;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public abstract class SerializerProvider
{
  public static final JsonSerializer<Object> DEFAULT_NULL_KEY_SERIALIZER = new FailingSerializer("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
  public static final JsonSerializer<Object> DEFAULT_UNKNOWN_SERIALIZER = new UnknownSerializer();
  protected static final JavaType TYPE_OBJECT = TypeFactory.defaultInstance().uncheckedSimpleType(Object.class);
  protected final SerializationConfig _config;
  protected DateFormat _dateFormat;
  protected JsonSerializer<Object> _keySerializer;
  protected final ReadOnlyClassToSerializerMap _knownSerializers;
  protected JsonSerializer<Object> _nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
  protected JsonSerializer<Object> _nullValueSerializer = NullSerializer.instance;
  protected final RootNameLookup _rootNames;
  protected final Class<?> _serializationView;
  protected final SerializerCache _serializerCache;
  protected final SerializerFactory _serializerFactory;
  protected JsonSerializer<Object> _unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;

  public SerializerProvider()
  {
    this._config = null;
    this._serializerFactory = null;
    this._serializerCache = new SerializerCache();
    this._knownSerializers = null;
    this._rootNames = new RootNameLookup();
    this._serializationView = null;
  }

  protected SerializerProvider(SerializerProvider paramSerializerProvider, SerializationConfig paramSerializationConfig, SerializerFactory paramSerializerFactory)
  {
    if (paramSerializationConfig == null)
      throw new NullPointerException();
    this._serializerFactory = paramSerializerFactory;
    this._config = paramSerializationConfig;
    this._serializerCache = paramSerializerProvider._serializerCache;
    this._unknownTypeSerializer = paramSerializerProvider._unknownTypeSerializer;
    this._keySerializer = paramSerializerProvider._keySerializer;
    this._nullValueSerializer = paramSerializerProvider._nullValueSerializer;
    this._nullKeySerializer = paramSerializerProvider._nullKeySerializer;
    this._rootNames = paramSerializerProvider._rootNames;
    this._knownSerializers = this._serializerCache.getReadOnlyLookupMap();
    this._serializationView = paramSerializationConfig.getActiveView();
  }

  protected JsonSerializer<Object> _createAndCacheUntypedSerializer(JavaType paramJavaType)
  {
    try
    {
      JsonSerializer localJsonSerializer = _createUntypedSerializer(paramJavaType);
      if (localJsonSerializer != null)
        this._serializerCache.addAndResolveNonTypedSerializer(paramJavaType, localJsonSerializer, this);
      return localJsonSerializer;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new JsonMappingException(localIllegalArgumentException.getMessage(), null, localIllegalArgumentException);
    }
  }

  protected JsonSerializer<Object> _createAndCacheUntypedSerializer(Class<?> paramClass)
  {
    try
    {
      JsonSerializer localJsonSerializer = _createUntypedSerializer(this._config.constructType(paramClass));
      if (localJsonSerializer != null)
        this._serializerCache.addAndResolveNonTypedSerializer(paramClass, localJsonSerializer, this);
      return localJsonSerializer;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new JsonMappingException(localIllegalArgumentException.getMessage(), null, localIllegalArgumentException);
    }
  }

  protected JsonSerializer<Object> _createUntypedSerializer(JavaType paramJavaType)
  {
    return this._serializerFactory.createSerializer(this, paramJavaType, null);
  }

  protected final DateFormat _dateFormat()
  {
    if (this._dateFormat != null)
      return this._dateFormat;
    DateFormat localDateFormat = (DateFormat)this._config.getDateFormat().clone();
    this._dateFormat = localDateFormat;
    return localDateFormat;
  }

  protected JsonSerializer<Object> _handleContextual(JsonSerializer<?> paramJsonSerializer, BeanProperty paramBeanProperty)
  {
    if ((paramJsonSerializer instanceof ContextualSerializer))
      paramJsonSerializer = ((ContextualSerializer)paramJsonSerializer).createContextual(this, paramBeanProperty);
    return paramJsonSerializer;
  }

  protected JsonSerializer<Object> _handleContextualResolvable(JsonSerializer<?> paramJsonSerializer, BeanProperty paramBeanProperty)
  {
    if ((paramJsonSerializer instanceof ResolvableSerializer))
      ((ResolvableSerializer)paramJsonSerializer).resolve(this);
    return _handleContextual(paramJsonSerializer, paramBeanProperty);
  }

  protected JsonSerializer<Object> _handleResolvable(JsonSerializer<?> paramJsonSerializer)
  {
    if ((paramJsonSerializer instanceof ResolvableSerializer))
      ((ResolvableSerializer)paramJsonSerializer).resolve(this);
    return paramJsonSerializer;
  }

  protected void _reportIncompatibleRootType(Object paramObject, JavaType paramJavaType)
  {
    if ((paramJavaType.isPrimitive()) && (ClassUtil.wrapperType(paramJavaType.getRawClass()).isAssignableFrom(paramObject.getClass())))
      return;
    throw new JsonMappingException("Incompatible types: declared root type (" + paramJavaType + ") vs " + paramObject.getClass().getName());
  }

  public final boolean canOverrideAccessModifiers()
  {
    return this._config.canOverrideAccessModifiers();
  }

  public JavaType constructSpecializedType(JavaType paramJavaType, Class<?> paramClass)
  {
    return this._config.constructSpecializedType(paramJavaType, paramClass);
  }

  public JavaType constructType(Type paramType)
  {
    return this._config.getTypeFactory().constructType(paramType);
  }

  public void defaultSerializeDateKey(long paramLong, JsonGenerator paramJsonGenerator)
  {
    if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS))
    {
      paramJsonGenerator.writeFieldName(String.valueOf(paramLong));
      return;
    }
    paramJsonGenerator.writeFieldName(_dateFormat().format(new Date(paramLong)));
  }

  public void defaultSerializeDateKey(Date paramDate, JsonGenerator paramJsonGenerator)
  {
    if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS))
    {
      paramJsonGenerator.writeFieldName(String.valueOf(paramDate.getTime()));
      return;
    }
    paramJsonGenerator.writeFieldName(_dateFormat().format(paramDate));
  }

  public final void defaultSerializeDateValue(Date paramDate, JsonGenerator paramJsonGenerator)
  {
    if (isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS))
    {
      paramJsonGenerator.writeNumber(paramDate.getTime());
      return;
    }
    paramJsonGenerator.writeString(_dateFormat().format(paramDate));
  }

  public final void defaultSerializeNull(JsonGenerator paramJsonGenerator)
  {
    getDefaultNullValueSerializer().serialize(null, paramJsonGenerator, this);
  }

  public final void defaultSerializeValue(Object paramObject, JsonGenerator paramJsonGenerator)
  {
    if (paramObject == null)
    {
      getDefaultNullValueSerializer().serialize(null, paramJsonGenerator, this);
      return;
    }
    findTypedValueSerializer(paramObject.getClass(), true, null).serialize(paramObject, paramJsonGenerator, this);
  }

  public JsonSerializer<Object> findKeySerializer(JavaType paramJavaType, BeanProperty paramBeanProperty)
  {
    JsonSerializer localJsonSerializer = this._serializerFactory.createKeySerializer(this._config, paramJavaType);
    if (localJsonSerializer == null)
      if (this._keySerializer != null)
        break label36;
    label36: for (localJsonSerializer = StdKeySerializers.getStdKeySerializer(paramJavaType); ; localJsonSerializer = this._keySerializer)
      return _handleContextualResolvable(localJsonSerializer, paramBeanProperty);
  }

  public JsonSerializer<Object> findNullKeySerializer(JavaType paramJavaType, BeanProperty paramBeanProperty)
  {
    return getDefaultNullKeySerializer();
  }

  public JsonSerializer<Object> findNullValueSerializer(BeanProperty paramBeanProperty)
  {
    return getDefaultNullValueSerializer();
  }

  public abstract WritableObjectId findObjectId(Object paramObject, ObjectIdGenerator<?> paramObjectIdGenerator);

  public JsonSerializer<Object> findTypedValueSerializer(JavaType paramJavaType, boolean paramBoolean, BeanProperty paramBeanProperty)
  {
    Object localObject = this._knownSerializers.typedValueSerializer(paramJavaType);
    if (localObject != null);
    while (true)
    {
      return localObject;
      localObject = this._serializerCache.typedValueSerializer(paramJavaType);
      if (localObject == null)
      {
        JsonSerializer localJsonSerializer = findValueSerializer(paramJavaType, paramBeanProperty);
        TypeSerializer localTypeSerializer = this._serializerFactory.createTypeSerializer(this._config, paramJavaType);
        if (localTypeSerializer != null);
        for (localObject = new TypeWrappedSerializer(localTypeSerializer.forProperty(paramBeanProperty), localJsonSerializer); paramBoolean; localObject = localJsonSerializer)
        {
          this._serializerCache.addTypedSerializer(paramJavaType, (JsonSerializer)localObject);
          return localObject;
        }
      }
    }
  }

  public JsonSerializer<Object> findTypedValueSerializer(Class<?> paramClass, boolean paramBoolean, BeanProperty paramBeanProperty)
  {
    Object localObject = this._knownSerializers.typedValueSerializer(paramClass);
    if (localObject != null);
    while (true)
    {
      return localObject;
      localObject = this._serializerCache.typedValueSerializer(paramClass);
      if (localObject == null)
      {
        JsonSerializer localJsonSerializer = findValueSerializer(paramClass, paramBeanProperty);
        TypeSerializer localTypeSerializer = this._serializerFactory.createTypeSerializer(this._config, this._config.constructType(paramClass));
        if (localTypeSerializer != null);
        for (localObject = new TypeWrappedSerializer(localTypeSerializer.forProperty(paramBeanProperty), localJsonSerializer); paramBoolean; localObject = localJsonSerializer)
        {
          this._serializerCache.addTypedSerializer(paramClass, (JsonSerializer)localObject);
          return localObject;
        }
      }
    }
  }

  public JsonSerializer<Object> findValueSerializer(JavaType paramJavaType, BeanProperty paramBeanProperty)
  {
    JsonSerializer localJsonSerializer = this._knownSerializers.untypedValueSerializer(paramJavaType);
    if (localJsonSerializer == null)
    {
      localJsonSerializer = this._serializerCache.untypedValueSerializer(paramJavaType);
      if (localJsonSerializer == null)
      {
        localJsonSerializer = _createAndCacheUntypedSerializer(paramJavaType);
        if (localJsonSerializer == null)
          return getUnknownTypeSerializer(paramJavaType.getRawClass());
      }
    }
    return _handleContextual(localJsonSerializer, paramBeanProperty);
  }

  public JsonSerializer<Object> findValueSerializer(Class<?> paramClass, BeanProperty paramBeanProperty)
  {
    JsonSerializer localJsonSerializer = this._knownSerializers.untypedValueSerializer(paramClass);
    if (localJsonSerializer == null)
    {
      localJsonSerializer = this._serializerCache.untypedValueSerializer(paramClass);
      if (localJsonSerializer == null)
      {
        localJsonSerializer = this._serializerCache.untypedValueSerializer(this._config.constructType(paramClass));
        if (localJsonSerializer == null)
        {
          localJsonSerializer = _createAndCacheUntypedSerializer(paramClass);
          if (localJsonSerializer == null)
            return getUnknownTypeSerializer(paramClass);
        }
      }
    }
    return _handleContextual(localJsonSerializer, paramBeanProperty);
  }

  public final AnnotationIntrospector getAnnotationIntrospector()
  {
    return this._config.getAnnotationIntrospector();
  }

  public final SerializationConfig getConfig()
  {
    return this._config;
  }

  public JsonSerializer<Object> getDefaultNullKeySerializer()
  {
    return this._nullKeySerializer;
  }

  public JsonSerializer<Object> getDefaultNullValueSerializer()
  {
    return this._nullValueSerializer;
  }

  public final FilterProvider getFilterProvider()
  {
    return this._config.getFilterProvider();
  }

  public Locale getLocale()
  {
    return this._config.getLocale();
  }

  public final Class<?> getSerializationView()
  {
    return this._serializationView;
  }

  public TimeZone getTimeZone()
  {
    return this._config.getTimeZone();
  }

  public TypeFactory getTypeFactory()
  {
    return this._config.getTypeFactory();
  }

  public JsonSerializer<Object> getUnknownTypeSerializer(Class<?> paramClass)
  {
    return this._unknownTypeSerializer;
  }

  public final boolean isEnabled(MapperFeature paramMapperFeature)
  {
    return this._config.isEnabled(paramMapperFeature);
  }

  public final boolean isEnabled(SerializationFeature paramSerializationFeature)
  {
    return this._config.isEnabled(paramSerializationFeature);
  }

  public abstract ObjectIdGenerator<?> objectIdGeneratorInstance(Annotated paramAnnotated, ObjectIdInfo paramObjectIdInfo);

  public abstract JsonSerializer<Object> serializerInstance(Annotated paramAnnotated, Object paramObject);
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.SerializerProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
