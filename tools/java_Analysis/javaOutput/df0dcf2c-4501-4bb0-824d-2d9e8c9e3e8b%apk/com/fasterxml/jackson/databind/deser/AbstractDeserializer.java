package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.Serializable;
import java.util.Map;

public class AbstractDeserializer extends JsonDeserializer<Object>
  implements Serializable
{
  private static final long serialVersionUID = -3010349050434697698L;
  protected final boolean _acceptBoolean;
  protected final boolean _acceptDouble;
  protected final boolean _acceptInt;
  protected final boolean _acceptString;
  protected final Map<String, SettableBeanProperty> _backRefProperties;
  protected final JavaType _baseType;
  protected final ObjectIdReader _objectIdReader;

  public AbstractDeserializer(BeanDeserializerBuilder paramBeanDeserializerBuilder, BeanDescription paramBeanDescription, Map<String, SettableBeanProperty> paramMap)
  {
    this._baseType = paramBeanDescription.getType();
    this._objectIdReader = paramBeanDeserializerBuilder.getObjectIdReader();
    this._backRefProperties = paramMap;
    Class localClass = this._baseType.getRawClass();
    this._acceptString = localClass.isAssignableFrom(String.class);
    boolean bool1;
    if ((localClass == Boolean.TYPE) || (localClass.isAssignableFrom(Boolean.class)))
    {
      bool1 = true;
      this._acceptBoolean = bool1;
      if ((localClass != Integer.TYPE) && (!localClass.isAssignableFrom(Integer.class)))
        break label140;
    }
    label140: for (boolean bool2 = true; ; bool2 = false)
    {
      this._acceptInt = bool2;
      boolean bool3;
      if (localClass != Double.TYPE)
      {
        boolean bool4 = localClass.isAssignableFrom(Double.class);
        bool3 = false;
        if (!bool4);
      }
      else
      {
        bool3 = true;
      }
      this._acceptDouble = bool3;
      return;
      bool1 = false;
      break;
    }
  }

  protected Object _deserializeFromObjectId(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    Object localObject1 = this._objectIdReader.deserializer.deserialize(paramJsonParser, paramDeserializationContext);
    Object localObject2 = paramDeserializationContext.findObjectId(localObject1, this._objectIdReader.generator).item;
    if (localObject2 == null)
      throw new IllegalStateException("Could not resolve Object Id [" + localObject1 + "] -- unresolved forward-reference?");
    return localObject2;
  }

  protected Object _deserializeIfNatural(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    switch (AbstractDeserializer.1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[paramJsonParser.getCurrentToken().ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
              return null;
            while (!this._acceptString);
            return paramJsonParser.getText();
          }
          while (!this._acceptInt);
          return Integer.valueOf(paramJsonParser.getIntValue());
        }
        while (!this._acceptDouble);
        return Double.valueOf(paramJsonParser.getDoubleValue());
      }
      while (!this._acceptBoolean);
      return Boolean.TRUE;
    }
    while (!this._acceptBoolean);
    return Boolean.FALSE;
  }

  public Object deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    throw paramDeserializationContext.instantiationException(this._baseType.getRawClass(), "abstract types either need to be mapped to concrete types, have custom deserializer, or be instantiated with additional type information");
  }

  public Object deserializeWithType(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, TypeDeserializer paramTypeDeserializer)
  {
    Object localObject;
    if (this._objectIdReader != null)
    {
      JsonToken localJsonToken = paramJsonParser.getCurrentToken();
      if ((localJsonToken != null) && (localJsonToken.isScalarValue()))
        localObject = _deserializeFromObjectId(paramJsonParser, paramDeserializationContext);
    }
    do
    {
      return localObject;
      localObject = _deserializeIfNatural(paramJsonParser, paramDeserializationContext);
    }
    while (localObject != null);
    return paramTypeDeserializer.deserializeTypedFromObject(paramJsonParser, paramDeserializationContext);
  }

  public SettableBeanProperty findBackReference(String paramString)
  {
    if (this._backRefProperties == null)
      return null;
    return (SettableBeanProperty)this._backRefProperties.get(paramString);
  }

  public boolean isCachable()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.AbstractDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
