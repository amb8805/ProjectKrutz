package com.fasterxml.jackson.core;

public abstract class ObjectCodec
{
  protected ObjectCodec()
  {
  }

  public abstract <T extends TreeNode> T readTree(JsonParser paramJsonParser);

  public abstract <T> T treeToValue(TreeNode paramTreeNode, Class<T> paramClass);

  public abstract void writeValue(JsonGenerator paramJsonGenerator, Object paramObject);
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.core.ObjectCodec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
