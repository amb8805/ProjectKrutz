package com.fasterxml.jackson.databind.deser.std;

public class NumberDeserializers
{
  public static StdDeserializer<?>[] all()
  {
    StdDeserializer[] arrayOfStdDeserializer = new StdDeserializer[19];
    arrayOfStdDeserializer[0] = new NumberDeserializers.BooleanDeserializer(Boolean.class, null);
    arrayOfStdDeserializer[1] = new NumberDeserializers.ByteDeserializer(Byte.class, null);
    arrayOfStdDeserializer[2] = new NumberDeserializers.ShortDeserializer(Short.class, null);
    arrayOfStdDeserializer[3] = new NumberDeserializers.CharacterDeserializer(Character.class, null);
    arrayOfStdDeserializer[4] = new NumberDeserializers.IntegerDeserializer(Integer.class, null);
    arrayOfStdDeserializer[5] = new NumberDeserializers.LongDeserializer(Long.class, null);
    arrayOfStdDeserializer[6] = new NumberDeserializers.FloatDeserializer(Float.class, null);
    arrayOfStdDeserializer[7] = new NumberDeserializers.DoubleDeserializer(Double.class, null);
    arrayOfStdDeserializer[8] = new NumberDeserializers.BooleanDeserializer(Boolean.TYPE, Boolean.FALSE);
    arrayOfStdDeserializer[9] = new NumberDeserializers.ByteDeserializer(Byte.TYPE, Byte.valueOf(0));
    arrayOfStdDeserializer[10] = new NumberDeserializers.ShortDeserializer(Short.TYPE, Short.valueOf(0));
    arrayOfStdDeserializer[11] = new NumberDeserializers.CharacterDeserializer(Character.TYPE, Character.valueOf('\000'));
    arrayOfStdDeserializer[12] = new NumberDeserializers.IntegerDeserializer(Integer.TYPE, Integer.valueOf(0));
    arrayOfStdDeserializer[13] = new NumberDeserializers.LongDeserializer(Long.TYPE, Long.valueOf(0L));
    arrayOfStdDeserializer[14] = new NumberDeserializers.FloatDeserializer(Float.TYPE, Float.valueOf(0.0F));
    arrayOfStdDeserializer[15] = new NumberDeserializers.DoubleDeserializer(Double.TYPE, Double.valueOf(0.0D));
    arrayOfStdDeserializer[16] = new NumberDeserializers.NumberDeserializer();
    arrayOfStdDeserializer[17] = new NumberDeserializers.BigDecimalDeserializer();
    arrayOfStdDeserializer[18] = new NumberDeserializers.BigIntegerDeserializer();
    return arrayOfStdDeserializer;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.NumberDeserializers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
