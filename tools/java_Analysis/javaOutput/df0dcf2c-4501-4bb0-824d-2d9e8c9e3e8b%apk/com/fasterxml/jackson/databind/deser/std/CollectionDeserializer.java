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
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.Collection;

@JacksonStdImpl
public class CollectionDeserializer extends ContainerDeserializerBase<Collection<Object>>
  implements ContextualDeserializer
{
  protected final JavaType _collectionType;
  protected final JsonDeserializer<Object> _delegateDeserializer;
  protected final JsonDeserializer<Object> _valueDeserializer;
  protected final ValueInstantiator _valueInstantiator;
  protected final TypeDeserializer _valueTypeDeserializer;

  public CollectionDeserializer(JavaType paramJavaType, JsonDeserializer<Object> paramJsonDeserializer, TypeDeserializer paramTypeDeserializer, ValueInstantiator paramValueInstantiator)
  {
    this(paramJavaType, paramJsonDeserializer, paramTypeDeserializer, paramValueInstantiator, null);
  }

  protected CollectionDeserializer(JavaType paramJavaType, JsonDeserializer<Object> paramJsonDeserializer1, TypeDeserializer paramTypeDeserializer, ValueInstantiator paramValueInstantiator, JsonDeserializer<Object> paramJsonDeserializer2)
  {
    super(paramJavaType.getRawClass());
    this._collectionType = paramJavaType;
    this._valueDeserializer = paramJsonDeserializer1;
    this._valueTypeDeserializer = paramTypeDeserializer;
    this._valueInstantiator = paramValueInstantiator;
    this._delegateDeserializer = paramJsonDeserializer2;
  }

  private final Collection<Object> handleNonArray(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Collection<Object> paramCollection)
  {
    if (!paramDeserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
      throw paramDeserializationContext.mappingException(this._collectionType.getRawClass());
    JsonDeserializer localJsonDeserializer = this._valueDeserializer;
    TypeDeserializer localTypeDeserializer = this._valueTypeDeserializer;
    Object localObject;
    if (paramJsonParser.getCurrentToken() == JsonToken.VALUE_NULL)
      localObject = null;
    while (true)
    {
      paramCollection.add(localObject);
      return paramCollection;
      if (localTypeDeserializer == null)
        localObject = localJsonDeserializer.deserialize(paramJsonParser, paramDeserializationContext);
      else
        localObject = localJsonDeserializer.deserializeWithType(paramJsonParser, paramDeserializationContext, localTypeDeserializer);
    }
  }

  public CollectionDeserializer createContextual(DeserializationContext paramDeserializationContext, BeanProperty paramBeanProperty)
  {
    JavaType localJavaType;
    if ((this._valueInstantiator != null) && (this._valueInstantiator.canCreateUsingDelegate()))
    {
      localJavaType = this._valueInstantiator.getDelegateType(paramDeserializationContext.getConfig());
      if (localJavaType == null)
        throw new IllegalArgumentException("Invalid delegate-creator definition for " + this._collectionType + ": value instantiator (" + this._valueInstantiator.getClass().getName() + ") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'");
    }
    for (JsonDeserializer localJsonDeserializer1 = findDeserializer(paramDeserializationContext, localJavaType, paramBeanProperty); ; localJsonDeserializer1 = null)
    {
      JsonDeserializer localJsonDeserializer2 = this._valueDeserializer;
      if (localJsonDeserializer2 == null)
        localJsonDeserializer2 = paramDeserializationContext.findContextualValueDeserializer(this._collectionType.getContentType(), paramBeanProperty);
      while (true)
      {
        TypeDeserializer localTypeDeserializer = this._valueTypeDeserializer;
        if (localTypeDeserializer != null)
          localTypeDeserializer = localTypeDeserializer.forProperty(paramBeanProperty);
        return withResolved(localJsonDeserializer1, localJsonDeserializer2, localTypeDeserializer);
        if ((localJsonDeserializer2 instanceof ContextualDeserializer))
          localJsonDeserializer2 = ((ContextualDeserializer)localJsonDeserializer2).createContextual(paramDeserializationContext, paramBeanProperty);
      }
    }
  }

  public Collection<Object> deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    if (this._delegateDeserializer != null)
      return (Collection)this._valueInstantiator.createUsingDelegate(paramDeserializationContext, this._delegateDeserializer.deserialize(paramJsonParser, paramDeserializationContext));
    if (paramJsonParser.getCurrentToken() == JsonToken.VALUE_STRING)
    {
      String str = paramJsonParser.getText();
      if (str.length() == 0)
        return (Collection)this._valueInstantiator.createFromString(paramDeserializationContext, str);
    }
    return deserialize(paramJsonParser, paramDeserializationContext, (Collection)this._valueInstantiator.createUsingDefault(paramDeserializationContext));
  }

  public Collection<Object> deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Collection<Object> paramCollection)
  {
    if (!paramJsonParser.isExpectedStartArrayToken())
      paramCollection = handleNonArray(paramJsonParser, paramDeserializationContext, paramCollection);
    JsonDeserializer localJsonDeserializer;
    TypeDeserializer localTypeDeserializer;
    JsonToken localJsonToken;
    do
    {
      return paramCollection;
      localJsonDeserializer = this._valueDeserializer;
      localTypeDeserializer = this._valueTypeDeserializer;
      localJsonToken = paramJsonParser.nextToken();
    }
    while (localJsonToken == JsonToken.END_ARRAY);
    Object localObject;
    if (localJsonToken == JsonToken.VALUE_NULL)
      localObject = null;
    while (true)
    {
      paramCollection.add(localObject);
      break;
      if (localTypeDeserializer == null)
        localObject = localJsonDeserializer.deserialize(paramJsonParser, paramDeserializationContext);
      else
        localObject = localJsonDeserializer.deserializeWithType(paramJsonParser, paramDeserializationContext, localTypeDeserializer);
    }
  }

  public Object deserializeWithType(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, TypeDeserializer paramTypeDeserializer)
  {
    return paramTypeDeserializer.deserializeTypedFromArray(paramJsonParser, paramDeserializationContext);
  }

  public JsonDeserializer<Object> getContentDeserializer()
  {
    return this._valueDeserializer;
  }

  protected CollectionDeserializer withResolved(JsonDeserializer<?> paramJsonDeserializer1, JsonDeserializer<?> paramJsonDeserializer2, TypeDeserializer paramTypeDeserializer)
  {
    if ((paramJsonDeserializer1 == this._delegateDeserializer) && (paramJsonDeserializer2 == this._valueDeserializer) && (paramTypeDeserializer == this._valueTypeDeserializer))
      return this;
    return new CollectionDeserializer(this._collectionType, paramJsonDeserializer2, paramTypeDeserializer, this._valueInstantiator, paramJsonDeserializer1);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
