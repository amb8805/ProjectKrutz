package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty.Std;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.JsonSerializer;;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.List;;

public class BeanSerializerFactory extends BasicSerializerFactory
  implements Serializable
{
  public static final BeanSerializerFactory instance = new BeanSerializerFactory(null);
  private static final long serialVersionUID = 1L;

  protected BeanSerializerFactory(SerializerFactoryConfig paramSerializerFactoryConfig)
  {
    super(paramSerializerFactoryConfig);
  }

  protected BeanPropertyWriter _constructWriter(SerializerProvider paramSerializerProvider, BeanPropertyDefinition paramBeanPropertyDefinition, TypeBindings paramTypeBindings, PropertyBuilder paramPropertyBuilder, boolean paramBoolean, AnnotatedMember paramAnnotatedMember)
  {
    String str = paramBeanPropertyDefinition.getName();
    if (paramSerializerProvider.canOverrideAccessModifiers())
      paramAnnotatedMember.fixAccess();
    JavaType localJavaType = paramAnnotatedMember.getType(paramTypeBindings);
    BeanProperty.Std localStd = new BeanProperty.Std(str, localJavaType, paramPropertyBuilder.getClassAnnotations(), paramAnnotatedMember);
    JsonSerializer localJsonSerializer1 = findSerializerFromAnnotation(paramSerializerProvider, paramAnnotatedMember);
    if ((localJsonSerializer1 instanceof ResolvableSerializer))
      ((ResolvableSerializer)localJsonSerializer1).resolve(paramSerializerProvider);
    if ((localJsonSerializer1 instanceof ContextualSerializer));
    for (JsonSerializer localJsonSerializer2 = ((ContextualSerializer)localJsonSerializer1).createContextual(paramSerializerProvider, localStd); ; localJsonSerializer2 = localJsonSerializer1)
    {
      boolean bool = ClassUtil.isCollectionMapOrArray(localJavaType.getRawClass());
      TypeSerializer localTypeSerializer = null;
      if (bool)
        localTypeSerializer = findPropertyContentTypeSerializer(localJavaType, paramSerializerProvider.getConfig(), paramAnnotatedMember);
      return paramPropertyBuilder.buildWriter(paramBeanPropertyDefinition, localJavaType, localJsonSerializer2, findPropertyTypeSerializer(localJavaType, paramSerializerProvider.getConfig(), paramAnnotatedMember), localTypeSerializer, paramAnnotatedMember, paramBoolean);
    }
  }

  protected JsonSerializer<Object> constructBeanSerializer(SerializerProvider paramSerializerProvider, BeanDescription paramBeanDescription)
  {
    JsonSerializer localJsonSerializer;
    if (paramBeanDescription.getBeanClass() == Object.class)
      localJsonSerializer = paramSerializerProvider.getUnknownTypeSerializer(Object.class);
    BeanSerializerBuilder localBeanSerializerBuilder2;
    do
    {
      return localJsonSerializer;
      SerializationConfig localSerializationConfig = paramSerializerProvider.getConfig();
      BeanSerializerBuilder localBeanSerializerBuilder1 = constructBeanSerializerBuilder(paramBeanDescription);
      localBeanSerializerBuilder1.setConfig(localSerializationConfig);
      Object localObject1 = findBeanProperties(paramSerializerProvider, paramBeanDescription, localBeanSerializerBuilder1);
      if (localObject1 == null)
        localObject1 = new ArrayList();
      if (this._factoryConfig.hasSerializerModifiers())
      {
        Iterator localIterator3 = this._factoryConfig.serializerModifiers().iterator();
        for (localObject2 = localObject1; localIterator3.hasNext(); localObject2 = ((BeanSerializerModifier)localIterator3.next()).changeProperties(localSerializationConfig, paramBeanDescription, (List)localObject2));
      }
      Object localObject2 = localObject1;
      List localList1 = filterBeanProperties(localSerializationConfig, paramBeanDescription, (List)localObject2);
      if (this._factoryConfig.hasSerializerModifiers())
      {
        Iterator localIterator2 = this._factoryConfig.serializerModifiers().iterator();
        for (localList2 = localList1; localIterator2.hasNext(); localList2 = ((BeanSerializerModifier)localIterator2.next()).orderProperties(localSerializationConfig, paramBeanDescription, localList2));
      }
      List localList2 = localList1;
      localBeanSerializerBuilder1.setObjectIdWriter(constructObjectIdHandler(paramSerializerProvider, paramBeanDescription, localList2));
      localBeanSerializerBuilder1.setProperties(localList2);
      localBeanSerializerBuilder1.setFilterId(findFilterId(localSerializationConfig, paramBeanDescription));
      AnnotatedMember localAnnotatedMember = paramBeanDescription.findAnyGetter();
      if (localAnnotatedMember != null)
      {
        if (localSerializationConfig.canOverrideAccessModifiers())
          localAnnotatedMember.fixAccess();
        JavaType localJavaType1 = localAnnotatedMember.getType(paramBeanDescription.bindingsForBeanType());
        boolean bool = localSerializationConfig.isEnabled(MapperFeature.USE_STATIC_TYPING);
        JavaType localJavaType2 = localJavaType1.getContentType();
        MapSerializer localMapSerializer = MapSerializer.construct(null, localJavaType1, bool, createTypeSerializer(localSerializationConfig, localJavaType2), null, null);
        localBeanSerializerBuilder1.setAnyGetter(new AnyGetterWriter(new BeanProperty.Std(localAnnotatedMember.getName(), localJavaType2, paramBeanDescription.getClassAnnotations(), localAnnotatedMember), localAnnotatedMember, localMapSerializer));
      }
      processViews(localSerializationConfig, localBeanSerializerBuilder1);
      if (this._factoryConfig.hasSerializerModifiers())
      {
        Iterator localIterator1 = this._factoryConfig.serializerModifiers().iterator();
        for (localBeanSerializerBuilder2 = localBeanSerializerBuilder1; localIterator1.hasNext(); localBeanSerializerBuilder2 = ((BeanSerializerModifier)localIterator1.next()).updateBuilder(localSerializationConfig, paramBeanDescription, localBeanSerializerBuilder2));
      }
      localBeanSerializerBuilder2 = localBeanSerializerBuilder1;
      localJsonSerializer = localBeanSerializerBuilder2.build();
    }
    while ((localJsonSerializer != null) || (!paramBeanDescription.hasKnownClassAnnotations()));
    return localBeanSerializerBuilder2.createDummy();
  }

  protected BeanSerializerBuilder constructBeanSerializerBuilder(BeanDescription paramBeanDescription)
  {
    return new BeanSerializerBuilder(paramBeanDescription);
  }

  protected BeanPropertyWriter constructFilteredBeanWriter(BeanPropertyWriter paramBeanPropertyWriter, Class<?>[] paramArrayOfClass)
  {
    return FilteredBeanPropertyWriter.constructViewBased(paramBeanPropertyWriter, paramArrayOfClass);
  }

  protected ObjectIdWriter constructObjectIdHandler(SerializerProvider paramSerializerProvider, BeanDescription paramBeanDescription, List<BeanPropertyWriter> paramList)
  {
    ObjectIdInfo localObjectIdInfo = paramBeanDescription.getObjectIdInfo();
    if (localObjectIdInfo == null)
      return null;
    Class localClass = localObjectIdInfo.getGeneratorType();
    if (localClass == ObjectIdGenerators.PropertyGenerator.class)
    {
      String str = localObjectIdInfo.getPropertyName();
      int i = paramList.size();
      for (int j = 0; ; j++)
      {
        if (j == i)
          throw new IllegalArgumentException("Invalid Object Id definition for " + paramBeanDescription.getBeanClass().getName() + ": can not find property with name '" + str + "'");
        BeanPropertyWriter localBeanPropertyWriter = (BeanPropertyWriter)paramList.get(j);
        if (str.equals(localBeanPropertyWriter.getName()))
        {
          if (j > 0)
          {
            paramList.remove(j);
            paramList.add(0, localBeanPropertyWriter);
          }
          return ObjectIdWriter.construct(localBeanPropertyWriter.getType(), null, new PropertyBasedObjectIdGenerator(localObjectIdInfo, localBeanPropertyWriter), localObjectIdInfo.getAlwaysAsId());
        }
      }
    }
    JavaType localJavaType1 = paramSerializerProvider.constructType(localClass);
    JavaType localJavaType2 = paramSerializerProvider.getTypeFactory().findTypeParameters(localJavaType1, ObjectIdGenerator.class)[0];
    ObjectIdGenerator localObjectIdGenerator = paramSerializerProvider.objectIdGeneratorInstance(paramBeanDescription.getClassInfo(), localObjectIdInfo);
    return ObjectIdWriter.construct(localJavaType2, localObjectIdInfo.getPropertyName(), localObjectIdGenerator, localObjectIdInfo.getAlwaysAsId());
  }

  protected PropertyBuilder constructPropertyBuilder(SerializationConfig paramSerializationConfig, BeanDescription paramBeanDescription)
  {
    return new PropertyBuilder(paramSerializationConfig, paramBeanDescription);
  }

  public JsonSerializer<Object> createSerializer(SerializerProvider paramSerializerProvider, JavaType paramJavaType)
  {
    SerializationConfig localSerializationConfig = paramSerializerProvider.getConfig();
    BeanDescription localBeanDescription1 = localSerializationConfig.introspect(paramJavaType);
    JsonSerializer localJsonSerializer1 = findSerializerFromAnnotation(paramSerializerProvider, localBeanDescription1.getClassInfo());
    if (localJsonSerializer1 != null)
      return localJsonSerializer1;
    JavaType localJavaType = modifyTypeByAnnotation(localSerializationConfig, localBeanDescription1.getClassInfo(), paramJavaType);
    BeanDescription localBeanDescription2;
    boolean bool;
    if (localJavaType == paramJavaType)
    {
      localBeanDescription2 = localBeanDescription1;
      bool = false;
    }
    while (true)
    {
      label58: localJsonSerializer1 = findSerializerByAnnotations(paramSerializerProvider, localJavaType, localBeanDescription2);
      if (localJsonSerializer1 != null)
        break;
      if (paramJavaType.isContainerType())
      {
        if (!bool)
          bool = usesStaticTyping(localSerializationConfig, localBeanDescription2, null);
        localJsonSerializer1 = buildContainerSerializer(paramSerializerProvider, localJavaType, localBeanDescription2, bool);
        if (localJsonSerializer1 != null)
          break;
      }
      JsonSerializer localJsonSerializer2;
      do
      {
        Iterator localIterator;
        while (!localIterator.hasNext())
        {
          localJsonSerializer1 = findSerializerByLookup(localJavaType, localSerializationConfig, localBeanDescription2, bool);
          if (localJsonSerializer1 != null)
            break;
          localJsonSerializer1 = findSerializerByPrimaryType(paramSerializerProvider, localJavaType, localBeanDescription2, bool);
          if (localJsonSerializer1 != null)
            break;
          localJsonSerializer1 = findBeanSerializer(paramSerializerProvider, localJavaType, localBeanDescription2);
          if (localJsonSerializer1 != null)
            break;
          return findSerializerByAddonType(localSerializationConfig, localJavaType, localBeanDescription2, bool);
          if (localJavaType.getRawClass() == paramJavaType.getRawClass())
            break label255;
          localBeanDescription2 = localSerializationConfig.introspect(localJavaType);
          bool = true;
          break label58;
          localIterator = customSerializers().iterator();
        }
        localJsonSerializer2 = ((Serializers)localIterator.next()).findSerializer(localSerializationConfig, localJavaType, localBeanDescription2);
      }
      while (localJsonSerializer2 == null);
      return localJsonSerializer2;
      label255: localBeanDescription2 = localBeanDescription1;
      bool = true;
    }
  }

  protected Iterable<Serializers> customSerializers()
  {
    return this._factoryConfig.serializers();
  }

  protected List<BeanPropertyWriter> filterBeanProperties(SerializationConfig paramSerializationConfig, BeanDescription paramBeanDescription, List<BeanPropertyWriter> paramList)
  {
    String[] arrayOfString = paramSerializationConfig.getAnnotationIntrospector().findPropertiesToIgnore(paramBeanDescription.getClassInfo());
    if ((arrayOfString != null) && (arrayOfString.length > 0))
    {
      HashSet localHashSet = ArrayBuilders.arrayToSet(arrayOfString);
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
        if (localHashSet.contains(((BeanPropertyWriter)localIterator.next()).getName()))
          localIterator.remove();
    }
    return paramList;
  }

  protected List<BeanPropertyWriter> findBeanProperties(SerializerProvider paramSerializerProvider, BeanDescription paramBeanDescription, BeanSerializerBuilder paramBeanSerializerBuilder)
  {
    List localList = paramBeanDescription.findProperties();
    SerializationConfig localSerializationConfig = paramSerializerProvider.getConfig();
    removeIgnorableTypes(localSerializationConfig, paramBeanDescription, localList);
    if (localSerializationConfig.isEnabled(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS))
      removeSetterlessGetters(localSerializationConfig, paramBeanDescription, localList);
    if (localList.isEmpty())
      return null;
    boolean bool = usesStaticTyping(localSerializationConfig, paramBeanDescription, null);
    PropertyBuilder localPropertyBuilder = constructPropertyBuilder(localSerializationConfig, paramBeanDescription);
    ArrayList localArrayList = new ArrayList(localList.size());
    TypeBindings localTypeBindings = paramBeanDescription.bindingsForBeanType();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      BeanPropertyDefinition localBeanPropertyDefinition = (BeanPropertyDefinition)localIterator.next();
      AnnotatedMember localAnnotatedMember = localBeanPropertyDefinition.getAccessor();
      if (localBeanPropertyDefinition.isTypeId())
      {
        if (localAnnotatedMember != null)
        {
          if (localSerializationConfig.canOverrideAccessModifiers())
            localAnnotatedMember.fixAccess();
          paramBeanSerializerBuilder.setTypeId(localAnnotatedMember);
        }
      }
      else
      {
        AnnotationIntrospector.ReferenceProperty localReferenceProperty = localBeanPropertyDefinition.findReferenceType();
        if ((localReferenceProperty == null) || (!localReferenceProperty.isBackReference()))
          if ((localAnnotatedMember instanceof AnnotatedMethod))
            localArrayList.add(_constructWriter(paramSerializerProvider, localBeanPropertyDefinition, localTypeBindings, localPropertyBuilder, bool, (AnnotatedMethod)localAnnotatedMember));
          else
            localArrayList.add(_constructWriter(paramSerializerProvider, localBeanPropertyDefinition, localTypeBindings, localPropertyBuilder, bool, (AnnotatedField)localAnnotatedMember));
      }
    }
    return localArrayList;
  }

  public JsonSerializer<Object> findBeanSerializer(SerializerProvider paramSerializerProvider, JavaType paramJavaType, BeanDescription paramBeanDescription)
  {
    Object localObject;
    if ((!isPotentialBeanType(paramJavaType.getRawClass())) && (!paramJavaType.isEnumType()))
      localObject = null;
    JsonSerializer localJsonSerializer;
    while (true)
    {
      return localObject;
      localJsonSerializer = constructBeanSerializer(paramSerializerProvider, paramBeanDescription);
      if (!this._factoryConfig.hasSerializerModifiers())
        break;
      Iterator localIterator = this._factoryConfig.serializerModifiers().iterator();
      for (localObject = localJsonSerializer; localIterator.hasNext(); localObject = ((BeanSerializerModifier)localIterator.next()).modifySerializer(paramSerializerProvider.getConfig(), paramBeanDescription, (JsonSerializer)localObject));
    }
    return localJsonSerializer;
  }

  protected Object findFilterId(SerializationConfig paramSerializationConfig, BeanDescription paramBeanDescription)
  {
    return paramSerializationConfig.getAnnotationIntrospector().findFilterId(paramBeanDescription.getClassInfo());
  }

  public TypeSerializer findPropertyContentTypeSerializer(JavaType paramJavaType, SerializationConfig paramSerializationConfig, AnnotatedMember paramAnnotatedMember)
  {
    JavaType localJavaType = paramJavaType.getContentType();
    AnnotationIntrospector localAnnotationIntrospector = paramSerializationConfig.getAnnotationIntrospector();
    TypeResolverBuilder localTypeResolverBuilder = localAnnotationIntrospector.findPropertyContentTypeResolver(paramSerializationConfig, paramAnnotatedMember, paramJavaType);
    if (localTypeResolverBuilder == null)
      return createTypeSerializer(paramSerializationConfig, localJavaType);
    return localTypeResolverBuilder.buildTypeSerializer(paramSerializationConfig, localJavaType, paramSerializationConfig.getSubtypeResolver().collectAndResolveSubtypes(paramAnnotatedMember, paramSerializationConfig, localAnnotationIntrospector, localJavaType));
  }

  public TypeSerializer findPropertyTypeSerializer(JavaType paramJavaType, SerializationConfig paramSerializationConfig, AnnotatedMember paramAnnotatedMember)
  {
    AnnotationIntrospector localAnnotationIntrospector = paramSerializationConfig.getAnnotationIntrospector();
    TypeResolverBuilder localTypeResolverBuilder = localAnnotationIntrospector.findPropertyTypeResolver(paramSerializationConfig, paramAnnotatedMember, paramJavaType);
    if (localTypeResolverBuilder == null)
      return createTypeSerializer(paramSerializationConfig, paramJavaType);
    return localTypeResolverBuilder.buildTypeSerializer(paramSerializationConfig, paramJavaType, paramSerializationConfig.getSubtypeResolver().collectAndResolveSubtypes(paramAnnotatedMember, paramSerializationConfig, localAnnotationIntrospector, paramJavaType));
  }

  protected boolean isPotentialBeanType(Class<?> paramClass)
  {
    return (ClassUtil.canBeABeanType(paramClass) == null) && (!ClassUtil.isProxyType(paramClass));
  }

  protected void processViews(SerializationConfig paramSerializationConfig, BeanSerializerBuilder paramBeanSerializerBuilder)
  {
    List localList = paramBeanSerializerBuilder.getProperties();
    boolean bool = paramSerializationConfig.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
    int i = localList.size();
    BeanPropertyWriter[] arrayOfBeanPropertyWriter = new BeanPropertyWriter[i];
    int j = 0;
    int k = 0;
    if (j < i)
    {
      BeanPropertyWriter localBeanPropertyWriter = (BeanPropertyWriter)localList.get(j);
      Class[] arrayOfClass = localBeanPropertyWriter.getViews();
      if (arrayOfClass == null)
      {
        if (!bool)
          break label109;
        arrayOfBeanPropertyWriter[j] = localBeanPropertyWriter;
      }
      label109: for (int m = k; ; m = k)
      {
        j++;
        k = m;
        break;
        k++;
        arrayOfBeanPropertyWriter[j] = constructFilteredBeanWriter(localBeanPropertyWriter, arrayOfClass);
      }
    }
    if ((bool) && (k == 0))
      return;
    paramBeanSerializerBuilder.setFilteredProperties(arrayOfBeanPropertyWriter);
  }

  protected void removeIgnorableTypes(SerializationConfig paramSerializationConfig, BeanDescription paramBeanDescription, List<BeanPropertyDefinition> paramList)
  {
    AnnotationIntrospector localAnnotationIntrospector = paramSerializationConfig.getAnnotationIntrospector();
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      AnnotatedMember localAnnotatedMember = ((BeanPropertyDefinition)localIterator.next()).getAccessor();
      if (localAnnotatedMember == null)
      {
        localIterator.remove();
      }
      else
      {
        Class localClass = localAnnotatedMember.getRawType();
        Boolean localBoolean = (Boolean)localHashMap.get(localClass);
        if (localBoolean == null)
        {
          localBoolean = localAnnotationIntrospector.isIgnorableType(paramSerializationConfig.introspectClassAnnotations(localClass).getClassInfo());
          if (localBoolean == null)
            localBoolean = Boolean.FALSE;
          localHashMap.put(localClass, localBoolean);
        }
        if (localBoolean.booleanValue())
          localIterator.remove();
      }
    }
  }

  protected void removeSetterlessGetters(SerializationConfig paramSerializationConfig, BeanDescription paramBeanDescription, List<BeanPropertyDefinition> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      BeanPropertyDefinition localBeanPropertyDefinition = (BeanPropertyDefinition)localIterator.next();
      if ((!localBeanPropertyDefinition.couldDeserialize()) && (!localBeanPropertyDefinition.isExplicitlyIncluded()))
        localIterator.remove();
    }
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.BeanSerializerFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
