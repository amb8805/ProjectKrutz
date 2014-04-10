// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.*;
import android.graphics.drawable.*;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.*;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.*;

public class ProgressBarICS extends View
{
    private class RefreshProgressRunnable
        implements Runnable
    {

        RefreshProgressRunnable(int i, int j, boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field ProgressBarICS this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:iload_2         
        //    7   11:putfield        #22  <Field int mId>
        //    8   14:aload_0         
        //    9   15:iload_3         
        //   10   16:putfield        #24  <Field int mProgress>
        //   11   19:aload_0         
        //   12   20:iload           4
        //   13   22:putfield        #26  <Field boolean mFromUser>
        //   14   25:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field ProgressBarICS this$0>
        //    2    4:aload_0         
        //    3    5:getfield        #22  <Field int mId>
        //    4    8:aload_0         
        //    5    9:getfield        #24  <Field int mProgress>
        //    6   12:aload_0         
        //    7   13:getfield        #26  <Field boolean mFromUser>
        //    8   16:iconst_1        
        //    9   17:invokestatic    #33  <Method void ProgressBarICS.access$000(ProgressBarICS, int, int, boolean, boolean)>
        //   10   20:aload_0         
        //   11   21:getfield        #17  <Field ProgressBarICS this$0>
        //   12   24:aload_0         
        //   13   25:invokestatic    #37  <Method ProgressBarICS$RefreshProgressRunnable ProgressBarICS.access$102(ProgressBarICS, ProgressBarICS$RefreshProgressRunnable)>
        //   14   28:pop             
        //   15   29:return          
        }

        public void setup(int i, int j, boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #22  <Field int mId>
        //    3    5:aload_0         
        //    4    6:iload_2         
        //    5    7:putfield        #24  <Field int mProgress>
        //    6   10:aload_0         
        //    7   11:iload_3         
        //    8   12:putfield        #26  <Field boolean mFromUser>
        //    9   15:return          
        }

        private boolean mFromUser;
        private int mId;
        private int mProgress;
        final ProgressBarICS this$0;
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        static 
        {
        //    0    0:new             #14  <Class ProgressBarICS$SavedState$1>
        //    1    3:dup             
        //    2    4:invokespecial   #17  <Method void ProgressBarICS$SavedState$1()>
        //    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
        //    4   10:return          
        }

        private SavedState(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #22  <Method void android.view.View$BaseSavedState(Parcel)>
        //    3    5:aload_0         
        //    4    6:aload_1         
        //    5    7:invokevirtual   #28  <Method int Parcel.readInt()>
        //    6   10:putfield        #30  <Field int progress>
        //    7   13:aload_0         
        //    8   14:aload_1         
        //    9   15:invokevirtual   #28  <Method int Parcel.readInt()>
        //   10   18:putfield        #32  <Field int secondaryProgress>
        //   11   21:return          
        }

        SavedState(Parcel parcel, _cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #34  <Method void ProgressBarICS$SavedState(Parcel)>
        //    3    5:return          
        }

        SavedState(Parcelable parcelable)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #37  <Method void android.view.View$BaseSavedState(Parcelable)>
        //    3    5:return          
        }

        public void writeToParcel(Parcel parcel, int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #41  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
        //    4    6:aload_1         
        //    5    7:aload_0         
        //    6    8:getfield        #30  <Field int progress>
        //    7   11:invokevirtual   #45  <Method void Parcel.writeInt(int)>
        //    8   14:aload_1         
        //    9   15:aload_0         
        //   10   16:getfield        #32  <Field int secondaryProgress>
        //   11   19:invokevirtual   #45  <Method void Parcel.writeInt(int)>
        //   12   22:return          
        }

        public static final android.os.Parcelable.Creator CREATOR;
        int progress;
        int secondaryProgress;
    }


    static 
    {
    //    0    0:bipush          14
    //    1    2:newarray        int[]
    //    2    4:dup             
    //    3    5:iconst_0        
    //    4    6:ldc1            #46  <Int 0x1010136>
    //    5    8:iastore         
    //    6    9:dup             
    //    7   10:iconst_1        
    //    8   11:ldc1            #47  <Int 0x1010137>
    //    9   13:iastore         
    //   10   14:dup             
    //   11   15:iconst_2        
    //   12   16:ldc1            #48  <Int 0x1010138>
    //   13   18:iastore         
    //   14   19:dup             
    //   15   20:iconst_3        
    //   16   21:ldc1            #49  <Int 0x1010139>
    //   17   23:iastore         
    //   18   24:dup             
    //   19   25:iconst_4        
    //   20   26:ldc1            #50  <Int 0x101013a>
    //   21   28:iastore         
    //   22   29:dup             
    //   23   30:iconst_5        
    //   24   31:ldc1            #51  <Int 0x101013b>
    //   25   33:iastore         
    //   26   34:dup             
    //   27   35:bipush          6
    //   28   37:ldc1            #52  <Int 0x101013c>
    //   29   39:iastore         
    //   30   40:dup             
    //   31   41:bipush          7
    //   32   43:ldc1            #53  <Int 0x101013d>
    //   33   45:iastore         
    //   34   46:dup             
    //   35   47:bipush          8
    //   36   49:ldc1            #54  <Int 0x101013e>
    //   37   51:iastore         
    //   38   52:dup             
    //   39   53:bipush          9
    //   40   55:ldc1            #55  <Int 0x101013f>
    //   41   57:iastore         
    //   42   58:dup             
    //   43   59:bipush          10
    //   44   61:ldc1            #56  <Int 0x101011f>
    //   45   63:iastore         
    //   46   64:dup             
    //   47   65:bipush          11
    //   48   67:ldc1            #57  <Int 0x1010140>
    //   49   69:iastore         
    //   50   70:dup             
    //   51   71:bipush          12
    //   52   73:ldc1            #58  <Int 0x1010120>
    //   53   75:iastore         
    //   54   76:dup             
    //   55   77:bipush          13
    //   56   79:ldc1            #59  <Int 0x1010141>
    //   57   81:iastore         
    //   58   82:putstatic       #61  <Field int[] android_R_styleable_ProgressBar>
    //   59   85:return          
    }

    public ProgressBarICS(Context context, AttributeSet attributeset, int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #66  <Method void View(Context, AttributeSet, int)>
    //    5    7:aload_0         
    //    6    8:invokestatic    #72  <Method Thread Thread.currentThread()>
    //    7   11:invokevirtual   #76  <Method long Thread.getId()>
    //    8   14:putfield        #78  <Field long mUiThreadId>
    //    9   17:aload_0         
    //   10   18:invokespecial   #81  <Method void initProgressBar()>
    //   11   21:aload_1         
    //   12   22:aload_2         
    //   13   23:getstatic       #61  <Field int[] android_R_styleable_ProgressBar>
    //   14   26:iload_3         
    //   15   27:iload           4
    //   16   29:invokevirtual   #87  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
    //   17   32:astore          5
    //   18   34:aload_0         
    //   19   35:iconst_1        
    //   20   36:putfield        #89  <Field boolean mNoInvalidate>
    //   21   39:aload_0         
    //   22   40:aload           5
    //   23   42:iconst_0        
    //   24   43:aload_0         
    //   25   44:getfield        #91  <Field int mMax>
    //   26   47:invokevirtual   #97  <Method int TypedArray.getInt(int, int)>
    //   27   50:invokevirtual   #101 <Method void setMax(int)>
    //   28   53:aload_0         
    //   29   54:aload           5
    //   30   56:iconst_1        
    //   31   57:aload_0         
    //   32   58:getfield        #103 <Field int mProgress>
    //   33   61:invokevirtual   #97  <Method int TypedArray.getInt(int, int)>
    //   34   64:invokevirtual   #106 <Method void setProgress(int)>
    //   35   67:aload_0         
    //   36   68:aload           5
    //   37   70:iconst_2        
    //   38   71:aload_0         
    //   39   72:getfield        #108 <Field int mSecondaryProgress>
    //   40   75:invokevirtual   #97  <Method int TypedArray.getInt(int, int)>
    //   41   78:invokevirtual   #111 <Method void setSecondaryProgress(int)>
    //   42   81:aload           5
    //   43   83:iconst_3        
    //   44   84:aload_0         
    //   45   85:getfield        #113 <Field boolean mIndeterminate>
    //   46   88:invokevirtual   #117 <Method boolean TypedArray.getBoolean(int, boolean)>
    //   47   91:istore          6
    //   48   93:aload_0         
    //   49   94:aload           5
    //   50   96:iconst_4        
    //   51   97:aload_0         
    //   52   98:getfield        #119 <Field boolean mOnlyIndeterminate>
    //   53  101:invokevirtual   #117 <Method boolean TypedArray.getBoolean(int, boolean)>
    //   54  104:putfield        #119 <Field boolean mOnlyIndeterminate>
    //   55  107:aload           5
    //   56  109:iconst_5        
    //   57  110:invokevirtual   #123 <Method Drawable TypedArray.getDrawable(int)>
    //   58  113:astore          7
    //   59  115:aload           7
    //   60  117:ifnull          130
    //   61  120:aload_0         
    //   62  121:aload_0         
    //   63  122:aload           7
    //   64  124:invokespecial   #127 <Method Drawable tileifyIndeterminate(Drawable)>
    //   65  127:invokevirtual   #131 <Method void setIndeterminateDrawable(Drawable)>
    //   66  130:aload           5
    //   67  132:bipush          6
    //   68  134:invokevirtual   #123 <Method Drawable TypedArray.getDrawable(int)>
    //   69  137:astore          8
    //   70  139:aload           8
    //   71  141:ifnull          155
    //   72  144:aload_0         
    //   73  145:aload_0         
    //   74  146:aload           8
    //   75  148:iconst_0        
    //   76  149:invokespecial   #135 <Method Drawable tileify(Drawable, boolean)>
    //   77  152:invokevirtual   #138 <Method void setProgressDrawable(Drawable)>
    //   78  155:aload_0         
    //   79  156:aload           5
    //   80  158:bipush          7
    //   81  160:aload_0         
    //   82  161:getfield        #140 <Field int mDuration>
    //   83  164:invokevirtual   #97  <Method int TypedArray.getInt(int, int)>
    //   84  167:putfield        #140 <Field int mDuration>
    //   85  170:aload_0         
    //   86  171:aload           5
    //   87  173:bipush          8
    //   88  175:aload_0         
    //   89  176:getfield        #142 <Field int mBehavior>
    //   90  179:invokevirtual   #97  <Method int TypedArray.getInt(int, int)>
    //   91  182:putfield        #142 <Field int mBehavior>
    //   92  185:aload_0         
    //   93  186:aload           5
    //   94  188:bipush          9
    //   95  190:aload_0         
    //   96  191:getfield        #144 <Field int mMinWidth>
    //   97  194:invokevirtual   #147 <Method int TypedArray.getDimensionPixelSize(int, int)>
    //   98  197:putfield        #144 <Field int mMinWidth>
    //   99  200:aload_0         
    //  100  201:aload           5
    //  101  203:bipush          10
    //  102  205:aload_0         
    //  103  206:getfield        #149 <Field int mMaxWidth>
    //  104  209:invokevirtual   #147 <Method int TypedArray.getDimensionPixelSize(int, int)>
    //  105  212:putfield        #149 <Field int mMaxWidth>
    //  106  215:aload_0         
    //  107  216:aload           5
    //  108  218:bipush          11
    //  109  220:aload_0         
    //  110  221:getfield        #151 <Field int mMinHeight>
    //  111  224:invokevirtual   #147 <Method int TypedArray.getDimensionPixelSize(int, int)>
    //  112  227:putfield        #151 <Field int mMinHeight>
    //  113  230:aload_0         
    //  114  231:aload           5
    //  115  233:bipush          12
    //  116  235:aload_0         
    //  117  236:getfield        #153 <Field int mMaxHeight>
    //  118  239:invokevirtual   #147 <Method int TypedArray.getDimensionPixelSize(int, int)>
    //  119  242:putfield        #153 <Field int mMaxHeight>
    //  120  245:aload           5
    //  121  247:bipush          13
    //  122  249:ldc1            #154 <Int 0x10a000b>
    //  123  251:invokevirtual   #157 <Method int TypedArray.getResourceId(int, int)>
    //  124  254:istore          9
    //  125  256:iload           9
    //  126  258:ifle            268
    //  127  261:aload_0         
    //  128  262:aload_1         
    //  129  263:iload           9
    //  130  265:invokevirtual   #161 <Method void setInterpolator(Context, int)>
    //  131  268:aload           5
    //  132  270:invokevirtual   #164 <Method void TypedArray.recycle()>
    //  133  273:aload_0         
    //  134  274:iconst_0        
    //  135  275:putfield        #89  <Field boolean mNoInvalidate>
    //  136  278:aload_0         
    //  137  279:getfield        #119 <Field boolean mOnlyIndeterminate>
    //  138  282:ifne            293
    //  139  285:iconst_0        
    //  140  286:istore          10
    //  141  288:iload           6
    //  142  290:ifeq            296
    //  143  293:iconst_1        
    //  144  294:istore          10
    //  145  296:aload_0         
    //  146  297:iload           10
    //  147  299:invokevirtual   #168 <Method void setIndeterminate(boolean)>
    //  148  302:return          
    }

    static void access$000(ProgressBarICS progressbarics, int i, int j, boolean flag, boolean flag1)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:iload_3         
    //    4    4:iload           4
    //    5    6:invokespecial   #174 <Method void doRefreshProgress(int, int, boolean, boolean)>
    //    6    9:return          
// Previous instruction length mismatch
    //    7    0:aload_0         
    //    8    1:iload_1         
    //    9    2:iload_2         
    //   10    3:iload_3         
    //   11    4:iload           4
    //   12    6:invokespecial   #174 <Method void doRefreshProgress(int, int, boolean, boolean)>
    //   13    9:return          
    }

    static RefreshProgressRunnable access$102(ProgressBarICS progressbarics, RefreshProgressRunnable refreshprogressrunnable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #178 <Field ProgressBarICS$RefreshProgressRunnable mRefreshProgressRunnable>
    //    3    5:aload_1         
    //    4    6:areturn         
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:aload_1         
    //    7    2:putfield        #178 <Field ProgressBarICS$RefreshProgressRunnable mRefreshProgressRunnable>
    //    8    5:aload_1         
    //    9    6:areturn         
    }

    private void doRefreshProgress(int i, int j, boolean flag, boolean flag1)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 19 handler(s) 90
    //    2    2:aload_0         
    //    3    3:getfield        #91  <Field int mMax>
    //    4    6:ifle            70
    //    5    9:iload_2         
    //    6   10:i2f             
    //    7   11:aload_0         
    //    8   12:getfield        #91  <Field int mMax>
    //    9   15:i2f             
    //   10   16:fdiv            
    //   11   17:fstore          6
    // try 19 25 handler(s) 90
    //   12   19:aload_0         
    //   13   20:getfield        #180 <Field Drawable mCurrentDrawable>
    //   14   23:astore          7
    //   15   25:aload           7
    //   16   27:ifnull          83
    // try 30 37 handler(s) 90
    //   17   30:aload           7
    //   18   32:instanceof      #182 <Class LayerDrawable>
    //   19   35:istore          8
    //   20   37:aconst_null     
    //   21   38:astore          9
    //   22   40:iload           8
    //   23   42:ifeq            97
    // try 45 56 handler(s) 90
    //   24   45:aload           7
    //   25   47:checkcast       #182 <Class LayerDrawable>
    //   26   50:iload_1         
    //   27   51:invokevirtual   #185 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
    //   28   54:astore          9
    //   29   56:goto            97
    // try 59 67 handler(s) 90
    //   30   59:aload           9
    //   31   61:iload           10
    //   32   63:invokevirtual   #191 <Method boolean Drawable.setLevel(int)>
    //   33   66:pop             
    //   34   67:aload_0         
    //   35   68:monitorexit     
    //   36   69:return          
    //   37   70:fconst_0        
    //   38   71:fstore          6
    //   39   73:goto            19
    //   40   76:aload           7
    //   41   78:astore          9
    //   42   80:goto            59
    // try 83 87 handler(s) 90
    //   43   83:aload_0         
    //   44   84:invokevirtual   #194 <Method void invalidate()>
    //   45   87:goto            67
    // finally
    //   46   90:astore          5
    //   47   92:aload_0         
    //   48   93:monitorexit     
    //   49   94:aload           5
    //   50   96:athrow          
    //   51   97:ldc1            #195 <Float 10000F>
    //   52   99:fload           6
    //   53  101:fmul            
    //   54  102:f2i             
    //   55  103:istore          10
    //   56  105:aload           9
    //   57  107:ifnull          76
    //   58  110:goto            59
    }

    private void initProgressBar()
    {
    //    0    0:aload_0         
    //    1    1:bipush          100
    //    2    3:putfield        #91  <Field int mMax>
    //    3    6:aload_0         
    //    4    7:iconst_0        
    //    5    8:putfield        #103 <Field int mProgress>
    //    6   11:aload_0         
    //    7   12:iconst_0        
    //    8   13:putfield        #108 <Field int mSecondaryProgress>
    //    9   16:aload_0         
    //   10   17:iconst_0        
    //   11   18:putfield        #113 <Field boolean mIndeterminate>
    //   12   21:aload_0         
    //   13   22:iconst_0        
    //   14   23:putfield        #119 <Field boolean mOnlyIndeterminate>
    //   15   26:aload_0         
    //   16   27:sipush          4000
    //   17   30:putfield        #140 <Field int mDuration>
    //   18   33:aload_0         
    //   19   34:iconst_1        
    //   20   35:putfield        #142 <Field int mBehavior>
    //   21   38:aload_0         
    //   22   39:bipush          24
    //   23   41:putfield        #144 <Field int mMinWidth>
    //   24   44:aload_0         
    //   25   45:bipush          48
    //   26   47:putfield        #149 <Field int mMaxWidth>
    //   27   50:aload_0         
    //   28   51:bipush          24
    //   29   53:putfield        #151 <Field int mMinHeight>
    //   30   56:aload_0         
    //   31   57:bipush          48
    //   32   59:putfield        #153 <Field int mMaxHeight>
    //   33   62:return          
    }

    private void refreshProgress(int i, int j, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 24 handler(s) 63
    //    2    2:aload_0         
    //    3    3:getfield        #78  <Field long mUiThreadId>
    //    4    6:invokestatic    #72  <Method Thread Thread.currentThread()>
    //    5    9:invokevirtual   #76  <Method long Thread.getId()>
    //    6   12:lcmp            
    //    7   13:ifne            27
    //    8   16:aload_0         
    //    9   17:iload_1         
    //   10   18:iload_2         
    //   11   19:iload_3         
    //   12   20:iconst_1        
    //   13   21:invokespecial   #174 <Method void doRefreshProgress(int, int, boolean, boolean)>
    //   14   24:aload_0         
    //   15   25:monitorexit     
    //   16   26:return          
    // try 27 53 handler(s) 63
    //   17   27:aload_0         
    //   18   28:getfield        #178 <Field ProgressBarICS$RefreshProgressRunnable mRefreshProgressRunnable>
    //   19   31:ifnull          70
    //   20   34:aload_0         
    //   21   35:getfield        #178 <Field ProgressBarICS$RefreshProgressRunnable mRefreshProgressRunnable>
    //   22   38:astore          5
    //   23   40:aload_0         
    //   24   41:aconst_null     
    //   25   42:putfield        #178 <Field ProgressBarICS$RefreshProgressRunnable mRefreshProgressRunnable>
    //   26   45:aload           5
    //   27   47:iload_1         
    //   28   48:iload_2         
    //   29   49:iload_3         
    //   30   50:invokevirtual   #202 <Method void ProgressBarICS$RefreshProgressRunnable.setup(int, int, boolean)>
    // try 53 60 handler(s) 63
    //   31   53:aload_0         
    //   32   54:aload           5
    //   33   56:invokevirtual   #206 <Method boolean post(Runnable)>
    //   34   59:pop             
    //   35   60:goto            24
    // finally
    //   36   63:astore          4
    //   37   65:aload_0         
    //   38   66:monitorexit     
    //   39   67:aload           4
    //   40   69:athrow          
    // try 70 83 handler(s) 63
    //   41   70:new             #199 <Class ProgressBarICS$RefreshProgressRunnable>
    //   42   73:dup             
    //   43   74:aload_0         
    //   44   75:iload_1         
    //   45   76:iload_2         
    //   46   77:iload_3         
    //   47   78:invokespecial   #209 <Method void ProgressBarICS$RefreshProgressRunnable(ProgressBarICS, int, int, boolean)>
    //   48   81:astore          5
    //   49   83:goto            53
    }

    private Drawable tileify(Drawable drawable, boolean flag)
    {
    //    0    0:aload_1         
    //    1    1:instanceof      #182 <Class LayerDrawable>
    //    2    4:ifeq            138
    //    3    7:aload_1         
    //    4    8:checkcast       #182 <Class LayerDrawable>
    //    5   11:astore          8
    //    6   13:aload           8
    //    7   15:invokevirtual   #213 <Method int LayerDrawable.getNumberOfLayers()>
    //    8   18:istore          9
    //    9   20:iload           9
    //   10   22:anewarray       Drawable[]
    //   11   25:astore          10
    //   12   27:iconst_0        
    //   13   28:istore          11
    //   14   30:iload           11
    //   15   32:iload           9
    //   16   34:icmpge          97
    //   17   37:aload           8
    //   18   39:iload           11
    //   19   41:invokevirtual   #216 <Method int LayerDrawable.getId(int)>
    //   20   44:istore          13
    //   21   46:aload           8
    //   22   48:iload           11
    //   23   50:invokevirtual   #217 <Method Drawable LayerDrawable.getDrawable(int)>
    //   24   53:astore          14
    //   25   55:iload           13
    //   26   57:ldc1            #218 <Int 0x102000d>
    //   27   59:icmpeq          69
    //   28   62:iload           13
    //   29   64:ldc1            #219 <Int 0x102000f>
    //   30   66:icmpne          91
    //   31   69:iconst_1        
    //   32   70:istore          15
    //   33   72:aload           10
    //   34   74:iload           11
    //   35   76:aload_0         
    //   36   77:aload           14
    //   37   79:iload           15
    //   38   81:invokespecial   #135 <Method Drawable tileify(Drawable, boolean)>
    //   39   84:aastore         
    //   40   85:iinc            11  1
    //   41   88:goto            30
    //   42   91:iconst_0        
    //   43   92:istore          15
    //   44   94:goto            72
    //   45   97:new             #182 <Class LayerDrawable>
    //   46  100:dup             
    //   47  101:aload           10
    //   48  103:invokespecial   #222 <Method void LayerDrawable(Drawable[])>
    //   49  106:astore          7
    //   50  108:iconst_0        
    //   51  109:istore          12
    //   52  111:iload           12
    //   53  113:iload           9
    //   54  115:icmpge          226
    //   55  118:aload           7
    //   56  120:iload           12
    //   57  122:aload           8
    //   58  124:iload           12
    //   59  126:invokevirtual   #216 <Method int LayerDrawable.getId(int)>
    //   60  129:invokevirtual   #226 <Method void LayerDrawable.setId(int, int)>
    //   61  132:iinc            12  1
    //   62  135:goto            111
    //   63  138:aload_1         
    //   64  139:instanceof      #228 <Class BitmapDrawable>
    //   65  142:ifeq            229
    //   66  145:aload_1         
    //   67  146:checkcast       #228 <Class BitmapDrawable>
    //   68  149:invokevirtual   #232 <Method Bitmap BitmapDrawable.getBitmap()>
    //   69  152:astore_3        
    //   70  153:aload_0         
    //   71  154:getfield        #234 <Field Bitmap mSampleTile>
    //   72  157:ifnonnull       165
    //   73  160:aload_0         
    //   74  161:aload_3         
    //   75  162:putfield        #234 <Field Bitmap mSampleTile>
    //   76  165:new             #236 <Class ShapeDrawable>
    //   77  168:dup             
    //   78  169:aload_0         
    //   79  170:invokevirtual   #240 <Method Shape getDrawableShape()>
    //   80  173:invokespecial   #243 <Method void ShapeDrawable(Shape)>
    //   81  176:astore          4
    //   82  178:new             #245 <Class BitmapShader>
    //   83  181:dup             
    //   84  182:aload_3         
    //   85  183:getstatic       #251 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.REPEAT>
    //   86  186:getstatic       #254 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
    //   87  189:invokespecial   #257 <Method void BitmapShader(Bitmap, android.graphics.Shader$TileMode, android.graphics.Shader$TileMode)>
    //   88  192:astore          5
    //   89  194:aload           4
    //   90  196:invokevirtual   #261 <Method Paint ShapeDrawable.getPaint()>
    //   91  199:aload           5
    //   92  201:invokevirtual   #267 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
    //   93  204:pop             
    //   94  205:iload_2         
    //   95  206:ifeq            222
    //   96  209:new             #269 <Class ClipDrawable>
    //   97  212:dup             
    //   98  213:aload           4
    //   99  215:iconst_3        
    //  100  216:iconst_1        
    //  101  217:invokespecial   #272 <Method void ClipDrawable(Drawable, int, int)>
    //  102  220:astore          4
    //  103  222:aload           4
    //  104  224:astore          7
    //  105  226:aload           7
    //  106  228:areturn         
    //  107  229:aload_1         
    //  108  230:areturn         
    }

    private Drawable tileifyIndeterminate(Drawable drawable)
    {
    //    0    0:aload_1         
    //    1    1:instanceof      #274 <Class AnimationDrawable>
    //    2    4:ifeq            97
    //    3    7:aload_1         
    //    4    8:checkcast       #274 <Class AnimationDrawable>
    //    5   11:astore_2        
    //    6   12:aload_2         
    //    7   13:invokevirtual   #277 <Method int AnimationDrawable.getNumberOfFrames()>
    //    8   16:istore_3        
    //    9   17:new             #274 <Class AnimationDrawable>
    //   10   20:dup             
    //   11   21:invokespecial   #279 <Method void AnimationDrawable()>
    //   12   24:astore          4
    //   13   26:aload           4
    //   14   28:aload_2         
    //   15   29:invokevirtual   #283 <Method boolean AnimationDrawable.isOneShot()>
    //   16   32:invokevirtual   #286 <Method void AnimationDrawable.setOneShot(boolean)>
    //   17   35:iconst_0        
    //   18   36:istore          5
    //   19   38:iload           5
    //   20   40:iload_3         
    //   21   41:icmpge          85
    //   22   44:aload_0         
    //   23   45:aload_2         
    //   24   46:iload           5
    //   25   48:invokevirtual   #289 <Method Drawable AnimationDrawable.getFrame(int)>
    //   26   51:iconst_1        
    //   27   52:invokespecial   #135 <Method Drawable tileify(Drawable, boolean)>
    //   28   55:astore          7
    //   29   57:aload           7
    //   30   59:sipush          10000
    //   31   62:invokevirtual   #191 <Method boolean Drawable.setLevel(int)>
    //   32   65:pop             
    //   33   66:aload           4
    //   34   68:aload           7
    //   35   70:aload_2         
    //   36   71:iload           5
    //   37   73:invokevirtual   #292 <Method int AnimationDrawable.getDuration(int)>
    //   38   76:invokevirtual   #296 <Method void AnimationDrawable.addFrame(Drawable, int)>
    //   39   79:iinc            5  1
    //   40   82:goto            38
    //   41   85:aload           4
    //   42   87:sipush          10000
    //   43   90:invokevirtual   #297 <Method boolean AnimationDrawable.setLevel(int)>
    //   44   93:pop             
    //   45   94:aload           4
    //   46   96:astore_1        
    //   47   97:aload_1         
    //   48   98:areturn         
    }

    private void updateDrawableBounds(int i, int j)
    {
    //    0    0:iload_1         
    //    1    1:aload_0         
    //    2    2:invokevirtual   #301 <Method int getPaddingRight()>
    //    3    5:isub            
    //    4    6:aload_0         
    //    5    7:invokevirtual   #304 <Method int getPaddingLeft()>
    //    6   10:isub            
    //    7   11:istore_3        
    //    8   12:iload_2         
    //    9   13:aload_0         
    //   10   14:invokevirtual   #307 <Method int getPaddingBottom()>
    //   11   17:isub            
    //   12   18:aload_0         
    //   13   19:invokevirtual   #310 <Method int getPaddingTop()>
    //   14   22:isub            
    //   15   23:istore          4
    //   16   25:aload_0         
    //   17   26:getfield        #312 <Field Drawable mIndeterminateDrawable>
    //   18   29:ifnull          165
    //   19   32:aload_0         
    //   20   33:getfield        #119 <Field boolean mOnlyIndeterminate>
    //   21   36:istore          5
    //   22   38:iconst_0        
    //   23   39:istore          6
    //   24   41:iconst_0        
    //   25   42:istore          7
    //   26   44:iload           5
    //   27   46:ifeq            151
    //   28   49:aload_0         
    //   29   50:getfield        #312 <Field Drawable mIndeterminateDrawable>
    //   30   53:instanceof      #274 <Class AnimationDrawable>
    //   31   56:istore          8
    //   32   58:iconst_0        
    //   33   59:istore          6
    //   34   61:iconst_0        
    //   35   62:istore          7
    //   36   64:iload           8
    //   37   66:ifne            151
    //   38   69:aload_0         
    //   39   70:getfield        #312 <Field Drawable mIndeterminateDrawable>
    //   40   73:invokevirtual   #315 <Method int Drawable.getIntrinsicWidth()>
    //   41   76:istore          9
    //   42   78:aload_0         
    //   43   79:getfield        #312 <Field Drawable mIndeterminateDrawable>
    //   44   82:invokevirtual   #318 <Method int Drawable.getIntrinsicHeight()>
    //   45   85:istore          10
    //   46   87:iload           9
    //   47   89:i2f             
    //   48   90:iload           10
    //   49   92:i2f             
    //   50   93:fdiv            
    //   51   94:fstore          11
    //   52   96:iload_1         
    //   53   97:i2f             
    //   54   98:iload_2         
    //   55   99:i2f             
    //   56  100:fdiv            
    //   57  101:fstore          12
    //   58  103:fload           11
    //   59  105:fload           12
    //   60  107:fcmpl           
    //   61  108:istore          13
    //   62  110:iconst_0        
    //   63  111:istore          6
    //   64  113:iconst_0        
    //   65  114:istore          7
    //   66  116:iload           13
    //   67  118:ifeq            151
    //   68  121:fload           12
    //   69  123:fload           11
    //   70  125:fcmpl           
    //   71  126:ifle            185
    //   72  129:fload           11
    //   73  131:iload_2         
    //   74  132:i2f             
    //   75  133:fmul            
    //   76  134:f2i             
    //   77  135:istore          15
    //   78  137:iload_1         
    //   79  138:iload           15
    //   80  140:isub            
    //   81  141:iconst_2        
    //   82  142:idiv            
    //   83  143:istore          6
    //   84  145:iload           6
    //   85  147:iload           15
    //   86  149:iadd            
    //   87  150:istore_3        
    //   88  151:aload_0         
    //   89  152:getfield        #312 <Field Drawable mIndeterminateDrawable>
    //   90  155:iload           6
    //   91  157:iload           7
    //   92  159:iload_3         
    //   93  160:iload           4
    //   94  162:invokevirtual   #322 <Method void Drawable.setBounds(int, int, int, int)>
    //   95  165:aload_0         
    //   96  166:getfield        #324 <Field Drawable mProgressDrawable>
    //   97  169:ifnull          184
    //   98  172:aload_0         
    //   99  173:getfield        #324 <Field Drawable mProgressDrawable>
    //  100  176:iconst_0        
    //  101  177:iconst_0        
    //  102  178:iload_3         
    //  103  179:iload           4
    //  104  181:invokevirtual   #322 <Method void Drawable.setBounds(int, int, int, int)>
    //  105  184:return          
    //  106  185:iload_1         
    //  107  186:i2f             
    //  108  187:fconst_1        
    //  109  188:fload           11
    //  110  190:fdiv            
    //  111  191:fmul            
    //  112  192:f2i             
    //  113  193:istore          14
    //  114  195:iload_2         
    //  115  196:iload           14
    //  116  198:isub            
    //  117  199:iconst_2        
    //  118  200:idiv            
    //  119  201:istore          7
    //  120  203:iload           7
    //  121  205:iload           14
    //  122  207:iadd            
    //  123  208:istore          4
    //  124  210:iconst_0        
    //  125  211:istore          6
    //  126  213:goto            151
    }

    private void updateDrawableState()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #329 <Method int[] getDrawableState()>
    //    2    4:astore_1        
    //    3    5:aload_0         
    //    4    6:getfield        #324 <Field Drawable mProgressDrawable>
    //    5    9:ifnull          31
    //    6   12:aload_0         
    //    7   13:getfield        #324 <Field Drawable mProgressDrawable>
    //    8   16:invokevirtual   #332 <Method boolean Drawable.isStateful()>
    //    9   19:ifeq            31
    //   10   22:aload_0         
    //   11   23:getfield        #324 <Field Drawable mProgressDrawable>
    //   12   26:aload_1         
    //   13   27:invokevirtual   #336 <Method boolean Drawable.setState(int[])>
    //   14   30:pop             
    //   15   31:aload_0         
    //   16   32:getfield        #312 <Field Drawable mIndeterminateDrawable>
    //   17   35:ifnull          57
    //   18   38:aload_0         
    //   19   39:getfield        #312 <Field Drawable mIndeterminateDrawable>
    //   20   42:invokevirtual   #332 <Method boolean Drawable.isStateful()>
    //   21   45:ifeq            57
    //   22   48:aload_0         
    //   23   49:getfield        #312 <Field Drawable mIndeterminateDrawable>
    //   24   52:aload_1         
    //   25   53:invokevirtual   #336 <Method boolean Drawable.setState(int[])>
    //   26   56:pop             
    //   27   57:return          
    }

    protected void drawableStateChanged()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #339 <Method void View.drawableStateChanged()>
    //    2    4:aload_0         
    //    3    5:invokespecial   #341 <Method void updateDrawableState()>
    //    4    8:return          
    }

    Shape getDrawableShape()
    {
    //    0    0:new             #343 <Class RoundRectShape>
    //    1    3:dup             
    //    2    4:bipush          8
    //    3    6:newarray        float[]
    //    4    8:dup             
    //    5    9:iconst_0        
    //    6   10:ldc2            #344 <Float 5F>
    //    7   13:fastore         
    //    8   14:dup             
    //    9   15:iconst_1        
    //   10   16:ldc2            #344 <Float 5F>
    //   11   19:fastore         
    //   12   20:dup             
    //   13   21:iconst_2        
    //   14   22:ldc2            #344 <Float 5F>
    //   15   25:fastore         
    //   16   26:dup             
    //   17   27:iconst_3        
    //   18   28:ldc2            #344 <Float 5F>
    //   19   31:fastore         
    //   20   32:dup             
    //   21   33:iconst_4        
    //   22   34:ldc2            #344 <Float 5F>
    //   23   37:fastore         
    //   24   38:dup             
    //   25   39:iconst_5        
    //   26   40:ldc2            #344 <Float 5F>
    //   27   43:fastore         
    //   28   44:dup             
    //   29   45:bipush          6
    //   30   47:ldc2            #344 <Float 5F>
    //   31   50:fastore         
    //   32   51:dup             
    //   33   52:bipush          7
    //   34   54:ldc2            #344 <Float 5F>
    //   35   57:fastore         
    //   36   58:aconst_null     
    //   37   59:aconst_null     
    //   38   60:invokespecial   #347 <Method void RoundRectShape(float[], android.graphics.RectF, float[])>
    //   39   63:areturn         
    }

    public Drawable getIndeterminateDrawable()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #312 <Field Drawable mIndeterminateDrawable>
    //    2    4:areturn         
    }

    public Interpolator getInterpolator()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #353 <Field Interpolator mInterpolator>
    //    2    4:areturn         
    }

    public int getMax()
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 7 handler(s) 11
    //    2    2:aload_0         
    //    3    3:getfield        #91  <Field int mMax>
    //    4    6:istore_2        
    //    5    7:aload_0         
    //    6    8:monitorexit     
    //    7    9:iload_2         
    //    8   10:ireturn         
    // finally
    //    9   11:astore_1        
    //   10   12:aload_0         
    //   11   13:monitorexit     
    //   12   14:aload_1         
    //   13   15:athrow          
    }

    public int getProgress()
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 7 handler(s) 25
    //    2    2:aload_0         
    //    3    3:getfield        #113 <Field boolean mIndeterminate>
    //    4    6:istore_2        
    //    5    7:iload_2         
    //    6    8:ifeq            17
    //    7   11:iconst_0        
    //    8   12:istore_3        
    //    9   13:aload_0         
    //   10   14:monitorexit     
    //   11   15:iload_3         
    //   12   16:ireturn         
    // try 17 22 handler(s) 25
    //   13   17:aload_0         
    //   14   18:getfield        #103 <Field int mProgress>
    //   15   21:istore_3        
    //   16   22:goto            13
    // finally
    //   17   25:astore_1        
    //   18   26:aload_0         
    //   19   27:monitorexit     
    //   20   28:aload_1         
    //   21   29:athrow          
    }

    public Drawable getProgressDrawable()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #324 <Field Drawable mProgressDrawable>
    //    2    4:areturn         
    }

    public int getSecondaryProgress()
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 7 handler(s) 25
    //    2    2:aload_0         
    //    3    3:getfield        #113 <Field boolean mIndeterminate>
    //    4    6:istore_2        
    //    5    7:iload_2         
    //    6    8:ifeq            17
    //    7   11:iconst_0        
    //    8   12:istore_3        
    //    9   13:aload_0         
    //   10   14:monitorexit     
    //   11   15:iload_3         
    //   12   16:ireturn         
    // try 17 22 handler(s) 25
    //   13   17:aload_0         
    //   14   18:getfield        #108 <Field int mSecondaryProgress>
    //   15   21:istore_3        
    //   16   22:goto            13
    // finally
    //   17   25:astore_1        
    //   18   26:aload_0         
    //   19   27:monitorexit     
    //   20   28:aload_1         
    //   21   29:athrow          
    }

    public final void incrementProgressBy(int i)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 12 handler(s) 15
    //    2    2:aload_0         
    //    3    3:iload_1         
    //    4    4:aload_0         
    //    5    5:getfield        #103 <Field int mProgress>
    //    6    8:iadd            
    //    7    9:invokevirtual   #106 <Method void setProgress(int)>
    //    8   12:aload_0         
    //    9   13:monitorexit     
    //   10   14:return          
    // finally
    //   11   15:astore_2        
    //   12   16:aload_0         
    //   13   17:monitorexit     
    //   14   18:aload_2         
    //   15   19:athrow          
    }

    public final void incrementSecondaryProgressBy(int i)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 12 handler(s) 15
    //    2    2:aload_0         
    //    3    3:iload_1         
    //    4    4:aload_0         
    //    5    5:getfield        #108 <Field int mSecondaryProgress>
    //    6    8:iadd            
    //    7    9:invokevirtual   #111 <Method void setSecondaryProgress(int)>
    //    8   12:aload_0         
    //    9   13:monitorexit     
    //   10   14:return          
    // finally
    //   11   15:astore_2        
    //   12   16:aload_0         
    //   13   17:monitorexit     
    //   14   18:aload_2         
    //   15   19:athrow          
    }

    public void invalidateDrawable(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #362 <Field boolean mInDrawing>
    //    2    4:ifne            71
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:invokevirtual   #366 <Method boolean verifyDrawable(Drawable)>
    //    6   12:ifeq            72
    //    7   15:aload_1         
    //    8   16:invokevirtual   #370 <Method Rect Drawable.getBounds()>
    //    9   19:astore_2        
    //   10   20:aload_0         
    //   11   21:invokevirtual   #373 <Method int getScrollX()>
    //   12   24:aload_0         
    //   13   25:invokevirtual   #304 <Method int getPaddingLeft()>
    //   14   28:iadd            
    //   15   29:istore_3        
    //   16   30:aload_0         
    //   17   31:invokevirtual   #376 <Method int getScrollY()>
    //   18   34:aload_0         
    //   19   35:invokevirtual   #310 <Method int getPaddingTop()>
    //   20   38:iadd            
    //   21   39:istore          4
    //   22   41:aload_0         
    //   23   42:iload_3         
    //   24   43:aload_2         
    //   25   44:getfield        #381 <Field int Rect.left>
    //   26   47:iadd            
    //   27   48:iload           4
    //   28   50:aload_2         
    //   29   51:getfield        #384 <Field int Rect.top>
    //   30   54:iadd            
    //   31   55:iload_3         
    //   32   56:aload_2         
    //   33   57:getfield        #387 <Field int Rect.right>
    //   34   60:iadd            
    //   35   61:iload           4
    //   36   63:aload_2         
    //   37   64:getfield        #390 <Field int Rect.bottom>
    //   38   67:iadd            
    //   39   68:invokevirtual   #392 <Method void invalidate(int, int, int, int)>
    //   40   71:return          
    //   41   72:aload_0         
    //   42   73:aload_1         
    //   43   74:invokespecial   #394 <Method void View.invalidateDrawable(Drawable)>
    //   44   77:return          
    }

    public boolean isIndeterminate()
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 7 handler(s) 11
    //    2    2:aload_0         
    //    3    3:getfield        #113 <Field boolean mIndeterminate>
    //    4    6:istore_2        
    //    5    7:aload_0         
    //    6    8:monitorexit     
    //    7    9:iload_2         
    //    8   10:ireturn         
    // finally
    //    9   11:astore_1        
    //   10   12:aload_0         
    //   11   13:monitorexit     
    //   12   14:aload_1         
    //   13   15:athrow          
    }

    protected void onAttachedToWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #398 <Method void View.onAttachedToWindow()>
    //    2    4:aload_0         
    //    3    5:getfield        #113 <Field boolean mIndeterminate>
    //    4    8:ifeq            15
    //    5   11:aload_0         
    //    6   12:invokevirtual   #401 <Method void startAnimation()>
    //    7   15:return          
    }

    protected void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #113 <Field boolean mIndeterminate>
    //    2    4:ifeq            11
    //    3    7:aload_0         
    //    4    8:invokevirtual   #405 <Method void stopAnimation()>
    //    5   11:aload_0         
    //    6   12:getfield        #178 <Field ProgressBarICS$RefreshProgressRunnable mRefreshProgressRunnable>
    //    7   15:ifnull          27
    //    8   18:aload_0         
    //    9   19:aload_0         
    //   10   20:getfield        #178 <Field ProgressBarICS$RefreshProgressRunnable mRefreshProgressRunnable>
    //   11   23:invokevirtual   #408 <Method boolean removeCallbacks(Runnable)>
    //   12   26:pop             
    //   13   27:aload_0         
    //   14   28:invokespecial   #410 <Method void View.onDetachedFromWindow()>
    //   15   31:return          
    }

    protected void onDraw(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 12 handler(s) 171
    //    2    2:aload_0         
    //    3    3:aload_1         
    //    4    4:invokespecial   #414 <Method void View.onDraw(Canvas)>
    //    5    7:aload_0         
    //    6    8:getfield        #180 <Field Drawable mCurrentDrawable>
    //    7   11:astore_3        
    //    8   12:aload_3         
    //    9   13:ifnull          158
    // try 16 71 handler(s) 171
    //   10   16:aload_1         
    //   11   17:invokevirtual   #419 <Method int Canvas.save()>
    //   12   20:pop             
    //   13   21:aload_1         
    //   14   22:aload_0         
    //   15   23:invokevirtual   #304 <Method int getPaddingLeft()>
    //   16   26:i2f             
    //   17   27:aload_0         
    //   18   28:invokevirtual   #310 <Method int getPaddingTop()>
    //   19   31:i2f             
    //   20   32:invokevirtual   #423 <Method void Canvas.translate(float, float)>
    //   21   35:aload_0         
    //   22   36:invokevirtual   #426 <Method long getDrawingTime()>
    //   23   39:lstore          5
    //   24   41:aload_0         
    //   25   42:getfield        #428 <Field AlphaAnimation mAnimation>
    //   26   45:ifnull          121
    //   27   48:aload_0         
    //   28   49:getfield        #428 <Field AlphaAnimation mAnimation>
    //   29   52:lload           5
    //   30   54:aload_0         
    //   31   55:getfield        #430 <Field Transformation mTransformation>
    //   32   58:invokevirtual   #436 <Method boolean AlphaAnimation.getTransformation(long, Transformation)>
    //   33   61:pop             
    //   34   62:aload_0         
    //   35   63:getfield        #430 <Field Transformation mTransformation>
    //   36   66:invokevirtual   #442 <Method float Transformation.getAlpha()>
    //   37   69:fstore          8
    // try 71 87 handler(s) 161
    //   38   71:aload_0         
    //   39   72:iconst_1        
    //   40   73:putfield        #362 <Field boolean mInDrawing>
    //   41   76:aload_3         
    //   42   77:ldc1            #195 <Float 10000F>
    //   43   79:fload           8
    //   44   81:fmul            
    //   45   82:f2i             
    //   46   83:invokevirtual   #191 <Method boolean Drawable.setLevel(int)>
    //   47   86:pop             
    // try 87 121 handler(s) 171
    //   48   87:aload_0         
    //   49   88:iconst_0        
    //   50   89:putfield        #362 <Field boolean mInDrawing>
    //   51   92:invokestatic    #447 <Method long SystemClock.uptimeMillis()>
    //   52   95:aload_0         
    //   53   96:getfield        #449 <Field long mLastDrawTime>
    //   54   99:lsub            
    //   55  100:ldc2w           #450 <Long 200L>
    //   56  103:lcmp            
    //   57  104:iflt            121
    //   58  107:aload_0         
    //   59  108:invokestatic    #447 <Method long SystemClock.uptimeMillis()>
    //   60  111:putfield        #449 <Field long mLastDrawTime>
    //   61  114:aload_0         
    //   62  115:ldc2w           #450 <Long 200L>
    //   63  118:invokevirtual   #455 <Method void postInvalidateDelayed(long)>
    // try 121 158 handler(s) 171
    //   64  121:aload_3         
    //   65  122:aload_1         
    //   66  123:invokevirtual   #458 <Method void Drawable.draw(Canvas)>
    //   67  126:aload_1         
    //   68  127:invokevirtual   #461 <Method void Canvas.restore()>
    //   69  130:aload_0         
    //   70  131:getfield        #463 <Field boolean mShouldStartAnimationDrawable>
    //   71  134:ifeq            158
    //   72  137:aload_3         
    //   73  138:instanceof      #465 <Class Animatable>
    //   74  141:ifeq            158
    //   75  144:aload_3         
    //   76  145:checkcast       #465 <Class Animatable>
    //   77  148:invokeinterface #468 <Method void Animatable.start()>
    //   78  153:aload_0         
    //   79  154:iconst_0        
    //   80  155:putfield        #463 <Field boolean mShouldStartAnimationDrawable>
    //   81  158:aload_0         
    //   82  159:monitorexit     
    //   83  160:return          
    // finally
    //   84  161:astore          9
    // try 163 171 handler(s) 171
    //   85  163:aload_0         
    //   86  164:iconst_0        
    //   87  165:putfield        #362 <Field boolean mInDrawing>
    //   88  168:aload           9
    //   89  170:athrow          
    // finally
    //   90  171:astore_2        
    //   91  172:aload_0         
    //   92  173:monitorexit     
    //   93  174:aload_2         
    //   94  175:athrow          
    }

    protected void onMeasure(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 8 handler(s) 112
    //    2    2:aload_0         
    //    3    3:getfield        #180 <Field Drawable mCurrentDrawable>
    //    4    6:astore          4
    //    5    8:iconst_0        
    //    6    9:istore          5
    //    7   11:iconst_0        
    //    8   12:istore          6
    //    9   14:aload           4
    //   10   16:ifnull          61
    // try 19 61 handler(s) 112
    //   11   19:aload_0         
    //   12   20:getfield        #144 <Field int mMinWidth>
    //   13   23:aload_0         
    //   14   24:getfield        #149 <Field int mMaxWidth>
    //   15   27:aload           4
    //   16   29:invokevirtual   #315 <Method int Drawable.getIntrinsicWidth()>
    //   17   32:invokestatic    #474 <Method int Math.min(int, int)>
    //   18   35:invokestatic    #477 <Method int Math.max(int, int)>
    //   19   38:istore          6
    //   20   40:aload_0         
    //   21   41:getfield        #151 <Field int mMinHeight>
    //   22   44:aload_0         
    //   23   45:getfield        #153 <Field int mMaxHeight>
    //   24   48:aload           4
    //   25   50:invokevirtual   #318 <Method int Drawable.getIntrinsicHeight()>
    //   26   53:invokestatic    #474 <Method int Math.min(int, int)>
    //   27   56:invokestatic    #477 <Method int Math.max(int, int)>
    //   28   59:istore          5
    // try 61 109 handler(s) 112
    //   29   61:aload_0         
    //   30   62:invokespecial   #341 <Method void updateDrawableState()>
    //   31   65:iload           6
    //   32   67:aload_0         
    //   33   68:invokevirtual   #304 <Method int getPaddingLeft()>
    //   34   71:aload_0         
    //   35   72:invokevirtual   #301 <Method int getPaddingRight()>
    //   36   75:iadd            
    //   37   76:iadd            
    //   38   77:istore          7
    //   39   79:iload           5
    //   40   81:aload_0         
    //   41   82:invokevirtual   #310 <Method int getPaddingTop()>
    //   42   85:aload_0         
    //   43   86:invokevirtual   #307 <Method int getPaddingBottom()>
    //   44   89:iadd            
    //   45   90:iadd            
    //   46   91:istore          8
    //   47   93:aload_0         
    //   48   94:iload           7
    //   49   96:iload_1         
    //   50   97:invokestatic    #480 <Method int resolveSize(int, int)>
    //   51  100:iload           8
    //   52  102:iload_2         
    //   53  103:invokestatic    #480 <Method int resolveSize(int, int)>
    //   54  106:invokevirtual   #483 <Method void setMeasuredDimension(int, int)>
    //   55  109:aload_0         
    //   56  110:monitorexit     
    //   57  111:return          
    // finally
    //   58  112:astore_3        
    //   59  113:aload_0         
    //   60  114:monitorexit     
    //   61  115:aload_3         
    //   62  116:athrow          
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
    //    0    0:aload_1         
    //    1    1:checkcast       #487 <Class ProgressBarICS$SavedState>
    //    2    4:astore_2        
    //    3    5:aload_0         
    //    4    6:aload_2         
    //    5    7:invokevirtual   #491 <Method Parcelable ProgressBarICS$SavedState.getSuperState()>
    //    6   10:invokespecial   #493 <Method void View.onRestoreInstanceState(Parcelable)>
    //    7   13:aload_0         
    //    8   14:aload_2         
    //    9   15:getfield        #496 <Field int ProgressBarICS$SavedState.progress>
    //   10   18:invokevirtual   #106 <Method void setProgress(int)>
    //   11   21:aload_0         
    //   12   22:aload_2         
    //   13   23:getfield        #499 <Field int ProgressBarICS$SavedState.secondaryProgress>
    //   14   26:invokevirtual   #111 <Method void setSecondaryProgress(int)>
    //   15   29:return          
    }

    public Parcelable onSaveInstanceState()
    {
    //    0    0:new             #487 <Class ProgressBarICS$SavedState>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #502 <Method Parcelable View.onSaveInstanceState()>
    //    4    8:invokespecial   #504 <Method void ProgressBarICS$SavedState(Parcelable)>
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:aload_0         
    //    8   14:getfield        #103 <Field int mProgress>
    //    9   17:putfield        #496 <Field int ProgressBarICS$SavedState.progress>
    //   10   20:aload_1         
    //   11   21:aload_0         
    //   12   22:getfield        #108 <Field int mSecondaryProgress>
    //   13   25:putfield        #499 <Field int ProgressBarICS$SavedState.secondaryProgress>
    //   14   28:aload_1         
    //   15   29:areturn         
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:invokespecial   #507 <Method void updateDrawableBounds(int, int)>
    //    4    6:return          
    }

    protected void onVisibilityChanged(View view, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:invokespecial   #511 <Method void View.onVisibilityChanged(View, int)>
    //    4    6:aload_0         
    //    5    7:getfield        #113 <Field boolean mIndeterminate>
    //    6   10:ifeq            28
    //    7   13:iload_2         
    //    8   14:bipush          8
    //    9   16:icmpeq          24
    //   10   19:iload_2         
    //   11   20:iconst_4        
    //   12   21:icmpne          29
    //   13   24:aload_0         
    //   14   25:invokevirtual   #405 <Method void stopAnimation()>
    //   15   28:return          
    //   16   29:aload_0         
    //   17   30:invokevirtual   #401 <Method void startAnimation()>
    //   18   33:return          
    }

    public void postInvalidate()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #89  <Field boolean mNoInvalidate>
    //    2    4:ifne            11
    //    3    7:aload_0         
    //    4    8:invokespecial   #514 <Method void View.postInvalidate()>
    //    5   11:return          
    }

    public void setIndeterminate(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 16 handler(s) 63
    //    2    2:aload_0         
    //    3    3:getfield        #119 <Field boolean mOnlyIndeterminate>
    //    4    6:ifeq            16
    //    5    9:aload_0         
    //    6   10:getfield        #113 <Field boolean mIndeterminate>
    //    7   13:ifne            45
    // try 16 29 handler(s) 63
    //    8   16:iload_1         
    //    9   17:aload_0         
    //   10   18:getfield        #113 <Field boolean mIndeterminate>
    //   11   21:icmpeq          45
    //   12   24:aload_0         
    //   13   25:iload_1         
    //   14   26:putfield        #113 <Field boolean mIndeterminate>
    //   15   29:iload_1         
    //   16   30:ifeq            48
    // try 33 45 handler(s) 63
    //   17   33:aload_0         
    //   18   34:aload_0         
    //   19   35:getfield        #312 <Field Drawable mIndeterminateDrawable>
    //   20   38:putfield        #180 <Field Drawable mCurrentDrawable>
    //   21   41:aload_0         
    //   22   42:invokevirtual   #401 <Method void startAnimation()>
    //   23   45:aload_0         
    //   24   46:monitorexit     
    //   25   47:return          
    // try 48 60 handler(s) 63
    //   26   48:aload_0         
    //   27   49:aload_0         
    //   28   50:getfield        #324 <Field Drawable mProgressDrawable>
    //   29   53:putfield        #180 <Field Drawable mCurrentDrawable>
    //   30   56:aload_0         
    //   31   57:invokevirtual   #405 <Method void stopAnimation()>
    //   32   60:goto            45
    // finally
    //   33   63:astore_2        
    //   34   64:aload_0         
    //   35   65:monitorexit     
    //   36   66:aload_2         
    //   37   67:athrow          
    }

    public void setIndeterminateDrawable(Drawable drawable)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          9
    //    2    4:aload_1         
    //    3    5:aload_0         
    //    4    6:invokevirtual   #518 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
    //    5    9:aload_0         
    //    6   10:aload_1         
    //    7   11:putfield        #312 <Field Drawable mIndeterminateDrawable>
    //    8   14:aload_0         
    //    9   15:getfield        #113 <Field boolean mIndeterminate>
    //   10   18:ifeq            30
    //   11   21:aload_0         
    //   12   22:aload_1         
    //   13   23:putfield        #180 <Field Drawable mCurrentDrawable>
    //   14   26:aload_0         
    //   15   27:invokevirtual   #519 <Method void postInvalidate()>
    //   16   30:return          
    }

    public void setInterpolator(Context context, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:invokestatic    #525 <Method Interpolator AnimationUtils.loadInterpolator(Context, int)>
    //    4    6:invokevirtual   #528 <Method void setInterpolator(Interpolator)>
    //    5    9:return          
    }

    public void setInterpolator(Interpolator interpolator)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #353 <Field Interpolator mInterpolator>
    //    3    5:return          
    }

    public void setMax(int i)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    //    2    2:iload_1         
    //    3    3:ifge            8
    //    4    6:iconst_0        
    //    5    7:istore_1        
    // try 8 38 handler(s) 52
    //    6    8:iload_1         
    //    7    9:aload_0         
    //    8   10:getfield        #91  <Field int mMax>
    //    9   13:icmpeq          49
    //   10   16:aload_0         
    //   11   17:iload_1         
    //   12   18:putfield        #91  <Field int mMax>
    //   13   21:aload_0         
    //   14   22:invokevirtual   #519 <Method void postInvalidate()>
    //   15   25:aload_0         
    //   16   26:getfield        #103 <Field int mProgress>
    //   17   29:iload_1         
    //   18   30:icmple          38
    //   19   33:aload_0         
    //   20   34:iload_1         
    //   21   35:putfield        #103 <Field int mProgress>
    // try 38 49 handler(s) 52
    //   22   38:aload_0         
    //   23   39:ldc1            #218 <Int 0x102000d>
    //   24   41:aload_0         
    //   25   42:getfield        #103 <Field int mProgress>
    //   26   45:iconst_0        
    //   27   46:invokespecial   #530 <Method void refreshProgress(int, int, boolean)>
    //   28   49:aload_0         
    //   29   50:monitorexit     
    //   30   51:return          
    // finally
    //   31   52:astore_2        
    //   32   53:aload_0         
    //   33   54:monitorexit     
    //   34   55:aload_2         
    //   35   56:athrow          
    }

    public void setProgress(int i)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 8 handler(s) 11
    //    2    2:aload_0         
    //    3    3:iload_1         
    //    4    4:iconst_0        
    //    5    5:invokevirtual   #533 <Method void setProgress(int, boolean)>
    //    6    8:aload_0         
    //    7    9:monitorexit     
    //    8   10:return          
    // finally
    //    9   11:astore_2        
    //   10   12:aload_0         
    //   11   13:monitorexit     
    //   12   14:aload_2         
    //   13   15:athrow          
    }

    void setProgress(int i, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 8 handler(s) 62
    //    2    2:aload_0         
    //    3    3:getfield        #113 <Field boolean mIndeterminate>
    //    4    6:istore          4
    //    5    8:iload           4
    //    6   10:ifeq            16
    //    7   13:aload_0         
    //    8   14:monitorexit     
    //    9   15:return          
    //   10   16:iload_1         
    //   11   17:ifge            22
    //   12   20:iconst_0        
    //   13   21:istore_1        
    // try 22 35 handler(s) 62
    //   14   22:iload_1         
    //   15   23:aload_0         
    //   16   24:getfield        #91  <Field int mMax>
    //   17   27:icmple          35
    //   18   30:aload_0         
    //   19   31:getfield        #91  <Field int mMax>
    //   20   34:istore_1        
    // try 35 59 handler(s) 62
    //   21   35:iload_1         
    //   22   36:aload_0         
    //   23   37:getfield        #103 <Field int mProgress>
    //   24   40:icmpeq          13
    //   25   43:aload_0         
    //   26   44:iload_1         
    //   27   45:putfield        #103 <Field int mProgress>
    //   28   48:aload_0         
    //   29   49:ldc1            #218 <Int 0x102000d>
    //   30   51:aload_0         
    //   31   52:getfield        #103 <Field int mProgress>
    //   32   55:iload_2         
    //   33   56:invokespecial   #530 <Method void refreshProgress(int, int, boolean)>
    //   34   59:goto            13
    // finally
    //   35   62:astore_3        
    //   36   63:aload_0         
    //   37   64:monitorexit     
    //   38   65:aload_3         
    //   39   66:athrow          
    }

    public void setProgressDrawable(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #324 <Field Drawable mProgressDrawable>
    //    2    4:ifnull          122
    //    3    7:aload_1         
    //    4    8:aload_0         
    //    5    9:getfield        #324 <Field Drawable mProgressDrawable>
    //    6   12:if_acmpeq       122
    //    7   15:aload_0         
    //    8   16:getfield        #324 <Field Drawable mProgressDrawable>
    //    9   19:aconst_null     
    //   10   20:invokevirtual   #518 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
    //   11   23:iconst_1        
    //   12   24:istore_2        
    //   13   25:aload_1         
    //   14   26:ifnull          56
    //   15   29:aload_1         
    //   16   30:aload_0         
    //   17   31:invokevirtual   #518 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
    //   18   34:aload_1         
    //   19   35:invokevirtual   #536 <Method int Drawable.getMinimumHeight()>
    //   20   38:istore_3        
    //   21   39:aload_0         
    //   22   40:getfield        #153 <Field int mMaxHeight>
    //   23   43:iload_3         
    //   24   44:icmpge          56
    //   25   47:aload_0         
    //   26   48:iload_3         
    //   27   49:putfield        #153 <Field int mMaxHeight>
    //   28   52:aload_0         
    //   29   53:invokevirtual   #539 <Method void requestLayout()>
    //   30   56:aload_0         
    //   31   57:aload_1         
    //   32   58:putfield        #324 <Field Drawable mProgressDrawable>
    //   33   61:aload_0         
    //   34   62:getfield        #113 <Field boolean mIndeterminate>
    //   35   65:ifne            77
    //   36   68:aload_0         
    //   37   69:aload_1         
    //   38   70:putfield        #180 <Field Drawable mCurrentDrawable>
    //   39   73:aload_0         
    //   40   74:invokevirtual   #519 <Method void postInvalidate()>
    //   41   77:iload_2         
    //   42   78:ifeq            121
    //   43   81:aload_0         
    //   44   82:aload_0         
    //   45   83:invokevirtual   #542 <Method int getWidth()>
    //   46   86:aload_0         
    //   47   87:invokevirtual   #545 <Method int getHeight()>
    //   48   90:invokespecial   #507 <Method void updateDrawableBounds(int, int)>
    //   49   93:aload_0         
    //   50   94:invokespecial   #341 <Method void updateDrawableState()>
    //   51   97:aload_0         
    //   52   98:ldc1            #218 <Int 0x102000d>
    //   53  100:aload_0         
    //   54  101:getfield        #103 <Field int mProgress>
    //   55  104:iconst_0        
    //   56  105:iconst_0        
    //   57  106:invokespecial   #174 <Method void doRefreshProgress(int, int, boolean, boolean)>
    //   58  109:aload_0         
    //   59  110:ldc1            #219 <Int 0x102000f>
    //   60  112:aload_0         
    //   61  113:getfield        #108 <Field int mSecondaryProgress>
    //   62  116:iconst_0        
    //   63  117:iconst_0        
    //   64  118:invokespecial   #174 <Method void doRefreshProgress(int, int, boolean, boolean)>
    //   65  121:return          
    //   66  122:iconst_0        
    //   67  123:istore_2        
    //   68  124:goto            25
    }

    public void setSecondaryProgress(int i)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 7 handler(s) 60
    //    2    2:aload_0         
    //    3    3:getfield        #113 <Field boolean mIndeterminate>
    //    4    6:istore_3        
    //    5    7:iload_3         
    //    6    8:ifeq            14
    //    7   11:aload_0         
    //    8   12:monitorexit     
    //    9   13:return          
    //   10   14:iload_1         
    //   11   15:ifge            20
    //   12   18:iconst_0        
    //   13   19:istore_1        
    // try 20 33 handler(s) 60
    //   14   20:iload_1         
    //   15   21:aload_0         
    //   16   22:getfield        #91  <Field int mMax>
    //   17   25:icmple          33
    //   18   28:aload_0         
    //   19   29:getfield        #91  <Field int mMax>
    //   20   32:istore_1        
    // try 33 57 handler(s) 60
    //   21   33:iload_1         
    //   22   34:aload_0         
    //   23   35:getfield        #108 <Field int mSecondaryProgress>
    //   24   38:icmpeq          11
    //   25   41:aload_0         
    //   26   42:iload_1         
    //   27   43:putfield        #108 <Field int mSecondaryProgress>
    //   28   46:aload_0         
    //   29   47:ldc1            #219 <Int 0x102000f>
    //   30   49:aload_0         
    //   31   50:getfield        #108 <Field int mSecondaryProgress>
    //   32   53:iconst_0        
    //   33   54:invokespecial   #530 <Method void refreshProgress(int, int, boolean)>
    //   34   57:goto            11
    // finally
    //   35   60:astore_2        
    //   36   61:aload_0         
    //   37   62:monitorexit     
    //   38   63:aload_2         
    //   39   64:athrow          
    }

    public void setVisibility(int i)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #549 <Method int getVisibility()>
    //    2    4:iload_1         
    //    3    5:icmpeq          35
    //    4    8:aload_0         
    //    5    9:iload_1         
    //    6   10:invokespecial   #551 <Method void View.setVisibility(int)>
    //    7   13:aload_0         
    //    8   14:getfield        #113 <Field boolean mIndeterminate>
    //    9   17:ifeq            35
    //   10   20:iload_1         
    //   11   21:bipush          8
    //   12   23:icmpeq          31
    //   13   26:iload_1         
    //   14   27:iconst_4        
    //   15   28:icmpne          36
    //   16   31:aload_0         
    //   17   32:invokevirtual   #405 <Method void stopAnimation()>
    //   18   35:return          
    //   19   36:aload_0         
    //   20   37:invokevirtual   #401 <Method void startAnimation()>
    //   21   40:return          
    }

    void startAnimation()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #549 <Method int getVisibility()>
    //    2    4:ifeq            8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #312 <Field Drawable mIndeterminateDrawable>
    //    6   12:instanceof      #465 <Class Animatable>
    //    7   15:ifeq            33
    //    8   18:aload_0         
    //    9   19:iconst_1        
    //   10   20:putfield        #463 <Field boolean mShouldStartAnimationDrawable>
    //   11   23:aload_0         
    //   12   24:aconst_null     
    //   13   25:putfield        #428 <Field AlphaAnimation mAnimation>
    //   14   28:aload_0         
    //   15   29:invokevirtual   #519 <Method void postInvalidate()>
    //   16   32:return          
    //   17   33:aload_0         
    //   18   34:getfield        #353 <Field Interpolator mInterpolator>
    //   19   37:ifnonnull       51
    //   20   40:aload_0         
    //   21   41:new             #553 <Class LinearInterpolator>
    //   22   44:dup             
    //   23   45:invokespecial   #554 <Method void LinearInterpolator()>
    //   24   48:putfield        #353 <Field Interpolator mInterpolator>
    //   25   51:aload_0         
    //   26   52:new             #438 <Class Transformation>
    //   27   55:dup             
    //   28   56:invokespecial   #555 <Method void Transformation()>
    //   29   59:putfield        #430 <Field Transformation mTransformation>
    //   30   62:aload_0         
    //   31   63:new             #432 <Class AlphaAnimation>
    //   32   66:dup             
    //   33   67:fconst_0        
    //   34   68:fconst_1        
    //   35   69:invokespecial   #557 <Method void AlphaAnimation(float, float)>
    //   36   72:putfield        #428 <Field AlphaAnimation mAnimation>
    //   37   75:aload_0         
    //   38   76:getfield        #428 <Field AlphaAnimation mAnimation>
    //   39   79:aload_0         
    //   40   80:getfield        #142 <Field int mBehavior>
    //   41   83:invokevirtual   #560 <Method void AlphaAnimation.setRepeatMode(int)>
    //   42   86:aload_0         
    //   43   87:getfield        #428 <Field AlphaAnimation mAnimation>
    //   44   90:iconst_m1       
    //   45   91:invokevirtual   #563 <Method void AlphaAnimation.setRepeatCount(int)>
    //   46   94:aload_0         
    //   47   95:getfield        #428 <Field AlphaAnimation mAnimation>
    //   48   98:aload_0         
    //   49   99:getfield        #140 <Field int mDuration>
    //   50  102:i2l             
    //   51  103:invokevirtual   #566 <Method void AlphaAnimation.setDuration(long)>
    //   52  106:aload_0         
    //   53  107:getfield        #428 <Field AlphaAnimation mAnimation>
    //   54  110:aload_0         
    //   55  111:getfield        #353 <Field Interpolator mInterpolator>
    //   56  114:invokevirtual   #567 <Method void AlphaAnimation.setInterpolator(Interpolator)>
    //   57  117:aload_0         
    //   58  118:getfield        #428 <Field AlphaAnimation mAnimation>
    //   59  121:ldc2w           #568 <Long -1L>
    //   60  124:invokevirtual   #572 <Method void AlphaAnimation.setStartTime(long)>
    //   61  127:goto            28
    }

    void stopAnimation()
    {
    //    0    0:aload_0         
    //    1    1:aconst_null     
    //    2    2:putfield        #428 <Field AlphaAnimation mAnimation>
    //    3    5:aload_0         
    //    4    6:aconst_null     
    //    5    7:putfield        #430 <Field Transformation mTransformation>
    //    6   10:aload_0         
    //    7   11:getfield        #312 <Field Drawable mIndeterminateDrawable>
    //    8   14:instanceof      #465 <Class Animatable>
    //    9   17:ifeq            37
    //   10   20:aload_0         
    //   11   21:getfield        #312 <Field Drawable mIndeterminateDrawable>
    //   12   24:checkcast       #465 <Class Animatable>
    //   13   27:invokeinterface #575 <Method void Animatable.stop()>
    //   14   32:aload_0         
    //   15   33:iconst_0        
    //   16   34:putfield        #463 <Field boolean mShouldStartAnimationDrawable>
    //   17   37:aload_0         
    //   18   38:invokevirtual   #519 <Method void postInvalidate()>
    //   19   41:return          
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #324 <Field Drawable mProgressDrawable>
    //    3    5:if_acmpeq       24
    //    4    8:aload_1         
    //    5    9:aload_0         
    //    6   10:getfield        #312 <Field Drawable mIndeterminateDrawable>
    //    7   13:if_acmpeq       24
    //    8   16:aload_0         
    //    9   17:aload_1         
    //   10   18:invokespecial   #576 <Method boolean View.verifyDrawable(Drawable)>
    //   11   21:ifeq            26
    //   12   24:iconst_1        
    //   13   25:ireturn         
    //   14   26:iconst_0        
    //   15   27:ireturn         
    }

    private static final int ANIMATION_RESOLUTION = 200;
    private static final int MAX_LEVEL = 10000;
    private static final int android_R_styleable_ProgressBar[];
    private AlphaAnimation mAnimation;
    private int mBehavior;
    private Drawable mCurrentDrawable;
    private int mDuration;
    private boolean mInDrawing;
    private boolean mIndeterminate;
    private Drawable mIndeterminateDrawable;
    private Interpolator mInterpolator;
    private long mLastDrawTime;
    private int mMax;
    int mMaxHeight;
    int mMaxWidth;
    int mMinHeight;
    int mMinWidth;
    private boolean mNoInvalidate;
    private boolean mOnlyIndeterminate;
    private int mProgress;
    private Drawable mProgressDrawable;
    private RefreshProgressRunnable mRefreshProgressRunnable;
    Bitmap mSampleTile;
    private int mSecondaryProgress;
    private boolean mShouldStartAnimationDrawable;
    private Transformation mTransformation;
    private long mUiThreadId;

    static void access$000(ProgressBarICS progressbarics, int i, int j, boolean flag, boolean flag1)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:iload_3         
    //    4    4:iload           4
    //    5    6:invokespecial   #174 <Method void doRefreshProgress(int, int, boolean, boolean)>
    //    6    9:return          
    }

    static RefreshProgressRunnable access$102(ProgressBarICS progressbarics, RefreshProgressRunnable refreshprogressrunnable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #178 <Field ProgressBarICS$RefreshProgressRunnable mRefreshProgressRunnable>
    //    3    5:aload_1         
    //    4    6:areturn         
    }

    // Unreferenced inner class android/support/v7/internal/widget/ProgressBarICS$1

/* anonymous class */
    static class _cls1
    {
    }


    // Unreferenced inner class android/support/v7/internal/widget/ProgressBarICS$SavedState$1

/* anonymous class */
    static final class SavedState._cls1
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
        //    0    0:new             #9   <Class ProgressBarICS$SavedState>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:aconst_null     
        //    4    6:invokespecial   #18  <Method void ProgressBarICS$SavedState(Parcel, ProgressBarICS$1)>
        //    5    9:areturn         
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #21  <Method ProgressBarICS$SavedState createFromParcel(Parcel)>
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
        //    2    2:invokevirtual   #26  <Method ProgressBarICS$SavedState[] newArray(int)>
        //    3    5:areturn         
        }
    }

}
