package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty.Std;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.JacksonDeserializers;
import com.fasterxml.jackson.databind.deser.std.JdkDeserializers;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.Annotated;;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public abstract class BasicDeserializerFactory extends DeserializerFactory
  implements Serializable
{
  protected static final HashMap<JavaType, JsonDeserializer<Object>> _arrayDeserializers;
  static final HashMap<String, Class<? extends Collection>> _collectionFallbacks;
  protected static final HashMap<JavaType, KeyDeserializer> _keyDeserializers;
  static final HashMap<String, Class<? extends Map>> _mapFallbacks;
  protected static final HashMap<ClassKey, JsonDeserializer<Object>> _simpleDeserializers = new HashMap();
  private static final long serialVersionUID = 1L;
  protected final DeserializerFactoryConfig _factoryConfig;
  protected OptionalHandlerFactory optionalHandlers = OptionalHandlerFactory.instance;

  static
  {
    _arrayDeserializers = PrimitiveArrayDeserializers.getAll();
    _keyDeserializers = StdKeyDeserializers.constructAll();
    _add(_simpleDeserializers, Object.class, new UntypedObjectDeserializer());
    StringDeserializer localStringDeserializer = new StringDeserializer();
    _add(_simpleDeserializers, String.class, localStringDeserializer);
    _add(_simpleDeserializers, CharSequence.class, localStringDeserializer);
    _add(_simpleDeserializers, NumberDeserializers.all());
    _add(_simpleDeserializers, DateDeserializers.all());
    _add(_simpleDeserializers, JdkDeserializers.all());
    _add(_simpleDeserializers, JacksonDeserializers.all());
    HashMap localHashMap1 = new HashMap();
    _mapFallbacks = localHashMap1;
    localHashMap1.put(Map.class.getName(), LinkedHashMap.class);
    _mapFallbacks.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
    _mapFallbacks.put(SortedMap.class.getName(), TreeMap.class);
    _mapFallbacks.put("java.util.NavigableMap", TreeMap.class);
    try
    {
      Class localClass1 = Class.forName("java.util.concurrent.ConcurrentNavigableMap");
      Class localClass2 = Class.forName("java.util.concurrent.ConcurrentSkipListMap");
      _mapFallbacks.put(localClass1.getName(), localClass2);
      label190: HashMap localHashMap2 = new HashMap();
      _collectionFallbacks = localHashMap2;
      localHashMap2.put(Collection.class.getName(), ArrayList.class);
      _collectionFallbacks.put(List.class.getName(), ArrayList.class);
      _collectionFallbacks.put(Set.class.getName(), HashSet.class);
      _collectionFallbacks.put(SortedSet.class.getName(), TreeSet.class);
      _collectionFallbacks.put(Queue.class.getName(), LinkedList.class);
      _collectionFallbacks.put("java.util.Deque", LinkedList.class);
      _collectionFallbacks.put("java.util.NavigableSet", TreeSet.class);
      return;
    }
    catch (SecurityException localSecurityException)
    {
      break label190;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      break label190;
    }
  }

  protected BasicDeserializerFactory(DeserializerFactoryConfig paramDeserializerFactoryConfig)
  {
    this._factoryConfig = paramDeserializerFactoryConfig;
  }

  private static void _add(Map<ClassKey, JsonDeserializer<Object>> paramMap, Class<?> paramClass, StdDeserializer<?> paramStdDeserializer)
  {
    paramMap.put(new ClassKey(paramClass), paramStdDeserializer);
  }

  private static void _add(Map<ClassKey, JsonDeserializer<Object>> paramMap, StdDeserializer<?>[] paramArrayOfStdDeserializer)
  {
    int i = paramArrayOfStdDeserializer.length;
    for (int j = 0; j < i; j++)
    {
      StdDeserializer<?> localStdDeserializer = paramArrayOfStdDeserializer[j];
      _add(paramMap, localStdDeserializer.getValueClass(), localStdDeserializer);
    }
  }

  private KeyDeserializer _createEnumKeyDeserializer(DeserializationContext paramDeserializationContext, JavaType paramJavaType)
  {
    DeserializationConfig localDeserializationConfig = paramDeserializationContext.getConfig();
    BeanDescription localBeanDescription = localDeserializationConfig.introspect(paramJavaType);
    JsonDeserializer localJsonDeserializer = findDeserializerFromAnnotation(paramDeserializationContext, localBeanDescription.getClassInfo());
    if (localJsonDeserializer != null)
      return StdKeyDeserializers.constructDelegatingKeyDeserializer(localDeserializationConfig, paramJavaType, localJsonDeserializer);
    Class localClass = paramJavaType.getRawClass();
    if (_findCustomEnumDeserializer(localClass, localDeserializationConfig, localBeanDescription) != null)
      return StdKeyDeserializers.constructDelegatingKeyDeserializer(localDeserializationConfig, paramJavaType, localJsonDeserializer);
    EnumResolver localEnumResolver = constructEnumResolver(localClass, localDeserializationConfig, localBeanDescription.findJsonValueMethod());
    Iterator localIterator = localBeanDescription.getFactoryMethods().iterator();
    while (localIterator.hasNext())
    {
      AnnotatedMethod localAnnotatedMethod = (AnnotatedMethod)localIterator.next();
      if (localDeserializationConfig.getAnnotationIntrospector().hasCreatorAnnotation(localAnnotatedMethod))
      {
        if ((localAnnotatedMethod.getParameterCount() == 1) && (localAnnotatedMethod.getRawReturnType().isAssignableFrom(localClass)))
        {
          if (localAnnotatedMethod.getGenericParameterType(0) != String.class)
            throw new IllegalArgumentException("Parameter #0 type for factory method (" + localAnnotatedMethod + ") not suitable, must be java.lang.String");
          if (localDeserializationConfig.canOverrideAccessModifiers())
            ClassUtil.checkAndFixAccess(localAnnotatedMethod.getMember());
          return StdKeyDeserializers.constructEnumKeyDeserializer(localEnumResolver, localAnnotatedMethod);
        }
        throw new IllegalArgumentException("Unsuitable method (" + localAnnotatedMethod + ") decorated with @JsonCreator (for Enum type " + localClass.getName() + ")");
      }
    }
    return StdKeyDeserializers.constructEnumKeyDeserializer(localEnumResolver);
  }

  private ValueInstantiator _findStdValueInstantiator(DeserializationConfig paramDeserializationConfig, BeanDescription paramBeanDescription)
  {
    return JacksonDeserializers.findValueInstantiator(paramDeserializationConfig, paramBeanDescription);
  }

  private JavaType _mapAbstractType2(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType)
  {
    Class localClass = paramJavaType.getRawClass();
    if (this._factoryConfig.hasAbstractTypeResolvers())
    {
      Iterator localIterator = this._factoryConfig.abstractTypeResolvers().iterator();
      while (localIterator.hasNext())
      {
        JavaType localJavaType = ((AbstractTypeResolver)localIterator.next()).findTypeMapping(paramDeserializationConfig, paramJavaType);
        if ((localJavaType != null) && (localJavaType.getRawClass() != localClass))
          return localJavaType;
      }
    }
    return null;
  }

  protected void _addDeserializerConstructors(DeserializationContext paramDeserializationContext, BeanDescription paramBeanDescription, VisibilityChecker<?> paramVisibilityChecker, AnnotationIntrospector paramAnnotationIntrospector, CreatorCollector paramCreatorCollector)
  {
    AnnotatedConstructor localAnnotatedConstructor1 = paramBeanDescription.findDefaultConstructor();
    if ((localAnnotatedConstructor1 != null) && ((!paramCreatorCollector.hasDefaultCreator()) || (paramAnnotationIntrospector.hasCreatorAnnotation(localAnnotatedConstructor1))))
      paramCreatorCollector.setDefaultCreator(localAnnotatedConstructor1);
    Iterator localIterator = paramBeanDescription.getConstructors().iterator();
    while (localIterator.hasNext())
    {
      AnnotatedConstructor localAnnotatedConstructor2 = (AnnotatedConstructor)localIterator.next();
      int i = localAnnotatedConstructor2.getParameterCount();
      boolean bool1 = paramAnnotationIntrospector.hasCreatorAnnotation(localAnnotatedConstructor2);
      boolean bool2 = paramVisibilityChecker.isCreatorVisible(localAnnotatedConstructor2);
      if (i == 1)
      {
        _handleSingleArgumentConstructor(paramDeserializationContext, paramBeanDescription, paramVisibilityChecker, paramAnnotationIntrospector, paramCreatorCollector, localAnnotatedConstructor2, bool1, bool2);
      }
      else if ((bool1) || (bool2))
      {
        Object localObject1 = null;
        int j = 0;
        int k = 0;
        CreatorProperty[] arrayOfCreatorProperty = new CreatorProperty[i];
        int m = 0;
        if (m < i)
        {
          Object localObject2 = localAnnotatedConstructor2.getParameter(m);
          PropertyName localPropertyName;
          label175: String str;
          label183: Object localObject3;
          if (localObject2 == null)
          {
            localPropertyName = null;
            if (localPropertyName != null)
              break label253;
            str = null;
            localObject3 = paramAnnotationIntrospector.findInjectableValueId((AnnotatedMember)localObject2);
            if ((str == null) || (str.length() <= 0))
              break label263;
            j++;
            arrayOfCreatorProperty[m] = constructCreatorProperty(paramDeserializationContext, paramBeanDescription, str, m, (AnnotatedParameter)localObject2, localObject3);
            localObject2 = localObject1;
          }
          while (true)
          {
            m++;
            localObject1 = localObject2;
            break;
            localPropertyName = paramAnnotationIntrospector.findNameForDeserialization((Annotated)localObject2);
            break label175;
            label253: str = localPropertyName.getSimpleName();
            break label183;
            label263: if (localObject3 != null)
            {
              k++;
              arrayOfCreatorProperty[m] = constructCreatorProperty(paramDeserializationContext, paramBeanDescription, str, m, (AnnotatedParameter)localObject2, localObject3);
              localObject2 = localObject1;
            }
            else if (localObject1 != null)
            {
              localObject2 = localObject1;
            }
          }
        }
        if ((bool1) || (j > 0) || (k > 0))
          if (j + k == i)
            paramCreatorCollector.addPropertyCreator(localAnnotatedConstructor2, arrayOfCreatorProperty);
          else if ((j == 0) && (k + 1 == i))
            paramCreatorCollector.addDelegatingCreator(localAnnotatedConstructor2, arrayOfCreatorProperty);
          else
            throw new IllegalArgumentException("Argument #" + localObject1.getIndex() + " of constructor " + localAnnotatedConstructor2 + " has no property name annotation; must have name when multiple-paramater constructor annotated as Creator");
      }
    }
  }

  protected void _addDeserializerFactoryMethods(DeserializationContext paramDeserializationContext, BeanDescription paramBeanDescription, VisibilityChecker<?> paramVisibilityChecker, AnnotationIntrospector paramAnnotationIntrospector, CreatorCollector paramCreatorCollector)
  {
    DeserializationConfig localDeserializationConfig = paramDeserializationContext.getConfig();
    Iterator localIterator = paramBeanDescription.getFactoryMethods().iterator();
    while (localIterator.hasNext())
    {
      AnnotatedMethod localAnnotatedMethod = (AnnotatedMethod)localIterator.next();
      boolean bool = paramAnnotationIntrospector.hasCreatorAnnotation(localAnnotatedMethod);
      int i = localAnnotatedMethod.getParameterCount();
      if (i == 0)
      {
        if (bool)
          paramCreatorCollector.setDefaultCreator(localAnnotatedMethod);
      }
      else
      {
        if (i == 1)
        {
          AnnotatedParameter localAnnotatedParameter = localAnnotatedMethod.getParameter(0);
          PropertyName localPropertyName2;
          if (localAnnotatedParameter == null)
          {
            localPropertyName2 = null;
            label97: if (localPropertyName2 != null)
              break label160;
          }
          label160: for (String str2 = null; ; str2 = localPropertyName2.getSimpleName())
          {
            if ((paramAnnotationIntrospector.findInjectableValueId(localAnnotatedParameter) != null) || ((str2 != null) && (str2.length() != 0)))
              break label180;
            _handleSingleArgumentFactory(localDeserializationConfig, paramBeanDescription, paramVisibilityChecker, paramAnnotationIntrospector, paramCreatorCollector, localAnnotatedMethod, bool);
            break;
            localPropertyName2 = paramAnnotationIntrospector.findNameForDeserialization(localAnnotatedParameter);
            break label97;
          }
        }
        if (paramAnnotationIntrospector.hasCreatorAnnotation(localAnnotatedMethod))
        {
          label180: Object localObject1 = null;
          CreatorProperty[] arrayOfCreatorProperty = new CreatorProperty[i];
          int j = 0;
          int k = 0;
          int m = 0;
          if (m < i)
          {
            Object localObject2 = localAnnotatedMethod.getParameter(m);
            PropertyName localPropertyName1;
            label223: String str1;
            label231: Object localObject3;
            if (localObject2 == null)
            {
              localPropertyName1 = null;
              if (localPropertyName1 != null)
                break label301;
              str1 = null;
              localObject3 = paramAnnotationIntrospector.findInjectableValueId((AnnotatedMember)localObject2);
              if ((str1 == null) || (str1.length() <= 0))
                break label311;
              j++;
              arrayOfCreatorProperty[m] = constructCreatorProperty(paramDeserializationContext, paramBeanDescription, str1, m, (AnnotatedParameter)localObject2, localObject3);
              localObject2 = localObject1;
            }
            while (true)
            {
              m++;
              localObject1 = localObject2;
              break;
              localPropertyName1 = paramAnnotationIntrospector.findNameForDeserialization((Annotated)localObject2);
              break label223;
              label301: str1 = localPropertyName1.getSimpleName();
              break label231;
              label311: if (localObject3 != null)
              {
                k++;
                arrayOfCreatorProperty[m] = constructCreatorProperty(paramDeserializationContext, paramBeanDescription, str1, m, (AnnotatedParameter)localObject2, localObject3);
                localObject2 = localObject1;
              }
              else if (localObject1 != null)
              {
                localObject2 = localObject1;
              }
            }
          }
          if ((bool) || (j > 0) || (k > 0))
            if (j + k == i)
              paramCreatorCollector.addPropertyCreator(localAnnotatedMethod, arrayOfCreatorProperty);
            else if ((j == 0) && (k + 1 == i))
              paramCreatorCollector.addDelegatingCreator(localAnnotatedMethod, arrayOfCreatorProperty);
            else
              throw new IllegalArgumentException("Argument #" + localObject1.getIndex() + " of factory method " + localAnnotatedMethod + " has no property name annotation; must have name when multiple-paramater constructor annotated as Creator");
        }
      }
    }
  }

  protected ValueInstantiator _constructDefaultValueInstantiator(DeserializationContext paramDeserializationContext, BeanDescription paramBeanDescription)
  {
    CreatorCollector localCreatorCollector = new CreatorCollector(paramBeanDescription, paramDeserializationContext.canOverrideAccessModifiers());
    AnnotationIntrospector localAnnotationIntrospector = paramDeserializationContext.getAnnotationIntrospector();
    DeserializationConfig localDeserializationConfig = paramDeserializationContext.getConfig();
    VisibilityChecker localVisibilityChecker1 = localDeserializationConfig.getDefaultVisibilityChecker();
    VisibilityChecker localVisibilityChecker2 = localAnnotationIntrospector.findAutoDetectVisibility(paramBeanDescription.getClassInfo(), localVisibilityChecker1);
    _addDeserializerFactoryMethods(paramDeserializationContext, paramBeanDescription, localVisibilityChecker2, localAnnotationIntrospector, localCreatorCollector);
    if (paramBeanDescription.getType().isConcrete())
      _addDeserializerConstructors(paramDeserializationContext, paramBeanDescription, localVisibilityChecker2, localAnnotationIntrospector, localCreatorCollector);
    return localCreatorCollector.constructValueInstantiator(localDeserializationConfig);
  }

  protected JsonDeserializer<?> _findCustomArrayDeserializer(ArrayType paramArrayType, DeserializationConfig paramDeserializationConfig, BeanDescription paramBeanDescription, TypeDeserializer paramTypeDeserializer, JsonDeserializer<?> paramJsonDeserializer)
  {
    Iterator localIterator = this._factoryConfig.deserializers().iterator();
    while (localIterator.hasNext())
    {
      JsonDeserializer localJsonDeserializer = ((Deserializers)localIterator.next()).findArrayDeserializer(paramArrayType, paramDeserializationConfig, paramBeanDescription, paramTypeDeserializer, paramJsonDeserializer);
      if (localJsonDeserializer != null)
        return localJsonDeserializer;
    }
    return null;
  }

  protected JsonDeserializer<?> _findCustomCollectionDeserializer(CollectionType paramCollectionType, DeserializationConfig paramDeserializationConfig, BeanDescription paramBeanDescription, TypeDeserializer paramTypeDeserializer, JsonDeserializer<?> paramJsonDeserializer)
  {
    Iterator localIterator = this._factoryConfig.deserializers().iterator();
    while (localIterator.hasNext())
    {
      JsonDeserializer localJsonDeserializer = ((Deserializers)localIterator.next()).findCollectionDeserializer(paramCollectionType, paramDeserializationConfig, paramBeanDescription, paramTypeDeserializer, paramJsonDeserializer);
      if (localJsonDeserializer != null)
        return localJsonDeserializer;
    }
    return null;
  }

  protected JsonDeserializer<?> _findCustomCollectionLikeDeserializer(CollectionLikeType paramCollectionLikeType, DeserializationConfig paramDeserializationConfig, BeanDescription paramBeanDescription, TypeDeserializer paramTypeDeserializer, JsonDeserializer<?> paramJsonDeserializer)
  {
    Iterator localIterator = this._factoryConfig.deserializers().iterator();
    while (localIterator.hasNext())
    {
      JsonDeserializer localJsonDeserializer = ((Deserializers)localIterator.next()).findCollectionLikeDeserializer(paramCollectionLikeType, paramDeserializationConfig, paramBeanDescription, paramTypeDeserializer, paramJsonDeserializer);
      if (localJsonDeserializer != null)
        return localJsonDeserializer;
    }
    return null;
  }

  protected JsonDeserializer<?> _findCustomEnumDeserializer(Class<?> paramClass, DeserializationConfig paramDeserializationConfig, BeanDescription paramBeanDescription)
  {
    Iterator localIterator = this._factoryConfig.deserializers().iterator();
    while (localIterator.hasNext())
    {
      JsonDeserializer localJsonDeserializer = ((Deserializers)localIterator.next()).findEnumDeserializer(paramClass, paramDeserializationConfig, paramBeanDescription);
      if (localJsonDeserializer != null)
        return localJsonDeserializer;
    }
    return null;
  }

  protected JsonDeserializer<?> _findCustomMapDeserializer(MapType paramMapType, DeserializationConfig paramDeserializationConfig, BeanDescription paramBeanDescription, KeyDeserializer paramKeyDeserializer, TypeDeserializer paramTypeDeserializer, JsonDeserializer<?> paramJsonDeserializer)
  {
    Iterator localIterator = this._factoryConfig.deserializers().iterator();
    while (localIterator.hasNext())
    {
      JsonDeserializer localJsonDeserializer = ((Deserializers)localIterator.next()).findMapDeserializer(paramMapType, paramDeserializationConfig, paramBeanDescription, paramKeyDeserializer, paramTypeDeserializer, paramJsonDeserializer);
      if (localJsonDeserializer != null)
        return localJsonDeserializer;
    }
    return null;
  }

  protected JsonDeserializer<?> _findCustomMapLikeDeserializer(MapLikeType paramMapLikeType, DeserializationConfig paramDeserializationConfig, BeanDescription paramBeanDescription, KeyDeserializer paramKeyDeserializer, TypeDeserializer paramTypeDeserializer, JsonDeserializer<?> paramJsonDeserializer)
  {
    Iterator localIterator = this._factoryConfig.deserializers().iterator();
    while (localIterator.hasNext())
    {
      JsonDeserializer localJsonDeserializer = ((Deserializers)localIterator.next()).findMapLikeDeserializer(paramMapLikeType, paramDeserializationConfig, paramBeanDescription, paramKeyDeserializer, paramTypeDeserializer, paramJsonDeserializer);
      if (localJsonDeserializer != null)
        return localJsonDeserializer;
    }
    return null;
  }

  protected JsonDeserializer<?> _findCustomTreeNodeDeserializer(Class<? extends JsonNode> paramClass, DeserializationConfig paramDeserializationConfig, BeanDescription paramBeanDescription)
  {
    Iterator localIterator = this._factoryConfig.deserializers().iterator();
    while (localIterator.hasNext())
    {
      JsonDeserializer localJsonDeserializer = ((Deserializers)localIterator.next()).findTreeNodeDeserializer(paramClass, paramDeserializationConfig, paramBeanDescription);
      if (localJsonDeserializer != null)
        return localJsonDeserializer;
    }
    return null;
  }

  protected boolean _handleSingleArgumentConstructor(DeserializationContext paramDeserializationContext, BeanDescription paramBeanDescription, VisibilityChecker<?> paramVisibilityChecker, AnnotationIntrospector paramAnnotationIntrospector, CreatorCollector paramCreatorCollector, AnnotatedConstructor paramAnnotatedConstructor, boolean paramBoolean1, boolean paramBoolean2)
  {
    AnnotatedParameter localAnnotatedParameter = paramAnnotatedConstructor.getParameter(0);
    PropertyName localPropertyName;
    if (localAnnotatedParameter == null)
    {
      localPropertyName = null;
      if (localPropertyName != null)
        break label97;
    }
    label97: for (String str = null; ; str = localPropertyName.getSimpleName())
    {
      Object localObject = paramAnnotationIntrospector.findInjectableValueId(localAnnotatedParameter);
      if ((localObject == null) && ((str == null) || (str.length() <= 0)))
        break label107;
      CreatorProperty[] arrayOfCreatorProperty = new CreatorProperty[1];
      arrayOfCreatorProperty[0] = constructCreatorProperty(paramDeserializationContext, paramBeanDescription, str, 0, localAnnotatedParameter, localObject);
      paramCreatorCollector.addPropertyCreator(paramAnnotatedConstructor, arrayOfCreatorProperty);
      return true;
      localPropertyName = paramAnnotationIntrospector.findNameForDeserialization(localAnnotatedParameter);
      break;
    }
    label107: Class localClass = paramAnnotatedConstructor.getRawParameterType(0);
    if (localClass == String.class)
    {
      if ((paramBoolean1) || (paramBoolean2))
        paramCreatorCollector.addStringCreator(paramAnnotatedConstructor);
      return true;
    }
    if ((localClass == Integer.TYPE) || (localClass == Integer.class))
    {
      if ((paramBoolean1) || (paramBoolean2))
        paramCreatorCollector.addIntCreator(paramAnnotatedConstructor);
      return true;
    }
    if ((localClass == Long.TYPE) || (localClass == Long.class))
    {
      if ((paramBoolean1) || (paramBoolean2))
        paramCreatorCollector.addLongCreator(paramAnnotatedConstructor);
      return true;
    }
    if ((localClass == Double.TYPE) || (localClass == Double.class))
    {
      if ((paramBoolean1) || (paramBoolean2))
        paramCreatorCollector.addDoubleCreator(paramAnnotatedConstructor);
      return true;
    }
    if (paramBoolean1)
    {
      paramCreatorCollector.addDelegatingCreator(paramAnnotatedConstructor, null);
      return true;
    }
    return false;
  }

  protected boolean _handleSingleArgumentFactory(DeserializationConfig paramDeserializationConfig, BeanDescription paramBeanDescription, VisibilityChecker<?> paramVisibilityChecker, AnnotationIntrospector paramAnnotationIntrospector, CreatorCollector paramCreatorCollector, AnnotatedMethod paramAnnotatedMethod, boolean paramBoolean)
  {
    Class localClass = paramAnnotatedMethod.getRawParameterType(0);
    if (localClass == String.class)
      if ((paramBoolean) || (paramVisibilityChecker.isCreatorVisible(paramAnnotatedMethod)))
        paramCreatorCollector.addStringCreator(paramAnnotatedMethod);
    do
    {
      do
      {
        do
        {
          do
          {
            return true;
            if ((localClass != Integer.TYPE) && (localClass != Integer.class))
              break;
          }
          while ((!paramBoolean) && (!paramVisibilityChecker.isCreatorVisible(paramAnnotatedMethod)));
          paramCreatorCollector.addIntCreator(paramAnnotatedMethod);
          return true;
          if ((localClass != Long.TYPE) && (localClass != Long.class))
            break;
        }
        while ((!paramBoolean) && (!paramVisibilityChecker.isCreatorVisible(paramAnnotatedMethod)));
        paramCreatorCollector.addLongCreator(paramAnnotatedMethod);
        return true;
        if ((localClass != Double.TYPE) && (localClass != Double.class))
          break;
      }
      while ((!paramBoolean) && (!paramVisibilityChecker.isCreatorVisible(paramAnnotatedMethod)));
      paramCreatorCollector.addDoubleCreator(paramAnnotatedMethod);
      return true;
      if ((localClass != Boolean.TYPE) && (localClass != Boolean.class))
        break;
    }
    while ((!paramBoolean) && (!paramVisibilityChecker.isCreatorVisible(paramAnnotatedMethod)));
    paramCreatorCollector.addBooleanCreator(paramAnnotatedMethod);
    return true;
    if (paramAnnotationIntrospector.hasCreatorAnnotation(paramAnnotatedMethod))
    {
      paramCreatorCollector.addDelegatingCreator(paramAnnotatedMethod, null);
      return true;
    }
    return false;
  }

  public ValueInstantiator _valueInstantiatorInstance(DeserializationConfig paramDeserializationConfig, Annotated paramAnnotated, Object paramObject)
  {
    if (paramObject == null)
      return null;
    if ((paramObject instanceof ValueInstantiator))
      return (ValueInstantiator)paramObject;
    if (!(paramObject instanceof Class))
      throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + paramObject.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
    Class localClass = (Class)paramObject;
    if (localClass == NoClass.class)
      return null;
    if (!ValueInstantiator.class.isAssignableFrom(localClass))
      throw new IllegalStateException("AnnotationIntrospector returned Class " + localClass.getName() + "; expected Class<ValueInstantiator>");
    HandlerInstantiator localHandlerInstantiator = paramDeserializationConfig.getHandlerInstantiator();
    if (localHandlerInstantiator != null)
    {
      ValueInstantiator localValueInstantiator = localHandlerInstantiator.valueInstantiatorInstance(paramDeserializationConfig, paramAnnotated, localClass);
      if (localValueInstantiator != null)
        return localValueInstantiator;
    }
    return (ValueInstantiator)ClassUtil.createInstance(localClass, paramDeserializationConfig.canOverrideAccessModifiers());
  }

  protected CreatorProperty constructCreatorProperty(DeserializationContext paramDeserializationContext, BeanDescription paramBeanDescription, String paramString, int paramInt, AnnotatedParameter paramAnnotatedParameter, Object paramObject)
  {
    DeserializationConfig localDeserializationConfig = paramDeserializationContext.getConfig();
    JavaType localJavaType1 = localDeserializationConfig.getTypeFactory().constructType(paramAnnotatedParameter.getParameterType(), paramBeanDescription.bindingsForBeanType());
    BeanProperty.Std localStd = new BeanProperty.Std(paramString, localJavaType1, paramBeanDescription.getClassAnnotations(), paramAnnotatedParameter);
    JavaType localJavaType2 = resolveType(paramDeserializationContext, paramBeanDescription, localJavaType1, paramAnnotatedParameter);
    if (localJavaType2 != localJavaType1)
      localStd.withType(localJavaType2);
    JsonDeserializer localJsonDeserializer = findDeserializerFromAnnotation(paramDeserializationContext, paramAnnotatedParameter);
    JavaType localJavaType3 = modifyTypeByAnnotation(paramDeserializationContext, paramAnnotatedParameter, localJavaType2);
    TypeDeserializer localTypeDeserializer1 = (TypeDeserializer)localJavaType3.getTypeHandler();
    if (localTypeDeserializer1 == null);
    for (TypeDeserializer localTypeDeserializer2 = findTypeDeserializer(localDeserializationConfig, localJavaType3); ; localTypeDeserializer2 = localTypeDeserializer1)
    {
      CreatorProperty localCreatorProperty = new CreatorProperty(paramString, localJavaType3, localTypeDeserializer2, paramBeanDescription.getClassAnnotations(), paramAnnotatedParameter, paramInt, paramObject);
      if (localJsonDeserializer != null)
        localCreatorProperty = localCreatorProperty.withValueDeserializer(localJsonDeserializer);
      return localCreatorProperty;
    }
  }

  protected EnumResolver<?> constructEnumResolver(Class<?> paramClass, DeserializationConfig paramDeserializationConfig, AnnotatedMethod paramAnnotatedMethod)
  {
    if (paramAnnotatedMethod != null)
    {
      Method localMethod = paramAnnotatedMethod.getAnnotated();
      if (paramDeserializationConfig.canOverrideAccessModifiers())
        ClassUtil.checkAndFixAccess(localMethod);
      return EnumResolver.constructUnsafeUsingMethod(paramClass, localMethod);
    }
    if (paramDeserializationConfig.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING))
      return EnumResolver.constructUnsafeUsingToString(paramClass);
    return EnumResolver.constructUnsafe(paramClass, paramDeserializationConfig.getAnnotationIntrospector());
  }

  public JsonDeserializer<?> createArrayDeserializer(DeserializationContext paramDeserializationContext, ArrayType paramArrayType, BeanDescription paramBeanDescription)
  {
    JavaType localJavaType = paramArrayType.getContentType();
    JsonDeserializer localJsonDeserializer1 = (JsonDeserializer)localJavaType.getValueHandler();
    Object localObject;
    if (localJsonDeserializer1 == null)
    {
      localObject = (JsonDeserializer)_arrayDeserializers.get(localJavaType);
      if (localObject != null)
      {
        JsonDeserializer localJsonDeserializer2 = _findCustomArrayDeserializer(paramArrayType, paramDeserializationContext.getConfig(), paramBeanDescription, null, localJsonDeserializer1);
        if (localJsonDeserializer2 != null)
          localObject = localJsonDeserializer2;
        return localObject;
      }
      if (localJavaType.isPrimitive())
        throw new IllegalArgumentException("Internal error: primitive type (" + paramArrayType + ") passed, no array deserializer found");
    }
    TypeDeserializer localTypeDeserializer1 = (TypeDeserializer)localJavaType.getTypeHandler();
    if (localTypeDeserializer1 == null);
    for (TypeDeserializer localTypeDeserializer2 = findTypeDeserializer(paramDeserializationContext.getConfig(), localJavaType); ; localTypeDeserializer2 = localTypeDeserializer1)
    {
      localObject = _findCustomArrayDeserializer(paramArrayType, paramDeserializationContext.getConfig(), paramBeanDescription, localTypeDeserializer2, localJsonDeserializer1);
      if (localObject != null)
        break;
      return new ObjectArrayDeserializer(paramArrayType, localJsonDeserializer1, localTypeDeserializer2);
    }
  }

  public JsonDeserializer<?> createCollectionDeserializer(DeserializationContext paramDeserializationContext, CollectionType paramCollectionType, BeanDescription paramBeanDescription)
  {
    JavaType localJavaType = paramCollectionType.getContentType();
    JsonDeserializer localJsonDeserializer1 = (JsonDeserializer)localJavaType.getValueHandler();
    TypeDeserializer localTypeDeserializer1 = (TypeDeserializer)localJavaType.getTypeHandler();
    if (localTypeDeserializer1 == null);
    for (TypeDeserializer localTypeDeserializer2 = findTypeDeserializer(paramDeserializationContext.getConfig(), localJavaType); ; localTypeDeserializer2 = localTypeDeserializer1)
    {
      DeserializationConfig localDeserializationConfig = paramDeserializationContext.getConfig();
      JsonDeserializer localJsonDeserializer2 = _findCustomCollectionDeserializer(paramCollectionType, localDeserializationConfig, paramBeanDescription, localTypeDeserializer2, localJsonDeserializer1);
      if (localJsonDeserializer2 != null)
        return localJsonDeserializer2;
      Class localClass1 = paramCollectionType.getRawClass();
      if ((localJsonDeserializer1 == null) && (EnumSet.class.isAssignableFrom(localClass1)))
        return new EnumSetDeserializer(localJavaType, null);
      if ((paramCollectionType.isInterface()) || (paramCollectionType.isAbstract()))
      {
        Class localClass2 = (Class)_collectionFallbacks.get(localClass1.getName());
        if (localClass2 == null)
          throw new IllegalArgumentException("Can not find a deserializer for non-concrete Collection type " + paramCollectionType);
        CollectionType localCollectionType = (CollectionType)paramDeserializationContext.getConfig().constructSpecializedType(paramCollectionType, localClass2);
        paramBeanDescription = paramDeserializationContext.getConfig().introspectForCreation(localCollectionType);
        paramCollectionType = localCollectionType;
      }
      ValueInstantiator localValueInstantiator = findValueInstantiator(paramDeserializationContext, paramBeanDescription);
      if (localJavaType.getRawClass() == String.class)
        return new StringCollectionDeserializer(paramCollectionType, localJsonDeserializer1, localValueInstantiator);
      return new CollectionDeserializer(paramCollectionType, localJsonDeserializer1, localTypeDeserializer2, localValueInstantiator);
    }
  }

  public JsonDeserializer<?> createCollectionLikeDeserializer(DeserializationContext paramDeserializationContext, CollectionLikeType paramCollectionLikeType, BeanDescription paramBeanDescription)
  {
    JavaType localJavaType = paramCollectionLikeType.getContentType();
    JsonDeserializer localJsonDeserializer = (JsonDeserializer)localJavaType.getValueHandler();
    TypeDeserializer localTypeDeserializer1 = (TypeDeserializer)localJavaType.getTypeHandler();
    if (localTypeDeserializer1 == null);
    for (TypeDeserializer localTypeDeserializer2 = findTypeDeserializer(paramDeserializationContext.getConfig(), localJavaType); ; localTypeDeserializer2 = localTypeDeserializer1)
      return _findCustomCollectionLikeDeserializer(paramCollectionLikeType, paramDeserializationContext.getConfig(), paramBeanDescription, localTypeDeserializer2, localJsonDeserializer);
  }

  public JsonDeserializer<?> createEnumDeserializer(DeserializationContext paramDeserializationContext, JavaType paramJavaType, BeanDescription paramBeanDescription)
  {
    Class localClass = paramJavaType.getRawClass();
    JsonDeserializer localJsonDeserializer = _findCustomEnumDeserializer(localClass, paramDeserializationContext.getConfig(), paramBeanDescription);
    if (localJsonDeserializer != null)
      return localJsonDeserializer;
    Iterator localIterator = paramBeanDescription.getFactoryMethods().iterator();
    while (localIterator.hasNext())
    {
      AnnotatedMethod localAnnotatedMethod = (AnnotatedMethod)localIterator.next();
      if (paramDeserializationContext.getAnnotationIntrospector().hasCreatorAnnotation(localAnnotatedMethod))
      {
        if ((localAnnotatedMethod.getParameterCount() == 1) && (localAnnotatedMethod.getRawReturnType().isAssignableFrom(localClass)))
          return EnumDeserializer.deserializerForCreator(paramDeserializationContext.getConfig(), localClass, localAnnotatedMethod);
        throw new IllegalArgumentException("Unsuitable method (" + localAnnotatedMethod + ") decorated with @JsonCreator (for Enum type " + localClass.getName() + ")");
      }
    }
    return new EnumDeserializer(constructEnumResolver(localClass, paramDeserializationContext.getConfig(), paramBeanDescription.findJsonValueMethod()));
  }

  public KeyDeserializer createKeyDeserializer(DeserializationContext paramDeserializationContext, JavaType paramJavaType)
  {
    DeserializationConfig localDeserializationConfig = paramDeserializationContext.getConfig();
    KeyDeserializer localKeyDeserializer;
    if (this._factoryConfig.hasKeyDeserializers())
    {
      BeanDescription localBeanDescription = localDeserializationConfig.introspectClassAnnotations(paramJavaType.getRawClass());
      Iterator localIterator = this._factoryConfig.keyDeserializers().iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localKeyDeserializer = ((KeyDeserializers)localIterator.next()).findKeyDeserializer(paramJavaType, localDeserializationConfig, localBeanDescription);
      }
      while (localKeyDeserializer == null);
    }
    do
    {
      return localKeyDeserializer;
      Class localClass = paramJavaType.getRawClass();
      if ((localClass == String.class) || (localClass == Object.class))
        return StdKeyDeserializers.constructStringKeyDeserializer(localDeserializationConfig, paramJavaType);
      localKeyDeserializer = (KeyDeserializer)_keyDeserializers.get(paramJavaType);
    }
    while (localKeyDeserializer != null);
    if (paramJavaType.isEnumType())
      return _createEnumKeyDeserializer(paramDeserializationContext, paramJavaType);
    return StdKeyDeserializers.findStringBasedKeyDeserializer(localDeserializationConfig, paramJavaType);
  }

  public JsonDeserializer<?> createMapDeserializer(DeserializationContext paramDeserializationContext, MapType paramMapType, BeanDescription paramBeanDescription)
  {
    DeserializationConfig localDeserializationConfig = paramDeserializationContext.getConfig();
    JavaType localJavaType1 = paramMapType.getKeyType();
    JavaType localJavaType2 = paramMapType.getContentType();
    JsonDeserializer localJsonDeserializer1 = (JsonDeserializer)localJavaType2.getValueHandler();
    KeyDeserializer localKeyDeserializer = (KeyDeserializer)localJavaType1.getValueHandler();
    TypeDeserializer localTypeDeserializer1 = (TypeDeserializer)localJavaType2.getTypeHandler();
    if (localTypeDeserializer1 == null);
    for (TypeDeserializer localTypeDeserializer2 = findTypeDeserializer(localDeserializationConfig, localJavaType2); ; localTypeDeserializer2 = localTypeDeserializer1)
    {
      JsonDeserializer localJsonDeserializer2 = _findCustomMapDeserializer(paramMapType, localDeserializationConfig, paramBeanDescription, localKeyDeserializer, localTypeDeserializer2, localJsonDeserializer1);
      if (localJsonDeserializer2 != null)
        return localJsonDeserializer2;
      Class localClass1 = paramMapType.getRawClass();
      if (EnumMap.class.isAssignableFrom(localClass1))
      {
        Class localClass3 = localJavaType1.getRawClass();
        if ((localClass3 == null) || (!localClass3.isEnum()))
          throw new IllegalArgumentException("Can not construct EnumMap; generic (key) type not available");
        return new EnumMapDeserializer(paramMapType, null, localJsonDeserializer1, localTypeDeserializer2);
      }
      MapType localMapType1;
      if ((paramMapType.isInterface()) || (paramMapType.isAbstract()))
      {
        Class localClass2 = (Class)_mapFallbacks.get(localClass1.getName());
        if (localClass2 == null)
          throw new IllegalArgumentException("Can not find a deserializer for non-concrete Map type " + paramMapType);
        localMapType1 = (MapType)localDeserializationConfig.constructSpecializedType(paramMapType, localClass2);
        paramBeanDescription = localDeserializationConfig.introspectForCreation(localMapType1);
      }
      for (MapType localMapType2 = localMapType1; ; localMapType2 = paramMapType)
      {
        MapDeserializer localMapDeserializer = new MapDeserializer(localMapType2, findValueInstantiator(paramDeserializationContext, paramBeanDescription), localKeyDeserializer, localJsonDeserializer1, localTypeDeserializer2);
        localMapDeserializer.setIgnorableProperties(localDeserializationConfig.getAnnotationIntrospector().findPropertiesToIgnore(paramBeanDescription.getClassInfo()));
        return localMapDeserializer;
      }
    }
  }

  public JsonDeserializer<?> createMapLikeDeserializer(DeserializationContext paramDeserializationContext, MapLikeType paramMapLikeType, BeanDescription paramBeanDescription)
  {
    JavaType localJavaType1 = paramMapLikeType.getKeyType();
    JavaType localJavaType2 = paramMapLikeType.getContentType();
    JsonDeserializer localJsonDeserializer = (JsonDeserializer)localJavaType2.getValueHandler();
    KeyDeserializer localKeyDeserializer = (KeyDeserializer)localJavaType1.getValueHandler();
    TypeDeserializer localTypeDeserializer1 = (TypeDeserializer)localJavaType2.getTypeHandler();
    if (localTypeDeserializer1 == null);
    for (TypeDeserializer localTypeDeserializer2 = findTypeDeserializer(paramDeserializationContext.getConfig(), localJavaType2); ; localTypeDeserializer2 = localTypeDeserializer1)
      return _findCustomMapLikeDeserializer(paramMapLikeType, paramDeserializationContext.getConfig(), paramBeanDescription, localKeyDeserializer, localTypeDeserializer2, localJsonDeserializer);
  }

  public JsonDeserializer<?> createTreeDeserializer(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType, BeanDescription paramBeanDescription)
  {
    Class localClass = paramJavaType.getRawClass();
    JsonDeserializer localJsonDeserializer = _findCustomTreeNodeDeserializer(localClass, paramDeserializationConfig, paramBeanDescription);
    if (localJsonDeserializer != null)
      return localJsonDeserializer;
    return JsonNodeDeserializer.getDeserializer(localClass);
  }

  protected JsonDeserializer<Object> findDeserializerFromAnnotation(DeserializationContext paramDeserializationContext, Annotated paramAnnotated)
  {
    Object localObject = paramDeserializationContext.getAnnotationIntrospector().findDeserializer(paramAnnotated);
    if (localObject == null)
      return null;
    return paramDeserializationContext.deserializerInstance(paramAnnotated, localObject);
  }

  public TypeDeserializer findPropertyContentTypeDeserializer(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType, AnnotatedMember paramAnnotatedMember)
  {
    AnnotationIntrospector localAnnotationIntrospector = paramDeserializationConfig.getAnnotationIntrospector();
    TypeResolverBuilder localTypeResolverBuilder = localAnnotationIntrospector.findPropertyContentTypeResolver(paramDeserializationConfig, paramAnnotatedMember, paramJavaType);
    JavaType localJavaType = paramJavaType.getContentType();
    if (localTypeResolverBuilder == null)
      return findTypeDeserializer(paramDeserializationConfig, localJavaType);
    return localTypeResolverBuilder.buildTypeDeserializer(paramDeserializationConfig, localJavaType, paramDeserializationConfig.getSubtypeResolver().collectAndResolveSubtypes(paramAnnotatedMember, paramDeserializationConfig, localAnnotationIntrospector, localJavaType));
  }

  public TypeDeserializer findPropertyTypeDeserializer(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType, AnnotatedMember paramAnnotatedMember)
  {
    AnnotationIntrospector localAnnotationIntrospector = paramDeserializationConfig.getAnnotationIntrospector();
    TypeResolverBuilder localTypeResolverBuilder = localAnnotationIntrospector.findPropertyTypeResolver(paramDeserializationConfig, paramAnnotatedMember, paramJavaType);
    if (localTypeResolverBuilder == null)
      return findTypeDeserializer(paramDeserializationConfig, paramJavaType);
    return localTypeResolverBuilder.buildTypeDeserializer(paramDeserializationConfig, paramJavaType, paramDeserializationConfig.getSubtypeResolver().collectAndResolveSubtypes(paramAnnotatedMember, paramDeserializationConfig, localAnnotationIntrospector, paramJavaType));
  }

  public TypeDeserializer findTypeDeserializer(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType)
  {
    AnnotatedClass localAnnotatedClass = paramDeserializationConfig.introspectClassAnnotations(paramJavaType.getRawClass()).getClassInfo();
    AnnotationIntrospector localAnnotationIntrospector = paramDeserializationConfig.getAnnotationIntrospector();
    TypeResolverBuilder localTypeResolverBuilder = localAnnotationIntrospector.findTypeResolver(paramDeserializationConfig, localAnnotatedClass, paramJavaType);
    Collection localCollection;
    if (localTypeResolverBuilder == null)
    {
      localTypeResolverBuilder = paramDeserializationConfig.getDefaultTyper(paramJavaType);
      localCollection = null;
      if (localTypeResolverBuilder == null)
        return null;
    }
    else
    {
      localCollection = paramDeserializationConfig.getSubtypeResolver().collectAndResolveSubtypes(localAnnotatedClass, paramDeserializationConfig, localAnnotationIntrospector);
    }
    if ((localTypeResolverBuilder.getDefaultImpl() == null) && (paramJavaType.isAbstract()))
    {
      JavaType localJavaType = mapAbstractType(paramDeserializationConfig, paramJavaType);
      if ((localJavaType != null) && (localJavaType.getRawClass() != paramJavaType.getRawClass()))
        localTypeResolverBuilder = localTypeResolverBuilder.defaultImpl(localJavaType.getRawClass());
    }
    return localTypeResolverBuilder.buildTypeDeserializer(paramDeserializationConfig, paramJavaType, localCollection);
  }

  public ValueInstantiator findValueInstantiator(DeserializationContext paramDeserializationContext, BeanDescription paramBeanDescription)
  {
    DeserializationConfig localDeserializationConfig = paramDeserializationContext.getConfig();
    AnnotatedClass localAnnotatedClass = paramBeanDescription.getClassInfo();
    Object localObject = paramDeserializationContext.getAnnotationIntrospector().findValueInstantiator(localAnnotatedClass);
    ValueInstantiator localValueInstantiator1 = null;
    if (localObject != null)
      localValueInstantiator1 = _valueInstantiatorInstance(localDeserializationConfig, localAnnotatedClass, localObject);
    if (localValueInstantiator1 == null)
    {
      localValueInstantiator1 = _findStdValueInstantiator(localDeserializationConfig, paramBeanDescription);
      if (localValueInstantiator1 == null)
        localValueInstantiator1 = _constructDefaultValueInstantiator(paramDeserializationContext, paramBeanDescription);
    }
    if (this._factoryConfig.hasValueInstantiators())
    {
      Iterator localIterator = this._factoryConfig.valueInstantiators().iterator();
      localValueInstantiator2 = localValueInstantiator1;
      ValueInstantiators localValueInstantiators;
      do
      {
        if (!localIterator.hasNext())
          break;
        localValueInstantiators = (ValueInstantiators)localIterator.next();
        localValueInstantiator2 = localValueInstantiators.findValueInstantiator(localDeserializationConfig, paramBeanDescription, localValueInstantiator2);
      }
      while (localValueInstantiator2 != null);
      throw new JsonMappingException("Broken registered ValueInstantiators (of type " + localValueInstantiators.getClass().getName() + "): returned null ValueInstantiator");
    }
    ValueInstantiator localValueInstantiator2 = localValueInstantiator1;
    return localValueInstantiator2;
  }

  public JavaType mapAbstractType(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType)
  {
    while (true)
    {
      JavaType localJavaType = _mapAbstractType2(paramDeserializationConfig, paramJavaType);
      if (localJavaType == null)
        return paramJavaType;
      Class localClass1 = paramJavaType.getRawClass();
      Class localClass2 = localJavaType.getRawClass();
      if ((localClass1 == localClass2) || (!localClass1.isAssignableFrom(localClass2)))
        throw new IllegalArgumentException("Invalid abstract type resolution from " + paramJavaType + " to " + localJavaType + ": latter is not a subtype of former");
      paramJavaType = localJavaType;
    }
  }

  // ERROR //
  protected <T extends JavaType> T modifyTypeByAnnotation(DeserializationContext paramDeserializationContext, Annotated paramAnnotated, T paramT)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 423	com/fasterxml/jackson/databind/DeserializationContext:getAnnotationIntrospector	()Lcom/fasterxml/jackson/databind/AnnotationIntrospector;
    //   4: astore 4
    //   6: aload 4
    //   8: aload_2
    //   9: aload_3
    //   10: invokevirtual 909	com/fasterxml/jackson/databind/AnnotationIntrospector:findDeserializationType	(Lcom/fasterxml/jackson/databind/introspect/Annotated;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Class;
    //   13: astore 5
    //   15: aload 5
    //   17: ifnull +424 -> 441
    //   20: aload_3
    //   21: aload 5
    //   23: invokevirtual 913	com/fasterxml/jackson/databind/JavaType:narrowBy	(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;
    //   26: astore 19
    //   28: aload 19
    //   30: astore 6
    //   32: aload 6
    //   34: invokevirtual 916	com/fasterxml/jackson/databind/JavaType:isContainerType	()Z
    //   37: ifeq +401 -> 438
    //   40: aload 4
    //   42: aload_2
    //   43: aload 6
    //   45: invokevirtual 917	com/fasterxml/jackson/databind/JavaType:getKeyType	()Lcom/fasterxml/jackson/databind/JavaType;
    //   48: invokevirtual 920	com/fasterxml/jackson/databind/AnnotationIntrospector:findDeserializationKeyType	(Lcom/fasterxml/jackson/databind/introspect/Annotated;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Class;
    //   51: astore 7
    //   53: aload 7
    //   55: ifnull +376 -> 431
    //   58: aload 6
    //   60: instanceof 799
    //   63: ifne +106 -> 169
    //   66: new 892	com/fasterxml/jackson/databind/JsonMappingException
    //   69: dup
    //   70: new 262	java/lang/StringBuilder
    //   73: dup
    //   74: ldc_w 922
    //   77: invokespecial 267	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   80: aload 6
    //   82: invokevirtual 271	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   85: ldc_w 924
    //   88: invokevirtual 276	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: invokevirtual 279	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   94: invokespecial 897	com/fasterxml/jackson/databind/JsonMappingException:<init>	(Ljava/lang/String;)V
    //   97: athrow
    //   98: astore 18
    //   100: new 892	com/fasterxml/jackson/databind/JsonMappingException
    //   103: dup
    //   104: new 262	java/lang/StringBuilder
    //   107: dup
    //   108: ldc_w 926
    //   111: invokespecial 267	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   114: aload_3
    //   115: invokevirtual 271	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   118: ldc_w 928
    //   121: invokevirtual 276	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: aload 5
    //   126: invokevirtual 97	java/lang/Class:getName	()Ljava/lang/String;
    //   129: invokevirtual 276	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: ldc_w 930
    //   135: invokevirtual 276	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: aload_2
    //   139: invokevirtual 933	com/fasterxml/jackson/databind/introspect/Annotated:getName	()Ljava/lang/String;
    //   142: invokevirtual 276	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: ldc_w 935
    //   148: invokevirtual 276	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: aload 18
    //   153: invokevirtual 938	java/lang/IllegalArgumentException:getMessage	()Ljava/lang/String;
    //   156: invokevirtual 276	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: invokevirtual 279	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   162: aconst_null
    //   163: aload 18
    //   165: invokespecial 941	com/fasterxml/jackson/databind/JsonMappingException:<init>	(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonLocation;Ljava/lang/Throwable;)V
    //   168: athrow
    //   169: aload 6
    //   171: checkcast 799	com/fasterxml/jackson/databind/type/MapLikeType
    //   174: aload 7
    //   176: invokevirtual 944	com/fasterxml/jackson/databind/type/MapLikeType:narrowKey	(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;
    //   179: astore 17
    //   181: aload 17
    //   183: astore 8
    //   185: aload 8
    //   187: invokevirtual 917	com/fasterxml/jackson/databind/JavaType:getKeyType	()Lcom/fasterxml/jackson/databind/JavaType;
    //   190: astore 9
    //   192: aload 9
    //   194: ifnull +47 -> 241
    //   197: aload 9
    //   199: invokevirtual 644	com/fasterxml/jackson/databind/JavaType:getValueHandler	()Ljava/lang/Object;
    //   202: ifnonnull +39 -> 241
    //   205: aload_1
    //   206: aload_2
    //   207: aload 4
    //   209: aload_2
    //   210: invokevirtual 946	com/fasterxml/jackson/databind/AnnotationIntrospector:findKeyDeserializer	(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Ljava/lang/Object;
    //   213: invokevirtual 950	com/fasterxml/jackson/databind/DeserializationContext:keyDeserializerInstance	(Lcom/fasterxml/jackson/databind/introspect/Annotated;Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/KeyDeserializer;
    //   216: astore 14
    //   218: aload 14
    //   220: ifnull +21 -> 241
    //   223: aload 8
    //   225: checkcast 799	com/fasterxml/jackson/databind/type/MapLikeType
    //   228: aload 14
    //   230: invokevirtual 954	com/fasterxml/jackson/databind/type/MapLikeType:withKeyValueHandler	(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/type/MapLikeType;
    //   233: astore 8
    //   235: aload 8
    //   237: invokevirtual 917	com/fasterxml/jackson/databind/JavaType:getKeyType	()Lcom/fasterxml/jackson/databind/JavaType;
    //   240: pop
    //   241: aload 4
    //   243: aload_2
    //   244: aload 8
    //   246: invokevirtual 828	com/fasterxml/jackson/databind/JavaType:getContentType	()Lcom/fasterxml/jackson/databind/JavaType;
    //   249: invokevirtual 957	com/fasterxml/jackson/databind/AnnotationIntrospector:findDeserializationContentType	(Lcom/fasterxml/jackson/databind/introspect/Annotated;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Class;
    //   252: astore 10
    //   254: aload 10
    //   256: ifnull +16 -> 272
    //   259: aload 8
    //   261: aload 10
    //   263: invokevirtual 960	com/fasterxml/jackson/databind/JavaType:narrowContentsBy	(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;
    //   266: astore 13
    //   268: aload 13
    //   270: astore 8
    //   272: aload 8
    //   274: invokevirtual 828	com/fasterxml/jackson/databind/JavaType:getContentType	()Lcom/fasterxml/jackson/databind/JavaType;
    //   277: invokevirtual 644	com/fasterxml/jackson/databind/JavaType:getValueHandler	()Ljava/lang/Object;
    //   280: ifnonnull +30 -> 310
    //   283: aload_1
    //   284: aload_2
    //   285: aload 4
    //   287: aload_2
    //   288: invokevirtual 963	com/fasterxml/jackson/databind/AnnotationIntrospector:findContentDeserializer	(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Ljava/lang/Object;
    //   291: invokevirtual 821	com/fasterxml/jackson/databind/DeserializationContext:deserializerInstance	(Lcom/fasterxml/jackson/databind/introspect/Annotated;Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    //   294: astore 11
    //   296: aload 11
    //   298: ifnull +12 -> 310
    //   301: aload 8
    //   303: aload 11
    //   305: invokevirtual 967	com/fasterxml/jackson/databind/JavaType:withContentValueHandler	(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/JavaType;
    //   308: astore 8
    //   310: aload 8
    //   312: areturn
    //   313: astore 16
    //   315: new 892	com/fasterxml/jackson/databind/JsonMappingException
    //   318: dup
    //   319: new 262	java/lang/StringBuilder
    //   322: dup
    //   323: ldc_w 969
    //   326: invokespecial 267	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   329: aload 6
    //   331: invokevirtual 271	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   334: ldc_w 971
    //   337: invokevirtual 276	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   340: aload 7
    //   342: invokevirtual 97	java/lang/Class:getName	()Ljava/lang/String;
    //   345: invokevirtual 276	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: ldc_w 973
    //   351: invokevirtual 276	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: aload 16
    //   356: invokevirtual 938	java/lang/IllegalArgumentException:getMessage	()Ljava/lang/String;
    //   359: invokevirtual 276	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: invokevirtual 279	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   365: aconst_null
    //   366: aload 16
    //   368: invokespecial 941	com/fasterxml/jackson/databind/JsonMappingException:<init>	(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonLocation;Ljava/lang/Throwable;)V
    //   371: athrow
    //   372: astore 12
    //   374: new 892	com/fasterxml/jackson/databind/JsonMappingException
    //   377: dup
    //   378: new 262	java/lang/StringBuilder
    //   381: dup
    //   382: ldc_w 975
    //   385: invokespecial 267	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   388: aload 8
    //   390: invokevirtual 271	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   393: ldc_w 977
    //   396: invokevirtual 276	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   399: aload 10
    //   401: invokevirtual 97	java/lang/Class:getName	()Ljava/lang/String;
    //   404: invokevirtual 276	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   407: ldc_w 973
    //   410: invokevirtual 276	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   413: aload 12
    //   415: invokevirtual 938	java/lang/IllegalArgumentException:getMessage	()Ljava/lang/String;
    //   418: invokevirtual 276	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   421: invokevirtual 279	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   424: aconst_null
    //   425: aload 12
    //   427: invokespecial 941	com/fasterxml/jackson/databind/JsonMappingException:<init>	(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonLocation;Ljava/lang/Throwable;)V
    //   430: athrow
    //   431: aload 6
    //   433: astore 8
    //   435: goto -250 -> 185
    //   438: aload 6
    //   440: areturn
    //   441: aload_3
    //   442: astore 6
    //   444: goto -412 -> 32
    //
    // Exception table:
    //   from	to	target	type
    //   20	28	98	java/lang/IllegalArgumentException
    //   169	181	313	java/lang/IllegalArgumentException
    //   259	268	372	java/lang/IllegalArgumentException
  }

  protected JavaType resolveType(DeserializationContext paramDeserializationContext, BeanDescription paramBeanDescription, JavaType paramJavaType, AnnotatedMember paramAnnotatedMember)
  {
    if (paramJavaType.isContainerType())
    {
      AnnotationIntrospector localAnnotationIntrospector = paramDeserializationContext.getAnnotationIntrospector();
      if (paramJavaType.getKeyType() != null)
      {
        KeyDeserializer localKeyDeserializer = paramDeserializationContext.keyDeserializerInstance(paramAnnotatedMember, localAnnotationIntrospector.findKeyDeserializer(paramAnnotatedMember));
        if (localKeyDeserializer != null)
        {
          paramJavaType = ((MapLikeType)paramJavaType).withKeyValueHandler(localKeyDeserializer);
          paramJavaType.getKeyType();
        }
      }
      JsonDeserializer localJsonDeserializer = paramDeserializationContext.deserializerInstance(paramAnnotatedMember, localAnnotationIntrospector.findContentDeserializer(paramAnnotatedMember));
      if (localJsonDeserializer != null)
        paramJavaType = paramJavaType.withContentValueHandler(localJsonDeserializer);
      if ((paramAnnotatedMember instanceof AnnotatedMember))
      {
        TypeDeserializer localTypeDeserializer2 = findPropertyContentTypeDeserializer(paramDeserializationContext.getConfig(), paramJavaType, paramAnnotatedMember);
        if (localTypeDeserializer2 != null)
          paramJavaType = paramJavaType.withContentTypeHandler(localTypeDeserializer2);
      }
    }
    if ((paramAnnotatedMember instanceof AnnotatedMember));
    for (TypeDeserializer localTypeDeserializer1 = findPropertyTypeDeserializer(paramDeserializationContext.getConfig(), paramJavaType, paramAnnotatedMember); ; localTypeDeserializer1 = findTypeDeserializer(paramDeserializationContext.getConfig(), paramJavaType))
    {
      if (localTypeDeserializer1 != null)
        paramJavaType = paramJavaType.withTypeHandler(localTypeDeserializer1);
      return paramJavaType;
    }
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.BasicDeserializerFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
