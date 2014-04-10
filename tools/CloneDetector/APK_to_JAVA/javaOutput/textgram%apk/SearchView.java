// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.*;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.view.KeyEventCompat;
import android.support.v4.widget.CursorAdapter;
import android.support.v7.view.CollapsibleActionView;
import android.text.*;
import android.text.style.ImageSpan;
import android.util.*;
import android.view.*;
import android.view.inputmethod.InputMethodManager;
import android.widget.*;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v7.widget:
//            SuggestionsAdapter

public class SearchView extends LinearLayout
    implements CollapsibleActionView
{
    private static class AutoCompleteTextViewReflector
    {

        AutoCompleteTextViewReflector()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #15  <Method void Object()>
        // try 4 27 handler(s) 136
        //    2    4:aload_0         
        //    3    5:ldc1            #17  <Class AutoCompleteTextView>
        //    4    7:ldc1            #18  <String "doBeforeTextChanged">
        //    5    9:iconst_0        
        //    6   10:anewarray       Class[]
        //    7   13:invokevirtual   #24  <Method Method Class.getDeclaredMethod(String, Class[])>
        //    8   16:putfield        #26  <Field Method doBeforeTextChanged>
        //    9   19:aload_0         
        //   10   20:getfield        #26  <Field Method doBeforeTextChanged>
        //   11   23:iconst_1        
        //   12   24:invokevirtual   #32  <Method void Method.setAccessible(boolean)>
        // try 27 50 handler(s) 132
        //   13   27:aload_0         
        //   14   28:ldc1            #17  <Class AutoCompleteTextView>
        //   15   30:ldc1            #33  <String "doAfterTextChanged">
        //   16   32:iconst_0        
        //   17   33:anewarray       Class[]
        //   18   36:invokevirtual   #24  <Method Method Class.getDeclaredMethod(String, Class[])>
        //   19   39:putfield        #35  <Field Method doAfterTextChanged>
        //   20   42:aload_0         
        //   21   43:getfield        #35  <Field Method doAfterTextChanged>
        //   22   46:iconst_1        
        //   23   47:invokevirtual   #32  <Method void Method.setAccessible(boolean)>
        // try 50 84 handler(s) 128
        //   24   50:iconst_1        
        //   25   51:anewarray       Class[]
        //   26   54:astore          6
        //   27   56:aload           6
        //   28   58:iconst_0        
        //   29   59:getstatic       #41  <Field Class Boolean.TYPE>
        //   30   62:aastore         
        //   31   63:aload_0         
        //   32   64:ldc1            #17  <Class AutoCompleteTextView>
        //   33   66:ldc1            #42  <String "ensureImeVisible">
        //   34   68:aload           6
        //   35   70:invokevirtual   #45  <Method Method Class.getMethod(String, Class[])>
        //   36   73:putfield        #47  <Field Method ensureImeVisible>
        //   37   76:aload_0         
        //   38   77:getfield        #47  <Field Method ensureImeVisible>
        //   39   80:iconst_1        
        //   40   81:invokevirtual   #32  <Method void Method.setAccessible(boolean)>
        // try 84 124 handler(s) 125
        //   41   84:iconst_2        
        //   42   85:anewarray       Class[]
        //   43   88:astore          5
        //   44   90:aload           5
        //   45   92:iconst_0        
        //   46   93:getstatic       #50  <Field Class Integer.TYPE>
        //   47   96:aastore         
        //   48   97:aload           5
        //   49   99:iconst_1        
        //   50  100:ldc1            #52  <Class ResultReceiver>
        //   51  102:aastore         
        //   52  103:aload_0         
        //   53  104:ldc1            #54  <Class InputMethodManager>
        //   54  106:ldc1            #55  <String "showSoftInputUnchecked">
        //   55  108:aload           5
        //   56  110:invokevirtual   #45  <Method Method Class.getMethod(String, Class[])>
        //   57  113:putfield        #57  <Field Method showSoftInputUnchecked>
        //   58  116:aload_0         
        //   59  117:getfield        #57  <Field Method showSoftInputUnchecked>
        //   60  120:iconst_1        
        //   61  121:invokevirtual   #32  <Method void Method.setAccessible(boolean)>
        //   62  124:return          
        // catch NoSuchMethodException
        //   63  125:astore          4
        //   64  127:return          
        // catch NoSuchMethodException
        //   65  128:astore_3        
        //   66  129:goto            84
        // catch NoSuchMethodException
        //   67  132:astore_2        
        //   68  133:goto            50
        // catch NoSuchMethodException
        //   69  136:astore_1        
        //   70  137:goto            27
        }

        void doAfterTextChanged(AutoCompleteTextView autocompletetextview)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #35  <Field Method doAfterTextChanged>
        //    2    4:ifnull          20
        // try 7 20 handler(s) 21
        //    3    7:aload_0         
        //    4    8:getfield        #35  <Field Method doAfterTextChanged>
        //    5   11:aload_1         
        //    6   12:iconst_0        
        //    7   13:anewarray       Object[]
        //    8   16:invokevirtual   #64  <Method Object Method.invoke(Object, Object[])>
        //    9   19:pop             
        //   10   20:return          
        // catch Exception
        //   11   21:astore_2        
        //   12   22:return          
        }

        void doBeforeTextChanged(AutoCompleteTextView autocompletetextview)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #26  <Field Method doBeforeTextChanged>
        //    2    4:ifnull          20
        // try 7 20 handler(s) 21
        //    3    7:aload_0         
        //    4    8:getfield        #26  <Field Method doBeforeTextChanged>
        //    5   11:aload_1         
        //    6   12:iconst_0        
        //    7   13:anewarray       Object[]
        //    8   16:invokevirtual   #64  <Method Object Method.invoke(Object, Object[])>
        //    9   19:pop             
        //   10   20:return          
        // catch Exception
        //   11   21:astore_2        
        //   12   22:return          
        }

        void ensureImeVisible(AutoCompleteTextView autocompletetextview, boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #47  <Field Method ensureImeVisible>
        //    2    4:ifnull          36
        // try 7 36 handler(s) 37
        //    3    7:aload_0         
        //    4    8:getfield        #47  <Field Method ensureImeVisible>
        //    5   11:astore          4
        //    6   13:iconst_1        
        //    7   14:anewarray       Object[]
        //    8   17:astore          5
        //    9   19:aload           5
        //   10   21:iconst_0        
        //   11   22:iload_2         
        //   12   23:invokestatic    #69  <Method Boolean Boolean.valueOf(boolean)>
        //   13   26:aastore         
        //   14   27:aload           4
        //   15   29:aload_1         
        //   16   30:aload           5
        //   17   32:invokevirtual   #64  <Method Object Method.invoke(Object, Object[])>
        //   18   35:pop             
        //   19   36:return          
        // catch Exception
        //   20   37:astore_3        
        //   21   38:return          
        }

        void showSoftInputUnchecked(InputMethodManager inputmethodmanager, View view, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #57  <Field Method showSoftInputUnchecked>
        //    2    4:ifnull          44
        // try 7 41 handler(s) 42
        //    3    7:aload_0         
        //    4    8:getfield        #57  <Field Method showSoftInputUnchecked>
        //    5   11:astore          6
        //    6   13:iconst_2        
        //    7   14:anewarray       Object[]
        //    8   17:astore          7
        //    9   19:aload           7
        //   10   21:iconst_0        
        //   11   22:iload_3         
        //   12   23:invokestatic    #73  <Method Integer Integer.valueOf(int)>
        //   13   26:aastore         
        //   14   27:aload           7
        //   15   29:iconst_1        
        //   16   30:aconst_null     
        //   17   31:aastore         
        //   18   32:aload           6
        //   19   34:aload_1         
        //   20   35:aload           7
        //   21   37:invokevirtual   #64  <Method Object Method.invoke(Object, Object[])>
        //   22   40:pop             
        //   23   41:return          
        // catch Exception
        //   24   42:astore          5
        //   25   44:aload_1         
        //   26   45:aload_2         
        //   27   46:iload_3         
        //   28   47:invokevirtual   #77  <Method boolean InputMethodManager.showSoftInput(View, int)>
        //   29   50:pop             
        //   30   51:return          
        }

        private Method doAfterTextChanged;
        private Method doBeforeTextChanged;
        private Method ensureImeVisible;
        private Method showSoftInputUnchecked;
    }

    public static interface OnCloseListener
    {

        public abstract boolean onClose();
    }

    public static interface OnQueryTextListener
    {

        public abstract boolean onQueryTextChange(String s);

        public abstract boolean onQueryTextSubmit(String s);
    }

    public static interface OnSuggestionListener
    {

        public abstract boolean onSuggestionClick(int i);

        public abstract boolean onSuggestionSelect(int i);
    }

    public static class SearchAutoComplete extends AutoCompleteTextView
    {

        public SearchAutoComplete(Context context)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #12  <Method void AutoCompleteTextView(Context)>
        //    3    5:aload_0         
        //    4    6:aload_0         
        //    5    7:invokevirtual   #16  <Method int getThreshold()>
        //    6   10:putfield        #18  <Field int mThreshold>
        //    7   13:return          
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:invokespecial   #21  <Method void AutoCompleteTextView(Context, AttributeSet)>
        //    4    6:aload_0         
        //    5    7:aload_0         
        //    6    8:invokevirtual   #16  <Method int getThreshold()>
        //    7   11:putfield        #18  <Field int mThreshold>
        //    8   14:return          
        }

        public SearchAutoComplete(Context context, AttributeSet attributeset, int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:iload_3         
        //    4    4:invokespecial   #24  <Method void AutoCompleteTextView(Context, AttributeSet, int)>
        //    5    7:aload_0         
        //    6    8:aload_0         
        //    7    9:invokevirtual   #16  <Method int getThreshold()>
        //    8   12:putfield        #18  <Field int mThreshold>
        //    9   15:return          
        }

        static boolean access$1600(SearchAutoComplete searchautocomplete)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #30  <Method boolean isEmpty()>
        //    2    4:ireturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:invokespecial   #30  <Method boolean isEmpty()>
        //    5    4:ireturn         
        }

        private boolean isEmpty()
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #34  <Method Editable getText()>
        //    2    4:invokestatic    #40  <Method int TextUtils.getTrimmedLength(CharSequence)>
        //    3    7:ifne            12
        //    4   10:iconst_1        
        //    5   11:ireturn         
        //    6   12:iconst_0        
        //    7   13:ireturn         
        }

        public boolean enoughToFilter()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #18  <Field int mThreshold>
        //    2    4:ifle            14
        //    3    7:aload_0         
        //    4    8:invokespecial   #43  <Method boolean AutoCompleteTextView.enoughToFilter()>
        //    5   11:ifeq            16
        //    6   14:iconst_1        
        //    7   15:ireturn         
        //    8   16:iconst_0        
        //    9   17:ireturn         
        }

        protected void onFocusChanged(boolean flag, int i, Rect rect)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:iload_2         
        //    3    3:aload_3         
        //    4    4:invokespecial   #47  <Method void AutoCompleteTextView.onFocusChanged(boolean, int, Rect)>
        //    5    7:aload_0         
        //    6    8:getfield        #49  <Field SearchView mSearchView>
        //    7   11:invokevirtual   #55  <Method void SearchView.onTextFocusChanged()>
        //    8   14:return          
        }

        public boolean onKeyPreIme(int i, KeyEvent keyevent)
        {
        //    0    0:iload_1         
        //    1    1:iconst_4        
        //    2    2:icmpne          92
        //    3    5:aload_2         
        //    4    6:invokevirtual   #62  <Method int KeyEvent.getAction()>
        //    5    9:ifne            39
        //    6   12:aload_2         
        //    7   13:invokevirtual   #65  <Method int KeyEvent.getRepeatCount()>
        //    8   16:ifne            39
        //    9   19:aload_0         
        //   10   20:invokevirtual   #69  <Method android.view.KeyEvent$DispatcherState getKeyDispatcherState()>
        //   11   23:astore          4
        //   12   25:aload           4
        //   13   27:ifnull          37
        //   14   30:aload           4
        //   15   32:aload_2         
        //   16   33:aload_0         
        //   17   34:invokevirtual   #75  <Method void android.view.KeyEvent$DispatcherState.startTracking(KeyEvent, Object)>
        //   18   37:iconst_1        
        //   19   38:ireturn         
        //   20   39:aload_2         
        //   21   40:invokevirtual   #62  <Method int KeyEvent.getAction()>
        //   22   43:iconst_1        
        //   23   44:icmpne          92
        //   24   47:aload_0         
        //   25   48:invokevirtual   #69  <Method android.view.KeyEvent$DispatcherState getKeyDispatcherState()>
        //   26   51:astore_3        
        //   27   52:aload_3         
        //   28   53:ifnull          61
        //   29   56:aload_3         
        //   30   57:aload_2         
        //   31   58:invokevirtual   #79  <Method void android.view.KeyEvent$DispatcherState.handleUpEvent(KeyEvent)>
        //   32   61:aload_2         
        //   33   62:invokevirtual   #82  <Method boolean KeyEvent.isTracking()>
        //   34   65:ifeq            92
        //   35   68:aload_2         
        //   36   69:invokevirtual   #85  <Method boolean KeyEvent.isCanceled()>
        //   37   72:ifne            92
        //   38   75:aload_0         
        //   39   76:getfield        #49  <Field SearchView mSearchView>
        //   40   79:invokevirtual   #88  <Method void SearchView.clearFocus()>
        //   41   82:aload_0         
        //   42   83:getfield        #49  <Field SearchView mSearchView>
        //   43   86:iconst_0        
        //   44   87:invokestatic    #92  <Method void SearchView.access$2100(SearchView, boolean)>
        //   45   90:iconst_1        
        //   46   91:ireturn         
        //   47   92:aload_0         
        //   48   93:iload_1         
        //   49   94:aload_2         
        //   50   95:invokespecial   #94  <Method boolean AutoCompleteTextView.onKeyPreIme(int, KeyEvent)>
        //   51   98:ireturn         
        }

        public void onWindowFocusChanged(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:invokespecial   #98  <Method void AutoCompleteTextView.onWindowFocusChanged(boolean)>
        //    3    5:iload_1         
        //    4    6:ifeq            62
        //    5    9:aload_0         
        //    6   10:getfield        #49  <Field SearchView mSearchView>
        //    7   13:invokevirtual   #101 <Method boolean SearchView.hasFocus()>
        //    8   16:ifeq            62
        //    9   19:aload_0         
        //   10   20:invokevirtual   #104 <Method int getVisibility()>
        //   11   23:ifne            62
        //   12   26:aload_0         
        //   13   27:invokevirtual   #108 <Method Context getContext()>
        //   14   30:ldc1            #110 <String "input_method">
        //   15   32:invokevirtual   #116 <Method Object Context.getSystemService(String)>
        //   16   35:checkcast       #118 <Class InputMethodManager>
        //   17   38:aload_0         
        //   18   39:iconst_0        
        //   19   40:invokevirtual   #122 <Method boolean InputMethodManager.showSoftInput(View, int)>
        //   20   43:pop             
        //   21   44:aload_0         
        //   22   45:invokevirtual   #108 <Method Context getContext()>
        //   23   48:invokestatic    #126 <Method boolean SearchView.isLandscapeMode(Context)>
        //   24   51:ifeq            62
        //   25   54:getstatic       #130 <Field SearchView$AutoCompleteTextViewReflector SearchView.HIDDEN_METHOD_INVOKER>
        //   26   57:aload_0         
        //   27   58:iconst_1        
        //   28   59:invokevirtual   #136 <Method void SearchView$AutoCompleteTextViewReflector.ensureImeVisible(AutoCompleteTextView, boolean)>
        //   29   62:return          
        }

        public void performCompletion()
        {
        //    0    0:return          
        }

        protected void replaceText(CharSequence charsequence)
        {
        //    0    0:return          
        }

        void setSearchView(SearchView searchview)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #49  <Field SearchView mSearchView>
        //    3    5:return          
        }

        public void setThreshold(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:invokespecial   #145 <Method void AutoCompleteTextView.setThreshold(int)>
        //    3    5:aload_0         
        //    4    6:iload_1         
        //    5    7:putfield        #18  <Field int mThreshold>
        //    6   10:return          
        }

        private SearchView mSearchView;
        private int mThreshold;

        static boolean access$1600(SearchAutoComplete searchautocomplete)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #30  <Method boolean isEmpty()>
        //    2    4:ireturn         
        }
    }


    static 
    {
    //    0    0:new             #86  <Class SearchView$AutoCompleteTextViewReflector>
    //    1    3:dup             
    //    2    4:invokespecial   #89  <Method void SearchView$AutoCompleteTextViewReflector()>
    //    3    7:putstatic       #91  <Field SearchView$AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER>
    //    4   10:return          
    }

    public SearchView(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #95  <Method void SearchView(Context, AttributeSet)>
    //    4    6:return          
    }

    public SearchView(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #96  <Method void LinearLayout(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:new             #98  <Class SearchView$1>
    //    6   10:dup             
    //    7   11:aload_0         
    //    8   12:invokespecial   #101 <Method void SearchView$1(SearchView)>
    //    9   15:putfield        #103 <Field Runnable mShowImeRunnable>
    //   10   18:aload_0         
    //   11   19:new             #105 <Class SearchView$2>
    //   12   22:dup             
    //   13   23:aload_0         
    //   14   24:invokespecial   #106 <Method void SearchView$2(SearchView)>
    //   15   27:putfield        #108 <Field Runnable mUpdateDrawableStateRunnable>
    //   16   30:aload_0         
    //   17   31:new             #110 <Class SearchView$3>
    //   18   34:dup             
    //   19   35:aload_0         
    //   20   36:invokespecial   #111 <Method void SearchView$3(SearchView)>
    //   21   39:putfield        #113 <Field Runnable mReleaseCursorRunnable>
    //   22   42:aload_0         
    //   23   43:new             #115 <Class WeakHashMap>
    //   24   46:dup             
    //   25   47:invokespecial   #116 <Method void WeakHashMap()>
    //   26   50:putfield        #118 <Field WeakHashMap mOutsideDrawablesCache>
    //   27   53:aload_0         
    //   28   54:new             #120 <Class SearchView$7>
    //   29   57:dup             
    //   30   58:aload_0         
    //   31   59:invokespecial   #121 <Method void SearchView$7(SearchView)>
    //   32   62:putfield        #123 <Field android.view.View$OnClickListener mOnClickListener>
    //   33   65:aload_0         
    //   34   66:new             #125 <Class SearchView$8>
    //   35   69:dup             
    //   36   70:aload_0         
    //   37   71:invokespecial   #126 <Method void SearchView$8(SearchView)>
    //   38   74:putfield        #128 <Field android.view.View$OnKeyListener mTextKeyListener>
    //   39   77:aload_0         
    //   40   78:new             #130 <Class SearchView$9>
    //   41   81:dup             
    //   42   82:aload_0         
    //   43   83:invokespecial   #131 <Method void SearchView$9(SearchView)>
    //   44   86:putfield        #133 <Field android.widget.TextView$OnEditorActionListener mOnEditorActionListener>
    //   45   89:aload_0         
    //   46   90:new             #135 <Class SearchView$10>
    //   47   93:dup             
    //   48   94:aload_0         
    //   49   95:invokespecial   #136 <Method void SearchView$10(SearchView)>
    //   50   98:putfield        #138 <Field android.widget.AdapterView$OnItemClickListener mOnItemClickListener>
    //   51  101:aload_0         
    //   52  102:new             #140 <Class SearchView$11>
    //   53  105:dup             
    //   54  106:aload_0         
    //   55  107:invokespecial   #141 <Method void SearchView$11(SearchView)>
    //   56  110:putfield        #143 <Field android.widget.AdapterView$OnItemSelectedListener mOnItemSelectedListener>
    //   57  113:aload_0         
    //   58  114:new             #145 <Class SearchView$12>
    //   59  117:dup             
    //   60  118:aload_0         
    //   61  119:invokespecial   #146 <Method void SearchView$12(SearchView)>
    //   62  122:putfield        #148 <Field TextWatcher mTextWatcher>
    //   63  125:aload_1         
    //   64  126:ldc1            #150 <String "layout_inflater">
    //   65  128:invokevirtual   #156 <Method Object Context.getSystemService(String)>
    //   66  131:checkcast       #158 <Class LayoutInflater>
    //   67  134:getstatic       #163 <Field int android.support.v7.appcompat.R$layout.abc_search_view>
    //   68  137:aload_0         
    //   69  138:iconst_1        
    //   70  139:invokevirtual   #167 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
    //   71  142:pop             
    //   72  143:aload_0         
    //   73  144:aload_0         
    //   74  145:getstatic       #172 <Field int android.support.v7.appcompat.R$id.search_button>
    //   75  148:invokevirtual   #176 <Method View findViewById(int)>
    //   76  151:putfield        #178 <Field View mSearchButton>
    //   77  154:aload_0         
    //   78  155:aload_0         
    //   79  156:getstatic       #181 <Field int android.support.v7.appcompat.R$id.search_src_text>
    //   80  159:invokevirtual   #176 <Method View findViewById(int)>
    //   81  162:checkcast       #183 <Class SearchView$SearchAutoComplete>
    //   82  165:putfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   83  168:aload_0         
    //   84  169:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   85  172:aload_0         
    //   86  173:invokevirtual   #188 <Method void SearchView$SearchAutoComplete.setSearchView(SearchView)>
    //   87  176:aload_0         
    //   88  177:aload_0         
    //   89  178:getstatic       #191 <Field int android.support.v7.appcompat.R$id.search_edit_frame>
    //   90  181:invokevirtual   #176 <Method View findViewById(int)>
    //   91  184:putfield        #193 <Field View mSearchEditFrame>
    //   92  187:aload_0         
    //   93  188:aload_0         
    //   94  189:getstatic       #196 <Field int android.support.v7.appcompat.R$id.search_plate>
    //   95  192:invokevirtual   #176 <Method View findViewById(int)>
    //   96  195:putfield        #198 <Field View mSearchPlate>
    //   97  198:aload_0         
    //   98  199:aload_0         
    //   99  200:getstatic       #201 <Field int android.support.v7.appcompat.R$id.submit_area>
    //  100  203:invokevirtual   #176 <Method View findViewById(int)>
    //  101  206:putfield        #203 <Field View mSubmitArea>
    //  102  209:aload_0         
    //  103  210:aload_0         
    //  104  211:getstatic       #206 <Field int android.support.v7.appcompat.R$id.search_go_btn>
    //  105  214:invokevirtual   #176 <Method View findViewById(int)>
    //  106  217:putfield        #208 <Field View mSubmitButton>
    //  107  220:aload_0         
    //  108  221:aload_0         
    //  109  222:getstatic       #211 <Field int android.support.v7.appcompat.R$id.search_close_btn>
    //  110  225:invokevirtual   #176 <Method View findViewById(int)>
    //  111  228:checkcast       #213 <Class ImageView>
    //  112  231:putfield        #215 <Field ImageView mCloseButton>
    //  113  234:aload_0         
    //  114  235:aload_0         
    //  115  236:getstatic       #218 <Field int android.support.v7.appcompat.R$id.search_voice_btn>
    //  116  239:invokevirtual   #176 <Method View findViewById(int)>
    //  117  242:putfield        #220 <Field View mVoiceButton>
    //  118  245:aload_0         
    //  119  246:aload_0         
    //  120  247:getstatic       #223 <Field int android.support.v7.appcompat.R$id.search_mag_icon>
    //  121  250:invokevirtual   #176 <Method View findViewById(int)>
    //  122  253:checkcast       #213 <Class ImageView>
    //  123  256:putfield        #225 <Field ImageView mSearchHintIcon>
    //  124  259:aload_0         
    //  125  260:getfield        #178 <Field View mSearchButton>
    //  126  263:aload_0         
    //  127  264:getfield        #123 <Field android.view.View$OnClickListener mOnClickListener>
    //  128  267:invokevirtual   #231 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
    //  129  270:aload_0         
    //  130  271:getfield        #215 <Field ImageView mCloseButton>
    //  131  274:aload_0         
    //  132  275:getfield        #123 <Field android.view.View$OnClickListener mOnClickListener>
    //  133  278:invokevirtual   #232 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
    //  134  281:aload_0         
    //  135  282:getfield        #208 <Field View mSubmitButton>
    //  136  285:aload_0         
    //  137  286:getfield        #123 <Field android.view.View$OnClickListener mOnClickListener>
    //  138  289:invokevirtual   #231 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
    //  139  292:aload_0         
    //  140  293:getfield        #220 <Field View mVoiceButton>
    //  141  296:aload_0         
    //  142  297:getfield        #123 <Field android.view.View$OnClickListener mOnClickListener>
    //  143  300:invokevirtual   #231 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
    //  144  303:aload_0         
    //  145  304:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //  146  307:aload_0         
    //  147  308:getfield        #123 <Field android.view.View$OnClickListener mOnClickListener>
    //  148  311:invokevirtual   #233 <Method void SearchView$SearchAutoComplete.setOnClickListener(android.view.View$OnClickListener)>
    //  149  314:aload_0         
    //  150  315:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //  151  318:aload_0         
    //  152  319:getfield        #148 <Field TextWatcher mTextWatcher>
    //  153  322:invokevirtual   #237 <Method void SearchView$SearchAutoComplete.addTextChangedListener(TextWatcher)>
    //  154  325:aload_0         
    //  155  326:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //  156  329:aload_0         
    //  157  330:getfield        #133 <Field android.widget.TextView$OnEditorActionListener mOnEditorActionListener>
    //  158  333:invokevirtual   #241 <Method void SearchView$SearchAutoComplete.setOnEditorActionListener(android.widget.TextView$OnEditorActionListener)>
    //  159  336:aload_0         
    //  160  337:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //  161  340:aload_0         
    //  162  341:getfield        #138 <Field android.widget.AdapterView$OnItemClickListener mOnItemClickListener>
    //  163  344:invokevirtual   #245 <Method void SearchView$SearchAutoComplete.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
    //  164  347:aload_0         
    //  165  348:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //  166  351:aload_0         
    //  167  352:getfield        #143 <Field android.widget.AdapterView$OnItemSelectedListener mOnItemSelectedListener>
    //  168  355:invokevirtual   #249 <Method void SearchView$SearchAutoComplete.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
    //  169  358:aload_0         
    //  170  359:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //  171  362:aload_0         
    //  172  363:getfield        #128 <Field android.view.View$OnKeyListener mTextKeyListener>
    //  173  366:invokevirtual   #253 <Method void SearchView$SearchAutoComplete.setOnKeyListener(android.view.View$OnKeyListener)>
    //  174  369:aload_0         
    //  175  370:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //  176  373:new             #255 <Class SearchView$4>
    //  177  376:dup             
    //  178  377:aload_0         
    //  179  378:invokespecial   #256 <Method void SearchView$4(SearchView)>
    //  180  381:invokevirtual   #260 <Method void SearchView$SearchAutoComplete.setOnFocusChangeListener(android.view.View$OnFocusChangeListener)>
    //  181  384:aload_1         
    //  182  385:aload_2         
    //  183  386:getstatic       #265 <Field int[] android.support.v7.appcompat.R$styleable.SearchView>
    //  184  389:iconst_0        
    //  185  390:iconst_0        
    //  186  391:invokevirtual   #269 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
    //  187  394:astore          4
    //  188  396:aload_0         
    //  189  397:aload           4
    //  190  399:iconst_3        
    //  191  400:iconst_1        
    //  192  401:invokevirtual   #275 <Method boolean TypedArray.getBoolean(int, boolean)>
    //  193  404:invokevirtual   #279 <Method void setIconifiedByDefault(boolean)>
    //  194  407:aload           4
    //  195  409:iconst_0        
    //  196  410:iconst_m1       
    //  197  411:invokevirtual   #283 <Method int TypedArray.getDimensionPixelSize(int, int)>
    //  198  414:istore          5
    //  199  416:iload           5
    //  200  418:iconst_m1       
    //  201  419:icmpeq          428
    //  202  422:aload_0         
    //  203  423:iload           5
    //  204  425:invokevirtual   #287 <Method void setMaxWidth(int)>
    //  205  428:aload           4
    //  206  430:iconst_4        
    //  207  431:invokevirtual   #291 <Method CharSequence TypedArray.getText(int)>
    //  208  434:astore          6
    //  209  436:aload           6
    //  210  438:invokestatic    #297 <Method boolean TextUtils.isEmpty(CharSequence)>
    //  211  441:ifne            450
    //  212  444:aload_0         
    //  213  445:aload           6
    //  214  447:invokevirtual   #301 <Method void setQueryHint(CharSequence)>
    //  215  450:aload           4
    //  216  452:iconst_2        
    //  217  453:iconst_m1       
    //  218  454:invokevirtual   #304 <Method int TypedArray.getInt(int, int)>
    //  219  457:istore          7
    //  220  459:iload           7
    //  221  461:iconst_m1       
    //  222  462:icmpeq          471
    //  223  465:aload_0         
    //  224  466:iload           7
    //  225  468:invokevirtual   #307 <Method void setImeOptions(int)>
    //  226  471:aload           4
    //  227  473:iconst_1        
    //  228  474:iconst_m1       
    //  229  475:invokevirtual   #304 <Method int TypedArray.getInt(int, int)>
    //  230  478:istore          8
    //  231  480:iload           8
    //  232  482:iconst_m1       
    //  233  483:icmpeq          492
    //  234  486:aload_0         
    //  235  487:iload           8
    //  236  489:invokevirtual   #310 <Method void setInputType(int)>
    //  237  492:aload           4
    //  238  494:invokevirtual   #313 <Method void TypedArray.recycle()>
    //  239  497:aload_1         
    //  240  498:aload_2         
    //  241  499:getstatic       #316 <Field int[] android.support.v7.appcompat.R$styleable.View>
    //  242  502:iconst_0        
    //  243  503:iconst_0        
    //  244  504:invokevirtual   #269 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
    //  245  507:astore          9
    //  246  509:aload           9
    //  247  511:iconst_0        
    //  248  512:iconst_1        
    //  249  513:invokevirtual   #275 <Method boolean TypedArray.getBoolean(int, boolean)>
    //  250  516:istore          10
    //  251  518:aload           9
    //  252  520:invokevirtual   #313 <Method void TypedArray.recycle()>
    //  253  523:aload_0         
    //  254  524:iload           10
    //  255  526:invokevirtual   #319 <Method void setFocusable(boolean)>
    //  256  529:aload_0         
    //  257  530:new             #321 <Class Intent>
    //  258  533:dup             
    //  259  534:ldc2            #323 <String "android.speech.action.WEB_SEARCH">
    //  260  537:invokespecial   #326 <Method void Intent(String)>
    //  261  540:putfield        #328 <Field Intent mVoiceWebSearchIntent>
    //  262  543:aload_0         
    //  263  544:getfield        #328 <Field Intent mVoiceWebSearchIntent>
    //  264  547:ldc2            #329 <Int 0x10000000>
    //  265  550:invokevirtual   #333 <Method Intent Intent.addFlags(int)>
    //  266  553:pop             
    //  267  554:aload_0         
    //  268  555:getfield        #328 <Field Intent mVoiceWebSearchIntent>
    //  269  558:ldc2            #335 <String "android.speech.extra.LANGUAGE_MODEL">
    //  270  561:ldc2            #337 <String "web_search">
    //  271  564:invokevirtual   #341 <Method Intent Intent.putExtra(String, String)>
    //  272  567:pop             
    //  273  568:aload_0         
    //  274  569:new             #321 <Class Intent>
    //  275  572:dup             
    //  276  573:ldc2            #343 <String "android.speech.action.RECOGNIZE_SPEECH">
    //  277  576:invokespecial   #326 <Method void Intent(String)>
    //  278  579:putfield        #345 <Field Intent mVoiceAppSearchIntent>
    //  279  582:aload_0         
    //  280  583:getfield        #345 <Field Intent mVoiceAppSearchIntent>
    //  281  586:ldc2            #329 <Int 0x10000000>
    //  282  589:invokevirtual   #333 <Method Intent Intent.addFlags(int)>
    //  283  592:pop             
    //  284  593:aload_0         
    //  285  594:aload_0         
    //  286  595:aload_0         
    //  287  596:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //  288  599:invokevirtual   #349 <Method int SearchView$SearchAutoComplete.getDropDownAnchor()>
    //  289  602:invokevirtual   #176 <Method View findViewById(int)>
    //  290  605:putfield        #351 <Field View mDropDownAnchor>
    //  291  608:aload_0         
    //  292  609:getfield        #351 <Field View mDropDownAnchor>
    //  293  612:ifnull          627
    //  294  615:getstatic       #356 <Field int android.os.Build$VERSION.SDK_INT>
    //  295  618:bipush          11
    //  296  620:icmplt          640
    //  297  623:aload_0         
    //  298  624:invokespecial   #359 <Method void addOnLayoutChangeListenerToDropDownAnchorSDK11()>
    //  299  627:aload_0         
    //  300  628:aload_0         
    //  301  629:getfield        #361 <Field boolean mIconifiedByDefault>
    //  302  632:invokespecial   #364 <Method void updateViewsVisibility(boolean)>
    //  303  635:aload_0         
    //  304  636:invokespecial   #367 <Method void updateQueryHint()>
    //  305  639:return          
    //  306  640:aload_0         
    //  307  641:invokespecial   #370 <Method void addOnLayoutChangeListenerToDropDownAnchorBase()>
    //  308  644:goto            627
    }

    static void access$000(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #374 <Method void updateFocusedState()>
    //    2    4:return          
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #374 <Method void updateFocusedState()>
    //    5    4:return          
    }

    static CursorAdapter access$100(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #378 <Field CursorAdapter mSuggestionsAdapter>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #378 <Field CursorAdapter mSuggestionsAdapter>
    //    5    4:areturn         
    }

    static View access$1000(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #220 <Field View mVoiceButton>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #220 <Field View mVoiceButton>
    //    5    4:areturn         
    }

    static void access$1100(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #384 <Method void onVoiceClicked()>
    //    2    4:return          
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #384 <Method void onVoiceClicked()>
    //    5    4:return          
    }

    static SearchAutoComplete access$1200(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    5    4:areturn         
    }

    static void access$1300(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #390 <Method void forceSuggestionQuery()>
    //    2    4:return          
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #390 <Method void forceSuggestionQuery()>
    //    5    4:return          
    }

    static SearchableInfo access$1400(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #394 <Field SearchableInfo mSearchable>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #394 <Field SearchableInfo mSearchable>
    //    5    4:areturn         
    }

    static boolean access$1500(SearchView searchview, View view, int i, KeyEvent keyevent)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:aload_3         
    //    4    4:invokespecial   #400 <Method boolean onSuggestionsKey(View, int, KeyEvent)>
    //    5    7:ireturn         
// Previous instruction length mismatch
    //    6    0:aload_0         
    //    7    1:aload_1         
    //    8    2:iload_2         
    //    9    3:aload_3         
    //   10    4:invokespecial   #400 <Method boolean onSuggestionsKey(View, int, KeyEvent)>
    //   11    7:ireturn         
    }

    static void access$1700(SearchView searchview, int i, String s, String s1)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:invokespecial   #406 <Method void launchQuerySearch(int, String, String)>
    //    5    7:return          
// Previous instruction length mismatch
    //    6    0:aload_0         
    //    7    1:iload_1         
    //    8    2:aload_2         
    //    9    3:aload_3         
    //   10    4:invokespecial   #406 <Method void launchQuerySearch(int, String, String)>
    //   11    7:return          
    }

    static boolean access$1800(SearchView searchview, int i, int j, String s)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:aload_3         
    //    4    4:invokespecial   #412 <Method boolean onItemClicked(int, int, String)>
    //    5    7:ireturn         
// Previous instruction length mismatch
    //    6    0:aload_0         
    //    7    1:iload_1         
    //    8    2:iload_2         
    //    9    3:aload_3         
    //   10    4:invokespecial   #412 <Method boolean onItemClicked(int, int, String)>
    //   11    7:ireturn         
    }

    static boolean access$1900(SearchView searchview, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #418 <Method boolean onItemSelected(int)>
    //    3    5:ireturn         
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:iload_1         
    //    6    2:invokespecial   #418 <Method boolean onItemSelected(int)>
    //    7    5:ireturn         
    }

    static android.view.View.OnFocusChangeListener access$200(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #422 <Field android.view.View$OnFocusChangeListener mOnQueryTextFocusChangeListener>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #422 <Field android.view.View$OnFocusChangeListener mOnQueryTextFocusChangeListener>
    //    5    4:areturn         
    }

    static void access$2000(SearchView searchview, CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #427 <Method void onTextChanged(CharSequence)>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:aload_1         
    //    6    2:invokespecial   #427 <Method void onTextChanged(CharSequence)>
    //    7    5:return          
    }

    static void access$2100(SearchView searchview, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #432 <Method void setImeVisibility(boolean)>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:iload_1         
    //    6    2:invokespecial   #432 <Method void setImeVisibility(boolean)>
    //    7    5:return          
    }

    static void access$300(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #436 <Method void adjustDropDownSizeAndPosition()>
    //    2    4:return          
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #436 <Method void adjustDropDownSizeAndPosition()>
    //    5    4:return          
    }

    static View access$400(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #178 <Field View mSearchButton>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #178 <Field View mSearchButton>
    //    5    4:areturn         
    }

    static void access$500(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #441 <Method void onSearchClicked()>
    //    2    4:return          
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #441 <Method void onSearchClicked()>
    //    5    4:return          
    }

    static ImageView access$600(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #215 <Field ImageView mCloseButton>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #215 <Field ImageView mCloseButton>
    //    5    4:areturn         
    }

    static void access$700(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #447 <Method void onCloseClicked()>
    //    2    4:return          
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #447 <Method void onCloseClicked()>
    //    5    4:return          
    }

    static View access$800(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #208 <Field View mSubmitButton>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #208 <Field View mSubmitButton>
    //    5    4:areturn         
    }

    static void access$900(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #452 <Method void onSubmitQuery()>
    //    2    4:return          
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #452 <Method void onSubmitQuery()>
    //    5    4:return          
    }

    private void addOnLayoutChangeListenerToDropDownAnchorBase()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #351 <Field View mDropDownAnchor>
    //    2    4:invokevirtual   #456 <Method ViewTreeObserver View.getViewTreeObserver()>
    //    3    7:new             #458 <Class SearchView$6>
    //    4   10:dup             
    //    5   11:aload_0         
    //    6   12:invokespecial   #459 <Method void SearchView$6(SearchView)>
    //    7   15:invokevirtual   #465 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
    //    8   18:return          
    }

    private void addOnLayoutChangeListenerToDropDownAnchorSDK11()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #351 <Field View mDropDownAnchor>
    //    2    4:new             #467 <Class SearchView$5>
    //    3    7:dup             
    //    4    8:aload_0         
    //    5    9:invokespecial   #468 <Method void SearchView$5(SearchView)>
    //    6   12:invokevirtual   #472 <Method void View.addOnLayoutChangeListener(android.view.View$OnLayoutChangeListener)>
    //    7   15:return          
    }

    private void adjustDropDownSizeAndPosition()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #351 <Field View mDropDownAnchor>
    //    2    4:invokevirtual   #475 <Method int View.getWidth()>
    //    3    7:iconst_1        
    //    4    8:icmple          124
    //    5   11:aload_0         
    //    6   12:invokevirtual   #479 <Method Context getContext()>
    //    7   15:invokevirtual   #483 <Method Resources Context.getResources()>
    //    8   18:astore_1        
    //    9   19:aload_0         
    //   10   20:getfield        #198 <Field View mSearchPlate>
    //   11   23:invokevirtual   #486 <Method int View.getPaddingLeft()>
    //   12   26:istore_2        
    //   13   27:new             #488 <Class Rect>
    //   14   30:dup             
    //   15   31:invokespecial   #489 <Method void Rect()>
    //   16   34:astore_3        
    //   17   35:aload_0         
    //   18   36:getfield        #361 <Field boolean mIconifiedByDefault>
    //   19   39:ifeq            125
    //   20   42:aload_1         
    //   21   43:getstatic       #494 <Field int android.support.v7.appcompat.R$dimen.abc_dropdownitem_icon_width>
    //   22   46:invokevirtual   #499 <Method int Resources.getDimensionPixelSize(int)>
    //   23   49:aload_1         
    //   24   50:getstatic       #502 <Field int android.support.v7.appcompat.R$dimen.abc_dropdownitem_text_padding_left>
    //   25   53:invokevirtual   #499 <Method int Resources.getDimensionPixelSize(int)>
    //   26   56:iadd            
    //   27   57:istore          4
    //   28   59:aload_0         
    //   29   60:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   30   63:invokevirtual   #506 <Method Drawable SearchView$SearchAutoComplete.getDropDownBackground()>
    //   31   66:aload_3         
    //   32   67:invokevirtual   #512 <Method boolean Drawable.getPadding(Rect)>
    //   33   70:pop             
    //   34   71:iload_2         
    //   35   72:iload           4
    //   36   74:aload_3         
    //   37   75:getfield        #515 <Field int Rect.left>
    //   38   78:iadd            
    //   39   79:isub            
    //   40   80:istore          6
    //   41   82:aload_0         
    //   42   83:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   43   86:iload           6
    //   44   88:invokevirtual   #518 <Method void SearchView$SearchAutoComplete.setDropDownHorizontalOffset(int)>
    //   45   91:iload           4
    //   46   93:aload_0         
    //   47   94:getfield        #351 <Field View mDropDownAnchor>
    //   48   97:invokevirtual   #475 <Method int View.getWidth()>
    //   49  100:aload_3         
    //   50  101:getfield        #515 <Field int Rect.left>
    //   51  104:iadd            
    //   52  105:aload_3         
    //   53  106:getfield        #521 <Field int Rect.right>
    //   54  109:iadd            
    //   55  110:iadd            
    //   56  111:iload_2         
    //   57  112:isub            
    //   58  113:istore          7
    //   59  115:aload_0         
    //   60  116:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   61  119:iload           7
    //   62  121:invokevirtual   #524 <Method void SearchView$SearchAutoComplete.setDropDownWidth(int)>
    //   63  124:return          
    //   64  125:iconst_0        
    //   65  126:istore          4
    //   66  128:goto            59
    }

    private Intent createIntent(String s, Uri uri, String s1, String s2, int i, String s3)
    {
    //    0    0:new             #321 <Class Intent>
    //    1    3:dup             
    //    2    4:aload_1         
    //    3    5:invokespecial   #326 <Method void Intent(String)>
    //    4    8:astore          7
    //    5   10:aload           7
    //    6   12:ldc2            #329 <Int 0x10000000>
    //    7   15:invokevirtual   #333 <Method Intent Intent.addFlags(int)>
    //    8   18:pop             
    //    9   19:aload_2         
    //   10   20:ifnull          30
    //   11   23:aload           7
    //   12   25:aload_2         
    //   13   26:invokevirtual   #530 <Method Intent Intent.setData(Uri)>
    //   14   29:pop             
    //   15   30:aload           7
    //   16   32:ldc2            #532 <String "user_query">
    //   17   35:aload_0         
    //   18   36:getfield        #534 <Field CharSequence mUserQuery>
    //   19   39:invokevirtual   #537 <Method Intent Intent.putExtra(String, CharSequence)>
    //   20   42:pop             
    //   21   43:aload           4
    //   22   45:ifnull          59
    //   23   48:aload           7
    //   24   50:ldc2            #539 <String "query">
    //   25   53:aload           4
    //   26   55:invokevirtual   #341 <Method Intent Intent.putExtra(String, String)>
    //   27   58:pop             
    //   28   59:aload_3         
    //   29   60:ifnull          73
    //   30   63:aload           7
    //   31   65:ldc2            #541 <String "intent_extra_data_key">
    //   32   68:aload_3         
    //   33   69:invokevirtual   #341 <Method Intent Intent.putExtra(String, String)>
    //   34   72:pop             
    //   35   73:aload_0         
    //   36   74:getfield        #543 <Field Bundle mAppSearchData>
    //   37   77:ifnull          93
    //   38   80:aload           7
    //   39   82:ldc2            #545 <String "app_data">
    //   40   85:aload_0         
    //   41   86:getfield        #543 <Field Bundle mAppSearchData>
    //   42   89:invokevirtual   #548 <Method Intent Intent.putExtra(String, Bundle)>
    //   43   92:pop             
    //   44   93:iload           5
    //   45   95:ifeq            120
    //   46   98:aload           7
    //   47  100:ldc2            #550 <String "action_key">
    //   48  103:iload           5
    //   49  105:invokevirtual   #553 <Method Intent Intent.putExtra(String, int)>
    //   50  108:pop             
    //   51  109:aload           7
    //   52  111:ldc2            #555 <String "action_msg">
    //   53  114:aload           6
    //   54  116:invokevirtual   #341 <Method Intent Intent.putExtra(String, String)>
    //   55  119:pop             
    //   56  120:aload           7
    //   57  122:aload_0         
    //   58  123:getfield        #394 <Field SearchableInfo mSearchable>
    //   59  126:invokevirtual   #561 <Method ComponentName SearchableInfo.getSearchActivity()>
    //   60  129:invokevirtual   #565 <Method Intent Intent.setComponent(ComponentName)>
    //   61  132:pop             
    //   62  133:aload           7
    //   63  135:areturn         
    }

    private Intent createIntentFromSuggestion(Cursor cursor, int i, String s)
    {
    // try 0 9 handler(s) 145
    //    0    0:aload_1         
    //    1    1:ldc2            #571 <String "suggest_intent_action">
    //    2    4:invokestatic    #577 <Method String SuggestionsAdapter.getColumnString(Cursor, String)>
    //    3    7:astore          9
    //    4    9:aload           9
    //    5   11:ifnonnull       204
    // try 14 23 handler(s) 145
    //    6   14:aload_0         
    //    7   15:getfield        #394 <Field SearchableInfo mSearchable>
    //    8   18:invokevirtual   #581 <Method String SearchableInfo.getSuggestIntentAction()>
    //    9   21:astore          9
    //   10   23:goto            204
    // try 26 35 handler(s) 145
    //   11   26:aload_1         
    //   12   27:ldc2            #583 <String "suggest_intent_data">
    //   13   30:invokestatic    #577 <Method String SuggestionsAdapter.getColumnString(Cursor, String)>
    //   14   33:astore          10
    //   15   35:aload           10
    //   16   37:ifnonnull       49
    // try 40 49 handler(s) 145
    //   17   40:aload_0         
    //   18   41:getfield        #394 <Field SearchableInfo mSearchable>
    //   19   44:invokevirtual   #586 <Method String SearchableInfo.getSuggestIntentData()>
    //   20   47:astore          10
    //   21   49:aload           10
    //   22   51:ifnull          217
    // try 54 63 handler(s) 145
    //   23   54:aload_1         
    //   24   55:ldc2            #588 <String "suggest_intent_data_id">
    //   25   58:invokestatic    #577 <Method String SuggestionsAdapter.getColumnString(Cursor, String)>
    //   26   61:astore          11
    //   27   63:aload           11
    //   28   65:ifnull          217
    // try 68 99 handler(s) 145
    //   29   68:new             #590 <Class StringBuilder>
    //   30   71:dup             
    //   31   72:invokespecial   #591 <Method void StringBuilder()>
    //   32   75:aload           10
    //   33   77:invokevirtual   #595 <Method StringBuilder StringBuilder.append(String)>
    //   34   80:ldc2            #597 <String "/">
    //   35   83:invokevirtual   #595 <Method StringBuilder StringBuilder.append(String)>
    //   36   86:aload           11
    //   37   88:invokestatic    #603 <Method String Uri.encode(String)>
    //   38   91:invokevirtual   #595 <Method StringBuilder StringBuilder.append(String)>
    //   39   94:invokevirtual   #606 <Method String StringBuilder.toString()>
    //   40   97:astore          10
    //   41   99:goto            217
    // try 102 131 handler(s) 145
    //   42  102:aload_1         
    //   43  103:ldc2            #608 <String "suggest_intent_query">
    //   44  106:invokestatic    #577 <Method String SuggestionsAdapter.getColumnString(Cursor, String)>
    //   45  109:astore          13
    //   46  111:aload_0         
    //   47  112:aload           9
    //   48  114:aload           12
    //   49  116:aload_1         
    //   50  117:ldc2            #610 <String "suggest_intent_extra_data">
    //   51  120:invokestatic    #577 <Method String SuggestionsAdapter.getColumnString(Cursor, String)>
    //   52  123:aload           13
    //   53  125:iload_2         
    //   54  126:aload_3         
    //   55  127:invokespecial   #612 <Method Intent createIntent(String, Uri, String, String, int, String)>
    //   56  130:areturn         
    // try 131 138 handler(s) 145
    //   57  131:aload           10
    //   58  133:invokestatic    #616 <Method Uri Uri.parse(String)>
    //   59  136:astore          14
    //   60  138:aload           14
    //   61  140:astore          12
    //   62  142:goto            102
    // catch RuntimeException RuntimeException RuntimeException RuntimeException RuntimeException RuntimeException RuntimeException RuntimeException
    //   63  145:astore          4
    // try 147 155 handler(s) 196
    //   64  147:aload_1         
    //   65  148:invokeinterface #621 <Method int Cursor.getPosition()>
    //   66  153:istore          8
    //   67  155:iload           8
    //   68  157:istore          6
    //   69  159:ldc1            #18  <String "SearchView">
    //   70  161:new             #590 <Class StringBuilder>
    //   71  164:dup             
    //   72  165:invokespecial   #591 <Method void StringBuilder()>
    //   73  168:ldc2            #623 <String "Search suggestions cursor at row ">
    //   74  171:invokevirtual   #595 <Method StringBuilder StringBuilder.append(String)>
    //   75  174:iload           6
    //   76  176:invokevirtual   #626 <Method StringBuilder StringBuilder.append(int)>
    //   77  179:ldc2            #628 <String " returned exception.">
    //   78  182:invokevirtual   #595 <Method StringBuilder StringBuilder.append(String)>
    //   79  185:invokevirtual   #606 <Method String StringBuilder.toString()>
    //   80  188:aload           4
    //   81  190:invokestatic    #634 <Method int Log.w(String, String, Throwable)>
    //   82  193:pop             
    //   83  194:aconst_null     
    //   84  195:areturn         
    // catch RuntimeException
    //   85  196:astore          5
    //   86  198:iconst_m1       
    //   87  199:istore          6
    //   88  201:goto            159
    //   89  204:aload           9
    //   90  206:ifnonnull       26
    //   91  209:ldc2            #636 <String "android.intent.action.SEARCH">
    //   92  212:astore          9
    //   93  214:goto            26
    //   94  217:aload           10
    //   95  219:ifnonnull       131
    //   96  222:aconst_null     
    //   97  223:astore          12
    //   98  225:goto            102
    }

    private Intent createVoiceAppSearchIntent(Intent intent, SearchableInfo searchableinfo)
    {
    //    0    0:aload_2         
    //    1    1:invokevirtual   #561 <Method ComponentName SearchableInfo.getSearchActivity()>
    //    2    4:astore_3        
    //    3    5:new             #321 <Class Intent>
    //    4    8:dup             
    //    5    9:ldc2            #636 <String "android.intent.action.SEARCH">
    //    6   12:invokespecial   #326 <Method void Intent(String)>
    //    7   15:astore          4
    //    8   17:aload           4
    //    9   19:aload_3         
    //   10   20:invokevirtual   #565 <Method Intent Intent.setComponent(ComponentName)>
    //   11   23:pop             
    //   12   24:aload_0         
    //   13   25:invokevirtual   #479 <Method Context getContext()>
    //   14   28:iconst_0        
    //   15   29:aload           4
    //   16   31:ldc2            #639 <Int 0x40000000>
    //   17   34:invokestatic    #645 <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
    //   18   37:astore          6
    //   19   39:new             #647 <Class Bundle>
    //   20   42:dup             
    //   21   43:invokespecial   #648 <Method void Bundle()>
    //   22   46:astore          7
    //   23   48:aload_0         
    //   24   49:getfield        #543 <Field Bundle mAppSearchData>
    //   25   52:ifnull          67
    //   26   55:aload           7
    //   27   57:ldc2            #545 <String "app_data">
    //   28   60:aload_0         
    //   29   61:getfield        #543 <Field Bundle mAppSearchData>
    //   30   64:invokevirtual   #652 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
    //   31   67:new             #321 <Class Intent>
    //   32   70:dup             
    //   33   71:aload_1         
    //   34   72:invokespecial   #655 <Method void Intent(Intent)>
    //   35   75:astore          8
    //   36   77:ldc2            #657 <String "free_form">
    //   37   80:astore          9
    //   38   82:iconst_1        
    //   39   83:istore          10
    //   40   85:aload_0         
    //   41   86:invokevirtual   #658 <Method Resources getResources()>
    //   42   89:astore          11
    //   43   91:aload_2         
    //   44   92:invokevirtual   #661 <Method int SearchableInfo.getVoiceLanguageModeId()>
    //   45   95:ifeq            109
    //   46   98:aload           11
    //   47  100:aload_2         
    //   48  101:invokevirtual   #661 <Method int SearchableInfo.getVoiceLanguageModeId()>
    //   49  104:invokevirtual   #665 <Method String Resources.getString(int)>
    //   50  107:astore          9
    //   51  109:aload_2         
    //   52  110:invokevirtual   #668 <Method int SearchableInfo.getVoicePromptTextId()>
    //   53  113:istore          12
    //   54  115:aconst_null     
    //   55  116:astore          13
    //   56  118:iload           12
    //   57  120:ifeq            134
    //   58  123:aload           11
    //   59  125:aload_2         
    //   60  126:invokevirtual   #668 <Method int SearchableInfo.getVoicePromptTextId()>
    //   61  129:invokevirtual   #665 <Method String Resources.getString(int)>
    //   62  132:astore          13
    //   63  134:aload_2         
    //   64  135:invokevirtual   #671 <Method int SearchableInfo.getVoiceLanguageId()>
    //   65  138:istore          14
    //   66  140:aconst_null     
    //   67  141:astore          15
    //   68  143:iload           14
    //   69  145:ifeq            159
    //   70  148:aload           11
    //   71  150:aload_2         
    //   72  151:invokevirtual   #671 <Method int SearchableInfo.getVoiceLanguageId()>
    //   73  154:invokevirtual   #665 <Method String Resources.getString(int)>
    //   74  157:astore          15
    //   75  159:aload_2         
    //   76  160:invokevirtual   #674 <Method int SearchableInfo.getVoiceMaxResults()>
    //   77  163:ifeq            172
    //   78  166:aload_2         
    //   79  167:invokevirtual   #674 <Method int SearchableInfo.getVoiceMaxResults()>
    //   80  170:istore          10
    //   81  172:aload           8
    //   82  174:ldc2            #335 <String "android.speech.extra.LANGUAGE_MODEL">
    //   83  177:aload           9
    //   84  179:invokevirtual   #341 <Method Intent Intent.putExtra(String, String)>
    //   85  182:pop             
    //   86  183:aload           8
    //   87  185:ldc2            #676 <String "android.speech.extra.PROMPT">
    //   88  188:aload           13
    //   89  190:invokevirtual   #341 <Method Intent Intent.putExtra(String, String)>
    //   90  193:pop             
    //   91  194:aload           8
    //   92  196:ldc2            #678 <String "android.speech.extra.LANGUAGE">
    //   93  199:aload           15
    //   94  201:invokevirtual   #341 <Method Intent Intent.putExtra(String, String)>
    //   95  204:pop             
    //   96  205:aload           8
    //   97  207:ldc2            #680 <String "android.speech.extra.MAX_RESULTS">
    //   98  210:iload           10
    //   99  212:invokevirtual   #553 <Method Intent Intent.putExtra(String, int)>
    //  100  215:pop             
    //  101  216:aload_3         
    //  102  217:ifnonnull       259
    //  103  220:aconst_null     
    //  104  221:astore          20
    //  105  223:aload           8
    //  106  225:ldc2            #682 <String "calling_package">
    //  107  228:aload           20
    //  108  230:invokevirtual   #341 <Method Intent Intent.putExtra(String, String)>
    //  109  233:pop             
    //  110  234:aload           8
    //  111  236:ldc2            #684 <String "android.speech.extra.RESULTS_PENDINGINTENT">
    //  112  239:aload           6
    //  113  241:invokevirtual   #687 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
    //  114  244:pop             
    //  115  245:aload           8
    //  116  247:ldc2            #689 <String "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE">
    //  117  250:aload           7
    //  118  252:invokevirtual   #548 <Method Intent Intent.putExtra(String, Bundle)>
    //  119  255:pop             
    //  120  256:aload           8
    //  121  258:areturn         
    //  122  259:aload_3         
    //  123  260:invokevirtual   #694 <Method String ComponentName.flattenToShortString()>
    //  124  263:astore          20
    //  125  265:goto            223
    }

    private Intent createVoiceWebSearchIntent(Intent intent, SearchableInfo searchableinfo)
    {
    //    0    0:new             #321 <Class Intent>
    //    1    3:dup             
    //    2    4:aload_1         
    //    3    5:invokespecial   #655 <Method void Intent(Intent)>
    //    4    8:astore_3        
    //    5    9:aload_2         
    //    6   10:invokevirtual   #561 <Method ComponentName SearchableInfo.getSearchActivity()>
    //    7   13:astore          4
    //    8   15:aload           4
    //    9   17:ifnonnull       35
    //   10   20:aconst_null     
    //   11   21:astore          5
    //   12   23:aload_3         
    //   13   24:ldc2            #682 <String "calling_package">
    //   14   27:aload           5
    //   15   29:invokevirtual   #341 <Method Intent Intent.putExtra(String, String)>
    //   16   32:pop             
    //   17   33:aload_3         
    //   18   34:areturn         
    //   19   35:aload           4
    //   20   37:invokevirtual   #694 <Method String ComponentName.flattenToShortString()>
    //   21   40:astore          5
    //   22   42:goto            23
    }

    private void dismissSuggestions()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    2    4:invokevirtual   #699 <Method void SearchView$SearchAutoComplete.dismissDropDown()>
    //    3    7:return          
    }

    private void forceSuggestionQuery()
    {
    //    0    0:getstatic       #91  <Field SearchView$AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER>
    //    1    3:aload_0         
    //    2    4:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    3    7:invokevirtual   #703 <Method void SearchView$AutoCompleteTextViewReflector.doBeforeTextChanged(AutoCompleteTextView)>
    //    4   10:getstatic       #91  <Field SearchView$AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER>
    //    5   13:aload_0         
    //    6   14:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    7   17:invokevirtual   #706 <Method void SearchView$AutoCompleteTextViewReflector.doAfterTextChanged(AutoCompleteTextView)>
    //    8   20:return          
    }

    private CharSequence getDecoratedHint(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #361 <Field boolean mIconifiedByDefault>
    //    2    4:ifne            9
    //    3    7:aload_1         
    //    4    8:areturn         
    //    5    9:new             #710 <Class SpannableStringBuilder>
    //    6   12:dup             
    //    7   13:ldc2            #712 <String "   ">
    //    8   16:invokespecial   #714 <Method void SpannableStringBuilder(CharSequence)>
    //    9   19:astore_2        
    //   10   20:aload_2         
    //   11   21:aload_1         
    //   12   22:invokevirtual   #717 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
    //   13   25:pop             
    //   14   26:aload_0         
    //   15   27:invokevirtual   #479 <Method Context getContext()>
    //   16   30:invokevirtual   #483 <Method Resources Context.getResources()>
    //   17   33:aload_0         
    //   18   34:invokespecial   #720 <Method int getSearchIconId()>
    //   19   37:invokevirtual   #724 <Method Drawable Resources.getDrawable(int)>
    //   20   40:astore          4
    //   21   42:ldc2w           #725 <Double 1.25D>
    //   22   45:aload_0         
    //   23   46:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   24   49:invokevirtual   #730 <Method float SearchView$SearchAutoComplete.getTextSize()>
    //   25   52:f2d             
    //   26   53:dmul            
    //   27   54:d2i             
    //   28   55:istore          5
    //   29   57:aload           4
    //   30   59:iconst_0        
    //   31   60:iconst_0        
    //   32   61:iload           5
    //   33   63:iload           5
    //   34   65:invokevirtual   #734 <Method void Drawable.setBounds(int, int, int, int)>
    //   35   68:aload_2         
    //   36   69:new             #736 <Class ImageSpan>
    //   37   72:dup             
    //   38   73:aload           4
    //   39   75:invokespecial   #739 <Method void ImageSpan(Drawable)>
    //   40   78:iconst_1        
    //   41   79:iconst_2        
    //   42   80:bipush          33
    //   43   82:invokevirtual   #743 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
    //   44   85:aload_2         
    //   45   86:areturn         
    }

    private int getPreferredWidth()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #479 <Method Context getContext()>
    //    2    4:invokevirtual   #483 <Method Resources Context.getResources()>
    //    3    7:getstatic       #747 <Field int android.support.v7.appcompat.R$dimen.abc_search_view_preferred_width>
    //    4   10:invokevirtual   #499 <Method int Resources.getDimensionPixelSize(int)>
    //    5   13:ireturn         
    }

    private int getSearchIconId()
    {
    //    0    0:new             #749 <Class TypedValue>
    //    1    3:dup             
    //    2    4:invokespecial   #750 <Method void TypedValue()>
    //    3    7:astore_1        
    //    4    8:aload_0         
    //    5    9:invokevirtual   #479 <Method Context getContext()>
    //    6   12:invokevirtual   #754 <Method android.content.res.Resources$Theme Context.getTheme()>
    //    7   15:getstatic       #759 <Field int android.support.v7.appcompat.R$attr.searchViewSearchIcon>
    //    8   18:aload_1         
    //    9   19:iconst_1        
    //   10   20:invokevirtual   #765 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
    //   11   23:pop             
    //   12   24:aload_1         
    //   13   25:getfield        #768 <Field int TypedValue.resourceId>
    //   14   28:ireturn         
    }

    private boolean hasVoiceSearch()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #394 <Field SearchableInfo mSearchable>
    //    2    4:astore_1        
    //    3    5:iconst_0        
    //    4    6:istore_2        
    //    5    7:aload_1         
    //    6    8:ifnull          74
    //    7   11:aload_0         
    //    8   12:getfield        #394 <Field SearchableInfo mSearchable>
    //    9   15:invokevirtual   #773 <Method boolean SearchableInfo.getVoiceSearchEnabled()>
    //   10   18:istore_3        
    //   11   19:iconst_0        
    //   12   20:istore_2        
    //   13   21:iload_3         
    //   14   22:ifeq            74
    //   15   25:aload_0         
    //   16   26:getfield        #394 <Field SearchableInfo mSearchable>
    //   17   29:invokevirtual   #776 <Method boolean SearchableInfo.getVoiceSearchLaunchWebSearch()>
    //   18   32:ifeq            76
    //   19   35:aload_0         
    //   20   36:getfield        #328 <Field Intent mVoiceWebSearchIntent>
    //   21   39:astore          5
    //   22   41:iconst_0        
    //   23   42:istore_2        
    //   24   43:aload           5
    //   25   45:ifnull          74
    //   26   48:aload_0         
    //   27   49:invokevirtual   #479 <Method Context getContext()>
    //   28   52:invokevirtual   #780 <Method PackageManager Context.getPackageManager()>
    //   29   55:aload           5
    //   30   57:ldc2            #781 <Int 0x10000>
    //   31   60:invokevirtual   #787 <Method android.content.pm.ResolveInfo PackageManager.resolveActivity(Intent, int)>
    //   32   63:astore          6
    //   33   65:iconst_0        
    //   34   66:istore_2        
    //   35   67:aload           6
    //   36   69:ifnull          74
    //   37   72:iconst_1        
    //   38   73:istore_2        
    //   39   74:iload_2         
    //   40   75:ireturn         
    //   41   76:aload_0         
    //   42   77:getfield        #394 <Field SearchableInfo mSearchable>
    //   43   80:invokevirtual   #790 <Method boolean SearchableInfo.getVoiceSearchLaunchRecognizer()>
    //   44   83:istore          4
    //   45   85:aconst_null     
    //   46   86:astore          5
    //   47   88:iload           4
    //   48   90:ifeq            41
    //   49   93:aload_0         
    //   50   94:getfield        #345 <Field Intent mVoiceAppSearchIntent>
    //   51   97:astore          5
    //   52   99:goto            41
    }

    static boolean isLandscapeMode(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #483 <Method Resources Context.getResources()>
    //    2    4:invokevirtual   #796 <Method Configuration Resources.getConfiguration()>
    //    3    7:getfield        #801 <Field int Configuration.orientation>
    //    4   10:iconst_2        
    //    5   11:icmpne          16
    //    6   14:iconst_1        
    //    7   15:ireturn         
    //    8   16:iconst_0        
    //    9   17:ireturn         
    }

    private boolean isSubmitAreaEnabled()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #804 <Field boolean mSubmitButtonEnabled>
    //    2    4:ifne            14
    //    3    7:aload_0         
    //    4    8:getfield        #806 <Field boolean mVoiceButtonEnabled>
    //    5   11:ifeq            23
    //    6   14:aload_0         
    //    7   15:invokevirtual   #809 <Method boolean isIconified()>
    //    8   18:ifne            23
    //    9   21:iconst_1        
    //   10   22:ireturn         
    //   11   23:iconst_0        
    //   12   24:ireturn         
    }

    private void launchIntent(Intent intent)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       5
    //    2    4:return          
    // try 5 13 handler(s) 14
    //    3    5:aload_0         
    //    4    6:invokevirtual   #479 <Method Context getContext()>
    //    5    9:aload_1         
    //    6   10:invokevirtual   #813 <Method void Context.startActivity(Intent)>
    //    7   13:return          
    // catch RuntimeException
    //    8   14:astore_2        
    //    9   15:ldc1            #18  <String "SearchView">
    //   10   17:new             #590 <Class StringBuilder>
    //   11   20:dup             
    //   12   21:invokespecial   #591 <Method void StringBuilder()>
    //   13   24:ldc2            #815 <String "Failed launch activity: ">
    //   14   27:invokevirtual   #595 <Method StringBuilder StringBuilder.append(String)>
    //   15   30:aload_1         
    //   16   31:invokevirtual   #818 <Method StringBuilder StringBuilder.append(Object)>
    //   17   34:invokevirtual   #606 <Method String StringBuilder.toString()>
    //   18   37:aload_2         
    //   19   38:invokestatic    #821 <Method int Log.e(String, String, Throwable)>
    //   20   41:pop             
    //   21   42:return          
    }

    private void launchQuerySearch(int i, String s, String s1)
    {
    //    0    0:aload_0         
    //    1    1:ldc2            #636 <String "android.intent.action.SEARCH">
    //    2    4:aconst_null     
    //    3    5:aconst_null     
    //    4    6:aload_3         
    //    5    7:iload_1         
    //    6    8:aload_2         
    //    7    9:invokespecial   #612 <Method Intent createIntent(String, Uri, String, String, int, String)>
    //    8   12:astore          4
    //    9   14:aload_0         
    //   10   15:invokevirtual   #479 <Method Context getContext()>
    //   11   18:aload           4
    //   12   20:invokevirtual   #813 <Method void Context.startActivity(Intent)>
    //   13   23:return          
    }

    private boolean launchSuggestion(int i, int j, String s)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #378 <Field CursorAdapter mSuggestionsAdapter>
    //    2    4:invokevirtual   #828 <Method Cursor CursorAdapter.getCursor()>
    //    3    7:astore          4
    //    4    9:aload           4
    //    5   11:ifnull          39
    //    6   14:aload           4
    //    7   16:iload_1         
    //    8   17:invokeinterface #831 <Method boolean Cursor.moveToPosition(int)>
    //    9   22:ifeq            39
    //   10   25:aload_0         
    //   11   26:aload_0         
    //   12   27:aload           4
    //   13   29:iload_2         
    //   14   30:aload_3         
    //   15   31:invokespecial   #833 <Method Intent createIntentFromSuggestion(Cursor, int, String)>
    //   16   34:invokespecial   #835 <Method void launchIntent(Intent)>
    //   17   37:iconst_1        
    //   18   38:ireturn         
    //   19   39:iconst_0        
    //   20   40:ireturn         
    }

    private void onCloseClicked()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    2    4:invokevirtual   #838 <Method Editable SearchView$SearchAutoComplete.getText()>
    //    3    7:invokestatic    #297 <Method boolean TextUtils.isEmpty(CharSequence)>
    //    4   10:ifeq            49
    //    5   13:aload_0         
    //    6   14:getfield        #361 <Field boolean mIconifiedByDefault>
    //    7   17:ifeq            48
    //    8   20:aload_0         
    //    9   21:getfield        #840 <Field SearchView$OnCloseListener mOnCloseListener>
    //   10   24:ifnull          39
    //   11   27:aload_0         
    //   12   28:getfield        #840 <Field SearchView$OnCloseListener mOnCloseListener>
    //   13   31:invokeinterface #845 <Method boolean SearchView$OnCloseListener.onClose()>
    //   14   36:ifne            48
    //   15   39:aload_0         
    //   16   40:invokevirtual   #848 <Method void clearFocus()>
    //   17   43:aload_0         
    //   18   44:iconst_1        
    //   19   45:invokespecial   #364 <Method void updateViewsVisibility(boolean)>
    //   20   48:return          
    //   21   49:aload_0         
    //   22   50:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   23   53:ldc2            #850 <String "">
    //   24   56:invokevirtual   #853 <Method void SearchView$SearchAutoComplete.setText(CharSequence)>
    //   25   59:aload_0         
    //   26   60:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   27   63:invokevirtual   #856 <Method boolean SearchView$SearchAutoComplete.requestFocus()>
    //   28   66:pop             
    //   29   67:aload_0         
    //   30   68:iconst_1        
    //   31   69:invokespecial   #432 <Method void setImeVisibility(boolean)>
    //   32   72:return          
    }

    private boolean onItemClicked(int i, int j, String s)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #858 <Field SearchView$OnSuggestionListener mOnSuggestionListener>
    //    2    4:ifnull          27
    //    3    7:aload_0         
    //    4    8:getfield        #858 <Field SearchView$OnSuggestionListener mOnSuggestionListener>
    //    5   11:iload_1         
    //    6   12:invokeinterface #863 <Method boolean SearchView$OnSuggestionListener.onSuggestionClick(int)>
    //    7   17:istore          6
    //    8   19:iconst_0        
    //    9   20:istore          5
    //   10   22:iload           6
    //   11   24:ifne            47
    //   12   27:aload_0         
    //   13   28:iload_1         
    //   14   29:iconst_0        
    //   15   30:aconst_null     
    //   16   31:invokespecial   #865 <Method boolean launchSuggestion(int, int, String)>
    //   17   34:pop             
    //   18   35:aload_0         
    //   19   36:iconst_0        
    //   20   37:invokespecial   #432 <Method void setImeVisibility(boolean)>
    //   21   40:aload_0         
    //   22   41:invokespecial   #867 <Method void dismissSuggestions()>
    //   23   44:iconst_1        
    //   24   45:istore          5
    //   25   47:iload           5
    //   26   49:ireturn         
    }

    private boolean onItemSelected(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #858 <Field SearchView$OnSuggestionListener mOnSuggestionListener>
    //    2    4:ifnull          20
    //    3    7:aload_0         
    //    4    8:getfield        #858 <Field SearchView$OnSuggestionListener mOnSuggestionListener>
    //    5   11:iload_1         
    //    6   12:invokeinterface #870 <Method boolean SearchView$OnSuggestionListener.onSuggestionSelect(int)>
    //    7   17:ifne            27
    //    8   20:aload_0         
    //    9   21:iload_1         
    //   10   22:invokespecial   #873 <Method void rewriteQueryFromSuggestion(int)>
    //   11   25:iconst_1        
    //   12   26:ireturn         
    //   13   27:iconst_0        
    //   14   28:ireturn         
    }

    private void onSearchClicked()
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:invokespecial   #364 <Method void updateViewsVisibility(boolean)>
    //    3    5:aload_0         
    //    4    6:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    5    9:invokevirtual   #856 <Method boolean SearchView$SearchAutoComplete.requestFocus()>
    //    6   12:pop             
    //    7   13:aload_0         
    //    8   14:iconst_1        
    //    9   15:invokespecial   #432 <Method void setImeVisibility(boolean)>
    //   10   18:aload_0         
    //   11   19:getfield        #875 <Field android.view.View$OnClickListener mOnSearchClickListener>
    //   12   22:ifnull          35
    //   13   25:aload_0         
    //   14   26:getfield        #875 <Field android.view.View$OnClickListener mOnSearchClickListener>
    //   15   29:aload_0         
    //   16   30:invokeinterface #881 <Method void android.view.View$OnClickListener.onClick(View)>
    //   17   35:return          
    }

    private void onSubmitQuery()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    2    4:invokevirtual   #838 <Method Editable SearchView$SearchAutoComplete.getText()>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:ifnull          68
    //    6   12:aload_1         
    //    7   13:invokestatic    #885 <Method int TextUtils.getTrimmedLength(CharSequence)>
    //    8   16:ifle            68
    //    9   19:aload_0         
    //   10   20:getfield        #887 <Field SearchView$OnQueryTextListener mOnQueryChangeListener>
    //   11   23:ifnull          42
    //   12   26:aload_0         
    //   13   27:getfield        #887 <Field SearchView$OnQueryTextListener mOnQueryChangeListener>
    //   14   30:aload_1         
    //   15   31:invokevirtual   #890 <Method String Object.toString()>
    //   16   34:invokeinterface #896 <Method boolean SearchView$OnQueryTextListener.onQueryTextSubmit(String)>
    //   17   39:ifne            68
    //   18   42:aload_0         
    //   19   43:getfield        #394 <Field SearchableInfo mSearchable>
    //   20   46:ifnull          64
    //   21   49:aload_0         
    //   22   50:iconst_0        
    //   23   51:aconst_null     
    //   24   52:aload_1         
    //   25   53:invokevirtual   #890 <Method String Object.toString()>
    //   26   56:invokespecial   #406 <Method void launchQuerySearch(int, String, String)>
    //   27   59:aload_0         
    //   28   60:iconst_0        
    //   29   61:invokespecial   #432 <Method void setImeVisibility(boolean)>
    //   30   64:aload_0         
    //   31   65:invokespecial   #867 <Method void dismissSuggestions()>
    //   32   68:return          
    }

    private boolean onSuggestionsKey(View view, int i, KeyEvent keyevent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #394 <Field SearchableInfo mSearchable>
    //    2    4:ifnonnull       9
    //    3    7:iconst_0        
    //    4    8:ireturn         
    //    5    9:aload_0         
    //    6   10:getfield        #378 <Field CursorAdapter mSuggestionsAdapter>
    //    7   13:ifnull          7
    //    8   16:aload_3         
    //    9   17:invokevirtual   #901 <Method int KeyEvent.getAction()>
    //   10   20:ifne            7
    //   11   23:aload_3         
    //   12   24:invokestatic    #907 <Method boolean KeyEventCompat.hasNoModifiers(KeyEvent)>
    //   13   27:ifeq            7
    //   14   30:iload_2         
    //   15   31:bipush          66
    //   16   33:icmpeq          48
    //   17   36:iload_2         
    //   18   37:bipush          84
    //   19   39:icmpeq          48
    //   20   42:iload_2         
    //   21   43:bipush          61
    //   22   45:icmpne          62
    //   23   48:aload_0         
    //   24   49:aload_0         
    //   25   50:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   26   53:invokevirtual   #910 <Method int SearchView$SearchAutoComplete.getListSelection()>
    //   27   56:iconst_0        
    //   28   57:aconst_null     
    //   29   58:invokespecial   #412 <Method boolean onItemClicked(int, int, String)>
    //   30   61:ireturn         
    //   31   62:iload_2         
    //   32   63:bipush          21
    //   33   65:icmpeq          74
    //   34   68:iload_2         
    //   35   69:bipush          22
    //   36   71:icmpne          132
    //   37   74:iload_2         
    //   38   75:bipush          21
    //   39   77:icmpne          120
    //   40   80:iconst_0        
    //   41   81:istore          4
    //   42   83:aload_0         
    //   43   84:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   44   87:iload           4
    //   45   89:invokevirtual   #913 <Method void SearchView$SearchAutoComplete.setSelection(int)>
    //   46   92:aload_0         
    //   47   93:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   48   96:iconst_0        
    //   49   97:invokevirtual   #916 <Method void SearchView$SearchAutoComplete.setListSelection(int)>
    //   50  100:aload_0         
    //   51  101:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   52  104:invokevirtual   #919 <Method void SearchView$SearchAutoComplete.clearListSelection()>
    //   53  107:getstatic       #91  <Field SearchView$AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER>
    //   54  110:aload_0         
    //   55  111:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   56  114:iconst_1        
    //   57  115:invokevirtual   #923 <Method void SearchView$AutoCompleteTextViewReflector.ensureImeVisible(AutoCompleteTextView, boolean)>
    //   58  118:iconst_1        
    //   59  119:ireturn         
    //   60  120:aload_0         
    //   61  121:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   62  124:invokevirtual   #926 <Method int SearchView$SearchAutoComplete.length()>
    //   63  127:istore          4
    //   64  129:goto            83
    //   65  132:iload_2         
    //   66  133:bipush          19
    //   67  135:icmpne          7
    //   68  138:aload_0         
    //   69  139:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   70  142:invokevirtual   #910 <Method int SearchView$SearchAutoComplete.getListSelection()>
    //   71  145:ifne            7
    //   72  148:iconst_0        
    //   73  149:ireturn         
    }

    private void onTextChanged(CharSequence charsequence)
    {
    //    0    0:iconst_1        
    //    1    1:istore_2        
    //    2    2:aload_0         
    //    3    3:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    4    6:invokevirtual   #838 <Method Editable SearchView$SearchAutoComplete.getText()>
    //    5    9:astore_3        
    //    6   10:aload_0         
    //    7   11:aload_3         
    //    8   12:putfield        #534 <Field CharSequence mUserQuery>
    //    9   15:aload_3         
    //   10   16:invokestatic    #297 <Method boolean TextUtils.isEmpty(CharSequence)>
    //   11   19:ifne            90
    //   12   22:iload_2         
    //   13   23:istore          4
    //   14   25:aload_0         
    //   15   26:iload           4
    //   16   28:invokespecial   #929 <Method void updateSubmitButton(boolean)>
    //   17   31:iload           4
    //   18   33:ifne            96
    //   19   36:aload_0         
    //   20   37:iload_2         
    //   21   38:invokespecial   #932 <Method void updateVoiceButton(boolean)>
    //   22   41:aload_0         
    //   23   42:invokespecial   #935 <Method void updateCloseButton()>
    //   24   45:aload_0         
    //   25   46:invokespecial   #938 <Method void updateSubmitArea()>
    //   26   49:aload_0         
    //   27   50:getfield        #887 <Field SearchView$OnQueryTextListener mOnQueryChangeListener>
    //   28   53:ifnull          81
    //   29   56:aload_1         
    //   30   57:aload_0         
    //   31   58:getfield        #940 <Field CharSequence mOldQueryText>
    //   32   61:invokestatic    #944 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
    //   33   64:ifne            81
    //   34   67:aload_0         
    //   35   68:getfield        #887 <Field SearchView$OnQueryTextListener mOnQueryChangeListener>
    //   36   71:aload_1         
    //   37   72:invokevirtual   #890 <Method String Object.toString()>
    //   38   75:invokeinterface #947 <Method boolean SearchView$OnQueryTextListener.onQueryTextChange(String)>
    //   39   80:pop             
    //   40   81:aload_0         
    //   41   82:aload_1         
    //   42   83:invokevirtual   #890 <Method String Object.toString()>
    //   43   86:putfield        #940 <Field CharSequence mOldQueryText>
    //   44   89:return          
    //   45   90:iconst_0        
    //   46   91:istore          4
    //   47   93:goto            25
    //   48   96:iconst_0        
    //   49   97:istore_2        
    //   50   98:goto            36
    }

    private void onVoiceClicked()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #394 <Field SearchableInfo mSearchable>
    //    2    4:ifnonnull       8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #394 <Field SearchableInfo mSearchable>
    //    6   12:astore_1        
    // try 13 40 handler(s) 41
    //    7   13:aload_1         
    //    8   14:invokevirtual   #776 <Method boolean SearchableInfo.getVoiceSearchLaunchWebSearch()>
    //    9   17:ifeq            52
    //   10   20:aload_0         
    //   11   21:aload_0         
    //   12   22:getfield        #328 <Field Intent mVoiceWebSearchIntent>
    //   13   25:aload_1         
    //   14   26:invokespecial   #951 <Method Intent createVoiceWebSearchIntent(Intent, SearchableInfo)>
    //   15   29:astore          5
    //   16   31:aload_0         
    //   17   32:invokevirtual   #479 <Method Context getContext()>
    //   18   35:aload           5
    //   19   37:invokevirtual   #813 <Method void Context.startActivity(Intent)>
    //   20   40:return          
    // catch ActivityNotFoundException ActivityNotFoundException
    //   21   41:astore_2        
    //   22   42:ldc1            #18  <String "SearchView">
    //   23   44:ldc2            #953 <String "Could not find voice search activity">
    //   24   47:invokestatic    #956 <Method int Log.w(String, String)>
    //   25   50:pop             
    //   26   51:return          
    // try 52 79 handler(s) 41
    //   27   52:aload_1         
    //   28   53:invokevirtual   #790 <Method boolean SearchableInfo.getVoiceSearchLaunchRecognizer()>
    //   29   56:ifeq            7
    //   30   59:aload_0         
    //   31   60:aload_0         
    //   32   61:getfield        #345 <Field Intent mVoiceAppSearchIntent>
    //   33   64:aload_1         
    //   34   65:invokespecial   #958 <Method Intent createVoiceAppSearchIntent(Intent, SearchableInfo)>
    //   35   68:astore          4
    //   36   70:aload_0         
    //   37   71:invokevirtual   #479 <Method Context getContext()>
    //   38   74:aload           4
    //   39   76:invokevirtual   #813 <Method void Context.startActivity(Intent)>
    //   40   79:return          
    }

    private void postUpdateFocusedState()
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #108 <Field Runnable mUpdateDrawableStateRunnable>
    //    3    5:invokevirtual   #963 <Method boolean post(Runnable)>
    //    4    8:pop             
    //    5    9:return          
    }

    private void rewriteQueryFromSuggestion(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    2    4:invokevirtual   #838 <Method Editable SearchView$SearchAutoComplete.getText()>
    //    3    7:astore_2        
    //    4    8:aload_0         
    //    5    9:getfield        #378 <Field CursorAdapter mSuggestionsAdapter>
    //    6   12:invokevirtual   #828 <Method Cursor CursorAdapter.getCursor()>
    //    7   15:astore_3        
    //    8   16:aload_3         
    //    9   17:ifnonnull       21
    //   10   20:return          
    //   11   21:aload_3         
    //   12   22:iload_1         
    //   13   23:invokeinterface #831 <Method boolean Cursor.moveToPosition(int)>
    //   14   28:ifeq            59
    //   15   31:aload_0         
    //   16   32:getfield        #378 <Field CursorAdapter mSuggestionsAdapter>
    //   17   35:aload_3         
    //   18   36:invokevirtual   #967 <Method CharSequence CursorAdapter.convertToString(Cursor)>
    //   19   39:astore          4
    //   20   41:aload           4
    //   21   43:ifnull          53
    //   22   46:aload_0         
    //   23   47:aload           4
    //   24   49:invokespecial   #970 <Method void setQuery(CharSequence)>
    //   25   52:return          
    //   26   53:aload_0         
    //   27   54:aload_2         
    //   28   55:invokespecial   #970 <Method void setQuery(CharSequence)>
    //   29   58:return          
    //   30   59:aload_0         
    //   31   60:aload_2         
    //   32   61:invokespecial   #970 <Method void setQuery(CharSequence)>
    //   33   64:return          
    }

    private void setImeVisibility(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            14
    //    2    4:aload_0         
    //    3    5:aload_0         
    //    4    6:getfield        #103 <Field Runnable mShowImeRunnable>
    //    5    9:invokevirtual   #963 <Method boolean post(Runnable)>
    //    6   12:pop             
    //    7   13:return          
    //    8   14:aload_0         
    //    9   15:aload_0         
    //   10   16:getfield        #103 <Field Runnable mShowImeRunnable>
    //   11   19:invokevirtual   #973 <Method boolean removeCallbacks(Runnable)>
    //   12   22:pop             
    //   13   23:aload_0         
    //   14   24:invokevirtual   #479 <Method Context getContext()>
    //   15   27:ldc2            #975 <String "input_method">
    //   16   30:invokevirtual   #156 <Method Object Context.getSystemService(String)>
    //   17   33:checkcast       #977 <Class InputMethodManager>
    //   18   36:astore_3        
    //   19   37:aload_3         
    //   20   38:ifnull          13
    //   21   41:aload_3         
    //   22   42:aload_0         
    //   23   43:invokevirtual   #981 <Method android.os.IBinder getWindowToken()>
    //   24   46:iconst_0        
    //   25   47:invokevirtual   #985 <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
    //   26   50:pop             
    //   27   51:return          
    }

    private void setQuery(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #853 <Method void SearchView$SearchAutoComplete.setText(CharSequence)>
    //    4    8:aload_0         
    //    5    9:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    6   12:astore_2        
    //    7   13:aload_1         
    //    8   14:invokestatic    #297 <Method boolean TextUtils.isEmpty(CharSequence)>
    //    9   17:ifeq            28
    //   10   20:iconst_0        
    //   11   21:istore_3        
    //   12   22:aload_2         
    //   13   23:iload_3         
    //   14   24:invokevirtual   #913 <Method void SearchView$SearchAutoComplete.setSelection(int)>
    //   15   27:return          
    //   16   28:aload_1         
    //   17   29:invokeinterface #988 <Method int CharSequence.length()>
    //   18   34:istore_3        
    //   19   35:goto            22
    }

    private void updateCloseButton()
    {
    //    0    0:iconst_1        
    //    1    1:istore_1        
    //    2    2:aload_0         
    //    3    3:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    4    6:invokevirtual   #838 <Method Editable SearchView$SearchAutoComplete.getText()>
    //    5    9:invokestatic    #297 <Method boolean TextUtils.isEmpty(CharSequence)>
    //    6   12:ifne            80
    //    7   15:iload_1         
    //    8   16:istore_2        
    //    9   17:iload_2         
    //   10   18:ifne            35
    //   11   21:aload_0         
    //   12   22:getfield        #361 <Field boolean mIconifiedByDefault>
    //   13   25:ifeq            85
    //   14   28:aload_0         
    //   15   29:getfield        #990 <Field boolean mExpandedInActionView>
    //   16   32:ifne            85
    //   17   35:aload_0         
    //   18   36:getfield        #215 <Field ImageView mCloseButton>
    //   19   39:astore_3        
    //   20   40:iconst_0        
    //   21   41:istore          4
    //   22   43:iload_1         
    //   23   44:ifeq            90
    //   24   47:aload_3         
    //   25   48:iload           4
    //   26   50:invokevirtual   #993 <Method void ImageView.setVisibility(int)>
    //   27   53:aload_0         
    //   28   54:getfield        #215 <Field ImageView mCloseButton>
    //   29   57:invokevirtual   #995 <Method Drawable ImageView.getDrawable()>
    //   30   60:astore          5
    //   31   62:iload_2         
    //   32   63:ifeq            97
    //   33   66:getstatic       #998 <Field int[] ENABLED_STATE_SET>
    //   34   69:astore          6
    //   35   71:aload           5
    //   36   73:aload           6
    //   37   75:invokevirtual   #1002 <Method boolean Drawable.setState(int[])>
    //   38   78:pop             
    //   39   79:return          
    //   40   80:iconst_0        
    //   41   81:istore_2        
    //   42   82:goto            17
    //   43   85:iconst_0        
    //   44   86:istore_1        
    //   45   87:goto            35
    //   46   90:bipush          8
    //   47   92:istore          4
    //   48   94:goto            47
    //   49   97:getstatic       #1005 <Field int[] EMPTY_STATE_SET>
    //   50  100:astore          6
    //   51  102:goto            71
    }

    private void updateFocusedState()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    2    4:invokevirtual   #1008 <Method boolean SearchView$SearchAutoComplete.hasFocus()>
    //    3    7:istore_1        
    //    4    8:aload_0         
    //    5    9:getfield        #198 <Field View mSearchPlate>
    //    6   12:invokevirtual   #1011 <Method Drawable View.getBackground()>
    //    7   15:astore_2        
    //    8   16:iload_1         
    //    9   17:ifeq            61
    //   10   20:getstatic       #1014 <Field int[] FOCUSED_STATE_SET>
    //   11   23:astore_3        
    //   12   24:aload_2         
    //   13   25:aload_3         
    //   14   26:invokevirtual   #1002 <Method boolean Drawable.setState(int[])>
    //   15   29:pop             
    //   16   30:aload_0         
    //   17   31:getfield        #203 <Field View mSubmitArea>
    //   18   34:invokevirtual   #1011 <Method Drawable View.getBackground()>
    //   19   37:astore          5
    //   20   39:iload_1         
    //   21   40:ifeq            68
    //   22   43:getstatic       #1014 <Field int[] FOCUSED_STATE_SET>
    //   23   46:astore          6
    //   24   48:aload           5
    //   25   50:aload           6
    //   26   52:invokevirtual   #1002 <Method boolean Drawable.setState(int[])>
    //   27   55:pop             
    //   28   56:aload_0         
    //   29   57:invokevirtual   #1017 <Method void invalidate()>
    //   30   60:return          
    //   31   61:getstatic       #1005 <Field int[] EMPTY_STATE_SET>
    //   32   64:astore_3        
    //   33   65:goto            24
    //   34   68:getstatic       #1005 <Field int[] EMPTY_STATE_SET>
    //   35   71:astore          6
    //   36   73:goto            48
    }

    private void updateQueryHint()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #1019 <Field CharSequence mQueryHint>
    //    2    4:ifnull          23
    //    3    7:aload_0         
    //    4    8:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    5   11:aload_0         
    //    6   12:aload_0         
    //    7   13:getfield        #1019 <Field CharSequence mQueryHint>
    //    8   16:invokespecial   #1021 <Method CharSequence getDecoratedHint(CharSequence)>
    //    9   19:invokevirtual   #1024 <Method void SearchView$SearchAutoComplete.setHint(CharSequence)>
    //   10   22:return          
    //   11   23:aload_0         
    //   12   24:getfield        #394 <Field SearchableInfo mSearchable>
    //   13   27:ifnull          70
    //   14   30:aload_0         
    //   15   31:getfield        #394 <Field SearchableInfo mSearchable>
    //   16   34:invokevirtual   #1027 <Method int SearchableInfo.getHintId()>
    //   17   37:istore_1        
    //   18   38:aconst_null     
    //   19   39:astore_2        
    //   20   40:iload_1         
    //   21   41:ifeq            53
    //   22   44:aload_0         
    //   23   45:invokevirtual   #479 <Method Context getContext()>
    //   24   48:iload_1         
    //   25   49:invokevirtual   #1028 <Method String Context.getString(int)>
    //   26   52:astore_2        
    //   27   53:aload_2         
    //   28   54:ifnull          22
    //   29   57:aload_0         
    //   30   58:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   31   61:aload_0         
    //   32   62:aload_2         
    //   33   63:invokespecial   #1021 <Method CharSequence getDecoratedHint(CharSequence)>
    //   34   66:invokevirtual   #1024 <Method void SearchView$SearchAutoComplete.setHint(CharSequence)>
    //   35   69:return          
    //   36   70:aload_0         
    //   37   71:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   38   74:aload_0         
    //   39   75:ldc2            #850 <String "">
    //   40   78:invokespecial   #1021 <Method CharSequence getDecoratedHint(CharSequence)>
    //   41   81:invokevirtual   #1024 <Method void SearchView$SearchAutoComplete.setHint(CharSequence)>
    //   42   84:return          
    }

    private void updateSearchAutoComplete()
    {
    //    0    0:iconst_1        
    //    1    1:istore_1        
    //    2    2:aload_0         
    //    3    3:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    4    6:aload_0         
    //    5    7:getfield        #394 <Field SearchableInfo mSearchable>
    //    6   10:invokevirtual   #1032 <Method int SearchableInfo.getSuggestThreshold()>
    //    7   13:invokevirtual   #1035 <Method void SearchView$SearchAutoComplete.setThreshold(int)>
    //    8   16:aload_0         
    //    9   17:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   10   20:aload_0         
    //   11   21:getfield        #394 <Field SearchableInfo mSearchable>
    //   12   24:invokevirtual   #1038 <Method int SearchableInfo.getImeOptions()>
    //   13   27:invokevirtual   #1039 <Method void SearchView$SearchAutoComplete.setImeOptions(int)>
    //   14   30:aload_0         
    //   15   31:getfield        #394 <Field SearchableInfo mSearchable>
    //   16   34:invokevirtual   #1042 <Method int SearchableInfo.getInputType()>
    //   17   37:istore_2        
    //   18   38:iload_2         
    //   19   39:bipush          15
    //   20   41:iand            
    //   21   42:iload_1         
    //   22   43:icmpne          72
    //   23   46:iload_2         
    //   24   47:ldc2            #1043 <Int 0xfffeffff>
    //   25   50:iand            
    //   26   51:istore_2        
    //   27   52:aload_0         
    //   28   53:getfield        #394 <Field SearchableInfo mSearchable>
    //   29   56:invokevirtual   #1046 <Method String SearchableInfo.getSuggestAuthority()>
    //   30   59:ifnull          72
    //   31   62:ldc2            #1047 <Int 0x80000>
    //   32   65:iload_2         
    //   33   66:ldc2            #781 <Int 0x10000>
    //   34   69:ior             
    //   35   70:ior             
    //   36   71:istore_2        
    //   37   72:aload_0         
    //   38   73:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   39   76:iload_2         
    //   40   77:invokevirtual   #1048 <Method void SearchView$SearchAutoComplete.setInputType(int)>
    //   41   80:aload_0         
    //   42   81:getfield        #378 <Field CursorAdapter mSuggestionsAdapter>
    //   43   84:ifnull          95
    //   44   87:aload_0         
    //   45   88:getfield        #378 <Field CursorAdapter mSuggestionsAdapter>
    //   46   91:aconst_null     
    //   47   92:invokevirtual   #1052 <Method void CursorAdapter.changeCursor(Cursor)>
    //   48   95:aload_0         
    //   49   96:getfield        #394 <Field SearchableInfo mSearchable>
    //   50   99:invokevirtual   #1046 <Method String SearchableInfo.getSuggestAuthority()>
    //   51  102:ifnull          162
    //   52  105:aload_0         
    //   53  106:new             #573 <Class SuggestionsAdapter>
    //   54  109:dup             
    //   55  110:aload_0         
    //   56  111:invokevirtual   #479 <Method Context getContext()>
    //   57  114:aload_0         
    //   58  115:aload_0         
    //   59  116:getfield        #394 <Field SearchableInfo mSearchable>
    //   60  119:aload_0         
    //   61  120:getfield        #118 <Field WeakHashMap mOutsideDrawablesCache>
    //   62  123:invokespecial   #1055 <Method void SuggestionsAdapter(Context, SearchView, SearchableInfo, WeakHashMap)>
    //   63  126:putfield        #378 <Field CursorAdapter mSuggestionsAdapter>
    //   64  129:aload_0         
    //   65  130:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   66  133:aload_0         
    //   67  134:getfield        #378 <Field CursorAdapter mSuggestionsAdapter>
    //   68  137:invokevirtual   #1059 <Method void SearchView$SearchAutoComplete.setAdapter(android.widget.ListAdapter)>
    //   69  140:aload_0         
    //   70  141:getfield        #378 <Field CursorAdapter mSuggestionsAdapter>
    //   71  144:checkcast       #573 <Class SuggestionsAdapter>
    //   72  147:astore_3        
    //   73  148:aload_0         
    //   74  149:getfield        #1061 <Field boolean mQueryRefinement>
    //   75  152:ifeq            157
    //   76  155:iconst_2        
    //   77  156:istore_1        
    //   78  157:aload_3         
    //   79  158:iload_1         
    //   80  159:invokevirtual   #1064 <Method void SuggestionsAdapter.setQueryRefinement(int)>
    //   81  162:return          
    }

    private void updateSubmitArea()
    {
    //    0    0:bipush          8
    //    1    2:istore_1        
    //    2    3:aload_0         
    //    3    4:invokespecial   #1066 <Method boolean isSubmitAreaEnabled()>
    //    4    7:ifeq            32
    //    5   10:aload_0         
    //    6   11:getfield        #208 <Field View mSubmitButton>
    //    7   14:invokevirtual   #1069 <Method int View.getVisibility()>
    //    8   17:ifeq            30
    //    9   20:aload_0         
    //   10   21:getfield        #220 <Field View mVoiceButton>
    //   11   24:invokevirtual   #1069 <Method int View.getVisibility()>
    //   12   27:ifne            32
    //   13   30:iconst_0        
    //   14   31:istore_1        
    //   15   32:aload_0         
    //   16   33:getfield        #203 <Field View mSubmitArea>
    //   17   36:iload_1         
    //   18   37:invokevirtual   #1070 <Method void View.setVisibility(int)>
    //   19   40:return          
    }

    private void updateSubmitButton(boolean flag)
    {
    //    0    0:bipush          8
    //    1    2:istore_2        
    //    2    3:aload_0         
    //    3    4:getfield        #804 <Field boolean mSubmitButtonEnabled>
    //    4    7:ifeq            37
    //    5   10:aload_0         
    //    6   11:invokespecial   #1066 <Method boolean isSubmitAreaEnabled()>
    //    7   14:ifeq            37
    //    8   17:aload_0         
    //    9   18:invokevirtual   #1071 <Method boolean hasFocus()>
    //   10   21:ifeq            37
    //   11   24:iload_1         
    //   12   25:ifne            35
    //   13   28:aload_0         
    //   14   29:getfield        #806 <Field boolean mVoiceButtonEnabled>
    //   15   32:ifne            37
    //   16   35:iconst_0        
    //   17   36:istore_2        
    //   18   37:aload_0         
    //   19   38:getfield        #208 <Field View mSubmitButton>
    //   20   41:iload_2         
    //   21   42:invokevirtual   #1070 <Method void View.setVisibility(int)>
    //   22   45:return          
    }

    private void updateViewsVisibility(boolean flag)
    {
    //    0    0:iconst_1        
    //    1    1:istore_2        
    //    2    2:bipush          8
    //    3    4:istore_3        
    //    4    5:aload_0         
    //    5    6:iload_1         
    //    6    7:putfield        #1073 <Field boolean mIconified>
    //    7   10:iload_1         
    //    8   11:ifeq            106
    //    9   14:iconst_0        
    //   10   15:istore          4
    //   11   17:aload_0         
    //   12   18:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   13   21:invokevirtual   #838 <Method Editable SearchView$SearchAutoComplete.getText()>
    //   14   24:invokestatic    #297 <Method boolean TextUtils.isEmpty(CharSequence)>
    //   15   27:ifne            112
    //   16   30:iload_2         
    //   17   31:istore          5
    //   18   33:aload_0         
    //   19   34:getfield        #178 <Field View mSearchButton>
    //   20   37:iload           4
    //   21   39:invokevirtual   #1070 <Method void View.setVisibility(int)>
    //   22   42:aload_0         
    //   23   43:iload           5
    //   24   45:invokespecial   #929 <Method void updateSubmitButton(boolean)>
    //   25   48:aload_0         
    //   26   49:getfield        #193 <Field View mSearchEditFrame>
    //   27   52:astore          6
    //   28   54:iload_1         
    //   29   55:ifeq            118
    //   30   58:iload_3         
    //   31   59:istore          7
    //   32   61:aload           6
    //   33   63:iload           7
    //   34   65:invokevirtual   #1070 <Method void View.setVisibility(int)>
    //   35   68:aload_0         
    //   36   69:getfield        #225 <Field ImageView mSearchHintIcon>
    //   37   72:astore          8
    //   38   74:aload_0         
    //   39   75:getfield        #361 <Field boolean mIconifiedByDefault>
    //   40   78:ifeq            124
    //   41   81:aload           8
    //   42   83:iload_3         
    //   43   84:invokevirtual   #993 <Method void ImageView.setVisibility(int)>
    //   44   87:aload_0         
    //   45   88:invokespecial   #935 <Method void updateCloseButton()>
    //   46   91:iload           5
    //   47   93:ifne            129
    //   48   96:aload_0         
    //   49   97:iload_2         
    //   50   98:invokespecial   #932 <Method void updateVoiceButton(boolean)>
    //   51  101:aload_0         
    //   52  102:invokespecial   #938 <Method void updateSubmitArea()>
    //   53  105:return          
    //   54  106:iload_3         
    //   55  107:istore          4
    //   56  109:goto            17
    //   57  112:iconst_0        
    //   58  113:istore          5
    //   59  115:goto            33
    //   60  118:iconst_0        
    //   61  119:istore          7
    //   62  121:goto            61
    //   63  124:iconst_0        
    //   64  125:istore_3        
    //   65  126:goto            81
    //   66  129:iconst_0        
    //   67  130:istore_2        
    //   68  131:goto            96
    }

    private void updateVoiceButton(boolean flag)
    {
    //    0    0:bipush          8
    //    1    2:istore_2        
    //    2    3:aload_0         
    //    3    4:getfield        #806 <Field boolean mVoiceButtonEnabled>
    //    4    7:ifeq            32
    //    5   10:aload_0         
    //    6   11:invokevirtual   #809 <Method boolean isIconified()>
    //    7   14:ifne            32
    //    8   17:iload_1         
    //    9   18:ifeq            32
    //   10   21:iconst_0        
    //   11   22:istore_2        
    //   12   23:aload_0         
    //   13   24:getfield        #208 <Field View mSubmitButton>
    //   14   27:bipush          8
    //   15   29:invokevirtual   #1070 <Method void View.setVisibility(int)>
    //   16   32:aload_0         
    //   17   33:getfield        #220 <Field View mVoiceButton>
    //   18   36:iload_2         
    //   19   37:invokevirtual   #1070 <Method void View.setVisibility(int)>
    //   20   40:return          
    }

    public void clearFocus()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #1075 <Field boolean mClearingFocus>
    //    3    5:aload_0         
    //    4    6:iconst_0        
    //    5    7:invokespecial   #432 <Method void setImeVisibility(boolean)>
    //    6   10:aload_0         
    //    7   11:invokespecial   #1076 <Method void LinearLayout.clearFocus()>
    //    8   14:aload_0         
    //    9   15:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   10   18:invokevirtual   #1077 <Method void SearchView$SearchAutoComplete.clearFocus()>
    //   11   21:aload_0         
    //   12   22:iconst_0        
    //   13   23:putfield        #1075 <Field boolean mClearingFocus>
    //   14   26:return          
    }

    public int getImeOptions()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    2    4:invokevirtual   #1078 <Method int SearchView$SearchAutoComplete.getImeOptions()>
    //    3    7:ireturn         
    }

    public int getInputType()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    2    4:invokevirtual   #1079 <Method int SearchView$SearchAutoComplete.getInputType()>
    //    3    7:ireturn         
    }

    public int getMaxWidth()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #1082 <Field int mMaxWidth>
    //    2    4:ireturn         
    }

    public CharSequence getQuery()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    2    4:invokevirtual   #838 <Method Editable SearchView$SearchAutoComplete.getText()>
    //    3    7:areturn         
    }

    public CharSequence getQueryHint()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #1019 <Field CharSequence mQueryHint>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #1019 <Field CharSequence mQueryHint>
    //    5   11:astore_2        
    //    6   12:aload_2         
    //    7   13:areturn         
    //    8   14:aload_0         
    //    9   15:getfield        #394 <Field SearchableInfo mSearchable>
    //   10   18:ifnull          44
    //   11   21:aload_0         
    //   12   22:getfield        #394 <Field SearchableInfo mSearchable>
    //   13   25:invokevirtual   #1027 <Method int SearchableInfo.getHintId()>
    //   14   28:istore_1        
    //   15   29:aconst_null     
    //   16   30:astore_2        
    //   17   31:iload_1         
    //   18   32:ifeq            12
    //   19   35:aload_0         
    //   20   36:invokevirtual   #479 <Method Context getContext()>
    //   21   39:iload_1         
    //   22   40:invokevirtual   #1028 <Method String Context.getString(int)>
    //   23   43:areturn         
    //   24   44:aconst_null     
    //   25   45:areturn         
    }

    public CursorAdapter getSuggestionsAdapter()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #378 <Field CursorAdapter mSuggestionsAdapter>
    //    2    4:areturn         
    }

    public boolean isIconfiedByDefault()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #361 <Field boolean mIconifiedByDefault>
    //    2    4:ireturn         
    }

    public boolean isIconified()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #1073 <Field boolean mIconified>
    //    2    4:ireturn         
    }

    public boolean isQueryRefinementEnabled()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #1061 <Field boolean mQueryRefinement>
    //    2    4:ireturn         
    }

    public boolean isSubmitButtonEnabled()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #804 <Field boolean mSubmitButtonEnabled>
    //    2    4:ireturn         
    }

    public void onActionViewCollapsed()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #848 <Method void clearFocus()>
    //    2    4:aload_0         
    //    3    5:iconst_1        
    //    4    6:invokespecial   #364 <Method void updateViewsVisibility(boolean)>
    //    5    9:aload_0         
    //    6   10:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    7   13:aload_0         
    //    8   14:getfield        #1093 <Field int mCollapsedImeOptions>
    //    9   17:invokevirtual   #1039 <Method void SearchView$SearchAutoComplete.setImeOptions(int)>
    //   10   20:aload_0         
    //   11   21:iconst_0        
    //   12   22:putfield        #990 <Field boolean mExpandedInActionView>
    //   13   25:return          
    }

    public void onActionViewExpanded()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #990 <Field boolean mExpandedInActionView>
    //    2    4:ifeq            8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:iconst_1        
    //    6   10:putfield        #990 <Field boolean mExpandedInActionView>
    //    7   13:aload_0         
    //    8   14:aload_0         
    //    9   15:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   10   18:invokevirtual   #1078 <Method int SearchView$SearchAutoComplete.getImeOptions()>
    //   11   21:putfield        #1093 <Field int mCollapsedImeOptions>
    //   12   24:aload_0         
    //   13   25:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   14   28:ldc2            #1095 <Int 0x2000000>
    //   15   31:aload_0         
    //   16   32:getfield        #1093 <Field int mCollapsedImeOptions>
    //   17   35:ior             
    //   18   36:invokevirtual   #1039 <Method void SearchView$SearchAutoComplete.setImeOptions(int)>
    //   19   39:aload_0         
    //   20   40:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   21   43:ldc2            #850 <String "">
    //   22   46:invokevirtual   #853 <Method void SearchView$SearchAutoComplete.setText(CharSequence)>
    //   23   49:aload_0         
    //   24   50:iconst_0        
    //   25   51:invokevirtual   #1098 <Method void setIconified(boolean)>
    //   26   54:return          
    }

    protected void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #108 <Field Runnable mUpdateDrawableStateRunnable>
    //    3    5:invokevirtual   #973 <Method boolean removeCallbacks(Runnable)>
    //    4    8:pop             
    //    5    9:aload_0         
    //    6   10:aload_0         
    //    7   11:getfield        #113 <Field Runnable mReleaseCursorRunnable>
    //    8   14:invokevirtual   #963 <Method boolean post(Runnable)>
    //    9   17:pop             
    //   10   18:aload_0         
    //   11   19:invokespecial   #1101 <Method void LinearLayout.onDetachedFromWindow()>
    //   12   22:return          
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #394 <Field SearchableInfo mSearchable>
    //    2    4:ifnonnull       9
    //    3    7:iconst_0        
    //    4    8:ireturn         
    //    5    9:aload_0         
    //    6   10:iload_1         
    //    7   11:aload_2         
    //    8   12:invokespecial   #1105 <Method boolean LinearLayout.onKeyDown(int, KeyEvent)>
    //    9   15:ireturn         
    }

    protected void onMeasure(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #809 <Method boolean isIconified()>
    //    2    4:ifeq            14
    //    3    7:aload_0         
    //    4    8:iload_1         
    //    5    9:iload_2         
    //    6   10:invokespecial   #1109 <Method void LinearLayout.onMeasure(int, int)>
    //    7   13:return          
    //    8   14:iload_1         
    //    9   15:invokestatic    #1114 <Method int android.view.View$MeasureSpec.getMode(int)>
    //   10   18:istore_3        
    //   11   19:iload_1         
    //   12   20:invokestatic    #1117 <Method int android.view.View$MeasureSpec.getSize(int)>
    //   13   23:istore          4
    //   14   25:iload_3         
    //   15   26:lookupswitch    3: default 60
    //                   -2147483648: 74
    //                   0: 130
    //                   1073741824: 109
    //   16   60:aload_0         
    //   17   61:iload           4
    //   18   63:ldc2            #639 <Int 0x40000000>
    //   19   66:invokestatic    #1120 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
    //   20   69:iload_2         
    //   21   70:invokespecial   #1109 <Method void LinearLayout.onMeasure(int, int)>
    //   22   73:return          
    //   23   74:aload_0         
    //   24   75:getfield        #1082 <Field int mMaxWidth>
    //   25   78:ifle            95
    //   26   81:aload_0         
    //   27   82:getfield        #1082 <Field int mMaxWidth>
    //   28   85:iload           4
    //   29   87:invokestatic    #1125 <Method int Math.min(int, int)>
    //   30   90:istore          4
    //   31   92:goto            60
    //   32   95:aload_0         
    //   33   96:invokespecial   #1127 <Method int getPreferredWidth()>
    //   34   99:iload           4
    //   35  101:invokestatic    #1125 <Method int Math.min(int, int)>
    //   36  104:istore          4
    //   37  106:goto            60
    //   38  109:aload_0         
    //   39  110:getfield        #1082 <Field int mMaxWidth>
    //   40  113:ifle            60
    //   41  116:aload_0         
    //   42  117:getfield        #1082 <Field int mMaxWidth>
    //   43  120:iload           4
    //   44  122:invokestatic    #1125 <Method int Math.min(int, int)>
    //   45  125:istore          4
    //   46  127:goto            60
    //   47  130:aload_0         
    //   48  131:getfield        #1082 <Field int mMaxWidth>
    //   49  134:ifle            146
    //   50  137:aload_0         
    //   51  138:getfield        #1082 <Field int mMaxWidth>
    //   52  141:istore          4
    //   53  143:goto            60
    //   54  146:aload_0         
    //   55  147:invokespecial   #1127 <Method int getPreferredWidth()>
    //   56  150:istore          4
    //   57  152:goto            143
    }

    void onQueryRefine(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #970 <Method void setQuery(CharSequence)>
    //    3    5:return          
    }

    void onTextFocusChanged()
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokevirtual   #809 <Method boolean isIconified()>
    //    3    5:invokespecial   #364 <Method void updateViewsVisibility(boolean)>
    //    4    8:aload_0         
    //    5    9:invokespecial   #1131 <Method void postUpdateFocusedState()>
    //    6   12:aload_0         
    //    7   13:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    8   16:invokevirtual   #1008 <Method boolean SearchView$SearchAutoComplete.hasFocus()>
    //    9   19:ifeq            26
    //   10   22:aload_0         
    //   11   23:invokespecial   #390 <Method void forceSuggestionQuery()>
    //   12   26:return          
    }

    public void onWindowFocusChanged(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #1134 <Method void LinearLayout.onWindowFocusChanged(boolean)>
    //    3    5:aload_0         
    //    4    6:invokespecial   #1131 <Method void postUpdateFocusedState()>
    //    5    9:return          
    }

    public boolean requestFocus(int i, Rect rect)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #1075 <Field boolean mClearingFocus>
    //    2    4:ifeq            11
    //    3    7:iconst_0        
    //    4    8:istore_3        
    //    5    9:iload_3         
    //    6   10:ireturn         
    //    7   11:aload_0         
    //    8   12:invokevirtual   #1138 <Method boolean isFocusable()>
    //    9   15:ifne            20
    //   10   18:iconst_0        
    //   11   19:ireturn         
    //   12   20:aload_0         
    //   13   21:invokevirtual   #809 <Method boolean isIconified()>
    //   14   24:ifne            48
    //   15   27:aload_0         
    //   16   28:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   17   31:iload_1         
    //   18   32:aload_2         
    //   19   33:invokevirtual   #1140 <Method boolean SearchView$SearchAutoComplete.requestFocus(int, Rect)>
    //   20   36:istore_3        
    //   21   37:iload_3         
    //   22   38:ifeq            9
    //   23   41:aload_0         
    //   24   42:iconst_0        
    //   25   43:invokespecial   #364 <Method void updateViewsVisibility(boolean)>
    //   26   46:iload_3         
    //   27   47:ireturn         
    //   28   48:aload_0         
    //   29   49:iload_1         
    //   30   50:aload_2         
    //   31   51:invokespecial   #1141 <Method boolean LinearLayout.requestFocus(int, Rect)>
    //   32   54:ireturn         
    }

    public void setAppSearchData(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #543 <Field Bundle mAppSearchData>
    //    3    5:return          
    }

    public void setIconified(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            9
    //    2    4:aload_0         
    //    3    5:invokespecial   #447 <Method void onCloseClicked()>
    //    4    8:return          
    //    5    9:aload_0         
    //    6   10:invokespecial   #441 <Method void onSearchClicked()>
    //    7   13:return          
    }

    public void setIconifiedByDefault(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #361 <Field boolean mIconifiedByDefault>
    //    2    4:iload_1         
    //    3    5:icmpne          9
    //    4    8:return          
    //    5    9:aload_0         
    //    6   10:iload_1         
    //    7   11:putfield        #361 <Field boolean mIconifiedByDefault>
    //    8   14:aload_0         
    //    9   15:iload_1         
    //   10   16:invokespecial   #364 <Method void updateViewsVisibility(boolean)>
    //   11   19:aload_0         
    //   12   20:invokespecial   #367 <Method void updateQueryHint()>
    //   13   23:return          
    }

    public void setImeOptions(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #1039 <Method void SearchView$SearchAutoComplete.setImeOptions(int)>
    //    4    8:return          
    }

    public void setInputType(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #1048 <Method void SearchView$SearchAutoComplete.setInputType(int)>
    //    4    8:return          
    }

    public void setMaxWidth(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #1082 <Field int mMaxWidth>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #1146 <Method void requestLayout()>
    //    5    9:return          
    }

    public void setOnCloseListener(OnCloseListener oncloselistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #840 <Field SearchView$OnCloseListener mOnCloseListener>
    //    3    5:return          
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener onfocuschangelistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #422 <Field android.view.View$OnFocusChangeListener mOnQueryTextFocusChangeListener>
    //    3    5:return          
    }

    public void setOnQueryTextListener(OnQueryTextListener onquerytextlistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #887 <Field SearchView$OnQueryTextListener mOnQueryChangeListener>
    //    3    5:return          
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener onclicklistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #875 <Field android.view.View$OnClickListener mOnSearchClickListener>
    //    3    5:return          
    }

    public void setOnSuggestionListener(OnSuggestionListener onsuggestionlistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #858 <Field SearchView$OnSuggestionListener mOnSuggestionListener>
    //    3    5:return          
    }

    public void setQuery(CharSequence charsequence, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #853 <Method void SearchView$SearchAutoComplete.setText(CharSequence)>
    //    4    8:aload_1         
    //    5    9:ifnull          31
    //    6   12:aload_0         
    //    7   13:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    8   16:aload_0         
    //    9   17:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   10   20:invokevirtual   #926 <Method int SearchView$SearchAutoComplete.length()>
    //   11   23:invokevirtual   #913 <Method void SearchView$SearchAutoComplete.setSelection(int)>
    //   12   26:aload_0         
    //   13   27:aload_1         
    //   14   28:putfield        #534 <Field CharSequence mUserQuery>
    //   15   31:iload_2         
    //   16   32:ifeq            46
    //   17   35:aload_1         
    //   18   36:invokestatic    #297 <Method boolean TextUtils.isEmpty(CharSequence)>
    //   19   39:ifne            46
    //   20   42:aload_0         
    //   21   43:invokespecial   #452 <Method void onSubmitQuery()>
    //   22   46:return          
    }

    public void setQueryHint(CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #1019 <Field CharSequence mQueryHint>
    //    3    5:aload_0         
    //    4    6:invokespecial   #367 <Method void updateQueryHint()>
    //    5    9:return          
    }

    public void setQueryRefinementEnabled(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #1061 <Field boolean mQueryRefinement>
    //    3    5:aload_0         
    //    4    6:getfield        #378 <Field CursorAdapter mSuggestionsAdapter>
    //    5    9:instanceof      #573 <Class SuggestionsAdapter>
    //    6   12:ifeq            34
    //    7   15:aload_0         
    //    8   16:getfield        #378 <Field CursorAdapter mSuggestionsAdapter>
    //    9   19:checkcast       #573 <Class SuggestionsAdapter>
    //   10   22:astore_2        
    //   11   23:iload_1         
    //   12   24:ifeq            35
    //   13   27:iconst_2        
    //   14   28:istore_3        
    //   15   29:aload_2         
    //   16   30:iload_3         
    //   17   31:invokevirtual   #1064 <Method void SuggestionsAdapter.setQueryRefinement(int)>
    //   18   34:return          
    //   19   35:iconst_1        
    //   20   36:istore_3        
    //   21   37:goto            29
    }

    public void setSearchableInfo(SearchableInfo searchableinfo)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #394 <Field SearchableInfo mSearchable>
    //    3    5:aload_0         
    //    4    6:getfield        #394 <Field SearchableInfo mSearchable>
    //    5    9:ifnull          20
    //    6   12:aload_0         
    //    7   13:invokespecial   #1160 <Method void updateSearchAutoComplete()>
    //    8   16:aload_0         
    //    9   17:invokespecial   #367 <Method void updateQueryHint()>
    //   10   20:aload_0         
    //   11   21:aload_0         
    //   12   22:invokespecial   #1162 <Method boolean hasVoiceSearch()>
    //   13   25:putfield        #806 <Field boolean mVoiceButtonEnabled>
    //   14   28:aload_0         
    //   15   29:getfield        #806 <Field boolean mVoiceButtonEnabled>
    //   16   32:ifeq            44
    //   17   35:aload_0         
    //   18   36:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //   19   39:ldc1            #15  <String "nm">
    //   20   41:invokevirtual   #1165 <Method void SearchView$SearchAutoComplete.setPrivateImeOptions(String)>
    //   21   44:aload_0         
    //   22   45:aload_0         
    //   23   46:invokevirtual   #809 <Method boolean isIconified()>
    //   24   49:invokespecial   #364 <Method void updateViewsVisibility(boolean)>
    //   25   52:return          
    }

    public void setSubmitButtonEnabled(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #804 <Field boolean mSubmitButtonEnabled>
    //    3    5:aload_0         
    //    4    6:aload_0         
    //    5    7:invokevirtual   #809 <Method boolean isIconified()>
    //    6   10:invokespecial   #364 <Method void updateViewsVisibility(boolean)>
    //    7   13:return          
    }

    public void setSuggestionsAdapter(CursorAdapter cursoradapter)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #378 <Field CursorAdapter mSuggestionsAdapter>
    //    3    5:aload_0         
    //    4    6:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    5    9:aload_0         
    //    6   10:getfield        #378 <Field CursorAdapter mSuggestionsAdapter>
    //    7   13:invokevirtual   #1059 <Method void SearchView$SearchAutoComplete.setAdapter(android.widget.ListAdapter)>
    //    8   16:return          
    }

    private static final boolean DBG = false;
    static final AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER;
    private static final String IME_OPTION_NO_MICROPHONE = "nm";
    private static final String LOG_TAG = "SearchView";
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    private ImageView mCloseButton;
    private int mCollapsedImeOptions;
    private View mDropDownAnchor;
    private boolean mExpandedInActionView;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private CharSequence mOldQueryText;
    private final android.view.View.OnClickListener mOnClickListener;
    private OnCloseListener mOnCloseListener;
    private final android.widget.TextView.OnEditorActionListener mOnEditorActionListener;
    private final android.widget.AdapterView.OnItemClickListener mOnItemClickListener;
    private final android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    private OnQueryTextListener mOnQueryChangeListener;
    private android.view.View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private android.view.View.OnClickListener mOnSearchClickListener;
    private OnSuggestionListener mOnSuggestionListener;
    private final WeakHashMap mOutsideDrawablesCache;
    private CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private SearchAutoComplete mQueryTextView;
    private Runnable mReleaseCursorRunnable;
    private View mSearchButton;
    private View mSearchEditFrame;
    private ImageView mSearchHintIcon;
    private View mSearchPlate;
    private SearchableInfo mSearchable;
    private Runnable mShowImeRunnable;
    private View mSubmitArea;
    private View mSubmitButton;
    private boolean mSubmitButtonEnabled;
    private CursorAdapter mSuggestionsAdapter;
    android.view.View.OnKeyListener mTextKeyListener;
    private TextWatcher mTextWatcher;
    private Runnable mUpdateDrawableStateRunnable;
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    private View mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;

    static void access$000(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #374 <Method void updateFocusedState()>
    //    2    4:return          
    }

    static CursorAdapter access$100(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #378 <Field CursorAdapter mSuggestionsAdapter>
    //    2    4:areturn         
    }

    static View access$1000(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #220 <Field View mVoiceButton>
    //    2    4:areturn         
    }

    static void access$1100(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #384 <Method void onVoiceClicked()>
    //    2    4:return          
    }

    static SearchAutoComplete access$1200(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #185 <Field SearchView$SearchAutoComplete mQueryTextView>
    //    2    4:areturn         
    }

    static void access$1300(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #390 <Method void forceSuggestionQuery()>
    //    2    4:return          
    }

    static SearchableInfo access$1400(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #394 <Field SearchableInfo mSearchable>
    //    2    4:areturn         
    }

    static boolean access$1500(SearchView searchview, View view, int i, KeyEvent keyevent)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:aload_3         
    //    4    4:invokespecial   #400 <Method boolean onSuggestionsKey(View, int, KeyEvent)>
    //    5    7:ireturn         
    }

    static void access$1700(SearchView searchview, int i, String s, String s1)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:aload_2         
    //    3    3:aload_3         
    //    4    4:invokespecial   #406 <Method void launchQuerySearch(int, String, String)>
    //    5    7:return          
    }

    static boolean access$1800(SearchView searchview, int i, int j, String s)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:aload_3         
    //    4    4:invokespecial   #412 <Method boolean onItemClicked(int, int, String)>
    //    5    7:ireturn         
    }

    static boolean access$1900(SearchView searchview, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #418 <Method boolean onItemSelected(int)>
    //    3    5:ireturn         
    }

    static android.view.View.OnFocusChangeListener access$200(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #422 <Field android.view.View$OnFocusChangeListener mOnQueryTextFocusChangeListener>
    //    2    4:areturn         
    }

    static void access$2000(SearchView searchview, CharSequence charsequence)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #427 <Method void onTextChanged(CharSequence)>
    //    3    5:return          
    }

    static void access$2100(SearchView searchview, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #432 <Method void setImeVisibility(boolean)>
    //    3    5:return          
    }

    static void access$300(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #436 <Method void adjustDropDownSizeAndPosition()>
    //    2    4:return          
    }

    static View access$400(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #178 <Field View mSearchButton>
    //    2    4:areturn         
    }

    static void access$500(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #441 <Method void onSearchClicked()>
    //    2    4:return          
    }

    static ImageView access$600(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #215 <Field ImageView mCloseButton>
    //    2    4:areturn         
    }

    static void access$700(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #447 <Method void onCloseClicked()>
    //    2    4:return          
    }

    static View access$800(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #208 <Field View mSubmitButton>
    //    2    4:areturn         
    }

    static void access$900(SearchView searchview)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #452 <Method void onSubmitQuery()>
    //    2    4:return          
    }

    // Unreferenced inner class android/support/v7/widget/SearchView$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field SearchView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field SearchView this$0>
        //    2    4:invokevirtual   #22  <Method Context SearchView.getContext()>
        //    3    7:ldc1            #24  <String "input_method">
        //    4    9:invokevirtual   #30  <Method Object Context.getSystemService(String)>
        //    5   12:checkcast       #32  <Class InputMethodManager>
        //    6   15:astore_1        
        //    7   16:aload_1         
        //    8   17:ifnull          32
        //    9   20:getstatic       #36  <Field SearchView$AutoCompleteTextViewReflector SearchView.HIDDEN_METHOD_INVOKER>
        //   10   23:aload_1         
        //   11   24:aload_0         
        //   12   25:getfield        #14  <Field SearchView this$0>
        //   13   28:iconst_0        
        //   14   29:invokevirtual   #42  <Method void SearchView$AutoCompleteTextViewReflector.showSoftInputUnchecked(InputMethodManager, View, int)>
        //   15   32:return          
        }

        final SearchView this$0;
    }


    // Unreferenced inner class android/support/v7/widget/SearchView$10

/* anonymous class */
    class _cls10
        implements android.widget.AdapterView.OnItemClickListener
    {

        _cls10()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field SearchView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field SearchView this$0>
        //    2    4:iload_3         
        //    3    5:iconst_0        
        //    4    6:aconst_null     
        //    5    7:invokestatic    #23  <Method boolean SearchView.access$1800(SearchView, int, int, String)>
        //    6   10:pop             
        //    7   11:return          
        }

        final SearchView this$0;
    }


    // Unreferenced inner class android/support/v7/widget/SearchView$11

/* anonymous class */
    class _cls11
        implements android.widget.AdapterView.OnItemSelectedListener
    {

        _cls11()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field SearchView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void onItemSelected(AdapterView adapterview, View view, int i, long l)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field SearchView this$0>
        //    2    4:iload_3         
        //    3    5:invokestatic    #23  <Method boolean SearchView.access$1900(SearchView, int)>
        //    4    8:pop             
        //    5    9:return          
        }

        public void onNothingSelected(AdapterView adapterview)
        {
        //    0    0:return          
        }

        final SearchView this$0;
    }


    // Unreferenced inner class android/support/v7/widget/SearchView$12

/* anonymous class */
    class _cls12
        implements TextWatcher
    {

        _cls12()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field SearchView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void afterTextChanged(Editable editable)
        {
        //    0    0:return          
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        //    0    0:return          
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field SearchView this$0>
        //    2    4:aload_1         
        //    3    5:invokestatic    #26  <Method void SearchView.access$2000(SearchView, CharSequence)>
        //    4    8:return          
        }

        final SearchView this$0;
    }


    // Unreferenced inner class android/support/v7/widget/SearchView$2

/* anonymous class */
    class _cls2
        implements Runnable
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field SearchView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field SearchView this$0>
        //    2    4:invokestatic    #21  <Method void SearchView.access$000(SearchView)>
        //    3    7:return          
        }

        final SearchView this$0;
    }


    // Unreferenced inner class android/support/v7/widget/SearchView$3

/* anonymous class */
    class _cls3
        implements Runnable
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field SearchView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field SearchView this$0>
        //    2    4:invokestatic    #22  <Method CursorAdapter SearchView.access$100(SearchView)>
        //    3    7:ifnull          34
        //    4   10:aload_0         
        //    5   11:getfield        #14  <Field SearchView this$0>
        //    6   14:invokestatic    #22  <Method CursorAdapter SearchView.access$100(SearchView)>
        //    7   17:instanceof      #24  <Class SuggestionsAdapter>
        //    8   20:ifeq            34
        //    9   23:aload_0         
        //   10   24:getfield        #14  <Field SearchView this$0>
        //   11   27:invokestatic    #22  <Method CursorAdapter SearchView.access$100(SearchView)>
        //   12   30:aconst_null     
        //   13   31:invokevirtual   #30  <Method void CursorAdapter.changeCursor(Cursor)>
        //   14   34:return          
        }

        final SearchView this$0;
    }


    // Unreferenced inner class android/support/v7/widget/SearchView$4

/* anonymous class */
    class _cls4
        implements android.view.View.OnFocusChangeListener
    {

        _cls4()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field SearchView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onFocusChange(View view, boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field SearchView this$0>
        //    2    4:invokestatic    #25  <Method android.view.View$OnFocusChangeListener SearchView.access$200(SearchView)>
        //    3    7:ifnull          27
        //    4   10:aload_0         
        //    5   11:getfield        #16  <Field SearchView this$0>
        //    6   14:invokestatic    #25  <Method android.view.View$OnFocusChangeListener SearchView.access$200(SearchView)>
        //    7   17:aload_0         
        //    8   18:getfield        #16  <Field SearchView this$0>
        //    9   21:iload_2         
        //   10   22:invokeinterface #27  <Method void android.view.View$OnFocusChangeListener.onFocusChange(View, boolean)>
        //   11   27:return          
        }

        final SearchView this$0;
    }


    // Unreferenced inner class android/support/v7/widget/SearchView$5

/* anonymous class */
    class _cls5
        implements android.view.View.OnLayoutChangeListener
    {

        _cls5()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field SearchView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field SearchView this$0>
        //    2    4:invokestatic    #24  <Method void SearchView.access$300(SearchView)>
        //    3    7:return          
        }

        final SearchView this$0;
    }


    // Unreferenced inner class android/support/v7/widget/SearchView$6

/* anonymous class */
    class _cls6
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        _cls6()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field SearchView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onGlobalLayout()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field SearchView this$0>
        //    2    4:invokestatic    #23  <Method void SearchView.access$300(SearchView)>
        //    3    7:return          
        }

        final SearchView this$0;
    }


    // Unreferenced inner class android/support/v7/widget/SearchView$7

/* anonymous class */
    class _cls7
        implements android.view.View.OnClickListener
    {

        _cls7()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field SearchView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_1         
        //    1    1:aload_0         
        //    2    2:getfield        #14  <Field SearchView this$0>
        //    3    5:invokestatic    #23  <Method View SearchView.access$400(SearchView)>
        //    4    8:if_acmpne       19
        //    5   11:aload_0         
        //    6   12:getfield        #14  <Field SearchView this$0>
        //    7   15:invokestatic    #26  <Method void SearchView.access$500(SearchView)>
        //    8   18:return          
        //    9   19:aload_1         
        //   10   20:aload_0         
        //   11   21:getfield        #14  <Field SearchView this$0>
        //   12   24:invokestatic    #30  <Method ImageView SearchView.access$600(SearchView)>
        //   13   27:if_acmpne       38
        //   14   30:aload_0         
        //   15   31:getfield        #14  <Field SearchView this$0>
        //   16   34:invokestatic    #33  <Method void SearchView.access$700(SearchView)>
        //   17   37:return          
        //   18   38:aload_1         
        //   19   39:aload_0         
        //   20   40:getfield        #14  <Field SearchView this$0>
        //   21   43:invokestatic    #36  <Method View SearchView.access$800(SearchView)>
        //   22   46:if_acmpne       57
        //   23   49:aload_0         
        //   24   50:getfield        #14  <Field SearchView this$0>
        //   25   53:invokestatic    #39  <Method void SearchView.access$900(SearchView)>
        //   26   56:return          
        //   27   57:aload_1         
        //   28   58:aload_0         
        //   29   59:getfield        #14  <Field SearchView this$0>
        //   30   62:invokestatic    #42  <Method View SearchView.access$1000(SearchView)>
        //   31   65:if_acmpne       76
        //   32   68:aload_0         
        //   33   69:getfield        #14  <Field SearchView this$0>
        //   34   72:invokestatic    #45  <Method void SearchView.access$1100(SearchView)>
        //   35   75:return          
        //   36   76:aload_1         
        //   37   77:aload_0         
        //   38   78:getfield        #14  <Field SearchView this$0>
        //   39   81:invokestatic    #49  <Method SearchView$SearchAutoComplete SearchView.access$1200(SearchView)>
        //   40   84:if_acmpne       18
        //   41   87:aload_0         
        //   42   88:getfield        #14  <Field SearchView this$0>
        //   43   91:invokestatic    #52  <Method void SearchView.access$1300(SearchView)>
        //   44   94:return          
        }

        final SearchView this$0;
    }


    // Unreferenced inner class android/support/v7/widget/SearchView$8

/* anonymous class */
    class _cls8
        implements android.view.View.OnKeyListener
    {

        _cls8()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field SearchView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public boolean onKey(View view, int i, KeyEvent keyevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field SearchView this$0>
        //    2    4:invokestatic    #23  <Method SearchableInfo SearchView.access$1400(SearchView)>
        //    3    7:ifnonnull       12
        //    4   10:iconst_0        
        //    5   11:ireturn         
        //    6   12:aload_0         
        //    7   13:getfield        #14  <Field SearchView this$0>
        //    8   16:invokestatic    #27  <Method SearchView$SearchAutoComplete SearchView.access$1200(SearchView)>
        //    9   19:invokevirtual   #33  <Method boolean SearchView$SearchAutoComplete.isPopupShowing()>
        //   10   22:ifeq            50
        //   11   25:aload_0         
        //   12   26:getfield        #14  <Field SearchView this$0>
        //   13   29:invokestatic    #27  <Method SearchView$SearchAutoComplete SearchView.access$1200(SearchView)>
        //   14   32:invokevirtual   #37  <Method int SearchView$SearchAutoComplete.getListSelection()>
        //   15   35:iconst_m1       
        //   16   36:icmpeq          50
        //   17   39:aload_0         
        //   18   40:getfield        #14  <Field SearchView this$0>
        //   19   43:aload_1         
        //   20   44:iload_2         
        //   21   45:aload_3         
        //   22   46:invokestatic    #41  <Method boolean SearchView.access$1500(SearchView, View, int, KeyEvent)>
        //   23   49:ireturn         
        //   24   50:aload_0         
        //   25   51:getfield        #14  <Field SearchView this$0>
        //   26   54:invokestatic    #27  <Method SearchView$SearchAutoComplete SearchView.access$1200(SearchView)>
        //   27   57:invokestatic    #45  <Method boolean SearchView$SearchAutoComplete.access$1600(SearchView$SearchAutoComplete)>
        //   28   60:ifne            10
        //   29   63:aload_3         
        //   30   64:invokestatic    #51  <Method boolean KeyEventCompat.hasNoModifiers(KeyEvent)>
        //   31   67:ifeq            10
        //   32   70:aload_3         
        //   33   71:invokevirtual   #56  <Method int KeyEvent.getAction()>
        //   34   74:iconst_1        
        //   35   75:icmpne          10
        //   36   78:iload_2         
        //   37   79:bipush          66
        //   38   81:icmpne          10
        //   39   84:aload_1         
        //   40   85:invokevirtual   #61  <Method void View.cancelLongPress()>
        //   41   88:aload_0         
        //   42   89:getfield        #14  <Field SearchView this$0>
        //   43   92:iconst_0        
        //   44   93:aconst_null     
        //   45   94:aload_0         
        //   46   95:getfield        #14  <Field SearchView this$0>
        //   47   98:invokestatic    #27  <Method SearchView$SearchAutoComplete SearchView.access$1200(SearchView)>
        //   48  101:invokevirtual   #65  <Method Editable SearchView$SearchAutoComplete.getText()>
        //   49  104:invokevirtual   #69  <Method String Object.toString()>
        //   50  107:invokestatic    #73  <Method void SearchView.access$1700(SearchView, int, String, String)>
        //   51  110:iconst_1        
        //   52  111:ireturn         
        }

        final SearchView this$0;
    }


    // Unreferenced inner class android/support/v7/widget/SearchView$9

/* anonymous class */
    class _cls9
        implements android.widget.TextView.OnEditorActionListener
    {

        _cls9()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field SearchView this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field SearchView this$0>
        //    2    4:invokestatic    #22  <Method void SearchView.access$900(SearchView)>
        //    3    7:iconst_1        
        //    4    8:ireturn         
        }

        final SearchView this$0;
    }

}
