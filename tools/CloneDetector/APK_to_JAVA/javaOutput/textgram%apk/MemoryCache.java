// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.lazylist;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.*;

public class MemoryCache
{

    public MemoryCache()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #18  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:new             #20  <Class LinkedHashMap>
    //    4    8:dup             
    //    5    9:bipush          10
    //    6   11:ldc1            #21  <Float 1.5F>
    //    7   13:iconst_1        
    //    8   14:invokespecial   #24  <Method void LinkedHashMap(int, float, boolean)>
    //    9   17:invokestatic    #30  <Method Map Collections.synchronizedMap(Map)>
    //   10   20:putfield        #32  <Field Map cache>
    //   11   23:aload_0         
    //   12   24:lconst_0        
    //   13   25:putfield        #34  <Field long size>
    //   14   28:aload_0         
    //   15   29:ldc2w           #35  <Long 0xf4240L>
    //   16   32:putfield        #38  <Field long limit>
    //   17   35:aload_0         
    //   18   36:invokestatic    #44  <Method Runtime Runtime.getRuntime()>
    //   19   39:invokevirtual   #48  <Method long Runtime.maxMemory()>
    //   20   42:ldc2w           #49  <Long 4L>
    //   21   45:ldiv            
    //   22   46:invokevirtual   #54  <Method void setLimit(long)>
    //   23   49:return          
    }

    private void checkSize()
    {
    //    0    0:ldc1            #8   <String "MemoryCache">
    //    1    2:new             #57  <Class StringBuilder>
    //    2    5:dup             
    //    3    6:ldc1            #59  <String "cache size=">
    //    4    8:invokespecial   #62  <Method void StringBuilder(String)>
    //    5   11:aload_0         
    //    6   12:getfield        #34  <Field long size>
    //    7   15:invokevirtual   #66  <Method StringBuilder StringBuilder.append(long)>
    //    8   18:ldc1            #68  <String " length=">
    //    9   20:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
    //   10   23:aload_0         
    //   11   24:getfield        #32  <Field Map cache>
    //   12   27:invokeinterface #76  <Method int Map.size()>
    //   13   32:invokevirtual   #79  <Method StringBuilder StringBuilder.append(int)>
    //   14   35:invokevirtual   #83  <Method String StringBuilder.toString()>
    //   15   38:invokestatic    #89  <Method int Log.i(String, String)>
    //   16   41:pop             
    //   17   42:aload_0         
    //   18   43:getfield        #34  <Field long size>
    //   19   46:aload_0         
    //   20   47:getfield        #38  <Field long limit>
    //   21   50:lcmp            
    //   22   51:ifle            108
    //   23   54:aload_0         
    //   24   55:getfield        #32  <Field Map cache>
    //   25   58:invokeinterface #93  <Method Set Map.entrySet()>
    //   26   63:invokeinterface #99  <Method Iterator Set.iterator()>
    //   27   68:astore_2        
    //   28   69:aload_2         
    //   29   70:invokeinterface #105 <Method boolean Iterator.hasNext()>
    //   30   75:ifne            109
    //   31   78:ldc1            #8   <String "MemoryCache">
    //   32   80:new             #57  <Class StringBuilder>
    //   33   83:dup             
    //   34   84:ldc1            #107 <String "Clean cache. New size ">
    //   35   86:invokespecial   #62  <Method void StringBuilder(String)>
    //   36   89:aload_0         
    //   37   90:getfield        #32  <Field Map cache>
    //   38   93:invokeinterface #76  <Method int Map.size()>
    //   39   98:invokevirtual   #79  <Method StringBuilder StringBuilder.append(int)>
    //   40  101:invokevirtual   #83  <Method String StringBuilder.toString()>
    //   41  104:invokestatic    #89  <Method int Log.i(String, String)>
    //   42  107:pop             
    //   43  108:return          
    //   44  109:aload_2         
    //   45  110:invokeinterface #111 <Method Object Iterator.next()>
    //   46  115:checkcast       #113 <Class java.util.Map$Entry>
    //   47  118:astore_3        
    //   48  119:aload_0         
    //   49  120:aload_0         
    //   50  121:getfield        #34  <Field long size>
    //   51  124:aload_0         
    //   52  125:aload_3         
    //   53  126:invokeinterface #116 <Method Object java.util.Map$Entry.getValue()>
    //   54  131:checkcast       #118 <Class Bitmap>
    //   55  134:invokevirtual   #122 <Method long getSizeInBytes(Bitmap)>
    //   56  137:lsub            
    //   57  138:putfield        #34  <Field long size>
    //   58  141:aload_2         
    //   59  142:invokeinterface #125 <Method void Iterator.remove()>
    //   60  147:aload_0         
    //   61  148:getfield        #34  <Field long size>
    //   62  151:aload_0         
    //   63  152:getfield        #38  <Field long limit>
    //   64  155:lcmp            
    //   65  156:ifgt            69
    //   66  159:goto            78
    }

    public void clear()
    {
    // try 0 14 handler(s) 15
    //    0    0:aload_0         
    //    1    1:getfield        #32  <Field Map cache>
    //    2    4:invokeinterface #130 <Method void Map.clear()>
    //    3    9:aload_0         
    //    4   10:lconst_0        
    //    5   11:putfield        #34  <Field long size>
    //    6   14:return          
    // catch NullPointerException
    //    7   15:astore_1        
    //    8   16:aload_1         
    //    9   17:invokevirtual   #133 <Method void NullPointerException.printStackTrace()>
    //   10   20:return          
    }

    public Bitmap get(String s)
    {
    // try 0 13 handler(s) 31
    //    0    0:aload_0         
    //    1    1:getfield        #32  <Field Map cache>
    //    2    4:aload_1         
    //    3    5:invokeinterface #139 <Method boolean Map.containsKey(Object)>
    //    4   10:ifne            15
    //    5   13:aconst_null     
    //    6   14:areturn         
    // try 15 29 handler(s) 31
    //    7   15:aload_0         
    //    8   16:getfield        #32  <Field Map cache>
    //    9   19:aload_1         
    //   10   20:invokeinterface #142 <Method Object Map.get(Object)>
    //   11   25:checkcast       #118 <Class Bitmap>
    //   12   28:astore_3        
    //   13   29:aload_3         
    //   14   30:areturn         
    // catch NullPointerException NullPointerException
    //   15   31:astore_2        
    //   16   32:aload_2         
    //   17   33:invokevirtual   #133 <Method void NullPointerException.printStackTrace()>
    //   18   36:aconst_null     
    //   19   37:areturn         
    }

    long getSizeInBytes(Bitmap bitmap)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       6
    //    2    4:lconst_0        
    //    3    5:lreturn         
    //    4    6:aload_1         
    //    5    7:invokevirtual   #145 <Method int Bitmap.getRowBytes()>
    //    6   10:aload_1         
    //    7   11:invokevirtual   #148 <Method int Bitmap.getHeight()>
    //    8   14:imul            
    //    9   15:i2l             
    //   10   16:lreturn         
    }

    public void put(String s, Bitmap bitmap)
    {
    // try 0 39 handler(s) 70
    //    0    0:aload_0         
    //    1    1:getfield        #32  <Field Map cache>
    //    2    4:aload_1         
    //    3    5:invokeinterface #139 <Method boolean Map.containsKey(Object)>
    //    4   10:ifeq            39
    //    5   13:aload_0         
    //    6   14:aload_0         
    //    7   15:getfield        #34  <Field long size>
    //    8   18:aload_0         
    //    9   19:aload_0         
    //   10   20:getfield        #32  <Field Map cache>
    //   11   23:aload_1         
    //   12   24:invokeinterface #142 <Method Object Map.get(Object)>
    //   13   29:checkcast       #118 <Class Bitmap>
    //   14   32:invokevirtual   #122 <Method long getSizeInBytes(Bitmap)>
    //   15   35:lsub            
    //   16   36:putfield        #34  <Field long size>
    // try 39 69 handler(s) 70
    //   17   39:aload_0         
    //   18   40:getfield        #32  <Field Map cache>
    //   19   43:aload_1         
    //   20   44:aload_2         
    //   21   45:invokeinterface #155 <Method Object Map.put(Object, Object)>
    //   22   50:pop             
    //   23   51:aload_0         
    //   24   52:aload_0         
    //   25   53:getfield        #34  <Field long size>
    //   26   56:aload_0         
    //   27   57:aload_2         
    //   28   58:invokevirtual   #122 <Method long getSizeInBytes(Bitmap)>
    //   29   61:ladd            
    //   30   62:putfield        #34  <Field long size>
    //   31   65:aload_0         
    //   32   66:invokespecial   #157 <Method void checkSize()>
    //   33   69:return          
    // catch Throwable Throwable
    //   34   70:astore_3        
    //   35   71:aload_3         
    //   36   72:invokevirtual   #158 <Method void Throwable.printStackTrace()>
    //   37   75:return          
    }

    public void setLimit(long l)
    {
    //    0    0:aload_0         
    //    1    1:lload_1         
    //    2    2:putfield        #38  <Field long limit>
    //    3    5:ldc1            #8   <String "MemoryCache">
    //    4    7:new             #57  <Class StringBuilder>
    //    5   10:dup             
    //    6   11:ldc1            #160 <String "MemoryCache will use up to ">
    //    7   13:invokespecial   #62  <Method void StringBuilder(String)>
    //    8   16:aload_0         
    //    9   17:getfield        #38  <Field long limit>
    //   10   20:l2d             
    //   11   21:ldc2w           #161 <Double 1024D>
    //   12   24:ddiv            
    //   13   25:ldc2w           #161 <Double 1024D>
    //   14   28:ddiv            
    //   15   29:invokevirtual   #165 <Method StringBuilder StringBuilder.append(double)>
    //   16   32:ldc1            #167 <String "MB">
    //   17   34:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
    //   18   37:invokevirtual   #83  <Method String StringBuilder.toString()>
    //   19   40:invokestatic    #89  <Method int Log.i(String, String)>
    //   20   43:pop             
    //   21   44:return          
    }

    private static final String TAG = "MemoryCache";
    private Map cache;
    private long limit;
    private long size;
}
