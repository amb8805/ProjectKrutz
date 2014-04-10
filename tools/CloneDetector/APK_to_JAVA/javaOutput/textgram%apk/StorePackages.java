// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.store;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import codeadore.textgram.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class StorePackages
{
    public static class Decompress
    {

        public Decompress(String s, String s1)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #12  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #14  <Field String _zipFile>
        //    5    9:aload_0         
        //    6   10:new             #16  <Class StringBuilder>
        //    7   13:dup             
        //    8   14:aload_2         
        //    9   15:invokestatic    #22  <Method String String.valueOf(Object)>
        //   10   18:invokespecial   #25  <Method void StringBuilder(String)>
        //   11   21:getstatic       #30  <Field String File.separator>
        //   12   24:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
        //   13   27:invokevirtual   #38  <Method String StringBuilder.toString()>
        //   14   30:putfield        #40  <Field String _location>
        //   15   33:aload_0         
        //   16   34:ldc1            #42  <String "">
        //   17   36:invokespecial   #45  <Method void _dirChecker(String)>
        //   18   39:return          
        }

        private void _dirChecker(String s)
        {
        //    0    0:new             #27  <Class File>
        //    1    3:dup             
        //    2    4:new             #16  <Class StringBuilder>
        //    3    7:dup             
        //    4    8:aload_0         
        //    5    9:getfield        #40  <Field String _location>
        //    6   12:invokestatic    #22  <Method String String.valueOf(Object)>
        //    7   15:invokespecial   #25  <Method void StringBuilder(String)>
        //    8   18:aload_1         
        //    9   19:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
        //   10   22:invokevirtual   #38  <Method String StringBuilder.toString()>
        //   11   25:invokespecial   #46  <Method void File(String)>
        //   12   28:astore_2        
        //   13   29:aload_2         
        //   14   30:invokevirtual   #50  <Method boolean File.isDirectory()>
        //   15   33:ifne            41
        //   16   36:aload_2         
        //   17   37:invokevirtual   #53  <Method boolean File.mkdirs()>
        //   18   40:pop             
        //   19   41:return          
        }

        public void unzip()
        {
        // try 0 19 handler(s) 81
        //    0    0:new             #58  <Class ZipInputStream>
        //    1    3:dup             
        //    2    4:new             #60  <Class FileInputStream>
        //    3    7:dup             
        //    4    8:aload_0         
        //    5    9:getfield        #14  <Field String _zipFile>
        //    6   12:invokespecial   #61  <Method void FileInputStream(String)>
        //    7   15:invokespecial   #64  <Method void ZipInputStream(java.io.InputStream)>
        //    8   18:astore_1        
        // try 19 25 handler(s) 81
        //    9   19:aload_1         
        //   10   20:invokevirtual   #68  <Method ZipEntry ZipInputStream.getNextEntry()>
        //   11   23:astore          4
        //   12   25:aload           4
        //   13   27:ifnonnull       35
        // try 30 34 handler(s) 81
        //   14   30:aload_1         
        //   15   31:invokevirtual   #71  <Method void ZipInputStream.close()>
        //   16   34:return          
        // try 35 78 handler(s) 81
        //   17   35:ldc1            #73  <String "Decompress">
        //   18   37:new             #16  <Class StringBuilder>
        //   19   40:dup             
        //   20   41:ldc1            #75  <String "Unzipping ">
        //   21   43:invokespecial   #25  <Method void StringBuilder(String)>
        //   22   46:aload           4
        //   23   48:invokevirtual   #80  <Method String ZipEntry.getName()>
        //   24   51:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
        //   25   54:invokevirtual   #38  <Method String StringBuilder.toString()>
        //   26   57:invokestatic    #86  <Method int Log.v(String, String)>
        //   27   60:pop             
        //   28   61:aload           4
        //   29   63:invokevirtual   #87  <Method boolean ZipEntry.isDirectory()>
        //   30   66:ifeq            92
        //   31   69:aload_0         
        //   32   70:aload           4
        //   33   72:invokevirtual   #80  <Method String ZipEntry.getName()>
        //   34   75:invokespecial   #45  <Method void _dirChecker(String)>
        //   35   78:goto            19
        // catch Exception Exception Exception Exception Exception Exception Exception Exception
        //   36   81:astore_2        
        //   37   82:ldc1            #73  <String "Decompress">
        //   38   84:ldc1            #88  <String "unzip">
        //   39   86:aload_2         
        //   40   87:invokestatic    #92  <Method int Log.e(String, String, Throwable)>
        //   41   90:pop             
        //   42   91:return          
        // try 92 133 handler(s) 81
        //   43   92:new             #94  <Class FileOutputStream>
        //   44   95:dup             
        //   45   96:new             #16  <Class StringBuilder>
        //   46   99:dup             
        //   47  100:aload_0         
        //   48  101:getfield        #40  <Field String _location>
        //   49  104:invokestatic    #22  <Method String String.valueOf(Object)>
        //   50  107:invokespecial   #25  <Method void StringBuilder(String)>
        //   51  110:aload           4
        //   52  112:invokevirtual   #80  <Method String ZipEntry.getName()>
        //   53  115:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
        //   54  118:invokevirtual   #38  <Method String StringBuilder.toString()>
        //   55  121:invokespecial   #95  <Method void FileOutputStream(String)>
        //   56  124:astore          6
        //   57  126:sipush          1024
        //   58  129:newarray        byte[]
        //   59  131:astore          7
        //   60  133:lconst_0        
        //   61  134:lstore          8
        // try 136 144 handler(s) 81
        //   62  136:aload_1         
        //   63  137:aload           7
        //   64  139:invokevirtual   #99  <Method int ZipInputStream.read(byte[])>
        //   65  142:istore          10
        //   66  144:iload           10
        //   67  146:iconst_m1       
        //   68  147:icmpne          162
        // try 150 159 handler(s) 81
        //   69  150:aload_1         
        //   70  151:invokevirtual   #102 <Method void ZipInputStream.closeEntry()>
        //   71  154:aload           6
        //   72  156:invokevirtual   #103 <Method void FileOutputStream.close()>
        //   73  159:goto            19
        //   74  162:lload           8
        //   75  164:iload           10
        //   76  166:i2l             
        //   77  167:ladd            
        //   78  168:lstore          8
        // try 170 180 handler(s) 81
        //   79  170:aload           6
        //   80  172:aload           7
        //   81  174:iconst_0        
        //   82  175:iload           10
        //   83  177:invokevirtual   #107 <Method void FileOutputStream.write(byte[], int, int)>
        //   84  180:goto            136
        }

        private String _location;
        private String _zipFile;
    }

    public static class DownloadFile extends AsyncTask
    {

        public DownloadFile()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #9   <Method void AsyncTask()>
        //    2    4:return          
        }

        protected volatile transient Object doInBackground(Object aobj[])
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #13  <Class String[]>
        //    3    5:invokevirtual   #16  <Method String doInBackground(String[])>
        //    4    8:areturn         
        }

        protected transient String doInBackground(String as[])
        {
        // try 0 61 handler(s) 164
        //    0    0:new             #20  <Class URL>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:iconst_0        
        //    4    6:aaload          
        //    5    7:invokespecial   #23  <Method void URL(String)>
        //    6   10:astore_2        
        //    7   11:aload_2         
        //    8   12:invokevirtual   #27  <Method URLConnection URL.openConnection()>
        //    9   15:astore          4
        //   10   17:aload           4
        //   11   19:invokevirtual   #32  <Method void URLConnection.connect()>
        //   12   22:aload           4
        //   13   24:invokevirtual   #36  <Method int URLConnection.getContentLength()>
        //   14   27:istore          5
        //   15   29:new             #38  <Class BufferedInputStream>
        //   16   32:dup             
        //   17   33:aload_2         
        //   18   34:invokevirtual   #42  <Method java.io.InputStream URL.openStream()>
        //   19   37:invokespecial   #45  <Method void BufferedInputStream(java.io.InputStream)>
        //   20   40:astore          6
        //   21   42:new             #47  <Class FileOutputStream>
        //   22   45:dup             
        //   23   46:getstatic       #53  <Field String StorePackages.currentDownloadDestination>
        //   24   49:invokespecial   #54  <Method void FileOutputStream(String)>
        //   25   52:astore          7
        //   26   54:sipush          1024
        //   27   57:newarray        byte[]
        //   28   59:astore          8
        //   29   61:lconst_0        
        //   30   62:lstore          9
        // try 64 73 handler(s) 164
        //   31   64:aload           6
        //   32   66:aload           8
        //   33   68:invokevirtual   #58  <Method int BufferedInputStream.read(byte[])>
        //   34   71:istore          11
        //   35   73:iload           11
        //   36   75:iconst_m1       
        //   37   76:icmpne          113
        // try 79 110 handler(s) 164
        //   38   79:aload           7
        //   39   81:invokevirtual   #61  <Method void FileOutputStream.flush()>
        //   40   84:aload           7
        //   41   86:invokevirtual   #64  <Method void FileOutputStream.close()>
        //   42   89:aload           6
        //   43   91:invokevirtual   #65  <Method void BufferedInputStream.close()>
        //   44   94:new             #67  <Class StorePackages$Decompress>
        //   45   97:dup             
        //   46   98:getstatic       #53  <Field String StorePackages.currentDownloadDestination>
        //   47  101:getstatic       #72  <Field String Settings.sdCardPath>
        //   48  104:invokespecial   #75  <Method void StorePackages$Decompress(String, String)>
        //   49  107:invokevirtual   #78  <Method void StorePackages$Decompress.unzip()>
        //   50  110:goto            165
        //   51  113:lload           9
        //   52  115:iload           11
        //   53  117:i2l             
        //   54  118:ladd            
        //   55  119:lstore          9
        // try 121 161 handler(s) 164
        //   56  121:iconst_1        
        //   57  122:anewarray       Integer[]
        //   58  125:astore          12
        //   59  127:aload           12
        //   60  129:iconst_0        
        //   61  130:ldc2w           #81  <Long 100L>
        //   62  133:lload           9
        //   63  135:lmul            
        //   64  136:iload           5
        //   65  138:i2l             
        //   66  139:ldiv            
        //   67  140:l2i             
        //   68  141:invokestatic    #86  <Method Integer Integer.valueOf(int)>
        //   69  144:aastore         
        //   70  145:aload_0         
        //   71  146:aload           12
        //   72  148:invokevirtual   #90  <Method void publishProgress(Object[])>
        //   73  151:aload           7
        //   74  153:aload           8
        //   75  155:iconst_0        
        //   76  156:iload           11
        //   77  158:invokevirtual   #94  <Method void FileOutputStream.write(byte[], int, int)>
        //   78  161:goto            64
        // catch Exception Exception Exception Exception
        //   79  164:astore_3        
        //   80  165:aconst_null     
        //   81  166:areturn         
        }

        protected volatile void onPostExecute(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #98  <Class String>
        //    3    5:invokevirtual   #100 <Method void onPostExecute(String)>
        //    4    8:return          
        }

        protected void onPostExecute(String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #102 <Method void AsyncTask.onPostExecute(Object)>
        // try 5 11 handler(s) 49
        //    3    5:getstatic       #106 <Field ProgressDialog StorePackages.mProgressDialog>
        //    4    8:invokevirtual   #111 <Method void ProgressDialog.cancel()>
        //    5   11:new             #113 <Class StringBuilder>
        //    6   14:dup             
        //    7   15:ldc1            #115 <String "Package ">
        //    8   17:invokespecial   #116 <Method void StringBuilder(String)>
        //    9   20:getstatic       #119 <Field String StorePackages.currentTitle>
        //   10   23:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
        //   11   26:ldc1            #125 <String " has been successfully installed.">
        //   12   28:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
        //   13   31:invokevirtual   #129 <Method String StringBuilder.toString()>
        //   14   34:ldc1            #131 <String "done">
        //   15   36:getstatic       #135 <Field Context StorePackages.currentContext>
        //   16   39:invokestatic    #141 <Method void el7rUtilities.messageBox(String, String, Context)>
        // try 42 48 handler(s) 57
        //   17   42:invokestatic    #146 <Method void StoreItemActivity.reset()>
        //   18   45:invokestatic    #149 <Method void StoreActivity.reset()>
        //   19   48:return          
        // catch Exception
        //   20   49:astore_2        
        //   21   50:aload_2         
        //   22   51:invokevirtual   #152 <Method void Exception.printStackTrace()>
        //   23   54:goto            11
        // catch Exception
        //   24   57:astore_3        
        //   25   58:return          
        }

        protected void onPreExecute()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #155 <Method void AsyncTask.onPreExecute()>
        //    2    4:getstatic       #106 <Field ProgressDialog StorePackages.mProgressDialog>
        //    3    7:invokevirtual   #158 <Method void ProgressDialog.show()>
        //    4   10:return          
        }

        protected transient void onProgressUpdate(Integer ainteger[])
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #162 <Method void AsyncTask.onProgressUpdate(Object[])>
        //    3    5:getstatic       #106 <Field ProgressDialog StorePackages.mProgressDialog>
        //    4    8:aload_1         
        //    5    9:iconst_0        
        //    6   10:aaload          
        //    7   11:invokevirtual   #165 <Method int Integer.intValue()>
        //    8   14:invokevirtual   #169 <Method void ProgressDialog.setProgress(int)>
        //    9   17:aload_1         
        //   10   18:iconst_0        
        //   11   19:aaload          
        //   12   20:invokevirtual   #165 <Method int Integer.intValue()>
        //   13   23:bipush          100
        //   14   25:icmpne          51
        //   15   28:getstatic       #106 <Field ProgressDialog StorePackages.mProgressDialog>
        //   16   31:iconst_1        
        //   17   32:invokevirtual   #173 <Method void ProgressDialog.setIndeterminate(boolean)>
        //   18   35:getstatic       #106 <Field ProgressDialog StorePackages.mProgressDialog>
        //   19   38:bipush          50
        //   20   40:invokevirtual   #169 <Method void ProgressDialog.setProgress(int)>
        //   21   43:getstatic       #106 <Field ProgressDialog StorePackages.mProgressDialog>
        //   22   46:ldc1            #175 <String "Installing... (may take some time)">
        //   23   48:invokevirtual   #179 <Method void ProgressDialog.setMessage(CharSequence)>
        //   24   51:return          
        }

        protected volatile transient void onProgressUpdate(Object aobj[])
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #181 <Class Integer[]>
        //    3    5:invokevirtual   #183 <Method void onProgressUpdate(Integer[])>
        //    4    8:return          
        }
    }


    static 
    {
    //    0    0:aconst_null     
    //    1    1:putstatic       #16  <Field String currentDownloadDestination>
    //    2    4:return          
    }

    public StorePackages()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #19  <Method void Object()>
    //    2    4:return          
    }

    public static boolean deleteDirectory(File file)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #27  <Method boolean File.exists()>
    //    2    4:ifeq            26
    //    3    7:aload_0         
    //    4    8:invokevirtual   #31  <Method File[] File.listFiles()>
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:ifnonnull       18
    //    8   16:iconst_1        
    //    9   17:ireturn         
    //   10   18:iconst_0        
    //   11   19:istore_2        
    //   12   20:iload_2         
    //   13   21:aload_1         
    //   14   22:arraylength     
    //   15   23:icmplt          31
    //   16   26:aload_0         
    //   17   27:invokevirtual   #34  <Method boolean File.delete()>
    //   18   30:ireturn         
    //   19   31:aload_1         
    //   20   32:iload_2         
    //   21   33:aaload          
    //   22   34:invokevirtual   #37  <Method boolean File.isDirectory()>
    //   23   37:ifeq            53
    //   24   40:aload_1         
    //   25   41:iload_2         
    //   26   42:aaload          
    //   27   43:invokestatic    #39  <Method boolean deleteDirectory(File)>
    //   28   46:pop             
    //   29   47:iinc            2  1
    //   30   50:goto            20
    //   31   53:aload_1         
    //   32   54:iload_2         
    //   33   55:aaload          
    //   34   56:invokevirtual   #34  <Method boolean File.delete()>
    //   35   59:pop             
    //   36   60:goto            47
    }

    public static void install(String s, String s1, String s2, Context context)
    {
    //    0    0:aload_1         
    //    1    1:putstatic       #43  <Field String currentUniqueID>
    //    2    4:aload_2         
    //    3    5:putstatic       #45  <Field String currentTitle>
    //    4    8:aload_3         
    //    5    9:putstatic       #47  <Field Context currentContext>
    //    6   12:new             #49  <Class StringBuilder>
    //    7   15:dup             
    //    8   16:getstatic       #54  <Field String Settings.sdCardPath>
    //    9   19:invokestatic    #60  <Method String String.valueOf(Object)>
    //   10   22:invokespecial   #63  <Method void StringBuilder(String)>
    //   11   25:getstatic       #66  <Field String File.separator>
    //   12   28:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
    //   13   31:getstatic       #66  <Field String File.separator>
    //   14   34:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
    //   15   37:ldc1            #72  <String "cache">
    //   16   39:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
    //   17   42:getstatic       #66  <Field String File.separator>
    //   18   45:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
    //   19   48:getstatic       #43  <Field String currentUniqueID>
    //   20   51:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
    //   21   54:ldc1            #74  <String ".package">
    //   22   56:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
    //   23   59:invokevirtual   #78  <Method String StringBuilder.toString()>
    //   24   62:putstatic       #16  <Field String currentDownloadDestination>
    //   25   65:new             #23  <Class File>
    //   26   68:dup             
    //   27   69:new             #49  <Class StringBuilder>
    //   28   72:dup             
    //   29   73:getstatic       #54  <Field String Settings.sdCardPath>
    //   30   76:invokestatic    #60  <Method String String.valueOf(Object)>
    //   31   79:invokespecial   #63  <Method void StringBuilder(String)>
    //   32   82:getstatic       #66  <Field String File.separator>
    //   33   85:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
    //   34   88:getstatic       #66  <Field String File.separator>
    //   35   91:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
    //   36   94:ldc1            #72  <String "cache">
    //   37   96:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
    //   38   99:invokevirtual   #78  <Method String StringBuilder.toString()>
    //   39  102:invokespecial   #79  <Method void File(String)>
    //   40  105:astore          4
    //   41  107:aload           4
    //   42  109:invokevirtual   #82  <Method boolean File.mkdirs()>
    //   43  112:pop             
    //   44  113:new             #84  <Class ProgressDialog>
    //   45  116:dup             
    //   46  117:aload_3         
    //   47  118:invokespecial   #87  <Method void ProgressDialog(Context)>
    //   48  121:putstatic       #89  <Field ProgressDialog mProgressDialog>
    //   49  124:getstatic       #89  <Field ProgressDialog mProgressDialog>
    //   50  127:new             #49  <Class StringBuilder>
    //   51  130:dup             
    //   52  131:ldc1            #91  <String "Downloading ">
    //   53  133:invokespecial   #63  <Method void StringBuilder(String)>
    //   54  136:aload_2         
    //   55  137:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
    //   56  140:invokevirtual   #78  <Method String StringBuilder.toString()>
    //   57  143:invokevirtual   #95  <Method void ProgressDialog.setMessage(CharSequence)>
    //   58  146:getstatic       #89  <Field ProgressDialog mProgressDialog>
    //   59  149:iconst_0        
    //   60  150:invokevirtual   #99  <Method void ProgressDialog.setIndeterminate(boolean)>
    //   61  153:getstatic       #89  <Field ProgressDialog mProgressDialog>
    //   62  156:bipush          100
    //   63  158:invokevirtual   #103 <Method void ProgressDialog.setMax(int)>
    //   64  161:getstatic       #89  <Field ProgressDialog mProgressDialog>
    //   65  164:iconst_1        
    //   66  165:invokevirtual   #106 <Method void ProgressDialog.setProgressStyle(int)>
    //   67  168:getstatic       #89  <Field ProgressDialog mProgressDialog>
    //   68  171:iconst_0        
    //   69  172:invokevirtual   #109 <Method void ProgressDialog.setCancelable(boolean)>
    //   70  175:aload           4
    //   71  177:invokevirtual   #27  <Method boolean File.exists()>
    //   72  180:ifeq            203
    //   73  183:new             #111 <Class StorePackages$DownloadFile>
    //   74  186:dup             
    //   75  187:invokespecial   #112 <Method void StorePackages$DownloadFile()>
    //   76  190:iconst_1        
    //   77  191:anewarray       String[]
    //   78  194:dup             
    //   79  195:iconst_0        
    //   80  196:aload_0         
    //   81  197:aastore         
    //   82  198:invokevirtual   #116 <Method AsyncTask StorePackages$DownloadFile.execute(Object[])>
    //   83  201:pop             
    //   84  202:return          
    //   85  203:ldc1            #118 <String "Error, couldn't write data to your storage media, please report to codeadore@gmail.com">
    //   86  205:ldc1            #120 <String "fail">
    //   87  207:aload_3         
    //   88  208:invokestatic    #126 <Method void el7rUtilities.messageBox(String, String, Context)>
    //   89  211:return          
    }

    public static boolean isInstalled(String s)
    {
    //    0    0:new             #23  <Class File>
    //    1    3:dup             
    //    2    4:new             #49  <Class StringBuilder>
    //    3    7:dup             
    //    4    8:getstatic       #54  <Field String Settings.sdCardPath>
    //    5   11:invokestatic    #60  <Method String String.valueOf(Object)>
    //    6   14:invokespecial   #63  <Method void StringBuilder(String)>
    //    7   17:getstatic       #66  <Field String File.separator>
    //    8   20:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
    //    9   23:aload_0         
    //   10   24:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
    //   11   27:invokevirtual   #78  <Method String StringBuilder.toString()>
    //   12   30:invokespecial   #79  <Method void File(String)>
    //   13   33:invokevirtual   #37  <Method boolean File.isDirectory()>
    //   14   36:ifeq            41
    //   15   39:iconst_1        
    //   16   40:ireturn         
    //   17   41:iconst_0        
    //   18   42:ireturn         
    }

    public static void uninstall(String s, Context context)
    {
    //    0    0:new             #84  <Class ProgressDialog>
    //    1    3:dup             
    //    2    4:aload_1         
    //    3    5:invokespecial   #87  <Method void ProgressDialog(Context)>
    //    4    8:putstatic       #89  <Field ProgressDialog mProgressDialog>
    //    5   11:getstatic       #89  <Field ProgressDialog mProgressDialog>
    //    6   14:ldc1            #132 <String "Uninstalling...">
    //    7   16:invokevirtual   #95  <Method void ProgressDialog.setMessage(CharSequence)>
    //    8   19:getstatic       #89  <Field ProgressDialog mProgressDialog>
    //    9   22:iconst_1        
    //   10   23:invokevirtual   #99  <Method void ProgressDialog.setIndeterminate(boolean)>
    //   11   26:getstatic       #89  <Field ProgressDialog mProgressDialog>
    //   12   29:iconst_1        
    //   13   30:invokevirtual   #106 <Method void ProgressDialog.setProgressStyle(int)>
    //   14   33:getstatic       #89  <Field ProgressDialog mProgressDialog>
    //   15   36:iconst_0        
    //   16   37:invokevirtual   #109 <Method void ProgressDialog.setCancelable(boolean)>
    //   17   40:getstatic       #89  <Field ProgressDialog mProgressDialog>
    //   18   43:invokevirtual   #135 <Method void ProgressDialog.show()>
    //   19   46:new             #137 <Class Thread>
    //   20   49:dup             
    //   21   50:new             #139 <Class StorePackages$1>
    //   22   53:dup             
    //   23   54:aload_0         
    //   24   55:aload_1         
    //   25   56:invokespecial   #141 <Method void StorePackages$1(String, Context)>
    //   26   59:invokespecial   #144 <Method void Thread(Runnable)>
    //   27   62:invokevirtual   #147 <Method void Thread.start()>
    //   28   65:return          
    }

    static Context currentContext;
    static String currentDownloadDestination;
    static String currentTitle;
    static String currentUniqueID;
    static ProgressDialog mProgressDialog;

    // Unreferenced inner class codeadore/textgram/store/StorePackages$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #18  <Field String val$unique_id>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #20  <Field Context val$c>
        //    6   10:aload_0         
        //    7   11:invokespecial   #23  <Method void Object()>
        //    8   14:return          
        }

        public void run()
        {
        //    0    0:new             #28  <Class File>
        //    1    3:dup             
        //    2    4:new             #30  <Class StringBuilder>
        //    3    7:dup             
        //    4    8:getstatic       #35  <Field String Settings.sdCardPath>
        //    5   11:invokestatic    #41  <Method String String.valueOf(Object)>
        //    6   14:invokespecial   #44  <Method void StringBuilder(String)>
        //    7   17:getstatic       #47  <Field String File.separator>
        //    8   20:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
        //    9   23:aload_0         
        //   10   24:getfield        #18  <Field String val$unique_id>
        //   11   27:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
        //   12   30:invokevirtual   #55  <Method String StringBuilder.toString()>
        //   13   33:invokespecial   #56  <Method void File(String)>
        //   14   36:invokestatic    #60  <Method boolean StorePackages.deleteDirectory(File)>
        //   15   39:ifeq            49
        // try 42 49 handler(s) 69
        //   16   42:aload_0         
        //   17   43:getfield        #20  <Field Context val$c>
        //   18   46:invokestatic    #66  <Method void Utilities.updateLists(Context)>
        //   19   49:getstatic       #72  <Field Handler StoreActivity.UIHandler>
        //   20   52:new             #74  <Class StorePackages$1$1>
        //   21   55:dup             
        //   22   56:aload_0         
        //   23   57:aload_0         
        //   24   58:getfield        #20  <Field Context val$c>
        //   25   61:invokespecial   #77  <Method void StorePackages$1$1(StorePackages$1, Context)>
        //   26   64:invokevirtual   #83  <Method boolean Handler.post(Runnable)>
        //   27   67:pop             
        //   28   68:return          
        // catch IOException
        //   29   69:astore_2        
        //   30   70:aload_2         
        //   31   71:invokevirtual   #86  <Method void IOException.printStackTrace()>
        //   32   74:goto            49
        }

        private final Context val$c;
        private final String val$unique_id;
    }


    // Unreferenced inner class codeadore/textgram/store/StorePackages$1$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StorePackages$1 this$1>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field Context val$c>
        //    6   10:aload_0         
        //    7   11:invokespecial   #23  <Method void Object()>
        //    8   14:return          
        }

        public void run()
        {
        //    0    0:ldc1            #27  <String "Uninstalled successfully">
        //    1    2:ldc1            #29  <String "done">
        //    2    4:aload_0         
        //    3    5:getfield        #21  <Field Context val$c>
        //    4    8:invokestatic    #35  <Method void el7rUtilities.messageBox(String, String, Context)>
        //    5   11:getstatic       #41  <Field ProgressDialog StorePackages.mProgressDialog>
        //    6   14:invokevirtual   #46  <Method void ProgressDialog.cancel()>
        // try 17 23 handler(s) 24
        //    7   17:invokestatic    #51  <Method void StoreItemActivity.reset()>
        //    8   20:invokestatic    #54  <Method void StoreActivity.reset()>
        //    9   23:return          
        // catch Exception
        //   10   24:astore_1        
        //   11   25:return          
        }

        final _cls1 this$1;
        private final Context val$c;
    }

}
