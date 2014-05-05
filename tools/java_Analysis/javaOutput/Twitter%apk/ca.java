import java.io.Reader;

public abstract class ca extends bt
{
  public ca(q paramq, int paramInt, Reader paramReader)
  {
    super(paramq, paramInt, paramReader);
  }

  protected final cp c(int paramInt)
  {
    boolean bool;
    int j;
    int k;
    int m;
    int n;
    if (paramInt == 45)
    {
      bool = true;
      int i = this.c;
      j = i - 1;
      k = this.d;
      if (bool)
      {
        if (i >= this.d)
          break label452;
        char[] arrayOfChar15 = this.a;
        int i53 = i + 1;
        int i54 = arrayOfChar15[i];
        if ((i54 > 57) || (i54 < 48))
          a(i54, "expected digit (0-9) to follow minus sign, for valid numeric value");
        i = i53;
      }
      m = i;
      n = 1;
    }
    while (true)
    {
      int i36;
      int i37;
      int i40;
      int i39;
      int i38;
      if (m < this.d)
      {
        char[] arrayOfChar10 = this.a;
        i36 = m + 1;
        i37 = arrayOfChar10[m];
        if ((i37 >= 48) && (i37 <= 57))
        {
          n++;
          if ((n != 2) || (this.a[(i36 - 2)] != '0'))
            break label1365;
          a("Leading zeroes not allowed");
          m = i36;
          continue;
          bool = false;
          break;
        }
        if (i37 != 46)
          break label1351;
        i40 = 0;
        int i50 = i36;
        while (i50 < k)
        {
          char[] arrayOfChar14 = this.a;
          int i51 = i50 + 1;
          int i52 = arrayOfChar14[i50];
          if ((i52 >= 48) && (i52 <= 57))
          {
            i40++;
            i50 = i51;
          }
          else
          {
            if (i40 == 0)
              a(i52, "Decimal point not followed by a digit");
            i39 = i52;
            i38 = i51;
          }
        }
      }
      while (true)
      {
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        if ((i39 == 101) || (i39 == 69))
          if (i38 < k)
          {
            char[] arrayOfChar11 = this.a;
            i41 = i38 + 1;
            i42 = arrayOfChar11[i38];
            if ((i42 != 45) && (i42 != 43))
              break label1331;
            if (i41 < k)
            {
              char[] arrayOfChar12 = this.a;
              i43 = i41 + 1;
              i44 = arrayOfChar12[i41];
              i45 = 0;
              while ((i44 <= 57) && (i44 >= 48))
              {
                i45++;
                if (i43 >= k)
                  break label452;
                char[] arrayOfChar13 = this.a;
                int i49 = i43 + 1;
                i44 = arrayOfChar13[i43];
                i43 = i49;
              }
              if (i45 == 0)
                a(i44, "Exponent indicator not followed by a digit");
              i46 = i45;
              i38 = i43;
            }
          }
        while (true)
        {
          int i47 = i38 - 1;
          this.c = i47;
          int i48 = i47 - j;
          this.m.a(this.a, j, i48);
          return a(bool, n, i40, i46);
          label452: int i1;
          int i2;
          char[] arrayOfChar2;
          int i3;
          label502: int i5;
          int i6;
          label526: int i11;
          char[] arrayOfChar4;
          int i32;
          int i10;
          label598: int i9;
          int i8;
          if (bool)
          {
            i1 = j + 1;
            this.c = i1;
            char[] arrayOfChar1 = this.m.i();
            i2 = 0;
            if (bool)
            {
              i2 = 0 + 1;
              arrayOfChar1[0] = '-';
            }
            arrayOfChar2 = arrayOfChar1;
            i3 = 0;
            if ((this.c < this.d) || (a()))
              break label971;
            i5 = 0;
            i6 = 1;
            if (i3 == 0)
              a("Missing integer part (next char " + b(i5) + ")");
            if (i5 != 46)
              break label1309;
            int i31 = i2 + 1;
            arrayOfChar2[i2] = i5;
            i11 = 0;
            arrayOfChar4 = arrayOfChar2;
            i32 = i5;
            i10 = i31;
            if ((this.c < this.d) || (a()))
              break label1085;
            i9 = i32;
            i8 = 1;
            label623: if (i11 == 0)
              a(i9, "Decimal point not followed by a digit");
          }
          while (true)
          {
            int i12;
            int i13;
            label721: int i14;
            label755: int i15;
            int i16;
            int i18;
            char[] arrayOfChar5;
            int i17;
            label817: int i20;
            int i21;
            label829: int i25;
            int i26;
            int i24;
            int i23;
            if ((i9 == 101) || (i9 == 69))
            {
              if (i10 >= arrayOfChar4.length)
              {
                arrayOfChar4 = this.m.k();
                i10 = 0;
              }
              i12 = i10 + 1;
              arrayOfChar4[i10] = i9;
              if (this.c < this.d)
              {
                char[] arrayOfChar8 = this.a;
                int i30 = this.c;
                this.c = (i30 + 1);
                i13 = arrayOfChar8[i30];
                if ((i13 != 45) && (i13 != 43))
                  break label1266;
                if (i12 < arrayOfChar4.length)
                  break label1259;
                arrayOfChar4 = this.m.k();
                i14 = 0;
                i15 = i14 + 1;
                arrayOfChar4[i14] = i13;
                if (this.c >= this.d)
                  break label1180;
                char[] arrayOfChar7 = this.a;
                int i29 = this.c;
                this.c = (i29 + 1);
                i16 = arrayOfChar7[i29];
                i18 = 0;
                arrayOfChar5 = arrayOfChar4;
                i17 = i15;
                int i19 = i18;
                i20 = i16;
                i21 = i19;
                if ((i20 > 57) || (i20 < 48))
                  break label1244;
                i25 = i21 + 1;
                if (i17 >= arrayOfChar5.length)
                {
                  arrayOfChar5 = this.m.k();
                  i17 = 0;
                }
                i26 = i17 + 1;
                arrayOfChar5[i17] = i20;
                if ((this.c < this.d) || (a()))
                  break label1202;
                i17 = i26;
                i24 = i25;
                i23 = 1;
                label911: if (i24 == 0)
                  a(i20, "Exponent indicator not followed by a digit");
                i10 = i17;
              }
            }
            while (true)
            {
              if (i23 == 0)
                this.c -= 1;
              this.m.a(i10);
              return a(bool, i3, i11, i24);
              i1 = j;
              break;
              label971: char[] arrayOfChar3 = this.a;
              int i4 = this.c;
              this.c = (i4 + 1);
              i5 = arrayOfChar3[i4];
              i6 = 0;
              if (i5 < 48)
                break label526;
              i6 = 0;
              if (i5 > 57)
                break label526;
              i3++;
              if ((i3 == 2) && (arrayOfChar2[(i2 - 1)] == '0'))
                a("Leading zeroes not allowed");
              if (i2 >= arrayOfChar2.length)
              {
                arrayOfChar2 = this.m.k();
                i2 = 0;
              }
              int i7 = i2 + 1;
              arrayOfChar2[i2] = i5;
              i2 = i7;
              break label502;
              label1085: char[] arrayOfChar9 = this.a;
              int i33 = this.c;
              this.c = (i33 + 1);
              i32 = arrayOfChar9[i33];
              if ((i32 < 48) || (i32 > 57))
                break label1294;
              i11++;
              if (i10 >= arrayOfChar4.length)
              {
                arrayOfChar4 = this.m.k();
                i10 = 0;
              }
              int i35 = i10 + 1;
              arrayOfChar4[i10] = i32;
              i10 = i35;
              break label598;
              i13 = e("expected a digit for number exponent");
              break label721;
              label1180: i16 = e("expected a digit for number exponent");
              arrayOfChar5 = arrayOfChar4;
              i17 = i15;
              i18 = 0;
              break label817;
              label1202: char[] arrayOfChar6 = this.a;
              int i27 = this.c;
              this.c = (i27 + 1);
              int i28 = arrayOfChar6[i27];
              i17 = i26;
              i16 = i28;
              i18 = i25;
              break label817;
              label1244: int i22 = i21;
              i23 = i8;
              i24 = i22;
              break label911;
              label1259: i14 = i12;
              break label755;
              label1266: i20 = i13;
              arrayOfChar5 = arrayOfChar4;
              i17 = i12;
              i21 = 0;
              break label829;
              i23 = i8;
              i24 = 0;
            }
            label1294: int i34 = i6;
            i9 = i32;
            i8 = i34;
            break label623;
            label1309: arrayOfChar4 = arrayOfChar2;
            i8 = i6;
            i9 = i5;
            i10 = i2;
            i11 = 0;
          }
          label1331: i43 = i41;
          i44 = i42;
          i45 = 0;
          break;
          i46 = 0;
        }
        label1351: i38 = i36;
        i39 = i37;
        i40 = 0;
      }
      label1365: m = i36;
    }
  }
}

/* Location:
 * Qualified Name:     ca
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
