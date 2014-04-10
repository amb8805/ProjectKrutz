// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import java.io.File;

// Referenced classes of package android.support.v4.content:
//            ContextCompatKitKat, ContextCompatFroyo, ContextCompatHoneycomb, ContextCompatJellybean

public class ContextCompat
{

    public ContextCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #24  <Method void Object()>
    //    2    4:return          
    }

    private static transient File buildPath(File file, String as[])
    {
    //    0    0:aload_1         
    //    1    1:arraylength     
    //    2    2:istore_2        
    //    3    3:iconst_0        
    //    4    4:istore_3        
    //    5    5:aload_0         
    //    6    6:astore          4
    //    7    8:iload_3         
    //    8    9:iload_2         
    //    9   10:icmpge          65
    //   10   13:aload_1         
    //   11   14:iload_3         
    //   12   15:aaload          
    //   13   16:astore          5
    //   14   18:aload           4
    //   15   20:ifnonnull       44
    //   16   23:new             #28  <Class File>
    //   17   26:dup             
    //   18   27:aload           5
    //   19   29:invokespecial   #31  <Method void File(String)>
    //   20   32:astore          6
    //   21   34:iinc            3  1
    //   22   37:aload           6
    //   23   39:astore          4
    //   24   41:goto            8
    //   25   44:aload           5
    //   26   46:ifnull          68
    //   27   49:new             #28  <Class File>
    //   28   52:dup             
    //   29   53:aload           4
    //   30   55:aload           5
    //   31   57:invokespecial   #34  <Method void File(File, String)>
    //   32   60:astore          6
    //   33   62:goto            34
    //   34   65:aload           4
    //   35   67:areturn         
    //   36   68:aload           4
    //   37   70:astore          6
    //   38   72:goto            34
    }

    public static File[] getExternalCacheDirs(Context context)
    {
    //    0    0:getstatic       #42  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:istore_1        
    //    2    4:iload_1         
    //    3    5:bipush          19
    //    4    7:icmplt          15
    //    5   10:aload_0         
    //    6   11:invokestatic    #46  <Method File[] ContextCompatKitKat.getExternalCacheDirs(Context)>
    //    7   14:areturn         
    //    8   15:iload_1         
    //    9   16:bipush          8
    //   10   18:icmplt          37
    //   11   21:aload_0         
    //   12   22:invokestatic    #52  <Method File ContextCompatFroyo.getExternalCacheDir(Context)>
    //   13   25:astore          4
    //   14   27:iconst_1        
    //   15   28:anewarray       File[]
    //   16   31:dup             
    //   17   32:iconst_0        
    //   18   33:aload           4
    //   19   35:aastore         
    //   20   36:areturn         
    //   21   37:invokestatic    #58  <Method File Environment.getExternalStorageDirectory()>
    //   22   40:astore_2        
    //   23   41:iconst_4        
    //   24   42:anewarray       String[]
    //   25   45:astore_3        
    //   26   46:aload_3         
    //   27   47:iconst_0        
    //   28   48:ldc1            #8   <String "Android">
    //   29   50:aastore         
    //   30   51:aload_3         
    //   31   52:iconst_1        
    //   32   53:ldc1            #14  <String "data">
    //   33   55:aastore         
    //   34   56:aload_3         
    //   35   57:iconst_2        
    //   36   58:aload_0         
    //   37   59:invokevirtual   #66  <Method String Context.getPackageName()>
    //   38   62:aastore         
    //   39   63:aload_3         
    //   40   64:iconst_3        
    //   41   65:ldc1            #11  <String "cache">
    //   42   67:aastore         
    //   43   68:aload_2         
    //   44   69:aload_3         
    //   45   70:invokestatic    #68  <Method File buildPath(File, String[])>
    //   46   73:astore          4
    //   47   75:goto            27
    }

    public static File[] getExternalFilesDirs(Context context, String s)
    {
    //    0    0:getstatic       #42  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:istore_2        
    //    2    4:iload_2         
    //    3    5:bipush          19
    //    4    7:icmplt          16
    //    5   10:aload_0         
    //    6   11:aload_1         
    //    7   12:invokestatic    #72  <Method File[] ContextCompatKitKat.getExternalFilesDirs(Context, String)>
    //    8   15:areturn         
    //    9   16:iload_2         
    //   10   17:bipush          8
    //   11   19:icmplt          39
    //   12   22:aload_0         
    //   13   23:aload_1         
    //   14   24:invokestatic    #76  <Method File ContextCompatFroyo.getExternalFilesDir(Context, String)>
    //   15   27:astore          5
    //   16   29:iconst_1        
    //   17   30:anewarray       File[]
    //   18   33:dup             
    //   19   34:iconst_0        
    //   20   35:aload           5
    //   21   37:aastore         
    //   22   38:areturn         
    //   23   39:invokestatic    #58  <Method File Environment.getExternalStorageDirectory()>
    //   24   42:astore_3        
    //   25   43:iconst_5        
    //   26   44:anewarray       String[]
    //   27   47:astore          4
    //   28   49:aload           4
    //   29   51:iconst_0        
    //   30   52:ldc1            #8   <String "Android">
    //   31   54:aastore         
    //   32   55:aload           4
    //   33   57:iconst_1        
    //   34   58:ldc1            #14  <String "data">
    //   35   60:aastore         
    //   36   61:aload           4
    //   37   63:iconst_2        
    //   38   64:aload_0         
    //   39   65:invokevirtual   #66  <Method String Context.getPackageName()>
    //   40   68:aastore         
    //   41   69:aload           4
    //   42   71:iconst_3        
    //   43   72:ldc1            #17  <String "files">
    //   44   74:aastore         
    //   45   75:aload           4
    //   46   77:iconst_4        
    //   47   78:aload_1         
    //   48   79:aastore         
    //   49   80:aload_3         
    //   50   81:aload           4
    //   51   83:invokestatic    #68  <Method File buildPath(File, String[])>
    //   52   86:astore          5
    //   53   88:goto            29
    }

    public static File[] getObbDirs(Context context)
    {
    //    0    0:getstatic       #42  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:istore_1        
    //    2    4:iload_1         
    //    3    5:bipush          19
    //    4    7:icmplt          15
    //    5   10:aload_0         
    //    6   11:invokestatic    #79  <Method File[] ContextCompatKitKat.getObbDirs(Context)>
    //    7   14:areturn         
    //    8   15:iload_1         
    //    9   16:bipush          11
    //   10   18:icmplt          37
    //   11   21:aload_0         
    //   12   22:invokestatic    #84  <Method File ContextCompatHoneycomb.getObbDir(Context)>
    //   13   25:astore          4
    //   14   27:iconst_1        
    //   15   28:anewarray       File[]
    //   16   31:dup             
    //   17   32:iconst_0        
    //   18   33:aload           4
    //   19   35:aastore         
    //   20   36:areturn         
    //   21   37:invokestatic    #58  <Method File Environment.getExternalStorageDirectory()>
    //   22   40:astore_2        
    //   23   41:iconst_3        
    //   24   42:anewarray       String[]
    //   25   45:astore_3        
    //   26   46:aload_3         
    //   27   47:iconst_0        
    //   28   48:ldc1            #8   <String "Android">
    //   29   50:aastore         
    //   30   51:aload_3         
    //   31   52:iconst_1        
    //   32   53:ldc1            #20  <String "obb">
    //   33   55:aastore         
    //   34   56:aload_3         
    //   35   57:iconst_2        
    //   36   58:aload_0         
    //   37   59:invokevirtual   #66  <Method String Context.getPackageName()>
    //   38   62:aastore         
    //   39   63:aload_2         
    //   40   64:aload_3         
    //   41   65:invokestatic    #68  <Method File buildPath(File, String[])>
    //   42   68:astore          4
    //   43   70:goto            27
    }

    public static boolean startActivities(Context context, Intent aintent[])
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokestatic    #89  <Method boolean startActivities(Context, Intent[], Bundle)>
    //    4    6:ireturn         
    }

    public static boolean startActivities(Context context, Intent aintent[], Bundle bundle)
    {
    //    0    0:getstatic       #42  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:istore_3        
    //    2    4:iload_3         
    //    3    5:bipush          16
    //    4    7:icmplt          18
    //    5   10:aload_0         
    //    6   11:aload_1         
    //    7   12:aload_2         
    //    8   13:invokestatic    #94  <Method void ContextCompatJellybean.startActivities(Context, Intent[], Bundle)>
    //    9   16:iconst_1        
    //   10   17:ireturn         
    //   11   18:iload_3         
    //   12   19:bipush          11
    //   13   21:icmplt          31
    //   14   24:aload_0         
    //   15   25:aload_1         
    //   16   26:invokestatic    #97  <Method void ContextCompatHoneycomb.startActivities(Context, Intent[])>
    //   17   29:iconst_1        
    //   18   30:ireturn         
    //   19   31:iconst_0        
    //   20   32:ireturn         
    }

    private static final String DIR_ANDROID = "Android";
    private static final String DIR_CACHE = "cache";
    private static final String DIR_DATA = "data";
    private static final String DIR_FILES = "files";
    private static final String DIR_OBB = "obb";
}
