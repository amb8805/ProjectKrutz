// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.widget;

import android.content.ComponentName;
import android.content.Context;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            SearchViewCompatHoneycomb, SearchViewCompatIcs

public class SearchViewCompat
{
    public static abstract class OnCloseListenerCompat
    {

        public OnCloseListenerCompat()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:invokestatic    #16  <Method SearchViewCompat$SearchViewCompatImpl SearchViewCompat.access$000()>
        //    4    8:aload_0         
        //    5    9:invokeinterface #22  <Method Object SearchViewCompat$SearchViewCompatImpl.newOnCloseListener(SearchViewCompat$OnCloseListenerCompat)>
        //    6   14:putfield        #24  <Field Object mListener>
        //    7   17:return          
        }

        public boolean onClose()
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        final Object mListener;
    }

    public static abstract class OnQueryTextListenerCompat
    {

        public OnQueryTextListenerCompat()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:invokestatic    #16  <Method SearchViewCompat$SearchViewCompatImpl SearchViewCompat.access$000()>
        //    4    8:aload_0         
        //    5    9:invokeinterface #22  <Method Object SearchViewCompat$SearchViewCompatImpl.newOnQueryTextListener(SearchViewCompat$OnQueryTextListenerCompat)>
        //    6   14:putfield        #24  <Field Object mListener>
        //    7   17:return          
        }

        public boolean onQueryTextChange(String s)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public boolean onQueryTextSubmit(String s)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        final Object mListener;
    }

    static class SearchViewCompatHoneycombImpl extends SearchViewCompatStubImpl
    {

        SearchViewCompatHoneycombImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void SearchViewCompat$SearchViewCompatStubImpl()>
        //    2    4:return          
        }

        public CharSequence getQuery(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #14  <Method CharSequence SearchViewCompatHoneycomb.getQuery(View)>
        //    2    4:areturn         
        }

        public boolean isIconified(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #18  <Method boolean SearchViewCompatHoneycomb.isIconified(View)>
        //    2    4:ireturn         
        }

        public boolean isQueryRefinementEnabled(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #21  <Method boolean SearchViewCompatHoneycomb.isQueryRefinementEnabled(View)>
        //    2    4:ireturn         
        }

        public boolean isSubmitButtonEnabled(View view)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #24  <Method boolean SearchViewCompatHoneycomb.isSubmitButtonEnabled(View)>
        //    2    4:ireturn         
        }

        public Object newOnCloseListener(OnCloseListenerCompat oncloselistenercompat)
        {
        //    0    0:new             #28  <Class SearchViewCompat$SearchViewCompatHoneycombImpl$2>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:invokespecial   #31  <Method void SearchViewCompat$SearchViewCompatHoneycombImpl$2(SearchViewCompat$SearchViewCompatHoneycombImpl, SearchViewCompat$OnCloseListenerCompat)>
        //    5    9:invokestatic    #34  <Method Object SearchViewCompatHoneycomb.newOnCloseListener(SearchViewCompatHoneycomb$OnCloseListenerCompatBridge)>
        //    6   12:areturn         
        }

        public Object newOnQueryTextListener(OnQueryTextListenerCompat onquerytextlistenercompat)
        {
        //    0    0:new             #38  <Class SearchViewCompat$SearchViewCompatHoneycombImpl$1>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:invokespecial   #41  <Method void SearchViewCompat$SearchViewCompatHoneycombImpl$1(SearchViewCompat$SearchViewCompatHoneycombImpl, SearchViewCompat$OnQueryTextListenerCompat)>
        //    5    9:invokestatic    #44  <Method Object SearchViewCompatHoneycomb.newOnQueryTextListener(SearchViewCompatHoneycomb$OnQueryTextListenerCompatBridge)>
        //    6   12:areturn         
        }

        public View newSearchView(Context context)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #48  <Method View SearchViewCompatHoneycomb.newSearchView(Context)>
        //    2    4:areturn         
        }

        public void setIconified(View view, boolean flag)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #52  <Method void SearchViewCompatHoneycomb.setIconified(View, boolean)>
        //    3    5:return          
        }

        public void setMaxWidth(View view, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #56  <Method void SearchViewCompatHoneycomb.setMaxWidth(View, int)>
        //    3    5:return          
        }

        public void setOnCloseListener(Object obj, Object obj1)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokestatic    #60  <Method void SearchViewCompatHoneycomb.setOnCloseListener(Object, Object)>
        //    3    5:return          
        }

        public void setOnQueryTextListener(Object obj, Object obj1)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokestatic    #63  <Method void SearchViewCompatHoneycomb.setOnQueryTextListener(Object, Object)>
        //    3    5:return          
        }

        public void setQuery(View view, CharSequence charsequence, boolean flag)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:iload_3         
        //    3    3:invokestatic    #67  <Method void SearchViewCompatHoneycomb.setQuery(View, CharSequence, boolean)>
        //    4    6:return          
        }

        public void setQueryHint(View view, CharSequence charsequence)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokestatic    #71  <Method void SearchViewCompatHoneycomb.setQueryHint(View, CharSequence)>
        //    3    5:return          
        }

        public void setQueryRefinementEnabled(View view, boolean flag)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #74  <Method void SearchViewCompatHoneycomb.setQueryRefinementEnabled(View, boolean)>
        //    3    5:return          
        }

        public void setSearchableInfo(View view, ComponentName componentname)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokestatic    #78  <Method void SearchViewCompatHoneycomb.setSearchableInfo(View, ComponentName)>
        //    3    5:return          
        }

        public void setSubmitButtonEnabled(View view, boolean flag)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #81  <Method void SearchViewCompatHoneycomb.setSubmitButtonEnabled(View, boolean)>
        //    3    5:return          
        }
    }

    static class SearchViewCompatIcsImpl extends SearchViewCompatHoneycombImpl
    {

        SearchViewCompatIcsImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void SearchViewCompat$SearchViewCompatHoneycombImpl()>
        //    2    4:return          
        }

        public View newSearchView(Context context)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #14  <Method View SearchViewCompatIcs.newSearchView(Context)>
        //    2    4:areturn         
        }

        public void setImeOptions(View view, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #18  <Method void SearchViewCompatIcs.setImeOptions(View, int)>
        //    3    5:return          
        }

        public void setInputType(View view, int i)
        {
        //    0    0:aload_1         
        //    1    1:iload_2         
        //    2    2:invokestatic    #21  <Method void SearchViewCompatIcs.setInputType(View, int)>
        //    3    5:return          
        }
    }

    static interface SearchViewCompatImpl
    {

        public abstract CharSequence getQuery(View view);

        public abstract boolean isIconified(View view);

        public abstract boolean isQueryRefinementEnabled(View view);

        public abstract boolean isSubmitButtonEnabled(View view);

        public abstract Object newOnCloseListener(OnCloseListenerCompat oncloselistenercompat);

        public abstract Object newOnQueryTextListener(OnQueryTextListenerCompat onquerytextlistenercompat);

        public abstract View newSearchView(Context context);

        public abstract void setIconified(View view, boolean flag);

        public abstract void setImeOptions(View view, int i);

        public abstract void setInputType(View view, int i);

        public abstract void setMaxWidth(View view, int i);

        public abstract void setOnCloseListener(Object obj, Object obj1);

        public abstract void setOnQueryTextListener(Object obj, Object obj1);

        public abstract void setQuery(View view, CharSequence charsequence, boolean flag);

        public abstract void setQueryHint(View view, CharSequence charsequence);

        public abstract void setQueryRefinementEnabled(View view, boolean flag);

        public abstract void setSearchableInfo(View view, ComponentName componentname);

        public abstract void setSubmitButtonEnabled(View view, boolean flag);
    }

    static class SearchViewCompatStubImpl
        implements SearchViewCompatImpl
    {

        SearchViewCompatStubImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public CharSequence getQuery(View view)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }

        public boolean isIconified(View view)
        {
        //    0    0:iconst_1        
        //    1    1:ireturn         
        }

        public boolean isQueryRefinementEnabled(View view)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public boolean isSubmitButtonEnabled(View view)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public Object newOnCloseListener(OnCloseListenerCompat oncloselistenercompat)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }

        public Object newOnQueryTextListener(OnQueryTextListenerCompat onquerytextlistenercompat)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }

        public View newSearchView(Context context)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }

        public void setIconified(View view, boolean flag)
        {
        //    0    0:return          
        }

        public void setImeOptions(View view, int i)
        {
        //    0    0:return          
        }

        public void setInputType(View view, int i)
        {
        //    0    0:return          
        }

        public void setMaxWidth(View view, int i)
        {
        //    0    0:return          
        }

        public void setOnCloseListener(Object obj, Object obj1)
        {
        //    0    0:return          
        }

        public void setOnQueryTextListener(Object obj, Object obj1)
        {
        //    0    0:return          
        }

        public void setQuery(View view, CharSequence charsequence, boolean flag)
        {
        //    0    0:return          
        }

        public void setQueryHint(View view, CharSequence charsequence)
        {
        //    0    0:return          
        }

        public void setQueryRefinementEnabled(View view, boolean flag)
        {
        //    0    0:return          
        }

        public void setSearchableInfo(View view, ComponentName componentname)
        {
        //    0    0:return          
        }

        public void setSubmitButtonEnabled(View view, boolean flag)
        {
        //    0    0:return          
        }
    }


    static 
    {
    //    0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          14
    //    2    5:icmplt          19
    //    3    8:new             #16  <Class SearchViewCompat$SearchViewCompatIcsImpl>
    //    4   11:dup             
    //    5   12:invokespecial   #19  <Method void SearchViewCompat$SearchViewCompatIcsImpl()>
    //    6   15:putstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //    7   18:return          
    //    8   19:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
    //    9   22:bipush          11
    //   10   24:icmplt          38
    //   11   27:new             #23  <Class SearchViewCompat$SearchViewCompatHoneycombImpl>
    //   12   30:dup             
    //   13   31:invokespecial   #24  <Method void SearchViewCompat$SearchViewCompatHoneycombImpl()>
    //   14   34:putstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //   15   37:return          
    //   16   38:new             #26  <Class SearchViewCompat$SearchViewCompatStubImpl>
    //   17   41:dup             
    //   18   42:invokespecial   #27  <Method void SearchViewCompat$SearchViewCompatStubImpl()>
    //   19   45:putstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //   20   48:return          
    }

    private SearchViewCompat(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #29  <Method void Object()>
    //    2    4:return          
    }

    static SearchViewCompatImpl access$000()
    {
    //    0    0:getstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //    3    3:areturn         
    }

    public static CharSequence getQuery(View view)
    {
    //    0    0:getstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #37  <Method CharSequence SearchViewCompat$SearchViewCompatImpl.getQuery(View)>
    //    3    9:areturn         
    }

    public static boolean isIconified(View view)
    {
    //    0    0:getstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #41  <Method boolean SearchViewCompat$SearchViewCompatImpl.isIconified(View)>
    //    3    9:ireturn         
    }

    public static boolean isQueryRefinementEnabled(View view)
    {
    //    0    0:getstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #44  <Method boolean SearchViewCompat$SearchViewCompatImpl.isQueryRefinementEnabled(View)>
    //    3    9:ireturn         
    }

    public static boolean isSubmitButtonEnabled(View view)
    {
    //    0    0:getstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #47  <Method boolean SearchViewCompat$SearchViewCompatImpl.isSubmitButtonEnabled(View)>
    //    3    9:ireturn         
    }

    public static View newSearchView(Context context)
    {
    //    0    0:getstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #51  <Method View SearchViewCompat$SearchViewCompatImpl.newSearchView(Context)>
    //    3    9:areturn         
    }

    public static void setIconified(View view, boolean flag)
    {
    //    0    0:getstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #55  <Method void SearchViewCompat$SearchViewCompatImpl.setIconified(View, boolean)>
    //    4   10:return          
    }

    public static void setImeOptions(View view, int i)
    {
    //    0    0:getstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #59  <Method void SearchViewCompat$SearchViewCompatImpl.setImeOptions(View, int)>
    //    4   10:return          
    }

    public static void setInputType(View view, int i)
    {
    //    0    0:getstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #62  <Method void SearchViewCompat$SearchViewCompatImpl.setInputType(View, int)>
    //    4   10:return          
    }

    public static void setMaxWidth(View view, int i)
    {
    //    0    0:getstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #65  <Method void SearchViewCompat$SearchViewCompatImpl.setMaxWidth(View, int)>
    //    4   10:return          
    }

    public static void setOnCloseListener(View view, OnCloseListenerCompat oncloselistenercompat)
    {
    //    0    0:getstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:getfield        #73  <Field Object SearchViewCompat$OnCloseListenerCompat.mListener>
    //    4    8:invokeinterface #76  <Method void SearchViewCompat$SearchViewCompatImpl.setOnCloseListener(Object, Object)>
    //    5   13:return          
    }

    public static void setOnQueryTextListener(View view, OnQueryTextListenerCompat onquerytextlistenercompat)
    {
    //    0    0:getstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:getfield        #81  <Field Object SearchViewCompat$OnQueryTextListenerCompat.mListener>
    //    4    8:invokeinterface #83  <Method void SearchViewCompat$SearchViewCompatImpl.setOnQueryTextListener(Object, Object)>
    //    5   13:return          
    }

    public static void setQuery(View view, CharSequence charsequence, boolean flag)
    {
    //    0    0:getstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:iload_2         
    //    4    6:invokeinterface #87  <Method void SearchViewCompat$SearchViewCompatImpl.setQuery(View, CharSequence, boolean)>
    //    5   11:return          
    }

    public static void setQueryHint(View view, CharSequence charsequence)
    {
    //    0    0:getstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:invokeinterface #91  <Method void SearchViewCompat$SearchViewCompatImpl.setQueryHint(View, CharSequence)>
    //    4   10:return          
    }

    public static void setQueryRefinementEnabled(View view, boolean flag)
    {
    //    0    0:getstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #94  <Method void SearchViewCompat$SearchViewCompatImpl.setQueryRefinementEnabled(View, boolean)>
    //    4   10:return          
    }

    public static void setSearchableInfo(View view, ComponentName componentname)
    {
    //    0    0:getstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:invokeinterface #98  <Method void SearchViewCompat$SearchViewCompatImpl.setSearchableInfo(View, ComponentName)>
    //    4   10:return          
    }

    public static void setSubmitButtonEnabled(View view, boolean flag)
    {
    //    0    0:getstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:iload_1         
    //    3    5:invokeinterface #101 <Method void SearchViewCompat$SearchViewCompatImpl.setSubmitButtonEnabled(View, boolean)>
    //    4   10:return          
    }

    private static final SearchViewCompatImpl IMPL;

    static SearchViewCompatImpl access$000()
    {
    //    0    0:getstatic       #21  <Field SearchViewCompat$SearchViewCompatImpl IMPL>
    //    1    3:areturn         
    }

    // Unreferenced inner class android/support/v4/widget/SearchViewCompat$SearchViewCompatHoneycombImpl$1

/* anonymous class */
    class SearchViewCompatHoneycombImpl._cls1
        implements SearchViewCompatHoneycomb.OnQueryTextListenerCompatBridge
    {

        SearchViewCompatHoneycombImpl._cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field SearchViewCompat$SearchViewCompatHoneycombImpl this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field SearchViewCompat$OnQueryTextListenerCompat val$listener>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public boolean onQueryTextChange(String s)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field SearchViewCompat$OnQueryTextListenerCompat val$listener>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #30  <Method boolean SearchViewCompat$OnQueryTextListenerCompat.onQueryTextChange(String)>
        //    4    8:ireturn         
        }

        public boolean onQueryTextSubmit(String s)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field SearchViewCompat$OnQueryTextListenerCompat val$listener>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #33  <Method boolean SearchViewCompat$OnQueryTextListenerCompat.onQueryTextSubmit(String)>
        //    4    8:ireturn         
        }

        final SearchViewCompatHoneycombImpl this$0;
        final OnQueryTextListenerCompat val$listener;
    }


    // Unreferenced inner class android/support/v4/widget/SearchViewCompat$SearchViewCompatHoneycombImpl$2

/* anonymous class */
    class SearchViewCompatHoneycombImpl._cls2
        implements SearchViewCompatHoneycomb.OnCloseListenerCompatBridge
    {

        SearchViewCompatHoneycombImpl._cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field SearchViewCompat$SearchViewCompatHoneycombImpl this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field SearchViewCompat$OnCloseListenerCompat val$listener>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public boolean onClose()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field SearchViewCompat$OnCloseListenerCompat val$listener>
        //    2    4:invokevirtual   #30  <Method boolean SearchViewCompat$OnCloseListenerCompat.onClose()>
        //    3    7:ireturn         
        }

        final SearchViewCompatHoneycombImpl this$0;
        final OnCloseListenerCompat val$listener;
    }

}
