// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.util;

import java.util.*;

public class LruCache
{

    public LruCache(int i)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #21  <Method void Object()>
    //    2    4:iload_1         
    //    3    5:ifgt            18
    //    4    8:new             #23  <Class IllegalArgumentException>
    //    5   11:dup             
    //    6   12:ldc1            #25  <String "maxSize <= 0">
    //    7   14:invokespecial   #28  <Method void IllegalArgumentException(String)>
    //    8   17:athrow          
    //    9   18:aload_0         
    //   10   19:iload_1         
    //   11   20:putfield        #30  <Field int maxSize>
    //   12   23:aload_0         
    //   13   24:new             #32  <Class LinkedHashMap>
    //   14   27:dup             
    //   15   28:iconst_0        
    //   16   29:ldc1            #33  <Float 0.75F>
    //   17   31:iconst_1        
    //   18   32:invokespecial   #36  <Method void LinkedHashMap(int, float, boolean)>
    //   19   35:putfield        #38  <Field LinkedHashMap map>
    //   20   38:return          
    }

    private int safeSizeOf(Object obj, Object obj1)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokevirtual   #43  <Method int sizeOf(Object, Object)>
    //    4    6:istore_3        
    //    5    7:iload_3         
    //    6    8:ifge            47
    //    7   11:new             #45  <Class IllegalStateException>
    //    8   14:dup             
    //    9   15:new             #47  <Class StringBuilder>
    //   10   18:dup             
    //   11   19:invokespecial   #48  <Method void StringBuilder()>
    //   12   22:ldc1            #50  <String "Negative size: ">
    //   13   24:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
    //   14   27:aload_1         
    //   15   28:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
    //   16   31:ldc1            #59  <String "=">
    //   17   33:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
    //   18   36:aload_2         
    //   19   37:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
    //   20   40:invokevirtual   #63  <Method String StringBuilder.toString()>
    //   21   43:invokespecial   #64  <Method void IllegalStateException(String)>
    //   22   46:athrow          
    //   23   47:iload_3         
    //   24   48:ireturn         
    }

    protected Object create(Object obj)
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    public final int createCount()
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 7 handler(s) 11
    //    2    2:aload_0         
    //    3    3:getfield        #69  <Field int createCount>
    //    4    6:istore_2        
    //    5    7:aload_0         
    //    6    8:monitorexit     
    //    7    9:iload_2         
    //    8   10:ireturn         
    // finally
    //    9   11:astore_1        
    //   10   12:aload_0         
    //   11   13:monitorexit     
    //   12   14:aload_1         
    //   13   15:athrow          
    }

    protected void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
    {
    //    0    0:return          
    }

    public final void evictAll()
    {
    //    0    0:aload_0         
    //    1    1:iconst_m1       
    //    2    2:invokevirtual   #75  <Method void trimToSize(int)>
    //    3    5:return          
    }

    public final int evictionCount()
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 7 handler(s) 11
    //    2    2:aload_0         
    //    3    3:getfield        #77  <Field int evictionCount>
    //    4    6:istore_2        
    //    5    7:aload_0         
    //    6    8:monitorexit     
    //    7    9:iload_2         
    //    8   10:ireturn         
    // finally
    //    9   11:astore_1        
    //   10   12:aload_0         
    //   11   13:monitorexit     
    //   12   14:aload_1         
    //   13   15:athrow          
    }

    public final Object get(Object obj)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       14
    //    2    4:new             #80  <Class NullPointerException>
    //    3    7:dup             
    //    4    8:ldc1            #82  <String "key == null">
    //    5   10:invokespecial   #83  <Method void NullPointerException(String)>
    //    6   13:athrow          
    //    7   14:aload_0         
    //    8   15:monitorenter    
    // try 16 25 handler(s) 69
    //    9   16:aload_0         
    //   10   17:getfield        #38  <Field LinkedHashMap map>
    //   11   20:aload_1         
    //   12   21:invokevirtual   #85  <Method Object LinkedHashMap.get(Object)>
    //   13   24:astore_3        
    //   14   25:aload_3         
    //   15   26:ifnull          43
    // try 29 41 handler(s) 69
    //   16   29:aload_0         
    //   17   30:iconst_1        
    //   18   31:aload_0         
    //   19   32:getfield        #87  <Field int hitCount>
    //   20   35:iadd            
    //   21   36:putfield        #87  <Field int hitCount>
    //   22   39:aload_0         
    //   23   40:monitorexit     
    //   24   41:aload_3         
    //   25   42:areturn         
    // try 43 55 handler(s) 69
    //   26   43:aload_0         
    //   27   44:iconst_1        
    //   28   45:aload_0         
    //   29   46:getfield        #89  <Field int missCount>
    //   30   49:iadd            
    //   31   50:putfield        #89  <Field int missCount>
    //   32   53:aload_0         
    //   33   54:monitorexit     
    //   34   55:aload_0         
    //   35   56:aload_1         
    //   36   57:invokevirtual   #91  <Method Object create(Object)>
    //   37   60:astore          4
    //   38   62:aload           4
    //   39   64:ifnonnull       74
    //   40   67:aconst_null     
    //   41   68:areturn         
    // finally
    //   42   69:astore_2        
    // try 70 72 handler(s) 69
    //   43   70:aload_0         
    //   44   71:monitorexit     
    //   45   72:aload_2         
    //   46   73:athrow          
    //   47   74:aload_0         
    //   48   75:monitorenter    
    // try 76 98 handler(s) 153
    //   49   76:aload_0         
    //   50   77:iconst_1        
    //   51   78:aload_0         
    //   52   79:getfield        #69  <Field int createCount>
    //   53   82:iadd            
    //   54   83:putfield        #69  <Field int createCount>
    //   55   86:aload_0         
    //   56   87:getfield        #38  <Field LinkedHashMap map>
    //   57   90:aload_1         
    //   58   91:aload           4
    //   59   93:invokevirtual   #95  <Method Object LinkedHashMap.put(Object, Object)>
    //   60   96:astore          6
    //   61   98:aload           6
    //   62  100:ifnull          134
    // try 103 114 handler(s) 153
    //   63  103:aload_0         
    //   64  104:getfield        #38  <Field LinkedHashMap map>
    //   65  107:aload_1         
    //   66  108:aload           6
    //   67  110:invokevirtual   #95  <Method Object LinkedHashMap.put(Object, Object)>
    //   68  113:pop             
    // try 114 116 handler(s) 153
    //   69  114:aload_0         
    //   70  115:monitorexit     
    //   71  116:aload           6
    //   72  118:ifnull          160
    //   73  121:aload_0         
    //   74  122:iconst_0        
    //   75  123:aload_1         
    //   76  124:aload           4
    //   77  126:aload           6
    //   78  128:invokevirtual   #97  <Method void entryRemoved(boolean, Object, Object, Object)>
    //   79  131:aload           6
    //   80  133:areturn         
    // try 134 150 handler(s) 153
    //   81  134:aload_0         
    //   82  135:aload_0         
    //   83  136:getfield        #99  <Field int size>
    //   84  139:aload_0         
    //   85  140:aload_1         
    //   86  141:aload           4
    //   87  143:invokespecial   #101 <Method int safeSizeOf(Object, Object)>
    //   88  146:iadd            
    //   89  147:putfield        #99  <Field int size>
    //   90  150:goto            114
    // finally
    //   91  153:astore          5
    // try 155 157 handler(s) 153
    //   92  155:aload_0         
    //   93  156:monitorexit     
    //   94  157:aload           5
    //   95  159:athrow          
    //   96  160:aload_0         
    //   97  161:aload_0         
    //   98  162:getfield        #30  <Field int maxSize>
    //   99  165:invokevirtual   #75  <Method void trimToSize(int)>
    //  100  168:aload           4
    //  101  170:areturn         
    }

    public final int hitCount()
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 7 handler(s) 11
    //    2    2:aload_0         
    //    3    3:getfield        #87  <Field int hitCount>
    //    4    6:istore_2        
    //    5    7:aload_0         
    //    6    8:monitorexit     
    //    7    9:iload_2         
    //    8   10:ireturn         
    // finally
    //    9   11:astore_1        
    //   10   12:aload_0         
    //   11   13:monitorexit     
    //   12   14:aload_1         
    //   13   15:athrow          
    }

    public final int maxSize()
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 7 handler(s) 11
    //    2    2:aload_0         
    //    3    3:getfield        #30  <Field int maxSize>
    //    4    6:istore_2        
    //    5    7:aload_0         
    //    6    8:monitorexit     
    //    7    9:iload_2         
    //    8   10:ireturn         
    // finally
    //    9   11:astore_1        
    //   10   12:aload_0         
    //   11   13:monitorexit     
    //   12   14:aload_1         
    //   13   15:athrow          
    }

    public final int missCount()
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 7 handler(s) 11
    //    2    2:aload_0         
    //    3    3:getfield        #89  <Field int missCount>
    //    4    6:istore_2        
    //    5    7:aload_0         
    //    6    8:monitorexit     
    //    7    9:iload_2         
    //    8   10:ireturn         
    // finally
    //    9   11:astore_1        
    //   10   12:aload_0         
    //   11   13:monitorexit     
    //   12   14:aload_1         
    //   13   15:athrow          
    }

    public final Object put(Object obj, Object obj1)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          8
    //    2    4:aload_2         
    //    3    5:ifnonnull       18
    //    4    8:new             #80  <Class NullPointerException>
    //    5   11:dup             
    //    6   12:ldc1            #103 <String "key == null || value == null">
    //    7   14:invokespecial   #83  <Method void NullPointerException(String)>
    //    8   17:athrow          
    //    9   18:aload_0         
    //   10   19:monitorenter    
    // try 20 56 handler(s) 104
    //   11   20:aload_0         
    //   12   21:iconst_1        
    //   13   22:aload_0         
    //   14   23:getfield        #105 <Field int putCount>
    //   15   26:iadd            
    //   16   27:putfield        #105 <Field int putCount>
    //   17   30:aload_0         
    //   18   31:aload_0         
    //   19   32:getfield        #99  <Field int size>
    //   20   35:aload_0         
    //   21   36:aload_1         
    //   22   37:aload_2         
    //   23   38:invokespecial   #101 <Method int safeSizeOf(Object, Object)>
    //   24   41:iadd            
    //   25   42:putfield        #99  <Field int size>
    //   26   45:aload_0         
    //   27   46:getfield        #38  <Field LinkedHashMap map>
    //   28   49:aload_1         
    //   29   50:aload_2         
    //   30   51:invokevirtual   #95  <Method Object LinkedHashMap.put(Object, Object)>
    //   31   54:astore          4
    //   32   56:aload           4
    //   33   58:ifnull          77
    // try 61 77 handler(s) 104
    //   34   61:aload_0         
    //   35   62:aload_0         
    //   36   63:getfield        #99  <Field int size>
    //   37   66:aload_0         
    //   38   67:aload_1         
    //   39   68:aload           4
    //   40   70:invokespecial   #101 <Method int safeSizeOf(Object, Object)>
    //   41   73:isub            
    //   42   74:putfield        #99  <Field int size>
    // try 77 79 handler(s) 104
    //   43   77:aload_0         
    //   44   78:monitorexit     
    //   45   79:aload           4
    //   46   81:ifnull          93
    //   47   84:aload_0         
    //   48   85:iconst_0        
    //   49   86:aload_1         
    //   50   87:aload           4
    //   51   89:aload_2         
    //   52   90:invokevirtual   #97  <Method void entryRemoved(boolean, Object, Object, Object)>
    //   53   93:aload_0         
    //   54   94:aload_0         
    //   55   95:getfield        #30  <Field int maxSize>
    //   56   98:invokevirtual   #75  <Method void trimToSize(int)>
    //   57  101:aload           4
    //   58  103:areturn         
    // finally
    //   59  104:astore_3        
    // try 105 107 handler(s) 104
    //   60  105:aload_0         
    //   61  106:monitorexit     
    //   62  107:aload_3         
    //   63  108:athrow          
    }

    public final int putCount()
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 7 handler(s) 11
    //    2    2:aload_0         
    //    3    3:getfield        #105 <Field int putCount>
    //    4    6:istore_2        
    //    5    7:aload_0         
    //    6    8:monitorexit     
    //    7    9:iload_2         
    //    8   10:ireturn         
    // finally
    //    9   11:astore_1        
    //   10   12:aload_0         
    //   11   13:monitorexit     
    //   12   14:aload_1         
    //   13   15:athrow          
    }

    public final Object remove(Object obj)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       14
    //    2    4:new             #80  <Class NullPointerException>
    //    3    7:dup             
    //    4    8:ldc1            #82  <String "key == null">
    //    5   10:invokespecial   #83  <Method void NullPointerException(String)>
    //    6   13:athrow          
    //    7   14:aload_0         
    //    8   15:monitorenter    
    // try 16 25 handler(s) 60
    //    9   16:aload_0         
    //   10   17:getfield        #38  <Field LinkedHashMap map>
    //   11   20:aload_1         
    //   12   21:invokevirtual   #108 <Method Object LinkedHashMap.remove(Object)>
    //   13   24:astore_3        
    //   14   25:aload_3         
    //   15   26:ifnull          44
    // try 29 44 handler(s) 60
    //   16   29:aload_0         
    //   17   30:aload_0         
    //   18   31:getfield        #99  <Field int size>
    //   19   34:aload_0         
    //   20   35:aload_1         
    //   21   36:aload_3         
    //   22   37:invokespecial   #101 <Method int safeSizeOf(Object, Object)>
    //   23   40:isub            
    //   24   41:putfield        #99  <Field int size>
    // try 44 46 handler(s) 60
    //   25   44:aload_0         
    //   26   45:monitorexit     
    //   27   46:aload_3         
    //   28   47:ifnull          58
    //   29   50:aload_0         
    //   30   51:iconst_0        
    //   31   52:aload_1         
    //   32   53:aload_3         
    //   33   54:aconst_null     
    //   34   55:invokevirtual   #97  <Method void entryRemoved(boolean, Object, Object, Object)>
    //   35   58:aload_3         
    //   36   59:areturn         
    // finally
    //   37   60:astore_2        
    // try 61 63 handler(s) 60
    //   38   61:aload_0         
    //   39   62:monitorexit     
    //   40   63:aload_2         
    //   41   64:athrow          
    }

    public final int size()
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 7 handler(s) 11
    //    2    2:aload_0         
    //    3    3:getfield        #99  <Field int size>
    //    4    6:istore_2        
    //    5    7:aload_0         
    //    6    8:monitorexit     
    //    7    9:iload_2         
    //    8   10:ireturn         
    // finally
    //    9   11:astore_1        
    //   10   12:aload_0         
    //   11   13:monitorexit     
    //   12   14:aload_1         
    //   13   15:athrow          
    }

    protected int sizeOf(Object obj, Object obj1)
    {
    //    0    0:iconst_1        
    //    1    1:ireturn         
    }

    public final Map snapshot()
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 14 handler(s) 18
    //    2    2:new             #32  <Class LinkedHashMap>
    //    3    5:dup             
    //    4    6:aload_0         
    //    5    7:getfield        #38  <Field LinkedHashMap map>
    //    6   10:invokespecial   #113 <Method void LinkedHashMap(Map)>
    //    7   13:astore_1        
    //    8   14:aload_0         
    //    9   15:monitorexit     
    //   10   16:aload_1         
    //   11   17:areturn         
    // finally
    //   12   18:astore_2        
    //   13   19:aload_0         
    //   14   20:monitorexit     
    //   15   21:aload_2         
    //   16   22:athrow          
    }

    public final String toString()
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 12 handler(s) 89
    //    2    2:aload_0         
    //    3    3:getfield        #87  <Field int hitCount>
    //    4    6:aload_0         
    //    5    7:getfield        #89  <Field int missCount>
    //    6   10:iadd            
    //    7   11:istore_2        
    //    8   12:iconst_0        
    //    9   13:istore_3        
    //   10   14:iload_2         
    //   11   15:ifeq            28
    // try 18 28 handler(s) 89
    //   12   18:bipush          100
    //   13   20:aload_0         
    //   14   21:getfield        #87  <Field int hitCount>
    //   15   24:imul            
    //   16   25:iload_2         
    //   17   26:idiv            
    //   18   27:istore_3        
    // try 28 84 handler(s) 89
    //   19   28:iconst_4        
    //   20   29:anewarray       Object[]
    //   21   32:astore          4
    //   22   34:aload           4
    //   23   36:iconst_0        
    //   24   37:aload_0         
    //   25   38:getfield        #30  <Field int maxSize>
    //   26   41:invokestatic    #119 <Method Integer Integer.valueOf(int)>
    //   27   44:aastore         
    //   28   45:aload           4
    //   29   47:iconst_1        
    //   30   48:aload_0         
    //   31   49:getfield        #87  <Field int hitCount>
    //   32   52:invokestatic    #119 <Method Integer Integer.valueOf(int)>
    //   33   55:aastore         
    //   34   56:aload           4
    //   35   58:iconst_2        
    //   36   59:aload_0         
    //   37   60:getfield        #89  <Field int missCount>
    //   38   63:invokestatic    #119 <Method Integer Integer.valueOf(int)>
    //   39   66:aastore         
    //   40   67:aload           4
    //   41   69:iconst_3        
    //   42   70:iload_3         
    //   43   71:invokestatic    #119 <Method Integer Integer.valueOf(int)>
    //   44   74:aastore         
    //   45   75:ldc1            #121 <String "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]">
    //   46   77:aload           4
    //   47   79:invokestatic    #127 <Method String String.format(String, Object[])>
    //   48   82:astore          5
    //   49   84:aload_0         
    //   50   85:monitorexit     
    //   51   86:aload           5
    //   52   88:areturn         
    // finally
    //   53   89:astore_1        
    //   54   90:aload_0         
    //   55   91:monitorexit     
    //   56   92:aload_1         
    //   57   93:athrow          
    }

    public void trimToSize(int i)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 26 handler(s) 59
    //    2    2:aload_0         
    //    3    3:getfield        #99  <Field int size>
    //    4    6:iflt            26
    //    5    9:aload_0         
    //    6   10:getfield        #38  <Field LinkedHashMap map>
    //    7   13:invokevirtual   #131 <Method boolean LinkedHashMap.isEmpty()>
    //    8   16:ifeq            64
    //    9   19:aload_0         
    //   10   20:getfield        #99  <Field int size>
    //   11   23:ifeq            64
    // try 26 59 handler(s) 59
    //   12   26:new             #45  <Class IllegalStateException>
    //   13   29:dup             
    //   14   30:new             #47  <Class StringBuilder>
    //   15   33:dup             
    //   16   34:invokespecial   #48  <Method void StringBuilder()>
    //   17   37:aload_0         
    //   18   38:invokevirtual   #135 <Method Class Object.getClass()>
    //   19   41:invokevirtual   #140 <Method String Class.getName()>
    //   20   44:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
    //   21   47:ldc1            #142 <String ".sizeOf() is reporting inconsistent results!">
    //   22   49:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
    //   23   52:invokevirtual   #63  <Method String StringBuilder.toString()>
    //   24   55:invokespecial   #64  <Method void IllegalStateException(String)>
    //   25   58:athrow          
    // finally
    //   26   59:astore_2        
    // try 60 62 handler(s) 59
    //   27   60:aload_0         
    //   28   61:monitorexit     
    //   29   62:aload_2         
    //   30   63:athrow          
    // try 64 82 handler(s) 59
    //   31   64:aload_0         
    //   32   65:getfield        #99  <Field int size>
    //   33   68:iload_1         
    //   34   69:icmple          82
    //   35   72:aload_0         
    //   36   73:getfield        #38  <Field LinkedHashMap map>
    //   37   76:invokevirtual   #131 <Method boolean LinkedHashMap.isEmpty()>
    //   38   79:ifeq            85
    // try 82 84 handler(s) 59
    //   39   82:aload_0         
    //   40   83:monitorexit     
    //   41   84:return          
    // try 85 161 handler(s) 59
    //   42   85:aload_0         
    //   43   86:getfield        #38  <Field LinkedHashMap map>
    //   44   89:invokevirtual   #146 <Method Set LinkedHashMap.entrySet()>
    //   45   92:invokeinterface #152 <Method Iterator Set.iterator()>
    //   46   97:invokeinterface #158 <Method Object Iterator.next()>
    //   47  102:checkcast       #160 <Class java.util.Map$Entry>
    //   48  105:astore_3        
    //   49  106:aload_3         
    //   50  107:invokeinterface #163 <Method Object java.util.Map$Entry.getKey()>
    //   51  112:astore          4
    //   52  114:aload_3         
    //   53  115:invokeinterface #166 <Method Object java.util.Map$Entry.getValue()>
    //   54  120:astore          5
    //   55  122:aload_0         
    //   56  123:getfield        #38  <Field LinkedHashMap map>
    //   57  126:aload           4
    //   58  128:invokevirtual   #108 <Method Object LinkedHashMap.remove(Object)>
    //   59  131:pop             
    //   60  132:aload_0         
    //   61  133:aload_0         
    //   62  134:getfield        #99  <Field int size>
    //   63  137:aload_0         
    //   64  138:aload           4
    //   65  140:aload           5
    //   66  142:invokespecial   #101 <Method int safeSizeOf(Object, Object)>
    //   67  145:isub            
    //   68  146:putfield        #99  <Field int size>
    //   69  149:aload_0         
    //   70  150:iconst_1        
    //   71  151:aload_0         
    //   72  152:getfield        #77  <Field int evictionCount>
    //   73  155:iadd            
    //   74  156:putfield        #77  <Field int evictionCount>
    //   75  159:aload_0         
    //   76  160:monitorexit     
    //   77  161:aload_0         
    //   78  162:iconst_1        
    //   79  163:aload           4
    //   80  165:aload           5
    //   81  167:aconst_null     
    //   82  168:invokevirtual   #97  <Method void entryRemoved(boolean, Object, Object, Object)>
    //   83  171:goto            0
    }

    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;
}
