package com.spotify.android.paste.graphics;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.spotify.android.paste.b;
import com.spotify.android.paste.e;
import java.util.HashMap;

public final class g
{
  private static HashMap<String, Typeface> a = new HashMap();
  private static final int[] b = arrayOfInt;

  static
  {
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 16842804;
    arrayOfInt[1] = b.a;
  }

  private g()
  {
  }

  public static Typeface a(Context paramContext, int paramInt)
  {
    try
    {
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramInt, e.v);
      String str = localTypedArray.getString(1);
      localTypedArray.recycle();
      Typeface localTypeface = a(paramContext, str);
      return localTypeface;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static Typeface a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    try
    {
      TypedArray localTypedArray1 = paramContext.obtainStyledAttributes(paramAttributeSet, b, paramInt, 0);
      int i = localTypedArray1.getResourceId(0, -1);
      String str1 = null;
      if (i >= 0)
      {
        TypedArray localTypedArray2 = paramContext.obtainStyledAttributes(i, e.v);
        str1 = localTypedArray2.getString(1);
        localTypedArray2.recycle();
      }
      String str2 = localTypedArray1.getString(1);
      if (str2 != null);
      while (true)
      {
        localTypedArray1.recycle();
        Typeface localTypeface = a(paramContext, str2);
        return localTypeface;
        str2 = str1;
      }
    }
    finally
    {
    }
  }

  // ERROR //
  public static Typeface a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aconst_null
    //   4: astore_2
    //   5: aload_1
    //   6: ifnonnull +8 -> 14
    //   9: ldc 2
    //   11: monitorexit
    //   12: aload_2
    //   13: areturn
    //   14: getstatic 18	com/spotify/android/paste/graphics/g:a	Ljava/util/HashMap;
    //   17: aload_1
    //   18: invokevirtual 65	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   21: ifeq +17 -> 38
    //   24: getstatic 18	com/spotify/android/paste/graphics/g:a	Ljava/util/HashMap;
    //   27: aload_1
    //   28: invokevirtual 69	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   31: checkcast 71	android/graphics/Typeface
    //   34: astore_2
    //   35: goto -26 -> 9
    //   38: aload_0
    //   39: invokevirtual 75	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   42: invokevirtual 81	android/content/res/Resources:getAssets	()Landroid/content/res/AssetManager;
    //   45: astore 4
    //   47: aload 4
    //   49: aload_1
    //   50: invokestatic 85	android/graphics/Typeface:createFromAsset	(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;
    //   53: astore 8
    //   55: aload 8
    //   57: astore_2
    //   58: getstatic 18	com/spotify/android/paste/graphics/g:a	Ljava/util/HashMap;
    //   61: aload_1
    //   62: aload_2
    //   63: invokevirtual 89	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   66: pop
    //   67: goto -58 -> 9
    //   70: astore_3
    //   71: ldc 2
    //   73: monitorexit
    //   74: aload_3
    //   75: athrow
    //   76: astore 5
    //   78: ldc 2
    //   80: invokevirtual 95	java/lang/Class:getName	()Ljava/lang/String;
    //   83: new 97	java/lang/StringBuilder
    //   86: dup
    //   87: ldc 99
    //   89: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   92: aload_1
    //   93: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: invokevirtual 109	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   99: aload 5
    //   101: invokestatic 115	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   104: pop
    //   105: aconst_null
    //   106: astore_2
    //   107: goto -49 -> 58
    //
    // Exception table:
    //   from	to	target	type
    //   14	35	70	finally
    //   38	47	70	finally
    //   47	55	70	finally
    //   58	67	70	finally
    //   78	105	70	finally
    //   47	55	76	java/lang/Exception
  }

  public static Typeface b(Context paramContext, int paramInt)
  {
    try
    {
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(new int[] { paramInt });
      int i = localTypedArray.getResourceId(0, 0);
      localTypedArray.recycle();
      Typeface localTypeface = a(paramContext, i);
      return localTypeface;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.graphics.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
