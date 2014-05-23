package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;

public class ObjectWriter
  implements Serializable
{
  protected static final PrettyPrinter NULL_PRETTY_PRINTER = new MinimalPrettyPrinter();
  private static final long serialVersionUID = -7024829992408267532L;
  protected final SerializationConfig _config;
  protected final JsonFactory _jsonFactory;
  protected final PrettyPrinter _prettyPrinter;
  protected final JsonSerializer<Object> _rootSerializer;
  protected final JavaType _rootType;
  protected final FormatSchema _schema;
  protected final SerializerFactory _serializerFactory;
  protected final DefaultSerializerProvider _serializerProvider;

  protected ObjectWriter(ObjectMapper paramObjectMapper, SerializationConfig paramSerializationConfig, JavaType paramJavaType, PrettyPrinter paramPrettyPrinter)
  {
    this._config = paramSerializationConfig;
    this._serializerProvider = paramObjectMapper._serializerProvider;
    this._serializerFactory = paramObjectMapper._serializerFactory;
    this._jsonFactory = paramObjectMapper._jsonFactory;
    this._rootType = paramJavaType;
    this._prettyPrinter = paramPrettyPrinter;
    this._schema = null;
    this._rootSerializer = _prefetchRootSerializer(paramSerializationConfig, paramJavaType);
  }

  private final void _configureJsonGenerator(JsonGenerator paramJsonGenerator)
  {
    PrettyPrinter localPrettyPrinter;
    if (this._prettyPrinter != null)
    {
      localPrettyPrinter = this._prettyPrinter;
      if (localPrettyPrinter == NULL_PRETTY_PRINTER)
        paramJsonGenerator.setPrettyPrinter(null);
    }
    while (true)
    {
      if (this._schema != null)
        paramJsonGenerator.setSchema(this._schema);
      return;
      if ((localPrettyPrinter instanceof Instantiatable))
        localPrettyPrinter = (PrettyPrinter)((Instantiatable)localPrettyPrinter).createInstance();
      paramJsonGenerator.setPrettyPrinter(localPrettyPrinter);
      continue;
      if (this._config.isEnabled(SerializationFeature.INDENT_OUTPUT))
        paramJsonGenerator.useDefaultPrettyPrinter();
    }
  }

  // ERROR //
  private final void _writeCloseable(JsonGenerator paramJsonGenerator, Object paramObject, SerializationConfig paramSerializationConfig)
  {
    // Byte code:
    //   0: aload_2
    //   1: checkcast 106	java/io/Closeable
    //   4: astore 4
    //   6: aload_0
    //   7: getfield 54	com/fasterxml/jackson/databind/ObjectWriter:_rootType	Lcom/fasterxml/jackson/databind/JavaType;
    //   10: ifnonnull +25 -> 35
    //   13: aload_0
    //   14: aload_3
    //   15: invokevirtual 109	com/fasterxml/jackson/databind/ObjectWriter:_serializerProvider	(Lcom/fasterxml/jackson/databind/SerializationConfig;)Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider;
    //   18: aload_1
    //   19: aload_2
    //   20: invokevirtual 115	com/fasterxml/jackson/databind/ser/DefaultSerializerProvider:serializeValue	(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/lang/Object;)V
    //   23: aload_1
    //   24: invokevirtual 118	com/fasterxml/jackson/core/JsonGenerator:close	()V
    //   27: aload 4
    //   29: invokeinterface 119 1 0
    //   34: return
    //   35: aload_0
    //   36: aload_3
    //   37: invokevirtual 109	com/fasterxml/jackson/databind/ObjectWriter:_serializerProvider	(Lcom/fasterxml/jackson/databind/SerializationConfig;)Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider;
    //   40: aload_1
    //   41: aload_2
    //   42: aload_0
    //   43: getfield 54	com/fasterxml/jackson/databind/ObjectWriter:_rootType	Lcom/fasterxml/jackson/databind/JavaType;
    //   46: aload_0
    //   47: getfield 64	com/fasterxml/jackson/databind/ObjectWriter:_rootSerializer	Lcom/fasterxml/jackson/databind/JsonSerializer;
    //   50: invokevirtual 122	com/fasterxml/jackson/databind/ser/DefaultSerializerProvider:serializeValue	(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/lang/Object;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/JsonSerializer;)V
    //   53: goto -30 -> 23
    //   56: astore 5
    //   58: aload 4
    //   60: astore 6
    //   62: aload 5
    //   64: astore 7
    //   66: aload_1
    //   67: ifnull +7 -> 74
    //   70: aload_1
    //   71: invokevirtual 118	com/fasterxml/jackson/core/JsonGenerator:close	()V
    //   74: aload 6
    //   76: ifnull +10 -> 86
    //   79: aload 6
    //   81: invokeinterface 119 1 0
    //   86: aload 7
    //   88: athrow
    //   89: astore 9
    //   91: goto -17 -> 74
    //   94: astore 8
    //   96: goto -10 -> 86
    //   99: astore 10
    //   101: aload 10
    //   103: astore 7
    //   105: aload 4
    //   107: astore 6
    //   109: aconst_null
    //   110: astore_1
    //   111: goto -45 -> 66
    //   114: astore 7
    //   116: aconst_null
    //   117: astore 6
    //   119: aconst_null
    //   120: astore_1
    //   121: goto -55 -> 66
    //
    // Exception table:
    //   from	to	target	type
    //   6	23	56	finally
    //   35	53	56	finally
    //   70	74	89	java/io/IOException
    //   79	86	94	java/io/IOException
    //   23	27	99	finally
    //   27	34	114	finally
  }

  protected final void _configAndWriteValue(JsonGenerator paramJsonGenerator, Object paramObject)
  {
    _configureJsonGenerator(paramJsonGenerator);
    if ((this._config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE)) && ((paramObject instanceof Closeable)))
    {
      _writeCloseable(paramJsonGenerator, paramObject, this._config);
      return;
    }
    int i = 0;
    try
    {
      JavaType localJavaType = this._rootType;
      i = 0;
      if (localJavaType != null)
        break label84;
      _serializerProvider(this._config).serializeValue(paramJsonGenerator, paramObject);
      i = 1;
      paramJsonGenerator.close();
      return;
    }
    finally
    {
      if (i != 0);
    }
    try
    {
      paramJsonGenerator.close();
      label81: throw localObject;
      _serializerProvider(this._config).serializeValue(paramJsonGenerator, paramObject, this._rootType, this._rootSerializer);
    }
    catch (IOException localIOException)
    {
      break label81;
    }
  }

  protected final JsonSerializer<Object> _prefetchRootSerializer(SerializationConfig paramSerializationConfig, JavaType paramJavaType)
  {
    if ((paramJavaType == null) || (!this._config.isEnabled(SerializationFeature.EAGER_SERIALIZER_FETCH)))
      return null;
    try
    {
      JsonSerializer localJsonSerializer = _serializerProvider(paramSerializationConfig).findTypedValueSerializer(paramJavaType, true, null);
      return localJsonSerializer;
    }
    catch (JsonProcessingException localJsonProcessingException)
    {
    }
    return null;
  }

  protected DefaultSerializerProvider _serializerProvider(SerializationConfig paramSerializationConfig)
  {
    return this._serializerProvider.createInstance(paramSerializationConfig, this._serializerFactory);
  }

  public String writeValueAsString(Object paramObject)
  {
    SegmentedStringWriter localSegmentedStringWriter = new SegmentedStringWriter(this._jsonFactory._getBufferRecycler());
    try
    {
      _configAndWriteValue(this._jsonFactory.createJsonGenerator(localSegmentedStringWriter), paramObject);
      return localSegmentedStringWriter.getAndClear();
    }
    catch (JsonProcessingException localJsonProcessingException)
    {
      throw localJsonProcessingException;
    }
    catch (IOException localIOException)
    {
      throw JsonMappingException.fromUnexpectedIOE(localIOException);
    }
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ObjectWriter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
