// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.content;

import android.content.*;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

public abstract class WakefulBroadcastReceiver extends BroadcastReceiver
{

    static 
    {
    //    0    0:new             #17  <Class SparseArray>
    //    1    3:dup             
    //    2    4:invokespecial   #20  <Method void SparseArray()>
    //    3    7:putstatic       #22  <Field SparseArray mActiveWakeLocks>
    //    4   10:iconst_1        
    //    5   11:putstatic       #24  <Field int mNextId>
    //    6   14:return          
    }

    public WakefulBroadcastReceiver()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #25  <Method void BroadcastReceiver()>
    //    2    4:return          
    }

    public static boolean completeWakefulIntent(Intent intent)
    {
    //    0    0:aload_0         
    //    1    1:ldc1            #8   <String "android.support.content.wakelockid">
    //    2    3:iconst_0        
    //    3    4:invokevirtual   #33  <Method int Intent.getIntExtra(String, int)>
    //    4    7:istore_1        
    //    5    8:iload_1         
    //    6    9:ifne            14
    //    7   12:iconst_0        
    //    8   13:ireturn         
    //    9   14:getstatic       #22  <Field SparseArray mActiveWakeLocks>
    //   10   17:astore_2        
    //   11   18:aload_2         
    //   12   19:monitorenter    
    // try 20 32 handler(s) 82
    //   13   20:getstatic       #22  <Field SparseArray mActiveWakeLocks>
    //   14   23:iload_1         
    //   15   24:invokevirtual   #37  <Method Object SparseArray.get(int)>
    //   16   27:checkcast       #39  <Class android.os.PowerManager$WakeLock>
    //   17   30:astore          4
    //   18   32:aload           4
    //   19   34:ifnull          53
    // try 37 51 handler(s) 82
    //   20   37:aload           4
    //   21   39:invokevirtual   #42  <Method void android.os.PowerManager$WakeLock.release()>
    //   22   42:getstatic       #22  <Field SparseArray mActiveWakeLocks>
    //   23   45:iload_1         
    //   24   46:invokevirtual   #46  <Method void SparseArray.remove(int)>
    //   25   49:aload_2         
    //   26   50:monitorexit     
    //   27   51:iconst_1        
    //   28   52:ireturn         
    // try 53 80 handler(s) 82
    //   29   53:ldc1            #48  <String "WakefulBroadcastReceiver">
    //   30   55:new             #50  <Class StringBuilder>
    //   31   58:dup             
    //   32   59:invokespecial   #51  <Method void StringBuilder()>
    //   33   62:ldc1            #53  <String "No active wake lock id #">
    //   34   64:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
    //   35   67:iload_1         
    //   36   68:invokevirtual   #60  <Method StringBuilder StringBuilder.append(int)>
    //   37   71:invokevirtual   #64  <Method String StringBuilder.toString()>
    //   38   74:invokestatic    #70  <Method int Log.w(String, String)>
    //   39   77:pop             
    //   40   78:aload_2         
    //   41   79:monitorexit     
    //   42   80:iconst_1        
    //   43   81:ireturn         
    // finally
    //   44   82:astore_3        
    // try 83 85 handler(s) 82
    //   45   83:aload_2         
    //   46   84:monitorexit     
    //   47   85:aload_3         
    //   48   86:athrow          
    }

    public static ComponentName startWakefulService(Context context, Intent intent)
    {
    //    0    0:getstatic       #22  <Field SparseArray mActiveWakeLocks>
    //    1    3:astore_2        
    //    2    4:aload_2         
    //    3    5:monitorenter    
    // try 6 29 handler(s) 121
    //    4    6:getstatic       #24  <Field int mNextId>
    //    5    9:istore          4
    //    6   11:iconst_1        
    //    7   12:getstatic       #24  <Field int mNextId>
    //    8   15:iadd            
    //    9   16:putstatic       #24  <Field int mNextId>
    //   10   19:getstatic       #24  <Field int mNextId>
    //   11   22:ifgt            29
    //   12   25:iconst_1        
    //   13   26:putstatic       #24  <Field int mNextId>
    // try 29 45 handler(s) 121
    //   14   29:aload_1         
    //   15   30:ldc1            #8   <String "android.support.content.wakelockid">
    //   16   32:iload           4
    //   17   34:invokevirtual   #76  <Method Intent Intent.putExtra(String, int)>
    //   18   37:pop             
    //   19   38:aload_0         
    //   20   39:aload_1         
    //   21   40:invokevirtual   #82  <Method ComponentName Context.startService(Intent)>
    //   22   43:astore          6
    //   23   45:aload           6
    //   24   47:ifnonnull       54
    // try 50 52 handler(s) 121
    //   25   50:aload_2         
    //   26   51:monitorexit     
    //   27   52:aconst_null     
    //   28   53:areturn         
    // try 54 118 handler(s) 121
    //   29   54:aload_0         
    //   30   55:ldc1            #84  <String "power">
    //   31   57:invokevirtual   #88  <Method Object Context.getSystemService(String)>
    //   32   60:checkcast       #90  <Class PowerManager>
    //   33   63:iconst_1        
    //   34   64:new             #50  <Class StringBuilder>
    //   35   67:dup             
    //   36   68:invokespecial   #51  <Method void StringBuilder()>
    //   37   71:ldc1            #92  <String "wake:">
    //   38   73:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
    //   39   76:aload           6
    //   40   78:invokevirtual   #97  <Method String ComponentName.flattenToShortString()>
    //   41   81:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
    //   42   84:invokevirtual   #64  <Method String StringBuilder.toString()>
    //   43   87:invokevirtual   #101 <Method android.os.PowerManager$WakeLock PowerManager.newWakeLock(int, String)>
    //   44   90:astore          7
    //   45   92:aload           7
    //   46   94:iconst_0        
    //   47   95:invokevirtual   #105 <Method void android.os.PowerManager$WakeLock.setReferenceCounted(boolean)>
    //   48   98:aload           7
    //   49  100:ldc2w           #106 <Long 60000L>
    //   50  103:invokevirtual   #111 <Method void android.os.PowerManager$WakeLock.acquire(long)>
    //   51  106:getstatic       #22  <Field SparseArray mActiveWakeLocks>
    //   52  109:iload           4
    //   53  111:aload           7
    //   54  113:invokevirtual   #115 <Method void SparseArray.put(int, Object)>
    //   55  116:aload_2         
    //   56  117:monitorexit     
    //   57  118:aload           6
    //   58  120:areturn         
    // finally
    //   59  121:astore_3        
    // try 122 124 handler(s) 121
    //   60  122:aload_2         
    //   61  123:monitorexit     
    //   62  124:aload_3         
    //   63  125:athrow          
    }

    private static final String EXTRA_WAKE_LOCK_ID = "android.support.content.wakelockid";
    private static final SparseArray mActiveWakeLocks;
    private static int mNextId;
}
