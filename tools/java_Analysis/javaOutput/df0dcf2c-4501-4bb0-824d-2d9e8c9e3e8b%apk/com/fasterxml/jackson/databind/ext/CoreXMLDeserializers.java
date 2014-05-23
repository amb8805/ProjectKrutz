package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.util.Provider;
import java.util.Arrays;
import java.util.Collection;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

public class CoreXMLDeserializers
  implements Provider<StdDeserializer<?>>
{
  static final DatatypeFactory _dataTypeFactory;

  static
  {
    try
    {
      _dataTypeFactory = DatatypeFactory.newInstance();
      return;
    }
    catch (DatatypeConfigurationException localDatatypeConfigurationException)
    {
      throw new RuntimeException(localDatatypeConfigurationException);
    }
  }

  public Collection<StdDeserializer<?>> provide()
  {
    StdDeserializer[] arrayOfStdDeserializer = new StdDeserializer[3];
    arrayOfStdDeserializer[0] = new CoreXMLDeserializers.DurationDeserializer();
    arrayOfStdDeserializer[1] = new CoreXMLDeserializers.GregorianCalendarDeserializer();
    arrayOfStdDeserializer[2] = new CoreXMLDeserializers.QNameDeserializer();
    return Arrays.asList(arrayOfStdDeserializer);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ext.CoreXMLDeserializers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
