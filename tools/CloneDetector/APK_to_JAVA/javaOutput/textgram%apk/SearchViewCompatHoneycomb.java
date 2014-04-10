// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.widget;

import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.view.View;
import android.widget.SearchView;

class SearchViewCompatHoneycomb
{
    static interface OnCloseListenerCompatBridge
    {

        public abstract boolean onClose();
    }

    static interface OnQueryTextListenerCompatBridge
    {

        public abstract boolean onQueryTextChange(String s);

        public abstract boolean onQueryTextSubmit(String s);
    }


    SearchViewCompatHoneycomb()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static CharSequence getQuery(View view)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class SearchView>
    //    2    4:invokevirtual   #15  <Method CharSequence SearchView.getQuery()>
    //    3    7:areturn         
    }

    public static boolean isIconified(View view)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class SearchView>
    //    2    4:invokevirtual   #20  <Method boolean SearchView.isIconified()>
    //    3    7:ireturn         
    }

    public static boolean isQueryRefinementEnabled(View view)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class SearchView>
    //    2    4:invokevirtual   #23  <Method boolean SearchView.isQueryRefinementEnabled()>
    //    3    7:ireturn         
    }

    public static boolean isSubmitButtonEnabled(View view)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class SearchView>
    //    2    4:invokevirtual   #26  <Method boolean SearchView.isSubmitButtonEnabled()>
    //    3    7:ireturn         
    }

    public static Object newOnCloseListener(OnCloseListenerCompatBridge oncloselistenercompatbridge)
    {
    //    0    0:new             #30  <Class SearchViewCompatHoneycomb$2>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #33  <Method void SearchViewCompatHoneycomb$2(SearchViewCompatHoneycomb$OnCloseListenerCompatBridge)>
    //    4    8:areturn         
    }

    public static Object newOnQueryTextListener(OnQueryTextListenerCompatBridge onquerytextlistenercompatbridge)
    {
    //    0    0:new             #37  <Class SearchViewCompatHoneycomb$1>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #40  <Method void SearchViewCompatHoneycomb$1(SearchViewCompatHoneycomb$OnQueryTextListenerCompatBridge)>
    //    4    8:areturn         
    }

    public static View newSearchView(Context context)
    {
    //    0    0:new             #12  <Class SearchView>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #45  <Method void SearchView(Context)>
    //    4    8:areturn         
    }

    public static void setIconified(View view, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class SearchView>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #50  <Method void SearchView.setIconified(boolean)>
    //    4    8:return          
    }

    public static void setMaxWidth(View view, int i)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class SearchView>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #55  <Method void SearchView.setMaxWidth(int)>
    //    4    8:return          
    }

    public static void setOnCloseListener(Object obj, Object obj1)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class SearchView>
    //    2    4:aload_1         
    //    3    5:checkcast       #59  <Class android.widget.SearchView$OnCloseListener>
    //    4    8:invokevirtual   #62  <Method void SearchView.setOnCloseListener(android.widget.SearchView$OnCloseListener)>
    //    5   11:return          
    }

    public static void setOnQueryTextListener(Object obj, Object obj1)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class SearchView>
    //    2    4:aload_1         
    //    3    5:checkcast       #65  <Class android.widget.SearchView$OnQueryTextListener>
    //    4    8:invokevirtual   #68  <Method void SearchView.setOnQueryTextListener(android.widget.SearchView$OnQueryTextListener)>
    //    5   11:return          
    }

    public static void setQuery(View view, CharSequence charsequence, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class SearchView>
    //    2    4:aload_1         
    //    3    5:iload_2         
    //    4    6:invokevirtual   #73  <Method void SearchView.setQuery(CharSequence, boolean)>
    //    5    9:return          
    }

    public static void setQueryHint(View view, CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class SearchView>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #78  <Method void SearchView.setQueryHint(CharSequence)>
    //    4    8:return          
    }

    public static void setQueryRefinementEnabled(View view, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class SearchView>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #81  <Method void SearchView.setQueryRefinementEnabled(boolean)>
    //    4    8:return          
    }

    public static void setSearchableInfo(View view, ComponentName componentname)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class SearchView>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:aload_2         
    //    5    7:invokevirtual   #87  <Method Context SearchView.getContext()>
    //    6   10:ldc1            #89  <String "search">
    //    7   12:invokevirtual   #95  <Method Object Context.getSystemService(String)>
    //    8   15:checkcast       #97  <Class SearchManager>
    //    9   18:aload_1         
    //   10   19:invokevirtual   #101 <Method android.app.SearchableInfo SearchManager.getSearchableInfo(ComponentName)>
    //   11   22:invokevirtual   #104 <Method void SearchView.setSearchableInfo(android.app.SearchableInfo)>
    //   12   25:return          
    }

    public static void setSubmitButtonEnabled(View view, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:checkcast       #12  <Class SearchView>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #107 <Method void SearchView.setSubmitButtonEnabled(boolean)>
    //    4    8:return          
    }

    // Unreferenced inner class android/support/v4/widget/SearchViewCompatHoneycomb$1

/* anonymous class */
    static final class _cls1
        implements android.widget.SearchView.OnQueryTextListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field SearchViewCompatHoneycomb$OnQueryTextListenerCompatBridge val$listener>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public boolean onQueryTextChange(String s)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field SearchViewCompatHoneycomb$OnQueryTextListenerCompatBridge val$listener>
        //    2    4:aload_1         
        //    3    5:invokeinterface #26  <Method boolean SearchViewCompatHoneycomb$OnQueryTextListenerCompatBridge.onQueryTextChange(String)>
        //    4   10:ireturn         
        }

        public boolean onQueryTextSubmit(String s)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field SearchViewCompatHoneycomb$OnQueryTextListenerCompatBridge val$listener>
        //    2    4:aload_1         
        //    3    5:invokeinterface #29  <Method boolean SearchViewCompatHoneycomb$OnQueryTextListenerCompatBridge.onQueryTextSubmit(String)>
        //    4   10:ireturn         
        }

        final OnQueryTextListenerCompatBridge val$listener;
    }


    // Unreferenced inner class android/support/v4/widget/SearchViewCompatHoneycomb$2

/* anonymous class */
    static final class _cls2
        implements android.widget.SearchView.OnCloseListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field SearchViewCompatHoneycomb$OnCloseListenerCompatBridge val$listener>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public boolean onClose()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field SearchViewCompatHoneycomb$OnCloseListenerCompatBridge val$listener>
        //    2    4:invokeinterface #26  <Method boolean SearchViewCompatHoneycomb$OnCloseListenerCompatBridge.onClose()>
        //    3    9:ireturn         
        }

        final OnCloseListenerCompatBridge val$listener;
    }

}
