package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

@JacksonStdImpl
public class MapSerializer extends ContainerSerializer<Map<?, ?>>
  implements ContextualSerializer
{
  protected static final JavaType UNSPECIFIED_TYPE = TypeFactory.unknownType();
  protected PropertySerializerMap _dynamicValueSerializers;
  protected final HashSet<String> _ignoredEntries;
  protected JsonSerializer<Object> _keySerializer;
  protected final JavaType _keyType;
  protected final BeanProperty _property;
  protected JsonSerializer<Object> _valueSerializer;
  protected final JavaType _valueType;
  protected final boolean _valueTypeIsStatic;
  protected final TypeSerializer _valueTypeSerializer;

  protected MapSerializer(MapSerializer paramMapSerializer, BeanProperty paramBeanProperty, JsonSerializer<?> paramJsonSerializer1, JsonSerializer<?> paramJsonSerializer2, HashSet<String> paramHashSet)
  {
    super(Map.class, false);
    this._ignoredEntries = paramHashSet;
    this._keyType = paramMapSerializer._keyType;
    this._valueType = paramMapSerializer._valueType;
    this._valueTypeIsStatic = paramMapSerializer._valueTypeIsStatic;
    this._valueTypeSerializer = paramMapSerializer._valueTypeSerializer;
    this._keySerializer = paramJsonSerializer1;
    this._valueSerializer = paramJsonSerializer2;
    this._dynamicValueSerializers = paramMapSerializer._dynamicValueSerializers;
    this._property = paramBeanProperty;
  }

  protected MapSerializer(MapSerializer paramMapSerializer, TypeSerializer paramTypeSerializer)
  {
    super(Map.class, false);
    this._ignoredEntries = paramMapSerializer._ignoredEntries;
    this._keyType = paramMapSerializer._keyType;
    this._valueType = paramMapSerializer._valueType;
    this._valueTypeIsStatic = paramMapSerializer._valueTypeIsStatic;
    this._valueTypeSerializer = paramTypeSerializer;
    this._keySerializer = paramMapSerializer._keySerializer;
    this._valueSerializer = paramMapSerializer._valueSerializer;
    this._dynamicValueSerializers = paramMapSerializer._dynamicValueSerializers;
    this._property = paramMapSerializer._property;
  }

  protected MapSerializer(HashSet<String> paramHashSet, JavaType paramJavaType1, JavaType paramJavaType2, boolean paramBoolean, TypeSerializer paramTypeSerializer, JsonSerializer<?> paramJsonSerializer1, JsonSerializer<?> paramJsonSerializer2)
  {
    super(Map.class, false);
    this._ignoredEntries = paramHashSet;
    this._keyType = paramJavaType1;
    this._valueType = paramJavaType2;
    this._valueTypeIsStatic = paramBoolean;
    this._valueTypeSerializer = paramTypeSerializer;
    this._keySerializer = paramJsonSerializer1;
    this._valueSerializer = paramJsonSerializer2;
    this._dynamicValueSerializers = PropertySerializerMap.emptyMap();
    this._property = null;
  }

  public static MapSerializer construct(String[] paramArrayOfString, JavaType paramJavaType, boolean paramBoolean, TypeSerializer paramTypeSerializer, JsonSerializer<Object> paramJsonSerializer1, JsonSerializer<Object> paramJsonSerializer2)
  {
    HashSet localHashSet = toSet(paramArrayOfString);
    JavaType localJavaType2;
    JavaType localJavaType1;
    boolean bool2;
    if (paramJavaType == null)
    {
      localJavaType2 = UNSPECIFIED_TYPE;
      localJavaType1 = localJavaType2;
      if (paramBoolean)
        break label85;
      if ((localJavaType2 == null) || (!localJavaType2.isFinal()))
        break label79;
      bool2 = true;
    }
    label39: label79: label85: for (boolean bool1 = bool2; ; bool1 = paramBoolean)
    {
      return new MapSerializer(localHashSet, localJavaType1, localJavaType2, bool1, paramTypeSerializer, paramJsonSerializer1, paramJsonSerializer2);
      localJavaType1 = paramJavaType.getKeyType();
      localJavaType2 = paramJavaType.getContentType();
      break;
      bool2 = false;
      break label39;
    }
  }

  private static HashSet<String> toSet(String[] paramArrayOfString)
  {
    Object localObject;
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      localObject = null;
    while (true)
    {
      return localObject;
      localObject = new HashSet(paramArrayOfString.length);
      int i = paramArrayOfString.length;
      for (int j = 0; j < i; j++)
        ((HashSet)localObject).add(paramArrayOfString[j]);
    }
  }

  protected final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap paramPropertySerializerMap, JavaType paramJavaType, SerializerProvider paramSerializerProvider)
  {
    PropertySerializerMap.SerializerAndMapResult localSerializerAndMapResult = paramPropertySerializerMap.findAndAddSerializer(paramJavaType, paramSerializerProvider, this._property);
    if (paramPropertySerializerMap != localSerializerAndMapResult.map)
      this._dynamicValueSerializers = localSerializerAndMapResult.map;
    return localSerializerAndMapResult.serializer;
  }

  protected final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap paramPropertySerializerMap, Class<?> paramClass, SerializerProvider paramSerializerProvider)
  {
    PropertySerializerMap.SerializerAndMapResult localSerializerAndMapResult = paramPropertySerializerMap.findAndAddSerializer(paramClass, paramSerializerProvider, this._property);
    if (paramPropertySerializerMap != localSerializerAndMapResult.map)
      this._dynamicValueSerializers = localSerializerAndMapResult.map;
    return localSerializerAndMapResult.serializer;
  }

  protected Map<?, ?> _orderEntries(Map<?, ?> paramMap)
  {
    if ((paramMap instanceof SortedMap))
      return paramMap;
    return new TreeMap(paramMap);
  }

  public MapSerializer _withValueTypeSerializer(TypeSerializer paramTypeSerializer)
  {
    return new MapSerializer(this, paramTypeSerializer);
  }

  public JsonSerializer<?> createContextual(SerializerProvider paramSerializerProvider, BeanProperty paramBeanProperty)
  {
    JsonSerializer localJsonSerializer5;
    JsonSerializer localJsonSerializer1;
    JsonSerializer localJsonSerializer2;
    if (paramBeanProperty != null)
    {
      AnnotatedMember localAnnotatedMember = paramBeanProperty.getMember();
      if (localAnnotatedMember != null)
      {
        AnnotationIntrospector localAnnotationIntrospector2 = paramSerializerProvider.getAnnotationIntrospector();
        Object localObject1 = localAnnotationIntrospector2.findKeySerializer(localAnnotatedMember);
        if (localObject1 != null)
        {
          localJsonSerializer5 = paramSerializerProvider.serializerInstance(localAnnotatedMember, localObject1);
          Object localObject2 = localAnnotationIntrospector2.findContentSerializer(localAnnotatedMember);
          if (localObject2 != null)
          {
            JsonSerializer localJsonSerializer6 = paramSerializerProvider.serializerInstance(localAnnotatedMember, localObject2);
            JsonSerializer localJsonSerializer7 = localJsonSerializer5;
            localJsonSerializer1 = localJsonSerializer6;
            localJsonSerializer2 = localJsonSerializer7;
          }
        }
      }
    }
    while (true)
    {
      if (localJsonSerializer1 == null)
        localJsonSerializer1 = this._valueSerializer;
      JsonSerializer localJsonSerializer3;
      if (localJsonSerializer1 == null)
      {
        if ((!this._valueTypeIsStatic) && (!hasContentTypeAnnotation(paramSerializerProvider, paramBeanProperty)))
          break label319;
        localJsonSerializer3 = paramSerializerProvider.findValueSerializer(this._valueType, paramBeanProperty);
      }
      while (true)
      {
        if (localJsonSerializer2 == null);
        for (JsonSerializer localJsonSerializer4 = this._keySerializer; ; localJsonSerializer4 = localJsonSerializer2)
        {
          label149: HashSet localHashSet1;
          String[] arrayOfString;
          if (localJsonSerializer4 == null)
          {
            localJsonSerializer4 = paramSerializerProvider.findKeySerializer(this._keyType, paramBeanProperty);
            localHashSet1 = this._ignoredEntries;
            AnnotationIntrospector localAnnotationIntrospector1 = paramSerializerProvider.getAnnotationIntrospector();
            if ((localAnnotationIntrospector1 == null) || (paramBeanProperty == null))
              break label296;
            arrayOfString = localAnnotationIntrospector1.findPropertiesToIgnore(paramBeanProperty.getMember());
            if (arrayOfString == null)
              break label296;
            if (localHashSet1 != null)
              break label282;
          }
          label282: for (HashSet localHashSet2 = new HashSet(); ; localHashSet2 = new HashSet(localHashSet1))
          {
            int i = arrayOfString.length;
            for (int j = 0; j < i; j++)
              localHashSet2.add(arrayOfString[j]);
            if (!(localJsonSerializer1 instanceof ContextualSerializer))
              break label319;
            localJsonSerializer3 = ((ContextualSerializer)localJsonSerializer1).createContextual(paramSerializerProvider, paramBeanProperty);
            break;
            if (!(localJsonSerializer4 instanceof ContextualSerializer))
              break label149;
            localJsonSerializer4 = ((ContextualSerializer)localJsonSerializer4).createContextual(paramSerializerProvider, paramBeanProperty);
            break label149;
          }
          label296: localHashSet2 = localHashSet1;
          return withResolved(paramBeanProperty, localJsonSerializer4, localJsonSerializer3, localHashSet2);
        }
        label319: localJsonSerializer3 = localJsonSerializer1;
      }
      localJsonSerializer2 = localJsonSerializer5;
      localJsonSerializer1 = null;
      continue;
      localJsonSerializer5 = null;
      break;
      localJsonSerializer1 = null;
      localJsonSerializer2 = null;
    }
  }

  public boolean hasSingleElement(Map<?, ?> paramMap)
  {
    return paramMap.size() == 1;
  }

  public boolean isEmpty(Map<?, ?> paramMap)
  {
    return (paramMap == null) || (paramMap.isEmpty());
  }

  public void serialize(Map<?, ?> paramMap, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    paramJsonGenerator.writeStartObject();
    if (!paramMap.isEmpty())
    {
      if (paramSerializerProvider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS))
        paramMap = _orderEntries(paramMap);
      if (this._valueSerializer == null)
        break label52;
      serializeFieldsUsing(paramMap, paramJsonGenerator, paramSerializerProvider, this._valueSerializer);
    }
    while (true)
    {
      paramJsonGenerator.writeEndObject();
      return;
      label52: serializeFields(paramMap, paramJsonGenerator, paramSerializerProvider);
    }
  }

  public void serializeFields(Map<?, ?> paramMap, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    if (this._valueTypeSerializer != null)
    {
      serializeTypedFields(paramMap, paramJsonGenerator, paramSerializerProvider);
      return;
    }
    JsonSerializer localJsonSerializer1 = this._keySerializer;
    HashSet localHashSet = this._ignoredEntries;
    int i;
    Object localObject1;
    label63: Object localObject2;
    Object localObject3;
    if (!paramSerializerProvider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES))
    {
      i = 1;
      PropertySerializerMap localPropertySerializerMap1 = this._dynamicValueSerializers;
      Iterator localIterator = paramMap.entrySet().iterator();
      localObject1 = localPropertySerializerMap1;
      if (!localIterator.hasNext())
        break label300;
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localObject2 = localEntry.getValue();
      localObject3 = localEntry.getKey();
      if (localObject3 != null)
        break label145;
      paramSerializerProvider.findNullKeySerializer(this._keyType, this._property).serialize(null, paramJsonGenerator, paramSerializerProvider);
    }
    while (true)
    {
      if (localObject2 != null)
        break label182;
      paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
      break label63;
      i = 0;
      break;
      label145: if (((i != 0) && (localObject2 == null)) || ((localHashSet != null) && (localHashSet.contains(localObject3))))
        break label63;
      localJsonSerializer1.serialize(localObject3, paramJsonGenerator, paramSerializerProvider);
    }
    label182: Class localClass = localObject2.getClass();
    JsonSerializer localJsonSerializer2 = ((PropertySerializerMap)localObject1).serializerFor(localClass);
    JsonSerializer localJsonSerializer4;
    JsonSerializer localJsonSerializer5;
    Object localObject4;
    if (localJsonSerializer2 == null)
      if (this._valueType.hasGenericTypes())
      {
        localJsonSerializer4 = _findAndAddDynamic((PropertySerializerMap)localObject1, paramSerializerProvider.constructSpecializedType(this._valueType, localClass), paramSerializerProvider);
        PropertySerializerMap localPropertySerializerMap2 = this._dynamicValueSerializers;
        localJsonSerializer5 = localJsonSerializer4;
        localObject4 = localPropertySerializerMap2;
      }
    for (JsonSerializer localJsonSerializer3 = localJsonSerializer5; ; localJsonSerializer3 = localJsonSerializer2)
    {
      try
      {
        localJsonSerializer3.serialize(localObject2, paramJsonGenerator, paramSerializerProvider);
        localObject1 = localObject4;
        break label63;
        localJsonSerializer4 = _findAndAddDynamic((PropertySerializerMap)localObject1, localClass, paramSerializerProvider);
      }
      catch (Exception localException)
      {
        wrapAndThrow(paramSerializerProvider, localException, paramMap, String.valueOf(localObject3));
        localObject1 = localObject4;
      }
      break label63;
      label300: break;
      localObject4 = localObject1;
    }
  }

  protected void serializeFieldsUsing(Map<?, ?> paramMap, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, JsonSerializer<Object> paramJsonSerializer)
  {
    JsonSerializer localJsonSerializer = this._keySerializer;
    HashSet localHashSet = this._ignoredEntries;
    TypeSerializer localTypeSerializer = this._valueTypeSerializer;
    int i;
    Iterator localIterator;
    if (!paramSerializerProvider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES))
    {
      i = 1;
      localIterator = paramMap.entrySet().iterator();
    }
    while (true)
    {
      label44: if (!localIterator.hasNext())
        return;
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Object localObject1 = localEntry.getValue();
      Object localObject2 = localEntry.getKey();
      if (localObject2 == null)
        paramSerializerProvider.findNullKeySerializer(this._keyType, this._property).serialize(null, paramJsonGenerator, paramSerializerProvider);
      while (true)
      {
        if (localObject1 != null)
          break label163;
        paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
        break label44;
        i = 0;
        break;
        if (((i != 0) && (localObject1 == null)) || ((localHashSet != null) && (localHashSet.contains(localObject2))))
          break label44;
        localJsonSerializer.serialize(localObject2, paramJsonGenerator, paramSerializerProvider);
      }
      label163: if (localTypeSerializer == null)
        try
        {
          paramJsonSerializer.serialize(localObject1, paramJsonGenerator, paramSerializerProvider);
        }
        catch (Exception localException)
        {
          wrapAndThrow(paramSerializerProvider, localException, paramMap, String.valueOf(localObject2));
        }
      else
        paramJsonSerializer.serializeWithType(localObject1, paramJsonGenerator, paramSerializerProvider, localTypeSerializer);
    }
  }

  protected void serializeTypedFields(Map<?, ?> paramMap, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    JsonSerializer localJsonSerializer = this._keySerializer;
    HashSet localHashSet = this._ignoredEntries;
    int i;
    Iterator localIterator;
    Object localObject1;
    Object localObject2;
    if (!paramSerializerProvider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES))
    {
      i = 1;
      localIterator = paramMap.entrySet().iterator();
      localObject1 = null;
      localObject2 = null;
    }
    label44: Object localObject4;
    label163: Object localObject5;
    Object localObject6;
    while (true)
    {
      if (!localIterator.hasNext())
        return;
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Object localObject3 = localEntry.getValue();
      localObject4 = localEntry.getKey();
      if (localObject4 == null)
        paramSerializerProvider.findNullKeySerializer(this._keyType, this._property).serialize(null, paramJsonGenerator, paramSerializerProvider);
      while (true)
      {
        if (localObject3 != null)
          break label163;
        paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
        break label44;
        i = 0;
        break;
        if (((i != 0) && (localObject3 == null)) || ((localHashSet != null) && (localHashSet.contains(localObject4))))
          break label44;
        localJsonSerializer.serialize(localObject4, paramJsonGenerator, paramSerializerProvider);
      }
      localObject5 = localObject3.getClass();
      if (localObject5 == localObject1)
      {
        localObject5 = localObject1;
        localObject6 = localObject2;
        try
        {
          while (true)
          {
            ((JsonSerializer)localObject2).serializeWithType(localObject3, paramJsonGenerator, paramSerializerProvider, this._valueTypeSerializer);
            localObject2 = localObject6;
            localObject1 = localObject5;
            break;
            localObject2 = paramSerializerProvider.findValueSerializer((Class)localObject5, this._property);
            localObject6 = localObject2;
          }
        }
        catch (Exception localException)
        {
          wrapAndThrow(paramSerializerProvider, localException, paramMap, String.valueOf(localObject4));
          localObject2 = localObject6;
          localObject1 = localObject5;
        }
      }
    }
  }

  public void serializeWithType(Map<?, ?> paramMap, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, TypeSerializer paramTypeSerializer)
  {
    paramTypeSerializer.writeTypePrefixForObject(paramMap, paramJsonGenerator);
    if (!paramMap.isEmpty())
    {
      if (paramSerializerProvider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS))
        paramMap = _orderEntries(paramMap);
      if (this._valueSerializer == null)
        break label58;
      serializeFieldsUsing(paramMap, paramJsonGenerator, paramSerializerProvider, this._valueSerializer);
    }
    while (true)
    {
      paramTypeSerializer.writeTypeSuffixForObject(paramMap, paramJsonGenerator);
      return;
      label58: serializeFields(paramMap, paramJsonGenerator, paramSerializerProvider);
    }
  }

  public MapSerializer withResolved(BeanProperty paramBeanProperty, JsonSerializer<?> paramJsonSerializer1, JsonSerializer<?> paramJsonSerializer2, HashSet<String> paramHashSet)
  {
    return new MapSerializer(this, paramBeanProperty, paramJsonSerializer1, paramJsonSerializer2, paramHashSet);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.std.MapSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
