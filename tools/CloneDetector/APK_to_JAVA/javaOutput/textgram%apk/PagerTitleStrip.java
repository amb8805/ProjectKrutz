// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.content.Context;
import android.content.res.*;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//            ViewPager, PagerAdapter, PagerTitleStripIcs

public class PagerTitleStrip extends ViewGroup
    implements ViewPager.Decor
{
    private class PageListener extends DataSetObserver
        implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener
    {

        private PageListener()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field PagerTitleStrip this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void DataSetObserver()>
        //    5    9:return          
        }

        PageListener(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #22  <Method void PagerTitleStrip$PageListener(PagerTitleStrip)>
        //    3    5:return          
        }

        public void onAdapterChanged(PagerAdapter pageradapter, PagerAdapter pageradapter1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field PagerTitleStrip this$0>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokevirtual   #29  <Method void PagerTitleStrip.updateAdapter(PagerAdapter, PagerAdapter)>
        //    5    9:return          
        }

        public void onChanged()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field PagerTitleStrip this$0>
        //    2    4:aload_0         
        //    3    5:getfield        #16  <Field PagerTitleStrip this$0>
        //    4    8:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
        //    5   11:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
        //    6   14:aload_0         
        //    7   15:getfield        #16  <Field PagerTitleStrip this$0>
        //    8   18:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
        //    9   21:invokevirtual   #44  <Method PagerAdapter ViewPager.getAdapter()>
        //   10   24:invokevirtual   #48  <Method void PagerTitleStrip.updateText(int, PagerAdapter)>
        //   11   27:aload_0         
        //   12   28:getfield        #16  <Field PagerTitleStrip this$0>
        //   13   31:invokestatic    #52  <Method float PagerTitleStrip.access$100(PagerTitleStrip)>
        //   14   34:fconst_0        
        //   15   35:fcmpl           
        //   16   36:istore_1        
        //   17   37:fconst_0        
        //   18   38:fstore_2        
        //   19   39:iload_1         
        //   20   40:iflt            51
        //   21   43:aload_0         
        //   22   44:getfield        #16  <Field PagerTitleStrip this$0>
        //   23   47:invokestatic    #52  <Method float PagerTitleStrip.access$100(PagerTitleStrip)>
        //   24   50:fstore_2        
        //   25   51:aload_0         
        //   26   52:getfield        #16  <Field PagerTitleStrip this$0>
        //   27   55:aload_0         
        //   28   56:getfield        #16  <Field PagerTitleStrip this$0>
        //   29   59:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
        //   30   62:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
        //   31   65:fload_2         
        //   32   66:iconst_1        
        //   33   67:invokevirtual   #56  <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
        //   34   70:return          
        }

        public void onPageScrollStateChanged(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #60  <Field int mScrollState>
        //    3    5:return          
        }

        public void onPageScrolled(int i, float f, int j)
        {
        //    0    0:fload_2         
        //    1    1:ldc1            #63  <Float 0.5F>
        //    2    3:fcmpl           
        //    3    4:ifle            10
        //    4    7:iinc            1  1
        //    5   10:aload_0         
        //    6   11:getfield        #16  <Field PagerTitleStrip this$0>
        //    7   14:iload_1         
        //    8   15:fload_2         
        //    9   16:iconst_0        
        //   10   17:invokevirtual   #56  <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
        //   11   20:return          
        }

        public void onPageSelected(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #60  <Field int mScrollState>
        //    2    4:ifne            77
        //    3    7:aload_0         
        //    4    8:getfield        #16  <Field PagerTitleStrip this$0>
        //    5   11:aload_0         
        //    6   12:getfield        #16  <Field PagerTitleStrip this$0>
        //    7   15:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
        //    8   18:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
        //    9   21:aload_0         
        //   10   22:getfield        #16  <Field PagerTitleStrip this$0>
        //   11   25:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
        //   12   28:invokevirtual   #44  <Method PagerAdapter ViewPager.getAdapter()>
        //   13   31:invokevirtual   #48  <Method void PagerTitleStrip.updateText(int, PagerAdapter)>
        //   14   34:aload_0         
        //   15   35:getfield        #16  <Field PagerTitleStrip this$0>
        //   16   38:invokestatic    #52  <Method float PagerTitleStrip.access$100(PagerTitleStrip)>
        //   17   41:fconst_0        
        //   18   42:fcmpl           
        //   19   43:istore_2        
        //   20   44:fconst_0        
        //   21   45:fstore_3        
        //   22   46:iload_2         
        //   23   47:iflt            58
        //   24   50:aload_0         
        //   25   51:getfield        #16  <Field PagerTitleStrip this$0>
        //   26   54:invokestatic    #52  <Method float PagerTitleStrip.access$100(PagerTitleStrip)>
        //   27   57:fstore_3        
        //   28   58:aload_0         
        //   29   59:getfield        #16  <Field PagerTitleStrip this$0>
        //   30   62:aload_0         
        //   31   63:getfield        #16  <Field PagerTitleStrip this$0>
        //   32   66:getfield        #34  <Field ViewPager PagerTitleStrip.mPager>
        //   33   69:invokevirtual   #40  <Method int ViewPager.getCurrentItem()>
        //   34   72:fload_3         
        //   35   73:iconst_1        
        //   36   74:invokevirtual   #56  <Method void PagerTitleStrip.updateTextPositions(int, float, boolean)>
        //   37   77:return          
        }

        private int mScrollState;
        final PagerTitleStrip this$0;
    }

    static interface PagerTitleStripImpl
    {

        public abstract void setSingleLineAllCaps(TextView textview);
    }

    static class PagerTitleStripImplBase
        implements PagerTitleStripImpl
    {

        PagerTitleStripImplBase()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public void setSingleLineAllCaps(TextView textview)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #17  <Method void TextView.setSingleLine()>
        //    2    4:return          
        }
    }

    static class PagerTitleStripImplIcs
        implements PagerTitleStripImpl
    {

        PagerTitleStripImplIcs()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public void setSingleLineAllCaps(TextView textview)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #16  <Method void PagerTitleStripIcs.setSingleLineAllCaps(TextView)>
        //    2    4:return          
        }
    }


    static 
    {
    //    0    0:iconst_4        
    //    1    1:newarray        int[]
    //    2    3:dup             
    //    3    4:iconst_0        
    //    4    5:ldc1            #44  <Int 0x1010034>
    //    5    7:iastore         
    //    6    8:dup             
    //    7    9:iconst_1        
    //    8   10:ldc1            #45  <Int 0x1010095>
    //    9   12:iastore         
    //   10   13:dup             
    //   11   14:iconst_2        
    //   12   15:ldc1            #46  <Int 0x1010098>
    //   13   17:iastore         
    //   14   18:dup             
    //   15   19:iconst_3        
    //   16   20:ldc1            #47  <Int 0x10100af>
    //   17   22:iastore         
    //   18   23:putstatic       #49  <Field int[] ATTRS>
    //   19   26:iconst_1        
    //   20   27:newarray        int[]
    //   21   29:dup             
    //   22   30:iconst_0        
    //   23   31:ldc1            #50  <Int 0x101038c>
    //   24   33:iastore         
    //   25   34:putstatic       #52  <Field int[] TEXT_ATTRS>
    //   26   37:getstatic       #57  <Field int android.os.Build$VERSION.SDK_INT>
    //   27   40:bipush          14
    //   28   42:icmplt          56
    //   29   45:new             #59  <Class PagerTitleStrip$PagerTitleStripImplIcs>
    //   30   48:dup             
    //   31   49:invokespecial   #62  <Method void PagerTitleStrip$PagerTitleStripImplIcs()>
    //   32   52:putstatic       #64  <Field PagerTitleStrip$PagerTitleStripImpl IMPL>
    //   33   55:return          
    //   34   56:new             #66  <Class PagerTitleStrip$PagerTitleStripImplBase>
    //   35   59:dup             
    //   36   60:invokespecial   #67  <Method void PagerTitleStrip$PagerTitleStripImplBase()>
    //   37   63:putstatic       #64  <Field PagerTitleStrip$PagerTitleStripImpl IMPL>
    //   38   66:return          
    }

    public PagerTitleStrip(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #71  <Method void PagerTitleStrip(Context, AttributeSet)>
    //    4    6:return          
    }

    public PagerTitleStrip(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #72  <Method void ViewGroup(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:iconst_m1       
    //    6    8:putfield        #74  <Field int mLastKnownCurrentPage>
    //    7   11:aload_0         
    //    8   12:ldc1            #75  <Float -1F>
    //    9   14:putfield        #77  <Field float mLastKnownPositionOffset>
    //   10   17:aload_0         
    //   11   18:new             #79  <Class PagerTitleStrip$PageListener>
    //   12   21:dup             
    //   13   22:aload_0         
    //   14   23:aconst_null     
    //   15   24:invokespecial   #82  <Method void PagerTitleStrip$PageListener(PagerTitleStrip, PagerTitleStrip$1)>
    //   16   27:putfield        #84  <Field PagerTitleStrip$PageListener mPageListener>
    //   17   30:new             #86  <Class TextView>
    //   18   33:dup             
    //   19   34:aload_1         
    //   20   35:invokespecial   #88  <Method void TextView(Context)>
    //   21   38:astore_3        
    //   22   39:aload_0         
    //   23   40:aload_3         
    //   24   41:putfield        #90  <Field TextView mPrevText>
    //   25   44:aload_0         
    //   26   45:aload_3         
    //   27   46:invokevirtual   #94  <Method void addView(android.view.View)>
    //   28   49:new             #86  <Class TextView>
    //   29   52:dup             
    //   30   53:aload_1         
    //   31   54:invokespecial   #88  <Method void TextView(Context)>
    //   32   57:astore          4
    //   33   59:aload_0         
    //   34   60:aload           4
    //   35   62:putfield        #96  <Field TextView mCurrText>
    //   36   65:aload_0         
    //   37   66:aload           4
    //   38   68:invokevirtual   #94  <Method void addView(android.view.View)>
    //   39   71:new             #86  <Class TextView>
    //   40   74:dup             
    //   41   75:aload_1         
    //   42   76:invokespecial   #88  <Method void TextView(Context)>
    //   43   79:astore          5
    //   44   81:aload_0         
    //   45   82:aload           5
    //   46   84:putfield        #98  <Field TextView mNextText>
    //   47   87:aload_0         
    //   48   88:aload           5
    //   49   90:invokevirtual   #94  <Method void addView(android.view.View)>
    //   50   93:aload_1         
    //   51   94:aload_2         
    //   52   95:getstatic       #49  <Field int[] ATTRS>
    //   53   98:invokevirtual   #104 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
    //   54  101:astore          6
    //   55  103:aload           6
    //   56  105:iconst_0        
    //   57  106:iconst_0        
    //   58  107:invokevirtual   #110 <Method int TypedArray.getResourceId(int, int)>
    //   59  110:istore          7
    //   60  112:iload           7
    //   61  114:ifeq            147
    //   62  117:aload_0         
    //   63  118:getfield        #90  <Field TextView mPrevText>
    //   64  121:aload_1         
    //   65  122:iload           7
    //   66  124:invokevirtual   #114 <Method void TextView.setTextAppearance(Context, int)>
    //   67  127:aload_0         
    //   68  128:getfield        #96  <Field TextView mCurrText>
    //   69  131:aload_1         
    //   70  132:iload           7
    //   71  134:invokevirtual   #114 <Method void TextView.setTextAppearance(Context, int)>
    //   72  137:aload_0         
    //   73  138:getfield        #98  <Field TextView mNextText>
    //   74  141:aload_1         
    //   75  142:iload           7
    //   76  144:invokevirtual   #114 <Method void TextView.setTextAppearance(Context, int)>
    //   77  147:aload           6
    //   78  149:iconst_1        
    //   79  150:iconst_0        
    //   80  151:invokevirtual   #117 <Method int TypedArray.getDimensionPixelSize(int, int)>
    //   81  154:istore          8
    //   82  156:iload           8
    //   83  158:ifeq            169
    //   84  161:aload_0         
    //   85  162:iconst_0        
    //   86  163:iload           8
    //   87  165:i2f             
    //   88  166:invokevirtual   #121 <Method void setTextSize(int, float)>
    //   89  169:aload           6
    //   90  171:iconst_2        
    //   91  172:invokevirtual   #125 <Method boolean TypedArray.hasValue(int)>
    //   92  175:ifeq            214
    //   93  178:aload           6
    //   94  180:iconst_2        
    //   95  181:iconst_0        
    //   96  182:invokevirtual   #128 <Method int TypedArray.getColor(int, int)>
    //   97  185:istore          11
    //   98  187:aload_0         
    //   99  188:getfield        #90  <Field TextView mPrevText>
    //  100  191:iload           11
    //  101  193:invokevirtual   #132 <Method void TextView.setTextColor(int)>
    //  102  196:aload_0         
    //  103  197:getfield        #96  <Field TextView mCurrText>
    //  104  200:iload           11
    //  105  202:invokevirtual   #132 <Method void TextView.setTextColor(int)>
    //  106  205:aload_0         
    //  107  206:getfield        #98  <Field TextView mNextText>
    //  108  209:iload           11
    //  109  211:invokevirtual   #132 <Method void TextView.setTextColor(int)>
    //  110  214:aload_0         
    //  111  215:aload           6
    //  112  217:iconst_3        
    //  113  218:bipush          80
    //  114  220:invokevirtual   #135 <Method int TypedArray.getInteger(int, int)>
    //  115  223:putfield        #137 <Field int mGravity>
    //  116  226:aload           6
    //  117  228:invokevirtual   #140 <Method void TypedArray.recycle()>
    //  118  231:aload_0         
    //  119  232:aload_0         
    //  120  233:getfield        #96  <Field TextView mCurrText>
    //  121  236:invokevirtual   #144 <Method ColorStateList TextView.getTextColors()>
    //  122  239:invokevirtual   #150 <Method int ColorStateList.getDefaultColor()>
    //  123  242:putfield        #152 <Field int mTextColor>
    //  124  245:aload_0         
    //  125  246:ldc1            #13  <Float 0.6F>
    //  126  248:invokevirtual   #156 <Method void setNonPrimaryAlpha(float)>
    //  127  251:aload_0         
    //  128  252:getfield        #90  <Field TextView mPrevText>
    //  129  255:getstatic       #162 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
    //  130  258:invokevirtual   #166 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
    //  131  261:aload_0         
    //  132  262:getfield        #96  <Field TextView mCurrText>
    //  133  265:getstatic       #162 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
    //  134  268:invokevirtual   #166 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
    //  135  271:aload_0         
    //  136  272:getfield        #98  <Field TextView mNextText>
    //  137  275:getstatic       #162 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
    //  138  278:invokevirtual   #166 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
    //  139  281:iconst_0        
    //  140  282:istore          9
    //  141  284:iload           7
    //  142  286:ifeq            314
    //  143  289:aload_1         
    //  144  290:iload           7
    //  145  292:getstatic       #52  <Field int[] TEXT_ATTRS>
    //  146  295:invokevirtual   #169 <Method TypedArray Context.obtainStyledAttributes(int, int[])>
    //  147  298:astore          10
    //  148  300:aload           10
    //  149  302:iconst_0        
    //  150  303:iconst_0        
    //  151  304:invokevirtual   #173 <Method boolean TypedArray.getBoolean(int, boolean)>
    //  152  307:istore          9
    //  153  309:aload           10
    //  154  311:invokevirtual   #140 <Method void TypedArray.recycle()>
    //  155  314:iload           9
    //  156  316:ifeq            359
    //  157  319:aload_0         
    //  158  320:getfield        #90  <Field TextView mPrevText>
    //  159  323:invokestatic    #177 <Method void setSingleLineAllCaps(TextView)>
    //  160  326:aload_0         
    //  161  327:getfield        #96  <Field TextView mCurrText>
    //  162  330:invokestatic    #177 <Method void setSingleLineAllCaps(TextView)>
    //  163  333:aload_0         
    //  164  334:getfield        #98  <Field TextView mNextText>
    //  165  337:invokestatic    #177 <Method void setSingleLineAllCaps(TextView)>
    //  166  340:aload_0         
    //  167  341:ldc1            #178 <Float 16F>
    //  168  343:aload_1         
    //  169  344:invokevirtual   #182 <Method Resources Context.getResources()>
    //  170  347:invokevirtual   #188 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //  171  350:getfield        #193 <Field float DisplayMetrics.density>
    //  172  353:fmul            
    //  173  354:f2i             
    //  174  355:putfield        #195 <Field int mScaledTextSpacing>
    //  175  358:return          
    //  176  359:aload_0         
    //  177  360:getfield        #90  <Field TextView mPrevText>
    //  178  363:invokevirtual   #198 <Method void TextView.setSingleLine()>
    //  179  366:aload_0         
    //  180  367:getfield        #96  <Field TextView mCurrText>
    //  181  370:invokevirtual   #198 <Method void TextView.setSingleLine()>
    //  182  373:aload_0         
    //  183  374:getfield        #98  <Field TextView mNextText>
    //  184  377:invokevirtual   #198 <Method void TextView.setSingleLine()>
    //  185  380:goto            340
    }

    static float access$100(PagerTitleStrip pagertitlestrip)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #77  <Field float mLastKnownPositionOffset>
    //    2    4:freturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #77  <Field float mLastKnownPositionOffset>
    //    5    4:freturn         
    }

    private static void setSingleLineAllCaps(TextView textview)
    {
    //    0    0:getstatic       #64  <Field PagerTitleStrip$PagerTitleStripImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #203 <Method void PagerTitleStrip$PagerTitleStripImpl.setSingleLineAllCaps(TextView)>
    //    3    9:return          
    }

    int getMinHeight()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #208 <Method Drawable getBackground()>
    //    2    4:astore_1        
    //    3    5:iconst_0        
    //    4    6:istore_2        
    //    5    7:aload_1         
    //    6    8:ifnull          16
    //    7   11:aload_1         
    //    8   12:invokevirtual   #213 <Method int Drawable.getIntrinsicHeight()>
    //    9   15:istore_2        
    //   10   16:iload_2         
    //   11   17:ireturn         
    }

    public int getTextSpacing()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #195 <Field int mScaledTextSpacing>
    //    2    4:ireturn         
    }

    protected void onAttachedToWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #217 <Method void ViewGroup.onAttachedToWindow()>
    //    2    4:aload_0         
    //    3    5:invokevirtual   #221 <Method android.view.ViewParent getParent()>
    //    4    8:astore_1        
    //    5    9:aload_1         
    //    6   10:instanceof      #223 <Class ViewPager>
    //    7   13:ifne            26
    //    8   16:new             #225 <Class IllegalStateException>
    //    9   19:dup             
    //   10   20:ldc1            #227 <String "PagerTitleStrip must be a direct child of a ViewPager.">
    //   11   22:invokespecial   #230 <Method void IllegalStateException(String)>
    //   12   25:athrow          
    //   13   26:aload_1         
    //   14   27:checkcast       #223 <Class ViewPager>
    //   15   30:astore_2        
    //   16   31:aload_2         
    //   17   32:invokevirtual   #234 <Method PagerAdapter ViewPager.getAdapter()>
    //   18   35:astore_3        
    //   19   36:aload_2         
    //   20   37:aload_0         
    //   21   38:getfield        #84  <Field PagerTitleStrip$PageListener mPageListener>
    //   22   41:invokevirtual   #238 <Method ViewPager$OnPageChangeListener ViewPager.setInternalPageChangeListener(ViewPager$OnPageChangeListener)>
    //   23   44:pop             
    //   24   45:aload_2         
    //   25   46:aload_0         
    //   26   47:getfield        #84  <Field PagerTitleStrip$PageListener mPageListener>
    //   27   50:invokevirtual   #242 <Method void ViewPager.setOnAdapterChangeListener(ViewPager$OnAdapterChangeListener)>
    //   28   53:aload_0         
    //   29   54:aload_2         
    //   30   55:putfield        #244 <Field ViewPager mPager>
    //   31   58:aload_0         
    //   32   59:getfield        #246 <Field WeakReference mWatchingAdapter>
    //   33   62:ifnull          85
    //   34   65:aload_0         
    //   35   66:getfield        #246 <Field WeakReference mWatchingAdapter>
    //   36   69:invokevirtual   #252 <Method Object WeakReference.get()>
    //   37   72:checkcast       #254 <Class PagerAdapter>
    //   38   75:astore          5
    //   39   77:aload_0         
    //   40   78:aload           5
    //   41   80:aload_3         
    //   42   81:invokevirtual   #258 <Method void updateAdapter(PagerAdapter, PagerAdapter)>
    //   43   84:return          
    //   44   85:aconst_null     
    //   45   86:astore          5
    //   46   88:goto            77
    }

    protected void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #261 <Method void ViewGroup.onDetachedFromWindow()>
    //    2    4:aload_0         
    //    3    5:getfield        #244 <Field ViewPager mPager>
    //    4    8:ifnull          45
    //    5   11:aload_0         
    //    6   12:aload_0         
    //    7   13:getfield        #244 <Field ViewPager mPager>
    //    8   16:invokevirtual   #234 <Method PagerAdapter ViewPager.getAdapter()>
    //    9   19:aconst_null     
    //   10   20:invokevirtual   #258 <Method void updateAdapter(PagerAdapter, PagerAdapter)>
    //   11   23:aload_0         
    //   12   24:getfield        #244 <Field ViewPager mPager>
    //   13   27:aconst_null     
    //   14   28:invokevirtual   #238 <Method ViewPager$OnPageChangeListener ViewPager.setInternalPageChangeListener(ViewPager$OnPageChangeListener)>
    //   15   31:pop             
    //   16   32:aload_0         
    //   17   33:getfield        #244 <Field ViewPager mPager>
    //   18   36:aconst_null     
    //   19   37:invokevirtual   #242 <Method void ViewPager.setOnAdapterChangeListener(ViewPager$OnAdapterChangeListener)>
    //   20   40:aload_0         
    //   21   41:aconst_null     
    //   22   42:putfield        #244 <Field ViewPager mPager>
    //   23   45:return          
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #244 <Field ViewPager mPager>
    //    2    4:ifnull          40
    //    3    7:aload_0         
    //    4    8:getfield        #77  <Field float mLastKnownPositionOffset>
    //    5   11:fconst_0        
    //    6   12:fcmpl           
    //    7   13:istore          6
    //    8   15:fconst_0        
    //    9   16:fstore          7
    //   10   18:iload           6
    //   11   20:iflt            29
    //   12   23:aload_0         
    //   13   24:getfield        #77  <Field float mLastKnownPositionOffset>
    //   14   27:fstore          7
    //   15   29:aload_0         
    //   16   30:aload_0         
    //   17   31:getfield        #74  <Field int mLastKnownCurrentPage>
    //   18   34:fload           7
    //   19   36:iconst_1        
    //   20   37:invokevirtual   #267 <Method void updateTextPositions(int, float, boolean)>
    //   21   40:return          
    }

    protected void onMeasure(int i, int j)
    {
    //    0    0:iload_1         
    //    1    1:invokestatic    #275 <Method int android.view.View$MeasureSpec.getMode(int)>
    //    2    4:istore_3        
    //    3    5:iload_2         
    //    4    6:invokestatic    #275 <Method int android.view.View$MeasureSpec.getMode(int)>
    //    5    9:istore          4
    //    6   11:iload_1         
    //    7   12:invokestatic    #278 <Method int android.view.View$MeasureSpec.getSize(int)>
    //    8   15:istore          5
    //    9   17:iload_2         
    //   10   18:invokestatic    #278 <Method int android.view.View$MeasureSpec.getSize(int)>
    //   11   21:istore          6
    //   12   23:iload_3         
    //   13   24:ldc2            #279 <Int 0x40000000>
    //   14   27:icmpeq          41
    //   15   30:new             #225 <Class IllegalStateException>
    //   16   33:dup             
    //   17   34:ldc2            #281 <String "Must measure with an exact width">
    //   18   37:invokespecial   #230 <Method void IllegalStateException(String)>
    //   19   40:athrow          
    //   20   41:aload_0         
    //   21   42:invokevirtual   #283 <Method int getMinHeight()>
    //   22   45:istore          7
    //   23   47:aload_0         
    //   24   48:invokevirtual   #286 <Method int getPaddingTop()>
    //   25   51:aload_0         
    //   26   52:invokevirtual   #289 <Method int getPaddingBottom()>
    //   27   55:iadd            
    //   28   56:istore          8
    //   29   58:iload           6
    //   30   60:iload           8
    //   31   62:isub            
    //   32   63:istore          9
    //   33   65:ldc2            #290 <Float 0.8F>
    //   34   68:iload           5
    //   35   70:i2f             
    //   36   71:fmul            
    //   37   72:f2i             
    //   38   73:ldc2            #291 <Int 0x80000000>
    //   39   76:invokestatic    #294 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   40   79:istore          10
    //   41   81:iload           9
    //   42   83:ldc2            #291 <Int 0x80000000>
    //   43   86:invokestatic    #294 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   44   89:istore          11
    //   45   91:aload_0         
    //   46   92:getfield        #90  <Field TextView mPrevText>
    //   47   95:iload           10
    //   48   97:iload           11
    //   49   99:invokevirtual   #297 <Method void TextView.measure(int, int)>
    //   50  102:aload_0         
    //   51  103:getfield        #96  <Field TextView mCurrText>
    //   52  106:iload           10
    //   53  108:iload           11
    //   54  110:invokevirtual   #297 <Method void TextView.measure(int, int)>
    //   55  113:aload_0         
    //   56  114:getfield        #98  <Field TextView mNextText>
    //   57  117:iload           10
    //   58  119:iload           11
    //   59  121:invokevirtual   #297 <Method void TextView.measure(int, int)>
    //   60  124:iload           4
    //   61  126:ldc2            #279 <Int 0x40000000>
    //   62  129:icmpne          141
    //   63  132:aload_0         
    //   64  133:iload           5
    //   65  135:iload           6
    //   66  137:invokevirtual   #300 <Method void setMeasuredDimension(int, int)>
    //   67  140:return          
    //   68  141:aload_0         
    //   69  142:iload           5
    //   70  144:iload           7
    //   71  146:iload           8
    //   72  148:aload_0         
    //   73  149:getfield        #96  <Field TextView mCurrText>
    //   74  152:invokevirtual   #303 <Method int TextView.getMeasuredHeight()>
    //   75  155:iadd            
    //   76  156:invokestatic    #308 <Method int Math.max(int, int)>
    //   77  159:invokevirtual   #300 <Method void setMeasuredDimension(int, int)>
    //   78  162:return          
    }

    public void requestLayout()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #311 <Field boolean mUpdatingText>
    //    2    4:ifne            11
    //    3    7:aload_0         
    //    4    8:invokespecial   #313 <Method void ViewGroup.requestLayout()>
    //    5   11:return          
    }

    public void setGravity(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #137 <Field int mGravity>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #315 <Method void requestLayout()>
    //    5    9:return          
    }

    public void setNonPrimaryAlpha(float f)
    {
    //    0    0:aload_0         
    //    1    1:sipush          255
    //    2    4:ldc2            #316 <Float 255F>
    //    3    7:fload_1         
    //    4    8:fmul            
    //    5    9:f2i             
    //    6   10:iand            
    //    7   11:putfield        #318 <Field int mNonPrimaryAlpha>
    //    8   14:aload_0         
    //    9   15:getfield        #318 <Field int mNonPrimaryAlpha>
    //   10   18:bipush          24
    //   11   20:ishl            
    //   12   21:ldc2            #319 <Int 0xffffff>
    //   13   24:aload_0         
    //   14   25:getfield        #152 <Field int mTextColor>
    //   15   28:iand            
    //   16   29:ior             
    //   17   30:istore_2        
    //   18   31:aload_0         
    //   19   32:getfield        #90  <Field TextView mPrevText>
    //   20   35:iload_2         
    //   21   36:invokevirtual   #132 <Method void TextView.setTextColor(int)>
    //   22   39:aload_0         
    //   23   40:getfield        #98  <Field TextView mNextText>
    //   24   43:iload_2         
    //   25   44:invokevirtual   #132 <Method void TextView.setTextColor(int)>
    //   26   47:return          
    }

    public void setTextColor(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #152 <Field int mTextColor>
    //    3    5:aload_0         
    //    4    6:getfield        #96  <Field TextView mCurrText>
    //    5    9:iload_1         
    //    6   10:invokevirtual   #132 <Method void TextView.setTextColor(int)>
    //    7   13:aload_0         
    //    8   14:getfield        #318 <Field int mNonPrimaryAlpha>
    //    9   17:bipush          24
    //   10   19:ishl            
    //   11   20:ldc2            #319 <Int 0xffffff>
    //   12   23:aload_0         
    //   13   24:getfield        #152 <Field int mTextColor>
    //   14   27:iand            
    //   15   28:ior             
    //   16   29:istore_2        
    //   17   30:aload_0         
    //   18   31:getfield        #90  <Field TextView mPrevText>
    //   19   34:iload_2         
    //   20   35:invokevirtual   #132 <Method void TextView.setTextColor(int)>
    //   21   38:aload_0         
    //   22   39:getfield        #98  <Field TextView mNextText>
    //   23   42:iload_2         
    //   24   43:invokevirtual   #132 <Method void TextView.setTextColor(int)>
    //   25   46:return          
    }

    public void setTextSize(int i, float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field TextView mPrevText>
    //    2    4:iload_1         
    //    3    5:fload_2         
    //    4    6:invokevirtual   #320 <Method void TextView.setTextSize(int, float)>
    //    5    9:aload_0         
    //    6   10:getfield        #96  <Field TextView mCurrText>
    //    7   13:iload_1         
    //    8   14:fload_2         
    //    9   15:invokevirtual   #320 <Method void TextView.setTextSize(int, float)>
    //   10   18:aload_0         
    //   11   19:getfield        #98  <Field TextView mNextText>
    //   12   22:iload_1         
    //   13   23:fload_2         
    //   14   24:invokevirtual   #320 <Method void TextView.setTextSize(int, float)>
    //   15   27:return          
    }

    public void setTextSpacing(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #195 <Field int mScaledTextSpacing>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #315 <Method void requestLayout()>
    //    5    9:return          
    }

    void updateAdapter(PagerAdapter pageradapter, PagerAdapter pageradapter1)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          17
    //    2    4:aload_1         
    //    3    5:aload_0         
    //    4    6:getfield        #84  <Field PagerTitleStrip$PageListener mPageListener>
    //    5    9:invokevirtual   #325 <Method void PagerAdapter.unregisterDataSetObserver(DataSetObserver)>
    //    6   12:aload_0         
    //    7   13:aconst_null     
    //    8   14:putfield        #246 <Field WeakReference mWatchingAdapter>
    //    9   17:aload_2         
    //   10   18:ifnull          41
    //   11   21:aload_2         
    //   12   22:aload_0         
    //   13   23:getfield        #84  <Field PagerTitleStrip$PageListener mPageListener>
    //   14   26:invokevirtual   #328 <Method void PagerAdapter.registerDataSetObserver(DataSetObserver)>
    //   15   29:aload_0         
    //   16   30:new             #248 <Class WeakReference>
    //   17   33:dup             
    //   18   34:aload_2         
    //   19   35:invokespecial   #331 <Method void WeakReference(Object)>
    //   20   38:putfield        #246 <Field WeakReference mWatchingAdapter>
    //   21   41:aload_0         
    //   22   42:getfield        #244 <Field ViewPager mPager>
    //   23   45:ifnull          75
    //   24   48:aload_0         
    //   25   49:iconst_m1       
    //   26   50:putfield        #74  <Field int mLastKnownCurrentPage>
    //   27   53:aload_0         
    //   28   54:ldc1            #75  <Float -1F>
    //   29   56:putfield        #77  <Field float mLastKnownPositionOffset>
    //   30   59:aload_0         
    //   31   60:aload_0         
    //   32   61:getfield        #244 <Field ViewPager mPager>
    //   33   64:invokevirtual   #334 <Method int ViewPager.getCurrentItem()>
    //   34   67:aload_2         
    //   35   68:invokevirtual   #338 <Method void updateText(int, PagerAdapter)>
    //   36   71:aload_0         
    //   37   72:invokevirtual   #315 <Method void requestLayout()>
    //   38   75:return          
    }

    void updateText(int i, PagerAdapter pageradapter)
    {
    //    0    0:aload_2         
    //    1    1:ifnull          234
    //    2    4:aload_2         
    //    3    5:invokevirtual   #341 <Method int PagerAdapter.getCount()>
    //    4    8:istore_3        
    //    5    9:aload_0         
    //    6   10:iconst_1        
    //    7   11:putfield        #311 <Field boolean mUpdatingText>
    //    8   14:aconst_null     
    //    9   15:astore          4
    //   10   17:iload_1         
    //   11   18:iconst_1        
    //   12   19:icmplt          38
    //   13   22:aconst_null     
    //   14   23:astore          4
    //   15   25:aload_2         
    //   16   26:ifnull          38
    //   17   29:aload_2         
    //   18   30:iload_1         
    //   19   31:iconst_1        
    //   20   32:isub            
    //   21   33:invokevirtual   #345 <Method CharSequence PagerAdapter.getPageTitle(int)>
    //   22   36:astore          4
    //   23   38:aload_0         
    //   24   39:getfield        #90  <Field TextView mPrevText>
    //   25   42:aload           4
    //   26   44:invokevirtual   #349 <Method void TextView.setText(CharSequence)>
    //   27   47:aload_0         
    //   28   48:getfield        #96  <Field TextView mCurrText>
    //   29   51:astore          5
    //   30   53:aload_2         
    //   31   54:ifnull          239
    //   32   57:iload_1         
    //   33   58:iload_3         
    //   34   59:icmpge          239
    //   35   62:aload_2         
    //   36   63:iload_1         
    //   37   64:invokevirtual   #345 <Method CharSequence PagerAdapter.getPageTitle(int)>
    //   38   67:astore          6
    //   39   69:aload           5
    //   40   71:aload           6
    //   41   73:invokevirtual   #349 <Method void TextView.setText(CharSequence)>
    //   42   76:iload_1         
    //   43   77:iconst_1        
    //   44   78:iadd            
    //   45   79:istore          7
    //   46   81:aconst_null     
    //   47   82:astore          8
    //   48   84:iload           7
    //   49   86:iload_3         
    //   50   87:icmpge          106
    //   51   90:aconst_null     
    //   52   91:astore          8
    //   53   93:aload_2         
    //   54   94:ifnull          106
    //   55   97:aload_2         
    //   56   98:iload_1         
    //   57   99:iconst_1        
    //   58  100:iadd            
    //   59  101:invokevirtual   #345 <Method CharSequence PagerAdapter.getPageTitle(int)>
    //   60  104:astore          8
    //   61  106:aload_0         
    //   62  107:getfield        #98  <Field TextView mNextText>
    //   63  110:aload           8
    //   64  112:invokevirtual   #349 <Method void TextView.setText(CharSequence)>
    //   65  115:aload_0         
    //   66  116:invokevirtual   #352 <Method int getWidth()>
    //   67  119:aload_0         
    //   68  120:invokevirtual   #355 <Method int getPaddingLeft()>
    //   69  123:isub            
    //   70  124:aload_0         
    //   71  125:invokevirtual   #358 <Method int getPaddingRight()>
    //   72  128:isub            
    //   73  129:istore          9
    //   74  131:aload_0         
    //   75  132:invokevirtual   #361 <Method int getHeight()>
    //   76  135:aload_0         
    //   77  136:invokevirtual   #286 <Method int getPaddingTop()>
    //   78  139:isub            
    //   79  140:aload_0         
    //   80  141:invokevirtual   #289 <Method int getPaddingBottom()>
    //   81  144:isub            
    //   82  145:istore          10
    //   83  147:ldc2            #290 <Float 0.8F>
    //   84  150:iload           9
    //   85  152:i2f             
    //   86  153:fmul            
    //   87  154:f2i             
    //   88  155:ldc2            #291 <Int 0x80000000>
    //   89  158:invokestatic    #294 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   90  161:istore          11
    //   91  163:iload           10
    //   92  165:ldc2            #291 <Int 0x80000000>
    //   93  168:invokestatic    #294 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   94  171:istore          12
    //   95  173:aload_0         
    //   96  174:getfield        #90  <Field TextView mPrevText>
    //   97  177:iload           11
    //   98  179:iload           12
    //   99  181:invokevirtual   #297 <Method void TextView.measure(int, int)>
    //  100  184:aload_0         
    //  101  185:getfield        #96  <Field TextView mCurrText>
    //  102  188:iload           11
    //  103  190:iload           12
    //  104  192:invokevirtual   #297 <Method void TextView.measure(int, int)>
    //  105  195:aload_0         
    //  106  196:getfield        #98  <Field TextView mNextText>
    //  107  199:iload           11
    //  108  201:iload           12
    //  109  203:invokevirtual   #297 <Method void TextView.measure(int, int)>
    //  110  206:aload_0         
    //  111  207:iload_1         
    //  112  208:putfield        #74  <Field int mLastKnownCurrentPage>
    //  113  211:aload_0         
    //  114  212:getfield        #363 <Field boolean mUpdatingPositions>
    //  115  215:ifne            228
    //  116  218:aload_0         
    //  117  219:iload_1         
    //  118  220:aload_0         
    //  119  221:getfield        #77  <Field float mLastKnownPositionOffset>
    //  120  224:iconst_0        
    //  121  225:invokevirtual   #267 <Method void updateTextPositions(int, float, boolean)>
    //  122  228:aload_0         
    //  123  229:iconst_0        
    //  124  230:putfield        #311 <Field boolean mUpdatingText>
    //  125  233:return          
    //  126  234:iconst_0        
    //  127  235:istore_3        
    //  128  236:goto            9
    //  129  239:aconst_null     
    //  130  240:astore          6
    //  131  242:goto            69
    }

    void updateTextPositions(int i, float f, boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #74  <Field int mLastKnownCurrentPage>
    //    3    5:icmpeq          488
    //    4    8:aload_0         
    //    5    9:iload_1         
    //    6   10:aload_0         
    //    7   11:getfield        #244 <Field ViewPager mPager>
    //    8   14:invokevirtual   #234 <Method PagerAdapter ViewPager.getAdapter()>
    //    9   17:invokevirtual   #338 <Method void updateText(int, PagerAdapter)>
    //   10   20:aload_0         
    //   11   21:iconst_1        
    //   12   22:putfield        #363 <Field boolean mUpdatingPositions>
    //   13   25:aload_0         
    //   14   26:getfield        #90  <Field TextView mPrevText>
    //   15   29:invokevirtual   #366 <Method int TextView.getMeasuredWidth()>
    //   16   32:istore          4
    //   17   34:aload_0         
    //   18   35:getfield        #96  <Field TextView mCurrText>
    //   19   38:invokevirtual   #366 <Method int TextView.getMeasuredWidth()>
    //   20   41:istore          5
    //   21   43:aload_0         
    //   22   44:getfield        #98  <Field TextView mNextText>
    //   23   47:invokevirtual   #366 <Method int TextView.getMeasuredWidth()>
    //   24   50:istore          6
    //   25   52:iload           5
    //   26   54:iconst_2        
    //   27   55:idiv            
    //   28   56:istore          7
    //   29   58:aload_0         
    //   30   59:invokevirtual   #352 <Method int getWidth()>
    //   31   62:istore          8
    //   32   64:aload_0         
    //   33   65:invokevirtual   #361 <Method int getHeight()>
    //   34   68:istore          9
    //   35   70:aload_0         
    //   36   71:invokevirtual   #355 <Method int getPaddingLeft()>
    //   37   74:istore          10
    //   38   76:aload_0         
    //   39   77:invokevirtual   #358 <Method int getPaddingRight()>
    //   40   80:istore          11
    //   41   82:aload_0         
    //   42   83:invokevirtual   #286 <Method int getPaddingTop()>
    //   43   86:istore          12
    //   44   88:aload_0         
    //   45   89:invokevirtual   #289 <Method int getPaddingBottom()>
    //   46   92:istore          13
    //   47   94:iload           10
    //   48   96:iload           7
    //   49   98:iadd            
    //   50   99:istore          14
    //   51  101:iload           11
    //   52  103:iload           7
    //   53  105:iadd            
    //   54  106:istore          15
    //   55  108:iload           8
    //   56  110:iload           14
    //   57  112:isub            
    //   58  113:iload           15
    //   59  115:isub            
    //   60  116:istore          16
    //   61  118:fload_2         
    //   62  119:ldc2            #367 <Float 0.5F>
    //   63  122:fadd            
    //   64  123:fstore          17
    //   65  125:fload           17
    //   66  127:fconst_1        
    //   67  128:fcmpl           
    //   68  129:ifle            138
    //   69  132:fload           17
    //   70  134:fconst_1        
    //   71  135:fsub            
    //   72  136:fstore          17
    //   73  138:iload           8
    //   74  140:iload           15
    //   75  142:isub            
    //   76  143:fload           17
    //   77  145:iload           16
    //   78  147:i2f             
    //   79  148:fmul            
    //   80  149:f2i             
    //   81  150:isub            
    //   82  151:iload           5
    //   83  153:iconst_2        
    //   84  154:idiv            
    //   85  155:isub            
    //   86  156:istore          18
    //   87  158:iload           18
    //   88  160:iload           5
    //   89  162:iadd            
    //   90  163:istore          19
    //   91  165:aload_0         
    //   92  166:getfield        #90  <Field TextView mPrevText>
    //   93  169:invokevirtual   #370 <Method int TextView.getBaseline()>
    //   94  172:istore          20
    //   95  174:aload_0         
    //   96  175:getfield        #96  <Field TextView mCurrText>
    //   97  178:invokevirtual   #370 <Method int TextView.getBaseline()>
    //   98  181:istore          21
    //   99  183:aload_0         
    //  100  184:getfield        #98  <Field TextView mNextText>
    //  101  187:invokevirtual   #370 <Method int TextView.getBaseline()>
    //  102  190:istore          22
    //  103  192:iload           20
    //  104  194:iload           21
    //  105  196:invokestatic    #308 <Method int Math.max(int, int)>
    //  106  199:iload           22
    //  107  201:invokestatic    #308 <Method int Math.max(int, int)>
    //  108  204:istore          23
    //  109  206:iload           23
    //  110  208:iload           20
    //  111  210:isub            
    //  112  211:istore          24
    //  113  213:iload           23
    //  114  215:iload           21
    //  115  217:isub            
    //  116  218:istore          25
    //  117  220:iload           23
    //  118  222:iload           22
    //  119  224:isub            
    //  120  225:istore          26
    //  121  227:iload           24
    //  122  229:aload_0         
    //  123  230:getfield        #90  <Field TextView mPrevText>
    //  124  233:invokevirtual   #303 <Method int TextView.getMeasuredHeight()>
    //  125  236:iadd            
    //  126  237:istore          27
    //  127  239:iload           25
    //  128  241:aload_0         
    //  129  242:getfield        #96  <Field TextView mCurrText>
    //  130  245:invokevirtual   #303 <Method int TextView.getMeasuredHeight()>
    //  131  248:iadd            
    //  132  249:istore          28
    //  133  251:iload           26
    //  134  253:aload_0         
    //  135  254:getfield        #98  <Field TextView mNextText>
    //  136  257:invokevirtual   #303 <Method int TextView.getMeasuredHeight()>
    //  137  260:iadd            
    //  138  261:istore          29
    //  139  263:iload           27
    //  140  265:iload           28
    //  141  267:invokestatic    #308 <Method int Math.max(int, int)>
    //  142  270:iload           29
    //  143  272:invokestatic    #308 <Method int Math.max(int, int)>
    //  144  275:istore          30
    //  145  277:bipush          112
    //  146  279:aload_0         
    //  147  280:getfield        #137 <Field int mGravity>
    //  148  283:iand            
    //  149  284:lookupswitch    2: default 312
    //                   16: 502
    //                   80: 541
    //  150  312:iload           12
    //  151  314:iload           24
    //  152  316:iadd            
    //  153  317:istore          32
    //  154  319:iload           12
    //  155  321:iload           25
    //  156  323:iadd            
    //  157  324:istore          33
    //  158  326:iload           12
    //  159  328:iload           26
    //  160  330:iadd            
    //  161  331:istore          34
    //  162  333:aload_0         
    //  163  334:getfield        #96  <Field TextView mCurrText>
    //  164  337:astore          35
    //  165  339:iload           33
    //  166  341:aload_0         
    //  167  342:getfield        #96  <Field TextView mCurrText>
    //  168  345:invokevirtual   #303 <Method int TextView.getMeasuredHeight()>
    //  169  348:iadd            
    //  170  349:istore          36
    //  171  351:aload           35
    //  172  353:iload           18
    //  173  355:iload           33
    //  174  357:iload           19
    //  175  359:iload           36
    //  176  361:invokevirtual   #374 <Method void TextView.layout(int, int, int, int)>
    //  177  364:iload           10
    //  178  366:iload           18
    //  179  368:aload_0         
    //  180  369:getfield        #195 <Field int mScaledTextSpacing>
    //  181  372:isub            
    //  182  373:iload           4
    //  183  375:isub            
    //  184  376:invokestatic    #377 <Method int Math.min(int, int)>
    //  185  379:istore          37
    //  186  381:aload_0         
    //  187  382:getfield        #90  <Field TextView mPrevText>
    //  188  385:astore          38
    //  189  387:iload           37
    //  190  389:iload           4
    //  191  391:iadd            
    //  192  392:istore          39
    //  193  394:iload           32
    //  194  396:aload_0         
    //  195  397:getfield        #90  <Field TextView mPrevText>
    //  196  400:invokevirtual   #303 <Method int TextView.getMeasuredHeight()>
    //  197  403:iadd            
    //  198  404:istore          40
    //  199  406:aload           38
    //  200  408:iload           37
    //  201  410:iload           32
    //  202  412:iload           39
    //  203  414:iload           40
    //  204  416:invokevirtual   #374 <Method void TextView.layout(int, int, int, int)>
    //  205  419:iload           8
    //  206  421:iload           11
    //  207  423:isub            
    //  208  424:iload           6
    //  209  426:isub            
    //  210  427:iload           19
    //  211  429:aload_0         
    //  212  430:getfield        #195 <Field int mScaledTextSpacing>
    //  213  433:iadd            
    //  214  434:invokestatic    #308 <Method int Math.max(int, int)>
    //  215  437:istore          41
    //  216  439:aload_0         
    //  217  440:getfield        #98  <Field TextView mNextText>
    //  218  443:astore          42
    //  219  445:iload           41
    //  220  447:iload           6
    //  221  449:iadd            
    //  222  450:istore          43
    //  223  452:iload           34
    //  224  454:aload_0         
    //  225  455:getfield        #98  <Field TextView mNextText>
    //  226  458:invokevirtual   #303 <Method int TextView.getMeasuredHeight()>
    //  227  461:iadd            
    //  228  462:istore          44
    //  229  464:aload           42
    //  230  466:iload           41
    //  231  468:iload           34
    //  232  470:iload           43
    //  233  472:iload           44
    //  234  474:invokevirtual   #374 <Method void TextView.layout(int, int, int, int)>
    //  235  477:aload_0         
    //  236  478:fload_2         
    //  237  479:putfield        #77  <Field float mLastKnownPositionOffset>
    //  238  482:aload_0         
    //  239  483:iconst_0        
    //  240  484:putfield        #363 <Field boolean mUpdatingPositions>
    //  241  487:return          
    //  242  488:iload_3         
    //  243  489:ifne            20
    //  244  492:fload_2         
    //  245  493:aload_0         
    //  246  494:getfield        #77  <Field float mLastKnownPositionOffset>
    //  247  497:fcmpl           
    //  248  498:ifne            20
    //  249  501:return          
    //  250  502:iload           9
    //  251  504:iload           12
    //  252  506:isub            
    //  253  507:iload           13
    //  254  509:isub            
    //  255  510:iload           30
    //  256  512:isub            
    //  257  513:iconst_2        
    //  258  514:idiv            
    //  259  515:istore          45
    //  260  517:iload           45
    //  261  519:iload           24
    //  262  521:iadd            
    //  263  522:istore          32
    //  264  524:iload           45
    //  265  526:iload           25
    //  266  528:iadd            
    //  267  529:istore          33
    //  268  531:iload           45
    //  269  533:iload           26
    //  270  535:iadd            
    //  271  536:istore          34
    //  272  538:goto            333
    //  273  541:iload           9
    //  274  543:iload           13
    //  275  545:isub            
    //  276  546:iload           30
    //  277  548:isub            
    //  278  549:istore          31
    //  279  551:iload           31
    //  280  553:iload           24
    //  281  555:iadd            
    //  282  556:istore          32
    //  283  558:iload           31
    //  284  560:iload           25
    //  285  562:iadd            
    //  286  563:istore          33
    //  287  565:iload           31
    //  288  567:iload           26
    //  289  569:iadd            
    //  290  570:istore          34
    //  291  572:goto            333
    }

    private static final int ATTRS[];
    private static final PagerTitleStripImpl IMPL;
    private static final float SIDE_ALPHA = 0.6F;
    private static final String TAG = "PagerTitleStrip";
    private static final int TEXT_ATTRS[];
    private static final int TEXT_SPACING = 16;
    TextView mCurrText;
    private int mGravity;
    private int mLastKnownCurrentPage;
    private float mLastKnownPositionOffset;
    TextView mNextText;
    private int mNonPrimaryAlpha;
    private final PageListener mPageListener;
    ViewPager mPager;
    TextView mPrevText;
    private int mScaledTextSpacing;
    int mTextColor;
    private boolean mUpdatingPositions;
    private boolean mUpdatingText;
    private WeakReference mWatchingAdapter;

    static float access$100(PagerTitleStrip pagertitlestrip)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #77  <Field float mLastKnownPositionOffset>
    //    2    4:freturn         
    }

    // Unreferenced inner class android/support/v4/view/PagerTitleStrip$1

/* anonymous class */
    static class _cls1
    {
    }

}
