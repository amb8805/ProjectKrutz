// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.util;


public class DebugUtils
{

    public DebugUtils()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static void buildShortClassTag(Object obj, StringBuilder stringbuilder)
    {
    //    0    0:aload_0         
    //    1    1:ifnonnull       12
    //    2    4:aload_1         
    //    3    5:ldc1            #12  <String "null">
    //    4    7:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
    //    5   10:pop             
    //    6   11:return          
    //    7   12:aload_0         
    //    8   13:invokevirtual   #22  <Method Class Object.getClass()>
    //    9   16:invokevirtual   #28  <Method String Class.getSimpleName()>
    //   10   19:astore_2        
    //   11   20:aload_2         
    //   12   21:ifnull          31
    //   13   24:aload_2         
    //   14   25:invokevirtual   #34  <Method int String.length()>
    //   15   28:ifgt            58
    //   16   31:aload_0         
    //   17   32:invokevirtual   #22  <Method Class Object.getClass()>
    //   18   35:invokevirtual   #37  <Method String Class.getName()>
    //   19   38:astore_2        
    //   20   39:aload_2         
    //   21   40:bipush          46
    //   22   42:invokevirtual   #41  <Method int String.lastIndexOf(int)>
    //   23   45:istore_3        
    //   24   46:iload_3         
    //   25   47:ifle            58
    //   26   50:aload_2         
    //   27   51:iload_3         
    //   28   52:iconst_1        
    //   29   53:iadd            
    //   30   54:invokevirtual   #45  <Method String String.substring(int)>
    //   31   57:astore_2        
    //   32   58:aload_1         
    //   33   59:aload_2         
    //   34   60:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
    //   35   63:pop             
    //   36   64:aload_1         
    //   37   65:bipush          123
    //   38   67:invokevirtual   #48  <Method StringBuilder StringBuilder.append(char)>
    //   39   70:pop             
    //   40   71:aload_1         
    //   41   72:aload_0         
    //   42   73:invokestatic    #54  <Method int System.identityHashCode(Object)>
    //   43   76:invokestatic    #59  <Method String Integer.toHexString(int)>
    //   44   79:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
    //   45   82:pop             
    //   46   83:return          
    }
}
