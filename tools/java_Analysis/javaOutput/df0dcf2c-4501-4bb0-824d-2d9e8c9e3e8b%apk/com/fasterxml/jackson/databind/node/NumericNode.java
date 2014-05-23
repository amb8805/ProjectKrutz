package com.fasterxml.jackson.databind.node;

public abstract class NumericNode extends ValueNode
{
  protected NumericNode()
  {
  }

  public final boolean isNumber()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.node.NumericNode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
