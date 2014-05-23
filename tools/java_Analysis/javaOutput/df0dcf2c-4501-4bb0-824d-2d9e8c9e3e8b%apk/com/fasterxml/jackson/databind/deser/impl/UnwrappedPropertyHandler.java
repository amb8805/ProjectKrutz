package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.ArrayList;
import java.util.Iterator;

public class UnwrappedPropertyHandler
{
  protected final ArrayList<SettableBeanProperty> _properties = new ArrayList();

  public UnwrappedPropertyHandler()
  {
  }

  public void addProperty(SettableBeanProperty paramSettableBeanProperty)
  {
    this._properties.add(paramSettableBeanProperty);
  }

  public Object processUnwrapped(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject, TokenBuffer paramTokenBuffer)
  {
    int i = this._properties.size();
    for (int j = 0; j < i; j++)
    {
      SettableBeanProperty localSettableBeanProperty = (SettableBeanProperty)this._properties.get(j);
      JsonParser localJsonParser = paramTokenBuffer.asParser();
      localJsonParser.nextToken();
      localSettableBeanProperty.deserializeAndSet(localJsonParser, paramDeserializationContext, paramObject);
    }
    return paramObject;
  }

  public void renameAll(NameTransformer paramNameTransformer)
  {
    Iterator localIterator = new ArrayList(this._properties).iterator();
    this._properties.clear();
    while (localIterator.hasNext())
    {
      SettableBeanProperty localSettableBeanProperty1 = (SettableBeanProperty)localIterator.next();
      SettableBeanProperty localSettableBeanProperty2 = localSettableBeanProperty1.withName(paramNameTransformer.transform(localSettableBeanProperty1.getName()));
      JsonDeserializer localJsonDeserializer1 = localSettableBeanProperty2.getValueDeserializer();
      if (localJsonDeserializer1 != null)
      {
        JsonDeserializer localJsonDeserializer2 = localJsonDeserializer1.unwrappingDeserializer(paramNameTransformer);
        if (localJsonDeserializer2 != localJsonDeserializer1)
          localSettableBeanProperty2 = localSettableBeanProperty2.withValueDeserializer(localJsonDeserializer2);
      }
      this._properties.add(localSettableBeanProperty2);
    }
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
