package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.util.Provider;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

public class OptionalHandlerFactory
  implements Serializable
{
  public static final OptionalHandlerFactory instance = new OptionalHandlerFactory();
  private static final long serialVersionUID = -7103336512296456640L;

  protected OptionalHandlerFactory()
  {
  }

  private boolean doesImplement(Class<?> paramClass, String paramString)
  {
    while (paramClass != null)
    {
      if (paramClass.getName().equals(paramString));
      while (hasInterface(paramClass, paramString))
        return true;
      paramClass = paramClass.getSuperclass();
    }
    return false;
  }

  private boolean hasInterface(Class<?> paramClass, String paramString)
  {
    Class[] arrayOfClass = paramClass.getInterfaces();
    int i = arrayOfClass.length;
    for (int j = 0; j < i; j++)
      if (arrayOfClass[j].getName().equals(paramString))
        return true;
    int k = arrayOfClass.length;
    for (int m = 0; ; m++)
    {
      if (m >= k)
        break label73;
      if (hasInterface(arrayOfClass[m], paramString))
        break;
    }
    label73: return false;
  }

  private boolean hasInterfaceStartingWith(Class<?> paramClass, String paramString)
  {
    Class[] arrayOfClass = paramClass.getInterfaces();
    int i = arrayOfClass.length;
    for (int j = 0; j < i; j++)
      if (arrayOfClass[j].getName().startsWith(paramString))
        return true;
    int k = arrayOfClass.length;
    for (int m = 0; ; m++)
    {
      if (m >= k)
        break label73;
      if (hasInterfaceStartingWith(arrayOfClass[m], paramString))
        break;
    }
    label73: return false;
  }

  private boolean hasSupertypeStartingWith(Class<?> paramClass, String paramString)
  {
    for (Class localClass = paramClass.getSuperclass(); localClass != null; localClass = localClass.getSuperclass())
      if (localClass.getName().startsWith(paramString))
        return true;
    do
    {
      paramClass = paramClass.getSuperclass();
      if (paramClass == null)
        break;
    }
    while (!hasInterfaceStartingWith(paramClass, paramString));
    return true;
    return false;
  }

  private Object instantiate(String paramString)
  {
    try
    {
      Object localObject = Class.forName(paramString).newInstance();
      return localObject;
    }
    catch (Exception localException)
    {
      return null;
    }
    catch (LinkageError localLinkageError)
    {
      break label13;
    }
  }

  public JsonDeserializer<?> findDeserializer(JavaType paramJavaType, DeserializationConfig paramDeserializationConfig)
  {
    Class localClass = paramJavaType.getRawClass();
    Object localObject;
    if ((localClass.getName().startsWith("javax.xml.")) || (hasSupertypeStartingWith(localClass, "javax.xml.")))
    {
      localObject = instantiate("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers");
      if (localObject == null)
        return null;
    }
    else
    {
      if (doesImplement(localClass, "org.w3c.dom.Node"))
        return (JsonDeserializer)instantiate("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer");
      if (doesImplement(localClass, "org.w3c.dom.Node"))
        return (JsonDeserializer)instantiate("com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer");
      return null;
    }
    Collection localCollection = ((Provider)localObject).provide();
    Iterator localIterator1 = localCollection.iterator();
    while (localIterator1.hasNext())
    {
      StdDeserializer localStdDeserializer2 = (StdDeserializer)localIterator1.next();
      if (localClass == localStdDeserializer2.getValueClass())
        return localStdDeserializer2;
    }
    Iterator localIterator2 = localCollection.iterator();
    while (localIterator2.hasNext())
    {
      StdDeserializer localStdDeserializer1 = (StdDeserializer)localIterator2.next();
      if (localStdDeserializer1.getValueClass().isAssignableFrom(localClass))
        return localStdDeserializer1;
    }
    return null;
  }

  public JsonSerializer<?> findSerializer(SerializationConfig paramSerializationConfig, JavaType paramJavaType)
  {
    Class localClass = paramJavaType.getRawClass();
    Object localObject;
    if ((localClass.getName().startsWith("javax.xml.")) || (hasSupertypeStartingWith(localClass, "javax.xml.")))
    {
      localObject = instantiate("com.fasterxml.jackson.databind.ext.CoreXMLSerializers");
      if (localObject == null)
        return null;
    }
    else
    {
      if (doesImplement(localClass, "org.w3c.dom.Node"))
        return (JsonSerializer)instantiate("com.fasterxml.jackson.databind.ext.DOMSerializer");
      return null;
    }
    Collection localCollection = ((Provider)localObject).provide();
    Iterator localIterator1 = localCollection.iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry2 = (Map.Entry)localIterator1.next();
      if (localClass == localEntry2.getKey())
        return (JsonSerializer)localEntry2.getValue();
    }
    Iterator localIterator2 = localCollection.iterator();
    while (localIterator2.hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)localIterator2.next();
      if (((Class)localEntry1.getKey()).isAssignableFrom(localClass))
        return (JsonSerializer)localEntry1.getValue();
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ext.OptionalHandlerFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
