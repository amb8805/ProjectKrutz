package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.w3c.dom.Node;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

public class DOMSerializer extends StdSerializer<Node>
{
  protected final DOMImplementationLS _domImpl;

  public DOMSerializer()
  {
    super(Node.class);
    try
    {
      DOMImplementationRegistry localDOMImplementationRegistry = DOMImplementationRegistry.newInstance();
      this._domImpl = ((DOMImplementationLS)localDOMImplementationRegistry.getDOMImplementation("LS"));
      return;
    }
    catch (Exception localException)
    {
      throw new IllegalStateException("Could not instantiate DOMImplementationRegistry: " + localException.getMessage(), localException);
    }
  }

  public void serialize(Node paramNode, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    if (this._domImpl == null)
      throw new IllegalStateException("Could not find DOM LS");
    paramJsonGenerator.writeString(this._domImpl.createLSSerializer().writeToString(paramNode));
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ext.DOMSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
