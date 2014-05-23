package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.databind.JsonNode;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TreeTraversingParser extends ParserMinimalBase
{
  protected boolean _closed;
  protected JsonToken _nextToken;
  protected NodeCursor _nodeCursor;
  protected ObjectCodec _objectCodec;
  protected boolean _startContainer;

  public TreeTraversingParser(JsonNode paramJsonNode, ObjectCodec paramObjectCodec)
  {
    super(0);
    this._objectCodec = paramObjectCodec;
    if (paramJsonNode.isArray())
    {
      this._nextToken = JsonToken.START_ARRAY;
      this._nodeCursor = new NodeCursor.Array(paramJsonNode, null);
      return;
    }
    if (paramJsonNode.isObject())
    {
      this._nextToken = JsonToken.START_OBJECT;
      this._nodeCursor = new NodeCursor.Object(paramJsonNode, null);
      return;
    }
    this._nodeCursor = new NodeCursor.RootValue(paramJsonNode, null);
  }

  protected void _handleEOF()
  {
    _throwInternal();
  }

  public void close()
  {
    if (!this._closed)
    {
      this._closed = true;
      this._nodeCursor = null;
      this._currToken = null;
    }
  }

  protected JsonNode currentNode()
  {
    if ((this._closed) || (this._nodeCursor == null))
      return null;
    return this._nodeCursor.currentNode();
  }

  protected JsonNode currentNumericNode()
  {
    JsonNode localJsonNode = currentNode();
    if ((localJsonNode == null) || (!localJsonNode.isNumber()))
    {
      if (localJsonNode == null);
      for (Object localObject = null; ; localObject = localJsonNode.asToken())
        throw _constructError("Current token (" + localObject + ") not numeric, can not use numeric value accessors");
    }
    return localJsonNode;
  }

  public BigInteger getBigIntegerValue()
  {
    return currentNumericNode().bigIntegerValue();
  }

  public byte[] getBinaryValue(Base64Variant paramBase64Variant)
  {
    JsonNode localJsonNode = currentNode();
    if (localJsonNode != null)
    {
      byte[] arrayOfByte = localJsonNode.binaryValue();
      if (arrayOfByte != null)
        return arrayOfByte;
      if (localJsonNode.isPojo())
      {
        Object localObject = ((POJONode)localJsonNode).getPojo();
        if ((localObject instanceof byte[]))
          return (byte[])localObject;
      }
    }
    return null;
  }

  public ObjectCodec getCodec()
  {
    return this._objectCodec;
  }

  public JsonLocation getCurrentLocation()
  {
    return JsonLocation.NA;
  }

  public String getCurrentName()
  {
    if (this._nodeCursor == null)
      return null;
    return this._nodeCursor.getCurrentName();
  }

  public BigDecimal getDecimalValue()
  {
    return currentNumericNode().decimalValue();
  }

  public double getDoubleValue()
  {
    return currentNumericNode().doubleValue();
  }

  public Object getEmbeddedObject()
  {
    if (!this._closed)
    {
      JsonNode localJsonNode = currentNode();
      if (localJsonNode != null)
      {
        if (localJsonNode.isPojo())
          return ((POJONode)localJsonNode).getPojo();
        if (localJsonNode.isBinary())
          return ((BinaryNode)localJsonNode).binaryValue();
      }
    }
    return null;
  }

  public float getFloatValue()
  {
    return (float)currentNumericNode().doubleValue();
  }

  public int getIntValue()
  {
    return currentNumericNode().intValue();
  }

  public long getLongValue()
  {
    return currentNumericNode().longValue();
  }

  public JsonParser.NumberType getNumberType()
  {
    JsonNode localJsonNode = currentNumericNode();
    if (localJsonNode == null)
      return null;
    return localJsonNode.numberType();
  }

  public Number getNumberValue()
  {
    return currentNumericNode().numberValue();
  }

  public String getText()
  {
    if (this._closed);
    JsonNode localJsonNode;
    do
    {
      while (this._currToken == null)
      {
        return null;
        switch (TreeTraversingParser.1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[this._currToken.ordinal()])
        {
        default:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        }
      }
      return this._currToken.asString();
      return this._nodeCursor.getCurrentName();
      return currentNode().textValue();
      return String.valueOf(currentNode().numberValue());
      localJsonNode = currentNode();
    }
    while ((localJsonNode == null) || (!localJsonNode.isBinary()));
    return localJsonNode.asText();
  }

  public char[] getTextCharacters()
  {
    return getText().toCharArray();
  }

  public int getTextLength()
  {
    return getText().length();
  }

  public int getTextOffset()
  {
    return 0;
  }

  public JsonLocation getTokenLocation()
  {
    return JsonLocation.NA;
  }

  public boolean hasTextCharacters()
  {
    return false;
  }

  public JsonToken nextToken()
  {
    if (this._nextToken != null)
    {
      this._currToken = this._nextToken;
      this._nextToken = null;
      return this._currToken;
    }
    if (this._startContainer)
    {
      this._startContainer = false;
      if (!this._nodeCursor.currentHasChildren())
      {
        if (this._currToken == JsonToken.START_OBJECT);
        for (JsonToken localJsonToken = JsonToken.END_OBJECT; ; localJsonToken = JsonToken.END_ARRAY)
        {
          this._currToken = localJsonToken;
          return this._currToken;
        }
      }
      this._nodeCursor = this._nodeCursor.iterateChildren();
      this._currToken = this._nodeCursor.nextToken();
      if ((this._currToken == JsonToken.START_OBJECT) || (this._currToken == JsonToken.START_ARRAY))
        this._startContainer = true;
      return this._currToken;
    }
    if (this._nodeCursor == null)
    {
      this._closed = true;
      return null;
    }
    this._currToken = this._nodeCursor.nextToken();
    if (this._currToken != null)
    {
      if ((this._currToken == JsonToken.START_OBJECT) || (this._currToken == JsonToken.START_ARRAY))
        this._startContainer = true;
      return this._currToken;
    }
    this._currToken = this._nodeCursor.endToken();
    this._nodeCursor = this._nodeCursor.getParent();
    return this._currToken;
  }

  public JsonParser skipChildren()
  {
    if (this._currToken == JsonToken.START_OBJECT)
    {
      this._startContainer = false;
      this._currToken = JsonToken.END_OBJECT;
    }
    while (this._currToken != JsonToken.START_ARRAY)
      return this;
    this._startContainer = false;
    this._currToken = JsonToken.END_ARRAY;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.node.TreeTraversingParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
