package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.lang.reflect.Array;

@JacksonStdImpl
public class ObjectArrayDeserializer extends ContainerDeserializerBase<Object[]>
  implements ContextualDeserializer
{
  protected final ArrayType _arrayType;
  protected final Class<?> _elementClass;
  protected JsonDeserializer<Object> _elementDeserializer;
  protected final TypeDeserializer _elementTypeDeserializer;
  protected final boolean _untyped;

  public ObjectArrayDeserializer(ArrayType paramArrayType, JsonDeserializer<Object> paramJsonDeserializer, TypeDeserializer paramTypeDeserializer)
  {
    super([Ljava.lang.Object.class);
    this._arrayType = paramArrayType;
    this._elementClass = paramArrayType.getContentType().getRawClass();
    if (this._elementClass == Object.class);
    for (boolean bool = true; ; bool = false)
    {
      this._untyped = bool;
      this._elementDeserializer = paramJsonDeserializer;
      this._elementTypeDeserializer = paramTypeDeserializer;
      return;
    }
  }

  private final Object[] handleNonArray(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    if ((paramJsonParser.getCurrentToken() == JsonToken.VALUE_STRING) && (paramDeserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) && (paramJsonParser.getText().length() == 0))
      return null;
    if (!paramDeserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
    {
      if ((paramJsonParser.getCurrentToken() == JsonToken.VALUE_STRING) && (this._elementClass == Byte.class))
        return deserializeFromBase64(paramJsonParser, paramDeserializationContext);
      throw paramDeserializationContext.mappingException(this._arrayType.getRawClass());
    }
    Object localObject;
    if (paramJsonParser.getCurrentToken() == JsonToken.VALUE_NULL)
    {
      localObject = null;
      if (!this._untyped)
        break label150;
    }
    label150: for (Object[] arrayOfObject = new Object[1]; ; arrayOfObject = (Object[])Array.newInstance(this._elementClass, 1))
    {
      arrayOfObject[0] = localObject;
      return arrayOfObject;
      if (this._elementTypeDeserializer == null)
      {
        localObject = this._elementDeserializer.deserialize(paramJsonParser, paramDeserializationContext);
        break;
      }
      localObject = this._elementDeserializer.deserializeWithType(paramJsonParser, paramDeserializationContext, this._elementTypeDeserializer);
      break;
    }
  }

  public JsonDeserializer<?> createContextual(DeserializationContext paramDeserializationContext, BeanProperty paramBeanProperty)
  {
    JsonDeserializer localJsonDeserializer = this._elementDeserializer;
    if (localJsonDeserializer == null)
      localJsonDeserializer = paramDeserializationContext.findContextualValueDeserializer(this._arrayType.getContentType(), paramBeanProperty);
    while (true)
    {
      TypeDeserializer localTypeDeserializer = this._elementTypeDeserializer;
      if (localTypeDeserializer != null)
        localTypeDeserializer = localTypeDeserializer.forProperty(paramBeanProperty);
      return withDeserializer(localTypeDeserializer, localJsonDeserializer);
      if ((localJsonDeserializer instanceof ContextualDeserializer))
        localJsonDeserializer = ((ContextualDeserializer)localJsonDeserializer).createContextual(paramDeserializationContext, paramBeanProperty);
    }
  }

  public Object[] deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    if (!paramJsonParser.isExpectedStartArrayToken())
      return handleNonArray(paramJsonParser, paramDeserializationContext);
    ObjectBuffer localObjectBuffer = paramDeserializationContext.leaseObjectBuffer();
    Object[] arrayOfObject1 = localObjectBuffer.resetAndStart();
    TypeDeserializer localTypeDeserializer = this._elementTypeDeserializer;
    Object[] arrayOfObject2 = arrayOfObject1;
    int i = 0;
    JsonToken localJsonToken = paramJsonParser.nextToken();
    Object localObject;
    if (localJsonToken != JsonToken.END_ARRAY)
      if (localJsonToken == JsonToken.VALUE_NULL)
      {
        localObject = null;
        label63: if (i < arrayOfObject2.length)
          break label175;
        arrayOfObject2 = localObjectBuffer.appendCompletedChunk(arrayOfObject2);
      }
    label175: for (int j = 0; ; j = i)
    {
      i = j + 1;
      arrayOfObject2[j] = localObject;
      break;
      if (localTypeDeserializer == null)
      {
        localObject = this._elementDeserializer.deserialize(paramJsonParser, paramDeserializationContext);
        break label63;
      }
      localObject = this._elementDeserializer.deserializeWithType(paramJsonParser, paramDeserializationContext, localTypeDeserializer);
      break label63;
      if (this._untyped);
      for (Object[] arrayOfObject3 = localObjectBuffer.completeAndClearBuffer(arrayOfObject2, i); ; arrayOfObject3 = localObjectBuffer.completeAndClearBuffer(arrayOfObject2, i, this._elementClass))
      {
        paramDeserializationContext.returnObjectBuffer(localObjectBuffer);
        return arrayOfObject3;
      }
    }
  }

  protected Byte[] deserializeFromBase64(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    byte[] arrayOfByte = paramJsonParser.getBinaryValue(paramDeserializationContext.getBase64Variant());
    Byte[] arrayOfByte1 = new Byte[arrayOfByte.length];
    int i = 0;
    int j = arrayOfByte.length;
    while (i < j)
    {
      arrayOfByte1[i] = Byte.valueOf(arrayOfByte[i]);
      i++;
    }
    return arrayOfByte1;
  }

  public Object[] deserializeWithType(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, TypeDeserializer paramTypeDeserializer)
  {
    return (Object[])paramTypeDeserializer.deserializeTypedFromArray(paramJsonParser, paramDeserializationContext);
  }

  public JsonDeserializer<Object> getContentDeserializer()
  {
    return this._elementDeserializer;
  }

  public ObjectArrayDeserializer withDeserializer(TypeDeserializer paramTypeDeserializer, JsonDeserializer<?> paramJsonDeserializer)
  {
    if ((paramJsonDeserializer == this._elementDeserializer) && (paramTypeDeserializer == this._elementTypeDeserializer))
      return this;
    return new ObjectArrayDeserializer(this._arrayType, paramJsonDeserializer, paramTypeDeserializer);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
