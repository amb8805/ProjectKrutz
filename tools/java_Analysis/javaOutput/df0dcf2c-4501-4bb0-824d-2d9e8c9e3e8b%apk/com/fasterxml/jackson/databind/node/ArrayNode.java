package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayNode extends ContainerNode<ArrayNode>
{
  protected List<JsonNode> _children;

  public ArrayNode(JsonNodeFactory paramJsonNodeFactory)
  {
    super(paramJsonNodeFactory);
  }

  private ArrayNode _add(JsonNode paramJsonNode)
  {
    if (this._children == null)
      this._children = _createList();
    this._children.add(paramJsonNode);
    return this;
  }

  private boolean _sameChildren(List<JsonNode> paramList)
  {
    int i = paramList.size();
    if (size() != i)
      return false;
    for (int j = 0; j < i; j++)
      if (!((JsonNode)this._children.get(j)).equals(paramList.get(j)))
        return false;
    return true;
  }

  protected List<JsonNode> _createList()
  {
    return new ArrayList();
  }

  protected boolean _customEquals(ArrayNode paramArrayNode)
  {
    return true;
  }

  protected boolean _equals(ArrayNode paramArrayNode)
  {
    return (_stdEquals(paramArrayNode)) && (_customEquals(paramArrayNode)) && (paramArrayNode._customEquals(this));
  }

  protected final boolean _stdEquals(ArrayNode paramArrayNode)
  {
    if ((this._children == null) || (this._children.size() == 0))
      return paramArrayNode.size() == 0;
    return paramArrayNode._sameChildren(this._children);
  }

  public ArrayNode add(JsonNode paramJsonNode)
  {
    if (paramJsonNode == null)
      paramJsonNode = nullNode();
    _add(paramJsonNode);
    return this;
  }

  public JsonToken asToken()
  {
    return JsonToken.START_ARRAY;
  }

  public Iterator<JsonNode> elements()
  {
    if (this._children == null)
      return ContainerNode.NoNodesIterator.instance();
    return this._children.iterator();
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
      bool2 = paramObject instanceof ArrayNode;
      bool1 = false;
    }
    while (!bool2);
    return _equals((ArrayNode)paramObject);
  }

  public JsonNode get(String paramString)
  {
    return null;
  }

  public int hashCode()
  {
    if (this._children == null)
    {
      j = 1;
      return j;
    }
    int i = this._children.size();
    Iterator localIterator = this._children.iterator();
    int j = i;
    label33: JsonNode localJsonNode;
    if (localIterator.hasNext())
    {
      localJsonNode = (JsonNode)localIterator.next();
      if (localJsonNode == null)
        break label73;
    }
    label73: for (int k = j ^ localJsonNode.hashCode(); ; k = j)
    {
      j = k;
      break label33;
      break;
    }
  }

  public boolean isArray()
  {
    return true;
  }

  public final void serialize(JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    paramJsonGenerator.writeStartArray();
    if (this._children != null)
    {
      Iterator localIterator = this._children.iterator();
      while (localIterator.hasNext())
        ((BaseJsonNode)localIterator.next()).serialize(paramJsonGenerator, paramSerializerProvider);
    }
    paramJsonGenerator.writeEndArray();
  }

  public void serializeWithType(JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, TypeSerializer paramTypeSerializer)
  {
    paramTypeSerializer.writeTypePrefixForArray(this, paramJsonGenerator);
    if (this._children != null)
    {
      Iterator localIterator = this._children.iterator();
      while (localIterator.hasNext())
        ((BaseJsonNode)localIterator.next()).serialize(paramJsonGenerator, paramSerializerProvider);
    }
    paramTypeSerializer.writeTypeSuffixForArray(this, paramJsonGenerator);
  }

  public int size()
  {
    if (this._children == null)
      return 0;
    return this._children.size();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(16 + (size() << 4));
    localStringBuilder.append((char)'[');
    if (this._children != null)
    {
      int i = this._children.size();
      for (int j = 0; j < i; j++)
      {
        if (j > 0)
          localStringBuilder.append((char)',');
        localStringBuilder.append(((JsonNode)this._children.get(j)).toString());
      }
    }
    localStringBuilder.append((char)']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.node.ArrayNode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
