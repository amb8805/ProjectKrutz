package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.net.Uri;

final class c extends d
{
  private static final int n = 22;
  private AssetManager o;

  public c(Context paramContext, Picasso paramPicasso, j paramj, e parame, ag paramag, a parama)
  {
    super(paramPicasso, paramj, parame, paramag, parama);
    this.o = paramContext.getAssets();
  }

  // ERROR //
  private Bitmap a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: getfield 31	com/squareup/picasso/c:f	Lcom/squareup/picasso/ac;
    //   6: invokestatic 35	com/squareup/picasso/c:b	(Lcom/squareup/picasso/ac;)Landroid/graphics/BitmapFactory$Options;
    //   9: astore_3
    //   10: aload_0
    //   11: getfield 31	com/squareup/picasso/c:f	Lcom/squareup/picasso/ac;
    //   14: invokevirtual 40	com/squareup/picasso/ac:a	()Z
    //   17: ifeq +46 -> 63
    //   20: aload_3
    //   21: iconst_1
    //   22: putfield 46	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   25: aload_0
    //   26: getfield 25	com/squareup/picasso/c:o	Landroid/content/res/AssetManager;
    //   29: aload_1
    //   30: invokevirtual 52	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   33: astore_2
    //   34: aload_2
    //   35: aconst_null
    //   36: aload_3
    //   37: invokestatic 58	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   40: pop
    //   41: aload_2
    //   42: invokestatic 63	com/squareup/picasso/an:a	(Ljava/io/InputStream;)V
    //   45: aload_0
    //   46: getfield 31	com/squareup/picasso/c:f	Lcom/squareup/picasso/ac;
    //   49: getfield 66	com/squareup/picasso/ac:e	I
    //   52: aload_0
    //   53: getfield 31	com/squareup/picasso/c:f	Lcom/squareup/picasso/ac;
    //   56: getfield 68	com/squareup/picasso/ac:f	I
    //   59: aload_3
    //   60: invokestatic 71	com/squareup/picasso/c:a	(IILandroid/graphics/BitmapFactory$Options;)V
    //   63: aload_0
    //   64: getfield 25	com/squareup/picasso/c:o	Landroid/content/res/AssetManager;
    //   67: aload_1
    //   68: invokevirtual 52	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   71: astore 4
    //   73: aload 4
    //   75: aconst_null
    //   76: aload_3
    //   77: invokestatic 58	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   80: astore 6
    //   82: aload 4
    //   84: invokestatic 63	com/squareup/picasso/an:a	(Ljava/io/InputStream;)V
    //   87: aload 6
    //   89: areturn
    //   90: astore 7
    //   92: aload_2
    //   93: invokestatic 63	com/squareup/picasso/an:a	(Ljava/io/InputStream;)V
    //   96: aload 7
    //   98: athrow
    //   99: astore 5
    //   101: aload 4
    //   103: invokestatic 63	com/squareup/picasso/an:a	(Ljava/io/InputStream;)V
    //   106: aload 5
    //   108: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   25	41	90	finally
    //   73	82	99	finally
  }

  final Bitmap a(ac paramac)
  {
    return a(paramac.a.toString().substring(n));
  }

  final Picasso.LoadedFrom a()
  {
    return Picasso.LoadedFrom.b;
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
