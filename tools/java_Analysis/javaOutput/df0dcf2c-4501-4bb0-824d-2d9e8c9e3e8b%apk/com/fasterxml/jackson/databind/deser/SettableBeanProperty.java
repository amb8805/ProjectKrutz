package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.InternCache;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.NullProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import java.io.IOException;
import java.io.Serializable;

public abstract class SettableBeanProperty
  implements BeanProperty, Serializable
{
  private static final long serialVersionUID = -1026580169193933453L;
  protected final transient Annotations _contextAnnotations;
  protected String _managedReferenceName;
  protected NullProvider _nullProvider;
  protected final String _propName;
  protected int _propertyIndex = -1;
  protected final JavaType _type;
  protected JsonDeserializer<Object> _valueDeserializer;
  protected TypeDeserializer _valueTypeDeserializer;
  protected ViewMatcher _viewMatcher;

  protected SettableBeanProperty(SettableBeanProperty paramSettableBeanProperty)
  {
    this._propName = paramSettableBeanProperty._propName;
    this._type = paramSettableBeanProperty._type;
    this._contextAnnotations = paramSettableBeanProperty._contextAnnotations;
    this._valueDeserializer = paramSettableBeanProperty._valueDeserializer;
    this._valueTypeDeserializer = paramSettableBeanProperty._valueTypeDeserializer;
    this._nullProvider = paramSettableBeanProperty._nullProvider;
    this._managedReferenceName = paramSettableBeanProperty._managedReferenceName;
    this._propertyIndex = paramSettableBeanProperty._propertyIndex;
    this._viewMatcher = paramSettableBeanProperty._viewMatcher;
  }

  protected SettableBeanProperty(SettableBeanProperty paramSettableBeanProperty, JsonDeserializer<?> paramJsonDeserializer)
  {
    this._propName = paramSettableBeanProperty._propName;
    this._type = paramSettableBeanProperty._type;
    this._contextAnnotations = paramSettableBeanProperty._contextAnnotations;
    this._valueTypeDeserializer = paramSettableBeanProperty._valueTypeDeserializer;
    this._managedReferenceName = paramSettableBeanProperty._managedReferenceName;
    this._propertyIndex = paramSettableBeanProperty._propertyIndex;
    this._valueDeserializer = paramJsonDeserializer;
    SettableBeanProperty localSettableBeanProperty;
    if (paramJsonDeserializer == null)
      localSettableBeanProperty = this;
    while (true)
    {
      localSettableBeanProperty._nullProvider = localNullProvider;
      this._viewMatcher = paramSettableBeanProperty._viewMatcher;
      return;
      Object localObject = paramJsonDeserializer.getNullValue();
      if (localObject == null)
      {
        localSettableBeanProperty = this;
        localNullProvider = null;
      }
      else
      {
        localNullProvider = new NullProvider(this._type, localObject);
        localSettableBeanProperty = this;
      }
    }
  }

  protected SettableBeanProperty(SettableBeanProperty paramSettableBeanProperty, String paramString)
  {
    this._propName = paramString;
    this._type = paramSettableBeanProperty._type;
    this._contextAnnotations = paramSettableBeanProperty._contextAnnotations;
    this._valueDeserializer = paramSettableBeanProperty._valueDeserializer;
    this._valueTypeDeserializer = paramSettableBeanProperty._valueTypeDeserializer;
    this._nullProvider = paramSettableBeanProperty._nullProvider;
    this._managedReferenceName = paramSettableBeanProperty._managedReferenceName;
    this._propertyIndex = paramSettableBeanProperty._propertyIndex;
    this._viewMatcher = paramSettableBeanProperty._viewMatcher;
  }

  protected SettableBeanProperty(BeanPropertyDefinition paramBeanPropertyDefinition, JavaType paramJavaType, TypeDeserializer paramTypeDeserializer, Annotations paramAnnotations)
  {
    this(paramBeanPropertyDefinition.getName(), paramJavaType, paramTypeDeserializer, paramAnnotations);
  }

  protected SettableBeanProperty(String paramString, JavaType paramJavaType, TypeDeserializer paramTypeDeserializer, Annotations paramAnnotations)
  {
    if ((paramString == null) || (paramString.length() == 0));
    for (this._propName = ""; ; this._propName = InternCache.instance.intern(paramString))
    {
      this._type = paramJavaType;
      this._contextAnnotations = paramAnnotations;
      this._viewMatcher = null;
      if (paramTypeDeserializer != null)
        paramTypeDeserializer = paramTypeDeserializer.forProperty(this);
      this._valueTypeDeserializer = paramTypeDeserializer;
      return;
    }
  }

  protected IOException _throwAsIOE(Exception paramException)
  {
    if ((paramException instanceof IOException))
      throw ((IOException)paramException);
    if ((paramException instanceof RuntimeException))
      throw ((RuntimeException)paramException);
    while (paramException.getCause() != null)
      paramException = paramException.getCause();
    throw new JsonMappingException(paramException.getMessage(), null, paramException);
  }

  protected void _throwAsIOE(Exception paramException, Object paramObject)
  {
    if ((paramException instanceof IllegalArgumentException))
    {
      String str1;
      StringBuilder localStringBuilder;
      if (paramObject == null)
      {
        str1 = "[NULL]";
        localStringBuilder = new StringBuilder("Problem deserializing property '").append(getName());
        localStringBuilder.append("' (expected type: ").append(getType());
        localStringBuilder.append("; actual type: ").append(str1).append(")");
        String str2 = paramException.getMessage();
        if (str2 == null)
          break label117;
        localStringBuilder.append(", problem: ").append(str2);
      }
      while (true)
      {
        throw new JsonMappingException(localStringBuilder.toString(), null, paramException);
        str1 = paramObject.getClass().getName();
        break;
        label117: localStringBuilder.append(" (no error message provided)");
      }
    }
    _throwAsIOE(paramException);
  }

  public void assignIndex(int paramInt)
  {
    if (this._propertyIndex != -1)
      throw new IllegalStateException("Property '" + getName() + "' already had index (" + this._propertyIndex + "), trying to assign " + paramInt);
    this._propertyIndex = paramInt;
  }

  public final Object deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
  {
    if (paramJsonParser.getCurrentToken() == JsonToken.VALUE_NULL)
    {
      if (this._nullProvider == null)
        return null;
      return this._nullProvider.nullValue(paramDeserializationContext);
    }
    if (this._valueTypeDeserializer != null)
      return this._valueDeserializer.deserializeWithType(paramJsonParser, paramDeserializationContext, this._valueTypeDeserializer);
    return this._valueDeserializer.deserialize(paramJsonParser, paramDeserializationContext);
  }

  public abstract void deserializeAndSet(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject);

  public abstract Object deserializeSetAndReturn(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext, Object paramObject);

  public int getCreatorIndex()
  {
    return -1;
  }

  protected final Class<?> getDeclaringClass()
  {
    return getMember().getDeclaringClass();
  }

  public Object getInjectableValueId()
  {
    return null;
  }

  public String getManagedReferenceName()
  {
    return this._managedReferenceName;
  }

  public abstract AnnotatedMember getMember();

  public final String getName()
  {
    return this._propName;
  }

  public JavaType getType()
  {
    return this._type;
  }

  public JsonDeserializer<Object> getValueDeserializer()
  {
    return this._valueDeserializer;
  }

  public TypeDeserializer getValueTypeDeserializer()
  {
    return this._valueTypeDeserializer;
  }

  public boolean hasValueDeserializer()
  {
    return this._valueDeserializer != null;
  }

  public boolean hasValueTypeDeserializer()
  {
    return this._valueTypeDeserializer != null;
  }

  public boolean hasViews()
  {
    return this._viewMatcher != null;
  }

  public abstract void set(Object paramObject1, Object paramObject2);

  public abstract Object setAndReturn(Object paramObject1, Object paramObject2);

  public void setManagedReferenceName(String paramString)
  {
    this._managedReferenceName = paramString;
  }

  public void setViews(Class<?>[] paramArrayOfClass)
  {
    if (paramArrayOfClass == null)
    {
      this._viewMatcher = null;
      return;
    }
    this._viewMatcher = ViewMatcher.construct(paramArrayOfClass);
  }

  public String toString()
  {
    return "[property '" + getName() + "']";
  }

  public boolean visibleInView(Class<?> paramClass)
  {
    return (this._viewMatcher == null) || (this._viewMatcher.isVisibleForView(paramClass));
  }

  public abstract SettableBeanProperty withName(String paramString);

  public abstract SettableBeanProperty withValueDeserializer(JsonDeserializer<?> paramJsonDeserializer);
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.SettableBeanProperty
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
