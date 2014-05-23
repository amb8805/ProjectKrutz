package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;

public class JacksonDeserializers
{
  public static StdDeserializer<?>[] all()
  {
    StdDeserializer[] arrayOfStdDeserializer = new StdDeserializer[2];
    arrayOfStdDeserializer[0] = new JacksonDeserializers.JavaTypeDeserializer();
    arrayOfStdDeserializer[1] = new JacksonDeserializers.TokenBufferDeserializer();
    return arrayOfStdDeserializer;
  }

  public static ValueInstantiator findValueInstantiator(DeserializationConfig paramDeserializationConfig, BeanDescription paramBeanDescription)
  {
    if (paramBeanDescription.getBeanClass() == JsonLocation.class)
      return new JacksonDeserializers.JsonLocationInstantiator();
    return null;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.JacksonDeserializers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
