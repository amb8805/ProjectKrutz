// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.util;

import android.util.Log;
import java.io.Writer;

public class LogWriter extends Writer
{

    public LogWriter(String s)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #13  <Method void Writer()>
    //    2    4:aload_0         
    //    3    5:new             #15  <Class StringBuilder>
    //    4    8:dup             
    //    5    9:sipush          128
    //    6   12:invokespecial   #18  <Method void StringBuilder(int)>
    //    7   15:putfield        #20  <Field StringBuilder mBuilder>
    //    8   18:aload_0         
    //    9   19:aload_1         
    //   10   20:putfield        #22  <Field String mTag>
    //   11   23:return          
    }

    private void flushBuilder()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field StringBuilder mBuilder>
    //    2    4:invokevirtual   #27  <Method int StringBuilder.length()>
    //    3    7:ifle            41
    //    4   10:aload_0         
    //    5   11:getfield        #22  <Field String mTag>
    //    6   14:aload_0         
    //    7   15:getfield        #20  <Field StringBuilder mBuilder>
    //    8   18:invokevirtual   #31  <Method String StringBuilder.toString()>
    //    9   21:invokestatic    #37  <Method int Log.d(String, String)>
    //   10   24:pop             
    //   11   25:aload_0         
    //   12   26:getfield        #20  <Field StringBuilder mBuilder>
    //   13   29:iconst_0        
    //   14   30:aload_0         
    //   15   31:getfield        #20  <Field StringBuilder mBuilder>
    //   16   34:invokevirtual   #27  <Method int StringBuilder.length()>
    //   17   37:invokevirtual   #41  <Method StringBuilder StringBuilder.delete(int, int)>
    //   18   40:pop             
    //   19   41:return          
    }

    public void close()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #44  <Method void flushBuilder()>
    //    2    4:return          
    }

    public void flush()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #44  <Method void flushBuilder()>
    //    2    4:return          
    }

    public void write(char ac[], int i, int j)
    {
    //    0    0:iconst_0        
    //    1    1:istore          4
    //    2    3:iload           4
    //    3    5:iload_3         
    //    4    6:icmpge          47
    //    5    9:aload_1         
    //    6   10:iload_2         
    //    7   11:iload           4
    //    8   13:iadd            
    //    9   14:caload          
    //   10   15:istore          5
    //   11   17:iload           5
    //   12   19:bipush          10
    //   13   21:icmpne          34
    //   14   24:aload_0         
    //   15   25:invokespecial   #44  <Method void flushBuilder()>
    //   16   28:iinc            4  1
    //   17   31:goto            3
    //   18   34:aload_0         
    //   19   35:getfield        #20  <Field StringBuilder mBuilder>
    //   20   38:iload           5
    //   21   40:invokevirtual   #51  <Method StringBuilder StringBuilder.append(char)>
    //   22   43:pop             
    //   23   44:goto            28
    //   24   47:return          
    }

    private StringBuilder mBuilder;
    private final String mTag;
}
