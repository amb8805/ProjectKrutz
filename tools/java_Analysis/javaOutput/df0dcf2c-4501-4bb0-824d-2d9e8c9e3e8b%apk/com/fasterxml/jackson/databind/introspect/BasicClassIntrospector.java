package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.SimpleType;
import java.io.Serializable;

public class BasicClassIntrospector extends ClassIntrospector
  implements Serializable
{
  protected static final BasicBeanDescription BOOLEAN_DESC;
  protected static final BasicBeanDescription INT_DESC;
  protected static final BasicBeanDescription LONG_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(Long.TYPE), localAnnotatedClass4);
  protected static final BasicBeanDescription STRING_DESC;
  public static final BasicClassIntrospector instance = new BasicClassIntrospector();
  private static final long serialVersionUID = 1L;

  static
  {
    AnnotatedClass localAnnotatedClass1 = AnnotatedClass.constructWithoutSuperTypes(String.class, null, null);
    STRING_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(String.class), localAnnotatedClass1);
    AnnotatedClass localAnnotatedClass2 = AnnotatedClass.constructWithoutSuperTypes(Boolean.TYPE, null, null);
    BOOLEAN_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(Boolean.TYPE), localAnnotatedClass2);
    AnnotatedClass localAnnotatedClass3 = AnnotatedClass.constructWithoutSuperTypes(Integer.TYPE, null, null);
    INT_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(Integer.TYPE), localAnnotatedClass3);
    AnnotatedClass localAnnotatedClass4 = AnnotatedClass.constructWithoutSuperTypes(Long.TYPE, null, null);
  }

  public BasicClassIntrospector()
  {
  }

  protected BasicBeanDescription _findCachedDesc(JavaType paramJavaType)
  {
    Class localClass = paramJavaType.getRawClass();
    if (localClass == String.class)
      return STRING_DESC;
    if (localClass == Boolean.TYPE)
      return BOOLEAN_DESC;
    if (localClass == Integer.TYPE)
      return INT_DESC;
    if (localClass == Long.TYPE)
      return LONG_DESC;
    return null;
  }

  protected POJOPropertiesCollector collectProperties(MapperConfig<?> paramMapperConfig, JavaType paramJavaType, ClassIntrospector.MixInResolver paramMixInResolver, boolean paramBoolean, String paramString)
  {
    boolean bool = paramMapperConfig.isAnnotationProcessingEnabled();
    Class localClass = paramJavaType.getRawClass();
    if (bool);
    for (AnnotationIntrospector localAnnotationIntrospector = paramMapperConfig.getAnnotationIntrospector(); ; localAnnotationIntrospector = null)
      return constructPropertyCollector(paramMapperConfig, AnnotatedClass.construct(localClass, localAnnotationIntrospector, paramMixInResolver), paramJavaType, paramBoolean, paramString).collect();
  }

  protected POJOPropertiesCollector collectPropertiesWithBuilder(MapperConfig<?> paramMapperConfig, JavaType paramJavaType, ClassIntrospector.MixInResolver paramMixInResolver, boolean paramBoolean)
  {
    AnnotationIntrospector localAnnotationIntrospector;
    AnnotatedClass localAnnotatedClass;
    JsonPOJOBuilder.Value localValue;
    if (paramMapperConfig.isAnnotationProcessingEnabled())
    {
      localAnnotationIntrospector = paramMapperConfig.getAnnotationIntrospector();
      localAnnotatedClass = AnnotatedClass.construct(paramJavaType.getRawClass(), localAnnotationIntrospector, paramMixInResolver);
      localValue = null;
      if (localAnnotationIntrospector != null)
        break label64;
      label33: if (localValue != null)
        break label76;
    }
    label64: label76: for (String str = "with"; ; str = localValue.withPrefix)
    {
      return constructPropertyCollector(paramMapperConfig, localAnnotatedClass, paramJavaType, paramBoolean, str).collect();
      localAnnotationIntrospector = null;
      break;
      localValue = localAnnotationIntrospector.findPOJOBuilderConfig(localAnnotatedClass);
      break label33;
    }
  }

  protected POJOPropertiesCollector constructPropertyCollector(MapperConfig<?> paramMapperConfig, AnnotatedClass paramAnnotatedClass, JavaType paramJavaType, boolean paramBoolean, String paramString)
  {
    return new POJOPropertiesCollector(paramMapperConfig, paramBoolean, paramJavaType, paramAnnotatedClass, paramString);
  }

  public BasicBeanDescription forClassAnnotations(MapperConfig<?> paramMapperConfig, JavaType paramJavaType, ClassIntrospector.MixInResolver paramMixInResolver)
  {
    boolean bool = paramMapperConfig.isAnnotationProcessingEnabled();
    Class localClass = paramJavaType.getRawClass();
    if (bool);
    for (AnnotationIntrospector localAnnotationIntrospector = paramMapperConfig.getAnnotationIntrospector(); ; localAnnotationIntrospector = null)
      return BasicBeanDescription.forOtherUse(paramMapperConfig, paramJavaType, AnnotatedClass.construct(localClass, localAnnotationIntrospector, paramMixInResolver));
  }

  public BasicBeanDescription forCreation(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType, ClassIntrospector.MixInResolver paramMixInResolver)
  {
    BasicBeanDescription localBasicBeanDescription = _findCachedDesc(paramJavaType);
    if (localBasicBeanDescription == null)
      localBasicBeanDescription = BasicBeanDescription.forDeserialization(collectProperties(paramDeserializationConfig, paramJavaType, paramMixInResolver, false, "set"));
    return localBasicBeanDescription;
  }

  public BasicBeanDescription forDeserialization(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType, ClassIntrospector.MixInResolver paramMixInResolver)
  {
    BasicBeanDescription localBasicBeanDescription = _findCachedDesc(paramJavaType);
    if (localBasicBeanDescription == null)
      localBasicBeanDescription = BasicBeanDescription.forDeserialization(collectProperties(paramDeserializationConfig, paramJavaType, paramMixInResolver, false, "set"));
    return localBasicBeanDescription;
  }

  public BasicBeanDescription forDeserializationWithBuilder(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType, ClassIntrospector.MixInResolver paramMixInResolver)
  {
    return BasicBeanDescription.forDeserialization(collectPropertiesWithBuilder(paramDeserializationConfig, paramJavaType, paramMixInResolver, false));
  }

  public BasicBeanDescription forSerialization(SerializationConfig paramSerializationConfig, JavaType paramJavaType, ClassIntrospector.MixInResolver paramMixInResolver)
  {
    BasicBeanDescription localBasicBeanDescription = _findCachedDesc(paramJavaType);
    if (localBasicBeanDescription == null)
      localBasicBeanDescription = BasicBeanDescription.forSerialization(collectProperties(paramSerializationConfig, paramJavaType, paramMixInResolver, true, "set"));
    return localBasicBeanDescription;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.introspect.BasicClassIntrospector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
