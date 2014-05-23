package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public final class DeserializerCache
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  protected final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> _cachedDeserializers = new ConcurrentHashMap(64, 0.75F, 2);
  protected final HashMap<JavaType, JsonDeserializer<Object>> _incompleteDeserializers = new HashMap(8);

  public DeserializerCache()
  {
  }

  private Class<?> _verifyAsClass(Object paramObject, String paramString, Class<?> paramClass)
  {
    Object localObject;
    if (paramObject == null)
      localObject = null;
    do
    {
      return localObject;
      if (!(paramObject instanceof Class))
        throw new IllegalStateException("AnnotationIntrospector." + paramString + "() returned value of type " + paramObject.getClass().getName() + ": expected type JsonSerializer or Class<JsonSerializer> instead");
      localObject = (Class)paramObject;
    }
    while ((localObject != paramClass) && (localObject != NoClass.class));
    return null;
  }

  // ERROR //
  private JavaType modifyTypeByAnnotation(DeserializationContext paramDeserializationContext, Annotated paramAnnotated, JavaType paramJavaType)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 80	com/fasterxml/jackson/databind/DeserializationContext:getAnnotationIntrospector	()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;
    //   4: astore 4
    //   6: aload 4
    //   8: aload_2
    //   9: aload_3
    //   10: invokevirtual 86	com/fasterxml/jackson/databind/AnnotationIntrospector:findDeserializationType	(Lcom/fasterxml/jackson/databind/introspect/Annotated;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Class;
    //   13: astore 5
    //   15: aload 5
    //   17: ifnull +461 -> 478
    //   20: aload_3
    //   21: aload 5
    //   23: invokevirtual 92	com/fasterxml/jackson/databind/JavaType:narrowBy	(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;
    //   26: astore 22
    //   28: aload 22
    //   30: astore 6
    //   32: aload 6
    //   34: invokevirtual 96	com/fasterxml/jackson/databind/JavaType:isContainerType	()Z
    //   37: ifeq +438 -> 475
    //   40: aload 4
    //   42: aload_2
    //   43: aload 6
    //   45: invokevirtual 100	com/fasterxml/jackson/databind/JavaType:getKeyType	()Lcom/fasterxml/jackson/databind/JavaType;
    //   48: invokevirtual 103	com/fasterxml/jackson/databind/AnnotationIntrospector:findDeserializationKeyType	(Lcom/fasterxml/jackson/databind/introspect/Annotated;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Class;
    //   51: astore 7
    //   53: aload 7
    //   55: ifnull +413 -> 468
    //   58: aload 6
    //   60: instanceof 105
    //   63: ifne +100 -> 163
    //   66: new 107	com/fasterxml/jackson/databind/JsonMappingException
    //   69: dup
    //   70: new 43	java/lang/StringBuilder
    //   73: dup
    //   74: ldc 109
    //   76: invokespecial 48	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   79: aload 6
    //   81: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   84: ldc 114
    //   86: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   92: invokespecial 115	com/fasterxml/jackson/databind/JsonMappingException:<init>	(Ljava/lang/String;)V
    //   95: athrow
    //   96: astore 21
    //   98: new 107	com/fasterxml/jackson/databind/JsonMappingException
    //   101: dup
    //   102: new 43	java/lang/StringBuilder
    //   105: dup
    //   106: ldc 117
    //   108: invokespecial 48	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   111: aload_3
    //   112: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   115: ldc 119
    //   117: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: aload 5
    //   122: invokevirtual 62	java/lang/Class:getName	()Ljava/lang/String;
    //   125: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: ldc 121
    //   130: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: aload_2
    //   134: invokevirtual 124	com/fasterxml/jackson/databind/introspect/Annotated:getName	()Ljava/lang/String;
    //   137: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: ldc 126
    //   142: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: aload 21
    //   147: invokevirtual 129	java/lang/IllegalArgumentException:getMessage	()Ljava/lang/String;
    //   150: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   156: aconst_null
    //   157: aload 21
    //   159: invokespecial 132	com/fasterxml/jackson/databind/JsonMappingException:<init>	(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonLocation;Ljava/lang/Throwable;)V
    //   162: athrow
    //   163: aload 6
    //   165: checkcast 105	com/fasterxml/jackson/databind/type/MapLikeType
    //   168: aload 7
    //   170: invokevirtual 135	com/fasterxml/jackson/databind/type/MapLikeType:narrowKey	(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;
    //   173: astore 20
    //   175: aload 20
    //   177: astore 8
    //   179: aload 8
    //   181: invokevirtual 100	com/fasterxml/jackson/databind/JavaType:getKeyType	()Lcom/fasterxml/jackson/databind/JavaType;
    //   184: astore 9
    //   186: aload 9
    //   188: ifnull +56 -> 244
    //   191: aload 9
    //   193: invokevirtual 139	com/fasterxml/jackson/databind/JavaType:getValueHandler	()Ljava/lang/Object;
    //   196: ifnonnull +48 -> 244
    //   199: aload 4
    //   201: aload_2
    //   202: invokevirtual 143	com/fasterxml/jackson/databind/AnnotationIntrospector:findKeyDeserializer	(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Ljava/lang/Object;
    //   205: astore 16
    //   207: aload 16
    //   209: ifnull +35 -> 244
    //   212: aload_1
    //   213: aload_2
    //   214: aload 16
    //   216: invokevirtual 147	com/fasterxml/jackson/databind/DeserializationContext:keyDeserializerInstance	(Lcom/fasterxml/jackson/databind/introspect/Annotated;Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/KeyDeserializer;
    //   219: astore 17
    //   221: aload 17
    //   223: ifnull +21 -> 244
    //   226: aload 8
    //   228: checkcast 105	com/fasterxml/jackson/databind/type/MapLikeType
    //   231: aload 17
    //   233: invokevirtual 151	com/fasterxml/jackson/databind/type/MapLikeType:withKeyValueHandler	(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/type/MapLikeType;
    //   236: astore 8
    //   238: aload 8
    //   240: invokevirtual 100	com/fasterxml/jackson/databind/JavaType:getKeyType	()Lcom/fasterxml/jackson/databind/JavaType;
    //   243: pop
    //   244: aload 4
    //   246: aload_2
    //   247: aload 8
    //   249: invokevirtual 154	com/fasterxml/jackson/databind/JavaType:getContentType	()Lcom/fasterxml/jackson/databind/JavaType;
    //   252: invokevirtual 157	com/fasterxml/jackson/databind/AnnotationIntrospector:findDeserializationContentType	(Lcom/fasterxml/jackson/databind/introspect/Annotated;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Class;
    //   255: astore 10
    //   257: aload 10
    //   259: ifnull +16 -> 275
    //   262: aload 8
    //   264: aload 10
    //   266: invokevirtual 160	com/fasterxml/jackson/databind/JavaType:narrowContentsBy	(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;
    //   269: astore 15
    //   271: aload 15
    //   273: astore 8
    //   275: aload 8
    //   277: invokevirtual 154	com/fasterxml/jackson/databind/JavaType:getContentType	()Lcom/fasterxml/jackson/databind/JavaType;
    //   280: invokevirtual 139	com/fasterxml/jackson/databind/JavaType:getValueHandler	()Ljava/lang/Object;
    //   283: ifnonnull +64 -> 347
    //   286: aload 4
    //   288: aload_2
    //   289: invokevirtual 163	com/fasterxml/jackson/databind/AnnotationIntrospector:findContentDeserializer	(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Ljava/lang/Object;
    //   292: astore 11
    //   294: aload 11
    //   296: ifnull +51 -> 347
    //   299: aload 11
    //   301: instanceof 165
    //   304: ifne +158 -> 462
    //   307: aload_0
    //   308: aload 11
    //   310: ldc 166
    //   312: ldc 168
    //   314: invokespecial 170	com/fasterxml/jackson/databind/deser/DeserializerCache:_verifyAsClass	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;
    //   317: astore 13
    //   319: aload 13
    //   321: ifnull +141 -> 462
    //   324: aload_1
    //   325: aload_2
    //   326: aload 13
    //   328: invokevirtual 174	com/fasterxml/jackson/databind/DeserializationContext:deserializerInstance	(Lcom/fasterxml/jackson/databind/introspect/Annotated;Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    //   331: astore 12
    //   333: aload 12
    //   335: ifnull +12 -> 347
    //   338: aload 8
    //   340: aload 12
    //   342: invokevirtual 178	com/fasterxml/jackson/databind/JavaType:withContentValueHandler	(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/JavaType;
    //   345: astore 8
    //   347: aload 8
    //   349: areturn
    //   350: astore 19
    //   352: new 107	com/fasterxml/jackson/databind/JsonMappingException
    //   355: dup
    //   356: new 43	java/lang/StringBuilder
    //   359: dup
    //   360: ldc 180
    //   362: invokespecial 48	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   365: aload 6
    //   367: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   370: ldc 182
    //   372: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   375: aload 7
    //   377: invokevirtual 62	java/lang/Class:getName	()Ljava/lang/String;
    //   380: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   383: ldc 184
    //   385: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   388: aload 19
    //   390: invokevirtual 129	java/lang/IllegalArgumentException:getMessage	()Ljava/lang/String;
    //   393: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   399: aconst_null
    //   400: aload 19
    //   402: invokespecial 132	com/fasterxml/jackson/databind/JsonMappingException:<init>	(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonLocation;Ljava/lang/Throwable;)V
    //   405: athrow
    //   406: astore 14
    //   408: new 107	com/fasterxml/jackson/databind/JsonMappingException
    //   411: dup
    //   412: new 43	java/lang/StringBuilder
    //   415: dup
    //   416: ldc 186
    //   418: invokespecial 48	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   421: aload 8
    //   423: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   426: ldc 188
    //   428: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   431: aload 10
    //   433: invokevirtual 62	java/lang/Class:getName	()Ljava/lang/String;
    //   436: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   439: ldc 184
    //   441: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   444: aload 14
    //   446: invokevirtual 129	java/lang/IllegalArgumentException:getMessage	()Ljava/lang/String;
    //   449: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   452: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   455: aconst_null
    //   456: aload 14
    //   458: invokespecial 132	com/fasterxml/jackson/databind/JsonMappingException:<init>	(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonLocation;Ljava/lang/Throwable;)V
    //   461: athrow
    //   462: aconst_null
    //   463: astore 12
    //   465: goto -132 -> 333
    //   468: aload 6
    //   470: astore 8
    //   472: goto -293 -> 179
    //   475: aload 6
    //   477: areturn
    //   478: aload_3
    //   479: astore 6
    //   481: goto -449 -> 32
    //
    // Exception table:
    //   from	to	target	type
    //   20	28	96	java/lang/IllegalArgumentException
    //   163	175	350	java/lang/IllegalArgumentException
    //   262	271	406	java/lang/IllegalArgumentException
  }

  protected final JsonDeserializer<Object> _createAndCache2(DeserializationContext paramDeserializationContext, DeserializerFactory paramDeserializerFactory, JavaType paramJavaType)
  {
    try
    {
      JsonDeserializer localJsonDeserializer1 = _createDeserializer(paramDeserializationContext, paramDeserializerFactory, paramJavaType);
      localJsonDeserializer2 = localJsonDeserializer1;
      if (localJsonDeserializer2 == null)
      {
        localJsonDeserializer2 = null;
        return localJsonDeserializer2;
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new JsonMappingException(localIllegalArgumentException.getMessage(), null, localIllegalArgumentException);
    }
    JsonDeserializer localJsonDeserializer2;
    boolean bool2;
    do
    {
      boolean bool1 = localJsonDeserializer2 instanceof ResolvableDeserializer;
      bool2 = localJsonDeserializer2.isCachable();
      if (bool1)
      {
        this._incompleteDeserializers.put(paramJavaType, localJsonDeserializer2);
        ((ResolvableDeserializer)localJsonDeserializer2).resolve(paramDeserializationContext);
        this._incompleteDeserializers.remove(paramJavaType);
      }
    }
    while (!bool2);
    this._cachedDeserializers.put(paramJavaType, localJsonDeserializer2);
    return localJsonDeserializer2;
  }

  protected final JsonDeserializer<Object> _createAndCacheValueDeserializer(DeserializationContext paramDeserializationContext, DeserializerFactory paramDeserializerFactory, JavaType paramJavaType)
  {
    synchronized (this._incompleteDeserializers)
    {
      JsonDeserializer localJsonDeserializer1 = _findCachedDeserializer(paramJavaType);
      if (localJsonDeserializer1 != null)
        return localJsonDeserializer1;
      i = this._incompleteDeserializers.size();
      if (i > 0)
      {
        JsonDeserializer localJsonDeserializer2 = (JsonDeserializer)this._incompleteDeserializers.get(paramJavaType);
        if (localJsonDeserializer2 != null)
          return localJsonDeserializer2;
      }
    }
    try
    {
      JsonDeserializer localJsonDeserializer3 = _createAndCache2(paramDeserializationContext, paramDeserializerFactory, paramJavaType);
      if ((i == 0) && (this._incompleteDeserializers.size() > 0))
        this._incompleteDeserializers.clear();
      return localJsonDeserializer3;
    }
    finally
    {
      localObject2 = finally;
      if ((i == 0) && (this._incompleteDeserializers.size() > 0))
        this._incompleteDeserializers.clear();
      throw localObject2;
    }
  }

  protected final JsonDeserializer<Object> _createDeserializer(DeserializationContext paramDeserializationContext, DeserializerFactory paramDeserializerFactory, JavaType paramJavaType)
  {
    DeserializationConfig localDeserializationConfig = paramDeserializationContext.getConfig();
    if ((paramJavaType.isAbstract()) || (paramJavaType.isMapLikeType()) || (paramJavaType.isCollectionLikeType()))
      paramJavaType = paramDeserializerFactory.mapAbstractType(localDeserializationConfig, paramJavaType);
    BeanDescription localBeanDescription1 = localDeserializationConfig.introspect(paramJavaType);
    JsonDeserializer localJsonDeserializer = findDeserializerFromAnnotation(paramDeserializationContext, localBeanDescription1.getClassInfo());
    if (localJsonDeserializer != null)
      return localJsonDeserializer;
    JavaType localJavaType1 = modifyTypeByAnnotation(paramDeserializationContext, localBeanDescription1.getClassInfo(), paramJavaType);
    JavaType localJavaType2;
    BeanDescription localBeanDescription2;
    if (localJavaType1 != paramJavaType)
    {
      BeanDescription localBeanDescription3 = localDeserializationConfig.introspect(localJavaType1);
      localJavaType2 = localJavaType1;
      localBeanDescription2 = localBeanDescription3;
    }
    while (true)
    {
      Class localClass = localBeanDescription2.findPOJOBuilder();
      if (localClass != null)
        return paramDeserializerFactory.createBuilderBasedDeserializer(paramDeserializationContext, localJavaType2, localBeanDescription2, localClass);
      if (localJavaType2.isEnumType())
        return paramDeserializerFactory.createEnumDeserializer(paramDeserializationContext, localJavaType2, localBeanDescription2);
      if (localJavaType2.isContainerType())
      {
        if (localJavaType2.isArrayType())
          return paramDeserializerFactory.createArrayDeserializer(paramDeserializationContext, (ArrayType)localJavaType2, localBeanDescription2);
        if (localJavaType2.isMapLikeType())
        {
          MapLikeType localMapLikeType = (MapLikeType)localJavaType2;
          if (localMapLikeType.isTrueMapType())
            return paramDeserializerFactory.createMapDeserializer(paramDeserializationContext, (MapType)localMapLikeType, localBeanDescription2);
          return paramDeserializerFactory.createMapLikeDeserializer(paramDeserializationContext, localMapLikeType, localBeanDescription2);
        }
        if (localJavaType2.isCollectionLikeType())
        {
          JsonFormat.Value localValue = localBeanDescription2.findExpectedFormat(null);
          if ((localValue == null) || (localValue.getShape() != JsonFormat.Shape.OBJECT))
          {
            CollectionLikeType localCollectionLikeType = (CollectionLikeType)localJavaType2;
            if (localCollectionLikeType.isTrueCollectionType())
              return paramDeserializerFactory.createCollectionDeserializer(paramDeserializationContext, (CollectionType)localCollectionLikeType, localBeanDescription2);
            return paramDeserializerFactory.createCollectionLikeDeserializer(paramDeserializationContext, localCollectionLikeType, localBeanDescription2);
          }
        }
      }
      if (JsonNode.class.isAssignableFrom(localJavaType2.getRawClass()))
        return paramDeserializerFactory.createTreeDeserializer(localDeserializationConfig, localJavaType2, localBeanDescription2);
      return paramDeserializerFactory.createBeanDeserializer(paramDeserializationContext, localJavaType2, localBeanDescription2);
      localBeanDescription2 = localBeanDescription1;
      localJavaType2 = paramJavaType;
    }
  }

  protected final JsonDeserializer<Object> _findCachedDeserializer(JavaType paramJavaType)
  {
    if (paramJavaType == null)
      throw new IllegalArgumentException("Null JavaType passed");
    return (JsonDeserializer)this._cachedDeserializers.get(paramJavaType);
  }

  protected final KeyDeserializer _handleUnknownKeyDeserializer(JavaType paramJavaType)
  {
    throw new JsonMappingException("Can not find a (Map) Key deserializer for type " + paramJavaType);
  }

  protected final JsonDeserializer<Object> _handleUnknownValueDeserializer(JavaType paramJavaType)
  {
    if (!ClassUtil.isConcrete(paramJavaType.getRawClass()))
      throw new JsonMappingException("Can not find a Value deserializer for abstract type " + paramJavaType);
    throw new JsonMappingException("Can not find a Value deserializer for type " + paramJavaType);
  }

  protected final JsonDeserializer<Object> findDeserializerFromAnnotation(DeserializationContext paramDeserializationContext, Annotated paramAnnotated)
  {
    Object localObject = paramDeserializationContext.getAnnotationIntrospector().findDeserializer(paramAnnotated);
    if (localObject == null)
      return null;
    return paramDeserializationContext.deserializerInstance(paramAnnotated, localObject);
  }

  public final KeyDeserializer findKeyDeserializer(DeserializationContext paramDeserializationContext, DeserializerFactory paramDeserializerFactory, JavaType paramJavaType)
  {
    KeyDeserializer localKeyDeserializer = paramDeserializerFactory.createKeyDeserializer(paramDeserializationContext, paramJavaType);
    if (localKeyDeserializer == null)
      localKeyDeserializer = _handleUnknownKeyDeserializer(paramJavaType);
    while (!(localKeyDeserializer instanceof ResolvableDeserializer))
      return localKeyDeserializer;
    ((ResolvableDeserializer)localKeyDeserializer).resolve(paramDeserializationContext);
    return localKeyDeserializer;
  }

  public final JsonDeserializer<Object> findValueDeserializer(DeserializationContext paramDeserializationContext, DeserializerFactory paramDeserializerFactory, JavaType paramJavaType)
  {
    JsonDeserializer localJsonDeserializer = _findCachedDeserializer(paramJavaType);
    if (localJsonDeserializer != null);
    do
    {
      return localJsonDeserializer;
      localJsonDeserializer = _createAndCacheValueDeserializer(paramDeserializationContext, paramDeserializerFactory, paramJavaType);
    }
    while (localJsonDeserializer != null);
    return _handleUnknownValueDeserializer(paramJavaType);
  }

  final Object writeReplace()
  {
    this._incompleteDeserializers.clear();
    return this;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.DeserializerCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
