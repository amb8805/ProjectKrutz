// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.*;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.*;
import android.util.AttributeSet;
import android.view.*;
import java.util.ArrayList;

// Referenced classes of package com.viewpagerindicator:
//            PageIndicator

public class TitlePageIndicator extends View
    implements PageIndicator
{
    public static final class IndicatorStyle extends Enum
    {

        static 
        {
        //    0    0:new             #2   <Class TitlePageIndicator$IndicatorStyle>
        //    1    3:dup             
        //    2    4:ldc1            #16  <String "None">
        //    3    6:iconst_0        
        //    4    7:iconst_0        
        //    5    8:invokespecial   #20  <Method void TitlePageIndicator$IndicatorStyle(String, int, int)>
        //    6   11:putstatic       #22  <Field TitlePageIndicator$IndicatorStyle None>
        //    7   14:new             #2   <Class TitlePageIndicator$IndicatorStyle>
        //    8   17:dup             
        //    9   18:ldc1            #23  <String "Triangle">
        //   10   20:iconst_1        
        //   11   21:iconst_1        
        //   12   22:invokespecial   #20  <Method void TitlePageIndicator$IndicatorStyle(String, int, int)>
        //   13   25:putstatic       #25  <Field TitlePageIndicator$IndicatorStyle Triangle>
        //   14   28:new             #2   <Class TitlePageIndicator$IndicatorStyle>
        //   15   31:dup             
        //   16   32:ldc1            #26  <String "Underline">
        //   17   34:iconst_2        
        //   18   35:iconst_2        
        //   19   36:invokespecial   #20  <Method void TitlePageIndicator$IndicatorStyle(String, int, int)>
        //   20   39:putstatic       #28  <Field TitlePageIndicator$IndicatorStyle Underline>
        //   21   42:iconst_3        
        //   22   43:anewarray       IndicatorStyle[]
        //   23   46:astore_0        
        //   24   47:aload_0         
        //   25   48:iconst_0        
        //   26   49:getstatic       #22  <Field TitlePageIndicator$IndicatorStyle None>
        //   27   52:aastore         
        //   28   53:aload_0         
        //   29   54:iconst_1        
        //   30   55:getstatic       #25  <Field TitlePageIndicator$IndicatorStyle Triangle>
        //   31   58:aastore         
        //   32   59:aload_0         
        //   33   60:iconst_2        
        //   34   61:getstatic       #28  <Field TitlePageIndicator$IndicatorStyle Underline>
        //   35   64:aastore         
        //   36   65:aload_0         
        //   37   66:putstatic       #30  <Field TitlePageIndicator$IndicatorStyle[] ENUM$VALUES>
        //   38   69:return          
        }

        private IndicatorStyle(String s, int i, int j)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #33  <Method void Enum(String, int)>
        //    4    6:aload_0         
        //    5    7:iload_3         
        //    6    8:putfield        #35  <Field int value>
        //    7   11:return          
        }

        public static IndicatorStyle fromValue(int i)
        {
        //    0    0:invokestatic    #41  <Method TitlePageIndicator$IndicatorStyle[] values()>
        //    1    3:astore_1        
        //    2    4:aload_1         
        //    3    5:arraylength     
        //    4    6:istore_2        
        //    5    7:iconst_0        
        //    6    8:istore_3        
        //    7    9:iload_3         
        //    8   10:iload_2         
        //    9   11:icmplt          20
        //   10   14:aconst_null     
        //   11   15:astore          4
        //   12   17:aload           4
        //   13   19:areturn         
        //   14   20:aload_1         
        //   15   21:iload_3         
        //   16   22:aaload          
        //   17   23:astore          4
        //   18   25:aload           4
        //   19   27:getfield        #35  <Field int value>
        //   20   30:iload_0         
        //   21   31:icmpeq          17
        //   22   34:iinc            3  1
        //   23   37:goto            9
        }

        public static IndicatorStyle valueOf(String s)
        {
        //    0    0:ldc1            #2   <Class TitlePageIndicator$IndicatorStyle>
        //    1    2:aload_0         
        //    2    3:invokestatic    #46  <Method Enum Enum.valueOf(Class, String)>
        //    3    6:checkcast       #2   <Class TitlePageIndicator$IndicatorStyle>
        //    4    9:areturn         
        }

        public static IndicatorStyle[] values()
        {
        //    0    0:getstatic       #30  <Field TitlePageIndicator$IndicatorStyle[] ENUM$VALUES>
        //    1    3:astore_0        
        //    2    4:aload_0         
        //    3    5:arraylength     
        //    4    6:istore_1        
        //    5    7:iload_1         
        //    6    8:anewarray       IndicatorStyle[]
        //    7   11:astore_2        
        //    8   12:aload_0         
        //    9   13:iconst_0        
        //   10   14:aload_2         
        //   11   15:iconst_0        
        //   12   16:iload_1         
        //   13   17:invokestatic    #52  <Method void System.arraycopy(Object, int, Object, int, int)>
        //   14   20:aload_2         
        //   15   21:areturn         
        }

        private static final IndicatorStyle ENUM$VALUES[];
        public static final IndicatorStyle None;
        public static final IndicatorStyle Triangle;
        public static final IndicatorStyle Underline;
        public final int value;
    }

    public static final class LinePosition extends Enum
    {

        static 
        {
        //    0    0:new             #2   <Class TitlePageIndicator$LinePosition>
        //    1    3:dup             
        //    2    4:ldc1            #15  <String "Bottom">
        //    3    6:iconst_0        
        //    4    7:iconst_0        
        //    5    8:invokespecial   #19  <Method void TitlePageIndicator$LinePosition(String, int, int)>
        //    6   11:putstatic       #21  <Field TitlePageIndicator$LinePosition Bottom>
        //    7   14:new             #2   <Class TitlePageIndicator$LinePosition>
        //    8   17:dup             
        //    9   18:ldc1            #22  <String "Top">
        //   10   20:iconst_1        
        //   11   21:iconst_1        
        //   12   22:invokespecial   #19  <Method void TitlePageIndicator$LinePosition(String, int, int)>
        //   13   25:putstatic       #24  <Field TitlePageIndicator$LinePosition Top>
        //   14   28:iconst_2        
        //   15   29:anewarray       LinePosition[]
        //   16   32:astore_0        
        //   17   33:aload_0         
        //   18   34:iconst_0        
        //   19   35:getstatic       #21  <Field TitlePageIndicator$LinePosition Bottom>
        //   20   38:aastore         
        //   21   39:aload_0         
        //   22   40:iconst_1        
        //   23   41:getstatic       #24  <Field TitlePageIndicator$LinePosition Top>
        //   24   44:aastore         
        //   25   45:aload_0         
        //   26   46:putstatic       #26  <Field TitlePageIndicator$LinePosition[] ENUM$VALUES>
        //   27   49:return          
        }

        private LinePosition(String s, int i, int j)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #29  <Method void Enum(String, int)>
        //    4    6:aload_0         
        //    5    7:iload_3         
        //    6    8:putfield        #31  <Field int value>
        //    7   11:return          
        }

        public static LinePosition fromValue(int i)
        {
        //    0    0:invokestatic    #37  <Method TitlePageIndicator$LinePosition[] values()>
        //    1    3:astore_1        
        //    2    4:aload_1         
        //    3    5:arraylength     
        //    4    6:istore_2        
        //    5    7:iconst_0        
        //    6    8:istore_3        
        //    7    9:iload_3         
        //    8   10:iload_2         
        //    9   11:icmplt          20
        //   10   14:aconst_null     
        //   11   15:astore          4
        //   12   17:aload           4
        //   13   19:areturn         
        //   14   20:aload_1         
        //   15   21:iload_3         
        //   16   22:aaload          
        //   17   23:astore          4
        //   18   25:aload           4
        //   19   27:getfield        #31  <Field int value>
        //   20   30:iload_0         
        //   21   31:icmpeq          17
        //   22   34:iinc            3  1
        //   23   37:goto            9
        }

        public static LinePosition valueOf(String s)
        {
        //    0    0:ldc1            #2   <Class TitlePageIndicator$LinePosition>
        //    1    2:aload_0         
        //    2    3:invokestatic    #42  <Method Enum Enum.valueOf(Class, String)>
        //    3    6:checkcast       #2   <Class TitlePageIndicator$LinePosition>
        //    4    9:areturn         
        }

        public static LinePosition[] values()
        {
        //    0    0:getstatic       #26  <Field TitlePageIndicator$LinePosition[] ENUM$VALUES>
        //    1    3:astore_0        
        //    2    4:aload_0         
        //    3    5:arraylength     
        //    4    6:istore_1        
        //    5    7:iload_1         
        //    6    8:anewarray       LinePosition[]
        //    7   11:astore_2        
        //    8   12:aload_0         
        //    9   13:iconst_0        
        //   10   14:aload_2         
        //   11   15:iconst_0        
        //   12   16:iload_1         
        //   13   17:invokestatic    #48  <Method void System.arraycopy(Object, int, Object, int, int)>
        //   14   20:aload_2         
        //   15   21:areturn         
        }

        public static final LinePosition Bottom;
        private static final LinePosition ENUM$VALUES[];
        public static final LinePosition Top;
        public final int value;
    }

    public static interface OnCenterItemClickListener
    {

        public abstract void onCenterItemClick(int i);
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        static 
        {
        //    0    0:new             #13  <Class TitlePageIndicator$SavedState$1>
        //    1    3:dup             
        //    2    4:invokespecial   #16  <Method void TitlePageIndicator$SavedState$1()>
        //    3    7:putstatic       #18  <Field android.os.Parcelable$Creator CREATOR>
        //    4   10:return          
        }

        private SavedState(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #21  <Method void android.view.View$BaseSavedState(Parcel)>
        //    3    5:aload_0         
        //    4    6:aload_1         
        //    5    7:invokevirtual   #27  <Method int Parcel.readInt()>
        //    6   10:putfield        #29  <Field int currentPage>
        //    7   13:return          
        }

        SavedState(Parcel parcel, SavedState savedstate)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #31  <Method void TitlePageIndicator$SavedState(Parcel)>
        //    3    5:return          
        }

        public SavedState(Parcelable parcelable)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #34  <Method void android.view.View$BaseSavedState(Parcelable)>
        //    3    5:return          
        }

        public void writeToParcel(Parcel parcel, int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #38  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
        //    4    6:aload_1         
        //    5    7:aload_0         
        //    6    8:getfield        #29  <Field int currentPage>
        //    7   11:invokevirtual   #42  <Method void Parcel.writeInt(int)>
        //    8   14:return          
        }

        public static final android.os.Parcelable.Creator CREATOR;
        int currentPage;
    }


    static int[] $SWITCH_TABLE$com$viewpagerindicator$TitlePageIndicator$IndicatorStyle()
    {
    //    0    0:getstatic       #61  <Field int[] $SWITCH_TABLE$com$viewpagerindicator$TitlePageIndicator$IndicatorStyle>
    //    1    3:astore_0        
    //    2    4:aload_0         
    //    3    5:ifnull          10
    //    4    8:aload_0         
    //    5    9:areturn         
    //    6   10:invokestatic    #67  <Method TitlePageIndicator$IndicatorStyle[] TitlePageIndicator$IndicatorStyle.values()>
    //    7   13:arraylength     
    //    8   14:newarray        int[]
    //    9   16:astore_1        
    // try 17 26 handler(s) 59
    //   10   17:aload_1         
    //   11   18:getstatic       #70  <Field TitlePageIndicator$IndicatorStyle TitlePageIndicator$IndicatorStyle.None>
    //   12   21:invokevirtual   #74  <Method int TitlePageIndicator$IndicatorStyle.ordinal()>
    //   13   24:iconst_1        
    //   14   25:iastore         
    // try 26 35 handler(s) 55
    //   15   26:aload_1         
    //   16   27:getstatic       #77  <Field TitlePageIndicator$IndicatorStyle TitlePageIndicator$IndicatorStyle.Triangle>
    //   17   30:invokevirtual   #74  <Method int TitlePageIndicator$IndicatorStyle.ordinal()>
    //   18   33:iconst_2        
    //   19   34:iastore         
    // try 35 44 handler(s) 50
    //   20   35:aload_1         
    //   21   36:getstatic       #80  <Field TitlePageIndicator$IndicatorStyle TitlePageIndicator$IndicatorStyle.Underline>
    //   22   39:invokevirtual   #74  <Method int TitlePageIndicator$IndicatorStyle.ordinal()>
    //   23   42:iconst_3        
    //   24   43:iastore         
    //   25   44:aload_1         
    //   26   45:putstatic       #61  <Field int[] $SWITCH_TABLE$com$viewpagerindicator$TitlePageIndicator$IndicatorStyle>
    //   27   48:aload_1         
    //   28   49:areturn         
    // catch NoSuchFieldError
    //   29   50:astore          4
    //   30   52:goto            44
    // catch NoSuchFieldError
    //   31   55:astore_3        
    //   32   56:goto            35
    // catch NoSuchFieldError
    //   33   59:astore_2        
    //   34   60:goto            26
    }

    public TitlePageIndicator(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #85  <Method void TitlePageIndicator(Context, AttributeSet)>
    //    4    6:return          
    }

    public TitlePageIndicator(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:getstatic       #90  <Field int R$attr.vpiTitlePageIndicatorStyle>
    //    4    6:invokespecial   #93  <Method void TitlePageIndicator(Context, AttributeSet, int)>
    //    5    9:return          
    }

    public TitlePageIndicator(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #94  <Method void View(Context, AttributeSet, int)>
    //    5    7:aload_0         
    //    6    8:iconst_m1       
    //    7    9:putfield        #96  <Field int mCurrentPage>
    //    8   12:aload_0         
    //    9   13:new             #98  <Class Paint>
    //   10   16:dup             
    //   11   17:invokespecial   #101 <Method void Paint()>
    //   12   20:putfield        #103 <Field Paint mPaintText>
    //   13   23:aload_0         
    //   14   24:new             #105 <Class Path>
    //   15   27:dup             
    //   16   28:invokespecial   #106 <Method void Path()>
    //   17   31:putfield        #108 <Field Path mPath>
    //   18   34:aload_0         
    //   19   35:new             #110 <Class Rect>
    //   20   38:dup             
    //   21   39:invokespecial   #111 <Method void Rect()>
    //   22   42:putfield        #113 <Field Rect mBounds>
    //   23   45:aload_0         
    //   24   46:new             #98  <Class Paint>
    //   25   49:dup             
    //   26   50:invokespecial   #101 <Method void Paint()>
    //   27   53:putfield        #115 <Field Paint mPaintFooterLine>
    //   28   56:aload_0         
    //   29   57:new             #98  <Class Paint>
    //   30   60:dup             
    //   31   61:invokespecial   #101 <Method void Paint()>
    //   32   64:putfield        #117 <Field Paint mPaintFooterIndicator>
    //   33   67:aload_0         
    //   34   68:ldc1            #118 <Float -1F>
    //   35   70:putfield        #120 <Field float mLastMotionX>
    //   36   73:aload_0         
    //   37   74:iconst_m1       
    //   38   75:putfield        #122 <Field int mActivePointerId>
    //   39   78:aload_0         
    //   40   79:invokevirtual   #126 <Method boolean isInEditMode()>
    //   41   82:ifeq            86
    //   42   85:return          
    //   43   86:aload_0         
    //   44   87:invokevirtual   #130 <Method Resources getResources()>
    //   45   90:astore          4
    //   46   92:aload           4
    //   47   94:getstatic       #135 <Field int R$color.default_title_indicator_footer_color>
    //   48   97:invokevirtual   #141 <Method int Resources.getColor(int)>
    //   49  100:istore          5
    //   50  102:aload           4
    //   51  104:getstatic       #146 <Field int R$dimen.default_title_indicator_footer_line_height>
    //   52  107:invokevirtual   #150 <Method float Resources.getDimension(int)>
    //   53  110:fstore          6
    //   54  112:aload           4
    //   55  114:getstatic       #155 <Field int R$integer.default_title_indicator_footer_indicator_style>
    //   56  117:invokevirtual   #158 <Method int Resources.getInteger(int)>
    //   57  120:istore          7
    //   58  122:aload           4
    //   59  124:getstatic       #161 <Field int R$dimen.default_title_indicator_footer_indicator_height>
    //   60  127:invokevirtual   #150 <Method float Resources.getDimension(int)>
    //   61  130:fstore          8
    //   62  132:aload           4
    //   63  134:getstatic       #164 <Field int R$dimen.default_title_indicator_footer_indicator_underline_padding>
    //   64  137:invokevirtual   #150 <Method float Resources.getDimension(int)>
    //   65  140:fstore          9
    //   66  142:aload           4
    //   67  144:getstatic       #167 <Field int R$dimen.default_title_indicator_footer_padding>
    //   68  147:invokevirtual   #150 <Method float Resources.getDimension(int)>
    //   69  150:fstore          10
    //   70  152:aload           4
    //   71  154:getstatic       #170 <Field int R$integer.default_title_indicator_line_position>
    //   72  157:invokevirtual   #158 <Method int Resources.getInteger(int)>
    //   73  160:istore          11
    //   74  162:aload           4
    //   75  164:getstatic       #173 <Field int R$color.default_title_indicator_selected_color>
    //   76  167:invokevirtual   #141 <Method int Resources.getColor(int)>
    //   77  170:istore          12
    //   78  172:aload           4
    //   79  174:getstatic       #178 <Field int R$bool.default_title_indicator_selected_bold>
    //   80  177:invokevirtual   #182 <Method boolean Resources.getBoolean(int)>
    //   81  180:istore          13
    //   82  182:aload           4
    //   83  184:getstatic       #185 <Field int R$color.default_title_indicator_text_color>
    //   84  187:invokevirtual   #141 <Method int Resources.getColor(int)>
    //   85  190:istore          14
    //   86  192:aload           4
    //   87  194:getstatic       #188 <Field int R$dimen.default_title_indicator_text_size>
    //   88  197:invokevirtual   #150 <Method float Resources.getDimension(int)>
    //   89  200:fstore          15
    //   90  202:aload           4
    //   91  204:getstatic       #191 <Field int R$dimen.default_title_indicator_title_padding>
    //   92  207:invokevirtual   #150 <Method float Resources.getDimension(int)>
    //   93  210:fstore          16
    //   94  212:aload           4
    //   95  214:getstatic       #194 <Field int R$dimen.default_title_indicator_clip_padding>
    //   96  217:invokevirtual   #150 <Method float Resources.getDimension(int)>
    //   97  220:fstore          17
    //   98  222:aload           4
    //   99  224:getstatic       #197 <Field int R$dimen.default_title_indicator_top_padding>
    //  100  227:invokevirtual   #150 <Method float Resources.getDimension(int)>
    //  101  230:fstore          18
    //  102  232:aload_1         
    //  103  233:aload_2         
    //  104  234:getstatic       #202 <Field int[] R$styleable.TitlePageIndicator>
    //  105  237:iload_3         
    //  106  238:iconst_0        
    //  107  239:invokevirtual   #208 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
    //  108  242:astore          19
    //  109  244:aload_0         
    //  110  245:aload           19
    //  111  247:bipush          6
    //  112  249:fload           6
    //  113  251:invokevirtual   #213 <Method float TypedArray.getDimension(int, float)>
    //  114  254:putfield        #215 <Field float mFooterLineHeight>
    //  115  257:aload_0         
    //  116  258:aload           19
    //  117  260:bipush          7
    //  118  262:iload           7
    //  119  264:invokevirtual   #218 <Method int TypedArray.getInteger(int, int)>
    //  120  267:invokestatic    #222 <Method TitlePageIndicator$IndicatorStyle TitlePageIndicator$IndicatorStyle.fromValue(int)>
    //  121  270:putfield        #224 <Field TitlePageIndicator$IndicatorStyle mFooterIndicatorStyle>
    //  122  273:aload_0         
    //  123  274:aload           19
    //  124  276:bipush          8
    //  125  278:fload           8
    //  126  280:invokevirtual   #213 <Method float TypedArray.getDimension(int, float)>
    //  127  283:putfield        #226 <Field float mFooterIndicatorHeight>
    //  128  286:aload_0         
    //  129  287:aload           19
    //  130  289:bipush          9
    //  131  291:fload           9
    //  132  293:invokevirtual   #213 <Method float TypedArray.getDimension(int, float)>
    //  133  296:putfield        #228 <Field float mFooterIndicatorUnderlinePadding>
    //  134  299:aload_0         
    //  135  300:aload           19
    //  136  302:bipush          10
    //  137  304:fload           10
    //  138  306:invokevirtual   #213 <Method float TypedArray.getDimension(int, float)>
    //  139  309:putfield        #230 <Field float mFooterPadding>
    //  140  312:aload_0         
    //  141  313:aload           19
    //  142  315:bipush          11
    //  143  317:iload           11
    //  144  319:invokevirtual   #218 <Method int TypedArray.getInteger(int, int)>
    //  145  322:invokestatic    #235 <Method TitlePageIndicator$LinePosition TitlePageIndicator$LinePosition.fromValue(int)>
    //  146  325:putfield        #237 <Field TitlePageIndicator$LinePosition mLinePosition>
    //  147  328:aload_0         
    //  148  329:aload           19
    //  149  331:bipush          14
    //  150  333:fload           18
    //  151  335:invokevirtual   #213 <Method float TypedArray.getDimension(int, float)>
    //  152  338:putfield        #239 <Field float mTopPadding>
    //  153  341:aload_0         
    //  154  342:aload           19
    //  155  344:bipush          13
    //  156  346:fload           16
    //  157  348:invokevirtual   #213 <Method float TypedArray.getDimension(int, float)>
    //  158  351:putfield        #241 <Field float mTitlePadding>
    //  159  354:aload_0         
    //  160  355:aload           19
    //  161  357:iconst_4        
    //  162  358:fload           17
    //  163  360:invokevirtual   #213 <Method float TypedArray.getDimension(int, float)>
    //  164  363:putfield        #243 <Field float mClipPadding>
    //  165  366:aload_0         
    //  166  367:aload           19
    //  167  369:iconst_3        
    //  168  370:iload           12
    //  169  372:invokevirtual   #245 <Method int TypedArray.getColor(int, int)>
    //  170  375:putfield        #247 <Field int mColorSelected>
    //  171  378:aload_0         
    //  172  379:aload           19
    //  173  381:iconst_1        
    //  174  382:iload           14
    //  175  384:invokevirtual   #245 <Method int TypedArray.getColor(int, int)>
    //  176  387:putfield        #249 <Field int mColorText>
    //  177  390:aload_0         
    //  178  391:aload           19
    //  179  393:bipush          12
    //  180  395:iload           13
    //  181  397:invokevirtual   #252 <Method boolean TypedArray.getBoolean(int, boolean)>
    //  182  400:putfield        #254 <Field boolean mBoldText>
    //  183  403:aload           19
    //  184  405:iconst_0        
    //  185  406:fload           15
    //  186  408:invokevirtual   #213 <Method float TypedArray.getDimension(int, float)>
    //  187  411:fstore          20
    //  188  413:aload           19
    //  189  415:iconst_5        
    //  190  416:iload           5
    //  191  418:invokevirtual   #245 <Method int TypedArray.getColor(int, int)>
    //  192  421:istore          21
    //  193  423:aload_0         
    //  194  424:getfield        #103 <Field Paint mPaintText>
    //  195  427:fload           20
    //  196  429:invokevirtual   #258 <Method void Paint.setTextSize(float)>
    //  197  432:aload_0         
    //  198  433:getfield        #103 <Field Paint mPaintText>
    //  199  436:iconst_1        
    //  200  437:invokevirtual   #262 <Method void Paint.setAntiAlias(boolean)>
    //  201  440:aload_0         
    //  202  441:getfield        #115 <Field Paint mPaintFooterLine>
    //  203  444:getstatic       #268 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL_AND_STROKE>
    //  204  447:invokevirtual   #272 <Method void Paint.setStyle(android.graphics.Paint$Style)>
    //  205  450:aload_0         
    //  206  451:getfield        #115 <Field Paint mPaintFooterLine>
    //  207  454:aload_0         
    //  208  455:getfield        #215 <Field float mFooterLineHeight>
    //  209  458:invokevirtual   #275 <Method void Paint.setStrokeWidth(float)>
    //  210  461:aload_0         
    //  211  462:getfield        #115 <Field Paint mPaintFooterLine>
    //  212  465:iload           21
    //  213  467:invokevirtual   #279 <Method void Paint.setColor(int)>
    //  214  470:aload_0         
    //  215  471:getfield        #117 <Field Paint mPaintFooterIndicator>
    //  216  474:getstatic       #268 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL_AND_STROKE>
    //  217  477:invokevirtual   #272 <Method void Paint.setStyle(android.graphics.Paint$Style)>
    //  218  480:aload_0         
    //  219  481:getfield        #117 <Field Paint mPaintFooterIndicator>
    //  220  484:iload           21
    //  221  486:invokevirtual   #279 <Method void Paint.setColor(int)>
    //  222  489:aload           19
    //  223  491:iconst_2        
    //  224  492:invokevirtual   #283 <Method android.graphics.drawable.Drawable TypedArray.getDrawable(int)>
    //  225  495:astore          22
    //  226  497:aload           22
    //  227  499:ifnull          508
    //  228  502:aload_0         
    //  229  503:aload           22
    //  230  505:invokevirtual   #287 <Method void setBackgroundDrawable(android.graphics.drawable.Drawable)>
    //  231  508:aload           19
    //  232  510:invokevirtual   #290 <Method void TypedArray.recycle()>
    //  233  513:aload_0         
    //  234  514:aload_1         
    //  235  515:invokestatic    #296 <Method ViewConfiguration ViewConfiguration.get(Context)>
    //  236  518:invokestatic    #302 <Method int ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration)>
    //  237  521:putfield        #304 <Field int mTouchSlop>
    //  238  524:return          
    }

    private Rect calcBounds(int i, Paint paint)
    {
    //    0    0:new             #110 <Class Rect>
    //    1    3:dup             
    //    2    4:invokespecial   #111 <Method void Rect()>
    //    3    7:astore_3        
    //    4    8:aload_0         
    //    5    9:iload_1         
    //    6   10:invokespecial   #310 <Method CharSequence getTitle(int)>
    //    7   13:astore          4
    //    8   15:aload_3         
    //    9   16:aload_2         
    //   10   17:aload           4
    //   11   19:iconst_0        
    //   12   20:aload           4
    //   13   22:invokeinterface #315 <Method int CharSequence.length()>
    //   14   27:invokevirtual   #319 <Method float Paint.measureText(CharSequence, int, int)>
    //   15   30:f2i             
    //   16   31:putfield        #322 <Field int Rect.right>
    //   17   34:aload_3         
    //   18   35:aload_2         
    //   19   36:invokevirtual   #326 <Method float Paint.descent()>
    //   20   39:aload_2         
    //   21   40:invokevirtual   #329 <Method float Paint.ascent()>
    //   22   43:fsub            
    //   23   44:f2i             
    //   24   45:putfield        #332 <Field int Rect.bottom>
    //   25   48:aload_3         
    //   26   49:areturn         
    }

    private ArrayList calculateAllBounds(Paint paint)
    {
    //    0    0:new             #336 <Class ArrayList>
    //    1    3:dup             
    //    2    4:invokespecial   #337 <Method void ArrayList()>
    //    3    7:astore_2        
    //    4    8:aload_0         
    //    5    9:getfield        #339 <Field ViewPager mViewPager>
    //    6   12:invokevirtual   #345 <Method PagerAdapter ViewPager.getAdapter()>
    //    7   15:invokevirtual   #350 <Method int PagerAdapter.getCount()>
    //    8   18:istore_3        
    //    9   19:aload_0         
    //   10   20:invokevirtual   #353 <Method int getWidth()>
    //   11   23:istore          4
    //   12   25:iload           4
    //   13   27:iconst_2        
    //   14   28:idiv            
    //   15   29:istore          5
    //   16   31:iconst_0        
    //   17   32:istore          6
    //   18   34:iload           6
    //   19   36:iload_3         
    //   20   37:icmplt          42
    //   21   40:aload_2         
    //   22   41:areturn         
    //   23   42:aload_0         
    //   24   43:iload           6
    //   25   45:aload_1         
    //   26   46:invokespecial   #355 <Method Rect calcBounds(int, Paint)>
    //   27   49:astore          7
    //   28   51:aload           7
    //   29   53:getfield        #322 <Field int Rect.right>
    //   30   56:aload           7
    //   31   58:getfield        #358 <Field int Rect.left>
    //   32   61:isub            
    //   33   62:istore          8
    //   34   64:aload           7
    //   35   66:getfield        #332 <Field int Rect.bottom>
    //   36   69:aload           7
    //   37   71:getfield        #361 <Field int Rect.top>
    //   38   74:isub            
    //   39   75:istore          9
    //   40   77:aload           7
    //   41   79:iload           5
    //   42   81:i2f             
    //   43   82:iload           8
    //   44   84:i2f             
    //   45   85:fconst_2        
    //   46   86:fdiv            
    //   47   87:fsub            
    //   48   88:iload           6
    //   49   90:aload_0         
    //   50   91:getfield        #96  <Field int mCurrentPage>
    //   51   94:isub            
    //   52   95:i2f             
    //   53   96:aload_0         
    //   54   97:getfield        #363 <Field float mPageOffset>
    //   55  100:fsub            
    //   56  101:iload           4
    //   57  103:i2f             
    //   58  104:fmul            
    //   59  105:fadd            
    //   60  106:f2i             
    //   61  107:putfield        #358 <Field int Rect.left>
    //   62  110:aload           7
    //   63  112:iload           8
    //   64  114:aload           7
    //   65  116:getfield        #358 <Field int Rect.left>
    //   66  119:iadd            
    //   67  120:putfield        #322 <Field int Rect.right>
    //   68  123:aload           7
    //   69  125:iconst_0        
    //   70  126:putfield        #361 <Field int Rect.top>
    //   71  129:aload           7
    //   72  131:iload           9
    //   73  133:putfield        #332 <Field int Rect.bottom>
    //   74  136:aload_2         
    //   75  137:aload           7
    //   76  139:invokevirtual   #367 <Method boolean ArrayList.add(Object)>
    //   77  142:pop             
    //   78  143:iinc            6  1
    //   79  146:goto            34
    }

    private void clipViewOnTheLeft(Rect rect, float f, int i)
    {
    //    0    0:aload_1         
    //    1    1:iload_3         
    //    2    2:i2f             
    //    3    3:aload_0         
    //    4    4:getfield        #243 <Field float mClipPadding>
    //    5    7:fadd            
    //    6    8:f2i             
    //    7    9:putfield        #358 <Field int Rect.left>
    //    8   12:aload_1         
    //    9   13:fload_2         
    //   10   14:aload_0         
    //   11   15:getfield        #243 <Field float mClipPadding>
    //   12   18:fadd            
    //   13   19:f2i             
    //   14   20:putfield        #322 <Field int Rect.right>
    //   15   23:return          
    }

    private void clipViewOnTheRight(Rect rect, float f, int i)
    {
    //    0    0:aload_1         
    //    1    1:iload_3         
    //    2    2:i2f             
    //    3    3:aload_0         
    //    4    4:getfield        #243 <Field float mClipPadding>
    //    5    7:fsub            
    //    6    8:f2i             
    //    7    9:putfield        #322 <Field int Rect.right>
    //    8   12:aload_1         
    //    9   13:aload_1         
    //   10   14:getfield        #322 <Field int Rect.right>
    //   11   17:i2f             
    //   12   18:fload_2         
    //   13   19:fsub            
    //   14   20:f2i             
    //   15   21:putfield        #358 <Field int Rect.left>
    //   16   24:return          
    }

    private CharSequence getTitle(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #339 <Field ViewPager mViewPager>
    //    2    4:invokevirtual   #345 <Method PagerAdapter ViewPager.getAdapter()>
    //    3    7:iload_1         
    //    4    8:invokevirtual   #373 <Method CharSequence PagerAdapter.getPageTitle(int)>
    //    5   11:astore_2        
    //    6   12:aload_2         
    //    7   13:ifnonnull       19
    //    8   16:ldc1            #15  <String "">
    //    9   18:astore_2        
    //   10   19:aload_2         
    //   11   20:areturn         
    }

    public float getClipPadding()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #243 <Field float mClipPadding>
    //    2    4:freturn         
    }

    public int getFooterColor()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #115 <Field Paint mPaintFooterLine>
    //    2    4:invokevirtual   #377 <Method int Paint.getColor()>
    //    3    7:ireturn         
    }

    public float getFooterIndicatorHeight()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #226 <Field float mFooterIndicatorHeight>
    //    2    4:freturn         
    }

    public float getFooterIndicatorPadding()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #230 <Field float mFooterPadding>
    //    2    4:freturn         
    }

    public IndicatorStyle getFooterIndicatorStyle()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #224 <Field TitlePageIndicator$IndicatorStyle mFooterIndicatorStyle>
    //    2    4:areturn         
    }

    public float getFooterLineHeight()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #215 <Field float mFooterLineHeight>
    //    2    4:freturn         
    }

    public LinePosition getLinePosition()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #237 <Field TitlePageIndicator$LinePosition mLinePosition>
    //    2    4:areturn         
    }

    public int getSelectedColor()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #247 <Field int mColorSelected>
    //    2    4:ireturn         
    }

    public int getTextColor()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #249 <Field int mColorText>
    //    2    4:ireturn         
    }

    public float getTextSize()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #103 <Field Paint mPaintText>
    //    2    4:invokevirtual   #389 <Method float Paint.getTextSize()>
    //    3    7:freturn         
    }

    public float getTitlePadding()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #241 <Field float mTitlePadding>
    //    2    4:freturn         
    }

    public float getTopPadding()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #239 <Field float mTopPadding>
    //    2    4:freturn         
    }

    public Typeface getTypeface()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #103 <Field Paint mPaintText>
    //    2    4:invokevirtual   #395 <Method Typeface Paint.getTypeface()>
    //    3    7:areturn         
    }

    public boolean isSelectedBold()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #254 <Field boolean mBoldText>
    //    2    4:ireturn         
    }

    public void notifyDataSetChanged()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #400 <Method void invalidate()>
    //    2    4:return          
    }

    protected void onDraw(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #404 <Method void View.onDraw(Canvas)>
    //    3    5:aload_0         
    //    4    6:getfield        #339 <Field ViewPager mViewPager>
    //    5    9:ifnonnull       13
    //    6   12:return          
    //    7   13:aload_0         
    //    8   14:getfield        #339 <Field ViewPager mViewPager>
    //    9   17:invokevirtual   #345 <Method PagerAdapter ViewPager.getAdapter()>
    //   10   20:invokevirtual   #350 <Method int PagerAdapter.getCount()>
    //   11   23:istore_2        
    //   12   24:iload_2         
    //   13   25:ifeq            12
    //   14   28:aload_0         
    //   15   29:getfield        #96  <Field int mCurrentPage>
    //   16   32:iconst_m1       
    //   17   33:icmpne          54
    //   18   36:aload_0         
    //   19   37:getfield        #339 <Field ViewPager mViewPager>
    //   20   40:ifnull          54
    //   21   43:aload_0         
    //   22   44:aload_0         
    //   23   45:getfield        #339 <Field ViewPager mViewPager>
    //   24   48:invokevirtual   #407 <Method int ViewPager.getCurrentItem()>
    //   25   51:putfield        #96  <Field int mCurrentPage>
    //   26   54:aload_0         
    //   27   55:aload_0         
    //   28   56:getfield        #103 <Field Paint mPaintText>
    //   29   59:invokespecial   #409 <Method ArrayList calculateAllBounds(Paint)>
    //   30   62:astore_3        
    //   31   63:aload_3         
    //   32   64:invokevirtual   #412 <Method int ArrayList.size()>
    //   33   67:istore          4
    //   34   69:aload_0         
    //   35   70:getfield        #96  <Field int mCurrentPage>
    //   36   73:iload           4
    //   37   75:icmplt          87
    //   38   78:aload_0         
    //   39   79:iload           4
    //   40   81:iconst_1        
    //   41   82:isub            
    //   42   83:invokevirtual   #415 <Method void setCurrentItem(int)>
    //   43   86:return          
    //   44   87:iload_2         
    //   45   88:iconst_1        
    //   46   89:isub            
    //   47   90:istore          5
    //   48   92:aload_0         
    //   49   93:invokevirtual   #353 <Method int getWidth()>
    //   50   96:i2f             
    //   51   97:fconst_2        
    //   52   98:fdiv            
    //   53   99:fstore          6
    //   54  101:aload_0         
    //   55  102:invokevirtual   #418 <Method int getLeft()>
    //   56  105:istore          7
    //   57  107:iload           7
    //   58  109:i2f             
    //   59  110:aload_0         
    //   60  111:getfield        #243 <Field float mClipPadding>
    //   61  114:fadd            
    //   62  115:fstore          8
    //   63  117:aload_0         
    //   64  118:invokevirtual   #353 <Method int getWidth()>
    //   65  121:istore          9
    //   66  123:aload_0         
    //   67  124:invokevirtual   #421 <Method int getHeight()>
    //   68  127:istore          10
    //   69  129:iload           7
    //   70  131:iload           9
    //   71  133:iadd            
    //   72  134:istore          11
    //   73  136:iload           11
    //   74  138:i2f             
    //   75  139:aload_0         
    //   76  140:getfield        #243 <Field float mClipPadding>
    //   77  143:fsub            
    //   78  144:fstore          12
    //   79  146:aload_0         
    //   80  147:getfield        #96  <Field int mCurrentPage>
    //   81  150:istore          13
    //   82  152:aload_0         
    //   83  153:getfield        #363 <Field float mPageOffset>
    //   84  156:f2d             
    //   85  157:ldc2w           #422 <Double 0.5D>
    //   86  160:dcmpg           
    //   87  161:ifgt            542
    //   88  164:aload_0         
    //   89  165:getfield        #363 <Field float mPageOffset>
    //   90  168:fstore          14
    //   91  170:fload           14
    //   92  172:ldc1            #20  <Float 0.25F>
    //   93  174:fcmpg           
    //   94  175:ifgt            556
    //   95  178:iconst_1        
    //   96  179:istore          15
    //   97  181:fload           14
    //   98  183:ldc1            #11  <Float 0.05F>
    //   99  185:fcmpg           
    //  100  186:ifgt            562
    //  101  189:iconst_1        
    //  102  190:istore          16
    //  103  192:ldc1            #20  <Float 0.25F>
    //  104  194:fload           14
    //  105  196:fsub            
    //  106  197:ldc1            #20  <Float 0.25F>
    //  107  199:fdiv            
    //  108  200:fstore          17
    //  109  202:aload_3         
    //  110  203:aload_0         
    //  111  204:getfield        #96  <Field int mCurrentPage>
    //  112  207:invokevirtual   #426 <Method Object ArrayList.get(int)>
    //  113  210:checkcast       #110 <Class Rect>
    //  114  213:astore          18
    //  115  215:aload           18
    //  116  217:getfield        #322 <Field int Rect.right>
    //  117  220:aload           18
    //  118  222:getfield        #358 <Field int Rect.left>
    //  119  225:isub            
    //  120  226:i2f             
    //  121  227:fstore          19
    //  122  229:aload           18
    //  123  231:getfield        #358 <Field int Rect.left>
    //  124  234:i2f             
    //  125  235:fload           8
    //  126  237:fcmpg           
    //  127  238:ifge            251
    //  128  241:aload_0         
    //  129  242:aload           18
    //  130  244:fload           19
    //  131  246:iload           7
    //  132  248:invokespecial   #428 <Method void clipViewOnTheLeft(Rect, float, int)>
    //  133  251:aload           18
    //  134  253:getfield        #322 <Field int Rect.right>
    //  135  256:i2f             
    //  136  257:fload           12
    //  137  259:fcmpl           
    //  138  260:ifle            273
    //  139  263:aload_0         
    //  140  264:aload           18
    //  141  266:fload           19
    //  142  268:iload           11
    //  143  270:invokespecial   #430 <Method void clipViewOnTheRight(Rect, float, int)>
    //  144  273:aload_0         
    //  145  274:getfield        #96  <Field int mCurrentPage>
    //  146  277:ifle            293
    //  147  280:iconst_m1       
    //  148  281:aload_0         
    //  149  282:getfield        #96  <Field int mCurrentPage>
    //  150  285:iadd            
    //  151  286:istore          41
    //  152  288:iload           41
    //  153  290:ifge            568
    //  154  293:aload_0         
    //  155  294:getfield        #96  <Field int mCurrentPage>
    //  156  297:iload           5
    //  157  299:icmpge          316
    //  158  302:iconst_1        
    //  159  303:aload_0         
    //  160  304:getfield        #96  <Field int mCurrentPage>
    //  161  307:iadd            
    //  162  308:istore          37
    //  163  310:iload           37
    //  164  312:iload_2         
    //  165  313:icmplt          688
    //  166  316:aload_0         
    //  167  317:getfield        #249 <Field int mColorText>
    //  168  320:bipush          24
    //  169  322:iushr           
    //  170  323:istore          20
    //  171  325:iconst_0        
    //  172  326:istore          21
    //  173  328:iload           21
    //  174  330:iload_2         
    //  175  331:icmplt          805
    //  176  334:aload_0         
    //  177  335:getfield        #215 <Field float mFooterLineHeight>
    //  178  338:fstore          30
    //  179  340:aload_0         
    //  180  341:getfield        #226 <Field float mFooterIndicatorHeight>
    //  181  344:fstore          31
    //  182  346:aload_0         
    //  183  347:getfield        #237 <Field TitlePageIndicator$LinePosition mLinePosition>
    //  184  350:getstatic       #433 <Field TitlePageIndicator$LinePosition TitlePageIndicator$LinePosition.Top>
    //  185  353:if_acmpne       369
    //  186  356:iconst_0        
    //  187  357:istore          10
    //  188  359:fload           30
    //  189  361:fneg            
    //  190  362:fstore          30
    //  191  364:fload           31
    //  192  366:fneg            
    //  193  367:fstore          31
    //  194  369:aload_0         
    //  195  370:getfield        #108 <Field Path mPath>
    //  196  373:invokevirtual   #436 <Method void Path.reset()>
    //  197  376:aload_0         
    //  198  377:getfield        #108 <Field Path mPath>
    //  199  380:fconst_0        
    //  200  381:iload           10
    //  201  383:i2f             
    //  202  384:fload           30
    //  203  386:fconst_2        
    //  204  387:fdiv            
    //  205  388:fsub            
    //  206  389:invokevirtual   #440 <Method void Path.moveTo(float, float)>
    //  207  392:aload_0         
    //  208  393:getfield        #108 <Field Path mPath>
    //  209  396:iload           9
    //  210  398:i2f             
    //  211  399:iload           10
    //  212  401:i2f             
    //  213  402:fload           30
    //  214  404:fconst_2        
    //  215  405:fdiv            
    //  216  406:fsub            
    //  217  407:invokevirtual   #443 <Method void Path.lineTo(float, float)>
    //  218  410:aload_0         
    //  219  411:getfield        #108 <Field Path mPath>
    //  220  414:invokevirtual   #446 <Method void Path.close()>
    //  221  417:aload_1         
    //  222  418:aload_0         
    //  223  419:getfield        #108 <Field Path mPath>
    //  224  422:aload_0         
    //  225  423:getfield        #115 <Field Paint mPaintFooterLine>
    //  226  426:invokevirtual   #452 <Method void Canvas.drawPath(Path, Paint)>
    //  227  429:iload           10
    //  228  431:i2f             
    //  229  432:fload           30
    //  230  434:fsub            
    //  231  435:fstore          32
    //  232  437:invokestatic    #454 <Method int[] $SWITCH_TABLE$com$viewpagerindicator$TitlePageIndicator$IndicatorStyle()>
    //  233  440:aload_0         
    //  234  441:getfield        #224 <Field TitlePageIndicator$IndicatorStyle mFooterIndicatorStyle>
    //  235  444:invokevirtual   #74  <Method int TitlePageIndicator$IndicatorStyle.ordinal()>
    //  236  447:iaload          
    //  237  448:tableswitch     2 3: default 472
    //                   2 473
    //                   3 1166
    //  238  472:return          
    //  239  473:aload_0         
    //  240  474:getfield        #108 <Field Path mPath>
    //  241  477:invokevirtual   #436 <Method void Path.reset()>
    //  242  480:aload_0         
    //  243  481:getfield        #108 <Field Path mPath>
    //  244  484:fload           6
    //  245  486:fload           32
    //  246  488:fload           31
    //  247  490:fsub            
    //  248  491:invokevirtual   #440 <Method void Path.moveTo(float, float)>
    //  249  494:aload_0         
    //  250  495:getfield        #108 <Field Path mPath>
    //  251  498:fload           6
    //  252  500:fload           31
    //  253  502:fadd            
    //  254  503:fload           32
    //  255  505:invokevirtual   #443 <Method void Path.lineTo(float, float)>
    //  256  508:aload_0         
    //  257  509:getfield        #108 <Field Path mPath>
    //  258  512:fload           6
    //  259  514:fload           31
    //  260  516:fsub            
    //  261  517:fload           32
    //  262  519:invokevirtual   #443 <Method void Path.lineTo(float, float)>
    //  263  522:aload_0         
    //  264  523:getfield        #108 <Field Path mPath>
    //  265  526:invokevirtual   #446 <Method void Path.close()>
    //  266  529:aload_1         
    //  267  530:aload_0         
    //  268  531:getfield        #108 <Field Path mPath>
    //  269  534:aload_0         
    //  270  535:getfield        #117 <Field Paint mPaintFooterIndicator>
    //  271  538:invokevirtual   #452 <Method void Canvas.drawPath(Path, Paint)>
    //  272  541:return          
    //  273  542:iinc            13  1
    //  274  545:fconst_1        
    //  275  546:aload_0         
    //  276  547:getfield        #363 <Field float mPageOffset>
    //  277  550:fsub            
    //  278  551:fstore          14
    //  279  553:goto            170
    //  280  556:iconst_0        
    //  281  557:istore          15
    //  282  559:goto            181
    //  283  562:iconst_0        
    //  284  563:istore          16
    //  285  565:goto            192
    //  286  568:aload_3         
    //  287  569:iload           41
    //  288  571:invokevirtual   #426 <Method Object ArrayList.get(int)>
    //  289  574:checkcast       #110 <Class Rect>
    //  290  577:astore          42
    //  291  579:aload           42
    //  292  581:getfield        #358 <Field int Rect.left>
    //  293  584:i2f             
    //  294  585:fload           8
    //  295  587:fcmpg           
    //  296  588:ifge            682
    //  297  591:aload           42
    //  298  593:getfield        #322 <Field int Rect.right>
    //  299  596:aload           42
    //  300  598:getfield        #358 <Field int Rect.left>
    //  301  601:isub            
    //  302  602:istore          43
    //  303  604:aload_0         
    //  304  605:aload           42
    //  305  607:iload           43
    //  306  609:i2f             
    //  307  610:iload           7
    //  308  612:invokespecial   #428 <Method void clipViewOnTheLeft(Rect, float, int)>
    //  309  615:aload_3         
    //  310  616:iload           41
    //  311  618:iconst_1        
    //  312  619:iadd            
    //  313  620:invokevirtual   #426 <Method Object ArrayList.get(int)>
    //  314  623:checkcast       #110 <Class Rect>
    //  315  626:astore          44
    //  316  628:aload           42
    //  317  630:getfield        #322 <Field int Rect.right>
    //  318  633:i2f             
    //  319  634:aload_0         
    //  320  635:getfield        #241 <Field float mTitlePadding>
    //  321  638:fadd            
    //  322  639:aload           44
    //  323  641:getfield        #358 <Field int Rect.left>
    //  324  644:i2f             
    //  325  645:fcmpl           
    //  326  646:ifle            682
    //  327  649:aload           42
    //  328  651:aload           44
    //  329  653:getfield        #358 <Field int Rect.left>
    //  330  656:iload           43
    //  331  658:isub            
    //  332  659:i2f             
    //  333  660:aload_0         
    //  334  661:getfield        #241 <Field float mTitlePadding>
    //  335  664:fsub            
    //  336  665:f2i             
    //  337  666:putfield        #358 <Field int Rect.left>
    //  338  669:aload           42
    //  339  671:iload           43
    //  340  673:aload           42
    //  341  675:getfield        #358 <Field int Rect.left>
    //  342  678:iadd            
    //  343  679:putfield        #322 <Field int Rect.right>
    //  344  682:iinc            41  -1
    //  345  685:goto            288
    //  346  688:aload_3         
    //  347  689:iload           37
    //  348  691:invokevirtual   #426 <Method Object ArrayList.get(int)>
    //  349  694:checkcast       #110 <Class Rect>
    //  350  697:astore          38
    //  351  699:aload           38
    //  352  701:getfield        #322 <Field int Rect.right>
    //  353  704:i2f             
    //  354  705:fload           12
    //  355  707:fcmpl           
    //  356  708:ifle            799
    //  357  711:aload           38
    //  358  713:getfield        #322 <Field int Rect.right>
    //  359  716:aload           38
    //  360  718:getfield        #358 <Field int Rect.left>
    //  361  721:isub            
    //  362  722:istore          39
    //  363  724:aload_0         
    //  364  725:aload           38
    //  365  727:iload           39
    //  366  729:i2f             
    //  367  730:iload           11
    //  368  732:invokespecial   #430 <Method void clipViewOnTheRight(Rect, float, int)>
    //  369  735:aload_3         
    //  370  736:iload           37
    //  371  738:iconst_1        
    //  372  739:isub            
    //  373  740:invokevirtual   #426 <Method Object ArrayList.get(int)>
    //  374  743:checkcast       #110 <Class Rect>
    //  375  746:astore          40
    //  376  748:aload           38
    //  377  750:getfield        #358 <Field int Rect.left>
    //  378  753:i2f             
    //  379  754:aload_0         
    //  380  755:getfield        #241 <Field float mTitlePadding>
    //  381  758:fsub            
    //  382  759:aload           40
    //  383  761:getfield        #322 <Field int Rect.right>
    //  384  764:i2f             
    //  385  765:fcmpg           
    //  386  766:ifge            799
    //  387  769:aload           38
    //  388  771:aload           40
    //  389  773:getfield        #322 <Field int Rect.right>
    //  390  776:i2f             
    //  391  777:aload_0         
    //  392  778:getfield        #241 <Field float mTitlePadding>
    //  393  781:fadd            
    //  394  782:f2i             
    //  395  783:putfield        #358 <Field int Rect.left>
    //  396  786:aload           38
    //  397  788:iload           39
    //  398  790:aload           38
    //  399  792:getfield        #358 <Field int Rect.left>
    //  400  795:iadd            
    //  401  796:putfield        #322 <Field int Rect.right>
    //  402  799:iinc            37  1
    //  403  802:goto            310
    //  404  805:aload_3         
    //  405  806:iload           21
    //  406  808:invokevirtual   #426 <Method Object ArrayList.get(int)>
    //  407  811:checkcast       #110 <Class Rect>
    //  408  814:astore          22
    //  409  816:aload           22
    //  410  818:getfield        #358 <Field int Rect.left>
    //  411  821:iload           7
    //  412  823:icmple          836
    //  413  826:aload           22
    //  414  828:getfield        #358 <Field int Rect.left>
    //  415  831:iload           11
    //  416  833:icmplt          856
    //  417  836:aload           22
    //  418  838:getfield        #322 <Field int Rect.right>
    //  419  841:iload           7
    //  420  843:icmple          1148
    //  421  846:aload           22
    //  422  848:getfield        #322 <Field int Rect.right>
    //  423  851:iload           11
    //  424  853:icmpge          1148
    //  425  856:iload           21
    //  426  858:iload           13
    //  427  860:icmpne          1154
    //  428  863:iconst_1        
    //  429  864:istore          23
    //  430  866:aload_0         
    //  431  867:iload           21
    //  432  869:invokespecial   #310 <Method CharSequence getTitle(int)>
    //  433  872:astore          24
    //  434  874:aload_0         
    //  435  875:getfield        #103 <Field Paint mPaintText>
    //  436  878:astore          25
    //  437  880:iload           23
    //  438  882:ifeq            1160
    //  439  885:iload           16
    //  440  887:ifeq            1160
    //  441  890:aload_0         
    //  442  891:getfield        #254 <Field boolean mBoldText>
    //  443  894:ifeq            1160
    //  444  897:iconst_1        
    //  445  898:istore          26
    //  446  900:aload           25
    //  447  902:iload           26
    //  448  904:invokevirtual   #457 <Method void Paint.setFakeBoldText(boolean)>
    //  449  907:aload_0         
    //  450  908:getfield        #103 <Field Paint mPaintText>
    //  451  911:aload_0         
    //  452  912:getfield        #249 <Field int mColorText>
    //  453  915:invokevirtual   #279 <Method void Paint.setColor(int)>
    //  454  918:iload           23
    //  455  920:ifeq            945
    //  456  923:iload           15
    //  457  925:ifeq            945
    //  458  928:aload_0         
    //  459  929:getfield        #103 <Field Paint mPaintText>
    //  460  932:iload           20
    //  461  934:fload           17
    //  462  936:iload           20
    //  463  938:i2f             
    //  464  939:fmul            
    //  465  940:f2i             
    //  466  941:isub            
    //  467  942:invokevirtual   #460 <Method void Paint.setAlpha(int)>
    //  468  945:iload           4
    //  469  947:iconst_1        
    //  470  948:isub            
    //  471  949:istore          27
    //  472  951:iload           21
    //  473  953:iload           27
    //  474  955:icmpge          1038
    //  475  958:aload_3         
    //  476  959:iload           21
    //  477  961:iconst_1        
    //  478  962:iadd            
    //  479  963:invokevirtual   #426 <Method Object ArrayList.get(int)>
    //  480  966:checkcast       #110 <Class Rect>
    //  481  969:astore          28
    //  482  971:aload           22
    //  483  973:getfield        #322 <Field int Rect.right>
    //  484  976:i2f             
    //  485  977:aload_0         
    //  486  978:getfield        #241 <Field float mTitlePadding>
    //  487  981:fadd            
    //  488  982:aload           28
    //  489  984:getfield        #358 <Field int Rect.left>
    //  490  987:i2f             
    //  491  988:fcmpl           
    //  492  989:ifle            1038
    //  493  992:aload           22
    //  494  994:getfield        #322 <Field int Rect.right>
    //  495  997:aload           22
    //  496  999:getfield        #358 <Field int Rect.left>
    //  497 1002:isub            
    //  498 1003:istore          29
    //  499 1005:aload           22
    //  500 1007:aload           28
    //  501 1009:getfield        #358 <Field int Rect.left>
    //  502 1012:iload           29
    //  503 1014:isub            
    //  504 1015:i2f             
    //  505 1016:aload_0         
    //  506 1017:getfield        #241 <Field float mTitlePadding>
    //  507 1020:fsub            
    //  508 1021:f2i             
    //  509 1022:putfield        #358 <Field int Rect.left>
    //  510 1025:aload           22
    //  511 1027:iload           29
    //  512 1029:aload           22
    //  513 1031:getfield        #358 <Field int Rect.left>
    //  514 1034:iadd            
    //  515 1035:putfield        #322 <Field int Rect.right>
    //  516 1038:aload_1         
    //  517 1039:aload           24
    //  518 1041:iconst_0        
    //  519 1042:aload           24
    //  520 1044:invokeinterface #315 <Method int CharSequence.length()>
    //  521 1049:aload           22
    //  522 1051:getfield        #358 <Field int Rect.left>
    //  523 1054:i2f             
    //  524 1055:aload           22
    //  525 1057:getfield        #332 <Field int Rect.bottom>
    //  526 1060:i2f             
    //  527 1061:aload_0         
    //  528 1062:getfield        #239 <Field float mTopPadding>
    //  529 1065:fadd            
    //  530 1066:aload_0         
    //  531 1067:getfield        #103 <Field Paint mPaintText>
    //  532 1070:invokevirtual   #464 <Method void Canvas.drawText(CharSequence, int, int, float, float, Paint)>
    //  533 1073:iload           23
    //  534 1075:ifeq            1148
    //  535 1078:iload           15
    //  536 1080:ifeq            1148
    //  537 1083:aload_0         
    //  538 1084:getfield        #103 <Field Paint mPaintText>
    //  539 1087:aload_0         
    //  540 1088:getfield        #247 <Field int mColorSelected>
    //  541 1091:invokevirtual   #279 <Method void Paint.setColor(int)>
    //  542 1094:aload_0         
    //  543 1095:getfield        #103 <Field Paint mPaintText>
    //  544 1098:fload           17
    //  545 1100:aload_0         
    //  546 1101:getfield        #247 <Field int mColorSelected>
    //  547 1104:bipush          24
    //  548 1106:iushr           
    //  549 1107:i2f             
    //  550 1108:fmul            
    //  551 1109:f2i             
    //  552 1110:invokevirtual   #460 <Method void Paint.setAlpha(int)>
    //  553 1113:aload_1         
    //  554 1114:aload           24
    //  555 1116:iconst_0        
    //  556 1117:aload           24
    //  557 1119:invokeinterface #315 <Method int CharSequence.length()>
    //  558 1124:aload           22
    //  559 1126:getfield        #358 <Field int Rect.left>
    //  560 1129:i2f             
    //  561 1130:aload           22
    //  562 1132:getfield        #332 <Field int Rect.bottom>
    //  563 1135:i2f             
    //  564 1136:aload_0         
    //  565 1137:getfield        #239 <Field float mTopPadding>
    //  566 1140:fadd            
    //  567 1141:aload_0         
    //  568 1142:getfield        #103 <Field Paint mPaintText>
    //  569 1145:invokevirtual   #464 <Method void Canvas.drawText(CharSequence, int, int, float, float, Paint)>
    //  570 1148:iinc            21  1
    //  571 1151:goto            328
    //  572 1154:iconst_0        
    //  573 1155:istore          23
    //  574 1157:goto            866
    //  575 1160:iconst_0        
    //  576 1161:istore          26
    //  577 1163:goto            900
    //  578 1166:iload           15
    //  579 1168:ifeq            12
    //  580 1171:iload           13
    //  581 1173:iload           4
    //  582 1175:icmpge          12
    //  583 1178:aload_3         
    //  584 1179:iload           13
    //  585 1181:invokevirtual   #426 <Method Object ArrayList.get(int)>
    //  586 1184:checkcast       #110 <Class Rect>
    //  587 1187:astore          33
    //  588 1189:aload           33
    //  589 1191:getfield        #322 <Field int Rect.right>
    //  590 1194:i2f             
    //  591 1195:aload_0         
    //  592 1196:getfield        #228 <Field float mFooterIndicatorUnderlinePadding>
    //  593 1199:fadd            
    //  594 1200:fstore          34
    //  595 1202:aload           33
    //  596 1204:getfield        #358 <Field int Rect.left>
    //  597 1207:i2f             
    //  598 1208:aload_0         
    //  599 1209:getfield        #228 <Field float mFooterIndicatorUnderlinePadding>
    //  600 1212:fsub            
    //  601 1213:fstore          35
    //  602 1215:fload           32
    //  603 1217:fload           31
    //  604 1219:fsub            
    //  605 1220:fstore          36
    //  606 1222:aload_0         
    //  607 1223:getfield        #108 <Field Path mPath>
    //  608 1226:invokevirtual   #436 <Method void Path.reset()>
    //  609 1229:aload_0         
    //  610 1230:getfield        #108 <Field Path mPath>
    //  611 1233:fload           35
    //  612 1235:fload           32
    //  613 1237:invokevirtual   #440 <Method void Path.moveTo(float, float)>
    //  614 1240:aload_0         
    //  615 1241:getfield        #108 <Field Path mPath>
    //  616 1244:fload           34
    //  617 1246:fload           32
    //  618 1248:invokevirtual   #443 <Method void Path.lineTo(float, float)>
    //  619 1251:aload_0         
    //  620 1252:getfield        #108 <Field Path mPath>
    //  621 1255:fload           34
    //  622 1257:fload           36
    //  623 1259:invokevirtual   #443 <Method void Path.lineTo(float, float)>
    //  624 1262:aload_0         
    //  625 1263:getfield        #108 <Field Path mPath>
    //  626 1266:fload           35
    //  627 1268:fload           36
    //  628 1270:invokevirtual   #443 <Method void Path.lineTo(float, float)>
    //  629 1273:aload_0         
    //  630 1274:getfield        #108 <Field Path mPath>
    //  631 1277:invokevirtual   #446 <Method void Path.close()>
    //  632 1280:aload_0         
    //  633 1281:getfield        #117 <Field Paint mPaintFooterIndicator>
    //  634 1284:ldc2            #465 <Float 255F>
    //  635 1287:fload           17
    //  636 1289:fmul            
    //  637 1290:f2i             
    //  638 1291:invokevirtual   #460 <Method void Paint.setAlpha(int)>
    //  639 1294:aload_1         
    //  640 1295:aload_0         
    //  641 1296:getfield        #108 <Field Path mPath>
    //  642 1299:aload_0         
    //  643 1300:getfield        #117 <Field Paint mPaintFooterIndicator>
    //  644 1303:invokevirtual   #452 <Method void Canvas.drawPath(Path, Paint)>
    //  645 1306:aload_0         
    //  646 1307:getfield        #117 <Field Paint mPaintFooterIndicator>
    //  647 1310:sipush          255
    //  648 1313:invokevirtual   #460 <Method void Paint.setAlpha(int)>
    //  649 1316:return          
    }

    protected void onMeasure(int i, int j)
    {
    //    0    0:iload_1         
    //    1    1:invokestatic    #472 <Method int android.view.View$MeasureSpec.getSize(int)>
    //    2    4:istore_3        
    //    3    5:iload_2         
    //    4    6:invokestatic    #475 <Method int android.view.View$MeasureSpec.getMode(int)>
    //    5    9:ldc2            #476 <Int 0x40000000>
    //    6   12:icmpne          31
    //    7   15:iload_2         
    //    8   16:invokestatic    #472 <Method int android.view.View$MeasureSpec.getSize(int)>
    //    9   19:i2f             
    //   10   20:fstore          4
    //   11   22:aload_0         
    //   12   23:iload_3         
    //   13   24:fload           4
    //   14   26:f2i             
    //   15   27:invokevirtual   #479 <Method void setMeasuredDimension(int, int)>
    //   16   30:return          
    //   17   31:aload_0         
    //   18   32:getfield        #113 <Field Rect mBounds>
    //   19   35:invokevirtual   #482 <Method void Rect.setEmpty()>
    //   20   38:aload_0         
    //   21   39:getfield        #113 <Field Rect mBounds>
    //   22   42:aload_0         
    //   23   43:getfield        #103 <Field Paint mPaintText>
    //   24   46:invokevirtual   #326 <Method float Paint.descent()>
    //   25   49:aload_0         
    //   26   50:getfield        #103 <Field Paint mPaintText>
    //   27   53:invokevirtual   #329 <Method float Paint.ascent()>
    //   28   56:fsub            
    //   29   57:f2i             
    //   30   58:putfield        #332 <Field int Rect.bottom>
    //   31   61:aload_0         
    //   32   62:getfield        #113 <Field Rect mBounds>
    //   33   65:getfield        #332 <Field int Rect.bottom>
    //   34   68:aload_0         
    //   35   69:getfield        #113 <Field Rect mBounds>
    //   36   72:getfield        #361 <Field int Rect.top>
    //   37   75:isub            
    //   38   76:i2f             
    //   39   77:aload_0         
    //   40   78:getfield        #215 <Field float mFooterLineHeight>
    //   41   81:fadd            
    //   42   82:aload_0         
    //   43   83:getfield        #230 <Field float mFooterPadding>
    //   44   86:fadd            
    //   45   87:aload_0         
    //   46   88:getfield        #239 <Field float mTopPadding>
    //   47   91:fadd            
    //   48   92:fstore          4
    //   49   94:aload_0         
    //   50   95:getfield        #224 <Field TitlePageIndicator$IndicatorStyle mFooterIndicatorStyle>
    //   51   98:getstatic       #70  <Field TitlePageIndicator$IndicatorStyle TitlePageIndicator$IndicatorStyle.None>
    //   52  101:if_acmpeq       22
    //   53  104:fload           4
    //   54  106:aload_0         
    //   55  107:getfield        #226 <Field float mFooterIndicatorHeight>
    //   56  110:fadd            
    //   57  111:fstore          4
    //   58  113:goto            22
    }

    public void onPageScrollStateChanged(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #485 <Field int mScrollState>
    //    3    5:aload_0         
    //    4    6:getfield        #487 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    5    9:ifnull          22
    //    6   12:aload_0         
    //    7   13:getfield        #487 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    8   16:iload_1         
    //    9   17:invokeinterface #491 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
    //   10   22:return          
    }

    public void onPageScrolled(int i, float f, int j)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #96  <Field int mCurrentPage>
    //    3    5:aload_0         
    //    4    6:fload_2         
    //    5    7:putfield        #363 <Field float mPageOffset>
    //    6   10:aload_0         
    //    7   11:invokevirtual   #400 <Method void invalidate()>
    //    8   14:aload_0         
    //    9   15:getfield        #487 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //   10   18:ifnull          33
    //   11   21:aload_0         
    //   12   22:getfield        #487 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //   13   25:iload_1         
    //   14   26:fload_2         
    //   15   27:iload_3         
    //   16   28:invokeinterface #495 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
    //   17   33:return          
    }

    public void onPageSelected(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #485 <Field int mScrollState>
    //    2    4:ifne            16
    //    3    7:aload_0         
    //    4    8:iload_1         
    //    5    9:putfield        #96  <Field int mCurrentPage>
    //    6   12:aload_0         
    //    7   13:invokevirtual   #400 <Method void invalidate()>
    //    8   16:aload_0         
    //    9   17:getfield        #487 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //   10   20:ifnull          33
    //   11   23:aload_0         
    //   12   24:getfield        #487 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //   13   27:iload_1         
    //   14   28:invokeinterface #498 <Method void android.support.v4.view.ViewPager$OnPageChangeListener.onPageSelected(int)>
    //   15   33:return          
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
    //    0    0:aload_1         
    //    1    1:checkcast       #502 <Class TitlePageIndicator$SavedState>
    //    2    4:astore_2        
    //    3    5:aload_0         
    //    4    6:aload_2         
    //    5    7:invokevirtual   #506 <Method Parcelable TitlePageIndicator$SavedState.getSuperState()>
    //    6   10:invokespecial   #508 <Method void View.onRestoreInstanceState(Parcelable)>
    //    7   13:aload_0         
    //    8   14:aload_2         
    //    9   15:getfield        #511 <Field int TitlePageIndicator$SavedState.currentPage>
    //   10   18:putfield        #96  <Field int mCurrentPage>
    //   11   21:aload_0         
    //   12   22:invokevirtual   #514 <Method void requestLayout()>
    //   13   25:return          
    }

    public Parcelable onSaveInstanceState()
    {
    //    0    0:new             #502 <Class TitlePageIndicator$SavedState>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #517 <Method Parcelable View.onSaveInstanceState()>
    //    4    8:invokespecial   #519 <Method void TitlePageIndicator$SavedState(Parcelable)>
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:aload_0         
    //    8   14:getfield        #96  <Field int mCurrentPage>
    //    9   17:putfield        #511 <Field int TitlePageIndicator$SavedState.currentPage>
    //   10   20:aload_1         
    //   11   21:areturn         
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #523 <Method boolean View.onTouchEvent(MotionEvent)>
    //    3    5:ifeq            10
    //    4    8:iconst_1        
    //    5    9:ireturn         
    //    6   10:aload_0         
    //    7   11:getfield        #339 <Field ViewPager mViewPager>
    //    8   14:ifnull          30
    //    9   17:aload_0         
    //   10   18:getfield        #339 <Field ViewPager mViewPager>
    //   11   21:invokevirtual   #345 <Method PagerAdapter ViewPager.getAdapter()>
    //   12   24:invokevirtual   #350 <Method int PagerAdapter.getCount()>
    //   13   27:ifne            32
    //   14   30:iconst_0        
    //   15   31:ireturn         
    //   16   32:sipush          255
    //   17   35:aload_1         
    //   18   36:invokevirtual   #528 <Method int MotionEvent.getAction()>
    //   19   39:iand            
    //   20   40:istore_2        
    //   21   41:iload_2         
    //   22   42:tableswitch     0 6: default 84
    //                   0 86
    //                   1 200
    //                   2 106
    //                   3 200
    //                   4 84
    //                   5 390
    //                   6 419
    //   23   84:iconst_1        
    //   24   85:ireturn         
    //   25   86:aload_0         
    //   26   87:aload_1         
    //   27   88:iconst_0        
    //   28   89:invokestatic    #534 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //   29   92:putfield        #122 <Field int mActivePointerId>
    //   30   95:aload_0         
    //   31   96:aload_1         
    //   32   97:invokevirtual   #537 <Method float MotionEvent.getX()>
    //   33  100:putfield        #120 <Field float mLastMotionX>
    //   34  103:goto            84
    //   35  106:aload_1         
    //   36  107:aload_1         
    //   37  108:aload_0         
    //   38  109:getfield        #122 <Field int mActivePointerId>
    //   39  112:invokestatic    #540 <Method int MotionEventCompat.findPointerIndex(MotionEvent, int)>
    //   40  115:invokestatic    #543 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //   41  118:fstore          13
    //   42  120:fload           13
    //   43  122:aload_0         
    //   44  123:getfield        #120 <Field float mLastMotionX>
    //   45  126:fsub            
    //   46  127:fstore          14
    //   47  129:aload_0         
    //   48  130:getfield        #545 <Field boolean mIsDragging>
    //   49  133:ifne            155
    //   50  136:fload           14
    //   51  138:invokestatic    #551 <Method float Math.abs(float)>
    //   52  141:aload_0         
    //   53  142:getfield        #304 <Field int mTouchSlop>
    //   54  145:i2f             
    //   55  146:fcmpl           
    //   56  147:ifle            155
    //   57  150:aload_0         
    //   58  151:iconst_1        
    //   59  152:putfield        #545 <Field boolean mIsDragging>
    //   60  155:aload_0         
    //   61  156:getfield        #545 <Field boolean mIsDragging>
    //   62  159:ifeq            84
    //   63  162:aload_0         
    //   64  163:fload           13
    //   65  165:putfield        #120 <Field float mLastMotionX>
    //   66  168:aload_0         
    //   67  169:getfield        #339 <Field ViewPager mViewPager>
    //   68  172:invokevirtual   #554 <Method boolean ViewPager.isFakeDragging()>
    //   69  175:ifne            188
    //   70  178:aload_0         
    //   71  179:getfield        #339 <Field ViewPager mViewPager>
    //   72  182:invokevirtual   #557 <Method boolean ViewPager.beginFakeDrag()>
    //   73  185:ifeq            84
    //   74  188:aload_0         
    //   75  189:getfield        #339 <Field ViewPager mViewPager>
    //   76  192:fload           14
    //   77  194:invokevirtual   #560 <Method void ViewPager.fakeDragBy(float)>
    //   78  197:goto            84
    //   79  200:aload_0         
    //   80  201:getfield        #545 <Field boolean mIsDragging>
    //   81  204:ifne            360
    //   82  207:aload_0         
    //   83  208:getfield        #339 <Field ViewPager mViewPager>
    //   84  211:invokevirtual   #345 <Method PagerAdapter ViewPager.getAdapter()>
    //   85  214:invokevirtual   #350 <Method int PagerAdapter.getCount()>
    //   86  217:istore          6
    //   87  219:aload_0         
    //   88  220:invokevirtual   #353 <Method int getWidth()>
    //   89  223:istore          7
    //   90  225:iload           7
    //   91  227:i2f             
    //   92  228:fconst_2        
    //   93  229:fdiv            
    //   94  230:fstore          8
    //   95  232:iload           7
    //   96  234:i2f             
    //   97  235:ldc2            #561 <Float 6F>
    //   98  238:fdiv            
    //   99  239:fstore          9
    //  100  241:fload           8
    //  101  243:fload           9
    //  102  245:fsub            
    //  103  246:fstore          10
    //  104  248:fload           8
    //  105  250:fload           9
    //  106  252:fadd            
    //  107  253:fstore          11
    //  108  255:aload_1         
    //  109  256:invokevirtual   #537 <Method float MotionEvent.getX()>
    //  110  259:fstore          12
    //  111  261:fload           12
    //  112  263:fload           10
    //  113  265:fcmpg           
    //  114  266:ifge            296
    //  115  269:aload_0         
    //  116  270:getfield        #96  <Field int mCurrentPage>
    //  117  273:ifle            360
    //  118  276:iload_2         
    //  119  277:iconst_3        
    //  120  278:icmpeq          294
    //  121  281:aload_0         
    //  122  282:getfield        #339 <Field ViewPager mViewPager>
    //  123  285:iconst_m1       
    //  124  286:aload_0         
    //  125  287:getfield        #96  <Field int mCurrentPage>
    //  126  290:iadd            
    //  127  291:invokevirtual   #562 <Method void ViewPager.setCurrentItem(int)>
    //  128  294:iconst_1        
    //  129  295:ireturn         
    //  130  296:fload           12
    //  131  298:fload           11
    //  132  300:fcmpl           
    //  133  301:ifle            335
    //  134  304:aload_0         
    //  135  305:getfield        #96  <Field int mCurrentPage>
    //  136  308:iload           6
    //  137  310:iconst_1        
    //  138  311:isub            
    //  139  312:icmpge          360
    //  140  315:iload_2         
    //  141  316:iconst_3        
    //  142  317:icmpeq          333
    //  143  320:aload_0         
    //  144  321:getfield        #339 <Field ViewPager mViewPager>
    //  145  324:iconst_1        
    //  146  325:aload_0         
    //  147  326:getfield        #96  <Field int mCurrentPage>
    //  148  329:iadd            
    //  149  330:invokevirtual   #562 <Method void ViewPager.setCurrentItem(int)>
    //  150  333:iconst_1        
    //  151  334:ireturn         
    //  152  335:aload_0         
    //  153  336:getfield        #564 <Field TitlePageIndicator$OnCenterItemClickListener mCenterItemClickListener>
    //  154  339:ifnull          360
    //  155  342:iload_2         
    //  156  343:iconst_3        
    //  157  344:icmpeq          360
    //  158  347:aload_0         
    //  159  348:getfield        #564 <Field TitlePageIndicator$OnCenterItemClickListener mCenterItemClickListener>
    //  160  351:aload_0         
    //  161  352:getfield        #96  <Field int mCurrentPage>
    //  162  355:invokeinterface #569 <Method void TitlePageIndicator$OnCenterItemClickListener.onCenterItemClick(int)>
    //  163  360:aload_0         
    //  164  361:iconst_0        
    //  165  362:putfield        #545 <Field boolean mIsDragging>
    //  166  365:aload_0         
    //  167  366:iconst_m1       
    //  168  367:putfield        #122 <Field int mActivePointerId>
    //  169  370:aload_0         
    //  170  371:getfield        #339 <Field ViewPager mViewPager>
    //  171  374:invokevirtual   #554 <Method boolean ViewPager.isFakeDragging()>
    //  172  377:ifeq            84
    //  173  380:aload_0         
    //  174  381:getfield        #339 <Field ViewPager mViewPager>
    //  175  384:invokevirtual   #572 <Method void ViewPager.endFakeDrag()>
    //  176  387:goto            84
    //  177  390:aload_1         
    //  178  391:invokestatic    #576 <Method int MotionEventCompat.getActionIndex(MotionEvent)>
    //  179  394:istore          5
    //  180  396:aload_0         
    //  181  397:aload_1         
    //  182  398:iload           5
    //  183  400:invokestatic    #543 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //  184  403:putfield        #120 <Field float mLastMotionX>
    //  185  406:aload_0         
    //  186  407:aload_1         
    //  187  408:iload           5
    //  188  410:invokestatic    #534 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  189  413:putfield        #122 <Field int mActivePointerId>
    //  190  416:goto            84
    //  191  419:aload_1         
    //  192  420:invokestatic    #576 <Method int MotionEventCompat.getActionIndex(MotionEvent)>
    //  193  423:istore_3        
    //  194  424:aload_1         
    //  195  425:iload_3         
    //  196  426:invokestatic    #534 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  197  429:aload_0         
    //  198  430:getfield        #122 <Field int mActivePointerId>
    //  199  433:icmpne          453
    //  200  436:iload_3         
    //  201  437:ifne            472
    //  202  440:iconst_1        
    //  203  441:istore          4
    //  204  443:aload_0         
    //  205  444:aload_1         
    //  206  445:iload           4
    //  207  447:invokestatic    #534 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  208  450:putfield        #122 <Field int mActivePointerId>
    //  209  453:aload_0         
    //  210  454:aload_1         
    //  211  455:aload_1         
    //  212  456:aload_0         
    //  213  457:getfield        #122 <Field int mActivePointerId>
    //  214  460:invokestatic    #540 <Method int MotionEventCompat.findPointerIndex(MotionEvent, int)>
    //  215  463:invokestatic    #543 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //  216  466:putfield        #120 <Field float mLastMotionX>
    //  217  469:goto            84
    //  218  472:iconst_0        
    //  219  473:istore          4
    //  220  475:goto            443
    }

    public void setClipPadding(float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:putfield        #243 <Field float mClipPadding>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #400 <Method void invalidate()>
    //    5    9:return          
    }

    public void setCurrentItem(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #339 <Field ViewPager mViewPager>
    //    2    4:ifnonnull       18
    //    3    7:new             #579 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc2            #581 <String "ViewPager has not been bound.">
    //    6   14:invokespecial   #584 <Method void IllegalStateException(String)>
    //    7   17:athrow          
    //    8   18:aload_0         
    //    9   19:getfield        #339 <Field ViewPager mViewPager>
    //   10   22:iload_1         
    //   11   23:invokevirtual   #562 <Method void ViewPager.setCurrentItem(int)>
    //   12   26:aload_0         
    //   13   27:iload_1         
    //   14   28:putfield        #96  <Field int mCurrentPage>
    //   15   31:aload_0         
    //   16   32:invokevirtual   #400 <Method void invalidate()>
    //   17   35:return          
    }

    public void setFooterColor(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #115 <Field Paint mPaintFooterLine>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #279 <Method void Paint.setColor(int)>
    //    4    8:aload_0         
    //    5    9:getfield        #117 <Field Paint mPaintFooterIndicator>
    //    6   12:iload_1         
    //    7   13:invokevirtual   #279 <Method void Paint.setColor(int)>
    //    8   16:aload_0         
    //    9   17:invokevirtual   #400 <Method void invalidate()>
    //   10   20:return          
    }

    public void setFooterIndicatorHeight(float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:putfield        #226 <Field float mFooterIndicatorHeight>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #400 <Method void invalidate()>
    //    5    9:return          
    }

    public void setFooterIndicatorPadding(float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:putfield        #230 <Field float mFooterPadding>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #400 <Method void invalidate()>
    //    5    9:return          
    }

    public void setFooterIndicatorStyle(IndicatorStyle indicatorstyle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #224 <Field TitlePageIndicator$IndicatorStyle mFooterIndicatorStyle>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #400 <Method void invalidate()>
    //    5    9:return          
    }

    public void setFooterLineHeight(float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:putfield        #215 <Field float mFooterLineHeight>
    //    3    5:aload_0         
    //    4    6:getfield        #115 <Field Paint mPaintFooterLine>
    //    5    9:aload_0         
    //    6   10:getfield        #215 <Field float mFooterLineHeight>
    //    7   13:invokevirtual   #275 <Method void Paint.setStrokeWidth(float)>
    //    8   16:aload_0         
    //    9   17:invokevirtual   #400 <Method void invalidate()>
    //   10   20:return          
    }

    public void setLinePosition(LinePosition lineposition)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #237 <Field TitlePageIndicator$LinePosition mLinePosition>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #400 <Method void invalidate()>
    //    5    9:return          
    }

    public void setOnCenterItemClickListener(OnCenterItemClickListener oncenteritemclicklistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #564 <Field TitlePageIndicator$OnCenterItemClickListener mCenterItemClickListener>
    //    3    5:return          
    }

    public void setOnPageChangeListener(android.support.v4.view.ViewPager.OnPageChangeListener onpagechangelistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #487 <Field android.support.v4.view.ViewPager$OnPageChangeListener mListener>
    //    3    5:return          
    }

    public void setSelectedBold(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #254 <Field boolean mBoldText>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #400 <Method void invalidate()>
    //    5    9:return          
    }

    public void setSelectedColor(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #247 <Field int mColorSelected>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #400 <Method void invalidate()>
    //    5    9:return          
    }

    public void setTextColor(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #103 <Field Paint mPaintText>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #279 <Method void Paint.setColor(int)>
    //    4    8:aload_0         
    //    5    9:iload_1         
    //    6   10:putfield        #249 <Field int mColorText>
    //    7   13:aload_0         
    //    8   14:invokevirtual   #400 <Method void invalidate()>
    //    9   17:return          
    }

    public void setTextSize(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #103 <Field Paint mPaintText>
    //    2    4:fload_1         
    //    3    5:invokevirtual   #258 <Method void Paint.setTextSize(float)>
    //    4    8:aload_0         
    //    5    9:invokevirtual   #400 <Method void invalidate()>
    //    6   12:return          
    }

    public void setTitlePadding(float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:putfield        #241 <Field float mTitlePadding>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #400 <Method void invalidate()>
    //    5    9:return          
    }

    public void setTopPadding(float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:putfield        #239 <Field float mTopPadding>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #400 <Method void invalidate()>
    //    5    9:return          
    }

    public void setTypeface(Typeface typeface)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #103 <Field Paint mPaintText>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #606 <Method Typeface Paint.setTypeface(Typeface)>
    //    4    8:pop             
    //    5    9:aload_0         
    //    6   10:invokevirtual   #400 <Method void invalidate()>
    //    7   13:return          
    }

    public void setViewPager(ViewPager viewpager)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #339 <Field ViewPager mViewPager>
    //    2    4:aload_1         
    //    3    5:if_acmpne       9
    //    4    8:return          
    //    5    9:aload_0         
    //    6   10:getfield        #339 <Field ViewPager mViewPager>
    //    7   13:ifnull          24
    //    8   16:aload_0         
    //    9   17:getfield        #339 <Field ViewPager mViewPager>
    //   10   20:aconst_null     
    //   11   21:invokevirtual   #610 <Method void ViewPager.setOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
    //   12   24:aload_1         
    //   13   25:invokevirtual   #345 <Method PagerAdapter ViewPager.getAdapter()>
    //   14   28:ifnonnull       42
    //   15   31:new             #579 <Class IllegalStateException>
    //   16   34:dup             
    //   17   35:ldc2            #612 <String "ViewPager does not have adapter instance.">
    //   18   38:invokespecial   #584 <Method void IllegalStateException(String)>
    //   19   41:athrow          
    //   20   42:aload_0         
    //   21   43:aload_1         
    //   22   44:putfield        #339 <Field ViewPager mViewPager>
    //   23   47:aload_0         
    //   24   48:getfield        #339 <Field ViewPager mViewPager>
    //   25   51:aload_0         
    //   26   52:invokevirtual   #610 <Method void ViewPager.setOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
    //   27   55:aload_0         
    //   28   56:invokevirtual   #400 <Method void invalidate()>
    //   29   59:return          
    }

    public void setViewPager(ViewPager viewpager, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #615 <Method void setViewPager(ViewPager)>
    //    3    5:aload_0         
    //    4    6:iload_2         
    //    5    7:invokevirtual   #415 <Method void setCurrentItem(int)>
    //    6   10:return          
    }

    private static int $SWITCH_TABLE$com$viewpagerindicator$TitlePageIndicator$IndicatorStyle[];
    private static final float BOLD_FADE_PERCENTAGE = 0.05F;
    private static final String EMPTY_TITLE = "";
    private static final int INVALID_POINTER = -1;
    private static final float SELECTION_FADE_PERCENTAGE = 0.25F;
    private int mActivePointerId;
    private boolean mBoldText;
    private final Rect mBounds;
    private OnCenterItemClickListener mCenterItemClickListener;
    private float mClipPadding;
    private int mColorSelected;
    private int mColorText;
    private int mCurrentPage;
    private float mFooterIndicatorHeight;
    private IndicatorStyle mFooterIndicatorStyle;
    private float mFooterIndicatorUnderlinePadding;
    private float mFooterLineHeight;
    private float mFooterPadding;
    private boolean mIsDragging;
    private float mLastMotionX;
    private LinePosition mLinePosition;
    private android.support.v4.view.ViewPager.OnPageChangeListener mListener;
    private float mPageOffset;
    private final Paint mPaintFooterIndicator;
    private final Paint mPaintFooterLine;
    private final Paint mPaintText;
    private Path mPath;
    private int mScrollState;
    private float mTitlePadding;
    private float mTopPadding;
    private int mTouchSlop;
    private ViewPager mViewPager;

    // Unreferenced inner class com/viewpagerindicator/TitlePageIndicator$SavedState$1

/* anonymous class */
    class SavedState._cls1
        implements android.os.Parcelable.Creator
    {

        SavedState._cls1()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void Object()>
        //    2    4:return          
        }

        public SavedState createFromParcel(Parcel parcel)
        {
        //    0    0:new             #9   <Class TitlePageIndicator$SavedState>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:aconst_null     
        //    4    6:invokespecial   #18  <Method void TitlePageIndicator$SavedState(Parcel, TitlePageIndicator$SavedState)>
        //    5    9:areturn         
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #21  <Method TitlePageIndicator$SavedState createFromParcel(Parcel)>
        //    3    5:areturn         
        }

        public SavedState[] newArray(int i)
        {
        //    0    0:iload_1         
        //    1    1:anewarray       SavedState[]
        //    2    4:areturn         
        }

        public volatile Object[] newArray(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:invokevirtual   #26  <Method TitlePageIndicator$SavedState[] newArray(int)>
        //    3    5:areturn         
        }
    }

}
