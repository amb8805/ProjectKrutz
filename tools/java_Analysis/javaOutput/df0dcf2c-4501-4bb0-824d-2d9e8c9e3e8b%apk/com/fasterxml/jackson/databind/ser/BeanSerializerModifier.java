package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import java.util.List;

public abstract class BeanSerializerModifier
{
  public BeanSerializerModifier()
  {
  }

  public List<BeanPropertyWriter> changeProperties(SerializationConfig paramSerializationConfig, BeanDescription paramBeanDescription, List<BeanPropertyWriter> paramList)
  {
    return paramList;
  }

  public JsonSerializer<?> modifySerializer(SerializationConfig paramSerializationConfig, BeanDescription paramBeanDescription, JsonSerializer<?> paramJsonSerializer)
  {
    return paramJsonSerializer;
  }

  public List<BeanPropertyWriter> orderProperties(SerializationConfig paramSerializationConfig, BeanDescription paramBeanDescription, List<BeanPropertyWriter> paramList)
  {
    return paramList;
  }

  public BeanSerializerBuilder updateBuilder(SerializationConfig paramSerializationConfig, BeanDescription paramBeanDescription, BeanSerializerBuilder paramBeanSerializerBuilder)
  {
    return paramBeanSerializerBuilder;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.BeanSerializerModifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
