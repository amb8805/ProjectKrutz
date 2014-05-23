package com.spotify.mobile.android.spotlets.artist.adapters;

import android.content.Context;
import android.widget.BaseAdapter;
import com.google.common.collect.ak;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Concert;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class b extends BaseAdapter
{
  private final List<ArtistModel.Concert> a;
  private Context b;
  private final Map<Integer, com.spotify.mobile.android.spotlets.artist.view.b.b> c = ak.a();
  private final SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());

  public b(Context paramContext, List<ArtistModel.Concert> paramList)
  {
    this.b = paramContext;
    this.a = paramList;
  }

  public final int getCount()
  {
    return this.a.size();
  }

  public final Object getItem(int paramInt)
  {
    return this.a.get(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  // ERROR //
  public final android.view.View getView(int paramInt, android.view.View paramView, android.view.ViewGroup paramViewGroup)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull +354 -> 355
    //   4: new 65	com/spotify/android/paste/widget/ListItemView
    //   7: dup
    //   8: aload_0
    //   9: getfield 43	com/spotify/mobile/android/spotlets/artist/adapters/b:b	Landroid/content/Context;
    //   12: invokespecial 68	com/spotify/android/paste/widget/ListItemView:<init>	(Landroid/content/Context;)V
    //   15: astore 4
    //   17: aload 4
    //   19: checkcast 65	com/spotify/android/paste/widget/ListItemView
    //   22: astore 5
    //   24: aload_0
    //   25: getfield 45	com/spotify/mobile/android/spotlets/artist/adapters/b:a	Ljava/util/List;
    //   28: iload_1
    //   29: invokeinterface 57 2 0
    //   34: checkcast 70	com/spotify/mobile/android/spotlets/artist/model/ArtistModel$Concert
    //   37: astore 6
    //   39: aload 5
    //   41: invokevirtual 73	com/spotify/android/paste/widget/ListItemView:a	()Landroid/widget/ImageView;
    //   44: invokevirtual 79	android/widget/ImageView:getDrawable	()Landroid/graphics/drawable/Drawable;
    //   47: astore 7
    //   49: aload 7
    //   51: ifnull +11 -> 62
    //   54: aload 7
    //   56: instanceof 81
    //   59: ifne +48 -> 107
    //   62: aload_0
    //   63: getfield 43	com/spotify/mobile/android/spotlets/artist/adapters/b:b	Landroid/content/Context;
    //   66: invokestatic 86	com/spotify/android/paste/widget/f:a	(Landroid/content/Context;)Z
    //   69: ifeq +292 -> 361
    //   72: ldc 87
    //   74: istore 8
    //   76: aload_0
    //   77: getfield 43	com/spotify/mobile/android/spotlets/artist/adapters/b:b	Landroid/content/Context;
    //   80: invokestatic 93	android/view/LayoutInflater:from	(Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   83: iload 8
    //   85: aconst_null
    //   86: invokevirtual 97	android/view/LayoutInflater:inflate	(ILandroid/view/ViewGroup;)Landroid/view/View;
    //   89: checkcast 99	android/widget/LinearLayout
    //   92: invokestatic 102	com/spotify/mobile/android/spotlets/artist/view/h:a	(Landroid/view/View;)Lcom/spotify/mobile/android/spotlets/artist/view/h;
    //   95: astore 9
    //   97: aload 5
    //   99: invokevirtual 73	com/spotify/android/paste/widget/ListItemView:a	()Landroid/widget/ImageView;
    //   102: aload 9
    //   104: invokevirtual 106	android/widget/ImageView:setImageDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   107: aload 5
    //   109: invokevirtual 73	com/spotify/android/paste/widget/ListItemView:a	()Landroid/widget/ImageView;
    //   112: invokevirtual 79	android/widget/ImageView:getDrawable	()Landroid/graphics/drawable/Drawable;
    //   115: checkcast 81	com/spotify/mobile/android/spotlets/artist/view/h
    //   118: invokevirtual 109	com/spotify/mobile/android/spotlets/artist/view/h:a	()Landroid/view/View;
    //   121: checkcast 99	android/widget/LinearLayout
    //   124: astore 10
    //   126: aload_0
    //   127: getfield 41	com/spotify/mobile/android/spotlets/artist/adapters/b:d	Ljava/text/SimpleDateFormat;
    //   130: aload 6
    //   132: getfield 113	com/spotify/mobile/android/spotlets/artist/model/ArtistModel$Concert:localtime	Ljava/lang/String;
    //   135: invokevirtual 117	java/text/SimpleDateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   138: astore 19
    //   140: invokestatic 123	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   143: astore 20
    //   145: aload 20
    //   147: aload 19
    //   149: invokevirtual 127	java/util/Calendar:setTime	(Ljava/util/Date;)V
    //   152: aload 20
    //   154: iconst_2
    //   155: iconst_1
    //   156: invokestatic 36	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   159: invokevirtual 131	java/util/Calendar:getDisplayName	(IILjava/util/Locale;)Ljava/lang/String;
    //   162: invokestatic 36	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   165: invokevirtual 137	java/lang/String:toUpperCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   168: astore 21
    //   170: aload 21
    //   172: astore 12
    //   174: aload 20
    //   176: iconst_5
    //   177: invokevirtual 140	java/util/Calendar:get	(I)I
    //   180: invokestatic 144	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   183: astore 22
    //   185: aload 12
    //   187: astore 15
    //   189: aload 22
    //   191: astore 16
    //   193: aload 10
    //   195: ldc 145
    //   197: invokevirtual 149	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   200: checkcast 151	android/widget/TextView
    //   203: aload 15
    //   205: invokevirtual 155	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   208: aload 10
    //   210: ldc 156
    //   212: invokevirtual 149	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   215: checkcast 151	android/widget/TextView
    //   218: aload 16
    //   220: invokevirtual 155	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   223: aload 5
    //   225: aload 6
    //   227: getfield 159	com/spotify/mobile/android/spotlets/artist/model/ArtistModel$Concert:title	Ljava/lang/String;
    //   230: invokevirtual 161	com/spotify/android/paste/widget/ListItemView:a	(Ljava/lang/CharSequence;)V
    //   233: aload 5
    //   235: new 163	java/lang/StringBuilder
    //   238: dup
    //   239: invokespecial 164	java/lang/StringBuilder:<init>	()V
    //   242: aload 6
    //   244: getfield 167	com/spotify/mobile/android/spotlets/artist/model/ArtistModel$Concert:venue	Ljava/lang/String;
    //   247: invokevirtual 171	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   250: ldc 173
    //   252: invokevirtual 171	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: aload 6
    //   257: getfield 176	com/spotify/mobile/android/spotlets/artist/model/ArtistModel$Concert:city	Ljava/lang/String;
    //   260: invokevirtual 171	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: invokevirtual 180	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   266: invokevirtual 182	com/spotify/android/paste/widget/ListItemView:b	(Ljava/lang/CharSequence;)V
    //   269: aload_0
    //   270: getfield 26	com/spotify/mobile/android/spotlets/artist/adapters/b:c	Ljava/util/Map;
    //   273: iload_1
    //   274: invokestatic 187	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   277: invokeinterface 193 2 0
    //   282: ifne +25 -> 307
    //   285: aload_0
    //   286: getfield 26	com/spotify/mobile/android/spotlets/artist/adapters/b:c	Ljava/util/Map;
    //   289: iload_1
    //   290: invokestatic 187	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   293: new 195	com/spotify/mobile/android/spotlets/artist/view/b/b
    //   296: dup
    //   297: iload_1
    //   298: invokespecial 198	com/spotify/mobile/android/spotlets/artist/view/b/b:<init>	(I)V
    //   301: invokeinterface 202 3 0
    //   306: pop
    //   307: aload 5
    //   309: aload_0
    //   310: getfield 26	com/spotify/mobile/android/spotlets/artist/adapters/b:c	Ljava/util/Map;
    //   313: iload_1
    //   314: invokestatic 187	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   317: invokeinterface 205 2 0
    //   322: invokevirtual 209	com/spotify/android/paste/widget/ListItemView:setTag	(Ljava/lang/Object;)V
    //   325: new 75	android/widget/ImageView
    //   328: dup
    //   329: aload_0
    //   330: getfield 43	com/spotify/mobile/android/spotlets/artist/adapters/b:b	Landroid/content/Context;
    //   333: invokespecial 210	android/widget/ImageView:<init>	(Landroid/content/Context;)V
    //   336: astore 17
    //   338: aload 17
    //   340: ldc 211
    //   342: invokevirtual 214	android/widget/ImageView:setImageResource	(I)V
    //   345: aload 5
    //   347: aload 17
    //   349: invokevirtual 217	com/spotify/android/paste/widget/ListItemView:b	(Landroid/view/View;)V
    //   352: aload 5
    //   354: areturn
    //   355: aload_2
    //   356: astore 4
    //   358: goto -341 -> 17
    //   361: ldc 218
    //   363: istore 8
    //   365: goto -289 -> 76
    //   368: astore 11
    //   370: ldc 220
    //   372: astore 12
    //   374: aload 11
    //   376: astore 13
    //   378: iconst_2
    //   379: anewarray 222	java/lang/Object
    //   382: astore 14
    //   384: aload 14
    //   386: iconst_0
    //   387: aload 6
    //   389: getfield 113	com/spotify/mobile/android/spotlets/artist/model/ArtistModel$Concert:localtime	Ljava/lang/String;
    //   392: aastore
    //   393: aload 14
    //   395: iconst_1
    //   396: aload_0
    //   397: getfield 41	com/spotify/mobile/android/spotlets/artist/adapters/b:d	Ljava/text/SimpleDateFormat;
    //   400: aastore
    //   401: aload 13
    //   403: ldc 224
    //   405: aload 14
    //   407: invokestatic 229	com/spotify/mobile/android/util/bp:a	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   410: aload 12
    //   412: astore 15
    //   414: ldc 220
    //   416: astore 16
    //   418: goto -225 -> 193
    //   421: astore 13
    //   423: goto -45 -> 378
    //
    // Exception table:
    //   from	to	target	type
    //   126	170	368	java/text/ParseException
    //   174	185	421	java/text/ParseException
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.adapters.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
