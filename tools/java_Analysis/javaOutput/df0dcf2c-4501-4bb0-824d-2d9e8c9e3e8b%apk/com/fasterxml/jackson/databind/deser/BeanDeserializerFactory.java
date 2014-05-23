package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty.Std;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonDeserializer;;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.deser.impl.MethodProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.std.JdkDeserializers.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.Type;;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class BeanDeserializerFactory extends BasicDeserializerFactory
  implements Serializable
{
  private static final Class<?>[] INIT_CAUSE_PARAMS = { Throwable.class };
  private static final Class<?>[] NO_VIEWS = new Class[0];
  public static final BeanDeserializerFactory instance = new BeanDeserializerFactory(new DeserializerFactoryConfig());
  private static final long serialVersionUID = 1L;

  public BeanDeserializerFactory(DeserializerFactoryConfig paramDeserializerFactoryConfig)
  {
    super(paramDeserializerFactoryConfig);
  }

  protected JsonDeserializer<Object> _findCustomBeanDeserializer(JavaType paramJavaType, DeserializationConfig paramDeserializationConfig, BeanDescription paramBeanDescription)
  {
    Iterator localIterator = this._factoryConfig.deserializers().iterator();
    while (localIterator.hasNext())
    {
      JsonDeserializer localJsonDeserializer = ((Deserializers)localIterator.next()).findBeanDeserializer(paramJavaType, paramDeserializationConfig, paramBeanDescription);
      if (localJsonDeserializer != null)
        return localJsonDeserializer;
    }
    return null;
  }

  protected void addBeanProps(DeserializationContext paramDeserializationContext, BeanDescription paramBeanDescription, BeanDeserializerBuilder paramBeanDeserializerBuilder)
  {
    SettableBeanProperty[] arrayOfSettableBeanProperty = paramBeanDeserializerBuilder.getValueInstantiator().getFromObjectArguments(paramDeserializationContext.getConfig());
    AnnotationIntrospector localAnnotationIntrospector = paramDeserializationContext.getAnnotationIntrospector();
    Boolean localBoolean = localAnnotationIntrospector.findIgnoreUnknownProperties(paramBeanDescription.getClassInfo());
    if (localBoolean != null)
      paramBeanDeserializerBuilder.setIgnoreUnknownProperties(localBoolean.booleanValue());
    HashSet localHashSet = ArrayBuilders.arrayToSet(localAnnotationIntrospector.findPropertiesToIgnore(paramBeanDescription.getClassInfo()));
    Iterator localIterator1 = localHashSet.iterator();
    while (localIterator1.hasNext())
      paramBeanDeserializerBuilder.addIgnorable((String)localIterator1.next());
    AnnotatedMethod localAnnotatedMethod = paramBeanDescription.findAnySetter();
    if (localAnnotatedMethod != null)
      paramBeanDeserializerBuilder.setAnySetter(constructAnySetter(paramDeserializationContext, paramBeanDescription, localAnnotatedMethod));
    if (localAnnotatedMethod == null)
    {
      Set localSet = paramBeanDescription.getIgnoredPropertyNames();
      if (localSet != null)
      {
        Iterator localIterator4 = localSet.iterator();
        while (localIterator4.hasNext())
          paramBeanDeserializerBuilder.addIgnorable((String)localIterator4.next());
      }
    }
    if ((paramDeserializationContext.isEnabled(MapperFeature.USE_GETTERS_AS_SETTERS)) && (paramDeserializationContext.isEnabled(MapperFeature.AUTO_DETECT_GETTERS)));
    List localList1;
    for (int i = 1; ; i = 0)
    {
      localList1 = filterBeanProps(paramDeserializationContext, paramBeanDescription, paramBeanDeserializerBuilder, paramBeanDescription.findProperties(), localHashSet);
      if (!this._factoryConfig.hasDeserializerModifiers())
        break;
      Iterator localIterator3 = this._factoryConfig.deserializerModifiers().iterator();
      for (localList2 = localList1; localIterator3.hasNext(); localList2 = ((BeanDeserializerModifier)localIterator3.next()).updateProperties(paramDeserializationContext.getConfig(), paramBeanDescription, localList2));
    }
    List localList2 = localList1;
    Iterator localIterator2 = localList2.iterator();
    label614: 
    while (localIterator2.hasNext())
    {
      BeanPropertyDefinition localBeanPropertyDefinition = (BeanPropertyDefinition)localIterator2.next();
      if (localBeanPropertyDefinition.hasConstructorParameter())
      {
        String str = localBeanPropertyDefinition.getName();
        Object localObject = null;
        int j;
        if (arrayOfSettableBeanProperty != null)
          j = arrayOfSettableBeanProperty.length;
        for (int k = 0; ; k++)
        {
          localObject = null;
          if (k < j)
          {
            SettableBeanProperty localSettableBeanProperty2 = arrayOfSettableBeanProperty[k];
            if (str.equals(localSettableBeanProperty2.getName()))
              localObject = localSettableBeanProperty2;
          }
          else
          {
            if (localObject != null)
              break;
            throw paramDeserializationContext.mappingException("Could not find creator property with name '" + str + "' (in class " + paramBeanDescription.getBeanClass().getName() + ")");
          }
        }
        paramBeanDeserializerBuilder.addCreatorProperty(localObject);
      }
      else
      {
        SettableBeanProperty localSettableBeanProperty1;
        if (localBeanPropertyDefinition.hasSetter())
          localSettableBeanProperty1 = constructSettableProperty(paramDeserializationContext, paramBeanDescription, localBeanPropertyDefinition, localBeanPropertyDefinition.getSetter().getGenericParameterType(0));
        while (true)
        {
          if (localSettableBeanProperty1 == null)
            break label614;
          Class[] arrayOfClass = localBeanPropertyDefinition.findViews();
          if ((arrayOfClass == null) && (!paramDeserializationContext.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION)))
            arrayOfClass = NO_VIEWS;
          localSettableBeanProperty1.setViews(arrayOfClass);
          paramBeanDeserializerBuilder.addProperty(localSettableBeanProperty1);
          break;
          if (localBeanPropertyDefinition.hasField())
          {
            localSettableBeanProperty1 = constructSettableProperty(paramDeserializationContext, paramBeanDescription, localBeanPropertyDefinition, localBeanPropertyDefinition.getField().getGenericType());
          }
          else
          {
            localSettableBeanProperty1 = null;
            if (i != 0)
            {
              boolean bool1 = localBeanPropertyDefinition.hasGetter();
              localSettableBeanProperty1 = null;
              if (bool1)
              {
                Class localClass = localBeanPropertyDefinition.getGetter().getRawType();
                if (!Collection.class.isAssignableFrom(localClass))
                {
                  boolean bool2 = Map.class.isAssignableFrom(localClass);
                  localSettableBeanProperty1 = null;
                  if (!bool2);
                }
                else
                {
                  localSettableBeanProperty1 = constructSetterlessProperty(paramDeserializationContext, paramBeanDescription, localBeanPropertyDefinition);
                }
              }
            }
          }
        }
      }
    }
  }

  protected void addInjectables(DeserializationContext paramDeserializationContext, BeanDescription paramBeanDescription, BeanDeserializerBuilder paramBeanDeserializerBuilder)
  {
    Map localMap = paramBeanDescription.findInjectables();
    if (localMap != null)
    {
      boolean bool = paramDeserializationContext.canOverrideAccessModifiers();
      Iterator localIterator = localMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        AnnotatedMember localAnnotatedMember = (AnnotatedMember)localEntry.getValue();
        if (bool)
          localAnnotatedMember.fixAccess();
        paramBeanDeserializerBuilder.addInjectable(localAnnotatedMember.getName(), paramBeanDescription.resolveType(localAnnotatedMember.getGenericType()), paramBeanDescription.getClassAnnotations(), localAnnotatedMember, localEntry.getKey());
      }
    }
  }

  protected void addObjectIdReader(DeserializationContext paramDeserializationContext, BeanDescription paramBeanDescription, BeanDeserializerBuilder paramBeanDeserializerBuilder)
  {
    ObjectIdInfo localObjectIdInfo = paramBeanDescription.getObjectIdInfo();
    if (localObjectIdInfo == null)
      return;
    Class localClass = localObjectIdInfo.getGeneratorType();
    SettableBeanProperty localSettableBeanProperty;
    JavaType localJavaType2;
    Object localObject;
    if (localClass == ObjectIdGenerators.PropertyGenerator.class)
    {
      String str = localObjectIdInfo.getPropertyName();
      localSettableBeanProperty = paramBeanDeserializerBuilder.findProperty(str);
      if (localSettableBeanProperty == null)
        throw new IllegalArgumentException("Invalid Object Id definition for " + paramBeanDescription.getBeanClass().getName() + ": can not find property with name '" + str + "'");
      localJavaType2 = localSettableBeanProperty.getType();
      localObject = new PropertyBasedObjectIdGenerator(localObjectIdInfo.getScope());
    }
    while (true)
    {
      JsonDeserializer localJsonDeserializer = paramDeserializationContext.findRootValueDeserializer(localJavaType2);
      paramBeanDeserializerBuilder.setObjectIdReader(ObjectIdReader.construct(localJavaType2, localObjectIdInfo.getPropertyName(), (com.fasterxml.jackson.annotation.ObjectIdGenerator)localObject, localJsonDeserializer, localSettableBeanProperty));
      return;
      JavaType localJavaType1 = paramDeserializationContext.constructType(localClass);
      localJavaType2 = paramDeserializationContext.getTypeFactory().findTypeParameters(localJavaType1, com.fasterxml.jackson.annotation.ObjectIdGenerator.class)[0];
      localObject = paramDeserializationContext.objectIdGeneratorInstance(paramBeanDescription.getClassInfo(), localObjectIdInfo);
      localSettableBeanProperty = null;
    }
  }

  protected void addReferenceProperties(DeserializationContext paramDeserializationContext, BeanDescription paramBeanDescription, BeanDeserializerBuilder paramBeanDeserializerBuilder)
  {
    Map localMap = paramBeanDescription.findBackReferenceProperties();
    if (localMap != null)
    {
      Iterator localIterator = localMap.entrySet().iterator();
      if (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        String str = (String)localEntry.getKey();
        AnnotatedMember localAnnotatedMember = (AnnotatedMember)localEntry.getValue();
        if ((localAnnotatedMember instanceof AnnotatedMethod));
        for (Object localObject = ((AnnotatedMethod)localAnnotatedMember).getGenericParameterType(0); ; localObject = localAnnotatedMember.getRawType())
        {
          paramBeanDeserializerBuilder.addBackReferenceProperty(str, constructSettableProperty(paramDeserializationContext, paramBeanDescription, new SimpleBeanPropertyDefinition(localAnnotatedMember), (Type)localObject));
          break;
        }
      }
    }
  }

  public JsonDeserializer<Object> buildBeanDeserializer(DeserializationContext paramDeserializationContext, JavaType paramJavaType, BeanDescription paramBeanDescription)
  {
    ValueInstantiator localValueInstantiator = findValueInstantiator(paramDeserializationContext, paramBeanDescription);
    BeanDeserializerBuilder localBeanDeserializerBuilder1 = constructBeanDeserializerBuilder(paramDeserializationContext, paramBeanDescription);
    localBeanDeserializerBuilder1.setValueInstantiator(localValueInstantiator);
    addBeanProps(paramDeserializationContext, paramBeanDescription, localBeanDeserializerBuilder1);
    addObjectIdReader(paramDeserializationContext, paramBeanDescription, localBeanDeserializerBuilder1);
    addReferenceProperties(paramDeserializationContext, paramBeanDescription, localBeanDeserializerBuilder1);
    addInjectables(paramDeserializationContext, paramBeanDescription, localBeanDeserializerBuilder1);
    DeserializationConfig localDeserializationConfig = paramDeserializationContext.getConfig();
    if (this._factoryConfig.hasDeserializerModifiers())
    {
      Iterator localIterator2 = this._factoryConfig.deserializerModifiers().iterator();
      for (localBeanDeserializerBuilder2 = localBeanDeserializerBuilder1; localIterator2.hasNext(); localBeanDeserializerBuilder2 = ((BeanDeserializerModifier)localIterator2.next()).updateBuilder(localDeserializationConfig, paramBeanDescription, localBeanDeserializerBuilder2));
    }
    BeanDeserializerBuilder localBeanDeserializerBuilder2 = localBeanDeserializerBuilder1;
    if ((paramJavaType.isAbstract()) && (!localValueInstantiator.canInstantiate()));
    for (Object localObject1 = localBeanDeserializerBuilder2.buildAbstract(); this._factoryConfig.hasDeserializerModifiers(); localObject1 = localBeanDeserializerBuilder2.build())
    {
      Iterator localIterator1 = this._factoryConfig.deserializerModifiers().iterator();
      for (localObject2 = localObject1; localIterator1.hasNext(); localObject2 = ((BeanDeserializerModifier)localIterator1.next()).modifyDeserializer(localDeserializationConfig, paramBeanDescription, (JsonDeserializer)localObject2));
    }
    Object localObject2 = localObject1;
    return localObject2;
  }

  protected JsonDeserializer<Object> buildBuilderBasedDeserializer(DeserializationContext paramDeserializationContext, JavaType paramJavaType, BeanDescription paramBeanDescription)
  {
    ValueInstantiator localValueInstantiator = findValueInstantiator(paramDeserializationContext, paramBeanDescription);
    DeserializationConfig localDeserializationConfig = paramDeserializationContext.getConfig();
    BeanDeserializerBuilder localBeanDeserializerBuilder = constructBeanDeserializerBuilder(paramDeserializationContext, paramBeanDescription);
    localBeanDeserializerBuilder.setValueInstantiator(localValueInstantiator);
    addBeanProps(paramDeserializationContext, paramBeanDescription, localBeanDeserializerBuilder);
    addObjectIdReader(paramDeserializationContext, paramBeanDescription, localBeanDeserializerBuilder);
    addReferenceProperties(paramDeserializationContext, paramBeanDescription, localBeanDeserializerBuilder);
    addInjectables(paramDeserializationContext, paramBeanDescription, localBeanDeserializerBuilder);
    JsonPOJOBuilder.Value localValue = paramBeanDescription.findPOJOBuilderConfig();
    if (localValue == null);
    for (String str = "build"; ; str = localValue.buildMethodName)
    {
      AnnotatedMethod localAnnotatedMethod = paramBeanDescription.findMethod(str, null);
      if ((localAnnotatedMethod != null) && (localDeserializationConfig.canOverrideAccessModifiers()))
        ClassUtil.checkAndFixAccess(localAnnotatedMethod.getMember());
      localBeanDeserializerBuilder.setPOJOBuilder(localAnnotatedMethod, localValue);
      if (!this._factoryConfig.hasDeserializerModifiers())
        break;
      Iterator localIterator2 = this._factoryConfig.deserializerModifiers().iterator();
      while (localIterator2.hasNext())
        localBeanDeserializerBuilder = ((BeanDeserializerModifier)localIterator2.next()).updateBuilder(localDeserializationConfig, paramBeanDescription, localBeanDeserializerBuilder);
    }
    JsonDeserializer localJsonDeserializer1 = localBeanDeserializerBuilder.buildBuilderBased(paramJavaType, str);
    if (this._factoryConfig.hasDeserializerModifiers())
    {
      Iterator localIterator1 = this._factoryConfig.deserializerModifiers().iterator();
      for (localJsonDeserializer2 = localJsonDeserializer1; localIterator1.hasNext(); localJsonDeserializer2 = ((BeanDeserializerModifier)localIterator1.next()).modifyDeserializer(localDeserializationConfig, paramBeanDescription, localJsonDeserializer2));
    }
    JsonDeserializer localJsonDeserializer2 = localJsonDeserializer1;
    return localJsonDeserializer2;
  }

  public JsonDeserializer<Object> buildThrowableDeserializer(DeserializationContext paramDeserializationContext, JavaType paramJavaType, BeanDescription paramBeanDescription)
  {
    DeserializationConfig localDeserializationConfig = paramDeserializationContext.getConfig();
    BeanDeserializerBuilder localBeanDeserializerBuilder1 = constructBeanDeserializerBuilder(paramDeserializationContext, paramBeanDescription);
    localBeanDeserializerBuilder1.setValueInstantiator(findValueInstantiator(paramDeserializationContext, paramBeanDescription));
    addBeanProps(paramDeserializationContext, paramBeanDescription, localBeanDeserializerBuilder1);
    AnnotatedMethod localAnnotatedMethod = paramBeanDescription.findMethod("initCause", INIT_CAUSE_PARAMS);
    if (localAnnotatedMethod != null)
    {
      SettableBeanProperty localSettableBeanProperty = constructSettableProperty(paramDeserializationContext, paramBeanDescription, new SimpleBeanPropertyDefinition(localAnnotatedMethod, "cause"), localAnnotatedMethod.getGenericParameterType(0));
      if (localSettableBeanProperty != null)
        localBeanDeserializerBuilder1.addOrReplaceProperty(localSettableBeanProperty, true);
    }
    localBeanDeserializerBuilder1.addIgnorable("localizedMessage");
    localBeanDeserializerBuilder1.addIgnorable("suppressed");
    localBeanDeserializerBuilder1.addIgnorable("message");
    if (this._factoryConfig.hasDeserializerModifiers())
    {
      Iterator localIterator2 = this._factoryConfig.deserializerModifiers().iterator();
      for (localBeanDeserializerBuilder2 = localBeanDeserializerBuilder1; localIterator2.hasNext(); localBeanDeserializerBuilder2 = ((BeanDeserializerModifier)localIterator2.next()).updateBuilder(localDeserializationConfig, paramBeanDescription, localBeanDeserializerBuilder2));
    }
    BeanDeserializerBuilder localBeanDeserializerBuilder2 = localBeanDeserializerBuilder1;
    Object localObject1 = localBeanDeserializerBuilder2.build();
    if ((localObject1 instanceof BeanDeserializer))
      localObject1 = new ThrowableDeserializer((BeanDeserializer)localObject1);
    if (this._factoryConfig.hasDeserializerModifiers())
    {
      Iterator localIterator1 = this._factoryConfig.deserializerModifiers().iterator();
      for (localObject2 = localObject1; localIterator1.hasNext(); localObject2 = ((BeanDeserializerModifier)localIterator1.next()).modifyDeserializer(localDeserializationConfig, paramBeanDescription, (JsonDeserializer)localObject2));
    }
    Object localObject2 = localObject1;
    return localObject2;
  }

  protected SettableAnyProperty constructAnySetter(DeserializationContext paramDeserializationContext, BeanDescription paramBeanDescription, AnnotatedMethod paramAnnotatedMethod)
  {
    if (paramDeserializationContext.canOverrideAccessModifiers())
      paramAnnotatedMethod.fixAccess();
    JavaType localJavaType1 = paramBeanDescription.bindingsForBeanType().resolveType(paramAnnotatedMethod.getGenericParameterType(1));
    BeanProperty.Std localStd = new BeanProperty.Std(paramAnnotatedMethod.getName(), localJavaType1, paramBeanDescription.getClassAnnotations(), paramAnnotatedMethod);
    JavaType localJavaType2 = resolveType(paramDeserializationContext, paramBeanDescription, localJavaType1, paramAnnotatedMethod);
    JsonDeserializer localJsonDeserializer = findDeserializerFromAnnotation(paramDeserializationContext, paramAnnotatedMethod);
    if (localJsonDeserializer != null)
      return new SettableAnyProperty(localStd, paramAnnotatedMethod, localJavaType2, localJsonDeserializer);
    return new SettableAnyProperty(localStd, paramAnnotatedMethod, modifyTypeByAnnotation(paramDeserializationContext, paramAnnotatedMethod, localJavaType2), null);
  }

  protected BeanDeserializerBuilder constructBeanDeserializerBuilder(DeserializationContext paramDeserializationContext, BeanDescription paramBeanDescription)
  {
    return new BeanDeserializerBuilder(paramBeanDescription, paramDeserializationContext.getConfig());
  }

  protected SettableBeanProperty constructSettableProperty(DeserializationContext paramDeserializationContext, BeanDescription paramBeanDescription, BeanPropertyDefinition paramBeanPropertyDefinition, Type paramType)
  {
    AnnotatedMember localAnnotatedMember = paramBeanPropertyDefinition.getMutator();
    if (paramDeserializationContext.canOverrideAccessModifiers())
      localAnnotatedMember.fixAccess();
    JavaType localJavaType1 = paramBeanDescription.resolveType(paramType);
    BeanProperty.Std localStd = new BeanProperty.Std(paramBeanPropertyDefinition.getName(), localJavaType1, paramBeanDescription.getClassAnnotations(), localAnnotatedMember);
    JavaType localJavaType2 = resolveType(paramDeserializationContext, paramBeanDescription, localJavaType1, localAnnotatedMember);
    if (localJavaType2 != localJavaType1)
      localStd.withType(localJavaType2);
    JsonDeserializer localJsonDeserializer = findDeserializerFromAnnotation(paramDeserializationContext, localAnnotatedMember);
    JavaType localJavaType3 = modifyTypeByAnnotation(paramDeserializationContext, localAnnotatedMember, localJavaType2);
    TypeDeserializer localTypeDeserializer = (TypeDeserializer)localJavaType3.getTypeHandler();
    if ((localAnnotatedMember instanceof AnnotatedMethod));
    for (Object localObject = new MethodProperty(paramBeanPropertyDefinition, localJavaType3, localTypeDeserializer, paramBeanDescription.getClassAnnotations(), (AnnotatedMethod)localAnnotatedMember); ; localObject = new FieldProperty(paramBeanPropertyDefinition, localJavaType3, localTypeDeserializer, paramBeanDescription.getClassAnnotations(), (AnnotatedField)localAnnotatedMember))
    {
      if (localJsonDeserializer != null)
        localObject = ((SettableBeanProperty)localObject).withValueDeserializer(localJsonDeserializer);
      AnnotationIntrospector.ReferenceProperty localReferenceProperty = paramBeanPropertyDefinition.findReferenceType();
      if ((localReferenceProperty != null) && (localReferenceProperty.isManagedReference()))
        ((SettableBeanProperty)localObject).setManagedReferenceName(localReferenceProperty.getName());
      return localObject;
    }
  }

  protected SettableBeanProperty constructSetterlessProperty(DeserializationContext paramDeserializationContext, BeanDescription paramBeanDescription, BeanPropertyDefinition paramBeanPropertyDefinition)
  {
    AnnotatedMethod localAnnotatedMethod = paramBeanPropertyDefinition.getGetter();
    if (paramDeserializationContext.canOverrideAccessModifiers())
      localAnnotatedMethod.fixAccess();
    JavaType localJavaType1 = localAnnotatedMethod.getType(paramBeanDescription.bindingsForBeanType());
    JsonDeserializer localJsonDeserializer = findDeserializerFromAnnotation(paramDeserializationContext, localAnnotatedMethod);
    JavaType localJavaType2 = modifyTypeByAnnotation(paramDeserializationContext, localAnnotatedMethod, localJavaType1);
    Object localObject = new SetterlessProperty(paramBeanPropertyDefinition, localJavaType2, (TypeDeserializer)localJavaType2.getTypeHandler(), paramBeanDescription.getClassAnnotations(), localAnnotatedMethod);
    if (localJsonDeserializer != null)
      localObject = ((SettableBeanProperty)localObject).withValueDeserializer(localJsonDeserializer);
    return localObject;
  }

  public JsonDeserializer<Object> createBeanDeserializer(DeserializationContext paramDeserializationContext, JavaType paramJavaType, BeanDescription paramBeanDescription)
  {
    DeserializationConfig localDeserializationConfig = paramDeserializationContext.getConfig();
    JsonDeserializer localJsonDeserializer = _findCustomBeanDeserializer(paramJavaType, localDeserializationConfig, paramBeanDescription);
    if (localJsonDeserializer != null);
    do
    {
      return localJsonDeserializer;
      if (paramJavaType.isThrowable())
        return buildThrowableDeserializer(paramDeserializationContext, paramJavaType, paramBeanDescription);
      if (paramJavaType.isAbstract())
      {
        JavaType localJavaType = materializeAbstractType(localDeserializationConfig, paramBeanDescription);
        if (localJavaType != null)
          return buildBeanDeserializer(paramDeserializationContext, localJavaType, localDeserializationConfig.introspect(localJavaType));
      }
      localJsonDeserializer = findStdDeserializer(localDeserializationConfig, paramJavaType);
    }
    while (localJsonDeserializer != null);
    if (!isPotentialBeanType(paramJavaType.getRawClass()))
      return null;
    return buildBeanDeserializer(paramDeserializationContext, paramJavaType, paramBeanDescription);
  }

  public JsonDeserializer<Object> createBuilderBasedDeserializer(DeserializationContext paramDeserializationContext, JavaType paramJavaType, BeanDescription paramBeanDescription, Class<?> paramClass)
  {
    JavaType localJavaType = paramDeserializationContext.constructType(paramClass);
    return buildBuilderBasedDeserializer(paramDeserializationContext, paramJavaType, paramDeserializationContext.getConfig().introspectForBuilder(localJavaType));
  }

  protected List<BeanPropertyDefinition> filterBeanProps(DeserializationContext paramDeserializationContext, BeanDescription paramBeanDescription, BeanDeserializerBuilder paramBeanDeserializerBuilder, List<BeanPropertyDefinition> paramList, Set<String> paramSet)
  {
    ArrayList localArrayList = new ArrayList(Math.max(4, paramList.size()));
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      BeanPropertyDefinition localBeanPropertyDefinition = (BeanPropertyDefinition)localIterator.next();
      String str = localBeanPropertyDefinition.getName();
      if (!paramSet.contains(str))
      {
        if (!localBeanPropertyDefinition.hasConstructorParameter())
        {
          Class localClass;
          if (localBeanPropertyDefinition.hasSetter())
            localClass = localBeanPropertyDefinition.getSetter().getRawParameterType(0);
          while (true)
          {
            if ((localClass == null) || (!isIgnorableType(paramDeserializationContext.getConfig(), paramBeanDescription, localClass, localHashMap)))
              break label164;
            paramBeanDeserializerBuilder.addIgnorable(str);
            break;
            boolean bool = localBeanPropertyDefinition.hasField();
            localClass = null;
            if (bool)
              localClass = localBeanPropertyDefinition.getField().getRawType();
          }
        }
        label164: localArrayList.add(localBeanPropertyDefinition);
      }
    }
    return localArrayList;
  }

  protected JsonDeserializer<Object> findStdDeserializer(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType)
  {
    Class localClass = paramJavaType.getRawClass();
    JsonDeserializer localJsonDeserializer = (JsonDeserializer)_simpleDeserializers.get(new ClassKey(localClass));
    if (localJsonDeserializer != null);
    do
    {
      return localJsonDeserializer;
      if (AtomicReference.class.isAssignableFrom(localClass))
      {
        JavaType[] arrayOfJavaType = paramDeserializationConfig.getTypeFactory().findTypeParameters(paramJavaType, AtomicReference.class);
        if ((arrayOfJavaType == null) || (arrayOfJavaType.length <= 0));
        for (JavaType localJavaType = TypeFactory.unknownType(); ; localJavaType = arrayOfJavaType[0])
          return new JdkDeserializers.AtomicReferenceDeserializer(localJavaType);
      }
      localJsonDeserializer = this.optionalHandlers.findDeserializer(paramJavaType, paramDeserializationConfig);
    }
    while (localJsonDeserializer != null);
    return null;
  }

  protected boolean isIgnorableType(DeserializationConfig paramDeserializationConfig, BeanDescription paramBeanDescription, Class<?> paramClass, Map<Class<?>, Boolean> paramMap)
  {
    Boolean localBoolean = (Boolean)paramMap.get(paramClass);
    if (localBoolean == null)
    {
      BeanDescription localBeanDescription = paramDeserializationConfig.introspectClassAnnotations(paramClass);
      localBoolean = paramDeserializationConfig.getAnnotationIntrospector().isIgnorableType(localBeanDescription.getClassInfo());
      if (localBoolean == null)
        localBoolean = Boolean.FALSE;
    }
    return localBoolean.booleanValue();
  }

  protected boolean isPotentialBeanType(Class<?> paramClass)
  {
    String str1 = ClassUtil.canBeABeanType(paramClass);
    if (str1 != null)
      throw new IllegalArgumentException("Can not deserialize Class " + paramClass.getName() + " (of type " + str1 + ") as a Bean");
    if (ClassUtil.isProxyType(paramClass))
      throw new IllegalArgumentException("Can not deserialize Proxy class " + paramClass.getName() + " as a Bean");
    String str2 = ClassUtil.isLocalType(paramClass, true);
    if (str2 != null)
      throw new IllegalArgumentException("Can not deserialize Class " + paramClass.getName() + " (of type " + str2 + ") as a Bean");
    return true;
  }

  protected JavaType materializeAbstractType(DeserializationConfig paramDeserializationConfig, BeanDescription paramBeanDescription)
  {
    JavaType localJavaType1 = paramBeanDescription.getType();
    Iterator localIterator = this._factoryConfig.abstractTypeResolvers().iterator();
    while (localIterator.hasNext())
    {
      JavaType localJavaType2 = ((AbstractTypeResolver)localIterator.next()).resolveAbstractType(paramDeserializationConfig, localJavaType1);
      if (localJavaType2 != null)
        return localJavaType2;
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.BeanDeserializerFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
