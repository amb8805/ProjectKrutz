package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public abstract class DOMDeserializer<T> extends FromStringDeserializer<T>
{
  static final DocumentBuilderFactory _parserFactory;

  static
  {
    DocumentBuilderFactory localDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
    _parserFactory = localDocumentBuilderFactory;
    localDocumentBuilderFactory.setNamespaceAware(true);
  }

  protected DOMDeserializer(Class<T> paramClass)
  {
    super(paramClass);
  }

  public abstract T _deserialize(String paramString, DeserializationContext paramDeserializationContext);

  protected final Document parse(String paramString)
  {
    try
    {
      Document localDocument = _parserFactory.newDocumentBuilder().parse(new InputSource(new StringReader(paramString)));
      return localDocument;
    }
    catch (Exception localException)
    {
      throw new IllegalArgumentException("Failed to parse JSON String as XML: " + localException.getMessage(), localException);
    }
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ext.DOMDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
