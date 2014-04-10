// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.*;
import android.support.v4.view.accessibility.*;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.*;

public abstract class ExploreByTouchHelper extends AccessibilityDelegateCompat
{
    private class ExploreByTouchNodeProvider extends AccessibilityNodeProviderCompat
    {

        private ExploreByTouchNodeProvider()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #10  <Field ExploreByTouchHelper this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #13  <Method void AccessibilityNodeProviderCompat()>
        //    5    9:return          
        }

        ExploreByTouchNodeProvider(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #16  <Method void ExploreByTouchHelper$ExploreByTouchNodeProvider(ExploreByTouchHelper)>
        //    3    5:return          
        }

        public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field ExploreByTouchHelper this$0>
        //    2    4:iload_1         
        //    3    5:invokestatic    #24  <Method AccessibilityNodeInfoCompat ExploreByTouchHelper.access$100(ExploreByTouchHelper, int)>
        //    4    8:areturn         
        }

        public boolean performAction(int i, int j, Bundle bundle)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field ExploreByTouchHelper this$0>
        //    2    4:iload_1         
        //    3    5:iload_2         
        //    4    6:aload_3         
        //    5    7:invokestatic    #30  <Method boolean ExploreByTouchHelper.access$200(ExploreByTouchHelper, int, int, Bundle)>
        //    6   10:ireturn         
        }

        final ExploreByTouchHelper this$0;
    }


    static 
    {
    //    0    0:ldc1            #27  <Class View>
    //    1    2:invokevirtual   #33  <Method String Class.getName()>
    //    2    5:putstatic       #35  <Field String DEFAULT_CLASS_NAME>
    //    3    8:return          
    }

    public ExploreByTouchHelper(View view)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #39  <Method void AccessibilityDelegateCompat()>
    //    2    4:aload_0         
    //    3    5:new             #41  <Class Rect>
    //    4    8:dup             
    //    5    9:invokespecial   #42  <Method void Rect()>
    //    6   12:putfield        #44  <Field Rect mTempScreenRect>
    //    7   15:aload_0         
    //    8   16:new             #41  <Class Rect>
    //    9   19:dup             
    //   10   20:invokespecial   #42  <Method void Rect()>
    //   11   23:putfield        #46  <Field Rect mTempParentRect>
    //   12   26:aload_0         
    //   13   27:new             #41  <Class Rect>
    //   14   30:dup             
    //   15   31:invokespecial   #42  <Method void Rect()>
    //   16   34:putfield        #48  <Field Rect mTempVisibleRect>
    //   17   37:aload_0         
    //   18   38:iconst_2        
    //   19   39:newarray        int[]
    //   20   41:putfield        #50  <Field int[] mTempGlobalRect>
    //   21   44:aload_0         
    //   22   45:ldc1            #9   <Int 0x80000000>
    //   23   47:putfield        #52  <Field int mFocusedVirtualViewId>
    //   24   50:aload_0         
    //   25   51:ldc1            #9   <Int 0x80000000>
    //   26   53:putfield        #54  <Field int mHoveredVirtualViewId>
    //   27   56:aload_1         
    //   28   57:ifnonnull       70
    //   29   60:new             #56  <Class IllegalArgumentException>
    //   30   63:dup             
    //   31   64:ldc1            #58  <String "View may not be null">
    //   32   66:invokespecial   #61  <Method void IllegalArgumentException(String)>
    //   33   69:athrow          
    //   34   70:aload_0         
    //   35   71:aload_1         
    //   36   72:putfield        #63  <Field View mView>
    //   37   75:aload_0         
    //   38   76:aload_1         
    //   39   77:invokevirtual   #67  <Method Context View.getContext()>
    //   40   80:ldc1            #69  <String "accessibility">
    //   41   82:invokevirtual   #75  <Method Object Context.getSystemService(String)>
    //   42   85:checkcast       #77  <Class AccessibilityManager>
    //   43   88:putfield        #79  <Field AccessibilityManager mManager>
    //   44   91:return          
    }

    static AccessibilityNodeInfoCompat access$100(ExploreByTouchHelper explorebytouchhelper, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #85  <Method AccessibilityNodeInfoCompat createNode(int)>
    //    3    5:areturn         
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:iload_1         
    //    6    2:invokespecial   #85  <Method AccessibilityNodeInfoCompat createNode(int)>
    //    7    5:areturn         
    }

    static boolean access$200(ExploreByTouchHelper explorebytouchhelper, int i, int j, Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:aload_3         
    //    4    4:invokespecial   #91  <Method boolean performAction(int, int, Bundle)>
    //    5    7:ireturn         
// Previous instruction length mismatch
    //    6    0:aload_0         
    //    7    1:iload_1         
    //    8    2:iload_2         
    //    9    3:aload_3         
    //   10    4:invokespecial   #91  <Method boolean performAction(int, int, Bundle)>
    //   11    7:ireturn         
    }

    private boolean clearAccessibilityFocus(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #96  <Method boolean isAccessibilityFocused(int)>
    //    3    5:ifeq            31
    //    4    8:aload_0         
    //    5    9:ldc1            #9   <Int 0x80000000>
    //    6   11:putfield        #52  <Field int mFocusedVirtualViewId>
    //    7   14:aload_0         
    //    8   15:getfield        #63  <Field View mView>
    //    9   18:invokevirtual   #99  <Method void View.invalidate()>
    //   10   21:aload_0         
    //   11   22:iload_1         
    //   12   23:ldc1            #100 <Int 0x10000>
    //   13   25:invokevirtual   #104 <Method boolean sendEventForVirtualView(int, int)>
    //   14   28:pop             
    //   15   29:iconst_1        
    //   16   30:ireturn         
    //   17   31:iconst_0        
    //   18   32:ireturn         
    }

    private AccessibilityEvent createEvent(int i, int j)
    {
    //    0    0:iload_1         
    //    1    1:tableswitch     -1 -1: default 20
    //                   -1 27
    //    2   20:aload_0         
    //    3   21:iload_1         
    //    4   22:iload_2         
    //    5   23:invokespecial   #109 <Method AccessibilityEvent createEventForChild(int, int)>
    //    6   26:areturn         
    //    7   27:aload_0         
    //    8   28:iload_2         
    //    9   29:invokespecial   #113 <Method AccessibilityEvent createEventForHost(int)>
    //   10   32:areturn         
    }

    private AccessibilityEvent createEventForChild(int i, int j)
    {
    //    0    0:iload_2         
    //    1    1:invokestatic    #118 <Method AccessibilityEvent AccessibilityEvent.obtain(int)>
    //    2    4:astore_3        
    //    3    5:aload_3         
    //    4    6:iconst_1        
    //    5    7:invokevirtual   #122 <Method void AccessibilityEvent.setEnabled(boolean)>
    //    6   10:aload_3         
    //    7   11:getstatic       #35  <Field String DEFAULT_CLASS_NAME>
    //    8   14:invokevirtual   #126 <Method void AccessibilityEvent.setClassName(CharSequence)>
    //    9   17:aload_0         
    //   10   18:iload_1         
    //   11   19:aload_3         
    //   12   20:invokevirtual   #130 <Method void onPopulateEventForVirtualView(int, AccessibilityEvent)>
    //   13   23:aload_3         
    //   14   24:invokevirtual   #134 <Method List AccessibilityEvent.getText()>
    //   15   27:invokeinterface #140 <Method boolean List.isEmpty()>
    //   16   32:ifeq            52
    //   17   35:aload_3         
    //   18   36:invokevirtual   #144 <Method CharSequence AccessibilityEvent.getContentDescription()>
    //   19   39:ifnonnull       52
    //   20   42:new             #146 <Class RuntimeException>
    //   21   45:dup             
    //   22   46:ldc1            #148 <String "Callbacks must add text or a content description in populateEventForVirtualViewId()">
    //   23   48:invokespecial   #149 <Method void RuntimeException(String)>
    //   24   51:athrow          
    //   25   52:aload_3         
    //   26   53:aload_0         
    //   27   54:getfield        #63  <Field View mView>
    //   28   57:invokevirtual   #67  <Method Context View.getContext()>
    //   29   60:invokevirtual   #152 <Method String Context.getPackageName()>
    //   30   63:invokevirtual   #155 <Method void AccessibilityEvent.setPackageName(CharSequence)>
    //   31   66:aload_3         
    //   32   67:invokestatic    #161 <Method AccessibilityRecordCompat AccessibilityEventCompat.asRecord(AccessibilityEvent)>
    //   33   70:aload_0         
    //   34   71:getfield        #63  <Field View mView>
    //   35   74:iload_1         
    //   36   75:invokevirtual   #167 <Method void AccessibilityRecordCompat.setSource(View, int)>
    //   37   78:aload_3         
    //   38   79:areturn         
    }

    private AccessibilityEvent createEventForHost(int i)
    {
    //    0    0:iload_1         
    //    1    1:invokestatic    #118 <Method AccessibilityEvent AccessibilityEvent.obtain(int)>
    //    2    4:astore_2        
    //    3    5:aload_0         
    //    4    6:getfield        #63  <Field View mView>
    //    5    9:aload_2         
    //    6   10:invokestatic    #173 <Method void ViewCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
    //    7   13:aload_2         
    //    8   14:areturn         
    }

    private AccessibilityNodeInfoCompat createNode(int i)
    {
    //    0    0:iload_1         
    //    1    1:tableswitch     -1 -1: default 20
    //                   -1 26
    //    2   20:aload_0         
    //    3   21:iload_1         
    //    4   22:invokespecial   #176 <Method AccessibilityNodeInfoCompat createNodeForChild(int)>
    //    5   25:areturn         
    //    6   26:aload_0         
    //    7   27:invokespecial   #180 <Method AccessibilityNodeInfoCompat createNodeForHost()>
    //    8   30:areturn         
    }

    private AccessibilityNodeInfoCompat createNodeForChild(int i)
    {
    //    0    0:invokestatic    #184 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain()>
    //    1    3:astore_2        
    //    2    4:aload_2         
    //    3    5:iconst_1        
    //    4    6:invokevirtual   #185 <Method void AccessibilityNodeInfoCompat.setEnabled(boolean)>
    //    5    9:aload_2         
    //    6   10:getstatic       #35  <Field String DEFAULT_CLASS_NAME>
    //    7   13:invokevirtual   #186 <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
    //    8   16:aload_0         
    //    9   17:iload_1         
    //   10   18:aload_2         
    //   11   19:invokevirtual   #190 <Method void onPopulateNodeForVirtualView(int, AccessibilityNodeInfoCompat)>
    //   12   22:aload_2         
    //   13   23:invokevirtual   #192 <Method CharSequence AccessibilityNodeInfoCompat.getText()>
    //   14   26:ifnonnull       46
    //   15   29:aload_2         
    //   16   30:invokevirtual   #193 <Method CharSequence AccessibilityNodeInfoCompat.getContentDescription()>
    //   17   33:ifnonnull       46
    //   18   36:new             #146 <Class RuntimeException>
    //   19   39:dup             
    //   20   40:ldc1            #195 <String "Callbacks must add text or a content description in populateNodeForVirtualViewId()">
    //   21   42:invokespecial   #149 <Method void RuntimeException(String)>
    //   22   45:athrow          
    //   23   46:aload_2         
    //   24   47:aload_0         
    //   25   48:getfield        #46  <Field Rect mTempParentRect>
    //   26   51:invokevirtual   #199 <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
    //   27   54:aload_0         
    //   28   55:getfield        #46  <Field Rect mTempParentRect>
    //   29   58:invokevirtual   #200 <Method boolean Rect.isEmpty()>
    //   30   61:ifeq            74
    //   31   64:new             #146 <Class RuntimeException>
    //   32   67:dup             
    //   33   68:ldc1            #202 <String "Callbacks must set parent bounds in populateNodeForVirtualViewId()">
    //   34   70:invokespecial   #149 <Method void RuntimeException(String)>
    //   35   73:athrow          
    //   36   74:aload_2         
    //   37   75:invokevirtual   #206 <Method int AccessibilityNodeInfoCompat.getActions()>
    //   38   78:istore_3        
    //   39   79:iload_3         
    //   40   80:bipush          64
    //   41   82:iand            
    //   42   83:ifeq            96
    //   43   86:new             #146 <Class RuntimeException>
    //   44   89:dup             
    //   45   90:ldc1            #208 <String "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()">
    //   46   92:invokespecial   #149 <Method void RuntimeException(String)>
    //   47   95:athrow          
    //   48   96:iload_3         
    //   49   97:sipush          128
    //   50  100:iand            
    //   51  101:ifeq            114
    //   52  104:new             #146 <Class RuntimeException>
    //   53  107:dup             
    //   54  108:ldc1            #210 <String "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()">
    //   55  110:invokespecial   #149 <Method void RuntimeException(String)>
    //   56  113:athrow          
    //   57  114:aload_2         
    //   58  115:aload_0         
    //   59  116:getfield        #63  <Field View mView>
    //   60  119:invokevirtual   #67  <Method Context View.getContext()>
    //   61  122:invokevirtual   #152 <Method String Context.getPackageName()>
    //   62  125:invokevirtual   #211 <Method void AccessibilityNodeInfoCompat.setPackageName(CharSequence)>
    //   63  128:aload_2         
    //   64  129:aload_0         
    //   65  130:getfield        #63  <Field View mView>
    //   66  133:iload_1         
    //   67  134:invokevirtual   #212 <Method void AccessibilityNodeInfoCompat.setSource(View, int)>
    //   68  137:aload_2         
    //   69  138:aload_0         
    //   70  139:getfield        #63  <Field View mView>
    //   71  142:invokevirtual   #215 <Method void AccessibilityNodeInfoCompat.setParent(View)>
    //   72  145:aload_0         
    //   73  146:getfield        #52  <Field int mFocusedVirtualViewId>
    //   74  149:iload_1         
    //   75  150:icmpne          248
    //   76  153:aload_2         
    //   77  154:iconst_1        
    //   78  155:invokevirtual   #218 <Method void AccessibilityNodeInfoCompat.setAccessibilityFocused(boolean)>
    //   79  158:aload_2         
    //   80  159:sipush          128
    //   81  162:invokevirtual   #222 <Method void AccessibilityNodeInfoCompat.addAction(int)>
    //   82  165:aload_0         
    //   83  166:aload_0         
    //   84  167:getfield        #46  <Field Rect mTempParentRect>
    //   85  170:invokespecial   #226 <Method boolean intersectVisibleToUser(Rect)>
    //   86  173:ifeq            189
    //   87  176:aload_2         
    //   88  177:iconst_1        
    //   89  178:invokevirtual   #229 <Method void AccessibilityNodeInfoCompat.setVisibleToUser(boolean)>
    //   90  181:aload_2         
    //   91  182:aload_0         
    //   92  183:getfield        #46  <Field Rect mTempParentRect>
    //   93  186:invokevirtual   #232 <Method void AccessibilityNodeInfoCompat.setBoundsInParent(Rect)>
    //   94  189:aload_0         
    //   95  190:getfield        #63  <Field View mView>
    //   96  193:aload_0         
    //   97  194:getfield        #50  <Field int[] mTempGlobalRect>
    //   98  197:invokevirtual   #236 <Method void View.getLocationOnScreen(int[])>
    //   99  200:aload_0         
    //  100  201:getfield        #50  <Field int[] mTempGlobalRect>
    //  101  204:iconst_0        
    //  102  205:iaload          
    //  103  206:istore          4
    //  104  208:aload_0         
    //  105  209:getfield        #50  <Field int[] mTempGlobalRect>
    //  106  212:iconst_1        
    //  107  213:iaload          
    //  108  214:istore          5
    //  109  216:aload_0         
    //  110  217:getfield        #44  <Field Rect mTempScreenRect>
    //  111  220:aload_0         
    //  112  221:getfield        #46  <Field Rect mTempParentRect>
    //  113  224:invokevirtual   #239 <Method void Rect.set(Rect)>
    //  114  227:aload_0         
    //  115  228:getfield        #44  <Field Rect mTempScreenRect>
    //  116  231:iload           4
    //  117  233:iload           5
    //  118  235:invokevirtual   #243 <Method void Rect.offset(int, int)>
    //  119  238:aload_2         
    //  120  239:aload_0         
    //  121  240:getfield        #44  <Field Rect mTempScreenRect>
    //  122  243:invokevirtual   #246 <Method void AccessibilityNodeInfoCompat.setBoundsInScreen(Rect)>
    //  123  246:aload_2         
    //  124  247:areturn         
    //  125  248:aload_2         
    //  126  249:iconst_0        
    //  127  250:invokevirtual   #218 <Method void AccessibilityNodeInfoCompat.setAccessibilityFocused(boolean)>
    //  128  253:aload_2         
    //  129  254:bipush          64
    //  130  256:invokevirtual   #222 <Method void AccessibilityNodeInfoCompat.addAction(int)>
    //  131  259:goto            165
    }

    private AccessibilityNodeInfoCompat createNodeForHost()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #63  <Field View mView>
    //    2    4:invokestatic    #249 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain(View)>
    //    3    7:astore_1        
    //    4    8:aload_0         
    //    5    9:getfield        #63  <Field View mView>
    //    6   12:aload_1         
    //    7   13:invokestatic    #253 <Method void ViewCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
    //    8   16:new             #255 <Class LinkedList>
    //    9   19:dup             
    //   10   20:invokespecial   #256 <Method void LinkedList()>
    //   11   23:astore_2        
    //   12   24:aload_0         
    //   13   25:aload_2         
    //   14   26:invokevirtual   #260 <Method void getVisibleVirtualViews(List)>
    //   15   29:aload_2         
    //   16   30:invokevirtual   #264 <Method Iterator LinkedList.iterator()>
    //   17   33:astore_3        
    //   18   34:aload_3         
    //   19   35:invokeinterface #269 <Method boolean Iterator.hasNext()>
    //   20   40:ifeq            70
    //   21   43:aload_3         
    //   22   44:invokeinterface #273 <Method Object Iterator.next()>
    //   23   49:checkcast       #275 <Class Integer>
    //   24   52:astore          4
    //   25   54:aload_1         
    //   26   55:aload_0         
    //   27   56:getfield        #63  <Field View mView>
    //   28   59:aload           4
    //   29   61:invokevirtual   #278 <Method int Integer.intValue()>
    //   30   64:invokevirtual   #281 <Method void AccessibilityNodeInfoCompat.addChild(View, int)>
    //   31   67:goto            34
    //   32   70:aload_1         
    //   33   71:areturn         
    }

    private boolean intersectVisibleToUser(Rect rect)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          11
    //    2    4:aload_1         
    //    3    5:invokevirtual   #200 <Method boolean Rect.isEmpty()>
    //    4    8:ifeq            13
    //    5   11:iconst_0        
    //    6   12:ireturn         
    //    7   13:aload_0         
    //    8   14:getfield        #63  <Field View mView>
    //    9   17:invokevirtual   #284 <Method int View.getWindowVisibility()>
    //   10   20:ifne            11
    //   11   23:aload_0         
    //   12   24:getfield        #63  <Field View mView>
    //   13   27:invokevirtual   #288 <Method android.view.ViewParent View.getParent()>
    //   14   30:astore_2        
    //   15   31:aload_2         
    //   16   32:instanceof      #27  <Class View>
    //   17   35:ifeq            67
    //   18   38:aload_2         
    //   19   39:checkcast       #27  <Class View>
    //   20   42:astore_3        
    //   21   43:aload_3         
    //   22   44:invokestatic    #292 <Method float ViewCompat.getAlpha(View)>
    //   23   47:fconst_0        
    //   24   48:fcmpg           
    //   25   49:ifle            11
    //   26   52:aload_3         
    //   27   53:invokevirtual   #295 <Method int View.getVisibility()>
    //   28   56:ifne            11
    //   29   59:aload_3         
    //   30   60:invokevirtual   #288 <Method android.view.ViewParent View.getParent()>
    //   31   63:astore_2        
    //   32   64:goto            31
    //   33   67:aload_2         
    //   34   68:ifnull          11
    //   35   71:aload_0         
    //   36   72:getfield        #63  <Field View mView>
    //   37   75:aload_0         
    //   38   76:getfield        #48  <Field Rect mTempVisibleRect>
    //   39   79:invokevirtual   #298 <Method boolean View.getLocalVisibleRect(Rect)>
    //   40   82:ifeq            11
    //   41   85:aload_1         
    //   42   86:aload_0         
    //   43   87:getfield        #48  <Field Rect mTempVisibleRect>
    //   44   90:invokevirtual   #301 <Method boolean Rect.intersect(Rect)>
    //   45   93:ireturn         
    }

    private boolean isAccessibilityFocused(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #52  <Field int mFocusedVirtualViewId>
    //    2    4:iload_1         
    //    3    5:icmpne          10
    //    4    8:iconst_1        
    //    5    9:ireturn         
    //    6   10:iconst_0        
    //    7   11:ireturn         
    }

    private boolean manageFocusForChild(int i, int j, Bundle bundle)
    {
    //    0    0:iload_2         
    //    1    1:lookupswitch    2: default 28
    //                   64: 30
    //                   128: 36
    //    2   28:iconst_0        
    //    3   29:ireturn         
    //    4   30:aload_0         
    //    5   31:iload_1         
    //    6   32:invokespecial   #305 <Method boolean requestAccessibilityFocus(int)>
    //    7   35:ireturn         
    //    8   36:aload_0         
    //    9   37:iload_1         
    //   10   38:invokespecial   #307 <Method boolean clearAccessibilityFocus(int)>
    //   11   41:ireturn         
    }

    private boolean performAction(int i, int j, Bundle bundle)
    {
    //    0    0:iload_1         
    //    1    1:tableswitch     -1 -1: default 20
    //                   -1 28
    //    2   20:aload_0         
    //    3   21:iload_1         
    //    4   22:iload_2         
    //    5   23:aload_3         
    //    6   24:invokespecial   #310 <Method boolean performActionForChild(int, int, Bundle)>
    //    7   27:ireturn         
    //    8   28:aload_0         
    //    9   29:iload_2         
    //   10   30:aload_3         
    //   11   31:invokespecial   #314 <Method boolean performActionForHost(int, Bundle)>
    //   12   34:ireturn         
    }

    private boolean performActionForChild(int i, int j, Bundle bundle)
    {
    //    0    0:iload_2         
    //    1    1:lookupswitch    2: default 28
    //                   64: 36
    //                   128: 36
    //    2   28:aload_0         
    //    3   29:iload_1         
    //    4   30:iload_2         
    //    5   31:aload_3         
    //    6   32:invokevirtual   #317 <Method boolean onPerformActionForVirtualView(int, int, Bundle)>
    //    7   35:ireturn         
    //    8   36:aload_0         
    //    9   37:iload_1         
    //   10   38:iload_2         
    //   11   39:aload_3         
    //   12   40:invokespecial   #319 <Method boolean manageFocusForChild(int, int, Bundle)>
    //   13   43:ireturn         
    }

    private boolean performActionForHost(int i, Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #63  <Field View mView>
    //    2    4:iload_1         
    //    3    5:aload_2         
    //    4    6:invokestatic    #323 <Method boolean ViewCompat.performAccessibilityAction(View, int, Bundle)>
    //    5    9:ireturn         
    }

    private boolean requestAccessibilityFocus(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #79  <Field AccessibilityManager mManager>
    //    2    4:invokevirtual   #326 <Method boolean AccessibilityManager.isEnabled()>
    //    3    7:ifeq            20
    //    4   10:aload_0         
    //    5   11:getfield        #79  <Field AccessibilityManager mManager>
    //    6   14:invokestatic    #332 <Method boolean AccessibilityManagerCompat.isTouchExplorationEnabled(AccessibilityManager)>
    //    7   17:ifne            22
    //    8   20:iconst_0        
    //    9   21:ireturn         
    //   10   22:aload_0         
    //   11   23:iload_1         
    //   12   24:invokespecial   #96  <Method boolean isAccessibilityFocused(int)>
    //   13   27:ifne            20
    //   14   30:aload_0         
    //   15   31:iload_1         
    //   16   32:putfield        #52  <Field int mFocusedVirtualViewId>
    //   17   35:aload_0         
    //   18   36:getfield        #63  <Field View mView>
    //   19   39:invokevirtual   #99  <Method void View.invalidate()>
    //   20   42:aload_0         
    //   21   43:iload_1         
    //   22   44:ldc2            #333 <Int 32768>
    //   23   47:invokevirtual   #104 <Method boolean sendEventForVirtualView(int, int)>
    //   24   50:pop             
    //   25   51:iconst_1        
    //   26   52:ireturn         
    }

    private void updateHoveredVirtualView(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #54  <Field int mHoveredVirtualViewId>
    //    2    4:iload_1         
    //    3    5:icmpne          9
    //    4    8:return          
    //    5    9:aload_0         
    //    6   10:getfield        #54  <Field int mHoveredVirtualViewId>
    //    7   13:istore_2        
    //    8   14:aload_0         
    //    9   15:iload_1         
    //   10   16:putfield        #54  <Field int mHoveredVirtualViewId>
    //   11   19:aload_0         
    //   12   20:iload_1         
    //   13   21:sipush          128
    //   14   24:invokevirtual   #104 <Method boolean sendEventForVirtualView(int, int)>
    //   15   27:pop             
    //   16   28:aload_0         
    //   17   29:iload_2         
    //   18   30:sipush          256
    //   19   33:invokevirtual   #104 <Method boolean sendEventForVirtualView(int, int)>
    //   20   36:pop             
    //   21   37:return          
    }

    public boolean dispatchHoverEvent(MotionEvent motionevent)
    {
    //    0    0:iconst_1        
    //    1    1:istore_2        
    //    2    2:aload_0         
    //    3    3:getfield        #79  <Field AccessibilityManager mManager>
    //    4    6:invokevirtual   #326 <Method boolean AccessibilityManager.isEnabled()>
    //    5    9:ifeq            22
    //    6   12:aload_0         
    //    7   13:getfield        #79  <Field AccessibilityManager mManager>
    //    8   16:invokestatic    #332 <Method boolean AccessibilityManagerCompat.isTouchExplorationEnabled(AccessibilityManager)>
    //    9   19:ifne            24
    //   10   22:iconst_0        
    //   11   23:ireturn         
    //   12   24:aload_1         
    //   13   25:invokevirtual   #341 <Method int MotionEvent.getAction()>
    //   14   28:tableswitch     7 10: default 60
    //                   7 62
    //                   8 60
    //                   9 62
    //                   10 93
    //   15   60:iconst_0        
    //   16   61:ireturn         
    //   17   62:aload_0         
    //   18   63:aload_1         
    //   19   64:invokevirtual   #345 <Method float MotionEvent.getX()>
    //   20   67:aload_1         
    //   21   68:invokevirtual   #348 <Method float MotionEvent.getY()>
    //   22   71:invokevirtual   #352 <Method int getVirtualViewAt(float, float)>
    //   23   74:istore_3        
    //   24   75:aload_0         
    //   25   76:iload_3         
    //   26   77:invokespecial   #354 <Method void updateHoveredVirtualView(int)>
    //   27   80:iload_3         
    //   28   81:ldc1            #9   <Int 0x80000000>
    //   29   83:icmpeq          88
    //   30   86:iload_2         
    //   31   87:ireturn         
    //   32   88:iconst_0        
    //   33   89:istore_2        
    //   34   90:goto            86
    //   35   93:aload_0         
    //   36   94:getfield        #52  <Field int mFocusedVirtualViewId>
    //   37   97:ldc1            #9   <Int 0x80000000>
    //   38   99:icmpeq          22
    //   39  102:aload_0         
    //   40  103:ldc1            #9   <Int 0x80000000>
    //   41  105:invokespecial   #354 <Method void updateHoveredVirtualView(int)>
    //   42  108:iload_2         
    //   43  109:ireturn         
    }

    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #358 <Field ExploreByTouchHelper$ExploreByTouchNodeProvider mNodeProvider>
    //    2    4:ifnonnull       20
    //    3    7:aload_0         
    //    4    8:new             #360 <Class ExploreByTouchHelper$ExploreByTouchNodeProvider>
    //    5   11:dup             
    //    6   12:aload_0         
    //    7   13:aconst_null     
    //    8   14:invokespecial   #363 <Method void ExploreByTouchHelper$ExploreByTouchNodeProvider(ExploreByTouchHelper, ExploreByTouchHelper$1)>
    //    9   17:putfield        #358 <Field ExploreByTouchHelper$ExploreByTouchNodeProvider mNodeProvider>
    //   10   20:aload_0         
    //   11   21:getfield        #358 <Field ExploreByTouchHelper$ExploreByTouchNodeProvider mNodeProvider>
    //   12   24:areturn         
    }

    public int getFocusedVirtualView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #52  <Field int mFocusedVirtualViewId>
    //    2    4:ireturn         
    }

    protected abstract int getVirtualViewAt(float f, float f1);

    protected abstract void getVisibleVirtualViews(List list);

    public void invalidateRoot()
    {
    //    0    0:aload_0         
    //    1    1:iconst_m1       
    //    2    2:invokevirtual   #368 <Method void invalidateVirtualView(int)>
    //    3    5:return          
    }

    public void invalidateVirtualView(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:sipush          2048
    //    3    5:invokevirtual   #104 <Method boolean sendEventForVirtualView(int, int)>
    //    4    8:pop             
    //    5    9:return          
    }

    protected abstract boolean onPerformActionForVirtualView(int i, int j, Bundle bundle);

    protected abstract void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityevent);

    protected abstract void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilitynodeinfocompat);

    public boolean sendEventForVirtualView(int i, int j)
    {
    //    0    0:iload_1         
    //    1    1:ldc1            #9   <Int 0x80000000>
    //    2    3:icmpeq          16
    //    3    6:aload_0         
    //    4    7:getfield        #79  <Field AccessibilityManager mManager>
    //    5   10:invokevirtual   #326 <Method boolean AccessibilityManager.isEnabled()>
    //    6   13:ifne            18
    //    7   16:iconst_0        
    //    8   17:ireturn         
    //    9   18:aload_0         
    //   10   19:getfield        #63  <Field View mView>
    //   11   22:invokevirtual   #288 <Method android.view.ViewParent View.getParent()>
    //   12   25:astore_3        
    //   13   26:aload_3         
    //   14   27:ifnull          16
    //   15   30:aload_0         
    //   16   31:iload_1         
    //   17   32:iload_2         
    //   18   33:invokespecial   #370 <Method AccessibilityEvent createEvent(int, int)>
    //   19   36:astore          4
    //   20   38:aload_3         
    //   21   39:aload_0         
    //   22   40:getfield        #63  <Field View mView>
    //   23   43:aload           4
    //   24   45:invokestatic    #376 <Method boolean ViewParentCompat.requestSendAccessibilityEvent(android.view.ViewParent, View, AccessibilityEvent)>
    //   25   48:ireturn         
    }

    private static final String DEFAULT_CLASS_NAME;
    public static final int INVALID_ID = 0x80000000;
    private int mFocusedVirtualViewId;
    private int mHoveredVirtualViewId;
    private final AccessibilityManager mManager;
    private ExploreByTouchNodeProvider mNodeProvider;
    private final int mTempGlobalRect[];
    private final Rect mTempParentRect;
    private final Rect mTempScreenRect;
    private final Rect mTempVisibleRect;
    private final View mView;

    static AccessibilityNodeInfoCompat access$100(ExploreByTouchHelper explorebytouchhelper, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #85  <Method AccessibilityNodeInfoCompat createNode(int)>
    //    3    5:areturn         
    }

    static boolean access$200(ExploreByTouchHelper explorebytouchhelper, int i, int j, Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:aload_3         
    //    4    4:invokespecial   #91  <Method boolean performAction(int, int, Bundle)>
    //    5    7:ireturn         
    }

    // Unreferenced inner class android/support/v4/widget/ExploreByTouchHelper$1

/* anonymous class */
    static class _cls1
    {
    }

}
