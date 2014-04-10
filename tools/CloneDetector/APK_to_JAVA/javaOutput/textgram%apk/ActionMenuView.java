// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.*;
import android.support.v7.internal.widget.LinearLayoutICS;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuView, ActionMenuItemView, MenuBuilder, ActionMenuPresenter, 
//            MenuItemImpl

public class ActionMenuView extends LinearLayoutICS
    implements MenuBuilder.ItemInvoker, MenuView
{
    public static interface ActionMenuChildView
    {

        public abstract boolean needsDividerAfter();

        public abstract boolean needsDividerBefore();
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams
    {

        public LayoutParams(int i, int j)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #17  <Method void android.widget.LinearLayout$LayoutParams(int, int)>
        //    4    6:aload_0         
        //    5    7:iconst_0        
        //    6    8:putfield        #19  <Field boolean isOverflowButton>
        //    7   11:return          
        }

        public LayoutParams(int i, int j, boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #17  <Method void android.widget.LinearLayout$LayoutParams(int, int)>
        //    4    6:aload_0         
        //    5    7:iload_3         
        //    6    8:putfield        #19  <Field boolean isOverflowButton>
        //    7   11:return          
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:invokespecial   #23  <Method void android.widget.LinearLayout$LayoutParams(Context, AttributeSet)>
        //    4    6:return          
        }

        public LayoutParams(LayoutParams layoutparams)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #27  <Method void android.widget.LinearLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
        //    3    5:aload_0         
        //    4    6:aload_1         
        //    5    7:getfield        #19  <Field boolean isOverflowButton>
        //    6   10:putfield        #19  <Field boolean isOverflowButton>
        //    7   13:return          
        }

        public int cellsUsed;
        public boolean expandable;
        public boolean expanded;
        public int extraPixels;
        public boolean isOverflowButton;
        public boolean preventEdgeOffset;
    }


    public ActionMenuView(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #34  <Method void ActionMenuView(Context, AttributeSet)>
    //    4    6:return          
    }

    public ActionMenuView(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #35  <Method void LinearLayoutICS(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:iconst_0        
    //    6    8:invokevirtual   #39  <Method void setBaselineAligned(boolean)>
    //    7   11:aload_1         
    //    8   12:invokevirtual   #45  <Method Resources Context.getResources()>
    //    9   15:invokevirtual   #51  <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   10   18:getfield        #57  <Field float DisplayMetrics.density>
    //   11   21:fstore_3        
    //   12   22:aload_0         
    //   13   23:ldc1            #58  <Float 56F>
    //   14   25:fload_3         
    //   15   26:fmul            
    //   16   27:f2i             
    //   17   28:putfield        #60  <Field int mMinCellSize>
    //   18   31:aload_0         
    //   19   32:ldc1            #61  <Float 4F>
    //   20   34:fload_3         
    //   21   35:fmul            
    //   22   36:f2i             
    //   23   37:putfield        #63  <Field int mGeneratedItemPadding>
    //   24   40:aload_1         
    //   25   41:aload_2         
    //   26   42:getstatic       #69  <Field int[] android.support.v7.appcompat.R$styleable.ActionBar>
    //   27   45:getstatic       #74  <Field int android.support.v7.appcompat.R$attr.actionBarStyle>
    //   28   48:iconst_0        
    //   29   49:invokevirtual   #78  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
    //   30   52:astore          4
    //   31   54:aload_0         
    //   32   55:aload           4
    //   33   57:iconst_1        
    //   34   58:iconst_0        
    //   35   59:invokevirtual   #84  <Method int TypedArray.getDimensionPixelSize(int, int)>
    //   36   62:putfield        #86  <Field int mMaxItemHeight>
    //   37   65:aload           4
    //   38   67:invokevirtual   #90  <Method void TypedArray.recycle()>
    //   39   70:return          
    }

    static int measureChildForCells(View view, int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //    2    4:checkcast       #100 <Class ActionMenuView$LayoutParams>
    //    3    7:astore          5
    //    4    9:iload_3         
    //    5   10:invokestatic    #106 <Method int android.view.View$MeasureSpec.getSize(int)>
    //    6   13:iload           4
    //    7   15:isub            
    //    8   16:iload_3         
    //    9   17:invokestatic    #109 <Method int android.view.View$MeasureSpec.getMode(int)>
    //   10   20:invokestatic    #112 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   11   23:istore          6
    //   12   25:aload_0         
    //   13   26:instanceof      #114 <Class ActionMenuItemView>
    //   14   29:ifeq            172
    //   15   32:aload_0         
    //   16   33:checkcast       #114 <Class ActionMenuItemView>
    //   17   36:astore          7
    //   18   38:aload           7
    //   19   40:ifnull          178
    //   20   43:aload           7
    //   21   45:invokevirtual   #118 <Method boolean ActionMenuItemView.hasText()>
    //   22   48:ifeq            178
    //   23   51:iconst_1        
    //   24   52:istore          8
    //   25   54:iconst_0        
    //   26   55:istore          9
    //   27   57:iload_2         
    //   28   58:ifle            124
    //   29   61:iload           8
    //   30   63:ifeq            74
    //   31   66:iconst_0        
    //   32   67:istore          9
    //   33   69:iload_2         
    //   34   70:iconst_2        
    //   35   71:icmplt          124
    //   36   74:aload_0         
    //   37   75:iload_1         
    //   38   76:iload_2         
    //   39   77:imul            
    //   40   78:ldc1            #119 <Int 0x80000000>
    //   41   80:invokestatic    #112 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   42   83:iload           6
    //   43   85:invokevirtual   #123 <Method void View.measure(int, int)>
    //   44   88:aload_0         
    //   45   89:invokevirtual   #127 <Method int View.getMeasuredWidth()>
    //   46   92:istore          11
    //   47   94:iload           11
    //   48   96:iload_1         
    //   49   97:idiv            
    //   50   98:istore          9
    //   51  100:iload           11
    //   52  102:iload_1         
    //   53  103:irem            
    //   54  104:ifeq            110
    //   55  107:iinc            9  1
    //   56  110:iload           8
    //   57  112:ifeq            124
    //   58  115:iload           9
    //   59  117:iconst_2        
    //   60  118:icmpge          124
    //   61  121:iconst_2        
    //   62  122:istore          9
    //   63  124:aload           5
    //   64  126:getfield        #130 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
    //   65  129:ifne            184
    //   66  132:iload           8
    //   67  134:ifeq            184
    //   68  137:iconst_1        
    //   69  138:istore          10
    //   70  140:aload           5
    //   71  142:iload           10
    //   72  144:putfield        #133 <Field boolean ActionMenuView$LayoutParams.expandable>
    //   73  147:aload           5
    //   74  149:iload           9
    //   75  151:putfield        #136 <Field int ActionMenuView$LayoutParams.cellsUsed>
    //   76  154:aload_0         
    //   77  155:iload           9
    //   78  157:iload_1         
    //   79  158:imul            
    //   80  159:ldc1            #137 <Int 0x40000000>
    //   81  161:invokestatic    #112 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   82  164:iload           6
    //   83  166:invokevirtual   #123 <Method void View.measure(int, int)>
    //   84  169:iload           9
    //   85  171:ireturn         
    //   86  172:aconst_null     
    //   87  173:astore          7
    //   88  175:goto            38
    //   89  178:iconst_0        
    //   90  179:istore          8
    //   91  181:goto            54
    //   92  184:iconst_0        
    //   93  185:istore          10
    //   94  187:goto            140
    }

    private void onMeasureExactFormat(int i, int j)
    {
    //    0    0:iload_2         
    //    1    1:invokestatic    #109 <Method int android.view.View$MeasureSpec.getMode(int)>
    //    2    4:istore_3        
    //    3    5:iload_1         
    //    4    6:invokestatic    #106 <Method int android.view.View$MeasureSpec.getSize(int)>
    //    5    9:istore          4
    //    6   11:iload_2         
    //    7   12:invokestatic    #106 <Method int android.view.View$MeasureSpec.getSize(int)>
    //    8   15:istore          5
    //    9   17:aload_0         
    //   10   18:invokevirtual   #141 <Method int getPaddingLeft()>
    //   11   21:aload_0         
    //   12   22:invokevirtual   #144 <Method int getPaddingRight()>
    //   13   25:iadd            
    //   14   26:istore          6
    //   15   28:aload_0         
    //   16   29:invokevirtual   #147 <Method int getPaddingTop()>
    //   17   32:aload_0         
    //   18   33:invokevirtual   #150 <Method int getPaddingBottom()>
    //   19   36:iadd            
    //   20   37:istore          7
    //   21   39:iload_3         
    //   22   40:ldc1            #137 <Int 0x40000000>
    //   23   42:icmpne          95
    //   24   45:iload           5
    //   25   47:iload           7
    //   26   49:isub            
    //   27   50:ldc1            #137 <Int 0x40000000>
    //   28   52:invokestatic    #112 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   29   55:istore          8
    //   30   57:iload           4
    //   31   59:iload           6
    //   32   61:isub            
    //   33   62:istore          9
    //   34   64:iload           9
    //   35   66:aload_0         
    //   36   67:getfield        #60  <Field int mMinCellSize>
    //   37   70:idiv            
    //   38   71:istore          10
    //   39   73:iload           9
    //   40   75:aload_0         
    //   41   76:getfield        #60  <Field int mMinCellSize>
    //   42   79:irem            
    //   43   80:istore          11
    //   44   82:iload           10
    //   45   84:ifne            117
    //   46   87:aload_0         
    //   47   88:iload           9
    //   48   90:iconst_0        
    //   49   91:invokevirtual   #153 <Method void setMeasuredDimension(int, int)>
    //   50   94:return          
    //   51   95:aload_0         
    //   52   96:getfield        #86  <Field int mMaxItemHeight>
    //   53   99:iload           5
    //   54  101:iload           7
    //   55  103:isub            
    //   56  104:invokestatic    #158 <Method int Math.min(int, int)>
    //   57  107:ldc1            #119 <Int 0x80000000>
    //   58  109:invokestatic    #112 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   59  112:istore          8
    //   60  114:goto            57
    //   61  117:aload_0         
    //   62  118:getfield        #60  <Field int mMinCellSize>
    //   63  121:iload           11
    //   64  123:iload           10
    //   65  125:idiv            
    //   66  126:iadd            
    //   67  127:istore          12
    //   68  129:iload           10
    //   69  131:istore          13
    //   70  133:iconst_0        
    //   71  134:istore          14
    //   72  136:iconst_0        
    //   73  137:istore          15
    //   74  139:iconst_0        
    //   75  140:istore          16
    //   76  142:iconst_0        
    //   77  143:istore          17
    //   78  145:iconst_0        
    //   79  146:istore          18
    //   80  148:lconst_0        
    //   81  149:lstore          19
    //   82  151:aload_0         
    //   83  152:invokevirtual   #161 <Method int getChildCount()>
    //   84  155:istore          21
    //   85  157:iconst_0        
    //   86  158:istore          22
    //   87  160:iload           22
    //   88  162:iload           21
    //   89  164:icmpge          405
    //   90  167:aload_0         
    //   91  168:iload           22
    //   92  170:invokevirtual   #165 <Method View getChildAt(int)>
    //   93  173:astore          45
    //   94  175:aload           45
    //   95  177:invokevirtual   #168 <Method int View.getVisibility()>
    //   96  180:bipush          8
    //   97  182:icmpne          191
    //   98  185:iinc            22  1
    //   99  188:goto            160
    //  100  191:aload           45
    //  101  193:instanceof      #114 <Class ActionMenuItemView>
    //  102  196:istore          46
    //  103  198:iinc            17  1
    //  104  201:iload           46
    //  105  203:ifeq            221
    //  106  206:aload           45
    //  107  208:aload_0         
    //  108  209:getfield        #63  <Field int mGeneratedItemPadding>
    //  109  212:iconst_0        
    //  110  213:aload_0         
    //  111  214:getfield        #63  <Field int mGeneratedItemPadding>
    //  112  217:iconst_0        
    //  113  218:invokevirtual   #172 <Method void View.setPadding(int, int, int, int)>
    //  114  221:aload           45
    //  115  223:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  116  226:checkcast       #100 <Class ActionMenuView$LayoutParams>
    //  117  229:astore          47
    //  118  231:aload           47
    //  119  233:iconst_0        
    //  120  234:putfield        #175 <Field boolean ActionMenuView$LayoutParams.expanded>
    //  121  237:aload           47
    //  122  239:iconst_0        
    //  123  240:putfield        #178 <Field int ActionMenuView$LayoutParams.extraPixels>
    //  124  243:aload           47
    //  125  245:iconst_0        
    //  126  246:putfield        #136 <Field int ActionMenuView$LayoutParams.cellsUsed>
    //  127  249:aload           47
    //  128  251:iconst_0        
    //  129  252:putfield        #133 <Field boolean ActionMenuView$LayoutParams.expandable>
    //  130  255:aload           47
    //  131  257:iconst_0        
    //  132  258:putfield        #181 <Field int ActionMenuView$LayoutParams.leftMargin>
    //  133  261:aload           47
    //  134  263:iconst_0        
    //  135  264:putfield        #184 <Field int ActionMenuView$LayoutParams.rightMargin>
    //  136  267:iload           46
    //  137  269:ifeq            392
    //  138  272:aload           45
    //  139  274:checkcast       #114 <Class ActionMenuItemView>
    //  140  277:invokevirtual   #118 <Method boolean ActionMenuItemView.hasText()>
    //  141  280:ifeq            392
    //  142  283:iconst_1        
    //  143  284:istore          48
    //  144  286:aload           47
    //  145  288:iload           48
    //  146  290:putfield        #187 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
    //  147  293:aload           47
    //  148  295:getfield        #130 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
    //  149  298:ifeq            398
    //  150  301:iconst_1        
    //  151  302:istore          49
    //  152  304:aload           45
    //  153  306:iload           12
    //  154  308:iload           49
    //  155  310:iload           8
    //  156  312:iload           7
    //  157  314:invokestatic    #189 <Method int measureChildForCells(View, int, int, int, int)>
    //  158  317:istore          50
    //  159  319:iload           15
    //  160  321:iload           50
    //  161  323:invokestatic    #192 <Method int Math.max(int, int)>
    //  162  326:istore          15
    //  163  328:aload           47
    //  164  330:getfield        #133 <Field boolean ActionMenuView$LayoutParams.expandable>
    //  165  333:ifeq            339
    //  166  336:iinc            16  1
    //  167  339:aload           47
    //  168  341:getfield        #130 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
    //  169  344:ifeq            350
    //  170  347:iconst_1        
    //  171  348:istore          18
    //  172  350:iload           13
    //  173  352:iload           50
    //  174  354:isub            
    //  175  355:istore          13
    //  176  357:aload           45
    //  177  359:invokevirtual   #195 <Method int View.getMeasuredHeight()>
    //  178  362:istore          51
    //  179  364:iload           14
    //  180  366:iload           51
    //  181  368:invokestatic    #192 <Method int Math.max(int, int)>
    //  182  371:istore          14
    //  183  373:iload           50
    //  184  375:iconst_1        
    //  185  376:icmpne          185
    //  186  379:lload           19
    //  187  381:iconst_1        
    //  188  382:iload           22
    //  189  384:ishl            
    //  190  385:i2l             
    //  191  386:lor             
    //  192  387:lstore          19
    //  193  389:goto            185
    //  194  392:iconst_0        
    //  195  393:istore          48
    //  196  395:goto            286
    //  197  398:iload           13
    //  198  400:istore          49
    //  199  402:goto            304
    //  200  405:iload           18
    //  201  407:ifeq            480
    //  202  410:iload           17
    //  203  412:iconst_2        
    //  204  413:icmpne          480
    //  205  416:iconst_1        
    //  206  417:istore          23
    //  207  419:iconst_0        
    //  208  420:istore          24
    //  209  422:iload           16
    //  210  424:ifle            556
    //  211  427:iload           13
    //  212  429:ifle            556
    //  213  432:ldc1            #196 <Int 0x7fffffff>
    //  214  434:istore          35
    //  215  436:lconst_0        
    //  216  437:lstore          36
    //  217  439:iconst_0        
    //  218  440:istore          38
    //  219  442:iconst_0        
    //  220  443:istore          39
    //  221  445:iload           39
    //  222  447:iload           21
    //  223  449:icmpge          542
    //  224  452:aload_0         
    //  225  453:iload           39
    //  226  455:invokevirtual   #165 <Method View getChildAt(int)>
    //  227  458:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  228  461:checkcast       #100 <Class ActionMenuView$LayoutParams>
    //  229  464:astore          44
    //  230  466:aload           44
    //  231  468:getfield        #133 <Field boolean ActionMenuView$LayoutParams.expandable>
    //  232  471:ifne            486
    //  233  474:iinc            39  1
    //  234  477:goto            445
    //  235  480:iconst_0        
    //  236  481:istore          23
    //  237  483:goto            419
    //  238  486:aload           44
    //  239  488:getfield        #136 <Field int ActionMenuView$LayoutParams.cellsUsed>
    //  240  491:iload           35
    //  241  493:icmpge          516
    //  242  496:aload           44
    //  243  498:getfield        #136 <Field int ActionMenuView$LayoutParams.cellsUsed>
    //  244  501:istore          35
    //  245  503:iconst_1        
    //  246  504:iload           39
    //  247  506:ishl            
    //  248  507:i2l             
    //  249  508:lstore          36
    //  250  510:iconst_1        
    //  251  511:istore          38
    //  252  513:goto            474
    //  253  516:aload           44
    //  254  518:getfield        #136 <Field int ActionMenuView$LayoutParams.cellsUsed>
    //  255  521:iload           35
    //  256  523:icmpne          474
    //  257  526:lload           36
    //  258  528:iconst_1        
    //  259  529:iload           39
    //  260  531:ishl            
    //  261  532:i2l             
    //  262  533:lor             
    //  263  534:lstore          36
    //  264  536:iinc            38  1
    //  265  539:goto            474
    //  266  542:lload           19
    //  267  544:lload           36
    //  268  546:lor             
    //  269  547:lstore          19
    //  270  549:iload           38
    //  271  551:iload           13
    //  272  553:icmple          738
    //  273  556:iload           18
    //  274  558:ifne            878
    //  275  561:iload           17
    //  276  563:iconst_1        
    //  277  564:icmpne          878
    //  278  567:iconst_1        
    //  279  568:istore          25
    //  280  570:iload           13
    //  281  572:ifle            1037
    //  282  575:lload           19
    //  283  577:lconst_0        
    //  284  578:lcmp            
    //  285  579:ifeq            1037
    //  286  582:iload           13
    //  287  584:iload           17
    //  288  586:iconst_1        
    //  289  587:isub            
    //  290  588:icmplt          602
    //  291  591:iload           25
    //  292  593:ifne            602
    //  293  596:iload           15
    //  294  598:iconst_1        
    //  295  599:icmple          1037
    //  296  602:lload           19
    //  297  604:invokestatic    #202 <Method int Long.bitCount(long)>
    //  298  607:i2f             
    //  299  608:fstore          29
    //  300  610:iload           25
    //  301  612:ifne            690
    //  302  615:lconst_1        
    //  303  616:lload           19
    //  304  618:land            
    //  305  619:lconst_0        
    //  306  620:lcmp            
    //  307  621:ifeq            648
    //  308  624:aload_0         
    //  309  625:iconst_0        
    //  310  626:invokevirtual   #165 <Method View getChildAt(int)>
    //  311  629:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  312  632:checkcast       #100 <Class ActionMenuView$LayoutParams>
    //  313  635:getfield        #187 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
    //  314  638:ifne            648
    //  315  641:fload           29
    //  316  643:ldc1            #203 <Float 0.5F>
    //  317  645:fsub            
    //  318  646:fstore          29
    //  319  648:lload           19
    //  320  650:iconst_1        
    //  321  651:iload           21
    //  322  653:iconst_1        
    //  323  654:isub            
    //  324  655:ishl            
    //  325  656:i2l             
    //  326  657:land            
    //  327  658:lconst_0        
    //  328  659:lcmp            
    //  329  660:ifeq            690
    //  330  663:aload_0         
    //  331  664:iload           21
    //  332  666:iconst_1        
    //  333  667:isub            
    //  334  668:invokevirtual   #165 <Method View getChildAt(int)>
    //  335  671:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  336  674:checkcast       #100 <Class ActionMenuView$LayoutParams>
    //  337  677:getfield        #187 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
    //  338  680:ifne            690
    //  339  683:fload           29
    //  340  685:ldc1            #203 <Float 0.5F>
    //  341  687:fsub            
    //  342  688:fstore          29
    //  343  690:fload           29
    //  344  692:fconst_0        
    //  345  693:fcmpl           
    //  346  694:ifle            884
    //  347  697:iload           13
    //  348  699:iload           12
    //  349  701:imul            
    //  350  702:i2f             
    //  351  703:fload           29
    //  352  705:fdiv            
    //  353  706:f2i             
    //  354  707:istore          30
    //  355  709:iconst_0        
    //  356  710:istore          31
    //  357  712:iload           31
    //  358  714:iload           21
    //  359  716:icmpge          1034
    //  360  719:lload           19
    //  361  721:iconst_1        
    //  362  722:iload           31
    //  363  724:ishl            
    //  364  725:i2l             
    //  365  726:land            
    //  366  727:lconst_0        
    //  367  728:lcmp            
    //  368  729:ifne            890
    //  369  732:iinc            31  1
    //  370  735:goto            712
    //  371  738:iload           35
    //  372  740:iconst_1        
    //  373  741:iadd            
    //  374  742:istore          40
    //  375  744:iconst_0        
    //  376  745:istore          41
    //  377  747:iload           41
    //  378  749:iload           21
    //  379  751:icmpge          872
    //  380  754:aload_0         
    //  381  755:iload           41
    //  382  757:invokevirtual   #165 <Method View getChildAt(int)>
    //  383  760:astore          42
    //  384  762:aload           42
    //  385  764:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  386  767:checkcast       #100 <Class ActionMenuView$LayoutParams>
    //  387  770:astore          43
    //  388  772:lload           36
    //  389  774:iconst_1        
    //  390  775:iload           41
    //  391  777:ishl            
    //  392  778:i2l             
    //  393  779:land            
    //  394  780:lconst_0        
    //  395  781:lcmp            
    //  396  782:ifne            811
    //  397  785:aload           43
    //  398  787:getfield        #136 <Field int ActionMenuView$LayoutParams.cellsUsed>
    //  399  790:iload           40
    //  400  792:icmpne          805
    //  401  795:lload           19
    //  402  797:iconst_1        
    //  403  798:iload           41
    //  404  800:ishl            
    //  405  801:i2l             
    //  406  802:lor             
    //  407  803:lstore          19
    //  408  805:iinc            41  1
    //  409  808:goto            747
    //  410  811:iload           23
    //  411  813:ifeq            848
    //  412  816:aload           43
    //  413  818:getfield        #187 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
    //  414  821:ifeq            848
    //  415  824:iload           13
    //  416  826:iconst_1        
    //  417  827:icmpne          848
    //  418  830:aload           42
    //  419  832:iload           12
    //  420  834:aload_0         
    //  421  835:getfield        #63  <Field int mGeneratedItemPadding>
    //  422  838:iadd            
    //  423  839:iconst_0        
    //  424  840:aload_0         
    //  425  841:getfield        #63  <Field int mGeneratedItemPadding>
    //  426  844:iconst_0        
    //  427  845:invokevirtual   #172 <Method void View.setPadding(int, int, int, int)>
    //  428  848:aload           43
    //  429  850:iconst_1        
    //  430  851:aload           43
    //  431  853:getfield        #136 <Field int ActionMenuView$LayoutParams.cellsUsed>
    //  432  856:iadd            
    //  433  857:putfield        #136 <Field int ActionMenuView$LayoutParams.cellsUsed>
    //  434  860:aload           43
    //  435  862:iconst_1        
    //  436  863:putfield        #175 <Field boolean ActionMenuView$LayoutParams.expanded>
    //  437  866:iinc            13  -1
    //  438  869:goto            805
    //  439  872:iconst_1        
    //  440  873:istore          24
    //  441  875:goto            422
    //  442  878:iconst_0        
    //  443  879:istore          25
    //  444  881:goto            570
    //  445  884:iconst_0        
    //  446  885:istore          30
    //  447  887:goto            709
    //  448  890:aload_0         
    //  449  891:iload           31
    //  450  893:invokevirtual   #165 <Method View getChildAt(int)>
    //  451  896:astore          32
    //  452  898:aload           32
    //  453  900:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  454  903:checkcast       #100 <Class ActionMenuView$LayoutParams>
    //  455  906:astore          33
    //  456  908:aload           32
    //  457  910:instanceof      #114 <Class ActionMenuItemView>
    //  458  913:ifeq            958
    //  459  916:aload           33
    //  460  918:iload           30
    //  461  920:putfield        #178 <Field int ActionMenuView$LayoutParams.extraPixels>
    //  462  923:aload           33
    //  463  925:iconst_1        
    //  464  926:putfield        #175 <Field boolean ActionMenuView$LayoutParams.expanded>
    //  465  929:iload           31
    //  466  931:ifne            952
    //  467  934:aload           33
    //  468  936:getfield        #187 <Field boolean ActionMenuView$LayoutParams.preventEdgeOffset>
    //  469  939:ifne            952
    //  470  942:aload           33
    //  471  944:iload           30
    //  472  946:ineg            
    //  473  947:iconst_2        
    //  474  948:idiv            
    //  475  949:putfield        #181 <Field int ActionMenuView$LayoutParams.leftMargin>
    //  476  952:iconst_1        
    //  477  953:istore          24
    //  478  955:goto            732
    //  479  958:aload           33
    //  480  960:getfield        #130 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
    //  481  963:ifeq            995
    //  482  966:aload           33
    //  483  968:iload           30
    //  484  970:putfield        #178 <Field int ActionMenuView$LayoutParams.extraPixels>
    //  485  973:aload           33
    //  486  975:iconst_1        
    //  487  976:putfield        #175 <Field boolean ActionMenuView$LayoutParams.expanded>
    //  488  979:aload           33
    //  489  981:iload           30
    //  490  983:ineg            
    //  491  984:iconst_2        
    //  492  985:idiv            
    //  493  986:putfield        #184 <Field int ActionMenuView$LayoutParams.rightMargin>
    //  494  989:iconst_1        
    //  495  990:istore          24
    //  496  992:goto            732
    //  497  995:iload           31
    //  498  997:ifeq            1009
    //  499 1000:aload           33
    //  500 1002:iload           30
    //  501 1004:iconst_2        
    //  502 1005:idiv            
    //  503 1006:putfield        #181 <Field int ActionMenuView$LayoutParams.leftMargin>
    //  504 1009:iload           21
    //  505 1011:iconst_1        
    //  506 1012:isub            
    //  507 1013:istore          34
    //  508 1015:iload           31
    //  509 1017:iload           34
    //  510 1019:icmpeq          732
    //  511 1022:aload           33
    //  512 1024:iload           30
    //  513 1026:iconst_2        
    //  514 1027:idiv            
    //  515 1028:putfield        #184 <Field int ActionMenuView$LayoutParams.rightMargin>
    //  516 1031:goto            732
    //  517 1034:iconst_0        
    //  518 1035:istore          13
    //  519 1037:iload           24
    //  520 1039:ifeq            1113
    //  521 1042:iconst_0        
    //  522 1043:istore          26
    //  523 1045:iload           26
    //  524 1047:iload           21
    //  525 1049:icmpge          1113
    //  526 1052:aload_0         
    //  527 1053:iload           26
    //  528 1055:invokevirtual   #165 <Method View getChildAt(int)>
    //  529 1058:astore          27
    //  530 1060:aload           27
    //  531 1062:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  532 1065:checkcast       #100 <Class ActionMenuView$LayoutParams>
    //  533 1068:astore          28
    //  534 1070:aload           28
    //  535 1072:getfield        #175 <Field boolean ActionMenuView$LayoutParams.expanded>
    //  536 1075:ifne            1084
    //  537 1078:iinc            26  1
    //  538 1081:goto            1045
    //  539 1084:aload           27
    //  540 1086:iload           12
    //  541 1088:aload           28
    //  542 1090:getfield        #136 <Field int ActionMenuView$LayoutParams.cellsUsed>
    //  543 1093:imul            
    //  544 1094:aload           28
    //  545 1096:getfield        #178 <Field int ActionMenuView$LayoutParams.extraPixels>
    //  546 1099:iadd            
    //  547 1100:ldc1            #137 <Int 0x40000000>
    //  548 1102:invokestatic    #112 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  549 1105:iload           8
    //  550 1107:invokevirtual   #123 <Method void View.measure(int, int)>
    //  551 1110:goto            1078
    //  552 1113:iload_3         
    //  553 1114:ldc1            #137 <Int 0x40000000>
    //  554 1116:icmpeq          1123
    //  555 1119:iload           14
    //  556 1121:istore          5
    //  557 1123:aload_0         
    //  558 1124:iload           9
    //  559 1126:iload           5
    //  560 1128:invokevirtual   #153 <Method void setMeasuredDimension(int, int)>
    //  561 1131:aload_0         
    //  562 1132:iload           13
    //  563 1134:iload           12
    //  564 1136:imul            
    //  565 1137:putfield        #205 <Field int mMeasuredExtraWidth>
    //  566 1140:return          
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          13
    //    2    4:aload_1         
    //    3    5:instanceof      #100 <Class ActionMenuView$LayoutParams>
    //    4    8:ifeq            13
    //    5   11:iconst_1        
    //    6   12:ireturn         
    //    7   13:iconst_0        
    //    8   14:ireturn         
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    protected LayoutParams generateDefaultLayoutParams()
    {
    //    0    0:new             #100 <Class ActionMenuView$LayoutParams>
    //    1    3:dup             
    //    2    4:bipush          -2
    //    3    6:bipush          -2
    //    4    8:invokespecial   #213 <Method void ActionMenuView$LayoutParams(int, int)>
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:bipush          16
    //    8   15:putfield        #216 <Field int ActionMenuView$LayoutParams.gravity>
    //    9   18:aload_1         
    //   10   19:areturn         
    }

    protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #218 <Method ActionMenuView$LayoutParams generateDefaultLayoutParams()>
    //    2    4:areturn         
    }

    protected volatile android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #218 <Method ActionMenuView$LayoutParams generateDefaultLayoutParams()>
    //    2    4:areturn         
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
    //    0    0:new             #100 <Class ActionMenuView$LayoutParams>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokevirtual   #225 <Method Context getContext()>
    //    4    8:aload_1         
    //    5    9:invokespecial   #226 <Method void ActionMenuView$LayoutParams(Context, AttributeSet)>
    //    6   12:areturn         
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:aload_1         
    //    1    1:instanceof      #100 <Class ActionMenuView$LayoutParams>
    //    2    4:ifeq            34
    //    3    7:new             #100 <Class ActionMenuView$LayoutParams>
    //    4   10:dup             
    //    5   11:aload_1         
    //    6   12:checkcast       #100 <Class ActionMenuView$LayoutParams>
    //    7   15:invokespecial   #230 <Method void ActionMenuView$LayoutParams(ActionMenuView$LayoutParams)>
    //    8   18:astore_2        
    //    9   19:aload_2         
    //   10   20:getfield        #216 <Field int ActionMenuView$LayoutParams.gravity>
    //   11   23:ifgt            32
    //   12   26:aload_2         
    //   13   27:bipush          16
    //   14   29:putfield        #216 <Field int ActionMenuView$LayoutParams.gravity>
    //   15   32:aload_2         
    //   16   33:areturn         
    //   17   34:aload_0         
    //   18   35:invokevirtual   #218 <Method ActionMenuView$LayoutParams generateDefaultLayoutParams()>
    //   19   38:areturn         
    }

    public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #233 <Method ActionMenuView$LayoutParams generateLayoutParams(AttributeSet)>
    //    3    5:areturn         
    }

    protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #236 <Method ActionMenuView$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
    //    3    5:areturn         
    }

    public volatile android.widget.LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #233 <Method ActionMenuView$LayoutParams generateLayoutParams(AttributeSet)>
    //    3    5:areturn         
    }

    protected volatile android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #236 <Method ActionMenuView$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
    //    3    5:areturn         
    }

    public LayoutParams generateOverflowButtonLayoutParams()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #218 <Method ActionMenuView$LayoutParams generateDefaultLayoutParams()>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:iconst_1        
    //    5    7:putfield        #130 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
    //    6   10:aload_1         
    //    7   11:areturn         
    }

    public int getWindowAnimations()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    protected boolean hasSupportDividerBeforeChildAt(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iconst_1        
    //    3    3:isub            
    //    4    4:invokevirtual   #165 <Method View getChildAt(int)>
    //    5    7:astore_2        
    //    6    8:aload_0         
    //    7    9:iload_1         
    //    8   10:invokevirtual   #165 <Method View getChildAt(int)>
    //    9   13:astore_3        
    //   10   14:aload_0         
    //   11   15:invokevirtual   #161 <Method int getChildCount()>
    //   12   18:istore          4
    //   13   20:iconst_0        
    //   14   21:istore          5
    //   15   23:iload_1         
    //   16   24:iload           4
    //   17   26:icmpge          56
    //   18   29:aload_2         
    //   19   30:instanceof      #244 <Class ActionMenuView$ActionMenuChildView>
    //   20   33:istore          6
    //   21   35:iconst_0        
    //   22   36:istore          5
    //   23   38:iload           6
    //   24   40:ifeq            56
    //   25   43:iconst_0        
    //   26   44:aload_2         
    //   27   45:checkcast       #244 <Class ActionMenuView$ActionMenuChildView>
    //   28   48:invokeinterface #247 <Method boolean ActionMenuView$ActionMenuChildView.needsDividerAfter()>
    //   29   53:ior             
    //   30   54:istore          5
    //   31   56:iload_1         
    //   32   57:ifle            81
    //   33   60:aload_3         
    //   34   61:instanceof      #244 <Class ActionMenuView$ActionMenuChildView>
    //   35   64:ifeq            81
    //   36   67:iload           5
    //   37   69:aload_3         
    //   38   70:checkcast       #244 <Class ActionMenuView$ActionMenuChildView>
    //   39   73:invokeinterface #250 <Method boolean ActionMenuView$ActionMenuChildView.needsDividerBefore()>
    //   40   78:ior             
    //   41   79:istore          5
    //   42   81:iload           5
    //   43   83:ireturn         
    }

    public void initialize(MenuBuilder menubuilder)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #254 <Field MenuBuilder mMenu>
    //    3    5:return          
    }

    public boolean invokeItem(MenuItemImpl menuitemimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #254 <Field MenuBuilder mMenu>
    //    2    4:aload_1         
    //    3    5:iconst_0        
    //    4    6:invokevirtual   #262 <Method boolean MenuBuilder.performItemAction(android.view.MenuItem, int)>
    //    5    9:ireturn         
    }

    public boolean isExpandedFormat()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #265 <Field boolean mFormatItems>
    //    2    4:ireturn         
    }

    public boolean isOverflowReserved()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #268 <Field boolean mReserveOverflow>
    //    2    4:ireturn         
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    //    0    0:getstatic       #275 <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          8
    //    2    5:icmplt          13
    //    3    8:aload_0         
    //    4    9:aload_1         
    //    5   10:invokespecial   #277 <Method void LinearLayoutICS.onConfigurationChanged(Configuration)>
    //    6   13:aload_0         
    //    7   14:getfield        #279 <Field ActionMenuPresenter mPresenter>
    //    8   17:iconst_0        
    //    9   18:invokevirtual   #284 <Method void ActionMenuPresenter.updateMenuView(boolean)>
    //   10   21:aload_0         
    //   11   22:getfield        #279 <Field ActionMenuPresenter mPresenter>
    //   12   25:ifnull          54
    //   13   28:aload_0         
    //   14   29:getfield        #279 <Field ActionMenuPresenter mPresenter>
    //   15   32:invokevirtual   #287 <Method boolean ActionMenuPresenter.isOverflowMenuShowing()>
    //   16   35:ifeq            54
    //   17   38:aload_0         
    //   18   39:getfield        #279 <Field ActionMenuPresenter mPresenter>
    //   19   42:invokevirtual   #290 <Method boolean ActionMenuPresenter.hideOverflowMenu()>
    //   20   45:pop             
    //   21   46:aload_0         
    //   22   47:getfield        #279 <Field ActionMenuPresenter mPresenter>
    //   23   50:invokevirtual   #293 <Method boolean ActionMenuPresenter.showOverflowMenu()>
    //   24   53:pop             
    //   25   54:return          
    }

    public void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #296 <Method void LinearLayoutICS.onDetachedFromWindow()>
    //    2    4:aload_0         
    //    3    5:getfield        #279 <Field ActionMenuPresenter mPresenter>
    //    4    8:invokevirtual   #299 <Method boolean ActionMenuPresenter.dismissPopupMenus()>
    //    5   11:pop             
    //    6   12:return          
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #265 <Field boolean mFormatItems>
    //    2    4:ifne            19
    //    3    7:aload_0         
    //    4    8:iload_1         
    //    5    9:iload_2         
    //    6   10:iload_3         
    //    7   11:iload           4
    //    8   13:iload           5
    //    9   15:invokespecial   #303 <Method void LinearLayoutICS.onLayout(boolean, int, int, int, int)>
    //   10   18:return          
    //   11   19:aload_0         
    //   12   20:invokevirtual   #161 <Method int getChildCount()>
    //   13   23:istore          6
    //   14   25:iload_3         
    //   15   26:iload           5
    //   16   28:iadd            
    //   17   29:iconst_2        
    //   18   30:idiv            
    //   19   31:istore          7
    //   20   33:aload_0         
    //   21   34:invokevirtual   #306 <Method int getSupportDividerWidth()>
    //   22   37:istore          8
    //   23   39:iconst_0        
    //   24   40:istore          9
    //   25   42:iconst_0        
    //   26   43:istore          10
    //   27   45:iload           4
    //   28   47:iload_2         
    //   29   48:isub            
    //   30   49:aload_0         
    //   31   50:invokevirtual   #144 <Method int getPaddingRight()>
    //   32   53:isub            
    //   33   54:aload_0         
    //   34   55:invokevirtual   #141 <Method int getPaddingLeft()>
    //   35   58:isub            
    //   36   59:istore          11
    //   37   61:iconst_0        
    //   38   62:istore          12
    //   39   64:iconst_0        
    //   40   65:istore          13
    //   41   67:iload           13
    //   42   69:iload           6
    //   43   71:icmpge          263
    //   44   74:aload_0         
    //   45   75:iload           13
    //   46   77:invokevirtual   #165 <Method View getChildAt(int)>
    //   47   80:astore          31
    //   48   82:aload           31
    //   49   84:invokevirtual   #168 <Method int View.getVisibility()>
    //   50   87:bipush          8
    //   51   89:icmpne          98
    //   52   92:iinc            13  1
    //   53   95:goto            67
    //   54   98:aload           31
    //   55  100:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   56  103:checkcast       #100 <Class ActionMenuView$LayoutParams>
    //   57  106:astore          32
    //   58  108:aload           32
    //   59  110:getfield        #130 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
    //   60  113:ifeq            208
    //   61  116:aload           31
    //   62  118:invokevirtual   #127 <Method int View.getMeasuredWidth()>
    //   63  121:istore          34
    //   64  123:aload_0         
    //   65  124:iload           13
    //   66  126:invokevirtual   #308 <Method boolean hasSupportDividerBeforeChildAt(int)>
    //   67  129:ifeq            139
    //   68  132:iload           34
    //   69  134:iload           8
    //   70  136:iadd            
    //   71  137:istore          34
    //   72  139:aload           31
    //   73  141:invokevirtual   #195 <Method int View.getMeasuredHeight()>
    //   74  144:istore          35
    //   75  146:aload_0         
    //   76  147:invokevirtual   #311 <Method int getWidth()>
    //   77  150:aload_0         
    //   78  151:invokevirtual   #144 <Method int getPaddingRight()>
    //   79  154:isub            
    //   80  155:aload           32
    //   81  157:getfield        #184 <Field int ActionMenuView$LayoutParams.rightMargin>
    //   82  160:isub            
    //   83  161:istore          36
    //   84  163:iload           36
    //   85  165:iload           34
    //   86  167:isub            
    //   87  168:istore          37
    //   88  170:iload           7
    //   89  172:iload           35
    //   90  174:iconst_2        
    //   91  175:idiv            
    //   92  176:isub            
    //   93  177:istore          38
    //   94  179:aload           31
    //   95  181:iload           37
    //   96  183:iload           38
    //   97  185:iload           36
    //   98  187:iload           38
    //   99  189:iload           35
    //  100  191:iadd            
    //  101  192:invokevirtual   #314 <Method void View.layout(int, int, int, int)>
    //  102  195:iload           11
    //  103  197:iload           34
    //  104  199:isub            
    //  105  200:istore          11
    //  106  202:iconst_1        
    //  107  203:istore          12
    //  108  205:goto            92
    //  109  208:aload           31
    //  110  210:invokevirtual   #127 <Method int View.getMeasuredWidth()>
    //  111  213:aload           32
    //  112  215:getfield        #181 <Field int ActionMenuView$LayoutParams.leftMargin>
    //  113  218:iadd            
    //  114  219:aload           32
    //  115  221:getfield        #184 <Field int ActionMenuView$LayoutParams.rightMargin>
    //  116  224:iadd            
    //  117  225:istore          33
    //  118  227:iload           9
    //  119  229:iload           33
    //  120  231:iadd            
    //  121  232:istore          9
    //  122  234:iload           11
    //  123  236:iload           33
    //  124  238:isub            
    //  125  239:istore          11
    //  126  241:aload_0         
    //  127  242:iload           13
    //  128  244:invokevirtual   #308 <Method boolean hasSupportDividerBeforeChildAt(int)>
    //  129  247:ifeq            257
    //  130  250:iload           9
    //  131  252:iload           8
    //  132  254:iadd            
    //  133  255:istore          9
    //  134  257:iinc            10  1
    //  135  260:goto            92
    //  136  263:iload           6
    //  137  265:iconst_1        
    //  138  266:icmpne          337
    //  139  269:iload           12
    //  140  271:ifne            337
    //  141  274:aload_0         
    //  142  275:iconst_0        
    //  143  276:invokevirtual   #165 <Method View getChildAt(int)>
    //  144  279:astore          26
    //  145  281:aload           26
    //  146  283:invokevirtual   #127 <Method int View.getMeasuredWidth()>
    //  147  286:istore          27
    //  148  288:aload           26
    //  149  290:invokevirtual   #195 <Method int View.getMeasuredHeight()>
    //  150  293:istore          28
    //  151  295:iload           4
    //  152  297:iload_2         
    //  153  298:isub            
    //  154  299:iconst_2        
    //  155  300:idiv            
    //  156  301:iload           27
    //  157  303:iconst_2        
    //  158  304:idiv            
    //  159  305:isub            
    //  160  306:istore          29
    //  161  308:iload           7
    //  162  310:iload           28
    //  163  312:iconst_2        
    //  164  313:idiv            
    //  165  314:isub            
    //  166  315:istore          30
    //  167  317:aload           26
    //  168  319:iload           29
    //  169  321:iload           30
    //  170  323:iload           29
    //  171  325:iload           27
    //  172  327:iadd            
    //  173  328:iload           30
    //  174  330:iload           28
    //  175  332:iadd            
    //  176  333:invokevirtual   #314 <Method void View.layout(int, int, int, int)>
    //  177  336:return          
    //  178  337:iload           12
    //  179  339:ifeq            430
    //  180  342:iconst_0        
    //  181  343:istore          14
    //  182  345:iload           10
    //  183  347:iload           14
    //  184  349:isub            
    //  185  350:istore          15
    //  186  352:iload           15
    //  187  354:ifle            436
    //  188  357:iload           11
    //  189  359:iload           15
    //  190  361:idiv            
    //  191  362:istore          16
    //  192  364:iconst_0        
    //  193  365:iload           16
    //  194  367:invokestatic    #192 <Method int Math.max(int, int)>
    //  195  370:istore          17
    //  196  372:aload_0         
    //  197  373:invokevirtual   #141 <Method int getPaddingLeft()>
    //  198  376:istore          18
    //  199  378:iconst_0        
    //  200  379:istore          19
    //  201  381:iload           19
    //  202  383:iload           6
    //  203  385:icmpge          18
    //  204  388:aload_0         
    //  205  389:iload           19
    //  206  391:invokevirtual   #165 <Method View getChildAt(int)>
    //  207  394:astore          20
    //  208  396:aload           20
    //  209  398:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  210  401:checkcast       #100 <Class ActionMenuView$LayoutParams>
    //  211  404:astore          21
    //  212  406:aload           20
    //  213  408:invokevirtual   #168 <Method int View.getVisibility()>
    //  214  411:bipush          8
    //  215  413:icmpeq          424
    //  216  416:aload           21
    //  217  418:getfield        #130 <Field boolean ActionMenuView$LayoutParams.isOverflowButton>
    //  218  421:ifeq            442
    //  219  424:iinc            19  1
    //  220  427:goto            381
    //  221  430:iconst_1        
    //  222  431:istore          14
    //  223  433:goto            345
    //  224  436:iconst_0        
    //  225  437:istore          16
    //  226  439:goto            364
    //  227  442:iload           18
    //  228  444:aload           21
    //  229  446:getfield        #181 <Field int ActionMenuView$LayoutParams.leftMargin>
    //  230  449:iadd            
    //  231  450:istore          22
    //  232  452:aload           20
    //  233  454:invokevirtual   #127 <Method int View.getMeasuredWidth()>
    //  234  457:istore          23
    //  235  459:aload           20
    //  236  461:invokevirtual   #195 <Method int View.getMeasuredHeight()>
    //  237  464:istore          24
    //  238  466:iload           7
    //  239  468:iload           24
    //  240  470:iconst_2        
    //  241  471:idiv            
    //  242  472:isub            
    //  243  473:istore          25
    //  244  475:aload           20
    //  245  477:iload           22
    //  246  479:iload           25
    //  247  481:iload           22
    //  248  483:iload           23
    //  249  485:iadd            
    //  250  486:iload           25
    //  251  488:iload           24
    //  252  490:iadd            
    //  253  491:invokevirtual   #314 <Method void View.layout(int, int, int, int)>
    //  254  494:iload           22
    //  255  496:iload           17
    //  256  498:iload           23
    //  257  500:aload           21
    //  258  502:getfield        #184 <Field int ActionMenuView$LayoutParams.rightMargin>
    //  259  505:iadd            
    //  260  506:iadd            
    //  261  507:iadd            
    //  262  508:istore          18
    //  263  510:goto            424
    }

    protected void onMeasure(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #265 <Field boolean mFormatItems>
    //    2    4:istore_3        
    //    3    5:iload_1         
    //    4    6:invokestatic    #109 <Method int android.view.View$MeasureSpec.getMode(int)>
    //    5    9:ldc1            #137 <Int 0x40000000>
    //    6   11:icmpne          93
    //    7   14:iconst_1        
    //    8   15:istore          4
    //    9   17:aload_0         
    //   10   18:iload           4
    //   11   20:putfield        #265 <Field boolean mFormatItems>
    //   12   23:iload_3         
    //   13   24:aload_0         
    //   14   25:getfield        #265 <Field boolean mFormatItems>
    //   15   28:icmpeq          36
    //   16   31:aload_0         
    //   17   32:iconst_0        
    //   18   33:putfield        #317 <Field int mFormatItemsWidth>
    //   19   36:iload_1         
    //   20   37:invokestatic    #109 <Method int android.view.View$MeasureSpec.getMode(int)>
    //   21   40:istore          5
    //   22   42:aload_0         
    //   23   43:getfield        #265 <Field boolean mFormatItems>
    //   24   46:ifeq            79
    //   25   49:aload_0         
    //   26   50:getfield        #254 <Field MenuBuilder mMenu>
    //   27   53:ifnull          79
    //   28   56:iload           5
    //   29   58:aload_0         
    //   30   59:getfield        #317 <Field int mFormatItemsWidth>
    //   31   62:icmpeq          79
    //   32   65:aload_0         
    //   33   66:iload           5
    //   34   68:putfield        #317 <Field int mFormatItemsWidth>
    //   35   71:aload_0         
    //   36   72:getfield        #254 <Field MenuBuilder mMenu>
    //   37   75:iconst_1        
    //   38   76:invokevirtual   #320 <Method void MenuBuilder.onItemsChanged(boolean)>
    //   39   79:aload_0         
    //   40   80:getfield        #265 <Field boolean mFormatItems>
    //   41   83:ifeq            99
    //   42   86:aload_0         
    //   43   87:iload_1         
    //   44   88:iload_2         
    //   45   89:invokespecial   #322 <Method void onMeasureExactFormat(int, int)>
    //   46   92:return          
    //   47   93:iconst_0        
    //   48   94:istore          4
    //   49   96:goto            17
    //   50   99:aload_0         
    //   51  100:invokevirtual   #161 <Method int getChildCount()>
    //   52  103:istore          6
    //   53  105:iconst_0        
    //   54  106:istore          7
    //   55  108:iload           7
    //   56  110:iload           6
    //   57  112:icmpge          147
    //   58  115:aload_0         
    //   59  116:iload           7
    //   60  118:invokevirtual   #165 <Method View getChildAt(int)>
    //   61  121:invokevirtual   #98  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   62  124:checkcast       #100 <Class ActionMenuView$LayoutParams>
    //   63  127:astore          8
    //   64  129:aload           8
    //   65  131:iconst_0        
    //   66  132:putfield        #184 <Field int ActionMenuView$LayoutParams.rightMargin>
    //   67  135:aload           8
    //   68  137:iconst_0        
    //   69  138:putfield        #181 <Field int ActionMenuView$LayoutParams.leftMargin>
    //   70  141:iinc            7  1
    //   71  144:goto            108
    //   72  147:aload_0         
    //   73  148:iload_1         
    //   74  149:iload_2         
    //   75  150:invokespecial   #324 <Method void LinearLayoutICS.onMeasure(int, int)>
    //   76  153:return          
    }

    public void setOverflowReserved(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #268 <Field boolean mReserveOverflow>
    //    3    5:return          
    }

    public void setPresenter(ActionMenuPresenter actionmenupresenter)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #279 <Field ActionMenuPresenter mPresenter>
    //    3    5:return          
    }

    static final int GENERATED_ITEM_PADDING = 4;
    static final int MIN_CELL_SIZE = 56;
    private static final String TAG = "ActionMenuView";
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private int mMaxItemHeight;
    private int mMeasuredExtraWidth;
    private MenuBuilder mMenu;
    private int mMinCellSize;
    private ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;
}
