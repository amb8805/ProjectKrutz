package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Map;;
import java.util.Set;
import java.util.TreeMap;

public class POJOPropertiesCollector
{
  protected final AnnotationIntrospector _annotationIntrospector;
  protected LinkedList<AnnotatedMember> _anyGetters = null;
  protected LinkedList<AnnotatedMethod> _anySetters = null;
  protected final AnnotatedClass _classDef;
  protected final MapperConfig<?> _config;
  protected LinkedList<POJOPropertyBuilder> _creatorProperties = null;
  protected final boolean _forSerialization;
  protected HashSet<String> _ignoredPropertyNames;
  protected LinkedHashMap<Object, AnnotatedMember> _injectables;
  protected LinkedList<AnnotatedMethod> _jsonValueGetters = null;
  protected final String _mutatorPrefix;
  protected final LinkedHashMap<String, POJOPropertyBuilder> _properties = new LinkedHashMap();
  protected final JavaType _type;
  protected final VisibilityChecker<?> _visibilityChecker;

  protected POJOPropertiesCollector(MapperConfig<?> paramMapperConfig, boolean paramBoolean, JavaType paramJavaType, AnnotatedClass paramAnnotatedClass, String paramString)
  {
    this._config = paramMapperConfig;
    this._forSerialization = paramBoolean;
    this._type = paramJavaType;
    this._classDef = paramAnnotatedClass;
    if (paramString == null)
      paramString = "set";
    this._mutatorPrefix = paramString;
    boolean bool = paramMapperConfig.isAnnotationProcessingEnabled();
    AnnotationIntrospector localAnnotationIntrospector = null;
    if (bool)
      localAnnotationIntrospector = this._config.getAnnotationIntrospector();
    this._annotationIntrospector = localAnnotationIntrospector;
    if (this._annotationIntrospector == null)
    {
      this._visibilityChecker = this._config.getDefaultVisibilityChecker();
      return;
    }
    this._visibilityChecker = this._annotationIntrospector.findAutoDetectVisibility(paramAnnotatedClass, this._config.getDefaultVisibilityChecker());
  }

  private void _addIgnored(String paramString)
  {
    if (!this._forSerialization)
    {
      if (this._ignoredPropertyNames == null)
        this._ignoredPropertyNames = new HashSet();
      this._ignoredPropertyNames.add(paramString);
    }
  }

  private PropertyNamingStrategy _findNamingStrategy()
  {
    if (this._annotationIntrospector == null);
    for (Object localObject = null; localObject == null; localObject = this._annotationIntrospector.findNamingStrategy(this._classDef))
      return this._config.getPropertyNamingStrategy();
    if ((localObject instanceof PropertyNamingStrategy))
      return (PropertyNamingStrategy)localObject;
    if (!(localObject instanceof Class))
      throw new IllegalStateException("AnnotationIntrospector returned PropertyNamingStrategy definition of type " + localObject.getClass().getName() + "; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead");
    Class localClass = (Class)localObject;
    if (!PropertyNamingStrategy.class.isAssignableFrom(localClass))
      throw new IllegalStateException("AnnotationIntrospector returned Class " + localClass.getName() + "; expected Class<PropertyNamingStrategy>");
    HandlerInstantiator localHandlerInstantiator = this._config.getHandlerInstantiator();
    if (localHandlerInstantiator != null)
    {
      PropertyNamingStrategy localPropertyNamingStrategy = localHandlerInstantiator.namingStrategyInstance(this._config, this._classDef, localClass);
      if (localPropertyNamingStrategy != null)
        return localPropertyNamingStrategy;
    }
    return (PropertyNamingStrategy)ClassUtil.createInstance(localClass, this._config.canOverrideAccessModifiers());
  }

  protected void _addCreators()
  {
    AnnotationIntrospector localAnnotationIntrospector = this._annotationIntrospector;
    if (localAnnotationIntrospector == null);
    label71: Iterator localIterator2;
    label143: 
    do
    {
      return;
      Iterator localIterator1 = this._classDef.getConstructors().iterator();
      if (localIterator1.hasNext())
      {
        AnnotatedConstructor localAnnotatedConstructor = (AnnotatedConstructor)localIterator1.next();
        if (this._creatorProperties == null)
          this._creatorProperties = new LinkedList();
        int k = localAnnotatedConstructor.getParameterCount();
        int m = 0;
        AnnotatedParameter localAnnotatedParameter2;
        PropertyName localPropertyName2;
        if (m < k)
        {
          localAnnotatedParameter2 = localAnnotatedConstructor.getParameter(m);
          localPropertyName2 = localAnnotationIntrospector.findNameForDeserialization(localAnnotatedParameter2);
          if (localPropertyName2 != null)
            break label143;
        }
        for (String str2 = null; ; str2 = localPropertyName2.getSimpleName())
        {
          if (str2 != null)
          {
            POJOPropertyBuilder localPOJOPropertyBuilder2 = _property(str2);
            localPOJOPropertyBuilder2.addCtor(localAnnotatedParameter2, str2, true, false);
            this._creatorProperties.add(localPOJOPropertyBuilder2);
          }
          m++;
          break label71;
          break;
        }
      }
      localIterator2 = this._classDef.getStaticMethods().iterator();
    }
    while (!localIterator2.hasNext());
    AnnotatedMethod localAnnotatedMethod = (AnnotatedMethod)localIterator2.next();
    if (this._creatorProperties == null)
      this._creatorProperties = new LinkedList();
    int i = localAnnotatedMethod.getParameterCount();
    int j = 0;
    label214: AnnotatedParameter localAnnotatedParameter1;
    PropertyName localPropertyName1;
    if (j < i)
    {
      localAnnotatedParameter1 = localAnnotatedMethod.getParameter(j);
      localPropertyName1 = localAnnotationIntrospector.findNameForDeserialization(localAnnotatedParameter1);
      if (localPropertyName1 != null)
        break label286;
    }
    label286: for (String str1 = null; ; str1 = localPropertyName1.getSimpleName())
    {
      if (str1 != null)
      {
        POJOPropertyBuilder localPOJOPropertyBuilder1 = _property(str1);
        localPOJOPropertyBuilder1.addCtor(localAnnotatedParameter1, str1, true, false);
        this._creatorProperties.add(localPOJOPropertyBuilder1);
      }
      j++;
      break label214;
      break;
    }
  }

  protected void _addFields()
  {
    AnnotationIntrospector localAnnotationIntrospector = this._annotationIntrospector;
    Iterator localIterator = this._classDef.fields().iterator();
    AnnotatedField localAnnotatedField;
    String str;
    Object localObject1;
    if (localIterator.hasNext())
    {
      localAnnotatedField = (AnnotatedField)localIterator.next();
      str = localAnnotatedField.getName();
      if (localAnnotationIntrospector == null)
      {
        localObject1 = null;
        label50: if (!"".equals(localObject1))
          break label206;
      }
    }
    label72: label206: for (Object localObject2 = str; ; localObject2 = localObject1)
    {
      boolean bool1;
      if (localObject2 != null)
      {
        bool1 = true;
        if (bool1)
          break label199;
      }
      for (boolean bool2 = this._visibilityChecker.isFieldVisible(localAnnotatedField); ; bool2 = bool1)
      {
        if ((localAnnotationIntrospector != null) && (localAnnotationIntrospector.hasIgnoreMarker(localAnnotatedField)));
        for (boolean bool3 = true; ; bool3 = false)
        {
          _property(str).addField(localAnnotatedField, (String)localObject2, bool2, bool3);
          break;
          if (this._forSerialization)
          {
            PropertyName localPropertyName2 = localAnnotationIntrospector.findNameForSerialization(localAnnotatedField);
            if (localPropertyName2 == null)
            {
              localObject1 = null;
              break label50;
            }
            localObject1 = localPropertyName2.getSimpleName();
            break label50;
          }
          PropertyName localPropertyName1 = localAnnotationIntrospector.findNameForDeserialization(localAnnotatedField);
          if (localPropertyName1 == null)
          {
            localObject1 = null;
            break label50;
          }
          localObject1 = localPropertyName1.getSimpleName();
          break label50;
          bool1 = false;
          break label72;
        }
        return;
      }
    }
  }

  protected void _addGetterMethod(AnnotatedMethod paramAnnotatedMethod, AnnotationIntrospector paramAnnotationIntrospector)
  {
    if (paramAnnotationIntrospector != null)
      if (paramAnnotationIntrospector.hasAnyGetterAnnotation(paramAnnotatedMethod))
      {
        if (this._anyGetters == null)
          this._anyGetters = new LinkedList();
        this._anyGetters.add(paramAnnotatedMethod);
      }
    PropertyName localPropertyName;
    Object localObject1;
    label89: String str2;
    String str3;
    do
    {
      return;
      if (paramAnnotationIntrospector.hasAsValueAnnotation(paramAnnotatedMethod))
      {
        if (this._jsonValueGetters == null)
          this._jsonValueGetters = new LinkedList();
        this._jsonValueGetters.add(paramAnnotatedMethod);
        return;
      }
      if (paramAnnotationIntrospector != null)
        break;
      localPropertyName = null;
      localObject1 = null;
      if (localPropertyName != null)
        break label177;
      if (localObject1 != null)
        break label209;
      str2 = BeanUtil.okNameForRegularGetter(paramAnnotatedMethod, paramAnnotatedMethod.getName());
      if (str2 != null)
        break label186;
      str3 = BeanUtil.okNameForIsGetter(paramAnnotatedMethod, paramAnnotatedMethod.getName());
    }
    while (str3 == null);
    boolean bool4 = this._visibilityChecker.isIsGetterVisible(paramAnnotatedMethod);
    Object localObject2 = str3;
    boolean bool1 = bool4;
    label144: if (paramAnnotationIntrospector == null);
    for (boolean bool2 = false; ; bool2 = paramAnnotationIntrospector.hasIgnoreMarker(paramAnnotatedMethod))
    {
      _property((String)localObject2).addGetter(paramAnnotatedMethod, (String)localObject1, bool1, bool2);
      return;
      localPropertyName = paramAnnotationIntrospector.findNameForSerialization(paramAnnotatedMethod);
      break;
      label177: localObject1 = localPropertyName.getSimpleName();
      break label89;
      label186: boolean bool3 = this._visibilityChecker.isGetterVisible(paramAnnotatedMethod);
      localObject2 = str2;
      bool1 = bool3;
      break label144;
      label209: String str1 = BeanUtil.okNameForGetter(paramAnnotatedMethod);
      if (str1 == null)
        str1 = paramAnnotatedMethod.getName();
      if (((String)localObject1).length() == 0)
        localObject1 = str1;
      bool1 = true;
      localObject2 = str1;
      break label144;
    }
  }

  protected void _addInjectables()
  {
    AnnotationIntrospector localAnnotationIntrospector = this._annotationIntrospector;
    if (localAnnotationIntrospector == null);
    while (true)
    {
      return;
      Iterator localIterator1 = this._classDef.fields().iterator();
      while (localIterator1.hasNext())
      {
        AnnotatedField localAnnotatedField = (AnnotatedField)localIterator1.next();
        _doAddInjectable(localAnnotationIntrospector.findInjectableValueId(localAnnotatedField), localAnnotatedField);
      }
      Iterator localIterator2 = this._classDef.memberMethods().iterator();
      while (localIterator2.hasNext())
      {
        AnnotatedMethod localAnnotatedMethod = (AnnotatedMethod)localIterator2.next();
        if (localAnnotatedMethod.getParameterCount() == 1)
          _doAddInjectable(localAnnotationIntrospector.findInjectableValueId(localAnnotatedMethod), localAnnotatedMethod);
      }
    }
  }

  protected void _addMethods()
  {
    AnnotationIntrospector localAnnotationIntrospector = this._annotationIntrospector;
    Iterator localIterator = this._classDef.memberMethods().iterator();
    while (localIterator.hasNext())
    {
      AnnotatedMethod localAnnotatedMethod = (AnnotatedMethod)localIterator.next();
      int i = localAnnotatedMethod.getParameterCount();
      if (i == 0)
      {
        _addGetterMethod(localAnnotatedMethod, localAnnotationIntrospector);
      }
      else if (i == 1)
      {
        _addSetterMethod(localAnnotatedMethod, localAnnotationIntrospector);
      }
      else if ((i == 2) && (localAnnotationIntrospector != null) && (localAnnotationIntrospector.hasAnySetterAnnotation(localAnnotatedMethod)))
      {
        if (this._anySetters == null)
          this._anySetters = new LinkedList();
        this._anySetters.add(localAnnotatedMethod);
      }
    }
  }

  protected void _addSetterMethod(AnnotatedMethod paramAnnotatedMethod, AnnotationIntrospector paramAnnotationIntrospector)
  {
    PropertyName localPropertyName;
    Object localObject1;
    if (paramAnnotationIntrospector == null)
    {
      localPropertyName = null;
      localObject1 = null;
      if (localPropertyName != null)
        break label43;
    }
    label43: Object localObject2;
    boolean bool1;
    while (true)
      if (localObject1 == null)
      {
        String str2 = BeanUtil.okNameForMutator(paramAnnotatedMethod, this._mutatorPrefix);
        if (str2 == null)
        {
          return;
          localPropertyName = paramAnnotationIntrospector.findNameForDeserialization(paramAnnotatedMethod);
          break;
          localObject1 = localPropertyName.getSimpleName();
          continue;
        }
        boolean bool3 = this._visibilityChecker.isSetterVisible(paramAnnotatedMethod);
        localObject2 = str2;
        bool1 = bool3;
        if (paramAnnotationIntrospector != null)
          break label139;
      }
    label139: for (boolean bool2 = false; ; bool2 = paramAnnotationIntrospector.hasIgnoreMarker(paramAnnotatedMethod))
    {
      _property((String)localObject2).addSetter(paramAnnotatedMethod, (String)localObject1, bool1, bool2);
      return;
      String str1 = BeanUtil.okNameForMutator(paramAnnotatedMethod, this._mutatorPrefix);
      if (str1 == null)
        str1 = paramAnnotatedMethod.getName();
      if (((String)localObject1).length() == 0)
        localObject1 = str1;
      bool1 = true;
      localObject2 = str1;
      break;
    }
  }

  protected void _doAddInjectable(Object paramObject, AnnotatedMember paramAnnotatedMember)
  {
    if (paramObject == null);
    do
    {
      return;
      if (this._injectables == null)
        this._injectables = new LinkedHashMap();
    }
    while ((AnnotatedMember)this._injectables.put(paramObject, paramAnnotatedMember) == null);
    if (paramObject == null);
    for (String str = "[null]"; ; str = paramObject.getClass().getName())
      throw new IllegalArgumentException("Duplicate injectable value with id '" + String.valueOf(paramObject) + "' (of type " + str + ")");
  }

  protected POJOPropertyBuilder _property(String paramString)
  {
    POJOPropertyBuilder localPOJOPropertyBuilder = (POJOPropertyBuilder)this._properties.get(paramString);
    if (localPOJOPropertyBuilder == null)
    {
      localPOJOPropertyBuilder = new POJOPropertyBuilder(paramString, this._annotationIntrospector, this._forSerialization);
      this._properties.put(paramString, localPOJOPropertyBuilder);
    }
    return localPOJOPropertyBuilder;
  }

  protected void _removeUnwantedProperties()
  {
    Iterator localIterator = this._properties.entrySet().iterator();
    while (localIterator.hasNext())
    {
      POJOPropertyBuilder localPOJOPropertyBuilder = (POJOPropertyBuilder)((Map.Entry)localIterator.next()).getValue();
      if (!localPOJOPropertyBuilder.anyVisible())
        localIterator.remove();
      else if (localPOJOPropertyBuilder.anyIgnorals())
      {
        if (!localPOJOPropertyBuilder.isExplicitlyIncluded())
        {
          localIterator.remove();
          _addIgnored(localPOJOPropertyBuilder.getName());
        }
        else
        {
          localPOJOPropertyBuilder.removeIgnored();
          if ((!this._forSerialization) && (!localPOJOPropertyBuilder.couldDeserialize()))
            _addIgnored(localPOJOPropertyBuilder.getName());
        }
      }
      else
        localPOJOPropertyBuilder.removeNonVisible();
    }
  }

  protected void _renameProperties()
  {
    Iterator localIterator1 = this._properties.entrySet().iterator();
    LinkedList localLinkedList = null;
    while (localIterator1.hasNext())
    {
      POJOPropertyBuilder localPOJOPropertyBuilder3 = (POJOPropertyBuilder)((Map.Entry)localIterator1.next()).getValue();
      String str2 = localPOJOPropertyBuilder3.findNewName();
      if (str2 != null)
      {
        if (localLinkedList == null)
          localLinkedList = new LinkedList();
        localLinkedList.add(localPOJOPropertyBuilder3.withName(str2));
        localIterator1.remove();
      }
    }
    if (localLinkedList != null)
    {
      Iterator localIterator2 = localLinkedList.iterator();
      while (localIterator2.hasNext())
      {
        POJOPropertyBuilder localPOJOPropertyBuilder1 = (POJOPropertyBuilder)localIterator2.next();
        String str1 = localPOJOPropertyBuilder1.getName();
        POJOPropertyBuilder localPOJOPropertyBuilder2 = (POJOPropertyBuilder)this._properties.get(str1);
        if (localPOJOPropertyBuilder2 == null)
          this._properties.put(str1, localPOJOPropertyBuilder1);
        else
          localPOJOPropertyBuilder2.addAll(localPOJOPropertyBuilder1);
      }
    }
  }

  protected void _renameUsing(PropertyNamingStrategy paramPropertyNamingStrategy)
  {
    POJOPropertyBuilder[] arrayOfPOJOPropertyBuilder = (POJOPropertyBuilder[])this._properties.values().toArray(new POJOPropertyBuilder[this._properties.size()]);
    this._properties.clear();
    int i = arrayOfPOJOPropertyBuilder.length;
    int j = 0;
    POJOPropertyBuilder localPOJOPropertyBuilder1;
    String str1;
    String str2;
    if (j < i)
    {
      localPOJOPropertyBuilder1 = arrayOfPOJOPropertyBuilder[j];
      str1 = localPOJOPropertyBuilder1.getName();
      if (this._forSerialization)
        if (localPOJOPropertyBuilder1.hasGetter())
          str2 = paramPropertyNamingStrategy.nameForGetterMethod(this._config, localPOJOPropertyBuilder1.getGetter(), str1);
    }
    while (true)
    {
      label90: if (!str2.equals(localPOJOPropertyBuilder1.getName()))
        localPOJOPropertyBuilder1 = localPOJOPropertyBuilder1.withName(str2);
      POJOPropertyBuilder localPOJOPropertyBuilder2 = (POJOPropertyBuilder)this._properties.get(str2);
      if (localPOJOPropertyBuilder2 == null)
        this._properties.put(str2, localPOJOPropertyBuilder1);
      while (true)
      {
        j++;
        break;
        if (!localPOJOPropertyBuilder1.hasField())
          break label300;
        str2 = paramPropertyNamingStrategy.nameForField(this._config, localPOJOPropertyBuilder1.getField(), str1);
        break label90;
        if (localPOJOPropertyBuilder1.hasSetter())
        {
          str2 = paramPropertyNamingStrategy.nameForSetterMethod(this._config, localPOJOPropertyBuilder1.getSetter(), str1);
          break label90;
        }
        if (localPOJOPropertyBuilder1.hasConstructorParameter())
        {
          str2 = paramPropertyNamingStrategy.nameForConstructorParameter(this._config, localPOJOPropertyBuilder1.getConstructorParameter(), str1);
          break label90;
        }
        if (localPOJOPropertyBuilder1.hasField())
        {
          str2 = paramPropertyNamingStrategy.nameForField(this._config, localPOJOPropertyBuilder1.getField(), str1);
          break label90;
        }
        if (!localPOJOPropertyBuilder1.hasGetter())
          break label300;
        str2 = paramPropertyNamingStrategy.nameForGetterMethod(this._config, localPOJOPropertyBuilder1.getGetter(), str1);
        break label90;
        localPOJOPropertyBuilder2.addAll(localPOJOPropertyBuilder1);
      }
      return;
      label300: str2 = str1;
    }
  }

  protected void _renameWithWrappers()
  {
    Iterator localIterator1 = this._properties.entrySet().iterator();
    LinkedList localLinkedList = null;
    while (localIterator1.hasNext())
    {
      POJOPropertyBuilder localPOJOPropertyBuilder3 = (POJOPropertyBuilder)((Map.Entry)localIterator1.next()).getValue();
      AnnotatedMember localAnnotatedMember = localPOJOPropertyBuilder3.getPrimaryMember();
      if (localAnnotatedMember != null)
      {
        PropertyName localPropertyName = this._annotationIntrospector.findWrapperName(localAnnotatedMember);
        if ((localPropertyName != null) && (localPropertyName.hasSimpleName()))
        {
          String str2 = localPropertyName.getSimpleName();
          if (!str2.equals(localPOJOPropertyBuilder3.getName()))
          {
            if (localLinkedList == null)
              localLinkedList = new LinkedList();
            localLinkedList.add(localPOJOPropertyBuilder3.withName(str2));
            localIterator1.remove();
          }
        }
      }
    }
    if (localLinkedList != null)
    {
      Iterator localIterator2 = localLinkedList.iterator();
      while (localIterator2.hasNext())
      {
        POJOPropertyBuilder localPOJOPropertyBuilder1 = (POJOPropertyBuilder)localIterator2.next();
        String str1 = localPOJOPropertyBuilder1.getName();
        POJOPropertyBuilder localPOJOPropertyBuilder2 = (POJOPropertyBuilder)this._properties.get(str1);
        if (localPOJOPropertyBuilder2 == null)
          this._properties.put(str1, localPOJOPropertyBuilder1);
        else
          localPOJOPropertyBuilder2.addAll(localPOJOPropertyBuilder1);
      }
    }
  }

  protected void _sortProperties()
  {
    AnnotationIntrospector localAnnotationIntrospector = this._annotationIntrospector;
    Boolean localBoolean;
    boolean bool;
    if (localAnnotationIntrospector == null)
    {
      localBoolean = null;
      if (localBoolean != null)
        break label59;
      bool = this._config.shouldSortPropertiesAlphabetically();
      label23: if (localAnnotationIntrospector != null)
        break label67;
    }
    label59: label67: for (String[] arrayOfString = null; ; arrayOfString = localAnnotationIntrospector.findSerializationPropertyOrder(this._classDef))
    {
      if ((bool) || (this._creatorProperties != null) || (arrayOfString != null))
        break label80;
      return;
      localBoolean = localAnnotationIntrospector.findSerializationSortAlphabetically(this._classDef);
      break;
      bool = localBoolean.booleanValue();
      break label23;
    }
    label80: int i = this._properties.size();
    if (bool);
    for (Object localObject1 = new TreeMap(); ; localObject1 = new LinkedHashMap(i + i))
    {
      Iterator localIterator1 = this._properties.values().iterator();
      while (localIterator1.hasNext())
      {
        POJOPropertyBuilder localPOJOPropertyBuilder3 = (POJOPropertyBuilder)localIterator1.next();
        ((Map)localObject1).put(localPOJOPropertyBuilder3.getName(), localPOJOPropertyBuilder3);
      }
    }
    LinkedHashMap localLinkedHashMap = new LinkedHashMap(i + i);
    int k;
    String str1;
    Object localObject2;
    String str2;
    if (arrayOfString != null)
    {
      int j = arrayOfString.length;
      k = 0;
      if (k < j)
      {
        str1 = arrayOfString[k];
        localObject2 = (POJOPropertyBuilder)((Map)localObject1).get(str1);
        if (localObject2 != null)
          break label398;
        Iterator localIterator3 = this._properties.values().iterator();
        while (localIterator3.hasNext())
        {
          POJOPropertyBuilder localPOJOPropertyBuilder2 = (POJOPropertyBuilder)localIterator3.next();
          if (str1.equals(localPOJOPropertyBuilder2.getInternalName()))
          {
            str2 = localPOJOPropertyBuilder2.getName();
            localObject2 = localPOJOPropertyBuilder2;
          }
        }
      }
    }
    while (true)
    {
      if (localObject2 != null)
        localLinkedHashMap.put(str2, localObject2);
      k++;
      break;
      if (this._creatorProperties != null)
      {
        Iterator localIterator2 = this._creatorProperties.iterator();
        while (localIterator2.hasNext())
        {
          POJOPropertyBuilder localPOJOPropertyBuilder1 = (POJOPropertyBuilder)localIterator2.next();
          localLinkedHashMap.put(localPOJOPropertyBuilder1.getName(), localPOJOPropertyBuilder1);
        }
      }
      localLinkedHashMap.putAll((Map)localObject1);
      this._properties.clear();
      this._properties.putAll(localLinkedHashMap);
      return;
      label398: str2 = str1;
    }
  }

  public POJOPropertiesCollector collect()
  {
    this._properties.clear();
    _addFields();
    _addMethods();
    _addCreators();
    _addInjectables();
    _removeUnwantedProperties();
    _renameProperties();
    PropertyNamingStrategy localPropertyNamingStrategy = _findNamingStrategy();
    if (localPropertyNamingStrategy != null)
      _renameUsing(localPropertyNamingStrategy);
    Iterator localIterator1 = this._properties.values().iterator();
    while (localIterator1.hasNext())
      ((POJOPropertyBuilder)localIterator1.next()).trimByVisibility();
    Iterator localIterator2 = this._properties.values().iterator();
    while (localIterator2.hasNext())
      ((POJOPropertyBuilder)localIterator2.next()).mergeAnnotations(this._forSerialization);
    if (this._config.isEnabled(MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME))
      _renameWithWrappers();
    _sortProperties();
    return this;
  }

  public AnnotatedMember getAnyGetter()
  {
    if (this._anyGetters != null)
    {
      if (this._anyGetters.size() > 1)
        reportProblem("Multiple 'any-getters' defined (" + this._anyGetters.get(0) + " vs " + this._anyGetters.get(1) + ")");
      return (AnnotatedMember)this._anyGetters.getFirst();
    }
    return null;
  }

  public AnnotatedMethod getAnySetterMethod()
  {
    if (this._anySetters != null)
    {
      if (this._anySetters.size() > 1)
        reportProblem("Multiple 'any-setters' defined (" + this._anySetters.get(0) + " vs " + this._anySetters.get(1) + ")");
      return (AnnotatedMethod)this._anySetters.getFirst();
    }
    return null;
  }

  public AnnotatedClass getClassDef()
  {
    return this._classDef;
  }

  public MapperConfig<?> getConfig()
  {
    return this._config;
  }

  public Set<String> getIgnoredPropertyNames()
  {
    return this._ignoredPropertyNames;
  }

  public Map<Object, AnnotatedMember> getInjectables()
  {
    return this._injectables;
  }

  public AnnotatedMethod getJsonValueMethod()
  {
    if (this._jsonValueGetters != null)
    {
      if (this._jsonValueGetters.size() > 1)
        reportProblem("Multiple value properties defined (" + this._jsonValueGetters.get(0) + " vs " + this._jsonValueGetters.get(1) + ")");
      return (AnnotatedMethod)this._jsonValueGetters.get(0);
    }
    return null;
  }

  public ObjectIdInfo getObjectIdInfo()
  {
    ObjectIdInfo localObjectIdInfo;
    if (this._annotationIntrospector == null)
      localObjectIdInfo = null;
    do
    {
      return localObjectIdInfo;
      localObjectIdInfo = this._annotationIntrospector.findObjectIdInfo(this._classDef);
    }
    while (localObjectIdInfo == null);
    return this._annotationIntrospector.findObjectReferenceInfo(this._classDef, localObjectIdInfo);
  }

  public List<BeanPropertyDefinition> getProperties()
  {
    return new ArrayList(this._properties.values());
  }

  public JavaType getType()
  {
    return this._type;
  }

  protected void reportProblem(String paramString)
  {
    throw new IllegalArgumentException("Problem with definition of " + this._classDef + ": " + paramString);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
