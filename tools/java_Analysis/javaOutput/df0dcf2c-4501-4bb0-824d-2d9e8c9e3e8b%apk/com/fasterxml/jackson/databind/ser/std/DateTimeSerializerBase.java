package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

public abstract class DateTimeSerializerBase<T> extends StdScalarSerializer<T>
  implements ContextualSerializer
{
  protected final DateFormat _customFormat;
  protected final boolean _useTimestamp;

  protected DateTimeSerializerBase(Class<T> paramClass, boolean paramBoolean, DateFormat paramDateFormat)
  {
    super(paramClass);
    this._useTimestamp = paramBoolean;
    this._customFormat = paramDateFormat;
  }

  protected abstract long _timestamp(T paramT);

  public JsonSerializer<?> createContextual(SerializerProvider paramSerializerProvider, BeanProperty paramBeanProperty)
  {
    JsonFormat.Value localValue;
    if (paramBeanProperty != null)
    {
      localValue = paramSerializerProvider.getAnnotationIntrospector().findFormat(paramBeanProperty.getMember());
      if (localValue != null)
      {
        if (!localValue.getShape().isNumeric())
          break label41;
        this = withFormat(true, null);
      }
    }
    return this;
    label41: TimeZone localTimeZone1 = localValue.getTimeZone();
    String str = localValue.getPattern();
    SimpleDateFormat localSimpleDateFormat;
    if (str.length() > 0)
    {
      Locale localLocale = localValue.getLocale();
      if (localLocale == null)
        localLocale = paramSerializerProvider.getLocale();
      localSimpleDateFormat = new SimpleDateFormat(str, localLocale);
      if (localTimeZone1 != null)
        break label176;
    }
    label176: for (TimeZone localTimeZone2 = paramSerializerProvider.getTimeZone(); ; localTimeZone2 = localTimeZone1)
    {
      localSimpleDateFormat.setTimeZone(localTimeZone2);
      return withFormat(false, localSimpleDateFormat);
      if (localTimeZone1 == null)
        break;
      DateFormat localDateFormat1 = paramSerializerProvider.getConfig().getDateFormat();
      DateFormat localDateFormat2;
      if (localDateFormat1.getClass() == StdDateFormat.class)
        localDateFormat2 = StdDateFormat.getISO8601Format(localTimeZone1);
      while (true)
      {
        return withFormat(false, localDateFormat2);
        localDateFormat2 = (DateFormat)localDateFormat1.clone();
        localDateFormat2.setTimeZone(localTimeZone1);
      }
    }
  }

  public boolean isEmpty(T paramT)
  {
    return (paramT == null) || (_timestamp(paramT) == 0L);
  }

  public abstract DateTimeSerializerBase<T> withFormat(boolean paramBoolean, DateFormat paramDateFormat);
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
