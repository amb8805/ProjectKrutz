package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.Annotations;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BeanDeserializerBuilder
{
  protected SettableAnyProperty _anySetter;
  protected HashMap<String, SettableBeanProperty> _backRefProperties;
  protected final BeanDescription _beanDesc;
  protected AnnotatedMethod _buildMethod;
  protected JsonPOJOBuilder.Value _builderConfig;
  protected final boolean _defaultViewInclusion;
  protected HashSet<String> _ignorableProps;
  protected boolean _ignoreAllUnknown;
  protected List<ValueInjector> _injectables;
  protected ObjectIdReader _objectIdReader;
  protected final Map<String, SettableBeanProperty> _properties = new LinkedHashMap();
  protected ValueInstantiator _valueInstantiator;

  public BeanDeserializerBuilder(BeanDescription paramBeanDescription, DeserializationConfig paramDeserializationConfig)
  {
    this._beanDesc = paramBeanDescription;
    this._defaultViewInclusion = paramDeserializationConfig.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
  }

  public void addBackReferenceProperty(String paramString, SettableBeanProperty paramSettableBeanProperty)
  {
    if (this._backRefProperties == null)
      this._backRefProperties = new HashMap(4);
    this._backRefProperties.put(paramString, paramSettableBeanProperty);
    if (this._properties != null)
      this._properties.remove(paramSettableBeanProperty.getName());
  }

  public void addCreatorProperty(SettableBeanProperty paramSettableBeanProperty)
  {
    addProperty(paramSettableBeanProperty);
  }

  public void addIgnorable(String paramString)
  {
    if (this._ignorableProps == null)
      this._ignorableProps = new HashSet();
    this._ignorableProps.add(paramString);
  }

  public void addInjectable(String paramString, JavaType paramJavaType, Annotations paramAnnotations, AnnotatedMember paramAnnotatedMember, Object paramObject)
  {
    if (this._injectables == null)
      this._injectables = new ArrayList();
    this._injectables.add(new ValueInjector(paramString, paramJavaType, paramAnnotations, paramAnnotatedMember, paramObject));
  }

  public void addOrReplaceProperty(SettableBeanProperty paramSettableBeanProperty, boolean paramBoolean)
  {
    this._properties.put(paramSettableBeanProperty.getName(), paramSettableBeanProperty);
  }

  public void addProperty(SettableBeanProperty paramSettableBeanProperty)
  {
    SettableBeanProperty localSettableBeanProperty = (SettableBeanProperty)this._properties.put(paramSettableBeanProperty.getName(), paramSettableBeanProperty);
    if ((localSettableBeanProperty != null) && (localSettableBeanProperty != paramSettableBeanProperty))
      throw new IllegalArgumentException("Duplicate property '" + paramSettableBeanProperty.getName() + "' for " + this._beanDesc.getType());
  }

  public BeanDeserializer build()
  {
    boolean bool1 = true;
    Collection localCollection = this._properties.values();
    BeanPropertyMap localBeanPropertyMap = new BeanPropertyMap(localCollection);
    localBeanPropertyMap.assignIndexes();
    boolean bool2;
    if (!this._defaultViewInclusion)
    {
      bool2 = bool1;
      if (bool2)
        break label131;
      Iterator localIterator = localCollection.iterator();
      do
        if (!localIterator.hasNext())
          break;
      while (!((SettableBeanProperty)localIterator.next()).hasViews());
    }
    while (true)
    {
      if (this._objectIdReader != null)
        localBeanPropertyMap = localBeanPropertyMap.withProperty(new ObjectIdValueProperty(this._objectIdReader));
      return new BeanDeserializer(this, this._beanDesc, localBeanPropertyMap, this._backRefProperties, this._ignorableProps, this._ignoreAllUnknown, bool1);
      bool2 = false;
      break;
      label131: bool1 = bool2;
    }
  }

  public AbstractDeserializer buildAbstract()
  {
    return new AbstractDeserializer(this, this._beanDesc, this._backRefProperties);
  }

  public JsonDeserializer<?> buildBuilderBased(JavaType paramJavaType, String paramString)
  {
    boolean bool1 = true;
    if (this._buildMethod == null)
      throw new IllegalArgumentException("Builder class " + this._beanDesc.getBeanClass().getName() + " does not have build method '" + paramString + "()'");
    Class localClass = this._buildMethod.getRawReturnType();
    if (!paramJavaType.getRawClass().isAssignableFrom(localClass))
      throw new IllegalArgumentException("Build method '" + this._buildMethod.getFullName() + " has bad return type (" + localClass.getName() + "), not compatible with POJO type (" + paramJavaType.getRawClass().getName() + ")");
    Collection localCollection = this._properties.values();
    BeanPropertyMap localBeanPropertyMap = new BeanPropertyMap(localCollection);
    localBeanPropertyMap.assignIndexes();
    boolean bool2;
    if (!this._defaultViewInclusion)
    {
      bool2 = bool1;
      if (bool2)
        break label277;
      Iterator localIterator = localCollection.iterator();
      do
        if (!localIterator.hasNext())
          break;
      while (!((SettableBeanProperty)localIterator.next()).hasViews());
    }
    while (true)
    {
      if (this._objectIdReader != null)
        localBeanPropertyMap = localBeanPropertyMap.withProperty(new ObjectIdValueProperty(this._objectIdReader));
      return new BuilderBasedDeserializer(this, this._beanDesc, localBeanPropertyMap, this._backRefProperties, this._ignorableProps, this._ignoreAllUnknown, bool1);
      bool2 = false;
      break;
      label277: bool1 = bool2;
    }
  }

  public SettableBeanProperty findProperty(String paramString)
  {
    return (SettableBeanProperty)this._properties.get(paramString);
  }

  public SettableAnyProperty getAnySetter()
  {
    return this._anySetter;
  }

  public AnnotatedMethod getBuildMethod()
  {
    return this._buildMethod;
  }

  public List<ValueInjector> getInjectables()
  {
    return this._injectables;
  }

  public ObjectIdReader getObjectIdReader()
  {
    return this._objectIdReader;
  }

  public ValueInstantiator getValueInstantiator()
  {
    return this._valueInstantiator;
  }

  public void setAnySetter(SettableAnyProperty paramSettableAnyProperty)
  {
    if ((this._anySetter != null) && (paramSettableAnyProperty != null))
      throw new IllegalStateException("_anySetter already set to non-null");
    this._anySetter = paramSettableAnyProperty;
  }

  public void setIgnoreUnknownProperties(boolean paramBoolean)
  {
    this._ignoreAllUnknown = paramBoolean;
  }

  public void setObjectIdReader(ObjectIdReader paramObjectIdReader)
  {
    this._objectIdReader = paramObjectIdReader;
  }

  public void setPOJOBuilder(AnnotatedMethod paramAnnotatedMethod, JsonPOJOBuilder.Value paramValue)
  {
    this._buildMethod = paramAnnotatedMethod;
    this._builderConfig = paramValue;
  }

  public void setValueInstantiator(ValueInstantiator paramValueInstantiator)
  {
    this._valueInstantiator = paramValueInstantiator;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
