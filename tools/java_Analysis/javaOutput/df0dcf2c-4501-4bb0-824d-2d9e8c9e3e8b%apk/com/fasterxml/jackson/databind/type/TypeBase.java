package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public abstract class TypeBase extends JavaType
  implements JsonSerializable
{
  private static final long serialVersionUID = -3581199092426900829L;
  volatile transient String _canonicalName;

  protected TypeBase(Class<?> paramClass, int paramInt, Object paramObject1, Object paramObject2)
  {
    super(paramClass, paramInt, paramObject1, paramObject2);
  }

  protected abstract String buildCanonicalName();

  public <T> T getTypeHandler()
  {
    return this._typeHandler;
  }

  public <T> T getValueHandler()
  {
    return this._valueHandler;
  }

  public void serialize(JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    paramJsonGenerator.writeString(toCanonical());
  }

  public void serializeWithType(JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, TypeSerializer paramTypeSerializer)
  {
    paramTypeSerializer.writeTypePrefixForScalar(this, paramJsonGenerator);
    serialize(paramJsonGenerator, paramSerializerProvider);
    paramTypeSerializer.writeTypeSuffixForScalar(this, paramJsonGenerator);
  }

  public String toCanonical()
  {
    String str = this._canonicalName;
    if (str == null)
      str = buildCanonicalName();
    return str;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.type.TypeBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
