package com.fasterxml.jackson.databind.node;

public abstract class ContainerNode<T extends ContainerNode<T>> extends BaseJsonNode
{
  protected final JsonNodeFactory _nodeFactory;

  protected ContainerNode(JsonNodeFactory paramJsonNodeFactory)
  {
    this._nodeFactory = paramJsonNodeFactory;
  }

  public String asText()
  {
    return "";
  }

  public final NullNode nullNode()
  {
    return this._nodeFactory.nullNode();
  }

  public abstract int size();
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.node.ContainerNode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
