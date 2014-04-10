// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//            AccessibilityDelegateCompat, ViewCompatEclairMr1, ViewCompatGingerbread, ViewCompatHC, 
//            ViewCompatICS, ViewCompatJB, ViewCompatJellybeanMr1, ViewCompatKitKat

public class ViewCompat
{
    static class BaseViewCompatImpl
        implements ViewCompatImpl
    {

        BaseViewCompatImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public boolean canScrollHorizontally(View view, int i)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public boolean canScrollVertically(View view, int i)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public int getAccessibilityLiveRegion(View view)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }

        public float getAlpha(View view)
        {
        //    0    0:fconst_1        
        //    1    1:freturn         
        }

        long getFrameTime()
        {
        //    0    0:ldc2w           #22  <Long 10L>
        //    1    3:lreturn         
        }

        public int getImportantForAccessibility(View view)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public int getLabelFor(View view)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public int getLayerType(View view)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public int getLayoutDirection(View view)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public int getMeasuredHeightAndState(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #34  <Method int View.getMeasuredHeight()>
        //    2    4:ireturn         
        }

        public int getMeasuredState(View view)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public int getMeasuredWidthAndState(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #39  <Method int View.getMeasuredWidth()>
        //    2    4:ireturn         
        }

        public int getOverScrollMode(View view)
        {
        //    0    0:iconst_2        
        //    1    1:ireturn         
        }

        public ViewParent getParentForAccessibility(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #46  <Method ViewParent View.getParent()>
        //    2    4:areturn         
        }

        public boolean hasTransientState(View view)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public boolean isOpaque(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #53  <Method Drawable View.getBackground()>
        //    2    4:astore_2        
        //    3    5:iconst_0        
        //    4    6:istore_3        
        //    5    7:aload_2         
        //    6    8:ifnull          27
        //    7   11:aload_2         
        //    8   12:invokevirtual   #58  <Method int Drawable.getOpacity()>
        //    9   15:istore          4
        //   10   17:iconst_0        
        //   11   18:istore_3        
        //   12   19:iload           4
        //   13   21:iconst_m1       
        //   14   22:icmpne          27
        //   15   25:iconst_1        
        //   16   26:istore_3        
        //   17   27:iload_3         
        //   18   28:ireturn         
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:return          
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
        //    0    0:return          
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:return          
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public void postInvalidateOnAnimation(View view)
        {
        //    0    0:aload_1         
        //    1    1:aload_0         
        //    2    2:invokevirtual   #69  <Method long getFrameTime()>
        //    3    5:invokevirtual   #73  <Method void View.postInvalidateDelayed(long)>
        //    4    8:return          
        }

        public void postInvalidateOnAnimation(View view, int i, int j, int k, int l)
        {
        //    0    0:aload_1         
        //    1    1:aload_0         
        //    2    2:invokevirtual   #69  <Method long getFrameTime()>
        //    3    5:iload_2         
        //    4    6:iload_3         
        //    5    7:iload           4
        //    6    9:iload           5
        //    7   11:invokevirtual   #77  <Method void View.postInvalidateDelayed(long, int, int, int, int)>
        //    8   14:return          
        }

        public void postOnAnimation(View view, Runnable runnable)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:aload_0         
        //    3    3:invokevirtual   #69  <Method long getFrameTime()>
        //    4    6:invokevirtual   #83  <Method boolean View.postDelayed(Runnable, long)>
        //    5    9:pop             
        //    6   10:return          
        }

        public void postOnAnimationDelayed(View view, Runnable runnable, long l)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:lload_3         
        //    3    3:aload_0         
        //    4    4:invokevirtual   #69  <Method long getFrameTime()>
        //    5    7:ladd            
        //    6    8:invokevirtual   #83  <Method boolean View.postDelayed(Runnable, long)>
        //    7   11:pop             
        //    8   12:return          
        }

        public int resolveSizeAndState(int i, int j, int k)
        {
        //    0    0:iload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #91  <Method int View.resolveSize(int, int)>
        //    3    5:ireturn         
        }

        public void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
        {
        //    0    0:return          
        }

        public void setAccessibilityLiveRegion(View view, int i)
        {
        //    0    0:return          
        }

        public void setHasTransientState(View view, boolean flag)
        {
        //    0    0:return          
        }

        public void setImportantForAccessibility(View view, int i)
        {
        //    0    0:return          
        }

        public void setLabelFor(View view, int i)
        {
        //    0    0:return          
        }

        public void setLayerPaint(View view, Paint paint)
        {
        //    0    0:return          
        }

        public void setLayerType(View view, int i, Paint paint)
        {
        //    0    0:return          
        }

        public void setLayoutDirection(View view, int i)
        {
        //    0    0:return          
        }

        public void setOverScrollMode(View view, int i)
        {
        //    0    0:return          
        }
    }

    static class EclairMr1ViewCompatImpl extends BaseViewCompatImpl
    {

        EclairMr1ViewCompatImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void ViewCompat$BaseViewCompatImpl()>
        //    2    4:return          
        }

        public boolean isOpaque(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #14  <Method boolean ViewCompatEclairMr1.isOpaque(View)>
        //    2    4:ireturn         
        }
    }

    static class GBViewCompatImpl extends EclairMr1ViewCompatImpl
    {

        GBViewCompatImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void ViewCompat$EclairMr1ViewCompatImpl()>
        //    2    4:return          
        }

        public int getOverScrollMode(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #14  <Method int ViewCompatGingerbread.getOverScrollMode(View)>
        //    2    4:ireturn         
        }

        public void setOverScrollMode(View view, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #18  <Method void ViewCompatGingerbread.setOverScrollMode(View, int)>
        //    3    5:return          
        }
    }

    static class HCViewCompatImpl extends GBViewCompatImpl
    {

        HCViewCompatImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void ViewCompat$GBViewCompatImpl()>
        //    2    4:return          
        }

        public float getAlpha(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #14  <Method float ViewCompatHC.getAlpha(View)>
        //    2    4:freturn         
        }

        long getFrameTime()
        {
        //    0    0:invokestatic    #18  <Method long ViewCompatHC.getFrameTime()>
        //    1    3:lreturn         
        }

        public int getLayerType(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #22  <Method int ViewCompatHC.getLayerType(View)>
        //    2    4:ireturn         
        }

        public int getMeasuredHeightAndState(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #25  <Method int ViewCompatHC.getMeasuredHeightAndState(View)>
        //    2    4:ireturn         
        }

        public int getMeasuredState(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #28  <Method int ViewCompatHC.getMeasuredState(View)>
        //    2    4:ireturn         
        }

        public int getMeasuredWidthAndState(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #31  <Method int ViewCompatHC.getMeasuredWidthAndState(View)>
        //    2    4:ireturn         
        }

        public int resolveSizeAndState(int i, int j, int k)
        {
        //    0    0:iload_1         
        //    1    1:iload_2         
        //    2    2:iload_3         
        //    3    3:invokestatic    #35  <Method int ViewCompatHC.resolveSizeAndState(int, int, int)>
        //    4    6:ireturn         
        }

        public void setLayerPaint(View view, Paint paint)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_0         
        //    3    3:aload_1         
        //    4    4:invokevirtual   #38  <Method int getLayerType(View)>
        //    5    7:aload_2         
        //    6    8:invokevirtual   #42  <Method void setLayerType(View, int, Paint)>
        //    7   11:aload_1         
        //    8   12:invokevirtual   #47  <Method void View.invalidate()>
        //    9   15:return          
        }

        public void setLayerType(View view, int i, Paint paint)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:aload_3         
        //    3    3:invokestatic    #48  <Method void ViewCompatHC.setLayerType(View, int, Paint)>
        //    4    6:return          
        }
    }

    static class ICSViewCompatImpl extends HCViewCompatImpl
    {

        ICSViewCompatImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void ViewCompat$HCViewCompatImpl()>
        //    2    4:return          
        }

        public boolean canScrollHorizontally(View view, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #14  <Method boolean ViewCompatICS.canScrollHorizontally(View, int)>
        //    3    5:ireturn         
        }

        public boolean canScrollVertically(View view, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #17  <Method boolean ViewCompatICS.canScrollVertically(View, int)>
        //    3    5:ireturn         
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokestatic    #21  <Method void ViewCompatICS.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
        //    3    5:return          
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokevirtual   #29  <Method Object AccessibilityNodeInfoCompat.getInfo()>
        //    3    5:invokestatic    #32  <Method void ViewCompatICS.onInitializeAccessibilityNodeInfo(View, Object)>
        //    4    8:return          
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokestatic    #35  <Method void ViewCompatICS.onPopulateAccessibilityEvent(View, AccessibilityEvent)>
        //    3    5:return          
        }

        public void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokevirtual   #42  <Method Object AccessibilityDelegateCompat.getBridge()>
        //    3    5:invokestatic    #44  <Method void ViewCompatICS.setAccessibilityDelegate(View, Object)>
        //    4    8:return          
        }
    }

    static class JBViewCompatImpl extends ICSViewCompatImpl
    {

        JBViewCompatImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void ViewCompat$ICSViewCompatImpl()>
        //    2    4:return          
        }

        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #15  <Method Object ViewCompatJB.getAccessibilityNodeProvider(View)>
        //    2    4:astore_2        
        //    3    5:aload_2         
        //    4    6:ifnull          18
        //    5    9:new             #17  <Class AccessibilityNodeProviderCompat>
        //    6   12:dup             
        //    7   13:aload_2         
        //    8   14:invokespecial   #20  <Method void AccessibilityNodeProviderCompat(Object)>
        //    9   17:areturn         
        //   10   18:aconst_null     
        //   11   19:areturn         
        }

        public int getImportantForAccessibility(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #24  <Method int ViewCompatJB.getImportantForAccessibility(View)>
        //    2    4:ireturn         
        }

        public ViewParent getParentForAccessibility(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #28  <Method ViewParent ViewCompatJB.getParentForAccessibility(View)>
        //    2    4:areturn         
        }

        public boolean hasTransientState(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #32  <Method boolean ViewCompatJB.hasTransientState(View)>
        //    2    4:ireturn         
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:aload_3         
        //    3    3:invokestatic    #36  <Method boolean ViewCompatJB.performAccessibilityAction(View, int, Bundle)>
        //    4    6:ireturn         
        }

        public void postInvalidateOnAnimation(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #40  <Method void ViewCompatJB.postInvalidateOnAnimation(View)>
        //    2    4:return          
        }

        public void postInvalidateOnAnimation(View view, int i, int j, int k, int l)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:iload_3         
        //    3    3:iload           4
        //    4    5:iload           5
        //    5    7:invokestatic    #43  <Method void ViewCompatJB.postInvalidateOnAnimation(View, int, int, int, int)>
        //    6   10:return          
        }

        public void postOnAnimation(View view, Runnable runnable)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokestatic    #47  <Method void ViewCompatJB.postOnAnimation(View, Runnable)>
        //    3    5:return          
        }

        public void postOnAnimationDelayed(View view, Runnable runnable, long l)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:lload_3         
        //    3    3:invokestatic    #51  <Method void ViewCompatJB.postOnAnimationDelayed(View, Runnable, long)>
        //    4    6:return          
        }

        public void setHasTransientState(View view, boolean flag)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #55  <Method void ViewCompatJB.setHasTransientState(View, boolean)>
        //    3    5:return          
        }

        public void setImportantForAccessibility(View view, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #59  <Method void ViewCompatJB.setImportantForAccessibility(View, int)>
        //    3    5:return          
        }
    }

    static class JbMr1ViewCompatImpl extends JBViewCompatImpl
    {

        JbMr1ViewCompatImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void ViewCompat$JBViewCompatImpl()>
        //    2    4:return          
        }

        public int getLabelFor(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #14  <Method int ViewCompatJellybeanMr1.getLabelFor(View)>
        //    2    4:ireturn         
        }

        public int getLayoutDirection(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #17  <Method int ViewCompatJellybeanMr1.getLayoutDirection(View)>
        //    2    4:ireturn         
        }

        public void setLabelFor(View view, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #21  <Method void ViewCompatJellybeanMr1.setLabelFor(View, int)>
        //    3    5:return          
        }

        public void setLayerPaint(View view, Paint paint)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokestatic    #25  <Method void ViewCompatJellybeanMr1.setLayerPaint(View, Paint)>
        //    3    5:return          
        }

        public void setLayoutDirection(View view, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #28  <Method void ViewCompatJellybeanMr1.setLayoutDirection(View, int)>
        //    3    5:return          
        }
    }

    static class KitKatViewCompatImpl extends JbMr1ViewCompatImpl
    {

        KitKatViewCompatImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void ViewCompat$JbMr1ViewCompatImpl()>
        //    2    4:return          
        }

        public int getAccessibilityLiveRegion(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #14  <Method int ViewCompatKitKat.getAccessibilityLiveRegion(View)>
        //    2    4:ireturn         
        }

        public void setAccessibilityLiveRegion(View view, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #18  <Method void ViewCompatKitKat.setAccessibilityLiveRegion(View, int)>
        //    3    5:return          
        }
    }

    static interface ViewCompatImpl
    {

        public abstract boolean canScrollHorizontally(View view, int i);

        public abstract boolean canScrollVertically(View view, int i);

        public abstract int getAccessibilityLiveRegion(View view);

        public abstract AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view);

        public abstract float getAlpha(View view);

        public abstract int getImportantForAccessibility(View view);

        public abstract int getLabelFor(View view);

        public abstract int getLayerType(View view);

        public abstract int getLayoutDirection(View view);

        public abstract int getMeasuredHeightAndState(View view);

        public abstract int getMeasuredState(View view);

        public abstract int getMeasuredWidthAndState(View view);

        public abstract int getOverScrollMode(View view);

        public abstract ViewParent getParentForAccessibility(View view);

        public abstract boolean hasTransientState(View view);

        public abstract boolean isOpaque(View view);

        public abstract void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

        public abstract void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat);

        public abstract void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent);

        public abstract boolean performAccessibilityAction(View view, int i, Bundle bundle);

        public abstract void postInvalidateOnAnimation(View view);

        public abstract void postInvalidateOnAnimation(View view, int i, int j, int k, int l);

        public abstract void postOnAnimation(View view, Runnable runnable);

        public abstract void postOnAnimationDelayed(View view, Runnable runnable, long l);

        public abstract int resolveSizeAndState(int i, int j, int k);

        public abstract void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat);

        public abstract void setAccessibilityLiveRegion(View view, int i);

        public abstract void setHasTransientState(View view, boolean flag);

        public abstract void setImportantForAccessibility(View view, int i);

        public abstract void setLabelFor(View view, int i);

        public abstract void setLayerPaint(View view, Paint paint);

        public abstract void setLayerType(View view, int i, Paint paint);

        public abstract void setLayoutDirection(View view, int i);

        public abstract void setOverScrollMode(View view, int i);
    }


    static 
    {
    //    0    0:getstatic       #48  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:istore_0        
    //    2    4:iload_0         
    //    3    5:bipush          19
    //    4    7:icmplt          21
    //    5   10:new             #50  <Class ViewCompat$KitKatViewCompatImpl>
    //    6   13:dup             
    //    7   14:invokespecial   #53  <Method void ViewCompat$KitKatViewCompatImpl()>
    //    8   17:putstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    9   20:return          
    //   10   21:iload_0         
    //   11   22:bipush          17
    //   12   24:icmplt          38
    //   13   27:new             #57  <Class ViewCompat$JbMr1ViewCompatImpl>
    //   14   30:dup             
    //   15   31:invokespecial   #58  <Method void ViewCompat$JbMr1ViewCompatImpl()>
    //   16   34:putstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //   17   37:return          
    //   18   38:iload_0         
    //   19   39:bipush          16
    //   20   41:icmplt          55
    //   21   44:new             #60  <Class ViewCompat$JBViewCompatImpl>
    //   22   47:dup             
    //   23   48:invokespecial   #61  <Method void ViewCompat$JBViewCompatImpl()>
    //   24   51:putstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //   25   54:return          
    //   26   55:iload_0         
    //   27   56:bipush          14
    //   28   58:icmplt          72
    //   29   61:new             #63  <Class ViewCompat$ICSViewCompatImpl>
    //   30   64:dup             
    //   31   65:invokespecial   #64  <Method void ViewCompat$ICSViewCompatImpl()>
    //   32   68:putstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //   33   71:return          
    //   34   72:iload_0         
    //   35   73:bipush          11
    //   36   75:icmplt          89
    //   37   78:new             #66  <Class ViewCompat$HCViewCompatImpl>
    //   38   81:dup             
    //   39   82:invokespecial   #67  <Method void ViewCompat$HCViewCompatImpl()>
    //   40   85:putstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //   41   88:return          
    //   42   89:iload_0         
    //   43   90:bipush          9
    //   44   92:icmplt          106
    //   45   95:new             #69  <Class ViewCompat$GBViewCompatImpl>
    //   46   98:dup             
    //   47   99:invokespecial   #70  <Method void ViewCompat$GBViewCompatImpl()>
    //   48  102:putstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //   49  105:return          
    //   50  106:new             #72  <Class ViewCompat$BaseViewCompatImpl>
    //   51  109:dup             
    //   52  110:invokespecial   #73  <Method void ViewCompat$BaseViewCompatImpl()>
    //   53  113:putstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //   54  116:return          
    }

    public ViewCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #74  <Method void Object()>
    //    2    4:return          
    }

    public static boolean canScrollHorizontally(View view, int i)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #80  <Method boolean ViewCompat$ViewCompatImpl.canScrollHorizontally(View, int)>
    //    4   10:ireturn         
    }

    public static boolean canScrollVertically(View view, int i)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #83  <Method boolean ViewCompat$ViewCompatImpl.canScrollVertically(View, int)>
    //    4   10:ireturn         
    }

    public static AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #87  <Method AccessibilityNodeProviderCompat ViewCompat$ViewCompatImpl.getAccessibilityNodeProvider(View)>
    //    3    9:areturn         
    }

    public static float getAlpha(View view)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #91  <Method float ViewCompat$ViewCompatImpl.getAlpha(View)>
    //    3    9:freturn         
    }

    public static int getImportantForAccessibility(View view)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #95  <Method int ViewCompat$ViewCompatImpl.getImportantForAccessibility(View)>
    //    3    9:ireturn         
    }

    public static int getLabelFor(View view)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #98  <Method int ViewCompat$ViewCompatImpl.getLabelFor(View)>
    //    3    9:ireturn         
    }

    public static int getLayerType(View view)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #101 <Method int ViewCompat$ViewCompatImpl.getLayerType(View)>
    //    3    9:ireturn         
    }

    public static int getLayoutDirection(View view)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #104 <Method int ViewCompat$ViewCompatImpl.getLayoutDirection(View)>
    //    3    9:ireturn         
    }

    public static int getMeasuredHeightAndState(View view)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #107 <Method int ViewCompat$ViewCompatImpl.getMeasuredHeightAndState(View)>
    //    3    9:ireturn         
    }

    public static int getMeasuredState(View view)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #110 <Method int ViewCompat$ViewCompatImpl.getMeasuredState(View)>
    //    3    9:ireturn         
    }

    public static int getMeasuredWidthAndState(View view)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #113 <Method int ViewCompat$ViewCompatImpl.getMeasuredWidthAndState(View)>
    //    3    9:ireturn         
    }

    public static int getOverScrollMode(View view)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #116 <Method int ViewCompat$ViewCompatImpl.getOverScrollMode(View)>
    //    3    9:ireturn         
    }

    public static ViewParent getParentForAccessibility(View view)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #120 <Method ViewParent ViewCompat$ViewCompatImpl.getParentForAccessibility(View)>
    //    3    9:areturn         
    }

    public static boolean hasTransientState(View view)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #124 <Method boolean ViewCompat$ViewCompatImpl.hasTransientState(View)>
    //    3    9:ireturn         
    }

    public static boolean isOpaque(View view)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #127 <Method boolean ViewCompat$ViewCompatImpl.isOpaque(View)>
    //    3    9:ireturn         
    }

    public static void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:invokeinterface #131 <Method void ViewCompat$ViewCompatImpl.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
    //    4   10:return          
    }

    public static void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:invokeinterface #135 <Method void ViewCompat$ViewCompatImpl.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
    //    4   10:return          
    }

    public static void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:invokeinterface #138 <Method void ViewCompat$ViewCompatImpl.onPopulateAccessibilityEvent(View, AccessibilityEvent)>
    //    4   10:return          
    }

    public static boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:aload_2         
    //    4    6:invokeinterface #142 <Method boolean ViewCompat$ViewCompatImpl.performAccessibilityAction(View, int, Bundle)>
    //    5   11:ireturn         
    }

    public static void postInvalidateOnAnimation(View view)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #146 <Method void ViewCompat$ViewCompatImpl.postInvalidateOnAnimation(View)>
    //    3    9:return          
    }

    public static void postInvalidateOnAnimation(View view, int i, int j, int k, int l)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:iload_2         
    //    4    6:iload_3         
    //    5    7:iload           4
    //    6    9:invokeinterface #149 <Method void ViewCompat$ViewCompatImpl.postInvalidateOnAnimation(View, int, int, int, int)>
    //    7   14:return          
    }

    public static void postOnAnimation(View view, Runnable runnable)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:invokeinterface #153 <Method void ViewCompat$ViewCompatImpl.postOnAnimation(View, Runnable)>
    //    4   10:return          
    }

    public static void postOnAnimationDelayed(View view, Runnable runnable, long l)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:lload_2         
    //    4    6:invokeinterface #157 <Method void ViewCompat$ViewCompatImpl.postOnAnimationDelayed(View, Runnable, long)>
    //    5   11:return          
    }

    public static int resolveSizeAndState(int i, int j, int k)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:iload_0         
    //    2    4:iload_1         
    //    3    5:iload_2         
    //    4    6:invokeinterface #161 <Method int ViewCompat$ViewCompatImpl.resolveSizeAndState(int, int, int)>
    //    5   11:ireturn         
    }

    public static void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilitydelegatecompat)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:invokeinterface #165 <Method void ViewCompat$ViewCompatImpl.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
    //    4   10:return          
    }

    public static void setHasTransientState(View view, boolean flag)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #169 <Method void ViewCompat$ViewCompatImpl.setHasTransientState(View, boolean)>
    //    4   10:return          
    }

    public static void setImportantForAccessibility(View view, int i)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #173 <Method void ViewCompat$ViewCompatImpl.setImportantForAccessibility(View, int)>
    //    4   10:return          
    }

    public static void setLabelFor(View view, int i)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #176 <Method void ViewCompat$ViewCompatImpl.setLabelFor(View, int)>
    //    4   10:return          
    }

    public static void setLayerPaint(View view, Paint paint)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:invokeinterface #180 <Method void ViewCompat$ViewCompatImpl.setLayerPaint(View, Paint)>
    //    4   10:return          
    }

    public static void setLayerType(View view, int i, Paint paint)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:aload_2         
    //    4    6:invokeinterface #184 <Method void ViewCompat$ViewCompatImpl.setLayerType(View, int, Paint)>
    //    5   11:return          
    }

    public static void setLayoutDirection(View view, int i)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #187 <Method void ViewCompat$ViewCompatImpl.setLayoutDirection(View, int)>
    //    4   10:return          
    }

    public static void setOverScrollMode(View view, int i)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #190 <Method void ViewCompat$ViewCompatImpl.setOverScrollMode(View, int)>
    //    4   10:return          
    }

    public int getAccessibilityLiveRegion(View view)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_1         
    //    2    4:invokeinterface #193 <Method int ViewCompat$ViewCompatImpl.getAccessibilityLiveRegion(View)>
    //    3    9:ireturn         
    }

    public void setAccessibilityLiveRegion(View view, int i)
    {
    //    0    0:getstatic       #55  <Field ViewCompat$ViewCompatImpl IMPL>
    //    1    3:aload_1         
    //    2    4:iload_2         
    //    3    5:invokeinterface #196 <Method void ViewCompat$ViewCompatImpl.setAccessibilityLiveRegion(View, int)>
    //    4   10:return          
    }

    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;
    private static final long FAKE_FRAME_TIME = 10L;
    static final ViewCompatImpl IMPL;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    public static final int LAYER_TYPE_HARDWARE = 2;
    public static final int LAYER_TYPE_NONE = 0;
    public static final int LAYER_TYPE_SOFTWARE = 1;
    public static final int LAYOUT_DIRECTION_INHERIT = 2;
    public static final int LAYOUT_DIRECTION_LOCALE = 3;
    public static final int LAYOUT_DIRECTION_LTR = 0;
    public static final int LAYOUT_DIRECTION_RTL = 1;
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;
    public static final int MEASURED_SIZE_MASK = 0xffffff;
    public static final int MEASURED_STATE_MASK = 0xff000000;
    public static final int MEASURED_STATE_TOO_SMALL = 0x1000000;
    public static final int OVER_SCROLL_ALWAYS = 0;
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
    public static final int OVER_SCROLL_NEVER = 2;
}
