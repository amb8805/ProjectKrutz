package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ObjectNode extends ContainerNode<ObjectNode>
{
  protected Map<String, JsonNode> _children = null;

  public ObjectNode(JsonNodeFactory paramJsonNodeFactory)
  {
    super(paramJsonNodeFactory);
  }

  private final JsonNode _put(String paramString, JsonNode paramJsonNode)
  {
    if (this._children == null)
      this._children = _createMap();
    return (JsonNode)this._children.put(paramString, paramJsonNode);
  }

  protected Map<String, JsonNode> _createMap()
  {
    return new LinkedHashMap();
  }

  protected boolean _customEquals(ObjectNode paramObjectNode)
  {
    return true;
  }

  protected boolean _equals(ObjectNode paramObjectNode)
  {
    return (_stdEquals(paramObjectNode)) && (_customEquals(paramObjectNode)) && (paramObjectNode._customEquals(this));
  }

  protected final boolean _stdEquals(ObjectNode paramObjectNode)
  {
    if (paramObjectNode.size() != size())
      return false;
    if (this._children != null)
    {
      Iterator localIterator = this._children.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        String str = (String)localEntry.getKey();
        JsonNode localJsonNode1 = (JsonNode)localEntry.getValue();
        JsonNode localJsonNode2 = paramObjectNode.get(str);
        if ((localJsonNode2 == null) || (!localJsonNode2.equals(localJsonNode1)))
          return false;
      }
    }
    return true;
  }

  public JsonToken asToken()
  {
    return JsonToken.START_OBJECT;
  }

  public Iterator<JsonNode> elements()
  {
    if (this._children == null)
      return ContainerNode.NoNodesIterator.instance();
    return this._children.values().iterator();
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1;
    if (paramObject == this)
      bool1 = true;
    boolean bool2;
    do
    {
      do
      {
        return bool1;
        bool1 = false;
      }
      while (paramObject == null);
      if (paramObject.getClass() == getClass())
        break;
      bool2 = paramObject instanceof ObjectNode;
      bool1 = false;
    }
    while (!bool2);
    return _equals((ObjectNode)paramObject);
  }

  public Iterator<Map.Entry<String, JsonNode>> fields()
  {
    if (this._children == null)
      return ObjectNode.NoFieldsIterator.instance;
    return this._children.entrySet().iterator();
  }

  public JsonNode get(String paramString)
  {
    if (this._children != null)
      return (JsonNode)this._children.get(paramString);
    return null;
  }

  public int hashCode()
  {
    if (this._children == null)
      return -1;
    return this._children.hashCode();
  }

  public boolean isObject()
  {
    return true;
  }

  public JsonNode replace(String paramString, JsonNode paramJsonNode)
  {
    if (paramJsonNode == null)
      paramJsonNode = nullNode();
    return _put(paramString, paramJsonNode);
  }

  public final void serialize(JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    paramJsonGenerator.writeStartObject();
    if (this._children != null)
    {
      Iterator localIterator = this._children.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramJsonGenerator.writeFieldName((String)localEntry.getKey());
        ((BaseJsonNode)localEntry.getValue()).serialize(paramJsonGenerator, paramSerializerProvider);
      }
    }
    paramJsonGenerator.writeEndObject();
  }

  public void serializeWithType(JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, TypeSerializer paramTypeSerializer)
  {
    paramTypeSerializer.writeTypePrefixForObject(this, paramJsonGenerator);
    if (this._children != null)
    {
      Iterator localIterator = this._children.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramJsonGenerator.writeFieldName((String)localEntry.getKey());
        ((BaseJsonNode)localEntry.getValue()).serialize(paramJsonGenerator, paramSerializerProvider);
      }
    }
    paramTypeSerializer.writeTypeSuffixForObject(this, paramJsonGenerator);
  }

  public int size()
  {
    if (this._children == null)
      return 0;
    return this._children.size();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(32 + (size() << 4));
    localStringBuilder.append("{");
    if (this._children != null)
    {
      Iterator localIterator = this._children.entrySet().iterator();
      int j;
      for (int i = 0; localIterator.hasNext(); i = j)
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (i > 0)
          localStringBuilder.append(",");
        j = i + 1;
        TextNode.appendQuoted(localStringBuilder, (String)localEntry.getKey());
        localStringBuilder.append((char)':');
        localStringBuilder.append(((JsonNode)localEntry.getValue()).toString());
      }
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.node.ObjectNode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
