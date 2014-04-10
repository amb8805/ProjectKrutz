// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.*;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v4.widget.EdgeEffectCompat;
import android.util.*;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.*;

// Referenced classes of package android.support.v4.view:
//            PagerAdapter, ViewCompat, MotionEventCompat, VelocityTrackerCompat, 
//            KeyEventCompat, ViewConfigurationCompat, AccessibilityDelegateCompat

public class ViewPager extends ViewGroup
{
    static interface Decor
    {
    }

    static class ItemInfo
    {

        ItemInfo()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #17  <Method void Object()>
        //    2    4:return          
        }

        Object object;
        float offset;
        int position;
        boolean scrolling;
        float widthFactor;
    }

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams
    {

        public LayoutParams()
        {
        //    0    0:aload_0         
        //    1    1:iconst_m1       
        //    2    2:iconst_m1       
        //    3    3:invokespecial   #18  <Method void android.view.ViewGroup$LayoutParams(int, int)>
        //    4    6:aload_0         
        //    5    7:fconst_0        
        //    6    8:putfield        #20  <Field float widthFactor>
        //    7   11:return          
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:invokespecial   #23  <Method void android.view.ViewGroup$LayoutParams(Context, AttributeSet)>
        //    4    6:aload_0         
        //    5    7:fconst_0        
        //    6    8:putfield        #20  <Field float widthFactor>
        //    7   11:aload_1         
        //    8   12:aload_2         
        //    9   13:invokestatic    #29  <Method int[] ViewPager.access$400()>
        //   10   16:invokevirtual   #35  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
        //   11   19:astore_3        
        //   12   20:aload_0         
        //   13   21:aload_3         
        //   14   22:iconst_0        
        //   15   23:bipush          48
        //   16   25:invokevirtual   #41  <Method int TypedArray.getInteger(int, int)>
        //   17   28:putfield        #43  <Field int gravity>
        //   18   31:aload_3         
        //   19   32:invokevirtual   #46  <Method void TypedArray.recycle()>
        //   20   35:return          
        }

        int childIndex;
        public int gravity;
        public boolean isDecor;
        boolean needsMeasure;
        int position;
        float widthFactor;
    }

    class MyAccessibilityDelegate extends AccessibilityDelegateCompat
    {

        MyAccessibilityDelegate()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #10  <Field ViewPager this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #13  <Method void AccessibilityDelegateCompat()>
        //    5    9:return          
        }

        private boolean canScroll()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field ViewPager this$0>
        //    2    4:invokestatic    #21  <Method PagerAdapter ViewPager.access$200(ViewPager)>
        //    3    7:ifnull          26
        //    4   10:aload_0         
        //    5   11:getfield        #10  <Field ViewPager this$0>
        //    6   14:invokestatic    #21  <Method PagerAdapter ViewPager.access$200(ViewPager)>
        //    7   17:invokevirtual   #27  <Method int PagerAdapter.getCount()>
        //    8   20:iconst_1        
        //    9   21:icmple          26
        //   10   24:iconst_1        
        //   11   25:ireturn         
        //   12   26:iconst_0        
        //   13   27:ireturn         
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:invokespecial   #31  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
        //    4    6:aload_2         
        //    5    7:ldc1            #17  <Class ViewPager>
        //    6    9:invokevirtual   #37  <Method String Class.getName()>
        //    7   12:invokevirtual   #43  <Method void AccessibilityEvent.setClassName(CharSequence)>
        //    8   15:invokestatic    #49  <Method AccessibilityRecordCompat AccessibilityRecordCompat.obtain()>
        //    9   18:astore_3        
        //   10   19:aload_3         
        //   11   20:aload_0         
        //   12   21:invokespecial   #51  <Method boolean canScroll()>
        //   13   24:invokevirtual   #55  <Method void AccessibilityRecordCompat.setScrollable(boolean)>
        //   14   27:aload_2         
        //   15   28:invokevirtual   #58  <Method int AccessibilityEvent.getEventType()>
        //   16   31:sipush          4096
        //   17   34:icmpne          83
        //   18   37:aload_0         
        //   19   38:getfield        #10  <Field ViewPager this$0>
        //   20   41:invokestatic    #21  <Method PagerAdapter ViewPager.access$200(ViewPager)>
        //   21   44:ifnull          83
        //   22   47:aload_3         
        //   23   48:aload_0         
        //   24   49:getfield        #10  <Field ViewPager this$0>
        //   25   52:invokestatic    #21  <Method PagerAdapter ViewPager.access$200(ViewPager)>
        //   26   55:invokevirtual   #27  <Method int PagerAdapter.getCount()>
        //   27   58:invokevirtual   #62  <Method void AccessibilityRecordCompat.setItemCount(int)>
        //   28   61:aload_3         
        //   29   62:aload_0         
        //   30   63:getfield        #10  <Field ViewPager this$0>
        //   31   66:invokestatic    #66  <Method int ViewPager.access$300(ViewPager)>
        //   32   69:invokevirtual   #69  <Method void AccessibilityRecordCompat.setFromIndex(int)>
        //   33   72:aload_3         
        //   34   73:aload_0         
        //   35   74:getfield        #10  <Field ViewPager this$0>
        //   36   77:invokestatic    #66  <Method int ViewPager.access$300(ViewPager)>
        //   37   80:invokevirtual   #72  <Method void AccessibilityRecordCompat.setToIndex(int)>
        //   38   83:return          
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:invokespecial   #76  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
        //    4    6:aload_2         
        //    5    7:ldc1            #17  <Class ViewPager>
        //    6    9:invokevirtual   #37  <Method String Class.getName()>
        //    7   12:invokevirtual   #79  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
        //    8   15:aload_2         
        //    9   16:aload_0         
        //   10   17:invokespecial   #51  <Method boolean canScroll()>
        //   11   20:invokevirtual   #80  <Method void AccessibilityNodeInfoCompat.setScrollable(boolean)>
        //   12   23:aload_0         
        //   13   24:getfield        #10  <Field ViewPager this$0>
        //   14   27:iconst_1        
        //   15   28:invokevirtual   #84  <Method boolean ViewPager.canScrollHorizontally(int)>
        //   16   31:ifeq            41
        //   17   34:aload_2         
        //   18   35:sipush          4096
        //   19   38:invokevirtual   #87  <Method void AccessibilityNodeInfoCompat.addAction(int)>
        //   20   41:aload_0         
        //   21   42:getfield        #10  <Field ViewPager this$0>
        //   22   45:iconst_m1       
        //   23   46:invokevirtual   #84  <Method boolean ViewPager.canScrollHorizontally(int)>
        //   24   49:ifeq            59
        //   25   52:aload_2         
        //   26   53:sipush          8192
        //   27   56:invokevirtual   #87  <Method void AccessibilityNodeInfoCompat.addAction(int)>
        //   28   59:return          
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:iload_2         
        //    3    3:aload_3         
        //    4    4:invokespecial   #91  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
        //    5    7:ifeq            12
        //    6   10:iconst_1        
        //    7   11:ireturn         
        //    8   12:iload_2         
        //    9   13:lookupswitch    2: default 40
        //                       4096: 42
        //                       8192: 73
        //   10   40:iconst_0        
        //   11   41:ireturn         
        //   12   42:aload_0         
        //   13   43:getfield        #10  <Field ViewPager this$0>
        //   14   46:iconst_1        
        //   15   47:invokevirtual   #84  <Method boolean ViewPager.canScrollHorizontally(int)>
        //   16   50:ifeq            71
        //   17   53:aload_0         
        //   18   54:getfield        #10  <Field ViewPager this$0>
        //   19   57:iconst_1        
        //   20   58:aload_0         
        //   21   59:getfield        #10  <Field ViewPager this$0>
        //   22   62:invokestatic    #66  <Method int ViewPager.access$300(ViewPager)>
        //   23   65:iadd            
        //   24   66:invokevirtual   #94  <Method void ViewPager.setCurrentItem(int)>
        //   25   69:iconst_1        
        //   26   70:ireturn         
        //   27   71:iconst_0        
        //   28   72:ireturn         
        //   29   73:aload_0         
        //   30   74:getfield        #10  <Field ViewPager this$0>
        //   31   77:iconst_m1       
        //   32   78:invokevirtual   #84  <Method boolean ViewPager.canScrollHorizontally(int)>
        //   33   81:ifeq            102
        //   34   84:aload_0         
        //   35   85:getfield        #10  <Field ViewPager this$0>
        //   36   88:iconst_m1       
        //   37   89:aload_0         
        //   38   90:getfield        #10  <Field ViewPager this$0>
        //   39   93:invokestatic    #66  <Method int ViewPager.access$300(ViewPager)>
        //   40   96:iadd            
        //   41   97:invokevirtual   #94  <Method void ViewPager.setCurrentItem(int)>
        //   42  100:iconst_1        
        //   43  101:ireturn         
        //   44  102:iconst_0        
        //   45  103:ireturn         
        }

        final ViewPager this$0;
    }

    static interface OnAdapterChangeListener
    {

        public abstract void onAdapterChanged(PagerAdapter pageradapter, PagerAdapter pageradapter1);
    }

    public static interface OnPageChangeListener
    {

        public abstract void onPageScrollStateChanged(int i);

        public abstract void onPageScrolled(int i, float f, int j);

        public abstract void onPageSelected(int i);
    }

    public static interface PageTransformer
    {

        public abstract void transformPage(View view, float f);
    }

    private class PagerObserver extends DataSetObserver
    {

        private PagerObserver()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #10  <Field ViewPager this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #13  <Method void DataSetObserver()>
        //    5    9:return          
        }

        PagerObserver(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #16  <Method void ViewPager$PagerObserver(ViewPager)>
        //    3    5:return          
        }

        public void onChanged()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field ViewPager this$0>
        //    2    4:invokevirtual   #22  <Method void ViewPager.dataSetChanged()>
        //    3    7:return          
        }

        public void onInvalidated()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field ViewPager this$0>
        //    2    4:invokevirtual   #22  <Method void ViewPager.dataSetChanged()>
        //    3    7:return          
        }

        final ViewPager this$0;
    }

    public static class SavedState extends android.view.View.BaseSavedState
    {

        static 
        {
        //    0    0:new             #17  <Class ViewPager$SavedState$1>
        //    1    3:dup             
        //    2    4:invokespecial   #20  <Method void ViewPager$SavedState$1()>
        //    3    7:invokestatic    #26  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
        //    4   10:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
        //    5   13:return          
        }

        SavedState(Parcel parcel, ClassLoader classloader)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #32  <Method void android.view.View$BaseSavedState(Parcel)>
        //    3    5:aload_2         
        //    4    6:ifnonnull       17
        //    5    9:aload_0         
        //    6   10:invokevirtual   #38  <Method Class Object.getClass()>
        //    7   13:invokevirtual   #44  <Method ClassLoader Class.getClassLoader()>
        //    8   16:astore_2        
        //    9   17:aload_0         
        //   10   18:aload_1         
        //   11   19:invokevirtual   #50  <Method int Parcel.readInt()>
        //   12   22:putfield        #52  <Field int position>
        //   13   25:aload_0         
        //   14   26:aload_1         
        //   15   27:aload_2         
        //   16   28:invokevirtual   #56  <Method Parcelable Parcel.readParcelable(ClassLoader)>
        //   17   31:putfield        #58  <Field Parcelable adapterState>
        //   18   34:aload_0         
        //   19   35:aload_2         
        //   20   36:putfield        #60  <Field ClassLoader loader>
        //   21   39:return          
        }

        public SavedState(Parcelable parcelable)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #63  <Method void android.view.View$BaseSavedState(Parcelable)>
        //    3    5:return          
        }

        public String toString()
        {
        //    0    0:new             #67  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #68  <Method void StringBuilder()>
        //    3    7:ldc1            #70  <String "FragmentPager.SavedState{">
        //    4    9:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
        //    5   12:aload_0         
        //    6   13:invokestatic    #80  <Method int System.identityHashCode(Object)>
        //    7   16:invokestatic    #86  <Method String Integer.toHexString(int)>
        //    8   19:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
        //    9   22:ldc1            #88  <String " position=">
        //   10   24:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
        //   11   27:aload_0         
        //   12   28:getfield        #52  <Field int position>
        //   13   31:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
        //   14   34:ldc1            #93  <String "}">
        //   15   36:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
        //   16   39:invokevirtual   #95  <Method String StringBuilder.toString()>
        //   17   42:areturn         
        }

        public void writeToParcel(Parcel parcel, int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #99  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
        //    4    6:aload_1         
        //    5    7:aload_0         
        //    6    8:getfield        #52  <Field int position>
        //    7   11:invokevirtual   #103 <Method void Parcel.writeInt(int)>
        //    8   14:aload_1         
        //    9   15:aload_0         
        //   10   16:getfield        #58  <Field Parcelable adapterState>
        //   11   19:iload_2         
        //   12   20:invokevirtual   #107 <Method void Parcel.writeParcelable(Parcelable, int)>
        //   13   23:return          
        }

        public static final android.os.Parcelable.Creator CREATOR;
        Parcelable adapterState;
        ClassLoader loader;
        int position;
    }

    public static class SimpleOnPageChangeListener
        implements OnPageChangeListener
    {

        public SimpleOnPageChangeListener()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public void onPageScrollStateChanged(int i)
        {
        //    0    0:return          
        }

        public void onPageScrolled(int i, float f, int j)
        {
        //    0    0:return          
        }

        public void onPageSelected(int i)
        {
        //    0    0:return          
        }
    }

    static class ViewPositionComparator
        implements Comparator
    {

        ViewPositionComparator()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #11  <Method void Object()>
        //    2    4:return          
        }

        public int compare(View view, View view1)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #19  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
        //    2    4:checkcast       #21  <Class ViewPager$LayoutParams>
        //    3    7:astore_3        
        //    4    8:aload_2         
        //    5    9:invokevirtual   #19  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
        //    6   12:checkcast       #21  <Class ViewPager$LayoutParams>
        //    7   15:astore          4
        //    8   17:aload_3         
        //    9   18:getfield        #25  <Field boolean ViewPager$LayoutParams.isDecor>
        //   10   21:aload           4
        //   11   23:getfield        #25  <Field boolean ViewPager$LayoutParams.isDecor>
        //   12   26:icmpeq          40
        //   13   29:aload_3         
        //   14   30:getfield        #25  <Field boolean ViewPager$LayoutParams.isDecor>
        //   15   33:ifeq            38
        //   16   36:iconst_1        
        //   17   37:ireturn         
        //   18   38:iconst_m1       
        //   19   39:ireturn         
        //   20   40:aload_3         
        //   21   41:getfield        #29  <Field int ViewPager$LayoutParams.position>
        //   22   44:aload           4
        //   23   46:getfield        #29  <Field int ViewPager$LayoutParams.position>
        //   24   49:isub            
        //   25   50:ireturn         
        }

        public volatile int compare(Object obj, Object obj1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #15  <Class View>
        //    3    5:aload_2         
        //    4    6:checkcast       #15  <Class View>
        //    5    9:invokevirtual   #32  <Method int compare(View, View)>
        //    6   12:ireturn         
        }
    }


    static 
    {
    //    0    0:iconst_1        
    //    1    1:newarray        int[]
    //    2    3:dup             
    //    3    4:iconst_0        
    //    4    5:ldc1            #121 <Int 0x10100b3>
    //    5    7:iastore         
    //    6    8:putstatic       #123 <Field int[] LAYOUT_ATTRS>
    //    7   11:new             #125 <Class ViewPager$1>
    //    8   14:dup             
    //    9   15:invokespecial   #128 <Method void ViewPager$1()>
    //   10   18:putstatic       #130 <Field Comparator COMPARATOR>
    //   11   21:new             #132 <Class ViewPager$2>
    //   12   24:dup             
    //   13   25:invokespecial   #133 <Method void ViewPager$2()>
    //   14   28:putstatic       #135 <Field Interpolator sInterpolator>
    //   15   31:new             #137 <Class ViewPager$ViewPositionComparator>
    //   16   34:dup             
    //   17   35:invokespecial   #138 <Method void ViewPager$ViewPositionComparator()>
    //   18   38:putstatic       #140 <Field ViewPager$ViewPositionComparator sPositionComparator>
    //   19   41:return          
    }

    public ViewPager(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #143 <Method void ViewGroup(Context)>
    //    3    5:aload_0         
    //    4    6:new             #145 <Class ArrayList>
    //    5    9:dup             
    //    6   10:invokespecial   #146 <Method void ArrayList()>
    //    7   13:putfield        #148 <Field ArrayList mItems>
    //    8   16:aload_0         
    //    9   17:new             #150 <Class ViewPager$ItemInfo>
    //   10   20:dup             
    //   11   21:invokespecial   #151 <Method void ViewPager$ItemInfo()>
    //   12   24:putfield        #153 <Field ViewPager$ItemInfo mTempItem>
    //   13   27:aload_0         
    //   14   28:new             #155 <Class Rect>
    //   15   31:dup             
    //   16   32:invokespecial   #156 <Method void Rect()>
    //   17   35:putfield        #158 <Field Rect mTempRect>
    //   18   38:aload_0         
    //   19   39:iconst_m1       
    //   20   40:putfield        #160 <Field int mRestoredCurItem>
    //   21   43:aload_0         
    //   22   44:aconst_null     
    //   23   45:putfield        #162 <Field Parcelable mRestoredAdapterState>
    //   24   48:aload_0         
    //   25   49:aconst_null     
    //   26   50:putfield        #164 <Field ClassLoader mRestoredClassLoader>
    //   27   53:aload_0         
    //   28   54:ldc1            #165 <Float -3.402823E+38F>
    //   29   56:putfield        #167 <Field float mFirstOffset>
    //   30   59:aload_0         
    //   31   60:ldc1            #168 <Float 3.402823E+38F>
    //   32   62:putfield        #170 <Field float mLastOffset>
    //   33   65:aload_0         
    //   34   66:iconst_1        
    //   35   67:putfield        #172 <Field int mOffscreenPageLimit>
    //   36   70:aload_0         
    //   37   71:iconst_m1       
    //   38   72:putfield        #174 <Field int mActivePointerId>
    //   39   75:aload_0         
    //   40   76:iconst_1        
    //   41   77:putfield        #176 <Field boolean mFirstLayout>
    //   42   80:aload_0         
    //   43   81:iconst_0        
    //   44   82:putfield        #178 <Field boolean mNeedCalculatePageOffsets>
    //   45   85:aload_0         
    //   46   86:new             #180 <Class ViewPager$3>
    //   47   89:dup             
    //   48   90:aload_0         
    //   49   91:invokespecial   #183 <Method void ViewPager$3(ViewPager)>
    //   50   94:putfield        #185 <Field Runnable mEndScrollRunnable>
    //   51   97:aload_0         
    //   52   98:iconst_0        
    //   53   99:putfield        #187 <Field int mScrollState>
    //   54  102:aload_0         
    //   55  103:invokevirtual   #190 <Method void initViewPager()>
    //   56  106:return          
    }

    public ViewPager(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #193 <Method void ViewGroup(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:new             #145 <Class ArrayList>
    //    6   10:dup             
    //    7   11:invokespecial   #146 <Method void ArrayList()>
    //    8   14:putfield        #148 <Field ArrayList mItems>
    //    9   17:aload_0         
    //   10   18:new             #150 <Class ViewPager$ItemInfo>
    //   11   21:dup             
    //   12   22:invokespecial   #151 <Method void ViewPager$ItemInfo()>
    //   13   25:putfield        #153 <Field ViewPager$ItemInfo mTempItem>
    //   14   28:aload_0         
    //   15   29:new             #155 <Class Rect>
    //   16   32:dup             
    //   17   33:invokespecial   #156 <Method void Rect()>
    //   18   36:putfield        #158 <Field Rect mTempRect>
    //   19   39:aload_0         
    //   20   40:iconst_m1       
    //   21   41:putfield        #160 <Field int mRestoredCurItem>
    //   22   44:aload_0         
    //   23   45:aconst_null     
    //   24   46:putfield        #162 <Field Parcelable mRestoredAdapterState>
    //   25   49:aload_0         
    //   26   50:aconst_null     
    //   27   51:putfield        #164 <Field ClassLoader mRestoredClassLoader>
    //   28   54:aload_0         
    //   29   55:ldc1            #165 <Float -3.402823E+38F>
    //   30   57:putfield        #167 <Field float mFirstOffset>
    //   31   60:aload_0         
    //   32   61:ldc1            #168 <Float 3.402823E+38F>
    //   33   63:putfield        #170 <Field float mLastOffset>
    //   34   66:aload_0         
    //   35   67:iconst_1        
    //   36   68:putfield        #172 <Field int mOffscreenPageLimit>
    //   37   71:aload_0         
    //   38   72:iconst_m1       
    //   39   73:putfield        #174 <Field int mActivePointerId>
    //   40   76:aload_0         
    //   41   77:iconst_1        
    //   42   78:putfield        #176 <Field boolean mFirstLayout>
    //   43   81:aload_0         
    //   44   82:iconst_0        
    //   45   83:putfield        #178 <Field boolean mNeedCalculatePageOffsets>
    //   46   86:aload_0         
    //   47   87:new             #180 <Class ViewPager$3>
    //   48   90:dup             
    //   49   91:aload_0         
    //   50   92:invokespecial   #183 <Method void ViewPager$3(ViewPager)>
    //   51   95:putfield        #185 <Field Runnable mEndScrollRunnable>
    //   52   98:aload_0         
    //   53   99:iconst_0        
    //   54  100:putfield        #187 <Field int mScrollState>
    //   55  103:aload_0         
    //   56  104:invokevirtual   #190 <Method void initViewPager()>
    //   57  107:return          
    }

    static void access$000(ViewPager viewpager, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #199 <Method void setScrollState(int)>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:iload_1         
    //    6    2:invokespecial   #199 <Method void setScrollState(int)>
    //    7    5:return          
    }

    static PagerAdapter access$200(ViewPager viewpager)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #203 <Field PagerAdapter mAdapter>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #203 <Field PagerAdapter mAdapter>
    //    5    4:areturn         
    }

    static int access$300(ViewPager viewpager)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #207 <Field int mCurItem>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #207 <Field int mCurItem>
    //    5    4:ireturn         
    }

    static int[] access$400()
    {
    //    0    0:getstatic       #123 <Field int[] LAYOUT_ATTRS>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #123 <Field int[] LAYOUT_ATTRS>
    //    3    3:areturn         
    }

    private void calculatePageOffsets(ItemInfo iteminfo, int i, ItemInfo iteminfo1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #203 <Field PagerAdapter mAdapter>
    //    2    4:invokevirtual   #217 <Method int PagerAdapter.getCount()>
    //    3    7:istore          4
    //    4    9:aload_0         
    //    5   10:invokespecial   #220 <Method int getClientWidth()>
    //    6   13:istore          5
    //    7   15:iload           5
    //    8   17:ifle            152
    //    9   20:aload_0         
    //   10   21:getfield        #222 <Field int mPageMargin>
    //   11   24:i2f             
    //   12   25:iload           5
    //   13   27:i2f             
    //   14   28:fdiv            
    //   15   29:fstore          6
    //   16   31:aload_3         
    //   17   32:ifnull          371
    //   18   35:aload_3         
    //   19   36:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   20   39:istore          22
    //   21   41:iload           22
    //   22   43:aload_1         
    //   23   44:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   24   47:icmpge          217
    //   25   50:iconst_0        
    //   26   51:istore          27
    //   27   53:fload           6
    //   28   55:aload_3         
    //   29   56:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //   30   59:aload_3         
    //   31   60:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //   32   63:fadd            
    //   33   64:fadd            
    //   34   65:fstore          28
    //   35   67:iload           22
    //   36   69:iconst_1        
    //   37   70:iadd            
    //   38   71:istore          29
    //   39   73:iload           29
    //   40   75:aload_1         
    //   41   76:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   42   79:icmpgt          371
    //   43   82:iload           27
    //   44   84:aload_0         
    //   45   85:getfield        #148 <Field ArrayList mItems>
    //   46   88:invokevirtual   #234 <Method int ArrayList.size()>
    //   47   91:icmpge          371
    //   48   94:aload_0         
    //   49   95:getfield        #148 <Field ArrayList mItems>
    //   50   98:iload           27
    //   51  100:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //   52  103:checkcast       #150 <Class ViewPager$ItemInfo>
    //   53  106:astore          30
    //   54  108:iload           29
    //   55  110:aload           30
    //   56  112:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   57  115:icmple          158
    //   58  118:iload           27
    //   59  120:iconst_m1       
    //   60  121:aload_0         
    //   61  122:getfield        #148 <Field ArrayList mItems>
    //   62  125:invokevirtual   #234 <Method int ArrayList.size()>
    //   63  128:iadd            
    //   64  129:icmpge          158
    //   65  132:iinc            27  1
    //   66  135:aload_0         
    //   67  136:getfield        #148 <Field ArrayList mItems>
    //   68  139:iload           27
    //   69  141:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //   70  144:checkcast       #150 <Class ViewPager$ItemInfo>
    //   71  147:astore          30
    //   72  149:goto            108
    //   73  152:fconst_0        
    //   74  153:fstore          6
    //   75  155:goto            31
    //   76  158:iload           29
    //   77  160:aload           30
    //   78  162:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   79  165:icmpge          191
    //   80  168:fload           28
    //   81  170:fload           6
    //   82  172:aload_0         
    //   83  173:getfield        #203 <Field PagerAdapter mAdapter>
    //   84  176:iload           29
    //   85  178:invokevirtual   #242 <Method float PagerAdapter.getPageWidth(int)>
    //   86  181:fadd            
    //   87  182:fadd            
    //   88  183:fstore          28
    //   89  185:iinc            29  1
    //   90  188:goto            158
    //   91  191:aload           30
    //   92  193:fload           28
    //   93  195:putfield        #228 <Field float ViewPager$ItemInfo.offset>
    //   94  198:fload           28
    //   95  200:fload           6
    //   96  202:aload           30
    //   97  204:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //   98  207:fadd            
    //   99  208:fadd            
    //  100  209:fstore          28
    //  101  211:iinc            29  1
    //  102  214:goto            73
    //  103  217:iload           22
    //  104  219:aload_1         
    //  105  220:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  106  223:icmple          371
    //  107  226:iconst_m1       
    //  108  227:aload_0         
    //  109  228:getfield        #148 <Field ArrayList mItems>
    //  110  231:invokevirtual   #234 <Method int ArrayList.size()>
    //  111  234:iadd            
    //  112  235:istore          23
    //  113  237:aload_3         
    //  114  238:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //  115  241:fstore          24
    //  116  243:iload           22
    //  117  245:iconst_1        
    //  118  246:isub            
    //  119  247:istore          25
    //  120  249:iload           25
    //  121  251:aload_1         
    //  122  252:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  123  255:icmplt          371
    //  124  258:iload           23
    //  125  260:iflt            371
    //  126  263:aload_0         
    //  127  264:getfield        #148 <Field ArrayList mItems>
    //  128  267:iload           23
    //  129  269:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //  130  272:checkcast       #150 <Class ViewPager$ItemInfo>
    //  131  275:astore          26
    //  132  277:iload           25
    //  133  279:aload           26
    //  134  281:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  135  284:icmpge          312
    //  136  287:iload           23
    //  137  289:ifle            312
    //  138  292:iinc            23  -1
    //  139  295:aload_0         
    //  140  296:getfield        #148 <Field ArrayList mItems>
    //  141  299:iload           23
    //  142  301:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //  143  304:checkcast       #150 <Class ViewPager$ItemInfo>
    //  144  307:astore          26
    //  145  309:goto            277
    //  146  312:iload           25
    //  147  314:aload           26
    //  148  316:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  149  319:icmple          345
    //  150  322:fload           24
    //  151  324:fload           6
    //  152  326:aload_0         
    //  153  327:getfield        #203 <Field PagerAdapter mAdapter>
    //  154  330:iload           25
    //  155  332:invokevirtual   #242 <Method float PagerAdapter.getPageWidth(int)>
    //  156  335:fadd            
    //  157  336:fsub            
    //  158  337:fstore          24
    //  159  339:iinc            25  -1
    //  160  342:goto            312
    //  161  345:fload           24
    //  162  347:fload           6
    //  163  349:aload           26
    //  164  351:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //  165  354:fadd            
    //  166  355:fsub            
    //  167  356:fstore          24
    //  168  358:aload           26
    //  169  360:fload           24
    //  170  362:putfield        #228 <Field float ViewPager$ItemInfo.offset>
    //  171  365:iinc            25  -1
    //  172  368:goto            249
    //  173  371:aload_0         
    //  174  372:getfield        #148 <Field ArrayList mItems>
    //  175  375:invokevirtual   #234 <Method int ArrayList.size()>
    //  176  378:istore          7
    //  177  380:aload_1         
    //  178  381:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //  179  384:fstore          8
    //  180  386:iconst_m1       
    //  181  387:aload_1         
    //  182  388:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  183  391:iadd            
    //  184  392:istore          9
    //  185  394:aload_1         
    //  186  395:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  187  398:ifne            511
    //  188  401:aload_1         
    //  189  402:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //  190  405:fstore          10
    //  191  407:aload_0         
    //  192  408:fload           10
    //  193  410:putfield        #167 <Field float mFirstOffset>
    //  194  413:aload_1         
    //  195  414:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  196  417:iload           4
    //  197  419:iconst_1        
    //  198  420:isub            
    //  199  421:icmpne          518
    //  200  424:aload_1         
    //  201  425:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //  202  428:aload_1         
    //  203  429:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //  204  432:fadd            
    //  205  433:fconst_1        
    //  206  434:fsub            
    //  207  435:fstore          11
    //  208  437:aload_0         
    //  209  438:fload           11
    //  210  440:putfield        #170 <Field float mLastOffset>
    //  211  443:iload_2         
    //  212  444:iconst_1        
    //  213  445:isub            
    //  214  446:istore          12
    //  215  448:iload           12
    //  216  450:iflt            568
    //  217  453:aload_0         
    //  218  454:getfield        #148 <Field ArrayList mItems>
    //  219  457:iload           12
    //  220  459:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //  221  462:checkcast       #150 <Class ViewPager$ItemInfo>
    //  222  465:astore          19
    //  223  467:iload           9
    //  224  469:aload           19
    //  225  471:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  226  474:icmple          525
    //  227  477:aload_0         
    //  228  478:getfield        #203 <Field PagerAdapter mAdapter>
    //  229  481:astore          20
    //  230  483:iload           9
    //  231  485:iconst_1        
    //  232  486:isub            
    //  233  487:istore          21
    //  234  489:fload           8
    //  235  491:fload           6
    //  236  493:aload           20
    //  237  495:iload           9
    //  238  497:invokevirtual   #242 <Method float PagerAdapter.getPageWidth(int)>
    //  239  500:fadd            
    //  240  501:fsub            
    //  241  502:fstore          8
    //  242  504:iload           21
    //  243  506:istore          9
    //  244  508:goto            467
    //  245  511:ldc1            #165 <Float -3.402823E+38F>
    //  246  513:fstore          10
    //  247  515:goto            407
    //  248  518:ldc1            #168 <Float 3.402823E+38F>
    //  249  520:fstore          11
    //  250  522:goto            437
    //  251  525:fload           8
    //  252  527:fload           6
    //  253  529:aload           19
    //  254  531:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //  255  534:fadd            
    //  256  535:fsub            
    //  257  536:fstore          8
    //  258  538:aload           19
    //  259  540:fload           8
    //  260  542:putfield        #228 <Field float ViewPager$ItemInfo.offset>
    //  261  545:aload           19
    //  262  547:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  263  550:ifne            559
    //  264  553:aload_0         
    //  265  554:fload           8
    //  266  556:putfield        #167 <Field float mFirstOffset>
    //  267  559:iinc            12  -1
    //  268  562:iinc            9  -1
    //  269  565:goto            448
    //  270  568:fload           6
    //  271  570:aload_1         
    //  272  571:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //  273  574:aload_1         
    //  274  575:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //  275  578:fadd            
    //  276  579:fadd            
    //  277  580:fstore          13
    //  278  582:iconst_1        
    //  279  583:aload_1         
    //  280  584:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  281  587:iadd            
    //  282  588:istore          14
    //  283  590:iload_2         
    //  284  591:iconst_1        
    //  285  592:iadd            
    //  286  593:istore          15
    //  287  595:iload           15
    //  288  597:iload           7
    //  289  599:icmpge          715
    //  290  602:aload_0         
    //  291  603:getfield        #148 <Field ArrayList mItems>
    //  292  606:iload           15
    //  293  608:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //  294  611:checkcast       #150 <Class ViewPager$ItemInfo>
    //  295  614:astore          16
    //  296  616:iload           14
    //  297  618:aload           16
    //  298  620:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  299  623:icmpge          660
    //  300  626:aload_0         
    //  301  627:getfield        #203 <Field PagerAdapter mAdapter>
    //  302  630:astore          17
    //  303  632:iload           14
    //  304  634:iconst_1        
    //  305  635:iadd            
    //  306  636:istore          18
    //  307  638:fload           13
    //  308  640:fload           6
    //  309  642:aload           17
    //  310  644:iload           14
    //  311  646:invokevirtual   #242 <Method float PagerAdapter.getPageWidth(int)>
    //  312  649:fadd            
    //  313  650:fadd            
    //  314  651:fstore          13
    //  315  653:iload           18
    //  316  655:istore          14
    //  317  657:goto            616
    //  318  660:aload           16
    //  319  662:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  320  665:iload           4
    //  321  667:iconst_1        
    //  322  668:isub            
    //  323  669:icmpne          686
    //  324  672:aload_0         
    //  325  673:fload           13
    //  326  675:aload           16
    //  327  677:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //  328  680:fadd            
    //  329  681:fconst_1        
    //  330  682:fsub            
    //  331  683:putfield        #170 <Field float mLastOffset>
    //  332  686:aload           16
    //  333  688:fload           13
    //  334  690:putfield        #228 <Field float ViewPager$ItemInfo.offset>
    //  335  693:fload           13
    //  336  695:fload           6
    //  337  697:aload           16
    //  338  699:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //  339  702:fadd            
    //  340  703:fadd            
    //  341  704:fstore          13
    //  342  706:iinc            15  1
    //  343  709:iinc            14  1
    //  344  712:goto            595
    //  345  715:aload_0         
    //  346  716:iconst_0        
    //  347  717:putfield        #178 <Field boolean mNeedCalculatePageOffsets>
    //  348  720:return          
    }

    private void completeScroll(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #187 <Field int mScrollState>
    //    2    4:iconst_2        
    //    3    5:icmpne          131
    //    4    8:iconst_1        
    //    5    9:istore_2        
    //    6   10:iload_2         
    //    7   11:ifeq            78
    //    8   14:aload_0         
    //    9   15:iconst_0        
    //   10   16:invokespecial   #247 <Method void setScrollingCacheEnabled(boolean)>
    //   11   19:aload_0         
    //   12   20:getfield        #249 <Field Scroller mScroller>
    //   13   23:invokevirtual   #254 <Method void Scroller.abortAnimation()>
    //   14   26:aload_0         
    //   15   27:invokevirtual   #257 <Method int getScrollX()>
    //   16   30:istore          5
    //   17   32:aload_0         
    //   18   33:invokevirtual   #260 <Method int getScrollY()>
    //   19   36:istore          6
    //   20   38:aload_0         
    //   21   39:getfield        #249 <Field Scroller mScroller>
    //   22   42:invokevirtual   #263 <Method int Scroller.getCurrX()>
    //   23   45:istore          7
    //   24   47:aload_0         
    //   25   48:getfield        #249 <Field Scroller mScroller>
    //   26   51:invokevirtual   #266 <Method int Scroller.getCurrY()>
    //   27   54:istore          8
    //   28   56:iload           5
    //   29   58:iload           7
    //   30   60:icmpne          70
    //   31   63:iload           6
    //   32   65:iload           8
    //   33   67:icmpeq          78
    //   34   70:aload_0         
    //   35   71:iload           7
    //   36   73:iload           8
    //   37   75:invokevirtual   #270 <Method void scrollTo(int, int)>
    //   38   78:aload_0         
    //   39   79:iconst_0        
    //   40   80:putfield        #272 <Field boolean mPopulatePending>
    //   41   83:iconst_0        
    //   42   84:istore_3        
    //   43   85:iload_3         
    //   44   86:aload_0         
    //   45   87:getfield        #148 <Field ArrayList mItems>
    //   46   90:invokevirtual   #234 <Method int ArrayList.size()>
    //   47   93:icmpge          136
    //   48   96:aload_0         
    //   49   97:getfield        #148 <Field ArrayList mItems>
    //   50  100:iload_3         
    //   51  101:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //   52  104:checkcast       #150 <Class ViewPager$ItemInfo>
    //   53  107:astore          4
    //   54  109:aload           4
    //   55  111:getfield        #275 <Field boolean ViewPager$ItemInfo.scrolling>
    //   56  114:ifeq            125
    //   57  117:iconst_1        
    //   58  118:istore_2        
    //   59  119:aload           4
    //   60  121:iconst_0        
    //   61  122:putfield        #275 <Field boolean ViewPager$ItemInfo.scrolling>
    //   62  125:iinc            3  1
    //   63  128:goto            85
    //   64  131:iconst_0        
    //   65  132:istore_2        
    //   66  133:goto            10
    //   67  136:iload_2         
    //   68  137:ifeq            152
    //   69  140:iload_1         
    //   70  141:ifeq            153
    //   71  144:aload_0         
    //   72  145:aload_0         
    //   73  146:getfield        #185 <Field Runnable mEndScrollRunnable>
    //   74  149:invokestatic    #281 <Method void ViewCompat.postOnAnimation(View, Runnable)>
    //   75  152:return          
    //   76  153:aload_0         
    //   77  154:getfield        #185 <Field Runnable mEndScrollRunnable>
    //   78  157:invokeinterface #286 <Method void Runnable.run()>
    //   79  162:return          
    }

    private int determineTargetPage(int i, float f, int j, int k)
    {
    //    0    0:iload           4
    //    1    2:invokestatic    #294 <Method int Math.abs(int)>
    //    2    5:aload_0         
    //    3    6:getfield        #296 <Field int mFlingDistance>
    //    4    9:icmple          105
    //    5   12:iload_3         
    //    6   13:invokestatic    #294 <Method int Math.abs(int)>
    //    7   16:aload_0         
    //    8   17:getfield        #298 <Field int mMinimumVelocity>
    //    9   20:icmple          105
    //   10   23:iload_3         
    //   11   24:ifle            97
    //   12   27:iload_1         
    //   13   28:istore          6
    //   14   30:aload_0         
    //   15   31:getfield        #148 <Field ArrayList mItems>
    //   16   34:invokevirtual   #234 <Method int ArrayList.size()>
    //   17   37:ifle            94
    //   18   40:aload_0         
    //   19   41:getfield        #148 <Field ArrayList mItems>
    //   20   44:iconst_0        
    //   21   45:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //   22   48:checkcast       #150 <Class ViewPager$ItemInfo>
    //   23   51:astore          7
    //   24   53:aload_0         
    //   25   54:getfield        #148 <Field ArrayList mItems>
    //   26   57:iconst_m1       
    //   27   58:aload_0         
    //   28   59:getfield        #148 <Field ArrayList mItems>
    //   29   62:invokevirtual   #234 <Method int ArrayList.size()>
    //   30   65:iadd            
    //   31   66:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //   32   69:checkcast       #150 <Class ViewPager$ItemInfo>
    //   33   72:astore          8
    //   34   74:aload           7
    //   35   76:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   36   79:iload           6
    //   37   81:aload           8
    //   38   83:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   39   86:invokestatic    #302 <Method int Math.min(int, int)>
    //   40   89:invokestatic    #305 <Method int Math.max(int, int)>
    //   41   92:istore          6
    //   42   94:iload           6
    //   43   96:ireturn         
    //   44   97:iload_1         
    //   45   98:iconst_1        
    //   46   99:iadd            
    //   47  100:istore          6
    //   48  102:goto            30
    //   49  105:iload_1         
    //   50  106:aload_0         
    //   51  107:getfield        #207 <Field int mCurItem>
    //   52  110:icmplt          131
    //   53  113:ldc2            #306 <Float 0.4F>
    //   54  116:fstore          5
    //   55  118:fload           5
    //   56  120:fload_2         
    //   57  121:iload_1         
    //   58  122:i2f             
    //   59  123:fadd            
    //   60  124:fadd            
    //   61  125:f2i             
    //   62  126:istore          6
    //   63  128:goto            30
    //   64  131:ldc2            #307 <Float 0.6F>
    //   65  134:fstore          5
    //   66  136:goto            118
    }

    private void enableLayers(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #311 <Method int getChildCount()>
    //    2    4:istore_2        
    //    3    5:iconst_0        
    //    4    6:istore_3        
    //    5    7:iload_3         
    //    6    8:iload_2         
    //    7    9:icmpge          42
    //    8   12:iload_1         
    //    9   13:ifeq            36
    //   10   16:iconst_2        
    //   11   17:istore          4
    //   12   19:aload_0         
    //   13   20:iload_3         
    //   14   21:invokevirtual   #315 <Method View getChildAt(int)>
    //   15   24:iload           4
    //   16   26:aconst_null     
    //   17   27:invokestatic    #319 <Method void ViewCompat.setLayerType(View, int, android.graphics.Paint)>
    //   18   30:iinc            3  1
    //   19   33:goto            7
    //   20   36:iconst_0        
    //   21   37:istore          4
    //   22   39:goto            19
    //   23   42:return          
    }

    private void endDrag()
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #322 <Field boolean mIsBeingDragged>
    //    3    5:aload_0         
    //    4    6:iconst_0        
    //    5    7:putfield        #324 <Field boolean mIsUnableToDrag>
    //    6   10:aload_0         
    //    7   11:getfield        #326 <Field VelocityTracker mVelocityTracker>
    //    8   14:ifnull          29
    //    9   17:aload_0         
    //   10   18:getfield        #326 <Field VelocityTracker mVelocityTracker>
    //   11   21:invokevirtual   #331 <Method void VelocityTracker.recycle()>
    //   12   24:aload_0         
    //   13   25:aconst_null     
    //   14   26:putfield        #326 <Field VelocityTracker mVelocityTracker>
    //   15   29:return          
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       12
    //    2    4:new             #155 <Class Rect>
    //    3    7:dup             
    //    4    8:invokespecial   #156 <Method void Rect()>
    //    5   11:astore_1        
    //    6   12:aload_2         
    //    7   13:ifnonnull       26
    //    8   16:aload_1         
    //    9   17:iconst_0        
    //   10   18:iconst_0        
    //   11   19:iconst_0        
    //   12   20:iconst_0        
    //   13   21:invokevirtual   #337 <Method void Rect.set(int, int, int, int)>
    //   14   24:aload_1         
    //   15   25:areturn         
    //   16   26:aload_1         
    //   17   27:aload_2         
    //   18   28:invokevirtual   #342 <Method int View.getLeft()>
    //   19   31:putfield        #345 <Field int Rect.left>
    //   20   34:aload_1         
    //   21   35:aload_2         
    //   22   36:invokevirtual   #348 <Method int View.getRight()>
    //   23   39:putfield        #351 <Field int Rect.right>
    //   24   42:aload_1         
    //   25   43:aload_2         
    //   26   44:invokevirtual   #354 <Method int View.getTop()>
    //   27   47:putfield        #357 <Field int Rect.top>
    //   28   50:aload_1         
    //   29   51:aload_2         
    //   30   52:invokevirtual   #360 <Method int View.getBottom()>
    //   31   55:putfield        #363 <Field int Rect.bottom>
    //   32   58:aload_2         
    //   33   59:invokevirtual   #367 <Method ViewParent View.getParent()>
    //   34   62:astore_3        
    //   35   63:aload_3         
    //   36   64:instanceof      #4   <Class ViewGroup>
    //   37   67:ifeq            24
    //   38   70:aload_3         
    //   39   71:aload_0         
    //   40   72:if_acmpeq       24
    //   41   75:aload_3         
    //   42   76:checkcast       #4   <Class ViewGroup>
    //   43   79:astore          4
    //   44   81:aload_1         
    //   45   82:aload_1         
    //   46   83:getfield        #345 <Field int Rect.left>
    //   47   86:aload           4
    //   48   88:invokevirtual   #368 <Method int ViewGroup.getLeft()>
    //   49   91:iadd            
    //   50   92:putfield        #345 <Field int Rect.left>
    //   51   95:aload_1         
    //   52   96:aload_1         
    //   53   97:getfield        #351 <Field int Rect.right>
    //   54  100:aload           4
    //   55  102:invokevirtual   #369 <Method int ViewGroup.getRight()>
    //   56  105:iadd            
    //   57  106:putfield        #351 <Field int Rect.right>
    //   58  109:aload_1         
    //   59  110:aload_1         
    //   60  111:getfield        #357 <Field int Rect.top>
    //   61  114:aload           4
    //   62  116:invokevirtual   #370 <Method int ViewGroup.getTop()>
    //   63  119:iadd            
    //   64  120:putfield        #357 <Field int Rect.top>
    //   65  123:aload_1         
    //   66  124:aload_1         
    //   67  125:getfield        #363 <Field int Rect.bottom>
    //   68  128:aload           4
    //   69  130:invokevirtual   #371 <Method int ViewGroup.getBottom()>
    //   70  133:iadd            
    //   71  134:putfield        #363 <Field int Rect.bottom>
    //   72  137:aload           4
    //   73  139:invokevirtual   #372 <Method ViewParent ViewGroup.getParent()>
    //   74  142:astore_3        
    //   75  143:goto            63
    }

    private int getClientWidth()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #375 <Method int getMeasuredWidth()>
    //    2    4:aload_0         
    //    3    5:invokevirtual   #378 <Method int getPaddingLeft()>
    //    4    8:isub            
    //    5    9:aload_0         
    //    6   10:invokevirtual   #381 <Method int getPaddingRight()>
    //    7   13:isub            
    //    8   14:ireturn         
    }

    private ItemInfo infoForCurrentScrollPosition()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #220 <Method int getClientWidth()>
    //    2    4:istore_1        
    //    3    5:iload_1         
    //    4    6:ifle            200
    //    5    9:aload_0         
    //    6   10:invokevirtual   #257 <Method int getScrollX()>
    //    7   13:i2f             
    //    8   14:iload_1         
    //    9   15:i2f             
    //   10   16:fdiv            
    //   11   17:fstore_2        
    //   12   18:fconst_0        
    //   13   19:fstore_3        
    //   14   20:iload_1         
    //   15   21:ifle            33
    //   16   24:aload_0         
    //   17   25:getfield        #222 <Field int mPageMargin>
    //   18   28:i2f             
    //   19   29:iload_1         
    //   20   30:i2f             
    //   21   31:fdiv            
    //   22   32:fstore_3        
    //   23   33:iconst_m1       
    //   24   34:istore          4
    //   25   36:fconst_0        
    //   26   37:fstore          5
    //   27   39:fconst_0        
    //   28   40:fstore          6
    //   29   42:iconst_1        
    //   30   43:istore          7
    //   31   45:aconst_null     
    //   32   46:astore          8
    //   33   48:iconst_0        
    //   34   49:istore          9
    //   35   51:iload           9
    //   36   53:aload_0         
    //   37   54:getfield        #148 <Field ArrayList mItems>
    //   38   57:invokevirtual   #234 <Method int ArrayList.size()>
    //   39   60:icmpge          197
    //   40   63:aload_0         
    //   41   64:getfield        #148 <Field ArrayList mItems>
    //   42   67:iload           9
    //   43   69:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //   44   72:checkcast       #150 <Class ViewPager$ItemInfo>
    //   45   75:astore          10
    //   46   77:iload           7
    //   47   79:ifne            141
    //   48   82:aload           10
    //   49   84:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   50   87:iload           4
    //   51   89:iconst_1        
    //   52   90:iadd            
    //   53   91:icmpeq          141
    //   54   94:aload_0         
    //   55   95:getfield        #153 <Field ViewPager$ItemInfo mTempItem>
    //   56   98:astore          10
    //   57  100:aload           10
    //   58  102:fload_3         
    //   59  103:fload           5
    //   60  105:fload           6
    //   61  107:fadd            
    //   62  108:fadd            
    //   63  109:putfield        #228 <Field float ViewPager$ItemInfo.offset>
    //   64  112:aload           10
    //   65  114:iload           4
    //   66  116:iconst_1        
    //   67  117:iadd            
    //   68  118:putfield        #225 <Field int ViewPager$ItemInfo.position>
    //   69  121:aload           10
    //   70  123:aload_0         
    //   71  124:getfield        #203 <Field PagerAdapter mAdapter>
    //   72  127:aload           10
    //   73  129:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   74  132:invokevirtual   #242 <Method float PagerAdapter.getPageWidth(int)>
    //   75  135:putfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //   76  138:iinc            9  -1
    //   77  141:aload           10
    //   78  143:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //   79  146:fstore          11
    //   80  148:fload_3         
    //   81  149:fload           11
    //   82  151:aload           10
    //   83  153:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //   84  156:fadd            
    //   85  157:fadd            
    //   86  158:fstore          12
    //   87  160:iload           7
    //   88  162:ifne            172
    //   89  165:fload_2         
    //   90  166:fload           11
    //   91  168:fcmpl           
    //   92  169:iflt            197
    //   93  172:fload_2         
    //   94  173:fload           12
    //   95  175:fcmpg           
    //   96  176:iflt            193
    //   97  179:iload           9
    //   98  181:iconst_m1       
    //   99  182:aload_0         
    //  100  183:getfield        #148 <Field ArrayList mItems>
    //  101  186:invokevirtual   #234 <Method int ArrayList.size()>
    //  102  189:iadd            
    //  103  190:icmpne          205
    //  104  193:aload           10
    //  105  195:astore          8
    //  106  197:aload           8
    //  107  199:areturn         
    //  108  200:fconst_0        
    //  109  201:fstore_2        
    //  110  202:goto            18
    //  111  205:aload           10
    //  112  207:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  113  210:istore          4
    //  114  212:fload           11
    //  115  214:fstore          5
    //  116  216:aload           10
    //  117  218:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //  118  221:fstore          6
    //  119  223:aload           10
    //  120  225:astore          8
    //  121  227:iinc            9  1
    //  122  230:iconst_0        
    //  123  231:istore          7
    //  124  233:goto            51
    }

    private boolean isGutterDrag(float f, float f1)
    {
    //    0    0:fload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #387 <Field int mGutterSize>
    //    3    5:i2f             
    //    4    6:fcmpg           
    //    5    7:ifge            16
    //    6   10:fload_2         
    //    7   11:fconst_0        
    //    8   12:fcmpl           
    //    9   13:ifgt            37
    //   10   16:fload_1         
    //   11   17:aload_0         
    //   12   18:invokevirtual   #390 <Method int getWidth()>
    //   13   21:aload_0         
    //   14   22:getfield        #387 <Field int mGutterSize>
    //   15   25:isub            
    //   16   26:i2f             
    //   17   27:fcmpl           
    //   18   28:ifle            39
    //   19   31:fload_2         
    //   20   32:fconst_0        
    //   21   33:fcmpg           
    //   22   34:ifge            39
    //   23   37:iconst_1        
    //   24   38:ireturn         
    //   25   39:iconst_0        
    //   26   40:ireturn         
    }

    private void onSecondaryPointerUp(MotionEvent motionevent)
    {
    //    0    0:aload_1         
    //    1    1:invokestatic    #398 <Method int MotionEventCompat.getActionIndex(MotionEvent)>
    //    2    4:istore_2        
    //    3    5:aload_1         
    //    4    6:iload_2         
    //    5    7:invokestatic    #402 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //    6   10:aload_0         
    //    7   11:getfield        #174 <Field int mActivePointerId>
    //    8   14:icmpne          55
    //    9   17:iload_2         
    //   10   18:ifne            56
    //   11   21:iconst_1        
    //   12   22:istore_3        
    //   13   23:aload_0         
    //   14   24:aload_1         
    //   15   25:iload_3         
    //   16   26:invokestatic    #406 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //   17   29:putfield        #408 <Field float mLastMotionX>
    //   18   32:aload_0         
    //   19   33:aload_1         
    //   20   34:iload_3         
    //   21   35:invokestatic    #402 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //   22   38:putfield        #174 <Field int mActivePointerId>
    //   23   41:aload_0         
    //   24   42:getfield        #326 <Field VelocityTracker mVelocityTracker>
    //   25   45:ifnull          55
    //   26   48:aload_0         
    //   27   49:getfield        #326 <Field VelocityTracker mVelocityTracker>
    //   28   52:invokevirtual   #411 <Method void VelocityTracker.clear()>
    //   29   55:return          
    //   30   56:iconst_0        
    //   31   57:istore_3        
    //   32   58:goto            23
    }

    private boolean pageScrolled(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #148 <Field ArrayList mItems>
    //    2    4:invokevirtual   #234 <Method int ArrayList.size()>
    //    3    7:ifne            47
    //    4   10:aload_0         
    //    5   11:iconst_0        
    //    6   12:putfield        #415 <Field boolean mCalledSuper>
    //    7   15:aload_0         
    //    8   16:iconst_0        
    //    9   17:fconst_0        
    //   10   18:iconst_0        
    //   11   19:invokevirtual   #419 <Method void onPageScrolled(int, float, int)>
    //   12   22:aload_0         
    //   13   23:getfield        #415 <Field boolean mCalledSuper>
    //   14   26:istore          10
    //   15   28:iconst_0        
    //   16   29:istore          9
    //   17   31:iload           10
    //   18   33:ifne            146
    //   19   36:new             #421 <Class IllegalStateException>
    //   20   39:dup             
    //   21   40:ldc2            #423 <String "onPageScrolled did not call superclass implementation">
    //   22   43:invokespecial   #426 <Method void IllegalStateException(String)>
    //   23   46:athrow          
    //   24   47:aload_0         
    //   25   48:invokespecial   #428 <Method ViewPager$ItemInfo infoForCurrentScrollPosition()>
    //   26   51:astore_2        
    //   27   52:aload_0         
    //   28   53:invokespecial   #220 <Method int getClientWidth()>
    //   29   56:istore_3        
    //   30   57:iload_3         
    //   31   58:aload_0         
    //   32   59:getfield        #222 <Field int mPageMargin>
    //   33   62:iadd            
    //   34   63:istore          4
    //   35   65:aload_0         
    //   36   66:getfield        #222 <Field int mPageMargin>
    //   37   69:i2f             
    //   38   70:iload_3         
    //   39   71:i2f             
    //   40   72:fdiv            
    //   41   73:fstore          5
    //   42   75:aload_2         
    //   43   76:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   44   79:istore          6
    //   45   81:iload_1         
    //   46   82:i2f             
    //   47   83:iload_3         
    //   48   84:i2f             
    //   49   85:fdiv            
    //   50   86:aload_2         
    //   51   87:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //   52   90:fsub            
    //   53   91:fload           5
    //   54   93:aload_2         
    //   55   94:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //   56   97:fadd            
    //   57   98:fdiv            
    //   58   99:fstore          7
    //   59  101:fload           7
    //   60  103:iload           4
    //   61  105:i2f             
    //   62  106:fmul            
    //   63  107:f2i             
    //   64  108:istore          8
    //   65  110:aload_0         
    //   66  111:iconst_0        
    //   67  112:putfield        #415 <Field boolean mCalledSuper>
    //   68  115:aload_0         
    //   69  116:iload           6
    //   70  118:fload           7
    //   71  120:iload           8
    //   72  122:invokevirtual   #419 <Method void onPageScrolled(int, float, int)>
    //   73  125:aload_0         
    //   74  126:getfield        #415 <Field boolean mCalledSuper>
    //   75  129:ifne            143
    //   76  132:new             #421 <Class IllegalStateException>
    //   77  135:dup             
    //   78  136:ldc2            #423 <String "onPageScrolled did not call superclass implementation">
    //   79  139:invokespecial   #426 <Method void IllegalStateException(String)>
    //   80  142:athrow          
    //   81  143:iconst_1        
    //   82  144:istore          9
    //   83  146:iload           9
    //   84  148:ireturn         
    }

    private boolean performDrag(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #408 <Field float mLastMotionX>
    //    2    4:fload_1         
    //    3    5:fsub            
    //    4    6:fstore_2        
    //    5    7:aload_0         
    //    6    8:fload_1         
    //    7    9:putfield        #408 <Field float mLastMotionX>
    //    8   12:fload_2         
    //    9   13:aload_0         
    //   10   14:invokevirtual   #257 <Method int getScrollX()>
    //   11   17:i2f             
    //   12   18:fadd            
    //   13   19:fstore_3        
    //   14   20:aload_0         
    //   15   21:invokespecial   #220 <Method int getClientWidth()>
    //   16   24:istore          4
    //   17   26:iload           4
    //   18   28:i2f             
    //   19   29:aload_0         
    //   20   30:getfield        #167 <Field float mFirstOffset>
    //   21   33:fmul            
    //   22   34:fstore          5
    //   23   36:iload           4
    //   24   38:i2f             
    //   25   39:aload_0         
    //   26   40:getfield        #170 <Field float mLastOffset>
    //   27   43:fmul            
    //   28   44:fstore          6
    //   29   46:iconst_1        
    //   30   47:istore          7
    //   31   49:iconst_1        
    //   32   50:istore          8
    //   33   52:aload_0         
    //   34   53:getfield        #148 <Field ArrayList mItems>
    //   35   56:iconst_0        
    //   36   57:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //   37   60:checkcast       #150 <Class ViewPager$ItemInfo>
    //   38   63:astore          9
    //   39   65:aload_0         
    //   40   66:getfield        #148 <Field ArrayList mItems>
    //   41   69:iconst_m1       
    //   42   70:aload_0         
    //   43   71:getfield        #148 <Field ArrayList mItems>
    //   44   74:invokevirtual   #234 <Method int ArrayList.size()>
    //   45   77:iadd            
    //   46   78:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //   47   81:checkcast       #150 <Class ViewPager$ItemInfo>
    //   48   84:astore          10
    //   49   86:aload           9
    //   50   88:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   51   91:ifeq            108
    //   52   94:iconst_0        
    //   53   95:istore          7
    //   54   97:aload           9
    //   55   99:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //   56  102:iload           4
    //   57  104:i2f             
    //   58  105:fmul            
    //   59  106:fstore          5
    //   60  108:aload           10
    //   61  110:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   62  113:iconst_m1       
    //   63  114:aload_0         
    //   64  115:getfield        #203 <Field PagerAdapter mAdapter>
    //   65  118:invokevirtual   #217 <Method int PagerAdapter.getCount()>
    //   66  121:iadd            
    //   67  122:icmpeq          139
    //   68  125:iconst_0        
    //   69  126:istore          8
    //   70  128:aload           10
    //   71  130:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //   72  133:iload           4
    //   73  135:i2f             
    //   74  136:fmul            
    //   75  137:fstore          6
    //   76  139:fload_3         
    //   77  140:fload           5
    //   78  142:fcmpg           
    //   79  143:ifge            215
    //   80  146:iconst_0        
    //   81  147:istore          11
    //   82  149:iload           7
    //   83  151:ifeq            178
    //   84  154:fload           5
    //   85  156:fload_3         
    //   86  157:fsub            
    //   87  158:fstore          13
    //   88  160:aload_0         
    //   89  161:getfield        #432 <Field EdgeEffectCompat mLeftEdge>
    //   90  164:fload           13
    //   91  166:invokestatic    #435 <Method float Math.abs(float)>
    //   92  169:iload           4
    //   93  171:i2f             
    //   94  172:fdiv            
    //   95  173:invokevirtual   #440 <Method boolean EdgeEffectCompat.onPull(float)>
    //   96  176:istore          11
    //   97  178:fload           5
    //   98  180:fstore_3        
    //   99  181:aload_0         
    //  100  182:aload_0         
    //  101  183:getfield        #408 <Field float mLastMotionX>
    //  102  186:fload_3         
    //  103  187:fload_3         
    //  104  188:f2i             
    //  105  189:i2f             
    //  106  190:fsub            
    //  107  191:fadd            
    //  108  192:putfield        #408 <Field float mLastMotionX>
    //  109  195:aload_0         
    //  110  196:fload_3         
    //  111  197:f2i             
    //  112  198:aload_0         
    //  113  199:invokevirtual   #260 <Method int getScrollY()>
    //  114  202:invokevirtual   #270 <Method void scrollTo(int, int)>
    //  115  205:aload_0         
    //  116  206:fload_3         
    //  117  207:f2i             
    //  118  208:invokespecial   #442 <Method boolean pageScrolled(int)>
    //  119  211:pop             
    //  120  212:iload           11
    //  121  214:ireturn         
    //  122  215:fload_3         
    //  123  216:fload           6
    //  124  218:fcmpl           
    //  125  219:istore          14
    //  126  221:iconst_0        
    //  127  222:istore          11
    //  128  224:iload           14
    //  129  226:ifle            181
    //  130  229:iconst_0        
    //  131  230:istore          11
    //  132  232:iload           8
    //  133  234:ifeq            261
    //  134  237:fload_3         
    //  135  238:fload           6
    //  136  240:fsub            
    //  137  241:fstore          15
    //  138  243:aload_0         
    //  139  244:getfield        #444 <Field EdgeEffectCompat mRightEdge>
    //  140  247:fload           15
    //  141  249:invokestatic    #435 <Method float Math.abs(float)>
    //  142  252:iload           4
    //  143  254:i2f             
    //  144  255:fdiv            
    //  145  256:invokevirtual   #440 <Method boolean EdgeEffectCompat.onPull(float)>
    //  146  259:istore          11
    //  147  261:fload           6
    //  148  263:fstore_3        
    //  149  264:goto            181
    }

    private void recomputeScrollPosition(int i, int j, int k, int l)
    {
    //    0    0:iload_2         
    //    1    1:ifle            131
    //    2    4:aload_0         
    //    3    5:getfield        #148 <Field ArrayList mItems>
    //    4    8:invokevirtual   #449 <Method boolean ArrayList.isEmpty()>
    //    5   11:ifne            131
    //    6   14:iload_3         
    //    7   15:iload_1         
    //    8   16:aload_0         
    //    9   17:invokevirtual   #378 <Method int getPaddingLeft()>
    //   10   20:isub            
    //   11   21:aload_0         
    //   12   22:invokevirtual   #381 <Method int getPaddingRight()>
    //   13   25:isub            
    //   14   26:iadd            
    //   15   27:istore          8
    //   16   29:iload           4
    //   17   31:iload_2         
    //   18   32:aload_0         
    //   19   33:invokevirtual   #378 <Method int getPaddingLeft()>
    //   20   36:isub            
    //   21   37:aload_0         
    //   22   38:invokevirtual   #381 <Method int getPaddingRight()>
    //   23   41:isub            
    //   24   42:iadd            
    //   25   43:istore          9
    //   26   45:aload_0         
    //   27   46:invokevirtual   #257 <Method int getScrollX()>
    //   28   49:i2f             
    //   29   50:iload           9
    //   30   52:i2f             
    //   31   53:fdiv            
    //   32   54:iload           8
    //   33   56:i2f             
    //   34   57:fmul            
    //   35   58:f2i             
    //   36   59:istore          10
    //   37   61:aload_0         
    //   38   62:iload           10
    //   39   64:aload_0         
    //   40   65:invokevirtual   #260 <Method int getScrollY()>
    //   41   68:invokevirtual   #270 <Method void scrollTo(int, int)>
    //   42   71:aload_0         
    //   43   72:getfield        #249 <Field Scroller mScroller>
    //   44   75:invokevirtual   #452 <Method boolean Scroller.isFinished()>
    //   45   78:ifne            130
    //   46   81:aload_0         
    //   47   82:getfield        #249 <Field Scroller mScroller>
    //   48   85:invokevirtual   #455 <Method int Scroller.getDuration()>
    //   49   88:aload_0         
    //   50   89:getfield        #249 <Field Scroller mScroller>
    //   51   92:invokevirtual   #458 <Method int Scroller.timePassed()>
    //   52   95:isub            
    //   53   96:istore          11
    //   54   98:aload_0         
    //   55   99:aload_0         
    //   56  100:getfield        #207 <Field int mCurItem>
    //   57  103:invokevirtual   #462 <Method ViewPager$ItemInfo infoForPosition(int)>
    //   58  106:astore          12
    //   59  108:aload_0         
    //   60  109:getfield        #249 <Field Scroller mScroller>
    //   61  112:iload           10
    //   62  114:iconst_0        
    //   63  115:aload           12
    //   64  117:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //   65  120:iload_1         
    //   66  121:i2f             
    //   67  122:fmul            
    //   68  123:f2i             
    //   69  124:iconst_0        
    //   70  125:iload           11
    //   71  127:invokevirtual   #466 <Method void Scroller.startScroll(int, int, int, int, int)>
    //   72  130:return          
    //   73  131:aload_0         
    //   74  132:aload_0         
    //   75  133:getfield        #207 <Field int mCurItem>
    //   76  136:invokevirtual   #462 <Method ViewPager$ItemInfo infoForPosition(int)>
    //   77  139:astore          5
    //   78  141:aload           5
    //   79  143:ifnull          203
    //   80  146:aload           5
    //   81  148:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //   82  151:aload_0         
    //   83  152:getfield        #170 <Field float mLastOffset>
    //   84  155:invokestatic    #469 <Method float Math.min(float, float)>
    //   85  158:fstore          6
    //   86  160:fload           6
    //   87  162:iload_1         
    //   88  163:aload_0         
    //   89  164:invokevirtual   #378 <Method int getPaddingLeft()>
    //   90  167:isub            
    //   91  168:aload_0         
    //   92  169:invokevirtual   #381 <Method int getPaddingRight()>
    //   93  172:isub            
    //   94  173:i2f             
    //   95  174:fmul            
    //   96  175:f2i             
    //   97  176:istore          7
    //   98  178:iload           7
    //   99  180:aload_0         
    //  100  181:invokevirtual   #257 <Method int getScrollX()>
    //  101  184:icmpeq          130
    //  102  187:aload_0         
    //  103  188:iconst_0        
    //  104  189:invokespecial   #471 <Method void completeScroll(boolean)>
    //  105  192:aload_0         
    //  106  193:iload           7
    //  107  195:aload_0         
    //  108  196:invokevirtual   #260 <Method int getScrollY()>
    //  109  199:invokevirtual   #270 <Method void scrollTo(int, int)>
    //  110  202:return          
    //  111  203:fconst_0        
    //  112  204:fstore          6
    //  113  206:goto            160
    }

    private void removeNonDecorViews()
    {
    //    0    0:iconst_0        
    //    1    1:istore_1        
    //    2    2:iload_1         
    //    3    3:aload_0         
    //    4    4:invokevirtual   #311 <Method int getChildCount()>
    //    5    7:icmpge          41
    //    6   10:aload_0         
    //    7   11:iload_1         
    //    8   12:invokevirtual   #315 <Method View getChildAt(int)>
    //    9   15:invokevirtual   #476 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   10   18:checkcast       #478 <Class ViewPager$LayoutParams>
    //   11   21:getfield        #481 <Field boolean ViewPager$LayoutParams.isDecor>
    //   12   24:ifne            35
    //   13   27:aload_0         
    //   14   28:iload_1         
    //   15   29:invokevirtual   #484 <Method void removeViewAt(int)>
    //   16   32:iinc            1  -1
    //   17   35:iinc            1  1
    //   18   38:goto            2
    //   19   41:return          
    }

    private void requestParentDisallowInterceptTouchEvent(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #486 <Method ViewParent getParent()>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:ifnull          16
    //    5    9:aload_2         
    //    6   10:iload_1         
    //    7   11:invokeinterface #491 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
    //    8   16:return          
    }

    private void scrollToItem(int i, boolean flag, int j, boolean flag1)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #462 <Method ViewPager$ItemInfo infoForPosition(int)>
    //    3    5:astore          5
    //    4    7:iconst_0        
    //    5    8:istore          6
    //    6   10:aload           5
    //    7   12:ifnull          43
    //    8   15:aload_0         
    //    9   16:invokespecial   #220 <Method int getClientWidth()>
    //   10   19:i2f             
    //   11   20:aload_0         
    //   12   21:getfield        #167 <Field float mFirstOffset>
    //   13   24:aload           5
    //   14   26:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //   15   29:aload_0         
    //   16   30:getfield        #170 <Field float mLastOffset>
    //   17   33:invokestatic    #469 <Method float Math.min(float, float)>
    //   18   36:invokestatic    #495 <Method float Math.max(float, float)>
    //   19   39:fmul            
    //   20   40:f2i             
    //   21   41:istore          6
    //   22   43:iload_2         
    //   23   44:ifeq            100
    //   24   47:aload_0         
    //   25   48:iload           6
    //   26   50:iconst_0        
    //   27   51:iload_3         
    //   28   52:invokevirtual   #499 <Method void smoothScrollTo(int, int, int)>
    //   29   55:iload           4
    //   30   57:ifeq            77
    //   31   60:aload_0         
    //   32   61:getfield        #501 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
    //   33   64:ifnull          77
    //   34   67:aload_0         
    //   35   68:getfield        #501 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
    //   36   71:iload_1         
    //   37   72:invokeinterface #506 <Method void ViewPager$OnPageChangeListener.onPageSelected(int)>
    //   38   77:iload           4
    //   39   79:ifeq            99
    //   40   82:aload_0         
    //   41   83:getfield        #508 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
    //   42   86:ifnull          99
    //   43   89:aload_0         
    //   44   90:getfield        #508 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
    //   45   93:iload_1         
    //   46   94:invokeinterface #506 <Method void ViewPager$OnPageChangeListener.onPageSelected(int)>
    //   47   99:return          
    //   48  100:iload           4
    //   49  102:ifeq            122
    //   50  105:aload_0         
    //   51  106:getfield        #501 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
    //   52  109:ifnull          122
    //   53  112:aload_0         
    //   54  113:getfield        #501 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
    //   55  116:iload_1         
    //   56  117:invokeinterface #506 <Method void ViewPager$OnPageChangeListener.onPageSelected(int)>
    //   57  122:iload           4
    //   58  124:ifeq            144
    //   59  127:aload_0         
    //   60  128:getfield        #508 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
    //   61  131:ifnull          144
    //   62  134:aload_0         
    //   63  135:getfield        #508 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
    //   64  138:iload_1         
    //   65  139:invokeinterface #506 <Method void ViewPager$OnPageChangeListener.onPageSelected(int)>
    //   66  144:aload_0         
    //   67  145:iconst_0        
    //   68  146:invokespecial   #471 <Method void completeScroll(boolean)>
    //   69  149:aload_0         
    //   70  150:iload           6
    //   71  152:iconst_0        
    //   72  153:invokevirtual   #270 <Method void scrollTo(int, int)>
    //   73  156:aload_0         
    //   74  157:iload           6
    //   75  159:invokespecial   #442 <Method boolean pageScrolled(int)>
    //   76  162:pop             
    //   77  163:return          
    }

    private void setScrollState(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #187 <Field int mScrollState>
    //    2    4:iload_1         
    //    3    5:icmpne          9
    //    4    8:return          
    //    5    9:aload_0         
    //    6   10:iload_1         
    //    7   11:putfield        #187 <Field int mScrollState>
    //    8   14:aload_0         
    //    9   15:getfield        #510 <Field ViewPager$PageTransformer mPageTransformer>
    //   10   18:ifnull          32
    //   11   21:iload_1         
    //   12   22:ifeq            50
    //   13   25:iconst_1        
    //   14   26:istore_2        
    //   15   27:aload_0         
    //   16   28:iload_2         
    //   17   29:invokespecial   #512 <Method void enableLayers(boolean)>
    //   18   32:aload_0         
    //   19   33:getfield        #501 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
    //   20   36:ifnull          8
    //   21   39:aload_0         
    //   22   40:getfield        #501 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
    //   23   43:iload_1         
    //   24   44:invokeinterface #515 <Method void ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
    //   25   49:return          
    //   26   50:iconst_0        
    //   27   51:istore_2        
    //   28   52:goto            27
    }

    private void setScrollingCacheEnabled(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #517 <Field boolean mScrollingCacheEnabled>
    //    2    4:iload_1         
    //    3    5:icmpeq          13
    //    4    8:aload_0         
    //    5    9:iload_1         
    //    6   10:putfield        #517 <Field boolean mScrollingCacheEnabled>
    //    7   13:return          
    }

    private void sortChildDrawingOrder()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #520 <Field int mDrawingOrder>
    //    2    4:ifeq            78
    //    3    7:aload_0         
    //    4    8:getfield        #522 <Field ArrayList mDrawingOrderedChildren>
    //    5   11:ifnonnull       58
    //    6   14:aload_0         
    //    7   15:new             #145 <Class ArrayList>
    //    8   18:dup             
    //    9   19:invokespecial   #146 <Method void ArrayList()>
    //   10   22:putfield        #522 <Field ArrayList mDrawingOrderedChildren>
    //   11   25:aload_0         
    //   12   26:invokevirtual   #311 <Method int getChildCount()>
    //   13   29:istore_1        
    //   14   30:iconst_0        
    //   15   31:istore_2        
    //   16   32:iload_2         
    //   17   33:iload_1         
    //   18   34:icmpge          68
    //   19   37:aload_0         
    //   20   38:iload_2         
    //   21   39:invokevirtual   #315 <Method View getChildAt(int)>
    //   22   42:astore_3        
    //   23   43:aload_0         
    //   24   44:getfield        #522 <Field ArrayList mDrawingOrderedChildren>
    //   25   47:aload_3         
    //   26   48:invokevirtual   #526 <Method boolean ArrayList.add(Object)>
    //   27   51:pop             
    //   28   52:iinc            2  1
    //   29   55:goto            32
    //   30   58:aload_0         
    //   31   59:getfield        #522 <Field ArrayList mDrawingOrderedChildren>
    //   32   62:invokevirtual   #527 <Method void ArrayList.clear()>
    //   33   65:goto            25
    //   34   68:aload_0         
    //   35   69:getfield        #522 <Field ArrayList mDrawingOrderedChildren>
    //   36   72:getstatic       #140 <Field ViewPager$ViewPositionComparator sPositionComparator>
    //   37   75:invokestatic    #533 <Method void Collections.sort(java.util.List, Comparator)>
    //   38   78:return          
    }

    public void addFocusables(ArrayList arraylist, int i, int j)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #234 <Method int ArrayList.size()>
    //    2    4:istore          4
    //    3    6:aload_0         
    //    4    7:invokevirtual   #538 <Method int getDescendantFocusability()>
    //    5   10:istore          5
    //    6   12:iload           5
    //    7   14:ldc2            #539 <Int 0x60000>
    //    8   17:icmpeq          87
    //    9   20:iconst_0        
    //   10   21:istore          7
    //   11   23:iload           7
    //   12   25:aload_0         
    //   13   26:invokevirtual   #311 <Method int getChildCount()>
    //   14   29:icmpge          87
    //   15   32:aload_0         
    //   16   33:iload           7
    //   17   35:invokevirtual   #315 <Method View getChildAt(int)>
    //   18   38:astore          8
    //   19   40:aload           8
    //   20   42:invokevirtual   #542 <Method int View.getVisibility()>
    //   21   45:ifne            81
    //   22   48:aload_0         
    //   23   49:aload           8
    //   24   51:invokevirtual   #546 <Method ViewPager$ItemInfo infoForChild(View)>
    //   25   54:astore          9
    //   26   56:aload           9
    //   27   58:ifnull          81
    //   28   61:aload           9
    //   29   63:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   30   66:aload_0         
    //   31   67:getfield        #207 <Field int mCurItem>
    //   32   70:icmpne          81
    //   33   73:aload           8
    //   34   75:aload_1         
    //   35   76:iload_2         
    //   36   77:iload_3         
    //   37   78:invokevirtual   #548 <Method void View.addFocusables(ArrayList, int, int)>
    //   38   81:iinc            7  1
    //   39   84:goto            23
    //   40   87:iload           5
    //   41   89:ldc2            #549 <Int 0x40000>
    //   42   92:icmpne          104
    //   43   95:iload           4
    //   44   97:aload_1         
    //   45   98:invokevirtual   #234 <Method int ArrayList.size()>
    //   46  101:icmpne          111
    //   47  104:aload_0         
    //   48  105:invokevirtual   #552 <Method boolean isFocusable()>
    //   49  108:ifne            112
    //   50  111:return          
    //   51  112:iload_3         
    //   52  113:iconst_1        
    //   53  114:iand            
    //   54  115:iconst_1        
    //   55  116:icmpne          133
    //   56  119:aload_0         
    //   57  120:invokevirtual   #555 <Method boolean isInTouchMode()>
    //   58  123:ifeq            133
    //   59  126:aload_0         
    //   60  127:invokevirtual   #558 <Method boolean isFocusableInTouchMode()>
    //   61  130:ifeq            111
    //   62  133:aload_1         
    //   63  134:ifnull          111
    //   64  137:aload_1         
    //   65  138:aload_0         
    //   66  139:invokevirtual   #526 <Method boolean ArrayList.add(Object)>
    //   67  142:pop             
    //   68  143:return          
    }

    ItemInfo addNewItem(int i, int j)
    {
    //    0    0:new             #150 <Class ViewPager$ItemInfo>
    //    1    3:dup             
    //    2    4:invokespecial   #151 <Method void ViewPager$ItemInfo()>
    //    3    7:astore_3        
    //    4    8:aload_3         
    //    5    9:iload_1         
    //    6   10:putfield        #225 <Field int ViewPager$ItemInfo.position>
    //    7   13:aload_3         
    //    8   14:aload_0         
    //    9   15:getfield        #203 <Field PagerAdapter mAdapter>
    //   10   18:aload_0         
    //   11   19:iload_1         
    //   12   20:invokevirtual   #564 <Method Object PagerAdapter.instantiateItem(ViewGroup, int)>
    //   13   23:putfield        #568 <Field Object ViewPager$ItemInfo.object>
    //   14   26:aload_3         
    //   15   27:aload_0         
    //   16   28:getfield        #203 <Field PagerAdapter mAdapter>
    //   17   31:iload_1         
    //   18   32:invokevirtual   #242 <Method float PagerAdapter.getPageWidth(int)>
    //   19   35:putfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //   20   38:iload_2         
    //   21   39:iflt            53
    //   22   42:iload_2         
    //   23   43:aload_0         
    //   24   44:getfield        #148 <Field ArrayList mItems>
    //   25   47:invokevirtual   #234 <Method int ArrayList.size()>
    //   26   50:icmplt          64
    //   27   53:aload_0         
    //   28   54:getfield        #148 <Field ArrayList mItems>
    //   29   57:aload_3         
    //   30   58:invokevirtual   #526 <Method boolean ArrayList.add(Object)>
    //   31   61:pop             
    //   32   62:aload_3         
    //   33   63:areturn         
    //   34   64:aload_0         
    //   35   65:getfield        #148 <Field ArrayList mItems>
    //   36   68:iload_2         
    //   37   69:aload_3         
    //   38   70:invokevirtual   #571 <Method void ArrayList.add(int, Object)>
    //   39   73:aload_3         
    //   40   74:areturn         
    }

    public void addTouchables(ArrayList arraylist)
    {
    //    0    0:iconst_0        
    //    1    1:istore_2        
    //    2    2:iload_2         
    //    3    3:aload_0         
    //    4    4:invokevirtual   #311 <Method int getChildCount()>
    //    5    7:icmpge          58
    //    6   10:aload_0         
    //    7   11:iload_2         
    //    8   12:invokevirtual   #315 <Method View getChildAt(int)>
    //    9   15:astore_3        
    //   10   16:aload_3         
    //   11   17:invokevirtual   #542 <Method int View.getVisibility()>
    //   12   20:ifne            52
    //   13   23:aload_0         
    //   14   24:aload_3         
    //   15   25:invokevirtual   #546 <Method ViewPager$ItemInfo infoForChild(View)>
    //   16   28:astore          4
    //   17   30:aload           4
    //   18   32:ifnull          52
    //   19   35:aload           4
    //   20   37:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   21   40:aload_0         
    //   22   41:getfield        #207 <Field int mCurItem>
    //   23   44:icmpne          52
    //   24   47:aload_3         
    //   25   48:aload_1         
    //   26   49:invokevirtual   #575 <Method void View.addTouchables(ArrayList)>
    //   27   52:iinc            2  1
    //   28   55:goto            2
    //   29   58:return          
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:aload_0         
    //    1    1:aload_3         
    //    2    2:invokevirtual   #581 <Method boolean checkLayoutParams(android.view.ViewGroup$LayoutParams)>
    //    3    5:ifne            14
    //    4    8:aload_0         
    //    5    9:aload_3         
    //    6   10:invokevirtual   #585 <Method android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
    //    7   13:astore_3        
    //    8   14:aload_3         
    //    9   15:checkcast       #478 <Class ViewPager$LayoutParams>
    //   10   18:astore          4
    //   11   20:aload           4
    //   12   22:aload           4
    //   13   24:getfield        #481 <Field boolean ViewPager$LayoutParams.isDecor>
    //   14   27:aload_1         
    //   15   28:instanceof      #587 <Class ViewPager$Decor>
    //   16   31:ior             
    //   17   32:putfield        #481 <Field boolean ViewPager$LayoutParams.isDecor>
    //   18   35:aload_0         
    //   19   36:getfield        #589 <Field boolean mInLayout>
    //   20   39:ifeq            81
    //   21   42:aload           4
    //   22   44:ifnull          66
    //   23   47:aload           4
    //   24   49:getfield        #481 <Field boolean ViewPager$LayoutParams.isDecor>
    //   25   52:ifeq            66
    //   26   55:new             #421 <Class IllegalStateException>
    //   27   58:dup             
    //   28   59:ldc2            #591 <String "Cannot add pager decor view during layout">
    //   29   62:invokespecial   #426 <Method void IllegalStateException(String)>
    //   30   65:athrow          
    //   31   66:aload           4
    //   32   68:iconst_1        
    //   33   69:putfield        #594 <Field boolean ViewPager$LayoutParams.needsMeasure>
    //   34   72:aload_0         
    //   35   73:aload_1         
    //   36   74:iload_2         
    //   37   75:aload_3         
    //   38   76:invokevirtual   #598 <Method boolean addViewInLayout(View, int, android.view.ViewGroup$LayoutParams)>
    //   39   79:pop             
    //   40   80:return          
    //   41   81:aload_0         
    //   42   82:aload_1         
    //   43   83:iload_2         
    //   44   84:aload_3         
    //   45   85:invokespecial   #600 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
    //   46   88:return          
    }

    public boolean arrowScroll(int i)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #605 <Method View findFocus()>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:aload_0         
    //    5    7:if_acmpne       102
    //    6   10:aconst_null     
    //    7   11:astore_2        
    //    8   12:invokestatic    #611 <Method FocusFinder FocusFinder.getInstance()>
    //    9   15:aload_0         
    //   10   16:aload_2         
    //   11   17:iload_1         
    //   12   18:invokevirtual   #615 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
    //   13   21:astore          10
    //   14   23:aload           10
    //   15   25:ifnull          329
    //   16   28:aload           10
    //   17   30:aload_2         
    //   18   31:if_acmpeq       329
    //   19   34:iload_1         
    //   20   35:bipush          17
    //   21   37:icmpne          261
    //   22   40:aload_0         
    //   23   41:aload_0         
    //   24   42:getfield        #158 <Field Rect mTempRect>
    //   25   45:aload           10
    //   26   47:invokespecial   #617 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
    //   27   50:getfield        #345 <Field int Rect.left>
    //   28   53:istore          14
    //   29   55:aload_0         
    //   30   56:aload_0         
    //   31   57:getfield        #158 <Field Rect mTempRect>
    //   32   60:aload_2         
    //   33   61:invokespecial   #617 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
    //   34   64:getfield        #345 <Field int Rect.left>
    //   35   67:istore          15
    //   36   69:aload_2         
    //   37   70:ifnull          251
    //   38   73:iload           14
    //   39   75:iload           15
    //   40   77:icmplt          251
    //   41   80:aload_0         
    //   42   81:invokevirtual   #620 <Method boolean pageLeft()>
    //   43   84:istore          11
    //   44   86:iload           11
    //   45   88:ifeq            99
    //   46   91:aload_0         
    //   47   92:iload_1         
    //   48   93:invokestatic    #625 <Method int SoundEffectConstants.getContantForFocusDirection(int)>
    //   49   96:invokevirtual   #628 <Method void playSoundEffect(int)>
    //   50   99:iload           11
    //   51  101:ireturn         
    //   52  102:aload_2         
    //   53  103:ifnull          12
    //   54  106:aload_2         
    //   55  107:invokevirtual   #367 <Method ViewParent View.getParent()>
    //   56  110:astore_3        
    //   57  111:aload_3         
    //   58  112:instanceof      #4   <Class ViewGroup>
    //   59  115:istore          4
    //   60  117:iconst_0        
    //   61  118:istore          5
    //   62  120:iload           4
    //   63  122:ifeq            133
    //   64  125:aload_3         
    //   65  126:aload_0         
    //   66  127:if_acmpne       206
    //   67  130:iconst_1        
    //   68  131:istore          5
    //   69  133:iload           5
    //   70  135:ifne            12
    //   71  138:new             #630 <Class StringBuilder>
    //   72  141:dup             
    //   73  142:invokespecial   #631 <Method void StringBuilder()>
    //   74  145:astore          6
    //   75  147:aload           6
    //   76  149:aload_2         
    //   77  150:invokevirtual   #637 <Method Class Object.getClass()>
    //   78  153:invokevirtual   #643 <Method String Class.getSimpleName()>
    //   79  156:invokevirtual   #647 <Method StringBuilder StringBuilder.append(String)>
    //   80  159:pop             
    //   81  160:aload_2         
    //   82  161:invokevirtual   #367 <Method ViewParent View.getParent()>
    //   83  164:astore          8
    //   84  166:aload           8
    //   85  168:instanceof      #4   <Class ViewGroup>
    //   86  171:ifeq            216
    //   87  174:aload           6
    //   88  176:ldc2            #649 <String " => ">
    //   89  179:invokevirtual   #647 <Method StringBuilder StringBuilder.append(String)>
    //   90  182:aload           8
    //   91  184:invokevirtual   #637 <Method Class Object.getClass()>
    //   92  187:invokevirtual   #643 <Method String Class.getSimpleName()>
    //   93  190:invokevirtual   #647 <Method StringBuilder StringBuilder.append(String)>
    //   94  193:pop             
    //   95  194:aload           8
    //   96  196:invokeinterface #650 <Method ViewParent ViewParent.getParent()>
    //   97  201:astore          8
    //   98  203:goto            166
    //   99  206:aload_3         
    //  100  207:invokeinterface #650 <Method ViewParent ViewParent.getParent()>
    //  101  212:astore_3        
    //  102  213:goto            111
    //  103  216:ldc1            #37  <String "ViewPager">
    //  104  218:new             #630 <Class StringBuilder>
    //  105  221:dup             
    //  106  222:invokespecial   #631 <Method void StringBuilder()>
    //  107  225:ldc2            #652 <String "arrowScroll tried to find focus based on non-child current focused view ">
    //  108  228:invokevirtual   #647 <Method StringBuilder StringBuilder.append(String)>
    //  109  231:aload           6
    //  110  233:invokevirtual   #655 <Method String StringBuilder.toString()>
    //  111  236:invokevirtual   #647 <Method StringBuilder StringBuilder.append(String)>
    //  112  239:invokevirtual   #655 <Method String StringBuilder.toString()>
    //  113  242:invokestatic    #661 <Method int Log.e(String, String)>
    //  114  245:pop             
    //  115  246:aconst_null     
    //  116  247:astore_2        
    //  117  248:goto            12
    //  118  251:aload           10
    //  119  253:invokevirtual   #664 <Method boolean View.requestFocus()>
    //  120  256:istore          11
    //  121  258:goto            86
    //  122  261:iconst_0        
    //  123  262:istore          11
    //  124  264:iload_1         
    //  125  265:bipush          66
    //  126  267:icmpne          86
    //  127  270:aload_0         
    //  128  271:aload_0         
    //  129  272:getfield        #158 <Field Rect mTempRect>
    //  130  275:aload           10
    //  131  277:invokespecial   #617 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
    //  132  280:getfield        #345 <Field int Rect.left>
    //  133  283:istore          12
    //  134  285:aload_0         
    //  135  286:aload_0         
    //  136  287:getfield        #158 <Field Rect mTempRect>
    //  137  290:aload_2         
    //  138  291:invokespecial   #617 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
    //  139  294:getfield        #345 <Field int Rect.left>
    //  140  297:istore          13
    //  141  299:aload_2         
    //  142  300:ifnull          319
    //  143  303:iload           12
    //  144  305:iload           13
    //  145  307:icmpgt          319
    //  146  310:aload_0         
    //  147  311:invokevirtual   #667 <Method boolean pageRight()>
    //  148  314:istore          11
    //  149  316:goto            86
    //  150  319:aload           10
    //  151  321:invokevirtual   #664 <Method boolean View.requestFocus()>
    //  152  324:istore          11
    //  153  326:goto            86
    //  154  329:iload_1         
    //  155  330:bipush          17
    //  156  332:icmpeq          340
    //  157  335:iload_1         
    //  158  336:iconst_1        
    //  159  337:icmpne          349
    //  160  340:aload_0         
    //  161  341:invokevirtual   #620 <Method boolean pageLeft()>
    //  162  344:istore          11
    //  163  346:goto            86
    //  164  349:iload_1         
    //  165  350:bipush          66
    //  166  352:icmpeq          363
    //  167  355:iconst_0        
    //  168  356:istore          11
    //  169  358:iload_1         
    //  170  359:iconst_2        
    //  171  360:icmpne          86
    //  172  363:aload_0         
    //  173  364:invokevirtual   #667 <Method boolean pageRight()>
    //  174  367:istore          11
    //  175  369:goto            86
    }

    public boolean beginFakeDrag()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #322 <Field boolean mIsBeingDragged>
    //    2    4:ifeq            9
    //    3    7:iconst_0        
    //    4    8:ireturn         
    //    5    9:aload_0         
    //    6   10:iconst_1        
    //    7   11:putfield        #670 <Field boolean mFakeDragging>
    //    8   14:aload_0         
    //    9   15:iconst_1        
    //   10   16:invokespecial   #199 <Method void setScrollState(int)>
    //   11   19:aload_0         
    //   12   20:fconst_0        
    //   13   21:putfield        #408 <Field float mLastMotionX>
    //   14   24:aload_0         
    //   15   25:fconst_0        
    //   16   26:putfield        #672 <Field float mInitialMotionX>
    //   17   29:aload_0         
    //   18   30:getfield        #326 <Field VelocityTracker mVelocityTracker>
    //   19   33:ifnonnull       76
    //   20   36:aload_0         
    //   21   37:invokestatic    #676 <Method VelocityTracker VelocityTracker.obtain()>
    //   22   40:putfield        #326 <Field VelocityTracker mVelocityTracker>
    //   23   43:invokestatic    #682 <Method long SystemClock.uptimeMillis()>
    //   24   46:lstore_1        
    //   25   47:lload_1         
    //   26   48:lload_1         
    //   27   49:iconst_0        
    //   28   50:fconst_0        
    //   29   51:fconst_0        
    //   30   52:iconst_0        
    //   31   53:invokestatic    #687 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
    //   32   56:astore_3        
    //   33   57:aload_0         
    //   34   58:getfield        #326 <Field VelocityTracker mVelocityTracker>
    //   35   61:aload_3         
    //   36   62:invokevirtual   #690 <Method void VelocityTracker.addMovement(MotionEvent)>
    //   37   65:aload_3         
    //   38   66:invokevirtual   #691 <Method void MotionEvent.recycle()>
    //   39   69:aload_0         
    //   40   70:lload_1         
    //   41   71:putfield        #693 <Field long mFakeDragBeginTime>
    //   42   74:iconst_1        
    //   43   75:ireturn         
    //   44   76:aload_0         
    //   45   77:getfield        #326 <Field VelocityTracker mVelocityTracker>
    //   46   80:invokevirtual   #411 <Method void VelocityTracker.clear()>
    //   47   83:goto            43
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
    //    7   14:invokevirtual   #696 <Method int View.getScrollX()>
    //    8   17:istore          7
    //    9   19:aload_1         
    //   10   20:invokevirtual   #697 <Method int View.getScrollY()>
    //   11   23:istore          8
    //   12   25:iconst_m1       
    //   13   26:aload           6
    //   14   28:invokevirtual   #698 <Method int ViewGroup.getChildCount()>
    //   15   31:iadd            
    //   16   32:istore          9
    //   17   34:iload           9
    //   18   36:iflt            141
    //   19   39:aload           6
    //   20   41:iload           9
    //   21   43:invokevirtual   #699 <Method View ViewGroup.getChildAt(int)>
    //   22   46:astore          10
    //   23   48:iload           4
    //   24   50:iload           7
    //   25   52:iadd            
    //   26   53:aload           10
    //   27   55:invokevirtual   #342 <Method int View.getLeft()>
    //   28   58:icmplt          135
    //   29   61:iload           4
    //   30   63:iload           7
    //   31   65:iadd            
    //   32   66:aload           10
    //   33   68:invokevirtual   #348 <Method int View.getRight()>
    //   34   71:icmpge          135
    //   35   74:iload           5
    //   36   76:iload           8
    //   37   78:iadd            
    //   38   79:aload           10
    //   39   81:invokevirtual   #354 <Method int View.getTop()>
    //   40   84:icmplt          135
    //   41   87:iload           5
    //   42   89:iload           8
    //   43   91:iadd            
    //   44   92:aload           10
    //   45   94:invokevirtual   #360 <Method int View.getBottom()>
    //   46   97:icmpge          135
    //   47  100:aload_0         
    //   48  101:aload           10
    //   49  103:iconst_1        
    //   50  104:iload_3         
    //   51  105:iload           4
    //   52  107:iload           7
    //   53  109:iadd            
    //   54  110:aload           10
    //   55  112:invokevirtual   #342 <Method int View.getLeft()>
    //   56  115:isub            
    //   57  116:iload           5
    //   58  118:iload           8
    //   59  120:iadd            
    //   60  121:aload           10
    //   61  123:invokevirtual   #354 <Method int View.getTop()>
    //   62  126:isub            
    //   63  127:invokevirtual   #701 <Method boolean canScroll(View, boolean, int, int, int)>
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
    //   74  148:invokestatic    #705 <Method boolean ViewCompat.canScrollHorizontally(View, int)>
    //   75  151:ifeq            156
    //   76  154:iconst_1        
    //   77  155:ireturn         
    //   78  156:iconst_0        
    //   79  157:ireturn         
    }

    public boolean canScrollHorizontally(int i)
    {
    //    0    0:iconst_1        
    //    1    1:istore_2        
    //    2    2:aload_0         
    //    3    3:getfield        #203 <Field PagerAdapter mAdapter>
    //    4    6:ifnonnull       11
    //    5    9:iconst_0        
    //    6   10:ireturn         
    //    7   11:aload_0         
    //    8   12:invokespecial   #220 <Method int getClientWidth()>
    //    9   15:istore_3        
    //   10   16:aload_0         
    //   11   17:invokevirtual   #257 <Method int getScrollX()>
    //   12   20:istore          4
    //   13   22:iload_1         
    //   14   23:ifge            46
    //   15   26:iload           4
    //   16   28:iload_3         
    //   17   29:i2f             
    //   18   30:aload_0         
    //   19   31:getfield        #167 <Field float mFirstOffset>
    //   20   34:fmul            
    //   21   35:f2i             
    //   22   36:icmple          41
    //   23   39:iload_2         
    //   24   40:ireturn         
    //   25   41:iconst_0        
    //   26   42:istore_2        
    //   27   43:goto            39
    //   28   46:iload_1         
    //   29   47:ifle            9
    //   30   50:iload           4
    //   31   52:iload_3         
    //   32   53:i2f             
    //   33   54:aload_0         
    //   34   55:getfield        #170 <Field float mLastOffset>
    //   35   58:fmul            
    //   36   59:f2i             
    //   37   60:icmpge          65
    //   38   63:iload_2         
    //   39   64:ireturn         
    //   40   65:iconst_0        
    //   41   66:istore_2        
    //   42   67:goto            63
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:aload_1         
    //    1    1:instanceof      #478 <Class ViewPager$LayoutParams>
    //    2    4:ifeq            17
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:invokespecial   #706 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
    //    6   12:ifeq            17
    //    7   15:iconst_1        
    //    8   16:ireturn         
    //    9   17:iconst_0        
    //   10   18:ireturn         
    }

    public void computeScroll()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #249 <Field Scroller mScroller>
    //    2    4:invokevirtual   #452 <Method boolean Scroller.isFinished()>
    //    3    7:ifne            92
    //    4   10:aload_0         
    //    5   11:getfield        #249 <Field Scroller mScroller>
    //    6   14:invokevirtual   #710 <Method boolean Scroller.computeScrollOffset()>
    //    7   17:ifeq            92
    //    8   20:aload_0         
    //    9   21:invokevirtual   #257 <Method int getScrollX()>
    //   10   24:istore_1        
    //   11   25:aload_0         
    //   12   26:invokevirtual   #260 <Method int getScrollY()>
    //   13   29:istore_2        
    //   14   30:aload_0         
    //   15   31:getfield        #249 <Field Scroller mScroller>
    //   16   34:invokevirtual   #263 <Method int Scroller.getCurrX()>
    //   17   37:istore_3        
    //   18   38:aload_0         
    //   19   39:getfield        #249 <Field Scroller mScroller>
    //   20   42:invokevirtual   #266 <Method int Scroller.getCurrY()>
    //   21   45:istore          4
    //   22   47:iload_1         
    //   23   48:iload_3         
    //   24   49:icmpne          58
    //   25   52:iload_2         
    //   26   53:iload           4
    //   27   55:icmpeq          87
    //   28   58:aload_0         
    //   29   59:iload_3         
    //   30   60:iload           4
    //   31   62:invokevirtual   #270 <Method void scrollTo(int, int)>
    //   32   65:aload_0         
    //   33   66:iload_3         
    //   34   67:invokespecial   #442 <Method boolean pageScrolled(int)>
    //   35   70:ifne            87
    //   36   73:aload_0         
    //   37   74:getfield        #249 <Field Scroller mScroller>
    //   38   77:invokevirtual   #254 <Method void Scroller.abortAnimation()>
    //   39   80:aload_0         
    //   40   81:iconst_0        
    //   41   82:iload           4
    //   42   84:invokevirtual   #270 <Method void scrollTo(int, int)>
    //   43   87:aload_0         
    //   44   88:invokestatic    #714 <Method void ViewCompat.postInvalidateOnAnimation(View)>
    //   45   91:return          
    //   46   92:aload_0         
    //   47   93:iconst_1        
    //   48   94:invokespecial   #471 <Method void completeScroll(boolean)>
    //   49   97:return          
    }

    void dataSetChanged()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #203 <Field PagerAdapter mAdapter>
    //    2    4:invokevirtual   #217 <Method int PagerAdapter.getCount()>
    //    3    7:istore_1        
    //    4    8:aload_0         
    //    5    9:iload_1         
    //    6   10:putfield        #717 <Field int mExpectedAdapterCount>
    //    7   13:aload_0         
    //    8   14:getfield        #148 <Field ArrayList mItems>
    //    9   17:invokevirtual   #234 <Method int ArrayList.size()>
    //   10   20:iconst_1        
    //   11   21:iconst_2        
    //   12   22:aload_0         
    //   13   23:getfield        #172 <Field int mOffscreenPageLimit>
    //   14   26:imul            
    //   15   27:iadd            
    //   16   28:icmpge          107
    //   17   31:aload_0         
    //   18   32:getfield        #148 <Field ArrayList mItems>
    //   19   35:invokevirtual   #234 <Method int ArrayList.size()>
    //   20   38:iload_1         
    //   21   39:icmpge          107
    //   22   42:iconst_1        
    //   23   43:istore_2        
    //   24   44:aload_0         
    //   25   45:getfield        #207 <Field int mCurItem>
    //   26   48:istore_3        
    //   27   49:iconst_0        
    //   28   50:istore          4
    //   29   52:iconst_0        
    //   30   53:istore          5
    //   31   55:iload           5
    //   32   57:aload_0         
    //   33   58:getfield        #148 <Field ArrayList mItems>
    //   34   61:invokevirtual   #234 <Method int ArrayList.size()>
    //   35   64:icmpge          237
    //   36   67:aload_0         
    //   37   68:getfield        #148 <Field ArrayList mItems>
    //   38   71:iload           5
    //   39   73:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //   40   76:checkcast       #150 <Class ViewPager$ItemInfo>
    //   41   79:astore          9
    //   42   81:aload_0         
    //   43   82:getfield        #203 <Field PagerAdapter mAdapter>
    //   44   85:aload           9
    //   45   87:getfield        #568 <Field Object ViewPager$ItemInfo.object>
    //   46   90:invokevirtual   #721 <Method int PagerAdapter.getItemPosition(Object)>
    //   47   93:istore          10
    //   48   95:iload           10
    //   49   97:iconst_m1       
    //   50   98:icmpne          112
    //   51  101:iinc            5  1
    //   52  104:goto            55
    //   53  107:iconst_0        
    //   54  108:istore_2        
    //   55  109:goto            44
    //   56  112:iload           10
    //   57  114:bipush          -2
    //   58  116:icmpne          200
    //   59  119:aload_0         
    //   60  120:getfield        #148 <Field ArrayList mItems>
    //   61  123:iload           5
    //   62  125:invokevirtual   #724 <Method Object ArrayList.remove(int)>
    //   63  128:pop             
    //   64  129:iinc            5  -1
    //   65  132:iload           4
    //   66  134:ifne            148
    //   67  137:aload_0         
    //   68  138:getfield        #203 <Field PagerAdapter mAdapter>
    //   69  141:aload_0         
    //   70  142:invokevirtual   #728 <Method void PagerAdapter.startUpdate(ViewGroup)>
    //   71  145:iconst_1        
    //   72  146:istore          4
    //   73  148:aload_0         
    //   74  149:getfield        #203 <Field PagerAdapter mAdapter>
    //   75  152:aload_0         
    //   76  153:aload           9
    //   77  155:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   78  158:aload           9
    //   79  160:getfield        #568 <Field Object ViewPager$ItemInfo.object>
    //   80  163:invokevirtual   #732 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
    //   81  166:iconst_1        
    //   82  167:istore_2        
    //   83  168:aload_0         
    //   84  169:getfield        #207 <Field int mCurItem>
    //   85  172:aload           9
    //   86  174:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   87  177:icmpne          101
    //   88  180:iconst_0        
    //   89  181:aload_0         
    //   90  182:getfield        #207 <Field int mCurItem>
    //   91  185:iload_1         
    //   92  186:iconst_1        
    //   93  187:isub            
    //   94  188:invokestatic    #302 <Method int Math.min(int, int)>
    //   95  191:invokestatic    #305 <Method int Math.max(int, int)>
    //   96  194:istore_3        
    //   97  195:iconst_1        
    //   98  196:istore_2        
    //   99  197:goto            101
    //  100  200:aload           9
    //  101  202:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  102  205:iload           10
    //  103  207:icmpeq          101
    //  104  210:aload           9
    //  105  212:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  106  215:aload_0         
    //  107  216:getfield        #207 <Field int mCurItem>
    //  108  219:icmpne          225
    //  109  222:iload           10
    //  110  224:istore_3        
    //  111  225:aload           9
    //  112  227:iload           10
    //  113  229:putfield        #225 <Field int ViewPager$ItemInfo.position>
    //  114  232:iconst_1        
    //  115  233:istore_2        
    //  116  234:goto            101
    //  117  237:iload           4
    //  118  239:ifeq            250
    //  119  242:aload_0         
    //  120  243:getfield        #203 <Field PagerAdapter mAdapter>
    //  121  246:aload_0         
    //  122  247:invokevirtual   #735 <Method void PagerAdapter.finishUpdate(ViewGroup)>
    //  123  250:aload_0         
    //  124  251:getfield        #148 <Field ArrayList mItems>
    //  125  254:getstatic       #130 <Field Comparator COMPARATOR>
    //  126  257:invokestatic    #533 <Method void Collections.sort(java.util.List, Comparator)>
    //  127  260:iload_2         
    //  128  261:ifeq            325
    //  129  264:aload_0         
    //  130  265:invokevirtual   #311 <Method int getChildCount()>
    //  131  268:istore          6
    //  132  270:iconst_0        
    //  133  271:istore          7
    //  134  273:iload           7
    //  135  275:iload           6
    //  136  277:icmpge          314
    //  137  280:aload_0         
    //  138  281:iload           7
    //  139  283:invokevirtual   #315 <Method View getChildAt(int)>
    //  140  286:invokevirtual   #476 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  141  289:checkcast       #478 <Class ViewPager$LayoutParams>
    //  142  292:astore          8
    //  143  294:aload           8
    //  144  296:getfield        #481 <Field boolean ViewPager$LayoutParams.isDecor>
    //  145  299:ifne            308
    //  146  302:aload           8
    //  147  304:fconst_0        
    //  148  305:putfield        #736 <Field float ViewPager$LayoutParams.widthFactor>
    //  149  308:iinc            7  1
    //  150  311:goto            273
    //  151  314:aload_0         
    //  152  315:iload_3         
    //  153  316:iconst_0        
    //  154  317:iconst_1        
    //  155  318:invokevirtual   #740 <Method void setCurrentItemInternal(int, boolean, boolean)>
    //  156  321:aload_0         
    //  157  322:invokevirtual   #743 <Method void requestLayout()>
    //  158  325:return          
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #747 <Method boolean ViewGroup.dispatchKeyEvent(KeyEvent)>
    //    3    5:ifne            16
    //    4    8:aload_0         
    //    5    9:aload_1         
    //    6   10:invokevirtual   #750 <Method boolean executeKeyEvent(KeyEvent)>
    //    7   13:ifeq            18
    //    8   16:iconst_1        
    //    9   17:ireturn         
    //   10   18:iconst_0        
    //   11   19:ireturn         
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #757 <Method int AccessibilityEvent.getEventType()>
    //    2    4:sipush          4096
    //    3    7:icmpne          16
    //    4   10:aload_0         
    //    5   11:aload_1         
    //    6   12:invokespecial   #759 <Method boolean ViewGroup.dispatchPopulateAccessibilityEvent(AccessibilityEvent)>
    //    7   15:ireturn         
    //    8   16:aload_0         
    //    9   17:invokevirtual   #311 <Method int getChildCount()>
    //   10   20:istore_2        
    //   11   21:iconst_0        
    //   12   22:istore_3        
    //   13   23:iload_3         
    //   14   24:iload_2         
    //   15   25:icmpge          85
    //   16   28:aload_0         
    //   17   29:iload_3         
    //   18   30:invokevirtual   #315 <Method View getChildAt(int)>
    //   19   33:astore          4
    //   20   35:aload           4
    //   21   37:invokevirtual   #542 <Method int View.getVisibility()>
    //   22   40:ifne            79
    //   23   43:aload_0         
    //   24   44:aload           4
    //   25   46:invokevirtual   #546 <Method ViewPager$ItemInfo infoForChild(View)>
    //   26   49:astore          5
    //   27   51:aload           5
    //   28   53:ifnull          79
    //   29   56:aload           5
    //   30   58:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   31   61:aload_0         
    //   32   62:getfield        #207 <Field int mCurItem>
    //   33   65:icmpne          79
    //   34   68:aload           4
    //   35   70:aload_1         
    //   36   71:invokevirtual   #760 <Method boolean View.dispatchPopulateAccessibilityEvent(AccessibilityEvent)>
    //   37   74:ifeq            79
    //   38   77:iconst_1        
    //   39   78:ireturn         
    //   40   79:iinc            3  1
    //   41   82:goto            23
    //   42   85:iconst_0        
    //   43   86:ireturn         
    }

    float distanceInfluenceForSnapDuration(float f)
    {
    //    0    0:ldc2w           #762 <Double 0.4712389167638204D>
    //    1    3:fload_1         
    //    2    4:ldc2            #764 <Float 0.5F>
    //    3    7:fsub            
    //    4    8:f2d             
    //    5    9:dmul            
    //    6   10:d2f             
    //    7   11:f2d             
    //    8   12:invokestatic    #768 <Method double Math.sin(double)>
    //    9   15:d2f             
    //   10   16:freturn         
    }

    public void draw(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #772 <Method void ViewGroup.draw(Canvas)>
    //    3    5:aload_0         
    //    4    6:invokestatic    #776 <Method int ViewCompat.getOverScrollMode(View)>
    //    5    9:istore_2        
    //    6   10:iload_2         
    //    7   11:ifeq            37
    //    8   14:iload_2         
    //    9   15:iconst_1        
    //   10   16:icmpne          243
    //   11   19:aload_0         
    //   12   20:getfield        #203 <Field PagerAdapter mAdapter>
    //   13   23:ifnull          243
    //   14   26:aload_0         
    //   15   27:getfield        #203 <Field PagerAdapter mAdapter>
    //   16   30:invokevirtual   #217 <Method int PagerAdapter.getCount()>
    //   17   33:iconst_1        
    //   18   34:icmple          243
    //   19   37:aload_0         
    //   20   38:getfield        #432 <Field EdgeEffectCompat mLeftEdge>
    //   21   41:invokevirtual   #777 <Method boolean EdgeEffectCompat.isFinished()>
    //   22   44:istore_3        
    //   23   45:iconst_0        
    //   24   46:istore          4
    //   25   48:iload_3         
    //   26   49:ifne            137
    //   27   52:aload_1         
    //   28   53:invokevirtual   #782 <Method int Canvas.save()>
    //   29   56:istore          8
    //   30   58:aload_0         
    //   31   59:invokevirtual   #785 <Method int getHeight()>
    //   32   62:aload_0         
    //   33   63:invokevirtual   #788 <Method int getPaddingTop()>
    //   34   66:isub            
    //   35   67:aload_0         
    //   36   68:invokevirtual   #791 <Method int getPaddingBottom()>
    //   37   71:isub            
    //   38   72:istore          9
    //   39   74:aload_0         
    //   40   75:invokevirtual   #390 <Method int getWidth()>
    //   41   78:istore          10
    //   42   80:aload_1         
    //   43   81:ldc2            #792 <Float 270F>
    //   44   84:invokevirtual   #796 <Method void Canvas.rotate(float)>
    //   45   87:aload_1         
    //   46   88:iload           9
    //   47   90:ineg            
    //   48   91:aload_0         
    //   49   92:invokevirtual   #788 <Method int getPaddingTop()>
    //   50   95:iadd            
    //   51   96:i2f             
    //   52   97:aload_0         
    //   53   98:getfield        #167 <Field float mFirstOffset>
    //   54  101:iload           10
    //   55  103:i2f             
    //   56  104:fmul            
    //   57  105:invokevirtual   #800 <Method void Canvas.translate(float, float)>
    //   58  108:aload_0         
    //   59  109:getfield        #432 <Field EdgeEffectCompat mLeftEdge>
    //   60  112:iload           9
    //   61  114:iload           10
    //   62  116:invokevirtual   #803 <Method void EdgeEffectCompat.setSize(int, int)>
    //   63  119:iconst_0        
    //   64  120:aload_0         
    //   65  121:getfield        #432 <Field EdgeEffectCompat mLeftEdge>
    //   66  124:aload_1         
    //   67  125:invokevirtual   #806 <Method boolean EdgeEffectCompat.draw(Canvas)>
    //   68  128:ior             
    //   69  129:istore          4
    //   70  131:aload_1         
    //   71  132:iload           8
    //   72  134:invokevirtual   #809 <Method void Canvas.restoreToCount(int)>
    //   73  137:aload_0         
    //   74  138:getfield        #444 <Field EdgeEffectCompat mRightEdge>
    //   75  141:invokevirtual   #777 <Method boolean EdgeEffectCompat.isFinished()>
    //   76  144:ifne            233
    //   77  147:aload_1         
    //   78  148:invokevirtual   #782 <Method int Canvas.save()>
    //   79  151:istore          5
    //   80  153:aload_0         
    //   81  154:invokevirtual   #390 <Method int getWidth()>
    //   82  157:istore          6
    //   83  159:aload_0         
    //   84  160:invokevirtual   #785 <Method int getHeight()>
    //   85  163:aload_0         
    //   86  164:invokevirtual   #788 <Method int getPaddingTop()>
    //   87  167:isub            
    //   88  168:aload_0         
    //   89  169:invokevirtual   #791 <Method int getPaddingBottom()>
    //   90  172:isub            
    //   91  173:istore          7
    //   92  175:aload_1         
    //   93  176:ldc2            #810 <Float 90F>
    //   94  179:invokevirtual   #796 <Method void Canvas.rotate(float)>
    //   95  182:aload_1         
    //   96  183:aload_0         
    //   97  184:invokevirtual   #788 <Method int getPaddingTop()>
    //   98  187:ineg            
    //   99  188:i2f             
    //  100  189:fconst_1        
    //  101  190:aload_0         
    //  102  191:getfield        #170 <Field float mLastOffset>
    //  103  194:fadd            
    //  104  195:fneg            
    //  105  196:iload           6
    //  106  198:i2f             
    //  107  199:fmul            
    //  108  200:invokevirtual   #800 <Method void Canvas.translate(float, float)>
    //  109  203:aload_0         
    //  110  204:getfield        #444 <Field EdgeEffectCompat mRightEdge>
    //  111  207:iload           7
    //  112  209:iload           6
    //  113  211:invokevirtual   #803 <Method void EdgeEffectCompat.setSize(int, int)>
    //  114  214:iload           4
    //  115  216:aload_0         
    //  116  217:getfield        #444 <Field EdgeEffectCompat mRightEdge>
    //  117  220:aload_1         
    //  118  221:invokevirtual   #806 <Method boolean EdgeEffectCompat.draw(Canvas)>
    //  119  224:ior             
    //  120  225:istore          4
    //  121  227:aload_1         
    //  122  228:iload           5
    //  123  230:invokevirtual   #809 <Method void Canvas.restoreToCount(int)>
    //  124  233:iload           4
    //  125  235:ifeq            242
    //  126  238:aload_0         
    //  127  239:invokestatic    #714 <Method void ViewCompat.postInvalidateOnAnimation(View)>
    //  128  242:return          
    //  129  243:aload_0         
    //  130  244:getfield        #432 <Field EdgeEffectCompat mLeftEdge>
    //  131  247:invokevirtual   #813 <Method void EdgeEffectCompat.finish()>
    //  132  250:aload_0         
    //  133  251:getfield        #444 <Field EdgeEffectCompat mRightEdge>
    //  134  254:invokevirtual   #813 <Method void EdgeEffectCompat.finish()>
    //  135  257:iconst_0        
    //  136  258:istore          4
    //  137  260:goto            233
    }

    protected void drawableStateChanged()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #816 <Method void ViewGroup.drawableStateChanged()>
    //    2    4:aload_0         
    //    3    5:getfield        #818 <Field Drawable mMarginDrawable>
    //    4    8:astore_1        
    //    5    9:aload_1         
    //    6   10:ifnull          29
    //    7   13:aload_1         
    //    8   14:invokevirtual   #823 <Method boolean Drawable.isStateful()>
    //    9   17:ifeq            29
    //   10   20:aload_1         
    //   11   21:aload_0         
    //   12   22:invokevirtual   #826 <Method int[] getDrawableState()>
    //   13   25:invokevirtual   #830 <Method boolean Drawable.setState(int[])>
    //   14   28:pop             
    //   15   29:return          
    }

    public void endFakeDrag()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #670 <Field boolean mFakeDragging>
    //    2    4:ifne            18
    //    3    7:new             #421 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc2            #833 <String "No fake drag in progress. Call beginFakeDrag first.">
    //    6   14:invokespecial   #426 <Method void IllegalStateException(String)>
    //    7   17:athrow          
    //    8   18:aload_0         
    //    9   19:getfield        #326 <Field VelocityTracker mVelocityTracker>
    //   10   22:astore_1        
    //   11   23:aload_1         
    //   12   24:sipush          1000
    //   13   27:aload_0         
    //   14   28:getfield        #835 <Field int mMaximumVelocity>
    //   15   31:i2f             
    //   16   32:invokevirtual   #839 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
    //   17   35:aload_1         
    //   18   36:aload_0         
    //   19   37:getfield        #174 <Field int mActivePointerId>
    //   20   40:invokestatic    #845 <Method float VelocityTrackerCompat.getXVelocity(VelocityTracker, int)>
    //   21   43:f2i             
    //   22   44:istore_2        
    //   23   45:aload_0         
    //   24   46:iconst_1        
    //   25   47:putfield        #272 <Field boolean mPopulatePending>
    //   26   50:aload_0         
    //   27   51:invokespecial   #220 <Method int getClientWidth()>
    //   28   54:istore_3        
    //   29   55:aload_0         
    //   30   56:invokevirtual   #257 <Method int getScrollX()>
    //   31   59:istore          4
    //   32   61:aload_0         
    //   33   62:invokespecial   #428 <Method ViewPager$ItemInfo infoForCurrentScrollPosition()>
    //   34   65:astore          5
    //   35   67:aload_0         
    //   36   68:aload_0         
    //   37   69:aload           5
    //   38   71:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   39   74:iload           4
    //   40   76:i2f             
    //   41   77:iload_3         
    //   42   78:i2f             
    //   43   79:fdiv            
    //   44   80:aload           5
    //   45   82:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //   46   85:fsub            
    //   47   86:aload           5
    //   48   88:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //   49   91:fdiv            
    //   50   92:iload_2         
    //   51   93:aload_0         
    //   52   94:getfield        #408 <Field float mLastMotionX>
    //   53   97:aload_0         
    //   54   98:getfield        #672 <Field float mInitialMotionX>
    //   55  101:fsub            
    //   56  102:f2i             
    //   57  103:invokespecial   #847 <Method int determineTargetPage(int, float, int, int)>
    //   58  106:iconst_1        
    //   59  107:iconst_1        
    //   60  108:iload_2         
    //   61  109:invokevirtual   #850 <Method void setCurrentItemInternal(int, boolean, boolean, int)>
    //   62  112:aload_0         
    //   63  113:invokespecial   #852 <Method void endDrag()>
    //   64  116:aload_0         
    //   65  117:iconst_0        
    //   66  118:putfield        #670 <Field boolean mFakeDragging>
    //   67  121:return          
    }

    public boolean executeKeyEvent(KeyEvent keyevent)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #857 <Method int KeyEvent.getAction()>
    //    2    4:ifne            44
    //    3    7:aload_1         
    //    4    8:invokevirtual   #860 <Method int KeyEvent.getKeyCode()>
    //    5   11:lookupswitch    3: default 44
    //                   21: 46
    //                   22: 53
    //                   61: 60
    //    6   44:iconst_0        
    //    7   45:ireturn         
    //    8   46:aload_0         
    //    9   47:bipush          17
    //   10   49:invokevirtual   #862 <Method boolean arrowScroll(int)>
    //   11   52:ireturn         
    //   12   53:aload_0         
    //   13   54:bipush          66
    //   14   56:invokevirtual   #862 <Method boolean arrowScroll(int)>
    //   15   59:ireturn         
    //   16   60:getstatic       #867 <Field int android.os.Build$VERSION.SDK_INT>
    //   17   63:bipush          11
    //   18   65:icmplt          44
    //   19   68:aload_1         
    //   20   69:invokestatic    #872 <Method boolean KeyEventCompat.hasNoModifiers(KeyEvent)>
    //   21   72:ifeq            81
    //   22   75:aload_0         
    //   23   76:iconst_2        
    //   24   77:invokevirtual   #862 <Method boolean arrowScroll(int)>
    //   25   80:ireturn         
    //   26   81:aload_1         
    //   27   82:iconst_1        
    //   28   83:invokestatic    #876 <Method boolean KeyEventCompat.hasModifiers(KeyEvent, int)>
    //   29   86:ifeq            44
    //   30   89:aload_0         
    //   31   90:iconst_1        
    //   32   91:invokevirtual   #862 <Method boolean arrowScroll(int)>
    //   33   94:ireturn         
    }

    public void fakeDragBy(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #670 <Field boolean mFakeDragging>
    //    2    4:ifne            18
    //    3    7:new             #421 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc2            #833 <String "No fake drag in progress. Call beginFakeDrag first.">
    //    6   14:invokespecial   #426 <Method void IllegalStateException(String)>
    //    7   17:athrow          
    //    8   18:aload_0         
    //    9   19:fload_1         
    //   10   20:aload_0         
    //   11   21:getfield        #408 <Field float mLastMotionX>
    //   12   24:fadd            
    //   13   25:putfield        #408 <Field float mLastMotionX>
    //   14   28:aload_0         
    //   15   29:invokevirtual   #257 <Method int getScrollX()>
    //   16   32:i2f             
    //   17   33:fload_1         
    //   18   34:fsub            
    //   19   35:fstore_2        
    //   20   36:aload_0         
    //   21   37:invokespecial   #220 <Method int getClientWidth()>
    //   22   40:istore_3        
    //   23   41:iload_3         
    //   24   42:i2f             
    //   25   43:aload_0         
    //   26   44:getfield        #167 <Field float mFirstOffset>
    //   27   47:fmul            
    //   28   48:fstore          4
    //   29   50:iload_3         
    //   30   51:i2f             
    //   31   52:aload_0         
    //   32   53:getfield        #170 <Field float mLastOffset>
    //   33   56:fmul            
    //   34   57:fstore          5
    //   35   59:aload_0         
    //   36   60:getfield        #148 <Field ArrayList mItems>
    //   37   63:iconst_0        
    //   38   64:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //   39   67:checkcast       #150 <Class ViewPager$ItemInfo>
    //   40   70:astore          6
    //   41   72:aload_0         
    //   42   73:getfield        #148 <Field ArrayList mItems>
    //   43   76:iconst_m1       
    //   44   77:aload_0         
    //   45   78:getfield        #148 <Field ArrayList mItems>
    //   46   81:invokevirtual   #234 <Method int ArrayList.size()>
    //   47   84:iadd            
    //   48   85:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //   49   88:checkcast       #150 <Class ViewPager$ItemInfo>
    //   50   91:astore          7
    //   51   93:aload           6
    //   52   95:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   53   98:ifeq            111
    //   54  101:aload           6
    //   55  103:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //   56  106:iload_3         
    //   57  107:i2f             
    //   58  108:fmul            
    //   59  109:fstore          4
    //   60  111:aload           7
    //   61  113:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   62  116:iconst_m1       
    //   63  117:aload_0         
    //   64  118:getfield        #203 <Field PagerAdapter mAdapter>
    //   65  121:invokevirtual   #217 <Method int PagerAdapter.getCount()>
    //   66  124:iadd            
    //   67  125:icmpeq          138
    //   68  128:aload           7
    //   69  130:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //   70  133:iload_3         
    //   71  134:i2f             
    //   72  135:fmul            
    //   73  136:fstore          5
    //   74  138:fload_2         
    //   75  139:fload           4
    //   76  141:fcmpg           
    //   77  142:ifge            217
    //   78  145:fload           4
    //   79  147:fstore_2        
    //   80  148:aload_0         
    //   81  149:aload_0         
    //   82  150:getfield        #408 <Field float mLastMotionX>
    //   83  153:fload_2         
    //   84  154:fload_2         
    //   85  155:f2i             
    //   86  156:i2f             
    //   87  157:fsub            
    //   88  158:fadd            
    //   89  159:putfield        #408 <Field float mLastMotionX>
    //   90  162:aload_0         
    //   91  163:fload_2         
    //   92  164:f2i             
    //   93  165:aload_0         
    //   94  166:invokevirtual   #260 <Method int getScrollY()>
    //   95  169:invokevirtual   #270 <Method void scrollTo(int, int)>
    //   96  172:aload_0         
    //   97  173:fload_2         
    //   98  174:f2i             
    //   99  175:invokespecial   #442 <Method boolean pageScrolled(int)>
    //  100  178:pop             
    //  101  179:invokestatic    #682 <Method long SystemClock.uptimeMillis()>
    //  102  182:lstore          9
    //  103  184:aload_0         
    //  104  185:getfield        #693 <Field long mFakeDragBeginTime>
    //  105  188:lload           9
    //  106  190:iconst_2        
    //  107  191:aload_0         
    //  108  192:getfield        #408 <Field float mLastMotionX>
    //  109  195:fconst_0        
    //  110  196:iconst_0        
    //  111  197:invokestatic    #687 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
    //  112  200:astore          11
    //  113  202:aload_0         
    //  114  203:getfield        #326 <Field VelocityTracker mVelocityTracker>
    //  115  206:aload           11
    //  116  208:invokevirtual   #690 <Method void VelocityTracker.addMovement(MotionEvent)>
    //  117  211:aload           11
    //  118  213:invokevirtual   #691 <Method void MotionEvent.recycle()>
    //  119  216:return          
    //  120  217:fload_2         
    //  121  218:fload           5
    //  122  220:fcmpl           
    //  123  221:ifle            148
    //  124  224:fload           5
    //  125  226:fstore_2        
    //  126  227:goto            148
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
    //    0    0:new             #478 <Class ViewPager$LayoutParams>
    //    1    3:dup             
    //    2    4:invokespecial   #879 <Method void ViewPager$LayoutParams()>
    //    3    7:areturn         
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
    //    0    0:new             #478 <Class ViewPager$LayoutParams>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokevirtual   #884 <Method Context getContext()>
    //    4    8:aload_1         
    //    5    9:invokespecial   #885 <Method void ViewPager$LayoutParams(Context, AttributeSet)>
    //    6   12:areturn         
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #887 <Method android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()>
    //    2    4:areturn         
    }

    public PagerAdapter getAdapter()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #203 <Field PagerAdapter mAdapter>
    //    2    4:areturn         
    }

    protected int getChildDrawingOrder(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #520 <Field int mDrawingOrder>
    //    2    4:iconst_2        
    //    3    5:icmpne          35
    //    4    8:iload_1         
    //    5    9:iconst_1        
    //    6   10:isub            
    //    7   11:iload_2         
    //    8   12:isub            
    //    9   13:istore_3        
    //   10   14:aload_0         
    //   11   15:getfield        #522 <Field ArrayList mDrawingOrderedChildren>
    //   12   18:iload_3         
    //   13   19:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //   14   22:checkcast       #339 <Class View>
    //   15   25:invokevirtual   #476 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   16   28:checkcast       #478 <Class ViewPager$LayoutParams>
    //   17   31:getfield        #893 <Field int ViewPager$LayoutParams.childIndex>
    //   18   34:ireturn         
    //   19   35:iload_2         
    //   20   36:istore_3        
    //   21   37:goto            14
    }

    public int getCurrentItem()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #207 <Field int mCurItem>
    //    2    4:ireturn         
    }

    public int getOffscreenPageLimit()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #172 <Field int mOffscreenPageLimit>
    //    2    4:ireturn         
    }

    public int getPageMargin()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #222 <Field int mPageMargin>
    //    2    4:ireturn         
    }

    ItemInfo infoForAnyChild(View view)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #367 <Method ViewParent View.getParent()>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:aload_0         
    //    5    7:if_acmpeq       31
    //    6   10:aload_2         
    //    7   11:ifnull          21
    //    8   14:aload_2         
    //    9   15:instanceof      #339 <Class View>
    //   10   18:ifne            23
    //   11   21:aconst_null     
    //   12   22:areturn         
    //   13   23:aload_2         
    //   14   24:checkcast       #339 <Class View>
    //   15   27:astore_1        
    //   16   28:goto            0
    //   17   31:aload_0         
    //   18   32:aload_1         
    //   19   33:invokevirtual   #546 <Method ViewPager$ItemInfo infoForChild(View)>
    //   20   36:areturn         
    }

    ItemInfo infoForChild(View view)
    {
    //    0    0:iconst_0        
    //    1    1:istore_2        
    //    2    2:iload_2         
    //    3    3:aload_0         
    //    4    4:getfield        #148 <Field ArrayList mItems>
    //    5    7:invokevirtual   #234 <Method int ArrayList.size()>
    //    6   10:icmpge          48
    //    7   13:aload_0         
    //    8   14:getfield        #148 <Field ArrayList mItems>
    //    9   17:iload_2         
    //   10   18:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //   11   21:checkcast       #150 <Class ViewPager$ItemInfo>
    //   12   24:astore_3        
    //   13   25:aload_0         
    //   14   26:getfield        #203 <Field PagerAdapter mAdapter>
    //   15   29:aload_1         
    //   16   30:aload_3         
    //   17   31:getfield        #568 <Field Object ViewPager$ItemInfo.object>
    //   18   34:invokevirtual   #901 <Method boolean PagerAdapter.isViewFromObject(View, Object)>
    //   19   37:ifeq            42
    //   20   40:aload_3         
    //   21   41:areturn         
    //   22   42:iinc            2  1
    //   23   45:goto            2
    //   24   48:aconst_null     
    //   25   49:areturn         
    }

    ItemInfo infoForPosition(int i)
    {
    //    0    0:iconst_0        
    //    1    1:istore_2        
    //    2    2:iload_2         
    //    3    3:aload_0         
    //    4    4:getfield        #148 <Field ArrayList mItems>
    //    5    7:invokevirtual   #234 <Method int ArrayList.size()>
    //    6   10:icmpge          41
    //    7   13:aload_0         
    //    8   14:getfield        #148 <Field ArrayList mItems>
    //    9   17:iload_2         
    //   10   18:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //   11   21:checkcast       #150 <Class ViewPager$ItemInfo>
    //   12   24:astore_3        
    //   13   25:aload_3         
    //   14   26:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   15   29:iload_1         
    //   16   30:icmpne          35
    //   17   33:aload_3         
    //   18   34:areturn         
    //   19   35:iinc            2  1
    //   20   38:goto            2
    //   21   41:aconst_null     
    //   22   42:areturn         
    }

    void initViewPager()
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:invokevirtual   #904 <Method void setWillNotDraw(boolean)>
    //    3    5:aload_0         
    //    4    6:ldc2            #549 <Int 0x40000>
    //    5    9:invokevirtual   #907 <Method void setDescendantFocusability(int)>
    //    6   12:aload_0         
    //    7   13:iconst_1        
    //    8   14:invokevirtual   #910 <Method void setFocusable(boolean)>
    //    9   17:aload_0         
    //   10   18:invokevirtual   #884 <Method Context getContext()>
    //   11   21:astore_1        
    //   12   22:aload_0         
    //   13   23:new             #251 <Class Scroller>
    //   14   26:dup             
    //   15   27:aload_1         
    //   16   28:getstatic       #135 <Field Interpolator sInterpolator>
    //   17   31:invokespecial   #913 <Method void Scroller(Context, Interpolator)>
    //   18   34:putfield        #249 <Field Scroller mScroller>
    //   19   37:aload_1         
    //   20   38:invokestatic    #918 <Method ViewConfiguration ViewConfiguration.get(Context)>
    //   21   41:astore_2        
    //   22   42:aload_1         
    //   23   43:invokevirtual   #924 <Method Resources Context.getResources()>
    //   24   46:invokevirtual   #930 <Method DisplayMetrics Resources.getDisplayMetrics()>
    //   25   49:getfield        #935 <Field float DisplayMetrics.density>
    //   26   52:fstore_3        
    //   27   53:aload_0         
    //   28   54:aload_2         
    //   29   55:invokestatic    #941 <Method int ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration)>
    //   30   58:putfield        #943 <Field int mTouchSlop>
    //   31   61:aload_0         
    //   32   62:ldc2            #944 <Float 400F>
    //   33   65:fload_3         
    //   34   66:fmul            
    //   35   67:f2i             
    //   36   68:putfield        #298 <Field int mMinimumVelocity>
    //   37   71:aload_0         
    //   38   72:aload_2         
    //   39   73:invokevirtual   #947 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
    //   40   76:putfield        #835 <Field int mMaximumVelocity>
    //   41   79:aload_0         
    //   42   80:new             #437 <Class EdgeEffectCompat>
    //   43   83:dup             
    //   44   84:aload_1         
    //   45   85:invokespecial   #948 <Method void EdgeEffectCompat(Context)>
    //   46   88:putfield        #432 <Field EdgeEffectCompat mLeftEdge>
    //   47   91:aload_0         
    //   48   92:new             #437 <Class EdgeEffectCompat>
    //   49   95:dup             
    //   50   96:aload_1         
    //   51   97:invokespecial   #948 <Method void EdgeEffectCompat(Context)>
    //   52  100:putfield        #444 <Field EdgeEffectCompat mRightEdge>
    //   53  103:aload_0         
    //   54  104:ldc2            #949 <Float 25F>
    //   55  107:fload_3         
    //   56  108:fmul            
    //   57  109:f2i             
    //   58  110:putfield        #296 <Field int mFlingDistance>
    //   59  113:aload_0         
    //   60  114:fconst_2        
    //   61  115:fload_3         
    //   62  116:fmul            
    //   63  117:f2i             
    //   64  118:putfield        #951 <Field int mCloseEnough>
    //   65  121:aload_0         
    //   66  122:ldc2            #952 <Float 16F>
    //   67  125:fload_3         
    //   68  126:fmul            
    //   69  127:f2i             
    //   70  128:putfield        #954 <Field int mDefaultGutterSize>
    //   71  131:aload_0         
    //   72  132:new             #956 <Class ViewPager$MyAccessibilityDelegate>
    //   73  135:dup             
    //   74  136:aload_0         
    //   75  137:invokespecial   #957 <Method void ViewPager$MyAccessibilityDelegate(ViewPager)>
    //   76  140:invokestatic    #961 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
    //   77  143:aload_0         
    //   78  144:invokestatic    #964 <Method int ViewCompat.getImportantForAccessibility(View)>
    //   79  147:ifne            155
    //   80  150:aload_0         
    //   81  151:iconst_1        
    //   82  152:invokestatic    #968 <Method void ViewCompat.setImportantForAccessibility(View, int)>
    //   83  155:return          
    }

    public boolean isFakeDragging()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #670 <Field boolean mFakeDragging>
    //    2    4:ireturn         
    }

    protected void onAttachedToWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #972 <Method void ViewGroup.onAttachedToWindow()>
    //    2    4:aload_0         
    //    3    5:iconst_1        
    //    4    6:putfield        #176 <Field boolean mFirstLayout>
    //    5    9:return          
    }

    protected void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #185 <Field Runnable mEndScrollRunnable>
    //    3    5:invokevirtual   #977 <Method boolean removeCallbacks(Runnable)>
    //    4    8:pop             
    //    5    9:aload_0         
    //    6   10:invokespecial   #979 <Method void ViewGroup.onDetachedFromWindow()>
    //    7   13:return          
    }

    protected void onDraw(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #982 <Method void ViewGroup.onDraw(Canvas)>
    //    3    5:aload_0         
    //    4    6:getfield        #222 <Field int mPageMargin>
    //    5    9:ifle            271
    //    6   12:aload_0         
    //    7   13:getfield        #818 <Field Drawable mMarginDrawable>
    //    8   16:ifnull          271
    //    9   19:aload_0         
    //   10   20:getfield        #148 <Field ArrayList mItems>
    //   11   23:invokevirtual   #234 <Method int ArrayList.size()>
    //   12   26:ifle            271
    //   13   29:aload_0         
    //   14   30:getfield        #203 <Field PagerAdapter mAdapter>
    //   15   33:ifnull          271
    //   16   36:aload_0         
    //   17   37:invokevirtual   #257 <Method int getScrollX()>
    //   18   40:istore_2        
    //   19   41:aload_0         
    //   20   42:invokevirtual   #390 <Method int getWidth()>
    //   21   45:istore_3        
    //   22   46:aload_0         
    //   23   47:getfield        #222 <Field int mPageMargin>
    //   24   50:i2f             
    //   25   51:iload_3         
    //   26   52:i2f             
    //   27   53:fdiv            
    //   28   54:fstore          4
    //   29   56:iconst_0        
    //   30   57:istore          5
    //   31   59:aload_0         
    //   32   60:getfield        #148 <Field ArrayList mItems>
    //   33   63:iconst_0        
    //   34   64:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //   35   67:checkcast       #150 <Class ViewPager$ItemInfo>
    //   36   70:astore          6
    //   37   72:aload           6
    //   38   74:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //   39   77:fstore          7
    //   40   79:aload_0         
    //   41   80:getfield        #148 <Field ArrayList mItems>
    //   42   83:invokevirtual   #234 <Method int ArrayList.size()>
    //   43   86:istore          8
    //   44   88:aload           6
    //   45   90:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   46   93:istore          9
    //   47   95:aload_0         
    //   48   96:getfield        #148 <Field ArrayList mItems>
    //   49   99:iload           8
    //   50  101:iconst_1        
    //   51  102:isub            
    //   52  103:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //   53  106:checkcast       #150 <Class ViewPager$ItemInfo>
    //   54  109:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   55  112:istore          10
    //   56  114:iload           9
    //   57  116:istore          11
    //   58  118:iload           11
    //   59  120:iload           10
    //   60  122:icmpge          271
    //   61  125:iload           11
    //   62  127:aload           6
    //   63  129:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   64  132:icmple          166
    //   65  135:iload           5
    //   66  137:iload           8
    //   67  139:icmpge          166
    //   68  142:aload_0         
    //   69  143:getfield        #148 <Field ArrayList mItems>
    //   70  146:astore          14
    //   71  148:iinc            5  1
    //   72  151:aload           14
    //   73  153:iload           5
    //   74  155:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //   75  158:checkcast       #150 <Class ViewPager$ItemInfo>
    //   76  161:astore          6
    //   77  163:goto            125
    //   78  166:iload           11
    //   79  168:aload           6
    //   80  170:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   81  173:icmpne          272
    //   82  176:aload           6
    //   83  178:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //   84  181:aload           6
    //   85  183:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //   86  186:fadd            
    //   87  187:iload_3         
    //   88  188:i2f             
    //   89  189:fmul            
    //   90  190:fstore          13
    //   91  192:fload           4
    //   92  194:aload           6
    //   93  196:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //   94  199:aload           6
    //   95  201:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //   96  204:fadd            
    //   97  205:fadd            
    //   98  206:fstore          7
    //   99  208:fload           13
    //  100  210:aload_0         
    //  101  211:getfield        #222 <Field int mPageMargin>
    //  102  214:i2f             
    //  103  215:fadd            
    //  104  216:iload_2         
    //  105  217:i2f             
    //  106  218:fcmpl           
    //  107  219:ifle            261
    //  108  222:aload_0         
    //  109  223:getfield        #818 <Field Drawable mMarginDrawable>
    //  110  226:fload           13
    //  111  228:f2i             
    //  112  229:aload_0         
    //  113  230:getfield        #984 <Field int mTopPageBounds>
    //  114  233:ldc2            #764 <Float 0.5F>
    //  115  236:fload           13
    //  116  238:aload_0         
    //  117  239:getfield        #222 <Field int mPageMargin>
    //  118  242:i2f             
    //  119  243:fadd            
    //  120  244:fadd            
    //  121  245:f2i             
    //  122  246:aload_0         
    //  123  247:getfield        #986 <Field int mBottomPageBounds>
    //  124  250:invokevirtual   #989 <Method void Drawable.setBounds(int, int, int, int)>
    //  125  253:aload_0         
    //  126  254:getfield        #818 <Field Drawable mMarginDrawable>
    //  127  257:aload_1         
    //  128  258:invokevirtual   #990 <Method void Drawable.draw(Canvas)>
    //  129  261:fload           13
    //  130  263:iload_2         
    //  131  264:iload_3         
    //  132  265:iadd            
    //  133  266:i2f             
    //  134  267:fcmpl           
    //  135  268:ifle            306
    //  136  271:return          
    //  137  272:aload_0         
    //  138  273:getfield        #203 <Field PagerAdapter mAdapter>
    //  139  276:iload           11
    //  140  278:invokevirtual   #242 <Method float PagerAdapter.getPageWidth(int)>
    //  141  281:fstore          12
    //  142  283:fload           7
    //  143  285:fload           12
    //  144  287:fadd            
    //  145  288:iload_3         
    //  146  289:i2f             
    //  147  290:fmul            
    //  148  291:fstore          13
    //  149  293:fload           7
    //  150  295:fload           12
    //  151  297:fload           4
    //  152  299:fadd            
    //  153  300:fadd            
    //  154  301:fstore          7
    //  155  303:goto            208
    //  156  306:iinc            11  1
    //  157  309:goto            118
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
    //    0    0:sipush          255
    //    1    3:aload_1         
    //    2    4:invokevirtual   #993 <Method int MotionEvent.getAction()>
    //    3    7:iand            
    //    4    8:istore_2        
    //    5    9:iload_2         
    //    6   10:iconst_3        
    //    7   11:icmpeq          19
    //    8   14:iload_2         
    //    9   15:iconst_1        
    //   10   16:icmpne          55
    //   11   19:aload_0         
    //   12   20:iconst_0        
    //   13   21:putfield        #322 <Field boolean mIsBeingDragged>
    //   14   24:aload_0         
    //   15   25:iconst_0        
    //   16   26:putfield        #324 <Field boolean mIsUnableToDrag>
    //   17   29:aload_0         
    //   18   30:iconst_m1       
    //   19   31:putfield        #174 <Field int mActivePointerId>
    //   20   34:aload_0         
    //   21   35:getfield        #326 <Field VelocityTracker mVelocityTracker>
    //   22   38:ifnull          53
    //   23   41:aload_0         
    //   24   42:getfield        #326 <Field VelocityTracker mVelocityTracker>
    //   25   45:invokevirtual   #331 <Method void VelocityTracker.recycle()>
    //   26   48:aload_0         
    //   27   49:aconst_null     
    //   28   50:putfield        #326 <Field VelocityTracker mVelocityTracker>
    //   29   53:iconst_0        
    //   30   54:ireturn         
    //   31   55:iload_2         
    //   32   56:ifeq            77
    //   33   59:aload_0         
    //   34   60:getfield        #322 <Field boolean mIsBeingDragged>
    //   35   63:ifeq            68
    //   36   66:iconst_1        
    //   37   67:ireturn         
    //   38   68:aload_0         
    //   39   69:getfield        #324 <Field boolean mIsUnableToDrag>
    //   40   72:ifeq            77
    //   41   75:iconst_0        
    //   42   76:ireturn         
    //   43   77:iload_2         
    //   44   78:lookupswitch    3: default 112
    //                   0: 391
    //                   2: 139
    //                   6: 526
    //   45  112:aload_0         
    //   46  113:getfield        #326 <Field VelocityTracker mVelocityTracker>
    //   47  116:ifnonnull       126
    //   48  119:aload_0         
    //   49  120:invokestatic    #676 <Method VelocityTracker VelocityTracker.obtain()>
    //   50  123:putfield        #326 <Field VelocityTracker mVelocityTracker>
    //   51  126:aload_0         
    //   52  127:getfield        #326 <Field VelocityTracker mVelocityTracker>
    //   53  130:aload_1         
    //   54  131:invokevirtual   #690 <Method void VelocityTracker.addMovement(MotionEvent)>
    //   55  134:aload_0         
    //   56  135:getfield        #322 <Field boolean mIsBeingDragged>
    //   57  138:ireturn         
    //   58  139:aload_0         
    //   59  140:getfield        #174 <Field int mActivePointerId>
    //   60  143:istore          6
    //   61  145:iload           6
    //   62  147:iconst_m1       
    //   63  148:icmpeq          112
    //   64  151:aload_1         
    //   65  152:iload           6
    //   66  154:invokestatic    #996 <Method int MotionEventCompat.findPointerIndex(MotionEvent, int)>
    //   67  157:istore          7
    //   68  159:aload_1         
    //   69  160:iload           7
    //   70  162:invokestatic    #406 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //   71  165:fstore          8
    //   72  167:fload           8
    //   73  169:aload_0         
    //   74  170:getfield        #408 <Field float mLastMotionX>
    //   75  173:fsub            
    //   76  174:fstore          9
    //   77  176:fload           9
    //   78  178:invokestatic    #435 <Method float Math.abs(float)>
    //   79  181:fstore          10
    //   80  183:aload_1         
    //   81  184:iload           7
    //   82  186:invokestatic    #999 <Method float MotionEventCompat.getY(MotionEvent, int)>
    //   83  189:fstore          11
    //   84  191:fload           11
    //   85  193:aload_0         
    //   86  194:getfield        #1001 <Field float mInitialMotionY>
    //   87  197:fsub            
    //   88  198:invokestatic    #435 <Method float Math.abs(float)>
    //   89  201:fstore          12
    //   90  203:fload           9
    //   91  205:fconst_0        
    //   92  206:fcmpl           
    //   93  207:ifeq            260
    //   94  210:aload_0         
    //   95  211:aload_0         
    //   96  212:getfield        #408 <Field float mLastMotionX>
    //   97  215:fload           9
    //   98  217:invokespecial   #1003 <Method boolean isGutterDrag(float, float)>
    //   99  220:ifne            260
    //  100  223:aload_0         
    //  101  224:aload_0         
    //  102  225:iconst_0        
    //  103  226:fload           9
    //  104  228:f2i             
    //  105  229:fload           8
    //  106  231:f2i             
    //  107  232:fload           11
    //  108  234:f2i             
    //  109  235:invokevirtual   #701 <Method boolean canScroll(View, boolean, int, int, int)>
    //  110  238:ifeq            260
    //  111  241:aload_0         
    //  112  242:fload           8
    //  113  244:putfield        #408 <Field float mLastMotionX>
    //  114  247:aload_0         
    //  115  248:fload           11
    //  116  250:putfield        #1005 <Field float mLastMotionY>
    //  117  253:aload_0         
    //  118  254:iconst_1        
    //  119  255:putfield        #324 <Field boolean mIsUnableToDrag>
    //  120  258:iconst_0        
    //  121  259:ireturn         
    //  122  260:fload           10
    //  123  262:aload_0         
    //  124  263:getfield        #943 <Field int mTouchSlop>
    //  125  266:i2f             
    //  126  267:fcmpl           
    //  127  268:ifle            372
    //  128  271:ldc2            #764 <Float 0.5F>
    //  129  274:fload           10
    //  130  276:fmul            
    //  131  277:fload           12
    //  132  279:fcmpl           
    //  133  280:ifle            372
    //  134  283:aload_0         
    //  135  284:iconst_1        
    //  136  285:putfield        #322 <Field boolean mIsBeingDragged>
    //  137  288:aload_0         
    //  138  289:iconst_1        
    //  139  290:invokespecial   #1007 <Method void requestParentDisallowInterceptTouchEvent(boolean)>
    //  140  293:aload_0         
    //  141  294:iconst_1        
    //  142  295:invokespecial   #199 <Method void setScrollState(int)>
    //  143  298:fload           9
    //  144  300:fconst_0        
    //  145  301:fcmpl           
    //  146  302:ifle            357
    //  147  305:aload_0         
    //  148  306:getfield        #672 <Field float mInitialMotionX>
    //  149  309:aload_0         
    //  150  310:getfield        #943 <Field int mTouchSlop>
    //  151  313:i2f             
    //  152  314:fadd            
    //  153  315:fstore          13
    //  154  317:aload_0         
    //  155  318:fload           13
    //  156  320:putfield        #408 <Field float mLastMotionX>
    //  157  323:aload_0         
    //  158  324:fload           11
    //  159  326:putfield        #1005 <Field float mLastMotionY>
    //  160  329:aload_0         
    //  161  330:iconst_1        
    //  162  331:invokespecial   #247 <Method void setScrollingCacheEnabled(boolean)>
    //  163  334:aload_0         
    //  164  335:getfield        #322 <Field boolean mIsBeingDragged>
    //  165  338:ifeq            112
    //  166  341:aload_0         
    //  167  342:fload           8
    //  168  344:invokespecial   #1009 <Method boolean performDrag(float)>
    //  169  347:ifeq            112
    //  170  350:aload_0         
    //  171  351:invokestatic    #714 <Method void ViewCompat.postInvalidateOnAnimation(View)>
    //  172  354:goto            112
    //  173  357:aload_0         
    //  174  358:getfield        #672 <Field float mInitialMotionX>
    //  175  361:aload_0         
    //  176  362:getfield        #943 <Field int mTouchSlop>
    //  177  365:i2f             
    //  178  366:fsub            
    //  179  367:fstore          13
    //  180  369:goto            317
    //  181  372:fload           12
    //  182  374:aload_0         
    //  183  375:getfield        #943 <Field int mTouchSlop>
    //  184  378:i2f             
    //  185  379:fcmpl           
    //  186  380:ifle            334
    //  187  383:aload_0         
    //  188  384:iconst_1        
    //  189  385:putfield        #324 <Field boolean mIsUnableToDrag>
    //  190  388:goto            334
    //  191  391:aload_1         
    //  192  392:invokevirtual   #1012 <Method float MotionEvent.getX()>
    //  193  395:fstore_3        
    //  194  396:aload_0         
    //  195  397:fload_3         
    //  196  398:putfield        #672 <Field float mInitialMotionX>
    //  197  401:aload_0         
    //  198  402:fload_3         
    //  199  403:putfield        #408 <Field float mLastMotionX>
    //  200  406:aload_1         
    //  201  407:invokevirtual   #1014 <Method float MotionEvent.getY()>
    //  202  410:fstore          4
    //  203  412:aload_0         
    //  204  413:fload           4
    //  205  415:putfield        #1001 <Field float mInitialMotionY>
    //  206  418:aload_0         
    //  207  419:fload           4
    //  208  421:putfield        #1005 <Field float mLastMotionY>
    //  209  424:aload_0         
    //  210  425:aload_1         
    //  211  426:iconst_0        
    //  212  427:invokestatic    #402 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  213  430:putfield        #174 <Field int mActivePointerId>
    //  214  433:aload_0         
    //  215  434:iconst_0        
    //  216  435:putfield        #324 <Field boolean mIsUnableToDrag>
    //  217  438:aload_0         
    //  218  439:getfield        #249 <Field Scroller mScroller>
    //  219  442:invokevirtual   #710 <Method boolean Scroller.computeScrollOffset()>
    //  220  445:pop             
    //  221  446:aload_0         
    //  222  447:getfield        #187 <Field int mScrollState>
    //  223  450:iconst_2        
    //  224  451:icmpne          513
    //  225  454:aload_0         
    //  226  455:getfield        #249 <Field Scroller mScroller>
    //  227  458:invokevirtual   #1017 <Method int Scroller.getFinalX()>
    //  228  461:aload_0         
    //  229  462:getfield        #249 <Field Scroller mScroller>
    //  230  465:invokevirtual   #263 <Method int Scroller.getCurrX()>
    //  231  468:isub            
    //  232  469:invokestatic    #294 <Method int Math.abs(int)>
    //  233  472:aload_0         
    //  234  473:getfield        #951 <Field int mCloseEnough>
    //  235  476:icmple          513
    //  236  479:aload_0         
    //  237  480:getfield        #249 <Field Scroller mScroller>
    //  238  483:invokevirtual   #254 <Method void Scroller.abortAnimation()>
    //  239  486:aload_0         
    //  240  487:iconst_0        
    //  241  488:putfield        #272 <Field boolean mPopulatePending>
    //  242  491:aload_0         
    //  243  492:invokevirtual   #1020 <Method void populate()>
    //  244  495:aload_0         
    //  245  496:iconst_1        
    //  246  497:putfield        #322 <Field boolean mIsBeingDragged>
    //  247  500:aload_0         
    //  248  501:iconst_1        
    //  249  502:invokespecial   #1007 <Method void requestParentDisallowInterceptTouchEvent(boolean)>
    //  250  505:aload_0         
    //  251  506:iconst_1        
    //  252  507:invokespecial   #199 <Method void setScrollState(int)>
    //  253  510:goto            112
    //  254  513:aload_0         
    //  255  514:iconst_0        
    //  256  515:invokespecial   #471 <Method void completeScroll(boolean)>
    //  257  518:aload_0         
    //  258  519:iconst_0        
    //  259  520:putfield        #322 <Field boolean mIsBeingDragged>
    //  260  523:goto            112
    //  261  526:aload_0         
    //  262  527:aload_1         
    //  263  528:invokespecial   #1022 <Method void onSecondaryPointerUp(MotionEvent)>
    //  264  531:goto            112
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #311 <Method int getChildCount()>
    //    2    4:istore          6
    //    3    6:iload           4
    //    4    8:iload_2         
    //    5    9:isub            
    //    6   10:istore          7
    //    7   12:iload           5
    //    8   14:iload_3         
    //    9   15:isub            
    //   10   16:istore          8
    //   11   18:aload_0         
    //   12   19:invokevirtual   #378 <Method int getPaddingLeft()>
    //   13   22:istore          9
    //   14   24:aload_0         
    //   15   25:invokevirtual   #788 <Method int getPaddingTop()>
    //   16   28:istore          10
    //   17   30:aload_0         
    //   18   31:invokevirtual   #381 <Method int getPaddingRight()>
    //   19   34:istore          11
    //   20   36:aload_0         
    //   21   37:invokevirtual   #791 <Method int getPaddingBottom()>
    //   22   40:istore          12
    //   23   42:aload_0         
    //   24   43:invokevirtual   #257 <Method int getScrollX()>
    //   25   46:istore          13
    //   26   48:iconst_0        
    //   27   49:istore          14
    //   28   51:iconst_0        
    //   29   52:istore          15
    //   30   54:iload           15
    //   31   56:iload           6
    //   32   58:icmpge          363
    //   33   61:aload_0         
    //   34   62:iload           15
    //   35   64:invokevirtual   #315 <Method View getChildAt(int)>
    //   36   67:astore          23
    //   37   69:aload           23
    //   38   71:invokevirtual   #542 <Method int View.getVisibility()>
    //   39   74:bipush          8
    //   40   76:icmpeq          231
    //   41   79:aload           23
    //   42   81:invokevirtual   #476 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   43   84:checkcast       #478 <Class ViewPager$LayoutParams>
    //   44   87:astore          24
    //   45   89:aload           24
    //   46   91:getfield        #481 <Field boolean ViewPager$LayoutParams.isDecor>
    //   47   94:ifeq            231
    //   48   97:bipush          7
    //   49   99:aload           24
    //   50  101:getfield        #1027 <Field int ViewPager$LayoutParams.gravity>
    //   51  104:iand            
    //   52  105:istore          25
    //   53  107:bipush          112
    //   54  109:aload           24
    //   55  111:getfield        #1027 <Field int ViewPager$LayoutParams.gravity>
    //   56  114:iand            
    //   57  115:istore          26
    //   58  117:iload           25
    //   59  119:tableswitch     1 5: default 152
    //                   1 254
    //                   2 152
    //                   3 237
    //                   4 152
    //                   5 274
    //   60  152:iload           9
    //   61  154:istore          27
    //   62  156:iload           26
    //   63  158:lookupswitch    3: default 192
    //                   16: 317
    //                   48: 300
    //                   80: 337
    //   64  192:iload           10
    //   65  194:istore          28
    //   66  196:iload           27
    //   67  198:iload           13
    //   68  200:iadd            
    //   69  201:istore          29
    //   70  203:aload           23
    //   71  205:iload           29
    //   72  207:iload           28
    //   73  209:iload           29
    //   74  211:aload           23
    //   75  213:invokevirtual   #1028 <Method int View.getMeasuredWidth()>
    //   76  216:iadd            
    //   77  217:iload           28
    //   78  219:aload           23
    //   79  221:invokevirtual   #1031 <Method int View.getMeasuredHeight()>
    //   80  224:iadd            
    //   81  225:invokevirtual   #1034 <Method void View.layout(int, int, int, int)>
    //   82  228:iinc            14  1
    //   83  231:iinc            15  1
    //   84  234:goto            54
    //   85  237:iload           9
    //   86  239:istore          27
    //   87  241:iload           9
    //   88  243:aload           23
    //   89  245:invokevirtual   #1028 <Method int View.getMeasuredWidth()>
    //   90  248:iadd            
    //   91  249:istore          9
    //   92  251:goto            156
    //   93  254:iload           7
    //   94  256:aload           23
    //   95  258:invokevirtual   #1028 <Method int View.getMeasuredWidth()>
    //   96  261:isub            
    //   97  262:iconst_2        
    //   98  263:idiv            
    //   99  264:iload           9
    //  100  266:invokestatic    #305 <Method int Math.max(int, int)>
    //  101  269:istore          27
    //  102  271:goto            156
    //  103  274:iload           7
    //  104  276:iload           11
    //  105  278:isub            
    //  106  279:aload           23
    //  107  281:invokevirtual   #1028 <Method int View.getMeasuredWidth()>
    //  108  284:isub            
    //  109  285:istore          27
    //  110  287:iload           11
    //  111  289:aload           23
    //  112  291:invokevirtual   #1028 <Method int View.getMeasuredWidth()>
    //  113  294:iadd            
    //  114  295:istore          11
    //  115  297:goto            156
    //  116  300:iload           10
    //  117  302:istore          28
    //  118  304:iload           10
    //  119  306:aload           23
    //  120  308:invokevirtual   #1031 <Method int View.getMeasuredHeight()>
    //  121  311:iadd            
    //  122  312:istore          10
    //  123  314:goto            196
    //  124  317:iload           8
    //  125  319:aload           23
    //  126  321:invokevirtual   #1031 <Method int View.getMeasuredHeight()>
    //  127  324:isub            
    //  128  325:iconst_2        
    //  129  326:idiv            
    //  130  327:iload           10
    //  131  329:invokestatic    #305 <Method int Math.max(int, int)>
    //  132  332:istore          28
    //  133  334:goto            196
    //  134  337:iload           8
    //  135  339:iload           12
    //  136  341:isub            
    //  137  342:aload           23
    //  138  344:invokevirtual   #1031 <Method int View.getMeasuredHeight()>
    //  139  347:isub            
    //  140  348:istore          28
    //  141  350:iload           12
    //  142  352:aload           23
    //  143  354:invokevirtual   #1031 <Method int View.getMeasuredHeight()>
    //  144  357:iadd            
    //  145  358:istore          12
    //  146  360:goto            196
    //  147  363:iload           7
    //  148  365:iload           9
    //  149  367:isub            
    //  150  368:iload           11
    //  151  370:isub            
    //  152  371:istore          16
    //  153  373:iconst_0        
    //  154  374:istore          17
    //  155  376:iload           17
    //  156  378:iload           6
    //  157  380:icmpge          531
    //  158  383:aload_0         
    //  159  384:iload           17
    //  160  386:invokevirtual   #315 <Method View getChildAt(int)>
    //  161  389:astore          18
    //  162  391:aload           18
    //  163  393:invokevirtual   #542 <Method int View.getVisibility()>
    //  164  396:bipush          8
    //  165  398:icmpeq          525
    //  166  401:aload           18
    //  167  403:invokevirtual   #476 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  168  406:checkcast       #478 <Class ViewPager$LayoutParams>
    //  169  409:astore          19
    //  170  411:aload           19
    //  171  413:getfield        #481 <Field boolean ViewPager$LayoutParams.isDecor>
    //  172  416:ifne            525
    //  173  419:aload_0         
    //  174  420:aload           18
    //  175  422:invokevirtual   #546 <Method ViewPager$ItemInfo infoForChild(View)>
    //  176  425:astore          20
    //  177  427:aload           20
    //  178  429:ifnull          525
    //  179  432:iload           9
    //  180  434:iload           16
    //  181  436:i2f             
    //  182  437:aload           20
    //  183  439:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //  184  442:fmul            
    //  185  443:f2i             
    //  186  444:iadd            
    //  187  445:istore          21
    //  188  447:iload           10
    //  189  449:istore          22
    //  190  451:aload           19
    //  191  453:getfield        #594 <Field boolean ViewPager$LayoutParams.needsMeasure>
    //  192  456:ifeq            500
    //  193  459:aload           19
    //  194  461:iconst_0        
    //  195  462:putfield        #594 <Field boolean ViewPager$LayoutParams.needsMeasure>
    //  196  465:aload           18
    //  197  467:iload           16
    //  198  469:i2f             
    //  199  470:aload           19
    //  200  472:getfield        #736 <Field float ViewPager$LayoutParams.widthFactor>
    //  201  475:fmul            
    //  202  476:f2i             
    //  203  477:ldc2            #1035 <Int 0x40000000>
    //  204  480:invokestatic    #1040 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  205  483:iload           8
    //  206  485:iload           10
    //  207  487:isub            
    //  208  488:iload           12
    //  209  490:isub            
    //  210  491:ldc2            #1035 <Int 0x40000000>
    //  211  494:invokestatic    #1040 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  212  497:invokevirtual   #1043 <Method void View.measure(int, int)>
    //  213  500:aload           18
    //  214  502:iload           21
    //  215  504:iload           22
    //  216  506:iload           21
    //  217  508:aload           18
    //  218  510:invokevirtual   #1028 <Method int View.getMeasuredWidth()>
    //  219  513:iadd            
    //  220  514:iload           22
    //  221  516:aload           18
    //  222  518:invokevirtual   #1031 <Method int View.getMeasuredHeight()>
    //  223  521:iadd            
    //  224  522:invokevirtual   #1034 <Method void View.layout(int, int, int, int)>
    //  225  525:iinc            17  1
    //  226  528:goto            376
    //  227  531:aload_0         
    //  228  532:iload           10
    //  229  534:putfield        #984 <Field int mTopPageBounds>
    //  230  537:aload_0         
    //  231  538:iload           8
    //  232  540:iload           12
    //  233  542:isub            
    //  234  543:putfield        #986 <Field int mBottomPageBounds>
    //  235  546:aload_0         
    //  236  547:iload           14
    //  237  549:putfield        #1045 <Field int mDecorChildCount>
    //  238  552:aload_0         
    //  239  553:getfield        #176 <Field boolean mFirstLayout>
    //  240  556:ifeq            570
    //  241  559:aload_0         
    //  242  560:aload_0         
    //  243  561:getfield        #207 <Field int mCurItem>
    //  244  564:iconst_0        
    //  245  565:iconst_0        
    //  246  566:iconst_0        
    //  247  567:invokespecial   #1047 <Method void scrollToItem(int, boolean, int, boolean)>
    //  248  570:aload_0         
    //  249  571:iconst_0        
    //  250  572:putfield        #176 <Field boolean mFirstLayout>
    //  251  575:return          
    }

    protected void onMeasure(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:iload_1         
    //    3    3:invokestatic    #1051 <Method int getDefaultSize(int, int)>
    //    4    6:iconst_0        
    //    5    7:iload_2         
    //    6    8:invokestatic    #1051 <Method int getDefaultSize(int, int)>
    //    7   11:invokevirtual   #1054 <Method void setMeasuredDimension(int, int)>
    //    8   14:aload_0         
    //    9   15:invokevirtual   #375 <Method int getMeasuredWidth()>
    //   10   18:istore_3        
    //   11   19:aload_0         
    //   12   20:iload_3         
    //   13   21:bipush          10
    //   14   23:idiv            
    //   15   24:aload_0         
    //   16   25:getfield        #954 <Field int mDefaultGutterSize>
    //   17   28:invokestatic    #302 <Method int Math.min(int, int)>
    //   18   31:putfield        #387 <Field int mGutterSize>
    //   19   34:iload_3         
    //   20   35:aload_0         
    //   21   36:invokevirtual   #378 <Method int getPaddingLeft()>
    //   22   39:isub            
    //   23   40:aload_0         
    //   24   41:invokevirtual   #381 <Method int getPaddingRight()>
    //   25   44:isub            
    //   26   45:istore          4
    //   27   47:aload_0         
    //   28   48:invokevirtual   #1055 <Method int getMeasuredHeight()>
    //   29   51:aload_0         
    //   30   52:invokevirtual   #788 <Method int getPaddingTop()>
    //   31   55:isub            
    //   32   56:aload_0         
    //   33   57:invokevirtual   #791 <Method int getPaddingBottom()>
    //   34   60:isub            
    //   35   61:istore          5
    //   36   63:aload_0         
    //   37   64:invokevirtual   #311 <Method int getChildCount()>
    //   38   67:istore          6
    //   39   69:iconst_0        
    //   40   70:istore          7
    //   41   72:iload           7
    //   42   74:iload           6
    //   43   76:icmpge          345
    //   44   79:aload_0         
    //   45   80:iload           7
    //   46   82:invokevirtual   #315 <Method View getChildAt(int)>
    //   47   85:astore          12
    //   48   87:aload           12
    //   49   89:invokevirtual   #542 <Method int View.getVisibility()>
    //   50   92:bipush          8
    //   51   94:icmpeq          296
    //   52   97:aload           12
    //   53   99:invokevirtual   #476 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   54  102:checkcast       #478 <Class ViewPager$LayoutParams>
    //   55  105:astore          13
    //   56  107:aload           13
    //   57  109:ifnull          296
    //   58  112:aload           13
    //   59  114:getfield        #481 <Field boolean ViewPager$LayoutParams.isDecor>
    //   60  117:ifeq            296
    //   61  120:bipush          7
    //   62  122:aload           13
    //   63  124:getfield        #1027 <Field int ViewPager$LayoutParams.gravity>
    //   64  127:iand            
    //   65  128:istore          14
    //   66  130:bipush          112
    //   67  132:aload           13
    //   68  134:getfield        #1027 <Field int ViewPager$LayoutParams.gravity>
    //   69  137:iand            
    //   70  138:istore          15
    //   71  140:ldc2            #1056 <Int 0x80000000>
    //   72  143:istore          16
    //   73  145:ldc2            #1056 <Int 0x80000000>
    //   74  148:istore          17
    //   75  150:iload           15
    //   76  152:bipush          48
    //   77  154:icmpeq          164
    //   78  157:iload           15
    //   79  159:bipush          80
    //   80  161:icmpne          302
    //   81  164:iconst_1        
    //   82  165:istore          18
    //   83  167:iload           14
    //   84  169:iconst_3        
    //   85  170:icmpeq          179
    //   86  173:iload           14
    //   87  175:iconst_5        
    //   88  176:icmpne          308
    //   89  179:iconst_1        
    //   90  180:istore          19
    //   91  182:iload           18
    //   92  184:ifeq            314
    //   93  187:ldc2            #1035 <Int 0x40000000>
    //   94  190:istore          16
    //   95  192:iload           4
    //   96  194:istore          20
    //   97  196:iload           5
    //   98  198:istore          21
    //   99  200:aload           13
    //  100  202:getfield        #1059 <Field int ViewPager$LayoutParams.width>
    //  101  205:bipush          -2
    //  102  207:icmpeq          231
    //  103  210:ldc2            #1035 <Int 0x40000000>
    //  104  213:istore          16
    //  105  215:aload           13
    //  106  217:getfield        #1059 <Field int ViewPager$LayoutParams.width>
    //  107  220:iconst_m1       
    //  108  221:icmpeq          231
    //  109  224:aload           13
    //  110  226:getfield        #1059 <Field int ViewPager$LayoutParams.width>
    //  111  229:istore          20
    //  112  231:aload           13
    //  113  233:getfield        #1062 <Field int ViewPager$LayoutParams.height>
    //  114  236:bipush          -2
    //  115  238:icmpeq          262
    //  116  241:ldc2            #1035 <Int 0x40000000>
    //  117  244:istore          17
    //  118  246:aload           13
    //  119  248:getfield        #1062 <Field int ViewPager$LayoutParams.height>
    //  120  251:iconst_m1       
    //  121  252:icmpeq          262
    //  122  255:aload           13
    //  123  257:getfield        #1062 <Field int ViewPager$LayoutParams.height>
    //  124  260:istore          21
    //  125  262:aload           12
    //  126  264:iload           20
    //  127  266:iload           16
    //  128  268:invokestatic    #1040 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  129  271:iload           21
    //  130  273:iload           17
    //  131  275:invokestatic    #1040 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  132  278:invokevirtual   #1043 <Method void View.measure(int, int)>
    //  133  281:iload           18
    //  134  283:ifeq            327
    //  135  286:iload           5
    //  136  288:aload           12
    //  137  290:invokevirtual   #1031 <Method int View.getMeasuredHeight()>
    //  138  293:isub            
    //  139  294:istore          5
    //  140  296:iinc            7  1
    //  141  299:goto            72
    //  142  302:iconst_0        
    //  143  303:istore          18
    //  144  305:goto            167
    //  145  308:iconst_0        
    //  146  309:istore          19
    //  147  311:goto            182
    //  148  314:iload           19
    //  149  316:ifeq            192
    //  150  319:ldc2            #1035 <Int 0x40000000>
    //  151  322:istore          17
    //  152  324:goto            192
    //  153  327:iload           19
    //  154  329:ifeq            296
    //  155  332:iload           4
    //  156  334:aload           12
    //  157  336:invokevirtual   #1028 <Method int View.getMeasuredWidth()>
    //  158  339:isub            
    //  159  340:istore          4
    //  160  342:goto            296
    //  161  345:aload_0         
    //  162  346:iload           4
    //  163  348:ldc2            #1035 <Int 0x40000000>
    //  164  351:invokestatic    #1040 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  165  354:putfield        #1064 <Field int mChildWidthMeasureSpec>
    //  166  357:aload_0         
    //  167  358:iload           5
    //  168  360:ldc2            #1035 <Int 0x40000000>
    //  169  363:invokestatic    #1040 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  170  366:putfield        #1066 <Field int mChildHeightMeasureSpec>
    //  171  369:aload_0         
    //  172  370:iconst_1        
    //  173  371:putfield        #589 <Field boolean mInLayout>
    //  174  374:aload_0         
    //  175  375:invokevirtual   #1020 <Method void populate()>
    //  176  378:aload_0         
    //  177  379:iconst_0        
    //  178  380:putfield        #589 <Field boolean mInLayout>
    //  179  383:aload_0         
    //  180  384:invokevirtual   #311 <Method int getChildCount()>
    //  181  387:istore          8
    //  182  389:iconst_0        
    //  183  390:istore          9
    //  184  392:iload           9
    //  185  394:iload           8
    //  186  396:icmpge          471
    //  187  399:aload_0         
    //  188  400:iload           9
    //  189  402:invokevirtual   #315 <Method View getChildAt(int)>
    //  190  405:astore          10
    //  191  407:aload           10
    //  192  409:invokevirtual   #542 <Method int View.getVisibility()>
    //  193  412:bipush          8
    //  194  414:icmpeq          465
    //  195  417:aload           10
    //  196  419:invokevirtual   #476 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  197  422:checkcast       #478 <Class ViewPager$LayoutParams>
    //  198  425:astore          11
    //  199  427:aload           11
    //  200  429:ifnull          440
    //  201  432:aload           11
    //  202  434:getfield        #481 <Field boolean ViewPager$LayoutParams.isDecor>
    //  203  437:ifne            465
    //  204  440:aload           10
    //  205  442:iload           4
    //  206  444:i2f             
    //  207  445:aload           11
    //  208  447:getfield        #736 <Field float ViewPager$LayoutParams.widthFactor>
    //  209  450:fmul            
    //  210  451:f2i             
    //  211  452:ldc2            #1035 <Int 0x40000000>
    //  212  455:invokestatic    #1040 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //  213  458:aload_0         
    //  214  459:getfield        #1066 <Field int mChildHeightMeasureSpec>
    //  215  462:invokevirtual   #1043 <Method void View.measure(int, int)>
    //  216  465:iinc            9  1
    //  217  468:goto            392
    //  218  471:return          
    }

    protected void onPageScrolled(int i, float f, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #1045 <Field int mDecorChildCount>
    //    2    4:ifle            215
    //    3    7:aload_0         
    //    4    8:invokevirtual   #257 <Method int getScrollX()>
    //    5   11:istore          9
    //    6   13:aload_0         
    //    7   14:invokevirtual   #378 <Method int getPaddingLeft()>
    //    8   17:istore          10
    //    9   19:aload_0         
    //   10   20:invokevirtual   #381 <Method int getPaddingRight()>
    //   11   23:istore          11
    //   12   25:aload_0         
    //   13   26:invokevirtual   #390 <Method int getWidth()>
    //   14   29:istore          12
    //   15   31:aload_0         
    //   16   32:invokevirtual   #311 <Method int getChildCount()>
    //   17   35:istore          13
    //   18   37:iconst_0        
    //   19   38:istore          14
    //   20   40:iload           14
    //   21   42:iload           13
    //   22   44:icmpge          215
    //   23   47:aload_0         
    //   24   48:iload           14
    //   25   50:invokevirtual   #315 <Method View getChildAt(int)>
    //   26   53:astore          15
    //   27   55:aload           15
    //   28   57:invokevirtual   #476 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //   29   60:checkcast       #478 <Class ViewPager$LayoutParams>
    //   30   63:astore          16
    //   31   65:aload           16
    //   32   67:getfield        #481 <Field boolean ViewPager$LayoutParams.isDecor>
    //   33   70:ifne            79
    //   34   73:iinc            14  1
    //   35   76:goto            40
    //   36   79:bipush          7
    //   37   81:aload           16
    //   38   83:getfield        #1027 <Field int ViewPager$LayoutParams.gravity>
    //   39   86:iand            
    //   40   87:tableswitch     1 5: default 120
    //                   1 169
    //                   2 120
    //                   3 152
    //                   4 120
    //                   5 189
    //   41  120:iload           10
    //   42  122:istore          17
    //   43  124:iload           17
    //   44  126:iload           9
    //   45  128:iadd            
    //   46  129:aload           15
    //   47  131:invokevirtual   #342 <Method int View.getLeft()>
    //   48  134:isub            
    //   49  135:istore          18
    //   50  137:iload           18
    //   51  139:ifeq            73
    //   52  142:aload           15
    //   53  144:iload           18
    //   54  146:invokevirtual   #1069 <Method void View.offsetLeftAndRight(int)>
    //   55  149:goto            73
    //   56  152:iload           10
    //   57  154:istore          17
    //   58  156:iload           10
    //   59  158:aload           15
    //   60  160:invokevirtual   #1070 <Method int View.getWidth()>
    //   61  163:iadd            
    //   62  164:istore          10
    //   63  166:goto            124
    //   64  169:iload           12
    //   65  171:aload           15
    //   66  173:invokevirtual   #1028 <Method int View.getMeasuredWidth()>
    //   67  176:isub            
    //   68  177:iconst_2        
    //   69  178:idiv            
    //   70  179:iload           10
    //   71  181:invokestatic    #305 <Method int Math.max(int, int)>
    //   72  184:istore          17
    //   73  186:goto            124
    //   74  189:iload           12
    //   75  191:iload           11
    //   76  193:isub            
    //   77  194:aload           15
    //   78  196:invokevirtual   #1028 <Method int View.getMeasuredWidth()>
    //   79  199:isub            
    //   80  200:istore          17
    //   81  202:iload           11
    //   82  204:aload           15
    //   83  206:invokevirtual   #1028 <Method int View.getMeasuredWidth()>
    //   84  209:iadd            
    //   85  210:istore          11
    //   86  212:goto            124
    //   87  215:aload_0         
    //   88  216:getfield        #501 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
    //   89  219:ifnull          234
    //   90  222:aload_0         
    //   91  223:getfield        #501 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
    //   92  226:iload_1         
    //   93  227:fload_2         
    //   94  228:iload_3         
    //   95  229:invokeinterface #1071 <Method void ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
    //   96  234:aload_0         
    //   97  235:getfield        #508 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
    //   98  238:ifnull          253
    //   99  241:aload_0         
    //  100  242:getfield        #508 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
    //  101  245:iload_1         
    //  102  246:fload_2         
    //  103  247:iload_3         
    //  104  248:invokeinterface #1071 <Method void ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
    //  105  253:aload_0         
    //  106  254:getfield        #510 <Field ViewPager$PageTransformer mPageTransformer>
    //  107  257:ifnull          343
    //  108  260:aload_0         
    //  109  261:invokevirtual   #257 <Method int getScrollX()>
    //  110  264:istore          4
    //  111  266:aload_0         
    //  112  267:invokevirtual   #311 <Method int getChildCount()>
    //  113  270:istore          5
    //  114  272:iconst_0        
    //  115  273:istore          6
    //  116  275:iload           6
    //  117  277:iload           5
    //  118  279:icmpge          343
    //  119  282:aload_0         
    //  120  283:iload           6
    //  121  285:invokevirtual   #315 <Method View getChildAt(int)>
    //  122  288:astore          7
    //  123  290:aload           7
    //  124  292:invokevirtual   #476 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  125  295:checkcast       #478 <Class ViewPager$LayoutParams>
    //  126  298:getfield        #481 <Field boolean ViewPager$LayoutParams.isDecor>
    //  127  301:ifeq            310
    //  128  304:iinc            6  1
    //  129  307:goto            275
    //  130  310:aload           7
    //  131  312:invokevirtual   #342 <Method int View.getLeft()>
    //  132  315:iload           4
    //  133  317:isub            
    //  134  318:i2f             
    //  135  319:aload_0         
    //  136  320:invokespecial   #220 <Method int getClientWidth()>
    //  137  323:i2f             
    //  138  324:fdiv            
    //  139  325:fstore          8
    //  140  327:aload_0         
    //  141  328:getfield        #510 <Field ViewPager$PageTransformer mPageTransformer>
    //  142  331:aload           7
    //  143  333:fload           8
    //  144  335:invokeinterface #1077 <Method void ViewPager$PageTransformer.transformPage(View, float)>
    //  145  340:goto            304
    //  146  343:aload_0         
    //  147  344:iconst_1        
    //  148  345:putfield        #415 <Field boolean mCalledSuper>
    //  149  348:return          
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #311 <Method int getChildCount()>
    //    2    4:istore_3        
    //    3    5:iload_1         
    //    4    6:iconst_2        
    //    5    7:iand            
    //    6    8:ifeq            84
    //    7   11:iconst_0        
    //    8   12:istore          4
    //    9   14:iconst_1        
    //   10   15:istore          5
    //   11   17:iload_3         
    //   12   18:istore          6
    //   13   20:iload           4
    //   14   22:istore          7
    //   15   24:iload           7
    //   16   26:iload           6
    //   17   28:icmpeq          108
    //   18   31:aload_0         
    //   19   32:iload           7
    //   20   34:invokevirtual   #315 <Method View getChildAt(int)>
    //   21   37:astore          8
    //   22   39:aload           8
    //   23   41:invokevirtual   #542 <Method int View.getVisibility()>
    //   24   44:ifne            98
    //   25   47:aload_0         
    //   26   48:aload           8
    //   27   50:invokevirtual   #546 <Method ViewPager$ItemInfo infoForChild(View)>
    //   28   53:astore          9
    //   29   55:aload           9
    //   30   57:ifnull          98
    //   31   60:aload           9
    //   32   62:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   33   65:aload_0         
    //   34   66:getfield        #207 <Field int mCurItem>
    //   35   69:icmpne          98
    //   36   72:aload           8
    //   37   74:iload_1         
    //   38   75:aload_2         
    //   39   76:invokevirtual   #1081 <Method boolean View.requestFocus(int, Rect)>
    //   40   79:ifeq            98
    //   41   82:iconst_1        
    //   42   83:ireturn         
    //   43   84:iload_3         
    //   44   85:iconst_1        
    //   45   86:isub            
    //   46   87:istore          4
    //   47   89:iconst_m1       
    //   48   90:istore          5
    //   49   92:iconst_m1       
    //   50   93:istore          6
    //   51   95:goto            20
    //   52   98:iload           7
    //   53  100:iload           5
    //   54  102:iadd            
    //   55  103:istore          7
    //   56  105:goto            24
    //   57  108:iconst_0        
    //   58  109:ireturn         
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
    //    0    0:aload_1         
    //    1    1:instanceof      #1085 <Class ViewPager$SavedState>
    //    2    4:ifne            13
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:invokespecial   #1087 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
    //    6   12:return          
    //    7   13:aload_1         
    //    8   14:checkcast       #1085 <Class ViewPager$SavedState>
    //    9   17:astore_2        
    //   10   18:aload_0         
    //   11   19:aload_2         
    //   12   20:invokevirtual   #1091 <Method Parcelable ViewPager$SavedState.getSuperState()>
    //   13   23:invokespecial   #1087 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
    //   14   26:aload_0         
    //   15   27:getfield        #203 <Field PagerAdapter mAdapter>
    //   16   30:ifnull          59
    //   17   33:aload_0         
    //   18   34:getfield        #203 <Field PagerAdapter mAdapter>
    //   19   37:aload_2         
    //   20   38:getfield        #1094 <Field Parcelable ViewPager$SavedState.adapterState>
    //   21   41:aload_2         
    //   22   42:getfield        #1097 <Field ClassLoader ViewPager$SavedState.loader>
    //   23   45:invokevirtual   #1101 <Method void PagerAdapter.restoreState(Parcelable, ClassLoader)>
    //   24   48:aload_0         
    //   25   49:aload_2         
    //   26   50:getfield        #1102 <Field int ViewPager$SavedState.position>
    //   27   53:iconst_0        
    //   28   54:iconst_1        
    //   29   55:invokevirtual   #740 <Method void setCurrentItemInternal(int, boolean, boolean)>
    //   30   58:return          
    //   31   59:aload_0         
    //   32   60:aload_2         
    //   33   61:getfield        #1102 <Field int ViewPager$SavedState.position>
    //   34   64:putfield        #160 <Field int mRestoredCurItem>
    //   35   67:aload_0         
    //   36   68:aload_2         
    //   37   69:getfield        #1094 <Field Parcelable ViewPager$SavedState.adapterState>
    //   38   72:putfield        #162 <Field Parcelable mRestoredAdapterState>
    //   39   75:aload_0         
    //   40   76:aload_2         
    //   41   77:getfield        #1097 <Field ClassLoader ViewPager$SavedState.loader>
    //   42   80:putfield        #164 <Field ClassLoader mRestoredClassLoader>
    //   43   83:return          
    }

    public Parcelable onSaveInstanceState()
    {
    //    0    0:new             #1085 <Class ViewPager$SavedState>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #1105 <Method Parcelable ViewGroup.onSaveInstanceState()>
    //    4    8:invokespecial   #1107 <Method void ViewPager$SavedState(Parcelable)>
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:aload_0         
    //    8   14:getfield        #207 <Field int mCurItem>
    //    9   17:putfield        #1102 <Field int ViewPager$SavedState.position>
    //   10   20:aload_0         
    //   11   21:getfield        #203 <Field PagerAdapter mAdapter>
    //   12   24:ifnull          38
    //   13   27:aload_1         
    //   14   28:aload_0         
    //   15   29:getfield        #203 <Field PagerAdapter mAdapter>
    //   16   32:invokevirtual   #1110 <Method Parcelable PagerAdapter.saveState()>
    //   17   35:putfield        #1094 <Field Parcelable ViewPager$SavedState.adapterState>
    //   18   38:aload_1         
    //   19   39:areturn         
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:iload_3         
    //    4    4:iload           4
    //    5    6:invokespecial   #1113 <Method void ViewGroup.onSizeChanged(int, int, int, int)>
    //    6    9:iload_1         
    //    7   10:iload_3         
    //    8   11:icmpeq          28
    //    9   14:aload_0         
    //   10   15:iload_1         
    //   11   16:iload_3         
    //   12   17:aload_0         
    //   13   18:getfield        #222 <Field int mPageMargin>
    //   14   21:aload_0         
    //   15   22:getfield        #222 <Field int mPageMargin>
    //   16   25:invokespecial   #1115 <Method void recomputeScrollPosition(int, int, int, int)>
    //   17   28:return          
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #670 <Field boolean mFakeDragging>
    //    2    4:ifeq            9
    //    3    7:iconst_1        
    //    4    8:ireturn         
    //    5    9:aload_1         
    //    6   10:invokevirtual   #993 <Method int MotionEvent.getAction()>
    //    7   13:ifne            25
    //    8   16:aload_1         
    //    9   17:invokevirtual   #1119 <Method int MotionEvent.getEdgeFlags()>
    //   10   20:ifeq            25
    //   11   23:iconst_0        
    //   12   24:ireturn         
    //   13   25:aload_0         
    //   14   26:getfield        #203 <Field PagerAdapter mAdapter>
    //   15   29:ifnull          42
    //   16   32:aload_0         
    //   17   33:getfield        #203 <Field PagerAdapter mAdapter>
    //   18   36:invokevirtual   #217 <Method int PagerAdapter.getCount()>
    //   19   39:ifne            44
    //   20   42:iconst_0        
    //   21   43:ireturn         
    //   22   44:aload_0         
    //   23   45:getfield        #326 <Field VelocityTracker mVelocityTracker>
    //   24   48:ifnonnull       58
    //   25   51:aload_0         
    //   26   52:invokestatic    #676 <Method VelocityTracker VelocityTracker.obtain()>
    //   27   55:putfield        #326 <Field VelocityTracker mVelocityTracker>
    //   28   58:aload_0         
    //   29   59:getfield        #326 <Field VelocityTracker mVelocityTracker>
    //   30   62:aload_1         
    //   31   63:invokevirtual   #690 <Method void VelocityTracker.addMovement(MotionEvent)>
    //   32   66:sipush          255
    //   33   69:aload_1         
    //   34   70:invokevirtual   #993 <Method int MotionEvent.getAction()>
    //   35   73:iand            
    //   36   74:istore_2        
    //   37   75:iconst_0        
    //   38   76:istore_3        
    //   39   77:iload_2         
    //   40   78:tableswitch     0 6: default 120
    //                   0 130
    //                   1 397
    //                   2 196
    //                   3 548
    //                   4 120
    //                   5 600
    //                   6 631
    //   41  120:iload_3         
    //   42  121:ifeq            128
    //   43  124:aload_0         
    //   44  125:invokestatic    #714 <Method void ViewCompat.postInvalidateOnAnimation(View)>
    //   45  128:iconst_1        
    //   46  129:ireturn         
    //   47  130:aload_0         
    //   48  131:getfield        #249 <Field Scroller mScroller>
    //   49  134:invokevirtual   #254 <Method void Scroller.abortAnimation()>
    //   50  137:aload_0         
    //   51  138:iconst_0        
    //   52  139:putfield        #272 <Field boolean mPopulatePending>
    //   53  142:aload_0         
    //   54  143:invokevirtual   #1020 <Method void populate()>
    //   55  146:aload_1         
    //   56  147:invokevirtual   #1012 <Method float MotionEvent.getX()>
    //   57  150:fstore          20
    //   58  152:aload_0         
    //   59  153:fload           20
    //   60  155:putfield        #672 <Field float mInitialMotionX>
    //   61  158:aload_0         
    //   62  159:fload           20
    //   63  161:putfield        #408 <Field float mLastMotionX>
    //   64  164:aload_1         
    //   65  165:invokevirtual   #1014 <Method float MotionEvent.getY()>
    //   66  168:fstore          21
    //   67  170:aload_0         
    //   68  171:fload           21
    //   69  173:putfield        #1001 <Field float mInitialMotionY>
    //   70  176:aload_0         
    //   71  177:fload           21
    //   72  179:putfield        #1005 <Field float mLastMotionY>
    //   73  182:aload_0         
    //   74  183:aload_1         
    //   75  184:iconst_0        
    //   76  185:invokestatic    #402 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //   77  188:putfield        #174 <Field int mActivePointerId>
    //   78  191:iconst_0        
    //   79  192:istore_3        
    //   80  193:goto            120
    //   81  196:aload_0         
    //   82  197:getfield        #322 <Field boolean mIsBeingDragged>
    //   83  200:ifne            347
    //   84  203:aload_1         
    //   85  204:aload_0         
    //   86  205:getfield        #174 <Field int mActivePointerId>
    //   87  208:invokestatic    #996 <Method int MotionEventCompat.findPointerIndex(MotionEvent, int)>
    //   88  211:istore          13
    //   89  213:aload_1         
    //   90  214:iload           13
    //   91  216:invokestatic    #406 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //   92  219:fstore          14
    //   93  221:fload           14
    //   94  223:aload_0         
    //   95  224:getfield        #408 <Field float mLastMotionX>
    //   96  227:fsub            
    //   97  228:invokestatic    #435 <Method float Math.abs(float)>
    //   98  231:fstore          15
    //   99  233:aload_1         
    //  100  234:iload           13
    //  101  236:invokestatic    #999 <Method float MotionEventCompat.getY(MotionEvent, int)>
    //  102  239:fstore          16
    //  103  241:fload           16
    //  104  243:aload_0         
    //  105  244:getfield        #1005 <Field float mLastMotionY>
    //  106  247:fsub            
    //  107  248:invokestatic    #435 <Method float Math.abs(float)>
    //  108  251:fstore          17
    //  109  253:fload           15
    //  110  255:aload_0         
    //  111  256:getfield        #943 <Field int mTouchSlop>
    //  112  259:i2f             
    //  113  260:fcmpl           
    //  114  261:ifle            347
    //  115  264:fload           15
    //  116  266:fload           17
    //  117  268:fcmpl           
    //  118  269:ifle            347
    //  119  272:aload_0         
    //  120  273:iconst_1        
    //  121  274:putfield        #322 <Field boolean mIsBeingDragged>
    //  122  277:aload_0         
    //  123  278:iconst_1        
    //  124  279:invokespecial   #1007 <Method void requestParentDisallowInterceptTouchEvent(boolean)>
    //  125  282:fload           14
    //  126  284:aload_0         
    //  127  285:getfield        #672 <Field float mInitialMotionX>
    //  128  288:fsub            
    //  129  289:fconst_0        
    //  130  290:fcmpl           
    //  131  291:ifle            382
    //  132  294:aload_0         
    //  133  295:getfield        #672 <Field float mInitialMotionX>
    //  134  298:aload_0         
    //  135  299:getfield        #943 <Field int mTouchSlop>
    //  136  302:i2f             
    //  137  303:fadd            
    //  138  304:fstore          18
    //  139  306:aload_0         
    //  140  307:fload           18
    //  141  309:putfield        #408 <Field float mLastMotionX>
    //  142  312:aload_0         
    //  143  313:fload           16
    //  144  315:putfield        #1005 <Field float mLastMotionY>
    //  145  318:aload_0         
    //  146  319:iconst_1        
    //  147  320:invokespecial   #199 <Method void setScrollState(int)>
    //  148  323:aload_0         
    //  149  324:iconst_1        
    //  150  325:invokespecial   #247 <Method void setScrollingCacheEnabled(boolean)>
    //  151  328:aload_0         
    //  152  329:invokevirtual   #486 <Method ViewParent getParent()>
    //  153  332:astore          19
    //  154  334:aload           19
    //  155  336:ifnull          347
    //  156  339:aload           19
    //  157  341:iconst_1        
    //  158  342:invokeinterface #491 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
    //  159  347:aload_0         
    //  160  348:getfield        #322 <Field boolean mIsBeingDragged>
    //  161  351:istore          12
    //  162  353:iconst_0        
    //  163  354:istore_3        
    //  164  355:iload           12
    //  165  357:ifeq            120
    //  166  360:iconst_0        
    //  167  361:aload_0         
    //  168  362:aload_1         
    //  169  363:aload_1         
    //  170  364:aload_0         
    //  171  365:getfield        #174 <Field int mActivePointerId>
    //  172  368:invokestatic    #996 <Method int MotionEventCompat.findPointerIndex(MotionEvent, int)>
    //  173  371:invokestatic    #406 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //  174  374:invokespecial   #1009 <Method boolean performDrag(float)>
    //  175  377:ior             
    //  176  378:istore_3        
    //  177  379:goto            120
    //  178  382:aload_0         
    //  179  383:getfield        #672 <Field float mInitialMotionX>
    //  180  386:aload_0         
    //  181  387:getfield        #943 <Field int mTouchSlop>
    //  182  390:i2f             
    //  183  391:fsub            
    //  184  392:fstore          18
    //  185  394:goto            306
    //  186  397:aload_0         
    //  187  398:getfield        #322 <Field boolean mIsBeingDragged>
    //  188  401:istore          6
    //  189  403:iconst_0        
    //  190  404:istore_3        
    //  191  405:iload           6
    //  192  407:ifeq            120
    //  193  410:aload_0         
    //  194  411:getfield        #326 <Field VelocityTracker mVelocityTracker>
    //  195  414:astore          7
    //  196  416:aload           7
    //  197  418:sipush          1000
    //  198  421:aload_0         
    //  199  422:getfield        #835 <Field int mMaximumVelocity>
    //  200  425:i2f             
    //  201  426:invokevirtual   #839 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
    //  202  429:aload           7
    //  203  431:aload_0         
    //  204  432:getfield        #174 <Field int mActivePointerId>
    //  205  435:invokestatic    #845 <Method float VelocityTrackerCompat.getXVelocity(VelocityTracker, int)>
    //  206  438:f2i             
    //  207  439:istore          8
    //  208  441:aload_0         
    //  209  442:iconst_1        
    //  210  443:putfield        #272 <Field boolean mPopulatePending>
    //  211  446:aload_0         
    //  212  447:invokespecial   #220 <Method int getClientWidth()>
    //  213  450:istore          9
    //  214  452:aload_0         
    //  215  453:invokevirtual   #257 <Method int getScrollX()>
    //  216  456:istore          10
    //  217  458:aload_0         
    //  218  459:invokespecial   #428 <Method ViewPager$ItemInfo infoForCurrentScrollPosition()>
    //  219  462:astore          11
    //  220  464:aload_0         
    //  221  465:aload_0         
    //  222  466:aload           11
    //  223  468:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  224  471:iload           10
    //  225  473:i2f             
    //  226  474:iload           9
    //  227  476:i2f             
    //  228  477:fdiv            
    //  229  478:aload           11
    //  230  480:getfield        #228 <Field float ViewPager$ItemInfo.offset>
    //  231  483:fsub            
    //  232  484:aload           11
    //  233  486:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //  234  489:fdiv            
    //  235  490:iload           8
    //  236  492:aload_1         
    //  237  493:aload_1         
    //  238  494:aload_0         
    //  239  495:getfield        #174 <Field int mActivePointerId>
    //  240  498:invokestatic    #996 <Method int MotionEventCompat.findPointerIndex(MotionEvent, int)>
    //  241  501:invokestatic    #406 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //  242  504:aload_0         
    //  243  505:getfield        #672 <Field float mInitialMotionX>
    //  244  508:fsub            
    //  245  509:f2i             
    //  246  510:invokespecial   #847 <Method int determineTargetPage(int, float, int, int)>
    //  247  513:iconst_1        
    //  248  514:iconst_1        
    //  249  515:iload           8
    //  250  517:invokevirtual   #850 <Method void setCurrentItemInternal(int, boolean, boolean, int)>
    //  251  520:aload_0         
    //  252  521:iconst_m1       
    //  253  522:putfield        #174 <Field int mActivePointerId>
    //  254  525:aload_0         
    //  255  526:invokespecial   #852 <Method void endDrag()>
    //  256  529:aload_0         
    //  257  530:getfield        #432 <Field EdgeEffectCompat mLeftEdge>
    //  258  533:invokevirtual   #1122 <Method boolean EdgeEffectCompat.onRelease()>
    //  259  536:aload_0         
    //  260  537:getfield        #444 <Field EdgeEffectCompat mRightEdge>
    //  261  540:invokevirtual   #1122 <Method boolean EdgeEffectCompat.onRelease()>
    //  262  543:ior             
    //  263  544:istore_3        
    //  264  545:goto            120
    //  265  548:aload_0         
    //  266  549:getfield        #322 <Field boolean mIsBeingDragged>
    //  267  552:istore          5
    //  268  554:iconst_0        
    //  269  555:istore_3        
    //  270  556:iload           5
    //  271  558:ifeq            120
    //  272  561:aload_0         
    //  273  562:aload_0         
    //  274  563:getfield        #207 <Field int mCurItem>
    //  275  566:iconst_1        
    //  276  567:iconst_0        
    //  277  568:iconst_0        
    //  278  569:invokespecial   #1047 <Method void scrollToItem(int, boolean, int, boolean)>
    //  279  572:aload_0         
    //  280  573:iconst_m1       
    //  281  574:putfield        #174 <Field int mActivePointerId>
    //  282  577:aload_0         
    //  283  578:invokespecial   #852 <Method void endDrag()>
    //  284  581:aload_0         
    //  285  582:getfield        #432 <Field EdgeEffectCompat mLeftEdge>
    //  286  585:invokevirtual   #1122 <Method boolean EdgeEffectCompat.onRelease()>
    //  287  588:aload_0         
    //  288  589:getfield        #444 <Field EdgeEffectCompat mRightEdge>
    //  289  592:invokevirtual   #1122 <Method boolean EdgeEffectCompat.onRelease()>
    //  290  595:ior             
    //  291  596:istore_3        
    //  292  597:goto            120
    //  293  600:aload_1         
    //  294  601:invokestatic    #398 <Method int MotionEventCompat.getActionIndex(MotionEvent)>
    //  295  604:istore          4
    //  296  606:aload_0         
    //  297  607:aload_1         
    //  298  608:iload           4
    //  299  610:invokestatic    #406 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //  300  613:putfield        #408 <Field float mLastMotionX>
    //  301  616:aload_0         
    //  302  617:aload_1         
    //  303  618:iload           4
    //  304  620:invokestatic    #402 <Method int MotionEventCompat.getPointerId(MotionEvent, int)>
    //  305  623:putfield        #174 <Field int mActivePointerId>
    //  306  626:iconst_0        
    //  307  627:istore_3        
    //  308  628:goto            120
    //  309  631:aload_0         
    //  310  632:aload_1         
    //  311  633:invokespecial   #1022 <Method void onSecondaryPointerUp(MotionEvent)>
    //  312  636:aload_0         
    //  313  637:aload_1         
    //  314  638:aload_1         
    //  315  639:aload_0         
    //  316  640:getfield        #174 <Field int mActivePointerId>
    //  317  643:invokestatic    #996 <Method int MotionEventCompat.findPointerIndex(MotionEvent, int)>
    //  318  646:invokestatic    #406 <Method float MotionEventCompat.getX(MotionEvent, int)>
    //  319  649:putfield        #408 <Field float mLastMotionX>
    //  320  652:iconst_0        
    //  321  653:istore_3        
    //  322  654:goto            120
    }

    boolean pageLeft()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #207 <Field int mCurItem>
    //    2    4:ifle            20
    //    3    7:aload_0         
    //    4    8:iconst_m1       
    //    5    9:aload_0         
    //    6   10:getfield        #207 <Field int mCurItem>
    //    7   13:iadd            
    //    8   14:iconst_1        
    //    9   15:invokevirtual   #1126 <Method void setCurrentItem(int, boolean)>
    //   10   18:iconst_1        
    //   11   19:ireturn         
    //   12   20:iconst_0        
    //   13   21:ireturn         
    }

    boolean pageRight()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #203 <Field PagerAdapter mAdapter>
    //    2    4:ifnull          36
    //    3    7:aload_0         
    //    4    8:getfield        #207 <Field int mCurItem>
    //    5   11:iconst_m1       
    //    6   12:aload_0         
    //    7   13:getfield        #203 <Field PagerAdapter mAdapter>
    //    8   16:invokevirtual   #217 <Method int PagerAdapter.getCount()>
    //    9   19:iadd            
    //   10   20:icmpge          36
    //   11   23:aload_0         
    //   12   24:iconst_1        
    //   13   25:aload_0         
    //   14   26:getfield        #207 <Field int mCurItem>
    //   15   29:iadd            
    //   16   30:iconst_1        
    //   17   31:invokevirtual   #1126 <Method void setCurrentItem(int, boolean)>
    //   18   34:iconst_1        
    //   19   35:ireturn         
    //   20   36:iconst_0        
    //   21   37:ireturn         
    }

    void populate()
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #207 <Field int mCurItem>
    //    3    5:invokevirtual   #1128 <Method void populate(int)>
    //    4    8:return          
    }

    void populate(int i)
    {
    //    0    0:iconst_2        
    //    1    1:istore_2        
    //    2    2:aload_0         
    //    3    3:getfield        #207 <Field int mCurItem>
    //    4    6:istore_3        
    //    5    7:aconst_null     
    //    6    8:astore          4
    //    7   10:iload_3         
    //    8   11:iload_1         
    //    9   12:icmpeq          41
    //   10   15:aload_0         
    //   11   16:getfield        #207 <Field int mCurItem>
    //   12   19:iload_1         
    //   13   20:icmpge          53
    //   14   23:bipush          66
    //   15   25:istore_2        
    //   16   26:aload_0         
    //   17   27:aload_0         
    //   18   28:getfield        #207 <Field int mCurItem>
    //   19   31:invokevirtual   #462 <Method ViewPager$ItemInfo infoForPosition(int)>
    //   20   34:astore          4
    //   21   36:aload_0         
    //   22   37:iload_1         
    //   23   38:putfield        #207 <Field int mCurItem>
    //   24   41:aload_0         
    //   25   42:getfield        #203 <Field PagerAdapter mAdapter>
    //   26   45:ifnonnull       59
    //   27   48:aload_0         
    //   28   49:invokespecial   #1132 <Method void sortChildDrawingOrder()>
    //   29   52:return          
    //   30   53:bipush          17
    //   31   55:istore_2        
    //   32   56:goto            26
    //   33   59:aload_0         
    //   34   60:getfield        #272 <Field boolean mPopulatePending>
    //   35   63:ifeq            71
    //   36   66:aload_0         
    //   37   67:invokespecial   #1132 <Method void sortChildDrawingOrder()>
    //   38   70:return          
    //   39   71:aload_0         
    //   40   72:invokevirtual   #1136 <Method android.os.IBinder getWindowToken()>
    //   41   75:ifnull          52
    //   42   78:aload_0         
    //   43   79:getfield        #203 <Field PagerAdapter mAdapter>
    //   44   82:aload_0         
    //   45   83:invokevirtual   #728 <Method void PagerAdapter.startUpdate(ViewGroup)>
    //   46   86:aload_0         
    //   47   87:getfield        #172 <Field int mOffscreenPageLimit>
    //   48   90:istore          5
    //   49   92:iconst_0        
    //   50   93:aload_0         
    //   51   94:getfield        #207 <Field int mCurItem>
    //   52   97:iload           5
    //   53   99:isub            
    //   54  100:invokestatic    #305 <Method int Math.max(int, int)>
    //   55  103:istore          6
    //   56  105:aload_0         
    //   57  106:getfield        #203 <Field PagerAdapter mAdapter>
    //   58  109:invokevirtual   #217 <Method int PagerAdapter.getCount()>
    //   59  112:istore          7
    //   60  114:iload           7
    //   61  116:iconst_1        
    //   62  117:isub            
    //   63  118:iload           5
    //   64  120:aload_0         
    //   65  121:getfield        #207 <Field int mCurItem>
    //   66  124:iadd            
    //   67  125:invokestatic    #302 <Method int Math.min(int, int)>
    //   68  128:istore          8
    //   69  130:iload           7
    //   70  132:aload_0         
    //   71  133:getfield        #717 <Field int mExpectedAdapterCount>
    //   72  136:icmpeq          252
    // try 139 152 handler(s) 238
    //   73  139:aload_0         
    //   74  140:invokevirtual   #1137 <Method Resources getResources()>
    //   75  143:aload_0         
    //   76  144:invokevirtual   #1140 <Method int getId()>
    //   77  147:invokevirtual   #1144 <Method String Resources.getResourceName(int)>
    //   78  150:astore          58
    //   79  152:aload           58
    //   80  154:astore          57
    //   81  156:new             #421 <Class IllegalStateException>
    //   82  159:dup             
    //   83  160:new             #630 <Class StringBuilder>
    //   84  163:dup             
    //   85  164:invokespecial   #631 <Method void StringBuilder()>
    //   86  167:ldc2            #1146 <String "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ">
    //   87  170:invokevirtual   #647 <Method StringBuilder StringBuilder.append(String)>
    //   88  173:aload_0         
    //   89  174:getfield        #717 <Field int mExpectedAdapterCount>
    //   90  177:invokevirtual   #1149 <Method StringBuilder StringBuilder.append(int)>
    //   91  180:ldc2            #1151 <String ", found: ">
    //   92  183:invokevirtual   #647 <Method StringBuilder StringBuilder.append(String)>
    //   93  186:iload           7
    //   94  188:invokevirtual   #1149 <Method StringBuilder StringBuilder.append(int)>
    //   95  191:ldc2            #1153 <String " Pager id: ">
    //   96  194:invokevirtual   #647 <Method StringBuilder StringBuilder.append(String)>
    //   97  197:aload           57
    //   98  199:invokevirtual   #647 <Method StringBuilder StringBuilder.append(String)>
    //   99  202:ldc2            #1155 <String " Pager class: ">
    //  100  205:invokevirtual   #647 <Method StringBuilder StringBuilder.append(String)>
    //  101  208:aload_0         
    //  102  209:invokevirtual   #637 <Method Class Object.getClass()>
    //  103  212:invokevirtual   #1158 <Method StringBuilder StringBuilder.append(Object)>
    //  104  215:ldc2            #1160 <String " Problematic adapter: ">
    //  105  218:invokevirtual   #647 <Method StringBuilder StringBuilder.append(String)>
    //  106  221:aload_0         
    //  107  222:getfield        #203 <Field PagerAdapter mAdapter>
    //  108  225:invokevirtual   #637 <Method Class Object.getClass()>
    //  109  228:invokevirtual   #1158 <Method StringBuilder StringBuilder.append(Object)>
    //  110  231:invokevirtual   #655 <Method String StringBuilder.toString()>
    //  111  234:invokespecial   #426 <Method void IllegalStateException(String)>
    //  112  237:athrow          
    // catch android.content.res.Resources.NotFoundException
    //  113  238:astore          56
    //  114  240:aload_0         
    //  115  241:invokevirtual   #1140 <Method int getId()>
    //  116  244:invokestatic    #1165 <Method String Integer.toHexString(int)>
    //  117  247:astore          57
    //  118  249:goto            156
    //  119  252:iconst_0        
    //  120  253:istore          9
    //  121  255:aload_0         
    //  122  256:getfield        #148 <Field ArrayList mItems>
    //  123  259:invokevirtual   #234 <Method int ArrayList.size()>
    //  124  262:istore          10
    //  125  264:aconst_null     
    //  126  265:astore          11
    //  127  267:iload           9
    //  128  269:iload           10
    //  129  271:icmpge          327
    //  130  274:aload_0         
    //  131  275:getfield        #148 <Field ArrayList mItems>
    //  132  278:iload           9
    //  133  280:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //  134  283:checkcast       #150 <Class ViewPager$ItemInfo>
    //  135  286:astore          53
    //  136  288:aload           53
    //  137  290:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  138  293:aload_0         
    //  139  294:getfield        #207 <Field int mCurItem>
    //  140  297:icmplt          672
    //  141  300:aload           53
    //  142  302:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  143  305:istore          54
    //  144  307:aload_0         
    //  145  308:getfield        #207 <Field int mCurItem>
    //  146  311:istore          55
    //  147  313:aconst_null     
    //  148  314:astore          11
    //  149  316:iload           54
    //  150  318:iload           55
    //  151  320:icmpne          327
    //  152  323:aload           53
    //  153  325:astore          11
    //  154  327:aload           11
    //  155  329:ifnonnull       349
    //  156  332:iload           7
    //  157  334:ifle            349
    //  158  337:aload_0         
    //  159  338:aload_0         
    //  160  339:getfield        #207 <Field int mCurItem>
    //  161  342:iload           9
    //  162  344:invokevirtual   #1167 <Method ViewPager$ItemInfo addNewItem(int, int)>
    //  163  347:astore          11
    //  164  349:aload           11
    //  165  351:ifnull          532
    //  166  354:fconst_0        
    //  167  355:fstore          26
    //  168  357:iload           9
    //  169  359:iconst_1        
    //  170  360:isub            
    //  171  361:istore          27
    //  172  363:iload           27
    //  173  365:iflt            678
    //  174  368:aload_0         
    //  175  369:getfield        #148 <Field ArrayList mItems>
    //  176  372:iload           27
    //  177  374:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //  178  377:checkcast       #150 <Class ViewPager$ItemInfo>
    //  179  380:astore          28
    //  180  382:aload_0         
    //  181  383:invokespecial   #220 <Method int getClientWidth()>
    //  182  386:istore          29
    //  183  388:iload           29
    //  184  390:ifgt            684
    //  185  393:fconst_0        
    //  186  394:fstore          30
    //  187  396:iconst_m1       
    //  188  397:aload_0         
    //  189  398:getfield        #207 <Field int mCurItem>
    //  190  401:iadd            
    //  191  402:istore          31
    //  192  404:iload           31
    //  193  406:iflt            429
    //  194  409:fload           26
    //  195  411:fload           30
    //  196  413:fcmpl           
    //  197  414:iflt            798
    //  198  417:iload           31
    //  199  419:iload           6
    //  200  421:icmpge          798
    //  201  424:aload           28
    //  202  426:ifnonnull       706
    //  203  429:aload           11
    //  204  431:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //  205  434:fstore          32
    //  206  436:iload           9
    //  207  438:iconst_1        
    //  208  439:iadd            
    //  209  440:istore          33
    //  210  442:fload           32
    //  211  444:fconst_2        
    //  212  445:fcmpg           
    //  213  446:ifge            522
    //  214  449:aload_0         
    //  215  450:getfield        #148 <Field ArrayList mItems>
    //  216  453:invokevirtual   #234 <Method int ArrayList.size()>
    //  217  456:istore          34
    //  218  458:iload           33
    //  219  460:iload           34
    //  220  462:icmpge          911
    //  221  465:aload_0         
    //  222  466:getfield        #148 <Field ArrayList mItems>
    //  223  469:iload           33
    //  224  471:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //  225  474:checkcast       #150 <Class ViewPager$ItemInfo>
    //  226  477:astore          35
    //  227  479:iload           29
    //  228  481:ifgt            917
    //  229  484:fconst_0        
    //  230  485:fstore          36
    //  231  487:iconst_1        
    //  232  488:aload_0         
    //  233  489:getfield        #207 <Field int mCurItem>
    //  234  492:iadd            
    //  235  493:istore          37
    //  236  495:iload           37
    //  237  497:iload           7
    //  238  499:icmpge          522
    //  239  502:fload           32
    //  240  504:fload           36
    //  241  506:fcmpl           
    //  242  507:iflt            1030
    //  243  510:iload           37
    //  244  512:iload           8
    //  245  514:icmple          1030
    //  246  517:aload           35
    //  247  519:ifnonnull       933
    //  248  522:aload_0         
    //  249  523:aload           11
    //  250  525:iload           9
    //  251  527:aload           4
    //  252  529:invokespecial   #1169 <Method void calculatePageOffsets(ViewPager$ItemInfo, int, ViewPager$ItemInfo)>
    //  253  532:aload_0         
    //  254  533:getfield        #203 <Field PagerAdapter mAdapter>
    //  255  536:astore          12
    //  256  538:aload_0         
    //  257  539:getfield        #207 <Field int mCurItem>
    //  258  542:istore          13
    //  259  544:aload           11
    //  260  546:ifnull          1163
    //  261  549:aload           11
    //  262  551:getfield        #568 <Field Object ViewPager$ItemInfo.object>
    //  263  554:astore          14
    //  264  556:aload           12
    //  265  558:aload_0         
    //  266  559:iload           13
    //  267  561:aload           14
    //  268  563:invokevirtual   #1172 <Method void PagerAdapter.setPrimaryItem(ViewGroup, int, Object)>
    //  269  566:aload_0         
    //  270  567:getfield        #203 <Field PagerAdapter mAdapter>
    //  271  570:aload_0         
    //  272  571:invokevirtual   #735 <Method void PagerAdapter.finishUpdate(ViewGroup)>
    //  273  574:aload_0         
    //  274  575:invokevirtual   #311 <Method int getChildCount()>
    //  275  578:istore          15
    //  276  580:iconst_0        
    //  277  581:istore          16
    //  278  583:iload           16
    //  279  585:iload           15
    //  280  587:icmpge          1169
    //  281  590:aload_0         
    //  282  591:iload           16
    //  283  593:invokevirtual   #315 <Method View getChildAt(int)>
    //  284  596:astore          23
    //  285  598:aload           23
    //  286  600:invokevirtual   #476 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
    //  287  603:checkcast       #478 <Class ViewPager$LayoutParams>
    //  288  606:astore          24
    //  289  608:aload           24
    //  290  610:iload           16
    //  291  612:putfield        #893 <Field int ViewPager$LayoutParams.childIndex>
    //  292  615:aload           24
    //  293  617:getfield        #481 <Field boolean ViewPager$LayoutParams.isDecor>
    //  294  620:ifne            666
    //  295  623:aload           24
    //  296  625:getfield        #736 <Field float ViewPager$LayoutParams.widthFactor>
    //  297  628:fconst_0        
    //  298  629:fcmpl           
    //  299  630:ifne            666
    //  300  633:aload_0         
    //  301  634:aload           23
    //  302  636:invokevirtual   #546 <Method ViewPager$ItemInfo infoForChild(View)>
    //  303  639:astore          25
    //  304  641:aload           25
    //  305  643:ifnull          666
    //  306  646:aload           24
    //  307  648:aload           25
    //  308  650:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //  309  653:putfield        #736 <Field float ViewPager$LayoutParams.widthFactor>
    //  310  656:aload           24
    //  311  658:aload           25
    //  312  660:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  313  663:putfield        #1173 <Field int ViewPager$LayoutParams.position>
    //  314  666:iinc            16  1
    //  315  669:goto            583
    //  316  672:iinc            9  1
    //  317  675:goto            255
    //  318  678:aconst_null     
    //  319  679:astore          28
    //  320  681:goto            382
    //  321  684:fconst_2        
    //  322  685:aload           11
    //  323  687:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //  324  690:fsub            
    //  325  691:aload_0         
    //  326  692:invokevirtual   #378 <Method int getPaddingLeft()>
    //  327  695:i2f             
    //  328  696:iload           29
    //  329  698:i2f             
    //  330  699:fdiv            
    //  331  700:fadd            
    //  332  701:fstore          30
    //  333  703:goto            396
    //  334  706:aload           28
    //  335  708:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  336  711:istore          49
    //  337  713:iload           31
    //  338  715:iload           49
    //  339  717:icmpne          786
    //  340  720:aload           28
    //  341  722:getfield        #275 <Field boolean ViewPager$ItemInfo.scrolling>
    //  342  725:ifne            786
    //  343  728:aload_0         
    //  344  729:getfield        #148 <Field ArrayList mItems>
    //  345  732:iload           27
    //  346  734:invokevirtual   #724 <Method Object ArrayList.remove(int)>
    //  347  737:pop             
    //  348  738:aload_0         
    //  349  739:getfield        #203 <Field PagerAdapter mAdapter>
    //  350  742:astore          51
    //  351  744:aload           28
    //  352  746:getfield        #568 <Field Object ViewPager$ItemInfo.object>
    //  353  749:astore          52
    //  354  751:aload           51
    //  355  753:aload_0         
    //  356  754:iload           31
    //  357  756:aload           52
    //  358  758:invokevirtual   #732 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
    //  359  761:iinc            27  -1
    //  360  764:iinc            9  -1
    //  361  767:iload           27
    //  362  769:iflt            792
    //  363  772:aload_0         
    //  364  773:getfield        #148 <Field ArrayList mItems>
    //  365  776:iload           27
    //  366  778:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //  367  781:checkcast       #150 <Class ViewPager$ItemInfo>
    //  368  784:astore          28
    //  369  786:iinc            31  -1
    //  370  789:goto            404
    //  371  792:aconst_null     
    //  372  793:astore          28
    //  373  795:goto            786
    //  374  798:aload           28
    //  375  800:ifnull          858
    //  376  803:aload           28
    //  377  805:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  378  808:istore          48
    //  379  810:iload           31
    //  380  812:iload           48
    //  381  814:icmpne          858
    //  382  817:fload           26
    //  383  819:aload           28
    //  384  821:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //  385  824:fadd            
    //  386  825:fstore          26
    //  387  827:iinc            27  -1
    //  388  830:iload           27
    //  389  832:iflt            852
    //  390  835:aload_0         
    //  391  836:getfield        #148 <Field ArrayList mItems>
    //  392  839:iload           27
    //  393  841:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //  394  844:checkcast       #150 <Class ViewPager$ItemInfo>
    //  395  847:astore          28
    //  396  849:goto            786
    //  397  852:aconst_null     
    //  398  853:astore          28
    //  399  855:goto            849
    //  400  858:iload           27
    //  401  860:iconst_1        
    //  402  861:iadd            
    //  403  862:istore          47
    //  404  864:fload           26
    //  405  866:aload_0         
    //  406  867:iload           31
    //  407  869:iload           47
    //  408  871:invokevirtual   #1167 <Method ViewPager$ItemInfo addNewItem(int, int)>
    //  409  874:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //  410  877:fadd            
    //  411  878:fstore          26
    //  412  880:iinc            9  1
    //  413  883:iload           27
    //  414  885:iflt            905
    //  415  888:aload_0         
    //  416  889:getfield        #148 <Field ArrayList mItems>
    //  417  892:iload           27
    //  418  894:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //  419  897:checkcast       #150 <Class ViewPager$ItemInfo>
    //  420  900:astore          28
    //  421  902:goto            786
    //  422  905:aconst_null     
    //  423  906:astore          28
    //  424  908:goto            902
    //  425  911:aconst_null     
    //  426  912:astore          35
    //  427  914:goto            479
    //  428  917:fconst_2        
    //  429  918:aload_0         
    //  430  919:invokevirtual   #381 <Method int getPaddingRight()>
    //  431  922:i2f             
    //  432  923:iload           29
    //  433  925:i2f             
    //  434  926:fdiv            
    //  435  927:fadd            
    //  436  928:fstore          36
    //  437  930:goto            487
    //  438  933:aload           35
    //  439  935:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  440  938:istore          42
    //  441  940:iload           37
    //  442  942:iload           42
    //  443  944:icmpne          1018
    //  444  947:aload           35
    //  445  949:getfield        #275 <Field boolean ViewPager$ItemInfo.scrolling>
    //  446  952:ifne            1018
    //  447  955:aload_0         
    //  448  956:getfield        #148 <Field ArrayList mItems>
    //  449  959:iload           33
    //  450  961:invokevirtual   #724 <Method Object ArrayList.remove(int)>
    //  451  964:pop             
    //  452  965:aload_0         
    //  453  966:getfield        #203 <Field PagerAdapter mAdapter>
    //  454  969:astore          44
    //  455  971:aload           35
    //  456  973:getfield        #568 <Field Object ViewPager$ItemInfo.object>
    //  457  976:astore          45
    //  458  978:aload           44
    //  459  980:aload_0         
    //  460  981:iload           37
    //  461  983:aload           45
    //  462  985:invokevirtual   #732 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
    //  463  988:aload_0         
    //  464  989:getfield        #148 <Field ArrayList mItems>
    //  465  992:invokevirtual   #234 <Method int ArrayList.size()>
    //  466  995:istore          46
    //  467  997:iload           33
    //  468  999:iload           46
    //  469 1001:icmpge          1024
    //  470 1004:aload_0         
    //  471 1005:getfield        #148 <Field ArrayList mItems>
    //  472 1008:iload           33
    //  473 1010:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //  474 1013:checkcast       #150 <Class ViewPager$ItemInfo>
    //  475 1016:astore          35
    //  476 1018:iinc            37  1
    //  477 1021:goto            495
    //  478 1024:aconst_null     
    //  479 1025:astore          35
    //  480 1027:goto            1018
    //  481 1030:aload           35
    //  482 1032:ifnull          1101
    //  483 1035:aload           35
    //  484 1037:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  485 1040:istore          40
    //  486 1042:iload           37
    //  487 1044:iload           40
    //  488 1046:icmpne          1101
    //  489 1049:fload           32
    //  490 1051:aload           35
    //  491 1053:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //  492 1056:fadd            
    //  493 1057:fstore          32
    //  494 1059:iinc            33  1
    //  495 1062:aload_0         
    //  496 1063:getfield        #148 <Field ArrayList mItems>
    //  497 1066:invokevirtual   #234 <Method int ArrayList.size()>
    //  498 1069:istore          41
    //  499 1071:iload           33
    //  500 1073:iload           41
    //  501 1075:icmpge          1095
    //  502 1078:aload_0         
    //  503 1079:getfield        #148 <Field ArrayList mItems>
    //  504 1082:iload           33
    //  505 1084:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //  506 1087:checkcast       #150 <Class ViewPager$ItemInfo>
    //  507 1090:astore          35
    //  508 1092:goto            1018
    //  509 1095:aconst_null     
    //  510 1096:astore          35
    //  511 1098:goto            1092
    //  512 1101:aload_0         
    //  513 1102:iload           37
    //  514 1104:iload           33
    //  515 1106:invokevirtual   #1167 <Method ViewPager$ItemInfo addNewItem(int, int)>
    //  516 1109:astore          38
    //  517 1111:iinc            33  1
    //  518 1114:fload           32
    //  519 1116:aload           38
    //  520 1118:getfield        #231 <Field float ViewPager$ItemInfo.widthFactor>
    //  521 1121:fadd            
    //  522 1122:fstore          32
    //  523 1124:aload_0         
    //  524 1125:getfield        #148 <Field ArrayList mItems>
    //  525 1128:invokevirtual   #234 <Method int ArrayList.size()>
    //  526 1131:istore          39
    //  527 1133:iload           33
    //  528 1135:iload           39
    //  529 1137:icmpge          1157
    //  530 1140:aload_0         
    //  531 1141:getfield        #148 <Field ArrayList mItems>
    //  532 1144:iload           33
    //  533 1146:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //  534 1149:checkcast       #150 <Class ViewPager$ItemInfo>
    //  535 1152:astore          35
    //  536 1154:goto            1018
    //  537 1157:aconst_null     
    //  538 1158:astore          35
    //  539 1160:goto            1154
    //  540 1163:aconst_null     
    //  541 1164:astore          14
    //  542 1166:goto            556
    //  543 1169:aload_0         
    //  544 1170:invokespecial   #1132 <Method void sortChildDrawingOrder()>
    //  545 1173:aload_0         
    //  546 1174:invokevirtual   #1176 <Method boolean hasFocus()>
    //  547 1177:ifeq            52
    //  548 1180:aload_0         
    //  549 1181:invokevirtual   #605 <Method View findFocus()>
    //  550 1184:astore          17
    //  551 1186:aload           17
    //  552 1188:ifnull          1280
    //  553 1191:aload_0         
    //  554 1192:aload           17
    //  555 1194:invokevirtual   #1178 <Method ViewPager$ItemInfo infoForAnyChild(View)>
    //  556 1197:astore          18
    //  557 1199:aload           18
    //  558 1201:ifnull          1216
    //  559 1204:aload           18
    //  560 1206:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  561 1209:aload_0         
    //  562 1210:getfield        #207 <Field int mCurItem>
    //  563 1213:icmpeq          52
    //  564 1216:iconst_0        
    //  565 1217:istore          19
    //  566 1219:aload_0         
    //  567 1220:invokevirtual   #311 <Method int getChildCount()>
    //  568 1223:istore          20
    //  569 1225:iload           19
    //  570 1227:iload           20
    //  571 1229:icmpge          52
    //  572 1232:aload_0         
    //  573 1233:iload           19
    //  574 1235:invokevirtual   #315 <Method View getChildAt(int)>
    //  575 1238:astore          21
    //  576 1240:aload_0         
    //  577 1241:aload           21
    //  578 1243:invokevirtual   #546 <Method ViewPager$ItemInfo infoForChild(View)>
    //  579 1246:astore          22
    //  580 1248:aload           22
    //  581 1250:ifnull          1274
    //  582 1253:aload           22
    //  583 1255:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //  584 1258:aload_0         
    //  585 1259:getfield        #207 <Field int mCurItem>
    //  586 1262:icmpne          1274
    //  587 1265:aload           21
    //  588 1267:iload_2         
    //  589 1268:invokevirtual   #1180 <Method boolean View.requestFocus(int)>
    //  590 1271:ifne            52
    //  591 1274:iinc            19  1
    //  592 1277:goto            1219
    //  593 1280:aconst_null     
    //  594 1281:astore          18
    //  595 1283:goto            1199
    }

    public void removeView(View view)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #589 <Field boolean mInLayout>
    //    2    4:ifeq            13
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:invokevirtual   #1184 <Method void removeViewInLayout(View)>
    //    6   12:return          
    //    7   13:aload_0         
    //    8   14:aload_1         
    //    9   15:invokespecial   #1186 <Method void ViewGroup.removeView(View)>
    //   10   18:return          
    }

    public void setAdapter(PagerAdapter pageradapter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #203 <Field PagerAdapter mAdapter>
    //    2    4:ifnull          109
    //    3    7:aload_0         
    //    4    8:getfield        #203 <Field PagerAdapter mAdapter>
    //    5   11:aload_0         
    //    6   12:getfield        #1190 <Field ViewPager$PagerObserver mObserver>
    //    7   15:invokevirtual   #1194 <Method void PagerAdapter.unregisterDataSetObserver(DataSetObserver)>
    //    8   18:aload_0         
    //    9   19:getfield        #203 <Field PagerAdapter mAdapter>
    //   10   22:aload_0         
    //   11   23:invokevirtual   #728 <Method void PagerAdapter.startUpdate(ViewGroup)>
    //   12   26:iconst_0        
    //   13   27:istore          4
    //   14   29:iload           4
    //   15   31:aload_0         
    //   16   32:getfield        #148 <Field ArrayList mItems>
    //   17   35:invokevirtual   #234 <Method int ArrayList.size()>
    //   18   38:icmpge          79
    //   19   41:aload_0         
    //   20   42:getfield        #148 <Field ArrayList mItems>
    //   21   45:iload           4
    //   22   47:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //   23   50:checkcast       #150 <Class ViewPager$ItemInfo>
    //   24   53:astore          5
    //   25   55:aload_0         
    //   26   56:getfield        #203 <Field PagerAdapter mAdapter>
    //   27   59:aload_0         
    //   28   60:aload           5
    //   29   62:getfield        #225 <Field int ViewPager$ItemInfo.position>
    //   30   65:aload           5
    //   31   67:getfield        #568 <Field Object ViewPager$ItemInfo.object>
    //   32   70:invokevirtual   #732 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
    //   33   73:iinc            4  1
    //   34   76:goto            29
    //   35   79:aload_0         
    //   36   80:getfield        #203 <Field PagerAdapter mAdapter>
    //   37   83:aload_0         
    //   38   84:invokevirtual   #735 <Method void PagerAdapter.finishUpdate(ViewGroup)>
    //   39   87:aload_0         
    //   40   88:getfield        #148 <Field ArrayList mItems>
    //   41   91:invokevirtual   #527 <Method void ArrayList.clear()>
    //   42   94:aload_0         
    //   43   95:invokespecial   #1196 <Method void removeNonDecorViews()>
    //   44   98:aload_0         
    //   45   99:iconst_0        
    //   46  100:putfield        #207 <Field int mCurItem>
    //   47  103:aload_0         
    //   48  104:iconst_0        
    //   49  105:iconst_0        
    //   50  106:invokevirtual   #270 <Method void scrollTo(int, int)>
    //   51  109:aload_0         
    //   52  110:getfield        #203 <Field PagerAdapter mAdapter>
    //   53  113:astore_2        
    //   54  114:aload_0         
    //   55  115:aload_1         
    //   56  116:putfield        #203 <Field PagerAdapter mAdapter>
    //   57  119:aload_0         
    //   58  120:iconst_0        
    //   59  121:putfield        #717 <Field int mExpectedAdapterCount>
    //   60  124:aload_0         
    //   61  125:getfield        #203 <Field PagerAdapter mAdapter>
    //   62  128:ifnull          235
    //   63  131:aload_0         
    //   64  132:getfield        #1190 <Field ViewPager$PagerObserver mObserver>
    //   65  135:ifnonnull       151
    //   66  138:aload_0         
    //   67  139:new             #1198 <Class ViewPager$PagerObserver>
    //   68  142:dup             
    //   69  143:aload_0         
    //   70  144:aconst_null     
    //   71  145:invokespecial   #1201 <Method void ViewPager$PagerObserver(ViewPager, ViewPager$1)>
    //   72  148:putfield        #1190 <Field ViewPager$PagerObserver mObserver>
    //   73  151:aload_0         
    //   74  152:getfield        #203 <Field PagerAdapter mAdapter>
    //   75  155:aload_0         
    //   76  156:getfield        #1190 <Field ViewPager$PagerObserver mObserver>
    //   77  159:invokevirtual   #1204 <Method void PagerAdapter.registerDataSetObserver(DataSetObserver)>
    //   78  162:aload_0         
    //   79  163:iconst_0        
    //   80  164:putfield        #272 <Field boolean mPopulatePending>
    //   81  167:aload_0         
    //   82  168:getfield        #176 <Field boolean mFirstLayout>
    //   83  171:istore_3        
    //   84  172:aload_0         
    //   85  173:iconst_1        
    //   86  174:putfield        #176 <Field boolean mFirstLayout>
    //   87  177:aload_0         
    //   88  178:aload_0         
    //   89  179:getfield        #203 <Field PagerAdapter mAdapter>
    //   90  182:invokevirtual   #217 <Method int PagerAdapter.getCount()>
    //   91  185:putfield        #717 <Field int mExpectedAdapterCount>
    //   92  188:aload_0         
    //   93  189:getfield        #160 <Field int mRestoredCurItem>
    //   94  192:iflt            259
    //   95  195:aload_0         
    //   96  196:getfield        #203 <Field PagerAdapter mAdapter>
    //   97  199:aload_0         
    //   98  200:getfield        #162 <Field Parcelable mRestoredAdapterState>
    //   99  203:aload_0         
    //  100  204:getfield        #164 <Field ClassLoader mRestoredClassLoader>
    //  101  207:invokevirtual   #1101 <Method void PagerAdapter.restoreState(Parcelable, ClassLoader)>
    //  102  210:aload_0         
    //  103  211:aload_0         
    //  104  212:getfield        #160 <Field int mRestoredCurItem>
    //  105  215:iconst_0        
    //  106  216:iconst_1        
    //  107  217:invokevirtual   #740 <Method void setCurrentItemInternal(int, boolean, boolean)>
    //  108  220:aload_0         
    //  109  221:iconst_m1       
    //  110  222:putfield        #160 <Field int mRestoredCurItem>
    //  111  225:aload_0         
    //  112  226:aconst_null     
    //  113  227:putfield        #162 <Field Parcelable mRestoredAdapterState>
    //  114  230:aload_0         
    //  115  231:aconst_null     
    //  116  232:putfield        #164 <Field ClassLoader mRestoredClassLoader>
    //  117  235:aload_0         
    //  118  236:getfield        #1206 <Field ViewPager$OnAdapterChangeListener mAdapterChangeListener>
    //  119  239:ifnull          258
    //  120  242:aload_2         
    //  121  243:aload_1         
    //  122  244:if_acmpeq       258
    //  123  247:aload_0         
    //  124  248:getfield        #1206 <Field ViewPager$OnAdapterChangeListener mAdapterChangeListener>
    //  125  251:aload_2         
    //  126  252:aload_1         
    //  127  253:invokeinterface #1212 <Method void ViewPager$OnAdapterChangeListener.onAdapterChanged(PagerAdapter, PagerAdapter)>
    //  128  258:return          
    //  129  259:iload_3         
    //  130  260:ifne            270
    //  131  263:aload_0         
    //  132  264:invokevirtual   #1020 <Method void populate()>
    //  133  267:goto            235
    //  134  270:aload_0         
    //  135  271:invokevirtual   #743 <Method void requestLayout()>
    //  136  274:goto            235
    }

    void setChildrenDrawingOrderEnabledCompat(boolean flag)
    {
    //    0    0:getstatic       #867 <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          7
    //    2    5:icmplt          71
    //    3    8:aload_0         
    //    4    9:getfield        #1219 <Field Method mSetChildrenDrawingOrderEnabled>
    //    5   12:ifnonnull       42
    // try 15 42 handler(s) 72
    //    6   15:iconst_1        
    //    7   16:anewarray       Class[]
    //    8   19:astore          9
    //    9   21:aload           9
    //   10   23:iconst_0        
    //   11   24:getstatic       #1225 <Field Class Boolean.TYPE>
    //   12   27:aastore         
    //   13   28:aload_0         
    //   14   29:ldc1            #4   <Class ViewGroup>
    //   15   31:ldc2            #1227 <String "setChildrenDrawingOrderEnabled">
    //   16   34:aload           9
    //   17   36:invokevirtual   #1231 <Method Method Class.getDeclaredMethod(String, Class[])>
    //   18   39:putfield        #1219 <Field Method mSetChildrenDrawingOrderEnabled>
    // try 42 71 handler(s) 88
    //   19   42:aload_0         
    //   20   43:getfield        #1219 <Field Method mSetChildrenDrawingOrderEnabled>
    //   21   46:astore          4
    //   22   48:iconst_1        
    //   23   49:anewarray       Object[]
    //   24   52:astore          5
    //   25   54:aload           5
    //   26   56:iconst_0        
    //   27   57:iload_1         
    //   28   58:invokestatic    #1235 <Method Boolean Boolean.valueOf(boolean)>
    //   29   61:aastore         
    //   30   62:aload           4
    //   31   64:aload_0         
    //   32   65:aload           5
    //   33   67:invokevirtual   #1241 <Method Object Method.invoke(Object, Object[])>
    //   34   70:pop             
    //   35   71:return          
    // catch NoSuchMethodException
    //   36   72:astore          7
    //   37   74:ldc1            #37  <String "ViewPager">
    //   38   76:ldc2            #1243 <String "Can't find setChildrenDrawingOrderEnabled">
    //   39   79:aload           7
    //   40   81:invokestatic    #1246 <Method int Log.e(String, String, Throwable)>
    //   41   84:pop             
    //   42   85:goto            42
    // catch Exception
    //   43   88:astore_2        
    //   44   89:ldc1            #37  <String "ViewPager">
    //   45   91:ldc2            #1248 <String "Error changing children drawing order">
    //   46   94:aload_2         
    //   47   95:invokestatic    #1246 <Method int Log.e(String, String, Throwable)>
    //   48   98:pop             
    //   49   99:return          
    }

    public void setCurrentItem(int i)
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #272 <Field boolean mPopulatePending>
    //    3    5:aload_0         
    //    4    6:getfield        #176 <Field boolean mFirstLayout>
    //    5    9:ifne            22
    //    6   12:iconst_1        
    //    7   13:istore_2        
    //    8   14:aload_0         
    //    9   15:iload_1         
    //   10   16:iload_2         
    //   11   17:iconst_0        
    //   12   18:invokevirtual   #740 <Method void setCurrentItemInternal(int, boolean, boolean)>
    //   13   21:return          
    //   14   22:iconst_0        
    //   15   23:istore_2        
    //   16   24:goto            14
    }

    public void setCurrentItem(int i, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #272 <Field boolean mPopulatePending>
    //    3    5:aload_0         
    //    4    6:iload_1         
    //    5    7:iload_2         
    //    6    8:iconst_0        
    //    7    9:invokevirtual   #740 <Method void setCurrentItemInternal(int, boolean, boolean)>
    //    8   12:return          
    }

    void setCurrentItemInternal(int i, boolean flag, boolean flag1)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:iload_3         
    //    4    4:iconst_0        
    //    5    5:invokevirtual   #850 <Method void setCurrentItemInternal(int, boolean, boolean, int)>
    //    6    8:return          
    }

    void setCurrentItemInternal(int i, boolean flag, boolean flag1, int j)
    {
    //    0    0:iconst_1        
    //    1    1:istore          5
    //    2    3:aload_0         
    //    3    4:getfield        #203 <Field PagerAdapter mAdapter>
    //    4    7:ifnull          20
    //    5   10:aload_0         
    //    6   11:getfield        #203 <Field PagerAdapter mAdapter>
    //    7   14:invokevirtual   #217 <Method int PagerAdapter.getCount()>
    //    8   17:ifgt            26
    //    9   20:aload_0         
    //   10   21:iconst_0        
    //   11   22:invokespecial   #247 <Method void setScrollingCacheEnabled(boolean)>
    //   12   25:return          
    //   13   26:iload_3         
    //   14   27:ifne            54
    //   15   30:aload_0         
    //   16   31:getfield        #207 <Field int mCurItem>
    //   17   34:iload_1         
    //   18   35:icmpne          54
    //   19   38:aload_0         
    //   20   39:getfield        #148 <Field ArrayList mItems>
    //   21   42:invokevirtual   #234 <Method int ArrayList.size()>
    //   22   45:ifeq            54
    //   23   48:aload_0         
    //   24   49:iconst_0        
    //   25   50:invokespecial   #247 <Method void setScrollingCacheEnabled(boolean)>
    //   26   53:return          
    //   27   54:iload_1         
    //   28   55:ifge            126
    //   29   58:iconst_0        
    //   30   59:istore_1        
    //   31   60:aload_0         
    //   32   61:getfield        #172 <Field int mOffscreenPageLimit>
    //   33   64:istore          6
    //   34   66:iload_1         
    //   35   67:iload           6
    //   36   69:aload_0         
    //   37   70:getfield        #207 <Field int mCurItem>
    //   38   73:iadd            
    //   39   74:icmpgt          88
    //   40   77:iload_1         
    //   41   78:aload_0         
    //   42   79:getfield        #207 <Field int mCurItem>
    //   43   82:iload           6
    //   44   84:isub            
    //   45   85:icmpge          150
    //   46   88:iconst_0        
    //   47   89:istore          7
    //   48   91:iload           7
    //   49   93:aload_0         
    //   50   94:getfield        #148 <Field ArrayList mItems>
    //   51   97:invokevirtual   #234 <Method int ArrayList.size()>
    //   52  100:icmpge          150
    //   53  103:aload_0         
    //   54  104:getfield        #148 <Field ArrayList mItems>
    //   55  107:iload           7
    //   56  109:invokevirtual   #238 <Method Object ArrayList.get(int)>
    //   57  112:checkcast       #150 <Class ViewPager$ItemInfo>
    //   58  115:iload           5
    //   59  117:putfield        #275 <Field boolean ViewPager$ItemInfo.scrolling>
    //   60  120:iinc            7  1
    //   61  123:goto            91
    //   62  126:iload_1         
    //   63  127:aload_0         
    //   64  128:getfield        #203 <Field PagerAdapter mAdapter>
    //   65  131:invokevirtual   #217 <Method int PagerAdapter.getCount()>
    //   66  134:icmplt          60
    //   67  137:iconst_m1       
    //   68  138:aload_0         
    //   69  139:getfield        #203 <Field PagerAdapter mAdapter>
    //   70  142:invokevirtual   #217 <Method int PagerAdapter.getCount()>
    //   71  145:iadd            
    //   72  146:istore_1        
    //   73  147:goto            60
    //   74  150:aload_0         
    //   75  151:getfield        #207 <Field int mCurItem>
    //   76  154:iload_1         
    //   77  155:icmpeq          219
    //   78  158:aload_0         
    //   79  159:getfield        #176 <Field boolean mFirstLayout>
    //   80  162:ifeq            225
    //   81  165:aload_0         
    //   82  166:iload_1         
    //   83  167:putfield        #207 <Field int mCurItem>
    //   84  170:iload           5
    //   85  172:ifeq            192
    //   86  175:aload_0         
    //   87  176:getfield        #501 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
    //   88  179:ifnull          192
    //   89  182:aload_0         
    //   90  183:getfield        #501 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
    //   91  186:iload_1         
    //   92  187:invokeinterface #506 <Method void ViewPager$OnPageChangeListener.onPageSelected(int)>
    //   93  192:iload           5
    //   94  194:ifeq            214
    //   95  197:aload_0         
    //   96  198:getfield        #508 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
    //   97  201:ifnull          214
    //   98  204:aload_0         
    //   99  205:getfield        #508 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
    //  100  208:iload_1         
    //  101  209:invokeinterface #506 <Method void ViewPager$OnPageChangeListener.onPageSelected(int)>
    //  102  214:aload_0         
    //  103  215:invokevirtual   #743 <Method void requestLayout()>
    //  104  218:return          
    //  105  219:iconst_0        
    //  106  220:istore          5
    //  107  222:goto            158
    //  108  225:aload_0         
    //  109  226:iload_1         
    //  110  227:invokevirtual   #1128 <Method void populate(int)>
    //  111  230:aload_0         
    //  112  231:iload_1         
    //  113  232:iload_2         
    //  114  233:iload           4
    //  115  235:iload           5
    //  116  237:invokespecial   #1047 <Method void scrollToItem(int, boolean, int, boolean)>
    //  117  240:return          
    }

    OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onpagechangelistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #508 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
    //    2    4:astore_2        
    //    3    5:aload_0         
    //    4    6:aload_1         
    //    5    7:putfield        #508 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
    //    6   10:aload_2         
    //    7   11:areturn         
    }

    public void setOffscreenPageLimit(int i)
    {
    //    0    0:iload_1         
    //    1    1:iconst_1        
    //    2    2:icmpge          43
    //    3    5:ldc1            #37  <String "ViewPager">
    //    4    7:new             #630 <Class StringBuilder>
    //    5   10:dup             
    //    6   11:invokespecial   #631 <Method void StringBuilder()>
    //    7   14:ldc2            #1253 <String "Requested offscreen page limit ">
    //    8   17:invokevirtual   #647 <Method StringBuilder StringBuilder.append(String)>
    //    9   20:iload_1         
    //   10   21:invokevirtual   #1149 <Method StringBuilder StringBuilder.append(int)>
    //   11   24:ldc2            #1255 <String " too small; defaulting to ">
    //   12   27:invokevirtual   #647 <Method StringBuilder StringBuilder.append(String)>
    //   13   30:iconst_1        
    //   14   31:invokevirtual   #1149 <Method StringBuilder StringBuilder.append(int)>
    //   15   34:invokevirtual   #655 <Method String StringBuilder.toString()>
    //   16   37:invokestatic    #1258 <Method int Log.w(String, String)>
    //   17   40:pop             
    //   18   41:iconst_1        
    //   19   42:istore_1        
    //   20   43:iload_1         
    //   21   44:aload_0         
    //   22   45:getfield        #172 <Field int mOffscreenPageLimit>
    //   23   48:icmpeq          60
    //   24   51:aload_0         
    //   25   52:iload_1         
    //   26   53:putfield        #172 <Field int mOffscreenPageLimit>
    //   27   56:aload_0         
    //   28   57:invokevirtual   #1020 <Method void populate()>
    //   29   60:return          
    }

    void setOnAdapterChangeListener(OnAdapterChangeListener onadapterchangelistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #1206 <Field ViewPager$OnAdapterChangeListener mAdapterChangeListener>
    //    3    5:return          
    }

    public void setOnPageChangeListener(OnPageChangeListener onpagechangelistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #501 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
    //    3    5:return          
    }

    public void setPageMargin(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #222 <Field int mPageMargin>
    //    2    4:istore_2        
    //    3    5:aload_0         
    //    4    6:iload_1         
    //    5    7:putfield        #222 <Field int mPageMargin>
    //    6   10:aload_0         
    //    7   11:invokevirtual   #390 <Method int getWidth()>
    //    8   14:istore_3        
    //    9   15:aload_0         
    //   10   16:iload_3         
    //   11   17:iload_3         
    //   12   18:iload_1         
    //   13   19:iload_2         
    //   14   20:invokespecial   #1115 <Method void recomputeScrollPosition(int, int, int, int)>
    //   15   23:aload_0         
    //   16   24:invokevirtual   #743 <Method void requestLayout()>
    //   17   27:return          
    }

    public void setPageMarginDrawable(int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokevirtual   #884 <Method Context getContext()>
    //    3    5:invokevirtual   #924 <Method Resources Context.getResources()>
    //    4    8:iload_1         
    //    5    9:invokevirtual   #1268 <Method Drawable Resources.getDrawable(int)>
    //    6   12:invokevirtual   #1271 <Method void setPageMarginDrawable(Drawable)>
    //    7   15:return          
    }

    public void setPageMarginDrawable(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #818 <Field Drawable mMarginDrawable>
    //    3    5:aload_1         
    //    4    6:ifnull          13
    //    5    9:aload_0         
    //    6   10:invokevirtual   #1274 <Method void refreshDrawableState()>
    //    7   13:aload_1         
    //    8   14:ifnonnull       29
    //    9   17:iconst_1        
    //   10   18:istore_2        
    //   11   19:aload_0         
    //   12   20:iload_2         
    //   13   21:invokevirtual   #904 <Method void setWillNotDraw(boolean)>
    //   14   24:aload_0         
    //   15   25:invokevirtual   #1277 <Method void invalidate()>
    //   16   28:return          
    //   17   29:iconst_0        
    //   18   30:istore_2        
    //   19   31:goto            19
    }

    public void setPageTransformer(boolean flag, PageTransformer pagetransformer)
    {
    //    0    0:iconst_1        
    //    1    1:istore_3        
    //    2    2:getstatic       #867 <Field int android.os.Build$VERSION.SDK_INT>
    //    3    5:bipush          11
    //    4    7:icmplt          73
    //    5   10:aload_2         
    //    6   11:ifnull          74
    //    7   14:iload_3         
    //    8   15:istore          4
    //    9   17:aload_0         
    //   10   18:getfield        #510 <Field ViewPager$PageTransformer mPageTransformer>
    //   11   21:ifnull          80
    //   12   24:iload_3         
    //   13   25:istore          5
    //   14   27:iload           4
    //   15   29:iload           5
    //   16   31:icmpeq          86
    //   17   34:iload_3         
    //   18   35:istore          6
    //   19   37:aload_0         
    //   20   38:aload_2         
    //   21   39:putfield        #510 <Field ViewPager$PageTransformer mPageTransformer>
    //   22   42:aload_0         
    //   23   43:iload           4
    //   24   45:invokevirtual   #1281 <Method void setChildrenDrawingOrderEnabledCompat(boolean)>
    //   25   48:iload           4
    //   26   50:ifeq            92
    //   27   53:iload_1         
    //   28   54:ifeq            59
    //   29   57:iconst_2        
    //   30   58:istore_3        
    //   31   59:aload_0         
    //   32   60:iload_3         
    //   33   61:putfield        #520 <Field int mDrawingOrder>
    //   34   64:iload           6
    //   35   66:ifeq            73
    //   36   69:aload_0         
    //   37   70:invokevirtual   #1020 <Method void populate()>
    //   38   73:return          
    //   39   74:iconst_0        
    //   40   75:istore          4
    //   41   77:goto            17
    //   42   80:iconst_0        
    //   43   81:istore          5
    //   44   83:goto            27
    //   45   86:iconst_0        
    //   46   87:istore          6
    //   47   89:goto            37
    //   48   92:aload_0         
    //   49   93:iconst_0        
    //   50   94:putfield        #520 <Field int mDrawingOrder>
    //   51   97:goto            64
    }

    void smoothScrollTo(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:iconst_0        
    //    4    4:invokevirtual   #499 <Method void smoothScrollTo(int, int, int)>
    //    5    7:return          
    }

    void smoothScrollTo(int i, int j, int k)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #311 <Method int getChildCount()>
    //    2    4:ifne            13
    //    3    7:aload_0         
    //    4    8:iconst_0        
    //    5    9:invokespecial   #247 <Method void setScrollingCacheEnabled(boolean)>
    //    6   12:return          
    //    7   13:aload_0         
    //    8   14:invokevirtual   #257 <Method int getScrollX()>
    //    9   17:istore          4
    //   10   19:aload_0         
    //   11   20:invokevirtual   #260 <Method int getScrollY()>
    //   12   23:istore          5
    //   13   25:iload_1         
    //   14   26:iload           4
    //   15   28:isub            
    //   16   29:istore          6
    //   17   31:iload_2         
    //   18   32:iload           5
    //   19   34:isub            
    //   20   35:istore          7
    //   21   37:iload           6
    //   22   39:ifne            62
    //   23   42:iload           7
    //   24   44:ifne            62
    //   25   47:aload_0         
    //   26   48:iconst_0        
    //   27   49:invokespecial   #471 <Method void completeScroll(boolean)>
    //   28   52:aload_0         
    //   29   53:invokevirtual   #1020 <Method void populate()>
    //   30   56:aload_0         
    //   31   57:iconst_0        
    //   32   58:invokespecial   #199 <Method void setScrollState(int)>
    //   33   61:return          
    //   34   62:aload_0         
    //   35   63:iconst_1        
    //   36   64:invokespecial   #247 <Method void setScrollingCacheEnabled(boolean)>
    //   37   67:aload_0         
    //   38   68:iconst_2        
    //   39   69:invokespecial   #199 <Method void setScrollState(int)>
    //   40   72:aload_0         
    //   41   73:invokespecial   #220 <Method int getClientWidth()>
    //   42   76:istore          8
    //   43   78:iload           8
    //   44   80:iconst_2        
    //   45   81:idiv            
    //   46   82:istore          9
    //   47   84:fconst_1        
    //   48   85:fconst_1        
    //   49   86:iload           6
    //   50   88:invokestatic    #294 <Method int Math.abs(int)>
    //   51   91:i2f             
    //   52   92:fmul            
    //   53   93:iload           8
    //   54   95:i2f             
    //   55   96:fdiv            
    //   56   97:invokestatic    #469 <Method float Math.min(float, float)>
    //   57  100:fstore          10
    //   58  102:iload           9
    //   59  104:i2f             
    //   60  105:iload           9
    //   61  107:i2f             
    //   62  108:aload_0         
    //   63  109:fload           10
    //   64  111:invokevirtual   #1283 <Method float distanceInfluenceForSnapDuration(float)>
    //   65  114:fmul            
    //   66  115:fadd            
    //   67  116:fstore          11
    //   68  118:iload_3         
    //   69  119:invokestatic    #294 <Method int Math.abs(int)>
    //   70  122:istore          12
    //   71  124:iload           12
    //   72  126:ifle            181
    //   73  129:iconst_4        
    //   74  130:ldc2            #1284 <Float 1000F>
    //   75  133:fload           11
    //   76  135:iload           12
    //   77  137:i2f             
    //   78  138:fdiv            
    //   79  139:invokestatic    #435 <Method float Math.abs(float)>
    //   80  142:fmul            
    //   81  143:invokestatic    #1288 <Method int Math.round(float)>
    //   82  146:imul            
    //   83  147:istore          14
    //   84  149:iload           14
    //   85  151:sipush          600
    //   86  154:invokestatic    #302 <Method int Math.min(int, int)>
    //   87  157:istore          15
    //   88  159:aload_0         
    //   89  160:getfield        #249 <Field Scroller mScroller>
    //   90  163:iload           4
    //   91  165:iload           5
    //   92  167:iload           6
    //   93  169:iload           7
    //   94  171:iload           15
    //   95  173:invokevirtual   #466 <Method void Scroller.startScroll(int, int, int, int, int)>
    //   96  176:aload_0         
    //   97  177:invokestatic    #714 <Method void ViewCompat.postInvalidateOnAnimation(View)>
    //   98  180:return          
    //   99  181:iload           8
    //  100  183:i2f             
    //  101  184:aload_0         
    //  102  185:getfield        #203 <Field PagerAdapter mAdapter>
    //  103  188:aload_0         
    //  104  189:getfield        #207 <Field int mCurItem>
    //  105  192:invokevirtual   #242 <Method float PagerAdapter.getPageWidth(int)>
    //  106  195:fmul            
    //  107  196:fstore          13
    //  108  198:ldc2            #1289 <Float 100F>
    //  109  201:fconst_1        
    //  110  202:iload           6
    //  111  204:invokestatic    #294 <Method int Math.abs(int)>
    //  112  207:i2f             
    //  113  208:fload           13
    //  114  210:aload_0         
    //  115  211:getfield        #222 <Field int mPageMargin>
    //  116  214:i2f             
    //  117  215:fadd            
    //  118  216:fdiv            
    //  119  217:fadd            
    //  120  218:fmul            
    //  121  219:f2i             
    //  122  220:istore          14
    //  123  222:goto            149
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #1293 <Method boolean ViewGroup.verifyDrawable(Drawable)>
    //    3    5:ifne            16
    //    4    8:aload_1         
    //    5    9:aload_0         
    //    6   10:getfield        #818 <Field Drawable mMarginDrawable>
    //    7   13:if_acmpne       18
    //    8   16:iconst_1        
    //    9   17:ireturn         
    //   10   18:iconst_0        
    //   11   19:ireturn         
    }

    private static final int CLOSE_ENOUGH = 2;
    private static final Comparator COMPARATOR;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int LAYOUT_ATTRS[];
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE;
    private static final Interpolator sInterpolator;
    private static final ViewPositionComparator sPositionComparator;
    private int mActivePointerId;
    private PagerAdapter mAdapter;
    private OnAdapterChangeListener mAdapterChangeListener;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    private int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mIgnoreGutter;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsUnableToDrag;
    private final ArrayList mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffectCompat mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private PagerObserver mObserver;
    private int mOffscreenPageLimit;
    private OnPageChangeListener mOnPageChangeListener;
    private int mPageMargin;
    private PageTransformer mPageTransformer;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffectCompat mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private Method mSetChildrenDrawingOrderEnabled;
    private final ItemInfo mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    static void access$000(ViewPager viewpager, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #199 <Method void setScrollState(int)>
    //    3    5:return          
    }

    static PagerAdapter access$200(ViewPager viewpager)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #203 <Field PagerAdapter mAdapter>
    //    2    4:areturn         
    }

    static int access$300(ViewPager viewpager)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #207 <Field int mCurItem>
    //    2    4:ireturn         
    }

    static int[] access$400()
    {
    //    0    0:getstatic       #123 <Field int[] LAYOUT_ATTRS>
    //    1    3:areturn         
    }

    // Unreferenced inner class android/support/v4/view/ViewPager$1

/* anonymous class */
    static final class _cls1
        implements Comparator
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void Object()>
        //    2    4:return          
        }

        public int compare(ItemInfo iteminfo, ItemInfo iteminfo1)
        {
        //    0    0:aload_1         
        //    1    1:getfield        #21  <Field int ViewPager$ItemInfo.position>
        //    2    4:aload_2         
        //    3    5:getfield        #21  <Field int ViewPager$ItemInfo.position>
        //    4    8:isub            
        //    5    9:ireturn         
        }

        public volatile int compare(Object obj, Object obj1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #17  <Class ViewPager$ItemInfo>
        //    3    5:aload_2         
        //    4    6:checkcast       #17  <Class ViewPager$ItemInfo>
        //    5    9:invokevirtual   #24  <Method int compare(ViewPager$ItemInfo, ViewPager$ItemInfo)>
        //    6   12:ireturn         
        }
    }


    // Unreferenced inner class android/support/v4/view/ViewPager$2

/* anonymous class */
    static final class _cls2
        implements Interpolator
    {

        _cls2()
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


    // Unreferenced inner class android/support/v4/view/ViewPager$3

/* anonymous class */
    class _cls3
        implements Runnable
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field ViewPager this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field ViewPager this$0>
        //    2    4:iconst_0        
        //    3    5:invokestatic    #22  <Method void ViewPager.access$000(ViewPager, int)>
        //    4    8:aload_0         
        //    5    9:getfield        #14  <Field ViewPager this$0>
        //    6   12:invokevirtual   #25  <Method void ViewPager.populate()>
        //    7   15:return          
        }

        final ViewPager this$0;
    }


    // Unreferenced inner class android/support/v4/view/ViewPager$SavedState$1

/* anonymous class */
    static final class SavedState._cls1
        implements ParcelableCompatCreatorCallbacks
    {

        SavedState._cls1()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void Object()>
        //    2    4:return          
        }

        public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
        {
        //    0    0:new             #9   <Class ViewPager$SavedState>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokespecial   #18  <Method void ViewPager$SavedState(Parcel, ClassLoader)>
        //    5    9:areturn         
        }

        public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:invokevirtual   #21  <Method ViewPager$SavedState createFromParcel(Parcel, ClassLoader)>
        //    4    6:areturn         
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
        //    2    2:invokevirtual   #26  <Method ViewPager$SavedState[] newArray(int)>
        //    3    5:areturn         
        }
    }

}
