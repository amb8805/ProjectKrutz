package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import java.util.List;

public abstract class BeanDeserializerModifier
{
  public BeanDeserializerModifier()
  {
  }

  public JsonDeserializer<?> modifyDeserializer(DeserializationConfig paramDeserializationConfig, BeanDescription paramBeanDescription, JsonDeserializer<?> paramJsonDeserializer)
  {
    return paramJsonDeserializer;
  }

  public BeanDeserializerBuilder updateBuilder(DeserializationConfig paramDeserializationConfig, BeanDescription paramBeanDescription, BeanDeserializerBuilder paramBeanDeserializerBuilder)
  {
    return paramBeanDeserializerBuilder;
  }

  public List<BeanPropertyDefinition> updateProperties(DeserializationConfig paramDeserializationConfig, BeanDescription paramBeanDescription, List<BeanPropertyDefinition> paramList)
  {
    return paramList;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.BeanDeserializerModifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
