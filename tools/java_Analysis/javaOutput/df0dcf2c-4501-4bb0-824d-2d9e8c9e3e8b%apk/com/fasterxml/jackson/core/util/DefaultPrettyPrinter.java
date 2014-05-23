package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import java.io.Serializable;

public class DefaultPrettyPrinter
  implements PrettyPrinter, Instantiatable<DefaultPrettyPrinter>, Serializable
{
  public static final SerializedString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(" ");
  private static final long serialVersionUID = -5512586643324525213L;
  protected DefaultPrettyPrinter.Indenter _arrayIndenter = DefaultPrettyPrinter.FixedSpaceIndenter.instance;
  protected transient int _nesting = 0;
  protected DefaultPrettyPrinter.Indenter _objectIndenter = DefaultPrettyPrinter.Lf2SpacesIndenter.instance;
  protected final SerializableString _rootSeparator;
  protected boolean _spacesInObjectEntries = true;

  public DefaultPrettyPrinter()
  {
    this(DEFAULT_ROOT_VALUE_SEPARATOR);
  }

  public DefaultPrettyPrinter(SerializableString paramSerializableString)
  {
    this._rootSeparator = paramSerializableString;
  }

  public DefaultPrettyPrinter(DefaultPrettyPrinter paramDefaultPrettyPrinter)
  {
    this(paramDefaultPrettyPrinter, paramDefaultPrettyPrinter._rootSeparator);
  }

  public DefaultPrettyPrinter(DefaultPrettyPrinter paramDefaultPrettyPrinter, SerializableString paramSerializableString)
  {
    this._arrayIndenter = paramDefaultPrettyPrinter._arrayIndenter;
    this._objectIndenter = paramDefaultPrettyPrinter._objectIndenter;
    this._spacesInObjectEntries = paramDefaultPrettyPrinter._spacesInObjectEntries;
    this._nesting = paramDefaultPrettyPrinter._nesting;
    this._rootSeparator = paramSerializableString;
  }

  public void beforeArrayValues(JsonGenerator paramJsonGenerator)
  {
    this._arrayIndenter.writeIndentation(paramJsonGenerator, this._nesting);
  }

  public void beforeObjectEntries(JsonGenerator paramJsonGenerator)
  {
    this._objectIndenter.writeIndentation(paramJsonGenerator, this._nesting);
  }

  public DefaultPrettyPrinter createInstance()
  {
    return new DefaultPrettyPrinter(this);
  }

  public void writeArrayValueSeparator(JsonGenerator paramJsonGenerator)
  {
    paramJsonGenerator.writeRaw((char)',');
    this._arrayIndenter.writeIndentation(paramJsonGenerator, this._nesting);
  }

  public void writeEndArray(JsonGenerator paramJsonGenerator, int paramInt)
  {
    if (!this._arrayIndenter.isInline())
      this._nesting = (-1 + this._nesting);
    if (paramInt > 0)
      this._arrayIndenter.writeIndentation(paramJsonGenerator, this._nesting);
    while (true)
    {
      paramJsonGenerator.writeRaw((char)']');
      return;
      paramJsonGenerator.writeRaw((char)' ');
    }
  }

  public void writeEndObject(JsonGenerator paramJsonGenerator, int paramInt)
  {
    if (!this._objectIndenter.isInline())
      this._nesting = (-1 + this._nesting);
    if (paramInt > 0)
      this._objectIndenter.writeIndentation(paramJsonGenerator, this._nesting);
    while (true)
    {
      paramJsonGenerator.writeRaw((char)'}');
      return;
      paramJsonGenerator.writeRaw((char)' ');
    }
  }

  public void writeObjectEntrySeparator(JsonGenerator paramJsonGenerator)
  {
    paramJsonGenerator.writeRaw((char)',');
    this._objectIndenter.writeIndentation(paramJsonGenerator, this._nesting);
  }

  public void writeObjectFieldValueSeparator(JsonGenerator paramJsonGenerator)
  {
    if (this._spacesInObjectEntries)
    {
      paramJsonGenerator.writeRaw(" : ");
      return;
    }
    paramJsonGenerator.writeRaw((char)':');
  }

  public void writeRootValueSeparator(JsonGenerator paramJsonGenerator)
  {
    if (this._rootSeparator != null)
      paramJsonGenerator.writeRaw(this._rootSeparator);
  }

  public void writeStartArray(JsonGenerator paramJsonGenerator)
  {
    if (!this._arrayIndenter.isInline())
      this._nesting = (1 + this._nesting);
    paramJsonGenerator.writeRaw((char)'[');
  }

  public void writeStartObject(JsonGenerator paramJsonGenerator)
  {
    paramJsonGenerator.writeRaw((char)'{');
    if (!this._objectIndenter.isInline())
      this._nesting = (1 + this._nesting);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.core.util.DefaultPrettyPrinter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
