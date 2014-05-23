package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class StdSubtypeResolver extends SubtypeResolver
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  protected LinkedHashSet<NamedType> _registeredSubtypes;

  public StdSubtypeResolver()
  {
  }

  protected void _collectAndResolve(AnnotatedClass paramAnnotatedClass, NamedType paramNamedType, MapperConfig<?> paramMapperConfig, AnnotationIntrospector paramAnnotationIntrospector, HashMap<NamedType, NamedType> paramHashMap)
  {
    if (!paramNamedType.hasName())
    {
      String str = paramAnnotationIntrospector.findTypeName(paramAnnotatedClass);
      if (str != null)
        paramNamedType = new NamedType(paramNamedType.getType(), str);
    }
    if (paramHashMap.containsKey(paramNamedType))
      if ((paramNamedType.hasName()) && (!((NamedType)paramHashMap.get(paramNamedType)).hasName()))
        paramHashMap.put(paramNamedType, paramNamedType);
    List localList;
    do
    {
      return;
      paramHashMap.put(paramNamedType, paramNamedType);
      localList = paramAnnotationIntrospector.findSubtypes(paramAnnotatedClass);
    }
    while ((localList == null) || (localList.isEmpty()));
    Iterator localIterator = localList.iterator();
    label114: NamedType localNamedType1;
    AnnotatedClass localAnnotatedClass;
    if (localIterator.hasNext())
    {
      localNamedType1 = (NamedType)localIterator.next();
      localAnnotatedClass = AnnotatedClass.constructWithoutSuperTypes(localNamedType1.getType(), paramAnnotationIntrospector, paramMapperConfig);
      if (localNamedType1.hasName())
        break label194;
    }
    label194: for (NamedType localNamedType2 = new NamedType(localNamedType1.getType(), paramAnnotationIntrospector.findTypeName(localAnnotatedClass)); ; localNamedType2 = localNamedType1)
    {
      _collectAndResolve(localAnnotatedClass, localNamedType2, paramMapperConfig, paramAnnotationIntrospector, paramHashMap);
      break label114;
      break;
    }
  }

  public Collection<NamedType> collectAndResolveSubtypes(AnnotatedClass paramAnnotatedClass, MapperConfig<?> paramMapperConfig, AnnotationIntrospector paramAnnotationIntrospector)
  {
    HashMap localHashMap = new HashMap();
    if (this._registeredSubtypes != null)
    {
      Class localClass = paramAnnotatedClass.getRawType();
      Iterator localIterator = this._registeredSubtypes.iterator();
      while (localIterator.hasNext())
      {
        NamedType localNamedType = (NamedType)localIterator.next();
        if (localClass.isAssignableFrom(localNamedType.getType()))
          _collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(localNamedType.getType(), paramAnnotationIntrospector, paramMapperConfig), localNamedType, paramMapperConfig, paramAnnotationIntrospector, localHashMap);
      }
    }
    _collectAndResolve(paramAnnotatedClass, new NamedType(paramAnnotatedClass.getRawType(), null), paramMapperConfig, paramAnnotationIntrospector, localHashMap);
    return new ArrayList(localHashMap.values());
  }

  public Collection<NamedType> collectAndResolveSubtypes(AnnotatedMember paramAnnotatedMember, MapperConfig<?> paramMapperConfig, AnnotationIntrospector paramAnnotationIntrospector, JavaType paramJavaType)
  {
    if (paramJavaType == null);
    HashMap localHashMap;
    for (Class localClass = paramAnnotatedMember.getRawType(); ; localClass = paramJavaType.getRawClass())
    {
      localHashMap = new HashMap();
      if (this._registeredSubtypes == null)
        break;
      Iterator localIterator2 = this._registeredSubtypes.iterator();
      while (localIterator2.hasNext())
      {
        NamedType localNamedType3 = (NamedType)localIterator2.next();
        if (localClass.isAssignableFrom(localNamedType3.getType()))
          _collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(localNamedType3.getType(), paramAnnotationIntrospector, paramMapperConfig), localNamedType3, paramMapperConfig, paramAnnotationIntrospector, localHashMap);
      }
    }
    List localList = paramAnnotationIntrospector.findSubtypes(paramAnnotatedMember);
    if (localList != null)
    {
      Iterator localIterator1 = localList.iterator();
      while (localIterator1.hasNext())
      {
        NamedType localNamedType2 = (NamedType)localIterator1.next();
        _collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(localNamedType2.getType(), paramAnnotationIntrospector, paramMapperConfig), localNamedType2, paramMapperConfig, paramAnnotationIntrospector, localHashMap);
      }
    }
    NamedType localNamedType1 = new NamedType(localClass, null);
    _collectAndResolve(AnnotatedClass.constructWithoutSuperTypes(localClass, paramAnnotationIntrospector, paramMapperConfig), localNamedType1, paramMapperConfig, paramAnnotationIntrospector, localHashMap);
    return new ArrayList(localHashMap.values());
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
