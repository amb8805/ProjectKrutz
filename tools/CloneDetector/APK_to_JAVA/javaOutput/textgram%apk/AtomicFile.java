// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.util;

import android.util.Log;
import java.io.*;

public class AtomicFile
{

    public AtomicFile(File file)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #12  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #14  <Field File mBaseName>
    //    5    9:aload_0         
    //    6   10:new             #16  <Class File>
    //    7   13:dup             
    //    8   14:new             #18  <Class StringBuilder>
    //    9   17:dup             
    //   10   18:invokespecial   #19  <Method void StringBuilder()>
    //   11   21:aload_1         
    //   12   22:invokevirtual   #23  <Method String File.getPath()>
    //   13   25:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
    //   14   28:ldc1            #29  <String ".bak">
    //   15   30:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
    //   16   33:invokevirtual   #32  <Method String StringBuilder.toString()>
    //   17   36:invokespecial   #35  <Method void File(String)>
    //   18   39:putfield        #37  <Field File mBackupName>
    //   19   42:return          
    }

    static boolean sync(FileOutputStream fileoutputstream)
    {
    //    0    0:aload_0         
    //    1    1:ifnull          11
    // try 4 11 handler(s) 13
    //    2    4:aload_0         
    //    3    5:invokevirtual   #47  <Method FileDescriptor FileOutputStream.getFD()>
    //    4    8:invokevirtual   #51  <Method void FileDescriptor.sync()>
    //    5   11:iconst_1        
    //    6   12:ireturn         
    // catch IOException
    //    7   13:astore_1        
    //    8   14:iconst_0        
    //    9   15:ireturn         
    }

    public void delete()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #14  <Field File mBaseName>
    //    2    4:invokevirtual   #55  <Method boolean File.delete()>
    //    3    7:pop             
    //    4    8:aload_0         
    //    5    9:getfield        #37  <Field File mBackupName>
    //    6   12:invokevirtual   #55  <Method boolean File.delete()>
    //    7   15:pop             
    //    8   16:return          
    }

    public void failWrite(FileOutputStream fileoutputstream)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          33
    //    2    4:aload_1         
    //    3    5:invokestatic    #59  <Method boolean sync(FileOutputStream)>
    //    4    8:pop             
    // try 9 33 handler(s) 34
    //    5    9:aload_1         
    //    6   10:invokevirtual   #62  <Method void FileOutputStream.close()>
    //    7   13:aload_0         
    //    8   14:getfield        #14  <Field File mBaseName>
    //    9   17:invokevirtual   #55  <Method boolean File.delete()>
    //   10   20:pop             
    //   11   21:aload_0         
    //   12   22:getfield        #37  <Field File mBackupName>
    //   13   25:aload_0         
    //   14   26:getfield        #14  <Field File mBaseName>
    //   15   29:invokevirtual   #66  <Method boolean File.renameTo(File)>
    //   16   32:pop             
    //   17   33:return          
    // catch IOException
    //   18   34:astore_3        
    //   19   35:ldc1            #68  <String "AtomicFile">
    //   20   37:ldc1            #70  <String "failWrite: Got exception:">
    //   21   39:aload_3         
    //   22   40:invokestatic    #76  <Method int Log.w(String, String, Throwable)>
    //   23   43:pop             
    //   24   44:return          
    }

    public void finishWrite(FileOutputStream fileoutputstream)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          21
    //    2    4:aload_1         
    //    3    5:invokestatic    #59  <Method boolean sync(FileOutputStream)>
    //    4    8:pop             
    // try 9 21 handler(s) 22
    //    5    9:aload_1         
    //    6   10:invokevirtual   #62  <Method void FileOutputStream.close()>
    //    7   13:aload_0         
    //    8   14:getfield        #37  <Field File mBackupName>
    //    9   17:invokevirtual   #55  <Method boolean File.delete()>
    //   10   20:pop             
    //   11   21:return          
    // catch IOException
    //   12   22:astore_3        
    //   13   23:ldc1            #68  <String "AtomicFile">
    //   14   25:ldc1            #79  <String "finishWrite: Got exception:">
    //   15   27:aload_3         
    //   16   28:invokestatic    #76  <Method int Log.w(String, String, Throwable)>
    //   17   31:pop             
    //   18   32:return          
    }

    public File getBaseFile()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #14  <Field File mBaseName>
    //    2    4:areturn         
    }

    public FileInputStream openRead()
        throws FileNotFoundException
    {
    //    0    0:aload_0         
    //    1    1:getfield        #37  <Field File mBackupName>
    //    2    4:invokevirtual   #88  <Method boolean File.exists()>
    //    3    7:ifeq            30
    //    4   10:aload_0         
    //    5   11:getfield        #14  <Field File mBaseName>
    //    6   14:invokevirtual   #55  <Method boolean File.delete()>
    //    7   17:pop             
    //    8   18:aload_0         
    //    9   19:getfield        #37  <Field File mBackupName>
    //   10   22:aload_0         
    //   11   23:getfield        #14  <Field File mBaseName>
    //   12   26:invokevirtual   #66  <Method boolean File.renameTo(File)>
    //   13   29:pop             
    //   14   30:new             #90  <Class FileInputStream>
    //   15   33:dup             
    //   16   34:aload_0         
    //   17   35:getfield        #14  <Field File mBaseName>
    //   18   38:invokespecial   #92  <Method void FileInputStream(File)>
    //   19   41:areturn         
    }

    public byte[] readFully()
        throws IOException
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #96  <Method FileInputStream openRead()>
    //    2    4:astore_1        
    //    3    5:iconst_0        
    //    4    6:istore_2        
    // try 7 15 handler(s) 87
    //    5    7:aload_1         
    //    6    8:invokevirtual   #100 <Method int FileInputStream.available()>
    //    7   11:newarray        byte[]
    //    8   13:astore          4
    // try 15 29 handler(s) 87
    //    9   15:aload_1         
    //   10   16:aload           4
    //   11   18:iload_2         
    //   12   19:aload           4
    //   13   21:arraylength     
    //   14   22:iload_2         
    //   15   23:isub            
    //   16   24:invokevirtual   #104 <Method int FileInputStream.read(byte[], int, int)>
    //   17   27:istore          5
    //   18   29:iload           5
    //   19   31:ifgt            41
    //   20   34:aload_1         
    //   21   35:invokevirtual   #105 <Method void FileInputStream.close()>
    //   22   38:aload           4
    //   23   40:areturn         
    //   24   41:iload_2         
    //   25   42:iload           5
    //   26   44:iadd            
    //   27   45:istore_2        
    // try 46 80 handler(s) 87
    //   28   46:aload_1         
    //   29   47:invokevirtual   #100 <Method int FileInputStream.available()>
    //   30   50:istore          6
    //   31   52:iload           6
    //   32   54:aload           4
    //   33   56:arraylength     
    //   34   57:iload_2         
    //   35   58:isub            
    //   36   59:icmple          15
    //   37   62:iload_2         
    //   38   63:iload           6
    //   39   65:iadd            
    //   40   66:newarray        byte[]
    //   41   68:astore          7
    //   42   70:aload           4
    //   43   72:iconst_0        
    //   44   73:aload           7
    //   45   75:iconst_0        
    //   46   76:iload_2         
    //   47   77:invokestatic    #111 <Method void System.arraycopy(Object, int, Object, int, int)>
    //   48   80:aload           7
    //   49   82:astore          4
    //   50   84:goto            15
    // finally
    //   51   87:astore_3        
    //   52   88:aload_1         
    //   53   89:invokevirtual   #105 <Method void FileInputStream.close()>
    //   54   92:aload_3         
    //   55   93:athrow          
    }

    public FileOutputStream startWrite()
        throws IOException
    {
    //    0    0:aload_0         
    //    1    1:getfield        #14  <Field File mBaseName>
    //    2    4:invokevirtual   #88  <Method boolean File.exists()>
    //    3    7:ifeq            74
    //    4   10:aload_0         
    //    5   11:getfield        #37  <Field File mBackupName>
    //    6   14:invokevirtual   #88  <Method boolean File.exists()>
    //    7   17:ifne            88
    //    8   20:aload_0         
    //    9   21:getfield        #14  <Field File mBaseName>
    //   10   24:aload_0         
    //   11   25:getfield        #37  <Field File mBackupName>
    //   12   28:invokevirtual   #66  <Method boolean File.renameTo(File)>
    //   13   31:ifne            74
    //   14   34:ldc1            #68  <String "AtomicFile">
    //   15   36:new             #18  <Class StringBuilder>
    //   16   39:dup             
    //   17   40:invokespecial   #19  <Method void StringBuilder()>
    //   18   43:ldc1            #115 <String "Couldn't rename file ">
    //   19   45:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
    //   20   48:aload_0         
    //   21   49:getfield        #14  <Field File mBaseName>
    //   22   52:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
    //   23   55:ldc1            #120 <String " to backup file ">
    //   24   57:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
    //   25   60:aload_0         
    //   26   61:getfield        #37  <Field File mBackupName>
    //   27   64:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
    //   28   67:invokevirtual   #32  <Method String StringBuilder.toString()>
    //   29   70:invokestatic    #123 <Method int Log.w(String, String)>
    //   30   73:pop             
    // try 74 86 handler(s) 99
    //   31   74:new             #43  <Class FileOutputStream>
    //   32   77:dup             
    //   33   78:aload_0         
    //   34   79:getfield        #14  <Field File mBaseName>
    //   35   82:invokespecial   #124 <Method void FileOutputStream(File)>
    //   36   85:astore_1        
    //   37   86:aload_1         
    //   38   87:areturn         
    //   39   88:aload_0         
    //   40   89:getfield        #14  <Field File mBaseName>
    //   41   92:invokevirtual   #55  <Method boolean File.delete()>
    //   42   95:pop             
    //   43   96:goto            74
    // catch FileNotFoundException
    //   44   99:astore_2        
    //   45  100:aload_0         
    //   46  101:getfield        #14  <Field File mBaseName>
    //   47  104:invokevirtual   #127 <Method File File.getParentFile()>
    //   48  107:invokevirtual   #130 <Method boolean File.mkdir()>
    //   49  110:ifne            143
    //   50  113:new             #41  <Class IOException>
    //   51  116:dup             
    //   52  117:new             #18  <Class StringBuilder>
    //   53  120:dup             
    //   54  121:invokespecial   #19  <Method void StringBuilder()>
    //   55  124:ldc1            #132 <String "Couldn't create directory ">
    //   56  126:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
    //   57  129:aload_0         
    //   58  130:getfield        #14  <Field File mBaseName>
    //   59  133:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
    //   60  136:invokevirtual   #32  <Method String StringBuilder.toString()>
    //   61  139:invokespecial   #133 <Method void IOException(String)>
    //   62  142:athrow          
    // try 143 155 handler(s) 157
    //   63  143:new             #43  <Class FileOutputStream>
    //   64  146:dup             
    //   65  147:aload_0         
    //   66  148:getfield        #14  <Field File mBaseName>
    //   67  151:invokespecial   #124 <Method void FileOutputStream(File)>
    //   68  154:astore_3        
    //   69  155:aload_3         
    //   70  156:areturn         
    // catch FileNotFoundException
    //   71  157:astore          4
    //   72  159:new             #41  <Class IOException>
    //   73  162:dup             
    //   74  163:new             #18  <Class StringBuilder>
    //   75  166:dup             
    //   76  167:invokespecial   #19  <Method void StringBuilder()>
    //   77  170:ldc1            #135 <String "Couldn't create ">
    //   78  172:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
    //   79  175:aload_0         
    //   80  176:getfield        #14  <Field File mBaseName>
    //   81  179:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
    //   82  182:invokevirtual   #32  <Method String StringBuilder.toString()>
    //   83  185:invokespecial   #133 <Method void IOException(String)>
    //   84  188:athrow          
    }

    private final File mBackupName;
    private final File mBaseName;
}
