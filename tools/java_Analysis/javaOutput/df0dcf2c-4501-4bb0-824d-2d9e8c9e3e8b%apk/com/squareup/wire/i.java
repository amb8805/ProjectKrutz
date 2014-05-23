package com.squareup.wire;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class i<M extends Message>
{
  private final v a;
  private final Class<M> b;
  private final Class<h<M>> c;
  private final Map<String, Integer> d = new LinkedHashMap();
  private final Map<Integer, j> e = new LinkedHashMap();

  i(v paramv, Class<M> paramClass)
  {
    this.a = paramv;
    this.b = paramClass;
    this.c = a(paramClass);
    Field[] arrayOfField = paramClass.getDeclaredFields();
    int i = arrayOfField.length;
    int j = 0;
    if (j < i)
    {
      Field localField = arrayOfField[j];
      m localm = (m)localField.getAnnotation(m.class);
      int k;
      String str;
      Message.Datatype localDatatype1;
      Class localClass;
      if (localm != null)
      {
        k = localm.a();
        str = localField.getName();
        this.d.put(str, Integer.valueOf(k));
        localDatatype1 = localm.b();
        if (localDatatype1 != Message.Datatype.ENUM)
          break label274;
        localClass = localField.getType();
        if (!Enum.class.isAssignableFrom(localClass))
          break label210;
      }
      label274: 
      while (true)
      {
        this.e.put(Integer.valueOf(k), new j(k, str, localDatatype1, localm.c(), localClass, localField, a(str, localField.getType()), (byte)0));
        j++;
        break;
        label210: if (List.class.isAssignableFrom(localClass))
        {
          Type localType2 = ((java.lang.reflect.ParameterizedType)localField.getGenericType()).getActualTypeArguments()[0];
          if (((localType2 instanceof Class)) && (Enum.class.isAssignableFrom((Class)localType2)))
            localClass = (Class)localType2;
        }
        else
        {
          localClass = null;
          continue;
          Message.Datatype localDatatype2 = Message.Datatype.MESSAGE;
          localClass = null;
          if (localDatatype1 == localDatatype2)
          {
            localClass = localField.getType();
            if (!Message.class.isAssignableFrom(localClass))
              if (List.class.isAssignableFrom(localClass))
              {
                Type localType1 = ((java.lang.reflect.ParameterizedType)localField.getGenericType()).getActualTypeArguments()[0];
                if (((localType1 instanceof Class)) && (Message.class.isAssignableFrom((Class)localType1)))
                  localClass = (Class)localType1;
              }
              else
              {
                localClass = null;
              }
          }
        }
      }
    }
  }

  private int a(int paramInt, Object paramObject, Message.Datatype paramDatatype)
  {
    return x.a(paramInt) + a(paramObject, paramDatatype);
  }

  private int a(Object paramObject, Message.Datatype paramDatatype)
  {
    int i = 0;
    switch (i.1.a[paramDatatype.ordinal()])
    {
    default:
      throw new RuntimeException();
    case 1:
      int i2 = ((Integer)paramObject).intValue();
      if (i2 >= 0)
        return x.b(i2);
      return 10;
    case 2:
    case 3:
      return x.a(((Long)paramObject).longValue());
    case 4:
      return x.b(((Integer)paramObject).intValue());
    case 5:
      return x.b(x.f(((Integer)paramObject).intValue()));
    case 6:
      return x.a(x.d(((Long)paramObject).longValue()));
    case 7:
      return 1;
    case 8:
      Enum localEnum = (Enum)paramObject;
      return x.b(this.a.c(localEnum.getClass()).a(localEnum));
    case 9:
      String str = (String)paramObject;
      int m = str.length();
      int n = 0;
      if (i < m)
      {
        int i1 = str.charAt(i);
        if (i1 <= 127)
          n++;
        while (true)
        {
          i++;
          break;
          if (i1 <= 2047)
          {
            n += 2;
          }
          else if (Character.isHighSurrogate(i1))
          {
            n += 4;
            i++;
          }
          else
          {
            n += 3;
          }
        }
      }
      return n + x.b(n);
    case 10:
      int k = ((b)paramObject).a();
      return k + x.b(k);
    case 11:
      int j = ((Message)paramObject).b();
      return j + x.b(j);
    case 12:
    case 13:
    case 14:
      return 4;
    case 15:
    case 16:
    case 17:
    }
    return 8;
  }

  private int a(List<?> paramList, int paramInt, Message.Datatype paramDatatype)
  {
    int i = 0;
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      i += a(paramInt, localIterator.next(), paramDatatype);
    return i;
  }

  private e<ExtendableMessage<?>, ?> a(int paramInt)
  {
    g localg = this.a.a;
    if (localg == null)
      return null;
    return localg.a(this.b, paramInt);
  }

  private static Class<h<M>> a(Class<M> paramClass)
  {
    try
    {
      Class localClass = Class.forName(paramClass.getName() + "$Builder");
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
    }
    throw new IllegalArgumentException("No builder class found for message type " + paramClass.getName());
  }

  private static Object a(M paramM, j paramj)
  {
    if (j.a(paramj) == null)
      throw new AssertionError("Field is not of type \"Message\"");
    try
    {
      Object localObject = j.a(paramj).get(paramM);
      return localObject;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
  }

  private Object a(w paramw, int paramInt, Message.Datatype paramDatatype)
  {
    boolean bool = true;
    switch (i.1.a[paramDatatype.ordinal()])
    {
    default:
      throw new RuntimeException();
    case 1:
    case 4:
      return Integer.valueOf(paramw.c());
    case 2:
    case 3:
      return Long.valueOf(paramw.d());
    case 5:
      int k = paramw.c();
      return Integer.valueOf(k >>> 1 ^ -(k & 0x1));
    case 6:
      long l = paramw.d();
      return Long.valueOf(l >>> bool ^ -(l & 1L));
    case 7:
      if (paramw.c() != 0);
      while (true)
      {
        return Boolean.valueOf(bool);
        bool = false;
      }
    case 8:
      v localv2 = this.a;
      j localj2 = (j)this.e.get(Integer.valueOf(paramInt));
      if (localj2 == null);
      for (Class localClass2 = null; ; localClass2 = localj2.e)
      {
        if (localClass2 == null)
        {
          e locale2 = a(paramInt);
          if (locale2 != null)
            localClass2 = locale2.c();
        }
        return localv2.c(localClass2).a(paramw.c());
      }
    case 9:
      return paramw.b();
    case 10:
      return paramw.b(paramw.c());
    case 11:
      int i = paramw.c();
      if (paramw.a >= 64)
        throw new IOException("Wire recursion limit exceeded");
      int j = paramw.c(i);
      paramw.a = (1 + paramw.a);
      v localv1 = this.a;
      j localj1 = (j)this.e.get(Integer.valueOf(paramInt));
      if (localj1 == null);
      for (Class localClass1 = null; ; localClass1 = localj1.f)
      {
        if (localClass1 == null)
        {
          e locale1 = a(paramInt);
          if (locale1 != null)
            localClass1 = locale1.b();
        }
        Message localMessage = localv1.a(localClass1).a(paramw);
        paramw.a(0);
        paramw.a = (-1 + paramw.a);
        paramw.d(j);
        return localMessage;
      }
    case 12:
    case 13:
      return Integer.valueOf(paramw.e());
    case 15:
    case 16:
      return Long.valueOf(paramw.f());
    case 14:
      return Float.valueOf(Float.intBitsToFloat(paramw.e()));
    case 17:
    }
    return Double.valueOf(Double.longBitsToDouble(paramw.f()));
  }

  private Method a(String paramString, Class<?> paramClass)
  {
    try
    {
      Method localMethod = this.c.getMethod(paramString, new Class[] { paramClass });
      return localMethod;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
    }
    throw new AssertionError("No builder method " + this.c.getName() + "." + paramString + "(" + paramClass.getName() + ")");
  }

  private Collection<j> a()
  {
    return this.e.values();
  }

  private void a(M paramM, x paramx)
  {
    Iterator localIterator1 = a().iterator();
    while (localIterator1.hasNext())
    {
      j localj = (j)localIterator1.next();
      Object localObject2 = a(paramM, localj);
      if (localObject2 != null)
      {
        int j = localj.a;
        Message.Datatype localDatatype2 = localj.c;
        Message.Label localLabel2 = localj.d;
        if (localLabel2.b())
        {
          if (localLabel2.c())
            b(paramx, (List)localObject2, j, localDatatype2);
          else
            a(paramx, (List)localObject2, j, localDatatype2);
        }
        else
          a(paramx, j, localObject2, localDatatype2);
      }
    }
    if ((paramM instanceof ExtendableMessage))
    {
      ExtendableMessage localExtendableMessage = (ExtendableMessage)paramM;
      if (localExtendableMessage.extensionMap != null)
      {
        f localf = localExtendableMessage.extensionMap;
        Iterator localIterator2 = localf.a().iterator();
        while (localIterator2.hasNext())
        {
          e locale = (e)localIterator2.next();
          Object localObject1 = localf.a(locale);
          int i = locale.e();
          Message.Datatype localDatatype1 = locale.f();
          Message.Label localLabel1 = locale.g();
          if (localLabel1.b())
          {
            if (localLabel1.c())
              b(paramx, (List)localObject1, i, localDatatype1);
            else
              a(paramx, (List)localObject1, i, localDatatype1);
          }
          else
            a(paramx, i, localObject1, localDatatype1);
        }
      }
    }
    paramM.a(paramx);
  }

  private static void a(d paramd, e<?, ?> parame, Object paramObject)
  {
    if (paramd.a == null)
      paramd.a = new f();
    paramd.a.a(parame, paramObject);
  }

  private void a(h<M> paramh, int paramInt, Object paramObject)
  {
    try
    {
      j.b((j)this.e.get(Integer.valueOf(paramInt))).invoke(paramh, new Object[] { paramObject });
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new AssertionError(localInvocationTargetException);
    }
  }

  private void a(x paramx, int paramInt, Object paramObject, Message.Datatype paramDatatype)
  {
    WireType localWireType;
    switch (Message.1.a[paramDatatype.ordinal()])
    {
    default:
      throw new AssertionError("No wiretype for datatype " + paramDatatype);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
      localWireType = WireType.a;
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    }
    while (true)
    {
      paramx.b(paramInt, localWireType);
      a(paramx, paramObject, paramDatatype);
      return;
      localWireType = WireType.f;
      continue;
      localWireType = WireType.b;
      continue;
      localWireType = WireType.c;
    }
  }

  private void a(x paramx, Object paramObject, Message.Datatype paramDatatype)
  {
    switch (i.1.a[paramDatatype.ordinal()])
    {
    default:
      throw new RuntimeException();
    case 1:
      int j = ((Integer)paramObject).intValue();
      if (j >= 0)
      {
        paramx.d(j);
        return;
      }
      paramx.b(j);
      return;
    case 2:
    case 3:
      paramx.b(((Long)paramObject).longValue());
      return;
    case 4:
      paramx.d(((Integer)paramObject).intValue());
      return;
    case 5:
      paramx.d(x.f(((Integer)paramObject).intValue()));
      return;
    case 6:
      paramx.b(x.d(((Long)paramObject).longValue()));
      return;
    case 7:
      if (((Boolean)paramObject).booleanValue());
      for (int i = 1; ; i = 0)
      {
        paramx.c(i);
        return;
      }
    case 8:
      Enum localEnum = (Enum)paramObject;
      paramx.d(this.a.c(localEnum.getClass()).a(localEnum));
      return;
    case 9:
      byte[] arrayOfByte = ((String)paramObject).getBytes("UTF-8");
      paramx.d(arrayOfByte.length);
      paramx.a(arrayOfByte);
      return;
    case 10:
      b localb = (b)paramObject;
      paramx.d(localb.a());
      paramx.a(localb.b());
      return;
    case 11:
      Message localMessage = (Message)paramObject;
      paramx.d(localMessage.b());
      this.a.a(localMessage.getClass()).a(localMessage, paramx);
      return;
    case 12:
    case 13:
      paramx.e(((Integer)paramObject).intValue());
      return;
    case 15:
    case 16:
      paramx.c(((Long)paramObject).longValue());
      return;
    case 14:
      paramx.e(Float.floatToIntBits(((Float)paramObject).floatValue()));
      return;
    case 17:
    }
    paramx.c(Double.doubleToLongBits(((Double)paramObject).doubleValue()));
  }

  private void a(x paramx, List<?> paramList, int paramInt, Message.Datatype paramDatatype)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      a(paramx, paramInt, localIterator.next(), paramDatatype);
  }

  private int b(List<?> paramList, int paramInt, Message.Datatype paramDatatype)
  {
    int i = 0;
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      i += a(localIterator.next(), paramDatatype);
    return i + (x.b(x.a(paramInt, WireType.c)) + x.b(i));
  }

  private void b(x paramx, List<?> paramList, int paramInt, Message.Datatype paramDatatype)
  {
    int i = 0;
    Iterator localIterator1 = paramList.iterator();
    while (localIterator1.hasNext())
      i += a(localIterator1.next(), paramDatatype);
    paramx.b(paramInt, WireType.c);
    paramx.d(i);
    Iterator localIterator2 = paramList.iterator();
    while (localIterator2.hasNext())
      a(paramx, localIterator2.next(), paramDatatype);
  }

  final int a(M paramM)
  {
    int i = 0;
    Iterator localIterator1 = a().iterator();
    int j = 0;
    while (localIterator1.hasNext())
    {
      j localj = (j)localIterator1.next();
      Object localObject2 = a(paramM, localj);
      if (localObject2 != null)
      {
        int m = localj.a;
        Message.Datatype localDatatype2 = localj.c;
        Message.Label localLabel2 = localj.d;
        if (localLabel2.b())
        {
          if (localLabel2.c())
            j += b((List)localObject2, m, localDatatype2);
          else
            j += a((List)localObject2, m, localDatatype2);
        }
        else
          j += a(m, localObject2, localDatatype2);
      }
    }
    if ((paramM instanceof ExtendableMessage))
    {
      ExtendableMessage localExtendableMessage = (ExtendableMessage)paramM;
      if (localExtendableMessage.extensionMap != null)
      {
        f localf = localExtendableMessage.extensionMap;
        Iterator localIterator2 = localf.a().iterator();
        while (localIterator2.hasNext())
        {
          e locale = (e)localIterator2.next();
          Object localObject1 = localf.a(locale);
          int k = locale.e();
          Message.Datatype localDatatype1 = locale.f();
          Message.Label localLabel1 = locale.g();
          if (localLabel1.b())
          {
            if (localLabel1.c())
              i += b((List)localObject1, k, localDatatype1);
            else
              i += a((List)localObject1, k, localDatatype1);
          }
          else
            i += a(k, localObject1, localDatatype1);
        }
        j += i;
      }
    }
    return j + paramM.c();
  }

  final M a(w paramw)
  {
    while (true)
    {
      h localh;
      k localk;
      try
      {
        localh = (h)this.c.newInstance();
        localk = new k((byte)0);
        locale = null;
        int i = paramw.a();
        j = i >> 3;
        localWireType = WireType.a(i);
        if (j != 0)
          break label174;
        Iterator localIterator = localk.a().iterator();
        while (true)
        {
          if (!localIterator.hasNext())
            break label168;
          k = ((Integer)localIterator.next()).intValue();
          if ((j)this.e.get(Integer.valueOf(k)) == null)
            break;
          a(localh, k, localk.a(k));
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        while (true)
        {
          int k;
          throw new RuntimeException(localIllegalAccessException);
          a((d)localh, a(k), localk.a(k));
        }
      }
      catch (InstantiationException localInstantiationException)
      {
        throw new RuntimeException(localInstantiationException);
      }
      e locale;
      int j;
      WireType localWireType;
      label168: return localh.build();
      label174: j localj = (j)this.e.get(Integer.valueOf(j));
      Message.Datatype localDatatype;
      Message.Label localLabel;
      if (localj != null)
      {
        localDatatype = localj.c;
        localLabel = localj.d;
      }
      while (true)
        label212: if ((localLabel.c()) && (localWireType == WireType.c))
        {
          int m = paramw.c();
          long l = paramw.g();
          int n = paramw.c(m);
          while (true)
            if (paramw.g() < l + m)
            {
              localk.a(j, a(paramw, j, localDatatype));
              continue;
              locale = a(j);
              if (locale == null)
                switch (i.1.b[localWireType.ordinal()])
                {
                case 6:
                default:
                  throw new RuntimeException("Unsupported wire type: " + localWireType);
                case 1:
                  localh.addVarint(j, paramw.d());
                  break;
                case 2:
                  localh.addFixed32(j, paramw.e());
                  break;
                case 3:
                  localh.addFixed64(j, paramw.f());
                  break;
                case 4:
                  localh.addLengthDelimited(j, paramw.b(paramw.c()));
                  break;
                case 5:
                  paramw.h();
                  break;
                }
              localDatatype = locale.f();
              localLabel = locale.g();
              break label212;
            }
          paramw.d(n);
          if (paramw.g() == l + m)
            break;
          throw new IOException("Packed data had wrong length!");
        }
      Object localObject = a(paramw, j, localDatatype);
      if (localLabel.b())
        localk.a(j, localObject);
      else if (locale != null)
        a((d)localh, locale, localObject);
      else
        a(localh, j, localObject);
    }
  }

  final byte[] b(M paramM)
  {
    byte[] arrayOfByte = new byte[a(paramM)];
    try
    {
      a(paramM, x.a(arrayOfByte, arrayOfByte.length));
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(localIOException);
    }
  }

  final String c(M paramM)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.b.getSimpleName());
    localStringBuilder.append("{");
    Iterator localIterator = a().iterator();
    String str1 = "";
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      Object localObject = a(paramM, localj);
      if (localObject != null)
      {
        localStringBuilder.append(str1);
        str1 = ", ";
        localStringBuilder.append(localj.b);
        localStringBuilder.append("=");
        localStringBuilder.append(localObject);
      }
    }
    ExtendableMessage localExtendableMessage;
    if ((paramM instanceof ExtendableMessage))
    {
      localExtendableMessage = (ExtendableMessage)paramM;
      localStringBuilder.append(str1);
      localStringBuilder.append("{extensions=");
      if (localExtendableMessage.extensionMap != null)
        break label188;
    }
    label188: for (String str2 = "{}"; ; str2 = localExtendableMessage.extensionMap.toString())
    {
      localStringBuilder.append(str2);
      localStringBuilder.append("}");
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     com.squareup.wire.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
