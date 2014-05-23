package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;

public class StdKeyDeserializers
{
  protected final HashMap<JavaType, KeyDeserializer> _keyDeserializers = new HashMap();

  protected StdKeyDeserializers()
  {
    add(new StdKeyDeserializer.BoolKD());
    add(new StdKeyDeserializer.ByteKD());
    add(new StdKeyDeserializer.CharKD());
    add(new StdKeyDeserializer.ShortKD());
    add(new StdKeyDeserializer.IntKD());
    add(new StdKeyDeserializer.LongKD());
    add(new StdKeyDeserializer.FloatKD());
    add(new StdKeyDeserializer.DoubleKD());
    add(new StdKeyDeserializer.DateKD());
    add(new StdKeyDeserializer.CalendarKD());
    add(new StdKeyDeserializer.UuidKD());
    add(new StdKeyDeserializer.LocaleKD());
  }

  private void add(StdKeyDeserializer paramStdKeyDeserializer)
  {
    Class localClass = paramStdKeyDeserializer.getKeyClass();
    this._keyDeserializers.put(TypeFactory.defaultInstance().constructType(localClass), paramStdKeyDeserializer);
  }

  public static HashMap<JavaType, KeyDeserializer> constructAll()
  {
    return new StdKeyDeserializers()._keyDeserializers;
  }

  public static KeyDeserializer constructDelegatingKeyDeserializer(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType, JsonDeserializer<?> paramJsonDeserializer)
  {
    return new StdKeyDeserializer.DelegatingKD(paramJavaType.getRawClass(), paramJsonDeserializer);
  }

  public static KeyDeserializer constructEnumKeyDeserializer(EnumResolver<?> paramEnumResolver)
  {
    return new StdKeyDeserializer.EnumKD(paramEnumResolver, null);
  }

  public static KeyDeserializer constructEnumKeyDeserializer(EnumResolver<?> paramEnumResolver, AnnotatedMethod paramAnnotatedMethod)
  {
    return new StdKeyDeserializer.EnumKD(paramEnumResolver, paramAnnotatedMethod);
  }

  public static KeyDeserializer constructStringKeyDeserializer(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType)
  {
    return StdKeyDeserializer.StringKD.forType(paramJavaType.getRawClass());
  }

  public static KeyDeserializer findStringBasedKeyDeserializer(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType)
  {
    BeanDescription localBeanDescription = paramDeserializationConfig.introspect(paramJavaType);
    Constructor localConstructor = localBeanDescription.findSingleArgConstructor(new Class[] { String.class });
    if (localConstructor != null)
    {
      if (paramDeserializationConfig.canOverrideAccessModifiers())
        ClassUtil.checkAndFixAccess(localConstructor);
      return new StdKeyDeserializer.StringCtorKeyDeserializer(localConstructor);
    }
    Method localMethod = localBeanDescription.findFactoryMethod(new Class[] { String.class });
    if (localMethod != null)
    {
      if (paramDeserializationConfig.canOverrideAccessModifiers())
        ClassUtil.checkAndFixAccess(localMethod);
      return new StdKeyDeserializer.StringFactoryKeyDeserializer(localMethod);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
