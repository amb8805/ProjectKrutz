package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumMapSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSerializer;
import com.fasterxml.jackson.databind.ser.std.InetAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.SqlDateSerializer;
import com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.ser.std.StdContainerSerializers;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumValues;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.RandomAccess;
import java.util.TimeZone;

public abstract class BasicSerializerFactory extends SerializerFactory
  implements Serializable
{
  protected static final HashMap<String, JsonSerializer<?>> _concrete = new HashMap();
  protected static final HashMap<String, Class<? extends JsonSerializer<?>>> _concreteLazy = new HashMap();
  private static final long serialVersionUID = -1416617628045738132L;
  protected final SerializerFactoryConfig _factoryConfig;
  protected OptionalHandlerFactory optionalHandlers = OptionalHandlerFactory.instance;

  static
  {
    _concrete.put(String.class.getName(), new StringSerializer());
    ToStringSerializer localToStringSerializer = ToStringSerializer.instance;
    _concrete.put(StringBuffer.class.getName(), localToStringSerializer);
    _concrete.put(StringBuilder.class.getName(), localToStringSerializer);
    _concrete.put(Character.class.getName(), localToStringSerializer);
    _concrete.put(Character.TYPE.getName(), localToStringSerializer);
    NumberSerializers.addAll(_concrete);
    _concrete.put(Boolean.TYPE.getName(), new BooleanSerializer(true));
    _concrete.put(Boolean.class.getName(), new BooleanSerializer(false));
    NumberSerializers.NumberSerializer localNumberSerializer = new NumberSerializers.NumberSerializer();
    _concrete.put(BigInteger.class.getName(), localNumberSerializer);
    _concrete.put(BigDecimal.class.getName(), localNumberSerializer);
    _concrete.put(Calendar.class.getName(), CalendarSerializer.instance);
    DateSerializer localDateSerializer = DateSerializer.instance;
    _concrete.put(java.util.Date.class.getName(), localDateSerializer);
    _concrete.put(Timestamp.class.getName(), localDateSerializer);
    _concrete.put(java.sql.Date.class.getName(), new SqlDateSerializer());
    _concrete.put(Time.class.getName(), new SqlTimeSerializer());
    Iterator localIterator = new StdJdkSerializers().provide().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Object localObject = localEntry.getValue();
      if ((localObject instanceof JsonSerializer))
      {
        _concrete.put(((Class)localEntry.getKey()).getName(), (JsonSerializer)localObject);
      }
      else if ((localObject instanceof Class))
      {
        Class localClass = (Class)localObject;
        _concreteLazy.put(((Class)localEntry.getKey()).getName(), localClass);
      }
      else
      {
        throw new IllegalStateException("Internal error: unrecognized value of type " + localEntry.getClass().getName());
      }
    }
    _concreteLazy.put(TokenBuffer.class.getName(), TokenBufferSerializer.class);
  }

  protected BasicSerializerFactory(SerializerFactoryConfig paramSerializerFactoryConfig)
  {
    if (paramSerializerFactoryConfig == null)
      paramSerializerFactoryConfig = new SerializerFactoryConfig();
    this._factoryConfig = paramSerializerFactoryConfig;
  }

  // ERROR //
  protected static <T extends JavaType> T modifySecondaryTypesByAnnotation(SerializationConfig paramSerializationConfig, Annotated paramAnnotated, T paramT)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 189	com/fasterxml/jackson/databind/SerializationConfig:getAnnotationIntrospector	()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;
    //   4: astore_3
    //   5: aload_2
    //   6: invokevirtual 194	com/fasterxml/jackson/databind/JavaType:isContainerType	()Z
    //   9: ifeq +96 -> 105
    //   12: aload_3
    //   13: aload_1
    //   14: aload_2
    //   15: invokevirtual 198	com/fasterxml/jackson/databind/JavaType:getKeyType	()Lcom/fasterxml/jackson/databind/JavaType;
    //   18: invokevirtual 204	com/fasterxml/jackson/databind/AnnotationIntrospector:findSerializationKeyType	(Lcom/fasterxml/jackson/databind/introspect/Annotated;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Class;
    //   21: astore 4
    //   23: aload 4
    //   25: ifnull +53 -> 78
    //   28: aload_2
    //   29: instanceof 206
    //   32: ifne +32 -> 64
    //   35: new 183	java/lang/IllegalArgumentException
    //   38: dup
    //   39: new 55	java/lang/StringBuilder
    //   42: dup
    //   43: ldc 208
    //   45: invokespecial 148	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   48: aload_2
    //   49: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   52: ldc 213
    //   54: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: invokevirtual 161	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   60: invokespecial 214	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   63: athrow
    //   64: aload_2
    //   65: checkcast 206	com/fasterxml/jackson/databind/type/MapType
    //   68: aload 4
    //   70: invokevirtual 218	com/fasterxml/jackson/databind/type/MapType:widenKey	(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;
    //   73: astore 9
    //   75: aload 9
    //   77: astore_2
    //   78: aload_3
    //   79: aload_1
    //   80: aload_2
    //   81: invokevirtual 221	com/fasterxml/jackson/databind/JavaType:getContentType	()Lcom/fasterxml/jackson/databind/JavaType;
    //   84: invokevirtual 224	com/fasterxml/jackson/databind/AnnotationIntrospector:findSerializationContentType	(Lcom/fasterxml/jackson/databind/introspect/Annotated;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Class;
    //   87: astore 5
    //   89: aload 5
    //   91: ifnull +14 -> 105
    //   94: aload_2
    //   95: aload 5
    //   97: invokevirtual 227	com/fasterxml/jackson/databind/JavaType:widenContentsBy	(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;
    //   100: astore 7
    //   102: aload 7
    //   104: astore_2
    //   105: aload_2
    //   106: areturn
    //   107: astore 8
    //   109: new 183	java/lang/IllegalArgumentException
    //   112: dup
    //   113: new 55	java/lang/StringBuilder
    //   116: dup
    //   117: ldc 229
    //   119: invokespecial 148	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   122: aload_2
    //   123: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   126: ldc 231
    //   128: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: aload 4
    //   133: invokevirtual 38	java/lang/Class:getName	()Ljava/lang/String;
    //   136: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: ldc 233
    //   141: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: aload 8
    //   146: invokevirtual 236	java/lang/IllegalArgumentException:getMessage	()Ljava/lang/String;
    //   149: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: invokevirtual 161	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   155: invokespecial 214	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   158: athrow
    //   159: astore 6
    //   161: new 183	java/lang/IllegalArgumentException
    //   164: dup
    //   165: new 55	java/lang/StringBuilder
    //   168: dup
    //   169: ldc 238
    //   171: invokespecial 148	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   174: aload_2
    //   175: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   178: ldc 240
    //   180: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: aload 5
    //   185: invokevirtual 38	java/lang/Class:getName	()Ljava/lang/String;
    //   188: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: ldc 233
    //   193: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: aload 6
    //   198: invokevirtual 236	java/lang/IllegalArgumentException:getMessage	()Ljava/lang/String;
    //   201: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: invokevirtual 161	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   207: invokespecial 214	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   210: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   64	75	107	java/lang/IllegalArgumentException
    //   94	102	159	java/lang/IllegalArgumentException
  }

  protected JsonSerializer<Object> _findContentSerializer(SerializerProvider paramSerializerProvider, Annotated paramAnnotated)
  {
    Object localObject = paramSerializerProvider.getAnnotationIntrospector().findContentSerializer(paramAnnotated);
    if (localObject != null)
      return paramSerializerProvider.serializerInstance(paramAnnotated, localObject);
    return null;
  }

  protected JsonSerializer<Object> _findKeySerializer(SerializerProvider paramSerializerProvider, Annotated paramAnnotated)
  {
    Object localObject = paramSerializerProvider.getAnnotationIntrospector().findKeySerializer(paramAnnotated);
    if (localObject != null)
      return paramSerializerProvider.serializerInstance(paramAnnotated, localObject);
    return null;
  }

  protected JsonSerializer<?> buildArraySerializer(SerializationConfig paramSerializationConfig, ArrayType paramArrayType, BeanDescription paramBeanDescription, boolean paramBoolean, TypeSerializer paramTypeSerializer, JsonSerializer<Object> paramJsonSerializer)
  {
    Iterator localIterator = customSerializers().iterator();
    JsonSerializer localJsonSerializer;
    do
    {
      if (!localIterator.hasNext())
        break;
      localJsonSerializer = ((Serializers)localIterator.next()).findArraySerializer(paramSerializationConfig, paramArrayType, paramBeanDescription, paramTypeSerializer, paramJsonSerializer);
    }
    while (localJsonSerializer == null);
    do
    {
      return localJsonSerializer;
      Class localClass = paramArrayType.getRawClass();
      if ((paramJsonSerializer != null) && (!ClassUtil.isJacksonStdImpl(paramJsonSerializer)))
        break;
      if ([Ljava.lang.String.class == localClass)
        return StringArraySerializer.instance;
      localJsonSerializer = StdArraySerializers.findStandardImpl(localClass);
    }
    while (localJsonSerializer != null);
    return new ObjectArraySerializer(paramArrayType.getContentType(), paramBoolean, paramTypeSerializer, paramJsonSerializer);
  }

  protected JsonSerializer<?> buildCollectionSerializer(SerializationConfig paramSerializationConfig, CollectionType paramCollectionType, BeanDescription paramBeanDescription, boolean paramBoolean, TypeSerializer paramTypeSerializer, JsonSerializer<Object> paramJsonSerializer)
  {
    Class localClass1 = paramCollectionType.getRawClass();
    if (EnumSet.class.isAssignableFrom(localClass1))
    {
      JavaType localJavaType = paramCollectionType.getContentType();
      if (!localJavaType.isEnumType())
        localJavaType = null;
      return StdContainerSerializers.enumSetSerializer(localJavaType);
    }
    Class localClass2 = paramCollectionType.getContentType().getRawClass();
    if (isIndexedList(localClass1))
    {
      if ((localClass2 == String.class) && ((paramJsonSerializer == null) || (ClassUtil.isJacksonStdImpl(paramJsonSerializer))))
        return IndexedStringListSerializer.instance;
      return StdContainerSerializers.indexedListSerializer(paramCollectionType.getContentType(), paramBoolean, paramTypeSerializer, paramJsonSerializer);
    }
    if ((localClass2 == String.class) && ((paramJsonSerializer == null) || (ClassUtil.isJacksonStdImpl(paramJsonSerializer))))
      return StringCollectionSerializer.instance;
    return StdContainerSerializers.collectionSerializer(paramCollectionType.getContentType(), paramBoolean, paramTypeSerializer, paramJsonSerializer);
  }

  protected JsonSerializer<?> buildContainerSerializer(SerializerProvider paramSerializerProvider, JavaType paramJavaType, BeanDescription paramBeanDescription, boolean paramBoolean)
  {
    SerializationConfig localSerializationConfig = paramSerializerProvider.getConfig();
    TypeSerializer localTypeSerializer = createTypeSerializer(localSerializationConfig, paramJavaType.getContentType());
    if (localTypeSerializer != null);
    for (boolean bool = false; ; bool = paramBoolean)
    {
      JsonSerializer localJsonSerializer1 = _findContentSerializer(paramSerializerProvider, paramBeanDescription.getClassInfo());
      if (paramJavaType.isMapLikeType())
      {
        MapLikeType localMapLikeType = (MapLikeType)paramJavaType;
        JsonSerializer localJsonSerializer4 = _findKeySerializer(paramSerializerProvider, paramBeanDescription.getClassInfo());
        if (localMapLikeType.isTrueMapType())
          return buildMapSerializer(localSerializationConfig, (MapType)localMapLikeType, paramBeanDescription, bool, localJsonSerializer4, localTypeSerializer, localJsonSerializer1);
        Iterator localIterator3 = customSerializers().iterator();
        while (localIterator3.hasNext())
        {
          JsonSerializer localJsonSerializer5 = ((Serializers)localIterator3.next()).findMapLikeSerializer(localSerializationConfig, (MapLikeType)paramJavaType, paramBeanDescription, localJsonSerializer4, localTypeSerializer, localJsonSerializer1);
          if (localJsonSerializer5 != null)
            return localJsonSerializer5;
        }
        return null;
      }
      if (paramJavaType.isCollectionLikeType())
      {
        CollectionLikeType localCollectionLikeType = (CollectionLikeType)paramJavaType;
        if (localCollectionLikeType.isTrueCollectionType())
        {
          CollectionType localCollectionType = (CollectionType)localCollectionLikeType;
          Iterator localIterator2 = customSerializers().iterator();
          while (localIterator2.hasNext())
          {
            JsonSerializer localJsonSerializer3 = ((Serializers)localIterator2.next()).findCollectionSerializer(localSerializationConfig, localCollectionType, paramBeanDescription, localTypeSerializer, localJsonSerializer1);
            if (localJsonSerializer3 != null)
              return localJsonSerializer3;
          }
          JsonFormat.Value localValue = paramBeanDescription.findExpectedFormat(null);
          if ((localValue == null) || (localValue.getShape() != JsonFormat.Shape.OBJECT))
            return buildCollectionSerializer(localSerializationConfig, localCollectionType, paramBeanDescription, bool, localTypeSerializer, localJsonSerializer1);
        }
        else
        {
          Iterator localIterator1 = customSerializers().iterator();
          while (localIterator1.hasNext())
          {
            JsonSerializer localJsonSerializer2 = ((Serializers)localIterator1.next()).findCollectionLikeSerializer(localSerializationConfig, (CollectionLikeType)paramJavaType, paramBeanDescription, localTypeSerializer, localJsonSerializer1);
            if (localJsonSerializer2 != null)
              return localJsonSerializer2;
          }
          return null;
        }
      }
      if (paramJavaType.isArrayType())
        return buildArraySerializer(localSerializationConfig, (ArrayType)paramJavaType, paramBeanDescription, bool, localTypeSerializer, localJsonSerializer1);
      return null;
    }
  }

  protected JsonSerializer<?> buildIterableSerializer(SerializationConfig paramSerializationConfig, JavaType paramJavaType, BeanDescription paramBeanDescription, boolean paramBoolean)
  {
    JavaType localJavaType = paramJavaType.containedType(0);
    if (localJavaType == null)
      localJavaType = TypeFactory.unknownType();
    TypeSerializer localTypeSerializer = createTypeSerializer(paramSerializationConfig, localJavaType);
    return StdContainerSerializers.iterableSerializer(localJavaType, usesStaticTyping(paramSerializationConfig, paramBeanDescription, localTypeSerializer), localTypeSerializer);
  }

  protected JsonSerializer<?> buildIteratorSerializer(SerializationConfig paramSerializationConfig, JavaType paramJavaType, BeanDescription paramBeanDescription, boolean paramBoolean)
  {
    JavaType localJavaType = paramJavaType.containedType(0);
    if (localJavaType == null)
      localJavaType = TypeFactory.unknownType();
    TypeSerializer localTypeSerializer = createTypeSerializer(paramSerializationConfig, localJavaType);
    return StdContainerSerializers.iteratorSerializer(localJavaType, usesStaticTyping(paramSerializationConfig, paramBeanDescription, localTypeSerializer), localTypeSerializer);
  }

  protected JsonSerializer<?> buildMapSerializer(SerializationConfig paramSerializationConfig, MapType paramMapType, BeanDescription paramBeanDescription, boolean paramBoolean, JsonSerializer<Object> paramJsonSerializer1, TypeSerializer paramTypeSerializer, JsonSerializer<Object> paramJsonSerializer2)
  {
    Iterator localIterator = customSerializers().iterator();
    while (localIterator.hasNext())
    {
      JsonSerializer localJsonSerializer = ((Serializers)localIterator.next()).findMapSerializer(paramSerializationConfig, paramMapType, paramBeanDescription, paramJsonSerializer1, paramTypeSerializer, paramJsonSerializer2);
      if (localJsonSerializer != null)
        return localJsonSerializer;
    }
    if (EnumMap.class.isAssignableFrom(paramMapType.getRawClass()))
    {
      JavaType localJavaType = paramMapType.getKeyType();
      boolean bool = localJavaType.isEnumType();
      EnumValues localEnumValues = null;
      if (bool)
        localEnumValues = EnumValues.construct(localJavaType.getRawClass(), paramSerializationConfig.getAnnotationIntrospector());
      return new EnumMapSerializer(paramMapType.getContentType(), paramBoolean, localEnumValues, paramTypeSerializer, paramJsonSerializer2);
    }
    return MapSerializer.construct(paramSerializationConfig.getAnnotationIntrospector().findPropertiesToIgnore(paramBeanDescription.getClassInfo()), paramMapType, paramBoolean, paramTypeSerializer, paramJsonSerializer1, paramJsonSerializer2);
  }

  public JsonSerializer<Object> createKeySerializer(SerializationConfig paramSerializationConfig, JavaType paramJavaType)
  {
    boolean bool = this._factoryConfig.hasKeySerializers();
    Object localObject = null;
    if (!bool);
    do
    {
      BeanDescription localBeanDescription;
      Iterator localIterator;
      while (!localIterator.hasNext())
      {
        return localObject;
        localBeanDescription = paramSerializationConfig.introspectClassAnnotations(paramJavaType.getRawClass());
        localIterator = this._factoryConfig.keySerializers().iterator();
      }
      localObject = ((Serializers)localIterator.next()).findSerializer(paramSerializationConfig, paramJavaType, localBeanDescription);
    }
    while (localObject == null);
    return localObject;
  }

  public TypeSerializer createTypeSerializer(SerializationConfig paramSerializationConfig, JavaType paramJavaType)
  {
    AnnotatedClass localAnnotatedClass = paramSerializationConfig.introspectClassAnnotations(paramJavaType.getRawClass()).getClassInfo();
    AnnotationIntrospector localAnnotationIntrospector = paramSerializationConfig.getAnnotationIntrospector();
    TypeResolverBuilder localTypeResolverBuilder = localAnnotationIntrospector.findTypeResolver(paramSerializationConfig, localAnnotatedClass, paramJavaType);
    if (localTypeResolverBuilder == null)
      localTypeResolverBuilder = paramSerializationConfig.getDefaultTyper(paramJavaType);
    for (Collection localCollection = null; localTypeResolverBuilder == null; localCollection = paramSerializationConfig.getSubtypeResolver().collectAndResolveSubtypes(localAnnotatedClass, paramSerializationConfig, localAnnotationIntrospector))
      return null;
    return localTypeResolverBuilder.buildTypeSerializer(paramSerializationConfig, paramJavaType, localCollection);
  }

  protected abstract Iterable<Serializers> customSerializers();

  protected final JsonSerializer<?> findSerializerByAddonType(SerializationConfig paramSerializationConfig, JavaType paramJavaType, BeanDescription paramBeanDescription, boolean paramBoolean)
  {
    Class localClass = paramJavaType.getRawClass();
    if (Iterator.class.isAssignableFrom(localClass))
      return buildIteratorSerializer(paramSerializationConfig, paramJavaType, paramBeanDescription, paramBoolean);
    if (Iterable.class.isAssignableFrom(localClass))
      return buildIterableSerializer(paramSerializationConfig, paramJavaType, paramBeanDescription, paramBoolean);
    if (CharSequence.class.isAssignableFrom(localClass))
      return ToStringSerializer.instance;
    return null;
  }

  protected final JsonSerializer<?> findSerializerByAnnotations(SerializerProvider paramSerializerProvider, JavaType paramJavaType, BeanDescription paramBeanDescription)
  {
    if (JsonSerializable.class.isAssignableFrom(paramJavaType.getRawClass()))
      return SerializableSerializer.instance;
    AnnotatedMethod localAnnotatedMethod = paramBeanDescription.findJsonValueMethod();
    if (localAnnotatedMethod != null)
    {
      Method localMethod = localAnnotatedMethod.getAnnotated();
      if (paramSerializerProvider.canOverrideAccessModifiers())
        ClassUtil.checkAndFixAccess(localMethod);
      return new JsonValueSerializer(localMethod, findSerializerFromAnnotation(paramSerializerProvider, localAnnotatedMethod));
    }
    return null;
  }

  protected final JsonSerializer<?> findSerializerByLookup(JavaType paramJavaType, SerializationConfig paramSerializationConfig, BeanDescription paramBeanDescription, boolean paramBoolean)
  {
    String str = paramJavaType.getRawClass().getName();
    JsonSerializer localJsonSerializer1 = (JsonSerializer)_concrete.get(str);
    if (localJsonSerializer1 != null)
      return localJsonSerializer1;
    Class localClass = (Class)_concreteLazy.get(str);
    if (localClass != null)
      try
      {
        JsonSerializer localJsonSerializer2 = (JsonSerializer)localClass.newInstance();
        return localJsonSerializer2;
      }
      catch (Exception localException)
      {
        throw new IllegalStateException("Failed to instantiate standard serializer (of type " + localClass.getName() + "): " + localException.getMessage(), localException);
      }
    return null;
  }

  protected final JsonSerializer<?> findSerializerByPrimaryType(SerializerProvider paramSerializerProvider, JavaType paramJavaType, BeanDescription paramBeanDescription, boolean paramBoolean)
  {
    Class localClass = paramJavaType.getRawClass();
    Object localObject;
    if (InetAddress.class.isAssignableFrom(localClass))
      localObject = InetAddressSerializer.instance;
    do
    {
      return localObject;
      if (TimeZone.class.isAssignableFrom(localClass))
        return TimeZoneSerializer.instance;
      if (Charset.class.isAssignableFrom(localClass))
        return ToStringSerializer.instance;
      localObject = this.optionalHandlers.findSerializer(paramSerializerProvider.getConfig(), paramJavaType);
    }
    while (localObject != null);
    if (Number.class.isAssignableFrom(localClass))
      return NumberSerializers.NumberSerializer.instance;
    JsonFormat.Value localValue;
    if (Enum.class.isAssignableFrom(localClass))
    {
      localValue = paramBeanDescription.findExpectedFormat(null);
      if ((localValue != null) && (localValue.getShape() == JsonFormat.Shape.OBJECT))
        ((BasicBeanDescription)paramBeanDescription).removeProperty("declaringClass");
    }
    else
    {
      if (!Calendar.class.isAssignableFrom(localClass))
        break label161;
      return CalendarSerializer.instance;
    }
    return EnumSerializer.construct(localClass, paramSerializerProvider.getConfig(), paramBeanDescription, localValue);
    label161: if (java.util.Date.class.isAssignableFrom(localClass))
      return DateSerializer.instance;
    return null;
  }

  protected JsonSerializer<Object> findSerializerFromAnnotation(SerializerProvider paramSerializerProvider, Annotated paramAnnotated)
  {
    Object localObject = paramSerializerProvider.getAnnotationIntrospector().findSerializer(paramAnnotated);
    if (localObject == null)
      return null;
    return paramSerializerProvider.serializerInstance(paramAnnotated, localObject);
  }

  protected boolean isIndexedList(Class<?> paramClass)
  {
    return RandomAccess.class.isAssignableFrom(paramClass);
  }

  protected <T extends JavaType> T modifyTypeByAnnotation(SerializationConfig paramSerializationConfig, Annotated paramAnnotated, T paramT)
  {
    localClass = paramSerializationConfig.getAnnotationIntrospector().findSerializationType(paramAnnotated);
    if (localClass != null)
      try
      {
        JavaType localJavaType = paramT.widenBy(localClass);
        paramT = localJavaType;
        return modifySecondaryTypesByAnnotation(paramSerializationConfig, paramAnnotated, paramT);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw new IllegalArgumentException("Failed to widen type " + paramT + " with concrete-type annotation (value " + localClass.getName() + "), method '" + paramAnnotated.getName() + "': " + localIllegalArgumentException.getMessage());
      }
  }

  protected boolean usesStaticTyping(SerializationConfig paramSerializationConfig, BeanDescription paramBeanDescription, TypeSerializer paramTypeSerializer)
  {
    if (paramTypeSerializer != null);
    do
    {
      JsonSerialize.Typing localTyping;
      do
      {
        return false;
        localTyping = paramSerializationConfig.getAnnotationIntrospector().findSerializationTyping(paramBeanDescription.getClassInfo());
        if (localTyping == null)
          break;
      }
      while (localTyping != JsonSerialize.Typing.STATIC);
      return true;
    }
    while (!paramSerializationConfig.isEnabled(MapperFeature.USE_STATIC_TYPING));
    return true;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.BasicSerializerFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
