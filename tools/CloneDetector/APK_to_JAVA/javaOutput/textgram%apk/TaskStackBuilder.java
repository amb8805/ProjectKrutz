// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.*;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            NavUtils, TaskStackBuilderHoneycomb, TaskStackBuilderJellybean

public class TaskStackBuilder
    implements Iterable
{
    public static interface SupportParentable
    {

        public abstract Intent getSupportParentActivityIntent();
    }

    static interface TaskStackBuilderImpl
    {

        public abstract PendingIntent getPendingIntent(Context context, Intent aintent[], int i, int j, Bundle bundle);
    }

    static class TaskStackBuilderImplBase
        implements TaskStackBuilderImpl
    {

        TaskStackBuilderImplBase()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public PendingIntent getPendingIntent(Context context, Intent aintent[], int i, int j, Bundle bundle)
        {
        //    0    0:new             #14  <Class Intent>
        //    1    3:dup             
        //    2    4:aload_2         
        //    3    5:iconst_m1       
        //    4    6:aload_2         
        //    5    7:arraylength     
        //    6    8:iadd            
        //    7    9:aaload          
        //    8   10:invokespecial   #17  <Method void Intent(Intent)>
        //    9   13:astore          6
        //   10   15:aload           6
        //   11   17:ldc1            #18  <Int 0x10000000>
        //   12   19:invokevirtual   #22  <Method Intent Intent.addFlags(int)>
        //   13   22:pop             
        //   14   23:aload_1         
        //   15   24:iload_3         
        //   16   25:aload           6
        //   17   27:iload           4
        //   18   29:invokestatic    #28  <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
        //   19   32:areturn         
        }
    }

    static class TaskStackBuilderImplHoneycomb
        implements TaskStackBuilderImpl
    {

        TaskStackBuilderImplHoneycomb()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public PendingIntent getPendingIntent(Context context, Intent aintent[], int i, int j, Bundle bundle)
        {
        //    0    0:aload_2         
        //    1    1:iconst_0        
        //    2    2:new             #14  <Class Intent>
        //    3    5:dup             
        //    4    6:aload_2         
        //    5    7:iconst_0        
        //    6    8:aaload          
        //    7    9:invokespecial   #17  <Method void Intent(Intent)>
        //    8   12:ldc1            #18  <Int 0x1000c000>
        //    9   14:invokevirtual   #22  <Method Intent Intent.addFlags(int)>
        //   10   17:aastore         
        //   11   18:aload_1         
        //   12   19:iload_3         
        //   13   20:aload_2         
        //   14   21:iload           4
        //   15   23:invokestatic    #28  <Method PendingIntent TaskStackBuilderHoneycomb.getActivitiesPendingIntent(Context, int, Intent[], int)>
        //   16   26:areturn         
        }
    }

    static class TaskStackBuilderImplJellybean
        implements TaskStackBuilderImpl
    {

        TaskStackBuilderImplJellybean()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public PendingIntent getPendingIntent(Context context, Intent aintent[], int i, int j, Bundle bundle)
        {
        //    0    0:aload_2         
        //    1    1:iconst_0        
        //    2    2:new             #14  <Class Intent>
        //    3    5:dup             
        //    4    6:aload_2         
        //    5    7:iconst_0        
        //    6    8:aaload          
        //    7    9:invokespecial   #17  <Method void Intent(Intent)>
        //    8   12:ldc1            #18  <Int 0x1000c000>
        //    9   14:invokevirtual   #22  <Method Intent Intent.addFlags(int)>
        //   10   17:aastore         
        //   11   18:aload_1         
        //   12   19:iload_3         
        //   13   20:aload_2         
        //   14   21:iload           4
        //   15   23:aload           5
        //   16   25:invokestatic    #28  <Method PendingIntent TaskStackBuilderJellybean.getActivitiesPendingIntent(Context, int, Intent[], int, Bundle)>
        //   17   28:areturn         
        }
    }


    static 
    {
    //    0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          11
    //    2    5:icmplt          19
    //    3    8:new             #28  <Class TaskStackBuilder$TaskStackBuilderImplHoneycomb>
    //    4   11:dup             
    //    5   12:invokespecial   #31  <Method void TaskStackBuilder$TaskStackBuilderImplHoneycomb()>
    //    6   15:putstatic       #33  <Field TaskStackBuilder$TaskStackBuilderImpl IMPL>
    //    7   18:return          
    //    8   19:new             #35  <Class TaskStackBuilder$TaskStackBuilderImplBase>
    //    9   22:dup             
    //   10   23:invokespecial   #36  <Method void TaskStackBuilder$TaskStackBuilderImplBase()>
    //   11   26:putstatic       #33  <Field TaskStackBuilder$TaskStackBuilderImpl IMPL>
    //   12   29:return          
    }

    private TaskStackBuilder(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #38  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:new             #40  <Class ArrayList>
    //    4    8:dup             
    //    5    9:invokespecial   #41  <Method void ArrayList()>
    //    6   12:putfield        #43  <Field ArrayList mIntents>
    //    7   15:aload_0         
    //    8   16:aload_1         
    //    9   17:putfield        #45  <Field Context mSourceContext>
    //   10   20:return          
    }

    public static TaskStackBuilder create(Context context)
    {
    //    0    0:new             #2   <Class TaskStackBuilder>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #49  <Method void TaskStackBuilder(Context)>
    //    4    8:areturn         
    }

    public static TaskStackBuilder from(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #52  <Method TaskStackBuilder create(Context)>
    //    2    4:areturn         
    }

    public TaskStackBuilder addNextIntent(Intent intent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #43  <Field ArrayList mIntents>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #58  <Method boolean ArrayList.add(Object)>
    //    4    8:pop             
    //    5    9:aload_0         
    //    6   10:areturn         
    }

    public TaskStackBuilder addNextIntentWithParentStack(Intent intent)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #65  <Method ComponentName Intent.getComponent()>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:ifnonnull       21
    //    5    9:aload_1         
    //    6   10:aload_0         
    //    7   11:getfield        #45  <Field Context mSourceContext>
    //    8   14:invokevirtual   #71  <Method android.content.pm.PackageManager Context.getPackageManager()>
    //    9   17:invokevirtual   #75  <Method ComponentName Intent.resolveActivity(android.content.pm.PackageManager)>
    //   10   20:astore_2        
    //   11   21:aload_2         
    //   12   22:ifnull          31
    //   13   25:aload_0         
    //   14   26:aload_2         
    //   15   27:invokevirtual   #79  <Method TaskStackBuilder addParentStack(ComponentName)>
    //   16   30:pop             
    //   17   31:aload_0         
    //   18   32:aload_1         
    //   19   33:invokevirtual   #81  <Method TaskStackBuilder addNextIntent(Intent)>
    //   20   36:pop             
    //   21   37:aload_0         
    //   22   38:areturn         
    }

    public TaskStackBuilder addParentStack(Activity activity)
    {
    //    0    0:aload_1         
    //    1    1:instanceof      #84  <Class TaskStackBuilder$SupportParentable>
    //    2    4:istore_2        
    //    3    5:aconst_null     
    //    4    6:astore_3        
    //    5    7:iload_2         
    //    6    8:ifeq            21
    //    7   11:aload_1         
    //    8   12:checkcast       #84  <Class TaskStackBuilder$SupportParentable>
    //    9   15:invokeinterface #88  <Method Intent TaskStackBuilder$SupportParentable.getSupportParentActivityIntent()>
    //   10   20:astore_3        
    //   11   21:aload_3         
    //   12   22:ifnonnull       30
    //   13   25:aload_1         
    //   14   26:invokestatic    #94  <Method Intent NavUtils.getParentActivityIntent(Activity)>
    //   15   29:astore_3        
    //   16   30:aload_3         
    //   17   31:ifnull          71
    //   18   34:aload_3         
    //   19   35:invokevirtual   #65  <Method ComponentName Intent.getComponent()>
    //   20   38:astore          4
    //   21   40:aload           4
    //   22   42:ifnonnull       58
    //   23   45:aload_3         
    //   24   46:aload_0         
    //   25   47:getfield        #45  <Field Context mSourceContext>
    //   26   50:invokevirtual   #71  <Method android.content.pm.PackageManager Context.getPackageManager()>
    //   27   53:invokevirtual   #75  <Method ComponentName Intent.resolveActivity(android.content.pm.PackageManager)>
    //   28   56:astore          4
    //   29   58:aload_0         
    //   30   59:aload           4
    //   31   61:invokevirtual   #79  <Method TaskStackBuilder addParentStack(ComponentName)>
    //   32   64:pop             
    //   33   65:aload_0         
    //   34   66:aload_3         
    //   35   67:invokevirtual   #81  <Method TaskStackBuilder addNextIntent(Intent)>
    //   36   70:pop             
    //   37   71:aload_0         
    //   38   72:areturn         
    }

    public TaskStackBuilder addParentStack(ComponentName componentname)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #43  <Field ArrayList mIntents>
    //    2    4:invokevirtual   #100 <Method int ArrayList.size()>
    //    3    7:istore_2        
    // try 8 18 handler(s) 54
    //    4    8:aload_0         
    //    5    9:getfield        #45  <Field Context mSourceContext>
    //    6   12:aload_1         
    //    7   13:invokestatic    #103 <Method Intent NavUtils.getParentActivityIntent(Context, ComponentName)>
    //    8   16:astore          5
    //    9   18:aload           5
    //   10   20:ifnull          72
    // try 23 47 handler(s) 54
    //   11   23:aload_0         
    //   12   24:getfield        #43  <Field ArrayList mIntents>
    //   13   27:iload_2         
    //   14   28:aload           5
    //   15   30:invokevirtual   #106 <Method void ArrayList.add(int, Object)>
    //   16   33:aload_0         
    //   17   34:getfield        #45  <Field Context mSourceContext>
    //   18   37:aload           5
    //   19   39:invokevirtual   #65  <Method ComponentName Intent.getComponent()>
    //   20   42:invokestatic    #103 <Method Intent NavUtils.getParentActivityIntent(Context, ComponentName)>
    //   21   45:astore          6
    //   22   47:aload           6
    //   23   49:astore          5
    //   24   51:goto            18
    // catch android.content.pm.PackageManager.NameNotFoundException android.content.pm.PackageManager.NameNotFoundException
    //   25   54:astore_3        
    //   26   55:ldc1            #13  <String "TaskStackBuilder">
    //   27   57:ldc1            #108 <String "Bad ComponentName while traversing activity parent metadata">
    //   28   59:invokestatic    #114 <Method int Log.e(String, String)>
    //   29   62:pop             
    //   30   63:new             #116 <Class IllegalArgumentException>
    //   31   66:dup             
    //   32   67:aload_3         
    //   33   68:invokespecial   #119 <Method void IllegalArgumentException(Throwable)>
    //   34   71:athrow          
    //   35   72:aload_0         
    //   36   73:areturn         
    }

    public TaskStackBuilder addParentStack(Class class1)
    {
    //    0    0:aload_0         
    //    1    1:new             #122 <Class ComponentName>
    //    2    4:dup             
    //    3    5:aload_0         
    //    4    6:getfield        #45  <Field Context mSourceContext>
    //    5    9:aload_1         
    //    6   10:invokespecial   #125 <Method void ComponentName(Context, Class)>
    //    7   13:invokevirtual   #79  <Method TaskStackBuilder addParentStack(ComponentName)>
    //    8   16:areturn         
    }

    public Intent editIntentAt(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #43  <Field ArrayList mIntents>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #131 <Method Object ArrayList.get(int)>
    //    4    8:checkcast       #61  <Class Intent>
    //    5   11:areturn         
    }

    public Intent getIntent(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #134 <Method Intent editIntentAt(int)>
    //    3    5:areturn         
    }

    public int getIntentCount()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #43  <Field ArrayList mIntents>
    //    2    4:invokevirtual   #100 <Method int ArrayList.size()>
    //    3    7:ireturn         
    }

    public Intent[] getIntents()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #43  <Field ArrayList mIntents>
    //    2    4:invokevirtual   #100 <Method int ArrayList.size()>
    //    3    7:anewarray       Intent[]
    //    4   10:astore_1        
    //    5   11:aload_1         
    //    6   12:arraylength     
    //    7   13:ifne            18
    //    8   16:aload_1         
    //    9   17:areturn         
    //   10   18:aload_1         
    //   11   19:iconst_0        
    //   12   20:new             #61  <Class Intent>
    //   13   23:dup             
    //   14   24:aload_0         
    //   15   25:getfield        #43  <Field ArrayList mIntents>
    //   16   28:iconst_0        
    //   17   29:invokevirtual   #131 <Method Object ArrayList.get(int)>
    //   18   32:checkcast       #61  <Class Intent>
    //   19   35:invokespecial   #140 <Method void Intent(Intent)>
    //   20   38:ldc1            #141 <Int 0x1000c000>
    //   21   40:invokevirtual   #144 <Method Intent Intent.addFlags(int)>
    //   22   43:aastore         
    //   23   44:iconst_1        
    //   24   45:istore_2        
    //   25   46:iload_2         
    //   26   47:aload_1         
    //   27   48:arraylength     
    //   28   49:icmpge          16
    //   29   52:aload_1         
    //   30   53:iload_2         
    //   31   54:new             #61  <Class Intent>
    //   32   57:dup             
    //   33   58:aload_0         
    //   34   59:getfield        #43  <Field ArrayList mIntents>
    //   35   62:iload_2         
    //   36   63:invokevirtual   #131 <Method Object ArrayList.get(int)>
    //   37   66:checkcast       #61  <Class Intent>
    //   38   69:invokespecial   #140 <Method void Intent(Intent)>
    //   39   72:aastore         
    //   40   73:iinc            2  1
    //   41   76:goto            46
    }

    public PendingIntent getPendingIntent(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:aconst_null     
    //    4    4:invokevirtual   #149 <Method PendingIntent getPendingIntent(int, int, Bundle)>
    //    5    7:areturn         
    }

    public PendingIntent getPendingIntent(int i, int j, Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #43  <Field ArrayList mIntents>
    //    2    4:invokevirtual   #153 <Method boolean ArrayList.isEmpty()>
    //    3    7:ifeq            20
    //    4   10:new             #155 <Class IllegalStateException>
    //    5   13:dup             
    //    6   14:ldc1            #157 <String "No intents added to TaskStackBuilder; cannot getPendingIntent">
    //    7   16:invokespecial   #160 <Method void IllegalStateException(String)>
    //    8   19:athrow          
    //    9   20:aload_0         
    //   10   21:getfield        #43  <Field ArrayList mIntents>
    //   11   24:aload_0         
    //   12   25:getfield        #43  <Field ArrayList mIntents>
    //   13   28:invokevirtual   #100 <Method int ArrayList.size()>
    //   14   31:anewarray       Intent[]
    //   15   34:invokevirtual   #164 <Method Object[] ArrayList.toArray(Object[])>
    //   16   37:checkcast       #166 <Class Intent[]>
    //   17   40:astore          4
    //   18   42:aload           4
    //   19   44:iconst_0        
    //   20   45:new             #61  <Class Intent>
    //   21   48:dup             
    //   22   49:aload           4
    //   23   51:iconst_0        
    //   24   52:aaload          
    //   25   53:invokespecial   #140 <Method void Intent(Intent)>
    //   26   56:ldc1            #141 <Int 0x1000c000>
    //   27   58:invokevirtual   #144 <Method Intent Intent.addFlags(int)>
    //   28   61:aastore         
    //   29   62:getstatic       #33  <Field TaskStackBuilder$TaskStackBuilderImpl IMPL>
    //   30   65:aload_0         
    //   31   66:getfield        #45  <Field Context mSourceContext>
    //   32   69:aload           4
    //   33   71:iload_1         
    //   34   72:iload_2         
    //   35   73:aload_3         
    //   36   74:invokeinterface #171 <Method PendingIntent TaskStackBuilder$TaskStackBuilderImpl.getPendingIntent(Context, Intent[], int, int, Bundle)>
    //   37   79:areturn         
    }

    public Iterator iterator()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #43  <Field ArrayList mIntents>
    //    2    4:invokevirtual   #175 <Method Iterator ArrayList.iterator()>
    //    3    7:areturn         
    }

    public void startActivities()
    {
    //    0    0:aload_0         
    //    1    1:aconst_null     
    //    2    2:invokevirtual   #179 <Method void startActivities(Bundle)>
    //    3    5:return          
    }

    public void startActivities(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #43  <Field ArrayList mIntents>
    //    2    4:invokevirtual   #153 <Method boolean ArrayList.isEmpty()>
    //    3    7:ifeq            20
    //    4   10:new             #155 <Class IllegalStateException>
    //    5   13:dup             
    //    6   14:ldc1            #181 <String "No intents added to TaskStackBuilder; cannot startActivities">
    //    7   16:invokespecial   #160 <Method void IllegalStateException(String)>
    //    8   19:athrow          
    //    9   20:aload_0         
    //   10   21:getfield        #43  <Field ArrayList mIntents>
    //   11   24:aload_0         
    //   12   25:getfield        #43  <Field ArrayList mIntents>
    //   13   28:invokevirtual   #100 <Method int ArrayList.size()>
    //   14   31:anewarray       Intent[]
    //   15   34:invokevirtual   #164 <Method Object[] ArrayList.toArray(Object[])>
    //   16   37:checkcast       #166 <Class Intent[]>
    //   17   40:astore_2        
    //   18   41:aload_2         
    //   19   42:iconst_0        
    //   20   43:new             #61  <Class Intent>
    //   21   46:dup             
    //   22   47:aload_2         
    //   23   48:iconst_0        
    //   24   49:aaload          
    //   25   50:invokespecial   #140 <Method void Intent(Intent)>
    //   26   53:ldc1            #141 <Int 0x1000c000>
    //   27   55:invokevirtual   #144 <Method Intent Intent.addFlags(int)>
    //   28   58:aastore         
    //   29   59:aload_0         
    //   30   60:getfield        #45  <Field Context mSourceContext>
    //   31   63:aload_2         
    //   32   64:aload_1         
    //   33   65:invokestatic    #186 <Method boolean ContextCompat.startActivities(Context, Intent[], Bundle)>
    //   34   68:ifne            100
    //   35   71:new             #61  <Class Intent>
    //   36   74:dup             
    //   37   75:aload_2         
    //   38   76:iconst_m1       
    //   39   77:aload_2         
    //   40   78:arraylength     
    //   41   79:iadd            
    //   42   80:aaload          
    //   43   81:invokespecial   #140 <Method void Intent(Intent)>
    //   44   84:astore_3        
    //   45   85:aload_3         
    //   46   86:ldc1            #187 <Int 0x10000000>
    //   47   88:invokevirtual   #144 <Method Intent Intent.addFlags(int)>
    //   48   91:pop             
    //   49   92:aload_0         
    //   50   93:getfield        #45  <Field Context mSourceContext>
    //   51   96:aload_3         
    //   52   97:invokevirtual   #190 <Method void Context.startActivity(Intent)>
    //   53  100:return          
    }

    private static final TaskStackBuilderImpl IMPL;
    private static final String TAG = "TaskStackBuilder";
    private final ArrayList mIntents;
    private final Context mSourceContext;
}
