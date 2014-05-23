package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JavaType;;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.Comparators;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class PropertyBuilder
{
  protected final AnnotationIntrospector _annotationIntrospector;
  protected final BeanDescription _beanDesc;
  protected final SerializationConfig _config;
  protected Object _defaultBean;
  protected final JsonInclude.Include _outputProps;

  public PropertyBuilder(SerializationConfig paramSerializationConfig, BeanDescription paramBeanDescription)
  {
    this._config = paramSerializationConfig;
    this._beanDesc = paramBeanDescription;
    this._outputProps = paramBeanDescription.findSerializationInclusion(paramSerializationConfig.getSerializationInclusion());
    this._annotationIntrospector = this._config.getAnnotationIntrospector();
  }

  protected Object _throwWrapped(Exception paramException, String paramString, Object paramObject)
  {
    for (Object localObject = paramException; ((Throwable)localObject).getCause() != null; localObject = ((Throwable)localObject).getCause());
    if ((localObject instanceof Error))
      throw ((Error)localObject);
    if ((localObject instanceof RuntimeException))
      throw ((RuntimeException)localObject);
    throw new IllegalArgumentException("Failed to get property '" + paramString + "' of default " + paramObject.getClass().getName() + " instance");
  }

  protected BeanPropertyWriter buildWriter(BeanPropertyDefinition paramBeanPropertyDefinition, JavaType paramJavaType, JsonSerializer<?> paramJsonSerializer, TypeSerializer paramTypeSerializer1, TypeSerializer paramTypeSerializer2, AnnotatedMember paramAnnotatedMember, boolean paramBoolean)
  {
    JavaType localJavaType1 = findSerializationType(paramAnnotatedMember, paramBoolean, paramJavaType);
    JavaType localJavaType2;
    if (paramTypeSerializer2 != null)
    {
      if (localJavaType1 == null)
        localJavaType1 = paramJavaType;
      if (localJavaType1.getContentType() == null)
        throw new IllegalStateException("Problem trying to create BeanPropertyWriter for property '" + paramBeanPropertyDefinition.getName() + "' (of type " + this._beanDesc.getType() + "); serialization type " + localJavaType1 + " has no content");
      localJavaType2 = localJavaType1.withContentTypeHandler(paramTypeSerializer2);
      localJavaType2.getContentType();
    }
    while (true)
    {
      JsonInclude.Include localInclude = this._annotationIntrospector.findSerializationInclusion(paramAnnotatedMember, this._outputProps);
      boolean bool1 = false;
      Object localObject = null;
      int i;
      if (localInclude != null)
      {
        i = PropertyBuilder.1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[localInclude.ordinal()];
        localObject = null;
        bool1 = false;
      }
      boolean bool2;
      switch (i)
      {
      default:
        bool2 = bool1;
      case 1:
      case 2:
      case 3:
      case 4:
      }
      while (true)
      {
        BeanPropertyWriter localBeanPropertyWriter = new BeanPropertyWriter(paramBeanPropertyDefinition, paramAnnotatedMember, this._beanDesc.getClassAnnotations(), paramJavaType, paramJsonSerializer, paramTypeSerializer1, localJavaType2, bool2, localObject);
        NameTransformer localNameTransformer = this._annotationIntrospector.findUnwrappingNameTransformer(paramAnnotatedMember);
        if (localNameTransformer != null)
          localBeanPropertyWriter = localBeanPropertyWriter.unwrappingWriter(localNameTransformer);
        return localBeanPropertyWriter;
        localObject = getDefaultValue(paramBeanPropertyDefinition.getName(), paramAnnotatedMember);
        if (localObject == null)
        {
          bool2 = true;
        }
        else
        {
          boolean bool5 = localObject.getClass().isArray();
          bool1 = false;
          if (!bool5)
            break;
          localObject = Comparators.getArrayComparator(localObject);
          bool2 = false;
          continue;
          localObject = BeanPropertyWriter.MARKER_FOR_EMPTY;
          bool2 = true;
          continue;
          bool1 = true;
          boolean bool3 = paramJavaType.isContainerType();
          localObject = null;
          if (!bool3)
            break;
          boolean bool4 = this._config.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
          localObject = null;
          if (bool4)
            break;
          localObject = BeanPropertyWriter.MARKER_FOR_EMPTY;
          bool2 = bool1;
        }
      }
      localJavaType2 = localJavaType1;
    }
  }

  protected JavaType findSerializationType(Annotated paramAnnotated, boolean paramBoolean, JavaType paramJavaType)
  {
    boolean bool1 = true;
    Class localClass1 = this._annotationIntrospector.findSerializationType(paramAnnotated);
    Class localClass2;
    Object localObject;
    if (localClass1 != null)
    {
      localClass2 = paramJavaType.getRawClass();
      if (localClass1.isAssignableFrom(localClass2))
      {
        localObject = paramJavaType.widenBy(localClass1);
        paramBoolean = bool1;
      }
    }
    while (true)
    {
      JavaType localJavaType = BeanSerializerFactory.modifySecondaryTypesByAnnotation(this._config, paramAnnotated, (JavaType)localObject);
      if (localJavaType != localObject)
        localObject = localJavaType;
      for (boolean bool2 = bool1; ; bool2 = paramBoolean)
      {
        if (!bool2)
        {
          JsonSerialize.Typing localTyping = this._annotationIntrospector.findSerializationTyping(paramAnnotated);
          if (localTyping != null)
            if (localTyping != JsonSerialize.Typing.STATIC);
        }
        while (true)
        {
          if (bool1)
          {
            return localObject;
            if (!localClass2.isAssignableFrom(localClass1))
              throw new IllegalArgumentException("Illegal concrete-type annotation for method '" + paramAnnotated.getName() + "': class " + localClass1.getName() + " not a super-type of (declared) class " + localClass2.getName());
            localObject = this._config.constructSpecializedType(paramJavaType, localClass1);
            break;
            bool1 = false;
            continue;
          }
          return null;
          bool1 = bool2;
        }
      }
      localObject = paramJavaType;
    }
  }

  public Annotations getClassAnnotations()
  {
    return this._beanDesc.getClassAnnotations();
  }

  protected Object getDefaultBean()
  {
    if (this._defaultBean == null)
    {
      this._defaultBean = this._beanDesc.instantiateBean(this._config.canOverrideAccessModifiers());
      if (this._defaultBean == null)
      {
        Class localClass = this._beanDesc.getClassInfo().getAnnotated();
        throw new IllegalArgumentException("Class " + localClass.getName() + " has no default constructor; can not instantiate default bean value to support 'properties=JsonSerialize.Inclusion.NON_DEFAULT' annotation");
      }
    }
    return this._defaultBean;
  }

  protected Object getDefaultValue(String paramString, AnnotatedMember paramAnnotatedMember)
  {
    localObject1 = getDefaultBean();
    try
    {
      Object localObject2 = paramAnnotatedMember.getValue(localObject1);
      return localObject2;
    }
    catch (Exception localException)
    {
      return _throwWrapped(localException, paramString, localObject1);
    }
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.PropertyBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
