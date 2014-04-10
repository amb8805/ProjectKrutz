// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.widget;

import android.view.View;
import android.widget.ListView;

// Referenced classes of package android.support.v4.widget:
//            AutoScrollHelper

public class ListViewAutoScrollHelper extends AutoScrollHelper
{

    public ListViewAutoScrollHelper(ListView listview)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #11  <Method void AutoScrollHelper(View)>
    //    3    5:aload_0         
    //    4    6:aload_1         
    //    5    7:putfield        #13  <Field ListView mTarget>
    //    6   10:return          
    }

    public boolean canTargetScrollHorizontally(int i)
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public boolean canTargetScrollVertically(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #13  <Field ListView mTarget>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:invokevirtual   #22  <Method int ListView.getCount()>
    //    5    9:istore_3        
    //    6   10:aload_2         
    //    7   11:invokevirtual   #25  <Method int ListView.getChildCount()>
    //    8   14:istore          4
    //    9   16:aload_2         
    //   10   17:invokevirtual   #28  <Method int ListView.getFirstVisiblePosition()>
    //   11   20:istore          5
    //   12   22:iload           5
    //   13   24:iload           4
    //   14   26:iadd            
    //   15   27:istore          6
    //   16   29:iload_1         
    //   17   30:ifle            59
    //   18   33:iload           6
    //   19   35:iload_3         
    //   20   36:icmplt          79
    //   21   39:aload_2         
    //   22   40:iload           4
    //   23   42:iconst_1        
    //   24   43:isub            
    //   25   44:invokevirtual   #32  <Method View ListView.getChildAt(int)>
    //   26   47:invokevirtual   #37  <Method int View.getBottom()>
    //   27   50:aload_2         
    //   28   51:invokevirtual   #40  <Method int ListView.getHeight()>
    //   29   54:icmpgt          79
    //   30   57:iconst_0        
    //   31   58:ireturn         
    //   32   59:iload_1         
    //   33   60:ifge            57
    //   34   63:iload           5
    //   35   65:ifgt            79
    //   36   68:aload_2         
    //   37   69:iconst_0        
    //   38   70:invokevirtual   #32  <Method View ListView.getChildAt(int)>
    //   39   73:invokevirtual   #43  <Method int View.getTop()>
    //   40   76:ifge            57
    //   41   79:iconst_1        
    //   42   80:ireturn         
    }

    public void scrollTargetBy(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #13  <Field ListView mTarget>
    //    2    4:astore_3        
    //    3    5:aload_3         
    //    4    6:invokevirtual   #28  <Method int ListView.getFirstVisiblePosition()>
    //    5    9:istore          4
    //    6   11:iload           4
    //    7   13:iconst_m1       
    //    8   14:icmpne          18
    //    9   17:return          
    //   10   18:aload_3         
    //   11   19:iconst_0        
    //   12   20:invokevirtual   #32  <Method View ListView.getChildAt(int)>
    //   13   23:astore          5
    //   14   25:aload           5
    //   15   27:ifnull          17
    //   16   30:aload_3         
    //   17   31:iload           4
    //   18   33:aload           5
    //   19   35:invokevirtual   #43  <Method int View.getTop()>
    //   20   38:iload_2         
    //   21   39:isub            
    //   22   40:invokevirtual   #48  <Method void ListView.setSelectionFromTop(int, int)>
    //   23   43:return          
    }

    private final ListView mTarget;
}
