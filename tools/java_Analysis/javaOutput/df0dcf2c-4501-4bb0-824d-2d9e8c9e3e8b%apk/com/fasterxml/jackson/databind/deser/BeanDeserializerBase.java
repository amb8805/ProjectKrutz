package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty.Std;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JavaType;;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.introspect.Annotated;;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class BeanDeserializerBase extends StdDeserializer<Object>
  implements ContextualDeserializer, ResolvableDeserializer, Serializable
{
  private static final long serialVersionUID = -2038793552422727904L;
  protected SettableAnyProperty _anySetter;
  protected final Map<String, SettableBeanProperty> _backRefs;
  protected final BeanPropertyMap _beanProperties;
  protected final JavaType _beanType;
  private final transient Annotations _classAnnotations;
  protected JsonDeserializer<Object> _delegateDeserializer;
  protected ExternalTypeHandler _externalTypeIdHandler;
  protected final HashSet<String> _ignorableProps;
  protected final boolean _ignoreAllUnknown;
  protected final ValueInjector[] _injectables;
  protected final boolean _needViewProcesing;
  protected boolean _nonStandardCreation;
  protected final ObjectIdReader _objectIdReader;
  protected PropertyBasedCreator _propertyBasedCreator;
  protected final JsonFormat.Shape _serializationShape;
  protected transient HashMap<ClassKey, JsonDeserializer<Object>> _subDeserializers;
  protected UnwrappedPropertyHandler _unwrappedPropertyHandler;
  protected final ValueInstantiator _valueInstantiator;
  protected boolean _vanillaProcessing;

  protected BeanDeserializerBase(BeanDeserializerBase paramBeanDeserializerBase)
  {
    this(paramBeanDeserializerBase, paramBeanDeserializerBase._ignoreAllUnknown);
  }

  public BeanDeserializerBase(BeanDeserializerBase paramBeanDeserializerBase, ObjectIdReader paramObjectIdReader)
  {
    super(paramBeanDeserializerBase._beanType);
    this._classAnnotations = paramBeanDeserializerBase._classAnnotations;
    this._beanType = paramBeanDeserializerBase._beanType;
    this._valueInstantiator = paramBeanDeserializerBase._valueInstantiator;
    this._delegateDeserializer = paramBeanDeserializerBase._delegateDeserializer;
    this._propertyBasedCreator = paramBeanDeserializerBase._propertyBasedCreator;
    this._backRefs = paramBeanDeserializerBase._backRefs;
    this._ignorableProps = paramBeanDeserializerBase._ignorableProps;
    this._ignoreAllUnknown = paramBeanDeserializerBase._ignoreAllUnknown;
    this._anySetter = paramBeanDeserializerBase._anySetter;
    this._injectables = paramBeanDeserializerBase._injectables;
    this._nonStandardCreation = paramBeanDeserializerBase._nonStandardCreation;
    this._unwrappedPropertyHandler = paramBeanDeserializerBase._unwrappedPropertyHandler;
    this._needViewProcesing = paramBeanDeserializerBase._needViewProcesing;
    this._serializationShape = paramBeanDeserializerBase._serializationShape;
    this._vanillaProcessing = paramBeanDeserializerBase._vanillaProcessing;
    this._objectIdReader = paramObjectIdReader;
    if (paramObjectIdReader == null)
    {
      this._beanProperties = paramBeanDeserializerBase._beanProperties;
      return;
    }
    this._beanProperties = paramBeanDeserializerBase._beanProperties.withProperty(new ObjectIdValueProperty(paramObjectIdReader));
  }

  protected BeanDeserializerBase(BeanDeserializerBase paramBeanDeserializerBase, NameTransformer paramNameTransformer)
  {
    super(paramBeanDeserializerBase._beanType);
    this._classAnnotations = paramBeanDeserializerBase._classAnnotations;
    this._beanType = paramBeanDeserializerBase._beanType;
    this._valueInstantiator = paramBeanDeserializerBase._valueInstantiator;
    this._delegateDeserializer = paramBeanDeserializerBase._delegateDeserializer;
    this._propertyBasedCreator = paramBeanDeserializerBase._propertyBasedCreator;
    this._backRefs = paramBeanDeserializerBase._backRefs;
    this._ignorableProps = paramBeanDeserializerBase._ignorableProps;
    boolean bool;
    if ((paramNameTransformer != null) || (paramBeanDeserializerBase._ignoreAllUnknown))
    {
      bool = true;
      this._ignoreAllUnknown = bool;
      this._anySetter = paramBeanDeserializerBase._anySetter;
      this._injectables = paramBeanDeserializerBase._injectables;
      this._objectIdReader = paramBeanDeserializerBase._objectIdReader;
      this._nonStandardCreation = paramBeanDeserializerBase._nonStandardCreation;
      this._unwrappedPropertyHandler = paramBeanDeserializerBase._unwrappedPropertyHandler;
      if (paramNameTransformer == null)
        break label180;
      if (this._unwrappedPropertyHandler != null)
        this._unwrappedPropertyHandler.renameAll(paramNameTransformer);
    }
    label180: for (this._beanProperties = paramBeanDeserializerBase._beanProperties.renameAll(paramNameTransformer); ; this._beanProperties = paramBeanDeserializerBase._beanProperties)
    {
      this._needViewProcesing = paramBeanDeserializerBase._needViewProcesing;
      this._serializationShape = paramBeanDeserializerBase._serializationShape;
      this._vanillaProcessing = false;
      return;
      bool = false;
      break;
    }
  }

  public BeanDeserializerBase(BeanDeserializerBase paramBeanDeserializerBase, HashSet<String> paramHashSet)
  {
    super(paramBeanDeserializerBase._beanType);
    this._classAnnotations = paramBeanDeserializerBase._classAnnotations;
    this._beanType = paramBeanDeserializerBase._beanType;
    this._valueInstantiator = paramBeanDeserializerBase._valueInstantiator;
    this._delegateDeserializer = paramBeanDeserializerBase._delegateDeserializer;
    this._propertyBasedCreator = paramBeanDeserializerBase._propertyBasedCreator;
    this._backRefs = paramBeanDeserializerBase._backRefs;
    this._ignorableProps = paramHashSet;
    this._ignoreAllUnknown = paramBeanDeserializerBase._ignoreAllUnknown;
    this._anySetter = paramBeanDeserializerBase._anySetter;
    this._injectables = paramBeanDeserializerBase._injectables;
    this._nonStandardCreation = paramBeanDeserializerBase._nonStandardCreation;
    this._unwrappedPropertyHandler = paramBeanDeserializerBase._unwrappedPropertyHandler;
    this._needViewProcesing = paramBeanDeserializerBase._needViewProcesing;
    this._serializationShape = paramBeanDeserializerBase._serializationShape;
    this._vanillaProcessing = paramBeanDeserializerBase._vanillaProcessing;
    this._objectIdReader = paramBeanDeserializerBase._objectIdReader;
    this._beanProperties = paramBeanDeserializerBase._beanProperties;
  }

  protected BeanDeserializerBase(BeanDeserializerBase paramBeanDeserializerBase, boolean paramBoolean)
  {
    super(paramBeanDeserializerBase._beanType);
    this._classAnnotations = paramBeanDeserializerBase._classAnnotations;
    this._beanType = paramBeanDeserializerBase._beanType;
    this._valueInstantiator = paramBeanDeserializerBase._valueInstantiator;
    this._delegateDeserializer = paramBeanDeserializerBase._delegateDeserializer;
    this._propertyBasedCreator = paramBeanDeserializerBase._propertyBasedCreator;
    this._beanProperties = paramBeanDeserializerBase._beanProperties;
    this._backRefs = paramBeanDeserializerBase._backRefs;
    this._ignorableProps = paramBeanDeserializerBase._ignorableProps;
    this._ignoreAllUnknown = paramBoolean;
    this._anySetter = paramBeanDeserializerBase._anySetter;
    this._injectables = paramBeanDeserializerBase._injectables;
    this._objectIdReader = paramBeanDeserializerBase._objectIdReader;
    this._nonStandardCreation = paramBeanDeserializerBase._nonStandardCreation;
    this._unwrappedPropertyHandler = paramBeanDeserializerBase._unwrappedPropertyHandler;
    this._needViewProcesing = paramBeanDeserializerBase._needViewProcesing;
    this._serializationShape = paramBeanDeserializerBase._serializationShape;
    this._vanillaProcessing = paramBeanDeserializerBase._vanillaProcessing;
  }

  protected BeanDeserializerBase(BeanDeserializerBuilder paramBeanDeserializerBuilder, BeanDescription paramBeanDescription, BeanPropertyMap paramBeanPropertyMap, Map<String, SettableBeanProperty> paramMap, HashSet<String> paramHashSet, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramBeanDescription.getType());
    this._classAnnotations = paramBeanDescription.getClassInfo().getAnnotations();
    this._beanType = paramBeanDescription.getType();
    this._valueInstantiator = paramBeanDeserializerBuilder.getValueInstantiator();
    this._beanProperties = paramBeanPropertyMap;
    this._backRefs = paramMap;
    this._ignorableProps = paramHashSet;
    this._ignoreAllUnknown = paramBoolean1;
    this._anySetter = paramBeanDeserializerBuilder.getAnySetter();
    List localList = paramBeanDeserializerBuilder.getInjectables();
    ValueInjector[] arrayOfValueInjector;
    boolean bool2;
    label148: JsonFormat.Value localValue;
    JsonFormat.Shape localShape;
    if ((localList == null) || (localList.isEmpty()))
    {
      arrayOfValueInjector = null;
      this._injectables = arrayOfValueInjector;
      this._objectIdReader = paramBeanDeserializerBuilder.getObjectIdReader();
      if ((this._unwrappedPropertyHandler == null) && (!this._valueInstantiator.canCreateUsingDelegate()) && (!this._valueInstantiator.canCreateFromObjectWith()) && (this._valueInstantiator.canCreateUsingDefault()))
        break label241;
      bool2 = bool1;
      this._nonStandardCreation = bool2;
      localValue = paramBeanDescription.findExpectedFormat(null);
      localShape = null;
      if (localValue != null)
        break label247;
      label169: this._serializationShape = localShape;
      this._needViewProcesing = paramBoolean2;
      if ((this._nonStandardCreation) || (this._injectables != null) || (this._needViewProcesing) || (this._objectIdReader == null))
        break label257;
    }
    while (true)
    {
      this._vanillaProcessing = bool1;
      return;
      arrayOfValueInjector = (ValueInjector[])localList.toArray(new ValueInjector[localList.size()]);
      break;
      label241: bool2 = false;
      break label148;
      label247: localShape = localValue.getShape();
      break label169;
      label257: bool1 = false;
    }
  }

  protected JsonDeserializer<Object> _findSubclassDeserializer(DeserializationContext paramDeserializationContext, Object paramObject, TokenBuffer paramTokenBuffer)
  {
    try
    {
      if (this._subDeserializers == null);
      for (Object localObject2 = null; ; localObject2 = (JsonDeserializer)this._subDeserializers.get(new ClassKey(paramObject.getClass())))
      {
        if (localObject2 == null)
          break;
        return localObject2;
      }
    }
    finally
    {
    }
    JsonDeserializer localJsonDeserializer = paramDeserializationContext.findRootValueDeserializer(paramDeserializationContext.constructType(paramObject.getClass()));
    if (localJsonDeserializer != null)
      try
      {
        if (this._subDeserializers == null)
          this._subDeserializers = new HashMap();
        this._subDeserializers.put(new ClassKey(paramObject.getClass()), localJsonDeserializer);
        return localJsonDeserializer;
      }
      finally
      {
      }
    return localJsonDeserializer;
  }

  protected SettableBeanProperty _resolveInnerClassValuedProperty(DeserializationContext paramDeserializationContext, SettableBeanProperty paramSettableBeanProperty)
  {
    JsonDeserializer localJsonDeserializer = paramSettableBeanProperty.getValueDeserializer();
    Class localClass2;
    Constructor[] arrayOfConstructor;
    int i;
    if (((localJsonDeserializer instanceof BeanDeserializerBase)) && (!((BeanDeserializerBase)localJsonDeserializer).getValueInstantiator().canCreateUsingDefault()))
    {
      Class localClass1 = paramSettableBeanProperty.getType().getRawClass();
      localClass2 = ClassUtil.getOuterClass(localClass1);
      if ((localClass2 != null) && (localClass2 == this._beanType.getRawClass()))
      {
        arrayOfConstructor = localClass1.getConstructors();
        i = arrayOfConstructor.length;
      }
    }
    for (int j = 0; ; j++)
      if (j < i)
      {
        Constructor localConstructor = arrayOfConstructor[j];
        Class[] arrayOfClass = localConstructor.getParameterTypes();
        if ((arrayOfClass.length == 1) && (arrayOfClass[0] == localClass2))
        {
          if (paramDeserializationContext.getConfig().canOverrideAccessModifiers())
            ClassUtil.checkAndFixAccess(localConstructor);
          paramSettableBeanProperty = new InnerClassProperty(paramSettableBeanProperty, localConstructor);
        }
      }
      else
      {
        return paramSettableBeanProperty;
      }
  }

  protected SettableBeanProperty _resolveManagedReferenceProperty(DeserializationContext paramDeserializationContext, SettableBeanProperty paramSettableBeanProperty)
  {
    String str1 = paramSettableBeanProperty.getManagedReferenceName();
    if (str1 == null)
      return paramSettableBeanProperty;
    JsonDeserializer localJsonDeserializer1 = paramSettableBeanProperty.getValueDeserializer();
    boolean bool = false;
    SettableBeanProperty localSettableBeanProperty;
    if ((localJsonDeserializer1 instanceof BeanDeserializerBase))
      localSettableBeanProperty = ((BeanDeserializerBase)localJsonDeserializer1).findBackReference(str1);
    while (localSettableBeanProperty == null)
    {
      throw new IllegalArgumentException("Can not handle managed/back reference '" + str1 + "': no back reference property found from type " + paramSettableBeanProperty.getType());
      if ((localJsonDeserializer1 instanceof ContainerDeserializerBase))
      {
        JsonDeserializer localJsonDeserializer2 = ((ContainerDeserializerBase)localJsonDeserializer1).getContentDeserializer();
        if (!(localJsonDeserializer2 instanceof BeanDeserializerBase))
        {
          if (localJsonDeserializer2 == null);
          for (String str2 = "NULL"; ; str2 = localJsonDeserializer2.getClass().getName())
            throw new IllegalArgumentException("Can not handle managed/back reference '" + str1 + "': value deserializer is of type ContainerDeserializerBase, but content type is not handled by a BeanDeserializer  (instead it's of type " + str2 + ")");
        }
        localSettableBeanProperty = ((BeanDeserializerBase)localJsonDeserializer2).findBackReference(str1);
        bool = true;
      }
      else if ((localJsonDeserializer1 instanceof AbstractDeserializer))
      {
        localSettableBeanProperty = ((AbstractDeserializer)localJsonDeserializer1).findBackReference(str1);
        bool = false;
      }
      else
      {
        throw new IllegalArgumentException("Can not handle managed/back reference '" + str1 + "': type for value deserializer is not BeanDeserializer or ContainerDeserializerBase, but " + localJsonDeserializer1.getClass().getName());
      }
    }
    JavaType localJavaType1 = this._beanType;
    JavaType localJavaType2 = localSettableBeanProperty.getType();
    if (!localJavaType2.getRawClass().isAssignableFrom(localJavaType1.getRawClass()))
      throw new IllegalArgumentException("Can not handle managed/back reference '" + str1 + "': back reference type (" + localJavaType2.getRawClass().getName() + ") not compatible with managed type (" + localJavaType1.getRawClass().getName() + ")");
    return new ManagedReferenceProperty(paramSettableBeanProperty, str1, localSettableBeanProperty, this._classAnnotations, bool);
  }

  protected SettableBeanProperty _resolveUnwrappedProperty(DeserializationContext paramDeserializationContext, SettableBeanProperty paramSettableBeanProperty)
  {
    AnnotatedMember localAnnotatedMember = paramSettableBeanProperty.getMember();
    if (localAnnotatedMember != null)
    {
      NameTransformer localNameTransformer = paramDeserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(localAnnotatedMember);
      if (localNameTransformer != null)
      {
        JsonDeserializer localJsonDeserializer1 = paramSettableBeanProperty.getValueDeserializer();
        JsonDeserializer localJsonDeserializer2 = localJsonDeserializer1.unwrappingDeserializer(localNameTransformer);
        if ((localJsonDeserializer2 != localJsonDeserializer1) && (localJsonDeserializer2 != null))
          return paramSettableBeanProperty.withValueDeserializer(localJsonDeserializer2);
      }
    }
    return null;
  }

  protected abstract BeanDeserializerBase asArrayDeserializer();

  public JsonDeserializer<?> createContextual(DeserializationContext paramDeserializationContext, BeanProperty paramBeanProperty)
  {
    ObjectIdReader localObjectIdReader1 = this._objectIdReader;
    AnnotationIntrospector localAnnotationIntrospector = paramDeserializationContext.getAnnotationIntrospector();
    Object localObject1;
    if ((paramBeanProperty == null) || (localAnnotationIntrospector == null))
      localObject1 = null;
    String[] arrayOfString2;
    ObjectIdInfo localObjectIdInfo2;
    Class localClass;
    SettableBeanProperty localSettableBeanProperty;
    Object localObject3;
    Object localObject2;
    ObjectIdReader localObjectIdReader2;
    String[] arrayOfString1;
    while (true)
      if ((paramBeanProperty != null) && (localAnnotationIntrospector != null))
      {
        arrayOfString2 = localAnnotationIntrospector.findPropertiesToIgnore((com.fasterxml.jackson.databind.introspect.Annotated)localObject1);
        ObjectIdInfo localObjectIdInfo1 = localAnnotationIntrospector.findObjectIdInfo((com.fasterxml.jackson.databind.introspect.Annotated)localObject1);
        if (localObjectIdInfo1 != null)
        {
          localObjectIdInfo2 = localAnnotationIntrospector.findObjectReferenceInfo((com.fasterxml.jackson.databind.introspect.Annotated)localObject1, localObjectIdInfo1);
          localClass = localObjectIdInfo2.getGeneratorType();
          if (localClass == ObjectIdGenerators.PropertyGenerator.class)
          {
            String str = localObjectIdInfo2.getPropertyName();
            localSettableBeanProperty = findProperty(str);
            if (localSettableBeanProperty == null)
            {
              throw new IllegalArgumentException("Invalid Object Id definition for " + getBeanClass().getName() + ": can not find property with name '" + str + "'");
              localObject1 = paramBeanProperty.getMember();
              continue;
            }
            localObject3 = localSettableBeanProperty.getType();
            localObject2 = new PropertyBasedObjectIdGenerator(localObjectIdInfo2.getScope());
            JsonDeserializer localJsonDeserializer = paramDeserializationContext.findRootValueDeserializer((JavaType)localObject3);
            localObjectIdReader2 = ObjectIdReader.construct((JavaType)localObject3, localObjectIdInfo2.getPropertyName(), (com.fasterxml.jackson.annotation.ObjectIdGenerator)localObject2, localJsonDeserializer, localSettableBeanProperty);
            arrayOfString1 = arrayOfString2;
          }
        }
      }
    while (true)
    {
      if ((localObjectIdReader2 != null) && (localObjectIdReader2 != this._objectIdReader));
      for (BeanDeserializerBase localBeanDeserializerBase = withObjectIdReader(localObjectIdReader2); ; localBeanDeserializerBase = this)
      {
        if ((arrayOfString1 != null) && (arrayOfString1.length != 0))
          localBeanDeserializerBase = localBeanDeserializerBase.withIgnorableProperties(ArrayBuilders.setAndArray(localBeanDeserializerBase._ignorableProps, arrayOfString1));
        JsonFormat.Value localValue;
        if (localObject1 != null)
        {
          localValue = localAnnotationIntrospector.findFormat((com.fasterxml.jackson.databind.introspect.Annotated)localObject1);
          if (localValue == null);
        }
        for (JsonFormat.Shape localShape = localValue.getShape(); ; localShape = null)
        {
          if (localShape == null)
            localShape = this._serializationShape;
          if (localShape == JsonFormat.Shape.ARRAY)
          {
            return localBeanDeserializerBase.asArrayDeserializer();
            JavaType localJavaType1 = paramDeserializationContext.constructType(localClass);
            JavaType localJavaType2 = paramDeserializationContext.getTypeFactory().findTypeParameters(localJavaType1, com.fasterxml.jackson.annotation.ObjectIdGenerator.class)[0];
            localObject2 = paramDeserializationContext.objectIdGeneratorInstance((com.fasterxml.jackson.databind.introspect.Annotated)localObject1, localObjectIdInfo2);
            localObject3 = localJavaType2;
            localSettableBeanProperty = null;
            break;
          }
          return localBeanDeserializerBase;
        }
      }
      localObjectIdReader2 = localObjectIdReader1;
      arrayOfString1 = arrayOfString2;
      continue;
      localObjectIdReader2 = localObjectIdReader1;
      arrayOfString1 = null;
    }
  }

  protected Object deserializeFromObjectId(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    Object localObject1 = this._objectIdReader.deserializer.deserialize(paramJsonParser, paramDeserializationContext);
    Object localObject2 = paramDeserializationContext.findObjectId(localObject1, this._objectIdReader.generator).item;
    if (localObject2 == null)
      throw new IllegalStateException("Could not resolve Object Id [" + localObject1 + "] -- unresolved forward-reference?");
    return localObject2;
  }

  public final Object deserializeWithType(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, TypeDeserializer paramTypeDeserializer)
  {
    if (this._objectIdReader != null)
    {
      JsonToken localJsonToken = paramJsonParser.getCurrentToken();
      if ((localJsonToken != null) && (localJsonToken.isScalarValue()))
        return deserializeFromObjectId(paramJsonParser, paramDeserializationContext);
    }
    return paramTypeDeserializer.deserializeTypedFromObject(paramJsonParser, paramDeserializationContext);
  }

  public SettableBeanProperty findBackReference(String paramString)
  {
    if (this._backRefs == null)
      return null;
    return (SettableBeanProperty)this._backRefs.get(paramString);
  }

  public SettableBeanProperty findProperty(String paramString)
  {
    if (this._beanProperties == null);
    for (SettableBeanProperty localSettableBeanProperty = null; ; localSettableBeanProperty = this._beanProperties.find(paramString))
    {
      if ((localSettableBeanProperty == null) && (this._propertyBasedCreator != null))
        localSettableBeanProperty = this._propertyBasedCreator.findCreatorProperty(paramString);
      return localSettableBeanProperty;
    }
  }

  public final Class<?> getBeanClass()
  {
    return this._beanType.getRawClass();
  }

  public Collection<Object> getKnownPropertyNames()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this._beanProperties.iterator();
    while (localIterator.hasNext())
      localArrayList.add(((SettableBeanProperty)localIterator.next()).getName());
    return localArrayList;
  }

  public ValueInstantiator getValueInstantiator()
  {
    return this._valueInstantiator;
  }

  protected Object handleUnknownProperties(DeserializationContext paramDeserializationContext, Object paramObject, TokenBuffer paramTokenBuffer)
  {
    paramTokenBuffer.writeEndObject();
    JsonParser localJsonParser = paramTokenBuffer.asParser();
    while (localJsonParser.nextToken() != JsonToken.END_OBJECT)
    {
      String str = localJsonParser.getCurrentName();
      localJsonParser.nextToken();
      handleUnknownProperty(localJsonParser, paramDeserializationContext, paramObject, str);
    }
    return paramObject;
  }

  protected void handleUnknownProperty(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject, String paramString)
  {
    if ((this._ignoreAllUnknown) || ((this._ignorableProps != null) && (this._ignorableProps.contains(paramString))))
    {
      paramJsonParser.skipChildren();
      return;
    }
    super.handleUnknownProperty(paramJsonParser, paramDeserializationContext, paramObject, paramString);
  }

  protected void injectValues(DeserializationContext paramDeserializationContext, Object paramObject)
  {
    ValueInjector[] arrayOfValueInjector = this._injectables;
    int i = arrayOfValueInjector.length;
    for (int j = 0; j < i; j++)
      arrayOfValueInjector[j].inject(paramDeserializationContext, paramObject);
  }

  public boolean isCachable()
  {
    return true;
  }

  public void resolve(DeserializationContext paramDeserializationContext)
  {
    if (this._valueInstantiator.canCreateFromObjectWith())
    {
      SettableBeanProperty[] arrayOfSettableBeanProperty = this._valueInstantiator.getFromObjectArguments(paramDeserializationContext.getConfig());
      this._propertyBasedCreator = PropertyBasedCreator.construct(paramDeserializationContext, this._valueInstantiator, arrayOfSettableBeanProperty);
      Iterator localIterator2 = this._propertyBasedCreator.properties().iterator();
      localBuilder = null;
      while (localIterator2.hasNext())
      {
        SettableBeanProperty localSettableBeanProperty6 = (SettableBeanProperty)localIterator2.next();
        if (localSettableBeanProperty6.hasValueTypeDeserializer())
        {
          TypeDeserializer localTypeDeserializer2 = localSettableBeanProperty6.getValueTypeDeserializer();
          if (localTypeDeserializer2.getTypeInclusion() == JsonTypeInfo.As.EXTERNAL_PROPERTY)
          {
            if (localBuilder == null)
              localBuilder = new ExternalTypeHandler.Builder();
            localBuilder.addExternal(localSettableBeanProperty6, localTypeDeserializer2);
          }
        }
      }
    }
    ExternalTypeHandler.Builder localBuilder = null;
    Iterator localIterator1 = this._beanProperties.iterator();
    Object localObject1 = null;
    Object localObject2 = localBuilder;
    SettableBeanProperty localSettableBeanProperty1;
    SettableBeanProperty localSettableBeanProperty2;
    if (localIterator1.hasNext())
    {
      localSettableBeanProperty1 = (SettableBeanProperty)localIterator1.next();
      if (!localSettableBeanProperty1.hasValueDeserializer())
        localSettableBeanProperty2 = localSettableBeanProperty1.withValueDeserializer(findDeserializer(paramDeserializationContext, localSettableBeanProperty1.getType(), localSettableBeanProperty1));
    }
    while (true)
    {
      label187: SettableBeanProperty localSettableBeanProperty3 = _resolveManagedReferenceProperty(paramDeserializationContext, localSettableBeanProperty2);
      SettableBeanProperty localSettableBeanProperty4 = _resolveUnwrappedProperty(paramDeserializationContext, localSettableBeanProperty3);
      if (localSettableBeanProperty4 != null)
        if (localObject1 != null)
          break label613;
      label613: for (Object localObject4 = new UnwrappedPropertyHandler(); ; localObject4 = localObject1)
      {
        ((UnwrappedPropertyHandler)localObject4).addProperty(localSettableBeanProperty4);
        localObject1 = localObject4;
        break;
        JsonDeserializer localJsonDeserializer1 = localSettableBeanProperty1.getValueDeserializer();
        if (!(localJsonDeserializer1 instanceof ContextualDeserializer))
          break label620;
        JsonDeserializer localJsonDeserializer2 = ((ContextualDeserializer)localJsonDeserializer1).createContextual(paramDeserializationContext, localSettableBeanProperty1);
        if (localJsonDeserializer2 == localJsonDeserializer1)
          break label620;
        localSettableBeanProperty2 = localSettableBeanProperty1.withValueDeserializer(localJsonDeserializer2);
        break label187;
        SettableBeanProperty localSettableBeanProperty5 = _resolveInnerClassValuedProperty(paramDeserializationContext, localSettableBeanProperty3);
        if (localSettableBeanProperty5 != localSettableBeanProperty1)
          this._beanProperties.replace(localSettableBeanProperty5);
        if (!localSettableBeanProperty5.hasValueTypeDeserializer())
          break;
        TypeDeserializer localTypeDeserializer1 = localSettableBeanProperty5.getValueTypeDeserializer();
        if (localTypeDeserializer1.getTypeInclusion() != JsonTypeInfo.As.EXTERNAL_PROPERTY)
          break;
        if (localObject2 == null);
        for (Object localObject3 = new ExternalTypeHandler.Builder(); ; localObject3 = localObject2)
        {
          ((ExternalTypeHandler.Builder)localObject3).addExternal(localSettableBeanProperty5, localTypeDeserializer1);
          this._beanProperties.remove(localSettableBeanProperty5);
          localObject2 = localObject3;
          break;
          if ((this._anySetter != null) && (!this._anySetter.hasValueDeserializer()))
            this._anySetter = this._anySetter.withValueDeserializer(findDeserializer(paramDeserializationContext, this._anySetter.getType(), this._anySetter.getProperty()));
          if (this._valueInstantiator.canCreateUsingDelegate())
          {
            JavaType localJavaType = this._valueInstantiator.getDelegateType(paramDeserializationContext.getConfig());
            if (localJavaType == null)
              throw new IllegalArgumentException("Invalid delegate-creator definition for " + this._beanType + ": value instantiator (" + this._valueInstantiator.getClass().getName() + ") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'");
            AnnotatedWithParams localAnnotatedWithParams = this._valueInstantiator.getDelegateCreator();
            this._delegateDeserializer = findDeserializer(paramDeserializationContext, localJavaType, new BeanProperty.Std(null, localJavaType, this._classAnnotations, localAnnotatedWithParams));
          }
          if (localObject2 != null)
          {
            this._externalTypeIdHandler = ((ExternalTypeHandler.Builder)localObject2).build();
            this._nonStandardCreation = true;
          }
          this._unwrappedPropertyHandler = localObject1;
          if (localObject1 != null)
            this._nonStandardCreation = true;
          if ((this._vanillaProcessing) && (!this._nonStandardCreation));
          for (boolean bool = true; ; bool = false)
          {
            this._vanillaProcessing = bool;
            return;
          }
        }
      }
      label620: localSettableBeanProperty2 = localSettableBeanProperty1;
    }
  }

  public abstract JsonDeserializer<Object> unwrappingDeserializer(NameTransformer paramNameTransformer);

  public abstract BeanDeserializerBase withIgnorableProperties(HashSet<String> paramHashSet);

  public abstract BeanDeserializerBase withObjectIdReader(ObjectIdReader paramObjectIdReader);

  public void wrapAndThrow(Throwable paramThrowable, Object paramObject, String paramString, DeserializationContext paramDeserializationContext)
  {
    for (Throwable localThrowable = paramThrowable; ((localThrowable instanceof InvocationTargetException)) && (localThrowable.getCause() != null); localThrowable = localThrowable.getCause());
    if ((localThrowable instanceof Error))
      throw ((Error)localThrowable);
    if ((paramDeserializationContext == null) || (paramDeserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)));
    for (int i = 1; (localThrowable instanceof IOException); i = 0)
    {
      if ((i != 0) && ((localThrowable instanceof JsonMappingException)))
        break label114;
      throw ((IOException)localThrowable);
    }
    if ((i == 0) && ((localThrowable instanceof RuntimeException)))
      throw ((RuntimeException)localThrowable);
    label114: throw JsonMappingException.wrapWithPath(localThrowable, paramObject, paramString);
  }

  protected void wrapInstantiationProblem(Throwable paramThrowable, DeserializationContext paramDeserializationContext)
  {
    for (Throwable localThrowable = paramThrowable; ((localThrowable instanceof InvocationTargetException)) && (localThrowable.getCause() != null); localThrowable = localThrowable.getCause());
    if ((localThrowable instanceof Error))
      throw ((Error)localThrowable);
    if ((paramDeserializationContext == null) || (paramDeserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)));
    for (int i = 1; (localThrowable instanceof IOException); i = 0)
      throw ((IOException)localThrowable);
    if ((i == 0) && ((localThrowable instanceof RuntimeException)))
      throw ((RuntimeException)localThrowable);
    throw paramDeserializationContext.instantiationException(this._beanType.getRawClass(), localThrowable);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.BeanDeserializerBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
