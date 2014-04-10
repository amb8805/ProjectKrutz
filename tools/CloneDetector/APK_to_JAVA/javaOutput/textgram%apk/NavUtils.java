// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.app.Activity;
import android.content.*;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.content.IntentCompat;
import android.util.Log;

// Referenced classes of package android.support.v4.app:
//            NavUtilsJB

public class NavUtils
{
    static interface NavUtilsImpl
    {

        public abstract Intent getParentActivityIntent(Activity activity);

        public abstract String getParentActivityName(Context context, ActivityInfo activityinfo);

        public abstract void navigateUpTo(Activity activity, Intent intent);

        public abstract boolean shouldUpRecreateTask(Activity activity, Intent intent);
    }

    static class NavUtilsImplBase
        implements NavUtilsImpl
    {

        NavUtilsImplBase()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public Intent getParentActivityIntent(Activity activity)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #20  <Method String NavUtils.getParentActivityName(Activity)>
        //    2    4:astore_2        
        //    3    5:aload_2         
        //    4    6:ifnonnull       11
        //    5    9:aconst_null     
        //    6   10:areturn         
        //    7   11:new             #22  <Class ComponentName>
        //    8   14:dup             
        //    9   15:aload_1         
        //   10   16:aload_2         
        //   11   17:invokespecial   #25  <Method void ComponentName(Context, String)>
        //   12   20:astore_3        
        // try 21 35 handler(s) 58
        //   13   21:aload_1         
        //   14   22:aload_3         
        //   15   23:invokestatic    #28  <Method String NavUtils.getParentActivityName(Context, ComponentName)>
        //   16   26:ifnonnull       38
        //   17   29:aload_3         
        //   18   30:invokestatic    #34  <Method Intent IntentCompat.makeMainActivity(ComponentName)>
        //   19   33:astore          7
        //   20   35:goto            92
        // try 38 51 handler(s) 58
        //   21   38:new             #36  <Class Intent>
        //   22   41:dup             
        //   23   42:invokespecial   #37  <Method void Intent()>
        //   24   45:aload_3         
        //   25   46:invokevirtual   #40  <Method Intent Intent.setComponent(ComponentName)>
        //   26   49:astore          6
        //   27   51:aload           6
        //   28   53:astore          7
        //   29   55:goto            92
        // catch android.content.pm.PackageManager.NameNotFoundException android.content.pm.PackageManager.NameNotFoundException
        //   30   58:astore          4
        //   31   60:ldc1            #42  <String "NavUtils">
        //   32   62:new             #44  <Class StringBuilder>
        //   33   65:dup             
        //   34   66:invokespecial   #45  <Method void StringBuilder()>
        //   35   69:ldc1            #47  <String "getParentActivityIntent: bad parentActivityName '">
        //   36   71:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
        //   37   74:aload_2         
        //   38   75:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
        //   39   78:ldc1            #53  <String "' in manifest">
        //   40   80:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
        //   41   83:invokevirtual   #57  <Method String StringBuilder.toString()>
        //   42   86:invokestatic    #63  <Method int Log.e(String, String)>
        //   43   89:pop             
        //   44   90:aconst_null     
        //   45   91:areturn         
        //   46   92:aload           7
        //   47   94:areturn         
        }

        public String getParentActivityName(Context context, ActivityInfo activityinfo)
        {
        //    0    0:aload_2         
        //    1    1:getfield        #70  <Field Bundle ActivityInfo.metaData>
        //    2    4:ifnonnull       11
        //    3    7:aconst_null     
        //    4    8:astore_3        
        //    5    9:aload_3         
        //    6   10:areturn         
        //    7   11:aload_2         
        //    8   12:getfield        #70  <Field Bundle ActivityInfo.metaData>
        //    9   15:ldc1            #72  <String "android.support.PARENT_ACTIVITY">
        //   10   17:invokevirtual   #78  <Method String Bundle.getString(String)>
        //   11   20:astore_3        
        //   12   21:aload_3         
        //   13   22:ifnonnull       27
        //   14   25:aconst_null     
        //   15   26:areturn         
        //   16   27:aload_3         
        //   17   28:iconst_0        
        //   18   29:invokevirtual   #84  <Method char String.charAt(int)>
        //   19   32:bipush          46
        //   20   34:icmpne          9
        //   21   37:new             #44  <Class StringBuilder>
        //   22   40:dup             
        //   23   41:invokespecial   #45  <Method void StringBuilder()>
        //   24   44:aload_1         
        //   25   45:invokevirtual   #89  <Method String Context.getPackageName()>
        //   26   48:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
        //   27   51:aload_3         
        //   28   52:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
        //   29   55:invokevirtual   #57  <Method String StringBuilder.toString()>
        //   30   58:areturn         
        }

        public void navigateUpTo(Activity activity, Intent intent)
        {
        //    0    0:aload_2         
        //    1    1:ldc1            #92  <Int 0x4000000>
        //    2    3:invokevirtual   #96  <Method Intent Intent.addFlags(int)>
        //    3    6:pop             
        //    4    7:aload_1         
        //    5    8:aload_2         
        //    6    9:invokevirtual   #102 <Method void Activity.startActivity(Intent)>
        //    7   12:aload_1         
        //    8   13:invokevirtual   #105 <Method void Activity.finish()>
        //    9   16:return          
        }

        public boolean shouldUpRecreateTask(Activity activity, Intent intent)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #111 <Method Intent Activity.getIntent()>
        //    2    4:invokevirtual   #114 <Method String Intent.getAction()>
        //    3    7:astore_3        
        //    4    8:aload_3         
        //    5    9:ifnull          23
        //    6   12:aload_3         
        //    7   13:ldc1            #116 <String "android.intent.action.MAIN">
        //    8   15:invokevirtual   #120 <Method boolean String.equals(Object)>
        //    9   18:ifne            23
        //   10   21:iconst_1        
        //   11   22:ireturn         
        //   12   23:iconst_0        
        //   13   24:ireturn         
        }
    }

    static class NavUtilsImplJB extends NavUtilsImplBase
    {

        NavUtilsImplJB()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void NavUtils$NavUtilsImplBase()>
        //    2    4:return          
        }

        public Intent getParentActivityIntent(Activity activity)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #14  <Method Intent NavUtilsJB.getParentActivityIntent(Activity)>
        //    2    4:astore_2        
        //    3    5:aload_2         
        //    4    6:ifnonnull       15
        //    5    9:aload_0         
        //    6   10:aload_1         
        //    7   11:invokevirtual   #17  <Method Intent superGetParentActivityIntent(Activity)>
        //    8   14:astore_2        
        //    9   15:aload_2         
        //   10   16:areturn         
        }

        public String getParentActivityName(Context context, ActivityInfo activityinfo)
        {
        //    0    0:aload_2         
        //    1    1:invokestatic    #22  <Method String NavUtilsJB.getParentActivityName(ActivityInfo)>
        //    2    4:astore_3        
        //    3    5:aload_3         
        //    4    6:ifnonnull       16
        //    5    9:aload_0         
        //    6   10:aload_1         
        //    7   11:aload_2         
        //    8   12:invokespecial   #24  <Method String NavUtils$NavUtilsImplBase.getParentActivityName(Context, ActivityInfo)>
        //    9   15:astore_3        
        //   10   16:aload_3         
        //   11   17:areturn         
        }

        public void navigateUpTo(Activity activity, Intent intent)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokestatic    #28  <Method void NavUtilsJB.navigateUpTo(Activity, Intent)>
        //    3    5:return          
        }

        public boolean shouldUpRecreateTask(Activity activity, Intent intent)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokestatic    #32  <Method boolean NavUtilsJB.shouldUpRecreateTask(Activity, Intent)>
        //    3    5:ireturn         
        }

        Intent superGetParentActivityIntent(Activity activity)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #33  <Method Intent NavUtils$NavUtilsImplBase.getParentActivityIntent(Activity)>
        //    3    5:areturn         
        }
    }


    static 
    {
    //    0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          16
    //    2    5:icmplt          19
    //    3    8:new             #23  <Class NavUtils$NavUtilsImplJB>
    //    4   11:dup             
    //    5   12:invokespecial   #26  <Method void NavUtils$NavUtilsImplJB()>
    //    6   15:putstatic       #28  <Field NavUtils$NavUtilsImpl IMPL>
    //    7   18:return          
    //    8   19:new             #30  <Class NavUtils$NavUtilsImplBase>
    //    9   22:dup             
    //   10   23:invokespecial   #31  <Method void NavUtils$NavUtilsImplBase()>
    //   11   26:putstatic       #28  <Field NavUtils$NavUtilsImpl IMPL>
    //   12   29:return          
    }

    private NavUtils()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #32  <Method void Object()>
    //    2    4:return          
    }

    public static Intent getParentActivityIntent(Activity activity)
    {
    //    0    0:getstatic       #28  <Field NavUtils$NavUtilsImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #38  <Method Intent NavUtils$NavUtilsImpl.getParentActivityIntent(Activity)>
    //    3    9:areturn         
    }

    public static Intent getParentActivityIntent(Context context, ComponentName componentname)
        throws android.content.pm.PackageManager.NameNotFoundException
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokestatic    #45  <Method String getParentActivityName(Context, ComponentName)>
    //    3    5:astore_2        
    //    4    6:aload_2         
    //    5    7:ifnonnull       12
    //    6   10:aconst_null     
    //    7   11:areturn         
    //    8   12:new             #47  <Class ComponentName>
    //    9   15:dup             
    //   10   16:aload_1         
    //   11   17:invokevirtual   #51  <Method String ComponentName.getPackageName()>
    //   12   20:aload_2         
    //   13   21:invokespecial   #54  <Method void ComponentName(String, String)>
    //   14   24:astore_3        
    //   15   25:aload_0         
    //   16   26:aload_3         
    //   17   27:invokestatic    #45  <Method String getParentActivityName(Context, ComponentName)>
    //   18   30:ifnonnull       38
    //   19   33:aload_3         
    //   20   34:invokestatic    #60  <Method Intent IntentCompat.makeMainActivity(ComponentName)>
    //   21   37:areturn         
    //   22   38:new             #62  <Class Intent>
    //   23   41:dup             
    //   24   42:invokespecial   #63  <Method void Intent()>
    //   25   45:aload_3         
    //   26   46:invokevirtual   #66  <Method Intent Intent.setComponent(ComponentName)>
    //   27   49:areturn         
    }

    public static Intent getParentActivityIntent(Context context, Class class1)
        throws android.content.pm.PackageManager.NameNotFoundException
    {
    //    0    0:aload_0         
    //    1    1:new             #47  <Class ComponentName>
    //    2    4:dup             
    //    3    5:aload_0         
    //    4    6:aload_1         
    //    5    7:invokespecial   #70  <Method void ComponentName(Context, Class)>
    //    6   10:invokestatic    #45  <Method String getParentActivityName(Context, ComponentName)>
    //    7   13:astore_2        
    //    8   14:aload_2         
    //    9   15:ifnonnull       20
    //   10   18:aconst_null     
    //   11   19:areturn         
    //   12   20:new             #47  <Class ComponentName>
    //   13   23:dup             
    //   14   24:aload_0         
    //   15   25:aload_2         
    //   16   26:invokespecial   #73  <Method void ComponentName(Context, String)>
    //   17   29:astore_3        
    //   18   30:aload_0         
    //   19   31:aload_3         
    //   20   32:invokestatic    #45  <Method String getParentActivityName(Context, ComponentName)>
    //   21   35:ifnonnull       43
    //   22   38:aload_3         
    //   23   39:invokestatic    #60  <Method Intent IntentCompat.makeMainActivity(ComponentName)>
    //   24   42:areturn         
    //   25   43:new             #62  <Class Intent>
    //   26   46:dup             
    //   27   47:invokespecial   #63  <Method void Intent()>
    //   28   50:aload_3         
    //   29   51:invokevirtual   #66  <Method Intent Intent.setComponent(ComponentName)>
    //   30   54:areturn         
    }

    public static String getParentActivityName(Activity activity)
    {
    // try 0 9 handler(s) 11
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokevirtual   #80  <Method ComponentName Activity.getComponentName()>
    //    3    5:invokestatic    #45  <Method String getParentActivityName(Context, ComponentName)>
    //    4    8:astore_2        
    //    5    9:aload_2         
    //    6   10:areturn         
    // catch android.content.pm.PackageManager.NameNotFoundException
    //    7   11:astore_1        
    //    8   12:new             #82  <Class IllegalArgumentException>
    //    9   15:dup             
    //   10   16:aload_1         
    //   11   17:invokespecial   #85  <Method void IllegalArgumentException(Throwable)>
    //   12   20:athrow          
    }

    public static String getParentActivityName(Context context, ComponentName componentname)
        throws android.content.pm.PackageManager.NameNotFoundException
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #91  <Method PackageManager Context.getPackageManager()>
    //    2    4:aload_1         
    //    3    5:sipush          128
    //    4    8:invokevirtual   #97  <Method ActivityInfo PackageManager.getActivityInfo(ComponentName, int)>
    //    5   11:astore_2        
    //    6   12:getstatic       #28  <Field NavUtils$NavUtilsImpl IMPL>
    //    7   15:aload_0         
    //    8   16:aload_2         
    //    9   17:invokeinterface #100 <Method String NavUtils$NavUtilsImpl.getParentActivityName(Context, ActivityInfo)>
    //   10   22:areturn         
    }

    public static void navigateUpFromSameTask(Activity activity)
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #103 <Method Intent getParentActivityIntent(Activity)>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:ifnonnull       57
    //    5    9:new             #82  <Class IllegalArgumentException>
    //    6   12:dup             
    //    7   13:new             #105 <Class StringBuilder>
    //    8   16:dup             
    //    9   17:invokespecial   #106 <Method void StringBuilder()>
    //   10   20:ldc1            #108 <String "Activity ">
    //   11   22:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
    //   12   25:aload_0         
    //   13   26:invokevirtual   #116 <Method Class Object.getClass()>
    //   14   29:invokevirtual   #121 <Method String Class.getSimpleName()>
    //   15   32:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
    //   16   35:ldc1            #123 <String " does not have a parent activity name specified.">
    //   17   37:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
    //   18   40:ldc1            #125 <String " (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data> ">
    //   19   42:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
    //   20   45:ldc1            #127 <String " element in your manifest?)">
    //   21   47:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
    //   22   50:invokevirtual   #130 <Method String StringBuilder.toString()>
    //   23   53:invokespecial   #133 <Method void IllegalArgumentException(String)>
    //   24   56:athrow          
    //   25   57:aload_0         
    //   26   58:aload_1         
    //   27   59:invokestatic    #137 <Method void navigateUpTo(Activity, Intent)>
    //   28   62:return          
    }

    public static void navigateUpTo(Activity activity, Intent intent)
    {
    //    0    0:getstatic       #28  <Field NavUtils$NavUtilsImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:invokeinterface #138 <Method void NavUtils$NavUtilsImpl.navigateUpTo(Activity, Intent)>
    //    4   10:return          
    }

    public static boolean shouldUpRecreateTask(Activity activity, Intent intent)
    {
    //    0    0:getstatic       #28  <Field NavUtils$NavUtilsImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:invokeinterface #142 <Method boolean NavUtils$NavUtilsImpl.shouldUpRecreateTask(Activity, Intent)>
    //    4   10:ireturn         
    }

    private static final NavUtilsImpl IMPL;
    public static final String PARENT_ACTIVITY = "android.support.PARENT_ACTIVITY";
    private static final String TAG = "NavUtils";
}
