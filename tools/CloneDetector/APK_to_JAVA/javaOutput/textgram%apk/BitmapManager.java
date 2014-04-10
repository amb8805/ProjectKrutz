// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package eu.janmuller.android.simplecropimage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.FileDescriptor;
import java.util.*;

public class BitmapManager
{
    private static final class State extends Enum
    {

        static 
        {
        //    0    0:new             #2   <Class BitmapManager$State>
        //    1    3:dup             
        //    2    4:ldc1            #13  <String "CANCEL">
        //    3    6:iconst_0        
        //    4    7:invokespecial   #17  <Method void BitmapManager$State(String, int)>
        //    5   10:putstatic       #19  <Field BitmapManager$State CANCEL>
        //    6   13:new             #2   <Class BitmapManager$State>
        //    7   16:dup             
        //    8   17:ldc1            #20  <String "ALLOW">
        //    9   19:iconst_1        
        //   10   20:invokespecial   #17  <Method void BitmapManager$State(String, int)>
        //   11   23:putstatic       #22  <Field BitmapManager$State ALLOW>
        //   12   26:iconst_2        
        //   13   27:anewarray       State[]
        //   14   30:astore_0        
        //   15   31:aload_0         
        //   16   32:iconst_0        
        //   17   33:getstatic       #19  <Field BitmapManager$State CANCEL>
        //   18   36:aastore         
        //   19   37:aload_0         
        //   20   38:iconst_1        
        //   21   39:getstatic       #22  <Field BitmapManager$State ALLOW>
        //   22   42:aastore         
        //   23   43:aload_0         
        //   24   44:putstatic       #24  <Field BitmapManager$State[] ENUM$VALUES>
        //   25   47:return          
        }

        private State(String s, int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #25  <Method void Enum(String, int)>
        //    4    6:return          
        }

        public static State valueOf(String s)
        {
        //    0    0:ldc1            #2   <Class BitmapManager$State>
        //    1    2:aload_0         
        //    2    3:invokestatic    #30  <Method Enum Enum.valueOf(Class, String)>
        //    3    6:checkcast       #2   <Class BitmapManager$State>
        //    4    9:areturn         
        }

        public static State[] values()
        {
        //    0    0:getstatic       #24  <Field BitmapManager$State[] ENUM$VALUES>
        //    1    3:astore_0        
        //    2    4:aload_0         
        //    3    5:arraylength     
        //    4    6:istore_1        
        //    5    7:iload_1         
        //    6    8:anewarray       State[]
        //    7   11:astore_2        
        //    8   12:aload_0         
        //    9   13:iconst_0        
        //   10   14:aload_2         
        //   11   15:iconst_0        
        //   12   16:iload_1         
        //   13   17:invokestatic    #38  <Method void System.arraycopy(Object, int, Object, int, int)>
        //   14   20:aload_2         
        //   15   21:areturn         
        }

        public static final State ALLOW;
        public static final State CANCEL;
        private static final State ENUM$VALUES[];
    }

    public static class ThreadSet
        implements Iterable
    {

        public ThreadSet()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #14  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:new             #16  <Class WeakHashMap>
        //    4    8:dup             
        //    5    9:invokespecial   #17  <Method void WeakHashMap()>
        //    6   12:putfield        #19  <Field WeakHashMap mWeakCollection>
        //    7   15:return          
        }

        public void add(Thread thread)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field WeakHashMap mWeakCollection>
        //    2    4:aload_1         
        //    3    5:aconst_null     
        //    4    6:invokevirtual   #25  <Method Object WeakHashMap.put(Object, Object)>
        //    5    9:pop             
        //    6   10:return          
        }

        public Iterator iterator()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field WeakHashMap mWeakCollection>
        //    2    4:invokevirtual   #31  <Method Set WeakHashMap.keySet()>
        //    3    7:invokeinterface #35  <Method Iterator Set.iterator()>
        //    4   12:areturn         
        }

        public void remove(Thread thread)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field WeakHashMap mWeakCollection>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #39  <Method Object WeakHashMap.remove(Object)>
        //    4    8:pop             
        //    5    9:return          
        }

        private final WeakHashMap mWeakCollection;
    }

    private static class ThreadStatus
    {

        private ThreadStatus()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #12  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:getstatic       #17  <Field BitmapManager$State BitmapManager$State.ALLOW>
        //    4    8:putfield        #19  <Field BitmapManager$State mState>
        //    5   11:return          
        }

        ThreadStatus(ThreadStatus threadstatus)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #21  <Method void BitmapManager$ThreadStatus()>
        //    2    4:return          
        }

        public String toString()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field BitmapManager$State mState>
        //    2    4:getstatic       #26  <Field BitmapManager$State BitmapManager$State.CANCEL>
        //    3    7:if_acmpne       42
        //    4   10:ldc1            #28  <String "Cancel">
        //    5   12:astore_1        
        //    6   13:new             #30  <Class StringBuilder>
        //    7   16:dup             
        //    8   17:ldc1            #32  <String "thread state = ">
        //    9   19:invokespecial   #35  <Method void StringBuilder(String)>
        //   10   22:aload_1         
        //   11   23:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
        //   12   26:ldc1            #41  <String ", options = ">
        //   13   28:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
        //   14   31:aload_0         
        //   15   32:getfield        #43  <Field android.graphics.BitmapFactory$Options mOptions>
        //   16   35:invokevirtual   #46  <Method StringBuilder StringBuilder.append(Object)>
        //   17   38:invokevirtual   #48  <Method String StringBuilder.toString()>
        //   18   41:areturn         
        //   19   42:aload_0         
        //   20   43:getfield        #19  <Field BitmapManager$State mState>
        //   21   46:getstatic       #17  <Field BitmapManager$State BitmapManager$State.ALLOW>
        //   22   49:if_acmpne       58
        //   23   52:ldc1            #50  <String "Allow">
        //   24   54:astore_1        
        //   25   55:goto            13
        //   26   58:ldc1            #52  <String "?">
        //   27   60:astore_1        
        //   28   61:goto            13
        }

        public android.graphics.BitmapFactory.Options mOptions;
        public State mState;
    }


    static 
    {
    //    0    0:aconst_null     
    //    1    1:putstatic       #17  <Field BitmapManager sManager>
    //    2    4:return          
    }

    private BitmapManager()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #20  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:new             #22  <Class WeakHashMap>
    //    4    8:dup             
    //    5    9:invokespecial   #23  <Method void WeakHashMap()>
    //    6   12:putfield        #25  <Field WeakHashMap mThreadStatus>
    //    7   15:return          
    }

    private ThreadStatus getOrCreateThreadStatus(Thread thread)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 14 handler(s) 41
    //    2    2:aload_0         
    //    3    3:getfield        #25  <Field WeakHashMap mThreadStatus>
    //    4    6:aload_1         
    //    5    7:invokevirtual   #31  <Method Object WeakHashMap.get(Object)>
    //    6   10:checkcast       #33  <Class BitmapManager$ThreadStatus>
    //    7   13:astore_3        
    //    8   14:aload_3         
    //    9   15:ifnonnull       37
    // try 18 37 handler(s) 41
    //   10   18:new             #33  <Class BitmapManager$ThreadStatus>
    //   11   21:dup             
    //   12   22:aconst_null     
    //   13   23:invokespecial   #36  <Method void BitmapManager$ThreadStatus(BitmapManager$ThreadStatus)>
    //   14   26:astore_3        
    //   15   27:aload_0         
    //   16   28:getfield        #25  <Field WeakHashMap mThreadStatus>
    //   17   31:aload_1         
    //   18   32:aload_3         
    //   19   33:invokevirtual   #40  <Method Object WeakHashMap.put(Object, Object)>
    //   20   36:pop             
    //   21   37:aload_0         
    //   22   38:monitorexit     
    //   23   39:aload_3         
    //   24   40:areturn         
    // finally
    //   25   41:astore_2        
    //   26   42:aload_0         
    //   27   43:monitorexit     
    //   28   44:aload_2         
    //   29   45:athrow          
    }

    public static BitmapManager instance()
    {
    //    0    0:ldc1            #2   <Class BitmapManager>
    //    1    2:monitorenter    
    // try 3 19 handler(s) 28
    //    2    3:getstatic       #17  <Field BitmapManager sManager>
    //    3    6:ifnonnull       19
    //    4    9:new             #2   <Class BitmapManager>
    //    5   12:dup             
    //    6   13:invokespecial   #43  <Method void BitmapManager()>
    //    7   16:putstatic       #17  <Field BitmapManager sManager>
    // try 19 23 handler(s) 28
    //    8   19:getstatic       #17  <Field BitmapManager sManager>
    //    9   22:astore_1        
    //   10   23:ldc1            #2   <Class BitmapManager>
    //   11   25:monitorexit     
    //   12   26:aload_1         
    //   13   27:areturn         
    // finally
    //   14   28:astore_0        
    //   15   29:ldc1            #2   <Class BitmapManager>
    //   16   31:monitorexit     
    //   17   32:aload_0         
    //   18   33:athrow          
    }

    private void setDecodingOptions(Thread thread, android.graphics.BitmapFactory.Options options)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 11 handler(s) 14
    //    2    2:aload_0         
    //    3    3:aload_1         
    //    4    4:invokespecial   #47  <Method BitmapManager$ThreadStatus getOrCreateThreadStatus(Thread)>
    //    5    7:aload_2         
    //    6    8:putfield        #51  <Field android.graphics.BitmapFactory$Options BitmapManager$ThreadStatus.mOptions>
    //    7   11:aload_0         
    //    8   12:monitorexit     
    //    9   13:return          
    // finally
    //   10   14:astore_3        
    //   11   15:aload_0         
    //   12   16:monitorexit     
    //   13   17:aload_3         
    //   14   18:athrow          
    }

    public void allowThreadDecoding(ThreadSet threadset)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 7 handler(s) 39
    //    2    2:aload_1         
    //    3    3:invokevirtual   #59  <Method Iterator BitmapManager$ThreadSet.iterator()>
    //    4    6:astore_3        
    // try 7 15 handler(s) 39
    //    5    7:aload_3         
    //    6    8:invokeinterface #65  <Method boolean Iterator.hasNext()>
    //    7   13:istore          4
    //    8   15:iload           4
    //    9   17:ifne            23
    //   10   20:aload_0         
    //   11   21:monitorexit     
    //   12   22:return          
    // try 23 36 handler(s) 39
    //   13   23:aload_0         
    //   14   24:aload_3         
    //   15   25:invokeinterface #69  <Method Object Iterator.next()>
    //   16   30:checkcast       #71  <Class Thread>
    //   17   33:invokevirtual   #74  <Method void allowThreadDecoding(Thread)>
    //   18   36:goto            7
    // finally
    //   19   39:astore_2        
    //   20   40:aload_0         
    //   21   41:monitorexit     
    //   22   42:aload_2         
    //   23   43:athrow          
    }

    public void allowThreadDecoding(Thread thread)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 13 handler(s) 16
    //    2    2:aload_0         
    //    3    3:aload_1         
    //    4    4:invokespecial   #47  <Method BitmapManager$ThreadStatus getOrCreateThreadStatus(Thread)>
    //    5    7:getstatic       #80  <Field BitmapManager$State BitmapManager$State.ALLOW>
    //    6   10:putfield        #83  <Field BitmapManager$State BitmapManager$ThreadStatus.mState>
    //    7   13:aload_0         
    //    8   14:monitorexit     
    //    9   15:return          
    // finally
    //   10   16:astore_2        
    //   11   17:aload_0         
    //   12   18:monitorexit     
    //   13   19:aload_2         
    //   14   20:athrow          
    }

    public boolean canThreadDecoding(Thread thread)
    {
    //    0    0:iconst_1        
    //    1    1:istore_2        
    //    2    2:aload_0         
    //    3    3:monitorenter    
    // try 4 17 handler(s) 50
    //    4    4:aload_0         
    //    5    5:getfield        #25  <Field WeakHashMap mThreadStatus>
    //    6    8:aload_1         
    //    7    9:invokevirtual   #31  <Method Object WeakHashMap.get(Object)>
    //    8   12:checkcast       #33  <Class BitmapManager$ThreadStatus>
    //    9   15:astore          4
    //   10   17:aload           4
    //   11   19:ifnonnull       26
    //   12   22:aload_0         
    //   13   23:monitorexit     
    //   14   24:iload_2         
    //   15   25:ireturn         
    // try 26 38 handler(s) 50
    //   16   26:aload           4
    //   17   28:getfield        #83  <Field BitmapManager$State BitmapManager$ThreadStatus.mState>
    //   18   31:astore          5
    //   19   33:getstatic       #88  <Field BitmapManager$State BitmapManager$State.CANCEL>
    //   20   36:astore          6
    //   21   38:aload           5
    //   22   40:aload           6
    //   23   42:if_acmpne       22
    //   24   45:iconst_0        
    //   25   46:istore_2        
    //   26   47:goto            22
    // finally
    //   27   50:astore_3        
    //   28   51:aload_0         
    //   29   52:monitorexit     
    //   30   53:aload_3         
    //   31   54:athrow          
    }

    public void cancelThreadDecoding(ThreadSet threadset)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 7 handler(s) 39
    //    2    2:aload_1         
    //    3    3:invokevirtual   #59  <Method Iterator BitmapManager$ThreadSet.iterator()>
    //    4    6:astore_3        
    // try 7 15 handler(s) 39
    //    5    7:aload_3         
    //    6    8:invokeinterface #65  <Method boolean Iterator.hasNext()>
    //    7   13:istore          4
    //    8   15:iload           4
    //    9   17:ifne            23
    //   10   20:aload_0         
    //   11   21:monitorexit     
    //   12   22:return          
    // try 23 36 handler(s) 39
    //   13   23:aload_0         
    //   14   24:aload_3         
    //   15   25:invokeinterface #69  <Method Object Iterator.next()>
    //   16   30:checkcast       #71  <Class Thread>
    //   17   33:invokevirtual   #91  <Method void cancelThreadDecoding(Thread)>
    //   18   36:goto            7
    // finally
    //   19   39:astore_2        
    //   20   40:aload_0         
    //   21   41:monitorexit     
    //   22   42:aload_2         
    //   23   43:athrow          
    }

    public void cancelThreadDecoding(Thread thread)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 29 handler(s) 36
    //    2    2:aload_0         
    //    3    3:aload_1         
    //    4    4:invokespecial   #47  <Method BitmapManager$ThreadStatus getOrCreateThreadStatus(Thread)>
    //    5    7:astore_3        
    //    6    8:aload_3         
    //    7    9:getstatic       #88  <Field BitmapManager$State BitmapManager$State.CANCEL>
    //    8   12:putfield        #83  <Field BitmapManager$State BitmapManager$ThreadStatus.mState>
    //    9   15:aload_3         
    //   10   16:getfield        #51  <Field android.graphics.BitmapFactory$Options BitmapManager$ThreadStatus.mOptions>
    //   11   19:ifnull          29
    //   12   22:aload_3         
    //   13   23:getfield        #51  <Field android.graphics.BitmapFactory$Options BitmapManager$ThreadStatus.mOptions>
    //   14   26:invokevirtual   #96  <Method void android.graphics.BitmapFactory$Options.requestCancelDecode()>
    // try 29 33 handler(s) 36
    //   15   29:aload_0         
    //   16   30:invokevirtual   #99  <Method void Object.notifyAll()>
    //   17   33:aload_0         
    //   18   34:monitorexit     
    //   19   35:return          
    // finally
    //   20   36:astore_2        
    //   21   37:aload_0         
    //   22   38:monitorexit     
    //   23   39:aload_2         
    //   24   40:athrow          
    }

    public Bitmap decodeFileDescriptor(FileDescriptor filedescriptor, android.graphics.BitmapFactory.Options options)
    {
    //    0    0:aload_2         
    //    1    1:getfield        #105 <Field boolean android.graphics.BitmapFactory$Options.mCancel>
    //    2    4:ifeq            9
    //    3    7:aconst_null     
    //    4    8:areturn         
    //    5    9:invokestatic    #109 <Method Thread Thread.currentThread()>
    //    6   12:astore_3        
    //    7   13:aload_0         
    //    8   14:aload_3         
    //    9   15:invokevirtual   #111 <Method boolean canThreadDecoding(Thread)>
    //   10   18:ifeq            7
    //   11   21:aload_0         
    //   12   22:aload_3         
    //   13   23:aload_2         
    //   14   24:invokespecial   #113 <Method void setDecodingOptions(Thread, android.graphics.BitmapFactory$Options)>
    //   15   27:aload_1         
    //   16   28:aconst_null     
    //   17   29:aload_2         
    //   18   30:invokestatic    #118 <Method Bitmap BitmapFactory.decodeFileDescriptor(FileDescriptor, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
    //   19   33:astore          4
    //   20   35:aload_0         
    //   21   36:aload_3         
    //   22   37:invokevirtual   #121 <Method void removeDecodingOptions(Thread)>
    //   23   40:aload           4
    //   24   42:areturn         
    }

    public void dump()
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 15 handler(s) 107
    //    2    2:aload_0         
    //    3    3:getfield        #25  <Field WeakHashMap mThreadStatus>
    //    4    6:invokevirtual   #126 <Method Set WeakHashMap.entrySet()>
    //    5    9:invokeinterface #129 <Method Iterator Set.iterator()>
    //    6   14:astore_2        
    // try 15 22 handler(s) 107
    //    7   15:aload_2         
    //    8   16:invokeinterface #65  <Method boolean Iterator.hasNext()>
    //    9   21:istore_3        
    //   10   22:iload_3         
    //   11   23:ifne            29
    //   12   26:aload_0         
    //   13   27:monitorexit     
    //   14   28:return          
    // try 29 104 handler(s) 107
    //   15   29:aload_2         
    //   16   30:invokeinterface #69  <Method Object Iterator.next()>
    //   17   35:checkcast       #131 <Class java.util.Map$Entry>
    //   18   38:astore          4
    //   19   40:ldc1            #8   <String "BitmapManager">
    //   20   42:new             #133 <Class StringBuilder>
    //   21   45:dup             
    //   22   46:ldc1            #135 <String "[Dump] Thread ">
    //   23   48:invokespecial   #138 <Method void StringBuilder(String)>
    //   24   51:aload           4
    //   25   53:invokeinterface #141 <Method Object java.util.Map$Entry.getKey()>
    //   26   58:invokevirtual   #145 <Method StringBuilder StringBuilder.append(Object)>
    //   27   61:ldc1            #147 <String " (">
    //   28   63:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
    //   29   66:aload           4
    //   30   68:invokeinterface #141 <Method Object java.util.Map$Entry.getKey()>
    //   31   73:checkcast       #71  <Class Thread>
    //   32   76:invokevirtual   #154 <Method long Thread.getId()>
    //   33   79:invokevirtual   #157 <Method StringBuilder StringBuilder.append(long)>
    //   34   82:ldc1            #159 <String ")'s status is ">
    //   35   84:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
    //   36   87:aload           4
    //   37   89:invokeinterface #162 <Method Object java.util.Map$Entry.getValue()>
    //   38   94:invokevirtual   #145 <Method StringBuilder StringBuilder.append(Object)>
    //   39   97:invokevirtual   #166 <Method String StringBuilder.toString()>
    //   40  100:invokestatic    #172 <Method int Log.v(String, String)>
    //   41  103:pop             
    //   42  104:goto            15
    // finally
    //   43  107:astore_1        
    //   44  108:aload_0         
    //   45  109:monitorexit     
    //   46  110:aload_1         
    //   47  111:athrow          
    }

    android.graphics.BitmapFactory.Options getDecodingOptions(Thread thread)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 14 handler(s) 35
    //    2    2:aload_0         
    //    3    3:getfield        #25  <Field WeakHashMap mThreadStatus>
    //    4    6:aload_1         
    //    5    7:invokevirtual   #31  <Method Object WeakHashMap.get(Object)>
    //    6   10:checkcast       #33  <Class BitmapManager$ThreadStatus>
    //    7   13:astore_3        
    //    8   14:aload_3         
    //    9   15:ifnull          29
    // try 18 24 handler(s) 35
    //   10   18:aload_3         
    //   11   19:getfield        #51  <Field android.graphics.BitmapFactory$Options BitmapManager$ThreadStatus.mOptions>
    //   12   22:astore          4
    //   13   24:aload_0         
    //   14   25:monitorexit     
    //   15   26:aload           4
    //   16   28:areturn         
    //   17   29:aconst_null     
    //   18   30:astore          4
    //   19   32:goto            24
    // finally
    //   20   35:astore_2        
    //   21   36:aload_0         
    //   22   37:monitorexit     
    //   23   38:aload_2         
    //   24   39:athrow          
    }

    void removeDecodingOptions(Thread thread)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 17 handler(s) 20
    //    2    2:aload_0         
    //    3    3:getfield        #25  <Field WeakHashMap mThreadStatus>
    //    4    6:aload_1         
    //    5    7:invokevirtual   #31  <Method Object WeakHashMap.get(Object)>
    //    6   10:checkcast       #33  <Class BitmapManager$ThreadStatus>
    //    7   13:aconst_null     
    //    8   14:putfield        #51  <Field android.graphics.BitmapFactory$Options BitmapManager$ThreadStatus.mOptions>
    //    9   17:aload_0         
    //   10   18:monitorexit     
    //   11   19:return          
    // finally
    //   12   20:astore_2        
    //   13   21:aload_0         
    //   14   22:monitorexit     
    //   15   23:aload_2         
    //   16   24:athrow          
    }

    private static final String TAG = "BitmapManager";
    private static BitmapManager sManager;
    private final WeakHashMap mThreadStatus;
}
