package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Collection;
import java.util.Iterator;

public class UnrecognizedPropertyException extends JsonMappingException
{
  private static final long serialVersionUID = 1L;
  protected transient String _propertiesAsString;
  protected final Collection<Object> _propertyIds;
  protected final Class<?> _referringClass;
  protected final String _unrecognizedPropertyName;

  public UnrecognizedPropertyException(String paramString1, JsonLocation paramJsonLocation, Class<?> paramClass, String paramString2, Collection<Object> paramCollection)
  {
    super(paramString1, paramJsonLocation);
    this._referringClass = paramClass;
    this._unrecognizedPropertyName = paramString2;
    this._propertyIds = paramCollection;
  }

  public static UnrecognizedPropertyException from(JsonParser paramJsonParser, Object paramObject, String paramString, Collection<Object> paramCollection)
  {
    if (paramObject == null)
      throw new IllegalArgumentException();
    if ((paramObject instanceof Class));
    for (Class localClass = (Class)paramObject; ; localClass = paramObject.getClass())
    {
      UnrecognizedPropertyException localUnrecognizedPropertyException = new UnrecognizedPropertyException("Unrecognized field \"" + paramString + "\" (class " + localClass.getName() + "), not marked as ignorable", paramJsonParser.getCurrentLocation(), localClass, paramString, paramCollection);
      localUnrecognizedPropertyException.prependPath(paramObject, paramString);
      return localUnrecognizedPropertyException;
    }
  }

  public String getMessageSuffix()
  {
    String str = this._propertiesAsString;
    StringBuilder localStringBuilder;
    int i;
    if ((str == null) && (this._propertyIds != null))
    {
      localStringBuilder = new StringBuilder(100);
      i = this._propertyIds.size();
      if (i != 1)
        break label96;
      localStringBuilder.append(" (one known property: \"");
      localStringBuilder.append(String.valueOf(this._propertyIds.iterator().next()));
      localStringBuilder.append((char)'"');
      break label123;
    }
    while (true)
    {
      localStringBuilder.append("])");
      str = localStringBuilder.toString();
      this._propertiesAsString = str;
      return str;
      label96: localStringBuilder.append(" (").append(i).append(" known properties: ");
      Iterator localIterator = this._propertyIds.iterator();
      label123: if (localIterator.hasNext())
      {
        localStringBuilder.append(", \"");
        localStringBuilder.append(String.valueOf(localIterator.next()));
        localStringBuilder.append((char)'"');
        if (localStringBuilder.length() <= 200)
          break;
        localStringBuilder.append(" [truncated]");
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
