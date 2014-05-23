package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ax extends ar
  implements SafeParcelable
{
  public static final v a = new v();
  private final int b;
  private final Parcel c;
  private final int d;
  private final au e;
  private final String f;
  private int g;
  private int h;

  ax(int paramInt, Parcel paramParcel, au paramau)
  {
    this.b = paramInt;
    this.c = ((Parcel)f.a(paramParcel));
    this.d = 2;
    this.e = paramau;
    if (this.e == null);
    for (this.f = null; ; this.f = this.e.c())
    {
      this.g = 2;
      return;
    }
  }

  private static HashMap<String, String> a(Bundle paramBundle)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, paramBundle.getString(str));
    }
    return localHashMap;
  }

  private static void a(StringBuilder paramStringBuilder, int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Unknown type = " + paramInt);
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
      paramStringBuilder.append(paramObject);
      return;
    case 7:
      paramStringBuilder.append("\"").append(y.a(paramObject.toString())).append("\"");
      return;
    case 8:
      paramStringBuilder.append("\"").append(x.a((byte[])paramObject)).append("\"");
      return;
    case 9:
      paramStringBuilder.append("\"").append(x.b((byte[])paramObject));
      paramStringBuilder.append("\"");
      return;
    case 10:
      z.a(paramStringBuilder, (HashMap)paramObject);
      return;
    case 11:
    }
    throw new IllegalArgumentException("Method does not accept concrete type.");
  }

  private void a(StringBuilder paramStringBuilder, ar.a<?, ?> parama, Parcel paramParcel, int paramInt)
  {
    int i = 0;
    if (parama.e())
    {
      paramStringBuilder.append("[");
      int i8;
      int i9;
      Object localObject;
      switch (parama.d())
      {
      default:
        throw new IllegalStateException("Unknown field type out.");
      case 0:
        int i11 = ah.a(paramParcel, paramInt);
        int i12 = paramParcel.dataPosition();
        int[] arrayOfInt = null;
        if (i11 == 0);
        while (true)
        {
          int i13 = arrayOfInt.length;
          while (i < i13)
          {
            if (i != 0)
              paramStringBuilder.append(",");
            paramStringBuilder.append(Integer.toString(arrayOfInt[i]));
            i++;
          }
          arrayOfInt = paramParcel.createIntArray();
          paramParcel.setDataPosition(i11 + i12);
        }
      case 1:
        i8 = ah.a(paramParcel, paramInt);
        i9 = paramParcel.dataPosition();
        localObject = null;
        if (i8 == 0)
          w.a(paramStringBuilder, (Object[])localObject);
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      }
      while (true)
      {
        paramStringBuilder.append("]");
        return;
        int i10 = paramParcel.readInt();
        localObject = new BigInteger[i10];
        while (i < i10)
        {
          localObject[i] = new BigInteger(paramParcel.createByteArray());
          i++;
        }
        paramParcel.setDataPosition(i8 + i9);
        break;
        int i6 = ah.a(paramParcel, paramInt);
        int i7 = paramParcel.dataPosition();
        long[] arrayOfLong = null;
        if (i6 == 0);
        while (true)
        {
          w.a(paramStringBuilder, arrayOfLong);
          break;
          arrayOfLong = paramParcel.createLongArray();
          paramParcel.setDataPosition(i6 + i7);
        }
        int i4 = ah.a(paramParcel, paramInt);
        int i5 = paramParcel.dataPosition();
        float[] arrayOfFloat = null;
        if (i4 == 0);
        while (true)
        {
          w.a(paramStringBuilder, arrayOfFloat);
          break;
          arrayOfFloat = paramParcel.createFloatArray();
          paramParcel.setDataPosition(i4 + i5);
        }
        int i2 = ah.a(paramParcel, paramInt);
        int i3 = paramParcel.dataPosition();
        double[] arrayOfDouble = null;
        if (i2 == 0);
        while (true)
        {
          w.a(paramStringBuilder, arrayOfDouble);
          break;
          arrayOfDouble = paramParcel.createDoubleArray();
          paramParcel.setDataPosition(i2 + i3);
        }
        w.a(paramStringBuilder, ah.p(paramParcel, paramInt));
        continue;
        int n = ah.a(paramParcel, paramInt);
        int i1 = paramParcel.dataPosition();
        boolean[] arrayOfBoolean = null;
        if (n == 0);
        while (true)
        {
          w.a(paramStringBuilder, arrayOfBoolean);
          break;
          arrayOfBoolean = paramParcel.createBooleanArray();
          paramParcel.setDataPosition(n + i1);
        }
        w.a(paramStringBuilder, ah.q(paramParcel, paramInt));
        continue;
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
        Parcel[] arrayOfParcel = ah.s(paramParcel, paramInt);
        int k = arrayOfParcel.length;
        for (int m = 0; m < k; m++)
        {
          if (m > 0)
            paramStringBuilder.append(",");
          arrayOfParcel[m].setDataPosition(0);
          a(paramStringBuilder, parama.l(), arrayOfParcel[m]);
        }
      }
    }
    switch (parama.d())
    {
    default:
      throw new IllegalStateException("Unknown field type out");
    case 0:
      paramStringBuilder.append(ah.f(paramParcel, paramInt));
      return;
    case 1:
      paramStringBuilder.append(ah.h(paramParcel, paramInt));
      return;
    case 2:
      paramStringBuilder.append(ah.g(paramParcel, paramInt));
      return;
    case 3:
      paramStringBuilder.append(ah.i(paramParcel, paramInt));
      return;
    case 4:
      paramStringBuilder.append(ah.j(paramParcel, paramInt));
      return;
    case 5:
      paramStringBuilder.append(ah.k(paramParcel, paramInt));
      return;
    case 6:
      paramStringBuilder.append(ah.c(paramParcel, paramInt));
      return;
    case 7:
      String str2 = ah.l(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(y.a(str2)).append("\"");
      return;
    case 8:
      byte[] arrayOfByte2 = ah.o(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(x.a(arrayOfByte2)).append("\"");
      return;
    case 9:
      byte[] arrayOfByte1 = ah.o(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(x.b(arrayOfByte1));
      paramStringBuilder.append("\"");
      return;
    case 10:
      Bundle localBundle = ah.n(paramParcel, paramInt);
      Set localSet = localBundle.keySet();
      localSet.size();
      paramStringBuilder.append("{");
      Iterator localIterator = localSet.iterator();
      for (int j = 1; localIterator.hasNext(); j = 0)
      {
        String str1 = (String)localIterator.next();
        if (j == 0)
          paramStringBuilder.append(",");
        paramStringBuilder.append("\"").append(str1).append("\"");
        paramStringBuilder.append(":");
        paramStringBuilder.append("\"").append(y.a(localBundle.getString(str1))).append("\"");
      }
      paramStringBuilder.append("}");
      return;
    case 11:
    }
    Parcel localParcel = ah.r(paramParcel, paramInt);
    localParcel.setDataPosition(0);
    a(paramStringBuilder, parama.l(), localParcel);
  }

  private static void a(StringBuilder paramStringBuilder, ar.a<?, ?> parama, Object paramObject)
  {
    if (parama.c())
    {
      ArrayList localArrayList = (ArrayList)paramObject;
      paramStringBuilder.append("[");
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
      {
        if (j != 0)
          paramStringBuilder.append(",");
        a(paramStringBuilder, parama.b(), localArrayList.get(j));
      }
      paramStringBuilder.append("]");
      return;
    }
    a(paramStringBuilder, parama.b(), paramObject);
  }

  private void a(StringBuilder paramStringBuilder, HashMap<String, ar.a<?, ?>> paramHashMap, Parcel paramParcel)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry2 = (Map.Entry)localIterator.next();
      localHashMap.put(Integer.valueOf(((ar.a)localEntry2.getValue()).g()), localEntry2);
    }
    paramStringBuilder.append((char)'{');
    int i = ah.a(paramParcel);
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      Map.Entry localEntry1 = (Map.Entry)localHashMap.get(Integer.valueOf(0xFFFF & k));
      if (localEntry1 != null)
      {
        if (j != 0)
          paramStringBuilder.append(",");
        String str = (String)localEntry1.getKey();
        ar.a locala = (ar.a)localEntry1.getValue();
        paramStringBuilder.append("\"").append(str).append("\":");
        if (locala.j())
          switch (locala.d())
          {
          default:
            throw new IllegalArgumentException("Unknown field out type = " + locala.d());
          case 0:
            a(paramStringBuilder, locala, a(locala, Integer.valueOf(ah.f(paramParcel, k))));
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
          case 7:
          case 8:
          case 9:
          case 10:
          case 11:
          }
        while (true)
        {
          j = 1;
          break;
          a(paramStringBuilder, locala, a(locala, ah.h(paramParcel, k)));
          continue;
          a(paramStringBuilder, locala, a(locala, Long.valueOf(ah.g(paramParcel, k))));
          continue;
          a(paramStringBuilder, locala, a(locala, Float.valueOf(ah.i(paramParcel, k))));
          continue;
          a(paramStringBuilder, locala, a(locala, Double.valueOf(ah.j(paramParcel, k))));
          continue;
          a(paramStringBuilder, locala, a(locala, ah.k(paramParcel, k)));
          continue;
          a(paramStringBuilder, locala, a(locala, Boolean.valueOf(ah.c(paramParcel, k))));
          continue;
          a(paramStringBuilder, locala, a(locala, ah.l(paramParcel, k)));
          continue;
          a(paramStringBuilder, locala, a(locala, ah.o(paramParcel, k)));
          continue;
          a(paramStringBuilder, locala, a(locala, a(ah.n(paramParcel, k))));
          continue;
          throw new IllegalArgumentException("Method does not accept concrete type.");
          a(paramStringBuilder, locala, paramParcel, k);
        }
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new ah.a("Overread allowed size end=" + i, paramParcel);
    paramStringBuilder.append((char)'}');
  }

  public final int a()
  {
    return this.b;
  }

  public final HashMap<String, ar.a<?, ?>> b()
  {
    if (this.e == null)
      return null;
    return this.e.a(this.f);
  }

  protected final Object c()
  {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }

  protected final boolean d()
  {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }

  public int describeContents()
  {
    return 0;
  }

  public final Parcel e()
  {
    switch (this.g)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      return this.c;
      this.h = i.a(this.c);
      i.a(this.c, this.h);
      this.g = 2;
    }
  }

  final au f()
  {
    switch (this.d)
    {
    default:
      throw new IllegalStateException("Invalid creation type: " + this.d);
    case 0:
      return null;
    case 1:
      return this.e;
    case 2:
    }
    return this.e;
  }

  public String toString()
  {
    f.a(this.e, "Cannot convert to JSON on client side.");
    Parcel localParcel = e();
    localParcel.setDataPosition(0);
    StringBuilder localStringBuilder = new StringBuilder(100);
    a(localStringBuilder, this.e.a(this.f), localParcel);
    return localStringBuilder.toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    v.a(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.ax
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
