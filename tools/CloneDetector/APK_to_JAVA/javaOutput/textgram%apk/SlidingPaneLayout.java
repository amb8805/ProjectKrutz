// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.*;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.*;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            ViewDragHelper

public class SlidingPaneLayout extends ViewGroup
{
    class AccessibilityDelegate extends AccessibilityDelegateCompat
    {

        AccessibilityDelegate()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field SlidingPaneLayout this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void AccessibilityDelegateCompat()>
        //    5    9:aload_0         
        //    6   10:new             #17  <Class Rect>
        //    7   13:dup             
        //    8   14:invokespecial   #18  <Method void Rect()>
        //    9   17:putfield        #20  <Field Rect mTmpRect>
        //   10   20:return          
        }

        private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, AccessibilityNodeInfoCompat accessibilitynodeinfocompat1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #20  <Field Rect mTmpRect>
        //    2    4:astore_3        
        //    3    5:aload_2         
        //    4    6:aload_3         
        //    5    7:invokevirtual   #28  <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
        //    6   10:aload_1         
        //    7   11:aload_3         
        //    8   12:invokevirtual   #31  <Method void AccessibilityNodeInfoCompat.setBoundsInParent(Rect)>
        //    9   15:aload_2         
        //   10   16:aload_3         
        //   11   17:invokevirtual   #34  <Method void AccessibilityNodeInfoCompat.getBoundsInScreen(Rect)>
        //   12   20:aload_1         
        //   13   21:aload_3         
        //   14   22:invokevirtual   #37  <Method void AccessibilityNodeInfoCompat.setBoundsInScreen(Rect)>
        //   15   25:aload_1         
        //   16   26:aload_2         
        //   17   27:invokevirtual   #41  <Method boolean AccessibilityNodeInfoCompat.isVisibleToUser()>
        //   18   30:invokevirtual   #45  <Method void AccessibilityNodeInfoCompat.setVisibleToUser(boolean)>
        //   19   33:aload_1         
        //   20   34:aload_2         
        //   21   35:invokevirtual   #49  <Method CharSequence AccessibilityNodeInfoCompat.getPackageName()>
        //   22   38:invokevirtual   #53  <Method void AccessibilityNodeInfoCompat.setPackageName(CharSequence)>
        //   23   41:aload_1         
        //   24   42:aload_2         
        //   25   43:invokevirtual   #56  <Method CharSequence AccessibilityNodeInfoCompat.getClassName()>
        //   26   46:invokevirtual   #59  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
        //   27   49:aload_1         
        //   28   50:aload_2         
        //   29   51:invokevirtual   #62  <Method CharSequence AccessibilityNodeInfoCompat.getContentDescription()>
        //   30   54:invokevirtual   #65  <Method void AccessibilityNodeInfoCompat.setContentDescription(CharSequence)>
        //   31   57:aload_1         
        //   32   58:aload_2         
        //   33   59:invokevirtual   #68  <Method boolean AccessibilityNodeInfoCompat.isEnabled()>
        //   34   62:invokevirtual   #71  <Method void AccessibilityNodeInfoCompat.setEnabled(boolean)>
        //   35   65:aload_1         
        //   36   66:aload_2         
        //   37   67:invokevirtual   #74  <Method boolean AccessibilityNodeInfoCompat.isClickable()>
        //   38   70:invokevirtual   #77  <Method void AccessibilityNodeInfoCompat.setClickable(boolean)>
        //   39   73:aload_1         
        //   40   74:aload_2         
        //   41   75:invokevirtual   #80  <Method boolean AccessibilityNodeInfoCompat.isFocusable()>
        //   42   78:invokevirtual   #83  <Method void AccessibilityNodeInfoCompat.setFocusable(boolean)>
        //   43   81:aload_1         
        //   44   82:aload_2         
        //   45   83:invokevirtual   #86  <Method boolean AccessibilityNodeInfoCompat.isFocused()>
        //   46   86:invokevirtual   #89  <Method void AccessibilityNodeInfoCompat.setFocused(boolean)>
        //   47   89:aload_1         
        //   48   90:aload_2         
        //   49   91:invokevirtual   #92  <Method boolean AccessibilityNodeInfoCompat.isAccessibilityFocused()>
        //   50   94:invokevirtual   #95  <Method void AccessibilityNodeInfoCompat.setAccessibilityFocused(boolean)>
        //   51   97:aload_1         
        //   52   98:aload_2         
        //   53   99:invokevirtual   #98  <Method boolean AccessibilityNodeInfoCompat.isSelected()>
        //   54  102:invokevirtual   #101 <Method void AccessibilityNodeInfoCompat.setSelected(boolean)>
        //   55  105:aload_1         
        //   56  106:aload_2         
        //   57  107:invokevirtual   #104 <Method boolean AccessibilityNodeInfoCompat.isLongClickable()>
        //   58  110:invokevirtual   #107 <Method void AccessibilityNodeInfoCompat.setLongClickable(boolean)>
        //   59  113:aload_1         
        //   60  114:aload_2         
        //   61  115:invokevirtual   #111 <Method int AccessibilityNodeInfoCompat.getActions()>
        //   62  118:invokevirtual   #115 <Method void AccessibilityNodeInfoCompat.addAction(int)>
        //   63  121:aload_1         
        //   64  122:aload_2         
        //   65  123:invokevirtual   #118 <Method int AccessibilityNodeInfoCompat.getMovementGranularities()>
        //   66  126:invokevirtual   #121 <Method void AccessibilityNodeInfoCompat.setMovementGranularities(int)>
        //   67  129:return          
        }

        public boolean filter(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field SlidingPaneLayout this$0>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #128 <Method boolean SlidingPaneLayout.isDimmed(View)>
        //    4    8:ireturn         
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:invokespecial   #132 <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
        //    4    6:aload_2         
        //    5    7:ldc1            #125 <Class SlidingPaneLayout>
        //    6    9:invokevirtual   #138 <Method String Class.getName()>
        //    7   12:invokevirtual   #141 <Method void AccessibilityEvent.setClassName(CharSequence)>
        //    8   15:return          
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
        //    0    0:aload_2         
        //    1    1:invokestatic    #147 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain(AccessibilityNodeInfoCompat)>
        //    2    4:astore_3        
        //    3    5:aload_0         
        //    4    6:aload_1         
        //    5    7:aload_3         
        //    6    8:invokespecial   #149 <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
        //    7   11:aload_0         
        //    8   12:aload_2         
        //    9   13:aload_3         
        //   10   14:invokespecial   #151 <Method void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat, AccessibilityNodeInfoCompat)>
        //   11   17:aload_3         
        //   12   18:invokevirtual   #154 <Method void AccessibilityNodeInfoCompat.recycle()>
        //   13   21:aload_2         
        //   14   22:ldc1            #125 <Class SlidingPaneLayout>
        //   15   24:invokevirtual   #138 <Method String Class.getName()>
        //   16   27:invokevirtual   #59  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
        //   17   30:aload_2         
        //   18   31:aload_1         
        //   19   32:invokevirtual   #158 <Method void AccessibilityNodeInfoCompat.setSource(View)>
        //   20   35:aload_1         
        //   21   36:invokestatic    #164 <Method android.view.ViewParent ViewCompat.getParentForAccessibility(View)>
        //   22   39:astore          4
        //   23   41:aload           4
        //   24   43:instanceof      #166 <Class View>
        //   25   46:ifeq            58
        //   26   49:aload_2         
        //   27   50:aload           4
        //   28   52:checkcast       #166 <Class View>
        //   29   55:invokevirtual   #169 <Method void AccessibilityNodeInfoCompat.setParent(View)>
        //   30   58:aload_0         
        //   31   59:getfield        #12  <Field SlidingPaneLayout this$0>
        //   32   62:invokevirtual   #172 <Method int SlidingPaneLayout.getChildCount()>
        //   33   65:istore          5
        //   34   67:iconst_0        
        //   35   68:istore          6
        //   36   70:iload           6
        //   37   72:iload           5
        //   38   74:icmpge          123
        //   39   77:aload_0         
        //   40   78:getfield        #12  <Field SlidingPaneLayout this$0>
        //   41   81:iload           6
        //   42   83:invokevirtual   #176 <Method View SlidingPaneLayout.getChildAt(int)>
        //   43   86:astore          7
        //   44   88:aload_0         
        //   45   89:aload           7
        //   46   91:invokevirtual   #178 <Method boolean filter(View)>
        //   47   94:ifne            117
        //   48   97:aload           7
        //   49   99:invokevirtual   #181 <Method int View.getVisibility()>
        //   50  102:ifne            117
        //   51  105:aload           7
        //   52  107:iconst_1        
        //   53  108:invokestatic    #185 <Method void ViewCompat.setImportantForAccessibility(View, int)>
        //   54  111:aload_2         
        //   55  112:aload           7
        //   56  114:invokevirtual   #188 <Method void AccessibilityNodeInfoCompat.addChild(View)>
        //   57  117:iinc            6  1
        //   58  120:goto            70
        //   59  123:return          
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:aload_2         
        //    2    2:invokevirtual   #178 <Method boolean filter(View)>
        //    3    5:ifne            16
        //    4    8:aload_0         
        //    5    9:aload_1         
        //    6   10:aload_2         
        //    7   11:aload_3         
        //    8   12:invokespecial   #192 <Method boolean AccessibilityDelegateCompat.onRequestSendAccessibilityEvent(ViewGroup, View, AccessibilityEvent)>
        //    9   15:ireturn         
        //   10   16:iconst_0        
        //   11   17:ireturn         
        }

        private final Rect mTmpRect;
        final SlidingPaneLayout this$0;
    }

    private class DisableLayerRunnable
        implements Runnable
    {

        DisableLayerRunnable(View view)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field SlidingPaneLayout this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #19  <Field View mChildView>
        //    8   14:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field View mChildView>
        //    2    4:invokevirtual   #26  <Method android.view.ViewParent View.getParent()>
        //    3    7:aload_0         
        //    4    8:getfield        #14  <Field SlidingPaneLayout this$0>
        //    5   11:if_acmpne       34
        //    6   14:aload_0         
        //    7   15:getfield        #19  <Field View mChildView>
        //    8   18:iconst_0        
        //    9   19:aconst_null     
        //   10   20:invokestatic    #32  <Method void ViewCompat.setLayerType(View, int, Paint)>
        //   11   23:aload_0         
        //   12   24:getfield        #14  <Field SlidingPaneLayout this$0>
        //   13   27:aload_0         
        //   14   28:getfield        #19  <Field View mChildView>
        //   15   31:invokestatic    #37  <Method void SlidingPaneLayout.access$900(SlidingPaneLayout, View)>
        //   16   34:aload_0         
        //   17   35:getfield        #14  <Field SlidingPaneLayout this$0>
        //   18   38:invokestatic    #41  <Method ArrayList SlidingPaneLayout.access$1000(SlidingPaneLayout)>
        //   19   41:aload_0         
        //   20   42:invokevirtual   #47  <Method boolean ArrayList.remove(Object)>
        //   21   45:pop             
        //   22   46:return          
        }

        final View mChildView;
        final SlidingPaneLayout this$0;
    }

    private class DragHelperCallback extends ViewDragHelper.Callback
    {

        private DragHelperCallback()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #10  <Field SlidingPaneLayout this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #13  <Method void ViewDragHelper$Callback()>
        //    5    9:return          
        }

        DragHelperCallback(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #16  <Method void SlidingPaneLayout$DragHelperCallback(SlidingPaneLayout)>
        //    3    5:return          
        }

        public int clampViewPositionHorizontal(View view, int i, int j)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field SlidingPaneLayout this$0>
        //    2    4:invokestatic    #24  <Method View SlidingPaneLayout.access$400(SlidingPaneLayout)>
        //    3    7:invokevirtual   #30  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
        //    4   10:checkcast       #32  <Class SlidingPaneLayout$LayoutParams>
        //    5   13:astore          4
        //    6   15:aload_0         
        //    7   16:getfield        #10  <Field SlidingPaneLayout this$0>
        //    8   19:invokevirtual   #36  <Method int SlidingPaneLayout.getPaddingLeft()>
        //    9   22:aload           4
        //   10   24:getfield        #40  <Field int SlidingPaneLayout$LayoutParams.leftMargin>
        //   11   27:iadd            
        //   12   28:istore          5
        //   13   30:iload           5
        //   14   32:aload_0         
        //   15   33:getfield        #10  <Field SlidingPaneLayout this$0>
        //   16   36:invokestatic    #44  <Method int SlidingPaneLayout.access$700(SlidingPaneLayout)>
        //   17   39:iadd            
        //   18   40:istore          6
        //   19   42:iload_2         
        //   20   43:iload           5
        //   21   45:invokestatic    #50  <Method int Math.max(int, int)>
        //   22   48:iload           6
        //   23   50:invokestatic    #53  <Method int Math.min(int, int)>
        //   24   53:ireturn         
        }

        public int getViewHorizontalDragRange(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field SlidingPaneLayout this$0>
        //    2    4:invokestatic    #44  <Method int SlidingPaneLayout.access$700(SlidingPaneLayout)>
        //    3    7:ireturn         
        }

        public void onEdgeDragStarted(int i, int j)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field SlidingPaneLayout this$0>
        //    2    4:invokestatic    #61  <Method ViewDragHelper SlidingPaneLayout.access$200(SlidingPaneLayout)>
        //    3    7:aload_0         
        //    4    8:getfield        #10  <Field SlidingPaneLayout this$0>
        //    5   11:invokestatic    #24  <Method View SlidingPaneLayout.access$400(SlidingPaneLayout)>
        //    6   14:iload_2         
        //    7   15:invokevirtual   #67  <Method void ViewDragHelper.captureChildView(View, int)>
        //    8   18:return          
        }

        public void onViewCaptured(View view, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field SlidingPaneLayout this$0>
        //    2    4:invokevirtual   #71  <Method void SlidingPaneLayout.setAllChildrenVisible()>
        //    3    7:return          
        }

        public void onViewDragStateChanged(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field SlidingPaneLayout this$0>
        //    2    4:invokestatic    #61  <Method ViewDragHelper SlidingPaneLayout.access$200(SlidingPaneLayout)>
        //    3    7:invokevirtual   #76  <Method int ViewDragHelper.getViewDragState()>
        //    4   10:ifne            62
        //    5   13:aload_0         
        //    6   14:getfield        #10  <Field SlidingPaneLayout this$0>
        //    7   17:invokestatic    #80  <Method float SlidingPaneLayout.access$300(SlidingPaneLayout)>
        //    8   20:fconst_0        
        //    9   21:fcmpl           
        //   10   22:ifne            63
        //   11   25:aload_0         
        //   12   26:getfield        #10  <Field SlidingPaneLayout this$0>
        //   13   29:aload_0         
        //   14   30:getfield        #10  <Field SlidingPaneLayout this$0>
        //   15   33:invokestatic    #24  <Method View SlidingPaneLayout.access$400(SlidingPaneLayout)>
        //   16   36:invokevirtual   #84  <Method void SlidingPaneLayout.updateObscuredViewsVisibility(View)>
        //   17   39:aload_0         
        //   18   40:getfield        #10  <Field SlidingPaneLayout this$0>
        //   19   43:aload_0         
        //   20   44:getfield        #10  <Field SlidingPaneLayout this$0>
        //   21   47:invokestatic    #24  <Method View SlidingPaneLayout.access$400(SlidingPaneLayout)>
        //   22   50:invokevirtual   #87  <Method void SlidingPaneLayout.dispatchOnPanelClosed(View)>
        //   23   53:aload_0         
        //   24   54:getfield        #10  <Field SlidingPaneLayout this$0>
        //   25   57:iconst_0        
        //   26   58:invokestatic    #91  <Method boolean SlidingPaneLayout.access$502(SlidingPaneLayout, boolean)>
        //   27   61:pop             
        //   28   62:return          
        //   29   63:aload_0         
        //   30   64:getfield        #10  <Field SlidingPaneLayout this$0>
        //   31   67:aload_0         
        //   32   68:getfield        #10  <Field SlidingPaneLayout this$0>
        //   33   71:invokestatic    #24  <Method View SlidingPaneLayout.access$400(SlidingPaneLayout)>
        //   34   74:invokevirtual   #94  <Method void SlidingPaneLayout.dispatchOnPanelOpened(View)>
        //   35   77:aload_0         
        //   36   78:getfield        #10  <Field SlidingPaneLayout this$0>
        //   37   81:iconst_1        
        //   38   82:invokestatic    #91  <Method boolean SlidingPaneLayout.access$502(SlidingPaneLayout, boolean)>
        //   39   85:pop             
        //   40   86:return          
        }

        public void onViewPositionChanged(View view, int i, int j, int k, int l)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field SlidingPaneLayout this$0>
        //    2    4:iload_2         
        //    3    5:invokestatic    #100 <Method void SlidingPaneLayout.access$600(SlidingPaneLayout, int)>
        //    4    8:aload_0         
        //    5    9:getfield        #10  <Field SlidingPaneLayout this$0>
        //    6   12:invokevirtual   #103 <Method void SlidingPaneLayout.invalidate()>
        //    7   15:return          
        }

        public void onViewReleased(View view, float f, float f1)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #30  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
        //    2    4:checkcast       #32  <Class SlidingPaneLayout$LayoutParams>
        //    3    7:astore          4
        //    4    9:aload_0         
        //    5   10:getfield        #10  <Field SlidingPaneLayout this$0>
        //    6   13:invokevirtual   #36  <Method int SlidingPaneLayout.getPaddingLeft()>
        //    7   16:aload           4
        //    8   18:getfield        #40  <Field int SlidingPaneLayout$LayoutParams.leftMargin>
        //    9   21:iadd            
        //   10   22:istore          5
        //   11   24:fload_2         
        //   12   25:fconst_0        
        //   13   26:fcmpl           
        //   14   27:ifgt            49
        //   15   30:fload_2         
        //   16   31:fconst_0        
        //   17   32:fcmpl           
        //   18   33:ifne            61
        //   19   36:aload_0         
        //   20   37:getfield        #10  <Field SlidingPaneLayout this$0>
        //   21   40:invokestatic    #80  <Method float SlidingPaneLayout.access$300(SlidingPaneLayout)>
        //   22   43:ldc1            #106 <Float 0.5F>
        //   23   45:fcmpl           
        //   24   46:ifle            61
        //   25   49:iload           5
        //   26   51:aload_0         
        //   27   52:getfield        #10  <Field SlidingPaneLayout this$0>
        //   28   55:invokestatic    #44  <Method int SlidingPaneLayout.access$700(SlidingPaneLayout)>
        //   29   58:iadd            
        //   30   59:istore          5
        //   31   61:aload_0         
        //   32   62:getfield        #10  <Field SlidingPaneLayout this$0>
        //   33   65:invokestatic    #61  <Method ViewDragHelper SlidingPaneLayout.access$200(SlidingPaneLayout)>
        //   34   68:iload           5
        //   35   70:aload_1         
        //   36   71:invokevirtual   #109 <Method int View.getTop()>
        //   37   74:invokevirtual   #113 <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
        //   38   77:pop             
        //   39   78:aload_0         
        //   40   79:getfield        #10  <Field SlidingPaneLayout this$0>
        //   41   82:invokevirtual   #103 <Method void SlidingPaneLayout.invalidate()>
        //   42   85:return          
        }

        public boolean tryCaptureView(View view, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field SlidingPaneLayout this$0>
        //    2    4:invokestatic    #119 <Method boolean SlidingPaneLayout.access$100(SlidingPaneLayout)>
        //    3    7:ifeq            12
        //    4   10:iconst_0        
        //    5   11:ireturn         
        //    6   12:aload_1         
        //    7   13:invokevirtual   #30  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
        //    8   16:checkcast       #32  <Class SlidingPaneLayout$LayoutParams>
        //    9   19:getfield        #123 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
        //   10   22:ireturn         
        }

        final SlidingPaneLayout this$0;
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        static 
        {
        //    0    0:iconst_1        
        //    1    1:newarray        int[]
        //    2    3:dup             
        //    3    4:iconst_0        
        //    4    5:ldc1            #16  <Int 0x1010181>
        //    5    7:iastore         
        //    6    8:putstatic       #18  <Field int[] ATTRS>
        //    7   11:return          
        }

        public LayoutParams()
        {
        //    0    0:aload_0         
        //    1    1:iconst_m1       
        //    2    2:iconst_m1       
        //    3    3:invokespecial   #22  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
        //    4    6:aload_0         
        //    5    7:fconst_0        
        //    6    8:putfield        #24  <Field float weight>
        //    7   11:return          
        }

        public LayoutParams(int i, int j)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #22  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
        //    4    6:aload_0         
        //    5    7:fconst_0        
        //    6    8:putfield        #24  <Field float weight>
        //    7   11:return          
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:invokespecial   #27  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
        //    4    6:aload_0         
        //    5    7:fconst_0        
        //    6    8:putfield        #24  <Field float weight>
        //    7   11:aload_1         
        //    8   12:aload_2         
        //    9   13:getstatic       #18  <Field int[] ATTRS>
        //   10   16:invokevirtual   #33  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
        //   11   19:astore_3        
        //   12   20:aload_0         
        //   13   21:aload_3         
        //   14   22:iconst_0        
        //   15   23:fconst_0        
        //   16   24:invokevirtual   #39  <Method float TypedArray.getFloat(int, float)>
        //   17   27:putfield        #24  <Field float weight>
        //   18   30:aload_3         
        //   19   31:invokevirtual   #42  <Method void TypedArray.recycle()>
        //   20   34:return          
        }

        public LayoutParams(LayoutParams layoutparams)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #46  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
        //    3    5:aload_0         
        //    4    6:fconst_0        
        //    5    7:putfield        #24  <Field float weight>
        //    6   10:aload_0         
        //    7   11:aload_1         
        //    8   12:getfield        #24  <Field float weight>
        //    9   15:putfield        #24  <Field float weight>
        //   10   18:return          
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #49  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
        //    3    5:aload_0         
        //    4    6:fconst_0        
        //    5    7:putfield        #24  <Field float weight>
        //    6   10:return          
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #46  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
        //    3    5:aload_0         
        //    4    6:fconst_0        
        //    5    7:putfield        #24  <Field float weight>
        //    6   10:return          
        }

        private static final int ATTRS[];
        Paint dimPaint;
        boolean dimWhenOffset;
        boolean slideable;
        public float weight;
    }

    public static interface PanelSlideListener
    {

        public abstract void onPanelClosed(View view);

        public abstract void onPanelOpened(View view);

        public abstract void onPanelSlide(View view, float f);
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        static 
        {
        //    0    0:new             #13  <Class SlidingPaneLayout$SavedState$1>
        //    1    3:dup             
        //    2    4:invokespecial   #16  <Method void SlidingPaneLayout$SavedState$1()>
        //    3    7:putstatic       #18  <Field android.os.Parcelable$Creator CREATOR>
        //    4   10:return          
        }

        private SavedState(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #21  <Method void android.view.View$BaseSavedState(Parcel)>
        //    3    5:aload_1         
        //    4    6:invokevirtual   #27  <Method int Parcel.readInt()>
        //    5    9:ifeq            20
        //    6   12:iconst_1        
        //    7   13:istore_2        
        //    8   14:aload_0         
        //    9   15:iload_2         
        //   10   16:putfield        #29  <Field boolean isOpen>
        //   11   19:return          
        //   12   20:iconst_0        
        //   13   21:istore_2        
        //   14   22:goto            14
        }

        SavedState(Parcel parcel, _cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #31  <Method void SlidingPaneLayout$SavedState(Parcel)>
        //    3    5:return          
        }

        SavedState(Parcelable parcelable)
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
        //    4    6:aload_0         
        //    5    7:getfield        #29  <Field boolean isOpen>
        //    6   10:ifeq            21
        //    7   13:iconst_1        
        //    8   14:istore_3        
        //    9   15:aload_1         
        //   10   16:iload_3         
        //   11   17:invokevirtual   #42  <Method void Parcel.writeInt(int)>
        //   12   20:return          
        //   13   21:iconst_0        
        //   14   22:istore_3        
        //   15   23:goto            15
        }

        public static final android.os.Parcelable.Creator CREATOR;
        boolean isOpen;
    }

    public static class SimplePanelSlideListener
        implements PanelSlideListener
    {

        public SimplePanelSlideListener()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public void onPanelClosed(View view)
        {
        //    0    0:return          
        }

        public void onPanelOpened(View view)
        {
        //    0    0:return          
        }

        public void onPanelSlide(View view, float f)
        {
        //    0    0:return          
        }
    }

    static interface SlidingPanelLayoutImpl
    {

        public abstract void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view);
    }

    static class SlidingPanelLayoutImplBase
        implements SlidingPanelLayoutImpl
    {

        SlidingPanelLayoutImplBase()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokevirtual   #18  <Method int View.getLeft()>
        //    3    5:aload_2         
        //    4    6:invokevirtual   #21  <Method int View.getTop()>
        //    5    9:aload_2         
        //    6   10:invokevirtual   #24  <Method int View.getRight()>
        //    7   13:aload_2         
        //    8   14:invokevirtual   #27  <Method int View.getBottom()>
        //    9   17:invokestatic    #33  <Method void ViewCompat.postInvalidateOnAnimation(View, int, int, int, int)>
        //   10   20:return          
        }
    }

    static class SlidingPanelLayoutImplJB extends SlidingPanelLayoutImplBase
    {

        SlidingPanelLayoutImplJB()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #16  <Method void SlidingPaneLayout$SlidingPanelLayoutImplBase()>
        // try 4 19 handler(s) 39
        //    2    4:aload_0         
        //    3    5:ldc1            #18  <Class View>
        //    4    7:ldc1            #20  <String "getDisplayList">
        //    5    9:aconst_null     
        //    6   10:checkcast       #22  <Class Class[]>
        //    7   13:invokevirtual   #28  <Method Method Class.getDeclaredMethod(String, Class[])>
        //    8   16:putfield        #30  <Field Method mGetDisplayList>
        // try 19 38 handler(s) 52
        //    9   19:aload_0         
        //   10   20:ldc1            #18  <Class View>
        //   11   22:ldc1            #31  <String "mRecreateDisplayList">
        //   12   24:invokevirtual   #35  <Method Field Class.getDeclaredField(String)>
        //   13   27:putfield        #37  <Field Field mRecreateDisplayList>
        //   14   30:aload_0         
        //   15   31:getfield        #37  <Field Field mRecreateDisplayList>
        //   16   34:iconst_1        
        //   17   35:invokevirtual   #43  <Method void Field.setAccessible(boolean)>
        //   18   38:return          
        // catch NoSuchMethodException
        //   19   39:astore_1        
        //   20   40:ldc1            #45  <String "SlidingPaneLayout">
        //   21   42:ldc1            #47  <String "Couldn't fetch getDisplayList method; dimming won't work right.">
        //   22   44:aload_1         
        //   23   45:invokestatic    #53  <Method int Log.e(String, String, Throwable)>
        //   24   48:pop             
        //   25   49:goto            19
        // catch NoSuchFieldException
        //   26   52:astore_3        
        //   27   53:ldc1            #45  <String "SlidingPaneLayout">
        //   28   55:ldc1            #55  <String "Couldn't fetch mRecreateDisplayList field; dimming will be slow.">
        //   29   57:aload_3         
        //   30   58:invokestatic    #53  <Method int Log.e(String, String, Throwable)>
        //   31   61:pop             
        //   32   62:return          
        }

        public void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #30  <Field Method mGetDisplayList>
        //    2    4:ifnull          56
        //    3    7:aload_0         
        //    4    8:getfield        #37  <Field Field mRecreateDisplayList>
        //    5   11:ifnull          56
        // try 14 36 handler(s) 43
        //    6   14:aload_0         
        //    7   15:getfield        #37  <Field Field mRecreateDisplayList>
        //    8   18:aload_2         
        //    9   19:iconst_1        
        //   10   20:invokevirtual   #63  <Method void Field.setBoolean(Object, boolean)>
        //   11   23:aload_0         
        //   12   24:getfield        #30  <Field Method mGetDisplayList>
        //   13   27:aload_2         
        //   14   28:aconst_null     
        //   15   29:checkcast       #65  <Class Object[]>
        //   16   32:invokevirtual   #71  <Method Object Method.invoke(Object, Object[])>
        //   17   35:pop             
        //   18   36:aload_0         
        //   19   37:aload_1         
        //   20   38:aload_2         
        //   21   39:invokespecial   #73  <Method void SlidingPaneLayout$SlidingPanelLayoutImplBase.invalidateChildRegion(SlidingPaneLayout, View)>
        //   22   42:return          
        // catch Exception
        //   23   43:astore_3        
        //   24   44:ldc1            #45  <String "SlidingPaneLayout">
        //   25   46:ldc1            #75  <String "Error refreshing display list state">
        //   26   48:aload_3         
        //   27   49:invokestatic    #53  <Method int Log.e(String, String, Throwable)>
        //   28   52:pop             
        //   29   53:goto            36
        //   30   56:aload_2         
        //   31   57:invokevirtual   #78  <Method void View.invalidate()>
        //   32   60:return          
        }

        private Method mGetDisplayList;
        private Field mRecreateDisplayList;
    }

    static class SlidingPanelLayoutImplJBMR1 extends SlidingPanelLayoutImplBase
    {

        SlidingPanelLayoutImplJBMR1()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void SlidingPaneLayout$SlidingPanelLayoutImplBase()>
        //    2    4:return          
        }

        public void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view)
        {
        //    0    0:aload_2         
        //    1    1:aload_2         
        //    2    2:invokevirtual   #16  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
        //    3    5:checkcast       #18  <Class SlidingPaneLayout$LayoutParams>
        //    4    8:getfield        #22  <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
        //    5   11:invokestatic    #28  <Method void ViewCompat.setLayerPaint(View, Paint)>
        //    6   14:return          
        }
    }


    static 
    {
    //    0    0:getstatic       #52  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:istore_0        
    //    2    4:iload_0         
    //    3    5:bipush          17
    //    4    7:icmplt          21
    //    5   10:new             #54  <Class SlidingPaneLayout$SlidingPanelLayoutImplJBMR1>
    //    6   13:dup             
    //    7   14:invokespecial   #57  <Method void SlidingPaneLayout$SlidingPanelLayoutImplJBMR1()>
    //    8   17:putstatic       #59  <Field SlidingPaneLayout$SlidingPanelLayoutImpl IMPL>
    //    9   20:return          
    //   10   21:iload_0         
    //   11   22:bipush          16
    //   12   24:icmplt          38
    //   13   27:new             #61  <Class SlidingPaneLayout$SlidingPanelLayoutImplJB>
    //   14   30:dup             
    //   15   31:invokespecial   #62  <Method void SlidingPaneLayout$SlidingPanelLayoutImplJB()>
    //   16   34:putstatic       #59  <Field SlidingPaneLayout$SlidingPanelLayoutImpl IMPL>
    //   17   37:return          
    //   18   38:new             #64  <Class SlidingPaneLayout$SlidingPanelLayoutImplBase>
    //   19   41:dup             
    //   20   42:invokespecial   #65  <Method void SlidingPaneLayout$SlidingPanelLayoutImplBase()>
    //   21   45:putstatic       #59  <Field SlidingPaneLayout$SlidingPanelLayoutImpl IMPL>
    //   22   48:return          
    }

    public SlidingPaneLayout(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #69  <Method void SlidingPaneLayout(Context, AttributeSet)>
    //    4    6:return          
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iconst_0        
    //    4    4:invokespecial   #72  <Method void SlidingPaneLayout(Context, AttributeSet, int)>
    //    5    7:return          
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #73  <Method void ViewGroup(Context, AttributeSet, int)>
    //    5    7:aload_0         
    //    6    8:ldc1            #7   <Int 0xcccccccc>
    //    7   10:putfield        #75  <Field int mSliderFadeColor>
    //    8   13:aload_0         
    //    9   14:iconst_1        
    //   10   15:putfield        #77  <Field boolean mFirstLayout>
    //   11   18:aload_0         
    //   12   19:new             #79  <Class Rect>
    //   13   22:dup             
    //   14   23:invokespecial   #80  <Method void Rect()>
    //   15   26:putfield        #82  <Field Rect mTmpRect>
    //   16   29:aload_0         
    //   17   30:new             #84  <Class ArrayList>
    //   18   33:dup             
    //   19   34:invokespecial   #85  <Method void ArrayList()>
    //   20   37:putfield        #87  <Field ArrayList mPostedRunnables>
    //   21   40:aload_1         
    //   22   41:invokevirtual   #93  <Method Resources Context.getResources()>
    //   23   44:invokevirtual   #99  <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   24   47:getfield        #104 <Field float DisplayMetrics.density>
    //   25   50:fstore          4
    //   26   52:aload_0         
    //   27   53:ldc1            #105 <Float 0.5F>
    //   28   55:ldc1            #106 <Float 32F>
    //   29   57:fload           4
    //   30   59:fmul            
    //   31   60:fadd            
    //   32   61:f2i             
    //   33   62:putfield        #108 <Field int mOverhangSize>
    //   34   65:aload_1         
    //   35   66:invokestatic    #114 <Method ViewConfiguration ViewConfiguration.get(Context)>
    //   36   69:pop             
    //   37   70:aload_0         
    //   38   71:iconst_0        
    //   39   72:invokevirtual   #118 <Method void setWillNotDraw(boolean)>
    //   40   75:aload_0         
    //   41   76:new             #120 <Class SlidingPaneLayout$AccessibilityDelegate>
    //   42   79:dup             
    //   43   80:aload_0         
    //   44   81:invokespecial   #123 <Method void SlidingPaneLayout$AccessibilityDelegate(SlidingPaneLayout)>
    //   45   84:invokestatic    #129 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
    //   46   87:aload_0         
    //   47   88:iconst_1        
    //   48   89:invokestatic    #133 <Method void ViewCompat.setImportantForAccessibility(View, int)>
    //   49   92:aload_0         
    //   50   93:aload_0         
    //   51   94:ldc1            #105 <Float 0.5F>
    //   52   96:new             #135 <Class SlidingPaneLayout$DragHelperCallback>
    //   53   99:dup             
    //   54  100:aload_0         
    //   55  101:aconst_null     
    //   56  102:invokespecial   #138 <Method void SlidingPaneLayout$DragHelperCallback(SlidingPaneLayout, SlidingPaneLayout$1)>
    //   57  105:invokestatic    #144 <Method ViewDragHelper ViewDragHelper.create(ViewGroup, float, ViewDragHelper$Callback)>
    //   58  108:putfield        #146 <Field ViewDragHelper mDragHelper>
    //   59  111:aload_0         
    //   60  112:getfield        #146 <Field ViewDragHelper mDragHelper>
    //   61  115:iconst_1        
    //   62  116:invokevirtual   #150 <Method void ViewDragHelper.setEdgeTrackingEnabled(int)>
    //   63  119:aload_0         
    //   64  120:getfield        #146 <Field ViewDragHelper mDragHelper>
    //   65  123:ldc1            #151 <Float 400F>
    //   66  125:fload           4
    //   67  127:fmul            
    //   68  128:invokevirtual   #155 <Method void ViewDragHelper.setMinVelocity(float)>
    //   69  131:return          
    }

    static boolean access$100(SlidingPaneLayout slidingpanelayout)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #159 <Field boolean mIsUnableToDrag>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #159 <Field boolean mIsUnableToDrag>
    //    5    4:ireturn         
    }

    static ArrayList access$1000(SlidingPaneLayout slidingpanelayout)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #87  <Field ArrayList mPostedRunnables>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #87  <Field ArrayList mPostedRunnables>
    //    5    4:areturn         
    }

    static ViewDragHelper access$200(SlidingPaneLayout slidingpanelayout)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #146 <Field ViewDragHelper mDragHelper>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #146 <Field ViewDragHelper mDragHelper>
    //    5    4:areturn         
    }

    static float access$300(SlidingPaneLayout slidingpanelayout)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #167 <Field float mSlideOffset>
    //    2    4:freturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #167 <Field float mSlideOffset>
    //    5    4:freturn         
    }

    static View access$400(SlidingPaneLayout slidingpanelayout)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #171 <Field View mSlideableView>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #171 <Field View mSlideableView>
    //    5    4:areturn         
    }

    static boolean access$502(SlidingPaneLayout slidingpanelayout, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #175 <Field boolean mPreservedOpenState>
    //    3    5:iload_1         
    //    4    6:ireturn         
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:iload_1         
    //    7    2:putfield        #175 <Field boolean mPreservedOpenState>
    //    8    5:iload_1         
    //    9    6:ireturn         
    }

    static void access$600(SlidingPaneLayout slidingpanelayout, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #180 <Method void onPanelDragged(int)>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:iload_1         
    //    6    2:invokespecial   #180 <Method void onPanelDragged(int)>
    //    7    5:return          
    }

    static int access$700(SlidingPaneLayout slidingpanelayout)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #184 <Field int mSlideRange>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #184 <Field int mSlideRange>
    //    5    4:ireturn         
    }

    static void access$900(SlidingPaneLayout slidingpanelayout, View view)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #190 <Method void invalidateChildRegion(View)>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:aload_1         
    //    6    2:invokespecial   #190 <Method void invalidateChildRegion(View)>
    //    7    5:return          
    }

    private boolean closePane(View view, int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #77  <Field boolean mFirstLayout>
    //    2    4:ifne            22
    //    3    7:aload_0         
    //    4    8:fconst_0        
    //    5    9:iload_2         
    //    6   10:invokevirtual   #196 <Method boolean smoothSlideTo(float, int)>
    //    7   13:istore          4
    //    8   15:iconst_0        
    //    9   16:istore_3        
    //   10   17:iload           4
    //   11   19:ifeq            29
    //   12   22:aload_0         
    //   13   23:iconst_0        
    //   14   24:putfield        #175 <Field boolean mPreservedOpenState>
    //   15   27:iconst_1        
    //   16   28:istore_3        
    //   17   29:iload_3         
    //   18   30:ireturn         
    }

    private void dimChildView(View view, float f, int i)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #204 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //    2    4:checkcast       #206 <Class SlidingPaneLayout$LayoutParams>
    //    3    7:astore          4
    //    4    9:fload_2         
    //    5   10:fconst_0        
    //    6   11:fcmpl           
    //    7   12:ifle            105
    //    8   15:iload_3         
    //    9   16:ifeq            105
    //   10   19:fload_2         
    //   11   20:ldc1            #207 <Int 0xff000000>
    //   12   22:iload_3         
    //   13   23:iand            
    //   14   24:bipush          24
    //   15   26:iushr           
    //   16   27:i2f             
    //   17   28:fmul            
    //   18   29:f2i             
    //   19   30:bipush          24
    //   20   32:ishl            
    //   21   33:ldc1            #208 <Int 0xffffff>
    //   22   35:iload_3         
    //   23   36:iand            
    //   24   37:ior             
    //   25   38:istore          8
    //   26   40:aload           4
    //   27   42:getfield        #212 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
    //   28   45:ifnonnull       60
    //   29   48:aload           4
    //   30   50:new             #214 <Class Paint>
    //   31   53:dup             
    //   32   54:invokespecial   #215 <Method void Paint()>
    //   33   57:putfield        #212 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
    //   34   60:aload           4
    //   35   62:getfield        #212 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
    //   36   65:new             #217 <Class PorterDuffColorFilter>
    //   37   68:dup             
    //   38   69:iload           8
    //   39   71:getstatic       #223 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_OVER>
    //   40   74:invokespecial   #226 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
    //   41   77:invokevirtual   #230 <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
    //   42   80:pop             
    //   43   81:aload_1         
    //   44   82:invokestatic    #234 <Method int ViewCompat.getLayerType(View)>
    //   45   85:iconst_2        
    //   46   86:icmpeq          99
    //   47   89:aload_1         
    //   48   90:iconst_2        
    //   49   91:aload           4
    //   50   93:getfield        #212 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
    //   51   96:invokestatic    #238 <Method void ViewCompat.setLayerType(View, int, Paint)>
    //   52   99:aload_0         
    //   53  100:aload_1         
    //   54  101:invokespecial   #190 <Method void invalidateChildRegion(View)>
    //   55  104:return          
    //   56  105:aload_1         
    //   57  106:invokestatic    #234 <Method int ViewCompat.getLayerType(View)>
    //   58  109:ifeq            104
    //   59  112:aload           4
    //   60  114:getfield        #212 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
    //   61  117:ifnull          130
    //   62  120:aload           4
    //   63  122:getfield        #212 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
    //   64  125:aconst_null     
    //   65  126:invokevirtual   #230 <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
    //   66  129:pop             
    //   67  130:new             #240 <Class SlidingPaneLayout$DisableLayerRunnable>
    //   68  133:dup             
    //   69  134:aload_0         
    //   70  135:aload_1         
    //   71  136:invokespecial   #242 <Method void SlidingPaneLayout$DisableLayerRunnable(SlidingPaneLayout, View)>
    //   72  139:astore          5
    //   73  141:aload_0         
    //   74  142:getfield        #87  <Field ArrayList mPostedRunnables>
    //   75  145:aload           5
    //   76  147:invokevirtual   #246 <Method boolean ArrayList.add(Object)>
    //   77  150:pop             
    //   78  151:aload_0         
    //   79  152:aload           5
    //   80  154:invokestatic    #250 <Method void ViewCompat.postOnAnimation(View, Runnable)>
    //   81  157:return          
    }

    private void invalidateChildRegion(View view)
    {
    //    0    0:getstatic       #59  <Field SlidingPaneLayout$SlidingPanelLayoutImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:invokeinterface #254 <Method void SlidingPaneLayout$SlidingPanelLayoutImpl.invalidateChildRegion(SlidingPaneLayout, View)>
    //    4   10:return          
    }

    private void onPanelDragged(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #171 <Field View mSlideableView>
    //    2    4:invokevirtual   #204 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //    3    7:checkcast       #206 <Class SlidingPaneLayout$LayoutParams>
    //    4   10:astore_2        
    //    5   11:aload_0         
    //    6   12:iload_1         
    //    7   13:aload_0         
    //    8   14:invokevirtual   #258 <Method int getPaddingLeft()>
    //    9   17:aload_2         
    //   10   18:getfield        #261 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
    //   11   21:iadd            
    //   12   22:isub            
    //   13   23:i2f             
    //   14   24:aload_0         
    //   15   25:getfield        #184 <Field int mSlideRange>
    //   16   28:i2f             
    //   17   29:fdiv            
    //   18   30:putfield        #167 <Field float mSlideOffset>
    //   19   33:aload_0         
    //   20   34:getfield        #263 <Field int mParallaxBy>
    //   21   37:ifeq            48
    //   22   40:aload_0         
    //   23   41:aload_0         
    //   24   42:getfield        #167 <Field float mSlideOffset>
    //   25   45:invokespecial   #266 <Method void parallaxOtherViews(float)>
    //   26   48:aload_2         
    //   27   49:getfield        #269 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
    //   28   52:ifeq            71
    //   29   55:aload_0         
    //   30   56:aload_0         
    //   31   57:getfield        #171 <Field View mSlideableView>
    //   32   60:aload_0         
    //   33   61:getfield        #167 <Field float mSlideOffset>
    //   34   64:aload_0         
    //   35   65:getfield        #75  <Field int mSliderFadeColor>
    //   36   68:invokespecial   #271 <Method void dimChildView(View, float, int)>
    //   37   71:aload_0         
    //   38   72:aload_0         
    //   39   73:getfield        #171 <Field View mSlideableView>
    //   40   76:invokevirtual   #274 <Method void dispatchOnPanelSlide(View)>
    //   41   79:return          
    }

    private boolean openPane(View view, int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #77  <Field boolean mFirstLayout>
    //    2    4:ifne            16
    //    3    7:aload_0         
    //    4    8:fconst_1        
    //    5    9:iload_2         
    //    6   10:invokevirtual   #196 <Method boolean smoothSlideTo(float, int)>
    //    7   13:ifeq            23
    //    8   16:aload_0         
    //    9   17:iconst_1        
    //   10   18:putfield        #175 <Field boolean mPreservedOpenState>
    //   11   21:iconst_1        
    //   12   22:ireturn         
    //   13   23:iconst_0        
    //   14   24:ireturn         
    }

    private void parallaxOtherViews(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #171 <Field View mSlideableView>
    //    2    4:invokevirtual   #204 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //    3    7:checkcast       #206 <Class SlidingPaneLayout$LayoutParams>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:getfield        #269 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
    //    7   15:ifeq            66
    //    8   18:aload_2         
    //    9   19:getfield        #261 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
    //   10   22:ifgt            66
    //   11   25:iconst_1        
    //   12   26:istore_3        
    //   13   27:aload_0         
    //   14   28:invokevirtual   #278 <Method int getChildCount()>
    //   15   31:istore          4
    //   16   33:iconst_0        
    //   17   34:istore          5
    //   18   36:iload           5
    //   19   38:iload           4
    //   20   40:icmpge          132
    //   21   43:aload_0         
    //   22   44:iload           5
    //   23   46:invokevirtual   #282 <Method View getChildAt(int)>
    //   24   49:astore          6
    //   25   51:aload           6
    //   26   53:aload_0         
    //   27   54:getfield        #171 <Field View mSlideableView>
    //   28   57:if_acmpne       71
    //   29   60:iinc            5  1
    //   30   63:goto            36
    //   31   66:iconst_0        
    //   32   67:istore_3        
    //   33   68:goto            27
    //   34   71:fconst_1        
    //   35   72:aload_0         
    //   36   73:getfield        #284 <Field float mParallaxOffset>
    //   37   76:fsub            
    //   38   77:aload_0         
    //   39   78:getfield        #263 <Field int mParallaxBy>
    //   40   81:i2f             
    //   41   82:fmul            
    //   42   83:f2i             
    //   43   84:istore          7
    //   44   86:aload_0         
    //   45   87:fload_1         
    //   46   88:putfield        #284 <Field float mParallaxOffset>
    //   47   91:aload           6
    //   48   93:iload           7
    //   49   95:fconst_1        
    //   50   96:fload_1         
    //   51   97:fsub            
    //   52   98:aload_0         
    //   53   99:getfield        #263 <Field int mParallaxBy>
    //   54  102:i2f             
    //   55  103:fmul            
    //   56  104:f2i             
    //   57  105:isub            
    //   58  106:invokevirtual   #287 <Method void View.offsetLeftAndRight(int)>
    //   59  109:iload_3         
    //   60  110:ifeq            60
    //   61  113:aload_0         
    //   62  114:aload           6
    //   63  116:fconst_1        
    //   64  117:aload_0         
    //   65  118:getfield        #284 <Field float mParallaxOffset>
    //   66  121:fsub            
    //   67  122:aload_0         
    //   68  123:getfield        #289 <Field int mCoveredFadeColor>
    //   69  126:invokespecial   #271 <Method void dimChildView(View, float, int)>
    //   70  129:goto            60
    //   71  132:return          
    }

    private static boolean viewIsOpaque(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #294 <Method boolean ViewCompat.isOpaque(View)>
    //    2    4:ifeq            9
    //    3    7:iconst_1        
    //    4    8:ireturn         
    //    5    9:getstatic       #52  <Field int android.os.Build$VERSION.SDK_INT>
    //    6   12:bipush          18
    //    7   14:icmplt          19
    //    8   17:iconst_0        
    //    9   18:ireturn         
    //   10   19:aload_0         
    //   11   20:invokevirtual   #298 <Method Drawable View.getBackground()>
    //   12   23:astore_1        
    //   13   24:aload_1         
    //   14   25:ifnull          38
    //   15   28:aload_1         
    //   16   29:invokevirtual   #303 <Method int Drawable.getOpacity()>
    //   17   32:iconst_m1       
    //   18   33:icmpeq          7
    //   19   36:iconst_0        
    //   20   37:ireturn         
    //   21   38:iconst_0        
    //   22   39:ireturn         
    }

    protected boolean canScroll(View view, boolean flag, int i, int j, int k)
    {
    //    0    0:aload_1         
    //    1    1:instanceof      #4   <Class ViewGroup>
    //    2    4:ifeq            141
    //    3    7:aload_1         
    //    4    8:checkcast       #4   <Class ViewGroup>
    //    5   11:astore          6
    //    6   13:aload_1         
    //    7   14:invokevirtual   #308 <Method int View.getScrollX()>
    //    8   17:istore          7
    //    9   19:aload_1         
    //   10   20:invokevirtual   #311 <Method int View.getScrollY()>
    //   11   23:istore          8
    //   12   25:iconst_m1       
    //   13   26:aload           6
    //   14   28:invokevirtual   #312 <Method int ViewGroup.getChildCount()>
    //   15   31:iadd            
    //   16   32:istore          9
    //   17   34:iload           9
    //   18   36:iflt            141
    //   19   39:aload           6
    //   20   41:iload           9
    //   21   43:invokevirtual   #313 <Method View ViewGroup.getChildAt(int)>
    //   22   46:astore          10
    //   23   48:iload           4
    //   24   50:iload           7
    //   25   52:iadd            
    //   26   53:aload           10
    //   27   55:invokevirtual   #316 <Method int View.getLeft()>
    //   28   58:icmplt          135
    //   29   61:iload           4
    //   30   63:iload           7
    //   31   65:iadd            
    //   32   66:aload           10
    //   33   68:invokevirtual   #319 <Method int View.getRight()>
    //   34   71:icmpge          135
    //   35   74:iload           5
    //   36   76:iload           8
    //   37   78:iadd            
    //   38   79:aload           10
    //   39   81:invokevirtual   #322 <Method int View.getTop()>
    //   40   84:icmplt          135
    //   41   87:iload           5
    //   42   89:iload           8
    //   43   91:iadd            
    //   44   92:aload           10
    //   45   94:invokevirtual   #325 <Method int View.getBottom()>
    //   46   97:icmpge          135
    //   47  100:aload_0         
    //   48  101:aload           10
    //   49  103:iconst_1        
    //   50  104:iload_3         
    //   51  105:iload           4
    //   52  107:iload           7
    //   53  109:iadd            
    //   54  110:aload           10
    //   55  112:invokevirtual   #316 <Method int View.getLeft()>
    //   56  115:isub            
    //   57  116:iload           5
    //   58  118:iload           8
    //   59  120:iadd            
    //   60  121:aload           10
    //   61  123:invokevirtual   #322 <Method int View.getTop()>
    //   62  126:isub            
    //   63  127:invokevirtual   #327 <Method boolean canScroll(View, boolean, int, int, int)>
    //   64  130:ifeq            135
    //   65  133:iconst_1        
    //   66  134:ireturn         
    //   67  135:iinc            9  -1
    //   68  138:goto            34
    //   69  141:iload_2         
    //   70  142:ifeq            156
    //   71  145:aload_1         
    //   72  146:iload_3         
    //   73  147:ineg            
    //   74  148:invokestatic    #330 <Method boolean ViewCompat.canScrollHorizontally(View, int)>
    //   75  151:ifeq            156
    //   76  154:iconst_1        
    //   77  155:ireturn         
    //   78  156:iconst_0        
    //   79  157:ireturn         
    }

    public boolean canSlide()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #335 <Field boolean mCanSlide>
    //    2    4:ireturn         
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:aload_1         
    //    1    1:instanceof      #206 <Class SlidingPaneLayout$LayoutParams>
    //    2    4:ifeq            17
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:invokespecial   #339 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
    //    6   12:ifeq            17
    //    7   15:iconst_1        
    //    8   16:ireturn         
    //    9   17:iconst_0        
    //   10   18:ireturn         
    }

    public boolean closePane()
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #171 <Field View mSlideableView>
    //    3    5:iconst_0        
    //    4    6:invokespecial   #341 <Method boolean closePane(View, int)>
    //    5    9:ireturn         
    }

    public void computeScroll()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #146 <Field ViewDragHelper mDragHelper>
    //    2    4:iconst_1        
    //    3    5:invokevirtual   #346 <Method boolean ViewDragHelper.continueSettling(boolean)>
    //    4    8:ifeq            25
    //    5   11:aload_0         
    //    6   12:getfield        #335 <Field boolean mCanSlide>
    //    7   15:ifne            26
    //    8   18:aload_0         
    //    9   19:getfield        #146 <Field ViewDragHelper mDragHelper>
    //   10   22:invokevirtual   #349 <Method void ViewDragHelper.abort()>
    //   11   25:return          
    //   12   26:aload_0         
    //   13   27:invokestatic    #352 <Method void ViewCompat.postInvalidateOnAnimation(View)>
    //   14   30:return          
    }

    void dispatchOnPanelClosed(View view)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #355 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
    //    2    4:ifnull          17
    //    3    7:aload_0         
    //    4    8:getfield        #355 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
    //    5   11:aload_1         
    //    6   12:invokeinterface #360 <Method void SlidingPaneLayout$PanelSlideListener.onPanelClosed(View)>
    //    7   17:aload_0         
    //    8   18:bipush          32
    //    9   20:invokevirtual   #363 <Method void sendAccessibilityEvent(int)>
    //   10   23:return          
    }

    void dispatchOnPanelOpened(View view)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #355 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
    //    2    4:ifnull          17
    //    3    7:aload_0         
    //    4    8:getfield        #355 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
    //    5   11:aload_1         
    //    6   12:invokeinterface #367 <Method void SlidingPaneLayout$PanelSlideListener.onPanelOpened(View)>
    //    7   17:aload_0         
    //    8   18:bipush          32
    //    9   20:invokevirtual   #363 <Method void sendAccessibilityEvent(int)>
    //   10   23:return          
    }

    void dispatchOnPanelSlide(View view)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #355 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
    //    2    4:ifnull          21
    //    3    7:aload_0         
    //    4    8:getfield        #355 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
    //    5   11:aload_1         
    //    6   12:aload_0         
    //    7   13:getfield        #167 <Field float mSlideOffset>
    //    8   16:invokeinterface #371 <Method void SlidingPaneLayout$PanelSlideListener.onPanelSlide(View, float)>
    //    9   21:return          
    }

    public void draw(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #375 <Method void ViewGroup.draw(Canvas)>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #278 <Method int getChildCount()>
    //    5    9:iconst_1        
    //    6   10:icmple          31
    //    7   13:aload_0         
    //    8   14:iconst_1        
    //    9   15:invokevirtual   #282 <Method View getChildAt(int)>
    //   10   18:astore_2        
    //   11   19:aload_2         
    //   12   20:ifnull          30
    //   13   23:aload_0         
    //   14   24:getfield        #377 <Field Drawable mShadowDrawable>
    //   15   27:ifnonnull       36
    //   16   30:return          
    //   17   31:aconst_null     
    //   18   32:astore_2        
    //   19   33:goto            19
    //   20   36:aload_0         
    //   21   37:getfield        #377 <Field Drawable mShadowDrawable>
    //   22   40:invokevirtual   #380 <Method int Drawable.getIntrinsicWidth()>
    //   23   43:istore_3        
    //   24   44:aload_2         
    //   25   45:invokevirtual   #316 <Method int View.getLeft()>
    //   26   48:istore          4
    //   27   50:aload_2         
    //   28   51:invokevirtual   #322 <Method int View.getTop()>
    //   29   54:istore          5
    //   30   56:aload_2         
    //   31   57:invokevirtual   #325 <Method int View.getBottom()>
    //   32   60:istore          6
    //   33   62:iload           4
    //   34   64:iload_3         
    //   35   65:isub            
    //   36   66:istore          7
    //   37   68:aload_0         
    //   38   69:getfield        #377 <Field Drawable mShadowDrawable>
    //   39   72:iload           7
    //   40   74:iload           5
    //   41   76:iload           4
    //   42   78:iload           6
    //   43   80:invokevirtual   #384 <Method void Drawable.setBounds(int, int, int, int)>
    //   44   83:aload_0         
    //   45   84:getfield        #377 <Field Drawable mShadowDrawable>
    //   46   87:aload_1         
    //   47   88:invokevirtual   #385 <Method void Drawable.draw(Canvas)>
    //   48   91:return          
    }

    protected boolean drawChild(Canvas canvas, View view, long l)
    {
    //    0    0:aload_2         
    //    1    1:invokevirtual   #204 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //    2    4:checkcast       #206 <Class SlidingPaneLayout$LayoutParams>
    //    3    7:astore          5
    //    4    9:aload_1         
    //    5   10:iconst_2        
    //    6   11:invokevirtual   #393 <Method int Canvas.save(int)>
    //    7   14:istore          6
    //    8   16:aload_0         
    //    9   17:getfield        #335 <Field boolean mCanSlide>
    //   10   20:ifeq            80
    //   11   23:aload           5
    //   12   25:getfield        #396 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
    //   13   28:ifne            80
    //   14   31:aload_0         
    //   15   32:getfield        #171 <Field View mSlideableView>
    //   16   35:ifnull          80
    //   17   38:aload_1         
    //   18   39:aload_0         
    //   19   40:getfield        #82  <Field Rect mTmpRect>
    //   20   43:invokevirtual   #400 <Method boolean Canvas.getClipBounds(Rect)>
    //   21   46:pop             
    //   22   47:aload_0         
    //   23   48:getfield        #82  <Field Rect mTmpRect>
    //   24   51:aload_0         
    //   25   52:getfield        #82  <Field Rect mTmpRect>
    //   26   55:getfield        #403 <Field int Rect.right>
    //   27   58:aload_0         
    //   28   59:getfield        #171 <Field View mSlideableView>
    //   29   62:invokevirtual   #316 <Method int View.getLeft()>
    //   30   65:invokestatic    #409 <Method int Math.min(int, int)>
    //   31   68:putfield        #403 <Field int Rect.right>
    //   32   71:aload_1         
    //   33   72:aload_0         
    //   34   73:getfield        #82  <Field Rect mTmpRect>
    //   35   76:invokevirtual   #412 <Method boolean Canvas.clipRect(Rect)>
    //   36   79:pop             
    //   37   80:getstatic       #52  <Field int android.os.Build$VERSION.SDK_INT>
    //   38   83:bipush          11
    //   39   85:icmplt          106
    //   40   88:aload_0         
    //   41   89:aload_1         
    //   42   90:aload_2         
    //   43   91:lload_3         
    //   44   92:invokespecial   #414 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
    //   45   95:istore          7
    //   46   97:aload_1         
    //   47   98:iload           6
    //   48  100:invokevirtual   #417 <Method void Canvas.restoreToCount(int)>
    //   49  103:iload           7
    //   50  105:ireturn         
    //   51  106:aload           5
    //   52  108:getfield        #269 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
    //   53  111:ifeq            217
    //   54  114:aload_0         
    //   55  115:getfield        #167 <Field float mSlideOffset>
    //   56  118:fconst_0        
    //   57  119:fcmpl           
    //   58  120:ifle            217
    //   59  123:aload_2         
    //   60  124:invokevirtual   #420 <Method boolean View.isDrawingCacheEnabled()>
    //   61  127:ifne            135
    //   62  130:aload_2         
    //   63  131:iconst_1        
    //   64  132:invokevirtual   #423 <Method void View.setDrawingCacheEnabled(boolean)>
    //   65  135:aload_2         
    //   66  136:invokevirtual   #427 <Method android.graphics.Bitmap View.getDrawingCache()>
    //   67  139:astore          8
    //   68  141:aload           8
    //   69  143:ifnull          173
    //   70  146:aload_1         
    //   71  147:aload           8
    //   72  149:aload_2         
    //   73  150:invokevirtual   #316 <Method int View.getLeft()>
    //   74  153:i2f             
    //   75  154:aload_2         
    //   76  155:invokevirtual   #322 <Method int View.getTop()>
    //   77  158:i2f             
    //   78  159:aload           5
    //   79  161:getfield        #212 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
    //   80  164:invokevirtual   #431 <Method void Canvas.drawBitmap(android.graphics.Bitmap, float, float, Paint)>
    //   81  167:iconst_0        
    //   82  168:istore          7
    //   83  170:goto            97
    //   84  173:ldc1            #17  <String "SlidingPaneLayout">
    //   85  175:new             #433 <Class StringBuilder>
    //   86  178:dup             
    //   87  179:invokespecial   #434 <Method void StringBuilder()>
    //   88  182:ldc2            #436 <String "drawChild: child view ">
    //   89  185:invokevirtual   #440 <Method StringBuilder StringBuilder.append(String)>
    //   90  188:aload_2         
    //   91  189:invokevirtual   #443 <Method StringBuilder StringBuilder.append(Object)>
    //   92  192:ldc2            #445 <String " returned null drawing cache">
    //   93  195:invokevirtual   #440 <Method StringBuilder StringBuilder.append(String)>
    //   94  198:invokevirtual   #449 <Method String StringBuilder.toString()>
    //   95  201:invokestatic    #455 <Method int Log.e(String, String)>
    //   96  204:pop             
    //   97  205:aload_0         
    //   98  206:aload_1         
    //   99  207:aload_2         
    //  100  208:lload_3         
    //  101  209:invokespecial   #414 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
    //  102  212:istore          7
    //  103  214:goto            97
    //  104  217:aload_2         
    //  105  218:invokevirtual   #420 <Method boolean View.isDrawingCacheEnabled()>
    //  106  221:ifeq            229
    //  107  224:aload_2         
    //  108  225:iconst_0        
    //  109  226:invokevirtual   #423 <Method void View.setDrawingCacheEnabled(boolean)>
    //  110  229:aload_0         
    //  111  230:aload_1         
    //  112  231:aload_2         
    //  113  232:lload_3         
    //  114  233:invokespecial   #414 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
    //  115  236:istore          7
    //  116  238:goto            97
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
    //    0    0:new             #206 <Class SlidingPaneLayout$LayoutParams>
    //    1    3:dup             
    //    2    4:invokespecial   #457 <Method void SlidingPaneLayout$LayoutParams()>
    //    3    7:areturn         
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
    //    0    0:new             #206 <Class SlidingPaneLayout$LayoutParams>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokevirtual   #463 <Method Context getContext()>
    //    4    8:aload_1         
    //    5    9:invokespecial   #464 <Method void SlidingPaneLayout$LayoutParams(Context, AttributeSet)>
    //    6   12:areturn         
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:aload_1         
    //    1    1:instanceof      #467 <Class android.view.ViewGroup$MarginLayoutParams>
    //    2    4:ifeq            19
    //    3    7:new             #206 <Class SlidingPaneLayout$LayoutParams>
    //    4   10:dup             
    //    5   11:aload_1         
    //    6   12:checkcast       #467 <Class android.view.ViewGroup$MarginLayoutParams>
    //    7   15:invokespecial   #470 <Method void SlidingPaneLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
    //    8   18:areturn         
    //    9   19:new             #206 <Class SlidingPaneLayout$LayoutParams>
    //   10   22:dup             
    //   11   23:aload_1         
    //   12   24:invokespecial   #473 <Method void SlidingPaneLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
    //   13   27:areturn         
    }

    public int getCoveredFadeColor()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #289 <Field int mCoveredFadeColor>
    //    2    4:ireturn         
    }

    public int getParallaxDistance()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #263 <Field int mParallaxBy>
    //    2    4:ireturn         
    }

    public int getSliderFadeColor()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field int mSliderFadeColor>
    //    2    4:ireturn         
    }

    boolean isDimmed(View view)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       6
    //    2    4:iconst_0        
    //    3    5:ireturn         
    //    4    6:aload_1         
    //    5    7:invokevirtual   #204 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //    6   10:checkcast       #206 <Class SlidingPaneLayout$LayoutParams>
    //    7   13:astore_2        
    //    8   14:aload_0         
    //    9   15:getfield        #335 <Field boolean mCanSlide>
    //   10   18:ifeq            4
    //   11   21:aload_2         
    //   12   22:getfield        #269 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
    //   13   25:ifeq            4
    //   14   28:aload_0         
    //   15   29:getfield        #167 <Field float mSlideOffset>
    //   16   32:fconst_0        
    //   17   33:fcmpl           
    //   18   34:ifle            4
    //   19   37:iconst_1        
    //   20   38:ireturn         
    }

    public boolean isOpen()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #335 <Field boolean mCanSlide>
    //    2    4:ifeq            16
    //    3    7:aload_0         
    //    4    8:getfield        #167 <Field float mSlideOffset>
    //    5   11:fconst_1        
    //    6   12:fcmpl           
    //    7   13:ifne            18
    //    8   16:iconst_1        
    //    9   17:ireturn         
    //   10   18:iconst_0        
    //   11   19:ireturn         
    }

    public boolean isSlideable()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #335 <Field boolean mCanSlide>
    //    2    4:ireturn         
    }

    protected void onAttachedToWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #482 <Method void ViewGroup.onAttachedToWindow()>
    //    2    4:aload_0         
    //    3    5:iconst_1        
    //    4    6:putfield        #77  <Field boolean mFirstLayout>
    //    5    9:return          
    }

    protected void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #485 <Method void ViewGroup.onDetachedFromWindow()>
    //    2    4:aload_0         
    //    3    5:iconst_1        
    //    4    6:putfield        #77  <Field boolean mFirstLayout>
    //    5    9:iconst_0        
    //    6   10:istore_1        
    //    7   11:aload_0         
    //    8   12:getfield        #87  <Field ArrayList mPostedRunnables>
    //    9   15:invokevirtual   #488 <Method int ArrayList.size()>
    //   10   18:istore_2        
    //   11   19:iload_1         
    //   12   20:iload_2         
    //   13   21:icmpge          44
    //   14   24:aload_0         
    //   15   25:getfield        #87  <Field ArrayList mPostedRunnables>
    //   16   28:iload_1         
    //   17   29:invokevirtual   #491 <Method Object ArrayList.get(int)>
    //   18   32:checkcast       #240 <Class SlidingPaneLayout$DisableLayerRunnable>
    //   19   35:invokevirtual   #494 <Method void SlidingPaneLayout$DisableLayerRunnable.run()>
    //   20   38:iinc            1  1
    //   21   41:goto            19
    //   22   44:aload_0         
    //   23   45:getfield        #87  <Field ArrayList mPostedRunnables>
    //   24   48:invokevirtual   #497 <Method void ArrayList.clear()>
    //   25   51:return          
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
    //    0    0:aload_1         
    //    1    1:invokestatic    #505 <Method int MotionEventCompat.getActionMasked(MotionEvent)>
    //    2    4:istore_2        
    //    3    5:aload_0         
    //    4    6:getfield        #335 <Field boolean mCanSlide>
    //    5    9:ifne            67
    //    6   12:iload_2         
    //    7   13:ifne            67
    //    8   16:aload_0         
    //    9   17:invokevirtual   #278 <Method int getChildCount()>
    //   10   20:iconst_1        
    //   11   21:icmple          67
    //   12   24:aload_0         
    //   13   25:iconst_1        
    //   14   26:invokevirtual   #282 <Method View getChildAt(int)>
    //   15   29:astore          14
    //   16   31:aload           14
    //   17   33:ifnull          67
    //   18   36:aload_0         
    //   19   37:getfield        #146 <Field ViewDragHelper mDragHelper>
    //   20   40:aload           14
    //   21   42:aload_1         
    //   22   43:invokevirtual   #511 <Method float MotionEvent.getX()>
    //   23   46:f2i             
    //   24   47:aload_1         
    //   25   48:invokevirtual   #514 <Method float MotionEvent.getY()>
    //   26   51:f2i             
    //   27   52:invokevirtual   #518 <Method boolean ViewDragHelper.isViewUnder(View, int, int)>
    //   28   55:ifne            98
    //   29   58:iconst_1        
    //   30   59:istore          15
    //   31   61:aload_0         
    //   32   62:iload           15
    //   33   64:putfield        #175 <Field boolean mPreservedOpenState>
    //   34   67:aload_0         
    //   35   68:getfield        #335 <Field boolean mCanSlide>
    //   36   71:ifeq            85
    //   37   74:aload_0         
    //   38   75:getfield        #159 <Field boolean mIsUnableToDrag>
    //   39   78:ifeq            104
    //   40   81:iload_2         
    //   41   82:ifeq            104
    //   42   85:aload_0         
    //   43   86:getfield        #146 <Field ViewDragHelper mDragHelper>
    //   44   89:invokevirtual   #521 <Method void ViewDragHelper.cancel()>
    //   45   92:aload_0         
    //   46   93:aload_1         
    //   47   94:invokespecial   #523 <Method boolean ViewGroup.onInterceptTouchEvent(MotionEvent)>
    //   48   97:ireturn         
    //   49   98:iconst_0        
    //   50   99:istore          15
    //   51  101:goto            61
    //   52  104:iload_2         
    //   53  105:iconst_3        
    //   54  106:icmpeq          114
    //   55  109:iload_2         
    //   56  110:iconst_1        
    //   57  111:icmpne          123
    //   58  114:aload_0         
    //   59  115:getfield        #146 <Field ViewDragHelper mDragHelper>
    //   60  118:invokevirtual   #521 <Method void ViewDragHelper.cancel()>
    //   61  121:iconst_0        
    //   62  122:ireturn         
    //   63  123:iconst_0        
    //   64  124:istore_3        
    //   65  125:iload_2         
    //   66  126:tableswitch     0 2: default 152
    //                   0 169
    //                   1 152
    //                   2 246
    //   67  152:aload_0         
    //   68  153:getfield        #146 <Field ViewDragHelper mDragHelper>
    //   69  156:aload_1         
    //   70  157:invokevirtual   #526 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
    //   71  160:ifne            167
    //   72  163:iload_3         
    //   73  164:ifeq            330
    //   74  167:iconst_1        
    //   75  168:ireturn         
    //   76  169:aload_0         
    //   77  170:iconst_0        
    //   78  171:putfield        #159 <Field boolean mIsUnableToDrag>
    //   79  174:aload_1         
    //   80  175:invokevirtual   #511 <Method float MotionEvent.getX()>
    //   81  178:fstore          10
    //   82  180:aload_1         
    //   83  181:invokevirtual   #514 <Method float MotionEvent.getY()>
    //   84  184:fstore          11
    //   85  186:aload_0         
    //   86  187:fload           10
    //   87  189:putfield        #528 <Field float mInitialMotionX>
    //   88  192:aload_0         
    //   89  193:fload           11
    //   90  195:putfield        #530 <Field float mInitialMotionY>
    //   91  198:aload_0         
    //   92  199:getfield        #146 <Field ViewDragHelper mDragHelper>
    //   93  202:aload_0         
    //   94  203:getfield        #171 <Field View mSlideableView>
    //   95  206:fload           10
    //   96  208:f2i             
    //   97  209:fload           11
    //   98  211:f2i             
    //   99  212:invokevirtual   #518 <Method boolean ViewDragHelper.isViewUnder(View, int, int)>
    //  100  215:istore          12
    //  101  217:iconst_0        
    //  102  218:istore_3        
    //  103  219:iload           12
    //  104  221:ifeq            152
    //  105  224:aload_0         
    //  106  225:aload_0         
    //  107  226:getfield        #171 <Field View mSlideableView>
    //  108  229:invokevirtual   #532 <Method boolean isDimmed(View)>
    //  109  232:istore          13
    //  110  234:iconst_0        
    //  111  235:istore_3        
    //  112  236:iload           13
    //  113  238:ifeq            152
    //  114  241:iconst_1        
    //  115  242:istore_3        
    //  116  243:goto            152
    //  117  246:aload_1         
    //  118  247:invokevirtual   #511 <Method float MotionEvent.getX()>
    //  119  250:fstore          4
    //  120  252:aload_1         
    //  121  253:invokevirtual   #514 <Method float MotionEvent.getY()>
    //  122  256:fstore          5
    //  123  258:fload           4
    //  124  260:aload_0         
    //  125  261:getfield        #528 <Field float mInitialMotionX>
    //  126  264:fsub            
    //  127  265:invokestatic    #536 <Method float Math.abs(float)>
    //  128  268:fstore          6
    //  129  270:fload           5
    //  130  272:aload_0         
    //  131  273:getfield        #530 <Field float mInitialMotionY>
    //  132  276:fsub            
    //  133  277:invokestatic    #536 <Method float Math.abs(float)>
    //  134  280:fstore          7
    //  135  282:fload           6
    //  136  284:aload_0         
    //  137  285:getfield        #146 <Field ViewDragHelper mDragHelper>
    //  138  288:invokevirtual   #539 <Method int ViewDragHelper.getTouchSlop()>
    //  139  291:i2f             
    //  140  292:fcmpl           
    //  141  293:istore          8
    //  142  295:iconst_0        
    //  143  296:istore_3        
    //  144  297:iload           8
    //  145  299:ifle            152
    //  146  302:fload           7
    //  147  304:fload           6
    //  148  306:fcmpl           
    //  149  307:istore          9
    //  150  309:iconst_0        
    //  151  310:istore_3        
    //  152  311:iload           9
    //  153  313:ifle            152
    //  154  316:aload_0         
    //  155  317:getfield        #146 <Field ViewDragHelper mDragHelper>
    //  156  320:invokevirtual   #521 <Method void ViewDragHelper.cancel()>
    //  157  323:aload_0         
    //  158  324:iconst_1        
    //  159  325:putfield        #159 <Field boolean mIsUnableToDrag>
    //  160  328:iconst_0        
    //  161  329:ireturn         
    //  162  330:iconst_0        
    //  163  331:ireturn         
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
    //    0    0:iload           4
    //    1    2:iload_2         
    //    2    3:isub            
    //    3    4:istore          6
    //    4    6:aload_0         
    //    5    7:invokevirtual   #258 <Method int getPaddingLeft()>
    //    6   10:istore          7
    //    7   12:aload_0         
    //    8   13:invokevirtual   #544 <Method int getPaddingRight()>
    //    9   16:istore          8
    //   10   18:aload_0         
    //   11   19:invokevirtual   #547 <Method int getPaddingTop()>
    //   12   22:istore          9
    //   13   24:aload_0         
    //   14   25:invokevirtual   #278 <Method int getChildCount()>
    //   15   28:istore          10
    //   16   30:iload           7
    //   17   32:istore          11
    //   18   34:iload           11
    //   19   36:istore          12
    //   20   38:aload_0         
    //   21   39:getfield        #77  <Field boolean mFirstLayout>
    //   22   42:ifeq            68
    //   23   45:aload_0         
    //   24   46:getfield        #335 <Field boolean mCanSlide>
    //   25   49:ifeq            102
    //   26   52:aload_0         
    //   27   53:getfield        #175 <Field boolean mPreservedOpenState>
    //   28   56:ifeq            102
    //   29   59:fconst_1        
    //   30   60:fstore          23
    //   31   62:aload_0         
    //   32   63:fload           23
    //   33   65:putfield        #167 <Field float mSlideOffset>
    //   34   68:iconst_0        
    //   35   69:istore          13
    //   36   71:iload           13
    //   37   73:iload           10
    //   38   75:icmpge          326
    //   39   78:aload_0         
    //   40   79:iload           13
    //   41   81:invokevirtual   #282 <Method View getChildAt(int)>
    //   42   84:astore          15
    //   43   86:aload           15
    //   44   88:invokevirtual   #550 <Method int View.getVisibility()>
    //   45   91:bipush          8
    //   46   93:icmpne          108
    //   47   96:iinc            13  1
    //   48   99:goto            71
    //   49  102:fconst_0        
    //   50  103:fstore          23
    //   51  105:goto            62
    //   52  108:aload           15
    //   53  110:invokevirtual   #204 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   54  113:checkcast       #206 <Class SlidingPaneLayout$LayoutParams>
    //   55  116:astore          16
    //   56  118:aload           15
    //   57  120:invokevirtual   #553 <Method int View.getMeasuredWidth()>
    //   58  123:istore          17
    //   59  125:iconst_0        
    //   60  126:istore          18
    //   61  128:aload           16
    //   62  130:getfield        #396 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
    //   63  133:ifeq            280
    //   64  136:aload           16
    //   65  138:getfield        #261 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
    //   66  141:aload           16
    //   67  143:getfield        #556 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
    //   68  146:iadd            
    //   69  147:istore          20
    //   70  149:iload           12
    //   71  151:iload           6
    //   72  153:iload           8
    //   73  155:isub            
    //   74  156:aload_0         
    //   75  157:getfield        #108 <Field int mOverhangSize>
    //   76  160:isub            
    //   77  161:invokestatic    #409 <Method int Math.min(int, int)>
    //   78  164:iload           11
    //   79  166:isub            
    //   80  167:iload           20
    //   81  169:isub            
    //   82  170:istore          21
    //   83  172:aload_0         
    //   84  173:iload           21
    //   85  175:putfield        #184 <Field int mSlideRange>
    //   86  178:iload           21
    //   87  180:iload           11
    //   88  182:aload           16
    //   89  184:getfield        #261 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
    //   90  187:iadd            
    //   91  188:iadd            
    //   92  189:iload           17
    //   93  191:iconst_2        
    //   94  192:idiv            
    //   95  193:iadd            
    //   96  194:iload           6
    //   97  196:iload           8
    //   98  198:isub            
    //   99  199:icmple          274
    //  100  202:iconst_1        
    //  101  203:istore          22
    //  102  205:aload           16
    //  103  207:iload           22
    //  104  209:putfield        #269 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
    //  105  212:iload           11
    //  106  214:iload           21
    //  107  216:i2f             
    //  108  217:aload_0         
    //  109  218:getfield        #167 <Field float mSlideOffset>
    //  110  221:fmul            
    //  111  222:f2i             
    //  112  223:aload           16
    //  113  225:getfield        #261 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
    //  114  228:iadd            
    //  115  229:iadd            
    //  116  230:istore          11
    //  117  232:iload           11
    //  118  234:iload           18
    //  119  236:isub            
    //  120  237:istore          19
    //  121  239:aload           15
    //  122  241:iload           19
    //  123  243:iload           9
    //  124  245:iload           19
    //  125  247:iload           17
    //  126  249:iadd            
    //  127  250:iload           9
    //  128  252:aload           15
    //  129  254:invokevirtual   #559 <Method int View.getMeasuredHeight()>
    //  130  257:iadd            
    //  131  258:invokevirtual   #562 <Method void View.layout(int, int, int, int)>
    //  132  261:iload           12
    //  133  263:aload           15
    //  134  265:invokevirtual   #565 <Method int View.getWidth()>
    //  135  268:iadd            
    //  136  269:istore          12
    //  137  271:goto            96
    //  138  274:iconst_0        
    //  139  275:istore          22
    //  140  277:goto            205
    //  141  280:aload_0         
    //  142  281:getfield        #335 <Field boolean mCanSlide>
    //  143  284:ifeq            316
    //  144  287:aload_0         
    //  145  288:getfield        #263 <Field int mParallaxBy>
    //  146  291:ifeq            316
    //  147  294:fconst_1        
    //  148  295:aload_0         
    //  149  296:getfield        #167 <Field float mSlideOffset>
    //  150  299:fsub            
    //  151  300:aload_0         
    //  152  301:getfield        #263 <Field int mParallaxBy>
    //  153  304:i2f             
    //  154  305:fmul            
    //  155  306:f2i             
    //  156  307:istore          18
    //  157  309:iload           12
    //  158  311:istore          11
    //  159  313:goto            232
    //  160  316:iload           12
    //  161  318:istore          11
    //  162  320:iconst_0        
    //  163  321:istore          18
    //  164  323:goto            232
    //  165  326:aload_0         
    //  166  327:getfield        #77  <Field boolean mFirstLayout>
    //  167  330:ifeq            395
    //  168  333:aload_0         
    //  169  334:getfield        #335 <Field boolean mCanSlide>
    //  170  337:ifeq            401
    //  171  340:aload_0         
    //  172  341:getfield        #263 <Field int mParallaxBy>
    //  173  344:ifeq            355
    //  174  347:aload_0         
    //  175  348:aload_0         
    //  176  349:getfield        #167 <Field float mSlideOffset>
    //  177  352:invokespecial   #266 <Method void parallaxOtherViews(float)>
    //  178  355:aload_0         
    //  179  356:getfield        #171 <Field View mSlideableView>
    //  180  359:invokevirtual   #204 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  181  362:checkcast       #206 <Class SlidingPaneLayout$LayoutParams>
    //  182  365:getfield        #269 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
    //  183  368:ifeq            387
    //  184  371:aload_0         
    //  185  372:aload_0         
    //  186  373:getfield        #171 <Field View mSlideableView>
    //  187  376:aload_0         
    //  188  377:getfield        #167 <Field float mSlideOffset>
    //  189  380:aload_0         
    //  190  381:getfield        #75  <Field int mSliderFadeColor>
    //  191  384:invokespecial   #271 <Method void dimChildView(View, float, int)>
    //  192  387:aload_0         
    //  193  388:aload_0         
    //  194  389:getfield        #171 <Field View mSlideableView>
    //  195  392:invokevirtual   #568 <Method void updateObscuredViewsVisibility(View)>
    //  196  395:aload_0         
    //  197  396:iconst_0        
    //  198  397:putfield        #77  <Field boolean mFirstLayout>
    //  199  400:return          
    //  200  401:iconst_0        
    //  201  402:istore          14
    //  202  404:iload           14
    //  203  406:iload           10
    //  204  408:icmpge          387
    //  205  411:aload_0         
    //  206  412:aload_0         
    //  207  413:iload           14
    //  208  415:invokevirtual   #282 <Method View getChildAt(int)>
    //  209  418:fconst_0        
    //  210  419:aload_0         
    //  211  420:getfield        #75  <Field int mSliderFadeColor>
    //  212  423:invokespecial   #271 <Method void dimChildView(View, float, int)>
    //  213  426:iinc            14  1
    //  214  429:goto            404
    }

    protected void onMeasure(int i, int j)
    {
    //    0    0:iload_1         
    //    1    1:invokestatic    #575 <Method int android.view.View$MeasureSpec.getMode(int)>
    //    2    4:istore_3        
    //    3    5:iload_1         
    //    4    6:invokestatic    #578 <Method int android.view.View$MeasureSpec.getSize(int)>
    //    5    9:istore          4
    //    6   11:iload_2         
    //    7   12:invokestatic    #575 <Method int android.view.View$MeasureSpec.getMode(int)>
    //    8   15:istore          5
    //    9   17:iload_2         
    //   10   18:invokestatic    #578 <Method int android.view.View$MeasureSpec.getSize(int)>
    //   11   21:istore          6
    //   12   23:iload_3         
    //   13   24:ldc2            #579 <Int 0x40000000>
    //   14   27:icmpeq          199
    //   15   30:aload_0         
    //   16   31:invokevirtual   #582 <Method boolean isInEditMode()>
    //   17   34:ifeq            188
    //   18   37:iload_3         
    //   19   38:ldc2            #583 <Int 0x80000000>
    //   20   41:icmpne          176
    //   21   44:iconst_m1       
    //   22   45:istore          7
    //   23   47:iconst_0        
    //   24   48:istore          8
    //   25   50:iload           5
    //   26   52:lookupswitch    2: default 80
    //                   -2147483648: 261
    //                   1073741824: 240
    //   27   80:fconst_0        
    //   28   81:fstore          9
    //   29   83:iconst_0        
    //   30   84:istore          10
    //   31   86:iload           4
    //   32   88:aload_0         
    //   33   89:invokevirtual   #258 <Method int getPaddingLeft()>
    //   34   92:isub            
    //   35   93:aload_0         
    //   36   94:invokevirtual   #544 <Method int getPaddingRight()>
    //   37   97:isub            
    //   38   98:istore          11
    //   39  100:aload_0         
    //   40  101:invokevirtual   #278 <Method int getChildCount()>
    //   41  104:istore          12
    //   42  106:iload           12
    //   43  108:iconst_2        
    //   44  109:icmple          121
    //   45  112:ldc1            #17  <String "SlidingPaneLayout">
    //   46  114:ldc2            #585 <String "onMeasure: More than two child views are not supported.">
    //   47  117:invokestatic    #455 <Method int Log.e(String, String)>
    //   48  120:pop             
    //   49  121:aload_0         
    //   50  122:aconst_null     
    //   51  123:putfield        #171 <Field View mSlideableView>
    //   52  126:iconst_0        
    //   53  127:istore          13
    //   54  129:iload           13
    //   55  131:iload           12
    //   56  133:icmpge          543
    //   57  136:aload_0         
    //   58  137:iload           13
    //   59  139:invokevirtual   #282 <Method View getChildAt(int)>
    //   60  142:astore          25
    //   61  144:aload           25
    //   62  146:invokevirtual   #204 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   63  149:checkcast       #206 <Class SlidingPaneLayout$LayoutParams>
    //   64  152:astore          26
    //   65  154:aload           25
    //   66  156:invokevirtual   #550 <Method int View.getVisibility()>
    //   67  159:bipush          8
    //   68  161:icmpne          281
    //   69  164:aload           26
    //   70  166:iconst_0        
    //   71  167:putfield        #269 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
    //   72  170:iinc            13  1
    //   73  173:goto            129
    //   74  176:iload_3         
    //   75  177:ifne            44
    //   76  180:sipush          300
    //   77  183:istore          4
    //   78  185:goto            44
    //   79  188:new             #587 <Class IllegalStateException>
    //   80  191:dup             
    //   81  192:ldc2            #589 <String "Width must have an exact value or MATCH_PARENT">
    //   82  195:invokespecial   #592 <Method void IllegalStateException(String)>
    //   83  198:athrow          
    //   84  199:iload           5
    //   85  201:ifne            44
    //   86  204:aload_0         
    //   87  205:invokevirtual   #582 <Method boolean isInEditMode()>
    //   88  208:ifeq            229
    //   89  211:iload           5
    //   90  213:ifne            44
    //   91  216:ldc2            #583 <Int 0x80000000>
    //   92  219:istore          5
    //   93  221:sipush          300
    //   94  224:istore          6
    //   95  226:goto            44
    //   96  229:new             #587 <Class IllegalStateException>
    //   97  232:dup             
    //   98  233:ldc2            #594 <String "Height must not be UNSPECIFIED">
    //   99  236:invokespecial   #592 <Method void IllegalStateException(String)>
    //  100  239:athrow          
    //  101  240:iload           6
    //  102  242:aload_0         
    //  103  243:invokevirtual   #547 <Method int getPaddingTop()>
    //  104  246:isub            
    //  105  247:aload_0         
    //  106  248:invokevirtual   #597 <Method int getPaddingBottom()>
    //  107  251:isub            
    //  108  252:istore          7
    //  109  254:iload           7
    //  110  256:istore          8
    //  111  258:goto            80
    //  112  261:iload           6
    //  113  263:aload_0         
    //  114  264:invokevirtual   #547 <Method int getPaddingTop()>
    //  115  267:isub            
    //  116  268:aload_0         
    //  117  269:invokevirtual   #597 <Method int getPaddingBottom()>
    //  118  272:isub            
    //  119  273:istore          7
    //  120  275:iconst_0        
    //  121  276:istore          8
    //  122  278:goto            80
    //  123  281:aload           26
    //  124  283:getfield        #600 <Field float SlidingPaneLayout$LayoutParams.weight>
    //  125  286:fconst_0        
    //  126  287:fcmpl           
    //  127  288:ifle            309
    //  128  291:fload           9
    //  129  293:aload           26
    //  130  295:getfield        #600 <Field float SlidingPaneLayout$LayoutParams.weight>
    //  131  298:fadd            
    //  132  299:fstore          9
    //  133  301:aload           26
    //  134  303:getfield        #603 <Field int SlidingPaneLayout$LayoutParams.width>
    //  135  306:ifeq            170
    //  136  309:aload           26
    //  137  311:getfield        #261 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
    //  138  314:aload           26
    //  139  316:getfield        #556 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
    //  140  319:iadd            
    //  141  320:istore          27
    //  142  322:aload           26
    //  143  324:getfield        #603 <Field int SlidingPaneLayout$LayoutParams.width>
    //  144  327:bipush          -2
    //  145  329:icmpne          458
    //  146  332:iload           4
    //  147  334:iload           27
    //  148  336:isub            
    //  149  337:ldc2            #583 <Int 0x80000000>
    //  150  340:invokestatic    #606 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  151  343:istore          28
    //  152  345:aload           26
    //  153  347:getfield        #609 <Field int SlidingPaneLayout$LayoutParams.height>
    //  154  350:bipush          -2
    //  155  352:icmpne          499
    //  156  355:iload           7
    //  157  357:ldc2            #583 <Int 0x80000000>
    //  158  360:invokestatic    #606 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  159  363:istore          29
    //  160  365:aload           25
    //  161  367:iload           28
    //  162  369:iload           29
    //  163  371:invokevirtual   #612 <Method void View.measure(int, int)>
    //  164  374:aload           25
    //  165  376:invokevirtual   #553 <Method int View.getMeasuredWidth()>
    //  166  379:istore          30
    //  167  381:aload           25
    //  168  383:invokevirtual   #559 <Method int View.getMeasuredHeight()>
    //  169  386:istore          31
    //  170  388:iload           5
    //  171  390:ldc2            #583 <Int 0x80000000>
    //  172  393:icmpne          412
    //  173  396:iload           31
    //  174  398:iload           8
    //  175  400:icmple          412
    //  176  403:iload           31
    //  177  405:iload           7
    //  178  407:invokestatic    #409 <Method int Math.min(int, int)>
    //  179  410:istore          8
    //  180  412:iload           11
    //  181  414:iload           30
    //  182  416:isub            
    //  183  417:istore          11
    //  184  419:iload           11
    //  185  421:ifge            537
    //  186  424:iconst_1        
    //  187  425:istore          32
    //  188  427:aload           26
    //  189  429:iload           32
    //  190  431:putfield        #396 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
    //  191  434:iload           10
    //  192  436:iload           32
    //  193  438:ior             
    //  194  439:istore          10
    //  195  441:aload           26
    //  196  443:getfield        #396 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
    //  197  446:ifeq            170
    //  198  449:aload_0         
    //  199  450:aload           25
    //  200  452:putfield        #171 <Field View mSlideableView>
    //  201  455:goto            170
    //  202  458:aload           26
    //  203  460:getfield        #603 <Field int SlidingPaneLayout$LayoutParams.width>
    //  204  463:iconst_m1       
    //  205  464:icmpne          483
    //  206  467:iload           4
    //  207  469:iload           27
    //  208  471:isub            
    //  209  472:ldc2            #579 <Int 0x40000000>
    //  210  475:invokestatic    #606 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  211  478:istore          28
    //  212  480:goto            345
    //  213  483:aload           26
    //  214  485:getfield        #603 <Field int SlidingPaneLayout$LayoutParams.width>
    //  215  488:ldc2            #579 <Int 0x40000000>
    //  216  491:invokestatic    #606 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  217  494:istore          28
    //  218  496:goto            345
    //  219  499:aload           26
    //  220  501:getfield        #609 <Field int SlidingPaneLayout$LayoutParams.height>
    //  221  504:iconst_m1       
    //  222  505:icmpne          521
    //  223  508:iload           7
    //  224  510:ldc2            #579 <Int 0x40000000>
    //  225  513:invokestatic    #606 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  226  516:istore          29
    //  227  518:goto            365
    //  228  521:aload           26
    //  229  523:getfield        #609 <Field int SlidingPaneLayout$LayoutParams.height>
    //  230  526:ldc2            #579 <Int 0x40000000>
    //  231  529:invokestatic    #606 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  232  532:istore          29
    //  233  534:goto            365
    //  234  537:iconst_0        
    //  235  538:istore          32
    //  236  540:goto            427
    //  237  543:iload           10
    //  238  545:ifne            555
    //  239  548:fload           9
    //  240  550:fconst_0        
    //  241  551:fcmpl           
    //  242  552:ifle            981
    //  243  555:iload           4
    //  244  557:aload_0         
    //  245  558:getfield        #108 <Field int mOverhangSize>
    //  246  561:isub            
    //  247  562:istore          14
    //  248  564:iconst_0        
    //  249  565:istore          15
    //  250  567:iload           15
    //  251  569:iload           12
    //  252  571:icmpge          981
    //  253  574:aload_0         
    //  254  575:iload           15
    //  255  577:invokevirtual   #282 <Method View getChildAt(int)>
    //  256  580:astore          16
    //  257  582:aload           16
    //  258  584:invokevirtual   #550 <Method int View.getVisibility()>
    //  259  587:bipush          8
    //  260  589:icmpne          598
    //  261  592:iinc            15  1
    //  262  595:goto            567
    //  263  598:aload           16
    //  264  600:invokevirtual   #204 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  265  603:checkcast       #206 <Class SlidingPaneLayout$LayoutParams>
    //  266  606:astore          17
    //  267  608:aload           16
    //  268  610:invokevirtual   #550 <Method int View.getVisibility()>
    //  269  613:bipush          8
    //  270  615:icmpeq          592
    //  271  618:aload           17
    //  272  620:getfield        #603 <Field int SlidingPaneLayout$LayoutParams.width>
    //  273  623:ifne            729
    //  274  626:aload           17
    //  275  628:getfield        #600 <Field float SlidingPaneLayout$LayoutParams.weight>
    //  276  631:fconst_0        
    //  277  632:fcmpl           
    //  278  633:ifle            729
    //  279  636:iconst_1        
    //  280  637:istore          18
    //  281  639:iload           18
    //  282  641:ifeq            735
    //  283  644:iconst_0        
    //  284  645:istore          19
    //  285  647:iload           10
    //  286  649:ifeq            799
    //  287  652:aload           16
    //  288  654:aload_0         
    //  289  655:getfield        #171 <Field View mSlideableView>
    //  290  658:if_acmpeq       799
    //  291  661:aload           17
    //  292  663:getfield        #603 <Field int SlidingPaneLayout$LayoutParams.width>
    //  293  666:ifge            592
    //  294  669:iload           19
    //  295  671:iload           14
    //  296  673:icmpgt          686
    //  297  676:aload           17
    //  298  678:getfield        #600 <Field float SlidingPaneLayout$LayoutParams.weight>
    //  299  681:fconst_0        
    //  300  682:fcmpl           
    //  301  683:ifle            592
    //  302  686:iload           18
    //  303  688:ifeq            783
    //  304  691:aload           17
    //  305  693:getfield        #609 <Field int SlidingPaneLayout$LayoutParams.height>
    //  306  696:bipush          -2
    //  307  698:icmpne          745
    //  308  701:iload           7
    //  309  703:ldc2            #583 <Int 0x80000000>
    //  310  706:invokestatic    #606 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  311  709:istore          24
    //  312  711:aload           16
    //  313  713:iload           14
    //  314  715:ldc2            #579 <Int 0x40000000>
    //  315  718:invokestatic    #606 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  316  721:iload           24
    //  317  723:invokevirtual   #612 <Method void View.measure(int, int)>
    //  318  726:goto            592
    //  319  729:iconst_0        
    //  320  730:istore          18
    //  321  732:goto            639
    //  322  735:aload           16
    //  323  737:invokevirtual   #553 <Method int View.getMeasuredWidth()>
    //  324  740:istore          19
    //  325  742:goto            647
    //  326  745:aload           17
    //  327  747:getfield        #609 <Field int SlidingPaneLayout$LayoutParams.height>
    //  328  750:iconst_m1       
    //  329  751:icmpne          767
    //  330  754:iload           7
    //  331  756:ldc2            #579 <Int 0x40000000>
    //  332  759:invokestatic    #606 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  333  762:istore          24
    //  334  764:goto            711
    //  335  767:aload           17
    //  336  769:getfield        #609 <Field int SlidingPaneLayout$LayoutParams.height>
    //  337  772:ldc2            #579 <Int 0x40000000>
    //  338  775:invokestatic    #606 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  339  778:istore          24
    //  340  780:goto            711
    //  341  783:aload           16
    //  342  785:invokevirtual   #559 <Method int View.getMeasuredHeight()>
    //  343  788:ldc2            #579 <Int 0x40000000>
    //  344  791:invokestatic    #606 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  345  794:istore          24
    //  346  796:goto            711
    //  347  799:aload           17
    //  348  801:getfield        #600 <Field float SlidingPaneLayout$LayoutParams.weight>
    //  349  804:fconst_0        
    //  350  805:fcmpl           
    //  351  806:ifle            592
    //  352  809:aload           17
    //  353  811:getfield        #603 <Field int SlidingPaneLayout$LayoutParams.width>
    //  354  814:ifne            925
    //  355  817:aload           17
    //  356  819:getfield        #609 <Field int SlidingPaneLayout$LayoutParams.height>
    //  357  822:bipush          -2
    //  358  824:icmpne          887
    //  359  827:iload           7
    //  360  829:ldc2            #583 <Int 0x80000000>
    //  361  832:invokestatic    #606 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  362  835:istore          20
    //  363  837:iload           10
    //  364  839:ifeq            941
    //  365  842:iload           4
    //  366  844:aload           17
    //  367  846:getfield        #261 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
    //  368  849:aload           17
    //  369  851:getfield        #556 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
    //  370  854:iadd            
    //  371  855:isub            
    //  372  856:istore          22
    //  373  858:iload           22
    //  374  860:ldc2            #579 <Int 0x40000000>
    //  375  863:invokestatic    #606 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  376  866:istore          23
    //  377  868:iload           19
    //  378  870:iload           22
    //  379  872:icmpeq          592
    //  380  875:aload           16
    //  381  877:iload           23
    //  382  879:iload           20
    //  383  881:invokevirtual   #612 <Method void View.measure(int, int)>
    //  384  884:goto            592
    //  385  887:aload           17
    //  386  889:getfield        #609 <Field int SlidingPaneLayout$LayoutParams.height>
    //  387  892:iconst_m1       
    //  388  893:icmpne          909
    //  389  896:iload           7
    //  390  898:ldc2            #579 <Int 0x40000000>
    //  391  901:invokestatic    #606 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  392  904:istore          20
    //  393  906:goto            837
    //  394  909:aload           17
    //  395  911:getfield        #609 <Field int SlidingPaneLayout$LayoutParams.height>
    //  396  914:ldc2            #579 <Int 0x40000000>
    //  397  917:invokestatic    #606 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  398  920:istore          20
    //  399  922:goto            837
    //  400  925:aload           16
    //  401  927:invokevirtual   #559 <Method int View.getMeasuredHeight()>
    //  402  930:ldc2            #579 <Int 0x40000000>
    //  403  933:invokestatic    #606 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  404  936:istore          20
    //  405  938:goto            837
    //  406  941:iconst_0        
    //  407  942:iload           11
    //  408  944:invokestatic    #615 <Method int Math.max(int, int)>
    //  409  947:istore          21
    //  410  949:aload           16
    //  411  951:iload           19
    //  412  953:aload           17
    //  413  955:getfield        #600 <Field float SlidingPaneLayout$LayoutParams.weight>
    //  414  958:iload           21
    //  415  960:i2f             
    //  416  961:fmul            
    //  417  962:fload           9
    //  418  964:fdiv            
    //  419  965:f2i             
    //  420  966:iadd            
    //  421  967:ldc2            #579 <Int 0x40000000>
    //  422  970:invokestatic    #606 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  423  973:iload           20
    //  424  975:invokevirtual   #612 <Method void View.measure(int, int)>
    //  425  978:goto            592
    //  426  981:aload_0         
    //  427  982:iload           4
    //  428  984:iload           8
    //  429  986:invokevirtual   #618 <Method void setMeasuredDimension(int, int)>
    //  430  989:aload_0         
    //  431  990:iload           10
    //  432  992:putfield        #335 <Field boolean mCanSlide>
    //  433  995:aload_0         
    //  434  996:getfield        #146 <Field ViewDragHelper mDragHelper>
    //  435  999:invokevirtual   #621 <Method int ViewDragHelper.getViewDragState()>
    //  436 1002:ifeq            1017
    //  437 1005:iload           10
    //  438 1007:ifne            1017
    //  439 1010:aload_0         
    //  440 1011:getfield        #146 <Field ViewDragHelper mDragHelper>
    //  441 1014:invokevirtual   #349 <Method void ViewDragHelper.abort()>
    //  442 1017:return          
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
    //    0    0:aload_1         
    //    1    1:checkcast       #625 <Class SlidingPaneLayout$SavedState>
    //    2    4:astore_2        
    //    3    5:aload_0         
    //    4    6:aload_2         
    //    5    7:invokevirtual   #629 <Method Parcelable SlidingPaneLayout$SavedState.getSuperState()>
    //    6   10:invokespecial   #631 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
    //    7   13:aload_2         
    //    8   14:getfield        #633 <Field boolean SlidingPaneLayout$SavedState.isOpen>
    //    9   17:ifeq            34
    //   10   20:aload_0         
    //   11   21:invokevirtual   #635 <Method boolean openPane()>
    //   12   24:pop             
    //   13   25:aload_0         
    //   14   26:aload_2         
    //   15   27:getfield        #633 <Field boolean SlidingPaneLayout$SavedState.isOpen>
    //   16   30:putfield        #175 <Field boolean mPreservedOpenState>
    //   17   33:return          
    //   18   34:aload_0         
    //   19   35:invokevirtual   #637 <Method boolean closePane()>
    //   20   38:pop             
    //   21   39:goto            25
    }

    protected Parcelable onSaveInstanceState()
    {
    //    0    0:new             #625 <Class SlidingPaneLayout$SavedState>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #640 <Method Parcelable ViewGroup.onSaveInstanceState()>
    //    4    8:invokespecial   #642 <Method void SlidingPaneLayout$SavedState(Parcelable)>
    //    5   11:astore_1        
    //    6   12:aload_0         
    //    7   13:invokevirtual   #644 <Method boolean isSlideable()>
    //    8   16:ifeq            31
    //    9   19:aload_0         
    //   10   20:invokevirtual   #646 <Method boolean isOpen()>
    //   11   23:istore_2        
    //   12   24:aload_1         
    //   13   25:iload_2         
    //   14   26:putfield        #633 <Field boolean SlidingPaneLayout$SavedState.isOpen>
    //   15   29:aload_1         
    //   16   30:areturn         
    //   17   31:aload_0         
    //   18   32:getfield        #175 <Field boolean mPreservedOpenState>
    //   19   35:istore_2        
    //   20   36:goto            24
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:iload_3         
    //    4    4:iload           4
    //    5    6:invokespecial   #649 <Method void ViewGroup.onSizeChanged(int, int, int, int)>
    //    6    9:iload_1         
    //    7   10:iload_3         
    //    8   11:icmpeq          19
    //    9   14:aload_0         
    //   10   15:iconst_1        
    //   11   16:putfield        #77  <Field boolean mFirstLayout>
    //   12   19:return          
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #335 <Field boolean mCanSlide>
    //    2    4:ifne            15
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:invokespecial   #652 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
    //    6   12:istore_3        
    //    7   13:iload_3         
    //    8   14:ireturn         
    //    9   15:aload_0         
    //   10   16:getfield        #146 <Field ViewDragHelper mDragHelper>
    //   11   19:aload_1         
    //   12   20:invokevirtual   #656 <Method void ViewDragHelper.processTouchEvent(MotionEvent)>
    //   13   23:aload_1         
    //   14   24:invokevirtual   #659 <Method int MotionEvent.getAction()>
    //   15   27:istore_2        
    //   16   28:iconst_1        
    //   17   29:istore_3        
    //   18   30:iload_2         
    //   19   31:sipush          255
    //   20   34:iand            
    //   21   35:tableswitch     0 1: default 56
    //                   0 58
    //                   1 84
    //   22   56:iload_3         
    //   23   57:ireturn         
    //   24   58:aload_1         
    //   25   59:invokevirtual   #511 <Method float MotionEvent.getX()>
    //   26   62:fstore          10
    //   27   64:aload_1         
    //   28   65:invokevirtual   #514 <Method float MotionEvent.getY()>
    //   29   68:fstore          11
    //   30   70:aload_0         
    //   31   71:fload           10
    //   32   73:putfield        #528 <Field float mInitialMotionX>
    //   33   76:aload_0         
    //   34   77:fload           11
    //   35   79:putfield        #530 <Field float mInitialMotionY>
    //   36   82:iload_3         
    //   37   83:ireturn         
    //   38   84:aload_0         
    //   39   85:aload_0         
    //   40   86:getfield        #171 <Field View mSlideableView>
    //   41   89:invokevirtual   #532 <Method boolean isDimmed(View)>
    //   42   92:ifeq            13
    //   43   95:aload_1         
    //   44   96:invokevirtual   #511 <Method float MotionEvent.getX()>
    //   45   99:fstore          4
    //   46  101:aload_1         
    //   47  102:invokevirtual   #514 <Method float MotionEvent.getY()>
    //   48  105:fstore          5
    //   49  107:fload           4
    //   50  109:aload_0         
    //   51  110:getfield        #528 <Field float mInitialMotionX>
    //   52  113:fsub            
    //   53  114:fstore          6
    //   54  116:fload           5
    //   55  118:aload_0         
    //   56  119:getfield        #530 <Field float mInitialMotionY>
    //   57  122:fsub            
    //   58  123:fstore          7
    //   59  125:aload_0         
    //   60  126:getfield        #146 <Field ViewDragHelper mDragHelper>
    //   61  129:invokevirtual   #539 <Method int ViewDragHelper.getTouchSlop()>
    //   62  132:istore          8
    //   63  134:fload           6
    //   64  136:fload           6
    //   65  138:fmul            
    //   66  139:fload           7
    //   67  141:fload           7
    //   68  143:fmul            
    //   69  144:fadd            
    //   70  145:iload           8
    //   71  147:iload           8
    //   72  149:imul            
    //   73  150:i2f             
    //   74  151:fcmpg           
    //   75  152:ifge            13
    //   76  155:aload_0         
    //   77  156:getfield        #146 <Field ViewDragHelper mDragHelper>
    //   78  159:aload_0         
    //   79  160:getfield        #171 <Field View mSlideableView>
    //   80  163:fload           4
    //   81  165:f2i             
    //   82  166:fload           5
    //   83  168:f2i             
    //   84  169:invokevirtual   #518 <Method boolean ViewDragHelper.isViewUnder(View, int, int)>
    //   85  172:ifeq            13
    //   86  175:aload_0         
    //   87  176:aload_0         
    //   88  177:getfield        #171 <Field View mSlideableView>
    //   89  180:iconst_0        
    //   90  181:invokespecial   #341 <Method boolean closePane(View, int)>
    //   91  184:pop             
    //   92  185:iload_3         
    //   93  186:ireturn         
    }

    public boolean openPane()
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #171 <Field View mSlideableView>
    //    3    5:iconst_0        
    //    4    6:invokespecial   #661 <Method boolean openPane(View, int)>
    //    5    9:ireturn         
    }

    public void requestChildFocus(View view, View view1)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #665 <Method void ViewGroup.requestChildFocus(View, View)>
    //    4    6:aload_0         
    //    5    7:invokevirtual   #668 <Method boolean isInTouchMode()>
    //    6   10:ifne            35
    //    7   13:aload_0         
    //    8   14:getfield        #335 <Field boolean mCanSlide>
    //    9   17:ifne            35
    //   10   20:aload_1         
    //   11   21:aload_0         
    //   12   22:getfield        #171 <Field View mSlideableView>
    //   13   25:if_acmpne       36
    //   14   28:iconst_1        
    //   15   29:istore_3        
    //   16   30:aload_0         
    //   17   31:iload_3         
    //   18   32:putfield        #175 <Field boolean mPreservedOpenState>
    //   19   35:return          
    //   20   36:iconst_0        
    //   21   37:istore_3        
    //   22   38:goto            30
    }

    void setAllChildrenVisible()
    {
    //    0    0:iconst_0        
    //    1    1:istore_1        
    //    2    2:aload_0         
    //    3    3:invokevirtual   #278 <Method int getChildCount()>
    //    4    6:istore_2        
    //    5    7:iload_1         
    //    6    8:iload_2         
    //    7    9:icmpge          37
    //    8   12:aload_0         
    //    9   13:iload_1         
    //   10   14:invokevirtual   #282 <Method View getChildAt(int)>
    //   11   17:astore_3        
    //   12   18:aload_3         
    //   13   19:invokevirtual   #550 <Method int View.getVisibility()>
    //   14   22:iconst_4        
    //   15   23:icmpne          31
    //   16   26:aload_3         
    //   17   27:iconst_0        
    //   18   28:invokevirtual   #672 <Method void View.setVisibility(int)>
    //   19   31:iinc            1  1
    //   20   34:goto            7
    //   21   37:return          
    }

    public void setCoveredFadeColor(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #289 <Field int mCoveredFadeColor>
    //    3    5:return          
    }

    public void setPanelSlideListener(PanelSlideListener panelslidelistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #355 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
    //    3    5:return          
    }

    public void setParallaxDistance(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #263 <Field int mParallaxBy>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #679 <Method void requestLayout()>
    //    5    9:return          
    }

    public void setShadowDrawable(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #377 <Field Drawable mShadowDrawable>
    //    3    5:return          
    }

    public void setShadowResource(int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokevirtual   #683 <Method Resources getResources()>
    //    3    5:iload_1         
    //    4    6:invokevirtual   #687 <Method Drawable Resources.getDrawable(int)>
    //    5    9:invokevirtual   #689 <Method void setShadowDrawable(Drawable)>
    //    6   12:return          
    }

    public void setSliderFadeColor(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #75  <Field int mSliderFadeColor>
    //    3    5:return          
    }

    public void smoothSlideClosed()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #637 <Method boolean closePane()>
    //    2    4:pop             
    //    3    5:return          
    }

    public void smoothSlideOpen()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #635 <Method boolean openPane()>
    //    2    4:pop             
    //    3    5:return          
    }

    boolean smoothSlideTo(float f, int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #335 <Field boolean mCanSlide>
    //    2    4:ifne            9
    //    3    7:iconst_0        
    //    4    8:ireturn         
    //    5    9:aload_0         
    //    6   10:getfield        #171 <Field View mSlideableView>
    //    7   13:invokevirtual   #204 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //    8   16:checkcast       #206 <Class SlidingPaneLayout$LayoutParams>
    //    9   19:astore_3        
    //   10   20:aload_0         
    //   11   21:invokevirtual   #258 <Method int getPaddingLeft()>
    //   12   24:aload_3         
    //   13   25:getfield        #261 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
    //   14   28:iadd            
    //   15   29:i2f             
    //   16   30:fload_1         
    //   17   31:aload_0         
    //   18   32:getfield        #184 <Field int mSlideRange>
    //   19   35:i2f             
    //   20   36:fmul            
    //   21   37:fadd            
    //   22   38:f2i             
    //   23   39:istore          4
    //   24   41:aload_0         
    //   25   42:getfield        #146 <Field ViewDragHelper mDragHelper>
    //   26   45:aload_0         
    //   27   46:getfield        #171 <Field View mSlideableView>
    //   28   49:iload           4
    //   29   51:aload_0         
    //   30   52:getfield        #171 <Field View mSlideableView>
    //   31   55:invokevirtual   #322 <Method int View.getTop()>
    //   32   58:invokevirtual   #695 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
    //   33   61:ifeq            7
    //   34   64:aload_0         
    //   35   65:invokevirtual   #697 <Method void setAllChildrenVisible()>
    //   36   68:aload_0         
    //   37   69:invokestatic    #352 <Method void ViewCompat.postInvalidateOnAnimation(View)>
    //   38   72:iconst_1        
    //   39   73:ireturn         
    }

    void updateObscuredViewsVisibility(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #258 <Method int getPaddingLeft()>
    //    2    4:istore_2        
    //    3    5:aload_0         
    //    4    6:invokevirtual   #698 <Method int getWidth()>
    //    5    9:aload_0         
    //    6   10:invokevirtual   #544 <Method int getPaddingRight()>
    //    7   13:isub            
    //    8   14:istore_3        
    //    9   15:aload_0         
    //   10   16:invokevirtual   #547 <Method int getPaddingTop()>
    //   11   19:istore          4
    //   12   21:aload_0         
    //   13   22:invokevirtual   #701 <Method int getHeight()>
    //   14   25:aload_0         
    //   15   26:invokevirtual   #597 <Method int getPaddingBottom()>
    //   16   29:isub            
    //   17   30:istore          5
    //   18   32:aload_1         
    //   19   33:ifnull          98
    //   20   36:aload_1         
    //   21   37:invokestatic    #703 <Method boolean viewIsOpaque(View)>
    //   22   40:ifeq            98
    //   23   43:aload_1         
    //   24   44:invokevirtual   #316 <Method int View.getLeft()>
    //   25   47:istore          7
    //   26   49:aload_1         
    //   27   50:invokevirtual   #319 <Method int View.getRight()>
    //   28   53:istore          8
    //   29   55:aload_1         
    //   30   56:invokevirtual   #322 <Method int View.getTop()>
    //   31   59:istore          9
    //   32   61:aload_1         
    //   33   62:invokevirtual   #325 <Method int View.getBottom()>
    //   34   65:istore          6
    //   35   67:iconst_0        
    //   36   68:istore          10
    //   37   70:aload_0         
    //   38   71:invokevirtual   #278 <Method int getChildCount()>
    //   39   74:istore          11
    //   40   76:iload           10
    //   41   78:iload           11
    //   42   80:icmpge          97
    //   43   83:aload_0         
    //   44   84:iload           10
    //   45   86:invokevirtual   #282 <Method View getChildAt(int)>
    //   46   89:astore          12
    //   47   91:aload           12
    //   48   93:aload_1         
    //   49   94:if_acmpne       113
    //   50   97:return          
    //   51   98:iconst_0        
    //   52   99:istore          6
    //   53  101:iconst_0        
    //   54  102:istore          7
    //   55  104:iconst_0        
    //   56  105:istore          8
    //   57  107:iconst_0        
    //   58  108:istore          9
    //   59  110:goto            67
    //   60  113:iload_2         
    //   61  114:aload           12
    //   62  116:invokevirtual   #316 <Method int View.getLeft()>
    //   63  119:invokestatic    #615 <Method int Math.max(int, int)>
    //   64  122:istore          13
    //   65  124:iload           4
    //   66  126:aload           12
    //   67  128:invokevirtual   #322 <Method int View.getTop()>
    //   68  131:invokestatic    #615 <Method int Math.max(int, int)>
    //   69  134:istore          14
    //   70  136:iload_3         
    //   71  137:aload           12
    //   72  139:invokevirtual   #319 <Method int View.getRight()>
    //   73  142:invokestatic    #409 <Method int Math.min(int, int)>
    //   74  145:istore          15
    //   75  147:iload           5
    //   76  149:aload           12
    //   77  151:invokevirtual   #325 <Method int View.getBottom()>
    //   78  154:invokestatic    #409 <Method int Math.min(int, int)>
    //   79  157:istore          16
    //   80  159:iload           13
    //   81  161:iload           7
    //   82  163:icmplt          203
    //   83  166:iload           14
    //   84  168:iload           9
    //   85  170:icmplt          203
    //   86  173:iload           15
    //   87  175:iload           8
    //   88  177:icmpgt          203
    //   89  180:iload           16
    //   90  182:iload           6
    //   91  184:icmpgt          203
    //   92  187:iconst_4        
    //   93  188:istore          17
    //   94  190:aload           12
    //   95  192:iload           17
    //   96  194:invokevirtual   #672 <Method void View.setVisibility(int)>
    //   97  197:iinc            10  1
    //   98  200:goto            76
    //   99  203:iconst_0        
    //  100  204:istore          17
    //  101  206:goto            190
    }

    private static final int DEFAULT_FADE_COLOR = 0xcccccccc;
    private static final int DEFAULT_OVERHANG_SIZE = 32;
    static final SlidingPanelLayoutImpl IMPL;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final String TAG = "SlidingPaneLayout";
    private boolean mCanSlide;
    private int mCoveredFadeColor;
    private final ViewDragHelper mDragHelper;
    private boolean mFirstLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private boolean mIsUnableToDrag;
    private final int mOverhangSize;
    private PanelSlideListener mPanelSlideListener;
    private int mParallaxBy;
    private float mParallaxOffset;
    private final ArrayList mPostedRunnables;
    private boolean mPreservedOpenState;
    private Drawable mShadowDrawable;
    private float mSlideOffset;
    private int mSlideRange;
    private View mSlideableView;
    private int mSliderFadeColor;
    private final Rect mTmpRect;

    static boolean access$100(SlidingPaneLayout slidingpanelayout)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #159 <Field boolean mIsUnableToDrag>
    //    2    4:ireturn         
    }

    static ArrayList access$1000(SlidingPaneLayout slidingpanelayout)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #87  <Field ArrayList mPostedRunnables>
    //    2    4:areturn         
    }

    static ViewDragHelper access$200(SlidingPaneLayout slidingpanelayout)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #146 <Field ViewDragHelper mDragHelper>
    //    2    4:areturn         
    }

    static float access$300(SlidingPaneLayout slidingpanelayout)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #167 <Field float mSlideOffset>
    //    2    4:freturn         
    }

    static View access$400(SlidingPaneLayout slidingpanelayout)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #171 <Field View mSlideableView>
    //    2    4:areturn         
    }

    static boolean access$502(SlidingPaneLayout slidingpanelayout, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #175 <Field boolean mPreservedOpenState>
    //    3    5:iload_1         
    //    4    6:ireturn         
    }

    static void access$600(SlidingPaneLayout slidingpanelayout, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #180 <Method void onPanelDragged(int)>
    //    3    5:return          
    }

    static int access$700(SlidingPaneLayout slidingpanelayout)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #184 <Field int mSlideRange>
    //    2    4:ireturn         
    }

    static void access$900(SlidingPaneLayout slidingpanelayout, View view)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #190 <Method void invalidateChildRegion(View)>
    //    3    5:return          
    }

    // Unreferenced inner class android/support/v4/widget/SlidingPaneLayout$1

/* anonymous class */
    static class _cls1
    {
    }


    // Unreferenced inner class android/support/v4/widget/SlidingPaneLayout$SavedState$1

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
        //    0    0:new             #9   <Class SlidingPaneLayout$SavedState>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:aconst_null     
        //    4    6:invokespecial   #18  <Method void SlidingPaneLayout$SavedState(Parcel, SlidingPaneLayout$1)>
        //    5    9:areturn         
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #21  <Method SlidingPaneLayout$SavedState createFromParcel(Parcel)>
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
        //    2    2:invokevirtual   #26  <Method SlidingPaneLayout$SavedState[] newArray(int)>
        //    3    5:areturn         
        }
    }

}
