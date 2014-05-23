package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.Annotations;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class ManagedReferenceProperty extends SettableBeanProperty
{
  private static final long serialVersionUID = 1L;
  protected final SettableBeanProperty _backProperty;
  protected final boolean _isContainer;
  protected final SettableBeanProperty _managedProperty;
  protected final String _referenceName;

  public ManagedReferenceProperty(SettableBeanProperty paramSettableBeanProperty1, String paramString, SettableBeanProperty paramSettableBeanProperty2, Annotations paramAnnotations, boolean paramBoolean)
  {
    super(paramSettableBeanProperty1.getName(), paramSettableBeanProperty1.getType(), paramSettableBeanProperty1.getValueTypeDeserializer(), paramAnnotations);
    this._referenceName = paramString;
    this._managedProperty = paramSettableBeanProperty1;
    this._backProperty = paramSettableBeanProperty2;
    this._isContainer = paramBoolean;
  }

  protected ManagedReferenceProperty(ManagedReferenceProperty paramManagedReferenceProperty, JsonDeserializer<?> paramJsonDeserializer)
  {
    super(paramManagedReferenceProperty, paramJsonDeserializer);
    this._referenceName = paramManagedReferenceProperty._referenceName;
    this._isContainer = paramManagedReferenceProperty._isContainer;
    this._managedProperty = paramManagedReferenceProperty._managedProperty;
    this._backProperty = paramManagedReferenceProperty._backProperty;
  }

  protected ManagedReferenceProperty(ManagedReferenceProperty paramManagedReferenceProperty, String paramString)
  {
    super(paramManagedReferenceProperty, paramString);
    this._referenceName = paramManagedReferenceProperty._referenceName;
    this._isContainer = paramManagedReferenceProperty._isContainer;
    this._managedProperty = paramManagedReferenceProperty._managedProperty;
    this._backProperty = paramManagedReferenceProperty._backProperty;
  }

  public final void deserializeAndSet(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject)
  {
    set(paramObject, this._managedProperty.deserialize(paramJsonParser, paramDeserializationContext));
  }

  public final Object deserializeSetAndReturn(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject)
  {
    return setAndReturn(paramObject, deserialize(paramJsonParser, paramDeserializationContext));
  }

  public final AnnotatedMember getMember()
  {
    return this._managedProperty.getMember();
  }

  public final void set(Object paramObject1, Object paramObject2)
  {
    setAndReturn(paramObject1, paramObject2);
  }

  public final Object setAndReturn(Object paramObject1, Object paramObject2)
  {
    Object localObject1 = this._managedProperty.setAndReturn(paramObject1, paramObject2);
    if (paramObject2 != null)
    {
      if (this._isContainer)
      {
        if ((paramObject2 instanceof Object[]))
          for (Object localObject4 : (Object[])paramObject2)
            if (localObject4 != null)
              this._backProperty.set(localObject4, paramObject1);
        if ((paramObject2 instanceof Collection))
        {
          Iterator localIterator2 = ((Collection)paramObject2).iterator();
          while (localIterator2.hasNext())
          {
            Object localObject3 = localIterator2.next();
            if (localObject3 != null)
              this._backProperty.set(localObject3, paramObject1);
          }
        }
        if ((paramObject2 instanceof Map))
        {
          Iterator localIterator1 = ((Map)paramObject2).values().iterator();
          while (localIterator1.hasNext())
          {
            Object localObject2 = localIterator1.next();
            if (localObject2 != null)
              this._backProperty.set(localObject2, paramObject1);
          }
        }
        throw new IllegalStateException("Unsupported container type (" + paramObject2.getClass().getName() + ") when resolving reference '" + this._referenceName + "'");
      }
      this._backProperty.set(paramObject2, paramObject1);
    }
    return localObject1;
  }

  public final ManagedReferenceProperty withName(String paramString)
  {
    return new ManagedReferenceProperty(this, paramString);
  }

  public final ManagedReferenceProperty withValueDeserializer(JsonDeserializer<?> paramJsonDeserializer)
  {
    return new ManagedReferenceProperty(this, paramJsonDeserializer);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
