// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.*;
import android.util.DisplayMetrics;
import android.view.*;
import android.view.animation.Interpolator;
import java.util.Arrays;

// Referenced classes of package android.support.v4.widget:
//            ScrollerCompat

public class ViewDragHelper
{
    public static abstract class Callback
    {

        public Callback()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void Object()>
        //    2    4:return          
        }

        public int clampViewPositionHorizontal(View view, int i, int j)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public int clampViewPositionVertical(View view, int i, int j)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public int getOrderedChildIndex(int i)
        {
        //    0    0:iload_1         
        //    1    1:ireturn         
        }

        public int getViewHorizontalDragRange(View view)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public int getViewVerticalDragRange(View view)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public void onEdgeDragStarted(int i, int j)
        {
        //    0    0:return          
        }

        public boolean onEdgeLock(int i)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public void onEdgeTouched(int i, int j)
        {
        //    0    0:return          
        }

        public void onViewCaptured(View view, int i)
        {
        //    0    0:return          
        }

        public void onViewDragStateChanged(int i)
        {
        //    0    0:return          
        }

        public void onViewPositionChanged(View view, int i, int j, int k, int l)
        {
        //    0    0:return          
        }

        public void onViewReleased(View view, float f, float f1)
        {
        //    0    0:return          
        }

        public abstract boolean tryCaptureView(View view, int i);
    }


    static 
    {
    //    0    0:new             #73  <Class ViewDragHelper$1>
    //    1    3:dup             
    //    2    4:invokespecial   #76  <Method void ViewDragHelper$1()>
    //    3    7:putstatic       #78  <Field Interpolator sInterpolator>
    //    4   10:return          
    }

    private ViewDragHelper(Context context, ViewGroup viewgroup, Callback callback)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #80  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:iconst_m1       
    //    4    6:putfield        #82  <Field int mActivePointerId>
    //    5    9:aload_0         
    //    6   10:new             #84  <Class ViewDragHelper$2>
    //    7   13:dup             
    //    8   14:aload_0         
    //    9   15:invokespecial   #87  <Method void ViewDragHelper$2(ViewDragHelper)>
    //   10   18:putfield        #89  <Field Runnable mSetIdleRunnable>
    //   11   21:aload_2         
    //   12   22:ifnonnull       35
    //   13   25:new             #91  <Class IllegalArgumentException>
    //   14   28:dup             
    //   15   29:ldc1            #93  <String "Parent view may not be null">
    //   16   31:invokespecial   #96  <Method void IllegalArgumentException(String)>
    //   17   34:athrow          
    //   18   35:aload_3         
    //   19   36:ifnonnull       49
    //   20   39:new             #91  <Class IllegalArgumentException>
    //   21   42:dup             
    //   22   43:ldc1            #98  <String "Callback may not be null">
    //   23   45:invokespecial   #96  <Method void IllegalArgumentException(String)>
    //   24   48:athrow          
    //   25   49:aload_0         
    //   26   50:aload_2         
    //   27   51:putfield        #100 <Field ViewGroup mParentView>
    //   28   54:aload_0         
    //   29   55:aload_3         
    //   30   56:putfield        #102 <Field ViewDragHelper$Callback mCallback>
    //   31   59:aload_1         
    //   32   60:invokestatic    #108 <Method ViewConfiguration ViewConfiguration.get(Context)>
    //   33   63:astore          4
    //   34   65:aload_0         
    //   35   66:ldc1            #109 <Float 0.5F>
    //   36   68:ldc1            #110 <Float 20F>
    //   37   70:aload_1         
    //   38   71:invokevirtual   #116 <Method Resources Context.getResources()>
    //   39   74:invokevirtual   #122 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   40   77:getfield        #127 <Field float DisplayMetrics.density>
    //   41   80:fmul            
    //   42   81:fadd            
    //   43   82:f2i             
    //   44   83:putfield        #129 <Field int mEdgeSize>
    //   45   86:aload_0         
    //   46   87:aload           4
    //   47   89:invokevirtual   #133 <Method int ViewConfiguration.getScaledTouchSlop()>
    //   48   92:putfield        #135 <Field int mTouchSlop>
    //   49   95:aload_0         
    //   50   96:aload           4
    //   51   98:invokevirtual   #138 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
    //   52  101:i2f             
    //   53  102:putfield        #140 <Field float mMaxVelocity>
    //   54  105:aload_0         
    //   55  106:aload           4
    //   56  108:invokevirtual   #143 <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
    //   57  111:i2f             
    //   58  112:putfield        #145 <Field float mMinVelocity>
    //   59  115:aload_0         
    //   60  116:aload_1         
    //   61  117:getstatic       #78  <Field Interpolator sInterpolator>
    //   62  120:invokestatic    #151 <Method ScrollerCompat ScrollerCompat.create(Context, Interpolator)>
    //   63  123:putfield        #153 <Field ScrollerCompat mScroller>
    //   64  126:return          
    }

    private boolean checkNewEdgeDrag(float f, float f1, int i, int j)
    {
    //    0    0:fload_1         
    //    1    1:invokestatic    #161 <Method float Math.abs(float)>
    //    2    4:fstore          5
    //    3    6:fload_2         
    //    4    7:invokestatic    #161 <Method float Math.abs(float)>
    //    5   10:fstore          6
    //    6   12:iload           4
    //    7   14:aload_0         
    //    8   15:getfield        #163 <Field int[] mInitialEdgesTouched>
    //    9   18:iload_3         
    //   10   19:iaload          
    //   11   20:iand            
    //   12   21:iload           4
    //   13   23:icmpne          86
    //   14   26:iload           4
    //   15   28:aload_0         
    //   16   29:getfield        #165 <Field int mTrackingEdges>
    //   17   32:iand            
    //   18   33:ifeq            86
    //   19   36:iload           4
    //   20   38:aload_0         
    //   21   39:getfield        #167 <Field int[] mEdgeDragsLocked>
    //   22   42:iload_3         
    //   23   43:iaload          
    //   24   44:iand            
    //   25   45:iload           4
    //   26   47:icmpeq          86
    //   27   50:iload           4
    //   28   52:aload_0         
    //   29   53:getfield        #169 <Field int[] mEdgeDragsInProgress>
    //   30   56:iload_3         
    //   31   57:iaload          
    //   32   58:iand            
    //   33   59:iload           4
    //   34   61:icmpeq          86
    //   35   64:fload           5
    //   36   66:aload_0         
    //   37   67:getfield        #135 <Field int mTouchSlop>
    //   38   70:i2f             
    //   39   71:fcmpg           
    //   40   72:ifgt            88
    //   41   75:fload           6
    //   42   77:aload_0         
    //   43   78:getfield        #135 <Field int mTouchSlop>
    //   44   81:i2f             
    //   45   82:fcmpg           
    //   46   83:ifgt            88
    //   47   86:iconst_0        
    //   48   87:ireturn         
    //   49   88:fload           5
    //   50   90:ldc1            #109 <Float 0.5F>
    //   51   92:fload           6
    //   52   94:fmul            
    //   53   95:fcmpg           
    //   54   96:ifge            130
    //   55   99:aload_0         
    //   56  100:getfield        #102 <Field ViewDragHelper$Callback mCallback>
    //   57  103:iload           4
    //   58  105:invokevirtual   #175 <Method boolean ViewDragHelper$Callback.onEdgeLock(int)>
    //   59  108:ifeq            130
    //   60  111:aload_0         
    //   61  112:getfield        #167 <Field int[] mEdgeDragsLocked>
    //   62  115:astore          7
    //   63  117:aload           7
    //   64  119:iload_3         
    //   65  120:iload           4
    //   66  122:aload           7
    //   67  124:iload_3         
    //   68  125:iaload          
    //   69  126:ior             
    //   70  127:iastore         
    //   71  128:iconst_0        
    //   72  129:ireturn         
    //   73  130:iload           4
    //   74  132:aload_0         
    //   75  133:getfield        #169 <Field int[] mEdgeDragsInProgress>
    //   76  136:iload_3         
    //   77  137:iaload          
    //   78  138:iand            
    //   79  139:ifne            86
    //   80  142:fload           5
    //   81  144:aload_0         
    //   82  145:getfield        #135 <Field int mTouchSlop>
    //   83  148:i2f             
    //   84  149:fcmpl           
    //   85  150:ifle            86
    //   86  153:iconst_1        
    //   87  154:ireturn         
    }

    private boolean checkTouchSlop(View view, float f, float f1)
    {
    //    0    0:iconst_1        
    //    1    1:istore          4
    //    2    3:aload_1         
    //    3    4:ifnonnull       13
    //    4    7:iconst_0        
    //    5    8:istore          4
    //    6   10:iload           4
    //    7   12:ireturn         
    //    8   13:aload_0         
    //    9   14:getfield        #102 <Field ViewDragHelper$Callback mCallback>
    //   10   17:aload_1         
    //   11   18:invokevirtual   #181 <Method int ViewDragHelper$Callback.getViewHorizontalDragRange(View)>
    //   12   21:ifle            76
    //   13   24:iload           4
    //   14   26:istore          5
    //   15   28:aload_0         
    //   16   29:getfield        #102 <Field ViewDragHelper$Callback mCallback>
    //   17   32:aload_1         
    //   18   33:invokevirtual   #184 <Method int ViewDragHelper$Callback.getViewVerticalDragRange(View)>
    //   19   36:ifle            82
    //   20   39:iload           4
    //   21   41:istore          6
    //   22   43:iload           5
    //   23   45:ifeq            88
    //   24   48:iload           6
    //   25   50:ifeq            88
    //   26   53:fload_2         
    //   27   54:fload_2         
    //   28   55:fmul            
    //   29   56:fload_3         
    //   30   57:fload_3         
    //   31   58:fmul            
    //   32   59:fadd            
    //   33   60:aload_0         
    //   34   61:getfield        #135 <Field int mTouchSlop>
    //   35   64:aload_0         
    //   36   65:getfield        #135 <Field int mTouchSlop>
    //   37   68:imul            
    //   38   69:i2f             
    //   39   70:fcmpl           
    //   40   71:ifgt            10
    //   41   74:iconst_0        
    //   42   75:ireturn         
    //   43   76:iconst_0        
    //   44   77:istore          5
    //   45   79:goto            28
    //   46   82:iconst_0        
    //   47   83:istore          6
    //   48   85:goto            43
    //   49   88:iload           5
    //   50   90:ifeq            108
    //   51   93:fload_2         
    //   52   94:invokestatic    #161 <Method float Math.abs(float)>
    //   53   97:aload_0         
    //   54   98:getfield        #135 <Field int mTouchSlop>
    //   55  101:i2f             
    //   56  102:fcmpl           
    //   57  103:ifgt            10
    //   58  106:iconst_0        
    //   59  107:ireturn         
    //   60  108:iload           6
    //   61  110:ifeq            128
    //   62  113:fload_3         
    //   63  114:invokestatic    #161 <Method float Math.abs(float)>
    //   64  117:aload_0         
    //   65  118:getfield        #135 <Field int mTouchSlop>
    //   66  121:i2f             
    //   67  122:fcmpl           
    //   68  123:ifgt            10
    //   69  126:iconst_0        
    //   70  127:ireturn         
    //   71  128:iconst_0        
    //   72  129:ireturn         
    }

    private float clampMag(float f, float f1, float f2)
    {
    //    0    0:fload_1         
    //    1    1:invokestatic    #161 <Method float Math.abs(float)>
    //    2    4:fstore          4
    //    3    6:fload           4
    //    4    8:fload_2         
    //    5    9:fcmpg           
    //    6   10:ifge            17
    //    7   13:fconst_0        
    //    8   14:fstore_3        
    //    9   15:fload_3         
    //   10   16:freturn         
    //   11   17:fload           4
    //   12   19:fload_3         
    //   13   20:fcmpl           
    //   14   21:ifle            33
    //   15   24:fload_1         
    //   16   25:fconst_0        
    //   17   26:fcmpl           
    //   18   27:ifgt            15
    //   19   30:fload_3         
    //   20   31:fneg            
    //   21   32:freturn         
    //   22   33:fload_1         
    //   23   34:freturn         
    }

    private int clampMag(int i, int j, int k)
    {
    //    0    0:iload_1         
    //    1    1:invokestatic    #190 <Method int Math.abs(int)>
    //    2    4:istore          4
    //    3    6:iload           4
    //    4    8:iload_2         
    //    5    9:icmpge          16
    //    6   12:iconst_0        
    //    7   13:istore_3        
    //    8   14:iload_3         
    //    9   15:ireturn         
    //   10   16:iload           4
    //   11   18:iload_3         
    //   12   19:icmple          29
    //   13   22:iload_1         
    //   14   23:ifgt            14
    //   15   26:iload_3         
    //   16   27:ineg            
    //   17   28:ireturn         
    //   18   29:iload_1         
    //   19   30:ireturn         
    }

    private void clearMotionHistory()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #193 <Field float[] mInitialMotionX>
    //    2    4:ifnonnull       8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #193 <Field float[] mInitialMotionX>
    //    6   12:fconst_0        
    //    7   13:invokestatic    #199 <Method void Arrays.fill(float[], float)>
    //    8   16:aload_0         
    //    9   17:getfield        #201 <Field float[] mInitialMotionY>
    //   10   20:fconst_0        
    //   11   21:invokestatic    #199 <Method void Arrays.fill(float[], float)>
    //   12   24:aload_0         
    //   13   25:getfield        #203 <Field float[] mLastMotionX>
    //   14   28:fconst_0        
    //   15   29:invokestatic    #199 <Method void Arrays.fill(float[], float)>
    //   16   32:aload_0         
    //   17   33:getfield        #205 <Field float[] mLastMotionY>
    //   18   36:fconst_0        
    //   19   37:invokestatic    #199 <Method void Arrays.fill(float[], float)>
    //   20   40:aload_0         
    //   21   41:getfield        #163 <Field int[] mInitialEdgesTouched>
    //   22   44:iconst_0        
    //   23   45:invokestatic    #208 <Method void Arrays.fill(int[], int)>
    //   24   48:aload_0         
    //   25   49:getfield        #169 <Field int[] mEdgeDragsInProgress>
    //   26   52:iconst_0        
    //   27   53:invokestatic    #208 <Method void Arrays.fill(int[], int)>
    //   28   56:aload_0         
    //   29   57:getfield        #167 <Field int[] mEdgeDragsLocked>
    //   30   60:iconst_0        
    //   31   61:invokestatic    #208 <Method void Arrays.fill(int[], int)>
    //   32   64:aload_0         
    //   33   65:iconst_0        
    //   34   66:putfield        #210 <Field int mPointersDown>
    //   35   69:return          
    }

    private void clearMotionHistory(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #193 <Field float[] mInitialMotionX>
    //    2    4:ifnonnull       8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #193 <Field float[] mInitialMotionX>
    //    6   12:iload_1         
    //    7   13:fconst_0        
    //    8   14:fastore         
    //    9   15:aload_0         
    //   10   16:getfield        #201 <Field float[] mInitialMotionY>
    //   11   19:iload_1         
    //   12   20:fconst_0        
    //   13   21:fastore         
    //   14   22:aload_0         
    //   15   23:getfield        #203 <Field float[] mLastMotionX>
    //   16   26:iload_1         
    //   17   27:fconst_0        
    //   18   28:fastore         
    //   19   29:aload_0         
    //   20   30:getfield        #205 <Field float[] mLastMotionY>
    //   21   33:iload_1         
    //   22   34:fconst_0        
    //   23   35:fastore         
    //   24   36:aload_0         
    //   25   37:getfield        #163 <Field int[] mInitialEdgesTouched>
    //   26   40:iload_1         
    //   27   41:iconst_0        
    //   28   42:iastore         
    //   29   43:aload_0         
    //   30   44:getfield        #169 <Field int[] mEdgeDragsInProgress>
    //   31   47:iload_1         
    //   32   48:iconst_0        
    //   33   49:iastore         
    //   34   50:aload_0         
    //   35   51:getfield        #167 <Field int[] mEdgeDragsLocked>
    //   36   54:iload_1         
    //   37   55:iconst_0        
    //   38   56:iastore         
    //   39   57:aload_0         
    //   40   58:aload_0         
    //   41   59:getfield        #210 <Field int mPointersDown>
    //   42   62:iconst_m1       
    //   43   63:iconst_1        
    //   44   64:iload_1         
    //   45   65:ishl            
    //   46   66:ixor            
    //   47   67:iand            
    //   48   68:putfield        #210 <Field int mPointersDown>
    //   49   71:return          
    }

    private int computeAxisDuration(int i, int j, int k)
    {
    //    0    0:iload_1         
    //    1    1:ifne            6
    //    2    4:iconst_0        
    //    3    5:ireturn         
    //    4    6:aload_0         
    //    5    7:getfield        #100 <Field ViewGroup mParentView>
    //    6   10:invokevirtual   #217 <Method int ViewGroup.getWidth()>
    //    7   13:istore          4
    //    8   15:iload           4
    //    9   17:iconst_2        
    //   10   18:idiv            
    //   11   19:istore          5
    //   12   21:fconst_1        
    //   13   22:iload_1         
    //   14   23:invokestatic    #190 <Method int Math.abs(int)>
    //   15   26:i2f             
    //   16   27:iload           4
    //   17   29:i2f             
    //   18   30:fdiv            
    //   19   31:invokestatic    #221 <Method float Math.min(float, float)>
    //   20   34:fstore          6
    //   21   36:iload           5
    //   22   38:i2f             
    //   23   39:iload           5
    //   24   41:i2f             
    //   25   42:aload_0         
    //   26   43:fload           6
    //   27   45:invokespecial   #224 <Method float distanceInfluenceForSnapDuration(float)>
    //   28   48:fmul            
    //   29   49:fadd            
    //   30   50:fstore          7
    //   31   52:iload_2         
    //   32   53:invokestatic    #190 <Method int Math.abs(int)>
    //   33   56:istore          8
    //   34   58:iload           8
    //   35   60:ifle            91
    //   36   63:iconst_4        
    //   37   64:ldc1            #225 <Float 1000F>
    //   38   66:fload           7
    //   39   68:iload           8
    //   40   70:i2f             
    //   41   71:fdiv            
    //   42   72:invokestatic    #161 <Method float Math.abs(float)>
    //   43   75:fmul            
    //   44   76:invokestatic    #229 <Method int Math.round(float)>
    //   45   79:imul            
    //   46   80:istore          9
    //   47   82:iload           9
    //   48   84:sipush          600
    //   49   87:invokestatic    #232 <Method int Math.min(int, int)>
    //   50   90:ireturn         
    //   51   91:ldc1            #233 <Float 256F>
    //   52   93:fconst_1        
    //   53   94:iload_1         
    //   54   95:invokestatic    #190 <Method int Math.abs(int)>
    //   55   98:i2f             
    //   56   99:iload_3         
    //   57  100:i2f             
    //   58  101:fdiv            
    //   59  102:fadd            
    //   60  103:fmul            
    //   61  104:f2i             
    //   62  105:istore          9
    //   63  107:goto            82
    }

    private int computeSettleDuration(View view, int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:iload           4
    //    2    3:aload_0         
    //    3    4:getfield        #145 <Field float mMinVelocity>
    //    4    7:f2i             
    //    5    8:aload_0         
    //    6    9:getfield        #140 <Field float mMaxVelocity>
    //    7   12:f2i             
    //    8   13:invokespecial   #237 <Method int clampMag(int, int, int)>
    //    9   16:istore          6
    //   10   18:aload_0         
    //   11   19:iload           5
    //   12   21:aload_0         
    //   13   22:getfield        #145 <Field float mMinVelocity>
    //   14   25:f2i             
    //   15   26:aload_0         
    //   16   27:getfield        #140 <Field float mMaxVelocity>
    //   17   30:f2i             
    //   18   31:invokespecial   #237 <Method int clampMag(int, int, int)>
    //   19   34:istore          7
    //   20   36:iload_2         
    //   21   37:invokestatic    #190 <Method int Math.abs(int)>
    //   22   40:istore          8
    //   23   42:iload_3         
    //   24   43:invokestatic    #190 <Method int Math.abs(int)>
    //   25   46:istore          9
    //   26   48:iload           6
    //   27   50:invokestatic    #190 <Method int Math.abs(int)>
    //   28   53:istore          10
    //   29   55:iload           7
    //   30   57:invokestatic    #190 <Method int Math.abs(int)>
    //   31   60:istore          11
    //   32   62:iload           10
    //   33   64:iload           11
    //   34   66:iadd            
    //   35   67:istore          12
    //   36   69:iload           8
    //   37   71:iload           9
    //   38   73:iadd            
    //   39   74:istore          13
    //   40   76:iload           6
    //   41   78:ifeq            153
    //   42   81:iload           10
    //   43   83:i2f             
    //   44   84:iload           12
    //   45   86:i2f             
    //   46   87:fdiv            
    //   47   88:fstore          14
    //   48   90:iload           7
    //   49   92:ifeq            165
    //   50   95:iload           11
    //   51   97:i2f             
    //   52   98:iload           12
    //   53  100:i2f             
    //   54  101:fdiv            
    //   55  102:fstore          15
    //   56  104:aload_0         
    //   57  105:iload_2         
    //   58  106:iload           6
    //   59  108:aload_0         
    //   60  109:getfield        #102 <Field ViewDragHelper$Callback mCallback>
    //   61  112:aload_1         
    //   62  113:invokevirtual   #181 <Method int ViewDragHelper$Callback.getViewHorizontalDragRange(View)>
    //   63  116:invokespecial   #239 <Method int computeAxisDuration(int, int, int)>
    //   64  119:istore          16
    //   65  121:aload_0         
    //   66  122:iload_3         
    //   67  123:iload           7
    //   68  125:aload_0         
    //   69  126:getfield        #102 <Field ViewDragHelper$Callback mCallback>
    //   70  129:aload_1         
    //   71  130:invokevirtual   #184 <Method int ViewDragHelper$Callback.getViewVerticalDragRange(View)>
    //   72  133:invokespecial   #239 <Method int computeAxisDuration(int, int, int)>
    //   73  136:istore          17
    //   74  138:fload           14
    //   75  140:iload           16
    //   76  142:i2f             
    //   77  143:fmul            
    //   78  144:fload           15
    //   79  146:iload           17
    //   80  148:i2f             
    //   81  149:fmul            
    //   82  150:fadd            
    //   83  151:f2i             
    //   84  152:ireturn         
    //   85  153:iload           8
    //   86  155:i2f             
    //   87  156:iload           13
    //   88  158:i2f             
    //   89  159:fdiv            
    //   90  160:fstore          14
    //   91  162:goto            90
    //   92  165:iload           9
    //   93  167:i2f             
    //   94  168:iload           13
    //   95  170:i2f             
    //   96  171:fdiv            
    //   97  172:fstore          15
    //   98  174:goto            104
    }

    public static ViewDragHelper create(ViewGroup viewgroup, float f, Callback callback)
    {
    //    0    0:aload_0         
    //    1    1:aload_2         
    //    2    2:invokestatic    #243 <Method ViewDragHelper create(ViewGroup, ViewDragHelper$Callback)>
    //    3    5:astore_3        
    //    4    6:aload_3         
    //    5    7:aload_3         
    //    6    8:getfield        #135 <Field int mTouchSlop>
    //    7   11:i2f             
    //    8   12:fconst_1        
    //    9   13:fload_1         
    //   10   14:fdiv            
    //   11   15:fmul            
    //   12   16:f2i             
    //   13   17:putfield        #135 <Field int mTouchSlop>
    //   14   20:aload_3         
    //   15   21:areturn         
    }

    public static ViewDragHelper create(ViewGroup viewgroup, Callback callback)
    {
    //    0    0:new             #2   <Class ViewDragHelper>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokevirtual   #247 <Method Context ViewGroup.getContext()>
    //    4    8:aload_0         
    //    5    9:aload_1         
    //    6   10:invokespecial   #249 <Method void ViewDragHelper(Context, ViewGroup, ViewDragHelper$Callback)>
    //    7   13:areturn         
    }

    private void dispatchViewReleased(float f, float f1)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #253 <Field boolean mReleaseInProgress>
    //    3    5:aload_0         
    //    4    6:getfield        #102 <Field ViewDragHelper$Callback mCallback>
    //    5    9:aload_0         
    //    6   10:getfield        #255 <Field View mCapturedView>
    //    7   13:fload_1         
    //    8   14:fload_2         
    //    9   15:invokevirtual   #259 <Method void ViewDragHelper$Callback.onViewReleased(View, float, float)>
    //   10   18:aload_0         
    //   11   19:iconst_0        
    //   12   20:putfield        #253 <Field boolean mReleaseInProgress>
    //   13   23:aload_0         
    //   14   24:getfield        #261 <Field int mDragState>
    //   15   27:iconst_1        
    //   16   28:icmpne          36
    //   17   31:aload_0         
    //   18   32:iconst_0        
    //   19   33:invokevirtual   #264 <Method void setDragState(int)>
    //   20   36:return          
    }

    private float distanceInfluenceForSnapDuration(float f)
    {
    //    0    0:ldc2w           #265 <Double 0.4712389167638204D>
    //    1    3:fload_1         
    //    2    4:ldc1            #109 <Float 0.5F>
    //    3    6:fsub            
    //    4    7:f2d             
    //    5    8:dmul            
    //    6    9:d2f             
    //    7   10:f2d             
    //    8   11:invokestatic    #270 <Method double Math.sin(double)>
    //    9   14:d2f             
    //   10   15:freturn         
    }

    private void dragTo(int i, int j, int k, int l)
    {
    //    0    0:iload_1         
    //    1    1:istore          5
    //    2    3:iload_2         
    //    3    4:istore          6
    //    4    6:aload_0         
    //    5    7:getfield        #255 <Field View mCapturedView>
    //    6   10:invokevirtual   #277 <Method int View.getLeft()>
    //    7   13:istore          7
    //    8   15:aload_0         
    //    9   16:getfield        #255 <Field View mCapturedView>
    //   10   19:invokevirtual   #280 <Method int View.getTop()>
    //   11   22:istore          8
    //   12   24:iload_3         
    //   13   25:ifeq            55
    //   14   28:aload_0         
    //   15   29:getfield        #102 <Field ViewDragHelper$Callback mCallback>
    //   16   32:aload_0         
    //   17   33:getfield        #255 <Field View mCapturedView>
    //   18   36:iload_1         
    //   19   37:iload_3         
    //   20   38:invokevirtual   #284 <Method int ViewDragHelper$Callback.clampViewPositionHorizontal(View, int, int)>
    //   21   41:istore          5
    //   22   43:aload_0         
    //   23   44:getfield        #255 <Field View mCapturedView>
    //   24   47:iload           5
    //   25   49:iload           7
    //   26   51:isub            
    //   27   52:invokevirtual   #287 <Method void View.offsetLeftAndRight(int)>
    //   28   55:iload           4
    //   29   57:ifeq            88
    //   30   60:aload_0         
    //   31   61:getfield        #102 <Field ViewDragHelper$Callback mCallback>
    //   32   64:aload_0         
    //   33   65:getfield        #255 <Field View mCapturedView>
    //   34   68:iload_2         
    //   35   69:iload           4
    //   36   71:invokevirtual   #290 <Method int ViewDragHelper$Callback.clampViewPositionVertical(View, int, int)>
    //   37   74:istore          6
    //   38   76:aload_0         
    //   39   77:getfield        #255 <Field View mCapturedView>
    //   40   80:iload           6
    //   41   82:iload           8
    //   42   84:isub            
    //   43   85:invokevirtual   #293 <Method void View.offsetTopAndBottom(int)>
    //   44   88:iload_3         
    //   45   89:ifne            97
    //   46   92:iload           4
    //   47   94:ifeq            130
    //   48   97:iload           5
    //   49   99:iload           7
    //   50  101:isub            
    //   51  102:istore          9
    //   52  104:iload           6
    //   53  106:iload           8
    //   54  108:isub            
    //   55  109:istore          10
    //   56  111:aload_0         
    //   57  112:getfield        #102 <Field ViewDragHelper$Callback mCallback>
    //   58  115:aload_0         
    //   59  116:getfield        #255 <Field View mCapturedView>
    //   60  119:iload           5
    //   61  121:iload           6
    //   62  123:iload           9
    //   63  125:iload           10
    //   64  127:invokevirtual   #297 <Method void ViewDragHelper$Callback.onViewPositionChanged(View, int, int, int, int)>
    //   65  130:return          
    }

    private void ensureMotionHistorySizeForId(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #193 <Field float[] mInitialMotionX>
    //    2    4:ifnull          16
    //    3    7:aload_0         
    //    4    8:getfield        #193 <Field float[] mInitialMotionX>
    //    5   11:arraylength     
    //    6   12:iload_1         
    //    7   13:icmpgt          220
    //    8   16:iload_1         
    //    9   17:iconst_1        
    //   10   18:iadd            
    //   11   19:newarray        float[]
    //   12   21:astore_2        
    //   13   22:iload_1         
    //   14   23:iconst_1        
    //   15   24:iadd            
    //   16   25:newarray        float[]
    //   17   27:astore_3        
    //   18   28:iload_1         
    //   19   29:iconst_1        
    //   20   30:iadd            
    //   21   31:newarray        float[]
    //   22   33:astore          4
    //   23   35:iload_1         
    //   24   36:iconst_1        
    //   25   37:iadd            
    //   26   38:newarray        float[]
    //   27   40:astore          5
    //   28   42:iload_1         
    //   29   43:iconst_1        
    //   30   44:iadd            
    //   31   45:newarray        int[]
    //   32   47:astore          6
    //   33   49:iload_1         
    //   34   50:iconst_1        
    //   35   51:iadd            
    //   36   52:newarray        int[]
    //   37   54:astore          7
    //   38   56:iload_1         
    //   39   57:iconst_1        
    //   40   58:iadd            
    //   41   59:newarray        int[]
    //   42   61:astore          8
    //   43   63:aload_0         
    //   44   64:getfield        #193 <Field float[] mInitialMotionX>
    //   45   67:ifnull          180
    //   46   70:aload_0         
    //   47   71:getfield        #193 <Field float[] mInitialMotionX>
    //   48   74:iconst_0        
    //   49   75:aload_2         
    //   50   76:iconst_0        
    //   51   77:aload_0         
    //   52   78:getfield        #193 <Field float[] mInitialMotionX>
    //   53   81:arraylength     
    //   54   82:invokestatic    #304 <Method void System.arraycopy(Object, int, Object, int, int)>
    //   55   85:aload_0         
    //   56   86:getfield        #201 <Field float[] mInitialMotionY>
    //   57   89:iconst_0        
    //   58   90:aload_3         
    //   59   91:iconst_0        
    //   60   92:aload_0         
    //   61   93:getfield        #201 <Field float[] mInitialMotionY>
    //   62   96:arraylength     
    //   63   97:invokestatic    #304 <Method void System.arraycopy(Object, int, Object, int, int)>
    //   64  100:aload_0         
    //   65  101:getfield        #203 <Field float[] mLastMotionX>
    //   66  104:iconst_0        
    //   67  105:aload           4
    //   68  107:iconst_0        
    //   69  108:aload_0         
    //   70  109:getfield        #203 <Field float[] mLastMotionX>
    //   71  112:arraylength     
    //   72  113:invokestatic    #304 <Method void System.arraycopy(Object, int, Object, int, int)>
    //   73  116:aload_0         
    //   74  117:getfield        #205 <Field float[] mLastMotionY>
    //   75  120:iconst_0        
    //   76  121:aload           5
    //   77  123:iconst_0        
    //   78  124:aload_0         
    //   79  125:getfield        #205 <Field float[] mLastMotionY>
    //   80  128:arraylength     
    //   81  129:invokestatic    #304 <Method void System.arraycopy(Object, int, Object, int, int)>
    //   82  132:aload_0         
    //   83  133:getfield        #163 <Field int[] mInitialEdgesTouched>
    //   84  136:iconst_0        
    //   85  137:aload           6
    //   86  139:iconst_0        
    //   87  140:aload_0         
    //   88  141:getfield        #163 <Field int[] mInitialEdgesTouched>
    //   89  144:arraylength     
    //   90  145:invokestatic    #304 <Method void System.arraycopy(Object, int, Object, int, int)>
    //   91  148:aload_0         
    //   92  149:getfield        #169 <Field int[] mEdgeDragsInProgress>
    //   93  152:iconst_0        
    //   94  153:aload           7
    //   95  155:iconst_0        
    //   96  156:aload_0         
    //   97  157:getfield        #169 <Field int[] mEdgeDragsInProgress>
    //   98  160:arraylength     
    //   99  161:invokestatic    #304 <Method void System.arraycopy(Object, int, Object, int, int)>
    //  100  164:aload_0         
    //  101  165:getfield        #167 <Field int[] mEdgeDragsLocked>
    //  102  168:iconst_0        
    //  103  169:aload           8
    //  104  171:iconst_0        
    //  105  172:aload_0         
    //  106  173:getfield        #167 <Field int[] mEdgeDragsLocked>
    //  107  176:arraylength     
    //  108  177:invokestatic    #304 <Method void System.arraycopy(Object, int, Object, int, int)>
    //  109  180:aload_0         
    //  110  181:aload_2         
    //  111  182:putfield        #193 <Field float[] mInitialMotionX>
    //  112  185:aload_0         
    //  113  186:aload_3         
    //  114  187:putfield        #201 <Field float[] mInitialMotionY>
    //  115  190:aload_0         
    //  116  191:aload           4
    //  117  193:putfield        #203 <Field float[] mLastMotionX>
    //  118  196:aload_0         
    //  119  197:aload           5
    //  120  199:putfield        #205 <Field float[] mLastMotionY>
    //  121  202:aload_0         
    //  122  203:aload           6
    //  123  205:putfield        #163 <Field int[] mInitialEdgesTouched>
    //  124  208:aload_0         
    //  125  209:aload           7
    //  126  211:putfield        #169 <Field int[] mEdgeDragsInProgress>
    //  127  214:aload_0         
    //  128  215:aload           8
    //  129  217:putfield        #167 <Field int[] mEdgeDragsLocked>
    //  130  220:return          
    }

    private boolean forceSettleCapturedViewAt(int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #255 <Field View mCapturedView>
    //    2    4:invokevirtual   #277 <Method int View.getLeft()>
    //    3    7:istore          5
    //    4    9:aload_0         
    //    5   10:getfield        #255 <Field View mCapturedView>
    //    6   13:invokevirtual   #280 <Method int View.getTop()>
    //    7   16:istore          6
    //    8   18:iload_1         
    //    9   19:iload           5
    //   10   21:isub            
    //   11   22:istore          7
    //   12   24:iload_2         
    //   13   25:iload           6
    //   14   27:isub            
    //   15   28:istore          8
    //   16   30:iload           7
    //   17   32:ifne            54
    //   18   35:iload           8
    //   19   37:ifne            54
    //   20   40:aload_0         
    //   21   41:getfield        #153 <Field ScrollerCompat mScroller>
    //   22   44:invokevirtual   #309 <Method void ScrollerCompat.abortAnimation()>
    //   23   47:aload_0         
    //   24   48:iconst_0        
    //   25   49:invokevirtual   #264 <Method void setDragState(int)>
    //   26   52:iconst_0        
    //   27   53:ireturn         
    //   28   54:aload_0         
    //   29   55:aload_0         
    //   30   56:getfield        #255 <Field View mCapturedView>
    //   31   59:iload           7
    //   32   61:iload           8
    //   33   63:iload_3         
    //   34   64:iload           4
    //   35   66:invokespecial   #311 <Method int computeSettleDuration(View, int, int, int, int)>
    //   36   69:istore          9
    //   37   71:aload_0         
    //   38   72:getfield        #153 <Field ScrollerCompat mScroller>
    //   39   75:iload           5
    //   40   77:iload           6
    //   41   79:iload           7
    //   42   81:iload           8
    //   43   83:iload           9
    //   44   85:invokevirtual   #315 <Method void ScrollerCompat.startScroll(int, int, int, int, int)>
    //   45   88:aload_0         
    //   46   89:iconst_2        
    //   47   90:invokevirtual   #264 <Method void setDragState(int)>
    //   48   93:iconst_1        
    //   49   94:ireturn         
    }

    private int getEdgesTouched(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #100 <Field ViewGroup mParentView>
    //    2    4:invokevirtual   #317 <Method int ViewGroup.getLeft()>
    //    3    7:aload_0         
    //    4    8:getfield        #129 <Field int mEdgeSize>
    //    5   11:iadd            
    //    6   12:istore_3        
    //    7   13:iconst_0        
    //    8   14:istore          4
    //    9   16:iload_1         
    //   10   17:iload_3         
    //   11   18:icmpge          26
    //   12   21:iconst_0        
    //   13   22:iconst_1        
    //   14   23:ior             
    //   15   24:istore          4
    //   16   26:iload_2         
    //   17   27:aload_0         
    //   18   28:getfield        #100 <Field ViewGroup mParentView>
    //   19   31:invokevirtual   #318 <Method int ViewGroup.getTop()>
    //   20   34:aload_0         
    //   21   35:getfield        #129 <Field int mEdgeSize>
    //   22   38:iadd            
    //   23   39:icmpge          48
    //   24   42:iload           4
    //   25   44:iconst_4        
    //   26   45:ior             
    //   27   46:istore          4
    //   28   48:iload_1         
    //   29   49:aload_0         
    //   30   50:getfield        #100 <Field ViewGroup mParentView>
    //   31   53:invokevirtual   #321 <Method int ViewGroup.getRight()>
    //   32   56:aload_0         
    //   33   57:getfield        #129 <Field int mEdgeSize>
    //   34   60:isub            
    //   35   61:icmple          70
    //   36   64:iload           4
    //   37   66:iconst_2        
    //   38   67:ior             
    //   39   68:istore          4
    //   40   70:iload_2         
    //   41   71:aload_0         
    //   42   72:getfield        #100 <Field ViewGroup mParentView>
    //   43   75:invokevirtual   #324 <Method int ViewGroup.getBottom()>
    //   44   78:aload_0         
    //   45   79:getfield        #129 <Field int mEdgeSize>
    //   46   82:isub            
    //   47   83:icmple          93
    //   48   86:iload           4
    //   49   88:bipush          8
    //   50   90:ior             
    //   51   91:istore          4
    //   52   93:iload           4
    //   53   95:ireturn         
    }

    private void releaseViewForPointerUp()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #327 <Field VelocityTracker mVelocityTracker>
    //    2    4:sipush          1000
    //    3    7:aload_0         
    //    4    8:getfield        #140 <Field float mMaxVelocity>
    //    5   11:invokevirtual   #333 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
    //    6   14:aload_0         
    //    7   15:aload_0         
    //    8   16:aload_0         
    //    9   17:getfield        #327 <Field VelocityTracker mVelocityTracker>
    //   10   20:aload_0         
    //   11   21:getfield        #82  <Field int mActivePointerId>
    //   12   24:invokestatic    #339 <Method float VelocityTrackerCompat.getXVelocity(VelocityTracker, int)>
    //   13   27:aload_0         
    //   14   28:getfield        #145 <Field float mMinVelocity>
    //   15   31:aload_0         
    //   16   32:getfield        #140 <Field float mMaxVelocity>
    //   17   35:invokespecial   #341 <Method float clampMag(float, float, float)>
    //   18   38:aload_0         
    //   19   39:aload_0         
    //   20   40:getfield        #327 <Field VelocityTracker mVelocityTracker>
    //   21   43:aload_0         
    //   22   44:getfield        #82  <Field int mActivePointerId>
    //   23   47:invokestatic    #344 <Method float VelocityTrackerCompat.getYVelocity(VelocityTracker, int)>
    //   24   50:aload_0         
    //   25   51:getfield        #145 <Field float mMinVelocity>
    //   26   54:aload_0         
    //   27   55:getfield        #140 <Field float mMaxVelocity>
    //   28   58:invokespecial   #341 <Method float clampMag(float, float, float)>
    //   29   61:invokespecial   #346 <Method void dispatchViewReleased(float, float)>
    //   30   64:return          
    }

    private void reportNewEdgeDrags(float f, float f1, int i)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:fload_2         
    //    3    3:iload_3         
    //    4    4:iconst_1        
    //    5    5:invokespecial   #350 <Method boolean checkNewEdgeDrag(float, float, int, int)>
    //    6    8:istore          4
    //    7   10:iconst_0        
    //    8   11:istore          5
    //    9   13:iload           4
    //   10   15:ifeq            23
    //   11   18:iconst_0        
    //   12   19:iconst_1        
    //   13   20:ior             
    //   14   21:istore          5
    //   15   23:aload_0         
    //   16   24:fload_2         
    //   17   25:fload_1         
    //   18   26:iload_3         
    //   19   27:iconst_4        
    //   20   28:invokespecial   #350 <Method boolean checkNewEdgeDrag(float, float, int, int)>
    //   21   31:ifeq            40
    //   22   34:iload           5
    //   23   36:iconst_4        
    //   24   37:ior             
    //   25   38:istore          5
    //   26   40:aload_0         
    //   27   41:fload_1         
    //   28   42:fload_2         
    //   29   43:iload_3         
    //   30   44:iconst_2        
    //   31   45:invokespecial   #350 <Method boolean checkNewEdgeDrag(float, float, int, int)>
    //   32   48:ifeq            57
    //   33   51:iload           5
    //   34   53:iconst_2        
    //   35   54:ior             
    //   36   55:istore          5
    //   37   57:aload_0         
    //   38   58:fload_2         
    //   39   59:fload_1         
    //   40   60:iload_3         
    //   41   61:bipush          8
    //   42   63:invokespecial   #350 <Method boolean checkNewEdgeDrag(float, float, int, int)>
    //   43   66:ifeq            76
    //   44   69:iload           5
    //   45   71:bipush          8
    //   46   73:ior             
    //   47   74:istore          5
    //   48   76:iload           5
    //   49   78:ifeq            108
    //   50   81:aload_0         
    //   51   82:getfield        #169 <Field int[] mEdgeDragsInProgress>
    //   52   85:astore          6
    //   53   87:aload           6
    //   54   89:iload_3         
    //   55   90:iload           5
    //   56   92:aload           6
    //   57   94:iload_3         
    //   58   95:iaload          
    //   59   96:ior             
    //   60   97:iastore         
    //   61   98:aload_0         
    //   62   99:getfield        #102 <Field ViewDragHelper$Callback mCallback>
    //   63  102:iload           5
    //   64  104:iload_3         
    //   65  105:invokevirtual   #354 <Method void ViewDragHelper$Callback.onEdgeDragStarted(int, int)>
    //   66  108:return          
    }

    private void saveInitialMotion(float f, float f1, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_3         
    //    2    2:invokespecial   #357 <Method void ensureMotionHistorySizeForId(int)>
    //    3    5:aload_0         
    //    4    6:getfield        #193 <Field float[] mInitialMotionX>
    //    5    9:astore          4
    //    6   11:aload_0         
    //    7   12:getfield        #203 <Field float[] mLastMotionX>
    //    8   15:iload_3         
    //    9   16:fload_1         
    //   10   17:fastore         
    //   11   18:aload           4
    //   12   20:iload_3         
    //   13   21:fload_1         
    //   14   22:fastore         
    //   15   23:aload_0         
    //   16   24:getfield        #201 <Field float[] mInitialMotionY>
    //   17   27:astore          5
    //   18   29:aload_0         
    //   19   30:getfield        #205 <Field float[] mLastMotionY>
    //   20   33:iload_3         
    //   21   34:fload_2         
    //   22   35:fastore         
    //   23   36:aload           5
    //   24   38:iload_3         
    //   25   39:fload_2         
    //   26   40:fastore         
    //   27   41:aload_0         
    //   28   42:getfield        #163 <Field int[] mInitialEdgesTouched>
    //   29   45:iload_3         
    //   30   46:aload_0         
    //   31   47:fload_1         
    //   32   48:f2i             
    //   33   49:fload_2         
    //   34   50:f2i             
    //   35   51:invokespecial   #359 <Method int getEdgesTouched(int, int)>
    //   36   54:iastore         
    //   37   55:aload_0         
    //   38   56:aload_0         
    //   39   57:getfield        #210 <Field int mPointersDown>
    //   40   60:iconst_1        
    //   41   61:iload_3         
    //   42   62:ishl            
    //   43   63:ior             
    //   44   64:putfield        #210 <Field int mPointersDown>
    //   45   67:return          
    }

    private void saveLastMotion(MotionEvent motionevent)
    {
    //    0    0:aload_1         
    //    1    1:invokestatic    #367 <Method int MotionEventCompat.getPointerCount(MotionEvent)>
    //    2    4:istore_2        
    //    3    5:iconst_0        
    //    4    6:istore_3        
    //    5    7:iload_3         
    //    6    8:iload_2         
    //    7    9:icmpge          57
    //    8   12:aload_1         
    //    9   13:iload_3         
    //   10   14:invokestatic    #371 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //   11   17:istore          4
    //   12   19:aload_1         
    //   13   20:iload_3         
    //   14   21:invokestatic    #375 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //   15   24:fstore          5
    //   16   26:aload_1         
    //   17   27:iload_3         
    //   18   28:invokestatic    #378 <Method float MotionEventCompat.getY(MotionEvent, int)>
    //   19   31:fstore          6
    //   20   33:aload_0         
    //   21   34:getfield        #203 <Field float[] mLastMotionX>
    //   22   37:iload           4
    //   23   39:fload           5
    //   24   41:fastore         
    //   25   42:aload_0         
    //   26   43:getfield        #205 <Field float[] mLastMotionY>
    //   27   46:iload           4
    //   28   48:fload           6
    //   29   50:fastore         
    //   30   51:iinc            3  1
    //   31   54:goto            7
    //   32   57:return          
    }

    public void abort()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #382 <Method void cancel()>
    //    2    4:aload_0         
    //    3    5:getfield        #261 <Field int mDragState>
    //    4    8:iconst_2        
    //    5    9:icmpne          73
    //    6   12:aload_0         
    //    7   13:getfield        #153 <Field ScrollerCompat mScroller>
    //    8   16:invokevirtual   #385 <Method int ScrollerCompat.getCurrX()>
    //    9   19:istore_1        
    //   10   20:aload_0         
    //   11   21:getfield        #153 <Field ScrollerCompat mScroller>
    //   12   24:invokevirtual   #388 <Method int ScrollerCompat.getCurrY()>
    //   13   27:istore_2        
    //   14   28:aload_0         
    //   15   29:getfield        #153 <Field ScrollerCompat mScroller>
    //   16   32:invokevirtual   #309 <Method void ScrollerCompat.abortAnimation()>
    //   17   35:aload_0         
    //   18   36:getfield        #153 <Field ScrollerCompat mScroller>
    //   19   39:invokevirtual   #385 <Method int ScrollerCompat.getCurrX()>
    //   20   42:istore_3        
    //   21   43:aload_0         
    //   22   44:getfield        #153 <Field ScrollerCompat mScroller>
    //   23   47:invokevirtual   #388 <Method int ScrollerCompat.getCurrY()>
    //   24   50:istore          4
    //   25   52:aload_0         
    //   26   53:getfield        #102 <Field ViewDragHelper$Callback mCallback>
    //   27   56:aload_0         
    //   28   57:getfield        #255 <Field View mCapturedView>
    //   29   60:iload_3         
    //   30   61:iload           4
    //   31   63:iload_3         
    //   32   64:iload_1         
    //   33   65:isub            
    //   34   66:iload           4
    //   35   68:iload_2         
    //   36   69:isub            
    //   37   70:invokevirtual   #297 <Method void ViewDragHelper$Callback.onViewPositionChanged(View, int, int, int, int)>
    //   38   73:aload_0         
    //   39   74:iconst_0        
    //   40   75:invokevirtual   #264 <Method void setDragState(int)>
    //   41   78:return          
    }

    protected boolean canScroll(View view, boolean flag, int i, int j, int k, int l)
    {
    //    0    0:aload_1         
    //    1    1:instanceof      #214 <Class ViewGroup>
    //    2    4:ifeq            143
    //    3    7:aload_1         
    //    4    8:checkcast       #214 <Class ViewGroup>
    //    5   11:astore          7
    //    6   13:aload_1         
    //    7   14:invokevirtual   #393 <Method int View.getScrollX()>
    //    8   17:istore          8
    //    9   19:aload_1         
    //   10   20:invokevirtual   #396 <Method int View.getScrollY()>
    //   11   23:istore          9
    //   12   25:iconst_m1       
    //   13   26:aload           7
    //   14   28:invokevirtual   #399 <Method int ViewGroup.getChildCount()>
    //   15   31:iadd            
    //   16   32:istore          10
    //   17   34:iload           10
    //   18   36:iflt            143
    //   19   39:aload           7
    //   20   41:iload           10
    //   21   43:invokevirtual   #403 <Method View ViewGroup.getChildAt(int)>
    //   22   46:astore          11
    //   23   48:iload           5
    //   24   50:iload           8
    //   25   52:iadd            
    //   26   53:aload           11
    //   27   55:invokevirtual   #277 <Method int View.getLeft()>
    //   28   58:icmplt          137
    //   29   61:iload           5
    //   30   63:iload           8
    //   31   65:iadd            
    //   32   66:aload           11
    //   33   68:invokevirtual   #404 <Method int View.getRight()>
    //   34   71:icmpge          137
    //   35   74:iload           6
    //   36   76:iload           9
    //   37   78:iadd            
    //   38   79:aload           11
    //   39   81:invokevirtual   #280 <Method int View.getTop()>
    //   40   84:icmplt          137
    //   41   87:iload           6
    //   42   89:iload           9
    //   43   91:iadd            
    //   44   92:aload           11
    //   45   94:invokevirtual   #405 <Method int View.getBottom()>
    //   46   97:icmpge          137
    //   47  100:aload_0         
    //   48  101:aload           11
    //   49  103:iconst_1        
    //   50  104:iload_3         
    //   51  105:iload           4
    //   52  107:iload           5
    //   53  109:iload           8
    //   54  111:iadd            
    //   55  112:aload           11
    //   56  114:invokevirtual   #277 <Method int View.getLeft()>
    //   57  117:isub            
    //   58  118:iload           6
    //   59  120:iload           9
    //   60  122:iadd            
    //   61  123:aload           11
    //   62  125:invokevirtual   #280 <Method int View.getTop()>
    //   63  128:isub            
    //   64  129:invokevirtual   #407 <Method boolean canScroll(View, boolean, int, int, int, int)>
    //   65  132:ifeq            137
    //   66  135:iconst_1        
    //   67  136:ireturn         
    //   68  137:iinc            10  -1
    //   69  140:goto            34
    //   70  143:iload_2         
    //   71  144:ifeq            168
    //   72  147:aload_1         
    //   73  148:iload_3         
    //   74  149:ineg            
    //   75  150:invokestatic    #413 <Method boolean ViewCompat.canScrollHorizontally(View, int)>
    //   76  153:ifne            166
    //   77  156:aload_1         
    //   78  157:iload           4
    //   79  159:ineg            
    //   80  160:invokestatic    #416 <Method boolean ViewCompat.canScrollVertically(View, int)>
    //   81  163:ifeq            168
    //   82  166:iconst_1        
    //   83  167:ireturn         
    //   84  168:iconst_0        
    //   85  169:ireturn         
    }

    public void cancel()
    {
    //    0    0:aload_0         
    //    1    1:iconst_m1       
    //    2    2:putfield        #82  <Field int mActivePointerId>
    //    3    5:aload_0         
    //    4    6:invokespecial   #418 <Method void clearMotionHistory()>
    //    5    9:aload_0         
    //    6   10:getfield        #327 <Field VelocityTracker mVelocityTracker>
    //    7   13:ifnull          28
    //    8   16:aload_0         
    //    9   17:getfield        #327 <Field VelocityTracker mVelocityTracker>
    //   10   20:invokevirtual   #421 <Method void VelocityTracker.recycle()>
    //   11   23:aload_0         
    //   12   24:aconst_null     
    //   13   25:putfield        #327 <Field VelocityTracker mVelocityTracker>
    //   14   28:return          
    }

    public void captureChildView(View view, int i)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #427 <Method android.view.ViewParent View.getParent()>
    //    2    4:aload_0         
    //    3    5:getfield        #100 <Field ViewGroup mParentView>
    //    4    8:if_acmpeq       48
    //    5   11:new             #91  <Class IllegalArgumentException>
    //    6   14:dup             
    //    7   15:new             #429 <Class StringBuilder>
    //    8   18:dup             
    //    9   19:invokespecial   #430 <Method void StringBuilder()>
    //   10   22:ldc2            #432 <String "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (">
    //   11   25:invokevirtual   #436 <Method StringBuilder StringBuilder.append(String)>
    //   12   28:aload_0         
    //   13   29:getfield        #100 <Field ViewGroup mParentView>
    //   14   32:invokevirtual   #439 <Method StringBuilder StringBuilder.append(Object)>
    //   15   35:ldc2            #441 <String ")">
    //   16   38:invokevirtual   #436 <Method StringBuilder StringBuilder.append(String)>
    //   17   41:invokevirtual   #445 <Method String StringBuilder.toString()>
    //   18   44:invokespecial   #96  <Method void IllegalArgumentException(String)>
    //   19   47:athrow          
    //   20   48:aload_0         
    //   21   49:aload_1         
    //   22   50:putfield        #255 <Field View mCapturedView>
    //   23   53:aload_0         
    //   24   54:iload_2         
    //   25   55:putfield        #82  <Field int mActivePointerId>
    //   26   58:aload_0         
    //   27   59:getfield        #102 <Field ViewDragHelper$Callback mCallback>
    //   28   62:aload_1         
    //   29   63:iload_2         
    //   30   64:invokevirtual   #448 <Method void ViewDragHelper$Callback.onViewCaptured(View, int)>
    //   31   67:aload_0         
    //   32   68:iconst_1        
    //   33   69:invokevirtual   #264 <Method void setDragState(int)>
    //   34   72:return          
    }

    public boolean checkTouchSlop(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #193 <Field float[] mInitialMotionX>
    //    2    4:arraylength     
    //    3    5:istore_2        
    //    4    6:iconst_0        
    //    5    7:istore_3        
    //    6    8:iload_3         
    //    7    9:iload_2         
    //    8   10:icmpge          30
    //    9   13:aload_0         
    //   10   14:iload_1         
    //   11   15:iload_3         
    //   12   16:invokevirtual   #451 <Method boolean checkTouchSlop(int, int)>
    //   13   19:ifeq            24
    //   14   22:iconst_1        
    //   15   23:ireturn         
    //   16   24:iinc            3  1
    //   17   27:goto            8
    //   18   30:iconst_0        
    //   19   31:ireturn         
    }

    public boolean checkTouchSlop(int i, int j)
    {
    //    0    0:iconst_1        
    //    1    1:istore_3        
    //    2    2:aload_0         
    //    3    3:iload_2         
    //    4    4:invokevirtual   #454 <Method boolean isPointerDown(int)>
    //    5    7:ifne            14
    //    6   10:iconst_0        
    //    7   11:istore_3        
    //    8   12:iload_3         
    //    9   13:ireturn         
    //   10   14:iload_1         
    //   11   15:iconst_1        
    //   12   16:iand            
    //   13   17:iload_3         
    //   14   18:icmpne          101
    //   15   21:iload_3         
    //   16   22:istore          4
    //   17   24:iload_1         
    //   18   25:iconst_2        
    //   19   26:iand            
    //   20   27:iconst_2        
    //   21   28:icmpne          107
    //   22   31:iload_3         
    //   23   32:istore          5
    //   24   34:aload_0         
    //   25   35:getfield        #203 <Field float[] mLastMotionX>
    //   26   38:iload_2         
    //   27   39:faload          
    //   28   40:aload_0         
    //   29   41:getfield        #193 <Field float[] mInitialMotionX>
    //   30   44:iload_2         
    //   31   45:faload          
    //   32   46:fsub            
    //   33   47:fstore          6
    //   34   49:aload_0         
    //   35   50:getfield        #205 <Field float[] mLastMotionY>
    //   36   53:iload_2         
    //   37   54:faload          
    //   38   55:aload_0         
    //   39   56:getfield        #201 <Field float[] mInitialMotionY>
    //   40   59:iload_2         
    //   41   60:faload          
    //   42   61:fsub            
    //   43   62:fstore          7
    //   44   64:iload           4
    //   45   66:ifeq            113
    //   46   69:iload           5
    //   47   71:ifeq            113
    //   48   74:fload           6
    //   49   76:fload           6
    //   50   78:fmul            
    //   51   79:fload           7
    //   52   81:fload           7
    //   53   83:fmul            
    //   54   84:fadd            
    //   55   85:aload_0         
    //   56   86:getfield        #135 <Field int mTouchSlop>
    //   57   89:aload_0         
    //   58   90:getfield        #135 <Field int mTouchSlop>
    //   59   93:imul            
    //   60   94:i2f             
    //   61   95:fcmpl           
    //   62   96:ifgt            12
    //   63   99:iconst_0        
    //   64  100:ireturn         
    //   65  101:iconst_0        
    //   66  102:istore          4
    //   67  104:goto            24
    //   68  107:iconst_0        
    //   69  108:istore          5
    //   70  110:goto            34
    //   71  113:iload           4
    //   72  115:ifeq            134
    //   73  118:fload           6
    //   74  120:invokestatic    #161 <Method float Math.abs(float)>
    //   75  123:aload_0         
    //   76  124:getfield        #135 <Field int mTouchSlop>
    //   77  127:i2f             
    //   78  128:fcmpl           
    //   79  129:ifgt            12
    //   80  132:iconst_0        
    //   81  133:ireturn         
    //   82  134:iload           5
    //   83  136:ifeq            155
    //   84  139:fload           7
    //   85  141:invokestatic    #161 <Method float Math.abs(float)>
    //   86  144:aload_0         
    //   87  145:getfield        #135 <Field int mTouchSlop>
    //   88  148:i2f             
    //   89  149:fcmpl           
    //   90  150:ifgt            12
    //   91  153:iconst_0        
    //   92  154:ireturn         
    //   93  155:iconst_0        
    //   94  156:ireturn         
    }

    public boolean continueSettling(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #261 <Field int mDragState>
    //    2    4:iconst_2        
    //    3    5:icmpne          174
    //    4    8:aload_0         
    //    5    9:getfield        #153 <Field ScrollerCompat mScroller>
    //    6   12:invokevirtual   #460 <Method boolean ScrollerCompat.computeScrollOffset()>
    //    7   15:istore_2        
    //    8   16:aload_0         
    //    9   17:getfield        #153 <Field ScrollerCompat mScroller>
    //   10   20:invokevirtual   #385 <Method int ScrollerCompat.getCurrX()>
    //   11   23:istore_3        
    //   12   24:aload_0         
    //   13   25:getfield        #153 <Field ScrollerCompat mScroller>
    //   14   28:invokevirtual   #388 <Method int ScrollerCompat.getCurrY()>
    //   15   31:istore          4
    //   16   33:iload_3         
    //   17   34:aload_0         
    //   18   35:getfield        #255 <Field View mCapturedView>
    //   19   38:invokevirtual   #277 <Method int View.getLeft()>
    //   20   41:isub            
    //   21   42:istore          5
    //   22   44:iload           4
    //   23   46:aload_0         
    //   24   47:getfield        #255 <Field View mCapturedView>
    //   25   50:invokevirtual   #280 <Method int View.getTop()>
    //   26   53:isub            
    //   27   54:istore          6
    //   28   56:iload           5
    //   29   58:ifeq            70
    //   30   61:aload_0         
    //   31   62:getfield        #255 <Field View mCapturedView>
    //   32   65:iload           5
    //   33   67:invokevirtual   #287 <Method void View.offsetLeftAndRight(int)>
    //   34   70:iload           6
    //   35   72:ifeq            84
    //   36   75:aload_0         
    //   37   76:getfield        #255 <Field View mCapturedView>
    //   38   79:iload           6
    //   39   81:invokevirtual   #293 <Method void View.offsetTopAndBottom(int)>
    //   40   84:iload           5
    //   41   86:ifne            94
    //   42   89:iload           6
    //   43   91:ifeq            112
    //   44   94:aload_0         
    //   45   95:getfield        #102 <Field ViewDragHelper$Callback mCallback>
    //   46   98:aload_0         
    //   47   99:getfield        #255 <Field View mCapturedView>
    //   48  102:iload_3         
    //   49  103:iload           4
    //   50  105:iload           5
    //   51  107:iload           6
    //   52  109:invokevirtual   #297 <Method void ViewDragHelper$Callback.onViewPositionChanged(View, int, int, int, int)>
    //   53  112:iload_2         
    //   54  113:ifeq            154
    //   55  116:iload_3         
    //   56  117:aload_0         
    //   57  118:getfield        #153 <Field ScrollerCompat mScroller>
    //   58  121:invokevirtual   #463 <Method int ScrollerCompat.getFinalX()>
    //   59  124:icmpne          154
    //   60  127:iload           4
    //   61  129:aload_0         
    //   62  130:getfield        #153 <Field ScrollerCompat mScroller>
    //   63  133:invokevirtual   #466 <Method int ScrollerCompat.getFinalY()>
    //   64  136:icmpne          154
    //   65  139:aload_0         
    //   66  140:getfield        #153 <Field ScrollerCompat mScroller>
    //   67  143:invokevirtual   #309 <Method void ScrollerCompat.abortAnimation()>
    //   68  146:aload_0         
    //   69  147:getfield        #153 <Field ScrollerCompat mScroller>
    //   70  150:invokevirtual   #469 <Method boolean ScrollerCompat.isFinished()>
    //   71  153:istore_2        
    //   72  154:iload_2         
    //   73  155:ifne            174
    //   74  158:iload_1         
    //   75  159:ifeq            184
    //   76  162:aload_0         
    //   77  163:getfield        #100 <Field ViewGroup mParentView>
    //   78  166:aload_0         
    //   79  167:getfield        #89  <Field Runnable mSetIdleRunnable>
    //   80  170:invokevirtual   #473 <Method boolean ViewGroup.post(Runnable)>
    //   81  173:pop             
    //   82  174:aload_0         
    //   83  175:getfield        #261 <Field int mDragState>
    //   84  178:iconst_2        
    //   85  179:icmpne          192
    //   86  182:iconst_1        
    //   87  183:ireturn         
    //   88  184:aload_0         
    //   89  185:iconst_0        
    //   90  186:invokevirtual   #264 <Method void setDragState(int)>
    //   91  189:goto            174
    //   92  192:iconst_0        
    //   93  193:ireturn         
    }

    public View findTopChildUnder(int i, int j)
    {
    //    0    0:iconst_m1       
    //    1    1:aload_0         
    //    2    2:getfield        #100 <Field ViewGroup mParentView>
    //    3    5:invokevirtual   #399 <Method int ViewGroup.getChildCount()>
    //    4    8:iadd            
    //    5    9:istore_3        
    //    6   10:iload_3         
    //    7   11:iflt            76
    //    8   14:aload_0         
    //    9   15:getfield        #100 <Field ViewGroup mParentView>
    //   10   18:aload_0         
    //   11   19:getfield        #102 <Field ViewDragHelper$Callback mCallback>
    //   12   22:iload_3         
    //   13   23:invokevirtual   #478 <Method int ViewDragHelper$Callback.getOrderedChildIndex(int)>
    //   14   26:invokevirtual   #403 <Method View ViewGroup.getChildAt(int)>
    //   15   29:astore          4
    //   16   31:iload_1         
    //   17   32:aload           4
    //   18   34:invokevirtual   #277 <Method int View.getLeft()>
    //   19   37:icmplt          70
    //   20   40:iload_1         
    //   21   41:aload           4
    //   22   43:invokevirtual   #404 <Method int View.getRight()>
    //   23   46:icmpge          70
    //   24   49:iload_2         
    //   25   50:aload           4
    //   26   52:invokevirtual   #280 <Method int View.getTop()>
    //   27   55:icmplt          70
    //   28   58:iload_2         
    //   29   59:aload           4
    //   30   61:invokevirtual   #405 <Method int View.getBottom()>
    //   31   64:icmpge          70
    //   32   67:aload           4
    //   33   69:areturn         
    //   34   70:iinc            3  -1
    //   35   73:goto            10
    //   36   76:aconst_null     
    //   37   77:areturn         
    }

    public void flingCapturedView(int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #253 <Field boolean mReleaseInProgress>
    //    2    4:ifne            18
    //    3    7:new             #481 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc2            #483 <String "Cannot flingCapturedView outside of a call to Callback#onViewReleased">
    //    6   14:invokespecial   #484 <Method void IllegalStateException(String)>
    //    7   17:athrow          
    //    8   18:aload_0         
    //    9   19:getfield        #153 <Field ScrollerCompat mScroller>
    //   10   22:aload_0         
    //   11   23:getfield        #255 <Field View mCapturedView>
    //   12   26:invokevirtual   #277 <Method int View.getLeft()>
    //   13   29:aload_0         
    //   14   30:getfield        #255 <Field View mCapturedView>
    //   15   33:invokevirtual   #280 <Method int View.getTop()>
    //   16   36:aload_0         
    //   17   37:getfield        #327 <Field VelocityTracker mVelocityTracker>
    //   18   40:aload_0         
    //   19   41:getfield        #82  <Field int mActivePointerId>
    //   20   44:invokestatic    #339 <Method float VelocityTrackerCompat.getXVelocity(VelocityTracker, int)>
    //   21   47:f2i             
    //   22   48:aload_0         
    //   23   49:getfield        #327 <Field VelocityTracker mVelocityTracker>
    //   24   52:aload_0         
    //   25   53:getfield        #82  <Field int mActivePointerId>
    //   26   56:invokestatic    #344 <Method float VelocityTrackerCompat.getYVelocity(VelocityTracker, int)>
    //   27   59:f2i             
    //   28   60:iload_1         
    //   29   61:iload_3         
    //   30   62:iload_2         
    //   31   63:iload           4
    //   32   65:invokevirtual   #488 <Method void ScrollerCompat.fling(int, int, int, int, int, int, int, int)>
    //   33   68:aload_0         
    //   34   69:iconst_2        
    //   35   70:invokevirtual   #264 <Method void setDragState(int)>
    //   36   73:return          
    }

    public int getActivePointerId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #82  <Field int mActivePointerId>
    //    2    4:ireturn         
    }

    public View getCapturedView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #255 <Field View mCapturedView>
    //    2    4:areturn         
    }

    public int getEdgeSize()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #129 <Field int mEdgeSize>
    //    2    4:ireturn         
    }

    public float getMinVelocity()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #145 <Field float mMinVelocity>
    //    2    4:freturn         
    }

    public int getTouchSlop()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #135 <Field int mTouchSlop>
    //    2    4:ireturn         
    }

    public int getViewDragState()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #261 <Field int mDragState>
    //    2    4:ireturn         
    }

    public boolean isCapturedViewUnder(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #255 <Field View mCapturedView>
    //    3    5:iload_1         
    //    4    6:iload_2         
    //    5    7:invokevirtual   #501 <Method boolean isViewUnder(View, int, int)>
    //    6   10:ireturn         
    }

    public boolean isEdgeTouched(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #163 <Field int[] mInitialEdgesTouched>
    //    2    4:arraylength     
    //    3    5:istore_2        
    //    4    6:iconst_0        
    //    5    7:istore_3        
    //    6    8:iload_3         
    //    7    9:iload_2         
    //    8   10:icmpge          30
    //    9   13:aload_0         
    //   10   14:iload_1         
    //   11   15:iload_3         
    //   12   16:invokevirtual   #504 <Method boolean isEdgeTouched(int, int)>
    //   13   19:ifeq            24
    //   14   22:iconst_1        
    //   15   23:ireturn         
    //   16   24:iinc            3  1
    //   17   27:goto            8
    //   18   30:iconst_0        
    //   19   31:ireturn         
    }

    public boolean isEdgeTouched(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:iload_2         
    //    2    2:invokevirtual   #454 <Method boolean isPointerDown(int)>
    //    3    5:ifeq            21
    //    4    8:iload_1         
    //    5    9:aload_0         
    //    6   10:getfield        #163 <Field int[] mInitialEdgesTouched>
    //    7   13:iload_2         
    //    8   14:iaload          
    //    9   15:iand            
    //   10   16:ifeq            21
    //   11   19:iconst_1        
    //   12   20:ireturn         
    //   13   21:iconst_0        
    //   14   22:ireturn         
    }

    public boolean isPointerDown(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #210 <Field int mPointersDown>
    //    2    4:iconst_1        
    //    3    5:iload_1         
    //    4    6:ishl            
    //    5    7:iand            
    //    6    8:ifeq            13
    //    7   11:iconst_1        
    //    8   12:ireturn         
    //    9   13:iconst_0        
    //   10   14:ireturn         
    }

    public boolean isViewUnder(View view, int i, int j)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       6
    //    2    4:iconst_0        
    //    3    5:ireturn         
    //    4    6:iload_2         
    //    5    7:aload_1         
    //    6    8:invokevirtual   #277 <Method int View.getLeft()>
    //    7   11:icmplt          4
    //    8   14:iload_2         
    //    9   15:aload_1         
    //   10   16:invokevirtual   #404 <Method int View.getRight()>
    //   11   19:icmpge          4
    //   12   22:iload_3         
    //   13   23:aload_1         
    //   14   24:invokevirtual   #280 <Method int View.getTop()>
    //   15   27:icmplt          4
    //   16   30:iload_3         
    //   17   31:aload_1         
    //   18   32:invokevirtual   #405 <Method int View.getBottom()>
    //   19   35:icmpge          4
    //   20   38:iconst_1        
    //   21   39:ireturn         
    }

    public void processTouchEvent(MotionEvent motionevent)
    {
    //    0    0:aload_1         
    //    1    1:invokestatic    #508 <Method int MotionEventCompat.getActionMasked(MotionEvent)>
    //    2    4:istore_2        
    //    3    5:aload_1         
    //    4    6:invokestatic    #511 <Method int MotionEventCompat.getActionIndex(MotionEvent)>
    //    5    9:istore_3        
    //    6   10:iload_2         
    //    7   11:ifne            18
    //    8   14:aload_0         
    //    9   15:invokevirtual   #382 <Method void cancel()>
    //   10   18:aload_0         
    //   11   19:getfield        #327 <Field VelocityTracker mVelocityTracker>
    //   12   22:ifnonnull       32
    //   13   25:aload_0         
    //   14   26:invokestatic    #515 <Method VelocityTracker VelocityTracker.obtain()>
    //   15   29:putfield        #327 <Field VelocityTracker mVelocityTracker>
    //   16   32:aload_0         
    //   17   33:getfield        #327 <Field VelocityTracker mVelocityTracker>
    //   18   36:aload_1         
    //   19   37:invokevirtual   #518 <Method void VelocityTracker.addMovement(MotionEvent)>
    //   20   40:iload_2         
    //   21   41:tableswitch     0 6: default 84
    //                   0 85
    //                   1 650
    //                   2 287
    //                   3 667
    //                   4 84
    //                   5 171
    //                   6 515
    //   22   84:return          
    //   23   85:aload_1         
    //   24   86:invokevirtual   #522 <Method float MotionEvent.getX()>
    //   25   89:fstore          30
    //   26   91:aload_1         
    //   27   92:invokevirtual   #524 <Method float MotionEvent.getY()>
    //   28   95:fstore          31
    //   29   97:aload_1         
    //   30   98:iconst_0        
    //   31   99:invokestatic    #371 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //   32  102:istore          32
    //   33  104:aload_0         
    //   34  105:fload           30
    //   35  107:f2i             
    //   36  108:fload           31
    //   37  110:f2i             
    //   38  111:invokevirtual   #526 <Method View findTopChildUnder(int, int)>
    //   39  114:astore          33
    //   40  116:aload_0         
    //   41  117:fload           30
    //   42  119:fload           31
    //   43  121:iload           32
    //   44  123:invokespecial   #528 <Method void saveInitialMotion(float, float, int)>
    //   45  126:aload_0         
    //   46  127:aload           33
    //   47  129:iload           32
    //   48  131:invokevirtual   #531 <Method boolean tryCaptureViewForDrag(View, int)>
    //   49  134:pop             
    //   50  135:aload_0         
    //   51  136:getfield        #163 <Field int[] mInitialEdgesTouched>
    //   52  139:iload           32
    //   53  141:iaload          
    //   54  142:istore          35
    //   55  144:iload           35
    //   56  146:aload_0         
    //   57  147:getfield        #165 <Field int mTrackingEdges>
    //   58  150:iand            
    //   59  151:ifeq            84
    //   60  154:aload_0         
    //   61  155:getfield        #102 <Field ViewDragHelper$Callback mCallback>
    //   62  158:iload           35
    //   63  160:aload_0         
    //   64  161:getfield        #165 <Field int mTrackingEdges>
    //   65  164:iand            
    //   66  165:iload           32
    //   67  167:invokevirtual   #534 <Method void ViewDragHelper$Callback.onEdgeTouched(int, int)>
    //   68  170:return          
    //   69  171:aload_1         
    //   70  172:iload_3         
    //   71  173:invokestatic    #371 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //   72  176:istore          24
    //   73  178:aload_1         
    //   74  179:iload_3         
    //   75  180:invokestatic    #375 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //   76  183:fstore          25
    //   77  185:aload_1         
    //   78  186:iload_3         
    //   79  187:invokestatic    #378 <Method float MotionEventCompat.getY(MotionEvent, int)>
    //   80  190:fstore          26
    //   81  192:aload_0         
    //   82  193:fload           25
    //   83  195:fload           26
    //   84  197:iload           24
    //   85  199:invokespecial   #528 <Method void saveInitialMotion(float, float, int)>
    //   86  202:aload_0         
    //   87  203:getfield        #261 <Field int mDragState>
    //   88  206:ifne            262
    //   89  209:aload_0         
    //   90  210:aload_0         
    //   91  211:fload           25
    //   92  213:f2i             
    //   93  214:fload           26
    //   94  216:f2i             
    //   95  217:invokevirtual   #526 <Method View findTopChildUnder(int, int)>
    //   96  220:iload           24
    //   97  222:invokevirtual   #531 <Method boolean tryCaptureViewForDrag(View, int)>
    //   98  225:pop             
    //   99  226:aload_0         
    //  100  227:getfield        #163 <Field int[] mInitialEdgesTouched>
    //  101  230:iload           24
    //  102  232:iaload          
    //  103  233:istore          29
    //  104  235:iload           29
    //  105  237:aload_0         
    //  106  238:getfield        #165 <Field int mTrackingEdges>
    //  107  241:iand            
    //  108  242:ifeq            84
    //  109  245:aload_0         
    //  110  246:getfield        #102 <Field ViewDragHelper$Callback mCallback>
    //  111  249:iload           29
    //  112  251:aload_0         
    //  113  252:getfield        #165 <Field int mTrackingEdges>
    //  114  255:iand            
    //  115  256:iload           24
    //  116  258:invokevirtual   #534 <Method void ViewDragHelper$Callback.onEdgeTouched(int, int)>
    //  117  261:return          
    //  118  262:aload_0         
    //  119  263:fload           25
    //  120  265:f2i             
    //  121  266:fload           26
    //  122  268:f2i             
    //  123  269:invokevirtual   #536 <Method boolean isCapturedViewUnder(int, int)>
    //  124  272:ifeq            84
    //  125  275:aload_0         
    //  126  276:aload_0         
    //  127  277:getfield        #255 <Field View mCapturedView>
    //  128  280:iload           24
    //  129  282:invokevirtual   #531 <Method boolean tryCaptureViewForDrag(View, int)>
    //  130  285:pop             
    //  131  286:return          
    //  132  287:aload_0         
    //  133  288:getfield        #261 <Field int mDragState>
    //  134  291:iconst_1        
    //  135  292:icmpne          385
    //  136  295:aload_1         
    //  137  296:aload_0         
    //  138  297:getfield        #82  <Field int mActivePointerId>
    //  139  300:invokestatic    #539 <Method int MotionEventCompat.findPointerIndex(MotionEvent, int)>
    //  140  303:istore          19
    //  141  305:aload_1         
    //  142  306:iload           19
    //  143  308:invokestatic    #375 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //  144  311:fstore          20
    //  145  313:aload_1         
    //  146  314:iload           19
    //  147  316:invokestatic    #378 <Method float MotionEventCompat.getY(MotionEvent, int)>
    //  148  319:fstore          21
    //  149  321:fload           20
    //  150  323:aload_0         
    //  151  324:getfield        #203 <Field float[] mLastMotionX>
    //  152  327:aload_0         
    //  153  328:getfield        #82  <Field int mActivePointerId>
    //  154  331:faload          
    //  155  332:fsub            
    //  156  333:f2i             
    //  157  334:istore          22
    //  158  336:fload           21
    //  159  338:aload_0         
    //  160  339:getfield        #205 <Field float[] mLastMotionY>
    //  161  342:aload_0         
    //  162  343:getfield        #82  <Field int mActivePointerId>
    //  163  346:faload          
    //  164  347:fsub            
    //  165  348:f2i             
    //  166  349:istore          23
    //  167  351:aload_0         
    //  168  352:iload           22
    //  169  354:aload_0         
    //  170  355:getfield        #255 <Field View mCapturedView>
    //  171  358:invokevirtual   #277 <Method int View.getLeft()>
    //  172  361:iadd            
    //  173  362:iload           23
    //  174  364:aload_0         
    //  175  365:getfield        #255 <Field View mCapturedView>
    //  176  368:invokevirtual   #280 <Method int View.getTop()>
    //  177  371:iadd            
    //  178  372:iload           22
    //  179  374:iload           23
    //  180  376:invokespecial   #541 <Method void dragTo(int, int, int, int)>
    //  181  379:aload_0         
    //  182  380:aload_1         
    //  183  381:invokespecial   #543 <Method void saveLastMotion(MotionEvent)>
    //  184  384:return          
    //  185  385:aload_1         
    //  186  386:invokestatic    #367 <Method int MotionEventCompat.getPointerCount(MotionEvent)>
    //  187  389:istore          11
    //  188  391:iconst_0        
    //  189  392:istore          12
    //  190  394:iload           12
    //  191  396:iload           11
    //  192  398:icmpge          467
    //  193  401:aload_1         
    //  194  402:iload           12
    //  195  404:invokestatic    #371 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  196  407:istore          13
    //  197  409:aload_1         
    //  198  410:iload           12
    //  199  412:invokestatic    #375 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //  200  415:fstore          14
    //  201  417:aload_1         
    //  202  418:iload           12
    //  203  420:invokestatic    #378 <Method float MotionEventCompat.getY(MotionEvent, int)>
    //  204  423:fstore          15
    //  205  425:fload           14
    //  206  427:aload_0         
    //  207  428:getfield        #193 <Field float[] mInitialMotionX>
    //  208  431:iload           13
    //  209  433:faload          
    //  210  434:fsub            
    //  211  435:fstore          16
    //  212  437:fload           15
    //  213  439:aload_0         
    //  214  440:getfield        #201 <Field float[] mInitialMotionY>
    //  215  443:iload           13
    //  216  445:faload          
    //  217  446:fsub            
    //  218  447:fstore          17
    //  219  449:aload_0         
    //  220  450:fload           16
    //  221  452:fload           17
    //  222  454:iload           13
    //  223  456:invokespecial   #545 <Method void reportNewEdgeDrags(float, float, int)>
    //  224  459:aload_0         
    //  225  460:getfield        #261 <Field int mDragState>
    //  226  463:iconst_1        
    //  227  464:icmpne          473
    //  228  467:aload_0         
    //  229  468:aload_1         
    //  230  469:invokespecial   #543 <Method void saveLastMotion(MotionEvent)>
    //  231  472:return          
    //  232  473:aload_0         
    //  233  474:fload           14
    //  234  476:f2i             
    //  235  477:fload           15
    //  236  479:f2i             
    //  237  480:invokevirtual   #526 <Method View findTopChildUnder(int, int)>
    //  238  483:astore          18
    //  239  485:aload_0         
    //  240  486:aload           18
    //  241  488:fload           16
    //  242  490:fload           17
    //  243  492:invokespecial   #547 <Method boolean checkTouchSlop(View, float, float)>
    //  244  495:ifeq            509
    //  245  498:aload_0         
    //  246  499:aload           18
    //  247  501:iload           13
    //  248  503:invokevirtual   #531 <Method boolean tryCaptureViewForDrag(View, int)>
    //  249  506:ifne            467
    //  250  509:iinc            12  1
    //  251  512:goto            394
    //  252  515:aload_1         
    //  253  516:iload_3         
    //  254  517:invokestatic    #371 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  255  520:istore          4
    //  256  522:aload_0         
    //  257  523:getfield        #261 <Field int mDragState>
    //  258  526:iconst_1        
    //  259  527:icmpne          643
    //  260  530:iload           4
    //  261  532:aload_0         
    //  262  533:getfield        #82  <Field int mActivePointerId>
    //  263  536:icmpne          643
    //  264  539:iconst_m1       
    //  265  540:istore          5
    //  266  542:aload_1         
    //  267  543:invokestatic    #367 <Method int MotionEventCompat.getPointerCount(MotionEvent)>
    //  268  546:istore          6
    //  269  548:iconst_0        
    //  270  549:istore          7
    //  271  551:iload           7
    //  272  553:iload           6
    //  273  555:icmpge          633
    //  274  558:aload_1         
    //  275  559:iload           7
    //  276  561:invokestatic    #371 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  277  564:istore          8
    //  278  566:iload           8
    //  279  568:aload_0         
    //  280  569:getfield        #82  <Field int mActivePointerId>
    //  281  572:icmpne          581
    //  282  575:iinc            7  1
    //  283  578:goto            551
    //  284  581:aload_1         
    //  285  582:iload           7
    //  286  584:invokestatic    #375 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //  287  587:fstore          9
    //  288  589:aload_1         
    //  289  590:iload           7
    //  290  592:invokestatic    #378 <Method float MotionEventCompat.getY(MotionEvent, int)>
    //  291  595:fstore          10
    //  292  597:aload_0         
    //  293  598:fload           9
    //  294  600:f2i             
    //  295  601:fload           10
    //  296  603:f2i             
    //  297  604:invokevirtual   #526 <Method View findTopChildUnder(int, int)>
    //  298  607:aload_0         
    //  299  608:getfield        #255 <Field View mCapturedView>
    //  300  611:if_acmpne       575
    //  301  614:aload_0         
    //  302  615:aload_0         
    //  303  616:getfield        #255 <Field View mCapturedView>
    //  304  619:iload           8
    //  305  621:invokevirtual   #531 <Method boolean tryCaptureViewForDrag(View, int)>
    //  306  624:ifeq            575
    //  307  627:aload_0         
    //  308  628:getfield        #82  <Field int mActivePointerId>
    //  309  631:istore          5
    //  310  633:iload           5
    //  311  635:iconst_m1       
    //  312  636:icmpne          643
    //  313  639:aload_0         
    //  314  640:invokespecial   #549 <Method void releaseViewForPointerUp()>
    //  315  643:aload_0         
    //  316  644:iload           4
    //  317  646:invokespecial   #551 <Method void clearMotionHistory(int)>
    //  318  649:return          
    //  319  650:aload_0         
    //  320  651:getfield        #261 <Field int mDragState>
    //  321  654:iconst_1        
    //  322  655:icmpne          662
    //  323  658:aload_0         
    //  324  659:invokespecial   #549 <Method void releaseViewForPointerUp()>
    //  325  662:aload_0         
    //  326  663:invokevirtual   #382 <Method void cancel()>
    //  327  666:return          
    //  328  667:aload_0         
    //  329  668:getfield        #261 <Field int mDragState>
    //  330  671:iconst_1        
    //  331  672:icmpne          681
    //  332  675:aload_0         
    //  333  676:fconst_0        
    //  334  677:fconst_0        
    //  335  678:invokespecial   #346 <Method void dispatchViewReleased(float, float)>
    //  336  681:aload_0         
    //  337  682:invokevirtual   #382 <Method void cancel()>
    //  338  685:return          
    }

    void setDragState(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #261 <Field int mDragState>
    //    2    4:iload_1         
    //    3    5:icmpeq          30
    //    4    8:aload_0         
    //    5    9:iload_1         
    //    6   10:putfield        #261 <Field int mDragState>
    //    7   13:aload_0         
    //    8   14:getfield        #102 <Field ViewDragHelper$Callback mCallback>
    //    9   17:iload_1         
    //   10   18:invokevirtual   #554 <Method void ViewDragHelper$Callback.onViewDragStateChanged(int)>
    //   11   21:iload_1         
    //   12   22:ifne            30
    //   13   25:aload_0         
    //   14   26:aconst_null     
    //   15   27:putfield        #255 <Field View mCapturedView>
    //   16   30:return          
    }

    public void setEdgeTrackingEnabled(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #165 <Field int mTrackingEdges>
    //    3    5:return          
    }

    public void setMinVelocity(float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:putfield        #145 <Field float mMinVelocity>
    //    3    5:return          
    }

    public boolean settleCapturedViewAt(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #253 <Field boolean mReleaseInProgress>
    //    2    4:ifne            18
    //    3    7:new             #481 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc2            #560 <String "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased">
    //    6   14:invokespecial   #484 <Method void IllegalStateException(String)>
    //    7   17:athrow          
    //    8   18:aload_0         
    //    9   19:iload_1         
    //   10   20:iload_2         
    //   11   21:aload_0         
    //   12   22:getfield        #327 <Field VelocityTracker mVelocityTracker>
    //   13   25:aload_0         
    //   14   26:getfield        #82  <Field int mActivePointerId>
    //   15   29:invokestatic    #339 <Method float VelocityTrackerCompat.getXVelocity(VelocityTracker, int)>
    //   16   32:f2i             
    //   17   33:aload_0         
    //   18   34:getfield        #327 <Field VelocityTracker mVelocityTracker>
    //   19   37:aload_0         
    //   20   38:getfield        #82  <Field int mActivePointerId>
    //   21   41:invokestatic    #344 <Method float VelocityTrackerCompat.getYVelocity(VelocityTracker, int)>
    //   22   44:f2i             
    //   23   45:invokespecial   #562 <Method boolean forceSettleCapturedViewAt(int, int, int, int)>
    //   24   48:ireturn         
    }

    public boolean shouldInterceptTouchEvent(MotionEvent motionevent)
    {
    //    0    0:aload_1         
    //    1    1:invokestatic    #508 <Method int MotionEventCompat.getActionMasked(MotionEvent)>
    //    2    4:istore_2        
    //    3    5:aload_1         
    //    4    6:invokestatic    #511 <Method int MotionEventCompat.getActionIndex(MotionEvent)>
    //    5    9:istore_3        
    //    6   10:iload_2         
    //    7   11:ifne            18
    //    8   14:aload_0         
    //    9   15:invokevirtual   #382 <Method void cancel()>
    //   10   18:aload_0         
    //   11   19:getfield        #327 <Field VelocityTracker mVelocityTracker>
    //   12   22:ifnonnull       32
    //   13   25:aload_0         
    //   14   26:invokestatic    #515 <Method VelocityTracker VelocityTracker.obtain()>
    //   15   29:putfield        #327 <Field VelocityTracker mVelocityTracker>
    //   16   32:aload_0         
    //   17   33:getfield        #327 <Field VelocityTracker mVelocityTracker>
    //   18   36:aload_1         
    //   19   37:invokevirtual   #518 <Method void VelocityTracker.addMovement(MotionEvent)>
    //   20   40:iload_2         
    //   21   41:tableswitch     0 6: default 84
    //                   0 94
    //                   1 465
    //                   2 316
    //                   3 465
    //                   4 84
    //                   5 199
    //                   6 453
    //   22   84:aload_0         
    //   23   85:getfield        #261 <Field int mDragState>
    //   24   88:iconst_1        
    //   25   89:icmpne          472
    //   26   92:iconst_1        
    //   27   93:ireturn         
    //   28   94:aload_1         
    //   29   95:invokevirtual   #522 <Method float MotionEvent.getX()>
    //   30   98:fstore          18
    //   31  100:aload_1         
    //   32  101:invokevirtual   #524 <Method float MotionEvent.getY()>
    //   33  104:fstore          19
    //   34  106:aload_1         
    //   35  107:iconst_0        
    //   36  108:invokestatic    #371 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //   37  111:istore          20
    //   38  113:aload_0         
    //   39  114:fload           18
    //   40  116:fload           19
    //   41  118:iload           20
    //   42  120:invokespecial   #528 <Method void saveInitialMotion(float, float, int)>
    //   43  123:aload_0         
    //   44  124:fload           18
    //   45  126:f2i             
    //   46  127:fload           19
    //   47  129:f2i             
    //   48  130:invokevirtual   #526 <Method View findTopChildUnder(int, int)>
    //   49  133:astore          21
    //   50  135:aload           21
    //   51  137:aload_0         
    //   52  138:getfield        #255 <Field View mCapturedView>
    //   53  141:if_acmpne       161
    //   54  144:aload_0         
    //   55  145:getfield        #261 <Field int mDragState>
    //   56  148:iconst_2        
    //   57  149:icmpne          161
    //   58  152:aload_0         
    //   59  153:aload           21
    //   60  155:iload           20
    //   61  157:invokevirtual   #531 <Method boolean tryCaptureViewForDrag(View, int)>
    //   62  160:pop             
    //   63  161:aload_0         
    //   64  162:getfield        #163 <Field int[] mInitialEdgesTouched>
    //   65  165:iload           20
    //   66  167:iaload          
    //   67  168:istore          22
    //   68  170:iload           22
    //   69  172:aload_0         
    //   70  173:getfield        #165 <Field int mTrackingEdges>
    //   71  176:iand            
    //   72  177:ifeq            84
    //   73  180:aload_0         
    //   74  181:getfield        #102 <Field ViewDragHelper$Callback mCallback>
    //   75  184:iload           22
    //   76  186:aload_0         
    //   77  187:getfield        #165 <Field int mTrackingEdges>
    //   78  190:iand            
    //   79  191:iload           20
    //   80  193:invokevirtual   #534 <Method void ViewDragHelper$Callback.onEdgeTouched(int, int)>
    //   81  196:goto            84
    //   82  199:aload_1         
    //   83  200:iload_3         
    //   84  201:invokestatic    #371 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //   85  204:istore          12
    //   86  206:aload_1         
    //   87  207:iload_3         
    //   88  208:invokestatic    #375 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //   89  211:fstore          13
    //   90  213:aload_1         
    //   91  214:iload_3         
    //   92  215:invokestatic    #378 <Method float MotionEventCompat.getY(MotionEvent, int)>
    //   93  218:fstore          14
    //   94  220:aload_0         
    //   95  221:fload           13
    //   96  223:fload           14
    //   97  225:iload           12
    //   98  227:invokespecial   #528 <Method void saveInitialMotion(float, float, int)>
    //   99  230:aload_0         
    //  100  231:getfield        #261 <Field int mDragState>
    //  101  234:ifne            275
    //  102  237:aload_0         
    //  103  238:getfield        #163 <Field int[] mInitialEdgesTouched>
    //  104  241:iload           12
    //  105  243:iaload          
    //  106  244:istore          17
    //  107  246:iload           17
    //  108  248:aload_0         
    //  109  249:getfield        #165 <Field int mTrackingEdges>
    //  110  252:iand            
    //  111  253:ifeq            84
    //  112  256:aload_0         
    //  113  257:getfield        #102 <Field ViewDragHelper$Callback mCallback>
    //  114  260:iload           17
    //  115  262:aload_0         
    //  116  263:getfield        #165 <Field int mTrackingEdges>
    //  117  266:iand            
    //  118  267:iload           12
    //  119  269:invokevirtual   #534 <Method void ViewDragHelper$Callback.onEdgeTouched(int, int)>
    //  120  272:goto            84
    //  121  275:aload_0         
    //  122  276:getfield        #261 <Field int mDragState>
    //  123  279:iconst_2        
    //  124  280:icmpne          84
    //  125  283:aload_0         
    //  126  284:fload           13
    //  127  286:f2i             
    //  128  287:fload           14
    //  129  289:f2i             
    //  130  290:invokevirtual   #526 <Method View findTopChildUnder(int, int)>
    //  131  293:astore          15
    //  132  295:aload           15
    //  133  297:aload_0         
    //  134  298:getfield        #255 <Field View mCapturedView>
    //  135  301:if_acmpne       84
    //  136  304:aload_0         
    //  137  305:aload           15
    //  138  307:iload           12
    //  139  309:invokevirtual   #531 <Method boolean tryCaptureViewForDrag(View, int)>
    //  140  312:pop             
    //  141  313:goto            84
    //  142  316:aload_1         
    //  143  317:invokestatic    #367 <Method int MotionEventCompat.getPointerCount(MotionEvent)>
    //  144  320:istore          4
    //  145  322:iconst_0        
    //  146  323:istore          5
    //  147  325:iload           5
    //  148  327:iload           4
    //  149  329:icmpge          398
    //  150  332:aload_1         
    //  151  333:iload           5
    //  152  335:invokestatic    #371 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  153  338:istore          6
    //  154  340:aload_1         
    //  155  341:iload           5
    //  156  343:invokestatic    #375 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //  157  346:fstore          7
    //  158  348:aload_1         
    //  159  349:iload           5
    //  160  351:invokestatic    #378 <Method float MotionEventCompat.getY(MotionEvent, int)>
    //  161  354:fstore          8
    //  162  356:fload           7
    //  163  358:aload_0         
    //  164  359:getfield        #193 <Field float[] mInitialMotionX>
    //  165  362:iload           6
    //  166  364:faload          
    //  167  365:fsub            
    //  168  366:fstore          9
    //  169  368:fload           8
    //  170  370:aload_0         
    //  171  371:getfield        #201 <Field float[] mInitialMotionY>
    //  172  374:iload           6
    //  173  376:faload          
    //  174  377:fsub            
    //  175  378:fstore          10
    //  176  380:aload_0         
    //  177  381:fload           9
    //  178  383:fload           10
    //  179  385:iload           6
    //  180  387:invokespecial   #545 <Method void reportNewEdgeDrags(float, float, int)>
    //  181  390:aload_0         
    //  182  391:getfield        #261 <Field int mDragState>
    //  183  394:iconst_1        
    //  184  395:icmpne          406
    //  185  398:aload_0         
    //  186  399:aload_1         
    //  187  400:invokespecial   #543 <Method void saveLastMotion(MotionEvent)>
    //  188  403:goto            84
    //  189  406:aload_0         
    //  190  407:fload           7
    //  191  409:f2i             
    //  192  410:fload           8
    //  193  412:f2i             
    //  194  413:invokevirtual   #526 <Method View findTopChildUnder(int, int)>
    //  195  416:astore          11
    //  196  418:aload           11
    //  197  420:ifnull          447
    //  198  423:aload_0         
    //  199  424:aload           11
    //  200  426:fload           9
    //  201  428:fload           10
    //  202  430:invokespecial   #547 <Method boolean checkTouchSlop(View, float, float)>
    //  203  433:ifeq            447
    //  204  436:aload_0         
    //  205  437:aload           11
    //  206  439:iload           6
    //  207  441:invokevirtual   #531 <Method boolean tryCaptureViewForDrag(View, int)>
    //  208  444:ifne            398
    //  209  447:iinc            5  1
    //  210  450:goto            325
    //  211  453:aload_0         
    //  212  454:aload_1         
    //  213  455:iload_3         
    //  214  456:invokestatic    #371 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  215  459:invokespecial   #551 <Method void clearMotionHistory(int)>
    //  216  462:goto            84
    //  217  465:aload_0         
    //  218  466:invokevirtual   #382 <Method void cancel()>
    //  219  469:goto            84
    //  220  472:iconst_0        
    //  221  473:ireturn         
    }

    public boolean smoothSlideViewTo(View view, int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #255 <Field View mCapturedView>
    //    3    5:aload_0         
    //    4    6:iconst_m1       
    //    5    7:putfield        #82  <Field int mActivePointerId>
    //    6   10:aload_0         
    //    7   11:iload_2         
    //    8   12:iload_3         
    //    9   13:iconst_0        
    //   10   14:iconst_0        
    //   11   15:invokespecial   #562 <Method boolean forceSettleCapturedViewAt(int, int, int, int)>
    //   12   18:ireturn         
    }

    boolean tryCaptureViewForDrag(View view, int i)
    {
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #255 <Field View mCapturedView>
    //    3    5:if_acmpne       18
    //    4    8:aload_0         
    //    5    9:getfield        #82  <Field int mActivePointerId>
    //    6   12:iload_2         
    //    7   13:icmpne          18
    //    8   16:iconst_1        
    //    9   17:ireturn         
    //   10   18:aload_1         
    //   11   19:ifnull          47
    //   12   22:aload_0         
    //   13   23:getfield        #102 <Field ViewDragHelper$Callback mCallback>
    //   14   26:aload_1         
    //   15   27:iload_2         
    //   16   28:invokevirtual   #568 <Method boolean ViewDragHelper$Callback.tryCaptureView(View, int)>
    //   17   31:ifeq            47
    //   18   34:aload_0         
    //   19   35:iload_2         
    //   20   36:putfield        #82  <Field int mActivePointerId>
    //   21   39:aload_0         
    //   22   40:aload_1         
    //   23   41:iload_2         
    //   24   42:invokevirtual   #570 <Method void captureChildView(View, int)>
    //   25   45:iconst_1        
    //   26   46:ireturn         
    //   27   47:iconst_0        
    //   28   48:ireturn         
    }

    private static final int BASE_SETTLE_DURATION = 256;
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    private static final int EDGE_SIZE = 20;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "ViewDragHelper";
    private static final Interpolator sInterpolator;
    private int mActivePointerId;
    private final Callback mCallback;
    private View mCapturedView;
    private int mDragState;
    private int mEdgeDragsInProgress[];
    private int mEdgeDragsLocked[];
    private int mEdgeSize;
    private int mInitialEdgesTouched[];
    private float mInitialMotionX[];
    private float mInitialMotionY[];
    private float mLastMotionX[];
    private float mLastMotionY[];
    private float mMaxVelocity;
    private float mMinVelocity;
    private final ViewGroup mParentView;
    private int mPointersDown;
    private boolean mReleaseInProgress;
    private ScrollerCompat mScroller;
    private final Runnable mSetIdleRunnable;
    private int mTouchSlop;
    private int mTrackingEdges;
    private VelocityTracker mVelocityTracker;

    // Unreferenced inner class android/support/v4/widget/ViewDragHelper$1

/* anonymous class */
    static final class _cls1
        implements Interpolator
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #12  <Method void Object()>
        //    2    4:return          
        }

        public float getInterpolation(float f)
        {
        //    0    0:fload_1         
        //    1    1:fconst_1        
        //    2    2:fsub            
        //    3    3:fstore_2        
        //    4    4:fconst_1        
        //    5    5:fload_2         
        //    6    6:fload_2         
        //    7    7:fload_2         
        //    8    8:fload_2         
        //    9    9:fload_2         
        //   10   10:fmul            
        //   11   11:fmul            
        //   12   12:fmul            
        //   13   13:fmul            
        //   14   14:fadd            
        //   15   15:freturn         
        }
    }


    // Unreferenced inner class android/support/v4/widget/ViewDragHelper$2

/* anonymous class */
    class _cls2
        implements Runnable
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ViewDragHelper this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ViewDragHelper this$0>
        //    2    4:iconst_0        
        //    3    5:invokevirtual   #22  <Method void ViewDragHelper.setDragState(int)>
        //    4    8:return          
        }

        final ViewDragHelper this$0;
    }

}
