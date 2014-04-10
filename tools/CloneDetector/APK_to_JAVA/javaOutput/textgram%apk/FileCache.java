// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.lazylist;

import android.content.Context;
import android.os.Environment;
import java.io.File;

public class FileCache
{

    public FileCache(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #11  <Method void Object()>
    //    2    4:invokestatic    #17  <Method String Environment.getExternalStorageState()>
    //    3    7:ldc1            #19  <String "mounted">
    //    4    9:invokevirtual   #25  <Method boolean String.equals(Object)>
    //    5   12:ifeq            50
    //    6   15:aload_0         
    //    7   16:new             #27  <Class File>
    //    8   19:dup             
    //    9   20:invokestatic    #31  <Method File Environment.getExternalStorageDirectory()>
    //   10   23:ldc1            #33  <String "LazyList">
    //   11   25:invokespecial   #36  <Method void File(File, String)>
    //   12   28:putfield        #38  <Field File cacheDir>
    //   13   31:aload_0         
    //   14   32:getfield        #38  <Field File cacheDir>
    //   15   35:invokevirtual   #42  <Method boolean File.exists()>
    //   16   38:ifne            49
    //   17   41:aload_0         
    //   18   42:getfield        #38  <Field File cacheDir>
    //   19   45:invokevirtual   #45  <Method boolean File.mkdirs()>
    //   20   48:pop             
    //   21   49:return          
    //   22   50:aload_0         
    //   23   51:aload_1         
    //   24   52:invokevirtual   #50  <Method File Context.getCacheDir()>
    //   25   55:putfield        #38  <Field File cacheDir>
    //   26   58:goto            31
    }

    public void clear()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field File cacheDir>
    //    2    4:invokevirtual   #55  <Method File[] File.listFiles()>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:ifnonnull       13
    //    6   12:return          
    //    7   13:aload_1         
    //    8   14:arraylength     
    //    9   15:istore_2        
    //   10   16:iconst_0        
    //   11   17:istore_3        
    //   12   18:iload_3         
    //   13   19:iload_2         
    //   14   20:icmpge          12
    //   15   23:aload_1         
    //   16   24:iload_3         
    //   17   25:aaload          
    //   18   26:invokevirtual   #58  <Method boolean File.delete()>
    //   19   29:pop             
    //   20   30:iinc            3  1
    //   21   33:goto            18
    }

    public File getFile(String s)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #64  <Method int String.hashCode()>
    //    2    4:invokestatic    #68  <Method String String.valueOf(int)>
    //    3    7:astore_2        
    //    4    8:new             #27  <Class File>
    //    5   11:dup             
    //    6   12:aload_0         
    //    7   13:getfield        #38  <Field File cacheDir>
    //    8   16:aload_2         
    //    9   17:invokespecial   #36  <Method void File(File, String)>
    //   10   20:areturn         
    }

    private File cacheDir;
}
