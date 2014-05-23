package com.fasterxml.jackson.databind.deser.std;

public class JdkDeserializers
{
  public static StdDeserializer<?>[] all()
  {
    StdDeserializer[] arrayOfStdDeserializer = new StdDeserializer[13];
    arrayOfStdDeserializer[0] = new StringDeserializer();
    arrayOfStdDeserializer[1] = new JdkDeserializers.UUIDDeserializer();
    arrayOfStdDeserializer[2] = new JdkDeserializers.URLDeserializer();
    arrayOfStdDeserializer[3] = new JdkDeserializers.URIDeserializer();
    arrayOfStdDeserializer[4] = new JdkDeserializers.FileDeserializer();
    arrayOfStdDeserializer[5] = new JdkDeserializers.CurrencyDeserializer();
    arrayOfStdDeserializer[6] = new JdkDeserializers.PatternDeserializer();
    arrayOfStdDeserializer[7] = new JdkDeserializers.LocaleDeserializer();
    arrayOfStdDeserializer[8] = new JdkDeserializers.InetAddressDeserializer();
    arrayOfStdDeserializer[9] = new JdkDeserializers.CharsetDeserializer();
    arrayOfStdDeserializer[10] = new JdkDeserializers.AtomicBooleanDeserializer();
    arrayOfStdDeserializer[11] = new ClassDeserializer();
    arrayOfStdDeserializer[12] = new JdkDeserializers.StackTraceElementDeserializer();
    return arrayOfStdDeserializer;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.JdkDeserializers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
