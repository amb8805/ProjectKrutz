package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;

abstract class NodeCursor extends JsonStreamContext
{
  protected String _currentName;
  protected final NodeCursor _parent;

  public NodeCursor(int paramInt, NodeCursor paramNodeCursor)
  {
    this._type = paramInt;
    this._index = -1;
    this._parent = paramNodeCursor;
  }

  public abstract boolean currentHasChildren();

  public abstract JsonNode currentNode();

  public abstract JsonToken endToken();

  public final String getCurrentName()
  {
    return this._currentName;
  }

  public final NodeCursor getParent()
  {
    return this._parent;
  }

  public final NodeCursor iterateChildren()
  {
    JsonNode localJsonNode = currentNode();
    if (localJsonNode == null)
      throw new IllegalStateException("No current node");
    if (localJsonNode.isArray())
      return new NodeCursor.Array(localJsonNode, this);
    if (localJsonNode.isObject())
      return new NodeCursor.Object(localJsonNode, this);
    throw new IllegalStateException("Current node of type " + localJsonNode.getClass().getName());
  }

  public abstract JsonToken nextToken();
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.node.NodeCursor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
