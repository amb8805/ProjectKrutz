// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.styling_fragments;

import android.app.AlertDialog;
import android.content.*;
import android.graphics.*;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.*;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.*;
import android.widget.*;
import codeadore.textgram.*;
import codeadore.textgram.adapters.StylingImagesAdapter;
import codeadore.textgram.custom_widgets.el7rTextView;
import codeadore.textgram.el7rUtilities;
import java.io.IOException;
import java.util.ArrayList;
import yuku.ambilwarna.AmbilWarnaDialog;

// Referenced classes of package codeadore.textgram.styling_fragments:
//            StylingFilterOptionsFragment, StylingHighlightOptionsFragment

public class StylingImagesFragment extends Fragment
{

    public StylingImagesFragment()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #20  <Method void Fragment()>
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:putfield        #22  <Field String whatToLoad>
    //    5    9:aload_0         
    //    6   10:ldc1            #24  <String "StylingImagesFragment">
    //    7   12:putfield        #26  <Field String TAG>
    //    8   15:aload_0         
    //    9   16:aconst_null     
    //   10   17:putfield        #28  <Field View lastItemView>
    //   11   20:aload_0         
    //   12   21:ldc1            #30  <String "phone">
    //   13   23:putfield        #32  <Field String layout>
    //   14   26:return          
    }

    public static StylingImagesFragment newInstance(String s)
    {
    //    0    0:new             #2   <Class StylingImagesFragment>
    //    1    3:dup             
    //    2    4:invokespecial   #35  <Method void StylingImagesFragment()>
    //    3    7:astore_1        
    //    4    8:new             #37  <Class Bundle>
    //    5   11:dup             
    //    6   12:invokespecial   #38  <Method void Bundle()>
    //    7   15:astore_2        
    //    8   16:aload_2         
    //    9   17:ldc1            #39  <String "whatToLoad">
    //   10   19:aload_0         
    //   11   20:invokevirtual   #43  <Method void Bundle.putString(String, String)>
    //   12   23:aload_1         
    //   13   24:aload_2         
    //   14   25:invokevirtual   #47  <Method void setArguments(Bundle)>
    //   15   28:aload_1         
    //   16   29:areturn         
    }

    public void gvItemClicked(String s, View view1, int i)
    {
    //    0    0:aload_1         
    //    1    1:ldc1            #56  <String "fonts">
    //    2    3:invokevirtual   #62  <Method boolean String.contains(CharSequence)>
    //    3    6:ifeq            111
    //    4    9:getstatic       #67  <Field ArrayList StylingActivity.fontsList>
    //    5   12:iload_3         
    //    6   13:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //    7   16:checkcast       #58  <Class String>
    //    8   19:ldc1            #75  <String "[get_more]">
    //    9   21:invokevirtual   #79  <Method boolean String.equals(Object)>
    //   10   24:ifeq            52
    //   11   27:new             #81  <Class Intent>
    //   12   30:dup             
    //   13   31:aload_0         
    //   14   32:getfield        #83  <Field Context context>
    //   15   35:ldc1            #85  <Class StoreActivity>
    //   16   37:invokespecial   #88  <Method void Intent(Context, Class)>
    //   17   40:astore          26
    //   18   42:aload_0         
    //   19   43:getfield        #83  <Field Context context>
    //   20   46:aload           26
    //   21   48:invokevirtual   #94  <Method void Context.startActivity(Intent)>
    //   22   51:return          
    // try 52 74 handler(s) 75
    //   23   52:getstatic       #67  <Field ArrayList StylingActivity.fontsList>
    //   24   55:iload_3         
    //   25   56:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //   26   59:checkcast       #58  <Class String>
    //   27   62:invokestatic    #98  <Method void StylingActivity.setTypeFace(String)>
    //   28   65:getstatic       #102 <Field SuperSurface StylingActivity.superSurface>
    //   29   68:invokevirtual   #108 <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //   30   71:invokestatic    #112 <Method void StylingActivity.updateTextBitmap(SuperSurfaceItem)>
    //   31   74:return          
    // catch Exception
    //   32   75:astore          27
    //   33   77:aload_0         
    //   34   78:getfield        #26  <Field String TAG>
    //   35   81:new             #114 <Class StringBuilder>
    //   36   84:dup             
    //   37   85:ldc1            #116 <String "error in setting typeface: ">
    //   38   87:invokespecial   #118 <Method void StringBuilder(String)>
    //   39   90:aload           27
    //   40   92:invokevirtual   #122 <Method String Exception.toString()>
    //   41   95:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
    //   42   98:invokevirtual   #127 <Method String StringBuilder.toString()>
    //   43  101:invokestatic    #133 <Method int Log.e(String, String)>
    //   44  104:pop             
    //   45  105:aload           27
    //   46  107:invokevirtual   #136 <Method void Exception.printStackTrace()>
    //   47  110:return          
    //   48  111:aload_1         
    //   49  112:ldc1            #138 <String "backgrounds">
    //   50  114:invokevirtual   #62  <Method boolean String.contains(CharSequence)>
    //   51  117:ifeq            262
    // try 120 146 handler(s) 147
    //   52  120:getstatic       #141 <Field ArrayList StylingActivity.backgroundsList>
    //   53  123:iload_3         
    //   54  124:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //   55  127:checkcast       #58  <Class String>
    //   56  130:ldc1            #143 <String "[custom]">
    //   57  132:invokevirtual   #79  <Method boolean String.equals(Object)>
    //   58  135:ifeq            183
    //   59  138:aload_0         
    //   60  139:invokevirtual   #147 <Method android.support.v4.app.FragmentActivity getActivity()>
    //   61  142:iconst_1        
    //   62  143:invokestatic    #153 <Method void Utilities.openGalleryForSelect(android.app.Activity, int)>
    //   63  146:return          
    // catch Exception Exception Exception
    //   64  147:astore          22
    //   65  149:aload_0         
    //   66  150:getfield        #26  <Field String TAG>
    //   67  153:new             #114 <Class StringBuilder>
    //   68  156:dup             
    //   69  157:ldc1            #155 <String "error in setting background: ">
    //   70  159:invokespecial   #118 <Method void StringBuilder(String)>
    //   71  162:aload           22
    //   72  164:invokevirtual   #122 <Method String Exception.toString()>
    //   73  167:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
    //   74  170:invokevirtual   #127 <Method String StringBuilder.toString()>
    //   75  173:invokestatic    #133 <Method int Log.e(String, String)>
    //   76  176:pop             
    //   77  177:aload           22
    //   78  179:invokevirtual   #136 <Method void Exception.printStackTrace()>
    //   79  182:return          
    // try 183 225 handler(s) 147
    //   80  183:getstatic       #141 <Field ArrayList StylingActivity.backgroundsList>
    //   81  186:iload_3         
    //   82  187:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //   83  190:checkcast       #58  <Class String>
    //   84  193:ldc1            #75  <String "[get_more]">
    //   85  195:invokevirtual   #79  <Method boolean String.equals(Object)>
    //   86  198:ifeq            226
    //   87  201:new             #81  <Class Intent>
    //   88  204:dup             
    //   89  205:aload_0         
    //   90  206:getfield        #83  <Field Context context>
    //   91  209:ldc1            #85  <Class StoreActivity>
    //   92  211:invokespecial   #88  <Method void Intent(Context, Class)>
    //   93  214:astore          24
    //   94  216:aload_0         
    //   95  217:getfield        #83  <Field Context context>
    //   96  220:aload           24
    //   97  222:invokevirtual   #94  <Method void Context.startActivity(Intent)>
    //   98  225:return          
    // try 226 261 handler(s) 147
    //   99  226:getstatic       #141 <Field ArrayList StylingActivity.backgroundsList>
    //  100  229:iload_3         
    //  101  230:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  102  233:checkcast       #58  <Class String>
    //  103  236:astore          25
    //  104  238:getstatic       #102 <Field SuperSurface StylingActivity.superSurface>
    //  105  241:aload_0         
    //  106  242:getfield        #83  <Field Context context>
    //  107  245:aload           25
    //  108  247:invokestatic    #159 <Method Bitmap Utilities.getBitmapFromPath(Context, String)>
    //  109  250:aload           25
    //  110  252:invokevirtual   #163 <Method void SuperSurface.setBackground(Bitmap, String)>
    //  111  255:getstatic       #102 <Field SuperSurface StylingActivity.superSurface>
    //  112  258:invokevirtual   #166 <Method void SuperSurface.requestUpdate()>
    //  113  261:return          
    //  114  262:aload_1         
    //  115  263:ldc1            #168 <String "frames">
    //  116  265:invokevirtual   #62  <Method boolean String.contains(CharSequence)>
    //  117  268:ifeq            411
    // try 271 291 handler(s) 298
    //  118  271:getstatic       #171 <Field ArrayList StylingActivity.framesList>
    //  119  274:iload_3         
    //  120  275:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  121  278:ldc1            #173 <String "[none]">
    //  122  280:if_acmpne       334
    //  123  283:getstatic       #102 <Field SuperSurface StylingActivity.superSurface>
    //  124  286:aconst_null     
    //  125  287:aconst_null     
    //  126  288:invokevirtual   #176 <Method void SuperSurface.setFrame(Bitmap, String)>
    // try 291 297 handler(s) 298
    //  127  291:getstatic       #102 <Field SuperSurface StylingActivity.superSurface>
    //  128  294:invokevirtual   #166 <Method void SuperSurface.requestUpdate()>
    //  129  297:return          
    // catch Exception Exception Exception Exception
    //  130  298:astore          18
    //  131  300:aload_0         
    //  132  301:getfield        #26  <Field String TAG>
    //  133  304:new             #114 <Class StringBuilder>
    //  134  307:dup             
    //  135  308:ldc1            #178 <String "error in setting frame: ">
    //  136  310:invokespecial   #118 <Method void StringBuilder(String)>
    //  137  313:aload           18
    //  138  315:invokevirtual   #122 <Method String Exception.toString()>
    //  139  318:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
    //  140  321:invokevirtual   #127 <Method String StringBuilder.toString()>
    //  141  324:invokestatic    #133 <Method int Log.e(String, String)>
    //  142  327:pop             
    //  143  328:aload           18
    //  144  330:invokevirtual   #136 <Method void Exception.printStackTrace()>
    //  145  333:return          
    // try 334 376 handler(s) 298
    //  146  334:getstatic       #171 <Field ArrayList StylingActivity.framesList>
    //  147  337:iload_3         
    //  148  338:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  149  341:checkcast       #58  <Class String>
    //  150  344:ldc1            #75  <String "[get_more]">
    //  151  346:invokevirtual   #79  <Method boolean String.equals(Object)>
    //  152  349:ifeq            379
    //  153  352:new             #81  <Class Intent>
    //  154  355:dup             
    //  155  356:aload_0         
    //  156  357:getfield        #83  <Field Context context>
    //  157  360:ldc1            #85  <Class StoreActivity>
    //  158  362:invokespecial   #88  <Method void Intent(Context, Class)>
    //  159  365:astore          20
    //  160  367:aload_0         
    //  161  368:getfield        #83  <Field Context context>
    //  162  371:aload           20
    //  163  373:invokevirtual   #94  <Method void Context.startActivity(Intent)>
    //  164  376:goto            291
    // try 379 408 handler(s) 298
    //  165  379:getstatic       #171 <Field ArrayList StylingActivity.framesList>
    //  166  382:iload_3         
    //  167  383:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  168  386:checkcast       #58  <Class String>
    //  169  389:astore          21
    //  170  391:getstatic       #102 <Field SuperSurface StylingActivity.superSurface>
    //  171  394:aload_0         
    //  172  395:getfield        #83  <Field Context context>
    //  173  398:aload           21
    //  174  400:invokestatic    #159 <Method Bitmap Utilities.getBitmapFromPath(Context, String)>
    //  175  403:aload           21
    //  176  405:invokevirtual   #176 <Method void SuperSurface.setFrame(Bitmap, String)>
    //  177  408:goto            291
    //  178  411:aload_1         
    //  179  412:ldc1            #180 <String "filters">
    //  180  414:invokevirtual   #62  <Method boolean String.contains(CharSequence)>
    //  181  417:ifeq            589
    // try 420 440 handler(s) 447
    //  182  420:getstatic       #183 <Field ArrayList StylingActivity.filtersList>
    //  183  423:iload_3         
    //  184  424:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  185  427:ldc1            #173 <String "[none]">
    //  186  429:if_acmpne       483
    //  187  432:getstatic       #102 <Field SuperSurface StylingActivity.superSurface>
    //  188  435:aconst_null     
    //  189  436:aconst_null     
    //  190  437:invokevirtual   #186 <Method void SuperSurface.setFilter(Bitmap, String)>
    // try 440 446 handler(s) 447
    //  191  440:getstatic       #102 <Field SuperSurface StylingActivity.superSurface>
    //  192  443:invokevirtual   #166 <Method void SuperSurface.requestUpdate()>
    //  193  446:return          
    // catch Exception Exception Exception Exception Exception
    //  194  447:astore          14
    //  195  449:aload_0         
    //  196  450:getfield        #26  <Field String TAG>
    //  197  453:new             #114 <Class StringBuilder>
    //  198  456:dup             
    //  199  457:ldc1            #188 <String "error in setting filter: ">
    //  200  459:invokespecial   #118 <Method void StringBuilder(String)>
    //  201  462:aload           14
    //  202  464:invokevirtual   #122 <Method String Exception.toString()>
    //  203  467:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
    //  204  470:invokevirtual   #127 <Method String StringBuilder.toString()>
    //  205  473:invokestatic    #133 <Method int Log.e(String, String)>
    //  206  476:pop             
    //  207  477:aload           14
    //  208  479:invokevirtual   #136 <Method void Exception.printStackTrace()>
    //  209  482:return          
    // try 483 525 handler(s) 447
    //  210  483:getstatic       #183 <Field ArrayList StylingActivity.filtersList>
    //  211  486:iload_3         
    //  212  487:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  213  490:checkcast       #58  <Class String>
    //  214  493:ldc1            #75  <String "[get_more]">
    //  215  495:invokevirtual   #79  <Method boolean String.equals(Object)>
    //  216  498:ifeq            528
    //  217  501:new             #81  <Class Intent>
    //  218  504:dup             
    //  219  505:aload_0         
    //  220  506:getfield        #83  <Field Context context>
    //  221  509:ldc1            #85  <Class StoreActivity>
    //  222  511:invokespecial   #88  <Method void Intent(Context, Class)>
    //  223  514:astore          16
    //  224  516:aload_0         
    //  225  517:getfield        #83  <Field Context context>
    //  226  520:aload           16
    //  227  522:invokevirtual   #94  <Method void Context.startActivity(Intent)>
    //  228  525:goto            440
    // try 528 554 handler(s) 447
    //  229  528:getstatic       #183 <Field ArrayList StylingActivity.filtersList>
    //  230  531:iload_3         
    //  231  532:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  232  535:checkcast       #58  <Class String>
    //  233  538:ldc1            #143 <String "[custom]">
    //  234  540:invokevirtual   #79  <Method boolean String.equals(Object)>
    //  235  543:ifeq            557
    //  236  546:aload_0         
    //  237  547:invokevirtual   #147 <Method android.support.v4.app.FragmentActivity getActivity()>
    //  238  550:iconst_3        
    //  239  551:invokestatic    #153 <Method void Utilities.openGalleryForSelect(android.app.Activity, int)>
    //  240  554:goto            440
    // try 557 586 handler(s) 447
    //  241  557:getstatic       #183 <Field ArrayList StylingActivity.filtersList>
    //  242  560:iload_3         
    //  243  561:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  244  564:checkcast       #58  <Class String>
    //  245  567:astore          17
    //  246  569:getstatic       #102 <Field SuperSurface StylingActivity.superSurface>
    //  247  572:aload_0         
    //  248  573:getfield        #83  <Field Context context>
    //  249  576:aload           17
    //  250  578:invokestatic    #159 <Method Bitmap Utilities.getBitmapFromPath(Context, String)>
    //  251  581:aload           17
    //  252  583:invokevirtual   #186 <Method void SuperSurface.setFilter(Bitmap, String)>
    //  253  586:goto            440
    //  254  589:aload_1         
    //  255  590:ldc1            #190 <String "stickers">
    //  256  592:invokevirtual   #62  <Method boolean String.contains(CharSequence)>
    //  257  595:ifeq            791
    // try 598 624 handler(s) 625
    //  258  598:getstatic       #193 <Field ArrayList StylingActivity.stickersList>
    //  259  601:iload_3         
    //  260  602:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  261  605:checkcast       #58  <Class String>
    //  262  608:ldc1            #143 <String "[custom]">
    //  263  610:invokevirtual   #79  <Method boolean String.equals(Object)>
    //  264  613:ifeq            661
    //  265  616:aload_0         
    //  266  617:invokevirtual   #147 <Method android.support.v4.app.FragmentActivity getActivity()>
    //  267  620:iconst_2        
    //  268  621:invokestatic    #153 <Method void Utilities.openGalleryForSelect(android.app.Activity, int)>
    //  269  624:return          
    // catch Exception Exception Exception
    //  270  625:astore          9
    //  271  627:aload_0         
    //  272  628:getfield        #26  <Field String TAG>
    //  273  631:new             #114 <Class StringBuilder>
    //  274  634:dup             
    //  275  635:ldc1            #195 <String "error in setting sticker: ">
    //  276  637:invokespecial   #118 <Method void StringBuilder(String)>
    //  277  640:aload           9
    //  278  642:invokevirtual   #122 <Method String Exception.toString()>
    //  279  645:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
    //  280  648:invokevirtual   #127 <Method String StringBuilder.toString()>
    //  281  651:invokestatic    #133 <Method int Log.e(String, String)>
    //  282  654:pop             
    //  283  655:aload           9
    //  284  657:invokevirtual   #136 <Method void Exception.printStackTrace()>
    //  285  660:return          
    // try 661 703 handler(s) 625
    //  286  661:getstatic       #193 <Field ArrayList StylingActivity.stickersList>
    //  287  664:iload_3         
    //  288  665:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  289  668:checkcast       #58  <Class String>
    //  290  671:ldc1            #75  <String "[get_more]">
    //  291  673:invokevirtual   #79  <Method boolean String.equals(Object)>
    //  292  676:ifeq            704
    //  293  679:new             #81  <Class Intent>
    //  294  682:dup             
    //  295  683:aload_0         
    //  296  684:getfield        #83  <Field Context context>
    //  297  687:ldc1            #85  <Class StoreActivity>
    //  298  689:invokespecial   #88  <Method void Intent(Context, Class)>
    //  299  692:astore          11
    //  300  694:aload_0         
    //  301  695:getfield        #83  <Field Context context>
    //  302  698:aload           11
    //  303  700:invokevirtual   #94  <Method void Context.startActivity(Intent)>
    //  304  703:return          
    // try 704 790 handler(s) 625
    //  305  704:aload_0         
    //  306  705:getfield        #83  <Field Context context>
    //  307  708:getstatic       #193 <Field ArrayList StylingActivity.stickersList>
    //  308  711:iload_3         
    //  309  712:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  310  715:checkcast       #58  <Class String>
    //  311  718:invokestatic    #159 <Method Bitmap Utilities.getBitmapFromPath(Context, String)>
    //  312  721:astore          12
    //  313  723:new             #197 <Class SuperSurfaceItem>
    //  314  726:dup             
    //  315  727:invokespecial   #198 <Method void SuperSurfaceItem()>
    //  316  730:astore          13
    //  317  732:aload           13
    //  318  734:getstatic       #193 <Field ArrayList StylingActivity.stickersList>
    //  319  737:iload_3         
    //  320  738:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  321  741:checkcast       #58  <Class String>
    //  322  744:putfield        #201 <Field String SuperSurfaceItem.bitmapPath>
    //  323  747:aload           13
    //  324  749:aload           12
    //  325  751:putfield        #205 <Field Bitmap SuperSurfaceItem.bitmap>
    //  326  754:aload           13
    //  327  756:aload           12
    //  328  758:invokevirtual   #211 <Method int Bitmap.getHeight()>
    //  329  761:i2f             
    //  330  762:putfield        #215 <Field float SuperSurfaceItem.height>
    //  331  765:aload           13
    //  332  767:aload           12
    //  333  769:invokevirtual   #218 <Method int Bitmap.getWidth()>
    //  334  772:i2f             
    //  335  773:putfield        #221 <Field float SuperSurfaceItem.width>
    //  336  776:getstatic       #102 <Field SuperSurface StylingActivity.superSurface>
    //  337  779:aload           13
    //  338  781:invokevirtual   #224 <Method void SuperSurface.addItem(SuperSurfaceItem)>
    //  339  784:getstatic       #102 <Field SuperSurface StylingActivity.superSurface>
    //  340  787:invokevirtual   #166 <Method void SuperSurface.requestUpdate()>
    //  341  790:return          
    //  342  791:aload_1         
    //  343  792:ldc1            #226 <String "templates">
    //  344  794:invokevirtual   #62  <Method boolean String.contains(CharSequence)>
    //  345  797:ifeq            936
    // try 800 826 handler(s) 827
    //  346  800:getstatic       #229 <Field ArrayList StylingActivity.templatesList>
    //  347  803:iload_3         
    //  348  804:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  349  807:checkcast       #58  <Class String>
    //  350  810:ldc1            #143 <String "[custom]">
    //  351  812:invokevirtual   #79  <Method boolean String.equals(Object)>
    //  352  815:ifeq            835
    //  353  818:aload_0         
    //  354  819:invokevirtual   #147 <Method android.support.v4.app.FragmentActivity getActivity()>
    //  355  822:iconst_1        
    //  356  823:invokestatic    #153 <Method void Utilities.openGalleryForSelect(android.app.Activity, int)>
    //  357  826:return          
    // catch Exception Exception Exception Exception
    //  358  827:astore          7
    //  359  829:aload           7
    //  360  831:invokevirtual   #136 <Method void Exception.printStackTrace()>
    //  361  834:return          
    // try 835 877 handler(s) 827
    //  362  835:getstatic       #229 <Field ArrayList StylingActivity.templatesList>
    //  363  838:iload_3         
    //  364  839:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  365  842:checkcast       #58  <Class String>
    //  366  845:ldc1            #75  <String "[get_more]">
    //  367  847:invokevirtual   #79  <Method boolean String.equals(Object)>
    //  368  850:ifeq            878
    //  369  853:new             #81  <Class Intent>
    //  370  856:dup             
    //  371  857:aload_0         
    //  372  858:getfield        #83  <Field Context context>
    //  373  861:ldc1            #85  <Class StoreActivity>
    //  374  863:invokespecial   #88  <Method void Intent(Context, Class)>
    //  375  866:astore          8
    //  376  868:aload_0         
    //  377  869:getfield        #83  <Field Context context>
    //  378  872:aload           8
    //  379  874:invokevirtual   #94  <Method void Context.startActivity(Intent)>
    //  380  877:return          
    // try 878 921 handler(s) 827
    //  381  878:getstatic       #229 <Field ArrayList StylingActivity.templatesList>
    //  382  881:iload_3         
    //  383  882:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  384  885:checkcast       #58  <Class String>
    //  385  888:ldc1            #231 <String "[custom_color]">
    //  386  890:invokevirtual   #79  <Method boolean String.equals(Object)>
    //  387  893:ifeq            922
    //  388  896:new             #233 <Class AmbilWarnaDialog>
    //  389  899:dup             
    //  390  900:getstatic       #236 <Field Context StylingActivity.c>
    //  391  903:getstatic       #240 <Field int StylingActivity.lastChosenBGColor>
    //  392  906:new             #242 <Class StylingImagesFragment$7>
    //  393  909:dup             
    //  394  910:aload_0         
    //  395  911:aload_2         
    //  396  912:invokespecial   #245 <Method void StylingImagesFragment$7(StylingImagesFragment, View)>
    //  397  915:invokespecial   #248 <Method void AmbilWarnaDialog(Context, int, yuku.ambilwarna.AmbilWarnaDialog$OnAmbilWarnaListener)>
    //  398  918:invokevirtual   #251 <Method void AmbilWarnaDialog.show()>
    //  399  921:return          
    // try 922 935 handler(s) 827
    //  400  922:getstatic       #229 <Field ArrayList StylingActivity.templatesList>
    //  401  925:iload_3         
    //  402  926:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  403  929:checkcast       #58  <Class String>
    //  404  932:invokestatic    #254 <Method void StylingActivity.setTemplate(String)>
    //  405  935:return          
    //  406  936:aload_1         
    //  407  937:ldc2            #256 <String "text_color">
    //  408  940:invokevirtual   #62  <Method boolean String.contains(CharSequence)>
    //  409  943:ifeq            1007
    //  410  946:getstatic       #259 <Field ArrayList StylingActivity.colorsList>
    //  411  949:iload_3         
    //  412  950:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  413  953:ldc1            #231 <String "[custom_color]">
    //  414  955:if_acmpne       993
    //  415  958:new             #233 <Class AmbilWarnaDialog>
    //  416  961:dup             
    //  417  962:getstatic       #236 <Field Context StylingActivity.c>
    //  418  965:getstatic       #102 <Field SuperSurface StylingActivity.superSurface>
    //  419  968:invokevirtual   #108 <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //  420  971:getfield        #263 <Field el7rTextView SuperSurfaceItem.textViewDraw>
    //  421  974:invokevirtual   #268 <Method int el7rTextView.getCurrentTextColor()>
    //  422  977:new             #270 <Class StylingImagesFragment$8>
    //  423  980:dup             
    //  424  981:aload_0         
    //  425  982:aload_2         
    //  426  983:invokespecial   #271 <Method void StylingImagesFragment$8(StylingImagesFragment, View)>
    //  427  986:invokespecial   #248 <Method void AmbilWarnaDialog(Context, int, yuku.ambilwarna.AmbilWarnaDialog$OnAmbilWarnaListener)>
    //  428  989:invokevirtual   #251 <Method void AmbilWarnaDialog.show()>
    //  429  992:return          
    //  430  993:getstatic       #259 <Field ArrayList StylingActivity.colorsList>
    //  431  996:iload_3         
    //  432  997:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  433 1000:checkcast       #58  <Class String>
    //  434 1003:invokestatic    #274 <Method void StylingActivity.applyTextColor(String)>
    //  435 1006:return          
    //  436 1007:aload_1         
    //  437 1008:ldc2            #276 <String "text_shadow">
    //  438 1011:invokevirtual   #62  <Method boolean String.contains(CharSequence)>
    //  439 1014:ifeq            1078
    //  440 1017:getstatic       #279 <Field ArrayList StylingActivity.shadowColorsList>
    //  441 1020:iload_3         
    //  442 1021:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  443 1024:ldc1            #231 <String "[custom_color]">
    //  444 1026:if_acmpne       1064
    //  445 1029:new             #233 <Class AmbilWarnaDialog>
    //  446 1032:dup             
    //  447 1033:getstatic       #236 <Field Context StylingActivity.c>
    //  448 1036:getstatic       #102 <Field SuperSurface StylingActivity.superSurface>
    //  449 1039:invokevirtual   #108 <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //  450 1042:getfield        #263 <Field el7rTextView SuperSurfaceItem.textViewDraw>
    //  451 1045:invokevirtual   #282 <Method int el7rTextView.getShadowColor()>
    //  452 1048:new             #284 <Class StylingImagesFragment$9>
    //  453 1051:dup             
    //  454 1052:aload_0         
    //  455 1053:aload_2         
    //  456 1054:invokespecial   #285 <Method void StylingImagesFragment$9(StylingImagesFragment, View)>
    //  457 1057:invokespecial   #248 <Method void AmbilWarnaDialog(Context, int, yuku.ambilwarna.AmbilWarnaDialog$OnAmbilWarnaListener)>
    //  458 1060:invokevirtual   #251 <Method void AmbilWarnaDialog.show()>
    //  459 1063:return          
    //  460 1064:getstatic       #279 <Field ArrayList StylingActivity.shadowColorsList>
    //  461 1067:iload_3         
    //  462 1068:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  463 1071:checkcast       #58  <Class String>
    //  464 1074:invokestatic    #288 <Method void StylingActivity.applyTextShadow(String)>
    //  465 1077:return          
    //  466 1078:aload_1         
    //  467 1079:ldc2            #290 <String "highlight">
    //  468 1082:invokevirtual   #62  <Method boolean String.contains(CharSequence)>
    //  469 1085:ifeq            51
    //  470 1088:getstatic       #279 <Field ArrayList StylingActivity.shadowColorsList>
    //  471 1091:iload_3         
    //  472 1092:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  473 1095:ldc1            #231 <String "[custom_color]">
    //  474 1097:if_acmpne       1174
    //  475 1100:iconst_m1       
    //  476 1101:istore          4
    //  477 1103:getstatic       #102 <Field SuperSurface StylingActivity.superSurface>
    //  478 1106:invokevirtual   #108 <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //  479 1109:getfield        #293 <Field String SuperSurfaceItem.highlightColor>
    //  480 1112:ifnonnull       1143
    //  481 1115:iconst_m1       
    //  482 1116:istore          4
    //  483 1118:new             #233 <Class AmbilWarnaDialog>
    //  484 1121:dup             
    //  485 1122:getstatic       #236 <Field Context StylingActivity.c>
    //  486 1125:iload           4
    //  487 1127:new             #295 <Class StylingImagesFragment$10>
    //  488 1130:dup             
    //  489 1131:aload_0         
    //  490 1132:aload_2         
    //  491 1133:invokespecial   #296 <Method void StylingImagesFragment$10(StylingImagesFragment, View)>
    //  492 1136:invokespecial   #248 <Method void AmbilWarnaDialog(Context, int, yuku.ambilwarna.AmbilWarnaDialog$OnAmbilWarnaListener)>
    //  493 1139:invokevirtual   #251 <Method void AmbilWarnaDialog.show()>
    //  494 1142:return          
    // try 1143 1157 handler(s) 1164
    //  495 1143:getstatic       #102 <Field SuperSurface StylingActivity.superSurface>
    //  496 1146:invokevirtual   #108 <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //  497 1149:getfield        #293 <Field String SuperSurfaceItem.highlightColor>
    //  498 1152:invokestatic    #302 <Method int Color.parseColor(String)>
    //  499 1155:istore          6
    //  500 1157:iload           6
    //  501 1159:istore          4
    //  502 1161:goto            1118
    // catch Exception
    //  503 1164:astore          5
    //  504 1166:aload           5
    //  505 1168:invokevirtual   #136 <Method void Exception.printStackTrace()>
    //  506 1171:goto            1118
    //  507 1174:getstatic       #279 <Field ArrayList StylingActivity.shadowColorsList>
    //  508 1177:iload_3         
    //  509 1178:invokevirtual   #73  <Method Object ArrayList.get(int)>
    //  510 1181:checkcast       #58  <Class String>
    //  511 1184:invokestatic    #305 <Method void StylingActivity.applyHighlightColor(String)>
    //  512 1187:return          
    }

    public void onActivityCreated(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #310 <Method void Fragment.onActivityCreated(Bundle)>
    //    3    5:aload_0         
    //    4    6:getfield        #312 <Field View view>
    //    5    9:ldc2            #313 <Int 0x7f0600d0>
    //    6   12:invokevirtual   #319 <Method View View.findViewById(int)>
    //    7   15:invokevirtual   #322 <Method int View.getVisibility()>
    //    8   18:bipush          8
    //    9   20:icmpne          30
    //   10   23:aload_0         
    //   11   24:ldc2            #324 <String "tablet">
    //   12   27:putfield        #32  <Field String layout>
    //   13   30:aload_0         
    //   14   31:getfield        #312 <Field View view>
    //   15   34:ldc2            #325 <Int 0x7f0600cd>
    //   16   37:invokevirtual   #319 <Method View View.findViewById(int)>
    //   17   40:checkcast       #327 <Class AdapterView>
    //   18   43:astore_2        
    //   19   44:aload_2         
    //   20   45:aconst_null     
    //   21   46:invokevirtual   #331 <Method void AdapterView.setAdapter(android.widget.Adapter)>
    //   22   49:aload_0         
    //   23   50:getfield        #312 <Field View view>
    //   24   53:ldc2            #332 <Int 0x7f0600cb>
    //   25   56:invokevirtual   #319 <Method View View.findViewById(int)>
    //   26   59:astore_3        
    //   27   60:aload_0         
    //   28   61:aload_0         
    //   29   62:invokevirtual   #336 <Method Bundle getArguments()>
    //   30   65:ldc1            #39  <String "whatToLoad">
    //   31   67:invokevirtual   #340 <Method String Bundle.getString(String)>
    //   32   70:putfield        #22  <Field String whatToLoad>
    //   33   73:aload_0         
    //   34   74:aload_0         
    //   35   75:invokevirtual   #147 <Method android.support.v4.app.FragmentActivity getActivity()>
    //   36   78:putfield        #83  <Field Context context>
    //   37   81:getstatic       #259 <Field ArrayList StylingActivity.colorsList>
    //   38   84:ifnonnull       93
    // try 87 93 handler(s) 331
    //   39   87:getstatic       #236 <Field Context StylingActivity.c>
    //   40   90:invokestatic    #344 <Method void Utilities.updateLists(Context)>
    //   41   93:aload_1         
    //   42   94:ifnull          341
    //   43   97:aload_0         
    //   44   98:aload_1         
    //   45   99:ldc2            #346 <String "theList">
    //   46  102:invokevirtual   #350 <Method ArrayList Bundle.getStringArrayList(String)>
    //   47  105:putfield        #352 <Field ArrayList list>
    //   48  108:aload_0         
    //   49  109:getfield        #312 <Field View view>
    //   50  112:ldc2            #353 <Int 0x7f0600ce>
    //   51  115:invokevirtual   #319 <Method View View.findViewById(int)>
    //   52  118:checkcast       #355 <Class ImageButton>
    //   53  121:astore          4
    //   54  123:aload_0         
    //   55  124:getfield        #22  <Field String whatToLoad>
    //   56  127:ldc1            #180 <String "filters">
    //   57  129:invokevirtual   #62  <Method boolean String.contains(CharSequence)>
    //   58  132:ifeq            163
    //   59  135:aload_0         
    //   60  136:getfield        #32  <Field String layout>
    //   61  139:ldc1            #30  <String "phone">
    //   62  141:if_acmpne       515
    //   63  144:aload           4
    //   64  146:iconst_0        
    //   65  147:invokevirtual   #359 <Method void ImageButton.setVisibility(int)>
    //   66  150:aload           4
    //   67  152:new             #361 <Class StylingImagesFragment$1>
    //   68  155:dup             
    //   69  156:aload_0         
    //   70  157:invokespecial   #364 <Method void StylingImagesFragment$1(StylingImagesFragment)>
    //   71  160:invokevirtual   #368 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //   72  163:aload_0         
    //   73  164:getfield        #22  <Field String whatToLoad>
    //   74  167:ldc2            #290 <String "highlight">
    //   75  170:invokevirtual   #62  <Method boolean String.contains(CharSequence)>
    //   76  173:ifeq            204
    //   77  176:aload_0         
    //   78  177:getfield        #32  <Field String layout>
    //   79  180:ldc1            #30  <String "phone">
    //   80  182:if_acmpne       577
    //   81  185:aload           4
    //   82  187:iconst_0        
    //   83  188:invokevirtual   #359 <Method void ImageButton.setVisibility(int)>
    //   84  191:aload           4
    //   85  193:new             #370 <Class StylingImagesFragment$2>
    //   86  196:dup             
    //   87  197:aload_0         
    //   88  198:invokespecial   #371 <Method void StylingImagesFragment$2(StylingImagesFragment)>
    //   89  201:invokevirtual   #368 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //   90  204:aload_0         
    //   91  205:getfield        #22  <Field String whatToLoad>
    //   92  208:ldc2            #256 <String "text_color">
    //   93  211:if_acmpeq       224
    //   94  214:aload_0         
    //   95  215:getfield        #22  <Field String whatToLoad>
    //   96  218:ldc2            #276 <String "text_shadow">
    //   97  221:if_acmpne       255
    //   98  224:aload_0         
    //   99  225:getfield        #312 <Field View view>
    //  100  228:ldc2            #372 <Int 0x7f0600cc>
    //  101  231:invokevirtual   #319 <Method View View.findViewById(int)>
    //  102  234:astore          5
    //  103  236:aload           5
    //  104  238:iconst_0        
    //  105  239:invokevirtual   #373 <Method void View.setVisibility(int)>
    //  106  242:aload           5
    //  107  244:new             #375 <Class StylingImagesFragment$3>
    //  108  247:dup             
    //  109  248:aload_0         
    //  110  249:invokespecial   #376 <Method void StylingImagesFragment$3(StylingImagesFragment)>
    //  111  252:invokevirtual   #377 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
    // try 255 261 handler(s) 649
    //  112  255:aload_0         
    //  113  256:getfield        #352 <Field ArrayList list>
    //  114  259:astore          7
    //  115  261:aload           7
    //  116  263:ifnull          659
    // try 266 294 handler(s) 639
    //  117  266:aload_2         
    //  118  267:new             #379 <Class StylingImagesAdapter>
    //  119  270:dup             
    //  120  271:aload_0         
    //  121  272:getfield        #83  <Field Context context>
    //  122  275:aload_0         
    //  123  276:getfield        #352 <Field ArrayList list>
    //  124  279:ldc2            #381 <String "gallery">
    //  125  282:invokespecial   #384 <Method void StylingImagesAdapter(Context, ArrayList, String)>
    //  126  285:invokevirtual   #331 <Method void AdapterView.setAdapter(android.widget.Adapter)>
    //  127  288:aload_3         
    //  128  289:bipush          8
    //  129  291:invokevirtual   #373 <Method void View.setVisibility(int)>
    //  130  294:aload_2         
    //  131  295:new             #386 <Class StylingImagesFragment$5>
    //  132  298:dup             
    //  133  299:aload_0         
    //  134  300:invokespecial   #387 <Method void StylingImagesFragment$5(StylingImagesFragment)>
    //  135  303:invokevirtual   #391 <Method void AdapterView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
    //  136  306:aload_0         
    //  137  307:getfield        #312 <Field View view>
    //  138  310:ldc2            #392 <Int 0x7f0600cf>
    //  139  313:invokevirtual   #319 <Method View View.findViewById(int)>
    //  140  316:checkcast       #355 <Class ImageButton>
    //  141  319:new             #394 <Class StylingImagesFragment$6>
    //  142  322:dup             
    //  143  323:aload_0         
    //  144  324:invokespecial   #395 <Method void StylingImagesFragment$6(StylingImagesFragment)>
    //  145  327:invokevirtual   #368 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //  146  330:return          
    // catch IOException
    //  147  331:astore          16
    //  148  333:aload           16
    //  149  335:invokevirtual   #396 <Method void IOException.printStackTrace()>
    //  150  338:goto            93
    //  151  341:aload_0         
    //  152  342:getfield        #22  <Field String whatToLoad>
    //  153  345:ldc1            #56  <String "fonts">
    //  154  347:if_acmpne       360
    //  155  350:aload_0         
    //  156  351:getstatic       #67  <Field ArrayList StylingActivity.fontsList>
    //  157  354:putfield        #352 <Field ArrayList list>
    //  158  357:goto            108
    //  159  360:aload_0         
    //  160  361:getfield        #22  <Field String whatToLoad>
    //  161  364:ldc1            #138 <String "backgrounds">
    //  162  366:if_acmpne       379
    //  163  369:aload_0         
    //  164  370:getstatic       #141 <Field ArrayList StylingActivity.backgroundsList>
    //  165  373:putfield        #352 <Field ArrayList list>
    //  166  376:goto            108
    //  167  379:aload_0         
    //  168  380:getfield        #22  <Field String whatToLoad>
    //  169  383:ldc1            #168 <String "frames">
    //  170  385:if_acmpne       398
    //  171  388:aload_0         
    //  172  389:getstatic       #171 <Field ArrayList StylingActivity.framesList>
    //  173  392:putfield        #352 <Field ArrayList list>
    //  174  395:goto            108
    //  175  398:aload_0         
    //  176  399:getfield        #22  <Field String whatToLoad>
    //  177  402:ldc1            #190 <String "stickers">
    //  178  404:if_acmpne       417
    //  179  407:aload_0         
    //  180  408:getstatic       #193 <Field ArrayList StylingActivity.stickersList>
    //  181  411:putfield        #352 <Field ArrayList list>
    //  182  414:goto            108
    //  183  417:aload_0         
    //  184  418:getfield        #22  <Field String whatToLoad>
    //  185  421:ldc1            #226 <String "templates">
    //  186  423:if_acmpne       436
    //  187  426:aload_0         
    //  188  427:getstatic       #229 <Field ArrayList StylingActivity.templatesList>
    //  189  430:putfield        #352 <Field ArrayList list>
    //  190  433:goto            108
    //  191  436:aload_0         
    //  192  437:getfield        #22  <Field String whatToLoad>
    //  193  440:ldc1            #180 <String "filters">
    //  194  442:if_acmpne       455
    //  195  445:aload_0         
    //  196  446:getstatic       #183 <Field ArrayList StylingActivity.filtersList>
    //  197  449:putfield        #352 <Field ArrayList list>
    //  198  452:goto            108
    //  199  455:aload_0         
    //  200  456:getfield        #22  <Field String whatToLoad>
    //  201  459:ldc2            #256 <String "text_color">
    //  202  462:if_acmpne       475
    //  203  465:aload_0         
    //  204  466:getstatic       #259 <Field ArrayList StylingActivity.colorsList>
    //  205  469:putfield        #352 <Field ArrayList list>
    //  206  472:goto            108
    //  207  475:aload_0         
    //  208  476:getfield        #22  <Field String whatToLoad>
    //  209  479:ldc2            #290 <String "highlight">
    //  210  482:if_acmpne       495
    //  211  485:aload_0         
    //  212  486:getstatic       #279 <Field ArrayList StylingActivity.shadowColorsList>
    //  213  489:putfield        #352 <Field ArrayList list>
    //  214  492:goto            108
    //  215  495:aload_0         
    //  216  496:getfield        #22  <Field String whatToLoad>
    //  217  499:ldc2            #276 <String "text_shadow">
    //  218  502:if_acmpne       108
    //  219  505:aload_0         
    //  220  506:getstatic       #279 <Field ArrayList StylingActivity.shadowColorsList>
    //  221  509:putfield        #352 <Field ArrayList list>
    //  222  512:goto            108
    //  223  515:aload_0         
    //  224  516:getfield        #32  <Field String layout>
    //  225  519:ldc2            #324 <String "tablet">
    //  226  522:if_acmpne       163
    //  227  525:aload_0         
    //  228  526:getfield        #312 <Field View view>
    //  229  529:ldc2            #397 <Int 0x7f0600d1>
    //  230  532:invokevirtual   #319 <Method View View.findViewById(int)>
    //  231  535:checkcast       #399 <Class LinearLayout>
    //  232  538:ldc2            #400 <Int 0x454c79>
    //  233  541:invokevirtual   #403 <Method void LinearLayout.setId(int)>
    //  234  544:getstatic       #407 <Field FragmentManager StylingActivity.fragmentManager>
    //  235  547:invokevirtual   #413 <Method FragmentTransaction FragmentManager.beginTransaction()>
    //  236  550:astore          13
    //  237  552:aload           13
    //  238  554:ldc2            #400 <Int 0x454c79>
    //  239  557:new             #415 <Class StylingFilterOptionsFragment>
    //  240  560:dup             
    //  241  561:invokespecial   #416 <Method void StylingFilterOptionsFragment()>
    //  242  564:invokevirtual   #422 <Method FragmentTransaction FragmentTransaction.replace(int, Fragment)>
    //  243  567:pop             
    //  244  568:aload           13
    //  245  570:invokevirtual   #425 <Method int FragmentTransaction.commit()>
    //  246  573:pop             
    //  247  574:goto            163
    //  248  577:aload_0         
    //  249  578:getfield        #32  <Field String layout>
    //  250  581:ldc2            #324 <String "tablet">
    //  251  584:if_acmpne       204
    //  252  587:aload_0         
    //  253  588:getfield        #312 <Field View view>
    //  254  591:ldc2            #426 <Int 0x7f0600d2>
    //  255  594:invokevirtual   #319 <Method View View.findViewById(int)>
    //  256  597:checkcast       #399 <Class LinearLayout>
    //  257  600:ldc2            #427 <Int 0x455e8b>
    //  258  603:invokevirtual   #403 <Method void LinearLayout.setId(int)>
    //  259  606:getstatic       #407 <Field FragmentManager StylingActivity.fragmentManager>
    //  260  609:invokevirtual   #413 <Method FragmentTransaction FragmentManager.beginTransaction()>
    //  261  612:astore          10
    //  262  614:aload           10
    //  263  616:ldc2            #427 <Int 0x455e8b>
    //  264  619:new             #429 <Class StylingHighlightOptionsFragment>
    //  265  622:dup             
    //  266  623:invokespecial   #430 <Method void StylingHighlightOptionsFragment()>
    //  267  626:invokevirtual   #422 <Method FragmentTransaction FragmentTransaction.replace(int, Fragment)>
    //  268  629:pop             
    //  269  630:aload           10
    //  270  632:invokevirtual   #425 <Method int FragmentTransaction.commit()>
    //  271  635:pop             
    //  272  636:goto            204
    // catch Exception
    //  273  639:astore          9
    // try 641 646 handler(s) 649
    //  274  641:aload           9
    //  275  643:invokevirtual   #136 <Method void Exception.printStackTrace()>
    //  276  646:goto            294
    // catch Exception Exception Exception
    //  277  649:astore          6
    //  278  651:aload           6
    //  279  653:invokevirtual   #136 <Method void Exception.printStackTrace()>
    //  280  656:goto            294
    // try 659 683 handler(s) 649
    //  281  659:new             #432 <Class Handler>
    //  282  662:dup             
    //  283  663:invokespecial   #433 <Method void Handler()>
    //  284  666:new             #435 <Class StylingImagesFragment$4>
    //  285  669:dup             
    //  286  670:aload_0         
    //  287  671:aload_2         
    //  288  672:aload_3         
    //  289  673:invokespecial   #438 <Method void StylingImagesFragment$4(StylingImagesFragment, AdapterView, View)>
    //  290  676:ldc2w           #439 <Long 100L>
    //  291  679:invokevirtual   #444 <Method boolean Handler.postDelayed(Runnable, long)>
    //  292  682:pop             
    //  293  683:goto            294
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
    //    0    0:aload_1         
    //    1    1:ldc2            #447 <Int 0x7f030037>
    //    2    4:aload_2         
    //    3    5:iconst_0        
    //    4    6:invokevirtual   #453 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //    5    9:astore          4
    //    6   11:aload_0         
    //    7   12:aload           4
    //    8   14:putfield        #312 <Field View view>
    //    9   17:aload           4
    //   10   19:areturn         
    }

    public void onSaveInstanceState(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #456 <Method void Fragment.onSaveInstanceState(Bundle)>
    //    3    5:aload_1         
    //    4    6:ldc2            #346 <String "theList">
    //    5    9:aload_0         
    //    6   10:getfield        #352 <Field ArrayList list>
    //    7   13:invokevirtual   #460 <Method void Bundle.putStringArrayList(String, ArrayList)>
    //    8   16:aload_0         
    //    9   17:iconst_1        
    //   10   18:invokevirtual   #464 <Method void setUserVisibleHint(boolean)>
    //   11   21:return          
    }

    String TAG;
    Context context;
    View lastItemView;
    String layout;
    ArrayList list;
    View view;
    String whatToLoad;

    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingImagesFragment$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingImagesFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view1)
        {
        //    0    0:getstatic       #28  <Field LinearLayout StylingActivity.fragmentContainerLL>
        //    1    3:iconst_0        
        //    2    4:invokevirtual   #34  <Method void LinearLayout.setVisibility(int)>
        //    3    7:getstatic       #38  <Field ViewPager StylingActivity.viewPager>
        //    4   10:bipush          8
        //    5   12:invokevirtual   #41  <Method void ViewPager.setVisibility(int)>
        //    6   15:getstatic       #45  <Field FragmentManager StylingActivity.fragmentManager>
        //    7   18:invokevirtual   #51  <Method FragmentTransaction FragmentManager.beginTransaction()>
        //    8   21:astore_2        
        //    9   22:aload_2         
        //   10   23:ldc1            #52  <Int 0x7f0600b9>
        //   11   25:new             #54  <Class StylingFilterOptionsFragment>
        //   12   28:dup             
        //   13   29:invokespecial   #55  <Method void StylingFilterOptionsFragment()>
        //   14   32:invokevirtual   #61  <Method FragmentTransaction FragmentTransaction.replace(int, Fragment)>
        //   15   35:pop             
        //   16   36:aload_2         
        //   17   37:invokevirtual   #65  <Method int FragmentTransaction.commit()>
        //   18   40:pop             
        //   19   41:return          
        }

        final StylingImagesFragment this$0;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingImagesFragment$10

/* anonymous class */
    class _cls10
        implements yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener
    {

        _cls10()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StylingImagesFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field View val$view>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onCancel(AmbilWarnaDialog ambilwarnadialog)
        {
        //    0    0:return          
        }

        public void onOk(AmbilWarnaDialog ambilwarnadialog, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field View val$view>
        //    2    4:ldc1            #29  <Int 0x7f060094>
        //    3    6:invokevirtual   #35  <Method View View.findViewById(int)>
        //    4    9:checkcast       #37  <Class ImageView>
        //    5   12:astore_3        
        //    6   13:iconst_1        
        //    7   14:anewarray       Object[]
        //    8   17:astore          4
        //    9   19:aload           4
        //   10   21:iconst_0        
        //   11   22:ldc1            #38  <Int 0xffffff>
        //   12   24:iload_2         
        //   13   25:iand            
        //   14   26:invokestatic    #44  <Method Integer Integer.valueOf(int)>
        //   15   29:aastore         
        //   16   30:ldc1            #46  <String "#%06X">
        //   17   32:aload           4
        //   18   34:invokestatic    #52  <Method String String.format(String, Object[])>
        //   19   37:invokestatic    #58  <Method void StylingActivity.applyHighlightColor(String)>
        //   20   40:getstatic       #62  <Field Context StylingActivity.c>
        //   21   43:ldc1            #64  <String "data/gv_icon_custom_color.png">
        //   22   45:invokestatic    #70  <Method Bitmap el7rUtilities.getBitmapFromAsset(Context, String)>
        //   23   48:astore          5
        //   24   50:bipush          100
        //   25   52:bipush          100
        //   26   54:getstatic       #76  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
        //   27   57:invokestatic    #82  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
        //   28   60:astore          6
        //   29   62:new             #84  <Class Canvas>
        //   30   65:dup             
        //   31   66:aload           6
        //   32   68:invokespecial   #87  <Method void Canvas(Bitmap)>
        //   33   71:astore          7
        //   34   73:aload           7
        //   35   75:iload_2         
        //   36   76:invokevirtual   #91  <Method void Canvas.drawColor(int)>
        //   37   79:aload           7
        //   38   81:aload           5
        //   39   83:fconst_0        
        //   40   84:fconst_0        
        //   41   85:aconst_null     
        //   42   86:invokevirtual   #95  <Method void Canvas.drawBitmap(Bitmap, float, float, android.graphics.Paint)>
        //   43   89:aload_3         
        //   44   90:aload           6
        //   45   92:invokevirtual   #98  <Method void ImageView.setImageBitmap(Bitmap)>
        //   46   95:return          
        }

        final StylingImagesFragment this$0;
        private final View val$view;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingImagesFragment$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingImagesFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view1)
        {
        //    0    0:getstatic       #28  <Field LinearLayout StylingActivity.fragmentContainerLL>
        //    1    3:iconst_0        
        //    2    4:invokevirtual   #34  <Method void LinearLayout.setVisibility(int)>
        //    3    7:getstatic       #38  <Field ViewPager StylingActivity.viewPager>
        //    4   10:bipush          8
        //    5   12:invokevirtual   #41  <Method void ViewPager.setVisibility(int)>
        //    6   15:getstatic       #45  <Field FragmentManager StylingActivity.fragmentManager>
        //    7   18:invokevirtual   #51  <Method FragmentTransaction FragmentManager.beginTransaction()>
        //    8   21:astore_2        
        //    9   22:aload_2         
        //   10   23:ldc1            #52  <Int 0x7f0600b9>
        //   11   25:new             #54  <Class StylingHighlightOptionsFragment>
        //   12   28:dup             
        //   13   29:invokespecial   #55  <Method void StylingHighlightOptionsFragment()>
        //   14   32:invokevirtual   #61  <Method FragmentTransaction FragmentTransaction.replace(int, Fragment)>
        //   15   35:pop             
        //   16   36:aload_2         
        //   17   37:invokevirtual   #65  <Method int FragmentTransaction.commit()>
        //   18   40:pop             
        //   19   41:return          
        }

        final StylingImagesFragment this$0;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingImagesFragment$3

/* anonymous class */
    class _cls3
        implements android.view.View.OnClickListener
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingImagesFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view1)
        {
        //    0    0:iconst_0        
        //    1    1:invokestatic    #28  <Method void StylingActivity.toggleSubFragment(boolean)>
        //    2    4:return          
        }

        final StylingImagesFragment this$0;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingImagesFragment$4

/* anonymous class */
    class _cls4
        implements Runnable
    {

        _cls4()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #21  <Field StylingImagesFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #23  <Field AdapterView val$gv>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #25  <Field View val$progressView>
        //    9   15:aload_0         
        //   10   16:invokespecial   #28  <Method void Object()>
        //   11   19:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field StylingImagesFragment this$0>
        //    2    4:getfield        #33  <Field String StylingImagesFragment.whatToLoad>
        //    3    7:ldc1            #35  <String "fonts">
        //    4    9:if_acmpne       72
        //    5   12:aload_0         
        //    6   13:getfield        #21  <Field StylingImagesFragment this$0>
        //    7   16:getstatic       #41  <Field ArrayList StylingActivity.fontsList>
        //    8   19:putfield        #44  <Field ArrayList StylingImagesFragment.list>
        //    9   22:aload_0         
        //   10   23:getfield        #21  <Field StylingImagesFragment this$0>
        //   11   26:getfield        #44  <Field ArrayList StylingImagesFragment.list>
        //   12   29:ifnull          247
        //   13   32:aload_0         
        //   14   33:getfield        #23  <Field AdapterView val$gv>
        //   15   36:new             #46  <Class StylingImagesAdapter>
        //   16   39:dup             
        //   17   40:aload_0         
        //   18   41:getfield        #21  <Field StylingImagesFragment this$0>
        //   19   44:getfield        #50  <Field Context StylingImagesFragment.context>
        //   20   47:aload_0         
        //   21   48:getfield        #21  <Field StylingImagesFragment this$0>
        //   22   51:getfield        #44  <Field ArrayList StylingImagesFragment.list>
        //   23   54:ldc1            #52  <String "gallery">
        //   24   56:invokespecial   #55  <Method void StylingImagesAdapter(Context, ArrayList, String)>
        //   25   59:invokevirtual   #61  <Method void AdapterView.setAdapter(android.widget.Adapter)>
        //   26   62:aload_0         
        //   27   63:getfield        #25  <Field View val$progressView>
        //   28   66:bipush          8
        //   29   68:invokevirtual   #67  <Method void View.setVisibility(int)>
        //   30   71:return          
        //   31   72:aload_0         
        //   32   73:getfield        #21  <Field StylingImagesFragment this$0>
        //   33   76:getfield        #33  <Field String StylingImagesFragment.whatToLoad>
        //   34   79:ldc1            #69  <String "backgrounds">
        //   35   81:if_acmpne       97
        //   36   84:aload_0         
        //   37   85:getfield        #21  <Field StylingImagesFragment this$0>
        //   38   88:getstatic       #72  <Field ArrayList StylingActivity.backgroundsList>
        //   39   91:putfield        #44  <Field ArrayList StylingImagesFragment.list>
        //   40   94:goto            22
        //   41   97:aload_0         
        //   42   98:getfield        #21  <Field StylingImagesFragment this$0>
        //   43  101:getfield        #33  <Field String StylingImagesFragment.whatToLoad>
        //   44  104:ldc1            #74  <String "frames">
        //   45  106:if_acmpne       122
        //   46  109:aload_0         
        //   47  110:getfield        #21  <Field StylingImagesFragment this$0>
        //   48  113:getstatic       #77  <Field ArrayList StylingActivity.framesList>
        //   49  116:putfield        #44  <Field ArrayList StylingImagesFragment.list>
        //   50  119:goto            22
        //   51  122:aload_0         
        //   52  123:getfield        #21  <Field StylingImagesFragment this$0>
        //   53  126:getfield        #33  <Field String StylingImagesFragment.whatToLoad>
        //   54  129:ldc1            #79  <String "stickers">
        //   55  131:if_acmpne       147
        //   56  134:aload_0         
        //   57  135:getfield        #21  <Field StylingImagesFragment this$0>
        //   58  138:getstatic       #82  <Field ArrayList StylingActivity.stickersList>
        //   59  141:putfield        #44  <Field ArrayList StylingImagesFragment.list>
        //   60  144:goto            22
        //   61  147:aload_0         
        //   62  148:getfield        #21  <Field StylingImagesFragment this$0>
        //   63  151:getfield        #33  <Field String StylingImagesFragment.whatToLoad>
        //   64  154:ldc1            #84  <String "templates">
        //   65  156:if_acmpne       172
        //   66  159:aload_0         
        //   67  160:getfield        #21  <Field StylingImagesFragment this$0>
        //   68  163:getstatic       #87  <Field ArrayList StylingActivity.templatesList>
        //   69  166:putfield        #44  <Field ArrayList StylingImagesFragment.list>
        //   70  169:goto            22
        //   71  172:aload_0         
        //   72  173:getfield        #21  <Field StylingImagesFragment this$0>
        //   73  176:getfield        #33  <Field String StylingImagesFragment.whatToLoad>
        //   74  179:ldc1            #89  <String "filters">
        //   75  181:if_acmpne       197
        //   76  184:aload_0         
        //   77  185:getfield        #21  <Field StylingImagesFragment this$0>
        //   78  188:getstatic       #92  <Field ArrayList StylingActivity.filtersList>
        //   79  191:putfield        #44  <Field ArrayList StylingImagesFragment.list>
        //   80  194:goto            22
        //   81  197:aload_0         
        //   82  198:getfield        #21  <Field StylingImagesFragment this$0>
        //   83  201:getfield        #33  <Field String StylingImagesFragment.whatToLoad>
        //   84  204:ldc1            #94  <String "text_color">
        //   85  206:if_acmpne       222
        //   86  209:aload_0         
        //   87  210:getfield        #21  <Field StylingImagesFragment this$0>
        //   88  213:getstatic       #97  <Field ArrayList StylingActivity.colorsList>
        //   89  216:putfield        #44  <Field ArrayList StylingImagesFragment.list>
        //   90  219:goto            22
        //   91  222:aload_0         
        //   92  223:getfield        #21  <Field StylingImagesFragment this$0>
        //   93  226:getfield        #33  <Field String StylingImagesFragment.whatToLoad>
        //   94  229:ldc1            #99  <String "text_shadow">
        //   95  231:if_acmpne       22
        //   96  234:aload_0         
        //   97  235:getfield        #21  <Field StylingImagesFragment this$0>
        //   98  238:getstatic       #102 <Field ArrayList StylingActivity.shadowColorsList>
        //   99  241:putfield        #44  <Field ArrayList StylingImagesFragment.list>
        //  100  244:goto            22
        //  101  247:aload_0         
        //  102  248:getfield        #21  <Field StylingImagesFragment this$0>
        //  103  251:getfield        #105 <Field String StylingImagesFragment.TAG>
        //  104  254:ldc1            #107 <String "Error in setting list">
        //  105  256:invokestatic    #113 <Method int Log.e(String, String)>
        //  106  259:pop             
        //  107  260:return          
        }

        final StylingImagesFragment this$0;
        private final AdapterView val$gv;
        private final View val$progressView;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingImagesFragment$5

/* anonymous class */
    class _cls5
        implements android.widget.AdapterView.OnItemClickListener
    {

        _cls5()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #18  <Field StylingImagesFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #21  <Method void Object()>
        //    5    9:return          
        }

        public void onItemClick(AdapterView adapterview, View view1, int i, long l)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #18  <Field StylingImagesFragment this$0>
        //    2    4:aload_0         
        //    3    5:getfield        #18  <Field StylingImagesFragment this$0>
        //    4    8:getfield        #27  <Field String StylingImagesFragment.whatToLoad>
        //    5   11:aload_2         
        //    6   12:iload_3         
        //    7   13:invokevirtual   #31  <Method void StylingImagesFragment.gvItemClicked(String, View, int)>
        //    8   16:aload_0         
        //    9   17:getfield        #18  <Field StylingImagesFragment this$0>
        //   10   20:getfield        #27  <Field String StylingImagesFragment.whatToLoad>
        //   11   23:ldc1            #33  <String "stickers">
        //   12   25:if_acmpeq       72
        //   13   28:aload_0         
        //   14   29:getfield        #18  <Field StylingImagesFragment this$0>
        //   15   32:getfield        #37  <Field View StylingImagesFragment.lastItemView>
        //   16   35:ifnull          54
        //   17   38:aload_0         
        //   18   39:getfield        #18  <Field StylingImagesFragment this$0>
        //   19   42:getfield        #37  <Field View StylingImagesFragment.lastItemView>
        //   20   45:ldc1            #38  <Int 0x7f060094>
        //   21   47:invokevirtual   #44  <Method View View.findViewById(int)>
        //   22   50:checkcast       #46  <Class ImageView>
        //   23   53:pop             
        //   24   54:aload_2         
        //   25   55:ldc1            #38  <Int 0x7f060094>
        //   26   57:invokevirtual   #44  <Method View View.findViewById(int)>
        //   27   60:checkcast       #46  <Class ImageView>
        //   28   63:pop             
        //   29   64:aload_0         
        //   30   65:getfield        #18  <Field StylingImagesFragment this$0>
        //   31   68:aload_2         
        //   32   69:putfield        #37  <Field View StylingImagesFragment.lastItemView>
        //   33   72:return          
        }

        final StylingImagesFragment this$0;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingImagesFragment$6

/* anonymous class */
    class _cls6
        implements android.view.View.OnClickListener
    {

        _cls6()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingImagesFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        static StylingImagesFragment access$0(_cls6 _pcls6)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field StylingImagesFragment this$0>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #17  <Field StylingImagesFragment this$0>
        //    5    4:areturn         
        }

        public void onClick(View view1)
        {
        //    0    0:getstatic       #30  <Field Context StylingActivity.c>
        //    1    3:ldc1            #31  <Int 0x7f030038>
        //    2    5:aconst_null     
        //    3    6:invokestatic    #37  <Method View View.inflate(Context, int, ViewGroup)>
        //    4    9:astore_2        
        //    5   10:aload_2         
        //    6   11:ldc1            #38  <Int 0x7f0600d3>
        //    7   13:invokevirtual   #42  <Method View View.findViewById(int)>
        //    8   16:checkcast       #44  <Class GridView>
        //    9   19:astore_3        
        //   10   20:aload_3         
        //   11   21:new             #46  <Class StylingImagesAdapter>
        //   12   24:dup             
        //   13   25:aload_0         
        //   14   26:getfield        #17  <Field StylingImagesFragment this$0>
        //   15   29:getfield        #49  <Field Context StylingImagesFragment.context>
        //   16   32:aload_0         
        //   17   33:getfield        #17  <Field StylingImagesFragment this$0>
        //   18   36:getfield        #53  <Field ArrayList StylingImagesFragment.list>
        //   19   39:ldc1            #55  <String "gridview">
        //   20   41:invokespecial   #58  <Method void StylingImagesAdapter(Context, ArrayList, String)>
        //   21   44:invokevirtual   #62  <Method void GridView.setAdapter(android.widget.ListAdapter)>
        //   22   47:new             #64  <Class android.app.AlertDialog$Builder>
        //   23   50:dup             
        //   24   51:getstatic       #30  <Field Context StylingActivity.c>
        //   25   54:invokespecial   #67  <Method void android.app.AlertDialog$Builder(Context)>
        //   26   57:astore          4
        //   27   59:aload           4
        //   28   61:aload_2         
        //   29   62:invokevirtual   #71  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setView(View)>
        //   30   65:pop             
        //   31   66:aload           4
        //   32   68:invokevirtual   #75  <Method AlertDialog android.app.AlertDialog$Builder.create()>
        //   33   71:astore          6
        //   34   73:aload_3         
        //   35   74:new             #77  <Class StylingImagesFragment$6$1>
        //   36   77:dup             
        //   37   78:aload_0         
        //   38   79:aload           6
        //   39   81:invokespecial   #80  <Method void StylingImagesFragment$6$1(StylingImagesFragment$6, AlertDialog)>
        //   40   84:invokevirtual   #84  <Method void GridView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
        //   41   87:aload           6
        //   42   89:aload_0         
        //   43   90:getfield        #17  <Field StylingImagesFragment this$0>
        //   44   93:getfield        #49  <Field Context StylingImagesFragment.context>
        //   45   96:ldc1            #85  <Int 0x7f0b002a>
        //   46   98:invokevirtual   #91  <Method String Context.getString(int)>
        //   47  101:new             #93  <Class StylingImagesFragment$6$2>
        //   48  104:dup             
        //   49  105:aload_0         
        //   50  106:invokespecial   #96  <Method void StylingImagesFragment$6$2(StylingImagesFragment$6)>
        //   51  109:invokevirtual   #102 <Method void AlertDialog.setButton(CharSequence, android.content.DialogInterface$OnClickListener)>
        //   52  112:aload           6
        //   53  114:aload_0         
        //   54  115:getfield        #17  <Field StylingImagesFragment this$0>
        //   55  118:getfield        #49  <Field Context StylingImagesFragment.context>
        //   56  121:ldc1            #103 <Int 0x7f0b002b>
        //   57  123:invokevirtual   #91  <Method String Context.getString(int)>
        //   58  126:new             #105 <Class StylingImagesFragment$6$3>
        //   59  129:dup             
        //   60  130:aload_0         
        //   61  131:invokespecial   #106 <Method void StylingImagesFragment$6$3(StylingImagesFragment$6)>
        //   62  134:invokevirtual   #109 <Method void AlertDialog.setButton2(CharSequence, android.content.DialogInterface$OnClickListener)>
        //   63  137:aload           6
        //   64  139:invokevirtual   #112 <Method void AlertDialog.show()>
        //   65  142:return          
        }

        final StylingImagesFragment this$0;

            static StylingImagesFragment access$0(_cls6 _pcls6)
            {
            //    0    0:aload_0         
            //    1    1:getfield        #17  <Field StylingImagesFragment this$0>
            //    2    4:areturn         
            }
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingImagesFragment$6$1

/* anonymous class */
    class _cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #20  <Field StylingImagesFragment$6 this$1>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #22  <Field AlertDialog val$alertDialog>
        //    6   10:aload_0         
        //    7   11:invokespecial   #25  <Method void Object()>
        //    8   14:return          
        }

        public void onItemClick(AdapterView adapterview, View view1, int i, long l)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #20  <Field StylingImagesFragment$6 this$1>
        //    2    4:invokestatic    #31  <Method StylingImagesFragment StylingImagesFragment$6.access$0(StylingImagesFragment$6)>
        //    3    7:aload_0         
        //    4    8:getfield        #20  <Field StylingImagesFragment$6 this$1>
        //    5   11:invokestatic    #31  <Method StylingImagesFragment StylingImagesFragment$6.access$0(StylingImagesFragment$6)>
        //    6   14:getfield        #37  <Field String StylingImagesFragment.whatToLoad>
        //    7   17:aload_2         
        //    8   18:iload_3         
        //    9   19:invokevirtual   #41  <Method void StylingImagesFragment.gvItemClicked(String, View, int)>
        //   10   22:aload_0         
        //   11   23:getfield        #22  <Field AlertDialog val$alertDialog>
        //   12   26:invokevirtual   #46  <Method void AlertDialog.cancel()>
        //   13   29:return          
        }

        final _cls6 this$1;
        private final AlertDialog val$alertDialog;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingImagesFragment$6$2

/* anonymous class */
    class _cls2
        implements android.content.DialogInterface.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingImagesFragment$6 this$1>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(DialogInterface dialoginterface, int i)
        {
        //    0    0:aload_1         
        //    1    1:invokeinterface #26  <Method void DialogInterface.cancel()>
        //    2    6:return          
        }

        final _cls6 this$1;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingImagesFragment$6$3

/* anonymous class */
    class _cls3
        implements android.content.DialogInterface.OnClickListener
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingImagesFragment$6 this$1>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(DialogInterface dialoginterface, int i)
        {
        //    0    0:new             #23  <Class Intent>
        //    1    3:dup             
        //    2    4:getstatic       #29  <Field Context StylingActivity.c>
        //    3    7:ldc1            #31  <Class StoreActivity>
        //    4    9:invokespecial   #34  <Method void Intent(Context, Class)>
        //    5   12:astore_3        
        //    6   13:getstatic       #29  <Field Context StylingActivity.c>
        //    7   16:aload_3         
        //    8   17:invokevirtual   #40  <Method void Context.startActivity(Intent)>
        //    9   20:aload_1         
        //   10   21:invokeinterface #45  <Method void DialogInterface.cancel()>
        //   11   26:return          
        }

        final _cls6 this$1;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingImagesFragment$7

/* anonymous class */
    class _cls7
        implements yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener
    {

        _cls7()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StylingImagesFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field View val$view>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onCancel(AmbilWarnaDialog ambilwarnadialog)
        {
        //    0    0:return          
        }

        public void onOk(AmbilWarnaDialog ambilwarnadialog, int i)
        {
        //    0    0:iload_2         
        //    1    1:putstatic       #34  <Field int StylingActivity.lastChosenBGColor>
        //    2    4:aload_0         
        //    3    5:getfield        #21  <Field View val$view>
        //    4    8:ldc1            #35  <Int 0x7f060094>
        //    5   10:invokevirtual   #41  <Method View View.findViewById(int)>
        //    6   13:checkcast       #43  <Class ImageView>
        //    7   16:astore_3        
        //    8   17:getstatic       #47  <Field Context StylingActivity.c>
        //    9   20:ldc1            #49  <String "data/gv_icon_custom_color.png">
        //   10   22:invokestatic    #55  <Method Bitmap el7rUtilities.getBitmapFromAsset(Context, String)>
        //   11   25:astore          4
        //   12   27:bipush          100
        //   13   29:bipush          100
        //   14   31:getstatic       #61  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
        //   15   34:invokestatic    #67  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
        //   16   37:astore          5
        //   17   39:new             #69  <Class Canvas>
        //   18   42:dup             
        //   19   43:aload           5
        //   20   45:invokespecial   #72  <Method void Canvas(Bitmap)>
        //   21   48:astore          6
        //   22   50:aload           6
        //   23   52:iload_2         
        //   24   53:invokevirtual   #76  <Method void Canvas.drawColor(int)>
        //   25   56:aload           6
        //   26   58:aload           4
        //   27   60:fconst_0        
        //   28   61:fconst_0        
        //   29   62:aconst_null     
        //   30   63:invokevirtual   #80  <Method void Canvas.drawBitmap(Bitmap, float, float, android.graphics.Paint)>
        //   31   66:aload_3         
        //   32   67:aload           5
        //   33   69:invokevirtual   #83  <Method void ImageView.setImageBitmap(Bitmap)>
        //   34   72:bipush          100
        //   35   74:bipush          100
        //   36   76:getstatic       #61  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
        //   37   79:invokestatic    #67  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
        //   38   82:astore          7
        //   39   84:new             #69  <Class Canvas>
        //   40   87:dup             
        //   41   88:aload           7
        //   42   90:invokespecial   #72  <Method void Canvas(Bitmap)>
        //   43   93:iload_2         
        //   44   94:invokevirtual   #76  <Method void Canvas.drawColor(int)>
        //   45   97:getstatic       #87  <Field SuperSurface StylingActivity.superSurface>
        //   46  100:aload           7
        //   47  102:new             #89  <Class StringBuilder>
        //   48  105:dup             
        //   49  106:ldc1            #91  <String "[color]/">
        //   50  108:invokespecial   #94  <Method void StringBuilder(String)>
        //   51  111:iload_2         
        //   52  112:invokevirtual   #98  <Method StringBuilder StringBuilder.append(int)>
        //   53  115:invokevirtual   #102 <Method String StringBuilder.toString()>
        //   54  118:invokevirtual   #108 <Method void SuperSurface.setBackground(Bitmap, String)>
        //   55  121:getstatic       #87  <Field SuperSurface StylingActivity.superSurface>
        //   56  124:invokevirtual   #111 <Method void SuperSurface.requestUpdate()>
        //   57  127:return          
        }

        final StylingImagesFragment this$0;
        private final View val$view;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingImagesFragment$8

/* anonymous class */
    class _cls8
        implements yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener
    {

        _cls8()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StylingImagesFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field View val$view>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onCancel(AmbilWarnaDialog ambilwarnadialog)
        {
        //    0    0:return          
        }

        public void onOk(AmbilWarnaDialog ambilwarnadialog, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field View val$view>
        //    2    4:ldc1            #29  <Int 0x7f060094>
        //    3    6:invokevirtual   #35  <Method View View.findViewById(int)>
        //    4    9:checkcast       #37  <Class ImageView>
        //    5   12:astore_3        
        //    6   13:new             #39  <Class StringBuilder>
        //    7   16:dup             
        //    8   17:ldc1            #41  <String "#">
        //    9   19:invokespecial   #44  <Method void StringBuilder(String)>
        //   10   22:iload_2         
        //   11   23:invokestatic    #50  <Method String Integer.toHexString(int)>
        //   12   26:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
        //   13   29:invokevirtual   #58  <Method String StringBuilder.toString()>
        //   14   32:invokestatic    #63  <Method void StylingActivity.applyTextColor(String)>
        //   15   35:getstatic       #67  <Field Context StylingActivity.c>
        //   16   38:ldc1            #69  <String "data/gv_icon_custom_color.png">
        //   17   40:invokestatic    #75  <Method Bitmap el7rUtilities.getBitmapFromAsset(Context, String)>
        //   18   43:astore          4
        //   19   45:bipush          100
        //   20   47:bipush          100
        //   21   49:getstatic       #81  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
        //   22   52:invokestatic    #87  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
        //   23   55:astore          5
        //   24   57:new             #89  <Class Canvas>
        //   25   60:dup             
        //   26   61:aload           5
        //   27   63:invokespecial   #92  <Method void Canvas(Bitmap)>
        //   28   66:astore          6
        //   29   68:aload           6
        //   30   70:iload_2         
        //   31   71:invokevirtual   #96  <Method void Canvas.drawColor(int)>
        //   32   74:aload           6
        //   33   76:aload           4
        //   34   78:fconst_0        
        //   35   79:fconst_0        
        //   36   80:aconst_null     
        //   37   81:invokevirtual   #100 <Method void Canvas.drawBitmap(Bitmap, float, float, android.graphics.Paint)>
        //   38   84:aload_3         
        //   39   85:aload           5
        //   40   87:invokevirtual   #103 <Method void ImageView.setImageBitmap(Bitmap)>
        //   41   90:return          
        }

        final StylingImagesFragment this$0;
        private final View val$view;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingImagesFragment$9

/* anonymous class */
    class _cls9
        implements yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener
    {

        _cls9()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StylingImagesFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field View val$view>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onCancel(AmbilWarnaDialog ambilwarnadialog)
        {
        //    0    0:return          
        }

        public void onOk(AmbilWarnaDialog ambilwarnadialog, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field View val$view>
        //    2    4:ldc1            #29  <Int 0x7f060094>
        //    3    6:invokevirtual   #35  <Method View View.findViewById(int)>
        //    4    9:checkcast       #37  <Class ImageView>
        //    5   12:astore_3        
        //    6   13:new             #39  <Class StringBuilder>
        //    7   16:dup             
        //    8   17:ldc1            #41  <String "#">
        //    9   19:invokespecial   #44  <Method void StringBuilder(String)>
        //   10   22:iload_2         
        //   11   23:invokestatic    #50  <Method String Integer.toHexString(int)>
        //   12   26:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
        //   13   29:invokevirtual   #58  <Method String StringBuilder.toString()>
        //   14   32:invokestatic    #63  <Method void StylingActivity.applyTextShadow(String)>
        //   15   35:getstatic       #67  <Field Context StylingActivity.c>
        //   16   38:ldc1            #69  <String "data/gv_icon_custom_color.png">
        //   17   40:invokestatic    #75  <Method Bitmap el7rUtilities.getBitmapFromAsset(Context, String)>
        //   18   43:astore          4
        //   19   45:bipush          100
        //   20   47:bipush          100
        //   21   49:getstatic       #81  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
        //   22   52:invokestatic    #87  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
        //   23   55:astore          5
        //   24   57:new             #89  <Class Canvas>
        //   25   60:dup             
        //   26   61:aload           5
        //   27   63:invokespecial   #92  <Method void Canvas(Bitmap)>
        //   28   66:astore          6
        //   29   68:aload           6
        //   30   70:iload_2         
        //   31   71:invokevirtual   #96  <Method void Canvas.drawColor(int)>
        //   32   74:aload           6
        //   33   76:aload           4
        //   34   78:fconst_0        
        //   35   79:fconst_0        
        //   36   80:aconst_null     
        //   37   81:invokevirtual   #100 <Method void Canvas.drawBitmap(Bitmap, float, float, android.graphics.Paint)>
        //   38   84:aload_3         
        //   39   85:aload           5
        //   40   87:invokevirtual   #103 <Method void ImageView.setImageBitmap(Bitmap)>
        //   41   90:return          
        }

        final StylingImagesFragment this$0;
        private final View val$view;
    }

}
