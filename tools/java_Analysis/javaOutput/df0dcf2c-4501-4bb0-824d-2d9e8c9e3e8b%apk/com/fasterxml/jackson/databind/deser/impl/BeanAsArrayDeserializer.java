package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.HashSet;

public class BeanAsArrayDeserializer extends BeanDeserializerBase
{
  private static final long serialVersionUID = 1L;
  protected final BeanDeserializerBase _delegate;
  protected final SettableBeanProperty[] _orderedProperties;

  public BeanAsArrayDeserializer(BeanDeserializerBase paramBeanDeserializerBase, SettableBeanProperty[] paramArrayOfSettableBeanProperty)
  {
    super(paramBeanDeserializerBase);
    this._delegate = paramBeanDeserializerBase;
    this._orderedProperties = paramArrayOfSettableBeanProperty;
  }

  protected Object _deserializeFromNonArray(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    throw paramDeserializationContext.mappingException("Can not deserialize a POJO (of type " + this._beanType.getRawClass().getName() + ") from non-Array representation (token: " + paramJsonParser.getCurrentToken() + "): type/property designed to be serialized as JSON Array");
  }

  protected Object _deserializeNonVanilla(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    if (this._nonStandardCreation)
      return _deserializeWithCreator(paramJsonParser, paramDeserializationContext);
    Object localObject = this._valueInstantiator.createUsingDefault(paramDeserializationContext);
    if (this._injectables != null)
      injectValues(paramDeserializationContext, localObject);
    Class localClass;
    SettableBeanProperty[] arrayOfSettableBeanProperty;
    int i;
    int j;
    if (this._needViewProcesing)
    {
      localClass = paramDeserializationContext.getActiveView();
      arrayOfSettableBeanProperty = this._orderedProperties;
      i = 0;
      j = arrayOfSettableBeanProperty.length;
    }
    while (true)
    {
      if (paramJsonParser.nextToken() == JsonToken.END_ARRAY)
      {
        return localObject;
        localClass = null;
        break;
      }
      if (i == j)
        break label155;
      SettableBeanProperty localSettableBeanProperty = arrayOfSettableBeanProperty[i];
      i++;
      if ((localSettableBeanProperty != null) && ((localClass == null) || (localSettableBeanProperty.visibleInView(localClass))))
        try
        {
          localSettableBeanProperty.deserializeAndSet(paramJsonParser, paramDeserializationContext, localObject);
        }
        catch (Exception localException)
        {
          wrapAndThrow(localException, localObject, localSettableBeanProperty.getName(), paramDeserializationContext);
        }
      else
        paramJsonParser.skipChildren();
    }
    label155: if (!this._ignoreAllUnknown)
      throw paramDeserializationContext.mappingException("Unexpected JSON values; expected at most " + j + " properties (in JSON Array)");
    while (paramJsonParser.nextToken() != JsonToken.END_ARRAY)
      paramJsonParser.skipChildren();
    return localObject;
  }

  protected final Object _deserializeUsingPropertyBased(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    PropertyBasedCreator localPropertyBasedCreator = this._propertyBasedCreator;
    PropertyValueBuffer localPropertyValueBuffer = localPropertyBasedCreator.startBuilding(paramJsonParser, paramDeserializationContext, this._objectIdReader);
    SettableBeanProperty[] arrayOfSettableBeanProperty = this._orderedProperties;
    int i = arrayOfSettableBeanProperty.length;
    int j = 0;
    Object localObject1 = null;
    if (paramJsonParser.nextToken() != JsonToken.END_ARRAY)
    {
      SettableBeanProperty localSettableBeanProperty1;
      if (j < i)
      {
        localSettableBeanProperty1 = arrayOfSettableBeanProperty[j];
        label58: if (localSettableBeanProperty1 != null)
          break label80;
        paramJsonParser.skipChildren();
      }
      while (true)
      {
        j++;
        break;
        localSettableBeanProperty1 = null;
        break label58;
        label80: if (localObject1 != null)
        {
          try
          {
            localSettableBeanProperty1.deserializeAndSet(paramJsonParser, paramDeserializationContext, localObject1);
          }
          catch (Exception localException3)
          {
            wrapAndThrow(localException3, localObject1, localSettableBeanProperty1.getName(), paramDeserializationContext);
          }
        }
        else
        {
          String str = localSettableBeanProperty1.getName();
          SettableBeanProperty localSettableBeanProperty2 = localPropertyBasedCreator.findCreatorProperty(str);
          if (localSettableBeanProperty2 != null)
          {
            Object localObject3 = localSettableBeanProperty2.deserialize(paramJsonParser, paramDeserializationContext);
            if (localPropertyValueBuffer.assignParameter(localSettableBeanProperty2.getCreatorIndex(), localObject3))
              try
              {
                Object localObject4 = localPropertyBasedCreator.build(paramDeserializationContext, localPropertyValueBuffer);
                localObject1 = localObject4;
                if (localObject1.getClass() == this._beanType.getRawClass())
                  continue;
                throw paramDeserializationContext.mappingException("Can not support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type " + this._beanType.getRawClass().getName() + ", actual type " + localObject1.getClass().getName());
              }
              catch (Exception localException2)
              {
                wrapAndThrow(localException2, this._beanType.getRawClass(), str, paramDeserializationContext);
              }
          }
          else if (!localPropertyValueBuffer.readIdProperty(str))
          {
            localPropertyValueBuffer.bufferProperty(localSettableBeanProperty1, localSettableBeanProperty1.deserialize(paramJsonParser, paramDeserializationContext));
          }
        }
      }
    }
    if (localObject1 == null)
      try
      {
        Object localObject2 = localPropertyBasedCreator.build(paramDeserializationContext, localPropertyValueBuffer);
        localObject1 = localObject2;
        return localObject1;
      }
      catch (Exception localException1)
      {
        wrapInstantiationProblem(localException1, paramDeserializationContext);
      }
    return null;
  }

  protected Object _deserializeWithCreator(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    if (this._delegateDeserializer != null)
      return this._valueInstantiator.createUsingDelegate(paramDeserializationContext, this._delegateDeserializer.deserialize(paramJsonParser, paramDeserializationContext));
    if (this._propertyBasedCreator != null)
      return _deserializeUsingPropertyBased(paramJsonParser, paramDeserializationContext);
    if (this._beanType.isAbstract())
      throw JsonMappingException.from(paramJsonParser, "Can not instantiate abstract type " + this._beanType + " (need to add/enable type information?)");
    throw JsonMappingException.from(paramJsonParser, "No suitable constructor found for type " + this._beanType + ": can not instantiate from JSON object (need to add/enable type information?)");
  }

  protected BeanDeserializerBase asArrayDeserializer()
  {
    return this;
  }

  public Object deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    if (paramJsonParser.getCurrentToken() != JsonToken.START_ARRAY)
      return _deserializeFromNonArray(paramJsonParser, paramDeserializationContext);
    if (!this._vanillaProcessing)
      return _deserializeNonVanilla(paramJsonParser, paramDeserializationContext);
    Object localObject = this._valueInstantiator.createUsingDefault(paramDeserializationContext);
    SettableBeanProperty[] arrayOfSettableBeanProperty = this._orderedProperties;
    int i = 0;
    int j = arrayOfSettableBeanProperty.length;
    if (paramJsonParser.nextToken() == JsonToken.END_ARRAY)
      return localObject;
    if (i != j)
    {
      SettableBeanProperty localSettableBeanProperty = arrayOfSettableBeanProperty[i];
      if (localSettableBeanProperty != null);
      while (true)
      {
        try
        {
          localSettableBeanProperty.deserializeAndSet(paramJsonParser, paramDeserializationContext, localObject);
          i++;
        }
        catch (Exception localException)
        {
          wrapAndThrow(localException, localObject, localSettableBeanProperty.getName(), paramDeserializationContext);
          continue;
        }
        paramJsonParser.skipChildren();
      }
    }
    if (!this._ignoreAllUnknown)
      throw paramDeserializationContext.mappingException("Unexpected JSON values; expected at most " + j + " properties (in JSON Array)");
    while (paramJsonParser.nextToken() != JsonToken.END_ARRAY)
      paramJsonParser.skipChildren();
    return localObject;
  }

  public Object deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject)
  {
    if (this._injectables != null)
      injectValues(paramDeserializationContext, paramObject);
    SettableBeanProperty[] arrayOfSettableBeanProperty = this._orderedProperties;
    int i = 0;
    int j = arrayOfSettableBeanProperty.length;
    if (paramJsonParser.nextToken() == JsonToken.END_ARRAY);
    while (true)
    {
      return paramObject;
      if (i != j)
      {
        SettableBeanProperty localSettableBeanProperty = arrayOfSettableBeanProperty[i];
        if (localSettableBeanProperty != null);
        while (true)
        {
          try
          {
            localSettableBeanProperty.deserializeAndSet(paramJsonParser, paramDeserializationContext, paramObject);
            i++;
          }
          catch (Exception localException)
          {
            wrapAndThrow(localException, paramObject, localSettableBeanProperty.getName(), paramDeserializationContext);
            continue;
          }
          paramJsonParser.skipChildren();
        }
      }
      if (!this._ignoreAllUnknown)
        throw paramDeserializationContext.mappingException("Unexpected JSON values; expected at most " + j + " properties (in JSON Array)");
      while (paramJsonParser.nextToken() != JsonToken.END_ARRAY)
        paramJsonParser.skipChildren();
    }
  }

  public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer paramNameTransformer)
  {
    return this._delegate.unwrappingDeserializer(paramNameTransformer);
  }

  public BeanAsArrayDeserializer withIgnorableProperties(HashSet<String> paramHashSet)
  {
    return new BeanAsArrayDeserializer(this._delegate.withIgnorableProperties(paramHashSet), this._orderedProperties);
  }

  public BeanAsArrayDeserializer withObjectIdReader(ObjectIdReader paramObjectIdReader)
  {
    return new BeanAsArrayDeserializer(this._delegate.withObjectIdReader(paramObjectIdReader), this._orderedProperties);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
