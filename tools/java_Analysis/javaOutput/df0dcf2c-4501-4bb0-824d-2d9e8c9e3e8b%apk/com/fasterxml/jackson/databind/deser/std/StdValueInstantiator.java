package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.io.Serializable;

public class StdValueInstantiator extends ValueInstantiator
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  protected final boolean _cfgEmptyStringsAsObjects;
  protected CreatorProperty[] _constructorArguments;
  protected AnnotatedWithParams _defaultCreator;
  protected CreatorProperty[] _delegateArguments;
  protected AnnotatedWithParams _delegateCreator;
  protected JavaType _delegateType;
  protected AnnotatedWithParams _fromBooleanCreator;
  protected AnnotatedWithParams _fromDoubleCreator;
  protected AnnotatedWithParams _fromIntCreator;
  protected AnnotatedWithParams _fromLongCreator;
  protected AnnotatedWithParams _fromStringCreator;
  protected final String _valueTypeDesc;
  protected AnnotatedWithParams _withArgsCreator;

  public StdValueInstantiator(DeserializationConfig paramDeserializationConfig, JavaType paramJavaType)
  {
    boolean bool;
    if (paramDeserializationConfig == null)
    {
      bool = false;
      this._cfgEmptyStringsAsObjects = bool;
      if (paramJavaType != null)
        break label41;
    }
    label41: for (String str = "UNKNOWN TYPE"; ; str = paramJavaType.toString())
    {
      this._valueTypeDesc = str;
      return;
      bool = paramDeserializationConfig.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
      break;
    }
  }

  protected Object _createFromStringFallbacks(DeserializationContext paramDeserializationContext, String paramString)
  {
    if (this._fromBooleanCreator != null)
    {
      String str = paramString.trim();
      if ("true".equals(str))
        return createFromBoolean(paramDeserializationContext, true);
      if ("false".equals(str))
        return createFromBoolean(paramDeserializationContext, false);
    }
    if ((this._cfgEmptyStringsAsObjects) && (paramString.length() == 0))
      return null;
    throw new JsonMappingException("Can not instantiate value of type " + getValueTypeDesc() + " from String value; no single-String constructor/factory method");
  }

  public boolean canCreateFromBoolean()
  {
    return this._fromBooleanCreator != null;
  }

  public boolean canCreateFromDouble()
  {
    return this._fromDoubleCreator != null;
  }

  public boolean canCreateFromInt()
  {
    return this._fromIntCreator != null;
  }

  public boolean canCreateFromLong()
  {
    return this._fromLongCreator != null;
  }

  public boolean canCreateFromObjectWith()
  {
    return this._withArgsCreator != null;
  }

  public boolean canCreateFromString()
  {
    return this._fromStringCreator != null;
  }

  public boolean canCreateUsingDefault()
  {
    return this._defaultCreator != null;
  }

  public boolean canCreateUsingDelegate()
  {
    return this._delegateType != null;
  }

  public void configureFromBooleanCreator(AnnotatedWithParams paramAnnotatedWithParams)
  {
    this._fromBooleanCreator = paramAnnotatedWithParams;
  }

  public void configureFromDoubleCreator(AnnotatedWithParams paramAnnotatedWithParams)
  {
    this._fromDoubleCreator = paramAnnotatedWithParams;
  }

  public void configureFromIntCreator(AnnotatedWithParams paramAnnotatedWithParams)
  {
    this._fromIntCreator = paramAnnotatedWithParams;
  }

  public void configureFromLongCreator(AnnotatedWithParams paramAnnotatedWithParams)
  {
    this._fromLongCreator = paramAnnotatedWithParams;
  }

  public void configureFromObjectSettings(AnnotatedWithParams paramAnnotatedWithParams1, AnnotatedWithParams paramAnnotatedWithParams2, JavaType paramJavaType, CreatorProperty[] paramArrayOfCreatorProperty1, AnnotatedWithParams paramAnnotatedWithParams3, CreatorProperty[] paramArrayOfCreatorProperty2)
  {
    this._defaultCreator = paramAnnotatedWithParams1;
    this._delegateCreator = paramAnnotatedWithParams2;
    this._delegateType = paramJavaType;
    this._delegateArguments = paramArrayOfCreatorProperty1;
    this._withArgsCreator = paramAnnotatedWithParams3;
    this._constructorArguments = paramArrayOfCreatorProperty2;
  }

  public void configureFromStringCreator(AnnotatedWithParams paramAnnotatedWithParams)
  {
    this._fromStringCreator = paramAnnotatedWithParams;
  }

  public Object createFromBoolean(DeserializationContext paramDeserializationContext, boolean paramBoolean)
  {
    try
    {
      if (this._fromBooleanCreator != null)
      {
        Object localObject = this._fromBooleanCreator.call1(Boolean.valueOf(paramBoolean));
        return localObject;
      }
    }
    catch (Exception localException)
    {
      throw wrapException(localException);
    }
    catch (ExceptionInInitializerError localExceptionInInitializerError)
    {
      throw wrapException(localExceptionInInitializerError);
    }
    throw new JsonMappingException("Can not instantiate value of type " + getValueTypeDesc() + " from Boolean value; no single-boolean/Boolean-arg constructor/factory method");
  }

  public Object createFromDouble(DeserializationContext paramDeserializationContext, double paramDouble)
  {
    try
    {
      if (this._fromDoubleCreator != null)
      {
        Object localObject = this._fromDoubleCreator.call1(Double.valueOf(paramDouble));
        return localObject;
      }
    }
    catch (Exception localException)
    {
      throw wrapException(localException);
    }
    catch (ExceptionInInitializerError localExceptionInInitializerError)
    {
      throw wrapException(localExceptionInInitializerError);
    }
    throw new JsonMappingException("Can not instantiate value of type " + getValueTypeDesc() + " from Floating-point number; no one-double/Double-arg constructor/factory method");
  }

  public Object createFromInt(DeserializationContext paramDeserializationContext, int paramInt)
  {
    try
    {
      if (this._fromIntCreator != null)
        return this._fromIntCreator.call1(Integer.valueOf(paramInt));
      if (this._fromLongCreator != null)
      {
        Object localObject = this._fromLongCreator.call1(Long.valueOf(paramInt));
        return localObject;
      }
    }
    catch (Exception localException)
    {
      throw wrapException(localException);
    }
    catch (ExceptionInInitializerError localExceptionInInitializerError)
    {
      throw wrapException(localExceptionInInitializerError);
    }
    throw new JsonMappingException("Can not instantiate value of type " + getValueTypeDesc() + " from Integral number; no single-int-arg constructor/factory method");
  }

  public Object createFromLong(DeserializationContext paramDeserializationContext, long paramLong)
  {
    try
    {
      if (this._fromLongCreator != null)
      {
        Object localObject = this._fromLongCreator.call1(Long.valueOf(paramLong));
        return localObject;
      }
    }
    catch (Exception localException)
    {
      throw wrapException(localException);
    }
    catch (ExceptionInInitializerError localExceptionInInitializerError)
    {
      throw wrapException(localExceptionInInitializerError);
    }
    throw new JsonMappingException("Can not instantiate value of type " + getValueTypeDesc() + " from Long integral number; no single-long-arg constructor/factory method");
  }

  public Object createFromObjectWith(DeserializationContext paramDeserializationContext, Object[] paramArrayOfObject)
  {
    if (this._withArgsCreator == null)
      throw new IllegalStateException("No with-args constructor for " + getValueTypeDesc());
    try
    {
      Object localObject = this._withArgsCreator.call(paramArrayOfObject);
      return localObject;
    }
    catch (ExceptionInInitializerError localExceptionInInitializerError)
    {
      throw wrapException(localExceptionInInitializerError);
    }
    catch (Exception localException)
    {
      throw wrapException(localException);
    }
  }

  public Object createFromString(DeserializationContext paramDeserializationContext, String paramString)
  {
    if (this._fromStringCreator != null)
      try
      {
        Object localObject = this._fromStringCreator.call1(paramString);
        return localObject;
      }
      catch (Exception localException)
      {
        throw wrapException(localException);
      }
      catch (ExceptionInInitializerError localExceptionInInitializerError)
      {
        throw wrapException(localExceptionInInitializerError);
      }
    return _createFromStringFallbacks(paramDeserializationContext, paramString);
  }

  public Object createUsingDefault(DeserializationContext paramDeserializationContext)
  {
    if (this._defaultCreator == null)
      throw new IllegalStateException("No default constructor for " + getValueTypeDesc());
    try
    {
      Object localObject = this._defaultCreator.call();
      return localObject;
    }
    catch (ExceptionInInitializerError localExceptionInInitializerError)
    {
      throw wrapException(localExceptionInInitializerError);
    }
    catch (Exception localException)
    {
      throw wrapException(localException);
    }
  }

  public Object createUsingDelegate(DeserializationContext paramDeserializationContext, Object paramObject)
  {
    if (this._delegateCreator == null)
      throw new IllegalStateException("No delegate constructor for " + getValueTypeDesc());
    try
    {
      if (this._delegateArguments == null)
        return this._delegateCreator.call1(paramObject);
      i = this._delegateArguments.length;
      arrayOfObject = new Object[i];
      j = 0;
      if (j < i)
      {
        localCreatorProperty = this._delegateArguments[j];
        if (localCreatorProperty == null)
          arrayOfObject[j] = paramObject;
        else
          arrayOfObject[j] = paramDeserializationContext.findInjectableValue(localCreatorProperty.getInjectableValueId(), localCreatorProperty, null);
      }
    }
    catch (ExceptionInInitializerError localExceptionInInitializerError)
    {
      throw wrapException(localExceptionInInitializerError);
      localObject = this._delegateCreator.call(arrayOfObject);
      return localObject;
    }
    catch (Exception localException)
    {
      throw wrapException(localException);
    }
    while (true)
    {
      int i;
      Object[] arrayOfObject;
      int j;
      CreatorProperty localCreatorProperty;
      Object localObject;
      j++;
    }
  }

  public AnnotatedWithParams getDefaultCreator()
  {
    return this._defaultCreator;
  }

  public AnnotatedWithParams getDelegateCreator()
  {
    return this._delegateCreator;
  }

  public JavaType getDelegateType(DeserializationConfig paramDeserializationConfig)
  {
    return this._delegateType;
  }

  public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig paramDeserializationConfig)
  {
    return this._constructorArguments;
  }

  public String getValueTypeDesc()
  {
    return this._valueTypeDesc;
  }

  protected JsonMappingException wrapException(Throwable paramThrowable)
  {
    for (Throwable localThrowable = paramThrowable; localThrowable.getCause() != null; localThrowable = localThrowable.getCause());
    if ((localThrowable instanceof JsonMappingException))
      return (JsonMappingException)localThrowable;
    return new JsonMappingException("Instantiation of " + getValueTypeDesc() + " value failed: " + localThrowable.getMessage(), localThrowable);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.StdValueInstantiator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
