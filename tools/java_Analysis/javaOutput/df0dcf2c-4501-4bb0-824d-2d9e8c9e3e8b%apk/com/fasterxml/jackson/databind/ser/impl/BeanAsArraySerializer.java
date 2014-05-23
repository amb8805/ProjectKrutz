package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonMappingException.Reference;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BeanAsArraySerializer extends BeanSerializerBase
{
  protected final BeanSerializerBase _defaultSerializer;

  public BeanAsArraySerializer(BeanSerializerBase paramBeanSerializerBase)
  {
    super(paramBeanSerializerBase, null);
    this._defaultSerializer = paramBeanSerializerBase;
  }

  protected BeanAsArraySerializer(BeanSerializerBase paramBeanSerializerBase, String[] paramArrayOfString)
  {
    super(paramBeanSerializerBase, paramArrayOfString);
    this._defaultSerializer = paramBeanSerializerBase;
  }

  private boolean hasSingleElement(SerializerProvider paramSerializerProvider)
  {
    if ((this._filteredProps != null) && (paramSerializerProvider.getSerializationView() != null));
    for (BeanPropertyWriter[] arrayOfBeanPropertyWriter = this._filteredProps; arrayOfBeanPropertyWriter.length == 1; arrayOfBeanPropertyWriter = this._props)
      return true;
    return false;
  }

  protected BeanSerializerBase asArraySerializer()
  {
    return this;
  }

  public boolean isUnwrappingSerializer()
  {
    return false;
  }

  public final void serialize(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    if ((paramSerializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && (hasSingleElement(paramSerializerProvider)))
    {
      serializeAsArray(paramObject, paramJsonGenerator, paramSerializerProvider);
      return;
    }
    paramJsonGenerator.writeStartArray();
    serializeAsArray(paramObject, paramJsonGenerator, paramSerializerProvider);
    paramJsonGenerator.writeEndArray();
  }

  protected final void serializeAsArray(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    BeanPropertyWriter[] arrayOfBeanPropertyWriter;
    int i;
    if ((this._filteredProps != null) && (paramSerializerProvider.getSerializationView() != null))
    {
      arrayOfBeanPropertyWriter = this._filteredProps;
      while (true)
      {
        i = 0;
        try
        {
          int j = arrayOfBeanPropertyWriter.length;
          label28: if (i < j)
          {
            BeanPropertyWriter localBeanPropertyWriter = arrayOfBeanPropertyWriter[i];
            if (localBeanPropertyWriter == null)
              paramJsonGenerator.writeNull();
            while (true)
            {
              i++;
              break label28;
              arrayOfBeanPropertyWriter = this._props;
              break;
              localBeanPropertyWriter.serializeAsColumn(paramObject, paramJsonGenerator, paramSerializerProvider);
            }
          }
        }
        catch (Exception localException)
        {
          if (i == arrayOfBeanPropertyWriter.length);
          for (String str2 = "[anySetter]"; ; str2 = arrayOfBeanPropertyWriter[i].getName())
          {
            wrapAndThrow(paramSerializerProvider, localException, paramObject, str2);
            return;
          }
        }
        catch (StackOverflowError localStackOverflowError)
        {
          localJsonMappingException = new JsonMappingException("Infinite recursion (StackOverflowError)", localStackOverflowError);
          if (i != arrayOfBeanPropertyWriter.length);
        }
      }
    }
    JsonMappingException localJsonMappingException;
    for (String str1 = "[anySetter]"; ; str1 = arrayOfBeanPropertyWriter[i].getName())
    {
      localJsonMappingException.prependPath(new JsonMappingException.Reference(paramObject, str1));
      throw localJsonMappingException;
    }
  }

  public void serializeWithType(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, TypeSerializer paramTypeSerializer)
  {
    this._defaultSerializer.serializeWithType(paramObject, paramJsonGenerator, paramSerializerProvider, paramTypeSerializer);
  }

  public String toString()
  {
    return "BeanAsArraySerializer for " + handledType().getName();
  }

  public JsonSerializer<Object> unwrappingSerializer(NameTransformer paramNameTransformer)
  {
    return this._defaultSerializer.unwrappingSerializer(paramNameTransformer);
  }

  protected BeanAsArraySerializer withIgnorals(String[] paramArrayOfString)
  {
    return new BeanAsArraySerializer(this, paramArrayOfString);
  }

  public BeanSerializerBase withObjectIdWriter(ObjectIdWriter paramObjectIdWriter)
  {
    return this._defaultSerializer.withObjectIdWriter(paramObjectIdWriter);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
