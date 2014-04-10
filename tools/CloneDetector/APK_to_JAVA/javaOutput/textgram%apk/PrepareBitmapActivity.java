// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.*;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.*;
import android.widget.*;

// Referenced classes of package codeadore.textgram:
//            el7rActivity, Utilities, StylingActivity, Settings

public class PrepareBitmapActivity extends el7rActivity
    implements android.view.View.OnTouchListener
{
    public class OurView extends SurfaceView
        implements Runnable
    {

        public OurView(Context context)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field PrepareBitmapActivity this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:invokespecial   #15  <Method void SurfaceView(Context)>
        //    6   10:aload_1         
        //    7   11:aload_0         
        //    8   12:invokevirtual   #19  <Method SurfaceHolder getHolder()>
        //    9   15:putfield        #25  <Field SurfaceHolder PrepareBitmapActivity.holder>
        //   10   18:aload_0         
        //   11   19:invokevirtual   #29  <Method ViewTreeObserver getViewTreeObserver()>
        //   12   22:new             #31  <Class PrepareBitmapActivity$OurView$1>
        //   13   25:dup             
        //   14   26:aload_0         
        //   15   27:invokespecial   #34  <Method void PrepareBitmapActivity$OurView$1(PrepareBitmapActivity$OurView)>
        //   16   30:invokevirtual   #40  <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
        //   17   33:return          
        }

        static PrepareBitmapActivity access$0(OurView ourview)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field PrepareBitmapActivity this$0>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #12  <Field PrepareBitmapActivity this$0>
        //    5    4:areturn         
        }

        public void pause()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field PrepareBitmapActivity this$0>
        //    2    4:iconst_0        
        //    3    5:putfield        #50  <Field boolean PrepareBitmapActivity.isItOK>
        // try 8 18 handler(s) 27
        //    4    8:aload_0         
        //    5    9:getfield        #12  <Field PrepareBitmapActivity this$0>
        //    6   12:getfield        #54  <Field Thread PrepareBitmapActivity.t>
        //    7   15:invokevirtual   #59  <Method void Thread.join()>
        //    8   18:aload_0         
        //    9   19:getfield        #12  <Field PrepareBitmapActivity this$0>
        //   10   22:aconst_null     
        //   11   23:putfield        #54  <Field Thread PrepareBitmapActivity.t>
        //   12   26:return          
        // catch InterruptedException
        //   13   27:astore_1        
        //   14   28:aload_1         
        //   15   29:invokevirtual   #62  <Method void InterruptedException.printStackTrace()>
        //   16   32:goto            18
        }

        public void resume()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field PrepareBitmapActivity this$0>
        //    2    4:iconst_1        
        //    3    5:putfield        #50  <Field boolean PrepareBitmapActivity.isItOK>
        //    4    8:aload_0         
        //    5    9:getfield        #12  <Field PrepareBitmapActivity this$0>
        //    6   12:new             #56  <Class Thread>
        //    7   15:dup             
        //    8   16:aload_0         
        //    9   17:invokespecial   #66  <Method void Thread(Runnable)>
        //   10   20:putfield        #54  <Field Thread PrepareBitmapActivity.t>
        //   11   23:aload_0         
        //   12   24:getfield        #12  <Field PrepareBitmapActivity this$0>
        //   13   27:getfield        #54  <Field Thread PrepareBitmapActivity.t>
        //   14   30:invokevirtual   #69  <Method void Thread.start()>
        //   15   33:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field PrepareBitmapActivity this$0>
        //    2    4:getfield        #50  <Field boolean PrepareBitmapActivity.isItOK>
        //    3    7:ifne            11
        //    4   10:return          
        //    5   11:aload_0         
        //    6   12:getfield        #12  <Field PrepareBitmapActivity this$0>
        //    7   15:getfield        #25  <Field SurfaceHolder PrepareBitmapActivity.holder>
        //    8   18:invokeinterface #76  <Method Surface SurfaceHolder.getSurface()>
        //    9   23:invokevirtual   #82  <Method boolean Surface.isValid()>
        //   10   26:ifeq            0
        //   11   29:aload_0         
        //   12   30:getfield        #12  <Field PrepareBitmapActivity this$0>
        //   13   33:getfield        #85  <Field boolean PrepareBitmapActivity.update>
        //   14   36:ifeq            0
        //   15   39:aload_0         
        //   16   40:getfield        #12  <Field PrepareBitmapActivity this$0>
        //   17   43:getfield        #25  <Field SurfaceHolder PrepareBitmapActivity.holder>
        //   18   46:invokeinterface #89  <Method Canvas SurfaceHolder.lockCanvas()>
        //   19   51:astore_1        
        //   20   52:aload_1         
        //   21   53:sipush          226
        //   22   56:sipush          228
        //   23   59:sipush          229
        //   24   62:invokevirtual   #95  <Method void Canvas.drawRGB(int, int, int)>
        //   25   65:aload_0         
        //   26   66:getfield        #12  <Field PrepareBitmapActivity this$0>
        //   27   69:getfield        #99  <Field Bitmap PrepareBitmapActivity.tempBitmap>
        //   28   72:ifnull          589
        //   29   75:new             #101 <Class Matrix>
        //   30   78:dup             
        //   31   79:invokespecial   #103 <Method void Matrix()>
        //   32   82:astore_2        
        //   33   83:aload_0         
        //   34   84:getfield        #12  <Field PrepareBitmapActivity this$0>
        //   35   87:getfield        #107 <Field int PrepareBitmapActivity.canvasWidth>
        //   36   90:iconst_2        
        //   37   91:idiv            
        //   38   92:i2f             
        //   39   93:fstore_3        
        //   40   94:aload_0         
        //   41   95:getfield        #12  <Field PrepareBitmapActivity this$0>
        //   42   98:getfield        #110 <Field int PrepareBitmapActivity.canvasHeight>
        //   43  101:iconst_2        
        //   44  102:idiv            
        //   45  103:i2f             
        //   46  104:fstore          4
        //   47  106:aload_2         
        //   48  107:aload_0         
        //   49  108:getfield        #12  <Field PrepareBitmapActivity this$0>
        //   50  111:getfield        #99  <Field Bitmap PrepareBitmapActivity.tempBitmap>
        //   51  114:invokevirtual   #116 <Method int Bitmap.getWidth()>
        //   52  117:ineg            
        //   53  118:iconst_2        
        //   54  119:idiv            
        //   55  120:i2f             
        //   56  121:aload_0         
        //   57  122:getfield        #12  <Field PrepareBitmapActivity this$0>
        //   58  125:getfield        #99  <Field Bitmap PrepareBitmapActivity.tempBitmap>
        //   59  128:invokevirtual   #119 <Method int Bitmap.getHeight()>
        //   60  131:ineg            
        //   61  132:iconst_2        
        //   62  133:idiv            
        //   63  134:i2f             
        //   64  135:invokevirtual   #123 <Method boolean Matrix.postTranslate(float, float)>
        //   65  138:pop             
        //   66  139:aload_2         
        //   67  140:fload_3         
        //   68  141:fload           4
        //   69  143:invokevirtual   #123 <Method boolean Matrix.postTranslate(float, float)>
        //   70  146:pop             
        //   71  147:aload_1         
        //   72  148:aload_0         
        //   73  149:getfield        #12  <Field PrepareBitmapActivity this$0>
        //   74  152:getfield        #99  <Field Bitmap PrepareBitmapActivity.tempBitmap>
        //   75  155:aload_2         
        //   76  156:aconst_null     
        //   77  157:invokevirtual   #127 <Method void Canvas.drawBitmap(Bitmap, Matrix, Paint)>
        //   78  160:new             #129 <Class Paint>
        //   79  163:dup             
        //   80  164:invokespecial   #130 <Method void Paint()>
        //   81  167:astore          7
        //   82  169:aload           7
        //   83  171:iconst_1        
        //   84  172:invokevirtual   #134 <Method void Paint.setAntiAlias(boolean)>
        //   85  175:aload           7
        //   86  177:iconst_m1       
        //   87  178:invokevirtual   #138 <Method void Paint.setColor(int)>
        //   88  181:aload           7
        //   89  183:fconst_2        
        //   90  184:invokevirtual   #142 <Method void Paint.setStrokeWidth(float)>
        //   91  187:aload           7
        //   92  189:getstatic       #148 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
        //   93  192:invokevirtual   #152 <Method void Paint.setStyle(android.graphics.Paint$Style)>
        //   94  195:aload_1         
        //   95  196:new             #154 <Class RectF>
        //   96  199:dup             
        //   97  200:aload_0         
        //   98  201:getfield        #12  <Field PrepareBitmapActivity this$0>
        //   99  204:getfield        #157 <Field int PrepareBitmapActivity.rectSX>
        //  100  207:i2f             
        //  101  208:aload_0         
        //  102  209:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  103  212:getfield        #160 <Field int PrepareBitmapActivity.rectSY>
        //  104  215:i2f             
        //  105  216:aload_0         
        //  106  217:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  107  220:getfield        #163 <Field int PrepareBitmapActivity.rectEX>
        //  108  223:i2f             
        //  109  224:aload_0         
        //  110  225:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  111  228:getfield        #166 <Field int PrepareBitmapActivity.rectEY>
        //  112  231:i2f             
        //  113  232:invokespecial   #169 <Method void RectF(float, float, float, float)>
        //  114  235:aload           7
        //  115  237:invokevirtual   #173 <Method void Canvas.drawRect(RectF, Paint)>
        //  116  240:new             #129 <Class Paint>
        //  117  243:dup             
        //  118  244:invokespecial   #130 <Method void Paint()>
        //  119  247:astore          8
        //  120  249:aload           8
        //  121  251:iconst_1        
        //  122  252:invokevirtual   #134 <Method void Paint.setAntiAlias(boolean)>
        //  123  255:aload           8
        //  124  257:sipush          150
        //  125  260:invokevirtual   #176 <Method void Paint.setAlpha(int)>
        //  126  263:new             #154 <Class RectF>
        //  127  266:dup             
        //  128  267:fconst_0        
        //  129  268:fconst_0        
        //  130  269:aload_0         
        //  131  270:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  132  273:getfield        #157 <Field int PrepareBitmapActivity.rectSX>
        //  133  276:i2f             
        //  134  277:aload_0         
        //  135  278:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  136  281:getfield        #179 <Field int PrepareBitmapActivity.screenHeight>
        //  137  284:i2f             
        //  138  285:invokespecial   #169 <Method void RectF(float, float, float, float)>
        //  139  288:astore          9
        //  140  290:new             #154 <Class RectF>
        //  141  293:dup             
        //  142  294:aload_0         
        //  143  295:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  144  298:getfield        #163 <Field int PrepareBitmapActivity.rectEX>
        //  145  301:i2f             
        //  146  302:fconst_0        
        //  147  303:aload_0         
        //  148  304:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  149  307:getfield        #182 <Field int PrepareBitmapActivity.screenWidth>
        //  150  310:i2f             
        //  151  311:aload_0         
        //  152  312:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  153  315:getfield        #179 <Field int PrepareBitmapActivity.screenHeight>
        //  154  318:i2f             
        //  155  319:invokespecial   #169 <Method void RectF(float, float, float, float)>
        //  156  322:astore          10
        //  157  324:new             #154 <Class RectF>
        //  158  327:dup             
        //  159  328:aload_0         
        //  160  329:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  161  332:getfield        #157 <Field int PrepareBitmapActivity.rectSX>
        //  162  335:i2f             
        //  163  336:fconst_0        
        //  164  337:aload_0         
        //  165  338:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  166  341:getfield        #163 <Field int PrepareBitmapActivity.rectEX>
        //  167  344:i2f             
        //  168  345:aload_0         
        //  169  346:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  170  349:getfield        #160 <Field int PrepareBitmapActivity.rectSY>
        //  171  352:i2f             
        //  172  353:invokespecial   #169 <Method void RectF(float, float, float, float)>
        //  173  356:astore          11
        //  174  358:new             #154 <Class RectF>
        //  175  361:dup             
        //  176  362:aload_0         
        //  177  363:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  178  366:getfield        #157 <Field int PrepareBitmapActivity.rectSX>
        //  179  369:i2f             
        //  180  370:aload_0         
        //  181  371:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  182  374:getfield        #166 <Field int PrepareBitmapActivity.rectEY>
        //  183  377:i2f             
        //  184  378:aload_0         
        //  185  379:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  186  382:getfield        #163 <Field int PrepareBitmapActivity.rectEX>
        //  187  385:i2f             
        //  188  386:aload_0         
        //  189  387:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  190  390:getfield        #179 <Field int PrepareBitmapActivity.screenHeight>
        //  191  393:i2f             
        //  192  394:invokespecial   #169 <Method void RectF(float, float, float, float)>
        //  193  397:astore          12
        //  194  399:aload_1         
        //  195  400:aload           9
        //  196  402:aload           8
        //  197  404:invokevirtual   #173 <Method void Canvas.drawRect(RectF, Paint)>
        //  198  407:aload_1         
        //  199  408:aload           10
        //  200  410:aload           8
        //  201  412:invokevirtual   #173 <Method void Canvas.drawRect(RectF, Paint)>
        //  202  415:aload_1         
        //  203  416:aload           11
        //  204  418:aload           8
        //  205  420:invokevirtual   #173 <Method void Canvas.drawRect(RectF, Paint)>
        //  206  423:aload_1         
        //  207  424:aload           12
        //  208  426:aload           8
        //  209  428:invokevirtual   #173 <Method void Canvas.drawRect(RectF, Paint)>
        //  210  431:aload_0         
        //  211  432:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  212  435:getfield        #163 <Field int PrepareBitmapActivity.rectEX>
        //  213  438:aload_0         
        //  214  439:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  215  442:getfield        #185 <Field Bitmap PrepareBitmapActivity.resizePinActiveBitmap>
        //  216  445:invokevirtual   #116 <Method int Bitmap.getWidth()>
        //  217  448:iconst_2        
        //  218  449:idiv            
        //  219  450:isub            
        //  220  451:istore          13
        //  221  453:aload_0         
        //  222  454:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  223  457:getfield        #166 <Field int PrepareBitmapActivity.rectEY>
        //  224  460:aload_0         
        //  225  461:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  226  464:getfield        #185 <Field Bitmap PrepareBitmapActivity.resizePinActiveBitmap>
        //  227  467:invokevirtual   #119 <Method int Bitmap.getHeight()>
        //  228  470:iconst_2        
        //  229  471:idiv            
        //  230  472:isub            
        //  231  473:istore          14
        //  232  475:iload           13
        //  233  477:aload_0         
        //  234  478:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  235  481:getfield        #107 <Field int PrepareBitmapActivity.canvasWidth>
        //  236  484:aload_0         
        //  237  485:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  238  488:getfield        #185 <Field Bitmap PrepareBitmapActivity.resizePinActiveBitmap>
        //  239  491:invokevirtual   #116 <Method int Bitmap.getWidth()>
        //  240  494:isub            
        //  241  495:icmple          518
        //  242  498:aload_0         
        //  243  499:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  244  502:getfield        #107 <Field int PrepareBitmapActivity.canvasWidth>
        //  245  505:aload_0         
        //  246  506:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  247  509:getfield        #185 <Field Bitmap PrepareBitmapActivity.resizePinActiveBitmap>
        //  248  512:invokevirtual   #116 <Method int Bitmap.getWidth()>
        //  249  515:isub            
        //  250  516:istore          13
        //  251  518:iload           14
        //  252  520:aload_0         
        //  253  521:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  254  524:getfield        #110 <Field int PrepareBitmapActivity.canvasHeight>
        //  255  527:aload_0         
        //  256  528:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  257  531:getfield        #185 <Field Bitmap PrepareBitmapActivity.resizePinActiveBitmap>
        //  258  534:invokevirtual   #119 <Method int Bitmap.getHeight()>
        //  259  537:isub            
        //  260  538:icmple          561
        //  261  541:aload_0         
        //  262  542:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  263  545:getfield        #110 <Field int PrepareBitmapActivity.canvasHeight>
        //  264  548:aload_0         
        //  265  549:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  266  552:getfield        #185 <Field Bitmap PrepareBitmapActivity.resizePinActiveBitmap>
        //  267  555:invokevirtual   #119 <Method int Bitmap.getHeight()>
        //  268  558:isub            
        //  269  559:istore          14
        //  270  561:aload_0         
        //  271  562:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  272  565:getfield        #188 <Field boolean PrepareBitmapActivity.pinSelected>
        //  273  568:ifeq            613
        //  274  571:aload_1         
        //  275  572:aload_0         
        //  276  573:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  277  576:getfield        #185 <Field Bitmap PrepareBitmapActivity.resizePinActiveBitmap>
        //  278  579:iload           13
        //  279  581:i2f             
        //  280  582:iload           14
        //  281  584:i2f             
        //  282  585:aconst_null     
        //  283  586:invokevirtual   #191 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
        //  284  589:aload_0         
        //  285  590:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  286  593:getfield        #25  <Field SurfaceHolder PrepareBitmapActivity.holder>
        //  287  596:aload_1         
        //  288  597:invokeinterface #195 <Method void SurfaceHolder.unlockCanvasAndPost(Canvas)>
        //  289  602:aload_0         
        //  290  603:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  291  606:iconst_0        
        //  292  607:putfield        #85  <Field boolean PrepareBitmapActivity.update>
        //  293  610:goto            0
        //  294  613:aload_1         
        //  295  614:aload_0         
        //  296  615:getfield        #12  <Field PrepareBitmapActivity this$0>
        //  297  618:getfield        #198 <Field Bitmap PrepareBitmapActivity.resizePinBitmap>
        //  298  621:iload           13
        //  299  623:i2f             
        //  300  624:iload           14
        //  301  626:i2f             
        //  302  627:aconst_null     
        //  303  628:invokevirtual   #191 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
        //  304  631:goto            589
        }

        final PrepareBitmapActivity this$0;

        static PrepareBitmapActivity access$0(OurView ourview)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field PrepareBitmapActivity this$0>
        //    2    4:areturn         
        }
    }


    public PrepareBitmapActivity()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #47  <Method void el7rActivity()>
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:putfield        #49  <Field Thread t>
    //    5    9:aload_0         
    //    6   10:iconst_0        
    //    7   11:putfield        #51  <Field boolean isItOK>
    //    8   14:aload_0         
    //    9   15:aconst_null     
    //   10   16:putfield        #53  <Field Bitmap theBitmap>
    //   11   19:aload_0         
    //   12   20:aconst_null     
    //   13   21:putfield        #55  <Field Bitmap tempBitmap>
    //   14   24:aload_0         
    //   15   25:new             #57  <Class Handler>
    //   16   28:dup             
    //   17   29:invokespecial   #58  <Method void Handler()>
    //   18   32:putfield        #60  <Field Handler handler>
    //   19   35:aload_0         
    //   20   36:sipush          480
    //   21   39:putfield        #62  <Field int screenHeight>
    //   22   42:aload_0         
    //   23   43:sipush          320
    //   24   46:putfield        #64  <Field int screenWidth>
    //   25   49:aload_0         
    //   26   50:sipush          500
    //   27   53:putfield        #66  <Field int canvasWidth>
    //   28   56:aload_0         
    //   29   57:sipush          500
    //   30   60:putfield        #68  <Field int canvasHeight>
    //   31   63:aload_0         
    //   32   64:iconst_0        
    //   33   65:putfield        #70  <Field int rotation>
    //   34   68:aload_0         
    //   35   69:iconst_0        
    //   36   70:putfield        #72  <Field int rectSX>
    //   37   73:aload_0         
    //   38   74:iconst_0        
    //   39   75:putfield        #74  <Field int rectSY>
    //   40   78:aload_0         
    //   41   79:sipush          300
    //   42   82:putfield        #76  <Field int rectEX>
    //   43   85:aload_0         
    //   44   86:sipush          300
    //   45   89:putfield        #78  <Field int rectEY>
    //   46   92:aload_0         
    //   47   93:fconst_0        
    //   48   94:putfield        #80  <Field float lastTouchX>
    //   49   97:aload_0         
    //   50   98:fconst_0        
    //   51   99:putfield        #82  <Field float lastTouchY>
    //   52  102:aload_0         
    //   53  103:iconst_0        
    //   54  104:putfield        #84  <Field boolean rectSelected>
    //   55  107:aload_0         
    //   56  108:iconst_0        
    //   57  109:putfield        #86  <Field boolean pinSelected>
    //   58  112:aload_0         
    //   59  113:iconst_0        
    //   60  114:putfield        #88  <Field boolean update>
    //   61  117:aload_0         
    //   62  118:iconst_0        
    //   63  119:putfield        #90  <Field boolean pickerLoaded>
    //   64  122:return          
    }

    public void applyBitmap(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #98  <Method String String.toString()>
    //    3    5:putfield        #100 <Field String bitmapURI>
    //    4    8:aload_0         
    //    5    9:aload_1         
    //    6   10:invokestatic    #106 <Method Uri Uri.parse(String)>
    //    7   13:aload_0         
    //    8   14:invokestatic    #112 <Method Bitmap Utilities.getBitmapFromURI(Uri, Context)>
    //    9   17:putfield        #53  <Field Bitmap theBitmap>
    //   10   20:aload_0         
    //   11   21:getfield        #53  <Field Bitmap theBitmap>
    //   12   24:ifnonnull       41
    //   13   27:aload_0         
    //   14   28:getfield        #116 <Field el7rActivity thisActivity>
    //   15   31:ldc1            #118 <String "Picture not found">
    //   16   33:iconst_0        
    //   17   34:invokestatic    #124 <Method Toast Toast.makeText(Context, CharSequence, int)>
    //   18   37:invokevirtual   #127 <Method void Toast.show()>
    //   19   40:return          
    //   20   41:aload_0         
    //   21   42:getfield        #53  <Field Bitmap theBitmap>
    //   22   45:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //   23   48:aload_0         
    //   24   49:getfield        #53  <Field Bitmap theBitmap>
    //   25   52:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //   26   55:icmple          185
    //   27   58:aload_0         
    //   28   59:getfield        #66  <Field int canvasWidth>
    //   29   62:aload_0         
    //   30   63:getfield        #68  <Field int canvasHeight>
    //   31   66:icmple          159
    //   32   69:aload_0         
    //   33   70:getfield        #68  <Field int canvasHeight>
    //   34   73:istore_3        
    //   35   74:iload_3         
    //   36   75:aload_0         
    //   37   76:getfield        #53  <Field Bitmap theBitmap>
    //   38   79:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //   39   82:imul            
    //   40   83:aload_0         
    //   41   84:getfield        #53  <Field Bitmap theBitmap>
    //   42   87:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //   43   90:idiv            
    //   44   91:istore_2        
    //   45   92:aload_0         
    //   46   93:aload_0         
    //   47   94:getfield        #53  <Field Bitmap theBitmap>
    //   48   97:iload_2         
    //   49   98:iload_3         
    //   50   99:iconst_1        
    //   51  100:invokestatic    #140 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
    //   52  103:putfield        #55  <Field Bitmap tempBitmap>
    //   53  106:aload_0         
    //   54  107:aload_0         
    //   55  108:getfield        #66  <Field int canvasWidth>
    //   56  111:iconst_2        
    //   57  112:idiv            
    //   58  113:iload_2         
    //   59  114:iconst_2        
    //   60  115:idiv            
    //   61  116:isub            
    //   62  117:putfield        #72  <Field int rectSX>
    //   63  120:aload_0         
    //   64  121:iload_2         
    //   65  122:aload_0         
    //   66  123:getfield        #72  <Field int rectSX>
    //   67  126:iadd            
    //   68  127:putfield        #76  <Field int rectEX>
    //   69  130:aload_0         
    //   70  131:aload_0         
    //   71  132:getfield        #68  <Field int canvasHeight>
    //   72  135:iconst_2        
    //   73  136:idiv            
    //   74  137:iload_3         
    //   75  138:iconst_2        
    //   76  139:idiv            
    //   77  140:isub            
    //   78  141:putfield        #74  <Field int rectSY>
    //   79  144:aload_0         
    //   80  145:iload_3         
    //   81  146:aload_0         
    //   82  147:getfield        #74  <Field int rectSY>
    //   83  150:iadd            
    //   84  151:putfield        #78  <Field int rectEY>
    //   85  154:aload_0         
    //   86  155:invokevirtual   #143 <Method void requestUpdate()>
    //   87  158:return          
    //   88  159:aload_0         
    //   89  160:getfield        #66  <Field int canvasWidth>
    //   90  163:istore_2        
    //   91  164:iload_2         
    //   92  165:aload_0         
    //   93  166:getfield        #53  <Field Bitmap theBitmap>
    //   94  169:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //   95  172:imul            
    //   96  173:aload_0         
    //   97  174:getfield        #53  <Field Bitmap theBitmap>
    //   98  177:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //   99  180:idiv            
    //  100  181:istore_3        
    //  101  182:goto            92
    //  102  185:aload_0         
    //  103  186:getfield        #53  <Field Bitmap theBitmap>
    //  104  189:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //  105  192:aload_0         
    //  106  193:getfield        #53  <Field Bitmap theBitmap>
    //  107  196:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //  108  199:icmple          228
    //  109  202:aload_0         
    //  110  203:getfield        #68  <Field int canvasHeight>
    //  111  206:istore_3        
    //  112  207:iload_3         
    //  113  208:aload_0         
    //  114  209:getfield        #53  <Field Bitmap theBitmap>
    //  115  212:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //  116  215:imul            
    //  117  216:aload_0         
    //  118  217:getfield        #53  <Field Bitmap theBitmap>
    //  119  220:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //  120  223:idiv            
    //  121  224:istore_2        
    //  122  225:goto            92
    //  123  228:aload_0         
    //  124  229:getfield        #66  <Field int canvasWidth>
    //  125  232:aload_0         
    //  126  233:getfield        #68  <Field int canvasHeight>
    //  127  236:icmple          252
    //  128  239:aload_0         
    //  129  240:getfield        #68  <Field int canvasHeight>
    //  130  243:istore_2        
    //  131  244:aload_0         
    //  132  245:getfield        #68  <Field int canvasHeight>
    //  133  248:istore_3        
    //  134  249:goto            92
    //  135  252:aload_0         
    //  136  253:getfield        #66  <Field int canvasWidth>
    //  137  256:istore_2        
    //  138  257:aload_0         
    //  139  258:getfield        #66  <Field int canvasWidth>
    //  140  261:istore_3        
    //  141  262:goto            92
    }

    public void applyRotation(int i)
    {
    //    0    0:new             #147 <Class Matrix>
    //    1    3:dup             
    //    2    4:invokespecial   #148 <Method void Matrix()>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:ldc1            #149 <Float 90F>
    //    6   11:invokevirtual   #153 <Method boolean Matrix.postRotate(float)>
    //    7   14:pop             
    //    8   15:aload_0         
    //    9   16:aload_0         
    //   10   17:getfield        #53  <Field Bitmap theBitmap>
    //   11   20:iconst_0        
    //   12   21:iconst_0        
    //   13   22:aload_0         
    //   14   23:getfield        #53  <Field Bitmap theBitmap>
    //   15   26:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //   16   29:aload_0         
    //   17   30:getfield        #53  <Field Bitmap theBitmap>
    //   18   33:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //   19   36:aload_2         
    //   20   37:iconst_1        
    //   21   38:invokestatic    #157 <Method Bitmap Bitmap.createBitmap(Bitmap, int, int, int, int, Matrix, boolean)>
    //   22   41:putfield        #53  <Field Bitmap theBitmap>
    //   23   44:aload_0         
    //   24   45:getfield        #53  <Field Bitmap theBitmap>
    //   25   48:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //   26   51:aload_0         
    //   27   52:getfield        #53  <Field Bitmap theBitmap>
    //   28   55:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //   29   58:icmple          200
    //   30   61:aload_0         
    //   31   62:getfield        #66  <Field int canvasWidth>
    //   32   65:aload_0         
    //   33   66:getfield        #68  <Field int canvasHeight>
    //   34   69:icmple          171
    //   35   72:aload_0         
    //   36   73:getfield        #68  <Field int canvasHeight>
    //   37   76:istore          5
    //   38   78:iload           5
    //   39   80:aload_0         
    //   40   81:getfield        #53  <Field Bitmap theBitmap>
    //   41   84:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //   42   87:imul            
    //   43   88:aload_0         
    //   44   89:getfield        #53  <Field Bitmap theBitmap>
    //   45   92:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //   46   95:idiv            
    //   47   96:istore          4
    //   48   98:aload_0         
    //   49   99:aload_0         
    //   50  100:getfield        #53  <Field Bitmap theBitmap>
    //   51  103:iload           4
    //   52  105:iload           5
    //   53  107:iconst_1        
    //   54  108:invokestatic    #140 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
    //   55  111:putfield        #55  <Field Bitmap tempBitmap>
    //   56  114:aload_0         
    //   57  115:aload_0         
    //   58  116:getfield        #66  <Field int canvasWidth>
    //   59  119:iconst_2        
    //   60  120:idiv            
    //   61  121:iload           4
    //   62  123:iconst_2        
    //   63  124:idiv            
    //   64  125:isub            
    //   65  126:putfield        #72  <Field int rectSX>
    //   66  129:aload_0         
    //   67  130:iload           4
    //   68  132:aload_0         
    //   69  133:getfield        #72  <Field int rectSX>
    //   70  136:iadd            
    //   71  137:putfield        #76  <Field int rectEX>
    //   72  140:aload_0         
    //   73  141:aload_0         
    //   74  142:getfield        #68  <Field int canvasHeight>
    //   75  145:iconst_2        
    //   76  146:idiv            
    //   77  147:iload           5
    //   78  149:iconst_2        
    //   79  150:idiv            
    //   80  151:isub            
    //   81  152:putfield        #74  <Field int rectSY>
    //   82  155:aload_0         
    //   83  156:iload           5
    //   84  158:aload_0         
    //   85  159:getfield        #74  <Field int rectSY>
    //   86  162:iadd            
    //   87  163:putfield        #78  <Field int rectEY>
    //   88  166:aload_0         
    //   89  167:invokevirtual   #143 <Method void requestUpdate()>
    //   90  170:return          
    //   91  171:aload_0         
    //   92  172:getfield        #66  <Field int canvasWidth>
    //   93  175:istore          4
    //   94  177:iload           4
    //   95  179:aload_0         
    //   96  180:getfield        #53  <Field Bitmap theBitmap>
    //   97  183:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //   98  186:imul            
    //   99  187:aload_0         
    //  100  188:getfield        #53  <Field Bitmap theBitmap>
    //  101  191:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //  102  194:idiv            
    //  103  195:istore          5
    //  104  197:goto            98
    //  105  200:aload_0         
    //  106  201:getfield        #53  <Field Bitmap theBitmap>
    //  107  204:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //  108  207:aload_0         
    //  109  208:getfield        #53  <Field Bitmap theBitmap>
    //  110  211:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //  111  214:icmple          246
    //  112  217:aload_0         
    //  113  218:getfield        #68  <Field int canvasHeight>
    //  114  221:istore          5
    //  115  223:iload           5
    //  116  225:aload_0         
    //  117  226:getfield        #53  <Field Bitmap theBitmap>
    //  118  229:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //  119  232:imul            
    //  120  233:aload_0         
    //  121  234:getfield        #53  <Field Bitmap theBitmap>
    //  122  237:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //  123  240:idiv            
    //  124  241:istore          4
    //  125  243:goto            98
    //  126  246:aload_0         
    //  127  247:getfield        #66  <Field int canvasWidth>
    //  128  250:aload_0         
    //  129  251:getfield        #68  <Field int canvasHeight>
    //  130  254:icmple          272
    //  131  257:aload_0         
    //  132  258:getfield        #68  <Field int canvasHeight>
    //  133  261:istore          4
    //  134  263:aload_0         
    //  135  264:getfield        #68  <Field int canvasHeight>
    //  136  267:istore          5
    //  137  269:goto            98
    //  138  272:aload_0         
    //  139  273:getfield        #66  <Field int canvasWidth>
    //  140  276:istore          4
    //  141  278:aload_0         
    //  142  279:getfield        #66  <Field int canvasWidth>
    //  143  282:istore          5
    //  144  284:goto            98
    }

    public void done()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #66  <Field int canvasWidth>
    //    2    4:aload_0         
    //    3    5:getfield        #68  <Field int canvasHeight>
    //    4    8:getstatic       #166 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
    //    5   11:invokestatic    #169 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
    //    6   14:astore_1        
    //    7   15:new             #171 <Class Canvas>
    //    8   18:dup             
    //    9   19:aload_1         
    //   10   20:invokespecial   #174 <Method void Canvas(Bitmap)>
    //   11   23:astore_2        
    //   12   24:aload_2         
    //   13   25:new             #176 <Class PaintFlagsDrawFilter>
    //   14   28:dup             
    //   15   29:iconst_0        
    //   16   30:iconst_2        
    //   17   31:invokespecial   #179 <Method void PaintFlagsDrawFilter(int, int)>
    //   18   34:invokevirtual   #183 <Method void Canvas.setDrawFilter(android.graphics.DrawFilter)>
    //   19   37:aload_2         
    //   20   38:sipush          255
    //   21   41:sipush          255
    //   22   44:sipush          255
    //   23   47:invokevirtual   #187 <Method void Canvas.drawRGB(int, int, int)>
    //   24   50:new             #189 <Class Paint>
    //   25   53:dup             
    //   26   54:invokespecial   #190 <Method void Paint()>
    //   27   57:astore_3        
    //   28   58:aload_3         
    //   29   59:iconst_1        
    //   30   60:invokevirtual   #194 <Method void Paint.setFilterBitmap(boolean)>
    //   31   63:aload_3         
    //   32   64:iconst_1        
    //   33   65:invokevirtual   #197 <Method void Paint.setDither(boolean)>
    //   34   68:aload_0         
    //   35   69:getfield        #55  <Field Bitmap tempBitmap>
    //   36   72:ifnull          169
    //   37   75:new             #147 <Class Matrix>
    //   38   78:dup             
    //   39   79:invokespecial   #148 <Method void Matrix()>
    //   40   82:astore          4
    //   41   84:aload_0         
    //   42   85:getfield        #66  <Field int canvasWidth>
    //   43   88:iconst_2        
    //   44   89:idiv            
    //   45   90:i2f             
    //   46   91:fstore          5
    //   47   93:aload_0         
    //   48   94:getfield        #68  <Field int canvasHeight>
    //   49   97:iconst_2        
    //   50   98:idiv            
    //   51   99:i2f             
    //   52  100:fstore          6
    //   53  102:aload           4
    //   54  104:aload_0         
    //   55  105:getfield        #55  <Field Bitmap tempBitmap>
    //   56  108:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //   57  111:ineg            
    //   58  112:iconst_2        
    //   59  113:idiv            
    //   60  114:i2f             
    //   61  115:aload_0         
    //   62  116:getfield        #55  <Field Bitmap tempBitmap>
    //   63  119:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //   64  122:ineg            
    //   65  123:iconst_2        
    //   66  124:idiv            
    //   67  125:i2f             
    //   68  126:invokevirtual   #201 <Method boolean Matrix.postTranslate(float, float)>
    //   69  129:pop             
    //   70  130:aload_0         
    //   71  131:getfield        #70  <Field int rotation>
    //   72  134:ifeq            289
    //   73  137:aload           4
    //   74  139:aload_0         
    //   75  140:getfield        #70  <Field int rotation>
    //   76  143:i2f             
    //   77  144:invokevirtual   #153 <Method boolean Matrix.postRotate(float)>
    //   78  147:pop             
    //   79  148:aload           4
    //   80  150:fload           5
    //   81  152:fload           6
    //   82  154:invokevirtual   #201 <Method boolean Matrix.postTranslate(float, float)>
    //   83  157:pop             
    //   84  158:aload_2         
    //   85  159:aload_0         
    //   86  160:getfield        #55  <Field Bitmap tempBitmap>
    //   87  163:aload           4
    //   88  165:aconst_null     
    //   89  166:invokevirtual   #205 <Method void Canvas.drawBitmap(Bitmap, Matrix, Paint)>
    //   90  169:aload_0         
    //   91  170:getfield        #72  <Field int rectSX>
    //   92  173:istore          10
    //   93  175:aload_0         
    //   94  176:getfield        #74  <Field int rectSY>
    //   95  179:istore          11
    //   96  181:iload           10
    //   97  183:ifge            189
    //   98  186:iconst_0        
    //   99  187:istore          10
    //  100  189:iload           11
    //  101  191:ifge            197
    //  102  194:iconst_0        
    //  103  195:istore          11
    //  104  197:aload_0         
    //  105  198:getfield        #76  <Field int rectEX>
    //  106  201:aload_0         
    //  107  202:getfield        #72  <Field int rectSX>
    //  108  205:isub            
    //  109  206:istore          12
    //  110  208:aload_0         
    //  111  209:getfield        #78  <Field int rectEY>
    //  112  212:aload_0         
    //  113  213:getfield        #74  <Field int rectSY>
    //  114  216:isub            
    //  115  217:istore          13
    //  116  219:iload           12
    //  117  221:aload_1         
    //  118  222:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //  119  225:icmple          234
    //  120  228:aload_1         
    //  121  229:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //  122  232:istore          12
    //  123  234:iload           13
    //  124  236:aload_1         
    //  125  237:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //  126  240:icmple          249
    //  127  243:aload_1         
    //  128  244:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //  129  247:istore          13
    // try 249 263 handler(s) 299
    //  130  249:aload_1         
    //  131  250:iload           10
    //  132  252:iload           11
    //  133  254:iload           12
    //  134  256:iload           13
    //  135  258:invokestatic    #208 <Method Bitmap Bitmap.createBitmap(Bitmap, int, int, int, int)>
    //  136  261:astore          17
    //  137  263:aload           17
    //  138  265:astore          15
    //  139  267:ldc1            #210 <Class StylingActivity>
    //  140  269:ifnull          288
    // try 272 288 handler(s) 329
    //  141  272:aload           15
    //  142  274:putstatic       #215 <Field Bitmap Settings.prepareReturnBitmap>
    //  143  277:aload_0         
    //  144  278:getfield        #217 <Field int id>
    //  145  281:putstatic       #220 <Field int Settings.prepareReturnID>
    //  146  284:aload_0         
    //  147  285:invokevirtual   #223 <Method void finish()>
    //  148  288:return          
    //  149  289:aload           4
    //  150  291:fconst_0        
    //  151  292:invokevirtual   #153 <Method boolean Matrix.postRotate(float)>
    //  152  295:pop             
    //  153  296:goto            148
    // catch Exception
    //  154  299:astore          14
    //  155  301:aload           14
    //  156  303:invokevirtual   #226 <Method void Exception.printStackTrace()>
    //  157  306:aload_1         
    //  158  307:iload           10
    //  159  309:iload           11
    //  160  311:iload           10
    //  161  313:bipush          100
    //  162  315:iadd            
    //  163  316:iload           11
    //  164  318:bipush          100
    //  165  320:iadd            
    //  166  321:invokestatic    #208 <Method Bitmap Bitmap.createBitmap(Bitmap, int, int, int, int)>
    //  167  324:astore          15
    //  168  326:goto            267
    // catch Exception
    //  169  329:astore          16
    //  170  331:aload           16
    //  171  333:invokevirtual   #226 <Method void Exception.printStackTrace()>
    //  172  336:return          
    }

    public float fixToSize(float f)
    {
    //    0    0:fload_1         
    //    1    1:freturn         
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:aload_3         
    //    4    4:invokespecial   #232 <Method void el7rActivity.onActivityResult(int, int, Intent)>
    //    5    7:iload_2         
    //    6    8:iconst_m1       
    //    7    9:icmpne          24
    //    8   12:aload_0         
    //    9   13:aload_3         
    //   10   14:invokevirtual   #238 <Method Uri Intent.getData()>
    //   11   17:invokevirtual   #239 <Method String Uri.toString()>
    //   12   20:invokevirtual   #241 <Method void applyBitmap(String)>
    //   13   23:return          
    //   14   24:aload_0         
    //   15   25:invokevirtual   #223 <Method void finish()>
    //   16   28:return          
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #245 <Method void el7rActivity.onConfigurationChanged(Configuration)>
    //    3    5:aload_0         
    //    4    6:getfield        #60  <Field Handler handler>
    //    5    9:new             #247 <Class PrepareBitmapActivity$5>
    //    6   12:dup             
    //    7   13:aload_0         
    //    8   14:invokespecial   #250 <Method void PrepareBitmapActivity$5(PrepareBitmapActivity)>
    //    9   17:ldc2w           #251 <Long 500L>
    //   10   20:invokevirtual   #256 <Method boolean Handler.postDelayed(Runnable, long)>
    //   11   23:pop             
    //   12   24:return          
    }

    protected void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #260 <Method void el7rActivity.onCreate(Bundle)>
    //    3    5:aload_0         
    //    4    6:ldc2            #261 <Int 0x7f03001e>
    //    5    9:invokevirtual   #264 <Method void setContentView(int)>
    //    6   12:aload_0         
    //    7   13:ldc2            #265 <Int 0x7f06005f>
    //    8   16:invokevirtual   #269 <Method View findViewById(int)>
    //    9   19:checkcast       #271 <Class LinearLayout>
    //   10   22:astore_2        
    //   11   23:aload_0         
    //   12   24:aload_0         
    //   13   25:ldc2            #273 <String "[assets]/data/resize_pin.png">
    //   14   28:invokestatic    #277 <Method Bitmap Utilities.getBitmapFromPath(Context, String)>
    //   15   31:putfield        #279 <Field Bitmap preResizePinBitmap>
    //   16   34:aload_0         
    //   17   35:aload_0         
    //   18   36:getfield        #279 <Field Bitmap preResizePinBitmap>
    //   19   39:aload_0         
    //   20   40:ldc2            #280 <Float 100F>
    //   21   43:invokevirtual   #282 <Method float fixToSize(float)>
    //   22   46:f2i             
    //   23   47:aload_0         
    //   24   48:ldc2            #280 <Float 100F>
    //   25   51:invokevirtual   #282 <Method float fixToSize(float)>
    //   26   54:f2i             
    //   27   55:iconst_1        
    //   28   56:invokestatic    #140 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
    //   29   59:putfield        #284 <Field Bitmap resizePinBitmap>
    //   30   62:aload_0         
    //   31   63:aload_0         
    //   32   64:ldc2            #286 <String "[assets]/data/resize_pin_active.png">
    //   33   67:invokestatic    #277 <Method Bitmap Utilities.getBitmapFromPath(Context, String)>
    //   34   70:putfield        #288 <Field Bitmap preResizePinActiveBitmap>
    //   35   73:aload_0         
    //   36   74:aload_0         
    //   37   75:getfield        #288 <Field Bitmap preResizePinActiveBitmap>
    //   38   78:aload_0         
    //   39   79:ldc2            #280 <Float 100F>
    //   40   82:invokevirtual   #282 <Method float fixToSize(float)>
    //   41   85:f2i             
    //   42   86:aload_0         
    //   43   87:ldc2            #280 <Float 100F>
    //   44   90:invokevirtual   #282 <Method float fixToSize(float)>
    //   45   93:f2i             
    //   46   94:iconst_1        
    //   47   95:invokestatic    #140 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
    //   48   98:putfield        #290 <Field Bitmap resizePinActiveBitmap>
    //   49  101:aload_0         
    //   50  102:new             #292 <Class PrepareBitmapActivity$OurView>
    //   51  105:dup             
    //   52  106:aload_0         
    //   53  107:aload_0         
    //   54  108:invokespecial   #295 <Method void PrepareBitmapActivity$OurView(PrepareBitmapActivity, Context)>
    //   55  111:putfield        #297 <Field PrepareBitmapActivity$OurView v>
    //   56  114:aload_0         
    //   57  115:getfield        #297 <Field PrepareBitmapActivity$OurView v>
    //   58  118:aload_0         
    //   59  119:invokevirtual   #301 <Method void PrepareBitmapActivity$OurView.setOnTouchListener(android.view.View$OnTouchListener)>
    //   60  122:aload_0         
    //   61  123:getfield        #297 <Field PrepareBitmapActivity$OurView v>
    //   62  126:new             #303 <Class android.view.ViewGroup$LayoutParams>
    //   63  129:dup             
    //   64  130:iconst_m1       
    //   65  131:iconst_m1       
    //   66  132:invokespecial   #304 <Method void android.view.ViewGroup$LayoutParams(int, int)>
    //   67  135:invokevirtual   #308 <Method void PrepareBitmapActivity$OurView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
    //   68  138:aload_2         
    //   69  139:aload_0         
    //   70  140:getfield        #297 <Field PrepareBitmapActivity$OurView v>
    //   71  143:invokevirtual   #312 <Method void LinearLayout.addView(View)>
    //   72  146:aload_0         
    //   73  147:aload_0         
    //   74  148:invokevirtual   #316 <Method Intent getIntent()>
    //   75  151:invokevirtual   #320 <Method Bundle Intent.getExtras()>
    //   76  154:ldc2            #321 <String "id">
    //   77  157:invokevirtual   #327 <Method int Bundle.getInt(String)>
    //   78  160:putfield        #217 <Field int id>
    //   79  163:aload_0         
    //   80  164:ldc2            #328 <Int 0x7f060061>
    //   81  167:invokevirtual   #269 <Method View findViewById(int)>
    //   82  170:checkcast       #330 <Class ImageButton>
    //   83  173:astore_3        
    //   84  174:aload_0         
    //   85  175:ldc2            #331 <Int 0x7f060060>
    //   86  178:invokevirtual   #269 <Method View findViewById(int)>
    //   87  181:checkcast       #330 <Class ImageButton>
    //   88  184:astore          4
    //   89  186:aload_3         
    //   90  187:new             #333 <Class PrepareBitmapActivity$1>
    //   91  190:dup             
    //   92  191:aload_0         
    //   93  192:invokespecial   #334 <Method void PrepareBitmapActivity$1(PrepareBitmapActivity)>
    //   94  195:invokevirtual   #338 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //   95  198:aload           4
    //   96  200:new             #340 <Class PrepareBitmapActivity$2>
    //   97  203:dup             
    //   98  204:aload_0         
    //   99  205:invokespecial   #341 <Method void PrepareBitmapActivity$2(PrepareBitmapActivity)>
    //  100  208:invokevirtual   #338 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //  101  211:aload_0         
    //  102  212:ldc2            #342 <Int 0x7f060062>
    //  103  215:invokevirtual   #269 <Method View findViewById(int)>
    //  104  218:checkcast       #344 <Class Button>
    //  105  221:new             #346 <Class PrepareBitmapActivity$3>
    //  106  224:dup             
    //  107  225:aload_0         
    //  108  226:invokespecial   #347 <Method void PrepareBitmapActivity$3(PrepareBitmapActivity)>
    //  109  229:invokevirtual   #348 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //  110  232:aload_1         
    //  111  233:ifnull          267
    //  112  236:aload_0         
    //  113  237:aload_1         
    //  114  238:ldc2            #321 <String "id">
    //  115  241:invokevirtual   #327 <Method int Bundle.getInt(String)>
    //  116  244:putfield        #217 <Field int id>
    //  117  247:aload_0         
    //  118  248:getfield        #60  <Field Handler handler>
    //  119  251:new             #350 <Class PrepareBitmapActivity$4>
    //  120  254:dup             
    //  121  255:aload_0         
    //  122  256:aload_1         
    //  123  257:invokespecial   #353 <Method void PrepareBitmapActivity$4(PrepareBitmapActivity, Bundle)>
    //  124  260:ldc2w           #251 <Long 500L>
    //  125  263:invokevirtual   #256 <Method boolean Handler.postDelayed(Runnable, long)>
    //  126  266:pop             
    //  127  267:return          
    }

    protected void onPause()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #356 <Method void el7rActivity.onPause()>
    //    2    4:aload_0         
    //    3    5:getfield        #297 <Field PrepareBitmapActivity$OurView v>
    //    4    8:invokevirtual   #359 <Method void PrepareBitmapActivity$OurView.pause()>
    //    5   11:return          
    }

    protected void onResume()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #362 <Method void el7rActivity.onResume()>
    //    2    4:aload_0         
    //    3    5:getfield        #297 <Field PrepareBitmapActivity$OurView v>
    //    4    8:invokevirtual   #365 <Method void PrepareBitmapActivity$OurView.resume()>
    //    5   11:aload_0         
    //    6   12:invokevirtual   #143 <Method void requestUpdate()>
    //    7   15:return          
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #368 <Method void el7rActivity.onSaveInstanceState(Bundle)>
    //    3    5:aload_1         
    //    4    6:ldc2            #369 <String "bitmapURI">
    //    5    9:aload_0         
    //    6   10:getfield        #100 <Field String bitmapURI>
    //    7   13:invokevirtual   #373 <Method void Bundle.putString(String, String)>
    //    8   16:aload_1         
    //    9   17:ldc2            #321 <String "id">
    //   10   20:aload_0         
    //   11   21:getfield        #217 <Field int id>
    //   12   24:invokevirtual   #377 <Method void Bundle.putInt(String, int)>
    //   13   27:return          
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #66  <Field int canvasWidth>
    //    2    4:iconst_2        
    //    3    5:idiv            
    //    4    6:aload_0         
    //    5    7:getfield        #55  <Field Bitmap tempBitmap>
    //    6   10:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //    7   13:iconst_2        
    //    8   14:idiv            
    //    9   15:isub            
    //   10   16:istore_3        
    //   11   17:aload_0         
    //   12   18:getfield        #66  <Field int canvasWidth>
    //   13   21:iconst_2        
    //   14   22:idiv            
    //   15   23:aload_0         
    //   16   24:getfield        #55  <Field Bitmap tempBitmap>
    //   17   27:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //   18   30:iconst_2        
    //   19   31:idiv            
    //   20   32:iadd            
    //   21   33:istore          4
    //   22   35:aload_0         
    //   23   36:getfield        #68  <Field int canvasHeight>
    //   24   39:iconst_2        
    //   25   40:idiv            
    //   26   41:aload_0         
    //   27   42:getfield        #55  <Field Bitmap tempBitmap>
    //   28   45:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //   29   48:iconst_2        
    //   30   49:idiv            
    //   31   50:isub            
    //   32   51:istore          5
    //   33   53:aload_0         
    //   34   54:getfield        #68  <Field int canvasHeight>
    //   35   57:iconst_2        
    //   36   58:idiv            
    //   37   59:aload_0         
    //   38   60:getfield        #55  <Field Bitmap tempBitmap>
    //   39   63:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //   40   66:iconst_2        
    //   41   67:idiv            
    //   42   68:iadd            
    //   43   69:istore          6
    //   44   71:aload_0         
    //   45   72:getfield        #76  <Field int rectEX>
    //   46   75:aload_0         
    //   47   76:getfield        #290 <Field Bitmap resizePinActiveBitmap>
    //   48   79:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //   49   82:iconst_2        
    //   50   83:idiv            
    //   51   84:isub            
    //   52   85:istore          7
    //   53   87:aload_0         
    //   54   88:getfield        #78  <Field int rectEY>
    //   55   91:aload_0         
    //   56   92:getfield        #290 <Field Bitmap resizePinActiveBitmap>
    //   57   95:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //   58   98:iconst_2        
    //   59   99:idiv            
    //   60  100:isub            
    //   61  101:istore          8
    //   62  103:iload           7
    //   63  105:aload_0         
    //   64  106:getfield        #66  <Field int canvasWidth>
    //   65  109:aload_0         
    //   66  110:getfield        #290 <Field Bitmap resizePinActiveBitmap>
    //   67  113:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //   68  116:isub            
    //   69  117:icmple          134
    //   70  120:aload_0         
    //   71  121:getfield        #66  <Field int canvasWidth>
    //   72  124:aload_0         
    //   73  125:getfield        #290 <Field Bitmap resizePinActiveBitmap>
    //   74  128:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //   75  131:isub            
    //   76  132:istore          7
    //   77  134:iload           8
    //   78  136:aload_0         
    //   79  137:getfield        #68  <Field int canvasHeight>
    //   80  140:aload_0         
    //   81  141:getfield        #290 <Field Bitmap resizePinActiveBitmap>
    //   82  144:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //   83  147:isub            
    //   84  148:icmple          165
    //   85  151:aload_0         
    //   86  152:getfield        #68  <Field int canvasHeight>
    //   87  155:aload_0         
    //   88  156:getfield        #290 <Field Bitmap resizePinActiveBitmap>
    //   89  159:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //   90  162:isub            
    //   91  163:istore          8
    //   92  165:aload_2         
    //   93  166:invokevirtual   #384 <Method int MotionEvent.getAction()>
    //   94  169:tableswitch     0 2: default 196
    //                   0 198
    //                   1 771
    //                   2 399
    //   95  196:iconst_1        
    //   96  197:ireturn         
    //   97  198:aload_2         
    //   98  199:invokevirtual   #388 <Method float MotionEvent.getX()>
    //   99  202:aload_0         
    //  100  203:getfield        #72  <Field int rectSX>
    //  101  206:i2f             
    //  102  207:fcmpl           
    //  103  208:ifle            255
    //  104  211:aload_2         
    //  105  212:invokevirtual   #388 <Method float MotionEvent.getX()>
    //  106  215:aload_0         
    //  107  216:getfield        #76  <Field int rectEX>
    //  108  219:i2f             
    //  109  220:fcmpg           
    //  110  221:ifge            255
    //  111  224:aload_2         
    //  112  225:invokevirtual   #391 <Method float MotionEvent.getY()>
    //  113  228:aload_0         
    //  114  229:getfield        #74  <Field int rectSY>
    //  115  232:i2f             
    //  116  233:fcmpl           
    //  117  234:ifle            255
    //  118  237:aload_2         
    //  119  238:invokevirtual   #391 <Method float MotionEvent.getY()>
    //  120  241:aload_0         
    //  121  242:getfield        #78  <Field int rectEY>
    //  122  245:i2f             
    //  123  246:fcmpg           
    //  124  247:ifge            255
    //  125  250:aload_0         
    //  126  251:iconst_1        
    //  127  252:putfield        #84  <Field boolean rectSelected>
    //  128  255:aload_2         
    //  129  256:invokevirtual   #388 <Method float MotionEvent.getX()>
    //  130  259:iload           7
    //  131  261:aload_0         
    //  132  262:getfield        #290 <Field Bitmap resizePinActiveBitmap>
    //  133  265:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //  134  268:iadd            
    //  135  269:i2f             
    //  136  270:aload_0         
    //  137  271:ldc2            #280 <Float 100F>
    //  138  274:invokevirtual   #282 <Method float fixToSize(float)>
    //  139  277:fconst_2        
    //  140  278:fdiv            
    //  141  279:fsub            
    //  142  280:fcmpl           
    //  143  281:ifle            380
    //  144  284:aload_2         
    //  145  285:invokevirtual   #388 <Method float MotionEvent.getX()>
    //  146  288:iload           7
    //  147  290:aload_0         
    //  148  291:getfield        #290 <Field Bitmap resizePinActiveBitmap>
    //  149  294:invokevirtual   #133 <Method int Bitmap.getWidth()>
    //  150  297:iadd            
    //  151  298:i2f             
    //  152  299:aload_0         
    //  153  300:ldc2            #280 <Float 100F>
    //  154  303:invokevirtual   #282 <Method float fixToSize(float)>
    //  155  306:fconst_2        
    //  156  307:fdiv            
    //  157  308:fadd            
    //  158  309:fcmpg           
    //  159  310:ifge            380
    //  160  313:aload_2         
    //  161  314:invokevirtual   #391 <Method float MotionEvent.getY()>
    //  162  317:iload           8
    //  163  319:aload_0         
    //  164  320:getfield        #290 <Field Bitmap resizePinActiveBitmap>
    //  165  323:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //  166  326:iadd            
    //  167  327:i2f             
    //  168  328:aload_0         
    //  169  329:ldc2            #280 <Float 100F>
    //  170  332:invokevirtual   #282 <Method float fixToSize(float)>
    //  171  335:fconst_2        
    //  172  336:fdiv            
    //  173  337:fsub            
    //  174  338:fcmpl           
    //  175  339:ifle            380
    //  176  342:aload_2         
    //  177  343:invokevirtual   #391 <Method float MotionEvent.getY()>
    //  178  346:iload           8
    //  179  348:aload_0         
    //  180  349:getfield        #290 <Field Bitmap resizePinActiveBitmap>
    //  181  352:invokevirtual   #136 <Method int Bitmap.getHeight()>
    //  182  355:iadd            
    //  183  356:i2f             
    //  184  357:aload_0         
    //  185  358:ldc2            #280 <Float 100F>
    //  186  361:invokevirtual   #282 <Method float fixToSize(float)>
    //  187  364:fconst_2        
    //  188  365:fdiv            
    //  189  366:fadd            
    //  190  367:fcmpg           
    //  191  368:ifge            380
    //  192  371:aload_0         
    //  193  372:iconst_1        
    //  194  373:putfield        #86  <Field boolean pinSelected>
    //  195  376:aload_0         
    //  196  377:invokevirtual   #143 <Method void requestUpdate()>
    //  197  380:aload_0         
    //  198  381:aload_2         
    //  199  382:invokevirtual   #391 <Method float MotionEvent.getY()>
    //  200  385:putfield        #82  <Field float lastTouchY>
    //  201  388:aload_0         
    //  202  389:aload_2         
    //  203  390:invokevirtual   #388 <Method float MotionEvent.getX()>
    //  204  393:putfield        #80  <Field float lastTouchX>
    //  205  396:goto            196
    //  206  399:aload_0         
    //  207  400:getfield        #84  <Field boolean rectSelected>
    //  208  403:ifeq            593
    //  209  406:aload_0         
    //  210  407:getfield        #72  <Field int rectSX>
    //  211  410:i2f             
    //  212  411:aload_0         
    //  213  412:getfield        #80  <Field float lastTouchX>
    //  214  415:aload_2         
    //  215  416:invokevirtual   #388 <Method float MotionEvent.getX()>
    //  216  419:fsub            
    //  217  420:fsub            
    //  218  421:iload_3         
    //  219  422:i2f             
    //  220  423:fcmpl           
    //  221  424:ifle            489
    //  222  427:aload_0         
    //  223  428:getfield        #76  <Field int rectEX>
    //  224  431:i2f             
    //  225  432:aload_0         
    //  226  433:getfield        #80  <Field float lastTouchX>
    //  227  436:aload_2         
    //  228  437:invokevirtual   #388 <Method float MotionEvent.getX()>
    //  229  440:fsub            
    //  230  441:fsub            
    //  231  442:iload           4
    //  232  444:i2f             
    //  233  445:fcmpg           
    //  234  446:ifgt            489
    //  235  449:aload_0         
    //  236  450:aload_0         
    //  237  451:getfield        #72  <Field int rectSX>
    //  238  454:i2f             
    //  239  455:aload_0         
    //  240  456:getfield        #80  <Field float lastTouchX>
    //  241  459:aload_2         
    //  242  460:invokevirtual   #388 <Method float MotionEvent.getX()>
    //  243  463:fsub            
    //  244  464:fsub            
    //  245  465:f2i             
    //  246  466:putfield        #72  <Field int rectSX>
    //  247  469:aload_0         
    //  248  470:aload_0         
    //  249  471:getfield        #76  <Field int rectEX>
    //  250  474:i2f             
    //  251  475:aload_0         
    //  252  476:getfield        #80  <Field float lastTouchX>
    //  253  479:aload_2         
    //  254  480:invokevirtual   #388 <Method float MotionEvent.getX()>
    //  255  483:fsub            
    //  256  484:fsub            
    //  257  485:f2i             
    //  258  486:putfield        #76  <Field int rectEX>
    //  259  489:aload_0         
    //  260  490:getfield        #74  <Field int rectSY>
    //  261  493:i2f             
    //  262  494:aload_0         
    //  263  495:getfield        #82  <Field float lastTouchY>
    //  264  498:aload_2         
    //  265  499:invokevirtual   #391 <Method float MotionEvent.getY()>
    //  266  502:fsub            
    //  267  503:fsub            
    //  268  504:iload           5
    //  269  506:i2f             
    //  270  507:fcmpl           
    //  271  508:ifle            573
    //  272  511:aload_0         
    //  273  512:getfield        #78  <Field int rectEY>
    //  274  515:i2f             
    //  275  516:aload_0         
    //  276  517:getfield        #82  <Field float lastTouchY>
    //  277  520:aload_2         
    //  278  521:invokevirtual   #391 <Method float MotionEvent.getY()>
    //  279  524:fsub            
    //  280  525:fsub            
    //  281  526:iload           6
    //  282  528:i2f             
    //  283  529:fcmpg           
    //  284  530:ifgt            573
    //  285  533:aload_0         
    //  286  534:aload_0         
    //  287  535:getfield        #74  <Field int rectSY>
    //  288  538:i2f             
    //  289  539:aload_0         
    //  290  540:getfield        #82  <Field float lastTouchY>
    //  291  543:aload_2         
    //  292  544:invokevirtual   #391 <Method float MotionEvent.getY()>
    //  293  547:fsub            
    //  294  548:fsub            
    //  295  549:f2i             
    //  296  550:putfield        #74  <Field int rectSY>
    //  297  553:aload_0         
    //  298  554:aload_0         
    //  299  555:getfield        #78  <Field int rectEY>
    //  300  558:i2f             
    //  301  559:aload_0         
    //  302  560:getfield        #82  <Field float lastTouchY>
    //  303  563:aload_2         
    //  304  564:invokevirtual   #391 <Method float MotionEvent.getY()>
    //  305  567:fsub            
    //  306  568:fsub            
    //  307  569:f2i             
    //  308  570:putfield        #78  <Field int rectEY>
    //  309  573:aload_0         
    //  310  574:aload_2         
    //  311  575:invokevirtual   #391 <Method float MotionEvent.getY()>
    //  312  578:putfield        #82  <Field float lastTouchY>
    //  313  581:aload_0         
    //  314  582:aload_2         
    //  315  583:invokevirtual   #388 <Method float MotionEvent.getX()>
    //  316  586:putfield        #80  <Field float lastTouchX>
    //  317  589:aload_0         
    //  318  590:invokevirtual   #143 <Method void requestUpdate()>
    //  319  593:aload_0         
    //  320  594:getfield        #86  <Field boolean pinSelected>
    //  321  597:ifeq            196
    //  322  600:aload_2         
    //  323  601:invokevirtual   #388 <Method float MotionEvent.getX()>
    //  324  604:aload_0         
    //  325  605:getfield        #72  <Field int rectSX>
    //  326  608:i2f             
    //  327  609:aload_0         
    //  328  610:ldc2            #392 <Float 200F>
    //  329  613:invokevirtual   #282 <Method float fixToSize(float)>
    //  330  616:fadd            
    //  331  617:fcmpl           
    //  332  618:ifle            674
    //  333  621:aload_2         
    //  334  622:invokevirtual   #388 <Method float MotionEvent.getX()>
    //  335  625:iload           4
    //  336  627:i2f             
    //  337  628:fcmpg           
    //  338  629:ifge            674
    //  339  632:aload_0         
    //  340  633:getfield        #80  <Field float lastTouchX>
    //  341  636:aload_2         
    //  342  637:invokevirtual   #388 <Method float MotionEvent.getX()>
    //  343  640:fcmpl           
    //  344  641:ifne            654
    //  345  644:aload_0         
    //  346  645:fconst_1        
    //  347  646:aload_0         
    //  348  647:getfield        #80  <Field float lastTouchX>
    //  349  650:fadd            
    //  350  651:putfield        #80  <Field float lastTouchX>
    //  351  654:aload_0         
    //  352  655:aload_0         
    //  353  656:getfield        #76  <Field int rectEX>
    //  354  659:i2f             
    //  355  660:aload_0         
    //  356  661:getfield        #80  <Field float lastTouchX>
    //  357  664:aload_2         
    //  358  665:invokevirtual   #388 <Method float MotionEvent.getX()>
    //  359  668:fsub            
    //  360  669:fsub            
    //  361  670:f2i             
    //  362  671:putfield        #76  <Field int rectEX>
    //  363  674:aload_2         
    //  364  675:invokevirtual   #391 <Method float MotionEvent.getY()>
    //  365  678:aload_0         
    //  366  679:getfield        #74  <Field int rectSY>
    //  367  682:i2f             
    //  368  683:aload_0         
    //  369  684:ldc2            #392 <Float 200F>
    //  370  687:invokevirtual   #282 <Method float fixToSize(float)>
    //  371  690:fadd            
    //  372  691:fcmpl           
    //  373  692:ifle            748
    //  374  695:aload_2         
    //  375  696:invokevirtual   #391 <Method float MotionEvent.getY()>
    //  376  699:iload           6
    //  377  701:i2f             
    //  378  702:fcmpg           
    //  379  703:ifge            748
    //  380  706:aload_0         
    //  381  707:getfield        #82  <Field float lastTouchY>
    //  382  710:aload_2         
    //  383  711:invokevirtual   #391 <Method float MotionEvent.getY()>
    //  384  714:fcmpl           
    //  385  715:ifne            728
    //  386  718:aload_0         
    //  387  719:fconst_1        
    //  388  720:aload_0         
    //  389  721:getfield        #82  <Field float lastTouchY>
    //  390  724:fadd            
    //  391  725:putfield        #82  <Field float lastTouchY>
    //  392  728:aload_0         
    //  393  729:aload_0         
    //  394  730:getfield        #78  <Field int rectEY>
    //  395  733:i2f             
    //  396  734:aload_0         
    //  397  735:getfield        #82  <Field float lastTouchY>
    //  398  738:aload_2         
    //  399  739:invokevirtual   #391 <Method float MotionEvent.getY()>
    //  400  742:fsub            
    //  401  743:fsub            
    //  402  744:f2i             
    //  403  745:putfield        #78  <Field int rectEY>
    //  404  748:aload_0         
    //  405  749:aload_2         
    //  406  750:invokevirtual   #391 <Method float MotionEvent.getY()>
    //  407  753:putfield        #82  <Field float lastTouchY>
    //  408  756:aload_0         
    //  409  757:aload_2         
    //  410  758:invokevirtual   #388 <Method float MotionEvent.getX()>
    //  411  761:putfield        #80  <Field float lastTouchX>
    //  412  764:aload_0         
    //  413  765:invokevirtual   #143 <Method void requestUpdate()>
    //  414  768:goto            196
    //  415  771:aload_0         
    //  416  772:iconst_0        
    //  417  773:putfield        #84  <Field boolean rectSelected>
    //  418  776:aload_0         
    //  419  777:iconst_0        
    //  420  778:putfield        #86  <Field boolean pinSelected>
    //  421  781:aload_0         
    //  422  782:invokevirtual   #143 <Method void requestUpdate()>
    //  423  785:goto            196
    }

    public void requestUpdate()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #88  <Field boolean update>
    //    3    5:return          
    }

    public float resetFixedSize(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #66  <Field int canvasWidth>
    //    2    4:istore_2        
    //    3    5:aload_0         
    //    4    6:getfield        #64  <Field int screenWidth>
    //    5    9:aload_0         
    //    6   10:getfield        #62  <Field int screenHeight>
    //    7   13:icmpge          62
    //    8   16:aload_0         
    //    9   17:getfield        #64  <Field int screenWidth>
    //   10   20:istore_3        
    //   11   21:ldc2            #280 <Float 100F>
    //   12   24:fload_1         
    //   13   25:iload_3         
    //   14   26:i2f             
    //   15   27:fdiv            
    //   16   28:fmul            
    //   17   29:ldc2            #280 <Float 100F>
    //   18   32:fdiv            
    //   19   33:iload_2         
    //   20   34:i2f             
    //   21   35:fmul            
    //   22   36:invokestatic    #397 <Method String String.valueOf(float)>
    //   23   39:astore          4
    //   24   41:aload           4
    //   25   43:iconst_0        
    //   26   44:aload           4
    //   27   46:ldc2            #399 <String ".">
    //   28   49:invokevirtual   #402 <Method int String.lastIndexOf(String)>
    //   29   52:invokevirtual   #406 <Method String String.substring(int, int)>
    //   30   55:invokestatic    #411 <Method Float Float.valueOf(String)>
    //   31   58:invokevirtual   #414 <Method float Float.floatValue()>
    //   32   61:freturn         
    //   33   62:aload_0         
    //   34   63:getfield        #62  <Field int screenHeight>
    //   35   66:istore_3        
    //   36   67:goto            21
    }

    public int resetFixedSize(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #66  <Field int canvasWidth>
    //    2    4:istore_2        
    //    3    5:aload_0         
    //    4    6:getfield        #64  <Field int screenWidth>
    //    5    9:aload_0         
    //    6   10:getfield        #62  <Field int screenHeight>
    //    7   13:icmpge          63
    //    8   16:aload_0         
    //    9   17:getfield        #64  <Field int screenWidth>
    //   10   20:istore_3        
    //   11   21:ldc2            #280 <Float 100F>
    //   12   24:iload_1         
    //   13   25:i2f             
    //   14   26:iload_3         
    //   15   27:i2f             
    //   16   28:fdiv            
    //   17   29:fmul            
    //   18   30:ldc2            #280 <Float 100F>
    //   19   33:fdiv            
    //   20   34:iload_2         
    //   21   35:i2f             
    //   22   36:fmul            
    //   23   37:invokestatic    #397 <Method String String.valueOf(float)>
    //   24   40:astore          4
    //   25   42:aload           4
    //   26   44:iconst_0        
    //   27   45:aload           4
    //   28   47:ldc2            #399 <String ".">
    //   29   50:invokevirtual   #402 <Method int String.lastIndexOf(String)>
    //   30   53:invokevirtual   #406 <Method String String.substring(int, int)>
    //   31   56:invokestatic    #420 <Method Integer Integer.valueOf(String)>
    //   32   59:invokevirtual   #423 <Method int Integer.intValue()>
    //   33   62:ireturn         
    //   34   63:aload_0         
    //   35   64:getfield        #62  <Field int screenHeight>
    //   36   67:istore_3        
    //   37   68:goto            21
    }

    String bitmapURI;
    int canvasHeight;
    int canvasWidth;
    Handler handler;
    SurfaceHolder holder;
    int id;
    boolean isItOK;
    float lastTouchX;
    float lastTouchY;
    boolean pickerLoaded;
    boolean pinSelected;
    Bitmap preResizePinActiveBitmap;
    Bitmap preResizePinBitmap;
    int rectEX;
    int rectEY;
    int rectSX;
    int rectSY;
    boolean rectSelected;
    Bitmap resizePinActiveBitmap;
    Bitmap resizePinBitmap;
    int rotation;
    int screenHeight;
    int screenWidth;
    Thread t;
    Bitmap tempBitmap;
    Bitmap theBitmap;
    boolean update;
    OurView v;

    // Unreferenced inner class codeadore/textgram/PrepareBitmapActivity$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field PrepareBitmapActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field PrepareBitmapActivity this$0>
        //    2    4:bipush          90
        //    3    6:invokevirtual   #26  <Method void PrepareBitmapActivity.applyRotation(int)>
        //    4    9:return          
        }

        final PrepareBitmapActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/PrepareBitmapActivity$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field PrepareBitmapActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field PrepareBitmapActivity this$0>
        //    2    4:bipush          -90
        //    3    6:invokevirtual   #26  <Method void PrepareBitmapActivity.applyRotation(int)>
        //    4    9:return          
        }

        final PrepareBitmapActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/PrepareBitmapActivity$3

/* anonymous class */
    class _cls3
        implements android.view.View.OnClickListener
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field PrepareBitmapActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field PrepareBitmapActivity this$0>
        //    2    4:invokevirtual   #25  <Method void PrepareBitmapActivity.done()>
        //    3    7:return          
        }

        final PrepareBitmapActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/PrepareBitmapActivity$4

/* anonymous class */
    class _cls4
        implements Runnable
    {

        _cls4()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field PrepareBitmapActivity this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field Bundle val$savedInstanceState>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field Bundle val$savedInstanceState>
        //    2    4:ldc1            #27  <String "bitmapURI">
        //    3    6:invokevirtual   #33  <Method String Bundle.getString(String)>
        //    4    9:ifnull          36
        //    5   12:aload_0         
        //    6   13:getfield        #19  <Field PrepareBitmapActivity this$0>
        //    7   16:iconst_1        
        //    8   17:putfield        #37  <Field boolean PrepareBitmapActivity.pickerLoaded>
        //    9   20:aload_0         
        //   10   21:getfield        #19  <Field PrepareBitmapActivity this$0>
        //   11   24:aload_0         
        //   12   25:getfield        #21  <Field Bundle val$savedInstanceState>
        //   13   28:ldc1            #27  <String "bitmapURI">
        //   14   30:invokevirtual   #33  <Method String Bundle.getString(String)>
        //   15   33:invokevirtual   #41  <Method void PrepareBitmapActivity.applyBitmap(String)>
        //   16   36:return          
        }

        final PrepareBitmapActivity this$0;
        private final Bundle val$savedInstanceState;
    }


    // Unreferenced inner class codeadore/textgram/PrepareBitmapActivity$5

/* anonymous class */
    class _cls5
        implements Runnable
    {

        _cls5()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field PrepareBitmapActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field PrepareBitmapActivity this$0>
        //    2    4:aload_0         
        //    3    5:getfield        #17  <Field PrepareBitmapActivity this$0>
        //    4    8:getfield        #25  <Field PrepareBitmapActivity$OurView PrepareBitmapActivity.v>
        //    5   11:invokevirtual   #31  <Method int PrepareBitmapActivity$OurView.getHeight()>
        //    6   14:putfield        #35  <Field int PrepareBitmapActivity.screenHeight>
        //    7   17:aload_0         
        //    8   18:getfield        #17  <Field PrepareBitmapActivity this$0>
        //    9   21:aload_0         
        //   10   22:getfield        #17  <Field PrepareBitmapActivity this$0>
        //   11   25:getfield        #25  <Field PrepareBitmapActivity$OurView PrepareBitmapActivity.v>
        //   12   28:invokevirtual   #38  <Method int PrepareBitmapActivity$OurView.getWidth()>
        //   13   31:putfield        #41  <Field int PrepareBitmapActivity.screenWidth>
        //   14   34:aload_0         
        //   15   35:getfield        #17  <Field PrepareBitmapActivity this$0>
        //   16   38:aload_0         
        //   17   39:getfield        #17  <Field PrepareBitmapActivity this$0>
        //   18   42:getfield        #35  <Field int PrepareBitmapActivity.screenHeight>
        //   19   45:putfield        #44  <Field int PrepareBitmapActivity.canvasHeight>
        //   20   48:aload_0         
        //   21   49:getfield        #17  <Field PrepareBitmapActivity this$0>
        //   22   52:aload_0         
        //   23   53:getfield        #17  <Field PrepareBitmapActivity this$0>
        //   24   56:getfield        #41  <Field int PrepareBitmapActivity.screenWidth>
        //   25   59:putfield        #47  <Field int PrepareBitmapActivity.canvasWidth>
        //   26   62:aload_0         
        //   27   63:getfield        #17  <Field PrepareBitmapActivity this$0>
        //   28   66:getfield        #51  <Field Bitmap PrepareBitmapActivity.tempBitmap>
        //   29   69:invokevirtual   #54  <Method int Bitmap.getWidth()>
        //   30   72:aload_0         
        //   31   73:getfield        #17  <Field PrepareBitmapActivity this$0>
        //   32   76:getfield        #51  <Field Bitmap PrepareBitmapActivity.tempBitmap>
        //   33   79:invokevirtual   #55  <Method int Bitmap.getHeight()>
        //   34   82:icmple          249
        //   35   85:aload_0         
        //   36   86:getfield        #17  <Field PrepareBitmapActivity this$0>
        //   37   89:getfield        #47  <Field int PrepareBitmapActivity.canvasWidth>
        //   38   92:aload_0         
        //   39   93:getfield        #17  <Field PrepareBitmapActivity this$0>
        //   40   96:getfield        #44  <Field int PrepareBitmapActivity.canvasHeight>
        //   41   99:icmple          214
        //   42  102:aload_0         
        //   43  103:getfield        #17  <Field PrepareBitmapActivity this$0>
        //   44  106:getfield        #44  <Field int PrepareBitmapActivity.canvasHeight>
        //   45  109:istore_2        
        //   46  110:iload_2         
        //   47  111:aload_0         
        //   48  112:getfield        #17  <Field PrepareBitmapActivity this$0>
        //   49  115:getfield        #51  <Field Bitmap PrepareBitmapActivity.tempBitmap>
        //   50  118:invokevirtual   #54  <Method int Bitmap.getWidth()>
        //   51  121:imul            
        //   52  122:aload_0         
        //   53  123:getfield        #17  <Field PrepareBitmapActivity this$0>
        //   54  126:getfield        #51  <Field Bitmap PrepareBitmapActivity.tempBitmap>
        //   55  129:invokevirtual   #55  <Method int Bitmap.getHeight()>
        //   56  132:idiv            
        //   57  133:istore_1        
        //   58  134:aload_0         
        //   59  135:getfield        #17  <Field PrepareBitmapActivity this$0>
        //   60  138:aload_0         
        //   61  139:getfield        #17  <Field PrepareBitmapActivity this$0>
        //   62  142:getfield        #47  <Field int PrepareBitmapActivity.canvasWidth>
        //   63  145:iconst_2        
        //   64  146:idiv            
        //   65  147:iload_1         
        //   66  148:iconst_2        
        //   67  149:idiv            
        //   68  150:isub            
        //   69  151:putfield        #58  <Field int PrepareBitmapActivity.rectSX>
        //   70  154:aload_0         
        //   71  155:getfield        #17  <Field PrepareBitmapActivity this$0>
        //   72  158:iload_1         
        //   73  159:aload_0         
        //   74  160:getfield        #17  <Field PrepareBitmapActivity this$0>
        //   75  163:getfield        #58  <Field int PrepareBitmapActivity.rectSX>
        //   76  166:iadd            
        //   77  167:putfield        #61  <Field int PrepareBitmapActivity.rectEX>
        //   78  170:aload_0         
        //   79  171:getfield        #17  <Field PrepareBitmapActivity this$0>
        //   80  174:aload_0         
        //   81  175:getfield        #17  <Field PrepareBitmapActivity this$0>
        //   82  178:getfield        #44  <Field int PrepareBitmapActivity.canvasHeight>
        //   83  181:iconst_2        
        //   84  182:idiv            
        //   85  183:iload_2         
        //   86  184:iconst_2        
        //   87  185:idiv            
        //   88  186:isub            
        //   89  187:putfield        #64  <Field int PrepareBitmapActivity.rectSY>
        //   90  190:aload_0         
        //   91  191:getfield        #17  <Field PrepareBitmapActivity this$0>
        //   92  194:iload_2         
        //   93  195:aload_0         
        //   94  196:getfield        #17  <Field PrepareBitmapActivity this$0>
        //   95  199:getfield        #64  <Field int PrepareBitmapActivity.rectSY>
        //   96  202:iadd            
        //   97  203:putfield        #67  <Field int PrepareBitmapActivity.rectEY>
        //   98  206:aload_0         
        //   99  207:getfield        #17  <Field PrepareBitmapActivity this$0>
        //  100  210:invokevirtual   #70  <Method void PrepareBitmapActivity.requestUpdate()>
        //  101  213:return          
        //  102  214:aload_0         
        //  103  215:getfield        #17  <Field PrepareBitmapActivity this$0>
        //  104  218:getfield        #47  <Field int PrepareBitmapActivity.canvasWidth>
        //  105  221:istore_1        
        //  106  222:iload_1         
        //  107  223:aload_0         
        //  108  224:getfield        #17  <Field PrepareBitmapActivity this$0>
        //  109  227:getfield        #51  <Field Bitmap PrepareBitmapActivity.tempBitmap>
        //  110  230:invokevirtual   #55  <Method int Bitmap.getHeight()>
        //  111  233:imul            
        //  112  234:aload_0         
        //  113  235:getfield        #17  <Field PrepareBitmapActivity this$0>
        //  114  238:getfield        #51  <Field Bitmap PrepareBitmapActivity.tempBitmap>
        //  115  241:invokevirtual   #54  <Method int Bitmap.getWidth()>
        //  116  244:idiv            
        //  117  245:istore_2        
        //  118  246:goto            134
        //  119  249:aload_0         
        //  120  250:getfield        #17  <Field PrepareBitmapActivity this$0>
        //  121  253:getfield        #51  <Field Bitmap PrepareBitmapActivity.tempBitmap>
        //  122  256:invokevirtual   #55  <Method int Bitmap.getHeight()>
        //  123  259:aload_0         
        //  124  260:getfield        #17  <Field PrepareBitmapActivity this$0>
        //  125  263:getfield        #51  <Field Bitmap PrepareBitmapActivity.tempBitmap>
        //  126  266:invokevirtual   #54  <Method int Bitmap.getWidth()>
        //  127  269:icmple          307
        //  128  272:aload_0         
        //  129  273:getfield        #17  <Field PrepareBitmapActivity this$0>
        //  130  276:getfield        #44  <Field int PrepareBitmapActivity.canvasHeight>
        //  131  279:istore_2        
        //  132  280:iload_2         
        //  133  281:aload_0         
        //  134  282:getfield        #17  <Field PrepareBitmapActivity this$0>
        //  135  285:getfield        #51  <Field Bitmap PrepareBitmapActivity.tempBitmap>
        //  136  288:invokevirtual   #54  <Method int Bitmap.getWidth()>
        //  137  291:imul            
        //  138  292:aload_0         
        //  139  293:getfield        #17  <Field PrepareBitmapActivity this$0>
        //  140  296:getfield        #51  <Field Bitmap PrepareBitmapActivity.tempBitmap>
        //  141  299:invokevirtual   #55  <Method int Bitmap.getHeight()>
        //  142  302:idiv            
        //  143  303:istore_1        
        //  144  304:goto            134
        //  145  307:aload_0         
        //  146  308:getfield        #17  <Field PrepareBitmapActivity this$0>
        //  147  311:getfield        #47  <Field int PrepareBitmapActivity.canvasWidth>
        //  148  314:aload_0         
        //  149  315:getfield        #17  <Field PrepareBitmapActivity this$0>
        //  150  318:getfield        #44  <Field int PrepareBitmapActivity.canvasHeight>
        //  151  321:icmple          343
        //  152  324:aload_0         
        //  153  325:getfield        #17  <Field PrepareBitmapActivity this$0>
        //  154  328:getfield        #44  <Field int PrepareBitmapActivity.canvasHeight>
        //  155  331:istore_1        
        //  156  332:aload_0         
        //  157  333:getfield        #17  <Field PrepareBitmapActivity this$0>
        //  158  336:getfield        #44  <Field int PrepareBitmapActivity.canvasHeight>
        //  159  339:istore_2        
        //  160  340:goto            134
        //  161  343:aload_0         
        //  162  344:getfield        #17  <Field PrepareBitmapActivity this$0>
        //  163  347:getfield        #47  <Field int PrepareBitmapActivity.canvasWidth>
        //  164  350:istore_1        
        //  165  351:aload_0         
        //  166  352:getfield        #17  <Field PrepareBitmapActivity this$0>
        //  167  355:getfield        #47  <Field int PrepareBitmapActivity.canvasWidth>
        //  168  358:istore_2        
        //  169  359:goto            134
        }

        final PrepareBitmapActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/PrepareBitmapActivity$OurView$1

/* anonymous class */
    class OurView._cls1
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        OurView._cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onGlobalLayout()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //    2    4:invokestatic    #24  <Method PrepareBitmapActivity PrepareBitmapActivity$OurView.access$0(PrepareBitmapActivity$OurView)>
        //    3    7:aload_0         
        //    4    8:getfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //    5   11:invokestatic    #24  <Method PrepareBitmapActivity PrepareBitmapActivity$OurView.access$0(PrepareBitmapActivity$OurView)>
        //    6   14:getfield        #29  <Field PrepareBitmapActivity$OurView PrepareBitmapActivity.v>
        //    7   17:invokevirtual   #33  <Method int PrepareBitmapActivity$OurView.getHeight()>
        //    8   20:putfield        #37  <Field int PrepareBitmapActivity.screenHeight>
        //    9   23:aload_0         
        //   10   24:getfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //   11   27:invokestatic    #24  <Method PrepareBitmapActivity PrepareBitmapActivity$OurView.access$0(PrepareBitmapActivity$OurView)>
        //   12   30:aload_0         
        //   13   31:getfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //   14   34:invokestatic    #24  <Method PrepareBitmapActivity PrepareBitmapActivity$OurView.access$0(PrepareBitmapActivity$OurView)>
        //   15   37:getfield        #29  <Field PrepareBitmapActivity$OurView PrepareBitmapActivity.v>
        //   16   40:invokevirtual   #40  <Method int PrepareBitmapActivity$OurView.getWidth()>
        //   17   43:putfield        #43  <Field int PrepareBitmapActivity.screenWidth>
        //   18   46:aload_0         
        //   19   47:getfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //   20   50:invokestatic    #24  <Method PrepareBitmapActivity PrepareBitmapActivity$OurView.access$0(PrepareBitmapActivity$OurView)>
        //   21   53:aload_0         
        //   22   54:getfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //   23   57:invokestatic    #24  <Method PrepareBitmapActivity PrepareBitmapActivity$OurView.access$0(PrepareBitmapActivity$OurView)>
        //   24   60:getfield        #37  <Field int PrepareBitmapActivity.screenHeight>
        //   25   63:putfield        #46  <Field int PrepareBitmapActivity.canvasHeight>
        //   26   66:aload_0         
        //   27   67:getfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //   28   70:invokestatic    #24  <Method PrepareBitmapActivity PrepareBitmapActivity$OurView.access$0(PrepareBitmapActivity$OurView)>
        //   29   73:aload_0         
        //   30   74:getfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //   31   77:invokestatic    #24  <Method PrepareBitmapActivity PrepareBitmapActivity$OurView.access$0(PrepareBitmapActivity$OurView)>
        //   32   80:getfield        #43  <Field int PrepareBitmapActivity.screenWidth>
        //   33   83:putfield        #49  <Field int PrepareBitmapActivity.canvasWidth>
        //   34   86:aload_0         
        //   35   87:getfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //   36   90:invokestatic    #24  <Method PrepareBitmapActivity PrepareBitmapActivity$OurView.access$0(PrepareBitmapActivity$OurView)>
        //   37   93:getfield        #49  <Field int PrepareBitmapActivity.canvasWidth>
        //   38   96:aload_0         
        //   39   97:getfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //   40  100:invokestatic    #24  <Method PrepareBitmapActivity PrepareBitmapActivity$OurView.access$0(PrepareBitmapActivity$OurView)>
        //   41  103:getfield        #46  <Field int PrepareBitmapActivity.canvasHeight>
        //   42  106:icmpge          243
        //   43  109:aload_0         
        //   44  110:getfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //   45  113:invokestatic    #24  <Method PrepareBitmapActivity PrepareBitmapActivity$OurView.access$0(PrepareBitmapActivity$OurView)>
        //   46  116:getfield        #49  <Field int PrepareBitmapActivity.canvasWidth>
        //   47  119:istore_1        
        //   48  120:ldc2w           #50  <Double 0.10000000000000001D>
        //   49  123:iload_1         
        //   50  124:i2d             
        //   51  125:dmul            
        //   52  126:d2i             
        //   53  127:istore_2        
        //   54  128:aload_0         
        //   55  129:getfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //   56  132:invokestatic    #24  <Method PrepareBitmapActivity PrepareBitmapActivity$OurView.access$0(PrepareBitmapActivity$OurView)>
        //   57  135:aload_0         
        //   58  136:getfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //   59  139:invokestatic    #24  <Method PrepareBitmapActivity PrepareBitmapActivity$OurView.access$0(PrepareBitmapActivity$OurView)>
        //   60  142:getfield        #55  <Field Bitmap PrepareBitmapActivity.preResizePinBitmap>
        //   61  145:iload_2         
        //   62  146:iload_2         
        //   63  147:iconst_1        
        //   64  148:invokestatic    #61  <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
        //   65  151:putfield        #64  <Field Bitmap PrepareBitmapActivity.resizePinBitmap>
        //   66  154:aload_0         
        //   67  155:getfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //   68  158:invokestatic    #24  <Method PrepareBitmapActivity PrepareBitmapActivity$OurView.access$0(PrepareBitmapActivity$OurView)>
        //   69  161:aload_0         
        //   70  162:getfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //   71  165:invokestatic    #24  <Method PrepareBitmapActivity PrepareBitmapActivity$OurView.access$0(PrepareBitmapActivity$OurView)>
        //   72  168:getfield        #67  <Field Bitmap PrepareBitmapActivity.preResizePinActiveBitmap>
        //   73  171:iload_2         
        //   74  172:iload_2         
        //   75  173:iconst_1        
        //   76  174:invokestatic    #61  <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
        //   77  177:putfield        #70  <Field Bitmap PrepareBitmapActivity.resizePinActiveBitmap>
        //   78  180:aload_0         
        //   79  181:getfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //   80  184:invokestatic    #24  <Method PrepareBitmapActivity PrepareBitmapActivity$OurView.access$0(PrepareBitmapActivity$OurView)>
        //   81  187:getfield        #74  <Field boolean PrepareBitmapActivity.pickerLoaded>
        //   82  190:ifne            242
        //   83  193:new             #76  <Class Intent>
        //   84  196:dup             
        //   85  197:ldc1            #78  <String "android.intent.action.PICK">
        //   86  199:invokespecial   #81  <Method void Intent(String)>
        //   87  202:astore_3        
        //   88  203:aload_3         
        //   89  204:ldc1            #83  <String "image/*">
        //   90  206:invokevirtual   #87  <Method Intent Intent.setType(String)>
        //   91  209:pop             
        //   92  210:aload_0         
        //   93  211:getfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //   94  214:invokestatic    #24  <Method PrepareBitmapActivity PrepareBitmapActivity$OurView.access$0(PrepareBitmapActivity$OurView)>
        //   95  217:aload_3         
        //   96  218:aload_0         
        //   97  219:getfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //   98  222:invokestatic    #24  <Method PrepareBitmapActivity PrepareBitmapActivity$OurView.access$0(PrepareBitmapActivity$OurView)>
        //   99  225:getfield        #90  <Field int PrepareBitmapActivity.id>
        //  100  228:invokevirtual   #94  <Method void PrepareBitmapActivity.startActivityForResult(Intent, int)>
        //  101  231:aload_0         
        //  102  232:getfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //  103  235:invokestatic    #24  <Method PrepareBitmapActivity PrepareBitmapActivity$OurView.access$0(PrepareBitmapActivity$OurView)>
        //  104  238:iconst_1        
        //  105  239:putfield        #74  <Field boolean PrepareBitmapActivity.pickerLoaded>
        //  106  242:return          
        //  107  243:aload_0         
        //  108  244:getfield        #16  <Field PrepareBitmapActivity$OurView this$1>
        //  109  247:invokestatic    #24  <Method PrepareBitmapActivity PrepareBitmapActivity$OurView.access$0(PrepareBitmapActivity$OurView)>
        //  110  250:getfield        #46  <Field int PrepareBitmapActivity.canvasHeight>
        //  111  253:istore_1        
        //  112  254:goto            120
        }

        final OurView this$1;
    }

}
