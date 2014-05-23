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
public final class StringCollectionDeserializer extends ContainerDeserializerBase<Collection<String>>
  implements ContextualDeserializer
{
  private static final long serialVersionUID = 1L;
  protected final JavaType _collectionType;
  protected final JsonDeserializer<Object> _delegateDeserializer;
  protected final JsonDeserializer<String> _valueDeserializer;
  protected final ValueInstantiator _valueInstantiator;

  public StringCollectionDeserializer(JavaType paramJavaType, JsonDeserializer<?> paramJsonDeserializer, ValueInstantiator paramValueInstantiator)
  {
    this(paramJavaType, paramValueInstantiator, null, paramJsonDeserializer);
  }

  protected StringCollectionDeserializer(JavaType paramJavaType, ValueInstantiator paramValueInstantiator, JsonDeserializer<?> paramJsonDeserializer1, JsonDeserializer<?> paramJsonDeserializer2)
  {
    super(paramJavaType.getRawClass());
    this._collectionType = paramJavaType;
    this._valueDeserializer = paramJsonDeserializer2;
    this._valueInstantiator = paramValueInstantiator;
    this._delegateDeserializer = paramJsonDeserializer1;
  }

  private Collection<String> deserializeUsingCustom(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Collection<String> paramCollection, JsonDeserializer<String> paramJsonDeserializer)
  {
    JsonToken localJsonToken = paramJsonParser.nextToken();
    if (localJsonToken != JsonToken.END_ARRAY)
    {
      if (localJsonToken == JsonToken.VALUE_NULL);
      for (Object localObject = null; ; localObject = (String)paramJsonDeserializer.deserialize(paramJsonParser, paramDeserializationContext))
      {
        paramCollection.add(localObject);
        break;
      }
    }
    return paramCollection;
  }

  private final Collection<String> handleNonArray(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Collection<String> paramCollection)
  {
    if (!paramDeserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
      throw paramDeserializationContext.mappingException(this._collectionType.getRawClass());
    JsonDeserializer localJsonDeserializer = this._valueDeserializer;
    Object localObject;
    if (paramJsonParser.getCurrentToken() == JsonToken.VALUE_NULL)
      localObject = null;
    while (true)
    {
      paramCollection.add(localObject);
      return paramCollection;
      if (localJsonDeserializer == null)
        localObject = _parseString(paramJsonParser, paramDeserializationContext);
      else
        localObject = (String)localJsonDeserializer.deserialize(paramJsonParser, paramDeserializationContext);
    }
  }

  public final JsonDeserializer<?> createContextual(DeserializationContext paramDeserializationContext, BeanProperty paramBeanProperty)
  {
    if ((this._valueInstantiator != null) && (this._valueInstantiator.getDelegateCreator() != null));
    for (JsonDeserializer localJsonDeserializer1 = findDeserializer(paramDeserializationContext, this._valueInstantiator.getDelegateType(paramDeserializationContext.getConfig()), paramBeanProperty); ; localJsonDeserializer1 = null)
    {
      JsonDeserializer localJsonDeserializer2 = this._valueDeserializer;
      JsonDeserializer localJsonDeserializer3;
      if (localJsonDeserializer2 == null)
      {
        localJsonDeserializer2 = paramDeserializationContext.findContextualValueDeserializer(this._collectionType.getContentType(), paramBeanProperty);
        boolean bool = isDefaultDeserializer(localJsonDeserializer2);
        localJsonDeserializer3 = null;
        if (!bool)
          break label109;
      }
      while (true)
      {
        return withResolved(localJsonDeserializer1, localJsonDeserializer3);
        if (!(localJsonDeserializer2 instanceof ContextualDeserializer))
          break;
        localJsonDeserializer2 = ((ContextualDeserializer)localJsonDeserializer2).createContextual(paramDeserializationContext, paramBeanProperty);
        break;
        label109: localJsonDeserializer3 = localJsonDeserializer2;
      }
    }
  }

  public final Collection<String> deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    if (this._delegateDeserializer != null)
      return (Collection)this._valueInstantiator.createUsingDelegate(paramDeserializationContext, this._delegateDeserializer.deserialize(paramJsonParser, paramDeserializationContext));
    return deserialize(paramJsonParser, paramDeserializationContext, (Collection)this._valueInstantiator.createUsingDefault(paramDeserializationContext));
  }

  public final Collection<String> deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Collection<String> paramCollection)
  {
    if (!paramJsonParser.isExpectedStartArrayToken())
      paramCollection = handleNonArray(paramJsonParser, paramDeserializationContext, paramCollection);
    JsonToken localJsonToken;
    do
    {
      return paramCollection;
      if (this._valueDeserializer != null)
        return deserializeUsingCustom(paramJsonParser, paramDeserializationContext, paramCollection, this._valueDeserializer);
      localJsonToken = paramJsonParser.nextToken();
    }
    while (localJsonToken == JsonToken.END_ARRAY);
    if (localJsonToken == JsonToken.VALUE_NULL);
    for (Object localObject = null; ; localObject = _parseString(paramJsonParser, paramDeserializationContext))
    {
      paramCollection.add(localObject);
      break;
    }
  }

  public final Object deserializeWithType(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, TypeDeserializer paramTypeDeserializer)
  {
    return paramTypeDeserializer.deserializeTypedFromArray(paramJsonParser, paramDeserializationContext);
  }

  public final JsonDeserializer<Object> getContentDeserializer()
  {
    return this._valueDeserializer;
  }

  protected final StringCollectionDeserializer withResolved(JsonDeserializer<?> paramJsonDeserializer1, JsonDeserializer<?> paramJsonDeserializer2)
  {
    if ((this._valueDeserializer == paramJsonDeserializer2) && (this._delegateDeserializer == paramJsonDeserializer1))
      return this;
    return new StringCollectionDeserializer(this._collectionType, this._valueInstantiator, paramJsonDeserializer1, paramJsonDeserializer2);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
