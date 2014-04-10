// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.os.*;
import android.support.v4.view.*;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.widget:
//            ViewDragHelper

public class DrawerLayout extends ViewGroup
{
    class AccessibilityDelegate extends AccessibilityDelegateCompat
    {

        AccessibilityDelegate()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field DrawerLayout this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void AccessibilityDelegateCompat()>
        //    5    9:aload_0         
        //    6   10:new             #17  <Class Rect>
        //    7   13:dup             
        //    8   14:invokespecial   #18  <Method void Rect()>
        //    9   17:putfield        #20  <Field Rect mTmpRect>
        //   10   20:return          
        }

        private void addChildrenForAccessibility(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, ViewGroup viewgroup)
        {
        //    0    0:aload_2         
        //    1    1:invokevirtual   #28  <Method int ViewGroup.getChildCount()>
        //    2    4:istore_3        
        //    3    5:iconst_0        
        //    4    6:istore          4
        //    5    8:iload           4
        //    6   10:iload_3         
        //    7   11:icmpge          115
        //    8   14:aload_2         
        //    9   15:iload           4
        //   10   17:invokevirtual   #32  <Method View ViewGroup.getChildAt(int)>
        //   11   20:astore          5
        //   12   22:aload_0         
        //   13   23:aload           5
        //   14   25:invokevirtual   #36  <Method boolean filter(View)>
        //   15   28:ifeq            37
        //   16   31:iinc            4  1
        //   17   34:goto            8
        //   18   37:aload           5
        //   19   39:invokestatic    #42  <Method int ViewCompat.getImportantForAccessibility(View)>
        //   20   42:tableswitch     0 4: default 76
        //                       0 79
        //                       1 85
        //                       2 94
        //                       3 76
        //                       4 31
        //   21   76:goto            31
        //   22   79:aload           5
        //   23   81:iconst_1        
        //   24   82:invokestatic    #46  <Method void ViewCompat.setImportantForAccessibility(View, int)>
        //   25   85:aload_1         
        //   26   86:aload           5
        //   27   88:invokevirtual   #52  <Method void AccessibilityNodeInfoCompat.addChild(View)>
        //   28   91:goto            31
        //   29   94:aload           5
        //   30   96:instanceof      #24  <Class ViewGroup>
        //   31   99:ifeq            31
        //   32  102:aload_0         
        //   33  103:aload_1         
        //   34  104:aload           5
        //   35  106:checkcast       #24  <Class ViewGroup>
        //   36  109:invokespecial   #54  <Method void addChildrenForAccessibility(AccessibilityNodeInfoCompat, ViewGroup)>
        //   37  112:goto            31
        //   38  115:return          
        }

        private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, AccessibilityNodeInfoCompat accessibilitynodeinfocompat1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #20  <Field Rect mTmpRect>
        //    2    4:astore_3        
        //    3    5:aload_2         
        //    4    6:aload_3         
        //    5    7:invokevirtual   #60  <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
        //    6   10:aload_1         
        //    7   11:aload_3         
        //    8   12:invokevirtual   #63  <Method void AccessibilityNodeInfoCompat.setBoundsInParent(Rect)>
        //    9   15:aload_2         
        //   10   16:aload_3         
        //   11   17:invokevirtual   #66  <Method void AccessibilityNodeInfoCompat.getBoundsInScreen(Rect)>
        //   12   20:aload_1         
        //   13   21:aload_3         
        //   14   22:invokevirtual   #69  <Method void AccessibilityNodeInfoCompat.setBoundsInScreen(Rect)>
        //   15   25:aload_1         
        //   16   26:aload_2         
        //   17   27:invokevirtual   #73  <Method boolean AccessibilityNodeInfoCompat.isVisibleToUser()>
        //   18   30:invokevirtual   #77  <Method void AccessibilityNodeInfoCompat.setVisibleToUser(boolean)>
        //   19   33:aload_1         
        //   20   34:aload_2         
        //   21   35:invokevirtual   #81  <Method CharSequence AccessibilityNodeInfoCompat.getPackageName()>
        //   22   38:invokevirtual   #85  <Method void AccessibilityNodeInfoCompat.setPackageName(CharSequence)>
        //   23   41:aload_1         
        //   24   42:aload_2         
        //   25   43:invokevirtual   #88  <Method CharSequence AccessibilityNodeInfoCompat.getClassName()>
        //   26   46:invokevirtual   #91  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
        //   27   49:aload_1         
        //   28   50:aload_2         
        //   29   51:invokevirtual   #94  <Method CharSequence AccessibilityNodeInfoCompat.getContentDescription()>
        //   30   54:invokevirtual   #97  <Method void AccessibilityNodeInfoCompat.setContentDescription(CharSequence)>
        //   31   57:aload_1         
        //   32   58:aload_2         
        //   33   59:invokevirtual   #100 <Method boolean AccessibilityNodeInfoCompat.isEnabled()>
        //   34   62:invokevirtual   #103 <Method void AccessibilityNodeInfoCompat.setEnabled(boolean)>
        //   35   65:aload_1         
        //   36   66:aload_2         
        //   37   67:invokevirtual   #106 <Method boolean AccessibilityNodeInfoCompat.isClickable()>
        //   38   70:invokevirtual   #109 <Method void AccessibilityNodeInfoCompat.setClickable(boolean)>
        //   39   73:aload_1         
        //   40   74:aload_2         
        //   41   75:invokevirtual   #112 <Method boolean AccessibilityNodeInfoCompat.isFocusable()>
        //   42   78:invokevirtual   #115 <Method void AccessibilityNodeInfoCompat.setFocusable(boolean)>
        //   43   81:aload_1         
        //   44   82:aload_2         
        //   45   83:invokevirtual   #118 <Method boolean AccessibilityNodeInfoCompat.isFocused()>
        //   46   86:invokevirtual   #121 <Method void AccessibilityNodeInfoCompat.setFocused(boolean)>
        //   47   89:aload_1         
        //   48   90:aload_2         
        //   49   91:invokevirtual   #124 <Method boolean AccessibilityNodeInfoCompat.isAccessibilityFocused()>
        //   50   94:invokevirtual   #127 <Method void AccessibilityNodeInfoCompat.setAccessibilityFocused(boolean)>
        //   51   97:aload_1         
        //   52   98:aload_2         
        //   53   99:invokevirtual   #130 <Method boolean AccessibilityNodeInfoCompat.isSelected()>
        //   54  102:invokevirtual   #133 <Method void AccessibilityNodeInfoCompat.setSelected(boolean)>
        //   55  105:aload_1         
        //   56  106:aload_2         
        //   57  107:invokevirtual   #136 <Method boolean AccessibilityNodeInfoCompat.isLongClickable()>
        //   58  110:invokevirtual   #139 <Method void AccessibilityNodeInfoCompat.setLongClickable(boolean)>
        //   59  113:aload_1         
        //   60  114:aload_2         
        //   61  115:invokevirtual   #142 <Method int AccessibilityNodeInfoCompat.getActions()>
        //   62  118:invokevirtual   #146 <Method void AccessibilityNodeInfoCompat.addAction(int)>
        //   63  121:return          
        }

        public boolean filter(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field DrawerLayout this$0>
        //    2    4:invokevirtual   #152 <Method View DrawerLayout.findOpenDrawer()>
        //    3    7:astore_2        
        //    4    8:aload_2         
        //    5    9:ifnull          19
        //    6   12:aload_2         
        //    7   13:aload_1         
        //    8   14:if_acmpeq       19
        //    9   17:iconst_1        
        //   10   18:ireturn         
        //   11   19:iconst_0        
        //   12   20:ireturn         
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
        //    0    0:aload_2         
        //    1    1:invokestatic    #158 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain(AccessibilityNodeInfoCompat)>
        //    2    4:astore_3        
        //    3    5:aload_0         
        //    4    6:aload_1         
        //    5    7:aload_3         
        //    6    8:invokespecial   #160 <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
        //    7   11:aload_2         
        //    8   12:aload_1         
        //    9   13:invokevirtual   #163 <Method void AccessibilityNodeInfoCompat.setSource(View)>
        //   10   16:aload_1         
        //   11   17:invokestatic    #167 <Method android.view.ViewParent ViewCompat.getParentForAccessibility(View)>
        //   12   20:astore          4
        //   13   22:aload           4
        //   14   24:instanceof      #169 <Class View>
        //   15   27:ifeq            39
        //   16   30:aload_2         
        //   17   31:aload           4
        //   18   33:checkcast       #169 <Class View>
        //   19   36:invokevirtual   #172 <Method void AccessibilityNodeInfoCompat.setParent(View)>
        //   20   39:aload_0         
        //   21   40:aload_2         
        //   22   41:aload_3         
        //   23   42:invokespecial   #174 <Method void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat, AccessibilityNodeInfoCompat)>
        //   24   45:aload_3         
        //   25   46:invokevirtual   #177 <Method void AccessibilityNodeInfoCompat.recycle()>
        //   26   49:aload_0         
        //   27   50:aload_2         
        //   28   51:aload_1         
        //   29   52:checkcast       #24  <Class ViewGroup>
        //   30   55:invokespecial   #54  <Method void addChildrenForAccessibility(AccessibilityNodeInfoCompat, ViewGroup)>
        //   31   58:return          
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:aload_2         
        //    2    2:invokevirtual   #36  <Method boolean filter(View)>
        //    3    5:ifne            16
        //    4    8:aload_0         
        //    5    9:aload_1         
        //    6   10:aload_2         
        //    7   11:aload_3         
        //    8   12:invokespecial   #181 <Method boolean AccessibilityDelegateCompat.onRequestSendAccessibilityEvent(ViewGroup, View, AccessibilityEvent)>
        //    9   15:ireturn         
        //   10   16:iconst_0        
        //   11   17:ireturn         
        }

        private final Rect mTmpRect;
        final DrawerLayout this$0;
    }

    public static interface DrawerListener
    {

        public abstract void onDrawerClosed(View view);

        public abstract void onDrawerOpened(View view);

        public abstract void onDrawerSlide(View view, float f);

        public abstract void onDrawerStateChanged(int i);
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public LayoutParams(int i, int j)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #15  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
        //    4    6:aload_0         
        //    5    7:iconst_0        
        //    6    8:putfield        #17  <Field int gravity>
        //    7   11:return          
        }

        public LayoutParams(int i, int j, int k)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #19  <Method void DrawerLayout$LayoutParams(int, int)>
        //    4    6:aload_0         
        //    5    7:iload_3         
        //    6    8:putfield        #17  <Field int gravity>
        //    7   11:return          
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:invokespecial   #22  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
        //    4    6:aload_0         
        //    5    7:iconst_0        
        //    6    8:putfield        #17  <Field int gravity>
        //    7   11:aload_1         
        //    8   12:aload_2         
        //    9   13:invokestatic    #28  <Method int[] DrawerLayout.access$100()>
        //   10   16:invokevirtual   #34  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
        //   11   19:astore_3        
        //   12   20:aload_0         
        //   13   21:aload_3         
        //   14   22:iconst_0        
        //   15   23:iconst_0        
        //   16   24:invokevirtual   #40  <Method int TypedArray.getInt(int, int)>
        //   17   27:putfield        #17  <Field int gravity>
        //   18   30:aload_3         
        //   19   31:invokevirtual   #44  <Method void TypedArray.recycle()>
        //   20   34:return          
        }

        public LayoutParams(LayoutParams layoutparams)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #48  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
        //    3    5:aload_0         
        //    4    6:iconst_0        
        //    5    7:putfield        #17  <Field int gravity>
        //    6   10:aload_0         
        //    7   11:aload_1         
        //    8   12:getfield        #17  <Field int gravity>
        //    9   15:putfield        #17  <Field int gravity>
        //   10   18:return          
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #51  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
        //    3    5:aload_0         
        //    4    6:iconst_0        
        //    5    7:putfield        #17  <Field int gravity>
        //    6   10:return          
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #48  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
        //    3    5:aload_0         
        //    4    6:iconst_0        
        //    5    7:putfield        #17  <Field int gravity>
        //    6   10:return          
        }

        public int gravity;
        boolean isPeeking;
        boolean knownOpen;
        float onScreen;
    }

    protected static class SavedState extends android.view.View.BaseSavedState
    {

        static 
        {
        //    0    0:new             #15  <Class DrawerLayout$SavedState$1>
        //    1    3:dup             
        //    2    4:invokespecial   #18  <Method void DrawerLayout$SavedState$1()>
        //    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
        //    4   10:return          
        }

        public SavedState(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #23  <Method void android.view.View$BaseSavedState(Parcel)>
        //    3    5:aload_0         
        //    4    6:iconst_0        
        //    5    7:putfield        #25  <Field int openDrawerGravity>
        //    6   10:aload_0         
        //    7   11:iconst_0        
        //    8   12:putfield        #27  <Field int lockModeLeft>
        //    9   15:aload_0         
        //   10   16:iconst_0        
        //   11   17:putfield        #29  <Field int lockModeRight>
        //   12   20:aload_0         
        //   13   21:aload_1         
        //   14   22:invokevirtual   #35  <Method int Parcel.readInt()>
        //   15   25:putfield        #25  <Field int openDrawerGravity>
        //   16   28:return          
        }

        public SavedState(Parcelable parcelable)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #38  <Method void android.view.View$BaseSavedState(Parcelable)>
        //    3    5:aload_0         
        //    4    6:iconst_0        
        //    5    7:putfield        #25  <Field int openDrawerGravity>
        //    6   10:aload_0         
        //    7   11:iconst_0        
        //    8   12:putfield        #27  <Field int lockModeLeft>
        //    9   15:aload_0         
        //   10   16:iconst_0        
        //   11   17:putfield        #29  <Field int lockModeRight>
        //   12   20:return          
        }

        public void writeToParcel(Parcel parcel, int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #42  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
        //    4    6:aload_1         
        //    5    7:aload_0         
        //    6    8:getfield        #25  <Field int openDrawerGravity>
        //    7   11:invokevirtual   #46  <Method void Parcel.writeInt(int)>
        //    8   14:return          
        }

        public static final android.os.Parcelable.Creator CREATOR;
        int lockModeLeft;
        int lockModeRight;
        int openDrawerGravity;
    }

    public static abstract class SimpleDrawerListener
        implements DrawerListener
    {

        public SimpleDrawerListener()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public void onDrawerClosed(View view)
        {
        //    0    0:return          
        }

        public void onDrawerOpened(View view)
        {
        //    0    0:return          
        }

        public void onDrawerSlide(View view, float f)
        {
        //    0    0:return          
        }

        public void onDrawerStateChanged(int i)
        {
        //    0    0:return          
        }
    }

    private class ViewDragCallback extends ViewDragHelper.Callback
    {

        public ViewDragCallback(int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field DrawerLayout this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void ViewDragHelper$Callback()>
        //    5    9:aload_0         
        //    6   10:new             #21  <Class DrawerLayout$ViewDragCallback$1>
        //    7   13:dup             
        //    8   14:aload_0         
        //    9   15:invokespecial   #24  <Method void DrawerLayout$ViewDragCallback$1(DrawerLayout$ViewDragCallback)>
        //   10   18:putfield        #26  <Field Runnable mPeekRunnable>
        //   11   21:aload_0         
        //   12   22:iload_2         
        //   13   23:putfield        #28  <Field int mAbsGravity>
        //   14   26:return          
        }

        static void access$000(ViewDragCallback viewdragcallback)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #32  <Method void peekDrawer()>
        //    2    4:return          
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:invokespecial   #32  <Method void peekDrawer()>
        //    5    4:return          
        }

        private void closeOtherDrawer()
        {
        //    0    0:iconst_3        
        //    1    1:istore_1        
        //    2    2:aload_0         
        //    3    3:getfield        #28  <Field int mAbsGravity>
        //    4    6:iload_1         
        //    5    7:icmpne          12
        //    6   10:iconst_5        
        //    7   11:istore_1        
        //    8   12:aload_0         
        //    9   13:getfield        #16  <Field DrawerLayout this$0>
        //   10   16:iload_1         
        //   11   17:invokevirtual   #39  <Method View DrawerLayout.findDrawerWithGravity(int)>
        //   12   20:astore_2        
        //   13   21:aload_2         
        //   14   22:ifnull          33
        //   15   25:aload_0         
        //   16   26:getfield        #16  <Field DrawerLayout this$0>
        //   17   29:aload_2         
        //   18   30:invokevirtual   #43  <Method void DrawerLayout.closeDrawer(View)>
        //   19   33:return          
        }

        private void peekDrawer()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #45  <Field ViewDragHelper mDragger>
        //    2    4:invokevirtual   #51  <Method int ViewDragHelper.getEdgeSize()>
        //    3    7:istore_1        
        //    4    8:aload_0         
        //    5    9:getfield        #28  <Field int mAbsGravity>
        //    6   12:iconst_3        
        //    7   13:icmpne          141
        //    8   16:iconst_1        
        //    9   17:istore_2        
        //   10   18:iload_2         
        //   11   19:ifeq            146
        //   12   22:aload_0         
        //   13   23:getfield        #16  <Field DrawerLayout this$0>
        //   14   26:iconst_3        
        //   15   27:invokevirtual   #39  <Method View DrawerLayout.findDrawerWithGravity(int)>
        //   16   30:astore_3        
        //   17   31:iconst_0        
        //   18   32:istore          7
        //   19   34:aload_3         
        //   20   35:ifnull          45
        //   21   38:aload_3         
        //   22   39:invokevirtual   #56  <Method int View.getWidth()>
        //   23   42:ineg            
        //   24   43:istore          7
        //   25   45:iload           7
        //   26   47:iload_1         
        //   27   48:iadd            
        //   28   49:istore          4
        //   29   51:aload_3         
        //   30   52:ifnull          140
        //   31   55:iload_2         
        //   32   56:ifeq            68
        //   33   59:aload_3         
        //   34   60:invokevirtual   #59  <Method int View.getLeft()>
        //   35   63:iload           4
        //   36   65:icmplt          81
        //   37   68:iload_2         
        //   38   69:ifne            140
        //   39   72:aload_3         
        //   40   73:invokevirtual   #59  <Method int View.getLeft()>
        //   41   76:iload           4
        //   42   78:icmple          140
        //   43   81:aload_0         
        //   44   82:getfield        #16  <Field DrawerLayout this$0>
        //   45   85:aload_3         
        //   46   86:invokevirtual   #63  <Method int DrawerLayout.getDrawerLockMode(View)>
        //   47   89:ifne            140
        //   48   92:aload_3         
        //   49   93:invokevirtual   #67  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
        //   50   96:checkcast       #69  <Class DrawerLayout$LayoutParams>
        //   51   99:astore          5
        //   52  101:aload_0         
        //   53  102:getfield        #45  <Field ViewDragHelper mDragger>
        //   54  105:aload_3         
        //   55  106:iload           4
        //   56  108:aload_3         
        //   57  109:invokevirtual   #72  <Method int View.getTop()>
        //   58  112:invokevirtual   #76  <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
        //   59  115:pop             
        //   60  116:aload           5
        //   61  118:iconst_1        
        //   62  119:putfield        #80  <Field boolean DrawerLayout$LayoutParams.isPeeking>
        //   63  122:aload_0         
        //   64  123:getfield        #16  <Field DrawerLayout this$0>
        //   65  126:invokevirtual   #83  <Method void DrawerLayout.invalidate()>
        //   66  129:aload_0         
        //   67  130:invokespecial   #85  <Method void closeOtherDrawer()>
        //   68  133:aload_0         
        //   69  134:getfield        #16  <Field DrawerLayout this$0>
        //   70  137:invokevirtual   #88  <Method void DrawerLayout.cancelChildViewTouch()>
        //   71  140:return          
        //   72  141:iconst_0        
        //   73  142:istore_2        
        //   74  143:goto            18
        //   75  146:aload_0         
        //   76  147:getfield        #16  <Field DrawerLayout this$0>
        //   77  150:iconst_5        
        //   78  151:invokevirtual   #39  <Method View DrawerLayout.findDrawerWithGravity(int)>
        //   79  154:astore_3        
        //   80  155:aload_0         
        //   81  156:getfield        #16  <Field DrawerLayout this$0>
        //   82  159:invokevirtual   #89  <Method int DrawerLayout.getWidth()>
        //   83  162:iload_1         
        //   84  163:isub            
        //   85  164:istore          4
        //   86  166:goto            51
        }

        public int clampViewPositionHorizontal(View view, int i, int j)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field DrawerLayout this$0>
        //    2    4:aload_1         
        //    3    5:iconst_3        
        //    4    6:invokevirtual   #95  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
        //    5    9:ifeq            26
        //    6   12:aload_1         
        //    7   13:invokevirtual   #56  <Method int View.getWidth()>
        //    8   16:ineg            
        //    9   17:iload_2         
        //   10   18:iconst_0        
        //   11   19:invokestatic    #101 <Method int Math.min(int, int)>
        //   12   22:invokestatic    #104 <Method int Math.max(int, int)>
        //   13   25:ireturn         
        //   14   26:aload_0         
        //   15   27:getfield        #16  <Field DrawerLayout this$0>
        //   16   30:invokevirtual   #89  <Method int DrawerLayout.getWidth()>
        //   17   33:istore          4
        //   18   35:iload           4
        //   19   37:aload_1         
        //   20   38:invokevirtual   #56  <Method int View.getWidth()>
        //   21   41:isub            
        //   22   42:iload_2         
        //   23   43:iload           4
        //   24   45:invokestatic    #101 <Method int Math.min(int, int)>
        //   25   48:invokestatic    #104 <Method int Math.max(int, int)>
        //   26   51:ireturn         
        }

        public int clampViewPositionVertical(View view, int i, int j)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #72  <Method int View.getTop()>
        //    2    4:ireturn         
        }

        public int getViewHorizontalDragRange(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #56  <Method int View.getWidth()>
        //    2    4:ireturn         
        }

        public void onEdgeDragStarted(int i, int j)
        {
        //    0    0:iload_1         
        //    1    1:iconst_1        
        //    2    2:iand            
        //    3    3:iconst_1        
        //    4    4:icmpne          41
        //    5    7:aload_0         
        //    6    8:getfield        #16  <Field DrawerLayout this$0>
        //    7   11:iconst_3        
        //    8   12:invokevirtual   #39  <Method View DrawerLayout.findDrawerWithGravity(int)>
        //    9   15:astore_3        
        //   10   16:aload_3         
        //   11   17:ifnull          40
        //   12   20:aload_0         
        //   13   21:getfield        #16  <Field DrawerLayout this$0>
        //   14   24:aload_3         
        //   15   25:invokevirtual   #63  <Method int DrawerLayout.getDrawerLockMode(View)>
        //   16   28:ifne            40
        //   17   31:aload_0         
        //   18   32:getfield        #45  <Field ViewDragHelper mDragger>
        //   19   35:aload_3         
        //   20   36:iload_2         
        //   21   37:invokevirtual   #112 <Method void ViewDragHelper.captureChildView(View, int)>
        //   22   40:return          
        //   23   41:aload_0         
        //   24   42:getfield        #16  <Field DrawerLayout this$0>
        //   25   45:iconst_5        
        //   26   46:invokevirtual   #39  <Method View DrawerLayout.findDrawerWithGravity(int)>
        //   27   49:astore_3        
        //   28   50:goto            16
        }

        public boolean onEdgeLock(int i)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public void onEdgeTouched(int i, int j)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field DrawerLayout this$0>
        //    2    4:aload_0         
        //    3    5:getfield        #26  <Field Runnable mPeekRunnable>
        //    4    8:ldc2w           #116 <Long 160L>
        //    5   11:invokevirtual   #121 <Method boolean DrawerLayout.postDelayed(Runnable, long)>
        //    6   14:pop             
        //    7   15:return          
        }

        public void onViewCaptured(View view, int i)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #67  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
        //    2    4:checkcast       #69  <Class DrawerLayout$LayoutParams>
        //    3    7:iconst_0        
        //    4    8:putfield        #80  <Field boolean DrawerLayout$LayoutParams.isPeeking>
        //    5   11:aload_0         
        //    6   12:invokespecial   #85  <Method void closeOtherDrawer()>
        //    7   15:return          
        }

        public void onViewDragStateChanged(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field DrawerLayout this$0>
        //    2    4:aload_0         
        //    3    5:getfield        #28  <Field int mAbsGravity>
        //    4    8:iload_1         
        //    5    9:aload_0         
        //    6   10:getfield        #45  <Field ViewDragHelper mDragger>
        //    7   13:invokevirtual   #128 <Method View ViewDragHelper.getCapturedView()>
        //    8   16:invokevirtual   #132 <Method void DrawerLayout.updateDrawerState(int, int, View)>
        //    9   19:return          
        }

        public void onViewPositionChanged(View view, int i, int j, int k, int l)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #56  <Method int View.getWidth()>
        //    2    4:istore          6
        //    3    6:aload_0         
        //    4    7:getfield        #16  <Field DrawerLayout this$0>
        //    5   10:aload_1         
        //    6   11:iconst_3        
        //    7   12:invokevirtual   #95  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
        //    8   15:ifeq            63
        //    9   18:iload           6
        //   10   20:iload_2         
        //   11   21:iadd            
        //   12   22:i2f             
        //   13   23:iload           6
        //   14   25:i2f             
        //   15   26:fdiv            
        //   16   27:fstore          7
        //   17   29:aload_0         
        //   18   30:getfield        #16  <Field DrawerLayout this$0>
        //   19   33:aload_1         
        //   20   34:fload           7
        //   21   36:invokevirtual   #138 <Method void DrawerLayout.setDrawerViewOffset(View, float)>
        //   22   39:fload           7
        //   23   41:fconst_0        
        //   24   42:fcmpl           
        //   25   43:ifne            82
        //   26   46:iconst_4        
        //   27   47:istore          8
        //   28   49:aload_1         
        //   29   50:iload           8
        //   30   52:invokevirtual   #141 <Method void View.setVisibility(int)>
        //   31   55:aload_0         
        //   32   56:getfield        #16  <Field DrawerLayout this$0>
        //   33   59:invokevirtual   #83  <Method void DrawerLayout.invalidate()>
        //   34   62:return          
        //   35   63:aload_0         
        //   36   64:getfield        #16  <Field DrawerLayout this$0>
        //   37   67:invokevirtual   #89  <Method int DrawerLayout.getWidth()>
        //   38   70:iload_2         
        //   39   71:isub            
        //   40   72:i2f             
        //   41   73:iload           6
        //   42   75:i2f             
        //   43   76:fdiv            
        //   44   77:fstore          7
        //   45   79:goto            29
        //   46   82:iconst_0        
        //   47   83:istore          8
        //   48   85:goto            49
        }

        public void onViewReleased(View view, float f, float f1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field DrawerLayout this$0>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #147 <Method float DrawerLayout.getDrawerViewOffset(View)>
        //    4    8:fstore          4
        //    5   10:aload_1         
        //    6   11:invokevirtual   #56  <Method int View.getWidth()>
        //    7   14:istore          5
        //    8   16:aload_0         
        //    9   17:getfield        #16  <Field DrawerLayout this$0>
        //   10   20:aload_1         
        //   11   21:iconst_3        
        //   12   22:invokevirtual   #95  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
        //   13   25:ifeq            81
        //   14   28:fload_2         
        //   15   29:fconst_0        
        //   16   30:fcmpl           
        //   17   31:ifgt            48
        //   18   34:fload_2         
        //   19   35:fconst_0        
        //   20   36:fcmpl           
        //   21   37:ifne            73
        //   22   40:fload           4
        //   23   42:ldc1            #148 <Float 0.5F>
        //   24   44:fcmpl           
        //   25   45:ifle            73
        //   26   48:iconst_0        
        //   27   49:istore          7
        //   28   51:aload_0         
        //   29   52:getfield        #45  <Field ViewDragHelper mDragger>
        //   30   55:iload           7
        //   31   57:aload_1         
        //   32   58:invokevirtual   #72  <Method int View.getTop()>
        //   33   61:invokevirtual   #152 <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
        //   34   64:pop             
        //   35   65:aload_0         
        //   36   66:getfield        #16  <Field DrawerLayout this$0>
        //   37   69:invokevirtual   #83  <Method void DrawerLayout.invalidate()>
        //   38   72:return          
        //   39   73:iload           5
        //   40   75:ineg            
        //   41   76:istore          7
        //   42   78:goto            51
        //   43   81:aload_0         
        //   44   82:getfield        #16  <Field DrawerLayout this$0>
        //   45   85:invokevirtual   #89  <Method int DrawerLayout.getWidth()>
        //   46   88:istore          6
        //   47   90:fload_2         
        //   48   91:fconst_0        
        //   49   92:fcmpg           
        //   50   93:iflt            110
        //   51   96:fload_2         
        //   52   97:fconst_0        
        //   53   98:fcmpl           
        //   54   99:ifne            120
        //   55  102:fload           4
        //   56  104:ldc1            #148 <Float 0.5F>
        //   57  106:fcmpl           
        //   58  107:ifle            120
        //   59  110:iload           6
        //   60  112:iload           5
        //   61  114:isub            
        //   62  115:istore          7
        //   63  117:goto            51
        //   64  120:iload           6
        //   65  122:istore          7
        //   66  124:goto            117
        }

        public void removeCallbacks()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field DrawerLayout this$0>
        //    2    4:aload_0         
        //    3    5:getfield        #26  <Field Runnable mPeekRunnable>
        //    4    8:invokevirtual   #156 <Method boolean DrawerLayout.removeCallbacks(Runnable)>
        //    5   11:pop             
        //    6   12:return          
        }

        public void setDragger(ViewDragHelper viewdraghelper)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #45  <Field ViewDragHelper mDragger>
        //    3    5:return          
        }

        public boolean tryCaptureView(View view, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field DrawerLayout this$0>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #163 <Method boolean DrawerLayout.isDrawerView(View)>
        //    4    8:ifeq            39
        //    5   11:aload_0         
        //    6   12:getfield        #16  <Field DrawerLayout this$0>
        //    7   15:aload_1         
        //    8   16:aload_0         
        //    9   17:getfield        #28  <Field int mAbsGravity>
        //   10   20:invokevirtual   #95  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
        //   11   23:ifeq            39
        //   12   26:aload_0         
        //   13   27:getfield        #16  <Field DrawerLayout this$0>
        //   14   30:aload_1         
        //   15   31:invokevirtual   #63  <Method int DrawerLayout.getDrawerLockMode(View)>
        //   16   34:ifne            39
        //   17   37:iconst_1        
        //   18   38:ireturn         
        //   19   39:iconst_0        
        //   20   40:ireturn         
        }

        private final int mAbsGravity;
        private ViewDragHelper mDragger;
        private final Runnable mPeekRunnable;
        final DrawerLayout this$0;

        static void access$000(ViewDragCallback viewdragcallback)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #32  <Method void peekDrawer()>
        //    2    4:return          
        }
    }


    static 
    {
    //    0    0:iconst_1        
    //    1    1:newarray        int[]
    //    2    3:dup             
    //    3    4:iconst_0        
    //    4    5:ldc1            #62  <Int 0x10100b3>
    //    5    7:iastore         
    //    6    8:putstatic       #64  <Field int[] LAYOUT_ATTRS>
    //    7   11:return          
    }

    public DrawerLayout(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #69  <Method void DrawerLayout(Context, AttributeSet)>
    //    4    6:return          
    }

    public DrawerLayout(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iconst_0        
    //    4    4:invokespecial   #72  <Method void DrawerLayout(Context, AttributeSet, int)>
    //    5    7:return          
    }

    public DrawerLayout(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #73  <Method void ViewGroup(Context, AttributeSet, int)>
    //    5    7:aload_0         
    //    6    8:ldc1            #12  <Int 0x99000000>
    //    7   10:putfield        #75  <Field int mScrimColor>
    //    8   13:aload_0         
    //    9   14:new             #77  <Class Paint>
    //   10   17:dup             
    //   11   18:invokespecial   #79  <Method void Paint()>
    //   12   21:putfield        #81  <Field Paint mScrimPaint>
    //   13   24:aload_0         
    //   14   25:iconst_1        
    //   15   26:putfield        #83  <Field boolean mFirstLayout>
    //   16   29:aload_0         
    //   17   30:invokevirtual   #87  <Method Resources getResources()>
    //   18   33:invokevirtual   #93  <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   19   36:getfield        #98  <Field float DisplayMetrics.density>
    //   20   39:fstore          4
    //   21   41:aload_0         
    //   22   42:ldc1            #99  <Float 0.5F>
    //   23   44:ldc1            #100 <Float 64F>
    //   24   46:fload           4
    //   25   48:fmul            
    //   26   49:fadd            
    //   27   50:f2i             
    //   28   51:putfield        #102 <Field int mMinDrawerMargin>
    //   29   54:ldc1            #103 <Float 400F>
    //   30   56:fload           4
    //   31   58:fmul            
    //   32   59:fstore          5
    //   33   61:aload_0         
    //   34   62:new             #105 <Class DrawerLayout$ViewDragCallback>
    //   35   65:dup             
    //   36   66:aload_0         
    //   37   67:iconst_3        
    //   38   68:invokespecial   #108 <Method void DrawerLayout$ViewDragCallback(DrawerLayout, int)>
    //   39   71:putfield        #110 <Field DrawerLayout$ViewDragCallback mLeftCallback>
    //   40   74:aload_0         
    //   41   75:new             #105 <Class DrawerLayout$ViewDragCallback>
    //   42   78:dup             
    //   43   79:aload_0         
    //   44   80:iconst_5        
    //   45   81:invokespecial   #108 <Method void DrawerLayout$ViewDragCallback(DrawerLayout, int)>
    //   46   84:putfield        #112 <Field DrawerLayout$ViewDragCallback mRightCallback>
    //   47   87:aload_0         
    //   48   88:aload_0         
    //   49   89:fconst_1        
    //   50   90:aload_0         
    //   51   91:getfield        #110 <Field DrawerLayout$ViewDragCallback mLeftCallback>
    //   52   94:invokestatic    #118 <Method ViewDragHelper ViewDragHelper.create(ViewGroup, float, ViewDragHelper$Callback)>
    //   53   97:putfield        #120 <Field ViewDragHelper mLeftDragger>
    //   54  100:aload_0         
    //   55  101:getfield        #120 <Field ViewDragHelper mLeftDragger>
    //   56  104:iconst_1        
    //   57  105:invokevirtual   #124 <Method void ViewDragHelper.setEdgeTrackingEnabled(int)>
    //   58  108:aload_0         
    //   59  109:getfield        #120 <Field ViewDragHelper mLeftDragger>
    //   60  112:fload           5
    //   61  114:invokevirtual   #128 <Method void ViewDragHelper.setMinVelocity(float)>
    //   62  117:aload_0         
    //   63  118:getfield        #110 <Field DrawerLayout$ViewDragCallback mLeftCallback>
    //   64  121:aload_0         
    //   65  122:getfield        #120 <Field ViewDragHelper mLeftDragger>
    //   66  125:invokevirtual   #132 <Method void DrawerLayout$ViewDragCallback.setDragger(ViewDragHelper)>
    //   67  128:aload_0         
    //   68  129:aload_0         
    //   69  130:fconst_1        
    //   70  131:aload_0         
    //   71  132:getfield        #112 <Field DrawerLayout$ViewDragCallback mRightCallback>
    //   72  135:invokestatic    #118 <Method ViewDragHelper ViewDragHelper.create(ViewGroup, float, ViewDragHelper$Callback)>
    //   73  138:putfield        #134 <Field ViewDragHelper mRightDragger>
    //   74  141:aload_0         
    //   75  142:getfield        #134 <Field ViewDragHelper mRightDragger>
    //   76  145:iconst_2        
    //   77  146:invokevirtual   #124 <Method void ViewDragHelper.setEdgeTrackingEnabled(int)>
    //   78  149:aload_0         
    //   79  150:getfield        #134 <Field ViewDragHelper mRightDragger>
    //   80  153:fload           5
    //   81  155:invokevirtual   #128 <Method void ViewDragHelper.setMinVelocity(float)>
    //   82  158:aload_0         
    //   83  159:getfield        #112 <Field DrawerLayout$ViewDragCallback mRightCallback>
    //   84  162:aload_0         
    //   85  163:getfield        #134 <Field ViewDragHelper mRightDragger>
    //   86  166:invokevirtual   #132 <Method void DrawerLayout$ViewDragCallback.setDragger(ViewDragHelper)>
    //   87  169:aload_0         
    //   88  170:iconst_1        
    //   89  171:invokevirtual   #138 <Method void setFocusableInTouchMode(boolean)>
    //   90  174:aload_0         
    //   91  175:new             #140 <Class DrawerLayout$AccessibilityDelegate>
    //   92  178:dup             
    //   93  179:aload_0         
    //   94  180:invokespecial   #143 <Method void DrawerLayout$AccessibilityDelegate(DrawerLayout)>
    //   95  183:invokestatic    #149 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
    //   96  186:aload_0         
    //   97  187:iconst_0        
    //   98  188:invokestatic    #155 <Method void ViewGroupCompat.setMotionEventSplittingEnabled(ViewGroup, boolean)>
    //   99  191:return          
    }

    static int[] access$100()
    {
    //    0    0:getstatic       #64  <Field int[] LAYOUT_ATTRS>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #64  <Field int[] LAYOUT_ATTRS>
    //    3    3:areturn         
    }

    private View findVisibleDrawer()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #163 <Method int getChildCount()>
    //    2    4:istore_1        
    //    3    5:iconst_0        
    //    4    6:istore_2        
    //    5    7:iload_2         
    //    6    8:iload_1         
    //    7    9:icmpge          42
    //    8   12:aload_0         
    //    9   13:iload_2         
    //   10   14:invokevirtual   #167 <Method View getChildAt(int)>
    //   11   17:astore_3        
    //   12   18:aload_0         
    //   13   19:aload_3         
    //   14   20:invokevirtual   #171 <Method boolean isDrawerView(View)>
    //   15   23:ifeq            36
    //   16   26:aload_0         
    //   17   27:aload_3         
    //   18   28:invokevirtual   #174 <Method boolean isDrawerVisible(View)>
    //   19   31:ifeq            36
    //   20   34:aload_3         
    //   21   35:areturn         
    //   22   36:iinc            2  1
    //   23   39:goto            7
    //   24   42:aconst_null     
    //   25   43:areturn         
    }

    static String gravityToString(int i)
    {
    //    0    0:iload_0         
    //    1    1:iconst_3        
    //    2    2:iand            
    //    3    3:iconst_3        
    //    4    4:icmpne          10
    //    5    7:ldc1            #178 <String "LEFT">
    //    6    9:areturn         
    //    7   10:iload_0         
    //    8   11:iconst_5        
    //    9   12:iand            
    //   10   13:iconst_5        
    //   11   14:icmpne          20
    //   12   17:ldc1            #180 <String "RIGHT">
    //   13   19:areturn         
    //   14   20:iload_0         
    //   15   21:invokestatic    #185 <Method String Integer.toHexString(int)>
    //   16   24:areturn         
    }

    private static boolean hasOpaqueBackground(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #192 <Method Drawable View.getBackground()>
    //    2    4:astore_1        
    //    3    5:iconst_0        
    //    4    6:istore_2        
    //    5    7:aload_1         
    //    6    8:ifnull          25
    //    7   11:aload_1         
    //    8   12:invokevirtual   #197 <Method int Drawable.getOpacity()>
    //    9   15:istore_3        
    //   10   16:iconst_0        
    //   11   17:istore_2        
    //   12   18:iload_3         
    //   13   19:iconst_m1       
    //   14   20:icmpne          25
    //   15   23:iconst_1        
    //   16   24:istore_2        
    //   17   25:iload_2         
    //   18   26:ireturn         
    }

    private boolean hasPeekingDrawer()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #163 <Method int getChildCount()>
    //    2    4:istore_1        
    //    3    5:iconst_0        
    //    4    6:istore_2        
    //    5    7:iload_2         
    //    6    8:iload_1         
    //    7    9:icmpge          37
    //    8   12:aload_0         
    //    9   13:iload_2         
    //   10   14:invokevirtual   #167 <Method View getChildAt(int)>
    //   11   17:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   12   20:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //   13   23:getfield        #208 <Field boolean DrawerLayout$LayoutParams.isPeeking>
    //   14   26:ifeq            31
    //   15   29:iconst_1        
    //   16   30:ireturn         
    //   17   31:iinc            2  1
    //   18   34:goto            7
    //   19   37:iconst_0        
    //   20   38:ireturn         
    }

    private boolean hasVisibleDrawer()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #211 <Method View findVisibleDrawer()>
    //    2    4:ifnull          9
    //    3    7:iconst_1        
    //    4    8:ireturn         
    //    5    9:iconst_0        
    //    6   10:ireturn         
    }

    void cancelChildViewTouch()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #214 <Field boolean mChildrenCanceledTouch>
    //    2    4:ifne            63
    //    3    7:invokestatic    #220 <Method long SystemClock.uptimeMillis()>
    //    4   10:lstore_1        
    //    5   11:lload_1         
    //    6   12:lload_1         
    //    7   13:iconst_3        
    //    8   14:fconst_0        
    //    9   15:fconst_0        
    //   10   16:iconst_0        
    //   11   17:invokestatic    #226 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
    //   12   20:astore_3        
    //   13   21:aload_0         
    //   14   22:invokevirtual   #163 <Method int getChildCount()>
    //   15   25:istore          4
    //   16   27:iconst_0        
    //   17   28:istore          5
    //   18   30:iload           5
    //   19   32:iload           4
    //   20   34:icmpge          54
    //   21   37:aload_0         
    //   22   38:iload           5
    //   23   40:invokevirtual   #167 <Method View getChildAt(int)>
    //   24   43:aload_3         
    //   25   44:invokevirtual   #230 <Method boolean View.dispatchTouchEvent(MotionEvent)>
    //   26   47:pop             
    //   27   48:iinc            5  1
    //   28   51:goto            30
    //   29   54:aload_3         
    //   30   55:invokevirtual   #233 <Method void MotionEvent.recycle()>
    //   31   58:aload_0         
    //   32   59:iconst_1        
    //   33   60:putfield        #214 <Field boolean mChildrenCanceledTouch>
    //   34   63:return          
    }

    boolean checkDrawerViewAbsoluteGravity(View view, int i)
    {
    //    0    0:iload_2         
    //    1    1:aload_0         
    //    2    2:aload_1         
    //    3    3:invokevirtual   #239 <Method int getDrawerViewAbsoluteGravity(View)>
    //    4    6:iand            
    //    5    7:iload_2         
    //    6    8:icmpne          13
    //    7   11:iconst_1        
    //    8   12:ireturn         
    //    9   13:iconst_0        
    //   10   14:ireturn         
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:aload_1         
    //    1    1:instanceof      #205 <Class DrawerLayout$LayoutParams>
    //    2    4:ifeq            17
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:invokespecial   #243 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
    //    6   12:ifeq            17
    //    7   15:iconst_1        
    //    8   16:ireturn         
    //    9   17:iconst_0        
    //   10   18:ireturn         
    }

    public void closeDrawer(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #247 <Method View findDrawerWithGravity(int)>
    //    3    5:astore_2        
    //    4    6:aload_2         
    //    5    7:ifnonnull       40
    //    6   10:new             #249 <Class IllegalArgumentException>
    //    7   13:dup             
    //    8   14:new             #251 <Class StringBuilder>
    //    9   17:dup             
    //   10   18:invokespecial   #252 <Method void StringBuilder()>
    //   11   21:ldc1            #254 <String "No drawer view found with gravity ">
    //   12   23:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //   13   26:iload_1         
    //   14   27:invokestatic    #260 <Method String gravityToString(int)>
    //   15   30:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //   16   33:invokevirtual   #264 <Method String StringBuilder.toString()>
    //   17   36:invokespecial   #267 <Method void IllegalArgumentException(String)>
    //   18   39:athrow          
    //   19   40:aload_0         
    //   20   41:aload_2         
    //   21   42:invokevirtual   #270 <Method void closeDrawer(View)>
    //   22   45:return          
    }

    public void closeDrawer(View view)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #171 <Method boolean isDrawerView(View)>
    //    3    5:ifne            42
    //    4    8:new             #249 <Class IllegalArgumentException>
    //    5   11:dup             
    //    6   12:new             #251 <Class StringBuilder>
    //    7   15:dup             
    //    8   16:invokespecial   #252 <Method void StringBuilder()>
    //    9   19:ldc2            #272 <String "View ">
    //   10   22:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //   11   25:aload_1         
    //   12   26:invokevirtual   #275 <Method StringBuilder StringBuilder.append(Object)>
    //   13   29:ldc2            #277 <String " is not a sliding drawer">
    //   14   32:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //   15   35:invokevirtual   #264 <Method String StringBuilder.toString()>
    //   16   38:invokespecial   #267 <Method void IllegalArgumentException(String)>
    //   17   41:athrow          
    //   18   42:aload_0         
    //   19   43:getfield        #83  <Field boolean mFirstLayout>
    //   20   46:ifeq            75
    //   21   49:aload_1         
    //   22   50:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   23   53:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //   24   56:astore          4
    //   25   58:aload           4
    //   26   60:fconst_0        
    //   27   61:putfield        #280 <Field float DrawerLayout$LayoutParams.onScreen>
    //   28   64:aload           4
    //   29   66:iconst_0        
    //   30   67:putfield        #283 <Field boolean DrawerLayout$LayoutParams.knownOpen>
    //   31   70:aload_0         
    //   32   71:invokevirtual   #286 <Method void invalidate()>
    //   33   74:return          
    //   34   75:aload_0         
    //   35   76:aload_1         
    //   36   77:iconst_3        
    //   37   78:invokevirtual   #288 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
    //   38   81:ifeq            105
    //   39   84:aload_0         
    //   40   85:getfield        #120 <Field ViewDragHelper mLeftDragger>
    //   41   88:aload_1         
    //   42   89:aload_1         
    //   43   90:invokevirtual   #291 <Method int View.getWidth()>
    //   44   93:ineg            
    //   45   94:aload_1         
    //   46   95:invokevirtual   #294 <Method int View.getTop()>
    //   47   98:invokevirtual   #298 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
    //   48  101:pop             
    //   49  102:goto            70
    //   50  105:aload_0         
    //   51  106:getfield        #134 <Field ViewDragHelper mRightDragger>
    //   52  109:aload_1         
    //   53  110:aload_0         
    //   54  111:invokevirtual   #299 <Method int getWidth()>
    //   55  114:aload_1         
    //   56  115:invokevirtual   #294 <Method int View.getTop()>
    //   57  118:invokevirtual   #298 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
    //   58  121:pop             
    //   59  122:goto            70
    }

    public void closeDrawers()
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:invokevirtual   #302 <Method void closeDrawers(boolean)>
    //    3    5:return          
    }

    void closeDrawers(boolean flag)
    {
    //    0    0:iconst_0        
    //    1    1:istore_2        
    //    2    2:aload_0         
    //    3    3:invokevirtual   #163 <Method int getChildCount()>
    //    4    6:istore_3        
    //    5    7:iconst_0        
    //    6    8:istore          4
    //    7   10:iload           4
    //    8   12:iload_3         
    //    9   13:icmpge          131
    //   10   16:aload_0         
    //   11   17:iload           4
    //   12   19:invokevirtual   #167 <Method View getChildAt(int)>
    //   13   22:astore          5
    //   14   24:aload           5
    //   15   26:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   16   29:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //   17   32:astore          6
    //   18   34:aload_0         
    //   19   35:aload           5
    //   20   37:invokevirtual   #171 <Method boolean isDrawerView(View)>
    //   21   40:ifeq            55
    //   22   43:iload_1         
    //   23   44:ifeq            61
    //   24   47:aload           6
    //   25   49:getfield        #208 <Field boolean DrawerLayout$LayoutParams.isPeeking>
    //   26   52:ifne            61
    //   27   55:iinc            4  1
    //   28   58:goto            10
    //   29   61:aload           5
    //   30   63:invokevirtual   #291 <Method int View.getWidth()>
    //   31   66:istore          7
    //   32   68:aload_0         
    //   33   69:aload           5
    //   34   71:iconst_3        
    //   35   72:invokevirtual   #288 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
    //   36   75:ifeq            107
    //   37   78:iload_2         
    //   38   79:aload_0         
    //   39   80:getfield        #120 <Field ViewDragHelper mLeftDragger>
    //   40   83:aload           5
    //   41   85:iload           7
    //   42   87:ineg            
    //   43   88:aload           5
    //   44   90:invokevirtual   #294 <Method int View.getTop()>
    //   45   93:invokevirtual   #298 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
    //   46   96:ior             
    //   47   97:istore_2        
    //   48   98:aload           6
    //   49  100:iconst_0        
    //   50  101:putfield        #208 <Field boolean DrawerLayout$LayoutParams.isPeeking>
    //   51  104:goto            55
    //   52  107:iload_2         
    //   53  108:aload_0         
    //   54  109:getfield        #134 <Field ViewDragHelper mRightDragger>
    //   55  112:aload           5
    //   56  114:aload_0         
    //   57  115:invokevirtual   #299 <Method int getWidth()>
    //   58  118:aload           5
    //   59  120:invokevirtual   #294 <Method int View.getTop()>
    //   60  123:invokevirtual   #298 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
    //   61  126:ior             
    //   62  127:istore_2        
    //   63  128:goto            98
    //   64  131:aload_0         
    //   65  132:getfield        #110 <Field DrawerLayout$ViewDragCallback mLeftCallback>
    //   66  135:invokevirtual   #305 <Method void DrawerLayout$ViewDragCallback.removeCallbacks()>
    //   67  138:aload_0         
    //   68  139:getfield        #112 <Field DrawerLayout$ViewDragCallback mRightCallback>
    //   69  142:invokevirtual   #305 <Method void DrawerLayout$ViewDragCallback.removeCallbacks()>
    //   70  145:iload_2         
    //   71  146:ifeq            153
    //   72  149:aload_0         
    //   73  150:invokevirtual   #286 <Method void invalidate()>
    //   74  153:return          
    }

    public void computeScroll()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #163 <Method int getChildCount()>
    //    2    4:istore_1        
    //    3    5:fconst_0        
    //    4    6:fstore_2        
    //    5    7:iconst_0        
    //    6    8:istore_3        
    //    7    9:iload_3         
    //    8   10:iload_1         
    //    9   11:icmpge          39
    //   10   14:fload_2         
    //   11   15:aload_0         
    //   12   16:iload_3         
    //   13   17:invokevirtual   #167 <Method View getChildAt(int)>
    //   14   20:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   15   23:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //   16   26:getfield        #280 <Field float DrawerLayout$LayoutParams.onScreen>
    //   17   29:invokestatic    #312 <Method float Math.max(float, float)>
    //   18   32:fstore_2        
    //   19   33:iinc            3  1
    //   20   36:goto            9
    //   21   39:aload_0         
    //   22   40:fload_2         
    //   23   41:putfield        #314 <Field float mScrimOpacity>
    //   24   44:aload_0         
    //   25   45:getfield        #120 <Field ViewDragHelper mLeftDragger>
    //   26   48:iconst_1        
    //   27   49:invokevirtual   #318 <Method boolean ViewDragHelper.continueSettling(boolean)>
    //   28   52:aload_0         
    //   29   53:getfield        #134 <Field ViewDragHelper mRightDragger>
    //   30   56:iconst_1        
    //   31   57:invokevirtual   #318 <Method boolean ViewDragHelper.continueSettling(boolean)>
    //   32   60:ior             
    //   33   61:ifeq            68
    //   34   64:aload_0         
    //   35   65:invokestatic    #321 <Method void ViewCompat.postInvalidateOnAnimation(View)>
    //   36   68:return          
    }

    void dispatchOnDrawerClosed(View view)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //    2    4:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:getfield        #283 <Field boolean DrawerLayout$LayoutParams.knownOpen>
    //    6   12:ifeq            43
    //    7   15:aload_2         
    //    8   16:iconst_0        
    //    9   17:putfield        #283 <Field boolean DrawerLayout$LayoutParams.knownOpen>
    //   10   20:aload_0         
    //   11   21:getfield        #324 <Field DrawerLayout$DrawerListener mListener>
    //   12   24:ifnull          37
    //   13   27:aload_0         
    //   14   28:getfield        #324 <Field DrawerLayout$DrawerListener mListener>
    //   15   31:aload_1         
    //   16   32:invokeinterface #329 <Method void DrawerLayout$DrawerListener.onDrawerClosed(View)>
    //   17   37:aload_0         
    //   18   38:bipush          32
    //   19   40:invokevirtual   #332 <Method void sendAccessibilityEvent(int)>
    //   20   43:return          
    }

    void dispatchOnDrawerOpened(View view)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //    2    4:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:getfield        #283 <Field boolean DrawerLayout$LayoutParams.knownOpen>
    //    6   12:ifne            43
    //    7   15:aload_2         
    //    8   16:iconst_1        
    //    9   17:putfield        #283 <Field boolean DrawerLayout$LayoutParams.knownOpen>
    //   10   20:aload_0         
    //   11   21:getfield        #324 <Field DrawerLayout$DrawerListener mListener>
    //   12   24:ifnull          37
    //   13   27:aload_0         
    //   14   28:getfield        #324 <Field DrawerLayout$DrawerListener mListener>
    //   15   31:aload_1         
    //   16   32:invokeinterface #336 <Method void DrawerLayout$DrawerListener.onDrawerOpened(View)>
    //   17   37:aload_1         
    //   18   38:bipush          32
    //   19   40:invokevirtual   #337 <Method void View.sendAccessibilityEvent(int)>
    //   20   43:return          
    }

    void dispatchOnDrawerSlide(View view, float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #324 <Field DrawerLayout$DrawerListener mListener>
    //    2    4:ifnull          18
    //    3    7:aload_0         
    //    4    8:getfield        #324 <Field DrawerLayout$DrawerListener mListener>
    //    5   11:aload_1         
    //    6   12:fload_2         
    //    7   13:invokeinterface #342 <Method void DrawerLayout$DrawerListener.onDrawerSlide(View, float)>
    //    8   18:return          
    }

    protected boolean drawChild(Canvas canvas, View view, long l)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #347 <Method int getHeight()>
    //    2    4:istore          5
    //    3    6:aload_0         
    //    4    7:aload_2         
    //    5    8:invokevirtual   #350 <Method boolean isContentView(View)>
    //    6   11:istore          6
    //    7   13:aload_0         
    //    8   14:invokevirtual   #299 <Method int getWidth()>
    //    9   17:istore          7
    //   10   19:aload_1         
    //   11   20:invokevirtual   #355 <Method int Canvas.save()>
    //   12   23:istore          8
    //   13   25:iconst_0        
    //   14   26:istore          9
    //   15   28:iload           6
    //   16   30:ifeq            170
    //   17   33:aload_0         
    //   18   34:invokevirtual   #163 <Method int getChildCount()>
    //   19   37:istore          21
    //   20   39:iconst_0        
    //   21   40:istore          22
    //   22   42:iload           22
    //   23   44:iload           21
    //   24   46:icmpge          156
    //   25   49:aload_0         
    //   26   50:iload           22
    //   27   52:invokevirtual   #167 <Method View getChildAt(int)>
    //   28   55:astore          24
    //   29   57:aload           24
    //   30   59:aload_2         
    //   31   60:if_acmpeq       98
    //   32   63:aload           24
    //   33   65:invokevirtual   #358 <Method int View.getVisibility()>
    //   34   68:ifne            98
    //   35   71:aload           24
    //   36   73:invokestatic    #360 <Method boolean hasOpaqueBackground(View)>
    //   37   76:ifeq            98
    //   38   79:aload_0         
    //   39   80:aload           24
    //   40   82:invokevirtual   #171 <Method boolean isDrawerView(View)>
    //   41   85:ifeq            98
    //   42   88:aload           24
    //   43   90:invokevirtual   #361 <Method int View.getHeight()>
    //   44   93:iload           5
    //   45   95:icmpge          104
    //   46   98:iinc            22  1
    //   47  101:goto            42
    //   48  104:aload_0         
    //   49  105:aload           24
    //   50  107:iconst_3        
    //   51  108:invokevirtual   #288 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
    //   52  111:ifeq            135
    //   53  114:aload           24
    //   54  116:invokevirtual   #364 <Method int View.getRight()>
    //   55  119:istore          26
    //   56  121:iload           26
    //   57  123:iload           9
    //   58  125:icmple          98
    //   59  128:iload           26
    //   60  130:istore          9
    //   61  132:goto            98
    //   62  135:aload           24
    //   63  137:invokevirtual   #367 <Method int View.getLeft()>
    //   64  140:istore          25
    //   65  142:iload           25
    //   66  144:iload           7
    //   67  146:icmpge          98
    //   68  149:iload           25
    //   69  151:istore          7
    //   70  153:goto            98
    //   71  156:aload_1         
    //   72  157:iload           9
    //   73  159:iconst_0        
    //   74  160:iload           7
    //   75  162:aload_0         
    //   76  163:invokevirtual   #347 <Method int getHeight()>
    //   77  166:invokevirtual   #371 <Method boolean Canvas.clipRect(int, int, int, int)>
    //   78  169:pop             
    //   79  170:aload_0         
    //   80  171:aload_1         
    //   81  172:aload_2         
    //   82  173:lload_3         
    //   83  174:invokespecial   #373 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
    //   84  177:istore          10
    //   85  179:aload_1         
    //   86  180:iload           8
    //   87  182:invokevirtual   #376 <Method void Canvas.restoreToCount(int)>
    //   88  185:aload_0         
    //   89  186:getfield        #314 <Field float mScrimOpacity>
    //   90  189:fconst_0        
    //   91  190:fcmpl           
    //   92  191:ifle            263
    //   93  194:iload           6
    //   94  196:ifeq            263
    //   95  199:ldc2            #377 <Int 0xff000000>
    //   96  202:aload_0         
    //   97  203:getfield        #75  <Field int mScrimColor>
    //   98  206:iand            
    //   99  207:bipush          24
    //  100  209:iushr           
    //  101  210:i2f             
    //  102  211:aload_0         
    //  103  212:getfield        #314 <Field float mScrimOpacity>
    //  104  215:fmul            
    //  105  216:f2i             
    //  106  217:bipush          24
    //  107  219:ishl            
    //  108  220:ldc2            #378 <Int 0xffffff>
    //  109  223:aload_0         
    //  110  224:getfield        #75  <Field int mScrimColor>
    //  111  227:iand            
    //  112  228:ior             
    //  113  229:istore          20
    //  114  231:aload_0         
    //  115  232:getfield        #81  <Field Paint mScrimPaint>
    //  116  235:iload           20
    //  117  237:invokevirtual   #381 <Method void Paint.setColor(int)>
    //  118  240:aload_1         
    //  119  241:iload           9
    //  120  243:i2f             
    //  121  244:fconst_0        
    //  122  245:iload           7
    //  123  247:i2f             
    //  124  248:aload_0         
    //  125  249:invokevirtual   #347 <Method int getHeight()>
    //  126  252:i2f             
    //  127  253:aload_0         
    //  128  254:getfield        #81  <Field Paint mScrimPaint>
    //  129  257:invokevirtual   #385 <Method void Canvas.drawRect(float, float, float, float, Paint)>
    //  130  260:iload           10
    //  131  262:ireturn         
    //  132  263:aload_0         
    //  133  264:getfield        #387 <Field Drawable mShadowLeft>
    //  134  267:ifnull          367
    //  135  270:aload_0         
    //  136  271:aload_2         
    //  137  272:iconst_3        
    //  138  273:invokevirtual   #288 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
    //  139  276:ifeq            367
    //  140  279:aload_0         
    //  141  280:getfield        #387 <Field Drawable mShadowLeft>
    //  142  283:invokevirtual   #390 <Method int Drawable.getIntrinsicWidth()>
    //  143  286:istore          16
    //  144  288:aload_2         
    //  145  289:invokevirtual   #364 <Method int View.getRight()>
    //  146  292:istore          17
    //  147  294:aload_0         
    //  148  295:getfield        #120 <Field ViewDragHelper mLeftDragger>
    //  149  298:invokevirtual   #393 <Method int ViewDragHelper.getEdgeSize()>
    //  150  301:istore          18
    //  151  303:fconst_0        
    //  152  304:iload           17
    //  153  306:i2f             
    //  154  307:iload           18
    //  155  309:i2f             
    //  156  310:fdiv            
    //  157  311:fconst_1        
    //  158  312:invokestatic    #396 <Method float Math.min(float, float)>
    //  159  315:invokestatic    #312 <Method float Math.max(float, float)>
    //  160  318:fstore          19
    //  161  320:aload_0         
    //  162  321:getfield        #387 <Field Drawable mShadowLeft>
    //  163  324:iload           17
    //  164  326:aload_2         
    //  165  327:invokevirtual   #294 <Method int View.getTop()>
    //  166  330:iload           17
    //  167  332:iload           16
    //  168  334:iadd            
    //  169  335:aload_2         
    //  170  336:invokevirtual   #399 <Method int View.getBottom()>
    //  171  339:invokevirtual   #403 <Method void Drawable.setBounds(int, int, int, int)>
    //  172  342:aload_0         
    //  173  343:getfield        #387 <Field Drawable mShadowLeft>
    //  174  346:ldc2            #404 <Float 255F>
    //  175  349:fload           19
    //  176  351:fmul            
    //  177  352:f2i             
    //  178  353:invokevirtual   #407 <Method void Drawable.setAlpha(int)>
    //  179  356:aload_0         
    //  180  357:getfield        #387 <Field Drawable mShadowLeft>
    //  181  360:aload_1         
    //  182  361:invokevirtual   #411 <Method void Drawable.draw(Canvas)>
    //  183  364:iload           10
    //  184  366:ireturn         
    //  185  367:aload_0         
    //  186  368:getfield        #413 <Field Drawable mShadowRight>
    //  187  371:ifnull          260
    //  188  374:aload_0         
    //  189  375:aload_2         
    //  190  376:iconst_5        
    //  191  377:invokevirtual   #288 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
    //  192  380:ifeq            260
    //  193  383:aload_0         
    //  194  384:getfield        #413 <Field Drawable mShadowRight>
    //  195  387:invokevirtual   #390 <Method int Drawable.getIntrinsicWidth()>
    //  196  390:istore          11
    //  197  392:aload_2         
    //  198  393:invokevirtual   #367 <Method int View.getLeft()>
    //  199  396:istore          12
    //  200  398:aload_0         
    //  201  399:invokevirtual   #299 <Method int getWidth()>
    //  202  402:iload           12
    //  203  404:isub            
    //  204  405:istore          13
    //  205  407:aload_0         
    //  206  408:getfield        #134 <Field ViewDragHelper mRightDragger>
    //  207  411:invokevirtual   #393 <Method int ViewDragHelper.getEdgeSize()>
    //  208  414:istore          14
    //  209  416:fconst_0        
    //  210  417:iload           13
    //  211  419:i2f             
    //  212  420:iload           14
    //  213  422:i2f             
    //  214  423:fdiv            
    //  215  424:fconst_1        
    //  216  425:invokestatic    #396 <Method float Math.min(float, float)>
    //  217  428:invokestatic    #312 <Method float Math.max(float, float)>
    //  218  431:fstore          15
    //  219  433:aload_0         
    //  220  434:getfield        #413 <Field Drawable mShadowRight>
    //  221  437:iload           12
    //  222  439:iload           11
    //  223  441:isub            
    //  224  442:aload_2         
    //  225  443:invokevirtual   #294 <Method int View.getTop()>
    //  226  446:iload           12
    //  227  448:aload_2         
    //  228  449:invokevirtual   #399 <Method int View.getBottom()>
    //  229  452:invokevirtual   #403 <Method void Drawable.setBounds(int, int, int, int)>
    //  230  455:aload_0         
    //  231  456:getfield        #413 <Field Drawable mShadowRight>
    //  232  459:ldc2            #404 <Float 255F>
    //  233  462:fload           15
    //  234  464:fmul            
    //  235  465:f2i             
    //  236  466:invokevirtual   #407 <Method void Drawable.setAlpha(int)>
    //  237  469:aload_0         
    //  238  470:getfield        #413 <Field Drawable mShadowRight>
    //  239  473:aload_1         
    //  240  474:invokevirtual   #411 <Method void Drawable.draw(Canvas)>
    //  241  477:iload           10
    //  242  479:ireturn         
    }

    View findDrawerWithGravity(int i)
    {
    //    0    0:bipush          7
    //    1    2:iload_1         
    //    2    3:aload_0         
    //    3    4:invokestatic    #416 <Method int ViewCompat.getLayoutDirection(View)>
    //    4    7:invokestatic    #422 <Method int GravityCompat.getAbsoluteGravity(int, int)>
    //    5   10:iand            
    //    6   11:istore_2        
    //    7   12:aload_0         
    //    8   13:invokevirtual   #163 <Method int getChildCount()>
    //    9   16:istore_3        
    //   10   17:iconst_0        
    //   11   18:istore          4
    //   12   20:iload           4
    //   13   22:iload_3         
    //   14   23:icmpge          56
    //   15   26:aload_0         
    //   16   27:iload           4
    //   17   29:invokevirtual   #167 <Method View getChildAt(int)>
    //   18   32:astore          5
    //   19   34:bipush          7
    //   20   36:aload_0         
    //   21   37:aload           5
    //   22   39:invokevirtual   #239 <Method int getDrawerViewAbsoluteGravity(View)>
    //   23   42:iand            
    //   24   43:iload_2         
    //   25   44:icmpne          50
    //   26   47:aload           5
    //   27   49:areturn         
    //   28   50:iinc            4  1
    //   29   53:goto            20
    //   30   56:aconst_null     
    //   31   57:areturn         
    }

    View findOpenDrawer()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #163 <Method int getChildCount()>
    //    2    4:istore_1        
    //    3    5:iconst_0        
    //    4    6:istore_2        
    //    5    7:iload_2         
    //    6    8:iload_1         
    //    7    9:icmpge          39
    //    8   12:aload_0         
    //    9   13:iload_2         
    //   10   14:invokevirtual   #167 <Method View getChildAt(int)>
    //   11   17:astore_3        
    //   12   18:aload_3         
    //   13   19:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   14   22:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //   15   25:getfield        #283 <Field boolean DrawerLayout$LayoutParams.knownOpen>
    //   16   28:ifeq            33
    //   17   31:aload_3         
    //   18   32:areturn         
    //   19   33:iinc            2  1
    //   20   36:goto            7
    //   21   39:aconst_null     
    //   22   40:areturn         
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
    //    0    0:new             #205 <Class DrawerLayout$LayoutParams>
    //    1    3:dup             
    //    2    4:iconst_m1       
    //    3    5:iconst_m1       
    //    4    6:invokespecial   #427 <Method void DrawerLayout$LayoutParams(int, int)>
    //    5    9:areturn         
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
    //    0    0:new             #205 <Class DrawerLayout$LayoutParams>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokevirtual   #433 <Method Context getContext()>
    //    4    8:aload_1         
    //    5    9:invokespecial   #434 <Method void DrawerLayout$LayoutParams(Context, AttributeSet)>
    //    6   12:areturn         
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:aload_1         
    //    1    1:instanceof      #205 <Class DrawerLayout$LayoutParams>
    //    2    4:ifeq            19
    //    3    7:new             #205 <Class DrawerLayout$LayoutParams>
    //    4   10:dup             
    //    5   11:aload_1         
    //    6   12:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //    7   15:invokespecial   #438 <Method void DrawerLayout$LayoutParams(DrawerLayout$LayoutParams)>
    //    8   18:areturn         
    //    9   19:aload_1         
    //   10   20:instanceof      #440 <Class android.view.ViewGroup$MarginLayoutParams>
    //   11   23:ifeq            38
    //   12   26:new             #205 <Class DrawerLayout$LayoutParams>
    //   13   29:dup             
    //   14   30:aload_1         
    //   15   31:checkcast       #440 <Class android.view.ViewGroup$MarginLayoutParams>
    //   16   34:invokespecial   #443 <Method void DrawerLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
    //   17   37:areturn         
    //   18   38:new             #205 <Class DrawerLayout$LayoutParams>
    //   19   41:dup             
    //   20   42:aload_1         
    //   21   43:invokespecial   #446 <Method void DrawerLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
    //   22   46:areturn         
    }

    public int getDrawerLockMode(int i)
    {
    //    0    0:iload_1         
    //    1    1:aload_0         
    //    2    2:invokestatic    #416 <Method int ViewCompat.getLayoutDirection(View)>
    //    3    5:invokestatic    #422 <Method int GravityCompat.getAbsoluteGravity(int, int)>
    //    4    8:istore_2        
    //    5    9:iload_2         
    //    6   10:iconst_3        
    //    7   11:icmpne          19
    //    8   14:aload_0         
    //    9   15:getfield        #450 <Field int mLockModeLeft>
    //   10   18:ireturn         
    //   11   19:iload_2         
    //   12   20:iconst_5        
    //   13   21:icmpne          29
    //   14   24:aload_0         
    //   15   25:getfield        #452 <Field int mLockModeRight>
    //   16   28:ireturn         
    //   17   29:iconst_0        
    //   18   30:ireturn         
    }

    public int getDrawerLockMode(View view)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #239 <Method int getDrawerViewAbsoluteGravity(View)>
    //    3    5:istore_2        
    //    4    6:iload_2         
    //    5    7:iconst_3        
    //    6    8:icmpne          16
    //    7   11:aload_0         
    //    8   12:getfield        #450 <Field int mLockModeLeft>
    //    9   15:ireturn         
    //   10   16:iload_2         
    //   11   17:iconst_5        
    //   12   18:icmpne          26
    //   13   21:aload_0         
    //   14   22:getfield        #452 <Field int mLockModeRight>
    //   15   25:ireturn         
    //   16   26:iconst_0        
    //   17   27:ireturn         
    }

    int getDrawerViewAbsoluteGravity(View view)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //    2    4:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //    3    7:getfield        #455 <Field int DrawerLayout$LayoutParams.gravity>
    //    4   10:aload_0         
    //    5   11:invokestatic    #416 <Method int ViewCompat.getLayoutDirection(View)>
    //    6   14:invokestatic    #422 <Method int GravityCompat.getAbsoluteGravity(int, int)>
    //    7   17:ireturn         
    }

    float getDrawerViewOffset(View view)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //    2    4:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //    3    7:getfield        #280 <Field float DrawerLayout$LayoutParams.onScreen>
    //    4   10:freturn         
    }

    boolean isContentView(View view)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //    2    4:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //    3    7:getfield        #455 <Field int DrawerLayout$LayoutParams.gravity>
    //    4   10:ifne            15
    //    5   13:iconst_1        
    //    6   14:ireturn         
    //    7   15:iconst_0        
    //    8   16:ireturn         
    }

    public boolean isDrawerOpen(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #247 <Method View findDrawerWithGravity(int)>
    //    3    5:astore_2        
    //    4    6:aload_2         
    //    5    7:ifnull          16
    //    6   10:aload_0         
    //    7   11:aload_2         
    //    8   12:invokevirtual   #461 <Method boolean isDrawerOpen(View)>
    //    9   15:ireturn         
    //   10   16:iconst_0        
    //   11   17:ireturn         
    }

    public boolean isDrawerOpen(View view)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #171 <Method boolean isDrawerView(View)>
    //    3    5:ifne            42
    //    4    8:new             #249 <Class IllegalArgumentException>
    //    5   11:dup             
    //    6   12:new             #251 <Class StringBuilder>
    //    7   15:dup             
    //    8   16:invokespecial   #252 <Method void StringBuilder()>
    //    9   19:ldc2            #272 <String "View ">
    //   10   22:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //   11   25:aload_1         
    //   12   26:invokevirtual   #275 <Method StringBuilder StringBuilder.append(Object)>
    //   13   29:ldc2            #463 <String " is not a drawer">
    //   14   32:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //   15   35:invokevirtual   #264 <Method String StringBuilder.toString()>
    //   16   38:invokespecial   #267 <Method void IllegalArgumentException(String)>
    //   17   41:athrow          
    //   18   42:aload_1         
    //   19   43:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   20   46:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //   21   49:getfield        #283 <Field boolean DrawerLayout$LayoutParams.knownOpen>
    //   22   52:ireturn         
    }

    boolean isDrawerView(View view)
    {
    //    0    0:bipush          7
    //    1    2:aload_1         
    //    2    3:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //    3    6:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //    4    9:getfield        #455 <Field int DrawerLayout$LayoutParams.gravity>
    //    5   12:aload_1         
    //    6   13:invokestatic    #416 <Method int ViewCompat.getLayoutDirection(View)>
    //    7   16:invokestatic    #422 <Method int GravityCompat.getAbsoluteGravity(int, int)>
    //    8   19:iand            
    //    9   20:ifeq            25
    //   10   23:iconst_1        
    //   11   24:ireturn         
    //   12   25:iconst_0        
    //   13   26:ireturn         
    }

    public boolean isDrawerVisible(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #247 <Method View findDrawerWithGravity(int)>
    //    3    5:astore_2        
    //    4    6:aload_2         
    //    5    7:ifnull          16
    //    6   10:aload_0         
    //    7   11:aload_2         
    //    8   12:invokevirtual   #174 <Method boolean isDrawerVisible(View)>
    //    9   15:ireturn         
    //   10   16:iconst_0        
    //   11   17:ireturn         
    }

    public boolean isDrawerVisible(View view)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #171 <Method boolean isDrawerView(View)>
    //    3    5:ifne            42
    //    4    8:new             #249 <Class IllegalArgumentException>
    //    5   11:dup             
    //    6   12:new             #251 <Class StringBuilder>
    //    7   15:dup             
    //    8   16:invokespecial   #252 <Method void StringBuilder()>
    //    9   19:ldc2            #272 <String "View ">
    //   10   22:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //   11   25:aload_1         
    //   12   26:invokevirtual   #275 <Method StringBuilder StringBuilder.append(Object)>
    //   13   29:ldc2            #463 <String " is not a drawer">
    //   14   32:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //   15   35:invokevirtual   #264 <Method String StringBuilder.toString()>
    //   16   38:invokespecial   #267 <Method void IllegalArgumentException(String)>
    //   17   41:athrow          
    //   18   42:aload_1         
    //   19   43:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   20   46:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //   21   49:getfield        #280 <Field float DrawerLayout$LayoutParams.onScreen>
    //   22   52:fconst_0        
    //   23   53:fcmpl           
    //   24   54:ifle            59
    //   25   57:iconst_1        
    //   26   58:ireturn         
    //   27   59:iconst_0        
    //   28   60:ireturn         
    }

    void moveDrawerToOffset(View view, float f)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #466 <Method float getDrawerViewOffset(View)>
    //    3    5:fstore_3        
    //    4    6:aload_1         
    //    5    7:invokevirtual   #291 <Method int View.getWidth()>
    //    6   10:istore          4
    //    7   12:fload_3         
    //    8   13:iload           4
    //    9   15:i2f             
    //   10   16:fmul            
    //   11   17:f2i             
    //   12   18:istore          5
    //   13   20:fload_2         
    //   14   21:iload           4
    //   15   23:i2f             
    //   16   24:fmul            
    //   17   25:f2i             
    //   18   26:iload           5
    //   19   28:isub            
    //   20   29:istore          6
    //   21   31:aload_0         
    //   22   32:aload_1         
    //   23   33:iconst_3        
    //   24   34:invokevirtual   #288 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
    //   25   37:ifeq            53
    //   26   40:aload_1         
    //   27   41:iload           6
    //   28   43:invokevirtual   #469 <Method void View.offsetLeftAndRight(int)>
    //   29   46:aload_0         
    //   30   47:aload_1         
    //   31   48:fload_2         
    //   32   49:invokevirtual   #472 <Method void setDrawerViewOffset(View, float)>
    //   33   52:return          
    //   34   53:iload           6
    //   35   55:ineg            
    //   36   56:istore          6
    //   37   58:goto            40
    }

    protected void onAttachedToWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #475 <Method void ViewGroup.onAttachedToWindow()>
    //    2    4:aload_0         
    //    3    5:iconst_1        
    //    4    6:putfield        #83  <Field boolean mFirstLayout>
    //    5    9:return          
    }

    protected void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #478 <Method void ViewGroup.onDetachedFromWindow()>
    //    2    4:aload_0         
    //    3    5:iconst_1        
    //    4    6:putfield        #83  <Field boolean mFirstLayout>
    //    5    9:return          
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
    //    0    0:aload_1         
    //    1    1:invokestatic    #485 <Method int MotionEventCompat.getActionMasked(MotionEvent)>
    //    2    4:istore_2        
    //    3    5:aload_0         
    //    4    6:getfield        #120 <Field ViewDragHelper mLeftDragger>
    //    5    9:aload_1         
    //    6   10:invokevirtual   #488 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
    //    7   13:aload_0         
    //    8   14:getfield        #134 <Field ViewDragHelper mRightDragger>
    //    9   17:aload_1         
    //   10   18:invokevirtual   #488 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
    //   11   21:ior             
    //   12   22:istore_3        
    //   13   23:iconst_0        
    //   14   24:istore          4
    //   15   26:iload_2         
    //   16   27:tableswitch     0 3: default 56
    //                   0 92
    //                   1 213
    //                   2 175
    //                   3 213
    //   17   56:iload_3         
    //   18   57:ifne            86
    //   19   60:iload           4
    //   20   62:ifne            86
    //   21   65:aload_0         
    //   22   66:invokespecial   #490 <Method boolean hasPeekingDrawer()>
    //   23   69:ifne            86
    //   24   72:aload_0         
    //   25   73:getfield        #214 <Field boolean mChildrenCanceledTouch>
    //   26   76:istore          6
    //   27   78:iconst_0        
    //   28   79:istore          5
    //   29   81:iload           6
    //   30   83:ifeq            89
    //   31   86:iconst_1        
    //   32   87:istore          5
    //   33   89:iload           5
    //   34   91:ireturn         
    //   35   92:aload_1         
    //   36   93:invokevirtual   #494 <Method float MotionEvent.getX()>
    //   37   96:fstore          8
    //   38   98:aload_1         
    //   39   99:invokevirtual   #497 <Method float MotionEvent.getY()>
    //   40  102:fstore          9
    //   41  104:aload_0         
    //   42  105:fload           8
    //   43  107:putfield        #499 <Field float mInitialMotionX>
    //   44  110:aload_0         
    //   45  111:fload           9
    //   46  113:putfield        #501 <Field float mInitialMotionY>
    //   47  116:aload_0         
    //   48  117:getfield        #314 <Field float mScrimOpacity>
    //   49  120:fconst_0        
    //   50  121:fcmpl           
    //   51  122:istore          10
    //   52  124:iconst_0        
    //   53  125:istore          4
    //   54  127:iload           10
    //   55  129:ifle            162
    //   56  132:aload_0         
    //   57  133:aload_0         
    //   58  134:getfield        #120 <Field ViewDragHelper mLeftDragger>
    //   59  137:fload           8
    //   60  139:f2i             
    //   61  140:fload           9
    //   62  142:f2i             
    //   63  143:invokevirtual   #505 <Method View ViewDragHelper.findTopChildUnder(int, int)>
    //   64  146:invokevirtual   #350 <Method boolean isContentView(View)>
    //   65  149:istore          11
    //   66  151:iconst_0        
    //   67  152:istore          4
    //   68  154:iload           11
    //   69  156:ifeq            162
    //   70  159:iconst_1        
    //   71  160:istore          4
    //   72  162:aload_0         
    //   73  163:iconst_0        
    //   74  164:putfield        #507 <Field boolean mDisallowInterceptRequested>
    //   75  167:aload_0         
    //   76  168:iconst_0        
    //   77  169:putfield        #214 <Field boolean mChildrenCanceledTouch>
    //   78  172:goto            56
    //   79  175:aload_0         
    //   80  176:getfield        #120 <Field ViewDragHelper mLeftDragger>
    //   81  179:iconst_3        
    //   82  180:invokevirtual   #510 <Method boolean ViewDragHelper.checkTouchSlop(int)>
    //   83  183:istore          7
    //   84  185:iconst_0        
    //   85  186:istore          4
    //   86  188:iload           7
    //   87  190:ifeq            56
    //   88  193:aload_0         
    //   89  194:getfield        #110 <Field DrawerLayout$ViewDragCallback mLeftCallback>
    //   90  197:invokevirtual   #305 <Method void DrawerLayout$ViewDragCallback.removeCallbacks()>
    //   91  200:aload_0         
    //   92  201:getfield        #112 <Field DrawerLayout$ViewDragCallback mRightCallback>
    //   93  204:invokevirtual   #305 <Method void DrawerLayout$ViewDragCallback.removeCallbacks()>
    //   94  207:iconst_0        
    //   95  208:istore          4
    //   96  210:goto            56
    //   97  213:aload_0         
    //   98  214:iconst_1        
    //   99  215:invokevirtual   #302 <Method void closeDrawers(boolean)>
    //  100  218:aload_0         
    //  101  219:iconst_0        
    //  102  220:putfield        #507 <Field boolean mDisallowInterceptRequested>
    //  103  223:aload_0         
    //  104  224:iconst_0        
    //  105  225:putfield        #214 <Field boolean mChildrenCanceledTouch>
    //  106  228:iconst_0        
    //  107  229:istore          4
    //  108  231:goto            56
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
    //    0    0:iload_1         
    //    1    1:iconst_4        
    //    2    2:icmpne          18
    //    3    5:aload_0         
    //    4    6:invokespecial   #514 <Method boolean hasVisibleDrawer()>
    //    5    9:ifeq            18
    //    6   12:aload_2         
    //    7   13:invokestatic    #520 <Method void KeyEventCompat.startTracking(KeyEvent)>
    //    8   16:iconst_1        
    //    9   17:ireturn         
    //   10   18:aload_0         
    //   11   19:iload_1         
    //   12   20:aload_2         
    //   13   21:invokespecial   #522 <Method boolean ViewGroup.onKeyDown(int, KeyEvent)>
    //   14   24:ireturn         
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
    //    0    0:iload_1         
    //    1    1:iconst_4        
    //    2    2:icmpne          34
    //    3    5:aload_0         
    //    4    6:invokespecial   #211 <Method View findVisibleDrawer()>
    //    5    9:astore_3        
    //    6   10:aload_3         
    //    7   11:ifnull          26
    //    8   14:aload_0         
    //    9   15:aload_3         
    //   10   16:invokevirtual   #525 <Method int getDrawerLockMode(View)>
    //   11   19:ifne            26
    //   12   22:aload_0         
    //   13   23:invokevirtual   #527 <Method void closeDrawers()>
    //   14   26:aload_3         
    //   15   27:ifnull          32
    //   16   30:iconst_1        
    //   17   31:ireturn         
    //   18   32:iconst_0        
    //   19   33:ireturn         
    //   20   34:aload_0         
    //   21   35:iload_1         
    //   22   36:aload_2         
    //   23   37:invokespecial   #529 <Method boolean ViewGroup.onKeyUp(int, KeyEvent)>
    //   24   40:ireturn         
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #533 <Field boolean mInLayout>
    //    3    5:iload           4
    //    4    7:iload_2         
    //    5    8:isub            
    //    6    9:istore          6
    //    7   11:aload_0         
    //    8   12:invokevirtual   #163 <Method int getChildCount()>
    //    9   15:istore          7
    //   10   17:iconst_0        
    //   11   18:istore          8
    //   12   20:iload           8
    //   13   22:iload           7
    //   14   24:icmpge          454
    //   15   27:aload_0         
    //   16   28:iload           8
    //   17   30:invokevirtual   #167 <Method View getChildAt(int)>
    //   18   33:astore          9
    //   19   35:aload           9
    //   20   37:invokevirtual   #358 <Method int View.getVisibility()>
    //   21   40:bipush          8
    //   22   42:icmpne          51
    //   23   45:iinc            8  1
    //   24   48:goto            20
    //   25   51:aload           9
    //   26   53:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   27   56:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //   28   59:astore          10
    //   29   61:aload_0         
    //   30   62:aload           9
    //   31   64:invokevirtual   #350 <Method boolean isContentView(View)>
    //   32   67:ifeq            110
    //   33   70:aload           9
    //   34   72:aload           10
    //   35   74:getfield        #536 <Field int DrawerLayout$LayoutParams.leftMargin>
    //   36   77:aload           10
    //   37   79:getfield        #539 <Field int DrawerLayout$LayoutParams.topMargin>
    //   38   82:aload           10
    //   39   84:getfield        #536 <Field int DrawerLayout$LayoutParams.leftMargin>
    //   40   87:aload           9
    //   41   89:invokevirtual   #542 <Method int View.getMeasuredWidth()>
    //   42   92:iadd            
    //   43   93:aload           10
    //   44   95:getfield        #539 <Field int DrawerLayout$LayoutParams.topMargin>
    //   45   98:aload           9
    //   46  100:invokevirtual   #545 <Method int View.getMeasuredHeight()>
    //   47  103:iadd            
    //   48  104:invokevirtual   #548 <Method void View.layout(int, int, int, int)>
    //   49  107:goto            45
    //   50  110:aload           9
    //   51  112:invokevirtual   #542 <Method int View.getMeasuredWidth()>
    //   52  115:istore          11
    //   53  117:aload           9
    //   54  119:invokevirtual   #545 <Method int View.getMeasuredHeight()>
    //   55  122:istore          12
    //   56  124:aload_0         
    //   57  125:aload           9
    //   58  127:iconst_3        
    //   59  128:invokevirtual   #288 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
    //   60  131:ifeq            283
    //   61  134:iload           11
    //   62  136:ineg            
    //   63  137:iload           11
    //   64  139:i2f             
    //   65  140:aload           10
    //   66  142:getfield        #280 <Field float DrawerLayout$LayoutParams.onScreen>
    //   67  145:fmul            
    //   68  146:f2i             
    //   69  147:iadd            
    //   70  148:istore          13
    //   71  150:iload           11
    //   72  152:iload           13
    //   73  154:iadd            
    //   74  155:i2f             
    //   75  156:iload           11
    //   76  158:i2f             
    //   77  159:fdiv            
    //   78  160:fstore          14
    //   79  162:fload           14
    //   80  164:aload           10
    //   81  166:getfield        #280 <Field float DrawerLayout$LayoutParams.onScreen>
    //   82  169:fcmpl           
    //   83  170:ifeq            313
    //   84  173:iconst_1        
    //   85  174:istore          15
    //   86  176:bipush          112
    //   87  178:aload           10
    //   88  180:getfield        #455 <Field int DrawerLayout$LayoutParams.gravity>
    //   89  183:iand            
    //   90  184:lookupswitch    2: default 212
    //                   16: 362
    //                   80: 319
    //   91  212:aload           9
    //   92  214:iload           13
    //   93  216:aload           10
    //   94  218:getfield        #539 <Field int DrawerLayout$LayoutParams.topMargin>
    //   95  221:iload           13
    //   96  223:iload           11
    //   97  225:iadd            
    //   98  226:iload           12
    //   99  228:aload           10
    //  100  230:getfield        #539 <Field int DrawerLayout$LayoutParams.topMargin>
    //  101  233:iadd            
    //  102  234:invokevirtual   #548 <Method void View.layout(int, int, int, int)>
    //  103  237:iload           15
    //  104  239:ifeq            250
    //  105  242:aload_0         
    //  106  243:aload           9
    //  107  245:fload           14
    //  108  247:invokevirtual   #472 <Method void setDrawerViewOffset(View, float)>
    //  109  250:aload           10
    //  110  252:getfield        #280 <Field float DrawerLayout$LayoutParams.onScreen>
    //  111  255:fconst_0        
    //  112  256:fcmpl           
    //  113  257:ifle            448
    //  114  260:iconst_0        
    //  115  261:istore          18
    //  116  263:aload           9
    //  117  265:invokevirtual   #358 <Method int View.getVisibility()>
    //  118  268:iload           18
    //  119  270:icmpeq          45
    //  120  273:aload           9
    //  121  275:iload           18
    //  122  277:invokevirtual   #551 <Method void View.setVisibility(int)>
    //  123  280:goto            45
    //  124  283:iload           6
    //  125  285:iload           11
    //  126  287:i2f             
    //  127  288:aload           10
    //  128  290:getfield        #280 <Field float DrawerLayout$LayoutParams.onScreen>
    //  129  293:fmul            
    //  130  294:f2i             
    //  131  295:isub            
    //  132  296:istore          13
    //  133  298:iload           6
    //  134  300:iload           13
    //  135  302:isub            
    //  136  303:i2f             
    //  137  304:iload           11
    //  138  306:i2f             
    //  139  307:fdiv            
    //  140  308:fstore          14
    //  141  310:goto            162
    //  142  313:iconst_0        
    //  143  314:istore          15
    //  144  316:goto            176
    //  145  319:iload           5
    //  146  321:iload_3         
    //  147  322:isub            
    //  148  323:istore          19
    //  149  325:aload           9
    //  150  327:iload           13
    //  151  329:iload           19
    //  152  331:aload           10
    //  153  333:getfield        #554 <Field int DrawerLayout$LayoutParams.bottomMargin>
    //  154  336:isub            
    //  155  337:aload           9
    //  156  339:invokevirtual   #545 <Method int View.getMeasuredHeight()>
    //  157  342:isub            
    //  158  343:iload           13
    //  159  345:iload           11
    //  160  347:iadd            
    //  161  348:iload           19
    //  162  350:aload           10
    //  163  352:getfield        #554 <Field int DrawerLayout$LayoutParams.bottomMargin>
    //  164  355:isub            
    //  165  356:invokevirtual   #548 <Method void View.layout(int, int, int, int)>
    //  166  359:goto            237
    //  167  362:iload           5
    //  168  364:iload_3         
    //  169  365:isub            
    //  170  366:istore          16
    //  171  368:iload           16
    //  172  370:iload           12
    //  173  372:isub            
    //  174  373:iconst_2        
    //  175  374:idiv            
    //  176  375:istore          17
    //  177  377:iload           17
    //  178  379:aload           10
    //  179  381:getfield        #539 <Field int DrawerLayout$LayoutParams.topMargin>
    //  180  384:icmpge          416
    //  181  387:aload           10
    //  182  389:getfield        #539 <Field int DrawerLayout$LayoutParams.topMargin>
    //  183  392:istore          17
    //  184  394:aload           9
    //  185  396:iload           13
    //  186  398:iload           17
    //  187  400:iload           13
    //  188  402:iload           11
    //  189  404:iadd            
    //  190  405:iload           17
    //  191  407:iload           12
    //  192  409:iadd            
    //  193  410:invokevirtual   #548 <Method void View.layout(int, int, int, int)>
    //  194  413:goto            237
    //  195  416:iload           17
    //  196  418:iload           12
    //  197  420:iadd            
    //  198  421:iload           16
    //  199  423:aload           10
    //  200  425:getfield        #554 <Field int DrawerLayout$LayoutParams.bottomMargin>
    //  201  428:isub            
    //  202  429:icmple          394
    //  203  432:iload           16
    //  204  434:aload           10
    //  205  436:getfield        #554 <Field int DrawerLayout$LayoutParams.bottomMargin>
    //  206  439:isub            
    //  207  440:iload           12
    //  208  442:isub            
    //  209  443:istore          17
    //  210  445:goto            394
    //  211  448:iconst_4        
    //  212  449:istore          18
    //  213  451:goto            263
    //  214  454:aload_0         
    //  215  455:iconst_0        
    //  216  456:putfield        #533 <Field boolean mInLayout>
    //  217  459:aload_0         
    //  218  460:iconst_0        
    //  219  461:putfield        #83  <Field boolean mFirstLayout>
    //  220  464:return          
    }

    protected void onMeasure(int i, int j)
    {
    //    0    0:iload_1         
    //    1    1:invokestatic    #560 <Method int android.view.View$MeasureSpec.getMode(int)>
    //    2    4:istore_3        
    //    3    5:iload_2         
    //    4    6:invokestatic    #560 <Method int android.view.View$MeasureSpec.getMode(int)>
    //    5    9:istore          4
    //    6   11:iload_1         
    //    7   12:invokestatic    #563 <Method int android.view.View$MeasureSpec.getSize(int)>
    //    8   15:istore          5
    //    9   17:iload_2         
    //   10   18:invokestatic    #563 <Method int android.view.View$MeasureSpec.getSize(int)>
    //   11   21:istore          6
    //   12   23:iload_3         
    //   13   24:ldc2            #564 <Int 0x40000000>
    //   14   27:icmpne          38
    //   15   30:iload           4
    //   16   32:ldc2            #564 <Int 0x40000000>
    //   17   35:icmpeq          60
    //   18   38:aload_0         
    //   19   39:invokevirtual   #567 <Method boolean isInEditMode()>
    //   20   42:ifeq            133
    //   21   45:iload_3         
    //   22   46:ldc2            #568 <Int 0x80000000>
    //   23   49:icmpne          108
    //   24   52:iload           4
    //   25   54:ldc2            #568 <Int 0x80000000>
    //   26   57:icmpne          120
    //   27   60:aload_0         
    //   28   61:iload           5
    //   29   63:iload           6
    //   30   65:invokevirtual   #571 <Method void setMeasuredDimension(int, int)>
    //   31   68:aload_0         
    //   32   69:invokevirtual   #163 <Method int getChildCount()>
    //   33   72:istore          7
    //   34   74:iconst_0        
    //   35   75:istore          8
    //   36   77:iload           8
    //   37   79:iload           7
    //   38   81:icmpge          398
    //   39   84:aload_0         
    //   40   85:iload           8
    //   41   87:invokevirtual   #167 <Method View getChildAt(int)>
    //   42   90:astore          9
    //   43   92:aload           9
    //   44   94:invokevirtual   #358 <Method int View.getVisibility()>
    //   45   97:bipush          8
    //   46   99:icmpne          144
    //   47  102:iinc            8  1
    //   48  105:goto            77
    //   49  108:iload_3         
    //   50  109:ifne            52
    //   51  112:sipush          300
    //   52  115:istore          5
    //   53  117:goto            52
    //   54  120:iload           4
    //   55  122:ifne            60
    //   56  125:sipush          300
    //   57  128:istore          6
    //   58  130:goto            60
    //   59  133:new             #249 <Class IllegalArgumentException>
    //   60  136:dup             
    //   61  137:ldc2            #573 <String "DrawerLayout must be measured with MeasureSpec.EXACTLY.">
    //   62  140:invokespecial   #267 <Method void IllegalArgumentException(String)>
    //   63  143:athrow          
    //   64  144:aload           9
    //   65  146:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   66  149:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //   67  152:astore          10
    //   68  154:aload_0         
    //   69  155:aload           9
    //   70  157:invokevirtual   #350 <Method boolean isContentView(View)>
    //   71  160:ifeq            211
    //   72  163:aload           9
    //   73  165:iload           5
    //   74  167:aload           10
    //   75  169:getfield        #536 <Field int DrawerLayout$LayoutParams.leftMargin>
    //   76  172:isub            
    //   77  173:aload           10
    //   78  175:getfield        #576 <Field int DrawerLayout$LayoutParams.rightMargin>
    //   79  178:isub            
    //   80  179:ldc2            #564 <Int 0x40000000>
    //   81  182:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   82  185:iload           6
    //   83  187:aload           10
    //   84  189:getfield        #539 <Field int DrawerLayout$LayoutParams.topMargin>
    //   85  192:isub            
    //   86  193:aload           10
    //   87  195:getfield        #554 <Field int DrawerLayout$LayoutParams.bottomMargin>
    //   88  198:isub            
    //   89  199:ldc2            #564 <Int 0x40000000>
    //   90  202:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   91  205:invokevirtual   #582 <Method void View.measure(int, int)>
    //   92  208:goto            102
    //   93  211:aload_0         
    //   94  212:aload           9
    //   95  214:invokevirtual   #171 <Method boolean isDrawerView(View)>
    //   96  217:ifeq            346
    //   97  220:bipush          7
    //   98  222:aload_0         
    //   99  223:aload           9
    //  100  225:invokevirtual   #239 <Method int getDrawerViewAbsoluteGravity(View)>
    //  101  228:iand            
    //  102  229:istore          11
    //  103  231:iconst_0        
    //  104  232:iload           11
    //  105  234:iand            
    //  106  235:ifeq            293
    //  107  238:new             #584 <Class IllegalStateException>
    //  108  241:dup             
    //  109  242:new             #251 <Class StringBuilder>
    //  110  245:dup             
    //  111  246:invokespecial   #252 <Method void StringBuilder()>
    //  112  249:ldc2            #586 <String "Child drawer has absolute gravity ">
    //  113  252:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //  114  255:iload           11
    //  115  257:invokestatic    #260 <Method String gravityToString(int)>
    //  116  260:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //  117  263:ldc2            #588 <String " but this ">
    //  118  266:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //  119  269:ldc1            #31  <String "DrawerLayout">
    //  120  271:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //  121  274:ldc2            #590 <String " already has a ">
    //  122  277:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //  123  280:ldc2            #592 <String "drawer view along that edge">
    //  124  283:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //  125  286:invokevirtual   #264 <Method String StringBuilder.toString()>
    //  126  289:invokespecial   #593 <Method void IllegalStateException(String)>
    //  127  292:athrow          
    //  128  293:aload           9
    //  129  295:iload_1         
    //  130  296:aload_0         
    //  131  297:getfield        #102 <Field int mMinDrawerMargin>
    //  132  300:aload           10
    //  133  302:getfield        #536 <Field int DrawerLayout$LayoutParams.leftMargin>
    //  134  305:iadd            
    //  135  306:aload           10
    //  136  308:getfield        #576 <Field int DrawerLayout$LayoutParams.rightMargin>
    //  137  311:iadd            
    //  138  312:aload           10
    //  139  314:getfield        #596 <Field int DrawerLayout$LayoutParams.width>
    //  140  317:invokestatic    #600 <Method int getChildMeasureSpec(int, int, int)>
    //  141  320:iload_2         
    //  142  321:aload           10
    //  143  323:getfield        #539 <Field int DrawerLayout$LayoutParams.topMargin>
    //  144  326:aload           10
    //  145  328:getfield        #554 <Field int DrawerLayout$LayoutParams.bottomMargin>
    //  146  331:iadd            
    //  147  332:aload           10
    //  148  334:getfield        #603 <Field int DrawerLayout$LayoutParams.height>
    //  149  337:invokestatic    #600 <Method int getChildMeasureSpec(int, int, int)>
    //  150  340:invokevirtual   #582 <Method void View.measure(int, int)>
    //  151  343:goto            102
    //  152  346:new             #584 <Class IllegalStateException>
    //  153  349:dup             
    //  154  350:new             #251 <Class StringBuilder>
    //  155  353:dup             
    //  156  354:invokespecial   #252 <Method void StringBuilder()>
    //  157  357:ldc2            #605 <String "Child ">
    //  158  360:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //  159  363:aload           9
    //  160  365:invokevirtual   #275 <Method StringBuilder StringBuilder.append(Object)>
    //  161  368:ldc2            #607 <String " at index ">
    //  162  371:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //  163  374:iload           8
    //  164  376:invokevirtual   #610 <Method StringBuilder StringBuilder.append(int)>
    //  165  379:ldc2            #612 <String " does not have a valid layout_gravity - must be Gravity.LEFT, ">
    //  166  382:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //  167  385:ldc2            #614 <String "Gravity.RIGHT or Gravity.NO_GRAVITY">
    //  168  388:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //  169  391:invokevirtual   #264 <Method String StringBuilder.toString()>
    //  170  394:invokespecial   #593 <Method void IllegalStateException(String)>
    //  171  397:athrow          
    //  172  398:return          
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
    //    0    0:aload_1         
    //    1    1:checkcast       #618 <Class DrawerLayout$SavedState>
    //    2    4:astore_2        
    //    3    5:aload_0         
    //    4    6:aload_2         
    //    5    7:invokevirtual   #622 <Method Parcelable DrawerLayout$SavedState.getSuperState()>
    //    6   10:invokespecial   #624 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
    //    7   13:aload_2         
    //    8   14:getfield        #627 <Field int DrawerLayout$SavedState.openDrawerGravity>
    //    9   17:ifeq            38
    //   10   20:aload_0         
    //   11   21:aload_2         
    //   12   22:getfield        #627 <Field int DrawerLayout$SavedState.openDrawerGravity>
    //   13   25:invokevirtual   #247 <Method View findDrawerWithGravity(int)>
    //   14   28:astore_3        
    //   15   29:aload_3         
    //   16   30:ifnull          38
    //   17   33:aload_0         
    //   18   34:aload_3         
    //   19   35:invokevirtual   #630 <Method void openDrawer(View)>
    //   20   38:aload_0         
    //   21   39:aload_2         
    //   22   40:getfield        #633 <Field int DrawerLayout$SavedState.lockModeLeft>
    //   23   43:iconst_3        
    //   24   44:invokevirtual   #636 <Method void setDrawerLockMode(int, int)>
    //   25   47:aload_0         
    //   26   48:aload_2         
    //   27   49:getfield        #639 <Field int DrawerLayout$SavedState.lockModeRight>
    //   28   52:iconst_5        
    //   29   53:invokevirtual   #636 <Method void setDrawerLockMode(int, int)>
    //   30   56:return          
    }

    protected Parcelable onSaveInstanceState()
    {
    //    0    0:new             #618 <Class DrawerLayout$SavedState>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #642 <Method Parcelable ViewGroup.onSaveInstanceState()>
    //    4    8:invokespecial   #644 <Method void DrawerLayout$SavedState(Parcelable)>
    //    5   11:astore_1        
    //    6   12:aload_0         
    //    7   13:invokevirtual   #163 <Method int getChildCount()>
    //    8   16:istore_2        
    //    9   17:iconst_0        
    //   10   18:istore_3        
    //   11   19:iload_3         
    //   12   20:iload_2         
    //   13   21:icmpge          73
    //   14   24:aload_0         
    //   15   25:iload_3         
    //   16   26:invokevirtual   #167 <Method View getChildAt(int)>
    //   17   29:astore          4
    //   18   31:aload_0         
    //   19   32:aload           4
    //   20   34:invokevirtual   #171 <Method boolean isDrawerView(View)>
    //   21   37:ifne            46
    //   22   40:iinc            3  1
    //   23   43:goto            19
    //   24   46:aload           4
    //   25   48:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   26   51:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //   27   54:astore          5
    //   28   56:aload           5
    //   29   58:getfield        #283 <Field boolean DrawerLayout$LayoutParams.knownOpen>
    //   30   61:ifeq            40
    //   31   64:aload_1         
    //   32   65:aload           5
    //   33   67:getfield        #455 <Field int DrawerLayout$LayoutParams.gravity>
    //   34   70:putfield        #627 <Field int DrawerLayout$SavedState.openDrawerGravity>
    //   35   73:aload_1         
    //   36   74:aload_0         
    //   37   75:getfield        #450 <Field int mLockModeLeft>
    //   38   78:putfield        #633 <Field int DrawerLayout$SavedState.lockModeLeft>
    //   39   81:aload_1         
    //   40   82:aload_0         
    //   41   83:getfield        #452 <Field int mLockModeRight>
    //   42   86:putfield        #639 <Field int DrawerLayout$SavedState.lockModeRight>
    //   43   89:aload_1         
    //   44   90:areturn         
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #120 <Field ViewDragHelper mLeftDragger>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #649 <Method void ViewDragHelper.processTouchEvent(MotionEvent)>
    //    4    8:aload_0         
    //    5    9:getfield        #134 <Field ViewDragHelper mRightDragger>
    //    6   12:aload_1         
    //    7   13:invokevirtual   #649 <Method void ViewDragHelper.processTouchEvent(MotionEvent)>
    //    8   16:sipush          255
    //    9   19:aload_1         
    //   10   20:invokevirtual   #652 <Method int MotionEvent.getAction()>
    //   11   23:iand            
    //   12   24:tableswitch     0 3: default 56
    //                   0 58
    //                   1 94
    //                   2 56
    //                   3 223
    //   13   56:iconst_1        
    //   14   57:ireturn         
    //   15   58:aload_1         
    //   16   59:invokevirtual   #494 <Method float MotionEvent.getX()>
    //   17   62:fstore          10
    //   18   64:aload_1         
    //   19   65:invokevirtual   #497 <Method float MotionEvent.getY()>
    //   20   68:fstore          11
    //   21   70:aload_0         
    //   22   71:fload           10
    //   23   73:putfield        #499 <Field float mInitialMotionX>
    //   24   76:aload_0         
    //   25   77:fload           11
    //   26   79:putfield        #501 <Field float mInitialMotionY>
    //   27   82:aload_0         
    //   28   83:iconst_0        
    //   29   84:putfield        #507 <Field boolean mDisallowInterceptRequested>
    //   30   87:aload_0         
    //   31   88:iconst_0        
    //   32   89:putfield        #214 <Field boolean mChildrenCanceledTouch>
    //   33   92:iconst_1        
    //   34   93:ireturn         
    //   35   94:aload_1         
    //   36   95:invokevirtual   #494 <Method float MotionEvent.getX()>
    //   37   98:fstore_2        
    //   38   99:aload_1         
    //   39  100:invokevirtual   #497 <Method float MotionEvent.getY()>
    //   40  103:fstore_3        
    //   41  104:iconst_1        
    //   42  105:istore          4
    //   43  107:aload_0         
    //   44  108:getfield        #120 <Field ViewDragHelper mLeftDragger>
    //   45  111:fload_2         
    //   46  112:f2i             
    //   47  113:fload_3         
    //   48  114:f2i             
    //   49  115:invokevirtual   #505 <Method View ViewDragHelper.findTopChildUnder(int, int)>
    //   50  118:astore          5
    //   51  120:aload           5
    //   52  122:ifnull          204
    //   53  125:aload_0         
    //   54  126:aload           5
    //   55  128:invokevirtual   #350 <Method boolean isContentView(View)>
    //   56  131:ifeq            204
    //   57  134:fload_2         
    //   58  135:aload_0         
    //   59  136:getfield        #499 <Field float mInitialMotionX>
    //   60  139:fsub            
    //   61  140:fstore          6
    //   62  142:fload_3         
    //   63  143:aload_0         
    //   64  144:getfield        #501 <Field float mInitialMotionY>
    //   65  147:fsub            
    //   66  148:fstore          7
    //   67  150:aload_0         
    //   68  151:getfield        #120 <Field ViewDragHelper mLeftDragger>
    //   69  154:invokevirtual   #655 <Method int ViewDragHelper.getTouchSlop()>
    //   70  157:istore          8
    //   71  159:fload           6
    //   72  161:fload           6
    //   73  163:fmul            
    //   74  164:fload           7
    //   75  166:fload           7
    //   76  168:fmul            
    //   77  169:fadd            
    //   78  170:iload           8
    //   79  172:iload           8
    //   80  174:imul            
    //   81  175:i2f             
    //   82  176:fcmpg           
    //   83  177:ifge            204
    //   84  180:aload_0         
    //   85  181:invokevirtual   #657 <Method View findOpenDrawer()>
    //   86  184:astore          9
    //   87  186:aload           9
    //   88  188:ifnull          204
    //   89  191:aload_0         
    //   90  192:aload           9
    //   91  194:invokevirtual   #525 <Method int getDrawerLockMode(View)>
    //   92  197:iconst_2        
    //   93  198:icmpne          217
    //   94  201:iconst_1        
    //   95  202:istore          4
    //   96  204:aload_0         
    //   97  205:iload           4
    //   98  207:invokevirtual   #302 <Method void closeDrawers(boolean)>
    //   99  210:aload_0         
    //  100  211:iconst_0        
    //  101  212:putfield        #507 <Field boolean mDisallowInterceptRequested>
    //  102  215:iconst_1        
    //  103  216:ireturn         
    //  104  217:iconst_0        
    //  105  218:istore          4
    //  106  220:goto            204
    //  107  223:aload_0         
    //  108  224:iconst_1        
    //  109  225:invokevirtual   #302 <Method void closeDrawers(boolean)>
    //  110  228:aload_0         
    //  111  229:iconst_0        
    //  112  230:putfield        #507 <Field boolean mDisallowInterceptRequested>
    //  113  233:aload_0         
    //  114  234:iconst_0        
    //  115  235:putfield        #214 <Field boolean mChildrenCanceledTouch>
    //  116  238:iconst_1        
    //  117  239:ireturn         
    }

    public void openDrawer(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #247 <Method View findDrawerWithGravity(int)>
    //    3    5:astore_2        
    //    4    6:aload_2         
    //    5    7:ifnonnull       40
    //    6   10:new             #249 <Class IllegalArgumentException>
    //    7   13:dup             
    //    8   14:new             #251 <Class StringBuilder>
    //    9   17:dup             
    //   10   18:invokespecial   #252 <Method void StringBuilder()>
    //   11   21:ldc1            #254 <String "No drawer view found with gravity ">
    //   12   23:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //   13   26:iload_1         
    //   14   27:invokestatic    #260 <Method String gravityToString(int)>
    //   15   30:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //   16   33:invokevirtual   #264 <Method String StringBuilder.toString()>
    //   17   36:invokespecial   #267 <Method void IllegalArgumentException(String)>
    //   18   39:athrow          
    //   19   40:aload_0         
    //   20   41:aload_2         
    //   21   42:invokevirtual   #630 <Method void openDrawer(View)>
    //   22   45:return          
    }

    public void openDrawer(View view)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #171 <Method boolean isDrawerView(View)>
    //    3    5:ifne            42
    //    4    8:new             #249 <Class IllegalArgumentException>
    //    5   11:dup             
    //    6   12:new             #251 <Class StringBuilder>
    //    7   15:dup             
    //    8   16:invokespecial   #252 <Method void StringBuilder()>
    //    9   19:ldc2            #272 <String "View ">
    //   10   22:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //   11   25:aload_1         
    //   12   26:invokevirtual   #275 <Method StringBuilder StringBuilder.append(Object)>
    //   13   29:ldc2            #277 <String " is not a sliding drawer">
    //   14   32:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //   15   35:invokevirtual   #264 <Method String StringBuilder.toString()>
    //   16   38:invokespecial   #267 <Method void IllegalArgumentException(String)>
    //   17   41:athrow          
    //   18   42:aload_0         
    //   19   43:getfield        #83  <Field boolean mFirstLayout>
    //   20   46:ifeq            75
    //   21   49:aload_1         
    //   22   50:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   23   53:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //   24   56:astore          4
    //   25   58:aload           4
    //   26   60:fconst_1        
    //   27   61:putfield        #280 <Field float DrawerLayout$LayoutParams.onScreen>
    //   28   64:aload           4
    //   29   66:iconst_1        
    //   30   67:putfield        #283 <Field boolean DrawerLayout$LayoutParams.knownOpen>
    //   31   70:aload_0         
    //   32   71:invokevirtual   #286 <Method void invalidate()>
    //   33   74:return          
    //   34   75:aload_0         
    //   35   76:aload_1         
    //   36   77:iconst_3        
    //   37   78:invokevirtual   #288 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
    //   38   81:ifeq            101
    //   39   84:aload_0         
    //   40   85:getfield        #120 <Field ViewDragHelper mLeftDragger>
    //   41   88:aload_1         
    //   42   89:iconst_0        
    //   43   90:aload_1         
    //   44   91:invokevirtual   #294 <Method int View.getTop()>
    //   45   94:invokevirtual   #298 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
    //   46   97:pop             
    //   47   98:goto            70
    //   48  101:aload_0         
    //   49  102:getfield        #134 <Field ViewDragHelper mRightDragger>
    //   50  105:aload_1         
    //   51  106:aload_0         
    //   52  107:invokevirtual   #299 <Method int getWidth()>
    //   53  110:aload_1         
    //   54  111:invokevirtual   #291 <Method int View.getWidth()>
    //   55  114:isub            
    //   56  115:aload_1         
    //   57  116:invokevirtual   #294 <Method int View.getTop()>
    //   58  119:invokevirtual   #298 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
    //   59  122:pop             
    //   60  123:goto            70
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #660 <Method void ViewGroup.requestDisallowInterceptTouchEvent(boolean)>
    //    3    5:aload_0         
    //    4    6:iload_1         
    //    5    7:putfield        #507 <Field boolean mDisallowInterceptRequested>
    //    6   10:iload_1         
    //    7   11:ifeq            19
    //    8   14:aload_0         
    //    9   15:iconst_1        
    //   10   16:invokevirtual   #302 <Method void closeDrawers(boolean)>
    //   11   19:return          
    }

    public void requestLayout()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #533 <Field boolean mInLayout>
    //    2    4:ifne            11
    //    3    7:aload_0         
    //    4    8:invokespecial   #663 <Method void ViewGroup.requestLayout()>
    //    5   11:return          
    }

    public void setDrawerListener(DrawerListener drawerlistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #324 <Field DrawerLayout$DrawerListener mListener>
    //    3    5:return          
    }

    public void setDrawerLockMode(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iconst_3        
    //    3    3:invokevirtual   #636 <Method void setDrawerLockMode(int, int)>
    //    4    6:aload_0         
    //    5    7:iload_1         
    //    6    8:iconst_5        
    //    7    9:invokevirtual   #636 <Method void setDrawerLockMode(int, int)>
    //    8   12:return          
    }

    public void setDrawerLockMode(int i, int j)
    {
    //    0    0:iload_2         
    //    1    1:aload_0         
    //    2    2:invokestatic    #416 <Method int ViewCompat.getLayoutDirection(View)>
    //    3    5:invokestatic    #422 <Method int GravityCompat.getAbsoluteGravity(int, int)>
    //    4    8:istore_3        
    //    5    9:iload_3         
    //    6   10:iconst_3        
    //    7   11:icmpne          65
    //    8   14:aload_0         
    //    9   15:iload_1         
    //   10   16:putfield        #450 <Field int mLockModeLeft>
    //   11   19:iload_1         
    //   12   20:ifeq            39
    //   13   23:iload_3         
    //   14   24:iconst_3        
    //   15   25:icmpne          78
    //   16   28:aload_0         
    //   17   29:getfield        #120 <Field ViewDragHelper mLeftDragger>
    //   18   32:astore          6
    //   19   34:aload           6
    //   20   36:invokevirtual   #668 <Method void ViewDragHelper.cancel()>
    //   21   39:iload_1         
    //   22   40:tableswitch     1 2: default 64
    //                   1 106
    //                   2 87
    //   23   64:return          
    //   24   65:iload_3         
    //   25   66:iconst_5        
    //   26   67:icmpne          19
    //   27   70:aload_0         
    //   28   71:iload_1         
    //   29   72:putfield        #452 <Field int mLockModeRight>
    //   30   75:goto            19
    //   31   78:aload_0         
    //   32   79:getfield        #134 <Field ViewDragHelper mRightDragger>
    //   33   82:astore          6
    //   34   84:goto            34
    //   35   87:aload_0         
    //   36   88:iload_3         
    //   37   89:invokevirtual   #247 <Method View findDrawerWithGravity(int)>
    //   38   92:astore          5
    //   39   94:aload           5
    //   40   96:ifnull          64
    //   41   99:aload_0         
    //   42  100:aload           5
    //   43  102:invokevirtual   #630 <Method void openDrawer(View)>
    //   44  105:return          
    //   45  106:aload_0         
    //   46  107:iload_3         
    //   47  108:invokevirtual   #247 <Method View findDrawerWithGravity(int)>
    //   48  111:astore          4
    //   49  113:aload           4
    //   50  115:ifnull          64
    //   51  118:aload_0         
    //   52  119:aload           4
    //   53  121:invokevirtual   #270 <Method void closeDrawer(View)>
    //   54  124:return          
    }

    public void setDrawerLockMode(int i, View view)
    {
    //    0    0:aload_0         
    //    1    1:aload_2         
    //    2    2:invokevirtual   #171 <Method boolean isDrawerView(View)>
    //    3    5:ifne            48
    //    4    8:new             #249 <Class IllegalArgumentException>
    //    5   11:dup             
    //    6   12:new             #251 <Class StringBuilder>
    //    7   15:dup             
    //    8   16:invokespecial   #252 <Method void StringBuilder()>
    //    9   19:ldc2            #272 <String "View ">
    //   10   22:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //   11   25:aload_2         
    //   12   26:invokevirtual   #275 <Method StringBuilder StringBuilder.append(Object)>
    //   13   29:ldc2            #671 <String " is not a ">
    //   14   32:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //   15   35:ldc2            #673 <String "drawer with appropriate layout_gravity">
    //   16   38:invokevirtual   #258 <Method StringBuilder StringBuilder.append(String)>
    //   17   41:invokevirtual   #264 <Method String StringBuilder.toString()>
    //   18   44:invokespecial   #267 <Method void IllegalArgumentException(String)>
    //   19   47:athrow          
    //   20   48:aload_0         
    //   21   49:iload_1         
    //   22   50:aload_2         
    //   23   51:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   24   54:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //   25   57:getfield        #455 <Field int DrawerLayout$LayoutParams.gravity>
    //   26   60:invokevirtual   #636 <Method void setDrawerLockMode(int, int)>
    //   27   63:return          
    }

    public void setDrawerShadow(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokevirtual   #87  <Method Resources getResources()>
    //    3    5:iload_1         
    //    4    6:invokevirtual   #678 <Method Drawable Resources.getDrawable(int)>
    //    5    9:iload_2         
    //    6   10:invokevirtual   #681 <Method void setDrawerShadow(Drawable, int)>
    //    7   13:return          
    }

    public void setDrawerShadow(Drawable drawable, int i)
    {
    //    0    0:iload_2         
    //    1    1:aload_0         
    //    2    2:invokestatic    #416 <Method int ViewCompat.getLayoutDirection(View)>
    //    3    5:invokestatic    #422 <Method int GravityCompat.getAbsoluteGravity(int, int)>
    //    4    8:istore_3        
    //    5    9:iload_3         
    //    6   10:iconst_3        
    //    7   11:iand            
    //    8   12:iconst_3        
    //    9   13:icmpne          25
    //   10   16:aload_0         
    //   11   17:aload_1         
    //   12   18:putfield        #387 <Field Drawable mShadowLeft>
    //   13   21:aload_0         
    //   14   22:invokevirtual   #286 <Method void invalidate()>
    //   15   25:iload_3         
    //   16   26:iconst_5        
    //   17   27:iand            
    //   18   28:iconst_5        
    //   19   29:icmpne          41
    //   20   32:aload_0         
    //   21   33:aload_1         
    //   22   34:putfield        #413 <Field Drawable mShadowRight>
    //   23   37:aload_0         
    //   24   38:invokevirtual   #286 <Method void invalidate()>
    //   25   41:return          
    }

    void setDrawerViewOffset(View view, float f)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //    2    4:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //    3    7:astore_3        
    //    4    8:fload_2         
    //    5    9:aload_3         
    //    6   10:getfield        #280 <Field float DrawerLayout$LayoutParams.onScreen>
    //    7   13:fcmpl           
    //    8   14:ifne            18
    //    9   17:return          
    //   10   18:aload_3         
    //   11   19:fload_2         
    //   12   20:putfield        #280 <Field float DrawerLayout$LayoutParams.onScreen>
    //   13   23:aload_0         
    //   14   24:aload_1         
    //   15   25:fload_2         
    //   16   26:invokevirtual   #683 <Method void dispatchOnDrawerSlide(View, float)>
    //   17   29:return          
    }

    public void setScrimColor(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #75  <Field int mScrimColor>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #286 <Method void invalidate()>
    //    5    9:return          
    }

    void updateDrawerState(int i, int j, View view)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #120 <Field ViewDragHelper mLeftDragger>
    //    2    4:invokevirtual   #689 <Method int ViewDragHelper.getViewDragState()>
    //    3    7:istore          4
    //    4    9:aload_0         
    //    5   10:getfield        #134 <Field ViewDragHelper mRightDragger>
    //    6   13:invokevirtual   #689 <Method int ViewDragHelper.getViewDragState()>
    //    7   16:istore          5
    //    8   18:iload           4
    //    9   20:iconst_1        
    //   10   21:icmpeq          30
    //   11   24:iload           5
    //   12   26:iconst_1        
    //   13   27:icmpne          99
    //   14   30:iconst_1        
    //   15   31:istore          6
    //   16   33:aload_3         
    //   17   34:ifnull          65
    //   18   37:iload_2         
    //   19   38:ifne            65
    //   20   41:aload_3         
    //   21   42:invokevirtual   #203 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   22   45:checkcast       #205 <Class DrawerLayout$LayoutParams>
    //   23   48:astore          7
    //   24   50:aload           7
    //   25   52:getfield        #280 <Field float DrawerLayout$LayoutParams.onScreen>
    //   26   55:fconst_0        
    //   27   56:fcmpl           
    //   28   57:ifne            123
    //   29   60:aload_0         
    //   30   61:aload_3         
    //   31   62:invokevirtual   #691 <Method void dispatchOnDrawerClosed(View)>
    //   32   65:iload           6
    //   33   67:aload_0         
    //   34   68:getfield        #693 <Field int mDrawerState>
    //   35   71:icmpeq          98
    //   36   74:aload_0         
    //   37   75:iload           6
    //   38   77:putfield        #693 <Field int mDrawerState>
    //   39   80:aload_0         
    //   40   81:getfield        #324 <Field DrawerLayout$DrawerListener mListener>
    //   41   84:ifnull          98
    //   42   87:aload_0         
    //   43   88:getfield        #324 <Field DrawerLayout$DrawerListener mListener>
    //   44   91:iload           6
    //   45   93:invokeinterface #696 <Method void DrawerLayout$DrawerListener.onDrawerStateChanged(int)>
    //   46   98:return          
    //   47   99:iload           4
    //   48  101:iconst_2        
    //   49  102:icmpeq          111
    //   50  105:iload           5
    //   51  107:iconst_2        
    //   52  108:icmpne          117
    //   53  111:iconst_2        
    //   54  112:istore          6
    //   55  114:goto            33
    //   56  117:iconst_0        
    //   57  118:istore          6
    //   58  120:goto            33
    //   59  123:aload           7
    //   60  125:getfield        #280 <Field float DrawerLayout$LayoutParams.onScreen>
    //   61  128:fconst_1        
    //   62  129:fcmpl           
    //   63  130:ifne            65
    //   64  133:aload_0         
    //   65  134:aload_3         
    //   66  135:invokevirtual   #698 <Method void dispatchOnDrawerOpened(View)>
    //   67  138:goto            65
    }

    private static final boolean ALLOW_EDGE_LOCK = false;
    private static final boolean CHILDREN_DISALLOW_INTERCEPT = true;
    private static final int DEFAULT_SCRIM_COLOR = 0x99000000;
    private static final int LAYOUT_ATTRS[];
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static final int MIN_DRAWER_MARGIN = 64;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final int PEEK_DELAY = 160;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "DrawerLayout";
    private static final float TOUCH_SLOP_SENSITIVITY = 1F;
    private boolean mChildrenCanceledTouch;
    private boolean mDisallowInterceptRequested;
    private int mDrawerState;
    private boolean mFirstLayout;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private final ViewDragCallback mLeftCallback;
    private final ViewDragHelper mLeftDragger;
    private DrawerListener mListener;
    private int mLockModeLeft;
    private int mLockModeRight;
    private int mMinDrawerMargin;
    private final ViewDragCallback mRightCallback;
    private final ViewDragHelper mRightDragger;
    private int mScrimColor;
    private float mScrimOpacity;
    private Paint mScrimPaint;
    private Drawable mShadowLeft;
    private Drawable mShadowRight;

    static int[] access$100()
    {
    //    0    0:getstatic       #64  <Field int[] LAYOUT_ATTRS>
    //    1    3:areturn         
    }

    // Unreferenced inner class android/support/v4/widget/DrawerLayout$SavedState$1

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
        //    0    0:new             #9   <Class DrawerLayout$SavedState>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:invokespecial   #18  <Method void DrawerLayout$SavedState(Parcel)>
        //    4    8:areturn         
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #21  <Method DrawerLayout$SavedState createFromParcel(Parcel)>
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
        //    2    2:invokevirtual   #26  <Method DrawerLayout$SavedState[] newArray(int)>
        //    3    5:areturn         
        }
    }


    // Unreferenced inner class android/support/v4/widget/DrawerLayout$ViewDragCallback$1

/* anonymous class */
    class ViewDragCallback._cls1
        implements Runnable
    {

        ViewDragCallback._cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field DrawerLayout$ViewDragCallback this$1>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field DrawerLayout$ViewDragCallback this$1>
        //    2    4:invokestatic    #21  <Method void DrawerLayout$ViewDragCallback.access$000(DrawerLayout$ViewDragCallback)>
        //    3    7:return          
        }

        final ViewDragCallback this$1;
    }

}
