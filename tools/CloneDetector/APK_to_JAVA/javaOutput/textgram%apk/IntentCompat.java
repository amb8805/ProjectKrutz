// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;

// Referenced classes of package android.support.v4.content:
//            IntentCompatHoneycomb, IntentCompatIcsMr1

public class IntentCompat
{
    static interface IntentCompatImpl
    {

        public abstract Intent makeMainActivity(ComponentName componentname);

        public abstract Intent makeMainSelectorActivity(String s, String s1);

        public abstract Intent makeRestartActivityTask(ComponentName componentname);
    }

    static class IntentCompatImplBase
        implements IntentCompatImpl
    {

        IntentCompatImplBase()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public Intent makeMainActivity(ComponentName componentname)
        {
        //    0    0:new             #14  <Class Intent>
        //    1    3:dup             
        //    2    4:ldc1            #16  <String "android.intent.action.MAIN">
        //    3    6:invokespecial   #19  <Method void Intent(String)>
        //    4    9:astore_2        
        //    5   10:aload_2         
        //    6   11:aload_1         
        //    7   12:invokevirtual   #22  <Method Intent Intent.setComponent(ComponentName)>
        //    8   15:pop             
        //    9   16:aload_2         
        //   10   17:ldc1            #24  <String "android.intent.category.LAUNCHER">
        //   11   19:invokevirtual   #28  <Method Intent Intent.addCategory(String)>
        //   12   22:pop             
        //   13   23:aload_2         
        //   14   24:areturn         
        }

        public Intent makeMainSelectorActivity(String s, String s1)
        {
        //    0    0:new             #14  <Class Intent>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:invokespecial   #19  <Method void Intent(String)>
        //    4    8:astore_3        
        //    5    9:aload_3         
        //    6   10:aload_2         
        //    7   11:invokevirtual   #28  <Method Intent Intent.addCategory(String)>
        //    8   14:pop             
        //    9   15:aload_3         
        //   10   16:areturn         
        }

        public Intent makeRestartActivityTask(ComponentName componentname)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #33  <Method Intent makeMainActivity(ComponentName)>
        //    3    5:astore_2        
        //    4    6:aload_2         
        //    5    7:ldc1            #34  <Int 0x10008000>
        //    6    9:invokevirtual   #38  <Method Intent Intent.addFlags(int)>
        //    7   12:pop             
        //    8   13:aload_2         
        //    9   14:areturn         
        }
    }

    static class IntentCompatImplHC extends IntentCompatImplBase
    {

        IntentCompatImplHC()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void IntentCompat$IntentCompatImplBase()>
        //    2    4:return          
        }

        public Intent makeMainActivity(ComponentName componentname)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #14  <Method Intent IntentCompatHoneycomb.makeMainActivity(ComponentName)>
        //    2    4:areturn         
        }

        public Intent makeRestartActivityTask(ComponentName componentname)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #17  <Method Intent IntentCompatHoneycomb.makeRestartActivityTask(ComponentName)>
        //    2    4:areturn         
        }
    }

    static class IntentCompatImplIcsMr1 extends IntentCompatImplHC
    {

        IntentCompatImplIcsMr1()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void IntentCompat$IntentCompatImplHC()>
        //    2    4:return          
        }

        public Intent makeMainSelectorActivity(String s, String s1)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokestatic    #14  <Method Intent IntentCompatIcsMr1.makeMainSelectorActivity(String, String)>
        //    3    5:areturn         
        }
    }


    static 
    {
    //    0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:istore_0        
    //    2    4:iload_0         
    //    3    5:bipush          15
    //    4    7:icmplt          21
    //    5   10:new             #36  <Class IntentCompat$IntentCompatImplIcsMr1>
    //    6   13:dup             
    //    7   14:invokespecial   #39  <Method void IntentCompat$IntentCompatImplIcsMr1()>
    //    8   17:putstatic       #41  <Field IntentCompat$IntentCompatImpl IMPL>
    //    9   20:return          
    //   10   21:iload_0         
    //   11   22:bipush          11
    //   12   24:icmplt          38
    //   13   27:new             #43  <Class IntentCompat$IntentCompatImplHC>
    //   14   30:dup             
    //   15   31:invokespecial   #44  <Method void IntentCompat$IntentCompatImplHC()>
    //   16   34:putstatic       #41  <Field IntentCompat$IntentCompatImpl IMPL>
    //   17   37:return          
    //   18   38:new             #46  <Class IntentCompat$IntentCompatImplBase>
    //   19   41:dup             
    //   20   42:invokespecial   #47  <Method void IntentCompat$IntentCompatImplBase()>
    //   21   45:putstatic       #41  <Field IntentCompat$IntentCompatImpl IMPL>
    //   22   48:return          
    }

    private IntentCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #48  <Method void Object()>
    //    2    4:return          
    }

    public static Intent makeMainActivity(ComponentName componentname)
    {
    //    0    0:getstatic       #41  <Field IntentCompat$IntentCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #54  <Method Intent IntentCompat$IntentCompatImpl.makeMainActivity(ComponentName)>
    //    3    9:areturn         
    }

    public static Intent makeMainSelectorActivity(String s, String s1)
    {
    //    0    0:getstatic       #41  <Field IntentCompat$IntentCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:invokeinterface #58  <Method Intent IntentCompat$IntentCompatImpl.makeMainSelectorActivity(String, String)>
    //    4   10:areturn         
    }

    public static Intent makeRestartActivityTask(ComponentName componentname)
    {
    //    0    0:getstatic       #41  <Field IntentCompat$IntentCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #61  <Method Intent IntentCompat$IntentCompatImpl.makeRestartActivityTask(ComponentName)>
    //    3    9:areturn         
    }

    public static final String ACTION_EXTERNAL_APPLICATIONS_AVAILABLE = "android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE";
    public static final String ACTION_EXTERNAL_APPLICATIONS_UNAVAILABLE = "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE";
    public static final String EXTRA_CHANGED_PACKAGE_LIST = "android.intent.extra.changed_package_list";
    public static final String EXTRA_CHANGED_UID_LIST = "android.intent.extra.changed_uid_list";
    public static final String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
    public static final int FLAG_ACTIVITY_CLEAR_TASK = 32768;
    public static final int FLAG_ACTIVITY_TASK_ON_HOME = 16384;
    private static final IntentCompatImpl IMPL;
}
