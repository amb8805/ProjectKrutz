package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.HashMap;

public class ExternalTypeHandler
{
  private final HashMap<String, Integer> _nameToPropertyIndex;
  private final ExternalTypeHandler.ExtTypedProperty[] _properties;
  private final TokenBuffer[] _tokens;
  private final String[] _typeIds;

  protected ExternalTypeHandler(ExternalTypeHandler paramExternalTypeHandler)
  {
    this._properties = paramExternalTypeHandler._properties;
    this._nameToPropertyIndex = paramExternalTypeHandler._nameToPropertyIndex;
    int i = this._properties.length;
    this._typeIds = new String[i];
    this._tokens = new TokenBuffer[i];
  }

  protected ExternalTypeHandler(ExternalTypeHandler.ExtTypedProperty[] paramArrayOfExtTypedProperty, HashMap<String, Integer> paramHashMap, String[] paramArrayOfString, TokenBuffer[] paramArrayOfTokenBuffer)
  {
    this._properties = paramArrayOfExtTypedProperty;
    this._nameToPropertyIndex = paramHashMap;
    this._typeIds = paramArrayOfString;
    this._tokens = paramArrayOfTokenBuffer;
  }

  protected final Object _deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, int paramInt, String paramString)
  {
    TokenBuffer localTokenBuffer = new TokenBuffer(paramJsonParser.getCodec());
    localTokenBuffer.writeStartArray();
    localTokenBuffer.writeString(paramString);
    JsonParser localJsonParser1 = this._tokens[paramInt].asParser(paramJsonParser);
    localJsonParser1.nextToken();
    localTokenBuffer.copyCurrentStructure(localJsonParser1);
    localTokenBuffer.writeEndArray();
    JsonParser localJsonParser2 = localTokenBuffer.asParser(paramJsonParser);
    localJsonParser2.nextToken();
    return this._properties[paramInt].getProperty().deserialize(localJsonParser2, paramDeserializationContext);
  }

  protected final void _deserializeAndSet(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject, int paramInt, String paramString)
  {
    TokenBuffer localTokenBuffer = new TokenBuffer(paramJsonParser.getCodec());
    localTokenBuffer.writeStartArray();
    localTokenBuffer.writeString(paramString);
    JsonParser localJsonParser1 = this._tokens[paramInt].asParser(paramJsonParser);
    localJsonParser1.nextToken();
    localTokenBuffer.copyCurrentStructure(localJsonParser1);
    localTokenBuffer.writeEndArray();
    JsonParser localJsonParser2 = localTokenBuffer.asParser(paramJsonParser);
    localJsonParser2.nextToken();
    this._properties[paramInt].getProperty().deserializeAndSet(localJsonParser2, paramDeserializationContext, paramObject);
  }

  public Object complete(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, PropertyValueBuffer paramPropertyValueBuffer, PropertyBasedCreator paramPropertyBasedCreator)
  {
    int i = this._properties.length;
    Object[] arrayOfObject = new Object[i];
    int j = 0;
    if (j < i)
    {
      String str = this._typeIds[j];
      if (str == null)
        if (this._tokens[j] != null)
        {
          if (!this._properties[j].hasDefaultType())
            throw paramDeserializationContext.mappingException("Missing external type id property '" + this._properties[j].getTypePropertyName() + "'");
          str = this._properties[j].getDefaultTypeId();
        }
      while (this._tokens[j] != null)
      {
        arrayOfObject[j] = _deserialize(paramJsonParser, paramDeserializationContext, j, str);
        j++;
        break;
      }
      SettableBeanProperty localSettableBeanProperty3 = this._properties[j].getProperty();
      throw paramDeserializationContext.mappingException("Missing property '" + localSettableBeanProperty3.getName() + "' for external type id '" + this._properties[j].getTypePropertyName());
    }
    for (int k = 0; k < i; k++)
    {
      SettableBeanProperty localSettableBeanProperty2 = this._properties[k].getProperty();
      if (paramPropertyBasedCreator.findCreatorProperty(localSettableBeanProperty2.getName()) != null)
        paramPropertyValueBuffer.assignParameter(localSettableBeanProperty2.getCreatorIndex(), arrayOfObject[k]);
    }
    Object localObject = paramPropertyBasedCreator.build(paramDeserializationContext, paramPropertyValueBuffer);
    for (int m = 0; m < i; m++)
    {
      SettableBeanProperty localSettableBeanProperty1 = this._properties[m].getProperty();
      if (paramPropertyBasedCreator.findCreatorProperty(localSettableBeanProperty1.getName()) == null)
        localSettableBeanProperty1.set(localObject, arrayOfObject[m]);
    }
    return localObject;
  }

  public Object complete(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject)
  {
    int i = 0;
    int j = this._properties.length;
    if (i < j)
    {
      String str = this._typeIds[i];
      if (str == null)
        if (this._tokens[i] != null)
        {
          if (!this._properties[i].hasDefaultType())
            throw paramDeserializationContext.mappingException("Missing external type id property '" + this._properties[i].getTypePropertyName() + "'");
          str = this._properties[i].getDefaultTypeId();
        }
      while (this._tokens[i] != null)
      {
        _deserializeAndSet(paramJsonParser, paramDeserializationContext, paramObject, i, str);
        i++;
        break;
      }
      SettableBeanProperty localSettableBeanProperty = this._properties[i].getProperty();
      throw paramDeserializationContext.mappingException("Missing property '" + localSettableBeanProperty.getName() + "' for external type id '" + this._properties[i].getTypePropertyName());
    }
    return paramObject;
  }

  public boolean handlePropertyValue(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, String paramString, Object paramObject)
  {
    Integer localInteger = (Integer)this._nameToPropertyIndex.get(paramString);
    if (localInteger == null)
      return false;
    int i = localInteger.intValue();
    int k;
    if (this._properties[i].hasTypePropertyName(paramString))
    {
      this._typeIds[i] = paramJsonParser.getText();
      paramJsonParser.skipChildren();
      if ((paramObject != null) && (this._tokens[i] != null))
        k = 1;
    }
    while (true)
    {
      if (k != 0)
      {
        String str1 = this._typeIds[i];
        this._typeIds[i] = null;
        _deserializeAndSet(paramJsonParser, paramDeserializationContext, paramObject, i, str1);
        this._tokens[i] = null;
      }
      return true;
      k = 0;
      continue;
      TokenBuffer localTokenBuffer = new TokenBuffer(paramJsonParser.getCodec());
      localTokenBuffer.copyCurrentStructure(paramJsonParser);
      this._tokens[i] = localTokenBuffer;
      int j = 0;
      if (paramObject != null)
      {
        String str2 = this._typeIds[i];
        j = 0;
        if (str2 != null)
          j = 1;
      }
      k = j;
    }
  }

  public boolean handleTypePropertyValue(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, String paramString, Object paramObject)
  {
    Integer localInteger = (Integer)this._nameToPropertyIndex.get(paramString);
    if (localInteger == null)
      return false;
    int i = localInteger.intValue();
    if (!this._properties[i].hasTypePropertyName(paramString))
      return false;
    String str = paramJsonParser.getText();
    int j = 0;
    if (paramObject != null)
    {
      TokenBuffer localTokenBuffer = this._tokens[i];
      j = 0;
      if (localTokenBuffer != null)
        j = 1;
    }
    if (j != 0)
    {
      _deserializeAndSet(paramJsonParser, paramDeserializationContext, paramObject, i, str);
      this._tokens[i] = null;
    }
    while (true)
    {
      return true;
      this._typeIds[i] = str;
    }
  }

  public ExternalTypeHandler start()
  {
    return new ExternalTypeHandler(this);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
