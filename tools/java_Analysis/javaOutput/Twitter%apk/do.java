import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ArrayList;;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class do
{
  public static final ef a;
  private static HashMap b = new HashMap();
  private static final HashMap c;

  static
  {
    a = new ef();
    c = new HashMap();
    b.put("favorite", new ec(1, 1, 2, 0));
    b.put("mention", new ec(2, 1, 1, 2));
    b.put("reply", new ec(3, 1, 2, 2));
    b.put("retweet", new ec(4, 1, 2, 2));
    b.put("follow", new ec(5, 1, 1, 0));
    b.put("list_member_added", new ec(6, 1, 1, 3));
    b.put("list_created", new ec(7, 1, 3, 0));
    c.put("poi", Integer.valueOf(1));
    c.put("neighborhood", Integer.valueOf(2));
    c.put("city", Integer.valueOf(3));
    c.put("admin", Integer.valueOf(4));
    c.put("country", Integer.valueOf(5));
  }

  public do()
  {
  }

  private static ap A(bq parambq)
  {
    cp localcp1 = parambq.g();
    String str1 = null;
    String str2 = null;
    Object localObject1 = localcp1;
    Object localObject2 = null;
    String str3 = null;
    if ((localObject1 != null) && (localObject1 != cp.b))
    {
      String str4 = parambq.m();
      switch (bm.a[localObject1.ordinal()])
      {
      default:
      case 4:
      case 1:
      case 7:
      }
      while (true)
      {
        label80: Object localObject3 = localObject2;
        while (true)
        {
          cp localcp2 = parambq.g();
          localObject2 = localObject3;
          localObject1 = localcp2;
          break;
          if ("full_name".equals(str4))
          {
            str2 = parambq.j();
            localObject3 = localObject2;
          }
          else if ("place_type".equals(str4))
          {
            str1 = parambq.j();
            localObject3 = localObject2;
          }
          else
          {
            if (!"id".equals(str4))
              break label80;
            str3 = parambq.j();
            localObject3 = localObject2;
            continue;
            parambq.h();
            localObject3 = localObject2;
            continue;
            if (!"bounding_box".equals(str4))
              break label492;
            Object localObject4 = parambq.g();
            if ((localObject4 != null) && (localObject4 != cp.b))
            {
              String str5 = parambq.m();
              switch (bm.a[localObject4.ordinal()])
              {
              default:
              case 1:
              case 7:
              }
              while (true)
              {
                Object localObject5 = localObject2;
                while (true)
                {
                  cp localcp3 = parambq.g();
                  localObject2 = localObject5;
                  localObject4 = localcp3;
                  break;
                  if ("coordinates".equals(str5))
                  {
                    if (parambq != null)
                    {
                      StringBuilder localStringBuilder = new StringBuilder();
                      cp localcp4 = parambq.p();
                      localStringBuilder.append((char)'[');
                      cp localcp5 = localcp4;
                      int i = 0;
                      while ((localcp5 != null) && (localcp5 != cp.d))
                      {
                        if (localcp5 == cp.c)
                          if ((localcp5 != null) && (localcp5 != cp.d))
                          {
                            Pair localPair;
                            if (localcp5 == cp.c)
                            {
                              localPair = B(parambq);
                              if (localPair != null)
                              {
                                if (i == 0)
                                  break label426;
                                localStringBuilder.append((char)',');
                              }
                            }
                            while (true)
                            {
                              localStringBuilder.append((char)'[').append(localPair.first).append((char)',').append(localPair.second).append((char)']');
                              localcp5 = parambq.g();
                              break;
                              label426: i = 1;
                            }
                          }
                        localcp5 = parambq.g();
                      }
                      localStringBuilder.append((char)']');
                      localObject5 = localStringBuilder.toString();
                    }
                    else
                    {
                      localObject5 = null;
                    }
                  }
                  else
                  {
                    parambq.h();
                    localObject5 = localObject2;
                  }
                }
                parambq.h();
              }
            }
            localObject3 = localObject2;
          }
        }
        label492: parambq.h();
      }
    }
    return new ap(str3, ((Integer)c.get(str1)).intValue(), str2, localObject2);
  }

  private static Pair B(bq parambq)
  {
    cp localcp1 = parambq.g();
    int i = 0;
    cp localcp2 = localcp1;
    Double localDouble1 = null;
    Double localDouble2 = null;
    if ((localcp2 != null) && (localcp2 != cp.d))
    {
      if ((localcp2 == cp.i) || (localcp2 == cp.h))
        switch (i)
        {
        default:
        case 0:
        case 1:
        }
      while (true)
      {
        i++;
        localcp2 = parambq.g();
        break;
        localDouble1 = Double.valueOf(parambq.f());
        continue;
        localDouble2 = Double.valueOf(parambq.f());
      }
    }
    if ((localDouble2 != null) && (localDouble1 != null))
      return new Pair(localDouble2, localDouble1);
    return null;
  }

  private static ae C(bq parambq)
  {
    cp localcp1 = parambq.p();
    Object localObject1 = null;
    int i = 0;
    int j = 0;
    Object localObject2 = null;
    int k = 0;
    int m = 0;
    Object localObject3 = null;
    int n = 0;
    int i1 = 0;
    long l1 = 0L;
    long l2 = 0L;
    long l3 = 0L;
    int i2 = 0;
    Object localObject4 = localcp1;
    Object localObject5;
    int i5;
    int i6;
    long l7;
    int i10;
    int i11;
    long l5;
    Object localObject9;
    int i9;
    Object localObject7;
    int i7;
    long l4;
    label174: String str3;
    int i74;
    int i65;
    int i67;
    while (true)
      if (localObject4 != null)
      {
        cp localcp2 = cp.b;
        if (localObject4 != localcp2)
          switch (bm.a[localObject4.ordinal()])
          {
          case 3:
          default:
            localObject5 = localObject1;
            int i16 = i;
            i5 = i2;
            i6 = i16;
            Object localObject12 = localObject2;
            int i17 = k;
            int i18 = m;
            l7 = l2;
            i10 = i17;
            i11 = i18;
            Object localObject13 = localObject3;
            int i19 = n;
            l5 = l1;
            localObject9 = localObject13;
            i9 = i19;
            long l9 = l3;
            localObject7 = localObject12;
            i7 = j;
            l4 = l9;
            cp localcp3 = parambq.g();
            localObject1 = localObject5;
            localObject4 = localcp3;
            int i12 = i6;
            i2 = i5;
            i = i12;
            Object localObject10 = localObject7;
            int i13 = i10;
            int i14 = i11;
            l2 = l7;
            k = i13;
            m = i14;
            Object localObject11 = localObject9;
            int i15 = i9;
            l1 = l5;
            localObject3 = localObject11;
            n = i15;
            long l8 = l4;
            localObject2 = localObject10;
            j = i7;
            l3 = l8;
            break;
          case 4:
            str3 = parambq.m();
            if (("action".equals(str3)) || ("event".equals(str3)))
            {
              String str4 = parambq.j();
              ec localec = (ec)b.get(str4);
              if (localec == null)
                break label1915;
              int i73 = localec.a;
              n = localec.b;
              i74 = localec.c;
              i65 = localec.d;
              i67 = i73;
            }
          case 1:
          case 2:
          }
      }
    label1915: int i66;
    for (int i68 = i74; ; i68 = i66)
    {
      i5 = i67;
      int i69 = i65;
      localObject5 = localObject1;
      int i70 = j;
      Object localObject34 = localObject2;
      l4 = l3;
      i7 = i70;
      localObject7 = localObject34;
      int i71 = m;
      l7 = l2;
      i11 = i71;
      i10 = i68;
      i6 = i69;
      Object localObject35 = localObject3;
      int i72 = n;
      l5 = l1;
      localObject9 = localObject35;
      i9 = i72;
      break label174;
      if ("created_at".equals(str3))
      {
        long l26 = cr.a(cr.a, parambq.j());
        localObject5 = localObject1;
        int i83 = i;
        i5 = i2;
        i6 = i83;
        Object localObject40 = localObject2;
        int i84 = k;
        int i85 = m;
        l7 = l2;
        i10 = i84;
        i11 = i85;
        Object localObject41 = localObject3;
        int i86 = n;
        l5 = l1;
        localObject9 = localObject41;
        i9 = i86;
        localObject7 = localObject40;
        i7 = j;
        l4 = l26;
        break label174;
      }
      if ("max_position".equals(str3))
      {
        long l24 = Long.parseLong(parambq.j());
        localObject5 = localObject1;
        int i79 = i;
        i5 = i2;
        i6 = i79;
        Object localObject38 = localObject2;
        int i80 = k;
        int i81 = m;
        l7 = l24;
        i10 = i80;
        i11 = i81;
        Object localObject39 = localObject3;
        int i82 = n;
        l5 = l1;
        localObject9 = localObject39;
        i9 = i82;
        long l25 = l3;
        localObject7 = localObject38;
        i7 = j;
        l4 = l25;
        break label174;
      }
      if (!"min_position".equals(str3))
        break;
      long l22 = Long.parseLong(parambq.j());
      localObject5 = localObject1;
      int i75 = i;
      i5 = i2;
      i6 = i75;
      Object localObject36 = localObject2;
      int i76 = k;
      int i77 = m;
      l7 = l2;
      i10 = i76;
      i11 = i77;
      Object localObject37 = localObject3;
      int i78 = n;
      l5 = l22;
      localObject9 = localObject37;
      i9 = i78;
      long l23 = l3;
      localObject7 = localObject36;
      i7 = j;
      l4 = l23;
      break label174;
      String str2 = parambq.m();
      if ("sources".equals(str2))
      {
        if (1 == n)
        {
          ArrayList localArrayList4 = b(parambq);
          int i61 = i;
          i5 = i2;
          i6 = i61;
          int i62 = j;
          Object localObject33 = localObject2;
          l4 = l3;
          i7 = i62;
          localObject7 = localObject33;
          int i63 = m;
          localObject5 = localObject1;
          int i64 = n;
          l5 = l1;
          i9 = i64;
          localObject9 = localArrayList4;
          long l21 = l2;
          i10 = k;
          i11 = i63;
          l7 = l21;
          break label174;
        }
        parambq.h();
        localObject5 = localObject1;
        int i57 = i;
        i5 = i2;
        i6 = i57;
        Object localObject31 = localObject2;
        int i58 = k;
        int i59 = m;
        l7 = l2;
        i10 = i58;
        i11 = i59;
        Object localObject32 = localObject3;
        int i60 = n;
        l5 = l1;
        localObject9 = localObject32;
        i9 = i60;
        long l20 = l3;
        localObject7 = localObject31;
        i7 = j;
        l4 = l20;
        break label174;
      }
      if ("targets".equals(str2))
        switch (k)
        {
        default:
          parambq.h();
          localObject5 = localObject1;
          int i53 = i;
          i5 = i2;
          i6 = i53;
          Object localObject29 = localObject2;
          int i54 = k;
          int i55 = m;
          l7 = l2;
          i10 = i54;
          i11 = i55;
          Object localObject30 = localObject3;
          int i56 = n;
          l5 = l1;
          localObject9 = localObject30;
          i9 = i56;
          long l19 = l3;
          localObject7 = localObject29;
          i7 = j;
          l4 = l19;
          break;
        case 1:
          ArrayList localArrayList3 = b(parambq);
          int i50 = i;
          i5 = i2;
          i6 = i50;
          int i51 = j;
          l4 = l3;
          localObject7 = localArrayList3;
          i7 = i51;
          localObject5 = localObject1;
          Object localObject28 = localObject3;
          int i52 = n;
          l5 = l1;
          localObject9 = localObject28;
          i9 = i52;
          long l18 = l2;
          i10 = k;
          i11 = m;
          l7 = l18;
          break;
        case 2:
          ArrayList localArrayList2 = a(parambq, null);
          int i47 = i;
          i5 = i2;
          i6 = i47;
          int i48 = j;
          l4 = l3;
          localObject7 = localArrayList2;
          i7 = i48;
          localObject5 = localObject1;
          Object localObject27 = localObject3;
          int i49 = n;
          l5 = l1;
          localObject9 = localObject27;
          i9 = i49;
          long l17 = l2;
          i10 = k;
          i11 = m;
          l7 = l17;
          break;
        case 3:
          ArrayList localArrayList1 = c(parambq, 0);
          int i44 = i;
          i5 = i2;
          i6 = i44;
          int i45 = j;
          l4 = l3;
          localObject7 = localArrayList1;
          i7 = i45;
          localObject5 = localObject1;
          Object localObject26 = localObject3;
          int i46 = n;
          l5 = l1;
          localObject9 = localObject26;
          i9 = i46;
          long l16 = l2;
          i10 = k;
          i11 = m;
          l7 = l16;
          break;
        }
      if ("target_objects".equals(str2))
        switch (i)
        {
        default:
          parambq.h();
          localObject5 = localObject1;
          int i40 = i;
          i5 = i2;
          i6 = i40;
          Object localObject24 = localObject2;
          int i41 = k;
          int i42 = m;
          l7 = l2;
          i10 = i41;
          i11 = i42;
          Object localObject25 = localObject3;
          int i43 = n;
          l5 = l1;
          localObject9 = localObject25;
          i9 = i43;
          long l15 = l3;
          localObject7 = localObject24;
          i7 = j;
          l4 = l15;
          break;
        case 2:
          localObject5 = a(parambq, null);
          int i36 = i;
          i5 = i2;
          i6 = i36;
          Object localObject22 = localObject2;
          int i37 = k;
          int i38 = m;
          l7 = l2;
          i10 = i37;
          i11 = i38;
          Object localObject23 = localObject3;
          int i39 = n;
          l5 = l1;
          localObject9 = localObject23;
          i9 = i39;
          long l14 = l3;
          localObject7 = localObject22;
          i7 = j;
          l4 = l14;
          break;
        case 3:
          localObject5 = c(parambq, 0);
          int i32 = i;
          i5 = i2;
          i6 = i32;
          Object localObject20 = localObject2;
          int i33 = k;
          int i34 = m;
          l7 = l2;
          i10 = i33;
          i11 = i34;
          Object localObject21 = localObject3;
          int i35 = n;
          l5 = l1;
          localObject9 = localObject21;
          i9 = i35;
          long l13 = l3;
          localObject7 = localObject20;
          i7 = j;
          l4 = l13;
          break;
        }
      parambq.h();
      localObject5 = localObject1;
      int i28 = i;
      i5 = i2;
      i6 = i28;
      Object localObject18 = localObject2;
      int i29 = k;
      int i30 = m;
      l7 = l2;
      i10 = i29;
      i11 = i30;
      Object localObject19 = localObject3;
      int i31 = n;
      l5 = l1;
      localObject9 = localObject19;
      i9 = i31;
      long l12 = l3;
      localObject7 = localObject18;
      i7 = j;
      l4 = l12;
      break label174;
      String str1 = parambq.m();
      if ("sources_size".equals(str1))
      {
        i1 = parambq.d();
        localObject5 = localObject1;
        int i24 = j;
        Object localObject16 = localObject2;
        l4 = l3;
        i7 = i24;
        localObject7 = localObject16;
        int i25 = m;
        Object localObject17 = localObject3;
        int i26 = n;
        l5 = l1;
        localObject9 = localObject17;
        i9 = i26;
        int i27 = i;
        i5 = i2;
        i6 = i27;
        long l11 = l2;
        i10 = k;
        i11 = i25;
        l7 = l11;
        break label174;
      }
      if ("targets_size".equals(str1))
      {
        int i20 = parambq.d();
        int i21 = i;
        i5 = i2;
        i6 = i21;
        int i22 = j;
        Object localObject14 = localObject2;
        l4 = l3;
        i7 = i22;
        localObject7 = localObject14;
        localObject5 = localObject1;
        Object localObject15 = localObject3;
        int i23 = n;
        l5 = l1;
        localObject9 = localObject15;
        i9 = i23;
        long l10 = l2;
        i10 = k;
        i11 = i20;
        l7 = l10;
        break label174;
      }
      if (!"target_objects_size".equals(str1))
        break;
      int i3 = parambq.d();
      int i4 = i;
      i5 = i2;
      i6 = i4;
      localObject5 = localObject1;
      Object localObject6 = localObject2;
      l4 = l3;
      localObject7 = localObject6;
      i7 = i3;
      Object localObject8 = localObject3;
      int i8 = n;
      l5 = l1;
      localObject9 = localObject8;
      i9 = i8;
      long l6 = l2;
      i10 = k;
      i11 = m;
      l7 = l6;
      break label174;
      if ((localObject3 == null) || (localObject2 == null))
        return null;
      return new ae(i2, l3, l2, l1, i1, n, localObject3, m, k, localObject2, j, i, localObject1);
      i65 = i;
      i66 = k;
      i67 = i2;
    }
  }

  private static an D(bq parambq)
  {
    int i = 0;
    cp localcp1 = parambq.p();
    double d1 = 0.0D;
    Object localObject1 = localcp1;
    Object localObject2 = null;
    if ((localObject1 != null) && (localObject1 != cp.b))
    {
      label72: Object localObject4;
      int j;
      double d2;
      switch (bm.a[localObject1.ordinal()])
      {
      case 5:
      case 6:
      default:
        localObject4 = localObject2;
        j = i;
        d2 = d1;
      case 7:
      case 8:
      case 4:
      }
      while (true)
      {
        cp localcp2 = parambq.g();
        Object localObject5 = localObject4;
        localObject1 = localcp2;
        int k = j;
        localObject2 = localObject5;
        d1 = d2;
        i = k;
        break;
        if (!"data".equals(parambq.m()))
          break label72;
        if (i == 1)
        {
          Object localObject9 = null;
          cp localcp3 = parambq.p();
          Object localObject10 = null;
          Object localObject11 = localcp3;
          if ((localObject11 != null) && (localObject11 != cp.b))
          {
            label200: Object localObject12;
            Object localObject13;
            switch (bm.a[localObject11.ordinal()])
            {
            case 2:
            case 3:
            default:
              localObject12 = localObject9;
              localObject13 = localObject10;
            case 4:
            case 1:
            }
            while (true)
            {
              cp localcp5 = parambq.g();
              localObject10 = localObject13;
              localObject9 = localObject12;
              localObject11 = localcp5;
              break;
              if (!"title".equals(parambq.m()))
                break label200;
              String str2 = parambq.j();
              Object localObject14 = localObject9;
              localObject13 = str2;
              localObject12 = localObject14;
              continue;
              if (!"articles".equals(parambq.m()))
                break label200;
              localObject12 = new ArrayList();
              for (cp localcp4 = parambq.p(); (localcp4 != null) && (localcp4 != cp.d); localcp4 = parambq.g())
                if (localcp4 == cp.a)
                {
                  ch localch = H(parambq);
                  if (localch != null)
                    ((ArrayList)localObject12).add(localch);
                }
              localObject13 = localObject10;
            }
          }
          localObject4 = new dp(localObject10, localObject9);
          j = i;
          d2 = d1;
        }
        else if (i == 4)
        {
          localObject4 = E(parambq);
          j = i;
          d2 = d1;
        }
        else if (i == 2)
        {
          localObject4 = F(parambq);
          j = i;
          d2 = d1;
        }
        else if (i == 5)
        {
          localObject4 = G(parambq);
          j = i;
          d2 = d1;
        }
        else
        {
          parambq.h();
          localObject4 = localObject2;
          j = i;
          d2 = d1;
          continue;
          if (!"score".equals(parambq.m()))
            break label72;
          double d3 = parambq.f();
          localObject4 = localObject2;
          j = i;
          d2 = d3;
          continue;
          if (!"type".equals(parambq.m()))
            break label72;
          String str1 = parambq.j();
          if ("news".equals(str1))
          {
            Object localObject8 = localObject2;
            j = 1;
            localObject4 = localObject8;
            d2 = d1;
          }
          else if ("tweet".equals(str1))
          {
            Object localObject7 = localObject2;
            j = 2;
            localObject4 = localObject7;
            d2 = d1;
          }
          else if ("topic".equals(str1))
          {
            Object localObject6 = localObject2;
            j = 4;
            localObject4 = localObject6;
            d2 = d1;
          }
          else
          {
            if (!"user".equals(str1))
              break label72;
            Object localObject3 = localObject2;
            j = 5;
            localObject4 = localObject3;
            d2 = d1;
          }
        }
      }
    }
    if (localObject2 == null)
      return null;
    return new an(i, d1, localObject2);
  }

  private static dp E(bq parambq)
  {
    Object localObject1 = parambq.g();
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    int i = 0;
    Object localObject5 = null;
    if ((localObject1 != null) && (localObject1 != cp.b))
    {
      switch (bm.a[localObject1.ordinal()])
      {
      case 3:
      case 5:
      case 6:
      default:
      case 4:
      case 1:
      case 2:
      case 7:
      }
      while (true)
      {
        label80: Object localObject6 = localObject2;
        int k = i;
        Object localObject7 = localObject5;
        Object localObject8 = localObject3;
        Object localObject9 = localObject4;
        while (true)
        {
          cp localcp = parambq.g();
          Object localObject10 = localObject6;
          localObject1 = localcp;
          localObject4 = localObject9;
          localObject3 = localObject8;
          localObject5 = localObject7;
          i = k;
          localObject2 = localObject10;
          break;
          String str1 = parambq.m();
          if ("query".equals(str1))
          {
            String str3 = parambq.j();
            localObject8 = localObject3;
            localObject9 = localObject4;
            Object localObject12 = localObject2;
            k = i;
            localObject7 = str3;
            localObject6 = localObject12;
          }
          else
          {
            if (!"name".equals(str1))
              break label80;
            String str2 = parambq.j();
            Object localObject11 = localObject2;
            k = i;
            localObject7 = localObject5;
            localObject8 = localObject3;
            localObject9 = str2;
            localObject6 = localObject11;
            continue;
            if (!"media".equals(parambq.m()))
              break label80;
            ArrayList localArrayList = I(parambq);
            localObject9 = localObject4;
            localObject6 = localObject2;
            k = i;
            localObject7 = localObject5;
            localObject8 = localArrayList;
            continue;
            if (!"tweet_count".equals(parambq.m()))
              break label80;
            int m = parambq.d();
            localObject7 = localObject5;
            localObject8 = localObject3;
            localObject9 = localObject4;
            localObject6 = localObject2;
            k = m;
            continue;
            if (!"tweet".equals(parambq.m()))
              break label341;
            localObject6 = b(parambq, null);
            k = i;
            localObject7 = localObject5;
            localObject8 = localObject3;
            localObject9 = localObject4;
          }
        }
        label341: parambq.h();
      }
    }
    t localt;
    if ((localObject3 != null) && (localObject2 != null) && (localObject2.n != null))
    {
      localt = (t)localObject3.get(0);
      if ((localt.b != null) && (!s.b(localt.b)))
      {
        if (localObject2.n.d == null)
          break label555;
        Iterator localIterator = localObject2.n.d.iterator();
        do
          if (!localIterator.hasNext())
            break;
        while (!((dy)localIterator.next()).g.equals(localt.b));
      }
    }
    label555: for (int j = 1; ; j = 0)
    {
      if (j == 0)
      {
        dy localdy = new dy();
        localdy.c = localt.a;
        localdy.g = localt.a;
        localdy.d = localt.a;
        localdy.h = 1;
        if (localObject2.n.d == null)
          localObject2.n.d = new ArrayList();
        localObject2.n.d.add(localdy);
      }
      return new dp(localObject5, localObject3, localObject2, i, localObject4);
    }
  }

  private static dp F(bq parambq)
  {
    Object localObject1 = parambq.p();
    Object localObject2 = null;
    z localz = null;
    Object localObject3;
    label59: dy localdy;
    String str;
    label247: t localt;
    if ((localObject1 != null) && (localObject1 != cp.b))
      switch (bm.a[localObject1.ordinal()])
      {
      default:
      case 7:
        p localp2;
        do
        {
          p localp1;
          do
          {
            do
            {
              localObject3 = localObject2;
              cp localcp = parambq.g();
              localObject2 = localObject3;
              localObject1 = localcp;
              break;
            }
            while (!"status".equals(parambq.m()));
            localp1 = b(parambq, null);
          }
          while (localp1 == null);
          localp2 = localp1.a();
          localz = new z(localp2.a, localp2.m.a, localp2.m.g, localp2.m.b, localp2.m.c, localp2.h, localp2.o, localp2.n);
        }
        while ((localp2.n == null) || (!localp2.n.b()));
        Iterator localIterator = localp2.n.d.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            localdy = (dy)localIterator.next();
            if (1 == localdy.h)
              if (localdy.g == null)
              {
                str = s.a(localdy.c);
                localt = new t(str, localdy.g, "photo", 0, 0);
                if (localObject2 != null)
                  break label349;
              }
          }
      case 1:
      }
    label349: for (Object localObject4 = new ArrayList(); ; localObject4 = localObject2)
    {
      ((ArrayList)localObject4).add(localt);
      localObject3 = localObject4;
      break label59;
      str = localdy.g;
      break label247;
      localObject3 = localObject2;
      break label59;
      if (!"media".equals(parambq.m()))
        break;
      parambq.h();
      break;
      if (localz == null)
        return null;
      return new dp(localz, localObject2);
    }
  }

  private static dp G(bq parambq)
  {
    Object localObject1 = parambq.p();
    Object localObject2 = null;
    label31: Object localObject5;
    if ((localObject1 != null) && (localObject1 != cp.b))
      if ("users".equals(parambq.m()))
        if ((localObject1 != null) && (localObject1 != cp.d))
        {
          if (localObject1 != cp.a)
            break label175;
          ad localad = a(parambq, System.currentTimeMillis());
          if (localObject2 != null)
            break label169;
          localObject5 = new ArrayList();
          label71: ((ArrayList)localObject5).add(new du(localad.a, localad.g, localad.b, localad.d, localad.c, localad.h, localad.i));
        }
    label169: label175: for (Object localObject4 = localObject5; ; localObject4 = localObject2)
    {
      cp localcp2 = parambq.g();
      localObject2 = localObject4;
      localObject1 = localcp2;
      break label31;
      Object localObject3 = localObject2;
      cp localcp1 = parambq.g();
      localObject2 = localObject3;
      localObject1 = localcp1;
      break;
      if (localObject2 == null)
        return null;
      return new dp(localObject2);
      localObject5 = localObject2;
      break label71;
    }
  }

  private static ch H(bq parambq)
  {
    Object localObject1 = null;
    cp localcp1 = parambq.p();
    Object localObject2 = null;
    Object localObject3 = localcp1;
    double d1 = 0.0D;
    Object localObject4 = null;
    Object localObject5 = null;
    String str1 = null;
    int i = 0;
    Object localObject6 = null;
    Object localObject7 = null;
    Object localObject8;
    Object localObject9;
    Object localObject10;
    int j;
    Object localObject11;
    Object localObject12;
    Object localObject13;
    double d3;
    label134: Object localObject17;
    Object localObject18;
    Object localObject19;
    label210: String str7;
    Object localObject21;
    Object localObject20;
    if ((localObject3 != null) && (localObject3 != cp.b))
      switch (bm.a[localObject3.ordinal()])
      {
      case 3:
      case 5:
      case 6:
      default:
      case 7:
        do
        {
          double d5 = d1;
          localObject8 = localObject6;
          localObject9 = localObject7;
          localObject10 = localObject5;
          j = i;
          localObject11 = localObject4;
          localObject12 = localObject2;
          localObject13 = localObject1;
          d3 = d5;
          cp localcp2 = parambq.g();
          localObject2 = localObject12;
          localObject5 = localObject10;
          localObject7 = localObject9;
          double d4 = d3;
          localObject1 = localObject13;
          localObject3 = localcp2;
          localObject4 = localObject11;
          i = j;
          localObject6 = localObject8;
          d1 = d4;
          break;
        }
        while (!"url".equals(parambq.m()));
        localObject17 = null;
        cp localcp3 = parambq.p();
        localObject18 = null;
        localObject19 = localcp3;
        if ((localObject19 != null) && (localObject19 != cp.b))
        {
          if (localObject19 != cp.g)
            break label838;
          str7 = parambq.m();
          if ("display_url".equals(str7))
          {
            String str8 = parambq.j();
            Object localObject22 = localObject17;
            localObject21 = str8;
            localObject20 = localObject22;
          }
        }
      case 1:
      case 4:
      case 2:
      case 8:
      }
    while (true)
    {
      cp localcp4 = parambq.g();
      localObject18 = localObject21;
      localObject17 = localObject20;
      localObject19 = localcp4;
      break label210;
      if ("expanded_url".equals(str7))
      {
        localObject20 = parambq.j();
        localObject21 = localObject18;
        continue;
        ah localah = new ah(localObject18, localObject17);
        j = i;
        localObject11 = localObject4;
        localObject13 = localObject1;
        double d10 = d1;
        localObject8 = localah;
        localObject9 = localObject7;
        d3 = d10;
        localObject10 = localObject5;
        localObject12 = localObject2;
        break label134;
        if (!"media".equals(parambq.m()))
          break;
        ArrayList localArrayList = I(parambq);
        double d9 = d1;
        localObject8 = localObject6;
        localObject9 = localObject7;
        localObject10 = localObject5;
        j = i;
        localObject11 = localObject4;
        localObject12 = localArrayList;
        localObject13 = localObject1;
        d3 = d9;
        break label134;
        String str2 = parambq.m();
        if ("title".equals(str2))
        {
          String str6 = parambq.j();
          double d8 = d1;
          localObject8 = localObject6;
          localObject9 = localObject7;
          localObject10 = localObject5;
          j = i;
          localObject11 = localObject4;
          localObject12 = localObject2;
          localObject13 = str6;
          d3 = d8;
          break label134;
        }
        if ("description".equals(str2))
        {
          String str5 = parambq.j();
          localObject10 = localObject5;
          localObject12 = localObject2;
          double d7 = d1;
          localObject8 = localObject6;
          localObject9 = str5;
          j = i;
          localObject11 = localObject4;
          localObject13 = localObject1;
          d3 = d7;
          break label134;
        }
        if ("attribution".equals(str2))
        {
          str1 = parambq.j();
          int i1 = i;
          localObject11 = localObject4;
          localObject13 = localObject1;
          d3 = d1;
          localObject8 = localObject6;
          localObject9 = localObject7;
          j = i1;
          localObject10 = localObject5;
          localObject12 = localObject2;
          break label134;
        }
        if ("query".equals(str2))
        {
          String str4 = parambq.j();
          localObject13 = localObject1;
          int n = i;
          localObject11 = str4;
          d3 = d1;
          localObject8 = localObject6;
          localObject9 = localObject7;
          j = n;
          localObject10 = localObject5;
          localObject12 = localObject2;
          break label134;
        }
        if (!"name".equals(str2))
          break;
        String str3 = parambq.j();
        localObject12 = localObject2;
        int m = i;
        localObject11 = localObject4;
        localObject13 = localObject1;
        Object localObject15 = localObject6;
        j = m;
        Object localObject16 = localObject7;
        localObject10 = str3;
        d3 = d1;
        localObject9 = localObject16;
        localObject8 = localObject15;
        break label134;
        if (!"tweet_count".equals(parambq.m()))
          break;
        int k = parambq.d();
        localObject11 = localObject4;
        localObject13 = localObject1;
        Object localObject14 = localObject5;
        localObject12 = localObject2;
        double d6 = d1;
        localObject8 = localObject6;
        localObject9 = localObject7;
        j = k;
        localObject10 = localObject14;
        d3 = d6;
        break label134;
        if (!"score".equals(parambq.m()))
          break;
        double d2 = parambq.f();
        localObject8 = localObject6;
        localObject9 = localObject7;
        localObject10 = localObject5;
        j = i;
        localObject11 = localObject4;
        localObject12 = localObject2;
        localObject13 = localObject1;
        d3 = d2;
        break label134;
        return new ch(localObject1, localObject6, localObject7, i, str1, d1, localObject4, localObject5, localObject2);
      }
      label838: localObject20 = localObject17;
      localObject21 = localObject18;
    }
  }

  private static ArrayList I(bq parambq)
  {
    ArrayList localArrayList = new ArrayList();
    for (cp localcp = parambq.p(); (localcp != null) && (localcp != cp.d); localcp = parambq.g())
      if (localcp == cp.a)
      {
        t localt = J(parambq);
        if (localt != null)
          localArrayList.add(localt);
      }
    return localArrayList;
  }

  private static t J(bq parambq)
  {
    Object localObject1 = null;
    Object localObject2 = parambq.g();
    Object localObject3 = null;
    Object localObject4 = null;
    if ((localObject2 != null) && (localObject2 != cp.b))
    {
      switch (bm.a[localObject2.ordinal()])
      {
      case 5:
      case 6:
      default:
      case 4:
      case 7:
      }
      label305: 
      while (true)
      {
        label60: Object localObject6 = localObject3;
        Object localObject7 = localObject4;
        Object localObject8 = localObject1;
        Object localObject9 = localObject7;
        while (true)
        {
          cp localcp3 = parambq.g();
          localObject3 = localObject6;
          localObject2 = localcp3;
          Object localObject10 = localObject9;
          localObject1 = localObject8;
          localObject4 = localObject10;
          break;
          String str1 = parambq.m();
          if ("type".equals(str1))
          {
            localObject6 = parambq.j();
            Object localObject11 = localObject4;
            localObject8 = localObject1;
            localObject9 = localObject11;
          }
          else
          {
            if (!"media_url".equals(str1))
              break label60;
            String str2 = parambq.j();
            localObject8 = localObject1;
            localObject9 = str2;
            localObject6 = localObject3;
          }
        }
        if ("sizes".equals(parambq.m()))
        {
          label180: Object localObject5 = localObject1;
          cp localcp1 = parambq.g();
          cp localcp5;
          if (localcp1 == cp.a)
            if ("large".equals(parambq.m()))
            {
              cp localcp4;
              do
              {
                localcp4 = parambq.g();
                if ((localcp4 == cp.g) && ("url".equals(parambq.m())) && (parambq.j() != null))
                  localObject5 = parambq.j();
              }
              while ((localcp4 != null) && (localcp4 != cp.b));
              localcp5 = parambq.g();
              localObject1 = localObject5;
            }
          for (cp localcp2 = localcp5; ; localcp2 = localcp1)
          {
            if (localcp2 == null)
              break label305;
            if (localcp2 != cp.b)
              break label180;
            break;
            parambq.h();
            localObject1 = localObject5;
          }
        }
      }
    }
    if (localObject1 == null)
      localObject1 = localObject4;
    return new t(localObject1, localObject4, localObject3, 0, 0);
  }

  private static String K(bq parambq)
  {
    cp localcp = parambq.g();
    if ((localcp != null) && (localcp != cp.b))
    {
      switch (bm.a[localcp.ordinal()])
      {
      default:
      case 4:
      case 1:
      case 7:
      }
      while (true)
      {
        localcp = parambq.g();
        break;
        if ("suggestion".equals(parambq.m()))
        {
          return parambq.j();
          parambq.h();
        }
      }
    }
    return null;
  }

  public static ad a(bq parambq, long paramLong)
  {
    cp localcp1 = parambq.g();
    int i = 0;
    Object localObject1 = null;
    boolean bool1 = false;
    int j = 0;
    boolean bool2 = false;
    int k = 0;
    Object localObject2 = null;
    Object localObject3 = localcp1;
    Object localObject4 = null;
    int m = 0;
    boolean bool3 = false;
    long l1 = 0L;
    Object localObject5 = null;
    int n = 0;
    int i1 = 0;
    Object localObject6 = null;
    Object localObject7 = null;
    long l2 = -1L;
    Object localObject8 = null;
    Object localObject9 = null;
    if (localObject3 != null)
    {
      cp localcp2 = cp.b;
      if (localObject3 != localcp2)
      {
        label132: int i2;
        Object localObject11;
        Object localObject10;
        long l3;
        long l4;
        Object localObject12;
        Object localObject13;
        boolean bool5;
        boolean bool6;
        int i3;
        Object localObject14;
        int i4;
        int i6;
        Object localObject15;
        Object localObject16;
        Object localObject17;
        boolean bool7;
        int i7;
        int i8;
        switch (bm.a[localObject3.ordinal()])
        {
        default:
          i2 = k;
          localObject11 = localObject2;
          localObject10 = localObject4;
          boolean bool11 = bool1;
          l3 = l2;
          l4 = l1;
          localObject12 = localObject6;
          localObject13 = localObject9;
          bool5 = bool11;
          bool6 = bool2;
          i3 = n;
          localObject14 = localObject5;
          i4 = i;
          int i13 = i1;
          i6 = j;
          localObject15 = localObject8;
          localObject16 = localObject1;
          localObject17 = localObject7;
          bool7 = bool3;
          i7 = m;
          i8 = i13;
        case 4:
        case 2:
        case 5:
        case 6:
        case 7:
        case 3:
        }
        while (true)
        {
          cp localcp3 = parambq.g();
          i = i4;
          localObject5 = localObject14;
          n = i3;
          bool2 = bool6;
          localObject6 = localObject12;
          Object localObject18 = localObject16;
          localObject8 = localObject15;
          j = i6;
          i1 = i8;
          m = i7;
          bool3 = bool7;
          localObject7 = localObject17;
          localObject1 = localObject18;
          int i9 = i2;
          localObject3 = localcp3;
          localObject4 = localObject10;
          localObject2 = localObject11;
          Object localObject19 = localObject13;
          l1 = l4;
          l2 = l3;
          k = i9;
          bool1 = bool5;
          localObject9 = localObject19;
          break;
          String str5 = parambq.m();
          if ("name".equals(str5))
          {
            String str12 = parambq.j();
            localObject16 = localObject1;
            localObject11 = localObject2;
            localObject17 = localObject7;
            localObject10 = localObject4;
            bool7 = bool3;
            i7 = m;
            i8 = i1;
            i6 = j;
            localObject15 = str12;
            i2 = k;
            int i36 = n;
            localObject14 = localObject5;
            i4 = i;
            Object localObject47 = localObject6;
            bool6 = bool2;
            i3 = i36;
            Object localObject48 = localObject9;
            bool5 = bool1;
            l3 = l2;
            l4 = l1;
            localObject13 = localObject48;
            localObject12 = localObject47;
          }
          else if ("screen_name".equals(str5))
          {
            String str11 = parambq.j();
            bool5 = bool1;
            localObject11 = localObject2;
            localObject10 = localObject4;
            int i34 = k;
            l3 = l2;
            l4 = l1;
            localObject12 = localObject6;
            localObject13 = str11;
            i2 = i34;
            bool6 = bool2;
            i3 = n;
            localObject14 = localObject5;
            i4 = i;
            int i35 = i1;
            i6 = j;
            localObject15 = localObject8;
            localObject16 = localObject1;
            localObject17 = localObject7;
            bool7 = bool3;
            i7 = m;
            i8 = i35;
          }
          else if ("profile_image_url".equals(str5))
          {
            String str10 = parambq.j();
            bool6 = bool2;
            localObject11 = localObject2;
            i3 = n;
            localObject10 = localObject4;
            localObject14 = localObject5;
            i4 = i;
            int i33 = k;
            boolean bool28 = bool3;
            i7 = m;
            i8 = i1;
            i6 = j;
            localObject15 = localObject8;
            localObject16 = localObject1;
            localObject17 = localObject7;
            bool7 = bool28;
            i2 = i33;
            Object localObject46 = localObject9;
            bool5 = bool1;
            l3 = l2;
            l4 = l1;
            localObject13 = localObject46;
            localObject12 = str10;
          }
          else if ("description".equals(str5))
          {
            String str9 = parambq.j();
            bool7 = bool3;
            localObject11 = localObject2;
            i7 = m;
            localObject10 = localObject4;
            i8 = i1;
            i6 = j;
            localObject15 = localObject8;
            localObject16 = localObject1;
            localObject17 = str9;
            i2 = k;
            int i32 = n;
            localObject14 = localObject5;
            i4 = i;
            boolean bool27 = bool2;
            i3 = i32;
            Object localObject44 = localObject6;
            bool6 = bool27;
            Object localObject45 = localObject9;
            bool5 = bool1;
            l3 = l2;
            l4 = l1;
            localObject13 = localObject45;
            localObject12 = localObject44;
          }
          else if ("url".equals(str5))
          {
            String str8 = parambq.j();
            i4 = i;
            localObject11 = localObject2;
            localObject10 = localObject4;
            boolean bool25 = bool1;
            boolean bool26 = bool2;
            i3 = n;
            localObject14 = str8;
            i2 = k;
            l3 = l2;
            l4 = l1;
            localObject12 = localObject6;
            localObject13 = localObject9;
            bool6 = bool26;
            bool5 = bool25;
            int i31 = i1;
            i6 = j;
            localObject15 = localObject8;
            localObject16 = localObject1;
            localObject17 = localObject7;
            bool7 = bool3;
            i7 = m;
            i8 = i31;
          }
          else if ("location".equals(str5))
          {
            String str7 = parambq.j();
            localObject17 = localObject7;
            localObject11 = localObject2;
            bool7 = bool3;
            localObject10 = localObject4;
            i7 = m;
            i8 = i1;
            i6 = j;
            localObject15 = localObject8;
            localObject16 = str7;
            i2 = k;
            int i30 = n;
            localObject14 = localObject5;
            i4 = i;
            Object localObject42 = localObject6;
            bool6 = bool2;
            i3 = i30;
            Object localObject43 = localObject9;
            bool5 = bool1;
            l3 = l2;
            l4 = l1;
            localObject13 = localObject43;
            localObject12 = localObject42;
          }
          else
          {
            String str6;
            if ("created_at".equals(str5))
            {
              str6 = parambq.j();
              try
              {
                long l7 = Long.parseLong(str6);
                i2 = k;
                localObject11 = localObject2;
                localObject10 = localObject4;
                boolean bool24 = bool1;
                l3 = l2;
                l4 = l7;
                localObject12 = localObject6;
                localObject13 = localObject9;
                bool5 = bool24;
                bool6 = bool2;
                i3 = n;
                localObject14 = localObject5;
                i4 = i;
                int i29 = i1;
                i6 = j;
                localObject15 = localObject8;
                localObject16 = localObject1;
                localObject17 = localObject7;
                bool7 = bool3;
                i7 = m;
                i8 = i29;
              }
              catch (NumberFormatException localNumberFormatException2)
              {
                long l6 = cr.a(cr.a, str6);
                i2 = k;
                localObject11 = localObject2;
                localObject10 = localObject4;
                boolean bool23 = bool1;
                l3 = l2;
                l4 = l6;
                localObject12 = localObject6;
                localObject13 = localObject9;
                bool5 = bool23;
                bool6 = bool2;
                i3 = n;
                localObject14 = localObject5;
                i4 = i;
                int i28 = i1;
                i6 = j;
                localObject15 = localObject8;
                localObject16 = localObject1;
                localObject17 = localObject7;
                bool7 = bool3;
                i7 = m;
                i8 = i28;
              }
            }
            else
            {
              if (!"profile_background_color".equals(str5))
                break label132;
              try
              {
                int i25 = Integer.parseInt(parambq.j(), 16);
                int i26 = 0xFF000000 | i25;
                i6 = j;
                localObject11 = localObject2;
                localObject15 = localObject8;
                localObject10 = localObject4;
                localObject16 = localObject1;
                localObject17 = localObject7;
                bool7 = bool3;
                i7 = m;
                i8 = i26;
                i2 = k;
                int i27 = n;
                localObject14 = localObject5;
                i4 = i;
                Object localObject40 = localObject6;
                bool6 = bool2;
                i3 = i27;
                Object localObject41 = localObject9;
                bool5 = bool1;
                l3 = l2;
                l4 = l1;
                localObject13 = localObject41;
                localObject12 = localObject40;
              }
              catch (NumberFormatException localNumberFormatException1)
              {
                i2 = k;
                localObject11 = localObject2;
                localObject10 = localObject4;
                boolean bool22 = bool1;
                l3 = l2;
                l4 = l1;
                localObject12 = localObject6;
                localObject13 = localObject9;
                bool5 = bool22;
                bool6 = bool2;
                i3 = n;
                localObject14 = localObject5;
                i4 = i;
                int i24 = i1;
                i6 = j;
                localObject15 = localObject8;
                localObject16 = localObject1;
                localObject17 = localObject7;
                bool7 = bool3;
                i7 = m;
                i8 = i24;
              }
              continue;
              String str4 = parambq.m();
              if ("id".equals(str4))
              {
                long l5 = parambq.e();
                localObject11 = localObject2;
                localObject10 = localObject4;
                Object localObject37 = localObject1;
                localObject17 = localObject7;
                bool7 = bool3;
                i7 = m;
                i8 = i1;
                i6 = j;
                localObject15 = localObject8;
                localObject16 = localObject37;
                boolean bool20 = bool2;
                i3 = n;
                localObject14 = localObject5;
                i4 = i;
                boolean bool21 = bool1;
                Object localObject38 = localObject6;
                bool6 = bool20;
                Object localObject39 = localObject9;
                bool5 = bool21;
                l4 = l1;
                i2 = k;
                localObject13 = localObject39;
                l3 = l5;
                localObject12 = localObject38;
              }
              else if ("followers_count".equals(str4))
              {
                int i23 = parambq.d();
                localObject14 = localObject5;
                localObject11 = localObject2;
                i4 = i;
                localObject10 = localObject4;
                boolean bool18 = bool2;
                i3 = i23;
                i2 = k;
                boolean bool19 = bool3;
                i7 = m;
                i8 = i1;
                i6 = j;
                localObject15 = localObject8;
                localObject16 = localObject1;
                localObject17 = localObject7;
                bool7 = bool19;
                Object localObject35 = localObject6;
                bool6 = bool18;
                Object localObject36 = localObject9;
                bool5 = bool1;
                l3 = l2;
                l4 = l1;
                localObject13 = localObject36;
                localObject12 = localObject35;
              }
              else if ("friends_count".equals(str4))
              {
                int i21 = parambq.d();
                i8 = i1;
                localObject11 = localObject2;
                i6 = j;
                localObject10 = localObject4;
                localObject15 = localObject8;
                localObject16 = localObject1;
                localObject17 = localObject7;
                bool7 = bool3;
                i7 = i21;
                i2 = k;
                int i22 = n;
                localObject14 = localObject5;
                i4 = i;
                Object localObject33 = localObject6;
                bool6 = bool2;
                i3 = i22;
                Object localObject34 = localObject9;
                bool5 = bool1;
                l3 = l2;
                l4 = l1;
                localObject13 = localObject34;
                localObject12 = localObject33;
              }
              else if ("statuses_count".equals(str4))
              {
                int i19 = parambq.d();
                localObject15 = localObject8;
                localObject11 = localObject2;
                localObject16 = localObject1;
                localObject10 = localObject4;
                localObject17 = localObject7;
                bool7 = bool3;
                i7 = m;
                i8 = i1;
                i6 = i19;
                i2 = k;
                int i20 = n;
                localObject14 = localObject5;
                i4 = i;
                boolean bool17 = bool2;
                i3 = i20;
                Object localObject31 = localObject6;
                bool6 = bool17;
                Object localObject32 = localObject9;
                bool5 = bool1;
                l3 = l2;
                l4 = l1;
                localObject13 = localObject32;
                localObject12 = localObject31;
              }
              else
              {
                if (!"favourites_count".equals(str4))
                  break label132;
                int i18 = parambq.d();
                localObject11 = localObject2;
                localObject10 = localObject4;
                Object localObject28 = localObject1;
                localObject17 = localObject7;
                bool7 = bool3;
                i7 = m;
                i8 = i1;
                i6 = j;
                localObject15 = localObject8;
                localObject16 = localObject28;
                boolean bool16 = bool2;
                i3 = n;
                localObject14 = localObject5;
                i4 = i18;
                i2 = k;
                Object localObject29 = localObject6;
                bool6 = bool16;
                Object localObject30 = localObject9;
                bool5 = bool1;
                l3 = l2;
                l4 = l1;
                localObject12 = localObject29;
                localObject13 = localObject30;
                continue;
                String str3 = parambq.m();
                if ("protected".equals(str3))
                {
                  i7 = m;
                  localObject11 = localObject2;
                  i8 = i1;
                  localObject10 = localObject4;
                  i6 = j;
                  localObject15 = localObject8;
                  localObject16 = localObject1;
                  localObject17 = localObject7;
                  i2 = k;
                  int i17 = n;
                  localObject14 = localObject5;
                  i4 = i;
                  Object localObject26 = localObject6;
                  bool6 = bool2;
                  i3 = i17;
                  Object localObject27 = localObject9;
                  bool5 = bool1;
                  l3 = l2;
                  l4 = l1;
                  localObject13 = localObject27;
                  localObject12 = localObject26;
                  bool7 = false;
                }
                else
                {
                  if (!"geo_enabled".equals(str3))
                    break label132;
                  localObject11 = localObject2;
                  localObject10 = localObject4;
                  Object localObject25 = localObject1;
                  localObject17 = localObject7;
                  bool7 = bool3;
                  i7 = m;
                  i8 = i1;
                  i6 = j;
                  localObject15 = localObject8;
                  localObject16 = localObject25;
                  boolean bool15 = bool2;
                  i3 = n;
                  localObject14 = localObject5;
                  i4 = i;
                  i2 = k;
                  l3 = l2;
                  l4 = l1;
                  localObject12 = localObject6;
                  localObject13 = localObject9;
                  bool6 = bool15;
                  bool5 = false;
                  continue;
                  String str2 = parambq.m();
                  if ("protected".equals(str2))
                  {
                    i7 = m;
                    localObject11 = localObject2;
                    i8 = i1;
                    localObject10 = localObject4;
                    i6 = j;
                    localObject15 = localObject8;
                    localObject16 = localObject1;
                    localObject17 = localObject7;
                    bool7 = true;
                    i2 = k;
                    int i16 = n;
                    localObject14 = localObject5;
                    i4 = i;
                    Object localObject23 = localObject6;
                    bool6 = bool2;
                    i3 = i16;
                    Object localObject24 = localObject9;
                    bool5 = bool1;
                    l3 = l2;
                    l4 = l1;
                    localObject13 = localObject24;
                    localObject12 = localObject23;
                  }
                  else if ("verified".equals(str2))
                  {
                    i3 = n;
                    localObject11 = localObject2;
                    localObject14 = localObject5;
                    localObject10 = localObject4;
                    i4 = i;
                    boolean bool14 = bool3;
                    i7 = m;
                    i8 = i1;
                    i6 = j;
                    localObject15 = localObject8;
                    localObject16 = localObject1;
                    localObject17 = localObject7;
                    bool7 = bool14;
                    int i15 = k;
                    Object localObject21 = localObject6;
                    bool6 = true;
                    i2 = i15;
                    Object localObject22 = localObject9;
                    bool5 = bool1;
                    l3 = l2;
                    l4 = l1;
                    localObject13 = localObject22;
                    localObject12 = localObject21;
                  }
                  else if ("geo_enabled".equals(str2))
                  {
                    localObject11 = localObject2;
                    localObject10 = localObject4;
                    Object localObject20 = localObject1;
                    localObject17 = localObject7;
                    bool7 = bool3;
                    i7 = m;
                    i8 = i1;
                    i6 = j;
                    localObject15 = localObject8;
                    localObject16 = localObject20;
                    boolean bool13 = bool2;
                    i3 = n;
                    localObject14 = localObject5;
                    i4 = i;
                    i2 = k;
                    l3 = l2;
                    l4 = l1;
                    localObject12 = localObject6;
                    localObject13 = localObject9;
                    bool6 = bool13;
                    bool5 = true;
                  }
                  else if ("following".equals(str2))
                  {
                    i2 = k | 0x1;
                    localObject11 = localObject2;
                    localObject10 = localObject4;
                    boolean bool12 = bool1;
                    l3 = l2;
                    l4 = l1;
                    localObject12 = localObject6;
                    localObject13 = localObject9;
                    bool5 = bool12;
                    bool6 = bool2;
                    i3 = n;
                    localObject14 = localObject5;
                    i4 = i;
                    int i14 = i1;
                    i6 = j;
                    localObject15 = localObject8;
                    localObject16 = localObject1;
                    localObject17 = localObject7;
                    bool7 = bool3;
                    i7 = m;
                    i8 = i14;
                  }
                  else
                  {
                    if (!"followed_by".equals(str2))
                      break label132;
                    i2 = k | 0x2;
                    localObject11 = localObject2;
                    localObject10 = localObject4;
                    boolean bool10 = bool1;
                    l3 = l2;
                    l4 = l1;
                    localObject12 = localObject6;
                    localObject13 = localObject9;
                    bool5 = bool10;
                    bool6 = bool2;
                    i3 = n;
                    localObject14 = localObject5;
                    i4 = i;
                    int i12 = i1;
                    i6 = j;
                    localObject15 = localObject8;
                    localObject16 = localObject1;
                    localObject17 = localObject7;
                    bool7 = bool3;
                    i7 = m;
                    i8 = i12;
                    continue;
                    if ("status".equals(localObject2))
                    {
                      p localp = b(parambq, null);
                      localObject11 = localObject2;
                      localObject10 = localp;
                      i2 = k;
                      boolean bool9 = bool1;
                      l3 = l2;
                      l4 = l1;
                      localObject12 = localObject6;
                      localObject13 = localObject9;
                      bool5 = bool9;
                      bool6 = bool2;
                      i3 = n;
                      localObject14 = localObject5;
                      i4 = i;
                      int i11 = i1;
                      i6 = j;
                      localObject15 = localObject8;
                      localObject16 = localObject1;
                      localObject17 = localObject7;
                      bool7 = bool3;
                      i7 = m;
                      i8 = i11;
                    }
                    else
                    {
                      parambq.h();
                      i2 = k;
                      localObject11 = localObject2;
                      localObject10 = localObject4;
                      boolean bool8 = bool1;
                      l3 = l2;
                      l4 = l1;
                      localObject12 = localObject6;
                      localObject13 = localObject9;
                      bool5 = bool8;
                      bool6 = bool2;
                      i3 = n;
                      localObject14 = localObject5;
                      i4 = i;
                      int i10 = i1;
                      i6 = j;
                      localObject15 = localObject8;
                      localObject16 = localObject1;
                      localObject17 = localObject7;
                      bool7 = bool3;
                      i7 = m;
                      i8 = i10;
                      continue;
                      String str1 = parambq.j();
                      localObject10 = localObject4;
                      localObject11 = str1;
                      i2 = k;
                      boolean bool4 = bool1;
                      l3 = l2;
                      l4 = l1;
                      localObject12 = localObject6;
                      localObject13 = localObject9;
                      bool5 = bool4;
                      bool6 = bool2;
                      i3 = n;
                      localObject14 = localObject5;
                      i4 = i;
                      int i5 = i1;
                      i6 = j;
                      localObject15 = localObject8;
                      localObject16 = localObject1;
                      localObject17 = localObject7;
                      bool7 = bool3;
                      i7 = m;
                      i8 = i5;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return new ad(l2, localObject8, localObject9, localObject6, a(localObject7, null), n, localObject5, i1, bool3, bool2, localObject1, m, l1, j, bool1, k, 0L, localObject4, paramLong, i);
  }

  public static dw a(bq parambq)
  {
    Object localObject1 = parambq.p();
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    if ((localObject1 != null) && (localObject1 != cp.b))
    {
      label56: Object localObject5;
      Object localObject6;
      switch (bm.a[localObject1.ordinal()])
      {
      default:
        localObject5 = localObject2;
        localObject6 = localObject3;
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        cp localcp = parambq.g();
        localObject3 = localObject6;
        localObject2 = localObject5;
        localObject1 = localcp;
        break;
        if ("users".equals(localObject4))
        {
          localObject5 = b(parambq);
          localObject6 = localObject3;
        }
        else
        {
          while ((localObject1 != null) && (localObject1 != cp.d))
            localObject1 = parambq.g();
          if (!"next_cursor".equals(parambq.m()))
            break label56;
          String str = parambq.j();
          Object localObject7 = localObject2;
          localObject6 = str;
          localObject5 = localObject7;
          continue;
          localObject4 = parambq.j();
          localObject5 = localObject2;
          localObject6 = localObject3;
        }
      }
    }
    if (localObject2 == null)
      return null;
    return new dw(localObject3, localObject2);
  }

  public static dw a(bq parambq, int paramInt)
  {
    Object localObject1 = parambq.p();
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    if ((localObject1 != null) && (localObject1 != cp.b))
    {
      label60: Object localObject5;
      Object localObject6;
      switch (bm.a[localObject1.ordinal()])
      {
      default:
        localObject5 = localObject2;
        localObject6 = localObject3;
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        cp localcp = parambq.g();
        localObject3 = localObject6;
        localObject2 = localObject5;
        localObject1 = localcp;
        break;
        if ("lists".equals(localObject4))
        {
          localObject5 = c(parambq, paramInt);
          localObject6 = localObject3;
        }
        else
        {
          while ((localObject1 != null) && (localObject1 != cp.d))
            localObject1 = parambq.g();
          if (!"next_cursor".equals(parambq.m()))
            break label60;
          String str = parambq.j();
          Object localObject7 = localObject2;
          localObject6 = str;
          localObject5 = localObject7;
          continue;
          localObject4 = parambq.j();
          localObject5 = localObject2;
          localObject6 = localObject3;
        }
      }
    }
    if (localObject2 == null)
      return null;
    return new dw(localObject3, localObject2);
  }

  // ERROR //
  public static String a(ad paramad)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 516	java/io/StringWriter
    //   5: dup
    //   6: sipush 512
    //   9: invokespecial 519	java/io/StringWriter:<init>	(I)V
    //   12: astore_2
    //   13: getstatic 23	do:a	Lef;
    //   16: aload_2
    //   17: invokevirtual 522	ef:a	(Ljava/io/Writer;)Law;
    //   20: astore 7
    //   22: aload 7
    //   24: astore_1
    //   25: aload_1
    //   26: invokevirtual 526	aw:c	()V
    //   29: aload_1
    //   30: ldc 106
    //   32: aload_0
    //   33: getfield 374	ad:a	J
    //   36: invokevirtual 529	aw:a	(Ljava/lang/String;J)V
    //   39: aload_1
    //   40: ldc_w 464
    //   43: aload_0
    //   44: getfield 375	ad:g	Ljava/lang/String;
    //   47: invokevirtual 531	aw:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   50: aload_0
    //   51: getfield 376	ad:b	Ljava/lang/String;
    //   54: ifnull +14 -> 68
    //   57: aload_1
    //   58: ldc_w 296
    //   61: aload_0
    //   62: getfield 376	ad:b	Ljava/lang/String;
    //   65: invokevirtual 531	aw:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   68: aload_0
    //   69: getfield 377	ad:c	Ljava/lang/String;
    //   72: ifnull +14 -> 86
    //   75: aload_1
    //   76: ldc_w 466
    //   79: aload_0
    //   80: getfield 377	ad:c	Ljava/lang/String;
    //   83: invokevirtual 531	aw:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   86: aload_0
    //   87: getfield 412	ad:d	Ljava/lang/String;
    //   90: ifnull +14 -> 104
    //   93: aload_1
    //   94: ldc_w 438
    //   97: aload_0
    //   98: getfield 412	ad:d	Ljava/lang/String;
    //   101: invokevirtual 531	aw:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   104: aload_0
    //   105: getfield 533	ad:e	Ljava/lang/String;
    //   108: ifnull +14 -> 122
    //   111: aload_1
    //   112: ldc_w 425
    //   115: aload_0
    //   116: getfield 533	ad:e	Ljava/lang/String;
    //   119: invokevirtual 531	aw:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   122: aload_0
    //   123: getfield 535	ad:j	Ljava/lang/String;
    //   126: ifnull +14 -> 140
    //   129: aload_1
    //   130: ldc_w 468
    //   133: aload_0
    //   134: getfield 535	ad:j	Ljava/lang/String;
    //   137: invokevirtual 531	aw:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   140: aload_0
    //   141: getfield 537	ad:m	J
    //   144: lconst_0
    //   145: lcmp
    //   146: ifeq +16 -> 162
    //   149: aload_1
    //   150: ldc 194
    //   152: aload_0
    //   153: getfield 537	ad:m	J
    //   156: invokestatic 540	java/lang/Long:toString	(J)Ljava/lang/String;
    //   159: invokevirtual 531	aw:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   162: aload_1
    //   163: ldc_w 482
    //   166: aload_0
    //   167: getfield 543	ad:l	I
    //   170: invokevirtual 546	aw:a	(Ljava/lang/String;I)V
    //   173: aload_1
    //   174: ldc_w 480
    //   177: aload_0
    //   178: getfield 549	ad:k	I
    //   181: invokevirtual 546	aw:a	(Ljava/lang/String;I)V
    //   184: aload_1
    //   185: ldc_w 484
    //   188: aload_0
    //   189: getfield 551	ad:n	I
    //   192: invokevirtual 546	aw:a	(Ljava/lang/String;I)V
    //   195: aload_1
    //   196: ldc_w 490
    //   199: aload_0
    //   200: getfield 553	ad:p	Z
    //   203: invokevirtual 556	aw:a	(Ljava/lang/String;Z)V
    //   206: aload_1
    //   207: ldc_w 488
    //   210: aload_0
    //   211: getfield 415	ad:h	Z
    //   214: invokevirtual 556	aw:a	(Ljava/lang/String;Z)V
    //   217: aload_1
    //   218: invokevirtual 558	aw:d	()V
    //   221: aload_1
    //   222: invokevirtual 560	aw:e	()V
    //   225: aload_2
    //   226: invokevirtual 564	java/io/StringWriter:getBuffer	()Ljava/lang/StringBuffer;
    //   229: invokevirtual 567	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   232: astore 9
    //   234: aload_1
    //   235: invokestatic 570	cr:a	(Ljava/io/Closeable;)V
    //   238: aload 9
    //   240: areturn
    //   241: astore 6
    //   243: aload_1
    //   244: invokestatic 570	cr:a	(Ljava/io/Closeable;)V
    //   247: ldc_w 572
    //   250: areturn
    //   251: astore_3
    //   252: aconst_null
    //   253: astore 4
    //   255: aload_3
    //   256: astore 5
    //   258: aload 4
    //   260: invokestatic 570	cr:a	(Ljava/io/Closeable;)V
    //   263: aload 5
    //   265: athrow
    //   266: astore 8
    //   268: aload_1
    //   269: astore 4
    //   271: aload 8
    //   273: astore 5
    //   275: goto -17 -> 258
    //
    // Exception table:
    //   from	to	target	type
    //   2	22	241	java/io/IOException
    //   25	68	241	java/io/IOException
    //   68	86	241	java/io/IOException
    //   86	104	241	java/io/IOException
    //   104	122	241	java/io/IOException
    //   122	140	241	java/io/IOException
    //   140	162	241	java/io/IOException
    //   162	234	241	java/io/IOException
    //   2	22	251	finally
    //   25	68	266	finally
    //   68	86	266	finally
    //   86	104	266	finally
    //   104	122	266	finally
    //   122	140	266	finally
    //   140	162	266	finally
    //   162	234	266	finally
  }

  private static String a(String paramString, be parambe)
  {
    if (paramString == null)
      return null;
    dx localdx = f.a.a(paramString);
    if (parambe != null)
    {
      StringBuilder localStringBuilder = new StringBuilder(localdx.a);
      parambe.a(localdx.b);
      Matcher localMatcher = ag.d.matcher(localStringBuilder);
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      while (localMatcher.find())
      {
        int j = localMatcher.start() - i;
        int k = localMatcher.end() - i;
        i += k - j - 1;
        localStringBuilder.replace(j, k, " ");
        int[] arrayOfInt = new int[2];
        arrayOfInt[0] = j;
        arrayOfInt[1] = (k - 1);
        localArrayList.add(arrayOfInt);
      }
      parambe.a(localArrayList);
      return localStringBuilder.toString();
    }
    return localdx.a.replaceAll("((\\s\\s+)|\\n|\\r)", " ");
  }

  public static ArrayList a(bq parambq, ad paramad)
  {
    ArrayList localArrayList = new ArrayList();
    if (parambq != null)
      for (cp localcp = parambq.p(); (localcp != null) && (localcp != cp.d); localcp = parambq.g())
        if (localcp == cp.a)
          localArrayList.add(b(parambq, paramad));
    return localArrayList;
  }

  public static ArrayList a(String paramString)
  {
    if (paramString == null)
      return null;
    try
    {
      bq localbq = a.a(paramString);
      localbq.g();
      ArrayList localArrayList = new ArrayList();
      cp localcp;
      for (Object localObject = localbq.g(); (localObject != null) && (localObject != cp.d); localObject = localcp)
      {
        if (localObject == cp.c)
        {
          Pair localPair = B(localbq);
          if (localPair != null)
            localArrayList.add(localPair);
        }
        localcp = localbq.g();
      }
      return localArrayList;
    }
    catch (IOException localIOException)
    {
    }
    return null;
  }

  private static co b(bq parambq, long paramLong)
  {
    ArrayList localArrayList = new ArrayList();
    cp localcp1 = parambq.p();
    Object localObject1 = null;
    Object localObject2 = localcp1;
    Object localObject3 = localArrayList;
    if ((localObject2 != null) && (localObject2 != cp.b))
    {
      switch (bm.a[localObject2.ordinal()])
      {
      default:
      case 7:
      case 1:
      }
      while (true)
      {
        Object localObject4 = localObject3;
        Object localObject5 = localObject1;
        while (true)
        {
          cp localcp2 = parambq.g();
          localObject1 = localObject5;
          localObject3 = localObject4;
          localObject2 = localcp2;
          break;
          if ("user".equals(parambq.m()))
          {
            ad localad = a(parambq, paramLong);
            Object localObject6 = localObject3;
            localObject5 = localad;
            localObject4 = localObject6;
          }
          else
          {
            parambq.h();
            localObject4 = localObject3;
            localObject5 = localObject1;
            continue;
            if (!"connections".equals(parambq.m()))
              break label178;
            localObject4 = b(parambq);
            localObject5 = localObject1;
          }
        }
        label178: parambq.h();
      }
    }
    if (localObject1 == null)
      return null;
    return new co(localObject1, (ArrayList)localObject3);
  }

  public static cv b(bq parambq, int paramInt)
  {
    long l1 = -1L;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    int i = 0;
    int j = 0;
    int k = 0;
    Object localObject4 = null;
    cp localcp1 = parambq.g();
    Object localObject5 = null;
    Object localObject6 = localcp1;
    if ((localObject6 != null) && (localObject6 != cp.b))
    {
      label100: Object localObject9;
      Object localObject8;
      Object localObject10;
      int i1;
      Object localObject12;
      Object localObject13;
      int i2;
      int i3;
      long l3;
      switch (bm.a[localObject6.ordinal()])
      {
      case 5:
      case 6:
      default:
        localObject9 = localObject4;
        localObject8 = localObject5;
        int i12 = j;
        int i13 = i;
        localObject10 = localObject1;
        i1 = i13;
        Object localObject18 = localObject3;
        localObject12 = localObject2;
        localObject13 = localObject18;
        long l8 = l1;
        i2 = i12;
        i3 = k;
        l3 = l8;
      case 4:
      case 2:
      case 7:
      case 3:
      }
      while (true)
      {
        cp localcp2 = parambq.g();
        localObject5 = localObject8;
        localObject4 = localObject9;
        localObject6 = localcp2;
        int i4 = i2;
        int i5 = i1;
        localObject1 = localObject10;
        i = i5;
        Object localObject14 = localObject13;
        localObject2 = localObject12;
        localObject3 = localObject14;
        long l4 = l3;
        j = i4;
        k = i3;
        l1 = l4;
        break;
        String str3 = parambq.m();
        if ("name".equals(str3))
        {
          String str6 = parambq.j();
          i1 = i;
          localObject10 = str6;
          localObject9 = localObject4;
          localObject8 = localObject5;
          Object localObject28 = localObject3;
          localObject12 = localObject2;
          localObject13 = localObject28;
          int i27 = k;
          long l10 = l1;
          i3 = i27;
          i2 = j;
          l3 = l10;
        }
        else if ("full_name".equals(str3))
        {
          String str5 = parambq.j();
          localObject13 = localObject3;
          localObject12 = str5;
          localObject9 = localObject4;
          localObject8 = localObject5;
          int i25 = j;
          int i26 = k;
          l3 = l1;
          i2 = i25;
          i3 = i26;
          Object localObject27 = localObject1;
          i1 = i;
          localObject10 = localObject27;
        }
        else if ("description".equals(str3))
        {
          String str4 = parambq.j();
          localObject12 = localObject2;
          localObject13 = str4;
          localObject9 = localObject4;
          localObject8 = localObject5;
          int i23 = k;
          int i24 = j;
          l3 = l1;
          i3 = i23;
          i2 = i24;
          Object localObject26 = localObject1;
          i1 = i;
          localObject10 = localObject26;
        }
        else
        {
          if (!"mode".equals(str3))
            break label100;
          if ("public".equals(parambq.j()))
          {
            Object localObject24 = localObject4;
            localObject8 = localObject5;
            localObject9 = localObject24;
            int i21 = j;
            l3 = l1;
            i2 = i21;
            Object localObject25 = localObject2;
            localObject13 = localObject3;
            localObject12 = localObject25;
            int i22 = i;
            localObject10 = localObject1;
            i1 = i22;
            i3 = 0;
          }
          else
          {
            Object localObject22 = localObject4;
            localObject8 = localObject5;
            localObject9 = localObject22;
            int i19 = j;
            l3 = l1;
            i2 = i19;
            i3 = 1;
            Object localObject23 = localObject2;
            localObject13 = localObject3;
            localObject12 = localObject23;
            int i20 = i;
            localObject10 = localObject1;
            i1 = i20;
            continue;
            String str2 = parambq.m();
            if ("member_count".equals(str2))
            {
              int i17 = parambq.d();
              localObject10 = localObject1;
              i1 = i17;
              localObject9 = localObject4;
              localObject8 = localObject5;
              Object localObject21 = localObject3;
              localObject12 = localObject2;
              localObject13 = localObject21;
              int i18 = j;
              long l9 = l1;
              i2 = i18;
              i3 = k;
              l3 = l9;
            }
            else if ("subscriber_count".equals(str2))
            {
              int i14 = parambq.d();
              Object localObject19 = localObject4;
              localObject8 = localObject5;
              int i15 = k;
              l3 = l1;
              i2 = i14;
              i3 = i15;
              localObject9 = localObject19;
              Object localObject20 = localObject2;
              localObject13 = localObject3;
              localObject12 = localObject20;
              int i16 = i;
              localObject10 = localObject1;
              i1 = i16;
            }
            else
            {
              if (!"id".equals(str2))
                break label100;
              long l7 = parambq.e();
              i2 = j;
              int i10 = k;
              l3 = l7;
              localObject9 = localObject4;
              i3 = i10;
              localObject8 = localObject5;
              Object localObject17 = localObject2;
              localObject13 = localObject3;
              localObject12 = localObject17;
              int i11 = i;
              localObject10 = localObject1;
              i1 = i11;
              continue;
              if ("user".equals(localObject5))
              {
                localObject9 = a(parambq, 0L);
                localObject8 = localObject5;
                int i8 = j;
                int i9 = i;
                localObject10 = localObject1;
                i1 = i9;
                Object localObject16 = localObject3;
                localObject12 = localObject2;
                localObject13 = localObject16;
                long l6 = l1;
                i2 = i8;
                i3 = k;
                l3 = l6;
              }
              else
              {
                parambq.h();
                localObject9 = localObject4;
                localObject8 = localObject5;
                int i6 = j;
                int i7 = i;
                localObject10 = localObject1;
                i1 = i7;
                Object localObject15 = localObject3;
                localObject12 = localObject2;
                localObject13 = localObject15;
                long l5 = l1;
                i2 = i6;
                i3 = k;
                l3 = l5;
                continue;
                String str1 = parambq.j();
                Object localObject7 = localObject4;
                localObject8 = str1;
                localObject9 = localObject7;
                int m = j;
                int n = i;
                localObject10 = localObject1;
                i1 = n;
                Object localObject11 = localObject3;
                localObject12 = localObject2;
                localObject13 = localObject11;
                long l2 = l1;
                i2 = m;
                i3 = k;
                l3 = l2;
              }
            }
          }
        }
      }
    }
    return new cv(l1, localObject1, localObject2, localObject3, i, j, k, localObject4, paramInt);
  }

  public static String b(String paramString)
  {
    if ((paramString == null) || (!paramString.startsWith("@")))
      return null;
    String[] arrayOfString = paramString.split("[^a-zA-Z0-9_]");
    if ((arrayOfString == null) || (arrayOfString.length == 0))
      return null;
    return arrayOfString[1];
  }

  public static ArrayList b(bq parambq)
  {
    ArrayList localArrayList = new ArrayList();
    if (parambq != null)
    {
      long l = System.currentTimeMillis();
      for (cp localcp = parambq.p(); (localcp != null) && (localcp != cp.d); localcp = parambq.g())
        if (localcp == cp.a)
          localArrayList.add(a(parambq, l));
    }
    return localArrayList;
  }

  private static p b(bq parambq, ad paramad)
  {
    long l1 = -1L;
    cp localcp1 = parambq.g();
    long l2 = -1L;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    boolean bool1 = false;
    Object localObject4 = null;
    int i = 0;
    Object localObject5 = null;
    Object localObject6 = null;
    Object localObject7 = localcp1;
    Object localObject8 = null;
    Object localObject9 = null;
    Object localObject10 = null;
    Object localObject11 = null;
    Object localObject12 = null;
    Object localObject13 = null;
    long l3 = -1L;
    long l4 = -1L;
    label132: Object localObject15;
    Object localObject14;
    Object localObject17;
    long l11;
    Object localObject26;
    int j;
    Object localObject24;
    Object localObject25;
    long l7;
    Object localObject20;
    Object localObject19;
    Object localObject21;
    Object localObject22;
    Object localObject23;
    long l8;
    long l9;
    boolean bool3;
    if ((localObject7 != null) && (localObject7 != cp.b))
      switch (bm.a[localObject7.ordinal()])
      {
      default:
        localObject15 = localObject5;
        localObject14 = localObject3;
        Object localObject58 = localObject4;
        localObject17 = localObject13;
        int i9 = i;
        l11 = l1;
        localObject26 = localObject58;
        j = i9;
        Object localObject59 = localObject1;
        localObject24 = localObject11;
        localObject25 = localObject9;
        l7 = l4;
        localObject20 = localObject2;
        localObject19 = localObject8;
        localObject21 = localObject10;
        localObject22 = localObject12;
        localObject23 = localObject59;
        l8 = l2;
        boolean bool11 = bool1;
        l9 = l3;
        bool3 = bool11;
      case 4:
      case 2:
      case 5:
      case 6:
      case 7:
      case 3:
      }
    while (true)
    {
      cp localcp2 = parambq.g();
      l2 = l8;
      localObject12 = localObject22;
      localObject13 = localObject17;
      localObject4 = localObject26;
      localObject8 = localObject19;
      Object localObject27 = localObject25;
      localObject11 = localObject24;
      localObject1 = localObject23;
      localObject10 = localObject21;
      localObject2 = localObject20;
      l4 = l7;
      localObject3 = localObject14;
      localObject9 = localObject27;
      boolean bool4 = bool3;
      l3 = l9;
      bool1 = bool4;
      Object localObject28 = localObject15;
      localObject7 = localcp2;
      int k = j;
      l1 = l11;
      localObject5 = localObject28;
      i = k;
      break;
      String str4 = parambq.m();
      if ("created_at".equals(str4))
      {
        String str10 = parambq.j();
        localObject14 = localObject3;
        int i22 = i;
        Object localObject75 = localObject4;
        localObject17 = str10;
        localObject15 = localObject5;
        l11 = l1;
        localObject26 = localObject75;
        j = i22;
        Object localObject76 = localObject1;
        localObject24 = localObject11;
        localObject25 = localObject9;
        l7 = l4;
        localObject20 = localObject2;
        localObject19 = localObject8;
        localObject21 = localObject10;
        localObject22 = localObject12;
        localObject23 = localObject76;
        l8 = l2;
        boolean bool14 = bool1;
        l9 = l3;
        bool3 = bool14;
      }
      else
      {
        if ("source".equals(str4))
        {
          Object localObject72 = parambq.j();
          String str9;
          String str8;
          if (localObject72 != null)
            if (((String)localObject72).startsWith("<a"))
            {
              int i17 = ((String)localObject72).indexOf('>');
              if (i17 != -1)
              {
                int i18 = ((String)localObject72).indexOf('<', i17);
                if (i18 != -1)
                {
                  str9 = ((String)localObject72).substring(i17 + 1, i18);
                  int i19 = ((String)localObject72).indexOf("href=\"");
                  if (i19 != -1)
                  {
                    int i20 = i19 + 6;
                    int i21 = ((String)localObject72).indexOf('"', i20);
                    if (i21 != -1)
                    {
                      str8 = ((String)localObject72).substring(i20, i21);
                      localObject72 = str9;
                    }
                  }
                }
              }
            }
          label552: for (Pair localPair2 = new Pair(localObject72, str8); ; localPair2 = new Pair(localObject72, null))
          {
            String str6 = (String)localPair2.first;
            String str7 = (String)localPair2.second;
            localObject25 = localObject9;
            int i16 = i;
            Object localObject73 = localObject4;
            localObject17 = localObject13;
            l8 = l2;
            Object localObject74 = localObject3;
            l7 = l4;
            localObject19 = localObject8;
            localObject20 = localObject2;
            localObject21 = localObject10;
            localObject22 = str6;
            localObject15 = localObject5;
            localObject23 = localObject1;
            localObject24 = str7;
            l11 = l1;
            j = i16;
            localObject26 = localObject73;
            localObject14 = localObject74;
            long l23 = l3;
            bool3 = bool1;
            l9 = l23;
            break;
            localObject72 = str9;
            str8 = null;
            break label552;
            localObject72 = str9;
            str8 = null;
            break label552;
            str8 = null;
            break label552;
            str8 = null;
            break label552;
            str8 = null;
            break label552;
          }
        }
        if ("text".equals(str4))
        {
          String str5 = parambq.j();
          localObject14 = localObject3;
          localObject23 = localObject1;
          localObject24 = localObject11;
          localObject25 = localObject9;
          l7 = l4;
          localObject19 = localObject8;
          localObject20 = localObject2;
          localObject21 = str5;
          localObject22 = localObject12;
          localObject15 = localObject5;
          long l22 = l3;
          bool3 = bool1;
          l9 = l22;
          Object localObject71 = localObject4;
          localObject17 = localObject13;
          l8 = l2;
          int i15 = i;
          l11 = l1;
          localObject26 = localObject71;
          j = i15;
        }
        else
        {
          if ((!"retweet_count".equals(str4)) || (!"100+".equals(parambq.j())))
            break label132;
          localObject14 = localObject3;
          localObject15 = localObject5;
          l11 = l1;
          j = 100;
          localObject26 = localObject4;
          localObject17 = localObject13;
          Object localObject70 = localObject1;
          localObject24 = localObject11;
          localObject25 = localObject9;
          l7 = l4;
          localObject20 = localObject2;
          localObject19 = localObject8;
          localObject21 = localObject10;
          localObject22 = localObject12;
          localObject23 = localObject70;
          l8 = l2;
          long l21 = l3;
          bool3 = bool1;
          l9 = l21;
          continue;
          String str3 = parambq.m();
          if ("id".equals(str3))
          {
            long l19 = parambq.e();
            localObject26 = localObject4;
            localObject14 = localObject3;
            localObject17 = localObject13;
            int i14 = i;
            Object localObject68 = localObject9;
            l7 = l4;
            localObject19 = localObject8;
            localObject20 = localObject2;
            localObject21 = localObject10;
            localObject22 = localObject12;
            localObject23 = localObject1;
            l8 = l2;
            localObject24 = localObject11;
            localObject25 = localObject68;
            long l20 = l3;
            bool3 = bool1;
            l9 = l20;
            Object localObject69 = localObject5;
            l11 = l19;
            j = i14;
            localObject15 = localObject69;
          }
          else if ("in_reply_to_user_id".equals(str3))
          {
            long l18 = parambq.e();
            localObject15 = localObject5;
            localObject14 = localObject3;
            Object localObject66 = localObject4;
            localObject17 = localObject13;
            int i13 = i;
            l11 = l1;
            localObject26 = localObject66;
            j = i13;
            Object localObject67 = localObject1;
            localObject24 = localObject11;
            localObject25 = localObject9;
            l7 = l18;
            localObject20 = localObject2;
            localObject19 = localObject8;
            localObject21 = localObject10;
            localObject22 = localObject12;
            localObject23 = localObject67;
            l8 = l2;
            boolean bool13 = bool1;
            l9 = l3;
            bool3 = bool13;
          }
          else if ("in_reply_to_status_id".equals(str3))
          {
            long l17 = parambq.e();
            localObject15 = localObject5;
            localObject14 = localObject3;
            Object localObject64 = localObject4;
            localObject17 = localObject13;
            int i12 = i;
            l11 = l1;
            localObject26 = localObject64;
            j = i12;
            Object localObject65 = localObject1;
            localObject24 = localObject11;
            localObject25 = localObject9;
            l7 = l4;
            localObject20 = localObject2;
            localObject19 = localObject8;
            localObject21 = localObject10;
            localObject22 = localObject12;
            localObject23 = localObject65;
            l8 = l2;
            boolean bool12 = bool1;
            l9 = l17;
            bool3 = bool12;
          }
          else
          {
            if (!"retweet_count".equals(str3))
              break label132;
            int i11 = parambq.d();
            localObject14 = localObject3;
            localObject15 = localObject5;
            l11 = l1;
            j = i11;
            localObject26 = localObject4;
            localObject17 = localObject13;
            Object localObject63 = localObject1;
            localObject24 = localObject11;
            localObject25 = localObject9;
            l7 = l4;
            localObject20 = localObject2;
            localObject19 = localObject8;
            localObject21 = localObject10;
            localObject22 = localObject12;
            localObject23 = localObject63;
            l8 = l2;
            long l16 = l3;
            bool3 = bool1;
            l9 = l16;
            continue;
            if (!"favorited".equals(parambq.m()))
              break label132;
            localObject14 = localObject3;
            int i10 = i;
            Object localObject60 = localObject4;
            localObject17 = localObject13;
            Object localObject61 = localObject5;
            l11 = l1;
            j = i10;
            localObject26 = localObject60;
            Object localObject62 = localObject9;
            l7 = l4;
            localObject19 = localObject8;
            localObject20 = localObject2;
            localObject21 = localObject10;
            localObject22 = localObject12;
            localObject23 = localObject1;
            l8 = l2;
            localObject24 = localObject11;
            localObject25 = localObject62;
            localObject15 = localObject61;
            l9 = l3;
            bool3 = false;
            continue;
            if (!"favorited".equals(parambq.m()))
              break label132;
            localObject14 = localObject3;
            int i8 = i;
            Object localObject55 = localObject4;
            localObject17 = localObject13;
            Object localObject56 = localObject5;
            l11 = l1;
            j = i8;
            localObject26 = localObject55;
            Object localObject57 = localObject9;
            l7 = l4;
            localObject19 = localObject8;
            localObject20 = localObject2;
            localObject21 = localObject10;
            localObject22 = localObject12;
            localObject23 = localObject1;
            l8 = l2;
            localObject24 = localObject11;
            localObject25 = localObject57;
            localObject15 = localObject56;
            l9 = l3;
            bool3 = true;
            continue;
            long l15;
            if ("current_user_retweet".equals(localObject6))
            {
              cp localcp6 = parambq.g();
              l15 = l2;
              while ((localcp6 != null) && (localcp6 != cp.b))
              {
                if ((localcp6 == cp.h) && ("id".equals(parambq.m())))
                  l15 = parambq.e();
                localcp6 = parambq.g();
              }
            }
            if ("user".equals(localObject6))
            {
              ad localad = a(parambq, 0L);
              localObject14 = localObject3;
              localObject22 = localObject12;
              Object localObject50 = localObject4;
              localObject17 = localObject13;
              l8 = l2;
              Object localObject51 = localObject5;
              Object localObject52 = localObject9;
              l7 = l4;
              localObject19 = localad;
              localObject20 = localObject2;
              localObject15 = localObject51;
              localObject21 = localObject10;
              localObject23 = localObject1;
              localObject24 = localObject11;
              localObject25 = localObject52;
              boolean bool9 = bool1;
              l9 = l3;
              bool3 = bool9;
              int i6 = i;
              l11 = l1;
              localObject26 = localObject50;
              j = i6;
            }
            else
            {
              Object localObject38;
              Object localObject40;
              Object localObject41;
              label1800: Object localObject44;
              Object localObject45;
              Object localObject46;
              label1812: Object localObject48;
              if ("coordinates".equals(localObject6))
              {
                Object localObject37 = parambq.g();
                localObject38 = null;
                Object localObject39 = localObject3;
                localObject40 = localObject9;
                localObject41 = localObject39;
                while (true)
                  if (localObject37 != null)
                  {
                    cp localcp4 = cp.b;
                    if (localObject37 != localcp4)
                      switch (bm.a[localObject37.ordinal()])
                      {
                      default:
                        localObject44 = localObject38;
                        localObject45 = localObject41;
                        localObject46 = localObject40;
                        cp localcp5 = parambq.g();
                        Object localObject47 = localObject44;
                        localObject37 = localcp5;
                        localObject40 = localObject46;
                        localObject41 = localObject45;
                        localObject38 = localObject47;
                        break;
                      case 1:
                        if ("coordinates".equals(localObject38))
                        {
                          Pair localPair1 = B(parambq);
                          if (localPair1 == null)
                            break label2913;
                          localObject46 = ((Double)localPair1.first).toString();
                          localObject48 = ((Double)localPair1.second).toString();
                        }
                      case 3:
                      case 7:
                      }
                  }
              }
              while (true)
              {
                Object localObject49 = localObject38;
                localObject45 = localObject48;
                localObject44 = localObject49;
                break label1812;
                parambq.h();
                localObject44 = localObject38;
                localObject45 = localObject41;
                localObject46 = localObject40;
                break label1812;
                localObject44 = parambq.j();
                localObject45 = localObject41;
                localObject46 = localObject40;
                break label1812;
                parambq.h();
                break label1800;
                localObject15 = localObject5;
                localObject14 = localObject41;
                Object localObject42 = localObject4;
                localObject17 = localObject13;
                int i5 = i;
                l11 = l1;
                localObject26 = localObject42;
                j = i5;
                Object localObject43 = localObject1;
                localObject24 = localObject11;
                localObject25 = localObject40;
                l7 = l4;
                localObject20 = localObject2;
                localObject19 = localObject8;
                localObject21 = localObject10;
                localObject22 = localObject12;
                localObject23 = localObject43;
                l8 = l2;
                boolean bool8 = bool1;
                l9 = l3;
                bool3 = bool8;
                break;
                if ("place".equals(localObject6))
                {
                  ap localap = A(parambq);
                  localObject14 = localObject3;
                  localObject21 = localObject10;
                  localObject23 = localObject1;
                  localObject24 = localObject11;
                  localObject25 = localObject9;
                  l7 = l4;
                  localObject19 = localObject8;
                  localObject20 = localap;
                  localObject15 = localObject5;
                  localObject22 = localObject12;
                  long l14 = l3;
                  bool3 = bool1;
                  l9 = l14;
                  int i4 = i;
                  l11 = l1;
                  localObject26 = localObject4;
                  j = i4;
                  localObject17 = localObject13;
                  l8 = l2;
                  break;
                }
                if ("retweeted_status".equals(localObject6))
                {
                  p localp2 = d(parambq);
                  localObject14 = localObject3;
                  localObject24 = localObject11;
                  localObject25 = localObject9;
                  l7 = l4;
                  localObject19 = localObject8;
                  localObject20 = localObject2;
                  localObject21 = localObject10;
                  localObject22 = localObject12;
                  localObject23 = localp2;
                  localObject15 = localObject5;
                  long l13 = l3;
                  bool3 = bool1;
                  l9 = l13;
                  Object localObject36 = localObject4;
                  localObject17 = localObject13;
                  l8 = l2;
                  int i3 = i;
                  l11 = l1;
                  localObject26 = localObject36;
                  j = i3;
                  break;
                }
                if ("entities".equals(localObject6))
                {
                  be localbe = be.a(parambq);
                  localObject14 = localObject3;
                  localObject17 = localObject13;
                  localObject15 = localObject5;
                  Object localObject35 = localObject9;
                  l7 = l4;
                  localObject19 = localObject8;
                  localObject20 = localObject2;
                  localObject21 = localObject10;
                  localObject22 = localObject12;
                  localObject23 = localObject1;
                  l8 = l2;
                  localObject24 = localObject11;
                  localObject25 = localObject35;
                  long l12 = l3;
                  bool3 = bool1;
                  l9 = l12;
                  int i2 = i;
                  l11 = l1;
                  localObject26 = localbe;
                  j = i2;
                  break;
                }
                if ("metadata".equals(localObject6))
                {
                  localObject15 = localObject5;
                  cp localcp3;
                  do
                  {
                    localcp3 = parambq.g();
                    if ((localcp3 == cp.g) && ("result_type".equals(parambq.m())))
                      localObject15 = parambq.j();
                    if (localcp3 == null)
                      break;
                  }
                  while (localcp3 != cp.b);
                  localObject14 = localObject3;
                  Object localObject33 = localObject4;
                  localObject17 = localObject13;
                  int i1 = i;
                  l11 = l1;
                  localObject26 = localObject33;
                  j = i1;
                  Object localObject34 = localObject1;
                  localObject24 = localObject11;
                  localObject25 = localObject9;
                  l7 = l4;
                  localObject20 = localObject2;
                  localObject19 = localObject8;
                  localObject21 = localObject10;
                  localObject22 = localObject12;
                  localObject23 = localObject34;
                  l8 = l2;
                  boolean bool7 = bool1;
                  l9 = l3;
                  bool3 = bool7;
                  break;
                }
                parambq.h();
                localObject15 = localObject5;
                localObject14 = localObject3;
                Object localObject29 = localObject4;
                localObject17 = localObject13;
                int m = i;
                l11 = l1;
                localObject26 = localObject29;
                j = m;
                Object localObject30 = localObject1;
                localObject24 = localObject11;
                localObject25 = localObject9;
                l7 = l4;
                localObject20 = localObject2;
                localObject19 = localObject8;
                localObject21 = localObject10;
                localObject22 = localObject12;
                localObject23 = localObject30;
                l8 = l2;
                boolean bool5 = bool1;
                l9 = l3;
                bool3 = bool5;
                break;
                String str2 = parambq.j();
                localObject14 = localObject3;
                localObject6 = str2;
                localObject15 = localObject5;
                Object localObject16 = localObject4;
                localObject17 = localObject13;
                Object localObject18 = localObject9;
                l7 = l4;
                localObject19 = localObject8;
                localObject20 = localObject2;
                localObject21 = localObject10;
                localObject22 = localObject12;
                l8 = l2;
                localObject23 = localObject1;
                localObject24 = localObject11;
                localObject25 = localObject18;
                boolean bool2 = bool1;
                l9 = l3;
                bool3 = bool2;
                long l10 = l1;
                localObject26 = localObject16;
                j = i;
                l11 = l10;
                break;
                long l5 = cr.a(cr.a, localObject13);
                if ("popular".equals(localObject5));
                String str1;
                for (long l6 = System.currentTimeMillis(); ; l6 = l5)
                {
                  str1 = a(localObject10, localObject4);
                  if (l2 == -1L)
                    break;
                  p localp1 = new p(l1, l5, localObject12, localObject11, str1, l4, l3, bool1, localObject9, localObject3, localObject2, null, localObject8, localObject4, i, localObject5, l6);
                  return new p(l2, l5, localObject12, localObject11, str1, l4, l3, bool1, localObject9, localObject3, localObject2, localp1, paramad, localObject4, i, localObject5, l6);
                }
                return new p(l1, l5, localObject12, localObject11, str1, l4, l3, bool1, localObject9, localObject3, localObject2, localObject1, localObject8, localObject4, i, localObject5, l6);
                localObject14 = localObject3;
                Object localObject31 = localObject4;
                localObject17 = localObject13;
                int n = i;
                l11 = l1;
                localObject26 = localObject31;
                j = n;
                Object localObject32 = localObject1;
                localObject24 = localObject11;
                localObject25 = localObject9;
                l7 = l4;
                localObject20 = localObject2;
                localObject19 = localObject8;
                localObject21 = localObject10;
                localObject22 = localObject12;
                localObject23 = localObject32;
                l8 = l2;
                boolean bool6 = bool1;
                l9 = l3;
                bool3 = bool6;
                break;
                label2913: localObject48 = localObject41;
                localObject46 = localObject40;
              }
              localObject15 = localObject5;
              localObject14 = localObject3;
              Object localObject53 = localObject4;
              localObject17 = localObject13;
              int i7 = i;
              l11 = l1;
              localObject26 = localObject53;
              j = i7;
              Object localObject54 = localObject1;
              localObject24 = localObject11;
              localObject25 = localObject9;
              l7 = l4;
              localObject20 = localObject2;
              localObject19 = localObject8;
              localObject21 = localObject10;
              localObject22 = localObject12;
              localObject23 = localObject54;
              l8 = l15;
              boolean bool10 = bool1;
              l9 = l3;
              bool3 = bool10;
            }
          }
        }
      }
    }
  }

  public static ad c(String paramString)
  {
    bq localbq = a.a(paramString);
    localbq.g();
    return a(localbq, 0L);
  }

  public static ArrayList c(bq parambq)
  {
    return a(parambq, null);
  }

  private static ArrayList c(bq parambq, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    if (parambq != null)
      for (cp localcp = parambq.p(); (localcp != null) && (localcp != cp.d); localcp = parambq.g())
        if (localcp == cp.a)
          localArrayList.add(b(parambq, paramInt));
    return localArrayList;
  }

  public static p d(bq parambq)
  {
    return b(parambq, null);
  }

  public static ArrayList e(bq parambq)
  {
    ArrayList localArrayList = new ArrayList();
    if (parambq != null)
      for (cp localcp = parambq.p(); (localcp != null) && (localcp != cp.d); localcp = parambq.g())
        if (localcp == cp.a)
          localArrayList.add(f(parambq));
    return localArrayList;
  }

  public static cq f(bq parambq)
  {
    Object localObject1 = null;
    cp localcp1 = parambq.g();
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    Object localObject7 = localcp1;
    long l1 = -1L;
    if ((localObject7 != null) && (localObject7 != cp.b))
    {
      label88: Object localObject14;
      Object localObject13;
      Object localObject8;
      Object localObject9;
      long l2;
      Object localObject12;
      Object localObject11;
      switch (bm.a[localObject7.ordinal()])
      {
      case 5:
      case 6:
      default:
        localObject14 = localObject2;
        Object localObject24 = localObject3;
        localObject13 = localObject6;
        localObject8 = localObject1;
        localObject9 = localObject5;
        Object localObject25 = localObject4;
        l2 = l1;
        localObject12 = localObject25;
        localObject11 = localObject24;
      case 4:
      case 2:
      case 7:
      case 3:
      }
      while (true)
      {
        cp localcp2 = parambq.g();
        localObject2 = localObject14;
        localObject7 = localcp2;
        Object localObject15 = localObject11;
        Object localObject16 = localObject12;
        l1 = l2;
        localObject5 = localObject9;
        localObject4 = localObject16;
        localObject1 = localObject8;
        localObject6 = localObject13;
        localObject3 = localObject15;
        break;
        String str2 = parambq.m();
        if ("created_at".equals(str2))
        {
          String str4 = parambq.j();
          localObject9 = localObject5;
          Object localObject28 = localObject3;
          localObject13 = localObject6;
          localObject8 = str4;
          localObject14 = localObject2;
          Object localObject29 = localObject4;
          l2 = l1;
          localObject12 = localObject29;
          localObject11 = localObject28;
        }
        else
        {
          if (!"text".equals(str2))
            break label88;
          String str3 = parambq.j();
          Object localObject26 = localObject3;
          localObject13 = localObject6;
          localObject8 = localObject1;
          localObject9 = str3;
          localObject14 = localObject2;
          Object localObject27 = localObject4;
          l2 = l1;
          localObject12 = localObject27;
          localObject11 = localObject26;
          continue;
          if (!"id".equals(parambq.m()))
            break label88;
          long l3 = parambq.e();
          localObject12 = localObject4;
          Object localObject23 = localObject3;
          localObject13 = localObject6;
          localObject8 = localObject1;
          localObject9 = localObject5;
          l2 = l3;
          localObject14 = localObject2;
          localObject11 = localObject23;
          continue;
          if ("sender".equals(localObject6))
          {
            ad localad2 = a(parambq, 0L);
            Object localObject22 = localObject3;
            localObject13 = localObject6;
            localObject8 = localObject1;
            localObject9 = localObject5;
            l2 = l1;
            localObject12 = localad2;
            localObject11 = localObject22;
            localObject14 = localObject2;
          }
          else if ("recipient".equals(localObject6))
          {
            ad localad1 = a(parambq, 0L);
            localObject13 = localObject6;
            localObject8 = localObject1;
            localObject9 = localObject5;
            Object localObject21 = localObject4;
            l2 = l1;
            localObject11 = localad1;
            localObject12 = localObject21;
            localObject14 = localObject2;
          }
          else if ("entities".equals(localObject6))
          {
            localObject14 = be.a(parambq);
            Object localObject19 = localObject3;
            localObject13 = localObject6;
            localObject8 = localObject1;
            localObject9 = localObject5;
            Object localObject20 = localObject4;
            l2 = l1;
            localObject12 = localObject20;
            localObject11 = localObject19;
          }
          else
          {
            parambq.h();
            localObject14 = localObject2;
            Object localObject17 = localObject3;
            localObject13 = localObject6;
            localObject8 = localObject1;
            localObject9 = localObject5;
            Object localObject18 = localObject4;
            l2 = l1;
            localObject12 = localObject18;
            localObject11 = localObject17;
            continue;
            String str1 = parambq.j();
            localObject8 = localObject1;
            localObject9 = localObject5;
            Object localObject10 = localObject4;
            l2 = l1;
            localObject11 = localObject3;
            localObject12 = localObject10;
            localObject13 = str1;
            localObject14 = localObject2;
          }
        }
      }
    }
    return new cq(l1, cr.a(cr.a, localObject1), a(localObject5, localObject2), localObject4, localObject3, localObject2);
  }

  public static ArrayList g(bq parambq)
  {
    ArrayList localArrayList = new ArrayList();
    if (parambq != null)
    {
      cp localcp1 = parambq.p();
      long l = 0L;
      while ((localcp1 != null) && (localcp1 != cp.d))
      {
        if (localcp1 == cp.a)
        {
          cp localcp2 = parambq.g();
          if ((localcp2 != null) && (localcp2 != cp.b))
          {
            String str = parambq.m();
            switch (bm.a[localcp2.ordinal()])
            {
            default:
            case 4:
            case 7:
            case 1:
            }
            while (true)
            {
              localcp2 = parambq.g();
              break;
              if ("as_of".equals(str))
              {
                l = cr.a(cr.b, parambq.j());
                continue;
                parambq.h();
                continue;
                if ("trends".equals(str))
                  while ((localcp2 != null) && (localcp2 != cp.d))
                  {
                    if (localcp2 == cp.a)
                    {
                      dn localdn = z(parambq);
                      if (localdn != null)
                        localArrayList.add(localdn);
                    }
                    localcp2 = parambq.g();
                  }
                else
                  parambq.h();
              }
            }
          }
        }
        localcp1 = parambq.g();
      }
      int i = 0;
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        ((dn)localIterator.next()).h = (l + i);
        i++;
      }
    }
    return localArrayList;
  }

  public static ao h(bq parambq)
  {
    int i = 0;
    cp localcp1 = parambq.g();
    int j = 0;
    Object localObject = localcp1;
    long l1 = 0L;
    if ((localObject != null) && (localObject != cp.b))
    {
      switch (bm.a[localObject.ordinal()])
      {
      default:
      case 2:
      case 7:
      }
      while (true)
      {
        label64: long l2 = l1;
        int k = i;
        int m = j;
        while (true)
        {
          cp localcp2 = parambq.g();
          j = m;
          i = k;
          l1 = l2;
          localObject = localcp2;
          break;
          String str = parambq.m();
          if ("remaining_hits".equals(str))
          {
            int i1 = parambq.d();
            long l3 = l1;
            k = i;
            m = i1;
            l2 = l3;
          }
          else if ("hourly_limit".equals(str))
          {
            int n = parambq.d();
            m = j;
            l2 = l1;
            k = n;
          }
          else
          {
            if (!"reset_time_in_seconds".equals(str))
              break label64;
            l2 = parambq.e();
            k = i;
            m = j;
          }
        }
        parambq.h();
      }
    }
    return new ao(j, i, l1 * 1000L);
  }

  public static dt i(bq parambq)
  {
    cp localcp = parambq.g();
    int i = 0;
    if ((localcp != null) && (localcp != cp.b))
    {
      String str = parambq.m();
      switch (bm.a[localcp.ordinal()])
      {
      default:
      case 2:
      case 1:
      case 7:
      }
      while (true)
      {
        localcp = parambq.g();
        break;
        if ("short_url_length".equals(str))
        {
          i = parambq.d();
          continue;
          parambq.h();
        }
      }
    }
    return new dt(i);
  }

  public static int j(bq parambq)
  {
    cp localcp1 = parambq.g();
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = localcp1;
    if ((localObject2 != null) && (localObject2 != cp.b))
    {
      label60: int j;
      switch (bm.a[localObject2.ordinal()])
      {
      default:
        j = i;
      case 7:
      case 3:
      }
      while (true)
      {
        cp localcp2 = parambq.g();
        i = j;
        localObject2 = localcp2;
        break;
        if ("relationship".equals(localObject1))
        {
          Object localObject3 = parambq.g();
          if ((localObject3 == null) || (localObject3 == cp.b))
            break label60;
          int k;
          switch (bm.a[localObject3.ordinal()])
          {
          default:
            k = i;
          case 7:
          case 3:
          }
          while (true)
          {
            cp localcp3 = parambq.g();
            i = k;
            localObject3 = localcp3;
            break;
            if ("source".equals(localObject1))
            {
              Object localObject4 = parambq.g();
              int m = 0;
              if ((localObject4 != null) && (localObject4 != cp.b))
              {
                switch (bm.a[localObject4.ordinal()])
                {
                default:
                case 6:
                case 7:
                }
                while (true)
                {
                  label228: int n = m;
                  while (true)
                  {
                    cp localcp4 = parambq.g();
                    m = n;
                    localObject4 = localcp4;
                    break;
                    String str = parambq.m();
                    if ("following".equals(str))
                    {
                      n = m | 0x1;
                    }
                    else
                    {
                      if (!"followed_by".equals(str))
                        break label228;
                      n = m | 0x2;
                    }
                  }
                  parambq.h();
                }
              }
              k = m;
            }
            else
            {
              parambq.h();
              k = i;
              continue;
              localObject1 = parambq.j();
              k = i;
            }
          }
        }
        parambq.h();
        j = i;
        continue;
        localObject1 = parambq.j();
        j = i;
      }
    }
    return i;
  }

  public static ArrayList k(bq parambq)
  {
    cp localcp1 = parambq.g();
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = localcp1;
    if ((localObject3 != null) && (localObject3 != cp.b))
    {
      label60: Object localObject4;
      switch (bm.a[localObject3.ordinal()])
      {
      default:
        localObject4 = localObject1;
      case 7:
      case 3:
      }
      while (true)
      {
        cp localcp2 = parambq.g();
        localObject1 = localObject4;
        localObject3 = localcp2;
        break;
        if ("result".equals(localObject2))
        {
          if ((localObject3 == null) || (localObject3 == cp.b))
            break label60;
          Object localObject5;
          switch (bm.a[localObject3.ordinal()])
          {
          case 2:
          default:
            localObject5 = localObject1;
          case 1:
          case 3:
          }
          while (true)
          {
            cp localcp3 = parambq.g();
            localObject1 = localObject5;
            localObject3 = localcp3;
            break;
            if ("places".equals(localObject2))
            {
              localObject5 = new ArrayList();
              for (cp localcp4 = parambq.p(); (localcp4 != null) && (localcp4 != cp.d); localcp4 = parambq.g())
                if (localcp4 == cp.a)
                  ((ArrayList)localObject5).add(A(parambq));
            }
            parambq.h();
            localObject5 = localObject1;
            continue;
            localObject2 = parambq.j();
            localObject5 = localObject1;
          }
        }
        parambq.h();
        localObject4 = localObject1;
        continue;
        localObject2 = parambq.j();
        localObject4 = localObject1;
      }
    }
    return localObject1;
  }

  public static ArrayList l(bq parambq)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1;
    Object localObject2;
    if (parambq != null)
    {
      cp localcp1 = parambq.p();
      localObject1 = null;
      localObject2 = localcp1;
      if ((localObject2 != null) && (localObject2 != cp.b))
      {
        if (localObject2 == cp.c)
        {
          if (!"promoted_tweets".equals(localObject1))
            break label124;
          while ((localObject2 != null) && (localObject2 != cp.d))
          {
            if (localObject2 == cp.a)
              localArrayList.add(d(parambq));
            localObject2 = parambq.g();
          }
        }
        if (localObject2 != cp.e)
          break label124;
      }
    }
    label124: for (Object localObject3 = parambq.j(); ; localObject3 = localObject1)
    {
      cp localcp2 = parambq.g();
      localObject1 = localObject3;
      localObject2 = localcp2;
      break;
      return localArrayList;
    }
  }

  public static ArrayList m(bq parambq)
  {
    ArrayList localArrayList = new ArrayList();
    if (parambq != null)
    {
      cp localcp = parambq.p();
      if (localcp == cp.c)
        while ((localcp != null) && (localcp != cp.d))
        {
          if (localcp == cp.a)
            localArrayList.add(n(parambq));
          localcp = parambq.g();
        }
    }
    return localArrayList;
  }

  public static dn n(bq parambq)
  {
    Object localObject1 = null;
    Object localObject2 = parambq.p();
    long l1 = 0L;
    long l2 = 0L;
    String str1 = null;
    if ((localObject2 != null) && (localObject2 != cp.b))
    {
      String str2 = parambq.m();
      label68: Object localObject3;
      long l4;
      long l5;
      switch (bm.a[localObject2.ordinal()])
      {
      case 3:
      default:
        long l7 = l2;
        localObject3 = localObject1;
        l4 = l7;
        l5 = l1;
      case 2:
      case 4:
      }
      while (true)
      {
        cp localcp = parambq.g();
        long l6 = l4;
        localObject1 = localObject3;
        localObject2 = localcp;
        l1 = l5;
        l2 = l6;
        break;
        if (!"id".equals(str2))
          break label68;
        long l10 = parambq.e();
        long l11 = l2;
        localObject3 = localObject1;
        l4 = l11;
        l5 = l10;
        continue;
        if ("name".equals(str2))
        {
          String str3 = parambq.j();
          long l9 = l2;
          localObject3 = str3;
          l4 = l9;
          l5 = l1;
        }
        else if ("query".equals(str2))
        {
          str1 = parambq.j();
          long l8 = l2;
          localObject3 = localObject1;
          l4 = l8;
          l5 = l1;
        }
        else
        {
          if (!"created_at".equals(str2))
            break label68;
          long l3 = cr.a(cr.a, parambq.j());
          localObject3 = localObject1;
          l4 = l3;
          l5 = l1;
        }
      }
    }
    return new dn(localObject1, str1, l2, l1);
  }

  public static ArrayList o(bq parambq)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = parambq.p();
    Object localObject2;
    Object localObject3;
    Object localObject5;
    label108: Object localObject4;
    if (localObject1 == cp.c)
    {
      localObject2 = null;
      localObject3 = null;
      if ((localObject1 != null) && (localObject1 != cp.d))
      {
        if (localObject1 != cp.a)
          break label315;
        Object localObject6 = null;
        Object localObject7 = localObject2;
        localObject5 = localObject3;
        Object localObject8 = localObject7;
        if ((localObject1 != null) && (localObject1 != cp.b))
        {
          Object localObject9;
          Object localObject11;
          Object localObject12;
          switch (bm.a[localObject1.ordinal()])
          {
          case 2:
          case 3:
          default:
            localObject9 = localObject6;
            Object localObject14 = localObject8;
            localObject11 = localObject5;
            localObject12 = localObject14;
          case 4:
          case 1:
          }
          while (true)
          {
            cp localcp2 = parambq.g();
            localObject6 = localObject9;
            localObject1 = localcp2;
            Object localObject13 = localObject12;
            localObject5 = localObject11;
            localObject8 = localObject13;
            break;
            String str1 = parambq.m();
            if ("name".equals(str1))
            {
              String str3 = parambq.j();
              localObject12 = localObject8;
              localObject11 = str3;
              localObject9 = localObject6;
            }
            else
            {
              if (!"slug".equals(str1))
                break label108;
              String str2 = parambq.j();
              localObject11 = localObject5;
              localObject12 = str2;
              localObject9 = localObject6;
              continue;
              if (!"sample".equals(parambq.m()))
                break label108;
              localObject9 = b(parambq);
              Object localObject10 = localObject8;
              localObject11 = localObject5;
              localObject12 = localObject10;
            }
          }
        }
        if ((localObject5 != null) && (localObject8 != null))
          localArrayList.add(new dn(localObject5, localObject8, localObject8.hashCode(), localObject6));
        localObject4 = localObject8;
      }
    }
    while (true)
    {
      cp localcp1 = parambq.g();
      localObject3 = localObject5;
      localObject2 = localObject4;
      localObject1 = localcp1;
      break;
      return localArrayList;
      label315: localObject4 = localObject2;
      localObject5 = localObject3;
    }
  }

  public static ArrayList p(bq parambq)
  {
    cp localcp1 = parambq.p();
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = localcp1;
    if ((localObject3 != null) && (localObject3 != cp.b))
    {
      Object localObject4;
      switch (bm.a[localObject3.ordinal()])
      {
      case 2:
      default:
        localObject4 = localObject1;
      case 1:
      case 3:
      }
      while (true)
      {
        cp localcp2 = parambq.g();
        localObject1 = localObject4;
        localObject3 = localcp2;
        break;
        if ("users".equals(localObject2))
        {
          localObject4 = b(parambq);
        }
        else
        {
          while ((localObject3 != null) && (localObject3 != cp.d))
            localObject3 = parambq.g();
          localObject2 = parambq.j();
          localObject4 = localObject1;
        }
      }
    }
    return localObject1;
  }

  public static ArrayList q(bq parambq)
  {
    ArrayList localArrayList = new ArrayList();
    if (parambq != null)
    {
      cp localcp = parambq.g();
      Object localObject = null;
      if ((localcp != null) && (localcp != cp.d))
      {
        switch (bm.a[localcp.ordinal()])
        {
        default:
        case 7:
        }
        do
        {
          localcp = parambq.g();
          break;
        }
        while ((localcp == null) || (localcp == cp.b));
        switch (bm.a[localcp.ordinal()])
        {
        default:
        case 2:
        case 3:
        }
        while (true)
        {
          localcp = parambq.g();
          break;
          if ("id".equals(localObject))
          {
            localArrayList.add(Long.valueOf(parambq.e()));
            continue;
            localObject = parambq.j();
          }
        }
      }
    }
    return localArrayList;
  }

  public static ay r(bq parambq)
  {
    long l1 = 0L;
    boolean bool2;
    label72: long l2;
    if (parambq != null)
    {
      cp localcp1 = parambq.p();
      bool2 = false;
      Object localObject = localcp1;
      if ((localObject != null) && (localObject != cp.b))
      {
        String str = parambq.m();
        long l4;
        boolean bool3;
        switch (bm.a[localObject.ordinal()])
        {
        default:
          l4 = l1;
          bool3 = bool2;
        case 2:
        case 6:
        }
        while (true)
        {
          cp localcp2 = parambq.g();
          bool2 = bool3;
          l1 = l4;
          localObject = localcp2;
          break;
          if (!"scribe_interval".equals(str))
            break label72;
          l4 = 1000L * parambq.e();
          bool3 = bool2;
          continue;
          if (!"scribe_enabled".equals(str))
            break label72;
          long l3 = l1;
          bool3 = true;
          l4 = l3;
        }
      }
      l2 = l1;
    }
    for (boolean bool1 = bool2; ; bool1 = false)
    {
      return new ay(bool1, l2);
      l2 = l1;
    }
  }

  public static ArrayList s(bq parambq)
  {
    ArrayList localArrayList = new ArrayList();
    for (cp localcp = parambq.p(); (localcp != null) && (localcp != cp.d); localcp = parambq.g())
      if (localcp == cp.a)
      {
        ae localae = C(parambq);
        if (localae != null)
          localArrayList.add(localae);
      }
    return localArrayList;
  }

  public static dd t(bq parambq)
  {
    Object localObject1 = parambq.p();
    Object localObject2 = null;
    Object localObject3 = null;
    if ((localObject1 != null) && (localObject1 != cp.b))
    {
      label48: Object localObject4;
      Object localObject5;
      switch (bm.a[localObject1.ordinal()])
      {
      default:
        localObject4 = localObject2;
        localObject5 = localObject3;
      case 1:
      }
      while (true)
      {
        cp localcp = parambq.g();
        localObject3 = localObject5;
        localObject2 = localObject4;
        localObject1 = localcp;
        break;
        String str = parambq.m();
        if ("statuses".equals(str))
        {
          ArrayList localArrayList = a(parambq, null);
          Object localObject6 = localObject2;
          localObject5 = localArrayList;
          localObject4 = localObject6;
        }
        else
        {
          if (!"stories".equals(str))
            break label48;
          localObject4 = u(parambq);
          localObject5 = localObject3;
        }
      }
    }
    if (localObject3 == null)
      return null;
    return new dd(localObject3, localObject2);
  }

  public static ArrayList u(bq parambq)
  {
    ArrayList localArrayList = new ArrayList();
    for (cp localcp = parambq.p(); (localcp != null) && (localcp != cp.d); localcp = parambq.g())
      if (localcp == cp.a)
      {
        an localan = D(parambq);
        if (localan != null)
          localArrayList.add(localan);
      }
    return localArrayList;
  }

  public static ArrayList v(bq parambq)
  {
    ArrayList localArrayList = new ArrayList();
    cp localcp1 = parambq.p();
    if ((localcp1 != null) && (localcp1 == cp.c))
    {
      cp localcp2 = parambq.g();
      if ((localcp2 != null) && (localcp2 == cp.a))
      {
        cp localcp3 = parambq.g();
        if ((localcp3 != null) && (localcp3 != cp.b))
        {
          switch (bm.a[localcp3.ordinal()])
          {
          default:
          case 1:
          case 7:
          }
          while (true)
          {
            localcp3 = parambq.g();
            break;
            if ("results".equals(parambq.m()))
              while ((localcp3 != null) && (localcp3 != cp.d))
              {
                if (localcp3 == cp.a)
                {
                  cp localcp4 = parambq.g();
                  if ((localcp4 != null) && (localcp4 != cp.b))
                  {
                    switch (bm.a[localcp4.ordinal()])
                    {
                    default:
                    case 7:
                    }
                    while (true)
                    {
                      localcp4 = parambq.g();
                      break;
                      if ("value".equals(parambq.m()))
                        localArrayList.add(d(parambq));
                      else
                        parambq.h();
                    }
                  }
                }
                localcp3 = parambq.g();
              }
            parambq.h();
            continue;
            parambq.h();
          }
        }
      }
    }
    return localArrayList;
  }

  public static ArrayList w(bq parambq)
  {
    ArrayList localArrayList = new ArrayList();
    long l = System.currentTimeMillis();
    for (cp localcp = parambq.p(); (localcp != null) && (localcp != cp.d); localcp = parambq.g())
      if (localcp == cp.a)
      {
        parambq.g();
        co localco = b(parambq, l);
        if (localco != null)
          localArrayList.add(localco);
      }
    return localArrayList;
  }

  public static cn x(bq parambq)
  {
    Object localObject1 = null;
    ArrayList localArrayList = new ArrayList();
    label96: Object localObject2;
    boolean bool1;
    if (parambq.p() == cp.a)
    {
      cp localcp1 = parambq.g();
      boolean bool2 = true;
      Object localObject3 = localcp1;
      if ((localObject3 != null) && (localObject3 != cp.b))
      {
        Object localObject5;
        boolean bool4;
        switch (bm.a[localObject3.ordinal()])
        {
        case 2:
        case 3:
        default:
          localObject5 = localObject1;
          bool4 = bool2;
        case 1:
        case 7:
        case 4:
        case 5:
        case 6:
        }
        while (true)
        {
          cp localcp2 = parambq.g();
          bool2 = bool4;
          localObject1 = localObject5;
          localObject3 = localcp2;
          break;
          if (!"suggestions".equals(parambq.m()))
            break label96;
          while (localObject3 != cp.d)
          {
            if (localObject3 == cp.a)
            {
              String str = K(parambq);
              if (str != null)
                localArrayList.add(str);
            }
            localObject3 = parambq.g();
          }
          parambq.h();
          localObject5 = localObject1;
          bool4 = bool2;
          continue;
          if (!"msg".equals(parambq.m()))
            break label96;
          localObject5 = parambq.j();
          bool4 = bool2;
          continue;
          if (!"valid".equals(parambq.m()))
            break label96;
          boolean bool3 = parambq.q();
          Object localObject4 = localObject1;
          bool4 = bool3;
          localObject5 = localObject4;
        }
      }
      localObject2 = localObject1;
      bool1 = bool2;
    }
    while (true)
    {
      return new cn(bool1, localObject2, localArrayList);
      bool1 = true;
      localObject2 = null;
    }
  }

  public static dh y(bq parambq)
  {
    String str1 = null;
    long[] arrayOfLong3;
    long[] arrayOfLong4;
    String str3;
    String str4;
    cp localcp;
    label72: long[] arrayOfLong2;
    String str2;
    long[] arrayOfLong1;
    if (parambq.p() == cp.a)
    {
      arrayOfLong3 = null;
      arrayOfLong4 = null;
      str3 = null;
      str4 = null;
      localcp = parambq.g();
      switch (bm.a[localcp.ordinal()])
      {
      default:
        if (localcp == cp.b)
        {
          arrayOfLong2 = arrayOfLong3;
          long[] arrayOfLong5 = arrayOfLong4;
          str2 = str4;
          arrayOfLong1 = arrayOfLong5;
        }
      case 4:
      case 1:
      case 7:
      }
    }
    while (true)
    {
      return new dh(str2, str1, str3, arrayOfLong1, arrayOfLong2);
      String str6 = parambq.m();
      if ("favoriters_count".equals(str6))
      {
        str4 = parambq.j();
        break label72;
      }
      if ("repliers_count".equals(str6))
      {
        str3 = parambq.j();
        break label72;
      }
      if (!"retweeters_count".equals(str6))
        break label72;
      str1 = parambq.j();
      break label72;
      String str5 = parambq.m();
      if ("favoriters".equals(str5))
      {
        ArrayList localArrayList1 = new ArrayList();
        while ((localcp != null) && (localcp != cp.d))
        {
          if (localcp == cp.h)
            localArrayList1.add(Long.valueOf(parambq.e()));
          localcp = parambq.g();
        }
        arrayOfLong4 = cr.b(localArrayList1);
        break label72;
      }
      if ("retweeters".equals(str5))
      {
        ArrayList localArrayList2 = new ArrayList();
        while ((localcp != null) && (localcp != cp.d))
        {
          if (localcp == cp.h)
            localArrayList2.add(Long.valueOf(parambq.e()));
          localcp = parambq.g();
        }
        arrayOfLong3 = cr.b(localArrayList2);
        break label72;
      }
      parambq.h();
      break label72;
      parambq.h();
      break label72;
      break;
      str2 = null;
      str1 = null;
      str3 = null;
      arrayOfLong1 = null;
      arrayOfLong2 = null;
    }
  }

  private static dn z(bq parambq)
  {
    Object localObject1 = parambq.g();
    long l1 = 0L;
    String str1 = null;
    Object localObject2 = null;
    if ((localObject1 != null) && (localObject1 != cp.b))
    {
      String str2 = parambq.m();
      switch (bm.a[localObject1.ordinal()])
      {
      default:
      case 4:
      case 7:
      case 1:
      }
      while (true)
      {
        label72: long l2 = l1;
        Object localObject3 = localObject2;
        long l3 = l2;
        while (true)
        {
          cp localcp1 = parambq.g();
          long l4 = l3;
          localObject1 = localcp1;
          localObject2 = localObject3;
          l1 = l4;
          break;
          if ("name".equals(str2))
          {
            String str3 = parambq.j();
            long l7 = l1;
            localObject3 = str3;
            l3 = l7;
          }
          else
          {
            if (!"query".equals(str2))
              break label72;
            str1 = cr.b(parambq.j());
            long l6 = l1;
            localObject3 = localObject2;
            l3 = l6;
            continue;
            if ("promoted_content".equals(str2))
            {
              cp localcp2 = parambq.g();
              if ((localcp2 == null) || (localcp2 == cp.b))
                break label72;
              switch (bm.a[localcp2.ordinal()])
              {
              default:
              case 2:
              case 1:
              case 7:
              }
              while (true)
              {
                localcp2 = parambq.g();
                break;
                if ("promoted_trend_id".equals(parambq.m()))
                {
                  l1 = parambq.e();
                  continue;
                  parambq.h();
                }
              }
            }
            parambq.h();
            long l5 = l1;
            localObject3 = localObject2;
            l3 = l5;
          }
        }
        parambq.h();
      }
    }
    if ((localObject2 == null) || (str1 == null))
      return null;
    return new dn(localObject2, str1, 0L, l1);
  }
}

/* Location:
 * Qualified Name:     do
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
