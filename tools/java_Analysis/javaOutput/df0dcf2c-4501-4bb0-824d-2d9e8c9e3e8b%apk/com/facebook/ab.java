package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.facebook.internal.ad;
import com.facebook.internal.af;
import com.facebook.internal.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ab extends ac
{
  private static final String a = ab.class.getSimpleName();
  private String b;
  private SharedPreferences c;

  public ab(Context paramContext)
  {
    this(paramContext, (byte)0);
  }

  private ab(Context paramContext, byte paramByte)
  {
    af.a(paramContext, "context");
    boolean bool = ad.a(null);
    String str = null;
    if (bool)
      str = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
    this.b = str;
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null)
      paramContext = localContext;
    this.c = paramContext.getSharedPreferences(this.b, 0);
  }

  private void a(String paramString, Bundle paramBundle)
  {
    int i = 0;
    JSONObject localJSONObject = new JSONObject(this.c.getString(paramString, "{}"));
    String str1 = localJSONObject.getString("valueType");
    if (str1.equals("bool"))
      paramBundle.putBoolean(paramString, localJSONObject.getBoolean("value"));
    do
    {
      String str3;
      do
      {
        return;
        if (str1.equals("bool[]"))
        {
          JSONArray localJSONArray9 = localJSONObject.getJSONArray("value");
          boolean[] arrayOfBoolean = new boolean[localJSONArray9.length()];
          while (i < arrayOfBoolean.length)
          {
            arrayOfBoolean[i] = localJSONArray9.getBoolean(i);
            i++;
          }
          paramBundle.putBooleanArray(paramString, arrayOfBoolean);
          return;
        }
        if (str1.equals("byte"))
        {
          paramBundle.putByte(paramString, (byte)localJSONObject.getInt("value"));
          return;
        }
        if (str1.equals("byte[]"))
        {
          JSONArray localJSONArray8 = localJSONObject.getJSONArray("value");
          byte[] arrayOfByte = new byte[localJSONArray8.length()];
          while (i < arrayOfByte.length)
          {
            arrayOfByte[i] = (byte)localJSONArray8.getInt(i);
            i++;
          }
          paramBundle.putByteArray(paramString, arrayOfByte);
          return;
        }
        if (str1.equals("short"))
        {
          paramBundle.putShort(paramString, (short)localJSONObject.getInt("value"));
          return;
        }
        if (str1.equals("short[]"))
        {
          JSONArray localJSONArray7 = localJSONObject.getJSONArray("value");
          short[] arrayOfShort = new short[localJSONArray7.length()];
          while (i < arrayOfShort.length)
          {
            arrayOfShort[i] = (short)localJSONArray7.getInt(i);
            i++;
          }
          paramBundle.putShortArray(paramString, arrayOfShort);
          return;
        }
        if (str1.equals("int"))
        {
          paramBundle.putInt(paramString, localJSONObject.getInt("value"));
          return;
        }
        if (str1.equals("int[]"))
        {
          JSONArray localJSONArray6 = localJSONObject.getJSONArray("value");
          int[] arrayOfInt = new int[localJSONArray6.length()];
          while (i < arrayOfInt.length)
          {
            arrayOfInt[i] = localJSONArray6.getInt(i);
            i++;
          }
          paramBundle.putIntArray(paramString, arrayOfInt);
          return;
        }
        if (str1.equals("long"))
        {
          paramBundle.putLong(paramString, localJSONObject.getLong("value"));
          return;
        }
        if (str1.equals("long[]"))
        {
          JSONArray localJSONArray5 = localJSONObject.getJSONArray("value");
          long[] arrayOfLong = new long[localJSONArray5.length()];
          while (i < arrayOfLong.length)
          {
            arrayOfLong[i] = localJSONArray5.getLong(i);
            i++;
          }
          paramBundle.putLongArray(paramString, arrayOfLong);
          return;
        }
        if (str1.equals("float"))
        {
          paramBundle.putFloat(paramString, (float)localJSONObject.getDouble("value"));
          return;
        }
        if (str1.equals("float[]"))
        {
          JSONArray localJSONArray4 = localJSONObject.getJSONArray("value");
          float[] arrayOfFloat = new float[localJSONArray4.length()];
          while (i < arrayOfFloat.length)
          {
            arrayOfFloat[i] = (float)localJSONArray4.getDouble(i);
            i++;
          }
          paramBundle.putFloatArray(paramString, arrayOfFloat);
          return;
        }
        if (str1.equals("double"))
        {
          paramBundle.putDouble(paramString, localJSONObject.getDouble("value"));
          return;
        }
        if (str1.equals("double[]"))
        {
          JSONArray localJSONArray3 = localJSONObject.getJSONArray("value");
          double[] arrayOfDouble = new double[localJSONArray3.length()];
          while (i < arrayOfDouble.length)
          {
            arrayOfDouble[i] = localJSONArray3.getDouble(i);
            i++;
          }
          paramBundle.putDoubleArray(paramString, arrayOfDouble);
          return;
        }
        if (!str1.equals("char"))
          break;
        str3 = localJSONObject.getString("value");
      }
      while ((str3 == null) || (str3.length() != 1));
      paramBundle.putChar(paramString, str3.charAt(0));
      return;
      if (str1.equals("char[]"))
      {
        JSONArray localJSONArray2 = localJSONObject.getJSONArray("value");
        char[] arrayOfChar = new char[localJSONArray2.length()];
        for (int m = 0; m < arrayOfChar.length; m++)
        {
          String str2 = localJSONArray2.getString(m);
          if ((str2 != null) && (str2.length() == 1))
            arrayOfChar[m] = str2.charAt(0);
        }
        paramBundle.putCharArray(paramString, arrayOfChar);
        return;
      }
      if (str1.equals("string"))
      {
        paramBundle.putString(paramString, localJSONObject.getString("value"));
        return;
      }
      if (str1.equals("stringList"))
      {
        JSONArray localJSONArray1 = localJSONObject.getJSONArray("value");
        int j = localJSONArray1.length();
        ArrayList localArrayList = new ArrayList(j);
        int k = 0;
        if (k < j)
        {
          Object localObject1 = localJSONArray1.get(k);
          if (localObject1 == JSONObject.NULL);
          for (Object localObject2 = null; ; localObject2 = (String)localObject1)
          {
            localArrayList.add(k, localObject2);
            k++;
            break;
          }
        }
        paramBundle.putStringArrayList(paramString, localArrayList);
        return;
      }
    }
    while (!str1.equals("enum"));
    try
    {
      paramBundle.putSerializable(paramString, Enum.valueOf(Class.forName(localJSONObject.getString("enumType")), localJSONObject.getString("value")));
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
    }
  }

  public final Bundle a()
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = this.c.getAll().keySet().iterator();
    String str;
    while (true)
      if (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        try
        {
          a(str, localBundle);
        }
        catch (JSONException localJSONException)
        {
          new StringBuilder("Error reading cached value for key: '").append(str).append("' -- ").append(localJSONException);
          u.c();
          return null;
        }
      }
    return localBundle;
  }

  public final void a(Bundle paramBundle)
  {
    af.a(paramBundle, "bundle");
    SharedPreferences.Editor localEditor = this.c.edit();
    Iterator localIterator1 = paramBundle.keySet().iterator();
    String str1;
    Object localObject1;
    while (true)
      if (localIterator1.hasNext())
      {
        str1 = (String)localIterator1.next();
        try
        {
          localObject1 = paramBundle.get(str1);
          if (localObject1 != null)
          {
            localJSONObject = new JSONObject();
            if ((localObject1 instanceof Byte))
            {
              str2 = "byte";
              localJSONObject.put("value", ((Byte)localObject1).intValue());
              localObject2 = null;
              if (str2 == null)
                continue;
              localJSONObject.put("valueType", str2);
              if (localObject2 != null)
                localJSONObject.putOpt("value", localObject2);
              localEditor.putString(str1, localJSONObject.toString());
            }
          }
        }
        catch (JSONException localJSONException)
        {
          new StringBuilder("Error processing value for key: '").append(str1).append("' -- ").append(localJSONException);
          u.c();
        }
      }
    while (true)
    {
      JSONObject localJSONObject;
      String str2;
      Object localObject2;
      return;
      if ((localObject1 instanceof Short))
      {
        str2 = "short";
        localJSONObject.put("value", ((Short)localObject1).intValue());
        localObject2 = null;
      }
      else if ((localObject1 instanceof Integer))
      {
        str2 = "int";
        localJSONObject.put("value", ((Integer)localObject1).intValue());
        localObject2 = null;
      }
      else if ((localObject1 instanceof Long))
      {
        str2 = "long";
        localJSONObject.put("value", ((Long)localObject1).longValue());
        localObject2 = null;
      }
      else if ((localObject1 instanceof Float))
      {
        str2 = "float";
        localJSONObject.put("value", ((Float)localObject1).doubleValue());
        localObject2 = null;
      }
      else if ((localObject1 instanceof Double))
      {
        str2 = "double";
        localJSONObject.put("value", ((Double)localObject1).doubleValue());
        localObject2 = null;
      }
      else if ((localObject1 instanceof Boolean))
      {
        str2 = "bool";
        localJSONObject.put("value", ((Boolean)localObject1).booleanValue());
        localObject2 = null;
      }
      else if ((localObject1 instanceof Character))
      {
        str2 = "char";
        localJSONObject.put("value", localObject1.toString());
        localObject2 = null;
      }
      else if ((localObject1 instanceof String))
      {
        str2 = "string";
        localJSONObject.put("value", (String)localObject1);
        localObject2 = null;
      }
      else if ((localObject1 instanceof Enum))
      {
        str2 = "enum";
        localJSONObject.put("value", localObject1.toString());
        localJSONObject.put("enumType", localObject1.getClass().getName());
        localObject2 = null;
      }
      else
      {
        JSONArray localJSONArray = new JSONArray();
        if ((localObject1 instanceof byte[]))
        {
          byte[] arrayOfByte = (byte[])localObject1;
          int i10 = arrayOfByte.length;
          for (int i11 = 0; i11 < i10; i11++)
            localJSONArray.put(arrayOfByte[i11]);
        }
        if ((localObject1 instanceof short[]))
        {
          short[] arrayOfShort = (short[])localObject1;
          int i8 = arrayOfShort.length;
          for (int i9 = 0; i9 < i8; i9++)
            localJSONArray.put(arrayOfShort[i9]);
        }
        if ((localObject1 instanceof int[]))
        {
          int[] arrayOfInt = (int[])localObject1;
          int i6 = arrayOfInt.length;
          for (int i7 = 0; i7 < i6; i7++)
            localJSONArray.put(arrayOfInt[i7]);
        }
        if ((localObject1 instanceof long[]))
        {
          long[] arrayOfLong = (long[])localObject1;
          int i4 = arrayOfLong.length;
          for (int i5 = 0; i5 < i4; i5++)
            localJSONArray.put(arrayOfLong[i5]);
        }
        if ((localObject1 instanceof float[]))
        {
          float[] arrayOfFloat = (float[])localObject1;
          int i2 = arrayOfFloat.length;
          for (int i3 = 0; i3 < i2; i3++)
            localJSONArray.put(arrayOfFloat[i3]);
        }
        if ((localObject1 instanceof double[]))
        {
          double[] arrayOfDouble = (double[])localObject1;
          int n = arrayOfDouble.length;
          for (int i1 = 0; i1 < n; i1++)
            localJSONArray.put(arrayOfDouble[i1]);
        }
        if ((localObject1 instanceof boolean[]))
        {
          boolean[] arrayOfBoolean = (boolean[])localObject1;
          int k = arrayOfBoolean.length;
          for (int m = 0; m < k; m++)
            localJSONArray.put(arrayOfBoolean[m]);
        }
        if ((localObject1 instanceof char[]))
        {
          char[] arrayOfChar = (char[])localObject1;
          int i = arrayOfChar.length;
          for (int j = 0; j < i; j++)
            localJSONArray.put(String.valueOf(arrayOfChar[j]));
        }
        if ((localObject1 instanceof List))
        {
          Iterator localIterator2 = ((List)localObject1).iterator();
          while (localIterator2.hasNext())
          {
            Object localObject3 = (String)localIterator2.next();
            if (localObject3 == null)
              localObject3 = JSONObject.NULL;
            localJSONArray.put(localObject3);
          }
          localObject2 = localJSONArray;
          str2 = "stringList";
        }
        else
        {
          localObject2 = null;
          str2 = null;
          continue;
          if (!localEditor.commit())
          {
            u.c();
            return;
            localObject2 = localJSONArray;
            str2 = "byte[]";
            continue;
            localObject2 = localJSONArray;
            str2 = "short[]";
            continue;
            localObject2 = localJSONArray;
            str2 = "int[]";
            continue;
            localObject2 = localJSONArray;
            str2 = "long[]";
            continue;
            localObject2 = localJSONArray;
            str2 = "float[]";
            continue;
            localObject2 = localJSONArray;
            str2 = "double[]";
            continue;
            localObject2 = localJSONArray;
            str2 = "bool[]";
            continue;
            localObject2 = localJSONArray;
            str2 = "char[]";
          }
        }
      }
    }
  }

  public final void b()
  {
    this.c.edit().clear().commit();
  }
}

/* Location:
 * Qualified Name:     com.facebook.ab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
