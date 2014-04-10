// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.support.v4.util.DebugUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class Loader
{
    public final class ForceLoadContentObserver extends ContentObserver
    {

        public ForceLoadContentObserver()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #10  <Field Loader this$0>
        //    3    5:aload_0         
        //    4    6:new             #12  <Class Handler>
        //    5    9:dup             
        //    6   10:invokespecial   #15  <Method void Handler()>
        //    7   13:invokespecial   #18  <Method void ContentObserver(Handler)>
        //    8   16:return          
        }

        public boolean deliverSelfNotifications()
        {
        //    0    0:iconst_1        
        //    1    1:ireturn         
        }

        public void onChange(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #10  <Field Loader this$0>
        //    2    4:invokevirtual   #27  <Method void Loader.onContentChanged()>
        //    3    7:return          
        }

        final Loader this$0;
    }

    public static interface OnLoadCompleteListener
    {

        public abstract void onLoadComplete(Loader loader, Object obj);
    }


    public Loader(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #23  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #25  <Field boolean mStarted>
    //    5    9:aload_0         
    //    6   10:iconst_0        
    //    7   11:putfield        #27  <Field boolean mAbandoned>
    //    8   14:aload_0         
    //    9   15:iconst_1        
    //   10   16:putfield        #29  <Field boolean mReset>
    //   11   19:aload_0         
    //   12   20:iconst_0        
    //   13   21:putfield        #31  <Field boolean mContentChanged>
    //   14   24:aload_0         
    //   15   25:iconst_0        
    //   16   26:putfield        #33  <Field boolean mProcessingChange>
    //   17   29:aload_0         
    //   18   30:aload_1         
    //   19   31:invokevirtual   #39  <Method Context Context.getApplicationContext()>
    //   20   34:putfield        #41  <Field Context mContext>
    //   21   37:return          
    }

    public void abandon()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #27  <Field boolean mAbandoned>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #45  <Method void onAbandon()>
    //    5    9:return          
    }

    public void commitContentChanged()
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #33  <Field boolean mProcessingChange>
    //    3    5:return          
    }

    public String dataToString(Object obj)
    {
    //    0    0:new             #50  <Class StringBuilder>
    //    1    3:dup             
    //    2    4:bipush          64
    //    3    6:invokespecial   #53  <Method void StringBuilder(int)>
    //    4    9:astore_2        
    //    5   10:aload_1         
    //    6   11:aload_2         
    //    7   12:invokestatic    #59  <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
    //    8   15:aload_2         
    //    9   16:ldc1            #61  <String "}">
    //   10   18:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
    //   11   21:pop             
    //   12   22:aload_2         
    //   13   23:invokevirtual   #69  <Method String StringBuilder.toString()>
    //   14   26:areturn         
    }

    public void deliverResult(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #73  <Field Loader$OnLoadCompleteListener mListener>
    //    2    4:ifnull          18
    //    3    7:aload_0         
    //    4    8:getfield        #73  <Field Loader$OnLoadCompleteListener mListener>
    //    5   11:aload_0         
    //    6   12:aload_1         
    //    7   13:invokeinterface #79  <Method void Loader$OnLoadCompleteListener.onLoadComplete(Loader, Object)>
    //    8   18:return          
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
    //    0    0:aload_3         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #87  <Method void PrintWriter.print(String)>
    //    3    5:aload_3         
    //    4    6:ldc1            #89  <String "mId=">
    //    5    8:invokevirtual   #87  <Method void PrintWriter.print(String)>
    //    6   11:aload_3         
    //    7   12:aload_0         
    //    8   13:getfield        #91  <Field int mId>
    //    9   16:invokevirtual   #93  <Method void PrintWriter.print(int)>
    //   10   19:aload_3         
    //   11   20:ldc1            #95  <String " mListener=">
    //   12   22:invokevirtual   #87  <Method void PrintWriter.print(String)>
    //   13   25:aload_3         
    //   14   26:aload_0         
    //   15   27:getfield        #73  <Field Loader$OnLoadCompleteListener mListener>
    //   16   30:invokevirtual   #98  <Method void PrintWriter.println(Object)>
    //   17   33:aload_0         
    //   18   34:getfield        #25  <Field boolean mStarted>
    //   19   37:ifne            54
    //   20   40:aload_0         
    //   21   41:getfield        #31  <Field boolean mContentChanged>
    //   22   44:ifne            54
    //   23   47:aload_0         
    //   24   48:getfield        #33  <Field boolean mProcessingChange>
    //   25   51:ifeq            101
    //   26   54:aload_3         
    //   27   55:aload_1         
    //   28   56:invokevirtual   #87  <Method void PrintWriter.print(String)>
    //   29   59:aload_3         
    //   30   60:ldc1            #100 <String "mStarted=">
    //   31   62:invokevirtual   #87  <Method void PrintWriter.print(String)>
    //   32   65:aload_3         
    //   33   66:aload_0         
    //   34   67:getfield        #25  <Field boolean mStarted>
    //   35   70:invokevirtual   #103 <Method void PrintWriter.print(boolean)>
    //   36   73:aload_3         
    //   37   74:ldc1            #105 <String " mContentChanged=">
    //   38   76:invokevirtual   #87  <Method void PrintWriter.print(String)>
    //   39   79:aload_3         
    //   40   80:aload_0         
    //   41   81:getfield        #31  <Field boolean mContentChanged>
    //   42   84:invokevirtual   #103 <Method void PrintWriter.print(boolean)>
    //   43   87:aload_3         
    //   44   88:ldc1            #107 <String " mProcessingChange=">
    //   45   90:invokevirtual   #87  <Method void PrintWriter.print(String)>
    //   46   93:aload_3         
    //   47   94:aload_0         
    //   48   95:getfield        #33  <Field boolean mProcessingChange>
    //   49   98:invokevirtual   #109 <Method void PrintWriter.println(boolean)>
    //   50  101:aload_0         
    //   51  102:getfield        #27  <Field boolean mAbandoned>
    //   52  105:ifne            115
    //   53  108:aload_0         
    //   54  109:getfield        #29  <Field boolean mReset>
    //   55  112:ifeq            148
    //   56  115:aload_3         
    //   57  116:aload_1         
    //   58  117:invokevirtual   #87  <Method void PrintWriter.print(String)>
    //   59  120:aload_3         
    //   60  121:ldc1            #111 <String "mAbandoned=">
    //   61  123:invokevirtual   #87  <Method void PrintWriter.print(String)>
    //   62  126:aload_3         
    //   63  127:aload_0         
    //   64  128:getfield        #27  <Field boolean mAbandoned>
    //   65  131:invokevirtual   #103 <Method void PrintWriter.print(boolean)>
    //   66  134:aload_3         
    //   67  135:ldc1            #113 <String " mReset=">
    //   68  137:invokevirtual   #87  <Method void PrintWriter.print(String)>
    //   69  140:aload_3         
    //   70  141:aload_0         
    //   71  142:getfield        #29  <Field boolean mReset>
    //   72  145:invokevirtual   #109 <Method void PrintWriter.println(boolean)>
    //   73  148:return          
    }

    public void forceLoad()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #117 <Method void onForceLoad()>
    //    2    4:return          
    }

    public Context getContext()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #41  <Field Context mContext>
    //    2    4:areturn         
    }

    public int getId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field int mId>
    //    2    4:ireturn         
    }

    public boolean isAbandoned()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #27  <Field boolean mAbandoned>
    //    2    4:ireturn         
    }

    public boolean isReset()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #29  <Field boolean mReset>
    //    2    4:ireturn         
    }

    public boolean isStarted()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #25  <Field boolean mStarted>
    //    2    4:ireturn         
    }

    protected void onAbandon()
    {
    //    0    0:return          
    }

    public void onContentChanged()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #25  <Field boolean mStarted>
    //    2    4:ifeq            12
    //    3    7:aload_0         
    //    4    8:invokevirtual   #127 <Method void forceLoad()>
    //    5   11:return          
    //    6   12:aload_0         
    //    7   13:iconst_1        
    //    8   14:putfield        #31  <Field boolean mContentChanged>
    //    9   17:return          
    }

    protected void onForceLoad()
    {
    //    0    0:return          
    }

    protected void onReset()
    {
    //    0    0:return          
    }

    protected void onStartLoading()
    {
    //    0    0:return          
    }

    protected void onStopLoading()
    {
    //    0    0:return          
    }

    public void registerListener(int i, OnLoadCompleteListener onloadcompletelistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #73  <Field Loader$OnLoadCompleteListener mListener>
    //    2    4:ifnull          17
    //    3    7:new             #134 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc1            #136 <String "There is already a listener registered">
    //    6   13:invokespecial   #138 <Method void IllegalStateException(String)>
    //    7   16:athrow          
    //    8   17:aload_0         
    //    9   18:aload_2         
    //   10   19:putfield        #73  <Field Loader$OnLoadCompleteListener mListener>
    //   11   22:aload_0         
    //   12   23:iload_1         
    //   13   24:putfield        #91  <Field int mId>
    //   14   27:return          
    }

    public void reset()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #141 <Method void onReset()>
    //    2    4:aload_0         
    //    3    5:iconst_1        
    //    4    6:putfield        #29  <Field boolean mReset>
    //    5    9:aload_0         
    //    6   10:iconst_0        
    //    7   11:putfield        #25  <Field boolean mStarted>
    //    8   14:aload_0         
    //    9   15:iconst_0        
    //   10   16:putfield        #27  <Field boolean mAbandoned>
    //   11   19:aload_0         
    //   12   20:iconst_0        
    //   13   21:putfield        #31  <Field boolean mContentChanged>
    //   14   24:aload_0         
    //   15   25:iconst_0        
    //   16   26:putfield        #33  <Field boolean mProcessingChange>
    //   17   29:return          
    }

    public void rollbackContentChanged()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #33  <Field boolean mProcessingChange>
    //    2    4:ifeq            12
    //    3    7:aload_0         
    //    4    8:iconst_1        
    //    5    9:putfield        #31  <Field boolean mContentChanged>
    //    6   12:return          
    }

    public final void startLoading()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #25  <Field boolean mStarted>
    //    3    5:aload_0         
    //    4    6:iconst_0        
    //    5    7:putfield        #29  <Field boolean mReset>
    //    6   10:aload_0         
    //    7   11:iconst_0        
    //    8   12:putfield        #27  <Field boolean mAbandoned>
    //    9   15:aload_0         
    //   10   16:invokevirtual   #145 <Method void onStartLoading()>
    //   11   19:return          
    }

    public void stopLoading()
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #25  <Field boolean mStarted>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #148 <Method void onStopLoading()>
    //    5    9:return          
    }

    public boolean takeContentChanged()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #31  <Field boolean mContentChanged>
    //    2    4:istore_1        
    //    3    5:aload_0         
    //    4    6:iconst_0        
    //    5    7:putfield        #31  <Field boolean mContentChanged>
    //    6   10:aload_0         
    //    7   11:iload_1         
    //    8   12:aload_0         
    //    9   13:getfield        #33  <Field boolean mProcessingChange>
    //   10   16:ior             
    //   11   17:putfield        #33  <Field boolean mProcessingChange>
    //   12   20:iload_1         
    //   13   21:ireturn         
    }

    public String toString()
    {
    //    0    0:new             #50  <Class StringBuilder>
    //    1    3:dup             
    //    2    4:bipush          64
    //    3    6:invokespecial   #53  <Method void StringBuilder(int)>
    //    4    9:astore_1        
    //    5   10:aload_0         
    //    6   11:aload_1         
    //    7   12:invokestatic    #59  <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
    //    8   15:aload_1         
    //    9   16:ldc1            #151 <String " id=">
    //   10   18:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
    //   11   21:pop             
    //   12   22:aload_1         
    //   13   23:aload_0         
    //   14   24:getfield        #91  <Field int mId>
    //   15   27:invokevirtual   #154 <Method StringBuilder StringBuilder.append(int)>
    //   16   30:pop             
    //   17   31:aload_1         
    //   18   32:ldc1            #61  <String "}">
    //   19   34:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
    //   20   37:pop             
    //   21   38:aload_1         
    //   22   39:invokevirtual   #69  <Method String StringBuilder.toString()>
    //   23   42:areturn         
    }

    public void unregisterListener(OnLoadCompleteListener onloadcompletelistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #73  <Field Loader$OnLoadCompleteListener mListener>
    //    2    4:ifnonnull       17
    //    3    7:new             #134 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc1            #158 <String "No listener register">
    //    6   13:invokespecial   #138 <Method void IllegalStateException(String)>
    //    7   16:athrow          
    //    8   17:aload_0         
    //    9   18:getfield        #73  <Field Loader$OnLoadCompleteListener mListener>
    //   10   21:aload_1         
    //   11   22:if_acmpeq       35
    //   12   25:new             #160 <Class IllegalArgumentException>
    //   13   28:dup             
    //   14   29:ldc1            #162 <String "Attempting to unregister the wrong listener">
    //   15   31:invokespecial   #163 <Method void IllegalArgumentException(String)>
    //   16   34:athrow          
    //   17   35:aload_0         
    //   18   36:aconst_null     
    //   19   37:putfield        #73  <Field Loader$OnLoadCompleteListener mListener>
    //   20   40:return          
    }

    boolean mAbandoned;
    boolean mContentChanged;
    Context mContext;
    int mId;
    OnLoadCompleteListener mListener;
    boolean mProcessingChange;
    boolean mReset;
    boolean mStarted;
}
