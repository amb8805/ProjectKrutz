package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;

class h extends d
{
  final Context n;

  h(Context paramContext, Picasso paramPicasso, j paramj, e parame, ag paramag, a parama)
  {
    super(paramPicasso, paramj, parame, paramag, parama);
    this.n = paramContext;
  }

  // ERROR //
  private Bitmap c(ac paramac)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: getfield 13	com/squareup/picasso/h:n	Landroid/content/Context;
    //   6: invokevirtual 21	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   9: astore_3
    //   10: aload_1
    //   11: invokestatic 25	com/squareup/picasso/h:b	(Lcom/squareup/picasso/ac;)Landroid/graphics/BitmapFactory$Options;
    //   14: astore 4
    //   16: aload_1
    //   17: invokevirtual 31	com/squareup/picasso/ac:a	()Z
    //   20: ifeq +43 -> 63
    //   23: aload 4
    //   25: iconst_1
    //   26: putfield 37	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   29: aload_3
    //   30: aload_1
    //   31: getfield 40	com/squareup/picasso/ac:a	Landroid/net/Uri;
    //   34: invokevirtual 46	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   37: astore_2
    //   38: aload_2
    //   39: aconst_null
    //   40: aload 4
    //   42: invokestatic 52	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   45: pop
    //   46: aload_2
    //   47: invokestatic 57	com/squareup/picasso/an:a	(Ljava/io/InputStream;)V
    //   50: aload_1
    //   51: getfield 61	com/squareup/picasso/ac:e	I
    //   54: aload_1
    //   55: getfield 64	com/squareup/picasso/ac:f	I
    //   58: aload 4
    //   60: invokestatic 67	com/squareup/picasso/h:a	(IILandroid/graphics/BitmapFactory$Options;)V
    //   63: aload_3
    //   64: aload_1
    //   65: getfield 40	com/squareup/picasso/ac:a	Landroid/net/Uri;
    //   68: invokevirtual 46	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   71: astore 5
    //   73: aload 5
    //   75: aconst_null
    //   76: aload 4
    //   78: invokestatic 52	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   81: astore 7
    //   83: aload 5
    //   85: invokestatic 57	com/squareup/picasso/an:a	(Ljava/io/InputStream;)V
    //   88: aload 7
    //   90: areturn
    //   91: astore 8
    //   93: aload_2
    //   94: invokestatic 57	com/squareup/picasso/an:a	(Ljava/io/InputStream;)V
    //   97: aload 8
    //   99: athrow
    //   100: astore 6
    //   102: aload 5
    //   104: invokestatic 57	com/squareup/picasso/an:a	(Ljava/io/InputStream;)V
    //   107: aload 6
    //   109: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   29	46	91	finally
    //   73	83	100	finally
  }

  Bitmap a(ac paramac)
  {
    return c(paramac);
  }

  final Picasso.LoadedFrom a()
  {
    return Picasso.LoadedFrom.b;
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
