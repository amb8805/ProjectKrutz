package com.squareup.wire;

public abstract class ExtendableMessage<T extends ExtendableMessage<?>> extends Message
{
  transient f<T> extensionMap;
}

/* Location:
 * Qualified Name:     com.squareup.wire.ExtendableMessage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
