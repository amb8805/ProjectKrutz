// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.content;

import android.content.*;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.*;
import java.util.*;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider
{
    static interface PathStrategy
    {

        public abstract File getFileForUri(Uri uri);

        public abstract Uri getUriForFile(File file);
    }

    static class SimplePathStrategy
        implements PathStrategy
    {

        public SimplePathStrategy(String s)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #16  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:new             #18  <Class HashMap>
        //    4    8:dup             
        //    5    9:invokespecial   #19  <Method void HashMap()>
        //    6   12:putfield        #21  <Field HashMap mRoots>
        //    7   15:aload_0         
        //    8   16:aload_1         
        //    9   17:putfield        #23  <Field String mAuthority>
        //   10   20:return          
        }

        public void addRoot(String s, File file)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #33  <Method boolean TextUtils.isEmpty(CharSequence)>
        //    2    4:ifeq            17
        //    3    7:new             #35  <Class IllegalArgumentException>
        //    4   10:dup             
        //    5   11:ldc1            #37  <String "Name must not be empty">
        //    6   13:invokespecial   #39  <Method void IllegalArgumentException(String)>
        //    7   16:athrow          
        // try 17 23 handler(s) 35
        //    8   17:aload_2         
        //    9   18:invokevirtual   #45  <Method File File.getCanonicalFile()>
        //   10   21:astore          4
        //   11   23:aload_0         
        //   12   24:getfield        #21  <Field HashMap mRoots>
        //   13   27:aload_1         
        //   14   28:aload           4
        //   15   30:invokevirtual   #49  <Method Object HashMap.put(Object, Object)>
        //   16   33:pop             
        //   17   34:return          
        // catch IOException
        //   18   35:astore_3        
        //   19   36:new             #35  <Class IllegalArgumentException>
        //   20   39:dup             
        //   21   40:new             #51  <Class StringBuilder>
        //   22   43:dup             
        //   23   44:invokespecial   #52  <Method void StringBuilder()>
        //   24   47:ldc1            #54  <String "Failed to resolve canonical path for ">
        //   25   49:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
        //   26   52:aload_2         
        //   27   53:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
        //   28   56:invokevirtual   #65  <Method String StringBuilder.toString()>
        //   29   59:aload_3         
        //   30   60:invokespecial   #68  <Method void IllegalArgumentException(String, Throwable)>
        //   31   63:athrow          
        }

        public File getFileForUri(Uri uri)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #75  <Method String Uri.getEncodedPath()>
        //    2    4:astore_2        
        //    3    5:aload_2         
        //    4    6:bipush          47
        //    5    8:iconst_1        
        //    6    9:invokevirtual   #81  <Method int String.indexOf(int, int)>
        //    7   12:istore_3        
        //    8   13:aload_2         
        //    9   14:iconst_1        
        //   10   15:iload_3         
        //   11   16:invokevirtual   #85  <Method String String.substring(int, int)>
        //   12   19:invokestatic    #89  <Method String Uri.decode(String)>
        //   13   22:astore          4
        //   14   24:aload_2         
        //   15   25:iload_3         
        //   16   26:iconst_1        
        //   17   27:iadd            
        //   18   28:invokevirtual   #92  <Method String String.substring(int)>
        //   19   31:invokestatic    #89  <Method String Uri.decode(String)>
        //   20   34:astore          5
        //   21   36:aload_0         
        //   22   37:getfield        #21  <Field HashMap mRoots>
        //   23   40:aload           4
        //   24   42:invokevirtual   #96  <Method Object HashMap.get(Object)>
        //   25   45:checkcast       #41  <Class File>
        //   26   48:astore          6
        //   27   50:aload           6
        //   28   52:ifnonnull       82
        //   29   55:new             #35  <Class IllegalArgumentException>
        //   30   58:dup             
        //   31   59:new             #51  <Class StringBuilder>
        //   32   62:dup             
        //   33   63:invokespecial   #52  <Method void StringBuilder()>
        //   34   66:ldc1            #98  <String "Unable to find configured root for ">
        //   35   68:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
        //   36   71:aload_1         
        //   37   72:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
        //   38   75:invokevirtual   #65  <Method String StringBuilder.toString()>
        //   39   78:invokespecial   #39  <Method void IllegalArgumentException(String)>
        //   40   81:athrow          
        //   41   82:new             #41  <Class File>
        //   42   85:dup             
        //   43   86:aload           6
        //   44   88:aload           5
        //   45   90:invokespecial   #101 <Method void File(File, String)>
        //   46   93:astore          7
        // try 95 102 handler(s) 128
        //   47   95:aload           7
        //   48   97:invokevirtual   #45  <Method File File.getCanonicalFile()>
        //   49  100:astore          9
        //   50  102:aload           9
        //   51  104:invokevirtual   #104 <Method String File.getPath()>
        //   52  107:aload           6
        //   53  109:invokevirtual   #104 <Method String File.getPath()>
        //   54  112:invokevirtual   #108 <Method boolean String.startsWith(String)>
        //   55  115:ifne            158
        //   56  118:new             #110 <Class SecurityException>
        //   57  121:dup             
        //   58  122:ldc1            #112 <String "Resolved path jumped beyond configured root">
        //   59  124:invokespecial   #113 <Method void SecurityException(String)>
        //   60  127:athrow          
        // catch IOException
        //   61  128:astore          8
        //   62  130:new             #35  <Class IllegalArgumentException>
        //   63  133:dup             
        //   64  134:new             #51  <Class StringBuilder>
        //   65  137:dup             
        //   66  138:invokespecial   #52  <Method void StringBuilder()>
        //   67  141:ldc1            #54  <String "Failed to resolve canonical path for ">
        //   68  143:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
        //   69  146:aload           7
        //   70  148:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
        //   71  151:invokevirtual   #65  <Method String StringBuilder.toString()>
        //   72  154:invokespecial   #39  <Method void IllegalArgumentException(String)>
        //   73  157:athrow          
        //   74  158:aload           9
        //   75  160:areturn         
        }

        public Uri getUriForFile(File file)
        {
        // try 0 5 handler(s) 104
        //    0    0:aload_1         
        //    1    1:invokevirtual   #118 <Method String File.getCanonicalPath()>
        //    2    4:astore_3        
        //    3    5:aconst_null     
        //    4    6:astore          4
        //    5    8:aload_0         
        //    6    9:getfield        #21  <Field HashMap mRoots>
        //    7   12:invokevirtual   #122 <Method Set HashMap.entrySet()>
        //    8   15:invokeinterface #128 <Method Iterator Set.iterator()>
        //    9   20:astore          5
        //   10   22:aload           5
        //   11   24:invokeinterface #134 <Method boolean Iterator.hasNext()>
        //   12   29:ifeq            132
        //   13   32:aload           5
        //   14   34:invokeinterface #138 <Method Object Iterator.next()>
        //   15   39:checkcast       #140 <Class java.util.Map$Entry>
        //   16   42:astore          9
        //   17   44:aload           9
        //   18   46:invokeinterface #143 <Method Object java.util.Map$Entry.getValue()>
        //   19   51:checkcast       #41  <Class File>
        //   20   54:invokevirtual   #104 <Method String File.getPath()>
        //   21   57:astore          10
        //   22   59:aload_3         
        //   23   60:aload           10
        //   24   62:invokevirtual   #108 <Method boolean String.startsWith(String)>
        //   25   65:ifeq            22
        //   26   68:aload           4
        //   27   70:ifnull          97
        //   28   73:aload           10
        //   29   75:invokevirtual   #147 <Method int String.length()>
        //   30   78:aload           4
        //   31   80:invokeinterface #143 <Method Object java.util.Map$Entry.getValue()>
        //   32   85:checkcast       #41  <Class File>
        //   33   88:invokevirtual   #104 <Method String File.getPath()>
        //   34   91:invokevirtual   #147 <Method int String.length()>
        //   35   94:icmple          22
        //   36   97:aload           9
        //   37   99:astore          4
        //   38  101:goto            22
        // catch IOException
        //   39  104:astore_2        
        //   40  105:new             #35  <Class IllegalArgumentException>
        //   41  108:dup             
        //   42  109:new             #51  <Class StringBuilder>
        //   43  112:dup             
        //   44  113:invokespecial   #52  <Method void StringBuilder()>
        //   45  116:ldc1            #54  <String "Failed to resolve canonical path for ">
        //   46  118:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
        //   47  121:aload_1         
        //   48  122:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
        //   49  125:invokevirtual   #65  <Method String StringBuilder.toString()>
        //   50  128:invokespecial   #39  <Method void IllegalArgumentException(String)>
        //   51  131:athrow          
        //   52  132:aload           4
        //   53  134:ifnonnull       164
        //   54  137:new             #35  <Class IllegalArgumentException>
        //   55  140:dup             
        //   56  141:new             #51  <Class StringBuilder>
        //   57  144:dup             
        //   58  145:invokespecial   #52  <Method void StringBuilder()>
        //   59  148:ldc1            #149 <String "Failed to find configured root that contains ">
        //   60  150:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
        //   61  153:aload_3         
        //   62  154:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
        //   63  157:invokevirtual   #65  <Method String StringBuilder.toString()>
        //   64  160:invokespecial   #39  <Method void IllegalArgumentException(String)>
        //   65  163:athrow          
        //   66  164:aload           4
        //   67  166:invokeinterface #143 <Method Object java.util.Map$Entry.getValue()>
        //   68  171:checkcast       #41  <Class File>
        //   69  174:invokevirtual   #104 <Method String File.getPath()>
        //   70  177:astore          6
        //   71  179:aload           6
        //   72  181:ldc1            #151 <String "/">
        //   73  183:invokevirtual   #154 <Method boolean String.endsWith(String)>
        //   74  186:ifeq            271
        //   75  189:aload_3         
        //   76  190:aload           6
        //   77  192:invokevirtual   #147 <Method int String.length()>
        //   78  195:invokevirtual   #92  <Method String String.substring(int)>
        //   79  198:astore          7
        //   80  200:new             #51  <Class StringBuilder>
        //   81  203:dup             
        //   82  204:invokespecial   #52  <Method void StringBuilder()>
        //   83  207:aload           4
        //   84  209:invokeinterface #157 <Method Object java.util.Map$Entry.getKey()>
        //   85  214:checkcast       #77  <Class String>
        //   86  217:invokestatic    #160 <Method String Uri.encode(String)>
        //   87  220:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
        //   88  223:bipush          47
        //   89  225:invokevirtual   #163 <Method StringBuilder StringBuilder.append(char)>
        //   90  228:aload           7
        //   91  230:ldc1            #151 <String "/">
        //   92  232:invokestatic    #166 <Method String Uri.encode(String, String)>
        //   93  235:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
        //   94  238:invokevirtual   #65  <Method String StringBuilder.toString()>
        //   95  241:astore          8
        //   96  243:new             #168 <Class android.net.Uri$Builder>
        //   97  246:dup             
        //   98  247:invokespecial   #169 <Method void android.net.Uri$Builder()>
        //   99  250:ldc1            #171 <String "content">
        //  100  252:invokevirtual   #175 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
        //  101  255:aload_0         
        //  102  256:getfield        #23  <Field String mAuthority>
        //  103  259:invokevirtual   #178 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
        //  104  262:aload           8
        //  105  264:invokevirtual   #181 <Method android.net.Uri$Builder android.net.Uri$Builder.encodedPath(String)>
        //  106  267:invokevirtual   #185 <Method Uri android.net.Uri$Builder.build()>
        //  107  270:areturn         
        //  108  271:aload_3         
        //  109  272:iconst_1        
        //  110  273:aload           6
        //  111  275:invokevirtual   #147 <Method int String.length()>
        //  112  278:iadd            
        //  113  279:invokevirtual   #92  <Method String String.substring(int)>
        //  114  282:astore          7
        //  115  284:goto            200
        }

        private final String mAuthority;
        private final HashMap mRoots;
    }


    static 
    {
    //    0    0:iconst_2        
    //    1    1:anewarray       String[]
    //    2    4:dup             
    //    3    5:iconst_0        
    //    4    6:ldc1            #41  <String "_display_name">
    //    5    8:aastore         
    //    6    9:dup             
    //    7   10:iconst_1        
    //    8   11:ldc1            #43  <String "_size">
    //    9   13:aastore         
    //   10   14:putstatic       #45  <Field String[] COLUMNS>
    //   11   17:new             #47  <Class File>
    //   12   20:dup             
    //   13   21:ldc1            #49  <String "/">
    //   14   23:invokespecial   #53  <Method void File(String)>
    //   15   26:putstatic       #55  <Field File DEVICE_ROOT>
    //   16   29:new             #57  <Class HashMap>
    //   17   32:dup             
    //   18   33:invokespecial   #59  <Method void HashMap()>
    //   19   36:putstatic       #61  <Field HashMap sCache>
    //   20   39:return          
    }

    public FileProvider()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #62  <Method void ContentProvider()>
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
    //    9   10:icmpge          46
    //   10   13:aload_1         
    //   11   14:iload_3         
    //   12   15:aaload          
    //   13   16:astore          5
    //   14   18:aload           5
    //   15   20:ifnull          49
    //   16   23:new             #47  <Class File>
    //   17   26:dup             
    //   18   27:aload           4
    //   19   29:aload           5
    //   20   31:invokespecial   #67  <Method void File(File, String)>
    //   21   34:astore          6
    //   22   36:iinc            3  1
    //   23   39:aload           6
    //   24   41:astore          4
    //   25   43:goto            8
    //   26   46:aload           4
    //   27   48:areturn         
    //   28   49:aload           4
    //   29   51:astore          6
    //   30   53:goto            36
    }

    private static Object[] copyOf(Object aobj[], int i)
    {
    //    0    0:iload_1         
    //    1    1:anewarray       Object[]
    //    2    4:astore_2        
    //    3    5:aload_0         
    //    4    6:iconst_0        
    //    5    7:aload_2         
    //    6    8:iconst_0        
    //    7    9:iload_1         
    //    8   10:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
    //    9   13:aload_2         
    //   10   14:areturn         
    }

    private static String[] copyOf(String as[], int i)
    {
    //    0    0:iload_1         
    //    1    1:anewarray       String[]
    //    2    4:astore_2        
    //    3    5:aload_0         
    //    4    6:iconst_0        
    //    5    7:aload_2         
    //    6    8:iconst_0        
    //    7    9:iload_1         
    //    8   10:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
    //    9   13:aload_2         
    //   10   14:areturn         
    }

    private static PathStrategy getPathStrategy(Context context, String s)
    {
    //    0    0:getstatic       #61  <Field HashMap sCache>
    //    1    3:astore_2        
    //    2    4:aload_2         
    //    3    5:monitorenter    
    // try 6 18 handler(s) 63
    //    4    6:getstatic       #61  <Field HashMap sCache>
    //    5    9:aload_1         
    //    6   10:invokevirtual   #88  <Method Object HashMap.get(Object)>
    //    7   13:checkcast       #90  <Class FileProvider$PathStrategy>
    //    8   16:astore          4
    //    9   18:aload           4
    //   10   20:ifnonnull       44
    // try 23 30 handler(s) 49 68 63
    //   11   23:aload_0         
    //   12   24:aload_1         
    //   13   25:invokestatic    #93  <Method FileProvider$PathStrategy parsePathStrategy(Context, String)>
    //   14   28:astore          7
    //   15   30:aload           7
    //   16   32:astore          4
    // try 34 44 handler(s) 63
    //   17   34:getstatic       #61  <Field HashMap sCache>
    //   18   37:aload_1         
    //   19   38:aload           4
    //   20   40:invokevirtual   #97  <Method Object HashMap.put(Object, Object)>
    //   21   43:pop             
    // try 44 46 handler(s) 63
    //   22   44:aload_2         
    //   23   45:monitorexit     
    //   24   46:aload           4
    //   25   48:areturn         
    // catch IOException
    //   26   49:astore          6
    // try 51 63 handler(s) 63
    //   27   51:new             #99  <Class IllegalArgumentException>
    //   28   54:dup             
    //   29   55:ldc1            #101 <String "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data">
    //   30   57:aload           6
    //   31   59:invokespecial   #104 <Method void IllegalArgumentException(String, Throwable)>
    //   32   62:athrow          
    // finally
    //   33   63:astore_3        
    // try 64 66 handler(s) 63
    //   34   64:aload_2         
    //   35   65:monitorexit     
    //   36   66:aload_3         
    //   37   67:athrow          
    // catch XmlPullParserException
    //   38   68:astore          5
    // try 70 82 handler(s) 63
    //   39   70:new             #99  <Class IllegalArgumentException>
    //   40   73:dup             
    //   41   74:ldc1            #101 <String "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data">
    //   42   76:aload           5
    //   43   78:invokespecial   #104 <Method void IllegalArgumentException(String, Throwable)>
    //   44   81:athrow          
    }

    public static Uri getUriForFile(Context context, String s, File file)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokestatic    #108 <Method FileProvider$PathStrategy getPathStrategy(Context, String)>
    //    3    5:aload_2         
    //    4    6:invokeinterface #111 <Method Uri FileProvider$PathStrategy.getUriForFile(File)>
    //    5   11:areturn         
    }

    private static int modeToMode(String s)
    {
    //    0    0:ldc1            #115 <String "r">
    //    1    2:aload_0         
    //    2    3:invokevirtual   #119 <Method boolean String.equals(Object)>
    //    3    6:ifeq            12
    //    4    9:ldc1            #120 <Int 0x10000000>
    //    5   11:ireturn         
    //    6   12:ldc1            #122 <String "w">
    //    7   14:aload_0         
    //    8   15:invokevirtual   #119 <Method boolean String.equals(Object)>
    //    9   18:ifne            30
    //   10   21:ldc1            #124 <String "wt">
    //   11   23:aload_0         
    //   12   24:invokevirtual   #119 <Method boolean String.equals(Object)>
    //   13   27:ifeq            33
    //   14   30:ldc1            #125 <Int 0x2c000000>
    //   15   32:ireturn         
    //   16   33:ldc1            #127 <String "wa">
    //   17   35:aload_0         
    //   18   36:invokevirtual   #119 <Method boolean String.equals(Object)>
    //   19   39:ifeq            45
    //   20   42:ldc1            #128 <Int 0x2a000000>
    //   21   44:ireturn         
    //   22   45:ldc1            #130 <String "rw">
    //   23   47:aload_0         
    //   24   48:invokevirtual   #119 <Method boolean String.equals(Object)>
    //   25   51:ifeq            57
    //   26   54:ldc1            #131 <Int 0x38000000>
    //   27   56:ireturn         
    //   28   57:ldc1            #133 <String "rwt">
    //   29   59:aload_0         
    //   30   60:invokevirtual   #119 <Method boolean String.equals(Object)>
    //   31   63:ifeq            69
    //   32   66:ldc1            #134 <Int 0x3c000000>
    //   33   68:ireturn         
    //   34   69:new             #99  <Class IllegalArgumentException>
    //   35   72:dup             
    //   36   73:new             #136 <Class StringBuilder>
    //   37   76:dup             
    //   38   77:invokespecial   #137 <Method void StringBuilder()>
    //   39   80:ldc1            #139 <String "Invalid mode: ">
    //   40   82:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //   41   85:aload_0         
    //   42   86:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //   43   89:invokevirtual   #147 <Method String StringBuilder.toString()>
    //   44   92:invokespecial   #148 <Method void IllegalArgumentException(String)>
    //   45   95:athrow          
    }

    private static PathStrategy parsePathStrategy(Context context, String s)
        throws IOException, XmlPullParserException
    {
    //    0    0:new             #150 <Class FileProvider$SimplePathStrategy>
    //    1    3:dup             
    //    2    4:aload_1         
    //    3    5:invokespecial   #151 <Method void FileProvider$SimplePathStrategy(String)>
    //    4    8:astore_2        
    //    5    9:aload_0         
    //    6   10:invokevirtual   #157 <Method PackageManager Context.getPackageManager()>
    //    7   13:aload_1         
    //    8   14:sipush          128
    //    9   17:invokevirtual   #163 <Method ProviderInfo PackageManager.resolveContentProvider(String, int)>
    //   10   20:aload_0         
    //   11   21:invokevirtual   #157 <Method PackageManager Context.getPackageManager()>
    //   12   24:ldc1            #18  <String "android.support.FILE_PROVIDER_PATHS">
    //   13   26:invokevirtual   #169 <Method XmlResourceParser ProviderInfo.loadXmlMetaData(PackageManager, String)>
    //   14   29:astore_3        
    //   15   30:aload_3         
    //   16   31:ifnonnull       44
    //   17   34:new             #99  <Class IllegalArgumentException>
    //   18   37:dup             
    //   19   38:ldc1            #171 <String "Missing android.support.FILE_PROVIDER_PATHS meta-data">
    //   20   40:invokespecial   #148 <Method void IllegalArgumentException(String)>
    //   21   43:athrow          
    //   22   44:aload_3         
    //   23   45:invokeinterface #177 <Method int XmlResourceParser.next()>
    //   24   50:istore          4
    //   25   52:iload           4
    //   26   54:iconst_1        
    //   27   55:icmpeq          236
    //   28   58:iload           4
    //   29   60:iconst_2        
    //   30   61:icmpne          44
    //   31   64:aload_3         
    //   32   65:invokeinterface #180 <Method String XmlResourceParser.getName()>
    //   33   70:astore          5
    //   34   72:aload_3         
    //   35   73:aconst_null     
    //   36   74:ldc1            #8   <String "name">
    //   37   76:invokeinterface #184 <Method String XmlResourceParser.getAttributeValue(String, String)>
    //   38   81:astore          6
    //   39   83:aload_3         
    //   40   84:aconst_null     
    //   41   85:ldc1            #11  <String "path">
    //   42   87:invokeinterface #184 <Method String XmlResourceParser.getAttributeValue(String, String)>
    //   43   92:astore          7
    //   44   94:ldc1            #30  <String "root-path">
    //   45   96:aload           5
    //   46   98:invokevirtual   #119 <Method boolean String.equals(Object)>
    //   47  101:ifeq            137
    //   48  104:getstatic       #55  <Field File DEVICE_ROOT>
    //   49  107:iconst_1        
    //   50  108:anewarray       String[]
    //   51  111:dup             
    //   52  112:iconst_0        
    //   53  113:aload           7
    //   54  115:aastore         
    //   55  116:invokestatic    #186 <Method File buildPath(File, String[])>
    //   56  119:astore          9
    //   57  121:aload           9
    //   58  123:ifnull          44
    //   59  126:aload_2         
    //   60  127:aload           6
    //   61  129:aload           9
    //   62  131:invokevirtual   #190 <Method void FileProvider$SimplePathStrategy.addRoot(String, File)>
    //   63  134:goto            44
    //   64  137:ldc1            #27  <String "files-path">
    //   65  139:aload           5
    //   66  141:invokevirtual   #119 <Method boolean String.equals(Object)>
    //   67  144:ifeq            168
    //   68  147:aload_0         
    //   69  148:invokevirtual   #194 <Method File Context.getFilesDir()>
    //   70  151:iconst_1        
    //   71  152:anewarray       String[]
    //   72  155:dup             
    //   73  156:iconst_0        
    //   74  157:aload           7
    //   75  159:aastore         
    //   76  160:invokestatic    #186 <Method File buildPath(File, String[])>
    //   77  163:astore          9
    //   78  165:goto            121
    //   79  168:ldc1            #21  <String "cache-path">
    //   80  170:aload           5
    //   81  172:invokevirtual   #119 <Method boolean String.equals(Object)>
    //   82  175:ifeq            199
    //   83  178:aload_0         
    //   84  179:invokevirtual   #197 <Method File Context.getCacheDir()>
    //   85  182:iconst_1        
    //   86  183:anewarray       String[]
    //   87  186:dup             
    //   88  187:iconst_0        
    //   89  188:aload           7
    //   90  190:aastore         
    //   91  191:invokestatic    #186 <Method File buildPath(File, String[])>
    //   92  194:astore          9
    //   93  196:goto            121
    //   94  199:ldc1            #24  <String "external-path">
    //   95  201:aload           5
    //   96  203:invokevirtual   #119 <Method boolean String.equals(Object)>
    //   97  206:istore          8
    //   98  208:aconst_null     
    //   99  209:astore          9
    //  100  211:iload           8
    //  101  213:ifeq            121
    //  102  216:invokestatic    #202 <Method File Environment.getExternalStorageDirectory()>
    //  103  219:iconst_1        
    //  104  220:anewarray       String[]
    //  105  223:dup             
    //  106  224:iconst_0        
    //  107  225:aload           7
    //  108  227:aastore         
    //  109  228:invokestatic    #186 <Method File buildPath(File, String[])>
    //  110  231:astore          9
    //  111  233:goto            121
    //  112  236:aload_2         
    //  113  237:areturn         
    }

    public void attachInfo(Context context, ProviderInfo providerinfo)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #206 <Method void ContentProvider.attachInfo(Context, ProviderInfo)>
    //    4    6:aload_2         
    //    5    7:getfield        #210 <Field boolean ProviderInfo.exported>
    //    6   10:ifeq            23
    //    7   13:new             #212 <Class SecurityException>
    //    8   16:dup             
    //    9   17:ldc1            #214 <String "Provider must not be exported">
    //   10   19:invokespecial   #215 <Method void SecurityException(String)>
    //   11   22:athrow          
    //   12   23:aload_2         
    //   13   24:getfield        #218 <Field boolean ProviderInfo.grantUriPermissions>
    //   14   27:ifne            40
    //   15   30:new             #212 <Class SecurityException>
    //   16   33:dup             
    //   17   34:ldc1            #220 <String "Provider must grant uri permissions">
    //   18   36:invokespecial   #215 <Method void SecurityException(String)>
    //   19   39:athrow          
    //   20   40:aload_0         
    //   21   41:aload_1         
    //   22   42:aload_2         
    //   23   43:getfield        #223 <Field String ProviderInfo.authority>
    //   24   46:invokestatic    #108 <Method FileProvider$PathStrategy getPathStrategy(Context, String)>
    //   25   49:putfield        #225 <Field FileProvider$PathStrategy mStrategy>
    //   26   52:return          
    }

    public int delete(Uri uri, String s, String as[])
    {
    //    0    0:aload_0         
    //    1    1:getfield        #225 <Field FileProvider$PathStrategy mStrategy>
    //    2    4:aload_1         
    //    3    5:invokeinterface #231 <Method File FileProvider$PathStrategy.getFileForUri(Uri)>
    //    4   10:invokevirtual   #234 <Method boolean File.delete()>
    //    5   13:ifeq            18
    //    6   16:iconst_1        
    //    7   17:ireturn         
    //    8   18:iconst_0        
    //    9   19:ireturn         
    }

    public String getType(Uri uri)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #225 <Field FileProvider$PathStrategy mStrategy>
    //    2    4:aload_1         
    //    3    5:invokeinterface #231 <Method File FileProvider$PathStrategy.getFileForUri(Uri)>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:invokevirtual   #237 <Method String File.getName()>
    //    7   15:bipush          46
    //    8   17:invokevirtual   #241 <Method int String.lastIndexOf(int)>
    //    9   20:istore_3        
    //   10   21:iload_3         
    //   11   22:iflt            55
    //   12   25:aload_2         
    //   13   26:invokevirtual   #237 <Method String File.getName()>
    //   14   29:iload_3         
    //   15   30:iconst_1        
    //   16   31:iadd            
    //   17   32:invokevirtual   #245 <Method String String.substring(int)>
    //   18   35:astore          4
    //   19   37:invokestatic    #251 <Method MimeTypeMap MimeTypeMap.getSingleton()>
    //   20   40:aload           4
    //   21   42:invokevirtual   #255 <Method String MimeTypeMap.getMimeTypeFromExtension(String)>
    //   22   45:astore          5
    //   23   47:aload           5
    //   24   49:ifnull          55
    //   25   52:aload           5
    //   26   54:areturn         
    //   27   55:ldc2            #257 <String "application/octet-stream">
    //   28   58:areturn         
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
    //    0    0:new             #261 <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:ldc2            #263 <String "No external inserts">
    //    3    7:invokespecial   #264 <Method void UnsupportedOperationException(String)>
    //    4   10:athrow          
    }

    public boolean onCreate()
    {
    //    0    0:iconst_1        
    //    1    1:ireturn         
    }

    public ParcelFileDescriptor openFile(Uri uri, String s)
        throws FileNotFoundException
    {
    //    0    0:aload_0         
    //    1    1:getfield        #225 <Field FileProvider$PathStrategy mStrategy>
    //    2    4:aload_1         
    //    3    5:invokeinterface #231 <Method File FileProvider$PathStrategy.getFileForUri(Uri)>
    //    4   10:aload_2         
    //    5   11:invokestatic    #271 <Method int modeToMode(String)>
    //    6   14:invokestatic    #277 <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
    //    7   17:areturn         
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #225 <Field FileProvider$PathStrategy mStrategy>
    //    2    4:aload_1         
    //    3    5:invokeinterface #231 <Method File FileProvider$PathStrategy.getFileForUri(Uri)>
    //    4   10:astore          6
    //    5   12:aload_2         
    //    6   13:ifnonnull       20
    //    7   16:getstatic       #45  <Field String[] COLUMNS>
    //    8   19:astore_2        
    //    9   20:aload_2         
    //   10   21:arraylength     
    //   11   22:anewarray       String[]
    //   12   25:astore          7
    //   13   27:aload_2         
    //   14   28:arraylength     
    //   15   29:anewarray       Object[]
    //   16   32:astore          8
    //   17   34:aload_2         
    //   18   35:astore          9
    //   19   37:aload           9
    //   20   39:arraylength     
    //   21   40:istore          10
    //   22   42:iconst_0        
    //   23   43:istore          11
    //   24   45:iconst_0        
    //   25   46:istore          12
    //   26   48:iload           11
    //   27   50:iload           10
    //   28   52:icmpge          144
    //   29   55:aload           9
    //   30   57:iload           11
    //   31   59:aaload          
    //   32   60:astore          16
    //   33   62:ldc1            #41  <String "_display_name">
    //   34   64:aload           16
    //   35   66:invokevirtual   #119 <Method boolean String.equals(Object)>
    //   36   69:ifeq            105
    //   37   72:aload           7
    //   38   74:iload           12
    //   39   76:ldc1            #41  <String "_display_name">
    //   40   78:aastore         
    //   41   79:iload           12
    //   42   81:iconst_1        
    //   43   82:iadd            
    //   44   83:istore          17
    //   45   85:aload           8
    //   46   87:iload           12
    //   47   89:aload           6
    //   48   91:invokevirtual   #237 <Method String File.getName()>
    //   49   94:aastore         
    //   50   95:iinc            11  1
    //   51   98:iload           17
    //   52  100:istore          12
    //   53  102:goto            48
    //   54  105:ldc1            #43  <String "_size">
    //   55  107:aload           16
    //   56  109:invokevirtual   #119 <Method boolean String.equals(Object)>
    //   57  112:ifeq            184
    //   58  115:aload           7
    //   59  117:iload           12
    //   60  119:ldc1            #43  <String "_size">
    //   61  121:aastore         
    //   62  122:iload           12
    //   63  124:iconst_1        
    //   64  125:iadd            
    //   65  126:istore          17
    //   66  128:aload           8
    //   67  130:iload           12
    //   68  132:aload           6
    //   69  134:invokevirtual   #283 <Method long File.length()>
    //   70  137:invokestatic    #289 <Method Long Long.valueOf(long)>
    //   71  140:aastore         
    //   72  141:goto            95
    //   73  144:aload           7
    //   74  146:iload           12
    //   75  148:invokestatic    #291 <Method String[] copyOf(String[], int)>
    //   76  151:astore          13
    //   77  153:aload           8
    //   78  155:iload           12
    //   79  157:invokestatic    #293 <Method Object[] copyOf(Object[], int)>
    //   80  160:astore          14
    //   81  162:new             #295 <Class MatrixCursor>
    //   82  165:dup             
    //   83  166:aload           13
    //   84  168:iconst_1        
    //   85  169:invokespecial   #298 <Method void MatrixCursor(String[], int)>
    //   86  172:astore          15
    //   87  174:aload           15
    //   88  176:aload           14
    //   89  178:invokevirtual   #302 <Method void MatrixCursor.addRow(Object[])>
    //   90  181:aload           15
    //   91  183:areturn         
    //   92  184:iload           12
    //   93  186:istore          17
    //   94  188:goto            95
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
    //    0    0:new             #261 <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:ldc2            #306 <String "No external updates">
    //    3    7:invokespecial   #264 <Method void UnsupportedOperationException(String)>
    //    4   10:athrow          
    }

    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String COLUMNS[];
    private static final File DEVICE_ROOT;
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";
    private static HashMap sCache;
    private PathStrategy mStrategy;
}
