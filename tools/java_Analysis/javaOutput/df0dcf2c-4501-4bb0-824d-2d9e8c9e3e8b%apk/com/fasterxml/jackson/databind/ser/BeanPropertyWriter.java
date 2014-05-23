package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;

public class BeanPropertyWriter
  implements BeanProperty
{
  public static final Object MARKER_FOR_EMPTY = new Object();
  protected final Method _accessorMethod;
  protected final JavaType _cfgSerializationType;
  protected final Annotations _contextAnnotations;
  protected final JavaType _declaredType;
  protected PropertySerializerMap _dynamicSerializers;
  protected final Field _field;
  protected final Class<?>[] _includeInViews;
  protected HashMap<Object, Object> _internalSettings;
  protected final AnnotatedMember _member;
  protected final SerializedString _name;
  protected JavaType _nonTrivialBaseType;
  protected JsonSerializer<Object> _nullSerializer;
  protected JsonSerializer<Object> _serializer;
  protected final boolean _suppressNulls;
  protected final Object _suppressableValue;
  protected TypeSerializer _typeSerializer;

  public BeanPropertyWriter(BeanPropertyDefinition paramBeanPropertyDefinition, AnnotatedMember paramAnnotatedMember, Annotations paramAnnotations, JavaType paramJavaType1, JsonSerializer<?> paramJsonSerializer, TypeSerializer paramTypeSerializer, JavaType paramJavaType2, boolean paramBoolean, Object paramObject)
  {
    this._member = paramAnnotatedMember;
    this._contextAnnotations = paramAnnotations;
    this._name = new SerializedString(paramBeanPropertyDefinition.getName());
    this._declaredType = paramJavaType1;
    this._serializer = paramJsonSerializer;
    PropertySerializerMap localPropertySerializerMap;
    if (paramJsonSerializer == null)
    {
      localPropertySerializerMap = PropertySerializerMap.emptyMap();
      this._dynamicSerializers = localPropertySerializerMap;
      this._typeSerializer = paramTypeSerializer;
      this._cfgSerializationType = paramJavaType2;
      if (!(paramAnnotatedMember instanceof AnnotatedField))
        break label124;
      this._accessorMethod = null;
    }
    for (this._field = ((Field)paramAnnotatedMember.getMember()); ; this._field = null)
    {
      this._suppressNulls = paramBoolean;
      this._suppressableValue = paramObject;
      this._includeInViews = paramBeanPropertyDefinition.findViews();
      this._nullSerializer = null;
      return;
      localPropertySerializerMap = null;
      break;
      label124: if (!(paramAnnotatedMember instanceof AnnotatedMethod))
        break label150;
      this._accessorMethod = ((Method)paramAnnotatedMember.getMember());
    }
    label150: throw new IllegalArgumentException("Can not pass member of type " + paramAnnotatedMember.getClass().getName());
  }

  protected BeanPropertyWriter(BeanPropertyWriter paramBeanPropertyWriter)
  {
    this(paramBeanPropertyWriter, paramBeanPropertyWriter._name);
  }

  protected BeanPropertyWriter(BeanPropertyWriter paramBeanPropertyWriter, SerializedString paramSerializedString)
  {
    this._name = paramSerializedString;
    this._member = paramBeanPropertyWriter._member;
    this._contextAnnotations = paramBeanPropertyWriter._contextAnnotations;
    this._declaredType = paramBeanPropertyWriter._declaredType;
    this._accessorMethod = paramBeanPropertyWriter._accessorMethod;
    this._field = paramBeanPropertyWriter._field;
    this._serializer = paramBeanPropertyWriter._serializer;
    this._nullSerializer = paramBeanPropertyWriter._nullSerializer;
    if (paramBeanPropertyWriter._internalSettings != null)
      this._internalSettings = new HashMap(paramBeanPropertyWriter._internalSettings);
    this._cfgSerializationType = paramBeanPropertyWriter._cfgSerializationType;
    this._dynamicSerializers = paramBeanPropertyWriter._dynamicSerializers;
    this._suppressNulls = paramBeanPropertyWriter._suppressNulls;
    this._suppressableValue = paramBeanPropertyWriter._suppressableValue;
    this._includeInViews = paramBeanPropertyWriter._includeInViews;
    this._typeSerializer = paramBeanPropertyWriter._typeSerializer;
    this._nonTrivialBaseType = paramBeanPropertyWriter._nonTrivialBaseType;
  }

  protected JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap paramPropertySerializerMap, Class<?> paramClass, SerializerProvider paramSerializerProvider)
  {
    if (this._nonTrivialBaseType != null);
    for (PropertySerializerMap.SerializerAndMapResult localSerializerAndMapResult = paramPropertySerializerMap.findAndAddSerializer(paramSerializerProvider.constructSpecializedType(this._nonTrivialBaseType, paramClass), paramSerializerProvider, this); ; localSerializerAndMapResult = paramPropertySerializerMap.findAndAddSerializer(paramClass, paramSerializerProvider, this))
    {
      if (paramPropertySerializerMap != localSerializerAndMapResult.map)
        this._dynamicSerializers = localSerializerAndMapResult.map;
      return localSerializerAndMapResult.serializer;
    }
  }

  protected void _handleSelfReference(Object paramObject, JsonSerializer<?> paramJsonSerializer)
  {
    if (paramJsonSerializer.usesObjectId())
      return;
    throw new JsonMappingException("Direct self-reference leading to cycle");
  }

  public void assignNullSerializer(JsonSerializer<Object> paramJsonSerializer)
  {
    if ((this._nullSerializer != null) && (this._nullSerializer != paramJsonSerializer))
      throw new IllegalStateException("Can not override null serializer");
    this._nullSerializer = paramJsonSerializer;
  }

  public void assignSerializer(JsonSerializer<Object> paramJsonSerializer)
  {
    if ((this._serializer != null) && (this._serializer != paramJsonSerializer))
      throw new IllegalStateException("Can not override serializer");
    this._serializer = paramJsonSerializer;
  }

  public final Object get(Object paramObject)
  {
    if (this._accessorMethod != null)
      return this._accessorMethod.invoke(paramObject, new Object[0]);
    return this._field.get(paramObject);
  }

  public Type getGenericPropertyType()
  {
    if (this._accessorMethod != null)
      return this._accessorMethod.getGenericReturnType();
    return this._field.getGenericType();
  }

  public AnnotatedMember getMember()
  {
    return this._member;
  }

  public String getName()
  {
    return this._name.getValue();
  }

  public JavaType getSerializationType()
  {
    return this._cfgSerializationType;
  }

  public JavaType getType()
  {
    return this._declaredType;
  }

  public Class<?>[] getViews()
  {
    return this._includeInViews;
  }

  public boolean hasNullSerializer()
  {
    return this._nullSerializer != null;
  }

  public boolean hasSerializer()
  {
    return this._serializer != null;
  }

  public BeanPropertyWriter rename(NameTransformer paramNameTransformer)
  {
    String str = paramNameTransformer.transform(this._name.getValue());
    if (str.equals(this._name.toString()))
      return this;
    return new BeanPropertyWriter(this, new SerializedString(str));
  }

  public void serializeAsColumn(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    Object localObject = get(paramObject);
    if (localObject == null)
    {
      if (this._nullSerializer == null)
        break label113;
      this._nullSerializer.serialize(null, paramJsonGenerator, paramSerializerProvider);
    }
    JsonSerializer localJsonSerializer;
    while (true)
    {
      localJsonSerializer = this._serializer;
      if (localJsonSerializer == null)
      {
        Class localClass = localObject.getClass();
        PropertySerializerMap localPropertySerializerMap = this._dynamicSerializers;
        localJsonSerializer = localPropertySerializerMap.serializerFor(localClass);
        if (localJsonSerializer == null)
          localJsonSerializer = _findAndAddDynamic(localPropertySerializerMap, localClass, paramSerializerProvider);
      }
      if (this._suppressableValue == null)
        break label140;
      if (MARKER_FOR_EMPTY != this._suppressableValue)
        break;
      if (!localJsonSerializer.isEmpty(localObject))
        break label140;
      serializeAsPlaceholder(paramObject, paramJsonGenerator, paramSerializerProvider);
      return;
      label113: paramJsonGenerator.writeNull();
    }
    if (this._suppressableValue.equals(localObject))
    {
      serializeAsPlaceholder(paramObject, paramJsonGenerator, paramSerializerProvider);
      return;
    }
    label140: if (localObject == paramObject)
      _handleSelfReference(paramObject, localJsonSerializer);
    if (this._typeSerializer == null)
    {
      localJsonSerializer.serialize(localObject, paramJsonGenerator, paramSerializerProvider);
      return;
    }
    localJsonSerializer.serializeWithType(localObject, paramJsonGenerator, paramSerializerProvider, this._typeSerializer);
  }

  public void serializeAsField(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    Object localObject = get(paramObject);
    if (localObject == null)
      if (this._nullSerializer != null)
      {
        paramJsonGenerator.writeFieldName(this._name);
        this._nullSerializer.serialize(null, paramJsonGenerator, paramSerializerProvider);
      }
    JsonSerializer localJsonSerializer;
    do
    {
      return;
      localJsonSerializer = this._serializer;
      if (localJsonSerializer == null)
      {
        Class localClass = localObject.getClass();
        PropertySerializerMap localPropertySerializerMap = this._dynamicSerializers;
        localJsonSerializer = localPropertySerializerMap.serializerFor(localClass);
        if (localJsonSerializer == null)
          localJsonSerializer = _findAndAddDynamic(localPropertySerializerMap, localClass, paramSerializerProvider);
      }
      if (this._suppressableValue == null)
        break;
      if (MARKER_FOR_EMPTY != this._suppressableValue)
        break label152;
    }
    while (localJsonSerializer.isEmpty(localObject));
    label152: 
    while (!this._suppressableValue.equals(localObject))
    {
      if (localObject == paramObject)
        _handleSelfReference(paramObject, localJsonSerializer);
      paramJsonGenerator.writeFieldName(this._name);
      if (this._typeSerializer != null)
        break;
      localJsonSerializer.serialize(localObject, paramJsonGenerator, paramSerializerProvider);
      return;
    }
    return;
    localJsonSerializer.serializeWithType(localObject, paramJsonGenerator, paramSerializerProvider, this._typeSerializer);
  }

  public void serializeAsPlaceholder(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    if (this._nullSerializer != null)
    {
      this._nullSerializer.serialize(null, paramJsonGenerator, paramSerializerProvider);
      return;
    }
    paramJsonGenerator.writeNull();
  }

  public void setNonTrivialBaseType(JavaType paramJavaType)
  {
    this._nonTrivialBaseType = paramJavaType;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(40);
    localStringBuilder.append("property '").append(getName()).append("' (");
    if (this._accessorMethod != null)
    {
      localStringBuilder.append("via method ").append(this._accessorMethod.getDeclaringClass().getName()).append("#").append(this._accessorMethod.getName());
      if (this._serializer != null)
        break label142;
      localStringBuilder.append(", no static serializer");
    }
    while (true)
    {
      localStringBuilder.append((char)')');
      return localStringBuilder.toString();
      localStringBuilder.append("field \"").append(this._field.getDeclaringClass().getName()).append("#").append(this._field.getName());
      break;
      label142: localStringBuilder.append(", static serializer of type " + this._serializer.getClass().getName());
    }
  }

  public BeanPropertyWriter unwrappingWriter(NameTransformer paramNameTransformer)
  {
    return new UnwrappingBeanPropertyWriter(this, paramNameTransformer);
  }

  public boolean willSuppressNulls()
  {
    return this._suppressNulls;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.BeanPropertyWriter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
