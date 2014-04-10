// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.widget;

import android.content.Context;
import android.view.View;
import android.widget.SearchView;

class SearchViewCompatIcs
{
    public static class MySearchView extends SearchView
    {

        public MySearchView(Context context)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #8   <Method void SearchView(Context)>
        //    3    5:return          
        }

        public void onActionViewCollapsed()
        {
        //    0    0:aload_0         
        //    1    1:ldc1            #12  <String "">
        //    2    3:iconst_0        
        //    3    4:invokevirtual   #16  <Method void setQuery(CharSequence, boolean)>
        //    4    7:aload_0         
        //    5    8:invokespecial   #18  <Method void SearchView.onActionViewCollapsed()>
        //    6   11:return          
        }
    }


    SearchViewCompatIcs()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static View newSearchView(Context context)
    {
    //    0    0:new             #12  <Class SearchViewCompatIcs$MySearchView>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #15  <Method void SearchViewCompatIcs$MySearchView(Context)>
    //    4    8:areturn         
    }

    public static void setImeOptions(View view, int i)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #19  <Class SearchView>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #22  <Method void SearchView.setImeOptions(int)>
    //    4    8:return          
    }

    public static void setInputType(View view, int i)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #19  <Class SearchView>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #25  <Method void SearchView.setInputType(int)>
    //    4    8:return          
    }
}
