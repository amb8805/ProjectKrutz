package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;

public class StdDelegatingDeserializer<T> extends StdDeserializer<T>
  implements ContextualDeserializer
{
  private static final long serialVersionUID = 1L;
  protected final Converter<Object, T> _converter;
  protected final JsonDeserializer<Object> _delegateDeserializer;
  protected final JavaType _delegateType;

  protected StdDelegatingDeserializer(Converter<Object, T> paramConverter, JavaType paramJavaType, JsonDeserializer<?> paramJsonDeserializer)
  {
    super(paramJavaType);
    this._converter = paramConverter;
    this._delegateType = paramJavaType;
    this._delegateDeserializer = paramJsonDeserializer;
  }

  protected T convertValue(Object paramObject)
  {
    return this._converter.convert(paramObject);
  }

  public JsonDeserializer<?> createContextual(DeserializationContext paramDeserializationContext, BeanProperty paramBeanProperty)
  {
    TypeFactory localTypeFactory = paramDeserializationContext.getTypeFactory();
    JavaType localJavaType1 = localTypeFactory.constructType(this._converter.getClass());
    JavaType[] arrayOfJavaType = localTypeFactory.findTypeParameters(localJavaType1, Converter.class);
    if ((arrayOfJavaType == null) || (arrayOfJavaType.length != 2))
      throw new JsonMappingException("Could not determine Converter parameterization for " + localJavaType1);
    JavaType localJavaType2 = arrayOfJavaType[0];
    return withDelegate(this._converter, localJavaType2, paramDeserializationContext.findContextualValueDeserializer(localJavaType2, paramBeanProperty));
  }

  public T deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    Object localObject = this._delegateDeserializer.deserialize(paramJsonParser, paramDeserializationContext);
    if (localObject == null)
      return null;
    return convertValue(localObject);
  }

  public Object deserializeWithType(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, TypeDeserializer paramTypeDeserializer)
  {
    Object localObject = this._delegateDeserializer.deserializeWithType(paramJsonParser, paramDeserializationContext, paramTypeDeserializer);
    if (localObject == null)
      return null;
    return convertValue(localObject);
  }

  protected StdDelegatingDeserializer<T> withDelegate(Converter<Object, T> paramConverter, JavaType paramJavaType, JsonDeserializer<?> paramJsonDeserializer)
  {
    if (getClass() != StdDelegatingDeserializer.class)
      throw new IllegalStateException("Sub-class " + getClass().getName() + " must override 'withDelegate'");
    return new StdDelegatingDeserializer(paramConverter, paramJavaType, paramJsonDeserializer);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
