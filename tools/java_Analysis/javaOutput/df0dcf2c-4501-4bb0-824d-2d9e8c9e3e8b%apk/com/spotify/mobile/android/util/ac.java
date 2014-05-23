package com.spotify.mobile.android.util;

import android.os.Build.VERSION;

public final class ac
{
  public static final boolean a;
  public static final boolean b;
  public static final boolean c;
  public static final boolean d;
  public static final boolean e;
  public static final boolean f;
  public static final boolean g;
  public static final boolean h;
  public static final boolean i;
  public static final boolean j;
  public static final boolean k;
  public static final boolean l;

  static
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    label26: boolean bool4;
    label40: boolean bool5;
    label55: boolean bool6;
    label71: boolean bool7;
    label87: boolean bool8;
    label103: boolean bool9;
    label119: boolean bool10;
    label135: boolean bool11;
    label151: boolean bool12;
    if (Build.VERSION.SDK_INT < 11)
    {
      bool2 = bool1;
      a = bool2;
      if (Build.VERSION.SDK_INT >= 12)
        break label190;
      bool3 = bool1;
      b = bool3;
      if (Build.VERSION.SDK_INT >= 14)
        break label195;
      bool4 = bool1;
      c = bool4;
      if (Build.VERSION.SDK_INT >= 16)
        break label200;
      bool5 = bool1;
      d = bool5;
      if (Build.VERSION.SDK_INT >= 17)
        break label206;
      bool6 = bool1;
      e = bool6;
      if (Build.VERSION.SDK_INT >= 18)
        break label212;
      bool7 = bool1;
      f = bool7;
      if (Build.VERSION.SDK_INT < 11)
        break label218;
      bool8 = bool1;
      g = bool8;
      if (Build.VERSION.SDK_INT < 12)
        break label224;
      bool9 = bool1;
      h = bool9;
      if (Build.VERSION.SDK_INT < 14)
        break label230;
      bool10 = bool1;
      i = bool10;
      if (Build.VERSION.SDK_INT < 16)
        break label236;
      bool11 = bool1;
      j = bool11;
      if (Build.VERSION.SDK_INT < 17)
        break label242;
      bool12 = bool1;
      label167: k = bool12;
      if (Build.VERSION.SDK_INT < 18)
        break label248;
    }
    while (true)
    {
      l = bool1;
      return;
      bool2 = false;
      break;
      label190: bool3 = false;
      break label26;
      label195: bool4 = false;
      break label40;
      label200: bool5 = false;
      break label55;
      label206: bool6 = false;
      break label71;
      label212: bool7 = false;
      break label87;
      label218: bool8 = false;
      break label103;
      label224: bool9 = false;
      break label119;
      label230: bool10 = false;
      break label135;
      label236: bool11 = false;
      break label151;
      label242: bool12 = false;
      break label167;
      label248: bool1 = false;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
