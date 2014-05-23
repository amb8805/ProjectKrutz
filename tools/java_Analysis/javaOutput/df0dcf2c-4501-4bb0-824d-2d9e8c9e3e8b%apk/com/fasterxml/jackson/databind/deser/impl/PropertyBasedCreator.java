package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.Collection;
import java.util.HashMap;

public final class PropertyBasedCreator
{
  protected final Object[] _defaultValues;
  protected final HashMap<String, SettableBeanProperty> _properties;
  protected final SettableBeanProperty[] _propertiesWithInjectables;
  protected final int _propertyCount;
  protected final ValueInstantiator _valueInstantiator;

  protected PropertyBasedCreator(ValueInstantiator paramValueInstantiator, SettableBeanProperty[] paramArrayOfSettableBeanProperty, Object[] paramArrayOfObject)
  {
    this._valueInstantiator = paramValueInstantiator;
    this._properties = new HashMap();
    int i = paramArrayOfSettableBeanProperty.length;
    this._propertyCount = i;
    SettableBeanProperty[] arrayOfSettableBeanProperty = null;
    for (int j = 0; j < i; j++)
    {
      SettableBeanProperty localSettableBeanProperty = paramArrayOfSettableBeanProperty[j];
      this._properties.put(localSettableBeanProperty.getName(), localSettableBeanProperty);
      if (localSettableBeanProperty.getInjectableValueId() != null)
      {
        if (arrayOfSettableBeanProperty == null)
          arrayOfSettableBeanProperty = new SettableBeanProperty[i];
        arrayOfSettableBeanProperty[j] = localSettableBeanProperty;
      }
    }
    this._defaultValues = paramArrayOfObject;
    this._propertiesWithInjectables = arrayOfSettableBeanProperty;
  }

  public static PropertyBasedCreator construct(DeserializationContext paramDeserializationContext, ValueInstantiator paramValueInstantiator, SettableBeanProperty[] paramArrayOfSettableBeanProperty)
  {
    int i = paramArrayOfSettableBeanProperty.length;
    SettableBeanProperty[] arrayOfSettableBeanProperty = new SettableBeanProperty[i];
    int j = 0;
    Object[] arrayOfObject = null;
    SettableBeanProperty localSettableBeanProperty;
    JsonDeserializer localJsonDeserializer;
    Object localObject1;
    if (j < i)
    {
      localSettableBeanProperty = paramArrayOfSettableBeanProperty[j];
      if (!localSettableBeanProperty.hasValueDeserializer())
        localSettableBeanProperty = localSettableBeanProperty.withValueDeserializer(paramDeserializationContext.findContextualValueDeserializer(localSettableBeanProperty.getType(), localSettableBeanProperty));
      arrayOfSettableBeanProperty[j] = localSettableBeanProperty;
      localJsonDeserializer = localSettableBeanProperty.getValueDeserializer();
      if (localJsonDeserializer == null)
      {
        localObject1 = null;
        label75: if ((localObject1 != null) || (!localSettableBeanProperty.getType().isPrimitive()))
          break label156;
      }
    }
    label156: for (Object localObject2 = ClassUtil.defaultValue(localSettableBeanProperty.getType().getRawClass()); ; localObject2 = localObject1)
    {
      if (localObject2 != null)
      {
        if (arrayOfObject == null)
          arrayOfObject = new Object[i];
        arrayOfObject[j] = localObject2;
      }
      j++;
      break;
      localObject1 = localJsonDeserializer.getNullValue();
      break label75;
      return new PropertyBasedCreator(paramValueInstantiator, arrayOfSettableBeanProperty, arrayOfObject);
    }
  }

  public final Object build(DeserializationContext paramDeserializationContext, PropertyValueBuffer paramPropertyValueBuffer)
  {
    Object localObject = paramPropertyValueBuffer.handleIdValue(paramDeserializationContext, this._valueInstantiator.createFromObjectWith(paramDeserializationContext, paramPropertyValueBuffer.getParameters(this._defaultValues)));
    for (PropertyValue localPropertyValue = paramPropertyValueBuffer.buffered(); localPropertyValue != null; localPropertyValue = localPropertyValue.next)
      localPropertyValue.assign(localObject);
    return localObject;
  }

  public final SettableBeanProperty findCreatorProperty(String paramString)
  {
    return (SettableBeanProperty)this._properties.get(paramString);
  }

  public final Collection<SettableBeanProperty> properties()
  {
    return this._properties.values();
  }

  public final PropertyValueBuffer startBuilding(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, ObjectIdReader paramObjectIdReader)
  {
    PropertyValueBuffer localPropertyValueBuffer = new PropertyValueBuffer(paramJsonParser, paramDeserializationContext, this._propertyCount, paramObjectIdReader);
    if (this._propertiesWithInjectables != null)
      localPropertyValueBuffer.inject(this._propertiesWithInjectables);
    return localPropertyValueBuffer;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
