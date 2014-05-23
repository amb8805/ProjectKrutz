package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;

public final class ObjectIdValueProperty extends SettableBeanProperty
{
  private static final long serialVersionUID = 1L;
  protected final ObjectIdReader _objectIdReader;

  public ObjectIdValueProperty(ObjectIdReader paramObjectIdReader)
  {
    super(paramObjectIdReader.propertyName, paramObjectIdReader.idType, null, null);
    this._objectIdReader = paramObjectIdReader;
    this._valueDeserializer = paramObjectIdReader.deserializer;
  }

  protected ObjectIdValueProperty(ObjectIdValueProperty paramObjectIdValueProperty, JsonDeserializer<?> paramJsonDeserializer)
  {
    super(paramObjectIdValueProperty, paramJsonDeserializer);
    this._objectIdReader = paramObjectIdValueProperty._objectIdReader;
  }

  protected ObjectIdValueProperty(ObjectIdValueProperty paramObjectIdValueProperty, String paramString)
  {
    super(paramObjectIdValueProperty, paramString);
    this._objectIdReader = paramObjectIdValueProperty._objectIdReader;
  }

  public final void deserializeAndSet(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject)
  {
    deserializeSetAndReturn(paramJsonParser, paramDeserializationContext, paramObject);
  }

  public final Object deserializeSetAndReturn(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject)
  {
    Object localObject = this._valueDeserializer.deserialize(paramJsonParser, paramDeserializationContext);
    paramDeserializationContext.findObjectId(localObject, this._objectIdReader.generator).bindItem(paramObject);
    SettableBeanProperty localSettableBeanProperty = this._objectIdReader.idProperty;
    if (localSettableBeanProperty != null)
      paramObject = localSettableBeanProperty.setAndReturn(paramObject, localObject);
    return paramObject;
  }

  public final AnnotatedMember getMember()
  {
    return null;
  }

  public final void set(Object paramObject1, Object paramObject2)
  {
    setAndReturn(paramObject1, paramObject2);
  }

  public final Object setAndReturn(Object paramObject1, Object paramObject2)
  {
    SettableBeanProperty localSettableBeanProperty = this._objectIdReader.idProperty;
    if (localSettableBeanProperty == null)
      throw new UnsupportedOperationException("Should not call set() on ObjectIdProperty that has no SettableBeanProperty");
    return localSettableBeanProperty.setAndReturn(paramObject1, paramObject2);
  }

  public final ObjectIdValueProperty withName(String paramString)
  {
    return new ObjectIdValueProperty(this, paramString);
  }

  public final ObjectIdValueProperty withValueDeserializer(JsonDeserializer<?> paramJsonDeserializer)
  {
    return new ObjectIdValueProperty(this, paramJsonDeserializer);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
