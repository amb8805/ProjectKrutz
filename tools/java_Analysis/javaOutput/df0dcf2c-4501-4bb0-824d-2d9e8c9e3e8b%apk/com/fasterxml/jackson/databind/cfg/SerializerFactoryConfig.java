package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import java.io.Serializable;

public final class SerializerFactoryConfig
  implements Serializable
{
  protected static final BeanSerializerModifier[] NO_MODIFIERS = new BeanSerializerModifier[0];
  protected static final Serializers[] NO_SERIALIZERS = new Serializers[0];
  private static final long serialVersionUID = 1L;
  protected final Serializers[] _additionalKeySerializers;
  protected final Serializers[] _additionalSerializers;
  protected final BeanSerializerModifier[] _modifiers;

  public SerializerFactoryConfig()
  {
    this(null, null, null);
  }

  protected SerializerFactoryConfig(Serializers[] paramArrayOfSerializers1, Serializers[] paramArrayOfSerializers2, BeanSerializerModifier[] paramArrayOfBeanSerializerModifier)
  {
    if (paramArrayOfSerializers1 == null)
      paramArrayOfSerializers1 = NO_SERIALIZERS;
    this._additionalSerializers = paramArrayOfSerializers1;
    if (paramArrayOfSerializers2 == null)
      paramArrayOfSerializers2 = NO_SERIALIZERS;
    this._additionalKeySerializers = paramArrayOfSerializers2;
    if (paramArrayOfBeanSerializerModifier == null)
      paramArrayOfBeanSerializerModifier = NO_MODIFIERS;
    this._modifiers = paramArrayOfBeanSerializerModifier;
  }

  public final boolean hasKeySerializers()
  {
    return this._additionalKeySerializers.length > 0;
  }

  public final boolean hasSerializerModifiers()
  {
    return this._modifiers.length > 0;
  }

  public final Iterable<Serializers> keySerializers()
  {
    return ArrayBuilders.arrayAsIterable(this._additionalKeySerializers);
  }

  public final Iterable<BeanSerializerModifier> serializerModifiers()
  {
    return ArrayBuilders.arrayAsIterable(this._modifiers);
  }

  public final Iterable<Serializers> serializers()
  {
    return ArrayBuilders.arrayAsIterable(this._additionalSerializers);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
