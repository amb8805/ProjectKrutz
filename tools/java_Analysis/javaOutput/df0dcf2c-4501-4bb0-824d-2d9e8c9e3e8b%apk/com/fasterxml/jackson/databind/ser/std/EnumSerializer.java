package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.EnumValues;

@JacksonStdImpl
public class EnumSerializer extends StdScalarSerializer<Enum<?>>
  implements ContextualSerializer
{
  protected final Boolean _serializeAsIndex;
  protected final EnumValues _values;

  public EnumSerializer(EnumValues paramEnumValues, Boolean paramBoolean)
  {
    super(Enum.class, false);
    this._values = paramEnumValues;
    this._serializeAsIndex = paramBoolean;
  }

  protected static Boolean _isShapeWrittenUsingIndex(Class<?> paramClass, JsonFormat.Value paramValue, boolean paramBoolean)
  {
    JsonFormat.Shape localShape;
    if (paramValue == null)
    {
      localShape = null;
      if (localShape != null)
        break label20;
    }
    label20: 
    while ((localShape == JsonFormat.Shape.ANY) || (localShape == JsonFormat.Shape.SCALAR))
    {
      return null;
      localShape = paramValue.getShape();
      break;
    }
    if (localShape == JsonFormat.Shape.STRING)
      return Boolean.FALSE;
    if (localShape.isNumeric())
      return Boolean.TRUE;
    StringBuilder localStringBuilder = new StringBuilder("Unsupported serialization shape (").append(localShape).append(") for Enum ").append(paramClass.getName()).append(", not supported as ");
    if (paramBoolean);
    for (String str = "class"; ; str = "property")
      throw new IllegalArgumentException(str + " annotation");
  }

  public static EnumSerializer construct(Class<Enum<?>> paramClass, SerializationConfig paramSerializationConfig, BeanDescription paramBeanDescription, JsonFormat.Value paramValue)
  {
    AnnotationIntrospector localAnnotationIntrospector = paramSerializationConfig.getAnnotationIntrospector();
    if (paramSerializationConfig.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING));
    for (EnumValues localEnumValues = EnumValues.constructFromToString(paramClass, localAnnotationIntrospector); ; localEnumValues = EnumValues.constructFromName(paramClass, localAnnotationIntrospector))
      return new EnumSerializer(localEnumValues, _isShapeWrittenUsingIndex(paramClass, paramValue, true));
  }

  protected final boolean _serializeAsIndex(SerializerProvider paramSerializerProvider)
  {
    if (this._serializeAsIndex != null)
      return this._serializeAsIndex.booleanValue();
    return paramSerializerProvider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX);
  }

  public JsonSerializer<?> createContextual(SerializerProvider paramSerializerProvider, BeanProperty paramBeanProperty)
  {
    if (paramBeanProperty != null)
    {
      JsonFormat.Value localValue = paramSerializerProvider.getAnnotationIntrospector().findFormat(paramBeanProperty.getMember());
      if (localValue != null)
      {
        Boolean localBoolean = _isShapeWrittenUsingIndex(paramBeanProperty.getType().getRawClass(), localValue, false);
        if (localBoolean != this._serializeAsIndex)
          this = new EnumSerializer(this._values, localBoolean);
      }
    }
    return this;
  }

  public EnumValues getEnumValues()
  {
    return this._values;
  }

  public final void serialize(Enum<?> paramEnum, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    if (_serializeAsIndex(paramSerializerProvider))
    {
      paramJsonGenerator.writeNumber(paramEnum.ordinal());
      return;
    }
    paramJsonGenerator.writeString(this._values.serializedValueFor(paramEnum));
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.std.EnumSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
