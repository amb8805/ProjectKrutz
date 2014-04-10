// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.adapters;

import android.content.Context;
import android.graphics.*;
import android.util.Log;
import android.view.*;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import codeadore.textgram.*;
import codeadore.textgram.custom_widgets.el7rTextView;
import codeadore.textgram.el7rUtilities;
import java.util.ArrayList;

public class StylingImagesAdapter extends BaseAdapter
{

    public StylingImagesAdapter(Context context1, ArrayList arraylist, String s)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #19  <Method void BaseAdapter()>
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:putfield        #21  <Field ArrayList theList>
    //    5    9:aload_0         
    //    6   10:ldc1            #23  <String "gallery">
    //    7   12:putfield        #25  <Field String type>
    //    8   15:aload_0         
    //    9   16:ldc1            #27  <String "StylingImagesAdapter">
    //   10   18:putfield        #29  <Field String TAG>
    //   11   21:aload_0         
    //   12   22:aload_2         
    //   13   23:putfield        #21  <Field ArrayList theList>
    //   14   26:aload_0         
    //   15   27:aload_3         
    //   16   28:putfield        #25  <Field String type>
    //   17   31:invokestatic    #34  <Method void System.gc()>
    //   18   34:aload_0         
    //   19   35:aload_1         
    //   20   36:putfield        #36  <Field Context context>
    //   21   39:return          
    }

    public int getCount()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #21  <Field ArrayList theList>
    //    2    4:ifnonnull       9
    //    3    7:iconst_0        
    //    4    8:ireturn         
    //    5    9:aload_0         
    //    6   10:getfield        #21  <Field ArrayList theList>
    //    7   13:invokevirtual   #43  <Method int ArrayList.size()>
    //    8   16:ireturn         
    }

    public Object getItem(int i)
    {
    //    0    0:iload_1         
    //    1    1:invokestatic    #51  <Method Integer Integer.valueOf(int)>
    //    2    4:areturn         
    }

    public long getItemId(int i)
    {
    //    0    0:iload_1         
    //    1    1:i2l             
    //    2    2:lreturn         
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #21  <Field ArrayList theList>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #63  <Method Object ArrayList.get(int)>
    //    4    8:checkcast       #65  <Class String>
    //    5   11:astore          4
    //    6   13:aload_2         
    //    7   14:ifnonnull       98
    //    8   17:aload_0         
    //    9   18:getfield        #25  <Field String type>
    //   10   21:ldc1            #23  <String "gallery">
    //   11   23:if_acmpne       83
    //   12   26:getstatic       #71  <Field LayoutInflater StylingActivity.layoutInflater>
    //   13   29:ldc1            #72  <Int 0x7f03002b>
    //   14   31:aload_3         
    //   15   32:iconst_0        
    //   16   33:invokevirtual   #78  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //   17   36:astore          5
    //   18   38:aload           5
    //   19   40:ldc1            #79  <Int 0x7f060094>
    //   20   42:invokevirtual   #85  <Method View View.findViewById(int)>
    //   21   45:checkcast       #87  <Class ImageView>
    //   22   48:astore          6
    //   23   50:aload           4
    //   24   52:ldc1            #89  <String "[custom]">
    //   25   54:invokevirtual   #93  <Method boolean String.equals(Object)>
    //   26   57:ifeq            104
    //   27   60:getstatic       #96  <Field Context StylingActivity.c>
    //   28   63:invokevirtual   #102 <Method android.content.res.Resources Context.getResources()>
    //   29   66:ldc1            #103 <Int 0x7f020091>
    //   30   68:invokestatic    #109 <Method Bitmap BitmapFactory.decodeResource(android.content.res.Resources, int)>
    //   31   71:astore          12
    //   32   73:aload           6
    //   33   75:aload           12
    //   34   77:invokevirtual   #113 <Method void ImageView.setImageBitmap(Bitmap)>
    //   35   80:aload           5
    //   36   82:areturn         
    //   37   83:getstatic       #71  <Field LayoutInflater StylingActivity.layoutInflater>
    //   38   86:ldc1            #114 <Int 0x7f03002c>
    //   39   88:aload_3         
    //   40   89:iconst_0        
    //   41   90:invokevirtual   #78  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //   42   93:astore          5
    //   43   95:goto            38
    //   44   98:aload_2         
    //   45   99:astore          5
    //   46  101:goto            38
    //   47  104:aload           4
    //   48  106:ldc1            #116 <String "[none]">
    //   49  108:invokevirtual   #93  <Method boolean String.equals(Object)>
    //   50  111:ifeq            130
    //   51  114:getstatic       #96  <Field Context StylingActivity.c>
    //   52  117:invokevirtual   #102 <Method android.content.res.Resources Context.getResources()>
    //   53  120:ldc1            #117 <Int 0x7f020092>
    //   54  122:invokestatic    #109 <Method Bitmap BitmapFactory.decodeResource(android.content.res.Resources, int)>
    //   55  125:astore          12
    //   56  127:goto            73
    //   57  130:aload           4
    //   58  132:ldc1            #119 <String "[get_more]">
    //   59  134:invokevirtual   #93  <Method boolean String.equals(Object)>
    //   60  137:ifeq            156
    //   61  140:getstatic       #96  <Field Context StylingActivity.c>
    //   62  143:invokevirtual   #102 <Method android.content.res.Resources Context.getResources()>
    //   63  146:ldc1            #120 <Int 0x7f020090>
    //   64  148:invokestatic    #109 <Method Bitmap BitmapFactory.decodeResource(android.content.res.Resources, int)>
    //   65  151:astore          12
    //   66  153:goto            73
    //   67  156:aload           4
    //   68  158:ldc1            #122 <String "[custom_color]">
    //   69  160:invokevirtual   #93  <Method boolean String.equals(Object)>
    //   70  163:ifeq            269
    //   71  166:getstatic       #96  <Field Context StylingActivity.c>
    //   72  169:ldc1            #124 <String "data/gv_icon_custom_color.png">
    //   73  171:invokestatic    #130 <Method Bitmap el7rUtilities.getBitmapFromAsset(Context, String)>
    //   74  174:astore          20
    //   75  176:bipush          100
    //   76  178:bipush          100
    //   77  180:getstatic       #136 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
    //   78  183:invokestatic    #142 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
    //   79  186:astore          12
    //   80  188:new             #144 <Class Canvas>
    //   81  191:dup             
    //   82  192:aload           12
    //   83  194:invokespecial   #146 <Method void Canvas(Bitmap)>
    //   84  197:astore          21
    //   85  199:aload_0         
    //   86  200:getfield        #21  <Field ArrayList theList>
    //   87  203:getstatic       #149 <Field ArrayList StylingActivity.colorsList>
    //   88  206:if_acmpne       239
    //   89  209:aload           21
    //   90  211:getstatic       #153 <Field SuperSurface StylingActivity.superSurface>
    //   91  214:invokevirtual   #159 <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //   92  217:getfield        #165 <Field el7rTextView SuperSurfaceItem.textViewDraw>
    //   93  220:invokevirtual   #170 <Method int el7rTextView.getCurrentTextColor()>
    //   94  223:invokevirtual   #174 <Method void Canvas.drawColor(int)>
    //   95  226:aload           21
    //   96  228:aload           20
    //   97  230:fconst_0        
    //   98  231:fconst_0        
    //   99  232:aconst_null     
    //  100  233:invokevirtual   #178 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
    //  101  236:goto            73
    //  102  239:aload_0         
    //  103  240:getfield        #21  <Field ArrayList theList>
    //  104  243:getstatic       #181 <Field ArrayList StylingActivity.shadowColorsList>
    //  105  246:if_acmpne       226
    //  106  249:aload           21
    //  107  251:getstatic       #153 <Field SuperSurface StylingActivity.superSurface>
    //  108  254:invokevirtual   #159 <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //  109  257:getfield        #165 <Field el7rTextView SuperSurfaceItem.textViewDraw>
    //  110  260:invokevirtual   #184 <Method int el7rTextView.getShadowColor()>
    //  111  263:invokevirtual   #174 <Method void Canvas.drawColor(int)>
    //  112  266:goto            226
    //  113  269:aload           4
    //  114  271:ldc1            #186 <String ".ttf">
    //  115  273:invokevirtual   #190 <Method boolean String.endsWith(String)>
    //  116  276:ifeq            423
    //  117  279:aload           4
    //  118  281:ldc1            #186 <String ".ttf">
    //  119  283:ldc1            #192 <String ".jpg">
    //  120  285:invokevirtual   #196 <Method String String.replace(CharSequence, CharSequence)>
    //  121  288:astore          7
    //  122  290:aload_0         
    //  123  291:getfield        #21  <Field ArrayList theList>
    //  124  294:getstatic       #149 <Field ArrayList StylingActivity.colorsList>
    //  125  297:if_acmpeq       310
    //  126  300:aload_0         
    //  127  301:getfield        #21  <Field ArrayList theList>
    //  128  304:getstatic       #181 <Field ArrayList StylingActivity.shadowColorsList>
    //  129  307:if_acmpne       602
    //  130  310:aload           4
    //  131  312:ldc1            #198 <String ":">
    //  132  314:invokevirtual   #202 <Method boolean String.contains(CharSequence)>
    //  133  317:ifeq            519
    // try 320 416 handler(s) 482
    //  134  320:aload           4
    //  135  322:ldc1            #198 <String ":">
    //  136  324:invokevirtual   #206 <Method String[] String.split(String)>
    //  137  327:astore          15
    //  138  329:new             #208 <Class RadialGradient>
    //  139  332:dup             
    //  140  333:ldc1            #209 <Float 50F>
    //  141  335:ldc1            #210 <Float 100F>
    //  142  337:ldc1            #210 <Float 100F>
    //  143  339:aload           15
    //  144  341:iconst_0        
    //  145  342:aaload          
    //  146  343:invokestatic    #216 <Method int Color.parseColor(String)>
    //  147  346:aload           15
    //  148  348:iconst_1        
    //  149  349:aaload          
    //  150  350:invokestatic    #216 <Method int Color.parseColor(String)>
    //  151  353:getstatic       #222 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
    //  152  356:invokespecial   #225 <Method void RadialGradient(float, float, float, int, int, android.graphics.Shader$TileMode)>
    //  153  359:astore          16
    //  154  361:new             #227 <Class Paint>
    //  155  364:dup             
    //  156  365:invokespecial   #228 <Method void Paint()>
    //  157  368:astore          17
    //  158  370:aload           17
    //  159  372:iconst_1        
    //  160  373:invokevirtual   #232 <Method void Paint.setDither(boolean)>
    //  161  376:aload           17
    //  162  378:aload           16
    //  163  380:invokevirtual   #236 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
    //  164  383:pop             
    //  165  384:bipush          100
    //  166  386:bipush          100
    //  167  388:getstatic       #239 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
    //  168  391:invokestatic    #142 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
    //  169  394:astore          19
    //  170  396:new             #144 <Class Canvas>
    //  171  399:dup             
    //  172  400:aload           19
    //  173  402:invokespecial   #146 <Method void Canvas(Bitmap)>
    //  174  405:fconst_0        
    //  175  406:fconst_0        
    //  176  407:ldc1            #210 <Float 100F>
    //  177  409:ldc1            #210 <Float 100F>
    //  178  411:aload           17
    //  179  413:invokevirtual   #243 <Method void Canvas.drawRect(float, float, float, float, Paint)>
    //  180  416:aload           19
    //  181  418:astore          12
    //  182  420:goto            73
    //  183  423:aload           4
    //  184  425:ldc1            #245 <String "templates/">
    //  185  427:invokevirtual   #202 <Method boolean String.contains(CharSequence)>
    //  186  430:ifeq            458
    //  187  433:new             #247 <Class StringBuilder>
    //  188  436:dup             
    //  189  437:aload           4
    //  190  439:invokestatic    #250 <Method String String.valueOf(Object)>
    //  191  442:invokespecial   #253 <Method void StringBuilder(String)>
    //  192  445:ldc1            #255 <String "/icon.jpg">
    //  193  447:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
    //  194  450:invokevirtual   #263 <Method String StringBuilder.toString()>
    //  195  453:astore          7
    //  196  455:goto            290
    //  197  458:aload           4
    //  198  460:ldc1            #192 <String ".jpg">
    //  199  462:ldc2            #265 <String ".thumb.jpg">
    //  200  465:invokevirtual   #196 <Method String String.replace(CharSequence, CharSequence)>
    //  201  468:ldc2            #267 <String ".png">
    //  202  471:ldc2            #265 <String ".thumb.jpg">
    //  203  474:invokevirtual   #196 <Method String String.replace(CharSequence, CharSequence)>
    //  204  477:astore          7
    //  205  479:goto            290
    // catch Exception
    //  206  482:astore          13
    //  207  484:aload_0         
    //  208  485:getfield        #29  <Field String TAG>
    //  209  488:new             #247 <Class StringBuilder>
    //  210  491:dup             
    //  211  492:ldc2            #269 <String "in getView - itemVal.contains(:): ">
    //  212  495:invokespecial   #253 <Method void StringBuilder(String)>
    //  213  498:aload           13
    //  214  500:invokevirtual   #270 <Method String Exception.toString()>
    //  215  503:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
    //  216  506:invokevirtual   #263 <Method String StringBuilder.toString()>
    //  217  509:invokestatic    #276 <Method int Log.e(String, String)>
    //  218  512:pop             
    //  219  513:aconst_null     
    //  220  514:astore          12
    //  221  516:goto            73
    //  222  519:iconst_1        
    //  223  520:iconst_1        
    //  224  521:getstatic       #136 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
    //  225  524:invokestatic    #142 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
    //  226  527:astore          8
    //  227  529:new             #144 <Class Canvas>
    //  228  532:dup             
    //  229  533:aload           8
    //  230  535:invokespecial   #146 <Method void Canvas(Bitmap)>
    //  231  538:astore          9
    // try 540 550 handler(s) 557
    //  232  540:aload           9
    //  233  542:aload           4
    //  234  544:invokestatic    #216 <Method int Color.parseColor(String)>
    //  235  547:invokevirtual   #174 <Method void Canvas.drawColor(int)>
    //  236  550:aload           8
    //  237  552:astore          12
    //  238  554:goto            73
    // catch Exception
    //  239  557:astore          10
    //  240  559:aload_0         
    //  241  560:getfield        #29  <Field String TAG>
    //  242  563:new             #247 <Class StringBuilder>
    //  243  566:dup             
    //  244  567:ldc2            #278 <String "in finalCanvas.drawColor: ">
    //  245  570:invokespecial   #253 <Method void StringBuilder(String)>
    //  246  573:aload           10
    //  247  575:invokevirtual   #270 <Method String Exception.toString()>
    //  248  578:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
    //  249  581:ldc2            #280 <String " :: ">
    //  250  584:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
    //  251  587:aload           4
    //  252  589:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
    //  253  592:invokevirtual   #263 <Method String StringBuilder.toString()>
    //  254  595:invokestatic    #276 <Method int Log.e(String, String)>
    //  255  598:pop             
    //  256  599:goto            550
    //  257  602:aload_0         
    //  258  603:getfield        #36  <Field Context context>
    //  259  606:aload           7
    //  260  608:invokestatic    #285 <Method Bitmap Utilities.getBitmapFromPath(Context, String)>
    //  261  611:astore          12
    //  262  613:aload           12
    //  263  615:ifnonnull       73
    //  264  618:aload_0         
    //  265  619:getfield        #36  <Field Context context>
    //  266  622:aload           4
    //  267  624:invokestatic    #285 <Method Bitmap Utilities.getBitmapFromPath(Context, String)>
    //  268  627:astore          12
    //  269  629:goto            73
    }

    String TAG;
    Context context;
    int mGalleryItemBackground;
    ArrayList theList;
    String type;
}
