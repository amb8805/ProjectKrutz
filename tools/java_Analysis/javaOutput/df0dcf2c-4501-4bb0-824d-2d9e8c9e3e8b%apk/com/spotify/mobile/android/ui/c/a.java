package com.spotify.mobile.android.ui.c;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.squareup.picasso.al;
import java.lang.reflect.Array;

public final class a
  implements al
{
  private Context a;

  public a(Context paramContext)
  {
    this.a = paramContext;
  }

  @TargetApi(17)
  public final Bitmap a(Bitmap paramBitmap)
  {
    Bitmap localBitmap = Bitmap.createBitmap((int)(0.25F * paramBitmap.getWidth()), (int)(0.25F * paramBitmap.getHeight()), paramBitmap.getConfig());
    Canvas localCanvas = new Canvas(localBitmap);
    localCanvas.scale(0.25F, 0.25F);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, localPaint);
    paramBitmap.recycle();
    int i = localBitmap.getWidth();
    int j = localBitmap.getHeight();
    int[] arrayOfInt1 = new int[i * j];
    localBitmap.getPixels(arrayOfInt1, 0, i, 0, 0, i, j);
    int k = i - 1;
    int m = j - 1;
    int n = i * j;
    int[] arrayOfInt2 = new int[n];
    int[] arrayOfInt3 = new int[n];
    int[] arrayOfInt4 = new int[n];
    int[] arrayOfInt5 = new int[Math.max(i, j)];
    int[] arrayOfInt6 = new int[30976];
    for (int i1 = 0; i1 < 30976; i1++)
      arrayOfInt6[i1] = (i1 / 121);
    int[] arrayOfInt7 = { 21, 3 };
    int[][] arrayOfInt = (int[][])Array.newInstance(Integer.TYPE, arrayOfInt7);
    int i2 = 0;
    int i3 = 0;
    int i55;
    for (int i4 = 0; i4 < j; i4 = i55)
    {
      int i42 = 0;
      int i43 = 0;
      int i44 = 0;
      int i45 = 0;
      int i46 = 0;
      int i47 = -10;
      int i48 = 0;
      int i49 = 0;
      int i50 = 0;
      int i51 = 0;
      if (i47 <= 10)
      {
        int i66 = arrayOfInt1[(i3 + Math.min(k, Math.max(i47, 0)))];
        int[] arrayOfInt13 = arrayOfInt[(i47 + 10)];
        arrayOfInt13[0] = ((0xFF0000 & i66) >> 16);
        arrayOfInt13[1] = ((0xFF00 & i66) >> 8);
        arrayOfInt13[2] = (i66 & 0xFF);
        int i67 = 11 - Math.abs(i47);
        i50 += i67 * arrayOfInt13[0];
        i49 += i67 * arrayOfInt13[1];
        i48 += i67 * arrayOfInt13[2];
        if (i47 > 0)
        {
          i43 += arrayOfInt13[0];
          i51 += arrayOfInt13[1];
          i42 += arrayOfInt13[2];
        }
        while (true)
        {
          i47++;
          break;
          i46 += arrayOfInt13[0];
          i45 += arrayOfInt13[1];
          i44 += arrayOfInt13[2];
        }
      }
      int i52 = 10;
      for (int i53 = 0; i53 < i; i53++)
      {
        arrayOfInt2[i3] = arrayOfInt6[i50];
        arrayOfInt3[i3] = arrayOfInt6[i49];
        arrayOfInt4[i3] = arrayOfInt6[i48];
        int i56 = i50 - i46;
        int i57 = i49 - i45;
        int i58 = i48 - i44;
        int[] arrayOfInt11 = arrayOfInt[((21 + (i52 - 10)) % 21)];
        int i59 = i46 - arrayOfInt11[0];
        int i60 = i45 - arrayOfInt11[1];
        int i61 = i44 - arrayOfInt11[2];
        if (i4 == 0)
          arrayOfInt5[i53] = Math.min(1 + (i53 + 10), k);
        int i62 = arrayOfInt1[(i2 + arrayOfInt5[i53])];
        arrayOfInt11[0] = ((0xFF0000 & i62) >> 16);
        arrayOfInt11[1] = ((0xFF00 & i62) >> 8);
        arrayOfInt11[2] = (i62 & 0xFF);
        int i63 = i43 + arrayOfInt11[0];
        int i64 = i51 + arrayOfInt11[1];
        int i65 = i42 + arrayOfInt11[2];
        i50 = i56 + i63;
        i49 = i57 + i64;
        i48 = i58 + i65;
        i52 = (i52 + 1) % 21;
        int[] arrayOfInt12 = arrayOfInt[(i52 % 21)];
        i46 = i59 + arrayOfInt12[0];
        i45 = i60 + arrayOfInt12[1];
        i44 = i61 + arrayOfInt12[2];
        i43 = i63 - arrayOfInt12[0];
        i51 = i64 - arrayOfInt12[1];
        i42 = i65 - arrayOfInt12[2];
        i3++;
      }
      int i54 = i2 + i;
      i55 = i4 + 1;
      i2 = i54;
    }
    for (int i5 = 0; i5 < i; i5++)
    {
      int i6 = 0;
      int i7 = i * -10;
      int i8 = 0;
      int i9 = 0;
      int i10 = 0;
      int i11 = 0;
      int i12 = -10;
      int i13 = 0;
      int i14 = 0;
      int i15 = 0;
      int i16 = 0;
      if (i12 <= 10)
      {
        int i40 = i5 + Math.max(0, i7);
        int[] arrayOfInt10 = arrayOfInt[(i12 + 10)];
        arrayOfInt10[0] = arrayOfInt2[i40];
        arrayOfInt10[1] = arrayOfInt3[i40];
        arrayOfInt10[2] = arrayOfInt4[i40];
        int i41 = 11 - Math.abs(i12);
        i15 += i41 * arrayOfInt2[i40];
        i14 += i41 * arrayOfInt3[i40];
        i13 += i41 * arrayOfInt4[i40];
        if (i12 > 0)
        {
          i8 += arrayOfInt10[0];
          i16 += arrayOfInt10[1];
          i6 += arrayOfInt10[2];
        }
        while (true)
        {
          if (i12 < m)
            i7 += i;
          i12++;
          break;
          i11 += arrayOfInt10[0];
          i10 += arrayOfInt10[1];
          i9 += arrayOfInt10[2];
        }
      }
      int i17 = i15;
      int i18 = i14;
      int i19 = i13;
      int i20 = 0;
      int i21 = i5;
      int i22 = i11;
      int i23 = 10;
      int i24 = i6;
      int i25 = i16;
      int i26 = i8;
      int i27 = i9;
      int i28 = i10;
      int i29 = i22;
      while (i20 < j)
      {
        arrayOfInt1[i21] = (0xFF000000 & arrayOfInt1[i21] | arrayOfInt6[i17] << 16 | arrayOfInt6[i18] << 8 | arrayOfInt6[i19]);
        int i30 = i17 - i29;
        int i31 = i18 - i28;
        int i32 = i19 - i27;
        int[] arrayOfInt8 = arrayOfInt[((21 + (i23 - 10)) % 21)];
        int i33 = i29 - arrayOfInt8[0];
        int i34 = i28 - arrayOfInt8[1];
        int i35 = i27 - arrayOfInt8[2];
        if (i5 == 0)
          arrayOfInt5[i20] = (i * Math.min(i20 + 11, m));
        int i36 = i5 + arrayOfInt5[i20];
        arrayOfInt8[0] = arrayOfInt2[i36];
        arrayOfInt8[1] = arrayOfInt3[i36];
        arrayOfInt8[2] = arrayOfInt4[i36];
        int i37 = i26 + arrayOfInt8[0];
        int i38 = i25 + arrayOfInt8[1];
        int i39 = i24 + arrayOfInt8[2];
        i17 = i30 + i37;
        i18 = i31 + i38;
        i19 = i32 + i39;
        i23 = (i23 + 1) % 21;
        int[] arrayOfInt9 = arrayOfInt[i23];
        i29 = i33 + arrayOfInt9[0];
        i28 = i34 + arrayOfInt9[1];
        i27 = i35 + arrayOfInt9[2];
        i26 = i37 - arrayOfInt9[0];
        i25 = i38 - arrayOfInt9[1];
        i24 = i39 - arrayOfInt9[2];
        i21 += i;
        i20++;
      }
    }
    localBitmap.setPixels(arrayOfInt1, 0, i, 0, 0, i, j);
    return localBitmap;
  }

  public final String a()
  {
    return "stackBlur()";
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
