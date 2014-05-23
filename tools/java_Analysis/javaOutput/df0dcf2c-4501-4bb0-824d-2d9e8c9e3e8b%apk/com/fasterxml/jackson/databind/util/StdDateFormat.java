package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.io.NumberInput;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class StdDateFormat extends DateFormat
{
  protected static final String[] ALL_FORMATS = { "yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd" };
  protected static final DateFormat DATE_FORMAT_ISO8601;
  protected static final DateFormat DATE_FORMAT_ISO8601_Z;
  protected static final DateFormat DATE_FORMAT_PLAIN;
  protected static final DateFormat DATE_FORMAT_RFC1123;
  private static final TimeZone DEFAULT_TIMEZONE = TimeZone.getTimeZone("GMT");
  public static final StdDateFormat instance = new StdDateFormat();
  protected transient DateFormat _formatISO8601;
  protected transient DateFormat _formatISO8601_z;
  protected transient DateFormat _formatPlain;
  protected transient DateFormat _formatRFC1123;
  protected transient TimeZone _timezone;

  static
  {
    SimpleDateFormat localSimpleDateFormat1 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
    DATE_FORMAT_RFC1123 = localSimpleDateFormat1;
    localSimpleDateFormat1.setTimeZone(DEFAULT_TIMEZONE);
    SimpleDateFormat localSimpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    DATE_FORMAT_ISO8601 = localSimpleDateFormat2;
    localSimpleDateFormat2.setTimeZone(DEFAULT_TIMEZONE);
    SimpleDateFormat localSimpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    DATE_FORMAT_ISO8601_Z = localSimpleDateFormat3;
    localSimpleDateFormat3.setTimeZone(DEFAULT_TIMEZONE);
    SimpleDateFormat localSimpleDateFormat4 = new SimpleDateFormat("yyyy-MM-dd");
    DATE_FORMAT_PLAIN = localSimpleDateFormat4;
    localSimpleDateFormat4.setTimeZone(DEFAULT_TIMEZONE);
  }

  public StdDateFormat()
  {
  }

  public StdDateFormat(TimeZone paramTimeZone)
  {
    this._timezone = paramTimeZone;
  }

  private final DateFormat _cloneFormat(DateFormat paramDateFormat)
  {
    return _cloneFormat(paramDateFormat, this._timezone);
  }

  private static final DateFormat _cloneFormat(DateFormat paramDateFormat, TimeZone paramTimeZone)
  {
    DateFormat localDateFormat = (DateFormat)paramDateFormat.clone();
    if (paramTimeZone != null)
      localDateFormat.setTimeZone(paramTimeZone);
    return localDateFormat;
  }

  public static DateFormat getISO8601Format(TimeZone paramTimeZone)
  {
    return _cloneFormat(DATE_FORMAT_ISO8601, paramTimeZone);
  }

  private static final boolean hasTimeZone(String paramString)
  {
    int i = paramString.length();
    if (i >= 6)
    {
      int j = paramString.charAt(i - 6);
      if ((j == 43) || (j == 45));
      int m;
      do
      {
        int k;
        do
        {
          return true;
          k = paramString.charAt(i - 5);
        }
        while ((k == 43) || (k == 45));
        m = paramString.charAt(i - 3);
      }
      while ((m == 43) || (m == 45));
    }
    return false;
  }

  public StdDateFormat clone()
  {
    return new StdDateFormat();
  }

  public StringBuffer format(Date paramDate, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition)
  {
    if (this._formatISO8601 == null)
      this._formatISO8601 = _cloneFormat(DATE_FORMAT_ISO8601);
    return this._formatISO8601.format(paramDate, paramStringBuffer, paramFieldPosition);
  }

  protected boolean looksLikeISO8601(String paramString)
  {
    int i = paramString.length();
    boolean bool1 = false;
    if (i >= 5)
    {
      boolean bool2 = Character.isDigit(paramString.charAt(0));
      bool1 = false;
      if (bool2)
      {
        boolean bool3 = Character.isDigit(paramString.charAt(3));
        bool1 = false;
        if (bool3)
        {
          int j = paramString.charAt(4);
          bool1 = false;
          if (j == 45)
            bool1 = true;
        }
      }
    }
    return bool1;
  }

  public Date parse(String paramString)
  {
    String str1 = paramString.trim();
    ParsePosition localParsePosition = new ParsePosition(0);
    Date localDate = parse(str1, localParsePosition);
    if (localDate != null)
      return localDate;
    StringBuilder localStringBuilder = new StringBuilder();
    String[] arrayOfString = ALL_FORMATS;
    int i = arrayOfString.length;
    int j = 0;
    if (j < i)
    {
      String str2 = arrayOfString[j];
      if (localStringBuilder.length() > 0)
        localStringBuilder.append("\", \"");
      while (true)
      {
        localStringBuilder.append(str2);
        j++;
        break;
        localStringBuilder.append((char)'"');
      }
    }
    localStringBuilder.append((char)'"');
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = str1;
    arrayOfObject[1] = localStringBuilder.toString();
    throw new ParseException(String.format("Can not parse date \"%s\": not compatible with any of standard forms (%s)", arrayOfObject), localParsePosition.getErrorIndex());
  }

  public Date parse(String paramString, ParsePosition paramParsePosition)
  {
    if (looksLikeISO8601(paramString))
      return parseAsISO8601(paramString, paramParsePosition);
    int i = paramString.length();
    int j;
    do
    {
      i--;
      if (i < 0)
        break;
      j = paramString.charAt(i);
    }
    while ((j >= 48) && (j <= 57));
    if ((i < 0) && (NumberInput.inLongRange(paramString, false)))
      return new Date(Long.parseLong(paramString));
    return parseAsRFC1123(paramString, paramParsePosition);
  }

  protected Date parseAsISO8601(String paramString, ParsePosition paramParsePosition)
  {
    int i = paramString.length();
    char c = paramString.charAt(i - 1);
    DateFormat localDateFormat;
    if ((i <= 10) && (Character.isDigit(c)))
    {
      localDateFormat = this._formatPlain;
      if (localDateFormat == null)
      {
        localDateFormat = _cloneFormat(DATE_FORMAT_PLAIN);
        this._formatPlain = localDateFormat;
      }
    }
    while (true)
    {
      return localDateFormat.parse(paramString, paramParsePosition);
      if (c == 'Z')
      {
        localDateFormat = this._formatISO8601_z;
        if (localDateFormat == null)
        {
          localDateFormat = _cloneFormat(DATE_FORMAT_ISO8601_Z);
          this._formatISO8601_z = localDateFormat;
        }
        if (paramString.charAt(i - 4) == ':')
        {
          StringBuilder localStringBuilder4 = new StringBuilder(paramString);
          localStringBuilder4.insert(i - 1, ".000");
          paramString = localStringBuilder4.toString();
        }
      }
      else
      {
        if (hasTimeZone(paramString))
        {
          int j = paramString.charAt(i - 3);
          StringBuilder localStringBuilder2;
          if (j == 58)
          {
            localStringBuilder2 = new StringBuilder(paramString);
            localStringBuilder2.delete(i - 3, i - 2);
          }
          for (paramString = localStringBuilder2.toString(); ; paramString = paramString + "00")
            do
            {
              int k = paramString.length();
              if (Character.isDigit(paramString.charAt(k - 9)))
              {
                StringBuilder localStringBuilder3 = new StringBuilder(paramString);
                localStringBuilder3.insert(k - 5, ".000");
                paramString = localStringBuilder3.toString();
              }
              localDateFormat = this._formatISO8601;
              if (this._formatISO8601 != null)
                break;
              localDateFormat = _cloneFormat(DATE_FORMAT_ISO8601);
              this._formatISO8601 = localDateFormat;
              break;
            }
            while ((j != 43) && (j != 45));
        }
        StringBuilder localStringBuilder1 = new StringBuilder(paramString);
        if (-1 + (i - paramString.lastIndexOf('T')) <= 8)
          localStringBuilder1.append(".000");
        localStringBuilder1.append((char)'Z');
        paramString = localStringBuilder1.toString();
        localDateFormat = this._formatISO8601_z;
        if (localDateFormat == null)
        {
          localDateFormat = _cloneFormat(DATE_FORMAT_ISO8601_Z);
          this._formatISO8601_z = localDateFormat;
        }
      }
    }
  }

  protected Date parseAsRFC1123(String paramString, ParsePosition paramParsePosition)
  {
    if (this._formatRFC1123 == null)
      this._formatRFC1123 = _cloneFormat(DATE_FORMAT_RFC1123);
    return this._formatRFC1123.parse(paramString, paramParsePosition);
  }

  public void setTimeZone(TimeZone paramTimeZone)
  {
    if (paramTimeZone != this._timezone)
    {
      this._formatRFC1123 = null;
      this._formatISO8601 = null;
      this._formatISO8601_z = null;
      this._formatPlain = null;
      this._timezone = paramTimeZone;
    }
  }

  public StdDateFormat withTimeZone(TimeZone paramTimeZone)
  {
    if (paramTimeZone == null)
      paramTimeZone = DEFAULT_TIMEZONE;
    return new StdDateFormat(paramTimeZone);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.util.StdDateFormat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
