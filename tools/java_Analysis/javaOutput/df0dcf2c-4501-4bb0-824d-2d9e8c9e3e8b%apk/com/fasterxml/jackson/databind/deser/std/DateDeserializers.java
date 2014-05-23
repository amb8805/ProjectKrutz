package com.fasterxml.jackson.databind.deser.std;

import java.util.GregorianCalendar;

public class DateDeserializers
{
  public static StdDeserializer<?>[] all()
  {
    StdDeserializer[] arrayOfStdDeserializer = new StdDeserializer[6];
    arrayOfStdDeserializer[0] = new DateDeserializers.CalendarDeserializer();
    arrayOfStdDeserializer[1] = new DateDeserializers.DateDeserializer();
    arrayOfStdDeserializer[2] = new DateDeserializers.CalendarDeserializer(GregorianCalendar.class);
    arrayOfStdDeserializer[3] = new DateDeserializers.SqlDateDeserializer();
    arrayOfStdDeserializer[4] = new DateDeserializers.TimestampDeserializer();
    arrayOfStdDeserializer[5] = new DateDeserializers.TimeZoneDeserializer();
    return arrayOfStdDeserializer;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.deser.std.DateDeserializers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
