package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;

public class RootNameLookup
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  protected LRUMap<ClassKey, SerializedString> _rootNames;

  public RootNameLookup()
  {
  }

  public SerializedString findRootName(JavaType paramJavaType, MapperConfig<?> paramMapperConfig)
  {
    return findRootName(paramJavaType.getRawClass(), paramMapperConfig);
  }

  public SerializedString findRootName(Class<?> paramClass, MapperConfig<?> paramMapperConfig)
  {
    try
    {
      ClassKey localClassKey = new ClassKey(paramClass);
      PropertyName localPropertyName;
      if (this._rootNames == null)
      {
        this._rootNames = new LRUMap(20, 200);
        BeanDescription localBeanDescription = paramMapperConfig.introspectClassAnnotations(paramClass);
        localPropertyName = paramMapperConfig.getAnnotationIntrospector().findRootName(localBeanDescription.getClassInfo());
        if ((localPropertyName != null) && (localPropertyName.hasSimpleName()))
          break label122;
      }
      String str;
      for (Object localObject2 = paramClass.getSimpleName(); ; localObject2 = str)
      {
        SerializedString localSerializedString = new SerializedString((String)localObject2);
        this._rootNames.put(localClassKey, localSerializedString);
        while (true)
        {
          return localSerializedString;
          localSerializedString = (SerializedString)this._rootNames.get(localClassKey);
          if (localSerializedString == null)
            break;
        }
        str = localPropertyName.getSimpleName();
      }
    }
    finally
    {
    }
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.util.RootNameLookup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
