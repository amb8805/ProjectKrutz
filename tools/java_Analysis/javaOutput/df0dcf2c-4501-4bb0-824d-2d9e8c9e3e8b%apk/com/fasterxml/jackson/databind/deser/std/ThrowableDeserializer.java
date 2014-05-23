package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.HashSet;

public class ThrowableDeserializer extends BeanDeserializer
{
  private static final long serialVersionUID = 1L;

  public ThrowableDeserializer(BeanDeserializer paramBeanDeserializer)
  {
    super(paramBeanDeserializer);
    this._vanillaProcessing = false;
  }

  protected ThrowableDeserializer(BeanDeserializer paramBeanDeserializer, NameTransformer paramNameTransformer)
  {
    super(paramBeanDeserializer, paramNameTransformer);
  }

  public Object deserializeFromObject(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    if (this._propertyBasedCreator != null)
      localObject2 = _deserializeUsingPropertyBased(paramJsonParser, paramDeserializationContext);
    boolean bool1;
    int i;
    Object localObject1;
    do
    {
      return localObject2;
      if (this._delegateDeserializer != null)
        return this._valueInstantiator.createUsingDelegate(paramDeserializationContext, this._delegateDeserializer.deserialize(paramJsonParser, paramDeserializationContext));
      if (this._beanType.isAbstract())
        throw JsonMappingException.from(paramJsonParser, "Can not instantiate abstract type " + this._beanType + " (need to add/enable type information?)");
      bool1 = this._valueInstantiator.canCreateFromString();
      boolean bool2 = this._valueInstantiator.canCreateUsingDefault();
      if ((!bool1) && (!bool2))
        throw new JsonMappingException("Can not deserialize Throwable of type " + this._beanType + " without having a default contructor, a single-String-arg constructor; or explicit @JsonCreator");
      i = 0;
      localObject1 = null;
      localObject2 = null;
      if (paramJsonParser.getCurrentToken() != JsonToken.END_OBJECT)
      {
        String str = paramJsonParser.getCurrentName();
        SettableBeanProperty localSettableBeanProperty = this._beanProperties.find(str);
        paramJsonParser.nextToken();
        int k;
        Object localObject3;
        Object localObject4;
        if (localSettableBeanProperty != null)
          if (localObject2 != null)
          {
            localSettableBeanProperty.deserializeAndSet(paramJsonParser, paramDeserializationContext, localObject2);
            k = i;
            localObject3 = localObject1;
            localObject4 = localObject2;
          }
        while (true)
        {
          paramJsonParser.nextToken();
          localObject2 = localObject4;
          localObject1 = localObject3;
          i = k;
          break;
          if (localObject1 == null)
          {
            int i1 = this._beanProperties.size();
            localObject1 = new Object[i1 + i1];
          }
          int n = i + 1;
          localObject1[i] = localSettableBeanProperty;
          k = n + 1;
          localObject1[n] = localSettableBeanProperty.deserialize(paramJsonParser, paramDeserializationContext);
          localObject3 = localObject1;
          localObject4 = localObject2;
          continue;
          if (("message".equals(str)) && (bool1))
          {
            localObject2 = this._valueInstantiator.createFromString(paramDeserializationContext, paramJsonParser.getText());
            if (localObject1 != null)
            {
              for (int m = 0; m < i; m += 2)
                ((SettableBeanProperty)localObject1[m]).set(localObject2, localObject1[(m + 1)]);
              k = i;
              localObject4 = localObject2;
              localObject3 = null;
            }
          }
          else if ((this._ignorableProps != null) && (this._ignorableProps.contains(str)))
          {
            paramJsonParser.skipChildren();
            k = i;
            localObject3 = localObject1;
            localObject4 = localObject2;
          }
          else if (this._anySetter != null)
          {
            this._anySetter.deserializeAndSet(paramJsonParser, paramDeserializationContext, localObject2, str);
            k = i;
            localObject3 = localObject1;
            localObject4 = localObject2;
          }
          else
          {
            handleUnknownProperty(paramJsonParser, paramDeserializationContext, localObject2, str);
            k = i;
            localObject3 = localObject1;
            localObject4 = localObject2;
          }
        }
      }
    }
    while (localObject2 != null);
    if (bool1);
    for (Object localObject2 = this._valueInstantiator.createFromString(paramDeserializationContext, null); ; localObject2 = this._valueInstantiator.createUsingDefault(paramDeserializationContext))
    {
      int j = 0;
      if (localObject1 == null)
        break;
      while (j < i)
      {
        ((SettableBeanProperty)localObject1[j]).set(localObject2, localObject1[(j + 1)]);
        j += 2;
      }
      break;
    }
  }

  public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer paramNameTransformer)
  {
    if (getClass() != ThrowableDeserializer.class)
      return this;
    return new ThrowableDeserializer(this, paramNameTransformer);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
