package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import java.io.Serializable;

public class MinimalPrettyPrinter
  implements PrettyPrinter, Serializable
{
  private static final long serialVersionUID = -562765100295218442L;
  protected String _rootValueSeparator = " ";

  public MinimalPrettyPrinter()
  {
    this(" ");
  }

  public MinimalPrettyPrinter(String paramString)
  {
    this._rootValueSeparator = paramString;
  }

  public void beforeArrayValues(JsonGenerator paramJsonGenerator)
  {
  }

  public void beforeObjectEntries(JsonGenerator paramJsonGenerator)
  {
  }

  public void writeArrayValueSeparator(JsonGenerator paramJsonGenerator)
  {
    paramJsonGenerator.writeRaw((char)',');
  }

  public void writeEndArray(JsonGenerator paramJsonGenerator, int paramInt)
  {
    paramJsonGenerator.writeRaw((char)']');
  }

  public void writeEndObject(JsonGenerator paramJsonGenerator, int paramInt)
  {
    paramJsonGenerator.writeRaw((char)'}');
  }

  public void writeObjectEntrySeparator(JsonGenerator paramJsonGenerator)
  {
    paramJsonGenerator.writeRaw((char)',');
  }

  public void writeObjectFieldValueSeparator(JsonGenerator paramJsonGenerator)
  {
    paramJsonGenerator.writeRaw((char)':');
  }

  public void writeRootValueSeparator(JsonGenerator paramJsonGenerator)
  {
    if (this._rootValueSeparator != null)
      paramJsonGenerator.writeRaw(this._rootValueSeparator);
  }

  public void writeStartArray(JsonGenerator paramJsonGenerator)
  {
    paramJsonGenerator.writeRaw((char)'[');
  }

  public void writeStartObject(JsonGenerator paramJsonGenerator)
  {
    paramJsonGenerator.writeRaw((char)'{');
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.core.util.MinimalPrettyPrinter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
