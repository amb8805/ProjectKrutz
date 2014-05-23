package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;;
import java.util.Collection;
import java.util.Iterator;

public class CollectionSerializer extends AsArraySerializerBase<Collection<?>>
{
  public CollectionSerializer(JavaType paramJavaType, boolean paramBoolean, TypeSerializer paramTypeSerializer, BeanProperty paramBeanProperty, JsonSerializer<Object> paramJsonSerializer)
  {
    super(Collection.class, paramJavaType, paramBoolean, paramTypeSerializer, paramBeanProperty, paramJsonSerializer);
  }

  public CollectionSerializer(CollectionSerializer paramCollectionSerializer, BeanProperty paramBeanProperty, TypeSerializer paramTypeSerializer, JsonSerializer<?> paramJsonSerializer)
  {
    super(paramCollectionSerializer, paramBeanProperty, paramTypeSerializer, paramJsonSerializer);
  }

  public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer paramTypeSerializer)
  {
    return new CollectionSerializer(this._elementType, this._staticTyping, paramTypeSerializer, this._property, this._elementSerializer);
  }

  public boolean hasSingleElement(Collection<?> paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    if (!localIterator.hasNext());
    do
    {
      return false;
      localIterator.next();
    }
    while (localIterator.hasNext());
    return true;
  }

  public boolean isEmpty(Collection<?> paramCollection)
  {
    return (paramCollection == null) || (paramCollection.isEmpty());
  }

  public void serializeContents(Collection<?> paramCollection, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    if (this._elementSerializer != null)
      serializeContentsUsing(paramCollection, paramJsonGenerator, paramSerializerProvider, this._elementSerializer);
    Iterator localIterator;
    do
    {
      return;
      localIterator = paramCollection.iterator();
    }
    while (!localIterator.hasNext());
    Object localObject1 = this._dynamicSerializers;
    TypeSerializer localTypeSerializer = this._valueTypeSerializer;
    int i = 0;
    Object localObject2;
    try
    {
      localObject2 = localIterator.next();
      if (localObject2 == null)
        paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
      while (true)
      {
        i++;
        if (localIterator.hasNext())
          break;
        return;
        localClass = localObject2.getClass();
        localObject3 = ((PropertySerializerMap)localObject1).serializerFor(localClass);
        if (localObject3 == null)
        {
          if (!this._elementType.hasGenericTypes())
            break label183;
          localJsonSerializer1 = _findAndAddDynamic((PropertySerializerMap)localObject1, paramSerializerProvider.constructSpecializedType(this._elementType, localClass), paramSerializerProvider);
          localPropertySerializerMap = this._dynamicSerializers;
          localJsonSerializer2 = localJsonSerializer1;
          localObject1 = localPropertySerializerMap;
          localObject3 = localJsonSerializer2;
        }
        if (localTypeSerializer != null)
          break label197;
        ((JsonSerializer)localObject3).serialize(localObject2, paramJsonGenerator, paramSerializerProvider);
      }
    }
    catch (Exception localException)
    {
      wrapAndThrow(paramSerializerProvider, localException, paramCollection, i);
      return;
    }
    while (true)
    {
      Class localClass;
      Object localObject3;
      PropertySerializerMap localPropertySerializerMap;
      JsonSerializer localJsonSerializer2;
      label183: JsonSerializer localJsonSerializer1 = _findAndAddDynamic((PropertySerializerMap)localObject1, localClass, paramSerializerProvider);
      continue;
      label197: ((JsonSerializer)localObject3).serializeWithType(localObject2, paramJsonGenerator, paramSerializerProvider, localTypeSerializer);
    }
  }

  public void serializeContentsUsing(Collection<?> paramCollection, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, JsonSerializer<Object> paramJsonSerializer)
  {
    localIterator = paramCollection.iterator();
    if (localIterator.hasNext())
    {
      localTypeSerializer = this._valueTypeSerializer;
      i = 0;
      while (true)
      {
        localObject = localIterator.next();
        if (localObject == null)
          try
          {
            paramSerializerProvider.defaultSerializeNull(paramJsonGenerator);
            while (true)
            {
              i++;
              if (localIterator.hasNext())
                break;
              return;
              if (localTypeSerializer != null)
                break label92;
              paramJsonSerializer.serialize(localObject, paramJsonGenerator, paramSerializerProvider);
            }
          }
          catch (Exception localException)
          {
            while (true)
            {
              wrapAndThrow(paramSerializerProvider, localException, paramCollection, i);
              continue;
              paramJsonSerializer.serializeWithType(localObject, paramJsonGenerator, paramSerializerProvider, localTypeSerializer);
            }
          }
      }
    }
  }

  public CollectionSerializer withResolved(BeanProperty paramBeanProperty, TypeSerializer paramTypeSerializer, JsonSerializer<?> paramJsonSerializer)
  {
    return new CollectionSerializer(this, paramBeanProperty, paramTypeSerializer, paramJsonSerializer);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.std.CollectionSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
