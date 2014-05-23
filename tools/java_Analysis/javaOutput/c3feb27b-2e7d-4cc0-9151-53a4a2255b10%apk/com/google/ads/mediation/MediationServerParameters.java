package com.google.ads.mediation;

import com.google.ads.util.b;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class MediationServerParameters
{
  public MediationServerParameters()
  {
  }

  protected void a()
  {
  }

  public void load(Map<String, String> paramMap)
    throws MediationServerParameters.MappingException
  {
    HashMap localHashMap = new HashMap();
    for (Field localField3 : getClass().getFields())
    {
      MediationServerParameters.Parameter localParameter = (MediationServerParameters.Parameter)localField3.getAnnotation(MediationServerParameters.Parameter.class);
      if (localParameter != null)
        localHashMap.put(localParameter.name(), localField3);
    }
    if (localHashMap.isEmpty())
      b.e("No server options fields detected.  To suppress this message either add a field with the @Parameter annotation, or override the load() method");
    Iterator localIterator1 = paramMap.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      Field localField2 = (Field)localHashMap.remove(localEntry.getKey());
      if (localField2 != null)
        try
        {
          localField2.set(this, localEntry.getValue());
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          b.b("Server Option '" + (String)localEntry.getKey() + "' could not be set: Illegal Access");
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          b.b("Server Option '" + (String)localEntry.getKey() + "' could not be set: Bad Type");
        }
      else
        b.e("Unexpected Server Option: " + (String)localEntry.getKey() + " = '" + (String)localEntry.getValue() + "'");
    }
    Object localObject1 = null;
    Iterator localIterator2 = localHashMap.values().iterator();
    Field localField1;
    StringBuilder localStringBuilder;
    String str;
    if (localIterator2.hasNext())
    {
      localField1 = (Field)localIterator2.next();
      if (!((MediationServerParameters.Parameter)localField1.getAnnotation(MediationServerParameters.Parameter.class)).required())
        break label512;
      b.b("Required Server Option missing: " + ((MediationServerParameters.Parameter)localField1.getAnnotation(MediationServerParameters.Parameter.class)).name());
      localStringBuilder = new StringBuilder();
      if (localObject1 == null)
        str = "";
    }
    label412: for (Object localObject2 = str + ((MediationServerParameters.Parameter)localField1.getAnnotation(MediationServerParameters.Parameter.class)).name(); ; localObject2 = localObject1)
    {
      localObject1 = localObject2;
      break;
      str = localObject1 + ", ";
      break label412;
      if (localObject1 != null)
        throw new MediationServerParameters.MappingException("Required Server Option(s) missing: " + localObject1);
      a();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.mediation.MediationServerParameters
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
