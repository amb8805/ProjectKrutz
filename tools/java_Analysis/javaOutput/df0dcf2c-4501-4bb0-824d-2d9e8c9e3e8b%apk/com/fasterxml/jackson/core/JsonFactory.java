package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import com.fasterxml.jackson.core.io.UTF8Writer;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStream;;
import java.io.OutputStream;
import java.io.OutputStream;;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Reader;;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.lang.ref.SoftReference;

public class JsonFactory
  implements Serializable
{
  protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = 0;
  protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = 0;
  protected static final int DEFAULT_PARSER_FEATURE_FLAGS = 0;
  private static final SerializableString DEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
  protected static final ThreadLocal<SoftReference<BufferRecycler>> _recyclerRef = new ThreadLocal();
  private static final long serialVersionUID = 8726401676402117450L;
  protected CharacterEscapes _characterEscapes;
  protected int _factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
  protected int _generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
  protected InputDecorator _inputDecorator;
  protected ObjectCodec _objectCodec;
  protected OutputDecorator _outputDecorator;
  protected int _parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
  protected final transient BytesToNameCanonicalizer _rootByteSymbols = BytesToNameCanonicalizer.createRoot();
  protected final transient CharsToNameCanonicalizer _rootCharSymbols = CharsToNameCanonicalizer.createRoot();
  protected SerializableString _rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;

  public JsonFactory()
  {
    this(null);
  }

  public JsonFactory(ObjectCodec paramObjectCodec)
  {
    this._objectCodec = paramObjectCodec;
  }

  protected IOContext _createContext(Object paramObject, boolean paramBoolean)
  {
    return new IOContext(_getBufferRecycler(), paramObject, paramBoolean);
  }

  protected JsonGenerator _createGenerator(Writer paramWriter, IOContext paramIOContext)
  {
    return _createJsonGenerator(paramWriter, paramIOContext);
  }

  @Deprecated
  protected JsonGenerator _createJsonGenerator(Writer paramWriter, IOContext paramIOContext)
  {
    WriterBasedJsonGenerator localWriterBasedJsonGenerator = new WriterBasedJsonGenerator(paramIOContext, this._generatorFeatures, this._objectCodec, paramWriter);
    if (this._characterEscapes != null)
      localWriterBasedJsonGenerator.setCharacterEscapes(this._characterEscapes);
    SerializableString localSerializableString = this._rootValueSeparator;
    if (localSerializableString != DEFAULT_ROOT_VALUE_SEPARATOR)
      localWriterBasedJsonGenerator.setRootValueSeparator(localSerializableString);
    return localWriterBasedJsonGenerator;
  }

  @Deprecated
  protected JsonParser _createJsonParser(InputStream paramInputStream, IOContext paramIOContext)
  {
    return new ByteSourceJsonBootstrapper(paramIOContext, paramInputStream).constructParser(this._parserFeatures, this._objectCodec, this._rootByteSymbols, this._rootCharSymbols, isEnabled(JsonFactory.Feature.CANONICALIZE_FIELD_NAMES), isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES));
  }

  @Deprecated
  protected JsonParser _createJsonParser(Reader paramReader, IOContext paramIOContext)
  {
    return new ReaderBasedJsonParser(paramIOContext, this._parserFeatures, paramReader, this._objectCodec, this._rootCharSymbols.makeChild(isEnabled(JsonFactory.Feature.CANONICALIZE_FIELD_NAMES), isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES)));
  }

  @Deprecated
  protected JsonParser _createJsonParser(byte[] paramArrayOfByte, int paramInt1, int paramInt2, IOContext paramIOContext)
  {
    return new ByteSourceJsonBootstrapper(paramIOContext, paramArrayOfByte, paramInt1, paramInt2).constructParser(this._parserFeatures, this._objectCodec, this._rootByteSymbols, this._rootCharSymbols, isEnabled(JsonFactory.Feature.CANONICALIZE_FIELD_NAMES), isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES));
  }

  protected JsonParser _createParser(InputStream paramInputStream, IOContext paramIOContext)
  {
    return _createJsonParser(paramInputStream, paramIOContext);
  }

  protected JsonParser _createParser(Reader paramReader, IOContext paramIOContext)
  {
    return _createJsonParser(paramReader, paramIOContext);
  }

  protected JsonParser _createParser(byte[] paramArrayOfByte, int paramInt1, int paramInt2, IOContext paramIOContext)
  {
    return _createJsonParser(paramArrayOfByte, paramInt1, paramInt2, paramIOContext);
  }

  @Deprecated
  protected JsonGenerator _createUTF8JsonGenerator(OutputStream paramOutputStream, IOContext paramIOContext)
  {
    UTF8JsonGenerator localUTF8JsonGenerator = new UTF8JsonGenerator(paramIOContext, this._generatorFeatures, this._objectCodec, paramOutputStream);
    if (this._characterEscapes != null)
      localUTF8JsonGenerator.setCharacterEscapes(this._characterEscapes);
    SerializableString localSerializableString = this._rootValueSeparator;
    if (localSerializableString != DEFAULT_ROOT_VALUE_SEPARATOR)
      localUTF8JsonGenerator.setRootValueSeparator(localSerializableString);
    return localUTF8JsonGenerator;
  }

  protected Writer _createWriter(OutputStream paramOutputStream, JsonEncoding paramJsonEncoding, IOContext paramIOContext)
  {
    if (paramJsonEncoding == JsonEncoding.UTF8)
      return new UTF8Writer(paramIOContext, paramOutputStream);
    return new OutputStreamWriter(paramOutputStream, paramJsonEncoding.getJavaName());
  }

  public BufferRecycler _getBufferRecycler()
  {
    SoftReference localSoftReference = (SoftReference)_recyclerRef.get();
    if (localSoftReference == null);
    for (BufferRecycler localBufferRecycler = null; ; localBufferRecycler = (BufferRecycler)localSoftReference.get())
    {
      if (localBufferRecycler == null)
      {
        localBufferRecycler = new BufferRecycler();
        _recyclerRef.set(new SoftReference(localBufferRecycler));
      }
      return localBufferRecycler;
    }
  }

  public JsonGenerator createJsonGenerator(File paramFile, JsonEncoding paramJsonEncoding)
  {
    Object localObject = new FileOutputStream(paramFile);
    IOContext localIOContext = _createContext(localObject, true);
    localIOContext.setEncoding(paramJsonEncoding);
    if (paramJsonEncoding == JsonEncoding.UTF8)
    {
      if (this._outputDecorator != null)
        localObject = this._outputDecorator.decorate(localIOContext, (OutputStream)localObject);
      return _createUTF8JsonGenerator((OutputStream)localObject, localIOContext);
    }
    Writer localWriter = _createWriter((OutputStream)localObject, paramJsonEncoding, localIOContext);
    if (this._outputDecorator != null)
      localWriter = this._outputDecorator.decorate(localIOContext, localWriter);
    return _createGenerator(localWriter, localIOContext);
  }

  public JsonGenerator createJsonGenerator(Writer paramWriter)
  {
    IOContext localIOContext = _createContext(paramWriter, false);
    if (this._outputDecorator != null)
      paramWriter = this._outputDecorator.decorate(localIOContext, paramWriter);
    return _createGenerator(paramWriter, localIOContext);
  }

  public JsonParser createJsonParser(File paramFile)
  {
    IOContext localIOContext = _createContext(paramFile, true);
    Object localObject = new FileInputStream(paramFile);
    if (this._inputDecorator != null)
      localObject = this._inputDecorator.decorate(localIOContext, (InputStream)localObject);
    return _createParser((InputStream)localObject, localIOContext);
  }

  public JsonParser createJsonParser(String paramString)
  {
    Object localObject = new StringReader(paramString);
    IOContext localIOContext = _createContext(localObject, true);
    if (this._inputDecorator != null)
      localObject = this._inputDecorator.decorate(localIOContext, (Reader)localObject);
    return _createParser((Reader)localObject, localIOContext);
  }

  public JsonParser createJsonParser(byte[] paramArrayOfByte)
  {
    IOContext localIOContext = _createContext(paramArrayOfByte, true);
    if (this._inputDecorator != null)
    {
      InputStream localInputStream = this._inputDecorator.decorate(localIOContext, paramArrayOfByte, 0, paramArrayOfByte.length);
      if (localInputStream != null)
        return _createParser(localInputStream, localIOContext);
    }
    return _createParser(paramArrayOfByte, 0, paramArrayOfByte.length, localIOContext);
  }

  public ObjectCodec getCodec()
  {
    return this._objectCodec;
  }

  public final boolean isEnabled(JsonFactory.Feature paramFeature)
  {
    return (this._factoryFeatures & paramFeature.getMask()) != 0;
  }

  protected Object readResolve()
  {
    return new JsonFactory(this._objectCodec);
  }

  public JsonFactory setCodec(ObjectCodec paramObjectCodec)
  {
    this._objectCodec = paramObjectCodec;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.core.JsonFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
