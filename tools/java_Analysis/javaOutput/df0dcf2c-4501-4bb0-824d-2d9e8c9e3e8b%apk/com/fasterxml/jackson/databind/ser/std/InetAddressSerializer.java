package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.net.InetAddress;

public class InetAddressSerializer extends StdScalarSerializer<InetAddress>
{
  public static final InetAddressSerializer instance = new InetAddressSerializer();

  public InetAddressSerializer()
  {
    super(InetAddress.class);
  }

  public void serialize(InetAddress paramInetAddress, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    String str = paramInetAddress.toString().trim();
    int i = str.indexOf('/');
    if (i >= 0)
      if (i != 0)
        break label43;
    label43: for (str = str.substring(1); ; str = str.substring(0, i))
    {
      paramJsonGenerator.writeString(str);
      return;
    }
  }

  public void serializeWithType(InetAddress paramInetAddress, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, TypeSerializer paramTypeSerializer)
  {
    paramTypeSerializer.writeTypePrefixForScalar(paramInetAddress, paramJsonGenerator, InetAddress.class);
    serialize(paramInetAddress, paramJsonGenerator, paramSerializerProvider);
    paramTypeSerializer.writeTypeSuffixForScalar(paramInetAddress, paramJsonGenerator);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.std.InetAddressSerializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
