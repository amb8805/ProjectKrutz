package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;

public class MappingJsonFactory extends JsonFactory
{
  private static final long serialVersionUID = -6744103724013275513L;

  public MappingJsonFactory()
  {
    this(null);
  }

  public MappingJsonFactory(ObjectMapper paramObjectMapper)
  {
    super(paramObjectMapper);
    if (paramObjectMapper == null)
      setCodec(new ObjectMapper(this));
  }

  public final ObjectMapper getCodec()
  {
    return (ObjectMapper)this._objectCodec;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.MappingJsonFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
