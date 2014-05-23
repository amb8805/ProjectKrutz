package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Constructor;

public final class InnerClassProperty extends SettableBeanProperty
{
  private static final long serialVersionUID = 1L;
  protected final Constructor<?> _creator;
  protected final SettableBeanProperty _delegate;

  public InnerClassProperty(SettableBeanProperty paramSettableBeanProperty, Constructor<?> paramConstructor)
  {
    super(paramSettableBeanProperty);
    this._delegate = paramSettableBeanProperty;
    this._creator = paramConstructor;
  }

  protected InnerClassProperty(InnerClassProperty paramInnerClassProperty, JsonDeserializer<?> paramJsonDeserializer)
  {
    super(paramInnerClassProperty, paramJsonDeserializer);
    this._delegate = paramInnerClassProperty._delegate.withValueDeserializer(paramJsonDeserializer);
    this._creator = paramInnerClassProperty._creator;
  }

  protected InnerClassProperty(InnerClassProperty paramInnerClassProperty, String paramString)
  {
    super(paramInnerClassProperty, paramString);
    this._delegate = paramInnerClassProperty._delegate.withName(paramString);
    this._creator = paramInnerClassProperty._creator;
  }

  public final void deserializeAndSet(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject)
  {
    if (paramJsonParser.getCurrentToken() == JsonToken.VALUE_NULL)
    {
      NullProvider localNullProvider = this._nullProvider;
      localObject1 = null;
      if (localNullProvider != null);
    }
    while (true)
    {
      set(paramObject, localObject1);
      return;
      localObject1 = this._nullProvider.nullValue(paramDeserializationContext);
      continue;
      if (this._valueTypeDeserializer != null)
      {
        localObject1 = this._valueDeserializer.deserializeWithType(paramJsonParser, paramDeserializationContext, this._valueTypeDeserializer);
        continue;
      }
      try
      {
        Object localObject2 = this._creator.newInstance(new Object[] { paramObject });
        localObject1 = localObject2;
        this._valueDeserializer.deserialize(paramJsonParser, paramDeserializationContext, localObject1);
      }
      catch (Exception localException)
      {
        while (true)
        {
          ClassUtil.unwrapAndThrowAsIAE(localException, "Failed to instantiate class " + this._creator.getDeclaringClass().getName() + ", problem: " + localException.getMessage());
          localObject1 = null;
        }
      }
    }
  }

  public final Object deserializeSetAndReturn(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject)
  {
    return setAndReturn(paramObject, deserialize(paramJsonParser, paramDeserializationContext));
  }

  public final AnnotatedMember getMember()
  {
    return this._delegate.getMember();
  }

  public final void set(Object paramObject1, Object paramObject2)
  {
    this._delegate.set(paramObject1, paramObject2);
  }

  public final Object setAndReturn(Object paramObject1, Object paramObject2)
  {
    return this._delegate.setAndReturn(paramObject1, paramObject2);
  }

  public final InnerClassProperty withName(String paramString)
  {
    return new InnerClassProperty(this, paramString);
  }

  public final InnerClassProperty withValueDeserializer(JsonDeserializer<?> paramJsonDeserializer)
  {
    return new InnerClassProperty(this, paramJsonDeserializer);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.impl.InnerClassProperty
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
