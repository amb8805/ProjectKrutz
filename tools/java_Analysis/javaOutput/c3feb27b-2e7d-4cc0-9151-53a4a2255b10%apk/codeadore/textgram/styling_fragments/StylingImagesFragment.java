package codeadore.textgram.styling_fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import codeadore.textgram.StoreActivity;
import codeadore.textgram.StylingActivity;
import codeadore.textgram.SuperSurface;
import codeadore.textgram.SuperSurfaceItem;
import codeadore.textgram.Utilities;
import codeadore.textgram.custom_widgets.el7rTextView;
import java.util.ArrayList;
import yuku.ambilwarna.AmbilWarnaDialog;

public class StylingImagesFragment extends Fragment
{
  String TAG = "StylingImagesFragment";
  Context context;
  View lastItemView = null;
  String layout = "phone";
  ArrayList<String> list;
  View view;
  String whatToLoad = null;

  public StylingImagesFragment()
  {
  }

  public static StylingImagesFragment newInstance(String paramString)
  {
    StylingImagesFragment localStylingImagesFragment = new StylingImagesFragment();
    Bundle localBundle = new Bundle();
    localBundle.putString("whatToLoad", paramString);
    localStylingImagesFragment.setArguments(localBundle);
    return localStylingImagesFragment;
  }

  @SuppressLint({"NewApi"})
  public void gvItemClicked(String paramString, View paramView, int paramInt)
  {
    if (paramString.contains("fonts"))
      if (((String)StylingActivity.fontsList.get(paramInt)).equals("[get_more]"))
      {
        Intent localIntent6 = new Intent(this.context, StoreActivity.class);
        this.context.startActivity(localIntent6);
      }
    do
    {
      return;
      try
      {
        StylingActivity.setTypeFace((String)StylingActivity.fontsList.get(paramInt));
        StylingActivity.updateTextBitmap(StylingActivity.superSurface.getCurrentTextItem());
        return;
      }
      catch (Exception localException7)
      {
        Log.e(this.TAG, "error in setting typeface: " + localException7.toString());
        localException7.printStackTrace();
        return;
      }
      if (paramString.contains("backgrounds"))
      {
        try
        {
          if (((String)StylingActivity.backgroundsList.get(paramInt)).equals("[custom]"))
          {
            Utilities.openGalleryForSelect(getActivity(), 1);
            return;
          }
        }
        catch (Exception localException6)
        {
          Log.e(this.TAG, "error in setting background: " + localException6.toString());
          localException6.printStackTrace();
          return;
        }
        if (((String)StylingActivity.backgroundsList.get(paramInt)).equals("[get_more]"))
        {
          Intent localIntent5 = new Intent(this.context, StoreActivity.class);
          this.context.startActivity(localIntent5);
          return;
        }
        String str3 = (String)StylingActivity.backgroundsList.get(paramInt);
        StylingActivity.superSurface.setBackground(Utilities.getBitmapFromPath(this.context, str3), str3);
        StylingActivity.superSurface.requestUpdate();
        return;
      }
      if (paramString.contains("frames"))
        while (true)
        {
          try
          {
            if (StylingActivity.framesList.get(paramInt) == "[none]")
            {
              StylingActivity.superSurface.setFrame(null, null);
              StylingActivity.superSurface.requestUpdate();
              return;
            }
          }
          catch (Exception localException5)
          {
            Log.e(this.TAG, "error in setting frame: " + localException5.toString());
            localException5.printStackTrace();
            return;
          }
          if (((String)StylingActivity.framesList.get(paramInt)).equals("[get_more]"))
          {
            Intent localIntent4 = new Intent(this.context, StoreActivity.class);
            this.context.startActivity(localIntent4);
          }
          else
          {
            String str2 = (String)StylingActivity.framesList.get(paramInt);
            StylingActivity.superSurface.setFrame(Utilities.getBitmapFromPath(this.context, str2), str2);
          }
        }
      if (paramString.contains("filters"))
        while (true)
        {
          try
          {
            if (StylingActivity.filtersList.get(paramInt) == "[none]")
            {
              StylingActivity.superSurface.setFilter(null, null);
              StylingActivity.superSurface.requestUpdate();
              return;
            }
          }
          catch (Exception localException4)
          {
            Log.e(this.TAG, "error in setting filter: " + localException4.toString());
            localException4.printStackTrace();
            return;
          }
          if (((String)StylingActivity.filtersList.get(paramInt)).equals("[get_more]"))
          {
            Intent localIntent3 = new Intent(this.context, StoreActivity.class);
            this.context.startActivity(localIntent3);
          }
          else if (((String)StylingActivity.filtersList.get(paramInt)).equals("[custom]"))
          {
            Utilities.openGalleryForSelect(getActivity(), 3);
          }
          else
          {
            String str1 = (String)StylingActivity.filtersList.get(paramInt);
            StylingActivity.superSurface.setFilter(Utilities.getBitmapFromPath(this.context, str1), str1);
          }
        }
      if (paramString.contains("stickers"))
      {
        try
        {
          if (((String)StylingActivity.stickersList.get(paramInt)).equals("[custom]"))
          {
            Utilities.openGalleryForSelect(getActivity(), 2);
            return;
          }
        }
        catch (Exception localException3)
        {
          Log.e(this.TAG, "error in setting sticker: " + localException3.toString());
          localException3.printStackTrace();
          return;
        }
        if (((String)StylingActivity.stickersList.get(paramInt)).equals("[get_more]"))
        {
          Intent localIntent2 = new Intent(this.context, StoreActivity.class);
          this.context.startActivity(localIntent2);
          return;
        }
        Bitmap localBitmap = Utilities.getBitmapFromPath(this.context, (String)StylingActivity.stickersList.get(paramInt));
        SuperSurfaceItem localSuperSurfaceItem = new SuperSurfaceItem();
        localSuperSurfaceItem.bitmapPath = ((String)StylingActivity.stickersList.get(paramInt));
        localSuperSurfaceItem.bitmap = localBitmap;
        localSuperSurfaceItem.height = localBitmap.getHeight();
        localSuperSurfaceItem.width = localBitmap.getWidth();
        StylingActivity.superSurface.addItem(localSuperSurfaceItem);
        StylingActivity.superSurface.requestUpdate();
        return;
      }
      if (paramString.contains("templates"))
      {
        try
        {
          if (((String)StylingActivity.templatesList.get(paramInt)).equals("[custom]"))
          {
            Utilities.openGalleryForSelect(getActivity(), 1);
            return;
          }
        }
        catch (Exception localException2)
        {
          localException2.printStackTrace();
          return;
        }
        if (((String)StylingActivity.templatesList.get(paramInt)).equals("[get_more]"))
        {
          Intent localIntent1 = new Intent(this.context, StoreActivity.class);
          this.context.startActivity(localIntent1);
          return;
        }
        if (((String)StylingActivity.templatesList.get(paramInt)).equals("[custom_color]"))
        {
          new AmbilWarnaDialog(StylingActivity.c, StylingActivity.lastChosenBGColor, new StylingImagesFragment.7(this, paramView)).show();
          return;
        }
        StylingActivity.setTemplate((String)StylingActivity.templatesList.get(paramInt));
        return;
      }
      if (paramString.contains("text_color"))
      {
        if (StylingActivity.colorsList.get(paramInt) == "[custom_color]")
        {
          new AmbilWarnaDialog(StylingActivity.c, StylingActivity.superSurface.getCurrentTextItem().textViewDraw.getCurrentTextColor(), new StylingImagesFragment.8(this, paramView)).show();
          return;
        }
        StylingActivity.applyTextColor((String)StylingActivity.colorsList.get(paramInt));
        return;
      }
      if (paramString.contains("text_shadow"))
      {
        if (StylingActivity.shadowColorsList.get(paramInt) == "[custom_color]")
        {
          new AmbilWarnaDialog(StylingActivity.c, StylingActivity.superSurface.getCurrentTextItem().textViewDraw.getShadowColor(), new StylingImagesFragment.9(this, paramView)).show();
          return;
        }
        StylingActivity.applyTextShadow((String)StylingActivity.shadowColorsList.get(paramInt));
        return;
      }
    }
    while (!paramString.contains("highlight"));
    if (StylingActivity.shadowColorsList.get(paramInt) == "[custom_color]")
    {
      int i = -1;
      if (StylingActivity.superSurface.getCurrentTextItem().highlightColor == null)
        i = -1;
      while (true)
      {
        new AmbilWarnaDialog(StylingActivity.c, i, new StylingImagesFragment.10(this, paramView)).show();
        return;
        try
        {
          int j = Color.parseColor(StylingActivity.superSurface.getCurrentTextItem().highlightColor);
          i = j;
        }
        catch (Exception localException1)
        {
          localException1.printStackTrace();
        }
      }
    }
    StylingActivity.applyHighlightColor((String)StylingActivity.shadowColorsList.get(paramInt));
  }

  // ERROR //
  public void onActivityCreated(Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 310	android/support/v4/app/Fragment:onActivityCreated	(Landroid/os/Bundle;)V
    //   5: aload_0
    //   6: getfield 312	codeadore/textgram/styling_fragments/StylingImagesFragment:view	Landroid/view/View;
    //   9: ldc_w 313
    //   12: invokevirtual 319	android/view/View:findViewById	(I)Landroid/view/View;
    //   15: invokevirtual 322	android/view/View:getVisibility	()I
    //   18: bipush 8
    //   20: if_icmpne +10 -> 30
    //   23: aload_0
    //   24: ldc_w 324
    //   27: putfield 32	codeadore/textgram/styling_fragments/StylingImagesFragment:layout	Ljava/lang/String;
    //   30: aload_0
    //   31: getfield 312	codeadore/textgram/styling_fragments/StylingImagesFragment:view	Landroid/view/View;
    //   34: ldc_w 325
    //   37: invokevirtual 319	android/view/View:findViewById	(I)Landroid/view/View;
    //   40: checkcast 327	android/widget/AdapterView
    //   43: astore_2
    //   44: aload_2
    //   45: aconst_null
    //   46: invokevirtual 331	android/widget/AdapterView:setAdapter	(Landroid/widget/Adapter;)V
    //   49: aload_0
    //   50: getfield 312	codeadore/textgram/styling_fragments/StylingImagesFragment:view	Landroid/view/View;
    //   53: ldc_w 332
    //   56: invokevirtual 319	android/view/View:findViewById	(I)Landroid/view/View;
    //   59: astore_3
    //   60: aload_0
    //   61: aload_0
    //   62: invokevirtual 336	codeadore/textgram/styling_fragments/StylingImagesFragment:getArguments	()Landroid/os/Bundle;
    //   65: ldc 39
    //   67: invokevirtual 340	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   70: putfield 22	codeadore/textgram/styling_fragments/StylingImagesFragment:whatToLoad	Ljava/lang/String;
    //   73: aload_0
    //   74: aload_0
    //   75: invokevirtual 147	codeadore/textgram/styling_fragments/StylingImagesFragment:getActivity	()Landroid/support/v4/app/FragmentActivity;
    //   78: putfield 83	codeadore/textgram/styling_fragments/StylingImagesFragment:context	Landroid/content/Context;
    //   81: getstatic 259	codeadore/textgram/StylingActivity:colorsList	Ljava/util/ArrayList;
    //   84: ifnonnull +9 -> 93
    //   87: getstatic 236	codeadore/textgram/StylingActivity:c	Landroid/content/Context;
    //   90: invokestatic 344	codeadore/textgram/Utilities:updateLists	(Landroid/content/Context;)V
    //   93: aload_1
    //   94: ifnull +247 -> 341
    //   97: aload_0
    //   98: aload_1
    //   99: ldc_w 346
    //   102: invokevirtual 350	android/os/Bundle:getStringArrayList	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   105: putfield 352	codeadore/textgram/styling_fragments/StylingImagesFragment:list	Ljava/util/ArrayList;
    //   108: aload_0
    //   109: getfield 312	codeadore/textgram/styling_fragments/StylingImagesFragment:view	Landroid/view/View;
    //   112: ldc_w 353
    //   115: invokevirtual 319	android/view/View:findViewById	(I)Landroid/view/View;
    //   118: checkcast 355	android/widget/ImageButton
    //   121: astore 4
    //   123: aload_0
    //   124: getfield 22	codeadore/textgram/styling_fragments/StylingImagesFragment:whatToLoad	Ljava/lang/String;
    //   127: ldc 180
    //   129: invokevirtual 62	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   132: ifeq +31 -> 163
    //   135: aload_0
    //   136: getfield 32	codeadore/textgram/styling_fragments/StylingImagesFragment:layout	Ljava/lang/String;
    //   139: ldc 30
    //   141: if_acmpne +374 -> 515
    //   144: aload 4
    //   146: iconst_0
    //   147: invokevirtual 359	android/widget/ImageButton:setVisibility	(I)V
    //   150: aload 4
    //   152: new 361	codeadore/textgram/styling_fragments/StylingImagesFragment$1
    //   155: dup
    //   156: aload_0
    //   157: invokespecial 364	codeadore/textgram/styling_fragments/StylingImagesFragment$1:<init>	(Lcodeadore/textgram/styling_fragments/StylingImagesFragment;)V
    //   160: invokevirtual 368	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   163: aload_0
    //   164: getfield 22	codeadore/textgram/styling_fragments/StylingImagesFragment:whatToLoad	Ljava/lang/String;
    //   167: ldc_w 290
    //   170: invokevirtual 62	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   173: ifeq +31 -> 204
    //   176: aload_0
    //   177: getfield 32	codeadore/textgram/styling_fragments/StylingImagesFragment:layout	Ljava/lang/String;
    //   180: ldc 30
    //   182: if_acmpne +395 -> 577
    //   185: aload 4
    //   187: iconst_0
    //   188: invokevirtual 359	android/widget/ImageButton:setVisibility	(I)V
    //   191: aload 4
    //   193: new 370	codeadore/textgram/styling_fragments/StylingImagesFragment$2
    //   196: dup
    //   197: aload_0
    //   198: invokespecial 371	codeadore/textgram/styling_fragments/StylingImagesFragment$2:<init>	(Lcodeadore/textgram/styling_fragments/StylingImagesFragment;)V
    //   201: invokevirtual 368	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   204: aload_0
    //   205: getfield 22	codeadore/textgram/styling_fragments/StylingImagesFragment:whatToLoad	Ljava/lang/String;
    //   208: ldc_w 256
    //   211: if_acmpeq +13 -> 224
    //   214: aload_0
    //   215: getfield 22	codeadore/textgram/styling_fragments/StylingImagesFragment:whatToLoad	Ljava/lang/String;
    //   218: ldc_w 276
    //   221: if_acmpne +34 -> 255
    //   224: aload_0
    //   225: getfield 312	codeadore/textgram/styling_fragments/StylingImagesFragment:view	Landroid/view/View;
    //   228: ldc_w 372
    //   231: invokevirtual 319	android/view/View:findViewById	(I)Landroid/view/View;
    //   234: astore 5
    //   236: aload 5
    //   238: iconst_0
    //   239: invokevirtual 373	android/view/View:setVisibility	(I)V
    //   242: aload 5
    //   244: new 375	codeadore/textgram/styling_fragments/StylingImagesFragment$3
    //   247: dup
    //   248: aload_0
    //   249: invokespecial 376	codeadore/textgram/styling_fragments/StylingImagesFragment$3:<init>	(Lcodeadore/textgram/styling_fragments/StylingImagesFragment;)V
    //   252: invokevirtual 377	android/view/View:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   255: aload_0
    //   256: getfield 352	codeadore/textgram/styling_fragments/StylingImagesFragment:list	Ljava/util/ArrayList;
    //   259: astore 7
    //   261: aload 7
    //   263: ifnull +396 -> 659
    //   266: aload_2
    //   267: new 379	codeadore/textgram/adapters/StylingImagesAdapter
    //   270: dup
    //   271: aload_0
    //   272: getfield 83	codeadore/textgram/styling_fragments/StylingImagesFragment:context	Landroid/content/Context;
    //   275: aload_0
    //   276: getfield 352	codeadore/textgram/styling_fragments/StylingImagesFragment:list	Ljava/util/ArrayList;
    //   279: ldc_w 381
    //   282: invokespecial 384	codeadore/textgram/adapters/StylingImagesAdapter:<init>	(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;)V
    //   285: invokevirtual 331	android/widget/AdapterView:setAdapter	(Landroid/widget/Adapter;)V
    //   288: aload_3
    //   289: bipush 8
    //   291: invokevirtual 373	android/view/View:setVisibility	(I)V
    //   294: aload_2
    //   295: new 386	codeadore/textgram/styling_fragments/StylingImagesFragment$5
    //   298: dup
    //   299: aload_0
    //   300: invokespecial 387	codeadore/textgram/styling_fragments/StylingImagesFragment$5:<init>	(Lcodeadore/textgram/styling_fragments/StylingImagesFragment;)V
    //   303: invokevirtual 391	android/widget/AdapterView:setOnItemClickListener	(Landroid/widget/AdapterView$OnItemClickListener;)V
    //   306: aload_0
    //   307: getfield 312	codeadore/textgram/styling_fragments/StylingImagesFragment:view	Landroid/view/View;
    //   310: ldc_w 392
    //   313: invokevirtual 319	android/view/View:findViewById	(I)Landroid/view/View;
    //   316: checkcast 355	android/widget/ImageButton
    //   319: new 394	codeadore/textgram/styling_fragments/StylingImagesFragment$6
    //   322: dup
    //   323: aload_0
    //   324: invokespecial 395	codeadore/textgram/styling_fragments/StylingImagesFragment$6:<init>	(Lcodeadore/textgram/styling_fragments/StylingImagesFragment;)V
    //   327: invokevirtual 368	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   330: return
    //   331: astore 16
    //   333: aload 16
    //   335: invokevirtual 396	java/io/IOException:printStackTrace	()V
    //   338: goto -245 -> 93
    //   341: aload_0
    //   342: getfield 22	codeadore/textgram/styling_fragments/StylingImagesFragment:whatToLoad	Ljava/lang/String;
    //   345: ldc 56
    //   347: if_acmpne +13 -> 360
    //   350: aload_0
    //   351: getstatic 67	codeadore/textgram/StylingActivity:fontsList	Ljava/util/ArrayList;
    //   354: putfield 352	codeadore/textgram/styling_fragments/StylingImagesFragment:list	Ljava/util/ArrayList;
    //   357: goto -249 -> 108
    //   360: aload_0
    //   361: getfield 22	codeadore/textgram/styling_fragments/StylingImagesFragment:whatToLoad	Ljava/lang/String;
    //   364: ldc 138
    //   366: if_acmpne +13 -> 379
    //   369: aload_0
    //   370: getstatic 141	codeadore/textgram/StylingActivity:backgroundsList	Ljava/util/ArrayList;
    //   373: putfield 352	codeadore/textgram/styling_fragments/StylingImagesFragment:list	Ljava/util/ArrayList;
    //   376: goto -268 -> 108
    //   379: aload_0
    //   380: getfield 22	codeadore/textgram/styling_fragments/StylingImagesFragment:whatToLoad	Ljava/lang/String;
    //   383: ldc 168
    //   385: if_acmpne +13 -> 398
    //   388: aload_0
    //   389: getstatic 171	codeadore/textgram/StylingActivity:framesList	Ljava/util/ArrayList;
    //   392: putfield 352	codeadore/textgram/styling_fragments/StylingImagesFragment:list	Ljava/util/ArrayList;
    //   395: goto -287 -> 108
    //   398: aload_0
    //   399: getfield 22	codeadore/textgram/styling_fragments/StylingImagesFragment:whatToLoad	Ljava/lang/String;
    //   402: ldc 190
    //   404: if_acmpne +13 -> 417
    //   407: aload_0
    //   408: getstatic 193	codeadore/textgram/StylingActivity:stickersList	Ljava/util/ArrayList;
    //   411: putfield 352	codeadore/textgram/styling_fragments/StylingImagesFragment:list	Ljava/util/ArrayList;
    //   414: goto -306 -> 108
    //   417: aload_0
    //   418: getfield 22	codeadore/textgram/styling_fragments/StylingImagesFragment:whatToLoad	Ljava/lang/String;
    //   421: ldc 226
    //   423: if_acmpne +13 -> 436
    //   426: aload_0
    //   427: getstatic 229	codeadore/textgram/StylingActivity:templatesList	Ljava/util/ArrayList;
    //   430: putfield 352	codeadore/textgram/styling_fragments/StylingImagesFragment:list	Ljava/util/ArrayList;
    //   433: goto -325 -> 108
    //   436: aload_0
    //   437: getfield 22	codeadore/textgram/styling_fragments/StylingImagesFragment:whatToLoad	Ljava/lang/String;
    //   440: ldc 180
    //   442: if_acmpne +13 -> 455
    //   445: aload_0
    //   446: getstatic 183	codeadore/textgram/StylingActivity:filtersList	Ljava/util/ArrayList;
    //   449: putfield 352	codeadore/textgram/styling_fragments/StylingImagesFragment:list	Ljava/util/ArrayList;
    //   452: goto -344 -> 108
    //   455: aload_0
    //   456: getfield 22	codeadore/textgram/styling_fragments/StylingImagesFragment:whatToLoad	Ljava/lang/String;
    //   459: ldc_w 256
    //   462: if_acmpne +13 -> 475
    //   465: aload_0
    //   466: getstatic 259	codeadore/textgram/StylingActivity:colorsList	Ljava/util/ArrayList;
    //   469: putfield 352	codeadore/textgram/styling_fragments/StylingImagesFragment:list	Ljava/util/ArrayList;
    //   472: goto -364 -> 108
    //   475: aload_0
    //   476: getfield 22	codeadore/textgram/styling_fragments/StylingImagesFragment:whatToLoad	Ljava/lang/String;
    //   479: ldc_w 290
    //   482: if_acmpne +13 -> 495
    //   485: aload_0
    //   486: getstatic 279	codeadore/textgram/StylingActivity:shadowColorsList	Ljava/util/ArrayList;
    //   489: putfield 352	codeadore/textgram/styling_fragments/StylingImagesFragment:list	Ljava/util/ArrayList;
    //   492: goto -384 -> 108
    //   495: aload_0
    //   496: getfield 22	codeadore/textgram/styling_fragments/StylingImagesFragment:whatToLoad	Ljava/lang/String;
    //   499: ldc_w 276
    //   502: if_acmpne -394 -> 108
    //   505: aload_0
    //   506: getstatic 279	codeadore/textgram/StylingActivity:shadowColorsList	Ljava/util/ArrayList;
    //   509: putfield 352	codeadore/textgram/styling_fragments/StylingImagesFragment:list	Ljava/util/ArrayList;
    //   512: goto -404 -> 108
    //   515: aload_0
    //   516: getfield 32	codeadore/textgram/styling_fragments/StylingImagesFragment:layout	Ljava/lang/String;
    //   519: ldc_w 324
    //   522: if_acmpne -359 -> 163
    //   525: aload_0
    //   526: getfield 312	codeadore/textgram/styling_fragments/StylingImagesFragment:view	Landroid/view/View;
    //   529: ldc_w 397
    //   532: invokevirtual 319	android/view/View:findViewById	(I)Landroid/view/View;
    //   535: checkcast 399	android/widget/LinearLayout
    //   538: ldc_w 400
    //   541: invokevirtual 403	android/widget/LinearLayout:setId	(I)V
    //   544: getstatic 407	codeadore/textgram/StylingActivity:fragmentManager	Landroid/support/v4/app/FragmentManager;
    //   547: invokevirtual 413	android/support/v4/app/FragmentManager:beginTransaction	()Landroid/support/v4/app/FragmentTransaction;
    //   550: astore 13
    //   552: aload 13
    //   554: ldc_w 400
    //   557: new 415	codeadore/textgram/styling_fragments/StylingFilterOptionsFragment
    //   560: dup
    //   561: invokespecial 416	codeadore/textgram/styling_fragments/StylingFilterOptionsFragment:<init>	()V
    //   564: invokevirtual 422	android/support/v4/app/FragmentTransaction:replace	(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    //   567: pop
    //   568: aload 13
    //   570: invokevirtual 425	android/support/v4/app/FragmentTransaction:commit	()I
    //   573: pop
    //   574: goto -411 -> 163
    //   577: aload_0
    //   578: getfield 32	codeadore/textgram/styling_fragments/StylingImagesFragment:layout	Ljava/lang/String;
    //   581: ldc_w 324
    //   584: if_acmpne -380 -> 204
    //   587: aload_0
    //   588: getfield 312	codeadore/textgram/styling_fragments/StylingImagesFragment:view	Landroid/view/View;
    //   591: ldc_w 426
    //   594: invokevirtual 319	android/view/View:findViewById	(I)Landroid/view/View;
    //   597: checkcast 399	android/widget/LinearLayout
    //   600: ldc_w 427
    //   603: invokevirtual 403	android/widget/LinearLayout:setId	(I)V
    //   606: getstatic 407	codeadore/textgram/StylingActivity:fragmentManager	Landroid/support/v4/app/FragmentManager;
    //   609: invokevirtual 413	android/support/v4/app/FragmentManager:beginTransaction	()Landroid/support/v4/app/FragmentTransaction;
    //   612: astore 10
    //   614: aload 10
    //   616: ldc_w 427
    //   619: new 429	codeadore/textgram/styling_fragments/StylingHighlightOptionsFragment
    //   622: dup
    //   623: invokespecial 430	codeadore/textgram/styling_fragments/StylingHighlightOptionsFragment:<init>	()V
    //   626: invokevirtual 422	android/support/v4/app/FragmentTransaction:replace	(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    //   629: pop
    //   630: aload 10
    //   632: invokevirtual 425	android/support/v4/app/FragmentTransaction:commit	()I
    //   635: pop
    //   636: goto -432 -> 204
    //   639: astore 9
    //   641: aload 9
    //   643: invokevirtual 136	java/lang/Exception:printStackTrace	()V
    //   646: goto -352 -> 294
    //   649: astore 6
    //   651: aload 6
    //   653: invokevirtual 136	java/lang/Exception:printStackTrace	()V
    //   656: goto -362 -> 294
    //   659: new 432	android/os/Handler
    //   662: dup
    //   663: invokespecial 433	android/os/Handler:<init>	()V
    //   666: new 435	codeadore/textgram/styling_fragments/StylingImagesFragment$4
    //   669: dup
    //   670: aload_0
    //   671: aload_2
    //   672: aload_3
    //   673: invokespecial 438	codeadore/textgram/styling_fragments/StylingImagesFragment$4:<init>	(Lcodeadore/textgram/styling_fragments/StylingImagesFragment;Landroid/widget/AdapterView;Landroid/view/View;)V
    //   676: ldc2_w 439
    //   679: invokevirtual 444	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
    //   682: pop
    //   683: goto -389 -> 294
    //
    // Exception table:
    //   from	to	target	type
    //   87	93	331	java/io/IOException
    //   266	294	639	java/lang/Exception
    //   255	261	649	java/lang/Exception
    //   641	646	649	java/lang/Exception
    //   659	683	649	java/lang/Exception
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903095, paramViewGroup, false);
    this.view = localView;
    return localView;
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putStringArrayList("theList", this.list);
    setUserVisibleHint(true);
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.styling_fragments.StylingImagesFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
