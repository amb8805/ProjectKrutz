package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

public abstract class JsonGeneratorImpl extends GeneratorBase
{
  protected static final int[] sOutputEscapes = CharTypes.get7BitOutputEscapes();
  protected CharacterEscapes _characterEscapes;
  protected final IOContext _ioContext;
  protected int _maximumNonEscapedChar;
  protected int[] _outputEscapes = sOutputEscapes;
  protected SerializableString _rootValueSeparator = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;

  public JsonGeneratorImpl(IOContext paramIOContext, int paramInt, ObjectCodec paramObjectCodec)
  {
    super(paramInt, paramObjectCodec);
    this._ioContext = paramIOContext;
    if (isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII))
      setHighestNonEscapedChar(127);
  }

  public JsonGenerator setCharacterEscapes(CharacterEscapes paramCharacterEscapes)
  {
    this._characterEscapes = paramCharacterEscapes;
    if (paramCharacterEscapes == null)
    {
      this._outputEscapes = sOutputEscapes;
      return this;
    }
    this._outputEscapes = paramCharacterEscapes.getEscapeCodesForAscii();
    return this;
  }

  public JsonGenerator setHighestNonEscapedChar(int paramInt)
  {
    if (paramInt < 0)
      paramInt = 0;
    this._maximumNonEscapedChar = paramInt;
    return this;
  }

  public JsonGenerator setRootValueSeparator(SerializableString paramSerializableString)
  {
    this._rootValueSeparator = paramSerializableString;
    return this;
  }

  public final void writeStringField(String paramString1, String paramString2)
  {
    writeFieldName(paramString1);
    writeString(paramString2);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.core.json.JsonGeneratorImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
