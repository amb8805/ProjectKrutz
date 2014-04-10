// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.app.Activity;
import android.content.*;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.ads.internal.a;
import com.google.ads.util.b;
import com.google.ads.util.f;
import java.lang.ref.WeakReference;
import java.util.Date;

// Referenced classes of package com.google.ads:
//            as

public final class at
{
    private static class a
        implements Runnable
    {

        public a(Activity activity)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aconst_null     
        //    3    3:invokespecial   #16  <Method void at$a(Activity, android.content.SharedPreferences$Editor)>
        //    4    6:return          
        }

        a(Activity activity, android.content.SharedPreferences.Editor editor)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #19  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:new             #21  <Class WeakReference>
        //    4    8:dup             
        //    5    9:aload_1         
        //    6   10:invokespecial   #24  <Method void WeakReference(Object)>
        //    7   13:putfield        #26  <Field WeakReference a>
        //    8   16:aload_0         
        //    9   17:aload_2         
        //   10   18:putfield        #28  <Field android.content.SharedPreferences$Editor b>
        //   11   21:return          
        }

        private android.content.SharedPreferences.Editor a(Context context)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #28  <Field android.content.SharedPreferences$Editor b>
        //    2    4:ifnonnull       20
        //    3    7:aload_1         
        //    4    8:invokevirtual   #35  <Method Context Context.getApplicationContext()>
        //    5   11:invokestatic    #41  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
        //    6   14:invokeinterface #47  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
        //    7   19:areturn         
        //    8   20:aload_0         
        //    9   21:getfield        #28  <Field android.content.SharedPreferences$Editor b>
        //   10   24:areturn         
        }

        public void run()
        {
        // try 0 11 handler(s) 138
        //    0    0:aload_0         
        //    1    1:getfield        #26  <Field WeakReference a>
        //    2    4:invokevirtual   #54  <Method Object WeakReference.get()>
        //    3    7:checkcast       #56  <Class Activity>
        //    4   10:astore_2        
        //    5   11:aload_2         
        //    6   12:ifnonnull       21
        // try 15 20 handler(s) 138
        //    7   15:ldc1            #58  <String "Activity was null while making a doritos cookie request.">
        //    8   17:invokestatic    #63  <Method void b.a(String)>
        //    9   20:return          
        // try 21 38 handler(s) 138
        //   10   21:aload_2         
        //   11   22:invokevirtual   #67  <Method ContentResolver Activity.getContentResolver()>
        //   12   25:getstatic       #72  <Field android.net.Uri com.google.ads.as.a>
        //   13   28:getstatic       #75  <Field String[] com.google.ads.as.b>
        //   14   31:aconst_null     
        //   15   32:aconst_null     
        //   16   33:aconst_null     
        //   17   34:invokevirtual   #81  <Method Cursor ContentResolver.query(android.net.Uri, String[], String, String[], String)>
        //   18   37:astore_3        
        //   19   38:aload_3         
        //   20   39:ifnull          146
        // try 42 82 handler(s) 138
        //   21   42:aload_3         
        //   22   43:invokeinterface #87  <Method boolean Cursor.moveToFirst()>
        //   23   48:ifeq            146
        //   24   51:aload_3         
        //   25   52:invokeinterface #91  <Method String[] Cursor.getColumnNames()>
        //   26   57:arraylength     
        //   27   58:ifle            146
        //   28   61:aload_3         
        //   29   62:aload_3         
        //   30   63:aload_3         
        //   31   64:iconst_0        
        //   32   65:invokeinterface #95  <Method String Cursor.getColumnName(int)>
        //   33   70:invokeinterface #99  <Method int Cursor.getColumnIndex(String)>
        //   34   75:invokeinterface #102 <Method String Cursor.getString(int)>
        //   35   80:astore          4
        // try 82 129 handler(s) 138
        //   36   82:aload_0         
        //   37   83:aload_2         
        //   38   84:invokespecial   #104 <Method android.content.SharedPreferences$Editor a(Context)>
        //   39   87:astore          5
        //   40   89:aload           4
        //   41   91:invokestatic    #110 <Method boolean TextUtils.isEmpty(CharSequence)>
        //   42   94:ifne            157
        //   43   97:aload           5
        //   44   99:ldc1            #112 <String "drt">
        //   45  101:aload           4
        //   46  103:invokeinterface #118 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
        //   47  108:pop             
        //   48  109:aload           5
        //   49  111:ldc1            #120 <String "drt_ts">
        //   50  113:new             #122 <Class Date>
        //   51  116:dup             
        //   52  117:invokespecial   #123 <Method void Date()>
        //   53  120:invokevirtual   #127 <Method long Date.getTime()>
        //   54  123:invokeinterface #131 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
        //   55  128:pop             
        // try 129 137 handler(s) 138
        //   56  129:aload           5
        //   57  131:invokeinterface #134 <Method boolean android.content.SharedPreferences$Editor.commit()>
        //   58  136:pop             
        //   59  137:return          
        // catch Throwable Throwable Throwable Throwable Throwable Throwable Throwable Throwable
        //   60  138:astore_1        
        //   61  139:ldc1            #136 <String "An unknown error occurred while sending a doritos request.">
        //   62  141:aload_1         
        //   63  142:invokestatic    #140 <Method void b.d(String, Throwable)>
        //   64  145:return          
        // try 146 151 handler(s) 138
        //   65  146:ldc1            #142 <String "Google+ app not installed, not storing doritos cookie">
        //   66  148:invokestatic    #63  <Method void b.a(String)>
        //   67  151:aconst_null     
        //   68  152:astore          4
        //   69  154:goto            82
        // try 157 180 handler(s) 138
        //   70  157:aload           5
        //   71  159:ldc1            #112 <String "drt">
        //   72  161:ldc1            #144 <String "">
        //   73  163:invokeinterface #118 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
        //   74  168:pop             
        //   75  169:aload           5
        //   76  171:ldc1            #120 <String "drt_ts">
        //   77  173:lconst_0        
        //   78  174:invokeinterface #131 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
        //   79  179:pop             
        //   80  180:goto            129
        }

        private final WeakReference a;
        private final android.content.SharedPreferences.Editor b;
    }


    static 
    {
    //    0    0:getstatic       #13  <Field f a.a>
    //    1    3:invokeinterface #19  <Method Object f.b()>
    //    2    8:checkcast       #10  <Class a>
    //    3   11:putstatic       #21  <Field a a>
    //    4   14:return          
    }

    public static void a(Activity activity)
    {
    //    0    0:new             #24  <Class Thread>
    //    1    3:dup             
    //    2    4:new             #26  <Class at$a>
    //    3    7:dup             
    //    4    8:aload_0         
    //    5    9:invokespecial   #29  <Method void at$a(Activity)>
    //    6   12:invokespecial   #32  <Method void Thread(Runnable)>
    //    7   15:invokevirtual   #35  <Method void Thread.start()>
    //    8   18:return          
    }

    public static boolean a(Context context, long l)
    {
    //    0    0:aload_0         
    //    1    1:lload_1         
    //    2    2:aload_0         
    //    3    3:invokevirtual   #42  <Method Context Context.getApplicationContext()>
    //    4    6:invokestatic    #48  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
    //    5    9:invokestatic    #51  <Method boolean a(Context, long, SharedPreferences)>
    //    6   12:ifne            17
    //    7   15:iconst_0        
    //    8   16:ireturn         
    //    9   17:new             #24  <Class Thread>
    //   10   20:dup             
    //   11   21:new             #53  <Class at$1>
    //   12   24:dup             
    //   13   25:aload_0         
    //   14   26:invokespecial   #56  <Method void at$1(Context)>
    //   15   29:invokespecial   #32  <Method void Thread(Runnable)>
    //   16   32:invokevirtual   #35  <Method void Thread.start()>
    //   17   35:iconst_1        
    //   18   36:ireturn         
    }

    static boolean a(Context context, long l, SharedPreferences sharedpreferences)
    {
    //    0    0:aload_3         
    //    1    1:ldc1            #58  <String "drt">
    //    2    3:invokeinterface #64  <Method boolean SharedPreferences.contains(String)>
    //    3    8:ifeq            47
    //    4   11:aload_3         
    //    5   12:ldc1            #66  <String "drt_ts">
    //    6   14:invokeinterface #64  <Method boolean SharedPreferences.contains(String)>
    //    7   19:ifeq            47
    //    8   22:aload_3         
    //    9   23:ldc1            #66  <String "drt_ts">
    //   10   25:lconst_0        
    //   11   26:invokeinterface #70  <Method long SharedPreferences.getLong(String, long)>
    //   12   31:new             #72  <Class Date>
    //   13   34:dup             
    //   14   35:invokespecial   #74  <Method void Date()>
    //   15   38:invokevirtual   #78  <Method long Date.getTime()>
    //   16   41:lload_1         
    //   17   42:lsub            
    //   18   43:lcmp            
    //   19   44:ifge            49
    //   20   47:iconst_1        
    //   21   48:ireturn         
    //   22   49:iconst_0        
    //   23   50:ireturn         
    }

    private static final com.google.ads.internal.a a;

    // Unreferenced inner class com/google/ads/at$1

/* anonymous class */
    static final class _cls1
        implements Runnable
    {

        _cls1(Context context)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field Context a>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field Context a>
        //    2    4:invokevirtual   #26  <Method Context Context.getApplicationContext()>
        //    3    7:invokestatic    #32  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
        //    4   10:invokeinterface #38  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
        //    5   15:astore_1        
        //    6   16:aload_1         
        //    7   17:ldc1            #40  <String "drt">
        //    8   19:ldc1            #42  <String "">
        //    9   21:invokeinterface #48  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
        //   10   26:pop             
        //   11   27:aload_1         
        //   12   28:ldc1            #50  <String "drt_ts">
        //   13   30:lconst_0        
        //   14   31:invokeinterface #54  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
        //   15   36:pop             
        //   16   37:aload_1         
        //   17   38:invokeinterface #58  <Method boolean android.content.SharedPreferences$Editor.commit()>
        //   18   43:pop             
        //   19   44:return          
        }

        final Context a;
    }

}
