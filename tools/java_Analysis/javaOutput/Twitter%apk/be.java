import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public final class be
  implements Serializable
{
  private static be e = new be();
  private static final String[] f = { "entities" };
  private static final Comparator g = new eg();
  public ArrayList a;
  public ArrayList b;
  public cj c;
  public ArrayList d;

  public be()
  {
  }

  public static be a(bq parambq)
  {
    be localbe = new be();
    HashSet localHashSet1 = new HashSet(3);
    HashSet localHashSet2 = new HashSet(3);
    cp localcp1 = parambq.g();
    if (localcp1 != null)
    {
      Object localObject1 = localcp1;
      Object localObject2 = null;
      if (localObject1 != cp.b)
      {
        switch (eh.a[localObject1.ordinal()])
        {
        case 3:
        default:
        case 1:
        case 4:
        case 2:
        }
        while (true)
        {
          localObject1 = parambq.g();
          break;
          if ("promoted_content".equals(localObject2))
          {
            cp localcp5 = parambq.g();
            cj localcj = new cj();
            if (localcp5 != cp.b)
            {
              switch (eh.a[localcp5.ordinal()])
              {
              default:
              case 1:
              case 2:
              case 3:
              case 4:
              }
              while (true)
              {
                localcp5 = parambq.g();
                break;
                parambq.h();
                continue;
                if ("impression_id".equals(localObject2))
                {
                  localcj.a = parambq.j();
                  continue;
                  localObject2 = parambq.j();
                }
              }
            }
            localbe.c = localcj;
          }
          else
          {
            parambq.h();
            continue;
            localObject2 = parambq.j();
            continue;
            if ("urls".equals(localObject2))
            {
              while (localObject1 != cp.d)
              {
                localObject1 = parambq.g();
                if (localObject1 == cp.a)
                {
                  dl localdl = new dl();
                  if (localObject1 != cp.b)
                  {
                    cp localcp4 = parambq.g();
                    String str3 = parambq.m();
                    switch (eh.a[localcp4.ordinal()])
                    {
                    default:
                    case 2:
                    case 1:
                    case 3:
                    }
                    while (true)
                    {
                      localObject1 = localcp4;
                      localObject2 = str3;
                      break;
                      if ("indices".equals(str3))
                      {
                        a(parambq, localdl);
                        localObject1 = localcp4;
                        localObject2 = str3;
                        break;
                      }
                      parambq.h();
                      localObject1 = localcp4;
                      localObject2 = str3;
                      break;
                      parambq.h();
                      localObject1 = localcp4;
                      localObject2 = str3;
                      break;
                      if ("url".equals(str3))
                      {
                        localdl.c = parambq.j();
                        localObject1 = localcp4;
                        localObject2 = str3;
                        break;
                      }
                      if ("expanded_url".equals(str3))
                      {
                        localdl.d = parambq.j();
                        localObject1 = localcp4;
                        localObject2 = str3;
                        break;
                      }
                      if ("display_url".equals(str3))
                        localdl.e = parambq.j();
                    }
                  }
                  String str2;
                  label511: dy localdy2;
                  if (localdl.d == null)
                  {
                    str2 = localdl.c;
                    if (!s.b(str2))
                      break label630;
                    localdy2 = new dy();
                    localdy2.c = localdl.c;
                    localdy2.d = localdl.d;
                    localdy2.e = localdl.e;
                    localdy2.g = s.a(str2);
                    localdy2.a = localdl.a;
                    localdy2.b = localdl.b;
                    localdy2.h = 1;
                  }
                  label630: for (dy localdy3 = localdy2; ; localdy3 = null)
                  {
                    if (localdy3 == null)
                      break label636;
                    localHashSet2.add(localdy3);
                    localHashSet1.add(localdy3);
                    break;
                    str2 = localdl.d;
                    break label511;
                  }
                  label636: localHashSet1.add(localdl);
                }
              }
            }
            else if ("user_mentions".equals(localObject2))
            {
              ArrayList localArrayList = new ArrayList();
              ea localea1 = new ea();
              cp localcp2 = parambq.g();
              Object localObject3 = localObject2;
              ea localea2 = localea1;
              if (localcp2 != cp.d)
              {
                switch (eh.a[localcp2.ordinal()])
                {
                default:
                case 1:
                case 5:
                case 2:
                case 3:
                case 6:
                case 4:
                }
                while (true)
                {
                  localcp2 = parambq.g();
                  break;
                  localea2 = new ea();
                  continue;
                  localArrayList.add(localea2);
                  continue;
                  if ("indices".equals(localObject3))
                  {
                    a(parambq, localea2);
                  }
                  else
                  {
                    parambq.h();
                    continue;
                    if ("screen_name".equals(localObject3))
                    {
                      localea2.c = parambq.j();
                      continue;
                      if ("id".equals(localObject3))
                      {
                        localea2.d = parambq.e();
                        continue;
                        localObject3 = parambq.j();
                      }
                    }
                  }
                }
              }
              localbe.b = localArrayList;
              localObject2 = localObject3;
            }
            else if ("media".equals(localObject2))
            {
              while (localObject1 != cp.d)
              {
                localObject1 = parambq.g();
                if (localObject1 == cp.a)
                {
                  dy localdy1 = new dy();
                  if (localObject1 != cp.b)
                  {
                    cp localcp3 = parambq.g();
                    String str1 = parambq.m();
                    switch (eh.a[localcp3.ordinal()])
                    {
                    case 4:
                    case 5:
                    default:
                    case 2:
                    case 1:
                    case 6:
                    case 3:
                    }
                    while (true)
                    {
                      localObject1 = localcp3;
                      localObject2 = str1;
                      break;
                      if ("indices".equals(str1))
                      {
                        a(parambq, localdy1);
                        localObject1 = localcp3;
                        localObject2 = str1;
                        break;
                      }
                      parambq.h();
                      localObject1 = localcp3;
                      localObject2 = str1;
                      break;
                      parambq.h();
                      localObject1 = localcp3;
                      localObject2 = str1;
                      break;
                      if ("id".equals(str1))
                      {
                        localdy1.f = parambq.e();
                        localObject1 = localcp3;
                        localObject2 = str1;
                        break;
                        if ("url".equals(str1))
                        {
                          localdy1.c = parambq.j();
                          localObject1 = localcp3;
                          localObject2 = str1;
                          break;
                        }
                        if ("expanded_url".equals(str1))
                        {
                          localdy1.d = parambq.j();
                          localObject1 = localcp3;
                          localObject2 = str1;
                          break;
                        }
                        if ("display_url".equals(str1))
                        {
                          localdy1.e = parambq.j();
                          localObject1 = localcp3;
                          localObject2 = str1;
                          break;
                        }
                        if ("type".equals(str1))
                        {
                          if ("photo".equals(parambq.j()))
                            localdy1.h = 1;
                          localObject1 = localcp3;
                          localObject2 = str1;
                          break;
                        }
                        if ("media_url".equals(str1))
                          localdy1.g = parambq.j();
                      }
                    }
                  }
                  localHashSet1.add(localdy1);
                  localHashSet2.add(localdy1);
                }
              }
            }
            else
            {
              parambq.h();
            }
          }
        }
      }
    }
    if (!localHashSet1.isEmpty())
    {
      localbe.a = new ArrayList(localHashSet1);
      Collections.sort(localbe.a, g);
    }
    if (localbe.b != null)
      Collections.sort(localbe.b, g);
    if (!localHashSet2.isEmpty())
    {
      localbe.d = new ArrayList(localHashSet2);
      Collections.sort(localbe.d, g);
    }
    return localbe;
  }

  public static be a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
      return (be)cr.a(paramArrayOfByte);
    return e;
  }

  private static void a(bq parambq, ak paramak)
  {
    cp localcp = parambq.g();
    if (localcp != cp.d)
    {
      int i;
      if (localcp == cp.h)
      {
        i = Integer.valueOf(parambq.d()).intValue();
        if (paramak.a == -1)
          paramak.a = i;
      }
      while (true)
      {
        localcp = parambq.g();
        break;
        if (paramak.b == -1)
        {
          paramak.b = i;
          continue;
          parambq.h();
        }
      }
    }
  }

  private static void a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    if ((paramArrayList1 == null) || (paramArrayList2.isEmpty()));
    while (true)
    {
      return;
      int i = paramArrayList2.size();
      Iterator localIterator = paramArrayList1.iterator();
      int j = 0;
      int m;
      for (int k = 0; localIterator.hasNext(); k = m)
      {
        ak localak = (ak)localIterator.next();
        m = k;
        int n = j;
        int i1 = k;
        int i2 = n;
        while (i1 < i)
        {
          int[] arrayOfInt = (int[])paramArrayList2.get(i1);
          int i3 = arrayOfInt[0];
          int i4 = arrayOfInt[1];
          int i5 = i4 - i3;
          if (i4 < localak.a)
          {
            i2 += i5;
            m++;
          }
          i1++;
        }
        localak.a -= i2;
        localak.b -= i2;
        j = i2;
      }
    }
  }

  public final void a(ArrayList paramArrayList)
  {
    a(this.a, paramArrayList);
    a(this.b, paramArrayList);
  }

  public final boolean a(long paramLong)
  {
    if ((this.b != null) && (!this.b.isEmpty()))
    {
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
        if (((ea)localIterator.next()).d == paramLong)
          return true;
    }
    return false;
  }

  public final byte[] a()
  {
    return cr.a(this);
  }

  public final boolean b()
  {
    if (this.d != null)
    {
      Iterator localIterator = this.d.iterator();
      while (localIterator.hasNext())
        if (((dy)localIterator.next()).h == 1)
          return true;
    }
    return false;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass()))
      return false;
    be localbe = (be)paramObject;
    if (this.a != null)
    {
      if (this.a.equals(localbe.a));
    }
    else
      while (localbe.a != null)
        return false;
    return true;
  }

  public final int hashCode()
  {
    if (this.a != null)
      return this.a.hashCode();
    return 0;
  }

  public final String toString()
  {
    if ((this.a == null) || (this.a.isEmpty()))
      return "urls: []";
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("urls:[");
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      localStringBuilder.append(((dl)localIterator.next()).toString());
    localStringBuilder.append((char)']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     be
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
