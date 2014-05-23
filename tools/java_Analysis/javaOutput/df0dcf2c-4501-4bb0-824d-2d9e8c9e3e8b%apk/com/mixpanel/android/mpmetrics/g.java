package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.os.AsyncTask;
import android.view.View;
import java.lang.reflect.Array;

final class g extends AsyncTask<Void, Void, Void>
{
  private final h a;
  private final Activity b;
  private Bitmap c;
  private int d;

  public g(Activity paramActivity, h paramh)
  {
    this.b = paramActivity;
    this.a = paramh;
  }

  private Void a()
  {
    if (this.c == null)
    {
      this.d = -1;
      this.c = null;
      return null;
    }
    int i;
    try
    {
      System.currentTimeMillis();
      this.d = Bitmap.createScaledBitmap(this.c, 1, 1, true).getPixel(0, 0);
      Bitmap localBitmap = this.c;
      i = localBitmap.getWidth();
      j = localBitmap.getHeight();
      int[] arrayOfInt1 = new int[i * j];
      localBitmap.getPixels(arrayOfInt1, 0, i, 0, 0, i, j);
      k = i - 1;
      m = j - 1;
      n = i * j;
      arrayOfInt2 = new int[n];
      arrayOfInt3 = new int[n];
      arrayOfInt4 = new int[n];
      arrayOfInt5 = new int[Math.max(i, j)];
      arrayOfInt6 = new int[112896];
      for (i1 = 0; i1 < 112896; i1++)
        arrayOfInt6[i1] = (i1 / 441);
      arrayOfInt7 = new int[] { 41, 3 };
      arrayOfInt = (int[][])Array.newInstance(Integer.TYPE, arrayOfInt7);
      i2 = 0;
      i3 = 0;
      i4 = 0;
      break label1206;
      if (i42 <= 20)
      {
        i52 = arrayOfInt1[(i2 + Math.min(k, Math.max(i42, 0)))];
        arrayOfInt11 = arrayOfInt[(i42 + 20)];
        arrayOfInt11[0] = ((0xFF0000 & i52) >> 16);
        arrayOfInt11[1] = ((0xFF00 & i52) >> 8);
        arrayOfInt11[2] = (i52 & 0xFF);
        i53 = 21 - Math.abs(i42);
        i51 += i53 * arrayOfInt11[0];
        i50 += i53 * arrayOfInt11[1];
        i49 += i53 * arrayOfInt11[2];
        if (i42 > 0)
        {
          i45 += arrayOfInt11[0];
          i44 += arrayOfInt11[1];
          i43 += arrayOfInt11[2];
        }
        else
        {
          i48 += arrayOfInt11[0];
          i47 += arrayOfInt11[1];
          i46 += arrayOfInt11[2];
          break label1247;
          while (i55 < i)
          {
            arrayOfInt2[i2] = arrayOfInt6[i51];
            arrayOfInt3[i2] = arrayOfInt6[i50];
            arrayOfInt4[i2] = arrayOfInt6[i49];
            i56 = i51 - i48;
            i57 = i50 - i47;
            i58 = i49 - i46;
            arrayOfInt12 = arrayOfInt[((41 + (i54 - 20)) % 41)];
            i59 = i48 - arrayOfInt12[0];
            i60 = i47 - arrayOfInt12[1];
            i61 = i46 - arrayOfInt12[2];
            if (i4 == 0)
              arrayOfInt5[i55] = Math.min(1 + (i55 + 20), k);
            i62 = arrayOfInt1[(i3 + arrayOfInt5[i55])];
            arrayOfInt12[0] = ((0xFF0000 & i62) >> 16);
            arrayOfInt12[1] = ((0xFF00 & i62) >> 8);
            arrayOfInt12[2] = (i62 & 0xFF);
            i63 = i45 + arrayOfInt12[0];
            i64 = i44 + arrayOfInt12[1];
            i65 = i43 + arrayOfInt12[2];
            i51 = i56 + i63;
            i50 = i57 + i64;
            i49 = i58 + i65;
            i54 = (i54 + 1) % 41;
            arrayOfInt13 = arrayOfInt[(i54 % 41)];
            i48 = i59 + arrayOfInt13[0];
            i47 = i60 + arrayOfInt13[1];
            i46 = i61 + arrayOfInt13[2];
            i45 = i63 - arrayOfInt13[0];
            i44 = i64 - arrayOfInt13[1];
            i43 = i65 - arrayOfInt13[2];
            i2++;
            i55++;
            continue;
            if (i7 > 20)
              break label1358;
            i17 = i5 + Math.max(0, i6);
            arrayOfInt8 = arrayOfInt[(i7 + 20)];
            arrayOfInt8[0] = arrayOfInt2[i17];
            arrayOfInt8[1] = arrayOfInt3[i17];
            arrayOfInt8[2] = arrayOfInt4[i17];
            i18 = 21 - Math.abs(i7);
            i16 += i18 * arrayOfInt2[i17];
            i15 += i18 * arrayOfInt3[i17];
            i14 += i18 * arrayOfInt4[i17];
            if (i7 > 0)
            {
              i10 += arrayOfInt8[0];
              i9 += arrayOfInt8[1];
              i8 += arrayOfInt8[2];
              break label1338;
            }
            i13 += arrayOfInt8[0];
            i12 += arrayOfInt8[1];
            i11 += arrayOfInt8[2];
            break label1338;
            while (i31 < j)
            {
              arrayOfInt1[i22] = (0xFF000000 | arrayOfInt6[i19] << 16 | arrayOfInt6[i20] << 8 | arrayOfInt6[i21]);
              i32 = i19 - i30;
              i33 = i20 - i29;
              i34 = i21 - i28;
              arrayOfInt9 = arrayOfInt[((41 + (i24 - 20)) % 41)];
              i35 = i30 - arrayOfInt9[0];
              i36 = i29 - arrayOfInt9[1];
              i37 = i28 - arrayOfInt9[2];
              if (i5 == 0)
                arrayOfInt5[i31] = (i * Math.min(i31 + 21, m));
              i38 = i5 + arrayOfInt5[i31];
              arrayOfInt9[0] = arrayOfInt2[i38];
              arrayOfInt9[1] = arrayOfInt3[i38];
              arrayOfInt9[2] = arrayOfInt4[i38];
              i39 = i27 + arrayOfInt9[0];
              i40 = i26 + arrayOfInt9[1];
              i41 = i25 + arrayOfInt9[2];
              i19 = i32 + i39;
              i20 = i33 + i40;
              i21 = i34 + i41;
              i24 = (i24 + 1) % 41;
              arrayOfInt10 = arrayOfInt[i24];
              i30 = i35 + arrayOfInt10[0];
              i29 = i36 + arrayOfInt10[1];
              i28 = i37 + arrayOfInt10[2];
              i27 = i39 - arrayOfInt10[0];
              i26 = i40 - arrayOfInt10[1];
              i25 = i41 - arrayOfInt10[2];
              i22 += i;
              i31++;
              continue;
              localBitmap.setPixels(arrayOfInt1, 0, i, 0, 0, i, j);
              System.currentTimeMillis();
              new Canvas(this.c).drawColor(f.a(), PorterDuff.Mode.SRC_ATOP);
              return null;
            }
          }
        }
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      int j;
      while (true)
      {
        this.d = -1;
        this.c = null;
      }
      while (true)
      {
        if (i4 >= j)
          break label1287;
        i42 = -20;
        i43 = 0;
        i44 = 0;
        i45 = 0;
        i46 = 0;
        i47 = 0;
        i48 = 0;
        i49 = 0;
        i50 = 0;
        i51 = 0;
        break;
        i42++;
        break;
        i54 = 20;
        i55 = 0;
        break label388;
        i66 = i3 + i;
        i67 = i4 + 1;
        i3 = i66;
        i4 = i67;
      }
      i5 = 0;
    }
    while (true)
    {
      int k;
      int m;
      int n;
      int[] arrayOfInt2;
      int[] arrayOfInt3;
      int[] arrayOfInt4;
      int[] arrayOfInt5;
      int[] arrayOfInt6;
      int i1;
      int[] arrayOfInt7;
      int[][] arrayOfInt;
      int i2;
      int i3;
      int i4;
      int i42;
      int i52;
      int[] arrayOfInt11;
      int i53;
      int i51;
      int i50;
      int i49;
      int i45;
      int i44;
      int i43;
      int i48;
      int i47;
      int i46;
      label388: int i55;
      int i56;
      int i57;
      int i58;
      int i54;
      int[] arrayOfInt12;
      int i59;
      int i60;
      int i61;
      int i62;
      int i63;
      int i64;
      int i65;
      int[] arrayOfInt13;
      int i7;
      int i5;
      int i6;
      int i17;
      int[] arrayOfInt8;
      int i18;
      int i16;
      int i15;
      int i14;
      int i10;
      int i9;
      int i8;
      int i13;
      int i12;
      int i11;
      int i31;
      int i22;
      int i19;
      int i20;
      int i21;
      int i30;
      int i32;
      int i29;
      int i33;
      int i28;
      int i34;
      int i24;
      int[] arrayOfInt9;
      int i35;
      int i36;
      int i37;
      int i38;
      int i27;
      int i39;
      int i26;
      int i40;
      int i25;
      int i41;
      int[] arrayOfInt10;
      label1206: label1247: int i66;
      int i67;
      label1287: if (i5 < i)
      {
        i6 = i * -20;
        i7 = -20;
        i8 = 0;
        i9 = 0;
        i10 = 0;
        i11 = 0;
        i12 = 0;
        i13 = 0;
        i14 = 0;
        i15 = 0;
        i16 = 0;
        continue;
        label1338: if (i7 < m)
          i6 += i;
        i7++;
        continue;
        label1358: i19 = i16;
        i20 = i15;
        i21 = i14;
        i22 = i5;
        int i23 = i13;
        i24 = 20;
        i25 = i8;
        i26 = i9;
        i27 = i10;
        i28 = i11;
        i29 = i12;
        i30 = i23;
        i31 = 0;
        continue;
        i5++;
      }
    }
  }

  protected final void onPreExecute()
  {
    View localView = this.b.findViewById(16908290).getRootView();
    boolean bool = localView.isDrawingCacheEnabled();
    localView.setDrawingCacheEnabled(true);
    localView.buildDrawingCache(true);
    Bitmap localBitmap1 = localView.getDrawingCache();
    Bitmap localBitmap2 = null;
    if (localBitmap1 != null)
    {
      int i = localBitmap1.getWidth();
      localBitmap2 = null;
      if (i > 0)
      {
        int j = localBitmap1.getHeight();
        localBitmap2 = null;
        if (j > 0)
        {
          int k = localBitmap1.getWidth() / 2;
          int m = localBitmap1.getHeight() / 2;
          localBitmap2 = null;
          if (k > 0)
          {
            localBitmap2 = null;
            if (m > 0)
              localBitmap2 = Bitmap.createScaledBitmap(localBitmap1, k, m, false);
          }
        }
      }
    }
    if (!bool)
      localView.setDrawingCacheEnabled(false);
    this.c = localBitmap2;
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
