// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.os;

import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.IOException;

// Referenced classes of package android.support.v4.os:
//            EnvironmentCompatKitKat

public class EnvironmentCompat
{

    public EnvironmentCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #15  <Method void Object()>
    //    2    4:return          
    }

    public static String getStorageState(File file)
    {
    //    0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          19
    //    2    5:icmplt          13
    //    3    8:aload_0         
    //    4    9:invokestatic    #29  <Method String EnvironmentCompatKitKat.getStorageState(File)>
    //    5   12:areturn         
    // try 13 33 handler(s) 35
    //    6   13:aload_0         
    //    7   14:invokevirtual   #35  <Method String File.getCanonicalPath()>
    //    8   17:invokestatic    #41  <Method File Environment.getExternalStorageDirectory()>
    //    9   20:invokevirtual   #35  <Method String File.getCanonicalPath()>
    //   10   23:invokevirtual   #47  <Method boolean String.startsWith(String)>
    //   11   26:ifeq            61
    //   12   29:invokestatic    #50  <Method String Environment.getExternalStorageState()>
    //   13   32:astore_3        
    //   14   33:aload_3         
    //   15   34:areturn         
    // catch IOException
    //   16   35:astore_1        
    //   17   36:ldc1            #11  <String "EnvironmentCompat">
    //   18   38:new             #52  <Class StringBuilder>
    //   19   41:dup             
    //   20   42:invokespecial   #53  <Method void StringBuilder()>
    //   21   45:ldc1            #55  <String "Failed to resolve canonical path: ">
    //   22   47:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
    //   23   50:aload_1         
    //   24   51:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
    //   25   54:invokevirtual   #65  <Method String StringBuilder.toString()>
    //   26   57:invokestatic    #71  <Method int Log.w(String, String)>
    //   27   60:pop             
    //   28   61:ldc1            #8   <String "unknown">
    //   29   63:areturn         
    }

    public static final String MEDIA_UNKNOWN = "unknown";
    private static final String TAG = "EnvironmentCompat";
}
