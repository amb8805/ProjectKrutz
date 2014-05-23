package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeInfo.None;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.None;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonDeserializer.None;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.JsonSerializer.None;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer.None;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public class JacksonAnnotationIntrospector extends AnnotationIntrospector
  implements Serializable
{
  private static final long serialVersionUID = 1L;

  public JacksonAnnotationIntrospector()
  {
  }

  protected StdTypeResolverBuilder _constructNoTypeResolverBuilder()
  {
    return StdTypeResolverBuilder.noTypeInfoBuilder();
  }

  protected StdTypeResolverBuilder _constructStdTypeResolverBuilder()
  {
    return new StdTypeResolverBuilder();
  }

  protected TypeResolverBuilder<?> _findTypeResolver(MapperConfig<?> paramMapperConfig, Annotated paramAnnotated, JavaType paramJavaType)
  {
    JsonTypeInfo localJsonTypeInfo = (JsonTypeInfo)paramAnnotated.getAnnotation(JsonTypeInfo.class);
    JsonTypeResolver localJsonTypeResolver = (JsonTypeResolver)paramAnnotated.getAnnotation(JsonTypeResolver.class);
    Object localObject;
    JsonTypeIdResolver localJsonTypeIdResolver;
    TypeIdResolver localTypeIdResolver;
    if (localJsonTypeResolver != null)
    {
      if (localJsonTypeInfo == null)
        return null;
      localObject = paramMapperConfig.typeResolverBuilderInstance(paramAnnotated, localJsonTypeResolver.value());
      localJsonTypeIdResolver = (JsonTypeIdResolver)paramAnnotated.getAnnotation(JsonTypeIdResolver.class);
      localTypeIdResolver = null;
      if (localJsonTypeIdResolver != null)
        break label226;
    }
    while (true)
    {
      if (localTypeIdResolver != null)
        localTypeIdResolver.init(paramJavaType);
      TypeResolverBuilder localTypeResolverBuilder1 = ((TypeResolverBuilder)localObject).init(localJsonTypeInfo.use(), localTypeIdResolver);
      JsonTypeInfo.As localAs = localJsonTypeInfo.include();
      if ((localAs == JsonTypeInfo.As.EXTERNAL_PROPERTY) && ((paramAnnotated instanceof AnnotatedClass)))
        localAs = JsonTypeInfo.As.PROPERTY;
      TypeResolverBuilder localTypeResolverBuilder2 = localTypeResolverBuilder1.inclusion(localAs).typeProperty(localJsonTypeInfo.property());
      Class localClass = localJsonTypeInfo.defaultImpl();
      if (localClass != JsonTypeInfo.None.class)
        localTypeResolverBuilder2 = localTypeResolverBuilder2.defaultImpl(localClass);
      return localTypeResolverBuilder2.typeIdVisibility(localJsonTypeInfo.visible());
      if (localJsonTypeInfo == null)
        return null;
      if (localJsonTypeInfo.use() == JsonTypeInfo.Id.NONE)
        return _constructNoTypeResolverBuilder();
      localObject = _constructStdTypeResolverBuilder();
      break;
      label226: localTypeIdResolver = paramMapperConfig.typeIdResolverInstance(paramAnnotated, localJsonTypeIdResolver.value());
    }
  }

  protected boolean _isIgnorable(Annotated paramAnnotated)
  {
    JsonIgnore localJsonIgnore = (JsonIgnore)paramAnnotated.getAnnotation(JsonIgnore.class);
    return (localJsonIgnore != null) && (localJsonIgnore.value());
  }

  public VisibilityChecker<?> findAutoDetectVisibility(AnnotatedClass paramAnnotatedClass, VisibilityChecker<?> paramVisibilityChecker)
  {
    JsonAutoDetect localJsonAutoDetect = (JsonAutoDetect)paramAnnotatedClass.getAnnotation(JsonAutoDetect.class);
    if (localJsonAutoDetect == null)
      return paramVisibilityChecker;
    return paramVisibilityChecker.with(localJsonAutoDetect);
  }

  public Class<? extends JsonDeserializer<?>> findContentDeserializer(Annotated paramAnnotated)
  {
    JsonDeserialize localJsonDeserialize = (JsonDeserialize)paramAnnotated.getAnnotation(JsonDeserialize.class);
    if (localJsonDeserialize != null)
    {
      Class localClass = localJsonDeserialize.contentUsing();
      if (localClass != JsonDeserializer.None.class)
        return localClass;
    }
    return null;
  }

  public Class<? extends JsonSerializer<?>> findContentSerializer(Annotated paramAnnotated)
  {
    JsonSerialize localJsonSerialize = (JsonSerialize)paramAnnotated.getAnnotation(JsonSerialize.class);
    if (localJsonSerialize != null)
    {
      Class localClass = localJsonSerialize.contentUsing();
      if (localClass != JsonSerializer.None.class)
        return localClass;
    }
    return null;
  }

  public Class<?> findDeserializationContentType(Annotated paramAnnotated, JavaType paramJavaType)
  {
    JsonDeserialize localJsonDeserialize = (JsonDeserialize)paramAnnotated.getAnnotation(JsonDeserialize.class);
    if (localJsonDeserialize != null)
    {
      Class localClass = localJsonDeserialize.contentAs();
      if (localClass != NoClass.class)
        return localClass;
    }
    return null;
  }

  public Class<?> findDeserializationKeyType(Annotated paramAnnotated, JavaType paramJavaType)
  {
    JsonDeserialize localJsonDeserialize = (JsonDeserialize)paramAnnotated.getAnnotation(JsonDeserialize.class);
    if (localJsonDeserialize != null)
    {
      Class localClass = localJsonDeserialize.keyAs();
      if (localClass != NoClass.class)
        return localClass;
    }
    return null;
  }

  public String findDeserializationName(AnnotatedField paramAnnotatedField)
  {
    JsonProperty localJsonProperty = (JsonProperty)paramAnnotatedField.getAnnotation(JsonProperty.class);
    if (localJsonProperty != null)
      return localJsonProperty.value();
    if ((paramAnnotatedField.hasAnnotation(JsonDeserialize.class)) || (paramAnnotatedField.hasAnnotation(JsonView.class)) || (paramAnnotatedField.hasAnnotation(JsonBackReference.class)) || (paramAnnotatedField.hasAnnotation(JsonManagedReference.class)))
      return "";
    return null;
  }

  public String findDeserializationName(AnnotatedMethod paramAnnotatedMethod)
  {
    JsonSetter localJsonSetter = (JsonSetter)paramAnnotatedMethod.getAnnotation(JsonSetter.class);
    if (localJsonSetter != null)
      return localJsonSetter.value();
    JsonProperty localJsonProperty = (JsonProperty)paramAnnotatedMethod.getAnnotation(JsonProperty.class);
    if (localJsonProperty != null)
      return localJsonProperty.value();
    if ((paramAnnotatedMethod.hasAnnotation(JsonDeserialize.class)) || (paramAnnotatedMethod.hasAnnotation(JsonView.class)) || (paramAnnotatedMethod.hasAnnotation(JsonBackReference.class)) || (paramAnnotatedMethod.hasAnnotation(JsonManagedReference.class)))
      return "";
    return null;
  }

  public String findDeserializationName(AnnotatedParameter paramAnnotatedParameter)
  {
    if (paramAnnotatedParameter != null)
    {
      JsonProperty localJsonProperty = (JsonProperty)paramAnnotatedParameter.getAnnotation(JsonProperty.class);
      if (localJsonProperty != null)
        return localJsonProperty.value();
    }
    return null;
  }

  public Class<?> findDeserializationType(Annotated paramAnnotated, JavaType paramJavaType)
  {
    JsonDeserialize localJsonDeserialize = (JsonDeserialize)paramAnnotated.getAnnotation(JsonDeserialize.class);
    if (localJsonDeserialize != null)
    {
      Class localClass = localJsonDeserialize.as();
      if (localClass != NoClass.class)
        return localClass;
    }
    return null;
  }

  public Class<? extends JsonDeserializer<?>> findDeserializer(Annotated paramAnnotated)
  {
    JsonDeserialize localJsonDeserialize = (JsonDeserialize)paramAnnotated.getAnnotation(JsonDeserialize.class);
    if (localJsonDeserialize != null)
    {
      Class localClass = localJsonDeserialize.using();
      if (localClass != JsonDeserializer.None.class)
        return localClass;
    }
    return null;
  }

  public Object findFilterId(AnnotatedClass paramAnnotatedClass)
  {
    JsonFilter localJsonFilter = (JsonFilter)paramAnnotatedClass.getAnnotation(JsonFilter.class);
    if (localJsonFilter != null)
    {
      String str = localJsonFilter.value();
      if (str.length() > 0)
        return str;
    }
    return null;
  }

  public JsonFormat.Value findFormat(Annotated paramAnnotated)
  {
    JsonFormat localJsonFormat = (JsonFormat)paramAnnotated.getAnnotation(JsonFormat.class);
    if (localJsonFormat == null)
      return null;
    return new JsonFormat.Value(localJsonFormat);
  }

  public JsonFormat.Value findFormat(AnnotatedMember paramAnnotatedMember)
  {
    return findFormat(paramAnnotatedMember);
  }

  public Boolean findIgnoreUnknownProperties(AnnotatedClass paramAnnotatedClass)
  {
    JsonIgnoreProperties localJsonIgnoreProperties = (JsonIgnoreProperties)paramAnnotatedClass.getAnnotation(JsonIgnoreProperties.class);
    if (localJsonIgnoreProperties == null)
      return null;
    return Boolean.valueOf(localJsonIgnoreProperties.ignoreUnknown());
  }

  public Object findInjectableValueId(AnnotatedMember paramAnnotatedMember)
  {
    JacksonInject localJacksonInject = (JacksonInject)paramAnnotatedMember.getAnnotation(JacksonInject.class);
    Object localObject;
    if (localJacksonInject == null)
      localObject = null;
    do
    {
      return localObject;
      localObject = localJacksonInject.value();
    }
    while (((String)localObject).length() != 0);
    if (!(paramAnnotatedMember instanceof AnnotatedMethod))
      return paramAnnotatedMember.getRawType().getName();
    AnnotatedMethod localAnnotatedMethod = (AnnotatedMethod)paramAnnotatedMember;
    if (localAnnotatedMethod.getParameterCount() == 0)
      return paramAnnotatedMember.getRawType().getName();
    return localAnnotatedMethod.getRawParameterType(0).getName();
  }

  public Class<? extends KeyDeserializer> findKeyDeserializer(Annotated paramAnnotated)
  {
    JsonDeserialize localJsonDeserialize = (JsonDeserialize)paramAnnotated.getAnnotation(JsonDeserialize.class);
    if (localJsonDeserialize != null)
    {
      Class localClass = localJsonDeserialize.keyUsing();
      if (localClass != KeyDeserializer.None.class)
        return localClass;
    }
    return null;
  }

  public Class<? extends JsonSerializer<?>> findKeySerializer(Annotated paramAnnotated)
  {
    JsonSerialize localJsonSerialize = (JsonSerialize)paramAnnotated.getAnnotation(JsonSerialize.class);
    if (localJsonSerialize != null)
    {
      Class localClass = localJsonSerialize.keyUsing();
      if (localClass != JsonSerializer.None.class)
        return localClass;
    }
    return null;
  }

  public PropertyName findNameForDeserialization(Annotated paramAnnotated)
  {
    String str;
    if ((paramAnnotated instanceof AnnotatedField))
      str = findDeserializationName((AnnotatedField)paramAnnotated);
    while (true)
    {
      PropertyName localPropertyName = null;
      if (str != null)
      {
        if (str.length() != 0)
          break;
        localPropertyName = PropertyName.USE_DEFAULT;
      }
      return localPropertyName;
      if ((paramAnnotated instanceof AnnotatedMethod))
        str = findDeserializationName((AnnotatedMethod)paramAnnotated);
      else if ((paramAnnotated instanceof AnnotatedParameter))
        str = findDeserializationName((AnnotatedParameter)paramAnnotated);
      else
        str = null;
    }
    return new PropertyName(str);
  }

  public PropertyName findNameForSerialization(Annotated paramAnnotated)
  {
    String str;
    if ((paramAnnotated instanceof AnnotatedField))
      str = findSerializationName((AnnotatedField)paramAnnotated);
    while (true)
    {
      PropertyName localPropertyName = null;
      if (str != null)
      {
        if (str.length() != 0)
          break;
        localPropertyName = PropertyName.USE_DEFAULT;
      }
      return localPropertyName;
      if ((paramAnnotated instanceof AnnotatedMethod))
        str = findSerializationName((AnnotatedMethod)paramAnnotated);
      else
        str = null;
    }
    return new PropertyName(str);
  }

  public Object findNamingStrategy(AnnotatedClass paramAnnotatedClass)
  {
    JsonNaming localJsonNaming = (JsonNaming)paramAnnotatedClass.getAnnotation(JsonNaming.class);
    if (localJsonNaming == null)
      return null;
    return localJsonNaming.value();
  }

  public ObjectIdInfo findObjectIdInfo(Annotated paramAnnotated)
  {
    JsonIdentityInfo localJsonIdentityInfo = (JsonIdentityInfo)paramAnnotated.getAnnotation(JsonIdentityInfo.class);
    if ((localJsonIdentityInfo == null) || (localJsonIdentityInfo.generator() == ObjectIdGenerators.None.class))
      return null;
    return new ObjectIdInfo(localJsonIdentityInfo.property(), localJsonIdentityInfo.scope(), localJsonIdentityInfo.generator());
  }

  public ObjectIdInfo findObjectReferenceInfo(Annotated paramAnnotated, ObjectIdInfo paramObjectIdInfo)
  {
    JsonIdentityReference localJsonIdentityReference = (JsonIdentityReference)paramAnnotated.getAnnotation(JsonIdentityReference.class);
    if (localJsonIdentityReference != null)
      paramObjectIdInfo = paramObjectIdInfo.withAlwaysAsId(localJsonIdentityReference.alwaysAsId());
    return paramObjectIdInfo;
  }

  public Class<?> findPOJOBuilder(AnnotatedClass paramAnnotatedClass)
  {
    JsonDeserialize localJsonDeserialize = (JsonDeserialize)paramAnnotatedClass.getAnnotation(JsonDeserialize.class);
    if ((localJsonDeserialize == null) || (localJsonDeserialize.builder() == NoClass.class))
      return null;
    return localJsonDeserialize.builder();
  }

  public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass paramAnnotatedClass)
  {
    JsonPOJOBuilder localJsonPOJOBuilder = (JsonPOJOBuilder)paramAnnotatedClass.getAnnotation(JsonPOJOBuilder.class);
    if (localJsonPOJOBuilder == null)
      return null;
    return new JsonPOJOBuilder.Value(localJsonPOJOBuilder);
  }

  public String[] findPropertiesToIgnore(Annotated paramAnnotated)
  {
    JsonIgnoreProperties localJsonIgnoreProperties = (JsonIgnoreProperties)paramAnnotated.getAnnotation(JsonIgnoreProperties.class);
    if (localJsonIgnoreProperties == null)
      return null;
    return localJsonIgnoreProperties.value();
  }

  public TypeResolverBuilder<?> findPropertyContentTypeResolver(MapperConfig<?> paramMapperConfig, AnnotatedMember paramAnnotatedMember, JavaType paramJavaType)
  {
    if (!paramJavaType.isContainerType())
      throw new IllegalArgumentException("Must call method with a container type (got " + paramJavaType + ")");
    return _findTypeResolver(paramMapperConfig, paramAnnotatedMember, paramJavaType);
  }

  public TypeResolverBuilder<?> findPropertyTypeResolver(MapperConfig<?> paramMapperConfig, AnnotatedMember paramAnnotatedMember, JavaType paramJavaType)
  {
    if (paramJavaType.isContainerType())
      return null;
    return _findTypeResolver(paramMapperConfig, paramAnnotatedMember, paramJavaType);
  }

  public AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember paramAnnotatedMember)
  {
    JsonManagedReference localJsonManagedReference = (JsonManagedReference)paramAnnotatedMember.getAnnotation(JsonManagedReference.class);
    if (localJsonManagedReference != null)
      return AnnotationIntrospector.ReferenceProperty.managed(localJsonManagedReference.value());
    JsonBackReference localJsonBackReference = (JsonBackReference)paramAnnotatedMember.getAnnotation(JsonBackReference.class);
    if (localJsonBackReference != null)
      return AnnotationIntrospector.ReferenceProperty.back(localJsonBackReference.value());
    return null;
  }

  public PropertyName findRootName(AnnotatedClass paramAnnotatedClass)
  {
    JsonRootName localJsonRootName = (JsonRootName)paramAnnotatedClass.getAnnotation(JsonRootName.class);
    if (localJsonRootName == null)
      return null;
    return new PropertyName(localJsonRootName.value());
  }

  public Class<?> findSerializationContentType(Annotated paramAnnotated, JavaType paramJavaType)
  {
    JsonSerialize localJsonSerialize = (JsonSerialize)paramAnnotated.getAnnotation(JsonSerialize.class);
    if (localJsonSerialize != null)
    {
      Class localClass = localJsonSerialize.contentAs();
      if (localClass != NoClass.class)
        return localClass;
    }
    return null;
  }

  public JsonInclude.Include findSerializationInclusion(Annotated paramAnnotated, JsonInclude.Include paramInclude)
  {
    JsonInclude localJsonInclude = (JsonInclude)paramAnnotated.getAnnotation(JsonInclude.class);
    if (localJsonInclude != null)
      paramInclude = localJsonInclude.value();
    JsonSerialize localJsonSerialize;
    do
    {
      return paramInclude;
      localJsonSerialize = (JsonSerialize)paramAnnotated.getAnnotation(JsonSerialize.class);
    }
    while (localJsonSerialize == null);
    JsonSerialize.Inclusion localInclusion = localJsonSerialize.include();
    switch (JacksonAnnotationIntrospector.1.$SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[localInclusion.ordinal()])
    {
    default:
      return paramInclude;
    case 1:
      return JsonInclude.Include.ALWAYS;
    case 2:
      return JsonInclude.Include.NON_NULL;
    case 3:
      return JsonInclude.Include.NON_DEFAULT;
    case 4:
    }
    return JsonInclude.Include.NON_EMPTY;
  }

  public Class<?> findSerializationKeyType(Annotated paramAnnotated, JavaType paramJavaType)
  {
    JsonSerialize localJsonSerialize = (JsonSerialize)paramAnnotated.getAnnotation(JsonSerialize.class);
    if (localJsonSerialize != null)
    {
      Class localClass = localJsonSerialize.keyAs();
      if (localClass != NoClass.class)
        return localClass;
    }
    return null;
  }

  public String findSerializationName(AnnotatedField paramAnnotatedField)
  {
    JsonProperty localJsonProperty = (JsonProperty)paramAnnotatedField.getAnnotation(JsonProperty.class);
    if (localJsonProperty != null)
      return localJsonProperty.value();
    if ((paramAnnotatedField.hasAnnotation(JsonSerialize.class)) || (paramAnnotatedField.hasAnnotation(JsonView.class)))
      return "";
    return null;
  }

  public String findSerializationName(AnnotatedMethod paramAnnotatedMethod)
  {
    JsonGetter localJsonGetter = (JsonGetter)paramAnnotatedMethod.getAnnotation(JsonGetter.class);
    if (localJsonGetter != null)
      return localJsonGetter.value();
    JsonProperty localJsonProperty = (JsonProperty)paramAnnotatedMethod.getAnnotation(JsonProperty.class);
    if (localJsonProperty != null)
      return localJsonProperty.value();
    if ((paramAnnotatedMethod.hasAnnotation(JsonSerialize.class)) || (paramAnnotatedMethod.hasAnnotation(JsonView.class)))
      return "";
    return null;
  }

  public String[] findSerializationPropertyOrder(AnnotatedClass paramAnnotatedClass)
  {
    JsonPropertyOrder localJsonPropertyOrder = (JsonPropertyOrder)paramAnnotatedClass.getAnnotation(JsonPropertyOrder.class);
    if (localJsonPropertyOrder == null)
      return null;
    return localJsonPropertyOrder.value();
  }

  public Boolean findSerializationSortAlphabetically(AnnotatedClass paramAnnotatedClass)
  {
    JsonPropertyOrder localJsonPropertyOrder = (JsonPropertyOrder)paramAnnotatedClass.getAnnotation(JsonPropertyOrder.class);
    if (localJsonPropertyOrder == null)
      return null;
    return Boolean.valueOf(localJsonPropertyOrder.alphabetic());
  }

  public Class<?> findSerializationType(Annotated paramAnnotated)
  {
    JsonSerialize localJsonSerialize = (JsonSerialize)paramAnnotated.getAnnotation(JsonSerialize.class);
    if (localJsonSerialize != null)
    {
      Class localClass = localJsonSerialize.as();
      if (localClass != NoClass.class)
        return localClass;
    }
    return null;
  }

  public JsonSerialize.Typing findSerializationTyping(Annotated paramAnnotated)
  {
    JsonSerialize localJsonSerialize = (JsonSerialize)paramAnnotated.getAnnotation(JsonSerialize.class);
    if (localJsonSerialize == null)
      return null;
    return localJsonSerialize.typing();
  }

  public Object findSerializer(Annotated paramAnnotated)
  {
    JsonSerialize localJsonSerialize = (JsonSerialize)paramAnnotated.getAnnotation(JsonSerialize.class);
    if (localJsonSerialize != null)
    {
      Class localClass = localJsonSerialize.using();
      if (localClass != JsonSerializer.None.class)
        return localClass;
    }
    JsonRawValue localJsonRawValue = (JsonRawValue)paramAnnotated.getAnnotation(JsonRawValue.class);
    if ((localJsonRawValue != null) && (localJsonRawValue.value()))
      return new RawSerializer(paramAnnotated.getRawType());
    return null;
  }

  public List<NamedType> findSubtypes(Annotated paramAnnotated)
  {
    JsonSubTypes localJsonSubTypes = (JsonSubTypes)paramAnnotated.getAnnotation(JsonSubTypes.class);
    Object localObject;
    if (localJsonSubTypes == null)
      localObject = null;
    while (true)
    {
      return localObject;
      JsonSubTypes.Type[] arrayOfType = localJsonSubTypes.value();
      localObject = new ArrayList(arrayOfType.length);
      int i = arrayOfType.length;
      for (int j = 0; j < i; j++)
      {
        JsonSubTypes.Type localType = arrayOfType[j];
        ((ArrayList)localObject).add(new NamedType(localType.value(), localType.name()));
      }
    }
  }

  public String findTypeName(AnnotatedClass paramAnnotatedClass)
  {
    JsonTypeName localJsonTypeName = (JsonTypeName)paramAnnotatedClass.getAnnotation(JsonTypeName.class);
    if (localJsonTypeName == null)
      return null;
    return localJsonTypeName.value();
  }

  public TypeResolverBuilder<?> findTypeResolver(MapperConfig<?> paramMapperConfig, AnnotatedClass paramAnnotatedClass, JavaType paramJavaType)
  {
    return _findTypeResolver(paramMapperConfig, paramAnnotatedClass, paramJavaType);
  }

  public NameTransformer findUnwrappingNameTransformer(AnnotatedMember paramAnnotatedMember)
  {
    JsonUnwrapped localJsonUnwrapped = (JsonUnwrapped)paramAnnotatedMember.getAnnotation(JsonUnwrapped.class);
    if ((localJsonUnwrapped == null) || (!localJsonUnwrapped.enabled()))
      return null;
    return NameTransformer.simpleTransformer(localJsonUnwrapped.prefix(), localJsonUnwrapped.suffix());
  }

  public Object findValueInstantiator(AnnotatedClass paramAnnotatedClass)
  {
    JsonValueInstantiator localJsonValueInstantiator = (JsonValueInstantiator)paramAnnotatedClass.getAnnotation(JsonValueInstantiator.class);
    if (localJsonValueInstantiator == null)
      return null;
    return localJsonValueInstantiator.value();
  }

  public Class<?>[] findViews(Annotated paramAnnotated)
  {
    JsonView localJsonView = (JsonView)paramAnnotated.getAnnotation(JsonView.class);
    if (localJsonView == null)
      return null;
    return localJsonView.value();
  }

  public boolean hasAnyGetterAnnotation(AnnotatedMethod paramAnnotatedMethod)
  {
    return paramAnnotatedMethod.hasAnnotation(JsonAnyGetter.class);
  }

  public boolean hasAnySetterAnnotation(AnnotatedMethod paramAnnotatedMethod)
  {
    return paramAnnotatedMethod.hasAnnotation(JsonAnySetter.class);
  }

  public boolean hasAsValueAnnotation(AnnotatedMethod paramAnnotatedMethod)
  {
    JsonValue localJsonValue = (JsonValue)paramAnnotatedMethod.getAnnotation(JsonValue.class);
    return (localJsonValue != null) && (localJsonValue.value());
  }

  public boolean hasCreatorAnnotation(Annotated paramAnnotated)
  {
    return paramAnnotated.hasAnnotation(JsonCreator.class);
  }

  public boolean hasIgnoreMarker(AnnotatedMember paramAnnotatedMember)
  {
    return _isIgnorable(paramAnnotatedMember);
  }

  public boolean isAnnotationBundle(Annotation paramAnnotation)
  {
    return paramAnnotation.annotationType().getAnnotation(JacksonAnnotationsInside.class) != null;
  }

  public Boolean isIgnorableType(AnnotatedClass paramAnnotatedClass)
  {
    JsonIgnoreType localJsonIgnoreType = (JsonIgnoreType)paramAnnotatedClass.getAnnotation(JsonIgnoreType.class);
    if (localJsonIgnoreType == null)
      return null;
    return Boolean.valueOf(localJsonIgnoreType.value());
  }

  public Boolean isTypeId(AnnotatedMember paramAnnotatedMember)
  {
    return Boolean.valueOf(paramAnnotatedMember.hasAnnotation(JsonTypeId.class));
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
