// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package eu.janmuller.android.simplecropimage;

import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.view.View;

class HighlightView
{
    static final class ModifyMode extends Enum
    {

        static 
        {
        //    0    0:new             #2   <Class HighlightView$ModifyMode>
        //    1    3:dup             
        //    2    4:ldc1            #14  <String "None">
        //    3    6:iconst_0        
        //    4    7:invokespecial   #18  <Method void HighlightView$ModifyMode(String, int)>
        //    5   10:putstatic       #20  <Field HighlightView$ModifyMode None>
        //    6   13:new             #2   <Class HighlightView$ModifyMode>
        //    7   16:dup             
        //    8   17:ldc1            #21  <String "Move">
        //    9   19:iconst_1        
        //   10   20:invokespecial   #18  <Method void HighlightView$ModifyMode(String, int)>
        //   11   23:putstatic       #23  <Field HighlightView$ModifyMode Move>
        //   12   26:new             #2   <Class HighlightView$ModifyMode>
        //   13   29:dup             
        //   14   30:ldc1            #24  <String "Grow">
        //   15   32:iconst_2        
        //   16   33:invokespecial   #18  <Method void HighlightView$ModifyMode(String, int)>
        //   17   36:putstatic       #26  <Field HighlightView$ModifyMode Grow>
        //   18   39:iconst_3        
        //   19   40:anewarray       ModifyMode[]
        //   20   43:astore_0        
        //   21   44:aload_0         
        //   22   45:iconst_0        
        //   23   46:getstatic       #20  <Field HighlightView$ModifyMode None>
        //   24   49:aastore         
        //   25   50:aload_0         
        //   26   51:iconst_1        
        //   27   52:getstatic       #23  <Field HighlightView$ModifyMode Move>
        //   28   55:aastore         
        //   29   56:aload_0         
        //   30   57:iconst_2        
        //   31   58:getstatic       #26  <Field HighlightView$ModifyMode Grow>
        //   32   61:aastore         
        //   33   62:aload_0         
        //   34   63:putstatic       #28  <Field HighlightView$ModifyMode[] ENUM$VALUES>
        //   35   66:return          
        }

        private ModifyMode(String s, int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #29  <Method void Enum(String, int)>
        //    4    6:return          
        }

        public static ModifyMode valueOf(String s)
        {
        //    0    0:ldc1            #2   <Class HighlightView$ModifyMode>
        //    1    2:aload_0         
        //    2    3:invokestatic    #34  <Method Enum Enum.valueOf(Class, String)>
        //    3    6:checkcast       #2   <Class HighlightView$ModifyMode>
        //    4    9:areturn         
        }

        public static ModifyMode[] values()
        {
        //    0    0:getstatic       #28  <Field HighlightView$ModifyMode[] ENUM$VALUES>
        //    1    3:astore_0        
        //    2    4:aload_0         
        //    3    5:arraylength     
        //    4    6:istore_1        
        //    5    7:iload_1         
        //    6    8:anewarray       ModifyMode[]
        //    7   11:astore_2        
        //    8   12:aload_0         
        //    9   13:iconst_0        
        //   10   14:aload_2         
        //   11   15:iconst_0        
        //   12   16:iload_1         
        //   13   17:invokestatic    #42  <Method void System.arraycopy(Object, int, Object, int, int)>
        //   14   20:aload_2         
        //   15   21:areturn         
        }

        private static final ModifyMode ENUM$VALUES[];
        public static final ModifyMode Grow;
        public static final ModifyMode Move;
        public static final ModifyMode None;
    }


    public HighlightView(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #54  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:getstatic       #59  <Field HighlightView$ModifyMode HighlightView$ModifyMode.None>
    //    4    8:putfield        #61  <Field HighlightView$ModifyMode mMode>
    //    5   11:aload_0         
    //    6   12:iconst_0        
    //    7   13:putfield        #63  <Field boolean mMaintainAspectRatio>
    //    8   16:aload_0         
    //    9   17:iconst_0        
    //   10   18:putfield        #65  <Field boolean mCircle>
    //   11   21:aload_0         
    //   12   22:new             #67  <Class Paint>
    //   13   25:dup             
    //   14   26:invokespecial   #68  <Method void Paint()>
    //   15   29:putfield        #70  <Field Paint mFocusPaint>
    //   16   32:aload_0         
    //   17   33:new             #67  <Class Paint>
    //   18   36:dup             
    //   19   37:invokespecial   #68  <Method void Paint()>
    //   20   40:putfield        #72  <Field Paint mNoFocusPaint>
    //   21   43:aload_0         
    //   22   44:aload_1         
    //   23   45:putfield        #74  <Field View mContext>
    //   24   48:return          
    }

    private Rect computeLayout()
    {
    //    0    0:new             #78  <Class RectF>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:getfield        #80  <Field RectF mCropRect>
    //    4    8:getfield        #83  <Field float RectF.left>
    //    5   11:aload_0         
    //    6   12:getfield        #80  <Field RectF mCropRect>
    //    7   15:getfield        #86  <Field float RectF.top>
    //    8   18:aload_0         
    //    9   19:getfield        #80  <Field RectF mCropRect>
    //   10   22:getfield        #89  <Field float RectF.right>
    //   11   25:aload_0         
    //   12   26:getfield        #80  <Field RectF mCropRect>
    //   13   29:getfield        #92  <Field float RectF.bottom>
    //   14   32:invokespecial   #95  <Method void RectF(float, float, float, float)>
    //   15   35:astore_1        
    //   16   36:aload_0         
    //   17   37:getfield        #97  <Field Matrix mMatrix>
    //   18   40:aload_1         
    //   19   41:invokevirtual   #103 <Method boolean Matrix.mapRect(RectF)>
    //   20   44:pop             
    //   21   45:new             #105 <Class Rect>
    //   22   48:dup             
    //   23   49:aload_1         
    //   24   50:getfield        #83  <Field float RectF.left>
    //   25   53:invokestatic    #111 <Method int Math.round(float)>
    //   26   56:aload_1         
    //   27   57:getfield        #86  <Field float RectF.top>
    //   28   60:invokestatic    #111 <Method int Math.round(float)>
    //   29   63:aload_1         
    //   30   64:getfield        #89  <Field float RectF.right>
    //   31   67:invokestatic    #111 <Method int Math.round(float)>
    //   32   70:aload_1         
    //   33   71:getfield        #92  <Field float RectF.bottom>
    //   34   74:invokestatic    #111 <Method int Math.round(float)>
    //   35   77:invokespecial   #114 <Method void Rect(int, int, int, int)>
    //   36   80:areturn         
    }

    private void init()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #74  <Field View mContext>
    //    2    4:invokevirtual   #121 <Method Resources View.getResources()>
    //    3    7:astore_1        
    //    4    8:aload_0         
    //    5    9:aload_1         
    //    6   10:ldc1            #122 <Int 0x7f02007e>
    //    7   12:invokevirtual   #128 <Method Drawable Resources.getDrawable(int)>
    //    8   15:putfield        #130 <Field Drawable mResizeDrawableWidth>
    //    9   18:aload_0         
    //   10   19:aload_1         
    //   11   20:ldc1            #131 <Int 0x7f02007d>
    //   12   22:invokevirtual   #128 <Method Drawable Resources.getDrawable(int)>
    //   13   25:putfield        #133 <Field Drawable mResizeDrawableHeight>
    //   14   28:aload_0         
    //   15   29:aload_1         
    //   16   30:ldc1            #134 <Int 0x7f020094>
    //   17   32:invokevirtual   #128 <Method Drawable Resources.getDrawable(int)>
    //   18   35:putfield        #136 <Field Drawable mResizeDrawableDiagonal>
    //   19   38:aload_0         
    //   20   39:aload_1         
    //   21   40:ldc1            #137 <Int 0x7f0200a3>
    //   22   42:invokevirtual   #128 <Method Drawable Resources.getDrawable(int)>
    //   23   45:putfield        #139 <Field Drawable mCornerResize>
    //   24   48:aload_0         
    //   25   49:aload_0         
    //   26   50:getfield        #74  <Field View mContext>
    //   27   53:invokevirtual   #121 <Method Resources View.getResources()>
    //   28   56:ldc1            #137 <Int 0x7f0200a3>
    //   29   58:invokestatic    #145 <Method Bitmap BitmapFactory.decodeResource(Resources, int)>
    //   30   61:putfield        #147 <Field Bitmap mCornerResizeBitmap>
    //   31   64:return          
    }

    protected void draw(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #151 <Field boolean mHidden>
    //    2    4:ifeq            8
    //    3    7:return          
    //    4    8:new             #153 <Class Path>
    //    5   11:dup             
    //    6   12:invokespecial   #154 <Method void Path()>
    //    7   15:astore_2        
    //    8   16:aload_0         
    //    9   17:invokevirtual   #158 <Method boolean hasFocus()>
    //   10   20:ifeq            7
    //   11   23:new             #105 <Class Rect>
    //   12   26:dup             
    //   13   27:invokespecial   #159 <Method void Rect()>
    //   14   30:astore_3        
    //   15   31:aload_0         
    //   16   32:getfield        #74  <Field View mContext>
    //   17   35:aload_3         
    //   18   36:invokevirtual   #163 <Method void View.getDrawingRect(Rect)>
    //   19   39:aload_0         
    //   20   40:getfield        #65  <Field boolean mCircle>
    //   21   43:ifeq            294
    //   22   46:aload_1         
    //   23   47:invokevirtual   #169 <Method int Canvas.save()>
    //   24   50:pop             
    //   25   51:aload_0         
    //   26   52:getfield        #171 <Field Rect mDrawRect>
    //   27   55:invokevirtual   #174 <Method int Rect.width()>
    //   28   58:i2f             
    //   29   59:fstore          28
    //   30   61:aload_0         
    //   31   62:getfield        #171 <Field Rect mDrawRect>
    //   32   65:invokevirtual   #177 <Method int Rect.height()>
    //   33   68:i2f             
    //   34   69:fstore          29
    //   35   71:aload_2         
    //   36   72:aload_0         
    //   37   73:getfield        #171 <Field Rect mDrawRect>
    //   38   76:getfield        #179 <Field int Rect.left>
    //   39   79:i2f             
    //   40   80:fload           28
    //   41   82:fconst_2        
    //   42   83:fdiv            
    //   43   84:fadd            
    //   44   85:aload_0         
    //   45   86:getfield        #171 <Field Rect mDrawRect>
    //   46   89:getfield        #181 <Field int Rect.top>
    //   47   92:i2f             
    //   48   93:fload           29
    //   49   95:fconst_2        
    //   50   96:fdiv            
    //   51   97:fadd            
    //   52   98:fload           28
    //   53  100:fconst_2        
    //   54  101:fdiv            
    //   55  102:getstatic       #187 <Field android.graphics.Path$Direction android.graphics.Path$Direction.CW>
    //   56  105:invokevirtual   #191 <Method void Path.addCircle(float, float, float, android.graphics.Path$Direction)>
    //   57  108:aload_1         
    //   58  109:aload_2         
    //   59  110:getstatic       #197 <Field android.graphics.Region$Op android.graphics.Region$Op.DIFFERENCE>
    //   60  113:invokevirtual   #201 <Method boolean Canvas.clipPath(Path, android.graphics.Region$Op)>
    //   61  116:pop             
    //   62  117:aload_0         
    //   63  118:invokevirtual   #158 <Method boolean hasFocus()>
    //   64  121:ifeq            285
    //   65  124:aload_0         
    //   66  125:getfield        #70  <Field Paint mFocusPaint>
    //   67  128:astore          31
    //   68  130:aload_1         
    //   69  131:aload_3         
    //   70  132:aload           31
    //   71  134:invokevirtual   #205 <Method void Canvas.drawRect(Rect, Paint)>
    //   72  137:aload_1         
    //   73  138:invokevirtual   #208 <Method void Canvas.restore()>
    //   74  141:aload_0         
    //   75  142:getfield        #65  <Field boolean mCircle>
    //   76  145:ifeq            615
    //   77  148:aload_0         
    //   78  149:getfield        #136 <Field Drawable mResizeDrawableDiagonal>
    //   79  152:invokevirtual   #213 <Method int Drawable.getIntrinsicWidth()>
    //   80  155:istore          18
    //   81  157:aload_0         
    //   82  158:getfield        #136 <Field Drawable mResizeDrawableDiagonal>
    //   83  161:invokevirtual   #216 <Method int Drawable.getIntrinsicHeight()>
    //   84  164:istore          19
    //   85  166:ldc2w           #217 <Double 0.78539816339744828D>
    //   86  169:invokestatic    #222 <Method double Math.cos(double)>
    //   87  172:aload_0         
    //   88  173:getfield        #171 <Field Rect mDrawRect>
    //   89  176:invokevirtual   #174 <Method int Rect.width()>
    //   90  179:i2d             
    //   91  180:ldc2w           #223 <Double 2D>
    //   92  183:ddiv            
    //   93  184:dmul            
    //   94  185:invokestatic    #227 <Method long Math.round(double)>
    //   95  188:l2i             
    //   96  189:istore          20
    //   97  191:iload           20
    //   98  193:aload_0         
    //   99  194:getfield        #171 <Field Rect mDrawRect>
    //  100  197:getfield        #179 <Field int Rect.left>
    //  101  200:aload_0         
    //  102  201:getfield        #171 <Field Rect mDrawRect>
    //  103  204:invokevirtual   #174 <Method int Rect.width()>
    //  104  207:iconst_2        
    //  105  208:idiv            
    //  106  209:iadd            
    //  107  210:iadd            
    //  108  211:iload           18
    //  109  213:iconst_2        
    //  110  214:idiv            
    //  111  215:isub            
    //  112  216:istore          21
    //  113  218:aload_0         
    //  114  219:getfield        #171 <Field Rect mDrawRect>
    //  115  222:getfield        #181 <Field int Rect.top>
    //  116  225:aload_0         
    //  117  226:getfield        #171 <Field Rect mDrawRect>
    //  118  229:invokevirtual   #177 <Method int Rect.height()>
    //  119  232:iconst_2        
    //  120  233:idiv            
    //  121  234:iadd            
    //  122  235:iload           20
    //  123  237:isub            
    //  124  238:iload           19
    //  125  240:iconst_2        
    //  126  241:idiv            
    //  127  242:isub            
    //  128  243:istore          22
    //  129  245:aload_0         
    //  130  246:getfield        #136 <Field Drawable mResizeDrawableDiagonal>
    //  131  249:iload           21
    //  132  251:iload           22
    //  133  253:iload           21
    //  134  255:aload_0         
    //  135  256:getfield        #136 <Field Drawable mResizeDrawableDiagonal>
    //  136  259:invokevirtual   #213 <Method int Drawable.getIntrinsicWidth()>
    //  137  262:iadd            
    //  138  263:iload           22
    //  139  265:aload_0         
    //  140  266:getfield        #136 <Field Drawable mResizeDrawableDiagonal>
    //  141  269:invokevirtual   #216 <Method int Drawable.getIntrinsicHeight()>
    //  142  272:iadd            
    //  143  273:invokevirtual   #230 <Method void Drawable.setBounds(int, int, int, int)>
    //  144  276:aload_0         
    //  145  277:getfield        #136 <Field Drawable mResizeDrawableDiagonal>
    //  146  280:aload_1         
    //  147  281:invokevirtual   #232 <Method void Drawable.draw(Canvas)>
    //  148  284:return          
    //  149  285:aload_0         
    //  150  286:getfield        #72  <Field Paint mNoFocusPaint>
    //  151  289:astore          31
    //  152  291:goto            130
    //  153  294:new             #105 <Class Rect>
    //  154  297:dup             
    //  155  298:aload_3         
    //  156  299:getfield        #179 <Field int Rect.left>
    //  157  302:aload_3         
    //  158  303:getfield        #181 <Field int Rect.top>
    //  159  306:aload_3         
    //  160  307:getfield        #234 <Field int Rect.right>
    //  161  310:aload_0         
    //  162  311:getfield        #171 <Field Rect mDrawRect>
    //  163  314:getfield        #181 <Field int Rect.top>
    //  164  317:invokespecial   #114 <Method void Rect(int, int, int, int)>
    //  165  320:astore          4
    //  166  322:aload           4
    //  167  324:invokevirtual   #174 <Method int Rect.width()>
    //  168  327:ifle            359
    //  169  330:aload           4
    //  170  332:invokevirtual   #177 <Method int Rect.height()>
    //  171  335:ifle            359
    //  172  338:aload_0         
    //  173  339:invokevirtual   #158 <Method boolean hasFocus()>
    //  174  342:ifeq            579
    //  175  345:aload_0         
    //  176  346:getfield        #70  <Field Paint mFocusPaint>
    //  177  349:astore          26
    //  178  351:aload_1         
    //  179  352:aload           4
    //  180  354:aload           26
    //  181  356:invokevirtual   #205 <Method void Canvas.drawRect(Rect, Paint)>
    //  182  359:new             #105 <Class Rect>
    //  183  362:dup             
    //  184  363:aload_3         
    //  185  364:getfield        #179 <Field int Rect.left>
    //  186  367:aload_0         
    //  187  368:getfield        #171 <Field Rect mDrawRect>
    //  188  371:getfield        #236 <Field int Rect.bottom>
    //  189  374:aload_3         
    //  190  375:getfield        #234 <Field int Rect.right>
    //  191  378:aload_3         
    //  192  379:getfield        #236 <Field int Rect.bottom>
    //  193  382:invokespecial   #114 <Method void Rect(int, int, int, int)>
    //  194  385:astore          5
    //  195  387:aload           5
    //  196  389:invokevirtual   #174 <Method int Rect.width()>
    //  197  392:ifle            424
    //  198  395:aload           5
    //  199  397:invokevirtual   #177 <Method int Rect.height()>
    //  200  400:ifle            424
    //  201  403:aload_0         
    //  202  404:invokevirtual   #158 <Method boolean hasFocus()>
    //  203  407:ifeq            588
    //  204  410:aload_0         
    //  205  411:getfield        #70  <Field Paint mFocusPaint>
    //  206  414:astore          25
    //  207  416:aload_1         
    //  208  417:aload           5
    //  209  419:aload           25
    //  210  421:invokevirtual   #205 <Method void Canvas.drawRect(Rect, Paint)>
    //  211  424:new             #105 <Class Rect>
    //  212  427:dup             
    //  213  428:aload_3         
    //  214  429:getfield        #179 <Field int Rect.left>
    //  215  432:aload           4
    //  216  434:getfield        #236 <Field int Rect.bottom>
    //  217  437:aload_0         
    //  218  438:getfield        #171 <Field Rect mDrawRect>
    //  219  441:getfield        #179 <Field int Rect.left>
    //  220  444:aload           5
    //  221  446:getfield        #181 <Field int Rect.top>
    //  222  449:invokespecial   #114 <Method void Rect(int, int, int, int)>
    //  223  452:astore          6
    //  224  454:aload           6
    //  225  456:invokevirtual   #174 <Method int Rect.width()>
    //  226  459:ifle            491
    //  227  462:aload           6
    //  228  464:invokevirtual   #177 <Method int Rect.height()>
    //  229  467:ifle            491
    //  230  470:aload_0         
    //  231  471:invokevirtual   #158 <Method boolean hasFocus()>
    //  232  474:ifeq            597
    //  233  477:aload_0         
    //  234  478:getfield        #70  <Field Paint mFocusPaint>
    //  235  481:astore          24
    //  236  483:aload_1         
    //  237  484:aload           6
    //  238  486:aload           24
    //  239  488:invokevirtual   #205 <Method void Canvas.drawRect(Rect, Paint)>
    //  240  491:new             #105 <Class Rect>
    //  241  494:dup             
    //  242  495:aload_0         
    //  243  496:getfield        #171 <Field Rect mDrawRect>
    //  244  499:getfield        #234 <Field int Rect.right>
    //  245  502:aload           4
    //  246  504:getfield        #236 <Field int Rect.bottom>
    //  247  507:aload_3         
    //  248  508:getfield        #234 <Field int Rect.right>
    //  249  511:aload           5
    //  250  513:getfield        #181 <Field int Rect.top>
    //  251  516:invokespecial   #114 <Method void Rect(int, int, int, int)>
    //  252  519:astore          7
    //  253  521:aload           7
    //  254  523:invokevirtual   #174 <Method int Rect.width()>
    //  255  526:ifle            558
    //  256  529:aload           7
    //  257  531:invokevirtual   #177 <Method int Rect.height()>
    //  258  534:ifle            558
    //  259  537:aload_0         
    //  260  538:invokevirtual   #158 <Method boolean hasFocus()>
    //  261  541:ifeq            606
    //  262  544:aload_0         
    //  263  545:getfield        #70  <Field Paint mFocusPaint>
    //  264  548:astore          23
    //  265  550:aload_1         
    //  266  551:aload           7
    //  267  553:aload           23
    //  268  555:invokevirtual   #205 <Method void Canvas.drawRect(Rect, Paint)>
    //  269  558:aload_2         
    //  270  559:new             #78  <Class RectF>
    //  271  562:dup             
    //  272  563:aload_0         
    //  273  564:getfield        #171 <Field Rect mDrawRect>
    //  274  567:invokespecial   #238 <Method void RectF(Rect)>
    //  275  570:getstatic       #187 <Field android.graphics.Path$Direction android.graphics.Path$Direction.CW>
    //  276  573:invokevirtual   #242 <Method void Path.addRect(RectF, android.graphics.Path$Direction)>
    //  277  576:goto            141
    //  278  579:aload_0         
    //  279  580:getfield        #72  <Field Paint mNoFocusPaint>
    //  280  583:astore          26
    //  281  585:goto            351
    //  282  588:aload_0         
    //  283  589:getfield        #72  <Field Paint mNoFocusPaint>
    //  284  592:astore          25
    //  285  594:goto            416
    //  286  597:aload_0         
    //  287  598:getfield        #72  <Field Paint mNoFocusPaint>
    //  288  601:astore          24
    //  289  603:goto            483
    //  290  606:aload_0         
    //  291  607:getfield        #72  <Field Paint mNoFocusPaint>
    //  292  610:astore          23
    //  293  612:goto            550
    //  294  615:iconst_1        
    //  295  616:aload_0         
    //  296  617:getfield        #171 <Field Rect mDrawRect>
    //  297  620:getfield        #179 <Field int Rect.left>
    //  298  623:iadd            
    //  299  624:istore          8
    //  300  626:iconst_1        
    //  301  627:aload_0         
    //  302  628:getfield        #171 <Field Rect mDrawRect>
    //  303  631:getfield        #234 <Field int Rect.right>
    //  304  634:iadd            
    //  305  635:istore          9
    //  306  637:iconst_4        
    //  307  638:aload_0         
    //  308  639:getfield        #171 <Field Rect mDrawRect>
    //  309  642:getfield        #181 <Field int Rect.top>
    //  310  645:iadd            
    //  311  646:istore          10
    //  312  648:iconst_3        
    //  313  649:aload_0         
    //  314  650:getfield        #171 <Field Rect mDrawRect>
    //  315  653:getfield        #236 <Field int Rect.bottom>
    //  316  656:iadd            
    //  317  657:istore          11
    //  318  659:aload_0         
    //  319  660:getfield        #130 <Field Drawable mResizeDrawableWidth>
    //  320  663:invokevirtual   #213 <Method int Drawable.getIntrinsicWidth()>
    //  321  666:iconst_2        
    //  322  667:idiv            
    //  323  668:istore          12
    //  324  670:aload_0         
    //  325  671:getfield        #130 <Field Drawable mResizeDrawableWidth>
    //  326  674:invokevirtual   #216 <Method int Drawable.getIntrinsicHeight()>
    //  327  677:iconst_2        
    //  328  678:idiv            
    //  329  679:istore          13
    //  330  681:aload_0         
    //  331  682:getfield        #133 <Field Drawable mResizeDrawableHeight>
    //  332  685:invokevirtual   #216 <Method int Drawable.getIntrinsicHeight()>
    //  333  688:iconst_2        
    //  334  689:idiv            
    //  335  690:istore          14
    //  336  692:aload_0         
    //  337  693:getfield        #133 <Field Drawable mResizeDrawableHeight>
    //  338  696:invokevirtual   #213 <Method int Drawable.getIntrinsicWidth()>
    //  339  699:iconst_2        
    //  340  700:idiv            
    //  341  701:istore          15
    //  342  703:aload_0         
    //  343  704:getfield        #171 <Field Rect mDrawRect>
    //  344  707:getfield        #179 <Field int Rect.left>
    //  345  710:aload_0         
    //  346  711:getfield        #171 <Field Rect mDrawRect>
    //  347  714:getfield        #234 <Field int Rect.right>
    //  348  717:aload_0         
    //  349  718:getfield        #171 <Field Rect mDrawRect>
    //  350  721:getfield        #179 <Field int Rect.left>
    //  351  724:isub            
    //  352  725:iconst_2        
    //  353  726:idiv            
    //  354  727:iadd            
    //  355  728:istore          16
    //  356  730:aload_0         
    //  357  731:getfield        #171 <Field Rect mDrawRect>
    //  358  734:getfield        #181 <Field int Rect.top>
    //  359  737:aload_0         
    //  360  738:getfield        #171 <Field Rect mDrawRect>
    //  361  741:getfield        #236 <Field int Rect.bottom>
    //  362  744:aload_0         
    //  363  745:getfield        #171 <Field Rect mDrawRect>
    //  364  748:getfield        #181 <Field int Rect.top>
    //  365  751:isub            
    //  366  752:iconst_2        
    //  367  753:idiv            
    //  368  754:iadd            
    //  369  755:istore          17
    //  370  757:aload_0         
    //  371  758:getfield        #130 <Field Drawable mResizeDrawableWidth>
    //  372  761:iload           8
    //  373  763:iload           12
    //  374  765:isub            
    //  375  766:iload           17
    //  376  768:iload           13
    //  377  770:isub            
    //  378  771:iload           8
    //  379  773:iload           12
    //  380  775:iadd            
    //  381  776:iload           17
    //  382  778:iload           13
    //  383  780:iadd            
    //  384  781:invokevirtual   #230 <Method void Drawable.setBounds(int, int, int, int)>
    //  385  784:aload_0         
    //  386  785:getfield        #130 <Field Drawable mResizeDrawableWidth>
    //  387  788:aload_1         
    //  388  789:invokevirtual   #232 <Method void Drawable.draw(Canvas)>
    //  389  792:aload_0         
    //  390  793:getfield        #130 <Field Drawable mResizeDrawableWidth>
    //  391  796:iload           9
    //  392  798:iload           12
    //  393  800:isub            
    //  394  801:iload           17
    //  395  803:iload           13
    //  396  805:isub            
    //  397  806:iload           9
    //  398  808:iload           12
    //  399  810:iadd            
    //  400  811:iload           17
    //  401  813:iload           13
    //  402  815:iadd            
    //  403  816:invokevirtual   #230 <Method void Drawable.setBounds(int, int, int, int)>
    //  404  819:aload_0         
    //  405  820:getfield        #130 <Field Drawable mResizeDrawableWidth>
    //  406  823:aload_1         
    //  407  824:invokevirtual   #232 <Method void Drawable.draw(Canvas)>
    //  408  827:aload_0         
    //  409  828:getfield        #133 <Field Drawable mResizeDrawableHeight>
    //  410  831:iload           16
    //  411  833:iload           15
    //  412  835:isub            
    //  413  836:iload           10
    //  414  838:iload           14
    //  415  840:isub            
    //  416  841:iload           16
    //  417  843:iload           15
    //  418  845:iadd            
    //  419  846:iload           10
    //  420  848:iload           14
    //  421  850:iadd            
    //  422  851:invokevirtual   #230 <Method void Drawable.setBounds(int, int, int, int)>
    //  423  854:aload_0         
    //  424  855:getfield        #133 <Field Drawable mResizeDrawableHeight>
    //  425  858:aload_1         
    //  426  859:invokevirtual   #232 <Method void Drawable.draw(Canvas)>
    //  427  862:aload_0         
    //  428  863:getfield        #133 <Field Drawable mResizeDrawableHeight>
    //  429  866:iload           16
    //  430  868:iload           15
    //  431  870:isub            
    //  432  871:iload           11
    //  433  873:iload           14
    //  434  875:isub            
    //  435  876:iload           16
    //  436  878:iload           15
    //  437  880:iadd            
    //  438  881:iload           11
    //  439  883:iload           14
    //  440  885:iadd            
    //  441  886:invokevirtual   #230 <Method void Drawable.setBounds(int, int, int, int)>
    //  442  889:aload_0         
    //  443  890:getfield        #133 <Field Drawable mResizeDrawableHeight>
    //  444  893:aload_1         
    //  445  894:invokevirtual   #232 <Method void Drawable.draw(Canvas)>
    //  446  897:aload_1         
    //  447  898:aload_0         
    //  448  899:getfield        #147 <Field Bitmap mCornerResizeBitmap>
    //  449  902:iload           9
    //  450  904:iload           15
    //  451  906:isub            
    //  452  907:i2f             
    //  453  908:iload           11
    //  454  910:iload           15
    //  455  912:isub            
    //  456  913:i2f             
    //  457  914:aconst_null     
    //  458  915:invokevirtual   #246 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
    //  459  918:return          
    }

    public Rect getCropRect()
    {
    //    0    0:new             #105 <Class Rect>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:getfield        #80  <Field RectF mCropRect>
    //    4    8:getfield        #83  <Field float RectF.left>
    //    5   11:f2i             
    //    6   12:aload_0         
    //    7   13:getfield        #80  <Field RectF mCropRect>
    //    8   16:getfield        #86  <Field float RectF.top>
    //    9   19:f2i             
    //   10   20:aload_0         
    //   11   21:getfield        #80  <Field RectF mCropRect>
    //   12   24:getfield        #89  <Field float RectF.right>
    //   13   27:f2i             
    //   14   28:aload_0         
    //   15   29:getfield        #80  <Field RectF mCropRect>
    //   16   32:getfield        #92  <Field float RectF.bottom>
    //   17   35:f2i             
    //   18   36:invokespecial   #114 <Method void Rect(int, int, int, int)>
    //   19   39:areturn         
    }

    public int getHit(float f, float f1)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #251 <Method Rect computeLayout()>
    //    2    4:astore_3        
    //    3    5:iconst_1        
    //    4    6:istore          4
    //    5    8:aload_0         
    //    6    9:getfield        #65  <Field boolean mCircle>
    //    7   12:ifeq            132
    //    8   15:fload_1         
    //    9   16:aload_3         
    //   10   17:invokevirtual   #254 <Method int Rect.centerX()>
    //   11   20:i2f             
    //   12   21:fsub            
    //   13   22:fstore          7
    //   14   24:fload_2         
    //   15   25:aload_3         
    //   16   26:invokevirtual   #257 <Method int Rect.centerY()>
    //   17   29:i2f             
    //   18   30:fsub            
    //   19   31:fstore          8
    //   20   33:fload           7
    //   21   35:fload           7
    //   22   37:fmul            
    //   23   38:fload           8
    //   24   40:fload           8
    //   25   42:fmul            
    //   26   43:fadd            
    //   27   44:f2d             
    //   28   45:invokestatic    #260 <Method double Math.sqrt(double)>
    //   29   48:d2i             
    //   30   49:istore          9
    //   31   51:aload_0         
    //   32   52:getfield        #171 <Field Rect mDrawRect>
    //   33   55:invokevirtual   #174 <Method int Rect.width()>
    //   34   58:iconst_2        
    //   35   59:idiv            
    //   36   60:istore          10
    //   37   62:iload           9
    //   38   64:iload           10
    //   39   66:isub            
    //   40   67:invokestatic    #264 <Method int Math.abs(int)>
    //   41   70:i2f             
    //   42   71:ldc2            #265 <Float 20F>
    //   43   74:fcmpg           
    //   44   75:ifgt            120
    //   45   78:fload           8
    //   46   80:invokestatic    #268 <Method float Math.abs(float)>
    //   47   83:fload           7
    //   48   85:invokestatic    #268 <Method float Math.abs(float)>
    //   49   88:fcmpl           
    //   50   89:ifle            109
    //   51   92:fload           8
    //   52   94:fconst_0        
    //   53   95:fcmpg           
    //   54   96:ifge            106
    //   55   99:bipush          8
    //   56  101:istore          4
    //   57  103:iload           4
    //   58  105:ireturn         
    //   59  106:bipush          16
    //   60  108:ireturn         
    //   61  109:fload           7
    //   62  111:fconst_0        
    //   63  112:fcmpg           
    //   64  113:ifge            118
    //   65  116:iconst_2        
    //   66  117:ireturn         
    //   67  118:iconst_4        
    //   68  119:ireturn         
    //   69  120:iload           9
    //   70  122:iload           10
    //   71  124:icmpge          130
    //   72  127:bipush          32
    //   73  129:ireturn         
    //   74  130:iconst_1        
    //   75  131:ireturn         
    //   76  132:fload_2         
    //   77  133:aload_3         
    //   78  134:getfield        #181 <Field int Rect.top>
    //   79  137:i2f             
    //   80  138:ldc2            #265 <Float 20F>
    //   81  141:fsub            
    //   82  142:fcmpl           
    //   83  143:iflt            328
    //   84  146:fload_2         
    //   85  147:ldc2            #265 <Float 20F>
    //   86  150:aload_3         
    //   87  151:getfield        #236 <Field int Rect.bottom>
    //   88  154:i2f             
    //   89  155:fadd            
    //   90  156:fcmpg           
    //   91  157:ifge            328
    //   92  160:iconst_1        
    //   93  161:istore          5
    //   94  163:fload_1         
    //   95  164:aload_3         
    //   96  165:getfield        #179 <Field int Rect.left>
    //   97  168:i2f             
    //   98  169:ldc2            #265 <Float 20F>
    //   99  172:fsub            
    //  100  173:fcmpl           
    //  101  174:iflt            334
    //  102  177:fload_1         
    //  103  178:ldc2            #265 <Float 20F>
    //  104  181:aload_3         
    //  105  182:getfield        #234 <Field int Rect.right>
    //  106  185:i2f             
    //  107  186:fadd            
    //  108  187:fcmpg           
    //  109  188:ifge            334
    //  110  191:iconst_1        
    //  111  192:istore          6
    //  112  194:aload_3         
    //  113  195:getfield        #179 <Field int Rect.left>
    //  114  198:i2f             
    //  115  199:fload_1         
    //  116  200:fsub            
    //  117  201:invokestatic    #268 <Method float Math.abs(float)>
    //  118  204:ldc2            #265 <Float 20F>
    //  119  207:fcmpg           
    //  120  208:ifge            222
    //  121  211:iload           5
    //  122  213:ifeq            222
    //  123  216:iload           4
    //  124  218:iconst_2        
    //  125  219:ior             
    //  126  220:istore          4
    //  127  222:aload_3         
    //  128  223:getfield        #234 <Field int Rect.right>
    //  129  226:i2f             
    //  130  227:fload_1         
    //  131  228:fsub            
    //  132  229:invokestatic    #268 <Method float Math.abs(float)>
    //  133  232:ldc2            #265 <Float 20F>
    //  134  235:fcmpg           
    //  135  236:ifge            250
    //  136  239:iload           5
    //  137  241:ifeq            250
    //  138  244:iload           4
    //  139  246:iconst_4        
    //  140  247:ior             
    //  141  248:istore          4
    //  142  250:aload_3         
    //  143  251:getfield        #181 <Field int Rect.top>
    //  144  254:i2f             
    //  145  255:fload_2         
    //  146  256:fsub            
    //  147  257:invokestatic    #268 <Method float Math.abs(float)>
    //  148  260:ldc2            #265 <Float 20F>
    //  149  263:fcmpg           
    //  150  264:ifge            279
    //  151  267:iload           6
    //  152  269:ifeq            279
    //  153  272:iload           4
    //  154  274:bipush          8
    //  155  276:ior             
    //  156  277:istore          4
    //  157  279:aload_3         
    //  158  280:getfield        #236 <Field int Rect.bottom>
    //  159  283:i2f             
    //  160  284:fload_2         
    //  161  285:fsub            
    //  162  286:invokestatic    #268 <Method float Math.abs(float)>
    //  163  289:ldc2            #265 <Float 20F>
    //  164  292:fcmpg           
    //  165  293:ifge            308
    //  166  296:iload           6
    //  167  298:ifeq            308
    //  168  301:iload           4
    //  169  303:bipush          16
    //  170  305:ior             
    //  171  306:istore          4
    //  172  308:iload           4
    //  173  310:iconst_1        
    //  174  311:icmpne          103
    //  175  314:aload_3         
    //  176  315:fload_1         
    //  177  316:f2i             
    //  178  317:fload_2         
    //  179  318:f2i             
    //  180  319:invokevirtual   #272 <Method boolean Rect.contains(int, int)>
    //  181  322:ifeq            103
    //  182  325:bipush          32
    //  183  327:ireturn         
    //  184  328:iconst_0        
    //  185  329:istore          5
    //  186  331:goto            163
    //  187  334:iconst_0        
    //  188  335:istore          6
    //  189  337:goto            194
    }

    public ModifyMode getMode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #61  <Field HighlightView$ModifyMode mMode>
    //    2    4:areturn         
    }

    void growBy(float f, float f1)
    {
    //    0    0:ldc2            #277 <Float 25F>
    //    1    3:fstore_3        
    //    2    4:aload_0         
    //    3    5:getfield        #63  <Field boolean mMaintainAspectRatio>
    //    4    8:ifeq            24
    //    5   11:fload_1         
    //    6   12:fconst_0        
    //    7   13:fcmpl           
    //    8   14:ifeq            319
    //    9   17:fload_1         
    //   10   18:aload_0         
    //   11   19:getfield        #279 <Field float mInitialAspectRatio>
    //   12   22:fdiv            
    //   13   23:fstore_2        
    //   14   24:new             #78  <Class RectF>
    //   15   27:dup             
    //   16   28:aload_0         
    //   17   29:getfield        #80  <Field RectF mCropRect>
    //   18   32:invokespecial   #282 <Method void RectF(RectF)>
    //   19   35:astore          4
    //   20   37:fload_1         
    //   21   38:fconst_0        
    //   22   39:fcmpl           
    //   23   40:ifle            93
    //   24   43:aload           4
    //   25   45:invokevirtual   #285 <Method float RectF.width()>
    //   26   48:fconst_2        
    //   27   49:fload_1         
    //   28   50:fmul            
    //   29   51:fadd            
    //   30   52:aload_0         
    //   31   53:getfield        #287 <Field RectF mImageRect>
    //   32   56:invokevirtual   #285 <Method float RectF.width()>
    //   33   59:fcmpl           
    //   34   60:ifle            93
    //   35   63:aload_0         
    //   36   64:getfield        #287 <Field RectF mImageRect>
    //   37   67:invokevirtual   #285 <Method float RectF.width()>
    //   38   70:aload           4
    //   39   72:invokevirtual   #285 <Method float RectF.width()>
    //   40   75:fsub            
    //   41   76:fconst_2        
    //   42   77:fdiv            
    //   43   78:fstore_1        
    //   44   79:aload_0         
    //   45   80:getfield        #63  <Field boolean mMaintainAspectRatio>
    //   46   83:ifeq            93
    //   47   86:fload_1         
    //   48   87:aload_0         
    //   49   88:getfield        #279 <Field float mInitialAspectRatio>
    //   50   91:fdiv            
    //   51   92:fstore_2        
    //   52   93:fload_2         
    //   53   94:fconst_0        
    //   54   95:fcmpl           
    //   55   96:ifle            149
    //   56   99:aload           4
    //   57  101:invokevirtual   #289 <Method float RectF.height()>
    //   58  104:fconst_2        
    //   59  105:fload_2         
    //   60  106:fmul            
    //   61  107:fadd            
    //   62  108:aload_0         
    //   63  109:getfield        #287 <Field RectF mImageRect>
    //   64  112:invokevirtual   #289 <Method float RectF.height()>
    //   65  115:fcmpl           
    //   66  116:ifle            149
    //   67  119:aload_0         
    //   68  120:getfield        #287 <Field RectF mImageRect>
    //   69  123:invokevirtual   #289 <Method float RectF.height()>
    //   70  126:aload           4
    //   71  128:invokevirtual   #289 <Method float RectF.height()>
    //   72  131:fsub            
    //   73  132:fconst_2        
    //   74  133:fdiv            
    //   75  134:fstore_2        
    //   76  135:aload_0         
    //   77  136:getfield        #63  <Field boolean mMaintainAspectRatio>
    //   78  139:ifeq            149
    //   79  142:fload_2         
    //   80  143:aload_0         
    //   81  144:getfield        #279 <Field float mInitialAspectRatio>
    //   82  147:fmul            
    //   83  148:fstore_1        
    //   84  149:aload           4
    //   85  151:fload_1         
    //   86  152:fneg            
    //   87  153:fload_2         
    //   88  154:fneg            
    //   89  155:invokevirtual   #292 <Method void RectF.inset(float, float)>
    //   90  158:aload           4
    //   91  160:invokevirtual   #285 <Method float RectF.width()>
    //   92  163:fload_3         
    //   93  164:fcmpg           
    //   94  165:ifge            184
    //   95  168:aload           4
    //   96  170:fload_3         
    //   97  171:aload           4
    //   98  173:invokevirtual   #285 <Method float RectF.width()>
    //   99  176:fsub            
    //  100  177:fneg            
    //  101  178:fconst_2        
    //  102  179:fdiv            
    //  103  180:fconst_0        
    //  104  181:invokevirtual   #292 <Method void RectF.inset(float, float)>
    //  105  184:aload_0         
    //  106  185:getfield        #63  <Field boolean mMaintainAspectRatio>
    //  107  188:ifeq            198
    //  108  191:fload_3         
    //  109  192:aload_0         
    //  110  193:getfield        #279 <Field float mInitialAspectRatio>
    //  111  196:fdiv            
    //  112  197:fstore_3        
    //  113  198:aload           4
    //  114  200:invokevirtual   #289 <Method float RectF.height()>
    //  115  203:fload_3         
    //  116  204:fcmpg           
    //  117  205:ifge            224
    //  118  208:aload           4
    //  119  210:fconst_0        
    //  120  211:fload_3         
    //  121  212:aload           4
    //  122  214:invokevirtual   #289 <Method float RectF.height()>
    //  123  217:fsub            
    //  124  218:fneg            
    //  125  219:fconst_2        
    //  126  220:fdiv            
    //  127  221:invokevirtual   #292 <Method void RectF.inset(float, float)>
    //  128  224:aload           4
    //  129  226:getfield        #83  <Field float RectF.left>
    //  130  229:aload_0         
    //  131  230:getfield        #287 <Field RectF mImageRect>
    //  132  233:getfield        #83  <Field float RectF.left>
    //  133  236:fcmpg           
    //  134  237:ifge            335
    //  135  240:aload           4
    //  136  242:aload_0         
    //  137  243:getfield        #287 <Field RectF mImageRect>
    //  138  246:getfield        #83  <Field float RectF.left>
    //  139  249:aload           4
    //  140  251:getfield        #83  <Field float RectF.left>
    //  141  254:fsub            
    //  142  255:fconst_0        
    //  143  256:invokevirtual   #295 <Method void RectF.offset(float, float)>
    //  144  259:aload           4
    //  145  261:getfield        #86  <Field float RectF.top>
    //  146  264:aload_0         
    //  147  265:getfield        #287 <Field RectF mImageRect>
    //  148  268:getfield        #86  <Field float RectF.top>
    //  149  271:fcmpg           
    //  150  272:ifge            374
    //  151  275:aload           4
    //  152  277:fconst_0        
    //  153  278:aload_0         
    //  154  279:getfield        #287 <Field RectF mImageRect>
    //  155  282:getfield        #86  <Field float RectF.top>
    //  156  285:aload           4
    //  157  287:getfield        #86  <Field float RectF.top>
    //  158  290:fsub            
    //  159  291:invokevirtual   #295 <Method void RectF.offset(float, float)>
    //  160  294:aload_0         
    //  161  295:getfield        #80  <Field RectF mCropRect>
    //  162  298:aload           4
    //  163  300:invokevirtual   #298 <Method void RectF.set(RectF)>
    //  164  303:aload_0         
    //  165  304:aload_0         
    //  166  305:invokespecial   #251 <Method Rect computeLayout()>
    //  167  308:putfield        #171 <Field Rect mDrawRect>
    //  168  311:aload_0         
    //  169  312:getfield        #74  <Field View mContext>
    //  170  315:invokevirtual   #301 <Method void View.invalidate()>
    //  171  318:return          
    //  172  319:fload_2         
    //  173  320:fconst_0        
    //  174  321:fcmpl           
    //  175  322:ifeq            24
    //  176  325:fload_2         
    //  177  326:aload_0         
    //  178  327:getfield        #279 <Field float mInitialAspectRatio>
    //  179  330:fmul            
    //  180  331:fstore_1        
    //  181  332:goto            24
    //  182  335:aload           4
    //  183  337:getfield        #89  <Field float RectF.right>
    //  184  340:aload_0         
    //  185  341:getfield        #287 <Field RectF mImageRect>
    //  186  344:getfield        #89  <Field float RectF.right>
    //  187  347:fcmpl           
    //  188  348:ifle            259
    //  189  351:aload           4
    //  190  353:aload           4
    //  191  355:getfield        #89  <Field float RectF.right>
    //  192  358:aload_0         
    //  193  359:getfield        #287 <Field RectF mImageRect>
    //  194  362:getfield        #89  <Field float RectF.right>
    //  195  365:fsub            
    //  196  366:fneg            
    //  197  367:fconst_0        
    //  198  368:invokevirtual   #295 <Method void RectF.offset(float, float)>
    //  199  371:goto            259
    //  200  374:aload           4
    //  201  376:getfield        #92  <Field float RectF.bottom>
    //  202  379:aload_0         
    //  203  380:getfield        #287 <Field RectF mImageRect>
    //  204  383:getfield        #92  <Field float RectF.bottom>
    //  205  386:fcmpl           
    //  206  387:ifle            294
    //  207  390:aload           4
    //  208  392:fconst_0        
    //  209  393:aload           4
    //  210  395:getfield        #92  <Field float RectF.bottom>
    //  211  398:aload_0         
    //  212  399:getfield        #287 <Field RectF mImageRect>
    //  213  402:getfield        #92  <Field float RectF.bottom>
    //  214  405:fsub            
    //  215  406:fneg            
    //  216  407:invokevirtual   #295 <Method void RectF.offset(float, float)>
    //  217  410:goto            294
    }

    void handleMotion(int i, float f, float f1)
    {
    //    0    0:iconst_m1       
    //    1    1:istore          4
    //    2    3:aload_0         
    //    3    4:invokespecial   #251 <Method Rect computeLayout()>
    //    4    7:astore          5
    //    5    9:iload_1         
    //    6   10:iconst_1        
    //    7   11:icmpne          15
    //    8   14:return          
    //    9   15:iload_1         
    //   10   16:bipush          32
    //   11   18:icmpne          58
    //   12   21:aload_0         
    //   13   22:fload_2         
    //   14   23:aload_0         
    //   15   24:getfield        #80  <Field RectF mCropRect>
    //   16   27:invokevirtual   #285 <Method float RectF.width()>
    //   17   30:aload           5
    //   18   32:invokevirtual   #174 <Method int Rect.width()>
    //   19   35:i2f             
    //   20   36:fdiv            
    //   21   37:fmul            
    //   22   38:fload_3         
    //   23   39:aload_0         
    //   24   40:getfield        #80  <Field RectF mCropRect>
    //   25   43:invokevirtual   #289 <Method float RectF.height()>
    //   26   46:aload           5
    //   27   48:invokevirtual   #177 <Method int Rect.height()>
    //   28   51:i2f             
    //   29   52:fdiv            
    //   30   53:fmul            
    //   31   54:invokevirtual   #306 <Method void moveBy(float, float)>
    //   32   57:return          
    //   33   58:iload_1         
    //   34   59:bipush          6
    //   35   61:iand            
    //   36   62:ifne            67
    //   37   65:fconst_0        
    //   38   66:fstore_2        
    //   39   67:iload_1         
    //   40   68:bipush          24
    //   41   70:iand            
    //   42   71:ifne            76
    //   43   74:fconst_0        
    //   44   75:fstore_3        
    //   45   76:fload_2         
    //   46   77:aload_0         
    //   47   78:getfield        #80  <Field RectF mCropRect>
    //   48   81:invokevirtual   #285 <Method float RectF.width()>
    //   49   84:aload           5
    //   50   86:invokevirtual   #174 <Method int Rect.width()>
    //   51   89:i2f             
    //   52   90:fdiv            
    //   53   91:fmul            
    //   54   92:fstore          6
    //   55   94:fload_3         
    //   56   95:aload_0         
    //   57   96:getfield        #80  <Field RectF mCropRect>
    //   58   99:invokevirtual   #289 <Method float RectF.height()>
    //   59  102:aload           5
    //   60  104:invokevirtual   #177 <Method int Rect.height()>
    //   61  107:i2f             
    //   62  108:fdiv            
    //   63  109:fmul            
    //   64  110:fstore          7
    //   65  112:iload_1         
    //   66  113:iconst_2        
    //   67  114:iand            
    //   68  115:ifeq            150
    //   69  118:iload           4
    //   70  120:istore          8
    //   71  122:fload           6
    //   72  124:iload           8
    //   73  126:i2f             
    //   74  127:fmul            
    //   75  128:fstore          9
    //   76  130:iload_1         
    //   77  131:bipush          8
    //   78  133:iand            
    //   79  134:ifeq            156
    //   80  137:aload_0         
    //   81  138:fload           9
    //   82  140:fload           7
    //   83  142:iload           4
    //   84  144:i2f             
    //   85  145:fmul            
    //   86  146:invokevirtual   #308 <Method void growBy(float, float)>
    //   87  149:return          
    //   88  150:iconst_1        
    //   89  151:istore          8
    //   90  153:goto            122
    //   91  156:iconst_1        
    //   92  157:istore          4
    //   93  159:goto            137
    }

    public boolean hasFocus()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #310 <Field boolean mIsFocused>
    //    2    4:ireturn         
    }

    public void invalidate()
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokespecial   #251 <Method Rect computeLayout()>
    //    3    5:putfield        #171 <Field Rect mDrawRect>
    //    4    8:return          
    }

    void moveBy(float f, float f1)
    {
    //    0    0:new             #105 <Class Rect>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:getfield        #171 <Field Rect mDrawRect>
    //    4    8:invokespecial   #311 <Method void Rect(Rect)>
    //    5   11:astore_3        
    //    6   12:aload_0         
    //    7   13:getfield        #80  <Field RectF mCropRect>
    //    8   16:fload_1         
    //    9   17:fload_2         
    //   10   18:invokevirtual   #295 <Method void RectF.offset(float, float)>
    //   11   21:aload_0         
    //   12   22:getfield        #80  <Field RectF mCropRect>
    //   13   25:fconst_0        
    //   14   26:aload_0         
    //   15   27:getfield        #287 <Field RectF mImageRect>
    //   16   30:getfield        #83  <Field float RectF.left>
    //   17   33:aload_0         
    //   18   34:getfield        #80  <Field RectF mCropRect>
    //   19   37:getfield        #83  <Field float RectF.left>
    //   20   40:fsub            
    //   21   41:invokestatic    #315 <Method float Math.max(float, float)>
    //   22   44:fconst_0        
    //   23   45:aload_0         
    //   24   46:getfield        #287 <Field RectF mImageRect>
    //   25   49:getfield        #86  <Field float RectF.top>
    //   26   52:aload_0         
    //   27   53:getfield        #80  <Field RectF mCropRect>
    //   28   56:getfield        #86  <Field float RectF.top>
    //   29   59:fsub            
    //   30   60:invokestatic    #315 <Method float Math.max(float, float)>
    //   31   63:invokevirtual   #295 <Method void RectF.offset(float, float)>
    //   32   66:aload_0         
    //   33   67:getfield        #80  <Field RectF mCropRect>
    //   34   70:fconst_0        
    //   35   71:aload_0         
    //   36   72:getfield        #287 <Field RectF mImageRect>
    //   37   75:getfield        #89  <Field float RectF.right>
    //   38   78:aload_0         
    //   39   79:getfield        #80  <Field RectF mCropRect>
    //   40   82:getfield        #89  <Field float RectF.right>
    //   41   85:fsub            
    //   42   86:invokestatic    #318 <Method float Math.min(float, float)>
    //   43   89:fconst_0        
    //   44   90:aload_0         
    //   45   91:getfield        #287 <Field RectF mImageRect>
    //   46   94:getfield        #92  <Field float RectF.bottom>
    //   47   97:aload_0         
    //   48   98:getfield        #80  <Field RectF mCropRect>
    //   49  101:getfield        #92  <Field float RectF.bottom>
    //   50  104:fsub            
    //   51  105:invokestatic    #318 <Method float Math.min(float, float)>
    //   52  108:invokevirtual   #295 <Method void RectF.offset(float, float)>
    //   53  111:aload_0         
    //   54  112:aload_0         
    //   55  113:invokespecial   #251 <Method Rect computeLayout()>
    //   56  116:putfield        #171 <Field Rect mDrawRect>
    //   57  119:aload_3         
    //   58  120:aload_0         
    //   59  121:getfield        #171 <Field Rect mDrawRect>
    //   60  124:invokevirtual   #321 <Method void Rect.union(Rect)>
    //   61  127:aload_3         
    //   62  128:bipush          -10
    //   63  130:bipush          -10
    //   64  132:invokevirtual   #324 <Method void Rect.inset(int, int)>
    //   65  135:aload_0         
    //   66  136:getfield        #74  <Field View mContext>
    //   67  139:aload_3         
    //   68  140:invokevirtual   #326 <Method void View.invalidate(Rect)>
    //   69  143:return          
    }

    public void setFocus(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #310 <Field boolean mIsFocused>
    //    3    5:return          
    }

    public void setHidden(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #151 <Field boolean mHidden>
    //    3    5:return          
    }

    public void setMode(ModifyMode modifymode)
    {
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #61  <Field HighlightView$ModifyMode mMode>
    //    3    5:if_acmpeq       20
    //    4    8:aload_0         
    //    5    9:aload_1         
    //    6   10:putfield        #61  <Field HighlightView$ModifyMode mMode>
    //    7   13:aload_0         
    //    8   14:getfield        #74  <Field View mContext>
    //    9   17:invokevirtual   #301 <Method void View.invalidate()>
    //   10   20:return          
    }

    public void setup(Matrix matrix, Rect rect, RectF rectf, boolean flag, boolean flag1)
    {
    //    0    0:iload           4
    //    1    2:ifeq            8
    //    2    5:iconst_1        
    //    3    6:istore          5
    //    4    8:aload_0         
    //    5    9:new             #99  <Class Matrix>
    //    6   12:dup             
    //    7   13:aload_1         
    //    8   14:invokespecial   #336 <Method void Matrix(Matrix)>
    //    9   17:putfield        #97  <Field Matrix mMatrix>
    //   10   20:aload_0         
    //   11   21:aload_3         
    //   12   22:putfield        #80  <Field RectF mCropRect>
    //   13   25:aload_0         
    //   14   26:new             #78  <Class RectF>
    //   15   29:dup             
    //   16   30:aload_2         
    //   17   31:invokespecial   #238 <Method void RectF(Rect)>
    //   18   34:putfield        #287 <Field RectF mImageRect>
    //   19   37:aload_0         
    //   20   38:iload           5
    //   21   40:putfield        #63  <Field boolean mMaintainAspectRatio>
    //   22   43:aload_0         
    //   23   44:iload           4
    //   24   46:putfield        #65  <Field boolean mCircle>
    //   25   49:aload_0         
    //   26   50:aload_0         
    //   27   51:getfield        #80  <Field RectF mCropRect>
    //   28   54:invokevirtual   #285 <Method float RectF.width()>
    //   29   57:aload_0         
    //   30   58:getfield        #80  <Field RectF mCropRect>
    //   31   61:invokevirtual   #289 <Method float RectF.height()>
    //   32   64:fdiv            
    //   33   65:putfield        #279 <Field float mInitialAspectRatio>
    //   34   68:aload_0         
    //   35   69:aload_0         
    //   36   70:invokespecial   #251 <Method Rect computeLayout()>
    //   37   73:putfield        #171 <Field Rect mDrawRect>
    //   38   76:aload_0         
    //   39   77:getfield        #70  <Field Paint mFocusPaint>
    //   40   80:sipush          150
    //   41   83:bipush          50
    //   42   85:bipush          50
    //   43   87:bipush          50
    //   44   89:invokevirtual   #339 <Method void Paint.setARGB(int, int, int, int)>
    //   45   92:aload_0         
    //   46   93:getfield        #72  <Field Paint mNoFocusPaint>
    //   47   96:sipush          150
    //   48   99:bipush          50
    //   49  101:bipush          50
    //   50  103:bipush          50
    //   51  105:invokevirtual   #339 <Method void Paint.setARGB(int, int, int, int)>
    //   52  108:aload_0         
    //   53  109:getstatic       #59  <Field HighlightView$ModifyMode HighlightView$ModifyMode.None>
    //   54  112:putfield        #61  <Field HighlightView$ModifyMode mMode>
    //   55  115:aload_0         
    //   56  116:invokespecial   #341 <Method void init()>
    //   57  119:return          
    }

    public static final int GROW_BOTTOM_EDGE = 16;
    public static final int GROW_LEFT_EDGE = 2;
    public static final int GROW_NONE = 1;
    public static final int GROW_RIGHT_EDGE = 4;
    public static final int GROW_TOP_EDGE = 8;
    public static final int MOVE = 32;
    private static final String TAG = "HighlightView";
    private boolean mCircle;
    View mContext;
    private Drawable mCornerResize;
    private Bitmap mCornerResizeBitmap;
    RectF mCropRect;
    Rect mDrawRect;
    private final Paint mFocusPaint;
    boolean mHidden;
    private RectF mImageRect;
    private float mInitialAspectRatio;
    boolean mIsFocused;
    private boolean mMaintainAspectRatio;
    Matrix mMatrix;
    private ModifyMode mMode;
    private final Paint mNoFocusPaint;
    private Drawable mResizeDrawableDiagonal;
    private Drawable mResizeDrawableHeight;
    private Drawable mResizeDrawableWidth;
}
