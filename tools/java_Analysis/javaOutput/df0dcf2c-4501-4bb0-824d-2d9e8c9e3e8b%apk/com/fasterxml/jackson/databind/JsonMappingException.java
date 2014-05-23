package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public class JsonMappingException extends JsonProcessingException
{
  private static final long serialVersionUID = 1L;
  protected LinkedList<JsonMappingException.Reference> _path;

  public JsonMappingException(String paramString)
  {
    super(paramString);
  }

  public JsonMappingException(String paramString, JsonLocation paramJsonLocation)
  {
    super(paramString, paramJsonLocation);
  }

  public JsonMappingException(String paramString, JsonLocation paramJsonLocation, Throwable paramThrowable)
  {
    super(paramString, paramJsonLocation, paramThrowable);
  }

  public JsonMappingException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }

  public static JsonMappingException from(JsonParser paramJsonParser, String paramString)
  {
    return new JsonMappingException(paramString, paramJsonParser.getTokenLocation());
  }

  public static JsonMappingException from(JsonParser paramJsonParser, String paramString, Throwable paramThrowable)
  {
    return new JsonMappingException(paramString, paramJsonParser.getTokenLocation(), paramThrowable);
  }

  public static JsonMappingException fromUnexpectedIOE(IOException paramIOException)
  {
    return new JsonMappingException("Unexpected IOException (of type " + paramIOException.getClass().getName() + "): " + paramIOException.getMessage(), null, paramIOException);
  }

  public static JsonMappingException wrapWithPath(Throwable paramThrowable, JsonMappingException.Reference paramReference)
  {
    if ((paramThrowable instanceof JsonMappingException));
    String str;
    for (JsonMappingException localJsonMappingException = (JsonMappingException)paramThrowable; ; localJsonMappingException = new JsonMappingException(str, null, paramThrowable))
    {
      localJsonMappingException.prependPath(paramReference);
      return localJsonMappingException;
      str = paramThrowable.getMessage();
      if ((str == null) || (str.length() == 0))
        str = "(was " + paramThrowable.getClass().getName() + ")";
    }
  }

  public static JsonMappingException wrapWithPath(Throwable paramThrowable, Object paramObject, int paramInt)
  {
    return wrapWithPath(paramThrowable, new JsonMappingException.Reference(paramObject, paramInt));
  }

  public static JsonMappingException wrapWithPath(Throwable paramThrowable, Object paramObject, String paramString)
  {
    return wrapWithPath(paramThrowable, new JsonMappingException.Reference(paramObject, paramString));
  }

  protected void _appendPathDesc(StringBuilder paramStringBuilder)
  {
    if (this._path == null);
    while (true)
    {
      return;
      Iterator localIterator = this._path.iterator();
      while (localIterator.hasNext())
      {
        paramStringBuilder.append(((JsonMappingException.Reference)localIterator.next()).toString());
        if (localIterator.hasNext())
          paramStringBuilder.append("->");
      }
    }
  }

  protected String _buildMessage()
  {
    String str = super.getMessage();
    if (this._path == null)
      return str;
    if (str == null);
    for (StringBuilder localStringBuilder1 = new StringBuilder(); ; localStringBuilder1 = new StringBuilder(str))
    {
      localStringBuilder1.append(" (through reference chain: ");
      StringBuilder localStringBuilder2 = getPathReference(localStringBuilder1);
      localStringBuilder2.append((char)')');
      return localStringBuilder2.toString();
    }
  }

  public String getLocalizedMessage()
  {
    return _buildMessage();
  }

  public String getMessage()
  {
    return _buildMessage();
  }

  public StringBuilder getPathReference(StringBuilder paramStringBuilder)
  {
    _appendPathDesc(paramStringBuilder);
    return paramStringBuilder;
  }

  public void prependPath(JsonMappingException.Reference paramReference)
  {
    if (this._path == null)
      this._path = new LinkedList();
    if (this._path.size() < 1000)
      this._path.addFirst(paramReference);
  }

  public void prependPath(Object paramObject, String paramString)
  {
    prependPath(new JsonMappingException.Reference(paramObject, paramString));
  }

  public String toString()
  {
    return getClass().getName() + ": " + getMessage();
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.JsonMappingException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
